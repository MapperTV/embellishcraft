package tv.mapper.embellishcraft.tileentity;

import java.util.UUID;
import java.util.stream.IntStream;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.NonNullList;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.Mth;
import net.minecraft.world.CompoundContainer;
import net.minecraft.world.Container;
import net.minecraft.world.ContainerHelper;
import net.minecraft.world.WorldlyContainer;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BaseContainerBlockEntity;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.LidBlockEntity;
import net.minecraft.world.level.block.entity.RandomizableContainerBlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.AABB;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.IItemHandlerModifiable;
import net.minecraftforge.items.wrapper.CombinedInvWrapper;
import tv.mapper.embellishcraft.block.VerticalChestBlock;
import tv.mapper.embellishcraft.inventory.container.VerticalChestContainer;
import tv.mapper.embellishcraft.item.wrapper.CustomInvWrapper;
import tv.mapper.embellishcraft.state.properties.VerticalChestType;

@OnlyIn(value = Dist.CLIENT, _interface = LidBlockEntity.class)
public class VerticalChestTileEntity extends RandomizableContainerBlockEntity implements LidBlockEntity, WorldlyContainer
{
    private static final int[] SLOTS = IntStream.range(0, 4 * 4).toArray();
    private NonNullList<ItemStack> chestContents = NonNullList.withSize(27, ItemStack.EMPTY);

    protected float lidAngle;
    protected float prevLidAngle;
    protected int numPlayersUsing;
    private int ticksSinceSync;

    private boolean isLocked = false;
    private UUID userID = null;

    private LazyOptional<IItemHandlerModifiable> chestHandler;

    protected VerticalChestTileEntity(BlockEntityType<?> typeIn, BlockPos p_155328_, BlockState p_155329_)
    {
        super(typeIn, p_155328_, p_155329_);
    }

    public VerticalChestTileEntity(BlockPos p_155328_, BlockState p_155329_)
    {
        this(ModTileEntityTypes.VERTICAL_CHEST, p_155328_, p_155329_);
    }

    /**
     * Returns the number of slots in the inventory.
     */
    public int getContainerSize()
    {
        return 27;
    }

    public boolean isEmpty()
    {
        for(ItemStack itemstack : this.chestContents)
        {
            if(!itemstack.isEmpty())
            {
                return false;
            }
        }
        return true;
    }

    protected Component getDefaultName()
    {
        return new TranslatableComponent("embellishcraft.container.locker");
    }

    public void lockIt()
    {
        if(this.isLocked)
            this.isLocked = false;
        else
            this.isLocked = true;
    }

    public boolean isLocked()
    {
        return this.isLocked;
    }

    public void setUUID(UUID userID)
    {
        this.userID = userID;
    }

    public UUID getUUID()
    {
        return this.userID;
    }

    public boolean hasUUID()
    {
        if(this.userID != null)
            return true;
        return false;
    }

    public void load(BlockState state, CompoundTag compound)
    {
        super.load(compound);

        this.chestContents = NonNullList.withSize(this.getContainerSize(), ItemStack.EMPTY);
        if(!this.tryLoadLootTable(compound))
            ContainerHelper.loadAllItems(compound, this.chestContents);

        if(compound.hasUUID("user_id"))
            this.userID = compound.getUUID("user_id");

        this.isLocked = compound.getBoolean("is_locked");
    }

    public CompoundTag save(CompoundTag compound)
    {
        super.save(compound);
        if(!this.trySaveLootTable(compound))
            ContainerHelper.saveAllItems(compound, this.chestContents);

        if(this.hasUUID())
            compound.putUUID("user_id", this.userID);

        compound.putBoolean("is_locked", this.isLocked);
        return compound;
    }

