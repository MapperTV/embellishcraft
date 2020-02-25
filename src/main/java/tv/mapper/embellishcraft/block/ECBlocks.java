package tv.mapper.embellishcraft.block;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.RotatedPillarBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.item.BlockItem;
import net.minecraft.item.DyeColor;
import net.minecraft.item.Item;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.ObjectHolder;
import tv.mapper.embellishcraft.ECConstants;
import tv.mapper.embellishcraft.item.FuelBlockItem;
import tv.mapper.embellishcraft.item.ModItemGroups;
import tv.mapper.embellishcraft.util.WoodType;
import tv.mapper.mapperbase.block.AllRotationBlock;
import tv.mapper.mapperbase.block.CustomDoorBlock;
import tv.mapper.mapperbase.block.CustomLadderBlock;
import tv.mapper.mapperbase.block.UpDownBlock;
import tv.mapper.mapperbase.util.RegistryUtils;

@ObjectHolder(ECConstants.MODID)
@EventBusSubscriber(bus = Bus.MOD)
public class ECBlocks
{
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
        // Tiles

        RegistryUtils.createBlockWithVariants(event, "concrete_tiles", true, true, true, true, Material.ROCK, MaterialColor.STONE, SoundType.STONE, ToolType.PICKAXE, 0, 0);
        RegistryUtils.createBlockWithVariants(event, "skyblue_tiles", true, true, true, true, Material.ROCK, MaterialColor.LIGHT_BLUE, SoundType.STONE, ToolType.PICKAXE, 0, 0);
        RegistryUtils.createBlockWithVariants(event, "orange_tiles", true, true, true, true, Material.ROCK, MaterialColor.ORANGE_TERRACOTTA, SoundType.STONE, ToolType.PICKAXE, 0, 0);
        RegistryUtils.createBlockWithVariants(event, "blue_tiles", true, true, true, true, Material.ROCK, MaterialColor.BLUE, SoundType.STONE, ToolType.PICKAXE, 0, 0);
        RegistryUtils.createBlockWithVariants(event, "light_blue_tiles", true, true, true, true, Material.ROCK, MaterialColor.LIGHT_BLUE, SoundType.STONE, ToolType.PICKAXE, 0, 0);
        RegistryUtils.createBlockWithVariants(event, "red_tiles", true, true, true, true, Material.ROCK, MaterialColor.RED, SoundType.STONE, ToolType.PICKAXE, 0, 0);
        RegistryUtils.createBlockWithVariants(event, "white_tiles", true, true, true, true, Material.ROCK, MaterialColor.WHITE_TERRACOTTA, SoundType.STONE, ToolType.PICKAXE, 0, 0);
        RegistryUtils.createBlockWithVariants(event, "yellow_tiles", true, true, true, true, Material.ROCK, MaterialColor.YELLOW, SoundType.STONE, ToolType.PICKAXE, 0, 0);
        RegistryUtils.createBlockWithVariants(event, "yellow_grey_tiles", true, true, true, true, Material.ROCK, MaterialColor.YELLOW_TERRACOTTA, SoundType.STONE, ToolType.PICKAXE, 0, 0);

        // Wallpaper

        RegistryUtils.createBlockWithVariants(event, "white_blue_wallpaper", true, true, false, false, Material.ROCK, MaterialColor.LIGHT_BLUE_TERRACOTTA, SoundType.STONE, ToolType.PICKAXE, 0, 0);
        event.getRegistry().register(
            new UpDownBlock(Block.Properties.create(Material.ROCK, MaterialColor.LIGHT_BLUE_TERRACOTTA).hardnessAndResistance(0.5f).sound(SoundType.STONE), ToolType.PICKAXE).setRegistryName(
                "white_blue_wallpaper_plinth"));
        RegistryUtils.createBlockWithVariants(event, "beige_wallpaper", true, true, false, false, Material.ROCK, MaterialColor.WHITE_TERRACOTTA, SoundType.STONE, ToolType.PICKAXE, 0, 0);
        event.getRegistry().register(new UpDownBlock(Block.Properties.create(Material.ROCK, MaterialColor.WHITE_TERRACOTTA).hardnessAndResistance(0.5f).sound(SoundType.STONE), ToolType.PICKAXE).setRegistryName(
            "beige_wallpaper_plinth"));
        RegistryUtils.createBlockWithVariants(event, "pink_wallpaper", true, true, false, false, Material.ROCK, MaterialColor.PINK, SoundType.STONE, ToolType.PICKAXE, 0, 0);
        event.getRegistry().register(
            new UpDownBlock(Block.Properties.create(Material.ROCK, MaterialColor.PINK).hardnessAndResistance(0.5f).sound(SoundType.STONE), ToolType.PICKAXE).setRegistryName("pink_wallpaper_plinth"));
        RegistryUtils.createBlockWithVariants(event, "beige_flower_wallpaper", true, true, false, false, Material.ROCK, MaterialColor.WHITE_TERRACOTTA, SoundType.STONE, ToolType.PICKAXE, 0, 0);
        event.getRegistry().register(new UpDownBlock(Block.Properties.create(Material.ROCK, MaterialColor.WHITE_TERRACOTTA).hardnessAndResistance(0.5f).sound(SoundType.STONE), ToolType.PICKAXE).setRegistryName(
            "beige_flower_wallpaper_plinth"));
        RegistryUtils.createBlockWithVariants(event, "white_green_wallpaper", true, true, false, false, Material.ROCK, MaterialColor.LIME, SoundType.STONE, ToolType.PICKAXE, 0, 0);
        event.getRegistry().register(
            new UpDownBlock(Block.Properties.create(Material.ROCK, MaterialColor.LIME).hardnessAndResistance(0.5f).sound(SoundType.STONE), ToolType.PICKAXE).setRegistryName("white_green_wallpaper_plinth"));

