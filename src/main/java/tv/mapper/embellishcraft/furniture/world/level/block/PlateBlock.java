package tv.mapper.embellishcraft.furniture.world.level.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SimpleWaterloggedBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import tv.mapper.embellishcraft.furniture.world.item.InitFurnitureItems;
import tv.mapper.mapperbase.world.level.block.CustomBlock;
import tv.mapper.mapperbase.world.level.block.ToolTiers;
import tv.mapper.mapperbase.world.level.block.ToolTypes;

public class PlateBlock extends CustomBlock implements SimpleWaterloggedBlock
{
    public static final IntegerProperty PLATES = IntegerProperty.create("plates", 1, 8);
    public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;

    VoxelShape plate_1 = Block.box(2.0D, 0.0D, 2.0D, 14.0D, 2.0D, 14.0D);
    VoxelShape plate_2 = Block.box(2.0D, 0.0D, 2.0D, 14.0D, 4.0D, 14.0D);
    VoxelShape plate_3 = Block.box(2.0D, 0.0D, 2.0D, 14.0D, 6.0D, 14.0D);
    VoxelShape plate_4 = Block.box(2.0D, 0.0D, 2.0D, 14.0D, 8.0D, 14.0D);
    VoxelShape plate_5 = Block.box(2.0D, 0.0D, 2.0D, 14.0D, 10.0D, 14.0D);
    VoxelShape plate_6 = Block.box(2.0D, 0.0D, 2.0D, 14.0D, 12.0D, 14.0D);
    VoxelShape plate_7 = Block.box(2.0D, 0.0D, 2.0D, 14.0D, 14.0D, 14.0D);
    VoxelShape plate_8 = Block.box(2.0D, 0.0D, 2.0D, 14.0D, 16.0D, 14.0D);

    public PlateBlock(Properties properties, ToolTypes tool)
    {
        super(properties, tool);
        this.registerDefaultState(this.stateDefinition.any().setValue(PLATES, 1).setValue(WATERLOGGED, Boolean.valueOf(false)));
    }

    public PlateBlock(Properties properties, ToolTypes tool, ToolTiers tier)
    {
        super(properties, tool, tier);
        this.registerDefaultState(this.stateDefinition.any().setValue(PLATES, 1).setValue(WATERLOGGED, Boolean.valueOf(false)));
    }

    public VoxelShape getShape(BlockState state, BlockGetter worldIn, BlockPos pos, CollisionContext context)
    {
        switch(state.getValue(PLATES))
        {
            case 1:
                return plate_1;
            case 2:
                return plate_2;
            case 3:
                return plate_3;
            case 4:
                return plate_4;
            case 5:
                return plate_5;
            case 6:
                return plate_6;
            case 7:
                return plate_7;
            case 8:
                return plate_8;
            default:
                return plate_1;
        }
    }

    @Override
    public InteractionResult use(BlockState state, Level worldIn, BlockPos pos, Player player, InteractionHand handIn, BlockHitResult hit)
    {
        if(!player.isShiftKeyDown() && state.getValue(PLATES) < 8)
        {
            ItemStack stack = ItemStack.EMPTY;
            if(player.getMainHandItem().getItem() == InitFurnitureItems.PLATE_ITEM.get())
                stack = player.getMainHandItem();
            else if(player.getOffhandItem().getItem() == InitFurnitureItems.PLATE_ITEM.get())
                stack = player.getOffhandItem();

            if(stack.getItem() == InitFurnitureItems.PLATE_ITEM.get())
            {
                worldIn.setBlockAndUpdate(pos, state.setValue(PLATES, state.getValue(PLATES) + 1));
                if(!worldIn.isClientSide)
                    worldIn.playSound(null, pos, SoundEvents.GLASS_PLACE, SoundSource.BLOCKS, 1.0F, 1.0F);

                if(!player.isCreative())
                    stack.setCount(stack.getCount() - 1);
                return InteractionResult.SUCCESS;
            }

        }
        return InteractionResult.FAIL;
    }

    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder)
    {
        builder.add(PLATES, WATERLOGGED);
    }

    public boolean canSurvive(BlockState state, LevelReader worldIn, BlockPos pos)
    {
        BlockPos blockpos = pos.below();
        BlockState blockstate = worldIn.getBlockState(blockpos);
        if(blockstate.getBlock() instanceof PlateBlock && blockstate.getValue(PLATES) == 8)
            return true;
        else
            return canSupportCenter(worldIn, pos.below(), Direction.UP);
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

    @SuppressWarnings("deprecation")
    public FluidState getFluidState(BlockState state)
    {
        return state.getValue(WATERLOGGED) ? Fluids.WATER.getSource(false) : super.getFluidState(state);
    }
}