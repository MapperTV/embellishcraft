package tv.mapper.embellishcraft.industrial.world.level.block;

import java.util.Arrays;
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
import tv.mapper.embellishcraft.building.world.level.block.SuspendedStairsBlock;
import tv.mapper.embellishcraft.core.ECConstants;
import tv.mapper.mapperbase.world.level.block.AllRotationBlock;
import tv.mapper.mapperbase.world.level.block.CustomBlock;
import tv.mapper.mapperbase.world.level.block.CustomDoorBlock;
import tv.mapper.mapperbase.world.level.block.CustomLadderBlock;
import tv.mapper.mapperbase.world.level.block.CustomPressurePlateBlock;
import tv.mapper.mapperbase.world.level.block.CustomSlabBlock;
import tv.mapper.mapperbase.world.level.block.CustomStairsBlock;
import tv.mapper.mapperbase.world.level.block.CustomWallBlock;
import tv.mapper.mapperbase.world.level.block.ToolTypes;

public class InitIndustrialBlocks
{
    public static final DeferredRegister<Block> INDUSTRIAL_BLOCK_REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, ECConstants.MODID);

    public static final Map<DyeColor, RegistryObject<CustomBlock>> CORRUGATED_METAL_PLATE_BLOCKS = Arrays.stream(DyeColor.values()).map(type -> Pair.of(type, INDUSTRIAL_BLOCK_REGISTRY.register(type.getSerializedName() + "_corrugated_metal_plate", () -> new CustomBlock(Block.Properties.of(Material.METAL, type.getMaterialColor()).strength(1.5F, 6.0F).sound(SoundType.METAL), ToolTypes.PICKAXE)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));
    public static final Map<DyeColor, RegistryObject<CustomStairsBlock>> CORRUGATED_METAL_PLATE_STAIRS = Arrays.stream(DyeColor.values()).map(type -> Pair.of(type, INDUSTRIAL_BLOCK_REGISTRY.register(type.getSerializedName() + "_corrugated_metal_plate_stairs", () -> new CustomStairsBlock(() -> CORRUGATED_METAL_PLATE_BLOCKS.get(type).get().defaultBlockState(), Block.Properties.of(Material.METAL, MaterialColor.COLOR_BLACK).strength(1.5F, 6.0F).sound(SoundType.METAL), ToolTypes.PICKAXE)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));
    public static final Map<DyeColor, RegistryObject<CustomSlabBlock>> CORRUGATED_METAL_PLATE_SLABS = Arrays.stream(DyeColor.values()).map(type -> Pair.of(type, INDUSTRIAL_BLOCK_REGISTRY.register(type.getSerializedName() + "_corrugated_metal_plate_slab", () -> new CustomSlabBlock(Block.Properties.of(Material.METAL, type.getMaterialColor()).strength(1.5F, 6.0F).sound(SoundType.METAL), ToolTypes.PICKAXE)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));
    public static final Map<DyeColor, RegistryObject<CustomWallBlock>> CORRUGATED_METAL_PLATE_WALLS = Arrays.stream(DyeColor.values()).map(type -> Pair.of(type, INDUSTRIAL_BLOCK_REGISTRY.register(type.getSerializedName() + "_corrugated_metal_plate_wall", () -> new CustomWallBlock(Block.Properties.of(Material.METAL, type.getMaterialColor()).strength(1.5F, 6.0F).sound(SoundType.METAL), ToolTypes.PICKAXE)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));
    public static final Map<DyeColor, RegistryObject<CustomPressurePlateBlock>> CORRUGATED_METAL_PLATE_PRESSURE_PLATES = Arrays.stream(DyeColor.values()).map(type -> Pair.of(type, INDUSTRIAL_BLOCK_REGISTRY.register(type.getSerializedName() + "_corrugated_metal_plate_pressure_plate", () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.of(Material.METAL, type.getMaterialColor()).strength(1.5F, 6.0F).sound(SoundType.METAL), ToolTypes.PICKAXE)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));
    public static final Map<DyeColor, RegistryObject<FenceBlock>> CORRUGATED_METAL_PLATE_FENCES = Arrays.stream(DyeColor.values()).map(type -> Pair.of(type, INDUSTRIAL_BLOCK_REGISTRY.register(type.getSerializedName() + "_corrugated_metal_plate_fence", () -> new FenceBlock(Block.Properties.of(Material.METAL, type.getMaterialColor()).strength(1.5F, 6.0F).sound(SoundType.METAL))))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));
    public static final Map<DyeColor, RegistryObject<FenceGateBlock>> CORRUGATED_METAL_PLATE_FENCE_GATES = Arrays.stream(DyeColor.values()).map(type -> Pair.of(type, INDUSTRIAL_BLOCK_REGISTRY.register(type.getSerializedName() + "_corrugated_metal_plate_fence_gate", () -> new FenceGateBlock(Block.Properties.of(Material.METAL, type.getMaterialColor()).strength(1.5F, 6.0F).sound(SoundType.METAL))))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final RegistryObject<CustomBlock> DARK_METAL_FLOOR = INDUSTRIAL_BLOCK_REGISTRY.register("dark_metal_floor", () -> new CustomBlock(Block.Properties.of(Material.METAL, MaterialColor.PODZOL).strength(1.5F, 6.0F).sound(SoundType.LANTERN), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> DARK_METAL_FLOOR_STAIRS = INDUSTRIAL_BLOCK_REGISTRY.register("dark_metal_floor_stairs", () -> new CustomStairsBlock(() -> DARK_METAL_FLOOR.get().defaultBlockState(), Block.Properties.of(Material.METAL, MaterialColor.PODZOL).strength(1.5F, 6.0F).sound(SoundType.LANTERN), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> DARK_METAL_FLOOR_SLAB = INDUSTRIAL_BLOCK_REGISTRY.register("dark_metal_floor_slab", () -> new CustomSlabBlock(Block.Properties.of(Material.METAL, MaterialColor.PODZOL).strength(1.5F, 6.0F).sound(SoundType.LANTERN), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomWallBlock> DARK_METAL_FLOOR_WALL = INDUSTRIAL_BLOCK_REGISTRY.register("dark_metal_floor_wall", () -> new CustomWallBlock(Block.Properties.of(Material.METAL, MaterialColor.PODZOL).strength(1.5F, 6.0F).sound(SoundType.LANTERN), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> DARK_METAL_FLOOR_PRESSURE_PLATE = INDUSTRIAL_BLOCK_REGISTRY.register("dark_metal_floor_pressure_plate", () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.of(Material.METAL, MaterialColor.PODZOL).noCollission().strength(1.5F, 6.0F).sound(SoundType.LANTERN), ToolTypes.PICKAXE));

    public static final RegistryObject<CustomBlock> LIGHT_METAL_FLOOR = INDUSTRIAL_BLOCK_REGISTRY.register("light_metal_floor", () -> new CustomBlock(Block.Properties.of(Material.METAL, MaterialColor.CLAY).strength(1.5F, 6.0F).sound(SoundType.LANTERN), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> LIGHT_METAL_FLOOR_STAIRS = INDUSTRIAL_BLOCK_REGISTRY.register("light_metal_floor_stairs", () -> new CustomStairsBlock(() -> LIGHT_METAL_FLOOR.get().defaultBlockState(), Block.Properties.of(Material.METAL, MaterialColor.CLAY).strength(1.5F, 6.0F).sound(SoundType.LANTERN), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> LIGHT_METAL_FLOOR_SLAB = INDUSTRIAL_BLOCK_REGISTRY.register("light_metal_floor_slab", () -> new CustomSlabBlock(Block.Properties.of(Material.METAL, MaterialColor.CLAY).strength(1.5F, 6.0F).sound(SoundType.LANTERN), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomWallBlock> LIGHT_METAL_FLOOR_WALL = INDUSTRIAL_BLOCK_REGISTRY.register("light_metal_floor_wall", () -> new CustomWallBlock(Block.Properties.of(Material.METAL, MaterialColor.CLAY).strength(1.5F, 6.0F).sound(SoundType.LANTERN), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> LIGHT_METAL_FLOOR_PRESSURE_PLATE = INDUSTRIAL_BLOCK_REGISTRY.register("light_metal_floor_pressure_plate", () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.of(Material.METAL, MaterialColor.CLAY).noCollission().strength(1.5F, 6.0F).sound(SoundType.LANTERN), ToolTypes.PICKAXE));

    public static final RegistryObject<CustomBlock> RUSTY_PLATE = INDUSTRIAL_BLOCK_REGISTRY.register("rusty_plate", () -> new CustomBlock(Block.Properties.of(Material.METAL, MaterialColor.TERRACOTTA_ORANGE).strength(1.5F, 6.0F).sound(SoundType.LANTERN), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomStairsBlock> RUSTY_PLATE_STAIRS = INDUSTRIAL_BLOCK_REGISTRY.register("rusty_plate_stairs", () -> new CustomStairsBlock(() -> RUSTY_PLATE.get().defaultBlockState(), Block.Properties.of(Material.METAL, MaterialColor.TERRACOTTA_ORANGE).strength(1.5F, 6.0F).sound(SoundType.LANTERN), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomSlabBlock> RUSTY_PLATE_SLAB = INDUSTRIAL_BLOCK_REGISTRY.register("rusty_plate_slab", () -> new CustomSlabBlock(Block.Properties.of(Material.METAL, MaterialColor.TERRACOTTA_ORANGE).strength(1.5F, 6.0F).sound(SoundType.LANTERN), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomWallBlock> RUSTY_PLATE_WALL = INDUSTRIAL_BLOCK_REGISTRY.register("rusty_plate_wall", () -> new CustomWallBlock(Block.Properties.of(Material.METAL, MaterialColor.TERRACOTTA_ORANGE).strength(1.5F, 6.0F).sound(SoundType.LANTERN), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomPressurePlateBlock> RUSTY_PLATE_PRESSURE_PLATE = INDUSTRIAL_BLOCK_REGISTRY.register("rusty_plate_pressure_plate", () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.of(Material.METAL, MaterialColor.TERRACOTTA_ORANGE).noCollission().strength(1.5F, 6.0F).sound(SoundType.LANTERN), ToolTypes.PICKAXE));

    public static final RegistryObject<RotatedPillarBlock> IRON_BEAM = INDUSTRIAL_BLOCK_REGISTRY.register("iron_beam", () -> new RotatedPillarBlock(Block.Properties.of(Material.METAL, MaterialColor.METAL).strength(0.8F).sound(SoundType.LANTERN)));
    public static final RegistryObject<RotatedPillarBlock> BOLTED_IRON_BEAM = INDUSTRIAL_BLOCK_REGISTRY.register("bolted_iron_beam", () -> new RotatedPillarBlock(Block.Properties.of(Material.METAL, MaterialColor.METAL).strength(0.8F).sound(SoundType.LANTERN)));
    public static final RegistryObject<CustomBlock> IRON_BEAM_JUNCTION = INDUSTRIAL_BLOCK_REGISTRY.register("iron_beam_junction", () -> new CustomBlock(Block.Properties.of(Material.METAL, MaterialColor.METAL).strength(0.8F).sound(SoundType.LANTERN), ToolTypes.PICKAXE));

    public static final RegistryObject<RotatedPillarBlock> STEEL_BEAM = INDUSTRIAL_BLOCK_REGISTRY.register("steel_beam", () -> new RotatedPillarBlock(Block.Properties.of(Material.METAL, MaterialColor.METAL).strength(0.8F).sound(SoundType.LANTERN)));
    public static final RegistryObject<RotatedPillarBlock> BOLTED_STEEL_BEAM = INDUSTRIAL_BLOCK_REGISTRY.register("bolted_steel_beam", () -> new RotatedPillarBlock(Block.Properties.of(Material.METAL, MaterialColor.METAL).strength(0.8F).sound(SoundType.LANTERN)));
    public static final RegistryObject<CustomBlock> STEEL_BEAM_JUNCTION = INDUSTRIAL_BLOCK_REGISTRY.register("steel_beam_junction", () -> new CustomBlock(Block.Properties.of(Material.METAL, MaterialColor.METAL).strength(0.8F).sound(SoundType.LANTERN), ToolTypes.PICKAXE));

    public static final RegistryObject<CustomBlock> AIR_DUCT = INDUSTRIAL_BLOCK_REGISTRY.register("air_duct", () -> new CustomBlock(Block.Properties.of(Material.METAL, MaterialColor.METAL).strength(0.8F).sound(SoundType.LANTERN), ToolTypes.PICKAXE));
    public static final RegistryObject<AllRotationBlock> VENT_AIR_DUCT = INDUSTRIAL_BLOCK_REGISTRY.register("vent_air_duct", () -> new AllRotationBlock(Block.Properties.of(Material.METAL, MaterialColor.METAL).strength(0.8F).sound(SoundType.LANTERN), ToolTypes.PICKAXE));
    public static final RegistryObject<AllRotationBlock> GRID_AIR_DUCT = INDUSTRIAL_BLOCK_REGISTRY.register("grid_air_duct", () -> new AllRotationBlock(Block.Properties.of(Material.METAL, MaterialColor.METAL).strength(0.8F).sound(SoundType.LANTERN), ToolTypes.PICKAXE));

    public static final RegistryObject<CustomBlock> BULKHEAD = INDUSTRIAL_BLOCK_REGISTRY.register("bulkhead", () -> new CustomBlock(Block.Properties.of(Material.METAL, MaterialColor.STONE).strength(0.8F).sound(SoundType.METAL), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomBlock> BULKHEAD_TOP = INDUSTRIAL_BLOCK_REGISTRY.register("bulkhead_top", () -> new CustomBlock(Block.Properties.of(Material.METAL, MaterialColor.STONE).strength(0.8F).sound(SoundType.METAL), ToolTypes.PICKAXE));

    public static final RegistryObject<CustomLadderBlock> STEEL_WALL_LADDER = INDUSTRIAL_BLOCK_REGISTRY.register("steel_wall_ladder", () -> new CustomLadderBlock(Block.Properties.of(Material.METAL, MaterialColor.METAL).strength(0.8F).sound(SoundType.LANTERN).noOcclusion(), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomLadderBlock> RUSTY_WALL_LADDER = INDUSTRIAL_BLOCK_REGISTRY.register("rusty_wall_ladder", () -> new CustomLadderBlock(Block.Properties.of(Material.METAL, MaterialColor.METAL).strength(0.8F).sound(SoundType.LANTERN).noOcclusion(), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomLadderBlock> STEEL_RUNGS = INDUSTRIAL_BLOCK_REGISTRY.register("steel_rungs", () -> new CustomLadderBlock(Block.Properties.of(Material.METAL, MaterialColor.METAL).strength(0.8F).sound(SoundType.LANTERN).noOcclusion(), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomLadderBlock> RUSTY_RUNGS = INDUSTRIAL_BLOCK_REGISTRY.register("rusty_rungs", () -> new CustomLadderBlock(Block.Properties.of(Material.METAL, MaterialColor.METAL).strength(0.8F).sound(SoundType.LANTERN).noOcclusion(), ToolTypes.PICKAXE));

    public static final RegistryObject<SuspendedStairsBlock> STEEL_SUSPENDED_STAIRS = INDUSTRIAL_BLOCK_REGISTRY.register("steel_suspended_stairs", () -> new SuspendedStairsBlock(Block.Properties.of(Material.METAL, MaterialColor.METAL).strength(3.0F).sound(SoundType.LANTERN), ToolTypes.PICKAXE, false));
    public static final RegistryObject<SuspendedStairsBlock> RUSTY_SUSPENDED_STAIRS = INDUSTRIAL_BLOCK_REGISTRY.register("rusty_suspended_stairs", () -> new SuspendedStairsBlock(Block.Properties.of(Material.METAL, MaterialColor.METAL).strength(3.0F).sound(SoundType.LANTERN), ToolTypes.PICKAXE, false));
    public static final RegistryObject<SuspendedStairsBlock> STEEL_LARGE_SUSPENDED_STAIRS = INDUSTRIAL_BLOCK_REGISTRY.register("steel_large_suspended_stairs", () -> new SuspendedStairsBlock(Block.Properties.of(Material.METAL, MaterialColor.METAL).strength(3.0F).sound(SoundType.LANTERN), ToolTypes.PICKAXE, true));
    public static final RegistryObject<SuspendedStairsBlock> RUSTY_LARGE_SUSPENDED_STAIRS = INDUSTRIAL_BLOCK_REGISTRY.register("rusty_large_suspended_stairs", () -> new SuspendedStairsBlock(Block.Properties.of(Material.METAL, MaterialColor.METAL).strength(3.0F).sound(SoundType.LANTERN), ToolTypes.PICKAXE, true));

    public static final RegistryObject<CustomDoorBlock> STEEL_DOOR = INDUSTRIAL_BLOCK_REGISTRY.register("steel_door", () -> new CustomDoorBlock(Block.Properties.of(Material.METAL, MaterialColor.METAL).strength(3.0F).sound(SoundType.LANTERN), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomDoorBlock> STURDY_STEEL_DOOR = INDUSTRIAL_BLOCK_REGISTRY.register("sturdy_steel_door", () -> new CustomDoorBlock(Block.Properties.of(Material.METAL, MaterialColor.METAL).strength(5.0F, 1200.0F).sound(SoundType.LANTERN), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomDoorBlock> WARNING_STEEL_DOOR = INDUSTRIAL_BLOCK_REGISTRY.register("warning_steel_door", () -> new CustomDoorBlock(Block.Properties.of(Material.METAL, MaterialColor.METAL).strength(3.0F).sound(SoundType.LANTERN), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomDoorBlock> WHITE_STEEL_DOOR = INDUSTRIAL_BLOCK_REGISTRY.register("white_steel_door", () -> new CustomDoorBlock(Block.Properties.of(Material.METAL, MaterialColor.METAL).strength(3.0F).sound(SoundType.LANTERN), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomDoorBlock> STURDY_WHITE_STEEL_DOOR = INDUSTRIAL_BLOCK_REGISTRY.register("sturdy_white_steel_door", () -> new CustomDoorBlock(Block.Properties.of(Material.METAL, MaterialColor.METAL).strength(5.0F, 1200.0F).sound(SoundType.LANTERN), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomDoorBlock> WARNING_WHITE_STEEL_DOOR = INDUSTRIAL_BLOCK_REGISTRY.register("warning_white_steel_door", () -> new CustomDoorBlock(Block.Properties.of(Material.METAL, MaterialColor.METAL).strength(3.0F).sound(SoundType.LANTERN), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomDoorBlock> RUSTY_DOOR = INDUSTRIAL_BLOCK_REGISTRY.register("rusty_door", () -> new CustomDoorBlock(Block.Properties.of(Material.METAL, MaterialColor.METAL).strength(3.0F).sound(SoundType.LANTERN), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomDoorBlock> STURDY_RUSTY_DOOR = INDUSTRIAL_BLOCK_REGISTRY.register("sturdy_rusty_door", () -> new CustomDoorBlock(Block.Properties.of(Material.METAL, MaterialColor.METAL).strength(5.0F, 1200.0F).sound(SoundType.LANTERN), ToolTypes.PICKAXE));
    public static final RegistryObject<CustomDoorBlock> WARNING_RUSTY_DOOR = INDUSTRIAL_BLOCK_REGISTRY.register("warning_rusty_door", () -> new CustomDoorBlock(Block.Properties.of(Material.METAL, MaterialColor.METAL).strength(3.0F).sound(SoundType.LANTERN), ToolTypes.PICKAXE));

    public static void init()
    {
        INDUSTRIAL_BLOCK_REGISTRY.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}