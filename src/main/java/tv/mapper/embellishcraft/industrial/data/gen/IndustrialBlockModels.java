package tv.mapper.embellishcraft.industrial.data.gen;

import java.util.Arrays;

import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.DyeColor;
import net.minecraftforge.common.data.ExistingFileHelper;
import tv.mapper.embellishcraft.ECConstants;
import tv.mapper.embellishcraft.data.gen.ECBlockModels;
import tv.mapper.mapperbase.MapperBase;

public class IndustrialBlockModels extends ECBlockModels
{

    public IndustrialBlockModels(DataGenerator generator, String modid, ExistingFileHelper existingFileHelper)
    {
        super(generator, modid, existingFileHelper);
    }

    @Override
    protected void registerModels()
    {

        // Corrugated metal plates
        buildWall("black_corrugated_metal_plate", modLoc("block/black_corrugated_metal_plate"));
        buildWall("blue_corrugated_metal_plate", modLoc("block/blue_corrugated_metal_plate"));
        buildWall("brown_corrugated_metal_plate", modLoc("block/brown_corrugated_metal_plate"));
        buildWall("cyan_corrugated_metal_plate", modLoc("block/cyan_corrugated_metal_plate"));
        buildWall("gray_corrugated_metal_plate", modLoc("block/gray_corrugated_metal_plate"));
        buildWall("green_corrugated_metal_plate", modLoc("block/green_corrugated_metal_plate"));
        buildWall("light_blue_corrugated_metal_plate", modLoc("block/light_blue_corrugated_metal_plate"));
        buildWall("light_gray_corrugated_metal_plate", modLoc("block/light_gray_corrugated_metal_plate"));
        buildWall("lime_corrugated_metal_plate", modLoc("block/lime_corrugated_metal_plate"));
        buildWall("magenta_corrugated_metal_plate", modLoc("block/magenta_corrugated_metal_plate"));
        buildWall("orange_corrugated_metal_plate", modLoc("block/orange_corrugated_metal_plate"));
        buildWall("pink_corrugated_metal_plate", modLoc("block/pink_corrugated_metal_plate"));
        buildWall("purple_corrugated_metal_plate", modLoc("block/purple_corrugated_metal_plate"));
        buildWall("red_corrugated_metal_plate", modLoc("block/red_corrugated_metal_plate"));
        buildWall("white_corrugated_metal_plate", modLoc("block/white_corrugated_metal_plate"));
        buildWall("yellow_corrugated_metal_plate", modLoc("block/yellow_corrugated_metal_plate"));

        buildPressure("black_corrugated_metal_plate", modLoc("block/black_corrugated_metal_plate"));
        buildPressure("blue_corrugated_metal_plate", modLoc("block/blue_corrugated_metal_plate"));
        buildPressure("brown_corrugated_metal_plate", modLoc("block/brown_corrugated_metal_plate"));
        buildPressure("cyan_corrugated_metal_plate", modLoc("block/cyan_corrugated_metal_plate"));
        buildPressure("gray_corrugated_metal_plate", modLoc("block/gray_corrugated_metal_plate"));
        buildPressure("green_corrugated_metal_plate", modLoc("block/green_corrugated_metal_plate"));
        buildPressure("light_blue_corrugated_metal_plate", modLoc("block/light_blue_corrugated_metal_plate"));
        buildPressure("light_gray_corrugated_metal_plate", modLoc("block/light_gray_corrugated_metal_plate"));
        buildPressure("lime_corrugated_metal_plate", modLoc("block/lime_corrugated_metal_plate"));
        buildPressure("magenta_corrugated_metal_plate", modLoc("block/magenta_corrugated_metal_plate"));
        buildPressure("orange_corrugated_metal_plate", modLoc("block/orange_corrugated_metal_plate"));
        buildPressure("pink_corrugated_metal_plate", modLoc("block/pink_corrugated_metal_plate"));
        buildPressure("purple_corrugated_metal_plate", modLoc("block/purple_corrugated_metal_plate"));
        buildPressure("red_corrugated_metal_plate", modLoc("block/red_corrugated_metal_plate"));
        buildPressure("white_corrugated_metal_plate", modLoc("block/white_corrugated_metal_plate"));
        buildPressure("yellow_corrugated_metal_plate", modLoc("block/yellow_corrugated_metal_plate"));

        // Metal blocks
        buildWall("dark_metal_floor", modLoc("block/dark_metal_floor"));
        buildWall("light_metal_floor", modLoc("block/light_metal_floor"));
        buildWall("rusty_plate", modLoc("block/rusty_plate"));

        buildPressure("dark_metal_floor", modLoc("block/dark_metal_floor"));
        buildPressure("light_metal_floor", modLoc("block/light_metal_floor"));
        buildPressure("rusty_plate", modLoc("block/rusty_plate"));

        orientableVertical("vent_air_duct", modLoc("block/air_duct"), modLoc("block/vent_air_duct"));
        orientableVertical("grid_air_duct", modLoc("block/air_duct"), modLoc("block/grid_air_duct"));

        cubeColumn("bulkhead", modLoc("block/bulkhead"), modLoc("block/concrete"));
        cubeColumn("bulkhead_top", modLoc("block/bulkhead_top"), modLoc("block/concrete"));

        getBuilder("steel_wall_ladder").parent(getExistingFile(modLoc("block/wall_ladder"))).texture("material", new ResourceLocation(MapperBase.MODID, "block/steel_block")).texture("particle", new ResourceLocation(MapperBase.MODID, "block/steel_block"));
        getBuilder("rusty_wall_ladder").parent(getExistingFile(modLoc("block/wall_ladder"))).texture("material", modLoc("block/rust")).texture("particle", modLoc("block/rust"));
        getBuilder("steel_rungs").parent(getExistingFile(modLoc("block/rungs"))).texture("material", new ResourceLocation(MapperBase.MODID, "block/steel_block")).texture("particle", new ResourceLocation(MapperBase.MODID, "block/steel_block"));
        getBuilder("rusty_rungs").parent(getExistingFile(modLoc("block/rungs"))).texture("material", modLoc("block/rust")).texture("particle", modLoc("block/rust"));

        for(int j = 0; j < Arrays.stream(DyeColor.values()).count(); j++)
            getBuilder(DyeColor.byId(j).getSerializedName() + "_corrugated_metal_plate_fence_inventory").parent(getExistingFile(mcLoc("block/fence_inventory"))).texture("texture", modLoc("block/" + DyeColor.byId(j).getSerializedName() + "_corrugated_metal_plate"));

        getBuilder("steel_suspended_stairs").parent(getExistingFile(modLoc("block/suspended_stairs_text90"))).texture("all", new ResourceLocation(ECConstants.MODID, "block/steel_beam"));
        getBuilder("rusty_suspended_stairs").parent(getExistingFile(modLoc("block/suspended_stairs_text90"))).texture("all", new ResourceLocation(ECConstants.MODID, "block/rust"));
        getBuilder("steel_large_suspended_stairs").parent(getExistingFile(modLoc("block/large_suspended_stairs_text90"))).texture("all", new ResourceLocation(ECConstants.MODID, "block/steel_beam"));
        getBuilder("rusty_large_suspended_stairs").parent(getExistingFile(modLoc("block/large_suspended_stairs_text90"))).texture("all", new ResourceLocation(ECConstants.MODID, "block/rust"));
    }
}