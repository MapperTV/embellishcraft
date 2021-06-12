package tv.mapper.embellishcraft.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.IWaterLoggable;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
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
import tv.mapper.mapperbase.block.CustomBlock;

public class SuspendedStairsBlock extends CustomBlock implements IWaterLoggable
{
    public static final DirectionProperty FACING = DirectionProperty.create("facing", Direction.Plane.HORIZONTAL);
    public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;
    private boolean isLarge = false;

    /* SHAPES */

    // Middle bar
    private static final VoxelShape BAR1_N = Block.makeCuboidShape(6.0D, -1.0D, 0.0D, 10.0D, 3.0D, 4.0D);
    private static final VoxelShape BAR2_N = Block.makeCuboidShape(6.0D, 3.0D, 4.0D, 10.0D, 7.0D, 8.0D);
    private static final VoxelShape BAR3_N = Block.makeCuboidShape(6.0D, 7.0D, 8.0D, 10.0D, 11.0D, 12.0D);
    private static final VoxelShape BAR4_N = Block.makeCuboidShape(6.0D, 11.0D, 12.0D, 10.0D, 15.0D, 16.0D);
    private static final VoxelShape BAR_N = VoxelShapes.or(BAR1_N, VoxelShapes.or(BAR2_N, VoxelShapes.or(BAR3_N, BAR4_N)));

    private static final VoxelShape BAR1_W = Block.makeCuboidShape(0.0D, -1.0D, 6.0D, 4.0D, 3.0D, 10.0D);
    private static final VoxelShape BAR2_W = Block.makeCuboidShape(4.0D, 3.0D, 6.0D, 8.0D, 7.0D, 10.0D);
    private static final VoxelShape BAR3_W = Block.makeCuboidShape(8.0D, 7.0D, 6.0D, 12.0D, 11.0D, 10.0D);
    private static final VoxelShape BAR4_W = Block.makeCuboidShape(12.0D, 11.0D, 6.0D, 16.0D, 15.0D, 10.0D);
    private static final VoxelShape BAR_W = VoxelShapes.or(BAR1_W, VoxelShapes.or(BAR2_W, VoxelShapes.or(BAR3_W, BAR4_W)));

    private static final VoxelShape BAR1_S = Block.makeCuboidShape(6.0D, -1.0D, 12.0D, 10.0D, 3.0D, 16.0D);
    private static final VoxelShape BAR2_S = Block.makeCuboidShape(6.0D, 3.0D, 8.0D, 10.0D, 7.0D, 12.0D);
    private static final VoxelShape BAR3_S = Block.makeCuboidShape(6.0D, 7.0D, 4.0D, 10.0D, 11.0D, 8.0D);
    private static final VoxelShape BAR4_S = Block.makeCuboidShape(6.0D, 11.0D, 0.0D, 10.0D, 15.0D, 4.0D);
    private static final VoxelShape BAR_S = VoxelShapes.or(BAR1_S, VoxelShapes.or(BAR2_S, VoxelShapes.or(BAR3_S, BAR4_S)));

    private static final VoxelShape BAR1_E = Block.makeCuboidShape(12.0D, -1.0D, 6.0D, 16.0D, 3.0D, 10.0D);
    private static final VoxelShape BAR2_E = Block.makeCuboidShape(8.0D, 3.0D, 6.0D, 12.0D, 7.0D, 10.0D);
    private static final VoxelShape BAR3_E = Block.makeCuboidShape(4.0D, 7.0D, 6.0D, 8.0D, 11.0D, 10.0D);
    private static final VoxelShape BAR4_E = Block.makeCuboidShape(0.0D, 11.0D, 6.0D, 4.0D, 15.0D, 10.0D);
    private static final VoxelShape BAR_E = VoxelShapes.or(BAR1_E, VoxelShapes.or(BAR2_E, VoxelShapes.or(BAR3_E, BAR4_E)));

    // Small steps
    private static final VoxelShape STEP1_N = Block.makeCuboidShape(0.0D, 3.0D, 0.0D, 16.0D, 4.0D, 4.0D);
    private static final VoxelShape STEP2_N = Block.makeCuboidShape(0.0D, 7.0D, 4.0D, 16.0D, 8.0D, 8.0D);
    private static final VoxelShape STEP3_N = Block.makeCuboidShape(0.0D, 11.0D, 8.0D, 16.0D, 12.0D, 12.0D);
    private static final VoxelShape STEP4_N = Block.makeCuboidShape(0.0D, 15.0D, 12.0D, 16.0D, 16.0D, 16.0D);
    private static final VoxelShape STEPS_N = VoxelShapes.or(STEP1_N, VoxelShapes.or(STEP2_N, VoxelShapes.or(STEP3_N, STEP4_N)));

