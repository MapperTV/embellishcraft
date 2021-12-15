package tv.mapper.embellishcraft.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SimpleWaterloggedBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import tv.mapper.mapperbase.world.level.block.CustomBlock;
import tv.mapper.mapperbase.world.level.block.ToolTiers;
import tv.mapper.mapperbase.world.level.block.ToolTypes;

public class TableBlock extends CustomBlock implements SimpleWaterloggedBlock
{
    public static final BooleanProperty TABLE_NORTH = BooleanProperty.create("table_north");
    public static final BooleanProperty TABLE_SOUTH = BooleanProperty.create("table_south");
    public static final BooleanProperty TABLE_EAST = BooleanProperty.create("table_east");
    public static final BooleanProperty TABLE_WEST = BooleanProperty.create("table_west");
    public static final BooleanProperty HAS_FOOT = BooleanProperty.create("has_foot");

    public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;

    protected static final VoxelShape plate = Block.box(0.0D, 14.0D, 0.0D, 16.0D, 16.0D, 16.0D);

    protected static final VoxelShape leg_north = Block.box(0.0D, 0.0D, 0.0D, 2.0D, 14.0D, 2.0D);
    protected static final VoxelShape leg_east = Block.box(14.0D, 0.0D, 0.0D, 16.0D, 14.0D, 2.0D);
    protected static final VoxelShape leg_west = Block.box(0.0D, 0.0D, 14.0D, 2.0D, 14.0D, 16.0D);
    protected static final VoxelShape leg_south = Block.box(14.0D, 0.0D, 14.0D, 16.0D, 14.0D, 16.0D);

    public TableBlock(Properties properties, ToolTypes tool)
    {
        super(properties, tool);
        this.registerDefaultState(this.stateDefinition.any().setValue(TABLE_NORTH, true).setValue(TABLE_SOUTH, true).setValue(TABLE_EAST, true).setValue(TABLE_WEST, true).setValue(HAS_FOOT, true).setValue(WATERLOGGED, Boolean.valueOf(false)));
    }

    public TableBlock(Properties properties, ToolTypes tool, ToolTiers tier)
    {
        super(properties, tool, tier);
        this.registerDefaultState(this.stateDefinition.any().setValue(TABLE_NORTH, true).setValue(TABLE_SOUTH, true).setValue(TABLE_EAST, true).setValue(TABLE_WEST, true).setValue(HAS_FOOT, true).setValue(WATERLOGGED, Boolean.valueOf(false)));
    }

    public boolean canSurvive(BlockState state, LevelReader worldIn, BlockPos pos)
    {
        return canSupportCenter(worldIn, pos.below(), Direction.UP);
    }

    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder)
    {
        builder.add(TABLE_NORTH, TABLE_SOUTH, TABLE_EAST, TABLE_WEST, HAS_FOOT, WATERLOGGED);
    }

    public VoxelShape getShape(BlockState state, BlockGetter worldIn, BlockPos pos, CollisionContext context)
    {
        VoxelShape shape = plate;

        if(state.getValue(TABLE_NORTH))
            shape = Shapes.or(shape, leg_north);

        if(state.getValue(TABLE_SOUTH))
            shape = Shapes.or(shape, leg_south);

        if(state.getValue(TABLE_EAST))
            shape = Shapes.or(shape, leg_east);

        if(state.getValue(TABLE_WEST))
            shape = Shapes.or(shape, leg_west);

        return shape;
    }

    public BlockState getStateForPlacement(BlockPlaceContext context)
    {
        BlockGetter iblockreader = context.getLevel();
        BlockPos blockpos = context.getClickedPos();
        FluidState ifluidstate = context.getLevel().getFluidState(context.getClickedPos());
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

        return super.getStateForPlacement(context).setValue(TABLE_NORTH, north).setValue(TABLE_SOUTH, south).setValue(TABLE_EAST, east).setValue(TABLE_WEST, west).setValue(HAS_FOOT, has_foot).setValue(WATERLOGGED, Boolean.valueOf(ifluidstate.getType() == Fluids.WATER));
    }

    public BlockState updateShape(BlockState stateIn, Direction facing, BlockState facingState, LevelAccessor worldIn, BlockPos currentPos, BlockPos facingPos)
    {
        if(facing == Direction.DOWN && !this.canSurvive(stateIn, worldIn, currentPos))
            return Blocks.AIR.defaultBlockState();

        BlockGetter iblockreader = worldIn;

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

        if(stateIn.getValue(WATERLOGGED))
        {
            worldIn.getLiquidTicks().scheduleTick(currentPos, Fluids.WATER, Fluids.WATER.getTickDelay(worldIn));
        }

        return this.defaultBlockState().setValue(TABLE_NORTH, north).setValue(TABLE_SOUTH, south).setValue(TABLE_EAST, east).setValue(TABLE_WEST, west).setValue(HAS_FOOT, has_foot).setValue(WATERLOGGED, stateIn.getValue(WATERLOGGED));
    }

    @SuppressWarnings("deprecation")
    public FluidState getFluidState(BlockState state)
    {
        return state.getValue(WATERLOGGED) ? Fluids.WATER.getSource(false) : super.getFluidState(state);
    }
}