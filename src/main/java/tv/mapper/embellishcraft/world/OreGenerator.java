package tv.mapper.embellishcraft.world;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.registries.ForgeRegistries;
import tv.mapper.embellishcraft.config.EmbellishCraftConfig.CommonConfig;
import tv.mapper.embellishcraft.init.ModBlocks;

public class OreGenerator
{
    public static void setupOregen()
    {
        for(Biome biome : ForgeRegistries.BIOMES)
        {
            if(CommonConfig.BASALT_GENERATION.get())
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(
                    new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, ModBlocks.BASALT.getDefaultState(), CommonConfig.BASALT_SIZE.get().intValue())).func_227228_a_(
                        Placement.COUNT_RANGE.func_227446_a_(
                            new CountRangeConfig(CommonConfig.BASALT_CHANCE.get(), CommonConfig.BASALT_MIN_HEIGHT.get(), CommonConfig.BASALT_MIN_HEIGHT.get(), CommonConfig.BASALT_MAX_HEIGHT.get()))));

            if(CommonConfig.SLATE_GENERATION.get())
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
                    Feature.ORE.func_225566_b_(
                        new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, ModBlocks.SLATE.getDefaultState(), CommonConfig.SLATE_SIZE.get().intValue())).func_227228_a_(
                            Placement.COUNT_RANGE.func_227446_a_(
                                new CountRangeConfig(CommonConfig.SLATE_CHANCE.get(), CommonConfig.SLATE_MIN_HEIGHT.get(), CommonConfig.SLATE_MIN_HEIGHT.get(), CommonConfig.SLATE_MAX_HEIGHT.get()))));

            if(CommonConfig.MARBLE_GENERATION.get())
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(
                    new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, ModBlocks.MARBLE.getDefaultState(), CommonConfig.MARBLE_SIZE.get().intValue())).func_227228_a_(
                        Placement.COUNT_RANGE.func_227446_a_(
                            new CountRangeConfig(CommonConfig.MARBLE_CHANCE.get(), CommonConfig.MARBLE_MIN_HEIGHT.get(), CommonConfig.MARBLE_MIN_HEIGHT.get(), CommonConfig.MARBLE_MAX_HEIGHT.get()))));

            if(CommonConfig.GNEISS_GENERATION.get())
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(
                    new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, ModBlocks.GNEISS.getDefaultState(), CommonConfig.GNEISS_SIZE.get().intValue())).func_227228_a_(
                        Placement.COUNT_RANGE.func_227446_a_(
                            new CountRangeConfig(CommonConfig.GNEISS_CHANCE.get(), CommonConfig.GNEISS_MIN_HEIGHT.get(), CommonConfig.GNEISS_MIN_HEIGHT.get(), CommonConfig.GNEISS_MAX_HEIGHT.get()))));

            if(CommonConfig.JADE_GENERATION.get())
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
                    Feature.ORE.func_225566_b_(
                        new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, ModBlocks.JADE.getDefaultState(), CommonConfig.JADE_SIZE.get().intValue())).func_227228_a_(
                            Placement.COUNT_RANGE.func_227446_a_(
                                new CountRangeConfig(CommonConfig.JADE_CHANCE.get(), CommonConfig.JADE_MIN_HEIGHT.get(), CommonConfig.JADE_MIN_HEIGHT.get(), CommonConfig.JADE_MAX_HEIGHT.get()))));

            if(CommonConfig.LARVIKITE_GENERATION.get())
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(
                    new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, ModBlocks.LARVIKITE.getDefaultState(), CommonConfig.LARVIKITE_SIZE.get().intValue())).func_227228_a_(
                        Placement.COUNT_RANGE.func_227446_a_(
                            new CountRangeConfig(CommonConfig.LARVIKITE_CHANCE.get(), CommonConfig.LARVIKITE_MIN_HEIGHT.get(), CommonConfig.LARVIKITE_MIN_HEIGHT.get(), CommonConfig.LARVIKITE_MAX_HEIGHT.get()))));
        }
    }
}
