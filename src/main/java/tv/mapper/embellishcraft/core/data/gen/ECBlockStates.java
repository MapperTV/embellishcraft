package tv.mapper.embellishcraft.core.data.gen;

import java.util.function.Function;

import net.minecraft.data.DataGenerator;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraftforge.client.model.generators.ConfiguredModel;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.client.model.generators.ModelFile.UncheckedModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import tv.mapper.embellishcraft.core.ECConstants;
import tv.mapper.mapperbase.data.gen.BaseBlockStates;

public class ECBlockStates extends BaseBlockStates
{
    public ECBlockStates(DataGenerator gen, String modid, ExistingFileHelper exFileHelper)
    {
        super(gen, modid, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels()
    {}

    /**
     * Creates a blockstate file for blocks with slab, stairs, wall, pressure plate and button variants.
     */
    protected void registerBlockstateVariants(String name, Block block, SlabBlock slab, StairBlock stairs, WallBlock wall, Block pressure, Block button)
    {
        if(block != null)
            simpleBlock(block);
        if(slab != null)
            slabBlock(slab, modLoc("block/" + name), modLoc("block/" + name));
        if(stairs != null)
            stairsBlock(stairs, modLoc("block/" + name));
        if(wall != null)
            newWallBlock(wall, new UncheckedModelFile(ECConstants.MODID + ":block/" + name + "_wall_post"), new UncheckedModelFile(ECConstants.MODID + ":block/" + name + "_wall_side"), new UncheckedModelFile(ECConstants.MODID + ":block/" + name + "_wall_side_tall"));
        if(pressure != null)
            pressurePlateBlock(pressure, new UncheckedModelFile(mod_id + ":block/" + name + "_pressure_plate"), new UncheckedModelFile(mod_id + ":block/" + name + "_pressure_plate_down"));
        if(button != null)
            buttonBlock(button, new UncheckedModelFile(mod_id + ":block/" + name + "_button"), new UncheckedModelFile(mod_id + ":block/" + name + "_button_pressed"), 180);
    }

    /**
     * Creates a blockstate file for blocks with slab, stairs, wall, pressure plate and button variants. The slab will use a dedicated side texture.
     */
    protected void registerBlockstateVariantsWithSideSlab(String name, Block block, SlabBlock slab, StairBlock stairs, WallBlock wall, Block pressure, Block button)
    {
        if(block != null)
            simpleBlock(block);
        if(slab != null)
            slabBlock(slab, modLoc("block/" + name), modLoc("block/" + name + "_side"), modLoc("block/" + name), modLoc("block/" + name));
        if(stairs != null)
            stairsBlock(stairs, modLoc("block/" + name));
        if(wall != null)
            newWallBlock(wall, new UncheckedModelFile(ECConstants.MODID + ":block/" + name + "_wall_post"), new UncheckedModelFile(ECConstants.MODID + ":block/" + name + "_wall_side"), new UncheckedModelFile(ECConstants.MODID + ":block/" + name + "_wall_side_tall"));
        if(pressure != null)
            pressurePlateBlock(pressure, new UncheckedModelFile(mod_id + ":block/" + name + "_pressure_plate"), new UncheckedModelFile(mod_id + ":block/" + name + "_pressure_plate_down"));
        if(button != null)
            buttonBlock(button, new UncheckedModelFile(mod_id + ":block/" + name + "_button"), new UncheckedModelFile(mod_id + ":block/" + name + "_button_pressed"), 180);
    }

    /**
     * Creates a blockstate file for blocks that have 4 orientations depending of cardinal (north, south etc). e.g. chairs, suspended stairs...
     */
    protected void orientableBlock(Block block, ModelFile model, int angleOffset)
    {
        orientableBlock(block, $ -> model, angleOffset);
    }

    /**
     * Creates a blockstate file for blocks that have 6 orientations.
     */
    protected void orientableBlock(Block block, Function<BlockState, ModelFile> modelFunc, int angleOffset)
    {
        getVariantBuilder(block).forAllStatesExcept(state -> ConfiguredModel.builder().modelFile(modelFunc.apply(state)).rotationY(((int)state.getValue(BlockStateProperties.HORIZONTAL_FACING).toYRot() + angleOffset) % 360).build(), BlockStateProperties.WATERLOGGED);
    }
}