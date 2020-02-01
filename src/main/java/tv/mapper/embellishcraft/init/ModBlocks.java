package tv.mapper.embellishcraft.init;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.PressurePlateBlock;
import net.minecraft.block.RotatedPillarBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.item.BlockItem;
import net.minecraft.item.DyeColor;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.ObjectHolder;
import tv.mapper.embellishcraft.ECConstants;
import tv.mapper.embellishcraft.block.AllRotationBlock;
import tv.mapper.embellishcraft.block.ChairBlock;
import tv.mapper.embellishcraft.block.CouchBlock;
import tv.mapper.embellishcraft.block.CrateBlock;
import tv.mapper.embellishcraft.block.CustomBlock;
import tv.mapper.embellishcraft.block.CustomDoorBlock;
import tv.mapper.embellishcraft.block.CustomLadderBlock;
import tv.mapper.embellishcraft.block.CustomPressurePlateBlock;
import tv.mapper.embellishcraft.block.CustomSlabBlock;
import tv.mapper.embellishcraft.block.CustomStairsBlock;
import tv.mapper.embellishcraft.block.CustomWallBlock;
import tv.mapper.embellishcraft.block.FancyTableBlock;
import tv.mapper.embellishcraft.block.LampBlock;
import tv.mapper.embellishcraft.block.PillowBlock;
import tv.mapper.embellishcraft.block.PlateBlock;
import tv.mapper.embellishcraft.block.SuspendedStairsBlock;
import tv.mapper.embellishcraft.block.TableBlock;
import tv.mapper.embellishcraft.block.TerraceChairBlock;
import tv.mapper.embellishcraft.block.TerraceTableBlock;
import tv.mapper.embellishcraft.block.UpDownBlock;
import tv.mapper.embellishcraft.item.FuelBlockItem;
import tv.mapper.embellishcraft.item.ModItemGroups;
import tv.mapper.embellishcraft.util.WoodType;

@ObjectHolder(ECConstants.MODID)
@EventBusSubscriber(bus = Bus.MOD)
public class ModBlocks
{
    // World (blocks that generate in the world)

    public static final Block BASALT = null;
    public static final Block BASALT_STAIRS = null;
    public static final Block BASALT_SLAB = null;
    public static final Block BASALT_WALL = null;
    public static final Block BASALT_PRESSURE_PLATE = null;

    public static final Block SLATE = null;
    public static final Block SLATE_STAIRS = null;
    public static final Block SLATE_SLAB = null;
    public static final Block SLATE_WALL = null;
    public static final Block SLATE_PRESSURE_PLATE = null;

    public static final Block MARBLE = null;
    public static final Block MARBLE_STAIRS = null;
    public static final Block MARBLE_SLAB = null;
    public static final Block MARBLE_WALL = null;
    public static final Block MARBLE_PRESSURE_PLATE = null;

    public static final Block GNEISS = null;
    public static final Block GNEISS_STAIRS = null;
    public static final Block GNEISS_SLAB = null;
    public static final Block GNEISS_WALL = null;
    public static final Block GNEISS_PRESSURE_PLATE = null;

    public static final Block JADE = null;
    public static final Block JADE_STAIRS = null;
    public static final Block JADE_SLAB = null;
    public static final Block JADE_WALL = null;
    public static final Block JADE_PRESSURE_PLATE = null;

    public static final Block LARVIKITE = null;
    public static final Block LARVIKITE_STAIRS = null;
    public static final Block LARVIKITE_SLAB = null;
    public static final Block LARVIKITE_WALL = null;
    public static final Block LARVIKITE_PRESSURE_PLATE = null;

    // Cobblestones

    public static final Block BASALT_COBBLESTONE = null;
    public static final Block BASALT_COBBLESTONE_STAIRS = null;
    public static final Block BASALT_COBBLESTONE_SLAB = null;
    public static final Block BASALT_COBBLESTONE_WALL = null;
    public static final Block BASALT_COBBLESTONE_PRESSURE_PLATE = null;

    public static final Block SLATE_COBBLESTONE = null;
    public static final Block SLATE_COBBLESTONE_STAIRS = null;
    public static final Block SLATE_COBBLESTONE_SLAB = null;
    public static final Block SLATE_COBBLESTONE_WALL = null;
    public static final Block SLATE_COBBLESTONE_PRESSURE_PLATE = null;

    public static final Block MARBLE_COBBLESTONE = null;
    public static final Block MARBLE_COBBLESTONE_STAIRS = null;
    public static final Block MARBLE_COBBLESTONE_SLAB = null;
    public static final Block MARBLE_COBBLESTONE_WALL = null;
    public static final Block MARBLE_COBBLESTONE_PRESSURE_PLATE = null;

    public static final Block GNEISS_COBBLESTONE = null;
    public static final Block GNEISS_COBBLESTONE_STAIRS = null;
    public static final Block GNEISS_COBBLESTONE_SLAB = null;
    public static final Block GNEISS_COBBLESTONE_WALL = null;
    public static final Block GNEISS_COBBLESTONE_PRESSURE_PLATE = null;

    public static final Block JADE_COBBLESTONE = null;
    public static final Block JADE_COBBLESTONE_STAIRS = null;
    public static final Block JADE_COBBLESTONE_SLAB = null;
    public static final Block JADE_COBBLESTONE_WALL = null;
    public static final Block JADE_COBBLESTONE_PRESSURE_PLATE = null;

    public static final Block LARVIKITE_COBBLESTONE = null;
    public static final Block LARVIKITE_COBBLESTONE_STAIRS = null;
    public static final Block LARVIKITE_COBBLESTONE_SLAB = null;
    public static final Block LARVIKITE_COBBLESTONE_WALL = null;
    public static final Block LARVIKITE_COBBLESTONE_PRESSURE_PLATE = null;

    // Bricks

    public static final Block BASALT_BRICKS = null;
    public static final Block BASALT_BRICKS_STAIRS = null;
    public static final Block BASALT_BRICKS_SLAB = null;
    public static final Block BASALT_BRICKS_WALL = null;
    public static final Block BASALT_BRICKS_PRESSURE_PLATE = null;

    public static final Block DARK_BRICKS = null;
    public static final Block DARK_BRICKS_STAIRS = null;
    public static final Block DARK_BRICKS_SLAB = null;
    public static final Block DARK_BRICKS_WALL = null;
    public static final Block DARK_BRICKS_PRESSURE_PLATE = null;

    public static final Block DIORITE_BRICKS = null;
    public static final Block DIORITE_BRICKS_STAIRS = null;
    public static final Block DIORITE_BRICKS_SLAB = null;
    public static final Block DIORITE_BRICKS_WALL = null;
    public static final Block DIORITE_BRICKS_PRESSURE_PLATE = null;

    public static final Block OLD_BRICKS = null;
    public static final Block OLD_BRICKS_STAIRS = null;
    public static final Block OLD_BRICKS_SLAB = null;
    public static final Block OLD_BRICKS_WALL = null;
    public static final Block OLD_BRICKS_PRESSURE_PLATE = null;

    public static final Block SANDSTONE_BRICKS = null;
    public static final Block SANDSTONE_BRICKS_STAIRS = null;
    public static final Block SANDSTONE_BRICKS_SLAB = null;
    public static final Block SANDSTONE_BRICKS_WALL = null;
    public static final Block SANDSTONE_BRICKS_PRESSURE_PLATE = null;

    public static final Block SLATE_BRICKS = null;
    public static final Block SLATE_BRICKS_STAIRS = null;
    public static final Block SLATE_BRICKS_SLAB = null;
    public static final Block SLATE_BRICKS_WALL = null;
    public static final Block SLATE_BRICKS_PRESSURE_PLATE = null;

    public static final Block TERRACOTTA_BRICKS = null;
    public static final Block TERRACOTTA_BRICKS_STAIRS = null;
    public static final Block TERRACOTTA_BRICKS_SLAB = null;
    public static final Block TERRACOTTA_BRICKS_WALL = null;
    public static final Block TERRACOTTA_BRICKS_PRESSURE_PLATE = null;

    public static final Block WEARED_BRICKS = null;
    public static final Block WEARED_BRICKS_STAIRS = null;
    public static final Block WEARED_BRICKS_SLAB = null;
    public static final Block WEARED_BRICKS_WALL = null;
    public static final Block WEARED_BRICKS_PRESSURE_PLATE = null;

    public static final Block MARBLE_BRICKS = null;
    public static final Block MARBLE_BRICKS_STAIRS = null;
    public static final Block MARBLE_BRICKS_SLAB = null;
    public static final Block MARBLE_BRICKS_WALL = null;
    public static final Block MARBLE_BRICKS_PRESSURE_PLATE = null;

    public static final Block GNEISS_BRICKS = null;
    public static final Block GNEISS_BRICKS_STAIRS = null;
    public static final Block GNEISS_BRICKS_SLAB = null;
    public static final Block GNEISS_BRICKS_WALL = null;
    public static final Block GNEISS_BRICKS_PRESSURE_PLATE = null;

    public static final Block JADE_BRICKS = null;
    public static final Block JADE_BRICKS_STAIRS = null;
    public static final Block JADE_BRICKS_SLAB = null;
    public static final Block JADE_BRICKS_WALL = null;
    public static final Block JADE_BRICKS_PRESSURE_PLATE = null;

    public static final Block LARVIKITE_BRICKS = null;
    public static final Block LARVIKITE_BRICKS_STAIRS = null;
    public static final Block LARVIKITE_BRICKS_SLAB = null;
    public static final Block LARVIKITE_BRICKS_WALL = null;
    public static final Block LARVIKITE_BRICKS_PRESSURE_PLATE = null;

    // Large bricks

    public static final Block BASALT_LARGE_BRICKS = null;
    public static final Block BASALT_LARGE_BRICKS_STAIRS = null;
    public static final Block BASALT_LARGE_BRICKS_SLAB = null;
    public static final Block BASALT_LARGE_BRICKS_WALL = null;
    public static final Block BASALT_LARGE_BRICKS_PRESSURE_PLATE = null;

    public static final Block DIORITE_LARGE_BRICKS = null;
    public static final Block DIORITE_LARGE_BRICKS_STAIRS = null;
    public static final Block DIORITE_LARGE_BRICKS_SLAB = null;
    public static final Block DIORITE_LARGE_BRICKS_WALL = null;
    public static final Block DIORITE_LARGE_BRICKS_PRESSURE_PLATE = null;

    public static final Block DARK_LARGE_BRICKS = null;
    public static final Block DARK_LARGE_BRICKS_STAIRS = null;
    public static final Block DARK_LARGE_BRICKS_SLAB = null;
    public static final Block DARK_LARGE_BRICKS_WALL = null;
    public static final Block DARK_LARGE_BRICKS_PRESSURE_PLATE = null;

    public static final Block MARBLE_LARGE_BRICKS = null;
    public static final Block MARBLE_LARGE_BRICKS_STAIRS = null;
    public static final Block MARBLE_LARGE_BRICKS_SLAB = null;
    public static final Block MARBLE_LARGE_BRICKS_WALL = null;
    public static final Block MARBLE_LARGE_BRICKS_PRESSURE_PLATE = null;

    public static final Block OLD_LARGE_BRICKS = null;
    public static final Block OLD_LARGE_BRICKS_STAIRS = null;
    public static final Block OLD_LARGE_BRICKS_SLAB = null;
    public static final Block OLD_LARGE_BRICKS_WALL = null;
    public static final Block OLD_LARGE_BRICKS_PRESSURE_PLATE = null;

    public static final Block SANDSTONE_LARGE_BRICKS = null;
    public static final Block SANDSTONE_LARGE_BRICKS_STAIRS = null;
    public static final Block SANDSTONE_LARGE_BRICKS_SLAB = null;
    public static final Block SANDSTONE_LARGE_BRICKS_WALL = null;
    public static final Block SANDSTONE_LARGE_BRICKS_PRESSURE_PLATE = null;

    public static final Block SLATE_LARGE_BRICKS = null;
    public static final Block SLATE_LARGE_BRICKS_STAIRS = null;
    public static final Block SLATE_LARGE_BRICKS_SLAB = null;
    public static final Block SLATE_LARGE_BRICKS_WALL = null;
    public static final Block SLATE_LARGE_BRICKS_PRESSURE_PLATE = null;

    public static final Block TERRACOTTA_LARGE_BRICKS = null;
    public static final Block TERRACOTTA_LARGE_BRICKS_STAIRS = null;
    public static final Block TERRACOTTA_LARGE_BRICKS_SLAB = null;
    public static final Block TERRACOTTA_LARGE_BRICKS_WALL = null;
    public static final Block TERRACOTTA_LARGE_BRICKS_PRESSURE_PLATE = null;

    public static final Block WEARED_LARGE_BRICKS = null;
    public static final Block WEARED_LARGE_BRICKS_STAIRS = null;
    public static final Block WEARED_LARGE_BRICKS_SLAB = null;
    public static final Block WEARED_LARGE_BRICKS_WALL = null;
    public static final Block WEARED_LARGE_BRICKS_PRESSURE_PLATE = null;

    public static final Block GNEISS_LARGE_BRICKS = null;
    public static final Block GNEISS_LARGE_BRICKS_STAIRS = null;
    public static final Block GNEISS_LARGE_BRICKS_SLAB = null;
    public static final Block GNEISS_LARGE_BRICKS_WALL = null;
    public static final Block GNEISS_LARGE_BRICKS_PRESSURE_PLATE = null;

    public static final Block JADE_LARGE_BRICKS = null;
    public static final Block JADE_LARGE_BRICKS_STAIRS = null;
    public static final Block JADE_LARGE_BRICKS_SLAB = null;
    public static final Block JADE_LARGE_BRICKS_WALL = null;
    public static final Block JADE_LARGE_BRICKS_PRESSURE_PLATE = null;

    public static final Block LARVIKITE_LARGE_BRICKS = null;
    public static final Block LARVIKITE_LARGE_BRICKS_STAIRS = null;
    public static final Block LARVIKITE_LARGE_BRICKS_SLAB = null;
    public static final Block LARVIKITE_LARGE_BRICKS_WALL = null;
    public static final Block LARVIKITE_LARGE_BRICKS_PRESSURE_PLATE = null;

    // Paving

    public static final Block CONCRETE_PAVING = null;
    public static final Block CONCRETE_PAVING_STAIRS = null;
    public static final Block CONCRETE_PAVING_SLAB = null;
    public static final Block CONCRETE_PAVING_PRESSURE_PLATE = null;
    public static final Block CONCRETE_PAVING_WALL = null;

    public static final Block DAMAGED_PAVING = null;
    public static final Block DAMAGED_PAVING_STAIRS = null;
    public static final Block DAMAGED_PAVING_SLAB = null;
    public static final Block DAMAGED_PAVING_PRESSURE_PLATE = null;
    public static final Block DAMAGED_PAVING_WALL = null;

