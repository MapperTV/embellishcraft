package tv.mapper.embellishcraft.data.gen;

import java.util.Arrays;

import net.minecraft.data.DataGenerator;
import net.minecraft.item.DyeColor;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.data.ExistingFileHelper;
import tv.mapper.embellishcraft.ECConstants;
import tv.mapper.embellishcraft.util.McWoods;
import tv.mapper.mapperbase.MapperBase;
import tv.mapper.mapperbase.data.gen.BaseBlockModels;

public class ECBlockModels extends BaseBlockModels
{
    public ECBlockModels(DataGenerator generator, String modid, ExistingFileHelper existingFileHelper)
    {
        super(generator, modid, existingFileHelper);
    }

    @Override
    public String getName()
    {
        return "EmbellishCraft Block Models";
    }

    @Override
    protected void registerModels()
    {
        buildAllStone("basalt");
        buildRooftilesStairs("basalt_rooftiles");

        buildAllStone("slate");
        buildRooftilesStairs("slate_rooftiles");

        buildAllStone("marble");
        buildRooftilesStairs("marble_rooftiles");

        buildAllStone("gneiss");
        buildRooftilesStairs("gneiss_rooftiles");

        buildAllStone("jade");
        buildRooftilesStairs("jade_rooftiles");

        buildAllStone("larvikite");
        buildRooftilesStairs("larvikite_rooftiles");

        buildMcStone("andesite");
        buildRooftilesStairs("andesite_rooftiles");

        buildMcStone("diorite");
        buildRooftilesStairs("diorite_rooftiles");

        buildMcStone("granite");
        buildRooftilesStairs("granite_rooftiles");

        buildMcSandstone("sandstone");
        buildRooftilesStairs("sandstone_rooftiles");

        buildMcSandstone("red_sandstone");
        buildRooftilesStairs("red_sandstone_rooftiles");

        buildWall("paving_stones", modLoc("block/paving_stones"));
        buildPressure("paving_stones", modLoc("block/paving_stones"));

        // Terracotta
        buildWall("terracotta", mcLoc("block/terracotta"));
        buildWall("polished_terracotta", modLoc("block/polished_terracotta"));
        buildWall("terracotta_paving", modLoc("block/terracotta_paving"));
        buildWall("terracotta_tiles", modLoc("block/terracotta_tiles"));
        buildWall("terracotta_bricks", modLoc("block/terracotta_bricks"));
        buildWall("terracotta_large_bricks", modLoc("block/terracotta_large_bricks"));
        buildWall("terracotta_paving_stones", modLoc("block/terracotta_paving_stones"));
        buildButton("terracotta", mcLoc("block/terracotta"));

        buildPressure("terracotta", mcLoc("block/terracotta"));
        buildPressure("polished_terracotta", modLoc("block/polished_terracotta"));
        buildPressure("terracotta_paving", modLoc("block/terracotta_paving"));
        buildPressure("terracotta_tiles", modLoc("block/terracotta_tiles"));
        buildPressure("terracotta_bricks", modLoc("block/terracotta_bricks"));
        buildPressure("terracotta_large_bricks", modLoc("block/terracotta_large_bricks"));
        buildPressure("terracotta_paving_stones", modLoc("block/terracotta_paving_stones"));

        buildRooftilesStairs("terracotta_rooftiles");

        // Other bricks
        buildWall("dark_bricks", modLoc("block/dark_bricks"));
        buildWall("old_bricks", modLoc("block/old_bricks"));
        buildWall("weared_bricks", modLoc("block/weared_bricks"));
        buildPressure("dark_bricks", modLoc("block/dark_bricks"));
        buildPressure("old_bricks", modLoc("block/old_bricks"));
        buildPressure("weared_bricks", modLoc("block/weared_bricks"));

        buildWall("dark_large_bricks", modLoc("block/dark_large_bricks"));
        buildWall("old_large_bricks", modLoc("block/old_large_bricks"));
        buildWall("weared_large_bricks", modLoc("block/weared_large_bricks"));
        buildPressure("dark_large_bricks", modLoc("block/dark_large_bricks"));
        buildPressure("old_large_bricks", modLoc("block/old_large_bricks"));
        buildPressure("weared_large_bricks", modLoc("block/weared_large_bricks"));

        // Pavings
        buildWall("concrete_paving", modLoc("block/concrete_paving"));
        buildWall("damaged_paving", modLoc("block/damaged_paving"));
        buildWall("dark_concrete_paving", modLoc("block/dark_concrete_paving"));
        buildWall("moist_paving", modLoc("block/moist_paving"));
        buildWall("polished_paving", modLoc("block/polished_paving"));
        buildWall("white_concrete_paving", modLoc("block/white_concrete_paving"));
        buildPressure("concrete_paving", modLoc("block/concrete_paving"));
        buildPressure("damaged_paving", modLoc("block/damaged_paving"));
        buildPressure("dark_concrete_paving", modLoc("block/dark_concrete_paving"));
        buildPressure("moist_paving", modLoc("block/moist_paving"));
        buildPressure("polished_paving", modLoc("block/polished_paving"));
        buildPressure("white_concrete_paving", modLoc("block/white_concrete_paving"));

        // Tiles
        buildWall("concrete_tiles", modLoc("block/concrete_tiles"));
        buildWall("skyblue_tiles", modLoc("block/skyblue_tiles"));
        buildWall("orange_tiles", modLoc("block/orange_tiles"));
        buildWall("blue_tiles", modLoc("block/blue_tiles"));
        buildWall("light_blue_tiles", modLoc("block/light_blue_tiles"));
        buildWall("red_tiles", modLoc("block/red_tiles"));
        buildWall("white_tiles", modLoc("block/white_tiles"));
        buildWall("yellow_tiles", modLoc("block/yellow_tiles"));
        buildWall("yellow_grey_tiles", modLoc("block/yellow_grey_tiles"));
        buildPressure("concrete_tiles", modLoc("block/concrete_tiles"));
        buildPressure("skyblue_tiles", modLoc("block/skyblue_tiles"));
        buildPressure("orange_tiles", modLoc("block/orange_tiles"));
        buildPressure("blue_tiles", modLoc("block/blue_tiles"));
        buildPressure("light_blue_tiles", modLoc("block/light_blue_tiles"));
        buildPressure("red_tiles", modLoc("block/red_tiles"));
        buildPressure("white_tiles", modLoc("block/white_tiles"));
        buildPressure("yellow_tiles", modLoc("block/yellow_tiles"));
        buildPressure("yellow_grey_tiles", modLoc("block/yellow_grey_tiles"));

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

        cubeColumn("bulkhead", modLoc("block/bulkhead"), new ResourceLocation(MapperBase.MODID, "block/concrete"));
        cubeColumn("bulkhead_top", modLoc("block/bulkhead_top"), new ResourceLocation(MapperBase.MODID, "block/concrete"));

        getBuilder("steel_wall_ladder").parent(getExistingFile(modLoc("block/wall_ladder"))).texture("material", new ResourceLocation(MapperBase.MODID, "block/steel_block")).texture("particle", new ResourceLocation(MapperBase.MODID, "block/steel_block"));
        getBuilder("rusty_wall_ladder").parent(getExistingFile(modLoc("block/wall_ladder"))).texture("material", modLoc("block/rust")).texture("particle", modLoc("block/rust"));
        getBuilder("steel_rungs").parent(getExistingFile(modLoc("block/rungs"))).texture("material", new ResourceLocation(MapperBase.MODID, "block/steel_block")).texture("particle", new ResourceLocation(MapperBase.MODID, "block/steel_block"));
        getBuilder("rusty_rungs").parent(getExistingFile(modLoc("block/rungs"))).texture("material", modLoc("block/rust")).texture("particle", modLoc("block/rust"));

        // Wallpaper
        buildWallpaper("white_blue_wallpaper", modLoc("block/white_blue_wallpaper"), modLoc("block/side_wallpaper"), modLoc("block/white_blue_wallpaper_plinth"));
        buildWallpaper("beige_flower_wallpaper", modLoc("block/beige_flower_wallpaper"), modLoc("block/side_wallpaper"), modLoc("block/beige_flower_wallpaper_plinth"));
        buildWallpaper("beige_wallpaper", modLoc("block/beige_wallpaper"), modLoc("block/side_wallpaper"), modLoc("block/beige_wallpaper_plinth"));
        buildWallpaper("pink_wallpaper", modLoc("block/pink_wallpaper"), modLoc("block/side_wallpaper"), modLoc("block/pink_wallpaper_plinth"));
        buildWallpaper("white_green_wallpaper", modLoc("block/white_green_wallpaper"), modLoc("block/side_wallpaper"), modLoc("block/white_green_wallpaper_plinth"));

        // furniture
        for(int j = 0; j < Arrays.stream(McWoods.values()).count(); j++)
        {
            getBuilder(McWoods.byId(j).getString() + "_chair").parent(getExistingFile(modLoc("block/chair"))).texture("material", new ResourceLocation("block/" + McWoods.byId(j).getString() + "_planks")).texture("particle", new ResourceLocation("block/" + McWoods.byId(j).getString() + "_planks"));
            getBuilder(McWoods.byId(j).getString() + "_terrace_chair").parent(getExistingFile(modLoc("block/terrace_chair"))).texture("material", new ResourceLocation(ECConstants.MODID, "block/" + McWoods.byId(j).getString() + "_terrace_table")).texture("particle", new ResourceLocation(ECConstants.MODID, "block/" + McWoods.byId(j).getString() + "_terrace_table"));
            getBuilder(McWoods.byId(j).getString() + "_terrace_table").parent(getExistingFile(modLoc("block/terrace_table"))).texture("material", new ResourceLocation(ECConstants.MODID, "block/" + McWoods.byId(j).getString() + "_terrace_table")).texture("particle", new ResourceLocation(ECConstants.MODID, "block/" + McWoods.byId(j).getString() + "_terrace_table"));

            getBuilder(McWoods.byId(j).getString() + "_table_foot").parent(getExistingFile(modLoc("block/table_foot"))).texture("material", new ResourceLocation("block/" + McWoods.byId(j).getString() + "_planks")).texture("particle", new ResourceLocation("block/" + McWoods.byId(j).getString() + "_planks"));
            getBuilder(McWoods.byId(j).getString() + "_table_inventory").parent(getExistingFile(modLoc("block/table_inventory"))).texture("material", new ResourceLocation("block/" + McWoods.byId(j).getString() + "_planks"));
            getBuilder(McWoods.byId(j).getString() + "_table_top").parent(getExistingFile(modLoc("block/table_top"))).texture("material", new ResourceLocation("block/" + McWoods.byId(j).getString() + "_planks")).texture("particle", new ResourceLocation("block/" + McWoods.byId(j).getString() + "_planks"));

            getBuilder(McWoods.byId(j).getString() + "_fancy_table_foot").parent(getExistingFile(modLoc("block/fancy_table_foot"))).texture("side", new ResourceLocation(ECConstants.MODID, "block/" + McWoods.byId(j).getString() + "_fancy_table_side")).texture("top", new ResourceLocation(ECConstants.MODID, "block/" + McWoods.byId(j).getString() + "_fancy_table_top")).texture("particle", new ResourceLocation("block/" + McWoods.byId(j).getString() + "_planks"));
            getBuilder(McWoods.byId(j).getString() + "_fancy_table_inventory").parent(getExistingFile(modLoc("block/fancy_table_inventory"))).texture("side", new ResourceLocation(ECConstants.MODID, "block/" + McWoods.byId(j).getString() + "_fancy_table_side")).texture("top", new ResourceLocation(ECConstants.MODID, "block/" + McWoods.byId(j).getString() + "_fancy_table_top"));
            getBuilder(McWoods.byId(j).getString() + "_fancy_table_top").parent(getExistingFile(modLoc("block/fancy_table_top"))).texture("side", new ResourceLocation(ECConstants.MODID, "block/" + McWoods.byId(j).getString() + "_fancy_table_side")).texture("top", new ResourceLocation(ECConstants.MODID, "block/" + McWoods.byId(j).getString() + "_fancy_table_top")).texture("particle", new ResourceLocation("block/" + McWoods.byId(j).getString() + "_planks"));
        }

        getBuilder("steel_terrace_chair").parent(getExistingFile(modLoc("block/terrace_chair"))).texture("material", new ResourceLocation(ECConstants.MODID, "block/steel_terrace_table")).texture("particle", new ResourceLocation(ECConstants.MODID, "block/steel_terrace_table"));
        getBuilder("steel_terrace_table").parent(getExistingFile(modLoc("block/terrace_table"))).texture("material", new ResourceLocation(ECConstants.MODID, "block/steel_terrace_table")).texture("particle", new ResourceLocation(ECConstants.MODID, "block/steel_terrace_table"));

        for(int j = 0; j < Arrays.stream(DyeColor.values()).count(); j++)
        {
            buildTableLamp(DyeColor.byId(j).getString());
            buildCouch(DyeColor.byId(j).getString());
            getBuilder(DyeColor.byId(j).getString() + "_pillow").parent(getExistingFile(modLoc("block/pillow"))).texture("all", new ResourceLocation("block/" + DyeColor.byId(j).getString() + "_wool")).texture("particle", new ResourceLocation("block/" + DyeColor.byId(j).getString() + "_wool"));
            getBuilder(DyeColor.byId(j).getString() + "_corrugated_metal_plate_fence_inventory").parent(getExistingFile(mcLoc("block/fence_inventory"))).texture("texture", modLoc("block/" + DyeColor.byId(j).getString() + "_corrugated_metal_plate"));
        }

        // Suspended stairs, chests
        for(int j = 0; j < Arrays.stream(McWoods.values()).count(); j++)
        {
            getBuilder(McWoods.byId(j).getString() + "_suspended_stairs").parent(getExistingFile(modLoc("block/suspended_stairs"))).texture("all", new ResourceLocation("block/" + McWoods.byId(j).getString() + "_planks"));
            // getBuilder(McWoods.byId(j).getString() + "_fancy_chest").texture("particle", new ResourceLocation("block/" + McWoods.byId(j).getString() + "_planks"));
            getBuilder(McWoods.byId(j).getString() + "_fancy_chest").parent(getExistingFile(modLoc("block/chest"))).texture("particle", new ResourceLocation("block/" + McWoods.byId(j).getString() + "_planks")).texture("front", new ResourceLocation(ECConstants.MODID, "block/" + McWoods.byId(j).getString() + "_fancy_chest_front")).texture("side", new ResourceLocation(ECConstants.MODID, "block/" + McWoods.byId(j).getString() + "_fancy_chest_side")).texture("top", new ResourceLocation(ECConstants.MODID, "block/" + McWoods.byId(j).getString() + "_fancy_chest_top")).texture("bottom", new ResourceLocation(ECConstants.MODID, "block/" + McWoods.byId(j).getString() + "_fancy_chest_bottom")).texture("lock", new ResourceLocation(ECConstants.MODID, "block/air_duct")).texture("particle", new ResourceLocation("block/" + McWoods.byId(j).getString() + "_planks"));
            getBuilder(McWoods.byId(j).getString() + "_fancy_chest_left").parent(getExistingFile(modLoc("block/chest_left"))).texture("particle", new ResourceLocation("block/" + McWoods.byId(j).getString() + "_planks")).texture("front", new ResourceLocation(ECConstants.MODID, "block/" + McWoods.byId(j).getString() + "_fancy_chest_front_right")).texture("side", new ResourceLocation(ECConstants.MODID, "block/" + McWoods.byId(j).getString() + "_fancy_chest_side")).texture("top", new ResourceLocation(ECConstants.MODID, "block/" + McWoods.byId(j).getString() + "_fancy_chest_top_right")).texture("bottom", new ResourceLocation(ECConstants.MODID, "block/" + McWoods.byId(j).getString() + "_fancy_chest_bottom_right")).texture("back", new ResourceLocation(ECConstants.MODID, "block/" + McWoods.byId(j).getString() + "_fancy_chest_side_left")).texture("lock", new ResourceLocation(ECConstants.MODID, "block/air_duct"));
            getBuilder(McWoods.byId(j).getString() + "_fancy_chest_right").parent(getExistingFile(modLoc("block/chest_right"))).texture("particle", new ResourceLocation("block/" + McWoods.byId(j).getString() + "_planks")).texture("front", new ResourceLocation(ECConstants.MODID, "block/" + McWoods.byId(j).getString() + "_fancy_chest_front_left")).texture("side", new ResourceLocation(ECConstants.MODID, "block/" + McWoods.byId(j).getString() + "_fancy_chest_side")).texture("top", new ResourceLocation(ECConstants.MODID, "block/" + McWoods.byId(j).getString() + "_fancy_chest_top_left")).texture("bottom", new ResourceLocation(ECConstants.MODID, "block/" + McWoods.byId(j).getString() + "_fancy_chest_bottom_left")).texture("back", new ResourceLocation(ECConstants.MODID, "block/" + McWoods.byId(j).getString() + "_fancy_chest_side_right")).texture("lock", new ResourceLocation(ECConstants.MODID, "block/air_duct"));
            cubeColumn(McWoods.byId(j).getString() + "_wooden_crate", modLoc("block/" + McWoods.byId(j).getString() + "_wooden_crate"), modLoc("block/" + McWoods.byId(j).getString() + "_wooden_crate_top"));
        }

        getBuilder("locker_small").parent(getExistingFile(modLoc("block/locker"))).texture("front", new ResourceLocation(ECConstants.MODID, "block/locker_front_small")).texture("side", new ResourceLocation(ECConstants.MODID, "block/locker_side_bottom")).texture("top", new ResourceLocation(ECConstants.MODID, "block/locker_top")).texture("bottom", new ResourceLocation(ECConstants.MODID, "block/locker_bottom")).texture("particle", new ResourceLocation(ECConstants.MODID, "block/locker_side_bottom"));
        getBuilder("locker_top").parent(getExistingFile(modLoc("block/locker"))).texture("front", new ResourceLocation(ECConstants.MODID, "block/locker_front_top")).texture("side", new ResourceLocation(ECConstants.MODID, "block/locker_side_top")).texture("top", new ResourceLocation(ECConstants.MODID, "block/locker_top")).texture("bottom", new ResourceLocation(ECConstants.MODID, "block/locker_bottom")).texture("particle", new ResourceLocation(ECConstants.MODID, "block/locker_side_top"));
        getBuilder("locker_bottom").parent(getExistingFile(modLoc("block/locker"))).texture("front", new ResourceLocation(ECConstants.MODID, "block/locker_front_bottom")).texture("side", new ResourceLocation(ECConstants.MODID, "block/locker_side_bottom")).texture("top", new ResourceLocation(ECConstants.MODID, "block/locker_top")).texture("bottom", new ResourceLocation(ECConstants.MODID, "block/locker_bottom")).texture("particle", new ResourceLocation(ECConstants.MODID, "block/locker_side_bottom"));

        getBuilder("steel_suspended_stairs").parent(getExistingFile(modLoc("block/suspended_stairs"))).texture("all", new ResourceLocation(ECConstants.MODID, "block/steel_beam"));
        getBuilder("rusty_suspended_stairs").parent(getExistingFile(modLoc("block/suspended_stairs"))).texture("all", new ResourceLocation(ECConstants.MODID, "block/rust"));

        // Beds
        for(int i = 0; i < Arrays.stream(McWoods.values()).count(); i++)
        {
            for(int j = 0; j < Arrays.stream(DyeColor.values()).count(); j++)
            {
                buildBed(DyeColor.byId(j).getString(), McWoods.byId(i).getString(), "fancy_bed", "minecraft");
            }
        }
    }

