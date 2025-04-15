package tv.mapper.embellishcraft.building.block;

import java.util.List;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.SimpleWaterloggedBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.level.pathfinder.PathComputationType;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import tv.mapper.embellishcraft.furniture.block.SittableBlock;
import tv.mapper.embellishcraft.furniture.entity.InitFurnitureEntities;
import tv.mapper.embellishcraft.furniture.entity.SitEntity;
import tv.mapper.mapperbase.api.block.tools.ToolTiers;
import tv.mapper.mapperbase.api.block.tools.ToolTypes;

public class SuspendedStairBlock extends SittableBlock implements SimpleWaterloggedBlock
{
    public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;
    public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;
    private boolean isLarge = false;

    /* SHAPES */

    // Middle bar
    private static final VoxelShape BAR1_N = Block.box(6.0D, -1.0D, 0.0D, 10.0D, 3.0D, 4.0D);
    private static final VoxelShape BAR2_N = Block.box(6.0D, 3.0D, 4.0D, 10.0D, 7.0D, 8.0D);
    private static final VoxelShape BAR3_N = Block.box(6.0D, 7.0D, 8.0D, 10.0D, 11.0D, 12.0D);
    private static final VoxelShape BAR4_N = Block.box(6.0D, 11.0D, 12.0D, 10.0D, 15.0D, 16.0D);
    private static final VoxelShape BAR_N = Shapes.or(BAR1_N, Shapes.or(BAR2_N, Shapes.or(BAR3_N, BAR4_N)));

    private static final VoxelShape BAR1_W = Block.box(0.0D, -1.0D, 6.0D, 4.0D, 3.0D, 10.0D);
    private static final VoxelShape BAR2_W = Block.box(4.0D, 3.0D, 6.0D, 8.0D, 7.0D, 10.0D);
    private static final VoxelShape BAR3_W = Block.box(8.0D, 7.0D, 6.0D, 12.0D, 11.0D, 10.0D);
    private static final VoxelShape BAR4_W = Block.box(12.0D, 11.0D, 6.0D, 16.0D, 15.0D, 10.0D);
    private static final VoxelShape BAR_W = Shapes.or(BAR1_W, Shapes.or(BAR2_W, Shapes.or(BAR3_W, BAR4_W)));

    private static final VoxelShape BAR1_S = Block.box(6.0D, -1.0D, 12.0D, 10.0D, 3.0D, 16.0D);
    private static final VoxelShape BAR2_S = Block.box(6.0D, 3.0D, 8.0D, 10.0D, 7.0D, 12.0D);
    private static final VoxelShape BAR3_S = Block.box(6.0D, 7.0D, 4.0D, 10.0D, 11.0D, 8.0D);
    private static final VoxelShape BAR4_S = Block.box(6.0D, 11.0D, 0.0D, 10.0D, 15.0D, 4.0D);
    private static final VoxelShape BAR_S = Shapes.or(BAR1_S, Shapes.or(BAR2_S, Shapes.or(BAR3_S, BAR4_S)));

    private static final VoxelShape BAR1_E = Block.box(12.0D, -1.0D, 6.0D, 16.0D, 3.0D, 10.0D);
    private static final VoxelShape BAR2_E = Block.box(8.0D, 3.0D, 6.0D, 12.0D, 7.0D, 10.0D);
    private static final VoxelShape BAR3_E = Block.box(4.0D, 7.0D, 6.0D, 8.0D, 11.0D, 10.0D);
    private static final VoxelShape BAR4_E = Block.box(0.0D, 11.0D, 6.0D, 4.0D, 15.0D, 10.0D);
    private static final VoxelShape BAR_E = Shapes.or(BAR1_E, Shapes.or(BAR2_E, Shapes.or(BAR3_E, BAR4_E)));

    // Small steps
    private static final VoxelShape STEP1_N = Block.box(0.0D, 3.0D, 0.0D, 16.0D, 4.0D, 4.0D);
    private static final VoxelShape STEP2_N = Block.box(0.0D, 7.0D, 4.0D, 16.0D, 8.0D, 8.0D);
    private static final VoxelShape STEP3_N = Block.box(0.0D, 11.0D, 8.0D, 16.0D, 12.0D, 12.0D);
    private static final VoxelShape STEP4_N = Block.box(0.0D, 15.0D, 12.0D, 16.0D, 16.0D, 16.0D);
    private static final VoxelShape STEPS_N = Shapes.or(STEP1_N, Shapes.or(STEP2_N, Shapes.or(STEP3_N, STEP4_N)));

