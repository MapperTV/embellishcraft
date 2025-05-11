package tv.mapper.embellishcraft.industrial.block;

import javax.annotation.Nullable;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import tv.mapper.mapperbase.api.block.CustomBlock;
import tv.mapper.mapperbase.api.block.tools.ToolTiers;
import tv.mapper.mapperbase.api.block.tools.ToolTypes;

public class CatwalkBlock extends CustomBlock
{
    public static final BooleanProperty IS_UP = BooleanProperty.create("is_up");
    public static final BooleanProperty GUARDRAIL_NORTH = BooleanProperty.create("guardrail_north");
    public static final BooleanProperty GUARDRAIL_SOUTH = BooleanProperty.create("guardrail_south");
    public static final BooleanProperty GUARDRAIL_EAST = BooleanProperty.create("guardrail_east");
    public static final BooleanProperty GUARDRAIL_WEST = BooleanProperty.create("guardrail_west");
    public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;

    public CatwalkBlock(Properties properties, ToolTypes tool)
    {
        super(properties, tool);
        registerDefaultState(stateDefinition.any().setValue(IS_UP, true).setValue(GUARDRAIL_NORTH, false).setValue(GUARDRAIL_SOUTH, false).setValue(GUARDRAIL_EAST, false).setValue(GUARDRAIL_WEST, false).setValue(WATERLOGGED, Boolean.valueOf(false)));
    }

    public CatwalkBlock(Properties properties, ToolTypes tool, ToolTiers tier)
    {
        super(properties, tool, tier);
        registerDefaultState(stateDefinition.any().setValue(IS_UP, true).setValue(GUARDRAIL_NORTH, false).setValue(GUARDRAIL_SOUTH, false).setValue(GUARDRAIL_EAST, false).setValue(GUARDRAIL_WEST, false).setValue(WATERLOGGED, Boolean.valueOf(false)));
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> pBuilder)
    {
        // this is where the properties are actually added to the state
        pBuilder.add(IS_UP, GUARDRAIL_NORTH, GUARDRAIL_EAST, GUARDRAIL_SOUTH, GUARDRAIL_WEST, WATERLOGGED);
    }

    @Override
    @Nullable
    public BlockState getStateForPlacement(BlockPlaceContext context)
    {
        BlockPos blockpos = context.getClickedPos();
        FluidState fluidstate = context.getLevel().getFluidState(context.getClickedPos());
        BlockState state = this.defaultBlockState().setValue(IS_UP, false).setValue(WATERLOGGED, Boolean.valueOf(fluidstate.getType() == Fluids.WATER));
        Direction facing = context.getClickedFace();
        return facing != Direction.DOWN && (facing == Direction.UP || !(context.getClickLocation().y - (double)blockpos.getY() > 0.5D)) ? state : state.setValue(IS_UP, Boolean.valueOf(true));
    }
}