    protected void buildBed(String color, String wood, String name, String planks_modid)
    {
        getBuilder(color + "_" + wood + "_" + name + "_head").parent(getExistingFile(new ResourceLocation(ECConstants.MODID, "block/" + name + "_head"))).texture("head", new ResourceLocation(modid, "block/" + color + "_" + wood + "_" + name + "_head")).texture("head_side", new ResourceLocation(modid, "block/" + color + "_" + wood + "_" + name + "_head_side")).texture("head_end", new ResourceLocation(modid, "block/" + wood + "_" + name + "_head_end")).texture("under", new ResourceLocation(planks_modid, "block/" + wood + "_planks")).texture("particle", new ResourceLocation(planks_modid, "block/" + wood + "_planks"));
        getBuilder(color + "_" + wood + "_" + name + "_foot").parent(getExistingFile(new ResourceLocation(ECConstants.MODID, "block/" + name + "_foot"))).texture("foot", new ResourceLocation(modid, "block/" + color + "_" + wood + "_" + name + "_foot")).texture("foot_side", new ResourceLocation(modid, "block/" + color + "_" + wood + "_" + name + "_foot_side")).texture("foot_end", new ResourceLocation(modid, "block/" + wood + "_" + name + "_foot_end")).texture("under", new ResourceLocation(planks_modid, "block/" + wood + "_planks")).texture("particle", new ResourceLocation(planks_modid, "block/" + wood + "_planks"));
        getBuilder(color + "_" + wood + "_" + name + "_inventory").parent(getExistingFile(new ResourceLocation(ECConstants.MODID, "block/" + name + "_inventory"))).texture("bed", new ResourceLocation(modid, "block/" + color + "_" + wood + "_" + name + "_head")).texture("end", new ResourceLocation(modid, "block/" + wood + "_" + name + "_head_end")).texture("under", new ResourceLocation(planks_modid, "block/" + wood + "_planks"));
    }