    private static final VoxelShape STEP1_W = Block.box(0.0D, 3.0D, 0.0D, 4.0D, 4.0D, 16.0D);
    private static final VoxelShape STEP2_W = Block.box(4.0D, 7.0D, 0.0D, 8.0D, 8.0D, 16.0D);
    private static final VoxelShape STEP3_W = Block.box(8.0D, 11.0D, 0.0D, 12.0D, 12.0D, 16.0D);
    private static final VoxelShape STEP4_W = Block.box(12.0D, 15.0D, 0.0D, 16.0D, 16.0D, 16.0D);
    private static final VoxelShape STEPS_W = Shapes.or(STEP1_W, Shapes.or(STEP2_W, Shapes.or(STEP3_W, STEP4_W)));

    private static final VoxelShape STEP1_S = Block.box(0.0D, 15.0D, 0.0D, 16.0D, 16.0D, 4.0D);
    private static final VoxelShape STEP2_S = Block.box(0.0D, 11.0D, 4.0D, 16.0D, 12.0D, 8.0D);
    private static final VoxelShape STEP3_S = Block.box(0.0D, 7.0D, 8.0D, 16.0D, 8.0D, 12.0D);
    private static final VoxelShape STEP4_S = Block.box(0.0D, 3.0D, 12.0D, 16.0D, 4.0D, 16.0D);
    private static final VoxelShape STEPS_S = Shapes.or(STEP1_S, Shapes.or(STEP2_S, Shapes.or(STEP3_S, STEP4_S)));

    private static final VoxelShape STEP1_E = Block.box(0.0D, 15.0D, 0.0D, 4.0D, 16.0D, 16.0D);
    private static final VoxelShape STEP2_E = Block.box(4.0D, 11.0D, 0.0D, 8.0D, 12.0D, 16.0D);
    private static final VoxelShape STEP3_E = Block.box(8.0D, 7.0D, 0.0D, 12.0D, 8.0D, 16.0D);
    private static final VoxelShape STEP4_E = Block.box(12.0D, 3.0D, 0.0D, 16.0D, 4.0D, 16.0D);
    private static final VoxelShape STEPS_E = Shapes.or(STEP1_E, Shapes.or(STEP2_E, Shapes.or(STEP3_E, STEP4_E)));

    // Large steps
    private static final VoxelShape STEP1_LARGE_N = Block.box(0.0D, 6.0D, 0.0D, 16.0D, 8.0D, 8.0D);
    private static final VoxelShape STEP2_LARGE_N = Block.box(0.0D, 14.0D, 8.0D, 16.0D, 16.0D, 16.0D);
    private static final VoxelShape LARGE_N = Shapes.or(STEP1_LARGE_N, STEP2_LARGE_N);

    private static final VoxelShape STEP1_LARGE_W = Block.box(0.0D, 6.0D, 0.0D, 8.0D, 8.0D, 16.0D);
    private static final VoxelShape STEP2_LARGE_W = Block.box(8.0D, 14.0D, 0.0D, 16.0D, 16.0D, 16.0D);
    private static final VoxelShape LARGE_W = Shapes.or(STEP1_LARGE_W, STEP2_LARGE_W);

    private static final VoxelShape STEP1_LARGE_S = Block.box(0.0D, 14.0D, 0.0D, 16.0D, 16.0D, 8.0D);
    private static final VoxelShape STEP2_LARGE_S = Block.box(0.0D, 6.0D, 8.0D, 16.0D, 8.0D, 16.0D);
    private static final VoxelShape LARGE_S = Shapes.or(STEP1_LARGE_S, STEP2_LARGE_S);

    private static final VoxelShape STEP1_LARGE_E = Block.box(8.0D, 6.0D, 0.0D, 16.0D, 8.0D, 16.0D);
    private static final VoxelShape STEP2_LARGE_E = Block.box(0.0D, 14.0D, 0.0D, 8.0D, 16.0D, 16.0D);
    private static final VoxelShape LARGE_E = Shapes.or(STEP1_LARGE_E, STEP2_LARGE_E);

    // Collision

    private static final VoxelShape STEP1_COL_N = Block.box(0.0D, 0.0D, 0.0D, 16.0D, 8.0D, 8.0D);
    private static final VoxelShape STEP2_COL_N = Block.box(0.0D, 8.0D, 8.0D, 16.0D, 16.0D, 16.0D);
    private static final VoxelShape COL_N = Shapes.or(STEP1_COL_N, STEP2_COL_N);

    private static final VoxelShape STEP1_COL_W = Block.box(0.0D, 0.0D, 0.0D, 8.0D, 8.0D, 16.0D);
    private static final VoxelShape STEP2_COL_W = Block.box(8.0D, 8.0D, 0.0D, 16.0D, 16.0D, 16.0D);
    private static final VoxelShape COL_W = Shapes.or(STEP1_COL_W, STEP2_COL_W);

