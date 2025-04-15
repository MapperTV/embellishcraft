package tv.mapper.embellishcraft.building.item;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

import org.apache.commons.lang3.tuple.Pair;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.DyeColor;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import tv.mapper.embellishcraft.building.block.InitBuildingBlocks;
import tv.mapper.embellishcraft.core.ECConstants;
import tv.mapper.embellishcraft.core.util.McWoods;

public class InitBuildingItems
{
    public static final DeferredRegister.Items BUILDING_ITEM_REGISTRY = DeferredRegister.createItems(ECConstants.MODID);

    // Other bricks
    public static final DeferredItem<BlockItem> DARK_BRICKS_ITEM = BUILDING_ITEM_REGISTRY.registerSimpleBlockItem("dark_bricks", InitBuildingBlocks.DARK_BRICKS);
    public static final DeferredItem<BlockItem> DARK_BRICKS_STAIRS_ITEM = BUILDING_ITEM_REGISTRY.registerSimpleBlockItem("dark_bricks_stairs", InitBuildingBlocks.DARK_BRICKS_STAIRS);
    public static final DeferredItem<BlockItem> DARK_BRICKS_SLAB_ITEM = BUILDING_ITEM_REGISTRY.registerSimpleBlockItem("dark_bricks_slab", InitBuildingBlocks.DARK_BRICKS_SLAB);
    public static final DeferredItem<BlockItem> DARK_BRICKS_WALL_ITEM = BUILDING_ITEM_REGISTRY.registerSimpleBlockItem("dark_bricks_wall", InitBuildingBlocks.DARK_BRICKS_WALL);
    public static final DeferredItem<BlockItem> DARK_BRICKS_PRESSURE_PLATE_ITEM = BUILDING_ITEM_REGISTRY.registerSimpleBlockItem("dark_bricks_pressure_plate", InitBuildingBlocks.DARK_BRICKS_PRESSURE_PLATE);

    public static final DeferredItem<BlockItem> DARK_LARGE_BRICKS_ITEM = BUILDING_ITEM_REGISTRY.registerSimpleBlockItem("dark_large_bricks", InitBuildingBlocks.DARK_LARGE_BRICKS);
    public static final DeferredItem<BlockItem> DARK_LARGE_BRICKS_STAIRS_ITEM = BUILDING_ITEM_REGISTRY.registerSimpleBlockItem("dark_large_bricks_stairs", InitBuildingBlocks.DARK_LARGE_BRICKS_STAIRS);
    public static final DeferredItem<BlockItem> DARK_LARGE_BRICKS_SLAB_ITEM = BUILDING_ITEM_REGISTRY.registerSimpleBlockItem("dark_large_bricks_slab", InitBuildingBlocks.DARK_LARGE_BRICKS_SLAB);
    public static final DeferredItem<BlockItem> DARK_LARGE_BRICKS_WALL_ITEM = BUILDING_ITEM_REGISTRY.registerSimpleBlockItem("dark_large_bricks_wall", InitBuildingBlocks.DARK_LARGE_BRICKS_WALL);
    public static final DeferredItem<BlockItem> DARK_LARGE_BRICKS_PRESSURE_PLATE_ITEM = BUILDING_ITEM_REGISTRY.registerSimpleBlockItem("dark_large_bricks_pressure_plate", InitBuildingBlocks.DARK_LARGE_BRICKS_PRESSURE_PLATE);

    public static final DeferredItem<BlockItem> OLD_BRICKS_ITEM = BUILDING_ITEM_REGISTRY.registerSimpleBlockItem("old_bricks", InitBuildingBlocks.OLD_BRICKS);
    public static final DeferredItem<BlockItem> OLD_BRICKS_STAIRS_ITEM = BUILDING_ITEM_REGISTRY.registerSimpleBlockItem("old_bricks_stairs", InitBuildingBlocks.OLD_BRICKS_STAIRS);
    public static final DeferredItem<BlockItem> OLD_BRICKS_SLAB_ITEM = BUILDING_ITEM_REGISTRY.registerSimpleBlockItem("old_bricks_slab", InitBuildingBlocks.OLD_BRICKS_SLAB);
    public static final DeferredItem<BlockItem> OLD_BRICKS_WALL_ITEM = BUILDING_ITEM_REGISTRY.registerSimpleBlockItem("old_bricks_wall", InitBuildingBlocks.OLD_BRICKS_WALL);
    public static final DeferredItem<BlockItem> OLD_BRICKS_PRESSURE_PLATE_ITEM = BUILDING_ITEM_REGISTRY.registerSimpleBlockItem("old_bricks_pressure_plate", InitBuildingBlocks.OLD_BRICKS_PRESSURE_PLATE);

