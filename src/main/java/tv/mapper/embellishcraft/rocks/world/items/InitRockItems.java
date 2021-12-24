package tv.mapper.embellishcraft.rocks.world.items;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

import org.apache.commons.lang3.tuple.Pair;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import tv.mapper.embellishcraft.ECConstants;
import tv.mapper.embellishcraft.item.ModItemGroups;
import tv.mapper.embellishcraft.rocks.world.level.blocks.InitRockBlocks;
import tv.mapper.embellishcraft.util.RockType;

public class InitRockItems
{
    private static final DeferredRegister<Item> ROCK_ITEM_REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, ECConstants.MODID);

    // Rocks
    public static final Map<RockType, RegistryObject<BlockItem>> ROCKS_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_ITEM_REGISTRY.register(type.getName(), () -> new BlockItem(InitRockBlocks.ROCK_BLOCKS.get(type).get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT_ROCKS))))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<BlockItem>> ROCK_STAIRS_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_ITEM_REGISTRY.register(type.getName() + "_stairs", () -> new BlockItem(InitRockBlocks.ROCK_STAIRS.get(type).get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT_ROCKS))))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<BlockItem>> ROCK_SLABS_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_ITEM_REGISTRY.register(type.getName() + "_slab", () -> new BlockItem(InitRockBlocks.ROCK_SLABS.get(type).get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT_ROCKS))))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<BlockItem>> ROCK_WALLS_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_ITEM_REGISTRY.register(type.getName() + "_wall", () -> new BlockItem(InitRockBlocks.ROCK_WALLS.get(type).get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT_ROCKS))))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<BlockItem>> ROCK_PRESSURE_PLATES_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_ITEM_REGISTRY.register(type.getName() + "_pressure_plate", () -> new BlockItem(InitRockBlocks.ROCK_PRESSURE_PLATES.get(type).get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT_ROCKS))))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<BlockItem>> ROCK_BUTTONS_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_ITEM_REGISTRY.register(type.getName() + "_button", () -> new BlockItem(InitRockBlocks.ROCK_BUTTONS.get(type).get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT_ROCKS))))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    // Cobblestones
    public static final Map<RockType, RegistryObject<BlockItem>> ROCKS_COBBLESTONES_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_ITEM_REGISTRY.register(type.getName() + "_cobblestone", () -> new BlockItem(InitRockBlocks.ROCK_COBBLESTONES.get(type).get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT_ROCKS))))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<BlockItem>> ROCK_COBBLESTONE_STAIRS_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_ITEM_REGISTRY.register(type.getName() + "_cobblestone_stairs", () -> new BlockItem(InitRockBlocks.ROCK_COBBLESTONE_STAIRS.get(type).get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT_ROCKS))))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<BlockItem>> ROCK_COBBLESTONE_SLABS_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_ITEM_REGISTRY.register(type.getName() + "_cobblestone_slab", () -> new BlockItem(InitRockBlocks.ROCK_COBBLESTONE_SLABS.get(type).get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT_ROCKS))))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<BlockItem>> ROCK_COBBLESTONE_WALLS_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_ITEM_REGISTRY.register(type.getName() + "_cobblestone_wall", () -> new BlockItem(InitRockBlocks.ROCK_COBBLESTONE_WALLS.get(type).get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT_ROCKS))))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<BlockItem>> ROCK_COBBLESTONE_PRESSURE_PLATES_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_ITEM_REGISTRY.register(type.getName() + "_cobblestone_pressure_plate", () -> new BlockItem(InitRockBlocks.ROCK_COBBLESTONE_PRESSURE_PLATES.get(type).get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT_ROCKS))))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    // Cobblestones bricks
    public static final Map<RockType, RegistryObject<BlockItem>> ROCKS_COBBLESTONE_BRICKS_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_ITEM_REGISTRY.register(type.getName() + "_cobblestone_bricks", () -> new BlockItem(InitRockBlocks.ROCK_COBBLESTONE_BRICKS.get(type).get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT_ROCKS))))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<BlockItem>> ROCK_COBBLESTONE_BRICKS_STAIRS_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_ITEM_REGISTRY.register(type.getName() + "_cobblestone_bricks_stairs", () -> new BlockItem(InitRockBlocks.ROCK_COBBLESTONE_BRICKS_STAIRS.get(type).get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT_ROCKS))))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<BlockItem>> ROCK_COBBLESTONE_BRICKS_SLABS_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_ITEM_REGISTRY.register(type.getName() + "_cobblestone_bricks_slab", () -> new BlockItem(InitRockBlocks.ROCK_COBBLESTONE_BRICKS_SLABS.get(type).get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT_ROCKS))))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<BlockItem>> ROCK_COBBLESTONE_BRICKS_WALLS_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_ITEM_REGISTRY.register(type.getName() + "_cobblestone_bricks_wall", () -> new BlockItem(InitRockBlocks.ROCK_COBBLESTONE_BRICKS_WALLS.get(type).get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT_ROCKS))))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<BlockItem>> ROCK_COBBLESTONE_BRICKS_PRESSURE_PLATES_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_ITEM_REGISTRY.register(type.getName() + "_cobblestone_bricks_pressure_plate", () -> new BlockItem(InitRockBlocks.ROCK_COBBLESTONE_BRICKS_PRESSURE_PLATES.get(type).get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT_ROCKS))))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    // Smooth rocks
    public static final Map<RockType, RegistryObject<BlockItem>> SMOOTH_ROCK_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_ITEM_REGISTRY.register("smooth_" + type.getName(), () -> new BlockItem(InitRockBlocks.SMOOTH_ROCK_BLOCKS.get(type).get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT_ROCKS))))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<BlockItem>> SMOOTH_ROCK_STAIRS_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_ITEM_REGISTRY.register("smooth_" + type.getName() + "_stairs", () -> new BlockItem(InitRockBlocks.SMOOTH_ROCK_STAIRS.get(type).get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT_ROCKS))))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<BlockItem>> SMOOTH_ROCK_SLABS_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_ITEM_REGISTRY.register("smooth_" + type.getName() + "_slab", () -> new BlockItem(InitRockBlocks.SMOOTH_ROCK_SLABS.get(type).get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT_ROCKS))))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<BlockItem>> SMOOTH_ROCK_WALLS_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_ITEM_REGISTRY.register("smooth_" + type.getName() + "_wall", () -> new BlockItem(InitRockBlocks.SMOOTH_ROCK_WALLS.get(type).get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT_ROCKS))))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<BlockItem>> SMOOTH_ROCK_PRESSURE_PLATES_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_ITEM_REGISTRY.register("smooth_" + type.getName() + "_pressure_plate", () -> new BlockItem(InitRockBlocks.SMOOTH_ROCK_PRESSURE_PLATES.get(type).get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT_ROCKS))))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    // Polished rocks
    public static final Map<RockType, RegistryObject<BlockItem>> POLISHED_ROCK_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_ITEM_REGISTRY.register("polished_" + type.getName(), () -> new BlockItem(InitRockBlocks.POLISHED_ROCK_BLOCKS.get(type).get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT_ROCKS))))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<BlockItem>> POLISHED_ROCK_STAIRS_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_ITEM_REGISTRY.register("polished_" + type.getName() + "_stairs", () -> new BlockItem(InitRockBlocks.POLISHED_ROCK_STAIRS.get(type).get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT_ROCKS))))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<BlockItem>> POLISHED_ROCK_SLABS_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_ITEM_REGISTRY.register("polished_" + type.getName() + "_slab", () -> new BlockItem(InitRockBlocks.POLISHED_ROCK_SLABS.get(type).get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT_ROCKS))))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<BlockItem>> POLISHED_ROCK_WALLS_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_ITEM_REGISTRY.register("polished_" + type.getName() + "_wall", () -> new BlockItem(InitRockBlocks.POLISHED_ROCK_WALLS.get(type).get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT_ROCKS))))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<BlockItem>> POLISHED_ROCK_PRESSURE_PLATES_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_ITEM_REGISTRY.register("polished_" + type.getName() + "_pressure_plate", () -> new BlockItem(InitRockBlocks.POLISHED_ROCK_PRESSURE_PLATES.get(type).get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT_ROCKS))))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    // Rock pavings
    public static final Map<RockType, RegistryObject<BlockItem>> ROCKS_PAVINGS_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_ITEM_REGISTRY.register(type.getName() + "_paving", () -> new BlockItem(InitRockBlocks.ROCK_PAVINGS.get(type).get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT_ROCKS))))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<BlockItem>> ROCK_PAVING_STAIRS_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_ITEM_REGISTRY.register(type.getName() + "_paving_stairs", () -> new BlockItem(InitRockBlocks.ROCK_PAVING_STAIRS.get(type).get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT_ROCKS))))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<BlockItem>> ROCK_PAVING_SLABS_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_ITEM_REGISTRY.register(type.getName() + "_paving_slab", () -> new BlockItem(InitRockBlocks.ROCK_PAVING_SLABS.get(type).get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT_ROCKS))))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<BlockItem>> ROCK_PAVING_WALLS_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_ITEM_REGISTRY.register(type.getName() + "_paving_wall", () -> new BlockItem(InitRockBlocks.ROCK_PAVING_WALLS.get(type).get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT_ROCKS))))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<BlockItem>> ROCK_PAVING_PRESSURE_PLATES_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_ITEM_REGISTRY.register(type.getName() + "_paving_pressure_plate", () -> new BlockItem(InitRockBlocks.ROCK_PAVING_PRESSURE_PLATES.get(type).get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT_ROCKS))))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    // Rock tiles
    public static final Map<RockType, RegistryObject<BlockItem>> ROCKS_TILES_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_ITEM_REGISTRY.register(type.getName() + "_tiles", () -> new BlockItem(InitRockBlocks.ROCK_TILES.get(type).get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT_ROCKS))))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<BlockItem>> ROCK_TILES_STAIRS_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_ITEM_REGISTRY.register(type.getName() + "_tiles_stairs", () -> new BlockItem(InitRockBlocks.ROCK_TILES_STAIRS.get(type).get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT_ROCKS))))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<BlockItem>> ROCK_TILES_SLABS_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_ITEM_REGISTRY.register(type.getName() + "_tiles_slab", () -> new BlockItem(InitRockBlocks.ROCK_TILES_SLABS.get(type).get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT_ROCKS))))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<BlockItem>> ROCK_TILES_WALLS_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_ITEM_REGISTRY.register(type.getName() + "_tiles_wall", () -> new BlockItem(InitRockBlocks.ROCK_TILES_WALLS.get(type).get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT_ROCKS))))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<BlockItem>> ROCK_TILES_PRESSURE_PLATES_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_ITEM_REGISTRY.register(type.getName() + "_tiles_pressure_plate", () -> new BlockItem(InitRockBlocks.ROCK_TILES_PRESSURE_PLATES.get(type).get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT_ROCKS))))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    // Rock bricks
    public static final Map<RockType, RegistryObject<BlockItem>> ROCKS_BRICKS_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_ITEM_REGISTRY.register(type.getName() + "_bricks", () -> new BlockItem(InitRockBlocks.ROCK_BRICKS.get(type).get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT_ROCKS))))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<BlockItem>> ROCK_BRICKS_STAIRS_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_ITEM_REGISTRY.register(type.getName() + "_bricks_stairs", () -> new BlockItem(InitRockBlocks.ROCK_BRICKS_STAIRS.get(type).get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT_ROCKS))))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<BlockItem>> ROCK_BRICKS_SLABS_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_ITEM_REGISTRY.register(type.getName() + "_bricks_slab", () -> new BlockItem(InitRockBlocks.ROCK_BRICKS_SLABS.get(type).get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT_ROCKS))))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<BlockItem>> ROCK_BRICKS_WALLS_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_ITEM_REGISTRY.register(type.getName() + "_bricks_wall", () -> new BlockItem(InitRockBlocks.ROCK_BRICKS_WALLS.get(type).get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT_ROCKS))))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<BlockItem>> ROCK_BRICKS_PRESSURE_PLATES_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_ITEM_REGISTRY.register(type.getName() + "_bricks_pressure_plate", () -> new BlockItem(InitRockBlocks.ROCK_BRICKS_PRESSURE_PLATES.get(type).get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT_ROCKS))))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    // Rock large bricks
    public static final Map<RockType, RegistryObject<BlockItem>> ROCKS_LARGE_BRICKS_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_ITEM_REGISTRY.register(type.getName() + "_large_bricks", () -> new BlockItem(InitRockBlocks.ROCK_LARGE_BRICKS.get(type).get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT_ROCKS))))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<BlockItem>> ROCK_LARGE_BRICKS_STAIRS_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_ITEM_REGISTRY.register(type.getName() + "_large_bricks_stairs", () -> new BlockItem(InitRockBlocks.ROCK_LARGE_BRICKS_STAIRS.get(type).get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT_ROCKS))))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<BlockItem>> ROCK_LARGE_BRICKS_SLABS_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_ITEM_REGISTRY.register(type.getName() + "_large_bricks_slab", () -> new BlockItem(InitRockBlocks.ROCK_LARGE_BRICKS_SLABS.get(type).get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT_ROCKS))))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<BlockItem>> ROCK_LARGE_BRICKS_WALLS_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_ITEM_REGISTRY.register(type.getName() + "_large_bricks_wall", () -> new BlockItem(InitRockBlocks.ROCK_LARGE_BRICKS_WALLS.get(type).get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT_ROCKS))))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<BlockItem>> ROCK_LARGE_BRICKS_PRESSURE_PLATES_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_ITEM_REGISTRY.register(type.getName() + "_large_bricks_pressure_plate", () -> new BlockItem(InitRockBlocks.ROCK_LARGE_BRICKS_PRESSURE_PLATES.get(type).get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT_ROCKS))))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    // Rock paving stones
    public static final Map<RockType, RegistryObject<BlockItem>> ROCKS_PAVING_STONES_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_ITEM_REGISTRY.register(type.getName() + "_paving_stones", () -> new BlockItem(InitRockBlocks.ROCK_PAVING_STONES.get(type).get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT_ROCKS))))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<BlockItem>> ROCK_PAVING_STONES_STAIRS_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_ITEM_REGISTRY.register(type.getName() + "_paving_stones_stairs", () -> new BlockItem(InitRockBlocks.ROCK_PAVING_STONES_STAIRS.get(type).get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT_ROCKS))))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<BlockItem>> ROCK_PAVING_STONES_SLABS_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_ITEM_REGISTRY.register(type.getName() + "_paving_stones_slab", () -> new BlockItem(InitRockBlocks.ROCK_PAVING_STONES_SLABS.get(type).get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT_ROCKS))))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<BlockItem>> ROCK_PAVING_STONES_WALLS_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_ITEM_REGISTRY.register(type.getName() + "_paving_stones_wall", () -> new BlockItem(InitRockBlocks.ROCK_PAVING_STONES_WALLS.get(type).get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT_ROCKS))))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<BlockItem>> ROCK_PAVING_STONES_PRESSURE_PLATES_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_ITEM_REGISTRY.register(type.getName() + "_paving_stones_pressure_plate", () -> new BlockItem(InitRockBlocks.ROCK_PAVING_STONES_PRESSURE_PLATES.get(type).get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT_ROCKS))))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    // Rock ornaments
    public static final Map<RockType, RegistryObject<BlockItem>> ROCKS_ORNAMENTS_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_ITEM_REGISTRY.register(type.getName() + "_ornament", () -> new BlockItem(InitRockBlocks.ROCK_ORNAMENTS.get(type).get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT_ROCKS))))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<BlockItem>> ROCK_ORNAMENT_PRESSURE_PLATES_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_ITEM_REGISTRY.register(type.getName() + "_ornament_pressure_plate", () -> new BlockItem(InitRockBlocks.ROCK_ORNAMENT_PRESSURE_PLATES.get(type).get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT_ROCKS))))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    // Rock rooftiles
    public static final Map<RockType, RegistryObject<BlockItem>> ROCKS_ROOFTILES_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_ITEM_REGISTRY.register(type.getName() + "_rooftiles", () -> new BlockItem(InitRockBlocks.ROCK_ROOFTILES.get(type).get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT_ROCKS))))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<BlockItem>> ROCK_ROOFTILES_STAIRS_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_ITEM_REGISTRY.register(type.getName() + "_rooftiles_stairs", () -> new BlockItem(InitRockBlocks.ROCK_ROOFTILES_STAIRS.get(type).get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT_ROCKS))))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<BlockItem>> ROCK_ROOFTILES_SLABS_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_ITEM_REGISTRY.register(type.getName() + "_rooftiles_slab", () -> new BlockItem(InitRockBlocks.ROCK_ROOFTILES_SLABS.get(type).get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT_ROCKS))))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    // Paving stones
    public static final RegistryObject<Item> PAVING_STONES_ITEM = ROCK_ITEM_REGISTRY.register("paving_stones", () -> new BlockItem(InitRockBlocks.PAVING_STONES.get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT_ROCKS)));
    public static final RegistryObject<Item> PAVING_STONES_STAIRS_ITEM = ROCK_ITEM_REGISTRY.register("paving_stones_stairs", () -> new BlockItem(InitRockBlocks.PAVING_STONES_STAIRS.get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT_ROCKS)));
    public static final RegistryObject<Item> PAVING_STONES_SLAB_ITEM = ROCK_ITEM_REGISTRY.register("paving_stones_slab", () -> new BlockItem(InitRockBlocks.PAVING_STONES_SLAB.get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT_ROCKS)));
    public static final RegistryObject<Item> PAVING_STONES_WALL_ITEM = ROCK_ITEM_REGISTRY.register("paving_stones_wall", () -> new BlockItem(InitRockBlocks.PAVING_STONES_WALL.get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT_ROCKS)));
    public static final RegistryObject<Item> PAVING_STONES_PRESSURE_PLATE_ITEM = ROCK_ITEM_REGISTRY.register("paving_stones_pressure_plate", () -> new BlockItem(InitRockBlocks.PAVING_STONES_PRESSURE_PLATE.get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT_ROCKS)));

    public static void init()
    {
        ROCK_ITEM_REGISTRY.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}