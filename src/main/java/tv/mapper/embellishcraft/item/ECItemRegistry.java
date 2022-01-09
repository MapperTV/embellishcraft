package tv.mapper.embellishcraft.item;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

import org.apache.commons.lang3.tuple.Pair;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import tv.mapper.embellishcraft.ECConstants;
import tv.mapper.embellishcraft.block.ECBlockRegistry;
import tv.mapper.embellishcraft.util.McWoods;
import tv.mapper.mapperbase.world.item.FuelBlockItem;

public class ECItemRegistry
{
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ECConstants.MODID);

    // Other bricks
    public static final RegistryObject<Item> DARK_BRICKS_ITEM = ITEMS.register("dark_bricks", () -> new BlockItem(ECBlockRegistry.DARK_BRICKS.get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> DARK_BRICKS_STAIRS_ITEM = ITEMS.register("dark_bricks_stairs", () -> new BlockItem(ECBlockRegistry.DARK_BRICKS_STAIRS.get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> DARK_BRICKS_SLAB_ITEM = ITEMS.register("dark_bricks_slab", () -> new BlockItem(ECBlockRegistry.DARK_BRICKS_SLAB.get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> DARK_BRICKS_WALL_ITEM = ITEMS.register("dark_bricks_wall", () -> new BlockItem(ECBlockRegistry.DARK_BRICKS_WALL.get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> DARK_BRICKS_PRESSURE_PLATE_ITEM = ITEMS.register("dark_bricks_pressure_plate", () -> new BlockItem(ECBlockRegistry.DARK_BRICKS_PRESSURE_PLATE.get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT)));

    public static final RegistryObject<Item> DARK_LARGE_BRICKS_ITEM = ITEMS.register("dark_large_bricks", () -> new BlockItem(ECBlockRegistry.DARK_LARGE_BRICKS.get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> DARK_LARGE_BRICKS_STAIRS_ITEM = ITEMS.register("dark_large_bricks_stairs", () -> new BlockItem(ECBlockRegistry.DARK_LARGE_BRICKS_STAIRS.get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> DARK_LARGE_BRICKS_SLAB_ITEM = ITEMS.register("dark_large_bricks_slab", () -> new BlockItem(ECBlockRegistry.DARK_LARGE_BRICKS_SLAB.get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> DARK_LARGE_BRICKS_WALL_ITEM = ITEMS.register("dark_large_bricks_wall", () -> new BlockItem(ECBlockRegistry.DARK_LARGE_BRICKS_WALL.get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> DARK_LARGE_BRICKS_PRESSURE_PLATE_ITEM = ITEMS.register("dark_large_bricks_pressure_plate", () -> new BlockItem(ECBlockRegistry.DARK_LARGE_BRICKS_PRESSURE_PLATE.get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT)));

    public static final RegistryObject<Item> OLD_BRICKS_ITEM = ITEMS.register("old_bricks", () -> new BlockItem(ECBlockRegistry.OLD_BRICKS.get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> OLD_BRICKS_STAIRS_ITEM = ITEMS.register("old_bricks_stairs", () -> new BlockItem(ECBlockRegistry.OLD_BRICKS_STAIRS.get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> OLD_BRICKS_SLAB_ITEM = ITEMS.register("old_bricks_slab", () -> new BlockItem(ECBlockRegistry.OLD_BRICKS_SLAB.get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> OLD_BRICKS_WALL_ITEM = ITEMS.register("old_bricks_wall", () -> new BlockItem(ECBlockRegistry.OLD_BRICKS_WALL.get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> OLD_BRICKS_PRESSURE_PLATE_ITEM = ITEMS.register("old_bricks_pressure_plate", () -> new BlockItem(ECBlockRegistry.OLD_BRICKS_PRESSURE_PLATE.get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT)));

    public static final RegistryObject<Item> OLD_LARGE_BRICKS_ITEM = ITEMS.register("old_large_bricks", () -> new BlockItem(ECBlockRegistry.OLD_LARGE_BRICKS.get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> OLD_LARGE_BRICKS_STAIRS_ITEM = ITEMS.register("old_large_bricks_stairs", () -> new BlockItem(ECBlockRegistry.OLD_LARGE_BRICKS_STAIRS.get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> OLD_LARGE_BRICKS_SLAB_ITEM = ITEMS.register("old_large_bricks_slab", () -> new BlockItem(ECBlockRegistry.OLD_LARGE_BRICKS_SLAB.get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> OLD_LARGE_BRICKS_WALL_ITEM = ITEMS.register("old_large_bricks_wall", () -> new BlockItem(ECBlockRegistry.OLD_LARGE_BRICKS_WALL.get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> OLD_LARGE_BRICKS_PRESSURE_PLATE_ITEM = ITEMS.register("old_large_bricks_pressure_plate", () -> new BlockItem(ECBlockRegistry.OLD_LARGE_BRICKS_PRESSURE_PLATE.get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT)));

    public static final RegistryObject<Item> WEARED_BRICKS_ITEM = ITEMS.register("weared_bricks", () -> new BlockItem(ECBlockRegistry.WEARED_BRICKS.get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> WEARED_BRICKS_STAIRS_ITEM = ITEMS.register("weared_bricks_stairs", () -> new BlockItem(ECBlockRegistry.WEARED_BRICKS_STAIRS.get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> WEARED_BRICKS_SLAB_ITEM = ITEMS.register("weared_bricks_slab", () -> new BlockItem(ECBlockRegistry.WEARED_BRICKS_SLAB.get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> WEARED_BRICKS_WALL_ITEM = ITEMS.register("weared_bricks_wall", () -> new BlockItem(ECBlockRegistry.WEARED_BRICKS_WALL.get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> WEARED_BRICKS_PRESSURE_PLATE_ITEM = ITEMS.register("weared_bricks_pressure_plate", () -> new BlockItem(ECBlockRegistry.WEARED_BRICKS_PRESSURE_PLATE.get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT)));

    public static final RegistryObject<Item> WEARED_LARGE_BRICKS_ITEM = ITEMS.register("weared_large_bricks", () -> new BlockItem(ECBlockRegistry.WEARED_LARGE_BRICKS.get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> WEARED_LARGE_BRICKS_STAIRS_ITEM = ITEMS.register("weared_large_bricks_stairs", () -> new BlockItem(ECBlockRegistry.WEARED_LARGE_BRICKS_STAIRS.get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> WEARED_LARGE_BRICKS_SLAB_ITEM = ITEMS.register("weared_large_bricks_slab", () -> new BlockItem(ECBlockRegistry.WEARED_LARGE_BRICKS_SLAB.get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> WEARED_LARGE_BRICKS_WALL_ITEM = ITEMS.register("weared_large_bricks_wall", () -> new BlockItem(ECBlockRegistry.WEARED_LARGE_BRICKS_WALL.get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> WEARED_LARGE_BRICKS_PRESSURE_PLATE_ITEM = ITEMS.register("weared_large_bricks_pressure_plate", () -> new BlockItem(ECBlockRegistry.WEARED_LARGE_BRICKS_PRESSURE_PLATE.get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT)));

    // Pavings
    public static final RegistryObject<Item> CONCRETE_PAVING_ITEM = ITEMS.register("concrete_paving", () -> new BlockItem(ECBlockRegistry.CONCRETE_PAVING.get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> CONCRETE_PAVING_STAIRS_ITEM = ITEMS.register("concrete_paving_stairs", () -> new BlockItem(ECBlockRegistry.CONCRETE_PAVING_STAIRS.get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> CONCRETE_PAVING_SLAB_ITEM = ITEMS.register("concrete_paving_slab", () -> new BlockItem(ECBlockRegistry.CONCRETE_PAVING_SLAB.get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> CONCRETE_PAVING_WALL_ITEM = ITEMS.register("concrete_paving_wall", () -> new BlockItem(ECBlockRegistry.CONCRETE_PAVING_WALL.get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> CONCRETE_PAVING_PRESSURE_PLATE_ITEM = ITEMS.register("concrete_paving_pressure_plate", () -> new BlockItem(ECBlockRegistry.CONCRETE_PAVING_PRESSURE_PLATE.get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT)));

    public static final RegistryObject<Item> DAMAGED_PAVING_ITEM = ITEMS.register("damaged_paving", () -> new BlockItem(ECBlockRegistry.DAMAGED_PAVING.get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> DAMAGED_PAVING_STAIRS_ITEM = ITEMS.register("damaged_paving_stairs", () -> new BlockItem(ECBlockRegistry.DAMAGED_PAVING_STAIRS.get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> DAMAGED_PAVING_SLAB_ITEM = ITEMS.register("damaged_paving_slab", () -> new BlockItem(ECBlockRegistry.DAMAGED_PAVING_SLAB.get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> DAMAGED_PAVING_WALL_ITEM = ITEMS.register("damaged_paving_wall", () -> new BlockItem(ECBlockRegistry.DAMAGED_PAVING_WALL.get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> DAMAGED_PAVING_PRESSURE_PLATE_ITEM = ITEMS.register("damaged_paving_pressure_plate", () -> new BlockItem(ECBlockRegistry.DAMAGED_PAVING_PRESSURE_PLATE.get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT)));

    public static final RegistryObject<Item> DARK_CONCRETE_PAVING_ITEM = ITEMS.register("dark_concrete_paving", () -> new BlockItem(ECBlockRegistry.DARK_CONCRETE_PAVING.get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> DARK_CONCRETE_PAVING_STAIRS_ITEM = ITEMS.register("dark_concrete_paving_stairs", () -> new BlockItem(ECBlockRegistry.DARK_CONCRETE_PAVING_STAIRS.get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> DARK_CONCRETE_PAVING_SLAB_ITEM = ITEMS.register("dark_concrete_paving_slab", () -> new BlockItem(ECBlockRegistry.DARK_CONCRETE_PAVING_SLAB.get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> DARK_CONCRETE_PAVING_WALL_ITEM = ITEMS.register("dark_concrete_paving_wall", () -> new BlockItem(ECBlockRegistry.DARK_CONCRETE_PAVING_WALL.get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> DARK_CONCRETE_PAVING_PRESSURE_PLATE_ITEM = ITEMS.register("dark_concrete_paving_pressure_plate", () -> new BlockItem(ECBlockRegistry.DARK_CONCRETE_PAVING_PRESSURE_PLATE.get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT)));

    public static final RegistryObject<Item> MOIST_PAVING_ITEM = ITEMS.register("moist_paving", () -> new BlockItem(ECBlockRegistry.MOIST_PAVING.get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> MOIST_PAVING_STAIRS_ITEM = ITEMS.register("moist_paving_stairs", () -> new BlockItem(ECBlockRegistry.MOIST_PAVING_STAIRS.get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> MOIST_PAVING_SLAB_ITEM = ITEMS.register("moist_paving_slab", () -> new BlockItem(ECBlockRegistry.MOIST_PAVING_SLAB.get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> MOIST_PAVING_WALL_ITEM = ITEMS.register("moist_paving_wall", () -> new BlockItem(ECBlockRegistry.MOIST_PAVING_WALL.get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> MOIST_PAVING_PRESSURE_PLATE_ITEM = ITEMS.register("moist_paving_pressure_plate", () -> new BlockItem(ECBlockRegistry.MOIST_PAVING_PRESSURE_PLATE.get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT)));

    public static final RegistryObject<Item> POLISHED_PAVING_ITEM = ITEMS.register("polished_paving", () -> new BlockItem(ECBlockRegistry.POLISHED_PAVING.get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> POLISHED_PAVING_STAIRS_ITEM = ITEMS.register("polished_paving_stairs", () -> new BlockItem(ECBlockRegistry.POLISHED_PAVING_STAIRS.get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> POLISHED_PAVING_SLAB_ITEM = ITEMS.register("polished_paving_slab", () -> new BlockItem(ECBlockRegistry.POLISHED_PAVING_SLAB.get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> POLISHED_PAVING_WALL_ITEM = ITEMS.register("polished_paving_wall", () -> new BlockItem(ECBlockRegistry.POLISHED_PAVING_WALL.get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> POLISHED_PAVING_PRESSURE_PLATE_ITEM = ITEMS.register("polished_paving_pressure_plate", () -> new BlockItem(ECBlockRegistry.POLISHED_PAVING_PRESSURE_PLATE.get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT)));

    public static final RegistryObject<Item> WHITE_CONCRETE_PAVING_ITEM = ITEMS.register("white_concrete_paving", () -> new BlockItem(ECBlockRegistry.WHITE_CONCRETE_PAVING.get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> WHITE_CONCRETE_PAVING_STAIRS_ITEM = ITEMS.register("white_concrete_paving_stairs", () -> new BlockItem(ECBlockRegistry.WHITE_CONCRETE_PAVING_STAIRS.get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> WHITE_CONCRETE_PAVING_SLAB_ITEM = ITEMS.register("white_concrete_paving_slab", () -> new BlockItem(ECBlockRegistry.WHITE_CONCRETE_PAVING_SLAB.get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> WHITE_CONCRETE_PAVING_WALL_ITEM = ITEMS.register("white_concrete_paving_wall", () -> new BlockItem(ECBlockRegistry.WHITE_CONCRETE_PAVING_WALL.get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> WHITE_CONCRETE_PAVING_PRESSURE_PLATE_ITEM = ITEMS.register("white_concrete_paving_pressure_plate", () -> new BlockItem(ECBlockRegistry.WHITE_CONCRETE_PAVING_PRESSURE_PLATE.get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT)));

    // Tiles
    public static final RegistryObject<Item> CONCRETE_TILES_ITEM = ITEMS.register("concrete_tiles", () -> new BlockItem(ECBlockRegistry.CONCRETE_TILES.get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> CONCRETE_TILES_STAIRS_ITEM = ITEMS.register("concrete_tiles_stairs", () -> new BlockItem(ECBlockRegistry.CONCRETE_TILES_STAIRS.get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> CONCRETE_TILES_SLAB_ITEM = ITEMS.register("concrete_tiles_slab", () -> new BlockItem(ECBlockRegistry.CONCRETE_TILES_SLAB.get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> CONCRETE_TILES_WALL_ITEM = ITEMS.register("concrete_tiles_wall", () -> new BlockItem(ECBlockRegistry.CONCRETE_TILES_WALL.get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> CONCRETE_TILES_PRESSURE_PLATE_ITEM = ITEMS.register("concrete_tiles_pressure_plate", () -> new BlockItem(ECBlockRegistry.CONCRETE_TILES_PRESSURE_PLATE.get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT)));

    public static final RegistryObject<Item> SKYBLUE_TILES_ITEM = ITEMS.register("skyblue_tiles", () -> new BlockItem(ECBlockRegistry.SKYBLUE_TILES.get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> SKYBLUE_TILES_STAIRS_ITEM = ITEMS.register("skyblue_tiles_stairs", () -> new BlockItem(ECBlockRegistry.SKYBLUE_TILES_STAIRS.get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> SKYBLUE_TILES_SLAB_ITEM = ITEMS.register("skyblue_tiles_slab", () -> new BlockItem(ECBlockRegistry.SKYBLUE_TILES_SLAB.get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> SKYBLUE_TILES_WALL_ITEM = ITEMS.register("skyblue_tiles_wall", () -> new BlockItem(ECBlockRegistry.SKYBLUE_TILES_WALL.get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> SKYBLUE_TILES_PRESSURE_PLATE_ITEM = ITEMS.register("skyblue_tiles_pressure_plate", () -> new BlockItem(ECBlockRegistry.SKYBLUE_TILES_PRESSURE_PLATE.get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT)));

    public static final RegistryObject<Item> ORANGE_TILES_ITEM = ITEMS.register("orange_tiles", () -> new BlockItem(ECBlockRegistry.ORANGE_TILES.get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> ORANGE_TILES_STAIRS_ITEM = ITEMS.register("orange_tiles_stairs", () -> new BlockItem(ECBlockRegistry.ORANGE_TILES_STAIRS.get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> ORANGE_TILES_SLAB_ITEM = ITEMS.register("orange_tiles_slab", () -> new BlockItem(ECBlockRegistry.ORANGE_TILES_SLAB.get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> ORANGE_TILES_WALL_ITEM = ITEMS.register("orange_tiles_wall", () -> new BlockItem(ECBlockRegistry.ORANGE_TILES_WALL.get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> ORANGE_TILES_PRESSURE_PLATE_ITEM = ITEMS.register("orange_tiles_pressure_plate", () -> new BlockItem(ECBlockRegistry.ORANGE_TILES_PRESSURE_PLATE.get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT)));

    public static final RegistryObject<Item> BLUE_TILES_ITEM = ITEMS.register("blue_tiles", () -> new BlockItem(ECBlockRegistry.BLUE_TILES.get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> BLUE_TILES_STAIRS_ITEM = ITEMS.register("blue_tiles_stairs", () -> new BlockItem(ECBlockRegistry.BLUE_TILES_STAIRS.get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> BLUE_TILES_SLAB_ITEM = ITEMS.register("blue_tiles_slab", () -> new BlockItem(ECBlockRegistry.BLUE_TILES_SLAB.get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> BLUE_TILES_WALL_ITEM = ITEMS.register("blue_tiles_wall", () -> new BlockItem(ECBlockRegistry.BLUE_TILES_WALL.get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> BLUE_TILES_PRESSURE_PLATE_ITEM = ITEMS.register("blue_tiles_pressure_plate", () -> new BlockItem(ECBlockRegistry.BLUE_TILES_PRESSURE_PLATE.get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT)));

    public static final RegistryObject<Item> LIGHT_BLUE_TILES_ITEM = ITEMS.register("light_blue_tiles", () -> new BlockItem(ECBlockRegistry.LIGHT_BLUE_TILES.get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> LIGHT_BLUE_TILES_STAIRS_ITEM = ITEMS.register("light_blue_tiles_stairs", () -> new BlockItem(ECBlockRegistry.LIGHT_BLUE_TILES_STAIRS.get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> LIGHT_BLUE_TILES_SLAB_ITEM = ITEMS.register("light_blue_tiles_slab", () -> new BlockItem(ECBlockRegistry.LIGHT_BLUE_TILES_SLAB.get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> LIGHT_BLUE_TILES_WALL_ITEM = ITEMS.register("light_blue_tiles_wall", () -> new BlockItem(ECBlockRegistry.LIGHT_BLUE_TILES_WALL.get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> LIGHT_BLUE_TILES_PRESSURE_PLATE_ITEM = ITEMS.register("light_blue_tiles_pressure_plate", () -> new BlockItem(ECBlockRegistry.LIGHT_BLUE_TILES_PRESSURE_PLATE.get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT)));

    public static final RegistryObject<Item> RED_TILES_ITEM = ITEMS.register("red_tiles", () -> new BlockItem(ECBlockRegistry.RED_TILES.get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> RED_TILES_STAIRS_ITEM = ITEMS.register("red_tiles_stairs", () -> new BlockItem(ECBlockRegistry.RED_TILES_STAIRS.get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> RED_TILES_SLAB_ITEM = ITEMS.register("red_tiles_slab", () -> new BlockItem(ECBlockRegistry.RED_TILES_SLAB.get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> RED_TILES_WALL_ITEM = ITEMS.register("red_tiles_wall", () -> new BlockItem(ECBlockRegistry.RED_TILES_WALL.get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> RED_TILES_PRESSURE_PLATE_ITEM = ITEMS.register("red_tiles_pressure_plate", () -> new BlockItem(ECBlockRegistry.RED_TILES_PRESSURE_PLATE.get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT)));

    public static final RegistryObject<Item> WHITE_TILES_ITEM = ITEMS.register("white_tiles", () -> new BlockItem(ECBlockRegistry.WHITE_TILES.get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> WHITE_TILES_STAIRS_ITEM = ITEMS.register("white_tiles_stairs", () -> new BlockItem(ECBlockRegistry.WHITE_TILES_STAIRS.get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> WHITE_TILES_SLAB_ITEM = ITEMS.register("white_tiles_slab", () -> new BlockItem(ECBlockRegistry.WHITE_TILES_SLAB.get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> WHITE_TILES_WALL_ITEM = ITEMS.register("white_tiles_wall", () -> new BlockItem(ECBlockRegistry.WHITE_TILES_WALL.get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> WHITE_TILES_PRESSURE_PLATE_ITEM = ITEMS.register("white_tiles_pressure_plate", () -> new BlockItem(ECBlockRegistry.WHITE_TILES_PRESSURE_PLATE.get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT)));

    public static final RegistryObject<Item> YELLOW_TILES_ITEM = ITEMS.register("yellow_tiles", () -> new BlockItem(ECBlockRegistry.YELLOW_TILES.get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> YELLOW_TILES_STAIRS_ITEM = ITEMS.register("yellow_tiles_stairs", () -> new BlockItem(ECBlockRegistry.YELLOW_TILES_STAIRS.get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> YELLOW_TILES_SLAB_ITEM = ITEMS.register("yellow_tiles_slab", () -> new BlockItem(ECBlockRegistry.YELLOW_TILES_SLAB.get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> YELLOW_TILES_WALL_ITEM = ITEMS.register("yellow_tiles_wall", () -> new BlockItem(ECBlockRegistry.YELLOW_TILES_WALL.get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> YELLOW_TILES_PRESSURE_PLATE_ITEM = ITEMS.register("yellow_tiles_pressure_plate", () -> new BlockItem(ECBlockRegistry.YELLOW_TILES_PRESSURE_PLATE.get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT)));

    public static final RegistryObject<Item> YELLOW_GREY_TILES_ITEM = ITEMS.register("yellow_grey_tiles", () -> new BlockItem(ECBlockRegistry.YELLOW_GREY_TILES.get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> YELLOW_GREY_TILES_STAIRS_ITEM = ITEMS.register("yellow_grey_tiles_stairs", () -> new BlockItem(ECBlockRegistry.YELLOW_GREY_TILES_STAIRS.get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> YELLOW_GREY_TILES_SLAB_ITEM = ITEMS.register("yellow_grey_tiles_slab", () -> new BlockItem(ECBlockRegistry.YELLOW_GREY_TILES_SLAB.get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> YELLOW_GREY_TILES_WALL_ITEM = ITEMS.register("yellow_grey_tiles_wall", () -> new BlockItem(ECBlockRegistry.YELLOW_GREY_TILES_WALL.get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> YELLOW_GREY_TILES_PRESSURE_PLATE_ITEM = ITEMS.register("yellow_grey_tiles_pressure_plate", () -> new BlockItem(ECBlockRegistry.YELLOW_GREY_TILES_PRESSURE_PLATE.get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT)));

    // Corrugated metal plates
    public static final Map<DyeColor, RegistryObject<BlockItem>> CORRUGATED_METAL_PLATE_ITEMS = Arrays.stream(DyeColor.values()).map(type -> Pair.of(type, ITEMS.register(type.getSerializedName() + "_corrugated_metal_plate", () -> new BlockItem(ECBlockRegistry.CORRUGATED_METAL_PLATE_BLOCKS.get(type).get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT))))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));
    public static final Map<DyeColor, RegistryObject<BlockItem>> CORRUGATED_METAL_PLATE_STAIRS_ITEMS = Arrays.stream(DyeColor.values()).map(type -> Pair.of(type, ITEMS.register(type.getSerializedName() + "_corrugated_metal_plate_stairs", () -> new BlockItem(ECBlockRegistry.CORRUGATED_METAL_PLATE_STAIRS.get(type).get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT))))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));
    public static final Map<DyeColor, RegistryObject<BlockItem>> CORRUGATED_METAL_PLATE_SLABS_ITEMS = Arrays.stream(DyeColor.values()).map(type -> Pair.of(type, ITEMS.register(type.getSerializedName() + "_corrugated_metal_plate_slab", () -> new BlockItem(ECBlockRegistry.CORRUGATED_METAL_PLATE_SLABS.get(type).get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT))))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));
    public static final Map<DyeColor, RegistryObject<BlockItem>> CORRUGATED_METAL_PLATE_WALLS_ITEMS = Arrays.stream(DyeColor.values()).map(type -> Pair.of(type, ITEMS.register(type.getSerializedName() + "_corrugated_metal_plate_wall", () -> new BlockItem(ECBlockRegistry.CORRUGATED_METAL_PLATE_WALLS.get(type).get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT))))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));
    public static final Map<DyeColor, RegistryObject<BlockItem>> CORRUGATED_METAL_PLATE_PRESSURE_PLATES_ITEMS = Arrays.stream(DyeColor.values()).map(type -> Pair.of(type, ITEMS.register(type.getSerializedName() + "_corrugated_metal_plate_pressure_plate", () -> new BlockItem(ECBlockRegistry.CORRUGATED_METAL_PLATE_PRESSURE_PLATES.get(type).get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT))))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));
    public static final Map<DyeColor, RegistryObject<BlockItem>> CORRUGATED_METAL_PLATE_FENCE_ITEMS = Arrays.stream(DyeColor.values()).map(type -> Pair.of(type, ITEMS.register(type.getSerializedName() + "_corrugated_metal_plate_fence", () -> new BlockItem(ECBlockRegistry.CORRUGATED_METAL_PLATE_FENCES.get(type).get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT))))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));
    public static final Map<DyeColor, RegistryObject<BlockItem>> CORRUGATED_METAL_PLATE_FENCE_GATE_ITEMS = Arrays.stream(DyeColor.values()).map(type -> Pair.of(type, ITEMS.register(type.getSerializedName() + "_corrugated_metal_plate_fence_gate", () -> new BlockItem(ECBlockRegistry.CORRUGATED_METAL_PLATE_FENCE_GATES.get(type).get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT))))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    // Metal blocks
    public static final RegistryObject<Item> DARK_METAL_FLOOR_ITEM = ITEMS.register("dark_metal_floor", () -> new BlockItem(ECBlockRegistry.DARK_METAL_FLOOR.get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> DARK_METAL_FLOOR_STAIRS_ITEM = ITEMS.register("dark_metal_floor_stairs", () -> new BlockItem(ECBlockRegistry.DARK_METAL_FLOOR_STAIRS.get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> DARK_METAL_FLOOR_SLAB_ITEM = ITEMS.register("dark_metal_floor_slab", () -> new BlockItem(ECBlockRegistry.DARK_METAL_FLOOR_SLAB.get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> DARK_METAL_FLOOR_WALL_ITEM = ITEMS.register("dark_metal_floor_wall", () -> new BlockItem(ECBlockRegistry.DARK_METAL_FLOOR_WALL.get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> DARK_METAL_FLOOR_PRESSURE_PLATE_ITEM = ITEMS.register("dark_metal_floor_pressure_plate", () -> new BlockItem(ECBlockRegistry.DARK_METAL_FLOOR_PRESSURE_PLATE.get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT)));

    public static final RegistryObject<Item> LIGHT_METAL_FLOOR_ITEM = ITEMS.register("light_metal_floor", () -> new BlockItem(ECBlockRegistry.LIGHT_METAL_FLOOR.get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> LIGHT_METAL_FLOOR_STAIRS_ITEM = ITEMS.register("light_metal_floor_stairs", () -> new BlockItem(ECBlockRegistry.LIGHT_METAL_FLOOR_STAIRS.get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> LIGHT_METAL_FLOOR_SLAB_ITEM = ITEMS.register("light_metal_floor_slab", () -> new BlockItem(ECBlockRegistry.LIGHT_METAL_FLOOR_SLAB.get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> LIGHT_METAL_FLOOR_WALL_ITEM = ITEMS.register("light_metal_floor_wall", () -> new BlockItem(ECBlockRegistry.LIGHT_METAL_FLOOR_WALL.get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> LIGHT_METAL_FLOOR_PRESSURE_PLATE_ITEM = ITEMS.register("light_metal_floor_pressure_plate", () -> new BlockItem(ECBlockRegistry.LIGHT_METAL_FLOOR_PRESSURE_PLATE.get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT)));

    public static final RegistryObject<Item> RUSTY_PLATE_ITEM = ITEMS.register("rusty_plate", () -> new BlockItem(ECBlockRegistry.RUSTY_PLATE.get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> RUSTY_PLATE_STAIRS_ITEM = ITEMS.register("rusty_plate_stairs", () -> new BlockItem(ECBlockRegistry.RUSTY_PLATE_STAIRS.get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> RUSTY_PLATE_SLAB_ITEM = ITEMS.register("rusty_plate_slab", () -> new BlockItem(ECBlockRegistry.RUSTY_PLATE_SLAB.get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> RUSTY_PLATE_WALL_ITEM = ITEMS.register("rusty_plate_wall", () -> new BlockItem(ECBlockRegistry.RUSTY_PLATE_WALL.get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> RUSTY_PLATE_PRESSURE_PLATE_ITEM = ITEMS.register("rusty_plate_pressure_plate", () -> new BlockItem(ECBlockRegistry.RUSTY_PLATE_PRESSURE_PLATE.get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT)));

    public static final RegistryObject<Item> IRON_BEAM_ITEM = ITEMS.register("iron_beam", () -> new BlockItem(ECBlockRegistry.IRON_BEAM.get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> BOLTED_IRON_BEAM_ITEM = ITEMS.register("bolted_iron_beam", () -> new BlockItem(ECBlockRegistry.BOLTED_IRON_BEAM.get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> IRON_BEAM_JUNCTION_ITEM = ITEMS.register("iron_beam_junction", () -> new BlockItem(ECBlockRegistry.IRON_BEAM_JUNCTION.get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> STEEL_BEAM_ITEM = ITEMS.register("steel_beam", () -> new BlockItem(ECBlockRegistry.STEEL_BEAM.get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> BOLTED_STEEL_BEAM_ITEM = ITEMS.register("bolted_steel_beam", () -> new BlockItem(ECBlockRegistry.BOLTED_STEEL_BEAM.get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> STEEL_BEAM_JUNCTION_ITEM = ITEMS.register("steel_beam_junction", () -> new BlockItem(ECBlockRegistry.STEEL_BEAM_JUNCTION.get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT)));

    public static final RegistryObject<Item> AIR_DUCT_ITEM = ITEMS.register("air_duct", () -> new BlockItem(ECBlockRegistry.AIR_DUCT.get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> VENT_AIR_DUCT_ITEM = ITEMS.register("vent_air_duct", () -> new BlockItem(ECBlockRegistry.VENT_AIR_DUCT.get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> GRID_AIR_DUCT_ITEM = ITEMS.register("grid_air_duct", () -> new BlockItem(ECBlockRegistry.GRID_AIR_DUCT.get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT)));

    public static final RegistryObject<Item> BULKHEAD_ITEM = ITEMS.register("bulkhead", () -> new BlockItem(ECBlockRegistry.BULKHEAD.get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> BULKHEAD_TOP_ITEM = ITEMS.register("bulkhead_top", () -> new BlockItem(ECBlockRegistry.BULKHEAD_TOP.get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT)));

    public static final RegistryObject<Item> STEEL_WALL_LADDER_ITEM = ITEMS.register("steel_wall_ladder", () -> new BlockItem(ECBlockRegistry.STEEL_WALL_LADDER.get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> RUSTY_WALL_LADDER_ITEM = ITEMS.register("rusty_wall_ladder", () -> new BlockItem(ECBlockRegistry.RUSTY_WALL_LADDER.get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> STEEL_RUNGS_ITEM = ITEMS.register("steel_rungs", () -> new BlockItem(ECBlockRegistry.STEEL_RUNGS.get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> RUSTY_RUNGS_ITEM = ITEMS.register("rusty_rungs", () -> new BlockItem(ECBlockRegistry.RUSTY_RUNGS.get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT)));

    // Wallpaper
    public static final RegistryObject<Item> WHITE_BLUE_WALLPAPER_ITEM = ITEMS.register("white_blue_wallpaper", () -> new BlockItem(ECBlockRegistry.WHITE_BLUE_WALLPAPER.get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> WHITE_BLUE_WALLPAPER_STAIRS_ITEM = ITEMS.register("white_blue_wallpaper_stairs", () -> new BlockItem(ECBlockRegistry.WHITE_BLUE_WALLPAPER_STAIRS.get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> WHITE_BLUE_WALLPAPER_SLAB_ITEM = ITEMS.register("white_blue_wallpaper_slab", () -> new BlockItem(ECBlockRegistry.WHITE_BLUE_WALLPAPER_SLAB.get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> WHITE_BLUE_WALLPAPER_PLINTH_ITEM = ITEMS.register("white_blue_wallpaper_plinth", () -> new BlockItem(ECBlockRegistry.WHITE_BLUE_WALLPAPER_PLINTH.get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT)));

    public static final RegistryObject<Item> BEIGE_FLOWER_WALLPAPER_ITEM = ITEMS.register("beige_flower_wallpaper", () -> new BlockItem(ECBlockRegistry.BEIGE_FLOWER_WALLPAPER.get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> BEIGE_FLOWER_WALLPAPER_STAIRS_ITEM = ITEMS.register("beige_flower_wallpaper_stairs", () -> new BlockItem(ECBlockRegistry.BEIGE_FLOWER_WALLPAPER_STAIRS.get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> BEIGE_FLOWER_WALLPAPER_SLAB_ITEM = ITEMS.register("beige_flower_wallpaper_slab", () -> new BlockItem(ECBlockRegistry.BEIGE_FLOWER_WALLPAPER_SLAB.get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> BEIGE_FLOWER_WALLPAPER_PLINTH_ITEM = ITEMS.register("beige_flower_wallpaper_plinth", () -> new BlockItem(ECBlockRegistry.BEIGE_FLOWER_WALLPAPER_PLINTH.get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT)));

    public static final RegistryObject<Item> BEIGE_WALLPAPER_ITEM = ITEMS.register("beige_wallpaper", () -> new BlockItem(ECBlockRegistry.BEIGE_WALLPAPER.get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> BEIGE_WALLPAPER_STAIRS_ITEM = ITEMS.register("beige_wallpaper_stairs", () -> new BlockItem(ECBlockRegistry.BEIGE_WALLPAPER_STAIRS.get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> BEIGE_WALLPAPER_SLAB_ITEM = ITEMS.register("beige_wallpaper_slab", () -> new BlockItem(ECBlockRegistry.BEIGE_WALLPAPER_SLAB.get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> BEIGE_WALLPAPER_PLINTH_ITEM = ITEMS.register("beige_wallpaper_plinth", () -> new BlockItem(ECBlockRegistry.BEIGE_WALLPAPER_PLINTH.get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT)));

    public static final RegistryObject<Item> PINK_WALLPAPER_ITEM = ITEMS.register("pink_wallpaper", () -> new BlockItem(ECBlockRegistry.PINK_WALLPAPER.get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> PINK_WALLPAPER_STAIRS_ITEM = ITEMS.register("pink_wallpaper_stairs", () -> new BlockItem(ECBlockRegistry.PINK_WALLPAPER_STAIRS.get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> PINK_WALLPAPER_SLAB_ITEM = ITEMS.register("pink_wallpaper_slab", () -> new BlockItem(ECBlockRegistry.PINK_WALLPAPER_SLAB.get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> PINK_WALLPAPER_PLINTH_ITEM = ITEMS.register("pink_wallpaper_plinth", () -> new BlockItem(ECBlockRegistry.PINK_WALLPAPER_PLINTH.get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT)));

    public static final RegistryObject<Item> WHITE_GREEN_WALLPAPER_ITEM = ITEMS.register("white_green_wallpaper", () -> new BlockItem(ECBlockRegistry.WHITE_GREEN_WALLPAPER.get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> WHITE_GREEN_WALLPAPER_STAIRS_ITEM = ITEMS.register("white_green_wallpaper_stairs", () -> new BlockItem(ECBlockRegistry.WHITE_GREEN_WALLPAPER_STAIRS.get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> WHITE_GREEN_WALLPAPER_SLAB_ITEM = ITEMS.register("white_green_wallpaper_slab", () -> new BlockItem(ECBlockRegistry.WHITE_GREEN_WALLPAPER_SLAB.get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> WHITE_GREEN_WALLPAPER_PLINTH_ITEM = ITEMS.register("white_green_wallpaper_plinth", () -> new BlockItem(ECBlockRegistry.WHITE_GREEN_WALLPAPER_PLINTH.get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT)));

    // Furniture
    public static final Map<McWoods, RegistryObject<FuelBlockItem>> CHAIRS_ITEMS = Arrays.stream(McWoods.values()).map(type -> Pair.of(type, ITEMS.register(type.getSerializedName() + "_chair", () -> new FuelBlockItem(ECBlockRegistry.CHAIR_BLOCKS.get(type).get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT), ECConstants.chairBurnTime)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<McWoods, RegistryObject<FuelBlockItem>> TERRACE_CHAIRS_ITEMS = Arrays.stream(McWoods.values()).map(type -> Pair.of(type, ITEMS.register(type.getSerializedName() + "_terrace_chair", () -> new FuelBlockItem(ECBlockRegistry.TERRACE_CHAIR_BLOCKS.get(type).get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT), ECConstants.chairBurnTime)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<McWoods, RegistryObject<FuelBlockItem>> TABLE_ITEMS = Arrays.stream(McWoods.values()).map(type -> Pair.of(type, ITEMS.register(type.getSerializedName() + "_table", () -> new FuelBlockItem(ECBlockRegistry.TABLE_BLOCKS.get(type).get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT), ECConstants.chairBurnTime)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<McWoods, RegistryObject<FuelBlockItem>> FANCY_TABLE_ITEMS = Arrays.stream(McWoods.values()).map(type -> Pair.of(type, ITEMS.register(type.getSerializedName() + "_fancy_table", () -> new FuelBlockItem(ECBlockRegistry.FANCY_TABLE_BLOCKS.get(type).get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT), ECConstants.couchBurnTime)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<McWoods, RegistryObject<FuelBlockItem>> TERRACE_TABLE_ITEMS = Arrays.stream(McWoods.values()).map(type -> Pair.of(type, ITEMS.register(type.getSerializedName() + "_terrace_table", () -> new FuelBlockItem(ECBlockRegistry.TERRACE_TABLE_BLOCKS.get(type).get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT), ECConstants.chairBurnTime)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final RegistryObject<Item> STEEL_TERRACE_TABLE_ITEM = ITEMS.register("steel_terrace_table", () -> new BlockItem(ECBlockRegistry.STEEL_TERRACE_TABLE.get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT)));

    public static final RegistryObject<Item> STEEL_TERRACE_CHAIR_ITEM = ITEMS.register("steel_terrace_chair", () -> new BlockItem(ECBlockRegistry.STEEL_TERRACE_CHAIR.get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT)));

    public static final Map<DyeColor, RegistryObject<FuelBlockItem>> COUCH_ITEMS = Arrays.stream(DyeColor.values()).map(type -> Pair.of(type, ITEMS.register(type.getSerializedName() + "_couch", () -> new FuelBlockItem(ECBlockRegistry.COUCH_BLOCKS.get(type).get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT), ECConstants.couchBurnTime)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<DyeColor, RegistryObject<BlockItem>> TABLE_LAMP_ITEMS = Arrays.stream(DyeColor.values()).map(type -> Pair.of(type, ITEMS.register(type.getSerializedName() + "_table_lamp", () -> new BlockItem(ECBlockRegistry.TABLE_LAMP_BLOCKS.get(type).get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT))))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<DyeColor, RegistryObject<BlockItem>> MANUAL_TABLE_LAMP_ITEMS = Arrays.stream(DyeColor.values()).map(type -> Pair.of(type, ITEMS.register(type.getSerializedName() + "_manual_table_lamp", () -> new BlockItem(ECBlockRegistry.MANUAL_TABLE_LAMP_BLOCKS.get(type).get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT))))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final RegistryObject<Item> PLATE_ITEM = ITEMS.register("plate", () -> new BlockItem(ECBlockRegistry.PLATE.get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT)));

    // Stairs
    public static final Map<McWoods, RegistryObject<FuelBlockItem>> SUSPENDED_STAIRS_ITEMS = Arrays.stream(McWoods.values()).map(type -> Pair.of(type, ITEMS.register(type.getSerializedName() + "_suspended_stairs", () -> new FuelBlockItem(ECBlockRegistry.SUSPENDED_STAIRS_BLOCKS.get(type).get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT), ECConstants.suspendedStairBurnTime)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));
    public static final Map<McWoods, RegistryObject<FuelBlockItem>> LARGE_SUSPENDED_STAIRS_ITEMS = Arrays.stream(McWoods.values()).map(type -> Pair.of(type, ITEMS.register(type.getSerializedName() + "_large_suspended_stairs", () -> new FuelBlockItem(ECBlockRegistry.LARGE_SUSPENDED_STAIRS_BLOCKS.get(type).get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT), ECConstants.largeSuspendedStairBurnTime)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final RegistryObject<Item> STEEL_SUSPENDED_STAIRS_ITEM = ITEMS.register("steel_suspended_stairs", () -> new BlockItem(ECBlockRegistry.STEEL_SUSPENDED_STAIRS.get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> RUSTY_SUSPENDED_STAIRS_ITEM = ITEMS.register("rusty_suspended_stairs", () -> new BlockItem(ECBlockRegistry.RUSTY_SUSPENDED_STAIRS.get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> STEEL_LARGE_SUSPENDED_STAIRS_ITEM = ITEMS.register("steel_large_suspended_stairs", () -> new BlockItem(ECBlockRegistry.STEEL_LARGE_SUSPENDED_STAIRS.get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> RUSTY_LARGE_SUSPENDED_STAIRS_ITEM = ITEMS.register("rusty_large_suspended_stairs", () -> new BlockItem(ECBlockRegistry.RUSTY_LARGE_SUSPENDED_STAIRS.get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT)));

    // Doors
    public static final Map<McWoods, RegistryObject<FuelBlockItem>> FANCY_DOOR_ITEMS = Arrays.stream(McWoods.values()).map(type -> Pair.of(type, ITEMS.register(type.getSerializedName() + "_fancy_door", () -> new FuelBlockItem(ECBlockRegistry.FANCY_DOOR_BLOCKS.get(type).get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT), ECConstants.doorBurnTime)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<McWoods, RegistryObject<FuelBlockItem>> PLAIN_DOOR_ITEMS = Arrays.stream(McWoods.values()).map(type -> Pair.of(type, ITEMS.register(type.getSerializedName() + "_plain_door", () -> new FuelBlockItem(ECBlockRegistry.PLAIN_DOOR_BLOCKS.get(type).get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT), ECConstants.doorBurnTime)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final RegistryObject<Item> STEEL_DOOR_ITEM = ITEMS.register("steel_door", () -> new BlockItem(ECBlockRegistry.STEEL_DOOR.get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> STURDY_STEEL_DOOR_ITEM = ITEMS.register("sturdy_steel_door", () -> new BlockItem(ECBlockRegistry.STURDY_STEEL_DOOR.get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> WARNING_STEEL_DOOR_ITEM = ITEMS.register("warning_steel_door", () -> new BlockItem(ECBlockRegistry.WARNING_STEEL_DOOR.get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> WHITE_STEEL_DOOR_ITEM = ITEMS.register("white_steel_door", () -> new BlockItem(ECBlockRegistry.WHITE_STEEL_DOOR.get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> STURDY_WHITE_STEEL_DOOR_ITEM = ITEMS.register("sturdy_white_steel_door", () -> new BlockItem(ECBlockRegistry.STURDY_WHITE_STEEL_DOOR.get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> WARNING_WHITE_STEEL_DOOR_ITEM = ITEMS.register("warning_white_steel_door", () -> new BlockItem(ECBlockRegistry.WARNING_WHITE_STEEL_DOOR.get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> RUSTY_DOOR_ITEM = ITEMS.register("rusty_door", () -> new BlockItem(ECBlockRegistry.RUSTY_DOOR.get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> STURDY_RUSTY_DOOR_ITEM = ITEMS.register("sturdy_rusty_door", () -> new BlockItem(ECBlockRegistry.STURDY_RUSTY_DOOR.get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> WARNING_RUSTY_DOOR_ITEM = ITEMS.register("warning_rusty_door", () -> new BlockItem(ECBlockRegistry.WARNING_RUSTY_DOOR.get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT)));

    // Pillows
    public static final Map<DyeColor, RegistryObject<FuelBlockItem>> PILLOW_ITEMS = Arrays.stream(DyeColor.values()).map(type -> Pair.of(type, ITEMS.register(type.getSerializedName() + "_pillow", () -> new FuelBlockItem(ECBlockRegistry.PILLOW_BLOCKS.get(type).get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT), ECConstants.doorBurnTime)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    // Crates
    public static final Map<McWoods, RegistryObject<BlockItem>> WOODEN_CRATE_ITEMS = Arrays.stream(McWoods.values()).map(type -> Pair.of(type, ITEMS.register(type.getSerializedName() + "_wooden_crate", () -> new BlockItem(ECBlockRegistry.WOODEN_CRATE_BLOCKS.get(type).get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT).stacksTo(1))))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    // Chests
    public static final Map<McWoods, RegistryObject<FuelBlockItem>> FANCY_CHEST_ITEMS = Arrays.stream(McWoods.values()).map(type -> Pair.of(type, ITEMS.register(type.getSerializedName() + "_fancy_chest", () -> new FuelBlockItem(ECBlockRegistry.FANCY_CHEST_BLOCKS.get(type).get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT), ECConstants.chestBurnTime)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final RegistryObject<Item> LOCKER_ITEM = ITEMS.register("locker", () -> new BlockItem(ECBlockRegistry.LOCKER.get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT)));

    // Beds
    public static final Map<DyeColor, RegistryObject<FuelBlockItem>> OAK_FANCY_BED_ITEMS = Arrays.stream(DyeColor.values()).map(type -> Pair.of(type, ITEMS.register(type.getSerializedName() + "_oak_fancy_bed", () -> new FuelBlockItem(ECBlockRegistry.OAK_FANCY_BED_BLOCKS.get(type).get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT), ECConstants.bedBurnTime)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));
    public static final Map<DyeColor, RegistryObject<FuelBlockItem>> BIRCH_FANCY_BED_ITEMS = Arrays.stream(DyeColor.values()).map(type -> Pair.of(type, ITEMS.register(type.getSerializedName() + "_birch_fancy_bed", () -> new FuelBlockItem(ECBlockRegistry.BIRCH_FANCY_BED_BLOCKS.get(type).get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT), ECConstants.bedBurnTime)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));
    public static final Map<DyeColor, RegistryObject<FuelBlockItem>> SPRUCE_FANCY_BED_ITEMS = Arrays.stream(DyeColor.values()).map(type -> Pair.of(type, ITEMS.register(type.getSerializedName() + "_spruce_fancy_bed", () -> new FuelBlockItem(ECBlockRegistry.SPRUCE_FANCY_BED_BLOCKS.get(type).get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT), ECConstants.bedBurnTime)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));
    public static final Map<DyeColor, RegistryObject<FuelBlockItem>> JUNGLE_FANCY_BED_ITEMS = Arrays.stream(DyeColor.values()).map(type -> Pair.of(type, ITEMS.register(type.getSerializedName() + "_jungle_fancy_bed", () -> new FuelBlockItem(ECBlockRegistry.JUNGLE_FANCY_BED_BLOCKS.get(type).get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT), ECConstants.bedBurnTime)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));
    public static final Map<DyeColor, RegistryObject<FuelBlockItem>> DARK_OAK_FANCY_BED_ITEMS = Arrays.stream(DyeColor.values()).map(type -> Pair.of(type, ITEMS.register(type.getSerializedName() + "_dark_oak_fancy_bed", () -> new FuelBlockItem(ECBlockRegistry.DARK_OAK_FANCY_BED_BLOCKS.get(type).get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT), ECConstants.bedBurnTime)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));
    public static final Map<DyeColor, RegistryObject<FuelBlockItem>> ACACIA_FANCY_BED_ITEMS = Arrays.stream(DyeColor.values()).map(type -> Pair.of(type, ITEMS.register(type.getSerializedName() + "_acacia_fancy_bed", () -> new FuelBlockItem(ECBlockRegistry.ACACIA_FANCY_BED_BLOCKS.get(type).get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT), ECConstants.bedBurnTime)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));
    public static final Map<DyeColor, RegistryObject<FuelBlockItem>> WARPED_FANCY_BED_ITEMS = Arrays.stream(DyeColor.values()).map(type -> Pair.of(type, ITEMS.register(type.getSerializedName() + "_warped_fancy_bed", () -> new FuelBlockItem(ECBlockRegistry.WARPED_FANCY_BED_BLOCKS.get(type).get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT), ECConstants.bedBurnTime)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));
    public static final Map<DyeColor, RegistryObject<FuelBlockItem>> CRIMSON_FANCY_BED_ITEMS = Arrays.stream(DyeColor.values()).map(type -> Pair.of(type, ITEMS.register(type.getSerializedName() + "_crimson_fancy_bed", () -> new FuelBlockItem(ECBlockRegistry.CRIMSON_FANCY_BED_BLOCKS.get(type).get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT), ECConstants.bedBurnTime)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static void init()
    {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}