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

    public ECItemTags(DataGenerator generatorIn)
    {
        super(generatorIn);
    }

    public void registerTags()
    {
        copy(Tags.Blocks.STONE, Tags.Items.STONE);
        copy(Tags.Blocks.COBBLESTONE, Tags.Items.COBBLESTONE);
        copy(BlockTags.STAIRS, ItemTags.STAIRS);
        copy(BlockTags.SLABS, ItemTags.SLABS);
        copy(BlockTags.WALLS, ItemTags.WALLS);
        copy(BlockTags.FENCES, ItemTags.FENCES);
        copy(Tags.Blocks.FENCE_GATES, Tags.Items.FENCE_GATES);
        copy(BaseTags.ForgeBlocks.PRESSURE_PLATES, BaseTags.ForgeItems.PRESSURE_PLATES);
        copy(BlockTags.BUTTONS, ItemTags.BUTTONS);
        copy(BlockTags.WOODEN_DOORS, ItemTags.WOODEN_DOORS);
        copy(BlockTags.DOORS, ItemTags.DOORS);
        copy(ECTags.Blocks.WOODEN_CRATES, ECTags.Items.WOODEN_CRATES);
        copy(Tags.Blocks.CHESTS, Tags.Items.CHESTS);
        copy(Tags.Blocks.CHESTS_WOODEN, Tags.Items.CHESTS_WOODEN);
        copy(BlockTags.BEDS, ItemTags.BEDS);
    }
}