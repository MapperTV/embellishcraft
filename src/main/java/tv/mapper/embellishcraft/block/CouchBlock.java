package tv.mapper.embellishcraft.block;

import java.util.stream.IntStream;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.IWaterLoggable;
import net.minecraft.fluid.Fluids;
import net.minecraft.fluid.IFluidState;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.EnumProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.state.properties.StairsShape;
import net.minecraft.util.Direction;
import net.minecraft.util.Mirror;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.IWorldReader;
import net.minecraftforge.common.ToolType;

public class CouchBlock extends CustomBlock implements IWaterLoggable
{
    public static final DirectionProperty FACING = DirectionProperty.create("facing", Direction.Plane.HORIZONTAL);
    public static final EnumProperty<StairsShape> SHAPE = BlockStateProperties.STAIRS_SHAPE;
    public static final BooleanProperty LEFT_END = BooleanProperty.create("left_end");
    public static final BooleanProperty RIGHT_END = BooleanProperty.create("right_end");

    public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;

    protected static final VoxelShape SLAB_BOTTOM = Block.makeCuboidShape(0.0D, 3.0D, 0.0D, 16.0D, 8.0D, 16.0D);
    protected static final VoxelShape NWU_CORNER = Block.makeCuboidShape(0.0D, 8.0D, 0.0D, 8.0D, 16.0D, 8.0D);
    protected static final VoxelShape SWU_CORNER = Block.makeCuboidShape(0.0D, 8.0D, 8.0D, 8.0D, 16.0D, 16.0D);
    protected static final VoxelShape NEU_CORNER = Block.makeCuboidShape(8.0D, 8.0D, 0.0D, 16.0D, 16.0D, 8.0D);
    protected static final VoxelShape SEU_CORNER = Block.makeCuboidShape(8.0D, 8.0D, 8.0D, 16.0D, 16.0D, 16.0D);

    protected static final VoxelShape[] SLAB_BOTTOM_SHAPES = makeShapes(SLAB_BOTTOM, NWU_CORNER, NEU_CORNER, SWU_CORNER, SEU_CORNER);

    private static final int[] field_196522_K = new int[] {12, 5, 3, 10, 14, 13, 7, 11, 13, 7, 11, 14, 8, 4, 1, 2, 4, 1, 2, 8};

    private static VoxelShape[] makeShapes(VoxelShape slabShape, VoxelShape nwCorner, VoxelShape neCorner, VoxelShape swCorner, VoxelShape seCorner)
    {
        return IntStream.range(0, 16).mapToObj((p_199780_5_) ->
        {
            return combineShapes(p_199780_5_, slabShape, nwCorner, neCorner, swCorner, seCorner);
        }).toArray((p_199778_0_) ->
        {
            return new VoxelShape[p_199778_0_];
        });
    }

    /**
     * combines the shapes according to the mode set in the bitfield
     */
    private static VoxelShape combineShapes(int bitfield, VoxelShape slabShape, VoxelShape nwCorner, VoxelShape neCorner, VoxelShape swCorner, VoxelShape seCorner)
    {
        VoxelShape voxelshape = slabShape;
        if((bitfield & 1) != 0)
        {
            voxelshape = VoxelShapes.or(slabShape, nwCorner);
        }

        if((bitfield & 2) != 0)
        {
            voxelshape = VoxelShapes.or(voxelshape, neCorner);
        }

        if((bitfield & 4) != 0)
        {
            voxelshape = VoxelShapes.or(voxelshape, swCorner);
        }

        if((bitfield & 8) != 0)
        {
            voxelshape = VoxelShapes.or(voxelshape, seCorner);
        }

        return voxelshape;
    }

    public CouchBlock(Properties properties)
    {
        super(properties);
        this.setDefaultState(
            this.stateContainer.getBaseState().with(FACING, Direction.NORTH).with(SHAPE, StairsShape.STRAIGHT).with(LEFT_END, true).with(RIGHT_END, true).with(WATERLOGGED, Boolean.valueOf(false)));
    }

    public CouchBlock(Properties properties, ToolType toolType)
    {
        super(properties);
        this.toolType = toolType;
        this.setDefaultState(
            this.stateContainer.getBaseState().with(FACING, Direction.NORTH).with(SHAPE, StairsShape.STRAIGHT).with(LEFT_END, true).with(RIGHT_END, true).with(WATERLOGGED, Boolean.valueOf(false)));

    }