    public static final DeferredItem<BlockItem> OLD_LARGE_BRICKS_ITEM = BUILDING_ITEM_REGISTRY.registerSimpleBlockItem("old_large_bricks", InitBuildingBlocks.OLD_LARGE_BRICKS);
    public static final DeferredItem<BlockItem> OLD_LARGE_BRICKS_STAIRS_ITEM = BUILDING_ITEM_REGISTRY.registerSimpleBlockItem("old_large_bricks_stairs", InitBuildingBlocks.OLD_LARGE_BRICKS_STAIRS);
    public static final DeferredItem<BlockItem> OLD_LARGE_BRICKS_SLAB_ITEM = BUILDING_ITEM_REGISTRY.registerSimpleBlockItem("old_large_bricks_slab", InitBuildingBlocks.OLD_LARGE_BRICKS_SLAB);
    public static final DeferredItem<BlockItem> OLD_LARGE_BRICKS_WALL_ITEM = BUILDING_ITEM_REGISTRY.registerSimpleBlockItem("old_large_bricks_wall", InitBuildingBlocks.OLD_LARGE_BRICKS_WALL);
    public static final DeferredItem<BlockItem> OLD_LARGE_BRICKS_PRESSURE_PLATE_ITEM = BUILDING_ITEM_REGISTRY.registerSimpleBlockItem("old_large_bricks_pressure_plate", InitBuildingBlocks.OLD_LARGE_BRICKS_PRESSURE_PLATE);

    public static final DeferredItem<BlockItem> WEARED_BRICKS_ITEM = BUILDING_ITEM_REGISTRY.registerSimpleBlockItem("weared_bricks", InitBuildingBlocks.WEARED_BRICKS);
    public static final DeferredItem<BlockItem> WEARED_BRICKS_STAIRS_ITEM = BUILDING_ITEM_REGISTRY.registerSimpleBlockItem("weared_bricks_stairs", InitBuildingBlocks.WEARED_BRICKS_STAIRS);
    public static final DeferredItem<BlockItem> WEARED_BRICKS_SLAB_ITEM = BUILDING_ITEM_REGISTRY.registerSimpleBlockItem("weared_bricks_slab", InitBuildingBlocks.WEARED_BRICKS_SLAB);
    public static final DeferredItem<BlockItem> WEARED_BRICKS_WALL_ITEM = BUILDING_ITEM_REGISTRY.registerSimpleBlockItem("weared_bricks_wall", InitBuildingBlocks.WEARED_BRICKS_WALL);
    public static final DeferredItem<BlockItem> WEARED_BRICKS_PRESSURE_PLATE_ITEM = BUILDING_ITEM_REGISTRY.registerSimpleBlockItem("weared_bricks_pressure_plate", InitBuildingBlocks.WEARED_BRICKS_PRESSURE_PLATE);

    public static final DeferredItem<BlockItem> WEARED_LARGE_BRICKS_ITEM = BUILDING_ITEM_REGISTRY.registerSimpleBlockItem("weared_large_bricks", InitBuildingBlocks.WEARED_LARGE_BRICKS);
    public static final DeferredItem<BlockItem> WEARED_LARGE_BRICKS_STAIRS_ITEM = BUILDING_ITEM_REGISTRY.registerSimpleBlockItem("weared_large_bricks_stairs", InitBuildingBlocks.WEARED_LARGE_BRICKS_STAIRS);
    public static final DeferredItem<BlockItem> WEARED_LARGE_BRICKS_SLAB_ITEM = BUILDING_ITEM_REGISTRY.registerSimpleBlockItem("weared_large_bricks_slab", InitBuildingBlocks.WEARED_LARGE_BRICKS_SLAB);
    public static final DeferredItem<BlockItem> WEARED_LARGE_BRICKS_WALL_ITEM = BUILDING_ITEM_REGISTRY.registerSimpleBlockItem("weared_large_bricks_wall", InitBuildingBlocks.WEARED_LARGE_BRICKS_WALL);
    public static final DeferredItem<BlockItem> WEARED_LARGE_BRICKS_PRESSURE_PLATE_ITEM = BUILDING_ITEM_REGISTRY.registerSimpleBlockItem("weared_large_bricks_pressure_plate", InitBuildingBlocks.WEARED_LARGE_BRICKS_PRESSURE_PLATE);

    // Pavings
    public static final DeferredItem<BlockItem> CONCRETE_PAVING_ITEM = BUILDING_ITEM_REGISTRY.registerSimpleBlockItem("concrete_paving", InitBuildingBlocks.CONCRETE_PAVING);
    public static final DeferredItem<BlockItem> CONCRETE_PAVING_STAIRS_ITEM = BUILDING_ITEM_REGISTRY.registerSimpleBlockItem("concrete_paving_stairs", InitBuildingBlocks.CONCRETE_PAVING_STAIRS);
    public static final DeferredItem<BlockItem> CONCRETE_PAVING_SLAB_ITEM = BUILDING_ITEM_REGISTRY.registerSimpleBlockItem("concrete_paving_slab", InitBuildingBlocks.CONCRETE_PAVING_SLAB);
    public static final DeferredItem<BlockItem> CONCRETE_PAVING_WALL_ITEM = BUILDING_ITEM_REGISTRY.registerSimpleBlockItem("concrete_paving_wall", InitBuildingBlocks.CONCRETE_PAVING_WALL);
    public static final DeferredItem<BlockItem> CONCRETE_PAVING_PRESSURE_PLATE_ITEM = BUILDING_ITEM_REGISTRY.registerSimpleBlockItem("concrete_paving_pressure_plate", InitBuildingBlocks.CONCRETE_PAVING_PRESSURE_PLATE);

