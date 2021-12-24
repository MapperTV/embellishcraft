package tv.mapper.embellishcraft.rocks.world.level.blocks;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

import org.apache.commons.lang3.tuple.Pair;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.PressurePlateBlock;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import tv.mapper.embellishcraft.ECConstants;
import tv.mapper.embellishcraft.EmbellishCraft;
import tv.mapper.embellishcraft.util.RockType;
import tv.mapper.mapperbase.world.level.block.CustomBlock;
import tv.mapper.mapperbase.world.level.block.CustomButtonBlock;
import tv.mapper.mapperbase.world.level.block.CustomPressurePlateBlock;
import tv.mapper.mapperbase.world.level.block.CustomSlabBlock;
import tv.mapper.mapperbase.world.level.block.CustomStairsBlock;
import tv.mapper.mapperbase.world.level.block.CustomWallBlock;
import tv.mapper.mapperbase.world.level.block.ToolTypes;

public class InitRockBlocks
{
    public static final DeferredRegister<Block> ROCK_BLOCK_REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, ECConstants.MODID);

    // Rocks
    public static final Map<RockType, RegistryObject<CustomBlock>> ROCK_BLOCKS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_BLOCK_REGISTRY.register(type.getName(), () -> new CustomBlock(Block.Properties.of(Material.STONE, type.getColor()).strength(1.5F, 6.0F).requiresCorrectToolForDrops().requiresCorrectToolForDrops(), ToolTypes.PICKAXE)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<CustomStairsBlock>> ROCK_STAIRS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_BLOCK_REGISTRY.register(type.getName() + "_stairs", () -> new CustomStairsBlock(() -> ROCK_BLOCKS.get(type).get().defaultBlockState(), Block.Properties.of(Material.STONE, type.getColor()).strength(1.5F, 6.0F).requiresCorrectToolForDrops(), ToolTypes.PICKAXE)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<CustomSlabBlock>> ROCK_SLABS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_BLOCK_REGISTRY.register(type.getName() + "_slab", () -> new CustomSlabBlock(Block.Properties.of(Material.STONE, type.getColor()).strength(1.5F, 6.0F).requiresCorrectToolForDrops(), ToolTypes.PICKAXE)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<CustomWallBlock>> ROCK_WALLS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_BLOCK_REGISTRY.register(type.getName() + "_wall", () -> new CustomWallBlock(Block.Properties.of(Material.STONE, type.getColor()).strength(1.5F, 6.0F).requiresCorrectToolForDrops(), ToolTypes.PICKAXE)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<CustomPressurePlateBlock>> ROCK_PRESSURE_PLATES = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_BLOCK_REGISTRY.register(type.getName() + "_pressure_plate", () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.of(Material.STONE, type.getColor()).strength(1.5F, 6.0F).requiresCorrectToolForDrops(), ToolTypes.PICKAXE)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<CustomButtonBlock>> ROCK_BUTTONS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_BLOCK_REGISTRY.register(type.getName() + "_button", () -> new CustomButtonBlock(false, Block.Properties.of(Material.STONE, type.getColor()).strength(1.5F, 6.0F).requiresCorrectToolForDrops(), ToolTypes.NONE)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    // Cobblestones
    public static final Map<RockType, RegistryObject<CustomBlock>> ROCK_COBBLESTONES = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_BLOCK_REGISTRY.register(type.getName() + "_cobblestone", () -> new CustomBlock(Block.Properties.of(Material.STONE, type.getColor()).strength(1.5F, 6.0F).requiresCorrectToolForDrops(), ToolTypes.PICKAXE)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<CustomStairsBlock>> ROCK_COBBLESTONE_STAIRS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_BLOCK_REGISTRY.register(type.getName() + "_cobblestone_stairs", () -> new CustomStairsBlock(() -> ROCK_COBBLESTONES.get(type).get().defaultBlockState(), Block.Properties.of(Material.STONE, type.getColor()).strength(1.5F, 6.0F).requiresCorrectToolForDrops(), ToolTypes.PICKAXE)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<CustomSlabBlock>> ROCK_COBBLESTONE_SLABS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_BLOCK_REGISTRY.register(type.getName() + "_cobblestone_slab", () -> new CustomSlabBlock(Block.Properties.of(Material.STONE, type.getColor()).strength(1.5F, 6.0F).requiresCorrectToolForDrops(), ToolTypes.PICKAXE)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<CustomWallBlock>> ROCK_COBBLESTONE_WALLS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_BLOCK_REGISTRY.register(type.getName() + "_cobblestone_wall", () -> new CustomWallBlock(Block.Properties.of(Material.STONE, type.getColor()).strength(1.5F, 6.0F).requiresCorrectToolForDrops(), ToolTypes.PICKAXE)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<CustomPressurePlateBlock>> ROCK_COBBLESTONE_PRESSURE_PLATES = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_BLOCK_REGISTRY.register(type.getName() + "_cobblestone_pressure_plate", () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.of(Material.STONE, type.getColor()).strength(1.5F, 6.0F).requiresCorrectToolForDrops(), ToolTypes.PICKAXE)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    // Cobblestones bricks
    public static final Map<RockType, RegistryObject<CustomBlock>> ROCK_COBBLESTONE_BRICKS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_BLOCK_REGISTRY.register(type.getName() + "_cobblestone_bricks", () -> new CustomBlock(Block.Properties.of(Material.STONE, type.getColor()).strength(1.5F, 6.0F).requiresCorrectToolForDrops(), ToolTypes.PICKAXE)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<CustomStairsBlock>> ROCK_COBBLESTONE_BRICKS_STAIRS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_BLOCK_REGISTRY.register(type.getName() + "_cobblestone_bricks_stairs", () -> new CustomStairsBlock(() -> ROCK_COBBLESTONES.get(type).get().defaultBlockState(), Block.Properties.of(Material.STONE, type.getColor()).strength(1.5F, 6.0F).requiresCorrectToolForDrops(), ToolTypes.PICKAXE)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<CustomSlabBlock>> ROCK_COBBLESTONE_BRICKS_SLABS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_BLOCK_REGISTRY.register(type.getName() + "_cobblestone_bricks_slab", () -> new CustomSlabBlock(Block.Properties.of(Material.STONE, type.getColor()).strength(1.5F, 6.0F).requiresCorrectToolForDrops(), ToolTypes.PICKAXE)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<CustomWallBlock>> ROCK_COBBLESTONE_BRICKS_WALLS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_BLOCK_REGISTRY.register(type.getName() + "_cobblestone_bricks_wall", () -> new CustomWallBlock(Block.Properties.of(Material.STONE, type.getColor()).strength(1.5F, 6.0F).requiresCorrectToolForDrops(), ToolTypes.PICKAXE)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<CustomPressurePlateBlock>> ROCK_COBBLESTONE_BRICKS_PRESSURE_PLATES = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_BLOCK_REGISTRY.register(type.getName() + "_cobblestone_bricks_pressure_plate", () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.of(Material.STONE, type.getColor()).strength(1.5F, 6.0F).requiresCorrectToolForDrops(), ToolTypes.PICKAXE)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    // Smooth rocks
    public static final Map<RockType, RegistryObject<CustomBlock>> SMOOTH_ROCK_BLOCKS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_BLOCK_REGISTRY.register("smooth_" + type.getName(), () -> new CustomBlock(Block.Properties.of(Material.STONE, type.getColor()).strength(1.5F, 6.0F).requiresCorrectToolForDrops(), ToolTypes.PICKAXE)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<CustomStairsBlock>> SMOOTH_ROCK_STAIRS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_BLOCK_REGISTRY.register("smooth_" + type.getName() + "_stairs", () -> new CustomStairsBlock(() -> SMOOTH_ROCK_BLOCKS.get(type).get().defaultBlockState(), Block.Properties.of(Material.STONE, type.getColor()).strength(1.5F, 6.0F).requiresCorrectToolForDrops(), ToolTypes.PICKAXE)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<CustomSlabBlock>> SMOOTH_ROCK_SLABS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_BLOCK_REGISTRY.register("smooth_" + type.getName() + "_slab", () -> new CustomSlabBlock(Block.Properties.of(Material.STONE, type.getColor()).strength(1.5F, 6.0F).requiresCorrectToolForDrops(), ToolTypes.PICKAXE)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<CustomWallBlock>> SMOOTH_ROCK_WALLS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_BLOCK_REGISTRY.register("smooth_" + type.getName() + "_wall", () -> new CustomWallBlock(Block.Properties.of(Material.STONE, type.getColor()).strength(1.5F, 6.0F).requiresCorrectToolForDrops(), ToolTypes.PICKAXE)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<CustomPressurePlateBlock>> SMOOTH_ROCK_PRESSURE_PLATES = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_BLOCK_REGISTRY.register("smooth_" + type.getName() + "_pressure_plate", () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.of(Material.STONE, type.getColor()).strength(1.5F, 6.0F).requiresCorrectToolForDrops(), ToolTypes.PICKAXE)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    // Polished rocks
    public static final Map<RockType, RegistryObject<CustomBlock>> POLISHED_ROCK_BLOCKS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_BLOCK_REGISTRY.register("polished_" + type.getName(), () -> new CustomBlock(Block.Properties.of(Material.STONE, type.getColor()).strength(1.5F, 6.0F).requiresCorrectToolForDrops(), ToolTypes.PICKAXE)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<CustomStairsBlock>> POLISHED_ROCK_STAIRS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_BLOCK_REGISTRY.register("polished_" + type.getName() + "_stairs", () -> new CustomStairsBlock(() -> POLISHED_ROCK_BLOCKS.get(type).get().defaultBlockState(), Block.Properties.of(Material.STONE, type.getColor()).strength(1.5F, 6.0F).requiresCorrectToolForDrops(), ToolTypes.PICKAXE)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<CustomSlabBlock>> POLISHED_ROCK_SLABS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_BLOCK_REGISTRY.register("polished_" + type.getName() + "_slab", () -> new CustomSlabBlock(Block.Properties.of(Material.STONE, type.getColor()).strength(1.5F, 6.0F).requiresCorrectToolForDrops(), ToolTypes.PICKAXE)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<CustomWallBlock>> POLISHED_ROCK_WALLS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_BLOCK_REGISTRY.register("polished_" + type.getName() + "_wall", () -> new CustomWallBlock(Block.Properties.of(Material.STONE, type.getColor()).strength(1.5F, 6.0F).requiresCorrectToolForDrops(), ToolTypes.PICKAXE)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<CustomPressurePlateBlock>> POLISHED_ROCK_PRESSURE_PLATES = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_BLOCK_REGISTRY.register("polished_" + type.getName() + "_pressure_plate", () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.of(Material.STONE, type.getColor()).strength(1.5F, 6.0F).requiresCorrectToolForDrops(), ToolTypes.PICKAXE)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    // Rock pavings
    public static final Map<RockType, RegistryObject<CustomBlock>> ROCK_PAVINGS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_BLOCK_REGISTRY.register(type.getName() + "_paving", () -> new CustomBlock(Block.Properties.of(Material.STONE, type.getColor()).strength(1.5F, 6.0F).requiresCorrectToolForDrops(), ToolTypes.PICKAXE)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<CustomStairsBlock>> ROCK_PAVING_STAIRS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_BLOCK_REGISTRY.register(type.getName() + "_paving_stairs", () -> new CustomStairsBlock(() -> ROCK_PAVINGS.get(type).get().defaultBlockState(), Block.Properties.of(Material.STONE, type.getColor()).strength(1.5F, 6.0F).requiresCorrectToolForDrops(), ToolTypes.PICKAXE)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<CustomSlabBlock>> ROCK_PAVING_SLABS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_BLOCK_REGISTRY.register(type.getName() + "_paving_slab", () -> new CustomSlabBlock(Block.Properties.of(Material.STONE, type.getColor()).strength(1.5F, 6.0F).requiresCorrectToolForDrops(), ToolTypes.PICKAXE)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<CustomWallBlock>> ROCK_PAVING_WALLS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_BLOCK_REGISTRY.register(type.getName() + "_paving_wall", () -> new CustomWallBlock(Block.Properties.of(Material.STONE, type.getColor()).strength(1.5F, 6.0F).requiresCorrectToolForDrops(), ToolTypes.PICKAXE)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<CustomPressurePlateBlock>> ROCK_PAVING_PRESSURE_PLATES = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_BLOCK_REGISTRY.register(type.getName() + "_paving_pressure_plate", () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.of(Material.STONE, type.getColor()).strength(1.5F, 6.0F).requiresCorrectToolForDrops(), ToolTypes.PICKAXE)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    // Rock tiles
    public static final Map<RockType, RegistryObject<CustomBlock>> ROCK_TILES = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_BLOCK_REGISTRY.register(type.getName() + "_tiles", () -> new CustomBlock(Block.Properties.of(Material.STONE, type.getColor()).strength(1.5F, 6.0F).requiresCorrectToolForDrops(), ToolTypes.PICKAXE)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<CustomStairsBlock>> ROCK_TILES_STAIRS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_BLOCK_REGISTRY.register(type.getName() + "_tiles_stairs", () -> new CustomStairsBlock(() -> ROCK_TILES.get(type).get().defaultBlockState(), Block.Properties.of(Material.STONE, type.getColor()).strength(1.5F, 6.0F).requiresCorrectToolForDrops(), ToolTypes.PICKAXE)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<CustomSlabBlock>> ROCK_TILES_SLABS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_BLOCK_REGISTRY.register(type.getName() + "_tiles_slab", () -> new CustomSlabBlock(Block.Properties.of(Material.STONE, type.getColor()).strength(1.5F, 6.0F).requiresCorrectToolForDrops(), ToolTypes.PICKAXE)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<CustomWallBlock>> ROCK_TILES_WALLS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_BLOCK_REGISTRY.register(type.getName() + "_tiles_wall", () -> new CustomWallBlock(Block.Properties.of(Material.STONE, type.getColor()).strength(1.5F, 6.0F).requiresCorrectToolForDrops(), ToolTypes.PICKAXE)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<CustomPressurePlateBlock>> ROCK_TILES_PRESSURE_PLATES = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_BLOCK_REGISTRY.register(type.getName() + "_tiles_pressure_plate", () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.of(Material.STONE, type.getColor()).strength(1.5F, 6.0F).requiresCorrectToolForDrops(), ToolTypes.PICKAXE)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    // Rock bricks
    public static final Map<RockType, RegistryObject<CustomBlock>> ROCK_BRICKS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_BLOCK_REGISTRY.register(type.getName() + "_bricks", () -> new CustomBlock(Block.Properties.of(Material.STONE, type.getColor()).strength(1.5F, 6.0F).requiresCorrectToolForDrops(), ToolTypes.PICKAXE)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<CustomStairsBlock>> ROCK_BRICKS_STAIRS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_BLOCK_REGISTRY.register(type.getName() + "_bricks_stairs", () -> new CustomStairsBlock(() -> ROCK_BRICKS.get(type).get().defaultBlockState(), Block.Properties.of(Material.STONE, type.getColor()).strength(1.5F, 6.0F).requiresCorrectToolForDrops(), ToolTypes.PICKAXE)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<CustomSlabBlock>> ROCK_BRICKS_SLABS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_BLOCK_REGISTRY.register(type.getName() + "_bricks_slab", () -> new CustomSlabBlock(Block.Properties.of(Material.STONE, type.getColor()).strength(1.5F, 6.0F).requiresCorrectToolForDrops(), ToolTypes.PICKAXE)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<CustomWallBlock>> ROCK_BRICKS_WALLS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_BLOCK_REGISTRY.register(type.getName() + "_bricks_wall", () -> new CustomWallBlock(Block.Properties.of(Material.STONE, type.getColor()).strength(1.5F, 6.0F).requiresCorrectToolForDrops(), ToolTypes.PICKAXE)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<CustomPressurePlateBlock>> ROCK_BRICKS_PRESSURE_PLATES = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_BLOCK_REGISTRY.register(type.getName() + "_bricks_pressure_plate", () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.of(Material.STONE, type.getColor()).strength(1.5F, 6.0F).requiresCorrectToolForDrops(), ToolTypes.PICKAXE)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    // Rock large bricks
    public static final Map<RockType, RegistryObject<CustomBlock>> ROCK_LARGE_BRICKS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_BLOCK_REGISTRY.register(type.getName() + "_large_bricks", () -> new CustomBlock(Block.Properties.of(Material.STONE, type.getColor()).strength(1.5F, 6.0F).requiresCorrectToolForDrops(), ToolTypes.PICKAXE)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<CustomStairsBlock>> ROCK_LARGE_BRICKS_STAIRS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_BLOCK_REGISTRY.register(type.getName() + "_large_bricks_stairs", () -> new CustomStairsBlock(() -> ROCK_LARGE_BRICKS.get(type).get().defaultBlockState(), Block.Properties.of(Material.STONE, type.getColor()).strength(1.5F, 6.0F).requiresCorrectToolForDrops(), ToolTypes.PICKAXE)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<CustomSlabBlock>> ROCK_LARGE_BRICKS_SLABS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_BLOCK_REGISTRY.register(type.getName() + "_large_bricks_slab", () -> new CustomSlabBlock(Block.Properties.of(Material.STONE, type.getColor()).strength(1.5F, 6.0F).requiresCorrectToolForDrops(), ToolTypes.PICKAXE)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<CustomWallBlock>> ROCK_LARGE_BRICKS_WALLS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_BLOCK_REGISTRY.register(type.getName() + "_large_bricks_wall", () -> new CustomWallBlock(Block.Properties.of(Material.STONE, type.getColor()).strength(1.5F, 6.0F).requiresCorrectToolForDrops(), ToolTypes.PICKAXE)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<CustomPressurePlateBlock>> ROCK_LARGE_BRICKS_PRESSURE_PLATES = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_BLOCK_REGISTRY.register(type.getName() + "_large_bricks_pressure_plate", () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.of(Material.STONE, type.getColor()).strength(1.5F, 6.0F).requiresCorrectToolForDrops(), ToolTypes.PICKAXE)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    // Rock paving stones
    public static final Map<RockType, RegistryObject<CustomBlock>> ROCK_PAVING_STONES = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_BLOCK_REGISTRY.register(type.getName() + "_paving_stones", () -> new CustomBlock(Block.Properties.of(Material.STONE, type.getColor()).strength(1.5F, 6.0F).requiresCorrectToolForDrops(), ToolTypes.PICKAXE)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<CustomStairsBlock>> ROCK_PAVING_STONES_STAIRS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_BLOCK_REGISTRY.register(type.getName() + "_paving_stones_stairs", () -> new CustomStairsBlock(() -> ROCK_PAVING_STONES.get(type).get().defaultBlockState(), Block.Properties.of(Material.STONE, type.getColor()).strength(1.5F, 6.0F).requiresCorrectToolForDrops(), ToolTypes.PICKAXE)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<CustomSlabBlock>> ROCK_PAVING_STONES_SLABS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_BLOCK_REGISTRY.register(type.getName() + "_paving_stones_slab", () -> new CustomSlabBlock(Block.Properties.of(Material.STONE, type.getColor()).strength(1.5F, 6.0F).requiresCorrectToolForDrops(), ToolTypes.PICKAXE)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<CustomWallBlock>> ROCK_PAVING_STONES_WALLS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_BLOCK_REGISTRY.register(type.getName() + "_paving_stones_wall", () -> new CustomWallBlock(Block.Properties.of(Material.STONE, type.getColor()).strength(1.5F, 6.0F).requiresCorrectToolForDrops(), ToolTypes.PICKAXE)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<CustomPressurePlateBlock>> ROCK_PAVING_STONES_PRESSURE_PLATES = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_BLOCK_REGISTRY.register(type.getName() + "_paving_stones_pressure_plate", () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.of(Material.STONE, type.getColor()).strength(1.5F, 6.0F).requiresCorrectToolForDrops(), ToolTypes.PICKAXE)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    // Rock ornaments
    public static final Map<RockType, RegistryObject<CustomBlock>> ROCK_ORNAMENTS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_BLOCK_REGISTRY.register(type.getName() + "_ornament", () -> new CustomBlock(Block.Properties.of(Material.STONE, type.getColor()).strength(1.5F, 6.0F).requiresCorrectToolForDrops(), ToolTypes.PICKAXE)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<CustomPressurePlateBlock>> ROCK_ORNAMENT_PRESSURE_PLATES = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_BLOCK_REGISTRY.register(type.getName() + "_ornament_pressure_plate", () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.of(Material.STONE, type.getColor()).strength(1.5F, 6.0F).requiresCorrectToolForDrops(), ToolTypes.PICKAXE)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    // Rock rooftiles
    public static final Map<RockType, RegistryObject<CustomBlock>> ROCK_ROOFTILES = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_BLOCK_REGISTRY.register(type.getName() + "_rooftiles", () -> new CustomBlock(Block.Properties.of(Material.STONE, type.getColor()).strength(1.5F, 6.0F).requiresCorrectToolForDrops(), ToolTypes.PICKAXE)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<CustomStairsBlock>> ROCK_ROOFTILES_STAIRS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_BLOCK_REGISTRY.register(type.getName() + "_rooftiles_stairs", () -> new CustomStairsBlock(() -> ROCK_BLOCKS.get(type).get().defaultBlockState(), Block.Properties.of(Material.STONE, type.getColor()).strength(1.5F, 6.0F).requiresCorrectToolForDrops(), ToolTypes.PICKAXE)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<CustomSlabBlock>> ROCK_ROOFTILES_SLABS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_BLOCK_REGISTRY.register(type.getName() + "_rooftiles_slab", () -> new CustomSlabBlock(Block.Properties.of(Material.STONE, type.getColor()).strength(1.5F, 6.0F).requiresCorrectToolForDrops(), ToolTypes.PICKAXE)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    // Stone paving stones
    public static final RegistryObject<CustomBlock> PAVING_STONES = ROCK_BLOCK_REGISTRY.register("paving_stones", () -> new CustomBlock(Block.Properties.of(Material.STONE, MaterialColor.STONE).strength(1.5F, 6.0F).requiresCorrectToolForDrops(), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> PAVING_STONES_STAIRS = ROCK_BLOCK_REGISTRY.register("paving_stones_stairs", () -> new CustomStairsBlock(() -> Blocks.STONE.defaultBlockState(), Block.Properties.of(Material.STONE, MaterialColor.STONE).strength(1.5F, 6.0F).requiresCorrectToolForDrops(), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> PAVING_STONES_SLAB = ROCK_BLOCK_REGISTRY.register("paving_stones_slab", () -> new CustomSlabBlock(Block.Properties.of(Material.STONE, MaterialColor.STONE).strength(1.5F, 6.0F).requiresCorrectToolForDrops(), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomWallBlock> PAVING_STONES_WALL = ROCK_BLOCK_REGISTRY.register("paving_stones_wall", () -> new CustomWallBlock(Block.Properties.of(Material.STONE, MaterialColor.STONE).strength(1.5F, 6.0F).requiresCorrectToolForDrops(), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> PAVING_STONES_PRESSURE_PLATE = ROCK_BLOCK_REGISTRY.register("paving_stones_pressure_plate", () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.of(Material.STONE, MaterialColor.STONE).noCollission().strength(1.5F, 6.0F).requiresCorrectToolForDrops(), ToolTypes.PICKAXE));

    public static void init()
    {
        EmbellishCraft.LOGGER.info("1.1a- EmbellishCraft: rock block registering.");
        ROCK_BLOCK_REGISTRY.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}