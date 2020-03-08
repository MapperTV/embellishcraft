package tv.mapper.embellishcraft.block;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

import org.apache.commons.lang3.tuple.Pair;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.PressurePlateBlock;
import net.minecraft.block.RotatedPillarBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.item.DyeColor;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import tv.mapper.embellishcraft.ECConstants;
import tv.mapper.embellishcraft.init.ModTileEntityTypes;
import tv.mapper.embellishcraft.util.CustomChestType;
import tv.mapper.embellishcraft.util.McWoods;
import tv.mapper.embellishcraft.util.RockType;
import tv.mapper.embellishcraft.util.WoodsType;
import tv.mapper.mapperbase.block.AllRotationBlock;
import tv.mapper.mapperbase.block.CustomBlock;
import tv.mapper.mapperbase.block.CustomButtonBlock;
import tv.mapper.mapperbase.block.CustomDoorBlock;
import tv.mapper.mapperbase.block.CustomLadderBlock;
import tv.mapper.mapperbase.block.CustomPressurePlateBlock;
import tv.mapper.mapperbase.block.CustomSlabBlock;
import tv.mapper.mapperbase.block.CustomStairsBlock;
import tv.mapper.mapperbase.block.CustomWallBlock;
import tv.mapper.mapperbase.block.UpDownBlock;

