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

    public static final RegistryObject<CustomBlock> BASALT_ORNEMENT = BLOCKS.register("basalt_ornement",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> BASALT_ORNEMENT_PRESSURE_PLATE = BLOCKS.register("basalt_ornement_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.BLACK).doesNotBlockMovement().hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));

    // Slate
    public static final RegistryObject<CustomBlock> SLATE = BLOCKS.register("slate",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> SLATE_STAIRS = BLOCKS.register("slate_stairs",
        () -> new CustomStairsBlock(() -> SLATE.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> SLATE_SLAB = BLOCKS.register("slate_slab",
        () -> new CustomSlabBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomWallBlock> SLATE_WALL = BLOCKS.register("slate_wall",
        () -> new CustomWallBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> SLATE_PRESSURE_PLATE = BLOCKS.register("slate_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.BLACK).doesNotBlockMovement().hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));

    public static final RegistryObject<CustomBlock> SLATE_COBBLESTONE = BLOCKS.register("slate_cobblestone",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> SLATE_COBBLESTONE_STAIRS = BLOCKS.register("slate_cobblestone_stairs",
        () -> new CustomStairsBlock(() -> SLATE.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> SLATE_COBBLESTONE_SLAB = BLOCKS.register("slate_cobblestone_slab",
        () -> new CustomSlabBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomWallBlock> SLATE_COBBLESTONE_WALL = BLOCKS.register("slate_cobblestone_wall",
        () -> new CustomWallBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> SLATE_COBBLESTONE_PRESSURE_PLATE = BLOCKS.register("slate_cobblestone_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.BLACK).doesNotBlockMovement().hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));

    public static final RegistryObject<CustomBlock> SMOOTH_SLATE = BLOCKS.register("smooth_slate",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> SMOOTH_SLATE_STAIRS = BLOCKS.register("smooth_slate_stairs",
        () -> new CustomStairsBlock(() -> SMOOTH_SLATE.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> SMOOTH_SLATE_SLAB = BLOCKS.register("smooth_slate_slab",
        () -> new CustomSlabBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomWallBlock> SMOOTH_SLATE_WALL = BLOCKS.register("smooth_slate_wall",
        () -> new CustomWallBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> SMOOTH_SLATE_PRESSURE_PLATE = BLOCKS.register("smooth_slate_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.BLACK).doesNotBlockMovement().hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));

    public static final RegistryObject<CustomBlock> POLISHED_SLATE = BLOCKS.register("polished_slate",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> POLISHED_SLATE_STAIRS = BLOCKS.register("polished_slate_stairs",
        () -> new CustomStairsBlock(() -> POLISHED_SLATE.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> POLISHED_SLATE_SLAB = BLOCKS.register("polished_slate_slab",
        () -> new CustomSlabBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomWallBlock> POLISHED_SLATE_WALL = BLOCKS.register("polished_slate_wall",
        () -> new CustomWallBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> POLISHED_SLATE_PRESSURE_PLATE = BLOCKS.register("polished_slate_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.BLACK).doesNotBlockMovement().hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));

    public static final RegistryObject<CustomBlock> SLATE_PAVING = BLOCKS.register("slate_paving",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> SLATE_PAVING_STAIRS = BLOCKS.register("slate_paving_stairs",
        () -> new CustomStairsBlock(() -> SLATE.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> SLATE_PAVING_SLAB = BLOCKS.register("slate_paving_slab",
        () -> new CustomSlabBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomWallBlock> SLATE_PAVING_WALL = BLOCKS.register("slate_paving_wall",
        () -> new CustomWallBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> SLATE_PAVING_PRESSURE_PLATE = BLOCKS.register("slate_paving_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.BLACK).doesNotBlockMovement().hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));

    public static final RegistryObject<CustomBlock> SLATE_TILES = BLOCKS.register("slate_tiles",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> SLATE_TILES_STAIRS = BLOCKS.register("slate_tiles_stairs",
        () -> new CustomStairsBlock(() -> SLATE.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> SLATE_TILES_SLAB = BLOCKS.register("slate_tiles_slab",
        () -> new CustomSlabBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomWallBlock> SLATE_TILES_WALL = BLOCKS.register("slate_tiles_wall",
        () -> new CustomWallBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> SLATE_TILES_PRESSURE_PLATE = BLOCKS.register("slate_tiles_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.BLACK).doesNotBlockMovement().hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));

    public static final RegistryObject<CustomBlock> SLATE_BRICKS = BLOCKS.register("slate_bricks",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> SLATE_BRICKS_STAIRS = BLOCKS.register("slate_bricks_stairs",
        () -> new CustomStairsBlock(() -> SLATE.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> SLATE_BRICKS_SLAB = BLOCKS.register("slate_bricks_slab",
        () -> new CustomSlabBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomWallBlock> SLATE_BRICKS_WALL = BLOCKS.register("slate_bricks_wall",
        () -> new CustomWallBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> SLATE_BRICKS_PRESSURE_PLATE = BLOCKS.register("slate_bricks_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.BLACK).doesNotBlockMovement().hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));

    public static final RegistryObject<CustomBlock> SLATE_LARGE_BRICKS = BLOCKS.register("slate_large_bricks",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> SLATE_LARGE_BRICKS_STAIRS = BLOCKS.register("slate_large_bricks_stairs",
        () -> new CustomStairsBlock(() -> SLATE.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> SLATE_LARGE_BRICKS_SLAB = BLOCKS.register("slate_large_bricks_slab",
        () -> new CustomSlabBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomWallBlock> SLATE_LARGE_BRICKS_WALL = BLOCKS.register("slate_large_bricks_wall",
        () -> new CustomWallBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> SLATE_LARGE_BRICKS_PRESSURE_PLATE = BLOCKS.register("slate_large_bricks_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.BLACK).doesNotBlockMovement().hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));

    public static final RegistryObject<CustomBlock> SLATE_ORNEMENT = BLOCKS.register("slate_ornement",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> SLATE_ORNEMENT_PRESSURE_PLATE = BLOCKS.register("slate_ornement_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.BLACK).doesNotBlockMovement().hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));

    // Marble
    public static final RegistryObject<CustomBlock> MARBLE = BLOCKS.register("marble",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> MARBLE_STAIRS = BLOCKS.register("marble_stairs",
        () -> new CustomStairsBlock(() -> MARBLE.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> MARBLE_SLAB = BLOCKS.register("marble_slab",
        () -> new CustomSlabBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomWallBlock> MARBLE_WALL = BLOCKS.register("marble_wall",
        () -> new CustomWallBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> MARBLE_PRESSURE_PLATE = BLOCKS.register("marble_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.BLACK).doesNotBlockMovement().hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));

    public static final RegistryObject<CustomBlock> MARBLE_COBBLESTONE = BLOCKS.register("marble_cobblestone",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> MARBLE_COBBLESTONE_STAIRS = BLOCKS.register("marble_cobblestone_stairs",
        () -> new CustomStairsBlock(() -> MARBLE.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> MARBLE_COBBLESTONE_SLAB = BLOCKS.register("marble_cobblestone_slab",
        () -> new CustomSlabBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomWallBlock> MARBLE_COBBLESTONE_WALL = BLOCKS.register("marble_cobblestone_wall",
        () -> new CustomWallBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> MARBLE_COBBLESTONE_PRESSURE_PLATE = BLOCKS.register("marble_cobblestone_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.BLACK).doesNotBlockMovement().hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));

    public static final RegistryObject<CustomBlock> SMOOTH_MARBLE = BLOCKS.register("smooth_marble",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> SMOOTH_MARBLE_STAIRS = BLOCKS.register("smooth_marble_stairs",
        () -> new CustomStairsBlock(() -> SMOOTH_MARBLE.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> SMOOTH_MARBLE_SLAB = BLOCKS.register("smooth_marble_slab",
        () -> new CustomSlabBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomWallBlock> SMOOTH_MARBLE_WALL = BLOCKS.register("smooth_marble_wall",
        () -> new CustomWallBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> SMOOTH_MARBLE_PRESSURE_PLATE = BLOCKS.register("smooth_marble_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.BLACK).doesNotBlockMovement().hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));

    public static final RegistryObject<CustomBlock> POLISHED_MARBLE = BLOCKS.register("polished_marble",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> POLISHED_MARBLE_STAIRS = BLOCKS.register("polished_marble_stairs",
        () -> new CustomStairsBlock(() -> POLISHED_MARBLE.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> POLISHED_MARBLE_SLAB = BLOCKS.register("polished_marble_slab",
        () -> new CustomSlabBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomWallBlock> POLISHED_MARBLE_WALL = BLOCKS.register("polished_marble_wall",
        () -> new CustomWallBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> POLISHED_MARBLE_PRESSURE_PLATE = BLOCKS.register("polished_marble_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.BLACK).doesNotBlockMovement().hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));

    public static final RegistryObject<CustomBlock> MARBLE_PAVING = BLOCKS.register("marble_paving",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> MARBLE_PAVING_STAIRS = BLOCKS.register("marble_paving_stairs",
        () -> new CustomStairsBlock(() -> MARBLE.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> MARBLE_PAVING_SLAB = BLOCKS.register("marble_paving_slab",
        () -> new CustomSlabBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomWallBlock> MARBLE_PAVING_WALL = BLOCKS.register("marble_paving_wall",
        () -> new CustomWallBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> MARBLE_PAVING_PRESSURE_PLATE = BLOCKS.register("marble_paving_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.BLACK).doesNotBlockMovement().hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));

    public static final RegistryObject<CustomBlock> MARBLE_TILES = BLOCKS.register("marble_tiles",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> MARBLE_TILES_STAIRS = BLOCKS.register("marble_tiles_stairs",
        () -> new CustomStairsBlock(() -> MARBLE.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> MARBLE_TILES_SLAB = BLOCKS.register("marble_tiles_slab",
        () -> new CustomSlabBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomWallBlock> MARBLE_TILES_WALL = BLOCKS.register("marble_tiles_wall",
        () -> new CustomWallBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> MARBLE_TILES_PRESSURE_PLATE = BLOCKS.register("marble_tiles_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.BLACK).doesNotBlockMovement().hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));

    public static final RegistryObject<CustomBlock> MARBLE_BRICKS = BLOCKS.register("marble_bricks",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> MARBLE_BRICKS_STAIRS = BLOCKS.register("marble_bricks_stairs",
        () -> new CustomStairsBlock(() -> MARBLE.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> MARBLE_BRICKS_SLAB = BLOCKS.register("marble_bricks_slab",
        () -> new CustomSlabBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomWallBlock> MARBLE_BRICKS_WALL = BLOCKS.register("marble_bricks_wall",
        () -> new CustomWallBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> MARBLE_BRICKS_PRESSURE_PLATE = BLOCKS.register("marble_bricks_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.BLACK).doesNotBlockMovement().hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));

    public static final RegistryObject<CustomBlock> MARBLE_LARGE_BRICKS = BLOCKS.register("marble_large_bricks",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> MARBLE_LARGE_BRICKS_STAIRS = BLOCKS.register("marble_large_bricks_stairs",
        () -> new CustomStairsBlock(() -> MARBLE.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> MARBLE_LARGE_BRICKS_SLAB = BLOCKS.register("marble_large_bricks_slab",
        () -> new CustomSlabBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomWallBlock> MARBLE_LARGE_BRICKS_WALL = BLOCKS.register("marble_large_bricks_wall",
        () -> new CustomWallBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> MARBLE_LARGE_BRICKS_PRESSURE_PLATE = BLOCKS.register("marble_large_bricks_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.BLACK).doesNotBlockMovement().hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));

    public static final RegistryObject<CustomBlock> MARBLE_ORNEMENT = BLOCKS.register("marble_ornement",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> MARBLE_ORNEMENT_PRESSURE_PLATE = BLOCKS.register("marble_ornement_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.BLACK).doesNotBlockMovement().hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));

    // Gneiss
    public static final RegistryObject<CustomBlock> GNEISS = BLOCKS.register("gneiss",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> GNEISS_STAIRS = BLOCKS.register("gneiss_stairs",
        () -> new CustomStairsBlock(() -> GNEISS.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> GNEISS_SLAB = BLOCKS.register("gneiss_slab",
        () -> new CustomSlabBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomWallBlock> GNEISS_WALL = BLOCKS.register("gneiss_wall",
        () -> new CustomWallBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> GNEISS_PRESSURE_PLATE = BLOCKS.register("gneiss_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.BLACK).doesNotBlockMovement().hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));

    public static final RegistryObject<CustomBlock> GNEISS_COBBLESTONE = BLOCKS.register("gneiss_cobblestone",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> GNEISS_COBBLESTONE_STAIRS = BLOCKS.register("gneiss_cobblestone_stairs",
        () -> new CustomStairsBlock(() -> GNEISS.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> GNEISS_COBBLESTONE_SLAB = BLOCKS.register("gneiss_cobblestone_slab",
        () -> new CustomSlabBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomWallBlock> GNEISS_COBBLESTONE_WALL = BLOCKS.register("gneiss_cobblestone_wall",
        () -> new CustomWallBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> GNEISS_COBBLESTONE_PRESSURE_PLATE = BLOCKS.register("gneiss_cobblestone_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.BLACK).doesNotBlockMovement().hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));

    public static final RegistryObject<CustomBlock> SMOOTH_GNEISS = BLOCKS.register("smooth_gneiss",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> SMOOTH_GNEISS_STAIRS = BLOCKS.register("smooth_gneiss_stairs",
        () -> new CustomStairsBlock(() -> SMOOTH_GNEISS.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> SMOOTH_GNEISS_SLAB = BLOCKS.register("smooth_gneiss_slab",
        () -> new CustomSlabBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomWallBlock> SMOOTH_GNEISS_WALL = BLOCKS.register("smooth_gneiss_wall",
        () -> new CustomWallBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> SMOOTH_GNEISS_PRESSURE_PLATE = BLOCKS.register("smooth_gneiss_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.BLACK).doesNotBlockMovement().hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));

    public static final RegistryObject<CustomBlock> POLISHED_GNEISS = BLOCKS.register("polished_gneiss",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> POLISHED_GNEISS_STAIRS = BLOCKS.register("polished_gneiss_stairs",
        () -> new CustomStairsBlock(() -> POLISHED_GNEISS.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> POLISHED_GNEISS_SLAB = BLOCKS.register("polished_gneiss_slab",
        () -> new CustomSlabBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomWallBlock> POLISHED_GNEISS_WALL = BLOCKS.register("polished_gneiss_wall",
        () -> new CustomWallBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> POLISHED_GNEISS_PRESSURE_PLATE = BLOCKS.register("polished_gneiss_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.BLACK).doesNotBlockMovement().hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));

    public static final RegistryObject<CustomBlock> GNEISS_PAVING = BLOCKS.register("gneiss_paving",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> GNEISS_PAVING_STAIRS = BLOCKS.register("gneiss_paving_stairs",
        () -> new CustomStairsBlock(() -> GNEISS.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> GNEISS_PAVING_SLAB = BLOCKS.register("gneiss_paving_slab",
        () -> new CustomSlabBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomWallBlock> GNEISS_PAVING_WALL = BLOCKS.register("gneiss_paving_wall",
        () -> new CustomWallBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> GNEISS_PAVING_PRESSURE_PLATE = BLOCKS.register("gneiss_paving_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.BLACK).doesNotBlockMovement().hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));

    public static final RegistryObject<CustomBlock> GNEISS_TILES = BLOCKS.register("gneiss_tiles",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> GNEISS_TILES_STAIRS = BLOCKS.register("gneiss_tiles_stairs",
        () -> new CustomStairsBlock(() -> GNEISS.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> GNEISS_TILES_SLAB = BLOCKS.register("gneiss_tiles_slab",
        () -> new CustomSlabBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomWallBlock> GNEISS_TILES_WALL = BLOCKS.register("gneiss_tiles_wall",
        () -> new CustomWallBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> GNEISS_TILES_PRESSURE_PLATE = BLOCKS.register("gneiss_tiles_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.BLACK).doesNotBlockMovement().hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));

    public static final RegistryObject<CustomBlock> GNEISS_BRICKS = BLOCKS.register("gneiss_bricks",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> GNEISS_BRICKS_STAIRS = BLOCKS.register("gneiss_bricks_stairs",
        () -> new CustomStairsBlock(() -> GNEISS.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> GNEISS_BRICKS_SLAB = BLOCKS.register("gneiss_bricks_slab",
        () -> new CustomSlabBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomWallBlock> GNEISS_BRICKS_WALL = BLOCKS.register("gneiss_bricks_wall",
        () -> new CustomWallBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> GNEISS_BRICKS_PRESSURE_PLATE = BLOCKS.register("gneiss_bricks_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.BLACK).doesNotBlockMovement().hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));

    public static final RegistryObject<CustomBlock> GNEISS_LARGE_BRICKS = BLOCKS.register("gneiss_large_bricks",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> GNEISS_LARGE_BRICKS_STAIRS = BLOCKS.register("gneiss_large_bricks_stairs",
        () -> new CustomStairsBlock(() -> GNEISS.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> GNEISS_LARGE_BRICKS_SLAB = BLOCKS.register("gneiss_large_bricks_slab",
        () -> new CustomSlabBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomWallBlock> GNEISS_LARGE_BRICKS_WALL = BLOCKS.register("gneiss_large_bricks_wall",
        () -> new CustomWallBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> GNEISS_LARGE_BRICKS_PRESSURE_PLATE = BLOCKS.register("gneiss_large_bricks_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.BLACK).doesNotBlockMovement().hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));

    public static final RegistryObject<CustomBlock> GNEISS_ORNEMENT = BLOCKS.register("gneiss_ornement",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> GNEISS_ORNEMENT_PRESSURE_PLATE = BLOCKS.register("gneiss_ornement_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.BLACK).doesNotBlockMovement().hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));

    // Jade
    public static final RegistryObject<CustomBlock> JADE = BLOCKS.register("jade",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> JADE_STAIRS = BLOCKS.register("jade_stairs",
        () -> new CustomStairsBlock(() -> JADE.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> JADE_SLAB = BLOCKS.register("jade_slab",
        () -> new CustomSlabBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomWallBlock> JADE_WALL = BLOCKS.register("jade_wall",
        () -> new CustomWallBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> JADE_PRESSURE_PLATE = BLOCKS.register("jade_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.BLACK).doesNotBlockMovement().hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));

    public static final RegistryObject<CustomBlock> JADE_COBBLESTONE = BLOCKS.register("jade_cobblestone",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> JADE_COBBLESTONE_STAIRS = BLOCKS.register("jade_cobblestone_stairs",
        () -> new CustomStairsBlock(() -> JADE.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> JADE_COBBLESTONE_SLAB = BLOCKS.register("jade_cobblestone_slab",
        () -> new CustomSlabBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomWallBlock> JADE_COBBLESTONE_WALL = BLOCKS.register("jade_cobblestone_wall",
        () -> new CustomWallBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> JADE_COBBLESTONE_PRESSURE_PLATE = BLOCKS.register("jade_cobblestone_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.BLACK).doesNotBlockMovement().hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));

    public static final RegistryObject<CustomBlock> SMOOTH_JADE = BLOCKS.register("smooth_jade",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> SMOOTH_JADE_STAIRS = BLOCKS.register("smooth_jade_stairs",
        () -> new CustomStairsBlock(() -> SMOOTH_JADE.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> SMOOTH_JADE_SLAB = BLOCKS.register("smooth_jade_slab",
        () -> new CustomSlabBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomWallBlock> SMOOTH_JADE_WALL = BLOCKS.register("smooth_jade_wall",
        () -> new CustomWallBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> SMOOTH_JADE_PRESSURE_PLATE = BLOCKS.register("smooth_jade_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.BLACK).doesNotBlockMovement().hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));

    public static final RegistryObject<CustomBlock> POLISHED_JADE = BLOCKS.register("polished_jade",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> POLISHED_JADE_STAIRS = BLOCKS.register("polished_jade_stairs",
        () -> new CustomStairsBlock(() -> POLISHED_JADE.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> POLISHED_JADE_SLAB = BLOCKS.register("polished_jade_slab",
        () -> new CustomSlabBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomWallBlock> POLISHED_JADE_WALL = BLOCKS.register("polished_jade_wall",
        () -> new CustomWallBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> POLISHED_JADE_PRESSURE_PLATE = BLOCKS.register("polished_jade_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.BLACK).doesNotBlockMovement().hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));

    public static final RegistryObject<CustomBlock> JADE_PAVING = BLOCKS.register("jade_paving",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> JADE_PAVING_STAIRS = BLOCKS.register("jade_paving_stairs",
        () -> new CustomStairsBlock(() -> JADE.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> JADE_PAVING_SLAB = BLOCKS.register("jade_paving_slab",
        () -> new CustomSlabBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomWallBlock> JADE_PAVING_WALL = BLOCKS.register("jade_paving_wall",
        () -> new CustomWallBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> JADE_PAVING_PRESSURE_PLATE = BLOCKS.register("jade_paving_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.BLACK).doesNotBlockMovement().hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));

    public static final RegistryObject<CustomBlock> JADE_TILES = BLOCKS.register("jade_tiles",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> JADE_TILES_STAIRS = BLOCKS.register("jade_tiles_stairs",
        () -> new CustomStairsBlock(() -> JADE.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> JADE_TILES_SLAB = BLOCKS.register("jade_tiles_slab",
        () -> new CustomSlabBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomWallBlock> JADE_TILES_WALL = BLOCKS.register("jade_tiles_wall",
        () -> new CustomWallBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> JADE_TILES_PRESSURE_PLATE = BLOCKS.register("jade_tiles_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.BLACK).doesNotBlockMovement().hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));

    public static final RegistryObject<CustomBlock> JADE_BRICKS = BLOCKS.register("jade_bricks",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> JADE_BRICKS_STAIRS = BLOCKS.register("jade_bricks_stairs",
        () -> new CustomStairsBlock(() -> JADE.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> JADE_BRICKS_SLAB = BLOCKS.register("jade_bricks_slab",
        () -> new CustomSlabBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomWallBlock> JADE_BRICKS_WALL = BLOCKS.register("jade_bricks_wall",
        () -> new CustomWallBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> JADE_BRICKS_PRESSURE_PLATE = BLOCKS.register("jade_bricks_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.BLACK).doesNotBlockMovement().hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));

    public static final RegistryObject<CustomBlock> JADE_LARGE_BRICKS = BLOCKS.register("jade_large_bricks",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> JADE_LARGE_BRICKS_STAIRS = BLOCKS.register("jade_large_bricks_stairs",
        () -> new CustomStairsBlock(() -> JADE.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> JADE_LARGE_BRICKS_SLAB = BLOCKS.register("jade_large_bricks_slab",
        () -> new CustomSlabBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomWallBlock> JADE_LARGE_BRICKS_WALL = BLOCKS.register("jade_large_bricks_wall",
        () -> new CustomWallBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> JADE_LARGE_BRICKS_PRESSURE_PLATE = BLOCKS.register("jade_large_bricks_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.BLACK).doesNotBlockMovement().hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));

    public static final RegistryObject<CustomBlock> JADE_ORNEMENT = BLOCKS.register("jade_ornement",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> JADE_ORNEMENT_PRESSURE_PLATE = BLOCKS.register("jade_ornement_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.BLACK).doesNotBlockMovement().hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));

    // Larvikite
    public static final RegistryObject<CustomBlock> LARVIKITE = BLOCKS.register("larvikite",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> LARVIKITE_STAIRS = BLOCKS.register("larvikite_stairs",
        () -> new CustomStairsBlock(() -> LARVIKITE.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> LARVIKITE_SLAB = BLOCKS.register("larvikite_slab",
        () -> new CustomSlabBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomWallBlock> LARVIKITE_WALL = BLOCKS.register("larvikite_wall",
        () -> new CustomWallBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> LARVIKITE_PRESSURE_PLATE = BLOCKS.register("larvikite_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.BLACK).doesNotBlockMovement().hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));

    public static final RegistryObject<CustomBlock> LARVIKITE_COBBLESTONE = BLOCKS.register("larvikite_cobblestone",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> LARVIKITE_COBBLESTONE_STAIRS = BLOCKS.register("larvikite_cobblestone_stairs",
        () -> new CustomStairsBlock(() -> LARVIKITE.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> LARVIKITE_COBBLESTONE_SLAB = BLOCKS.register("larvikite_cobblestone_slab",
        () -> new CustomSlabBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomWallBlock> LARVIKITE_COBBLESTONE_WALL = BLOCKS.register("larvikite_cobblestone_wall",
        () -> new CustomWallBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> LARVIKITE_COBBLESTONE_PRESSURE_PLATE = BLOCKS.register("larvikite_cobblestone_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.BLACK).doesNotBlockMovement().hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));

    public static final RegistryObject<CustomBlock> SMOOTH_LARVIKITE = BLOCKS.register("smooth_larvikite",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> SMOOTH_LARVIKITE_STAIRS = BLOCKS.register("smooth_larvikite_stairs",
        () -> new CustomStairsBlock(() -> SMOOTH_LARVIKITE.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> SMOOTH_LARVIKITE_SLAB = BLOCKS.register("smooth_larvikite_slab",
        () -> new CustomSlabBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomWallBlock> SMOOTH_LARVIKITE_WALL = BLOCKS.register("smooth_larvikite_wall",
        () -> new CustomWallBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> SMOOTH_LARVIKITE_PRESSURE_PLATE = BLOCKS.register("smooth_larvikite_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.BLACK).doesNotBlockMovement().hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));

    public static final RegistryObject<CustomBlock> POLISHED_LARVIKITE = BLOCKS.register("polished_larvikite",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> POLISHED_LARVIKITE_STAIRS = BLOCKS.register("polished_larvikite_stairs",
        () -> new CustomStairsBlock(() -> POLISHED_LARVIKITE.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> POLISHED_LARVIKITE_SLAB = BLOCKS.register("polished_larvikite_slab",
        () -> new CustomSlabBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomWallBlock> POLISHED_LARVIKITE_WALL = BLOCKS.register("polished_larvikite_wall",
        () -> new CustomWallBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> POLISHED_LARVIKITE_PRESSURE_PLATE = BLOCKS.register("polished_larvikite_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.BLACK).doesNotBlockMovement().hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));

    public static final RegistryObject<CustomBlock> LARVIKITE_PAVING = BLOCKS.register("larvikite_paving",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> LARVIKITE_PAVING_STAIRS = BLOCKS.register("larvikite_paving_stairs",
        () -> new CustomStairsBlock(() -> LARVIKITE.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> LARVIKITE_PAVING_SLAB = BLOCKS.register("larvikite_paving_slab",
        () -> new CustomSlabBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomWallBlock> LARVIKITE_PAVING_WALL = BLOCKS.register("larvikite_paving_wall",
        () -> new CustomWallBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> LARVIKITE_PAVING_PRESSURE_PLATE = BLOCKS.register("larvikite_paving_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.BLACK).doesNotBlockMovement().hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));

    public static final RegistryObject<CustomBlock> LARVIKITE_TILES = BLOCKS.register("larvikite_tiles",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> LARVIKITE_TILES_STAIRS = BLOCKS.register("larvikite_tiles_stairs",
        () -> new CustomStairsBlock(() -> LARVIKITE.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> LARVIKITE_TILES_SLAB = BLOCKS.register("larvikite_tiles_slab",
        () -> new CustomSlabBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomWallBlock> LARVIKITE_TILES_WALL = BLOCKS.register("larvikite_tiles_wall",
        () -> new CustomWallBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> LARVIKITE_TILES_PRESSURE_PLATE = BLOCKS.register("larvikite_tiles_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.BLACK).doesNotBlockMovement().hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));

    public static final RegistryObject<CustomBlock> LARVIKITE_BRICKS = BLOCKS.register("larvikite_bricks",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> LARVIKITE_BRICKS_STAIRS = BLOCKS.register("larvikite_bricks_stairs",
        () -> new CustomStairsBlock(() -> LARVIKITE.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> LARVIKITE_BRICKS_SLAB = BLOCKS.register("larvikite_bricks_slab",
        () -> new CustomSlabBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomWallBlock> LARVIKITE_BRICKS_WALL = BLOCKS.register("larvikite_bricks_wall",
        () -> new CustomWallBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> LARVIKITE_BRICKS_PRESSURE_PLATE = BLOCKS.register("larvikite_bricks_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.BLACK).doesNotBlockMovement().hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));

    public static final RegistryObject<CustomBlock> LARVIKITE_LARGE_BRICKS = BLOCKS.register("larvikite_large_bricks",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> LARVIKITE_LARGE_BRICKS_STAIRS = BLOCKS.register("larvikite_large_bricks_stairs",
        () -> new CustomStairsBlock(() -> LARVIKITE.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> LARVIKITE_LARGE_BRICKS_SLAB = BLOCKS.register("larvikite_large_bricks_slab",
        () -> new CustomSlabBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomWallBlock> LARVIKITE_LARGE_BRICKS_WALL = BLOCKS.register("larvikite_large_bricks_wall",
        () -> new CustomWallBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> LARVIKITE_LARGE_BRICKS_PRESSURE_PLATE = BLOCKS.register("larvikite_large_bricks_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.BLACK).doesNotBlockMovement().hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));

    public static final RegistryObject<CustomBlock> LARVIKITE_ORNEMENT = BLOCKS.register("larvikite_ornement",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> LARVIKITE_ORNEMENT_PRESSURE_PLATE = BLOCKS.register("larvikite_ornement_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.BLACK).doesNotBlockMovement().hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));

    // Andesite
    public static final RegistryObject<CustomBlock> SMOOTH_ANDESITE = BLOCKS.register("smooth_andesite",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> SMOOTH_ANDESITE_STAIRS = BLOCKS.register("smooth_andesite_stairs",
        () -> new CustomStairsBlock(() -> SMOOTH_ANDESITE.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> SMOOTH_ANDESITE_SLAB = BLOCKS.register("smooth_andesite_slab",
        () -> new CustomSlabBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomWallBlock> SMOOTH_ANDESITE_WALL = BLOCKS.register("smooth_andesite_wall",
        () -> new CustomWallBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> SMOOTH_ANDESITE_PRESSURE_PLATE = BLOCKS.register("smooth_andesite_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.BLACK).doesNotBlockMovement().hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));

    public static final RegistryObject<CustomBlock> ANDESITE_PAVING = BLOCKS.register("andesite_paving",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> ANDESITE_PAVING_STAIRS = BLOCKS.register("andesite_paving_stairs",
        () -> new CustomStairsBlock(() -> Blocks.ANDESITE.getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> ANDESITE_PAVING_SLAB = BLOCKS.register("andesite_paving_slab",
        () -> new CustomSlabBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomWallBlock> ANDESITE_PAVING_WALL = BLOCKS.register("andesite_paving_wall",
        () -> new CustomWallBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> ANDESITE_PAVING_PRESSURE_PLATE = BLOCKS.register("andesite_paving_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.BLACK).doesNotBlockMovement().hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));

    public static final RegistryObject<CustomBlock> ANDESITE_TILES = BLOCKS.register("andesite_tiles",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> ANDESITE_TILES_STAIRS = BLOCKS.register("andesite_tiles_stairs",
        () -> new CustomStairsBlock(() -> Blocks.ANDESITE.getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> ANDESITE_TILES_SLAB = BLOCKS.register("andesite_tiles_slab",
        () -> new CustomSlabBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomWallBlock> ANDESITE_TILES_WALL = BLOCKS.register("andesite_tiles_wall",
        () -> new CustomWallBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> ANDESITE_TILES_PRESSURE_PLATE = BLOCKS.register("andesite_tiles_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.BLACK).doesNotBlockMovement().hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));

    public static final RegistryObject<CustomBlock> ANDESITE_BRICKS = BLOCKS.register("andesite_bricks",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> ANDESITE_BRICKS_STAIRS = BLOCKS.register("andesite_bricks_stairs",
        () -> new CustomStairsBlock(() -> Blocks.ANDESITE.getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> ANDESITE_BRICKS_SLAB = BLOCKS.register("andesite_bricks_slab",
        () -> new CustomSlabBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomWallBlock> ANDESITE_BRICKS_WALL = BLOCKS.register("andesite_bricks_wall",
        () -> new CustomWallBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> ANDESITE_BRICKS_PRESSURE_PLATE = BLOCKS.register("andesite_bricks_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.BLACK).doesNotBlockMovement().hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));

    public static final RegistryObject<CustomBlock> ANDESITE_LARGE_BRICKS = BLOCKS.register("andesite_large_bricks",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> ANDESITE_LARGE_BRICKS_STAIRS = BLOCKS.register("andesite_large_bricks_stairs",
        () -> new CustomStairsBlock(() -> Blocks.ANDESITE.getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> ANDESITE_LARGE_BRICKS_SLAB = BLOCKS.register("andesite_large_bricks_slab",
        () -> new CustomSlabBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomWallBlock> ANDESITE_LARGE_BRICKS_WALL = BLOCKS.register("andesite_large_bricks_wall",
        () -> new CustomWallBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> ANDESITE_LARGE_BRICKS_PRESSURE_PLATE = BLOCKS.register("andesite_large_bricks_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.BLACK).doesNotBlockMovement().hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));

    public static final RegistryObject<CustomBlock> ANDESITE_ORNEMENT = BLOCKS.register("andesite_ornement",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> ANDESITE_ORNEMENT_PRESSURE_PLATE = BLOCKS.register("andesite_ornement_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.BLACK).doesNotBlockMovement().hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));

    // Diorite
    public static final RegistryObject<CustomBlock> SMOOTH_DIORITE = BLOCKS.register("smooth_diorite",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> SMOOTH_DIORITE_STAIRS = BLOCKS.register("smooth_diorite_stairs",
        () -> new CustomStairsBlock(() -> SMOOTH_DIORITE.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> SMOOTH_DIORITE_SLAB = BLOCKS.register("smooth_diorite_slab",
        () -> new CustomSlabBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomWallBlock> SMOOTH_DIORITE_WALL = BLOCKS.register("smooth_diorite_wall",
        () -> new CustomWallBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> SMOOTH_DIORITE_PRESSURE_PLATE = BLOCKS.register("smooth_diorite_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.BLACK).doesNotBlockMovement().hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));

    public static final RegistryObject<CustomBlock> DIORITE_PAVING = BLOCKS.register("diorite_paving",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> DIORITE_PAVING_STAIRS = BLOCKS.register("diorite_paving_stairs",
        () -> new CustomStairsBlock(() -> Blocks.DIORITE.getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> DIORITE_PAVING_SLAB = BLOCKS.register("diorite_paving_slab",
        () -> new CustomSlabBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomWallBlock> DIORITE_PAVING_WALL = BLOCKS.register("diorite_paving_wall",
        () -> new CustomWallBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> DIORITE_PAVING_PRESSURE_PLATE = BLOCKS.register("diorite_paving_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.BLACK).doesNotBlockMovement().hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));

    public static final RegistryObject<CustomBlock> DIORITE_TILES = BLOCKS.register("diorite_tiles",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> DIORITE_TILES_STAIRS = BLOCKS.register("diorite_tiles_stairs",
        () -> new CustomStairsBlock(() -> Blocks.DIORITE.getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> DIORITE_TILES_SLAB = BLOCKS.register("diorite_tiles_slab",
        () -> new CustomSlabBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomWallBlock> DIORITE_TILES_WALL = BLOCKS.register("diorite_tiles_wall",
        () -> new CustomWallBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> DIORITE_TILES_PRESSURE_PLATE = BLOCKS.register("diorite_tiles_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.BLACK).doesNotBlockMovement().hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));

    public static final RegistryObject<CustomBlock> DIORITE_BRICKS = BLOCKS.register("diorite_bricks",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> DIORITE_BRICKS_STAIRS = BLOCKS.register("diorite_bricks_stairs",
        () -> new CustomStairsBlock(() -> Blocks.DIORITE.getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> DIORITE_BRICKS_SLAB = BLOCKS.register("diorite_bricks_slab",
        () -> new CustomSlabBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomWallBlock> DIORITE_BRICKS_WALL = BLOCKS.register("diorite_bricks_wall",
        () -> new CustomWallBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> DIORITE_BRICKS_PRESSURE_PLATE = BLOCKS.register("diorite_bricks_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.BLACK).doesNotBlockMovement().hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));

    public static final RegistryObject<CustomBlock> DIORITE_LARGE_BRICKS = BLOCKS.register("diorite_large_bricks",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> DIORITE_LARGE_BRICKS_STAIRS = BLOCKS.register("diorite_large_bricks_stairs",
        () -> new CustomStairsBlock(() -> Blocks.DIORITE.getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> DIORITE_LARGE_BRICKS_SLAB = BLOCKS.register("diorite_large_bricks_slab",
        () -> new CustomSlabBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomWallBlock> DIORITE_LARGE_BRICKS_WALL = BLOCKS.register("diorite_large_bricks_wall",
        () -> new CustomWallBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> DIORITE_LARGE_BRICKS_PRESSURE_PLATE = BLOCKS.register("diorite_large_bricks_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.BLACK).doesNotBlockMovement().hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));

    public static final RegistryObject<CustomBlock> DIORITE_ORNEMENT = BLOCKS.register("diorite_ornement",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> DIORITE_ORNEMENT_PRESSURE_PLATE = BLOCKS.register("diorite_ornement_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.BLACK).doesNotBlockMovement().hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));

    // Granite
    public static final RegistryObject<CustomBlock> SMOOTH_GRANITE = BLOCKS.register("smooth_granite",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> SMOOTH_GRANITE_STAIRS = BLOCKS.register("smooth_granite_stairs",
        () -> new CustomStairsBlock(() -> SMOOTH_GRANITE.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> SMOOTH_GRANITE_SLAB = BLOCKS.register("smooth_granite_slab",
        () -> new CustomSlabBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomWallBlock> SMOOTH_GRANITE_WALL = BLOCKS.register("smooth_granite_wall",
        () -> new CustomWallBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> SMOOTH_GRANITE_PRESSURE_PLATE = BLOCKS.register("smooth_granite_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.BLACK).doesNotBlockMovement().hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));

    public static final RegistryObject<CustomBlock> GRANITE_PAVING = BLOCKS.register("granite_paving",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> GRANITE_PAVING_STAIRS = BLOCKS.register("granite_paving_stairs",
        () -> new CustomStairsBlock(() -> Blocks.GRANITE.getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> GRANITE_PAVING_SLAB = BLOCKS.register("granite_paving_slab",
        () -> new CustomSlabBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomWallBlock> GRANITE_PAVING_WALL = BLOCKS.register("granite_paving_wall",
        () -> new CustomWallBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> GRANITE_PAVING_PRESSURE_PLATE = BLOCKS.register("granite_paving_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.BLACK).doesNotBlockMovement().hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));

    public static final RegistryObject<CustomBlock> GRANITE_TILES = BLOCKS.register("granite_tiles",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> GRANITE_TILES_STAIRS = BLOCKS.register("granite_tiles_stairs",
        () -> new CustomStairsBlock(() -> Blocks.GRANITE.getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> GRANITE_TILES_SLAB = BLOCKS.register("granite_tiles_slab",
        () -> new CustomSlabBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomWallBlock> GRANITE_TILES_WALL = BLOCKS.register("granite_tiles_wall",
        () -> new CustomWallBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> GRANITE_TILES_PRESSURE_PLATE = BLOCKS.register("granite_tiles_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.BLACK).doesNotBlockMovement().hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));

    public static final RegistryObject<CustomBlock> GRANITE_BRICKS = BLOCKS.register("granite_bricks",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> GRANITE_BRICKS_STAIRS = BLOCKS.register("granite_bricks_stairs",
        () -> new CustomStairsBlock(() -> Blocks.GRANITE.getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> GRANITE_BRICKS_SLAB = BLOCKS.register("granite_bricks_slab",
        () -> new CustomSlabBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomWallBlock> GRANITE_BRICKS_WALL = BLOCKS.register("granite_bricks_wall",
        () -> new CustomWallBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> GRANITE_BRICKS_PRESSURE_PLATE = BLOCKS.register("granite_bricks_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.BLACK).doesNotBlockMovement().hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));

    public static final RegistryObject<CustomBlock> GRANITE_LARGE_BRICKS = BLOCKS.register("granite_large_bricks",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> GRANITE_LARGE_BRICKS_STAIRS = BLOCKS.register("granite_large_bricks_stairs",
        () -> new CustomStairsBlock(() -> Blocks.GRANITE.getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> GRANITE_LARGE_BRICKS_SLAB = BLOCKS.register("granite_large_bricks_slab",
        () -> new CustomSlabBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomWallBlock> GRANITE_LARGE_BRICKS_WALL = BLOCKS.register("granite_large_bricks_wall",
        () -> new CustomWallBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> GRANITE_LARGE_BRICKS_PRESSURE_PLATE = BLOCKS.register("granite_large_bricks_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.BLACK).doesNotBlockMovement().hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));

    public static final RegistryObject<CustomBlock> GRANITE_ORNEMENT = BLOCKS.register("granite_ornement",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> GRANITE_ORNEMENT_PRESSURE_PLATE = BLOCKS.register("granite_ornement_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.BLACK).doesNotBlockMovement().hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));

    public static void init()
    {
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}
