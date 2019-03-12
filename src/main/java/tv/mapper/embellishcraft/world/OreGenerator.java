package tv.mapper.embellishcraft.world;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.dimension.DimensionType;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.MinableConfig;
import net.minecraft.world.gen.placement.CountRange;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraftforge.registries.ForgeRegistries;
import tv.mapper.embellishcraft.init.ModBlocks;

public class OreGenerator
{
    public static void setupOregen()
    {
        for(Biome biome : ForgeRegistries.BIOMES)
        {            
            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, new DimensionCompositeFeature<>(Feature.MINABLE, new MinableConfig(MinableConfig.IS_ROCK, ModBlocks.BASALT_BLOCK.getDefaultState(), 33), new CountRange(), new CountRangeConfig(10, 0, 0, 40), DimensionType.OVERWORLD));
            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, new DimensionCompositeFeature<>(Feature.MINABLE, new MinableConfig(MinableConfig.IS_ROCK, ModBlocks.SLATE_BLOCK.getDefaultState(), 33), new CountRange(), new CountRangeConfig(10, 40, 40, 70), DimensionType.OVERWORLD));
            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, new DimensionCompositeFeature<>(Feature.MINABLE, new MinableConfig(MinableConfig.IS_ROCK, ModBlocks.MARBLE_BLOCK.getDefaultState(), 25), new CountRange(), new CountRangeConfig(10, 50, 40, 100), DimensionType.OVERWORLD));
        }
    }
}
