package tv.mapper.embellishcraft.world;

import static net.minecraft.world.gen.feature.OreFeatureConfig.FillerBlockType.NATURAL_STONE;
import static net.minecraft.world.gen.placement.Placement.COUNT_RANGE;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraftforge.registries.ForgeRegistries;
import tv.mapper.embellishcraft.config.WorldgenConfig;
import tv.mapper.embellishcraft.init.ModBlocks;

public class OreGenerator
{
    public static void setupOregen()
    {
        for(Biome biome : ForgeRegistries.BIOMES)
        {
            if(WorldgenConfig.BASALT_GENERATION.get())
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(NATURAL_STONE, ModBlocks.BASALT_BLOCK.getDefaultState(), WorldgenConfig.BASALT_SIZE.get().intValue()), COUNT_RANGE, new CountRangeConfig(WorldgenConfig.BASALT_CHANCE.get(), WorldgenConfig.BASALT_MIN_HEIGHT.get(), WorldgenConfig.BASALT_MIN_HEIGHT.get(), WorldgenConfig.BASALT_MAX_HEIGHT.get())));
            if(WorldgenConfig.SLATE_GENERATION.get())
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(NATURAL_STONE, ModBlocks.SLATE_BLOCK.getDefaultState(), WorldgenConfig.SLATE_SIZE.get().intValue()), COUNT_RANGE, new CountRangeConfig(WorldgenConfig.SLATE_CHANCE.get(), WorldgenConfig.SLATE_MIN_HEIGHT.get(), WorldgenConfig.SLATE_MIN_HEIGHT.get(), WorldgenConfig.SLATE_MAX_HEIGHT.get())));
            if(WorldgenConfig.MARBLE_GENERATION.get())
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(NATURAL_STONE, ModBlocks.MARBLE_BLOCK.getDefaultState(), WorldgenConfig.MARBLE_SIZE.get().intValue()), COUNT_RANGE, new CountRangeConfig(WorldgenConfig.MARBLE_CHANCE.get(), WorldgenConfig.MARBLE_MIN_HEIGHT.get(), WorldgenConfig.MARBLE_MIN_HEIGHT.get(), WorldgenConfig.MARBLE_MAX_HEIGHT.get())));
        }
    }
}
