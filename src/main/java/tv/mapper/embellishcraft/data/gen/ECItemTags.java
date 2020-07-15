package tv.mapper.embellishcraft.data.gen;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.ItemTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraftforge.common.Tags;
import tv.mapper.embellishcraft.data.ECTags;
import tv.mapper.mapperbase.data.BaseTags;

public class ECItemTags extends ItemTagsProvider
{
    public ECItemTags(DataGenerator generatorIn, ECBlockTags provider)
    {
        super(generatorIn, provider);
    }

    public void registerTags()
    {
        func_240521_a_(Tags.Blocks.STONE, Tags.Items.STONE);
        func_240521_a_(Tags.Blocks.COBBLESTONE, Tags.Items.COBBLESTONE);
        func_240521_a_(BlockTags.STAIRS, ItemTags.STAIRS);
        func_240521_a_(BlockTags.SLABS, ItemTags.SLABS);
        func_240521_a_(BlockTags.WALLS, ItemTags.WALLS);
        func_240521_a_(BlockTags.FENCES, ItemTags.FENCES);
        func_240521_a_(Tags.Blocks.FENCE_GATES, Tags.Items.FENCE_GATES);
        func_240521_a_(BaseTags.ForgeBlocks.PRESSURE_PLATES, BaseTags.ForgeItems.PRESSURE_PLATES);
        func_240521_a_(BlockTags.BUTTONS, ItemTags.BUTTONS);

        func_240521_a_(ECTags.ForgeBlocks.CHAIRS, ECTags.ForgeItems.CHAIRS);
        func_240521_a_(ECTags.ForgeBlocks.TABLES, ECTags.ForgeItems.TABLES);

        func_240521_a_(ECTags.Blocks.SUSPENDED_STAIRS, ECTags.Items.SUSPENDED_STAIRS);

        func_240521_a_(ECTags.Blocks.COUCHES, ECTags.Items.COUCHES);

        func_240521_a_(ECTags.Blocks.WOODEN_DOORS, ECTags.Items.WOODEN_DOORS);
        func_240521_a_(BlockTags.WOODEN_DOORS, ItemTags.WOODEN_DOORS);
        func_240521_a_(BlockTags.DOORS, ItemTags.DOORS);

        func_240521_a_(ECTags.Blocks.WOODEN_CRATES, ECTags.Items.WOODEN_CRATES);
        func_240521_a_(ECTags.ForgeBlocks.CRATES, ECTags.ForgeItems.CRATES);

        func_240521_a_(Tags.Blocks.CHESTS, Tags.Items.CHESTS);
        func_240521_a_(Tags.Blocks.CHESTS_WOODEN, Tags.Items.CHESTS_WOODEN);

        func_240521_a_(ECTags.Blocks.FANCY_BEDS, ECTags.Items.FANCY_BEDS);
        func_240521_a_(BlockTags.BEDS, ItemTags.BEDS);
    }
}