    public void tick()
    {
        int i = this.worldPosition.getX();
        int j = this.worldPosition.getY();
        int k = this.worldPosition.getZ();
        ++this.ticksSinceSync;
        this.numPlayersUsing = calculatePlayersUsingSync(this.level, this, this.ticksSinceSync, i, j, k, this.numPlayersUsing);
        this.prevLidAngle = this.lidAngle;
        if(this.numPlayersUsing > 0 && this.lidAngle == 0.0F)
        {
            this.playSound(SoundEvents.IRON_DOOR_OPEN);
        }

        if(this.numPlayersUsing == 0 && this.lidAngle > 0.0F || this.numPlayersUsing > 0 && this.lidAngle < 1.0F)
        {
            float f1 = this.lidAngle;
            if(this.numPlayersUsing > 0)
            {
                this.lidAngle += 0.1F;
            }
            else
            {
                this.lidAngle -= 0.1F;
            }

            if(this.lidAngle > 1.0F)
            {
                this.lidAngle = 1.0F;
            }

            if(this.lidAngle < 0.5F && f1 >= 0.5F)
            {
                this.playSound(SoundEvents.IRON_DOOR_CLOSE);
            }

            if(this.lidAngle < 0.0F)
            {
                this.lidAngle = 0.0F;
            }
        }
    }

    public static int calculatePlayersUsingSync(Level p_213977_0_, BaseContainerBlockEntity p_213977_1_, int p_213977_2_, int p_213977_3_, int p_213977_4_, int p_213977_5_, int p_213977_6_)
    {
        if(!p_213977_0_.isClientSide && p_213977_6_ != 0 && (p_213977_2_ + p_213977_3_ + p_213977_4_ + p_213977_5_) % 200 == 0)
        {
            p_213977_6_ = calculatePlayersUsing(p_213977_0_, p_213977_1_, p_213977_3_, p_213977_4_, p_213977_5_);
        }

        return p_213977_6_;
    }

    public static int calculatePlayersUsing(Level p_213976_0_, BaseContainerBlockEntity p_213976_1_, int p_213976_2_, int p_213976_3_, int p_213976_4_)
    {
        int i = 0;

        for(Player playerentity : p_213976_0_.getEntitiesOfClass(Player.class, new AABB((double)((float)p_213976_2_ - 5.0F), (double)((float)p_213976_3_ - 5.0F), (double)((float)p_213976_4_ - 5.0F), (double)((float)(p_213976_2_ + 1) + 5.0F), (double)((float)(p_213976_3_ + 1) + 5.0F), (double)((float)(p_213976_4_ + 1) + 5.0F))))
        {
            if(playerentity.containerMenu instanceof VerticalChestContainer)
            {
                Container iinventory = ((VerticalChestContainer)playerentity.containerMenu).getLowerChestInventory();
                if(iinventory == p_213976_1_ || iinventory instanceof CompoundContainer && ((CompoundContainer)iinventory).contains(p_213976_1_))
                {
                    ++i;
                }
            }
        }

        return i;
    }

    private void playSound(SoundEvent soundIn)
    {
        VerticalChestType chesttype = this.getBlockState().getValue(VerticalChestBlock.TYPE);
        if(chesttype != VerticalChestType.BOTTOM)
        {
            double d0 = (double)this.worldPosition.getX() + 0.5D;
            double d1 = (double)this.worldPosition.getY() + 0.5D;
            double d2 = (double)this.worldPosition.getZ() + 0.5D;
            if(chesttype == VerticalChestType.TOP)
            {
                Direction direction = VerticalChestBlock.getDirectionToAttached(this.getBlockState());
                d0 += (double)direction.getStepX() * 0.5D;
                d2 += (double)direction.getStepZ() * 0.5D;
            }

            this.level.playSound((Player)null, d0, d1, d2, soundIn, SoundSource.BLOCKS, 0.5F, this.level.random.nextFloat() * 0.1F + 0.9F);
        }
    }

    /**
     * See {@link Block#eventReceived} for more information. This must return true serverside before it is called
     * clientside.
     */
    public boolean triggerEvent(int id, int type)
    {
        if(id == 1)
        {
            this.numPlayersUsing = type;
            return true;
        }
        else
        {
            return super.triggerEvent(id, type);
        }
    }

    public void startOpen(Player player)
    {
        if(!player.isSpectator())
        {
            if(this.numPlayersUsing < 0)
                this.numPlayersUsing = 0;
            ++this.numPlayersUsing;
            this.onOpenOrClose();
        }

    }

    public void stopOpen(Player player)
    {
        if(!player.isSpectator())
        {
            --this.numPlayersUsing;
            this.onOpenOrClose();
        }

    }

