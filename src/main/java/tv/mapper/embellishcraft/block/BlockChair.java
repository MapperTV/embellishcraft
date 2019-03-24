package tv.mapper.embellishcraft.block;

import net.minecraft.block.Block;
import net.minecraft.block.IBucketPickupHandler;
import net.minecraft.block.ILiquidContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.IFluidState;
import net.minecraft.init.Fluids;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;

public class BlockChair extends Block implements IBucketPickupHandler, ILiquidContainer
{
    // Need to figure a way to rotate VoxelShapes because this is just stupid
    private static final VoxelShape SOUTH_LEFT_FRONT_LEG = Block.makeCuboidShape(11.0D, 0.0D, 11.0D, 13.0D, 7.0D, 13.0D);
    private static final VoxelShape SOUTH_RIGHT_FRONT_LEG = Block.makeCuboidShape(3.0D, 0.0D, 11.0D, 5.0D, 7.0D, 13.0D);
    private static final VoxelShape SOUTH_LEFT_BACK_LEG = Block.makeCuboidShape(11.0D, 0.0D, 2.0D, 13.0D, 16.0D, 4.0D);
    private static final VoxelShape SOUTH_RIGHT_BACK_LEG = Block.makeCuboidShape(3.0D, 0.0D, 2.0D, 5.0D, 16.0D, 4.0D);
    private static final VoxelShape SOUTH_SIT = Block.makeCuboidShape(3.0D, 7.0D, 4.0D, 13.0D, 8.0D, 13.0D);
    private static final VoxelShape SOUTH_BACK = Block.makeCuboidShape(5.0D, 12.0D, 3.0D, 11.0D, 14.0D, 4.0D);
    private static final VoxelShape SOUTH_CHAIR_AABB = VoxelShapes.or(SOUTH_LEFT_FRONT_LEG, VoxelShapes.or(SOUTH_RIGHT_FRONT_LEG, VoxelShapes.or(SOUTH_LEFT_BACK_LEG, VoxelShapes.or(SOUTH_SIT, VoxelShapes.or(SOUTH_BACK, SOUTH_RIGHT_BACK_LEG)))));

    private static final VoxelShape WEST_LEFT_FRONT_LEG = Block.makeCuboidShape(3.0D, 0.0D, 11.0D, 5.0D, 7.0D, 13.0D);
    private static final VoxelShape WEST_RIGHT_FRONT_LEG = Block.makeCuboidShape(3.0D, 0.0D, 3.0D, 5.0D, 7.0D, 5.0D);
    private static final VoxelShape WEST_LEFT_BACK_LEG = Block.makeCuboidShape(12.0D, 0.0D, 11.0D, 14.0D, 16.0D, 13.0D);
    private static final VoxelShape WEST_RIGHT_BACK_LEG = Block.makeCuboidShape(12.0D, 0.0D, 3.0D, 14.0D, 16.0D, 5.0D);
    private static final VoxelShape WEST_SIT = Block.makeCuboidShape(3.0D, 7.0D, 3.0D, 12.0D, 8.0D, 13.0D);
    private static final VoxelShape WEST_BACK = Block.makeCuboidShape(12.0D, 12.0D, 5.0D, 13.0D, 14.0D, 11.0D);
    private static final VoxelShape WEST_CHAIR_AABB = VoxelShapes.or(WEST_LEFT_FRONT_LEG, VoxelShapes.or(WEST_RIGHT_FRONT_LEG, VoxelShapes.or(WEST_LEFT_BACK_LEG, VoxelShapes.or(WEST_SIT, VoxelShapes.or(WEST_BACK, WEST_RIGHT_BACK_LEG)))));

    private static final VoxelShape NORTH_LEFT_FRONT_LEG = Block.makeCuboidShape(3.0D, 0.0D, 3.0D, 5.0D, 7.0D, 5.0D);
    private static final VoxelShape NORTH_RIGHT_FRONT_LEG = Block.makeCuboidShape(11.0D, 0.0D, 3.0D, 13.0D, 7.0D, 5.0D);
    private static final VoxelShape NORTH_LEFT_BACK_LEG = Block.makeCuboidShape(3.0D, 0.0D, 12.0D, 5.0D, 16.0D, 14.0D);
    private static final VoxelShape NORTH_RIGHT_BACK_LEG = Block.makeCuboidShape(11.0D, 0.0D, 12.0D, 13.0D, 16.0D, 14.0D);
    private static final VoxelShape NORTH_SIT = Block.makeCuboidShape(3.0D, 7.0D, 3.0D, 13.0D, 8.0D, 12.0D);
    private static final VoxelShape NORTH_BACK = Block.makeCuboidShape(5.0D, 12.0D, 12.0D, 11.0D, 14.0D, 13.0D);
    private static final VoxelShape NORTH_CHAIR_AABB = VoxelShapes.or(NORTH_LEFT_FRONT_LEG, VoxelShapes.or(NORTH_RIGHT_FRONT_LEG, VoxelShapes.or(NORTH_LEFT_BACK_LEG, VoxelShapes.or(NORTH_SIT, VoxelShapes.or(NORTH_BACK, NORTH_RIGHT_BACK_LEG)))));

