package tv.mapper.embellishcraft.item;

import javax.annotation.Nonnull;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class FlatterHammerItem extends Item
{

    public FlatterHammerItem(Properties properties)
    {
        super(properties);
    }

    @Override
    public boolean hasContainerItem()
    {
        return true;
    }

    @Override
    public boolean isRepairable(ItemStack stack)
    {
        return false;
    }

    @Override
    public ItemStack getContainerItem(@Nonnull ItemStack stack)
    {
        ItemStack hammer = stack.copy();
        int damage = hammer.getDamage();

        if(damage < hammer.getMaxDamage())
        {
            hammer.setDamage(damage + 1);
            return hammer;
        }
        else
            return ItemStack.EMPTY;
    }
}
