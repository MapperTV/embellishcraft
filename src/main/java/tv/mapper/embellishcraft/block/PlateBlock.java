package tv.mapper.embellishcraft.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.IWaterLoggable;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.fluid.Fluids;
import net.minecraft.fluid.IFluidState;
import net.minecraft.item.ItemStack;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.IntegerProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Direction;
import net.minecraft.util.Hand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;
import tv.mapper.embellishcraft.item.ECItemRegistry;

public class PlateBlock extends Block implements IWaterLoggable
{
    public static final IntegerProperty PLATES = IntegerProperty.create("plates", 1, 8);
    public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;

    VoxelShape plate_1 = Block.makeCuboidShape(2.0D, 0.0D, 2.0D, 14.0D, 2.0D, 14.0D);
    VoxelShape plate_2 = Block.makeCuboidShape(2.0D, 0.0D, 2.0D, 14.0D, 4.0D, 14.0D);
    VoxelShape plate_3 = Block.makeCuboidShape(2.0D, 0.0D, 2.0D, 14.0D, 6.0D, 14.0D);
    VoxelShape plate_4 = Block.makeCuboidShape(2.0D, 0.0D, 2.0D, 14.0D, 8.0D, 14.0D);
    VoxelShape plate_5 = Block.makeCuboidShape(2.0D, 0.0D, 2.0D, 14.0D, 10.0D, 14.0D);
    VoxelShape plate_6 = Block.makeCuboidShape(2.0D, 0.0D, 2.0D, 14.0D, 12.0D, 14.0D);
    VoxelShape plate_7 = Block.makeCuboidShape(2.0D, 0.0D, 2.0D, 14.0D, 14.0D, 14.0D);
    VoxelShape plate_8 = Block.makeCuboidShape(2.0D, 0.0D, 2.0D, 14.0D, 16.0D, 14.0D);

    public PlateBlock(Properties properties)
    {
        super(properties);
        this.setDefaultState(this.stateContainer.getBaseState().with(PLATES, 1).with(WATERLOGGED, Boolean.valueOf(false)));
    }

    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context)
    {
        switch(state.get(PLATES))
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
    public ActionResultType onBlockActivated(BlockState state, World worldIn, BlockPos pos, PlayerEntity player, Hand handIn, BlockRayTraceResult hit)
    {
        if(!player.isCrouching() && state.get(PLATES) < 8)
        {
            ItemStack stack = ItemStack.EMPTY;
            if(player.getHeldItemMainhand().getItem() == ECItemRegistry.PLATE_ITEM.get())
                stack = player.getHeldItemMainhand();
            else if(player.getHeldItemOffhand().getItem() == ECItemRegistry.PLATE_ITEM.get())
                stack = player.getHeldItemOffhand();

            if(stack.getItem() == ECItemRegistry.PLATE_ITEM.get())
            {
                worldIn.setBlockState(pos, state.with(PLATES, state.get(PLATES) + 1));
                if(!worldIn.isRemote)
                    worldIn.playSound(null, pos, SoundEvents.BLOCK_GLASS_PLACE, SoundCategory.BLOCKS, 1.0F, 1.0F);

                if(!player.isCreative())
                    stack.setCount(stack.getCount() - 1);
                return ActionResultType.SUCCESS;
            }

        }
        return ActionResultType.FAIL;
    }

    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder)
    {
        builder.add(PLATES, WATERLOGGED);
    }

    public boolean isValidPosition(BlockState state, IWorldReader worldIn, BlockPos pos)
    {
        BlockPos blockpos = pos.down();
        BlockState blockstate = worldIn.getBlockState(blockpos);
        if(blockstate.getBlock() instanceof PlateBlock && blockstate.get(PLATES) == 8)
            return true;
        else if(!blockstate.isSolid())
            return false;
        return true;
    }

    @SuppressWarnings("deprecation")
    public BlockState updatePostPlacement(BlockState stateIn, Direction facing, BlockState facingState, IWorld worldIn, BlockPos currentPos, BlockPos facingPos)
    {
        if(stateIn.get(WATERLOGGED))
        {
            worldIn.getPendingFluidTicks().scheduleTick(currentPos, Fluids.WATER, Fluids.WATER.getTickRate(worldIn));
        }

        if(facing == Direction.DOWN && !this.isValidPosition(stateIn, worldIn, currentPos))
            return Blocks.AIR.getDefaultState();

        return super.updatePostPlacement(stateIn, facing, facingState, worldIn, currentPos, facingPos);
    }

    @SuppressWarnings("deprecation")
    public IFluidState getFluidState(BlockState state)
    {
        return state.get(WATERLOGGED) ? Fluids.WATER.getStillFluidState(false) : super.getFluidState(state);
    }
}
