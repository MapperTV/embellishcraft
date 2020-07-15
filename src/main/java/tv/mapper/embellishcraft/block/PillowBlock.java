package tv.mapper.embellishcraft.block;

import java.util.List;

import javax.annotation.Nullable;

import net.minecraft.block.BedBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockRenderType;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.merchant.villager.VillagerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.item.DyeColor;
import net.minecraft.item.ItemStack;
import net.minecraft.pathfinding.PathType;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BedPart;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.DamageSource;
import net.minecraft.util.Direction;
import net.minecraft.util.Hand;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.Explosion;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IExplosionContext;
import net.minecraft.world.IWorld;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;

public class PillowBlock extends BedBlock
{
    public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;

    private static final VoxelShape SHAPE = Block.makeCuboidShape(2.0D, 0.0D, 4.0D, 14.0D, 3.0D, 12.0D);
    private static final VoxelShape SHAPE_90 = Block.makeCuboidShape(4.0D, 0.0D, 2.0D, 12.0D, 3.0D, 14.0D);

    public PillowBlock(DyeColor color, Properties properties)
    {
        super(color, properties);
        this.setDefaultState(this.stateContainer.getBaseState().with(PART, BedPart.FOOT).with(HORIZONTAL_FACING, Direction.NORTH).with(OCCUPIED, Boolean.valueOf(false)).with(WATERLOGGED, false));
    }

