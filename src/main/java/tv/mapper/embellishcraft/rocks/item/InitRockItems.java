package tv.mapper.embellishcraft.rocks.item;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

import org.apache.commons.lang3.tuple.Pair;

import net.minecraft.world.item.BlockItem;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import tv.mapper.embellishcraft.core.ECConstants;
import tv.mapper.embellishcraft.core.util.RockType;
import tv.mapper.embellishcraft.rocks.block.InitRockBlocks;

public class InitRockItems
{
    public static final DeferredRegister.Items ROCK_ITEM_REGISTRY = DeferredRegister.createItems(ECConstants.MODID);

    // Rocks
    public static final Map<RockType, DeferredItem<BlockItem>> ROCKS_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_ITEM_REGISTRY.registerSimpleBlockItem(type.getName(), InitRockBlocks.ROCK_BLOCKS.get(type)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, DeferredItem<BlockItem>> ROCK_STAIRS_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_ITEM_REGISTRY.registerSimpleBlockItem(type.getName() + "_stairs", InitRockBlocks.ROCK_STAIRS.get(type)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, DeferredItem<BlockItem>> ROCK_SLABS_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_ITEM_REGISTRY.registerSimpleBlockItem(type.getName() + "_slab", InitRockBlocks.ROCK_SLABS.get(type)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, DeferredItem<BlockItem>> ROCK_WALLS_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_ITEM_REGISTRY.registerSimpleBlockItem(type.getName() + "_wall", InitRockBlocks.ROCK_WALLS.get(type)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, DeferredItem<BlockItem>> ROCK_PRESSURE_PLATES_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_ITEM_REGISTRY.registerSimpleBlockItem(type.getName() + "_pressure_plate", InitRockBlocks.ROCK_PRESSURE_PLATES.get(type)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, DeferredItem<BlockItem>> ROCK_BUTTONS_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_ITEM_REGISTRY.registerSimpleBlockItem(type.getName() + "_button", InitRockBlocks.ROCK_BUTTONS.get(type)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    // Cobblestones
    public static final Map<RockType, DeferredItem<BlockItem>> ROCKS_COBBLESTONES_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_ITEM_REGISTRY.registerSimpleBlockItem(type.getName() + "_cobblestone", InitRockBlocks.ROCK_COBBLESTONES.get(type)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, DeferredItem<BlockItem>> ROCK_COBBLESTONE_STAIRS_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_ITEM_REGISTRY.registerSimpleBlockItem(type.getName() + "_cobblestone_stairs", InitRockBlocks.ROCK_COBBLESTONE_STAIRS.get(type)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, DeferredItem<BlockItem>> ROCK_COBBLESTONE_SLABS_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_ITEM_REGISTRY.registerSimpleBlockItem(type.getName() + "_cobblestone_slab", InitRockBlocks.ROCK_COBBLESTONE_SLABS.get(type)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, DeferredItem<BlockItem>> ROCK_COBBLESTONE_WALLS_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_ITEM_REGISTRY.registerSimpleBlockItem(type.getName() + "_cobblestone_wall", InitRockBlocks.ROCK_COBBLESTONE_WALLS.get(type)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, DeferredItem<BlockItem>> ROCK_COBBLESTONE_PRESSURE_PLATES_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_ITEM_REGISTRY.registerSimpleBlockItem(type.getName() + "_cobblestone_pressure_plate", InitRockBlocks.ROCK_COBBLESTONE_PRESSURE_PLATES.get(type)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    // Cobblestones bricks
    public static final Map<RockType, DeferredItem<BlockItem>> ROCKS_COBBLESTONE_BRICKS_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_ITEM_REGISTRY.registerSimpleBlockItem(type.getName() + "_cobblestone_bricks", InitRockBlocks.ROCK_COBBLESTONE_BRICKS.get(type)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, DeferredItem<BlockItem>> ROCK_COBBLESTONE_BRICKS_STAIRS_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_ITEM_REGISTRY.registerSimpleBlockItem(type.getName() + "_cobblestone_bricks_stairs", InitRockBlocks.ROCK_COBBLESTONE_BRICKS_STAIRS.get(type)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, DeferredItem<BlockItem>> ROCK_COBBLESTONE_BRICKS_SLABS_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_ITEM_REGISTRY.registerSimpleBlockItem(type.getName() + "_cobblestone_bricks_slab", InitRockBlocks.ROCK_COBBLESTONE_BRICKS_SLABS.get(type)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, DeferredItem<BlockItem>> ROCK_COBBLESTONE_BRICKS_WALLS_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_ITEM_REGISTRY.registerSimpleBlockItem(type.getName() + "_cobblestone_bricks_wall", InitRockBlocks.ROCK_COBBLESTONE_BRICKS_WALLS.get(type)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, DeferredItem<BlockItem>> ROCK_COBBLESTONE_BRICKS_PRESSURE_PLATES_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_ITEM_REGISTRY.registerSimpleBlockItem(type.getName() + "_cobblestone_bricks_pressure_plate", InitRockBlocks.ROCK_COBBLESTONE_BRICKS_PRESSURE_PLATES.get(type)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    // Smooth rocks
    public static final Map<RockType, DeferredItem<BlockItem>> SMOOTH_ROCK_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_ITEM_REGISTRY.registerSimpleBlockItem("smooth_" + type.getName(), InitRockBlocks.SMOOTH_ROCK_BLOCKS.get(type)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, DeferredItem<BlockItem>> SMOOTH_ROCK_STAIRS_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_ITEM_REGISTRY.registerSimpleBlockItem("smooth_" + type.getName() + "_stairs", InitRockBlocks.SMOOTH_ROCK_STAIRS.get(type)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, DeferredItem<BlockItem>> SMOOTH_ROCK_SLABS_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_ITEM_REGISTRY.registerSimpleBlockItem("smooth_" + type.getName() + "_slab", InitRockBlocks.SMOOTH_ROCK_SLABS.get(type)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, DeferredItem<BlockItem>> SMOOTH_ROCK_WALLS_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_ITEM_REGISTRY.registerSimpleBlockItem("smooth_" + type.getName() + "_wall", InitRockBlocks.SMOOTH_ROCK_WALLS.get(type)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, DeferredItem<BlockItem>> SMOOTH_ROCK_PRESSURE_PLATES_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_ITEM_REGISTRY.registerSimpleBlockItem("smooth_" + type.getName() + "_pressure_plate", InitRockBlocks.SMOOTH_ROCK_PRESSURE_PLATES.get(type)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    // Polished rocks
    public static final Map<RockType, DeferredItem<BlockItem>> POLISHED_ROCK_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_ITEM_REGISTRY.registerSimpleBlockItem("polished_" + type.getName(), InitRockBlocks.POLISHED_ROCK_BLOCKS.get(type)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, DeferredItem<BlockItem>> POLISHED_ROCK_STAIRS_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_ITEM_REGISTRY.registerSimpleBlockItem("polished_" + type.getName() + "_stairs", InitRockBlocks.POLISHED_ROCK_STAIRS.get(type)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, DeferredItem<BlockItem>> POLISHED_ROCK_SLABS_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_ITEM_REGISTRY.registerSimpleBlockItem("polished_" + type.getName() + "_slab", InitRockBlocks.POLISHED_ROCK_SLABS.get(type)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, DeferredItem<BlockItem>> POLISHED_ROCK_WALLS_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_ITEM_REGISTRY.registerSimpleBlockItem("polished_" + type.getName() + "_wall", InitRockBlocks.POLISHED_ROCK_WALLS.get(type)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, DeferredItem<BlockItem>> POLISHED_ROCK_PRESSURE_PLATES_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_ITEM_REGISTRY.registerSimpleBlockItem("polished_" + type.getName() + "_pressure_plate", InitRockBlocks.POLISHED_ROCK_PRESSURE_PLATES.get(type)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    // Rock pavings
    public static final Map<RockType, DeferredItem<BlockItem>> ROCKS_PAVINGS_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_ITEM_REGISTRY.registerSimpleBlockItem(type.getName() + "_paving", InitRockBlocks.ROCK_PAVINGS.get(type)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, DeferredItem<BlockItem>> ROCK_PAVING_STAIRS_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_ITEM_REGISTRY.registerSimpleBlockItem(type.getName() + "_paving_stairs", InitRockBlocks.ROCK_PAVING_STAIRS.get(type)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, DeferredItem<BlockItem>> ROCK_PAVING_SLABS_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_ITEM_REGISTRY.registerSimpleBlockItem(type.getName() + "_paving_slab", InitRockBlocks.ROCK_PAVING_SLABS.get(type)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, DeferredItem<BlockItem>> ROCK_PAVING_WALLS_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_ITEM_REGISTRY.registerSimpleBlockItem(type.getName() + "_paving_wall", InitRockBlocks.ROCK_PAVING_WALLS.get(type)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, DeferredItem<BlockItem>> ROCK_PAVING_PRESSURE_PLATES_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_ITEM_REGISTRY.registerSimpleBlockItem(type.getName() + "_paving_pressure_plate", InitRockBlocks.ROCK_PAVING_PRESSURE_PLATES.get(type)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    // Rock tiles
    public static final Map<RockType, DeferredItem<BlockItem>> ROCKS_TILES_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_ITEM_REGISTRY.registerSimpleBlockItem(type.getName() + "_tiles", InitRockBlocks.ROCK_TILES.get(type)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, DeferredItem<BlockItem>> ROCK_TILES_STAIRS_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_ITEM_REGISTRY.registerSimpleBlockItem(type.getName() + "_tiles_stairs", InitRockBlocks.ROCK_TILES_STAIRS.get(type)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, DeferredItem<BlockItem>> ROCK_TILES_SLABS_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_ITEM_REGISTRY.registerSimpleBlockItem(type.getName() + "_tiles_slab", InitRockBlocks.ROCK_TILES_SLABS.get(type)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, DeferredItem<BlockItem>> ROCK_TILES_WALLS_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_ITEM_REGISTRY.registerSimpleBlockItem(type.getName() + "_tiles_wall", InitRockBlocks.ROCK_TILES_WALLS.get(type)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, DeferredItem<BlockItem>> ROCK_TILES_PRESSURE_PLATES_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_ITEM_REGISTRY.registerSimpleBlockItem(type.getName() + "_tiles_pressure_plate", InitRockBlocks.ROCK_TILES_PRESSURE_PLATES.get(type)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    // Rock bricks
    public static final Map<RockType, DeferredItem<BlockItem>> ROCKS_BRICKS_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_ITEM_REGISTRY.registerSimpleBlockItem(type.getName() + "_bricks", InitRockBlocks.ROCK_BRICKS.get(type)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, DeferredItem<BlockItem>> ROCK_BRICKS_STAIRS_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_ITEM_REGISTRY.registerSimpleBlockItem(type.getName() + "_bricks_stairs", InitRockBlocks.ROCK_BRICKS_STAIRS.get(type)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, DeferredItem<BlockItem>> ROCK_BRICKS_SLABS_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_ITEM_REGISTRY.registerSimpleBlockItem(type.getName() + "_bricks_slab", InitRockBlocks.ROCK_BRICKS_SLABS.get(type)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, DeferredItem<BlockItem>> ROCK_BRICKS_WALLS_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_ITEM_REGISTRY.registerSimpleBlockItem(type.getName() + "_bricks_wall", InitRockBlocks.ROCK_BRICKS_WALLS.get(type)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, DeferredItem<BlockItem>> ROCK_BRICKS_PRESSURE_PLATES_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_ITEM_REGISTRY.registerSimpleBlockItem(type.getName() + "_bricks_pressure_plate", InitRockBlocks.ROCK_BRICKS_PRESSURE_PLATES.get(type)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    // Rock large bricks
    public static final Map<RockType, DeferredItem<BlockItem>> ROCKS_LARGE_BRICKS_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_ITEM_REGISTRY.registerSimpleBlockItem(type.getName() + "_large_bricks", InitRockBlocks.ROCK_LARGE_BRICKS.get(type)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, DeferredItem<BlockItem>> ROCK_LARGE_BRICKS_STAIRS_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_ITEM_REGISTRY.registerSimpleBlockItem(type.getName() + "_large_bricks_stairs", InitRockBlocks.ROCK_LARGE_BRICKS_STAIRS.get(type)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, DeferredItem<BlockItem>> ROCK_LARGE_BRICKS_SLABS_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_ITEM_REGISTRY.registerSimpleBlockItem(type.getName() + "_large_bricks_slab", InitRockBlocks.ROCK_LARGE_BRICKS_SLABS.get(type)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, DeferredItem<BlockItem>> ROCK_LARGE_BRICKS_WALLS_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_ITEM_REGISTRY.registerSimpleBlockItem(type.getName() + "_large_bricks_wall", InitRockBlocks.ROCK_LARGE_BRICKS_WALLS.get(type)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, DeferredItem<BlockItem>> ROCK_LARGE_BRICKS_PRESSURE_PLATES_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_ITEM_REGISTRY.registerSimpleBlockItem(type.getName() + "_large_bricks_pressure_plate", InitRockBlocks.ROCK_LARGE_BRICKS_PRESSURE_PLATES.get(type)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    // Rock paving stones
    public static final Map<RockType, DeferredItem<BlockItem>> ROCKS_PAVING_STONES_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_ITEM_REGISTRY.registerSimpleBlockItem(type.getName() + "_paving_stones", InitRockBlocks.ROCK_PAVING_STONES.get(type)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, DeferredItem<BlockItem>> ROCK_PAVING_STONES_STAIRS_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_ITEM_REGISTRY.registerSimpleBlockItem(type.getName() + "_paving_stones_stairs", InitRockBlocks.ROCK_PAVING_STONES_STAIRS.get(type)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, DeferredItem<BlockItem>> ROCK_PAVING_STONES_SLABS_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_ITEM_REGISTRY.registerSimpleBlockItem(type.getName() + "_paving_stones_slab", InitRockBlocks.ROCK_PAVING_STONES_SLABS.get(type)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, DeferredItem<BlockItem>> ROCK_PAVING_STONES_WALLS_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_ITEM_REGISTRY.registerSimpleBlockItem(type.getName() + "_paving_stones_wall", InitRockBlocks.ROCK_PAVING_STONES_WALLS.get(type)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, DeferredItem<BlockItem>> ROCK_PAVING_STONES_PRESSURE_PLATES_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_ITEM_REGISTRY.registerSimpleBlockItem(type.getName() + "_paving_stones_pressure_plate", InitRockBlocks.ROCK_PAVING_STONES_PRESSURE_PLATES.get(type)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    // Rock ornaments
    public static final Map<RockType, DeferredItem<BlockItem>> ROCKS_ORNAMENTS_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_ITEM_REGISTRY.registerSimpleBlockItem(type.getName() + "_ornament", InitRockBlocks.ROCK_ORNAMENTS.get(type)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, DeferredItem<BlockItem>> ROCK_ORNAMENT_PRESSURE_PLATES_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_ITEM_REGISTRY.registerSimpleBlockItem(type.getName() + "_ornament_pressure_plate", InitRockBlocks.ROCK_ORNAMENT_PRESSURE_PLATES.get(type)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    // Rock rooftiles
    public static final Map<RockType, DeferredItem<BlockItem>> ROCKS_ROOFTILES_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_ITEM_REGISTRY.registerSimpleBlockItem(type.getName() + "_rooftiles", InitRockBlocks.ROCK_ROOFTILES.get(type)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, DeferredItem<BlockItem>> ROCK_ROOFTILES_STAIRS_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_ITEM_REGISTRY.registerSimpleBlockItem(type.getName() + "_rooftiles_stairs", InitRockBlocks.ROCK_ROOFTILES_STAIRS.get(type)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, DeferredItem<BlockItem>> ROCK_ROOFTILES_SLABS_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_ITEM_REGISTRY.registerSimpleBlockItem(type.getName() + "_rooftiles_slab", InitRockBlocks.ROCK_ROOFTILES_SLABS.get(type)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    // Paving stones
    public static final DeferredItem<BlockItem> PAVING_STONES_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("paving_stones", InitRockBlocks.PAVING_STONES);
    public static final DeferredItem<BlockItem> PAVING_STONES_STAIRS_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("paving_stones_stairs", InitRockBlocks.PAVING_STONES_STAIRS);
    public static final DeferredItem<BlockItem> PAVING_STONES_SLAB_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("paving_stones_slab", InitRockBlocks.PAVING_STONES_SLAB);
    public static final DeferredItem<BlockItem> PAVING_STONES_WALL_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("paving_stones_wall", InitRockBlocks.PAVING_STONES_WALL);
    public static final DeferredItem<BlockItem> PAVING_STONES_PRESSURE_PLATE_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("paving_stones_pressure_plate", InitRockBlocks.PAVING_STONES_PRESSURE_PLATE);

    // Andesite
    public static final DeferredItem<BlockItem> SMOOTH_ANDESITE_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("smooth_andesite", InitRockBlocks.SMOOTH_ANDESITE);
    public static final DeferredItem<BlockItem> SMOOTH_ANDESITE_STAIRS_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("smooth_andesite_stairs", InitRockBlocks.SMOOTH_ANDESITE_STAIRS);
    public static final DeferredItem<BlockItem> SMOOTH_ANDESITE_SLAB_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("smooth_andesite_slab", InitRockBlocks.SMOOTH_ANDESITE_SLAB);
    public static final DeferredItem<BlockItem> SMOOTH_ANDESITE_WALL_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("smooth_andesite_wall", InitRockBlocks.SMOOTH_ANDESITE_WALL);
    public static final DeferredItem<BlockItem> SMOOTH_ANDESITE_PRESSURE_PLATE_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("smooth_andesite_pressure_plate", InitRockBlocks.SMOOTH_ANDESITE_PRESSURE_PLATE);
    public static final DeferredItem<BlockItem> ANDESITE_BUTTON_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("andesite_button", InitRockBlocks.ANDESITE_BUTTON);

    public static final DeferredItem<BlockItem> ANDESITE_PAVING_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("andesite_paving", InitRockBlocks.ANDESITE_PAVING);
    public static final DeferredItem<BlockItem> ANDESITE_PAVING_STAIRS_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("andesite_paving_stairs", InitRockBlocks.ANDESITE_PAVING_STAIRS);
    public static final DeferredItem<BlockItem> ANDESITE_PAVING_SLAB_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("andesite_paving_slab", InitRockBlocks.ANDESITE_PAVING_SLAB);
    public static final DeferredItem<BlockItem> ANDESITE_PAVING_WALL_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("andesite_paving_wall", InitRockBlocks.ANDESITE_PAVING_WALL);
    public static final DeferredItem<BlockItem> ANDESITE_PAVING_PRESSURE_PLATE_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("andesite_paving_pressure_plate", InitRockBlocks.ANDESITE_PAVING_PRESSURE_PLATE);

    public static final DeferredItem<BlockItem> ANDESITE_TILES_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("andesite_tiles", InitRockBlocks.ANDESITE_TILES);
    public static final DeferredItem<BlockItem> ANDESITE_TILES_STAIRS_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("andesite_tiles_stairs", InitRockBlocks.ANDESITE_TILES_STAIRS);
    public static final DeferredItem<BlockItem> ANDESITE_TILES_SLAB_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("andesite_tiles_slab", InitRockBlocks.ANDESITE_TILES_SLAB);
    public static final DeferredItem<BlockItem> ANDESITE_TILES_WALL_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("andesite_tiles_wall", InitRockBlocks.ANDESITE_TILES_WALL);
    public static final DeferredItem<BlockItem> ANDESITE_TILES_PRESSURE_PLATE_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("andesite_tiles_pressure_plate", InitRockBlocks.ANDESITE_TILES_PRESSURE_PLATE);

    public static final DeferredItem<BlockItem> ANDESITE_BRICKS_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("andesite_bricks", InitRockBlocks.ANDESITE_BRICKS);
    public static final DeferredItem<BlockItem> ANDESITE_BRICKS_STAIRS_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("andesite_bricks_stairs", InitRockBlocks.ANDESITE_BRICKS_STAIRS);
    public static final DeferredItem<BlockItem> ANDESITE_BRICKS_SLAB_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("andesite_bricks_slab", InitRockBlocks.ANDESITE_BRICKS_SLAB);
    public static final DeferredItem<BlockItem> ANDESITE_BRICKS_WALL_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("andesite_bricks_wall", InitRockBlocks.ANDESITE_BRICKS_WALL);
    public static final DeferredItem<BlockItem> ANDESITE_BRICKS_PRESSURE_PLATE_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("andesite_bricks_pressure_plate", InitRockBlocks.ANDESITE_BRICKS_PRESSURE_PLATE);

    public static final DeferredItem<BlockItem> ANDESITE_LARGE_BRICKS_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("andesite_large_bricks", InitRockBlocks.ANDESITE_LARGE_BRICKS);
    public static final DeferredItem<BlockItem> ANDESITE_LARGE_BRICKS_STAIRS_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("andesite_large_bricks_stairs", InitRockBlocks.ANDESITE_LARGE_BRICKS_STAIRS);
    public static final DeferredItem<BlockItem> ANDESITE_LARGE_BRICKS_SLAB_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("andesite_large_bricks_slab", InitRockBlocks.ANDESITE_LARGE_BRICKS_SLAB);
    public static final DeferredItem<BlockItem> ANDESITE_LARGE_BRICKS_WALL_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("andesite_large_bricks_wall", InitRockBlocks.ANDESITE_LARGE_BRICKS_WALL);
    public static final DeferredItem<BlockItem> ANDESITE_LARGE_BRICKS_PRESSURE_PLATE_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("andesite_large_bricks_pressure_plate", InitRockBlocks.ANDESITE_LARGE_BRICKS_PRESSURE_PLATE);

    public static final DeferredItem<BlockItem> ANDESITE_PAVING_STONES_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("andesite_paving_stones", InitRockBlocks.ANDESITE_PAVING_STONES);
    public static final DeferredItem<BlockItem> ANDESITE_PAVING_STONES_STAIRS_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("andesite_paving_stones_stairs", InitRockBlocks.ANDESITE_PAVING_STONES_STAIRS);
    public static final DeferredItem<BlockItem> ANDESITE_PAVING_STONES_SLAB_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("andesite_paving_stones_slab", InitRockBlocks.ANDESITE_PAVING_STONES_SLAB);
    public static final DeferredItem<BlockItem> ANDESITE_PAVING_STONES_WALL_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("andesite_paving_stones_wall", InitRockBlocks.ANDESITE_PAVING_STONES_WALL);
    public static final DeferredItem<BlockItem> ANDESITE_PAVING_STONES_PRESSURE_PLATE_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("andesite_paving_stones_pressure_plate", InitRockBlocks.ANDESITE_PAVING_STONES_PRESSURE_PLATE);

    public static final DeferredItem<BlockItem> ANDESITE_ORNAMENT_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("andesite_ornament", InitRockBlocks.ANDESITE_ORNAMENT);
    public static final DeferredItem<BlockItem> ANDESITE_ORNAMENT_PRESSURE_PLATE_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("andesite_ornament_pressure_plate", InitRockBlocks.ANDESITE_ORNAMENT_PRESSURE_PLATE);

    public static final DeferredItem<BlockItem> ANDESITE_ROOFTILES_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("andesite_rooftiles", InitRockBlocks.ANDESITE_ROOFTILES);
    public static final DeferredItem<BlockItem> ANDESITE_ROOFTILES_STAIRS_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("andesite_rooftiles_stairs", InitRockBlocks.ANDESITE_ROOFTILES_STAIRS);
    public static final DeferredItem<BlockItem> ANDESITE_ROOFTILES_SLAB_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("andesite_rooftiles_slab", InitRockBlocks.ANDESITE_ROOFTILES_SLAB);

    // Diorite
    public static final DeferredItem<BlockItem> SMOOTH_DIORITE_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("smooth_diorite", InitRockBlocks.SMOOTH_DIORITE);
    public static final DeferredItem<BlockItem> SMOOTH_DIORITE_STAIRS_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("smooth_diorite_stairs", InitRockBlocks.SMOOTH_DIORITE_STAIRS);
    public static final DeferredItem<BlockItem> SMOOTH_DIORITE_SLAB_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("smooth_diorite_slab", InitRockBlocks.SMOOTH_DIORITE_SLAB);
    public static final DeferredItem<BlockItem> SMOOTH_DIORITE_WALL_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("smooth_diorite_wall", InitRockBlocks.SMOOTH_DIORITE_WALL);
    public static final DeferredItem<BlockItem> SMOOTH_DIORITE_PRESSURE_PLATE_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("smooth_diorite_pressure_plate", InitRockBlocks.SMOOTH_DIORITE_PRESSURE_PLATE);
    public static final DeferredItem<BlockItem> DIORITE_BUTTON_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("diorite_button", InitRockBlocks.DIORITE_BUTTON);

    public static final DeferredItem<BlockItem> DIORITE_PAVING_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("diorite_paving", InitRockBlocks.DIORITE_PAVING);
    public static final DeferredItem<BlockItem> DIORITE_PAVING_STAIRS_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("diorite_paving_stairs", InitRockBlocks.DIORITE_PAVING_STAIRS);
    public static final DeferredItem<BlockItem> DIORITE_PAVING_SLAB_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("diorite_paving_slab", InitRockBlocks.DIORITE_PAVING_SLAB);
    public static final DeferredItem<BlockItem> DIORITE_PAVING_WALL_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("diorite_paving_wall", InitRockBlocks.DIORITE_PAVING_WALL);
    public static final DeferredItem<BlockItem> DIORITE_PAVING_PRESSURE_PLATE_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("diorite_paving_pressure_plate", InitRockBlocks.DIORITE_PAVING_PRESSURE_PLATE);

    public static final DeferredItem<BlockItem> DIORITE_TILES_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("diorite_tiles", InitRockBlocks.DIORITE_TILES);
    public static final DeferredItem<BlockItem> DIORITE_TILES_STAIRS_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("diorite_tiles_stairs", InitRockBlocks.DIORITE_TILES_STAIRS);
    public static final DeferredItem<BlockItem> DIORITE_TILES_SLAB_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("diorite_tiles_slab", InitRockBlocks.DIORITE_TILES_SLAB);
    public static final DeferredItem<BlockItem> DIORITE_TILES_WALL_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("diorite_tiles_wall", InitRockBlocks.DIORITE_TILES_WALL);
    public static final DeferredItem<BlockItem> DIORITE_TILES_PRESSURE_PLATE_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("diorite_tiles_pressure_plate", InitRockBlocks.DIORITE_TILES_PRESSURE_PLATE);

    public static final DeferredItem<BlockItem> DIORITE_BRICKS_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("diorite_bricks", InitRockBlocks.DIORITE_BRICKS);
    public static final DeferredItem<BlockItem> DIORITE_BRICKS_STAIRS_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("diorite_bricks_stairs", InitRockBlocks.DIORITE_BRICKS_STAIRS);
    public static final DeferredItem<BlockItem> DIORITE_BRICKS_SLAB_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("diorite_bricks_slab", InitRockBlocks.DIORITE_BRICKS_SLAB);
    public static final DeferredItem<BlockItem> DIORITE_BRICKS_WALL_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("diorite_bricks_wall", InitRockBlocks.DIORITE_BRICKS_WALL);
    public static final DeferredItem<BlockItem> DIORITE_BRICKS_PRESSURE_PLATE_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("diorite_bricks_pressure_plate", InitRockBlocks.DIORITE_BRICKS_PRESSURE_PLATE);

    public static final DeferredItem<BlockItem> DIORITE_LARGE_BRICKS_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("diorite_large_bricks", InitRockBlocks.DIORITE_LARGE_BRICKS);
    public static final DeferredItem<BlockItem> DIORITE_LARGE_BRICKS_STAIRS_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("diorite_large_bricks_stairs", InitRockBlocks.DIORITE_LARGE_BRICKS_STAIRS);
    public static final DeferredItem<BlockItem> DIORITE_LARGE_BRICKS_SLAB_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("diorite_large_bricks_slab", InitRockBlocks.DIORITE_LARGE_BRICKS_SLAB);
    public static final DeferredItem<BlockItem> DIORITE_LARGE_BRICKS_WALL_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("diorite_large_bricks_wall", InitRockBlocks.DIORITE_LARGE_BRICKS_WALL);
    public static final DeferredItem<BlockItem> DIORITE_LARGE_BRICKS_PRESSURE_PLATE_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("diorite_large_bricks_pressure_plate", InitRockBlocks.DIORITE_LARGE_BRICKS_PRESSURE_PLATE);

    public static final DeferredItem<BlockItem> DIORITE_PAVING_STONES_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("diorite_paving_stones", InitRockBlocks.DIORITE_PAVING_STONES);
    public static final DeferredItem<BlockItem> DIORITE_PAVING_STONES_STAIRS_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("diorite_paving_stones_stairs", InitRockBlocks.DIORITE_PAVING_STONES_STAIRS);
    public static final DeferredItem<BlockItem> DIORITE_PAVING_STONES_SLAB_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("diorite_paving_stones_slab", InitRockBlocks.DIORITE_PAVING_STONES_SLAB);
    public static final DeferredItem<BlockItem> DIORITE_PAVING_STONES_WALL_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("diorite_paving_stones_wall", InitRockBlocks.DIORITE_PAVING_STONES_WALL);
    public static final DeferredItem<BlockItem> DIORITE_PAVING_STONES_PRESSURE_PLATE_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("diorite_paving_stones_pressure_plate", InitRockBlocks.DIORITE_PAVING_STONES_PRESSURE_PLATE);

    public static final DeferredItem<BlockItem> DIORITE_ORNAMENT_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("diorite_ornament", InitRockBlocks.DIORITE_ORNAMENT);
    public static final DeferredItem<BlockItem> DIORITE_ORNAMENT_PRESSURE_PLATE_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("diorite_ornament_pressure_plate", InitRockBlocks.DIORITE_ORNAMENT_PRESSURE_PLATE);

    public static final DeferredItem<BlockItem> DIORITE_ROOFTILES_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("diorite_rooftiles", InitRockBlocks.DIORITE_ROOFTILES);
    public static final DeferredItem<BlockItem> DIORITE_ROOFTILES_STAIRS_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("diorite_rooftiles_stairs", InitRockBlocks.DIORITE_ROOFTILES_STAIRS);
    public static final DeferredItem<BlockItem> DIORITE_ROOFTILES_SLAB_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("diorite_rooftiles_slab", InitRockBlocks.DIORITE_ROOFTILES_SLAB);

    // Granite
    public static final DeferredItem<BlockItem> SMOOTH_GRANITE_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("smooth_granite", InitRockBlocks.SMOOTH_GRANITE);
    public static final DeferredItem<BlockItem> SMOOTH_GRANITE_STAIRS_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("smooth_granite_stairs", InitRockBlocks.SMOOTH_GRANITE_STAIRS);
    public static final DeferredItem<BlockItem> SMOOTH_GRANITE_SLAB_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("smooth_granite_slab", InitRockBlocks.SMOOTH_GRANITE_SLAB);
    public static final DeferredItem<BlockItem> SMOOTH_GRANITE_WALL_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("smooth_granite_wall", InitRockBlocks.SMOOTH_GRANITE_WALL);
    public static final DeferredItem<BlockItem> SMOOTH_GRANITE_PRESSURE_PLATE_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("smooth_granite_pressure_plate", InitRockBlocks.SMOOTH_GRANITE_PRESSURE_PLATE);
    public static final DeferredItem<BlockItem> GRANITE_BUTTON_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("granite_button", InitRockBlocks.GRANITE_BUTTON);

    public static final DeferredItem<BlockItem> GRANITE_PAVING_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("granite_paving", InitRockBlocks.GRANITE_PAVING);
    public static final DeferredItem<BlockItem> GRANITE_PAVING_STAIRS_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("granite_paving_stairs", InitRockBlocks.GRANITE_PAVING_STAIRS);
    public static final DeferredItem<BlockItem> GRANITE_PAVING_SLAB_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("granite_paving_slab", InitRockBlocks.GRANITE_PAVING_SLAB);
    public static final DeferredItem<BlockItem> GRANITE_PAVING_WALL_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("granite_paving_wall", InitRockBlocks.GRANITE_PAVING_WALL);
    public static final DeferredItem<BlockItem> GRANITE_PAVING_PRESSURE_PLATE_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("granite_paving_pressure_plate", InitRockBlocks.GRANITE_PAVING_PRESSURE_PLATE);

    public static final DeferredItem<BlockItem> GRANITE_TILES_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("granite_tiles", InitRockBlocks.GRANITE_TILES);
    public static final DeferredItem<BlockItem> GRANITE_TILES_STAIRS_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("granite_tiles_stairs", InitRockBlocks.GRANITE_TILES_STAIRS);
    public static final DeferredItem<BlockItem> GRANITE_TILES_SLAB_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("granite_tiles_slab", InitRockBlocks.GRANITE_TILES_SLAB);
    public static final DeferredItem<BlockItem> GRANITE_TILES_WALL_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("granite_tiles_wall", InitRockBlocks.GRANITE_TILES_WALL);
    public static final DeferredItem<BlockItem> GRANITE_TILES_PRESSURE_PLATE_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("granite_tiles_pressure_plate", InitRockBlocks.GRANITE_TILES_PRESSURE_PLATE);

    public static final DeferredItem<BlockItem> GRANITE_BRICKS_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("granite_bricks", InitRockBlocks.GRANITE_BRICKS);
    public static final DeferredItem<BlockItem> GRANITE_BRICKS_STAIRS_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("granite_bricks_stairs", InitRockBlocks.GRANITE_BRICKS_STAIRS);
    public static final DeferredItem<BlockItem> GRANITE_BRICKS_SLAB_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("granite_bricks_slab", InitRockBlocks.GRANITE_BRICKS_SLAB);
    public static final DeferredItem<BlockItem> GRANITE_BRICKS_WALL_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("granite_bricks_wall", InitRockBlocks.GRANITE_BRICKS_WALL);
    public static final DeferredItem<BlockItem> GRANITE_BRICKS_PRESSURE_PLATE_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("granite_bricks_pressure_plate", InitRockBlocks.GRANITE_BRICKS_PRESSURE_PLATE);

    public static final DeferredItem<BlockItem> GRANITE_LARGE_BRICKS_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("granite_large_bricks", InitRockBlocks.GRANITE_LARGE_BRICKS);
    public static final DeferredItem<BlockItem> GRANITE_LARGE_BRICKS_STAIRS_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("granite_large_bricks_stairs", InitRockBlocks.GRANITE_LARGE_BRICKS_STAIRS);
    public static final DeferredItem<BlockItem> GRANITE_LARGE_BRICKS_SLAB_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("granite_large_bricks_slab", InitRockBlocks.GRANITE_LARGE_BRICKS_SLAB);
    public static final DeferredItem<BlockItem> GRANITE_LARGE_BRICKS_WALL_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("granite_large_bricks_wall", InitRockBlocks.GRANITE_LARGE_BRICKS_WALL);
    public static final DeferredItem<BlockItem> GRANITE_LARGE_BRICKS_PRESSURE_PLATE_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("granite_large_bricks_pressure_plate", InitRockBlocks.GRANITE_LARGE_BRICKS_PRESSURE_PLATE);

    public static final DeferredItem<BlockItem> GRANITE_PAVING_STONES_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("granite_paving_stones", InitRockBlocks.GRANITE_PAVING_STONES);
    public static final DeferredItem<BlockItem> GRANITE_PAVING_STONES_STAIRS_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("granite_paving_stones_stairs", InitRockBlocks.GRANITE_PAVING_STONES_STAIRS);
    public static final DeferredItem<BlockItem> GRANITE_PAVING_STONES_SLAB_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("granite_paving_stones_slab", InitRockBlocks.GRANITE_PAVING_STONES_SLAB);
    public static final DeferredItem<BlockItem> GRANITE_PAVING_STONES_WALL_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("granite_paving_stones_wall", InitRockBlocks.GRANITE_PAVING_STONES_WALL);
    public static final DeferredItem<BlockItem> GRANITE_PAVING_STONES_PRESSURE_PLATE_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("granite_paving_stones_pressure_plate", InitRockBlocks.GRANITE_PAVING_STONES_PRESSURE_PLATE);

    public static final DeferredItem<BlockItem> GRANITE_ORNAMENT_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("granite_ornament", InitRockBlocks.GRANITE_ORNAMENT);
    public static final DeferredItem<BlockItem> GRANITE_ORNAMENT_PRESSURE_PLATE_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("granite_ornament_pressure_plate", InitRockBlocks.GRANITE_ORNAMENT_PRESSURE_PLATE);

    public static final DeferredItem<BlockItem> GRANITE_ROOFTILES_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("granite_rooftiles", InitRockBlocks.GRANITE_ROOFTILES);
    public static final DeferredItem<BlockItem> GRANITE_ROOFTILES_STAIRS_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("granite_rooftiles_stairs", InitRockBlocks.GRANITE_ROOFTILES_STAIRS);
    public static final DeferredItem<BlockItem> GRANITE_ROOFTILES_SLAB_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("granite_rooftiles_slab", InitRockBlocks.GRANITE_ROOFTILES_SLAB);

    // Sandstone
    public static final DeferredItem<BlockItem> SANDSTONE_BUTTON_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("sandstone_button", InitRockBlocks.SANDSTONE_BUTTON);

    public static final DeferredItem<BlockItem> SMOOTH_SANDSTONE_WALL_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("smooth_sandstone_wall", InitRockBlocks.SMOOTH_SANDSTONE_WALL);
    public static final DeferredItem<BlockItem> SMOOTH_SANDSTONE_PRESSURE_PLATE_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("smooth_sandstone_pressure_plate", InitRockBlocks.SMOOTH_SANDSTONE_PRESSURE_PLATE);

    public static final DeferredItem<BlockItem> POLISHED_SANDSTONE_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("polished_sandstone", InitRockBlocks.POLISHED_SANDSTONE);
    public static final DeferredItem<BlockItem> POLISHED_SANDSTONE_STAIRS_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("polished_sandstone_stairs", InitRockBlocks.POLISHED_SANDSTONE_STAIRS);
    public static final DeferredItem<BlockItem> POLISHED_SANDSTONE_SLAB_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("polished_sandstone_slab", InitRockBlocks.POLISHED_SANDSTONE_SLAB);
    public static final DeferredItem<BlockItem> POLISHED_SANDSTONE_WALL_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("polished_sandstone_wall", InitRockBlocks.POLISHED_SANDSTONE_WALL);
    public static final DeferredItem<BlockItem> POLISHED_SANDSTONE_PRESSURE_PLATE_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("polished_sandstone_pressure_plate", InitRockBlocks.POLISHED_SANDSTONE_PRESSURE_PLATE);

    public static final DeferredItem<BlockItem> SANDSTONE_PAVING_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("sandstone_paving", InitRockBlocks.SANDSTONE_PAVING);
    public static final DeferredItem<BlockItem> SANDSTONE_PAVING_STAIRS_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("sandstone_paving_stairs", InitRockBlocks.SANDSTONE_PAVING_STAIRS);
    public static final DeferredItem<BlockItem> SANDSTONE_PAVING_SLAB_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("sandstone_paving_slab", InitRockBlocks.SANDSTONE_PAVING_SLAB);
    public static final DeferredItem<BlockItem> SANDSTONE_PAVING_WALL_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("sandstone_paving_wall", InitRockBlocks.SANDSTONE_PAVING_WALL);
    public static final DeferredItem<BlockItem> SANDSTONE_PAVING_PRESSURE_PLATE_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("sandstone_paving_pressure_plate", InitRockBlocks.SANDSTONE_PAVING_PRESSURE_PLATE);

    public static final DeferredItem<BlockItem> SANDSTONE_TILES_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("sandstone_tiles", InitRockBlocks.SANDSTONE_TILES);
    public static final DeferredItem<BlockItem> SANDSTONE_TILES_STAIRS_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("sandstone_tiles_stairs", InitRockBlocks.SANDSTONE_TILES_STAIRS);
    public static final DeferredItem<BlockItem> SANDSTONE_TILES_SLAB_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("sandstone_tiles_slab", InitRockBlocks.SANDSTONE_TILES_SLAB);
    public static final DeferredItem<BlockItem> SANDSTONE_TILES_WALL_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("sandstone_tiles_wall", InitRockBlocks.SANDSTONE_TILES_WALL);
    public static final DeferredItem<BlockItem> SANDSTONE_TILES_PRESSURE_PLATE_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("sandstone_tiles_pressure_plate", InitRockBlocks.SANDSTONE_TILES_PRESSURE_PLATE);

    public static final DeferredItem<BlockItem> SANDSTONE_BRICKS_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("sandstone_bricks", InitRockBlocks.SANDSTONE_BRICKS);
    public static final DeferredItem<BlockItem> SANDSTONE_BRICKS_STAIRS_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("sandstone_bricks_stairs", InitRockBlocks.SANDSTONE_BRICKS_STAIRS);
    public static final DeferredItem<BlockItem> SANDSTONE_BRICKS_SLAB_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("sandstone_bricks_slab", InitRockBlocks.SANDSTONE_BRICKS_SLAB);
    public static final DeferredItem<BlockItem> SANDSTONE_BRICKS_WALL_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("sandstone_bricks_wall", InitRockBlocks.SANDSTONE_BRICKS_WALL);
    public static final DeferredItem<BlockItem> SANDSTONE_BRICKS_PRESSURE_PLATE_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("sandstone_bricks_pressure_plate", InitRockBlocks.SANDSTONE_BRICKS_PRESSURE_PLATE);

    public static final DeferredItem<BlockItem> SANDSTONE_LARGE_BRICKS_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("sandstone_large_bricks", InitRockBlocks.SANDSTONE_LARGE_BRICKS);
    public static final DeferredItem<BlockItem> SANDSTONE_LARGE_BRICKS_STAIRS_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("sandstone_large_bricks_stairs", InitRockBlocks.SANDSTONE_LARGE_BRICKS_STAIRS);
    public static final DeferredItem<BlockItem> SANDSTONE_LARGE_BRICKS_SLAB_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("sandstone_large_bricks_slab", InitRockBlocks.SANDSTONE_LARGE_BRICKS_SLAB);
    public static final DeferredItem<BlockItem> SANDSTONE_LARGE_BRICKS_WALL_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("sandstone_large_bricks_wall", InitRockBlocks.SANDSTONE_LARGE_BRICKS_WALL);
    public static final DeferredItem<BlockItem> SANDSTONE_LARGE_BRICKS_PRESSURE_PLATE_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("sandstone_large_bricks_pressure_plate", InitRockBlocks.SANDSTONE_LARGE_BRICKS_PRESSURE_PLATE);

    public static final DeferredItem<BlockItem> SANDSTONE_PAVING_STONES_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("sandstone_paving_stones", InitRockBlocks.SANDSTONE_PAVING_STONES);
    public static final DeferredItem<BlockItem> SANDSTONE_PAVING_STONES_STAIRS_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("sandstone_paving_stones_stairs", InitRockBlocks.SANDSTONE_PAVING_STONES_STAIRS);
    public static final DeferredItem<BlockItem> SANDSTONE_PAVING_STONES_SLAB_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("sandstone_paving_stones_slab", InitRockBlocks.SANDSTONE_PAVING_STONES_SLAB);
    public static final DeferredItem<BlockItem> SANDSTONE_PAVING_STONES_WALL_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("sandstone_paving_stones_wall", InitRockBlocks.SANDSTONE_PAVING_STONES_WALL);
    public static final DeferredItem<BlockItem> SANDSTONE_PAVING_STONES_PRESSURE_PLATE_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("sandstone_paving_stones_pressure_plate", InitRockBlocks.SANDSTONE_PAVING_STONES_PRESSURE_PLATE);

    public static final DeferredItem<BlockItem> SANDSTONE_ROOFTILES_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("sandstone_rooftiles", InitRockBlocks.SANDSTONE_ROOFTILES);
    public static final DeferredItem<BlockItem> SANDSTONE_ROOFTILES_STAIRS_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("sandstone_rooftiles_stairs", InitRockBlocks.SANDSTONE_ROOFTILES_STAIRS);
    public static final DeferredItem<BlockItem> SANDSTONE_ROOFTILES_SLAB_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("sandstone_rooftiles_slab", InitRockBlocks.SANDSTONE_ROOFTILES_SLAB);

    // Red Sandstone
    public static final DeferredItem<BlockItem> RED_SANDSTONE_BUTTON_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("red_sandstone_button", InitRockBlocks.RED_SANDSTONE_BUTTON);

    public static final DeferredItem<BlockItem> SMOOTH_RED_SANDSTONE_WALL_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("smooth_red_sandstone_wall", InitRockBlocks.SMOOTH_RED_SANDSTONE_WALL);
    public static final DeferredItem<BlockItem> SMOOTH_RED_SANDSTONE_PRESSURE_PLATE_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("smooth_red_sandstone_pressure_plate", InitRockBlocks.SMOOTH_RED_SANDSTONE_PRESSURE_PLATE);

    public static final DeferredItem<BlockItem> POLISHED_RED_SANDSTONE_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("polished_red_sandstone", InitRockBlocks.POLISHED_RED_SANDSTONE);
    public static final DeferredItem<BlockItem> POLISHED_RED_SANDSTONE_STAIRS_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("polished_red_sandstone_stairs", InitRockBlocks.POLISHED_RED_SANDSTONE_STAIRS);
    public static final DeferredItem<BlockItem> POLISHED_RED_SANDSTONE_SLAB_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("polished_red_sandstone_slab", InitRockBlocks.POLISHED_RED_SANDSTONE_SLAB);
    public static final DeferredItem<BlockItem> POLISHED_RED_SANDSTONE_WALL_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("polished_red_sandstone_wall", InitRockBlocks.POLISHED_RED_SANDSTONE_WALL);
    public static final DeferredItem<BlockItem> POLISHED_RED_SANDSTONE_PRESSURE_PLATE_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("polished_red_sandstone_pressure_plate", InitRockBlocks.POLISHED_RED_SANDSTONE_PRESSURE_PLATE);

    public static final DeferredItem<BlockItem> RED_SANDSTONE_PAVING_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("red_sandstone_paving", InitRockBlocks.RED_SANDSTONE_PAVING);
    public static final DeferredItem<BlockItem> RED_SANDSTONE_PAVING_STAIRS_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("red_sandstone_paving_stairs", InitRockBlocks.RED_SANDSTONE_PAVING_STAIRS);
    public static final DeferredItem<BlockItem> RED_SANDSTONE_PAVING_SLAB_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("red_sandstone_paving_slab", InitRockBlocks.RED_SANDSTONE_PAVING_SLAB);
    public static final DeferredItem<BlockItem> RED_SANDSTONE_PAVING_WALL_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("red_sandstone_paving_wall", InitRockBlocks.RED_SANDSTONE_PAVING_WALL);
    public static final DeferredItem<BlockItem> RED_SANDSTONE_PAVING_PRESSURE_PLATE_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("red_sandstone_paving_pressure_plate", InitRockBlocks.RED_SANDSTONE_PAVING_PRESSURE_PLATE);

    public static final DeferredItem<BlockItem> RED_SANDSTONE_TILES_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("red_sandstone_tiles", InitRockBlocks.RED_SANDSTONE_TILES);
    public static final DeferredItem<BlockItem> RED_SANDSTONE_TILES_STAIRS_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("red_sandstone_tiles_stairs", InitRockBlocks.RED_SANDSTONE_TILES_STAIRS);
    public static final DeferredItem<BlockItem> RED_SANDSTONE_TILES_SLAB_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("red_sandstone_tiles_slab", InitRockBlocks.RED_SANDSTONE_TILES_SLAB);
    public static final DeferredItem<BlockItem> RED_SANDSTONE_TILES_WALL_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("red_sandstone_tiles_wall", InitRockBlocks.RED_SANDSTONE_TILES_WALL);
    public static final DeferredItem<BlockItem> RED_SANDSTONE_TILES_PRESSURE_PLATE_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("red_sandstone_tiles_pressure_plate", InitRockBlocks.RED_SANDSTONE_TILES_PRESSURE_PLATE);

    public static final DeferredItem<BlockItem> RED_SANDSTONE_BRICKS_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("red_sandstone_bricks", InitRockBlocks.RED_SANDSTONE_BRICKS);
    public static final DeferredItem<BlockItem> RED_SANDSTONE_BRICKS_STAIRS_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("red_sandstone_bricks_stairs", InitRockBlocks.RED_SANDSTONE_BRICKS_STAIRS);
    public static final DeferredItem<BlockItem> RED_SANDSTONE_BRICKS_SLAB_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("red_sandstone_bricks_slab", InitRockBlocks.RED_SANDSTONE_BRICKS_SLAB);
    public static final DeferredItem<BlockItem> RED_SANDSTONE_BRICKS_WALL_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("red_sandstone_bricks_wall", InitRockBlocks.RED_SANDSTONE_BRICKS_WALL);
    public static final DeferredItem<BlockItem> RED_SANDSTONE_BRICKS_PRESSURE_PLATE_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("red_sandstone_bricks_pressure_plate", InitRockBlocks.RED_SANDSTONE_BRICKS_PRESSURE_PLATE);

    public static final DeferredItem<BlockItem> RED_SANDSTONE_LARGE_BRICKS_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("red_sandstone_large_bricks", InitRockBlocks.RED_SANDSTONE_LARGE_BRICKS);
    public static final DeferredItem<BlockItem> RED_SANDSTONE_LARGE_BRICKS_STAIRS_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("red_sandstone_large_bricks_stairs", InitRockBlocks.RED_SANDSTONE_LARGE_BRICKS_STAIRS);
    public static final DeferredItem<BlockItem> RED_SANDSTONE_LARGE_BRICKS_SLAB_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("red_sandstone_large_bricks_slab", InitRockBlocks.RED_SANDSTONE_LARGE_BRICKS_SLAB);
    public static final DeferredItem<BlockItem> RED_SANDSTONE_LARGE_BRICKS_WALL_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("red_sandstone_large_bricks_wall", InitRockBlocks.RED_SANDSTONE_LARGE_BRICKS_WALL);
    public static final DeferredItem<BlockItem> RED_SANDSTONE_LARGE_BRICKS_PRESSURE_PLATE_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("red_sandstone_large_bricks_pressure_plate", InitRockBlocks.RED_SANDSTONE_LARGE_BRICKS_PRESSURE_PLATE);

    public static final DeferredItem<BlockItem> RED_SANDSTONE_PAVING_STONES_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("red_sandstone_paving_stones", InitRockBlocks.RED_SANDSTONE_PAVING_STONES);
    public static final DeferredItem<BlockItem> RED_SANDSTONE_PAVING_STONES_STAIRS_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("red_sandstone_paving_stones_stairs", InitRockBlocks.RED_SANDSTONE_PAVING_STONES_STAIRS);
    public static final DeferredItem<BlockItem> RED_SANDSTONE_PAVING_STONES_SLAB_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("red_sandstone_paving_stones_slab", InitRockBlocks.RED_SANDSTONE_PAVING_STONES_SLAB);
    public static final DeferredItem<BlockItem> RED_SANDSTONE_PAVING_STONES_WALL_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("red_sandstone_paving_stones_wall", InitRockBlocks.RED_SANDSTONE_PAVING_STONES_WALL);
    public static final DeferredItem<BlockItem> RED_SANDSTONE_PAVING_STONES_PRESSURE_PLATE_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("red_sandstone_paving_stones_pressure_plate", InitRockBlocks.RED_SANDSTONE_PAVING_STONES_PRESSURE_PLATE);

    public static final DeferredItem<BlockItem> RED_SANDSTONE_ROOFTILES_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("red_sandstone_rooftiles", InitRockBlocks.RED_SANDSTONE_ROOFTILES);
    public static final DeferredItem<BlockItem> RED_SANDSTONE_ROOFTILES_STAIRS_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("red_sandstone_rooftiles_stairs", InitRockBlocks.RED_SANDSTONE_ROOFTILES_STAIRS);
    public static final DeferredItem<BlockItem> RED_SANDSTONE_ROOFTILES_SLAB_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("red_sandstone_rooftiles_slab", InitRockBlocks.RED_SANDSTONE_ROOFTILES_SLAB);

    // Terracotta
    public static final DeferredItem<BlockItem> TERRACOTTA_STAIRS_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("terracotta_stairs", InitRockBlocks.TERRACOTTA_STAIRS);
    public static final DeferredItem<BlockItem> TERRACOTTA_SLAB_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("terracotta_slab", InitRockBlocks.TERRACOTTA_SLAB);
    public static final DeferredItem<BlockItem> TERRACOTTA_WALL_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("terracotta_wall", InitRockBlocks.TERRACOTTA_WALL);
    public static final DeferredItem<BlockItem> TERRACOTTA_PRESSURE_PLATE_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("terracotta_pressure_plate", InitRockBlocks.TERRACOTTA_PRESSURE_PLATE);
    public static final DeferredItem<BlockItem> TERRACOTTA_BUTTON_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("terracotta_button", InitRockBlocks.TERRACOTTA_BUTTON);

    public static final DeferredItem<BlockItem> POLISHED_TERRACOTTA_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("polished_terracotta", InitRockBlocks.POLISHED_TERRACOTTA);
    public static final DeferredItem<BlockItem> POLISHED_TERRACOTTA_STAIRS_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("polished_terracotta_stairs", InitRockBlocks.POLISHED_TERRACOTTA_STAIRS);
    public static final DeferredItem<BlockItem> POLISHED_TERRACOTTA_SLAB_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("polished_terracotta_slab", InitRockBlocks.POLISHED_TERRACOTTA_SLAB);
    public static final DeferredItem<BlockItem> POLISHED_TERRACOTTA_WALL_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("polished_terracotta_wall", InitRockBlocks.POLISHED_TERRACOTTA_WALL);
    public static final DeferredItem<BlockItem> POLISHED_TERRACOTTA_PRESSURE_PLATE_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("polished_terracotta_pressure_plate", InitRockBlocks.POLISHED_TERRACOTTA_PRESSURE_PLATE);

    public static final DeferredItem<BlockItem> TERRACOTTA_PAVING_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("terracotta_paving", InitRockBlocks.TERRACOTTA_PAVING);
    public static final DeferredItem<BlockItem> TERRACOTTA_PAVING_STAIRS_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("terracotta_paving_stairs", InitRockBlocks.TERRACOTTA_PAVING_STAIRS);
    public static final DeferredItem<BlockItem> TERRACOTTA_PAVING_SLAB_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("terracotta_paving_slab", InitRockBlocks.TERRACOTTA_PAVING_SLAB);
    public static final DeferredItem<BlockItem> TERRACOTTA_PAVING_WALL_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("terracotta_paving_wall", InitRockBlocks.TERRACOTTA_PAVING_WALL);
    public static final DeferredItem<BlockItem> TERRACOTTA_PAVING_PRESSURE_PLATE_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("terracotta_paving_pressure_plate", InitRockBlocks.TERRACOTTA_PAVING_PRESSURE_PLATE);

    public static final DeferredItem<BlockItem> TERRACOTTA_TILES_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("terracotta_tiles", InitRockBlocks.TERRACOTTA_TILES);
    public static final DeferredItem<BlockItem> TERRACOTTA_TILES_STAIRS_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("terracotta_tiles_stairs", InitRockBlocks.TERRACOTTA_TILES_STAIRS);
    public static final DeferredItem<BlockItem> TERRACOTTA_TILES_SLAB_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("terracotta_tiles_slab", InitRockBlocks.TERRACOTTA_TILES_SLAB);
    public static final DeferredItem<BlockItem> TERRACOTTA_TILES_WALL_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("terracotta_tiles_wall", InitRockBlocks.TERRACOTTA_TILES_WALL);
    public static final DeferredItem<BlockItem> TERRACOTTA_TILES_PRESSURE_PLATE_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("terracotta_tiles_pressure_plate", InitRockBlocks.TERRACOTTA_TILES_PRESSURE_PLATE);

    public static final DeferredItem<BlockItem> TERRACOTTA_BRICKS_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("terracotta_bricks", InitRockBlocks.TERRACOTTA_BRICKS);
    public static final DeferredItem<BlockItem> TERRACOTTA_BRICKS_STAIRS_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("terracotta_bricks_stairs", InitRockBlocks.TERRACOTTA_BRICKS_STAIRS);
    public static final DeferredItem<BlockItem> TERRACOTTA_BRICKS_SLAB_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("terracotta_bricks_slab", InitRockBlocks.TERRACOTTA_BRICKS_SLAB);
    public static final DeferredItem<BlockItem> TERRACOTTA_BRICKS_WALL_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("terracotta_bricks_wall", InitRockBlocks.TERRACOTTA_BRICKS_WALL);
    public static final DeferredItem<BlockItem> TERRACOTTA_BRICKS_PRESSURE_PLATE_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("terracotta_bricks_pressure_plate", InitRockBlocks.TERRACOTTA_BRICKS_PRESSURE_PLATE);

    public static final DeferredItem<BlockItem> TERRACOTTA_LARGE_BRICKS_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("terracotta_large_bricks", InitRockBlocks.TERRACOTTA_LARGE_BRICKS);
    public static final DeferredItem<BlockItem> TERRACOTTA_LARGE_BRICKS_STAIRS_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("terracotta_large_bricks_stairs", InitRockBlocks.TERRACOTTA_LARGE_BRICKS_STAIRS);
    public static final DeferredItem<BlockItem> TERRACOTTA_LARGE_BRICKS_SLAB_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("terracotta_large_bricks_slab", InitRockBlocks.TERRACOTTA_LARGE_BRICKS_SLAB);
    public static final DeferredItem<BlockItem> TERRACOTTA_LARGE_BRICKS_WALL_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("terracotta_large_bricks_wall", InitRockBlocks.TERRACOTTA_LARGE_BRICKS_WALL);
    public static final DeferredItem<BlockItem> TERRACOTTA_LARGE_BRICKS_PRESSURE_PLATE_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("terracotta_large_bricks_pressure_plate", InitRockBlocks.TERRACOTTA_LARGE_BRICKS_PRESSURE_PLATE);

    public static final DeferredItem<BlockItem> TERRACOTTA_PAVING_STONES_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("terracotta_paving_stones", InitRockBlocks.TERRACOTTA_PAVING_STONES);
    public static final DeferredItem<BlockItem> TERRACOTTA_PAVING_STONES_STAIRS_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("terracotta_paving_stones_stairs", InitRockBlocks.TERRACOTTA_PAVING_STONES_STAIRS);
    public static final DeferredItem<BlockItem> TERRACOTTA_PAVING_STONES_SLAB_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("terracotta_paving_stones_slab", InitRockBlocks.TERRACOTTA_PAVING_STONES_SLAB);
    public static final DeferredItem<BlockItem> TERRACOTTA_PAVING_STONES_WALL_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("terracotta_paving_stones_wall", InitRockBlocks.TERRACOTTA_PAVING_STONES_WALL);
    public static final DeferredItem<BlockItem> TERRACOTTA_PAVING_STONES_PRESSURE_PLATE_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("terracotta_paving_stones_pressure_plate", InitRockBlocks.TERRACOTTA_PAVING_STONES_PRESSURE_PLATE);

    public static final DeferredItem<BlockItem> TERRACOTTA_ROOFTILES_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("terracotta_rooftiles", InitRockBlocks.TERRACOTTA_ROOFTILES);
    public static final DeferredItem<BlockItem> TERRACOTTA_ROOFTILES_STAIRS_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("terracotta_rooftiles_stairs", InitRockBlocks.TERRACOTTA_ROOFTILES_STAIRS);
    public static final DeferredItem<BlockItem> TERRACOTTA_ROOFTILES_SLAB_ITEM = ROCK_ITEM_REGISTRY.registerSimpleBlockItem("terracotta_rooftiles_slab", InitRockBlocks.TERRACOTTA_ROOFTILES_SLAB);
}
