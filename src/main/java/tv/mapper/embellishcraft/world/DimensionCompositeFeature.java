package tv.mapper.embellishcraft.world;

import net.minecraft.world.gen.feature.IFeatureConfig;
import net.minecraft.world.gen.placement.IPlacementConfig;

// Credits to McJty for this class.

public class DimensionCompositeFeature<F extends IFeatureConfig, D extends IPlacementConfig>
/* extends CompositeFeature<F, D> */ {

    // private final DimensionType dimension;
    //
    // public DimensionCompositeFeature(Feature<F> featureIn, F featureConfigIn, Placement<D> basePlacementIn, D placementConfigIn, @Nonnull DimensionType dimension) {
    // super(featureIn, featureConfigIn, basePlacementIn, placementConfigIn);
    // this.dimension = dimension;
    // }
    //
    // @Override
    // public boolean func_212245_a(IWorld world, ChunkGenerator<? extends GenerationSettings> chunkGenerator, Random random, BlockPos pos, NoFeatureConfig config) {
    // if (world.getDimension().getType().equals(dimension)) {
    // return super.func_212245_a(world, chunkGenerator, random, pos, config);
    // }
    // return false;
    // }
}