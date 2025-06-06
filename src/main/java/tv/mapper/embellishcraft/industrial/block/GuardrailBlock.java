package tv.mapper.embellishcraft.industrial.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import tv.mapper.mapperbase.api.block.CustomBlock;
import tv.mapper.mapperbase.api.block.tools.ToolTiers;
import tv.mapper.mapperbase.api.block.tools.ToolTypes;

public class GuardrailBlock extends CustomBlock
{
    // STATES

    public static final BooleanProperty GUARDRAIL_NORTH = BooleanProperty.create("guardrail_north");
    public static final BooleanProperty GUARDRAIL_SOUTH = BooleanProperty.create("guardrail_south");
    public static final BooleanProperty GUARDRAIL_EAST = BooleanProperty.create("guardrail_east");
    public static final BooleanProperty GUARDRAIL_WEST = BooleanProperty.create("guardrail_west");

    public static final BooleanProperty CORNER_NW = BooleanProperty.create("corner_nw");
    public static final BooleanProperty CORNER_SW = BooleanProperty.create("corner_sw");
    public static final BooleanProperty CORNER_SE = BooleanProperty.create("corner_se");
    public static final BooleanProperty CORNER_NE = BooleanProperty.create("corner_ne");

    public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;

    // SHAPES

    protected static final VoxelShape guardrail_north = Block.box(2.0D, 0.0D, 0.0D, 14.0D, 16.0D, 2.0D);
    protected static final VoxelShape guardrail_south = Block.box(2.0D, 0.0D, 14.0D, 14.0D, 16.0D, 16.0D);
    protected static final VoxelShape guardrail_east = Block.box(14.0D, 0.0D, 2.0D, 16.0D, 16.0D, 14.0D);
    protected static final VoxelShape guardrail_west = Block.box(0.0D, 0.0D, 2.0D, 2.0D, 16.0D, 14.0D);
    protected static final VoxelShape corner_nw = Block.box(0.0D, 0.0D, 0.0D, 2.0D, 16.0D, 2.0D);
    protected static final VoxelShape corner_sw = Block.box(0.0D, 0.0D, 14.0D, 2.0D, 16.0D, 16.0D);
    protected static final VoxelShape corner_se = Block.box(14.0D, 0.0D, 14.0D, 16.0D, 16.0D, 16.0D);
    protected static final VoxelShape corner_ne = Block.box(14.0D, 0.0D, 0.0D, 16.0D, 16.0D, 2.0D);

    public GuardrailBlock(Properties properties, ToolTypes tool)
    {
        super(properties, tool);
        this.registerDefaultState(this.stateDefinition.any().setValue(GUARDRAIL_NORTH, true).setValue(GUARDRAIL_SOUTH, true).setValue(GUARDRAIL_EAST, true).setValue(GUARDRAIL_WEST, true).setValue(CORNER_NW, true).setValue(CORNER_SW, true).setValue(CORNER_SE, true).setValue(CORNER_NE, true).setValue(WATERLOGGED, Boolean.valueOf(false)));
    }

