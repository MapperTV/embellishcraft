package tv.mapper.embellishcraft.item;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

import org.apache.commons.lang3.tuple.Pair;

import net.minecraft.item.BlockItem;
import net.minecraft.item.DyeColor;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import tv.mapper.embellishcraft.ECConstants;
import tv.mapper.embellishcraft.block.ECBlockRegistry;
import tv.mapper.embellishcraft.util.McWoods;
import tv.mapper.embellishcraft.util.RockType;
import tv.mapper.mapperbase.item.FuelBlockItem;

public class ECItemRegistry
{
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ECConstants.MODID);

    // Rocks
    public static final Map<RockType, RegistryObject<BlockItem>> ROCKS_ITEMS = Arrays.stream(RockType.values()).map(
        type -> Pair.of(type, ITEMS.register(type.getName(), () -> new BlockItem(ECBlockRegistry.ROCK_BLOCKS.get(type).get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT))))).collect(
            Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<BlockItem>> ROCK_STAIRS_ITEMS = Arrays.stream(RockType.values()).map(
        type -> Pair.of(type, ITEMS.register(type.getName() + "_stairs", () -> new BlockItem(ECBlockRegistry.ROCK_STAIRS.get(type).get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT))))).collect(
            Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<BlockItem>> ROCK_SLABS_ITEMS = Arrays.stream(RockType.values()).map(
        type -> Pair.of(type, ITEMS.register(type.getName() + "_slab", () -> new BlockItem(ECBlockRegistry.ROCK_SLABS.get(type).get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT))))).collect(
            Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<BlockItem>> ROCK_WALLS_ITEMS = Arrays.stream(RockType.values()).map(
        type -> Pair.of(type, ITEMS.register(type.getName() + "_wall", () -> new BlockItem(ECBlockRegistry.ROCK_WALLS.get(type).get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT))))).collect(
            Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<BlockItem>> ROCK_PRESSURE_PLATES_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type,
        ITEMS.register(type.getName() + "_pressure_plate", () -> new BlockItem(ECBlockRegistry.ROCK_PRESSURE_PLATES.get(type).get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT))))).collect(
            Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<BlockItem>> ROCK_BUTTONS_ITEMS = Arrays.stream(RockType.values()).map(
        type -> Pair.of(type, ITEMS.register(type.getName() + "_button", () -> new BlockItem(ECBlockRegistry.ROCK_BUTTONS.get(type).get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT))))).collect(
            Collectors.toMap(Pair::getKey, Pair::getValue));

    // Cobblestones
    public static final Map<RockType, RegistryObject<BlockItem>> ROCKS_COBBLESTONES_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type,
        ITEMS.register(type.getName() + "_cobblestone", () -> new BlockItem(ECBlockRegistry.ROCK_COBBLESTONES.get(type).get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT))))).collect(
            Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<BlockItem>> ROCK_COBBLESTONE_STAIRS_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type,
        ITEMS.register(type.getName() + "_cobblestone_stairs", () -> new BlockItem(ECBlockRegistry.ROCK_COBBLESTONE_STAIRS.get(type).get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT))))).collect(
            Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<BlockItem>> ROCK_COBBLESTONE_SLABS_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type,
        ITEMS.register(type.getName() + "_cobblestone_slab", () -> new BlockItem(ECBlockRegistry.ROCK_COBBLESTONE_SLABS.get(type).get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT))))).collect(
            Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<BlockItem>> ROCK_COBBLESTONE_WALLS_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type,
        ITEMS.register(type.getName() + "_cobblestone_wall", () -> new BlockItem(ECBlockRegistry.ROCK_COBBLESTONE_WALLS.get(type).get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT))))).collect(
            Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<BlockItem>> ROCK_COBBLESTONE_PRESSURE_PLATES_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type,
        ITEMS.register(type.getName() + "_cobblestone_pressure_plate",
            () -> new BlockItem(ECBlockRegistry.ROCK_COBBLESTONE_PRESSURE_PLATES.get(type).get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT))))).collect(
                Collectors.toMap(Pair::getKey, Pair::getValue));

    // Smooth rocks
    public static final Map<RockType, RegistryObject<BlockItem>> SMOOTH_ROCK_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type,
        ITEMS.register("smooth_" + type.getName(), () -> new BlockItem(ECBlockRegistry.SMOOTH_ROCK_BLOCKS.get(type).get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT))))).collect(
            Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<BlockItem>> SMOOTH_ROCK_STAIRS_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type,
        ITEMS.register("smooth_" + type.getName() + "_stairs", () -> new BlockItem(ECBlockRegistry.SMOOTH_ROCK_STAIRS.get(type).get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT))))).collect(
            Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<BlockItem>> SMOOTH_ROCK_SLABS_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type,
        ITEMS.register("smooth_" + type.getName() + "_slab", () -> new BlockItem(ECBlockRegistry.SMOOTH_ROCK_SLABS.get(type).get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT))))).collect(
            Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<BlockItem>> SMOOTH_ROCK_WALLS_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type,
        ITEMS.register("smooth_" + type.getName() + "_wall", () -> new BlockItem(ECBlockRegistry.SMOOTH_ROCK_WALLS.get(type).get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT))))).collect(
            Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<BlockItem>> SMOOTH_ROCK_PRESSURE_PLATES_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type,
        ITEMS.register("smooth_" + type.getName() + "_pressure_plate",
            () -> new BlockItem(ECBlockRegistry.SMOOTH_ROCK_PRESSURE_PLATES.get(type).get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT))))).collect(
                Collectors.toMap(Pair::getKey, Pair::getValue));

    // Polished rocks
    public static final Map<RockType, RegistryObject<BlockItem>> POLISHED_ROCK_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type,
        ITEMS.register("polished_" + type.getName(), () -> new BlockItem(ECBlockRegistry.POLISHED_ROCK_BLOCKS.get(type).get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT))))).collect(
            Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<BlockItem>> POLISHED_ROCK_STAIRS_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type,
        ITEMS.register("polished_" + type.getName() + "_stairs", () -> new BlockItem(ECBlockRegistry.POLISHED_ROCK_STAIRS.get(type).get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT))))).collect(
            Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<BlockItem>> POLISHED_ROCK_SLABS_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type,
        ITEMS.register("polished_" + type.getName() + "_slab", () -> new BlockItem(ECBlockRegistry.POLISHED_ROCK_SLABS.get(type).get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT))))).collect(
            Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<BlockItem>> POLISHED_ROCK_WALLS_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type,
        ITEMS.register("polished_" + type.getName() + "_wall", () -> new BlockItem(ECBlockRegistry.POLISHED_ROCK_WALLS.get(type).get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT))))).collect(
            Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<BlockItem>> POLISHED_ROCK_PRESSURE_PLATES_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type,
        ITEMS.register("polished_" + type.getName() + "_pressure_plate",
            () -> new BlockItem(ECBlockRegistry.POLISHED_ROCK_PRESSURE_PLATES.get(type).get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT))))).collect(
                Collectors.toMap(Pair::getKey, Pair::getValue));

    // Rock pavings
    public static final Map<RockType, RegistryObject<BlockItem>> ROCKS_PAVINGS_ITEMS = Arrays.stream(RockType.values()).map(
        type -> Pair.of(type, ITEMS.register(type.getName() + "_paving", () -> new BlockItem(ECBlockRegistry.ROCK_PAVINGS.get(type).get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT))))).collect(
            Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<BlockItem>> ROCK_PAVING_STAIRS_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type,
        ITEMS.register(type.getName() + "_paving_stairs", () -> new BlockItem(ECBlockRegistry.ROCK_PAVING_STAIRS.get(type).get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT))))).collect(
            Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<BlockItem>> ROCK_PAVING_SLABS_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type,
        ITEMS.register(type.getName() + "_paving_slab", () -> new BlockItem(ECBlockRegistry.ROCK_PAVING_SLABS.get(type).get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT))))).collect(
            Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<BlockItem>> ROCK_PAVING_WALLS_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type,
        ITEMS.register(type.getName() + "_paving_wall", () -> new BlockItem(ECBlockRegistry.ROCK_PAVING_WALLS.get(type).get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT))))).collect(
            Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<BlockItem>> ROCK_PAVING_PRESSURE_PLATES_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type,
        ITEMS.register(type.getName() + "_paving_pressure_plate",
            () -> new BlockItem(ECBlockRegistry.ROCK_PAVING_PRESSURE_PLATES.get(type).get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT))))).collect(
                Collectors.toMap(Pair::getKey, Pair::getValue));

    // Rock tiles
    public static final Map<RockType, RegistryObject<BlockItem>> ROCKS_TILES_ITEMS = Arrays.stream(RockType.values()).map(
        type -> Pair.of(type, ITEMS.register(type.getName() + "_tiles", () -> new BlockItem(ECBlockRegistry.ROCK_TILES.get(type).get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT))))).collect(
            Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<BlockItem>> ROCK_TILES_STAIRS_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type,
        ITEMS.register(type.getName() + "_tiles_stairs", () -> new BlockItem(ECBlockRegistry.ROCK_TILES_STAIRS.get(type).get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT))))).collect(
            Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<BlockItem>> ROCK_TILES_SLABS_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type,
        ITEMS.register(type.getName() + "_tiles_slab", () -> new BlockItem(ECBlockRegistry.ROCK_TILES_SLABS.get(type).get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT))))).collect(
            Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<BlockItem>> ROCK_TILES_WALLS_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type,
        ITEMS.register(type.getName() + "_tiles_wall", () -> new BlockItem(ECBlockRegistry.ROCK_TILES_WALLS.get(type).get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT))))).collect(
            Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<BlockItem>> ROCK_TILES_PRESSURE_PLATES_ITEMS = Arrays.stream(RockType.values()).map(
        type -> Pair.of(type,
            ITEMS.register(type.getName() + "_tiles_pressure_plate",
                () -> new BlockItem(ECBlockRegistry.ROCK_TILES_PRESSURE_PLATES.get(type).get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT))))).collect(
                    Collectors.toMap(Pair::getKey, Pair::getValue));

    // Rock bricks
    public static final Map<RockType, RegistryObject<BlockItem>> ROCKS_BRICKS_ITEMS = Arrays.stream(RockType.values()).map(
        type -> Pair.of(type, ITEMS.register(type.getName() + "_bricks", () -> new BlockItem(ECBlockRegistry.ROCK_BRICKS.get(type).get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT))))).collect(
            Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<BlockItem>> ROCK_BRICKS_STAIRS_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type,
        ITEMS.register(type.getName() + "_bricks_stairs", () -> new BlockItem(ECBlockRegistry.ROCK_BRICKS_STAIRS.get(type).get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT))))).collect(
            Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<BlockItem>> ROCK_BRICKS_SLABS_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type,
        ITEMS.register(type.getName() + "_bricks_slab", () -> new BlockItem(ECBlockRegistry.ROCK_BRICKS_SLABS.get(type).get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT))))).collect(
            Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<BlockItem>> ROCK_BRICKS_WALLS_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type,
        ITEMS.register(type.getName() + "_bricks_wall", () -> new BlockItem(ECBlockRegistry.ROCK_BRICKS_WALLS.get(type).get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT))))).collect(
            Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<BlockItem>> ROCK_BRICKS_PRESSURE_PLATES_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type,
        ITEMS.register(type.getName() + "_bricks_pressure_plate",
            () -> new BlockItem(ECBlockRegistry.ROCK_BRICKS_PRESSURE_PLATES.get(type).get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT))))).collect(
                Collectors.toMap(Pair::getKey, Pair::getValue));

    // Rock large bricks
    public static final Map<RockType, RegistryObject<BlockItem>> ROCKS_LARGE_BRICKS_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type,
        ITEMS.register(type.getName() + "_large_bricks", () -> new BlockItem(ECBlockRegistry.ROCK_LARGE_BRICKS.get(type).get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT))))).collect(
            Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<BlockItem>> ROCK_LARGE_BRICKS_STAIRS_ITEMS = Arrays.stream(RockType.values()).map(
        type -> Pair.of(type,
            ITEMS.register(type.getName() + "_large_bricks_stairs",
                () -> new BlockItem(ECBlockRegistry.ROCK_LARGE_BRICKS_STAIRS.get(type).get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT))))).collect(
                    Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<BlockItem>> ROCK_LARGE_BRICKS_SLABS_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type,
        ITEMS.register(type.getName() + "_large_bricks_slab", () -> new BlockItem(ECBlockRegistry.ROCK_LARGE_BRICKS_SLABS.get(type).get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT))))).collect(
            Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<BlockItem>> ROCK_LARGE_BRICKS_WALLS_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type,
        ITEMS.register(type.getName() + "_large_bricks_wall", () -> new BlockItem(ECBlockRegistry.ROCK_LARGE_BRICKS_WALLS.get(type).get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT))))).collect(
            Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<BlockItem>> ROCK_LARGE_BRICKS_PRESSURE_PLATES_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type,
        ITEMS.register(type.getName() + "_large_bricks_pressure_plate",
            () -> new BlockItem(ECBlockRegistry.ROCK_LARGE_BRICKS_PRESSURE_PLATES.get(type).get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT))))).collect(
                Collectors.toMap(Pair::getKey, Pair::getValue));

    // Rock paving stones
    public static final Map<RockType, RegistryObject<BlockItem>> ROCKS_PAVING_STONES_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type,
        ITEMS.register(type.getName() + "_paving_stones", () -> new BlockItem(ECBlockRegistry.ROCK_PAVING_STONES.get(type).get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT))))).collect(
            Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<BlockItem>> ROCK_PAVING_STONES_STAIRS_ITEMS = Arrays.stream(RockType.values()).map(
        type -> Pair.of(type,
            ITEMS.register(type.getName() + "_paving_stones_stairs",
                () -> new BlockItem(ECBlockRegistry.ROCK_PAVING_STONES_STAIRS.get(type).get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT))))).collect(
                    Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<BlockItem>> ROCK_PAVING_STONES_SLABS_ITEMS = Arrays.stream(RockType.values()).map(
        type -> Pair.of(type,
            ITEMS.register(type.getName() + "_paving_stones_slab",
                () -> new BlockItem(ECBlockRegistry.ROCK_PAVING_STONES_SLABS.get(type).get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT))))).collect(
                    Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<BlockItem>> ROCK_PAVING_STONES_WALLS_ITEMS = Arrays.stream(RockType.values()).map(
        type -> Pair.of(type,
            ITEMS.register(type.getName() + "_paving_stones_wall",
                () -> new BlockItem(ECBlockRegistry.ROCK_PAVING_STONES_WALLS.get(type).get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT))))).collect(
                    Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<BlockItem>> ROCK_PAVING_STONES_PRESSURE_PLATES_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type,
        ITEMS.register(type.getName() + "_paving_stones_pressure_plate",
            () -> new BlockItem(ECBlockRegistry.ROCK_PAVING_STONES_PRESSURE_PLATES.get(type).get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT))))).collect(
                Collectors.toMap(Pair::getKey, Pair::getValue));

    // Rock ornaments
    public static final Map<RockType, RegistryObject<BlockItem>> ROCKS_ORNAMENTS_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type,
        ITEMS.register(type.getName() + "_ornament", () -> new BlockItem(ECBlockRegistry.ROCK_ORNAMENTS.get(type).get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT))))).collect(
            Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<BlockItem>> ROCK_ORNAMENT_PRESSURE_PLATES_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type,
        ITEMS.register(type.getName() + "_ornament_pressure_plate",
            () -> new BlockItem(ECBlockRegistry.ROCK_ORNAMENT_PRESSURE_PLATES.get(type).get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT))))).collect(
                Collectors.toMap(Pair::getKey, Pair::getValue));

    // Rock rooftiles
    public static final Map<RockType, RegistryObject<BlockItem>> ROCKS_ROOFTILES_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type,
        ITEMS.register(type.getName() + "_rooftiles", () -> new BlockItem(ECBlockRegistry.ROCK_ROOFTILES.get(type).get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT))))).collect(
            Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<BlockItem>> ROCK_ROOFTILES_STAIRS_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type,
        ITEMS.register(type.getName() + "_rooftiles_stairs", () -> new BlockItem(ECBlockRegistry.ROCK_ROOFTILES_STAIRS.get(type).get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT))))).collect(
            Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<BlockItem>> ROCK_ROOFTILES_SLABS_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type,
        ITEMS.register(type.getName() + "_rooftiles_slab", () -> new BlockItem(ECBlockRegistry.ROCK_ROOFTILES_SLABS.get(type).get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT))))).collect(
            Collectors.toMap(Pair::getKey, Pair::getValue));

    // Paving stones
    public static final RegistryObject<Item> PAVING_STONES_ITEM = ITEMS.register("paving_stones",
        () -> new BlockItem(ECBlockRegistry.PAVING_STONES.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> PAVING_STONES_STAIRS_ITEM = ITEMS.register("paving_stones_stairs",
        () -> new BlockItem(ECBlockRegistry.PAVING_STONES_STAIRS.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> PAVING_STONES_SLAB_ITEM = ITEMS.register("paving_stones_slab",
        () -> new BlockItem(ECBlockRegistry.PAVING_STONES_SLAB.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> PAVING_STONES_WALL_ITEM = ITEMS.register("paving_stones_wall",
        () -> new BlockItem(ECBlockRegistry.PAVING_STONES_WALL.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> PAVING_STONES_PRESSURE_PLATE_ITEM = ITEMS.register("paving_stones_pressure_plate",
        () -> new BlockItem(ECBlockRegistry.PAVING_STONES_PRESSURE_PLATE.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));

    // Andesite
    public static final RegistryObject<Item> SMOOTH_ANDESITE_ITEM = ITEMS.register("smooth_andesite",
        () -> new BlockItem(ECBlockRegistry.SMOOTH_ANDESITE.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> SMOOTH_ANDESITE_STAIRS_ITEM = ITEMS.register("smooth_andesite_stairs",
        () -> new BlockItem(ECBlockRegistry.SMOOTH_ANDESITE_STAIRS.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> SMOOTH_ANDESITE_SLAB_ITEM = ITEMS.register("smooth_andesite_slab",
        () -> new BlockItem(ECBlockRegistry.SMOOTH_ANDESITE_SLAB.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> SMOOTH_ANDESITE_WALL_ITEM = ITEMS.register("smooth_andesite_wall",
        () -> new BlockItem(ECBlockRegistry.SMOOTH_ANDESITE_WALL.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> SMOOTH_ANDESITE_PRESSURE_PLATE_ITEM = ITEMS.register("smooth_andesite_pressure_plate",
        () -> new BlockItem(ECBlockRegistry.SMOOTH_ANDESITE_PRESSURE_PLATE.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> ANDESITE_BUTTON_ITEM = ITEMS.register("andesite_button",
        () -> new BlockItem(ECBlockRegistry.ANDESITE_BUTTON.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));

    public static final RegistryObject<Item> ANDESITE_PAVING_ITEM = ITEMS.register("andesite_paving",
        () -> new BlockItem(ECBlockRegistry.ANDESITE_PAVING.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> ANDESITE_PAVING_STAIRS_ITEM = ITEMS.register("andesite_paving_stairs",
        () -> new BlockItem(ECBlockRegistry.ANDESITE_PAVING_STAIRS.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> ANDESITE_PAVING_SLAB_ITEM = ITEMS.register("andesite_paving_slab",
        () -> new BlockItem(ECBlockRegistry.ANDESITE_PAVING_SLAB.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> ANDESITE_PAVING_WALL_ITEM = ITEMS.register("andesite_paving_wall",
        () -> new BlockItem(ECBlockRegistry.ANDESITE_PAVING_WALL.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> ANDESITE_PAVING_PRESSURE_PLATE_ITEM = ITEMS.register("andesite_paving_pressure_plate",
        () -> new BlockItem(ECBlockRegistry.ANDESITE_PAVING_PRESSURE_PLATE.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));

    public static final RegistryObject<Item> ANDESITE_TILES_ITEM = ITEMS.register("andesite_tiles",
        () -> new BlockItem(ECBlockRegistry.ANDESITE_TILES.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> ANDESITE_TILES_STAIRS_ITEM = ITEMS.register("andesite_tiles_stairs",
        () -> new BlockItem(ECBlockRegistry.ANDESITE_TILES_STAIRS.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> ANDESITE_TILES_SLAB_ITEM = ITEMS.register("andesite_tiles_slab",
        () -> new BlockItem(ECBlockRegistry.ANDESITE_TILES_SLAB.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> ANDESITE_TILES_WALL_ITEM = ITEMS.register("andesite_tiles_wall",
        () -> new BlockItem(ECBlockRegistry.ANDESITE_TILES_WALL.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> ANDESITE_TILES_PRESSURE_PLATE_ITEM = ITEMS.register("andesite_tiles_pressure_plate",
        () -> new BlockItem(ECBlockRegistry.ANDESITE_TILES_PRESSURE_PLATE.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));

    public static final RegistryObject<Item> ANDESITE_BRICKS_ITEM = ITEMS.register("andesite_bricks",
        () -> new BlockItem(ECBlockRegistry.ANDESITE_BRICKS.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> ANDESITE_BRICKS_STAIRS_ITEM = ITEMS.register("andesite_bricks_stairs",
        () -> new BlockItem(ECBlockRegistry.ANDESITE_BRICKS_STAIRS.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> ANDESITE_BRICKS_SLAB_ITEM = ITEMS.register("andesite_bricks_slab",
        () -> new BlockItem(ECBlockRegistry.ANDESITE_BRICKS_SLAB.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> ANDESITE_BRICKS_WALL_ITEM = ITEMS.register("andesite_bricks_wall",
        () -> new BlockItem(ECBlockRegistry.ANDESITE_BRICKS_WALL.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> ANDESITE_BRICKS_PRESSURE_PLATE_ITEM = ITEMS.register("andesite_bricks_pressure_plate",
        () -> new BlockItem(ECBlockRegistry.ANDESITE_BRICKS_PRESSURE_PLATE.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));

    public static final RegistryObject<Item> ANDESITE_LARGE_BRICKS_ITEM = ITEMS.register("andesite_large_bricks",
        () -> new BlockItem(ECBlockRegistry.ANDESITE_LARGE_BRICKS.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> ANDESITE_LARGE_BRICKS_STAIRS_ITEM = ITEMS.register("andesite_large_bricks_stairs",
        () -> new BlockItem(ECBlockRegistry.ANDESITE_LARGE_BRICKS_STAIRS.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> ANDESITE_LARGE_BRICKS_SLAB_ITEM = ITEMS.register("andesite_large_bricks_slab",
        () -> new BlockItem(ECBlockRegistry.ANDESITE_LARGE_BRICKS_SLAB.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> ANDESITE_LARGE_BRICKS_WALL_ITEM = ITEMS.register("andesite_large_bricks_wall",
        () -> new BlockItem(ECBlockRegistry.ANDESITE_LARGE_BRICKS_WALL.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> ANDESITE_LARGE_BRICKS_PRESSURE_PLATE_ITEM = ITEMS.register("andesite_large_bricks_pressure_plate",
        () -> new BlockItem(ECBlockRegistry.ANDESITE_LARGE_BRICKS_PRESSURE_PLATE.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));

    public static final RegistryObject<Item> ANDESITE_PAVING_STONES_ITEM = ITEMS.register("andesite_paving_stones",
        () -> new BlockItem(ECBlockRegistry.ANDESITE_PAVING_STONES.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> ANDESITE_PAVING_STONES_STAIRS_ITEM = ITEMS.register("andesite_paving_stones_stairs",
        () -> new BlockItem(ECBlockRegistry.ANDESITE_PAVING_STONES_STAIRS.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> ANDESITE_PAVING_STONES_SLAB_ITEM = ITEMS.register("andesite_paving_stones_slab",
        () -> new BlockItem(ECBlockRegistry.ANDESITE_PAVING_STONES_SLAB.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> ANDESITE_PAVING_STONES_WALL_ITEM = ITEMS.register("andesite_paving_stones_wall",
        () -> new BlockItem(ECBlockRegistry.ANDESITE_PAVING_STONES_WALL.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> ANDESITE_PAVING_STONES_PRESSURE_PLATE_ITEM = ITEMS.register("andesite_paving_stones_pressure_plate",
        () -> new BlockItem(ECBlockRegistry.ANDESITE_PAVING_STONES_PRESSURE_PLATE.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));

    public static final RegistryObject<Item> ANDESITE_ORNAMENT_ITEM = ITEMS.register("andesite_ornament",
        () -> new BlockItem(ECBlockRegistry.ANDESITE_ORNAMENT.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> ANDESITE_ORNAMENT_PRESSURE_PLATE_ITEM = ITEMS.register("andesite_ornament_pressure_plate",
        () -> new BlockItem(ECBlockRegistry.ANDESITE_ORNAMENT_PRESSURE_PLATE.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));

    public static final RegistryObject<Item> ANDESITE_ROOFTILES_ITEM = ITEMS.register("andesite_rooftiles",
        () -> new BlockItem(ECBlockRegistry.ANDESITE_ROOFTILES.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> ANDESITE_ROOFTILES_STAIRS_ITEM = ITEMS.register("andesite_rooftiles_stairs",
        () -> new BlockItem(ECBlockRegistry.ANDESITE_ROOFTILES_STAIRS.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> ANDESITE_ROOFTILES_SLAB_ITEM = ITEMS.register("andesite_rooftiles_slab",
        () -> new BlockItem(ECBlockRegistry.ANDESITE_ROOFTILES_SLAB.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));

    // Diorite
    public static final RegistryObject<Item> SMOOTH_DIORITE_ITEM = ITEMS.register("smooth_diorite",
        () -> new BlockItem(ECBlockRegistry.SMOOTH_DIORITE.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> SMOOTH_DIORITE_STAIRS_ITEM = ITEMS.register("smooth_diorite_stairs",
        () -> new BlockItem(ECBlockRegistry.SMOOTH_DIORITE_STAIRS.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> SMOOTH_DIORITE_SLAB_ITEM = ITEMS.register("smooth_diorite_slab",
        () -> new BlockItem(ECBlockRegistry.SMOOTH_DIORITE_SLAB.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> SMOOTH_DIORITE_WALL_ITEM = ITEMS.register("smooth_diorite_wall",
        () -> new BlockItem(ECBlockRegistry.SMOOTH_DIORITE_WALL.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> SMOOTH_DIORITE_PRESSURE_PLATE_ITEM = ITEMS.register("smooth_diorite_pressure_plate",
        () -> new BlockItem(ECBlockRegistry.SMOOTH_DIORITE_PRESSURE_PLATE.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> DIORITE_BUTTON_ITEM = ITEMS.register("diorite_button",
        () -> new BlockItem(ECBlockRegistry.DIORITE_BUTTON.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));

    public static final RegistryObject<Item> DIORITE_PAVING_ITEM = ITEMS.register("diorite_paving",
        () -> new BlockItem(ECBlockRegistry.DIORITE_PAVING.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> DIORITE_PAVING_STAIRS_ITEM = ITEMS.register("diorite_paving_stairs",
        () -> new BlockItem(ECBlockRegistry.DIORITE_PAVING_STAIRS.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> DIORITE_PAVING_SLAB_ITEM = ITEMS.register("diorite_paving_slab",
        () -> new BlockItem(ECBlockRegistry.DIORITE_PAVING_SLAB.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> DIORITE_PAVING_WALL_ITEM = ITEMS.register("diorite_paving_wall",
        () -> new BlockItem(ECBlockRegistry.DIORITE_PAVING_WALL.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> DIORITE_PAVING_PRESSURE_PLATE_ITEM = ITEMS.register("diorite_paving_pressure_plate",
        () -> new BlockItem(ECBlockRegistry.DIORITE_PAVING_PRESSURE_PLATE.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));

    public static final RegistryObject<Item> DIORITE_TILES_ITEM = ITEMS.register("diorite_tiles",
        () -> new BlockItem(ECBlockRegistry.DIORITE_TILES.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> DIORITE_TILES_STAIRS_ITEM = ITEMS.register("diorite_tiles_stairs",
        () -> new BlockItem(ECBlockRegistry.DIORITE_TILES_STAIRS.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> DIORITE_TILES_SLAB_ITEM = ITEMS.register("diorite_tiles_slab",
        () -> new BlockItem(ECBlockRegistry.DIORITE_TILES_SLAB.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> DIORITE_TILES_WALL_ITEM = ITEMS.register("diorite_tiles_wall",
        () -> new BlockItem(ECBlockRegistry.DIORITE_TILES_WALL.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> DIORITE_TILES_PRESSURE_PLATE_ITEM = ITEMS.register("diorite_tiles_pressure_plate",
        () -> new BlockItem(ECBlockRegistry.DIORITE_TILES_PRESSURE_PLATE.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));

    public static final RegistryObject<Item> DIORITE_BRICKS_ITEM = ITEMS.register("diorite_bricks",
        () -> new BlockItem(ECBlockRegistry.DIORITE_BRICKS.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> DIORITE_BRICKS_STAIRS_ITEM = ITEMS.register("diorite_bricks_stairs",
        () -> new BlockItem(ECBlockRegistry.DIORITE_BRICKS_STAIRS.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> DIORITE_BRICKS_SLAB_ITEM = ITEMS.register("diorite_bricks_slab",
        () -> new BlockItem(ECBlockRegistry.DIORITE_BRICKS_SLAB.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> DIORITE_BRICKS_WALL_ITEM = ITEMS.register("diorite_bricks_wall",
        () -> new BlockItem(ECBlockRegistry.DIORITE_BRICKS_WALL.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> DIORITE_BRICKS_PRESSURE_PLATE_ITEM = ITEMS.register("diorite_bricks_pressure_plate",
        () -> new BlockItem(ECBlockRegistry.DIORITE_BRICKS_PRESSURE_PLATE.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));

    public static final RegistryObject<Item> DIORITE_LARGE_BRICKS_ITEM = ITEMS.register("diorite_large_bricks",
        () -> new BlockItem(ECBlockRegistry.DIORITE_LARGE_BRICKS.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> DIORITE_LARGE_BRICKS_STAIRS_ITEM = ITEMS.register("diorite_large_bricks_stairs",
        () -> new BlockItem(ECBlockRegistry.DIORITE_LARGE_BRICKS_STAIRS.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> DIORITE_LARGE_BRICKS_SLAB_ITEM = ITEMS.register("diorite_large_bricks_slab",
        () -> new BlockItem(ECBlockRegistry.DIORITE_LARGE_BRICKS_SLAB.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> DIORITE_LARGE_BRICKS_WALL_ITEM = ITEMS.register("diorite_large_bricks_wall",
        () -> new BlockItem(ECBlockRegistry.DIORITE_LARGE_BRICKS_WALL.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> DIORITE_LARGE_BRICKS_PRESSURE_PLATE_ITEM = ITEMS.register("diorite_large_bricks_pressure_plate",
        () -> new BlockItem(ECBlockRegistry.DIORITE_LARGE_BRICKS_PRESSURE_PLATE.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));

    public static final RegistryObject<Item> DIORITE_PAVING_STONES_ITEM = ITEMS.register("diorite_paving_stones",
        () -> new BlockItem(ECBlockRegistry.DIORITE_PAVING_STONES.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> DIORITE_PAVING_STONES_STAIRS_ITEM = ITEMS.register("diorite_paving_stones_stairs",
        () -> new BlockItem(ECBlockRegistry.DIORITE_PAVING_STONES_STAIRS.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> DIORITE_PAVING_STONES_SLAB_ITEM = ITEMS.register("diorite_paving_stones_slab",
        () -> new BlockItem(ECBlockRegistry.DIORITE_PAVING_STONES_SLAB.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> DIORITE_PAVING_STONES_WALL_ITEM = ITEMS.register("diorite_paving_stones_wall",
        () -> new BlockItem(ECBlockRegistry.DIORITE_PAVING_STONES_WALL.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> DIORITE_PAVING_STONES_PRESSURE_PLATE_ITEM = ITEMS.register("diorite_paving_stones_pressure_plate",
        () -> new BlockItem(ECBlockRegistry.DIORITE_PAVING_STONES_PRESSURE_PLATE.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));

    public static final RegistryObject<Item> DIORITE_ORNAMENT_ITEM = ITEMS.register("diorite_ornament",
        () -> new BlockItem(ECBlockRegistry.DIORITE_ORNAMENT.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> DIORITE_ORNAMENT_PRESSURE_PLATE_ITEM = ITEMS.register("diorite_ornament_pressure_plate",
        () -> new BlockItem(ECBlockRegistry.DIORITE_ORNAMENT_PRESSURE_PLATE.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));

    public static final RegistryObject<Item> DIORITE_ROOFTILES_ITEM = ITEMS.register("diorite_rooftiles",
        () -> new BlockItem(ECBlockRegistry.DIORITE_ROOFTILES.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> DIORITE_ROOFTILES_STAIRS_ITEM = ITEMS.register("diorite_rooftiles_stairs",
        () -> new BlockItem(ECBlockRegistry.DIORITE_ROOFTILES_STAIRS.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> DIORITE_ROOFTILES_SLAB_ITEM = ITEMS.register("diorite_rooftiles_slab",
        () -> new BlockItem(ECBlockRegistry.DIORITE_ROOFTILES_SLAB.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));

    // Granite
    public static final RegistryObject<Item> SMOOTH_GRANITE_ITEM = ITEMS.register("smooth_granite",
        () -> new BlockItem(ECBlockRegistry.SMOOTH_GRANITE.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> SMOOTH_GRANITE_STAIRS_ITEM = ITEMS.register("smooth_granite_stairs",
        () -> new BlockItem(ECBlockRegistry.SMOOTH_GRANITE_STAIRS.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> SMOOTH_GRANITE_SLAB_ITEM = ITEMS.register("smooth_granite_slab",
        () -> new BlockItem(ECBlockRegistry.SMOOTH_GRANITE_SLAB.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> SMOOTH_GRANITE_WALL_ITEM = ITEMS.register("smooth_granite_wall",
        () -> new BlockItem(ECBlockRegistry.SMOOTH_GRANITE_WALL.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> SMOOTH_GRANITE_PRESSURE_PLATE_ITEM = ITEMS.register("smooth_granite_pressure_plate",
        () -> new BlockItem(ECBlockRegistry.SMOOTH_GRANITE_PRESSURE_PLATE.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> GRANITE_BUTTON_ITEM = ITEMS.register("granite_button",
        () -> new BlockItem(ECBlockRegistry.GRANITE_BUTTON.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));

    public static final RegistryObject<Item> GRANITE_PAVING_ITEM = ITEMS.register("granite_paving",
        () -> new BlockItem(ECBlockRegistry.GRANITE_PAVING.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> GRANITE_PAVING_STAIRS_ITEM = ITEMS.register("granite_paving_stairs",
        () -> new BlockItem(ECBlockRegistry.GRANITE_PAVING_STAIRS.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> GRANITE_PAVING_SLAB_ITEM = ITEMS.register("granite_paving_slab",
        () -> new BlockItem(ECBlockRegistry.GRANITE_PAVING_SLAB.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> GRANITE_PAVING_WALL_ITEM = ITEMS.register("granite_paving_wall",
        () -> new BlockItem(ECBlockRegistry.GRANITE_PAVING_WALL.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> GRANITE_PAVING_PRESSURE_PLATE_ITEM = ITEMS.register("granite_paving_pressure_plate",
        () -> new BlockItem(ECBlockRegistry.GRANITE_PAVING_PRESSURE_PLATE.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));

    public static final RegistryObject<Item> GRANITE_TILES_ITEM = ITEMS.register("granite_tiles",
        () -> new BlockItem(ECBlockRegistry.GRANITE_TILES.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> GRANITE_TILES_STAIRS_ITEM = ITEMS.register("granite_tiles_stairs",
        () -> new BlockItem(ECBlockRegistry.GRANITE_TILES_STAIRS.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> GRANITE_TILES_SLAB_ITEM = ITEMS.register("granite_tiles_slab",
        () -> new BlockItem(ECBlockRegistry.GRANITE_TILES_SLAB.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> GRANITE_TILES_WALL_ITEM = ITEMS.register("granite_tiles_wall",
        () -> new BlockItem(ECBlockRegistry.GRANITE_TILES_WALL.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> GRANITE_TILES_PRESSURE_PLATE_ITEM = ITEMS.register("granite_tiles_pressure_plate",
        () -> new BlockItem(ECBlockRegistry.GRANITE_TILES_PRESSURE_PLATE.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));

    public static final RegistryObject<Item> GRANITE_BRICKS_ITEM = ITEMS.register("granite_bricks",
        () -> new BlockItem(ECBlockRegistry.GRANITE_BRICKS.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> GRANITE_BRICKS_STAIRS_ITEM = ITEMS.register("granite_bricks_stairs",
        () -> new BlockItem(ECBlockRegistry.GRANITE_BRICKS_STAIRS.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> GRANITE_BRICKS_SLAB_ITEM = ITEMS.register("granite_bricks_slab",
        () -> new BlockItem(ECBlockRegistry.GRANITE_BRICKS_SLAB.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> GRANITE_BRICKS_WALL_ITEM = ITEMS.register("granite_bricks_wall",
        () -> new BlockItem(ECBlockRegistry.GRANITE_BRICKS_WALL.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> GRANITE_BRICKS_PRESSURE_PLATE_ITEM = ITEMS.register("granite_bricks_pressure_plate",
        () -> new BlockItem(ECBlockRegistry.GRANITE_BRICKS_PRESSURE_PLATE.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));

    public static final RegistryObject<Item> GRANITE_LARGE_BRICKS_ITEM = ITEMS.register("granite_large_bricks",
        () -> new BlockItem(ECBlockRegistry.GRANITE_LARGE_BRICKS.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> GRANITE_LARGE_BRICKS_STAIRS_ITEM = ITEMS.register("granite_large_bricks_stairs",
        () -> new BlockItem(ECBlockRegistry.GRANITE_LARGE_BRICKS_STAIRS.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> GRANITE_LARGE_BRICKS_SLAB_ITEM = ITEMS.register("granite_large_bricks_slab",
        () -> new BlockItem(ECBlockRegistry.GRANITE_LARGE_BRICKS_SLAB.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> GRANITE_LARGE_BRICKS_WALL_ITEM = ITEMS.register("granite_large_bricks_wall",
        () -> new BlockItem(ECBlockRegistry.GRANITE_LARGE_BRICKS_WALL.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> GRANITE_LARGE_BRICKS_PRESSURE_PLATE_ITEM = ITEMS.register("granite_large_bricks_pressure_plate",
        () -> new BlockItem(ECBlockRegistry.GRANITE_LARGE_BRICKS_PRESSURE_PLATE.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));

    public static final RegistryObject<Item> GRANITE_PAVING_STONES_ITEM = ITEMS.register("granite_paving_stones",
        () -> new BlockItem(ECBlockRegistry.GRANITE_PAVING_STONES.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> GRANITE_PAVING_STONES_STAIRS_ITEM = ITEMS.register("granite_paving_stones_stairs",
        () -> new BlockItem(ECBlockRegistry.GRANITE_PAVING_STONES_STAIRS.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> GRANITE_PAVING_STONES_SLAB_ITEM = ITEMS.register("granite_paving_stones_slab",
        () -> new BlockItem(ECBlockRegistry.GRANITE_PAVING_STONES_SLAB.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> GRANITE_PAVING_STONES_WALL_ITEM = ITEMS.register("granite_paving_stones_wall",
        () -> new BlockItem(ECBlockRegistry.GRANITE_PAVING_STONES_WALL.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> GRANITE_PAVING_STONES_PRESSURE_PLATE_ITEM = ITEMS.register("granite_paving_stones_pressure_plate",
        () -> new BlockItem(ECBlockRegistry.GRANITE_PAVING_STONES_PRESSURE_PLATE.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));

    public static final RegistryObject<Item> GRANITE_ORNAMENT_ITEM = ITEMS.register("granite_ornament",
        () -> new BlockItem(ECBlockRegistry.GRANITE_ORNAMENT.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> GRANITE_ORNAMENT_PRESSURE_PLATE_ITEM = ITEMS.register("granite_ornament_pressure_plate",
        () -> new BlockItem(ECBlockRegistry.GRANITE_ORNAMENT_PRESSURE_PLATE.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));

    public static final RegistryObject<Item> GRANITE_ROOFTILES_ITEM = ITEMS.register("granite_rooftiles",
        () -> new BlockItem(ECBlockRegistry.GRANITE_ROOFTILES.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> GRANITE_ROOFTILES_STAIRS_ITEM = ITEMS.register("granite_rooftiles_stairs",
        () -> new BlockItem(ECBlockRegistry.GRANITE_ROOFTILES_STAIRS.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> GRANITE_ROOFTILES_SLAB_ITEM = ITEMS.register("granite_rooftiles_slab",
        () -> new BlockItem(ECBlockRegistry.GRANITE_ROOFTILES_SLAB.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));

    // Sandstone
    public static final RegistryObject<Item> SANDSTONE_BUTTON_ITEM = ITEMS.register("sandstone_button",
        () -> new BlockItem(ECBlockRegistry.SANDSTONE_BUTTON.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));

    public static final RegistryObject<Item> SMOOTH_SANDSTONE_WALL_ITEM = ITEMS.register("smooth_sandstone_wall",
        () -> new BlockItem(ECBlockRegistry.SMOOTH_SANDSTONE_WALL.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> SMOOTH_SANDSTONE_PRESSURE_PLATE_ITEM = ITEMS.register("smooth_sandstone_pressure_plate",
        () -> new BlockItem(ECBlockRegistry.SMOOTH_SANDSTONE_PRESSURE_PLATE.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));

    public static final RegistryObject<Item> POLISHED_SANDSTONE_ITEM = ITEMS.register("polished_sandstone",
        () -> new BlockItem(ECBlockRegistry.POLISHED_SANDSTONE.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> POLISHED_SANDSTONE_STAIRS_ITEM = ITEMS.register("polished_sandstone_stairs",
        () -> new BlockItem(ECBlockRegistry.POLISHED_SANDSTONE_STAIRS.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> POLISHED_SANDSTONE_SLAB_ITEM = ITEMS.register("polished_sandstone_slab",
        () -> new BlockItem(ECBlockRegistry.POLISHED_SANDSTONE_SLAB.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> POLISHED_SANDSTONE_WALL_ITEM = ITEMS.register("polished_sandstone_wall",
        () -> new BlockItem(ECBlockRegistry.POLISHED_SANDSTONE_WALL.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> POLISHED_SANDSTONE_PRESSURE_PLATE_ITEM = ITEMS.register("polished_sandstone_pressure_plate",
        () -> new BlockItem(ECBlockRegistry.POLISHED_SANDSTONE_PRESSURE_PLATE.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));

    public static final RegistryObject<Item> SANDSTONE_PAVING_ITEM = ITEMS.register("sandstone_paving",
        () -> new BlockItem(ECBlockRegistry.SANDSTONE_PAVING.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> SANDSTONE_PAVING_STAIRS_ITEM = ITEMS.register("sandstone_paving_stairs",
        () -> new BlockItem(ECBlockRegistry.SANDSTONE_PAVING_STAIRS.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> SANDSTONE_PAVING_SLAB_ITEM = ITEMS.register("sandstone_paving_slab",
        () -> new BlockItem(ECBlockRegistry.SANDSTONE_PAVING_SLAB.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> SANDSTONE_PAVING_WALL_ITEM = ITEMS.register("sandstone_paving_wall",
        () -> new BlockItem(ECBlockRegistry.SANDSTONE_PAVING_WALL.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> SANDSTONE_PAVING_PRESSURE_PLATE_ITEM = ITEMS.register("sandstone_paving_pressure_plate",
        () -> new BlockItem(ECBlockRegistry.SANDSTONE_PAVING_PRESSURE_PLATE.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));

    public static final RegistryObject<Item> SANDSTONE_TILES_ITEM = ITEMS.register("sandstone_tiles",
        () -> new BlockItem(ECBlockRegistry.SANDSTONE_TILES.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> SANDSTONE_TILES_STAIRS_ITEM = ITEMS.register("sandstone_tiles_stairs",
        () -> new BlockItem(ECBlockRegistry.SANDSTONE_TILES_STAIRS.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> SANDSTONE_TILES_SLAB_ITEM = ITEMS.register("sandstone_tiles_slab",
        () -> new BlockItem(ECBlockRegistry.SANDSTONE_TILES_SLAB.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> SANDSTONE_TILES_WALL_ITEM = ITEMS.register("sandstone_tiles_wall",
        () -> new BlockItem(ECBlockRegistry.SANDSTONE_TILES_WALL.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> SANDSTONE_TILES_PRESSURE_PLATE_ITEM = ITEMS.register("sandstone_tiles_pressure_plate",
        () -> new BlockItem(ECBlockRegistry.SANDSTONE_TILES_PRESSURE_PLATE.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));

    public static final RegistryObject<Item> SANDSTONE_BRICKS_ITEM = ITEMS.register("sandstone_bricks",
        () -> new BlockItem(ECBlockRegistry.SANDSTONE_BRICKS.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> SANDSTONE_BRICKS_STAIRS_ITEM = ITEMS.register("sandstone_bricks_stairs",
        () -> new BlockItem(ECBlockRegistry.SANDSTONE_BRICKS_STAIRS.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> SANDSTONE_BRICKS_SLAB_ITEM = ITEMS.register("sandstone_bricks_slab",
        () -> new BlockItem(ECBlockRegistry.SANDSTONE_BRICKS_SLAB.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> SANDSTONE_BRICKS_WALL_ITEM = ITEMS.register("sandstone_bricks_wall",
        () -> new BlockItem(ECBlockRegistry.SANDSTONE_BRICKS_WALL.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> SANDSTONE_BRICKS_PRESSURE_PLATE_ITEM = ITEMS.register("sandstone_bricks_pressure_plate",
        () -> new BlockItem(ECBlockRegistry.SANDSTONE_BRICKS_PRESSURE_PLATE.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));

    public static final RegistryObject<Item> SANDSTONE_LARGE_BRICKS_ITEM = ITEMS.register("sandstone_large_bricks",
        () -> new BlockItem(ECBlockRegistry.SANDSTONE_LARGE_BRICKS.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> SANDSTONE_LARGE_BRICKS_STAIRS_ITEM = ITEMS.register("sandstone_large_bricks_stairs",
        () -> new BlockItem(ECBlockRegistry.SANDSTONE_LARGE_BRICKS_STAIRS.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> SANDSTONE_LARGE_BRICKS_SLAB_ITEM = ITEMS.register("sandstone_large_bricks_slab",
        () -> new BlockItem(ECBlockRegistry.SANDSTONE_LARGE_BRICKS_SLAB.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> SANDSTONE_LARGE_BRICKS_WALL_ITEM = ITEMS.register("sandstone_large_bricks_wall",
        () -> new BlockItem(ECBlockRegistry.SANDSTONE_LARGE_BRICKS_WALL.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> SANDSTONE_LARGE_BRICKS_PRESSURE_PLATE_ITEM = ITEMS.register("sandstone_large_bricks_pressure_plate",
        () -> new BlockItem(ECBlockRegistry.SANDSTONE_LARGE_BRICKS_PRESSURE_PLATE.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));

    public static final RegistryObject<Item> SANDSTONE_PAVING_STONES_ITEM = ITEMS.register("sandstone_paving_stones",
        () -> new BlockItem(ECBlockRegistry.SANDSTONE_PAVING_STONES.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> SANDSTONE_PAVING_STONES_STAIRS_ITEM = ITEMS.register("sandstone_paving_stones_stairs",
        () -> new BlockItem(ECBlockRegistry.SANDSTONE_PAVING_STONES_STAIRS.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> SANDSTONE_PAVING_STONES_SLAB_ITEM = ITEMS.register("sandstone_paving_stones_slab",
        () -> new BlockItem(ECBlockRegistry.SANDSTONE_PAVING_STONES_SLAB.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> SANDSTONE_PAVING_STONES_WALL_ITEM = ITEMS.register("sandstone_paving_stones_wall",
        () -> new BlockItem(ECBlockRegistry.SANDSTONE_PAVING_STONES_WALL.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> SANDSTONE_PAVING_STONES_PRESSURE_PLATE_ITEM = ITEMS.register("sandstone_paving_stones_pressure_plate",
        () -> new BlockItem(ECBlockRegistry.SANDSTONE_PAVING_STONES_PRESSURE_PLATE.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));

    public static final RegistryObject<Item> SANDSTONE_ROOFTILES_ITEM = ITEMS.register("sandstone_rooftiles",
        () -> new BlockItem(ECBlockRegistry.SANDSTONE_ROOFTILES.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> SANDSTONE_ROOFTILES_STAIRS_ITEM = ITEMS.register("sandstone_rooftiles_stairs",
        () -> new BlockItem(ECBlockRegistry.SANDSTONE_ROOFTILES_STAIRS.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> SANDSTONE_ROOFTILES_SLAB_ITEM = ITEMS.register("sandstone_rooftiles_slab",
        () -> new BlockItem(ECBlockRegistry.SANDSTONE_ROOFTILES_SLAB.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));

    // Red Sandstone
    public static final RegistryObject<Item> RED_SANDSTONE_BUTTON_ITEM = ITEMS.register("red_sandstone_button",
        () -> new BlockItem(ECBlockRegistry.RED_SANDSTONE_BUTTON.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));

    public static final RegistryObject<Item> SMOOTH_RED_SANDSTONE_WALL_ITEM = ITEMS.register("smooth_red_sandstone_wall",
        () -> new BlockItem(ECBlockRegistry.SMOOTH_RED_SANDSTONE_WALL.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> SMOOTH_RED_SANDSTONE_PRESSURE_PLATE_ITEM = ITEMS.register("smooth_red_sandstone_pressure_plate",
        () -> new BlockItem(ECBlockRegistry.SMOOTH_RED_SANDSTONE_PRESSURE_PLATE.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));

    public static final RegistryObject<Item> POLISHED_RED_SANDSTONE_ITEM = ITEMS.register("polished_red_sandstone",
        () -> new BlockItem(ECBlockRegistry.POLISHED_RED_SANDSTONE.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> POLISHED_RED_SANDSTONE_STAIRS_ITEM = ITEMS.register("polished_red_sandstone_stairs",
        () -> new BlockItem(ECBlockRegistry.POLISHED_RED_SANDSTONE_STAIRS.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> POLISHED_RED_SANDSTONE_SLAB_ITEM = ITEMS.register("polished_red_sandstone_slab",
        () -> new BlockItem(ECBlockRegistry.POLISHED_RED_SANDSTONE_SLAB.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> POLISHED_RED_SANDSTONE_WALL_ITEM = ITEMS.register("polished_red_sandstone_wall",
        () -> new BlockItem(ECBlockRegistry.POLISHED_RED_SANDSTONE_WALL.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> POLISHED_RED_SANDSTONE_PRESSURE_PLATE_ITEM = ITEMS.register("polished_red_sandstone_pressure_plate",
        () -> new BlockItem(ECBlockRegistry.POLISHED_RED_SANDSTONE_PRESSURE_PLATE.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));

    public static final RegistryObject<Item> RED_SANDSTONE_PAVING_ITEM = ITEMS.register("red_sandstone_paving",
        () -> new BlockItem(ECBlockRegistry.RED_SANDSTONE_PAVING.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> RED_SANDSTONE_PAVING_STAIRS_ITEM = ITEMS.register("red_sandstone_paving_stairs",
        () -> new BlockItem(ECBlockRegistry.RED_SANDSTONE_PAVING_STAIRS.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> RED_SANDSTONE_PAVING_SLAB_ITEM = ITEMS.register("red_sandstone_paving_slab",
        () -> new BlockItem(ECBlockRegistry.RED_SANDSTONE_PAVING_SLAB.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> RED_SANDSTONE_PAVING_WALL_ITEM = ITEMS.register("red_sandstone_paving_wall",
        () -> new BlockItem(ECBlockRegistry.RED_SANDSTONE_PAVING_WALL.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> RED_SANDSTONE_PAVING_PRESSURE_PLATE_ITEM = ITEMS.register("red_sandstone_paving_pressure_plate",
        () -> new BlockItem(ECBlockRegistry.RED_SANDSTONE_PAVING_PRESSURE_PLATE.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));

    public static final RegistryObject<Item> RED_SANDSTONE_TILES_ITEM = ITEMS.register("red_sandstone_tiles",
        () -> new BlockItem(ECBlockRegistry.RED_SANDSTONE_TILES.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> RED_SANDSTONE_TILES_STAIRS_ITEM = ITEMS.register("red_sandstone_tiles_stairs",
        () -> new BlockItem(ECBlockRegistry.RED_SANDSTONE_TILES_STAIRS.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> RED_SANDSTONE_TILES_SLAB_ITEM = ITEMS.register("red_sandstone_tiles_slab",
        () -> new BlockItem(ECBlockRegistry.RED_SANDSTONE_TILES_SLAB.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> RED_SANDSTONE_TILES_WALL_ITEM = ITEMS.register("red_sandstone_tiles_wall",
        () -> new BlockItem(ECBlockRegistry.RED_SANDSTONE_TILES_WALL.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> RED_SANDSTONE_TILES_PRESSURE_PLATE_ITEM = ITEMS.register("red_sandstone_tiles_pressure_plate",
        () -> new BlockItem(ECBlockRegistry.RED_SANDSTONE_TILES_PRESSURE_PLATE.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));

    public static final RegistryObject<Item> RED_SANDSTONE_BRICKS_ITEM = ITEMS.register("red_sandstone_bricks",
        () -> new BlockItem(ECBlockRegistry.RED_SANDSTONE_BRICKS.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> RED_SANDSTONE_BRICKS_STAIRS_ITEM = ITEMS.register("red_sandstone_bricks_stairs",
        () -> new BlockItem(ECBlockRegistry.RED_SANDSTONE_BRICKS_STAIRS.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> RED_SANDSTONE_BRICKS_SLAB_ITEM = ITEMS.register("red_sandstone_bricks_slab",
        () -> new BlockItem(ECBlockRegistry.RED_SANDSTONE_BRICKS_SLAB.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> RED_SANDSTONE_BRICKS_WALL_ITEM = ITEMS.register("red_sandstone_bricks_wall",
        () -> new BlockItem(ECBlockRegistry.RED_SANDSTONE_BRICKS_WALL.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> RED_SANDSTONE_BRICKS_PRESSURE_PLATE_ITEM = ITEMS.register("red_sandstone_bricks_pressure_plate",
        () -> new BlockItem(ECBlockRegistry.RED_SANDSTONE_BRICKS_PRESSURE_PLATE.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));

    public static final RegistryObject<Item> RED_SANDSTONE_LARGE_BRICKS_ITEM = ITEMS.register("red_sandstone_large_bricks",
        () -> new BlockItem(ECBlockRegistry.RED_SANDSTONE_LARGE_BRICKS.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> RED_SANDSTONE_LARGE_BRICKS_STAIRS_ITEM = ITEMS.register("red_sandstone_large_bricks_stairs",
        () -> new BlockItem(ECBlockRegistry.RED_SANDSTONE_LARGE_BRICKS_STAIRS.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> RED_SANDSTONE_LARGE_BRICKS_SLAB_ITEM = ITEMS.register("red_sandstone_large_bricks_slab",
        () -> new BlockItem(ECBlockRegistry.RED_SANDSTONE_LARGE_BRICKS_SLAB.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> RED_SANDSTONE_LARGE_BRICKS_WALL_ITEM = ITEMS.register("red_sandstone_large_bricks_wall",
        () -> new BlockItem(ECBlockRegistry.RED_SANDSTONE_LARGE_BRICKS_WALL.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> RED_SANDSTONE_LARGE_BRICKS_PRESSURE_PLATE_ITEM = ITEMS.register("red_sandstone_large_bricks_pressure_plate",
        () -> new BlockItem(ECBlockRegistry.RED_SANDSTONE_LARGE_BRICKS_PRESSURE_PLATE.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));

    public static final RegistryObject<Item> RED_SANDSTONE_PAVING_STONES_ITEM = ITEMS.register("red_sandstone_paving_stones",
        () -> new BlockItem(ECBlockRegistry.RED_SANDSTONE_PAVING_STONES.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> RED_SANDSTONE_PAVING_STONES_STAIRS_ITEM = ITEMS.register("red_sandstone_paving_stones_stairs",
        () -> new BlockItem(ECBlockRegistry.RED_SANDSTONE_PAVING_STONES_STAIRS.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> RED_SANDSTONE_PAVING_STONES_SLAB_ITEM = ITEMS.register("red_sandstone_paving_stones_slab",
        () -> new BlockItem(ECBlockRegistry.RED_SANDSTONE_PAVING_STONES_SLAB.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> RED_SANDSTONE_PAVING_STONES_WALL_ITEM = ITEMS.register("red_sandstone_paving_stones_wall",
        () -> new BlockItem(ECBlockRegistry.RED_SANDSTONE_PAVING_STONES_WALL.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> RED_SANDSTONE_PAVING_STONES_PRESSURE_PLATE_ITEM = ITEMS.register("red_sandstone_paving_stones_pressure_plate",
        () -> new BlockItem(ECBlockRegistry.RED_SANDSTONE_PAVING_STONES_PRESSURE_PLATE.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));

    public static final RegistryObject<Item> RED_SANDSTONE_ROOFTILES_ITEM = ITEMS.register("red_sandstone_rooftiles",
        () -> new BlockItem(ECBlockRegistry.RED_SANDSTONE_ROOFTILES.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> RED_SANDSTONE_ROOFTILES_STAIRS_ITEM = ITEMS.register("red_sandstone_rooftiles_stairs",
        () -> new BlockItem(ECBlockRegistry.RED_SANDSTONE_ROOFTILES_STAIRS.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> RED_SANDSTONE_ROOFTILES_SLAB_ITEM = ITEMS.register("red_sandstone_rooftiles_slab",
        () -> new BlockItem(ECBlockRegistry.RED_SANDSTONE_ROOFTILES_SLAB.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));

    // Terracotta
    public static final RegistryObject<Item> TERRACOTTA_STAIRS_ITEM = ITEMS.register("terracotta_stairs",
        () -> new BlockItem(ECBlockRegistry.TERRACOTTA_STAIRS.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> TERRACOTTA_SLAB_ITEM = ITEMS.register("terracotta_slab",
        () -> new BlockItem(ECBlockRegistry.TERRACOTTA_SLAB.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> TERRACOTTA_WALL_ITEM = ITEMS.register("terracotta_wall",
        () -> new BlockItem(ECBlockRegistry.TERRACOTTA_WALL.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> TERRACOTTA_PRESSURE_PLATE_ITEM = ITEMS.register("terracotta_pressure_plate",
        () -> new BlockItem(ECBlockRegistry.TERRACOTTA_PRESSURE_PLATE.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> TERRACOTTA_BUTTON_ITEM = ITEMS.register("terracotta_button",
        () -> new BlockItem(ECBlockRegistry.TERRACOTTA_BUTTON.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));

    public static final RegistryObject<Item> POLISHED_TERRACOTTA_ITEM = ITEMS.register("polished_terracotta",
        () -> new BlockItem(ECBlockRegistry.POLISHED_TERRACOTTA.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> POLISHED_TERRACOTTA_STAIRS_ITEM = ITEMS.register("polished_terracotta_stairs",
        () -> new BlockItem(ECBlockRegistry.POLISHED_TERRACOTTA_STAIRS.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> POLISHED_TERRACOTTA_SLAB_ITEM = ITEMS.register("polished_terracotta_slab",
        () -> new BlockItem(ECBlockRegistry.POLISHED_TERRACOTTA_SLAB.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> POLISHED_TERRACOTTA_WALL_ITEM = ITEMS.register("polished_terracotta_wall",
        () -> new BlockItem(ECBlockRegistry.POLISHED_TERRACOTTA_WALL.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> POLISHED_TERRACOTTA_PRESSURE_PLATE_ITEM = ITEMS.register("polished_terracotta_pressure_plate",
        () -> new BlockItem(ECBlockRegistry.POLISHED_TERRACOTTA_PRESSURE_PLATE.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));

    public static final RegistryObject<Item> TERRACOTTA_PAVING_ITEM = ITEMS.register("terracotta_paving",
        () -> new BlockItem(ECBlockRegistry.TERRACOTTA_PAVING.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> TERRACOTTA_PAVING_STAIRS_ITEM = ITEMS.register("terracotta_paving_stairs",
        () -> new BlockItem(ECBlockRegistry.TERRACOTTA_PAVING_STAIRS.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> TERRACOTTA_PAVING_SLAB_ITEM = ITEMS.register("terracotta_paving_slab",
        () -> new BlockItem(ECBlockRegistry.TERRACOTTA_PAVING_SLAB.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> TERRACOTTA_PAVING_WALL_ITEM = ITEMS.register("terracotta_paving_wall",
        () -> new BlockItem(ECBlockRegistry.TERRACOTTA_PAVING_WALL.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> TERRACOTTA_PAVING_PRESSURE_PLATE_ITEM = ITEMS.register("terracotta_paving_pressure_plate",
        () -> new BlockItem(ECBlockRegistry.TERRACOTTA_PAVING_PRESSURE_PLATE.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));

    public static final RegistryObject<Item> TERRACOTTA_TILES_ITEM = ITEMS.register("terracotta_tiles",
        () -> new BlockItem(ECBlockRegistry.TERRACOTTA_TILES.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> TERRACOTTA_TILES_STAIRS_ITEM = ITEMS.register("terracotta_tiles_stairs",
        () -> new BlockItem(ECBlockRegistry.TERRACOTTA_TILES_STAIRS.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> TERRACOTTA_TILES_SLAB_ITEM = ITEMS.register("terracotta_tiles_slab",
        () -> new BlockItem(ECBlockRegistry.TERRACOTTA_TILES_SLAB.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> TERRACOTTA_TILES_WALL_ITEM = ITEMS.register("terracotta_tiles_wall",
        () -> new BlockItem(ECBlockRegistry.TERRACOTTA_TILES_WALL.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> TERRACOTTA_TILES_PRESSURE_PLATE_ITEM = ITEMS.register("terracotta_tiles_pressure_plate",
        () -> new BlockItem(ECBlockRegistry.TERRACOTTA_TILES_PRESSURE_PLATE.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));

    public static final RegistryObject<Item> TERRACOTTA_BRICKS_ITEM = ITEMS.register("terracotta_bricks",
        () -> new BlockItem(ECBlockRegistry.TERRACOTTA_BRICKS.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> TERRACOTTA_BRICKS_STAIRS_ITEM = ITEMS.register("terracotta_bricks_stairs",
        () -> new BlockItem(ECBlockRegistry.TERRACOTTA_BRICKS_STAIRS.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> TERRACOTTA_BRICKS_SLAB_ITEM = ITEMS.register("terracotta_bricks_slab",
        () -> new BlockItem(ECBlockRegistry.TERRACOTTA_BRICKS_SLAB.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> TERRACOTTA_BRICKS_WALL_ITEM = ITEMS.register("terracotta_bricks_wall",
        () -> new BlockItem(ECBlockRegistry.TERRACOTTA_BRICKS_WALL.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> TERRACOTTA_BRICKS_PRESSURE_PLATE_ITEM = ITEMS.register("terracotta_bricks_pressure_plate",
        () -> new BlockItem(ECBlockRegistry.TERRACOTTA_BRICKS_PRESSURE_PLATE.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));

    public static final RegistryObject<Item> TERRACOTTA_LARGE_BRICKS_ITEM = ITEMS.register("terracotta_large_bricks",
        () -> new BlockItem(ECBlockRegistry.TERRACOTTA_LARGE_BRICKS.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> TERRACOTTA_LARGE_BRICKS_STAIRS_ITEM = ITEMS.register("terracotta_large_bricks_stairs",
        () -> new BlockItem(ECBlockRegistry.TERRACOTTA_LARGE_BRICKS_STAIRS.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> TERRACOTTA_LARGE_BRICKS_SLAB_ITEM = ITEMS.register("terracotta_large_bricks_slab",
        () -> new BlockItem(ECBlockRegistry.TERRACOTTA_LARGE_BRICKS_SLAB.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> TERRACOTTA_LARGE_BRICKS_WALL_ITEM = ITEMS.register("terracotta_large_bricks_wall",
        () -> new BlockItem(ECBlockRegistry.TERRACOTTA_LARGE_BRICKS_WALL.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> TERRACOTTA_LARGE_BRICKS_PRESSURE_PLATE_ITEM = ITEMS.register("terracotta_large_bricks_pressure_plate",
        () -> new BlockItem(ECBlockRegistry.TERRACOTTA_LARGE_BRICKS_PRESSURE_PLATE.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));

    public static final RegistryObject<Item> TERRACOTTA_PAVING_STONES_ITEM = ITEMS.register("terracotta_paving_stones",
        () -> new BlockItem(ECBlockRegistry.TERRACOTTA_PAVING_STONES.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> TERRACOTTA_PAVING_STONES_STAIRS_ITEM = ITEMS.register("terracotta_paving_stones_stairs",
        () -> new BlockItem(ECBlockRegistry.TERRACOTTA_PAVING_STONES_STAIRS.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> TERRACOTTA_PAVING_STONES_SLAB_ITEM = ITEMS.register("terracotta_paving_stones_slab",
        () -> new BlockItem(ECBlockRegistry.TERRACOTTA_PAVING_STONES_SLAB.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> TERRACOTTA_PAVING_STONES_WALL_ITEM = ITEMS.register("terracotta_paving_stones_wall",
        () -> new BlockItem(ECBlockRegistry.TERRACOTTA_PAVING_STONES_WALL.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> TERRACOTTA_PAVING_STONES_PRESSURE_PLATE_ITEM = ITEMS.register("terracotta_paving_stones_pressure_plate",
        () -> new BlockItem(ECBlockRegistry.TERRACOTTA_PAVING_STONES_PRESSURE_PLATE.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));

    public static final RegistryObject<Item> TERRACOTTA_ROOFTILES_ITEM = ITEMS.register("terracotta_rooftiles",
        () -> new BlockItem(ECBlockRegistry.TERRACOTTA_ROOFTILES.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> TERRACOTTA_ROOFTILES_STAIRS_ITEM = ITEMS.register("terracotta_rooftiles_stairs",
        () -> new BlockItem(ECBlockRegistry.TERRACOTTA_ROOFTILES_STAIRS.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> TERRACOTTA_ROOFTILES_SLAB_ITEM = ITEMS.register("terracotta_rooftiles_slab",
        () -> new BlockItem(ECBlockRegistry.TERRACOTTA_ROOFTILES_SLAB.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));

    // Other bricks
    public static final RegistryObject<Item> DARK_BRICKS_ITEM = ITEMS.register("dark_bricks", () -> new BlockItem(ECBlockRegistry.DARK_BRICKS.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> DARK_BRICKS_STAIRS_ITEM = ITEMS.register("dark_bricks_stairs",
        () -> new BlockItem(ECBlockRegistry.DARK_BRICKS_STAIRS.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> DARK_BRICKS_SLAB_ITEM = ITEMS.register("dark_bricks_slab",
        () -> new BlockItem(ECBlockRegistry.DARK_BRICKS_SLAB.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> DARK_BRICKS_WALL_ITEM = ITEMS.register("dark_bricks_wall",
        () -> new BlockItem(ECBlockRegistry.DARK_BRICKS_WALL.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> DARK_BRICKS_PRESSURE_PLATE_ITEM = ITEMS.register("dark_bricks_pressure_plate",
        () -> new BlockItem(ECBlockRegistry.DARK_BRICKS_PRESSURE_PLATE.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));

    public static final RegistryObject<Item> DARK_LARGE_BRICKS_ITEM = ITEMS.register("dark_large_bricks",
        () -> new BlockItem(ECBlockRegistry.DARK_LARGE_BRICKS.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> DARK_LARGE_BRICKS_STAIRS_ITEM = ITEMS.register("dark_large_bricks_stairs",
        () -> new BlockItem(ECBlockRegistry.DARK_LARGE_BRICKS_STAIRS.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> DARK_LARGE_BRICKS_SLAB_ITEM = ITEMS.register("dark_large_bricks_slab",
        () -> new BlockItem(ECBlockRegistry.DARK_LARGE_BRICKS_SLAB.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> DARK_LARGE_BRICKS_WALL_ITEM = ITEMS.register("dark_large_bricks_wall",
        () -> new BlockItem(ECBlockRegistry.DARK_LARGE_BRICKS_WALL.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> DARK_LARGE_BRICKS_PRESSURE_PLATE_ITEM = ITEMS.register("dark_large_bricks_pressure_plate",
        () -> new BlockItem(ECBlockRegistry.DARK_LARGE_BRICKS_PRESSURE_PLATE.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));

    public static final RegistryObject<Item> OLD_BRICKS_ITEM = ITEMS.register("old_bricks", () -> new BlockItem(ECBlockRegistry.OLD_BRICKS.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> OLD_BRICKS_STAIRS_ITEM = ITEMS.register("old_bricks_stairs",
        () -> new BlockItem(ECBlockRegistry.OLD_BRICKS_STAIRS.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> OLD_BRICKS_SLAB_ITEM = ITEMS.register("old_bricks_slab",
        () -> new BlockItem(ECBlockRegistry.OLD_BRICKS_SLAB.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> OLD_BRICKS_WALL_ITEM = ITEMS.register("old_bricks_wall",
        () -> new BlockItem(ECBlockRegistry.OLD_BRICKS_WALL.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> OLD_BRICKS_PRESSURE_PLATE_ITEM = ITEMS.register("old_bricks_pressure_plate",
        () -> new BlockItem(ECBlockRegistry.OLD_BRICKS_PRESSURE_PLATE.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));

    public static final RegistryObject<Item> OLD_LARGE_BRICKS_ITEM = ITEMS.register("old_large_bricks",
        () -> new BlockItem(ECBlockRegistry.OLD_LARGE_BRICKS.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> OLD_LARGE_BRICKS_STAIRS_ITEM = ITEMS.register("old_large_bricks_stairs",
        () -> new BlockItem(ECBlockRegistry.OLD_LARGE_BRICKS_STAIRS.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> OLD_LARGE_BRICKS_SLAB_ITEM = ITEMS.register("old_large_bricks_slab",
        () -> new BlockItem(ECBlockRegistry.OLD_LARGE_BRICKS_SLAB.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> OLD_LARGE_BRICKS_WALL_ITEM = ITEMS.register("old_large_bricks_wall",
        () -> new BlockItem(ECBlockRegistry.OLD_LARGE_BRICKS_WALL.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> OLD_LARGE_BRICKS_PRESSURE_PLATE_ITEM = ITEMS.register("old_large_bricks_pressure_plate",
        () -> new BlockItem(ECBlockRegistry.OLD_LARGE_BRICKS_PRESSURE_PLATE.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));

    public static final RegistryObject<Item> WEARED_BRICKS_ITEM = ITEMS.register("weared_bricks",
        () -> new BlockItem(ECBlockRegistry.WEARED_BRICKS.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> WEARED_BRICKS_STAIRS_ITEM = ITEMS.register("weared_bricks_stairs",
        () -> new BlockItem(ECBlockRegistry.WEARED_BRICKS_STAIRS.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> WEARED_BRICKS_SLAB_ITEM = ITEMS.register("weared_bricks_slab",
        () -> new BlockItem(ECBlockRegistry.WEARED_BRICKS_SLAB.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> WEARED_BRICKS_WALL_ITEM = ITEMS.register("weared_bricks_wall",
        () -> new BlockItem(ECBlockRegistry.WEARED_BRICKS_WALL.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> WEARED_BRICKS_PRESSURE_PLATE_ITEM = ITEMS.register("weared_bricks_pressure_plate",
        () -> new BlockItem(ECBlockRegistry.WEARED_BRICKS_PRESSURE_PLATE.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));

    public static final RegistryObject<Item> WEARED_LARGE_BRICKS_ITEM = ITEMS.register("weared_large_bricks",
        () -> new BlockItem(ECBlockRegistry.WEARED_LARGE_BRICKS.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> WEARED_LARGE_BRICKS_STAIRS_ITEM = ITEMS.register("weared_large_bricks_stairs",
        () -> new BlockItem(ECBlockRegistry.WEARED_LARGE_BRICKS_STAIRS.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> WEARED_LARGE_BRICKS_SLAB_ITEM = ITEMS.register("weared_large_bricks_slab",
        () -> new BlockItem(ECBlockRegistry.WEARED_LARGE_BRICKS_SLAB.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> WEARED_LARGE_BRICKS_WALL_ITEM = ITEMS.register("weared_large_bricks_wall",
        () -> new BlockItem(ECBlockRegistry.WEARED_LARGE_BRICKS_WALL.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> WEARED_LARGE_BRICKS_PRESSURE_PLATE_ITEM = ITEMS.register("weared_large_bricks_pressure_plate",
        () -> new BlockItem(ECBlockRegistry.WEARED_LARGE_BRICKS_PRESSURE_PLATE.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));

    // Pavings
    public static final RegistryObject<Item> CONCRETE_PAVING_ITEM = ITEMS.register("concrete_paving",
        () -> new BlockItem(ECBlockRegistry.CONCRETE_PAVING.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> CONCRETE_PAVING_STAIRS_ITEM = ITEMS.register("concrete_paving_stairs",
        () -> new BlockItem(ECBlockRegistry.CONCRETE_PAVING_STAIRS.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> CONCRETE_PAVING_SLAB_ITEM = ITEMS.register("concrete_paving_slab",
        () -> new BlockItem(ECBlockRegistry.CONCRETE_PAVING_SLAB.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> CONCRETE_PAVING_WALL_ITEM = ITEMS.register("concrete_paving_wall",
        () -> new BlockItem(ECBlockRegistry.CONCRETE_PAVING_WALL.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> CONCRETE_PAVING_PRESSURE_PLATE_ITEM = ITEMS.register("concrete_paving_pressure_plate",
        () -> new BlockItem(ECBlockRegistry.CONCRETE_PAVING_PRESSURE_PLATE.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));

    public static final RegistryObject<Item> DAMAGED_PAVING_ITEM = ITEMS.register("damaged_paving",
        () -> new BlockItem(ECBlockRegistry.DAMAGED_PAVING.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> DAMAGED_PAVING_STAIRS_ITEM = ITEMS.register("damaged_paving_stairs",
        () -> new BlockItem(ECBlockRegistry.DAMAGED_PAVING_STAIRS.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> DAMAGED_PAVING_SLAB_ITEM = ITEMS.register("damaged_paving_slab",
        () -> new BlockItem(ECBlockRegistry.DAMAGED_PAVING_SLAB.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> DAMAGED_PAVING_WALL_ITEM = ITEMS.register("damaged_paving_wall",
        () -> new BlockItem(ECBlockRegistry.DAMAGED_PAVING_WALL.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> DAMAGED_PAVING_PRESSURE_PLATE_ITEM = ITEMS.register("damaged_paving_pressure_plate",
        () -> new BlockItem(ECBlockRegistry.DAMAGED_PAVING_PRESSURE_PLATE.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));

    public static final RegistryObject<Item> DARK_CONCRETE_PAVING_ITEM = ITEMS.register("dark_concrete_paving",
        () -> new BlockItem(ECBlockRegistry.DARK_CONCRETE_PAVING.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> DARK_CONCRETE_PAVING_STAIRS_ITEM = ITEMS.register("dark_concrete_paving_stairs",
        () -> new BlockItem(ECBlockRegistry.DARK_CONCRETE_PAVING_STAIRS.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> DARK_CONCRETE_PAVING_SLAB_ITEM = ITEMS.register("dark_concrete_paving_slab",
        () -> new BlockItem(ECBlockRegistry.DARK_CONCRETE_PAVING_SLAB.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> DARK_CONCRETE_PAVING_WALL_ITEM = ITEMS.register("dark_concrete_paving_wall",
        () -> new BlockItem(ECBlockRegistry.DARK_CONCRETE_PAVING_WALL.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> DARK_CONCRETE_PAVING_PRESSURE_PLATE_ITEM = ITEMS.register("dark_concrete_paving_pressure_plate",
        () -> new BlockItem(ECBlockRegistry.DARK_CONCRETE_PAVING_PRESSURE_PLATE.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));

    public static final RegistryObject<Item> MOIST_PAVING_ITEM = ITEMS.register("moist_paving",
        () -> new BlockItem(ECBlockRegistry.MOIST_PAVING.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> MOIST_PAVING_STAIRS_ITEM = ITEMS.register("moist_paving_stairs",
        () -> new BlockItem(ECBlockRegistry.MOIST_PAVING_STAIRS.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> MOIST_PAVING_SLAB_ITEM = ITEMS.register("moist_paving_slab",
        () -> new BlockItem(ECBlockRegistry.MOIST_PAVING_SLAB.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> MOIST_PAVING_WALL_ITEM = ITEMS.register("moist_paving_wall",
        () -> new BlockItem(ECBlockRegistry.MOIST_PAVING_WALL.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> MOIST_PAVING_PRESSURE_PLATE_ITEM = ITEMS.register("moist_paving_pressure_plate",
        () -> new BlockItem(ECBlockRegistry.MOIST_PAVING_PRESSURE_PLATE.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));

    public static final RegistryObject<Item> POLISHED_PAVING_ITEM = ITEMS.register("polished_paving",
        () -> new BlockItem(ECBlockRegistry.POLISHED_PAVING.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> POLISHED_PAVING_STAIRS_ITEM = ITEMS.register("polished_paving_stairs",
        () -> new BlockItem(ECBlockRegistry.POLISHED_PAVING_STAIRS.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> POLISHED_PAVING_SLAB_ITEM = ITEMS.register("polished_paving_slab",
        () -> new BlockItem(ECBlockRegistry.POLISHED_PAVING_SLAB.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> POLISHED_PAVING_WALL_ITEM = ITEMS.register("polished_paving_wall",
        () -> new BlockItem(ECBlockRegistry.POLISHED_PAVING_WALL.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> POLISHED_PAVING_PRESSURE_PLATE_ITEM = ITEMS.register("polished_paving_pressure_plate",
        () -> new BlockItem(ECBlockRegistry.POLISHED_PAVING_PRESSURE_PLATE.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));

    public static final RegistryObject<Item> WHITE_CONCRETE_PAVING_ITEM = ITEMS.register("white_concrete_paving",
        () -> new BlockItem(ECBlockRegistry.WHITE_CONCRETE_PAVING.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> WHITE_CONCRETE_PAVING_STAIRS_ITEM = ITEMS.register("white_concrete_paving_stairs",
        () -> new BlockItem(ECBlockRegistry.WHITE_CONCRETE_PAVING_STAIRS.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> WHITE_CONCRETE_PAVING_SLAB_ITEM = ITEMS.register("white_concrete_paving_slab",
        () -> new BlockItem(ECBlockRegistry.WHITE_CONCRETE_PAVING_SLAB.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> WHITE_CONCRETE_PAVING_WALL_ITEM = ITEMS.register("white_concrete_paving_wall",
        () -> new BlockItem(ECBlockRegistry.WHITE_CONCRETE_PAVING_WALL.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> WHITE_CONCRETE_PAVING_PRESSURE_PLATE_ITEM = ITEMS.register("white_concrete_paving_pressure_plate",
        () -> new BlockItem(ECBlockRegistry.WHITE_CONCRETE_PAVING_PRESSURE_PLATE.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));

    // Tiles
    public static final RegistryObject<Item> CONCRETE_TILES_ITEM = ITEMS.register("concrete_tiles",
        () -> new BlockItem(ECBlockRegistry.CONCRETE_TILES.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> CONCRETE_TILES_STAIRS_ITEM = ITEMS.register("concrete_tiles_stairs",
        () -> new BlockItem(ECBlockRegistry.CONCRETE_TILES_STAIRS.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> CONCRETE_TILES_SLAB_ITEM = ITEMS.register("concrete_tiles_slab",
        () -> new BlockItem(ECBlockRegistry.CONCRETE_TILES_SLAB.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> CONCRETE_TILES_WALL_ITEM = ITEMS.register("concrete_tiles_wall",
        () -> new BlockItem(ECBlockRegistry.CONCRETE_TILES_WALL.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> CONCRETE_TILES_PRESSURE_PLATE_ITEM = ITEMS.register("concrete_tiles_pressure_plate",
        () -> new BlockItem(ECBlockRegistry.CONCRETE_TILES_PRESSURE_PLATE.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));

    public static final RegistryObject<Item> SKYBLUE_TILES_ITEM = ITEMS.register("skyblue_tiles",
        () -> new BlockItem(ECBlockRegistry.SKYBLUE_TILES.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> SKYBLUE_TILES_STAIRS_ITEM = ITEMS.register("skyblue_tiles_stairs",
        () -> new BlockItem(ECBlockRegistry.SKYBLUE_TILES_STAIRS.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> SKYBLUE_TILES_SLAB_ITEM = ITEMS.register("skyblue_tiles_slab",
        () -> new BlockItem(ECBlockRegistry.SKYBLUE_TILES_SLAB.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> SKYBLUE_TILES_WALL_ITEM = ITEMS.register("skyblue_tiles_wall",
        () -> new BlockItem(ECBlockRegistry.SKYBLUE_TILES_WALL.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> SKYBLUE_TILES_PRESSURE_PLATE_ITEM = ITEMS.register("skyblue_tiles_pressure_plate",
        () -> new BlockItem(ECBlockRegistry.SKYBLUE_TILES_PRESSURE_PLATE.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));

    public static final RegistryObject<Item> ORANGE_TILES_ITEM = ITEMS.register("orange_tiles",
        () -> new BlockItem(ECBlockRegistry.ORANGE_TILES.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> ORANGE_TILES_STAIRS_ITEM = ITEMS.register("orange_tiles_stairs",
        () -> new BlockItem(ECBlockRegistry.ORANGE_TILES_STAIRS.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> ORANGE_TILES_SLAB_ITEM = ITEMS.register("orange_tiles_slab",
        () -> new BlockItem(ECBlockRegistry.ORANGE_TILES_SLAB.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> ORANGE_TILES_WALL_ITEM = ITEMS.register("orange_tiles_wall",
        () -> new BlockItem(ECBlockRegistry.ORANGE_TILES_WALL.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> ORANGE_TILES_PRESSURE_PLATE_ITEM = ITEMS.register("orange_tiles_pressure_plate",
        () -> new BlockItem(ECBlockRegistry.ORANGE_TILES_PRESSURE_PLATE.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));

    public static final RegistryObject<Item> BLUE_TILES_ITEM = ITEMS.register("blue_tiles", () -> new BlockItem(ECBlockRegistry.BLUE_TILES.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> BLUE_TILES_STAIRS_ITEM = ITEMS.register("blue_tiles_stairs",
        () -> new BlockItem(ECBlockRegistry.BLUE_TILES_STAIRS.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> BLUE_TILES_SLAB_ITEM = ITEMS.register("blue_tiles_slab",
        () -> new BlockItem(ECBlockRegistry.BLUE_TILES_SLAB.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> BLUE_TILES_WALL_ITEM = ITEMS.register("blue_tiles_wall",
        () -> new BlockItem(ECBlockRegistry.BLUE_TILES_WALL.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> BLUE_TILES_PRESSURE_PLATE_ITEM = ITEMS.register("blue_tiles_pressure_plate",
        () -> new BlockItem(ECBlockRegistry.BLUE_TILES_PRESSURE_PLATE.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));

    public static final RegistryObject<Item> LIGHT_BLUE_TILES_ITEM = ITEMS.register("light_blue_tiles",
        () -> new BlockItem(ECBlockRegistry.LIGHT_BLUE_TILES.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> LIGHT_BLUE_TILES_STAIRS_ITEM = ITEMS.register("light_blue_tiles_stairs",
        () -> new BlockItem(ECBlockRegistry.LIGHT_BLUE_TILES_STAIRS.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> LIGHT_BLUE_TILES_SLAB_ITEM = ITEMS.register("light_blue_tiles_slab",
        () -> new BlockItem(ECBlockRegistry.LIGHT_BLUE_TILES_SLAB.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> LIGHT_BLUE_TILES_WALL_ITEM = ITEMS.register("light_blue_tiles_wall",
        () -> new BlockItem(ECBlockRegistry.LIGHT_BLUE_TILES_WALL.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> LIGHT_BLUE_TILES_PRESSURE_PLATE_ITEM = ITEMS.register("light_blue_tiles_pressure_plate",
        () -> new BlockItem(ECBlockRegistry.LIGHT_BLUE_TILES_PRESSURE_PLATE.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));

    public static final RegistryObject<Item> RED_TILES_ITEM = ITEMS.register("red_tiles", () -> new BlockItem(ECBlockRegistry.RED_TILES.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> RED_TILES_STAIRS_ITEM = ITEMS.register("red_tiles_stairs",
        () -> new BlockItem(ECBlockRegistry.RED_TILES_STAIRS.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> RED_TILES_SLAB_ITEM = ITEMS.register("red_tiles_slab",
        () -> new BlockItem(ECBlockRegistry.RED_TILES_SLAB.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> RED_TILES_WALL_ITEM = ITEMS.register("red_tiles_wall",
        () -> new BlockItem(ECBlockRegistry.RED_TILES_WALL.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> RED_TILES_PRESSURE_PLATE_ITEM = ITEMS.register("red_tiles_pressure_plate",
        () -> new BlockItem(ECBlockRegistry.RED_TILES_PRESSURE_PLATE.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));

    public static final RegistryObject<Item> WHITE_TILES_ITEM = ITEMS.register("white_tiles", () -> new BlockItem(ECBlockRegistry.WHITE_TILES.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> WHITE_TILES_STAIRS_ITEM = ITEMS.register("white_tiles_stairs",
        () -> new BlockItem(ECBlockRegistry.WHITE_TILES_STAIRS.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> WHITE_TILES_SLAB_ITEM = ITEMS.register("white_tiles_slab",
        () -> new BlockItem(ECBlockRegistry.WHITE_TILES_SLAB.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> WHITE_TILES_WALL_ITEM = ITEMS.register("white_tiles_wall",
        () -> new BlockItem(ECBlockRegistry.WHITE_TILES_WALL.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> WHITE_TILES_PRESSURE_PLATE_ITEM = ITEMS.register("white_tiles_pressure_plate",
        () -> new BlockItem(ECBlockRegistry.WHITE_TILES_PRESSURE_PLATE.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));

    public static final RegistryObject<Item> YELLOW_TILES_ITEM = ITEMS.register("yellow_tiles",
        () -> new BlockItem(ECBlockRegistry.YELLOW_TILES.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> YELLOW_TILES_STAIRS_ITEM = ITEMS.register("yellow_tiles_stairs",
        () -> new BlockItem(ECBlockRegistry.YELLOW_TILES_STAIRS.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> YELLOW_TILES_SLAB_ITEM = ITEMS.register("yellow_tiles_slab",
        () -> new BlockItem(ECBlockRegistry.YELLOW_TILES_SLAB.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> YELLOW_TILES_WALL_ITEM = ITEMS.register("yellow_tiles_wall",
        () -> new BlockItem(ECBlockRegistry.YELLOW_TILES_WALL.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> YELLOW_TILES_PRESSURE_PLATE_ITEM = ITEMS.register("yellow_tiles_pressure_plate",
        () -> new BlockItem(ECBlockRegistry.YELLOW_TILES_PRESSURE_PLATE.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));

    public static final RegistryObject<Item> YELLOW_GREY_TILES_ITEM = ITEMS.register("yellow_grey_tiles",
        () -> new BlockItem(ECBlockRegistry.YELLOW_GREY_TILES.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> YELLOW_GREY_TILES_STAIRS_ITEM = ITEMS.register("yellow_grey_tiles_stairs",
        () -> new BlockItem(ECBlockRegistry.YELLOW_GREY_TILES_STAIRS.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> YELLOW_GREY_TILES_SLAB_ITEM = ITEMS.register("yellow_grey_tiles_slab",
        () -> new BlockItem(ECBlockRegistry.YELLOW_GREY_TILES_SLAB.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> YELLOW_GREY_TILES_WALL_ITEM = ITEMS.register("yellow_grey_tiles_wall",
        () -> new BlockItem(ECBlockRegistry.YELLOW_GREY_TILES_WALL.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> YELLOW_GREY_TILES_PRESSURE_PLATE_ITEM = ITEMS.register("yellow_grey_tiles_pressure_plate",
        () -> new BlockItem(ECBlockRegistry.YELLOW_GREY_TILES_PRESSURE_PLATE.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));

    // Corrugated metal plates
    public static final Map<DyeColor, RegistryObject<BlockItem>> CORRUGATED_METAL_PLATE_ITEMS = Arrays.stream(DyeColor.values()).map(type -> Pair.of(type,
        ITEMS.register(type.getString() + "_corrugated_metal_plate",
            () -> new BlockItem(ECBlockRegistry.CORRUGATED_METAL_PLATE_BLOCKS.get(type).get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT))))).collect(
                Collectors.toMap(Pair::getKey, Pair::getValue));
    public static final Map<DyeColor, RegistryObject<BlockItem>> CORRUGATED_METAL_PLATE_STAIRS_ITEMS = Arrays.stream(DyeColor.values()).map(type -> Pair.of(type,
        ITEMS.register(type.getString() + "_corrugated_metal_plate_stairs",
            () -> new BlockItem(ECBlockRegistry.CORRUGATED_METAL_PLATE_STAIRS.get(type).get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT))))).collect(
                Collectors.toMap(Pair::getKey, Pair::getValue));
    public static final Map<DyeColor, RegistryObject<BlockItem>> CORRUGATED_METAL_PLATE_SLABS_ITEMS = Arrays.stream(DyeColor.values()).map(type -> Pair.of(type,
        ITEMS.register(type.getString() + "_corrugated_metal_plate_slab",
            () -> new BlockItem(ECBlockRegistry.CORRUGATED_METAL_PLATE_SLABS.get(type).get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT))))).collect(
                Collectors.toMap(Pair::getKey, Pair::getValue));
    public static final Map<DyeColor, RegistryObject<BlockItem>> CORRUGATED_METAL_PLATE_WALLS_ITEMS = Arrays.stream(DyeColor.values()).map(type -> Pair.of(type,
        ITEMS.register(type.getString() + "_corrugated_metal_plate_wall",
            () -> new BlockItem(ECBlockRegistry.CORRUGATED_METAL_PLATE_WALLS.get(type).get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT))))).collect(
                Collectors.toMap(Pair::getKey, Pair::getValue));
    public static final Map<DyeColor, RegistryObject<BlockItem>> CORRUGATED_METAL_PLATE_PRESSURE_PLATES_ITEMS = Arrays.stream(DyeColor.values()).map(type -> Pair.of(type,
        ITEMS.register(type.getString() + "_corrugated_metal_plate_pressure_plate",
            () -> new BlockItem(ECBlockRegistry.CORRUGATED_METAL_PLATE_PRESSURE_PLATES.get(type).get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT))))).collect(
                Collectors.toMap(Pair::getKey, Pair::getValue));
    public static final Map<DyeColor, RegistryObject<BlockItem>> CORRUGATED_METAL_PLATE_FENCE_ITEMS = Arrays.stream(DyeColor.values()).map(type -> Pair.of(type,
        ITEMS.register(type.getString() + "_corrugated_metal_plate_fence",
            () -> new BlockItem(ECBlockRegistry.CORRUGATED_METAL_PLATE_FENCES.get(type).get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT))))).collect(
                Collectors.toMap(Pair::getKey, Pair::getValue));
    public static final Map<DyeColor, RegistryObject<BlockItem>> CORRUGATED_METAL_PLATE_FENCE_GATE_ITEMS = Arrays.stream(DyeColor.values()).map(type -> Pair.of(type,
        ITEMS.register(type.getString() + "_corrugated_metal_plate_fence_gate",
            () -> new BlockItem(ECBlockRegistry.CORRUGATED_METAL_PLATE_FENCE_GATES.get(type).get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT))))).collect(
                Collectors.toMap(Pair::getKey, Pair::getValue));

    // Metal blocks
    public static final RegistryObject<Item> DARK_METAL_FLOOR_ITEM = ITEMS.register("dark_metal_floor",
        () -> new BlockItem(ECBlockRegistry.DARK_METAL_FLOOR.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> DARK_METAL_FLOOR_STAIRS_ITEM = ITEMS.register("dark_metal_floor_stairs",
        () -> new BlockItem(ECBlockRegistry.DARK_METAL_FLOOR_STAIRS.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> DARK_METAL_FLOOR_SLAB_ITEM = ITEMS.register("dark_metal_floor_slab",
        () -> new BlockItem(ECBlockRegistry.DARK_METAL_FLOOR_SLAB.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> DARK_METAL_FLOOR_WALL_ITEM = ITEMS.register("dark_metal_floor_wall",
        () -> new BlockItem(ECBlockRegistry.DARK_METAL_FLOOR_WALL.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> DARK_METAL_FLOOR_PRESSURE_PLATE_ITEM = ITEMS.register("dark_metal_floor_pressure_plate",
        () -> new BlockItem(ECBlockRegistry.DARK_METAL_FLOOR_PRESSURE_PLATE.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));

    public static final RegistryObject<Item> LIGHT_METAL_FLOOR_ITEM = ITEMS.register("light_metal_floor",
        () -> new BlockItem(ECBlockRegistry.LIGHT_METAL_FLOOR.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> LIGHT_METAL_FLOOR_STAIRS_ITEM = ITEMS.register("light_metal_floor_stairs",
        () -> new BlockItem(ECBlockRegistry.LIGHT_METAL_FLOOR_STAIRS.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> LIGHT_METAL_FLOOR_SLAB_ITEM = ITEMS.register("light_metal_floor_slab",
        () -> new BlockItem(ECBlockRegistry.LIGHT_METAL_FLOOR_SLAB.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> LIGHT_METAL_FLOOR_WALL_ITEM = ITEMS.register("light_metal_floor_wall",
        () -> new BlockItem(ECBlockRegistry.LIGHT_METAL_FLOOR_WALL.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> LIGHT_METAL_FLOOR_PRESSURE_PLATE_ITEM = ITEMS.register("light_metal_floor_pressure_plate",
        () -> new BlockItem(ECBlockRegistry.LIGHT_METAL_FLOOR_PRESSURE_PLATE.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));

    public static final RegistryObject<Item> RUSTY_PLATE_ITEM = ITEMS.register("rusty_plate", () -> new BlockItem(ECBlockRegistry.RUSTY_PLATE.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> RUSTY_PLATE_STAIRS_ITEM = ITEMS.register("rusty_plate_stairs",
        () -> new BlockItem(ECBlockRegistry.RUSTY_PLATE_STAIRS.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> RUSTY_PLATE_SLAB_ITEM = ITEMS.register("rusty_plate_slab",
        () -> new BlockItem(ECBlockRegistry.RUSTY_PLATE_SLAB.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> RUSTY_PLATE_WALL_ITEM = ITEMS.register("rusty_plate_wall",
        () -> new BlockItem(ECBlockRegistry.RUSTY_PLATE_WALL.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> RUSTY_PLATE_PRESSURE_PLATE_ITEM = ITEMS.register("rusty_plate_pressure_plate",
        () -> new BlockItem(ECBlockRegistry.RUSTY_PLATE_PRESSURE_PLATE.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));

    public static final RegistryObject<Item> IRON_BEAM_ITEM = ITEMS.register("iron_beam", () -> new BlockItem(ECBlockRegistry.IRON_BEAM.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> BOLTED_IRON_BEAM_ITEM = ITEMS.register("bolted_iron_beam",
        () -> new BlockItem(ECBlockRegistry.BOLTED_IRON_BEAM.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> IRON_BEAM_JUNCTION_ITEM = ITEMS.register("iron_beam_junction",
        () -> new BlockItem(ECBlockRegistry.IRON_BEAM_JUNCTION.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> STEEL_BEAM_ITEM = ITEMS.register("steel_beam", () -> new BlockItem(ECBlockRegistry.STEEL_BEAM.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> BOLTED_STEEL_BEAM_ITEM = ITEMS.register("bolted_steel_beam",
        () -> new BlockItem(ECBlockRegistry.BOLTED_STEEL_BEAM.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> STEEL_BEAM_JUNCTION_ITEM = ITEMS.register("steel_beam_junction",
        () -> new BlockItem(ECBlockRegistry.STEEL_BEAM_JUNCTION.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));

    public static final RegistryObject<Item> AIR_DUCT_ITEM = ITEMS.register("air_duct", () -> new BlockItem(ECBlockRegistry.AIR_DUCT.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> VENT_AIR_DUCT_ITEM = ITEMS.register("vent_air_duct",
        () -> new BlockItem(ECBlockRegistry.VENT_AIR_DUCT.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> GRID_AIR_DUCT_ITEM = ITEMS.register("grid_air_duct",
        () -> new BlockItem(ECBlockRegistry.GRID_AIR_DUCT.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));

    public static final RegistryObject<Item> BULKHEAD_ITEM = ITEMS.register("bulkhead", () -> new BlockItem(ECBlockRegistry.BULKHEAD.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> BULKHEAD_TOP_ITEM = ITEMS.register("bulkhead_top",
        () -> new BlockItem(ECBlockRegistry.BULKHEAD_TOP.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));

    public static final RegistryObject<Item> STEEL_WALL_LADDER_ITEM = ITEMS.register("steel_wall_ladder",
        () -> new BlockItem(ECBlockRegistry.STEEL_WALL_LADDER.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> RUSTY_WALL_LADDER_ITEM = ITEMS.register("rusty_wall_ladder",
        () -> new BlockItem(ECBlockRegistry.RUSTY_WALL_LADDER.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> STEEL_RUNGS_ITEM = ITEMS.register("steel_rungs", () -> new BlockItem(ECBlockRegistry.STEEL_RUNGS.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> RUSTY_RUNGS_ITEM = ITEMS.register("rusty_rungs", () -> new BlockItem(ECBlockRegistry.RUSTY_RUNGS.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));

    // Wallpaper
    public static final RegistryObject<Item> WHITE_BLUE_WALLPAPER_ITEM = ITEMS.register("white_blue_wallpaper",
        () -> new BlockItem(ECBlockRegistry.WHITE_BLUE_WALLPAPER.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> WHITE_BLUE_WALLPAPER_STAIRS_ITEM = ITEMS.register("white_blue_wallpaper_stairs",
        () -> new BlockItem(ECBlockRegistry.WHITE_BLUE_WALLPAPER_STAIRS.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> WHITE_BLUE_WALLPAPER_SLAB_ITEM = ITEMS.register("white_blue_wallpaper_slab",
        () -> new BlockItem(ECBlockRegistry.WHITE_BLUE_WALLPAPER_SLAB.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> WHITE_BLUE_WALLPAPER_PLINTH_ITEM = ITEMS.register("white_blue_wallpaper_plinth",
        () -> new BlockItem(ECBlockRegistry.WHITE_BLUE_WALLPAPER_PLINTH.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));

    public static final RegistryObject<Item> BEIGE_FLOWER_WALLPAPER_ITEM = ITEMS.register("beige_flower_wallpaper",
        () -> new BlockItem(ECBlockRegistry.BEIGE_FLOWER_WALLPAPER.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> BEIGE_FLOWER_WALLPAPER_STAIRS_ITEM = ITEMS.register("beige_flower_wallpaper_stairs",
        () -> new BlockItem(ECBlockRegistry.BEIGE_FLOWER_WALLPAPER_STAIRS.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> BEIGE_FLOWER_WALLPAPER_SLAB_ITEM = ITEMS.register("beige_flower_wallpaper_slab",
        () -> new BlockItem(ECBlockRegistry.BEIGE_FLOWER_WALLPAPER_SLAB.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> BEIGE_FLOWER_WALLPAPER_PLINTH_ITEM = ITEMS.register("beige_flower_wallpaper_plinth",
        () -> new BlockItem(ECBlockRegistry.BEIGE_FLOWER_WALLPAPER_PLINTH.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));

    public static final RegistryObject<Item> BEIGE_WALLPAPER_ITEM = ITEMS.register("beige_wallpaper",
        () -> new BlockItem(ECBlockRegistry.BEIGE_WALLPAPER.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> BEIGE_WALLPAPER_STAIRS_ITEM = ITEMS.register("beige_wallpaper_stairs",
        () -> new BlockItem(ECBlockRegistry.BEIGE_WALLPAPER_STAIRS.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> BEIGE_WALLPAPER_SLAB_ITEM = ITEMS.register("beige_wallpaper_slab",
        () -> new BlockItem(ECBlockRegistry.BEIGE_WALLPAPER_SLAB.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> BEIGE_WALLPAPER_PLINTH_ITEM = ITEMS.register("beige_wallpaper_plinth",
        () -> new BlockItem(ECBlockRegistry.BEIGE_WALLPAPER_PLINTH.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));

    public static final RegistryObject<Item> PINK_WALLPAPER_ITEM = ITEMS.register("pink_wallpaper",
        () -> new BlockItem(ECBlockRegistry.PINK_WALLPAPER.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> PINK_WALLPAPER_STAIRS_ITEM = ITEMS.register("pink_wallpaper_stairs",
        () -> new BlockItem(ECBlockRegistry.PINK_WALLPAPER_STAIRS.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> PINK_WALLPAPER_SLAB_ITEM = ITEMS.register("pink_wallpaper_slab",
        () -> new BlockItem(ECBlockRegistry.PINK_WALLPAPER_SLAB.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> PINK_WALLPAPER_PLINTH_ITEM = ITEMS.register("pink_wallpaper_plinth",
        () -> new BlockItem(ECBlockRegistry.PINK_WALLPAPER_PLINTH.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));

    public static final RegistryObject<Item> WHITE_GREEN_WALLPAPER_ITEM = ITEMS.register("white_green_wallpaper",
        () -> new BlockItem(ECBlockRegistry.WHITE_GREEN_WALLPAPER.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> WHITE_GREEN_WALLPAPER_STAIRS_ITEM = ITEMS.register("white_green_wallpaper_stairs",
        () -> new BlockItem(ECBlockRegistry.WHITE_GREEN_WALLPAPER_STAIRS.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> WHITE_GREEN_WALLPAPER_SLAB_ITEM = ITEMS.register("white_green_wallpaper_slab",
        () -> new BlockItem(ECBlockRegistry.WHITE_GREEN_WALLPAPER_SLAB.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> WHITE_GREEN_WALLPAPER_PLINTH_ITEM = ITEMS.register("white_green_wallpaper_plinth",
        () -> new BlockItem(ECBlockRegistry.WHITE_GREEN_WALLPAPER_PLINTH.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));

    // Furniture
    public static final Map<McWoods, RegistryObject<FuelBlockItem>> CHAIRS_ITEMS = Arrays.stream(McWoods.values()).map(type -> Pair.of(type,
        ITEMS.register(type.getString() + "_chair",
            () -> new FuelBlockItem(ECBlockRegistry.CHAIR_BLOCKS.get(type).get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), ECConstants.chairBurnTime)))).collect(
                Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<McWoods, RegistryObject<FuelBlockItem>> TERRACE_CHAIRS_ITEMS = Arrays.stream(McWoods.values()).map(type -> Pair.of(type,
        ITEMS.register(type.getString() + "_terrace_chair",
            () -> new FuelBlockItem(ECBlockRegistry.TERRACE_CHAIR_BLOCKS.get(type).get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), ECConstants.chairBurnTime)))).collect(
                Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<McWoods, RegistryObject<FuelBlockItem>> TABLE_ITEMS = Arrays.stream(McWoods.values()).map(type -> Pair.of(type,
        ITEMS.register(type.getString() + "_table",
            () -> new FuelBlockItem(ECBlockRegistry.TABLE_BLOCKS.get(type).get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), ECConstants.chairBurnTime)))).collect(
                Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<McWoods, RegistryObject<FuelBlockItem>> FANCY_TABLE_ITEMS = Arrays.stream(McWoods.values()).map(type -> Pair.of(type,
        ITEMS.register(type.getString() + "_fancy_table",
            () -> new FuelBlockItem(ECBlockRegistry.FANCY_TABLE_BLOCKS.get(type).get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), ECConstants.couchBurnTime)))).collect(
                Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<McWoods, RegistryObject<FuelBlockItem>> TERRACE_TABLE_ITEMS = Arrays.stream(McWoods.values()).map(type -> Pair.of(type,
        ITEMS.register(type.getString() + "_terrace_table",
            () -> new FuelBlockItem(ECBlockRegistry.TERRACE_TABLE_BLOCKS.get(type).get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), ECConstants.chairBurnTime)))).collect(
                Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final RegistryObject<Item> STEEL_TERRACE_TABLE_ITEM = ITEMS.register("steel_terrace_table",
        () -> new BlockItem(ECBlockRegistry.STEEL_TERRACE_TABLE.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));

    public static final RegistryObject<Item> STEEL_TERRACE_CHAIR_ITEM = ITEMS.register("steel_terrace_chair",
        () -> new BlockItem(ECBlockRegistry.STEEL_TERRACE_CHAIR.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));

    public static final Map<DyeColor, RegistryObject<FuelBlockItem>> COUCH_ITEMS = Arrays.stream(DyeColor.values()).map(type -> Pair.of(type,
        ITEMS.register(type.getString() + "_couch",
            () -> new FuelBlockItem(ECBlockRegistry.COUCH_BLOCKS.get(type).get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), ECConstants.couchBurnTime)))).collect(
                Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<DyeColor, RegistryObject<BlockItem>> TABLE_LAMP_ITEMS = Arrays.stream(DyeColor.values()).map(type -> Pair.of(type,
        ITEMS.register(type.getString() + "_table_lamp", () -> new BlockItem(ECBlockRegistry.TABLE_LAMP_BLOCKS.get(type).get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT))))).collect(
            Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final RegistryObject<Item> PLATE_ITEM = ITEMS.register("plate", () -> new BlockItem(ECBlockRegistry.PLATE.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));

    // Stairs
    public static final Map<McWoods, RegistryObject<FuelBlockItem>> SUSPENDED_STAIRS_ITEMS = Arrays.stream(McWoods.values()).map(type -> Pair.of(type,
        ITEMS.register(type.getString() + "_suspended_stairs",
            () -> new FuelBlockItem(ECBlockRegistry.SUSPENDED_STAIRS_BLOCKS.get(type).get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), ECConstants.suspendedStairBurnTime)))).collect(
                Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final RegistryObject<Item> STEEL_SUSPENDED_STAIRS_ITEM = ITEMS.register("steel_suspended_stairs",
        () -> new BlockItem(ECBlockRegistry.STEEL_SUSPENDED_STAIRS.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> RUSTY_SUSPENDED_STAIRS_ITEM = ITEMS.register("rusty_suspended_stairs",
        () -> new BlockItem(ECBlockRegistry.RUSTY_SUSPENDED_STAIRS.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));

    // Doors
    public static final Map<McWoods, RegistryObject<FuelBlockItem>> FANCY_DOOR_ITEMS = Arrays.stream(McWoods.values()).map(type -> Pair.of(type,
        ITEMS.register(type.getString() + "_fancy_door",
            () -> new FuelBlockItem(ECBlockRegistry.FANCY_DOOR_BLOCKS.get(type).get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), ECConstants.doorBurnTime)))).collect(
                Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<McWoods, RegistryObject<FuelBlockItem>> PLAIN_DOOR_ITEMS = Arrays.stream(McWoods.values()).map(type -> Pair.of(type,
        ITEMS.register(type.getString() + "_plain_door",
            () -> new FuelBlockItem(ECBlockRegistry.PLAIN_DOOR_BLOCKS.get(type).get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), ECConstants.doorBurnTime)))).collect(
                Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final RegistryObject<Item> STEEL_DOOR_ITEM = ITEMS.register("steel_door", () -> new BlockItem(ECBlockRegistry.STEEL_DOOR.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> STURDY_STEEL_DOOR_ITEM = ITEMS.register("sturdy_steel_door",
        () -> new BlockItem(ECBlockRegistry.STURDY_STEEL_DOOR.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> WARNING_STEEL_DOOR_ITEM = ITEMS.register("warning_steel_door",
        () -> new BlockItem(ECBlockRegistry.WARNING_STEEL_DOOR.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> WHITE_STEEL_DOOR_ITEM = ITEMS.register("white_steel_door",
        () -> new BlockItem(ECBlockRegistry.WHITE_STEEL_DOOR.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> STURDY_WHITE_STEEL_DOOR_ITEM = ITEMS.register("sturdy_white_steel_door",
        () -> new BlockItem(ECBlockRegistry.STURDY_WHITE_STEEL_DOOR.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> WARNING_WHITE_STEEL_DOOR_ITEM = ITEMS.register("warning_white_steel_door",
        () -> new BlockItem(ECBlockRegistry.WARNING_WHITE_STEEL_DOOR.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> RUSTY_DOOR_ITEM = ITEMS.register("rusty_door", () -> new BlockItem(ECBlockRegistry.RUSTY_DOOR.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> STURDY_RUSTY_DOOR_ITEM = ITEMS.register("sturdy_rusty_door",
        () -> new BlockItem(ECBlockRegistry.STURDY_RUSTY_DOOR.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> WARNING_RUSTY_DOOR_ITEM = ITEMS.register("warning_rusty_door",
        () -> new BlockItem(ECBlockRegistry.WARNING_RUSTY_DOOR.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));

    // Pillows
    public static final Map<DyeColor, RegistryObject<FuelBlockItem>> PILLOW_ITEMS = Arrays.stream(DyeColor.values()).map(type -> Pair.of(type,
        ITEMS.register(type.getString() + "_pillow",
            () -> new FuelBlockItem(ECBlockRegistry.PILLOW_BLOCKS.get(type).get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), ECConstants.doorBurnTime)))).collect(
                Collectors.toMap(Pair::getKey, Pair::getValue));

    // Crates
    public static final Map<McWoods, RegistryObject<BlockItem>> WOODEN_CRATE_ITEMS = Arrays.stream(McWoods.values()).map(type -> Pair.of(type,
        ITEMS.register(type.getString() + "_wooden_crate",
            () -> new BlockItem(ECBlockRegistry.WOODEN_CRATE_BLOCKS.get(type).get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT).maxStackSize(1))))).collect(
                Collectors.toMap(Pair::getKey, Pair::getValue));

    // Chests
    public static final Map<McWoods, RegistryObject<FuelBlockItem>> FANCY_CHEST_ITEMS = Arrays.stream(McWoods.values()).map(type -> Pair.of(type,
        ITEMS.register(type.getString() + "_fancy_chest",
            () -> new FuelBlockItem(ECBlockRegistry.FANCY_CHEST_BLOCKS.get(type).get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), ECConstants.chestBurnTime)))).collect(
                Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final RegistryObject<Item> LOCKER_ITEM = ITEMS.register("locker", () -> new BlockItem(ECBlockRegistry.LOCKER.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));

    // Beds
    public static final Map<DyeColor, RegistryObject<FuelBlockItem>> OAK_FANCY_BED_ITEMS = Arrays.stream(DyeColor.values()).map(type -> Pair.of(type,
        ITEMS.register(type.getString() + "_oak_fancy_bed",
            () -> new FuelBlockItem(ECBlockRegistry.OAK_FANCY_BED_BLOCKS.get(type).get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), ECConstants.bedBurnTime)))).collect(
                Collectors.toMap(Pair::getKey, Pair::getValue));
    public static final Map<DyeColor, RegistryObject<FuelBlockItem>> BIRCH_FANCY_BED_ITEMS = Arrays.stream(DyeColor.values()).map(type -> Pair.of(type,
        ITEMS.register(type.getString() + "_birch_fancy_bed",
            () -> new FuelBlockItem(ECBlockRegistry.BIRCH_FANCY_BED_BLOCKS.get(type).get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), ECConstants.bedBurnTime)))).collect(
                Collectors.toMap(Pair::getKey, Pair::getValue));
    public static final Map<DyeColor, RegistryObject<FuelBlockItem>> SPRUCE_FANCY_BED_ITEMS = Arrays.stream(DyeColor.values()).map(type -> Pair.of(type,
        ITEMS.register(type.getString() + "_spruce_fancy_bed",
            () -> new FuelBlockItem(ECBlockRegistry.SPRUCE_FANCY_BED_BLOCKS.get(type).get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), ECConstants.bedBurnTime)))).collect(
                Collectors.toMap(Pair::getKey, Pair::getValue));
    public static final Map<DyeColor, RegistryObject<FuelBlockItem>> JUNGLE_FANCY_BED_ITEMS = Arrays.stream(DyeColor.values()).map(type -> Pair.of(type,
        ITEMS.register(type.getString() + "_jungle_fancy_bed",
            () -> new FuelBlockItem(ECBlockRegistry.JUNGLE_FANCY_BED_BLOCKS.get(type).get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), ECConstants.bedBurnTime)))).collect(
                Collectors.toMap(Pair::getKey, Pair::getValue));
    public static final Map<DyeColor, RegistryObject<FuelBlockItem>> DARK_OAK_FANCY_BED_ITEMS = Arrays.stream(DyeColor.values()).map(type -> Pair.of(type,
        ITEMS.register(type.getString() + "_dark_oak_fancy_bed",
            () -> new FuelBlockItem(ECBlockRegistry.DARK_OAK_FANCY_BED_BLOCKS.get(type).get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), ECConstants.bedBurnTime)))).collect(
                Collectors.toMap(Pair::getKey, Pair::getValue));
    public static final Map<DyeColor, RegistryObject<FuelBlockItem>> ACACIA_FANCY_BED_ITEMS = Arrays.stream(DyeColor.values()).map(type -> Pair.of(type,
        ITEMS.register(type.getString() + "_acacia_fancy_bed",
            () -> new FuelBlockItem(ECBlockRegistry.ACACIA_FANCY_BED_BLOCKS.get(type).get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), ECConstants.bedBurnTime)))).collect(
                Collectors.toMap(Pair::getKey, Pair::getValue));
    public static final Map<DyeColor, RegistryObject<FuelBlockItem>> WARPED_FANCY_BED_ITEMS = Arrays.stream(DyeColor.values()).map(type -> Pair.of(type,
        ITEMS.register(type.getString() + "_warped_fancy_bed",
            () -> new FuelBlockItem(ECBlockRegistry.WARPED_FANCY_BED_BLOCKS.get(type).get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), ECConstants.bedBurnTime)))).collect(
                Collectors.toMap(Pair::getKey, Pair::getValue));
    public static final Map<DyeColor, RegistryObject<FuelBlockItem>> CRIMSON_FANCY_BED_ITEMS = Arrays.stream(DyeColor.values()).map(type -> Pair.of(type,
        ITEMS.register(type.getString() + "_crimson_fancy_bed",
            () -> new FuelBlockItem(ECBlockRegistry.CRIMSON_FANCY_BED_BLOCKS.get(type).get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), ECConstants.bedBurnTime)))).collect(
                Collectors.toMap(Pair::getKey, Pair::getValue));

    public static void init()
    {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}