package tv.mapper.embellishcraft.block;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.apache.commons.lang3.tuple.Pair;

import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.FenceBlock;
import net.minecraft.world.level.block.FenceGateBlock;
import net.minecraft.world.level.block.PressurePlateBlock;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import tv.mapper.embellishcraft.ECConstants;
import tv.mapper.embellishcraft.EmbellishCraft;
import tv.mapper.embellishcraft.tileentity.ModTileEntityTypes;
import tv.mapper.embellishcraft.util.CustomChestType;
import tv.mapper.embellishcraft.util.McWoods;
import tv.mapper.embellishcraft.util.WoodsType;
import tv.mapper.mapperbase.world.level.block.AllRotationBlock;
import tv.mapper.mapperbase.world.level.block.CustomBlock;
import tv.mapper.mapperbase.world.level.block.CustomDoorBlock;
import tv.mapper.mapperbase.world.level.block.CustomLadderBlock;
import tv.mapper.mapperbase.world.level.block.CustomPressurePlateBlock;
import tv.mapper.mapperbase.world.level.block.CustomSlabBlock;
import tv.mapper.mapperbase.world.level.block.CustomStairsBlock;
import tv.mapper.mapperbase.world.level.block.CustomWallBlock;
import tv.mapper.mapperbase.world.level.block.ToolTypes;
import tv.mapper.mapperbase.world.level.block.UpDownBlock;

