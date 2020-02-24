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
    public static final RegistryObject<Item> BASALT_SLAB_ITEM = ITEMS.register("basalt_slab", () -> new BlockItem(ECBlockRegistry.BASALT_SLAB.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> BASALT_WALL_ITEM = ITEMS.register("basalt_wall", () -> new BlockItem(ECBlockRegistry.BASALT_WALL.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> BASALT_PRESSURE_PLATE_ITEM = ITEMS.register("basalt_pressure_plate",
        () -> new BlockItem(ECBlockRegistry.BASALT_PRESSURE_PLATE.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> BASALT_BUTTON_ITEM = ITEMS.register("basalt_button",
        () -> new BlockItem(ECBlockRegistry.BASALT_BUTTON.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));

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

    public static final RegistryObject<Item> SMOOTH_BASALT_ITEM = ITEMS.register("smooth_basalt",
        () -> new BlockItem(ECBlockRegistry.SMOOTH_BASALT.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> SMOOTH_BASALT_STAIRS_ITEM = ITEMS.register("smooth_basalt_stairs",
        () -> new BlockItem(ECBlockRegistry.SMOOTH_BASALT_STAIRS.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> SMOOTH_BASALT_SLAB_ITEM = ITEMS.register("smooth_basalt_slab",
        () -> new BlockItem(ECBlockRegistry.SMOOTH_BASALT_SLAB.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> SMOOTH_BASALT_WALL_ITEM = ITEMS.register("smooth_basalt_wall",
        () -> new BlockItem(ECBlockRegistry.SMOOTH_BASALT_WALL.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> SMOOTH_BASALT_PRESSURE_PLATE_ITEM = ITEMS.register("smooth_basalt_pressure_plate",
        () -> new BlockItem(ECBlockRegistry.SMOOTH_BASALT_PRESSURE_PLATE.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));

    public static final RegistryObject<Item> POLISHED_BASALT_ITEM = ITEMS.register("polished_basalt",
        () -> new BlockItem(ECBlockRegistry.POLISHED_BASALT.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> POLISHED_BASALT_STAIRS_ITEM = ITEMS.register("polished_basalt_stairs",
        () -> new BlockItem(ECBlockRegistry.POLISHED_BASALT_STAIRS.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> POLISHED_BASALT_SLAB_ITEM = ITEMS.register("polished_basalt_slab",
        () -> new BlockItem(ECBlockRegistry.POLISHED_BASALT_SLAB.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> POLISHED_BASALT_WALL_ITEM = ITEMS.register("polished_basalt_wall",
        () -> new BlockItem(ECBlockRegistry.POLISHED_BASALT_WALL.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> POLISHED_BASALT_PRESSURE_PLATE_ITEM = ITEMS.register("polished_basalt_pressure_plate",
        () -> new BlockItem(ECBlockRegistry.POLISHED_BASALT_PRESSURE_PLATE.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));

    public static final RegistryObject<Item> BASALT_PAVING_ITEM = ITEMS.register("basalt_paving",
        () -> new BlockItem(ECBlockRegistry.BASALT_PAVING.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> BASALT_PAVING_STAIRS_ITEM = ITEMS.register("basalt_paving_stairs",
        () -> new BlockItem(ECBlockRegistry.BASALT_PAVING_STAIRS.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> BASALT_PAVING_SLAB_ITEM = ITEMS.register("basalt_paving_slab",
        () -> new BlockItem(ECBlockRegistry.BASALT_PAVING_SLAB.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> BASALT_PAVING_WALL_ITEM = ITEMS.register("basalt_paving_wall",
        () -> new BlockItem(ECBlockRegistry.BASALT_PAVING_WALL.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> BASALT_PAVING_PRESSURE_PLATE_ITEM = ITEMS.register("basalt_paving_pressure_plate",
        () -> new BlockItem(ECBlockRegistry.BASALT_PAVING_PRESSURE_PLATE.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));

    public static final RegistryObject<Item> BASALT_TILES_ITEM = ITEMS.register("basalt_tiles",
        () -> new BlockItem(ECBlockRegistry.BASALT_TILES.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> BASALT_TILES_STAIRS_ITEM = ITEMS.register("basalt_tiles_stairs",
        () -> new BlockItem(ECBlockRegistry.BASALT_TILES_STAIRS.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> BASALT_TILES_SLAB_ITEM = ITEMS.register("basalt_tiles_slab",
        () -> new BlockItem(ECBlockRegistry.BASALT_TILES_SLAB.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> BASALT_TILES_WALL_ITEM = ITEMS.register("basalt_tiles_wall",
        () -> new BlockItem(ECBlockRegistry.BASALT_TILES_WALL.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> BASALT_TILES_PRESSURE_PLATE_ITEM = ITEMS.register("basalt_tiles_pressure_plate",
        () -> new BlockItem(ECBlockRegistry.BASALT_TILES_PRESSURE_PLATE.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));

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

    public static final RegistryObject<Item> BASALT_ORNAMENT_ITEM = ITEMS.register("basalt_ornament",
        () -> new BlockItem(ECBlockRegistry.BASALT_ORNAMENT.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> BASALT_ORNAMENT_PRESSURE_PLATE_ITEM = ITEMS.register("basalt_ornament_pressure_plate",
        () -> new BlockItem(ECBlockRegistry.BASALT_ORNAMENT_PRESSURE_PLATE.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));

    // Slate
    public static final RegistryObject<Item> SLATE_ITEM = ITEMS.register("slate", () -> new BlockItem(ECBlockRegistry.SLATE.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> SLATE_STAIRS_ITEM = ITEMS.register("slate_stairs",
        () -> new BlockItem(ECBlockRegistry.SLATE_STAIRS.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> SLATE_SLAB_ITEM = ITEMS.register("slate_slab", () -> new BlockItem(ECBlockRegistry.SLATE_SLAB.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> SLATE_WALL_ITEM = ITEMS.register("slate_wall", () -> new BlockItem(ECBlockRegistry.SLATE_WALL.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> SLATE_PRESSURE_PLATE_ITEM = ITEMS.register("slate_pressure_plate",
        () -> new BlockItem(ECBlockRegistry.SLATE_PRESSURE_PLATE.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> SLATE_BUTTON_ITEM = ITEMS.register("slate_button",
        () -> new BlockItem(ECBlockRegistry.SLATE_BUTTON.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));

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

    public static final RegistryObject<Item> SMOOTH_SLATE_ITEM = ITEMS.register("smooth_slate",
        () -> new BlockItem(ECBlockRegistry.SMOOTH_SLATE.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> SMOOTH_SLATE_STAIRS_ITEM = ITEMS.register("smooth_slate_stairs",
        () -> new BlockItem(ECBlockRegistry.SMOOTH_SLATE_STAIRS.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> SMOOTH_SLATE_SLAB_ITEM = ITEMS.register("smooth_slate_slab",
        () -> new BlockItem(ECBlockRegistry.SMOOTH_SLATE_SLAB.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> SMOOTH_SLATE_WALL_ITEM = ITEMS.register("smooth_slate_wall",
        () -> new BlockItem(ECBlockRegistry.SMOOTH_SLATE_WALL.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> SMOOTH_SLATE_PRESSURE_PLATE_ITEM = ITEMS.register("smooth_slate_pressure_plate",
        () -> new BlockItem(ECBlockRegistry.SMOOTH_SLATE_PRESSURE_PLATE.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));

    public static final RegistryObject<Item> POLISHED_SLATE_ITEM = ITEMS.register("polished_slate",
        () -> new BlockItem(ECBlockRegistry.POLISHED_SLATE.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> POLISHED_SLATE_STAIRS_ITEM = ITEMS.register("polished_slate_stairs",
        () -> new BlockItem(ECBlockRegistry.POLISHED_SLATE_STAIRS.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> POLISHED_SLATE_SLAB_ITEM = ITEMS.register("polished_slate_slab",
        () -> new BlockItem(ECBlockRegistry.POLISHED_SLATE_SLAB.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> POLISHED_SLATE_WALL_ITEM = ITEMS.register("polished_slate_wall",
        () -> new BlockItem(ECBlockRegistry.POLISHED_SLATE_WALL.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> POLISHED_SLATE_PRESSURE_PLATE_ITEM = ITEMS.register("polished_slate_pressure_plate",
        () -> new BlockItem(ECBlockRegistry.POLISHED_SLATE_PRESSURE_PLATE.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));

    public static final RegistryObject<Item> SLATE_PAVING_ITEM = ITEMS.register("slate_paving",
        () -> new BlockItem(ECBlockRegistry.SLATE_PAVING.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> SLATE_PAVING_STAIRS_ITEM = ITEMS.register("slate_paving_stairs",
        () -> new BlockItem(ECBlockRegistry.SLATE_PAVING_STAIRS.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> SLATE_PAVING_SLAB_ITEM = ITEMS.register("slate_paving_slab",
        () -> new BlockItem(ECBlockRegistry.SLATE_PAVING_SLAB.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> SLATE_PAVING_WALL_ITEM = ITEMS.register("slate_paving_wall",
        () -> new BlockItem(ECBlockRegistry.SLATE_PAVING_WALL.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> SLATE_PAVING_PRESSURE_PLATE_ITEM = ITEMS.register("slate_paving_pressure_plate",
        () -> new BlockItem(ECBlockRegistry.SLATE_PAVING_PRESSURE_PLATE.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));

    public static final RegistryObject<Item> SLATE_TILES_ITEM = ITEMS.register("slate_tiles", () -> new BlockItem(ECBlockRegistry.SLATE_TILES.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> SLATE_TILES_STAIRS_ITEM = ITEMS.register("slate_tiles_stairs",
        () -> new BlockItem(ECBlockRegistry.SLATE_TILES_STAIRS.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> SLATE_TILES_SLAB_ITEM = ITEMS.register("slate_tiles_slab",
        () -> new BlockItem(ECBlockRegistry.SLATE_TILES_SLAB.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> SLATE_TILES_WALL_ITEM = ITEMS.register("slate_tiles_wall",
        () -> new BlockItem(ECBlockRegistry.SLATE_TILES_WALL.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> SLATE_TILES_PRESSURE_PLATE_ITEM = ITEMS.register("slate_tiles_pressure_plate",
        () -> new BlockItem(ECBlockRegistry.SLATE_TILES_PRESSURE_PLATE.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));

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

    public static final RegistryObject<Item> SLATE_ORNAMENT_ITEM = ITEMS.register("slate_ornament",
        () -> new BlockItem(ECBlockRegistry.SLATE_ORNAMENT.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> SLATE_ORNAMENT_PRESSURE_PLATE_ITEM = ITEMS.register("slate_ornament_pressure_plate",
        () -> new BlockItem(ECBlockRegistry.SLATE_ORNAMENT_PRESSURE_PLATE.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));

    // Marble
    public static final RegistryObject<Item> MARBLE_ITEM = ITEMS.register("marble", () -> new BlockItem(ECBlockRegistry.MARBLE.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> MARBLE_STAIRS_ITEM = ITEMS.register("marble_stairs",
        () -> new BlockItem(ECBlockRegistry.MARBLE_STAIRS.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> MARBLE_SLAB_ITEM = ITEMS.register("marble_slab", () -> new BlockItem(ECBlockRegistry.MARBLE_SLAB.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> MARBLE_WALL_ITEM = ITEMS.register("marble_wall", () -> new BlockItem(ECBlockRegistry.MARBLE_WALL.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> MARBLE_PRESSURE_PLATE_ITEM = ITEMS.register("marble_pressure_plate",
        () -> new BlockItem(ECBlockRegistry.MARBLE_PRESSURE_PLATE.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> MARBLE_BUTTON_ITEM = ITEMS.register("marble_button",
        () -> new BlockItem(ECBlockRegistry.MARBLE_BUTTON.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));

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

    public static final RegistryObject<Item> SMOOTH_MARBLE_ITEM = ITEMS.register("smooth_marble",
        () -> new BlockItem(ECBlockRegistry.SMOOTH_MARBLE.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> SMOOTH_MARBLE_STAIRS_ITEM = ITEMS.register("smooth_marble_stairs",
        () -> new BlockItem(ECBlockRegistry.SMOOTH_MARBLE_STAIRS.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> SMOOTH_MARBLE_SLAB_ITEM = ITEMS.register("smooth_marble_slab",
        () -> new BlockItem(ECBlockRegistry.SMOOTH_MARBLE_SLAB.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> SMOOTH_MARBLE_WALL_ITEM = ITEMS.register("smooth_marble_wall",
        () -> new BlockItem(ECBlockRegistry.SMOOTH_MARBLE_WALL.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> SMOOTH_MARBLE_PRESSURE_PLATE_ITEM = ITEMS.register("smooth_marble_pressure_plate",
        () -> new BlockItem(ECBlockRegistry.SMOOTH_MARBLE_PRESSURE_PLATE.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));

    public static final RegistryObject<Item> POLISHED_MARBLE_ITEM = ITEMS.register("polished_marble",
        () -> new BlockItem(ECBlockRegistry.POLISHED_MARBLE.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> POLISHED_MARBLE_STAIRS_ITEM = ITEMS.register("polished_marble_stairs",
        () -> new BlockItem(ECBlockRegistry.POLISHED_MARBLE_STAIRS.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> POLISHED_MARBLE_SLAB_ITEM = ITEMS.register("polished_marble_slab",
        () -> new BlockItem(ECBlockRegistry.POLISHED_MARBLE_SLAB.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> POLISHED_MARBLE_WALL_ITEM = ITEMS.register("polished_marble_wall",
        () -> new BlockItem(ECBlockRegistry.POLISHED_MARBLE_WALL.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> POLISHED_MARBLE_PRESSURE_PLATE_ITEM = ITEMS.register("polished_marble_pressure_plate",
        () -> new BlockItem(ECBlockRegistry.POLISHED_MARBLE_PRESSURE_PLATE.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));

    public static final RegistryObject<Item> MARBLE_PAVING_ITEM = ITEMS.register("marble_paving",
        () -> new BlockItem(ECBlockRegistry.MARBLE_PAVING.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> MARBLE_PAVING_STAIRS_ITEM = ITEMS.register("marble_paving_stairs",
        () -> new BlockItem(ECBlockRegistry.MARBLE_PAVING_STAIRS.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> MARBLE_PAVING_SLAB_ITEM = ITEMS.register("marble_paving_slab",
        () -> new BlockItem(ECBlockRegistry.MARBLE_PAVING_SLAB.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> MARBLE_PAVING_WALL_ITEM = ITEMS.register("marble_paving_wall",
        () -> new BlockItem(ECBlockRegistry.MARBLE_PAVING_WALL.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> MARBLE_PAVING_PRESSURE_PLATE_ITEM = ITEMS.register("marble_paving_pressure_plate",
        () -> new BlockItem(ECBlockRegistry.MARBLE_PAVING_PRESSURE_PLATE.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));

    public static final RegistryObject<Item> MARBLE_TILES_ITEM = ITEMS.register("marble_tiles",
        () -> new BlockItem(ECBlockRegistry.MARBLE_TILES.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> MARBLE_TILES_STAIRS_ITEM = ITEMS.register("marble_tiles_stairs",
        () -> new BlockItem(ECBlockRegistry.MARBLE_TILES_STAIRS.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> MARBLE_TILES_SLAB_ITEM = ITEMS.register("marble_tiles_slab",
        () -> new BlockItem(ECBlockRegistry.MARBLE_TILES_SLAB.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> MARBLE_TILES_WALL_ITEM = ITEMS.register("marble_tiles_wall",
        () -> new BlockItem(ECBlockRegistry.MARBLE_TILES_WALL.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> MARBLE_TILES_PRESSURE_PLATE_ITEM = ITEMS.register("marble_tiles_pressure_plate",
        () -> new BlockItem(ECBlockRegistry.MARBLE_TILES_PRESSURE_PLATE.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));

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

    public static final RegistryObject<Item> MARBLE_ORNAMENT_ITEM = ITEMS.register("marble_ornament",
        () -> new BlockItem(ECBlockRegistry.MARBLE_ORNAMENT.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> MARBLE_ORNAMENT_PRESSURE_PLATE_ITEM = ITEMS.register("marble_ornament_pressure_plate",
        () -> new BlockItem(ECBlockRegistry.MARBLE_ORNAMENT_PRESSURE_PLATE.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));

    // Gneiss
    public static final RegistryObject<Item> GNEISS_ITEM = ITEMS.register("gneiss", () -> new BlockItem(ECBlockRegistry.GNEISS.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> GNEISS_STAIRS_ITEM = ITEMS.register("gneiss_stairs",
        () -> new BlockItem(ECBlockRegistry.GNEISS_STAIRS.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> GNEISS_SLAB_ITEM = ITEMS.register("gneiss_slab", () -> new BlockItem(ECBlockRegistry.GNEISS_SLAB.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> GNEISS_WALL_ITEM = ITEMS.register("gneiss_wall", () -> new BlockItem(ECBlockRegistry.GNEISS_WALL.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> GNEISS_PRESSURE_PLATE_ITEM = ITEMS.register("gneiss_pressure_plate",
        () -> new BlockItem(ECBlockRegistry.GNEISS_PRESSURE_PLATE.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> GNEISS_BUTTON_ITEM = ITEMS.register("gneiss_button",
        () -> new BlockItem(ECBlockRegistry.GNEISS_BUTTON.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));

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

    public static final RegistryObject<Item> SMOOTH_GNEISS_ITEM = ITEMS.register("smooth_gneiss",
        () -> new BlockItem(ECBlockRegistry.SMOOTH_GNEISS.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> SMOOTH_GNEISS_STAIRS_ITEM = ITEMS.register("smooth_gneiss_stairs",
        () -> new BlockItem(ECBlockRegistry.SMOOTH_GNEISS_STAIRS.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> SMOOTH_GNEISS_SLAB_ITEM = ITEMS.register("smooth_gneiss_slab",
        () -> new BlockItem(ECBlockRegistry.SMOOTH_GNEISS_SLAB.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> SMOOTH_GNEISS_WALL_ITEM = ITEMS.register("smooth_gneiss_wall",
        () -> new BlockItem(ECBlockRegistry.SMOOTH_GNEISS_WALL.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> SMOOTH_GNEISS_PRESSURE_PLATE_ITEM = ITEMS.register("smooth_gneiss_pressure_plate",
        () -> new BlockItem(ECBlockRegistry.SMOOTH_GNEISS_PRESSURE_PLATE.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));

    public static final RegistryObject<Item> POLISHED_GNEISS_ITEM = ITEMS.register("polished_gneiss",
        () -> new BlockItem(ECBlockRegistry.POLISHED_GNEISS.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> POLISHED_GNEISS_STAIRS_ITEM = ITEMS.register("polished_gneiss_stairs",
        () -> new BlockItem(ECBlockRegistry.POLISHED_GNEISS_STAIRS.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> POLISHED_GNEISS_SLAB_ITEM = ITEMS.register("polished_gneiss_slab",
        () -> new BlockItem(ECBlockRegistry.POLISHED_GNEISS_SLAB.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> POLISHED_GNEISS_WALL_ITEM = ITEMS.register("polished_gneiss_wall",
        () -> new BlockItem(ECBlockRegistry.POLISHED_GNEISS_WALL.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> POLISHED_GNEISS_PRESSURE_PLATE_ITEM = ITEMS.register("polished_gneiss_pressure_plate",
        () -> new BlockItem(ECBlockRegistry.POLISHED_GNEISS_PRESSURE_PLATE.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));

    public static final RegistryObject<Item> GNEISS_PAVING_ITEM = ITEMS.register("gneiss_paving",
        () -> new BlockItem(ECBlockRegistry.GNEISS_PAVING.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> GNEISS_PAVING_STAIRS_ITEM = ITEMS.register("gneiss_paving_stairs",
        () -> new BlockItem(ECBlockRegistry.GNEISS_PAVING_STAIRS.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> GNEISS_PAVING_SLAB_ITEM = ITEMS.register("gneiss_paving_slab",
        () -> new BlockItem(ECBlockRegistry.GNEISS_PAVING_SLAB.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> GNEISS_PAVING_WALL_ITEM = ITEMS.register("gneiss_paving_wall",
        () -> new BlockItem(ECBlockRegistry.GNEISS_PAVING_WALL.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> GNEISS_PAVING_PRESSURE_PLATE_ITEM = ITEMS.register("gneiss_paving_pressure_plate",
        () -> new BlockItem(ECBlockRegistry.GNEISS_PAVING_PRESSURE_PLATE.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));

    public static final RegistryObject<Item> GNEISS_TILES_ITEM = ITEMS.register("gneiss_tiles",
        () -> new BlockItem(ECBlockRegistry.GNEISS_TILES.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> GNEISS_TILES_STAIRS_ITEM = ITEMS.register("gneiss_tiles_stairs",
        () -> new BlockItem(ECBlockRegistry.GNEISS_TILES_STAIRS.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> GNEISS_TILES_SLAB_ITEM = ITEMS.register("gneiss_tiles_slab",
        () -> new BlockItem(ECBlockRegistry.GNEISS_TILES_SLAB.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> GNEISS_TILES_WALL_ITEM = ITEMS.register("gneiss_tiles_wall",
        () -> new BlockItem(ECBlockRegistry.GNEISS_TILES_WALL.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> GNEISS_TILES_PRESSURE_PLATE_ITEM = ITEMS.register("gneiss_tiles_pressure_plate",
        () -> new BlockItem(ECBlockRegistry.GNEISS_TILES_PRESSURE_PLATE.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));

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

    public static final RegistryObject<Item> GNEISS_ORNAMENT_ITEM = ITEMS.register("gneiss_ornament",
        () -> new BlockItem(ECBlockRegistry.GNEISS_ORNAMENT.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> GNEISS_ORNAMENT_PRESSURE_PLATE_ITEM = ITEMS.register("gneiss_ornament_pressure_plate",
        () -> new BlockItem(ECBlockRegistry.GNEISS_ORNAMENT_PRESSURE_PLATE.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));

    // Jade
    public static final RegistryObject<Item> JADE_ITEM = ITEMS.register("jade", () -> new BlockItem(ECBlockRegistry.JADE.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> JADE_STAIRS_ITEM = ITEMS.register("jade_stairs", () -> new BlockItem(ECBlockRegistry.JADE_STAIRS.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> JADE_SLAB_ITEM = ITEMS.register("jade_slab", () -> new BlockItem(ECBlockRegistry.JADE_SLAB.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> JADE_WALL_ITEM = ITEMS.register("jade_wall", () -> new BlockItem(ECBlockRegistry.JADE_WALL.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> JADE_PRESSURE_PLATE_ITEM = ITEMS.register("jade_pressure_plate",
        () -> new BlockItem(ECBlockRegistry.JADE_PRESSURE_PLATE.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> JADE_BUTTON_ITEM = ITEMS.register("jade_button", () -> new BlockItem(ECBlockRegistry.JADE_BUTTON.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));

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

    public static final RegistryObject<Item> SMOOTH_JADE_ITEM = ITEMS.register("smooth_jade", () -> new BlockItem(ECBlockRegistry.SMOOTH_JADE.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> SMOOTH_JADE_STAIRS_ITEM = ITEMS.register("smooth_jade_stairs",
        () -> new BlockItem(ECBlockRegistry.SMOOTH_JADE_STAIRS.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> SMOOTH_JADE_SLAB_ITEM = ITEMS.register("smooth_jade_slab",
        () -> new BlockItem(ECBlockRegistry.SMOOTH_JADE_SLAB.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> SMOOTH_JADE_WALL_ITEM = ITEMS.register("smooth_jade_wall",
        () -> new BlockItem(ECBlockRegistry.SMOOTH_JADE_WALL.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> SMOOTH_JADE_PRESSURE_PLATE_ITEM = ITEMS.register("smooth_jade_pressure_plate",
        () -> new BlockItem(ECBlockRegistry.SMOOTH_JADE_PRESSURE_PLATE.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));

    public static final RegistryObject<Item> POLISHED_JADE_ITEM = ITEMS.register("polished_jade",
        () -> new BlockItem(ECBlockRegistry.POLISHED_JADE.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> POLISHED_JADE_STAIRS_ITEM = ITEMS.register("polished_jade_stairs",
        () -> new BlockItem(ECBlockRegistry.POLISHED_JADE_STAIRS.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> POLISHED_JADE_SLAB_ITEM = ITEMS.register("polished_jade_slab",
        () -> new BlockItem(ECBlockRegistry.POLISHED_JADE_SLAB.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> POLISHED_JADE_WALL_ITEM = ITEMS.register("polished_jade_wall",
        () -> new BlockItem(ECBlockRegistry.POLISHED_JADE_WALL.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> POLISHED_JADE_PRESSURE_PLATE_ITEM = ITEMS.register("polished_jade_pressure_plate",
        () -> new BlockItem(ECBlockRegistry.POLISHED_JADE_PRESSURE_PLATE.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));

    public static final RegistryObject<Item> JADE_PAVING_ITEM = ITEMS.register("jade_paving", () -> new BlockItem(ECBlockRegistry.JADE_PAVING.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> JADE_PAVING_STAIRS_ITEM = ITEMS.register("jade_paving_stairs",
        () -> new BlockItem(ECBlockRegistry.JADE_PAVING_STAIRS.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> JADE_PAVING_SLAB_ITEM = ITEMS.register("jade_paving_slab",
        () -> new BlockItem(ECBlockRegistry.JADE_PAVING_SLAB.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> JADE_PAVING_WALL_ITEM = ITEMS.register("jade_paving_wall",
        () -> new BlockItem(ECBlockRegistry.JADE_PAVING_WALL.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> JADE_PAVING_PRESSURE_PLATE_ITEM = ITEMS.register("jade_paving_pressure_plate",
        () -> new BlockItem(ECBlockRegistry.JADE_PAVING_PRESSURE_PLATE.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));

    public static final RegistryObject<Item> JADE_TILES_ITEM = ITEMS.register("jade_tiles", () -> new BlockItem(ECBlockRegistry.JADE_TILES.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> JADE_TILES_STAIRS_ITEM = ITEMS.register("jade_tiles_stairs",
        () -> new BlockItem(ECBlockRegistry.JADE_TILES_STAIRS.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> JADE_TILES_SLAB_ITEM = ITEMS.register("jade_tiles_slab",
        () -> new BlockItem(ECBlockRegistry.JADE_TILES_SLAB.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> JADE_TILES_WALL_ITEM = ITEMS.register("jade_tiles_wall",
        () -> new BlockItem(ECBlockRegistry.JADE_TILES_WALL.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> JADE_TILES_PRESSURE_PLATE_ITEM = ITEMS.register("jade_tiles_pressure_plate",
        () -> new BlockItem(ECBlockRegistry.JADE_TILES_PRESSURE_PLATE.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));

    public static final RegistryObject<Item> JADE_BRICKS_ITEM = ITEMS.register("jade_bricks", () -> new BlockItem(ECBlockRegistry.JADE_BRICKS.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
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

    public static final RegistryObject<Item> JADE_ORNAMENT_ITEM = ITEMS.register("jade_ornament",
        () -> new BlockItem(ECBlockRegistry.JADE_ORNAMENT.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> JADE_ORNAMENT_PRESSURE_PLATE_ITEM = ITEMS.register("jade_ornament_pressure_plate",
        () -> new BlockItem(ECBlockRegistry.JADE_ORNAMENT_PRESSURE_PLATE.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));

    // Larvikite
    public static final RegistryObject<Item> LARVIKITE_ITEM = ITEMS.register("larvikite", () -> new BlockItem(ECBlockRegistry.LARVIKITE.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> LARVIKITE_STAIRS_ITEM = ITEMS.register("larvikite_stairs",
        () -> new BlockItem(ECBlockRegistry.LARVIKITE_STAIRS.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> LARVIKITE_SLAB_ITEM = ITEMS.register("larvikite_slab",
        () -> new BlockItem(ECBlockRegistry.LARVIKITE_SLAB.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> LARVIKITE_WALL_ITEM = ITEMS.register("larvikite_wall",
        () -> new BlockItem(ECBlockRegistry.LARVIKITE_WALL.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> LARVIKITE_PRESSURE_PLATE_ITEM = ITEMS.register("larvikite_pressure_plate",
        () -> new BlockItem(ECBlockRegistry.LARVIKITE_PRESSURE_PLATE.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> LARVIKITE_BUTTON_ITEM = ITEMS.register("larvikite_button",
        () -> new BlockItem(ECBlockRegistry.LARVIKITE_BUTTON.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));

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

    public static final RegistryObject<Item> SMOOTH_LARVIKITE_ITEM = ITEMS.register("smooth_larvikite",
        () -> new BlockItem(ECBlockRegistry.SMOOTH_LARVIKITE.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> SMOOTH_LARVIKITE_STAIRS_ITEM = ITEMS.register("smooth_larvikite_stairs",
        () -> new BlockItem(ECBlockRegistry.SMOOTH_LARVIKITE_STAIRS.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> SMOOTH_LARVIKITE_SLAB_ITEM = ITEMS.register("smooth_larvikite_slab",
        () -> new BlockItem(ECBlockRegistry.SMOOTH_LARVIKITE_SLAB.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> SMOOTH_LARVIKITE_WALL_ITEM = ITEMS.register("smooth_larvikite_wall",
        () -> new BlockItem(ECBlockRegistry.SMOOTH_LARVIKITE_WALL.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> SMOOTH_LARVIKITE_PRESSURE_PLATE_ITEM = ITEMS.register("smooth_larvikite_pressure_plate",
        () -> new BlockItem(ECBlockRegistry.SMOOTH_LARVIKITE_PRESSURE_PLATE.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));

    public static final RegistryObject<Item> POLISHED_LARVIKITE_ITEM = ITEMS.register("polished_larvikite",
        () -> new BlockItem(ECBlockRegistry.POLISHED_LARVIKITE.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> POLISHED_LARVIKITE_STAIRS_ITEM = ITEMS.register("polished_larvikite_stairs",
        () -> new BlockItem(ECBlockRegistry.POLISHED_LARVIKITE_STAIRS.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> POLISHED_LARVIKITE_SLAB_ITEM = ITEMS.register("polished_larvikite_slab",
        () -> new BlockItem(ECBlockRegistry.POLISHED_LARVIKITE_SLAB.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> POLISHED_LARVIKITE_WALL_ITEM = ITEMS.register("polished_larvikite_wall",
        () -> new BlockItem(ECBlockRegistry.POLISHED_LARVIKITE_WALL.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> POLISHED_LARVIKITE_PRESSURE_PLATE_ITEM = ITEMS.register("polished_larvikite_pressure_plate",
        () -> new BlockItem(ECBlockRegistry.POLISHED_LARVIKITE_PRESSURE_PLATE.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));

    public static final RegistryObject<Item> LARVIKITE_PAVING_ITEM = ITEMS.register("larvikite_paving",
        () -> new BlockItem(ECBlockRegistry.LARVIKITE_PAVING.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> LARVIKITE_PAVING_STAIRS_ITEM = ITEMS.register("larvikite_paving_stairs",
        () -> new BlockItem(ECBlockRegistry.LARVIKITE_PAVING_STAIRS.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> LARVIKITE_PAVING_SLAB_ITEM = ITEMS.register("larvikite_paving_slab",
        () -> new BlockItem(ECBlockRegistry.LARVIKITE_PAVING_SLAB.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> LARVIKITE_PAVING_WALL_ITEM = ITEMS.register("larvikite_paving_wall",
        () -> new BlockItem(ECBlockRegistry.LARVIKITE_PAVING_WALL.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> LARVIKITE_PAVING_PRESSURE_PLATE_ITEM = ITEMS.register("larvikite_paving_pressure_plate",
        () -> new BlockItem(ECBlockRegistry.LARVIKITE_PAVING_PRESSURE_PLATE.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));

    public static final RegistryObject<Item> LARVIKITE_TILES_ITEM = ITEMS.register("larvikite_tiles",
        () -> new BlockItem(ECBlockRegistry.LARVIKITE_TILES.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> LARVIKITE_TILES_STAIRS_ITEM = ITEMS.register("larvikite_tiles_stairs",
        () -> new BlockItem(ECBlockRegistry.LARVIKITE_TILES_STAIRS.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> LARVIKITE_TILES_SLAB_ITEM = ITEMS.register("larvikite_tiles_slab",
        () -> new BlockItem(ECBlockRegistry.LARVIKITE_TILES_SLAB.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> LARVIKITE_TILES_WALL_ITEM = ITEMS.register("larvikite_tiles_wall",
        () -> new BlockItem(ECBlockRegistry.LARVIKITE_TILES_WALL.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> LARVIKITE_TILES_PRESSURE_PLATE_ITEM = ITEMS.register("larvikite_tiles_pressure_plate",
        () -> new BlockItem(ECBlockRegistry.LARVIKITE_TILES_PRESSURE_PLATE.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));

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

    public static final RegistryObject<Item> LARVIKITE_ORNAMENT_ITEM = ITEMS.register("larvikite_ornament",
        () -> new BlockItem(ECBlockRegistry.LARVIKITE_ORNAMENT.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> LARVIKITE_ORNAMENT_PRESSURE_PLATE_ITEM = ITEMS.register("larvikite_ornament_pressure_plate",
        () -> new BlockItem(ECBlockRegistry.LARVIKITE_ORNAMENT_PRESSURE_PLATE.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));

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

    public static final RegistryObject<Item> ANDESITE_ORNAMENT_ITEM = ITEMS.register("andesite_ornament",
        () -> new BlockItem(ECBlockRegistry.ANDESITE_ORNAMENT.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> ANDESITE_ORNAMENT_PRESSURE_PLATE_ITEM = ITEMS.register("andesite_ornament_pressure_plate",
        () -> new BlockItem(ECBlockRegistry.ANDESITE_ORNAMENT_PRESSURE_PLATE.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));

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

    public static final RegistryObject<Item> DIORITE_ORNAMENT_ITEM = ITEMS.register("diorite_ornament",
        () -> new BlockItem(ECBlockRegistry.DIORITE_ORNAMENT.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> DIORITE_ORNAMENT_PRESSURE_PLATE_ITEM = ITEMS.register("diorite_ornament_pressure_plate",
        () -> new BlockItem(ECBlockRegistry.DIORITE_ORNAMENT_PRESSURE_PLATE.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));

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

    public static final RegistryObject<Item> GRANITE_ORNAMENT_ITEM = ITEMS.register("granite_ornament",
        () -> new BlockItem(ECBlockRegistry.GRANITE_ORNAMENT.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));
    public static final RegistryObject<Item> GRANITE_ORNAMENT_PRESSURE_PLATE_ITEM = ITEMS.register("granite_ornament_pressure_plate",
        () -> new BlockItem(ECBlockRegistry.GRANITE_ORNAMENT_PRESSURE_PLATE.get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)));

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

    public static void init()
    {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}
