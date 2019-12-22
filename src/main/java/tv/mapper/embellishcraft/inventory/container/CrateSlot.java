package tv.mapper.embellishcraft.inventory.container;

import net.minecraft.block.Block;
import net.minecraft.block.ShulkerBoxBlock;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.container.Slot;
import net.minecraft.item.ItemStack;
import tv.mapper.embellishcraft.block.CrateBlock;

public class CrateSlot extends Slot
{
    public CrateSlot(IInventory inventoryIn, int slotIndexIn, int xPosition, int yPosition)
    {
        super(inventoryIn, slotIndexIn, xPosition, yPosition);
    }

    public boolean isItemValid(ItemStack stack)
    {
        if(Block.getBlockFromItem(stack.getItem()) instanceof CrateBlock || Block.getBlockFromItem(stack.getItem()) instanceof ShulkerBoxBlock)
            return false;
        else
            return true;
    }
}