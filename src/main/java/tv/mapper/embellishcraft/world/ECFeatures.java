package tv.mapper.embellishcraft.world;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.gen.placement.TopSolidRangeConfig;
import tv.mapper.embellishcraft.ECConstants;
import tv.mapper.embellishcraft.block.ECBlockRegistry;
import tv.mapper.embellishcraft.config.ECClientConfig.ClientConfig;
import tv.mapper.embellishcraft.config.EmbellishCraftConfig.CommonConfig;
import tv.mapper.embellishcraft.util.RockType;
import tv.mapper.mapperbase.MapperBase;

public class ECFeatures
{
    public static ConfiguredFeature<?, ?> BASALT = Feature.ORE.withConfiguration(
        new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, ECBlockRegistry.ROCK_BLOCKS.get(RockType.BASALT).get().getDefaultState(), CommonConfig.BASALT_SIZE.get())).withPlacement(
            Placement.RANGE.configure(new TopSolidRangeConfig(CommonConfig.BASALT_MIN_HEIGHT.get(), CommonConfig.BASALT_MIN_HEIGHT.get(), CommonConfig.BASALT_MAX_HEIGHT.get()))).square().count(
                CommonConfig.BASALT_CHANCE.get());

    public static ConfiguredFeature<?, ?> SLATE = Feature.ORE.withConfiguration(
        new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, ECBlockRegistry.ROCK_BLOCKS.get(RockType.SLATE).get().getDefaultState(), CommonConfig.SLATE_SIZE.get())).withPlacement(
            Placement.RANGE.configure(new TopSolidRangeConfig(CommonConfig.SLATE_MIN_HEIGHT.get(), CommonConfig.SLATE_MIN_HEIGHT.get(), CommonConfig.SLATE_MAX_HEIGHT.get()))).square().count(
                CommonConfig.SLATE_CHANCE.get());

    public static ConfiguredFeature<?, ?> MARBLE = Feature.ORE.withConfiguration(
        new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, ECBlockRegistry.ROCK_BLOCKS.get(RockType.MARBLE).get().getDefaultState(), CommonConfig.MARBLE_SIZE.get())).withPlacement(
            Placement.RANGE.configure(new TopSolidRangeConfig(CommonConfig.MARBLE_MIN_HEIGHT.get(), CommonConfig.MARBLE_MIN_HEIGHT.get(), CommonConfig.MARBLE_MAX_HEIGHT.get()))).square().count(
                CommonConfig.MARBLE_CHANCE.get());

    public static ConfiguredFeature<?, ?> GNEISS = Feature.ORE.withConfiguration(
        new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, ECBlockRegistry.ROCK_BLOCKS.get(RockType.GNEISS).get().getDefaultState(), CommonConfig.GNEISS_SIZE.get())).withPlacement(
            Placement.RANGE.configure(new TopSolidRangeConfig(CommonConfig.GNEISS_MIN_HEIGHT.get(), CommonConfig.GNEISS_MIN_HEIGHT.get(), CommonConfig.GNEISS_MAX_HEIGHT.get()))).square().count(
                CommonConfig.GNEISS_CHANCE.get());

    public static ConfiguredFeature<?, ?> JADE = Feature.ORE.withConfiguration(
        new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, ECBlockRegistry.ROCK_BLOCKS.get(RockType.JADE).get().getDefaultState(), CommonConfig.JADE_SIZE.get())).withPlacement(
            Placement.RANGE.configure(new TopSolidRangeConfig(CommonConfig.JADE_MIN_HEIGHT.get(), CommonConfig.JADE_MIN_HEIGHT.get(), CommonConfig.JADE_MAX_HEIGHT.get()))).square().count(
                CommonConfig.JADE_CHANCE.get());

    public static ConfiguredFeature<?, ?> LARVIKITE = Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, ECBlockRegistry.ROCK_BLOCKS.get(
        RockType.LARVIKITE).get().getDefaultState(), CommonConfig.LARVIKITE_SIZE.get())).withPlacement(
            Placement.RANGE.configure(new TopSolidRangeConfig(CommonConfig.LARVIKITE_MIN_HEIGHT.get(), CommonConfig.LARVIKITE_MIN_HEIGHT.get(), CommonConfig.LARVIKITE_MAX_HEIGHT.get()))).square().count(
                CommonConfig.LARVIKITE_CHANCE.get());

    public static void registerFeatures()
    {
        Registry<ConfiguredFeature<?, ?>> registry = WorldGenRegistries.CONFIGURED_FEATURE;

        Registry.register(registry, new ResourceLocation(ECConstants.MODID, "basalt"), BASALT);
        Registry.register(registry, new ResourceLocation(ECConstants.MODID, "slate"), SLATE);
        Registry.register(registry, new ResourceLocation(ECConstants.MODID, "marble"), MARBLE);
        Registry.register(registry, new ResourceLocation(ECConstants.MODID, "gneiss"), GNEISS);
        Registry.register(registry, new ResourceLocation(ECConstants.MODID, "jade"), JADE);
        Registry.register(registry, new ResourceLocation(ECConstants.MODID, "larvikite"), LARVIKITE);

        if(ClientConfig.ENABLE_GEN_LOGS.get())
        {
            MapperBase.LOGGER.debug("Registered feature " + BASALT.toString());
            MapperBase.LOGGER.debug("Registered feature " + SLATE.toString());
            MapperBase.LOGGER.debug("Registered feature " + MARBLE.toString());
            MapperBase.LOGGER.debug("Registered feature " + GNEISS.toString());
            MapperBase.LOGGER.debug("Registered feature " + JADE.toString());
            MapperBase.LOGGER.debug("Registered feature " + LARVIKITE.toString());
        }
    }
}
