package tv.mapper.embellishcraft.init;

import net.minecraft.block.Block;
import net.minecraft.block.PressurePlateBlock;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.WallBlock;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.ObjectHolder;
import tv.mapper.embellishcraft.block.ChairBlock;
import tv.mapper.embellishcraft.block.CustomPressurePlateBlock;
import tv.mapper.embellishcraft.block.CustomStairsBlock;
import tv.mapper.embellishcraft.block.UpDownBlock;
import tv.mapper.embellishcraft.item.ChairItemBlock;
import tv.mapper.embellishcraft.item.ModItemGroups;

@EventBusSubscriber(bus = Bus.MOD)
public class ModBlocks
{
    // World (blocks that generate in the world)

    @ObjectHolder("embellishcraft:basalt")
    public static Block BASALT;
    @ObjectHolder("embellishcraft:basalt_stairs")
    public static Block BASALT_STAIRS;
    @ObjectHolder("embellishcraft:basalt_slab")
    public static Block BASALT_SLAB;
    @ObjectHolder("embellishcraft:basalt_wall")
    public static Block BASALT_WALL;
    @ObjectHolder("embellishcraft:basalt_pressure_plate")
    public static Block BASALT_PRESSURE_PLATE;

    @ObjectHolder("embellishcraft:slate")
    public static Block SLATE;
    @ObjectHolder("embellishcraft:slate_stairs")
    public static Block SLATE_STAIRS;
    @ObjectHolder("embellishcraft:slate_slab")
    public static Block SLATE_SLAB;
    @ObjectHolder("embellishcraft:slate_wall")
    public static Block SLATE_WALL;
    @ObjectHolder("embellishcraft:slate_pressure_plate")
    public static Block SLATE_PRESSURE_PLATE;

    @ObjectHolder("embellishcraft:marble")
    public static Block MARBLE;
    @ObjectHolder("embellishcraft:marble_stairs")
    public static Block MARBLE_STAIRS;
    @ObjectHolder("embellishcraft:marble_slab")
    public static Block MARBLE_SLAB;
    @ObjectHolder("embellishcraft:marble_wall")
    public static Block MARBLE_WALL;
    @ObjectHolder("embellishcraft:marble_pressure_plate")
    public static Block MARBLE_PRESSURE_PLATE;

    @ObjectHolder("embellishcraft:gneiss")
    public static Block GNEISS;
    @ObjectHolder("embellishcraft:gneiss_stairs")
    public static Block GNEISS_STAIRS;
    @ObjectHolder("embellishcraft:gneiss_slab")
    public static Block GNEISS_SLAB;
    @ObjectHolder("embellishcraft:gneiss_wall")
    public static Block GNEISS_WALL;
    @ObjectHolder("embellishcraft:gneiss_pressure_plate")
    public static Block GNEISS_PRESSURE_PLATE;

    // Cobblestones

    @ObjectHolder("embellishcraft:basalt_cobblestone")
    public static Block BASALT_COBBLESTONE;
    @ObjectHolder("embellishcraft:basalt_cobblestone_stairs")
    public static Block BASALT_COBBLESTONE_STAIRS;
    @ObjectHolder("embellishcraft:basalt_cobblestone_slab")
    public static Block BASALT_COBBLESTONE_SLAB;
    @ObjectHolder("embellishcraft:basalt_cobblestone_wall")
    public static Block BASALT_COBBLESTONE_WALL;
    @ObjectHolder("embellishcraft:basalt_cobblestone_pressure_plate")
    public static Block BASALT_COBBLESTONE_PRESSURE_PLATE;

    @ObjectHolder("embellishcraft:slate_cobblestone")
    public static Block SLATE_COBBLESTONE;
    @ObjectHolder("embellishcraft:slate_cobblestone_stairs")
    public static Block SLATE_COBBLESTONE_STAIRS;
    @ObjectHolder("embellishcraft:slate_cobblestone_slab")
    public static Block SLATE_COBBLESTONE_SLAB;
    @ObjectHolder("embellishcraft:slate_cobblestone_wall")
    public static Block SLATE_COBBLESTONE_WALL;
    @ObjectHolder("embellishcraft:slate_cobblestone_pressure_plate")
    public static Block SLATE_COBBLESTONE_PRESSURE_PLATE;

    @ObjectHolder("embellishcraft:marble_cobblestone")
    public static Block MARBLE_COBBLESTONE;
    @ObjectHolder("embellishcraft:marble_cobblestone_stairs")
    public static Block MARBLE_COBBLESTONE_STAIRS;
    @ObjectHolder("embellishcraft:marble_cobblestone_slab")
    public static Block MARBLE_COBBLESTONE_SLAB;
    @ObjectHolder("embellishcraft:marble_cobblestone_wall")
    public static Block MARBLE_COBBLESTONE_WALL;
    @ObjectHolder("embellishcraft:marble_cobblestone_pressure_plate")
    public static Block MARBLE_COBBLESTONE_PRESSURE_PLATE;

    @ObjectHolder("embellishcraft:gneiss_cobblestone")
    public static Block GNEISS_COBBLESTONE;
    @ObjectHolder("embellishcraft:gneiss_cobblestone_stairs")
    public static Block GNEISS_COBBLESTONE_STAIRS;
    @ObjectHolder("embellishcraft:gneiss_cobblestone_slab")
    public static Block GNEISS_COBBLESTONE_SLAB;
    @ObjectHolder("embellishcraft:gneiss_cobblestone_wall")
    public static Block GNEISS_COBBLESTONE_WALL;
    @ObjectHolder("embellishcraft:gneiss_cobblestone_pressure_plate")
    public static Block GNEISS_COBBLESTONE_PRESSURE_PLATE;

    // Bricks

    @ObjectHolder("embellishcraft:basalt_bricks")
    public static Block BASALT_BRICKS;
    @ObjectHolder("embellishcraft:basalt_bricks_stairs")
    public static Block BASALT_BRICKS_STAIRS;
    @ObjectHolder("embellishcraft:basalt_bricks_slab")
    public static Block BASALT_BRICKS_SLAB;
    @ObjectHolder("embellishcraft:basalt_bricks_wall")
    public static Block BASALT_BRICKS_WALL;
    @ObjectHolder("embellishcraft:basalt_bricks_pressure_plate")
    public static Block BASALT_BRICKS_PRESSURE_PLATE;

    @ObjectHolder("embellishcraft:dark_bricks")
    public static Block DARK_BRICKS;
    @ObjectHolder("embellishcraft:dark_bricks_stairs")
    public static Block DARK_BRICKS_STAIRS;
    @ObjectHolder("embellishcraft:dark_bricks_slab")
    public static Block DARK_BRICKS_SLAB;
    @ObjectHolder("embellishcraft:dark_bricks_wall")
    public static Block DARK_BRICKS_WALL;
    @ObjectHolder("embellishcraft:dark_bricks_pressure_plate")
    public static Block DARK_BRICKS_PRESSURE_PLATE;

    @ObjectHolder("embellishcraft:diorite_bricks")
    public static Block DIORITE_BRICKS;
    @ObjectHolder("embellishcraft:diorite_bricks_stairs")
    public static Block DIORITE_BRICKS_STAIRS;
    @ObjectHolder("embellishcraft:diorite_bricks_slab")
    public static Block DIORITE_BRICKS_SLAB;
    @ObjectHolder("embellishcraft:diorite_bricks_wall")
    public static Block DIORITE_BRICKS_WALL;
    @ObjectHolder("embellishcraft:diorite_bricks_pressure_plate")
    public static Block DIORITE_BRICKS_PRESSURE_PLATE;