        // Metal

        RegistryUtils.createBlockWithVariants(event, "dark_metal_floor", true, true, true, true, Material.IRON, MaterialColor.STONE, SoundType.LANTERN, ToolType.PICKAXE, 0, 0);
        RegistryUtils.createBlockWithVariants(event, "light_metal_floor", true, true, true, true, Material.IRON, MaterialColor.IRON, SoundType.LANTERN, ToolType.PICKAXE, 0, 0);
        RegistryUtils.createBlockWithVariants(event, "rusty_plate", true, true, true, true, Material.IRON, MaterialColor.ADOBE, SoundType.LANTERN, ToolType.PICKAXE, 0, 0);

        event.getRegistry().register(new RotatedPillarBlock(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(0.8F).sound(SoundType.LANTERN)).setRegistryName("iron_beam"));
        event.getRegistry().register(new RotatedPillarBlock(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(0.8F).sound(SoundType.LANTERN)).setRegistryName("bolted_iron_beam"));
        RegistryUtils.createBlockWithVariants(event, "iron_beam_junction", false, false, false, false, Material.IRON, MaterialColor.IRON, SoundType.LANTERN, ToolType.PICKAXE, 0, 0);
        event.getRegistry().register(new RotatedPillarBlock(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(0.8F).sound(SoundType.LANTERN)).setRegistryName("steel_beam"));
        event.getRegistry().register(
            new RotatedPillarBlock(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(0.8F).sound(SoundType.LANTERN)).setRegistryName("bolted_steel_beam"));
        RegistryUtils.createBlockWithVariants(event, "steel_beam_junction", false, false, false, false, Material.IRON, MaterialColor.IRON, SoundType.LANTERN, ToolType.PICKAXE, 0, 0);

        RegistryUtils.createBlockWithVariants(event, "air_duct", false, false, false, false, Material.IRON, MaterialColor.IRON, SoundType.LANTERN, ToolType.PICKAXE, 0, 0);
        event.getRegistry().register(new AllRotationBlock(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(0.8F).sound(SoundType.LANTERN)).setRegistryName("vent_air_duct"));
        event.getRegistry().register(new AllRotationBlock(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(0.8F).sound(SoundType.LANTERN)).setRegistryName("grid_air_duct"));

        RegistryUtils.createBlockWithVariants(event, "bulkhead", false, false, false, false, Material.IRON, MaterialColor.STONE, SoundType.METAL, ToolType.PICKAXE, 0, 0);
        RegistryUtils.createBlockWithVariants(event, "bulkhead_top", false, false, false, false, Material.IRON, MaterialColor.STONE, SoundType.METAL, ToolType.PICKAXE, 0, 0);

        event.getRegistry().register(
            new CustomLadderBlock(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(0.8F).sound(SoundType.LANTERN).notSolid(), ToolType.PICKAXE).setRegistryName(
                "steel_wall_ladder"));
        event.getRegistry().register(
            new CustomLadderBlock(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(0.8F).sound(SoundType.LANTERN).notSolid(), ToolType.PICKAXE).setRegistryName(
                "rusty_wall_ladder"));
        event.getRegistry().register(
            new CustomLadderBlock(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(0.8F).sound(SoundType.LANTERN).notSolid(), ToolType.PICKAXE).setRegistryName("steel_rungs"));
        event.getRegistry().register(
            new CustomLadderBlock(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(0.8F).sound(SoundType.LANTERN).notSolid(), ToolType.PICKAXE).setRegistryName("rusty_rungs"));

        // Furniture

        Block block;

        for(int i = 0; i < 6; i++)
        {
            event.getRegistry().register(new ChairBlock(Block.Properties.create(Material.WOOD, MaterialColor.WOOD).hardnessAndResistance(0.75F, 0.5F).sound(SoundType.WOOD), ToolType.AXE).setRegistryName(
                WoodType.byId(i).getName() + "_chair"));
            event.getRegistry().register(
                block = new TerraceTableBlock(Block.Properties.create(Material.WOOD, MaterialColor.WOOD).hardnessAndResistance(0.75F, 0.5F).sound(SoundType.WOOD), ToolType.AXE).setRegistryName(
                    WoodType.byId(i).getName() + "_terrace_table"));
            RENDER_CUTOUT.add(block);
            event.getRegistry().register(
                block = new TerraceChairBlock(Block.Properties.create(Material.WOOD, MaterialColor.WOOD).hardnessAndResistance(0.75F, 0.5F).sound(SoundType.WOOD), ToolType.AXE).setRegistryName(
                    WoodType.byId(i).getName() + "_terrace_chair"));
            RENDER_CUTOUT.add(block);
            event.getRegistry().register(new TableBlock(Block.Properties.create(Material.WOOD, MaterialColor.WOOD).hardnessAndResistance(0.75F, 0.5F).sound(SoundType.WOOD), ToolType.AXE).setRegistryName(
                WoodType.byId(i).getName() + "_table"));
            event.getRegistry().register(new FancyTableBlock(Block.Properties.create(Material.WOOD, MaterialColor.WOOD).hardnessAndResistance(0.75F, 0.5F).sound(SoundType.WOOD), ToolType.AXE).setRegistryName(
                WoodType.byId(i).getName() + "_fancy_table"));
            event.getRegistry().register(new CustomDoorBlock(Block.Properties.create(Material.WOOD, MaterialColor.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD), ToolType.AXE).setRegistryName(
                WoodType.byId(i).getName() + "_fancy_door"));
            event.getRegistry().register(new SuspendedStairsBlock(Block.Properties.create(Material.WOOD, MaterialColor.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD), ToolType.AXE).setRegistryName(
                WoodType.byId(i).getName() + "_suspended_stairs"));
            // event.getRegistry().register(
            // block = new CustomChestBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.5F).sound(SoundType.WOOD), CustomChestType.OAK_FANCY, WoodType.byId(i)).setRegistryName(
            // WoodType.byId(i).getName() + "_fancy_chest"));
            // FANCY_CHESTS.add(block);

            event.getRegistry().register(
                new CrateBlock(Block.Properties.create(Material.WOOD, MaterialColor.WOOD).hardnessAndResistance(2.5F).sound(SoundType.WOOD)).setRegistryName(WoodType.byId(i).getName() + "_wooden_crate"));

        }