    public GuardrailBlock(Properties properties, ToolTypes tool, ToolTiers tier)
    {
        super(properties, tool, tier);
        this.registerDefaultState(this.stateDefinition.any().setValue(GUARDRAIL_NORTH, true).setValue(GUARDRAIL_SOUTH, true).setValue(GUARDRAIL_EAST, true).setValue(GUARDRAIL_WEST, true).setValue(CORNER_NW, true).setValue(CORNER_SW, true).setValue(CORNER_SE, true).setValue(CORNER_NE, true).setValue(WATERLOGGED, Boolean.valueOf(false)));
    }

    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder)
    {
        builder.add(GUARDRAIL_NORTH, GUARDRAIL_SOUTH, GUARDRAIL_EAST, GUARDRAIL_WEST, CORNER_NW, CORNER_SW, CORNER_SE, CORNER_NE, WATERLOGGED);
    }

    public VoxelShape getShape(BlockState state, BlockGetter worldIn, BlockPos pos, CollisionContext context)
    {
        VoxelShape shape = Shapes.empty();

        if(state.getValue(GUARDRAIL_NORTH))
            shape = Shapes.or(shape, guardrail_north);
        if(state.getValue(GUARDRAIL_SOUTH))
            shape = Shapes.or(shape, guardrail_south);
        if(state.getValue(GUARDRAIL_EAST))
            shape = Shapes.or(shape, guardrail_east);
        if(state.getValue(GUARDRAIL_WEST))
            shape = Shapes.or(shape, guardrail_west);

        if(state.getValue(CORNER_NW))
            shape = Shapes.or(shape, corner_nw);
        if(state.getValue(CORNER_SW))
            shape = Shapes.or(shape, corner_sw);
        if(state.getValue(CORNER_SE))
            shape = Shapes.or(shape, corner_se);
        if(state.getValue(CORNER_NE))
            shape = Shapes.or(shape, corner_ne);

        return shape;
    }

    public BlockState getStateForPlacement(BlockPlaceContext context)
    {
        boolean north = false;
        boolean south = false;
        boolean east = false;
        boolean west = false;
        boolean corner_nw = false;
        boolean corner_sw = false;
        boolean corner_se = false;
        boolean corner_ne = false;

        switch(context.getHorizontalDirection())
        {
            default:
            case Direction.NORTH:
                north = true;
                break;
            case Direction.SOUTH:
                south = true;
                break;
            case Direction.EAST:
                east = true;
                break;
            case Direction.WEST:
                west = true;
                break;
        }

        if(north || west)
            corner_nw = true;
        if(north || east)
            corner_ne = true;
        if(south || west)
            corner_sw = true;
        if(south || east)
            corner_se = true;

        return this.defaultBlockState().setValue(GUARDRAIL_NORTH, north).setValue(GUARDRAIL_SOUTH, south).setValue(GUARDRAIL_EAST, east).setValue(GUARDRAIL_WEST, west).setValue(CORNER_NW, corner_nw).setValue(CORNER_NE, corner_ne).setValue(CORNER_SW, corner_sw).setValue(CORNER_SE, corner_se).setValue(WATERLOGGED, Boolean.valueOf(Boolean.valueOf(context.getLevel().getFluidState(context.getClickedPos()).getType() == Fluids.WATER)));
    }

    // @Override
    // public InteractionResult useWithoutItem(BlockState state, Level worldIn, BlockPos pos, Player player, BlockHitResult hit)
    // {
    // if(player.getMainHandItem().getItem() instanceof GuairdrailItemBlock)
    // {
    // EmbellishCraft.LOGGER.debug("Test: " + hit.distanceTo(player));
    //
    // }

    // if(!player.isShiftKeyDown() && state.getValue(PLATES) < 8)
    // {
    // ItemStack stack = ItemStack.EMPTY;
    // if(player.getMainHandItem().getItem() == InitFurnitureItems.PLATE_ITEM.get())
    // stack = player.getMainHandItem();
    // else if(player.getOffhandItem().getItem() == InitFurnitureItems.PLATE_ITEM.get())
    // stack = player.getOffhandItem();
    //
    // if(stack.getItem() == InitFurnitureItems.PLATE_ITEM.get())
    // {
    // worldIn.setBlockAndUpdate(pos, state.setValue(PLATES, state.getValue(PLATES) + 1));
    // if(!worldIn.isClientSide)
    // worldIn.playSound(null, pos, SoundEvents.GLASS_PLACE, SoundSource.BLOCKS, 1.0F, 1.0F);
    //
    // if(!player.isCreative())
    // stack.setCount(stack.getCount() - 1);
    // return InteractionResult.SUCCESS;
    // }
    //
    // }
    // else if(player.isShiftKeyDown() && state.getValue(PLATES) > 0)
    // {
    // if(state.getValue(PLATES) == 1)
    // worldIn.setBlockAndUpdate(pos, Blocks.AIR.defaultBlockState());
    // else
    // worldIn.setBlockAndUpdate(pos, state.setValue(PLATES, state.getValue(PLATES) - 1));
    //
    // if(!worldIn.isClientSide)
    // worldIn.playSound(null, pos, SoundEvents.ITEM_FRAME_REMOVE_ITEM, SoundSource.BLOCKS, 1.0F, 1.0F);
    //
    // if(!player.isCreative())
    // {
    // ItemStack drop = new ItemStack(InitFurnitureBlocks.PLATE.get());
    // Containers.dropItemStack(worldIn, pos.getX(), pos.getY(), pos.getZ(), drop);
    // }
    // }

    // return InteractionResult.FAIL;
    // }
}
