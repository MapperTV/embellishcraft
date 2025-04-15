package tv.mapper.embellishcraft.core;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.neoforge.registries.datamaps.builtin.FurnaceFuel;

public class ECConstants
{
    public static final String MODID = "embellishcraft";

    public static final FurnaceFuel chairBurnTime = new FurnaceFuel(600);
    public static final FurnaceFuel couchBurnTime = new FurnaceFuel(800);
    public static final FurnaceFuel suspendedStairBurnTime = new FurnaceFuel(150);
    public static final FurnaceFuel largeSuspendedStairBurnTime = new FurnaceFuel(250);
    public static final FurnaceFuel doorBurnTime = new FurnaceFuel(200);
    // public static final FurnaceFuel chestBurnTime = new FurnaceFuel(300);
    // public static final FurnaceFuel bedBurnTime = new FurnaceFuel(800);

    public static final Block[] McWoodenSlabs = {Blocks.ACACIA_SLAB, Blocks.BIRCH_SLAB, Blocks.DARK_OAK_SLAB, Blocks.JUNGLE_SLAB, Blocks.OAK_SLAB, Blocks.SPRUCE_SLAB, Blocks.WARPED_SLAB, Blocks.CRIMSON_SLAB, Blocks.CHERRY_SLAB, Blocks.MANGROVE_SLAB};
    public static final Block[] McWoodenPlanks = {Blocks.ACACIA_PLANKS, Blocks.BIRCH_PLANKS, Blocks.DARK_OAK_PLANKS, Blocks.JUNGLE_PLANKS, Blocks.OAK_PLANKS, Blocks.SPRUCE_PLANKS, Blocks.WARPED_PLANKS, Blocks.CRIMSON_PLANKS, Blocks.CHERRY_PLANKS, Blocks.MANGROVE_PLANKS};
    public static final Block[] McWoodenLogs = {Blocks.ACACIA_LOG, Blocks.BIRCH_LOG, Blocks.DARK_OAK_LOG, Blocks.JUNGLE_LOG, Blocks.OAK_LOG, Blocks.SPRUCE_LOG, Blocks.WARPED_STEM, Blocks.CRIMSON_STEM, Blocks.CHERRY_LOG, Blocks.MANGROVE_LOG};
    public static final Block[] McWoodenButtons = {Blocks.ACACIA_BUTTON, Blocks.BIRCH_BUTTON, Blocks.DARK_OAK_BUTTON, Blocks.JUNGLE_BUTTON, Blocks.OAK_BUTTON, Blocks.SPRUCE_BUTTON, Blocks.WARPED_BUTTON, Blocks.CRIMSON_BUTTON, Blocks.CHERRY_BUTTON, Blocks.MANGROVE_BUTTON};
    public static final Block[] McWoodenPressures = {Blocks.ACACIA_PRESSURE_PLATE, Blocks.BIRCH_PRESSURE_PLATE, Blocks.DARK_OAK_PRESSURE_PLATE, Blocks.JUNGLE_PRESSURE_PLATE, Blocks.OAK_PRESSURE_PLATE, Blocks.SPRUCE_PRESSURE_PLATE, Blocks.WARPED_PRESSURE_PLATE, Blocks.CRIMSON_PRESSURE_PLATE, Blocks.CHERRY_PRESSURE_PLATE, Blocks.MANGROVE_PRESSURE_PLATE};

    public static final Block[] McWools = {Blocks.WHITE_WOOL, Blocks.ORANGE_WOOL, Blocks.MAGENTA_WOOL, Blocks.LIGHT_BLUE_WOOL, Blocks.YELLOW_WOOL, Blocks.LIME_WOOL, Blocks.PINK_WOOL, Blocks.GRAY_WOOL, Blocks.LIGHT_GRAY_WOOL, Blocks.CYAN_WOOL, Blocks.PURPLE_WOOL, Blocks.BLUE_WOOL, Blocks.BROWN_WOOL, Blocks.GREEN_WOOL, Blocks.RED_WOOL, Blocks.BLACK_WOOL};

    public static final String frColorsM[] = {"blanc", "orange", "magenta", "bleu clair", "jaune", "vert clair", "rose", "gris", "gris clair", "cyan", "violet", "bleu", "marron", "vert", "rouge", "noir"};
    public static final String frColorsF[] = {"blanche", "orange", "magenta", "bleu claire", "jaune", "vert claire", "rose", "grise", "gris claire", "cyan", "violette", "bleue", "marron", "verte", "rouge", "noire"};

}