    private static final VoxelShape STEP1_W = Block.makeCuboidShape(0.0D, 3.0D, 0.0D, 4.0D, 4.0D, 16.0D);
    private static final VoxelShape STEP2_W = Block.makeCuboidShape(4.0D, 7.0D, 0.0D, 8.0D, 8.0D, 16.0D);
    private static final VoxelShape STEP3_W = Block.makeCuboidShape(8.0D, 11.0D, 0.0D, 12.0D, 12.0D, 16.0D);
    private static final VoxelShape STEP4_W = Block.makeCuboidShape(12.0D, 15.0D, 0.0D, 16.0D, 16.0D, 16.0D);
    private static final VoxelShape STEPS_W = VoxelShapes.or(STEP1_W, VoxelShapes.or(STEP2_W, VoxelShapes.or(STEP3_W, STEP4_W)));

    private static final VoxelShape STEP1_S = Block.makeCuboidShape(0.0D, 15.0D, 0.0D, 16.0D, 16.0D, 4.0D);
    private static final VoxelShape STEP2_S = Block.makeCuboidShape(0.0D, 11.0D, 4.0D, 16.0D, 12.0D, 8.0D);
    private static final VoxelShape STEP3_S = Block.makeCuboidShape(0.0D, 7.0D, 8.0D, 16.0D, 8.0D, 12.0D);
    private static final VoxelShape STEP4_S = Block.makeCuboidShape(0.0D, 3.0D, 12.0D, 16.0D, 4.0D, 16.0D);
    private static final VoxelShape STEPS_S = VoxelShapes.or(STEP1_S, VoxelShapes.or(STEP2_S, VoxelShapes.or(STEP3_S, STEP4_S)));

    private static final VoxelShape STEP1_E = Block.makeCuboidShape(0.0D, 15.0D, 0.0D, 4.0D, 16.0D, 16.0D);
    private static final VoxelShape STEP2_E = Block.makeCuboidShape(4.0D, 11.0D, 0.0D, 8.0D, 12.0D, 16.0D);
    private static final VoxelShape STEP3_E = Block.makeCuboidShape(8.0D, 7.0D, 0.0D, 12.0D, 8.0D, 16.0D);
    private static final VoxelShape STEP4_E = Block.makeCuboidShape(12.0D, 3.0D, 0.0D, 16.0D, 4.0D, 16.0D);
    private static final VoxelShape STEPS_E = VoxelShapes.or(STEP1_E, VoxelShapes.or(STEP2_E, VoxelShapes.or(STEP3_E, STEP4_E)));

    // Large steps
    private static final VoxelShape STEP1_LARGE_N = Block.makeCuboidShape(0.0D, 6.0D, 0.0D, 16.0D, 8.0D, 8.0D);
    private static final VoxelShape STEP2_LARGE_N = Block.makeCuboidShape(0.0D, 14.0D, 8.0D, 16.0D, 16.0D, 16.0D);
    private static final VoxelShape LARGE_N = VoxelShapes.or(STEP1_LARGE_N, STEP2_LARGE_N);

    private static final VoxelShape STEP1_LARGE_W = Block.makeCuboidShape(0.0D, 6.0D, 0.0D, 8.0D, 8.0D, 16.0D);
    private static final VoxelShape STEP2_LARGE_W = Block.makeCuboidShape(8.0D, 14.0D, 0.0D, 16.0D, 16.0D, 16.0D);
    private static final VoxelShape LARGE_W = VoxelShapes.or(STEP1_LARGE_W, STEP2_LARGE_W);

    private static final VoxelShape STEP1_LARGE_S = Block.makeCuboidShape(0.0D, 14.0D, 0.0D, 16.0D, 16.0D, 8.0D);
    private static final VoxelShape STEP2_LARGE_S = Block.makeCuboidShape(0.0D, 6.0D, 8.0D, 16.0D, 8.0D, 16.0D);
    private static final VoxelShape LARGE_S = VoxelShapes.or(STEP1_LARGE_S, STEP2_LARGE_S);

    private static final VoxelShape STEP1_LARGE_E = Block.makeCuboidShape(8.0D, 6.0D, 0.0D, 16.0D, 8.0D, 16.0D);
    private static final VoxelShape STEP2_LARGE_E = Block.makeCuboidShape(0.0D, 14.0D, 0.0D, 8.0D, 16.0D, 16.0D);
    private static final VoxelShape LARGE_E = VoxelShapes.or(STEP1_LARGE_E, STEP2_LARGE_E);

    // Collision

