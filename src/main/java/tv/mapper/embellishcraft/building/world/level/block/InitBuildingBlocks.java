package tv.mapper.embellishcraft.building.world.level.block;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

import org.apache.commons.lang3.tuple.Pair;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.PressurePlateBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import tv.mapper.embellishcraft.core.ECConstants;
import tv.mapper.embellishcraft.core.util.McWoods;
import tv.mapper.mapperbase.world.level.block.CustomBlock;
import tv.mapper.mapperbase.world.level.block.CustomDoorBlock;
import tv.mapper.mapperbase.world.level.block.CustomPressurePlateBlock;
import tv.mapper.mapperbase.world.level.block.CustomSlabBlock;
import tv.mapper.mapperbase.world.level.block.CustomStairsBlock;
import tv.mapper.mapperbase.world.level.block.CustomWallBlock;
import tv.mapper.mapperbase.world.level.block.ToolTypes;
import tv.mapper.mapperbase.world.level.block.UpDownBlock;

public class InitBuildingBlocks
{
    public static final DeferredRegister<Block> BUILDING_BLOCK_REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, ECConstants.MODID);

    // Other bricks
    public static final RegistryObject<CustomBlock> DARK_BRICKS = BUILDING_BLOCK_REGISTRY.register("dark_bricks", () -> new CustomBlock(Block.Properties.of(Material.STONE, MaterialColor.NETHER).strength(1.5F, 6.0F), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> DARK_BRICKS_STAIRS = BUILDING_BLOCK_REGISTRY.register("dark_bricks_stairs", () -> new CustomStairsBlock(() -> DARK_BRICKS.get().defaultBlockState(), Block.Properties.of(Material.STONE, MaterialColor.NETHER).strength(1.5F, 6.0F), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> DARK_BRICKS_SLAB = BUILDING_BLOCK_REGISTRY.register("dark_bricks_slab", () -> new CustomSlabBlock(Block.Properties.of(Material.STONE, MaterialColor.NETHER).strength(1.5F, 6.0F), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomWallBlock> DARK_BRICKS_WALL = BUILDING_BLOCK_REGISTRY.register("dark_bricks_wall", () -> new CustomWallBlock(Block.Properties.of(Material.STONE, MaterialColor.NETHER).strength(1.5F, 6.0F), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> DARK_BRICKS_PRESSURE_PLATE = BUILDING_BLOCK_REGISTRY.register("dark_bricks_pressure_plate", () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.of(Material.STONE, MaterialColor.NETHER).noCollission().strength(1.5F, 6.0F), ToolTypes.PICKAXE));

    public static final RegistryObject<CustomBlock> DARK_LARGE_BRICKS = BUILDING_BLOCK_REGISTRY.register("dark_large_bricks", () -> new CustomBlock(Block.Properties.of(Material.STONE, MaterialColor.NETHER).strength(1.5F, 6.0F), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> DARK_LARGE_BRICKS_STAIRS = BUILDING_BLOCK_REGISTRY.register("dark_large_bricks_stairs", () -> new CustomStairsBlock(() -> DARK_LARGE_BRICKS.get().defaultBlockState(), Block.Properties.of(Material.STONE, MaterialColor.NETHER).strength(1.5F, 6.0F), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> DARK_LARGE_BRICKS_SLAB = BUILDING_BLOCK_REGISTRY.register("dark_large_bricks_slab", () -> new CustomSlabBlock(Block.Properties.of(Material.STONE, MaterialColor.NETHER).strength(1.5F, 6.0F), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomWallBlock> DARK_LARGE_BRICKS_WALL = BUILDING_BLOCK_REGISTRY.register("dark_large_bricks_wall", () -> new CustomWallBlock(Block.Properties.of(Material.STONE, MaterialColor.NETHER).strength(1.5F, 6.0F), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> DARK_LARGE_BRICKS_PRESSURE_PLATE = BUILDING_BLOCK_REGISTRY.register("dark_large_bricks_pressure_plate", () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.of(Material.STONE, MaterialColor.NETHER).noCollission().strength(1.5F, 6.0F), ToolTypes.PICKAXE));

    public static final RegistryObject<CustomBlock> OLD_BRICKS = BUILDING_BLOCK_REGISTRY.register("old_bricks", () -> new CustomBlock(Block.Properties.of(Material.STONE, MaterialColor.NETHER).strength(1.5F, 6.0F), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> OLD_BRICKS_STAIRS = BUILDING_BLOCK_REGISTRY.register("old_bricks_stairs", () -> new CustomStairsBlock(() -> OLD_BRICKS.get().defaultBlockState(), Block.Properties.of(Material.STONE, MaterialColor.NETHER).strength(1.5F, 6.0F), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> OLD_BRICKS_SLAB = BUILDING_BLOCK_REGISTRY.register("old_bricks_slab", () -> new CustomSlabBlock(Block.Properties.of(Material.STONE, MaterialColor.NETHER).strength(1.5F, 6.0F), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomWallBlock> OLD_BRICKS_WALL = BUILDING_BLOCK_REGISTRY.register("old_bricks_wall", () -> new CustomWallBlock(Block.Properties.of(Material.STONE, MaterialColor.NETHER).strength(1.5F, 6.0F), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> OLD_BRICKS_PRESSURE_PLATE = BUILDING_BLOCK_REGISTRY.register("old_bricks_pressure_plate", () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.of(Material.STONE, MaterialColor.NETHER).noCollission().strength(1.5F, 6.0F), ToolTypes.PICKAXE));

    public static final RegistryObject<CustomBlock> OLD_LARGE_BRICKS = BUILDING_BLOCK_REGISTRY.register("old_large_bricks", () -> new CustomBlock(Block.Properties.of(Material.STONE, MaterialColor.NETHER).strength(1.5F, 6.0F), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> OLD_LARGE_BRICKS_STAIRS = BUILDING_BLOCK_REGISTRY.register("old_large_bricks_stairs", () -> new CustomStairsBlock(() -> OLD_LARGE_BRICKS.get().defaultBlockState(), Block.Properties.of(Material.STONE, MaterialColor.NETHER).strength(1.5F, 6.0F), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> OLD_LARGE_BRICKS_SLAB = BUILDING_BLOCK_REGISTRY.register("old_large_bricks_slab", () -> new CustomSlabBlock(Block.Properties.of(Material.STONE, MaterialColor.NETHER).strength(1.5F, 6.0F), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomWallBlock> OLD_LARGE_BRICKS_WALL = BUILDING_BLOCK_REGISTRY.register("old_large_bricks_wall", () -> new CustomWallBlock(Block.Properties.of(Material.STONE, MaterialColor.NETHER).strength(1.5F, 6.0F), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> OLD_LARGE_BRICKS_PRESSURE_PLATE = BUILDING_BLOCK_REGISTRY.register("old_large_bricks_pressure_plate", () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.of(Material.STONE, MaterialColor.NETHER).noCollission().strength(1.5F, 6.0F), ToolTypes.PICKAXE));

    public static final RegistryObject<CustomBlock> WEARED_BRICKS = BUILDING_BLOCK_REGISTRY.register("weared_bricks", () -> new CustomBlock(Block.Properties.of(Material.STONE, MaterialColor.NETHER).strength(1.5F, 6.0F), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> WEARED_BRICKS_STAIRS = BUILDING_BLOCK_REGISTRY.register("weared_bricks_stairs", () -> new CustomStairsBlock(() -> WEARED_BRICKS.get().defaultBlockState(), Block.Properties.of(Material.STONE, MaterialColor.NETHER).strength(1.5F, 6.0F), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> WEARED_BRICKS_SLAB = BUILDING_BLOCK_REGISTRY.register("weared_bricks_slab", () -> new CustomSlabBlock(Block.Properties.of(Material.STONE, MaterialColor.NETHER).strength(1.5F, 6.0F), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomWallBlock> WEARED_BRICKS_WALL = BUILDING_BLOCK_REGISTRY.register("weared_bricks_wall", () -> new CustomWallBlock(Block.Properties.of(Material.STONE, MaterialColor.NETHER).strength(1.5F, 6.0F), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> WEARED_BRICKS_PRESSURE_PLATE = BUILDING_BLOCK_REGISTRY.register("weared_bricks_pressure_plate", () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.of(Material.STONE, MaterialColor.NETHER).noCollission().strength(1.5F, 6.0F), ToolTypes.PICKAXE));

    public static final RegistryObject<CustomBlock> WEARED_LARGE_BRICKS = BUILDING_BLOCK_REGISTRY.register("weared_large_bricks", () -> new CustomBlock(Block.Properties.of(Material.STONE, MaterialColor.NETHER).strength(1.5F, 6.0F), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> WEARED_LARGE_BRICKS_STAIRS = BUILDING_BLOCK_REGISTRY.register("weared_large_bricks_stairs", () -> new CustomStairsBlock(() -> WEARED_LARGE_BRICKS.get().defaultBlockState(), Block.Properties.of(Material.STONE, MaterialColor.NETHER).strength(1.5F, 6.0F), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> WEARED_LARGE_BRICKS_SLAB = BUILDING_BLOCK_REGISTRY.register("weared_large_bricks_slab", () -> new CustomSlabBlock(Block.Properties.of(Material.STONE, MaterialColor.NETHER).strength(1.5F, 6.0F), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomWallBlock> WEARED_LARGE_BRICKS_WALL = BUILDING_BLOCK_REGISTRY.register("weared_large_bricks_wall", () -> new CustomWallBlock(Block.Properties.of(Material.STONE, MaterialColor.NETHER).strength(1.5F, 6.0F), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> WEARED_LARGE_BRICKS_PRESSURE_PLATE = BUILDING_BLOCK_REGISTRY.register("weared_large_bricks_pressure_plate", () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.of(Material.STONE, MaterialColor.NETHER).noCollission().strength(1.5F, 6.0F), ToolTypes.PICKAXE));

    // Pavings
    public static final RegistryObject<CustomBlock> CONCRETE_PAVING = BUILDING_BLOCK_REGISTRY.register("concrete_paving", () -> new CustomBlock(Block.Properties.of(Material.STONE, MaterialColor.STONE).strength(1.5F, 6.0F), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> CONCRETE_PAVING_STAIRS = BUILDING_BLOCK_REGISTRY.register("concrete_paving_stairs", () -> new CustomStairsBlock(() -> CONCRETE_PAVING.get().defaultBlockState(), Block.Properties.of(Material.STONE, MaterialColor.STONE).strength(1.5F, 6.0F), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> CONCRETE_PAVING_SLAB = BUILDING_BLOCK_REGISTRY.register("concrete_paving_slab", () -> new CustomSlabBlock(Block.Properties.of(Material.STONE, MaterialColor.STONE).strength(1.5F, 6.0F), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomWallBlock> CONCRETE_PAVING_WALL = BUILDING_BLOCK_REGISTRY.register("concrete_paving_wall", () -> new CustomWallBlock(Block.Properties.of(Material.STONE, MaterialColor.STONE).strength(1.5F, 6.0F), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> CONCRETE_PAVING_PRESSURE_PLATE = BUILDING_BLOCK_REGISTRY.register("concrete_paving_pressure_plate", () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.of(Material.STONE, MaterialColor.STONE).noCollission().strength(1.5F, 6.0F), ToolTypes.PICKAXE));

    public static final RegistryObject<CustomBlock> DAMAGED_PAVING = BUILDING_BLOCK_REGISTRY.register("damaged_paving", () -> new CustomBlock(Block.Properties.of(Material.STONE, MaterialColor.STONE).strength(1.5F, 6.0F), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> DAMAGED_PAVING_STAIRS = BUILDING_BLOCK_REGISTRY.register("damaged_paving_stairs", () -> new CustomStairsBlock(() -> DAMAGED_PAVING.get().defaultBlockState(), Block.Properties.of(Material.STONE, MaterialColor.STONE).strength(1.5F, 6.0F), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> DAMAGED_PAVING_SLAB = BUILDING_BLOCK_REGISTRY.register("damaged_paving_slab", () -> new CustomSlabBlock(Block.Properties.of(Material.STONE, MaterialColor.STONE).strength(1.5F, 6.0F), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomWallBlock> DAMAGED_PAVING_WALL = BUILDING_BLOCK_REGISTRY.register("damaged_paving_wall", () -> new CustomWallBlock(Block.Properties.of(Material.STONE, MaterialColor.STONE).strength(1.5F, 6.0F), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> DAMAGED_PAVING_PRESSURE_PLATE = BUILDING_BLOCK_REGISTRY.register("damaged_paving_pressure_plate", () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.of(Material.STONE, MaterialColor.STONE).noCollission().strength(1.5F, 6.0F), ToolTypes.PICKAXE));

    public static final RegistryObject<CustomBlock> DARK_CONCRETE_PAVING = BUILDING_BLOCK_REGISTRY.register("dark_concrete_paving", () -> new CustomBlock(Block.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_BLACK).strength(1.5F, 6.0F), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> DARK_CONCRETE_PAVING_STAIRS = BUILDING_BLOCK_REGISTRY.register("dark_concrete_paving_stairs", () -> new CustomStairsBlock(() -> DARK_CONCRETE_PAVING.get().defaultBlockState(), Block.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_BLACK).strength(1.5F, 6.0F), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> DARK_CONCRETE_PAVING_SLAB = BUILDING_BLOCK_REGISTRY.register("dark_concrete_paving_slab", () -> new CustomSlabBlock(Block.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_BLACK).strength(1.5F, 6.0F), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomWallBlock> DARK_CONCRETE_PAVING_WALL = BUILDING_BLOCK_REGISTRY.register("dark_concrete_paving_wall", () -> new CustomWallBlock(Block.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_BLACK).strength(1.5F, 6.0F), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> DARK_CONCRETE_PAVING_PRESSURE_PLATE = BUILDING_BLOCK_REGISTRY.register("dark_concrete_paving_pressure_plate", () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_BLACK).noCollission().strength(1.5F, 6.0F), ToolTypes.PICKAXE));

    public static final RegistryObject<CustomBlock> MOIST_PAVING = BUILDING_BLOCK_REGISTRY.register("moist_paving", () -> new CustomBlock(Block.Properties.of(Material.STONE, MaterialColor.STONE).strength(1.5F, 6.0F), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> MOIST_PAVING_STAIRS = BUILDING_BLOCK_REGISTRY.register("moist_paving_stairs", () -> new CustomStairsBlock(() -> MOIST_PAVING.get().defaultBlockState(), Block.Properties.of(Material.STONE, MaterialColor.STONE).strength(1.5F, 6.0F), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> MOIST_PAVING_SLAB = BUILDING_BLOCK_REGISTRY.register("moist_paving_slab", () -> new CustomSlabBlock(Block.Properties.of(Material.STONE, MaterialColor.STONE).strength(1.5F, 6.0F), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomWallBlock> MOIST_PAVING_WALL = BUILDING_BLOCK_REGISTRY.register("moist_paving_wall", () -> new CustomWallBlock(Block.Properties.of(Material.STONE, MaterialColor.STONE).strength(1.5F, 6.0F), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> MOIST_PAVING_PRESSURE_PLATE = BUILDING_BLOCK_REGISTRY.register("moist_paving_pressure_plate", () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.of(Material.STONE, MaterialColor.STONE).noCollission().strength(1.5F, 6.0F), ToolTypes.PICKAXE));

    public static final RegistryObject<CustomBlock> POLISHED_PAVING = BUILDING_BLOCK_REGISTRY.register("polished_paving", () -> new CustomBlock(Block.Properties.of(Material.STONE, MaterialColor.STONE).strength(1.5F, 6.0F), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> POLISHED_PAVING_STAIRS = BUILDING_BLOCK_REGISTRY.register("polished_paving_stairs", () -> new CustomStairsBlock(() -> POLISHED_PAVING.get().defaultBlockState(), Block.Properties.of(Material.STONE, MaterialColor.STONE).strength(1.5F, 6.0F), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> POLISHED_PAVING_SLAB = BUILDING_BLOCK_REGISTRY.register("polished_paving_slab", () -> new CustomSlabBlock(Block.Properties.of(Material.STONE, MaterialColor.STONE).strength(1.5F, 6.0F), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomWallBlock> POLISHED_PAVING_WALL = BUILDING_BLOCK_REGISTRY.register("polished_paving_wall", () -> new CustomWallBlock(Block.Properties.of(Material.STONE, MaterialColor.STONE).strength(1.5F, 6.0F), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> POLISHED_PAVING_PRESSURE_PLATE = BUILDING_BLOCK_REGISTRY.register("polished_paving_pressure_plate", () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.of(Material.STONE, MaterialColor.STONE).noCollission().strength(1.5F, 6.0F), ToolTypes.PICKAXE));

    public static final RegistryObject<CustomBlock> WHITE_CONCRETE_PAVING = BUILDING_BLOCK_REGISTRY.register("white_concrete_paving", () -> new CustomBlock(Block.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_WHITE).strength(1.5F, 6.0F), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> WHITE_CONCRETE_PAVING_STAIRS = BUILDING_BLOCK_REGISTRY.register("white_concrete_paving_stairs", () -> new CustomStairsBlock(() -> WHITE_CONCRETE_PAVING.get().defaultBlockState(), Block.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_WHITE).strength(1.5F, 6.0F), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> WHITE_CONCRETE_PAVING_SLAB = BUILDING_BLOCK_REGISTRY.register("white_concrete_paving_slab", () -> new CustomSlabBlock(Block.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_WHITE).strength(1.5F, 6.0F), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomWallBlock> WHITE_CONCRETE_PAVING_WALL = BUILDING_BLOCK_REGISTRY.register("white_concrete_paving_wall", () -> new CustomWallBlock(Block.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_WHITE).strength(1.5F, 6.0F), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> WHITE_CONCRETE_PAVING_PRESSURE_PLATE = BUILDING_BLOCK_REGISTRY.register("white_concrete_paving_pressure_plate", () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_WHITE).noCollission().strength(1.5F, 6.0F), ToolTypes.PICKAXE));

    // Tiles
    public static final RegistryObject<CustomBlock> CONCRETE_TILES = BUILDING_BLOCK_REGISTRY.register("concrete_tiles", () -> new CustomBlock(Block.Properties.of(Material.STONE, MaterialColor.STONE).strength(1.5F, 6.0F), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> CONCRETE_TILES_STAIRS = BUILDING_BLOCK_REGISTRY.register("concrete_tiles_stairs", () -> new CustomStairsBlock(() -> CONCRETE_TILES.get().defaultBlockState(), Block.Properties.of(Material.STONE, MaterialColor.STONE).strength(1.5F, 6.0F), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> CONCRETE_TILES_SLAB = BUILDING_BLOCK_REGISTRY.register("concrete_tiles_slab", () -> new CustomSlabBlock(Block.Properties.of(Material.STONE, MaterialColor.STONE).strength(1.5F, 6.0F), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomWallBlock> CONCRETE_TILES_WALL = BUILDING_BLOCK_REGISTRY.register("concrete_tiles_wall", () -> new CustomWallBlock(Block.Properties.of(Material.STONE, MaterialColor.STONE).strength(1.5F, 6.0F), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> CONCRETE_TILES_PRESSURE_PLATE = BUILDING_BLOCK_REGISTRY.register("concrete_tiles_pressure_plate", () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.of(Material.STONE, MaterialColor.STONE).noCollission().strength(1.5F, 6.0F), ToolTypes.PICKAXE));

    public static final RegistryObject<CustomBlock> SKYBLUE_TILES = BUILDING_BLOCK_REGISTRY.register("skyblue_tiles", () -> new CustomBlock(Block.Properties.of(Material.STONE, MaterialColor.COLOR_LIGHT_BLUE).strength(1.5F, 6.0F), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> SKYBLUE_TILES_STAIRS = BUILDING_BLOCK_REGISTRY.register("skyblue_tiles_stairs", () -> new CustomStairsBlock(() -> SKYBLUE_TILES.get().defaultBlockState(), Block.Properties.of(Material.STONE, MaterialColor.COLOR_LIGHT_BLUE).strength(1.5F, 6.0F), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> SKYBLUE_TILES_SLAB = BUILDING_BLOCK_REGISTRY.register("skyblue_tiles_slab", () -> new CustomSlabBlock(Block.Properties.of(Material.STONE, MaterialColor.COLOR_LIGHT_BLUE).strength(1.5F, 6.0F), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomWallBlock> SKYBLUE_TILES_WALL = BUILDING_BLOCK_REGISTRY.register("skyblue_tiles_wall", () -> new CustomWallBlock(Block.Properties.of(Material.STONE, MaterialColor.COLOR_LIGHT_BLUE).strength(1.5F, 6.0F), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> SKYBLUE_TILES_PRESSURE_PLATE = BUILDING_BLOCK_REGISTRY.register("skyblue_tiles_pressure_plate", () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.of(Material.STONE, MaterialColor.COLOR_LIGHT_BLUE).noCollission().strength(1.5F, 6.0F), ToolTypes.PICKAXE));

    public static final RegistryObject<CustomBlock> ORANGE_TILES = BUILDING_BLOCK_REGISTRY.register("orange_tiles", () -> new CustomBlock(Block.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_ORANGE).strength(1.5F, 6.0F), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> ORANGE_TILES_STAIRS = BUILDING_BLOCK_REGISTRY.register("orange_tiles_stairs", () -> new CustomStairsBlock(() -> ORANGE_TILES.get().defaultBlockState(), Block.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_ORANGE).strength(1.5F, 6.0F), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> ORANGE_TILES_SLAB = BUILDING_BLOCK_REGISTRY.register("orange_tiles_slab", () -> new CustomSlabBlock(Block.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_ORANGE).strength(1.5F, 6.0F), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomWallBlock> ORANGE_TILES_WALL = BUILDING_BLOCK_REGISTRY.register("orange_tiles_wall", () -> new CustomWallBlock(Block.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_ORANGE).strength(1.5F, 6.0F), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> ORANGE_TILES_PRESSURE_PLATE = BUILDING_BLOCK_REGISTRY.register("orange_tiles_pressure_plate", () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_ORANGE).noCollission().strength(1.5F, 6.0F), ToolTypes.PICKAXE));

    public static final RegistryObject<CustomBlock> BLUE_TILES = BUILDING_BLOCK_REGISTRY.register("blue_tiles", () -> new CustomBlock(Block.Properties.of(Material.STONE, MaterialColor.COLOR_BLUE).strength(1.5F, 6.0F), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> BLUE_TILES_STAIRS = BUILDING_BLOCK_REGISTRY.register("blue_tiles_stairs", () -> new CustomStairsBlock(() -> BLUE_TILES.get().defaultBlockState(), Block.Properties.of(Material.STONE, MaterialColor.COLOR_BLUE).strength(1.5F, 6.0F), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> BLUE_TILES_SLAB = BUILDING_BLOCK_REGISTRY.register("blue_tiles_slab", () -> new CustomSlabBlock(Block.Properties.of(Material.STONE, MaterialColor.COLOR_BLUE).strength(1.5F, 6.0F), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomWallBlock> BLUE_TILES_WALL = BUILDING_BLOCK_REGISTRY.register("blue_tiles_wall", () -> new CustomWallBlock(Block.Properties.of(Material.STONE, MaterialColor.COLOR_BLUE).strength(1.5F, 6.0F), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> BLUE_TILES_PRESSURE_PLATE = BUILDING_BLOCK_REGISTRY.register("blue_tiles_pressure_plate", () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.of(Material.STONE, MaterialColor.COLOR_BLUE).noCollission().strength(1.5F, 6.0F), ToolTypes.PICKAXE));

    public static final RegistryObject<CustomBlock> LIGHT_BLUE_TILES = BUILDING_BLOCK_REGISTRY.register("light_blue_tiles", () -> new CustomBlock(Block.Properties.of(Material.STONE, MaterialColor.COLOR_LIGHT_BLUE).strength(1.5F, 6.0F), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> LIGHT_BLUE_TILES_STAIRS = BUILDING_BLOCK_REGISTRY.register("light_blue_tiles_stairs", () -> new CustomStairsBlock(() -> LIGHT_BLUE_TILES.get().defaultBlockState(), Block.Properties.of(Material.STONE, MaterialColor.COLOR_LIGHT_BLUE).strength(1.5F, 6.0F), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> LIGHT_BLUE_TILES_SLAB = BUILDING_BLOCK_REGISTRY.register("light_blue_tiles_slab", () -> new CustomSlabBlock(Block.Properties.of(Material.STONE, MaterialColor.COLOR_LIGHT_BLUE).strength(1.5F, 6.0F), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomWallBlock> LIGHT_BLUE_TILES_WALL = BUILDING_BLOCK_REGISTRY.register("light_blue_tiles_wall", () -> new CustomWallBlock(Block.Properties.of(Material.STONE, MaterialColor.COLOR_LIGHT_BLUE).strength(1.5F, 6.0F), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> LIGHT_BLUE_TILES_PRESSURE_PLATE = BUILDING_BLOCK_REGISTRY.register("light_blue_tiles_pressure_plate", () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.of(Material.STONE, MaterialColor.COLOR_LIGHT_BLUE).noCollission().strength(1.5F, 6.0F), ToolTypes.PICKAXE));

    public static final RegistryObject<CustomBlock> RED_TILES = BUILDING_BLOCK_REGISTRY.register("red_tiles", () -> new CustomBlock(Block.Properties.of(Material.STONE, MaterialColor.COLOR_RED).strength(1.5F, 6.0F), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> RED_TILES_STAIRS = BUILDING_BLOCK_REGISTRY.register("red_tiles_stairs", () -> new CustomStairsBlock(() -> RED_TILES.get().defaultBlockState(), Block.Properties.of(Material.STONE, MaterialColor.COLOR_RED).strength(1.5F, 6.0F), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> RED_TILES_SLAB = BUILDING_BLOCK_REGISTRY.register("red_tiles_slab", () -> new CustomSlabBlock(Block.Properties.of(Material.STONE, MaterialColor.COLOR_RED).strength(1.5F, 6.0F), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomWallBlock> RED_TILES_WALL = BUILDING_BLOCK_REGISTRY.register("red_tiles_wall", () -> new CustomWallBlock(Block.Properties.of(Material.STONE, MaterialColor.COLOR_RED).strength(1.5F, 6.0F), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> RED_TILES_PRESSURE_PLATE = BUILDING_BLOCK_REGISTRY.register("red_tiles_pressure_plate", () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.of(Material.STONE, MaterialColor.COLOR_RED).noCollission().strength(1.5F, 6.0F), ToolTypes.PICKAXE));

    public static final RegistryObject<CustomBlock> WHITE_TILES = BUILDING_BLOCK_REGISTRY.register("white_tiles", () -> new CustomBlock(Block.Properties.of(Material.STONE, MaterialColor.QUARTZ).strength(1.5F, 6.0F), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> WHITE_TILES_STAIRS = BUILDING_BLOCK_REGISTRY.register("white_tiles_stairs", () -> new CustomStairsBlock(() -> WHITE_TILES.get().defaultBlockState(), Block.Properties.of(Material.STONE, MaterialColor.QUARTZ).strength(1.5F, 6.0F), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> WHITE_TILES_SLAB = BUILDING_BLOCK_REGISTRY.register("white_tiles_slab", () -> new CustomSlabBlock(Block.Properties.of(Material.STONE, MaterialColor.QUARTZ).strength(1.5F, 6.0F), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomWallBlock> WHITE_TILES_WALL = BUILDING_BLOCK_REGISTRY.register("white_tiles_wall", () -> new CustomWallBlock(Block.Properties.of(Material.STONE, MaterialColor.QUARTZ).strength(1.5F, 6.0F), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> WHITE_TILES_PRESSURE_PLATE = BUILDING_BLOCK_REGISTRY.register("white_tiles_pressure_plate", () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.of(Material.STONE, MaterialColor.QUARTZ).noCollission().strength(1.5F, 6.0F), ToolTypes.PICKAXE));

    public static final RegistryObject<CustomBlock> YELLOW_TILES = BUILDING_BLOCK_REGISTRY.register("yellow_tiles", () -> new CustomBlock(Block.Properties.of(Material.STONE, MaterialColor.COLOR_YELLOW).strength(1.5F, 6.0F), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> YELLOW_TILES_STAIRS = BUILDING_BLOCK_REGISTRY.register("yellow_tiles_stairs", () -> new CustomStairsBlock(() -> YELLOW_TILES.get().defaultBlockState(), Block.Properties.of(Material.STONE, MaterialColor.COLOR_YELLOW).strength(1.5F, 6.0F), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> YELLOW_TILES_SLAB = BUILDING_BLOCK_REGISTRY.register("yellow_tiles_slab", () -> new CustomSlabBlock(Block.Properties.of(Material.STONE, MaterialColor.COLOR_YELLOW).strength(1.5F, 6.0F), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomWallBlock> YELLOW_TILES_WALL = BUILDING_BLOCK_REGISTRY.register("yellow_tiles_wall", () -> new CustomWallBlock(Block.Properties.of(Material.STONE, MaterialColor.COLOR_YELLOW).strength(1.5F, 6.0F), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> YELLOW_TILES_PRESSURE_PLATE = BUILDING_BLOCK_REGISTRY.register("yellow_tiles_pressure_plate", () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.of(Material.STONE, MaterialColor.COLOR_YELLOW).noCollission().strength(1.5F, 6.0F), ToolTypes.PICKAXE));

    public static final RegistryObject<CustomBlock> YELLOW_GREY_TILES = BUILDING_BLOCK_REGISTRY.register("yellow_grey_tiles", () -> new CustomBlock(Block.Properties.of(Material.STONE, MaterialColor.COLOR_YELLOW).strength(1.5F, 6.0F), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> YELLOW_GREY_TILES_STAIRS = BUILDING_BLOCK_REGISTRY.register("yellow_grey_tiles_stairs", () -> new CustomStairsBlock(() -> YELLOW_GREY_TILES.get().defaultBlockState(), Block.Properties.of(Material.STONE, MaterialColor.COLOR_YELLOW).strength(1.5F, 6.0F), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> YELLOW_GREY_TILES_SLAB = BUILDING_BLOCK_REGISTRY.register("yellow_grey_tiles_slab", () -> new CustomSlabBlock(Block.Properties.of(Material.STONE, MaterialColor.COLOR_YELLOW).strength(1.5F, 6.0F), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomWallBlock> YELLOW_GREY_TILES_WALL = BUILDING_BLOCK_REGISTRY.register("yellow_grey_tiles_wall", () -> new CustomWallBlock(Block.Properties.of(Material.STONE, MaterialColor.COLOR_YELLOW).strength(1.5F, 6.0F), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> YELLOW_GREY_TILES_PRESSURE_PLATE = BUILDING_BLOCK_REGISTRY.register("yellow_grey_tiles_pressure_plate", () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.of(Material.STONE, MaterialColor.COLOR_YELLOW).noCollission().strength(1.5F, 6.0F), ToolTypes.PICKAXE));

    // Wallpapers
    public static final RegistryObject<CustomBlock> WHITE_BLUE_WALLPAPER = BUILDING_BLOCK_REGISTRY.register("white_blue_wallpaper", () -> new CustomBlock(Block.Properties.of(Material.STONE, MaterialColor.STONE).strength(1.5F, 6.0F), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> WHITE_BLUE_WALLPAPER_STAIRS = BUILDING_BLOCK_REGISTRY.register("white_blue_wallpaper_stairs", () -> new CustomStairsBlock(() -> WHITE_BLUE_WALLPAPER.get().defaultBlockState(), Block.Properties.of(Material.STONE, MaterialColor.STONE).strength(1.5F, 6.0F), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> WHITE_BLUE_WALLPAPER_SLAB = BUILDING_BLOCK_REGISTRY.register("white_blue_wallpaper_slab", () -> new CustomSlabBlock(Block.Properties.of(Material.STONE, MaterialColor.STONE).strength(1.5F, 6.0F), ToolTypes.PICKAXE));
    public static final RegistryObject<UpDownBlock> WHITE_BLUE_WALLPAPER_PLINTH = BUILDING_BLOCK_REGISTRY.register("white_blue_wallpaper_plinth", () -> new UpDownBlock(Block.Properties.of(Material.STONE, MaterialColor.STONE).strength(1.5F, 6.0F), ToolTypes.PICKAXE));

    public static final RegistryObject<CustomBlock> BEIGE_FLOWER_WALLPAPER = BUILDING_BLOCK_REGISTRY.register("beige_flower_wallpaper", () -> new CustomBlock(Block.Properties.of(Material.STONE, MaterialColor.STONE).strength(1.5F, 6.0F), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> BEIGE_FLOWER_WALLPAPER_STAIRS = BUILDING_BLOCK_REGISTRY.register("beige_flower_wallpaper_stairs", () -> new CustomStairsBlock(() -> BEIGE_FLOWER_WALLPAPER.get().defaultBlockState(), Block.Properties.of(Material.STONE, MaterialColor.STONE).strength(1.5F, 6.0F), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> BEIGE_FLOWER_WALLPAPER_SLAB = BUILDING_BLOCK_REGISTRY.register("beige_flower_wallpaper_slab", () -> new CustomSlabBlock(Block.Properties.of(Material.STONE, MaterialColor.STONE).strength(1.5F, 6.0F), ToolTypes.PICKAXE));
    public static final RegistryObject<UpDownBlock> BEIGE_FLOWER_WALLPAPER_PLINTH = BUILDING_BLOCK_REGISTRY.register("beige_flower_wallpaper_plinth", () -> new UpDownBlock(Block.Properties.of(Material.STONE, MaterialColor.STONE).strength(1.5F, 6.0F), ToolTypes.PICKAXE));

    public static final RegistryObject<CustomBlock> BEIGE_WALLPAPER = BUILDING_BLOCK_REGISTRY.register("beige_wallpaper", () -> new CustomBlock(Block.Properties.of(Material.STONE, MaterialColor.STONE).strength(1.5F, 6.0F), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> BEIGE_WALLPAPER_STAIRS = BUILDING_BLOCK_REGISTRY.register("beige_wallpaper_stairs", () -> new CustomStairsBlock(() -> BEIGE_WALLPAPER.get().defaultBlockState(), Block.Properties.of(Material.STONE, MaterialColor.STONE).strength(1.5F, 6.0F), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> BEIGE_WALLPAPER_SLAB = BUILDING_BLOCK_REGISTRY.register("beige_wallpaper_slab", () -> new CustomSlabBlock(Block.Properties.of(Material.STONE, MaterialColor.STONE).strength(1.5F, 6.0F), ToolTypes.PICKAXE));
    public static final RegistryObject<UpDownBlock> BEIGE_WALLPAPER_PLINTH = BUILDING_BLOCK_REGISTRY.register("beige_wallpaper_plinth", () -> new UpDownBlock(Block.Properties.of(Material.STONE, MaterialColor.STONE).strength(1.5F, 6.0F), ToolTypes.PICKAXE));

    public static final RegistryObject<CustomBlock> PINK_WALLPAPER = BUILDING_BLOCK_REGISTRY.register("pink_wallpaper", () -> new CustomBlock(Block.Properties.of(Material.STONE, MaterialColor.STONE).strength(1.5F, 6.0F), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> PINK_WALLPAPER_STAIRS = BUILDING_BLOCK_REGISTRY.register("pink_wallpaper_stairs", () -> new CustomStairsBlock(() -> PINK_WALLPAPER.get().defaultBlockState(), Block.Properties.of(Material.STONE, MaterialColor.STONE).strength(1.5F, 6.0F), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> PINK_WALLPAPER_SLAB = BUILDING_BLOCK_REGISTRY.register("pink_wallpaper_slab", () -> new CustomSlabBlock(Block.Properties.of(Material.STONE, MaterialColor.STONE).strength(1.5F, 6.0F), ToolTypes.PICKAXE));
    public static final RegistryObject<UpDownBlock> PINK_WALLPAPER_PLINTH = BUILDING_BLOCK_REGISTRY.register("pink_wallpaper_plinth", () -> new UpDownBlock(Block.Properties.of(Material.STONE, MaterialColor.STONE).strength(1.5F, 6.0F), ToolTypes.PICKAXE));

    public static final RegistryObject<CustomBlock> WHITE_GREEN_WALLPAPER = BUILDING_BLOCK_REGISTRY.register("white_green_wallpaper", () -> new CustomBlock(Block.Properties.of(Material.STONE, MaterialColor.STONE).strength(1.5F, 6.0F), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> WHITE_GREEN_WALLPAPER_STAIRS = BUILDING_BLOCK_REGISTRY.register("white_green_wallpaper_stairs", () -> new CustomStairsBlock(() -> WHITE_GREEN_WALLPAPER.get().defaultBlockState(), Block.Properties.of(Material.STONE, MaterialColor.STONE).strength(1.5F, 6.0F), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> WHITE_GREEN_WALLPAPER_SLAB = BUILDING_BLOCK_REGISTRY.register("white_green_wallpaper_slab", () -> new CustomSlabBlock(Block.Properties.of(Material.STONE, MaterialColor.STONE).strength(1.5F, 6.0F), ToolTypes.PICKAXE));
    public static final RegistryObject<UpDownBlock> WHITE_GREEN_WALLPAPER_PLINTH = BUILDING_BLOCK_REGISTRY.register("white_green_wallpaper_plinth", () -> new UpDownBlock(Block.Properties.of(Material.STONE, MaterialColor.STONE).strength(1.5F, 6.0F), ToolTypes.PICKAXE));

    // Stairs
    public static final Map<McWoods, RegistryObject<SuspendedStairsBlock>> SUSPENDED_STAIRS_BLOCKS = Arrays.stream(McWoods.values()).map(type -> Pair.of(type, BUILDING_BLOCK_REGISTRY.register(type.getSerializedName() + "_suspended_stairs", () -> new SuspendedStairsBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion(), ToolTypes.AXE, false)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));
    public static final Map<McWoods, RegistryObject<SuspendedStairsBlock>> LARGE_SUSPENDED_STAIRS_BLOCKS = Arrays.stream(McWoods.values()).map(type -> Pair.of(type, BUILDING_BLOCK_REGISTRY.register(type.getSerializedName() + "_large_suspended_stairs", () -> new SuspendedStairsBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion(), ToolTypes.AXE, true)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    // Doors
    public static final Map<McWoods, RegistryObject<CustomDoorBlock>> FANCY_DOOR_BLOCKS = Arrays.stream(McWoods.values()).map(type -> Pair.of(type, BUILDING_BLOCK_REGISTRY.register(type.getSerializedName() + "_fancy_door", () -> new CustomDoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion(), ToolTypes.AXE)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));
    public static final Map<McWoods, RegistryObject<CustomDoorBlock>> PLAIN_DOOR_BLOCKS = Arrays.stream(McWoods.values()).map(type -> Pair.of(type, BUILDING_BLOCK_REGISTRY.register(type.getSerializedName() + "_plain_door", () -> new CustomDoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion(), ToolTypes.AXE)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static void init()
    {
        BUILDING_BLOCK_REGISTRY.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}