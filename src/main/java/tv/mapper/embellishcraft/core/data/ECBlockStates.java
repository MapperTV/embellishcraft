package tv.mapper.embellishcraft.core.data;

import java.util.function.Function;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.ButtonBlock;
import net.minecraft.world.level.block.PressurePlateBlock;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.neoforged.neoforge.client.model.generators.ConfiguredModel;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import tv.mapper.mapperbase.api.data.BaseBlockStateProvider;

public class ECBlockStates extends BaseBlockStateProvider
{
    public ECBlockStates(PackOutput output, String modid, ExistingFileHelper exFileHelper, String name)
    {
        super(output, modid, exFileHelper, name);
    }

    @Override
    protected void registerStatesAndModels()
    {}

    /**
     * Creates a blockstate file for blocks with slab, stairs, wall, pressure plate and button variants.
     */
    protected void registerBlockstateVariants(String name, String modid, Block block, SlabBlock slab, StairBlock stairs, WallBlock wall, PressurePlateBlock pressure, ButtonBlock button)
    {
        if(block != null)
            simpleBlock(block);
        if(slab != null)
            slabBlock(slab, modLoc("block/" + name), modLoc("block/" + name));
        if(stairs != null)
            stairsBlock(stairs, modLoc("block/" + name));
        if(wall != null)
            wallBlock(wall, modLoc("block/" + name));
        if(pressure != null)
            pressurePlateBlock(pressure, modLoc("block/" + name));
        if(button != null)
            buttonBlock(button, ResourceLocation.fromNamespaceAndPath(modid, "block/" + name));
    }

    /**
     * Creates a blockstate file for blocks with slab, stairs, wall, pressure plate and button variants. The slab will use a dedicated side texture.
     */
    protected void registerBlockstateVariantsWithSideSlab(String name, Block block, SlabBlock slab, StairBlock stairs, WallBlock wall, PressurePlateBlock pressure, ButtonBlock button)
    {
        if(block != null)
            simpleBlock(block);
        if(slab != null)
            slabBlock(slab, modLoc("block/" + name), modLoc("block/" + name + "_side"), modLoc("block/" + name), modLoc("block/" + name));
        if(stairs != null)
            stairsBlock(stairs, modLoc("block/" + name));
        if(wall != null)
            wallBlock(wall, modLoc("block/" + name));
        if(pressure != null)
            pressurePlateBlock(pressure, modLoc("block/" + name));
        if(button != null)
            buttonBlock(button, modLoc("block/" + name));
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