package tv.mapper.embellishcraft.block;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.ObjectHolder;
import tv.mapper.embellishcraft.ECConstants;
import tv.mapper.embellishcraft.item.ModItemGroups;
import tv.mapper.embellishcraft.util.WoodsType;
import tv.mapper.mapperbase.block.CustomDoorBlock;

@ObjectHolder(ECConstants.MODID)
@EventBusSubscriber(bus = Bus.MOD)
public class ECBlocks
{
    public static final Block BROWN_OAK_FANCY_BED = null;
    public static final Block BLACK_OAK_FANCY_BED = null;
    public static final Block BLUE_OAK_FANCY_BED = null;
    public static final Block CYAN_OAK_FANCY_BED = null;
    public static final Block GRAY_OAK_FANCY_BED = null;
    public static final Block GREEN_OAK_FANCY_BED = null;
    public static final Block LIGHT_BLUE_OAK_FANCY_BED = null;
    public static final Block LIGHT_GRAY_OAK_FANCY_BED = null;
    public static final Block LIME_OAK_FANCY_BED = null;
    public static final Block MAGENTA_OAK_FANCY_BED = null;
    public static final Block ORANGE_OAK_FANCY_BED = null;
    public static final Block PINK_OAK_FANCY_BED = null;
    public static final Block PURPLE_OAK_FANCY_BED = null;
    public static final Block RED_OAK_FANCY_BED = null;
    public static final Block WHITE_OAK_FANCY_BED = null;
    public static final Block YELLOW_OAK_FANCY_BED = null;

    public static final Block BROWN_BIRCH_FANCY_BED = null;
    public static final Block BLACK_BIRCH_FANCY_BED = null;
    public static final Block BLUE_BIRCH_FANCY_BED = null;
    public static final Block CYAN_BIRCH_FANCY_BED = null;
    public static final Block GRAY_BIRCH_FANCY_BED = null;
    public static final Block GREEN_BIRCH_FANCY_BED = null;
    public static final Block LIGHT_BLUE_BIRCH_FANCY_BED = null;
    public static final Block LIGHT_GRAY_BIRCH_FANCY_BED = null;
    public static final Block LIME_BIRCH_FANCY_BED = null;
    public static final Block MAGENTA_BIRCH_FANCY_BED = null;
    public static final Block ORANGE_BIRCH_FANCY_BED = null;
    public static final Block PINK_BIRCH_FANCY_BED = null;
    public static final Block PURPLE_BIRCH_FANCY_BED = null;
    public static final Block RED_BIRCH_FANCY_BED = null;
    public static final Block WHITE_BIRCH_FANCY_BED = null;
    public static final Block YELLOW_BIRCH_FANCY_BED = null;

    public static final Block BROWN_SPRUCE_FANCY_BED = null;
    public static final Block BLACK_SPRUCE_FANCY_BED = null;
    public static final Block BLUE_SPRUCE_FANCY_BED = null;
    public static final Block CYAN_SPRUCE_FANCY_BED = null;
    public static final Block GRAY_SPRUCE_FANCY_BED = null;
    public static final Block GREEN_SPRUCE_FANCY_BED = null;
    public static final Block LIGHT_BLUE_SPRUCE_FANCY_BED = null;
    public static final Block LIGHT_GRAY_SPRUCE_FANCY_BED = null;
    public static final Block LIME_SPRUCE_FANCY_BED = null;
    public static final Block MAGENTA_SPRUCE_FANCY_BED = null;
    public static final Block ORANGE_SPRUCE_FANCY_BED = null;
    public static final Block PINK_SPRUCE_FANCY_BED = null;
    public static final Block PURPLE_SPRUCE_FANCY_BED = null;
    public static final Block RED_SPRUCE_FANCY_BED = null;
    public static final Block WHITE_SPRUCE_FANCY_BED = null;
    public static final Block YELLOW_SPRUCE_FANCY_BED = null;

