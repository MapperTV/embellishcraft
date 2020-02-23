package tv.mapper.embellishcraft.data.gen;

import net.minecraft.data.DataGenerator;
import tv.mapper.embellishcraft.ECConstants;
import tv.mapper.embellishcraft.block.ECBlockRegistry;
import tv.mapper.mapperbase.data.gen.BaseLootTableProvider;

public class ECLootTables extends BaseLootTableProvider
{

    public ECLootTables(DataGenerator dataGeneratorIn)
    {
        super(dataGeneratorIn);
    }

    @Override
    protected void addTables()
    {
        // Basalt
        lootTables.put(ECBlockRegistry.BASALT.get(), createSilkTable(ECConstants.MODID, ECBlockRegistry.BASALT.get(), ECBlockRegistry.BASALT_COBBLESTONE.get()));
        lootTables.put(ECBlockRegistry.BASALT_SLAB.get(), createSlabTable(ECConstants.MODID, ECBlockRegistry.BASALT_SLAB.get()));
        lootTables.put(ECBlockRegistry.BASALT_STAIRS.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.BASALT_STAIRS.get()));
        lootTables.put(ECBlockRegistry.BASALT_WALL.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.BASALT_WALL.get()));
        lootTables.put(ECBlockRegistry.BASALT_PRESSURE_PLATE.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.BASALT_PRESSURE_PLATE.get()));
        lootTables.put(ECBlockRegistry.BASALT_BUTTON.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.BASALT_BUTTON.get()));

        lootTables.put(ECBlockRegistry.BASALT_COBBLESTONE.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.BASALT_COBBLESTONE.get()));
        lootTables.put(ECBlockRegistry.BASALT_COBBLESTONE_SLAB.get(), createSlabTable(ECConstants.MODID, ECBlockRegistry.BASALT_COBBLESTONE_SLAB.get()));
        lootTables.put(ECBlockRegistry.BASALT_COBBLESTONE_STAIRS.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.BASALT_COBBLESTONE_STAIRS.get()));
        lootTables.put(ECBlockRegistry.BASALT_COBBLESTONE_WALL.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.BASALT_COBBLESTONE_WALL.get()));
        lootTables.put(ECBlockRegistry.BASALT_COBBLESTONE_PRESSURE_PLATE.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.BASALT_COBBLESTONE_PRESSURE_PLATE.get()));

        lootTables.put(ECBlockRegistry.SMOOTH_BASALT.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.SMOOTH_BASALT.get()));
        lootTables.put(ECBlockRegistry.SMOOTH_BASALT_SLAB.get(), createSlabTable(ECConstants.MODID, ECBlockRegistry.SMOOTH_BASALT_SLAB.get()));
        lootTables.put(ECBlockRegistry.SMOOTH_BASALT_STAIRS.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.SMOOTH_BASALT_STAIRS.get()));
        lootTables.put(ECBlockRegistry.SMOOTH_BASALT_WALL.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.SMOOTH_BASALT_WALL.get()));
        lootTables.put(ECBlockRegistry.SMOOTH_BASALT_PRESSURE_PLATE.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.SMOOTH_BASALT_PRESSURE_PLATE.get()));

        lootTables.put(ECBlockRegistry.POLISHED_BASALT.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.POLISHED_BASALT.get()));
        lootTables.put(ECBlockRegistry.POLISHED_BASALT_SLAB.get(), createSlabTable(ECConstants.MODID, ECBlockRegistry.POLISHED_BASALT_SLAB.get()));
        lootTables.put(ECBlockRegistry.POLISHED_BASALT_STAIRS.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.POLISHED_BASALT_STAIRS.get()));
        lootTables.put(ECBlockRegistry.POLISHED_BASALT_WALL.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.POLISHED_BASALT_WALL.get()));
        lootTables.put(ECBlockRegistry.POLISHED_BASALT_PRESSURE_PLATE.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.POLISHED_BASALT_PRESSURE_PLATE.get()));

        lootTables.put(ECBlockRegistry.BASALT_PAVING.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.BASALT_PAVING.get()));
        lootTables.put(ECBlockRegistry.BASALT_PAVING_SLAB.get(), createSlabTable(ECConstants.MODID, ECBlockRegistry.BASALT_PAVING_SLAB.get()));
        lootTables.put(ECBlockRegistry.BASALT_PAVING_STAIRS.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.BASALT_PAVING_STAIRS.get()));
        lootTables.put(ECBlockRegistry.BASALT_PAVING_WALL.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.BASALT_PAVING_WALL.get()));
        lootTables.put(ECBlockRegistry.BASALT_PAVING_PRESSURE_PLATE.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.BASALT_PAVING_PRESSURE_PLATE.get()));

        lootTables.put(ECBlockRegistry.BASALT_TILES.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.BASALT_TILES.get()));
        lootTables.put(ECBlockRegistry.BASALT_TILES_SLAB.get(), createSlabTable(ECConstants.MODID, ECBlockRegistry.BASALT_TILES_SLAB.get()));
        lootTables.put(ECBlockRegistry.BASALT_TILES_STAIRS.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.BASALT_TILES_STAIRS.get()));
        lootTables.put(ECBlockRegistry.BASALT_TILES_WALL.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.BASALT_TILES_WALL.get()));
        lootTables.put(ECBlockRegistry.BASALT_TILES_PRESSURE_PLATE.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.BASALT_TILES_PRESSURE_PLATE.get()));

        lootTables.put(ECBlockRegistry.BASALT_BRICKS.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.BASALT_BRICKS.get()));
        lootTables.put(ECBlockRegistry.BASALT_BRICKS_SLAB.get(), createSlabTable(ECConstants.MODID, ECBlockRegistry.BASALT_BRICKS_SLAB.get()));
        lootTables.put(ECBlockRegistry.BASALT_BRICKS_STAIRS.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.BASALT_BRICKS_STAIRS.get()));
        lootTables.put(ECBlockRegistry.BASALT_BRICKS_WALL.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.BASALT_BRICKS_WALL.get()));
        lootTables.put(ECBlockRegistry.BASALT_BRICKS_PRESSURE_PLATE.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.BASALT_BRICKS_PRESSURE_PLATE.get()));

        lootTables.put(ECBlockRegistry.BASALT_LARGE_BRICKS.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.BASALT_LARGE_BRICKS.get()));
        lootTables.put(ECBlockRegistry.BASALT_LARGE_BRICKS_SLAB.get(), createSlabTable(ECConstants.MODID, ECBlockRegistry.BASALT_LARGE_BRICKS_SLAB.get()));
        lootTables.put(ECBlockRegistry.BASALT_LARGE_BRICKS_STAIRS.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.BASALT_LARGE_BRICKS_STAIRS.get()));
        lootTables.put(ECBlockRegistry.BASALT_LARGE_BRICKS_WALL.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.BASALT_LARGE_BRICKS_WALL.get()));
        lootTables.put(ECBlockRegistry.BASALT_LARGE_BRICKS_PRESSURE_PLATE.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.BASALT_LARGE_BRICKS_PRESSURE_PLATE.get()));

        lootTables.put(ECBlockRegistry.BASALT_ORNAMENT.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.BASALT_ORNAMENT.get()));
        lootTables.put(ECBlockRegistry.BASALT_ORNAMENT_PRESSURE_PLATE.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.BASALT_ORNAMENT_PRESSURE_PLATE.get()));

        // Slate
        lootTables.put(ECBlockRegistry.SLATE.get(), createSilkTable(ECConstants.MODID, ECBlockRegistry.SLATE.get(), ECBlockRegistry.SLATE_COBBLESTONE.get()));
        lootTables.put(ECBlockRegistry.SLATE_SLAB.get(), createSlabTable(ECConstants.MODID, ECBlockRegistry.SLATE_SLAB.get()));
        lootTables.put(ECBlockRegistry.SLATE_STAIRS.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.SLATE_STAIRS.get()));
        lootTables.put(ECBlockRegistry.SLATE_WALL.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.SLATE_WALL.get()));
        lootTables.put(ECBlockRegistry.SLATE_PRESSURE_PLATE.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.SLATE_PRESSURE_PLATE.get()));
        lootTables.put(ECBlockRegistry.SLATE_BUTTON.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.SLATE_BUTTON.get()));

        lootTables.put(ECBlockRegistry.SLATE_COBBLESTONE.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.SLATE_COBBLESTONE.get()));
        lootTables.put(ECBlockRegistry.SLATE_COBBLESTONE_SLAB.get(), createSlabTable(ECConstants.MODID, ECBlockRegistry.SLATE_COBBLESTONE_SLAB.get()));
        lootTables.put(ECBlockRegistry.SLATE_COBBLESTONE_STAIRS.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.SLATE_COBBLESTONE_STAIRS.get()));
        lootTables.put(ECBlockRegistry.SLATE_COBBLESTONE_WALL.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.SLATE_COBBLESTONE_WALL.get()));
        lootTables.put(ECBlockRegistry.SLATE_COBBLESTONE_PRESSURE_PLATE.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.SLATE_COBBLESTONE_PRESSURE_PLATE.get()));

        lootTables.put(ECBlockRegistry.SMOOTH_SLATE.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.SMOOTH_SLATE.get()));
        lootTables.put(ECBlockRegistry.SMOOTH_SLATE_SLAB.get(), createSlabTable(ECConstants.MODID, ECBlockRegistry.SMOOTH_SLATE_SLAB.get()));
        lootTables.put(ECBlockRegistry.SMOOTH_SLATE_STAIRS.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.SMOOTH_SLATE_STAIRS.get()));
        lootTables.put(ECBlockRegistry.SMOOTH_SLATE_WALL.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.SMOOTH_SLATE_WALL.get()));
        lootTables.put(ECBlockRegistry.SMOOTH_SLATE_PRESSURE_PLATE.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.SMOOTH_SLATE_PRESSURE_PLATE.get()));

        lootTables.put(ECBlockRegistry.POLISHED_SLATE.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.POLISHED_SLATE.get()));
        lootTables.put(ECBlockRegistry.POLISHED_SLATE_SLAB.get(), createSlabTable(ECConstants.MODID, ECBlockRegistry.POLISHED_SLATE_SLAB.get()));
        lootTables.put(ECBlockRegistry.POLISHED_SLATE_STAIRS.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.POLISHED_SLATE_STAIRS.get()));
        lootTables.put(ECBlockRegistry.POLISHED_SLATE_WALL.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.POLISHED_SLATE_WALL.get()));
        lootTables.put(ECBlockRegistry.POLISHED_SLATE_PRESSURE_PLATE.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.POLISHED_SLATE_PRESSURE_PLATE.get()));

        lootTables.put(ECBlockRegistry.SLATE_PAVING.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.SLATE_PAVING.get()));
        lootTables.put(ECBlockRegistry.SLATE_PAVING_SLAB.get(), createSlabTable(ECConstants.MODID, ECBlockRegistry.SLATE_PAVING_SLAB.get()));
        lootTables.put(ECBlockRegistry.SLATE_PAVING_STAIRS.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.SLATE_PAVING_STAIRS.get()));
        lootTables.put(ECBlockRegistry.SLATE_PAVING_WALL.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.SLATE_PAVING_WALL.get()));
        lootTables.put(ECBlockRegistry.SLATE_PAVING_PRESSURE_PLATE.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.SLATE_PAVING_PRESSURE_PLATE.get()));

        lootTables.put(ECBlockRegistry.SLATE_TILES.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.SLATE_TILES.get()));
        lootTables.put(ECBlockRegistry.SLATE_TILES_SLAB.get(), createSlabTable(ECConstants.MODID, ECBlockRegistry.SLATE_TILES_SLAB.get()));
        lootTables.put(ECBlockRegistry.SLATE_TILES_STAIRS.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.SLATE_TILES_STAIRS.get()));
        lootTables.put(ECBlockRegistry.SLATE_TILES_WALL.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.SLATE_TILES_WALL.get()));
        lootTables.put(ECBlockRegistry.SLATE_TILES_PRESSURE_PLATE.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.SLATE_TILES_PRESSURE_PLATE.get()));

        lootTables.put(ECBlockRegistry.SLATE_BRICKS.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.SLATE_BRICKS.get()));
        lootTables.put(ECBlockRegistry.SLATE_BRICKS_SLAB.get(), createSlabTable(ECConstants.MODID, ECBlockRegistry.SLATE_BRICKS_SLAB.get()));
        lootTables.put(ECBlockRegistry.SLATE_BRICKS_STAIRS.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.SLATE_BRICKS_STAIRS.get()));
        lootTables.put(ECBlockRegistry.SLATE_BRICKS_WALL.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.SLATE_BRICKS_WALL.get()));
        lootTables.put(ECBlockRegistry.SLATE_BRICKS_PRESSURE_PLATE.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.SLATE_BRICKS_PRESSURE_PLATE.get()));

        lootTables.put(ECBlockRegistry.SLATE_LARGE_BRICKS.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.SLATE_LARGE_BRICKS.get()));
        lootTables.put(ECBlockRegistry.SLATE_LARGE_BRICKS_SLAB.get(), createSlabTable(ECConstants.MODID, ECBlockRegistry.SLATE_LARGE_BRICKS_SLAB.get()));
        lootTables.put(ECBlockRegistry.SLATE_LARGE_BRICKS_STAIRS.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.SLATE_LARGE_BRICKS_STAIRS.get()));
        lootTables.put(ECBlockRegistry.SLATE_LARGE_BRICKS_WALL.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.SLATE_LARGE_BRICKS_WALL.get()));
        lootTables.put(ECBlockRegistry.SLATE_LARGE_BRICKS_PRESSURE_PLATE.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.SLATE_LARGE_BRICKS_PRESSURE_PLATE.get()));

        lootTables.put(ECBlockRegistry.SLATE_ORNAMENT.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.SLATE_ORNAMENT.get()));
        lootTables.put(ECBlockRegistry.SLATE_ORNAMENT_PRESSURE_PLATE.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.SLATE_ORNAMENT_PRESSURE_PLATE.get()));

        // Marble
        lootTables.put(ECBlockRegistry.MARBLE.get(), createSilkTable(ECConstants.MODID, ECBlockRegistry.MARBLE.get(), ECBlockRegistry.MARBLE_COBBLESTONE.get()));
        lootTables.put(ECBlockRegistry.MARBLE_SLAB.get(), createSlabTable(ECConstants.MODID, ECBlockRegistry.MARBLE_SLAB.get()));
        lootTables.put(ECBlockRegistry.MARBLE_STAIRS.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.MARBLE_STAIRS.get()));
        lootTables.put(ECBlockRegistry.MARBLE_WALL.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.MARBLE_WALL.get()));
        lootTables.put(ECBlockRegistry.MARBLE_PRESSURE_PLATE.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.MARBLE_PRESSURE_PLATE.get()));
        lootTables.put(ECBlockRegistry.MARBLE_BUTTON.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.MARBLE_BUTTON.get()));

        lootTables.put(ECBlockRegistry.MARBLE_COBBLESTONE.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.MARBLE_COBBLESTONE.get()));
        lootTables.put(ECBlockRegistry.MARBLE_COBBLESTONE_SLAB.get(), createSlabTable(ECConstants.MODID, ECBlockRegistry.MARBLE_COBBLESTONE_SLAB.get()));
        lootTables.put(ECBlockRegistry.MARBLE_COBBLESTONE_STAIRS.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.MARBLE_COBBLESTONE_STAIRS.get()));
        lootTables.put(ECBlockRegistry.MARBLE_COBBLESTONE_WALL.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.MARBLE_COBBLESTONE_WALL.get()));
        lootTables.put(ECBlockRegistry.MARBLE_COBBLESTONE_PRESSURE_PLATE.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.MARBLE_COBBLESTONE_PRESSURE_PLATE.get()));

        lootTables.put(ECBlockRegistry.SMOOTH_MARBLE.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.SMOOTH_MARBLE.get()));
        lootTables.put(ECBlockRegistry.SMOOTH_MARBLE_SLAB.get(), createSlabTable(ECConstants.MODID, ECBlockRegistry.SMOOTH_MARBLE_SLAB.get()));
        lootTables.put(ECBlockRegistry.SMOOTH_MARBLE_STAIRS.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.SMOOTH_MARBLE_STAIRS.get()));
        lootTables.put(ECBlockRegistry.SMOOTH_MARBLE_WALL.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.SMOOTH_MARBLE_WALL.get()));
        lootTables.put(ECBlockRegistry.SMOOTH_MARBLE_PRESSURE_PLATE.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.SMOOTH_MARBLE_PRESSURE_PLATE.get()));

        lootTables.put(ECBlockRegistry.POLISHED_MARBLE.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.POLISHED_MARBLE.get()));
        lootTables.put(ECBlockRegistry.POLISHED_MARBLE_SLAB.get(), createSlabTable(ECConstants.MODID, ECBlockRegistry.POLISHED_MARBLE_SLAB.get()));
        lootTables.put(ECBlockRegistry.POLISHED_MARBLE_STAIRS.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.POLISHED_MARBLE_STAIRS.get()));
        lootTables.put(ECBlockRegistry.POLISHED_MARBLE_WALL.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.POLISHED_MARBLE_WALL.get()));
        lootTables.put(ECBlockRegistry.POLISHED_MARBLE_PRESSURE_PLATE.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.POLISHED_MARBLE_PRESSURE_PLATE.get()));

        lootTables.put(ECBlockRegistry.MARBLE_PAVING.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.MARBLE_PAVING.get()));
        lootTables.put(ECBlockRegistry.MARBLE_PAVING_SLAB.get(), createSlabTable(ECConstants.MODID, ECBlockRegistry.MARBLE_PAVING_SLAB.get()));
        lootTables.put(ECBlockRegistry.MARBLE_PAVING_STAIRS.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.MARBLE_PAVING_STAIRS.get()));
        lootTables.put(ECBlockRegistry.MARBLE_PAVING_WALL.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.MARBLE_PAVING_WALL.get()));
        lootTables.put(ECBlockRegistry.MARBLE_PAVING_PRESSURE_PLATE.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.MARBLE_PAVING_PRESSURE_PLATE.get()));

        lootTables.put(ECBlockRegistry.MARBLE_TILES.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.MARBLE_TILES.get()));
        lootTables.put(ECBlockRegistry.MARBLE_TILES_SLAB.get(), createSlabTable(ECConstants.MODID, ECBlockRegistry.MARBLE_TILES_SLAB.get()));
        lootTables.put(ECBlockRegistry.MARBLE_TILES_STAIRS.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.MARBLE_TILES_STAIRS.get()));
        lootTables.put(ECBlockRegistry.MARBLE_TILES_WALL.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.MARBLE_TILES_WALL.get()));
        lootTables.put(ECBlockRegistry.MARBLE_TILES_PRESSURE_PLATE.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.MARBLE_TILES_PRESSURE_PLATE.get()));

        lootTables.put(ECBlockRegistry.MARBLE_BRICKS.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.MARBLE_BRICKS.get()));
        lootTables.put(ECBlockRegistry.MARBLE_BRICKS_SLAB.get(), createSlabTable(ECConstants.MODID, ECBlockRegistry.MARBLE_BRICKS_SLAB.get()));
        lootTables.put(ECBlockRegistry.MARBLE_BRICKS_STAIRS.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.MARBLE_BRICKS_STAIRS.get()));
        lootTables.put(ECBlockRegistry.MARBLE_BRICKS_WALL.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.MARBLE_BRICKS_WALL.get()));
        lootTables.put(ECBlockRegistry.MARBLE_BRICKS_PRESSURE_PLATE.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.MARBLE_BRICKS_PRESSURE_PLATE.get()));

        lootTables.put(ECBlockRegistry.MARBLE_LARGE_BRICKS.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.MARBLE_LARGE_BRICKS.get()));
        lootTables.put(ECBlockRegistry.MARBLE_LARGE_BRICKS_SLAB.get(), createSlabTable(ECConstants.MODID, ECBlockRegistry.MARBLE_LARGE_BRICKS_SLAB.get()));
        lootTables.put(ECBlockRegistry.MARBLE_LARGE_BRICKS_STAIRS.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.MARBLE_LARGE_BRICKS_STAIRS.get()));
        lootTables.put(ECBlockRegistry.MARBLE_LARGE_BRICKS_WALL.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.MARBLE_LARGE_BRICKS_WALL.get()));
        lootTables.put(ECBlockRegistry.MARBLE_LARGE_BRICKS_PRESSURE_PLATE.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.MARBLE_LARGE_BRICKS_PRESSURE_PLATE.get()));

        lootTables.put(ECBlockRegistry.MARBLE_ORNAMENT.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.MARBLE_ORNAMENT.get()));
        lootTables.put(ECBlockRegistry.MARBLE_ORNAMENT_PRESSURE_PLATE.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.MARBLE_ORNAMENT_PRESSURE_PLATE.get()));

        // Gneiss
        lootTables.put(ECBlockRegistry.GNEISS.get(), createSilkTable(ECConstants.MODID, ECBlockRegistry.GNEISS.get(), ECBlockRegistry.GNEISS_COBBLESTONE.get()));
        lootTables.put(ECBlockRegistry.GNEISS_SLAB.get(), createSlabTable(ECConstants.MODID, ECBlockRegistry.GNEISS_SLAB.get()));
        lootTables.put(ECBlockRegistry.GNEISS_STAIRS.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.GNEISS_STAIRS.get()));
        lootTables.put(ECBlockRegistry.GNEISS_WALL.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.GNEISS_WALL.get()));
        lootTables.put(ECBlockRegistry.GNEISS_PRESSURE_PLATE.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.GNEISS_PRESSURE_PLATE.get()));
        lootTables.put(ECBlockRegistry.GNEISS_BUTTON.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.GNEISS_BUTTON.get()));

        lootTables.put(ECBlockRegistry.GNEISS_COBBLESTONE.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.GNEISS_COBBLESTONE.get()));
        lootTables.put(ECBlockRegistry.GNEISS_COBBLESTONE_SLAB.get(), createSlabTable(ECConstants.MODID, ECBlockRegistry.GNEISS_COBBLESTONE_SLAB.get()));
        lootTables.put(ECBlockRegistry.GNEISS_COBBLESTONE_STAIRS.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.GNEISS_COBBLESTONE_STAIRS.get()));
        lootTables.put(ECBlockRegistry.GNEISS_COBBLESTONE_WALL.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.GNEISS_COBBLESTONE_WALL.get()));
        lootTables.put(ECBlockRegistry.GNEISS_COBBLESTONE_PRESSURE_PLATE.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.GNEISS_COBBLESTONE_PRESSURE_PLATE.get()));

        lootTables.put(ECBlockRegistry.SMOOTH_GNEISS.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.SMOOTH_GNEISS.get()));
        lootTables.put(ECBlockRegistry.SMOOTH_GNEISS_SLAB.get(), createSlabTable(ECConstants.MODID, ECBlockRegistry.SMOOTH_GNEISS_SLAB.get()));
        lootTables.put(ECBlockRegistry.SMOOTH_GNEISS_STAIRS.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.SMOOTH_GNEISS_STAIRS.get()));
        lootTables.put(ECBlockRegistry.SMOOTH_GNEISS_WALL.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.SMOOTH_GNEISS_WALL.get()));
        lootTables.put(ECBlockRegistry.SMOOTH_GNEISS_PRESSURE_PLATE.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.SMOOTH_GNEISS_PRESSURE_PLATE.get()));

        lootTables.put(ECBlockRegistry.POLISHED_GNEISS.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.POLISHED_GNEISS.get()));
        lootTables.put(ECBlockRegistry.POLISHED_GNEISS_SLAB.get(), createSlabTable(ECConstants.MODID, ECBlockRegistry.POLISHED_GNEISS_SLAB.get()));
        lootTables.put(ECBlockRegistry.POLISHED_GNEISS_STAIRS.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.POLISHED_GNEISS_STAIRS.get()));
        lootTables.put(ECBlockRegistry.POLISHED_GNEISS_WALL.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.POLISHED_GNEISS_WALL.get()));
        lootTables.put(ECBlockRegistry.POLISHED_GNEISS_PRESSURE_PLATE.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.POLISHED_GNEISS_PRESSURE_PLATE.get()));

        lootTables.put(ECBlockRegistry.GNEISS_PAVING.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.GNEISS_PAVING.get()));
        lootTables.put(ECBlockRegistry.GNEISS_PAVING_SLAB.get(), createSlabTable(ECConstants.MODID, ECBlockRegistry.GNEISS_PAVING_SLAB.get()));
        lootTables.put(ECBlockRegistry.GNEISS_PAVING_STAIRS.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.GNEISS_PAVING_STAIRS.get()));
        lootTables.put(ECBlockRegistry.GNEISS_PAVING_WALL.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.GNEISS_PAVING_WALL.get()));
        lootTables.put(ECBlockRegistry.GNEISS_PAVING_PRESSURE_PLATE.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.GNEISS_PAVING_PRESSURE_PLATE.get()));

        lootTables.put(ECBlockRegistry.GNEISS_TILES.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.GNEISS_TILES.get()));
        lootTables.put(ECBlockRegistry.GNEISS_TILES_SLAB.get(), createSlabTable(ECConstants.MODID, ECBlockRegistry.GNEISS_TILES_SLAB.get()));
        lootTables.put(ECBlockRegistry.GNEISS_TILES_STAIRS.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.GNEISS_TILES_STAIRS.get()));
        lootTables.put(ECBlockRegistry.GNEISS_TILES_WALL.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.GNEISS_TILES_WALL.get()));
        lootTables.put(ECBlockRegistry.GNEISS_TILES_PRESSURE_PLATE.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.GNEISS_TILES_PRESSURE_PLATE.get()));

        lootTables.put(ECBlockRegistry.GNEISS_BRICKS.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.GNEISS_BRICKS.get()));
        lootTables.put(ECBlockRegistry.GNEISS_BRICKS_SLAB.get(), createSlabTable(ECConstants.MODID, ECBlockRegistry.GNEISS_BRICKS_SLAB.get()));
        lootTables.put(ECBlockRegistry.GNEISS_BRICKS_STAIRS.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.GNEISS_BRICKS_STAIRS.get()));
        lootTables.put(ECBlockRegistry.GNEISS_BRICKS_WALL.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.GNEISS_BRICKS_WALL.get()));
        lootTables.put(ECBlockRegistry.GNEISS_BRICKS_PRESSURE_PLATE.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.GNEISS_BRICKS_PRESSURE_PLATE.get()));

        lootTables.put(ECBlockRegistry.GNEISS_LARGE_BRICKS.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.GNEISS_LARGE_BRICKS.get()));
        lootTables.put(ECBlockRegistry.GNEISS_LARGE_BRICKS_SLAB.get(), createSlabTable(ECConstants.MODID, ECBlockRegistry.GNEISS_LARGE_BRICKS_SLAB.get()));
        lootTables.put(ECBlockRegistry.GNEISS_LARGE_BRICKS_STAIRS.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.GNEISS_LARGE_BRICKS_STAIRS.get()));
        lootTables.put(ECBlockRegistry.GNEISS_LARGE_BRICKS_WALL.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.GNEISS_LARGE_BRICKS_WALL.get()));
        lootTables.put(ECBlockRegistry.GNEISS_LARGE_BRICKS_PRESSURE_PLATE.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.GNEISS_LARGE_BRICKS_PRESSURE_PLATE.get()));

        lootTables.put(ECBlockRegistry.GNEISS_ORNAMENT.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.GNEISS_ORNAMENT.get()));
        lootTables.put(ECBlockRegistry.GNEISS_ORNAMENT_PRESSURE_PLATE.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.GNEISS_ORNAMENT_PRESSURE_PLATE.get()));

        // Jade
        lootTables.put(ECBlockRegistry.JADE.get(), createSilkTable(ECConstants.MODID, ECBlockRegistry.JADE.get(), ECBlockRegistry.JADE_COBBLESTONE.get()));
        lootTables.put(ECBlockRegistry.JADE_SLAB.get(), createSlabTable(ECConstants.MODID, ECBlockRegistry.JADE_SLAB.get()));
        lootTables.put(ECBlockRegistry.JADE_STAIRS.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.JADE_STAIRS.get()));
        lootTables.put(ECBlockRegistry.JADE_WALL.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.JADE_WALL.get()));
        lootTables.put(ECBlockRegistry.JADE_PRESSURE_PLATE.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.JADE_PRESSURE_PLATE.get()));
        lootTables.put(ECBlockRegistry.JADE_BUTTON.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.JADE_BUTTON.get()));

        lootTables.put(ECBlockRegistry.JADE_COBBLESTONE.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.JADE_COBBLESTONE.get()));
        lootTables.put(ECBlockRegistry.JADE_COBBLESTONE_SLAB.get(), createSlabTable(ECConstants.MODID, ECBlockRegistry.JADE_COBBLESTONE_SLAB.get()));
        lootTables.put(ECBlockRegistry.JADE_COBBLESTONE_STAIRS.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.JADE_COBBLESTONE_STAIRS.get()));
        lootTables.put(ECBlockRegistry.JADE_COBBLESTONE_WALL.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.JADE_COBBLESTONE_WALL.get()));
        lootTables.put(ECBlockRegistry.JADE_COBBLESTONE_PRESSURE_PLATE.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.JADE_COBBLESTONE_PRESSURE_PLATE.get()));

        lootTables.put(ECBlockRegistry.SMOOTH_JADE.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.SMOOTH_JADE.get()));
        lootTables.put(ECBlockRegistry.SMOOTH_JADE_SLAB.get(), createSlabTable(ECConstants.MODID, ECBlockRegistry.SMOOTH_JADE_SLAB.get()));
        lootTables.put(ECBlockRegistry.SMOOTH_JADE_STAIRS.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.SMOOTH_JADE_STAIRS.get()));
        lootTables.put(ECBlockRegistry.SMOOTH_JADE_WALL.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.SMOOTH_JADE_WALL.get()));
        lootTables.put(ECBlockRegistry.SMOOTH_JADE_PRESSURE_PLATE.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.SMOOTH_JADE_PRESSURE_PLATE.get()));

        lootTables.put(ECBlockRegistry.POLISHED_JADE.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.POLISHED_JADE.get()));
        lootTables.put(ECBlockRegistry.POLISHED_JADE_SLAB.get(), createSlabTable(ECConstants.MODID, ECBlockRegistry.POLISHED_JADE_SLAB.get()));
        lootTables.put(ECBlockRegistry.POLISHED_JADE_STAIRS.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.POLISHED_JADE_STAIRS.get()));
        lootTables.put(ECBlockRegistry.POLISHED_JADE_WALL.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.POLISHED_JADE_WALL.get()));
        lootTables.put(ECBlockRegistry.POLISHED_JADE_PRESSURE_PLATE.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.POLISHED_JADE_PRESSURE_PLATE.get()));

        lootTables.put(ECBlockRegistry.JADE_PAVING.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.JADE_PAVING.get()));
        lootTables.put(ECBlockRegistry.JADE_PAVING_SLAB.get(), createSlabTable(ECConstants.MODID, ECBlockRegistry.JADE_PAVING_SLAB.get()));
        lootTables.put(ECBlockRegistry.JADE_PAVING_STAIRS.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.JADE_PAVING_STAIRS.get()));
        lootTables.put(ECBlockRegistry.JADE_PAVING_WALL.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.JADE_PAVING_WALL.get()));
        lootTables.put(ECBlockRegistry.JADE_PAVING_PRESSURE_PLATE.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.JADE_PAVING_PRESSURE_PLATE.get()));

        lootTables.put(ECBlockRegistry.JADE_TILES.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.JADE_TILES.get()));
        lootTables.put(ECBlockRegistry.JADE_TILES_SLAB.get(), createSlabTable(ECConstants.MODID, ECBlockRegistry.JADE_TILES_SLAB.get()));
        lootTables.put(ECBlockRegistry.JADE_TILES_STAIRS.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.JADE_TILES_STAIRS.get()));
        lootTables.put(ECBlockRegistry.JADE_TILES_WALL.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.JADE_TILES_WALL.get()));
        lootTables.put(ECBlockRegistry.JADE_TILES_PRESSURE_PLATE.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.JADE_TILES_PRESSURE_PLATE.get()));

        lootTables.put(ECBlockRegistry.JADE_BRICKS.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.JADE_BRICKS.get()));
        lootTables.put(ECBlockRegistry.JADE_BRICKS_SLAB.get(), createSlabTable(ECConstants.MODID, ECBlockRegistry.JADE_BRICKS_SLAB.get()));
        lootTables.put(ECBlockRegistry.JADE_BRICKS_STAIRS.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.JADE_BRICKS_STAIRS.get()));
        lootTables.put(ECBlockRegistry.JADE_BRICKS_WALL.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.JADE_BRICKS_WALL.get()));
        lootTables.put(ECBlockRegistry.JADE_BRICKS_PRESSURE_PLATE.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.JADE_BRICKS_PRESSURE_PLATE.get()));

        lootTables.put(ECBlockRegistry.JADE_LARGE_BRICKS.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.JADE_LARGE_BRICKS.get()));
        lootTables.put(ECBlockRegistry.JADE_LARGE_BRICKS_SLAB.get(), createSlabTable(ECConstants.MODID, ECBlockRegistry.JADE_LARGE_BRICKS_SLAB.get()));
        lootTables.put(ECBlockRegistry.JADE_LARGE_BRICKS_STAIRS.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.JADE_LARGE_BRICKS_STAIRS.get()));
        lootTables.put(ECBlockRegistry.JADE_LARGE_BRICKS_WALL.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.JADE_LARGE_BRICKS_WALL.get()));
        lootTables.put(ECBlockRegistry.JADE_LARGE_BRICKS_PRESSURE_PLATE.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.JADE_LARGE_BRICKS_PRESSURE_PLATE.get()));

        lootTables.put(ECBlockRegistry.JADE_ORNAMENT.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.JADE_ORNAMENT.get()));
        lootTables.put(ECBlockRegistry.JADE_ORNAMENT_PRESSURE_PLATE.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.JADE_ORNAMENT_PRESSURE_PLATE.get()));

        // Larvikite
        lootTables.put(ECBlockRegistry.LARVIKITE.get(), createSilkTable(ECConstants.MODID, ECBlockRegistry.LARVIKITE.get(), ECBlockRegistry.LARVIKITE_COBBLESTONE.get()));
        lootTables.put(ECBlockRegistry.LARVIKITE_SLAB.get(), createSlabTable(ECConstants.MODID, ECBlockRegistry.LARVIKITE_SLAB.get()));
        lootTables.put(ECBlockRegistry.LARVIKITE_STAIRS.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.LARVIKITE_STAIRS.get()));
        lootTables.put(ECBlockRegistry.LARVIKITE_WALL.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.LARVIKITE_WALL.get()));
        lootTables.put(ECBlockRegistry.LARVIKITE_PRESSURE_PLATE.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.LARVIKITE_PRESSURE_PLATE.get()));
        lootTables.put(ECBlockRegistry.LARVIKITE_BUTTON.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.LARVIKITE_BUTTON.get()));

        lootTables.put(ECBlockRegistry.LARVIKITE_COBBLESTONE.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.LARVIKITE_COBBLESTONE.get()));
        lootTables.put(ECBlockRegistry.LARVIKITE_COBBLESTONE_SLAB.get(), createSlabTable(ECConstants.MODID, ECBlockRegistry.LARVIKITE_COBBLESTONE_SLAB.get()));
        lootTables.put(ECBlockRegistry.LARVIKITE_COBBLESTONE_STAIRS.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.LARVIKITE_COBBLESTONE_STAIRS.get()));
        lootTables.put(ECBlockRegistry.LARVIKITE_COBBLESTONE_WALL.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.LARVIKITE_COBBLESTONE_WALL.get()));
        lootTables.put(ECBlockRegistry.LARVIKITE_COBBLESTONE_PRESSURE_PLATE.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.LARVIKITE_COBBLESTONE_PRESSURE_PLATE.get()));

        lootTables.put(ECBlockRegistry.SMOOTH_LARVIKITE.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.SMOOTH_LARVIKITE.get()));
        lootTables.put(ECBlockRegistry.SMOOTH_LARVIKITE_SLAB.get(), createSlabTable(ECConstants.MODID, ECBlockRegistry.SMOOTH_LARVIKITE_SLAB.get()));
        lootTables.put(ECBlockRegistry.SMOOTH_LARVIKITE_STAIRS.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.SMOOTH_LARVIKITE_STAIRS.get()));
        lootTables.put(ECBlockRegistry.SMOOTH_LARVIKITE_WALL.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.SMOOTH_LARVIKITE_WALL.get()));
        lootTables.put(ECBlockRegistry.SMOOTH_LARVIKITE_PRESSURE_PLATE.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.SMOOTH_LARVIKITE_PRESSURE_PLATE.get()));

        lootTables.put(ECBlockRegistry.POLISHED_LARVIKITE.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.POLISHED_LARVIKITE.get()));
        lootTables.put(ECBlockRegistry.POLISHED_LARVIKITE_SLAB.get(), createSlabTable(ECConstants.MODID, ECBlockRegistry.POLISHED_LARVIKITE_SLAB.get()));
        lootTables.put(ECBlockRegistry.POLISHED_LARVIKITE_STAIRS.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.POLISHED_LARVIKITE_STAIRS.get()));
        lootTables.put(ECBlockRegistry.POLISHED_LARVIKITE_WALL.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.POLISHED_LARVIKITE_WALL.get()));
        lootTables.put(ECBlockRegistry.POLISHED_LARVIKITE_PRESSURE_PLATE.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.POLISHED_LARVIKITE_PRESSURE_PLATE.get()));

        lootTables.put(ECBlockRegistry.LARVIKITE_PAVING.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.LARVIKITE_PAVING.get()));
        lootTables.put(ECBlockRegistry.LARVIKITE_PAVING_SLAB.get(), createSlabTable(ECConstants.MODID, ECBlockRegistry.LARVIKITE_PAVING_SLAB.get()));
        lootTables.put(ECBlockRegistry.LARVIKITE_PAVING_STAIRS.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.LARVIKITE_PAVING_STAIRS.get()));
        lootTables.put(ECBlockRegistry.LARVIKITE_PAVING_WALL.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.LARVIKITE_PAVING_WALL.get()));
        lootTables.put(ECBlockRegistry.LARVIKITE_PAVING_PRESSURE_PLATE.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.LARVIKITE_PAVING_PRESSURE_PLATE.get()));

        lootTables.put(ECBlockRegistry.LARVIKITE_TILES.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.LARVIKITE_TILES.get()));
        lootTables.put(ECBlockRegistry.LARVIKITE_TILES_SLAB.get(), createSlabTable(ECConstants.MODID, ECBlockRegistry.LARVIKITE_TILES_SLAB.get()));
        lootTables.put(ECBlockRegistry.LARVIKITE_TILES_STAIRS.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.LARVIKITE_TILES_STAIRS.get()));
        lootTables.put(ECBlockRegistry.LARVIKITE_TILES_WALL.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.LARVIKITE_TILES_WALL.get()));
        lootTables.put(ECBlockRegistry.LARVIKITE_TILES_PRESSURE_PLATE.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.LARVIKITE_TILES_PRESSURE_PLATE.get()));

        lootTables.put(ECBlockRegistry.LARVIKITE_BRICKS.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.LARVIKITE_BRICKS.get()));
        lootTables.put(ECBlockRegistry.LARVIKITE_BRICKS_SLAB.get(), createSlabTable(ECConstants.MODID, ECBlockRegistry.LARVIKITE_BRICKS_SLAB.get()));
        lootTables.put(ECBlockRegistry.LARVIKITE_BRICKS_STAIRS.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.LARVIKITE_BRICKS_STAIRS.get()));
        lootTables.put(ECBlockRegistry.LARVIKITE_BRICKS_WALL.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.LARVIKITE_BRICKS_WALL.get()));
        lootTables.put(ECBlockRegistry.LARVIKITE_BRICKS_PRESSURE_PLATE.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.LARVIKITE_BRICKS_PRESSURE_PLATE.get()));

        lootTables.put(ECBlockRegistry.LARVIKITE_LARGE_BRICKS.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.LARVIKITE_LARGE_BRICKS.get()));
        lootTables.put(ECBlockRegistry.LARVIKITE_LARGE_BRICKS_SLAB.get(), createSlabTable(ECConstants.MODID, ECBlockRegistry.LARVIKITE_LARGE_BRICKS_SLAB.get()));
        lootTables.put(ECBlockRegistry.LARVIKITE_LARGE_BRICKS_STAIRS.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.LARVIKITE_LARGE_BRICKS_STAIRS.get()));
        lootTables.put(ECBlockRegistry.LARVIKITE_LARGE_BRICKS_WALL.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.LARVIKITE_LARGE_BRICKS_WALL.get()));
        lootTables.put(ECBlockRegistry.LARVIKITE_LARGE_BRICKS_PRESSURE_PLATE.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.LARVIKITE_LARGE_BRICKS_PRESSURE_PLATE.get()));

        lootTables.put(ECBlockRegistry.LARVIKITE_ORNAMENT.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.LARVIKITE_ORNAMENT.get()));
        lootTables.put(ECBlockRegistry.LARVIKITE_ORNAMENT_PRESSURE_PLATE.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.LARVIKITE_ORNAMENT_PRESSURE_PLATE.get()));

        // Andesite
        lootTables.put(ECBlockRegistry.SMOOTH_ANDESITE.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.SMOOTH_ANDESITE.get()));
        lootTables.put(ECBlockRegistry.SMOOTH_ANDESITE_SLAB.get(), createSlabTable(ECConstants.MODID, ECBlockRegistry.SMOOTH_ANDESITE_SLAB.get()));
        lootTables.put(ECBlockRegistry.SMOOTH_ANDESITE_STAIRS.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.SMOOTH_ANDESITE_STAIRS.get()));
        lootTables.put(ECBlockRegistry.SMOOTH_ANDESITE_WALL.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.SMOOTH_ANDESITE_WALL.get()));
        lootTables.put(ECBlockRegistry.SMOOTH_ANDESITE_PRESSURE_PLATE.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.SMOOTH_ANDESITE_PRESSURE_PLATE.get()));
        lootTables.put(ECBlockRegistry.ANDESITE_BUTTON.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.ANDESITE_BUTTON.get()));

        lootTables.put(ECBlockRegistry.ANDESITE_PAVING.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.ANDESITE_PAVING.get()));
        lootTables.put(ECBlockRegistry.ANDESITE_PAVING_SLAB.get(), createSlabTable(ECConstants.MODID, ECBlockRegistry.ANDESITE_PAVING_SLAB.get()));
        lootTables.put(ECBlockRegistry.ANDESITE_PAVING_STAIRS.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.ANDESITE_PAVING_STAIRS.get()));
        lootTables.put(ECBlockRegistry.ANDESITE_PAVING_WALL.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.ANDESITE_PAVING_WALL.get()));
        lootTables.put(ECBlockRegistry.ANDESITE_PAVING_PRESSURE_PLATE.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.ANDESITE_PAVING_PRESSURE_PLATE.get()));

        lootTables.put(ECBlockRegistry.ANDESITE_TILES.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.ANDESITE_TILES.get()));
        lootTables.put(ECBlockRegistry.ANDESITE_TILES_SLAB.get(), createSlabTable(ECConstants.MODID, ECBlockRegistry.ANDESITE_TILES_SLAB.get()));
        lootTables.put(ECBlockRegistry.ANDESITE_TILES_STAIRS.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.ANDESITE_TILES_STAIRS.get()));
        lootTables.put(ECBlockRegistry.ANDESITE_TILES_WALL.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.ANDESITE_TILES_WALL.get()));
        lootTables.put(ECBlockRegistry.ANDESITE_TILES_PRESSURE_PLATE.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.ANDESITE_TILES_PRESSURE_PLATE.get()));

        lootTables.put(ECBlockRegistry.ANDESITE_BRICKS.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.ANDESITE_BRICKS.get()));
        lootTables.put(ECBlockRegistry.ANDESITE_BRICKS_SLAB.get(), createSlabTable(ECConstants.MODID, ECBlockRegistry.ANDESITE_BRICKS_SLAB.get()));
        lootTables.put(ECBlockRegistry.ANDESITE_BRICKS_STAIRS.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.ANDESITE_BRICKS_STAIRS.get()));
        lootTables.put(ECBlockRegistry.ANDESITE_BRICKS_WALL.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.ANDESITE_BRICKS_WALL.get()));
        lootTables.put(ECBlockRegistry.ANDESITE_BRICKS_PRESSURE_PLATE.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.ANDESITE_BRICKS_PRESSURE_PLATE.get()));

        lootTables.put(ECBlockRegistry.ANDESITE_LARGE_BRICKS.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.ANDESITE_LARGE_BRICKS.get()));
        lootTables.put(ECBlockRegistry.ANDESITE_LARGE_BRICKS_SLAB.get(), createSlabTable(ECConstants.MODID, ECBlockRegistry.ANDESITE_LARGE_BRICKS_SLAB.get()));
        lootTables.put(ECBlockRegistry.ANDESITE_LARGE_BRICKS_STAIRS.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.ANDESITE_LARGE_BRICKS_STAIRS.get()));
        lootTables.put(ECBlockRegistry.ANDESITE_LARGE_BRICKS_WALL.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.ANDESITE_LARGE_BRICKS_WALL.get()));
        lootTables.put(ECBlockRegistry.ANDESITE_LARGE_BRICKS_PRESSURE_PLATE.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.ANDESITE_LARGE_BRICKS_PRESSURE_PLATE.get()));

        lootTables.put(ECBlockRegistry.ANDESITE_ORNAMENT.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.ANDESITE_ORNAMENT.get()));
        lootTables.put(ECBlockRegistry.ANDESITE_ORNAMENT_PRESSURE_PLATE.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.ANDESITE_ORNAMENT_PRESSURE_PLATE.get()));

        // Diorite
        lootTables.put(ECBlockRegistry.SMOOTH_DIORITE.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.SMOOTH_DIORITE.get()));
        lootTables.put(ECBlockRegistry.SMOOTH_DIORITE_SLAB.get(), createSlabTable(ECConstants.MODID, ECBlockRegistry.SMOOTH_DIORITE_SLAB.get()));
        lootTables.put(ECBlockRegistry.SMOOTH_DIORITE_STAIRS.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.SMOOTH_DIORITE_STAIRS.get()));
        lootTables.put(ECBlockRegistry.SMOOTH_DIORITE_WALL.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.SMOOTH_DIORITE_WALL.get()));
        lootTables.put(ECBlockRegistry.SMOOTH_DIORITE_PRESSURE_PLATE.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.SMOOTH_DIORITE_PRESSURE_PLATE.get()));
        lootTables.put(ECBlockRegistry.DIORITE_BUTTON.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.DIORITE_BUTTON.get()));

        lootTables.put(ECBlockRegistry.DIORITE_PAVING.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.DIORITE_PAVING.get()));
        lootTables.put(ECBlockRegistry.DIORITE_PAVING_SLAB.get(), createSlabTable(ECConstants.MODID, ECBlockRegistry.DIORITE_PAVING_SLAB.get()));
        lootTables.put(ECBlockRegistry.DIORITE_PAVING_STAIRS.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.DIORITE_PAVING_STAIRS.get()));
        lootTables.put(ECBlockRegistry.DIORITE_PAVING_WALL.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.DIORITE_PAVING_WALL.get()));
        lootTables.put(ECBlockRegistry.DIORITE_PAVING_PRESSURE_PLATE.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.DIORITE_PAVING_PRESSURE_PLATE.get()));

        lootTables.put(ECBlockRegistry.DIORITE_TILES.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.DIORITE_TILES.get()));
        lootTables.put(ECBlockRegistry.DIORITE_TILES_SLAB.get(), createSlabTable(ECConstants.MODID, ECBlockRegistry.DIORITE_TILES_SLAB.get()));
        lootTables.put(ECBlockRegistry.DIORITE_TILES_STAIRS.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.DIORITE_TILES_STAIRS.get()));
        lootTables.put(ECBlockRegistry.DIORITE_TILES_WALL.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.DIORITE_TILES_WALL.get()));
        lootTables.put(ECBlockRegistry.DIORITE_TILES_PRESSURE_PLATE.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.DIORITE_TILES_PRESSURE_PLATE.get()));

        lootTables.put(ECBlockRegistry.DIORITE_BRICKS.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.DIORITE_BRICKS.get()));
        lootTables.put(ECBlockRegistry.DIORITE_BRICKS_SLAB.get(), createSlabTable(ECConstants.MODID, ECBlockRegistry.DIORITE_BRICKS_SLAB.get()));
        lootTables.put(ECBlockRegistry.DIORITE_BRICKS_STAIRS.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.DIORITE_BRICKS_STAIRS.get()));
        lootTables.put(ECBlockRegistry.DIORITE_BRICKS_WALL.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.DIORITE_BRICKS_WALL.get()));
        lootTables.put(ECBlockRegistry.DIORITE_BRICKS_PRESSURE_PLATE.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.DIORITE_BRICKS_PRESSURE_PLATE.get()));

        lootTables.put(ECBlockRegistry.DIORITE_LARGE_BRICKS.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.DIORITE_LARGE_BRICKS.get()));
        lootTables.put(ECBlockRegistry.DIORITE_LARGE_BRICKS_SLAB.get(), createSlabTable(ECConstants.MODID, ECBlockRegistry.DIORITE_LARGE_BRICKS_SLAB.get()));
        lootTables.put(ECBlockRegistry.DIORITE_LARGE_BRICKS_STAIRS.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.DIORITE_LARGE_BRICKS_STAIRS.get()));
        lootTables.put(ECBlockRegistry.DIORITE_LARGE_BRICKS_WALL.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.DIORITE_LARGE_BRICKS_WALL.get()));
        lootTables.put(ECBlockRegistry.DIORITE_LARGE_BRICKS_PRESSURE_PLATE.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.DIORITE_LARGE_BRICKS_PRESSURE_PLATE.get()));

        lootTables.put(ECBlockRegistry.DIORITE_ORNAMENT.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.DIORITE_ORNAMENT.get()));
        lootTables.put(ECBlockRegistry.DIORITE_ORNAMENT_PRESSURE_PLATE.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.DIORITE_ORNAMENT_PRESSURE_PLATE.get()));

        // Granite
        lootTables.put(ECBlockRegistry.SMOOTH_GRANITE.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.SMOOTH_GRANITE.get()));
        lootTables.put(ECBlockRegistry.SMOOTH_GRANITE_SLAB.get(), createSlabTable(ECConstants.MODID, ECBlockRegistry.SMOOTH_GRANITE_SLAB.get()));
        lootTables.put(ECBlockRegistry.SMOOTH_GRANITE_STAIRS.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.SMOOTH_GRANITE_STAIRS.get()));
        lootTables.put(ECBlockRegistry.SMOOTH_GRANITE_WALL.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.SMOOTH_GRANITE_WALL.get()));
        lootTables.put(ECBlockRegistry.SMOOTH_GRANITE_PRESSURE_PLATE.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.SMOOTH_GRANITE_PRESSURE_PLATE.get()));
        lootTables.put(ECBlockRegistry.GRANITE_BUTTON.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.GRANITE_BUTTON.get()));

        lootTables.put(ECBlockRegistry.GRANITE_PAVING.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.GRANITE_PAVING.get()));
        lootTables.put(ECBlockRegistry.GRANITE_PAVING_SLAB.get(), createSlabTable(ECConstants.MODID, ECBlockRegistry.GRANITE_PAVING_SLAB.get()));
        lootTables.put(ECBlockRegistry.GRANITE_PAVING_STAIRS.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.GRANITE_PAVING_STAIRS.get()));
        lootTables.put(ECBlockRegistry.GRANITE_PAVING_WALL.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.GRANITE_PAVING_WALL.get()));
        lootTables.put(ECBlockRegistry.GRANITE_PAVING_PRESSURE_PLATE.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.GRANITE_PAVING_PRESSURE_PLATE.get()));

        lootTables.put(ECBlockRegistry.GRANITE_TILES.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.GRANITE_TILES.get()));
        lootTables.put(ECBlockRegistry.GRANITE_TILES_SLAB.get(), createSlabTable(ECConstants.MODID, ECBlockRegistry.GRANITE_TILES_SLAB.get()));
        lootTables.put(ECBlockRegistry.GRANITE_TILES_STAIRS.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.GRANITE_TILES_STAIRS.get()));
        lootTables.put(ECBlockRegistry.GRANITE_TILES_WALL.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.GRANITE_TILES_WALL.get()));
        lootTables.put(ECBlockRegistry.GRANITE_TILES_PRESSURE_PLATE.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.GRANITE_TILES_PRESSURE_PLATE.get()));

        lootTables.put(ECBlockRegistry.GRANITE_BRICKS.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.GRANITE_BRICKS.get()));
        lootTables.put(ECBlockRegistry.GRANITE_BRICKS_SLAB.get(), createSlabTable(ECConstants.MODID, ECBlockRegistry.GRANITE_BRICKS_SLAB.get()));
        lootTables.put(ECBlockRegistry.GRANITE_BRICKS_STAIRS.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.GRANITE_BRICKS_STAIRS.get()));
        lootTables.put(ECBlockRegistry.GRANITE_BRICKS_WALL.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.GRANITE_BRICKS_WALL.get()));
        lootTables.put(ECBlockRegistry.GRANITE_BRICKS_PRESSURE_PLATE.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.GRANITE_BRICKS_PRESSURE_PLATE.get()));

        lootTables.put(ECBlockRegistry.GRANITE_LARGE_BRICKS.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.GRANITE_LARGE_BRICKS.get()));
        lootTables.put(ECBlockRegistry.GRANITE_LARGE_BRICKS_SLAB.get(), createSlabTable(ECConstants.MODID, ECBlockRegistry.GRANITE_LARGE_BRICKS_SLAB.get()));
        lootTables.put(ECBlockRegistry.GRANITE_LARGE_BRICKS_STAIRS.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.GRANITE_LARGE_BRICKS_STAIRS.get()));
        lootTables.put(ECBlockRegistry.GRANITE_LARGE_BRICKS_WALL.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.GRANITE_LARGE_BRICKS_WALL.get()));
        lootTables.put(ECBlockRegistry.GRANITE_LARGE_BRICKS_PRESSURE_PLATE.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.GRANITE_LARGE_BRICKS_PRESSURE_PLATE.get()));

        lootTables.put(ECBlockRegistry.GRANITE_ORNAMENT.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.GRANITE_ORNAMENT.get()));
        lootTables.put(ECBlockRegistry.GRANITE_ORNAMENT_PRESSURE_PLATE.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.GRANITE_ORNAMENT_PRESSURE_PLATE.get()));
    }
}
