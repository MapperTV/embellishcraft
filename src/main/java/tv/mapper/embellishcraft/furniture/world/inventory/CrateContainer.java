package tv.mapper.embellishcraft.furniture.world.inventory;

import net.minecraft.world.Container;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class CrateContainer extends AbstractContainerMenu
{
    private final int numColumns;
    private final Container crateInventory;

    private CrateContainer(MenuType<?> type, int id, Inventory player, int column)
    {
        this(type, id, player, new SimpleContainer(4 * column), column);
    }

    public static CrateContainer createCrate4X4(int id, Inventory player)
    {
        return new CrateContainer(ModContainers.CRATE_4X4.get(), id, player, 4);
    }

    public static CrateContainer createCrate4X8(int id, Inventory player)
    {
        return new CrateContainer(ModContainers.CRATE_4X8.get(), id, player, 8);
    }

    public static CrateContainer createCrate4X4(int id, Inventory player, Container blockEntity)
    {
        return new CrateContainer(ModContainers.CRATE_4X4.get(), id, player, blockEntity, 4);
    }

    public static CrateContainer createCrate4X8(int id, Inventory player, Container blockEntity)
    {
        return new CrateContainer(ModContainers.CRATE_4X8.get(), id, player, blockEntity, 8);
    }

    public CrateContainer(MenuType<?> type, int id, Inventory playerInventoryIn, Container inv, int column)
    {
        super(type, id);
        checkContainerSize(inv, column * 4);
        this.numColumns = column;
        this.crateInventory = inv;
        inv.startOpen(playerInventoryIn.player);
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
    public boolean stillValid(Player playerIn)
    {
        return this.crateInventory.stillValid(playerIn);
    }

    /**
     * Handle when the stack in slot {@code index} is shift-clicked. Normally this moves the stack between the player
     * inventory and the other inventory(s).
     */
    public ItemStack quickMoveStack(Player playerIn, int index)
    {
        ItemStack itemstack = ItemStack.EMPTY;
        Slot slot = this.slots.get(index);
        if(slot != null && slot.hasItem())
        {
            ItemStack itemstack1 = slot.getItem();
            itemstack = itemstack1.copy();
            if(index < this.numColumns * 4)
            {
                if(!this.moveItemStackTo(itemstack1, this.numColumns * 4, this.slots.size(), true))
                {
                    return ItemStack.EMPTY;
                }
            }
            else if(!this.moveItemStackTo(itemstack1, 0, this.numColumns * 4, false))
            {
                return ItemStack.EMPTY;
            }

            if(itemstack1.isEmpty())
            {
                slot.set(ItemStack.EMPTY);
            }
            else
            {
                slot.setChanged();
            }
        }

        return itemstack;
    }

    /**
     * Called when the container is closed.
     */
    public void removed(Player playerIn)
    {
        super.removed(playerIn);
    }

    @OnlyIn(Dist.CLIENT)
    public int getNumRows()
    {
        return this.numColumns;
    }
}