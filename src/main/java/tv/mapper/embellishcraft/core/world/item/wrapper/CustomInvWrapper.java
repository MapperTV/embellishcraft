package tv.mapper.embellishcraft.core.world.item.wrapper;

import javax.annotation.Nonnull;

import net.minecraft.world.Container;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.items.wrapper.InvWrapper;
import tv.mapper.embellishcraft.furniture.world.level.block.entity.VerticalChestTileEntity;

public class CustomInvWrapper extends InvWrapper
{
    private VerticalChestTileEntity te;

    public CustomInvWrapper(Container inv, VerticalChestTileEntity te)
    {
        super(inv);
        this.te = te;
    }

    @Override
    @Nonnull
    public ItemStack insertItem(int slot, @Nonnull ItemStack stack, boolean simulate)
    {
        if(te.isLocked())
            return stack;

        return super.insertItem(slot, stack, simulate);
    }

    @Override
    public ItemStack extractItem(int slot, int amount, boolean simulate)
    {
        if(te.isLocked())
            return ItemStack.EMPTY;

        return super.extractItem(slot, amount, simulate);
    }
}