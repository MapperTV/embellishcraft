package tv.mapper.embellishcraft.world;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.dimension.DimensionType;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.MinableConfig;
import net.minecraft.world.gen.placement.CountRange;
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
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, new DimensionCompositeFeature<>(Feature.MINABLE, new MinableConfig(MinableConfig.IS_ROCK, ModBlocks.BASALT_BLOCK.getDefaultState(), WorldgenConfig.BASALT_SIZE.get()), new CountRange(), new CountRangeConfig(WorldgenConfig.BASALT_CHANCE.get(), WorldgenConfig.BASALT_MIN_HEIGHT.get(), WorldgenConfig.BASALT_MIN_HEIGHT.get(), WorldgenConfig.BASALT_MAX_HEIGHT.get()), DimensionType.OVERWORLD));
            if(WorldgenConfig.SLATE_GENERATION.get())
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, new DimensionCompositeFeature<>(Feature.MINABLE, new MinableConfig(MinableConfig.IS_ROCK, ModBlocks.SLATE_BLOCK.getDefaultState(), WorldgenConfig.SLATE_SIZE.get()), new CountRange(), new CountRangeConfig(WorldgenConfig.BASALT_CHANCE.get(), WorldgenConfig.SLATE_MIN_HEIGHT.get(), WorldgenConfig.SLATE_MIN_HEIGHT.get(), WorldgenConfig.SLATE_MAX_HEIGHT.get()), DimensionType.OVERWORLD));
            if(WorldgenConfig.MARBLE_GENERATION.get())
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, new DimensionCompositeFeature<>(Feature.MINABLE, new MinableConfig(MinableConfig.IS_ROCK, ModBlocks.MARBLE_BLOCK.getDefaultState(), WorldgenConfig.MARBLE_SIZE.get()), new CountRange(), new CountRangeConfig(WorldgenConfig.MARBLE_CHANCE.get(), WorldgenConfig.MARBLE_MIN_HEIGHT.get(), WorldgenConfig.MARBLE_MIN_HEIGHT.get(), WorldgenConfig.MARBLE_MAX_HEIGHT.get()), DimensionType.OVERWORLD));
        }
    }
}
