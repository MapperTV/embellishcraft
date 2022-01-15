package tv.mapper.embellishcraft.core.data;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.Tag;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import tv.mapper.embellishcraft.core.ECConstants;

public class ECTags
{
    public static class Blocks
    {
        public static final Tag.Named<Block> DOORS = tag("doors");
        public static final Tag.Named<Block> WOODEN_DOORS = tag("wooden_doors");
        public static final Tag.Named<Block> WOODEN_CRATES = tag("wooden_crates");
        public static final Tag.Named<Block> BEAMS = tag("beams");
        public static final Tag.Named<Block> DUCTS = tag("ducts");
        public static final Tag.Named<Block> STEEL_DOORS = tag("steel_doors");
        public static final Tag.Named<Block> FANCY_BEDS = tag("fancy_beds");
        public static final Tag.Named<Block> SUSPENDED_STAIRS = tag("suspended_stairs");
        public static final Tag.Named<Block> COUCHES = tag("couches");

        private static Tag.Named<Block> tag(String name)
        {
            return BlockTags.bind(new ResourceLocation(ECConstants.MODID, name).toString());
        }
    }

    public static class Items
    {
        public static final Tag.Named<Item> DOORS = tag("doors");
        public static final Tag.Named<Item> WOODEN_DOORS = tag("wooden_doors");
        public static final Tag.Named<Item> WOODEN_CRATES = tag("wooden_crates");
        public static final Tag.Named<Item> BEAMS = tag("beams");
        public static final Tag.Named<Item> DUCTS = tag("ducts");
        public static final Tag.Named<Item> STEEL_DOORS = tag("steel_doors");
        public static final Tag.Named<Item> FANCY_BEDS = tag("fancy_beds");
        public static final Tag.Named<Item> SUSPENDED_STAIRS = tag("suspended_stairs");
        public static final Tag.Named<Item> COUCHES = tag("couches");

        private static Tag.Named<Item> tag(String name)
        {
            return ItemTags.bind(new ResourceLocation(ECConstants.MODID, name).toString());
        }
    }

    public static class ForgeBlocks
    {
        public static final Tag.Named<Block> CHAIRS = tag("chairs");
        public static final Tag.Named<Block> TABLES = tag("tables");
        public static final Tag.Named<Block> CRATES = tag("crates");

        private static Tag.Named<Block> tag(String name)
        {
            return BlockTags.bind(new ResourceLocation("forge", name).toString());
        }
    }

    public static class ForgeItems
    {
        public static final Tag.Named<Item> CHAIRS = tag("chairs");
        public static final Tag.Named<Item> TABLES = tag("tables");
        public static final Tag.Named<Item> CRATES = tag("crates");

        private static Tag.Named<Item> tag(String name)
        {
            return ItemTags.bind(new ResourceLocation("forge", name).toString());
        }
    }
}