    protected void onOpenOrClose()
    {
        Block block = this.getBlockState().getBlock();
        if(block instanceof VerticalChestBlock)
        {
            this.level.blockEvent(this.worldPosition, block, 1, this.numPlayersUsing);
            this.level.updateNeighborsAt(this.worldPosition, block);
        }
    }

    protected NonNullList<ItemStack> getItems()
    {
        return this.chestContents;
    }

    protected void setItems(NonNullList<ItemStack> itemsIn)
    {
        this.chestContents = itemsIn;
    }

    @OnlyIn(Dist.CLIENT)
    public float getOpenNess(float partialTicks)
    {
        return Mth.lerp(partialTicks, this.prevLidAngle, this.lidAngle);
    }

    public static int getPlayersUsing(BlockGetter reader, BlockPos posIn)
    {
        BlockState blockstate = reader.getBlockState(posIn);
        if(blockstate.hasBlockEntity())
        {
            BlockEntity tileentity = reader.getBlockEntity(posIn);
            if(tileentity instanceof VerticalChestTileEntity)
            {
                return ((VerticalChestTileEntity)tileentity).numPlayersUsing;
            }
        }

        return 0;
    }

    public static void swapContents(VerticalChestTileEntity chest, VerticalChestTileEntity otherChest)
    {
        NonNullList<ItemStack> nonnulllist = chest.getItems();
        chest.setItems(otherChest.getItems());
        otherChest.setItems(nonnulllist);
    }

    protected AbstractContainerMenu createMenu(int id, Inventory player)
    {
        return VerticalChestContainer.createGeneric9X3(id, player, this);
    }

    @Override
    public <T> LazyOptional<T> getCapability(Capability<T> cap, Direction side)
    {
        if(!this.remove && cap == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY)
        {
            if(this.chestHandler == null)
                this.chestHandler = LazyOptional.of(this::createHandler);
            return this.chestHandler.cast();
        }
        return super.getCapability(cap, side);
    }

    private IItemHandlerModifiable createHandler()
    {
        BlockState state = this.getBlockState();
        if(!(state.getBlock() instanceof VerticalChestBlock))
        {
            return new CustomInvWrapper(this, this);
        }
        VerticalChestType type = state.getValue(VerticalChestBlock.TYPE);
        if(type != VerticalChestType.SINGLE)
        {
            BlockPos opos = this.getBlockPos().relative(VerticalChestBlock.getDirectionToAttached(state));
            BlockState ostate = this.getLevel().getBlockState(opos);
            if(state.getBlock() == ostate.getBlock())
            {
                VerticalChestType otype = ostate.getValue(VerticalChestBlock.TYPE);
                if(otype != VerticalChestType.SINGLE && type != otype && state.getValue(VerticalChestBlock.FACING) == ostate.getValue(VerticalChestBlock.FACING))
                {
                    BlockEntity ote = this.getLevel().getBlockEntity(opos);
                    if(ote instanceof VerticalChestTileEntity)
                    {
                        Container top = type == VerticalChestType.TOP ? this : (Container)ote;
                        Container bottom = type == VerticalChestType.TOP ? (Container)ote : this;
                        return new CombinedInvWrapper(new CustomInvWrapper(top, this), new CustomInvWrapper(bottom, this));
                    }
                }
            }
        }
        return new CustomInvWrapper(this, this);
    }

    /**
     * invalidates a tile entity
     */
    @Override
    public void setRemoved()
    {
        super.setRemoved();
        if(chestHandler != null)
            chestHandler.invalidate();
    }

    // @OnlyIn(Dist.CLIENT)
    // public AxisAlignedBB getRenderBoundingBox()
    // {
    // BlockPos pos = getTileEntity().getPos();
    // AxisAlignedBB bb = new AxisAlignedBB(pos.add(0, -1, 0), pos.add(1, 1, 1));
    // return bb;
    // }

    @Override
    public int[] getSlotsForFace(Direction side)
    {
        return SLOTS;
    }

    @Override
    public boolean canPlaceItemThroughFace(int index, ItemStack itemStackIn, Direction direction)
    {
        return !isLocked;
    }

    @Override
    public boolean canTakeItemThroughFace(int index, ItemStack stack, Direction direction)
    {
        return !isLocked;
    }
}