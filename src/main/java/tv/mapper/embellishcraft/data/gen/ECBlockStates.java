package tv.mapper.embellishcraft.data.gen;

import java.util.function.Function;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.data.DataGenerator;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraftforge.client.model.generators.ConfiguredModel;
import net.minecraftforge.client.model.generators.ExistingFileHelper;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.client.model.generators.ModelFile.UncheckedModelFile;
import net.minecraftforge.client.model.generators.MultiPartBlockStateBuilder;
import tv.mapper.embellishcraft.ECConstants;
import tv.mapper.embellishcraft.block.ECBlockRegistry;
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
        // Basalt
        simpleBlock(ECBlockRegistry.BASALT.get());
        slabBlock(ECBlockRegistry.BASALT_SLAB.get(), modLoc("block/basalt"), modLoc("block/basalt"));
        stairsBlock(ECBlockRegistry.BASALT_STAIRS.get(), modLoc("block/basalt"));
        wallBlock(ECBlockRegistry.BASALT_WALL.get(), modLoc("block/basalt"));
        pressurePlateBlock(ECBlockRegistry.BASALT_PRESSURE_PLATE.get(), new UncheckedModelFile(ECConstants.MODID + ":block/basalt_pressure_plate"),
            new UncheckedModelFile(ECConstants.MODID + ":block/basalt_pressure_plate_down"));

        simpleBlock(ECBlockRegistry.BASALT_COBBLESTONE.get());
        slabBlock(ECBlockRegistry.BASALT_COBBLESTONE_SLAB.get(), modLoc("block/basalt_cobblestone"), modLoc("block/basalt_cobblestone"));
        stairsBlock(ECBlockRegistry.BASALT_COBBLESTONE_STAIRS.get(), modLoc("block/basalt_cobblestone"));
        wallBlock(ECBlockRegistry.BASALT_COBBLESTONE_WALL.get(), modLoc("block/basalt_cobblestone"));
        pressurePlateBlock(ECBlockRegistry.BASALT_COBBLESTONE_PRESSURE_PLATE.get(), new UncheckedModelFile(ECConstants.MODID + ":block/basalt_cobblestone_pressure_plate"),
            new UncheckedModelFile(ECConstants.MODID + ":block/basalt_cobblestone_pressure_plate_down"));

        simpleBlock(ECBlockRegistry.BASALT_BRICKS.get());
        slabBlock(ECBlockRegistry.BASALT_BRICKS_SLAB.get(), modLoc("block/basalt_bricks"), modLoc("block/basalt_bricks"));
        stairsBlock(ECBlockRegistry.BASALT_BRICKS_STAIRS.get(), modLoc("block/basalt_bricks"));
        wallBlock(ECBlockRegistry.BASALT_BRICKS_WALL.get(), modLoc("block/basalt_bricks"));
        pressurePlateBlock(ECBlockRegistry.BASALT_BRICKS_PRESSURE_PLATE.get(), new UncheckedModelFile(ECConstants.MODID + ":block/basalt_bricks_pressure_plate"),
            new UncheckedModelFile(ECConstants.MODID + ":block/basalt_bricks_pressure_plate_down"));

        simpleBlock(ECBlockRegistry.BASALT_LARGE_BRICKS.get());
        slabBlock(ECBlockRegistry.BASALT_LARGE_BRICKS_SLAB.get(), modLoc("block/basalt_large_bricks"), modLoc("block/basalt_large_bricks"));
        stairsBlock(ECBlockRegistry.BASALT_LARGE_BRICKS_STAIRS.get(), modLoc("block/basalt_large_bricks"));
        wallBlock(ECBlockRegistry.BASALT_LARGE_BRICKS_WALL.get(), modLoc("block/basalt_large_bricks"));
        pressurePlateBlock(ECBlockRegistry.BASALT_LARGE_BRICKS_PRESSURE_PLATE.get(), new UncheckedModelFile(ECConstants.MODID + ":block/basalt_large_bricks_pressure_plate"),
            new UncheckedModelFile(ECConstants.MODID + ":block/basalt_large_bricks_pressure_plate_down"));

        // Slate
        simpleBlock(ECBlockRegistry.SLATE.get());
        slabBlock(ECBlockRegistry.SLATE_SLAB.get(), modLoc("block/slate"), modLoc("block/slate"));
        stairsBlock(ECBlockRegistry.SLATE_STAIRS.get(), modLoc("block/slate"));
        wallBlock(ECBlockRegistry.SLATE_WALL.get(), modLoc("block/slate"));
        pressurePlateBlock(ECBlockRegistry.SLATE_PRESSURE_PLATE.get(), new UncheckedModelFile(ECConstants.MODID + ":block/slate_pressure_plate"),
            new UncheckedModelFile(ECConstants.MODID + ":block/slate_pressure_plate_down"));

        simpleBlock(ECBlockRegistry.SLATE_COBBLESTONE.get());
        slabBlock(ECBlockRegistry.SLATE_COBBLESTONE_SLAB.get(), modLoc("block/slate_cobblestone"), modLoc("block/slate_cobblestone"));
        stairsBlock(ECBlockRegistry.SLATE_COBBLESTONE_STAIRS.get(), modLoc("block/slate_cobblestone"));
        wallBlock(ECBlockRegistry.SLATE_COBBLESTONE_WALL.get(), modLoc("block/slate_cobblestone"));
        pressurePlateBlock(ECBlockRegistry.SLATE_COBBLESTONE_PRESSURE_PLATE.get(), new UncheckedModelFile(ECConstants.MODID + ":block/slate_cobblestone_pressure_plate"),
            new UncheckedModelFile(ECConstants.MODID + ":block/slate_cobblestone_pressure_plate_down"));

        simpleBlock(ECBlockRegistry.SLATE_BRICKS.get());
        slabBlock(ECBlockRegistry.SLATE_BRICKS_SLAB.get(), modLoc("block/slate_bricks"), modLoc("block/slate_bricks"));
        stairsBlock(ECBlockRegistry.SLATE_BRICKS_STAIRS.get(), modLoc("block/slate_bricks"));
        wallBlock(ECBlockRegistry.SLATE_BRICKS_WALL.get(), modLoc("block/slate_bricks"));
        pressurePlateBlock(ECBlockRegistry.SLATE_BRICKS_PRESSURE_PLATE.get(), new UncheckedModelFile(ECConstants.MODID + ":block/slate_bricks_pressure_plate"),
            new UncheckedModelFile(ECConstants.MODID + ":block/slate_bricks_pressure_plate_down"));

        simpleBlock(ECBlockRegistry.SLATE_LARGE_BRICKS.get());
        slabBlock(ECBlockRegistry.SLATE_LARGE_BRICKS_SLAB.get(), modLoc("block/slate_large_bricks"), modLoc("block/slate_large_bricks"));
        stairsBlock(ECBlockRegistry.SLATE_LARGE_BRICKS_STAIRS.get(), modLoc("block/slate_large_bricks"));
        wallBlock(ECBlockRegistry.SLATE_LARGE_BRICKS_WALL.get(), modLoc("block/slate_large_bricks"));
        pressurePlateBlock(ECBlockRegistry.SLATE_LARGE_BRICKS_PRESSURE_PLATE.get(), new UncheckedModelFile(ECConstants.MODID + ":block/slate_large_bricks_pressure_plate"),
            new UncheckedModelFile(ECConstants.MODID + ":block/slate_large_bricks_pressure_plate_down"));

        // Marble
        simpleBlock(ECBlockRegistry.MARBLE.get());
        slabBlock(ECBlockRegistry.MARBLE_SLAB.get(), modLoc("block/marble"), modLoc("block/marble"));
        stairsBlock(ECBlockRegistry.MARBLE_STAIRS.get(), modLoc("block/marble"));
        wallBlock(ECBlockRegistry.MARBLE_WALL.get(), modLoc("block/marble"));
        pressurePlateBlock(ECBlockRegistry.MARBLE_PRESSURE_PLATE.get(), new UncheckedModelFile(ECConstants.MODID + ":block/marble_pressure_plate"),
            new UncheckedModelFile(ECConstants.MODID + ":block/marble_pressure_plate_down"));

        simpleBlock(ECBlockRegistry.MARBLE_COBBLESTONE.get());
        slabBlock(ECBlockRegistry.MARBLE_COBBLESTONE_SLAB.get(), modLoc("block/marble_cobblestone"), modLoc("block/marble_cobblestone"));
        stairsBlock(ECBlockRegistry.MARBLE_COBBLESTONE_STAIRS.get(), modLoc("block/marble_cobblestone"));
        wallBlock(ECBlockRegistry.MARBLE_COBBLESTONE_WALL.get(), modLoc("block/marble_cobblestone"));
        pressurePlateBlock(ECBlockRegistry.MARBLE_COBBLESTONE_PRESSURE_PLATE.get(), new UncheckedModelFile(ECConstants.MODID + ":block/marble_cobblestone_pressure_plate"),
            new UncheckedModelFile(ECConstants.MODID + ":block/marble_cobblestone_pressure_plate_down"));

        simpleBlock(ECBlockRegistry.MARBLE_BRICKS.get());
        slabBlock(ECBlockRegistry.MARBLE_BRICKS_SLAB.get(), modLoc("block/marble_bricks"), modLoc("block/marble_bricks"));
        stairsBlock(ECBlockRegistry.MARBLE_BRICKS_STAIRS.get(), modLoc("block/marble_bricks"));
        wallBlock(ECBlockRegistry.MARBLE_BRICKS_WALL.get(), modLoc("block/marble_bricks"));
        pressurePlateBlock(ECBlockRegistry.MARBLE_BRICKS_PRESSURE_PLATE.get(), new UncheckedModelFile(ECConstants.MODID + ":block/marble_bricks_pressure_plate"),
            new UncheckedModelFile(ECConstants.MODID + ":block/marble_bricks_pressure_plate_down"));

        simpleBlock(ECBlockRegistry.MARBLE_LARGE_BRICKS.get());
        slabBlock(ECBlockRegistry.MARBLE_LARGE_BRICKS_SLAB.get(), modLoc("block/marble_large_bricks"), modLoc("block/marble_large_bricks"));
        stairsBlock(ECBlockRegistry.MARBLE_LARGE_BRICKS_STAIRS.get(), modLoc("block/marble_large_bricks"));
        wallBlock(ECBlockRegistry.MARBLE_LARGE_BRICKS_WALL.get(), modLoc("block/marble_large_bricks"));
        pressurePlateBlock(ECBlockRegistry.MARBLE_LARGE_BRICKS_PRESSURE_PLATE.get(), new UncheckedModelFile(ECConstants.MODID + ":block/marble_large_bricks_pressure_plate"),
            new UncheckedModelFile(ECConstants.MODID + ":block/marble_large_bricks_pressure_plate_down"));

        // Gneiss
        simpleBlock(ECBlockRegistry.GNEISS.get());
        slabBlock(ECBlockRegistry.GNEISS_SLAB.get(), modLoc("block/gneiss"), modLoc("block/gneiss"));
        stairsBlock(ECBlockRegistry.GNEISS_STAIRS.get(), modLoc("block/gneiss"));
        wallBlock(ECBlockRegistry.GNEISS_WALL.get(), modLoc("block/gneiss"));
        pressurePlateBlock(ECBlockRegistry.GNEISS_PRESSURE_PLATE.get(), new UncheckedModelFile(ECConstants.MODID + ":block/gneiss_pressure_plate"),
            new UncheckedModelFile(ECConstants.MODID + ":block/gneiss_pressure_plate_down"));

        simpleBlock(ECBlockRegistry.GNEISS_COBBLESTONE.get());
        slabBlock(ECBlockRegistry.GNEISS_COBBLESTONE_SLAB.get(), modLoc("block/gneiss_cobblestone"), modLoc("block/gneiss_cobblestone"));
        stairsBlock(ECBlockRegistry.GNEISS_COBBLESTONE_STAIRS.get(), modLoc("block/gneiss_cobblestone"));
        wallBlock(ECBlockRegistry.GNEISS_COBBLESTONE_WALL.get(), modLoc("block/gneiss_cobblestone"));
        pressurePlateBlock(ECBlockRegistry.GNEISS_COBBLESTONE_PRESSURE_PLATE.get(), new UncheckedModelFile(ECConstants.MODID + ":block/gneiss_cobblestone_pressure_plate"),
            new UncheckedModelFile(ECConstants.MODID + ":block/gneiss_cobblestone_pressure_plate_down"));

        simpleBlock(ECBlockRegistry.GNEISS_BRICKS.get());
        slabBlock(ECBlockRegistry.GNEISS_BRICKS_SLAB.get(), modLoc("block/gneiss_bricks"), modLoc("block/gneiss_bricks"));
        stairsBlock(ECBlockRegistry.GNEISS_BRICKS_STAIRS.get(), modLoc("block/gneiss_bricks"));
        wallBlock(ECBlockRegistry.GNEISS_BRICKS_WALL.get(), modLoc("block/gneiss_bricks"));
        pressurePlateBlock(ECBlockRegistry.GNEISS_BRICKS_PRESSURE_PLATE.get(), new UncheckedModelFile(ECConstants.MODID + ":block/gneiss_bricks_pressure_plate"),
            new UncheckedModelFile(ECConstants.MODID + ":block/gneiss_bricks_pressure_plate_down"));

        simpleBlock(ECBlockRegistry.GNEISS_LARGE_BRICKS.get());
        slabBlock(ECBlockRegistry.GNEISS_LARGE_BRICKS_SLAB.get(), modLoc("block/gneiss_large_bricks"), modLoc("block/gneiss_large_bricks"));
        stairsBlock(ECBlockRegistry.GNEISS_LARGE_BRICKS_STAIRS.get(), modLoc("block/gneiss_large_bricks"));
        wallBlock(ECBlockRegistry.GNEISS_LARGE_BRICKS_WALL.get(), modLoc("block/gneiss_large_bricks"));
        pressurePlateBlock(ECBlockRegistry.GNEISS_LARGE_BRICKS_PRESSURE_PLATE.get(), new UncheckedModelFile(ECConstants.MODID + ":block/gneiss_large_bricks_pressure_plate"),
            new UncheckedModelFile(ECConstants.MODID + ":block/gneiss_large_bricks_pressure_plate_down"));

        // Jade
        simpleBlock(ECBlockRegistry.JADE.get());
        slabBlock(ECBlockRegistry.JADE_SLAB.get(), modLoc("block/jade"), modLoc("block/jade"));
        stairsBlock(ECBlockRegistry.JADE_STAIRS.get(), modLoc("block/jade"));
        wallBlock(ECBlockRegistry.JADE_WALL.get(), modLoc("block/jade"));
        pressurePlateBlock(ECBlockRegistry.JADE_PRESSURE_PLATE.get(), new UncheckedModelFile(ECConstants.MODID + ":block/jade_pressure_plate"),
            new UncheckedModelFile(ECConstants.MODID + ":block/jade_pressure_plate_down"));

        simpleBlock(ECBlockRegistry.JADE_COBBLESTONE.get());
        slabBlock(ECBlockRegistry.JADE_COBBLESTONE_SLAB.get(), modLoc("block/jade_cobblestone"), modLoc("block/jade_cobblestone"));
        stairsBlock(ECBlockRegistry.JADE_COBBLESTONE_STAIRS.get(), modLoc("block/jade_cobblestone"));
        wallBlock(ECBlockRegistry.JADE_COBBLESTONE_WALL.get(), modLoc("block/jade_cobblestone"));
        pressurePlateBlock(ECBlockRegistry.JADE_COBBLESTONE_PRESSURE_PLATE.get(), new UncheckedModelFile(ECConstants.MODID + ":block/jade_cobblestone_pressure_plate"),
            new UncheckedModelFile(ECConstants.MODID + ":block/jade_cobblestone_pressure_plate_down"));

        simpleBlock(ECBlockRegistry.JADE_BRICKS.get());
        slabBlock(ECBlockRegistry.JADE_BRICKS_SLAB.get(), modLoc("block/jade_bricks"), modLoc("block/jade_bricks"));
        stairsBlock(ECBlockRegistry.JADE_BRICKS_STAIRS.get(), modLoc("block/jade_bricks"));
        wallBlock(ECBlockRegistry.JADE_BRICKS_WALL.get(), modLoc("block/jade_bricks"));
        pressurePlateBlock(ECBlockRegistry.JADE_BRICKS_PRESSURE_PLATE.get(), new UncheckedModelFile(ECConstants.MODID + ":block/jade_bricks_pressure_plate"),
            new UncheckedModelFile(ECConstants.MODID + ":block/jade_bricks_pressure_plate_down"));

        simpleBlock(ECBlockRegistry.JADE_LARGE_BRICKS.get());
        slabBlock(ECBlockRegistry.JADE_LARGE_BRICKS_SLAB.get(), modLoc("block/jade_large_bricks"), modLoc("block/jade_large_bricks"));
        stairsBlock(ECBlockRegistry.JADE_LARGE_BRICKS_STAIRS.get(), modLoc("block/jade_large_bricks"));
        wallBlock(ECBlockRegistry.JADE_LARGE_BRICKS_WALL.get(), modLoc("block/jade_large_bricks"));
        pressurePlateBlock(ECBlockRegistry.JADE_LARGE_BRICKS_PRESSURE_PLATE.get(), new UncheckedModelFile(ECConstants.MODID + ":block/jade_large_bricks_pressure_plate"),
            new UncheckedModelFile(ECConstants.MODID + ":block/jade_large_bricks_pressure_plate_down"));

        // Larvikite
        simpleBlock(ECBlockRegistry.LARVIKITE.get());
        slabBlock(ECBlockRegistry.LARVIKITE_SLAB.get(), modLoc("block/larvikite"), modLoc("block/larvikite"));
        stairsBlock(ECBlockRegistry.LARVIKITE_STAIRS.get(), modLoc("block/larvikite"));
        wallBlock(ECBlockRegistry.LARVIKITE_WALL.get(), modLoc("block/larvikite"));
        pressurePlateBlock(ECBlockRegistry.LARVIKITE_PRESSURE_PLATE.get(), new UncheckedModelFile(ECConstants.MODID + ":block/larvikite_pressure_plate"),
            new UncheckedModelFile(ECConstants.MODID + ":block/larvikite_pressure_plate_down"));

        simpleBlock(ECBlockRegistry.LARVIKITE_COBBLESTONE.get());
        slabBlock(ECBlockRegistry.LARVIKITE_COBBLESTONE_SLAB.get(), modLoc("block/larvikite_cobblestone"), modLoc("block/larvikite_cobblestone"));
        stairsBlock(ECBlockRegistry.LARVIKITE_COBBLESTONE_STAIRS.get(), modLoc("block/larvikite_cobblestone"));
        wallBlock(ECBlockRegistry.LARVIKITE_COBBLESTONE_WALL.get(), modLoc("block/larvikite_cobblestone"));
        pressurePlateBlock(ECBlockRegistry.LARVIKITE_COBBLESTONE_PRESSURE_PLATE.get(), new UncheckedModelFile(ECConstants.MODID + ":block/larvikite_cobblestone_pressure_plate"),
            new UncheckedModelFile(ECConstants.MODID + ":block/larvikite_cobblestone_pressure_plate_down"));

        simpleBlock(ECBlockRegistry.LARVIKITE_BRICKS.get());
        slabBlock(ECBlockRegistry.LARVIKITE_BRICKS_SLAB.get(), modLoc("block/larvikite_bricks"), modLoc("block/larvikite_bricks"));
        stairsBlock(ECBlockRegistry.LARVIKITE_BRICKS_STAIRS.get(), modLoc("block/larvikite_bricks"));
        wallBlock(ECBlockRegistry.LARVIKITE_BRICKS_WALL.get(), modLoc("block/larvikite_bricks"));
        pressurePlateBlock(ECBlockRegistry.LARVIKITE_BRICKS_PRESSURE_PLATE.get(), new UncheckedModelFile(ECConstants.MODID + ":block/larvikite_bricks_pressure_plate"),
            new UncheckedModelFile(ECConstants.MODID + ":block/larvikite_bricks_pressure_plate_down"));

        simpleBlock(ECBlockRegistry.LARVIKITE_LARGE_BRICKS.get());
        slabBlock(ECBlockRegistry.LARVIKITE_LARGE_BRICKS_SLAB.get(), modLoc("block/larvikite_large_bricks"), modLoc("block/larvikite_large_bricks"));
        stairsBlock(ECBlockRegistry.LARVIKITE_LARGE_BRICKS_STAIRS.get(), modLoc("block/larvikite_large_bricks"));
        wallBlock(ECBlockRegistry.LARVIKITE_LARGE_BRICKS_WALL.get(), modLoc("block/larvikite_large_bricks"));
        pressurePlateBlock(ECBlockRegistry.LARVIKITE_LARGE_BRICKS_PRESSURE_PLATE.get(), new UncheckedModelFile(ECConstants.MODID + ":block/larvikite_large_bricks_pressure_plate"),
            new UncheckedModelFile(ECConstants.MODID + ":block/larvikite_large_bricks_pressure_plate_down"));
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