    @Override
    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context)
    {
        switch((Direction)state.get(HORIZONTAL_FACING))
        {
            case NORTH:
            case SOUTH:
            default:
                return SHAPE;
            case EAST:
            case WEST:
                return SHAPE_90;
        }
    }

    @Override
    public VoxelShape getCollisionShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context)
    {
        return VoxelShapes.empty();
    }

    @Override
    public boolean isValidPosition(BlockState state, IWorldReader worldIn, BlockPos pos)
    {
        return hasEnoughSolidSide(worldIn, pos.down(), Direction.UP);
    }

    @Override
    public void onBlockPlacedBy(World worldIn, BlockPos pos, BlockState state, @Nullable LivingEntity placer, ItemStack stack)
    {}

    public ActionResultType onBlockActivated(BlockState state, World worldIn, BlockPos pos, PlayerEntity player, Hand handIn, BlockRayTraceResult hit)
    {
        if(worldIn.isRemote)
        {
            return ActionResultType.CONSUME;
        }
        else
        {
            // if(state.get(PART) != BedPart.HEAD)
            // {
            // pos = pos.offset(state.get(HORIZONTAL_FACING));
            // state = worldIn.getBlockState(pos);
            // if(!state.isIn(this))
            // {
            // return ActionResultType.CONSUME;
            // }
            // }

            if(!func_235330_a_(worldIn))
            {
                worldIn.removeBlock(pos, false);
                // BlockPos blockpos = pos.offset(state.get(HORIZONTAL_FACING).getOpposite());
                // if(worldIn.getBlockState(blockpos).isIn(this))
                // {
                // worldIn.removeBlock(blockpos, false);
                // }

                worldIn.func_230546_a_((Entity)null, DamageSource.func_233546_a_(), (IExplosionContext)null, (double)pos.getX() + 0.5D, (double)pos.getY() + 0.5D, (double)pos.getZ() + 0.5D, 5.0F, true,
                    Explosion.Mode.DESTROY);
                return ActionResultType.SUCCESS;
            }
            else if(state.get(OCCUPIED))
            {
                if(!this.func_226861_a_(worldIn, pos))
                {
                    player.sendStatusMessage(new TranslationTextComponent("block.minecraft.bed.occupied"), true);
                }

                return ActionResultType.SUCCESS;
            }
            else
            {
                player.trySleep(pos).ifLeft((p_220173_1_) ->
                {
                    if(p_220173_1_ != null)
                    {
                        player.sendStatusMessage(p_220173_1_.getMessage(), true);
                    }

                });
                return ActionResultType.SUCCESS;
            }
        }
    }

    private boolean func_226861_a_(World p_226861_1_, BlockPos p_226861_2_)
    {
        List<VillagerEntity> list = p_226861_1_.getEntitiesWithinAABB(VillagerEntity.class, new AxisAlignedBB(p_226861_2_), LivingEntity::isSleeping);
        if(list.isEmpty())
        {
            return false;
        }
        else
        {
            list.get(0).wakeUp();
            return true;
        }
    }
    //
    // @Override
    // public ActionResultType onBlockActivated(BlockState state, World worldIn, BlockPos pos, PlayerEntity player, Hand handIn, BlockRayTraceResult hit)
    // {
    // if(worldIn.isRemote)
    // {
    // return ActionResultType.SUCCESS;
    // }
    //
    // if(state.get(WATERLOGGED))
    // {
    // player.sendStatusMessage(new TranslationTextComponent("embellishcraft.message.bed.underwater"), true);
    // return ActionResultType.SUCCESS;
    // }
    // else
    // {
    //
    // IForgeDimension.SleepResult sleepResult = worldIn.dimension.canSleepAt(player, pos);
    //
    // if(sleepResult != IForgeDimension.SleepResult.BED_EXPLODES)
    // {
    // if(sleepResult == IForgeDimension.SleepResult.DENY)
    // return ActionResultType.SUCCESS;
    // if(state.get(OCCUPIED))
    // {
    // player.sendStatusMessage(new TranslationTextComponent("block.minecraft.bed.occupied"), true);
    // return ActionResultType.SUCCESS;
    // }
    // else
    // {
    // player.trySleep(pos).ifLeft((p_220173_1_) ->
    // {
    // if(p_220173_1_ != null)
    // {
    // player.sendStatusMessage(p_220173_1_.getMessage(), true);
    // }
    //
    // });
    // return ActionResultType.SUCCESS;
    // }
    // }
    // else
    // {
    // worldIn.removeBlock(pos, false);
    // worldIn.createExplosion((Entity)null, DamageSource.netherBedExplosion(), (double)pos.getX() + 0.5D, (double)pos.getY() + 0.5D, (double)pos.getZ() + 0.5D, 5.0F, true, Explosion.Mode.DESTROY);
    // return ActionResultType.SUCCESS;
    // }
    // }
    // }

    // @Override
    // public BlockRenderLayer getRenderLayer()
    // {
    // return BlockRenderLayer.SOLID;
    // }

    @Override
    public BlockRenderType getRenderType(BlockState state)
    {
        return BlockRenderType.MODEL;
    }

    @Override
    public TileEntity createNewTileEntity(IBlockReader worldIn)
    {
        return null;
    }

    @Override
    public BlockState updatePostPlacement(BlockState stateIn, Direction facing, BlockState facingState, IWorld worldIn, BlockPos currentPos, BlockPos facingPos)
    {
        if(stateIn.get(WATERLOGGED))
        {
            worldIn.getPendingFluidTicks().scheduleTick(currentPos, Fluids.WATER, Fluids.WATER.getTickRate(worldIn));
        }

        if(facing == Direction.DOWN && !this.isValidPosition(stateIn, worldIn, currentPos))
            return Blocks.AIR.getDefaultState();

        return stateIn;
    }

    @Override
    public BlockState getStateForPlacement(BlockItemUseContext context)
    {
        BlockPos blockpos = context.getPos();
        FluidState ifluidstate = context.getWorld().getFluidState(blockpos);

        return this.getDefaultState().with(HORIZONTAL_FACING, context.getPlacementHorizontalFacing()).with(PART, BedPart.HEAD).with(WATERLOGGED,
            Boolean.valueOf(Boolean.valueOf(ifluidstate.getFluid() == Fluids.WATER)));
    }

    @Override
    public void onBlockHarvested(World worldIn, BlockPos pos, BlockState state, PlayerEntity player)
    {
        worldIn.playEvent(player, 2001, pos, getStateId(state));
    }

    @Override
    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder)
    {
        builder.add(HORIZONTAL_FACING, PART, OCCUPIED, WATERLOGGED);
    }

    @SuppressWarnings("deprecation")
    public FluidState getFluidState(BlockState state)
    {
        return state.get(WATERLOGGED) ? Fluids.WATER.getStillFluidState(false) : super.getFluidState(state);
    }

    @Override
    public boolean allowsMovement(BlockState state, IBlockReader worldIn, BlockPos pos, PathType type)
    {
        return true;
    }
}