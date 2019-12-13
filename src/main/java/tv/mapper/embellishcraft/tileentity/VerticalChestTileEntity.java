package tv.mapper.embellishcraft.tileentity;

import java.util.UUID;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.DoubleSidedInventory;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.ItemStackHelper;
import net.minecraft.inventory.container.Container;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.tileentity.IChestLid;
import net.minecraft.tileentity.ITickableTileEntity;
import net.minecraft.tileentity.LockableLootTileEntity;
import net.minecraft.tileentity.LockableTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraft.util.Direction;
import net.minecraft.util.NonNullList;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.IItemHandlerModifiable;
import net.minecraftforge.items.wrapper.CombinedInvWrapper;
import tv.mapper.embellishcraft.block.VerticalChestBlock;
import tv.mapper.embellishcraft.init.ModTileEntityTypes;
import tv.mapper.embellishcraft.inventory.container.VerticalChestContainer;
import tv.mapper.embellishcraft.item.wrapper.CustomInvWrapper;
import tv.mapper.embellishcraft.state.properties.VerticalChestType;

@OnlyIn(value = Dist.CLIENT, _interface = IChestLid.class)
public class VerticalChestTileEntity extends LockableLootTileEntity implements IChestLid, ITickableTileEntity
{
    private NonNullList<ItemStack> chestContents = NonNullList.withSize(27, ItemStack.EMPTY);
    protected float lidAngle;
    protected float prevLidAngle;
    protected int numPlayersUsing;
    private int ticksSinceSync;
    private boolean isLocked = false;
    private UUID id = null;
    private LazyOptional<IItemHandlerModifiable> chestHandler;

    protected VerticalChestTileEntity(TileEntityType<?> typeIn)
    {
        super(typeIn);
    }

    public VerticalChestTileEntity()
    {
        this(ModTileEntityTypes.VERTICAL_CHEST);
    }

    /**
     * Returns the number of slots in the inventory.
     */
    public int getSizeInventory()
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

    protected ITextComponent getDefaultName()
    {
        return new TranslationTextComponent("embellishcraft.container.locker");
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

    public void setUUID(UUID id)
    {
        this.id = id;
    }

    public UUID getUUID()
    {
        return this.id;
    }

    public boolean hasUUID()
    {
        if(this.id != null)
            return true;
        return false;
    }

    public void read(CompoundNBT compound)
    {
        super.read(compound);
        this.chestContents = NonNullList.withSize(this.getSizeInventory(), ItemStack.EMPTY);
        if(!this.checkLootAndRead(compound))
        {
            ItemStackHelper.loadAllItems(compound, this.chestContents);
        }

        this.id = compound.getUniqueId("id");
        this.isLocked = compound.getBoolean("is_locked");
    }

    public CompoundNBT write(CompoundNBT compound)
    {
        super.write(compound);
        if(!this.checkLootAndWrite(compound))
        {
            ItemStackHelper.saveAllItems(compound, this.chestContents);
        }
        if(id != null)
            compound.putUniqueId("id", this.id);
        compound.putBoolean("is_locked", this.isLocked);

        return compound;
    }

    public void tick()
    {
        int i = this.pos.getX();
        int j = this.pos.getY();
        int k = this.pos.getZ();
        ++this.ticksSinceSync;
        this.numPlayersUsing = calculatePlayersUsingSync(this.world, this, this.ticksSinceSync, i, j, k, this.numPlayersUsing);
        this.prevLidAngle = this.lidAngle;
        if(this.numPlayersUsing > 0 && this.lidAngle == 0.0F)
        {
            this.playSound(SoundEvents.BLOCK_IRON_DOOR_OPEN);
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
                this.playSound(SoundEvents.BLOCK_IRON_DOOR_CLOSE);
            }

            if(this.lidAngle < 0.0F)
            {
                this.lidAngle = 0.0F;
            }
        }

    }

    public static int calculatePlayersUsingSync(World p_213977_0_, LockableTileEntity p_213977_1_, int p_213977_2_, int p_213977_3_, int p_213977_4_, int p_213977_5_, int p_213977_6_)
    {
        if(!p_213977_0_.isRemote && p_213977_6_ != 0 && (p_213977_2_ + p_213977_3_ + p_213977_4_ + p_213977_5_) % 200 == 0)
        {
            p_213977_6_ = calculatePlayersUsing(p_213977_0_, p_213977_1_, p_213977_3_, p_213977_4_, p_213977_5_);
        }

        return p_213977_6_;
    }