    public static final Block BROWN_JUNGLE_FANCY_BED = null;
    public static final Block BLACK_JUNGLE_FANCY_BED = null;
    public static final Block BLUE_JUNGLE_FANCY_BED = null;
    public static final Block CYAN_JUNGLE_FANCY_BED = null;
    public static final Block GRAY_JUNGLE_FANCY_BED = null;
    public static final Block GREEN_JUNGLE_FANCY_BED = null;
    public static final Block LIGHT_BLUE_JUNGLE_FANCY_BED = null;
    public static final Block LIGHT_GRAY_JUNGLE_FANCY_BED = null;
    public static final Block LIME_JUNGLE_FANCY_BED = null;
    public static final Block MAGENTA_JUNGLE_FANCY_BED = null;
    public static final Block ORANGE_JUNGLE_FANCY_BED = null;
    public static final Block PINK_JUNGLE_FANCY_BED = null;
    public static final Block PURPLE_JUNGLE_FANCY_BED = null;
    public static final Block RED_JUNGLE_FANCY_BED = null;
    public static final Block WHITE_JUNGLE_FANCY_BED = null;
    public static final Block YELLOW_JUNGLE_FANCY_BED = null;

    public static final Block BROWN_DARK_OAK_FANCY_BED = null;
    public static final Block BLACK_DARK_OAK_FANCY_BED = null;
    public static final Block BLUE_DARK_OAK_FANCY_BED = null;
    public static final Block CYAN_DARK_OAK_FANCY_BED = null;
    public static final Block GRAY_DARK_OAK_FANCY_BED = null;
    public static final Block GREEN_DARK_OAK_FANCY_BED = null;
    public static final Block LIGHT_BLUE_DARK_OAK_FANCY_BED = null;
    public static final Block LIGHT_GRAY_DARK_OAK_FANCY_BED = null;
    public static final Block LIME_DARK_OAK_FANCY_BED = null;
    public static final Block MAGENTA_DARK_OAK_FANCY_BED = null;
    public static final Block ORANGE_DARK_OAK_FANCY_BED = null;
    public static final Block PINK_DARK_OAK_FANCY_BED = null;
    public static final Block PURPLE_DARK_OAK_FANCY_BED = null;
    public static final Block RED_DARK_OAK_FANCY_BED = null;
    public static final Block WHITE_DARK_OAK_FANCY_BED = null;
    public static final Block YELLOW_DARK_OAK_FANCY_BED = null;

    public static final Block BROWN_ACACIA_FANCY_BED = null;
    public static final Block BLACK_ACACIA_FANCY_BED = null;
    public static final Block BLUE_ACACIA_FANCY_BED = null;
    public static final Block CYAN_ACACIA_FANCY_BED = null;
    public static final Block GRAY_ACACIA_FANCY_BED = null;
    public static final Block GREEN_ACACIA_FANCY_BED = null;
    public static final Block LIGHT_BLUE_ACACIA_FANCY_BED = null;
    public static final Block LIGHT_GRAY_ACACIA_FANCY_BED = null;
    public static final Block LIME_ACACIA_FANCY_BED = null;
    public static final Block MAGENTA_ACACIA_FANCY_BED = null;
    public static final Block ORANGE_ACACIA_FANCY_BED = null;
    public static final Block PINK_ACACIA_FANCY_BED = null;
    public static final Block PURPLE_ACACIA_FANCY_BED = null;
    public static final Block RED_ACACIA_FANCY_BED = null;
    public static final Block WHITE_ACACIA_FANCY_BED = null;
    public static final Block YELLOW_ACACIA_FANCY_BED = null;

    public static List<Block> FANCY_BEDS = new ArrayList<>();
    public static List<Block> FANCY_BEDS_TEISR = new ArrayList<>();

