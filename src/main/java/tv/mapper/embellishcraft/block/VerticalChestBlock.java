package tv.mapper.embellishcraft.block;

import java.util.UUID;

import javax.annotation.Nullable;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.CompoundContainer;
import net.minecraft.world.Container;
import net.minecraft.world.Containers;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.BaseEntityBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.SimpleWaterloggedBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.level.pathfinder.PathComputationType;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import tv.mapper.embellishcraft.EmbellishCraft;
import tv.mapper.embellishcraft.inventory.container.VerticalChestContainer;
import tv.mapper.embellishcraft.network.ECNetwork;
import tv.mapper.embellishcraft.network.LockerLockPacket;
import tv.mapper.embellishcraft.network.LockerUUIDPacket;
import tv.mapper.embellishcraft.state.properties.VerticalChestType;
import tv.mapper.embellishcraft.tileentity.VerticalChestTileEntity;
import tv.mapper.mapperbase.world.level.block.ToolManager;
import tv.mapper.mapperbase.world.level.block.ToolTiers;
import tv.mapper.mapperbase.world.level.block.ToolTypes;

public class VerticalChestBlock extends BaseEntityBlock implements SimpleWaterloggedBlock, ToolManager
{
    public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;
    public static final EnumProperty<VerticalChestType> TYPE = EnumProperty.create("type", VerticalChestType.class);
    public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;
    protected static final VoxelShape SHAPE_NORTH = Block.box(0.0D, 0.0D, 1.0D, 16.0D, 16.0D, 16.0D);
    protected static final VoxelShape SHAPE_SOUTH = Block.box(0.0D, 0.0D, 0.0D, 16.0D, 16.0D, 15.0D);
    protected static final VoxelShape SHAPE_WEST = Block.box(1.0D, 0.0D, 0.0D, 16.0D, 16.0D, 16.0D);
    protected static final VoxelShape SHAPE_EAST = Block.box(0.0D, 0.0D, 0.0D, 15.0D, 16.0D, 16.0D);
    protected ToolTiers tier;
    protected ToolTypes tool;

    private static final VerticalChestBlock.InventoryFactory<Container> CHEST_COMBINER = new VerticalChestBlock.InventoryFactory<Container>()
    {
        public Container forDouble(VerticalChestTileEntity p_212855_1_, VerticalChestTileEntity p_212855_2_)
        {
            return new CompoundContainer(p_212855_1_, p_212855_2_);
        }

        public Container forSingle(VerticalChestTileEntity p_212856_1_)
        {
            return p_212856_1_;
        }
    };
    private static final VerticalChestBlock.InventoryFactory<MenuProvider> MENU_PROVIDER_COMBINER = new VerticalChestBlock.InventoryFactory<MenuProvider>()
    {
        public MenuProvider forDouble(final VerticalChestTileEntity p_212855_1_, final VerticalChestTileEntity p_212855_2_)
        {
            final Container iinventory = new CompoundContainer(p_212855_1_, p_212855_2_);
            return new MenuProvider()
            {
                @Nullable
                public AbstractContainerMenu createMenu(int p_createMenu_1_, Inventory p_createMenu_2_, Player p_createMenu_3_)
                {
                    if(p_212855_1_.canOpen(p_createMenu_3_) && p_212855_2_.canOpen(p_createMenu_3_))
                    {
                        p_212855_1_.unpackLootTable(p_createMenu_2_.player);
                        p_212855_2_.unpackLootTable(p_createMenu_2_.player);
                        return VerticalChestContainer.createGeneric9X6(p_createMenu_1_, p_createMenu_2_, iinventory);
                    }
                    else
                    {
                        return null;
                    }
                }

                public Component getDisplayName()
                {
                    if(p_212855_1_.hasCustomName())
                    {
                        return p_212855_1_.getDisplayName();
                    }
                    else
                    {
                        return (Component)(p_212855_2_.hasCustomName() ? p_212855_2_.getDisplayName() : new TranslatableComponent("embellishcraft.container.locker_tall"));
                    }
                }
            };
        }

        public MenuProvider forSingle(VerticalChestTileEntity p_212856_1_)
        {
            return p_212856_1_;
        }
    };

