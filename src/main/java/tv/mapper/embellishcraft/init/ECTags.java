package tv.mapper.embellishcraft.init;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.Tag;
import net.minecraft.util.ResourceLocation;
import tv.mapper.embellishcraft.Constants;

public class ECTags
{
    public static class Blocks
    {
        public static final Tag<Block> WOODEN_DOORS = tag("wooden_doors");
        public static final Tag<Block> WOODEN_CRATES = tag("wooden_crates");
        public static final Tag<Block> BEAMS = tag("beams");
        public static final Tag<Block> DUCTS = tag("ducts");
        public static final Tag<Block> STEEL_DOORS = tag("steel_doors");

        private static Tag<Block> tag(String name)
        {
            return new BlockTags.Wrapper(new ResourceLocation(Constants.MODID, name));
        }
    }

    public static class Items
    {
        public static final Tag<Item> WOODEN_DOORS = tag("wooden_doors");
        public static final Tag<Item> WOODEN_CRATES = tag("wooden_crates");
        public static final Tag<Item> BEAMS = tag("beams");
        public static final Tag<Item> DUCTS = tag("ducts");
        public static final Tag<Item> STEEL_DOORS = tag("steel_doors");

        private static Tag<Item> tag(String name)
        {
            return new ItemTags.Wrapper(new ResourceLocation(Constants.MODID, name));
        }
    }

    public static class ForgeBlocks
    {
        public static final Tag<Block> CHAIRS = tag("chairs");
        public static final Tag<Block> TABLES = tag("tables");
        public static final Tag<Block> PRESSURE_PLATES = tag("pressure_plates");

        public static final Tag<Block> STORAGE_BLOCKS_STEEL = tag("storage_blocks/steel");

        private static Tag<Block> tag(String name)
        {
            return new BlockTags.Wrapper(new ResourceLocation("forge", name));
        }
    }

    public static class ForgeItems
    {
        public static final Tag<Item> CHAIRS = tag("chairs");
        public static final Tag<Item> TABLES = tag("tables");
        public static final Tag<Item> PRESSURE_PLATES = tag("pressure_plates");

        public static final Tag<Item> PLATES = tag("plates");
        public static final Tag<Item> PLATES_IRON = tag("plates/iron");
        public static final Tag<Item> PLATES_STEEL = tag("plates/steel");

        public static final Tag<Item> RODS_IRON = tag("rods/iron");
        public static final Tag<Item> RODS_STEEL = tag("rods/steel");

        public static final Tag<Item> INGOTS_STEEL = tag("ingots/steel");
        public static final Tag<Item> NUGGETS_STEEL = tag("nuggets/steel");

        public static final Tag<Item> STORAGE_BLOCKS_STEEL = tag("storage_blocks/steel");

        private static Tag<Item> tag(String name)
        {
            return new ItemTags.Wrapper(new ResourceLocation("forge", name));
        }
    }
}