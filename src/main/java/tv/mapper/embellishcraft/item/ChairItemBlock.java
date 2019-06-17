package tv.mapper.embellishcraft.item;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemStack;

public class ChairItemBlock extends BlockItem
{

    public ChairItemBlock(Block blockIn, Properties builder)
    {
        super(blockIn, builder);
    }
    
    @Override
    public int getBurnTime(ItemStack itemBlock)
    {
        return 600;
    }

}
