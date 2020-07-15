package tv.mapper.embellishcraft.data;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ITag;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.ResourceLocation;
import tv.mapper.embellishcraft.ECConstants;

public class ECTags
{
    public static class Blocks
    {
        public static final ITag.INamedTag<Block> WOODEN_DOORS = tag("wooden_doors");
        public static final ITag.INamedTag<Block> WOODEN_CRATES = tag("wooden_crates");
        public static final ITag.INamedTag<Block> BEAMS = tag("beams");
        public static final ITag.INamedTag<Block> DUCTS = tag("ducts");
        public static final ITag.INamedTag<Block> STEEL_DOORS = tag("steel_doors");
        public static final ITag.INamedTag<Block> FANCY_BEDS = tag("fancy_beds");
        public static final ITag.INamedTag<Block> SUSPENDED_STAIRS = tag("suspended_stairs");
        public static final ITag.INamedTag<Block> COUCHES = tag("couches");

        private static ITag.INamedTag<Block> tag(String name)
        {
            return BlockTags.makeWrapperTag(new ResourceLocation(ECConstants.MODID, name).toString());
        }
    }

    public static class Items
    {
        public static final ITag.INamedTag<Item> WOODEN_DOORS = tag("wooden_doors");
        public static final ITag.INamedTag<Item> WOODEN_CRATES = tag("wooden_crates");
        public static final ITag.INamedTag<Item> BEAMS = tag("beams");
        public static final ITag.INamedTag<Item> DUCTS = tag("ducts");
        public static final ITag.INamedTag<Item> STEEL_DOORS = tag("steel_doors");
        public static final ITag.INamedTag<Item> FANCY_BEDS = tag("fancy_beds");
        public static final ITag.INamedTag<Item> SUSPENDED_STAIRS = tag("suspended_stairs");
        public static final ITag.INamedTag<Item> COUCHES = tag("couches");

        private static ITag.INamedTag<Item> tag(String name)
        {
            return ItemTags.makeWrapperTag(new ResourceLocation(ECConstants.MODID, name).toString());
        }
    }

    public static class ForgeBlocks
    {
        public static final ITag.INamedTag<Block> CHAIRS = tag("chairs");
        public static final ITag.INamedTag<Block> TABLES = tag("tables");
        public static final ITag.INamedTag<Block> CRATES = tag("crates");
        public static final ITag.INamedTag<Block> PRESSURE_PLATES = tag("pressure_plates");

        public static final ITag.INamedTag<Block> STORAGE_BLOCKS_STEEL = tag("storage_blocks/steel");

        private static ITag.INamedTag<Block> tag(String name)
        {
            return BlockTags.makeWrapperTag(new ResourceLocation("forge", name).toString());
        }
    }

    public static class ForgeItems
    {
        public static final ITag.INamedTag<Item> CHAIRS = tag("chairs");
        public static final ITag.INamedTag<Item> TABLES = tag("tables");
        public static final ITag.INamedTag<Item> CRATES = tag("crates");
        public static final ITag.INamedTag<Item> PRESSURE_PLATES = tag("pressure_plates");

        public static final ITag.INamedTag<Item> PLATES = tag("plates");
        public static final ITag.INamedTag<Item> PLATES_IRON = tag("plates/iron");
        public static final ITag.INamedTag<Item> PLATES_STEEL = tag("plates/steel");

        public static final ITag.INamedTag<Item> RODS_IRON = tag("rods/iron");
        public static final ITag.INamedTag<Item> RODS_STEEL = tag("rods/steel");

        public static final ITag.INamedTag<Item> INGOTS_STEEL = tag("ingots/steel");
        public static final ITag.INamedTag<Item> NUGGETS_STEEL = tag("nuggets/steel");

        public static final ITag.INamedTag<Item> STORAGE_BLOCKS_STEEL = tag("storage_blocks/steel");

        private static ITag.INamedTag<Item> tag(String name)
        {
            return ItemTags.makeWrapperTag(new ResourceLocation("forge", name).toString());
        }
    }
}