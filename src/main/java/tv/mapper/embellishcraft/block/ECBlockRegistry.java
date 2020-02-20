package tv.mapper.embellishcraft.block;

import net.minecraft.block.Block;
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
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.BLACK).doesNotBlockMovement().hardnessAndResistance(1.5F,
            6.0F).sound(SoundType.STONE), ToolType.PICKAXE));

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
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.BLACK).doesNotBlockMovement().hardnessAndResistance(1.5F,
            6.0F).sound(SoundType.STONE), ToolType.PICKAXE));

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
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.BLACK).doesNotBlockMovement().hardnessAndResistance(1.5F,
            6.0F).sound(SoundType.STONE), ToolType.PICKAXE));

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
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.BLACK).doesNotBlockMovement().hardnessAndResistance(1.5F,
            6.0F).sound(SoundType.STONE), ToolType.PICKAXE));

    // Slate
    public static final RegistryObject<CustomBlock> SLATE = BLOCKS.register("slate",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.CLAY).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> SLATE_STAIRS = BLOCKS.register("slate_stairs",
        () -> new CustomStairsBlock(() -> SLATE.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.CLAY).hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> SLATE_SLAB = BLOCKS.register("slate_slab",
        () -> new CustomSlabBlock(Block.Properties.create(Material.ROCK, MaterialColor.CLAY).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomWallBlock> SLATE_WALL = BLOCKS.register("slate_wall",
        () -> new CustomWallBlock(Block.Properties.create(Material.ROCK, MaterialColor.CLAY).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> SLATE_PRESSURE_PLATE = BLOCKS.register("slate_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.CLAY).doesNotBlockMovement().hardnessAndResistance(1.5F,
            6.0F).sound(SoundType.STONE), ToolType.PICKAXE));

    public static final RegistryObject<CustomBlock> SLATE_COBBLESTONE = BLOCKS.register("slate_cobblestone",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.CLAY).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> SLATE_COBBLESTONE_STAIRS = BLOCKS.register("slate_cobblestone_stairs",
        () -> new CustomStairsBlock(() -> SLATE.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.CLAY).hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> SLATE_COBBLESTONE_SLAB = BLOCKS.register("slate_cobblestone_slab",
        () -> new CustomSlabBlock(Block.Properties.create(Material.ROCK, MaterialColor.CLAY).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomWallBlock> SLATE_COBBLESTONE_WALL = BLOCKS.register("slate_cobblestone_wall",
        () -> new CustomWallBlock(Block.Properties.create(Material.ROCK, MaterialColor.CLAY).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> SLATE_COBBLESTONE_PRESSURE_PLATE = BLOCKS.register("slate_cobblestone_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.CLAY).doesNotBlockMovement().hardnessAndResistance(1.5F,
            6.0F).sound(SoundType.STONE), ToolType.PICKAXE));

    public static final RegistryObject<CustomBlock> SLATE_BRICKS = BLOCKS.register("slate_bricks",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.CLAY).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> SLATE_BRICKS_STAIRS = BLOCKS.register("slate_bricks_stairs",
        () -> new CustomStairsBlock(() -> SLATE.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.CLAY).hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> SLATE_BRICKS_SLAB = BLOCKS.register("slate_bricks_slab",
        () -> new CustomSlabBlock(Block.Properties.create(Material.ROCK, MaterialColor.CLAY).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomWallBlock> SLATE_BRICKS_WALL = BLOCKS.register("slate_bricks_wall",
        () -> new CustomWallBlock(Block.Properties.create(Material.ROCK, MaterialColor.CLAY).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> SLATE_BRICKS_PRESSURE_PLATE = BLOCKS.register("slate_bricks_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.CLAY).doesNotBlockMovement().hardnessAndResistance(1.5F,
            6.0F).sound(SoundType.STONE), ToolType.PICKAXE));

    public static final RegistryObject<CustomBlock> SLATE_LARGE_BRICKS = BLOCKS.register("slate_large_bricks",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.CLAY).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> SLATE_LARGE_BRICKS_STAIRS = BLOCKS.register("slate_large_bricks_stairs",
        () -> new CustomStairsBlock(() -> SLATE.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.CLAY).hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> SLATE_LARGE_BRICKS_SLAB = BLOCKS.register("slate_large_bricks_slab",
        () -> new CustomSlabBlock(Block.Properties.create(Material.ROCK, MaterialColor.CLAY).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomWallBlock> SLATE_LARGE_BRICKS_WALL = BLOCKS.register("slate_large_bricks_wall",
        () -> new CustomWallBlock(Block.Properties.create(Material.ROCK, MaterialColor.CLAY).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> SLATE_LARGE_BRICKS_PRESSURE_PLATE = BLOCKS.register("slate_large_bricks_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.CLAY).doesNotBlockMovement().hardnessAndResistance(1.5F,
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
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.QUARTZ).doesNotBlockMovement().hardnessAndResistance(1.5F,
            6.0F).sound(SoundType.STONE), ToolType.PICKAXE));

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
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.QUARTZ).doesNotBlockMovement().hardnessAndResistance(1.5F,
            6.0F).sound(SoundType.STONE), ToolType.PICKAXE));

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
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.QUARTZ).doesNotBlockMovement().hardnessAndResistance(1.5F,
            6.0F).sound(SoundType.STONE), ToolType.PICKAXE));

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
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.QUARTZ).doesNotBlockMovement().hardnessAndResistance(1.5F,
            6.0F).sound(SoundType.STONE), ToolType.PICKAXE));

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
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.WHITE_TERRACOTTA).doesNotBlockMovement().hardnessAndResistance(
            1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));

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
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.WHITE_TERRACOTTA).doesNotBlockMovement().hardnessAndResistance(
            1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));

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
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.WHITE_TERRACOTTA).doesNotBlockMovement().hardnessAndResistance(
            1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));

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
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.WHITE_TERRACOTTA).doesNotBlockMovement().hardnessAndResistance(
            1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));

    // Jade
    public static final RegistryObject<CustomBlock> JADE = BLOCKS.register("jade",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.GREEN).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> JADE_STAIRS = BLOCKS.register("jade_stairs",
        () -> new CustomStairsBlock(() -> JADE.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.GREEN).hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> JADE_SLAB = BLOCKS.register("jade_slab",
        () -> new CustomSlabBlock(Block.Properties.create(Material.ROCK, MaterialColor.GREEN).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomWallBlock> JADE_WALL = BLOCKS.register("jade_wall",
        () -> new CustomWallBlock(Block.Properties.create(Material.ROCK, MaterialColor.GREEN).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> JADE_PRESSURE_PLATE = BLOCKS.register("jade_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.GREEN).doesNotBlockMovement().hardnessAndResistance(1.5F,
            6.0F).sound(SoundType.STONE), ToolType.PICKAXE));

    public static final RegistryObject<CustomBlock> JADE_COBBLESTONE = BLOCKS.register("jade_cobblestone",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.GREEN).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> JADE_COBBLESTONE_STAIRS = BLOCKS.register("jade_cobblestone_stairs",
        () -> new CustomStairsBlock(() -> JADE.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.GREEN).hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> JADE_COBBLESTONE_SLAB = BLOCKS.register("jade_cobblestone_slab",
        () -> new CustomSlabBlock(Block.Properties.create(Material.ROCK, MaterialColor.GREEN).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomWallBlock> JADE_COBBLESTONE_WALL = BLOCKS.register("jade_cobblestone_wall",
        () -> new CustomWallBlock(Block.Properties.create(Material.ROCK, MaterialColor.GREEN).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> JADE_COBBLESTONE_PRESSURE_PLATE = BLOCKS.register("jade_cobblestone_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.GREEN).doesNotBlockMovement().hardnessAndResistance(1.5F,
            6.0F).sound(SoundType.STONE), ToolType.PICKAXE));

    public static final RegistryObject<CustomBlock> JADE_BRICKS = BLOCKS.register("jade_bricks",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.GREEN).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> JADE_BRICKS_STAIRS = BLOCKS.register("jade_bricks_stairs",
        () -> new CustomStairsBlock(() -> JADE.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.GREEN).hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> JADE_BRICKS_SLAB = BLOCKS.register("jade_bricks_slab",
        () -> new CustomSlabBlock(Block.Properties.create(Material.ROCK, MaterialColor.GREEN).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomWallBlock> JADE_BRICKS_WALL = BLOCKS.register("jade_bricks_wall",
        () -> new CustomWallBlock(Block.Properties.create(Material.ROCK, MaterialColor.GREEN).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> JADE_BRICKS_PRESSURE_PLATE = BLOCKS.register("jade_bricks_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.GREEN).doesNotBlockMovement().hardnessAndResistance(1.5F,
            6.0F).sound(SoundType.STONE), ToolType.PICKAXE));

    public static final RegistryObject<CustomBlock> JADE_LARGE_BRICKS = BLOCKS.register("jade_large_bricks",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.GREEN).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> JADE_LARGE_BRICKS_STAIRS = BLOCKS.register("jade_large_bricks_stairs",
        () -> new CustomStairsBlock(() -> JADE.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.GREEN).hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> JADE_LARGE_BRICKS_SLAB = BLOCKS.register("jade_large_bricks_slab",
        () -> new CustomSlabBlock(Block.Properties.create(Material.ROCK, MaterialColor.GREEN).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomWallBlock> JADE_LARGE_BRICKS_WALL = BLOCKS.register("jade_large_bricks_wall",
        () -> new CustomWallBlock(Block.Properties.create(Material.ROCK, MaterialColor.GREEN).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> JADE_LARGE_BRICKS_PRESSURE_PLATE = BLOCKS.register("jade_large_bricks_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.GREEN).doesNotBlockMovement().hardnessAndResistance(1.5F,
            6.0F).sound(SoundType.STONE), ToolType.PICKAXE));

    // Larvikite
    public static final RegistryObject<CustomBlock> LARVIKITE = BLOCKS.register("larvikite",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLUE_TERRACOTTA).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> LARVIKITE_STAIRS = BLOCKS.register("larvikite_stairs",
        () -> new CustomStairsBlock(() -> LARVIKITE.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.BLUE_TERRACOTTA).hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> LARVIKITE_SLAB = BLOCKS.register("larvikite_slab",
        () -> new CustomSlabBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLUE_TERRACOTTA).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomWallBlock> LARVIKITE_WALL = BLOCKS.register("larvikite_wall",
        () -> new CustomWallBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLUE_TERRACOTTA).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> LARVIKITE_PRESSURE_PLATE = BLOCKS.register("larvikite_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.BLUE_TERRACOTTA).doesNotBlockMovement().hardnessAndResistance(1.5F,
            6.0F).sound(SoundType.STONE), ToolType.PICKAXE));

    public static final RegistryObject<CustomBlock> LARVIKITE_COBBLESTONE = BLOCKS.register("larvikite_cobblestone",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLUE_TERRACOTTA).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> LARVIKITE_COBBLESTONE_STAIRS = BLOCKS.register("larvikite_cobblestone_stairs",
        () -> new CustomStairsBlock(() -> LARVIKITE.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.BLUE_TERRACOTTA).hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> LARVIKITE_COBBLESTONE_SLAB = BLOCKS.register("larvikite_cobblestone_slab",
        () -> new CustomSlabBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLUE_TERRACOTTA).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomWallBlock> LARVIKITE_COBBLESTONE_WALL = BLOCKS.register("larvikite_cobblestone_wall",
        () -> new CustomWallBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLUE_TERRACOTTA).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> LARVIKITE_COBBLESTONE_PRESSURE_PLATE = BLOCKS.register("larvikite_cobblestone_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.BLUE_TERRACOTTA).doesNotBlockMovement().hardnessAndResistance(1.5F,
            6.0F).sound(SoundType.STONE), ToolType.PICKAXE));

    public static final RegistryObject<CustomBlock> LARVIKITE_BRICKS = BLOCKS.register("larvikite_bricks",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLUE_TERRACOTTA).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> LARVIKITE_BRICKS_STAIRS = BLOCKS.register("larvikite_bricks_stairs",
        () -> new CustomStairsBlock(() -> LARVIKITE.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.BLUE_TERRACOTTA).hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> LARVIKITE_BRICKS_SLAB = BLOCKS.register("larvikite_bricks_slab",
        () -> new CustomSlabBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLUE_TERRACOTTA).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomWallBlock> LARVIKITE_BRICKS_WALL = BLOCKS.register("larvikite_bricks_wall",
        () -> new CustomWallBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLUE_TERRACOTTA).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> LARVIKITE_BRICKS_PRESSURE_PLATE = BLOCKS.register("larvikite_bricks_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.BLUE_TERRACOTTA).doesNotBlockMovement().hardnessAndResistance(1.5F,
            6.0F).sound(SoundType.STONE), ToolType.PICKAXE));

    public static final RegistryObject<CustomBlock> LARVIKITE_LARGE_BRICKS = BLOCKS.register("larvikite_large_bricks",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLUE_TERRACOTTA).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> LARVIKITE_LARGE_BRICKS_STAIRS = BLOCKS.register("larvikite_large_bricks_stairs",
        () -> new CustomStairsBlock(() -> LARVIKITE.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.BLUE_TERRACOTTA).hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> LARVIKITE_LARGE_BRICKS_SLAB = BLOCKS.register("larvikite_large_bricks_slab",
        () -> new CustomSlabBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLUE_TERRACOTTA).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomWallBlock> LARVIKITE_LARGE_BRICKS_WALL = BLOCKS.register("larvikite_large_bricks_wall",
        () -> new CustomWallBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLUE_TERRACOTTA).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> LARVIKITE_LARGE_BRICKS_PRESSURE_PLATE = BLOCKS.register("larvikite_large_bricks_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.BLUE_TERRACOTTA).doesNotBlockMovement().hardnessAndResistance(1.5F,
            6.0F).sound(SoundType.STONE), ToolType.PICKAXE));

    public static void init()
    {
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}
