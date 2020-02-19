package tv.mapper.embellishcraft.item;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import tv.mapper.embellishcraft.ECConstants;
import tv.mapper.embellishcraft.block.ECBlockRegistry;

public class ECItemRegistry
{
    private static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, ECConstants.MODID);

    // Basalt
    public static final RegistryObject<Item> BASALT_ITEM = ITEMS.register("basalt", () -> new BlockItem(ECBlockRegistry.BASALT.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> BASALT_STAIRS_ITEM = ITEMS.register("basalt_stairs",
        () -> new BlockItem(ECBlockRegistry.BASALT_STAIRS.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> BASALT_SLAB_ITEM = ITEMS.register("basalt_slab",
        () -> new BlockItem(ECBlockRegistry.BASALT_SLAB.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> BASALT_WALL_ITEM = ITEMS.register("basalt_wall",
        () -> new BlockItem(ECBlockRegistry.BASALT_WALL.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> BASALT_PRESSURE_PLATE_ITEM = ITEMS.register("basalt_pressure_plate",
        () -> new BlockItem(ECBlockRegistry.BASALT_PRESSURE_PLATE.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));

    // Slate
    public static final RegistryObject<Item> SLATE_ITEM = ITEMS.register("slate", () -> new BlockItem(ECBlockRegistry.SLATE.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> SLATE_STAIRS_ITEM = ITEMS.register("slate_stairs",
        () -> new BlockItem(ECBlockRegistry.SLATE_STAIRS.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> SLATE_SLAB_ITEM = ITEMS.register("slate_slab",
        () -> new BlockItem(ECBlockRegistry.SLATE_SLAB.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> SLATE_WALL_ITEM = ITEMS.register("slate_wall",
        () -> new BlockItem(ECBlockRegistry.SLATE_WALL.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> SLATE_PRESSURE_PLATE_ITEM = ITEMS.register("slate_pressure_plate",
        () -> new BlockItem(ECBlockRegistry.SLATE_PRESSURE_PLATE.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));

    public static void init()
    {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}
