package tv.mapper.embellishcraft.industrial.data;

import java.util.Objects;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.client.model.generators.ModelFile.UncheckedModelFile;
import net.neoforged.neoforge.client.model.generators.MultiPartBlockStateBuilder;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import tv.mapper.embellishcraft.core.ECConstants;
import tv.mapper.embellishcraft.core.data.ECBlockStates;
import tv.mapper.embellishcraft.industrial.block.CatwalkBlock;
import tv.mapper.embellishcraft.industrial.block.InitIndustrialBlocks;

public class IndustrialBlockStates extends ECBlockStates
{
    public IndustrialBlockStates(PackOutput output, String modid, ExistingFileHelper exFileHelper, String name)
    {
        super(output, modid, exFileHelper, name);
    }

    @Override
    protected void registerStatesAndModels()
    {
        // Metal blocks
        registerBlockstateVariants("dark_metal_floor", ECConstants.MODID, InitIndustrialBlocks.DARK_METAL_FLOOR.get(), InitIndustrialBlocks.DARK_METAL_FLOOR_SLAB.get(), InitIndustrialBlocks.DARK_METAL_FLOOR_STAIRS.get(), InitIndustrialBlocks.DARK_METAL_FLOOR_WALL.get(), InitIndustrialBlocks.DARK_METAL_FLOOR_PRESSURE_PLATE.get(), null);
        registerBlockstateVariants("light_metal_floor", ECConstants.MODID, InitIndustrialBlocks.LIGHT_METAL_FLOOR.get(), InitIndustrialBlocks.LIGHT_METAL_FLOOR_SLAB.get(), InitIndustrialBlocks.LIGHT_METAL_FLOOR_STAIRS.get(), InitIndustrialBlocks.LIGHT_METAL_FLOOR_WALL.get(), InitIndustrialBlocks.LIGHT_METAL_FLOOR_PRESSURE_PLATE.get(), null);
        registerBlockstateVariants("rusty_plate", ECConstants.MODID, InitIndustrialBlocks.RUSTY_PLATE.get(), InitIndustrialBlocks.RUSTY_PLATE_SLAB.get(), InitIndustrialBlocks.RUSTY_PLATE_STAIRS.get(), InitIndustrialBlocks.RUSTY_PLATE_WALL.get(), InitIndustrialBlocks.RUSTY_PLATE_PRESSURE_PLATE.get(), null);

        axisBlock(InitIndustrialBlocks.IRON_BEAM.get(), modLoc("block/iron_beam"), modLoc("block/iron_beam_junction"));
        axisBlock(InitIndustrialBlocks.BOLTED_IRON_BEAM.get(), modLoc("block/bolted_iron_beam"), modLoc("block/iron_beam_junction"));
        simpleBlock(InitIndustrialBlocks.IRON_BEAM_JUNCTION.get());

        axisBlock(InitIndustrialBlocks.STEEL_BEAM.get(), modLoc("block/steel_beam"), modLoc("block/steel_beam_junction"));
        axisBlock(InitIndustrialBlocks.BOLTED_STEEL_BEAM.get(), modLoc("block/bolted_steel_beam"), modLoc("block/steel_beam_junction"));
        simpleBlock(InitIndustrialBlocks.STEEL_BEAM_JUNCTION.get());

        simpleBlock(InitIndustrialBlocks.AIR_DUCT.get());
        directionalBlock(InitIndustrialBlocks.VENT_AIR_DUCT.get(), new UncheckedModelFile(ECConstants.MODID + ":block/vent_air_duct"));
        directionalBlock(InitIndustrialBlocks.GRID_AIR_DUCT.get(), new UncheckedModelFile(ECConstants.MODID + ":block/grid_air_duct"));

        simpleBlock(InitIndustrialBlocks.BULKHEAD.get());
        simpleBlock(InitIndustrialBlocks.BULKHEAD_TOP.get());

        horizontalBlock(InitIndustrialBlocks.STEEL_WALL_LADDER.get(), new UncheckedModelFile(ECConstants.MODID + ":block/steel_wall_ladder"), 0);
        horizontalBlock(InitIndustrialBlocks.RUSTY_WALL_LADDER.get(), new UncheckedModelFile(ECConstants.MODID + ":block/rusty_wall_ladder"), 0);
        horizontalBlock(InitIndustrialBlocks.STEEL_RUNGS.get(), new UncheckedModelFile(ECConstants.MODID + ":block/steel_rungs"));
        horizontalBlock(InitIndustrialBlocks.RUSTY_RUNGS.get(), new UncheckedModelFile(ECConstants.MODID + ":block/rusty_rungs"));

        // Corrugated metal plates
        for(int j = 0; j < DyeColor.values().length; j++)
        {
            registerBlockstateVariants(DyeColor.byId(j).getName() + "_corrugated_metal_plate", ECConstants.MODID, InitIndustrialBlocks.CORRUGATED_METAL_PLATE_BLOCKS.get(DyeColor.byId(j)).get(), InitIndustrialBlocks.CORRUGATED_METAL_PLATE_SLABS.get(DyeColor.byId(j)).get(), InitIndustrialBlocks.CORRUGATED_METAL_PLATE_STAIRS.get(DyeColor.byId(j)).get(), InitIndustrialBlocks.CORRUGATED_METAL_PLATE_WALLS.get(DyeColor.byId(j)).get(), InitIndustrialBlocks.CORRUGATED_METAL_PLATE_PRESSURE_PLATES.get(DyeColor.byId(j)).get(), null);
            fenceBlock(InitIndustrialBlocks.CORRUGATED_METAL_PLATE_FENCES.get(DyeColor.byId(j)).get(), modLoc("block/" + DyeColor.byId(j).getName() + "_corrugated_metal_plate"));
            fenceGateBlock(InitIndustrialBlocks.CORRUGATED_METAL_PLATE_FENCE_GATES.get(DyeColor.byId(j)).get(), modLoc("block/" + DyeColor.byId(j).getName() + "_corrugated_metal_plate"));
        }

        horizontalBlock(InitIndustrialBlocks.STEEL_SUSPENDED_STAIRS.get(), new UncheckedModelFile(ECConstants.MODID + ":block/steel_suspended_stairs"), 0);
        horizontalBlock(InitIndustrialBlocks.RUSTY_SUSPENDED_STAIRS.get(), new UncheckedModelFile(ECConstants.MODID + ":block/rusty_suspended_stairs"), 0);
        horizontalBlock(InitIndustrialBlocks.STEEL_LARGE_SUSPENDED_STAIRS.get(), new UncheckedModelFile(ECConstants.MODID + ":block/steel_large_suspended_stairs"), 0);
        horizontalBlock(InitIndustrialBlocks.RUSTY_LARGE_SUSPENDED_STAIRS.get(), new UncheckedModelFile(ECConstants.MODID + ":block/rusty_large_suspended_stairs"), 0);

        // Doors
        doorBlock(InitIndustrialBlocks.STEEL_DOOR.get(), modLoc("block/steel_door_bottom"), modLoc("block/steel_door_top"));
        doorBlock(InitIndustrialBlocks.STURDY_STEEL_DOOR.get(), modLoc("block/sturdy_steel_door_bottom"), modLoc("block/sturdy_steel_door_top"));
        doorBlock(InitIndustrialBlocks.WARNING_STEEL_DOOR.get(), modLoc("block/warning_steel_door_bottom"), modLoc("block/warning_steel_door_top"));
        doorBlock(InitIndustrialBlocks.WHITE_STEEL_DOOR.get(), modLoc("block/white_steel_door_bottom"), modLoc("block/white_steel_door_top"));
        doorBlock(InitIndustrialBlocks.STURDY_WHITE_STEEL_DOOR.get(), modLoc("block/sturdy_white_steel_door_bottom"), modLoc("block/sturdy_white_steel_door_top"));
        doorBlock(InitIndustrialBlocks.WARNING_WHITE_STEEL_DOOR.get(), modLoc("block/warning_white_steel_door_bottom"), modLoc("block/warning_white_steel_door_top"));
        doorBlock(InitIndustrialBlocks.RUSTY_DOOR.get(), modLoc("block/rusty_door_bottom"), modLoc("block/rusty_door_top"));
        doorBlock(InitIndustrialBlocks.STURDY_RUSTY_DOOR.get(), modLoc("block/sturdy_rusty_door_bottom"), modLoc("block/sturdy_rusty_door_top"));
        doorBlock(InitIndustrialBlocks.WARNING_RUSTY_DOOR.get(), modLoc("block/warning_rusty_door_bottom"), modLoc("block/warning_rusty_door_top"));

        // Catwalks

        catwalkBlock(InitIndustrialBlocks.IRON_CATWALK.get());

    }