    public VerticalChestBlock(Block.Properties properties)
    {
        super(properties);
        this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH).setValue(TYPE, VerticalChestType.SINGLE).setValue(WATERLOGGED, Boolean.valueOf(false)));
    }

    /**
     * @deprecated call via {@link IBlockState#hasCustomBreakingProgress()} whenever possible. Implementing/overriding is
     *             fine.
     */
    @OnlyIn(Dist.CLIENT)
    public boolean hasCustomBreakingProgress(BlockState state)
    {
        return true;
    }

    /**
     * The type of render function called. MODEL for mixed tesr and static model, MODELBLOCK_ANIMATED for TESR-only,
     * LIQUID for vanilla liquids, INVISIBLE to skip all rendering
     * 
     * @deprecated call via {@link IBlockState#getRenderType()} whenever possible. Implementing/overriding is fine.
     */
    // public BlockRenderType getRenderType(BlockState state)
    // {
    // return BlockRenderType.ENTITYBLOCK_ANIMATED;
    // }

    @Override
    public RenderShape getRenderShape(BlockState state)
    {
        return RenderShape.MODEL;
    }

    /**
     * Update the provided state given the provided neighbor facing and neighbor state, returning a new state.
     * For example, fences make their connections to the passed in state if possible, and wet concrete powder immediately
     * returns its solidified counterpart.
     * Note that this method should ideally consider only the specific face passed in.
     */
    @SuppressWarnings("deprecation")
    public BlockState updateShape(BlockState stateIn, Direction facing, BlockState facingState, LevelAccessor world, BlockPos currentPos, BlockPos facingPos)
    {
        if(stateIn.getValue(WATERLOGGED))
            world.getLiquidTicks().scheduleTick(currentPos, Fluids.WATER, Fluids.WATER.getTickDelay(world));

        if(facingState.getBlock() == this && facing.getAxis().isVertical())
        {
            VerticalChestType chesttype = facingState.getValue(TYPE);
            if(stateIn.getValue(TYPE) == VerticalChestType.SINGLE && chesttype != VerticalChestType.SINGLE && stateIn.getValue(FACING) == facingState.getValue(FACING) && getDirectionToAttached(facingState) == facing.getOpposite())
            {
                BlockEntity Te = world.getBlockEntity(facingPos);
                BlockEntity attachedTe = world.getBlockEntity(currentPos);
                if(attachedTe instanceof VerticalChestTileEntity)
                    if(((VerticalChestTileEntity)attachedTe).isLocked() && !world.isClientSide())
                        ((VerticalChestTileEntity)Te).lockIt();
                return stateIn.setValue(TYPE, chesttype.opposite());
            }
        }
        else if(getDirectionToAttached(stateIn) == facing)
            return stateIn.setValue(TYPE, VerticalChestType.SINGLE);

        return super.updateShape(stateIn, facing, facingState, world, currentPos, facingPos);
    }

    public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context)
    {
        switch(state.getValue(FACING))
        {
            case NORTH:
            default:
                return SHAPE_NORTH;
            case SOUTH:
                return SHAPE_SOUTH;
            case WEST:
                return SHAPE_WEST;
            case EAST:
                return SHAPE_EAST;
        }
    }

    /**
     * Returns a facing pointing from the given state to its attached double chest
     */
    public static Direction getDirectionToAttached(BlockState state)
    {
        return state.getValue(TYPE) == VerticalChestType.BOTTOM ? Direction.UP : Direction.DOWN;
    }

    public BlockState getStateForPlacement(BlockPlaceContext context)
    {
        VerticalChestType chesttype = VerticalChestType.SINGLE;
        Direction direction = context.getHorizontalDirection().getOpposite();
        FluidState ifluidstate = context.getLevel().getFluidState(context.getClickedPos());
        boolean flag = context.getPlayer().isShiftKeyDown();
        Direction direction1 = context.getClickedFace();

        if(direction1.getAxis().isVertical() && flag)
        {
            BlockPos attachedPos = context.getClickedPos().relative(direction1.getOpposite());
            BlockState attachedState = context.getLevel().getBlockState(attachedPos);

            if(attachedState.getBlock() == this && attachedState.getValue(FACING) == direction && attachedState.getValue(TYPE) == VerticalChestType.SINGLE)
            {
                BlockEntity attachedTe = context.getLevel().getBlockEntity(attachedPos);

                if(attachedTe instanceof VerticalChestTileEntity)
                {
                    if(((VerticalChestTileEntity)attachedTe).hasUUID())
                    {
                        UUID id = ((VerticalChestTileEntity)attachedTe).getUUID();
                        if(!id.equals(context.getPlayer().getUUID()))
                            chesttype = VerticalChestType.SINGLE;
                        else
                        {
                            switch(context.getClickedFace())
                            {
                                case DOWN:
                                    chesttype = VerticalChestType.BOTTOM;
                                    break;
                                case UP:
                                    chesttype = VerticalChestType.TOP;
                                    break;
                                default:
                                    chesttype = VerticalChestType.SINGLE;
                                    break;
                            }
                        }
                    }
                }
            }
        }

        if(chesttype == VerticalChestType.SINGLE && !flag)
        {
            BlockPos pos = context.getClickedPos();
            BlockState stateUp = context.getLevel().getBlockState(pos.above());
            BlockState stateDown = context.getLevel().getBlockState(pos.below());

            if(stateUp.getBlock() == this && stateUp.getValue(FACING) == direction)
            {
                if(stateUp.getValue(TYPE) == VerticalChestType.SINGLE)
                {
                    BlockEntity te = context.getLevel().getBlockEntity(pos.above());
                    if(te instanceof VerticalChestTileEntity)
                    {
                        if(((VerticalChestTileEntity)te).hasUUID())
                        {
                            UUID id = ((VerticalChestTileEntity)te).getUUID();
                            if(!id.equals(context.getPlayer().getUUID()))
                                chesttype = VerticalChestType.SINGLE;
                            else
                                chesttype = VerticalChestType.BOTTOM;
                        }
                    }
                }
            }
            else if(stateDown.getBlock() == this && stateDown.getValue(FACING) == direction)
            {
                if(stateDown.getValue(TYPE) == VerticalChestType.SINGLE)
                {
                    BlockEntity te = context.getLevel().getBlockEntity(pos.below());
                    if(te instanceof VerticalChestTileEntity)
                    {
                        if(((VerticalChestTileEntity)te).hasUUID())
                        {
                            UUID id = ((VerticalChestTileEntity)te).getUUID();
                            if(!id.equals(context.getPlayer().getUUID()))
                                chesttype = VerticalChestType.SINGLE;
                            else
                                chesttype = VerticalChestType.TOP;
                        }
                    }
                }
            }
            else
                chesttype = VerticalChestType.SINGLE;
        }

        return this.defaultBlockState().setValue(FACING, direction).setValue(TYPE, chesttype).setValue(WATERLOGGED, Boolean.valueOf(ifluidstate.getType() == Fluids.WATER));
    }

    @SuppressWarnings("deprecation")
    public FluidState getFluidState(BlockState state)
    {
        return state.getValue(WATERLOGGED) ? Fluids.WATER.getSource(false) : super.getFluidState(state);
    }

    /**
     * Called by ItemBlocks after a block is set in the world, to allow post-place logic
     */
    public void setPlacedBy(Level world, BlockPos pos, BlockState state, LivingEntity placer, ItemStack stack)
    {
        BlockEntity tileentity = world.getBlockEntity(pos);
        if(tileentity instanceof VerticalChestTileEntity)
        {
            if(world.isClientSide)
                ECNetwork.EMBELLISHCRAFT_CHANNEL.sendToServer(new LockerUUIDPacket(pos));
            if(stack.hasCustomHoverName())
                ((VerticalChestTileEntity)tileentity).setCustomName(stack.getHoverName());
        }
    }

    @SuppressWarnings("deprecation")
    public void onRemove(BlockState state, Level world, BlockPos pos, BlockState newState, boolean isMoving)
    {
        if(state.getBlock() != newState.getBlock())
        {
            BlockEntity tileentity = world.getBlockEntity(pos);
            if(tileentity instanceof Container)
            {
                Containers.dropContents(world, pos, (Container)tileentity);
                world.updateNeighbourForOutputSignal(pos, this);
            }

            super.onRemove(state, world, pos, newState, isMoving);
        }
    }

    public InteractionResult use(BlockState state, Level world, BlockPos pos, Player player, InteractionHand handIn, BlockHitResult hit)
    {
        BlockEntity te = world.getBlockEntity(pos);

        if(te instanceof VerticalChestTileEntity)
        {
            // Debug
            if(player.getItemInHand(handIn).getItem() == Items.DEBUG_STICK && !world.isClientSide)
            {
                EmbellishCraft.LOGGER.debug("This locker belongs to: " + ((VerticalChestTileEntity)te).getUUID() + " and locked is " + ((VerticalChestTileEntity)te).isLocked());
                return InteractionResult.SUCCESS;
            }
            else
            {
                // Lock it if it's yours!
                if(player.isShiftKeyDown())
                {
                    if(world.isClientSide)
                        ECNetwork.EMBELLISHCRAFT_CHANNEL.sendToServer(new LockerLockPacket(pos));

                    if(!world.isClientSide)
                    {
                        if(player.getUUID().equals(((VerticalChestTileEntity)te).getUUID()))
                        {
                            if(((VerticalChestTileEntity)te).isLocked())
                                player.displayClientMessage(new TranslatableComponent("embellishcraft.message.locker.lock"), true);
                            else
                                player.displayClientMessage(new TranslatableComponent("embellishcraft.message.locker.unlock"), true);
                        }
                        else
                            player.displayClientMessage(new TranslatableComponent("embellishcraft.message.locker.wrong"), true);
                    }

                    // Also lock other TE if tall locker
                    BlockPos otherPos = null;
                    switch(state.getValue(TYPE))
                    {
                        case BOTTOM:
                            otherPos = pos.above();
                            break;
                        case TOP:
                            otherPos = pos.below();
                            break;
                        case SINGLE:
                        default:
                            break;
                    }

                    if(otherPos != null)
                    {
                        BlockEntity otherTe = world.getBlockEntity(otherPos);

                        if(otherTe instanceof VerticalChestTileEntity)
                        {
                            if(((VerticalChestTileEntity)otherTe).hasUUID())
                            {
                                if(!world.isClientSide && ((VerticalChestTileEntity)otherTe).getUUID().equals(player.getUUID()))
                                    ((VerticalChestTileEntity)otherTe).lockIt();
                            }
                        }
                    }
                    return InteractionResult.SUCCESS;
                }
                // Open it if you can!
                else
                {
                    MenuProvider inamedcontainerprovider = this.getMenuProvider(state, world, pos);

                    if(inamedcontainerprovider != null)
                    {
                        UUID id = ((VerticalChestTileEntity)te).getUUID();

                        if(id != null)
                        {
                            if(id.equals(player.getUUID()))
                            {
                                player.openMenu(inamedcontainerprovider);
                            }
                            else if(!((VerticalChestTileEntity)te).isLocked())
                            {
                                player.openMenu(inamedcontainerprovider);
                            }
                            else if(!world.isClientSide)
                                player.displayClientMessage(new TranslatableComponent("embellishcraft.message.locker.locked"), true);
                        }
                    }
                }
            }
        }
        return InteractionResult.SUCCESS;
    }

    @Nullable
    public static <T> T getChestInventory(BlockState state, LevelAccessor world, BlockPos pos, boolean allowBlocked, VerticalChestBlock.InventoryFactory<T> inv)
    {
        BlockEntity tileentity = world.getBlockEntity(pos);
        if(!(tileentity instanceof VerticalChestTileEntity))
        {
            return (T)null;
        }
        else if(!allowBlocked && isBlocked(world, pos))
        {
            return (T)null;
        }
        else
        {
            VerticalChestTileEntity chesttileentity = (VerticalChestTileEntity)tileentity;
            VerticalChestType chesttype = state.getValue(TYPE);
            if(chesttype == VerticalChestType.SINGLE)
            {
                return inv.forSingle(chesttileentity);
            }
            else
            {
                BlockPos blockpos = pos.relative(getDirectionToAttached(state));
                BlockState blockstate = world.getBlockState(blockpos);
                if(blockstate.getBlock() == state.getBlock())
                {
                    VerticalChestType chesttype1 = blockstate.getValue(TYPE);
                    if(chesttype1 != VerticalChestType.SINGLE && chesttype != chesttype1 && blockstate.getValue(FACING) == state.getValue(FACING))
                    {
                        if(!allowBlocked && isBlocked(world, blockpos))
                        {
                            return (T)null;
                        }

                        BlockEntity tileentity1 = world.getBlockEntity(blockpos);
                        if(tileentity1 instanceof VerticalChestTileEntity)
                        {
                            VerticalChestTileEntity chesttileentity1 = chesttype == VerticalChestType.TOP ? chesttileentity : (VerticalChestTileEntity)tileentity1;
                            VerticalChestTileEntity chesttileentity2 = chesttype == VerticalChestType.TOP ? (VerticalChestTileEntity)tileentity1 : chesttileentity;
                            return inv.forDouble(chesttileentity1, chesttileentity2);
                        }
                    }
                }

                return inv.forSingle(chesttileentity);
            }
        }
    }

    @Nullable
    public static Container getInventory(BlockState state, Level world, BlockPos pos, boolean allowBlocked)
    {
        return getChestInventory(state, world, pos, allowBlocked, CHEST_COMBINER);
    }

    @Nullable
    public MenuProvider getMenuProvider(BlockState state, Level world, BlockPos pos)
    {
        return getChestInventory(state, world, pos, false, MENU_PROVIDER_COMBINER);
    }

    @Override
    public BlockEntity newBlockEntity(BlockPos p_153215_, BlockState p_153216_)
    {
        return new VerticalChestTileEntity(p_153215_, p_153216_);
    }

    private static boolean isBlocked(LevelAccessor world, BlockPos pos)
    {
        return isFacingSolidBlock(world, pos);
    }

    private static boolean isFacingSolidBlock(BlockGetter block, BlockPos world)
    {
        BlockPos blockpos;

        switch(block.getBlockState(world).getValue(FACING))
        {
            case EAST:
                blockpos = world.east();
                break;
            case NORTH:
                blockpos = world.north();
                break;
            case SOUTH:
                blockpos = world.south();
                break;
            case WEST:
                blockpos = world.west();
                break;
            default:
                blockpos = null;
                break;
        }

        if(blockpos == null)
            return false;
        return block.getBlockState(blockpos).isRedstoneConductor(block, blockpos);
    }

    /**
     * @deprecated call via {@link IBlockState#hasComparatorInputOverride()} whenever possible. Implementing/overriding
     *             is fine.
     */
    public boolean hasAnalogOutputSignal(BlockState state)
    {
        return true;
    }

    /**
     * @deprecated call via {@link IBlockState#getComparatorInputOverride(World,BlockPos)} whenever possible.
     *             Implementing/overriding is fine.
     */
    public int getAnalogOutputSignal(BlockState blockState, Level world, BlockPos pos)
    {
        return AbstractContainerMenu.getRedstoneSignalFromContainer(getInventory(blockState, world, pos, false));
    }

    /**
     * Returns the blockstate with the given rotation from the passed blockstate. If inapplicable, returns the passed
     * blockstate.
     * 
     * @deprecated call via {@link IBlockState#withRotation(Rotation)} whenever possible. Implementing/overriding is
     *             fine.
     */
    public BlockState rotate(BlockState state, Rotation rot)
    {
        return state.setValue(FACING, rot.rotate(state.getValue(FACING)));
    }

    /**
     * Returns the blockstate with the given mirror of the passed blockstate. If inapplicable, returns the passed
     * blockstate.
     * 
     * @deprecated call via {@link IBlockState#withMirror(Mirror)} whenever possible. Implementing/overriding is fine.
     */
    public BlockState mirror(BlockState state, Mirror mirrorIn)
    {
        return state.rotate(mirrorIn.getRotation(state.getValue(FACING)));
    }

    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder)
    {
        builder.add(FACING, TYPE, WATERLOGGED);
    }

    public boolean isPathfindable(BlockState state, BlockGetter world, BlockPos pos, PathComputationType type)
    {
        return false;
    }

    interface InventoryFactory<T>
    {
        T forDouble(VerticalChestTileEntity p_212855_1_, VerticalChestTileEntity p_212855_2_);

        T forSingle(VerticalChestTileEntity p_212856_1_);
    }

    @Override
    public ToolTiers getTier()
    {
        return this.tier;
    }

    @Override
    public ToolTypes getTool()
    {
        return this.tool;
    }
}