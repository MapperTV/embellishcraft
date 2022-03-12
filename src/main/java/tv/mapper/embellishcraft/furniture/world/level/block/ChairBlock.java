package tv.mapper.embellishcraft.furniture.world.level.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
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
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import tv.mapper.embellishcraft.furniture.world.entity.SitEntity;
import tv.mapper.mapperbase.world.level.block.CustomBlock;
import tv.mapper.mapperbase.world.level.block.ToolTiers;
import tv.mapper.mapperbase.world.level.block.ToolTypes;

public class ChairBlock extends CustomBlock implements SimpleWaterloggedBlock, SitBlock
{
    // Need to figure a way to rotate VoxelShapes because this is just stupid
    private static final VoxelShape SOUTH_LEFT_FRONT_LEG = Block.box(11.0D, 0.0D, 11.0D, 13.0D, 7.0D, 13.0D);
    private static final VoxelShape SOUTH_RIGHT_FRONT_LEG = Block.box(3.0D, 0.0D, 11.0D, 5.0D, 7.0D, 13.0D);
    private static final VoxelShape SOUTH_LEFT_BACK_LEG = Block.box(11.0D, 0.0D, 2.0D, 13.0D, 16.0D, 4.0D);
    private static final VoxelShape SOUTH_RIGHT_BACK_LEG = Block.box(3.0D, 0.0D, 2.0D, 5.0D, 16.0D, 4.0D);
    private static final VoxelShape SOUTH_SIT = Block.box(3.0D, 7.0D, 4.0D, 13.0D, 8.0D, 13.0D);
    private static final VoxelShape SOUTH_BACK = Block.box(5.0D, 12.0D, 3.0D, 11.0D, 14.0D, 4.0D);
    private static final VoxelShape SOUTH_CHAIR_AABB = Shapes.or(SOUTH_LEFT_FRONT_LEG, Shapes.or(SOUTH_RIGHT_FRONT_LEG, Shapes.or(SOUTH_LEFT_BACK_LEG, Shapes.or(SOUTH_SIT, Shapes.or(SOUTH_BACK, SOUTH_RIGHT_BACK_LEG)))));

    private static final VoxelShape SOUTH_COL_BACK = Block.box(3.0D, 0.0D, 2.0D, 13.0D, 16.0D, 4.0D);
    private static final VoxelShape SOUTH_COL_SIT = Block.box(3.0D, 0.0D, 4.0D, 13.0D, 8.0D, 13.0D);
    private static final VoxelShape SOUTH_COL = Shapes.or(SOUTH_COL_BACK, SOUTH_COL_SIT);

    private static final VoxelShape WEST_LEFT_FRONT_LEG = Block.box(3.0D, 0.0D, 11.0D, 5.0D, 7.0D, 13.0D);
    private static final VoxelShape WEST_RIGHT_FRONT_LEG = Block.box(3.0D, 0.0D, 3.0D, 5.0D, 7.0D, 5.0D);
    private static final VoxelShape WEST_LEFT_BACK_LEG = Block.box(12.0D, 0.0D, 11.0D, 14.0D, 16.0D, 13.0D);
    private static final VoxelShape WEST_RIGHT_BACK_LEG = Block.box(12.0D, 0.0D, 3.0D, 14.0D, 16.0D, 5.0D);
    private static final VoxelShape WEST_SIT = Block.box(3.0D, 7.0D, 3.0D, 12.0D, 8.0D, 13.0D);
    private static final VoxelShape WEST_BACK = Block.box(12.0D, 12.0D, 5.0D, 13.0D, 14.0D, 11.0D);
    private static final VoxelShape WEST_CHAIR_AABB = Shapes.or(WEST_LEFT_FRONT_LEG, Shapes.or(WEST_RIGHT_FRONT_LEG, Shapes.or(WEST_LEFT_BACK_LEG, Shapes.or(WEST_SIT, Shapes.or(WEST_BACK, WEST_RIGHT_BACK_LEG)))));

    private static final VoxelShape WEST_COL_BACK = Block.box(12.0D, 0.0D, 3.0D, 14.0D, 16.0D, 13.0D);
    private static final VoxelShape WEST_COL_SIT = Block.box(3.0D, 0.0D, 3.0D, 12.0D, 8.0D, 13.0D);
    private static final VoxelShape WEST_COL = Shapes.or(WEST_COL_BACK, WEST_COL_SIT);

    private static final VoxelShape NORTH_LEFT_FRONT_LEG = Block.box(3.0D, 0.0D, 3.0D, 5.0D, 7.0D, 5.0D);
    private static final VoxelShape NORTH_RIGHT_FRONT_LEG = Block.box(11.0D, 0.0D, 3.0D, 13.0D, 7.0D, 5.0D);
    private static final VoxelShape NORTH_LEFT_BACK_LEG = Block.box(3.0D, 0.0D, 12.0D, 5.0D, 16.0D, 14.0D);
    private static final VoxelShape NORTH_RIGHT_BACK_LEG = Block.box(11.0D, 0.0D, 12.0D, 13.0D, 16.0D, 14.0D);
    private static final VoxelShape NORTH_SIT = Block.box(3.0D, 7.0D, 3.0D, 13.0D, 8.0D, 12.0D);
    private static final VoxelShape NORTH_BACK = Block.box(5.0D, 12.0D, 12.0D, 11.0D, 14.0D, 13.0D);
    private static final VoxelShape NORTH_CHAIR_AABB = Shapes.or(NORTH_LEFT_FRONT_LEG, Shapes.or(NORTH_RIGHT_FRONT_LEG, Shapes.or(NORTH_LEFT_BACK_LEG, Shapes.or(NORTH_SIT, Shapes.or(NORTH_BACK, NORTH_RIGHT_BACK_LEG)))));