    private static final VoxelShape STEP1_COL_S = Block.box(0.0D, 8.0D, 0.0D, 16.0D, 16.0D, 8.0D);
    private static final VoxelShape STEP2_COL_S = Block.box(0.0D, 0.0D, 8.0D, 16.0D, 8.0D, 16.0D);
    private static final VoxelShape COL_S = Shapes.or(STEP1_COL_S, STEP2_COL_S);

    private static final VoxelShape STEP1_COL_E = Block.box(8.0D, 0.0D, 0.0D, 16.0D, 8.0D, 16.0D);
    private static final VoxelShape STEP2_COL_E = Block.box(0.0D, 8.0D, 0.0D, 8.0D, 16.0D, 16.0D);
    private static final VoxelShape COL_E = Shapes.or(STEP1_COL_E, STEP2_COL_E);

    /// Final shapes

    private static final VoxelShape SHAPE_N = Shapes.or(STEPS_N, BAR_N);
    private static final VoxelShape SHAPE_W = Shapes.or(STEPS_W, BAR_W);
    private static final VoxelShape SHAPE_S = Shapes.or(STEPS_S, BAR_S);
    private static final VoxelShape SHAPE_E = Shapes.or(STEPS_E, BAR_E);

    private static final VoxelShape SHAPE_LARGE_N = Shapes.or(LARGE_N, BAR_N);
    private static final VoxelShape SHAPE_LARGE_W = Shapes.or(LARGE_W, BAR_W);
    private static final VoxelShape SHAPE_LARGE_S = Shapes.or(LARGE_S, BAR_S);
    private static final VoxelShape SHAPE_LARGE_E = Shapes.or(LARGE_E, BAR_E);

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter worldIn, BlockPos pos, CollisionContext context)
    {
        switch((Direction)state.getValue(FACING))
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
    public VoxelShape getCollisionShape(BlockState state, BlockGetter worldIn, BlockPos pos, CollisionContext context)
    {
        switch((Direction)state.getValue(FACING))
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

    public SuspendedStairBlock(Properties properties, ToolTypes tool, boolean isLarge)
    {
        super(properties, tool);
        this.registerDefaultState(getStateDefinition().any().setValue(WATERLOGGED, false));
        this.isLarge = isLarge;
    }

    public SuspendedStairBlock(Properties properties, ToolTypes tool, ToolTiers tier, boolean isLarge)
    {
        super(properties, tool, tier);
        this.registerDefaultState(getStateDefinition().any().setValue(WATERLOGGED, false));
        this.isLarge = isLarge;
    }

    public BlockState updateShape(BlockState stateIn, Direction facing, BlockState facingState, LevelAccessor worldIn, BlockPos currentPos, BlockPos facingPos)
    {
        if(stateIn.getValue(WATERLOGGED))
        {
            worldIn.scheduleTick(currentPos, Fluids.WATER, Fluids.WATER.getTickDelay(worldIn));
        }
        return super.updateShape(stateIn, facing, facingState, worldIn, currentPos, facingPos);
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context)
    {
        BlockPos blockpos = context.getClickedPos();
        FluidState ifluidstate = context.getLevel().getFluidState(blockpos);

        return this.defaultBlockState().setValue(FACING, context.getHorizontalDirection().getOpposite()).setValue(WATERLOGGED, Boolean.valueOf(Boolean.valueOf(ifluidstate.getType() == Fluids.WATER)));
    }

    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder)
    {
        builder.add(FACING, WATERLOGGED);
    }

    public FluidState getFluidState(BlockState state)
    {
        return state.getValue(WATERLOGGED) ? Fluids.WATER.getSource(false) : super.getFluidState(state);
    }

    public boolean isLagre()
    {
        return this.isLarge;
    }

    @Override
    public InteractionResult useWithoutItem(BlockState state, Level level, BlockPos pos, Player player, BlockHitResult result)
    {
        if(!level.isClientSide && this.isLarge)
        {
            Entity sitEntity = null;
            List<SitEntity> sitEntities = level.getEntities(InitFurnitureEntities.SIT_ENTITY.get(), new AABB(pos), sit -> true);
            if(sitEntities.isEmpty())
            {
                sitEntity = InitFurnitureEntities.SIT_ENTITY.get().spawn((ServerLevel)level, pos, MobSpawnType.TRIGGERED);
                player.startRiding(sitEntity);
                return InteractionResult.SUCCESS;
            }
            else
                return InteractionResult.PASS;
        }
        else
            return InteractionResult.PASS;

    }

    @Override
    protected BlockState rotate(BlockState state, Rotation rotation)
    {
        return state.setValue(FACING, rotation.rotate(state.getValue(FACING)));
    }

    @SuppressWarnings("deprecation")
    @Override
    public BlockState mirror(BlockState pState, Mirror pMirror)
    {
        return pState.rotate(pMirror.getRotation(pState.getValue(FACING)));
    }

    @Override
    public boolean isPathfindable(BlockState state, PathComputationType type)
    {
        return false;
    }
}