    @ObjectHolder("embellishcraft:old_bricks")
    public static Block OLD_BRICKS;
    @ObjectHolder("embellishcraft:old_bricks_stairs")
    public static Block OLD_BRICKS_STAIRS;
    @ObjectHolder("embellishcraft:old_bricks_slab")
    public static Block OLD_BRICKS_SLAB;
    @ObjectHolder("embellishcraft:old_bricks_wall")
    public static Block OLD_BRICKS_WALL;
    @ObjectHolder("embellishcraft:old_bricks_pressure_plate")
    public static Block OLD_BRICKS_PRESSURE_PLATE;

    @ObjectHolder("embellishcraft:sandstone_bricks")
    public static Block SANDSTONE_BRICKS;
    @ObjectHolder("embellishcraft:sandstone_bricks_stairs")
    public static Block SANDSTONE_BRICKS_STAIRS;
    @ObjectHolder("embellishcraft:sandstone_bricks_slab")
    public static Block SANDSTONE_BRICKS_SLAB;
    @ObjectHolder("embellishcraft:sandstone_bricks_wall")
    public static Block SANDSTONE_BRICKS_WALL;
    @ObjectHolder("embellishcraft:sandstone_bricks_pressure_plate")
    public static Block SANDSTONE_BRICKS_PRESSURE_PLATE;

    @ObjectHolder("embellishcraft:slate_bricks")
    public static Block SLATE_BRICKS;
    @ObjectHolder("embellishcraft:slate_bricks_stairs")
    public static Block SLATE_BRICKS_STAIRS;
    @ObjectHolder("embellishcraft:slate_bricks_slab")
    public static Block SLATE_BRICKS_SLAB;
    @ObjectHolder("embellishcraft:slate_bricks_wall")
    public static Block SLATE_BRICKS_WALL;
    @ObjectHolder("embellishcraft:slate_bricks_pressure_plate")
    public static Block SLATE_BRICKS_PRESSURE_PLATE;

    @ObjectHolder("embellishcraft:terracotta_bricks")
    public static Block TERRACOTTA_BRICKS;
    @ObjectHolder("embellishcraft:terracotta_bricks_stairs")
    public static Block TERRACOTTA_BRICKS_STAIRS;
    @ObjectHolder("embellishcraft:terracotta_bricks_slab")
    public static Block TERRACOTTA_BRICKS_SLAB;
    @ObjectHolder("embellishcraft:terracotta_bricks_wall")
    public static Block TERRACOTTA_BRICKS_WALL;
    @ObjectHolder("embellishcraft:terracotta_bricks_pressure_plate")
    public static Block TERRACOTTA_BRICKS_PRESSURE_PLATE;

    @ObjectHolder("embellishcraft:weared_bricks")
    public static Block WEARED_BRICKS;
    @ObjectHolder("embellishcraft:weared_bricks_stairs")
    public static Block WEARED_BRICKS_STAIRS;
    @ObjectHolder("embellishcraft:weared_bricks_slab")
    public static Block WEARED_BRICKS_SLAB;
    @ObjectHolder("embellishcraft:weared_bricks_wall")
    public static Block WEARED_BRICKS_WALL;
    @ObjectHolder("embellishcraft:weared_bricks_pressure_plate")
    public static Block WEARED_BRICKS_PRESSURE_PLATE;

    @ObjectHolder("embellishcraft:marble_bricks")
    public static Block MARBLE_BRICKS;
    @ObjectHolder("embellishcraft:marble_bricks_stairs")
    public static Block MARBLE_BRICKS_STAIRS;
    @ObjectHolder("embellishcraft:marble_bricks_slab")
    public static Block MARBLE_BRICKS_SLAB;
    @ObjectHolder("embellishcraft:marble_bricks_wall")
    public static Block MARBLE_BRICKS_WALL;
    @ObjectHolder("embellishcraft:marble_bricks_pressure_plate")
    public static Block MARBLE_BRICKS_PRESSURE_PLATE;

    @ObjectHolder("embellishcraft:gneiss_bricks")
    public static Block GNEISS_BRICKS;
    @ObjectHolder("embellishcraft:gneiss_bricks_stairs")
    public static Block GNEISS_BRICKS_STAIRS;
    @ObjectHolder("embellishcraft:gneiss_bricks_slab")
    public static Block GNEISS_BRICKS_SLAB;
    @ObjectHolder("embellishcraft:gneiss_bricks_wall")
    public static Block GNEISS_BRICKS_WALL;
    @ObjectHolder("embellishcraft:gneiss_bricks_pressure_plate")
    public static Block GNEISS_BRICKS_PRESSURE_PLATE;

    // Large bricks

    @ObjectHolder("embellishcraft:basalt_large_bricks")
    public static Block BASALT_LARGE_BRICKS;
    @ObjectHolder("embellishcraft:basalt_large_bricks_stairs")
    public static Block BASALT_LARGE_BRICKS_STAIRS;
    @ObjectHolder("embellishcraft:basalt_large_bricks_slab")
    public static Block BASALT_LARGE_BRICKS_SLAB;
    @ObjectHolder("embellishcraft:basalt_large_bricks_wall")
    public static Block BASALT_LARGE_BRICKS_WALL;
    @ObjectHolder("embellishcraft:basalt_large_bricks_pressure_plate")
    public static Block BASALT_LARGE_BRICKS_PRESSURE_PLATE;

    @ObjectHolder("embellishcraft:diorite_large_bricks")
    public static Block DIORITE_LARGE_BRICKS;
    @ObjectHolder("embellishcraft:diorite_large_bricks_stairs")
    public static Block DIORITE_LARGE_BRICKS_STAIRS;
    @ObjectHolder("embellishcraft:diorite_large_bricks_slab")
    public static Block DIORITE_LARGE_BRICKS_SLAB;
    @ObjectHolder("embellishcraft:diorite_large_bricks_wall")
    public static Block DIORITE_LARGE_BRICKS_WALL;
    @ObjectHolder("embellishcraft:diorite_large_bricks_pressure_plate")
    public static Block DIORITE_LARGE_BRICKS_PRESSURE_PLATE;

    @ObjectHolder("embellishcraft:dark_large_bricks")
    public static Block DARK_LARGE_BRICKS;
    @ObjectHolder("embellishcraft:dark_large_bricks_stairs")
    public static Block DARK_LARGE_BRICKS_STAIRS;
    @ObjectHolder("embellishcraft:dark_large_bricks_slab")
    public static Block DARK_LARGE_BRICKS_SLAB;
    @ObjectHolder("embellishcraft:dark_large_bricks_wall")
    public static Block DARK_LARGE_BRICKS_WALL;
    @ObjectHolder("embellishcraft:dark_large_bricks_pressure_plate")
    public static Block DARK_LARGE_BRICKS_PRESSURE_PLATE;

    @ObjectHolder("embellishcraft:marble_large_bricks")
    public static Block MARBLE_LARGE_BRICKS;
    @ObjectHolder("embellishcraft:marble_large_bricks_stairs")
    public static Block MARBLE_LARGE_BRICKS_STAIRS;
    @ObjectHolder("embellishcraft:marble_large_bricks_slab")
    public static Block MARBLE_LARGE_BRICKS_SLAB;
    @ObjectHolder("embellishcraft:marble_large_bricks_wall")
    public static Block MARBLE_LARGE_BRICKS_WALL;
    @ObjectHolder("embellishcraft:marble_large_bricks_pressure_plate")
    public static Block MARBLE_LARGE_BRICKS_PRESSURE_PLATE;

    @ObjectHolder("embellishcraft:old_large_bricks")
    public static Block OLD_LARGE_BRICKS;
    @ObjectHolder("embellishcraft:old_large_bricks_stairs")
    public static Block OLD_LARGE_BRICKS_STAIRS;
    @ObjectHolder("embellishcraft:old_large_bricks_slab")
    public static Block OLD_LARGE_BRICKS_SLAB;
    @ObjectHolder("embellishcraft:old_large_bricks_wall")
    public static Block OLD_LARGE_BRICKS_WALL;
    @ObjectHolder("embellishcraft:old_large_bricks_pressure_plate")
    public static Block OLD_LARGE_BRICKS_PRESSURE_PLATE;