    private static final VoxelShape NORTH_COL_BACK = Block.box(3.0D, 0.0D, 12.0D, 13.0D, 16.0D, 14.0D);
    private static final VoxelShape NORTH_COL_SIT = Block.box(3.0D, 0.0D, 3.0D, 13.0D, 8.0D, 12.0D);
    private static final VoxelShape NORTH_COL = Shapes.or(NORTH_COL_BACK, NORTH_COL_SIT);

    private static final VoxelShape EAST_LEFT_FRONT_LEG = Block.box(11.0D, 0.0D, 3.0D, 13.0D, 7.0D, 5.0D);
    private static final VoxelShape EAST_RIGHT_FRONT_LEG = Block.box(11.0D, 0.0D, 11.0D, 13.0D, 7.0D, 13.0D);
    private static final VoxelShape EAST_LEFT_BACK_LEG = Block.box(2.0D, 0.0D, 3.0D, 4.0D, 16.0D, 5.0D);
    private static final VoxelShape EAST_RIGHT_BACK_LEG = Block.box(2.0D, 0.0D, 11.0D, 4.0D, 16.0D, 13.0D);
    private static final VoxelShape EAST_SIT = Block.box(4.0D, 7.0D, 3.0D, 13.0D, 8.0D, 13.0D);
    private static final VoxelShape EAST_BACK = Block.box(3.0D, 12.0D, 5.0D, 4.0D, 14.0D, 11.0D);
    private static final VoxelShape EAST_CHAIR_AABB = Shapes.or(EAST_LEFT_FRONT_LEG, Shapes.or(EAST_RIGHT_FRONT_LEG, Shapes.or(EAST_LEFT_BACK_LEG, Shapes.or(EAST_SIT, Shapes.or(EAST_BACK, EAST_RIGHT_BACK_LEG)))));

    private static final VoxelShape EAST_COL_BACK = Block.box(2.0D, 0.0D, 3.0D, 4.0D, 16.0D, 13.0D);
    private static final VoxelShape EAST_COL_SIT = Block.box(4.0D, 0.0D, 3.0D, 13.0D, 8.0D, 13.0D);
    private static final VoxelShape EAST_COL = Shapes.or(EAST_COL_BACK, EAST_COL_SIT);

    public static final DirectionProperty FACING = DirectionProperty.create("facing", Direction.Plane.HORIZONTAL);
    public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;

    public ChairBlock(Properties properties, ToolTypes tool)
    {
        super(properties, tool);
        this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH).setValue(WATERLOGGED, Boolean.valueOf(false)));
    }

    public ChairBlock(Properties properties, ToolTypes tool, ToolTiers tier)
    {
        super(properties, tool, tier);
        this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH).setValue(WATERLOGGED, Boolean.valueOf(false)));
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter worldIn, BlockPos pos, CollisionContext context)
    {
        switch((Direction)state.getValue(FACING))
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

    @Override
    public VoxelShape getCollisionShape(BlockState state, BlockGetter worldIn, BlockPos pos, CollisionContext context)
    {
        switch((Direction)state.getValue(FACING))
        {
            case NORTH:
                return NORTH_COL;
            case SOUTH:
                return SOUTH_COL;
            case WEST:
                return WEST_COL;
            case EAST:
                return EAST_COL;
            default:
                return SOUTH_COL;
        }
    }

    public boolean canSurvive(BlockState state, LevelReader level, BlockPos pos)
    {
        return !level.isEmptyBlock(pos.below());
    }

    @SuppressWarnings("deprecation")
    public BlockState updateShape(BlockState stateIn, Direction facing, BlockState facingState, LevelAccessor worldIn, BlockPos currentPos, BlockPos facingPos)
    {
        if(stateIn.getValue(WATERLOGGED))
        {
            worldIn.scheduleTick(currentPos, Fluids.WATER, Fluids.WATER.getTickDelay(worldIn));
        }

        if(facing == Direction.DOWN && !this.canSurvive(stateIn, worldIn, currentPos))
            return Blocks.AIR.defaultBlockState();

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

    @SuppressWarnings("deprecation")
    public FluidState getFluidState(BlockState state)
    {
        return state.getValue(WATERLOGGED) ? Fluids.WATER.getSource(false) : super.getFluidState(state);
    }

    @Override
    public InteractionResult use(BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult result)
    {
        return SitEntity.create(level, pos, 0.62, 0.26, player, state.getValue(FACING), true);
    }

    @Override
    public BlockState rotate(BlockState pState, Rotation pRotation)
    {
        return pState.setValue(FACING, pRotation.rotate(pState.getValue(FACING)));
    }

    @SuppressWarnings("deprecation")
    @Override
    public BlockState mirror(BlockState pState, Mirror pMirror)
    {
        return pState.rotate(pMirror.getRotation(pState.getValue(FACING)));
    }
}