    public static final DeferredItem<BlockItem> DAMAGED_PAVING_ITEM = BUILDING_ITEM_REGISTRY.registerSimpleBlockItem("damaged_paving", InitBuildingBlocks.DAMAGED_PAVING);
    public static final DeferredItem<BlockItem> DAMAGED_PAVING_STAIRS_ITEM = BUILDING_ITEM_REGISTRY.registerSimpleBlockItem("damaged_paving_stairs", InitBuildingBlocks.DAMAGED_PAVING_STAIRS);
    public static final DeferredItem<BlockItem> DAMAGED_PAVING_SLAB_ITEM = BUILDING_ITEM_REGISTRY.registerSimpleBlockItem("damaged_paving_slab", InitBuildingBlocks.DAMAGED_PAVING_SLAB);
    public static final DeferredItem<BlockItem> DAMAGED_PAVING_WALL_ITEM = BUILDING_ITEM_REGISTRY.registerSimpleBlockItem("damaged_paving_wall", InitBuildingBlocks.DAMAGED_PAVING_WALL);
    public static final DeferredItem<BlockItem> DAMAGED_PAVING_PRESSURE_PLATE_ITEM = BUILDING_ITEM_REGISTRY.registerSimpleBlockItem("damaged_paving_pressure_plate", InitBuildingBlocks.DAMAGED_PAVING_PRESSURE_PLATE);

    public static final DeferredItem<BlockItem> DARK_CONCRETE_PAVING_ITEM = BUILDING_ITEM_REGISTRY.registerSimpleBlockItem("dark_concrete_paving", InitBuildingBlocks.DARK_CONCRETE_PAVING);
    public static final DeferredItem<BlockItem> DARK_CONCRETE_PAVING_STAIRS_ITEM = BUILDING_ITEM_REGISTRY.registerSimpleBlockItem("dark_concrete_paving_stairs", InitBuildingBlocks.DARK_CONCRETE_PAVING_STAIRS);
    public static final DeferredItem<BlockItem> DARK_CONCRETE_PAVING_SLAB_ITEM = BUILDING_ITEM_REGISTRY.registerSimpleBlockItem("dark_concrete_paving_slab", InitBuildingBlocks.DARK_CONCRETE_PAVING_SLAB);
    public static final DeferredItem<BlockItem> DARK_CONCRETE_PAVING_WALL_ITEM = BUILDING_ITEM_REGISTRY.registerSimpleBlockItem("dark_concrete_paving_wall", InitBuildingBlocks.DARK_CONCRETE_PAVING_WALL);
    public static final DeferredItem<BlockItem> DARK_CONCRETE_PAVING_PRESSURE_PLATE_ITEM = BUILDING_ITEM_REGISTRY.registerSimpleBlockItem("dark_concrete_paving_pressure_plate", InitBuildingBlocks.DARK_CONCRETE_PAVING_PRESSURE_PLATE);

    public static final DeferredItem<BlockItem> MOIST_PAVING_ITEM = BUILDING_ITEM_REGISTRY.registerSimpleBlockItem("moist_paving", InitBuildingBlocks.MOIST_PAVING);
    public static final DeferredItem<BlockItem> MOIST_PAVING_STAIRS_ITEM = BUILDING_ITEM_REGISTRY.registerSimpleBlockItem("moist_paving_stairs", InitBuildingBlocks.MOIST_PAVING_STAIRS);
    public static final DeferredItem<BlockItem> MOIST_PAVING_SLAB_ITEM = BUILDING_ITEM_REGISTRY.registerSimpleBlockItem("moist_paving_slab", InitBuildingBlocks.MOIST_PAVING_SLAB);
    public static final DeferredItem<BlockItem> MOIST_PAVING_WALL_ITEM = BUILDING_ITEM_REGISTRY.registerSimpleBlockItem("moist_paving_wall", InitBuildingBlocks.MOIST_PAVING_WALL);
    public static final DeferredItem<BlockItem> MOIST_PAVING_PRESSURE_PLATE_ITEM = BUILDING_ITEM_REGISTRY.registerSimpleBlockItem("moist_paving_pressure_plate", InitBuildingBlocks.MOIST_PAVING_PRESSURE_PLATE);