    // public static final Block BROWN_PILLOW = null;
    // public static final Block BLACK_PILLOW = null;
    // public static final Block BLUE_PILLOW = null;
    // public static final Block CYAN_PILLOW = null;
    // public static final Block GRAY_PILLOW = null;
    // public static final Block GREEN_PILLOW = null;
    // public static final Block LIGHT_BLUE_PILLOW = null;
    // public static final Block LIGHT_GRAY_PILLOW = null;
    // public static final Block LIME_PILLOW = null;
    // public static final Block MAGENTA_PILLOW = null;
    // public static final Block ORANGE_PILLOW = null;
    // public static final Block PINK_PILLOW = null;
    // public static final Block PURPLE_PILLOW = null;
    // public static final Block RED_PILLOW = null;
    // public static final Block WHITE_PILLOW = null;
    // public static final Block YELLOW_PILLOW = null;

    // Doors

    // public static final Block OAK_FANCY_DOOR = null;
    // public static final Block BIRCH_FANCY_DOOR = null;
    // public static final Block SPRUCE_FANCY_DOOR = null;
    // public static final Block JUNGLE_FANCY_DOOR = null;
    // public static final Block DARK_OAK_FANCY_DOOR = null;
    // public static final Block ACACIA_FANCY_DOOR = null;

    public static final Block STEEL_DOOR = null;
    public static final Block STURDY_STEEL_DOOR = null;
    public static final Block WARNING_STEEL_DOOR = null;
    public static final Block WHITE_STEEL_DOOR = null;
    public static final Block STURDY_WHITE_STEEL_DOOR = null;
    public static final Block WARNING_WHITE_STEEL_DOOR = null;
    public static final Block RUSTY_DOOR = null;
    public static final Block STURDY_RUSTY_DOOR = null;
    public static final Block WARNING_RUSTY_DOOR = null;

    // Stairs

    public static final Block STEEL_SUSPENDED_STAIRS = null;
    // public static final Block OAK_SUSPENDED_STAIRS = null;
    // public static final Block BIRCH_SUSPENDED_STAIRS = null;
    // public static final Block SPRUCE_SUSPENDED_STAIRS = null;
    // public static final Block JUNGLE_SUSPENDED_STAIRS = null;
    // public static final Block DARK_OAK_SUSPENDED_STAIRS = null;
    // public static final Block ACACIA_SUSPENDED_STAIRS = null;

    // Storage

    public static final Block OAK_FANCY_CHEST = null;
    public static final Block BIRCH_FANCY_CHEST = null;
    public static final Block SPRUCE_FANCY_CHEST = null;
    public static final Block JUNGLE_FANCY_CHEST = null;
    public static final Block DARK_OAK_FANCY_CHEST = null;
    public static final Block ACACIA_FANCY_CHEST = null;

    public static final Block LOCKER = null;

    public static final Block OAK_WOODEN_CRATE = null;
    public static final Block BIRCH_WOODEN_CRATE = null;
    public static final Block SPRUCE_WOODEN_CRATE = null;
    public static final Block JUNGLE_WOODEN_CRATE = null;
    public static final Block DARK_OAK_WOODEN_CRATE = null;
    public static final Block ACACIA_WOODEN_CRATE = null;

    // Lists

