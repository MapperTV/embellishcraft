package tv.mapper.embellishcraft.industrial.data.gen;

import net.minecraft.data.DataGenerator;
import net.minecraft.world.item.DyeColor;
import net.minecraftforge.client.model.generators.ModelFile.UncheckedModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import tv.mapper.embellishcraft.core.data.gen.ECBlockStates;
import tv.mapper.embellishcraft.industrial.world.level.block.InitIndustrialBlocks;

public class IndustrialBlockStates extends ECBlockStates
{
    public IndustrialBlockStates(DataGenerator gen, String modid, ExistingFileHelper exFileHelper)
    {
        super(gen, modid, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels()
    {
        // Metal blocks
        registerBlockstateVariants("dark_metal_floor", InitIndustrialBlocks.DARK_METAL_FLOOR.get(), InitIndustrialBlocks.DARK_METAL_FLOOR_SLAB.get(), InitIndustrialBlocks.DARK_METAL_FLOOR_STAIRS.get(), InitIndustrialBlocks.DARK_METAL_FLOOR_WALL.get(), InitIndustrialBlocks.DARK_METAL_FLOOR_PRESSURE_PLATE.get(), null);
        registerBlockstateVariants("light_metal_floor", InitIndustrialBlocks.LIGHT_METAL_FLOOR.get(), InitIndustrialBlocks.LIGHT_METAL_FLOOR_SLAB.get(), InitIndustrialBlocks.LIGHT_METAL_FLOOR_STAIRS.get(), InitIndustrialBlocks.LIGHT_METAL_FLOOR_WALL.get(), InitIndustrialBlocks.LIGHT_METAL_FLOOR_PRESSURE_PLATE.get(), null);
        registerBlockstateVariants("rusty_plate", InitIndustrialBlocks.RUSTY_PLATE.get(), InitIndustrialBlocks.RUSTY_PLATE_SLAB.get(), InitIndustrialBlocks.RUSTY_PLATE_STAIRS.get(), InitIndustrialBlocks.RUSTY_PLATE_WALL.get(), InitIndustrialBlocks.RUSTY_PLATE_PRESSURE_PLATE.get(), null);

        axisBlock(InitIndustrialBlocks.IRON_BEAM.get(), modLoc("block/iron_beam"), modLoc("block/iron_beam_junction"));
        axisBlock(InitIndustrialBlocks.BOLTED_IRON_BEAM.get(), modLoc("block/bolted_iron_beam"), modLoc("block/iron_beam_junction"));
        simpleBlock(InitIndustrialBlocks.IRON_BEAM_JUNCTION.get());

        axisBlock(InitIndustrialBlocks.STEEL_BEAM.get(), modLoc("block/steel_beam"), modLoc("block/steel_beam_junction"));
        axisBlock(InitIndustrialBlocks.BOLTED_STEEL_BEAM.get(), modLoc("block/bolted_steel_beam"), modLoc("block/steel_beam_junction"));
        simpleBlock(InitIndustrialBlocks.STEEL_BEAM_JUNCTION.get());

        simpleBlock(InitIndustrialBlocks.AIR_DUCT.get());
        directionalBlock(InitIndustrialBlocks.VENT_AIR_DUCT.get(), new UncheckedModelFile(mod_id + ":block/vent_air_duct"));
        directionalBlock(InitIndustrialBlocks.GRID_AIR_DUCT.get(), new UncheckedModelFile(mod_id + ":block/grid_air_duct"));

        simpleBlock(InitIndustrialBlocks.BULKHEAD.get());
        simpleBlock(InitIndustrialBlocks.BULKHEAD_TOP.get());

        horizontalBlock(InitIndustrialBlocks.STEEL_WALL_LADDER.get(), new UncheckedModelFile(mod_id + ":block/steel_wall_ladder"), 0);
        horizontalBlock(InitIndustrialBlocks.RUSTY_WALL_LADDER.get(), new UncheckedModelFile(mod_id + ":block/rusty_wall_ladder"), 0);
        horizontalBlock(InitIndustrialBlocks.STEEL_RUNGS.get(), new UncheckedModelFile(mod_id + ":block/steel_rungs"));
        horizontalBlock(InitIndustrialBlocks.RUSTY_RUNGS.get(), new UncheckedModelFile(mod_id + ":block/rusty_rungs"));

        // Corrugated metal plates
        for(int j = 0; j < DyeColor.values().length; j++)
        {
            registerBlockstateVariants(DyeColor.byId(j).getSerializedName() + "_corrugated_metal_plate", InitIndustrialBlocks.CORRUGATED_METAL_PLATE_BLOCKS.get(DyeColor.byId(j)).get(), InitIndustrialBlocks.CORRUGATED_METAL_PLATE_SLABS.get(DyeColor.byId(j)).get(), InitIndustrialBlocks.CORRUGATED_METAL_PLATE_STAIRS.get(DyeColor.byId(j)).get(), InitIndustrialBlocks.CORRUGATED_METAL_PLATE_WALLS.get(DyeColor.byId(j)).get(), InitIndustrialBlocks.CORRUGATED_METAL_PLATE_PRESSURE_PLATES.get(DyeColor.byId(j)).get(), null);
            fenceBlock(InitIndustrialBlocks.CORRUGATED_METAL_PLATE_FENCES.get(DyeColor.byId(j)).get(), modLoc("block/" + DyeColor.byId(j).getSerializedName() + "_corrugated_metal_plate"));
            fenceGateBlock(InitIndustrialBlocks.CORRUGATED_METAL_PLATE_FENCE_GATES.get(DyeColor.byId(j)).get(), modLoc("block/" + DyeColor.byId(j).getSerializedName() + "_corrugated_metal_plate"));
        }

        horizontalBlock(InitIndustrialBlocks.STEEL_SUSPENDED_STAIRS.get(), new UncheckedModelFile(mod_id + ":block/steel_suspended_stairs"), 0);
        horizontalBlock(InitIndustrialBlocks.RUSTY_SUSPENDED_STAIRS.get(), new UncheckedModelFile(mod_id + ":block/rusty_suspended_stairs"), 0);
        horizontalBlock(InitIndustrialBlocks.STEEL_LARGE_SUSPENDED_STAIRS.get(), new UncheckedModelFile(mod_id + ":block/steel_large_suspended_stairs"), 0);
        horizontalBlock(InitIndustrialBlocks.RUSTY_LARGE_SUSPENDED_STAIRS.get(), new UncheckedModelFile(mod_id + ":block/rusty_large_suspended_stairs"), 0);

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
    }
}