public class ECBlockRegistry
{
    private static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, ECConstants.MODID);

    // Rocks
    public static final Map<RockType, RegistryObject<CustomBlock>> ROCK_BLOCKS = Arrays.stream(RockType.values()).map(type -> Pair.of(type,
        BLOCKS.register(type.getName(), () -> new CustomBlock(Block.Properties.create(Material.ROCK, type.getColor()).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE)))).collect(
            Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<CustomStairsBlock>> ROCK_STAIRS = Arrays.stream(RockType.values()).map(type -> Pair.of(type,
        BLOCKS.register(type.getName() + "_stairs",
            () -> new CustomStairsBlock(() -> ROCK_BLOCKS.get(type).get().getDefaultState(), Block.Properties.create(Material.ROCK, type.getColor()).hardnessAndResistance(1.5F, 6.0F).sound(
                SoundType.STONE), ToolType.PICKAXE)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<CustomSlabBlock>> ROCK_SLABS = Arrays.stream(RockType.values()).map(type -> Pair.of(type,
        BLOCKS.register(type.getName() + "_slab",
            () -> new CustomSlabBlock(Block.Properties.create(Material.ROCK, type.getColor()).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE)))).collect(
                Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<CustomWallBlock>> ROCK_WALLS = Arrays.stream(RockType.values()).map(type -> Pair.of(type,
        BLOCKS.register(type.getName() + "_wall",
            () -> new CustomWallBlock(Block.Properties.create(Material.ROCK, type.getColor()).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE)))).collect(
                Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<CustomPressurePlateBlock>> ROCK_PRESSURE_PLATES = Arrays.stream(RockType.values()).map(type -> Pair.of(type,
        BLOCKS.register(type.getName() + "_pressure_plate",
            () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, type.getColor()).hardnessAndResistance(1.5F, 6.0F).sound(
                SoundType.STONE), ToolType.PICKAXE)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<CustomButtonBlock>> ROCK_BUTTONS = Arrays.stream(RockType.values()).map(type -> Pair.of(type,
        BLOCKS.register(type.getName() + "_button",
            () -> new CustomButtonBlock(false, Block.Properties.create(Material.ROCK, type.getColor()).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE))))).collect(
                Collectors.toMap(Pair::getKey, Pair::getValue));

    // Cobblestones
    public static final Map<RockType, RegistryObject<CustomBlock>> ROCK_COBBLESTONES = Arrays.stream(RockType.values()).map(type -> Pair.of(type,
        BLOCKS.register(type.getName() + "_cobblestone",
            () -> new CustomBlock(Block.Properties.create(Material.ROCK, type.getColor()).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE)))).collect(
                Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<CustomStairsBlock>> ROCK_COBBLESTONE_STAIRS = Arrays.stream(RockType.values()).map(type -> Pair.of(type,
        BLOCKS.register(type.getName() + "_cobblestone_stairs",
            () -> new CustomStairsBlock(() -> ROCK_COBBLESTONES.get(type).get().getDefaultState(), Block.Properties.create(Material.ROCK, type.getColor()).hardnessAndResistance(1.5F, 6.0F).sound(
                SoundType.STONE), ToolType.PICKAXE)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<CustomSlabBlock>> ROCK_COBBLESTONE_SLABS = Arrays.stream(RockType.values()).map(type -> Pair.of(type,
        BLOCKS.register(type.getName() + "_cobblestone_slab",
            () -> new CustomSlabBlock(Block.Properties.create(Material.ROCK, type.getColor()).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE)))).collect(
                Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<CustomWallBlock>> ROCK_COBBLESTONE_WALLS = Arrays.stream(RockType.values()).map(type -> Pair.of(type,
        BLOCKS.register(type.getName() + "_cobblestone_wall",
            () -> new CustomWallBlock(Block.Properties.create(Material.ROCK, type.getColor()).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE)))).collect(
                Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<CustomPressurePlateBlock>> ROCK_COBBLESTONE_PRESSURE_PLATES = Arrays.stream(RockType.values()).map(type -> Pair.of(type,
        BLOCKS.register(type.getName() + "_cobblestone_pressure_plate",
            () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, type.getColor()).hardnessAndResistance(1.5F, 6.0F).sound(
                SoundType.STONE), ToolType.PICKAXE)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    // Smooth rocks
    public static final Map<RockType, RegistryObject<CustomBlock>> SMOOTH_ROCK_BLOCKS = Arrays.stream(RockType.values()).map(type -> Pair.of(type,
        BLOCKS.register("smooth_" + type.getName(),
            () -> new CustomBlock(Block.Properties.create(Material.ROCK, type.getColor()).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE)))).collect(
                Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<CustomStairsBlock>> SMOOTH_ROCK_STAIRS = Arrays.stream(RockType.values()).map(type -> Pair.of(type,
        BLOCKS.register("smooth_" + type.getName() + "_stairs",
            () -> new CustomStairsBlock(() -> SMOOTH_ROCK_BLOCKS.get(type).get().getDefaultState(), Block.Properties.create(Material.ROCK, type.getColor()).hardnessAndResistance(1.5F, 6.0F).sound(
                SoundType.STONE), ToolType.PICKAXE)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<CustomSlabBlock>> SMOOTH_ROCK_SLABS = Arrays.stream(RockType.values()).map(type -> Pair.of(type,
        BLOCKS.register("smooth_" + type.getName() + "_slab",
            () -> new CustomSlabBlock(Block.Properties.create(Material.ROCK, type.getColor()).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE)))).collect(
                Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<CustomWallBlock>> SMOOTH_ROCK_WALLS = Arrays.stream(RockType.values()).map(type -> Pair.of(type,
        BLOCKS.register("smooth_" + type.getName() + "_wall",
            () -> new CustomWallBlock(Block.Properties.create(Material.ROCK, type.getColor()).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE)))).collect(
                Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<CustomPressurePlateBlock>> SMOOTH_ROCK_PRESSURE_PLATES = Arrays.stream(RockType.values()).map(type -> Pair.of(type,
        BLOCKS.register("smooth_" + type.getName() + "_pressure_plate",
            () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, type.getColor()).hardnessAndResistance(1.5F, 6.0F).sound(
                SoundType.STONE), ToolType.PICKAXE)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    // Polished rocks
    public static final Map<RockType, RegistryObject<CustomBlock>> POLISHED_ROCK_BLOCKS = Arrays.stream(RockType.values()).map(type -> Pair.of(type,
        BLOCKS.register("polished_" + type.getName(),
            () -> new CustomBlock(Block.Properties.create(Material.ROCK, type.getColor()).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE)))).collect(
                Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<CustomStairsBlock>> POLISHED_ROCK_STAIRS = Arrays.stream(RockType.values()).map(type -> Pair.of(type,
        BLOCKS.register("polished_" + type.getName() + "_stairs",
            () -> new CustomStairsBlock(() -> POLISHED_ROCK_BLOCKS.get(type).get().getDefaultState(), Block.Properties.create(Material.ROCK, type.getColor()).hardnessAndResistance(1.5F, 6.0F).sound(
                SoundType.STONE), ToolType.PICKAXE)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<CustomSlabBlock>> POLISHED_ROCK_SLABS = Arrays.stream(RockType.values()).map(type -> Pair.of(type,
        BLOCKS.register("polished_" + type.getName() + "_slab",
            () -> new CustomSlabBlock(Block.Properties.create(Material.ROCK, type.getColor()).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE)))).collect(
                Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<CustomWallBlock>> POLISHED_ROCK_WALLS = Arrays.stream(RockType.values()).map(type -> Pair.of(type,
        BLOCKS.register("polished_" + type.getName() + "_wall",
            () -> new CustomWallBlock(Block.Properties.create(Material.ROCK, type.getColor()).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE)))).collect(
                Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<CustomPressurePlateBlock>> POLISHED_ROCK_PRESSURE_PLATES = Arrays.stream(RockType.values()).map(type -> Pair.of(type,
        BLOCKS.register("polished_" + type.getName() + "_pressure_plate",
            () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, type.getColor()).hardnessAndResistance(1.5F, 6.0F).sound(
                SoundType.STONE), ToolType.PICKAXE)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    // Rock pavings
    public static final Map<RockType, RegistryObject<CustomBlock>> ROCK_PAVINGS = Arrays.stream(RockType.values()).map(type -> Pair.of(type,
        BLOCKS.register(type.getName() + "_paving",
            () -> new CustomBlock(Block.Properties.create(Material.ROCK, type.getColor()).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE)))).collect(
                Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<CustomStairsBlock>> ROCK_PAVING_STAIRS = Arrays.stream(RockType.values()).map(type -> Pair.of(type,
        BLOCKS.register(type.getName() + "_paving_stairs",
            () -> new CustomStairsBlock(() -> ROCK_PAVINGS.get(type).get().getDefaultState(), Block.Properties.create(Material.ROCK, type.getColor()).hardnessAndResistance(1.5F, 6.0F).sound(
                SoundType.STONE), ToolType.PICKAXE)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<CustomSlabBlock>> ROCK_PAVING_SLABS = Arrays.stream(RockType.values()).map(type -> Pair.of(type,
        BLOCKS.register(type.getName() + "_paving_slab",
            () -> new CustomSlabBlock(Block.Properties.create(Material.ROCK, type.getColor()).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE)))).collect(
                Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<CustomWallBlock>> ROCK_PAVING_WALLS = Arrays.stream(RockType.values()).map(type -> Pair.of(type,
        BLOCKS.register(type.getName() + "_paving_wall",
            () -> new CustomWallBlock(Block.Properties.create(Material.ROCK, type.getColor()).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE)))).collect(
                Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<CustomPressurePlateBlock>> ROCK_PAVING_PRESSURE_PLATES = Arrays.stream(RockType.values()).map(type -> Pair.of(type,
        BLOCKS.register(type.getName() + "_paving_pressure_plate",
            () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, type.getColor()).hardnessAndResistance(1.5F, 6.0F).sound(
                SoundType.STONE), ToolType.PICKAXE)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    // Rock tiles
    public static final Map<RockType, RegistryObject<CustomBlock>> ROCK_TILES = Arrays.stream(RockType.values()).map(type -> Pair.of(type,
        BLOCKS.register(type.getName() + "_tiles",
            () -> new CustomBlock(Block.Properties.create(Material.ROCK, type.getColor()).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE)))).collect(
                Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<CustomStairsBlock>> ROCK_TILES_STAIRS = Arrays.stream(RockType.values()).map(type -> Pair.of(type,
        BLOCKS.register(type.getName() + "_tiles_stairs",
            () -> new CustomStairsBlock(() -> ROCK_TILES.get(type).get().getDefaultState(), Block.Properties.create(Material.ROCK, type.getColor()).hardnessAndResistance(1.5F, 6.0F).sound(
                SoundType.STONE), ToolType.PICKAXE)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<CustomSlabBlock>> ROCK_TILES_SLABS = Arrays.stream(RockType.values()).map(type -> Pair.of(type,
        BLOCKS.register(type.getName() + "_tiles_slab",
            () -> new CustomSlabBlock(Block.Properties.create(Material.ROCK, type.getColor()).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE)))).collect(
                Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<CustomWallBlock>> ROCK_TILES_WALLS = Arrays.stream(RockType.values()).map(type -> Pair.of(type,
        BLOCKS.register(type.getName() + "_tiles_wall",
            () -> new CustomWallBlock(Block.Properties.create(Material.ROCK, type.getColor()).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE)))).collect(
                Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<CustomPressurePlateBlock>> ROCK_TILES_PRESSURE_PLATES = Arrays.stream(RockType.values()).map(type -> Pair.of(type,
        BLOCKS.register(type.getName() + "_tiles_pressure_plate",
            () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, type.getColor()).hardnessAndResistance(1.5F, 6.0F).sound(
                SoundType.STONE), ToolType.PICKAXE)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    // Rock bricks
    public static final Map<RockType, RegistryObject<CustomBlock>> ROCK_BRICKS = Arrays.stream(RockType.values()).map(type -> Pair.of(type,
        BLOCKS.register(type.getName() + "_bricks",
            () -> new CustomBlock(Block.Properties.create(Material.ROCK, type.getColor()).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE)))).collect(
                Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<CustomStairsBlock>> ROCK_BRICKS_STAIRS = Arrays.stream(RockType.values()).map(type -> Pair.of(type,
        BLOCKS.register(type.getName() + "_bricks_stairs",
            () -> new CustomStairsBlock(() -> ROCK_BRICKS.get(type).get().getDefaultState(), Block.Properties.create(Material.ROCK, type.getColor()).hardnessAndResistance(1.5F, 6.0F).sound(
                SoundType.STONE), ToolType.PICKAXE)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<CustomSlabBlock>> ROCK_BRICKS_SLABS = Arrays.stream(RockType.values()).map(type -> Pair.of(type,
        BLOCKS.register(type.getName() + "_bricks_slab",
            () -> new CustomSlabBlock(Block.Properties.create(Material.ROCK, type.getColor()).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE)))).collect(
                Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<CustomWallBlock>> ROCK_BRICKS_WALLS = Arrays.stream(RockType.values()).map(type -> Pair.of(type,
        BLOCKS.register(type.getName() + "_bricks_wall",
            () -> new CustomWallBlock(Block.Properties.create(Material.ROCK, type.getColor()).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE)))).collect(
                Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<CustomPressurePlateBlock>> ROCK_BRICKS_PRESSURE_PLATES = Arrays.stream(RockType.values()).map(type -> Pair.of(type,
        BLOCKS.register(type.getName() + "_bricks_pressure_plate",
            () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, type.getColor()).hardnessAndResistance(1.5F, 6.0F).sound(
                SoundType.STONE), ToolType.PICKAXE)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    // Rock large bricks
    public static final Map<RockType, RegistryObject<CustomBlock>> ROCK_LARGE_BRICKS = Arrays.stream(RockType.values()).map(type -> Pair.of(type,
        BLOCKS.register(type.getName() + "_large_bricks",
            () -> new CustomBlock(Block.Properties.create(Material.ROCK, type.getColor()).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE)))).collect(
                Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<CustomStairsBlock>> ROCK_LARGE_BRICKS_STAIRS = Arrays.stream(RockType.values()).map(type -> Pair.of(type,
        BLOCKS.register(type.getName() + "_large_bricks_stairs",
            () -> new CustomStairsBlock(() -> ROCK_LARGE_BRICKS.get(type).get().getDefaultState(), Block.Properties.create(Material.ROCK, type.getColor()).hardnessAndResistance(1.5F, 6.0F).sound(
                SoundType.STONE), ToolType.PICKAXE)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<CustomSlabBlock>> ROCK_LARGE_BRICKS_SLABS = Arrays.stream(RockType.values()).map(type -> Pair.of(type,
        BLOCKS.register(type.getName() + "_large_bricks_slab",
            () -> new CustomSlabBlock(Block.Properties.create(Material.ROCK, type.getColor()).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE)))).collect(
                Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<CustomWallBlock>> ROCK_LARGE_BRICKS_WALLS = Arrays.stream(RockType.values()).map(type -> Pair.of(type,
        BLOCKS.register(type.getName() + "_large_bricks_wall",
            () -> new CustomWallBlock(Block.Properties.create(Material.ROCK, type.getColor()).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE)))).collect(
                Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<CustomPressurePlateBlock>> ROCK_LARGE_BRICKS_PRESSURE_PLATES = Arrays.stream(RockType.values()).map(type -> Pair.of(type,
        BLOCKS.register(type.getName() + "_large_bricks_pressure_plate",
            () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, type.getColor()).hardnessAndResistance(1.5F, 6.0F).sound(
                SoundType.STONE), ToolType.PICKAXE)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    // Rock ornaments
    public static final Map<RockType, RegistryObject<CustomBlock>> ROCK_ORNAMENTS = Arrays.stream(RockType.values()).map(type -> Pair.of(type,
        BLOCKS.register(type.getName() + "_ornament",
            () -> new CustomBlock(Block.Properties.create(Material.ROCK, type.getColor()).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE)))).collect(
                Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<CustomPressurePlateBlock>> ROCK_ORNAMENT_PRESSURE_PLATES = Arrays.stream(RockType.values()).map(type -> Pair.of(type,
        BLOCKS.register(type.getName() + "_ornament_pressure_plate",
            () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, type.getColor()).hardnessAndResistance(1.5F, 6.0F).sound(
                SoundType.STONE), ToolType.PICKAXE)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

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
    public static final Map<DyeColor, RegistryObject<CustomBlock>> CORRUGATED_METAL_PLATE_BLOCKS = Arrays.stream(DyeColor.values()).map(type -> Pair.of(type,
        BLOCKS.register(type.getName() + "_corrugated_metal_plate",
            () -> new CustomBlock(Block.Properties.create(Material.IRON, type.getMapColor()).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.METAL), ToolType.PICKAXE)))).collect(
                Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<DyeColor, RegistryObject<CustomStairsBlock>> CORRUGATED_METAL_PLATE_STAIRS = Arrays.stream(DyeColor.values()).map(type -> Pair.of(type, BLOCKS.register(
        type.getName() + "_corrugated_metal_plate_stairs",
        () -> new CustomStairsBlock(() -> CORRUGATED_METAL_PLATE_BLOCKS.get(type).get().getDefaultState(), Block.Properties.create(Material.IRON, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.METAL), ToolType.PICKAXE)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<DyeColor, RegistryObject<CustomSlabBlock>> CORRUGATED_METAL_PLATE_SLABS = Arrays.stream(DyeColor.values()).map(type -> Pair.of(type,
        BLOCKS.register(type.getName() + "_corrugated_metal_plate_slab",
            () -> new CustomSlabBlock(Block.Properties.create(Material.IRON, type.getMapColor()).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.METAL), ToolType.PICKAXE)))).collect(
                Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<DyeColor, RegistryObject<CustomWallBlock>> CORRUGATED_METAL_PLATE_WALLS = Arrays.stream(DyeColor.values()).map(type -> Pair.of(type,
        BLOCKS.register(type.getName() + "_corrugated_metal_plate_wall",
            () -> new CustomWallBlock(Block.Properties.create(Material.IRON, type.getMapColor()).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.METAL), ToolType.PICKAXE)))).collect(
                Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<DyeColor, RegistryObject<CustomPressurePlateBlock>> CORRUGATED_METAL_PLATE_PRESSURE_PLATES = Arrays.stream(DyeColor.values()).map(type -> Pair.of(type,
        BLOCKS.register(type.getName() + "_corrugated_metal_plate_pressure_plate",
            () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.IRON, type.getMapColor()).hardnessAndResistance(1.5F, 6.0F).sound(
                SoundType.METAL), ToolType.PICKAXE)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    // Metal blocks
    public static final RegistryObject<CustomBlock> DARK_METAL_FLOOR = BLOCKS.register("dark_metal_floor",
        () -> new CustomBlock(Block.Properties.create(Material.IRON, MaterialColor.OBSIDIAN).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.LANTERN), ToolType.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> DARK_METAL_FLOOR_STAIRS = BLOCKS.register("dark_metal_floor_stairs",
        () -> new CustomStairsBlock(() -> DARK_METAL_FLOOR.get().getDefaultState(), Block.Properties.create(Material.IRON, MaterialColor.OBSIDIAN).hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.LANTERN), ToolType.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> DARK_METAL_FLOOR_SLAB = BLOCKS.register("dark_metal_floor_slab",
        () -> new CustomSlabBlock(Block.Properties.create(Material.IRON, MaterialColor.OBSIDIAN).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.LANTERN), ToolType.PICKAXE));
    public static final RegistryObject<CustomWallBlock> DARK_METAL_FLOOR_WALL = BLOCKS.register("dark_metal_floor_wall",
        () -> new CustomWallBlock(Block.Properties.create(Material.IRON, MaterialColor.OBSIDIAN).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.LANTERN), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> DARK_METAL_FLOOR_PRESSURE_PLATE = BLOCKS.register("dark_metal_floor_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.IRON, MaterialColor.OBSIDIAN).doesNotBlockMovement().hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.LANTERN), ToolType.PICKAXE));

    public static final RegistryObject<CustomBlock> LIGHT_METAL_FLOOR = BLOCKS.register("light_metal_floor",
        () -> new CustomBlock(Block.Properties.create(Material.IRON, MaterialColor.CLAY).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.LANTERN), ToolType.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> LIGHT_METAL_FLOOR_STAIRS = BLOCKS.register("light_metal_floor_stairs",
        () -> new CustomStairsBlock(() -> LIGHT_METAL_FLOOR.get().getDefaultState(), Block.Properties.create(Material.IRON, MaterialColor.CLAY).hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.LANTERN), ToolType.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> LIGHT_METAL_FLOOR_SLAB = BLOCKS.register("light_metal_floor_slab",
        () -> new CustomSlabBlock(Block.Properties.create(Material.IRON, MaterialColor.CLAY).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.LANTERN), ToolType.PICKAXE));
    public static final RegistryObject<CustomWallBlock> LIGHT_METAL_FLOOR_WALL = BLOCKS.register("light_metal_floor_wall",
        () -> new CustomWallBlock(Block.Properties.create(Material.IRON, MaterialColor.CLAY).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.LANTERN), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> LIGHT_METAL_FLOOR_PRESSURE_PLATE = BLOCKS.register("light_metal_floor_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.IRON, MaterialColor.CLAY).doesNotBlockMovement().hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.LANTERN), ToolType.PICKAXE));

    public static final RegistryObject<CustomBlock> RUSTY_PLATE = BLOCKS.register("rusty_plate",
        () -> new CustomBlock(Block.Properties.create(Material.IRON, MaterialColor.ORANGE_TERRACOTTA).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.LANTERN), ToolType.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> RUSTY_PLATE_STAIRS = BLOCKS.register("rusty_plate_stairs",
        () -> new CustomStairsBlock(() -> RUSTY_PLATE.get().getDefaultState(), Block.Properties.create(Material.IRON, MaterialColor.ORANGE_TERRACOTTA).hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.LANTERN), ToolType.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> RUSTY_PLATE_SLAB = BLOCKS.register("rusty_plate_slab",
        () -> new CustomSlabBlock(Block.Properties.create(Material.IRON, MaterialColor.ORANGE_TERRACOTTA).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.LANTERN), ToolType.PICKAXE));
    public static final RegistryObject<CustomWallBlock> RUSTY_PLATE_WALL = BLOCKS.register("rusty_plate_wall",
        () -> new CustomWallBlock(Block.Properties.create(Material.IRON, MaterialColor.ORANGE_TERRACOTTA).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.LANTERN), ToolType.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> RUSTY_PLATE_PRESSURE_PLATE = BLOCKS.register("rusty_plate_pressure_plate",
        () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.IRON, MaterialColor.ORANGE_TERRACOTTA).doesNotBlockMovement().hardnessAndResistance(1.5F,
            6.0F).sound(SoundType.LANTERN), ToolType.PICKAXE));

    public static final RegistryObject<RotatedPillarBlock> IRON_BEAM = BLOCKS.register("iron_beam",
        () -> new RotatedPillarBlock(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(0.8F).sound(SoundType.LANTERN)));
    public static final RegistryObject<RotatedPillarBlock> BOLTED_IRON_BEAM = BLOCKS.register("bolted_iron_beam",
        () -> new RotatedPillarBlock(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(0.8F).sound(SoundType.LANTERN)));
    public static final RegistryObject<CustomBlock> IRON_BEAM_JUNCTION = BLOCKS.register("iron_beam_junction",
        () -> new CustomBlock(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(0.8F).sound(SoundType.LANTERN), ToolType.PICKAXE));

    public static final RegistryObject<RotatedPillarBlock> STEEL_BEAM = BLOCKS.register("steel_beam",
        () -> new RotatedPillarBlock(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(0.8F).sound(SoundType.LANTERN)));
    public static final RegistryObject<RotatedPillarBlock> BOLTED_STEEL_BEAM = BLOCKS.register("bolted_steel_beam",
        () -> new RotatedPillarBlock(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(0.8F).sound(SoundType.LANTERN)));
    public static final RegistryObject<CustomBlock> STEEL_BEAM_JUNCTION = BLOCKS.register("steel_beam_junction",
        () -> new CustomBlock(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(0.8F).sound(SoundType.LANTERN), ToolType.PICKAXE));

    public static final RegistryObject<CustomBlock> AIR_DUCT = BLOCKS.register("air_duct",
        () -> new CustomBlock(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(0.8F).sound(SoundType.LANTERN), ToolType.PICKAXE));
    public static final RegistryObject<AllRotationBlock> VENT_AIR_DUCT = BLOCKS.register("vent_air_duct",
        () -> new AllRotationBlock(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(0.8F).sound(SoundType.LANTERN), ToolType.PICKAXE));
    public static final RegistryObject<AllRotationBlock> GRID_AIR_DUCT = BLOCKS.register("grid_air_duct",
        () -> new AllRotationBlock(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(0.8F).sound(SoundType.LANTERN), ToolType.PICKAXE));

    public static final RegistryObject<CustomBlock> BULKHEAD = BLOCKS.register("bulkhead",
        () -> new CustomBlock(Block.Properties.create(Material.IRON, MaterialColor.STONE).hardnessAndResistance(0.8F).sound(SoundType.METAL), ToolType.PICKAXE));
    public static final RegistryObject<CustomBlock> BULKHEAD_TOP = BLOCKS.register("bulkhead_top",
        () -> new CustomBlock(Block.Properties.create(Material.IRON, MaterialColor.STONE).hardnessAndResistance(0.8F).sound(SoundType.METAL), ToolType.PICKAXE));

    public static final RegistryObject<CustomLadderBlock> STEEL_WALL_LADDER = BLOCKS.register("steel_wall_ladder",
        () -> new CustomLadderBlock(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(0.8F).sound(SoundType.METAL).notSolid(), ToolType.PICKAXE));
    public static final RegistryObject<CustomLadderBlock> RUSTY_WALL_LADDER = BLOCKS.register("rusty_wall_ladder",
        () -> new CustomLadderBlock(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(0.8F).sound(SoundType.METAL).notSolid(), ToolType.PICKAXE));
    public static final RegistryObject<CustomLadderBlock> STEEL_RUNGS = BLOCKS.register("steel_rungs",
        () -> new CustomLadderBlock(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(0.8F).sound(SoundType.METAL).notSolid(), ToolType.PICKAXE));
    public static final RegistryObject<CustomLadderBlock> RUSTY_RUNGS = BLOCKS.register("rusty_rungs",
        () -> new CustomLadderBlock(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(0.8F).sound(SoundType.METAL).notSolid(), ToolType.PICKAXE));

    // Wallpapers
    public static final RegistryObject<CustomBlock> WHITE_BLUE_WALLPAPER = BLOCKS.register("white_blue_wallpaper",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> WHITE_BLUE_WALLPAPER_STAIRS = BLOCKS.register("white_blue_wallpaper_stairs",
        () -> new CustomStairsBlock(() -> WHITE_BLUE_WALLPAPER.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> WHITE_BLUE_WALLPAPER_SLAB = BLOCKS.register("white_blue_wallpaper_slab",
        () -> new CustomSlabBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<UpDownBlock> WHITE_BLUE_WALLPAPER_PLINTH = BLOCKS.register("white_blue_wallpaper_plinth",
        () -> new UpDownBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));

    public static final RegistryObject<CustomBlock> BEIGE_FLOWER_WALLPAPER = BLOCKS.register("beige_flower_wallpaper",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> BEIGE_FLOWER_WALLPAPER_STAIRS = BLOCKS.register("beige_flower_wallpaper_stairs",
        () -> new CustomStairsBlock(() -> BEIGE_FLOWER_WALLPAPER.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> BEIGE_FLOWER_WALLPAPER_SLAB = BLOCKS.register("beige_flower_wallpaper_slab",
        () -> new CustomSlabBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<UpDownBlock> BEIGE_FLOWER_WALLPAPER_PLINTH = BLOCKS.register("beige_flower_wallpaper_plinth",
        () -> new UpDownBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));

    public static final RegistryObject<CustomBlock> BEIGE_WALLPAPER = BLOCKS.register("beige_wallpaper",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> BEIGE_WALLPAPER_STAIRS = BLOCKS.register("beige_wallpaper_stairs",
        () -> new CustomStairsBlock(() -> BEIGE_WALLPAPER.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> BEIGE_WALLPAPER_SLAB = BLOCKS.register("beige_wallpaper_slab",
        () -> new CustomSlabBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<UpDownBlock> BEIGE_WALLPAPER_PLINTH = BLOCKS.register("beige_wallpaper_plinth",
        () -> new UpDownBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));

    public static final RegistryObject<CustomBlock> PINK_WALLPAPER = BLOCKS.register("pink_wallpaper",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> PINK_WALLPAPER_STAIRS = BLOCKS.register("pink_wallpaper_stairs",
        () -> new CustomStairsBlock(() -> PINK_WALLPAPER.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> PINK_WALLPAPER_SLAB = BLOCKS.register("pink_wallpaper_slab",
        () -> new CustomSlabBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<UpDownBlock> PINK_WALLPAPER_PLINTH = BLOCKS.register("pink_wallpaper_plinth",
        () -> new UpDownBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));

    public static final RegistryObject<CustomBlock> WHITE_GREEN_WALLPAPER = BLOCKS.register("white_green_wallpaper",
        () -> new CustomBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> WHITE_GREEN_WALLPAPER_STAIRS = BLOCKS.register("white_green_wallpaper_stairs",
        () -> new CustomStairsBlock(() -> WHITE_GREEN_WALLPAPER.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(
            SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> WHITE_GREEN_WALLPAPER_SLAB = BLOCKS.register("white_green_wallpaper_slab",
        () -> new CustomSlabBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));
    public static final RegistryObject<UpDownBlock> WHITE_GREEN_WALLPAPER_PLINTH = BLOCKS.register("white_green_wallpaper_plinth",
        () -> new UpDownBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE), ToolType.PICKAXE));

    // Furniture
    public static final Map<McWoods, RegistryObject<ChairBlock>> CHAIR_BLOCKS = Arrays.stream(McWoods.values()).map(type -> Pair.of(type,
        BLOCKS.register(type.getName() + "_chair",
            () -> new ChairBlock(Block.Properties.create(Material.WOOD, MaterialColor.WOOD).hardnessAndResistance(0.75F, 0.5F).sound(SoundType.WOOD), ToolType.AXE)))).collect(
                Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<McWoods, RegistryObject<TerraceChairBlock>> TERRACE_CHAIR_BLOCKS = Arrays.stream(McWoods.values()).map(type -> Pair.of(type,
        BLOCKS.register(type.getName() + "_terrace_chair",
            () -> new TerraceChairBlock(Block.Properties.create(Material.WOOD, MaterialColor.WOOD).hardnessAndResistance(0.75F, 0.5F).sound(SoundType.WOOD), ToolType.AXE)))).collect(
                Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<McWoods, RegistryObject<TableBlock>> TABLE_BLOCKS = Arrays.stream(McWoods.values()).map(type -> Pair.of(type,
        BLOCKS.register(type.getName() + "_table",
            () -> new TableBlock(Block.Properties.create(Material.WOOD, MaterialColor.WOOD).hardnessAndResistance(0.75F, 0.5F).sound(SoundType.WOOD), ToolType.AXE)))).collect(
                Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<McWoods, RegistryObject<FancyTableBlock>> FANCY_TABLE_BLOCKS = Arrays.stream(McWoods.values()).map(type -> Pair.of(type,
        BLOCKS.register(type.getName() + "_fancy_table",
            () -> new FancyTableBlock(Block.Properties.create(Material.WOOD, MaterialColor.WOOD).hardnessAndResistance(0.75F, 0.5F).sound(SoundType.WOOD), ToolType.AXE)))).collect(
                Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<McWoods, RegistryObject<TerraceTableBlock>> TERRACE_TABLE_BLOCKS = Arrays.stream(McWoods.values()).map(type -> Pair.of(type,
        BLOCKS.register(type.getName() + "_terrace_table",
            () -> new TerraceTableBlock(Block.Properties.create(Material.WOOD, MaterialColor.WOOD).hardnessAndResistance(0.75F, 0.5F).sound(SoundType.WOOD), ToolType.AXE)))).collect(
                Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final RegistryObject<TerraceTableBlock> STEEL_TERRACE_TABLE = BLOCKS.register("steel_terrace_table",
        () -> new TerraceTableBlock(Block.Properties.create(Material.IRON, MaterialColor.GRAY).hardnessAndResistance(0.75F, 0.5F).sound(SoundType.LANTERN), ToolType.PICKAXE));

    public static final RegistryObject<TerraceChairBlock> STEEL_TERRACE_CHAIR = BLOCKS.register("steel_terrace_chair",
        () -> new TerraceChairBlock(Block.Properties.create(Material.IRON, MaterialColor.GRAY).hardnessAndResistance(0.75F, 0.5F).sound(SoundType.LANTERN), ToolType.PICKAXE));

    public static final Map<DyeColor, RegistryObject<CouchBlock>> COUCH_BLOCKS = Arrays.stream(DyeColor.values()).map(type -> Pair.of(type,
        BLOCKS.register(type.getName() + "_couch",
            () -> new CouchBlock(Block.Properties.create(Material.IRON, type.getMapColor()).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.METAL), ToolType.PICKAXE)))).collect(
                Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<DyeColor, RegistryObject<LampBlock>> TABLE_LAMP_BLOCKS = Arrays.stream(DyeColor.values()).map(type -> Pair.of(type,
        BLOCKS.register(type.getName() + "_table_lamp",
            () -> new LampBlock(Block.Properties.create(Material.IRON, type.getMapColor()).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.METAL), ToolType.PICKAXE)))).collect(
                Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final RegistryObject<PlateBlock> PLATE = BLOCKS.register("plate",
        () -> new PlateBlock(Block.Properties.create(Material.GLASS, MaterialColor.QUARTZ).hardnessAndResistance(0.25F).sound(SoundType.GLASS)));

    // Stairs
    public static final Map<McWoods, RegistryObject<SuspendedStairsBlock>> SUSPENDED_STAIRS_BLOCKS = Arrays.stream(McWoods.values()).map(type -> Pair.of(type,
        BLOCKS.register(type.getName() + "_suspended_stairs",
            () -> new SuspendedStairsBlock(Block.Properties.create(Material.WOOD, MaterialColor.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD), ToolType.AXE)))).collect(
                Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final RegistryObject<SuspendedStairsBlock> STEEL_SUSPENDED_STAIRS = BLOCKS.register("steel_suspended_stairs",
        () -> new SuspendedStairsBlock(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(3.0F).sound(SoundType.LANTERN), ToolType.PICKAXE));
    public static final RegistryObject<SuspendedStairsBlock> RUSTY_SUSPENDED_STAIRS = BLOCKS.register("rusty_suspended_stairs",
        () -> new SuspendedStairsBlock(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(3.0F).sound(SoundType.LANTERN), ToolType.PICKAXE));

    // Doors
    public static final Map<McWoods, RegistryObject<CustomDoorBlock>> FANCY_DOOR_BLOCKS = Arrays.stream(McWoods.values()).map(type -> Pair.of(type,
        BLOCKS.register(type.getName() + "_fancy_door",
            () -> new CustomDoorBlock(Block.Properties.create(Material.WOOD, MaterialColor.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD), ToolType.AXE)))).collect(
                Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final RegistryObject<CustomDoorBlock> STEEL_DOOR = BLOCKS.register("steel_door",
        () -> new CustomDoorBlock(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(3.0F).sound(SoundType.LANTERN), ToolType.PICKAXE));
    public static final RegistryObject<CustomDoorBlock> STURDY_STEEL_DOOR = BLOCKS.register("sturdy_steel_door",
        () -> new CustomDoorBlock(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(5.0F).sound(SoundType.LANTERN), ToolType.PICKAXE));
    public static final RegistryObject<CustomDoorBlock> WARNING_STEEL_DOOR = BLOCKS.register("warning_steel_door",
        () -> new CustomDoorBlock(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(3.0F).sound(SoundType.LANTERN), ToolType.PICKAXE));
    public static final RegistryObject<CustomDoorBlock> WHITE_STEEL_DOOR = BLOCKS.register("white_steel_door",
        () -> new CustomDoorBlock(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(3.0F).sound(SoundType.LANTERN), ToolType.PICKAXE));
    public static final RegistryObject<CustomDoorBlock> STURDY_WHITE_STEEL_DOOR = BLOCKS.register("sturdy_white_steel_door",
        () -> new CustomDoorBlock(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(5.0F).sound(SoundType.LANTERN), ToolType.PICKAXE));
    public static final RegistryObject<CustomDoorBlock> WARNING_WHITE_STEEL_DOOR = BLOCKS.register("warning_white_steel_door",
        () -> new CustomDoorBlock(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(3.0F).sound(SoundType.LANTERN), ToolType.PICKAXE));
    public static final RegistryObject<CustomDoorBlock> RUSTY_DOOR = BLOCKS.register("rusty_door",
        () -> new CustomDoorBlock(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(3.0F).sound(SoundType.LANTERN), ToolType.PICKAXE));
    public static final RegistryObject<CustomDoorBlock> STURDY_RUSTY_DOOR = BLOCKS.register("sturdy_rusty_door",
        () -> new CustomDoorBlock(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(5.0F).sound(SoundType.LANTERN), ToolType.PICKAXE));
    public static final RegistryObject<CustomDoorBlock> WARNING_RUSTY_DOOR = BLOCKS.register("warning_rusty_door",
        () -> new CustomDoorBlock(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(3.0F).sound(SoundType.LANTERN), ToolType.PICKAXE));

    // Pillows
    public static final Map<DyeColor, RegistryObject<PillowBlock>> PILLOW_BLOCKS = Arrays.stream(DyeColor.values()).map(
        type -> Pair.of(type, BLOCKS.register(type.getName() + "_pillow", () -> new PillowBlock(type, Block.Properties.create(Material.WOOL).hardnessAndResistance(0.25F).sound(SoundType.CLOTH))))).collect(
            Collectors.toMap(Pair::getKey, Pair::getValue));

    // Crates
    public static final Map<McWoods, RegistryObject<CrateBlock>> WOODEN_CRATE_BLOCKS = Arrays.stream(McWoods.values()).map(type -> Pair.of(type,
        BLOCKS.register(type.getName() + "_wooden_crate", () -> new CrateBlock(Block.Properties.create(Material.WOOD, MaterialColor.WOOD).hardnessAndResistance(2.5F).sound(SoundType.WOOD))))).collect(
            Collectors.toMap(Pair::getKey, Pair::getValue));

    // Chests
    public static final Map<McWoods, RegistryObject<CustomChestBlock>> FANCY_CHEST_BLOCKS = Arrays.stream(McWoods.values()).map(type -> Pair.of(type,
        BLOCKS.register(type.getName() + "_fancy_chest", () -> new CustomChestBlock(Block.Properties.create(Material.WOOD, MaterialColor.WOOD).hardnessAndResistance(2.5F).sound(SoundType.WOOD), () ->
        {
            return ModTileEntityTypes.CUSTOM_CHEST;
        }, CustomChestType.OAK_FANCY, WoodsType.byId(type.getId()))))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final RegistryObject<VerticalChestBlock> LOCKER = BLOCKS.register("locker",
        () -> new VerticalChestBlock(Block.Properties.create(Material.IRON).hardnessAndResistance(2.5F).sound(SoundType.METAL)));

    public static void init()
    {
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}