    public static final DeferredItem<BlockItem> POLISHED_PAVING_ITEM = BUILDING_ITEM_REGISTRY.registerSimpleBlockItem("polished_paving", InitBuildingBlocks.POLISHED_PAVING);
    public static final DeferredItem<BlockItem> POLISHED_PAVING_STAIRS_ITEM = BUILDING_ITEM_REGISTRY.registerSimpleBlockItem("polished_paving_stairs", InitBuildingBlocks.POLISHED_PAVING_STAIRS);
    public static final DeferredItem<BlockItem> POLISHED_PAVING_SLAB_ITEM = BUILDING_ITEM_REGISTRY.registerSimpleBlockItem("polished_paving_slab", InitBuildingBlocks.POLISHED_PAVING_SLAB);
    public static final DeferredItem<BlockItem> POLISHED_PAVING_WALL_ITEM = BUILDING_ITEM_REGISTRY.registerSimpleBlockItem("polished_paving_wall", InitBuildingBlocks.POLISHED_PAVING_WALL);
    public static final DeferredItem<BlockItem> POLISHED_PAVING_PRESSURE_PLATE_ITEM = BUILDING_ITEM_REGISTRY.registerSimpleBlockItem("polished_paving_pressure_plate", InitBuildingBlocks.POLISHED_PAVING_PRESSURE_PLATE);

    public static final DeferredItem<BlockItem> WHITE_CONCRETE_PAVING_ITEM = BUILDING_ITEM_REGISTRY.registerSimpleBlockItem("white_concrete_paving", InitBuildingBlocks.WHITE_CONCRETE_PAVING);
    public static final DeferredItem<BlockItem> WHITE_CONCRETE_PAVING_STAIRS_ITEM = BUILDING_ITEM_REGISTRY.registerSimpleBlockItem("white_concrete_paving_stairs", InitBuildingBlocks.WHITE_CONCRETE_PAVING_STAIRS);
    public static final DeferredItem<BlockItem> WHITE_CONCRETE_PAVING_SLAB_ITEM = BUILDING_ITEM_REGISTRY.registerSimpleBlockItem("white_concrete_paving_slab", InitBuildingBlocks.WHITE_CONCRETE_PAVING_SLAB);
    public static final DeferredItem<BlockItem> WHITE_CONCRETE_PAVING_WALL_ITEM = BUILDING_ITEM_REGISTRY.registerSimpleBlockItem("white_concrete_paving_wall", InitBuildingBlocks.WHITE_CONCRETE_PAVING_WALL);
    public static final DeferredItem<BlockItem> WHITE_CONCRETE_PAVING_PRESSURE_PLATE_ITEM = BUILDING_ITEM_REGISTRY.registerSimpleBlockItem("white_concrete_paving_pressure_plate", InitBuildingBlocks.WHITE_CONCRETE_PAVING_PRESSURE_PLATE);