    public static final Block DARK_CONCRETE_PAVING = null;
    public static final Block DARK_CONCRETE_PAVING_STAIRS = null;
    public static final Block DARK_CONCRETE_PAVING_SLAB = null;
    public static final Block DARK_CONCRETE_PAVING_PRESSURE_PLATE = null;
    public static final Block DARK_CONCRETE_PAVING_WALL = null;

    public static final Block DIORITE_PAVING = null;
    public static final Block DIORITE_PAVING_STAIRS = null;
    public static final Block DIORITE_PAVING_SLAB = null;
    public static final Block DIORITE_PAVING_PRESSURE_PLATE = null;
    public static final Block DIORITE_PAVING_WALL = null;

    public static final Block MOIST_PAVING = null;
    public static final Block MOIST_PAVING_STAIRS = null;
    public static final Block MOIST_PAVING_SLAB = null;
    public static final Block MOIST_PAVING_PRESSURE_PLATE = null;
    public static final Block MOIST_PAVING_WALL = null;

    public static final Block POLISHED_PAVING = null;
    public static final Block POLISHED_PAVING_STAIRS = null;
    public static final Block POLISHED_PAVING_SLAB = null;
    public static final Block POLISHED_PAVING_PRESSURE_PLATE = null;
    public static final Block POLISHED_PAVING_WALL = null;

    public static final Block SLATE_PAVING = null;
    public static final Block SLATE_PAVING_STAIRS = null;
    public static final Block SLATE_PAVING_SLAB = null;
    public static final Block SLATE_PAVING_PRESSURE_PLATE = null;
    public static final Block SLATE_PAVING_WALL = null;

    public static final Block WHITE_CONCRETE_PAVING = null;
    public static final Block WHITE_CONCRETE_PAVING_STAIRS = null;
    public static final Block WHITE_CONCRETE_PAVING_SLAB = null;
    public static final Block WHITE_CONCRETE_PAVING_PRESSURE_PLATE = null;
    public static final Block WHITE_CONCRETE_PAVING_WALL = null;

    public static final Block GNEISS_PAVING = null;
    public static final Block GNEISS_PAVING_STAIRS = null;
    public static final Block GNEISS_PAVING_SLAB = null;
    public static final Block GNEISS_PAVING_WALL = null;
    public static final Block GNEISS_PAVING_PRESSURE_PLATE = null;

    public static final Block JADE_PAVING = null;
    public static final Block JADE_PAVING_STAIRS = null;
    public static final Block JADE_PAVING_SLAB = null;
    public static final Block JADE_PAVING_WALL = null;
    public static final Block JADE_PAVING_PRESSURE_PLATE = null;

    public static final Block LARVIKITE_PAVING = null;
    public static final Block LARVIKITE_PAVING_STAIRS = null;
    public static final Block LARVIKITE_PAVING_SLAB = null;
    public static final Block LARVIKITE_PAVING_WALL = null;
    public static final Block LARVIKITE_PAVING_PRESSURE_PLATE = null;

    // Tiles

    public static final Block CONCRETE_TILES = null;
    public static final Block CONCRETE_TILES_STAIRS = null;
    public static final Block CONCRETE_TILES_SLAB = null;
    public static final Block CONCRETE_TILES_PRESSURE_PLATE = null;
    public static final Block CONCRETE_TILES_WALL = null;

    public static final Block SKYBLUE_TILES = null;
    public static final Block SKYBLUE_TILES_STAIRS = null;
    public static final Block SKYBLUE_TILES_SLAB = null;
    public static final Block SKYBLUE_TILES_PRESSURE_PLATE = null;
    public static final Block SKYBLUE_TILES_WALL = null;

    public static final Block ORANGE_TILES = null;
    public static final Block ORANGE_TILES_STAIRS = null;
    public static final Block ORANGE_TILES_SLAB = null;
    public static final Block ORANGE_TILES_PRESSURE_PLATE = null;
    public static final Block ORANGE_TILES_WALL = null;

    public static final Block BLUE_TILES = null;
    public static final Block BLUE_TILES_STAIRS = null;
    public static final Block BLUE_TILES_SLAB = null;
    public static final Block BLUE_TILES_PRESSURE_PLATE = null;
    public static final Block BLUE_TILES_WALL = null;

    public static final Block LIGHT_BLUE_TILES = null;
    public static final Block LIGHT_BLUE_TILES_STAIRS = null;
    public static final Block LIGHT_BLUE_TILES_SLAB = null;
    public static final Block LIGHT_BLUE_TILES_PRESSURE_PLATE = null;
    public static final Block LIGHT_BLUE_TILES_WALL = null;

    public static final Block RED_TILES = null;
    public static final Block RED_TILES_STAIRS = null;
    public static final Block RED_TILES_SLAB = null;
    public static final Block RED_TILES_PRESSURE_PLATE = null;
    public static final Block RED_TILES_WALL = null;

    public static final Block WHITE_TILES = null;
    public static final Block WHITE_TILES_STAIRS = null;
    public static final Block WHITE_TILES_SLAB = null;
    public static final Block WHITE_TILES_PRESSURE_PLATE = null;
    public static final Block WHITE_TILES_WALL = null;

    public static final Block YELLOW_TILES = null;
    public static final Block YELLOW_TILES_STAIRS = null;
    public static final Block YELLOW_TILES_SLAB = null;
    public static final Block YELLOW_TILES_PRESSURE_PLATE = null;
    public static final Block YELLOW_TILES_WALL = null;

    public static final Block YELLOW_GREY_TILES = null;
    public static final Block YELLOW_GREY_TILES_STAIRS = null;
    public static final Block YELLOW_GREY_TILES_SLAB = null;
    public static final Block YELLOW_GREY_TILES_PRESSURE_PLATE = null;
    public static final Block YELLOW_GREY_TILES_WALL = null;

    // Wallpaper

    public static final Block WHITE_BLUE_WALLPAPER = null;
    public static final Block WHITE_BLUE_WALLPAPER_STAIRS = null;
    public static final Block WHITE_BLUE_WALLPAPER_SLAB = null;
    public static final Block WHITE_BLUE_WALLPAPER_PLINTH = null;

    public static final Block BEIGE_WALLPAPER = null;
    public static final Block BEIGE_WALLPAPER_STAIRS = null;
    public static final Block BEIGE_WALLPAPER_SLAB = null;
    public static final Block BEIGE_WALLPAPER_PLINTH = null;

    public static final Block PINK_WALLPAPER = null;
    public static final Block PINK_WALLPAPER_STAIRS = null;
    public static final Block PINK_WALLPAPER_SLAB = null;
    public static final Block PINK_WALLPAPER_PLINTH = null;

    public static final Block BEIGE_FLOWER_WALLPAPER = null;
    public static final Block BEIGE_FLOWER_WALLPAPER_STAIRS = null;
    public static final Block BEIGE_FLOWER_WALLPAPER_SLAB = null;
    public static final Block BEIGE_FLOWER_WALLPAPER_PLINTH = null;

    public static final Block WHITE_GREEN_WALLPAPER = null;
    public static final Block WHITE_GREEN_WALLPAPER_STAIRS = null;
    public static final Block WHITE_GREEN_WALLPAPER_SLAB = null;
    public static final Block WHITE_GREEN_WALLPAPER_PLINTH = null;

    // Metal

    public static final Block STEEL_BLOCK = null;

    public static final Block DARK_METAL_FLOOR = null;
    public static final Block DARK_METAL_FLOOR_STAIRS = null;
    public static final Block DARK_METAL_FLOOR_SLAB = null;
    public static final Block DARK_METAL_FLOOR_WALL = null;
    public static final Block DARK_METAL_FLOOR_PRESSURE_PLATE = null;

    public static final Block LIGHT_METAL_FLOOR = null;
    public static final Block LIGHT_METAL_FLOOR_STAIRS = null;
    public static final Block LIGHT_METAL_FLOOR_SLAB = null;
    public static final Block LIGHT_METAL_FLOOR_WALL = null;
    public static final Block LIGHT_METAL_FLOOR_PRESSURE_PLATE = null;

    public static final Block RUSTY_PLATE = null;
    public static final Block RUSTY_PLATE_STAIRS = null;
    public static final Block RUSTY_PLATE_SLAB = null;
    public static final Block RUSTY_PLATE_WALL = null;
    public static final Block RUSTY_PLATE_PRESSURE_PLATE = null;

    public static final Block IRON_BEAM = null;
    public static final Block BOLTED_IRON_BEAM = null;
    public static final Block IRON_BEAM_JUNCTION = null;

    public static final Block STEEL_BEAM = null;
    public static final Block BOLTED_STEEL_BEAM = null;
    public static final Block STEEL_BEAM_JUNCTION = null;

    public static final Block AIR_DUCT = null;
    public static final Block VENT_AIR_DUCT = null;
    public static final Block GRID_AIR_DUCT = null;

    public static final Block PURPLE_CORRUGATED_METAL_PLATE = null;
    public static final Block PURPLE_CORRUGATED_METAL_PLATE_STAIRS = null;
    public static final Block PURPLE_CORRUGATED_METAL_PLATE_SLAB = null;
    public static final Block PURPLE_CORRUGATED_METAL_PLATE_WALL = null;
    public static final Block PURPLE_CORRUGATED_METAL_PLATE_PRESSURE_PLATE = null;

    public static final Block RED_CORRUGATED_METAL_PLATE = null;
    public static final Block RED_CORRUGATED_METAL_PLATE_STAIRS = null;
    public static final Block RED_CORRUGATED_METAL_PLATE_SLAB = null;
    public static final Block RED_CORRUGATED_METAL_PLATE_WALL = null;
    public static final Block RED_CORRUGATED_METAL_PLATE_PRESSURE_PLATE = null;

    public static final Block WHITE_CORRUGATED_METAL_PLATE = null;
    public static final Block WHITE_CORRUGATED_METAL_PLATE_STAIRS = null;
    public static final Block WHITE_CORRUGATED_METAL_PLATE_SLAB = null;
    public static final Block WHITE_CORRUGATED_METAL_PLATE_WALL = null;
    public static final Block WHITE_CORRUGATED_METAL_PLATE_PRESSURE_PLATE = null;

    public static final Block YELLOW_CORRUGATED_METAL_PLATE = null;
    public static final Block YELLOW_CORRUGATED_METAL_PLATE_STAIRS = null;
    public static final Block YELLOW_CORRUGATED_METAL_PLATE_SLAB = null;
    public static final Block YELLOW_CORRUGATED_METAL_PLATE_WALL = null;
    public static final Block YELLOW_CORRUGATED_METAL_PLATE_PRESSURE_PLATE = null;

    public static final Block BLACK_CORRUGATED_METAL_PLATE = null;
    public static final Block BLACK_CORRUGATED_METAL_PLATE_STAIRS = null;
    public static final Block BLACK_CORRUGATED_METAL_PLATE_SLAB = null;
    public static final Block BLACK_CORRUGATED_METAL_PLATE_WALL = null;
    public static final Block BLACK_CORRUGATED_METAL_PLATE_PRESSURE_PLATE = null;

    public static final Block BLUE_CORRUGATED_METAL_PLATE = null;
    public static final Block BLUE_CORRUGATED_METAL_PLATE_STAIRS = null;
    public static final Block BLUE_CORRUGATED_METAL_PLATE_SLAB = null;
    public static final Block BLUE_CORRUGATED_METAL_PLATE_WALL = null;
    public static final Block BLUE_CORRUGATED_METAL_PLATE_PRESSURE_PLATE = null;

    public static final Block BROWN_CORRUGATED_METAL_PLATE = null;
    public static final Block BROWN_CORRUGATED_METAL_PLATE_STAIRS = null;
    public static final Block BROWN_CORRUGATED_METAL_PLATE_SLAB = null;
    public static final Block BROWN_CORRUGATED_METAL_PLATE_WALL = null;
    public static final Block BROWN_CORRUGATED_METAL_PLATE_PRESSURE_PLATE = null;

    public static final Block CYAN_CORRUGATED_METAL_PLATE = null;
    public static final Block CYAN_CORRUGATED_METAL_PLATE_STAIRS = null;
    public static final Block CYAN_CORRUGATED_METAL_PLATE_SLAB = null;
    public static final Block CYAN_CORRUGATED_METAL_PLATE_WALL = null;
    public static final Block CYAN_CORRUGATED_METAL_PLATE_PRESSURE_PLATE = null;

    public static final Block GRAY_CORRUGATED_METAL_PLATE = null;
    public static final Block GRAY_CORRUGATED_METAL_PLATE_STAIRS = null;
    public static final Block GRAY_CORRUGATED_METAL_PLATE_SLAB = null;
    public static final Block GRAY_CORRUGATED_METAL_PLATE_WALL = null;
    public static final Block GRAY_CORRUGATED_METAL_PLATE_PRESSURE_PLATE = null;

    public static final Block GREEN_CORRUGATED_METAL_PLATE = null;
    public static final Block GREEN_CORRUGATED_METAL_PLATE_STAIRS = null;
    public static final Block GREEN_CORRUGATED_METAL_PLATE_SLAB = null;
    public static final Block GREEN_CORRUGATED_METAL_PLATE_WALL = null;
    public static final Block GREEN_CORRUGATED_METAL_PLATE_PRESSURE_PLATE = null;

    public static final Block LIGHT_BLUE_CORRUGATED_METAL_PLATE = null;
    public static final Block LIGHT_BLUE_CORRUGATED_METAL_PLATE_STAIRS = null;
    public static final Block LIGHT_BLUE_CORRUGATED_METAL_PLATE_SLAB = null;
    public static final Block LIGHT_BLUE_CORRUGATED_METAL_PLATE_WALL = null;
    public static final Block LIGHT_BLUE_CORRUGATED_METAL_PLATE_PRESSURE_PLATE = null;

    public static final Block LIGHT_GRAY_CORRUGATED_METAL_PLATE = null;
    public static final Block LIGHT_GRAY_CORRUGATED_METAL_PLATE_STAIRS = null;
    public static final Block LIGHT_GRAY_CORRUGATED_METAL_PLATE_SLAB = null;
    public static final Block LIGHT_GRAY_CORRUGATED_METAL_PLATE_WALL = null;
    public static final Block LIGHT_GRAY_CORRUGATED_METAL_PLATE_PRESSURE_PLATE = null;

    public static final Block LIME_CORRUGATED_METAL_PLATE = null;
    public static final Block LIME_CORRUGATED_METAL_PLATE_STAIRS = null;
    public static final Block LIME_CORRUGATED_METAL_PLATE_SLAB = null;
    public static final Block LIME_CORRUGATED_METAL_PLATE_WALL = null;
    public static final Block LIME_CORRUGATED_METAL_PLATE_PRESSURE_PLATE = null;

    public static final Block MAGENTA_CORRUGATED_METAL_PLATE = null;
    public static final Block MAGENTA_CORRUGATED_METAL_PLATE_STAIRS = null;
    public static final Block MAGENTA_CORRUGATED_METAL_PLATE_SLAB = null;
    public static final Block MAGENTA_CORRUGATED_METAL_PLATE_WALL = null;
    public static final Block MAGENTA_CORRUGATED_METAL_PLATE_PRESSURE_PLATE = null;

