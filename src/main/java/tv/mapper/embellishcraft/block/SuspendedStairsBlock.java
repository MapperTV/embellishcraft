package tv.mapper.embellishcraft.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.IWaterLoggable;
import net.minecraft.fluid.Fluids;
import net.minecraft.fluid.IFluidState;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraftforge.common.ToolType;

public class SuspendedStairsBlock extends CustomBlock implements IWaterLoggable
{
    public static final DirectionProperty FACING = DirectionProperty.create("facing", Direction.Plane.HORIZONTAL);
    public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;

    private static final VoxelShape STEP1_N = Block.makeCuboidShape(0.0D, 3.0D, 0.0D, 16.0D, 4.0D, 4.0D);
    private static final VoxelShape STEP2_N = Block.makeCuboidShape(0.0D, 7.0D, 4.0D, 16.0D, 8.0D, 8.0D);
    private static final VoxelShape STEP3_N = Block.makeCuboidShape(0.0D, 11.0D, 8.0D, 16.0D, 12.0D, 12.0D);
    private static final VoxelShape STEP4_N = Block.makeCuboidShape(0.0D, 15.0D, 12.0D, 16.0D, 16.0D, 16.0D);
    private static final VoxelShape SHAPE_N = VoxelShapes.or(STEP1_N, VoxelShapes.or(STEP2_N, VoxelShapes.or(STEP3_N, STEP4_N)));

    private static final VoxelShape STEP1_E = Block.makeCuboidShape(0.0D, 3.0D, 0.0D, 4.0D, 4.0D, 16.0D);
    private static final VoxelShape STEP2_E = Block.makeCuboidShape(4.0D, 7.0D, 0.0D, 8.0D, 8.0D, 16.0D);
    private static final VoxelShape STEP3_E = Block.makeCuboidShape(8.0D, 11.0D, 0.0D, 12.0D, 12.0D, 16.0D);
    private static final VoxelShape STEP4_E = Block.makeCuboidShape(12.0D, 15.0D, 0.0D, 16.0D, 16.0D, 16.0D);
    private static final VoxelShape SHAPE_E = VoxelShapes.or(STEP1_E, VoxelShapes.or(STEP2_E, VoxelShapes.or(STEP3_E, STEP4_E)));

    private static final VoxelShape STEP1_S = Block.makeCuboidShape(0.0D, 15.0D, 0.0D, 16.0D, 16.0D, 4.0D);
    private static final VoxelShape STEP2_S = Block.makeCuboidShape(0.0D, 11.0D, 4.0D, 16.0D, 12.0D, 8.0D);
    private static final VoxelShape STEP3_S = Block.makeCuboidShape(0.0D, 7.0D, 8.0D, 16.0D, 8.0D, 12.0D);
    private static final VoxelShape STEP4_S = Block.makeCuboidShape(0.0D, 3.0D, 12.0D, 16.0D, 4.0D, 16.0D);
    private static final VoxelShape SHAPE_S = VoxelShapes.or(STEP1_S, VoxelShapes.or(STEP2_S, VoxelShapes.or(STEP3_S, STEP4_S)));

    private static final VoxelShape STEP1_W = Block.makeCuboidShape(0.0D, 15.0D, 0.0D, 4.0D, 16.0D, 16.0D);
    private static final VoxelShape STEP2_W = Block.makeCuboidShape(4.0D, 11.0D, 0.0D, 8.0D, 12.0D, 16.0D);
    private static final VoxelShape STEP3_W = Block.makeCuboidShape(8.0D, 7.0D, 0.0D, 12.0D, 8.0D, 16.0D);
    private static final VoxelShape STEP4_W = Block.makeCuboidShape(12.0D, 3.0D, 0.0D, 16.0D, 4.0D, 16.0D);
    private static final VoxelShape SHAPE_W = VoxelShapes.or(STEP1_W, VoxelShapes.or(STEP2_W, VoxelShapes.or(STEP3_W, STEP4_W)));

    @Override
    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context)
    {
        switch((Direction)state.get(FACING))
        {
            case NORTH:
                return SHAPE_N;
            case SOUTH:
                return SHAPE_S;
            case WEST:
                return SHAPE_E;
            case EAST:
                return SHAPE_W;
            default:
                return SHAPE_N;
        }
    }

    @Override
    public boolean isSolid(BlockState state)
    {
        return false;
    }

    public SuspendedStairsBlock(Properties properties)
    {
        super(properties);
    }

    public SuspendedStairsBlock(Properties properties, ToolType toolType)
    {
        super(properties, toolType);
    }

    @SuppressWarnings("deprecation")
    public BlockState updatePostPlacement(BlockState stateIn, Direction facing, BlockState facingState, IWorld worldIn, BlockPos currentPos, BlockPos facingPos)
    {
        if(stateIn.get(WATERLOGGED))
        {
            worldIn.getPendingFluidTicks().scheduleTick(currentPos, Fluids.WATER, Fluids.WATER.getTickRate(worldIn));
        }
        return super.updatePostPlacement(stateIn, facing, facingState, worldIn, currentPos, facingPos);
    }

    @Override
    public BlockState getStateForPlacement(BlockItemUseContext context)
    {
        BlockPos blockpos = context.getPos();
        IFluidState ifluidstate = context.getWorld().getFluidState(blockpos);

        return this.getDefaultState().with(FACING, context.getPlacementHorizontalFacing().getOpposite()).with(WATERLOGGED, Boolean.valueOf(Boolean.valueOf(ifluidstate.getFluid() == Fluids.WATER)));
    }

    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder)
    {
        builder.add(FACING, WATERLOGGED);
    }

    @SuppressWarnings("deprecation")
    public IFluidState getFluidState(BlockState state)
    {
        return state.get(WATERLOGGED) ? Fluids.WATER.getStillFluidState(false) : super.getFluidState(state);
    }
}
