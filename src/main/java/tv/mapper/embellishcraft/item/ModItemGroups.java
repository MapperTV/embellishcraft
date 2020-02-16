package tv.mapper.embellishcraft.item;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import tv.mapper.embellishcraft.block.ECBlocks;

public class ModItemGroups
{
    public static final ItemGroup EMBELLISHCRAFT = new ItemGroup("embellishcraft_group")
    {
        @Override
        public ItemStack createIcon()
        {
            return new ItemStack(ECBlocks.SPRUCE_CHAIR);
        }
    };
}