    protected void buildCouch(String color)
    {
        getBuilder(color + "_couch").parent(getExistingFile(modLoc("block/couch"))).texture("fabric", new ResourceLocation("block/" + color + "_wool")).texture("base", new ResourceLocation("block/oak_planks")).texture("back", new ResourceLocation("block/stripped_oak_log")).texture("particle", new ResourceLocation("block/" + color + "_wool"));
        getBuilder(color + "_couch_right").parent(getExistingFile(modLoc("block/couch_right"))).texture("fabric", new ResourceLocation("block/" + color + "_wool")).texture("particle", new ResourceLocation("block/" + color + "_wool"));
        getBuilder(color + "_couch_left").parent(getExistingFile(modLoc("block/couch_left"))).texture("fabric", new ResourceLocation("block/" + color + "_wool")).texture("particle", new ResourceLocation("block/" + color + "_wool"));
        getBuilder("inner_" + color + "_couch").parent(getExistingFile(modLoc("block/inner_couch"))).texture("fabric", new ResourceLocation("block/" + color + "_wool")).texture("base", new ResourceLocation("block/oak_planks")).texture("back", new ResourceLocation("block/stripped_oak_log")).texture("particle", new ResourceLocation("block/" + color + "_wool"));
        getBuilder("outer_" + color + "_couch").parent(getExistingFile(modLoc("block/outer_couch"))).texture("fabric", new ResourceLocation("block/" + color + "_wool")).texture("base", new ResourceLocation("block/oak_planks")).texture("back", new ResourceLocation("block/stripped_oak_log")).texture("particle", new ResourceLocation("block/" + color + "_wool"));
    }

