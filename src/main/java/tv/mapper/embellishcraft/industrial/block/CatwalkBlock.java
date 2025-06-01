package tv.mapper.embellishcraft.industrial.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import tv.mapper.mapperbase.api.block.CustomBlock;
import tv.mapper.mapperbase.api.block.tools.ToolTiers;
import tv.mapper.mapperbase.api.block.tools.ToolTypes;

public class CatwalkBlock extends CustomBlock
{
    public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;

    protected static final VoxelShape floor_top = Block.box(0.0D, 15.0D, 0.0D, 16.0D, 16.0D, 16.0D);
    protected static final VoxelShape floor_bottom = Block.box(0.0D, 0.0D, 0.0D, 16.0D, 1.0D, 16.0D);

    public CatwalkBlock(Properties properties, ToolTypes tool)
    {
        super(properties, tool);
        registerDefaultState(stateDefinition.any().setValue(WATERLOGGED, Boolean.valueOf(false)));
    }

    public CatwalkBlock(Properties properties, ToolTypes tool, ToolTiers tier)
    {
        super(properties, tool, tier);
        registerDefaultState(stateDefinition.any().setValue(WATERLOGGED, Boolean.valueOf(false)));
    }

    public VoxelShape getShape(BlockState state, BlockGetter worldIn, BlockPos pos, CollisionContext context)
    {
        return floor_top;
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> pBuilder)
    {
        pBuilder.add(WATERLOGGED);
    }

    // @Override
    // @Nullable
    // public BlockState getStateForPlacement(BlockPlaceContext context)
    // {
    // BlockPos blockpos = context.getClickedPos();
    // FluidState fluidstate = context.getLevel().getFluidState(context.getClickedPos());
    // BlockState state = this.defaultBlockState().setValue(IS_UP, false).setValue(WATERLOGGED, Boolean.valueOf(fluidstate.getType() == Fluids.WATER));
    // Direction facing = context.getClickedFace();
    // return facing != Direction.DOWN && (facing == Direction.UP || !(context.getClickLocation().y - (double)blockpos.getY() > 0.5D)) ? state : state.setValue(IS_UP, Boolean.valueOf(true));
    // }

    public FluidState getFluidState(BlockState state)
    {
        return state.getValue(WATERLOGGED) ? Fluids.WATER.getSource(false) : super.getFluidState(state);
    }
}