    public static final Block ORANGE_CORRUGATED_METAL_PLATE = null;
    public static final Block ORANGE_CORRUGATED_METAL_PLATE_STAIRS = null;
    public static final Block ORANGE_CORRUGATED_METAL_PLATE_SLAB = null;
    public static final Block ORANGE_CORRUGATED_METAL_PLATE_WALL = null;
    public static final Block ORANGE_CORRUGATED_METAL_PLATE_PRESSURE_PLATE = null;

    public static final Block PINK_CORRUGATED_METAL_PLATE = null;
    public static final Block PINK_CORRUGATED_METAL_PLATE_STAIRS = null;
    public static final Block PINK_CORRUGATED_METAL_PLATE_SLAB = null;
    public static final Block PINK_CORRUGATED_METAL_PLATE_WALL = null;
    public static final Block PINK_CORRUGATED_METAL_PLATE_PRESSURE_PLATE = null;

    public static final Block BULKHEAD = null;
    public static final Block BULKHEAD_TOP = null;

    public static final Block STEEL_WALL_LADDER = null;
    public static final Block RUSTY_WALL_LADDER = null;
    public static final Block STEEL_RUNGS = null;
    public static final Block RUSTY_RUNGS = null;

    // Concrete

    public static final Block CONCRETE = null;
    public static final Block CONCRETE_STAIRS = null;
    public static final Block CONCRETE_SLAB = null;
    public static final Block CONCRETE_WALL = null;
    public static final Block CONCRETE_PRESSURE_PLATE = null;

    // Furniture

    public static final Block OAK_CHAIR = null;
    public static final Block DARK_OAK_CHAIR = null;
    public static final Block BIRCH_CHAIR = null;
    public static final Block JUNGLE_CHAIR = null;
    public static final Block SPRUCE_CHAIR = null;
    public static final Block ACACIA_CHAIR = null;

    public static final Block METALLIC_TERRACE_TABLE = null;
    public static final Block OAK_TERRACE_TABLE = null;
    public static final Block BIRCH_TERRACE_TABLE = null;
    public static final Block SPRUCE_TERRACE_TABLE = null;
    public static final Block JUNGLE_TERRACE_TABLE = null;
    public static final Block DARK_OAK_TERRACE_TABLE = null;
    public static final Block ACACIA_TERRACE_TABLE = null;

    public static final Block METALLIC_TERRACE_CHAIR = null;
    public static final Block OAK_TERRACE_CHAIR = null;
    public static final Block DARK_OAK_TERRACE_CHAIR = null;
    public static final Block BIRCH_TERRACE_CHAIR = null;
    public static final Block SPRUCE_TERRACE_CHAIR = null;
    public static final Block JUNGLE_TERRACE_CHAIR = null;
    public static final Block ACACIA_TERRACE_CHAIR = null;

    public static final Block OAK_TABLE = null;
    public static final Block DARK_OAK_TABLE = null;
    public static final Block BIRCH_TABLE = null;
    public static final Block JUNGLE_TABLE = null;
    public static final Block SPRUCE_TABLE = null;
    public static final Block ACACIA_TABLE = null;

    public static final Block OAK_FANCY_TABLE = null;
    public static final Block DARK_OAK_FANCY_TABLE = null;
    public static final Block BIRCH_FANCY_TABLE = null;
    public static final Block JUNGLE_FANCY_TABLE = null;
    public static final Block SPRUCE_FANCY_TABLE = null;
    public static final Block ACACIA_FANCY_TABLE = null;

    public static final Block PLATE = null;

    public static final Block BLACK_COUCH = null;
    public static final Block BLUE_COUCH = null;
    public static final Block BROWN_COUCH = null;
    public static final Block CYAN_COUCH = null;
    public static final Block GRAY_COUCH = null;
    public static final Block GREEN_COUCH = null;
    public static final Block LIGHT_BLUE_COUCH = null;
    public static final Block LIGHT_GRAY_COUCH = null;
    public static final Block LIME_COUCH = null;
    public static final Block MAGENTA_COUCH = null;
    public static final Block ORANGE_COUCH = null;
    public static final Block PINK_COUCH = null;
    public static final Block PURPLE_COUCH = null;
    public static final Block RED_COUCH = null;
    public static final Block WHITE_COUCH = null;
    public static final Block YELLOW_COUCH = null;

    public static final Block BLUE_TABLE_LAMP = null;
    public static final Block BLACK_TABLE_LAMP = null;
    public static final Block BROWN_TABLE_LAMP = null;
    public static final Block CYAN_TABLE_LAMP = null;
    public static final Block GRAY_TABLE_LAMP = null;
    public static final Block GREEN_TABLE_LAMP = null;
    public static final Block LIGHT_BLUE_TABLE_LAMP = null;
    public static final Block LIGHT_GRAY_TABLE_LAMP = null;
    public static final Block LIME_TABLE_LAMP = null;
    public static final Block MAGENTA_TABLE_LAMP = null;
    public static final Block ORANGE_TABLE_LAMP = null;
    public static final Block PINK_TABLE_LAMP = null;
    public static final Block PURPLE_TABLE_LAMP = null;
    public static final Block RED_TABLE_LAMP = null;
    public static final Block WHITE_TABLE_LAMP = null;
    public static final Block YELLOW_TABLE_LAMP = null;

    public static final Block BROWN_OAK_FANCY_BED = null;
    public static final Block BLACK_OAK_FANCY_BED = null;
    public static final Block BLUE_OAK_FANCY_BED = null;
    public static final Block CYAN_OAK_FANCY_BED = null;
    public static final Block GRAY_OAK_FANCY_BED = null;
    public static final Block GREEN_OAK_FANCY_BED = null;
    public static final Block LIGHT_BLUE_OAK_FANCY_BED = null;
    public static final Block LIGHT_GRAY_OAK_FANCY_BED = null;
    public static final Block LIME_OAK_FANCY_BED = null;
    public static final Block MAGENTA_OAK_FANCY_BED = null;
    public static final Block ORANGE_OAK_FANCY_BED = null;
    public static final Block PINK_OAK_FANCY_BED = null;
    public static final Block PURPLE_OAK_FANCY_BED = null;
    public static final Block RED_OAK_FANCY_BED = null;
    public static final Block WHITE_OAK_FANCY_BED = null;
    public static final Block YELLOW_OAK_FANCY_BED = null;

    public static final Block BROWN_BIRCH_FANCY_BED = null;
    public static final Block BLACK_BIRCH_FANCY_BED = null;
    public static final Block BLUE_BIRCH_FANCY_BED = null;
    public static final Block CYAN_BIRCH_FANCY_BED = null;
    public static final Block GRAY_BIRCH_FANCY_BED = null;
    public static final Block GREEN_BIRCH_FANCY_BED = null;
    public static final Block LIGHT_BLUE_BIRCH_FANCY_BED = null;
    public static final Block LIGHT_GRAY_BIRCH_FANCY_BED = null;
    public static final Block LIME_BIRCH_FANCY_BED = null;
    public static final Block MAGENTA_BIRCH_FANCY_BED = null;
    public static final Block ORANGE_BIRCH_FANCY_BED = null;
    public static final Block PINK_BIRCH_FANCY_BED = null;
    public static final Block PURPLE_BIRCH_FANCY_BED = null;
    public static final Block RED_BIRCH_FANCY_BED = null;
    public static final Block WHITE_BIRCH_FANCY_BED = null;
    public static final Block YELLOW_BIRCH_FANCY_BED = null;

    public static final Block BROWN_SPRUCE_FANCY_BED = null;
    public static final Block BLACK_SPRUCE_FANCY_BED = null;
    public static final Block BLUE_SPRUCE_FANCY_BED = null;
    public static final Block CYAN_SPRUCE_FANCY_BED = null;
    public static final Block GRAY_SPRUCE_FANCY_BED = null;
    public static final Block GREEN_SPRUCE_FANCY_BED = null;
    public static final Block LIGHT_BLUE_SPRUCE_FANCY_BED = null;
    public static final Block LIGHT_GRAY_SPRUCE_FANCY_BED = null;
    public static final Block LIME_SPRUCE_FANCY_BED = null;
    public static final Block MAGENTA_SPRUCE_FANCY_BED = null;
    public static final Block ORANGE_SPRUCE_FANCY_BED = null;
    public static final Block PINK_SPRUCE_FANCY_BED = null;
    public static final Block PURPLE_SPRUCE_FANCY_BED = null;
    public static final Block RED_SPRUCE_FANCY_BED = null;
    public static final Block WHITE_SPRUCE_FANCY_BED = null;
    public static final Block YELLOW_SPRUCE_FANCY_BED = null;

    public static final Block BROWN_JUNGLE_FANCY_BED = null;
    public static final Block BLACK_JUNGLE_FANCY_BED = null;
    public static final Block BLUE_JUNGLE_FANCY_BED = null;
    public static final Block CYAN_JUNGLE_FANCY_BED = null;
    public static final Block GRAY_JUNGLE_FANCY_BED = null;
    public static final Block GREEN_JUNGLE_FANCY_BED = null;
    public static final Block LIGHT_BLUE_JUNGLE_FANCY_BED = null;
    public static final Block LIGHT_GRAY_JUNGLE_FANCY_BED = null;
    public static final Block LIME_JUNGLE_FANCY_BED = null;
    public static final Block MAGENTA_JUNGLE_FANCY_BED = null;
    public static final Block ORANGE_JUNGLE_FANCY_BED = null;
    public static final Block PINK_JUNGLE_FANCY_BED = null;
    public static final Block PURPLE_JUNGLE_FANCY_BED = null;
    public static final Block RED_JUNGLE_FANCY_BED = null;
    public static final Block WHITE_JUNGLE_FANCY_BED = null;
    public static final Block YELLOW_JUNGLE_FANCY_BED = null;

    public static final Block BROWN_DARK_OAK_FANCY_BED = null;
    public static final Block BLACK_DARK_OAK_FANCY_BED = null;
    public static final Block BLUE_DARK_OAK_FANCY_BED = null;
    public static final Block CYAN_DARK_OAK_FANCY_BED = null;
    public static final Block GRAY_DARK_OAK_FANCY_BED = null;
    public static final Block GREEN_DARK_OAK_FANCY_BED = null;
    public static final Block LIGHT_BLUE_DARK_OAK_FANCY_BED = null;
    public static final Block LIGHT_GRAY_DARK_OAK_FANCY_BED = null;
    public static final Block LIME_DARK_OAK_FANCY_BED = null;
    public static final Block MAGENTA_DARK_OAK_FANCY_BED = null;
    public static final Block ORANGE_DARK_OAK_FANCY_BED = null;
    public static final Block PINK_DARK_OAK_FANCY_BED = null;
    public static final Block PURPLE_DARK_OAK_FANCY_BED = null;
    public static final Block RED_DARK_OAK_FANCY_BED = null;
    public static final Block WHITE_DARK_OAK_FANCY_BED = null;
    public static final Block YELLOW_DARK_OAK_FANCY_BED = null;

    public static final Block BROWN_ACACIA_FANCY_BED = null;
    public static final Block BLACK_ACACIA_FANCY_BED = null;
    public static final Block BLUE_ACACIA_FANCY_BED = null;
    public static final Block CYAN_ACACIA_FANCY_BED = null;
    public static final Block GRAY_ACACIA_FANCY_BED = null;
    public static final Block GREEN_ACACIA_FANCY_BED = null;
    public static final Block LIGHT_BLUE_ACACIA_FANCY_BED = null;
    public static final Block LIGHT_GRAY_ACACIA_FANCY_BED = null;
    public static final Block LIME_ACACIA_FANCY_BED = null;
    public static final Block MAGENTA_ACACIA_FANCY_BED = null;
    public static final Block ORANGE_ACACIA_FANCY_BED = null;
    public static final Block PINK_ACACIA_FANCY_BED = null;
    public static final Block PURPLE_ACACIA_FANCY_BED = null;
    public static final Block RED_ACACIA_FANCY_BED = null;
    public static final Block WHITE_ACACIA_FANCY_BED = null;
    public static final Block YELLOW_ACACIA_FANCY_BED = null;

    public static List<Block> FANCY_BEDS = new ArrayList<>();
    public static List<Block> FANCY_BEDS_TEISR = new ArrayList<>();

    public static final Block BROWN_PILLOW = null;
    public static final Block BLACK_PILLOW = null;
    public static final Block BLUE_PILLOW = null;
    public static final Block CYAN_PILLOW = null;
    public static final Block GRAY_PILLOW = null;
    public static final Block GREEN_PILLOW = null;
    public static final Block LIGHT_BLUE_PILLOW = null;
    public static final Block LIGHT_GRAY_PILLOW = null;
    public static final Block LIME_PILLOW = null;
    public static final Block MAGENTA_PILLOW = null;
    public static final Block ORANGE_PILLOW = null;
    public static final Block PINK_PILLOW = null;
    public static final Block PURPLE_PILLOW = null;
    public static final Block RED_PILLOW = null;
    public static final Block WHITE_PILLOW = null;
    public static final Block YELLOW_PILLOW = null;

    // Doors

    public static final Block OAK_FANCY_DOOR = null;
    public static final Block BIRCH_FANCY_DOOR = null;
    public static final Block SPRUCE_FANCY_DOOR = null;
    public static final Block JUNGLE_FANCY_DOOR = null;
    public static final Block DARK_OAK_FANCY_DOOR = null;
    public static final Block ACACIA_FANCY_DOOR = null;

    public static final Block STEEL_DOOR = null;
    public static final Block STURDY_STEEL_DOOR = null;
    public static final Block WARNING_STEEL_DOOR = null;
    public static final Block WHITE_STEEL_DOOR = null;
    public static final Block STURDY_WHITE_STEEL_DOOR = null;
    public static final Block WARNING_WHITE_STEEL_DOOR = null;
    public static final Block RUSTY_DOOR = null;
    public static final Block STURDY_RUSTY_DOOR = null;
    public static final Block WARNING_RUSTY_DOOR = null;

    // Stairs

    public static final Block STEEL_SUSPENDED_STAIRS = null;
    public static final Block OAK_SUSPENDED_STAIRS = null;
    public static final Block BIRCH_SUSPENDED_STAIRS = null;
    public static final Block SPRUCE_SUSPENDED_STAIRS = null;
    public static final Block JUNGLE_SUSPENDED_STAIRS = null;
    public static final Block DARK_OAK_SUSPENDED_STAIRS = null;
    public static final Block ACACIA_SUSPENDED_STAIRS = null;

    // Storage

    public static final Block OAK_FANCY_CHEST = null;
    public static final Block BIRCH_FANCY_CHEST = null;
    public static final Block SPRUCE_FANCY_CHEST = null;
    public static final Block JUNGLE_FANCY_CHEST = null;
    public static final Block DARK_OAK_FANCY_CHEST = null;
    public static final Block ACACIA_FANCY_CHEST = null;