    private static final VoxelShape EAST_LEFT_FRONT_LEG = Block.makeCuboidShape(11.0D, 0.0D, 3.0D, 13.0D, 7.0D, 5.0D);
    private static final VoxelShape EAST_RIGHT_FRONT_LEG = Block.makeCuboidShape(11.0D, 0.0D, 11.0D, 13.0D, 7.0D, 13.0D);
    private static final VoxelShape EAST_LEFT_BACK_LEG = Block.makeCuboidShape(2.0D, 0.0D, 3.0D, 4.0D, 16.0D, 5.0D);
    private static final VoxelShape EAST_RIGHT_BACK_LEG = Block.makeCuboidShape(2.0D, 0.0D, 11.0D, 4.0D, 16.0D, 13.0D);
    private static final VoxelShape EAST_SIT = Block.makeCuboidShape(4.0D, 7.0D, 3.0D, 13.0D, 8.0D, 13.0D);
    private static final VoxelShape EAST_BACK = Block.makeCuboidShape(3.0D, 12.0D, 5.0D, 4.0D, 14.0D, 11.0D);
    private static final VoxelShape EAST_CHAIR_AABB = VoxelShapes.or(EAST_LEFT_FRONT_LEG, VoxelShapes.or(EAST_RIGHT_FRONT_LEG, VoxelShapes.or(EAST_LEFT_BACK_LEG, VoxelShapes.or(EAST_SIT, VoxelShapes.or(EAST_BACK, EAST_RIGHT_BACK_LEG)))));

    public static final DirectionProperty FACING = DirectionProperty.create("facing", EnumFacing.Plane.HORIZONTAL);
    public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;

    public BlockChair(Properties properties)
    {
        super(properties);
        this.setDefaultState(this.stateContainer.getBaseState().with(FACING, EnumFacing.NORTH).with(WATERLOGGED, Boolean.valueOf(false)));
    }

    public VoxelShape getShape(IBlockState state, IBlockReader worldIn, BlockPos pos)
    {
        switch((EnumFacing)state.get(FACING))
        {
            case NORTH:
                return NORTH_CHAIR_AABB;
            case SOUTH:
                return SOUTH_CHAIR_AABB;
            case WEST:
                return WEST_CHAIR_AABB;
            case EAST:
                return EAST_CHAIR_AABB;
            default:
                return SOUTH_CHAIR_AABB;
        }
    }

    public VoxelShape getCollisionShape(IBlockState state, IBlockReader worldIn, BlockPos pos)
    {
        switch((EnumFacing)state.get(FACING))
        {
            case NORTH:
                return NORTH_CHAIR_AABB;
            case SOUTH:
                return SOUTH_CHAIR_AABB;
            case WEST:
                return WEST_CHAIR_AABB;
            case EAST:
                return EAST_CHAIR_AABB;
            default:
                return SOUTH_CHAIR_AABB;
        }
    }

    public boolean isSolid(IBlockState state)
    {
        return false;
    }

    @Override
    @Deprecated
    public boolean isFullCube(IBlockState state)
    {
        return false;
    }

    @SuppressWarnings("deprecation")
    public IBlockState updatePostPlacement(IBlockState stateIn, EnumFacing facing, IBlockState facingState, IWorld worldIn, BlockPos currentPos, BlockPos facingPos)
    {
        if(stateIn.get(WATERLOGGED))
        {
            worldIn.getPendingFluidTicks().scheduleTick(currentPos, Fluids.WATER, Fluids.WATER.getTickRate(worldIn));
        }

        return super.updatePostPlacement(stateIn, facing, facingState, worldIn, currentPos, facingPos);
    }

    @Override
    public boolean onBlockActivated(IBlockState state, World world, BlockPos pos, EntityPlayer player, EnumHand hand, EnumFacing side, float hitX, float hitY, float hitZ)
    {
        return true;
    }

    public IBlockState getStateForPlacement(BlockItemUseContext context)
    {
        return this.getDefaultState().with(FACING, context.getPlacementHorizontalFacing().getOpposite()).with(WATERLOGGED, Boolean.valueOf(false));
    }

    public IBlockState getStateFromMeta(int meta)
    {
        return this.getDefaultState().with(FACING, EnumFacing.byHorizontalIndex(meta));
    }

    public int getMetaFromState(IBlockState state)
    {
        return ((EnumFacing)state.get(FACING)).getHorizontalIndex();
    }

    protected void fillStateContainer(StateContainer.Builder<Block, IBlockState> builder)
    {
        builder.add(FACING, WATERLOGGED);
    }

    public Fluid pickupFluid(IWorld worldIn, BlockPos pos, IBlockState state)
    {
        if(state.get(WATERLOGGED))
        {
            worldIn.setBlockState(pos, state.with(WATERLOGGED, Boolean.valueOf(false)), 3);
            return Fluids.WATER;
        }
        else
        {
            return Fluids.EMPTY;
        }
    }

    @SuppressWarnings("deprecation")
    public IFluidState getFluidState(IBlockState state)
    {
        return state.get(WATERLOGGED) ? Fluids.WATER.getStillFluidState(false) : super.getFluidState(state);
    }

    public boolean canContainFluid(IBlockReader worldIn, BlockPos pos, IBlockState state, Fluid fluidIn)
    {
        return !state.get(WATERLOGGED) && fluidIn == Fluids.WATER;
    }

    public boolean receiveFluid(IWorld worldIn, BlockPos pos, IBlockState state, IFluidState fluidStateIn)
    {
        if(!state.get(WATERLOGGED) && fluidStateIn.getFluid() == Fluids.WATER)
        {
            if(!worldIn.isRemote())
            {
                worldIn.setBlockState(pos, state.with(WATERLOGGED, Boolean.valueOf(true)), 3);
                worldIn.getPendingFluidTicks().scheduleTick(pos, fluidStateIn.getFluid(), fluidStateIn.getFluid().getTickRate(worldIn));
            }

            return true;
        }
        else
        {
            return false;
        }
    }
}