    protected void buildTableLamp(String color)
    {
        getBuilder(color + "_table_lamp").parent(getExistingFile(modLoc("block/table_lamp"))).texture("texture", new ResourceLocation(ECConstants.MODID, "block/" + color + "_table_lamp")).texture("particle", new ResourceLocation(ECConstants.MODID, "block/" + color + "_table_lamp"));
        getBuilder(color + "_table_lamp_on").parent(getExistingFile(modLoc("block/table_lamp"))).texture("texture", new ResourceLocation(ECConstants.MODID, "block/" + color + "_table_lamp_on")).texture("particle", new ResourceLocation(ECConstants.MODID, "block/" + color + "_table_lamp_on"));
        getBuilder(color + "_manual_table_lamp").parent(getExistingFile(modLoc("block/table_lamp"))).texture("texture", new ResourceLocation(ECConstants.MODID, "block/" + color + "_table_lamp")).texture("particle", new ResourceLocation(ECConstants.MODID, "block/" + color + "_table_lamp"));
        getBuilder(color + "_manual_table_lamp_on").parent(getExistingFile(modLoc("block/table_lamp"))).texture("texture", new ResourceLocation(ECConstants.MODID, "block/" + color + "_table_lamp_on")).texture("particle", new ResourceLocation(ECConstants.MODID, "block/" + color + "_table_lamp_on"));
    }

