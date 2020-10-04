package tv.mapper.embellishcraft.world;

import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.gen.placement.TopSolidRangeConfig;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import tv.mapper.embellishcraft.block.ECBlockRegistry;
import tv.mapper.embellishcraft.config.EmbellishCraftConfig.CommonConfig;
import tv.mapper.embellishcraft.util.RockType;
import tv.mapper.mapperbase.MapperBase;
import tv.mapper.mapperbase.config.BaseConfig.ClientConfig;

public class OreGenerator
{
    private static boolean generate;
    private ConfiguredFeature<?, ?> oreGen;

    @SubscribeEvent(priority = EventPriority.HIGH)
    public void registerOreGen(BiomeLoadingEvent event)
    {
        String biome = event.getName().toString();

        // Basalt
        if(CommonConfig.BASALT_WHITELIST_MODE.get())
        {
            if(CommonConfig.BASALT_BIOME_LIST.get().contains(biome))
            {
                generate = true;
                if(ClientConfig.ENABLE_GEN_LOGS.get())
                    MapperBase.LOGGER.info("Basalt whitelisted for biome " + biome + " in the config.");
            }
            else
                generate = false;
        }
        else
        {
            if(CommonConfig.BASALT_BIOME_LIST.get().contains(biome))
            {
                generate = false;
                if(ClientConfig.ENABLE_GEN_LOGS.get())
                    MapperBase.LOGGER.info("Basalt blacklisted for biome " + biome + " in the config.");
            }
            else
                generate = true;
        }

        if(generate)
        {
            oreGen = Feature.ORE.withConfiguration(
                new OreFeatureConfig(OreFeatureConfig.FillerBlockType.field_241882_a, ECBlockRegistry.ROCK_BLOCKS.get(RockType.BASALT).get().getDefaultState(), CommonConfig.BASALT_SIZE.get())).withPlacement(
                    Placement.field_242907_l.configure(
                        new TopSolidRangeConfig(CommonConfig.BASALT_MIN_HEIGHT.get(), CommonConfig.BASALT_MIN_HEIGHT.get(), CommonConfig.BASALT_MAX_HEIGHT.get()))).func_242728_a().func_242731_b(
                            CommonConfig.BASALT_CHANCE.get());

            event.getGeneration().withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, oreGen);
        }

        // Slate
        if(CommonConfig.SLATE_WHITELIST_MODE.get())
        {
            if(CommonConfig.SLATE_BIOME_LIST.get().contains(biome))
            {
                generate = true;
                if(ClientConfig.ENABLE_GEN_LOGS.get())
                    MapperBase.LOGGER.info("SLATE whitelisted for biome " + biome + " in the config.");
            }
            else
                generate = false;
        }
        else
        {
            if(CommonConfig.SLATE_BIOME_LIST.get().contains(biome))
            {
                generate = false;
                if(ClientConfig.ENABLE_GEN_LOGS.get())
                    MapperBase.LOGGER.info("SLATE blacklisted for biome " + biome + " in the config.");
            }
            else
                generate = true;
        }