public class ECBlockRegistry
{
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ECConstants.MODID);

    public static List<RegistryObject<CustomChestBlock>> FANCY_CHESTS = new ArrayList<>();
    public static List<RegistryObject<CustomBedBlock>> FANCY_BEDS = new ArrayList<>();
    public static List<RegistryObject<CrateBlock>> CRATES = new ArrayList<>();
    public static List<RegistryObject<? extends Block>> CUTOUT_BLOCKS = new ArrayList<>();

    // Other bricks
    public static final RegistryObject<CustomBlock> DARK_BRICKS = BLOCKS.register("dark_bricks", () -> new CustomBlock(Block.Properties.of(Material.STONE, MaterialColor.NETHER).strength(1.5F, 6.0F), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> DARK_BRICKS_STAIRS = BLOCKS.register("dark_bricks_stairs", () -> new CustomStairsBlock(() -> DARK_BRICKS.get().defaultBlockState(), Block.Properties.of(Material.STONE, MaterialColor.NETHER).strength(1.5F, 6.0F), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> DARK_BRICKS_SLAB = BLOCKS.register("dark_bricks_slab", () -> new CustomSlabBlock(Block.Properties.of(Material.STONE, MaterialColor.NETHER).strength(1.5F, 6.0F), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomWallBlock> DARK_BRICKS_WALL = BLOCKS.register("dark_bricks_wall", () -> new CustomWallBlock(Block.Properties.of(Material.STONE, MaterialColor.NETHER).strength(1.5F, 6.0F), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> DARK_BRICKS_PRESSURE_PLATE = BLOCKS.register("dark_bricks_pressure_plate", () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.of(Material.STONE, MaterialColor.NETHER).noCollission().strength(1.5F, 6.0F), ToolTypes.PICKAXE));

    public static final RegistryObject<CustomBlock> DARK_LARGE_BRICKS = BLOCKS.register("dark_large_bricks", () -> new CustomBlock(Block.Properties.of(Material.STONE, MaterialColor.NETHER).strength(1.5F, 6.0F), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> DARK_LARGE_BRICKS_STAIRS = BLOCKS.register("dark_large_bricks_stairs", () -> new CustomStairsBlock(() -> DARK_LARGE_BRICKS.get().defaultBlockState(), Block.Properties.of(Material.STONE, MaterialColor.NETHER).strength(1.5F, 6.0F), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> DARK_LARGE_BRICKS_SLAB = BLOCKS.register("dark_large_bricks_slab", () -> new CustomSlabBlock(Block.Properties.of(Material.STONE, MaterialColor.NETHER).strength(1.5F, 6.0F), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomWallBlock> DARK_LARGE_BRICKS_WALL = BLOCKS.register("dark_large_bricks_wall", () -> new CustomWallBlock(Block.Properties.of(Material.STONE, MaterialColor.NETHER).strength(1.5F, 6.0F), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> DARK_LARGE_BRICKS_PRESSURE_PLATE = BLOCKS.register("dark_large_bricks_pressure_plate", () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.of(Material.STONE, MaterialColor.NETHER).noCollission().strength(1.5F, 6.0F), ToolTypes.PICKAXE));

    public static final RegistryObject<CustomBlock> OLD_BRICKS = BLOCKS.register("old_bricks", () -> new CustomBlock(Block.Properties.of(Material.STONE, MaterialColor.NETHER).strength(1.5F, 6.0F), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> OLD_BRICKS_STAIRS = BLOCKS.register("old_bricks_stairs", () -> new CustomStairsBlock(() -> OLD_BRICKS.get().defaultBlockState(), Block.Properties.of(Material.STONE, MaterialColor.NETHER).strength(1.5F, 6.0F), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> OLD_BRICKS_SLAB = BLOCKS.register("old_bricks_slab", () -> new CustomSlabBlock(Block.Properties.of(Material.STONE, MaterialColor.NETHER).strength(1.5F, 6.0F), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomWallBlock> OLD_BRICKS_WALL = BLOCKS.register("old_bricks_wall", () -> new CustomWallBlock(Block.Properties.of(Material.STONE, MaterialColor.NETHER).strength(1.5F, 6.0F), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> OLD_BRICKS_PRESSURE_PLATE = BLOCKS.register("old_bricks_pressure_plate", () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.of(Material.STONE, MaterialColor.NETHER).noCollission().strength(1.5F, 6.0F), ToolTypes.PICKAXE));

    public static final RegistryObject<CustomBlock> OLD_LARGE_BRICKS = BLOCKS.register("old_large_bricks", () -> new CustomBlock(Block.Properties.of(Material.STONE, MaterialColor.NETHER).strength(1.5F, 6.0F), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> OLD_LARGE_BRICKS_STAIRS = BLOCKS.register("old_large_bricks_stairs", () -> new CustomStairsBlock(() -> OLD_LARGE_BRICKS.get().defaultBlockState(), Block.Properties.of(Material.STONE, MaterialColor.NETHER).strength(1.5F, 6.0F), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> OLD_LARGE_BRICKS_SLAB = BLOCKS.register("old_large_bricks_slab", () -> new CustomSlabBlock(Block.Properties.of(Material.STONE, MaterialColor.NETHER).strength(1.5F, 6.0F), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomWallBlock> OLD_LARGE_BRICKS_WALL = BLOCKS.register("old_large_bricks_wall", () -> new CustomWallBlock(Block.Properties.of(Material.STONE, MaterialColor.NETHER).strength(1.5F, 6.0F), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> OLD_LARGE_BRICKS_PRESSURE_PLATE = BLOCKS.register("old_large_bricks_pressure_plate", () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.of(Material.STONE, MaterialColor.NETHER).noCollission().strength(1.5F, 6.0F), ToolTypes.PICKAXE));

    public static final RegistryObject<CustomBlock> WEARED_BRICKS = BLOCKS.register("weared_bricks", () -> new CustomBlock(Block.Properties.of(Material.STONE, MaterialColor.NETHER).strength(1.5F, 6.0F), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> WEARED_BRICKS_STAIRS = BLOCKS.register("weared_bricks_stairs", () -> new CustomStairsBlock(() -> WEARED_BRICKS.get().defaultBlockState(), Block.Properties.of(Material.STONE, MaterialColor.NETHER).strength(1.5F, 6.0F), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> WEARED_BRICKS_SLAB = BLOCKS.register("weared_bricks_slab", () -> new CustomSlabBlock(Block.Properties.of(Material.STONE, MaterialColor.NETHER).strength(1.5F, 6.0F), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomWallBlock> WEARED_BRICKS_WALL = BLOCKS.register("weared_bricks_wall", () -> new CustomWallBlock(Block.Properties.of(Material.STONE, MaterialColor.NETHER).strength(1.5F, 6.0F), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> WEARED_BRICKS_PRESSURE_PLATE = BLOCKS.register("weared_bricks_pressure_plate", () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.of(Material.STONE, MaterialColor.NETHER).noCollission().strength(1.5F, 6.0F), ToolTypes.PICKAXE));

    public static final RegistryObject<CustomBlock> WEARED_LARGE_BRICKS = BLOCKS.register("weared_large_bricks", () -> new CustomBlock(Block.Properties.of(Material.STONE, MaterialColor.NETHER).strength(1.5F, 6.0F), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> WEARED_LARGE_BRICKS_STAIRS = BLOCKS.register("weared_large_bricks_stairs", () -> new CustomStairsBlock(() -> WEARED_LARGE_BRICKS.get().defaultBlockState(), Block.Properties.of(Material.STONE, MaterialColor.NETHER).strength(1.5F, 6.0F), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> WEARED_LARGE_BRICKS_SLAB = BLOCKS.register("weared_large_bricks_slab", () -> new CustomSlabBlock(Block.Properties.of(Material.STONE, MaterialColor.NETHER).strength(1.5F, 6.0F), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomWallBlock> WEARED_LARGE_BRICKS_WALL = BLOCKS.register("weared_large_bricks_wall", () -> new CustomWallBlock(Block.Properties.of(Material.STONE, MaterialColor.NETHER).strength(1.5F, 6.0F), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> WEARED_LARGE_BRICKS_PRESSURE_PLATE = BLOCKS.register("weared_large_bricks_pressure_plate", () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.of(Material.STONE, MaterialColor.NETHER).noCollission().strength(1.5F, 6.0F), ToolTypes.PICKAXE));

    // Pavings
    public static final RegistryObject<CustomBlock> CONCRETE_PAVING = BLOCKS.register("concrete_paving", () -> new CustomBlock(Block.Properties.of(Material.STONE, MaterialColor.STONE).strength(1.5F, 6.0F), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> CONCRETE_PAVING_STAIRS = BLOCKS.register("concrete_paving_stairs", () -> new CustomStairsBlock(() -> CONCRETE_PAVING.get().defaultBlockState(), Block.Properties.of(Material.STONE, MaterialColor.STONE).strength(1.5F, 6.0F), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> CONCRETE_PAVING_SLAB = BLOCKS.register("concrete_paving_slab", () -> new CustomSlabBlock(Block.Properties.of(Material.STONE, MaterialColor.STONE).strength(1.5F, 6.0F), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomWallBlock> CONCRETE_PAVING_WALL = BLOCKS.register("concrete_paving_wall", () -> new CustomWallBlock(Block.Properties.of(Material.STONE, MaterialColor.STONE).strength(1.5F, 6.0F), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> CONCRETE_PAVING_PRESSURE_PLATE = BLOCKS.register("concrete_paving_pressure_plate", () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.of(Material.STONE, MaterialColor.STONE).noCollission().strength(1.5F, 6.0F), ToolTypes.PICKAXE));

    public static final RegistryObject<CustomBlock> DAMAGED_PAVING = BLOCKS.register("damaged_paving", () -> new CustomBlock(Block.Properties.of(Material.STONE, MaterialColor.STONE).strength(1.5F, 6.0F), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> DAMAGED_PAVING_STAIRS = BLOCKS.register("damaged_paving_stairs", () -> new CustomStairsBlock(() -> DAMAGED_PAVING.get().defaultBlockState(), Block.Properties.of(Material.STONE, MaterialColor.STONE).strength(1.5F, 6.0F), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> DAMAGED_PAVING_SLAB = BLOCKS.register("damaged_paving_slab", () -> new CustomSlabBlock(Block.Properties.of(Material.STONE, MaterialColor.STONE).strength(1.5F, 6.0F), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomWallBlock> DAMAGED_PAVING_WALL = BLOCKS.register("damaged_paving_wall", () -> new CustomWallBlock(Block.Properties.of(Material.STONE, MaterialColor.STONE).strength(1.5F, 6.0F), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> DAMAGED_PAVING_PRESSURE_PLATE = BLOCKS.register("damaged_paving_pressure_plate", () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.of(Material.STONE, MaterialColor.STONE).noCollission().strength(1.5F, 6.0F), ToolTypes.PICKAXE));

    public static final RegistryObject<CustomBlock> DARK_CONCRETE_PAVING = BLOCKS.register("dark_concrete_paving", () -> new CustomBlock(Block.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_BLACK).strength(1.5F, 6.0F), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> DARK_CONCRETE_PAVING_STAIRS = BLOCKS.register("dark_concrete_paving_stairs", () -> new CustomStairsBlock(() -> DARK_CONCRETE_PAVING.get().defaultBlockState(), Block.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_BLACK).strength(1.5F, 6.0F), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> DARK_CONCRETE_PAVING_SLAB = BLOCKS.register("dark_concrete_paving_slab", () -> new CustomSlabBlock(Block.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_BLACK).strength(1.5F, 6.0F), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomWallBlock> DARK_CONCRETE_PAVING_WALL = BLOCKS.register("dark_concrete_paving_wall", () -> new CustomWallBlock(Block.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_BLACK).strength(1.5F, 6.0F), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> DARK_CONCRETE_PAVING_PRESSURE_PLATE = BLOCKS.register("dark_concrete_paving_pressure_plate", () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_BLACK).noCollission().strength(1.5F, 6.0F), ToolTypes.PICKAXE));

    public static final RegistryObject<CustomBlock> MOIST_PAVING = BLOCKS.register("moist_paving", () -> new CustomBlock(Block.Properties.of(Material.STONE, MaterialColor.STONE).strength(1.5F, 6.0F), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> MOIST_PAVING_STAIRS = BLOCKS.register("moist_paving_stairs", () -> new CustomStairsBlock(() -> MOIST_PAVING.get().defaultBlockState(), Block.Properties.of(Material.STONE, MaterialColor.STONE).strength(1.5F, 6.0F), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> MOIST_PAVING_SLAB = BLOCKS.register("moist_paving_slab", () -> new CustomSlabBlock(Block.Properties.of(Material.STONE, MaterialColor.STONE).strength(1.5F, 6.0F), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomWallBlock> MOIST_PAVING_WALL = BLOCKS.register("moist_paving_wall", () -> new CustomWallBlock(Block.Properties.of(Material.STONE, MaterialColor.STONE).strength(1.5F, 6.0F), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> MOIST_PAVING_PRESSURE_PLATE = BLOCKS.register("moist_paving_pressure_plate", () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.of(Material.STONE, MaterialColor.STONE).noCollission().strength(1.5F, 6.0F), ToolTypes.PICKAXE));

    public static final RegistryObject<CustomBlock> POLISHED_PAVING = BLOCKS.register("polished_paving", () -> new CustomBlock(Block.Properties.of(Material.STONE, MaterialColor.STONE).strength(1.5F, 6.0F), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> POLISHED_PAVING_STAIRS = BLOCKS.register("polished_paving_stairs", () -> new CustomStairsBlock(() -> POLISHED_PAVING.get().defaultBlockState(), Block.Properties.of(Material.STONE, MaterialColor.STONE).strength(1.5F, 6.0F), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> POLISHED_PAVING_SLAB = BLOCKS.register("polished_paving_slab", () -> new CustomSlabBlock(Block.Properties.of(Material.STONE, MaterialColor.STONE).strength(1.5F, 6.0F), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomWallBlock> POLISHED_PAVING_WALL = BLOCKS.register("polished_paving_wall", () -> new CustomWallBlock(Block.Properties.of(Material.STONE, MaterialColor.STONE).strength(1.5F, 6.0F), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> POLISHED_PAVING_PRESSURE_PLATE = BLOCKS.register("polished_paving_pressure_plate", () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.of(Material.STONE, MaterialColor.STONE).noCollission().strength(1.5F, 6.0F), ToolTypes.PICKAXE));

    public static final RegistryObject<CustomBlock> WHITE_CONCRETE_PAVING = BLOCKS.register("white_concrete_paving", () -> new CustomBlock(Block.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_WHITE).strength(1.5F, 6.0F), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> WHITE_CONCRETE_PAVING_STAIRS = BLOCKS.register("white_concrete_paving_stairs", () -> new CustomStairsBlock(() -> WHITE_CONCRETE_PAVING.get().defaultBlockState(), Block.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_WHITE).strength(1.5F, 6.0F), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> WHITE_CONCRETE_PAVING_SLAB = BLOCKS.register("white_concrete_paving_slab", () -> new CustomSlabBlock(Block.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_WHITE).strength(1.5F, 6.0F), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomWallBlock> WHITE_CONCRETE_PAVING_WALL = BLOCKS.register("white_concrete_paving_wall", () -> new CustomWallBlock(Block.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_WHITE).strength(1.5F, 6.0F), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> WHITE_CONCRETE_PAVING_PRESSURE_PLATE = BLOCKS.register("white_concrete_paving_pressure_plate", () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_WHITE).noCollission().strength(1.5F, 6.0F), ToolTypes.PICKAXE));

    // Tiles
    public static final RegistryObject<CustomBlock> CONCRETE_TILES = BLOCKS.register("concrete_tiles", () -> new CustomBlock(Block.Properties.of(Material.STONE, MaterialColor.STONE).strength(1.5F, 6.0F), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> CONCRETE_TILES_STAIRS = BLOCKS.register("concrete_tiles_stairs", () -> new CustomStairsBlock(() -> CONCRETE_TILES.get().defaultBlockState(), Block.Properties.of(Material.STONE, MaterialColor.STONE).strength(1.5F, 6.0F), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> CONCRETE_TILES_SLAB = BLOCKS.register("concrete_tiles_slab", () -> new CustomSlabBlock(Block.Properties.of(Material.STONE, MaterialColor.STONE).strength(1.5F, 6.0F), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomWallBlock> CONCRETE_TILES_WALL = BLOCKS.register("concrete_tiles_wall", () -> new CustomWallBlock(Block.Properties.of(Material.STONE, MaterialColor.STONE).strength(1.5F, 6.0F), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> CONCRETE_TILES_PRESSURE_PLATE = BLOCKS.register("concrete_tiles_pressure_plate", () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.of(Material.STONE, MaterialColor.STONE).noCollission().strength(1.5F, 6.0F), ToolTypes.PICKAXE));

    public static final RegistryObject<CustomBlock> SKYBLUE_TILES = BLOCKS.register("skyblue_tiles", () -> new CustomBlock(Block.Properties.of(Material.STONE, MaterialColor.COLOR_LIGHT_BLUE).strength(1.5F, 6.0F), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> SKYBLUE_TILES_STAIRS = BLOCKS.register("skyblue_tiles_stairs", () -> new CustomStairsBlock(() -> SKYBLUE_TILES.get().defaultBlockState(), Block.Properties.of(Material.STONE, MaterialColor.COLOR_LIGHT_BLUE).strength(1.5F, 6.0F), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> SKYBLUE_TILES_SLAB = BLOCKS.register("skyblue_tiles_slab", () -> new CustomSlabBlock(Block.Properties.of(Material.STONE, MaterialColor.COLOR_LIGHT_BLUE).strength(1.5F, 6.0F), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomWallBlock> SKYBLUE_TILES_WALL = BLOCKS.register("skyblue_tiles_wall", () -> new CustomWallBlock(Block.Properties.of(Material.STONE, MaterialColor.COLOR_LIGHT_BLUE).strength(1.5F, 6.0F), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> SKYBLUE_TILES_PRESSURE_PLATE = BLOCKS.register("skyblue_tiles_pressure_plate", () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.of(Material.STONE, MaterialColor.COLOR_LIGHT_BLUE).noCollission().strength(1.5F, 6.0F), ToolTypes.PICKAXE));

    public static final RegistryObject<CustomBlock> ORANGE_TILES = BLOCKS.register("orange_tiles", () -> new CustomBlock(Block.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_ORANGE).strength(1.5F, 6.0F), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> ORANGE_TILES_STAIRS = BLOCKS.register("orange_tiles_stairs", () -> new CustomStairsBlock(() -> ORANGE_TILES.get().defaultBlockState(), Block.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_ORANGE).strength(1.5F, 6.0F), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> ORANGE_TILES_SLAB = BLOCKS.register("orange_tiles_slab", () -> new CustomSlabBlock(Block.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_ORANGE).strength(1.5F, 6.0F), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomWallBlock> ORANGE_TILES_WALL = BLOCKS.register("orange_tiles_wall", () -> new CustomWallBlock(Block.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_ORANGE).strength(1.5F, 6.0F), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> ORANGE_TILES_PRESSURE_PLATE = BLOCKS.register("orange_tiles_pressure_plate", () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_ORANGE).noCollission().strength(1.5F, 6.0F), ToolTypes.PICKAXE));

    public static final RegistryObject<CustomBlock> BLUE_TILES = BLOCKS.register("blue_tiles", () -> new CustomBlock(Block.Properties.of(Material.STONE, MaterialColor.COLOR_BLUE).strength(1.5F, 6.0F), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> BLUE_TILES_STAIRS = BLOCKS.register("blue_tiles_stairs", () -> new CustomStairsBlock(() -> BLUE_TILES.get().defaultBlockState(), Block.Properties.of(Material.STONE, MaterialColor.COLOR_BLUE).strength(1.5F, 6.0F), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> BLUE_TILES_SLAB = BLOCKS.register("blue_tiles_slab", () -> new CustomSlabBlock(Block.Properties.of(Material.STONE, MaterialColor.COLOR_BLUE).strength(1.5F, 6.0F), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomWallBlock> BLUE_TILES_WALL = BLOCKS.register("blue_tiles_wall", () -> new CustomWallBlock(Block.Properties.of(Material.STONE, MaterialColor.COLOR_BLUE).strength(1.5F, 6.0F), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> BLUE_TILES_PRESSURE_PLATE = BLOCKS.register("blue_tiles_pressure_plate", () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.of(Material.STONE, MaterialColor.COLOR_BLUE).noCollission().strength(1.5F, 6.0F), ToolTypes.PICKAXE));

    public static final RegistryObject<CustomBlock> LIGHT_BLUE_TILES = BLOCKS.register("light_blue_tiles", () -> new CustomBlock(Block.Properties.of(Material.STONE, MaterialColor.COLOR_LIGHT_BLUE).strength(1.5F, 6.0F), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> LIGHT_BLUE_TILES_STAIRS = BLOCKS.register("light_blue_tiles_stairs", () -> new CustomStairsBlock(() -> LIGHT_BLUE_TILES.get().defaultBlockState(), Block.Properties.of(Material.STONE, MaterialColor.COLOR_LIGHT_BLUE).strength(1.5F, 6.0F), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> LIGHT_BLUE_TILES_SLAB = BLOCKS.register("light_blue_tiles_slab", () -> new CustomSlabBlock(Block.Properties.of(Material.STONE, MaterialColor.COLOR_LIGHT_BLUE).strength(1.5F, 6.0F), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomWallBlock> LIGHT_BLUE_TILES_WALL = BLOCKS.register("light_blue_tiles_wall", () -> new CustomWallBlock(Block.Properties.of(Material.STONE, MaterialColor.COLOR_LIGHT_BLUE).strength(1.5F, 6.0F), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> LIGHT_BLUE_TILES_PRESSURE_PLATE = BLOCKS.register("light_blue_tiles_pressure_plate", () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.of(Material.STONE, MaterialColor.COLOR_LIGHT_BLUE).noCollission().strength(1.5F, 6.0F), ToolTypes.PICKAXE));

    public static final RegistryObject<CustomBlock> RED_TILES = BLOCKS.register("red_tiles", () -> new CustomBlock(Block.Properties.of(Material.STONE, MaterialColor.COLOR_RED).strength(1.5F, 6.0F), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> RED_TILES_STAIRS = BLOCKS.register("red_tiles_stairs", () -> new CustomStairsBlock(() -> RED_TILES.get().defaultBlockState(), Block.Properties.of(Material.STONE, MaterialColor.COLOR_RED).strength(1.5F, 6.0F), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> RED_TILES_SLAB = BLOCKS.register("red_tiles_slab", () -> new CustomSlabBlock(Block.Properties.of(Material.STONE, MaterialColor.COLOR_RED).strength(1.5F, 6.0F), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomWallBlock> RED_TILES_WALL = BLOCKS.register("red_tiles_wall", () -> new CustomWallBlock(Block.Properties.of(Material.STONE, MaterialColor.COLOR_RED).strength(1.5F, 6.0F), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> RED_TILES_PRESSURE_PLATE = BLOCKS.register("red_tiles_pressure_plate", () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.of(Material.STONE, MaterialColor.COLOR_RED).noCollission().strength(1.5F, 6.0F), ToolTypes.PICKAXE));

    public static final RegistryObject<CustomBlock> WHITE_TILES = BLOCKS.register("white_tiles", () -> new CustomBlock(Block.Properties.of(Material.STONE, MaterialColor.QUARTZ).strength(1.5F, 6.0F), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> WHITE_TILES_STAIRS = BLOCKS.register("white_tiles_stairs", () -> new CustomStairsBlock(() -> WHITE_TILES.get().defaultBlockState(), Block.Properties.of(Material.STONE, MaterialColor.QUARTZ).strength(1.5F, 6.0F), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> WHITE_TILES_SLAB = BLOCKS.register("white_tiles_slab", () -> new CustomSlabBlock(Block.Properties.of(Material.STONE, MaterialColor.QUARTZ).strength(1.5F, 6.0F), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomWallBlock> WHITE_TILES_WALL = BLOCKS.register("white_tiles_wall", () -> new CustomWallBlock(Block.Properties.of(Material.STONE, MaterialColor.QUARTZ).strength(1.5F, 6.0F), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> WHITE_TILES_PRESSURE_PLATE = BLOCKS.register("white_tiles_pressure_plate", () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.of(Material.STONE, MaterialColor.QUARTZ).noCollission().strength(1.5F, 6.0F), ToolTypes.PICKAXE));

    public static final RegistryObject<CustomBlock> YELLOW_TILES = BLOCKS.register("yellow_tiles", () -> new CustomBlock(Block.Properties.of(Material.STONE, MaterialColor.COLOR_YELLOW).strength(1.5F, 6.0F), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> YELLOW_TILES_STAIRS = BLOCKS.register("yellow_tiles_stairs", () -> new CustomStairsBlock(() -> YELLOW_TILES.get().defaultBlockState(), Block.Properties.of(Material.STONE, MaterialColor.COLOR_YELLOW).strength(1.5F, 6.0F), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> YELLOW_TILES_SLAB = BLOCKS.register("yellow_tiles_slab", () -> new CustomSlabBlock(Block.Properties.of(Material.STONE, MaterialColor.COLOR_YELLOW).strength(1.5F, 6.0F), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomWallBlock> YELLOW_TILES_WALL = BLOCKS.register("yellow_tiles_wall", () -> new CustomWallBlock(Block.Properties.of(Material.STONE, MaterialColor.COLOR_YELLOW).strength(1.5F, 6.0F), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> YELLOW_TILES_PRESSURE_PLATE = BLOCKS.register("yellow_tiles_pressure_plate", () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.of(Material.STONE, MaterialColor.COLOR_YELLOW).noCollission().strength(1.5F, 6.0F), ToolTypes.PICKAXE));

    public static final RegistryObject<CustomBlock> YELLOW_GREY_TILES = BLOCKS.register("yellow_grey_tiles", () -> new CustomBlock(Block.Properties.of(Material.STONE, MaterialColor.COLOR_YELLOW).strength(1.5F, 6.0F), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> YELLOW_GREY_TILES_STAIRS = BLOCKS.register("yellow_grey_tiles_stairs", () -> new CustomStairsBlock(() -> YELLOW_GREY_TILES.get().defaultBlockState(), Block.Properties.of(Material.STONE, MaterialColor.COLOR_YELLOW).strength(1.5F, 6.0F), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> YELLOW_GREY_TILES_SLAB = BLOCKS.register("yellow_grey_tiles_slab", () -> new CustomSlabBlock(Block.Properties.of(Material.STONE, MaterialColor.COLOR_YELLOW).strength(1.5F, 6.0F), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomWallBlock> YELLOW_GREY_TILES_WALL = BLOCKS.register("yellow_grey_tiles_wall", () -> new CustomWallBlock(Block.Properties.of(Material.STONE, MaterialColor.COLOR_YELLOW).strength(1.5F, 6.0F), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> YELLOW_GREY_TILES_PRESSURE_PLATE = BLOCKS.register("yellow_grey_tiles_pressure_plate", () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.of(Material.STONE, MaterialColor.COLOR_YELLOW).noCollission().strength(1.5F, 6.0F), ToolTypes.PICKAXE));

    // Corrugated Metal Plates
    public static final Map<DyeColor, RegistryObject<CustomBlock>> CORRUGATED_METAL_PLATE_BLOCKS = Arrays.stream(DyeColor.values()).map(type -> Pair.of(type, BLOCKS.register(type.getSerializedName() + "_corrugated_metal_plate", () -> new CustomBlock(Block.Properties.of(Material.METAL, type.getMaterialColor()).strength(1.5F, 6.0F).sound(SoundType.METAL), ToolTypes.PICKAXE)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));
    public static final Map<DyeColor, RegistryObject<CustomStairsBlock>> CORRUGATED_METAL_PLATE_STAIRS = Arrays.stream(DyeColor.values()).map(type -> Pair.of(type, BLOCKS.register(type.getSerializedName() + "_corrugated_metal_plate_stairs", () -> new CustomStairsBlock(() -> CORRUGATED_METAL_PLATE_BLOCKS.get(type).get().defaultBlockState(), Block.Properties.of(Material.METAL, MaterialColor.COLOR_BLACK).strength(1.5F, 6.0F).sound(SoundType.METAL), ToolTypes.PICKAXE)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));
    public static final Map<DyeColor, RegistryObject<CustomSlabBlock>> CORRUGATED_METAL_PLATE_SLABS = Arrays.stream(DyeColor.values()).map(type -> Pair.of(type, BLOCKS.register(type.getSerializedName() + "_corrugated_metal_plate_slab", () -> new CustomSlabBlock(Block.Properties.of(Material.METAL, type.getMaterialColor()).strength(1.5F, 6.0F).sound(SoundType.METAL), ToolTypes.PICKAXE)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));
    public static final Map<DyeColor, RegistryObject<CustomWallBlock>> CORRUGATED_METAL_PLATE_WALLS = Arrays.stream(DyeColor.values()).map(type -> Pair.of(type, BLOCKS.register(type.getSerializedName() + "_corrugated_metal_plate_wall", () -> new CustomWallBlock(Block.Properties.of(Material.METAL, type.getMaterialColor()).strength(1.5F, 6.0F).sound(SoundType.METAL), ToolTypes.PICKAXE)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));
    public static final Map<DyeColor, RegistryObject<CustomPressurePlateBlock>> CORRUGATED_METAL_PLATE_PRESSURE_PLATES = Arrays.stream(DyeColor.values()).map(type -> Pair.of(type, BLOCKS.register(type.getSerializedName() + "_corrugated_metal_plate_pressure_plate", () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.of(Material.METAL, type.getMaterialColor()).strength(1.5F, 6.0F).sound(SoundType.METAL), ToolTypes.PICKAXE)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));
    public static final Map<DyeColor, RegistryObject<FenceBlock>> CORRUGATED_METAL_PLATE_FENCES = Arrays.stream(DyeColor.values()).map(type -> Pair.of(type, BLOCKS.register(type.getSerializedName() + "_corrugated_metal_plate_fence", () -> new FenceBlock(Block.Properties.of(Material.METAL, type.getMaterialColor()).strength(1.5F, 6.0F).sound(SoundType.METAL))))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));
    public static final Map<DyeColor, RegistryObject<FenceGateBlock>> CORRUGATED_METAL_PLATE_FENCE_GATES = Arrays.stream(DyeColor.values()).map(type -> Pair.of(type, BLOCKS.register(type.getSerializedName() + "_corrugated_metal_plate_fence_gate", () -> new FenceGateBlock(Block.Properties.of(Material.METAL, type.getMaterialColor()).strength(1.5F, 6.0F).sound(SoundType.METAL))))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    // Metal blocks
    public static final RegistryObject<CustomBlock> DARK_METAL_FLOOR = BLOCKS.register("dark_metal_floor", () -> new CustomBlock(Block.Properties.of(Material.METAL, MaterialColor.PODZOL).strength(1.5F, 6.0F).sound(SoundType.LANTERN), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> DARK_METAL_FLOOR_STAIRS = BLOCKS.register("dark_metal_floor_stairs", () -> new CustomStairsBlock(() -> DARK_METAL_FLOOR.get().defaultBlockState(), Block.Properties.of(Material.METAL, MaterialColor.PODZOL).strength(1.5F, 6.0F).sound(SoundType.LANTERN), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> DARK_METAL_FLOOR_SLAB = BLOCKS.register("dark_metal_floor_slab", () -> new CustomSlabBlock(Block.Properties.of(Material.METAL, MaterialColor.PODZOL).strength(1.5F, 6.0F).sound(SoundType.LANTERN), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomWallBlock> DARK_METAL_FLOOR_WALL = BLOCKS.register("dark_metal_floor_wall", () -> new CustomWallBlock(Block.Properties.of(Material.METAL, MaterialColor.PODZOL).strength(1.5F, 6.0F).sound(SoundType.LANTERN), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> DARK_METAL_FLOOR_PRESSURE_PLATE = BLOCKS.register("dark_metal_floor_pressure_plate", () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.of(Material.METAL, MaterialColor.PODZOL).noCollission().strength(1.5F, 6.0F).sound(SoundType.LANTERN), ToolTypes.PICKAXE));

    public static final RegistryObject<CustomBlock> LIGHT_METAL_FLOOR = BLOCKS.register("light_metal_floor", () -> new CustomBlock(Block.Properties.of(Material.METAL, MaterialColor.CLAY).strength(1.5F, 6.0F).sound(SoundType.LANTERN), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> LIGHT_METAL_FLOOR_STAIRS = BLOCKS.register("light_metal_floor_stairs", () -> new CustomStairsBlock(() -> LIGHT_METAL_FLOOR.get().defaultBlockState(), Block.Properties.of(Material.METAL, MaterialColor.CLAY).strength(1.5F, 6.0F).sound(SoundType.LANTERN), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> LIGHT_METAL_FLOOR_SLAB = BLOCKS.register("light_metal_floor_slab", () -> new CustomSlabBlock(Block.Properties.of(Material.METAL, MaterialColor.CLAY).strength(1.5F, 6.0F).sound(SoundType.LANTERN), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomWallBlock> LIGHT_METAL_FLOOR_WALL = BLOCKS.register("light_metal_floor_wall", () -> new CustomWallBlock(Block.Properties.of(Material.METAL, MaterialColor.CLAY).strength(1.5F, 6.0F).sound(SoundType.LANTERN), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> LIGHT_METAL_FLOOR_PRESSURE_PLATE = BLOCKS.register("light_metal_floor_pressure_plate", () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.of(Material.METAL, MaterialColor.CLAY).noCollission().strength(1.5F, 6.0F).sound(SoundType.LANTERN), ToolTypes.PICKAXE));

    public static final RegistryObject<CustomBlock> RUSTY_PLATE = BLOCKS.register("rusty_plate", () -> new CustomBlock(Block.Properties.of(Material.METAL, MaterialColor.TERRACOTTA_ORANGE).strength(1.5F, 6.0F).sound(SoundType.LANTERN), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> RUSTY_PLATE_STAIRS = BLOCKS.register("rusty_plate_stairs", () -> new CustomStairsBlock(() -> RUSTY_PLATE.get().defaultBlockState(), Block.Properties.of(Material.METAL, MaterialColor.TERRACOTTA_ORANGE).strength(1.5F, 6.0F).sound(SoundType.LANTERN), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> RUSTY_PLATE_SLAB = BLOCKS.register("rusty_plate_slab", () -> new CustomSlabBlock(Block.Properties.of(Material.METAL, MaterialColor.TERRACOTTA_ORANGE).strength(1.5F, 6.0F).sound(SoundType.LANTERN), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomWallBlock> RUSTY_PLATE_WALL = BLOCKS.register("rusty_plate_wall", () -> new CustomWallBlock(Block.Properties.of(Material.METAL, MaterialColor.TERRACOTTA_ORANGE).strength(1.5F, 6.0F).sound(SoundType.LANTERN), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> RUSTY_PLATE_PRESSURE_PLATE = BLOCKS.register("rusty_plate_pressure_plate", () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.of(Material.METAL, MaterialColor.TERRACOTTA_ORANGE).noCollission().strength(1.5F, 6.0F).sound(SoundType.LANTERN), ToolTypes.PICKAXE));

    public static final RegistryObject<RotatedPillarBlock> IRON_BEAM = BLOCKS.register("iron_beam", () -> new RotatedPillarBlock(Block.Properties.of(Material.METAL, MaterialColor.METAL).strength(0.8F).sound(SoundType.LANTERN)));
    public static final RegistryObject<RotatedPillarBlock> BOLTED_IRON_BEAM = BLOCKS.register("bolted_iron_beam", () -> new RotatedPillarBlock(Block.Properties.of(Material.METAL, MaterialColor.METAL).strength(0.8F).sound(SoundType.LANTERN)));
    public static final RegistryObject<CustomBlock> IRON_BEAM_JUNCTION = BLOCKS.register("iron_beam_junction", () -> new CustomBlock(Block.Properties.of(Material.METAL, MaterialColor.METAL).strength(0.8F).sound(SoundType.LANTERN), ToolTypes.PICKAXE));

    public static final RegistryObject<RotatedPillarBlock> STEEL_BEAM = BLOCKS.register("steel_beam", () -> new RotatedPillarBlock(Block.Properties.of(Material.METAL, MaterialColor.METAL).strength(0.8F).sound(SoundType.LANTERN)));
    public static final RegistryObject<RotatedPillarBlock> BOLTED_STEEL_BEAM = BLOCKS.register("bolted_steel_beam", () -> new RotatedPillarBlock(Block.Properties.of(Material.METAL, MaterialColor.METAL).strength(0.8F).sound(SoundType.LANTERN)));
    public static final RegistryObject<CustomBlock> STEEL_BEAM_JUNCTION = BLOCKS.register("steel_beam_junction", () -> new CustomBlock(Block.Properties.of(Material.METAL, MaterialColor.METAL).strength(0.8F).sound(SoundType.LANTERN), ToolTypes.PICKAXE));

    public static final RegistryObject<CustomBlock> AIR_DUCT = BLOCKS.register("air_duct", () -> new CustomBlock(Block.Properties.of(Material.METAL, MaterialColor.METAL).strength(0.8F).sound(SoundType.LANTERN), ToolTypes.PICKAXE));
    public static final RegistryObject<AllRotationBlock> VENT_AIR_DUCT = BLOCKS.register("vent_air_duct", () -> new AllRotationBlock(Block.Properties.of(Material.METAL, MaterialColor.METAL).strength(0.8F).sound(SoundType.LANTERN), ToolTypes.PICKAXE));
    public static final RegistryObject<AllRotationBlock> GRID_AIR_DUCT = BLOCKS.register("grid_air_duct", () -> new AllRotationBlock(Block.Properties.of(Material.METAL, MaterialColor.METAL).strength(0.8F).sound(SoundType.LANTERN), ToolTypes.PICKAXE));

    public static final RegistryObject<CustomBlock> BULKHEAD = BLOCKS.register("bulkhead", () -> new CustomBlock(Block.Properties.of(Material.METAL, MaterialColor.STONE).strength(0.8F).sound(SoundType.METAL), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomBlock> BULKHEAD_TOP = BLOCKS.register("bulkhead_top", () -> new CustomBlock(Block.Properties.of(Material.METAL, MaterialColor.STONE).strength(0.8F).sound(SoundType.METAL), ToolTypes.PICKAXE));

    public static final RegistryObject<CustomLadderBlock> STEEL_WALL_LADDER = BLOCKS.register("steel_wall_ladder", () -> new CustomLadderBlock(Block.Properties.of(Material.METAL, MaterialColor.METAL).strength(0.8F).sound(SoundType.LANTERN).noOcclusion(), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomLadderBlock> RUSTY_WALL_LADDER = BLOCKS.register("rusty_wall_ladder", () -> new CustomLadderBlock(Block.Properties.of(Material.METAL, MaterialColor.METAL).strength(0.8F).sound(SoundType.LANTERN).noOcclusion(), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomLadderBlock> STEEL_RUNGS = BLOCKS.register("steel_rungs", () -> new CustomLadderBlock(Block.Properties.of(Material.METAL, MaterialColor.METAL).strength(0.8F).sound(SoundType.LANTERN).noOcclusion(), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomLadderBlock> RUSTY_RUNGS = BLOCKS.register("rusty_rungs", () -> new CustomLadderBlock(Block.Properties.of(Material.METAL, MaterialColor.METAL).strength(0.8F).sound(SoundType.LANTERN).noOcclusion(), ToolTypes.PICKAXE));

    // Wallpapers
    public static final RegistryObject<CustomBlock> WHITE_BLUE_WALLPAPER = BLOCKS.register("white_blue_wallpaper", () -> new CustomBlock(Block.Properties.of(Material.STONE, MaterialColor.STONE).strength(1.5F, 6.0F), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> WHITE_BLUE_WALLPAPER_STAIRS = BLOCKS.register("white_blue_wallpaper_stairs", () -> new CustomStairsBlock(() -> WHITE_BLUE_WALLPAPER.get().defaultBlockState(), Block.Properties.of(Material.STONE, MaterialColor.STONE).strength(1.5F, 6.0F), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> WHITE_BLUE_WALLPAPER_SLAB = BLOCKS.register("white_blue_wallpaper_slab", () -> new CustomSlabBlock(Block.Properties.of(Material.STONE, MaterialColor.STONE).strength(1.5F, 6.0F), ToolTypes.PICKAXE));
    public static final RegistryObject<UpDownBlock> WHITE_BLUE_WALLPAPER_PLINTH = BLOCKS.register("white_blue_wallpaper_plinth", () -> new UpDownBlock(Block.Properties.of(Material.STONE, MaterialColor.STONE).strength(1.5F, 6.0F), ToolTypes.PICKAXE));

    public static final RegistryObject<CustomBlock> BEIGE_FLOWER_WALLPAPER = BLOCKS.register("beige_flower_wallpaper", () -> new CustomBlock(Block.Properties.of(Material.STONE, MaterialColor.STONE).strength(1.5F, 6.0F), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> BEIGE_FLOWER_WALLPAPER_STAIRS = BLOCKS.register("beige_flower_wallpaper_stairs", () -> new CustomStairsBlock(() -> BEIGE_FLOWER_WALLPAPER.get().defaultBlockState(), Block.Properties.of(Material.STONE, MaterialColor.STONE).strength(1.5F, 6.0F), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> BEIGE_FLOWER_WALLPAPER_SLAB = BLOCKS.register("beige_flower_wallpaper_slab", () -> new CustomSlabBlock(Block.Properties.of(Material.STONE, MaterialColor.STONE).strength(1.5F, 6.0F), ToolTypes.PICKAXE));
    public static final RegistryObject<UpDownBlock> BEIGE_FLOWER_WALLPAPER_PLINTH = BLOCKS.register("beige_flower_wallpaper_plinth", () -> new UpDownBlock(Block.Properties.of(Material.STONE, MaterialColor.STONE).strength(1.5F, 6.0F), ToolTypes.PICKAXE));

    public static final RegistryObject<CustomBlock> BEIGE_WALLPAPER = BLOCKS.register("beige_wallpaper", () -> new CustomBlock(Block.Properties.of(Material.STONE, MaterialColor.STONE).strength(1.5F, 6.0F), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> BEIGE_WALLPAPER_STAIRS = BLOCKS.register("beige_wallpaper_stairs", () -> new CustomStairsBlock(() -> BEIGE_WALLPAPER.get().defaultBlockState(), Block.Properties.of(Material.STONE, MaterialColor.STONE).strength(1.5F, 6.0F), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> BEIGE_WALLPAPER_SLAB = BLOCKS.register("beige_wallpaper_slab", () -> new CustomSlabBlock(Block.Properties.of(Material.STONE, MaterialColor.STONE).strength(1.5F, 6.0F), ToolTypes.PICKAXE));
    public static final RegistryObject<UpDownBlock> BEIGE_WALLPAPER_PLINTH = BLOCKS.register("beige_wallpaper_plinth", () -> new UpDownBlock(Block.Properties.of(Material.STONE, MaterialColor.STONE).strength(1.5F, 6.0F), ToolTypes.PICKAXE));

    public static final RegistryObject<CustomBlock> PINK_WALLPAPER = BLOCKS.register("pink_wallpaper", () -> new CustomBlock(Block.Properties.of(Material.STONE, MaterialColor.STONE).strength(1.5F, 6.0F), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> PINK_WALLPAPER_STAIRS = BLOCKS.register("pink_wallpaper_stairs", () -> new CustomStairsBlock(() -> PINK_WALLPAPER.get().defaultBlockState(), Block.Properties.of(Material.STONE, MaterialColor.STONE).strength(1.5F, 6.0F), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> PINK_WALLPAPER_SLAB = BLOCKS.register("pink_wallpaper_slab", () -> new CustomSlabBlock(Block.Properties.of(Material.STONE, MaterialColor.STONE).strength(1.5F, 6.0F), ToolTypes.PICKAXE));
    public static final RegistryObject<UpDownBlock> PINK_WALLPAPER_PLINTH = BLOCKS.register("pink_wallpaper_plinth", () -> new UpDownBlock(Block.Properties.of(Material.STONE, MaterialColor.STONE).strength(1.5F, 6.0F), ToolTypes.PICKAXE));

    public static final RegistryObject<CustomBlock> WHITE_GREEN_WALLPAPER = BLOCKS.register("white_green_wallpaper", () -> new CustomBlock(Block.Properties.of(Material.STONE, MaterialColor.STONE).strength(1.5F, 6.0F), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> WHITE_GREEN_WALLPAPER_STAIRS = BLOCKS.register("white_green_wallpaper_stairs", () -> new CustomStairsBlock(() -> WHITE_GREEN_WALLPAPER.get().defaultBlockState(), Block.Properties.of(Material.STONE, MaterialColor.STONE).strength(1.5F, 6.0F), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> WHITE_GREEN_WALLPAPER_SLAB = BLOCKS.register("white_green_wallpaper_slab", () -> new CustomSlabBlock(Block.Properties.of(Material.STONE, MaterialColor.STONE).strength(1.5F, 6.0F), ToolTypes.PICKAXE));
    public static final RegistryObject<UpDownBlock> WHITE_GREEN_WALLPAPER_PLINTH = BLOCKS.register("white_green_wallpaper_plinth", () -> new UpDownBlock(Block.Properties.of(Material.STONE, MaterialColor.STONE).strength(1.5F, 6.0F), ToolTypes.PICKAXE));

    // Furniture
    public static final Map<McWoods, RegistryObject<ChairBlock>> CHAIR_BLOCKS = Arrays.stream(McWoods.values()).map(type -> Pair.of(type, BLOCKS.register(type.getSerializedName() + "_chair", () -> new ChairBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(0.75F, 0.5F).sound(SoundType.WOOD), ToolTypes.AXE)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<McWoods, RegistryObject<TerraceChairBlock>> TERRACE_CHAIR_BLOCKS = Arrays.stream(McWoods.values()).map(type -> Pair.of(type, BLOCKS.register(type.getSerializedName() + "_terrace_chair", () -> new TerraceChairBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(0.75F, 0.5F).sound(SoundType.WOOD), ToolTypes.AXE)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<McWoods, RegistryObject<TableBlock>> TABLE_BLOCKS = Arrays.stream(McWoods.values()).map(type -> Pair.of(type, BLOCKS.register(type.getSerializedName() + "_table", () -> new TableBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(0.75F, 0.5F).sound(SoundType.WOOD), ToolTypes.AXE)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<McWoods, RegistryObject<FancyTableBlock>> FANCY_TABLE_BLOCKS = Arrays.stream(McWoods.values()).map(type -> Pair.of(type, BLOCKS.register(type.getSerializedName() + "_fancy_table", () -> new FancyTableBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(0.75F, 0.5F).sound(SoundType.WOOD), ToolTypes.AXE)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<McWoods, RegistryObject<TerraceTableBlock>> TERRACE_TABLE_BLOCKS = Arrays.stream(McWoods.values()).map(type -> Pair.of(type, BLOCKS.register(type.getSerializedName() + "_terrace_table", () -> new TerraceTableBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(0.75F, 0.5F).sound(SoundType.WOOD), ToolTypes.AXE)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final RegistryObject<TerraceTableBlock> STEEL_TERRACE_TABLE = BLOCKS.register("steel_terrace_table", () -> new TerraceTableBlock(Block.Properties.of(Material.METAL, MaterialColor.METAL).strength(0.75F, 0.5F).sound(SoundType.LANTERN), ToolTypes.PICKAXE));

    public static final RegistryObject<TerraceChairBlock> STEEL_TERRACE_CHAIR = BLOCKS.register("steel_terrace_chair", () -> new TerraceChairBlock(Block.Properties.of(Material.METAL, MaterialColor.METAL).strength(0.75F, 0.5F).sound(SoundType.LANTERN), ToolTypes.PICKAXE));

    public static final Map<DyeColor, RegistryObject<CouchBlock>> COUCH_BLOCKS = Arrays.stream(DyeColor.values()).map(type -> Pair.of(type, BLOCKS.register(type.getSerializedName() + "_couch", () -> new CouchBlock(Block.Properties.of(Material.WOOL, type.getMaterialColor()).strength(1.5F, 6.0F).sound(SoundType.WOOL), ToolTypes.PICKAXE)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<DyeColor, RegistryObject<LampBlock>> TABLE_LAMP_BLOCKS = Arrays.stream(DyeColor.values()).map(type -> Pair.of(type, BLOCKS.register(type.getSerializedName() + "_table_lamp", () -> new LampBlock(Block.Properties.of(Material.WOOL, type.getMaterialColor()).strength(1.5F, 6.0F).sound(SoundType.WOOL).lightLevel((state) -> 9), ToolTypes.PICKAXE, false)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));
    public static final Map<DyeColor, RegistryObject<LampBlock>> MANUAL_TABLE_LAMP_BLOCKS = Arrays.stream(DyeColor.values()).map(type -> Pair.of(type, BLOCKS.register(type.getSerializedName() + "_manual_table_lamp", () -> new LampBlock(Block.Properties.of(Material.WOOL, type.getMaterialColor()).strength(1.5F, 6.0F).sound(SoundType.WOOL).lightLevel((state) -> 9), ToolTypes.PICKAXE, true)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final RegistryObject<PlateBlock> PLATE = BLOCKS.register("plate", () -> new PlateBlock(Block.Properties.of(Material.GLASS, MaterialColor.QUARTZ).strength(0.25F).sound(SoundType.GLASS)));

    // Stairs
    public static final Map<McWoods, RegistryObject<SuspendedStairsBlock>> SUSPENDED_STAIRS_BLOCKS = Arrays.stream(McWoods.values()).map(type -> Pair.of(type, BLOCKS.register(type.getSerializedName() + "_suspended_stairs", () -> new SuspendedStairsBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(3.0F).sound(SoundType.WOOD), ToolTypes.AXE, false)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));
    public static final Map<McWoods, RegistryObject<SuspendedStairsBlock>> LARGE_SUSPENDED_STAIRS_BLOCKS = Arrays.stream(McWoods.values()).map(type -> Pair.of(type, BLOCKS.register(type.getSerializedName() + "_large_suspended_stairs", () -> new SuspendedStairsBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(3.0F).sound(SoundType.WOOD), ToolTypes.AXE, true)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final RegistryObject<SuspendedStairsBlock> STEEL_SUSPENDED_STAIRS = BLOCKS.register("steel_suspended_stairs", () -> new SuspendedStairsBlock(Block.Properties.of(Material.METAL, MaterialColor.METAL).strength(3.0F).sound(SoundType.LANTERN), ToolTypes.PICKAXE, false));
    public static final RegistryObject<SuspendedStairsBlock> RUSTY_SUSPENDED_STAIRS = BLOCKS.register("rusty_suspended_stairs", () -> new SuspendedStairsBlock(Block.Properties.of(Material.METAL, MaterialColor.METAL).strength(3.0F).sound(SoundType.LANTERN), ToolTypes.PICKAXE, false));
    public static final RegistryObject<SuspendedStairsBlock> STEEL_LARGE_SUSPENDED_STAIRS = BLOCKS.register("steel_large_suspended_stairs", () -> new SuspendedStairsBlock(Block.Properties.of(Material.METAL, MaterialColor.METAL).strength(3.0F).sound(SoundType.LANTERN), ToolTypes.PICKAXE, true));
    public static final RegistryObject<SuspendedStairsBlock> RUSTY_LARGE_SUSPENDED_STAIRS = BLOCKS.register("rusty_large_suspended_stairs", () -> new SuspendedStairsBlock(Block.Properties.of(Material.METAL, MaterialColor.METAL).strength(3.0F).sound(SoundType.LANTERN), ToolTypes.PICKAXE, true));

    // Doors
    public static final Map<McWoods, RegistryObject<CustomDoorBlock>> FANCY_DOOR_BLOCKS = Arrays.stream(McWoods.values()).map(type -> Pair.of(type, BLOCKS.register(type.getSerializedName() + "_fancy_door", () -> new CustomDoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(3.0F).sound(SoundType.WOOD), ToolTypes.AXE)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<McWoods, RegistryObject<CustomDoorBlock>> PLAIN_DOOR_BLOCKS = Arrays.stream(McWoods.values()).map(type -> Pair.of(type, BLOCKS.register(type.getSerializedName() + "_plain_door", () -> new CustomDoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(3.0F).sound(SoundType.WOOD), ToolTypes.AXE)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final RegistryObject<CustomDoorBlock> STEEL_DOOR = BLOCKS.register("steel_door", () -> new CustomDoorBlock(Block.Properties.of(Material.METAL, MaterialColor.METAL).strength(3.0F).sound(SoundType.LANTERN), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomDoorBlock> STURDY_STEEL_DOOR = BLOCKS.register("sturdy_steel_door", () -> new CustomDoorBlock(Block.Properties.of(Material.METAL, MaterialColor.METAL).strength(5.0F, 1200.0F).sound(SoundType.LANTERN), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomDoorBlock> WARNING_STEEL_DOOR = BLOCKS.register("warning_steel_door", () -> new CustomDoorBlock(Block.Properties.of(Material.METAL, MaterialColor.METAL).strength(3.0F).sound(SoundType.LANTERN), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomDoorBlock> WHITE_STEEL_DOOR = BLOCKS.register("white_steel_door", () -> new CustomDoorBlock(Block.Properties.of(Material.METAL, MaterialColor.METAL).strength(3.0F).sound(SoundType.LANTERN), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomDoorBlock> STURDY_WHITE_STEEL_DOOR = BLOCKS.register("sturdy_white_steel_door", () -> new CustomDoorBlock(Block.Properties.of(Material.METAL, MaterialColor.METAL).strength(5.0F, 1200.0F).sound(SoundType.LANTERN), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomDoorBlock> WARNING_WHITE_STEEL_DOOR = BLOCKS.register("warning_white_steel_door", () -> new CustomDoorBlock(Block.Properties.of(Material.METAL, MaterialColor.METAL).strength(3.0F).sound(SoundType.LANTERN), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomDoorBlock> RUSTY_DOOR = BLOCKS.register("rusty_door", () -> new CustomDoorBlock(Block.Properties.of(Material.METAL, MaterialColor.METAL).strength(3.0F).sound(SoundType.LANTERN), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomDoorBlock> STURDY_RUSTY_DOOR = BLOCKS.register("sturdy_rusty_door", () -> new CustomDoorBlock(Block.Properties.of(Material.METAL, MaterialColor.METAL).strength(5.0F, 1200.0F).sound(SoundType.LANTERN), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomDoorBlock> WARNING_RUSTY_DOOR = BLOCKS.register("warning_rusty_door", () -> new CustomDoorBlock(Block.Properties.of(Material.METAL, MaterialColor.METAL).strength(3.0F).sound(SoundType.LANTERN), ToolTypes.PICKAXE));

    // Pillows
    public static final Map<DyeColor, RegistryObject<PillowBlock>> PILLOW_BLOCKS = Arrays.stream(DyeColor.values()).map(type -> Pair.of(type, BLOCKS.register(type.getSerializedName() + "_pillow", () -> new PillowBlock(type, Block.Properties.of(Material.WOOL, type.getMaterialColor()).strength(0.25F).sound(SoundType.WOOL))))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    // Crates
    public static final Map<McWoods, RegistryObject<CrateBlock>> WOODEN_CRATE_BLOCKS = Arrays.stream(McWoods.values()).map(type -> Pair.of(type, BLOCKS.register(type.getSerializedName() + "_wooden_crate", () -> new CrateBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(2.5F).sound(SoundType.WOOD))))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    // Chests
    public static final Map<McWoods, RegistryObject<CustomChestBlock>> FANCY_CHEST_BLOCKS = Arrays.stream(McWoods.values()).map(type -> Pair.of(type, BLOCKS.register(type.getSerializedName() + "_fancy_chest", () -> new CustomChestBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(2.5F).sound(SoundType.WOOD), () ->
    {
        return ModTileEntityTypes.CUSTOM_CHEST;
    }, CustomChestType.OAK_FANCY, WoodsType.byId(type.getId()), ToolTypes.AXE)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final RegistryObject<VerticalChestBlock> LOCKER = BLOCKS.register("locker", () -> new VerticalChestBlock(Block.Properties.of(Material.METAL).strength(5F, 1200.0F).sound(SoundType.METAL)));

    // Beds
    public static final Map<DyeColor, RegistryObject<CustomBedBlock>> OAK_FANCY_BED_BLOCKS = Arrays.stream(DyeColor.values()).map(type -> Pair.of(type, BLOCKS.register(type.getSerializedName() + "_oak_fancy_bed", () -> new CustomBedBlock(type, WoodsType.OAK, Block.Properties.of(Material.WOOL).sound(SoundType.WOOD).strength(0.2F))))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));
    public static final Map<DyeColor, RegistryObject<CustomBedBlock>> BIRCH_FANCY_BED_BLOCKS = Arrays.stream(DyeColor.values()).map(type -> Pair.of(type, BLOCKS.register(type.getSerializedName() + "_birch_fancy_bed", () -> new CustomBedBlock(type, WoodsType.BIRCH, Block.Properties.of(Material.WOOL).sound(SoundType.WOOD).strength(0.2F))))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));
    public static final Map<DyeColor, RegistryObject<CustomBedBlock>> SPRUCE_FANCY_BED_BLOCKS = Arrays.stream(DyeColor.values()).map(type -> Pair.of(type, BLOCKS.register(type.getSerializedName() + "_spruce_fancy_bed", () -> new CustomBedBlock(type, WoodsType.SPRUCE, Block.Properties.of(Material.WOOL).sound(SoundType.WOOD).strength(0.2F))))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));
    public static final Map<DyeColor, RegistryObject<CustomBedBlock>> JUNGLE_FANCY_BED_BLOCKS = Arrays.stream(DyeColor.values()).map(type -> Pair.of(type, BLOCKS.register(type.getSerializedName() + "_jungle_fancy_bed", () -> new CustomBedBlock(type, WoodsType.JUNGLE, Block.Properties.of(Material.WOOL).sound(SoundType.WOOD).strength(0.2F))))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));
    public static final Map<DyeColor, RegistryObject<CustomBedBlock>> DARK_OAK_FANCY_BED_BLOCKS = Arrays.stream(DyeColor.values()).map(type -> Pair.of(type, BLOCKS.register(type.getSerializedName() + "_dark_oak_fancy_bed", () -> new CustomBedBlock(type, WoodsType.DARK_OAK, Block.Properties.of(Material.WOOL).sound(SoundType.WOOD).strength(0.2F))))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));
    public static final Map<DyeColor, RegistryObject<CustomBedBlock>> ACACIA_FANCY_BED_BLOCKS = Arrays.stream(DyeColor.values()).map(type -> Pair.of(type, BLOCKS.register(type.getSerializedName() + "_acacia_fancy_bed", () -> new CustomBedBlock(type, WoodsType.ACACIA, Block.Properties.of(Material.WOOL).sound(SoundType.WOOD).strength(0.2F))))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));
    public static final Map<DyeColor, RegistryObject<CustomBedBlock>> WARPED_FANCY_BED_BLOCKS = Arrays.stream(DyeColor.values()).map(type -> Pair.of(type, BLOCKS.register(type.getSerializedName() + "_warped_fancy_bed", () -> new CustomBedBlock(type, WoodsType.WARPED, Block.Properties.of(Material.NETHER_WOOD).sound(SoundType.WOOD).strength(0.2F))))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));
    public static final Map<DyeColor, RegistryObject<CustomBedBlock>> CRIMSON_FANCY_BED_BLOCKS = Arrays.stream(DyeColor.values()).map(type -> Pair.of(type, BLOCKS.register(type.getSerializedName() + "_crimson_fancy_bed", () -> new CustomBedBlock(type, WoodsType.CRIMSON, Block.Properties.of(Material.NETHER_WOOD).sound(SoundType.WOOD).strength(0.2F))))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static void init()
    {
        EmbellishCraft.LOGGER.info("1.1- EmbellishCraft: block registering.");
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    public static void postInit()
    {
        EmbellishCraft.LOGGER.info("1.2- EmbellishCraft: block listing.");
        for(int i = 0; i < McWoods.values().length; i++)
        {
            FANCY_CHESTS.add(FANCY_CHEST_BLOCKS.get(McWoods.byId(i)));
            CUTOUT_BLOCKS.add(TERRACE_CHAIR_BLOCKS.get(McWoods.byId(i)));
            CUTOUT_BLOCKS.add(TERRACE_TABLE_BLOCKS.get(McWoods.byId(i)));
            CRATES.add(WOODEN_CRATE_BLOCKS.get(McWoods.byId(i)));
        }

        CUTOUT_BLOCKS.add(STEEL_TERRACE_CHAIR);
        CUTOUT_BLOCKS.add(STEEL_TERRACE_TABLE);

        for(int i = 0; i < DyeColor.values().length; i++)
        {
            FANCY_BEDS.add(OAK_FANCY_BED_BLOCKS.get(DyeColor.byId(i)));
            FANCY_BEDS.add(BIRCH_FANCY_BED_BLOCKS.get(DyeColor.byId(i)));
            FANCY_BEDS.add(SPRUCE_FANCY_BED_BLOCKS.get(DyeColor.byId(i)));
            FANCY_BEDS.add(JUNGLE_FANCY_BED_BLOCKS.get(DyeColor.byId(i)));
            FANCY_BEDS.add(DARK_OAK_FANCY_BED_BLOCKS.get(DyeColor.byId(i)));
            FANCY_BEDS.add(ACACIA_FANCY_BED_BLOCKS.get(DyeColor.byId(i)));
        }
    }
}