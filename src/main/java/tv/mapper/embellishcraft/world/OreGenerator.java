package tv.mapper.embellishcraft.world;

import java.util.ArrayList;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.registries.ForgeRegistries;
import tv.mapper.embellishcraft.EmbellishCraft;
import tv.mapper.embellishcraft.block.ECBlockRegistry;
import tv.mapper.embellishcraft.config.EmbellishCraftConfig.CommonConfig;
import tv.mapper.embellishcraft.util.RockType;

public class OreGenerator
{
    private static boolean generate;

    public static void setupOregen()
    {
        // Check if config is correct
        ArrayList<String> biome_verify = new ArrayList<>();
        for(Biome biome : ForgeRegistries.BIOMES)
        {
            biome_verify.add(biome.getRegistryName().toString());
        }

        for(String name : CommonConfig.BASALT_BIOME_LIST.get())
        {
            if(!biome_verify.contains(name))
                EmbellishCraft.LOGGER.warn("Invalid biome '" + name + "' in embellishcraft-common.toml in basalt blacklist, please verify the entries!");
        }
        for(String name : CommonConfig.SLATE_BIOME_LIST.get())
        {
            if(!biome_verify.contains(name))
                EmbellishCraft.LOGGER.warn("Invalid biome '" + name + "' in embellishcraft-common.toml in slate blacklist, please verify the entries!");
        }
        for(String name : CommonConfig.MARBLE_BIOME_LIST.get())
        {
            if(!biome_verify.contains(name))
                EmbellishCraft.LOGGER.warn("Invalid biome '" + name + "' in embellishcraft-common.toml in marble blacklist, please verify the entries!");
        }
        for(String name : CommonConfig.GNEISS_BIOME_LIST.get())
        {
            if(!biome_verify.contains(name))
                EmbellishCraft.LOGGER.warn("Invalid biome '" + name + "' in embellishcraft-common.toml in gneiss blacklist, please verify the entries!");
        }
        for(String name : CommonConfig.JADE_BIOME_LIST.get())
        {
            if(!biome_verify.contains(name))
                EmbellishCraft.LOGGER.warn("Invalid biome '" + name + "' in embellishcraft-common.toml in jade blacklist, please verify the entries!");
        }
        for(String name : CommonConfig.LARVIKITE_BIOME_LIST.get())
        {
            if(!biome_verify.contains(name))
                EmbellishCraft.LOGGER.warn("Invalid biome '" + name + "' in embellishcraft-common.toml in larvikite blacklist, please verify the entries!");
        }

        // Adds rock generation in non-blacklisted biomes
        for(Biome biome : ForgeRegistries.BIOMES)
        {
            if(CommonConfig.BASALT_GENERATION.get())
            {
                if(CommonConfig.BASALT_BIOME_LIST.get().contains(biome.getRegistryName().toString()))
                {
                    if(CommonConfig.BASALT_LIST_MODE.get())
                    {
                        EmbellishCraft.LOGGER.info("Basalt whitelisted for biome " + biome.getRegistryName() + " in the config.");
                        generate = true;
                    }
                    else
                    {
                        EmbellishCraft.LOGGER.info("Basalt blacklisted for biome " + biome.getRegistryName() + " in the config.");
                        generate = false;
                    }
                }
                else
                {
                    if(CommonConfig.BASALT_LIST_MODE.get())
                        generate = false;
                    else
                        generate = true;
                }

                if(generate)
                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
                        Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, ECBlockRegistry.ROCK_BLOCKS.get(
                            RockType.BASALT).get().getDefaultState(), CommonConfig.BASALT_SIZE.get().intValue())).withPlacement(
                                Placement.COUNT_RANGE.configure(
                                    new CountRangeConfig(CommonConfig.BASALT_CHANCE.get(), CommonConfig.BASALT_MIN_HEIGHT.get(), CommonConfig.BASALT_MIN_HEIGHT.get(), CommonConfig.BASALT_MAX_HEIGHT.get()))));
            }

            if(CommonConfig.SLATE_GENERATION.get())
            {
                if(CommonConfig.SLATE_BIOME_LIST.get().contains(biome.getRegistryName().toString()))
                {
                    if(CommonConfig.SLATE_LIST_MODE.get())
                    {
                        EmbellishCraft.LOGGER.info("Slate whitelisted for biome " + biome.getRegistryName() + " in the config.");
                        generate = true;
                    }
                    else
                    {
                        EmbellishCraft.LOGGER.info("Slate blacklisted for biome " + biome.getRegistryName() + " in the config.");
                        generate = false;
                    }
                }
                else
                {
                    if(CommonConfig.SLATE_LIST_MODE.get())
                        generate = false;
                    else
                        generate = true;
                }

                if(generate)
                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
                        Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, ECBlockRegistry.ROCK_BLOCKS.get(
                            RockType.SLATE).get().getDefaultState(), CommonConfig.SLATE_SIZE.get().intValue())).withPlacement(
                                Placement.COUNT_RANGE.configure(
                                    new CountRangeConfig(CommonConfig.SLATE_CHANCE.get(), CommonConfig.SLATE_MIN_HEIGHT.get(), CommonConfig.SLATE_MIN_HEIGHT.get(), CommonConfig.SLATE_MAX_HEIGHT.get()))));
            }

            if(CommonConfig.MARBLE_GENERATION.get())
            {
                if(CommonConfig.MARBLE_BIOME_LIST.get().contains(biome.getRegistryName().toString()))
                {
                    if(CommonConfig.MARBLE_LIST_MODE.get())
                    {
                        EmbellishCraft.LOGGER.info("Marble whitelisted for biome " + biome.getRegistryName() + " in the config.");
                        generate = true;
                    }
                    else
                    {
                        EmbellishCraft.LOGGER.info("Marble blacklisted for biome " + biome.getRegistryName() + " in the config.");
                        generate = false;
                    }
                }
                else
                {
                    if(CommonConfig.MARBLE_LIST_MODE.get())
                        generate = false;
                    else
                        generate = true;
                }

                if(generate)
                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
                        Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, ECBlockRegistry.ROCK_BLOCKS.get(
                            RockType.MARBLE).get().getDefaultState(), CommonConfig.MARBLE_SIZE.get().intValue())).withPlacement(
                                Placement.COUNT_RANGE.configure(
                                    new CountRangeConfig(CommonConfig.MARBLE_CHANCE.get(), CommonConfig.MARBLE_MIN_HEIGHT.get(), CommonConfig.MARBLE_MIN_HEIGHT.get(), CommonConfig.MARBLE_MAX_HEIGHT.get()))));
            }

            if(CommonConfig.GNEISS_GENERATION.get())
            {
                if(CommonConfig.GNEISS_BIOME_LIST.get().contains(biome.getRegistryName().toString()))
                {
                    if(CommonConfig.GNEISS_LIST_MODE.get())
                    {
                        EmbellishCraft.LOGGER.info("Gneiss whitelisted for biome " + biome.getRegistryName() + " in the config.");
                        generate = true;
                    }
                    else
                    {
                        EmbellishCraft.LOGGER.info("Gneiss blacklisted for biome " + biome.getRegistryName() + " in the config.");
                        generate = false;
                    }
                }
                else
                {
                    if(CommonConfig.GNEISS_LIST_MODE.get())
                        generate = false;
                    else
                        generate = true;
                }

                if(generate)
                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
                        Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, ECBlockRegistry.ROCK_BLOCKS.get(
                            RockType.GNEISS).get().getDefaultState(), CommonConfig.GNEISS_SIZE.get().intValue())).withPlacement(
                                Placement.COUNT_RANGE.configure(
                                    new CountRangeConfig(CommonConfig.GNEISS_CHANCE.get(), CommonConfig.GNEISS_MIN_HEIGHT.get(), CommonConfig.GNEISS_MIN_HEIGHT.get(), CommonConfig.GNEISS_MAX_HEIGHT.get()))));
            }

            if(CommonConfig.JADE_GENERATION.get())
            {
                if(CommonConfig.JADE_BIOME_LIST.get().contains(biome.getRegistryName().toString()))
                {
                    if(CommonConfig.JADE_LIST_MODE.get())
                    {
                        EmbellishCraft.LOGGER.info("Jade whitelisted for biome " + biome.getRegistryName() + " in the config.");
                        generate = true;
                    }
                    else
                    {
                        EmbellishCraft.LOGGER.info("Jade blacklisted for biome " + biome.getRegistryName() + " in the config.");
                        generate = false;
                    }
                }
                else
                {
                    if(CommonConfig.JADE_LIST_MODE.get())
                        generate = false;
                    else
                        generate = true;
                }

                if(generate)
                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
                        Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, ECBlockRegistry.ROCK_BLOCKS.get(
                            RockType.JADE).get().getDefaultState(), CommonConfig.JADE_SIZE.get().intValue())).withPlacement(
                                Placement.COUNT_RANGE.configure(
                                    new CountRangeConfig(CommonConfig.JADE_CHANCE.get(), CommonConfig.JADE_MIN_HEIGHT.get(), CommonConfig.JADE_MIN_HEIGHT.get(), CommonConfig.JADE_MAX_HEIGHT.get()))));
            }

            if(CommonConfig.LARVIKITE_GENERATION.get())
            {
                if(CommonConfig.LARVIKITE_BIOME_LIST.get().contains(biome.getRegistryName().toString()))
                {
                    if(CommonConfig.LARVIKITE_LIST_MODE.get())
                    {
                        EmbellishCraft.LOGGER.info("Larvikite whitelisted for biome " + biome.getRegistryName() + " in the config.");
                        generate = true;
                    }
                    else
                    {
                        EmbellishCraft.LOGGER.info("Larvikite blacklisted for biome " + biome.getRegistryName() + " in the config.");
                        generate = false;
                    }
                }
                else
                {
                    if(CommonConfig.LARVIKITE_LIST_MODE.get())
                        generate = false;
                    else
                        generate = true;
                }

                if(generate)
                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
                        Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, ECBlockRegistry.ROCK_BLOCKS.get(
                            RockType.LARVIKITE).get().getDefaultState(), CommonConfig.LARVIKITE_SIZE.get().intValue())).withPlacement(Placement.COUNT_RANGE.configure(
                                new CountRangeConfig(CommonConfig.LARVIKITE_CHANCE.get(), CommonConfig.LARVIKITE_MIN_HEIGHT.get(), CommonConfig.LARVIKITE_MIN_HEIGHT.get(), CommonConfig.LARVIKITE_MAX_HEIGHT.get()))));
            }

        }
    }
}