    public static final Block LOCKER = null;

    public static final Block OAK_WOODEN_CRATE = null;
    public static final Block BIRCH_WOODEN_CRATE = null;
    public static final Block SPRUCE_WOODEN_CRATE = null;
    public static final Block JUNGLE_WOODEN_CRATE = null;
    public static final Block DARK_OAK_WOODEN_CRATE = null;
    public static final Block ACACIA_WOODEN_CRATE = null;

    // Lists

    public static List<Block> FANCY_CHESTS = new ArrayList<>();
    public static List<Block> RENDER_CUTOUT = new ArrayList<>(); // Contains all blocks using cutout render

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event)
    {
        // World

        createBlockWithVariants(event, "basalt", true, true, true, true, Material.ROCK, SoundType.STONE, ToolType.PICKAXE);
        createBlockWithVariants(event, "slate", true, true, true, true, Material.ROCK, SoundType.STONE, ToolType.PICKAXE);
        createBlockWithVariants(event, "marble", true, true, true, true, Material.ROCK, SoundType.STONE, ToolType.PICKAXE);
        createBlockWithVariants(event, "gneiss", true, true, true, true, Material.ROCK, SoundType.STONE, ToolType.PICKAXE);
        createBlockWithVariants(event, "jade", true, true, true, true, Material.ROCK, SoundType.STONE, ToolType.PICKAXE);
        createBlockWithVariants(event, "larvikite", true, true, true, true, Material.ROCK, SoundType.STONE, ToolType.PICKAXE);

        // Cobblestones

        createBlockWithVariants(event, "basalt_cobblestone", true, true, true, true, Material.ROCK, SoundType.STONE, ToolType.PICKAXE);
        createBlockWithVariants(event, "slate_cobblestone", true, true, true, true, Material.ROCK, SoundType.STONE, ToolType.PICKAXE);
        createBlockWithVariants(event, "marble_cobblestone", true, true, true, true, Material.ROCK, SoundType.STONE, ToolType.PICKAXE);
        createBlockWithVariants(event, "gneiss_cobblestone", true, true, true, true, Material.ROCK, SoundType.STONE, ToolType.PICKAXE);
        createBlockWithVariants(event, "jade_cobblestone", true, true, true, true, Material.ROCK, SoundType.STONE, ToolType.PICKAXE);
        createBlockWithVariants(event, "larvikite_cobblestone", true, true, true, true, Material.ROCK, SoundType.STONE, ToolType.PICKAXE);

        // Bricks

        createBlockWithVariants(event, "basalt_bricks", true, true, true, true, Material.ROCK, SoundType.STONE, ToolType.PICKAXE);
        createBlockWithVariants(event, "dark_bricks", true, true, true, true, Material.ROCK, SoundType.STONE, ToolType.PICKAXE);
        createBlockWithVariants(event, "diorite_bricks", true, true, true, true, Material.ROCK, SoundType.STONE, ToolType.PICKAXE);
        createBlockWithVariants(event, "old_bricks", true, true, true, true, Material.ROCK, SoundType.STONE, ToolType.PICKAXE);
        createBlockWithVariants(event, "sandstone_bricks", true, true, true, true, Material.ROCK, SoundType.STONE, ToolType.PICKAXE);
        createBlockWithVariants(event, "slate_bricks", true, true, true, true, Material.ROCK, SoundType.STONE, ToolType.PICKAXE);
        createBlockWithVariants(event, "terracotta_bricks", true, true, true, true, Material.ROCK, SoundType.STONE, ToolType.PICKAXE);
        createBlockWithVariants(event, "weared_bricks", true, true, true, true, Material.ROCK, SoundType.STONE, ToolType.PICKAXE);
        createBlockWithVariants(event, "marble_bricks", true, true, true, true, Material.ROCK, SoundType.STONE, ToolType.PICKAXE);
        createBlockWithVariants(event, "gneiss_bricks", true, true, true, true, Material.ROCK, SoundType.STONE, ToolType.PICKAXE);
        createBlockWithVariants(event, "jade_bricks", true, true, true, true, Material.ROCK, SoundType.STONE, ToolType.PICKAXE);
        createBlockWithVariants(event, "larvikite_bricks", true, true, true, true, Material.ROCK, SoundType.STONE, ToolType.PICKAXE);

        // Large bricks

        createBlockWithVariants(event, "basalt_large_bricks", true, true, true, true, Material.ROCK, SoundType.STONE, ToolType.PICKAXE);
        createBlockWithVariants(event, "diorite_large_bricks", true, true, true, true, Material.ROCK, SoundType.STONE, ToolType.PICKAXE);
        createBlockWithVariants(event, "dark_large_bricks", true, true, true, true, Material.ROCK, SoundType.STONE, ToolType.PICKAXE);
        createBlockWithVariants(event, "marble_large_bricks", true, true, true, true, Material.ROCK, SoundType.STONE, ToolType.PICKAXE);
        createBlockWithVariants(event, "old_large_bricks", true, true, true, true, Material.ROCK, SoundType.STONE, ToolType.PICKAXE);
        createBlockWithVariants(event, "sandstone_large_bricks", true, true, true, true, Material.ROCK, SoundType.STONE, ToolType.PICKAXE);
        createBlockWithVariants(event, "slate_large_bricks", true, true, true, true, Material.ROCK, SoundType.STONE, ToolType.PICKAXE);
        createBlockWithVariants(event, "terracotta_large_bricks", true, true, true, true, Material.ROCK, SoundType.STONE, ToolType.PICKAXE);
        createBlockWithVariants(event, "weared_large_bricks", true, true, true, true, Material.ROCK, SoundType.STONE, ToolType.PICKAXE);
        createBlockWithVariants(event, "gneiss_large_bricks", true, true, true, true, Material.ROCK, SoundType.STONE, ToolType.PICKAXE);
        createBlockWithVariants(event, "jade_large_bricks", true, true, true, true, Material.ROCK, SoundType.STONE, ToolType.PICKAXE);
        createBlockWithVariants(event, "larvikite_large_bricks", true, true, true, true, Material.ROCK, SoundType.STONE, ToolType.PICKAXE);

        // Paving

        createBlockWithVariants(event, "concrete_paving", true, true, true, true, Material.ROCK, SoundType.STONE, ToolType.PICKAXE);
        createBlockWithVariants(event, "damaged_paving", true, true, true, true, Material.ROCK, SoundType.STONE, ToolType.PICKAXE);
        createBlockWithVariants(event, "dark_concrete_paving", true, true, true, true, Material.ROCK, SoundType.STONE, ToolType.PICKAXE);
        createBlockWithVariants(event, "diorite_paving", true, true, true, true, Material.ROCK, SoundType.STONE, ToolType.PICKAXE);
        createBlockWithVariants(event, "moist_paving", true, true, true, true, Material.ROCK, SoundType.STONE, ToolType.PICKAXE);
        createBlockWithVariants(event, "polished_paving", true, true, true, true, Material.ROCK, SoundType.STONE, ToolType.PICKAXE);
        createBlockWithVariants(event, "slate_paving", true, true, true, true, Material.ROCK, SoundType.STONE, ToolType.PICKAXE);
        createBlockWithVariants(event, "white_concrete_paving", true, true, true, true, Material.ROCK, SoundType.STONE, ToolType.PICKAXE);
        createBlockWithVariants(event, "gneiss_paving", true, true, true, true, Material.ROCK, SoundType.STONE, ToolType.PICKAXE);
        createBlockWithVariants(event, "jade_paving", true, true, true, true, Material.ROCK, SoundType.STONE, ToolType.PICKAXE);
        createBlockWithVariants(event, "larvikite_paving", true, true, true, true, Material.ROCK, SoundType.STONE, ToolType.PICKAXE);

        // Tiles

        createBlockWithVariants(event, "concrete_tiles", true, true, true, true, Material.ROCK, SoundType.STONE, ToolType.PICKAXE);
        createBlockWithVariants(event, "skyblue_tiles", true, true, true, true, Material.ROCK, SoundType.STONE, ToolType.PICKAXE);
        createBlockWithVariants(event, "orange_tiles", true, true, true, true, Material.ROCK, SoundType.STONE, ToolType.PICKAXE);
        createBlockWithVariants(event, "blue_tiles", true, true, true, true, Material.ROCK, SoundType.STONE, ToolType.PICKAXE);
        createBlockWithVariants(event, "light_blue_tiles", true, true, true, true, Material.ROCK, SoundType.STONE, ToolType.PICKAXE);
        createBlockWithVariants(event, "red_tiles", true, true, true, true, Material.ROCK, SoundType.STONE, ToolType.PICKAXE);
        createBlockWithVariants(event, "white_tiles", true, true, true, true, Material.ROCK, SoundType.STONE, ToolType.PICKAXE);
        createBlockWithVariants(event, "yellow_tiles", true, true, true, true, Material.ROCK, SoundType.STONE, ToolType.PICKAXE);
        createBlockWithVariants(event, "yellow_grey_tiles", true, true, true, true, Material.ROCK, SoundType.STONE, ToolType.PICKAXE);

        // Wallpaper

        createBlockWithVariants(event, "white_blue_wallpaper", true, true, false, false, Material.ROCK, SoundType.STONE, ToolType.PICKAXE);
        event.getRegistry().register(
            new UpDownBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(0.5f).sound(SoundType.STONE), ToolType.PICKAXE).setRegistryName("white_blue_wallpaper_plinth"));
        createBlockWithVariants(event, "beige_wallpaper", true, true, false, false, Material.ROCK, SoundType.STONE, ToolType.PICKAXE);
        event.getRegistry().register(
            new UpDownBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(0.5f).sound(SoundType.STONE), ToolType.PICKAXE).setRegistryName("beige_wallpaper_plinth"));
        createBlockWithVariants(event, "pink_wallpaper", true, true, false, false, Material.ROCK, SoundType.STONE, ToolType.PICKAXE);
        event.getRegistry().register(
            new UpDownBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(0.5f).sound(SoundType.STONE), ToolType.PICKAXE).setRegistryName("pink_wallpaper_plinth"));
        createBlockWithVariants(event, "beige_flower_wallpaper", true, true, false, false, Material.ROCK, SoundType.STONE, ToolType.PICKAXE);
        event.getRegistry().register(
            new UpDownBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(0.5f).sound(SoundType.STONE), ToolType.PICKAXE).setRegistryName("beige_flower_wallpaper_plinth"));
        createBlockWithVariants(event, "white_green_wallpaper", true, true, false, false, Material.ROCK, SoundType.STONE, ToolType.PICKAXE);
        event.getRegistry().register(
            new UpDownBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(0.5f).sound(SoundType.STONE), ToolType.PICKAXE).setRegistryName("white_green_wallpaper_plinth"));

        // Metal

        event.getRegistry().register(
            new CustomBlock(Block.Properties.create(Material.IRON, MaterialColor.STONE).hardnessAndResistance(5.0F, 6.0F).sound(SoundType.LANTERN), ToolType.PICKAXE).setRegistryName("steel_block"));

        createBlockWithVariants(event, "dark_metal_floor", true, true, true, true, Material.IRON, SoundType.LANTERN, ToolType.PICKAXE);
        createBlockWithVariants(event, "light_metal_floor", true, true, true, true, Material.IRON, SoundType.LANTERN, ToolType.PICKAXE);
        createBlockWithVariants(event, "rusty_plate", true, true, true, true, Material.IRON, SoundType.LANTERN, ToolType.PICKAXE);

        event.getRegistry().register(
            new RotatedPillarBlock(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(0.8F).sound(SoundType.LANTERN)).setRegistryName("iron_beam"));
        event.getRegistry().register(
            new RotatedPillarBlock(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(0.8F).sound(SoundType.LANTERN)).setRegistryName("bolted_iron_beam"));
        createBlockWithVariants(event, "iron_beam_junction", false, false, false, false, Material.IRON, SoundType.LANTERN, ToolType.PICKAXE);
        event.getRegistry().register(
            new RotatedPillarBlock(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(0.8F).sound(SoundType.LANTERN)).setRegistryName("steel_beam"));
        event.getRegistry().register(
            new RotatedPillarBlock(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(0.8F).sound(SoundType.LANTERN)).setRegistryName("bolted_steel_beam"));
        createBlockWithVariants(event, "steel_beam_junction", false, false, false, false, Material.IRON, SoundType.LANTERN, ToolType.PICKAXE);

        createBlockWithVariants(event, "air_duct", false, false, false, false, Material.IRON, SoundType.LANTERN, ToolType.PICKAXE);
        event.getRegistry().register(
            new AllRotationBlock(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(0.8F).sound(SoundType.LANTERN)).setRegistryName("vent_air_duct"));
        event.getRegistry().register(
            new AllRotationBlock(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(0.8F).sound(SoundType.LANTERN)).setRegistryName("grid_air_duct"));

        createBlockWithVariants(event, "bulkhead", false, false, false, false, Material.IRON, SoundType.METAL, ToolType.PICKAXE);
        createBlockWithVariants(event, "bulkhead_top", false, false, false, false, Material.IRON, SoundType.METAL, ToolType.PICKAXE);

        event.getRegistry().register(
            new CustomLadderBlock(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(0.8F).sound(SoundType.LANTERN), ToolType.PICKAXE).setRegistryName(
                "steel_wall_ladder"));
        event.getRegistry().register(
            new CustomLadderBlock(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(0.8F).sound(SoundType.LANTERN), ToolType.PICKAXE).setRegistryName(
                "rusty_wall_ladder"));
        event.getRegistry().register(
            new CustomLadderBlock(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(0.8F).sound(SoundType.LANTERN), ToolType.PICKAXE).setRegistryName("steel_rungs"));
        event.getRegistry().register(
            new CustomLadderBlock(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(0.8F).sound(SoundType.LANTERN), ToolType.PICKAXE).setRegistryName("rusty_rungs"));

        // Concrete

        createBlockWithVariants(event, "concrete", true, true, true, true, Material.ROCK, SoundType.STONE, ToolType.PICKAXE);

        // Furniture

        Block block;

        for(int i = 0; i < 6; i++)
        {
            event.getRegistry().register(
                new ChairBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.75F, 0.5F).sound(SoundType.WOOD), ToolType.AXE).setRegistryName(WoodType.byId(i).getName() + "_chair"));
            event.getRegistry().register(block = new TerraceTableBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.75F, 0.5F).sound(SoundType.WOOD), ToolType.AXE).setRegistryName(
                WoodType.byId(i).getName() + "_terrace_table"));
            RENDER_CUTOUT.add(block);
            event.getRegistry().register(block = new TerraceChairBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.75F, 0.5F).sound(SoundType.WOOD), ToolType.AXE).setRegistryName(
                WoodType.byId(i).getName() + "_terrace_chair"));
            RENDER_CUTOUT.add(block);
            event.getRegistry().register(
                new TableBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.75F, 0.5F).sound(SoundType.WOOD), ToolType.AXE).setRegistryName(WoodType.byId(i).getName() + "_table"));
            event.getRegistry().register(new FancyTableBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.75F, 0.5F).sound(SoundType.WOOD), ToolType.AXE).setRegistryName(
                WoodType.byId(i).getName() + "_fancy_table"));
            event.getRegistry().register(
                new CustomDoorBlock(Block.Properties.create(Material.WOOD, MaterialColor.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD), ToolType.AXE).setRegistryName(
                    WoodType.byId(i).getName() + "_fancy_door"));
            event.getRegistry().register(
                new SuspendedStairsBlock(Block.Properties.create(Material.WOOD, MaterialColor.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD), ToolType.AXE).setRegistryName(
                    WoodType.byId(i).getName() + "_suspended_stairs"));
            // event.getRegistry().register(
            // block = new CustomChestBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.5F).sound(SoundType.WOOD), CustomChestType.OAK_FANCY, WoodType.byId(i)).setRegistryName(
            // WoodType.byId(i).getName() + "_fancy_chest"));
            // FANCY_CHESTS.add(block);

            event.getRegistry().register(
                new CrateBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.5F).sound(SoundType.WOOD)).setRegistryName(WoodType.byId(i).getName() + "_wooden_crate"));

        }

        event.getRegistry().register(
            new TerraceTableBlock(Block.Properties.create(Material.IRON).hardnessAndResistance(0.75F, 0.5F).sound(SoundType.LANTERN), ToolType.PICKAXE).setRegistryName("metallic_terrace_table"));
        event.getRegistry().register(
            new TerraceChairBlock(Block.Properties.create(Material.IRON).hardnessAndResistance(0.75F, 0.5F).sound(SoundType.LANTERN), ToolType.PICKAXE).setRegistryName("metallic_terrace_chair"));

        event.getRegistry().register(new PlateBlock(Block.Properties.create(Material.GLASS).hardnessAndResistance(0.25F).sound(SoundType.GLASS)).setRegistryName("plate"));

        event.getRegistry().register(
            new CouchBlock(Block.Properties.create(Material.WOOD, MaterialColor.BLACK).hardnessAndResistance(0.75F, 0.5F).sound(SoundType.CLOTH), ToolType.AXE).setRegistryName("black_couch"));
        event.getRegistry().register(
            new CouchBlock(Block.Properties.create(Material.WOOD, MaterialColor.BLUE).hardnessAndResistance(0.75F, 0.5F).sound(SoundType.CLOTH), ToolType.AXE).setRegistryName("blue_couch"));
        event.getRegistry().register(
            new CouchBlock(Block.Properties.create(Material.WOOD, MaterialColor.BROWN).hardnessAndResistance(0.75F, 0.5F).sound(SoundType.CLOTH), ToolType.AXE).setRegistryName("brown_couch"));
        event.getRegistry().register(
            new CouchBlock(Block.Properties.create(Material.WOOD, MaterialColor.CYAN).hardnessAndResistance(0.75F, 0.5F).sound(SoundType.CLOTH), ToolType.AXE).setRegistryName("cyan_couch"));
        event.getRegistry().register(
            new CouchBlock(Block.Properties.create(Material.WOOD, MaterialColor.GRAY).hardnessAndResistance(0.75F, 0.5F).sound(SoundType.CLOTH), ToolType.AXE).setRegistryName("gray_couch"));
        event.getRegistry().register(
            new CouchBlock(Block.Properties.create(Material.WOOD, MaterialColor.GREEN).hardnessAndResistance(0.75F, 0.5F).sound(SoundType.CLOTH), ToolType.AXE).setRegistryName("green_couch"));
        event.getRegistry().register(
            new CouchBlock(Block.Properties.create(Material.WOOD, MaterialColor.LIGHT_BLUE).hardnessAndResistance(0.75F, 0.5F).sound(SoundType.CLOTH), ToolType.AXE).setRegistryName(
                "light_blue_couch"));
        event.getRegistry().register(
            new CouchBlock(Block.Properties.create(Material.WOOD, MaterialColor.LIGHT_GRAY).hardnessAndResistance(0.75F, 0.5F).sound(SoundType.CLOTH), ToolType.AXE).setRegistryName(
                "light_gray_couch"));
        event.getRegistry().register(
            new CouchBlock(Block.Properties.create(Material.WOOD, MaterialColor.LIME).hardnessAndResistance(0.75F, 0.5F).sound(SoundType.CLOTH), ToolType.AXE).setRegistryName("lime_couch"));
        event.getRegistry().register(
            new CouchBlock(Block.Properties.create(Material.WOOD, MaterialColor.MAGENTA).hardnessAndResistance(0.75F, 0.5F).sound(SoundType.CLOTH), ToolType.AXE).setRegistryName("magenta_couch"));
        event.getRegistry().register(
            new CouchBlock(Block.Properties.create(Material.WOOD, MaterialColor.ORANGE_TERRACOTTA).hardnessAndResistance(0.75F, 0.5F).sound(SoundType.CLOTH), ToolType.AXE).setRegistryName(
                "orange_couch"));
        event.getRegistry().register(
            new CouchBlock(Block.Properties.create(Material.WOOD, MaterialColor.PINK).hardnessAndResistance(0.75F, 0.5F).sound(SoundType.CLOTH), ToolType.AXE).setRegistryName("pink_couch"));
        event.getRegistry().register(
            new CouchBlock(Block.Properties.create(Material.WOOD, MaterialColor.PURPLE).hardnessAndResistance(0.75F, 0.5F).sound(SoundType.CLOTH), ToolType.AXE).setRegistryName("purple_couch"));
        event.getRegistry().register(
            new CouchBlock(Block.Properties.create(Material.WOOD, MaterialColor.RED).hardnessAndResistance(0.75F, 0.5F).sound(SoundType.CLOTH), ToolType.AXE).setRegistryName("red_couch"));
        event.getRegistry().register(
            new CouchBlock(Block.Properties.create(Material.WOOD, MaterialColor.SNOW).hardnessAndResistance(0.75F, 0.5F).sound(SoundType.CLOTH), ToolType.AXE).setRegistryName("white_couch"));
        event.getRegistry().register(
            new CouchBlock(Block.Properties.create(Material.WOOD, MaterialColor.YELLOW).hardnessAndResistance(0.75F, 0.5F).sound(SoundType.CLOTH), ToolType.AXE).setRegistryName("yellow_couch"));

        for(int j = 0; j < Arrays.stream(DyeColor.values()).count(); j++)
        {
            event.getRegistry().register(
                new LampBlock(Block.Properties.create(Material.GLASS).hardnessAndResistance(0.25F).sound(SoundType.GLASS).lightValue(11)).setRegistryName(DyeColor.byId(j).getName() + "_table_lamp"));
            createBlockWithVariants(event, DyeColor.byId(j).getName() + "_corrugated_metal_plate", true, true, true, true, Material.IRON, SoundType.METAL, ToolType.PICKAXE);
            event.getRegistry().register(
                new PillowBlock(DyeColor.byId(j), Block.Properties.create(Material.WOOL).hardnessAndResistance(0.25F).sound(SoundType.CLOTH)).setRegistryName(DyeColor.byId(j).getName() + "_pillow"));

        }

        // for(int i = 0; i < 6; i++)
        // {
        // for(int j = 0; j < Arrays.stream(DyeColor.values()).count(); j++)
        // {
        // block = new CustomBedBlock(DyeColor.byId(j), WoodType.byId(i), Block.Properties.create(Material.WOOL).sound(SoundType.WOOD).hardnessAndResistance(0.2F)).setRegistryName(
        // DyeColor.byId(j).getName() + "_" + WoodType.byId(i).getName() + "_fancy_bed");
        // event.getRegistry().register(block);
        // FANCY_BEDS.add(block);
        // FANCY_BEDS_TEISR.add(block);
        //
        // }
        // }

        // Doors

        event.getRegistry().register(
            new CustomDoorBlock(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(3.0F).sound(SoundType.LANTERN), ToolType.PICKAXE).setRegistryName("steel_door"));
        event.getRegistry().register(
            new CustomDoorBlock(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(5.0F).sound(SoundType.LANTERN), ToolType.PICKAXE).setRegistryName(
                "sturdy_steel_door"));
        event.getRegistry().register(
            new CustomDoorBlock(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(3.0F).sound(SoundType.LANTERN), ToolType.PICKAXE).setRegistryName(
                "warning_steel_door"));
        event.getRegistry().register(
            new CustomDoorBlock(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(3.0F).sound(SoundType.LANTERN), ToolType.PICKAXE).setRegistryName("white_steel_door"));
        event.getRegistry().register(
            new CustomDoorBlock(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(5.0F).sound(SoundType.LANTERN), ToolType.PICKAXE).setRegistryName(
                "sturdy_white_steel_door"));
        event.getRegistry().register(
            new CustomDoorBlock(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(3.0F).sound(SoundType.LANTERN), ToolType.PICKAXE).setRegistryName(
                "warning_white_steel_door"));
        event.getRegistry().register(
            new CustomDoorBlock(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(3.0F).sound(SoundType.LANTERN), ToolType.PICKAXE).setRegistryName("rusty_door"));
        event.getRegistry().register(
            new CustomDoorBlock(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(5.0F).sound(SoundType.LANTERN), ToolType.PICKAXE).setRegistryName(
                "sturdy_rusty_door"));
        event.getRegistry().register(
            new CustomDoorBlock(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(3.0F).sound(SoundType.LANTERN), ToolType.PICKAXE).setRegistryName(
                "warning_rusty_door"));

        // Stairs

        event.getRegistry().register(
            new SuspendedStairsBlock(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(3.0F).sound(SoundType.LANTERN), ToolType.PICKAXE).setRegistryName(
                "steel_suspended_stairs"));

        // Chests

        // event.getRegistry().register(new VerticalChestBlock(Block.Properties.create(Material.IRON).hardnessAndResistance(2.5F).sound(SoundType.METAL)).setRegistryName("locker"));

    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event)
    {
        // World

        createItemBlockWithVariants(event, ModItemGroups.EMBELLISHCRAFT, BASALT, BASALT_STAIRS, BASALT_SLAB, BASALT_WALL, BASALT_PRESSURE_PLATE);
        createItemBlockWithVariants(event, ModItemGroups.EMBELLISHCRAFT, SLATE, SLATE_STAIRS, SLATE_SLAB, SLATE_WALL, SLATE_PRESSURE_PLATE);
        createItemBlockWithVariants(event, ModItemGroups.EMBELLISHCRAFT, MARBLE, MARBLE_STAIRS, MARBLE_SLAB, MARBLE_WALL, MARBLE_PRESSURE_PLATE);
        createItemBlockWithVariants(event, ModItemGroups.EMBELLISHCRAFT, GNEISS, GNEISS_STAIRS, GNEISS_SLAB, GNEISS_WALL, GNEISS_PRESSURE_PLATE);
        createItemBlockWithVariants(event, ModItemGroups.EMBELLISHCRAFT, JADE, JADE_STAIRS, JADE_SLAB, JADE_WALL, JADE_PRESSURE_PLATE);
        createItemBlockWithVariants(event, ModItemGroups.EMBELLISHCRAFT, LARVIKITE, LARVIKITE_STAIRS, LARVIKITE_SLAB, LARVIKITE_WALL, LARVIKITE_PRESSURE_PLATE);

        // Cobblestones

        createItemBlockWithVariants(event, ModItemGroups.EMBELLISHCRAFT, BASALT_COBBLESTONE, BASALT_COBBLESTONE_STAIRS, BASALT_COBBLESTONE_SLAB, BASALT_COBBLESTONE_WALL,
            BASALT_COBBLESTONE_PRESSURE_PLATE);
        createItemBlockWithVariants(event, ModItemGroups.EMBELLISHCRAFT, SLATE_COBBLESTONE, SLATE_COBBLESTONE_STAIRS, SLATE_COBBLESTONE_SLAB, SLATE_COBBLESTONE_WALL, SLATE_COBBLESTONE_PRESSURE_PLATE);
        createItemBlockWithVariants(event, ModItemGroups.EMBELLISHCRAFT, MARBLE_COBBLESTONE, MARBLE_COBBLESTONE_STAIRS, MARBLE_COBBLESTONE_SLAB, MARBLE_COBBLESTONE_WALL,
            MARBLE_COBBLESTONE_PRESSURE_PLATE);
        createItemBlockWithVariants(event, ModItemGroups.EMBELLISHCRAFT, GNEISS_COBBLESTONE, GNEISS_COBBLESTONE_STAIRS, GNEISS_COBBLESTONE_SLAB, GNEISS_COBBLESTONE_WALL,
            GNEISS_COBBLESTONE_PRESSURE_PLATE);
        createItemBlockWithVariants(event, ModItemGroups.EMBELLISHCRAFT, JADE_COBBLESTONE, JADE_COBBLESTONE_STAIRS, JADE_COBBLESTONE_SLAB, JADE_COBBLESTONE_WALL, JADE_COBBLESTONE_PRESSURE_PLATE);
        createItemBlockWithVariants(event, ModItemGroups.EMBELLISHCRAFT, LARVIKITE_COBBLESTONE, LARVIKITE_COBBLESTONE_STAIRS, LARVIKITE_COBBLESTONE_SLAB, LARVIKITE_COBBLESTONE_WALL,
            LARVIKITE_COBBLESTONE_PRESSURE_PLATE);

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
        createItemBlockWithVariants(event, ModItemGroups.EMBELLISHCRAFT, JADE_BRICKS, JADE_BRICKS_STAIRS, JADE_BRICKS_SLAB, JADE_BRICKS_WALL, JADE_BRICKS_PRESSURE_PLATE);
        createItemBlockWithVariants(event, ModItemGroups.EMBELLISHCRAFT, LARVIKITE_BRICKS, LARVIKITE_BRICKS_STAIRS, LARVIKITE_BRICKS_SLAB, LARVIKITE_BRICKS_WALL, LARVIKITE_BRICKS_PRESSURE_PLATE);

        // Large bricks

        createItemBlockWithVariants(event, ModItemGroups.EMBELLISHCRAFT, BASALT_LARGE_BRICKS, BASALT_LARGE_BRICKS_STAIRS, BASALT_LARGE_BRICKS_SLAB, BASALT_LARGE_BRICKS_WALL,
            BASALT_LARGE_BRICKS_PRESSURE_PLATE);
        createItemBlockWithVariants(event, ModItemGroups.EMBELLISHCRAFT, DIORITE_LARGE_BRICKS, DIORITE_LARGE_BRICKS_STAIRS, DIORITE_LARGE_BRICKS_SLAB, DIORITE_LARGE_BRICKS_WALL,
            DIORITE_LARGE_BRICKS_PRESSURE_PLATE);
        createItemBlockWithVariants(event, ModItemGroups.EMBELLISHCRAFT, DARK_LARGE_BRICKS, DARK_LARGE_BRICKS_STAIRS, DARK_LARGE_BRICKS_SLAB, DARK_LARGE_BRICKS_WALL, DARK_LARGE_BRICKS_PRESSURE_PLATE);
        createItemBlockWithVariants(event, ModItemGroups.EMBELLISHCRAFT, MARBLE_LARGE_BRICKS, MARBLE_LARGE_BRICKS_STAIRS, MARBLE_LARGE_BRICKS_SLAB, MARBLE_LARGE_BRICKS_WALL,
            MARBLE_LARGE_BRICKS_PRESSURE_PLATE);
        createItemBlockWithVariants(event, ModItemGroups.EMBELLISHCRAFT, OLD_LARGE_BRICKS, OLD_LARGE_BRICKS_STAIRS, OLD_LARGE_BRICKS_SLAB, OLD_LARGE_BRICKS_WALL, OLD_LARGE_BRICKS_PRESSURE_PLATE);
        createItemBlockWithVariants(event, ModItemGroups.EMBELLISHCRAFT, SANDSTONE_LARGE_BRICKS, SANDSTONE_LARGE_BRICKS_STAIRS, SANDSTONE_LARGE_BRICKS_SLAB, SANDSTONE_LARGE_BRICKS_WALL,
            SANDSTONE_LARGE_BRICKS_PRESSURE_PLATE);
        createItemBlockWithVariants(event, ModItemGroups.EMBELLISHCRAFT, SLATE_LARGE_BRICKS, SLATE_LARGE_BRICKS_STAIRS, SLATE_LARGE_BRICKS_SLAB, SLATE_LARGE_BRICKS_WALL,
            SLATE_LARGE_BRICKS_PRESSURE_PLATE);
        createItemBlockWithVariants(event, ModItemGroups.EMBELLISHCRAFT, TERRACOTTA_LARGE_BRICKS, TERRACOTTA_LARGE_BRICKS_STAIRS, TERRACOTTA_LARGE_BRICKS_SLAB, TERRACOTTA_LARGE_BRICKS_WALL,
            TERRACOTTA_LARGE_BRICKS_PRESSURE_PLATE);
        createItemBlockWithVariants(event, ModItemGroups.EMBELLISHCRAFT, WEARED_LARGE_BRICKS, WEARED_LARGE_BRICKS_STAIRS, WEARED_LARGE_BRICKS_SLAB, WEARED_LARGE_BRICKS_WALL,
            WEARED_LARGE_BRICKS_PRESSURE_PLATE);
        createItemBlockWithVariants(event, ModItemGroups.EMBELLISHCRAFT, GNEISS_LARGE_BRICKS, GNEISS_LARGE_BRICKS_STAIRS, GNEISS_LARGE_BRICKS_SLAB, GNEISS_LARGE_BRICKS_WALL,
            GNEISS_LARGE_BRICKS_PRESSURE_PLATE);
        createItemBlockWithVariants(event, ModItemGroups.EMBELLISHCRAFT, JADE_LARGE_BRICKS, JADE_LARGE_BRICKS_STAIRS, JADE_LARGE_BRICKS_SLAB, JADE_LARGE_BRICKS_WALL, JADE_LARGE_BRICKS_PRESSURE_PLATE);
        createItemBlockWithVariants(event, ModItemGroups.EMBELLISHCRAFT, LARVIKITE_LARGE_BRICKS, LARVIKITE_LARGE_BRICKS_STAIRS, LARVIKITE_LARGE_BRICKS_SLAB, LARVIKITE_LARGE_BRICKS_WALL,
            LARVIKITE_LARGE_BRICKS_PRESSURE_PLATE);

        // Paving

        createItemBlockWithVariants(event, ModItemGroups.EMBELLISHCRAFT, CONCRETE_PAVING, CONCRETE_PAVING_STAIRS, CONCRETE_PAVING_SLAB, CONCRETE_PAVING_WALL, CONCRETE_PAVING_PRESSURE_PLATE);
        createItemBlockWithVariants(event, ModItemGroups.EMBELLISHCRAFT, DAMAGED_PAVING, DAMAGED_PAVING_STAIRS, DAMAGED_PAVING_SLAB, DAMAGED_PAVING_WALL, DAMAGED_PAVING_PRESSURE_PLATE);
        createItemBlockWithVariants(event, ModItemGroups.EMBELLISHCRAFT, DARK_CONCRETE_PAVING, DARK_CONCRETE_PAVING_STAIRS, DARK_CONCRETE_PAVING_SLAB, DARK_CONCRETE_PAVING_WALL,
            DARK_CONCRETE_PAVING_PRESSURE_PLATE);
        createItemBlockWithVariants(event, ModItemGroups.EMBELLISHCRAFT, DIORITE_PAVING, DIORITE_PAVING_STAIRS, DIORITE_PAVING_SLAB, DIORITE_PAVING_WALL, DIORITE_PAVING_PRESSURE_PLATE);
        createItemBlockWithVariants(event, ModItemGroups.EMBELLISHCRAFT, MOIST_PAVING, MOIST_PAVING_STAIRS, MOIST_PAVING_SLAB, MOIST_PAVING_WALL, MOIST_PAVING_PRESSURE_PLATE);
        createItemBlockWithVariants(event, ModItemGroups.EMBELLISHCRAFT, POLISHED_PAVING, POLISHED_PAVING_STAIRS, POLISHED_PAVING_SLAB, POLISHED_PAVING_WALL, POLISHED_PAVING_PRESSURE_PLATE);
        createItemBlockWithVariants(event, ModItemGroups.EMBELLISHCRAFT, SLATE_PAVING, SLATE_PAVING_STAIRS, SLATE_PAVING_SLAB, SLATE_PAVING_WALL, SLATE_PAVING_PRESSURE_PLATE);
        createItemBlockWithVariants(event, ModItemGroups.EMBELLISHCRAFT, WHITE_CONCRETE_PAVING, WHITE_CONCRETE_PAVING_STAIRS, WHITE_CONCRETE_PAVING_SLAB, WHITE_CONCRETE_PAVING_WALL,
            WHITE_CONCRETE_PAVING_PRESSURE_PLATE);
        createItemBlockWithVariants(event, ModItemGroups.EMBELLISHCRAFT, GNEISS_PAVING, GNEISS_PAVING_STAIRS, GNEISS_PAVING_SLAB, GNEISS_PAVING_WALL, GNEISS_PAVING_PRESSURE_PLATE);
        createItemBlockWithVariants(event, ModItemGroups.EMBELLISHCRAFT, JADE_PAVING, JADE_PAVING_STAIRS, JADE_PAVING_SLAB, JADE_PAVING_WALL, JADE_PAVING_PRESSURE_PLATE);
        createItemBlockWithVariants(event, ModItemGroups.EMBELLISHCRAFT, LARVIKITE_PAVING, LARVIKITE_PAVING_STAIRS, LARVIKITE_PAVING_SLAB, LARVIKITE_PAVING_WALL, LARVIKITE_PAVING_PRESSURE_PLATE);

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
        event.getRegistry().register(
            new BlockItem(WHITE_BLUE_WALLPAPER_PLINTH, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)).setRegistryName(WHITE_BLUE_WALLPAPER_PLINTH.getRegistryName()));
        createItemBlockWithVariants(event, ModItemGroups.EMBELLISHCRAFT, BEIGE_WALLPAPER, BEIGE_WALLPAPER_STAIRS, BEIGE_WALLPAPER_SLAB, null, null);
        event.getRegistry().register(new BlockItem(BEIGE_WALLPAPER_PLINTH, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)).setRegistryName(BEIGE_WALLPAPER_PLINTH.getRegistryName()));
        createItemBlockWithVariants(event, ModItemGroups.EMBELLISHCRAFT, PINK_WALLPAPER, PINK_WALLPAPER_STAIRS, PINK_WALLPAPER_SLAB, null, null);
        event.getRegistry().register(new BlockItem(PINK_WALLPAPER_PLINTH, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)).setRegistryName(PINK_WALLPAPER_PLINTH.getRegistryName()));
        createItemBlockWithVariants(event, ModItemGroups.EMBELLISHCRAFT, BEIGE_FLOWER_WALLPAPER, BEIGE_FLOWER_WALLPAPER_STAIRS, BEIGE_FLOWER_WALLPAPER_SLAB, null, null);
        event.getRegistry().register(
            new BlockItem(BEIGE_FLOWER_WALLPAPER_PLINTH, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)).setRegistryName(BEIGE_FLOWER_WALLPAPER_PLINTH.getRegistryName()));
        createItemBlockWithVariants(event, ModItemGroups.EMBELLISHCRAFT, WHITE_GREEN_WALLPAPER, WHITE_GREEN_WALLPAPER_STAIRS, WHITE_GREEN_WALLPAPER_SLAB, null, null);
        event.getRegistry().register(
            new BlockItem(WHITE_GREEN_WALLPAPER_PLINTH, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)).setRegistryName(WHITE_GREEN_WALLPAPER_PLINTH.getRegistryName()));

        // Metal

        event.getRegistry().register(new BlockItem(STEEL_BLOCK, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)).setRegistryName(STEEL_BLOCK.getRegistryName()));

        createItemBlockWithVariants(event, ModItemGroups.EMBELLISHCRAFT, DARK_METAL_FLOOR, DARK_METAL_FLOOR_STAIRS, DARK_METAL_FLOOR_SLAB, DARK_METAL_FLOOR_WALL, DARK_METAL_FLOOR_PRESSURE_PLATE);
        createItemBlockWithVariants(event, ModItemGroups.EMBELLISHCRAFT, LIGHT_METAL_FLOOR, LIGHT_METAL_FLOOR_STAIRS, LIGHT_METAL_FLOOR_SLAB, LIGHT_METAL_FLOOR_WALL, LIGHT_METAL_FLOOR_PRESSURE_PLATE);
        createItemBlockWithVariants(event, ModItemGroups.EMBELLISHCRAFT, RUSTY_PLATE, RUSTY_PLATE_STAIRS, RUSTY_PLATE_SLAB, RUSTY_PLATE_WALL, RUSTY_PLATE_PRESSURE_PLATE);

        event.getRegistry().register(new BlockItem(IRON_BEAM, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)).setRegistryName(IRON_BEAM.getRegistryName()));
        event.getRegistry().register(new BlockItem(BOLTED_IRON_BEAM, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)).setRegistryName(BOLTED_IRON_BEAM.getRegistryName()));
        createItemBlockWithVariants(event, ModItemGroups.EMBELLISHCRAFT, IRON_BEAM_JUNCTION, null, null, null, null);
        event.getRegistry().register(new BlockItem(STEEL_BEAM, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)).setRegistryName(STEEL_BEAM.getRegistryName()));
        event.getRegistry().register(new BlockItem(BOLTED_STEEL_BEAM, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)).setRegistryName(BOLTED_STEEL_BEAM.getRegistryName()));
        createItemBlockWithVariants(event, ModItemGroups.EMBELLISHCRAFT, STEEL_BEAM_JUNCTION, null, null, null, null);

        createItemBlockWithVariants(event, ModItemGroups.EMBELLISHCRAFT, AIR_DUCT, null, null, null, null);
        event.getRegistry().register(new BlockItem(VENT_AIR_DUCT, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)).setRegistryName(VENT_AIR_DUCT.getRegistryName()));
        event.getRegistry().register(new BlockItem(GRID_AIR_DUCT, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)).setRegistryName(GRID_AIR_DUCT.getRegistryName()));

        createItemBlockWithVariants(event, ModItemGroups.EMBELLISHCRAFT, PURPLE_CORRUGATED_METAL_PLATE, PURPLE_CORRUGATED_METAL_PLATE_STAIRS, PURPLE_CORRUGATED_METAL_PLATE_SLAB,
            PURPLE_CORRUGATED_METAL_PLATE_WALL, PURPLE_CORRUGATED_METAL_PLATE_PRESSURE_PLATE);
        createItemBlockWithVariants(event, ModItemGroups.EMBELLISHCRAFT, RED_CORRUGATED_METAL_PLATE, RED_CORRUGATED_METAL_PLATE_STAIRS, RED_CORRUGATED_METAL_PLATE_SLAB,
            RED_CORRUGATED_METAL_PLATE_WALL, RED_CORRUGATED_METAL_PLATE_PRESSURE_PLATE);
        createItemBlockWithVariants(event, ModItemGroups.EMBELLISHCRAFT, WHITE_CORRUGATED_METAL_PLATE, WHITE_CORRUGATED_METAL_PLATE_STAIRS, WHITE_CORRUGATED_METAL_PLATE_SLAB,
            WHITE_CORRUGATED_METAL_PLATE_WALL, WHITE_CORRUGATED_METAL_PLATE_PRESSURE_PLATE);
        createItemBlockWithVariants(event, ModItemGroups.EMBELLISHCRAFT, YELLOW_CORRUGATED_METAL_PLATE, YELLOW_CORRUGATED_METAL_PLATE_STAIRS, YELLOW_CORRUGATED_METAL_PLATE_SLAB,
            YELLOW_CORRUGATED_METAL_PLATE_WALL, YELLOW_CORRUGATED_METAL_PLATE_PRESSURE_PLATE);
        createItemBlockWithVariants(event, ModItemGroups.EMBELLISHCRAFT, BLACK_CORRUGATED_METAL_PLATE, BLACK_CORRUGATED_METAL_PLATE_STAIRS, BLACK_CORRUGATED_METAL_PLATE_SLAB,
            BLACK_CORRUGATED_METAL_PLATE_WALL, BLACK_CORRUGATED_METAL_PLATE_PRESSURE_PLATE);
        createItemBlockWithVariants(event, ModItemGroups.EMBELLISHCRAFT, BLUE_CORRUGATED_METAL_PLATE, BLUE_CORRUGATED_METAL_PLATE_STAIRS, BLUE_CORRUGATED_METAL_PLATE_SLAB,
            BLUE_CORRUGATED_METAL_PLATE_WALL, BLUE_CORRUGATED_METAL_PLATE_PRESSURE_PLATE);
        createItemBlockWithVariants(event, ModItemGroups.EMBELLISHCRAFT, BROWN_CORRUGATED_METAL_PLATE, BROWN_CORRUGATED_METAL_PLATE_STAIRS, BROWN_CORRUGATED_METAL_PLATE_SLAB,
            BROWN_CORRUGATED_METAL_PLATE_WALL, BROWN_CORRUGATED_METAL_PLATE_PRESSURE_PLATE);
        createItemBlockWithVariants(event, ModItemGroups.EMBELLISHCRAFT, CYAN_CORRUGATED_METAL_PLATE, CYAN_CORRUGATED_METAL_PLATE_STAIRS, CYAN_CORRUGATED_METAL_PLATE_SLAB,
            CYAN_CORRUGATED_METAL_PLATE_WALL, CYAN_CORRUGATED_METAL_PLATE_PRESSURE_PLATE);
        createItemBlockWithVariants(event, ModItemGroups.EMBELLISHCRAFT, GRAY_CORRUGATED_METAL_PLATE, GRAY_CORRUGATED_METAL_PLATE_STAIRS, GRAY_CORRUGATED_METAL_PLATE_SLAB,
            GRAY_CORRUGATED_METAL_PLATE_WALL, GRAY_CORRUGATED_METAL_PLATE_PRESSURE_PLATE);
        createItemBlockWithVariants(event, ModItemGroups.EMBELLISHCRAFT, GREEN_CORRUGATED_METAL_PLATE, GREEN_CORRUGATED_METAL_PLATE_STAIRS, GREEN_CORRUGATED_METAL_PLATE_SLAB,
            GREEN_CORRUGATED_METAL_PLATE_WALL, GREEN_CORRUGATED_METAL_PLATE_PRESSURE_PLATE);
        createItemBlockWithVariants(event, ModItemGroups.EMBELLISHCRAFT, LIGHT_BLUE_CORRUGATED_METAL_PLATE, LIGHT_BLUE_CORRUGATED_METAL_PLATE_STAIRS, LIGHT_BLUE_CORRUGATED_METAL_PLATE_SLAB,
            LIGHT_BLUE_CORRUGATED_METAL_PLATE_WALL, LIGHT_BLUE_CORRUGATED_METAL_PLATE_PRESSURE_PLATE);
        createItemBlockWithVariants(event, ModItemGroups.EMBELLISHCRAFT, LIGHT_GRAY_CORRUGATED_METAL_PLATE, LIGHT_GRAY_CORRUGATED_METAL_PLATE_STAIRS, LIGHT_GRAY_CORRUGATED_METAL_PLATE_SLAB,
            LIGHT_GRAY_CORRUGATED_METAL_PLATE_WALL, LIGHT_GRAY_CORRUGATED_METAL_PLATE_PRESSURE_PLATE);
        createItemBlockWithVariants(event, ModItemGroups.EMBELLISHCRAFT, LIME_CORRUGATED_METAL_PLATE, LIME_CORRUGATED_METAL_PLATE_STAIRS, LIME_CORRUGATED_METAL_PLATE_SLAB,
            LIME_CORRUGATED_METAL_PLATE_WALL, LIME_CORRUGATED_METAL_PLATE_PRESSURE_PLATE);
        createItemBlockWithVariants(event, ModItemGroups.EMBELLISHCRAFT, ORANGE_CORRUGATED_METAL_PLATE, ORANGE_CORRUGATED_METAL_PLATE_STAIRS, ORANGE_CORRUGATED_METAL_PLATE_SLAB,
            ORANGE_CORRUGATED_METAL_PLATE_WALL, ORANGE_CORRUGATED_METAL_PLATE_PRESSURE_PLATE);
        createItemBlockWithVariants(event, ModItemGroups.EMBELLISHCRAFT, PINK_CORRUGATED_METAL_PLATE, PINK_CORRUGATED_METAL_PLATE_STAIRS, PINK_CORRUGATED_METAL_PLATE_SLAB,
            PINK_CORRUGATED_METAL_PLATE_WALL, PINK_CORRUGATED_METAL_PLATE_PRESSURE_PLATE);
        createItemBlockWithVariants(event, ModItemGroups.EMBELLISHCRAFT, MAGENTA_CORRUGATED_METAL_PLATE, MAGENTA_CORRUGATED_METAL_PLATE_STAIRS, MAGENTA_CORRUGATED_METAL_PLATE_SLAB,
            MAGENTA_CORRUGATED_METAL_PLATE_WALL, MAGENTA_CORRUGATED_METAL_PLATE_PRESSURE_PLATE);

        createItemBlockWithVariants(event, ModItemGroups.EMBELLISHCRAFT, BULKHEAD, null, null, null, null);
        createItemBlockWithVariants(event, ModItemGroups.EMBELLISHCRAFT, BULKHEAD_TOP, null, null, null, null);

        event.getRegistry().register(new BlockItem(STEEL_WALL_LADDER, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)).setRegistryName(STEEL_WALL_LADDER.getRegistryName()));
        event.getRegistry().register(new BlockItem(RUSTY_WALL_LADDER, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)).setRegistryName(RUSTY_WALL_LADDER.getRegistryName()));
        event.getRegistry().register(new BlockItem(STEEL_RUNGS, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)).setRegistryName(STEEL_RUNGS.getRegistryName()));
        event.getRegistry().register(new BlockItem(RUSTY_RUNGS, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)).setRegistryName(RUSTY_RUNGS.getRegistryName()));

        // Concrete

        createItemBlockWithVariants(event, ModItemGroups.EMBELLISHCRAFT, CONCRETE, CONCRETE_STAIRS, CONCRETE_SLAB, CONCRETE_WALL, CONCRETE_PRESSURE_PLATE);

        // Furniture

        event.getRegistry().register(new FuelBlockItem(OAK_CHAIR, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), ECConstants.chairBurnTime).setRegistryName(OAK_CHAIR.getRegistryName()));
        event.getRegistry().register(
            new FuelBlockItem(DARK_OAK_CHAIR, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), ECConstants.chairBurnTime).setRegistryName(DARK_OAK_CHAIR.getRegistryName()));
        event.getRegistry().register(
            new FuelBlockItem(BIRCH_CHAIR, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), ECConstants.chairBurnTime).setRegistryName(BIRCH_CHAIR.getRegistryName()));
        event.getRegistry().register(
            new FuelBlockItem(JUNGLE_CHAIR, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), ECConstants.chairBurnTime).setRegistryName(JUNGLE_CHAIR.getRegistryName()));
        event.getRegistry().register(
            new FuelBlockItem(SPRUCE_CHAIR, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), ECConstants.chairBurnTime).setRegistryName(SPRUCE_CHAIR.getRegistryName()));
        event.getRegistry().register(
            new FuelBlockItem(ACACIA_CHAIR, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), ECConstants.chairBurnTime).setRegistryName(ACACIA_CHAIR.getRegistryName()));

        event.getRegistry().register(new BlockItem(METALLIC_TERRACE_TABLE, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)).setRegistryName(METALLIC_TERRACE_TABLE.getRegistryName()));
        event.getRegistry().register(
            new FuelBlockItem(OAK_TERRACE_TABLE, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), ECConstants.chairBurnTime).setRegistryName(OAK_TERRACE_TABLE.getRegistryName()));
        event.getRegistry().register(
            new FuelBlockItem(BIRCH_TERRACE_TABLE, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), ECConstants.chairBurnTime).setRegistryName(BIRCH_TERRACE_TABLE.getRegistryName()));
        event.getRegistry().register(
            new FuelBlockItem(SPRUCE_TERRACE_TABLE, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), ECConstants.chairBurnTime).setRegistryName(SPRUCE_TERRACE_TABLE.getRegistryName()));
        event.getRegistry().register(
            new FuelBlockItem(JUNGLE_TERRACE_TABLE, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), ECConstants.chairBurnTime).setRegistryName(JUNGLE_TERRACE_TABLE.getRegistryName()));
        event.getRegistry().register(
            new FuelBlockItem(DARK_OAK_TERRACE_TABLE, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), ECConstants.chairBurnTime).setRegistryName(DARK_OAK_TERRACE_TABLE.getRegistryName()));
        event.getRegistry().register(
            new FuelBlockItem(ACACIA_TERRACE_TABLE, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), ECConstants.chairBurnTime).setRegistryName(ACACIA_TERRACE_TABLE.getRegistryName()));

        event.getRegistry().register(new BlockItem(METALLIC_TERRACE_CHAIR, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)).setRegistryName(METALLIC_TERRACE_CHAIR.getRegistryName()));
        event.getRegistry().register(
            new FuelBlockItem(OAK_TERRACE_CHAIR, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), ECConstants.chairBurnTime).setRegistryName(OAK_TERRACE_CHAIR.getRegistryName()));
        event.getRegistry().register(
            new FuelBlockItem(DARK_OAK_TERRACE_CHAIR, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), ECConstants.chairBurnTime).setRegistryName(DARK_OAK_TERRACE_CHAIR.getRegistryName()));
        event.getRegistry().register(
            new FuelBlockItem(BIRCH_TERRACE_CHAIR, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), ECConstants.chairBurnTime).setRegistryName(BIRCH_TERRACE_CHAIR.getRegistryName()));
        event.getRegistry().register(
            new FuelBlockItem(SPRUCE_TERRACE_CHAIR, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), ECConstants.chairBurnTime).setRegistryName(SPRUCE_TERRACE_CHAIR.getRegistryName()));
        event.getRegistry().register(
            new FuelBlockItem(JUNGLE_TERRACE_CHAIR, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), ECConstants.chairBurnTime).setRegistryName(JUNGLE_TERRACE_CHAIR.getRegistryName()));
        event.getRegistry().register(
            new FuelBlockItem(ACACIA_TERRACE_CHAIR, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), ECConstants.chairBurnTime).setRegistryName(ACACIA_TERRACE_CHAIR.getRegistryName()));

        event.getRegistry().register(new FuelBlockItem(OAK_TABLE, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), ECConstants.chairBurnTime).setRegistryName(OAK_TABLE.getRegistryName()));
        event.getRegistry().register(
            new FuelBlockItem(DARK_OAK_TABLE, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), ECConstants.chairBurnTime).setRegistryName(DARK_OAK_TABLE.getRegistryName()));
        event.getRegistry().register(
            new FuelBlockItem(BIRCH_TABLE, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), ECConstants.chairBurnTime).setRegistryName(BIRCH_TABLE.getRegistryName()));
        event.getRegistry().register(
            new FuelBlockItem(JUNGLE_TABLE, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), ECConstants.chairBurnTime).setRegistryName(JUNGLE_TABLE.getRegistryName()));
        event.getRegistry().register(
            new FuelBlockItem(SPRUCE_TABLE, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), ECConstants.chairBurnTime).setRegistryName(SPRUCE_TABLE.getRegistryName()));
        event.getRegistry().register(
            new FuelBlockItem(ACACIA_TABLE, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), ECConstants.chairBurnTime).setRegistryName(ACACIA_TABLE.getRegistryName()));

        event.getRegistry().register(
            new FuelBlockItem(OAK_FANCY_TABLE, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), ECConstants.couchBurnTime).setRegistryName(OAK_FANCY_TABLE.getRegistryName()));
        event.getRegistry().register(
            new FuelBlockItem(DARK_OAK_FANCY_TABLE, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), ECConstants.couchBurnTime).setRegistryName(DARK_OAK_FANCY_TABLE.getRegistryName()));
        event.getRegistry().register(
            new FuelBlockItem(BIRCH_FANCY_TABLE, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), ECConstants.couchBurnTime).setRegistryName(BIRCH_FANCY_TABLE.getRegistryName()));
        event.getRegistry().register(
            new FuelBlockItem(JUNGLE_FANCY_TABLE, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), ECConstants.couchBurnTime).setRegistryName(JUNGLE_FANCY_TABLE.getRegistryName()));
        event.getRegistry().register(
            new FuelBlockItem(SPRUCE_FANCY_TABLE, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), ECConstants.couchBurnTime).setRegistryName(SPRUCE_FANCY_TABLE.getRegistryName()));
        event.getRegistry().register(
            new FuelBlockItem(ACACIA_FANCY_TABLE, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), ECConstants.couchBurnTime).setRegistryName(ACACIA_FANCY_TABLE.getRegistryName()));

        event.getRegistry().register(new BlockItem(PLATE, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)).setRegistryName(PLATE.getRegistryName()));

        event.getRegistry().register(
            new FuelBlockItem(BLACK_COUCH, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), ECConstants.couchBurnTime).setRegistryName(BLACK_COUCH.getRegistryName()));
        event.getRegistry().register(new FuelBlockItem(BLUE_COUCH, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), ECConstants.couchBurnTime).setRegistryName(BLUE_COUCH.getRegistryName()));
        event.getRegistry().register(
            new FuelBlockItem(BROWN_COUCH, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), ECConstants.couchBurnTime).setRegistryName(BROWN_COUCH.getRegistryName()));
        event.getRegistry().register(new FuelBlockItem(CYAN_COUCH, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), ECConstants.couchBurnTime).setRegistryName(CYAN_COUCH.getRegistryName()));
        event.getRegistry().register(new FuelBlockItem(GRAY_COUCH, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), ECConstants.couchBurnTime).setRegistryName(GRAY_COUCH.getRegistryName()));
        event.getRegistry().register(
            new FuelBlockItem(GREEN_COUCH, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), ECConstants.couchBurnTime).setRegistryName(GREEN_COUCH.getRegistryName()));
        event.getRegistry().register(
            new FuelBlockItem(LIGHT_BLUE_COUCH, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), ECConstants.couchBurnTime).setRegistryName(LIGHT_BLUE_COUCH.getRegistryName()));
        event.getRegistry().register(
            new FuelBlockItem(LIGHT_GRAY_COUCH, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), ECConstants.couchBurnTime).setRegistryName(LIGHT_GRAY_COUCH.getRegistryName()));
        event.getRegistry().register(new FuelBlockItem(LIME_COUCH, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), ECConstants.couchBurnTime).setRegistryName(LIME_COUCH.getRegistryName()));
        event.getRegistry().register(
            new FuelBlockItem(MAGENTA_COUCH, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), ECConstants.couchBurnTime).setRegistryName(MAGENTA_COUCH.getRegistryName()));
        event.getRegistry().register(
            new FuelBlockItem(ORANGE_COUCH, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), ECConstants.couchBurnTime).setRegistryName(ORANGE_COUCH.getRegistryName()));
        event.getRegistry().register(new FuelBlockItem(PINK_COUCH, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), ECConstants.couchBurnTime).setRegistryName(PINK_COUCH.getRegistryName()));
        event.getRegistry().register(
            new FuelBlockItem(PURPLE_COUCH, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), ECConstants.couchBurnTime).setRegistryName(PURPLE_COUCH.getRegistryName()));
        event.getRegistry().register(new FuelBlockItem(RED_COUCH, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), ECConstants.couchBurnTime).setRegistryName(RED_COUCH.getRegistryName()));
        event.getRegistry().register(
            new FuelBlockItem(WHITE_COUCH, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), ECConstants.couchBurnTime).setRegistryName(WHITE_COUCH.getRegistryName()));
        event.getRegistry().register(
            new FuelBlockItem(YELLOW_COUCH, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), ECConstants.couchBurnTime).setRegistryName(YELLOW_COUCH.getRegistryName()));

        event.getRegistry().register(new BlockItem(BLACK_TABLE_LAMP, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)).setRegistryName(BLACK_TABLE_LAMP.getRegistryName()));
        event.getRegistry().register(new BlockItem(BLUE_TABLE_LAMP, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)).setRegistryName(BLUE_TABLE_LAMP.getRegistryName()));
        event.getRegistry().register(new BlockItem(BROWN_TABLE_LAMP, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)).setRegistryName(BROWN_TABLE_LAMP.getRegistryName()));
        event.getRegistry().register(new BlockItem(CYAN_TABLE_LAMP, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)).setRegistryName(CYAN_TABLE_LAMP.getRegistryName()));
        event.getRegistry().register(new BlockItem(GRAY_TABLE_LAMP, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)).setRegistryName(GRAY_TABLE_LAMP.getRegistryName()));
        event.getRegistry().register(new BlockItem(GREEN_TABLE_LAMP, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)).setRegistryName(GREEN_TABLE_LAMP.getRegistryName()));
        event.getRegistry().register(new BlockItem(LIGHT_BLUE_TABLE_LAMP, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)).setRegistryName(LIGHT_BLUE_TABLE_LAMP.getRegistryName()));
        event.getRegistry().register(new BlockItem(LIGHT_GRAY_TABLE_LAMP, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)).setRegistryName(LIGHT_GRAY_TABLE_LAMP.getRegistryName()));
        event.getRegistry().register(new BlockItem(LIME_TABLE_LAMP, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)).setRegistryName(LIME_TABLE_LAMP.getRegistryName()));
        event.getRegistry().register(new BlockItem(MAGENTA_TABLE_LAMP, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)).setRegistryName(MAGENTA_TABLE_LAMP.getRegistryName()));
        event.getRegistry().register(new BlockItem(ORANGE_TABLE_LAMP, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)).setRegistryName(ORANGE_TABLE_LAMP.getRegistryName()));
        event.getRegistry().register(new BlockItem(PINK_TABLE_LAMP, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)).setRegistryName(PINK_TABLE_LAMP.getRegistryName()));
        event.getRegistry().register(new BlockItem(PURPLE_TABLE_LAMP, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)).setRegistryName(PURPLE_TABLE_LAMP.getRegistryName()));
        event.getRegistry().register(new BlockItem(RED_TABLE_LAMP, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)).setRegistryName(RED_TABLE_LAMP.getRegistryName()));
        event.getRegistry().register(new BlockItem(WHITE_TABLE_LAMP, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)).setRegistryName(WHITE_TABLE_LAMP.getRegistryName()));
        event.getRegistry().register(new BlockItem(YELLOW_TABLE_LAMP, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)).setRegistryName(YELLOW_TABLE_LAMP.getRegistryName()));

        // for(Block block : FANCY_BEDS_TEISR)
        // event.getRegistry().register(
        // new FuelBlockItem(block, new Item.Properties().setTEISR(() -> CustomBedItemStackTileEntityRenderer::new).group(ModItemGroups.EMBELLISHCRAFT), ECConstants.bedBurnTime).setRegistryName(
        // block.getRegistryName()));

        event.getRegistry().register(
            new FuelBlockItem(BROWN_PILLOW, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), ECConstants.doorBurnTime).setRegistryName(BROWN_PILLOW.getRegistryName()));
        event.getRegistry().register(
            new FuelBlockItem(BLACK_PILLOW, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), ECConstants.doorBurnTime).setRegistryName(BLACK_PILLOW.getRegistryName()));
        event.getRegistry().register(
            new FuelBlockItem(BLUE_PILLOW, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), ECConstants.doorBurnTime).setRegistryName(BLUE_PILLOW.getRegistryName()));
        event.getRegistry().register(
            new FuelBlockItem(CYAN_PILLOW, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), ECConstants.doorBurnTime).setRegistryName(CYAN_PILLOW.getRegistryName()));
        event.getRegistry().register(
            new FuelBlockItem(GRAY_PILLOW, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), ECConstants.doorBurnTime).setRegistryName(GRAY_PILLOW.getRegistryName()));
        event.getRegistry().register(
            new FuelBlockItem(GREEN_PILLOW, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), ECConstants.doorBurnTime).setRegistryName(GREEN_PILLOW.getRegistryName()));
        event.getRegistry().register(
            new FuelBlockItem(LIGHT_BLUE_PILLOW, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), ECConstants.doorBurnTime).setRegistryName(LIGHT_BLUE_PILLOW.getRegistryName()));
        event.getRegistry().register(
            new FuelBlockItem(LIGHT_GRAY_PILLOW, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), ECConstants.doorBurnTime).setRegistryName(LIGHT_GRAY_PILLOW.getRegistryName()));
        event.getRegistry().register(
            new FuelBlockItem(LIME_PILLOW, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), ECConstants.doorBurnTime).setRegistryName(LIME_PILLOW.getRegistryName()));
        event.getRegistry().register(
            new FuelBlockItem(MAGENTA_PILLOW, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), ECConstants.doorBurnTime).setRegistryName(MAGENTA_PILLOW.getRegistryName()));
        event.getRegistry().register(
            new FuelBlockItem(ORANGE_PILLOW, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), ECConstants.doorBurnTime).setRegistryName(ORANGE_PILLOW.getRegistryName()));
        event.getRegistry().register(
            new FuelBlockItem(PINK_PILLOW, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), ECConstants.doorBurnTime).setRegistryName(PINK_PILLOW.getRegistryName()));
        event.getRegistry().register(
            new FuelBlockItem(PURPLE_PILLOW, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), ECConstants.doorBurnTime).setRegistryName(PURPLE_PILLOW.getRegistryName()));
        event.getRegistry().register(new FuelBlockItem(RED_PILLOW, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), ECConstants.doorBurnTime).setRegistryName(RED_PILLOW.getRegistryName()));
        event.getRegistry().register(
            new FuelBlockItem(WHITE_PILLOW, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), ECConstants.doorBurnTime).setRegistryName(WHITE_PILLOW.getRegistryName()));
        event.getRegistry().register(
            new FuelBlockItem(YELLOW_PILLOW, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), ECConstants.doorBurnTime).setRegistryName(YELLOW_PILLOW.getRegistryName()));

        // Door

        event.getRegistry().register(
            new FuelBlockItem(OAK_FANCY_DOOR, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), ECConstants.doorBurnTime).setRegistryName(OAK_FANCY_DOOR.getRegistryName()));
        event.getRegistry().register(
            new FuelBlockItem(BIRCH_FANCY_DOOR, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), ECConstants.doorBurnTime).setRegistryName(BIRCH_FANCY_DOOR.getRegistryName()));
        event.getRegistry().register(
            new FuelBlockItem(SPRUCE_FANCY_DOOR, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), ECConstants.doorBurnTime).setRegistryName(SPRUCE_FANCY_DOOR.getRegistryName()));
        event.getRegistry().register(
            new FuelBlockItem(JUNGLE_FANCY_DOOR, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), ECConstants.doorBurnTime).setRegistryName(JUNGLE_FANCY_DOOR.getRegistryName()));
        event.getRegistry().register(
            new FuelBlockItem(DARK_OAK_FANCY_DOOR, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), ECConstants.doorBurnTime).setRegistryName(DARK_OAK_FANCY_DOOR.getRegistryName()));
        event.getRegistry().register(
            new FuelBlockItem(ACACIA_FANCY_DOOR, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), ECConstants.doorBurnTime).setRegistryName(ACACIA_FANCY_DOOR.getRegistryName()));

        event.getRegistry().register(new BlockItem(STEEL_DOOR, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)).setRegistryName(STEEL_DOOR.getRegistryName()));
        event.getRegistry().register(new BlockItem(STURDY_STEEL_DOOR, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)).setRegistryName(STURDY_STEEL_DOOR.getRegistryName()));
        event.getRegistry().register(new BlockItem(WARNING_STEEL_DOOR, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)).setRegistryName(WARNING_STEEL_DOOR.getRegistryName()));
        event.getRegistry().register(new BlockItem(WHITE_STEEL_DOOR, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)).setRegistryName(WHITE_STEEL_DOOR.getRegistryName()));
        event.getRegistry().register(new BlockItem(STURDY_WHITE_STEEL_DOOR, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)).setRegistryName(STURDY_WHITE_STEEL_DOOR.getRegistryName()));
        event.getRegistry().register(new BlockItem(WARNING_WHITE_STEEL_DOOR, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)).setRegistryName(WARNING_WHITE_STEEL_DOOR.getRegistryName()));
        event.getRegistry().register(new BlockItem(RUSTY_DOOR, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)).setRegistryName(RUSTY_DOOR.getRegistryName()));
        event.getRegistry().register(new BlockItem(STURDY_RUSTY_DOOR, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)).setRegistryName(STURDY_RUSTY_DOOR.getRegistryName()));
        event.getRegistry().register(new BlockItem(WARNING_RUSTY_DOOR, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)).setRegistryName(WARNING_RUSTY_DOOR.getRegistryName()));

        // Stairs

        event.getRegistry().register(new BlockItem(STEEL_SUSPENDED_STAIRS, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)).setRegistryName(STEEL_SUSPENDED_STAIRS.getRegistryName()));
        event.getRegistry().register(new FuelBlockItem(OAK_SUSPENDED_STAIRS, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), ECConstants.suspendedStairBurnTime).setRegistryName(
            OAK_SUSPENDED_STAIRS.getRegistryName()));
        event.getRegistry().register(new FuelBlockItem(BIRCH_SUSPENDED_STAIRS, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), ECConstants.suspendedStairBurnTime).setRegistryName(
            BIRCH_SUSPENDED_STAIRS.getRegistryName()));
        event.getRegistry().register(new FuelBlockItem(SPRUCE_SUSPENDED_STAIRS, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), ECConstants.suspendedStairBurnTime).setRegistryName(
            SPRUCE_SUSPENDED_STAIRS.getRegistryName()));
        event.getRegistry().register(new FuelBlockItem(JUNGLE_SUSPENDED_STAIRS, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), ECConstants.suspendedStairBurnTime).setRegistryName(
            JUNGLE_SUSPENDED_STAIRS.getRegistryName()));
        event.getRegistry().register(new FuelBlockItem(DARK_OAK_SUSPENDED_STAIRS, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), ECConstants.suspendedStairBurnTime).setRegistryName(
            DARK_OAK_SUSPENDED_STAIRS.getRegistryName()));
        event.getRegistry().register(new FuelBlockItem(ACACIA_SUSPENDED_STAIRS, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), ECConstants.suspendedStairBurnTime).setRegistryName(
            ACACIA_SUSPENDED_STAIRS.getRegistryName()));

        // Chests

        // event.getRegistry().register(new FuelBlockItem(OAK_FANCY_CHEST, new Item.Properties().setTEISR(() -> CustomChestItemStackTileEntityRenderer::new).group(
        // ModItemGroups.EMBELLISHCRAFT), ECConstants.chestBurnTime).setRegistryName(OAK_FANCY_CHEST.getRegistryName()));
        // event.getRegistry().register(new FuelBlockItem(BIRCH_FANCY_CHEST, new Item.Properties().setTEISR(() -> CustomChestItemStackTileEntityRenderer::new).group(
        // ModItemGroups.EMBELLISHCRAFT), ECConstants.chestBurnTime).setRegistryName(BIRCH_FANCY_CHEST.getRegistryName()));
        // event.getRegistry().register(new FuelBlockItem(SPRUCE_FANCY_CHEST, new Item.Properties().setTEISR(() -> CustomChestItemStackTileEntityRenderer::new).group(
        // ModItemGroups.EMBELLISHCRAFT), ECConstants.chestBurnTime).setRegistryName(SPRUCE_FANCY_CHEST.getRegistryName()));
        // event.getRegistry().register(new FuelBlockItem(JUNGLE_FANCY_CHEST, new Item.Properties().setTEISR(() -> CustomChestItemStackTileEntityRenderer::new).group(
        // ModItemGroups.EMBELLISHCRAFT), ECConstants.chestBurnTime).setRegistryName(JUNGLE_FANCY_CHEST.getRegistryName()));
        // event.getRegistry().register(new FuelBlockItem(DARK_OAK_FANCY_CHEST, new Item.Properties().setTEISR(() -> CustomChestItemStackTileEntityRenderer::new).group(
        // ModItemGroups.EMBELLISHCRAFT), ECConstants.chestBurnTime).setRegistryName(DARK_OAK_FANCY_CHEST.getRegistryName()));
        // event.getRegistry().register(new FuelBlockItem(ACACIA_FANCY_CHEST, new Item.Properties().setTEISR(() -> CustomChestItemStackTileEntityRenderer::new).group(
        // ModItemGroups.EMBELLISHCRAFT), ECConstants.chestBurnTime).setRegistryName(ACACIA_FANCY_CHEST.getRegistryName()));
        //
        // event.getRegistry().register(
        // new BlockItem(LOCKER, new Item.Properties().setTEISR(() -> VerticalChestItemStackTileEntityRenderer::new).group(ModItemGroups.EMBELLISHCRAFT)).setRegistryName(LOCKER.getRegistryName()));

        event.getRegistry().register(new BlockItem(OAK_WOODEN_CRATE, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT).maxStackSize(1)).setRegistryName(OAK_WOODEN_CRATE.getRegistryName()));
        event.getRegistry().register(
            new BlockItem(BIRCH_WOODEN_CRATE, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT).maxStackSize(1)).setRegistryName(BIRCH_WOODEN_CRATE.getRegistryName()));
        event.getRegistry().register(
            new BlockItem(SPRUCE_WOODEN_CRATE, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT).maxStackSize(1)).setRegistryName(SPRUCE_WOODEN_CRATE.getRegistryName()));
        event.getRegistry().register(
            new BlockItem(JUNGLE_WOODEN_CRATE, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT).maxStackSize(1)).setRegistryName(JUNGLE_WOODEN_CRATE.getRegistryName()));
        event.getRegistry().register(
            new BlockItem(DARK_OAK_WOODEN_CRATE, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT).maxStackSize(1)).setRegistryName(DARK_OAK_WOODEN_CRATE.getRegistryName()));
        event.getRegistry().register(
            new BlockItem(ACACIA_WOODEN_CRATE, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT).maxStackSize(1)).setRegistryName(ACACIA_WOODEN_CRATE.getRegistryName()));

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
    private static void createBlockWithVariants(RegistryEvent.Register<Block> event, String name, boolean stairs, boolean slab, boolean wall, boolean pressure, Material material, SoundType sound, ToolType toolType)
    {
        Block block; // Needed to register the stairs
        event.getRegistry().register(block = new CustomBlock(Block.Properties.create(material).hardnessAndResistance(1.5F, 6.0F).sound(sound), toolType).setRegistryName(name));
        if(stairs)
            event.getRegistry().register(
                new CustomStairsBlock(block.getDefaultState(), Block.Properties.create(material).hardnessAndResistance(1.5F, 6.0F).sound(sound), toolType).setRegistryName(name + "_stairs"));
        if(slab)
            event.getRegistry().register(new CustomSlabBlock(Block.Properties.create(material).hardnessAndResistance(1.5F, 6.0F).sound(sound), toolType).setRegistryName(name + "_slab"));
        if(wall)
            event.getRegistry().register(new CustomWallBlock(Block.Properties.create(material).hardnessAndResistance(1.5F, 6.0F).sound(sound), toolType).setRegistryName(name + "_wall"));
        if(pressure)
            event.getRegistry().register(new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(material).doesNotBlockMovement().hardnessAndResistance(0.5F).sound(
                sound), toolType).setRegistryName(name + "_pressure_plate"));

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