package tv.mapper.embellishcraft.data.gen;

import java.util.Arrays;

import net.minecraft.advancements.criterion.StatePropertiesPredicate;
import net.minecraft.block.Block;
import net.minecraft.data.DataGenerator;
import net.minecraft.item.DyeColor;
import net.minecraft.world.storage.loot.ConstantRange;
import net.minecraft.world.storage.loot.DynamicLootEntry;
import net.minecraft.world.storage.loot.ItemLootEntry;
import net.minecraft.world.storage.loot.LootPool;
import net.minecraft.world.storage.loot.LootTable;
import net.minecraft.world.storage.loot.conditions.BlockStateProperty;
import net.minecraft.world.storage.loot.functions.CopyName;
import net.minecraft.world.storage.loot.functions.CopyNbt;
import net.minecraft.world.storage.loot.functions.SetContents;
import net.minecraft.world.storage.loot.functions.SetCount;
import tv.mapper.embellishcraft.ECConstants;
import tv.mapper.embellishcraft.block.CrateBlock;
import tv.mapper.embellishcraft.block.ECBlockRegistry;
import tv.mapper.embellishcraft.block.PlateBlock;
import tv.mapper.embellishcraft.util.McWoods;
import tv.mapper.embellishcraft.util.RockType;
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
        for(int j = 0; j < Arrays.stream(RockType.values()).count(); j++)
        {
            // Rocks
            lootTables.put(ECBlockRegistry.ROCK_BLOCKS.get(RockType.byId(j)).get(),
                createSilkTable(ECConstants.MODID, ECBlockRegistry.ROCK_BLOCKS.get(RockType.byId(j)).get(), ECBlockRegistry.ROCK_COBBLESTONES.get(RockType.byId(j)).get()));
            lootTables.put(ECBlockRegistry.ROCK_STAIRS.get(RockType.byId(j)).get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.ROCK_STAIRS.get(RockType.byId(j)).get()));
            lootTables.put(ECBlockRegistry.ROCK_SLABS.get(RockType.byId(j)).get(), createSlabTable(ECConstants.MODID, ECBlockRegistry.ROCK_SLABS.get(RockType.byId(j)).get()));
            lootTables.put(ECBlockRegistry.ROCK_WALLS.get(RockType.byId(j)).get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.ROCK_WALLS.get(RockType.byId(j)).get()));
            lootTables.put(ECBlockRegistry.ROCK_PRESSURE_PLATES.get(RockType.byId(j)).get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.ROCK_PRESSURE_PLATES.get(RockType.byId(j)).get()));
            lootTables.put(ECBlockRegistry.ROCK_BUTTONS.get(RockType.byId(j)).get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.ROCK_BUTTONS.get(RockType.byId(j)).get()));

            // Cobblestones
            lootTables.put(ECBlockRegistry.ROCK_COBBLESTONES.get(RockType.byId(j)).get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.ROCK_COBBLESTONES.get(RockType.byId(j)).get()));
            lootTables.put(ECBlockRegistry.ROCK_COBBLESTONE_STAIRS.get(RockType.byId(j)).get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.ROCK_COBBLESTONE_STAIRS.get(RockType.byId(j)).get()));
            lootTables.put(ECBlockRegistry.ROCK_COBBLESTONE_SLABS.get(RockType.byId(j)).get(), createSlabTable(ECConstants.MODID, ECBlockRegistry.ROCK_COBBLESTONE_SLABS.get(RockType.byId(j)).get()));
            lootTables.put(ECBlockRegistry.ROCK_COBBLESTONE_WALLS.get(RockType.byId(j)).get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.ROCK_COBBLESTONE_WALLS.get(RockType.byId(j)).get()));
            lootTables.put(ECBlockRegistry.ROCK_COBBLESTONE_PRESSURE_PLATES.get(RockType.byId(j)).get(),
                createStandardTable(ECConstants.MODID, ECBlockRegistry.ROCK_COBBLESTONE_PRESSURE_PLATES.get(RockType.byId(j)).get()));

            // Smooth rocks
            lootTables.put(ECBlockRegistry.SMOOTH_ROCK_BLOCKS.get(RockType.byId(j)).get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.SMOOTH_ROCK_BLOCKS.get(RockType.byId(j)).get()));
            lootTables.put(ECBlockRegistry.SMOOTH_ROCK_STAIRS.get(RockType.byId(j)).get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.SMOOTH_ROCK_STAIRS.get(RockType.byId(j)).get()));
            lootTables.put(ECBlockRegistry.SMOOTH_ROCK_SLABS.get(RockType.byId(j)).get(), createSlabTable(ECConstants.MODID, ECBlockRegistry.SMOOTH_ROCK_SLABS.get(RockType.byId(j)).get()));
            lootTables.put(ECBlockRegistry.SMOOTH_ROCK_WALLS.get(RockType.byId(j)).get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.SMOOTH_ROCK_WALLS.get(RockType.byId(j)).get()));
            lootTables.put(ECBlockRegistry.SMOOTH_ROCK_PRESSURE_PLATES.get(RockType.byId(j)).get(),
                createStandardTable(ECConstants.MODID, ECBlockRegistry.SMOOTH_ROCK_PRESSURE_PLATES.get(RockType.byId(j)).get()));

            // Polished rocks
            lootTables.put(ECBlockRegistry.POLISHED_ROCK_BLOCKS.get(RockType.byId(j)).get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.POLISHED_ROCK_BLOCKS.get(RockType.byId(j)).get()));
            lootTables.put(ECBlockRegistry.POLISHED_ROCK_STAIRS.get(RockType.byId(j)).get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.POLISHED_ROCK_STAIRS.get(RockType.byId(j)).get()));
            lootTables.put(ECBlockRegistry.POLISHED_ROCK_SLABS.get(RockType.byId(j)).get(), createSlabTable(ECConstants.MODID, ECBlockRegistry.POLISHED_ROCK_SLABS.get(RockType.byId(j)).get()));
            lootTables.put(ECBlockRegistry.POLISHED_ROCK_WALLS.get(RockType.byId(j)).get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.POLISHED_ROCK_WALLS.get(RockType.byId(j)).get()));
            lootTables.put(ECBlockRegistry.POLISHED_ROCK_PRESSURE_PLATES.get(RockType.byId(j)).get(),
                createStandardTable(ECConstants.MODID, ECBlockRegistry.POLISHED_ROCK_PRESSURE_PLATES.get(RockType.byId(j)).get()));

            // Rock pavings
            lootTables.put(ECBlockRegistry.ROCK_PAVINGS.get(RockType.byId(j)).get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.ROCK_PAVINGS.get(RockType.byId(j)).get()));
            lootTables.put(ECBlockRegistry.ROCK_PAVING_STAIRS.get(RockType.byId(j)).get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.ROCK_PAVING_STAIRS.get(RockType.byId(j)).get()));
            lootTables.put(ECBlockRegistry.ROCK_PAVING_SLABS.get(RockType.byId(j)).get(), createSlabTable(ECConstants.MODID, ECBlockRegistry.ROCK_PAVING_SLABS.get(RockType.byId(j)).get()));
            lootTables.put(ECBlockRegistry.ROCK_PAVING_WALLS.get(RockType.byId(j)).get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.ROCK_PAVING_WALLS.get(RockType.byId(j)).get()));
            lootTables.put(ECBlockRegistry.ROCK_PAVING_PRESSURE_PLATES.get(RockType.byId(j)).get(),
                createStandardTable(ECConstants.MODID, ECBlockRegistry.ROCK_PAVING_PRESSURE_PLATES.get(RockType.byId(j)).get()));

            // Rock tiles
            lootTables.put(ECBlockRegistry.ROCK_TILES.get(RockType.byId(j)).get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.ROCK_TILES.get(RockType.byId(j)).get()));
            lootTables.put(ECBlockRegistry.ROCK_TILES_STAIRS.get(RockType.byId(j)).get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.ROCK_TILES_STAIRS.get(RockType.byId(j)).get()));
            lootTables.put(ECBlockRegistry.ROCK_TILES_SLABS.get(RockType.byId(j)).get(), createSlabTable(ECConstants.MODID, ECBlockRegistry.ROCK_TILES_SLABS.get(RockType.byId(j)).get()));
            lootTables.put(ECBlockRegistry.ROCK_TILES_WALLS.get(RockType.byId(j)).get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.ROCK_TILES_WALLS.get(RockType.byId(j)).get()));
            lootTables.put(ECBlockRegistry.ROCK_TILES_PRESSURE_PLATES.get(RockType.byId(j)).get(),
                createStandardTable(ECConstants.MODID, ECBlockRegistry.ROCK_TILES_PRESSURE_PLATES.get(RockType.byId(j)).get()));

            // Rock bricks
            lootTables.put(ECBlockRegistry.ROCK_BRICKS.get(RockType.byId(j)).get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.ROCK_BRICKS.get(RockType.byId(j)).get()));
            lootTables.put(ECBlockRegistry.ROCK_BRICKS_STAIRS.get(RockType.byId(j)).get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.ROCK_BRICKS_STAIRS.get(RockType.byId(j)).get()));
            lootTables.put(ECBlockRegistry.ROCK_BRICKS_SLABS.get(RockType.byId(j)).get(), createSlabTable(ECConstants.MODID, ECBlockRegistry.ROCK_BRICKS_SLABS.get(RockType.byId(j)).get()));
            lootTables.put(ECBlockRegistry.ROCK_BRICKS_WALLS.get(RockType.byId(j)).get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.ROCK_BRICKS_WALLS.get(RockType.byId(j)).get()));
            lootTables.put(ECBlockRegistry.ROCK_BRICKS_PRESSURE_PLATES.get(RockType.byId(j)).get(),
                createStandardTable(ECConstants.MODID, ECBlockRegistry.ROCK_BRICKS_PRESSURE_PLATES.get(RockType.byId(j)).get()));

            // Rock large bricks
            lootTables.put(ECBlockRegistry.ROCK_LARGE_BRICKS.get(RockType.byId(j)).get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.ROCK_LARGE_BRICKS.get(RockType.byId(j)).get()));
            lootTables.put(ECBlockRegistry.ROCK_LARGE_BRICKS_STAIRS.get(RockType.byId(j)).get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.ROCK_LARGE_BRICKS_STAIRS.get(RockType.byId(j)).get()));
            lootTables.put(ECBlockRegistry.ROCK_LARGE_BRICKS_SLABS.get(RockType.byId(j)).get(), createSlabTable(ECConstants.MODID, ECBlockRegistry.ROCK_LARGE_BRICKS_SLABS.get(RockType.byId(j)).get()));
            lootTables.put(ECBlockRegistry.ROCK_LARGE_BRICKS_WALLS.get(RockType.byId(j)).get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.ROCK_LARGE_BRICKS_WALLS.get(RockType.byId(j)).get()));
            lootTables.put(ECBlockRegistry.ROCK_LARGE_BRICKS_PRESSURE_PLATES.get(RockType.byId(j)).get(),
                createStandardTable(ECConstants.MODID, ECBlockRegistry.ROCK_LARGE_BRICKS_PRESSURE_PLATES.get(RockType.byId(j)).get()));

            // Rock ornaments
            lootTables.put(ECBlockRegistry.ROCK_ORNAMENTS.get(RockType.byId(j)).get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.ROCK_ORNAMENTS.get(RockType.byId(j)).get()));
            lootTables.put(ECBlockRegistry.ROCK_ORNAMENT_PRESSURE_PLATES.get(RockType.byId(j)).get(),
                createStandardTable(ECConstants.MODID, ECBlockRegistry.ROCK_ORNAMENT_PRESSURE_PLATES.get(RockType.byId(j)).get()));

        }

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

        // Sandstone
        lootTables.put(ECBlockRegistry.SANDSTONE_BUTTON.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.SANDSTONE_BUTTON.get()));

        lootTables.put(ECBlockRegistry.SMOOTH_SANDSTONE_WALL.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.SMOOTH_SANDSTONE_WALL.get()));
        lootTables.put(ECBlockRegistry.SMOOTH_SANDSTONE_PRESSURE_PLATE.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.SMOOTH_SANDSTONE_PRESSURE_PLATE.get()));

        lootTables.put(ECBlockRegistry.POLISHED_SANDSTONE.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.POLISHED_SANDSTONE.get()));
        lootTables.put(ECBlockRegistry.POLISHED_SANDSTONE_SLAB.get(), createSlabTable(ECConstants.MODID, ECBlockRegistry.POLISHED_SANDSTONE_SLAB.get()));
        lootTables.put(ECBlockRegistry.POLISHED_SANDSTONE_STAIRS.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.POLISHED_SANDSTONE_STAIRS.get()));
        lootTables.put(ECBlockRegistry.POLISHED_SANDSTONE_WALL.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.POLISHED_SANDSTONE_WALL.get()));
        lootTables.put(ECBlockRegistry.POLISHED_SANDSTONE_PRESSURE_PLATE.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.POLISHED_SANDSTONE_PRESSURE_PLATE.get()));

        lootTables.put(ECBlockRegistry.SANDSTONE_PAVING.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.SANDSTONE_PAVING.get()));
        lootTables.put(ECBlockRegistry.SANDSTONE_PAVING_SLAB.get(), createSlabTable(ECConstants.MODID, ECBlockRegistry.SANDSTONE_PAVING_SLAB.get()));
        lootTables.put(ECBlockRegistry.SANDSTONE_PAVING_STAIRS.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.SANDSTONE_PAVING_STAIRS.get()));
        lootTables.put(ECBlockRegistry.SANDSTONE_PAVING_WALL.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.SANDSTONE_PAVING_WALL.get()));
        lootTables.put(ECBlockRegistry.SANDSTONE_PAVING_PRESSURE_PLATE.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.SANDSTONE_PAVING_PRESSURE_PLATE.get()));

        lootTables.put(ECBlockRegistry.SANDSTONE_TILES.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.SANDSTONE_TILES.get()));
        lootTables.put(ECBlockRegistry.SANDSTONE_TILES_SLAB.get(), createSlabTable(ECConstants.MODID, ECBlockRegistry.SANDSTONE_TILES_SLAB.get()));
        lootTables.put(ECBlockRegistry.SANDSTONE_TILES_STAIRS.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.SANDSTONE_TILES_STAIRS.get()));
        lootTables.put(ECBlockRegistry.SANDSTONE_TILES_WALL.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.SANDSTONE_TILES_WALL.get()));
        lootTables.put(ECBlockRegistry.SANDSTONE_TILES_PRESSURE_PLATE.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.SANDSTONE_TILES_PRESSURE_PLATE.get()));

        lootTables.put(ECBlockRegistry.SANDSTONE_BRICKS.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.SANDSTONE_BRICKS.get()));
        lootTables.put(ECBlockRegistry.SANDSTONE_BRICKS_SLAB.get(), createSlabTable(ECConstants.MODID, ECBlockRegistry.SANDSTONE_BRICKS_SLAB.get()));
        lootTables.put(ECBlockRegistry.SANDSTONE_BRICKS_STAIRS.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.SANDSTONE_BRICKS_STAIRS.get()));
        lootTables.put(ECBlockRegistry.SANDSTONE_BRICKS_WALL.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.SANDSTONE_BRICKS_WALL.get()));
        lootTables.put(ECBlockRegistry.SANDSTONE_BRICKS_PRESSURE_PLATE.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.SANDSTONE_BRICKS_PRESSURE_PLATE.get()));

        lootTables.put(ECBlockRegistry.SANDSTONE_LARGE_BRICKS.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.SANDSTONE_LARGE_BRICKS.get()));
        lootTables.put(ECBlockRegistry.SANDSTONE_LARGE_BRICKS_SLAB.get(), createSlabTable(ECConstants.MODID, ECBlockRegistry.SANDSTONE_LARGE_BRICKS_SLAB.get()));
        lootTables.put(ECBlockRegistry.SANDSTONE_LARGE_BRICKS_STAIRS.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.SANDSTONE_LARGE_BRICKS_STAIRS.get()));
        lootTables.put(ECBlockRegistry.SANDSTONE_LARGE_BRICKS_WALL.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.SANDSTONE_LARGE_BRICKS_WALL.get()));
        lootTables.put(ECBlockRegistry.SANDSTONE_LARGE_BRICKS_PRESSURE_PLATE.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.SANDSTONE_LARGE_BRICKS_PRESSURE_PLATE.get()));

        // Red Sandstone
        lootTables.put(ECBlockRegistry.RED_SANDSTONE_BUTTON.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.RED_SANDSTONE_BUTTON.get()));

        lootTables.put(ECBlockRegistry.SMOOTH_RED_SANDSTONE_WALL.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.SMOOTH_RED_SANDSTONE_WALL.get()));
        lootTables.put(ECBlockRegistry.SMOOTH_RED_SANDSTONE_PRESSURE_PLATE.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.SMOOTH_RED_SANDSTONE_PRESSURE_PLATE.get()));

        lootTables.put(ECBlockRegistry.POLISHED_RED_SANDSTONE.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.POLISHED_RED_SANDSTONE.get()));
        lootTables.put(ECBlockRegistry.POLISHED_RED_SANDSTONE_SLAB.get(), createSlabTable(ECConstants.MODID, ECBlockRegistry.POLISHED_RED_SANDSTONE_SLAB.get()));
        lootTables.put(ECBlockRegistry.POLISHED_RED_SANDSTONE_STAIRS.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.POLISHED_RED_SANDSTONE_STAIRS.get()));
        lootTables.put(ECBlockRegistry.POLISHED_RED_SANDSTONE_WALL.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.POLISHED_RED_SANDSTONE_WALL.get()));
        lootTables.put(ECBlockRegistry.POLISHED_RED_SANDSTONE_PRESSURE_PLATE.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.POLISHED_RED_SANDSTONE_PRESSURE_PLATE.get()));

        lootTables.put(ECBlockRegistry.RED_SANDSTONE_PAVING.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.RED_SANDSTONE_PAVING.get()));
        lootTables.put(ECBlockRegistry.RED_SANDSTONE_PAVING_SLAB.get(), createSlabTable(ECConstants.MODID, ECBlockRegistry.RED_SANDSTONE_PAVING_SLAB.get()));
        lootTables.put(ECBlockRegistry.RED_SANDSTONE_PAVING_STAIRS.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.RED_SANDSTONE_PAVING_STAIRS.get()));
        lootTables.put(ECBlockRegistry.RED_SANDSTONE_PAVING_WALL.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.RED_SANDSTONE_PAVING_WALL.get()));
        lootTables.put(ECBlockRegistry.RED_SANDSTONE_PAVING_PRESSURE_PLATE.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.RED_SANDSTONE_PAVING_PRESSURE_PLATE.get()));

        lootTables.put(ECBlockRegistry.RED_SANDSTONE_TILES.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.RED_SANDSTONE_TILES.get()));
        lootTables.put(ECBlockRegistry.RED_SANDSTONE_TILES_SLAB.get(), createSlabTable(ECConstants.MODID, ECBlockRegistry.RED_SANDSTONE_TILES_SLAB.get()));
        lootTables.put(ECBlockRegistry.RED_SANDSTONE_TILES_STAIRS.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.RED_SANDSTONE_TILES_STAIRS.get()));
        lootTables.put(ECBlockRegistry.RED_SANDSTONE_TILES_WALL.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.RED_SANDSTONE_TILES_WALL.get()));
        lootTables.put(ECBlockRegistry.RED_SANDSTONE_TILES_PRESSURE_PLATE.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.RED_SANDSTONE_TILES_PRESSURE_PLATE.get()));

        lootTables.put(ECBlockRegistry.RED_SANDSTONE_BRICKS.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.RED_SANDSTONE_BRICKS.get()));
        lootTables.put(ECBlockRegistry.RED_SANDSTONE_BRICKS_SLAB.get(), createSlabTable(ECConstants.MODID, ECBlockRegistry.RED_SANDSTONE_BRICKS_SLAB.get()));
        lootTables.put(ECBlockRegistry.RED_SANDSTONE_BRICKS_STAIRS.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.RED_SANDSTONE_BRICKS_STAIRS.get()));
        lootTables.put(ECBlockRegistry.RED_SANDSTONE_BRICKS_WALL.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.RED_SANDSTONE_BRICKS_WALL.get()));
        lootTables.put(ECBlockRegistry.RED_SANDSTONE_BRICKS_PRESSURE_PLATE.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.RED_SANDSTONE_BRICKS_PRESSURE_PLATE.get()));

        lootTables.put(ECBlockRegistry.RED_SANDSTONE_LARGE_BRICKS.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.RED_SANDSTONE_LARGE_BRICKS.get()));
        lootTables.put(ECBlockRegistry.RED_SANDSTONE_LARGE_BRICKS_SLAB.get(), createSlabTable(ECConstants.MODID, ECBlockRegistry.RED_SANDSTONE_LARGE_BRICKS_SLAB.get()));
        lootTables.put(ECBlockRegistry.RED_SANDSTONE_LARGE_BRICKS_STAIRS.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.RED_SANDSTONE_LARGE_BRICKS_STAIRS.get()));
        lootTables.put(ECBlockRegistry.RED_SANDSTONE_LARGE_BRICKS_WALL.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.RED_SANDSTONE_LARGE_BRICKS_WALL.get()));
        lootTables.put(ECBlockRegistry.RED_SANDSTONE_LARGE_BRICKS_PRESSURE_PLATE.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.RED_SANDSTONE_LARGE_BRICKS_PRESSURE_PLATE.get()));

        // Terracotta
        lootTables.put(ECBlockRegistry.TERRACOTTA_SLAB.get(), createSlabTable(ECConstants.MODID, ECBlockRegistry.TERRACOTTA_SLAB.get()));
        lootTables.put(ECBlockRegistry.TERRACOTTA_STAIRS.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.TERRACOTTA_STAIRS.get()));
        lootTables.put(ECBlockRegistry.TERRACOTTA_WALL.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.TERRACOTTA_WALL.get()));
        lootTables.put(ECBlockRegistry.TERRACOTTA_PRESSURE_PLATE.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.TERRACOTTA_PRESSURE_PLATE.get()));
        lootTables.put(ECBlockRegistry.TERRACOTTA_BUTTON.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.TERRACOTTA_BUTTON.get()));

        lootTables.put(ECBlockRegistry.POLISHED_TERRACOTTA.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.POLISHED_TERRACOTTA.get()));
        lootTables.put(ECBlockRegistry.POLISHED_TERRACOTTA_SLAB.get(), createSlabTable(ECConstants.MODID, ECBlockRegistry.POLISHED_TERRACOTTA_SLAB.get()));
        lootTables.put(ECBlockRegistry.POLISHED_TERRACOTTA_STAIRS.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.POLISHED_TERRACOTTA_STAIRS.get()));
        lootTables.put(ECBlockRegistry.POLISHED_TERRACOTTA_WALL.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.POLISHED_TERRACOTTA_WALL.get()));
        lootTables.put(ECBlockRegistry.POLISHED_TERRACOTTA_PRESSURE_PLATE.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.POLISHED_TERRACOTTA_PRESSURE_PLATE.get()));

        lootTables.put(ECBlockRegistry.TERRACOTTA_PAVING.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.TERRACOTTA_PAVING.get()));
        lootTables.put(ECBlockRegistry.TERRACOTTA_PAVING_SLAB.get(), createSlabTable(ECConstants.MODID, ECBlockRegistry.TERRACOTTA_PAVING_SLAB.get()));
        lootTables.put(ECBlockRegistry.TERRACOTTA_PAVING_STAIRS.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.TERRACOTTA_PAVING_STAIRS.get()));
        lootTables.put(ECBlockRegistry.TERRACOTTA_PAVING_WALL.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.TERRACOTTA_PAVING_WALL.get()));
        lootTables.put(ECBlockRegistry.TERRACOTTA_PAVING_PRESSURE_PLATE.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.TERRACOTTA_PAVING_PRESSURE_PLATE.get()));

        lootTables.put(ECBlockRegistry.TERRACOTTA_TILES.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.TERRACOTTA_TILES.get()));
        lootTables.put(ECBlockRegistry.TERRACOTTA_TILES_SLAB.get(), createSlabTable(ECConstants.MODID, ECBlockRegistry.TERRACOTTA_TILES_SLAB.get()));
        lootTables.put(ECBlockRegistry.TERRACOTTA_TILES_STAIRS.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.TERRACOTTA_TILES_STAIRS.get()));
        lootTables.put(ECBlockRegistry.TERRACOTTA_TILES_WALL.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.TERRACOTTA_TILES_WALL.get()));
        lootTables.put(ECBlockRegistry.TERRACOTTA_TILES_PRESSURE_PLATE.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.TERRACOTTA_TILES_PRESSURE_PLATE.get()));

        lootTables.put(ECBlockRegistry.TERRACOTTA_BRICKS.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.TERRACOTTA_BRICKS.get()));
        lootTables.put(ECBlockRegistry.TERRACOTTA_BRICKS_SLAB.get(), createSlabTable(ECConstants.MODID, ECBlockRegistry.TERRACOTTA_BRICKS_SLAB.get()));
        lootTables.put(ECBlockRegistry.TERRACOTTA_BRICKS_STAIRS.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.TERRACOTTA_BRICKS_STAIRS.get()));
        lootTables.put(ECBlockRegistry.TERRACOTTA_BRICKS_WALL.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.TERRACOTTA_BRICKS_WALL.get()));
        lootTables.put(ECBlockRegistry.TERRACOTTA_BRICKS_PRESSURE_PLATE.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.TERRACOTTA_BRICKS_PRESSURE_PLATE.get()));

        lootTables.put(ECBlockRegistry.TERRACOTTA_LARGE_BRICKS.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.TERRACOTTA_LARGE_BRICKS.get()));
        lootTables.put(ECBlockRegistry.TERRACOTTA_LARGE_BRICKS_SLAB.get(), createSlabTable(ECConstants.MODID, ECBlockRegistry.TERRACOTTA_LARGE_BRICKS_SLAB.get()));
        lootTables.put(ECBlockRegistry.TERRACOTTA_LARGE_BRICKS_STAIRS.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.TERRACOTTA_LARGE_BRICKS_STAIRS.get()));
        lootTables.put(ECBlockRegistry.TERRACOTTA_LARGE_BRICKS_WALL.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.TERRACOTTA_LARGE_BRICKS_WALL.get()));
        lootTables.put(ECBlockRegistry.TERRACOTTA_LARGE_BRICKS_PRESSURE_PLATE.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.TERRACOTTA_LARGE_BRICKS_PRESSURE_PLATE.get()));

        // Other bricks
        lootTables.put(ECBlockRegistry.DARK_BRICKS.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.DARK_BRICKS.get()));
        lootTables.put(ECBlockRegistry.DARK_BRICKS_SLAB.get(), createSlabTable(ECConstants.MODID, ECBlockRegistry.DARK_BRICKS_SLAB.get()));
        lootTables.put(ECBlockRegistry.DARK_BRICKS_STAIRS.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.DARK_BRICKS_STAIRS.get()));
        lootTables.put(ECBlockRegistry.DARK_BRICKS_WALL.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.DARK_BRICKS_WALL.get()));
        lootTables.put(ECBlockRegistry.DARK_BRICKS_PRESSURE_PLATE.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.DARK_BRICKS_PRESSURE_PLATE.get()));

        lootTables.put(ECBlockRegistry.DARK_LARGE_BRICKS.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.DARK_LARGE_BRICKS.get()));
        lootTables.put(ECBlockRegistry.DARK_LARGE_BRICKS_SLAB.get(), createSlabTable(ECConstants.MODID, ECBlockRegistry.DARK_LARGE_BRICKS_SLAB.get()));
        lootTables.put(ECBlockRegistry.DARK_LARGE_BRICKS_STAIRS.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.DARK_LARGE_BRICKS_STAIRS.get()));
        lootTables.put(ECBlockRegistry.DARK_LARGE_BRICKS_WALL.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.DARK_LARGE_BRICKS_WALL.get()));
        lootTables.put(ECBlockRegistry.DARK_LARGE_BRICKS_PRESSURE_PLATE.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.DARK_LARGE_BRICKS_PRESSURE_PLATE.get()));

        lootTables.put(ECBlockRegistry.OLD_BRICKS.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.OLD_BRICKS.get()));
        lootTables.put(ECBlockRegistry.OLD_BRICKS_SLAB.get(), createSlabTable(ECConstants.MODID, ECBlockRegistry.OLD_BRICKS_SLAB.get()));
        lootTables.put(ECBlockRegistry.OLD_BRICKS_STAIRS.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.OLD_BRICKS_STAIRS.get()));
        lootTables.put(ECBlockRegistry.OLD_BRICKS_WALL.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.OLD_BRICKS_WALL.get()));
        lootTables.put(ECBlockRegistry.OLD_BRICKS_PRESSURE_PLATE.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.OLD_BRICKS_PRESSURE_PLATE.get()));

        lootTables.put(ECBlockRegistry.OLD_LARGE_BRICKS.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.OLD_LARGE_BRICKS.get()));
        lootTables.put(ECBlockRegistry.OLD_LARGE_BRICKS_SLAB.get(), createSlabTable(ECConstants.MODID, ECBlockRegistry.OLD_LARGE_BRICKS_SLAB.get()));
        lootTables.put(ECBlockRegistry.OLD_LARGE_BRICKS_STAIRS.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.OLD_LARGE_BRICKS_STAIRS.get()));
        lootTables.put(ECBlockRegistry.OLD_LARGE_BRICKS_WALL.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.OLD_LARGE_BRICKS_WALL.get()));
        lootTables.put(ECBlockRegistry.OLD_LARGE_BRICKS_PRESSURE_PLATE.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.OLD_LARGE_BRICKS_PRESSURE_PLATE.get()));

        lootTables.put(ECBlockRegistry.WEARED_BRICKS.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.WEARED_BRICKS.get()));
        lootTables.put(ECBlockRegistry.WEARED_BRICKS_SLAB.get(), createSlabTable(ECConstants.MODID, ECBlockRegistry.WEARED_BRICKS_SLAB.get()));
        lootTables.put(ECBlockRegistry.WEARED_BRICKS_STAIRS.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.WEARED_BRICKS_STAIRS.get()));
        lootTables.put(ECBlockRegistry.WEARED_BRICKS_WALL.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.WEARED_BRICKS_WALL.get()));
        lootTables.put(ECBlockRegistry.WEARED_BRICKS_PRESSURE_PLATE.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.WEARED_BRICKS_PRESSURE_PLATE.get()));

        lootTables.put(ECBlockRegistry.WEARED_LARGE_BRICKS.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.WEARED_LARGE_BRICKS.get()));
        lootTables.put(ECBlockRegistry.WEARED_LARGE_BRICKS_SLAB.get(), createSlabTable(ECConstants.MODID, ECBlockRegistry.WEARED_LARGE_BRICKS_SLAB.get()));
        lootTables.put(ECBlockRegistry.WEARED_LARGE_BRICKS_STAIRS.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.WEARED_LARGE_BRICKS_STAIRS.get()));
        lootTables.put(ECBlockRegistry.WEARED_LARGE_BRICKS_WALL.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.WEARED_LARGE_BRICKS_WALL.get()));
        lootTables.put(ECBlockRegistry.WEARED_LARGE_BRICKS_PRESSURE_PLATE.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.WEARED_LARGE_BRICKS_PRESSURE_PLATE.get()));

        // Pavings
        lootTables.put(ECBlockRegistry.CONCRETE_PAVING.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.CONCRETE_PAVING.get()));
        lootTables.put(ECBlockRegistry.CONCRETE_PAVING_SLAB.get(), createSlabTable(ECConstants.MODID, ECBlockRegistry.CONCRETE_PAVING_SLAB.get()));
        lootTables.put(ECBlockRegistry.CONCRETE_PAVING_STAIRS.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.CONCRETE_PAVING_STAIRS.get()));
        lootTables.put(ECBlockRegistry.CONCRETE_PAVING_WALL.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.CONCRETE_PAVING_WALL.get()));
        lootTables.put(ECBlockRegistry.CONCRETE_PAVING_PRESSURE_PLATE.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.CONCRETE_PAVING_PRESSURE_PLATE.get()));

        lootTables.put(ECBlockRegistry.DAMAGED_PAVING.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.DAMAGED_PAVING.get()));
        lootTables.put(ECBlockRegistry.DAMAGED_PAVING_SLAB.get(), createSlabTable(ECConstants.MODID, ECBlockRegistry.DAMAGED_PAVING_SLAB.get()));
        lootTables.put(ECBlockRegistry.DAMAGED_PAVING_STAIRS.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.DAMAGED_PAVING_STAIRS.get()));
        lootTables.put(ECBlockRegistry.DAMAGED_PAVING_WALL.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.DAMAGED_PAVING_WALL.get()));
        lootTables.put(ECBlockRegistry.DAMAGED_PAVING_PRESSURE_PLATE.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.DAMAGED_PAVING_PRESSURE_PLATE.get()));

        lootTables.put(ECBlockRegistry.DARK_CONCRETE_PAVING.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.DARK_CONCRETE_PAVING.get()));
        lootTables.put(ECBlockRegistry.DARK_CONCRETE_PAVING_SLAB.get(), createSlabTable(ECConstants.MODID, ECBlockRegistry.DARK_CONCRETE_PAVING_SLAB.get()));
        lootTables.put(ECBlockRegistry.DARK_CONCRETE_PAVING_STAIRS.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.DARK_CONCRETE_PAVING_STAIRS.get()));
        lootTables.put(ECBlockRegistry.DARK_CONCRETE_PAVING_WALL.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.DARK_CONCRETE_PAVING_WALL.get()));
        lootTables.put(ECBlockRegistry.DARK_CONCRETE_PAVING_PRESSURE_PLATE.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.DARK_CONCRETE_PAVING_PRESSURE_PLATE.get()));

        lootTables.put(ECBlockRegistry.MOIST_PAVING.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.MOIST_PAVING.get()));
        lootTables.put(ECBlockRegistry.MOIST_PAVING_SLAB.get(), createSlabTable(ECConstants.MODID, ECBlockRegistry.MOIST_PAVING_SLAB.get()));
        lootTables.put(ECBlockRegistry.MOIST_PAVING_STAIRS.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.MOIST_PAVING_STAIRS.get()));
        lootTables.put(ECBlockRegistry.MOIST_PAVING_WALL.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.MOIST_PAVING_WALL.get()));
        lootTables.put(ECBlockRegistry.MOIST_PAVING_PRESSURE_PLATE.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.MOIST_PAVING_PRESSURE_PLATE.get()));

        lootTables.put(ECBlockRegistry.POLISHED_PAVING.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.POLISHED_PAVING.get()));
        lootTables.put(ECBlockRegistry.POLISHED_PAVING_SLAB.get(), createSlabTable(ECConstants.MODID, ECBlockRegistry.POLISHED_PAVING_SLAB.get()));
        lootTables.put(ECBlockRegistry.POLISHED_PAVING_STAIRS.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.POLISHED_PAVING_STAIRS.get()));
        lootTables.put(ECBlockRegistry.POLISHED_PAVING_WALL.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.POLISHED_PAVING_WALL.get()));
        lootTables.put(ECBlockRegistry.POLISHED_PAVING_PRESSURE_PLATE.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.POLISHED_PAVING_PRESSURE_PLATE.get()));

        lootTables.put(ECBlockRegistry.WHITE_CONCRETE_PAVING.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.WHITE_CONCRETE_PAVING.get()));
        lootTables.put(ECBlockRegistry.WHITE_CONCRETE_PAVING_SLAB.get(), createSlabTable(ECConstants.MODID, ECBlockRegistry.WHITE_CONCRETE_PAVING_SLAB.get()));
        lootTables.put(ECBlockRegistry.WHITE_CONCRETE_PAVING_STAIRS.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.WHITE_CONCRETE_PAVING_STAIRS.get()));
        lootTables.put(ECBlockRegistry.WHITE_CONCRETE_PAVING_WALL.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.WHITE_CONCRETE_PAVING_WALL.get()));
        lootTables.put(ECBlockRegistry.WHITE_CONCRETE_PAVING_PRESSURE_PLATE.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.WHITE_CONCRETE_PAVING_PRESSURE_PLATE.get()));

        // Tiles
        lootTables.put(ECBlockRegistry.CONCRETE_TILES.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.CONCRETE_TILES.get()));
        lootTables.put(ECBlockRegistry.CONCRETE_TILES_SLAB.get(), createSlabTable(ECConstants.MODID, ECBlockRegistry.CONCRETE_TILES_SLAB.get()));
        lootTables.put(ECBlockRegistry.CONCRETE_TILES_STAIRS.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.CONCRETE_TILES_STAIRS.get()));
        lootTables.put(ECBlockRegistry.CONCRETE_TILES_WALL.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.CONCRETE_TILES_WALL.get()));
        lootTables.put(ECBlockRegistry.CONCRETE_TILES_PRESSURE_PLATE.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.CONCRETE_TILES_PRESSURE_PLATE.get()));

        lootTables.put(ECBlockRegistry.SKYBLUE_TILES.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.SKYBLUE_TILES.get()));
        lootTables.put(ECBlockRegistry.SKYBLUE_TILES_SLAB.get(), createSlabTable(ECConstants.MODID, ECBlockRegistry.SKYBLUE_TILES_SLAB.get()));
        lootTables.put(ECBlockRegistry.SKYBLUE_TILES_STAIRS.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.SKYBLUE_TILES_STAIRS.get()));
        lootTables.put(ECBlockRegistry.SKYBLUE_TILES_WALL.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.SKYBLUE_TILES_WALL.get()));
        lootTables.put(ECBlockRegistry.SKYBLUE_TILES_PRESSURE_PLATE.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.SKYBLUE_TILES_PRESSURE_PLATE.get()));

        lootTables.put(ECBlockRegistry.ORANGE_TILES.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.ORANGE_TILES.get()));
        lootTables.put(ECBlockRegistry.ORANGE_TILES_SLAB.get(), createSlabTable(ECConstants.MODID, ECBlockRegistry.ORANGE_TILES_SLAB.get()));
        lootTables.put(ECBlockRegistry.ORANGE_TILES_STAIRS.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.ORANGE_TILES_STAIRS.get()));
        lootTables.put(ECBlockRegistry.ORANGE_TILES_WALL.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.ORANGE_TILES_WALL.get()));
        lootTables.put(ECBlockRegistry.ORANGE_TILES_PRESSURE_PLATE.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.ORANGE_TILES_PRESSURE_PLATE.get()));

        lootTables.put(ECBlockRegistry.BLUE_TILES.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.BLUE_TILES.get()));
        lootTables.put(ECBlockRegistry.BLUE_TILES_SLAB.get(), createSlabTable(ECConstants.MODID, ECBlockRegistry.BLUE_TILES_SLAB.get()));
        lootTables.put(ECBlockRegistry.BLUE_TILES_STAIRS.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.BLUE_TILES_STAIRS.get()));
        lootTables.put(ECBlockRegistry.BLUE_TILES_WALL.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.BLUE_TILES_WALL.get()));
        lootTables.put(ECBlockRegistry.BLUE_TILES_PRESSURE_PLATE.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.BLUE_TILES_PRESSURE_PLATE.get()));

        lootTables.put(ECBlockRegistry.LIGHT_BLUE_TILES.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.LIGHT_BLUE_TILES.get()));
        lootTables.put(ECBlockRegistry.LIGHT_BLUE_TILES_SLAB.get(), createSlabTable(ECConstants.MODID, ECBlockRegistry.LIGHT_BLUE_TILES_SLAB.get()));
        lootTables.put(ECBlockRegistry.LIGHT_BLUE_TILES_STAIRS.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.LIGHT_BLUE_TILES_STAIRS.get()));
        lootTables.put(ECBlockRegistry.LIGHT_BLUE_TILES_WALL.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.LIGHT_BLUE_TILES_WALL.get()));
        lootTables.put(ECBlockRegistry.LIGHT_BLUE_TILES_PRESSURE_PLATE.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.LIGHT_BLUE_TILES_PRESSURE_PLATE.get()));

        lootTables.put(ECBlockRegistry.RED_TILES.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.RED_TILES.get()));
        lootTables.put(ECBlockRegistry.RED_TILES_SLAB.get(), createSlabTable(ECConstants.MODID, ECBlockRegistry.RED_TILES_SLAB.get()));
        lootTables.put(ECBlockRegistry.RED_TILES_STAIRS.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.RED_TILES_STAIRS.get()));
        lootTables.put(ECBlockRegistry.RED_TILES_WALL.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.RED_TILES_WALL.get()));
        lootTables.put(ECBlockRegistry.RED_TILES_PRESSURE_PLATE.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.RED_TILES_PRESSURE_PLATE.get()));

        lootTables.put(ECBlockRegistry.WHITE_TILES.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.WHITE_TILES.get()));
        lootTables.put(ECBlockRegistry.WHITE_TILES_SLAB.get(), createSlabTable(ECConstants.MODID, ECBlockRegistry.WHITE_TILES_SLAB.get()));
        lootTables.put(ECBlockRegistry.WHITE_TILES_STAIRS.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.WHITE_TILES_STAIRS.get()));
        lootTables.put(ECBlockRegistry.WHITE_TILES_WALL.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.WHITE_TILES_WALL.get()));
        lootTables.put(ECBlockRegistry.WHITE_TILES_PRESSURE_PLATE.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.WHITE_TILES_PRESSURE_PLATE.get()));

        lootTables.put(ECBlockRegistry.YELLOW_TILES.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.YELLOW_TILES.get()));
        lootTables.put(ECBlockRegistry.YELLOW_TILES_SLAB.get(), createSlabTable(ECConstants.MODID, ECBlockRegistry.YELLOW_TILES_SLAB.get()));
        lootTables.put(ECBlockRegistry.YELLOW_TILES_STAIRS.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.YELLOW_TILES_STAIRS.get()));
        lootTables.put(ECBlockRegistry.YELLOW_TILES_WALL.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.YELLOW_TILES_WALL.get()));
        lootTables.put(ECBlockRegistry.YELLOW_TILES_PRESSURE_PLATE.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.YELLOW_TILES_PRESSURE_PLATE.get()));

        lootTables.put(ECBlockRegistry.YELLOW_GREY_TILES.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.YELLOW_GREY_TILES.get()));
        lootTables.put(ECBlockRegistry.YELLOW_GREY_TILES_SLAB.get(), createSlabTable(ECConstants.MODID, ECBlockRegistry.YELLOW_GREY_TILES_SLAB.get()));
        lootTables.put(ECBlockRegistry.YELLOW_GREY_TILES_STAIRS.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.YELLOW_GREY_TILES_STAIRS.get()));
        lootTables.put(ECBlockRegistry.YELLOW_GREY_TILES_WALL.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.YELLOW_GREY_TILES_WALL.get()));
        lootTables.put(ECBlockRegistry.YELLOW_GREY_TILES_PRESSURE_PLATE.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.YELLOW_GREY_TILES_PRESSURE_PLATE.get()));

        // Corrugated metal plates
        for(int j = 0; j < Arrays.stream(DyeColor.values()).count(); j++)
        {
            lootTables.put(ECBlockRegistry.CORRUGATED_METAL_PLATE_BLOCKS.get(DyeColor.byId(j)).get(),
                createStandardTable(ECConstants.MODID, ECBlockRegistry.CORRUGATED_METAL_PLATE_BLOCKS.get(DyeColor.byId(j)).get()));
            lootTables.put(ECBlockRegistry.CORRUGATED_METAL_PLATE_STAIRS.get(DyeColor.byId(j)).get(),
                createStandardTable(ECConstants.MODID, ECBlockRegistry.CORRUGATED_METAL_PLATE_STAIRS.get(DyeColor.byId(j)).get()));
            lootTables.put(ECBlockRegistry.CORRUGATED_METAL_PLATE_SLABS.get(DyeColor.byId(j)).get(),
                createSlabTable(ECConstants.MODID, ECBlockRegistry.CORRUGATED_METAL_PLATE_SLABS.get(DyeColor.byId(j)).get()));
            lootTables.put(ECBlockRegistry.CORRUGATED_METAL_PLATE_WALLS.get(DyeColor.byId(j)).get(),
                createStandardTable(ECConstants.MODID, ECBlockRegistry.CORRUGATED_METAL_PLATE_WALLS.get(DyeColor.byId(j)).get()));
            lootTables.put(ECBlockRegistry.CORRUGATED_METAL_PLATE_PRESSURE_PLATES.get(DyeColor.byId(j)).get(),
                createStandardTable(ECConstants.MODID, ECBlockRegistry.CORRUGATED_METAL_PLATE_PRESSURE_PLATES.get(DyeColor.byId(j)).get()));
            lootTables.put(ECBlockRegistry.CORRUGATED_METAL_PLATE_FENCES.get(DyeColor.byId(j)).get(),
                createStandardTable(ECConstants.MODID, ECBlockRegistry.CORRUGATED_METAL_PLATE_FENCES.get(DyeColor.byId(j)).get()));
            lootTables.put(ECBlockRegistry.CORRUGATED_METAL_PLATE_FENCE_GATES.get(DyeColor.byId(j)).get(),
                createStandardTable(ECConstants.MODID, ECBlockRegistry.CORRUGATED_METAL_PLATE_FENCE_GATES.get(DyeColor.byId(j)).get()));
        }

        // Metal blocks
        lootTables.put(ECBlockRegistry.DARK_METAL_FLOOR.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.DARK_METAL_FLOOR.get()));
        lootTables.put(ECBlockRegistry.DARK_METAL_FLOOR_SLAB.get(), createSlabTable(ECConstants.MODID, ECBlockRegistry.DARK_METAL_FLOOR_SLAB.get()));
        lootTables.put(ECBlockRegistry.DARK_METAL_FLOOR_STAIRS.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.DARK_METAL_FLOOR_STAIRS.get()));
        lootTables.put(ECBlockRegistry.DARK_METAL_FLOOR_WALL.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.DARK_METAL_FLOOR_WALL.get()));
        lootTables.put(ECBlockRegistry.DARK_METAL_FLOOR_PRESSURE_PLATE.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.DARK_METAL_FLOOR_PRESSURE_PLATE.get()));

        lootTables.put(ECBlockRegistry.LIGHT_METAL_FLOOR.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.LIGHT_METAL_FLOOR.get()));
        lootTables.put(ECBlockRegistry.LIGHT_METAL_FLOOR_SLAB.get(), createSlabTable(ECConstants.MODID, ECBlockRegistry.LIGHT_METAL_FLOOR_SLAB.get()));
        lootTables.put(ECBlockRegistry.LIGHT_METAL_FLOOR_STAIRS.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.LIGHT_METAL_FLOOR_STAIRS.get()));
        lootTables.put(ECBlockRegistry.LIGHT_METAL_FLOOR_WALL.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.LIGHT_METAL_FLOOR_WALL.get()));
        lootTables.put(ECBlockRegistry.LIGHT_METAL_FLOOR_PRESSURE_PLATE.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.LIGHT_METAL_FLOOR_PRESSURE_PLATE.get()));

        lootTables.put(ECBlockRegistry.RUSTY_PLATE.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.RUSTY_PLATE.get()));
        lootTables.put(ECBlockRegistry.RUSTY_PLATE_SLAB.get(), createSlabTable(ECConstants.MODID, ECBlockRegistry.RUSTY_PLATE_SLAB.get()));
        lootTables.put(ECBlockRegistry.RUSTY_PLATE_STAIRS.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.RUSTY_PLATE_STAIRS.get()));
        lootTables.put(ECBlockRegistry.RUSTY_PLATE_WALL.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.RUSTY_PLATE_WALL.get()));
        lootTables.put(ECBlockRegistry.RUSTY_PLATE_PRESSURE_PLATE.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.RUSTY_PLATE_PRESSURE_PLATE.get()));

        lootTables.put(ECBlockRegistry.IRON_BEAM.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.IRON_BEAM.get()));
        lootTables.put(ECBlockRegistry.BOLTED_IRON_BEAM.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.BOLTED_IRON_BEAM.get()));
        lootTables.put(ECBlockRegistry.IRON_BEAM_JUNCTION.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.IRON_BEAM_JUNCTION.get()));
        lootTables.put(ECBlockRegistry.STEEL_BEAM.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.STEEL_BEAM.get()));
        lootTables.put(ECBlockRegistry.BOLTED_STEEL_BEAM.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.BOLTED_STEEL_BEAM.get()));
        lootTables.put(ECBlockRegistry.STEEL_BEAM_JUNCTION.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.STEEL_BEAM_JUNCTION.get()));

        lootTables.put(ECBlockRegistry.AIR_DUCT.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.AIR_DUCT.get()));
        lootTables.put(ECBlockRegistry.VENT_AIR_DUCT.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.VENT_AIR_DUCT.get()));
        lootTables.put(ECBlockRegistry.GRID_AIR_DUCT.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.GRID_AIR_DUCT.get()));

        lootTables.put(ECBlockRegistry.BULKHEAD.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.BULKHEAD.get()));
        lootTables.put(ECBlockRegistry.BULKHEAD_TOP.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.BULKHEAD_TOP.get()));

        lootTables.put(ECBlockRegistry.STEEL_WALL_LADDER.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.STEEL_WALL_LADDER.get()));
        lootTables.put(ECBlockRegistry.RUSTY_WALL_LADDER.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.RUSTY_WALL_LADDER.get()));
        lootTables.put(ECBlockRegistry.STEEL_RUNGS.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.STEEL_RUNGS.get()));
        lootTables.put(ECBlockRegistry.RUSTY_RUNGS.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.RUSTY_RUNGS.get()));

        // Wallpapers
        lootTables.put(ECBlockRegistry.WHITE_BLUE_WALLPAPER.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.WHITE_BLUE_WALLPAPER.get()));
        lootTables.put(ECBlockRegistry.WHITE_BLUE_WALLPAPER_SLAB.get(), createSlabTable(ECConstants.MODID, ECBlockRegistry.WHITE_BLUE_WALLPAPER_SLAB.get()));
        lootTables.put(ECBlockRegistry.WHITE_BLUE_WALLPAPER_STAIRS.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.WHITE_BLUE_WALLPAPER_STAIRS.get()));
        lootTables.put(ECBlockRegistry.WHITE_BLUE_WALLPAPER_PLINTH.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.WHITE_BLUE_WALLPAPER_PLINTH.get()));

        lootTables.put(ECBlockRegistry.BEIGE_FLOWER_WALLPAPER.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.BEIGE_FLOWER_WALLPAPER.get()));
        lootTables.put(ECBlockRegistry.BEIGE_FLOWER_WALLPAPER_SLAB.get(), createSlabTable(ECConstants.MODID, ECBlockRegistry.BEIGE_FLOWER_WALLPAPER_SLAB.get()));
        lootTables.put(ECBlockRegistry.BEIGE_FLOWER_WALLPAPER_STAIRS.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.BEIGE_FLOWER_WALLPAPER_STAIRS.get()));
        lootTables.put(ECBlockRegistry.BEIGE_FLOWER_WALLPAPER_PLINTH.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.BEIGE_FLOWER_WALLPAPER_PLINTH.get()));

        lootTables.put(ECBlockRegistry.BEIGE_WALLPAPER.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.BEIGE_WALLPAPER.get()));
        lootTables.put(ECBlockRegistry.BEIGE_WALLPAPER_SLAB.get(), createSlabTable(ECConstants.MODID, ECBlockRegistry.BEIGE_WALLPAPER_SLAB.get()));
        lootTables.put(ECBlockRegistry.BEIGE_WALLPAPER_STAIRS.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.BEIGE_WALLPAPER_STAIRS.get()));
        lootTables.put(ECBlockRegistry.BEIGE_WALLPAPER_PLINTH.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.BEIGE_WALLPAPER_PLINTH.get()));

        lootTables.put(ECBlockRegistry.PINK_WALLPAPER.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.PINK_WALLPAPER.get()));
        lootTables.put(ECBlockRegistry.PINK_WALLPAPER_SLAB.get(), createSlabTable(ECConstants.MODID, ECBlockRegistry.PINK_WALLPAPER_SLAB.get()));
        lootTables.put(ECBlockRegistry.PINK_WALLPAPER_STAIRS.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.PINK_WALLPAPER_STAIRS.get()));
        lootTables.put(ECBlockRegistry.PINK_WALLPAPER_PLINTH.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.PINK_WALLPAPER_PLINTH.get()));

        lootTables.put(ECBlockRegistry.WHITE_GREEN_WALLPAPER.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.WHITE_GREEN_WALLPAPER.get()));
        lootTables.put(ECBlockRegistry.WHITE_GREEN_WALLPAPER_SLAB.get(), createSlabTable(ECConstants.MODID, ECBlockRegistry.WHITE_GREEN_WALLPAPER_SLAB.get()));
        lootTables.put(ECBlockRegistry.WHITE_GREEN_WALLPAPER_STAIRS.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.WHITE_GREEN_WALLPAPER_STAIRS.get()));
        lootTables.put(ECBlockRegistry.WHITE_GREEN_WALLPAPER_PLINTH.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.WHITE_GREEN_WALLPAPER_PLINTH.get()));

        // Furniture
        for(int j = 0; j < Arrays.stream(McWoods.values()).count(); j++)
        {
            lootTables.put(ECBlockRegistry.CHAIR_BLOCKS.get(McWoods.byId(j)).get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.CHAIR_BLOCKS.get(McWoods.byId(j)).get()));
            lootTables.put(ECBlockRegistry.TERRACE_CHAIR_BLOCKS.get(McWoods.byId(j)).get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.TERRACE_CHAIR_BLOCKS.get(McWoods.byId(j)).get()));
            lootTables.put(ECBlockRegistry.TABLE_BLOCKS.get(McWoods.byId(j)).get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.TABLE_BLOCKS.get(McWoods.byId(j)).get()));
            lootTables.put(ECBlockRegistry.FANCY_TABLE_BLOCKS.get(McWoods.byId(j)).get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.FANCY_TABLE_BLOCKS.get(McWoods.byId(j)).get()));
            lootTables.put(ECBlockRegistry.FANCY_DOOR_BLOCKS.get(McWoods.byId(j)).get(), createDoorTable(ECConstants.MODID, ECBlockRegistry.FANCY_DOOR_BLOCKS.get(McWoods.byId(j)).get()));
            lootTables.put(ECBlockRegistry.TERRACE_TABLE_BLOCKS.get(McWoods.byId(j)).get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.TERRACE_TABLE_BLOCKS.get(McWoods.byId(j)).get()));
            lootTables.put(ECBlockRegistry.SUSPENDED_STAIRS_BLOCKS.get(McWoods.byId(j)).get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.SUSPENDED_STAIRS_BLOCKS.get(McWoods.byId(j)).get()));
            lootTables.put(ECBlockRegistry.WOODEN_CRATE_BLOCKS.get(McWoods.byId(j)).get(),
                createCrateTable(McWoods.byId(j).getName() + "_wooden_crate", ECBlockRegistry.SUSPENDED_STAIRS_BLOCKS.get(McWoods.byId(j)).get()));
            lootTables.put(ECBlockRegistry.FANCY_CHEST_BLOCKS.get(McWoods.byId(j)).get(),
                createChestTable(McWoods.byId(j).getName() + "_wooden_chest", ECBlockRegistry.FANCY_CHEST_BLOCKS.get(McWoods.byId(j)).get()));
        }
        lootTables.put(ECBlockRegistry.LOCKER.get(), createChestTable("locker", ECBlockRegistry.LOCKER.get()));

        lootTables.put(ECBlockRegistry.STEEL_SUSPENDED_STAIRS.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.STEEL_SUSPENDED_STAIRS.get()));
        lootTables.put(ECBlockRegistry.RUSTY_SUSPENDED_STAIRS.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.RUSTY_SUSPENDED_STAIRS.get()));

        lootTables.put(ECBlockRegistry.STEEL_TERRACE_CHAIR.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.STEEL_TERRACE_CHAIR.get()));
        lootTables.put(ECBlockRegistry.STEEL_TERRACE_TABLE.get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.STEEL_TERRACE_TABLE.get()));

        for(int j = 0; j < Arrays.stream(DyeColor.values()).count(); j++)
        {
            lootTables.put(ECBlockRegistry.COUCH_BLOCKS.get(DyeColor.byId(j)).get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.COUCH_BLOCKS.get(DyeColor.byId(j)).get()));
            lootTables.put(ECBlockRegistry.TABLE_LAMP_BLOCKS.get(DyeColor.byId(j)).get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.TABLE_LAMP_BLOCKS.get(DyeColor.byId(j)).get()));
            lootTables.put(ECBlockRegistry.PILLOW_BLOCKS.get(DyeColor.byId(j)).get(), createStandardTable(ECConstants.MODID, ECBlockRegistry.PILLOW_BLOCKS.get(DyeColor.byId(j)).get()));

            lootTables.put(ECBlockRegistry.ACACIA_FANCY_BED_BLOCKS.get(DyeColor.byId(j)).get(), createBedTable(ECConstants.MODID, ECBlockRegistry.ACACIA_FANCY_BED_BLOCKS.get(DyeColor.byId(j)).get()));
            lootTables.put(ECBlockRegistry.BIRCH_FANCY_BED_BLOCKS.get(DyeColor.byId(j)).get(), createBedTable(ECConstants.MODID, ECBlockRegistry.BIRCH_FANCY_BED_BLOCKS.get(DyeColor.byId(j)).get()));
            lootTables.put(ECBlockRegistry.DARK_OAK_FANCY_BED_BLOCKS.get(DyeColor.byId(j)).get(), createBedTable(ECConstants.MODID, ECBlockRegistry.DARK_OAK_FANCY_BED_BLOCKS.get(DyeColor.byId(j)).get()));
            lootTables.put(ECBlockRegistry.JUNGLE_FANCY_BED_BLOCKS.get(DyeColor.byId(j)).get(), createBedTable(ECConstants.MODID, ECBlockRegistry.JUNGLE_FANCY_BED_BLOCKS.get(DyeColor.byId(j)).get()));
            lootTables.put(ECBlockRegistry.OAK_FANCY_BED_BLOCKS.get(DyeColor.byId(j)).get(), createBedTable(ECConstants.MODID, ECBlockRegistry.OAK_FANCY_BED_BLOCKS.get(DyeColor.byId(j)).get()));
            lootTables.put(ECBlockRegistry.SPRUCE_FANCY_BED_BLOCKS.get(DyeColor.byId(j)).get(), createBedTable(ECConstants.MODID, ECBlockRegistry.SPRUCE_FANCY_BED_BLOCKS.get(DyeColor.byId(j)).get()));
        }

        lootTables.put(ECBlockRegistry.PLATE.get(), createPlateTable(ECConstants.MODID, ECBlockRegistry.PLATE.get()));

        lootTables.put(ECBlockRegistry.STEEL_DOOR.get(), createDoorTable(ECConstants.MODID, ECBlockRegistry.STEEL_DOOR.get()));
        lootTables.put(ECBlockRegistry.STURDY_STEEL_DOOR.get(), createDoorTable(ECConstants.MODID, ECBlockRegistry.STURDY_STEEL_DOOR.get()));
        lootTables.put(ECBlockRegistry.WARNING_STEEL_DOOR.get(), createDoorTable(ECConstants.MODID, ECBlockRegistry.WARNING_STEEL_DOOR.get()));
        lootTables.put(ECBlockRegistry.WHITE_STEEL_DOOR.get(), createDoorTable(ECConstants.MODID, ECBlockRegistry.WHITE_STEEL_DOOR.get()));
        lootTables.put(ECBlockRegistry.STURDY_WHITE_STEEL_DOOR.get(), createDoorTable(ECConstants.MODID, ECBlockRegistry.STURDY_WHITE_STEEL_DOOR.get()));
        lootTables.put(ECBlockRegistry.WARNING_WHITE_STEEL_DOOR.get(), createDoorTable(ECConstants.MODID, ECBlockRegistry.WARNING_WHITE_STEEL_DOOR.get()));
        lootTables.put(ECBlockRegistry.RUSTY_DOOR.get(), createDoorTable(ECConstants.MODID, ECBlockRegistry.RUSTY_DOOR.get()));
        lootTables.put(ECBlockRegistry.STURDY_RUSTY_DOOR.get(), createDoorTable(ECConstants.MODID, ECBlockRegistry.STURDY_RUSTY_DOOR.get()));
        lootTables.put(ECBlockRegistry.WARNING_RUSTY_DOOR.get(), createDoorTable(ECConstants.MODID, ECBlockRegistry.WARNING_RUSTY_DOOR.get()));
    }

    protected LootTable.Builder createPlateTable(String modid, Block block)
    {
        String name = block.getRegistryName().toString().replace(modid + ":", "");
        LootPool.Builder builder = LootPool.builder().name(name).rolls(ConstantRange.of(1)).addEntry(withExplosionDecay(block,
            ItemLootEntry.builder(block).acceptFunction(SetCount.builder(ConstantRange.of(2)).acceptCondition(
                BlockStateProperty.builder(block).fromProperties(StatePropertiesPredicate.Builder.newBuilder().withIntProp(PlateBlock.PLATES, 2)))).acceptFunction(
                    SetCount.builder(ConstantRange.of(3)).acceptCondition(
                        BlockStateProperty.builder(block).fromProperties(StatePropertiesPredicate.Builder.newBuilder().withIntProp(PlateBlock.PLATES, 3)))).acceptFunction(
                            SetCount.builder(ConstantRange.of(4)).acceptCondition(
                                BlockStateProperty.builder(block).fromProperties(StatePropertiesPredicate.Builder.newBuilder().withIntProp(PlateBlock.PLATES, 4)))).acceptFunction(
                                    SetCount.builder(ConstantRange.of(5)).acceptCondition(
                                        BlockStateProperty.builder(block).fromProperties(StatePropertiesPredicate.Builder.newBuilder().withIntProp(PlateBlock.PLATES, 5)))).acceptFunction(
                                            SetCount.builder(ConstantRange.of(6)).acceptCondition(
                                                BlockStateProperty.builder(block).fromProperties(StatePropertiesPredicate.Builder.newBuilder().withIntProp(PlateBlock.PLATES, 6)))).acceptFunction(
                                                    SetCount.builder(ConstantRange.of(7)).acceptCondition(
                                                        BlockStateProperty.builder(block).fromProperties(StatePropertiesPredicate.Builder.newBuilder().withIntProp(PlateBlock.PLATES, 7)))).acceptFunction(
                                                            SetCount.builder(ConstantRange.of(8)).acceptCondition(
                                                                BlockStateProperty.builder(block).fromProperties(StatePropertiesPredicate.Builder.newBuilder().withIntProp(PlateBlock.PLATES, 8))))));
        return LootTable.builder().addLootPool(builder);
    }

    protected LootTable.Builder createCrateTable(String name, Block block)
    {
        LootPool.Builder builder = LootPool.builder().name(name).rolls(ConstantRange.of(1)).addEntry(ItemLootEntry.builder(block).acceptFunction(CopyName.builder(CopyName.Source.BLOCK_ENTITY)).acceptFunction(
            CopyNbt.builder(CopyNbt.Source.BLOCK_ENTITY).replaceOperation("Lock", "BlockEntityTag.Lock").replaceOperation("LootTable", "BlockEntityTag.LootTable").replaceOperation("LootTableSeed",
                "BlockEntityTag.LootTableSeed")).acceptFunction(SetContents.func_215920_b().func_216075_a(DynamicLootEntry.func_216162_a(CrateBlock.CONTENTS))));
        return LootTable.builder().addLootPool(builder);
    }
}