    @ObjectHolder("embellishcraft:sandstone_large_bricks")
    public static Block SANDSTONE_LARGE_BRICKS;
    @ObjectHolder("embellishcraft:sandstone_large_bricks_stairs")
    public static Block SANDSTONE_LARGE_BRICKS_STAIRS;
    @ObjectHolder("embellishcraft:sandstone_large_bricks_slab")
    public static Block SANDSTONE_LARGE_BRICKS_SLAB;
    @ObjectHolder("embellishcraft:sandstone_large_bricks_wall")
    public static Block SANDSTONE_LARGE_BRICKS_WALL;
    @ObjectHolder("embellishcraft:sandstone_large_bricks_pressure_plate")
    public static Block SANDSTONE_LARGE_BRICKS_PRESSURE_PLATE;

    @ObjectHolder("embellishcraft:slate_large_bricks")
    public static Block SLATE_LARGE_BRICKS;
    @ObjectHolder("embellishcraft:slate_large_bricks_stairs")
    public static Block SLATE_LARGE_BRICKS_STAIRS;
    @ObjectHolder("embellishcraft:slate_large_bricks_slab")
    public static Block SLATE_LARGE_BRICKS_SLAB;
    @ObjectHolder("embellishcraft:slate_large_bricks_wall")
    public static Block SLATE_LARGE_BRICKS_WALL;
    @ObjectHolder("embellishcraft:slate_large_bricks_pressure_plate")
    public static Block SLATE_LARGE_BRICKS_PRESSURE_PLATE;

    @ObjectHolder("embellishcraft:terracotta_large_bricks")
    public static Block TERRACOTTA_LARGE_BRICKS;
    @ObjectHolder("embellishcraft:terracotta_large_bricks_stairs")
    public static Block TERRACOTTA_LARGE_BRICKS_STAIRS;
    @ObjectHolder("embellishcraft:terracotta_large_bricks_slab")
    public static Block TERRACOTTA_LARGE_BRICKS_SLAB;
    @ObjectHolder("embellishcraft:terracotta_large_bricks_wall")
    public static Block TERRACOTTA_LARGE_BRICKS_WALL;
    @ObjectHolder("embellishcraft:terracotta_large_bricks_pressure_plate")
    public static Block TERRACOTTA_LARGE_BRICKS_PRESSURE_PLATE;

    @ObjectHolder("embellishcraft:weared_large_bricks")
    public static Block WEARED_LARGE_BRICKS;
    @ObjectHolder("embellishcraft:weared_large_bricks_stairs")
    public static Block WEARED_LARGE_BRICKS_STAIRS;
    @ObjectHolder("embellishcraft:weared_large_bricks_slab")
    public static Block WEARED_LARGE_BRICKS_SLAB;
    @ObjectHolder("embellishcraft:weared_large_bricks_wall")
    public static Block WEARED_LARGE_BRICKS_WALL;
    @ObjectHolder("embellishcraft:weared_large_bricks_pressure_plate")
    public static Block WEARED_LARGE_BRICKS_PRESSURE_PLATE;

    @ObjectHolder("embellishcraft:gneiss_large_bricks")
    public static Block GNEISS_LARGE_BRICKS;
    @ObjectHolder("embellishcraft:gneiss_large_bricks_stairs")
    public static Block GNEISS_LARGE_BRICKS_STAIRS;
    @ObjectHolder("embellishcraft:gneiss_large_bricks_slab")
    public static Block GNEISS_LARGE_BRICKS_SLAB;
    @ObjectHolder("embellishcraft:gneiss_large_bricks_wall")
    public static Block GNEISS_LARGE_BRICKS_WALL;
    @ObjectHolder("embellishcraft:gneiss_large_bricks_pressure_plate")
    public static Block GNEISS_LARGE_BRICKS_PRESSURE_PLATE;

    // Paving

    @ObjectHolder("embellishcraft:concrete_paving")
    public static Block CONCRETE_PAVING;
    @ObjectHolder("embellishcraft:concrete_paving_stairs")
    public static Block CONCRETE_PAVING_STAIRS;
    @ObjectHolder("embellishcraft:concrete_paving_slab")
    public static Block CONCRETE_PAVING_SLAB;
    @ObjectHolder("embellishcraft:concrete_paving_pressure_plate")
    public static Block CONCRETE_PAVING_PRESSURE_PLATE;
    @ObjectHolder("embellishcraft:concrete_paving_wall")
    public static Block CONCRETE_PAVING_WALL;

    @ObjectHolder("embellishcraft:damaged_paving")
    public static Block DAMAGED_PAVING;
    @ObjectHolder("embellishcraft:damaged_paving_stairs")
    public static Block DAMAGED_PAVING_STAIRS;
    @ObjectHolder("embellishcraft:damaged_paving_slab")
    public static Block DAMAGED_PAVING_SLAB;
    @ObjectHolder("embellishcraft:damaged_paving_pressure_plate")
    public static Block DAMAGED_PAVING_PRESSURE_PLATE;
    @ObjectHolder("embellishcraft:damaged_paving_wall")
    public static Block DAMAGED_PAVING_WALL;

    @ObjectHolder("embellishcraft:dark_concrete_paving")
    public static Block DARK_CONCRETE_PAVING;
    @ObjectHolder("embellishcraft:dark_concrete_paving_stairs")
    public static Block DARK_CONCRETE_PAVING_STAIRS;
    @ObjectHolder("embellishcraft:dark_concrete_paving_slab")
    public static Block DARK_CONCRETE_PAVING_SLAB;
    @ObjectHolder("embellishcraft:dark_concrete_paving_pressure_plate")
    public static Block DARK_CONCRETE_PAVING_PRESSURE_PLATE;
    @ObjectHolder("embellishcraft:dark_concrete_paving_wall")
    public static Block DARK_CONCRETE_PAVING_WALL;

    @ObjectHolder("embellishcraft:diorite_paving")
    public static Block DIORITE_PAVING;
    @ObjectHolder("embellishcraft:diorite_paving_stairs")
    public static Block DIORITE_PAVING_STAIRS;
    @ObjectHolder("embellishcraft:diorite_paving_slab")
    public static Block DIORITE_PAVING_SLAB;
    @ObjectHolder("embellishcraft:diorite_paving_pressure_plate")
    public static Block DIORITE_PAVING_PRESSURE_PLATE;
    @ObjectHolder("embellishcraft:diorite_paving_wall")
    public static Block DIORITE_PAVING_WALL;

    @ObjectHolder("embellishcraft:moist_paving")
    public static Block MOIST_PAVING;
    @ObjectHolder("embellishcraft:moist_paving_stairs")
    public static Block MOIST_PAVING_STAIRS;
    @ObjectHolder("embellishcraft:moist_paving_slab")
    public static Block MOIST_PAVING_SLAB;
    @ObjectHolder("embellishcraft:moist_paving_pressure_plate")
    public static Block MOIST_PAVING_PRESSURE_PLATE;
    @ObjectHolder("embellishcraft:moist_paving_wall")
    public static Block MOIST_PAVING_WALL;

    @ObjectHolder("embellishcraft:polished_paving")
    public static Block POLISHED_PAVING;
    @ObjectHolder("embellishcraft:polished_paving_stairs")
    public static Block POLISHED_PAVING_STAIRS;
    @ObjectHolder("embellishcraft:polished_paving_slab")
    public static Block POLISHED_PAVING_SLAB;
    @ObjectHolder("embellishcraft:polished_paving_pressure_plate")
    public static Block POLISHED_PAVING_PRESSURE_PLATE;
    @ObjectHolder("embellishcraft:polished_paving_wall")
    public static Block POLISHED_PAVING_WALL;