        event.getRegistry().register(
            new TerraceTableBlock(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(0.75F, 0.5F).sound(SoundType.LANTERN), ToolType.PICKAXE).setRegistryName(
                "metallic_terrace_table"));
        event.getRegistry().register(
            new TerraceChairBlock(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(0.75F, 0.5F).sound(SoundType.LANTERN), ToolType.PICKAXE).setRegistryName(
                "metallic_terrace_chair"));

        event.getRegistry().register(new PlateBlock(Block.Properties.create(Material.GLASS, MaterialColor.QUARTZ).hardnessAndResistance(0.25F).sound(SoundType.GLASS)).setRegistryName("plate"));

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
            new CouchBlock(Block.Properties.create(Material.WOOD, MaterialColor.LIGHT_BLUE).hardnessAndResistance(0.75F, 0.5F).sound(SoundType.CLOTH), ToolType.AXE).setRegistryName("light_blue_couch"));
        event.getRegistry().register(
            new CouchBlock(Block.Properties.create(Material.WOOD, MaterialColor.LIGHT_GRAY).hardnessAndResistance(0.75F, 0.5F).sound(SoundType.CLOTH), ToolType.AXE).setRegistryName("light_gray_couch"));
        event.getRegistry().register(
            new CouchBlock(Block.Properties.create(Material.WOOD, MaterialColor.LIME).hardnessAndResistance(0.75F, 0.5F).sound(SoundType.CLOTH), ToolType.AXE).setRegistryName("lime_couch"));
        event.getRegistry().register(
            new CouchBlock(Block.Properties.create(Material.WOOD, MaterialColor.MAGENTA).hardnessAndResistance(0.75F, 0.5F).sound(SoundType.CLOTH), ToolType.AXE).setRegistryName("magenta_couch"));
        event.getRegistry().register(
            new CouchBlock(Block.Properties.create(Material.WOOD, MaterialColor.ORANGE_TERRACOTTA).hardnessAndResistance(0.75F, 0.5F).sound(SoundType.CLOTH), ToolType.AXE).setRegistryName("orange_couch"));
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
            RegistryUtils.createBlockWithVariants(event, DyeColor.byId(j).getName() + "_corrugated_metal_plate", true, true, true, true, Material.IRON, null, SoundType.METAL, ToolType.PICKAXE, j, j);
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
            new CustomDoorBlock(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(5.0F).sound(SoundType.LANTERN), ToolType.PICKAXE).setRegistryName("sturdy_steel_door"));
        event.getRegistry().register(
            new CustomDoorBlock(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(3.0F).sound(SoundType.LANTERN), ToolType.PICKAXE).setRegistryName("warning_steel_door"));
        event.getRegistry().register(
            new CustomDoorBlock(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(3.0F).sound(SoundType.LANTERN), ToolType.PICKAXE).setRegistryName("white_steel_door"));
        event.getRegistry().register(
            new CustomDoorBlock(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(5.0F).sound(SoundType.LANTERN), ToolType.PICKAXE).setRegistryName("sturdy_white_steel_door"));
        event.getRegistry().register(
            new CustomDoorBlock(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(3.0F).sound(SoundType.LANTERN), ToolType.PICKAXE).setRegistryName("warning_white_steel_door"));
        event.getRegistry().register(
            new CustomDoorBlock(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(3.0F).sound(SoundType.LANTERN), ToolType.PICKAXE).setRegistryName("rusty_door"));
        event.getRegistry().register(
            new CustomDoorBlock(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(5.0F).sound(SoundType.LANTERN), ToolType.PICKAXE).setRegistryName("sturdy_rusty_door"));
        event.getRegistry().register(
            new CustomDoorBlock(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(3.0F).sound(SoundType.LANTERN), ToolType.PICKAXE).setRegistryName("warning_rusty_door"));

        // Stairs

        event.getRegistry().register(new SuspendedStairsBlock(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(3.0F).sound(SoundType.LANTERN), ToolType.PICKAXE).setRegistryName(
            "steel_suspended_stairs"));

        // Chests

        // event.getRegistry().register(new VerticalChestBlock(Block.Properties.create(Material.IRON).hardnessAndResistance(2.5F).sound(SoundType.METAL)).setRegistryName("locker"));

    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event)
    {
        // Tiles

        RegistryUtils.createItemBlockWithVariants(event, ModItemGroups.EMBELLISHCRAFT, CONCRETE_TILES, CONCRETE_TILES_STAIRS, CONCRETE_TILES_SLAB, CONCRETE_TILES_WALL, CONCRETE_TILES_PRESSURE_PLATE);
        RegistryUtils.createItemBlockWithVariants(event, ModItemGroups.EMBELLISHCRAFT, SKYBLUE_TILES, SKYBLUE_TILES_STAIRS, SKYBLUE_TILES_SLAB, SKYBLUE_TILES_WALL, SKYBLUE_TILES_PRESSURE_PLATE);
        RegistryUtils.createItemBlockWithVariants(event, ModItemGroups.EMBELLISHCRAFT, ORANGE_TILES, ORANGE_TILES_STAIRS, ORANGE_TILES_SLAB, ORANGE_TILES_WALL, ORANGE_TILES_PRESSURE_PLATE);
        RegistryUtils.createItemBlockWithVariants(event, ModItemGroups.EMBELLISHCRAFT, BLUE_TILES, BLUE_TILES_STAIRS, BLUE_TILES_SLAB, BLUE_TILES_WALL, BLUE_TILES_PRESSURE_PLATE);
        RegistryUtils.createItemBlockWithVariants(event, ModItemGroups.EMBELLISHCRAFT, LIGHT_BLUE_TILES, LIGHT_BLUE_TILES_STAIRS, LIGHT_BLUE_TILES_SLAB, LIGHT_BLUE_TILES_WALL, LIGHT_BLUE_TILES_PRESSURE_PLATE);
        RegistryUtils.createItemBlockWithVariants(event, ModItemGroups.EMBELLISHCRAFT, RED_TILES, RED_TILES_STAIRS, RED_TILES_SLAB, RED_TILES_WALL, RED_TILES_PRESSURE_PLATE);
        RegistryUtils.createItemBlockWithVariants(event, ModItemGroups.EMBELLISHCRAFT, WHITE_TILES, WHITE_TILES_STAIRS, WHITE_TILES_SLAB, WHITE_TILES_WALL, WHITE_TILES_PRESSURE_PLATE);
        RegistryUtils.createItemBlockWithVariants(event, ModItemGroups.EMBELLISHCRAFT, YELLOW_TILES, YELLOW_TILES_STAIRS, YELLOW_TILES_SLAB, YELLOW_TILES_WALL, YELLOW_TILES_PRESSURE_PLATE);
        RegistryUtils.createItemBlockWithVariants(event, ModItemGroups.EMBELLISHCRAFT, YELLOW_GREY_TILES, YELLOW_GREY_TILES_STAIRS, YELLOW_GREY_TILES_SLAB, YELLOW_GREY_TILES_WALL,
            YELLOW_GREY_TILES_PRESSURE_PLATE);

        // Wallpapers

        RegistryUtils.createItemBlockWithVariants(event, ModItemGroups.EMBELLISHCRAFT, WHITE_BLUE_WALLPAPER, WHITE_BLUE_WALLPAPER_STAIRS, WHITE_BLUE_WALLPAPER_SLAB, null, null);
        event.getRegistry().register(new BlockItem(WHITE_BLUE_WALLPAPER_PLINTH, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)).setRegistryName(WHITE_BLUE_WALLPAPER_PLINTH.getRegistryName()));
        RegistryUtils.createItemBlockWithVariants(event, ModItemGroups.EMBELLISHCRAFT, BEIGE_WALLPAPER, BEIGE_WALLPAPER_STAIRS, BEIGE_WALLPAPER_SLAB, null, null);
        event.getRegistry().register(new BlockItem(BEIGE_WALLPAPER_PLINTH, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)).setRegistryName(BEIGE_WALLPAPER_PLINTH.getRegistryName()));
        RegistryUtils.createItemBlockWithVariants(event, ModItemGroups.EMBELLISHCRAFT, PINK_WALLPAPER, PINK_WALLPAPER_STAIRS, PINK_WALLPAPER_SLAB, null, null);
        event.getRegistry().register(new BlockItem(PINK_WALLPAPER_PLINTH, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)).setRegistryName(PINK_WALLPAPER_PLINTH.getRegistryName()));
        RegistryUtils.createItemBlockWithVariants(event, ModItemGroups.EMBELLISHCRAFT, BEIGE_FLOWER_WALLPAPER, BEIGE_FLOWER_WALLPAPER_STAIRS, BEIGE_FLOWER_WALLPAPER_SLAB, null, null);
        event.getRegistry().register(new BlockItem(BEIGE_FLOWER_WALLPAPER_PLINTH, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)).setRegistryName(BEIGE_FLOWER_WALLPAPER_PLINTH.getRegistryName()));
        RegistryUtils.createItemBlockWithVariants(event, ModItemGroups.EMBELLISHCRAFT, WHITE_GREEN_WALLPAPER, WHITE_GREEN_WALLPAPER_STAIRS, WHITE_GREEN_WALLPAPER_SLAB, null, null);
        event.getRegistry().register(new BlockItem(WHITE_GREEN_WALLPAPER_PLINTH, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)).setRegistryName(WHITE_GREEN_WALLPAPER_PLINTH.getRegistryName()));

        // Metal

        RegistryUtils.createItemBlockWithVariants(event, ModItemGroups.EMBELLISHCRAFT, DARK_METAL_FLOOR, DARK_METAL_FLOOR_STAIRS, DARK_METAL_FLOOR_SLAB, DARK_METAL_FLOOR_WALL, DARK_METAL_FLOOR_PRESSURE_PLATE);
        RegistryUtils.createItemBlockWithVariants(event, ModItemGroups.EMBELLISHCRAFT, LIGHT_METAL_FLOOR, LIGHT_METAL_FLOOR_STAIRS, LIGHT_METAL_FLOOR_SLAB, LIGHT_METAL_FLOOR_WALL,
            LIGHT_METAL_FLOOR_PRESSURE_PLATE);
        RegistryUtils.createItemBlockWithVariants(event, ModItemGroups.EMBELLISHCRAFT, RUSTY_PLATE, RUSTY_PLATE_STAIRS, RUSTY_PLATE_SLAB, RUSTY_PLATE_WALL, RUSTY_PLATE_PRESSURE_PLATE);

        event.getRegistry().register(new BlockItem(IRON_BEAM, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)).setRegistryName(IRON_BEAM.getRegistryName()));
        event.getRegistry().register(new BlockItem(BOLTED_IRON_BEAM, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)).setRegistryName(BOLTED_IRON_BEAM.getRegistryName()));
        RegistryUtils.createItemBlockWithVariants(event, ModItemGroups.EMBELLISHCRAFT, IRON_BEAM_JUNCTION, null, null, null, null);
        event.getRegistry().register(new BlockItem(STEEL_BEAM, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)).setRegistryName(STEEL_BEAM.getRegistryName()));
        event.getRegistry().register(new BlockItem(BOLTED_STEEL_BEAM, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)).setRegistryName(BOLTED_STEEL_BEAM.getRegistryName()));
        RegistryUtils.createItemBlockWithVariants(event, ModItemGroups.EMBELLISHCRAFT, STEEL_BEAM_JUNCTION, null, null, null, null);

        RegistryUtils.createItemBlockWithVariants(event, ModItemGroups.EMBELLISHCRAFT, AIR_DUCT, null, null, null, null);
        event.getRegistry().register(new BlockItem(VENT_AIR_DUCT, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)).setRegistryName(VENT_AIR_DUCT.getRegistryName()));
        event.getRegistry().register(new BlockItem(GRID_AIR_DUCT, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)).setRegistryName(GRID_AIR_DUCT.getRegistryName()));

        RegistryUtils.createItemBlockWithVariants(event, ModItemGroups.EMBELLISHCRAFT, PURPLE_CORRUGATED_METAL_PLATE, PURPLE_CORRUGATED_METAL_PLATE_STAIRS, PURPLE_CORRUGATED_METAL_PLATE_SLAB,
            PURPLE_CORRUGATED_METAL_PLATE_WALL, PURPLE_CORRUGATED_METAL_PLATE_PRESSURE_PLATE);
        RegistryUtils.createItemBlockWithVariants(event, ModItemGroups.EMBELLISHCRAFT, RED_CORRUGATED_METAL_PLATE, RED_CORRUGATED_METAL_PLATE_STAIRS, RED_CORRUGATED_METAL_PLATE_SLAB,
            RED_CORRUGATED_METAL_PLATE_WALL, RED_CORRUGATED_METAL_PLATE_PRESSURE_PLATE);
        RegistryUtils.createItemBlockWithVariants(event, ModItemGroups.EMBELLISHCRAFT, WHITE_CORRUGATED_METAL_PLATE, WHITE_CORRUGATED_METAL_PLATE_STAIRS, WHITE_CORRUGATED_METAL_PLATE_SLAB,
            WHITE_CORRUGATED_METAL_PLATE_WALL, WHITE_CORRUGATED_METAL_PLATE_PRESSURE_PLATE);
        RegistryUtils.createItemBlockWithVariants(event, ModItemGroups.EMBELLISHCRAFT, YELLOW_CORRUGATED_METAL_PLATE, YELLOW_CORRUGATED_METAL_PLATE_STAIRS, YELLOW_CORRUGATED_METAL_PLATE_SLAB,
            YELLOW_CORRUGATED_METAL_PLATE_WALL, YELLOW_CORRUGATED_METAL_PLATE_PRESSURE_PLATE);
        RegistryUtils.createItemBlockWithVariants(event, ModItemGroups.EMBELLISHCRAFT, BLACK_CORRUGATED_METAL_PLATE, BLACK_CORRUGATED_METAL_PLATE_STAIRS, BLACK_CORRUGATED_METAL_PLATE_SLAB,
            BLACK_CORRUGATED_METAL_PLATE_WALL, BLACK_CORRUGATED_METAL_PLATE_PRESSURE_PLATE);
        RegistryUtils.createItemBlockWithVariants(event, ModItemGroups.EMBELLISHCRAFT, BLUE_CORRUGATED_METAL_PLATE, BLUE_CORRUGATED_METAL_PLATE_STAIRS, BLUE_CORRUGATED_METAL_PLATE_SLAB,
            BLUE_CORRUGATED_METAL_PLATE_WALL, BLUE_CORRUGATED_METAL_PLATE_PRESSURE_PLATE);
        RegistryUtils.createItemBlockWithVariants(event, ModItemGroups.EMBELLISHCRAFT, BROWN_CORRUGATED_METAL_PLATE, BROWN_CORRUGATED_METAL_PLATE_STAIRS, BROWN_CORRUGATED_METAL_PLATE_SLAB,
            BROWN_CORRUGATED_METAL_PLATE_WALL, BROWN_CORRUGATED_METAL_PLATE_PRESSURE_PLATE);
        RegistryUtils.createItemBlockWithVariants(event, ModItemGroups.EMBELLISHCRAFT, CYAN_CORRUGATED_METAL_PLATE, CYAN_CORRUGATED_METAL_PLATE_STAIRS, CYAN_CORRUGATED_METAL_PLATE_SLAB,
            CYAN_CORRUGATED_METAL_PLATE_WALL, CYAN_CORRUGATED_METAL_PLATE_PRESSURE_PLATE);
        RegistryUtils.createItemBlockWithVariants(event, ModItemGroups.EMBELLISHCRAFT, GRAY_CORRUGATED_METAL_PLATE, GRAY_CORRUGATED_METAL_PLATE_STAIRS, GRAY_CORRUGATED_METAL_PLATE_SLAB,
            GRAY_CORRUGATED_METAL_PLATE_WALL, GRAY_CORRUGATED_METAL_PLATE_PRESSURE_PLATE);
        RegistryUtils.createItemBlockWithVariants(event, ModItemGroups.EMBELLISHCRAFT, GREEN_CORRUGATED_METAL_PLATE, GREEN_CORRUGATED_METAL_PLATE_STAIRS, GREEN_CORRUGATED_METAL_PLATE_SLAB,
            GREEN_CORRUGATED_METAL_PLATE_WALL, GREEN_CORRUGATED_METAL_PLATE_PRESSURE_PLATE);
        RegistryUtils.createItemBlockWithVariants(event, ModItemGroups.EMBELLISHCRAFT, LIGHT_BLUE_CORRUGATED_METAL_PLATE, LIGHT_BLUE_CORRUGATED_METAL_PLATE_STAIRS, LIGHT_BLUE_CORRUGATED_METAL_PLATE_SLAB,
            LIGHT_BLUE_CORRUGATED_METAL_PLATE_WALL, LIGHT_BLUE_CORRUGATED_METAL_PLATE_PRESSURE_PLATE);
        RegistryUtils.createItemBlockWithVariants(event, ModItemGroups.EMBELLISHCRAFT, LIGHT_GRAY_CORRUGATED_METAL_PLATE, LIGHT_GRAY_CORRUGATED_METAL_PLATE_STAIRS, LIGHT_GRAY_CORRUGATED_METAL_PLATE_SLAB,
            LIGHT_GRAY_CORRUGATED_METAL_PLATE_WALL, LIGHT_GRAY_CORRUGATED_METAL_PLATE_PRESSURE_PLATE);
        RegistryUtils.createItemBlockWithVariants(event, ModItemGroups.EMBELLISHCRAFT, LIME_CORRUGATED_METAL_PLATE, LIME_CORRUGATED_METAL_PLATE_STAIRS, LIME_CORRUGATED_METAL_PLATE_SLAB,
            LIME_CORRUGATED_METAL_PLATE_WALL, LIME_CORRUGATED_METAL_PLATE_PRESSURE_PLATE);
        RegistryUtils.createItemBlockWithVariants(event, ModItemGroups.EMBELLISHCRAFT, ORANGE_CORRUGATED_METAL_PLATE, ORANGE_CORRUGATED_METAL_PLATE_STAIRS, ORANGE_CORRUGATED_METAL_PLATE_SLAB,
            ORANGE_CORRUGATED_METAL_PLATE_WALL, ORANGE_CORRUGATED_METAL_PLATE_PRESSURE_PLATE);
        RegistryUtils.createItemBlockWithVariants(event, ModItemGroups.EMBELLISHCRAFT, PINK_CORRUGATED_METAL_PLATE, PINK_CORRUGATED_METAL_PLATE_STAIRS, PINK_CORRUGATED_METAL_PLATE_SLAB,
            PINK_CORRUGATED_METAL_PLATE_WALL, PINK_CORRUGATED_METAL_PLATE_PRESSURE_PLATE);
        RegistryUtils.createItemBlockWithVariants(event, ModItemGroups.EMBELLISHCRAFT, MAGENTA_CORRUGATED_METAL_PLATE, MAGENTA_CORRUGATED_METAL_PLATE_STAIRS, MAGENTA_CORRUGATED_METAL_PLATE_SLAB,
            MAGENTA_CORRUGATED_METAL_PLATE_WALL, MAGENTA_CORRUGATED_METAL_PLATE_PRESSURE_PLATE);

        RegistryUtils.createItemBlockWithVariants(event, ModItemGroups.EMBELLISHCRAFT, BULKHEAD, null, null, null, null);
        RegistryUtils.createItemBlockWithVariants(event, ModItemGroups.EMBELLISHCRAFT, BULKHEAD_TOP, null, null, null, null);

        event.getRegistry().register(new BlockItem(STEEL_WALL_LADDER, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)).setRegistryName(STEEL_WALL_LADDER.getRegistryName()));
        event.getRegistry().register(new BlockItem(RUSTY_WALL_LADDER, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)).setRegistryName(RUSTY_WALL_LADDER.getRegistryName()));
        event.getRegistry().register(new BlockItem(STEEL_RUNGS, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)).setRegistryName(STEEL_RUNGS.getRegistryName()));
        event.getRegistry().register(new BlockItem(RUSTY_RUNGS, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)).setRegistryName(RUSTY_RUNGS.getRegistryName()));

        // Furniture

        event.getRegistry().register(new FuelBlockItem(OAK_CHAIR, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), ECConstants.chairBurnTime).setRegistryName(OAK_CHAIR.getRegistryName()));
        event.getRegistry().register(new FuelBlockItem(DARK_OAK_CHAIR, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), ECConstants.chairBurnTime).setRegistryName(DARK_OAK_CHAIR.getRegistryName()));
        event.getRegistry().register(new FuelBlockItem(BIRCH_CHAIR, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), ECConstants.chairBurnTime).setRegistryName(BIRCH_CHAIR.getRegistryName()));
        event.getRegistry().register(new FuelBlockItem(JUNGLE_CHAIR, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), ECConstants.chairBurnTime).setRegistryName(JUNGLE_CHAIR.getRegistryName()));
        event.getRegistry().register(new FuelBlockItem(SPRUCE_CHAIR, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), ECConstants.chairBurnTime).setRegistryName(SPRUCE_CHAIR.getRegistryName()));
        event.getRegistry().register(new FuelBlockItem(ACACIA_CHAIR, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), ECConstants.chairBurnTime).setRegistryName(ACACIA_CHAIR.getRegistryName()));

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
        event.getRegistry().register(new FuelBlockItem(DARK_OAK_TABLE, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), ECConstants.chairBurnTime).setRegistryName(DARK_OAK_TABLE.getRegistryName()));
        event.getRegistry().register(new FuelBlockItem(BIRCH_TABLE, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), ECConstants.chairBurnTime).setRegistryName(BIRCH_TABLE.getRegistryName()));
        event.getRegistry().register(new FuelBlockItem(JUNGLE_TABLE, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), ECConstants.chairBurnTime).setRegistryName(JUNGLE_TABLE.getRegistryName()));
        event.getRegistry().register(new FuelBlockItem(SPRUCE_TABLE, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), ECConstants.chairBurnTime).setRegistryName(SPRUCE_TABLE.getRegistryName()));
        event.getRegistry().register(new FuelBlockItem(ACACIA_TABLE, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), ECConstants.chairBurnTime).setRegistryName(ACACIA_TABLE.getRegistryName()));

        event.getRegistry().register(new FuelBlockItem(OAK_FANCY_TABLE, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), ECConstants.couchBurnTime).setRegistryName(OAK_FANCY_TABLE.getRegistryName()));
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

        event.getRegistry().register(new FuelBlockItem(BLACK_COUCH, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), ECConstants.couchBurnTime).setRegistryName(BLACK_COUCH.getRegistryName()));
        event.getRegistry().register(new FuelBlockItem(BLUE_COUCH, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), ECConstants.couchBurnTime).setRegistryName(BLUE_COUCH.getRegistryName()));
        event.getRegistry().register(new FuelBlockItem(BROWN_COUCH, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), ECConstants.couchBurnTime).setRegistryName(BROWN_COUCH.getRegistryName()));
        event.getRegistry().register(new FuelBlockItem(CYAN_COUCH, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), ECConstants.couchBurnTime).setRegistryName(CYAN_COUCH.getRegistryName()));
        event.getRegistry().register(new FuelBlockItem(GRAY_COUCH, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), ECConstants.couchBurnTime).setRegistryName(GRAY_COUCH.getRegistryName()));
        event.getRegistry().register(new FuelBlockItem(GREEN_COUCH, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), ECConstants.couchBurnTime).setRegistryName(GREEN_COUCH.getRegistryName()));
        event.getRegistry().register(
            new FuelBlockItem(LIGHT_BLUE_COUCH, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), ECConstants.couchBurnTime).setRegistryName(LIGHT_BLUE_COUCH.getRegistryName()));
        event.getRegistry().register(
            new FuelBlockItem(LIGHT_GRAY_COUCH, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), ECConstants.couchBurnTime).setRegistryName(LIGHT_GRAY_COUCH.getRegistryName()));
        event.getRegistry().register(new FuelBlockItem(LIME_COUCH, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), ECConstants.couchBurnTime).setRegistryName(LIME_COUCH.getRegistryName()));
        event.getRegistry().register(new FuelBlockItem(MAGENTA_COUCH, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), ECConstants.couchBurnTime).setRegistryName(MAGENTA_COUCH.getRegistryName()));
        event.getRegistry().register(new FuelBlockItem(ORANGE_COUCH, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), ECConstants.couchBurnTime).setRegistryName(ORANGE_COUCH.getRegistryName()));
        event.getRegistry().register(new FuelBlockItem(PINK_COUCH, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), ECConstants.couchBurnTime).setRegistryName(PINK_COUCH.getRegistryName()));
        event.getRegistry().register(new FuelBlockItem(PURPLE_COUCH, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), ECConstants.couchBurnTime).setRegistryName(PURPLE_COUCH.getRegistryName()));
        event.getRegistry().register(new FuelBlockItem(RED_COUCH, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), ECConstants.couchBurnTime).setRegistryName(RED_COUCH.getRegistryName()));
        event.getRegistry().register(new FuelBlockItem(WHITE_COUCH, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), ECConstants.couchBurnTime).setRegistryName(WHITE_COUCH.getRegistryName()));
        event.getRegistry().register(new FuelBlockItem(YELLOW_COUCH, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), ECConstants.couchBurnTime).setRegistryName(YELLOW_COUCH.getRegistryName()));

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

        event.getRegistry().register(new FuelBlockItem(BROWN_PILLOW, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), ECConstants.doorBurnTime).setRegistryName(BROWN_PILLOW.getRegistryName()));
        event.getRegistry().register(new FuelBlockItem(BLACK_PILLOW, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), ECConstants.doorBurnTime).setRegistryName(BLACK_PILLOW.getRegistryName()));
        event.getRegistry().register(new FuelBlockItem(BLUE_PILLOW, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), ECConstants.doorBurnTime).setRegistryName(BLUE_PILLOW.getRegistryName()));
        event.getRegistry().register(new FuelBlockItem(CYAN_PILLOW, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), ECConstants.doorBurnTime).setRegistryName(CYAN_PILLOW.getRegistryName()));
        event.getRegistry().register(new FuelBlockItem(GRAY_PILLOW, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), ECConstants.doorBurnTime).setRegistryName(GRAY_PILLOW.getRegistryName()));
        event.getRegistry().register(new FuelBlockItem(GREEN_PILLOW, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), ECConstants.doorBurnTime).setRegistryName(GREEN_PILLOW.getRegistryName()));
        event.getRegistry().register(
            new FuelBlockItem(LIGHT_BLUE_PILLOW, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), ECConstants.doorBurnTime).setRegistryName(LIGHT_BLUE_PILLOW.getRegistryName()));
        event.getRegistry().register(
            new FuelBlockItem(LIGHT_GRAY_PILLOW, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), ECConstants.doorBurnTime).setRegistryName(LIGHT_GRAY_PILLOW.getRegistryName()));
        event.getRegistry().register(new FuelBlockItem(LIME_PILLOW, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), ECConstants.doorBurnTime).setRegistryName(LIME_PILLOW.getRegistryName()));
        event.getRegistry().register(new FuelBlockItem(MAGENTA_PILLOW, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), ECConstants.doorBurnTime).setRegistryName(MAGENTA_PILLOW.getRegistryName()));
        event.getRegistry().register(new FuelBlockItem(ORANGE_PILLOW, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), ECConstants.doorBurnTime).setRegistryName(ORANGE_PILLOW.getRegistryName()));
        event.getRegistry().register(new FuelBlockItem(PINK_PILLOW, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), ECConstants.doorBurnTime).setRegistryName(PINK_PILLOW.getRegistryName()));
        event.getRegistry().register(new FuelBlockItem(PURPLE_PILLOW, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), ECConstants.doorBurnTime).setRegistryName(PURPLE_PILLOW.getRegistryName()));
        event.getRegistry().register(new FuelBlockItem(RED_PILLOW, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), ECConstants.doorBurnTime).setRegistryName(RED_PILLOW.getRegistryName()));
        event.getRegistry().register(new FuelBlockItem(WHITE_PILLOW, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), ECConstants.doorBurnTime).setRegistryName(WHITE_PILLOW.getRegistryName()));
        event.getRegistry().register(new FuelBlockItem(YELLOW_PILLOW, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), ECConstants.doorBurnTime).setRegistryName(YELLOW_PILLOW.getRegistryName()));

        // Door

        event.getRegistry().register(new FuelBlockItem(OAK_FANCY_DOOR, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), ECConstants.doorBurnTime).setRegistryName(OAK_FANCY_DOOR.getRegistryName()));
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
        event.getRegistry().register(
            new FuelBlockItem(OAK_SUSPENDED_STAIRS, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), ECConstants.suspendedStairBurnTime).setRegistryName(OAK_SUSPENDED_STAIRS.getRegistryName()));
        event.getRegistry().register(
            new FuelBlockItem(BIRCH_SUSPENDED_STAIRS, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), ECConstants.suspendedStairBurnTime).setRegistryName(BIRCH_SUSPENDED_STAIRS.getRegistryName()));
        event.getRegistry().register(
            new FuelBlockItem(SPRUCE_SUSPENDED_STAIRS, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), ECConstants.suspendedStairBurnTime).setRegistryName(SPRUCE_SUSPENDED_STAIRS.getRegistryName()));
        event.getRegistry().register(
            new FuelBlockItem(JUNGLE_SUSPENDED_STAIRS, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), ECConstants.suspendedStairBurnTime).setRegistryName(JUNGLE_SUSPENDED_STAIRS.getRegistryName()));
        event.getRegistry().register(new FuelBlockItem(DARK_OAK_SUSPENDED_STAIRS, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), ECConstants.suspendedStairBurnTime).setRegistryName(
            DARK_OAK_SUSPENDED_STAIRS.getRegistryName()));
        event.getRegistry().register(
            new FuelBlockItem(ACACIA_SUSPENDED_STAIRS, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), ECConstants.suspendedStairBurnTime).setRegistryName(ACACIA_SUSPENDED_STAIRS.getRegistryName()));

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
        event.getRegistry().register(new BlockItem(BIRCH_WOODEN_CRATE, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT).maxStackSize(1)).setRegistryName(BIRCH_WOODEN_CRATE.getRegistryName()));
        event.getRegistry().register(new BlockItem(SPRUCE_WOODEN_CRATE, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT).maxStackSize(1)).setRegistryName(SPRUCE_WOODEN_CRATE.getRegistryName()));
        event.getRegistry().register(new BlockItem(JUNGLE_WOODEN_CRATE, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT).maxStackSize(1)).setRegistryName(JUNGLE_WOODEN_CRATE.getRegistryName()));
        event.getRegistry().register(new BlockItem(DARK_OAK_WOODEN_CRATE, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT).maxStackSize(1)).setRegistryName(DARK_OAK_WOODEN_CRATE.getRegistryName()));
        event.getRegistry().register(new BlockItem(ACACIA_WOODEN_CRATE, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT).maxStackSize(1)).setRegistryName(ACACIA_WOODEN_CRATE.getRegistryName()));

    }
}