    protected void buildWallpaper(String name, ResourceLocation side, ResourceLocation bottom, ResourceLocation plinth)
    {
        cubeColumn(name, side, bottom);
        stairs(name + "_stairs", side, bottom, side);
        stairsInner(name + "_stairs_inner", side, bottom, side);
        stairsOuter(name + "_stairs_outer", side, bottom, side);
        slab(name + "_slab", side, bottom, side);
        slabTop(name + "_slab_top", side, bottom, side);
        getBuilder(name + "_plinth").parent(getExistingFile(mcLoc("block/cube_column"))).texture("side", plinth).texture("end", bottom);
    }

    protected void buildAllStoneWall(String name)
    {
        buildWall(name, modLoc("block/" + name));
        buildWall(name + "_cobblestone", modLoc("block/" + name + "_cobblestone"));
        buildWall(name + "_cobblestone_bricks", modLoc("block/" + name + "_cobblestone_bricks"));
        buildWall("smooth_" + name, modLoc("block/smooth_" + name));
        buildWall("polished_" + name, modLoc("block/polished_" + name));
        buildWall(name + "_paving", modLoc("block/" + name + "_paving"));
        buildWall(name + "_tiles", modLoc("block/" + name + "_tiles"));
        buildWall(name + "_bricks", modLoc("block/" + name + "_bricks"));
        buildWall(name + "_large_bricks", modLoc("block/" + name + "_large_bricks"));
        buildWall(name + "_paving_stones", modLoc("block/" + name + "_paving_stones"));
    }

