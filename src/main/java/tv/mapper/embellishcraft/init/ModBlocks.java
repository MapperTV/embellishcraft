package tv.mapper.embellishcraft.init;

import net.minecraft.block.Block;
import net.minecraft.block.BlockPressurePlate;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.ObjectHolder;
import tv.mapper.embellishcraft.block.BlockCustomPressurePlate;
import tv.mapper.embellishcraft.block.BlockCustomRock;
import tv.mapper.embellishcraft.block.BlockCustomStairs;
import tv.mapper.embellishcraft.block.BlockCustomWall;
import tv.mapper.embellishcraft.block.BlockUpDown;
import tv.mapper.embellishcraft.item.ModItemGroups;

@EventBusSubscriber(bus = Bus.MOD)
public class ModBlocks
{
    // World (blocks that generate in the world)
    
    @ObjectHolder("embellishcraft:basalt_block")
    public static Block BASALT_BLOCK;
    @ObjectHolder("embellishcraft:slate_block")
    public static Block SLATE_BLOCK;
    
    // Rocks (cobblestone-like etc)
    
    @ObjectHolder("embellishcraft:basalt_cobblestone_block")
    public static Block BASALT_COBBLESTONE_BLOCK;
    @ObjectHolder("embellishcraft:slate_cobblestone_block")
    public static Block SLATE_COBBLESTONE_BLOCK;
    
    // Bricks

    @ObjectHolder("embellishcraft:basalt_brick_block")
    public static Block BASALT_BRICK_BLOCK;
    @ObjectHolder("embellishcraft:basalt_brick_stairs")
    public static Block BASALT_BRICK_STAIRS;
    @ObjectHolder("embellishcraft:basalt_brick_slab")
    public static Block BASALT_BRICK_SLAB;
    @ObjectHolder("embellishcraft:basalt_brick_wall")
    public static Block BASALT_BRICK_WALL;

    @ObjectHolder("embellishcraft:dark_brick_block")
    public static Block DARK_BRICK_BLOCK;
    @ObjectHolder("embellishcraft:dark_brick_stairs")
    public static Block DARK_BRICK_STAIRS;
    @ObjectHolder("embellishcraft:dark_brick_slab")
    public static Block DARK_BRICK_SLAB;
    @ObjectHolder("embellishcraft:dark_brick_wall")
    public static Block DARK_BRICK_WALL;

    @ObjectHolder("embellishcraft:diorite_brick_block")
    public static Block DIORITE_BRICK_BLOCK;
    @ObjectHolder("embellishcraft:diorite_brick_stairs")
    public static Block DIORITE_BRICK_STAIRS;
    @ObjectHolder("embellishcraft:diorite_brick_slab")
    public static Block DIORITE_BRICK_SLAB;
    @ObjectHolder("embellishcraft:diorite_brick_wall")
    public static Block DIORITE_BRICK_WALL;

    @ObjectHolder("embellishcraft:old_brick_block")
    public static Block OLD_BRICK_BLOCK;
    @ObjectHolder("embellishcraft:old_brick_stairs")
    public static Block OLD_BRICK_STAIRS;
    @ObjectHolder("embellishcraft:old_brick_slab")
    public static Block OLD_BRICK_SLAB;
    @ObjectHolder("embellishcraft:old_brick_wall")
    public static Block OLD_BRICK_WALL;

    @ObjectHolder("embellishcraft:sandstone_brick_block")
    public static Block SANDSTONE_BRICK_BLOCK;
    @ObjectHolder("embellishcraft:sandstone_brick_stairs")
    public static Block SANDSTONE_BRICK_STAIRS;
    @ObjectHolder("embellishcraft:sandstone_brick_slab")
    public static Block SANDSTONE_BRICK_SLAB;
    @ObjectHolder("embellishcraft:sandstone_brick_wall")
    public static Block SANDSTONE_BRICK_WALL;

    @ObjectHolder("embellishcraft:slate_brick_block")
    public static Block SLATE_BRICK_BLOCK;
    @ObjectHolder("embellishcraft:slate_brick_stairs")
    public static Block SLATE_BRICK_STAIRS;
    @ObjectHolder("embellishcraft:slate_brick_slab")
    public static Block SLATE_BRICK_SLAB;
    @ObjectHolder("embellishcraft:slate_brick_wall")
    public static Block SLATE_BRICK_WALL;

