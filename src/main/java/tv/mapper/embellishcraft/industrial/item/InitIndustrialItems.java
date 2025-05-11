package tv.mapper.embellishcraft.industrial.item;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

import org.apache.commons.lang3.tuple.Pair;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.DyeColor;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import tv.mapper.embellishcraft.core.ECConstants;
import tv.mapper.embellishcraft.industrial.block.InitIndustrialBlocks;

public class InitIndustrialItems
{
    public static final DeferredRegister.Items INDUSTRIAL_ITEM_REGISTRY = DeferredRegister.createItems(ECConstants.MODID);

    public static final Map<DyeColor, DeferredItem<BlockItem>> CORRUGATED_METAL_PLATE_ITEMS = Arrays.stream(DyeColor.values()).map(type -> Pair.of(type, INDUSTRIAL_ITEM_REGISTRY.registerSimpleBlockItem(type.getName() + "_corrugated_metal_plate", InitIndustrialBlocks.CORRUGATED_METAL_PLATE_BLOCKS.get(type)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));
    public static final Map<DyeColor, DeferredItem<BlockItem>> CORRUGATED_METAL_PLATE_STAIRS_ITEMS = Arrays.stream(DyeColor.values()).map(type -> Pair.of(type, INDUSTRIAL_ITEM_REGISTRY.registerSimpleBlockItem(type.getName() + "_corrugated_metal_plate_stairs", InitIndustrialBlocks.CORRUGATED_METAL_PLATE_STAIRS.get(type)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));
    public static final Map<DyeColor, DeferredItem<BlockItem>> CORRUGATED_METAL_PLATE_SLABS_ITEMS = Arrays.stream(DyeColor.values()).map(type -> Pair.of(type, INDUSTRIAL_ITEM_REGISTRY.registerSimpleBlockItem(type.getName() + "_corrugated_metal_plate_slab", InitIndustrialBlocks.CORRUGATED_METAL_PLATE_SLABS.get(type)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));
    public static final Map<DyeColor, DeferredItem<BlockItem>> CORRUGATED_METAL_PLATE_WALLS_ITEMS = Arrays.stream(DyeColor.values()).map(type -> Pair.of(type, INDUSTRIAL_ITEM_REGISTRY.registerSimpleBlockItem(type.getName() + "_corrugated_metal_plate_wall", InitIndustrialBlocks.CORRUGATED_METAL_PLATE_WALLS.get(type)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));
    public static final Map<DyeColor, DeferredItem<BlockItem>> CORRUGATED_METAL_PLATE_PRESSURE_PLATES_ITEMS = Arrays.stream(DyeColor.values()).map(type -> Pair.of(type, INDUSTRIAL_ITEM_REGISTRY.registerSimpleBlockItem(type.getName() + "_corrugated_metal_plate_pressure_plate", InitIndustrialBlocks.CORRUGATED_METAL_PLATE_PRESSURE_PLATES.get(type)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));
    public static final Map<DyeColor, DeferredItem<BlockItem>> CORRUGATED_METAL_PLATE_FENCE_ITEMS = Arrays.stream(DyeColor.values()).map(type -> Pair.of(type, INDUSTRIAL_ITEM_REGISTRY.registerSimpleBlockItem(type.getName() + "_corrugated_metal_plate_fence", InitIndustrialBlocks.CORRUGATED_METAL_PLATE_FENCES.get(type)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));
    public static final Map<DyeColor, DeferredItem<BlockItem>> CORRUGATED_METAL_PLATE_FENCE_GATE_ITEMS = Arrays.stream(DyeColor.values()).map(type -> Pair.of(type, INDUSTRIAL_ITEM_REGISTRY.registerSimpleBlockItem(type.getName() + "_corrugated_metal_plate_fence_gate", InitIndustrialBlocks.CORRUGATED_METAL_PLATE_FENCE_GATES.get(type)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final DeferredItem<BlockItem> DARK_METAL_FLOOR_ITEM = INDUSTRIAL_ITEM_REGISTRY.registerSimpleBlockItem("dark_metal_floor", InitIndustrialBlocks.DARK_METAL_FLOOR);
    public static final DeferredItem<BlockItem> DARK_METAL_FLOOR_STAIRS_ITEM = INDUSTRIAL_ITEM_REGISTRY.registerSimpleBlockItem("dark_metal_floor_stairs", InitIndustrialBlocks.DARK_METAL_FLOOR_STAIRS);
    public static final DeferredItem<BlockItem> DARK_METAL_FLOOR_SLAB_ITEM = INDUSTRIAL_ITEM_REGISTRY.registerSimpleBlockItem("dark_metal_floor_slab", InitIndustrialBlocks.DARK_METAL_FLOOR_SLAB);
    public static final DeferredItem<BlockItem> DARK_METAL_FLOOR_WALL_ITEM = INDUSTRIAL_ITEM_REGISTRY.registerSimpleBlockItem("dark_metal_floor_wall", InitIndustrialBlocks.DARK_METAL_FLOOR_WALL);
    public static final DeferredItem<BlockItem> DARK_METAL_FLOOR_PRESSURE_PLATE_ITEM = INDUSTRIAL_ITEM_REGISTRY.registerSimpleBlockItem("dark_metal_floor_pressure_plate", InitIndustrialBlocks.DARK_METAL_FLOOR_PRESSURE_PLATE);

    public static final DeferredItem<BlockItem> LIGHT_METAL_FLOOR_ITEM = INDUSTRIAL_ITEM_REGISTRY.registerSimpleBlockItem("light_metal_floor", InitIndustrialBlocks.LIGHT_METAL_FLOOR);
    public static final DeferredItem<BlockItem> LIGHT_METAL_FLOOR_STAIRS_ITEM = INDUSTRIAL_ITEM_REGISTRY.registerSimpleBlockItem("light_metal_floor_stairs", InitIndustrialBlocks.LIGHT_METAL_FLOOR_STAIRS);
    public static final DeferredItem<BlockItem> LIGHT_METAL_FLOOR_SLAB_ITEM = INDUSTRIAL_ITEM_REGISTRY.registerSimpleBlockItem("light_metal_floor_slab", InitIndustrialBlocks.LIGHT_METAL_FLOOR_SLAB);
    public static final DeferredItem<BlockItem> LIGHT_METAL_FLOOR_WALL_ITEM = INDUSTRIAL_ITEM_REGISTRY.registerSimpleBlockItem("light_metal_floor_wall", InitIndustrialBlocks.LIGHT_METAL_FLOOR_WALL);
    public static final DeferredItem<BlockItem> LIGHT_METAL_FLOOR_PRESSURE_PLATE_ITEM = INDUSTRIAL_ITEM_REGISTRY.registerSimpleBlockItem("light_metal_floor_pressure_plate", InitIndustrialBlocks.LIGHT_METAL_FLOOR_PRESSURE_PLATE);

    public static final DeferredItem<BlockItem> RUSTY_PLATE_ITEM = INDUSTRIAL_ITEM_REGISTRY.registerSimpleBlockItem("rusty_plate", InitIndustrialBlocks.RUSTY_PLATE);
    public static final DeferredItem<BlockItem> RUSTY_PLATE_STAIRS_ITEM = INDUSTRIAL_ITEM_REGISTRY.registerSimpleBlockItem("rusty_plate_stairs", InitIndustrialBlocks.RUSTY_PLATE_STAIRS);
    public static final DeferredItem<BlockItem> RUSTY_PLATE_SLAB_ITEM = INDUSTRIAL_ITEM_REGISTRY.registerSimpleBlockItem("rusty_plate_slab", InitIndustrialBlocks.RUSTY_PLATE_SLAB);
    public static final DeferredItem<BlockItem> RUSTY_PLATE_WALL_ITEM = INDUSTRIAL_ITEM_REGISTRY.registerSimpleBlockItem("rusty_plate_wall", InitIndustrialBlocks.RUSTY_PLATE_WALL);
    public static final DeferredItem<BlockItem> RUSTY_PLATE_PRESSURE_PLATE_ITEM = INDUSTRIAL_ITEM_REGISTRY.registerSimpleBlockItem("rusty_plate_pressure_plate", InitIndustrialBlocks.RUSTY_PLATE_PRESSURE_PLATE);

    public static final DeferredItem<BlockItem> IRON_BEAM_ITEM = INDUSTRIAL_ITEM_REGISTRY.registerSimpleBlockItem("iron_beam", InitIndustrialBlocks.IRON_BEAM);
    public static final DeferredItem<BlockItem> BOLTED_IRON_BEAM_ITEM = INDUSTRIAL_ITEM_REGISTRY.registerSimpleBlockItem("bolted_iron_beam", InitIndustrialBlocks.BOLTED_IRON_BEAM);
    public static final DeferredItem<BlockItem> IRON_BEAM_JUNCTION_ITEM = INDUSTRIAL_ITEM_REGISTRY.registerSimpleBlockItem("iron_beam_junction", InitIndustrialBlocks.IRON_BEAM_JUNCTION);
    public static final DeferredItem<BlockItem> STEEL_BEAM_ITEM = INDUSTRIAL_ITEM_REGISTRY.registerSimpleBlockItem("steel_beam", InitIndustrialBlocks.STEEL_BEAM);
    public static final DeferredItem<BlockItem> BOLTED_STEEL_BEAM_ITEM = INDUSTRIAL_ITEM_REGISTRY.registerSimpleBlockItem("bolted_steel_beam", InitIndustrialBlocks.BOLTED_STEEL_BEAM);
    public static final DeferredItem<BlockItem> STEEL_BEAM_JUNCTION_ITEM = INDUSTRIAL_ITEM_REGISTRY.registerSimpleBlockItem("steel_beam_junction", InitIndustrialBlocks.STEEL_BEAM_JUNCTION);

    public static final DeferredItem<BlockItem> AIR_DUCT_ITEM = INDUSTRIAL_ITEM_REGISTRY.registerSimpleBlockItem("air_duct", InitIndustrialBlocks.AIR_DUCT);
    public static final DeferredItem<BlockItem> VENT_AIR_DUCT_ITEM = INDUSTRIAL_ITEM_REGISTRY.registerSimpleBlockItem("vent_air_duct", InitIndustrialBlocks.VENT_AIR_DUCT);
    public static final DeferredItem<BlockItem> GRID_AIR_DUCT_ITEM = INDUSTRIAL_ITEM_REGISTRY.registerSimpleBlockItem("grid_air_duct", InitIndustrialBlocks.GRID_AIR_DUCT);

    public static final DeferredItem<BlockItem> BULKHEAD_ITEM = INDUSTRIAL_ITEM_REGISTRY.registerSimpleBlockItem("bulkhead", InitIndustrialBlocks.BULKHEAD);
    public static final DeferredItem<BlockItem> BULKHEAD_TOP_ITEM = INDUSTRIAL_ITEM_REGISTRY.registerSimpleBlockItem("bulkhead_top", InitIndustrialBlocks.BULKHEAD_TOP);

    public static final DeferredItem<BlockItem> STEEL_WALL_LADDER_ITEM = INDUSTRIAL_ITEM_REGISTRY.registerSimpleBlockItem("steel_wall_ladder", InitIndustrialBlocks.STEEL_WALL_LADDER);
    public static final DeferredItem<BlockItem> RUSTY_WALL_LADDER_ITEM = INDUSTRIAL_ITEM_REGISTRY.registerSimpleBlockItem("rusty_wall_ladder", InitIndustrialBlocks.RUSTY_WALL_LADDER);
    public static final DeferredItem<BlockItem> STEEL_RUNGS_ITEM = INDUSTRIAL_ITEM_REGISTRY.registerSimpleBlockItem("steel_rungs", InitIndustrialBlocks.STEEL_RUNGS);
    public static final DeferredItem<BlockItem> RUSTY_RUNGS_ITEM = INDUSTRIAL_ITEM_REGISTRY.registerSimpleBlockItem("rusty_rungs", InitIndustrialBlocks.RUSTY_RUNGS);

    public static final DeferredItem<BlockItem> STEEL_SUSPENDED_STAIRS_ITEM = INDUSTRIAL_ITEM_REGISTRY.registerSimpleBlockItem("steel_suspended_stairs", InitIndustrialBlocks.STEEL_SUSPENDED_STAIRS);
    public static final DeferredItem<BlockItem> RUSTY_SUSPENDED_STAIRS_ITEM = INDUSTRIAL_ITEM_REGISTRY.registerSimpleBlockItem("rusty_suspended_stairs", InitIndustrialBlocks.RUSTY_SUSPENDED_STAIRS);
    public static final DeferredItem<BlockItem> STEEL_LARGE_SUSPENDED_STAIRS_ITEM = INDUSTRIAL_ITEM_REGISTRY.registerSimpleBlockItem("steel_large_suspended_stairs", InitIndustrialBlocks.STEEL_LARGE_SUSPENDED_STAIRS);
    public static final DeferredItem<BlockItem> RUSTY_LARGE_SUSPENDED_STAIRS_ITEM = INDUSTRIAL_ITEM_REGISTRY.registerSimpleBlockItem("rusty_large_suspended_stairs", InitIndustrialBlocks.RUSTY_LARGE_SUSPENDED_STAIRS);

    public static final DeferredItem<BlockItem> STEEL_DOOR_ITEM = INDUSTRIAL_ITEM_REGISTRY.registerSimpleBlockItem("steel_door", InitIndustrialBlocks.STEEL_DOOR);
    public static final DeferredItem<BlockItem> STURDY_STEEL_DOOR_ITEM = INDUSTRIAL_ITEM_REGISTRY.registerSimpleBlockItem("sturdy_steel_door", InitIndustrialBlocks.STURDY_STEEL_DOOR);
    public static final DeferredItem<BlockItem> WARNING_STEEL_DOOR_ITEM = INDUSTRIAL_ITEM_REGISTRY.registerSimpleBlockItem("warning_steel_door", InitIndustrialBlocks.WARNING_STEEL_DOOR);
    public static final DeferredItem<BlockItem> WHITE_STEEL_DOOR_ITEM = INDUSTRIAL_ITEM_REGISTRY.registerSimpleBlockItem("white_steel_door", InitIndustrialBlocks.WHITE_STEEL_DOOR);
    public static final DeferredItem<BlockItem> STURDY_WHITE_STEEL_DOOR_ITEM = INDUSTRIAL_ITEM_REGISTRY.registerSimpleBlockItem("sturdy_white_steel_door", InitIndustrialBlocks.STURDY_WHITE_STEEL_DOOR);
    public static final DeferredItem<BlockItem> WARNING_WHITE_STEEL_DOOR_ITEM = INDUSTRIAL_ITEM_REGISTRY.registerSimpleBlockItem("warning_white_steel_door", InitIndustrialBlocks.WARNING_WHITE_STEEL_DOOR);
    public static final DeferredItem<BlockItem> RUSTY_DOOR_ITEM = INDUSTRIAL_ITEM_REGISTRY.registerSimpleBlockItem("rusty_door", InitIndustrialBlocks.RUSTY_DOOR);
    public static final DeferredItem<BlockItem> STURDY_RUSTY_DOOR_ITEM = INDUSTRIAL_ITEM_REGISTRY.registerSimpleBlockItem("sturdy_rusty_door", InitIndustrialBlocks.STURDY_RUSTY_DOOR);
    public static final DeferredItem<BlockItem> WARNING_RUSTY_DOOR_ITEM = INDUSTRIAL_ITEM_REGISTRY.registerSimpleBlockItem("warning_rusty_door", InitIndustrialBlocks.WARNING_RUSTY_DOOR);

    public static final DeferredItem<BlockItem> IRON_CATWALK_ITEM = INDUSTRIAL_ITEM_REGISTRY.registerSimpleBlockItem("iron_catwalk", InitIndustrialBlocks.IRON_CATWALK);
}