    private static final VoxelShape STEP1_COL_N = Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 8.0D, 8.0D);
    private static final VoxelShape STEP2_COL_N = Block.makeCuboidShape(0.0D, 8.0D, 8.0D, 16.0D, 16.0D, 16.0D);
    private static final VoxelShape COL_N = VoxelShapes.or(STEP1_COL_N, STEP2_COL_N);

    private static final VoxelShape STEP1_COL_W = Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 8.0D, 8.0D, 16.0D);
    private static final VoxelShape STEP2_COL_W = Block.makeCuboidShape(8.0D, 8.0D, 0.0D, 16.0D, 16.0D, 16.0D);
    private static final VoxelShape COL_W = VoxelShapes.or(STEP1_COL_W, STEP2_COL_W);

    private static final VoxelShape STEP1_COL_S = Block.makeCuboidShape(0.0D, 8.0D, 0.0D, 16.0D, 16.0D, 8.0D);
    private static final VoxelShape STEP2_COL_S = Block.makeCuboidShape(0.0D, 0.0D, 8.0D, 16.0D, 8.0D, 16.0D);
    private static final VoxelShape COL_S = VoxelShapes.or(STEP1_COL_S, STEP2_COL_S);

    private static final VoxelShape STEP1_COL_E = Block.makeCuboidShape(8.0D, 0.0D, 0.0D, 16.0D, 8.0D, 16.0D);
    private static final VoxelShape STEP2_COL_E = Block.makeCuboidShape(0.0D, 8.0D, 0.0D, 8.0D, 16.0D, 16.0D);
    private static final VoxelShape COL_E = VoxelShapes.or(STEP1_COL_E, STEP2_COL_E);

    /// Final shapes

    private static final VoxelShape SHAPE_N = VoxelShapes.or(STEPS_N, BAR_N);
    private static final VoxelShape SHAPE_W = VoxelShapes.or(STEPS_W, BAR_W);
    private static final VoxelShape SHAPE_S = VoxelShapes.or(STEPS_S, BAR_S);
    private static final VoxelShape SHAPE_E = VoxelShapes.or(STEPS_E, BAR_E);

    private static final VoxelShape SHAPE_LARGE_N = VoxelShapes.or(LARGE_N, BAR_N);
    private static final VoxelShape SHAPE_LARGE_W = VoxelShapes.or(LARGE_W, BAR_W);
    private static final VoxelShape SHAPE_LARGE_S = VoxelShapes.or(LARGE_S, BAR_S);
    private static final VoxelShape SHAPE_LARGE_E = VoxelShapes.or(LARGE_E, BAR_E);

    @Override
    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context)
    {
        switch((Direction)state.get(FACING))
        {
            case NORTH:
                return !isLarge ? SHAPE_N : SHAPE_LARGE_N;
            case SOUTH:
                return !isLarge ? SHAPE_S : SHAPE_LARGE_S;
            case WEST:
                return !isLarge ? SHAPE_W : SHAPE_LARGE_W;
            case EAST:
                return !isLarge ? SHAPE_E : SHAPE_LARGE_E;
            default:
                return !isLarge ? SHAPE_N : SHAPE_LARGE_N;
        }
    }

    @Override
    public VoxelShape getCollisionShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context)
    {
        switch((Direction)state.get(FACING))
        {
            case NORTH:
                return COL_N;
            case SOUTH:
                return COL_S;
            case WEST:
                return COL_W;
            case EAST:
                return COL_E;
            default:
                return COL_N;
        }
    }

    public SuspendedStairsBlock(Properties properties, boolean isLarge)
    {
        super(properties);
        this.setDefaultState(getStateContainer().getBaseState().with(WATERLOGGED, false));
        this.isLarge = isLarge;
    }

    public SuspendedStairsBlock(Properties properties, ToolType toolType, boolean isLarge)
    {
        super(properties, toolType);
        this.setDefaultState(getStateContainer().getBaseState().with(WATERLOGGED, false));
        this.isLarge = isLarge;
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
        FluidState ifluidstate = context.getWorld().getFluidState(blockpos);

        return this.getDefaultState().with(FACING, context.getPlacementHorizontalFacing().getOpposite()).with(WATERLOGGED, Boolean.valueOf(Boolean.valueOf(ifluidstate.getFluid() == Fluids.WATER)));
    }

    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder)
    {
        builder.add(FACING, WATERLOGGED);
    }

    @SuppressWarnings("deprecation")
    public FluidState getFluidState(BlockState state)
    {
        return state.get(WATERLOGGED) ? Fluids.WATER.getStillFluidState(false) : super.getFluidState(state);
    }

    public boolean isLagre()
    {
        return this.isLarge;
    }
}