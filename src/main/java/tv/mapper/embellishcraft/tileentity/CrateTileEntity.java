package tv.mapper.embellishcraft.tileentity;

import java.util.stream.IntStream;

import net.minecraft.block.Block;
import net.minecraft.block.ShulkerBoxBlock;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.ISidedInventory;
import net.minecraft.inventory.ItemStackHelper;
import net.minecraft.inventory.container.Container;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.tileentity.LockableLootTileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraft.util.Direction;
import net.minecraft.util.NonNullList;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.IItemHandlerModifiable;
import net.minecraftforge.items.wrapper.InvWrapper;
import tv.mapper.embellishcraft.block.CrateBlock;
import tv.mapper.embellishcraft.init.ModTileEntityTypes;
import tv.mapper.embellishcraft.inventory.container.CrateContainer;

public class CrateTileEntity extends LockableLootTileEntity implements ISidedInventory
{
    private static final int[] SLOTS = IntStream.range(0, 4 * 4).toArray();
    private NonNullList<ItemStack> crateContents = NonNullList.withSize(4 * 4, ItemStack.EMPTY);
    private LazyOptional<IItemHandlerModifiable> crateHandler = LazyOptional.of(this::createHandler);;

    protected CrateTileEntity(TileEntityType<?> typeIn)
    {
        super(typeIn);
    }

    public CrateTileEntity()
    {
        this(ModTileEntityTypes.CRATE);
    }

    /**
     * Returns the number of slots in the inventory.
     */
    public int getSizeInventory()
    {
        return 4 * 4;
    }

    public boolean isEmpty()
    {
        for(ItemStack itemstack : this.crateContents)
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
        return new TranslationTextComponent("embellishcraft.container.wooden_crate");
    }

    public void read(CompoundNBT compound)
    {
        super.read(compound);
        this.loadFromNbt(compound);
    }

    public CompoundNBT write(CompoundNBT compound)
    {
        super.write(compound);
        return this.saveToNbt(compound);
    }

    public void loadFromNbt(CompoundNBT compound)
    {
        this.crateContents = NonNullList.withSize(this.getSizeInventory(), ItemStack.EMPTY);
        if(!this.checkLootAndRead(compound) && compound.contains("Items", 9))
        {
            ItemStackHelper.loadAllItems(compound, this.crateContents);
        }

    }

    public CompoundNBT saveToNbt(CompoundNBT compound)
    {
        if(!this.checkLootAndWrite(compound))
        {
            ItemStackHelper.saveAllItems(compound, this.crateContents, false);
        }

        return compound;
    }

    protected NonNullList<ItemStack> getItems()
    {
        return this.crateContents;
    }

    protected void setItems(NonNullList<ItemStack> itemsIn)
    {
        this.crateContents = itemsIn;
    }

    protected Container createMenu(int id, PlayerInventory player)
    {
        return CrateContainer.createCrate4X4(id, player, this);
    }

    @Override
    public <T> LazyOptional<T> getCapability(Capability<T> cap, Direction side)
    {
        if(!this.removed && cap == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY)
            return this.crateHandler.cast();

        return super.getCapability(cap, side);
    }

    private IItemHandlerModifiable createHandler()
    {
        return new InvWrapper(this);
    }

    /**
     * invalidates a tile entity
     */
    @Override
    public void remove()
    {
        super.remove();
        if(crateHandler != null)
            crateHandler.invalidate();
    }

    @Override
    public int[] getSlotsForFace(Direction side)
    {
        return SLOTS;
    }

    @Override
    public boolean canInsertItem(int index, ItemStack itemStackIn, Direction direction)
    {
        if(Block.getBlockFromItem(itemStackIn.getItem()) instanceof CrateBlock || Block.getBlockFromItem(itemStackIn.getItem()) instanceof ShulkerBoxBlock)
            return false;
        else
            return true;
    }

    @Override
    public boolean canExtractItem(int index, ItemStack stack, Direction direction)
    {
        return true;
    }
}