    @ObjectHolder("embellishcraft:slate_paving")
    public static Block SLATE_PAVING;
    @ObjectHolder("embellishcraft:slate_paving_stairs")
    public static Block SLATE_PAVING_STAIRS;
    @ObjectHolder("embellishcraft:slate_paving_slab")
    public static Block SLATE_PAVING_SLAB;
    @ObjectHolder("embellishcraft:slate_paving_pressure_plate")
    public static Block SLATE_PAVING_PRESSURE_PLATE;
    @ObjectHolder("embellishcraft:slate_paving_wall")
    public static Block SLATE_PAVING_WALL;

    @ObjectHolder("embellishcraft:white_concrete_paving")
    public static Block WHITE_CONCRETE_PAVING;
    @ObjectHolder("embellishcraft:white_concrete_paving_stairs")
    public static Block WHITE_CONCRETE_PAVING_STAIRS;
    @ObjectHolder("embellishcraft:white_concrete_paving_slab")
    public static Block WHITE_CONCRETE_PAVING_SLAB;
    @ObjectHolder("embellishcraft:white_concrete_paving_pressure_plate")
    public static Block WHITE_CONCRETE_PAVING_PRESSURE_PLATE;
    @ObjectHolder("embellishcraft:white_concrete_paving_wall")
    public static Block WHITE_CONCRETE_PAVING_WALL;

    @ObjectHolder("embellishcraft:gneiss_paving")
    public static Block GNEISS_PAVING;
    @ObjectHolder("embellishcraft:gneiss_paving_stairs")
    public static Block GNEISS_PAVING_STAIRS;
    @ObjectHolder("embellishcraft:gneiss_paving_slab")
    public static Block GNEISS_PAVING_SLAB;
    @ObjectHolder("embellishcraft:gneiss_paving_wall")
    public static Block GNEISS_PAVING_WALL;
    @ObjectHolder("embellishcraft:gneiss_paving_pressure_plate")
    public static Block GNEISS_PAVING_PRESSURE_PLATE;

    // Tiles

    @ObjectHolder("embellishcraft:concrete_tiles")
    public static Block CONCRETE_TILES;
    @ObjectHolder("embellishcraft:concrete_tiles_stairs")
    public static Block CONCRETE_TILES_STAIRS;
    @ObjectHolder("embellishcraft:concrete_tiles_slab")
    public static Block CONCRETE_TILES_SLAB;
    @ObjectHolder("embellishcraft:concrete_tiles_pressure_plate")
    public static Block CONCRETE_TILES_PRESSURE_PLATE;
    @ObjectHolder("embellishcraft:concrete_tiles_wall")
    public static Block CONCRETE_TILES_WALL;

    @ObjectHolder("embellishcraft:skyblue_tiles")
    public static Block SKYBLUE_TILES;
    @ObjectHolder("embellishcraft:skyblue_tiles_stairs")
    public static Block SKYBLUE_TILES_STAIRS;
    @ObjectHolder("embellishcraft:skyblue_tiles_slab")
    public static Block SKYBLUE_TILES_SLAB;
    @ObjectHolder("embellishcraft:skyblue_tiles_pressure_plate")
    public static Block SKYBLUE_TILES_PRESSURE_PLATE;
    @ObjectHolder("embellishcraft:skyblue_tiles_wall")
    public static Block SKYBLUE_TILES_WALL;

    @ObjectHolder("embellishcraft:orange_tiles")
    public static Block ORANGE_TILES;
    @ObjectHolder("embellishcraft:orange_tiles_stairs")
    public static Block ORANGE_TILES_STAIRS;
    @ObjectHolder("embellishcraft:orange_tiles_slab")
    public static Block ORANGE_TILES_SLAB;
    @ObjectHolder("embellishcraft:orange_tiles_pressure_plate")
    public static Block ORANGE_TILES_PRESSURE_PLATE;
    @ObjectHolder("embellishcraft:orange_tiles_wall")
    public static Block ORANGE_TILES_WALL;

    @ObjectHolder("embellishcraft:blue_tiles")
    public static Block BLUE_TILES;
    @ObjectHolder("embellishcraft:blue_tiles_stairs")
    public static Block BLUE_TILES_STAIRS;
    @ObjectHolder("embellishcraft:blue_tiles_slab")
    public static Block BLUE_TILES_SLAB;
    @ObjectHolder("embellishcraft:blue_tiles_pressure_plate")
    public static Block BLUE_TILES_PRESSURE_PLATE;
    @ObjectHolder("embellishcraft:blue_tiles_wall")
    public static Block BLUE_TILES_WALL;

    @ObjectHolder("embellishcraft:light_blue_tiles")
    public static Block LIGHT_BLUE_TILES;
    @ObjectHolder("embellishcraft:light_blue_tiles_stairs")
    public static Block LIGHT_BLUE_TILES_STAIRS;
    @ObjectHolder("embellishcraft:light_blue_tiles_slab")
    public static Block LIGHT_BLUE_TILES_SLAB;
    @ObjectHolder("embellishcraft:light_blue_tiles_pressure_plate")
    public static Block LIGHT_BLUE_TILES_PRESSURE_PLATE;
    @ObjectHolder("embellishcraft:light_blue_tiles_wall")
    public static Block LIGHT_BLUE_TILES_WALL;

    @ObjectHolder("embellishcraft:red_tiles")
    public static Block RED_TILES;
    @ObjectHolder("embellishcraft:red_tiles_stairs")
    public static Block RED_TILES_STAIRS;
    @ObjectHolder("embellishcraft:red_tiles_slab")
    public static Block RED_TILES_SLAB;
    @ObjectHolder("embellishcraft:red_tiles_pressure_plate")
    public static Block RED_TILES_PRESSURE_PLATE;
    @ObjectHolder("embellishcraft:red_tiles_wall")
    public static Block RED_TILES_WALL;

    @ObjectHolder("embellishcraft:white_tiles")
    public static Block WHITE_TILES;
    @ObjectHolder("embellishcraft:white_tiles_stairs")
    public static Block WHITE_TILES_STAIRS;
    @ObjectHolder("embellishcraft:white_tiles_slab")
    public static Block WHITE_TILES_SLAB;
    @ObjectHolder("embellishcraft:white_tiles_pressure_plate")
    public static Block WHITE_TILES_PRESSURE_PLATE;
    @ObjectHolder("embellishcraft:white_tiles_wall")
    public static Block WHITE_TILES_WALL;

    @ObjectHolder("embellishcraft:yellow_tiles")
    public static Block YELLOW_TILES;
    @ObjectHolder("embellishcraft:yellow_tiles_stairs")
    public static Block YELLOW_TILES_STAIRS;
    @ObjectHolder("embellishcraft:yellow_tiles_slab")
    public static Block YELLOW_TILES_SLAB;
    @ObjectHolder("embellishcraft:yellow_tiles_pressure_plate")
    public static Block YELLOW_TILES_PRESSURE_PLATE;
    @ObjectHolder("embellishcraft:yellow_tiles_wall")
    public static Block YELLOW_TILES_WALL;

    @ObjectHolder("embellishcraft:yellow_grey_tiles")
    public static Block YELLOW_GREY_TILES;
    @ObjectHolder("embellishcraft:yellow_grey_tiles_stairs")
    public static Block YELLOW_GREY_TILES_STAIRS;
    @ObjectHolder("embellishcraft:yellow_grey_tiles_slab")
    public static Block YELLOW_GREY_TILES_SLAB;
    @ObjectHolder("embellishcraft:yellow_grey_tiles_pressure_plate")
    public static Block YELLOW_GREY_TILES_PRESSURE_PLATE;
    @ObjectHolder("embellishcraft:yellow_grey_tiles_wall")
    public static Block YELLOW_GREY_TILES_WALL;

