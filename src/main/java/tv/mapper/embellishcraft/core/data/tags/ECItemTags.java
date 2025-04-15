package tv.mapper.embellishcraft.core.data.tags;

import java.util.Arrays;
import java.util.concurrent.CompletableFuture;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import tv.mapper.embellishcraft.core.ECConstants;
import tv.mapper.embellishcraft.core.util.RockType;
import tv.mapper.embellishcraft.rocks.item.InitRockItems;
import tv.mapper.mapperbase.api.data.tags.BaseItemTagsProvider;

public class ECItemTags extends BaseItemTagsProvider
{
    public ECItemTags(DataGenerator generatorIn, CompletableFuture<HolderLookup.Provider> future, CompletableFuture<TagLookup<Block>> provider, ExistingFileHelper existingFileHelper)
    {
        super(generatorIn.getPackOutput(), future, provider, ECConstants.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider)
    {
        copy(Tags.Blocks.STONES, Tags.Items.STONES);
        copy(Tags.Blocks.COBBLESTONES, Tags.Items.COBBLESTONES);
        copy(Tags.Blocks.COBBLESTONES, ItemTags.STONE_TOOL_MATERIALS);
        copy(Tags.Blocks.COBBLESTONES, ItemTags.STONE_CRAFTING_MATERIALS);
        copy(BlockTags.STAIRS, ItemTags.STAIRS);
        copy(BlockTags.SLABS, ItemTags.SLABS);
        copy(BlockTags.WALLS, ItemTags.WALLS);
        copy(BlockTags.FENCES, ItemTags.FENCES);
        copy(Tags.Blocks.FENCE_GATES, Tags.Items.FENCE_GATES);
        copy(BlockTags.BUTTONS, ItemTags.BUTTONS);
        copy(BlockTags.STONE_BUTTONS, ItemTags.STONE_BUTTONS);
        for(int j = 0; j < Arrays.stream(RockType.values()).count(); j++)
        {
            this.tag(ItemTags.STONE_BUTTONS).add(InitRockItems.ROCK_BUTTONS_ITEMS.get(RockType.byId(j)).get());
        }
        copy(Tags.Blocks.SANDSTONE_BLOCKS, Tags.Items.SANDSTONE_BLOCKS);
        copy(Tags.Blocks.SANDSTONE_RED_BLOCKS, Tags.Items.SANDSTONE_RED_BLOCKS);
        copy(Tags.Blocks.SANDSTONE_UNCOLORED_BLOCKS, Tags.Items.SANDSTONE_UNCOLORED_BLOCKS);
        copy(Tags.Blocks.SANDSTONE_STAIRS, Tags.Items.SANDSTONE_STAIRS);
        copy(Tags.Blocks.SANDSTONE_RED_STAIRS, Tags.Items.SANDSTONE_RED_STAIRS);
        copy(Tags.Blocks.SANDSTONE_UNCOLORED_STAIRS, Tags.Items.SANDSTONE_UNCOLORED_STAIRS);
        copy(Tags.Blocks.SANDSTONE_SLABS, Tags.Items.SANDSTONE_SLABS);
        copy(Tags.Blocks.SANDSTONE_RED_SLABS, Tags.Items.SANDSTONE_RED_SLABS);
        copy(Tags.Blocks.SANDSTONE_UNCOLORED_SLABS, Tags.Items.SANDSTONE_UNCOLORED_SLABS);

        copy(ECTags.CommonBlocks.CHAIRS, ECTags.CommonItems.CHAIRS);
        copy(ECTags.CommonBlocks.TABLES, ECTags.CommonItems.TABLES);

        copy(ECTags.Blocks.SUSPENDED_STAIRS, ECTags.Items.SUSPENDED_STAIRS);

        copy(ECTags.Blocks.COUCHES, ECTags.Items.COUCHES);

        copy(ECTags.Blocks.WOODEN_DOORS, ECTags.Items.WOODEN_DOORS);
        copy(ECTags.Blocks.DOORS, ECTags.Items.DOORS);
        copy(BlockTags.WOODEN_DOORS, ItemTags.WOODEN_DOORS);
        copy(BlockTags.DOORS, ItemTags.DOORS);

        // copy(ECTags.Blocks.WOODEN_CRATES, ECTags.Items.WOODEN_CRATES);
        // copy(ECTags.ForgeBlocks.CRATES, ECTags.ForgeItems.CRATES);

        // copy(Tags.Blocks.CHESTS, Tags.Items.CHESTS);
        // copy(Tags.Blocks.CHESTS_WOODEN, Tags.Items.CHESTS_WOODEN);

        // copy(ECTags.Blocks.FANCY_BEDS, ECTags.Items.FANCY_BEDS);
        // copy(BlockTags.BEDS, ItemTags.BEDS);
    }
}