    public static List<Block> FANCY_CHESTS = new ArrayList<>();
    public static List<Block> RENDER_CUTOUT = new ArrayList<>(); // Contains all blocks using cutout render

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event)
    {
        // Furniture

        // Block block;

        for(int i = 0; i < 6; i++)
        {
            // event.getRegistry().register(new CustomDoorBlock(Block.Properties.create(Material.WOOD, MaterialColor.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD),
            // ToolType.AXE).setRegistryName(
            // WoodsType.byId(i).getName() + "_fancy_door"));
            // event.getRegistry().register(new SuspendedStairsBlock(Block.Properties.create(Material.WOOD, MaterialColor.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD),
            // ToolType.AXE).setRegistryName(
            // WoodsType.byId(i).getName() + "_suspended_stairs"));
            // event.getRegistry().register(
            // block = new CustomChestBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.5F).sound(SoundType.WOOD), CustomChestType.OAK_FANCY, WoodType.byId(i)).setRegistryName(
            // WoodType.byId(i).getName() + "_fancy_chest"));
            // FANCY_CHESTS.add(block);

            event.getRegistry().register(
                new CrateBlock(Block.Properties.create(Material.WOOD, MaterialColor.WOOD).hardnessAndResistance(2.5F).sound(SoundType.WOOD)).setRegistryName(WoodsType.byId(i).getName() + "_wooden_crate"));

        }

        // event.getRegistry().register(new PlateBlock(Block.Properties.create(Material.GLASS, MaterialColor.QUARTZ).hardnessAndResistance(0.25F).sound(SoundType.GLASS)).setRegistryName("plate"));

        // for(int j = 0; j < Arrays.stream(DyeColor.values()).count(); j++)
        // {
        // event.getRegistry().register(
        // new PillowBlock(DyeColor.byId(j), Block.Properties.create(Material.WOOL).hardnessAndResistance(0.25F).sound(SoundType.CLOTH)).setRegistryName(DyeColor.byId(j).getName() + "_pillow"));
        //
        // }

        // for(int i = 0; i < 6; i++)
        // {
        // for(int j = 0; j < Arrays.stream(DyeColor.values()).count(); j++)
        // {
        // block = new CustomBedBlock(DyeColor.byId(j), WoodType.byId(i), Block.Properties.create(Material.WOOL).sound(SoundType.WOOD).hardnessAndResistance(0.2F)).setRegistryName(
        // DyeColor.byId(j).getName() + "_" + WoodType.byId(i).getName() + "_fancy_bed");
        // event.getRegistry().register(block);
        // FANCY_BEDS.add(block);
        // FANCY_BEDS_TEISR.add(block);
        //
        // }
        // }

        // Doors

        event.getRegistry().register(
            new CustomDoorBlock(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(3.0F).sound(SoundType.LANTERN), ToolType.PICKAXE).setRegistryName("steel_door"));
        event.getRegistry().register(
            new CustomDoorBlock(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(5.0F).sound(SoundType.LANTERN), ToolType.PICKAXE).setRegistryName("sturdy_steel_door"));
        event.getRegistry().register(
            new CustomDoorBlock(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(3.0F).sound(SoundType.LANTERN), ToolType.PICKAXE).setRegistryName("warning_steel_door"));
        event.getRegistry().register(
            new CustomDoorBlock(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(3.0F).sound(SoundType.LANTERN), ToolType.PICKAXE).setRegistryName("white_steel_door"));
        event.getRegistry().register(
            new CustomDoorBlock(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(5.0F).sound(SoundType.LANTERN), ToolType.PICKAXE).setRegistryName("sturdy_white_steel_door"));
        event.getRegistry().register(
            new CustomDoorBlock(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(3.0F).sound(SoundType.LANTERN), ToolType.PICKAXE).setRegistryName("warning_white_steel_door"));
        event.getRegistry().register(
            new CustomDoorBlock(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(3.0F).sound(SoundType.LANTERN), ToolType.PICKAXE).setRegistryName("rusty_door"));
        event.getRegistry().register(
            new CustomDoorBlock(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(5.0F).sound(SoundType.LANTERN), ToolType.PICKAXE).setRegistryName("sturdy_rusty_door"));
        event.getRegistry().register(
            new CustomDoorBlock(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(3.0F).sound(SoundType.LANTERN), ToolType.PICKAXE).setRegistryName("warning_rusty_door"));

        // Stairs

        event.getRegistry().register(new SuspendedStairsBlock(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(3.0F).sound(SoundType.LANTERN), ToolType.PICKAXE).setRegistryName(
            "steel_suspended_stairs"));

        // Chests

        // event.getRegistry().register(new VerticalChestBlock(Block.Properties.create(Material.IRON).hardnessAndResistance(2.5F).sound(SoundType.METAL)).setRegistryName("locker"));

    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event)
    {
        // event.getRegistry().register(new BlockItem(PLATE, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)).setRegistryName(PLATE.getRegistryName()));

        // for(Block block : FANCY_BEDS_TEISR)
        // event.getRegistry().register(
        // new FuelBlockItem(block, new Item.Properties().setTEISR(() -> CustomBedItemStackTileEntityRenderer::new).group(ModItemGroups.EMBELLISHCRAFT), ECConstants.bedBurnTime).setRegistryName(
        // block.getRegistryName()));

        // event.getRegistry().register(new FuelBlockItem(BROWN_PILLOW, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT),
        // ECConstants.doorBurnTime).setRegistryName(BROWN_PILLOW.getRegistryName()));
        // event.getRegistry().register(new FuelBlockItem(BLACK_PILLOW, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT),
        // ECConstants.doorBurnTime).setRegistryName(BLACK_PILLOW.getRegistryName()));
        // event.getRegistry().register(new FuelBlockItem(BLUE_PILLOW, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT),
        // ECConstants.doorBurnTime).setRegistryName(BLUE_PILLOW.getRegistryName()));
        // event.getRegistry().register(new FuelBlockItem(CYAN_PILLOW, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT),
        // ECConstants.doorBurnTime).setRegistryName(CYAN_PILLOW.getRegistryName()));
        // event.getRegistry().register(new FuelBlockItem(GRAY_PILLOW, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT),
        // ECConstants.doorBurnTime).setRegistryName(GRAY_PILLOW.getRegistryName()));
        // event.getRegistry().register(new FuelBlockItem(GREEN_PILLOW, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT),
        // ECConstants.doorBurnTime).setRegistryName(GREEN_PILLOW.getRegistryName()));
        // event.getRegistry().register(
        // new FuelBlockItem(LIGHT_BLUE_PILLOW, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), ECConstants.doorBurnTime).setRegistryName(LIGHT_BLUE_PILLOW.getRegistryName()));
        // event.getRegistry().register(
        // new FuelBlockItem(LIGHT_GRAY_PILLOW, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), ECConstants.doorBurnTime).setRegistryName(LIGHT_GRAY_PILLOW.getRegistryName()));
        // event.getRegistry().register(new FuelBlockItem(LIME_PILLOW, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT),
        // ECConstants.doorBurnTime).setRegistryName(LIME_PILLOW.getRegistryName()));
        // event.getRegistry().register(new FuelBlockItem(MAGENTA_PILLOW, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT),
        // ECConstants.doorBurnTime).setRegistryName(MAGENTA_PILLOW.getRegistryName()));
        // event.getRegistry().register(new FuelBlockItem(ORANGE_PILLOW, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT),
        // ECConstants.doorBurnTime).setRegistryName(ORANGE_PILLOW.getRegistryName()));
        // event.getRegistry().register(new FuelBlockItem(PINK_PILLOW, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT),
        // ECConstants.doorBurnTime).setRegistryName(PINK_PILLOW.getRegistryName()));
        // event.getRegistry().register(new FuelBlockItem(PURPLE_PILLOW, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT),
        // ECConstants.doorBurnTime).setRegistryName(PURPLE_PILLOW.getRegistryName()));
        // event.getRegistry().register(new FuelBlockItem(RED_PILLOW, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT),
        // ECConstants.doorBurnTime).setRegistryName(RED_PILLOW.getRegistryName()));
        // event.getRegistry().register(new FuelBlockItem(WHITE_PILLOW, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT),
        // ECConstants.doorBurnTime).setRegistryName(WHITE_PILLOW.getRegistryName()));
        // event.getRegistry().register(new FuelBlockItem(YELLOW_PILLOW, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT),
        // ECConstants.doorBurnTime).setRegistryName(YELLOW_PILLOW.getRegistryName()));

        // Door

        // event.getRegistry().register(new FuelBlockItem(OAK_FANCY_DOOR, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT),
        // ECConstants.doorBurnTime).setRegistryName(OAK_FANCY_DOOR.getRegistryName()));
        // event.getRegistry().register(
        // new FuelBlockItem(BIRCH_FANCY_DOOR, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), ECConstants.doorBurnTime).setRegistryName(BIRCH_FANCY_DOOR.getRegistryName()));
        // event.getRegistry().register(
        // new FuelBlockItem(SPRUCE_FANCY_DOOR, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), ECConstants.doorBurnTime).setRegistryName(SPRUCE_FANCY_DOOR.getRegistryName()));
        // event.getRegistry().register(
        // new FuelBlockItem(JUNGLE_FANCY_DOOR, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), ECConstants.doorBurnTime).setRegistryName(JUNGLE_FANCY_DOOR.getRegistryName()));
        // event.getRegistry().register(
        // new FuelBlockItem(DARK_OAK_FANCY_DOOR, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), ECConstants.doorBurnTime).setRegistryName(DARK_OAK_FANCY_DOOR.getRegistryName()));
        // event.getRegistry().register(
        // new FuelBlockItem(ACACIA_FANCY_DOOR, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), ECConstants.doorBurnTime).setRegistryName(ACACIA_FANCY_DOOR.getRegistryName()));

        event.getRegistry().register(new BlockItem(STEEL_DOOR, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)).setRegistryName(STEEL_DOOR.getRegistryName()));
        event.getRegistry().register(new BlockItem(STURDY_STEEL_DOOR, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)).setRegistryName(STURDY_STEEL_DOOR.getRegistryName()));
        event.getRegistry().register(new BlockItem(WARNING_STEEL_DOOR, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)).setRegistryName(WARNING_STEEL_DOOR.getRegistryName()));
        event.getRegistry().register(new BlockItem(WHITE_STEEL_DOOR, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)).setRegistryName(WHITE_STEEL_DOOR.getRegistryName()));
        event.getRegistry().register(new BlockItem(STURDY_WHITE_STEEL_DOOR, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)).setRegistryName(STURDY_WHITE_STEEL_DOOR.getRegistryName()));
        event.getRegistry().register(new BlockItem(WARNING_WHITE_STEEL_DOOR, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)).setRegistryName(WARNING_WHITE_STEEL_DOOR.getRegistryName()));
        event.getRegistry().register(new BlockItem(RUSTY_DOOR, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)).setRegistryName(RUSTY_DOOR.getRegistryName()));
        event.getRegistry().register(new BlockItem(STURDY_RUSTY_DOOR, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)).setRegistryName(STURDY_RUSTY_DOOR.getRegistryName()));
        event.getRegistry().register(new BlockItem(WARNING_RUSTY_DOOR, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)).setRegistryName(WARNING_RUSTY_DOOR.getRegistryName()));

        // Stairs

        event.getRegistry().register(new BlockItem(STEEL_SUSPENDED_STAIRS, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)).setRegistryName(STEEL_SUSPENDED_STAIRS.getRegistryName()));
        // event.getRegistry().register(
        // new FuelBlockItem(OAK_SUSPENDED_STAIRS, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT),
        // ECConstants.suspendedStairBurnTime).setRegistryName(OAK_SUSPENDED_STAIRS.getRegistryName()));
        // event.getRegistry().register(
        // new FuelBlockItem(BIRCH_SUSPENDED_STAIRS, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT),
        // ECConstants.suspendedStairBurnTime).setRegistryName(BIRCH_SUSPENDED_STAIRS.getRegistryName()));
        // event.getRegistry().register(
        // new FuelBlockItem(SPRUCE_SUSPENDED_STAIRS, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT),
        // ECConstants.suspendedStairBurnTime).setRegistryName(SPRUCE_SUSPENDED_STAIRS.getRegistryName()));
        // event.getRegistry().register(
        // new FuelBlockItem(JUNGLE_SUSPENDED_STAIRS, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT),
        // ECConstants.suspendedStairBurnTime).setRegistryName(JUNGLE_SUSPENDED_STAIRS.getRegistryName()));
        // event.getRegistry().register(new FuelBlockItem(DARK_OAK_SUSPENDED_STAIRS, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), ECConstants.suspendedStairBurnTime).setRegistryName(
        // DARK_OAK_SUSPENDED_STAIRS.getRegistryName()));
        // event.getRegistry().register(
        // new FuelBlockItem(ACACIA_SUSPENDED_STAIRS, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT),
        // ECConstants.suspendedStairBurnTime).setRegistryName(ACACIA_SUSPENDED_STAIRS.getRegistryName()));

        // Chests

        // event.getRegistry().register(new FuelBlockItem(OAK_FANCY_CHEST, new Item.Properties().setTEISR(() -> CustomChestItemStackTileEntityRenderer::new).group(
        // ModItemGroups.EMBELLISHCRAFT), ECConstants.chestBurnTime).setRegistryName(OAK_FANCY_CHEST.getRegistryName()));
        // event.getRegistry().register(new FuelBlockItem(BIRCH_FANCY_CHEST, new Item.Properties().setTEISR(() -> CustomChestItemStackTileEntityRenderer::new).group(
        // ModItemGroups.EMBELLISHCRAFT), ECConstants.chestBurnTime).setRegistryName(BIRCH_FANCY_CHEST.getRegistryName()));
        // event.getRegistry().register(new FuelBlockItem(SPRUCE_FANCY_CHEST, new Item.Properties().setTEISR(() -> CustomChestItemStackTileEntityRenderer::new).group(
        // ModItemGroups.EMBELLISHCRAFT), ECConstants.chestBurnTime).setRegistryName(SPRUCE_FANCY_CHEST.getRegistryName()));
        // event.getRegistry().register(new FuelBlockItem(JUNGLE_FANCY_CHEST, new Item.Properties().setTEISR(() -> CustomChestItemStackTileEntityRenderer::new).group(
        // ModItemGroups.EMBELLISHCRAFT), ECConstants.chestBurnTime).setRegistryName(JUNGLE_FANCY_CHEST.getRegistryName()));
        // event.getRegistry().register(new FuelBlockItem(DARK_OAK_FANCY_CHEST, new Item.Properties().setTEISR(() -> CustomChestItemStackTileEntityRenderer::new).group(
        // ModItemGroups.EMBELLISHCRAFT), ECConstants.chestBurnTime).setRegistryName(DARK_OAK_FANCY_CHEST.getRegistryName()));
        // event.getRegistry().register(new FuelBlockItem(ACACIA_FANCY_CHEST, new Item.Properties().setTEISR(() -> CustomChestItemStackTileEntityRenderer::new).group(
        // ModItemGroups.EMBELLISHCRAFT), ECConstants.chestBurnTime).setRegistryName(ACACIA_FANCY_CHEST.getRegistryName()));
        //
        // event.getRegistry().register(
        // new BlockItem(LOCKER, new Item.Properties().setTEISR(() -> VerticalChestItemStackTileEntityRenderer::new).group(ModItemGroups.EMBELLISHCRAFT)).setRegistryName(LOCKER.getRegistryName()));

        event.getRegistry().register(new BlockItem(OAK_WOODEN_CRATE, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT).maxStackSize(1)).setRegistryName(OAK_WOODEN_CRATE.getRegistryName()));
        event.getRegistry().register(new BlockItem(BIRCH_WOODEN_CRATE, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT).maxStackSize(1)).setRegistryName(BIRCH_WOODEN_CRATE.getRegistryName()));
        event.getRegistry().register(new BlockItem(SPRUCE_WOODEN_CRATE, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT).maxStackSize(1)).setRegistryName(SPRUCE_WOODEN_CRATE.getRegistryName()));
        event.getRegistry().register(new BlockItem(JUNGLE_WOODEN_CRATE, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT).maxStackSize(1)).setRegistryName(JUNGLE_WOODEN_CRATE.getRegistryName()));
        event.getRegistry().register(new BlockItem(DARK_OAK_WOODEN_CRATE, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT).maxStackSize(1)).setRegistryName(DARK_OAK_WOODEN_CRATE.getRegistryName()));
        event.getRegistry().register(new BlockItem(ACACIA_WOODEN_CRATE, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT).maxStackSize(1)).setRegistryName(ACACIA_WOODEN_CRATE.getRegistryName()));

    }
}