package tv.mapper.embellishcraft.item;

import java.util.Random;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import tv.mapper.embellishcraft.block.ECBlockRegistry;
import tv.mapper.embellishcraft.util.McWoods;

public class ModItemGroups
{
    static Random rand = new Random();

    public static final ItemGroup EMBELLISHCRAFT = new ItemGroup("embellishcraft_group")
    {
        @Override
        public ItemStack createIcon()
        {
            return new ItemStack(ECBlockRegistry.CHAIR_BLOCKS.get(McWoods.byId(rand.nextInt(5))).get());
        }
    };
}