    @ObjectHolder("embellishcraft:terracotta_brick_block")
    public static Block TERRACOTTA_BRICK_BLOCK;
    @ObjectHolder("embellishcraft:terracotta_brick_stairs")
    public static Block TERRACOTTA_BRICK_STAIRS;
    @ObjectHolder("embellishcraft:terracotta_brick_slab")
    public static Block TERRACOTTA_BRICK_SLAB;
    @ObjectHolder("embellishcraft:terracotta_brick_wall")
    public static Block TERRACOTTA_BRICK_WALL;

    @ObjectHolder("embellishcraft:weared_brick_block")
    public static Block WEARED_BRICK_BLOCK;
    @ObjectHolder("embellishcraft:weared_brick_stairs")
    public static Block WEARED_BRICK_STAIRS;
    @ObjectHolder("embellishcraft:weared_brick_slab")
    public static Block WEARED_BRICK_SLAB;
    @ObjectHolder("embellishcraft:weared_brick_wall")
    public static Block WEARED_BRICK_WALL;

    // Paving

    @ObjectHolder("embellishcraft:concrete_paving_block")
    public static Block CONCRETE_PAVING_BLOCK;
    @ObjectHolder("embellishcraft:concrete_paving_stairs")
    public static Block CONCRETE_PAVING_STAIRS;
    @ObjectHolder("embellishcraft:concrete_paving_slab")
    public static Block CONCRETE_PAVING_SLAB;
    @ObjectHolder("embellishcraft:concrete_paving_pressure_plate")
    public static Block CONCRETE_PAVING_PRESSURE_PLATE;

    @ObjectHolder("embellishcraft:damaged_paving_block")
    public static Block DAMAGED_PAVING_BLOCK;
    @ObjectHolder("embellishcraft:damaged_paving_stairs")
    public static Block DAMAGED_PAVING_STAIRS;
    @ObjectHolder("embellishcraft:damaged_paving_slab")
    public static Block DAMAGED_PAVING_SLAB;
    @ObjectHolder("embellishcraft:damaged_paving_pressure_plate")
    public static Block DAMAGED_PAVING_PRESSURE_PLATE;

    @ObjectHolder("embellishcraft:dark_concrete_paving_block")
    public static Block DARK_CONCRETE_PAVING_BLOCK;
    @ObjectHolder("embellishcraft:dark_concrete_paving_stairs")
    public static Block DARK_CONCRETE_PAVING_STAIRS;
    @ObjectHolder("embellishcraft:dark_concrete_paving_slab")
    public static Block DARK_CONCRETE_PAVING_SLAB;
    @ObjectHolder("embellishcraft:dark_concrete_paving_pressure_plate")
    public static Block DARK_CONCRETE_PAVING_PRESSURE_PLATE;

    @ObjectHolder("embellishcraft:diorite_paving_block")
    public static Block DIORITE_PAVING_BLOCK;
    @ObjectHolder("embellishcraft:diorite_paving_stairs")
    public static Block DIORITE_PAVING_STAIRS;
    @ObjectHolder("embellishcraft:diorite_paving_slab")
    public static Block DIORITE_PAVING_SLAB;
    @ObjectHolder("embellishcraft:diorite_paving_pressure_plate")
    public static Block DIORITE_PAVING_PRESSURE_PLATE;

    @ObjectHolder("embellishcraft:moist_paving_block")
    public static Block MOIST_PAVING_BLOCK;
    @ObjectHolder("embellishcraft:moist_paving_stairs")
    public static Block MOIST_PAVING_STAIRS;
    @ObjectHolder("embellishcraft:moist_paving_slab")
    public static Block MOIST_PAVING_SLAB;
    @ObjectHolder("embellishcraft:moist_paving_pressure_plate")
    public static Block MOIST_PAVING_PRESSURE_PLATE;

    @ObjectHolder("embellishcraft:polished_paving_block")
    public static Block POLISHED_PAVING_BLOCK;
    @ObjectHolder("embellishcraft:polished_paving_stairs")
    public static Block POLISHED_PAVING_STAIRS;
    @ObjectHolder("embellishcraft:polished_paving_slab")
    public static Block POLISHED_PAVING_SLAB;
    @ObjectHolder("embellishcraft:polished_paving_pressure_plate")
    public static Block POLISHED_PAVING_PRESSURE_PLATE;

