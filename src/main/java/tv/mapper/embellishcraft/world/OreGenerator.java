package tv.mapper.embellishcraft.world;

import static net.minecraft.world.gen.feature.OreFeatureConfig.FillerBlockType.NATURAL_STONE;
import static net.minecraft.world.gen.placement.Placement.COUNT_RANGE;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraftforge.registries.ForgeRegistries;
import tv.mapper.embellishcraft.config.EmbellishCraftConfig.ServerConfig;
import tv.mapper.embellishcraft.init.ModBlocks;

public class OreGenerator
{
    public static void setupOregen()
    {
        for(Biome biome : ForgeRegistries.BIOMES)
        {
            if(ServerConfig.BASALT_GENERATION.get())
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(NATURAL_STONE, ModBlocks.BASALT.getDefaultState(), ServerConfig.BASALT_SIZE.get().intValue()), COUNT_RANGE, new CountRangeConfig(ServerConfig.BASALT_CHANCE.get(), ServerConfig.BASALT_MIN_HEIGHT.get(), ServerConfig.BASALT_MIN_HEIGHT.get(), ServerConfig.BASALT_MAX_HEIGHT.get())));
            if(ServerConfig.SLATE_GENERATION.get())
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(NATURAL_STONE, ModBlocks.SLATE.getDefaultState(), ServerConfig.SLATE_SIZE.get().intValue()), COUNT_RANGE, new CountRangeConfig(ServerConfig.SLATE_CHANCE.get(), ServerConfig.SLATE_MIN_HEIGHT.get(), ServerConfig.SLATE_MIN_HEIGHT.get(), ServerConfig.SLATE_MAX_HEIGHT.get())));
            if(ServerConfig.MARBLE_GENERATION.get())
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(NATURAL_STONE, ModBlocks.MARBLE.getDefaultState(), ServerConfig.MARBLE_SIZE.get().intValue()), COUNT_RANGE, new CountRangeConfig(ServerConfig.MARBLE_CHANCE.get(), ServerConfig.MARBLE_MIN_HEIGHT.get(), ServerConfig.MARBLE_MIN_HEIGHT.get(), ServerConfig.MARBLE_MAX_HEIGHT.get())));
            if(ServerConfig.GNEISS_GENERATION.get())
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(NATURAL_STONE, ModBlocks.GNEISS.getDefaultState(), ServerConfig.GNEISS_SIZE.get().intValue()), COUNT_RANGE, new CountRangeConfig(ServerConfig.GNEISS_CHANCE.get(), ServerConfig.GNEISS_MIN_HEIGHT.get(), ServerConfig.GNEISS_MIN_HEIGHT.get(), ServerConfig.GNEISS_MAX_HEIGHT.get())));
            if(ServerConfig.JADE_GENERATION.get())
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(NATURAL_STONE, ModBlocks.JADE.getDefaultState(), ServerConfig.JADE_SIZE.get().intValue()), COUNT_RANGE, new CountRangeConfig(ServerConfig.JADE_CHANCE.get(), ServerConfig.JADE_MIN_HEIGHT.get(), ServerConfig.JADE_MIN_HEIGHT.get(), ServerConfig.JADE_MAX_HEIGHT.get())));
            if(ServerConfig.LARVIKITE_GENERATION.get())
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(NATURAL_STONE, ModBlocks.LARVIKITE.getDefaultState(), ServerConfig.LARVIKITE_SIZE.get().intValue()), COUNT_RANGE, new CountRangeConfig(ServerConfig.LARVIKITE_CHANCE.get(), ServerConfig.LARVIKITE_MIN_HEIGHT.get(), ServerConfig.LARVIKITE_MIN_HEIGHT.get(), ServerConfig.LARVIKITE_MAX_HEIGHT.get())));
        }
    }
}