        if(generate)
        {
            oreGen = Feature.ORE.withConfiguration(
                new OreFeatureConfig(OreFeatureConfig.FillerBlockType.field_241882_a, ECBlockRegistry.ROCK_BLOCKS.get(RockType.SLATE).get().getDefaultState(), CommonConfig.SLATE_SIZE.get())).withPlacement(
                    Placement.field_242907_l.configure(
                        new TopSolidRangeConfig(CommonConfig.SLATE_MIN_HEIGHT.get(), CommonConfig.SLATE_MIN_HEIGHT.get(), CommonConfig.SLATE_MAX_HEIGHT.get()))).func_242728_a().func_242731_b(
                            CommonConfig.SLATE_CHANCE.get());

            event.getGeneration().withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, oreGen);
        }

        // Marble
        if(CommonConfig.MARBLE_WHITELIST_MODE.get())
        {
            if(CommonConfig.MARBLE_BIOME_LIST.get().contains(biome))
            {
                generate = true;
                if(ClientConfig.ENABLE_GEN_LOGS.get())
                    MapperBase.LOGGER.info("MARBLE whitelisted for biome " + biome + " in the config.");
            }
            else
                generate = false;
        }
        else
        {
            if(CommonConfig.MARBLE_BIOME_LIST.get().contains(biome))
            {
                generate = false;
                if(ClientConfig.ENABLE_GEN_LOGS.get())
                    MapperBase.LOGGER.info("MARBLE blacklisted for biome " + biome + " in the config.");
            }
            else
                generate = true;
        }

        if(generate)
        {
            oreGen = Feature.ORE.withConfiguration(
                new OreFeatureConfig(OreFeatureConfig.FillerBlockType.field_241882_a, ECBlockRegistry.ROCK_BLOCKS.get(RockType.MARBLE).get().getDefaultState(), CommonConfig.MARBLE_SIZE.get())).withPlacement(
                    Placement.field_242907_l.configure(
                        new TopSolidRangeConfig(CommonConfig.MARBLE_MIN_HEIGHT.get(), CommonConfig.MARBLE_MIN_HEIGHT.get(), CommonConfig.MARBLE_MAX_HEIGHT.get()))).func_242728_a().func_242731_b(
                            CommonConfig.MARBLE_CHANCE.get());

            event.getGeneration().withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, oreGen);
        }

        // Gneiss
        if(CommonConfig.GNEISS_WHITELIST_MODE.get())
        {
            if(CommonConfig.GNEISS_BIOME_LIST.get().contains(biome))
            {
                generate = true;
                if(ClientConfig.ENABLE_GEN_LOGS.get())
                    MapperBase.LOGGER.info("GNEISS whitelisted for biome " + biome + " in the config.");
            }
            else
                generate = false;
        }
        else
        {
            if(CommonConfig.GNEISS_BIOME_LIST.get().contains(biome))
            {
                generate = false;
                if(ClientConfig.ENABLE_GEN_LOGS.get())
                    MapperBase.LOGGER.info("GNEISS blacklisted for biome " + biome + " in the config.");
            }
            else
                generate = true;
        }

        if(generate)
        {
            oreGen = Feature.ORE.withConfiguration(
                new OreFeatureConfig(OreFeatureConfig.FillerBlockType.field_241882_a, ECBlockRegistry.ROCK_BLOCKS.get(RockType.GNEISS).get().getDefaultState(), CommonConfig.GNEISS_SIZE.get())).withPlacement(
                    Placement.field_242907_l.configure(
                        new TopSolidRangeConfig(CommonConfig.GNEISS_MIN_HEIGHT.get(), CommonConfig.GNEISS_MIN_HEIGHT.get(), CommonConfig.GNEISS_MAX_HEIGHT.get()))).func_242728_a().func_242731_b(
                            CommonConfig.GNEISS_CHANCE.get());

            event.getGeneration().withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, oreGen);
        }

        // Jade
        if(CommonConfig.JADE_WHITELIST_MODE.get())
        {
            if(CommonConfig.JADE_BIOME_LIST.get().contains(biome))
            {
                generate = true;
                if(ClientConfig.ENABLE_GEN_LOGS.get())
                    MapperBase.LOGGER.info("JADE whitelisted for biome " + biome + " in the config.");
            }
            else
                generate = false;
        }
        else
        {
            if(CommonConfig.JADE_BIOME_LIST.get().contains(biome))
            {
                generate = false;
                if(ClientConfig.ENABLE_GEN_LOGS.get())
                    MapperBase.LOGGER.info("JADE blacklisted for biome " + biome + " in the config.");
            }
            else
                generate = true;
        }

        if(generate)
        {
            oreGen = Feature.ORE.withConfiguration(
                new OreFeatureConfig(OreFeatureConfig.FillerBlockType.field_241882_a, ECBlockRegistry.ROCK_BLOCKS.get(RockType.JADE).get().getDefaultState(), CommonConfig.JADE_SIZE.get())).withPlacement(
                    Placement.field_242907_l.configure(
                        new TopSolidRangeConfig(CommonConfig.JADE_MIN_HEIGHT.get(), CommonConfig.JADE_MIN_HEIGHT.get(), CommonConfig.JADE_MAX_HEIGHT.get()))).func_242728_a().func_242731_b(
                            CommonConfig.JADE_CHANCE.get());

            event.getGeneration().withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, oreGen);
        }

        // Larvikite
        if(CommonConfig.LARVIKITE_WHITELIST_MODE.get())
        {
            if(CommonConfig.LARVIKITE_BIOME_LIST.get().contains(biome))
            {
                generate = true;
                if(ClientConfig.ENABLE_GEN_LOGS.get())
                    MapperBase.LOGGER.info("LARVIKITE whitelisted for biome " + biome + " in the config.");
            }
            else
                generate = false;
        }
        else
        {
            if(CommonConfig.LARVIKITE_BIOME_LIST.get().contains(biome))
            {
                generate = false;
                if(ClientConfig.ENABLE_GEN_LOGS.get())
                    MapperBase.LOGGER.info("LARVIKITE blacklisted for biome " + biome + " in the config.");
            }
            else
                generate = true;
        }

        if(generate)
        {
            oreGen = Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.field_241882_a, ECBlockRegistry.ROCK_BLOCKS.get(
                RockType.LARVIKITE).get().getDefaultState(), CommonConfig.LARVIKITE_SIZE.get())).withPlacement(
                    Placement.field_242907_l.configure(
                        new TopSolidRangeConfig(CommonConfig.LARVIKITE_MIN_HEIGHT.get(), CommonConfig.LARVIKITE_MIN_HEIGHT.get(), CommonConfig.LARVIKITE_MAX_HEIGHT.get()))).func_242728_a().func_242731_b(
                            CommonConfig.LARVIKITE_CHANCE.get());

            event.getGeneration().withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, oreGen);
        }
    }
}