    // Wallpaper

    @ObjectHolder("embellishcraft:white_blue_wallpaper")
    public static Block WHITE_BLUE_WALLPAPER;
    @ObjectHolder("embellishcraft:white_blue_wallpaper_stairs")
    public static Block WHITE_BLUE_WALLPAPER_STAIRS;
    @ObjectHolder("embellishcraft:white_blue_wallpaper_slab")
    public static Block WHITE_BLUE_WALLPAPER_SLAB;
    @ObjectHolder("embellishcraft:white_blue_wallpaper_plinth")
    public static Block WHITE_BLUE_WALLPAPER_PLINTH;

    @ObjectHolder("embellishcraft:beige_wallpaper")
    public static Block BEIGE_WALLPAPER;
    @ObjectHolder("embellishcraft:beige_wallpaper_stairs")
    public static Block BEIGE_WALLPAPER_STAIRS;
    @ObjectHolder("embellishcraft:beige_wallpaper_slab")
    public static Block BEIGE_WALLPAPER_SLAB;
    @ObjectHolder("embellishcraft:beige_wallpaper_plinth")
    public static Block BEIGE_WALLPAPER_PLINTH;

    @ObjectHolder("embellishcraft:pink_wallpaper")
    public static Block PINK_WALLPAPER;
    @ObjectHolder("embellishcraft:pink_wallpaper_stairs")
    public static Block PINK_WALLPAPER_STAIRS;
    @ObjectHolder("embellishcraft:pink_wallpaper_slab")
    public static Block PINK_WALLPAPER_SLAB;
    @ObjectHolder("embellishcraft:pink_wallpaper_plinth")
    public static Block PINK_WALLPAPER_PLINTH;

    @ObjectHolder("embellishcraft:beige_flower_wallpaper")
    public static Block BEIGE_FLOWER_WALLPAPER;
    @ObjectHolder("embellishcraft:beige_flower_wallpaper_stairs")
    public static Block BEIGE_FLOWER_WALLPAPER_STAIRS;
    @ObjectHolder("embellishcraft:beige_flower_wallpaper_slab")
    public static Block BEIGE_FLOWER_WALLPAPER_SLAB;
    @ObjectHolder("embellishcraft:beige_flower_wallpaper_plinth")
    public static Block BEIGE_FLOWER_WALLPAPER_PLINTH;

    @ObjectHolder("embellishcraft:white_green_wallpaper")
    public static Block WHITE_GREEN_WALLPAPER;
    @ObjectHolder("embellishcraft:white_green_wallpaper_stairs")
    public static Block WHITE_GREEN_WALLPAPER_STAIRS;
    @ObjectHolder("embellishcraft:white_green_wallpaper_slab")
    public static Block WHITE_GREEN_WALLPAPER_SLAB;
    @ObjectHolder("embellishcraft:white_green_wallpaper_plinth")
    public static Block WHITE_GREEN_WALLPAPER_PLINTH;

    // Furniture