    // Tiles
    public static final Map<DyeColor, DeferredItem<BlockItem>> TILES_ITEMS = Arrays.stream(DyeColor.values()).map(type -> Pair.of(type, BUILDING_ITEM_REGISTRY.registerSimpleBlockItem(type.getName() + "_tiles", InitBuildingBlocks.TILES_BLOCKS.get(type)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));
    public static final Map<DyeColor, DeferredItem<BlockItem>> TILES_STAIRS_ITEMS = Arrays.stream(DyeColor.values()).map(type -> Pair.of(type, BUILDING_ITEM_REGISTRY.registerSimpleBlockItem(type.getName() + "_tiles_stairs", InitBuildingBlocks.TILES_STAIRS.get(type)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));
    public static final Map<DyeColor, DeferredItem<BlockItem>> TILES_SLABS_ITEMS = Arrays.stream(DyeColor.values()).map(type -> Pair.of(type, BUILDING_ITEM_REGISTRY.registerSimpleBlockItem(type.getName() + "_tiles_slab", InitBuildingBlocks.TILES_SLABS.get(type)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));
    public static final Map<DyeColor, DeferredItem<BlockItem>> TILES_WALLS_ITEMS = Arrays.stream(DyeColor.values()).map(type -> Pair.of(type, BUILDING_ITEM_REGISTRY.registerSimpleBlockItem(type.getName() + "_tiles_wall", InitBuildingBlocks.TILES_WALLS.get(type)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));
    public static final Map<DyeColor, DeferredItem<BlockItem>> TILES_PRESSURE_PLATES_ITEMS = Arrays.stream(DyeColor.values()).map(type -> Pair.of(type, BUILDING_ITEM_REGISTRY.registerSimpleBlockItem(type.getName() + "_tiles_pressure_plate", InitBuildingBlocks.TILES_PRESSURE_PLATES.get(type)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final DeferredItem<BlockItem> CONCRETE_TILES_ITEM = BUILDING_ITEM_REGISTRY.registerSimpleBlockItem("concrete_tiles", InitBuildingBlocks.CONCRETE_TILES);
    public static final DeferredItem<BlockItem> CONCRETE_TILES_STAIRS_ITEM = BUILDING_ITEM_REGISTRY.registerSimpleBlockItem("concrete_tiles_stairs", InitBuildingBlocks.CONCRETE_TILES_STAIRS);
    public static final DeferredItem<BlockItem> CONCRETE_TILES_SLAB_ITEM = BUILDING_ITEM_REGISTRY.registerSimpleBlockItem("concrete_tiles_slab", InitBuildingBlocks.CONCRETE_TILES_SLAB);
    public static final DeferredItem<BlockItem> CONCRETE_TILES_WALL_ITEM = BUILDING_ITEM_REGISTRY.registerSimpleBlockItem("concrete_tiles_wall", InitBuildingBlocks.CONCRETE_TILES_WALL);
    public static final DeferredItem<BlockItem> CONCRETE_TILES_PRESSURE_PLATE_ITEM = BUILDING_ITEM_REGISTRY.registerSimpleBlockItem("concrete_tiles_pressure_plate", InitBuildingBlocks.CONCRETE_TILES_PRESSURE_PLATE);

    public static final DeferredItem<BlockItem> SKYBLUE_TILES_ITEM = BUILDING_ITEM_REGISTRY.registerSimpleBlockItem("skyblue_tiles", InitBuildingBlocks.SKYBLUE_TILES);
    public static final DeferredItem<BlockItem> SKYBLUE_TILES_STAIRS_ITEM = BUILDING_ITEM_REGISTRY.registerSimpleBlockItem("skyblue_tiles_stairs", InitBuildingBlocks.SKYBLUE_TILES_STAIRS);
    public static final DeferredItem<BlockItem> SKYBLUE_TILES_SLAB_ITEM = BUILDING_ITEM_REGISTRY.registerSimpleBlockItem("skyblue_tiles_slab", InitBuildingBlocks.SKYBLUE_TILES_SLAB);
    public static final DeferredItem<BlockItem> SKYBLUE_TILES_WALL_ITEM = BUILDING_ITEM_REGISTRY.registerSimpleBlockItem("skyblue_tiles_wall", InitBuildingBlocks.SKYBLUE_TILES_WALL);
    public static final DeferredItem<BlockItem> SKYBLUE_TILES_PRESSURE_PLATE_ITEM = BUILDING_ITEM_REGISTRY.registerSimpleBlockItem("skyblue_tiles_pressure_plate", InitBuildingBlocks.SKYBLUE_TILES_PRESSURE_PLATE);

    // public static final DeferredItem<BlockItem> ORANGE_TILES_ITEM = BUILDING_ITEM_REGISTRY.registerSimpleBlockItem("orange_tiles", InitBuildingBlocks.ORANGE_TILES);
    // public static final DeferredItem<BlockItem> ORANGE_TILES_STAIRS_ITEM = BUILDING_ITEM_REGISTRY.registerSimpleBlockItem("orange_tiles_stairs", InitBuildingBlocks.ORANGE_TILES_STAIRS);
    // public static final DeferredItem<BlockItem> ORANGE_TILES_SLAB_ITEM = BUILDING_ITEM_REGISTRY.registerSimpleBlockItem("orange_tiles_slab", InitBuildingBlocks.ORANGE_TILES_SLAB);
    // public static final DeferredItem<BlockItem> ORANGE_TILES_WALL_ITEM = BUILDING_ITEM_REGISTRY.registerSimpleBlockItem("orange_tiles_wall", InitBuildingBlocks.ORANGE_TILES_WALL);
    // public static final DeferredItem<BlockItem> ORANGE_TILES_PRESSURE_PLATE_ITEM = BUILDING_ITEM_REGISTRY.registerSimpleBlockItem("orange_tiles_pressure_plate",
    // InitBuildingBlocks.ORANGE_TILES_PRESSURE_PLATE);
    //
    // public static final DeferredItem<BlockItem> BLUE_TILES_ITEM = BUILDING_ITEM_REGISTRY.registerSimpleBlockItem("blue_tiles", InitBuildingBlocks.BLUE_TILES);
    // public static final DeferredItem<BlockItem> BLUE_TILES_STAIRS_ITEM = BUILDING_ITEM_REGISTRY.registerSimpleBlockItem("blue_tiles_stairs", InitBuildingBlocks.BLUE_TILES_STAIRS);
    // public static final DeferredItem<BlockItem> BLUE_TILES_SLAB_ITEM = BUILDING_ITEM_REGISTRY.registerSimpleBlockItem("blue_tiles_slab", InitBuildingBlocks.BLUE_TILES_SLAB);
    // public static final DeferredItem<BlockItem> BLUE_TILES_WALL_ITEM = BUILDING_ITEM_REGISTRY.registerSimpleBlockItem("blue_tiles_wall", InitBuildingBlocks.BLUE_TILES_WALL);
    // public static final DeferredItem<BlockItem> BLUE_TILES_PRESSURE_PLATE_ITEM = BUILDING_ITEM_REGISTRY.registerSimpleBlockItem("blue_tiles_pressure_plate",
    // InitBuildingBlocks.BLUE_TILES_PRESSURE_PLATE);
    //
    // public static final DeferredItem<BlockItem> LIGHT_BLUE_TILES_ITEM = BUILDING_ITEM_REGISTRY.registerSimpleBlockItem("light_blue_tiles", InitBuildingBlocks.LIGHT_BLUE_TILES);
    // public static final DeferredItem<BlockItem> LIGHT_BLUE_TILES_STAIRS_ITEM = BUILDING_ITEM_REGISTRY.registerSimpleBlockItem("light_blue_tiles_stairs", InitBuildingBlocks.LIGHT_BLUE_TILES_STAIRS);
    // public static final DeferredItem<BlockItem> LIGHT_BLUE_TILES_SLAB_ITEM = BUILDING_ITEM_REGISTRY.registerSimpleBlockItem("light_blue_tiles_slab", InitBuildingBlocks.LIGHT_BLUE_TILES_SLAB);
    // public static final DeferredItem<BlockItem> LIGHT_BLUE_TILES_WALL_ITEM = BUILDING_ITEM_REGISTRY.registerSimpleBlockItem("light_blue_tiles_wall", InitBuildingBlocks.LIGHT_BLUE_TILES_WALL);
    // public static final DeferredItem<BlockItem> LIGHT_BLUE_TILES_PRESSURE_PLATE_ITEM = BUILDING_ITEM_REGISTRY.registerSimpleBlockItem("light_blue_tiles_pressure_plate",
    // InitBuildingBlocks.LIGHT_BLUE_TILES_PRESSURE_PLATE);
    //
    // public static final DeferredItem<BlockItem> RED_TILES_ITEM = BUILDING_ITEM_REGISTRY.registerSimpleBlockItem("red_tiles", InitBuildingBlocks.RED_TILES);
    // public static final DeferredItem<BlockItem> RED_TILES_STAIRS_ITEM = BUILDING_ITEM_REGISTRY.registerSimpleBlockItem("red_tiles_stairs", InitBuildingBlocks.RED_TILES_STAIRS);
    // public static final DeferredItem<BlockItem> RED_TILES_SLAB_ITEM = BUILDING_ITEM_REGISTRY.registerSimpleBlockItem("red_tiles_slab", InitBuildingBlocks.RED_TILES_SLAB);
    // public static final DeferredItem<BlockItem> RED_TILES_WALL_ITEM = BUILDING_ITEM_REGISTRY.registerSimpleBlockItem("red_tiles_wall", InitBuildingBlocks.RED_TILES_WALL);
    // public static final DeferredItem<BlockItem> RED_TILES_PRESSURE_PLATE_ITEM = BUILDING_ITEM_REGISTRY.registerSimpleBlockItem("red_tiles_pressure_plate",
    // InitBuildingBlocks.RED_TILES_PRESSURE_PLATE);
    //
    // public static final DeferredItem<BlockItem> WHITE_TILES_ITEM = BUILDING_ITEM_REGISTRY.registerSimpleBlockItem("white_tiles", InitBuildingBlocks.WHITE_TILES);
    // public static final DeferredItem<BlockItem> WHITE_TILES_STAIRS_ITEM = BUILDING_ITEM_REGISTRY.registerSimpleBlockItem("white_tiles_stairs", InitBuildingBlocks.WHITE_TILES_STAIRS);
    // public static final DeferredItem<BlockItem> WHITE_TILES_SLAB_ITEM = BUILDING_ITEM_REGISTRY.registerSimpleBlockItem("white_tiles_slab", InitBuildingBlocks.WHITE_TILES_SLAB);
    // public static final DeferredItem<BlockItem> WHITE_TILES_WALL_ITEM = BUILDING_ITEM_REGISTRY.registerSimpleBlockItem("white_tiles_wall", InitBuildingBlocks.WHITE_TILES_WALL);
    // public static final DeferredItem<BlockItem> WHITE_TILES_PRESSURE_PLATE_ITEM = BUILDING_ITEM_REGISTRY.registerSimpleBlockItem("white_tiles_pressure_plate",
    // InitBuildingBlocks.WHITE_TILES_PRESSURE_PLATE);
    //
    // public static final DeferredItem<BlockItem> YELLOW_TILES_ITEM = BUILDING_ITEM_REGISTRY.registerSimpleBlockItem("yellow_tiles", InitBuildingBlocks.YELLOW_TILES);
    // public static final DeferredItem<BlockItem> YELLOW_TILES_STAIRS_ITEM = BUILDING_ITEM_REGISTRY.registerSimpleBlockItem("yellow_tiles_stairs", InitBuildingBlocks.YELLOW_TILES_STAIRS);
    // public static final DeferredItem<BlockItem> YELLOW_TILES_SLAB_ITEM = BUILDING_ITEM_REGISTRY.registerSimpleBlockItem("yellow_tiles_slab", InitBuildingBlocks.YELLOW_TILES_SLAB);
    // public static final DeferredItem<BlockItem> YELLOW_TILES_WALL_ITEM = BUILDING_ITEM_REGISTRY.registerSimpleBlockItem("yellow_tiles_wall", InitBuildingBlocks.YELLOW_TILES_WALL);
    // public static final DeferredItem<BlockItem> YELLOW_TILES_PRESSURE_PLATE_ITEM = BUILDING_ITEM_REGISTRY.registerSimpleBlockItem("yellow_tiles_pressure_plate",
    // InitBuildingBlocks.YELLOW_TILES_PRESSURE_PLATE);

    public static final DeferredItem<BlockItem> YELLOW_GREY_TILES_ITEM = BUILDING_ITEM_REGISTRY.registerSimpleBlockItem("yellow_grey_tiles", InitBuildingBlocks.YELLOW_GREY_TILES);
    public static final DeferredItem<BlockItem> YELLOW_GREY_TILES_STAIRS_ITEM = BUILDING_ITEM_REGISTRY.registerSimpleBlockItem("yellow_grey_tiles_stairs", InitBuildingBlocks.YELLOW_GREY_TILES_STAIRS);
    public static final DeferredItem<BlockItem> YELLOW_GREY_TILES_SLAB_ITEM = BUILDING_ITEM_REGISTRY.registerSimpleBlockItem("yellow_grey_tiles_slab", InitBuildingBlocks.YELLOW_GREY_TILES_SLAB);
    public static final DeferredItem<BlockItem> YELLOW_GREY_TILES_WALL_ITEM = BUILDING_ITEM_REGISTRY.registerSimpleBlockItem("yellow_grey_tiles_wall", InitBuildingBlocks.YELLOW_GREY_TILES_WALL);
    public static final DeferredItem<BlockItem> YELLOW_GREY_TILES_PRESSURE_PLATE_ITEM = BUILDING_ITEM_REGISTRY.registerSimpleBlockItem("yellow_grey_tiles_pressure_plate", InitBuildingBlocks.YELLOW_GREY_TILES_PRESSURE_PLATE);

    // Wallpaper
    public static final DeferredItem<BlockItem> WHITE_BLUE_WALLPAPER_ITEM = BUILDING_ITEM_REGISTRY.registerSimpleBlockItem("white_blue_wallpaper", InitBuildingBlocks.WHITE_BLUE_WALLPAPER);
    public static final DeferredItem<BlockItem> WHITE_BLUE_WALLPAPER_STAIRS_ITEM = BUILDING_ITEM_REGISTRY.registerSimpleBlockItem("white_blue_wallpaper_stairs", InitBuildingBlocks.WHITE_BLUE_WALLPAPER_STAIRS);
    public static final DeferredItem<BlockItem> WHITE_BLUE_WALLPAPER_SLAB_ITEM = BUILDING_ITEM_REGISTRY.registerSimpleBlockItem("white_blue_wallpaper_slab", InitBuildingBlocks.WHITE_BLUE_WALLPAPER_SLAB);
    public static final DeferredItem<BlockItem> WHITE_BLUE_WALLPAPER_PLINTH_ITEM = BUILDING_ITEM_REGISTRY.registerSimpleBlockItem("white_blue_wallpaper_plinth", InitBuildingBlocks.WHITE_BLUE_WALLPAPER_PLINTH);

    public static final DeferredItem<BlockItem> BEIGE_FLOWER_WALLPAPER_ITEM = BUILDING_ITEM_REGISTRY.registerSimpleBlockItem("beige_flower_wallpaper", InitBuildingBlocks.BEIGE_FLOWER_WALLPAPER);
    public static final DeferredItem<BlockItem> BEIGE_FLOWER_WALLPAPER_STAIRS_ITEM = BUILDING_ITEM_REGISTRY.registerSimpleBlockItem("beige_flower_wallpaper_stairs", InitBuildingBlocks.BEIGE_FLOWER_WALLPAPER_STAIRS);
    public static final DeferredItem<BlockItem> BEIGE_FLOWER_WALLPAPER_SLAB_ITEM = BUILDING_ITEM_REGISTRY.registerSimpleBlockItem("beige_flower_wallpaper_slab", InitBuildingBlocks.BEIGE_FLOWER_WALLPAPER_SLAB);
    public static final DeferredItem<BlockItem> BEIGE_FLOWER_WALLPAPER_PLINTH_ITEM = BUILDING_ITEM_REGISTRY.registerSimpleBlockItem("beige_flower_wallpaper_plinth", InitBuildingBlocks.BEIGE_FLOWER_WALLPAPER_PLINTH);

    public static final DeferredItem<BlockItem> BEIGE_WALLPAPER_ITEM = BUILDING_ITEM_REGISTRY.registerSimpleBlockItem("beige_wallpaper", InitBuildingBlocks.BEIGE_WALLPAPER);
    public static final DeferredItem<BlockItem> BEIGE_WALLPAPER_STAIRS_ITEM = BUILDING_ITEM_REGISTRY.registerSimpleBlockItem("beige_wallpaper_stairs", InitBuildingBlocks.BEIGE_WALLPAPER_STAIRS);
    public static final DeferredItem<BlockItem> BEIGE_WALLPAPER_SLAB_ITEM = BUILDING_ITEM_REGISTRY.registerSimpleBlockItem("beige_wallpaper_slab", InitBuildingBlocks.BEIGE_WALLPAPER_SLAB);
    public static final DeferredItem<BlockItem> BEIGE_WALLPAPER_PLINTH_ITEM = BUILDING_ITEM_REGISTRY.registerSimpleBlockItem("beige_wallpaper_plinth", InitBuildingBlocks.BEIGE_WALLPAPER_PLINTH);

    public static final DeferredItem<BlockItem> PINK_WALLPAPER_ITEM = BUILDING_ITEM_REGISTRY.registerSimpleBlockItem("pink_wallpaper", InitBuildingBlocks.PINK_WALLPAPER);
    public static final DeferredItem<BlockItem> PINK_WALLPAPER_STAIRS_ITEM = BUILDING_ITEM_REGISTRY.registerSimpleBlockItem("pink_wallpaper_stairs", InitBuildingBlocks.PINK_WALLPAPER_STAIRS);
    public static final DeferredItem<BlockItem> PINK_WALLPAPER_SLAB_ITEM = BUILDING_ITEM_REGISTRY.registerSimpleBlockItem("pink_wallpaper_slab", InitBuildingBlocks.PINK_WALLPAPER_SLAB);
    public static final DeferredItem<BlockItem> PINK_WALLPAPER_PLINTH_ITEM = BUILDING_ITEM_REGISTRY.registerSimpleBlockItem("pink_wallpaper_plinth", InitBuildingBlocks.PINK_WALLPAPER_PLINTH);

    public static final DeferredItem<BlockItem> WHITE_GREEN_WALLPAPER_ITEM = BUILDING_ITEM_REGISTRY.registerSimpleBlockItem("white_green_wallpaper", InitBuildingBlocks.WHITE_GREEN_WALLPAPER);
    public static final DeferredItem<BlockItem> WHITE_GREEN_WALLPAPER_STAIRS_ITEM = BUILDING_ITEM_REGISTRY.registerSimpleBlockItem("white_green_wallpaper_stairs", InitBuildingBlocks.WHITE_GREEN_WALLPAPER_STAIRS);
    public static final DeferredItem<BlockItem> WHITE_GREEN_WALLPAPER_SLAB_ITEM = BUILDING_ITEM_REGISTRY.registerSimpleBlockItem("white_green_wallpaper_slab", InitBuildingBlocks.WHITE_GREEN_WALLPAPER_SLAB);
    public static final DeferredItem<BlockItem> WHITE_GREEN_WALLPAPER_PLINTH_ITEM = BUILDING_ITEM_REGISTRY.registerSimpleBlockItem("white_green_wallpaper_plinth", InitBuildingBlocks.WHITE_GREEN_WALLPAPER_PLINTH);

    // Stairs
    public static final Map<McWoods, DeferredItem<BlockItem>> SUSPENDED_STAIRS_ITEMS = Arrays.stream(McWoods.values()).map(type -> Pair.of(type, BUILDING_ITEM_REGISTRY.registerSimpleBlockItem(type.getSerializedName() + "_suspended_stairs", InitBuildingBlocks.SUSPENDED_STAIRS_BLOCKS.get(type)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));
    public static final Map<McWoods, DeferredItem<BlockItem>> LARGE_SUSPENDED_STAIRS_ITEMS = Arrays.stream(McWoods.values()).map(type -> Pair.of(type, BUILDING_ITEM_REGISTRY.registerSimpleBlockItem(type.getSerializedName() + "_large_suspended_stairs", InitBuildingBlocks.LARGE_SUSPENDED_STAIRS_BLOCKS.get(type)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    // Doors
    public static final Map<McWoods, DeferredItem<BlockItem>> FANCY_DOOR_ITEMS = Arrays.stream(McWoods.values()).map(type -> Pair.of(type, BUILDING_ITEM_REGISTRY.registerSimpleBlockItem(type.getSerializedName() + "_fancy_door", InitBuildingBlocks.FANCY_DOOR_BLOCKS.get(type)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));
    public static final Map<McWoods, DeferredItem<BlockItem>> PLAIN_DOOR_ITEMS = Arrays.stream(McWoods.values()).map(type -> Pair.of(type, BUILDING_ITEM_REGISTRY.registerSimpleBlockItem(type.getSerializedName() + "_plain_door", InitBuildingBlocks.PLAIN_DOOR_BLOCKS.get(type)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));
}
