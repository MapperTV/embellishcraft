package tv.mapper.embellishcraft.furniture.item;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

import org.apache.commons.lang3.tuple.Pair;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import tv.mapper.embellishcraft.core.ECConstants;
import tv.mapper.embellishcraft.core.util.McWoods;
import tv.mapper.embellishcraft.furniture.block.InitFurnitureBlocks;

public class InitFurnitureItems
{
    public static final DeferredRegister.Items FURNITURE_ITEM_REGISTRY = DeferredRegister.createItems(ECConstants.MODID);

    public static final Map<McWoods, DeferredItem<BlockItem>> CHAIRS_ITEMS = Arrays.stream(McWoods.values()).map(type -> Pair.of(type, FURNITURE_ITEM_REGISTRY.register(type.getSerializedName() + "_chair", () -> new BlockItem(InitFurnitureBlocks.CHAIR_BLOCKS.get(type).get(), new Item.Properties())))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<McWoods, DeferredItem<BlockItem>> TERRACE_CHAIRS_ITEMS = Arrays.stream(McWoods.values()).map(type -> Pair.of(type, FURNITURE_ITEM_REGISTRY.register(type.getSerializedName() + "_terrace_chair", () -> new BlockItem(InitFurnitureBlocks.TERRACE_CHAIR_BLOCKS.get(type).get(), new Item.Properties())))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<McWoods, DeferredItem<BlockItem>> TABLE_ITEMS = Arrays.stream(McWoods.values()).map(type -> Pair.of(type, FURNITURE_ITEM_REGISTRY.register(type.getSerializedName() + "_table", () -> new BlockItem(InitFurnitureBlocks.TABLE_BLOCKS.get(type).get(), new Item.Properties())))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<McWoods, DeferredItem<BlockItem>> STURDY_TABLE_ITEMS = Arrays.stream(McWoods.values()).map(type -> Pair.of(type, FURNITURE_ITEM_REGISTRY.register(type.getSerializedName() + "_sturdy_table", () -> new BlockItem(InitFurnitureBlocks.STURDY_TABLE_BLOCKS.get(type).get(), new Item.Properties())))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<McWoods, DeferredItem<BlockItem>> TERRACE_TABLE_ITEMS = Arrays.stream(McWoods.values()).map(type -> Pair.of(type, FURNITURE_ITEM_REGISTRY.register(type.getSerializedName() + "_terrace_table", () -> new BlockItem(InitFurnitureBlocks.TERRACE_TABLE_BLOCKS.get(type).get(), new Item.Properties())))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final DeferredItem<Item> STEEL_TERRACE_TABLE_ITEM = FURNITURE_ITEM_REGISTRY.register("steel_terrace_table", () -> new BlockItem(InitFurnitureBlocks.STEEL_TERRACE_TABLE.get(), new Item.Properties()));

    public static final DeferredItem<Item> STEEL_TERRACE_CHAIR_ITEM = FURNITURE_ITEM_REGISTRY.register("steel_terrace_chair", () -> new BlockItem(InitFurnitureBlocks.STEEL_TERRACE_CHAIR.get(), new Item.Properties()));

    public static final Map<DyeColor, DeferredItem<BlockItem>> COUCH_ITEMS = Arrays.stream(DyeColor.values()).map(type -> Pair.of(type, FURNITURE_ITEM_REGISTRY.register(type.getSerializedName() + "_couch", () -> new BlockItem(InitFurnitureBlocks.COUCH_BLOCKS.get(type).get(), new Item.Properties())))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final DeferredItem<Item> PLATE_ITEM = FURNITURE_ITEM_REGISTRY.register("plate", () -> new BlockItem(InitFurnitureBlocks.PLATE.get(), new Item.Properties()));

    // Pillows
    public static final Map<DyeColor, DeferredItem<BlockItem>> PILLOW_ITEMS = Arrays.stream(DyeColor.values()).map(type -> Pair.of(type, FURNITURE_ITEM_REGISTRY.register(type.getSerializedName() + "_pillow", () -> new BlockItem(InitFurnitureBlocks.PILLOW_BLOCKS.get(type).get(), new Item.Properties())))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    // Crates
    public static final Map<McWoods, DeferredItem<BlockItem>> WOODEN_CRATE_ITEMS = Arrays.stream(McWoods.values()).map(type -> Pair.of(type, FURNITURE_ITEM_REGISTRY.register(type.getSerializedName() + "_wooden_crate", () -> new BlockItem(InitFurnitureBlocks.WOODEN_CRATE_BLOCKS.get(type).get(), new Item.Properties().stacksTo(1))))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    // Chests
    // public static final Map<McWoods, DeferredItem<BlockItem>> FANCY_CHEST_ITEMS = Arrays.stream(McWoods.values()).map(type -> Pair.of(type,
    // FURNITURE_ITEM_REGISTRY.register(type.getSerializedName() + "_fancy_chest", () -> new BlockItem(InitFurnitureBlocks.FANCY_CHEST_BLOCKS.get(type).get(), new
    // Item.Properties(), ECConstants.chestBurnTime)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    // public static final DeferredItem<Item> LOCKER_ITEM = FURNITURE_ITEM_REGISTRY.register("locker", () -> new BlockItem(InitFurnitureBlocks.LOCKER.get(), new
    // Item.Properties()));

    // Beds
    // public static final Map<DyeColor, DeferredItem<BlockItem>> OAK_FANCY_BED_ITEMS = Arrays.stream(DyeColor.values()).map(type -> Pair.of(type,
    // FURNITURE_ITEM_REGISTRY.register(type.getSerializedName() + "_oak_fancy_bed", () -> new BlockItem(InitFurnitureBlocks.OAK_FANCY_BED_BLOCKS.get(type).get(), new Item.Properties(),
    // ECConstants.bedBurnTime)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));
    // public static final Map<DyeColor, DeferredItem<BlockItem>> BIRCH_FANCY_BED_ITEMS = Arrays.stream(DyeColor.values()).map(type -> Pair.of(type,
    // FURNITURE_ITEM_REGISTRY.register(type.getSerializedName() + "_birch_fancy_bed", () -> new BlockItem(InitFurnitureBlocks.BIRCH_FANCY_BED_BLOCKS.get(type).get(), new Item.Properties(),
    // ECConstants.bedBurnTime)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));
    // public static final Map<DyeColor, DeferredItem<BlockItem>> SPRUCE_FANCY_BED_ITEMS = Arrays.stream(DyeColor.values()).map(type -> Pair.of(type,
    // FURNITURE_ITEM_REGISTRY.register(type.getSerializedName() + "_spruce_fancy_bed", () -> new BlockItem(InitFurnitureBlocks.SPRUCE_FANCY_BED_BLOCKS.get(type).get(), new Item.Properties(),
    // ECConstants.bedBurnTime)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));
    // public static final Map<DyeColor, DeferredItem<BlockItem>> JUNGLE_FANCY_BED_ITEMS = Arrays.stream(DyeColor.values()).map(type -> Pair.of(type,
    // FURNITURE_ITEM_REGISTRY.register(type.getSerializedName() + "_jungle_fancy_bed", () -> new BlockItem(InitFurnitureBlocks.JUNGLE_FANCY_BED_BLOCKS.get(type).get(), new Item.Properties(),
    // ECConstants.bedBurnTime)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));
    // public static final Map<DyeColor, DeferredItem<BlockItem>> DARK_OAK_FANCY_BED_ITEMS = Arrays.stream(DyeColor.values()).map(type -> Pair.of(type,
    // FURNITURE_ITEM_REGISTRY.register(type.getSerializedName() + "_dark_oak_fancy_bed", () -> new BlockItem(InitFurnitureBlocks.DARK_OAK_FANCY_BED_BLOCKS.get(type).get(), new Item.Properties(),
    // ECConstants.bedBurnTime)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));
    // public static final Map<DyeColor, DeferredItem<BlockItem>> ACACIA_FANCY_BED_ITEMS = Arrays.stream(DyeColor.values()).map(type -> Pair.of(type,
    // FURNITURE_ITEM_REGISTRY.register(type.getSerializedName() + "_acacia_fancy_bed", () -> new BlockItem(InitFurnitureBlocks.ACACIA_FANCY_BED_BLOCKS.get(type).get(), new Item.Properties(),
    // ECConstants.bedBurnTime)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));
    // public static final Map<DyeColor, DeferredItem<BlockItem>> WARPED_FANCY_BED_ITEMS = Arrays.stream(DyeColor.values()).map(type -> Pair.of(type,
    // FURNITURE_ITEM_REGISTRY.register(type.getSerializedName() + "_warped_fancy_bed", () -> new BlockItem(InitFurnitureBlocks.WARPED_FANCY_BED_BLOCKS.get(type).get(), new
    // Item.Properties())))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));
    // public static final Map<DyeColor, DeferredItem<BlockItem>> CRIMSON_FANCY_BED_ITEMS = Arrays.stream(DyeColor.values()).map(type -> Pair.of(type,
    // FURNITURE_ITEM_REGISTRY.register(type.getSerializedName() + "_crimson_fancy_bed", () -> new BlockItem(InitFurnitureBlocks.CRIMSON_FANCY_BED_BLOCKS.get(type).get(), new
    // Item.Properties())))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));
}
