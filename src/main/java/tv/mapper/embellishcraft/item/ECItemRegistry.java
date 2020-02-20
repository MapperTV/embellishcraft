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

    public static final RegistryObject<Item> BASALT_COBBLESTONE_ITEM = ITEMS.register("basalt_cobblestone",
        () -> new BlockItem(ECBlockRegistry.BASALT_COBBLESTONE.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> BASALT_COBBLESTONE_STAIRS_ITEM = ITEMS.register("basalt_cobblestone_stairs",
        () -> new BlockItem(ECBlockRegistry.BASALT_COBBLESTONE_STAIRS.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> BASALT_COBBLESTONE_SLAB_ITEM = ITEMS.register("basalt_cobblestone_slab",
        () -> new BlockItem(ECBlockRegistry.BASALT_COBBLESTONE_SLAB.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> BASALT_COBBLESTONE_WALL_ITEM = ITEMS.register("basalt_cobblestone_wall",
        () -> new BlockItem(ECBlockRegistry.BASALT_COBBLESTONE_WALL.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> BASALT_COBBLESTONE_PRESSURE_PLATE_ITEM = ITEMS.register("basalt_cobblestone_pressure_plate",
        () -> new BlockItem(ECBlockRegistry.BASALT_COBBLESTONE_PRESSURE_PLATE.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));

    public static final RegistryObject<Item> BASALT_BRICKS_ITEM = ITEMS.register("basalt_bricks",
        () -> new BlockItem(ECBlockRegistry.BASALT_BRICKS.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> BASALT_BRICKS_STAIRS_ITEM = ITEMS.register("basalt_bricks_stairs",
        () -> new BlockItem(ECBlockRegistry.BASALT_BRICKS_STAIRS.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> BASALT_BRICKS_SLAB_ITEM = ITEMS.register("basalt_bricks_slab",
        () -> new BlockItem(ECBlockRegistry.BASALT_BRICKS_SLAB.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> BASALT_BRICKS_WALL_ITEM = ITEMS.register("basalt_bricks_wall",
        () -> new BlockItem(ECBlockRegistry.BASALT_BRICKS_WALL.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> BASALT_BRICKS_PRESSURE_PLATE_ITEM = ITEMS.register("basalt_bricks_pressure_plate",
        () -> new BlockItem(ECBlockRegistry.BASALT_BRICKS_PRESSURE_PLATE.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));

    public static final RegistryObject<Item> BASALT_LARGE_BRICKS_ITEM = ITEMS.register("basalt_large_bricks",
        () -> new BlockItem(ECBlockRegistry.BASALT_LARGE_BRICKS.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> BASALT_LARGE_BRICKS_STAIRS_ITEM = ITEMS.register("basalt_large_bricks_stairs",
        () -> new BlockItem(ECBlockRegistry.BASALT_LARGE_BRICKS_STAIRS.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> BASALT_LARGE_BRICKS_SLAB_ITEM = ITEMS.register("basalt_large_bricks_slab",
        () -> new BlockItem(ECBlockRegistry.BASALT_LARGE_BRICKS_SLAB.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> BASALT_LARGE_BRICKS_WALL_ITEM = ITEMS.register("basalt_large_bricks_wall",
        () -> new BlockItem(ECBlockRegistry.BASALT_LARGE_BRICKS_WALL.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> BASALT_LARGE_BRICKS_PRESSURE_PLATE_ITEM = ITEMS.register("basalt_large_bricks_pressure_plate",
        () -> new BlockItem(ECBlockRegistry.BASALT_LARGE_BRICKS_PRESSURE_PLATE.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));

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

    public static final RegistryObject<Item> SLATE_COBBLESTONE_ITEM = ITEMS.register("slate_cobblestone",
        () -> new BlockItem(ECBlockRegistry.SLATE_COBBLESTONE.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> SLATE_COBBLESTONE_STAIRS_ITEM = ITEMS.register("slate_cobblestone_stairs",
        () -> new BlockItem(ECBlockRegistry.SLATE_COBBLESTONE_STAIRS.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> SLATE_COBBLESTONE_SLAB_ITEM = ITEMS.register("slate_cobblestone_slab",
        () -> new BlockItem(ECBlockRegistry.SLATE_COBBLESTONE_SLAB.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> SLATE_COBBLESTONE_WALL_ITEM = ITEMS.register("slate_cobblestone_wall",
        () -> new BlockItem(ECBlockRegistry.SLATE_COBBLESTONE_WALL.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> SLATE_COBBLESTONE_PRESSURE_PLATE_ITEM = ITEMS.register("slate_cobblestone_pressure_plate",
        () -> new BlockItem(ECBlockRegistry.SLATE_COBBLESTONE_PRESSURE_PLATE.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));

    public static final RegistryObject<Item> SLATE_BRICKS_ITEM = ITEMS.register("slate_bricks",
        () -> new BlockItem(ECBlockRegistry.SLATE_BRICKS.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> SLATE_BRICKS_STAIRS_ITEM = ITEMS.register("slate_bricks_stairs",
        () -> new BlockItem(ECBlockRegistry.SLATE_BRICKS_STAIRS.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> SLATE_BRICKS_SLAB_ITEM = ITEMS.register("slate_bricks_slab",
        () -> new BlockItem(ECBlockRegistry.SLATE_BRICKS_SLAB.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> SLATE_BRICKS_WALL_ITEM = ITEMS.register("slate_bricks_wall",
        () -> new BlockItem(ECBlockRegistry.SLATE_BRICKS_WALL.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> SLATE_BRICKS_PRESSURE_PLATE_ITEM = ITEMS.register("slate_bricks_pressure_plate",
        () -> new BlockItem(ECBlockRegistry.SLATE_BRICKS_PRESSURE_PLATE.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));

    public static final RegistryObject<Item> SLATE_LARGE_BRICKS_ITEM = ITEMS.register("slate_large_bricks",
        () -> new BlockItem(ECBlockRegistry.SLATE_LARGE_BRICKS.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> SLATE_LARGE_BRICKS_STAIRS_ITEM = ITEMS.register("slate_large_bricks_stairs",
        () -> new BlockItem(ECBlockRegistry.SLATE_LARGE_BRICKS_STAIRS.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> SLATE_LARGE_BRICKS_SLAB_ITEM = ITEMS.register("slate_large_bricks_slab",
        () -> new BlockItem(ECBlockRegistry.SLATE_LARGE_BRICKS_SLAB.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> SLATE_LARGE_BRICKS_WALL_ITEM = ITEMS.register("slate_large_bricks_wall",
        () -> new BlockItem(ECBlockRegistry.SLATE_LARGE_BRICKS_WALL.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> SLATE_LARGE_BRICKS_PRESSURE_PLATE_ITEM = ITEMS.register("slate_large_bricks_pressure_plate",
        () -> new BlockItem(ECBlockRegistry.SLATE_LARGE_BRICKS_PRESSURE_PLATE.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));

    // Marble
    public static final RegistryObject<Item> MARBLE_ITEM = ITEMS.register("marble", () -> new BlockItem(ECBlockRegistry.MARBLE.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> MARBLE_STAIRS_ITEM = ITEMS.register("marble_stairs",
        () -> new BlockItem(ECBlockRegistry.MARBLE_STAIRS.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> MARBLE_SLAB_ITEM = ITEMS.register("marble_slab",
        () -> new BlockItem(ECBlockRegistry.MARBLE_SLAB.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> MARBLE_WALL_ITEM = ITEMS.register("marble_wall",
        () -> new BlockItem(ECBlockRegistry.MARBLE_WALL.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> MARBLE_PRESSURE_PLATE_ITEM = ITEMS.register("marble_pressure_plate",
        () -> new BlockItem(ECBlockRegistry.MARBLE_PRESSURE_PLATE.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));

    public static final RegistryObject<Item> MARBLE_COBBLESTONE_ITEM = ITEMS.register("marble_cobblestone",
        () -> new BlockItem(ECBlockRegistry.MARBLE_COBBLESTONE.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> MARBLE_COBBLESTONE_STAIRS_ITEM = ITEMS.register("marble_cobblestone_stairs",
        () -> new BlockItem(ECBlockRegistry.MARBLE_COBBLESTONE_STAIRS.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> MARBLE_COBBLESTONE_SLAB_ITEM = ITEMS.register("marble_cobblestone_slab",
        () -> new BlockItem(ECBlockRegistry.MARBLE_COBBLESTONE_SLAB.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> MARBLE_COBBLESTONE_WALL_ITEM = ITEMS.register("marble_cobblestone_wall",
        () -> new BlockItem(ECBlockRegistry.MARBLE_COBBLESTONE_WALL.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> MARBLE_COBBLESTONE_PRESSURE_PLATE_ITEM = ITEMS.register("marble_cobblestone_pressure_plate",
        () -> new BlockItem(ECBlockRegistry.MARBLE_COBBLESTONE_PRESSURE_PLATE.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));

    public static final RegistryObject<Item> MARBLE_BRICKS_ITEM = ITEMS.register("marble_bricks",
        () -> new BlockItem(ECBlockRegistry.MARBLE_BRICKS.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> MARBLE_BRICKS_STAIRS_ITEM = ITEMS.register("marble_bricks_stairs",
        () -> new BlockItem(ECBlockRegistry.MARBLE_BRICKS_STAIRS.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> MARBLE_BRICKS_SLAB_ITEM = ITEMS.register("marble_bricks_slab",
        () -> new BlockItem(ECBlockRegistry.MARBLE_BRICKS_SLAB.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> MARBLE_BRICKS_WALL_ITEM = ITEMS.register("marble_bricks_wall",
        () -> new BlockItem(ECBlockRegistry.MARBLE_BRICKS_WALL.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> MARBLE_BRICKS_PRESSURE_PLATE_ITEM = ITEMS.register("marble_bricks_pressure_plate",
        () -> new BlockItem(ECBlockRegistry.MARBLE_BRICKS_PRESSURE_PLATE.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));

    public static final RegistryObject<Item> MARBLE_LARGE_BRICKS_ITEM = ITEMS.register("marble_large_bricks",
        () -> new BlockItem(ECBlockRegistry.MARBLE_LARGE_BRICKS.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> MARBLE_LARGE_BRICKS_STAIRS_ITEM = ITEMS.register("marble_large_bricks_stairs",
        () -> new BlockItem(ECBlockRegistry.MARBLE_LARGE_BRICKS_STAIRS.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> MARBLE_LARGE_BRICKS_SLAB_ITEM = ITEMS.register("marble_large_bricks_slab",
        () -> new BlockItem(ECBlockRegistry.MARBLE_LARGE_BRICKS_SLAB.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> MARBLE_LARGE_BRICKS_WALL_ITEM = ITEMS.register("marble_large_bricks_wall",
        () -> new BlockItem(ECBlockRegistry.MARBLE_LARGE_BRICKS_WALL.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> MARBLE_LARGE_BRICKS_PRESSURE_PLATE_ITEM = ITEMS.register("marble_large_bricks_pressure_plate",
        () -> new BlockItem(ECBlockRegistry.MARBLE_LARGE_BRICKS_PRESSURE_PLATE.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));

    // Gneiss
    public static final RegistryObject<Item> GNEISS_ITEM = ITEMS.register("gneiss", () -> new BlockItem(ECBlockRegistry.GNEISS.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> GNEISS_STAIRS_ITEM = ITEMS.register("gneiss_stairs",
        () -> new BlockItem(ECBlockRegistry.GNEISS_STAIRS.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> GNEISS_SLAB_ITEM = ITEMS.register("gneiss_slab",
        () -> new BlockItem(ECBlockRegistry.GNEISS_SLAB.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> GNEISS_WALL_ITEM = ITEMS.register("gneiss_wall",
        () -> new BlockItem(ECBlockRegistry.GNEISS_WALL.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> GNEISS_PRESSURE_PLATE_ITEM = ITEMS.register("gneiss_pressure_plate",
        () -> new BlockItem(ECBlockRegistry.GNEISS_PRESSURE_PLATE.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));

    public static final RegistryObject<Item> GNEISS_COBBLESTONE_ITEM = ITEMS.register("gneiss_cobblestone",
        () -> new BlockItem(ECBlockRegistry.GNEISS_COBBLESTONE.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> GNEISS_COBBLESTONE_STAIRS_ITEM = ITEMS.register("gneiss_cobblestone_stairs",
        () -> new BlockItem(ECBlockRegistry.GNEISS_COBBLESTONE_STAIRS.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> GNEISS_COBBLESTONE_SLAB_ITEM = ITEMS.register("gneiss_cobblestone_slab",
        () -> new BlockItem(ECBlockRegistry.GNEISS_COBBLESTONE_SLAB.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> GNEISS_COBBLESTONE_WALL_ITEM = ITEMS.register("gneiss_cobblestone_wall",
        () -> new BlockItem(ECBlockRegistry.GNEISS_COBBLESTONE_WALL.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> GNEISS_COBBLESTONE_PRESSURE_PLATE_ITEM = ITEMS.register("gneiss_cobblestone_pressure_plate",
        () -> new BlockItem(ECBlockRegistry.GNEISS_COBBLESTONE_PRESSURE_PLATE.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));

    public static final RegistryObject<Item> GNEISS_BRICKS_ITEM = ITEMS.register("gneiss_bricks",
        () -> new BlockItem(ECBlockRegistry.GNEISS_BRICKS.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> GNEISS_BRICKS_STAIRS_ITEM = ITEMS.register("gneiss_bricks_stairs",
        () -> new BlockItem(ECBlockRegistry.GNEISS_BRICKS_STAIRS.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> GNEISS_BRICKS_SLAB_ITEM = ITEMS.register("gneiss_bricks_slab",
        () -> new BlockItem(ECBlockRegistry.GNEISS_BRICKS_SLAB.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> GNEISS_BRICKS_WALL_ITEM = ITEMS.register("gneiss_bricks_wall",
        () -> new BlockItem(ECBlockRegistry.GNEISS_BRICKS_WALL.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> GNEISS_BRICKS_PRESSURE_PLATE_ITEM = ITEMS.register("gneiss_bricks_pressure_plate",
        () -> new BlockItem(ECBlockRegistry.GNEISS_BRICKS_PRESSURE_PLATE.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));

    public static final RegistryObject<Item> GNEISS_LARGE_BRICKS_ITEM = ITEMS.register("gneiss_large_bricks",
        () -> new BlockItem(ECBlockRegistry.GNEISS_LARGE_BRICKS.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> GNEISS_LARGE_BRICKS_STAIRS_ITEM = ITEMS.register("gneiss_large_bricks_stairs",
        () -> new BlockItem(ECBlockRegistry.GNEISS_LARGE_BRICKS_STAIRS.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> GNEISS_LARGE_BRICKS_SLAB_ITEM = ITEMS.register("gneiss_large_bricks_slab",
        () -> new BlockItem(ECBlockRegistry.GNEISS_LARGE_BRICKS_SLAB.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> GNEISS_LARGE_BRICKS_WALL_ITEM = ITEMS.register("gneiss_large_bricks_wall",
        () -> new BlockItem(ECBlockRegistry.GNEISS_LARGE_BRICKS_WALL.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> GNEISS_LARGE_BRICKS_PRESSURE_PLATE_ITEM = ITEMS.register("gneiss_large_bricks_pressure_plate",
        () -> new BlockItem(ECBlockRegistry.GNEISS_LARGE_BRICKS_PRESSURE_PLATE.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));

    // Jade
    public static final RegistryObject<Item> JADE_ITEM = ITEMS.register("jade", () -> new BlockItem(ECBlockRegistry.JADE.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> JADE_STAIRS_ITEM = ITEMS.register("jade_stairs",
        () -> new BlockItem(ECBlockRegistry.JADE_STAIRS.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> JADE_SLAB_ITEM = ITEMS.register("jade_slab",
        () -> new BlockItem(ECBlockRegistry.JADE_SLAB.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> JADE_WALL_ITEM = ITEMS.register("jade_wall",
        () -> new BlockItem(ECBlockRegistry.JADE_WALL.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> JADE_PRESSURE_PLATE_ITEM = ITEMS.register("jade_pressure_plate",
        () -> new BlockItem(ECBlockRegistry.JADE_PRESSURE_PLATE.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));

    public static final RegistryObject<Item> JADE_COBBLESTONE_ITEM = ITEMS.register("jade_cobblestone",
        () -> new BlockItem(ECBlockRegistry.JADE_COBBLESTONE.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> JADE_COBBLESTONE_STAIRS_ITEM = ITEMS.register("jade_cobblestone_stairs",
        () -> new BlockItem(ECBlockRegistry.JADE_COBBLESTONE_STAIRS.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> JADE_COBBLESTONE_SLAB_ITEM = ITEMS.register("jade_cobblestone_slab",
        () -> new BlockItem(ECBlockRegistry.JADE_COBBLESTONE_SLAB.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> JADE_COBBLESTONE_WALL_ITEM = ITEMS.register("jade_cobblestone_wall",
        () -> new BlockItem(ECBlockRegistry.JADE_COBBLESTONE_WALL.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> JADE_COBBLESTONE_PRESSURE_PLATE_ITEM = ITEMS.register("jade_cobblestone_pressure_plate",
        () -> new BlockItem(ECBlockRegistry.JADE_COBBLESTONE_PRESSURE_PLATE.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));

    public static final RegistryObject<Item> JADE_BRICKS_ITEM = ITEMS.register("jade_bricks",
        () -> new BlockItem(ECBlockRegistry.JADE_BRICKS.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> JADE_BRICKS_STAIRS_ITEM = ITEMS.register("jade_bricks_stairs",
        () -> new BlockItem(ECBlockRegistry.JADE_BRICKS_STAIRS.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> JADE_BRICKS_SLAB_ITEM = ITEMS.register("jade_bricks_slab",
        () -> new BlockItem(ECBlockRegistry.JADE_BRICKS_SLAB.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> JADE_BRICKS_WALL_ITEM = ITEMS.register("jade_bricks_wall",
        () -> new BlockItem(ECBlockRegistry.JADE_BRICKS_WALL.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> JADE_BRICKS_PRESSURE_PLATE_ITEM = ITEMS.register("jade_bricks_pressure_plate",
        () -> new BlockItem(ECBlockRegistry.JADE_BRICKS_PRESSURE_PLATE.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));

    public static final RegistryObject<Item> JADE_LARGE_BRICKS_ITEM = ITEMS.register("jade_large_bricks",
        () -> new BlockItem(ECBlockRegistry.JADE_LARGE_BRICKS.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> JADE_LARGE_BRICKS_STAIRS_ITEM = ITEMS.register("jade_large_bricks_stairs",
        () -> new BlockItem(ECBlockRegistry.JADE_LARGE_BRICKS_STAIRS.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> JADE_LARGE_BRICKS_SLAB_ITEM = ITEMS.register("jade_large_bricks_slab",
        () -> new BlockItem(ECBlockRegistry.JADE_LARGE_BRICKS_SLAB.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> JADE_LARGE_BRICKS_WALL_ITEM = ITEMS.register("jade_large_bricks_wall",
        () -> new BlockItem(ECBlockRegistry.JADE_LARGE_BRICKS_WALL.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> JADE_LARGE_BRICKS_PRESSURE_PLATE_ITEM = ITEMS.register("jade_large_bricks_pressure_plate",
        () -> new BlockItem(ECBlockRegistry.JADE_LARGE_BRICKS_PRESSURE_PLATE.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));

    // Larvikite
    public static final RegistryObject<Item> LARVIKITE_ITEM = ITEMS.register("larvikite",
        () -> new BlockItem(ECBlockRegistry.LARVIKITE.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> LARVIKITE_STAIRS_ITEM = ITEMS.register("larvikite_stairs",
        () -> new BlockItem(ECBlockRegistry.LARVIKITE_STAIRS.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> LARVIKITE_SLAB_ITEM = ITEMS.register("larvikite_slab",
        () -> new BlockItem(ECBlockRegistry.LARVIKITE_SLAB.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> LARVIKITE_WALL_ITEM = ITEMS.register("larvikite_wall",
        () -> new BlockItem(ECBlockRegistry.LARVIKITE_WALL.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> LARVIKITE_PRESSURE_PLATE_ITEM = ITEMS.register("larvikite_pressure_plate",
        () -> new BlockItem(ECBlockRegistry.LARVIKITE_PRESSURE_PLATE.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));

    public static final RegistryObject<Item> LARVIKITE_COBBLESTONE_ITEM = ITEMS.register("larvikite_cobblestone",
        () -> new BlockItem(ECBlockRegistry.LARVIKITE_COBBLESTONE.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> LARVIKITE_COBBLESTONE_STAIRS_ITEM = ITEMS.register("larvikite_cobblestone_stairs",
        () -> new BlockItem(ECBlockRegistry.LARVIKITE_COBBLESTONE_STAIRS.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> LARVIKITE_COBBLESTONE_SLAB_ITEM = ITEMS.register("larvikite_cobblestone_slab",
        () -> new BlockItem(ECBlockRegistry.LARVIKITE_COBBLESTONE_SLAB.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> LARVIKITE_COBBLESTONE_WALL_ITEM = ITEMS.register("larvikite_cobblestone_wall",
        () -> new BlockItem(ECBlockRegistry.LARVIKITE_COBBLESTONE_WALL.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> LARVIKITE_COBBLESTONE_PRESSURE_PLATE_ITEM = ITEMS.register("larvikite_cobblestone_pressure_plate",
        () -> new BlockItem(ECBlockRegistry.LARVIKITE_COBBLESTONE_PRESSURE_PLATE.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));

    public static final RegistryObject<Item> LARVIKITE_BRICKS_ITEM = ITEMS.register("larvikite_bricks",
        () -> new BlockItem(ECBlockRegistry.LARVIKITE_BRICKS.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> LARVIKITE_BRICKS_STAIRS_ITEM = ITEMS.register("larvikite_bricks_stairs",
        () -> new BlockItem(ECBlockRegistry.LARVIKITE_BRICKS_STAIRS.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> LARVIKITE_BRICKS_SLAB_ITEM = ITEMS.register("larvikite_bricks_slab",
        () -> new BlockItem(ECBlockRegistry.LARVIKITE_BRICKS_SLAB.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> LARVIKITE_BRICKS_WALL_ITEM = ITEMS.register("larvikite_bricks_wall",
        () -> new BlockItem(ECBlockRegistry.LARVIKITE_BRICKS_WALL.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> LARVIKITE_BRICKS_PRESSURE_PLATE_ITEM = ITEMS.register("larvikite_bricks_pressure_plate",
        () -> new BlockItem(ECBlockRegistry.LARVIKITE_BRICKS_PRESSURE_PLATE.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));

    public static final RegistryObject<Item> LARVIKITE_LARGE_BRICKS_ITEM = ITEMS.register("larvikite_large_bricks",
        () -> new BlockItem(ECBlockRegistry.LARVIKITE_LARGE_BRICKS.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> LARVIKITE_LARGE_BRICKS_STAIRS_ITEM = ITEMS.register("larvikite_large_bricks_stairs",
        () -> new BlockItem(ECBlockRegistry.LARVIKITE_LARGE_BRICKS_STAIRS.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> LARVIKITE_LARGE_BRICKS_SLAB_ITEM = ITEMS.register("larvikite_large_bricks_slab",
        () -> new BlockItem(ECBlockRegistry.LARVIKITE_LARGE_BRICKS_SLAB.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> LARVIKITE_LARGE_BRICKS_WALL_ITEM = ITEMS.register("larvikite_large_bricks_wall",
        () -> new BlockItem(ECBlockRegistry.LARVIKITE_LARGE_BRICKS_WALL.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> LARVIKITE_LARGE_BRICKS_PRESSURE_PLATE_ITEM = ITEMS.register("larvikite_large_bricks_pressure_plate",
        () -> new BlockItem(ECBlockRegistry.LARVIKITE_LARGE_BRICKS_PRESSURE_PLATE.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));

    public static void init()
    {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}
