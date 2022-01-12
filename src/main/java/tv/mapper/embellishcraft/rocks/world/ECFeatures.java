package tv.mapper.embellishcraft.rocks.world;

import net.minecraft.core.Registry;
import net.minecraft.data.BuiltinRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import tv.mapper.embellishcraft.ECConstants;
import tv.mapper.embellishcraft.config.ECClientConfig.ClientConfig;
import tv.mapper.embellishcraft.config.EmbellishCraftConfig.CommonConfig;
import tv.mapper.embellishcraft.rocks.world.level.block.InitRockBlocks;
import tv.mapper.embellishcraft.util.RockType;
import tv.mapper.mapperbase.MapperBase;

public class ECFeatures
{
    public static ConfiguredFeature<?, ?> BASALT = Feature.ORE.configured(new OreConfiguration(OreConfiguration.Predicates.NATURAL_STONE, InitRockBlocks.ROCK_BLOCKS.get(RockType.BASALT).get().defaultBlockState(), CommonConfig.BASALT_SIZE.get())).rangeUniform(VerticalAnchor.absolute(CommonConfig.BASALT_MIN_HEIGHT.get()), VerticalAnchor.absolute(CommonConfig.BASALT_MAX_HEIGHT.get())).squared().count(CommonConfig.BASALT_CHANCE.get());

    public static ConfiguredFeature<?, ?> SLATE = Feature.ORE.configured(new OreConfiguration(OreConfiguration.Predicates.NATURAL_STONE, InitRockBlocks.ROCK_BLOCKS.get(RockType.SLATE).get().defaultBlockState(), CommonConfig.SLATE_SIZE.get())).rangeUniform(VerticalAnchor.absolute(CommonConfig.SLATE_MIN_HEIGHT.get()), VerticalAnchor.absolute(CommonConfig.SLATE_MAX_HEIGHT.get())).squared().count(CommonConfig.SLATE_CHANCE.get());

    public static ConfiguredFeature<?, ?> MARBLE = Feature.ORE.configured(new OreConfiguration(OreConfiguration.Predicates.NATURAL_STONE, InitRockBlocks.ROCK_BLOCKS.get(RockType.MARBLE).get().defaultBlockState(), CommonConfig.MARBLE_SIZE.get())).rangeUniform(VerticalAnchor.absolute(CommonConfig.MARBLE_MIN_HEIGHT.get()), VerticalAnchor.absolute(CommonConfig.MARBLE_MAX_HEIGHT.get())).squared().count(CommonConfig.MARBLE_CHANCE.get());

    public static ConfiguredFeature<?, ?> GNEISS = Feature.ORE.configured(new OreConfiguration(OreConfiguration.Predicates.NATURAL_STONE, InitRockBlocks.ROCK_BLOCKS.get(RockType.GNEISS).get().defaultBlockState(), CommonConfig.GNEISS_SIZE.get())).rangeUniform(VerticalAnchor.absolute(CommonConfig.GNEISS_MIN_HEIGHT.get()), VerticalAnchor.absolute(CommonConfig.GNEISS_MAX_HEIGHT.get())).squared().count(CommonConfig.GNEISS_CHANCE.get());

    public static ConfiguredFeature<?, ?> JADE = Feature.ORE.configured(new OreConfiguration(OreConfiguration.Predicates.NATURAL_STONE, InitRockBlocks.ROCK_BLOCKS.get(RockType.JADE).get().defaultBlockState(), CommonConfig.JADE_SIZE.get())).rangeUniform(VerticalAnchor.absolute(CommonConfig.JADE_MIN_HEIGHT.get()), VerticalAnchor.absolute(CommonConfig.JADE_MAX_HEIGHT.get())).squared().count(CommonConfig.JADE_CHANCE.get());

    public static ConfiguredFeature<?, ?> LARVIKITE = Feature.ORE.configured(new OreConfiguration(OreConfiguration.Predicates.NATURAL_STONE, InitRockBlocks.ROCK_BLOCKS.get(RockType.LARVIKITE).get().defaultBlockState(), CommonConfig.LARVIKITE_SIZE.get())).rangeUniform(VerticalAnchor.absolute(CommonConfig.LARVIKITE_MIN_HEIGHT.get()), VerticalAnchor.absolute(CommonConfig.LARVIKITE_MAX_HEIGHT.get())).squared().count(CommonConfig.LARVIKITE_CHANCE.get());

    public static void registerFeatures()
    {
        Registry<ConfiguredFeature<?, ?>> registry = BuiltinRegistries.CONFIGURED_FEATURE;

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