    /**
     * Creates a blockstate file for the modular catwalk blocks
     */
    private void catwalkBlock(Block block)
    {
        String name = Objects.requireNonNull(BuiltInRegistries.BLOCK.getKey(block)).getPath();
        MultiPartBlockStateBuilder builder = getMultipartBuilder(block);
        builder.part().modelFile(new UncheckedModelFile(ECConstants.MODID + ":block/" + name + "_floor_bottom")).addModel().condition(CatwalkBlock.IS_UP, false).condition(CatwalkBlock.HAS_FLOOR, true).end();
        builder.part().modelFile(new UncheckedModelFile(ECConstants.MODID + ":block/" + name + "_floor_top")).addModel().condition(CatwalkBlock.IS_UP, true).condition(CatwalkBlock.HAS_FLOOR, true).end();
        builder.part().modelFile(new UncheckedModelFile(ECConstants.MODID + ":block/" + name + "_railguard")).uvLock(true).addModel().condition(CatwalkBlock.GUARDRAIL_NORTH, true).end();
        builder.part().modelFile(new UncheckedModelFile(ECConstants.MODID + ":block/" + name + "_railguard")).rotationY(90).uvLock(true).addModel().condition(CatwalkBlock.GUARDRAIL_EAST, true).end();
        builder.part().modelFile(new UncheckedModelFile(ECConstants.MODID + ":block/" + name + "_railguard")).rotationY(180).uvLock(true).addModel().condition(CatwalkBlock.GUARDRAIL_SOUTH, true).end();
        builder.part().modelFile(new UncheckedModelFile(ECConstants.MODID + ":block/" + name + "_railguard")).rotationY(270).uvLock(true).addModel().condition(CatwalkBlock.GUARDRAIL_WEST, true).end();
    }
}
