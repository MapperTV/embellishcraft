package tv.mapper.embellishcraft.data.gen;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.ItemTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;
import tv.mapper.embellishcraft.ECConstants;
import tv.mapper.embellishcraft.data.ECTags;
import tv.mapper.mapperbase.data.BaseTags;

public class ECItemTags extends ItemTagsProvider
{
    public ECItemTags(DataGenerator generatorIn, ECBlockTags provider, ExistingFileHelper existingFileHelper)
    {
        super(generatorIn, provider, ECConstants.MODID, existingFileHelper);
    }

    public void registerTags()
    {
        copy(Tags.Blocks.STONE, Tags.Items.STONE);
        copy(Tags.Blocks.COBBLESTONE, Tags.Items.COBBLESTONE);
        copy(Tags.Blocks.COBBLESTONE, ItemTags.STONE_TOOL_MATERIALS);
        copy(Tags.Blocks.COBBLESTONE, ItemTags.STONE_CRAFTING_MATERIALS);
        copy(BlockTags.STAIRS, ItemTags.STAIRS);
        copy(BlockTags.SLABS, ItemTags.SLABS);
        copy(BlockTags.WALLS, ItemTags.WALLS);
        copy(BlockTags.FENCES, ItemTags.FENCES);
        copy(Tags.Blocks.FENCE_GATES, Tags.Items.FENCE_GATES);
        copy(BaseTags.ForgeBlocks.PRESSURE_PLATES, BaseTags.ForgeItems.PRESSURE_PLATES);
        copy(BlockTags.BUTTONS, ItemTags.BUTTONS);

        copy(ECTags.ForgeBlocks.CHAIRS, ECTags.ForgeItems.CHAIRS);
        copy(ECTags.ForgeBlocks.TABLES, ECTags.ForgeItems.TABLES);

        copy(ECTags.Blocks.SUSPENDED_STAIRS, ECTags.Items.SUSPENDED_STAIRS);

        copy(ECTags.Blocks.COUCHES, ECTags.Items.COUCHES);

        copy(ECTags.Blocks.WOODEN_DOORS, ECTags.Items.WOODEN_DOORS);
        copy(BlockTags.WOODEN_DOORS, ItemTags.WOODEN_DOORS);
        copy(BlockTags.DOORS, ItemTags.DOORS);

        copy(ECTags.Blocks.WOODEN_CRATES, ECTags.Items.WOODEN_CRATES);
        copy(ECTags.ForgeBlocks.CRATES, ECTags.ForgeItems.CRATES);

        copy(Tags.Blocks.CHESTS, Tags.Items.CHESTS);
        copy(Tags.Blocks.CHESTS_WOODEN, Tags.Items.CHESTS_WOODEN);

        copy(ECTags.Blocks.FANCY_BEDS, ECTags.Items.FANCY_BEDS);
        copy(BlockTags.BEDS, ItemTags.BEDS);
    }
}