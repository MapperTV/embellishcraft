package tv.mapper.embellishcraft.inventory.container;

import net.minecraft.world.Container;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.ShulkerBoxBlock;
import tv.mapper.embellishcraft.furniture.world.level.block.CrateBlock;

public class CrateSlot extends Slot
{
    public CrateSlot(Container inventoryIn, int slotIndexIn, int xPosition, int yPosition)
    {
        super(inventoryIn, slotIndexIn, xPosition, yPosition);
    }

    public boolean mayPlace(ItemStack stack)
    {
        if(Block.byItem(stack.getItem()) instanceof CrateBlock || Block.byItem(stack.getItem()) instanceof ShulkerBoxBlock)
            return false;
        else
            return true;
    }
}