    protected void buildAllStonePressure(String name)
    {
        buildPressure(name, modLoc("block/" + name));
        buildPressure(name + "_cobblestone", modLoc("block/" + name + "_cobblestone"));
        buildPressure(name + "_cobblestone_bricks", modLoc("block/" + name + "_cobblestone_bricks"));
        buildPressure("smooth_" + name, modLoc("block/smooth_" + name));
        buildPressure("polished_" + name, modLoc("block/polished_" + name));
        buildPressure(name + "_paving", modLoc("block/" + name + "_paving"));
        buildPressure(name + "_tiles", modLoc("block/" + name + "_tiles"));
        buildPressure(name + "_bricks", modLoc("block/" + name + "_bricks"));
        buildPressure(name + "_large_bricks", modLoc("block/" + name + "_large_bricks"));
        buildPressure(name + "_paving_stones", modLoc("block/" + name + "_paving_stones"));
        buildPressure(name + "_ornament", modLoc("block/" + name + "_ornament"));
    }

    protected void buildAllStone(String name)
    {
        buildAllStoneWall(name);
        buildAllStonePressure(name);
        buildButton(name, modLoc("block/" + name));
    }

    protected void buildMcStone(String name)
    {
        buildWall("smooth_" + name, modLoc("block/smooth_" + name));
        buildPressure("smooth_" + name, modLoc("block/smooth_" + name));
        buildButton(name, mcLoc("block/" + name));

        buildWall(name + "_paving", modLoc("block/" + name + "_paving"));
        buildPressure(name + "_paving", modLoc("block/" + name + "_paving"));

        buildWall(name + "_tiles", modLoc("block/" + name + "_tiles"));
        buildPressure(name + "_tiles", modLoc("block/" + name + "_tiles"));

        buildWall(name + "_bricks", modLoc("block/" + name + "_bricks"));
        buildPressure(name + "_bricks", modLoc("block/" + name + "_bricks"));

        buildWall(name + "_large_bricks", modLoc("block/" + name + "_large_bricks"));
        buildPressure(name + "_large_bricks", modLoc("block/" + name + "_large_bricks"));

        buildWall(name + "_paving_stones", modLoc("block/" + name + "_paving_stones"));
        buildPressure(name + "_paving_stones", modLoc("block/" + name + "_paving_stones"));

        buildPressure(name + "_ornament", modLoc("block/" + name + "_ornament"));
    }

