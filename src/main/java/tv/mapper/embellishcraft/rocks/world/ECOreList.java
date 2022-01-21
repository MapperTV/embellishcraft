package tv.mapper.embellishcraft.rocks.world;

import java.util.ArrayList;

import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import tv.mapper.embellishcraft.core.config.EmbellishCraftConfig.CommonConfig;
import tv.mapper.embellishcraft.core.util.RockType;
import tv.mapper.embellishcraft.rocks.world.level.block.InitRockBlocks;
import tv.mapper.mapperbase.world.BaseOreGenerator;
import tv.mapper.mapperbase.world.CustomOre;
import tv.mapper.mapperbase.world.OreList;

public class ECOreList
{
    public static PlacedFeature BASALT = PlacementUtils.register("basalt", FeatureUtils.register("basalt", Feature.ORE.configured(new OreConfiguration(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, InitRockBlocks.ROCK_BLOCKS.get(RockType.BASALT).get().defaultBlockState(), CommonConfig.BASALT_SIZE.get()))).placed(BaseOreGenerator.commonOrePlacement(CommonConfig.BASALT_CHANCE.get(), HeightRangePlacement.uniform(VerticalAnchor.absolute(CommonConfig.BASALT_MIN_HEIGHT.get()), VerticalAnchor.absolute(CommonConfig.BASALT_MAX_HEIGHT.get())))));

    public static PlacedFeature SLATE = PlacementUtils.register("slate", FeatureUtils.register("slate", Feature.ORE.configured(new OreConfiguration(OreFeatures.STONE_ORE_REPLACEABLES, InitRockBlocks.ROCK_BLOCKS.get(RockType.SLATE).get().defaultBlockState(), CommonConfig.SLATE_SIZE.get()))).placed(BaseOreGenerator.commonOrePlacement(CommonConfig.SLATE_CHANCE.get(), HeightRangePlacement.uniform(VerticalAnchor.absolute(CommonConfig.SLATE_MIN_HEIGHT.get()), VerticalAnchor.absolute(CommonConfig.SLATE_MAX_HEIGHT.get())))));

    public static PlacedFeature MARBLE = PlacementUtils.register("marble", FeatureUtils.register("marble", Feature.ORE.configured(new OreConfiguration(OreFeatures.STONE_ORE_REPLACEABLES, InitRockBlocks.ROCK_BLOCKS.get(RockType.MARBLE).get().defaultBlockState(), CommonConfig.MARBLE_SIZE.get()))).placed(BaseOreGenerator.commonOrePlacement(CommonConfig.MARBLE_CHANCE.get(), HeightRangePlacement.uniform(VerticalAnchor.absolute(CommonConfig.MARBLE_MIN_HEIGHT.get()), VerticalAnchor.absolute(CommonConfig.MARBLE_MAX_HEIGHT.get())))));

    public static PlacedFeature GNEISS = PlacementUtils.register("gneiss", FeatureUtils.register("gneiss", Feature.ORE.configured(new OreConfiguration(OreFeatures.STONE_ORE_REPLACEABLES, InitRockBlocks.ROCK_BLOCKS.get(RockType.GNEISS).get().defaultBlockState(), CommonConfig.GNEISS_SIZE.get()))).placed(BaseOreGenerator.commonOrePlacement(CommonConfig.GNEISS_CHANCE.get(), HeightRangePlacement.uniform(VerticalAnchor.absolute(CommonConfig.GNEISS_MIN_HEIGHT.get()), VerticalAnchor.absolute(CommonConfig.GNEISS_MAX_HEIGHT.get())))));

    public static PlacedFeature JADE = PlacementUtils.register("jade", FeatureUtils.register("jade", Feature.ORE.configured(new OreConfiguration(OreFeatures.STONE_ORE_REPLACEABLES, Blocks.BIRCH_SLAB.defaultBlockState(), CommonConfig.JADE_SIZE.get()))).placed(BaseOreGenerator.commonOrePlacement(CommonConfig.JADE_CHANCE.get(), HeightRangePlacement.uniform(VerticalAnchor.absolute(CommonConfig.JADE_MIN_HEIGHT.get()), VerticalAnchor.absolute(CommonConfig.JADE_MAX_HEIGHT.get())))));

    public static PlacedFeature LARVIKITE = PlacementUtils.register("larvikite", FeatureUtils.register("larvikite", Feature.ORE.configured(new OreConfiguration(OreFeatures.STONE_ORE_REPLACEABLES, Blocks.DARK_OAK_SLAB.defaultBlockState(), CommonConfig.LARVIKITE_SIZE.get()))).placed(BaseOreGenerator.commonOrePlacement(CommonConfig.LARVIKITE_CHANCE.get(), HeightRangePlacement.uniform(VerticalAnchor.absolute(CommonConfig.LARVIKITE_MIN_HEIGHT.get()), VerticalAnchor.absolute(CommonConfig.LARVIKITE_MAX_HEIGHT.get())))));

    public static final CustomOre basalt = new CustomOre("basalt", BASALT, CommonConfig.BASALT_GENERATION.get(), CommonConfig.BASALT_WHITELIST_MODE.get(), CommonConfig.BASALT_BIOME_LIST.get());
    public static final CustomOre slate = new CustomOre("slate", SLATE, CommonConfig.SLATE_GENERATION.get(), CommonConfig.SLATE_WHITELIST_MODE.get(), CommonConfig.SLATE_BIOME_LIST.get());
    public static final CustomOre marble = new CustomOre("marble", MARBLE, CommonConfig.MARBLE_GENERATION.get(), CommonConfig.MARBLE_WHITELIST_MODE.get(), CommonConfig.MARBLE_BIOME_LIST.get());
    public static final CustomOre gneiss = new CustomOre("gneiss", GNEISS, CommonConfig.GNEISS_GENERATION.get(), CommonConfig.GNEISS_WHITELIST_MODE.get(), CommonConfig.GNEISS_BIOME_LIST.get());
    public static final CustomOre jade = new CustomOre("jade", JADE, CommonConfig.JADE_GENERATION.get(), CommonConfig.JADE_WHITELIST_MODE.get(), CommonConfig.JADE_BIOME_LIST.get());
    public static final CustomOre larvikite = new CustomOre("larvikite", LARVIKITE, CommonConfig.LARVIKITE_GENERATION.get(), CommonConfig.LARVIKITE_WHITELIST_MODE.get(), CommonConfig.LARVIKITE_BIOME_LIST.get());

    public static void initOres()
    {
        ArrayList<CustomOre> list = new ArrayList<CustomOre>();
        list.add(basalt);
        list.add(slate);
        list.add(marble);
        list.add(gneiss);
        list.add(jade);
        list.add(larvikite);

        OreList.addOre(list);
    }
}