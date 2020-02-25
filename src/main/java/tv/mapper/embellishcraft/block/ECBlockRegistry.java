package tv.mapper.embellishcraft.block;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.PressurePlateBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import tv.mapper.embellishcraft.ECConstants;
import tv.mapper.mapperbase.block.CustomBlock;
import tv.mapper.mapperbase.block.CustomButtonBlock;
import tv.mapper.mapperbase.block.CustomPressurePlateBlock;
import tv.mapper.mapperbase.block.CustomSlabBlock;
import tv.mapper.mapperbase.block.CustomStairsBlock;
import tv.mapper.mapperbase.block.CustomWallBlock;

public class ECBlockRegistry
{
    private static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, ECConstants.MODID);

    // Basalt
    public static final RegistryObject<CustomBlock> BASALT = BLOCKS.register("basalt",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> BASALT_STAIRS = BLOCKS.register("basalt_stairs",
        () -> new CustomStairsBlock(() -> BASALT.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> BASALT_SLAB = BLOCKS.register("basalt_slab",
        () -> new CustomSlabBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomWallBlock> BASALT_WALL = BLOCKS.register("basalt_wall",
        () -> new CustomWallBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> BASALT_PRESSURE_PLATE = BLOCKS.register("basalt_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.BLACK).doesNotBlockMovement().hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomButtonBlock> BASALT_BUTTON = BLOCKS.register("basalt_button",
        () -> new CustomButtonBlock(false, Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE)));

    public static final RegistryObject<CustomBlock> BASALT_COBBLESTONE = BLOCKS.register("basalt_cobblestone",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> BASALT_COBBLESTONE_STAIRS = BLOCKS.register("basalt_cobblestone_stairs",
        () -> new CustomStairsBlock(() -> BASALT.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> BASALT_COBBLESTONE_SLAB = BLOCKS.register("basalt_cobblestone_slab",
        () -> new CustomSlabBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomWallBlock> BASALT_COBBLESTONE_WALL = BLOCKS.register("basalt_cobblestone_wall",
        () -> new CustomWallBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> BASALT_COBBLESTONE_PRESSURE_PLATE = BLOCKS.register("basalt_cobblestone_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.BLACK).doesNotBlockMovement().hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));

    public static final RegistryObject<CustomBlock> SMOOTH_BASALT = BLOCKS.register("smooth_basalt",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> SMOOTH_BASALT_STAIRS = BLOCKS.register("smooth_basalt_stairs",
        () -> new CustomStairsBlock(() -> SMOOTH_BASALT.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> SMOOTH_BASALT_SLAB = BLOCKS.register("smooth_basalt_slab",
        () -> new CustomSlabBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomWallBlock> SMOOTH_BASALT_WALL = BLOCKS.register("smooth_basalt_wall",
        () -> new CustomWallBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> SMOOTH_BASALT_PRESSURE_PLATE = BLOCKS.register("smooth_basalt_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.BLACK).doesNotBlockMovement().hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));

    public static final RegistryObject<CustomBlock> POLISHED_BASALT = BLOCKS.register("polished_basalt",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> POLISHED_BASALT_STAIRS = BLOCKS.register("polished_basalt_stairs",
        () -> new CustomStairsBlock(() -> POLISHED_BASALT.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> POLISHED_BASALT_SLAB = BLOCKS.register("polished_basalt_slab",
        () -> new CustomSlabBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomWallBlock> POLISHED_BASALT_WALL = BLOCKS.register("polished_basalt_wall",
        () -> new CustomWallBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> POLISHED_BASALT_PRESSURE_PLATE = BLOCKS.register("polished_basalt_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.BLACK).doesNotBlockMovement().hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));

    public static final RegistryObject<CustomBlock> BASALT_PAVING = BLOCKS.register("basalt_paving",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> BASALT_PAVING_STAIRS = BLOCKS.register("basalt_paving_stairs",
        () -> new CustomStairsBlock(() -> BASALT.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> BASALT_PAVING_SLAB = BLOCKS.register("basalt_paving_slab",
        () -> new CustomSlabBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomWallBlock> BASALT_PAVING_WALL = BLOCKS.register("basalt_paving_wall",
        () -> new CustomWallBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> BASALT_PAVING_PRESSURE_PLATE = BLOCKS.register("basalt_paving_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.BLACK).doesNotBlockMovement().hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));

    public static final RegistryObject<CustomBlock> BASALT_TILES = BLOCKS.register("basalt_tiles",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> BASALT_TILES_STAIRS = BLOCKS.register("basalt_tiles_stairs",
        () -> new CustomStairsBlock(() -> BASALT.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> BASALT_TILES_SLAB = BLOCKS.register("basalt_tiles_slab",
        () -> new CustomSlabBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomWallBlock> BASALT_TILES_WALL = BLOCKS.register("basalt_tiles_wall",
        () -> new CustomWallBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> BASALT_TILES_PRESSURE_PLATE = BLOCKS.register("basalt_tiles_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.BLACK).doesNotBlockMovement().hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));

    public static final RegistryObject<CustomBlock> BASALT_BRICKS = BLOCKS.register("basalt_bricks",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> BASALT_BRICKS_STAIRS = BLOCKS.register("basalt_bricks_stairs",
        () -> new CustomStairsBlock(() -> BASALT.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> BASALT_BRICKS_SLAB = BLOCKS.register("basalt_bricks_slab",
        () -> new CustomSlabBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomWallBlock> BASALT_BRICKS_WALL = BLOCKS.register("basalt_bricks_wall",
        () -> new CustomWallBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> BASALT_BRICKS_PRESSURE_PLATE = BLOCKS.register("basalt_bricks_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.BLACK).doesNotBlockMovement().hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));

    public static final RegistryObject<CustomBlock> BASALT_LARGE_BRICKS = BLOCKS.register("basalt_large_bricks",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> BASALT_LARGE_BRICKS_STAIRS = BLOCKS.register("basalt_large_bricks_stairs",
        () -> new CustomStairsBlock(() -> BASALT.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> BASALT_LARGE_BRICKS_SLAB = BLOCKS.register("basalt_large_bricks_slab",
        () -> new CustomSlabBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomWallBlock> BASALT_LARGE_BRICKS_WALL = BLOCKS.register("basalt_large_bricks_wall",
        () -> new CustomWallBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> BASALT_LARGE_BRICKS_PRESSURE_PLATE = BLOCKS.register("basalt_large_bricks_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.BLACK).doesNotBlockMovement().hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));

    public static final RegistryObject<CustomBlock> BASALT_ORNAMENT = BLOCKS.register("basalt_ornament",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> BASALT_ORNAMENT_PRESSURE_PLATE = BLOCKS.register("basalt_ornament_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.BLACK).doesNotBlockMovement().hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));

    // Slate
    public static final RegistryObject<CustomBlock> SLATE = BLOCKS.register("slate",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLUE_TERRACOTTA).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> SLATE_STAIRS = BLOCKS.register("slate_stairs",
        () -> new CustomStairsBlock(() -> SLATE.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.BLUE_TERRACOTTA).hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> SLATE_SLAB = BLOCKS.register("slate_slab",
        () -> new CustomSlabBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLUE_TERRACOTTA).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomWallBlock> SLATE_WALL = BLOCKS.register("slate_wall",
        () -> new CustomWallBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLUE_TERRACOTTA).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> SLATE_PRESSURE_PLATE = BLOCKS.register("slate_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.BLUE_TERRACOTTA).doesNotBlockMovement().hardnessAndResistance(1.5F,
            6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomButtonBlock> SLATE_BUTTON = BLOCKS.register("slate_button",
        () -> new CustomButtonBlock(false, Block.Properties.create(Material.ROCK, MaterialColor.BLUE_TERRACOTTA).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE)));

    public static final RegistryObject<CustomBlock> SLATE_COBBLESTONE = BLOCKS.register("slate_cobblestone",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLUE_TERRACOTTA).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> SLATE_COBBLESTONE_STAIRS = BLOCKS.register("slate_cobblestone_stairs",
        () -> new CustomStairsBlock(() -> SLATE.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.BLUE_TERRACOTTA).hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> SLATE_COBBLESTONE_SLAB = BLOCKS.register("slate_cobblestone_slab",
        () -> new CustomSlabBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLUE_TERRACOTTA).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomWallBlock> SLATE_COBBLESTONE_WALL = BLOCKS.register("slate_cobblestone_wall",
        () -> new CustomWallBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLUE_TERRACOTTA).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> SLATE_COBBLESTONE_PRESSURE_PLATE = BLOCKS.register("slate_cobblestone_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.BLUE_TERRACOTTA).doesNotBlockMovement().hardnessAndResistance(1.5F,
            6.0F).sound(SoundType.STONE), ToolType.PICKAXE));

    public static final RegistryObject<CustomBlock> SMOOTH_SLATE = BLOCKS.register("smooth_slate",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLUE_TERRACOTTA).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> SMOOTH_SLATE_STAIRS = BLOCKS.register("smooth_slate_stairs",
        () -> new CustomStairsBlock(() -> SMOOTH_SLATE.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.BLUE_TERRACOTTA).hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> SMOOTH_SLATE_SLAB = BLOCKS.register("smooth_slate_slab",
        () -> new CustomSlabBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLUE_TERRACOTTA).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomWallBlock> SMOOTH_SLATE_WALL = BLOCKS.register("smooth_slate_wall",
        () -> new CustomWallBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLUE_TERRACOTTA).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> SMOOTH_SLATE_PRESSURE_PLATE = BLOCKS.register("smooth_slate_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.BLUE_TERRACOTTA).doesNotBlockMovement().hardnessAndResistance(1.5F,
            6.0F).sound(SoundType.STONE), ToolType.PICKAXE));

    public static final RegistryObject<CustomBlock> POLISHED_SLATE = BLOCKS.register("polished_slate",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLUE_TERRACOTTA).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> POLISHED_SLATE_STAIRS = BLOCKS.register("polished_slate_stairs",
        () -> new CustomStairsBlock(() -> POLISHED_SLATE.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.BLUE_TERRACOTTA).hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> POLISHED_SLATE_SLAB = BLOCKS.register("polished_slate_slab",
        () -> new CustomSlabBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLUE_TERRACOTTA).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomWallBlock> POLISHED_SLATE_WALL = BLOCKS.register("polished_slate_wall",
        () -> new CustomWallBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLUE_TERRACOTTA).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> POLISHED_SLATE_PRESSURE_PLATE = BLOCKS.register("polished_slate_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.BLUE_TERRACOTTA).doesNotBlockMovement().hardnessAndResistance(1.5F,
            6.0F).sound(SoundType.STONE), ToolType.PICKAXE));

    public static final RegistryObject<CustomBlock> SLATE_PAVING = BLOCKS.register("slate_paving",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLUE_TERRACOTTA).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> SLATE_PAVING_STAIRS = BLOCKS.register("slate_paving_stairs",
        () -> new CustomStairsBlock(() -> SLATE.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.BLUE_TERRACOTTA).hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> SLATE_PAVING_SLAB = BLOCKS.register("slate_paving_slab",
        () -> new CustomSlabBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLUE_TERRACOTTA).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomWallBlock> SLATE_PAVING_WALL = BLOCKS.register("slate_paving_wall",
        () -> new CustomWallBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLUE_TERRACOTTA).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> SLATE_PAVING_PRESSURE_PLATE = BLOCKS.register("slate_paving_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.BLUE_TERRACOTTA).doesNotBlockMovement().hardnessAndResistance(1.5F,
            6.0F).sound(SoundType.STONE), ToolType.PICKAXE));

    public static final RegistryObject<CustomBlock> SLATE_TILES = BLOCKS.register("slate_tiles",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLUE_TERRACOTTA).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> SLATE_TILES_STAIRS = BLOCKS.register("slate_tiles_stairs",
        () -> new CustomStairsBlock(() -> SLATE.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.BLUE_TERRACOTTA).hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> SLATE_TILES_SLAB = BLOCKS.register("slate_tiles_slab",
        () -> new CustomSlabBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLUE_TERRACOTTA).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomWallBlock> SLATE_TILES_WALL = BLOCKS.register("slate_tiles_wall",
        () -> new CustomWallBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLUE_TERRACOTTA).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> SLATE_TILES_PRESSURE_PLATE = BLOCKS.register("slate_tiles_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.BLUE_TERRACOTTA).doesNotBlockMovement().hardnessAndResistance(1.5F,
            6.0F).sound(SoundType.STONE), ToolType.PICKAXE));

    public static final RegistryObject<CustomBlock> SLATE_BRICKS = BLOCKS.register("slate_bricks",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLUE_TERRACOTTA).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> SLATE_BRICKS_STAIRS = BLOCKS.register("slate_bricks_stairs",
        () -> new CustomStairsBlock(() -> SLATE.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.BLUE_TERRACOTTA).hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> SLATE_BRICKS_SLAB = BLOCKS.register("slate_bricks_slab",
        () -> new CustomSlabBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLUE_TERRACOTTA).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomWallBlock> SLATE_BRICKS_WALL = BLOCKS.register("slate_bricks_wall",
        () -> new CustomWallBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLUE_TERRACOTTA).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> SLATE_BRICKS_PRESSURE_PLATE = BLOCKS.register("slate_bricks_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.BLUE_TERRACOTTA).doesNotBlockMovement().hardnessAndResistance(1.5F,
            6.0F).sound(SoundType.STONE), ToolType.PICKAXE));

    public static final RegistryObject<CustomBlock> SLATE_LARGE_BRICKS = BLOCKS.register("slate_large_bricks",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLUE_TERRACOTTA).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> SLATE_LARGE_BRICKS_STAIRS = BLOCKS.register("slate_large_bricks_stairs",
        () -> new CustomStairsBlock(() -> SLATE.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.BLUE_TERRACOTTA).hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> SLATE_LARGE_BRICKS_SLAB = BLOCKS.register("slate_large_bricks_slab",
        () -> new CustomSlabBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLUE_TERRACOTTA).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomWallBlock> SLATE_LARGE_BRICKS_WALL = BLOCKS.register("slate_large_bricks_wall",
        () -> new CustomWallBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLUE_TERRACOTTA).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> SLATE_LARGE_BRICKS_PRESSURE_PLATE = BLOCKS.register("slate_large_bricks_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.BLUE_TERRACOTTA).doesNotBlockMovement().hardnessAndResistance(1.5F,
            6.0F).sound(SoundType.STONE), ToolType.PICKAXE));

    public static final RegistryObject<CustomBlock> SLATE_ORNAMENT = BLOCKS.register("slate_ornament",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLUE_TERRACOTTA).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> SLATE_ORNAMENT_PRESSURE_PLATE = BLOCKS.register("slate_ornament_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.BLUE_TERRACOTTA).doesNotBlockMovement().hardnessAndResistance(1.5F,
            6.0F).sound(SoundType.STONE), ToolType.PICKAXE));

    // Marble
    public static final RegistryObject<CustomBlock> MARBLE = BLOCKS.register("marble",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.QUARTZ).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> MARBLE_STAIRS = BLOCKS.register("marble_stairs",
        () -> new CustomStairsBlock(() -> MARBLE.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.QUARTZ).hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> MARBLE_SLAB = BLOCKS.register("marble_slab",
        () -> new CustomSlabBlock(Block.Properties.create(Material.ROCK, MaterialColor.QUARTZ).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomWallBlock> MARBLE_WALL = BLOCKS.register("marble_wall",
        () -> new CustomWallBlock(Block.Properties.create(Material.ROCK, MaterialColor.QUARTZ).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> MARBLE_PRESSURE_PLATE = BLOCKS.register("marble_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.QUARTZ).doesNotBlockMovement().hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomButtonBlock> MARBLE_BUTTON = BLOCKS.register("marble_button",
        () -> new CustomButtonBlock(false, Block.Properties.create(Material.ROCK, MaterialColor.QUARTZ).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE)));

    public static final RegistryObject<CustomBlock> MARBLE_COBBLESTONE = BLOCKS.register("marble_cobblestone",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.QUARTZ).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> MARBLE_COBBLESTONE_STAIRS = BLOCKS.register("marble_cobblestone_stairs",
        () -> new CustomStairsBlock(() -> MARBLE.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.QUARTZ).hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> MARBLE_COBBLESTONE_SLAB = BLOCKS.register("marble_cobblestone_slab",
        () -> new CustomSlabBlock(Block.Properties.create(Material.ROCK, MaterialColor.QUARTZ).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomWallBlock> MARBLE_COBBLESTONE_WALL = BLOCKS.register("marble_cobblestone_wall",
        () -> new CustomWallBlock(Block.Properties.create(Material.ROCK, MaterialColor.QUARTZ).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> MARBLE_COBBLESTONE_PRESSURE_PLATE = BLOCKS.register("marble_cobblestone_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.QUARTZ).doesNotBlockMovement().hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));

    public static final RegistryObject<CustomBlock> SMOOTH_MARBLE = BLOCKS.register("smooth_marble",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.QUARTZ).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> SMOOTH_MARBLE_STAIRS = BLOCKS.register("smooth_marble_stairs",
        () -> new CustomStairsBlock(() -> SMOOTH_MARBLE.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.QUARTZ).hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> SMOOTH_MARBLE_SLAB = BLOCKS.register("smooth_marble_slab",
        () -> new CustomSlabBlock(Block.Properties.create(Material.ROCK, MaterialColor.QUARTZ).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomWallBlock> SMOOTH_MARBLE_WALL = BLOCKS.register("smooth_marble_wall",
        () -> new CustomWallBlock(Block.Properties.create(Material.ROCK, MaterialColor.QUARTZ).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> SMOOTH_MARBLE_PRESSURE_PLATE = BLOCKS.register("smooth_marble_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.QUARTZ).doesNotBlockMovement().hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));

    public static final RegistryObject<CustomBlock> POLISHED_MARBLE = BLOCKS.register("polished_marble",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.QUARTZ).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> POLISHED_MARBLE_STAIRS = BLOCKS.register("polished_marble_stairs",
        () -> new CustomStairsBlock(() -> POLISHED_MARBLE.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.QUARTZ).hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> POLISHED_MARBLE_SLAB = BLOCKS.register("polished_marble_slab",
        () -> new CustomSlabBlock(Block.Properties.create(Material.ROCK, MaterialColor.QUARTZ).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomWallBlock> POLISHED_MARBLE_WALL = BLOCKS.register("polished_marble_wall",
        () -> new CustomWallBlock(Block.Properties.create(Material.ROCK, MaterialColor.QUARTZ).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> POLISHED_MARBLE_PRESSURE_PLATE = BLOCKS.register("polished_marble_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.QUARTZ).doesNotBlockMovement().hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));

    public static final RegistryObject<CustomBlock> MARBLE_PAVING = BLOCKS.register("marble_paving",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.QUARTZ).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> MARBLE_PAVING_STAIRS = BLOCKS.register("marble_paving_stairs",
        () -> new CustomStairsBlock(() -> MARBLE.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.QUARTZ).hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> MARBLE_PAVING_SLAB = BLOCKS.register("marble_paving_slab",
        () -> new CustomSlabBlock(Block.Properties.create(Material.ROCK, MaterialColor.QUARTZ).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomWallBlock> MARBLE_PAVING_WALL = BLOCKS.register("marble_paving_wall",
        () -> new CustomWallBlock(Block.Properties.create(Material.ROCK, MaterialColor.QUARTZ).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> MARBLE_PAVING_PRESSURE_PLATE = BLOCKS.register("marble_paving_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.QUARTZ).doesNotBlockMovement().hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));

    public static final RegistryObject<CustomBlock> MARBLE_TILES = BLOCKS.register("marble_tiles",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.QUARTZ).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> MARBLE_TILES_STAIRS = BLOCKS.register("marble_tiles_stairs",
        () -> new CustomStairsBlock(() -> MARBLE.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.QUARTZ).hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> MARBLE_TILES_SLAB = BLOCKS.register("marble_tiles_slab",
        () -> new CustomSlabBlock(Block.Properties.create(Material.ROCK, MaterialColor.QUARTZ).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomWallBlock> MARBLE_TILES_WALL = BLOCKS.register("marble_tiles_wall",
        () -> new CustomWallBlock(Block.Properties.create(Material.ROCK, MaterialColor.QUARTZ).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> MARBLE_TILES_PRESSURE_PLATE = BLOCKS.register("marble_tiles_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.QUARTZ).doesNotBlockMovement().hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));

    public static final RegistryObject<CustomBlock> MARBLE_BRICKS = BLOCKS.register("marble_bricks",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.QUARTZ).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> MARBLE_BRICKS_STAIRS = BLOCKS.register("marble_bricks_stairs",
        () -> new CustomStairsBlock(() -> MARBLE.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.QUARTZ).hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> MARBLE_BRICKS_SLAB = BLOCKS.register("marble_bricks_slab",
        () -> new CustomSlabBlock(Block.Properties.create(Material.ROCK, MaterialColor.QUARTZ).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomWallBlock> MARBLE_BRICKS_WALL = BLOCKS.register("marble_bricks_wall",
        () -> new CustomWallBlock(Block.Properties.create(Material.ROCK, MaterialColor.QUARTZ).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> MARBLE_BRICKS_PRESSURE_PLATE = BLOCKS.register("marble_bricks_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.QUARTZ).doesNotBlockMovement().hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));

    public static final RegistryObject<CustomBlock> MARBLE_LARGE_BRICKS = BLOCKS.register("marble_large_bricks",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.QUARTZ).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> MARBLE_LARGE_BRICKS_STAIRS = BLOCKS.register("marble_large_bricks_stairs",
        () -> new CustomStairsBlock(() -> MARBLE.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.QUARTZ).hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> MARBLE_LARGE_BRICKS_SLAB = BLOCKS.register("marble_large_bricks_slab",
        () -> new CustomSlabBlock(Block.Properties.create(Material.ROCK, MaterialColor.QUARTZ).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomWallBlock> MARBLE_LARGE_BRICKS_WALL = BLOCKS.register("marble_large_bricks_wall",
        () -> new CustomWallBlock(Block.Properties.create(Material.ROCK, MaterialColor.QUARTZ).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> MARBLE_LARGE_BRICKS_PRESSURE_PLATE = BLOCKS.register("marble_large_bricks_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.QUARTZ).doesNotBlockMovement().hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));

    public static final RegistryObject<CustomBlock> MARBLE_ORNAMENT = BLOCKS.register("marble_ornament",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.QUARTZ).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> MARBLE_ORNAMENT_PRESSURE_PLATE = BLOCKS.register("marble_ornament_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.QUARTZ).doesNotBlockMovement().hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));

    // Gneiss
    public static final RegistryObject<CustomBlock> GNEISS = BLOCKS.register("gneiss",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.WHITE_TERRACOTTA).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> GNEISS_STAIRS = BLOCKS.register("gneiss_stairs",
        () -> new CustomStairsBlock(() -> GNEISS.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.WHITE_TERRACOTTA).hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> GNEISS_SLAB = BLOCKS.register("gneiss_slab",
        () -> new CustomSlabBlock(Block.Properties.create(Material.ROCK, MaterialColor.WHITE_TERRACOTTA).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomWallBlock> GNEISS_WALL = BLOCKS.register("gneiss_wall",
        () -> new CustomWallBlock(Block.Properties.create(Material.ROCK, MaterialColor.WHITE_TERRACOTTA).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> GNEISS_PRESSURE_PLATE = BLOCKS.register("gneiss_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.WHITE_TERRACOTTA).doesNotBlockMovement().hardnessAndResistance(1.5F,
            6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomButtonBlock> GNEISS_BUTTON = BLOCKS.register("gneiss_button",
        () -> new CustomButtonBlock(false, Block.Properties.create(Material.ROCK, MaterialColor.WHITE_TERRACOTTA).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE)));

    public static final RegistryObject<CustomBlock> GNEISS_COBBLESTONE = BLOCKS.register("gneiss_cobblestone",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.WHITE_TERRACOTTA).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> GNEISS_COBBLESTONE_STAIRS = BLOCKS.register("gneiss_cobblestone_stairs",
        () -> new CustomStairsBlock(() -> GNEISS.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.WHITE_TERRACOTTA).hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> GNEISS_COBBLESTONE_SLAB = BLOCKS.register("gneiss_cobblestone_slab",
        () -> new CustomSlabBlock(Block.Properties.create(Material.ROCK, MaterialColor.WHITE_TERRACOTTA).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomWallBlock> GNEISS_COBBLESTONE_WALL = BLOCKS.register("gneiss_cobblestone_wall",
        () -> new CustomWallBlock(Block.Properties.create(Material.ROCK, MaterialColor.WHITE_TERRACOTTA).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> GNEISS_COBBLESTONE_PRESSURE_PLATE = BLOCKS.register("gneiss_cobblestone_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.WHITE_TERRACOTTA).doesNotBlockMovement().hardnessAndResistance(1.5F,
            6.0F).sound(SoundType.STONE), ToolType.PICKAXE));

    public static final RegistryObject<CustomBlock> SMOOTH_GNEISS = BLOCKS.register("smooth_gneiss",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.WHITE_TERRACOTTA).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> SMOOTH_GNEISS_STAIRS = BLOCKS.register("smooth_gneiss_stairs",
        () -> new CustomStairsBlock(() -> SMOOTH_GNEISS.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.WHITE_TERRACOTTA).hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> SMOOTH_GNEISS_SLAB = BLOCKS.register("smooth_gneiss_slab",
        () -> new CustomSlabBlock(Block.Properties.create(Material.ROCK, MaterialColor.WHITE_TERRACOTTA).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomWallBlock> SMOOTH_GNEISS_WALL = BLOCKS.register("smooth_gneiss_wall",
        () -> new CustomWallBlock(Block.Properties.create(Material.ROCK, MaterialColor.WHITE_TERRACOTTA).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> SMOOTH_GNEISS_PRESSURE_PLATE = BLOCKS.register("smooth_gneiss_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.WHITE_TERRACOTTA).doesNotBlockMovement().hardnessAndResistance(1.5F,
            6.0F).sound(SoundType.STONE), ToolType.PICKAXE));

    public static final RegistryObject<CustomBlock> POLISHED_GNEISS = BLOCKS.register("polished_gneiss",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.WHITE_TERRACOTTA).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> POLISHED_GNEISS_STAIRS = BLOCKS.register("polished_gneiss_stairs",
        () -> new CustomStairsBlock(() -> POLISHED_GNEISS.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.WHITE_TERRACOTTA).hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> POLISHED_GNEISS_SLAB = BLOCKS.register("polished_gneiss_slab",
        () -> new CustomSlabBlock(Block.Properties.create(Material.ROCK, MaterialColor.WHITE_TERRACOTTA).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomWallBlock> POLISHED_GNEISS_WALL = BLOCKS.register("polished_gneiss_wall",
        () -> new CustomWallBlock(Block.Properties.create(Material.ROCK, MaterialColor.WHITE_TERRACOTTA).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> POLISHED_GNEISS_PRESSURE_PLATE = BLOCKS.register("polished_gneiss_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.WHITE_TERRACOTTA).doesNotBlockMovement().hardnessAndResistance(1.5F,
            6.0F).sound(SoundType.STONE), ToolType.PICKAXE));

    public static final RegistryObject<CustomBlock> GNEISS_PAVING = BLOCKS.register("gneiss_paving",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.WHITE_TERRACOTTA).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> GNEISS_PAVING_STAIRS = BLOCKS.register("gneiss_paving_stairs",
        () -> new CustomStairsBlock(() -> GNEISS.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.WHITE_TERRACOTTA).hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> GNEISS_PAVING_SLAB = BLOCKS.register("gneiss_paving_slab",
        () -> new CustomSlabBlock(Block.Properties.create(Material.ROCK, MaterialColor.WHITE_TERRACOTTA).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomWallBlock> GNEISS_PAVING_WALL = BLOCKS.register("gneiss_paving_wall",
        () -> new CustomWallBlock(Block.Properties.create(Material.ROCK, MaterialColor.WHITE_TERRACOTTA).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> GNEISS_PAVING_PRESSURE_PLATE = BLOCKS.register("gneiss_paving_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.WHITE_TERRACOTTA).doesNotBlockMovement().hardnessAndResistance(1.5F,
            6.0F).sound(SoundType.STONE), ToolType.PICKAXE));

    public static final RegistryObject<CustomBlock> GNEISS_TILES = BLOCKS.register("gneiss_tiles",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.WHITE_TERRACOTTA).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> GNEISS_TILES_STAIRS = BLOCKS.register("gneiss_tiles_stairs",
        () -> new CustomStairsBlock(() -> GNEISS.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.WHITE_TERRACOTTA).hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> GNEISS_TILES_SLAB = BLOCKS.register("gneiss_tiles_slab",
        () -> new CustomSlabBlock(Block.Properties.create(Material.ROCK, MaterialColor.WHITE_TERRACOTTA).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomWallBlock> GNEISS_TILES_WALL = BLOCKS.register("gneiss_tiles_wall",
        () -> new CustomWallBlock(Block.Properties.create(Material.ROCK, MaterialColor.WHITE_TERRACOTTA).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> GNEISS_TILES_PRESSURE_PLATE = BLOCKS.register("gneiss_tiles_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.WHITE_TERRACOTTA).doesNotBlockMovement().hardnessAndResistance(1.5F,
            6.0F).sound(SoundType.STONE), ToolType.PICKAXE));

    public static final RegistryObject<CustomBlock> GNEISS_BRICKS = BLOCKS.register("gneiss_bricks",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.WHITE_TERRACOTTA).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> GNEISS_BRICKS_STAIRS = BLOCKS.register("gneiss_bricks_stairs",
        () -> new CustomStairsBlock(() -> GNEISS.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.WHITE_TERRACOTTA).hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> GNEISS_BRICKS_SLAB = BLOCKS.register("gneiss_bricks_slab",
        () -> new CustomSlabBlock(Block.Properties.create(Material.ROCK, MaterialColor.WHITE_TERRACOTTA).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomWallBlock> GNEISS_BRICKS_WALL = BLOCKS.register("gneiss_bricks_wall",
        () -> new CustomWallBlock(Block.Properties.create(Material.ROCK, MaterialColor.WHITE_TERRACOTTA).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> GNEISS_BRICKS_PRESSURE_PLATE = BLOCKS.register("gneiss_bricks_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.WHITE_TERRACOTTA).doesNotBlockMovement().hardnessAndResistance(1.5F,
            6.0F).sound(SoundType.STONE), ToolType.PICKAXE));

    public static final RegistryObject<CustomBlock> GNEISS_LARGE_BRICKS = BLOCKS.register("gneiss_large_bricks",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.WHITE_TERRACOTTA).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> GNEISS_LARGE_BRICKS_STAIRS = BLOCKS.register("gneiss_large_bricks_stairs",
        () -> new CustomStairsBlock(() -> GNEISS.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.WHITE_TERRACOTTA).hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> GNEISS_LARGE_BRICKS_SLAB = BLOCKS.register("gneiss_large_bricks_slab",
        () -> new CustomSlabBlock(Block.Properties.create(Material.ROCK, MaterialColor.WHITE_TERRACOTTA).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomWallBlock> GNEISS_LARGE_BRICKS_WALL = BLOCKS.register("gneiss_large_bricks_wall",
        () -> new CustomWallBlock(Block.Properties.create(Material.ROCK, MaterialColor.WHITE_TERRACOTTA).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> GNEISS_LARGE_BRICKS_PRESSURE_PLATE = BLOCKS.register("gneiss_large_bricks_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.WHITE_TERRACOTTA).doesNotBlockMovement().hardnessAndResistance(1.5F,
            6.0F).sound(SoundType.STONE), ToolType.PICKAXE));

    public static final RegistryObject<CustomBlock> GNEISS_ORNAMENT = BLOCKS.register("gneiss_ornament",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.WHITE_TERRACOTTA).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> GNEISS_ORNAMENT_PRESSURE_PLATE = BLOCKS.register("gneiss_ornament_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.WHITE_TERRACOTTA).doesNotBlockMovement().hardnessAndResistance(1.5F,
            6.0F).sound(SoundType.STONE), ToolType.PICKAXE));

    // Jade
    public static final RegistryObject<CustomBlock> JADE = BLOCKS.register("jade",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.GREEN_TERRACOTTA).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> JADE_STAIRS = BLOCKS.register("jade_stairs",
        () -> new CustomStairsBlock(() -> JADE.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.GREEN_TERRACOTTA).hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> JADE_SLAB = BLOCKS.register("jade_slab",
        () -> new CustomSlabBlock(Block.Properties.create(Material.ROCK, MaterialColor.GREEN_TERRACOTTA).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomWallBlock> JADE_WALL = BLOCKS.register("jade_wall",
        () -> new CustomWallBlock(Block.Properties.create(Material.ROCK, MaterialColor.GREEN_TERRACOTTA).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> JADE_PRESSURE_PLATE = BLOCKS.register("jade_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.GREEN_TERRACOTTA).doesNotBlockMovement().hardnessAndResistance(1.5F,
            6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomButtonBlock> JADE_BUTTON = BLOCKS.register("jade_button",
        () -> new CustomButtonBlock(false, Block.Properties.create(Material.ROCK, MaterialColor.GREEN_TERRACOTTA).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE)));

    public static final RegistryObject<CustomBlock> JADE_COBBLESTONE = BLOCKS.register("jade_cobblestone",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.GREEN_TERRACOTTA).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> JADE_COBBLESTONE_STAIRS = BLOCKS.register("jade_cobblestone_stairs",
        () -> new CustomStairsBlock(() -> JADE.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.GREEN_TERRACOTTA).hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> JADE_COBBLESTONE_SLAB = BLOCKS.register("jade_cobblestone_slab",
        () -> new CustomSlabBlock(Block.Properties.create(Material.ROCK, MaterialColor.GREEN_TERRACOTTA).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomWallBlock> JADE_COBBLESTONE_WALL = BLOCKS.register("jade_cobblestone_wall",
        () -> new CustomWallBlock(Block.Properties.create(Material.ROCK, MaterialColor.GREEN_TERRACOTTA).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> JADE_COBBLESTONE_PRESSURE_PLATE = BLOCKS.register("jade_cobblestone_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.GREEN_TERRACOTTA).doesNotBlockMovement().hardnessAndResistance(1.5F,
            6.0F).sound(SoundType.STONE), ToolType.PICKAXE));

    public static final RegistryObject<CustomBlock> SMOOTH_JADE = BLOCKS.register("smooth_jade",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.GREEN_TERRACOTTA).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> SMOOTH_JADE_STAIRS = BLOCKS.register("smooth_jade_stairs",
        () -> new CustomStairsBlock(() -> SMOOTH_JADE.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.GREEN_TERRACOTTA).hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> SMOOTH_JADE_SLAB = BLOCKS.register("smooth_jade_slab",
        () -> new CustomSlabBlock(Block.Properties.create(Material.ROCK, MaterialColor.GREEN_TERRACOTTA).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomWallBlock> SMOOTH_JADE_WALL = BLOCKS.register("smooth_jade_wall",
        () -> new CustomWallBlock(Block.Properties.create(Material.ROCK, MaterialColor.GREEN_TERRACOTTA).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> SMOOTH_JADE_PRESSURE_PLATE = BLOCKS.register("smooth_jade_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.GREEN_TERRACOTTA).doesNotBlockMovement().hardnessAndResistance(1.5F,
            6.0F).sound(SoundType.STONE), ToolType.PICKAXE));

    public static final RegistryObject<CustomBlock> POLISHED_JADE = BLOCKS.register("polished_jade",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.GREEN_TERRACOTTA).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> POLISHED_JADE_STAIRS = BLOCKS.register("polished_jade_stairs",
        () -> new CustomStairsBlock(() -> POLISHED_JADE.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.GREEN_TERRACOTTA).hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> POLISHED_JADE_SLAB = BLOCKS.register("polished_jade_slab",
        () -> new CustomSlabBlock(Block.Properties.create(Material.ROCK, MaterialColor.GREEN_TERRACOTTA).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomWallBlock> POLISHED_JADE_WALL = BLOCKS.register("polished_jade_wall",
        () -> new CustomWallBlock(Block.Properties.create(Material.ROCK, MaterialColor.GREEN_TERRACOTTA).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> POLISHED_JADE_PRESSURE_PLATE = BLOCKS.register("polished_jade_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.GREEN_TERRACOTTA).doesNotBlockMovement().hardnessAndResistance(1.5F,
            6.0F).sound(SoundType.STONE), ToolType.PICKAXE));

    public static final RegistryObject<CustomBlock> JADE_PAVING = BLOCKS.register("jade_paving",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.GREEN_TERRACOTTA).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> JADE_PAVING_STAIRS = BLOCKS.register("jade_paving_stairs",
        () -> new CustomStairsBlock(() -> JADE.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.GREEN_TERRACOTTA).hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> JADE_PAVING_SLAB = BLOCKS.register("jade_paving_slab",
        () -> new CustomSlabBlock(Block.Properties.create(Material.ROCK, MaterialColor.GREEN_TERRACOTTA).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomWallBlock> JADE_PAVING_WALL = BLOCKS.register("jade_paving_wall",
        () -> new CustomWallBlock(Block.Properties.create(Material.ROCK, MaterialColor.GREEN_TERRACOTTA).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> JADE_PAVING_PRESSURE_PLATE = BLOCKS.register("jade_paving_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.GREEN_TERRACOTTA).doesNotBlockMovement().hardnessAndResistance(1.5F,
            6.0F).sound(SoundType.STONE), ToolType.PICKAXE));

    public static final RegistryObject<CustomBlock> JADE_TILES = BLOCKS.register("jade_tiles",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.GREEN_TERRACOTTA).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> JADE_TILES_STAIRS = BLOCKS.register("jade_tiles_stairs",
        () -> new CustomStairsBlock(() -> JADE.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.GREEN_TERRACOTTA).hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> JADE_TILES_SLAB = BLOCKS.register("jade_tiles_slab",
        () -> new CustomSlabBlock(Block.Properties.create(Material.ROCK, MaterialColor.GREEN_TERRACOTTA).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomWallBlock> JADE_TILES_WALL = BLOCKS.register("jade_tiles_wall",
        () -> new CustomWallBlock(Block.Properties.create(Material.ROCK, MaterialColor.GREEN_TERRACOTTA).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> JADE_TILES_PRESSURE_PLATE = BLOCKS.register("jade_tiles_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.GREEN_TERRACOTTA).doesNotBlockMovement().hardnessAndResistance(1.5F,
            6.0F).sound(SoundType.STONE), ToolType.PICKAXE));

    public static final RegistryObject<CustomBlock> JADE_BRICKS = BLOCKS.register("jade_bricks",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.GREEN_TERRACOTTA).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> JADE_BRICKS_STAIRS = BLOCKS.register("jade_bricks_stairs",
        () -> new CustomStairsBlock(() -> JADE.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.GREEN_TERRACOTTA).hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> JADE_BRICKS_SLAB = BLOCKS.register("jade_bricks_slab",
        () -> new CustomSlabBlock(Block.Properties.create(Material.ROCK, MaterialColor.GREEN_TERRACOTTA).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomWallBlock> JADE_BRICKS_WALL = BLOCKS.register("jade_bricks_wall",
        () -> new CustomWallBlock(Block.Properties.create(Material.ROCK, MaterialColor.GREEN_TERRACOTTA).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> JADE_BRICKS_PRESSURE_PLATE = BLOCKS.register("jade_bricks_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.GREEN_TERRACOTTA).doesNotBlockMovement().hardnessAndResistance(1.5F,
            6.0F).sound(SoundType.STONE), ToolType.PICKAXE));

    public static final RegistryObject<CustomBlock> JADE_LARGE_BRICKS = BLOCKS.register("jade_large_bricks",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.GREEN_TERRACOTTA).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> JADE_LARGE_BRICKS_STAIRS = BLOCKS.register("jade_large_bricks_stairs",
        () -> new CustomStairsBlock(() -> JADE.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.GREEN_TERRACOTTA).hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> JADE_LARGE_BRICKS_SLAB = BLOCKS.register("jade_large_bricks_slab",
        () -> new CustomSlabBlock(Block.Properties.create(Material.ROCK, MaterialColor.GREEN_TERRACOTTA).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomWallBlock> JADE_LARGE_BRICKS_WALL = BLOCKS.register("jade_large_bricks_wall",
        () -> new CustomWallBlock(Block.Properties.create(Material.ROCK, MaterialColor.GREEN_TERRACOTTA).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> JADE_LARGE_BRICKS_PRESSURE_PLATE = BLOCKS.register("jade_large_bricks_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.GREEN_TERRACOTTA).doesNotBlockMovement().hardnessAndResistance(1.5F,
            6.0F).sound(SoundType.STONE), ToolType.PICKAXE));

    public static final RegistryObject<CustomBlock> JADE_ORNAMENT = BLOCKS.register("jade_ornament",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.GREEN_TERRACOTTA).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> JADE_ORNAMENT_PRESSURE_PLATE = BLOCKS.register("jade_ornament_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.GREEN_TERRACOTTA).doesNotBlockMovement().hardnessAndResistance(1.5F,
            6.0F).sound(SoundType.STONE), ToolType.PICKAXE));

    // Larvikite
    public static final RegistryObject<CustomBlock> LARVIKITE = BLOCKS.register("larvikite",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.LIGHT_BLUE_TERRACOTTA).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> LARVIKITE_STAIRS = BLOCKS.register("larvikite_stairs",
        () -> new CustomStairsBlock(() -> LARVIKITE.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.LIGHT_BLUE_TERRACOTTA).hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> LARVIKITE_SLAB = BLOCKS.register("larvikite_slab",
        () -> new CustomSlabBlock(Block.Properties.create(Material.ROCK, MaterialColor.LIGHT_BLUE_TERRACOTTA).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomWallBlock> LARVIKITE_WALL = BLOCKS.register("larvikite_wall",
        () -> new CustomWallBlock(Block.Properties.create(Material.ROCK, MaterialColor.LIGHT_BLUE_TERRACOTTA).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> LARVIKITE_PRESSURE_PLATE = BLOCKS.register("larvikite_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.LIGHT_BLUE_TERRACOTTA).doesNotBlockMovement().hardnessAndResistance(1.5F,
            6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomButtonBlock> LARVIKITE_BUTTON = BLOCKS.register("larvikite_button",
        () -> new CustomButtonBlock(false, Block.Properties.create(Material.ROCK, MaterialColor.LIGHT_BLUE_TERRACOTTA).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE)));

    public static final RegistryObject<CustomBlock> LARVIKITE_COBBLESTONE = BLOCKS.register("larvikite_cobblestone",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.LIGHT_BLUE_TERRACOTTA).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> LARVIKITE_COBBLESTONE_STAIRS = BLOCKS.register("larvikite_cobblestone_stairs",
        () -> new CustomStairsBlock(() -> LARVIKITE.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.LIGHT_BLUE_TERRACOTTA).hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> LARVIKITE_COBBLESTONE_SLAB = BLOCKS.register("larvikite_cobblestone_slab",
        () -> new CustomSlabBlock(Block.Properties.create(Material.ROCK, MaterialColor.LIGHT_BLUE_TERRACOTTA).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomWallBlock> LARVIKITE_COBBLESTONE_WALL = BLOCKS.register("larvikite_cobblestone_wall",
        () -> new CustomWallBlock(Block.Properties.create(Material.ROCK, MaterialColor.LIGHT_BLUE_TERRACOTTA).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> LARVIKITE_COBBLESTONE_PRESSURE_PLATE = BLOCKS.register("larvikite_cobblestone_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.LIGHT_BLUE_TERRACOTTA).doesNotBlockMovement().hardnessAndResistance(1.5F,
            6.0F).sound(SoundType.STONE), ToolType.PICKAXE));

    public static final RegistryObject<CustomBlock> SMOOTH_LARVIKITE = BLOCKS.register("smooth_larvikite",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.LIGHT_BLUE_TERRACOTTA).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> SMOOTH_LARVIKITE_STAIRS = BLOCKS.register("smooth_larvikite_stairs",
        () -> new CustomStairsBlock(() -> SMOOTH_LARVIKITE.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.LIGHT_BLUE_TERRACOTTA).hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> SMOOTH_LARVIKITE_SLAB = BLOCKS.register("smooth_larvikite_slab",
        () -> new CustomSlabBlock(Block.Properties.create(Material.ROCK, MaterialColor.LIGHT_BLUE_TERRACOTTA).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomWallBlock> SMOOTH_LARVIKITE_WALL = BLOCKS.register("smooth_larvikite_wall",
        () -> new CustomWallBlock(Block.Properties.create(Material.ROCK, MaterialColor.LIGHT_BLUE_TERRACOTTA).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> SMOOTH_LARVIKITE_PRESSURE_PLATE = BLOCKS.register("smooth_larvikite_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.LIGHT_BLUE_TERRACOTTA).doesNotBlockMovement().hardnessAndResistance(1.5F,
            6.0F).sound(SoundType.STONE), ToolType.PICKAXE));

    public static final RegistryObject<CustomBlock> POLISHED_LARVIKITE = BLOCKS.register("polished_larvikite",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.LIGHT_BLUE_TERRACOTTA).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> POLISHED_LARVIKITE_STAIRS = BLOCKS.register("polished_larvikite_stairs",
        () -> new CustomStairsBlock(() -> POLISHED_LARVIKITE.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.LIGHT_BLUE_TERRACOTTA).hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> POLISHED_LARVIKITE_SLAB = BLOCKS.register("polished_larvikite_slab",
        () -> new CustomSlabBlock(Block.Properties.create(Material.ROCK, MaterialColor.LIGHT_BLUE_TERRACOTTA).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomWallBlock> POLISHED_LARVIKITE_WALL = BLOCKS.register("polished_larvikite_wall",
        () -> new CustomWallBlock(Block.Properties.create(Material.ROCK, MaterialColor.LIGHT_BLUE_TERRACOTTA).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> POLISHED_LARVIKITE_PRESSURE_PLATE = BLOCKS.register("polished_larvikite_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.LIGHT_BLUE_TERRACOTTA).doesNotBlockMovement().hardnessAndResistance(1.5F,
            6.0F).sound(SoundType.STONE), ToolType.PICKAXE));

    public static final RegistryObject<CustomBlock> LARVIKITE_PAVING = BLOCKS.register("larvikite_paving",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.LIGHT_BLUE_TERRACOTTA).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> LARVIKITE_PAVING_STAIRS = BLOCKS.register("larvikite_paving_stairs",
        () -> new CustomStairsBlock(() -> LARVIKITE.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.LIGHT_BLUE_TERRACOTTA).hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> LARVIKITE_PAVING_SLAB = BLOCKS.register("larvikite_paving_slab",
        () -> new CustomSlabBlock(Block.Properties.create(Material.ROCK, MaterialColor.LIGHT_BLUE_TERRACOTTA).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomWallBlock> LARVIKITE_PAVING_WALL = BLOCKS.register("larvikite_paving_wall",
        () -> new CustomWallBlock(Block.Properties.create(Material.ROCK, MaterialColor.LIGHT_BLUE_TERRACOTTA).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> LARVIKITE_PAVING_PRESSURE_PLATE = BLOCKS.register("larvikite_paving_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.LIGHT_BLUE_TERRACOTTA).doesNotBlockMovement().hardnessAndResistance(1.5F,
            6.0F).sound(SoundType.STONE), ToolType.PICKAXE));

    public static final RegistryObject<CustomBlock> LARVIKITE_TILES = BLOCKS.register("larvikite_tiles",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.LIGHT_BLUE_TERRACOTTA).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> LARVIKITE_TILES_STAIRS = BLOCKS.register("larvikite_tiles_stairs",
        () -> new CustomStairsBlock(() -> LARVIKITE.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.LIGHT_BLUE_TERRACOTTA).hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> LARVIKITE_TILES_SLAB = BLOCKS.register("larvikite_tiles_slab",
        () -> new CustomSlabBlock(Block.Properties.create(Material.ROCK, MaterialColor.LIGHT_BLUE_TERRACOTTA).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomWallBlock> LARVIKITE_TILES_WALL = BLOCKS.register("larvikite_tiles_wall",
        () -> new CustomWallBlock(Block.Properties.create(Material.ROCK, MaterialColor.LIGHT_BLUE_TERRACOTTA).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> LARVIKITE_TILES_PRESSURE_PLATE = BLOCKS.register("larvikite_tiles_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.LIGHT_BLUE_TERRACOTTA).doesNotBlockMovement().hardnessAndResistance(1.5F,
            6.0F).sound(SoundType.STONE), ToolType.PICKAXE));

    public static final RegistryObject<CustomBlock> LARVIKITE_BRICKS = BLOCKS.register("larvikite_bricks",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.LIGHT_BLUE_TERRACOTTA).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> LARVIKITE_BRICKS_STAIRS = BLOCKS.register("larvikite_bricks_stairs",
        () -> new CustomStairsBlock(() -> LARVIKITE.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.LIGHT_BLUE_TERRACOTTA).hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> LARVIKITE_BRICKS_SLAB = BLOCKS.register("larvikite_bricks_slab",
        () -> new CustomSlabBlock(Block.Properties.create(Material.ROCK, MaterialColor.LIGHT_BLUE_TERRACOTTA).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomWallBlock> LARVIKITE_BRICKS_WALL = BLOCKS.register("larvikite_bricks_wall",
        () -> new CustomWallBlock(Block.Properties.create(Material.ROCK, MaterialColor.LIGHT_BLUE_TERRACOTTA).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> LARVIKITE_BRICKS_PRESSURE_PLATE = BLOCKS.register("larvikite_bricks_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.LIGHT_BLUE_TERRACOTTA).doesNotBlockMovement().hardnessAndResistance(1.5F,
            6.0F).sound(SoundType.STONE), ToolType.PICKAXE));

    public static final RegistryObject<CustomBlock> LARVIKITE_LARGE_BRICKS = BLOCKS.register("larvikite_large_bricks",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.LIGHT_BLUE_TERRACOTTA).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> LARVIKITE_LARGE_BRICKS_STAIRS = BLOCKS.register("larvikite_large_bricks_stairs",
        () -> new CustomStairsBlock(() -> LARVIKITE.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.LIGHT_BLUE_TERRACOTTA).hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> LARVIKITE_LARGE_BRICKS_SLAB = BLOCKS.register("larvikite_large_bricks_slab",
        () -> new CustomSlabBlock(Block.Properties.create(Material.ROCK, MaterialColor.LIGHT_BLUE_TERRACOTTA).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomWallBlock> LARVIKITE_LARGE_BRICKS_WALL = BLOCKS.register("larvikite_large_bricks_wall",
        () -> new CustomWallBlock(Block.Properties.create(Material.ROCK, MaterialColor.LIGHT_BLUE_TERRACOTTA).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> LARVIKITE_LARGE_BRICKS_PRESSURE_PLATE = BLOCKS.register("larvikite_large_bricks_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.LIGHT_BLUE_TERRACOTTA).doesNotBlockMovement().hardnessAndResistance(1.5F,
            6.0F).sound(SoundType.STONE), ToolType.PICKAXE));

    public static final RegistryObject<CustomBlock> LARVIKITE_ORNAMENT = BLOCKS.register("larvikite_ornament",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.LIGHT_BLUE_TERRACOTTA).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> LARVIKITE_ORNAMENT_PRESSURE_PLATE = BLOCKS.register("larvikite_ornament_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.LIGHT_BLUE_TERRACOTTA).doesNotBlockMovement().hardnessAndResistance(1.5F,
            6.0F).sound(SoundType.STONE), ToolType.PICKAXE));

    // Andesite
    public static final RegistryObject<CustomBlock> SMOOTH_ANDESITE = BLOCKS.register("smooth_andesite",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.STONE).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> SMOOTH_ANDESITE_STAIRS = BLOCKS.register("smooth_andesite_stairs",
        () -> new CustomStairsBlock(() -> SMOOTH_ANDESITE.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.STONE).hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> SMOOTH_ANDESITE_SLAB = BLOCKS.register("smooth_andesite_slab",
        () -> new CustomSlabBlock(Block.Properties.create(Material.ROCK, MaterialColor.STONE).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomWallBlock> SMOOTH_ANDESITE_WALL = BLOCKS.register("smooth_andesite_wall",
        () -> new CustomWallBlock(Block.Properties.create(Material.ROCK, MaterialColor.STONE).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> SMOOTH_ANDESITE_PRESSURE_PLATE = BLOCKS.register("smooth_andesite_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.STONE).doesNotBlockMovement().hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomButtonBlock> ANDESITE_BUTTON = BLOCKS.register("andesite_button",
        () -> new CustomButtonBlock(false, Block.Properties.create(Material.ROCK, MaterialColor.STONE).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE)));

    public static final RegistryObject<CustomBlock> ANDESITE_PAVING = BLOCKS.register("andesite_paving",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.STONE).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> ANDESITE_PAVING_STAIRS = BLOCKS.register("andesite_paving_stairs",
        () -> new CustomStairsBlock(() -> Blocks.ANDESITE.getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.STONE).hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> ANDESITE_PAVING_SLAB = BLOCKS.register("andesite_paving_slab",
        () -> new CustomSlabBlock(Block.Properties.create(Material.ROCK, MaterialColor.STONE).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomWallBlock> ANDESITE_PAVING_WALL = BLOCKS.register("andesite_paving_wall",
        () -> new CustomWallBlock(Block.Properties.create(Material.ROCK, MaterialColor.STONE).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> ANDESITE_PAVING_PRESSURE_PLATE = BLOCKS.register("andesite_paving_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.STONE).doesNotBlockMovement().hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));

    public static final RegistryObject<CustomBlock> ANDESITE_TILES = BLOCKS.register("andesite_tiles",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.STONE).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> ANDESITE_TILES_STAIRS = BLOCKS.register("andesite_tiles_stairs",
        () -> new CustomStairsBlock(() -> Blocks.ANDESITE.getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.STONE).hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> ANDESITE_TILES_SLAB = BLOCKS.register("andesite_tiles_slab",
        () -> new CustomSlabBlock(Block.Properties.create(Material.ROCK, MaterialColor.STONE).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomWallBlock> ANDESITE_TILES_WALL = BLOCKS.register("andesite_tiles_wall",
        () -> new CustomWallBlock(Block.Properties.create(Material.ROCK, MaterialColor.STONE).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> ANDESITE_TILES_PRESSURE_PLATE = BLOCKS.register("andesite_tiles_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.STONE).doesNotBlockMovement().hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));

    public static final RegistryObject<CustomBlock> ANDESITE_BRICKS = BLOCKS.register("andesite_bricks",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.STONE).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> ANDESITE_BRICKS_STAIRS = BLOCKS.register("andesite_bricks_stairs",
        () -> new CustomStairsBlock(() -> Blocks.ANDESITE.getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.STONE).hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> ANDESITE_BRICKS_SLAB = BLOCKS.register("andesite_bricks_slab",
        () -> new CustomSlabBlock(Block.Properties.create(Material.ROCK, MaterialColor.STONE).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomWallBlock> ANDESITE_BRICKS_WALL = BLOCKS.register("andesite_bricks_wall",
        () -> new CustomWallBlock(Block.Properties.create(Material.ROCK, MaterialColor.STONE).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> ANDESITE_BRICKS_PRESSURE_PLATE = BLOCKS.register("andesite_bricks_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.STONE).doesNotBlockMovement().hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));

    public static final RegistryObject<CustomBlock> ANDESITE_LARGE_BRICKS = BLOCKS.register("andesite_large_bricks",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.STONE).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> ANDESITE_LARGE_BRICKS_STAIRS = BLOCKS.register("andesite_large_bricks_stairs",
        () -> new CustomStairsBlock(() -> Blocks.ANDESITE.getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.STONE).hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> ANDESITE_LARGE_BRICKS_SLAB = BLOCKS.register("andesite_large_bricks_slab",
        () -> new CustomSlabBlock(Block.Properties.create(Material.ROCK, MaterialColor.STONE).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomWallBlock> ANDESITE_LARGE_BRICKS_WALL = BLOCKS.register("andesite_large_bricks_wall",
        () -> new CustomWallBlock(Block.Properties.create(Material.ROCK, MaterialColor.STONE).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> ANDESITE_LARGE_BRICKS_PRESSURE_PLATE = BLOCKS.register("andesite_large_bricks_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.STONE).doesNotBlockMovement().hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));

    public static final RegistryObject<CustomBlock> ANDESITE_ORNAMENT = BLOCKS.register("andesite_ornament",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.STONE).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> ANDESITE_ORNAMENT_PRESSURE_PLATE = BLOCKS.register("andesite_ornament_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.STONE).doesNotBlockMovement().hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));

    // Diorite
    public static final RegistryObject<CustomBlock> SMOOTH_DIORITE = BLOCKS.register("smooth_diorite",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.QUARTZ).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> SMOOTH_DIORITE_STAIRS = BLOCKS.register("smooth_diorite_stairs",
        () -> new CustomStairsBlock(() -> SMOOTH_DIORITE.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.QUARTZ).hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> SMOOTH_DIORITE_SLAB = BLOCKS.register("smooth_diorite_slab",
        () -> new CustomSlabBlock(Block.Properties.create(Material.ROCK, MaterialColor.QUARTZ).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomWallBlock> SMOOTH_DIORITE_WALL = BLOCKS.register("smooth_diorite_wall",
        () -> new CustomWallBlock(Block.Properties.create(Material.ROCK, MaterialColor.QUARTZ).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> SMOOTH_DIORITE_PRESSURE_PLATE = BLOCKS.register("smooth_diorite_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.QUARTZ).doesNotBlockMovement().hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomButtonBlock> DIORITE_BUTTON = BLOCKS.register("diorite_button",
        () -> new CustomButtonBlock(false, Block.Properties.create(Material.ROCK, MaterialColor.QUARTZ).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE)));

    public static final RegistryObject<CustomBlock> DIORITE_PAVING = BLOCKS.register("diorite_paving",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.QUARTZ).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> DIORITE_PAVING_STAIRS = BLOCKS.register("diorite_paving_stairs",
        () -> new CustomStairsBlock(() -> Blocks.DIORITE.getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.QUARTZ).hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> DIORITE_PAVING_SLAB = BLOCKS.register("diorite_paving_slab",
        () -> new CustomSlabBlock(Block.Properties.create(Material.ROCK, MaterialColor.QUARTZ).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomWallBlock> DIORITE_PAVING_WALL = BLOCKS.register("diorite_paving_wall",
        () -> new CustomWallBlock(Block.Properties.create(Material.ROCK, MaterialColor.QUARTZ).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> DIORITE_PAVING_PRESSURE_PLATE = BLOCKS.register("diorite_paving_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.QUARTZ).doesNotBlockMovement().hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));

    public static final RegistryObject<CustomBlock> DIORITE_TILES = BLOCKS.register("diorite_tiles",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.QUARTZ).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> DIORITE_TILES_STAIRS = BLOCKS.register("diorite_tiles_stairs",
        () -> new CustomStairsBlock(() -> Blocks.DIORITE.getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.QUARTZ).hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> DIORITE_TILES_SLAB = BLOCKS.register("diorite_tiles_slab",
        () -> new CustomSlabBlock(Block.Properties.create(Material.ROCK, MaterialColor.QUARTZ).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomWallBlock> DIORITE_TILES_WALL = BLOCKS.register("diorite_tiles_wall",
        () -> new CustomWallBlock(Block.Properties.create(Material.ROCK, MaterialColor.QUARTZ).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> DIORITE_TILES_PRESSURE_PLATE = BLOCKS.register("diorite_tiles_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.QUARTZ).doesNotBlockMovement().hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));

    public static final RegistryObject<CustomBlock> DIORITE_BRICKS = BLOCKS.register("diorite_bricks",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.QUARTZ).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> DIORITE_BRICKS_STAIRS = BLOCKS.register("diorite_bricks_stairs",
        () -> new CustomStairsBlock(() -> Blocks.DIORITE.getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.QUARTZ).hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> DIORITE_BRICKS_SLAB = BLOCKS.register("diorite_bricks_slab",
        () -> new CustomSlabBlock(Block.Properties.create(Material.ROCK, MaterialColor.QUARTZ).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomWallBlock> DIORITE_BRICKS_WALL = BLOCKS.register("diorite_bricks_wall",
        () -> new CustomWallBlock(Block.Properties.create(Material.ROCK, MaterialColor.QUARTZ).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> DIORITE_BRICKS_PRESSURE_PLATE = BLOCKS.register("diorite_bricks_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.QUARTZ).doesNotBlockMovement().hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));

    public static final RegistryObject<CustomBlock> DIORITE_LARGE_BRICKS = BLOCKS.register("diorite_large_bricks",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.QUARTZ).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> DIORITE_LARGE_BRICKS_STAIRS = BLOCKS.register("diorite_large_bricks_stairs",
        () -> new CustomStairsBlock(() -> Blocks.DIORITE.getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.QUARTZ).hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> DIORITE_LARGE_BRICKS_SLAB = BLOCKS.register("diorite_large_bricks_slab",
        () -> new CustomSlabBlock(Block.Properties.create(Material.ROCK, MaterialColor.QUARTZ).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomWallBlock> DIORITE_LARGE_BRICKS_WALL = BLOCKS.register("diorite_large_bricks_wall",
        () -> new CustomWallBlock(Block.Properties.create(Material.ROCK, MaterialColor.QUARTZ).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> DIORITE_LARGE_BRICKS_PRESSURE_PLATE = BLOCKS.register("diorite_large_bricks_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.QUARTZ).doesNotBlockMovement().hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));

    public static final RegistryObject<CustomBlock> DIORITE_ORNAMENT = BLOCKS.register("diorite_ornament",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.QUARTZ).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> DIORITE_ORNAMENT_PRESSURE_PLATE = BLOCKS.register("diorite_ornament_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.QUARTZ).doesNotBlockMovement().hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));

    // Granite
    public static final RegistryObject<CustomBlock> SMOOTH_GRANITE = BLOCKS.register("smooth_granite",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.DIRT).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> SMOOTH_GRANITE_STAIRS = BLOCKS.register("smooth_granite_stairs",
        () -> new CustomStairsBlock(() -> SMOOTH_GRANITE.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.DIRT).hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> SMOOTH_GRANITE_SLAB = BLOCKS.register("smooth_granite_slab",
        () -> new CustomSlabBlock(Block.Properties.create(Material.ROCK, MaterialColor.DIRT).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomWallBlock> SMOOTH_GRANITE_WALL = BLOCKS.register("smooth_granite_wall",
        () -> new CustomWallBlock(Block.Properties.create(Material.ROCK, MaterialColor.DIRT).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> SMOOTH_GRANITE_PRESSURE_PLATE = BLOCKS.register("smooth_granite_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.DIRT).doesNotBlockMovement().hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomButtonBlock> GRANITE_BUTTON = BLOCKS.register("granite_button",
        () -> new CustomButtonBlock(false, Block.Properties.create(Material.ROCK, MaterialColor.DIRT).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE)));

    public static final RegistryObject<CustomBlock> GRANITE_PAVING = BLOCKS.register("granite_paving",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.DIRT).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> GRANITE_PAVING_STAIRS = BLOCKS.register("granite_paving_stairs",
        () -> new CustomStairsBlock(() -> Blocks.GRANITE.getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.DIRT).hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> GRANITE_PAVING_SLAB = BLOCKS.register("granite_paving_slab",
        () -> new CustomSlabBlock(Block.Properties.create(Material.ROCK, MaterialColor.DIRT).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomWallBlock> GRANITE_PAVING_WALL = BLOCKS.register("granite_paving_wall",
        () -> new CustomWallBlock(Block.Properties.create(Material.ROCK, MaterialColor.DIRT).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> GRANITE_PAVING_PRESSURE_PLATE = BLOCKS.register("granite_paving_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.DIRT).doesNotBlockMovement().hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));

    public static final RegistryObject<CustomBlock> GRANITE_TILES = BLOCKS.register("granite_tiles",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.DIRT).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> GRANITE_TILES_STAIRS = BLOCKS.register("granite_tiles_stairs",
        () -> new CustomStairsBlock(() -> Blocks.GRANITE.getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.DIRT).hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> GRANITE_TILES_SLAB = BLOCKS.register("granite_tiles_slab",
        () -> new CustomSlabBlock(Block.Properties.create(Material.ROCK, MaterialColor.DIRT).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomWallBlock> GRANITE_TILES_WALL = BLOCKS.register("granite_tiles_wall",
        () -> new CustomWallBlock(Block.Properties.create(Material.ROCK, MaterialColor.DIRT).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> GRANITE_TILES_PRESSURE_PLATE = BLOCKS.register("granite_tiles_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.DIRT).doesNotBlockMovement().hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));

    public static final RegistryObject<CustomBlock> GRANITE_BRICKS = BLOCKS.register("granite_bricks",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.DIRT).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> GRANITE_BRICKS_STAIRS = BLOCKS.register("granite_bricks_stairs",
        () -> new CustomStairsBlock(() -> Blocks.GRANITE.getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.DIRT).hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> GRANITE_BRICKS_SLAB = BLOCKS.register("granite_bricks_slab",
        () -> new CustomSlabBlock(Block.Properties.create(Material.ROCK, MaterialColor.DIRT).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomWallBlock> GRANITE_BRICKS_WALL = BLOCKS.register("granite_bricks_wall",
        () -> new CustomWallBlock(Block.Properties.create(Material.ROCK, MaterialColor.DIRT).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> GRANITE_BRICKS_PRESSURE_PLATE = BLOCKS.register("granite_bricks_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.DIRT).doesNotBlockMovement().hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));

    public static final RegistryObject<CustomBlock> GRANITE_LARGE_BRICKS = BLOCKS.register("granite_large_bricks",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.DIRT).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> GRANITE_LARGE_BRICKS_STAIRS = BLOCKS.register("granite_large_bricks_stairs",
        () -> new CustomStairsBlock(() -> Blocks.GRANITE.getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.DIRT).hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> GRANITE_LARGE_BRICKS_SLAB = BLOCKS.register("granite_large_bricks_slab",
        () -> new CustomSlabBlock(Block.Properties.create(Material.ROCK, MaterialColor.DIRT).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomWallBlock> GRANITE_LARGE_BRICKS_WALL = BLOCKS.register("granite_large_bricks_wall",
        () -> new CustomWallBlock(Block.Properties.create(Material.ROCK, MaterialColor.DIRT).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> GRANITE_LARGE_BRICKS_PRESSURE_PLATE = BLOCKS.register("granite_large_bricks_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.DIRT).doesNotBlockMovement().hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));

    public static final RegistryObject<CustomBlock> GRANITE_ORNAMENT = BLOCKS.register("granite_ornament",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.DIRT).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> GRANITE_ORNAMENT_PRESSURE_PLATE = BLOCKS.register("granite_ornament_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.DIRT).doesNotBlockMovement().hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));

    // Sandstone
    public static final RegistryObject<CustomButtonBlock> SANDSTONE_BUTTON = BLOCKS.register("sandstone_button",
        () -> new CustomButtonBlock(false, Block.Properties.create(Material.ROCK, MaterialColor.SAND).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE)));

    public static final RegistryObject<CustomWallBlock> SMOOTH_SANDSTONE_WALL = BLOCKS.register("smooth_sandstone_wall",
        () -> new CustomWallBlock(Block.Properties.create(Material.ROCK, MaterialColor.SAND).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> SMOOTH_SANDSTONE_PRESSURE_PLATE = BLOCKS.register("smooth_sandstone_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.SAND).doesNotBlockMovement().hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));

    public static final RegistryObject<CustomBlock> POLISHED_SANDSTONE = BLOCKS.register("polished_sandstone",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.SAND).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> POLISHED_SANDSTONE_STAIRS = BLOCKS.register("polished_sandstone_stairs",
        () -> new CustomStairsBlock(() -> Blocks.SANDSTONE.getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.SAND).hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> POLISHED_SANDSTONE_SLAB = BLOCKS.register("polished_sandstone_slab",
        () -> new CustomSlabBlock(Block.Properties.create(Material.ROCK, MaterialColor.SAND).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomWallBlock> POLISHED_SANDSTONE_WALL = BLOCKS.register("polished_sandstone_wall",
        () -> new CustomWallBlock(Block.Properties.create(Material.ROCK, MaterialColor.SAND).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> POLISHED_SANDSTONE_PRESSURE_PLATE = BLOCKS.register("polished_sandstone_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.SAND).doesNotBlockMovement().hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));

    public static final RegistryObject<CustomBlock> SANDSTONE_PAVING = BLOCKS.register("sandstone_paving",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.SAND).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> SANDSTONE_PAVING_STAIRS = BLOCKS.register("sandstone_paving_stairs",
        () -> new CustomStairsBlock(() -> Blocks.SANDSTONE.getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.SAND).hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> SANDSTONE_PAVING_SLAB = BLOCKS.register("sandstone_paving_slab",
        () -> new CustomSlabBlock(Block.Properties.create(Material.ROCK, MaterialColor.SAND).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomWallBlock> SANDSTONE_PAVING_WALL = BLOCKS.register("sandstone_paving_wall",
        () -> new CustomWallBlock(Block.Properties.create(Material.ROCK, MaterialColor.SAND).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> SANDSTONE_PAVING_PRESSURE_PLATE = BLOCKS.register("sandstone_paving_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.SAND).doesNotBlockMovement().hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));

    public static final RegistryObject<CustomBlock> SANDSTONE_TILES = BLOCKS.register("sandstone_tiles",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.SAND).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> SANDSTONE_TILES_STAIRS = BLOCKS.register("sandstone_tiles_stairs",
        () -> new CustomStairsBlock(() -> Blocks.SANDSTONE.getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.SAND).hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> SANDSTONE_TILES_SLAB = BLOCKS.register("sandstone_tiles_slab",
        () -> new CustomSlabBlock(Block.Properties.create(Material.ROCK, MaterialColor.SAND).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomWallBlock> SANDSTONE_TILES_WALL = BLOCKS.register("sandstone_tiles_wall",
        () -> new CustomWallBlock(Block.Properties.create(Material.ROCK, MaterialColor.SAND).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> SANDSTONE_TILES_PRESSURE_PLATE = BLOCKS.register("sandstone_tiles_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.SAND).doesNotBlockMovement().hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));

    public static final RegistryObject<CustomBlock> SANDSTONE_BRICKS = BLOCKS.register("sandstone_bricks",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.SAND).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> SANDSTONE_BRICKS_STAIRS = BLOCKS.register("sandstone_bricks_stairs",
        () -> new CustomStairsBlock(() -> Blocks.SANDSTONE.getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.SAND).hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> SANDSTONE_BRICKS_SLAB = BLOCKS.register("sandstone_bricks_slab",
        () -> new CustomSlabBlock(Block.Properties.create(Material.ROCK, MaterialColor.SAND).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomWallBlock> SANDSTONE_BRICKS_WALL = BLOCKS.register("sandstone_bricks_wall",
        () -> new CustomWallBlock(Block.Properties.create(Material.ROCK, MaterialColor.SAND).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> SANDSTONE_BRICKS_PRESSURE_PLATE = BLOCKS.register("sandstone_bricks_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.SAND).doesNotBlockMovement().hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));

    public static final RegistryObject<CustomBlock> SANDSTONE_LARGE_BRICKS = BLOCKS.register("sandstone_large_bricks",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.SAND).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> SANDSTONE_LARGE_BRICKS_STAIRS = BLOCKS.register("sandstone_large_bricks_stairs",
        () -> new CustomStairsBlock(() -> Blocks.SANDSTONE.getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.SAND).hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> SANDSTONE_LARGE_BRICKS_SLAB = BLOCKS.register("sandstone_large_bricks_slab",
        () -> new CustomSlabBlock(Block.Properties.create(Material.ROCK, MaterialColor.SAND).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomWallBlock> SANDSTONE_LARGE_BRICKS_WALL = BLOCKS.register("sandstone_large_bricks_wall",
        () -> new CustomWallBlock(Block.Properties.create(Material.ROCK, MaterialColor.SAND).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> SANDSTONE_LARGE_BRICKS_PRESSURE_PLATE = BLOCKS.register("sandstone_large_bricks_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.SAND).doesNotBlockMovement().hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));

    // Red Sandstone
    public static final RegistryObject<CustomButtonBlock> RED_SANDSTONE_BUTTON = BLOCKS.register("red_sandstone_button",
        () -> new CustomButtonBlock(false, Block.Properties.create(Material.ROCK, MaterialColor.SAND).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE)));

    public static final RegistryObject<CustomWallBlock> SMOOTH_RED_SANDSTONE_WALL = BLOCKS.register("smooth_red_sandstone_wall",
        () -> new CustomWallBlock(Block.Properties.create(Material.ROCK, MaterialColor.SAND).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> SMOOTH_RED_SANDSTONE_PRESSURE_PLATE = BLOCKS.register("smooth_red_sandstone_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.SAND).doesNotBlockMovement().hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));

    public static final RegistryObject<CustomBlock> POLISHED_RED_SANDSTONE = BLOCKS.register("polished_red_sandstone",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.SAND).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> POLISHED_RED_SANDSTONE_STAIRS = BLOCKS.register("polished_red_sandstone_stairs",
        () -> new CustomStairsBlock(() -> Blocks.RED_SANDSTONE.getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.SAND).hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> POLISHED_RED_SANDSTONE_SLAB = BLOCKS.register("polished_red_sandstone_slab",
        () -> new CustomSlabBlock(Block.Properties.create(Material.ROCK, MaterialColor.SAND).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomWallBlock> POLISHED_RED_SANDSTONE_WALL = BLOCKS.register("polished_red_sandstone_wall",
        () -> new CustomWallBlock(Block.Properties.create(Material.ROCK, MaterialColor.SAND).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> POLISHED_RED_SANDSTONE_PRESSURE_PLATE = BLOCKS.register("polished_red_sandstone_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.SAND).doesNotBlockMovement().hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));

    public static final RegistryObject<CustomBlock> RED_SANDSTONE_PAVING = BLOCKS.register("red_sandstone_paving",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.SAND).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> RED_SANDSTONE_PAVING_STAIRS = BLOCKS.register("red_sandstone_paving_stairs",
        () -> new CustomStairsBlock(() -> Blocks.RED_SANDSTONE.getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.SAND).hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> RED_SANDSTONE_PAVING_SLAB = BLOCKS.register("red_sandstone_paving_slab",
        () -> new CustomSlabBlock(Block.Properties.create(Material.ROCK, MaterialColor.SAND).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomWallBlock> RED_SANDSTONE_PAVING_WALL = BLOCKS.register("red_sandstone_paving_wall",
        () -> new CustomWallBlock(Block.Properties.create(Material.ROCK, MaterialColor.SAND).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> RED_SANDSTONE_PAVING_PRESSURE_PLATE = BLOCKS.register("red_sandstone_paving_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.SAND).doesNotBlockMovement().hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));

    public static final RegistryObject<CustomBlock> RED_SANDSTONE_TILES = BLOCKS.register("red_sandstone_tiles",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.SAND).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> RED_SANDSTONE_TILES_STAIRS = BLOCKS.register("red_sandstone_tiles_stairs",
        () -> new CustomStairsBlock(() -> Blocks.RED_SANDSTONE.getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.SAND).hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> RED_SANDSTONE_TILES_SLAB = BLOCKS.register("red_sandstone_tiles_slab",
        () -> new CustomSlabBlock(Block.Properties.create(Material.ROCK, MaterialColor.SAND).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomWallBlock> RED_SANDSTONE_TILES_WALL = BLOCKS.register("red_sandstone_tiles_wall",
        () -> new CustomWallBlock(Block.Properties.create(Material.ROCK, MaterialColor.SAND).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> RED_SANDSTONE_TILES_PRESSURE_PLATE = BLOCKS.register("red_sandstone_tiles_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.SAND).doesNotBlockMovement().hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));

    public static final RegistryObject<CustomBlock> RED_SANDSTONE_BRICKS = BLOCKS.register("red_sandstone_bricks",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.SAND).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> RED_SANDSTONE_BRICKS_STAIRS = BLOCKS.register("red_sandstone_bricks_stairs",
        () -> new CustomStairsBlock(() -> Blocks.RED_SANDSTONE.getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.SAND).hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> RED_SANDSTONE_BRICKS_SLAB = BLOCKS.register("red_sandstone_bricks_slab",
        () -> new CustomSlabBlock(Block.Properties.create(Material.ROCK, MaterialColor.SAND).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomWallBlock> RED_SANDSTONE_BRICKS_WALL = BLOCKS.register("red_sandstone_bricks_wall",
        () -> new CustomWallBlock(Block.Properties.create(Material.ROCK, MaterialColor.SAND).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> RED_SANDSTONE_BRICKS_PRESSURE_PLATE = BLOCKS.register("red_sandstone_bricks_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.SAND).doesNotBlockMovement().hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));

    public static final RegistryObject<CustomBlock> RED_SANDSTONE_LARGE_BRICKS = BLOCKS.register("red_sandstone_large_bricks",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.SAND).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> RED_SANDSTONE_LARGE_BRICKS_STAIRS = BLOCKS.register("red_sandstone_large_bricks_stairs",
        () -> new CustomStairsBlock(() -> Blocks.RED_SANDSTONE.getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.SAND).hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> RED_SANDSTONE_LARGE_BRICKS_SLAB = BLOCKS.register("red_sandstone_large_bricks_slab",
        () -> new CustomSlabBlock(Block.Properties.create(Material.ROCK, MaterialColor.SAND).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomWallBlock> RED_SANDSTONE_LARGE_BRICKS_WALL = BLOCKS.register("red_sandstone_large_bricks_wall",
        () -> new CustomWallBlock(Block.Properties.create(Material.ROCK, MaterialColor.SAND).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> RED_SANDSTONE_LARGE_BRICKS_PRESSURE_PLATE = BLOCKS.register("red_sandstone_large_bricks_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.SAND).doesNotBlockMovement().hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));

    // Terracotta
    public static final RegistryObject<CustomStairsBlock> TERRACOTTA_STAIRS = BLOCKS.register("terracotta_stairs",
        () -> new CustomStairsBlock(() -> Blocks.TERRACOTTA.getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> TERRACOTTA_SLAB = BLOCKS.register("terracotta_slab",
        () -> new CustomSlabBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomWallBlock> TERRACOTTA_WALL = BLOCKS.register("terracotta_wall",
        () -> new CustomWallBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> TERRACOTTA_PRESSURE_PLATE = BLOCKS.register("terracotta_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.BLACK).doesNotBlockMovement().hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomButtonBlock> TERRACOTTA_BUTTON = BLOCKS.register("terracotta_button",
        () -> new CustomButtonBlock(false, Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE)));

    public static final RegistryObject<CustomBlock> POLISHED_TERRACOTTA = BLOCKS.register("polished_terracotta",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> POLISHED_TERRACOTTA_STAIRS = BLOCKS.register("polished_terracotta_stairs",
        () -> new CustomStairsBlock(() -> POLISHED_TERRACOTTA.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> POLISHED_TERRACOTTA_SLAB = BLOCKS.register("polished_terracotta_slab",
        () -> new CustomSlabBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomWallBlock> POLISHED_TERRACOTTA_WALL = BLOCKS.register("polished_terracotta_wall",
        () -> new CustomWallBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> POLISHED_TERRACOTTA_PRESSURE_PLATE = BLOCKS.register("polished_terracotta_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.BLACK).doesNotBlockMovement().hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));

    public static final RegistryObject<CustomBlock> TERRACOTTA_PAVING = BLOCKS.register("terracotta_paving",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> TERRACOTTA_PAVING_STAIRS = BLOCKS.register("terracotta_paving_stairs",
        () -> new CustomStairsBlock(() -> TERRACOTTA_PAVING.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> TERRACOTTA_PAVING_SLAB = BLOCKS.register("terracotta_paving_slab",
        () -> new CustomSlabBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomWallBlock> TERRACOTTA_PAVING_WALL = BLOCKS.register("terracotta_paving_wall",
        () -> new CustomWallBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> TERRACOTTA_PAVING_PRESSURE_PLATE = BLOCKS.register("terracotta_paving_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.BLACK).doesNotBlockMovement().hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));

    public static final RegistryObject<CustomBlock> TERRACOTTA_TILES = BLOCKS.register("terracotta_tiles",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> TERRACOTTA_TILES_STAIRS = BLOCKS.register("terracotta_tiles_stairs",
        () -> new CustomStairsBlock(() -> TERRACOTTA_TILES.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> TERRACOTTA_TILES_SLAB = BLOCKS.register("terracotta_tiles_slab",
        () -> new CustomSlabBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomWallBlock> TERRACOTTA_TILES_WALL = BLOCKS.register("terracotta_tiles_wall",
        () -> new CustomWallBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> TERRACOTTA_TILES_PRESSURE_PLATE = BLOCKS.register("terracotta_tiles_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.BLACK).doesNotBlockMovement().hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));

    public static final RegistryObject<CustomBlock> TERRACOTTA_BRICKS = BLOCKS.register("terracotta_bricks",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> TERRACOTTA_BRICKS_STAIRS = BLOCKS.register("terracotta_bricks_stairs",
        () -> new CustomStairsBlock(() -> TERRACOTTA_BRICKS.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> TERRACOTTA_BRICKS_SLAB = BLOCKS.register("terracotta_bricks_slab",
        () -> new CustomSlabBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomWallBlock> TERRACOTTA_BRICKS_WALL = BLOCKS.register("terracotta_bricks_wall",
        () -> new CustomWallBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> TERRACOTTA_BRICKS_PRESSURE_PLATE = BLOCKS.register("terracotta_bricks_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.BLACK).doesNotBlockMovement().hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));

    public static final RegistryObject<CustomBlock> TERRACOTTA_LARGE_BRICKS = BLOCKS.register("terracotta_large_bricks",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> TERRACOTTA_LARGE_BRICKS_STAIRS = BLOCKS.register("terracotta_large_bricks_stairs",
        () -> new CustomStairsBlock(() -> TERRACOTTA_LARGE_BRICKS.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> TERRACOTTA_LARGE_BRICKS_SLAB = BLOCKS.register("terracotta_large_bricks_slab",
        () -> new CustomSlabBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomWallBlock> TERRACOTTA_LARGE_BRICKS_WALL = BLOCKS.register("terracotta_large_bricks_wall",
        () -> new CustomWallBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> TERRACOTTA_LARGE_BRICKS_PRESSURE_PLATE = BLOCKS.register("terracotta_large_bricks_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.BLACK).doesNotBlockMovement().hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));

    // Other bricks
    public static final RegistryObject<CustomBlock> DARK_BRICKS = BLOCKS.register("dark_bricks",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> DARK_BRICKS_STAIRS = BLOCKS.register("dark_bricks_stairs",
        () -> new CustomStairsBlock(() -> DARK_BRICKS.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> DARK_BRICKS_SLAB = BLOCKS.register("dark_bricks_slab",
        () -> new CustomSlabBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomWallBlock> DARK_BRICKS_WALL = BLOCKS.register("dark_bricks_wall",
        () -> new CustomWallBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> DARK_BRICKS_PRESSURE_PLATE = BLOCKS.register("dark_bricks_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.BLACK).doesNotBlockMovement().hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));

    public static final RegistryObject<CustomBlock> DARK_LARGE_BRICKS = BLOCKS.register("dark_large_bricks",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> DARK_LARGE_BRICKS_STAIRS = BLOCKS.register("dark_large_bricks_stairs",
        () -> new CustomStairsBlock(() -> DARK_LARGE_BRICKS.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> DARK_LARGE_BRICKS_SLAB = BLOCKS.register("dark_large_bricks_slab",
        () -> new CustomSlabBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomWallBlock> DARK_LARGE_BRICKS_WALL = BLOCKS.register("dark_large_bricks_wall",
        () -> new CustomWallBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> DARK_LARGE_BRICKS_PRESSURE_PLATE = BLOCKS.register("dark_large_bricks_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.BLACK).doesNotBlockMovement().hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));

    public static final RegistryObject<CustomBlock> OLD_BRICKS = BLOCKS.register("old_bricks",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> OLD_BRICKS_STAIRS = BLOCKS.register("old_bricks_stairs",
        () -> new CustomStairsBlock(() -> OLD_BRICKS.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> OLD_BRICKS_SLAB = BLOCKS.register("old_bricks_slab",
        () -> new CustomSlabBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomWallBlock> OLD_BRICKS_WALL = BLOCKS.register("old_bricks_wall",
        () -> new CustomWallBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> OLD_BRICKS_PRESSURE_PLATE = BLOCKS.register("old_bricks_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.BLACK).doesNotBlockMovement().hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));

    public static final RegistryObject<CustomBlock> OLD_LARGE_BRICKS = BLOCKS.register("old_large_bricks",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> OLD_LARGE_BRICKS_STAIRS = BLOCKS.register("old_large_bricks_stairs",
        () -> new CustomStairsBlock(() -> OLD_LARGE_BRICKS.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> OLD_LARGE_BRICKS_SLAB = BLOCKS.register("old_large_bricks_slab",
        () -> new CustomSlabBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomWallBlock> OLD_LARGE_BRICKS_WALL = BLOCKS.register("old_large_bricks_wall",
        () -> new CustomWallBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> OLD_LARGE_BRICKS_PRESSURE_PLATE = BLOCKS.register("old_large_bricks_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.BLACK).doesNotBlockMovement().hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));

    public static final RegistryObject<CustomBlock> WEARED_BRICKS = BLOCKS.register("weared_bricks",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> WEARED_BRICKS_STAIRS = BLOCKS.register("weared_bricks_stairs",
        () -> new CustomStairsBlock(() -> WEARED_BRICKS.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> WEARED_BRICKS_SLAB = BLOCKS.register("weared_bricks_slab",
        () -> new CustomSlabBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomWallBlock> WEARED_BRICKS_WALL = BLOCKS.register("weared_bricks_wall",
        () -> new CustomWallBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> WEARED_BRICKS_PRESSURE_PLATE = BLOCKS.register("weared_bricks_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.BLACK).doesNotBlockMovement().hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));

    public static final RegistryObject<CustomBlock> WEARED_LARGE_BRICKS = BLOCKS.register("weared_large_bricks",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> WEARED_LARGE_BRICKS_STAIRS = BLOCKS.register("weared_large_bricks_stairs",
        () -> new CustomStairsBlock(() -> WEARED_LARGE_BRICKS.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> WEARED_LARGE_BRICKS_SLAB = BLOCKS.register("weared_large_bricks_slab",
        () -> new CustomSlabBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomWallBlock> WEARED_LARGE_BRICKS_WALL = BLOCKS.register("weared_large_bricks_wall",
        () -> new CustomWallBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> WEARED_LARGE_BRICKS_PRESSURE_PLATE = BLOCKS.register("weared_large_bricks_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.BLACK).doesNotBlockMovement().hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));

    // Pavings
    public static final RegistryObject<CustomBlock> CONCRETE_PAVING = BLOCKS.register("concrete_paving",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> CONCRETE_PAVING_STAIRS = BLOCKS.register("concrete_paving_stairs",
        () -> new CustomStairsBlock(() -> CONCRETE_PAVING.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> CONCRETE_PAVING_SLAB = BLOCKS.register("concrete_paving_slab",
        () -> new CustomSlabBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomWallBlock> CONCRETE_PAVING_WALL = BLOCKS.register("concrete_paving_wall",
        () -> new CustomWallBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> CONCRETE_PAVING_PRESSURE_PLATE = BLOCKS.register("concrete_paving_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.BLACK).doesNotBlockMovement().hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));

    public static final RegistryObject<CustomBlock> DAMAGED_PAVING = BLOCKS.register("damaged_paving",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> DAMAGED_PAVING_STAIRS = BLOCKS.register("damaged_paving_stairs",
        () -> new CustomStairsBlock(() -> DAMAGED_PAVING.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> DAMAGED_PAVING_SLAB = BLOCKS.register("damaged_paving_slab",
        () -> new CustomSlabBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomWallBlock> DAMAGED_PAVING_WALL = BLOCKS.register("damaged_paving_wall",
        () -> new CustomWallBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> DAMAGED_PAVING_PRESSURE_PLATE = BLOCKS.register("damaged_paving_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.BLACK).doesNotBlockMovement().hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));

    public static final RegistryObject<CustomBlock> DARK_CONCRETE_PAVING = BLOCKS.register("dark_concrete_paving",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> DARK_CONCRETE_PAVING_STAIRS = BLOCKS.register("dark_concrete_paving_stairs",
        () -> new CustomStairsBlock(() -> DARK_CONCRETE_PAVING.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> DARK_CONCRETE_PAVING_SLAB = BLOCKS.register("dark_concrete_paving_slab",
        () -> new CustomSlabBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomWallBlock> DARK_CONCRETE_PAVING_WALL = BLOCKS.register("dark_concrete_paving_wall",
        () -> new CustomWallBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> DARK_CONCRETE_PAVING_PRESSURE_PLATE = BLOCKS.register("dark_concrete_paving_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.BLACK).doesNotBlockMovement().hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));

    public static final RegistryObject<CustomBlock> MOIST_PAVING = BLOCKS.register("moist_paving",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> MOIST_PAVING_STAIRS = BLOCKS.register("moist_paving_stairs",
        () -> new CustomStairsBlock(() -> MOIST_PAVING.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> MOIST_PAVING_SLAB = BLOCKS.register("moist_paving_slab",
        () -> new CustomSlabBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomWallBlock> MOIST_PAVING_WALL = BLOCKS.register("moist_paving_wall",
        () -> new CustomWallBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> MOIST_PAVING_PRESSURE_PLATE = BLOCKS.register("moist_paving_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.BLACK).doesNotBlockMovement().hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));

    public static final RegistryObject<CustomBlock> POLISHED_PAVING = BLOCKS.register("polished_paving",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> POLISHED_PAVING_STAIRS = BLOCKS.register("polished_paving_stairs",
        () -> new CustomStairsBlock(() -> POLISHED_PAVING.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> POLISHED_PAVING_SLAB = BLOCKS.register("polished_paving_slab",
        () -> new CustomSlabBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomWallBlock> POLISHED_PAVING_WALL = BLOCKS.register("polished_paving_wall",
        () -> new CustomWallBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> POLISHED_PAVING_PRESSURE_PLATE = BLOCKS.register("polished_paving_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.BLACK).doesNotBlockMovement().hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));

    public static final RegistryObject<CustomBlock> WHITE_CONCRETE_PAVING = BLOCKS.register("white_concrete_paving",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> WHITE_CONCRETE_PAVING_STAIRS = BLOCKS.register("white_concrete_paving_stairs",
        () -> new CustomStairsBlock(() -> WHITE_CONCRETE_PAVING.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> WHITE_CONCRETE_PAVING_SLAB = BLOCKS.register("white_concrete_paving_slab",
        () -> new CustomSlabBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomWallBlock> WHITE_CONCRETE_PAVING_WALL = BLOCKS.register("white_concrete_paving_wall",
        () -> new CustomWallBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> WHITE_CONCRETE_PAVING_PRESSURE_PLATE = BLOCKS.register("white_concrete_paving_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.BLACK).doesNotBlockMovement().hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));

    // Tiles
    public static final RegistryObject<CustomBlock> CONCRETE_TILES = BLOCKS.register("concrete_tiles",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> CONCRETE_TILES_STAIRS = BLOCKS.register("concrete_tiles_stairs",
        () -> new CustomStairsBlock(() -> CONCRETE_TILES.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> CONCRETE_TILES_SLAB = BLOCKS.register("concrete_tiles_slab",
        () -> new CustomSlabBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomWallBlock> CONCRETE_TILES_WALL = BLOCKS.register("concrete_tiles_wall",
        () -> new CustomWallBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> CONCRETE_TILES_PRESSURE_PLATE = BLOCKS.register("concrete_tiles_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.BLACK).doesNotBlockMovement().hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));

    public static final RegistryObject<CustomBlock> SKYBLUE_TILES = BLOCKS.register("skyblue_tiles",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> SKYBLUE_TILES_STAIRS = BLOCKS.register("skyblue_tiles_stairs",
        () -> new CustomStairsBlock(() -> SKYBLUE_TILES.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> SKYBLUE_TILES_SLAB = BLOCKS.register("skyblue_tiles_slab",
        () -> new CustomSlabBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomWallBlock> SKYBLUE_TILES_WALL = BLOCKS.register("skyblue_tiles_wall",
        () -> new CustomWallBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> SKYBLUE_TILES_PRESSURE_PLATE = BLOCKS.register("skyblue_tiles_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.BLACK).doesNotBlockMovement().hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));

    public static final RegistryObject<CustomBlock> ORANGE_TILES = BLOCKS.register("orange_tiles",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> ORANGE_TILES_STAIRS = BLOCKS.register("orange_tiles_stairs",
        () -> new CustomStairsBlock(() -> ORANGE_TILES.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> ORANGE_TILES_SLAB = BLOCKS.register("orange_tiles_slab",
        () -> new CustomSlabBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomWallBlock> ORANGE_TILES_WALL = BLOCKS.register("orange_tiles_wall",
        () -> new CustomWallBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> ORANGE_TILES_PRESSURE_PLATE = BLOCKS.register("orange_tiles_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.BLACK).doesNotBlockMovement().hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));

    public static final RegistryObject<CustomBlock> BLUE_TILES = BLOCKS.register("blue_tiles",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> BLUE_TILES_STAIRS = BLOCKS.register("blue_tiles_stairs",
        () -> new CustomStairsBlock(() -> BLUE_TILES.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> BLUE_TILES_SLAB = BLOCKS.register("blue_tiles_slab",
        () -> new CustomSlabBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomWallBlock> BLUE_TILES_WALL = BLOCKS.register("blue_tiles_wall",
        () -> new CustomWallBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> BLUE_TILES_PRESSURE_PLATE = BLOCKS.register("blue_tiles_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.BLACK).doesNotBlockMovement().hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));

    public static final RegistryObject<CustomBlock> LIGHT_BLUE_TILES = BLOCKS.register("light_blue_tiles",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> LIGHT_BLUE_TILES_STAIRS = BLOCKS.register("light_blue_tiles_stairs",
        () -> new CustomStairsBlock(() -> LIGHT_BLUE_TILES.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> LIGHT_BLUE_TILES_SLAB = BLOCKS.register("light_blue_tiles_slab",
        () -> new CustomSlabBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomWallBlock> LIGHT_BLUE_TILES_WALL = BLOCKS.register("light_blue_tiles_wall",
        () -> new CustomWallBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> LIGHT_BLUE_TILES_PRESSURE_PLATE = BLOCKS.register("light_blue_tiles_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.BLACK).doesNotBlockMovement().hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));

    public static final RegistryObject<CustomBlock> RED_TILES = BLOCKS.register("red_tiles",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> RED_TILES_STAIRS = BLOCKS.register("red_tiles_stairs",
        () -> new CustomStairsBlock(() -> RED_TILES.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> RED_TILES_SLAB = BLOCKS.register("red_tiles_slab",
        () -> new CustomSlabBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomWallBlock> RED_TILES_WALL = BLOCKS.register("red_tiles_wall",
        () -> new CustomWallBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> RED_TILES_PRESSURE_PLATE = BLOCKS.register("red_tiles_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.BLACK).doesNotBlockMovement().hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));

    public static final RegistryObject<CustomBlock> WHITE_TILES = BLOCKS.register("white_tiles",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> WHITE_TILES_STAIRS = BLOCKS.register("white_tiles_stairs",
        () -> new CustomStairsBlock(() -> WHITE_TILES.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> WHITE_TILES_SLAB = BLOCKS.register("white_tiles_slab",
        () -> new CustomSlabBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomWallBlock> WHITE_TILES_WALL = BLOCKS.register("white_tiles_wall",
        () -> new CustomWallBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> WHITE_TILES_PRESSURE_PLATE = BLOCKS.register("white_tiles_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.BLACK).doesNotBlockMovement().hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));

    public static final RegistryObject<CustomBlock> YELLOW_TILES = BLOCKS.register("yellow_tiles",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> YELLOW_TILES_STAIRS = BLOCKS.register("yellow_tiles_stairs",
        () -> new CustomStairsBlock(() -> YELLOW_TILES.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> YELLOW_TILES_SLAB = BLOCKS.register("yellow_tiles_slab",
        () -> new CustomSlabBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomWallBlock> YELLOW_TILES_WALL = BLOCKS.register("yellow_tiles_wall",
        () -> new CustomWallBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> YELLOW_TILES_PRESSURE_PLATE = BLOCKS.register("yellow_tiles_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.BLACK).doesNotBlockMovement().hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));

    public static final RegistryObject<CustomBlock> YELLOW_GREY_TILES = BLOCKS.register("yellow_grey_tiles",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> YELLOW_GREY_TILES_STAIRS = BLOCKS.register("yellow_grey_tiles_stairs",
        () -> new CustomStairsBlock(() -> YELLOW_GREY_TILES.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> YELLOW_GREY_TILES_SLAB = BLOCKS.register("yellow_grey_tiles_slab",
        () -> new CustomSlabBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomWallBlock> YELLOW_GREY_TILES_WALL = BLOCKS.register("yellow_grey_tiles_wall",
        () -> new CustomWallBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> YELLOW_GREY_TILES_PRESSURE_PLATE = BLOCKS.register("yellow_grey_tiles_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.BLACK).doesNotBlockMovement().hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));

    // Corrugated Metal Plates
    public static final RegistryObject<CustomBlock> PURPLE_CORRUGATED_METAL_PLATE = BLOCKS.register("purple_corrugated_metal_plate",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.METAL), ToolType.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> PURPLE_CORRUGATED_METAL_PLATE_STAIRS = BLOCKS.register("purple_corrugated_metal_plate_stairs",
        () -> new CustomStairsBlock(() -> PURPLE_CORRUGATED_METAL_PLATE.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.METAL), ToolType.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> PURPLE_CORRUGATED_METAL_PLATE_SLAB = BLOCKS.register("purple_corrugated_metal_plate_slab",
        () -> new CustomSlabBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.METAL), ToolType.PICKAXE));
    public static final RegistryObject<CustomWallBlock> PURPLE_CORRUGATED_METAL_PLATE_WALL = BLOCKS.register("purple_corrugated_metal_plate_wall",
        () -> new CustomWallBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.METAL), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> PURPLE_CORRUGATED_METAL_PLATE_PRESSURE_PLATE = BLOCKS.register("purple_corrugated_metal_plate_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.BLACK).doesNotBlockMovement().hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.METAL), ToolType.PICKAXE));

    public static final RegistryObject<CustomBlock> RED_CORRUGATED_METAL_PLATE = BLOCKS.register("red_corrugated_metal_plate",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.METAL), ToolType.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> RED_CORRUGATED_METAL_PLATE_STAIRS = BLOCKS.register("red_corrugated_metal_plate_stairs",
        () -> new CustomStairsBlock(() -> RED_CORRUGATED_METAL_PLATE.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.METAL), ToolType.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> RED_CORRUGATED_METAL_PLATE_SLAB = BLOCKS.register("red_corrugated_metal_plate_slab",
        () -> new CustomSlabBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.METAL), ToolType.PICKAXE));
    public static final RegistryObject<CustomWallBlock> RED_CORRUGATED_METAL_PLATE_WALL = BLOCKS.register("red_corrugated_metal_plate_wall",
        () -> new CustomWallBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.METAL), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> RED_CORRUGATED_METAL_PLATE_PRESSURE_PLATE = BLOCKS.register("red_corrugated_metal_plate_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.BLACK).doesNotBlockMovement().hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.METAL), ToolType.PICKAXE));

    public static final RegistryObject<CustomBlock> WHITE_CORRUGATED_METAL_PLATE = BLOCKS.register("white_corrugated_metal_plate",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.METAL), ToolType.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> WHITE_CORRUGATED_METAL_PLATE_STAIRS = BLOCKS.register("white_corrugated_metal_plate_stairs",
        () -> new CustomStairsBlock(() -> WHITE_CORRUGATED_METAL_PLATE.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.METAL), ToolType.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> WHITE_CORRUGATED_METAL_PLATE_SLAB = BLOCKS.register("white_corrugated_metal_plate_slab",
        () -> new CustomSlabBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.METAL), ToolType.PICKAXE));
    public static final RegistryObject<CustomWallBlock> WHITE_CORRUGATED_METAL_PLATE_WALL = BLOCKS.register("white_corrugated_metal_plate_wall",
        () -> new CustomWallBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.METAL), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> WHITE_CORRUGATED_METAL_PLATE_PRESSURE_PLATE = BLOCKS.register("white_corrugated_metal_plate_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.BLACK).doesNotBlockMovement().hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.METAL), ToolType.PICKAXE));

    public static final RegistryObject<CustomBlock> YELLOW_CORRUGATED_METAL_PLATE = BLOCKS.register("yellow_corrugated_metal_plate",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.METAL), ToolType.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> YELLOW_CORRUGATED_METAL_PLATE_STAIRS = BLOCKS.register("yellow_corrugated_metal_plate_stairs",
        () -> new CustomStairsBlock(() -> YELLOW_CORRUGATED_METAL_PLATE.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.METAL), ToolType.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> YELLOW_CORRUGATED_METAL_PLATE_SLAB = BLOCKS.register("yellow_corrugated_metal_plate_slab",
        () -> new CustomSlabBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.METAL), ToolType.PICKAXE));
    public static final RegistryObject<CustomWallBlock> YELLOW_CORRUGATED_METAL_PLATE_WALL = BLOCKS.register("yellow_corrugated_metal_plate_wall",
        () -> new CustomWallBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.METAL), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> YELLOW_CORRUGATED_METAL_PLATE_PRESSURE_PLATE = BLOCKS.register("yellow_corrugated_metal_plate_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.BLACK).doesNotBlockMovement().hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.METAL), ToolType.PICKAXE));

    public static final RegistryObject<CustomBlock> BLACK_CORRUGATED_METAL_PLATE = BLOCKS.register("black_corrugated_metal_plate",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.METAL), ToolType.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> BLACK_CORRUGATED_METAL_PLATE_STAIRS = BLOCKS.register("black_corrugated_metal_plate_stairs",
        () -> new CustomStairsBlock(() -> BLACK_CORRUGATED_METAL_PLATE.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.METAL), ToolType.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> BLACK_CORRUGATED_METAL_PLATE_SLAB = BLOCKS.register("black_corrugated_metal_plate_slab",
        () -> new CustomSlabBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.METAL), ToolType.PICKAXE));
    public static final RegistryObject<CustomWallBlock> BLACK_CORRUGATED_METAL_PLATE_WALL = BLOCKS.register("black_corrugated_metal_plate_wall",
        () -> new CustomWallBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.METAL), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> BLACK_CORRUGATED_METAL_PLATE_PRESSURE_PLATE = BLOCKS.register("black_corrugated_metal_plate_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.BLACK).doesNotBlockMovement().hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.METAL), ToolType.PICKAXE));

    public static final RegistryObject<CustomBlock> BLUE_CORRUGATED_METAL_PLATE = BLOCKS.register("blue_corrugated_metal_plate",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.METAL), ToolType.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> BLUE_CORRUGATED_METAL_PLATE_STAIRS = BLOCKS.register("blue_corrugated_metal_plate_stairs",
        () -> new CustomStairsBlock(() -> BLUE_CORRUGATED_METAL_PLATE.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.METAL), ToolType.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> BLUE_CORRUGATED_METAL_PLATE_SLAB = BLOCKS.register("blue_corrugated_metal_plate_slab",
        () -> new CustomSlabBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.METAL), ToolType.PICKAXE));
    public static final RegistryObject<CustomWallBlock> BLUE_CORRUGATED_METAL_PLATE_WALL = BLOCKS.register("blue_corrugated_metal_plate_wall",
        () -> new CustomWallBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.METAL), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> BLUE_CORRUGATED_METAL_PLATE_PRESSURE_PLATE = BLOCKS.register("blue_corrugated_metal_plate_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.BLACK).doesNotBlockMovement().hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.METAL), ToolType.PICKAXE));

    public static final RegistryObject<CustomBlock> BROWN_CORRUGATED_METAL_PLATE = BLOCKS.register("brown_corrugated_metal_plate",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.METAL), ToolType.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> BROWN_CORRUGATED_METAL_PLATE_STAIRS = BLOCKS.register("brown_corrugated_metal_plate_stairs",
        () -> new CustomStairsBlock(() -> BROWN_CORRUGATED_METAL_PLATE.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.METAL), ToolType.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> BROWN_CORRUGATED_METAL_PLATE_SLAB = BLOCKS.register("brown_corrugated_metal_plate_slab",
        () -> new CustomSlabBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.METAL), ToolType.PICKAXE));
    public static final RegistryObject<CustomWallBlock> BROWN_CORRUGATED_METAL_PLATE_WALL = BLOCKS.register("brown_corrugated_metal_plate_wall",
        () -> new CustomWallBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.METAL), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> BROWN_CORRUGATED_METAL_PLATE_PRESSURE_PLATE = BLOCKS.register("brown_corrugated_metal_plate_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.BLACK).doesNotBlockMovement().hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.METAL), ToolType.PICKAXE));

    public static final RegistryObject<CustomBlock> CYAN_CORRUGATED_METAL_PLATE = BLOCKS.register("cyan_corrugated_metal_plate",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.METAL), ToolType.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> CYAN_CORRUGATED_METAL_PLATE_STAIRS = BLOCKS.register("cyan_corrugated_metal_plate_stairs",
        () -> new CustomStairsBlock(() -> CYAN_CORRUGATED_METAL_PLATE.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.METAL), ToolType.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> CYAN_CORRUGATED_METAL_PLATE_SLAB = BLOCKS.register("cyan_corrugated_metal_plate_slab",
        () -> new CustomSlabBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.METAL), ToolType.PICKAXE));
    public static final RegistryObject<CustomWallBlock> CYAN_CORRUGATED_METAL_PLATE_WALL = BLOCKS.register("cyan_corrugated_metal_plate_wall",
        () -> new CustomWallBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.METAL), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> CYAN_CORRUGATED_METAL_PLATE_PRESSURE_PLATE = BLOCKS.register("cyan_corrugated_metal_plate_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.BLACK).doesNotBlockMovement().hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.METAL), ToolType.PICKAXE));

    public static final RegistryObject<CustomBlock> GRAY_CORRUGATED_METAL_PLATE = BLOCKS.register("gray_corrugated_metal_plate",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.METAL), ToolType.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> GRAY_CORRUGATED_METAL_PLATE_STAIRS = BLOCKS.register("gray_corrugated_metal_plate_stairs",
        () -> new CustomStairsBlock(() -> GRAY_CORRUGATED_METAL_PLATE.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.METAL), ToolType.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> GRAY_CORRUGATED_METAL_PLATE_SLAB = BLOCKS.register("gray_corrugated_metal_plate_slab",
        () -> new CustomSlabBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.METAL), ToolType.PICKAXE));
    public static final RegistryObject<CustomWallBlock> GRAY_CORRUGATED_METAL_PLATE_WALL = BLOCKS.register("gray_corrugated_metal_plate_wall",
        () -> new CustomWallBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.METAL), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> GRAY_CORRUGATED_METAL_PLATE_PRESSURE_PLATE = BLOCKS.register("gray_corrugated_metal_plate_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.BLACK).doesNotBlockMovement().hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.METAL), ToolType.PICKAXE));

    public static final RegistryObject<CustomBlock> GREEN_CORRUGATED_METAL_PLATE = BLOCKS.register("green_corrugated_metal_plate",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.METAL), ToolType.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> GREEN_CORRUGATED_METAL_PLATE_STAIRS = BLOCKS.register("green_corrugated_metal_plate_stairs",
        () -> new CustomStairsBlock(() -> GREEN_CORRUGATED_METAL_PLATE.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.METAL), ToolType.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> GREEN_CORRUGATED_METAL_PLATE_SLAB = BLOCKS.register("green_corrugated_metal_plate_slab",
        () -> new CustomSlabBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.METAL), ToolType.PICKAXE));
    public static final RegistryObject<CustomWallBlock> GREEN_CORRUGATED_METAL_PLATE_WALL = BLOCKS.register("green_corrugated_metal_plate_wall",
        () -> new CustomWallBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.METAL), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> GREEN_CORRUGATED_METAL_PLATE_PRESSURE_PLATE = BLOCKS.register("green_corrugated_metal_plate_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.BLACK).doesNotBlockMovement().hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.METAL), ToolType.PICKAXE));

    public static final RegistryObject<CustomBlock> LIGHT_BLUE_CORRUGATED_METAL_PLATE = BLOCKS.register("light_blue_corrugated_metal_plate",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.METAL), ToolType.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> LIGHT_BLUE_CORRUGATED_METAL_PLATE_STAIRS = BLOCKS.register("light_blue_corrugated_metal_plate_stairs",
        () -> new CustomStairsBlock(() -> LIGHT_BLUE_CORRUGATED_METAL_PLATE.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.METAL), ToolType.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> LIGHT_BLUE_CORRUGATED_METAL_PLATE_SLAB = BLOCKS.register("light_blue_corrugated_metal_plate_slab",
        () -> new CustomSlabBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.METAL), ToolType.PICKAXE));
    public static final RegistryObject<CustomWallBlock> LIGHT_BLUE_CORRUGATED_METAL_PLATE_WALL = BLOCKS.register("light_blue_corrugated_metal_plate_wall",
        () -> new CustomWallBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.METAL), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> LIGHT_BLUE_CORRUGATED_METAL_PLATE_PRESSURE_PLATE = BLOCKS.register("light_blue_corrugated_metal_plate_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.BLACK).doesNotBlockMovement().hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.METAL), ToolType.PICKAXE));

    public static final RegistryObject<CustomBlock> LIGHT_GRAY_CORRUGATED_METAL_PLATE = BLOCKS.register("light_gray_corrugated_metal_plate",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.METAL), ToolType.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> LIGHT_GRAY_CORRUGATED_METAL_PLATE_STAIRS = BLOCKS.register("light_gray_corrugated_metal_plate_stairs",
        () -> new CustomStairsBlock(() -> LIGHT_GRAY_CORRUGATED_METAL_PLATE.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.METAL), ToolType.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> LIGHT_GRAY_CORRUGATED_METAL_PLATE_SLAB = BLOCKS.register("light_gray_corrugated_metal_plate_slab",
        () -> new CustomSlabBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.METAL), ToolType.PICKAXE));
    public static final RegistryObject<CustomWallBlock> LIGHT_GRAY_CORRUGATED_METAL_PLATE_WALL = BLOCKS.register("light_gray_corrugated_metal_plate_wall",
        () -> new CustomWallBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.METAL), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> LIGHT_GRAY_CORRUGATED_METAL_PLATE_PRESSURE_PLATE = BLOCKS.register("light_gray_corrugated_metal_plate_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.BLACK).doesNotBlockMovement().hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.METAL), ToolType.PICKAXE));

    public static final RegistryObject<CustomBlock> LIME_CORRUGATED_METAL_PLATE = BLOCKS.register("lime_corrugated_metal_plate",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.METAL), ToolType.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> LIME_CORRUGATED_METAL_PLATE_STAIRS = BLOCKS.register("lime_corrugated_metal_plate_stairs",
        () -> new CustomStairsBlock(() -> LIME_CORRUGATED_METAL_PLATE.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.METAL), ToolType.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> LIME_CORRUGATED_METAL_PLATE_SLAB = BLOCKS.register("lime_corrugated_metal_plate_slab",
        () -> new CustomSlabBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.METAL), ToolType.PICKAXE));
    public static final RegistryObject<CustomWallBlock> LIME_CORRUGATED_METAL_PLATE_WALL = BLOCKS.register("lime_corrugated_metal_plate_wall",
        () -> new CustomWallBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.METAL), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> LIME_CORRUGATED_METAL_PLATE_PRESSURE_PLATE = BLOCKS.register("lime_corrugated_metal_plate_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.BLACK).doesNotBlockMovement().hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.METAL), ToolType.PICKAXE));

    public static final RegistryObject<CustomBlock> MAGENTA_CORRUGATED_METAL_PLATE = BLOCKS.register("magenta_corrugated_metal_plate",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.METAL), ToolType.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> MAGENTA_CORRUGATED_METAL_PLATE_STAIRS = BLOCKS.register("magenta_corrugated_metal_plate_stairs",
        () -> new CustomStairsBlock(() -> MAGENTA_CORRUGATED_METAL_PLATE.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.METAL), ToolType.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> MAGENTA_CORRUGATED_METAL_PLATE_SLAB = BLOCKS.register("magenta_corrugated_metal_plate_slab",
        () -> new CustomSlabBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.METAL), ToolType.PICKAXE));
    public static final RegistryObject<CustomWallBlock> MAGENTA_CORRUGATED_METAL_PLATE_WALL = BLOCKS.register("magenta_corrugated_metal_plate_wall",
        () -> new CustomWallBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.METAL), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> MAGENTA_CORRUGATED_METAL_PLATE_PRESSURE_PLATE = BLOCKS.register("magenta_corrugated_metal_plate_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.BLACK).doesNotBlockMovement().hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.METAL), ToolType.PICKAXE));

    public static final RegistryObject<CustomBlock> ORANGE_CORRUGATED_METAL_PLATE = BLOCKS.register("orange_corrugated_metal_plate",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.METAL), ToolType.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> ORANGE_CORRUGATED_METAL_PLATE_STAIRS = BLOCKS.register("orange_corrugated_metal_plate_stairs",
        () -> new CustomStairsBlock(() -> ORANGE_CORRUGATED_METAL_PLATE.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.METAL), ToolType.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> ORANGE_CORRUGATED_METAL_PLATE_SLAB = BLOCKS.register("orange_corrugated_metal_plate_slab",
        () -> new CustomSlabBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.METAL), ToolType.PICKAXE));
    public static final RegistryObject<CustomWallBlock> ORANGE_CORRUGATED_METAL_PLATE_WALL = BLOCKS.register("orange_corrugated_metal_plate_wall",
        () -> new CustomWallBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.METAL), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> ORANGE_CORRUGATED_METAL_PLATE_PRESSURE_PLATE = BLOCKS.register("orange_corrugated_metal_plate_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.BLACK).doesNotBlockMovement().hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.METAL), ToolType.PICKAXE));

    public static final RegistryObject<CustomBlock> PINK_CORRUGATED_METAL_PLATE = BLOCKS.register("pink_corrugated_metal_plate",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.METAL), ToolType.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> PINK_CORRUGATED_METAL_PLATE_STAIRS = BLOCKS.register("pink_corrugated_metal_plate_stairs",
        () -> new CustomStairsBlock(() -> PINK_CORRUGATED_METAL_PLATE.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.METAL), ToolType.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> PINK_CORRUGATED_METAL_PLATE_SLAB = BLOCKS.register("pink_corrugated_metal_plate_slab",
        () -> new CustomSlabBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.METAL), ToolType.PICKAXE));
    public static final RegistryObject<CustomWallBlock> PINK_CORRUGATED_METAL_PLATE_WALL = BLOCKS.register("pink_corrugated_metal_plate_wall",
        () -> new CustomWallBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.METAL), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> PINK_CORRUGATED_METAL_PLATE_PRESSURE_PLATE = BLOCKS.register("pink_corrugated_metal_plate_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.BLACK).doesNotBlockMovement().hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.METAL), ToolType.PICKAXE));

    public static void init()
    {
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}