    public static int calculatePlayersUsing(World p_213976_0_, LockableTileEntity p_213976_1_, int p_213976_2_, int p_213976_3_, int p_213976_4_)
    {
        int i = 0;

        for(PlayerEntity playerentity : p_213976_0_.getEntitiesWithinAABB(PlayerEntity.class, new AxisAlignedBB((double)((float)p_213976_2_ - 5.0F), (double)((float)p_213976_3_ - 5.0F), (double)((float)p_213976_4_ - 5.0F), (double)((float)(p_213976_2_ + 1) + 5.0F), (double)((float)(p_213976_3_ + 1) + 5.0F), (double)((float)(p_213976_4_ + 1) + 5.0F))))
        {
            if(playerentity.openContainer instanceof VerticalChestContainer)
            {
                IInventory iinventory = ((VerticalChestContainer)playerentity.openContainer).getLowerChestInventory();
                if(iinventory == p_213976_1_ || iinventory instanceof DoubleSidedInventory && ((DoubleSidedInventory)iinventory).isPartOfLargeChest(p_213976_1_))
                {
                    ++i;
                }
            }
        }

        return i;
    }

    private void playSound(SoundEvent soundIn)
    {
        VerticalChestType chesttype = this.getBlockState().get(VerticalChestBlock.TYPE);
        if(chesttype != VerticalChestType.BOTTOM)
        {
            double d0 = (double)this.pos.getX() + 0.5D;
            double d1 = (double)this.pos.getY() + 0.5D;
            double d2 = (double)this.pos.getZ() + 0.5D;
            if(chesttype == VerticalChestType.TOP)
            {
                Direction direction = VerticalChestBlock.getDirectionToAttached(this.getBlockState());
                d0 += (double)direction.getXOffset() * 0.5D;
                d2 += (double)direction.getZOffset() * 0.5D;
            }

            this.world.playSound((PlayerEntity)null, d0, d1, d2, soundIn, SoundCategory.BLOCKS, 0.5F, this.world.rand.nextFloat() * 0.1F + 0.9F);
        }
    }

    /**
     * See {@link Block#eventReceived} for more information. This must return true serverside before it is called
     * clientside.
     */
    public boolean receiveClientEvent(int id, int type)
    {
        if(id == 1)
        {
            this.numPlayersUsing = type;
            return true;
        }
        else
        {
            return super.receiveClientEvent(id, type);
        }
    }

    public void openInventory(PlayerEntity player)
    {
        if(!player.isSpectator())
        {
            if(this.numPlayersUsing < 0)
                this.numPlayersUsing = 0;
            ++this.numPlayersUsing;
            this.onOpenOrClose();
        }

    }

    public void closeInventory(PlayerEntity player)
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
            this.world.addBlockEvent(this.pos, block, 1, this.numPlayersUsing);
            this.world.notifyNeighborsOfStateChange(this.pos, block);
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
    public float getLidAngle(float partialTicks)
    {
        return MathHelper.lerp(partialTicks, this.prevLidAngle, this.lidAngle);
    }

    public static int getPlayersUsing(IBlockReader reader, BlockPos posIn)
    {
        BlockState blockstate = reader.getBlockState(posIn);
        if(blockstate.hasTileEntity())
        {
            TileEntity tileentity = reader.getTileEntity(posIn);
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

    protected Container createMenu(int id, PlayerInventory player)
    {
        return VerticalChestContainer.createGeneric9X3(id, player, this);
    }

    @Override
    public void updateContainingBlockInfo()
    {
        super.updateContainingBlockInfo();
        if(this.chestHandler != null)
        {
            this.chestHandler.invalidate();
            this.chestHandler = null;
        }
    }

    @Override
    public <T> LazyOptional<T> getCapability(Capability<T> cap, Direction side)
    {
        if(!this.removed && cap == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY)
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
        VerticalChestType type = state.get(VerticalChestBlock.TYPE);
        if(type != VerticalChestType.SINGLE)
        {
            BlockPos opos = this.getPos().offset(VerticalChestBlock.getDirectionToAttached(state));
            BlockState ostate = this.getWorld().getBlockState(opos);
            if(state.getBlock() == ostate.getBlock())
            {
                VerticalChestType otype = ostate.get(VerticalChestBlock.TYPE);
                if(otype != VerticalChestType.SINGLE && type != otype && state.get(VerticalChestBlock.FACING) == ostate.get(VerticalChestBlock.FACING))
                {
                    TileEntity ote = this.getWorld().getTileEntity(opos);
                    if(ote instanceof VerticalChestTileEntity)
                    {
                        IInventory top = type == VerticalChestType.TOP ? this : (IInventory)ote;
                        IInventory bottom = type == VerticalChestType.TOP ? (IInventory)ote : this;
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
    public void remove()
    {
        super.remove();
        if(chestHandler != null)
            chestHandler.invalidate();
    }

    @OnlyIn(Dist.CLIENT)
    public AxisAlignedBB getRenderBoundingBox()
    {
        BlockPos pos = getTileEntity().getPos();
        AxisAlignedBB bb = new AxisAlignedBB(pos.add(0, -1, 0), pos.add(1, 1, 1));
        return bb;
    }
}