    @ObjectHolder("embellishcraft:slate_paving_block")
    public static Block SLATE_PAVING_BLOCK;
    @ObjectHolder("embellishcraft:slate_paving_stairs")
    public static Block SLATE_PAVING_STAIRS;
    @ObjectHolder("embellishcraft:slate_paving_slab")
    public static Block SLATE_PAVING_SLAB;
    @ObjectHolder("embellishcraft:slate_paving_pressure_plate")
    public static Block SLATE_PAVING_PRESSURE_PLATE;

    @ObjectHolder("embellishcraft:white_concrete_paving_block")
    public static Block WHITE_CONCRETE_PAVING_BLOCK;
    @ObjectHolder("embellishcraft:white_concrete_paving_stairs")
    public static Block WHITE_CONCRETE_PAVING_STAIRS;
    @ObjectHolder("embellishcraft:white_concrete_paving_slab")
    public static Block WHITE_CONCRETE_PAVING_SLAB;
    @ObjectHolder("embellishcraft:white_concrete_paving_pressure_plate")
    public static Block WHITE_CONCRETE_PAVING_PRESSURE_PLATE;

    // Tiles

    @ObjectHolder("embellishcraft:concrete_tiles_block")
    public static Block CONCRETE_TILES_BLOCK;
    @ObjectHolder("embellishcraft:concrete_tiles_stairs")
    public static Block CONCRETE_TILES_STAIRS;
    @ObjectHolder("embellishcraft:concrete_tiles_slab")
    public static Block CONCRETE_TILES_SLAB;
    @ObjectHolder("embellishcraft:concrete_tiles_pressure_plate")
    public static Block CONCRETE_TILES_PRESSURE_PLATE;

    @ObjectHolder("embellishcraft:skyblue_tiles_block")
    public static Block SKYBLUE_TILES_BLOCK;
    @ObjectHolder("embellishcraft:skyblue_tiles_stairs")
    public static Block SKYBLUE_TILES_STAIRS;
    @ObjectHolder("embellishcraft:skyblue_tiles_slab")
    public static Block SKYBLUE_TILES_SLAB;
    @ObjectHolder("embellishcraft:skyblue_tiles_pressure_plate")
    public static Block SKYBLUE_TILES_PRESSURE_PLATE;

    @ObjectHolder("embellishcraft:orange_tiles_block")
    public static Block ORANGE_TILES_BLOCK;
    @ObjectHolder("embellishcraft:orange_tiles_stairs")
    public static Block ORANGE_TILES_STAIRS;
    @ObjectHolder("embellishcraft:orange_tiles_slab")
    public static Block ORANGE_TILES_SLAB;
    @ObjectHolder("embellishcraft:orange_tiles_pressure_plate")
    public static Block ORANGE_TILES_PRESSURE_PLATE;

    @ObjectHolder("embellishcraft:blue_tiles_block")
    public static Block BLUE_TILES_BLOCK;
    @ObjectHolder("embellishcraft:blue_tiles_stairs")
    public static Block BLUE_TILES_STAIRS;
    @ObjectHolder("embellishcraft:blue_tiles_slab")
    public static Block BLUE_TILES_SLAB;
    @ObjectHolder("embellishcraft:blue_tiles_pressure_plate")
    public static Block BLUE_TILES_PRESSURE_PLATE;

    @ObjectHolder("embellishcraft:light_blue_tiles_block")
    public static Block LIGHT_BLUE_TILES_BLOCK;
    @ObjectHolder("embellishcraft:light_blue_tiles_stairs")
    public static Block LIGHT_BLUE_TILES_STAIRS;
    @ObjectHolder("embellishcraft:light_blue_tiles_slab")
    public static Block LIGHT_BLUE_TILES_SLAB;
    @ObjectHolder("embellishcraft:light_blue_tiles_pressure_plate")
    public static Block LIGHT_BLUE_TILES_PRESSURE_PLATE;

    @ObjectHolder("embellishcraft:red_tiles_block")
    public static Block RED_TILES_BLOCK;
    @ObjectHolder("embellishcraft:red_tiles_stairs")
    public static Block RED_TILES_STAIRS;
    @ObjectHolder("embellishcraft:red_tiles_slab")
    public static Block RED_TILES_SLAB;
    @ObjectHolder("embellishcraft:red_tiles_pressure_plate")
    public static Block RED_TILES_PRESSURE_PLATE;

