package tv.mapper.embellishcraft.inventory.container;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Inventory;
import net.minecraft.inventory.container.Container;
import net.minecraft.inventory.container.ContainerType;
import net.minecraft.inventory.container.Slot;
import net.minecraft.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import tv.mapper.embellishcraft.init.ModContainers;

public class CrateContainer extends Container
{
    private final int numColumns;
    private final IInventory crateInventory;

    private CrateContainer(ContainerType<?> type, int id, PlayerInventory player, int column)
    {
        this(type, id, player, new Inventory(4 * column), column);
    }

    public static CrateContainer createCrate4X4(int id, PlayerInventory player)
    {
        return new CrateContainer(ModContainers.CRATE_4X4, id, player, 4);
    }

    public static CrateContainer createCrate4X8(int id, PlayerInventory player)
    {
        return new CrateContainer(ModContainers.CRATE_4X8, id, player, 8);
    }

    public static CrateContainer createCrate4X4(int id, PlayerInventory player, IInventory blockEntity)
    {
        return new CrateContainer(ModContainers.CRATE_4X4, id, player, blockEntity, 4);
    }

    public static CrateContainer createCrate4X8(int id, PlayerInventory player, IInventory blockEntity)
    {
        return new CrateContainer(ModContainers.CRATE_4X8, id, player, blockEntity, 8);
    }

    public CrateContainer(ContainerType<?> type, int id, PlayerInventory playerInventoryIn, IInventory inv, int column)
    {
        super(type, id);
        assertInventorySize(inv, column * 4);
        this.numColumns = column;
        this.crateInventory = inv;
        inv.openInventory(playerInventoryIn.player);
        int i = (this.numColumns - 4) * 18;

        for(int j = 0; j < this.numColumns; ++j)
        {
            for(int k = 0; k < 4; ++k)
            {
                this.addSlot(new CrateSlot(inv, k + j * 4, 8 + k * 18 + 45, 18 + j * 18));
            }
        }

        for(int l = 0; l < 3; ++l)
        {
            for(int j1 = 0; j1 < 9; ++j1)
            {
                this.addSlot(new Slot(playerInventoryIn, j1 + l * 9 + 9, 8 + j1 * 18, 103 + l * 18 + i));
            }
        }

        for(int i1 = 0; i1 < 9; ++i1)
        {
            this.addSlot(new Slot(playerInventoryIn, i1, 8 + i1 * 18, 161 + i));
        }

    }

    /**
     * Determines whether supplied player can use this container
     */
    public boolean canInteractWith(PlayerEntity playerIn)
    {
        return this.crateInventory.isUsableByPlayer(playerIn);
    }

    /**
     * Handle when the stack in slot {@code index} is shift-clicked. Normally this moves the stack between the player
     * inventory and the other inventory(s).
     */
    public ItemStack transferStackInSlot(PlayerEntity playerIn, int index)
    {
        ItemStack itemstack = ItemStack.EMPTY;
        Slot slot = this.inventorySlots.get(index);
        if(slot != null && slot.getHasStack())
        {
            ItemStack itemstack1 = slot.getStack();
            itemstack = itemstack1.copy();
            if(index < this.numColumns * 4)
            {
                if(!this.mergeItemStack(itemstack1, this.numColumns * 4, this.inventorySlots.size(), true))
                {
                    return ItemStack.EMPTY;
                }
            }
            else if(!this.mergeItemStack(itemstack1, 0, this.numColumns * 4, false))
            {
                return ItemStack.EMPTY;
            }

            if(itemstack1.isEmpty())
            {
                slot.putStack(ItemStack.EMPTY);
            }
            else
            {
                slot.onSlotChanged();
            }
        }

        return itemstack;
    }

    /**
     * Called when the container is closed.
     */
    public void onContainerClosed(PlayerEntity playerIn)
    {
        super.onContainerClosed(playerIn);
    }

    @OnlyIn(Dist.CLIENT)
    public int getNumRows()
    {
        return this.numColumns;
    }
}
