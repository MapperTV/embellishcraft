package tv.mapper.embellishcraft.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.IWaterLoggable;
import net.minecraft.fluid.Fluids;
import net.minecraft.fluid.IFluidState;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.IWorldReader;
import net.minecraftforge.common.ToolType;
import tv.mapper.mapperbase.block.CustomBlock;

public class TableBlock extends CustomBlock implements IWaterLoggable
{
    public static final BooleanProperty TABLE_NORTH = BooleanProperty.create("table_north");
    public static final BooleanProperty TABLE_SOUTH = BooleanProperty.create("table_south");
    public static final BooleanProperty TABLE_EAST = BooleanProperty.create("table_east");
    public static final BooleanProperty TABLE_WEST = BooleanProperty.create("table_west");
    public static final BooleanProperty HAS_FOOT = BooleanProperty.create("has_foot");

    public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;

    protected static final VoxelShape plate = Block.makeCuboidShape(0.0D, 14.0D, 0.0D, 16.0D, 16.0D, 16.0D);

    protected static final VoxelShape leg_north = Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 2.0D, 14.0D, 2.0D);
    protected static final VoxelShape leg_east = Block.makeCuboidShape(14.0D, 0.0D, 0.0D, 16.0D, 14.0D, 2.0D);
    protected static final VoxelShape leg_west = Block.makeCuboidShape(0.0D, 0.0D, 14.0D, 2.0D, 14.0D, 16.0D);
    protected static final VoxelShape leg_south = Block.makeCuboidShape(14.0D, 0.0D, 14.0D, 16.0D, 14.0D, 16.0D);

    public TableBlock(Properties properties)
    {
        super(properties);
        this.setDefaultState(
            this.stateContainer.getBaseState().with(TABLE_NORTH, true).with(TABLE_SOUTH, true).with(TABLE_EAST, true).with(TABLE_WEST, true).with(HAS_FOOT, true).with(WATERLOGGED, Boolean.valueOf(false)));
    }

    public TableBlock(Properties properties, ToolType toolType)
    {
        super(properties, toolType);
        this.setDefaultState(
            this.stateContainer.getBaseState().with(TABLE_NORTH, true).with(TABLE_SOUTH, true).with(TABLE_EAST, true).with(TABLE_WEST, true).with(HAS_FOOT, true).with(WATERLOGGED, Boolean.valueOf(false)));
    }

    public boolean isValidPosition(BlockState state, IWorldReader worldIn, BlockPos pos)
    {
        return hasEnoughSolidSide(worldIn, pos.down(), Direction.UP);
    }

    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder)
    {
        builder.add(TABLE_NORTH, TABLE_SOUTH, TABLE_EAST, TABLE_WEST, HAS_FOOT, WATERLOGGED);
    }

    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context)
    {
        VoxelShape shape = plate;

        if(state.get(TABLE_NORTH))
            shape = VoxelShapes.or(shape, leg_north);

        if(state.get(TABLE_SOUTH))
            shape = VoxelShapes.or(shape, leg_south);

        if(state.get(TABLE_EAST))
            shape = VoxelShapes.or(shape, leg_east);

        if(state.get(TABLE_WEST))
            shape = VoxelShapes.or(shape, leg_west);

        return shape;
    }

    public BlockState getStateForPlacement(BlockItemUseContext context)
    {
        IBlockReader iblockreader = context.getWorld();
        BlockPos blockpos = context.getPos();
        IFluidState ifluidstate = context.getWorld().getFluidState(context.getPos());
        BlockPos blockpos1 = blockpos.north();
        BlockPos blockpos2 = blockpos.east();
        BlockPos blockpos3 = blockpos.south();
        BlockPos blockpos4 = blockpos.west();
        BlockState state_north = iblockreader.getBlockState(blockpos1);
        BlockState state_east = iblockreader.getBlockState(blockpos2);
        BlockState state_south = iblockreader.getBlockState(blockpos3);
        BlockState state_west = iblockreader.getBlockState(blockpos4);
        boolean north = true;
        boolean south = true;
        boolean east = true;
        boolean west = true;
        boolean has_foot = false;

        if(state_west.getBlock() == this)
        {
            west = false;
            north = false;
        }
        if(state_north.getBlock() == this)
        {
            north = false;
            east = false;
        }
        if(state_east.getBlock() == this)
        {
            east = false;
            south = false;
        }
        if(state_south.getBlock() == this)
        {
            south = false;
            west = false;
        }

        if(north || south || east || west)
            has_foot = true;

        return super.getStateForPlacement(context).with(TABLE_NORTH, north).with(TABLE_SOUTH, south).with(TABLE_EAST, east).with(TABLE_WEST, west).with(HAS_FOOT, has_foot).with(WATERLOGGED,
            Boolean.valueOf(ifluidstate.getFluid() == Fluids.WATER));
    }

    public BlockState updatePostPlacement(BlockState stateIn, Direction facing, BlockState facingState, IWorld worldIn, BlockPos currentPos, BlockPos facingPos)
    {
        if(facing == Direction.DOWN && !this.isValidPosition(stateIn, worldIn, currentPos))
            return Blocks.AIR.getDefaultState();

        IBlockReader iblockreader = worldIn;

        BlockPos blockpos1 = currentPos.north();
        BlockPos blockpos2 = currentPos.east();
        BlockPos blockpos3 = currentPos.south();
        BlockPos blockpos4 = currentPos.west();

        BlockState state_north = iblockreader.getBlockState(blockpos1);
        BlockState state_east = iblockreader.getBlockState(blockpos2);
        BlockState state_south = iblockreader.getBlockState(blockpos3);
        BlockState state_west = iblockreader.getBlockState(blockpos4);
        boolean north = true;
        boolean south = true;
        boolean east = true;
        boolean west = true;
        boolean has_foot = false;

        if(state_west.getBlock() == this)
        {
            west = false;
            north = false;
        }
        if(state_north.getBlock() == this)
        {
            north = false;
            east = false;
        }
        if(state_east.getBlock() == this)
        {
            east = false;
            south = false;
        }
        if(state_south.getBlock() == this)
        {
            south = false;
            west = false;
        }

        if(north || south || east || west)
            has_foot = true;

        if(stateIn.get(WATERLOGGED))
        {
            worldIn.getPendingFluidTicks().scheduleTick(currentPos, Fluids.WATER, Fluids.WATER.getTickRate(worldIn));
        }

        return this.getDefaultState().with(TABLE_NORTH, north).with(TABLE_SOUTH, south).with(TABLE_EAST, east).with(TABLE_WEST, west).with(HAS_FOOT, has_foot).with(WATERLOGGED, stateIn.get(WATERLOGGED));
    }

    @SuppressWarnings("deprecation")
    public IFluidState getFluidState(BlockState state)
    {
        return state.get(WATERLOGGED) ? Fluids.WATER.getStillFluidState(false) : super.getFluidState(state);
    }
}