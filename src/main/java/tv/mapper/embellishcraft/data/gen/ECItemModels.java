package tv.mapper.embellishcraft.data.gen;

import java.util.Arrays;

import net.minecraft.data.DataGenerator;
import net.minecraft.item.DyeColor;
import net.minecraftforge.client.model.generators.ModelFile.UncheckedModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import tv.mapper.embellishcraft.util.McWoods;
import tv.mapper.mapperbase.data.gen.BaseItemModels;

public class ECItemModels extends BaseItemModels
{

    public ECItemModels(DataGenerator generator, String modid, ExistingFileHelper existingFileHelper)
    {
        super(generator, modid, existingFileHelper);
    }

    @Override
    public String getName()
    {
        return "EmbellishCraft Item Models";
    }

    @Override
    protected void registerModels()
    {
        registerStone("basalt");
        registerStone("slate");
        registerStone("marble");
        registerStone("gneiss");
        registerStone("jade");
        registerStone("larvikite");

        registerBlockBasics("paving_stones", true, true, true, true, true, false);

        registerMcStone("andesite");
        registerMcStone("diorite");
        registerMcStone("granite");

        registerSandstone("sandstone");
        registerSandstone("red_sandstone");

        // Terracotta
        registerBlockBasics("terracotta", false, true, true, true, true, false);
        getBuilder("terracotta_button").parent(new UncheckedModelFile(modid + ":block/terracotta_button_inventory"));
        registerBlockBasics("polished_terracotta", true, true, true, true, true, false);
        registerBlockBasics("terracotta_paving", true, true, true, true, true, false);
        registerBlockBasics("terracotta_tiles", true, true, true, true, true, false);
        registerBlockBasics("terracotta_bricks", true, true, true, true, true, false);
        registerBlockBasics("terracotta_large_bricks", true, true, true, true, true, false);
        registerBlockBasics("terracotta_paving_stones", true, true, true, true, true, false);
        registerBlockBasics("terracotta_rooftiles", true, true, true, false, false, false);

        // Other bricks
        registerBlockBasics("dark_bricks", true, true, true, true, true, false);
        registerBlockBasics("dark_large_bricks", true, true, true, true, true, false);
        registerBlockBasics("old_bricks", true, true, true, true, true, false);
        registerBlockBasics("old_large_bricks", true, true, true, true, true, false);
        registerBlockBasics("weared_bricks", true, true, true, true, true, false);
        registerBlockBasics("weared_large_bricks", true, true, true, true, true, false);

        // Pavings
        registerBlockBasics("concrete_paving", true, true, true, true, true, false);
        registerBlockBasics("damaged_paving", true, true, true, true, true, false);
        registerBlockBasics("dark_concrete_paving", true, true, true, true, true, false);
        registerBlockBasics("moist_paving", true, true, true, true, true, false);
        registerBlockBasics("polished_paving", true, true, true, true, true, false);
        registerBlockBasics("white_concrete_paving", true, true, true, true, true, false);

        // Tiles
        registerBlockBasics("concrete_tiles", true, true, true, true, true, false);
        registerBlockBasics("skyblue_tiles", true, true, true, true, true, false);
        registerBlockBasics("orange_tiles", true, true, true, true, true, false);
        registerBlockBasics("blue_tiles", true, true, true, true, true, false);
        registerBlockBasics("light_blue_tiles", true, true, true, true, true, false);
        registerBlockBasics("red_tiles", true, true, true, true, true, false);
        registerBlockBasics("white_tiles", true, true, true, true, true, false);
        registerBlockBasics("yellow_tiles", true, true, true, true, true, false);
        registerBlockBasics("yellow_grey_tiles", true, true, true, true, true, false);

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

        // Wallpapers
        registerBlockBasics("white_blue_wallpaper", true, true, true, false, false, false);
        getBuilder("white_blue_wallpaper_plinth").parent(new UncheckedModelFile(modid + ":block/white_blue_wallpaper_plinth"));
        registerBlockBasics("beige_flower_wallpaper", true, true, true, false, false, false);
        getBuilder("beige_flower_wallpaper_plinth").parent(new UncheckedModelFile(modid + ":block/beige_flower_wallpaper_plinth"));
        registerBlockBasics("beige_wallpaper", true, true, true, false, false, false);
        getBuilder("beige_wallpaper_plinth").parent(new UncheckedModelFile(modid + ":block/beige_wallpaper_plinth"));
        registerBlockBasics("pink_wallpaper", true, true, true, false, false, false);
        getBuilder("pink_wallpaper_plinth").parent(new UncheckedModelFile(modid + ":block/pink_wallpaper_plinth"));
        registerBlockBasics("white_green_wallpaper", true, true, true, false, false, false);
        getBuilder("white_green_wallpaper_plinth").parent(new UncheckedModelFile(modid + ":block/white_green_wallpaper_plinth"));

        // Furniture
        for(int j = 0; j < Arrays.stream(McWoods.values()).count(); j++)
        {
            getBuilder(McWoods.byId(j).getString() + "_terrace_table").parent(new UncheckedModelFile(modid + ":block/" + McWoods.byId(j).getString() + "_terrace_table"));
            getBuilder(McWoods.byId(j).getString() + "_terrace_chair").parent(new UncheckedModelFile(modid + ":block/" + McWoods.byId(j).getString() + "_terrace_chair"));
            getBuilder(McWoods.byId(j).getString() + "_chair").parent(new UncheckedModelFile(modid + ":block/" + McWoods.byId(j).getString() + "_chair"));
            getBuilder(McWoods.byId(j).getString() + "_table").parent(new UncheckedModelFile(modid + ":block/" + McWoods.byId(j).getString() + "_table_inventory"));
            getBuilder(McWoods.byId(j).getString() + "_fancy_table").parent(new UncheckedModelFile(modid + ":block/" + McWoods.byId(j).getString() + "_fancy_table_inventory"));
        }

        getBuilder("steel_terrace_table").parent(new UncheckedModelFile(modid + ":block/steel_terrace_table"));
        getBuilder("steel_terrace_chair").parent(new UncheckedModelFile(modid + ":block/steel_terrace_chair"));

        for(int j = 0; j < Arrays.stream(DyeColor.values()).count(); j++)
        {
            String color = DyeColor.byId(j).getString();
            getBuilder(color + "_couch").parent(new UncheckedModelFile(modid + ":block/" + color + "_couch"));
            getBuilder(color + "_table_lamp").parent(new UncheckedModelFile(modid + ":block/" + color + "_table_lamp"));
            getBuilder(color + "_pillow").parent(new UncheckedModelFile(modid + ":block/" + color + "_pillow"));
            getBuilder(color + "_corrugated_metal_plate_fence_gate").parent(new UncheckedModelFile(modid + ":block/" + color + "_corrugated_metal_plate_fence_gate"));
        }

        getBuilder("plate").parent(new UncheckedModelFile("item/generated")).texture("layer0", modLoc("item/plate"));

        // Suspended stairs, doors, crates, beds
        for(int j = 0; j < Arrays.stream(McWoods.values()).count(); j++)
        {
            getBuilder(McWoods.byId(j).getString() + "_suspended_stairs").parent(new UncheckedModelFile(modid + ":block/" + McWoods.byId(j).getString() + "_suspended_stairs"));
            getBuilder(McWoods.byId(j).getString() + "_fancy_door").parent(new UncheckedModelFile("item/generated")).texture("layer0", modLoc("item/" + McWoods.byId(j).getString() + "_fancy_door"));
            getBuilder(McWoods.byId(j).getString() + "_plain_door").parent(new UncheckedModelFile("item/generated")).texture("layer0", modLoc("item/" + McWoods.byId(j).getString() + "_plain_door"));
            getBuilder(McWoods.byId(j).getString() + "_wooden_crate").parent(new UncheckedModelFile(modid + ":block/" + McWoods.byId(j).getString() + "_wooden_crate"));
            getBuilder(McWoods.byId(j).getString() + "_fancy_chest").parent(new UncheckedModelFile(modid + ":block/" + McWoods.byId(j).getString() + "_fancy_chest"));

            for(int i = 0; i < Arrays.stream(DyeColor.values()).count(); i++)
            {
                getBuilder(DyeColor.byId(i).getString() + "_" + McWoods.byId(j).getString() + "_fancy_bed").parent(
                    new UncheckedModelFile(modid + ":block/" + DyeColor.byId(i).getString() + "_" + McWoods.byId(j).getString() + "_fancy_bed_inventory"));
            }
        }
        getBuilder("locker").parent(new UncheckedModelFile(modid + ":block/locker_small"));

        getBuilder("steel_suspended_stairs").parent(new UncheckedModelFile(modid + ":block/steel_suspended_stairs"));
        getBuilder("rusty_suspended_stairs").parent(new UncheckedModelFile(modid + ":block/rusty_suspended_stairs"));

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

    private void registerStone(String name)
    {
        registerBlockBasics(name, true, true, true, true, true, false);
        getBuilder(name + "_button").parent(new UncheckedModelFile(modid + ":block/" + name + "_button_inventory"));
        registerBlockBasics(name + "_cobblestone", true, true, true, true, true, false);
        registerBlockBasics("smooth_" + name, true, true, true, true, true, false);
        registerBlockBasics("polished_" + name, true, true, true, true, true, false);
        registerBlockBasics(name + "_paving", true, true, true, true, true, false);
        registerBlockBasics(name + "_tiles", true, true, true, true, true, false);
        registerBlockBasics(name + "_bricks", true, true, true, true, true, false);
        registerBlockBasics(name + "_large_bricks", true, true, true, true, true, false);
        registerBlockBasics(name + "_paving_stones", true, true, true, true, true, false);
        registerBlockBasics(name + "_ornament", true, false, false, false, true, false);
        registerBlockBasics(name + "_rooftiles", true, true, true, false, false, false);

    }

    private void registerMcStone(String name)
    {
        registerBlockBasics("smooth_" + name, true, true, true, true, true, false);
        getBuilder(name + "_button").parent(new UncheckedModelFile(modid + ":block/" + name + "_button_inventory"));
        registerBlockBasics(name + "_paving", true, true, true, true, true, false);
        registerBlockBasics(name + "_tiles", true, true, true, true, true, false);
        registerBlockBasics(name + "_bricks", true, true, true, true, true, false);
        registerBlockBasics(name + "_large_bricks", true, true, true, true, true, false);
        registerBlockBasics(name + "_paving_stones", true, true, true, true, true, false);
        registerBlockBasics(name + "_ornament", true, false, false, false, true, false);
        registerBlockBasics(name + "_rooftiles", true, true, true, false, false, false);
    }

    private void registerSandstone(String name)
    {
        getBuilder(name + "_button").parent(new UncheckedModelFile(modid + ":block/" + name + "_button_inventory"));
        registerBlockBasics("smooth_" + name, false, false, false, true, true, false);
        registerBlockBasics("polished_" + name, true, true, true, true, true, false);
        registerBlockBasics(name + "_paving", true, true, true, true, true, false);
        registerBlockBasics(name + "_tiles", true, true, true, true, true, false);
        registerBlockBasics(name + "_bricks", true, true, true, true, true, false);
        registerBlockBasics(name + "_large_bricks", true, true, true, true, true, false);
        registerBlockBasics(name + "_paving_stones", true, true, true, true, true, false);
        registerBlockBasics(name + "_rooftiles", true, true, true, false, false, false);
    }
}