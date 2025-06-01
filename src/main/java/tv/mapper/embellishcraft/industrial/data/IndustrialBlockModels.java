package tv.mapper.embellishcraft.industrial.data;

import java.util.Arrays;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.DyeColor;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import tv.mapper.embellishcraft.core.ECConstants;
import tv.mapper.embellishcraft.core.data.ECBlockModels;
import tv.mapper.mapperbase.MapperBase;

public class IndustrialBlockModels extends ECBlockModels
{

    public IndustrialBlockModels(PackOutput generator, String modid, ExistingFileHelper existingFileHelper, String name)
    {
        super(generator, modid, existingFileHelper, name);
    }

    @Override
    protected void registerModels()
    {

        // Corrugated metal plates
        for(int j = 0; j < DyeColor.values().length; j++)
        {
            buildWall(DyeColor.byId(j).getName() + "_corrugated_metal_plate", modLoc("block/" + DyeColor.byId(j).getName() + "_corrugated_metal_plate"));
        }

        // Metal blocks
        buildWall("dark_metal_floor", modLoc("block/dark_metal_floor"));
        buildWall("light_metal_floor", modLoc("block/light_metal_floor"));
        buildWall("rusty_plate", modLoc("block/rusty_plate"));

        orientableVertical("vent_air_duct", modLoc("block/air_duct"), modLoc("block/vent_air_duct"));
        orientableVertical("grid_air_duct", modLoc("block/air_duct"), modLoc("block/grid_air_duct"));

        cubeColumn("bulkhead", modLoc("block/bulkhead"), modLoc("block/concrete"));
        cubeColumn("bulkhead_top", modLoc("block/bulkhead_top"), modLoc("block/concrete"));

        getBuilder("steel_wall_ladder").parent(getExistingFile(modLoc("block/wall_ladder"))).texture("material", ResourceLocation.fromNamespaceAndPath(MapperBase.MODID, "block/steel_block")).texture("particle", ResourceLocation.fromNamespaceAndPath(MapperBase.MODID, "block/steel_block"));
        getBuilder("rusty_wall_ladder").parent(getExistingFile(modLoc("block/wall_ladder"))).texture("material", modLoc("block/rust")).texture("particle", modLoc("block/rust"));
        getBuilder("steel_rungs").parent(getExistingFile(modLoc("block/rungs"))).texture("material", ResourceLocation.fromNamespaceAndPath(MapperBase.MODID, "block/steel_block")).texture("particle", ResourceLocation.fromNamespaceAndPath(MapperBase.MODID, "block/steel_block"));
        getBuilder("rusty_rungs").parent(getExistingFile(modLoc("block/rungs"))).texture("material", modLoc("block/rust")).texture("particle", modLoc("block/rust"));

        for(int j = 0; j < Arrays.stream(DyeColor.values()).count(); j++)
            getBuilder(DyeColor.byId(j).getSerializedName() + "_corrugated_metal_plate_fence_inventory").parent(getExistingFile(mcLoc("block/fence_inventory"))).texture("texture", modLoc("block/" + DyeColor.byId(j).getSerializedName() + "_corrugated_metal_plate"));

        getBuilder("steel_suspended_stairs").parent(getExistingFile(modLoc("block/suspended_stairs_text90"))).texture("all", ResourceLocation.fromNamespaceAndPath(ECConstants.MODID, "block/steel_beam"));
        getBuilder("rusty_suspended_stairs").parent(getExistingFile(modLoc("block/suspended_stairs_text90"))).texture("all", ResourceLocation.fromNamespaceAndPath(ECConstants.MODID, "block/rust"));
        getBuilder("steel_large_suspended_stairs").parent(getExistingFile(modLoc("block/large_suspended_stairs_text90"))).texture("all", ResourceLocation.fromNamespaceAndPath(ECConstants.MODID, "block/steel_beam"));
        getBuilder("rusty_large_suspended_stairs").parent(getExistingFile(modLoc("block/large_suspended_stairs_text90"))).texture("all", ResourceLocation.fromNamespaceAndPath(ECConstants.MODID, "block/rust"));

        // Catwalks

        getBuilder("iron_catwalk").parent(getExistingFile(modLoc("block/catwalk"))).texture("material", ResourceLocation.fromNamespaceAndPath(ECConstants.MODID, "block/steel_beam_junction")).texture("particle", ResourceLocation.fromNamespaceAndPath(ECConstants.MODID, "block/steel_beam_junction"));

        // getBuilder("iron_catwalk_floor_bottom").parent(getExistingFile(modLoc("block/catwalk_floor_bottom")))
        // .texture("top", ResourceLocation.fromNamespaceAndPath(ECConstants.MODID, "block/steel_beam_junction"))
        // .texture("side", ResourceLocation.fromNamespaceAndPath(ECConstants.MODID, "block/warning_steel_door_bottom"))
        // .texture("particle", ResourceLocation.fromNamespaceAndPath(ECConstants.MODID, "block/steel_beam_junction"));
        //
        // getBuilder("iron_catwalk_floor_top").parent(getExistingFile(modLoc("block/catwalk_floor_top")))
        // .texture("top", ResourceLocation.fromNamespaceAndPath(ECConstants.MODID, "block/steel_beam_junction"))
        // .texture("side", ResourceLocation.fromNamespaceAndPath(ECConstants.MODID, "block/warning_steel_door_bottom"))
        // .texture("particle", ResourceLocation.fromNamespaceAndPath(ECConstants.MODID, "block/steel_beam_junction"));
        //
        // getBuilder("iron_catwalk_railguard").parent(getExistingFile(modLoc("block/catwalk_railguard")))
        // .texture("guardrail", ResourceLocation.fromNamespaceAndPath(ECConstants.MODID, "block/steel_beam"))
        // .texture("particle", ResourceLocation.fromNamespaceAndPath(ECConstants.MODID, "block/steel_beam"));
        //
        // getBuilder("iron_catwalk_inventory").parent(getExistingFile(modLoc("block/catwalk_inventory")))
        // .texture("top", ResourceLocation.fromNamespaceAndPath(ECConstants.MODID, "block/steel_beam_junction"))
        // .texture("side", ResourceLocation.fromNamespaceAndPath(ECConstants.MODID, "block/warning_steel_door_bottom"))
        // .texture("guardrail", ResourceLocation.fromNamespaceAndPath(ECConstants.MODID, "block/steel_beam"));

        // Railguards
        getBuilder("iron_guardrail").parent(getExistingFile(modLoc("block/guardrail"))).texture("material", ResourceLocation.fromNamespaceAndPath(ECConstants.MODID, "block/steel_beam_junction"));
        getBuilder("iron_guardrail_corner").parent(getExistingFile(modLoc("block/guardrail_corner"))).texture("material", ResourceLocation.fromNamespaceAndPath(ECConstants.MODID, "block/steel_beam_junction"));
    }
}