    @ObjectHolder("embellishcraft:white_tiles_block")
    public static Block WHITE_TILES_BLOCK;
    @ObjectHolder("embellishcraft:white_tiles_stairs")
    public static Block WHITE_TILES_STAIRS;
    @ObjectHolder("embellishcraft:white_tiles_slab")
    public static Block WHITE_TILES_SLAB;
    @ObjectHolder("embellishcraft:white_tiles_pressure_plate")
    public static Block WHITE_TILES_PRESSURE_PLATE;

    @ObjectHolder("embellishcraft:yellow_tiles_block")
    public static Block YELLOW_TILES_BLOCK;
    @ObjectHolder("embellishcraft:yellow_tiles_stairs")
    public static Block YELLOW_TILES_STAIRS;
    @ObjectHolder("embellishcraft:yellow_tiles_slab")
    public static Block YELLOW_TILES_SLAB;
    @ObjectHolder("embellishcraft:yellow_tiles_pressure_plate")
    public static Block YELLOW_TILES_PRESSURE_PLATE;

    @ObjectHolder("embellishcraft:yellow_grey_tiles_block")
    public static Block YELLOW_GREY_TILES_BLOCK;
    @ObjectHolder("embellishcraft:yellow_grey_tiles_stairs")
    public static Block YELLOW_GREY_TILES_STAIRS;
    @ObjectHolder("embellishcraft:yellow_grey_tiles_slab")
    public static Block YELLOW_GREY_TILES_SLAB;
    @ObjectHolder("embellishcraft:yellow_grey_tiles_pressure_plate")
    public static Block YELLOW_GREY_TILES_PRESSURE_PLATE;
    
    // Wallpaper
    
    @ObjectHolder("embellishcraft:white_blue_wallpaper_block")
    public static Block WHITE_BLUE_WALLPAPER_BLOCK;
    @ObjectHolder("embellishcraft:white_blue_wallpaper_stairs")
    public static Block WHITE_BLUE_WALLPAPER_STAIRS;
    @ObjectHolder("embellishcraft:white_blue_wallpaper_slab")
    public static Block WHITE_BLUE_WALLPAPER_SLAB;
    @ObjectHolder("embellishcraft:white_blue_wallpaper_plinth_block")
    public static Block WHITE_BLUE_WALLPAPER_PLINTH_BLOCK;

    @ObjectHolder("embellishcraft:beige_wallpaper_block")
    public static Block BEIGE_WALLPAPER_BLOCK;
    @ObjectHolder("embellishcraft:beige_wallpaper_stairs")
    public static Block BEIGE_WALLPAPER_STAIRS;
    @ObjectHolder("embellishcraft:beige_wallpaper_slab")
    public static Block BEIGE_WALLPAPER_SLAB;
    @ObjectHolder("embellishcraft:beige_wallpaper_plinth_block")
    public static Block BEIGE_WALLPAPER_PLINTH_BLOCK;
    
    @ObjectHolder("embellishcraft:pink_wallpaper_block")
    public static Block PINK_WALLPAPER_BLOCK;
    @ObjectHolder("embellishcraft:pink_wallpaper_stairs")
    public static Block PINK_WALLPAPER_STAIRS;
    @ObjectHolder("embellishcraft:pink_wallpaper_slab")
    public static Block PINK_WALLPAPER_SLAB;
    @ObjectHolder("embellishcraft:pink_wallpaper_plinth_block")
    public static Block PINK_WALLPAPER_PLINTH_BLOCK;
    
    @ObjectHolder("embellishcraft:beige_flower_wallpaper_block")
    public static Block BEIGE_FLOWER_WALLPAPER_BLOCK;
    @ObjectHolder("embellishcraft:beige_flower_wallpaper_stairs")
    public static Block BEIGE_FLOWER_WALLPAPER_STAIRS;
    @ObjectHolder("embellishcraft:beige_flower_wallpaper_slab")
    public static Block BEIGE_FLOWER_WALLPAPER_SLAB;
    @ObjectHolder("embellishcraft:beige_flower_wallpaper_plinth_block")
    public static Block BEIGE_FLOWER_WALLPAPER_PLINTH_BLOCK;
    