    protected void buildMcSandstone(String name)
    {
        buildButton(name, mcLoc("block/" + name));

        buildWall("smooth_" + name, mcLoc("block/" + name + "_top"));
        buildPressure("smooth_" + name, mcLoc("block/" + name + "_top"));

        buildWall("polished_" + name, modLoc("block/polished_" + name));
        buildPressure("polished_" + name, modLoc("block/polished_" + name));

        buildWall(name + "_paving", modLoc("block/" + name + "_paving"));
        buildPressure(name + "_paving", modLoc("block/" + name + "_paving"));

        buildWall(name + "_tiles", modLoc("block/" + name + "_tiles"));
        buildPressure(name + "_tiles", modLoc("block/" + name + "_tiles"));

        buildWall(name + "_bricks", modLoc("block/" + name + "_bricks"));
        buildPressure(name + "_bricks", modLoc("block/" + name + "_bricks"));

        buildWall(name + "_large_bricks", modLoc("block/" + name + "_large_bricks"));
        buildPressure(name + "_large_bricks", modLoc("block/" + name + "_large_bricks"));

        buildWall(name + "_paving_stones", modLoc("block/" + name + "_paving_stones"));
        buildPressure(name + "_paving_stones", modLoc("block/" + name + "_paving_stones"));
    }
}