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