package tv.mapper.embellishcraft.item.wrapper;

import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraftforge.items.wrapper.InvWrapper;
import tv.mapper.embellishcraft.tileentity.VerticalChestTileEntity;

public class CustomInvWrapper extends InvWrapper
{
    private VerticalChestTileEntity te;

    public CustomInvWrapper(IInventory inv, VerticalChestTileEntity te)
    {
        super(inv);
        this.te = te;
    }

    @Override
    public ItemStack extractItem(int slot, int amount, boolean simulate)
    {
        if(te.isLocked())
            return ItemStack.EMPTY;
        return super.extractItem(slot, amount, simulate);
    }
}
