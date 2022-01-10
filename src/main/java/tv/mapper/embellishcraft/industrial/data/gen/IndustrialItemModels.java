package tv.mapper.embellishcraft.industrial.data.gen;

import java.util.Arrays;

import net.minecraft.data.DataGenerator;
import net.minecraft.world.item.DyeColor;
import net.minecraftforge.client.model.generators.ModelFile.UncheckedModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import tv.mapper.embellishcraft.data.gen.ECItemModels;

public class IndustrialItemModels extends ECItemModels
{

    public IndustrialItemModels(DataGenerator generator, String modid, ExistingFileHelper existingFileHelper)
    {
        super(generator, modid, existingFileHelper);
    }

    @Override
    protected void registerModels()
    {
        // Corrugated metal plates
        registerBlockBasics("black_corrugated_metal_plate", true, true, true, true, true, true);
        registerBlockBasics("blue_corrugated_metal_plate", true, true, true, true, true, true);
        registerBlockBasics("brown_corrugated_metal_plate", true, true, true, true, true, true);
        registerBlockBasics("cyan_corrugated_metal_plate", true, true, true, true, true, true);
        registerBlockBasics("gray_corrugated_metal_plate", true, true, true, true, true, true);
        registerBlockBasics("green_corrugated_metal_plate", true, true, true, true, true, true);
        registerBlockBasics("light_blue_corrugated_metal_plate", true, true, true, true, true, true);
        registerBlockBasics("light_gray_corrugated_metal_plate", true, true, true, true, true, true);
        registerBlockBasics("lime_corrugated_metal_plate", true, true, true, true, true, true);
        registerBlockBasics("magenta_corrugated_metal_plate", true, true, true, true, true, true);
        registerBlockBasics("orange_corrugated_metal_plate", true, true, true, true, true, true);
        registerBlockBasics("pink_corrugated_metal_plate", true, true, true, true, true, true);
        registerBlockBasics("purple_corrugated_metal_plate", true, true, true, true, true, true);
        registerBlockBasics("red_corrugated_metal_plate", true, true, true, true, true, true);
        registerBlockBasics("white_corrugated_metal_plate", true, true, true, true, true, true);
        registerBlockBasics("yellow_corrugated_metal_plate", true, true, true, true, true, true);

        // Metal blocks
        registerBlockBasics("dark_metal_floor", true, true, true, true, true, false);
        registerBlockBasics("light_metal_floor", true, true, true, true, true, false);
        registerBlockBasics("rusty_plate", true, true, true, true, true, false);

        getBuilder("iron_beam").parent(new UncheckedModelFile(modid + ":block/iron_beam"));
        getBuilder("bolted_iron_beam").parent(new UncheckedModelFile(modid + ":block/bolted_iron_beam"));
        getBuilder("iron_beam_junction").parent(new UncheckedModelFile(modid + ":block/iron_beam_junction"));
        getBuilder("steel_beam").parent(new UncheckedModelFile(modid + ":block/steel_beam"));
        getBuilder("bolted_steel_beam").parent(new UncheckedModelFile(modid + ":block/bolted_steel_beam"));
        getBuilder("steel_beam_junction").parent(new UncheckedModelFile(modid + ":block/steel_beam_junction"));

        getBuilder("air_duct").parent(new UncheckedModelFile(modid + ":block/air_duct"));
        getBuilder("vent_air_duct").parent(new UncheckedModelFile(modid + ":block/vent_air_duct"));
        getBuilder("grid_air_duct").parent(new UncheckedModelFile(modid + ":block/grid_air_duct"));

        getBuilder("bulkhead").parent(new UncheckedModelFile(modid + ":block/bulkhead"));
        getBuilder("bulkhead_top").parent(new UncheckedModelFile(modid + ":block/bulkhead_top"));

        getBuilder("steel_wall_ladder").parent(new UncheckedModelFile(modid + ":block/steel_wall_ladder"));
        getBuilder("steel_rungs").parent(new UncheckedModelFile(modid + ":block/steel_rungs"));
        getBuilder("rusty_wall_ladder").parent(new UncheckedModelFile(modid + ":block/rusty_wall_ladder"));
        getBuilder("rusty_rungs").parent(new UncheckedModelFile(modid + ":block/rusty_rungs"));

        for(int j = 0; j < Arrays.stream(DyeColor.values()).count(); j++)
        {
            String color = DyeColor.byId(j).getSerializedName();
            getBuilder(color + "_corrugated_metal_plate_fence_gate").parent(new UncheckedModelFile(modid + ":block/" + color + "_corrugated_metal_plate_fence_gate"));
        }

        getBuilder("steel_suspended_stairs").parent(new UncheckedModelFile(modid + ":block/steel_suspended_stairs"));
        getBuilder("rusty_suspended_stairs").parent(new UncheckedModelFile(modid + ":block/rusty_suspended_stairs"));
        getBuilder("steel_large_suspended_stairs").parent(new UncheckedModelFile(modid + ":block/steel_large_suspended_stairs"));
        getBuilder("rusty_large_suspended_stairs").parent(new UncheckedModelFile(modid + ":block/rusty_large_suspended_stairs"));

        // Doors
        getBuilder("steel_door").parent(new UncheckedModelFile("item/generated")).texture("layer0", modLoc("item/steel_door"));
        getBuilder("sturdy_steel_door").parent(new UncheckedModelFile("item/generated")).texture("layer0", modLoc("item/sturdy_steel_door"));
        getBuilder("warning_steel_door").parent(new UncheckedModelFile("item/generated")).texture("layer0", modLoc("item/warning_steel_door"));
        getBuilder("white_steel_door").parent(new UncheckedModelFile("item/generated")).texture("layer0", modLoc("item/white_steel_door"));
        getBuilder("sturdy_white_steel_door").parent(new UncheckedModelFile("item/generated")).texture("layer0", modLoc("item/sturdy_white_steel_door"));
        getBuilder("warning_white_steel_door").parent(new UncheckedModelFile("item/generated")).texture("layer0", modLoc("item/warning_white_steel_door"));
        getBuilder("rusty_door").parent(new UncheckedModelFile("item/generated")).texture("layer0", modLoc("item/rusty_door"));
        getBuilder("sturdy_rusty_door").parent(new UncheckedModelFile("item/generated")).texture("layer0", modLoc("item/sturdy_rusty_door"));
        getBuilder("warning_rusty_door").parent(new UncheckedModelFile("item/generated")).texture("layer0", modLoc("item/warning_rusty_door"));
    }
}