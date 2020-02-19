package tv.mapper.embellishcraft.data.gen;

import java.util.function.Function;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.StairsBlock;
import net.minecraft.block.WallBlock;
import net.minecraft.data.DataGenerator;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraftforge.client.model.generators.ConfiguredModel;
import net.minecraftforge.client.model.generators.ExistingFileHelper;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.client.model.generators.ModelFile.UncheckedModelFile;
import net.minecraftforge.client.model.generators.MultiPartBlockStateBuilder;
import tv.mapper.embellishcraft.ECConstants;
import tv.mapper.embellishcraft.block.ECBlockRegistry;
import tv.mapper.embellishcraft.block.ECBlocks;
import tv.mapper.embellishcraft.block.TableBlock;
import tv.mapper.mapperbase.data.gen.BaseBlockStates;

public class ECBlockStates extends BaseBlockStates
{
    public ECBlockStates(DataGenerator gen, ExistingFileHelper exFileHelper)
    {
        super(gen, ECConstants.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels()
    {
        simpleBlock(ECBlockRegistry.BASALT.get());
        slabBlock(ECBlockRegistry.BASALT_SLAB.get(), modLoc("block/basalt"), modLoc("block/basalt"));
        stairsBlock(ECBlockRegistry.BASALT_STAIRS.get(), modLoc("block/basalt"), modLoc("block/basalt"), modLoc("block/basalt"));
        wallBlock(ECBlockRegistry.BASALT_WALL.get(), modLoc("block/basalt"));
        pressurePlateBlock(ECBlockRegistry.BASALT_PRESSURE_PLATE.get(), new UncheckedModelFile(ECConstants.MODID + ":block/basalt_pressure_plate"),
            new UncheckedModelFile(ECConstants.MODID + ":block/basalt_pressure_plate_down"));

        simpleBlock(ECBlockRegistry.SLATE.get());
        slabBlock(ECBlockRegistry.SLATE_SLAB.get(), modLoc("block/slate"), modLoc("block/slate"));
        stairsBlock(ECBlockRegistry.SLATE_STAIRS.get(), modLoc("block/slate"), modLoc("block/slate"), modLoc("block/slate"));
        wallBlock(ECBlockRegistry.SLATE_WALL.get(), modLoc("block/slate"));
        pressurePlateBlock(ECBlockRegistry.SLATE_PRESSURE_PLATE.get(), new UncheckedModelFile(ECConstants.MODID + ":block/slate_pressure_plate"),
            new UncheckedModelFile(ECConstants.MODID + ":block/slate_pressure_plate_down"));

        simpleBlock(ECBlocks.MARBLE);
        slabBlock((SlabBlock)ECBlocks.MARBLE_SLAB, modLoc("block/marble"), modLoc("block/marble"));
        stairsBlock((StairsBlock)ECBlocks.MARBLE_STAIRS, modLoc("block/marble"), modLoc("block/marble"), modLoc("block/marble"));
        wallBlock((WallBlock)ECBlocks.MARBLE_WALL, modLoc("block/marble"));
        pressurePlateBlock(ECBlocks.MARBLE_PRESSURE_PLATE, new UncheckedModelFile(ECConstants.MODID + ":block/marble_pressure_plate"),
            new UncheckedModelFile(ECConstants.MODID + ":block/marble_pressure_plate_down"));

        simpleBlock(ECBlocks.GNEISS);
        slabBlock((SlabBlock)ECBlocks.GNEISS_SLAB, modLoc("block/gneiss"), modLoc("block/gneiss"));
        stairsBlock((StairsBlock)ECBlocks.GNEISS_STAIRS, modLoc("block/gneiss"), modLoc("block/gneiss"), modLoc("block/gneiss"));
        wallBlock((WallBlock)ECBlocks.GNEISS_WALL, modLoc("block/gneiss"));
        pressurePlateBlock(ECBlocks.GNEISS_PRESSURE_PLATE, new UncheckedModelFile(ECConstants.MODID + ":block/gneiss_pressure_plate"),
            new UncheckedModelFile(ECConstants.MODID + ":block/gneiss_pressure_plate_down"));

        simpleBlock(ECBlocks.JADE);
        slabBlock((SlabBlock)ECBlocks.JADE_SLAB, modLoc("block/jade"), modLoc("block/jade"));
        stairsBlock((StairsBlock)ECBlocks.JADE_STAIRS, modLoc("block/jade"), modLoc("block/jade"), modLoc("block/jade"));
        wallBlock((WallBlock)ECBlocks.JADE_WALL, modLoc("block/jade"));
        pressurePlateBlock(ECBlocks.JADE_PRESSURE_PLATE, new UncheckedModelFile(ECConstants.MODID + ":block/jade_pressure_plate"),
            new UncheckedModelFile(ECConstants.MODID + ":block/jade_pressure_plate_down"));

        simpleBlock(ECBlocks.LARVIKITE);
        slabBlock((SlabBlock)ECBlocks.LARVIKITE_SLAB, modLoc("block/larvikite"), modLoc("block/larvikite"));
        stairsBlock((StairsBlock)ECBlocks.LARVIKITE_STAIRS, modLoc("block/larvikite"), modLoc("block/larvikite"), modLoc("block/larvikite"));
        wallBlock((WallBlock)ECBlocks.LARVIKITE_WALL, modLoc("block/larvikite"));
        pressurePlateBlock(ECBlocks.LARVIKITE_PRESSURE_PLATE, new UncheckedModelFile(ECConstants.MODID + ":block/larvikite_pressure_plate"),
            new UncheckedModelFile(ECConstants.MODID + ":block/larvikite_pressure_plate_down"));

        simpleBlock(ECBlocks.BASALT_COBBLESTONE);
        slabBlock((SlabBlock)ECBlocks.BASALT_COBBLESTONE_SLAB, modLoc("block/basalt_cobblestone"), modLoc("block/basalt_cobblestone"));
        stairsBlock((StairsBlock)ECBlocks.BASALT_COBBLESTONE_STAIRS, modLoc("block/basalt_cobblestone"), modLoc("block/basalt_cobblestone"), modLoc("block/basalt_cobblestone"));
        wallBlock((WallBlock)ECBlocks.BASALT_COBBLESTONE_WALL, modLoc("block/basalt_cobblestone"));
        pressurePlateBlock(ECBlocks.BASALT_COBBLESTONE_PRESSURE_PLATE, new UncheckedModelFile(ECConstants.MODID + ":block/basalt_pressure_plate"),
            new UncheckedModelFile(ECConstants.MODID + ":block/basalt_pressure_plate_down"));

        simpleBlock(ECBlocks.SLATE_COBBLESTONE);
        slabBlock((SlabBlock)ECBlocks.SLATE_COBBLESTONE_SLAB, modLoc("block/slate_cobblestone"), modLoc("block/slate_cobblestone"));
        stairsBlock((StairsBlock)ECBlocks.SLATE_COBBLESTONE_STAIRS, modLoc("block/slate_cobblestone"), modLoc("block/slate_cobblestone"), modLoc("block/slate_cobblestone"));
        wallBlock((WallBlock)ECBlocks.SLATE_COBBLESTONE_WALL, modLoc("block/slate_cobblestone"));
        pressurePlateBlock(ECBlocks.SLATE_COBBLESTONE_PRESSURE_PLATE, new UncheckedModelFile(ECConstants.MODID + ":block/slate_pressure_plate"),
            new UncheckedModelFile(ECConstants.MODID + ":block/slate_pressure_plate_down"));

        simpleBlock(ECBlocks.MARBLE_COBBLESTONE);
        slabBlock((SlabBlock)ECBlocks.MARBLE_COBBLESTONE_SLAB, modLoc("block/marble_cobblestone"), modLoc("block/marble_cobblestone"));
        stairsBlock((StairsBlock)ECBlocks.MARBLE_COBBLESTONE_STAIRS, modLoc("block/marble_cobblestone"), modLoc("block/marble_cobblestone"), modLoc("block/marble_cobblestone"));
        wallBlock((WallBlock)ECBlocks.MARBLE_COBBLESTONE_WALL, modLoc("block/marble_cobblestone"));
        pressurePlateBlock(ECBlocks.MARBLE_COBBLESTONE_PRESSURE_PLATE, new UncheckedModelFile(ECConstants.MODID + ":block/marble_pressure_plate"),
            new UncheckedModelFile(ECConstants.MODID + ":block/marble_pressure_plate_down"));

        simpleBlock(ECBlocks.GNEISS_COBBLESTONE);
        slabBlock((SlabBlock)ECBlocks.GNEISS_COBBLESTONE_SLAB, modLoc("block/gneiss_cobblestone"), modLoc("block/gneiss_cobblestone"));
        stairsBlock((StairsBlock)ECBlocks.GNEISS_COBBLESTONE_STAIRS, modLoc("block/gneiss_cobblestone"), modLoc("block/gneiss_cobblestone"), modLoc("block/gneiss_cobblestone"));
        wallBlock((WallBlock)ECBlocks.GNEISS_COBBLESTONE_WALL, modLoc("block/gneiss_cobblestone"));
        pressurePlateBlock(ECBlocks.GNEISS_COBBLESTONE_PRESSURE_PLATE, new UncheckedModelFile(ECConstants.MODID + ":block/gneiss_pressure_plate"),
            new UncheckedModelFile(ECConstants.MODID + ":block/gneiss_pressure_plate_down"));

        simpleBlock(ECBlocks.JADE_COBBLESTONE);
        slabBlock((SlabBlock)ECBlocks.JADE_COBBLESTONE_SLAB, modLoc("block/jade_cobblestone"), modLoc("block/jade_cobblestone"));
        stairsBlock((StairsBlock)ECBlocks.JADE_COBBLESTONE_STAIRS, modLoc("block/jade_cobblestone"), modLoc("block/jade_cobblestone"), modLoc("block/jade_cobblestone"));
        wallBlock((WallBlock)ECBlocks.JADE_COBBLESTONE_WALL, modLoc("block/jade_cobblestone"));
        pressurePlateBlock(ECBlocks.JADE_COBBLESTONE_PRESSURE_PLATE, new UncheckedModelFile(ECConstants.MODID + ":block/jade_pressure_plate"),
            new UncheckedModelFile(ECConstants.MODID + ":block/jade_pressure_plate_down"));

        simpleBlock(ECBlocks.LARVIKITE_COBBLESTONE);
        slabBlock((SlabBlock)ECBlocks.LARVIKITE_COBBLESTONE_SLAB, modLoc("block/larvikite_cobblestone"), modLoc("block/larvikite_cobblestone"));
        stairsBlock((StairsBlock)ECBlocks.LARVIKITE_COBBLESTONE_STAIRS, modLoc("block/larvikite_cobblestone"), modLoc("block/larvikite_cobblestone"), modLoc("block/larvikite_cobblestone"));
        wallBlock((WallBlock)ECBlocks.LARVIKITE_COBBLESTONE_WALL, modLoc("block/larvikite_cobblestone"));
        pressurePlateBlock(ECBlocks.LARVIKITE_COBBLESTONE_PRESSURE_PLATE, new UncheckedModelFile(ECConstants.MODID + ":block/larvikite_pressure_plate"),
            new UncheckedModelFile(ECConstants.MODID + ":block/larvikite_pressure_plate_down"));
    }

    /**
     * Creates a blockstate file for blocks that have 4 orientations depeding of cardinal (north, south etc). e.g. chairs, suspended stairs...
     */
    protected void orientableBlock(Block block, ModelFile model, int angleOffset)
    {
        orientableBlock(block, $ -> model, angleOffset);
    }

    protected void orientableBlock(Block block, Function<BlockState, ModelFile> modelFunc, int angleOffset)
    {
        getVariantBuilder(block).forAllStatesExcept(
            state -> ConfiguredModel.builder().modelFile(modelFunc.apply(state)).rotationY(((int)state.get(BlockStateProperties.HORIZONTAL_FACING).getHorizontalAngle() + angleOffset) % 360).build(),
            BlockStateProperties.WATERLOGGED);
    }

    /**
     * Creates a blockstate file for the modular table blocks (noraml and fancy)
     */
    protected void tableBlock(Block block)
    {
        String name = block.getRegistryName().toString().replace("embellishcraft-bop:", "");
        MultiPartBlockStateBuilder builder = getMultipartBuilder(block).part().modelFile(new UncheckedModelFile(ECConstants.MODID + ":block/" + name + "_top")).addModel().end();
        builder.part().modelFile(new UncheckedModelFile(ECConstants.MODID + ":block/" + name + "_foot")).uvLock(true).addModel().condition(TableBlock.TABLE_NORTH, true).end();
        builder.part().modelFile(new UncheckedModelFile(ECConstants.MODID + ":block/" + name + "_foot")).rotationY(90).uvLock(true).addModel().condition(TableBlock.TABLE_EAST, true).end();
        builder.part().modelFile(new UncheckedModelFile(ECConstants.MODID + ":block/" + name + "_foot")).rotationY(180).uvLock(true).addModel().condition(TableBlock.TABLE_SOUTH, true).end();
        builder.part().modelFile(new UncheckedModelFile(ECConstants.MODID + ":block/" + name + "_foot")).rotationY(270).uvLock(true).addModel().condition(TableBlock.TABLE_WEST, true).end();
    }
}