    @ObjectHolder("embellishcraft:white_green_wallpaper_block")
    public static Block WHITE_GREEN_WALLPAPER_BLOCK;
    @ObjectHolder("embellishcraft:white_green_wallpaper_stairs")
    public static Block WHITE_GREEN_WALLPAPER_STAIRS;
    @ObjectHolder("embellishcraft:white_green_wallpaper_slab")
    public static Block WHITE_GREEN_WALLPAPER_SLAB;
    @ObjectHolder("embellishcraft:white_green_wallpaper_plinth_block")
    public static Block WHITE_GREEN_WALLPAPER_PLINTH_BLOCK;
    
    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event)
    {
        // Rocks
        
        Block basalt, slate;
        event.getRegistry().register(basalt = new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5F, 6.0F)).setRegistryName("basalt_cobblestone_block"));
        event.getRegistry().register(slate = new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5F, 6.0F)).setRegistryName("slate_cobblestone_block"));
        
        // World
        
        event.getRegistry().register(new BlockCustomRock(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5F, 6.0F), basalt).setRegistryName("basalt_block"));
        event.getRegistry().register(new BlockCustomRock(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5F, 6.0F), slate).setRegistryName("slate_block"));
        
        // Bricks

        createBlockWithVariants(event, "basalt_brick", true, true, true, false);
        createBlockWithVariants(event, "dark_brick", true, true, true, false);
        createBlockWithVariants(event, "diorite_brick", true, true, true, false);
        createBlockWithVariants(event, "old_brick", true, true, true, false);
        createBlockWithVariants(event, "sandstone_brick", true, true, true, false);
        createBlockWithVariants(event, "slate_brick", true, true, true, false);
        createBlockWithVariants(event, "terracotta_brick", true, true, true, false);
        createBlockWithVariants(event, "weared_brick", true, true, true, false);

        // Paving

        createBlockWithVariants(event, "concrete_paving", true, true, false, true);
        createBlockWithVariants(event, "damaged_paving", true, true, false, true);
        createBlockWithVariants(event, "dark_concrete_paving", true, true, false, true);
        createBlockWithVariants(event, "diorite_paving", true, true, false, true);
        createBlockWithVariants(event, "moist_paving", true, true, false, true);
        createBlockWithVariants(event, "polished_paving", true, true, false, true);
        createBlockWithVariants(event, "slate_paving", true, true, false, true);
        createBlockWithVariants(event, "white_concrete_paving", true, true, false, true);

        // Tiles

        createBlockWithVariants(event, "concrete_tiles", true, true, false, true);
        createBlockWithVariants(event, "skyblue_tiles", true, true, false, true);
        createBlockWithVariants(event, "orange_tiles", true, true, false, true);
        createBlockWithVariants(event, "blue_tiles", true, true, false, true);
        createBlockWithVariants(event, "light_blue_tiles", true, true, false, true);
        createBlockWithVariants(event, "red_tiles", true, true, false, true);
        createBlockWithVariants(event, "white_tiles", true, true, false, true);
        createBlockWithVariants(event, "yellow_tiles", true, true, false, true);
        createBlockWithVariants(event, "yellow_grey_tiles", true, true, false, true);
        
        // Wallpaper
        
        createBlockWithVariants(event, "white_blue_wallpaper", true, true, false, false);
        event.getRegistry().register(new BlockUpDown(Block.Properties.create(Material.ROCK).hardnessAndResistance(0.5f)).setRegistryName("white_blue_wallpaper_plinth_block"));
        createBlockWithVariants(event, "beige_wallpaper", true, true, false, false);
        event.getRegistry().register(new BlockUpDown(Block.Properties.create(Material.ROCK).hardnessAndResistance(0.5f)).setRegistryName("beige_wallpaper_plinth_block"));
        createBlockWithVariants(event, "pink_wallpaper", true, true, false, false);
        event.getRegistry().register(new BlockUpDown(Block.Properties.create(Material.ROCK).hardnessAndResistance(0.5f)).setRegistryName("pink_wallpaper_plinth_block"));
        createBlockWithVariants(event, "beige_flower_wallpaper", true, true, false, false);
        event.getRegistry().register(new BlockUpDown(Block.Properties.create(Material.ROCK).hardnessAndResistance(0.5f)).setRegistryName("beige_flower_wallpaper_plinth_block"));
        createBlockWithVariants(event, "white_green_wallpaper", true, true, false, false);
        event.getRegistry().register(new BlockUpDown(Block.Properties.create(Material.ROCK).hardnessAndResistance(0.5f)).setRegistryName("white_green_wallpaper_plinth_block"));

    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event)
    { 
        // World
        
        event.getRegistry().register(new ItemBlock(BASALT_BLOCK, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)).setRegistryName(BASALT_BLOCK.getRegistryName()));
        event.getRegistry().register(new ItemBlock(SLATE_BLOCK, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)).setRegistryName(SLATE_BLOCK.getRegistryName()));
        
        // Rocks
        
        event.getRegistry().register(new ItemBlock(BASALT_COBBLESTONE_BLOCK, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)).setRegistryName(BASALT_COBBLESTONE_BLOCK.getRegistryName()));
        event.getRegistry().register(new ItemBlock(SLATE_COBBLESTONE_BLOCK, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)).setRegistryName(SLATE_COBBLESTONE_BLOCK.getRegistryName()));
        
        // Bricks

        createItemBlockWithVariants(event, ModItemGroups.EMBELLISHCRAFT, BASALT_BRICK_BLOCK, BASALT_BRICK_STAIRS, BASALT_BRICK_SLAB, BASALT_BRICK_WALL, null);
        createItemBlockWithVariants(event, ModItemGroups.EMBELLISHCRAFT, DARK_BRICK_BLOCK, DARK_BRICK_STAIRS, DARK_BRICK_SLAB, DARK_BRICK_WALL, null);
        createItemBlockWithVariants(event, ModItemGroups.EMBELLISHCRAFT, DIORITE_BRICK_BLOCK, DIORITE_BRICK_STAIRS, DIORITE_BRICK_SLAB, DIORITE_BRICK_WALL, null);
        createItemBlockWithVariants(event, ModItemGroups.EMBELLISHCRAFT, OLD_BRICK_BLOCK, OLD_BRICK_STAIRS, OLD_BRICK_SLAB, OLD_BRICK_WALL, null);
        createItemBlockWithVariants(event, ModItemGroups.EMBELLISHCRAFT, SANDSTONE_BRICK_BLOCK, SANDSTONE_BRICK_STAIRS, SANDSTONE_BRICK_SLAB, SANDSTONE_BRICK_WALL, null);
        createItemBlockWithVariants(event, ModItemGroups.EMBELLISHCRAFT, SLATE_BRICK_BLOCK, SLATE_BRICK_STAIRS, SLATE_BRICK_SLAB, SLATE_BRICK_WALL, null);
        createItemBlockWithVariants(event, ModItemGroups.EMBELLISHCRAFT, TERRACOTTA_BRICK_BLOCK, TERRACOTTA_BRICK_STAIRS, TERRACOTTA_BRICK_SLAB, TERRACOTTA_BRICK_WALL, null);
        createItemBlockWithVariants(event, ModItemGroups.EMBELLISHCRAFT, WEARED_BRICK_BLOCK, WEARED_BRICK_STAIRS, WEARED_BRICK_SLAB, WEARED_BRICK_WALL, null);

        // Paving

        createItemBlockWithVariants(event, ModItemGroups.EMBELLISHCRAFT, CONCRETE_PAVING_BLOCK, CONCRETE_PAVING_STAIRS, CONCRETE_PAVING_SLAB, null, CONCRETE_PAVING_PRESSURE_PLATE);
        createItemBlockWithVariants(event, ModItemGroups.EMBELLISHCRAFT, DAMAGED_PAVING_BLOCK, DAMAGED_PAVING_STAIRS, DAMAGED_PAVING_SLAB, null, DAMAGED_PAVING_PRESSURE_PLATE);
        createItemBlockWithVariants(event, ModItemGroups.EMBELLISHCRAFT, DARK_CONCRETE_PAVING_BLOCK, DARK_CONCRETE_PAVING_STAIRS, DARK_CONCRETE_PAVING_SLAB, null, DARK_CONCRETE_PAVING_PRESSURE_PLATE);
        createItemBlockWithVariants(event, ModItemGroups.EMBELLISHCRAFT, DIORITE_PAVING_BLOCK, DIORITE_PAVING_STAIRS, DIORITE_PAVING_SLAB, null, DIORITE_PAVING_PRESSURE_PLATE);
        createItemBlockWithVariants(event, ModItemGroups.EMBELLISHCRAFT, MOIST_PAVING_BLOCK, MOIST_PAVING_STAIRS, MOIST_PAVING_SLAB, null, MOIST_PAVING_PRESSURE_PLATE);
        createItemBlockWithVariants(event, ModItemGroups.EMBELLISHCRAFT, POLISHED_PAVING_BLOCK, POLISHED_PAVING_STAIRS, POLISHED_PAVING_SLAB, null, POLISHED_PAVING_PRESSURE_PLATE);
        createItemBlockWithVariants(event, ModItemGroups.EMBELLISHCRAFT, SLATE_PAVING_BLOCK, SLATE_PAVING_STAIRS, SLATE_PAVING_SLAB, null, SLATE_PAVING_PRESSURE_PLATE);
        createItemBlockWithVariants(event, ModItemGroups.EMBELLISHCRAFT, WHITE_CONCRETE_PAVING_BLOCK, WHITE_CONCRETE_PAVING_STAIRS, WHITE_CONCRETE_PAVING_SLAB, null, WHITE_CONCRETE_PAVING_PRESSURE_PLATE);

        // Tiles

        createItemBlockWithVariants(event, ModItemGroups.EMBELLISHCRAFT, CONCRETE_TILES_BLOCK, CONCRETE_TILES_STAIRS, CONCRETE_TILES_SLAB, null, CONCRETE_TILES_PRESSURE_PLATE);
        createItemBlockWithVariants(event, ModItemGroups.EMBELLISHCRAFT, SKYBLUE_TILES_BLOCK, SKYBLUE_TILES_STAIRS, SKYBLUE_TILES_SLAB, null, SKYBLUE_TILES_PRESSURE_PLATE);
        createItemBlockWithVariants(event, ModItemGroups.EMBELLISHCRAFT, ORANGE_TILES_BLOCK, ORANGE_TILES_STAIRS, ORANGE_TILES_SLAB, null, ORANGE_TILES_PRESSURE_PLATE);
        createItemBlockWithVariants(event, ModItemGroups.EMBELLISHCRAFT, BLUE_TILES_BLOCK, BLUE_TILES_STAIRS, BLUE_TILES_SLAB, null, BLUE_TILES_PRESSURE_PLATE);
        createItemBlockWithVariants(event, ModItemGroups.EMBELLISHCRAFT, LIGHT_BLUE_TILES_BLOCK, LIGHT_BLUE_TILES_STAIRS, LIGHT_BLUE_TILES_SLAB, null, LIGHT_BLUE_TILES_PRESSURE_PLATE);
        createItemBlockWithVariants(event, ModItemGroups.EMBELLISHCRAFT, RED_TILES_BLOCK, RED_TILES_STAIRS, RED_TILES_SLAB, null, RED_TILES_PRESSURE_PLATE);
        createItemBlockWithVariants(event, ModItemGroups.EMBELLISHCRAFT, WHITE_TILES_BLOCK, WHITE_TILES_STAIRS, WHITE_TILES_SLAB, null, WHITE_TILES_PRESSURE_PLATE);
        createItemBlockWithVariants(event, ModItemGroups.EMBELLISHCRAFT, YELLOW_TILES_BLOCK, YELLOW_TILES_STAIRS, YELLOW_TILES_SLAB, null, YELLOW_TILES_PRESSURE_PLATE);
        createItemBlockWithVariants(event, ModItemGroups.EMBELLISHCRAFT, YELLOW_GREY_TILES_BLOCK, YELLOW_GREY_TILES_STAIRS, YELLOW_GREY_TILES_SLAB, null, YELLOW_GREY_TILES_PRESSURE_PLATE);
        
        // Tests
        
        createItemBlockWithVariants(event, ModItemGroups.EMBELLISHCRAFT, WHITE_BLUE_WALLPAPER_BLOCK, WHITE_BLUE_WALLPAPER_STAIRS, WHITE_BLUE_WALLPAPER_SLAB, null, null);
        event.getRegistry().register(new ItemBlock(WHITE_BLUE_WALLPAPER_PLINTH_BLOCK, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)).setRegistryName(WHITE_BLUE_WALLPAPER_PLINTH_BLOCK.getRegistryName()));
        createItemBlockWithVariants(event, ModItemGroups.EMBELLISHCRAFT, BEIGE_WALLPAPER_BLOCK, BEIGE_WALLPAPER_STAIRS, BEIGE_WALLPAPER_SLAB, null, null);
        event.getRegistry().register(new ItemBlock(BEIGE_WALLPAPER_PLINTH_BLOCK, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)).setRegistryName(BEIGE_WALLPAPER_PLINTH_BLOCK.getRegistryName()));
        createItemBlockWithVariants(event, ModItemGroups.EMBELLISHCRAFT, PINK_WALLPAPER_BLOCK, PINK_WALLPAPER_STAIRS, PINK_WALLPAPER_SLAB, null, null);
        event.getRegistry().register(new ItemBlock(PINK_WALLPAPER_PLINTH_BLOCK, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)).setRegistryName(PINK_WALLPAPER_PLINTH_BLOCK.getRegistryName()));
        createItemBlockWithVariants(event, ModItemGroups.EMBELLISHCRAFT, BEIGE_FLOWER_WALLPAPER_BLOCK, BEIGE_FLOWER_WALLPAPER_STAIRS, BEIGE_FLOWER_WALLPAPER_SLAB, null, null);
        event.getRegistry().register(new ItemBlock(BEIGE_FLOWER_WALLPAPER_PLINTH_BLOCK, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)).setRegistryName(BEIGE_FLOWER_WALLPAPER_PLINTH_BLOCK.getRegistryName()));
        createItemBlockWithVariants(event, ModItemGroups.EMBELLISHCRAFT, WHITE_GREEN_WALLPAPER_BLOCK, WHITE_GREEN_WALLPAPER_STAIRS, WHITE_GREEN_WALLPAPER_SLAB, null, null);
        event.getRegistry().register(new ItemBlock(WHITE_GREEN_WALLPAPER_PLINTH_BLOCK, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)).setRegistryName(WHITE_GREEN_WALLPAPER_PLINTH_BLOCK.getRegistryName()));
        
    }

    /**
     * Registers a Block with its variants.
     * @param event The RegistryEvent
     * @param name The Block registry name
     * @param stairs If true, stairs variant will be registered
     * @param slab If true, slab variant will be registered
     * @param wall If true, wall variant will be registered
     * @param pressure If true, pressure plate variant will be registered
     */
    private static void createBlockWithVariants(RegistryEvent.Register<Block> event, String name, boolean stairs, boolean slab, boolean wall, boolean pressure)
    {
        // pressure = false; // Not implemented yet
        Block block; // Needed to register the stairs
        event.getRegistry().register(block = new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5F, 6.0F)).setRegistryName(name + "_block"));
        if(stairs)
            event.getRegistry().register(new BlockCustomStairs(block.getDefaultState(), Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5F, 6.0F)).setRegistryName(name + "_stairs"));
        if(slab)
            event.getRegistry().register(new BlockSlab(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5F, 6.0F)).setRegistryName(name + "_slab"));
        if(wall)
            event.getRegistry().register(new BlockCustomWall(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5F, 6.0F)).setRegistryName(name + "_wall"));
        if(pressure)
            event.getRegistry().register(new BlockCustomPressurePlate(BlockPressurePlate.Sensitivity.MOBS, Block.Properties.create(Material.ROCK).hardnessAndResistance(0.5F)).setRegistryName(name + "_pressure_plate"));

    }

    /**
     * Registers a Block with its variants.
     * @param event The RegistryEvent
     * @param group The ItemGroup name
     * @param block The associated block
     * @param stairs The associated stairs (send null to no generate ItemBlock for it)
     * @param slab The associated slab (send null to no generate ItemBlock for it)
     * @param wall The associated wall (send null to no generate ItemBlock for it)
     * @param pressure The associated pressure plate (send null to no generate ItemBlock for it)
     */
    private static void createItemBlockWithVariants(RegistryEvent.Register<Item> event, ItemGroup group, Block block, Block stairs, Block slab, Block wall, Block pressure)
    {
        event.getRegistry().register(new ItemBlock(block, new Item.Properties().group(group)).setRegistryName(block.getRegistryName()));
        if(stairs != null)
            event.getRegistry().register(new ItemBlock(stairs, new Item.Properties().group(group)).setRegistryName(stairs.getRegistryName()));
        if(slab != null)
            event.getRegistry().register(new ItemBlock(slab, new Item.Properties().group(group)).setRegistryName(slab.getRegistryName()));
        if(wall != null)
            event.getRegistry().register(new ItemBlock(wall, new Item.Properties().group(group)).setRegistryName(wall.getRegistryName()));
        if(pressure != null)
            event.getRegistry().register(new ItemBlock(pressure, new Item.Properties().group(group)).setRegistryName(pressure.getRegistryName()));
    }
}