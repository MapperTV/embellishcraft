package tv.mapper.embellishcraft.core.data.tags;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import tv.mapper.embellishcraft.core.ECConstants;

public class ECTags
{
    public static class Blocks
    {
        public static final TagKey<Block> DOORS = BlockTags.create(ResourceLocation.fromNamespaceAndPath(ECConstants.MODID, "doors"));
        public static final TagKey<Block> WOODEN_DOORS = BlockTags.create(ResourceLocation.fromNamespaceAndPath(ECConstants.MODID, "wooden_doors"));
        public static final TagKey<Block> WOODEN_CRATES = BlockTags.create(ResourceLocation.fromNamespaceAndPath(ECConstants.MODID, "wooden_crates"));
        public static final TagKey<Block> BEAMS = BlockTags.create(ResourceLocation.fromNamespaceAndPath(ECConstants.MODID, "beams"));
        public static final TagKey<Block> DUCTS = BlockTags.create(ResourceLocation.fromNamespaceAndPath(ECConstants.MODID, "ducts"));
        public static final TagKey<Block> STEEL_DOORS = BlockTags.create(ResourceLocation.fromNamespaceAndPath(ECConstants.MODID, "steel_doors"));
        public static final TagKey<Block> FANCY_BEDS = BlockTags.create(ResourceLocation.fromNamespaceAndPath(ECConstants.MODID, "fancy_beds"));
        public static final TagKey<Block> SUSPENDED_STAIRS = BlockTags.create(ResourceLocation.fromNamespaceAndPath(ECConstants.MODID, "suspended_stairs"));
        public static final TagKey<Block> COUCHES = BlockTags.create(ResourceLocation.fromNamespaceAndPath(ECConstants.MODID, "couches"));

    }

    public static class Items
    {
        public static final TagKey<Item> DOORS = ItemTags.create(ResourceLocation.fromNamespaceAndPath(ECConstants.MODID, "doors"));
        public static final TagKey<Item> WOODEN_DOORS = ItemTags.create(ResourceLocation.fromNamespaceAndPath(ECConstants.MODID, "wooden_doors"));
        public static final TagKey<Item> WOODEN_CRATES = ItemTags.create(ResourceLocation.fromNamespaceAndPath(ECConstants.MODID, "wooden_crates"));
        public static final TagKey<Item> BEAMS = ItemTags.create(ResourceLocation.fromNamespaceAndPath(ECConstants.MODID, "beams"));
        public static final TagKey<Item> DUCTS = ItemTags.create(ResourceLocation.fromNamespaceAndPath(ECConstants.MODID, "ducts"));
        public static final TagKey<Item> STEEL_DOORS = ItemTags.create(ResourceLocation.fromNamespaceAndPath(ECConstants.MODID, "steel_doors"));
        public static final TagKey<Item> FANCY_BEDS = ItemTags.create(ResourceLocation.fromNamespaceAndPath(ECConstants.MODID, "fancy_beds"));
        public static final TagKey<Item> SUSPENDED_STAIRS = ItemTags.create(ResourceLocation.fromNamespaceAndPath(ECConstants.MODID, "suspended_stairs"));
        public static final TagKey<Item> COUCHES = ItemTags.create(ResourceLocation.fromNamespaceAndPath(ECConstants.MODID, "couches"));
    }

    public static class CommonBlocks
    {
        public static final TagKey<Block> CHAIRS = BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "chairs"));
        public static final TagKey<Block> TABLES = BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "tables"));
        public static final TagKey<Block> CRATES = BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "crates"));

    }

    public static class CommonItems
    {
        public static final TagKey<Item> CHAIRS = ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "chairs"));
        public static final TagKey<Item> TABLES = ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "tables"));
        public static final TagKey<Item> CRATES = ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crates"));

    }
}