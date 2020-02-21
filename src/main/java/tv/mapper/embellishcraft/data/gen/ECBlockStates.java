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

        simpleBlock(ECBlockRegistry.SMOOTH_BASALT.get());
        slabBlock(ECBlockRegistry.SMOOTH_BASALT_SLAB.get(), modLoc("block/smooth_basalt"), modLoc("block/smooth_basalt"));
        stairsBlock(ECBlockRegistry.SMOOTH_BASALT_STAIRS.get(), modLoc("block/smooth_basalt"));
        wallBlock(ECBlockRegistry.SMOOTH_BASALT_WALL.get(), modLoc("block/smooth_basalt"));
        pressurePlateBlock(ECBlockRegistry.SMOOTH_BASALT_PRESSURE_PLATE.get(), new UncheckedModelFile(ECConstants.MODID + ":block/smooth_basalt_pressure_plate"),
            new UncheckedModelFile(ECConstants.MODID + ":block/smooth_basalt_pressure_plate_down"));

        simpleBlock(ECBlockRegistry.POLISHED_BASALT.get());
        slabBlock(ECBlockRegistry.POLISHED_BASALT_SLAB.get(), modLoc("block/polished_basalt"), modLoc("block/polished_basalt"));
        stairsBlock(ECBlockRegistry.POLISHED_BASALT_STAIRS.get(), modLoc("block/polished_basalt"));
        wallBlock(ECBlockRegistry.POLISHED_BASALT_WALL.get(), modLoc("block/polished_basalt"));
        pressurePlateBlock(ECBlockRegistry.POLISHED_BASALT_PRESSURE_PLATE.get(), new UncheckedModelFile(ECConstants.MODID + ":block/polished_basalt_pressure_plate"),
            new UncheckedModelFile(ECConstants.MODID + ":block/polished_basalt_pressure_plate_down"));

        simpleBlock(ECBlockRegistry.BASALT_PAVING.get());
        slabBlock(ECBlockRegistry.BASALT_PAVING_SLAB.get(), modLoc("block/basalt_paving"), modLoc("block/basalt_paving"));
        stairsBlock(ECBlockRegistry.BASALT_PAVING_STAIRS.get(), modLoc("block/basalt_paving"));
        wallBlock(ECBlockRegistry.BASALT_PAVING_WALL.get(), modLoc("block/basalt_paving"));
        pressurePlateBlock(ECBlockRegistry.BASALT_PAVING_PRESSURE_PLATE.get(), new UncheckedModelFile(ECConstants.MODID + ":block/basalt_paving_pressure_plate"),
            new UncheckedModelFile(ECConstants.MODID + ":block/basalt_paving_pressure_plate_down"));

        simpleBlock(ECBlockRegistry.BASALT_TILES.get());
        slabBlock(ECBlockRegistry.BASALT_TILES_SLAB.get(), modLoc("block/basalt_tiles"), modLoc("block/basalt_tiles"));
        stairsBlock(ECBlockRegistry.BASALT_TILES_STAIRS.get(), modLoc("block/basalt_tiles"));
        wallBlock(ECBlockRegistry.BASALT_TILES_WALL.get(), modLoc("block/basalt_tiles"));
        pressurePlateBlock(ECBlockRegistry.BASALT_TILES_PRESSURE_PLATE.get(), new UncheckedModelFile(ECConstants.MODID + ":block/basalt_tiles_pressure_plate"),
            new UncheckedModelFile(ECConstants.MODID + ":block/basalt_tiles_pressure_plate_down"));

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

        simpleBlock(ECBlockRegistry.BASALT_ORNEMENT.get());
        pressurePlateBlock(ECBlockRegistry.BASALT_ORNEMENT_PRESSURE_PLATE.get(), new UncheckedModelFile(ECConstants.MODID + ":block/basalt_ornement_pressure_plate"),
            new UncheckedModelFile(ECConstants.MODID + ":block/basalt_ornement_pressure_plate_down"));

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

        simpleBlock(ECBlockRegistry.SMOOTH_SLATE.get());
        slabBlock(ECBlockRegistry.SMOOTH_SLATE_SLAB.get(), modLoc("block/smooth_slate"), modLoc("block/smooth_slate"));
        stairsBlock(ECBlockRegistry.SMOOTH_SLATE_STAIRS.get(), modLoc("block/smooth_slate"));
        wallBlock(ECBlockRegistry.SMOOTH_SLATE_WALL.get(), modLoc("block/smooth_slate"));
        pressurePlateBlock(ECBlockRegistry.SMOOTH_SLATE_PRESSURE_PLATE.get(), new UncheckedModelFile(ECConstants.MODID + ":block/smooth_slate_pressure_plate"),
            new UncheckedModelFile(ECConstants.MODID + ":block/smooth_slate_pressure_plate_down"));

        simpleBlock(ECBlockRegistry.POLISHED_SLATE.get());
        slabBlock(ECBlockRegistry.POLISHED_SLATE_SLAB.get(), modLoc("block/polished_slate"), modLoc("block/polished_slate"));
        stairsBlock(ECBlockRegistry.POLISHED_SLATE_STAIRS.get(), modLoc("block/polished_slate"));
        wallBlock(ECBlockRegistry.POLISHED_SLATE_WALL.get(), modLoc("block/polished_slate"));
        pressurePlateBlock(ECBlockRegistry.POLISHED_SLATE_PRESSURE_PLATE.get(), new UncheckedModelFile(ECConstants.MODID + ":block/polished_slate_pressure_plate"),
            new UncheckedModelFile(ECConstants.MODID + ":block/polished_slate_pressure_plate_down"));

        simpleBlock(ECBlockRegistry.SLATE_PAVING.get());
        slabBlock(ECBlockRegistry.SLATE_PAVING_SLAB.get(), modLoc("block/slate_paving"), modLoc("block/slate_paving"));
        stairsBlock(ECBlockRegistry.SLATE_PAVING_STAIRS.get(), modLoc("block/slate_paving"));
        wallBlock(ECBlockRegistry.SLATE_PAVING_WALL.get(), modLoc("block/slate_paving"));
        pressurePlateBlock(ECBlockRegistry.SLATE_PAVING_PRESSURE_PLATE.get(), new UncheckedModelFile(ECConstants.MODID + ":block/slate_paving_pressure_plate"),
            new UncheckedModelFile(ECConstants.MODID + ":block/slate_paving_pressure_plate_down"));

        simpleBlock(ECBlockRegistry.SLATE_TILES.get());
        slabBlock(ECBlockRegistry.SLATE_TILES_SLAB.get(), modLoc("block/slate_tiles"), modLoc("block/slate_tiles"));
        stairsBlock(ECBlockRegistry.SLATE_TILES_STAIRS.get(), modLoc("block/slate_tiles"));
        wallBlock(ECBlockRegistry.SLATE_TILES_WALL.get(), modLoc("block/slate_tiles"));
        pressurePlateBlock(ECBlockRegistry.SLATE_TILES_PRESSURE_PLATE.get(), new UncheckedModelFile(ECConstants.MODID + ":block/slate_tiles_pressure_plate"),
            new UncheckedModelFile(ECConstants.MODID + ":block/slate_tiles_pressure_plate_down"));

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

        simpleBlock(ECBlockRegistry.SLATE_ORNEMENT.get());
        pressurePlateBlock(ECBlockRegistry.SLATE_ORNEMENT_PRESSURE_PLATE.get(), new UncheckedModelFile(ECConstants.MODID + ":block/slate_ornement_pressure_plate"),
            new UncheckedModelFile(ECConstants.MODID + ":block/slate_ornement_pressure_plate_down"));

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

        simpleBlock(ECBlockRegistry.SMOOTH_MARBLE.get());
        slabBlock(ECBlockRegistry.SMOOTH_MARBLE_SLAB.get(), modLoc("block/smooth_marble"), modLoc("block/smooth_marble"));
        stairsBlock(ECBlockRegistry.SMOOTH_MARBLE_STAIRS.get(), modLoc("block/smooth_marble"));
        wallBlock(ECBlockRegistry.SMOOTH_MARBLE_WALL.get(), modLoc("block/smooth_marble"));
        pressurePlateBlock(ECBlockRegistry.SMOOTH_MARBLE_PRESSURE_PLATE.get(), new UncheckedModelFile(ECConstants.MODID + ":block/smooth_marble_pressure_plate"),
            new UncheckedModelFile(ECConstants.MODID + ":block/smooth_marble_pressure_plate_down"));

        simpleBlock(ECBlockRegistry.POLISHED_MARBLE.get());
        slabBlock(ECBlockRegistry.POLISHED_MARBLE_SLAB.get(), modLoc("block/polished_marble"), modLoc("block/polished_marble"));
        stairsBlock(ECBlockRegistry.POLISHED_MARBLE_STAIRS.get(), modLoc("block/polished_marble"));
        wallBlock(ECBlockRegistry.POLISHED_MARBLE_WALL.get(), modLoc("block/polished_marble"));
        pressurePlateBlock(ECBlockRegistry.POLISHED_MARBLE_PRESSURE_PLATE.get(), new UncheckedModelFile(ECConstants.MODID + ":block/polished_marble_pressure_plate"),
            new UncheckedModelFile(ECConstants.MODID + ":block/polished_marble_pressure_plate_down"));

        simpleBlock(ECBlockRegistry.MARBLE_PAVING.get());
        slabBlock(ECBlockRegistry.MARBLE_PAVING_SLAB.get(), modLoc("block/marble_paving"), modLoc("block/marble_paving"));
        stairsBlock(ECBlockRegistry.MARBLE_PAVING_STAIRS.get(), modLoc("block/marble_paving"));
        wallBlock(ECBlockRegistry.MARBLE_PAVING_WALL.get(), modLoc("block/marble_paving"));
        pressurePlateBlock(ECBlockRegistry.MARBLE_PAVING_PRESSURE_PLATE.get(), new UncheckedModelFile(ECConstants.MODID + ":block/marble_paving_pressure_plate"),
            new UncheckedModelFile(ECConstants.MODID + ":block/marble_paving_pressure_plate_down"));

        simpleBlock(ECBlockRegistry.MARBLE_TILES.get());
        slabBlock(ECBlockRegistry.MARBLE_TILES_SLAB.get(), modLoc("block/marble_tiles"), modLoc("block/marble_tiles"));
        stairsBlock(ECBlockRegistry.MARBLE_TILES_STAIRS.get(), modLoc("block/marble_tiles"));
        wallBlock(ECBlockRegistry.MARBLE_TILES_WALL.get(), modLoc("block/marble_tiles"));
        pressurePlateBlock(ECBlockRegistry.MARBLE_TILES_PRESSURE_PLATE.get(), new UncheckedModelFile(ECConstants.MODID + ":block/marble_tiles_pressure_plate"),
            new UncheckedModelFile(ECConstants.MODID + ":block/marble_tiles_pressure_plate_down"));

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

        simpleBlock(ECBlockRegistry.MARBLE_ORNEMENT.get());
        pressurePlateBlock(ECBlockRegistry.MARBLE_ORNEMENT_PRESSURE_PLATE.get(), new UncheckedModelFile(ECConstants.MODID + ":block/marble_ornement_pressure_plate"),
            new UncheckedModelFile(ECConstants.MODID + ":block/marble_ornement_pressure_plate_down"));

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

        simpleBlock(ECBlockRegistry.SMOOTH_GNEISS.get());
        slabBlock(ECBlockRegistry.SMOOTH_GNEISS_SLAB.get(), modLoc("block/smooth_gneiss"), modLoc("block/smooth_gneiss"));
        stairsBlock(ECBlockRegistry.SMOOTH_GNEISS_STAIRS.get(), modLoc("block/smooth_gneiss"));
        wallBlock(ECBlockRegistry.SMOOTH_GNEISS_WALL.get(), modLoc("block/smooth_gneiss"));
        pressurePlateBlock(ECBlockRegistry.SMOOTH_GNEISS_PRESSURE_PLATE.get(), new UncheckedModelFile(ECConstants.MODID + ":block/smooth_gneiss_pressure_plate"),
            new UncheckedModelFile(ECConstants.MODID + ":block/smooth_gneiss_pressure_plate_down"));

        simpleBlock(ECBlockRegistry.POLISHED_GNEISS.get());
        slabBlock(ECBlockRegistry.POLISHED_GNEISS_SLAB.get(), modLoc("block/polished_gneiss"), modLoc("block/polished_gneiss"));
        stairsBlock(ECBlockRegistry.POLISHED_GNEISS_STAIRS.get(), modLoc("block/polished_gneiss"));
        wallBlock(ECBlockRegistry.POLISHED_GNEISS_WALL.get(), modLoc("block/polished_gneiss"));
        pressurePlateBlock(ECBlockRegistry.POLISHED_GNEISS_PRESSURE_PLATE.get(), new UncheckedModelFile(ECConstants.MODID + ":block/polished_gneiss_pressure_plate"),
            new UncheckedModelFile(ECConstants.MODID + ":block/polished_gneiss_pressure_plate_down"));

        simpleBlock(ECBlockRegistry.GNEISS_PAVING.get());
        slabBlock(ECBlockRegistry.GNEISS_PAVING_SLAB.get(), modLoc("block/gneiss_paving"), modLoc("block/gneiss_paving"));
        stairsBlock(ECBlockRegistry.GNEISS_PAVING_STAIRS.get(), modLoc("block/gneiss_paving"));
        wallBlock(ECBlockRegistry.GNEISS_PAVING_WALL.get(), modLoc("block/gneiss_paving"));
        pressurePlateBlock(ECBlockRegistry.GNEISS_PAVING_PRESSURE_PLATE.get(), new UncheckedModelFile(ECConstants.MODID + ":block/gneiss_paving_pressure_plate"),
            new UncheckedModelFile(ECConstants.MODID + ":block/gneiss_paving_pressure_plate_down"));

        simpleBlock(ECBlockRegistry.GNEISS_TILES.get());
        slabBlock(ECBlockRegistry.GNEISS_TILES_SLAB.get(), modLoc("block/gneiss_tiles"), modLoc("block/gneiss_tiles"));
        stairsBlock(ECBlockRegistry.GNEISS_TILES_STAIRS.get(), modLoc("block/gneiss_tiles"));
        wallBlock(ECBlockRegistry.GNEISS_TILES_WALL.get(), modLoc("block/gneiss_tiles"));
        pressurePlateBlock(ECBlockRegistry.GNEISS_TILES_PRESSURE_PLATE.get(), new UncheckedModelFile(ECConstants.MODID + ":block/gneiss_tiles_pressure_plate"),
            new UncheckedModelFile(ECConstants.MODID + ":block/gneiss_tiles_pressure_plate_down"));

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

        simpleBlock(ECBlockRegistry.GNEISS_ORNEMENT.get());
        pressurePlateBlock(ECBlockRegistry.GNEISS_ORNEMENT_PRESSURE_PLATE.get(), new UncheckedModelFile(ECConstants.MODID + ":block/gneiss_ornement_pressure_plate"),
            new UncheckedModelFile(ECConstants.MODID + ":block/gneiss_ornement_pressure_plate_down"));

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

        simpleBlock(ECBlockRegistry.SMOOTH_JADE.get());
        slabBlock(ECBlockRegistry.SMOOTH_JADE_SLAB.get(), modLoc("block/smooth_jade"), modLoc("block/smooth_jade"));
        stairsBlock(ECBlockRegistry.SMOOTH_JADE_STAIRS.get(), modLoc("block/smooth_jade"));
        wallBlock(ECBlockRegistry.SMOOTH_JADE_WALL.get(), modLoc("block/smooth_jade"));
        pressurePlateBlock(ECBlockRegistry.SMOOTH_JADE_PRESSURE_PLATE.get(), new UncheckedModelFile(ECConstants.MODID + ":block/smooth_jade_pressure_plate"),
            new UncheckedModelFile(ECConstants.MODID + ":block/smooth_jade_pressure_plate_down"));

        simpleBlock(ECBlockRegistry.POLISHED_JADE.get());
        slabBlock(ECBlockRegistry.POLISHED_JADE_SLAB.get(), modLoc("block/polished_jade"), modLoc("block/polished_jade"));
        stairsBlock(ECBlockRegistry.POLISHED_JADE_STAIRS.get(), modLoc("block/polished_jade"));
        wallBlock(ECBlockRegistry.POLISHED_JADE_WALL.get(), modLoc("block/polished_jade"));
        pressurePlateBlock(ECBlockRegistry.POLISHED_JADE_PRESSURE_PLATE.get(), new UncheckedModelFile(ECConstants.MODID + ":block/polished_jade_pressure_plate"),
            new UncheckedModelFile(ECConstants.MODID + ":block/polished_jade_pressure_plate_down"));

        simpleBlock(ECBlockRegistry.JADE_PAVING.get());
        slabBlock(ECBlockRegistry.JADE_PAVING_SLAB.get(), modLoc("block/jade_paving"), modLoc("block/jade_paving"));
        stairsBlock(ECBlockRegistry.JADE_PAVING_STAIRS.get(), modLoc("block/jade_paving"));
        wallBlock(ECBlockRegistry.JADE_PAVING_WALL.get(), modLoc("block/jade_paving"));
        pressurePlateBlock(ECBlockRegistry.JADE_PAVING_PRESSURE_PLATE.get(), new UncheckedModelFile(ECConstants.MODID + ":block/jade_paving_pressure_plate"),
            new UncheckedModelFile(ECConstants.MODID + ":block/jade_paving_pressure_plate_down"));

        simpleBlock(ECBlockRegistry.JADE_TILES.get());
        slabBlock(ECBlockRegistry.JADE_TILES_SLAB.get(), modLoc("block/jade_tiles"), modLoc("block/jade_tiles"));
        stairsBlock(ECBlockRegistry.JADE_TILES_STAIRS.get(), modLoc("block/jade_tiles"));
        wallBlock(ECBlockRegistry.JADE_TILES_WALL.get(), modLoc("block/jade_tiles"));
        pressurePlateBlock(ECBlockRegistry.JADE_TILES_PRESSURE_PLATE.get(), new UncheckedModelFile(ECConstants.MODID + ":block/jade_tiles_pressure_plate"),
            new UncheckedModelFile(ECConstants.MODID + ":block/jade_tiles_pressure_plate_down"));

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

        simpleBlock(ECBlockRegistry.JADE_ORNEMENT.get());
        pressurePlateBlock(ECBlockRegistry.JADE_ORNEMENT_PRESSURE_PLATE.get(), new UncheckedModelFile(ECConstants.MODID + ":block/jade_ornement_pressure_plate"),
            new UncheckedModelFile(ECConstants.MODID + ":block/jade_ornement_pressure_plate_down"));

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

        simpleBlock(ECBlockRegistry.SMOOTH_LARVIKITE.get());
        slabBlock(ECBlockRegistry.SMOOTH_LARVIKITE_SLAB.get(), modLoc("block/smooth_larvikite"), modLoc("block/smooth_larvikite"));
        stairsBlock(ECBlockRegistry.SMOOTH_LARVIKITE_STAIRS.get(), modLoc("block/smooth_larvikite"));
        wallBlock(ECBlockRegistry.SMOOTH_LARVIKITE_WALL.get(), modLoc("block/smooth_larvikite"));
        pressurePlateBlock(ECBlockRegistry.SMOOTH_LARVIKITE_PRESSURE_PLATE.get(), new UncheckedModelFile(ECConstants.MODID + ":block/smooth_larvikite_pressure_plate"),
            new UncheckedModelFile(ECConstants.MODID + ":block/smooth_larvikite_pressure_plate_down"));

        simpleBlock(ECBlockRegistry.POLISHED_LARVIKITE.get());
        slabBlock(ECBlockRegistry.POLISHED_LARVIKITE_SLAB.get(), modLoc("block/polished_larvikite"), modLoc("block/polished_larvikite"));
        stairsBlock(ECBlockRegistry.POLISHED_LARVIKITE_STAIRS.get(), modLoc("block/polished_larvikite"));
        wallBlock(ECBlockRegistry.POLISHED_LARVIKITE_WALL.get(), modLoc("block/polished_larvikite"));
        pressurePlateBlock(ECBlockRegistry.POLISHED_LARVIKITE_PRESSURE_PLATE.get(), new UncheckedModelFile(ECConstants.MODID + ":block/polished_larvikite_pressure_plate"),
            new UncheckedModelFile(ECConstants.MODID + ":block/polished_larvikite_pressure_plate_down"));

        simpleBlock(ECBlockRegistry.LARVIKITE_PAVING.get());
        slabBlock(ECBlockRegistry.LARVIKITE_PAVING_SLAB.get(), modLoc("block/larvikite_paving"), modLoc("block/larvikite_paving"));
        stairsBlock(ECBlockRegistry.LARVIKITE_PAVING_STAIRS.get(), modLoc("block/larvikite_paving"));
        wallBlock(ECBlockRegistry.LARVIKITE_PAVING_WALL.get(), modLoc("block/larvikite_paving"));
        pressurePlateBlock(ECBlockRegistry.LARVIKITE_PAVING_PRESSURE_PLATE.get(), new UncheckedModelFile(ECConstants.MODID + ":block/larvikite_paving_pressure_plate"),
            new UncheckedModelFile(ECConstants.MODID + ":block/larvikite_paving_pressure_plate_down"));

        simpleBlock(ECBlockRegistry.LARVIKITE_TILES.get());
        slabBlock(ECBlockRegistry.LARVIKITE_TILES_SLAB.get(), modLoc("block/larvikite_tiles"), modLoc("block/larvikite_tiles"));
        stairsBlock(ECBlockRegistry.LARVIKITE_TILES_STAIRS.get(), modLoc("block/larvikite_tiles"));
        wallBlock(ECBlockRegistry.LARVIKITE_TILES_WALL.get(), modLoc("block/larvikite_tiles"));
        pressurePlateBlock(ECBlockRegistry.LARVIKITE_TILES_PRESSURE_PLATE.get(), new UncheckedModelFile(ECConstants.MODID + ":block/larvikite_tiles_pressure_plate"),
            new UncheckedModelFile(ECConstants.MODID + ":block/larvikite_tiles_pressure_plate_down"));

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

        simpleBlock(ECBlockRegistry.LARVIKITE_ORNEMENT.get());
        pressurePlateBlock(ECBlockRegistry.LARVIKITE_ORNEMENT_PRESSURE_PLATE.get(), new UncheckedModelFile(ECConstants.MODID + ":block/larvikite_ornement_pressure_plate"),
            new UncheckedModelFile(ECConstants.MODID + ":block/larvikite_ornement_pressure_plate_down"));

        // Andesite
        simpleBlock(ECBlockRegistry.SMOOTH_ANDESITE.get());
        slabBlock(ECBlockRegistry.SMOOTH_ANDESITE_SLAB.get(), modLoc("block/smooth_andesite"), modLoc("block/smooth_andesite"));
        stairsBlock(ECBlockRegistry.SMOOTH_ANDESITE_STAIRS.get(), modLoc("block/smooth_andesite"));
        wallBlock(ECBlockRegistry.SMOOTH_ANDESITE_WALL.get(), modLoc("block/smooth_andesite"));
        pressurePlateBlock(ECBlockRegistry.SMOOTH_ANDESITE_PRESSURE_PLATE.get(), new UncheckedModelFile(ECConstants.MODID + ":block/smooth_andesite_pressure_plate"),
            new UncheckedModelFile(ECConstants.MODID + ":block/smooth_andesite_pressure_plate_down"));

        simpleBlock(ECBlockRegistry.ANDESITE_PAVING.get());
        slabBlock(ECBlockRegistry.ANDESITE_PAVING_SLAB.get(), modLoc("block/andesite_paving"), modLoc("block/andesite_paving"));
        stairsBlock(ECBlockRegistry.ANDESITE_PAVING_STAIRS.get(), modLoc("block/andesite_paving"));
        wallBlock(ECBlockRegistry.ANDESITE_PAVING_WALL.get(), modLoc("block/andesite_paving"));
        pressurePlateBlock(ECBlockRegistry.ANDESITE_PAVING_PRESSURE_PLATE.get(), new UncheckedModelFile(ECConstants.MODID + ":block/andesite_paving_pressure_plate"),
            new UncheckedModelFile(ECConstants.MODID + ":block/andesite_paving_pressure_plate_down"));

        simpleBlock(ECBlockRegistry.ANDESITE_TILES.get());
        slabBlock(ECBlockRegistry.ANDESITE_TILES_SLAB.get(), modLoc("block/andesite_tiles"), modLoc("block/andesite_tiles"));
        stairsBlock(ECBlockRegistry.ANDESITE_TILES_STAIRS.get(), modLoc("block/andesite_tiles"));
        wallBlock(ECBlockRegistry.ANDESITE_TILES_WALL.get(), modLoc("block/andesite_tiles"));
        pressurePlateBlock(ECBlockRegistry.ANDESITE_TILES_PRESSURE_PLATE.get(), new UncheckedModelFile(ECConstants.MODID + ":block/andesite_tiles_pressure_plate"),
            new UncheckedModelFile(ECConstants.MODID + ":block/andesite_tiles_pressure_plate_down"));

        simpleBlock(ECBlockRegistry.ANDESITE_BRICKS.get());
        slabBlock(ECBlockRegistry.ANDESITE_BRICKS_SLAB.get(), modLoc("block/andesite_bricks"), modLoc("block/andesite_bricks"));
        stairsBlock(ECBlockRegistry.ANDESITE_BRICKS_STAIRS.get(), modLoc("block/andesite_bricks"));
        wallBlock(ECBlockRegistry.ANDESITE_BRICKS_WALL.get(), modLoc("block/andesite_bricks"));
        pressurePlateBlock(ECBlockRegistry.ANDESITE_BRICKS_PRESSURE_PLATE.get(), new UncheckedModelFile(ECConstants.MODID + ":block/andesite_bricks_pressure_plate"),
            new UncheckedModelFile(ECConstants.MODID + ":block/andesite_bricks_pressure_plate_down"));

        simpleBlock(ECBlockRegistry.ANDESITE_LARGE_BRICKS.get());
        slabBlock(ECBlockRegistry.ANDESITE_LARGE_BRICKS_SLAB.get(), modLoc("block/andesite_large_bricks"), modLoc("block/andesite_large_bricks"));
        stairsBlock(ECBlockRegistry.ANDESITE_LARGE_BRICKS_STAIRS.get(), modLoc("block/andesite_large_bricks"));
        wallBlock(ECBlockRegistry.ANDESITE_LARGE_BRICKS_WALL.get(), modLoc("block/andesite_large_bricks"));
        pressurePlateBlock(ECBlockRegistry.ANDESITE_LARGE_BRICKS_PRESSURE_PLATE.get(), new UncheckedModelFile(ECConstants.MODID + ":block/andesite_large_bricks_pressure_plate"),
            new UncheckedModelFile(ECConstants.MODID + ":block/andesite_large_bricks_pressure_plate_down"));

        simpleBlock(ECBlockRegistry.ANDESITE_ORNEMENT.get());
        pressurePlateBlock(ECBlockRegistry.ANDESITE_ORNEMENT_PRESSURE_PLATE.get(), new UncheckedModelFile(ECConstants.MODID + ":block/andesite_ornement_pressure_plate"),
            new UncheckedModelFile(ECConstants.MODID + ":block/andesite_ornement_pressure_plate_down"));

        // Diorite
        simpleBlock(ECBlockRegistry.SMOOTH_DIORITE.get());
        slabBlock(ECBlockRegistry.SMOOTH_DIORITE_SLAB.get(), modLoc("block/smooth_diorite"), modLoc("block/smooth_diorite"));
        stairsBlock(ECBlockRegistry.SMOOTH_DIORITE_STAIRS.get(), modLoc("block/smooth_diorite"));
        wallBlock(ECBlockRegistry.SMOOTH_DIORITE_WALL.get(), modLoc("block/smooth_diorite"));
        pressurePlateBlock(ECBlockRegistry.SMOOTH_DIORITE_PRESSURE_PLATE.get(), new UncheckedModelFile(ECConstants.MODID + ":block/smooth_diorite_pressure_plate"),
            new UncheckedModelFile(ECConstants.MODID + ":block/smooth_diorite_pressure_plate_down"));

        simpleBlock(ECBlockRegistry.DIORITE_PAVING.get());
        slabBlock(ECBlockRegistry.DIORITE_PAVING_SLAB.get(), modLoc("block/diorite_paving"), modLoc("block/diorite_paving"));
        stairsBlock(ECBlockRegistry.DIORITE_PAVING_STAIRS.get(), modLoc("block/diorite_paving"));
        wallBlock(ECBlockRegistry.DIORITE_PAVING_WALL.get(), modLoc("block/diorite_paving"));
        pressurePlateBlock(ECBlockRegistry.DIORITE_PAVING_PRESSURE_PLATE.get(), new UncheckedModelFile(ECConstants.MODID + ":block/diorite_paving_pressure_plate"),
            new UncheckedModelFile(ECConstants.MODID + ":block/diorite_paving_pressure_plate_down"));

        simpleBlock(ECBlockRegistry.DIORITE_TILES.get());
        slabBlock(ECBlockRegistry.DIORITE_TILES_SLAB.get(), modLoc("block/diorite_tiles"), modLoc("block/diorite_tiles"));
        stairsBlock(ECBlockRegistry.DIORITE_TILES_STAIRS.get(), modLoc("block/diorite_tiles"));
        wallBlock(ECBlockRegistry.DIORITE_TILES_WALL.get(), modLoc("block/diorite_tiles"));
        pressurePlateBlock(ECBlockRegistry.DIORITE_TILES_PRESSURE_PLATE.get(), new UncheckedModelFile(ECConstants.MODID + ":block/diorite_tiles_pressure_plate"),
            new UncheckedModelFile(ECConstants.MODID + ":block/diorite_tiles_pressure_plate_down"));

        simpleBlock(ECBlockRegistry.DIORITE_BRICKS.get());
        slabBlock(ECBlockRegistry.DIORITE_BRICKS_SLAB.get(), modLoc("block/diorite_bricks"), modLoc("block/diorite_bricks"));
        stairsBlock(ECBlockRegistry.DIORITE_BRICKS_STAIRS.get(), modLoc("block/diorite_bricks"));
        wallBlock(ECBlockRegistry.DIORITE_BRICKS_WALL.get(), modLoc("block/diorite_bricks"));
        pressurePlateBlock(ECBlockRegistry.DIORITE_BRICKS_PRESSURE_PLATE.get(), new UncheckedModelFile(ECConstants.MODID + ":block/diorite_bricks_pressure_plate"),
            new UncheckedModelFile(ECConstants.MODID + ":block/diorite_bricks_pressure_plate_down"));

        simpleBlock(ECBlockRegistry.DIORITE_LARGE_BRICKS.get());
        slabBlock(ECBlockRegistry.DIORITE_LARGE_BRICKS_SLAB.get(), modLoc("block/diorite_large_bricks"), modLoc("block/diorite_large_bricks"));
        stairsBlock(ECBlockRegistry.DIORITE_LARGE_BRICKS_STAIRS.get(), modLoc("block/diorite_large_bricks"));
        wallBlock(ECBlockRegistry.DIORITE_LARGE_BRICKS_WALL.get(), modLoc("block/diorite_large_bricks"));
        pressurePlateBlock(ECBlockRegistry.DIORITE_LARGE_BRICKS_PRESSURE_PLATE.get(), new UncheckedModelFile(ECConstants.MODID + ":block/diorite_large_bricks_pressure_plate"),
            new UncheckedModelFile(ECConstants.MODID + ":block/diorite_large_bricks_pressure_plate_down"));

        simpleBlock(ECBlockRegistry.DIORITE_ORNEMENT.get());
        pressurePlateBlock(ECBlockRegistry.DIORITE_ORNEMENT_PRESSURE_PLATE.get(), new UncheckedModelFile(ECConstants.MODID + ":block/diorite_ornement_pressure_plate"),
            new UncheckedModelFile(ECConstants.MODID + ":block/diorite_ornement_pressure_plate_down"));

        // Granite
        simpleBlock(ECBlockRegistry.SMOOTH_GRANITE.get());
        slabBlock(ECBlockRegistry.SMOOTH_GRANITE_SLAB.get(), modLoc("block/smooth_granite"), modLoc("block/smooth_granite"));
        stairsBlock(ECBlockRegistry.SMOOTH_GRANITE_STAIRS.get(), modLoc("block/smooth_granite"));
        wallBlock(ECBlockRegistry.SMOOTH_GRANITE_WALL.get(), modLoc("block/smooth_granite"));
        pressurePlateBlock(ECBlockRegistry.SMOOTH_GRANITE_PRESSURE_PLATE.get(), new UncheckedModelFile(ECConstants.MODID + ":block/smooth_granite_pressure_plate"),
            new UncheckedModelFile(ECConstants.MODID + ":block/smooth_granite_pressure_plate_down"));

        simpleBlock(ECBlockRegistry.GRANITE_PAVING.get());
        slabBlock(ECBlockRegistry.GRANITE_PAVING_SLAB.get(), modLoc("block/granite_paving"), modLoc("block/granite_paving"));
        stairsBlock(ECBlockRegistry.GRANITE_PAVING_STAIRS.get(), modLoc("block/granite_paving"));
        wallBlock(ECBlockRegistry.GRANITE_PAVING_WALL.get(), modLoc("block/granite_paving"));
        pressurePlateBlock(ECBlockRegistry.GRANITE_PAVING_PRESSURE_PLATE.get(), new UncheckedModelFile(ECConstants.MODID + ":block/granite_paving_pressure_plate"),
            new UncheckedModelFile(ECConstants.MODID + ":block/granite_paving_pressure_plate_down"));

        simpleBlock(ECBlockRegistry.GRANITE_TILES.get());
        slabBlock(ECBlockRegistry.GRANITE_TILES_SLAB.get(), modLoc("block/granite_tiles"), modLoc("block/granite_tiles"));
        stairsBlock(ECBlockRegistry.GRANITE_TILES_STAIRS.get(), modLoc("block/granite_tiles"));
        wallBlock(ECBlockRegistry.GRANITE_TILES_WALL.get(), modLoc("block/granite_tiles"));
        pressurePlateBlock(ECBlockRegistry.GRANITE_TILES_PRESSURE_PLATE.get(), new UncheckedModelFile(ECConstants.MODID + ":block/granite_tiles_pressure_plate"),
            new UncheckedModelFile(ECConstants.MODID + ":block/granite_tiles_pressure_plate_down"));

        simpleBlock(ECBlockRegistry.GRANITE_BRICKS.get());
        slabBlock(ECBlockRegistry.GRANITE_BRICKS_SLAB.get(), modLoc("block/granite_bricks"), modLoc("block/granite_bricks"));
        stairsBlock(ECBlockRegistry.GRANITE_BRICKS_STAIRS.get(), modLoc("block/granite_bricks"));
        wallBlock(ECBlockRegistry.GRANITE_BRICKS_WALL.get(), modLoc("block/granite_bricks"));
        pressurePlateBlock(ECBlockRegistry.GRANITE_BRICKS_PRESSURE_PLATE.get(), new UncheckedModelFile(ECConstants.MODID + ":block/granite_bricks_pressure_plate"),
            new UncheckedModelFile(ECConstants.MODID + ":block/granite_bricks_pressure_plate_down"));

        simpleBlock(ECBlockRegistry.GRANITE_LARGE_BRICKS.get());
        slabBlock(ECBlockRegistry.GRANITE_LARGE_BRICKS_SLAB.get(), modLoc("block/granite_large_bricks"), modLoc("block/granite_large_bricks"));
        stairsBlock(ECBlockRegistry.GRANITE_LARGE_BRICKS_STAIRS.get(), modLoc("block/granite_large_bricks"));
        wallBlock(ECBlockRegistry.GRANITE_LARGE_BRICKS_WALL.get(), modLoc("block/granite_large_bricks"));
        pressurePlateBlock(ECBlockRegistry.GRANITE_LARGE_BRICKS_PRESSURE_PLATE.get(), new UncheckedModelFile(ECConstants.MODID + ":block/granite_large_bricks_pressure_plate"),
            new UncheckedModelFile(ECConstants.MODID + ":block/granite_large_bricks_pressure_plate_down"));

        simpleBlock(ECBlockRegistry.GRANITE_ORNEMENT.get());
        pressurePlateBlock(ECBlockRegistry.GRANITE_ORNEMENT_PRESSURE_PLATE.get(), new UncheckedModelFile(ECConstants.MODID + ":block/granite_ornement_pressure_plate"),
            new UncheckedModelFile(ECConstants.MODID + ":block/granite_ornement_pressure_plate_down"));
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