    @ObjectHolder("embellishcraft:oak_chair")
    public static Block OAK_CHAIR;
    @ObjectHolder("embellishcraft:dark_oak_chair")
    public static Block DARK_OAK_CHAIR;
    @ObjectHolder("embellishcraft:birch_chair")
    public static Block BIRCH_CHAIR;
    @ObjectHolder("embellishcraft:jungle_chair")
    public static Block JUNGLE_CHAIR;
    @ObjectHolder("embellishcraft:spruce_chair")
    public static Block SPRUCE_CHAIR;
    @ObjectHolder("embellishcraft:acacia_chair")
    public static Block ACACIA_CHAIR;

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event)
    {
        // World

        createBlockWithVariants(event, "basalt", true, true, true, true);
        createBlockWithVariants(event, "slate", true, true, true, true);
        createBlockWithVariants(event, "marble", true, true, true, true);
        createBlockWithVariants(event, "gneiss", true, true, true, true);

        // Cobblestones

        createBlockWithVariants(event, "basalt_cobblestone", true, true, true, true);
        createBlockWithVariants(event, "slate_cobblestone", true, true, true, true);
        createBlockWithVariants(event, "marble_cobblestone", true, true, true, true);
        createBlockWithVariants(event, "gneiss_cobblestone", true, true, true, true);

        // Bricks

        createBlockWithVariants(event, "basalt_bricks", true, true, true, true);
        createBlockWithVariants(event, "dark_bricks", true, true, true, true);
        createBlockWithVariants(event, "diorite_bricks", true, true, true, true);
        createBlockWithVariants(event, "old_bricks", true, true, true, true);
        createBlockWithVariants(event, "sandstone_bricks", true, true, true, true);
        createBlockWithVariants(event, "slate_bricks", true, true, true, true);
        createBlockWithVariants(event, "terracotta_bricks", true, true, true, true);
        createBlockWithVariants(event, "weared_bricks", true, true, true, true);
        createBlockWithVariants(event, "marble_bricks", true, true, true, true);
        createBlockWithVariants(event, "gneiss_bricks", true, true, true, true);

        // Large bricks

        createBlockWithVariants(event, "basalt_large_bricks", true, true, true, true);
        createBlockWithVariants(event, "diorite_large_bricks", true, true, true, true);
        createBlockWithVariants(event, "dark_large_bricks", true, true, true, true);
        createBlockWithVariants(event, "marble_large_bricks", true, true, true, true);
        createBlockWithVariants(event, "old_large_bricks", true, true, true, true);
        createBlockWithVariants(event, "sandstone_large_bricks", true, true, true, true);
        createBlockWithVariants(event, "slate_large_bricks", true, true, true, true);
        createBlockWithVariants(event, "terracotta_large_bricks", true, true, true, true);
        createBlockWithVariants(event, "weared_large_bricks", true, true, true, true);
        createBlockWithVariants(event, "gneiss_large_bricks", true, true, true, true);

        // Paving

        createBlockWithVariants(event, "concrete_paving", true, true, true, true);
        createBlockWithVariants(event, "damaged_paving", true, true, true, true);
        createBlockWithVariants(event, "dark_concrete_paving", true, true, true, true);
        createBlockWithVariants(event, "diorite_paving", true, true, true, true);
        createBlockWithVariants(event, "moist_paving", true, true, true, true);
        createBlockWithVariants(event, "polished_paving", true, true, true, true);
        createBlockWithVariants(event, "slate_paving", true, true, true, true);
        createBlockWithVariants(event, "white_concrete_paving", true, true, true, true);
        createBlockWithVariants(event, "gneiss_paving", true, true, true, true);

        // Tiles

        createBlockWithVariants(event, "concrete_tiles", true, true, true, true);
        createBlockWithVariants(event, "skyblue_tiles", true, true, true, true);
        createBlockWithVariants(event, "orange_tiles", true, true, true, true);
        createBlockWithVariants(event, "blue_tiles", true, true, true, true);
        createBlockWithVariants(event, "light_blue_tiles", true, true, true, true);
        createBlockWithVariants(event, "red_tiles", true, true, true, true);
        createBlockWithVariants(event, "white_tiles", true, true, true, true);
        createBlockWithVariants(event, "yellow_tiles", true, true, true, true);
        createBlockWithVariants(event, "yellow_grey_tiles", true, true, true, true);

        // Wallpaper

        createBlockWithVariants(event, "white_blue_wallpaper", true, true, false, false);
        event.getRegistry().register(new UpDownBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(0.5f)).setRegistryName("white_blue_wallpaper_plinth"));
        createBlockWithVariants(event, "beige_wallpaper", true, true, false, false);
        event.getRegistry().register(new UpDownBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(0.5f)).setRegistryName("beige_wallpaper_plinth"));
        createBlockWithVariants(event, "pink_wallpaper", true, true, false, false);
        event.getRegistry().register(new UpDownBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(0.5f)).setRegistryName("pink_wallpaper_plinth"));
        createBlockWithVariants(event, "beige_flower_wallpaper", true, true, false, false);
        event.getRegistry().register(new UpDownBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(0.5f)).setRegistryName("beige_flower_wallpaper_plinth"));
        createBlockWithVariants(event, "white_green_wallpaper", true, true, false, false);
        event.getRegistry().register(new UpDownBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(0.5f)).setRegistryName("white_green_wallpaper_plinth"));

        // Furniture

        event.getRegistry().register(new ChairBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.75F, 0.5F).sound(SoundType.WOOD)).setRegistryName("oak_chair"));
        event.getRegistry().register(new ChairBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.75F, 0.5F).sound(SoundType.WOOD)).setRegistryName("dark_oak_chair"));
        event.getRegistry().register(new ChairBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.75F, 0.5F).sound(SoundType.WOOD)).setRegistryName("birch_chair"));
        event.getRegistry().register(new ChairBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.75F, 0.5F).sound(SoundType.WOOD)).setRegistryName("jungle_chair"));
        event.getRegistry().register(new ChairBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.75F, 0.5F).sound(SoundType.WOOD)).setRegistryName("spruce_chair"));
        event.getRegistry().register(new ChairBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.75F, 0.5F).sound(SoundType.WOOD)).setRegistryName("acacia_chair"));

    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event)
    {
        // World

        createItemBlockWithVariants(event, ModItemGroups.EMBELLISHCRAFT, BASALT, BASALT_STAIRS, BASALT_SLAB, BASALT_WALL, BASALT_PRESSURE_PLATE);
        createItemBlockWithVariants(event, ModItemGroups.EMBELLISHCRAFT, SLATE, SLATE_STAIRS, SLATE_SLAB, SLATE_WALL, SLATE_PRESSURE_PLATE);
        createItemBlockWithVariants(event, ModItemGroups.EMBELLISHCRAFT, MARBLE, MARBLE_STAIRS, MARBLE_SLAB, MARBLE_WALL, MARBLE_PRESSURE_PLATE);
        createItemBlockWithVariants(event, ModItemGroups.EMBELLISHCRAFT, GNEISS, GNEISS_STAIRS, GNEISS_SLAB, GNEISS_WALL, GNEISS_PRESSURE_PLATE);

        // Cobblestones

        createItemBlockWithVariants(event, ModItemGroups.EMBELLISHCRAFT, BASALT_COBBLESTONE, BASALT_COBBLESTONE_STAIRS, BASALT_COBBLESTONE_SLAB, BASALT_COBBLESTONE_WALL, BASALT_COBBLESTONE_PRESSURE_PLATE);
        createItemBlockWithVariants(event, ModItemGroups.EMBELLISHCRAFT, SLATE_COBBLESTONE, SLATE_COBBLESTONE_STAIRS, SLATE_COBBLESTONE_SLAB, SLATE_COBBLESTONE_WALL, SLATE_COBBLESTONE_PRESSURE_PLATE);
        createItemBlockWithVariants(event, ModItemGroups.EMBELLISHCRAFT, MARBLE_COBBLESTONE, MARBLE_COBBLESTONE_STAIRS, MARBLE_COBBLESTONE_SLAB, MARBLE_COBBLESTONE_WALL, MARBLE_COBBLESTONE_PRESSURE_PLATE);
        createItemBlockWithVariants(event, ModItemGroups.EMBELLISHCRAFT, GNEISS_COBBLESTONE, GNEISS_COBBLESTONE_STAIRS, GNEISS_COBBLESTONE_SLAB, GNEISS_COBBLESTONE_WALL, GNEISS_COBBLESTONE_PRESSURE_PLATE);

        // Bricks

        createItemBlockWithVariants(event, ModItemGroups.EMBELLISHCRAFT, BASALT_BRICKS, BASALT_BRICKS_STAIRS, BASALT_BRICKS_SLAB, BASALT_BRICKS_WALL, BASALT_BRICKS_PRESSURE_PLATE);
        createItemBlockWithVariants(event, ModItemGroups.EMBELLISHCRAFT, DARK_BRICKS, DARK_BRICKS_STAIRS, DARK_BRICKS_SLAB, DARK_BRICKS_WALL, DARK_BRICKS_PRESSURE_PLATE);
        createItemBlockWithVariants(event, ModItemGroups.EMBELLISHCRAFT, DIORITE_BRICKS, DIORITE_BRICKS_STAIRS, DIORITE_BRICKS_SLAB, DIORITE_BRICKS_WALL, DIORITE_BRICKS_PRESSURE_PLATE);
        createItemBlockWithVariants(event, ModItemGroups.EMBELLISHCRAFT, OLD_BRICKS, OLD_BRICKS_STAIRS, OLD_BRICKS_SLAB, OLD_BRICKS_WALL, OLD_BRICKS_PRESSURE_PLATE);
        createItemBlockWithVariants(event, ModItemGroups.EMBELLISHCRAFT, SANDSTONE_BRICKS, SANDSTONE_BRICKS_STAIRS, SANDSTONE_BRICKS_SLAB, SANDSTONE_BRICKS_WALL, SANDSTONE_BRICKS_PRESSURE_PLATE);
        createItemBlockWithVariants(event, ModItemGroups.EMBELLISHCRAFT, SLATE_BRICKS, SLATE_BRICKS_STAIRS, SLATE_BRICKS_SLAB, SLATE_BRICKS_WALL, SLATE_BRICKS_PRESSURE_PLATE);
        createItemBlockWithVariants(event, ModItemGroups.EMBELLISHCRAFT, TERRACOTTA_BRICKS, TERRACOTTA_BRICKS_STAIRS, TERRACOTTA_BRICKS_SLAB, TERRACOTTA_BRICKS_WALL, TERRACOTTA_BRICKS_PRESSURE_PLATE);
        createItemBlockWithVariants(event, ModItemGroups.EMBELLISHCRAFT, WEARED_BRICKS, WEARED_BRICKS_STAIRS, WEARED_BRICKS_SLAB, WEARED_BRICKS_WALL, WEARED_BRICKS_PRESSURE_PLATE);
        createItemBlockWithVariants(event, ModItemGroups.EMBELLISHCRAFT, MARBLE_BRICKS, MARBLE_BRICKS_STAIRS, MARBLE_BRICKS_SLAB, MARBLE_BRICKS_WALL, MARBLE_BRICKS_PRESSURE_PLATE);
        createItemBlockWithVariants(event, ModItemGroups.EMBELLISHCRAFT, GNEISS_BRICKS, GNEISS_BRICKS_STAIRS, GNEISS_BRICKS_SLAB, GNEISS_BRICKS_WALL, GNEISS_BRICKS_PRESSURE_PLATE);

        // Large bricks

        createItemBlockWithVariants(event, ModItemGroups.EMBELLISHCRAFT, BASALT_LARGE_BRICKS, BASALT_LARGE_BRICKS_STAIRS, BASALT_LARGE_BRICKS_SLAB, BASALT_LARGE_BRICKS_WALL, BASALT_LARGE_BRICKS_PRESSURE_PLATE);
        createItemBlockWithVariants(event, ModItemGroups.EMBELLISHCRAFT, DIORITE_LARGE_BRICKS, DIORITE_LARGE_BRICKS_STAIRS, DIORITE_LARGE_BRICKS_SLAB, DIORITE_LARGE_BRICKS_WALL, DIORITE_LARGE_BRICKS_PRESSURE_PLATE);
        createItemBlockWithVariants(event, ModItemGroups.EMBELLISHCRAFT, DARK_LARGE_BRICKS, DARK_LARGE_BRICKS_STAIRS, DARK_LARGE_BRICKS_SLAB, DARK_LARGE_BRICKS_WALL, DARK_LARGE_BRICKS_PRESSURE_PLATE);
        createItemBlockWithVariants(event, ModItemGroups.EMBELLISHCRAFT, MARBLE_LARGE_BRICKS, MARBLE_LARGE_BRICKS_STAIRS, MARBLE_LARGE_BRICKS_SLAB, MARBLE_LARGE_BRICKS_WALL, MARBLE_LARGE_BRICKS_PRESSURE_PLATE);
        createItemBlockWithVariants(event, ModItemGroups.EMBELLISHCRAFT, OLD_LARGE_BRICKS, OLD_LARGE_BRICKS_STAIRS, OLD_LARGE_BRICKS_SLAB, OLD_LARGE_BRICKS_WALL, OLD_LARGE_BRICKS_PRESSURE_PLATE);
        createItemBlockWithVariants(event, ModItemGroups.EMBELLISHCRAFT, SANDSTONE_LARGE_BRICKS, SANDSTONE_LARGE_BRICKS_STAIRS, SANDSTONE_LARGE_BRICKS_SLAB, SANDSTONE_LARGE_BRICKS_WALL, SANDSTONE_LARGE_BRICKS_PRESSURE_PLATE);
        createItemBlockWithVariants(event, ModItemGroups.EMBELLISHCRAFT, SLATE_LARGE_BRICKS, SLATE_LARGE_BRICKS_STAIRS, SLATE_LARGE_BRICKS_SLAB, SLATE_LARGE_BRICKS_WALL, SLATE_LARGE_BRICKS_PRESSURE_PLATE);
        createItemBlockWithVariants(event, ModItemGroups.EMBELLISHCRAFT, TERRACOTTA_LARGE_BRICKS, TERRACOTTA_LARGE_BRICKS_STAIRS, TERRACOTTA_LARGE_BRICKS_SLAB, TERRACOTTA_LARGE_BRICKS_WALL, TERRACOTTA_LARGE_BRICKS_PRESSURE_PLATE);
        createItemBlockWithVariants(event, ModItemGroups.EMBELLISHCRAFT, WEARED_LARGE_BRICKS, WEARED_LARGE_BRICKS_STAIRS, WEARED_LARGE_BRICKS_SLAB, WEARED_LARGE_BRICKS_WALL, WEARED_LARGE_BRICKS_PRESSURE_PLATE);
        createItemBlockWithVariants(event, ModItemGroups.EMBELLISHCRAFT, GNEISS_LARGE_BRICKS, GNEISS_LARGE_BRICKS_STAIRS, GNEISS_LARGE_BRICKS_SLAB, GNEISS_LARGE_BRICKS_WALL, GNEISS_LARGE_BRICKS_PRESSURE_PLATE);

        // Paving

        createItemBlockWithVariants(event, ModItemGroups.EMBELLISHCRAFT, CONCRETE_PAVING, CONCRETE_PAVING_STAIRS, CONCRETE_PAVING_SLAB, CONCRETE_PAVING_WALL, CONCRETE_PAVING_PRESSURE_PLATE);
        createItemBlockWithVariants(event, ModItemGroups.EMBELLISHCRAFT, DAMAGED_PAVING, DAMAGED_PAVING_STAIRS, DAMAGED_PAVING_SLAB, DAMAGED_PAVING_WALL, DAMAGED_PAVING_PRESSURE_PLATE);
        createItemBlockWithVariants(event, ModItemGroups.EMBELLISHCRAFT, DARK_CONCRETE_PAVING, DARK_CONCRETE_PAVING_STAIRS, DARK_CONCRETE_PAVING_SLAB, DARK_CONCRETE_PAVING_WALL, DARK_CONCRETE_PAVING_PRESSURE_PLATE);
        createItemBlockWithVariants(event, ModItemGroups.EMBELLISHCRAFT, DIORITE_PAVING, DIORITE_PAVING_STAIRS, DIORITE_PAVING_SLAB, DIORITE_PAVING_WALL, DIORITE_PAVING_PRESSURE_PLATE);
        createItemBlockWithVariants(event, ModItemGroups.EMBELLISHCRAFT, MOIST_PAVING, MOIST_PAVING_STAIRS, MOIST_PAVING_SLAB, MOIST_PAVING_WALL, MOIST_PAVING_PRESSURE_PLATE);
        createItemBlockWithVariants(event, ModItemGroups.EMBELLISHCRAFT, POLISHED_PAVING, POLISHED_PAVING_STAIRS, POLISHED_PAVING_SLAB, POLISHED_PAVING_WALL, POLISHED_PAVING_PRESSURE_PLATE);
        createItemBlockWithVariants(event, ModItemGroups.EMBELLISHCRAFT, SLATE_PAVING, SLATE_PAVING_STAIRS, SLATE_PAVING_SLAB, SLATE_PAVING_WALL, SLATE_PAVING_PRESSURE_PLATE);
        createItemBlockWithVariants(event, ModItemGroups.EMBELLISHCRAFT, WHITE_CONCRETE_PAVING, WHITE_CONCRETE_PAVING_STAIRS, WHITE_CONCRETE_PAVING_SLAB, WHITE_CONCRETE_PAVING_WALL, WHITE_CONCRETE_PAVING_PRESSURE_PLATE);
        createItemBlockWithVariants(event, ModItemGroups.EMBELLISHCRAFT, GNEISS_PAVING, GNEISS_PAVING_STAIRS, GNEISS_PAVING_SLAB, GNEISS_PAVING_WALL, GNEISS_PAVING_PRESSURE_PLATE);

        // Tiles

        createItemBlockWithVariants(event, ModItemGroups.EMBELLISHCRAFT, CONCRETE_TILES, CONCRETE_TILES_STAIRS, CONCRETE_TILES_SLAB, CONCRETE_TILES_WALL, CONCRETE_TILES_PRESSURE_PLATE);
        createItemBlockWithVariants(event, ModItemGroups.EMBELLISHCRAFT, SKYBLUE_TILES, SKYBLUE_TILES_STAIRS, SKYBLUE_TILES_SLAB, SKYBLUE_TILES_WALL, SKYBLUE_TILES_PRESSURE_PLATE);
        createItemBlockWithVariants(event, ModItemGroups.EMBELLISHCRAFT, ORANGE_TILES, ORANGE_TILES_STAIRS, ORANGE_TILES_SLAB, ORANGE_TILES_WALL, ORANGE_TILES_PRESSURE_PLATE);
        createItemBlockWithVariants(event, ModItemGroups.EMBELLISHCRAFT, BLUE_TILES, BLUE_TILES_STAIRS, BLUE_TILES_SLAB, BLUE_TILES_WALL, BLUE_TILES_PRESSURE_PLATE);
        createItemBlockWithVariants(event, ModItemGroups.EMBELLISHCRAFT, LIGHT_BLUE_TILES, LIGHT_BLUE_TILES_STAIRS, LIGHT_BLUE_TILES_SLAB, LIGHT_BLUE_TILES_WALL, LIGHT_BLUE_TILES_PRESSURE_PLATE);
        createItemBlockWithVariants(event, ModItemGroups.EMBELLISHCRAFT, RED_TILES, RED_TILES_STAIRS, RED_TILES_SLAB, RED_TILES_WALL, RED_TILES_PRESSURE_PLATE);
        createItemBlockWithVariants(event, ModItemGroups.EMBELLISHCRAFT, WHITE_TILES, WHITE_TILES_STAIRS, WHITE_TILES_SLAB, WHITE_TILES_WALL, WHITE_TILES_PRESSURE_PLATE);
        createItemBlockWithVariants(event, ModItemGroups.EMBELLISHCRAFT, YELLOW_TILES, YELLOW_TILES_STAIRS, YELLOW_TILES_SLAB, YELLOW_TILES_WALL, YELLOW_TILES_PRESSURE_PLATE);
        createItemBlockWithVariants(event, ModItemGroups.EMBELLISHCRAFT, YELLOW_GREY_TILES, YELLOW_GREY_TILES_STAIRS, YELLOW_GREY_TILES_SLAB, YELLOW_GREY_TILES_WALL, YELLOW_GREY_TILES_PRESSURE_PLATE);

        // Wallpapers

        createItemBlockWithVariants(event, ModItemGroups.EMBELLISHCRAFT, WHITE_BLUE_WALLPAPER, WHITE_BLUE_WALLPAPER_STAIRS, WHITE_BLUE_WALLPAPER_SLAB, null, null);
        event.getRegistry().register(new BlockItem(WHITE_BLUE_WALLPAPER_PLINTH, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)).setRegistryName(WHITE_BLUE_WALLPAPER_PLINTH.getRegistryName()));
        createItemBlockWithVariants(event, ModItemGroups.EMBELLISHCRAFT, BEIGE_WALLPAPER, BEIGE_WALLPAPER_STAIRS, BEIGE_WALLPAPER_SLAB, null, null);
        event.getRegistry().register(new BlockItem(BEIGE_WALLPAPER_PLINTH, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)).setRegistryName(BEIGE_WALLPAPER_PLINTH.getRegistryName()));
        createItemBlockWithVariants(event, ModItemGroups.EMBELLISHCRAFT, PINK_WALLPAPER, PINK_WALLPAPER_STAIRS, PINK_WALLPAPER_SLAB, null, null);
        event.getRegistry().register(new BlockItem(PINK_WALLPAPER_PLINTH, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)).setRegistryName(PINK_WALLPAPER_PLINTH.getRegistryName()));
        createItemBlockWithVariants(event, ModItemGroups.EMBELLISHCRAFT, BEIGE_FLOWER_WALLPAPER, BEIGE_FLOWER_WALLPAPER_STAIRS, BEIGE_FLOWER_WALLPAPER_SLAB, null, null);
        event.getRegistry().register(new BlockItem(BEIGE_FLOWER_WALLPAPER_PLINTH, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)).setRegistryName(BEIGE_FLOWER_WALLPAPER_PLINTH.getRegistryName()));
        createItemBlockWithVariants(event, ModItemGroups.EMBELLISHCRAFT, WHITE_GREEN_WALLPAPER, WHITE_GREEN_WALLPAPER_STAIRS, WHITE_GREEN_WALLPAPER_SLAB, null, null);
        event.getRegistry().register(new BlockItem(WHITE_GREEN_WALLPAPER_PLINTH, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)).setRegistryName(WHITE_GREEN_WALLPAPER_PLINTH.getRegistryName()));

        // Furniture

        event.getRegistry().register(new ChairItemBlock(OAK_CHAIR, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)).setRegistryName(OAK_CHAIR.getRegistryName()));
        event.getRegistry().register(new ChairItemBlock(DARK_OAK_CHAIR, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)).setRegistryName(DARK_OAK_CHAIR.getRegistryName()));
        event.getRegistry().register(new ChairItemBlock(BIRCH_CHAIR, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)).setRegistryName(BIRCH_CHAIR.getRegistryName()));
        event.getRegistry().register(new ChairItemBlock(JUNGLE_CHAIR, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)).setRegistryName(JUNGLE_CHAIR.getRegistryName()));
        event.getRegistry().register(new ChairItemBlock(SPRUCE_CHAIR, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)).setRegistryName(SPRUCE_CHAIR.getRegistryName()));
        event.getRegistry().register(new ChairItemBlock(ACACIA_CHAIR, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)).setRegistryName(ACACIA_CHAIR.getRegistryName()));

    }

    /**
     * Registers a Block with its variants.
     * @param event
     *        The RegistryEvent
     * @param name
     *        The Block registry name
     * @param stairs
     *        If true, stairs variant will be registered
     * @param slab
     *        If true, slab variant will be registered
     * @param wall
     *        If true, wall variant will be registered
     * @param pressure
     *        If true, pressure plate variant will be registered
     */
    private static void createBlockWithVariants(RegistryEvent.Register<Block> event, String name, boolean stairs, boolean slab, boolean wall, boolean pressure)
    {
        Block block; // Needed to register the stairs
        event.getRegistry().register(block = new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5F, 6.0F)).setRegistryName(name));
        if(stairs)
            event.getRegistry().register(new CustomStairsBlock(block.getDefaultState(), Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5F, 6.0F)).setRegistryName(name + "_stairs"));
        if(slab)
            event.getRegistry().register(new SlabBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5F, 6.0F)).setRegistryName(name + "_slab"));
        if(wall)
            event.getRegistry().register(new WallBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5F, 6.0F)).setRegistryName(name + "_wall"));
        if(pressure)
            event.getRegistry().register(new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK).doesNotBlockMovement().hardnessAndResistance(0.5F)).setRegistryName(name + "_pressure_plate"));

    }

    /**
     * Registers only variants of specified block.
     * @param event
     *        The RegistryEvent
     * @param name
     *        The Block registry name
     * @param stairs
     *        If true, stairs variant will be registered
     * @param slab
     *        If true, slab variant will be registered
     * @param wall
     *        If true, wall variant will be registered
     * @param pressure
     *        If true, pressure plate variant will be registered
     */
    // private static void createOnlyVariants(RegistryEvent.Register<Block> event, String name, boolean stairs, boolean slab, boolean wall, boolean pressure)
    // {
    // Block block = new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5F, 6.0F)).setRegistryName(name);; // Needed to register the stairs
    // if(stairs)
    // event.getRegistry().register(new CustomStairsBlock(block.getDefaultState(), Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5F, 6.0F)).setRegistryName(name + "_stairs"));
    // if(slab)
    // event.getRegistry().register(new SlabBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5F, 6.0F)).setRegistryName(name + "_slab"));
    // if(wall)
    // event.getRegistry().register(new WallBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5F, 6.0F)).setRegistryName(name + "_wall"));
    // if(pressure)
    // event.getRegistry().register(new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK).hardnessAndResistance(0.5F)).setRegistryName(name +
    // "_pressure_plate"));
    //
    // }

    /**
     * Registers a Block with its variants.
     * @param event
     *        The RegistryEvent
     * @param group
     *        The ItemGroup name
     * @param block
     *        The associated block
     * @param stairs
     *        The associated stairs (send null to not generate ItemBlock for it)
     * @param slab
     *        The associated slab (send null to not generate ItemBlock for it)
     * @param wall
     *        The associated wall (send null to not generate ItemBlock for it)
     * @param pressure
     *        The associated pressure plate (send null tot no generate ItemBlock for it)
     */
    private static void createItemBlockWithVariants(RegistryEvent.Register<Item> event, ItemGroup group, Block block, Block stairs, Block slab, Block wall, Block pressure)
    {
        event.getRegistry().register(new BlockItem(block, new Item.Properties().group(group)).setRegistryName(block.getRegistryName()));
        if(stairs != null)
            event.getRegistry().register(new BlockItem(stairs, new Item.Properties().group(group)).setRegistryName(stairs.getRegistryName()));
        if(slab != null)
            event.getRegistry().register(new BlockItem(slab, new Item.Properties().group(group)).setRegistryName(slab.getRegistryName()));
        if(wall != null)
            event.getRegistry().register(new BlockItem(wall, new Item.Properties().group(group)).setRegistryName(wall.getRegistryName()));
        if(pressure != null)
            event.getRegistry().register(new BlockItem(pressure, new Item.Properties().group(group)).setRegistryName(pressure.getRegistryName()));
    }
}