    @Override
    public boolean isTransparent(BlockState state)
    {
        return true;
    }

    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context)
    {
        return (SLAB_BOTTOM_SHAPES)[field_196522_K[this.getCouchShape(state)]];
    }

    private int getCouchShape(BlockState state)
    {
        return state.get(SHAPE).ordinal() * 4 + state.get(FACING).getHorizontalIndex();
    }

    // @Override
    // public boolean isSolid(BlockState state)
    // {
    // return false;
    // }

    public boolean isValidPosition(BlockState state, IWorldReader worldIn, BlockPos pos)
    {
        if(!worldIn.getBlockState(pos.down()).isSolid())
            return false;
        return true;
    }

    public BlockState getStateForPlacement(BlockItemUseContext context)
    {
        IBlockReader iblockreader = context.getWorld();
        BlockPos blockpos = context.getPos();
        IFluidState ifluidstate = context.getWorld().getFluidState(blockpos);

        BlockState leftstate;
        BlockState rightstate;
        boolean leftend = true;
        boolean rightend = true;

        Direction facing = context.getPlacementHorizontalFacing();
        StairsShape shape = getShapeProperty(this.getDefaultState().with(FACING, facing), context.getWorld(), blockpos);

        if(shape == StairsShape.STRAIGHT)
        {
            switch(facing)
            {
                case NORTH:
                    leftstate = iblockreader.getBlockState(blockpos.west());
                    rightstate = iblockreader.getBlockState(blockpos.east());
                    break;
                case SOUTH:
                    leftstate = iblockreader.getBlockState(blockpos.east());
                    rightstate = iblockreader.getBlockState(blockpos.west());
                    break;
                case EAST:
                    leftstate = iblockreader.getBlockState(blockpos.north());
                    rightstate = iblockreader.getBlockState(blockpos.south());
                    break;
                case WEST:
                    leftstate = iblockreader.getBlockState(blockpos.south());
                    rightstate = iblockreader.getBlockState(blockpos.north());
                    break;
                default:
                    leftstate = iblockreader.getBlockState(blockpos.west());
                    rightstate = iblockreader.getBlockState(blockpos.east());
            }

            if(leftstate.getBlock() instanceof CouchBlock)
                leftend = false;
            if(rightstate.getBlock() instanceof CouchBlock)
                rightend = false;
        }
        else
        {
            leftend = false;
            rightend = false;
        }

        return this.getDefaultState().with(SHAPE, shape).with(FACING, facing).with(LEFT_END, leftend).with(RIGHT_END, rightend).with(WATERLOGGED,
            Boolean.valueOf(ifluidstate.getFluid() == Fluids.WATER));
    }

    /**
     * Returns a stair shape property based on the surrounding stairs from the given blockstate and position
     */
    private static StairsShape getShapeProperty(BlockState state, IBlockReader worldIn, BlockPos pos)
    {
        Direction direction = state.get(FACING);
        BlockState blockstate = worldIn.getBlockState(pos.offset(direction));
        if(isCouchBlock(blockstate))
        {
            Direction direction1 = blockstate.get(FACING);
            if(direction1.getAxis() != state.get(FACING).getAxis() && isDifferentCouch(state, worldIn, pos, direction1.getOpposite()))
            {
                if(direction1 == direction.rotateYCCW())
                {
                    return StairsShape.OUTER_LEFT;
                }

                return StairsShape.OUTER_RIGHT;
            }
        }

        BlockState blockstate1 = worldIn.getBlockState(pos.offset(direction.getOpposite()));
        if(isCouchBlock(blockstate1))
        {
            Direction direction2 = blockstate1.get(FACING);
            if(direction2.getAxis() != state.get(FACING).getAxis() && isDifferentCouch(state, worldIn, pos, direction2))
            {
                if(direction2 == direction.rotateYCCW())
                {
                    return StairsShape.INNER_LEFT;
                }

                return StairsShape.INNER_RIGHT;
            }
        }
        return StairsShape.STRAIGHT;
    }

    @SuppressWarnings("deprecation")
    public BlockState updatePostPlacement(BlockState stateIn, Direction facing, BlockState facingState, IWorld worldIn, BlockPos currentPos, BlockPos facingPos)
    {
        BlockState leftstate;
        BlockState rightstate;
        boolean leftend;
        boolean rightend;

        StairsShape shape = stateIn.get(SHAPE);
        Direction direction = stateIn.get(FACING);

        if(facing.getAxis().isHorizontal())
            shape = getShapeProperty(stateIn, worldIn, currentPos);

        if(shape == StairsShape.STRAIGHT)
        {
            switch(direction)
            {
                case NORTH:
                    leftstate = worldIn.getBlockState(currentPos.west());
                    rightstate = worldIn.getBlockState(currentPos.east());
                    break;
                case SOUTH:
                    leftstate = worldIn.getBlockState(currentPos.east());
                    rightstate = worldIn.getBlockState(currentPos.west());
                    break;
                case EAST:
                    leftstate = worldIn.getBlockState(currentPos.north());
                    rightstate = worldIn.getBlockState(currentPos.south());
                    break;
                case WEST:
                    leftstate = worldIn.getBlockState(currentPos.south());
                    rightstate = worldIn.getBlockState(currentPos.north());
                    break;
                default:
                    leftstate = worldIn.getBlockState(currentPos.west());
                    rightstate = worldIn.getBlockState(currentPos.east());
            }

            if(leftstate.getBlock() instanceof CouchBlock)
                leftend = false;
            else
                leftend = true;

            if(rightstate.getBlock() instanceof CouchBlock)
                rightend = false;
            else
                rightend = true;
        }
        else
        {
            leftend = false;
            rightend = false;
        }

        if(stateIn.get(WATERLOGGED))
        {
            worldIn.getPendingFluidTicks().scheduleTick(currentPos, Fluids.WATER, Fluids.WATER.getTickRate(worldIn));
        }

        if(facing == Direction.DOWN && !this.isValidPosition(stateIn, worldIn, currentPos))
            return Blocks.AIR.getDefaultState();

        return facing.getAxis().isHorizontal() ? stateIn.with(SHAPE, shape).with(LEFT_END, leftend).with(RIGHT_END, rightend) : super.updatePostPlacement(stateIn, facing, facingState, worldIn,
            currentPos, facingPos);
    }

    private static boolean isDifferentCouch(BlockState state, IBlockReader worldIn, BlockPos pos, Direction face)
    {
        BlockState blockstate = worldIn.getBlockState(pos.offset(face));
        return !isCouchBlock(blockstate) || blockstate.get(FACING) != state.get(FACING);
    }

    public static boolean isCouchBlock(BlockState state)
    {
        return state.getBlock() instanceof CouchBlock;
    }

    /**
     * Returns the blockstate with the given mirror of the passed blockstate. If inapplicable, returns the passed
     * blockstate.
     * @deprecated call via {@link IBlockState#withMirror(Mirror)} whenever possible. Implementing/overriding is fine.
     */
    public BlockState mirror(BlockState state, Mirror mirrorIn)
    {
        Direction direction = state.get(FACING);
        StairsShape stairsshape = state.get(SHAPE);
        switch(mirrorIn)
        {
            case LEFT_RIGHT:
                if(direction.getAxis() == Direction.Axis.Z)
                {
                    switch(stairsshape)
                    {
                        case INNER_LEFT:
                            return state.rotate(Rotation.CLOCKWISE_180).with(SHAPE, StairsShape.INNER_RIGHT);
                        case INNER_RIGHT:
                            return state.rotate(Rotation.CLOCKWISE_180).with(SHAPE, StairsShape.INNER_LEFT);
                        case OUTER_LEFT:
                            return state.rotate(Rotation.CLOCKWISE_180).with(SHAPE, StairsShape.OUTER_RIGHT);
                        case OUTER_RIGHT:
                            return state.rotate(Rotation.CLOCKWISE_180).with(SHAPE, StairsShape.OUTER_LEFT);
                        default:
                            return state.rotate(Rotation.CLOCKWISE_180);
                    }
                }
                break;
            case FRONT_BACK:
                if(direction.getAxis() == Direction.Axis.X)
                {
                    switch(stairsshape)
                    {
                        case INNER_LEFT:
                            return state.rotate(Rotation.CLOCKWISE_180).with(SHAPE, StairsShape.INNER_LEFT);
                        case INNER_RIGHT:
                            return state.rotate(Rotation.CLOCKWISE_180).with(SHAPE, StairsShape.INNER_RIGHT);
                        case OUTER_LEFT:
                            return state.rotate(Rotation.CLOCKWISE_180).with(SHAPE, StairsShape.OUTER_RIGHT);
                        case OUTER_RIGHT:
                            return state.rotate(Rotation.CLOCKWISE_180).with(SHAPE, StairsShape.OUTER_LEFT);
                        case STRAIGHT:
                            return state.rotate(Rotation.CLOCKWISE_180);
                    }
                }
            default:
                break;
        }

        return super.mirror(state, mirrorIn);
    }

    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder)
    {
        builder.add(FACING, SHAPE, LEFT_END, RIGHT_END, WATERLOGGED);
    }

    @SuppressWarnings("deprecation")
    public IFluidState getFluidState(BlockState state)
    {
        return state.get(WATERLOGGED) ? Fluids.WATER.getStillFluidState(false) : super.getFluidState(state);
    }
}
