package tv.mapper.embellishcraft.building.data.gen;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ModelFile.UncheckedModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import tv.mapper.embellishcraft.building.world.level.blocks.InitBuildingBlocks;
import tv.mapper.embellishcraft.data.gen.ECBlockStates;
import tv.mapper.embellishcraft.util.McWoods;

public class BuildingBlockStates extends ECBlockStates
{
    public BuildingBlockStates(DataGenerator gen, String modid, ExistingFileHelper exFileHelper)
    {
        super(gen, modid, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels()
    {
        // Other bricks
        registerBlockstateVariants("dark_bricks", InitBuildingBlocks.DARK_BRICKS.get(), InitBuildingBlocks.DARK_BRICKS_SLAB.get(), InitBuildingBlocks.DARK_BRICKS_STAIRS.get(), InitBuildingBlocks.DARK_BRICKS_WALL.get(), InitBuildingBlocks.DARK_BRICKS_PRESSURE_PLATE.get(), null);
        registerBlockstateVariants("old_bricks", InitBuildingBlocks.OLD_BRICKS.get(), InitBuildingBlocks.OLD_BRICKS_SLAB.get(), InitBuildingBlocks.OLD_BRICKS_STAIRS.get(), InitBuildingBlocks.OLD_BRICKS_WALL.get(), InitBuildingBlocks.OLD_BRICKS_PRESSURE_PLATE.get(), null);
        registerBlockstateVariants("weared_bricks", InitBuildingBlocks.WEARED_BRICKS.get(), InitBuildingBlocks.WEARED_BRICKS_SLAB.get(), InitBuildingBlocks.WEARED_BRICKS_STAIRS.get(), InitBuildingBlocks.WEARED_BRICKS_WALL.get(), InitBuildingBlocks.WEARED_BRICKS_PRESSURE_PLATE.get(), null);
        registerBlockstateVariants("dark_large_bricks", InitBuildingBlocks.DARK_LARGE_BRICKS.get(), InitBuildingBlocks.DARK_LARGE_BRICKS_SLAB.get(), InitBuildingBlocks.DARK_LARGE_BRICKS_STAIRS.get(), InitBuildingBlocks.DARK_LARGE_BRICKS_WALL.get(), InitBuildingBlocks.DARK_LARGE_BRICKS_PRESSURE_PLATE.get(), null);
        registerBlockstateVariants("old_large_bricks", InitBuildingBlocks.OLD_LARGE_BRICKS.get(), InitBuildingBlocks.OLD_LARGE_BRICKS_SLAB.get(), InitBuildingBlocks.OLD_LARGE_BRICKS_STAIRS.get(), InitBuildingBlocks.OLD_LARGE_BRICKS_WALL.get(), InitBuildingBlocks.OLD_LARGE_BRICKS_PRESSURE_PLATE.get(), null);
        registerBlockstateVariants("weared_large_bricks", InitBuildingBlocks.WEARED_LARGE_BRICKS.get(), InitBuildingBlocks.WEARED_LARGE_BRICKS_SLAB.get(), InitBuildingBlocks.WEARED_LARGE_BRICKS_STAIRS.get(), InitBuildingBlocks.WEARED_LARGE_BRICKS_WALL.get(), InitBuildingBlocks.WEARED_LARGE_BRICKS_PRESSURE_PLATE.get(), null);

        // Pavings
        registerBlockstateVariants("concrete_paving", InitBuildingBlocks.CONCRETE_PAVING.get(), InitBuildingBlocks.CONCRETE_PAVING_SLAB.get(), InitBuildingBlocks.CONCRETE_PAVING_STAIRS.get(), InitBuildingBlocks.CONCRETE_PAVING_WALL.get(), InitBuildingBlocks.CONCRETE_PAVING_PRESSURE_PLATE.get(), null);
        registerBlockstateVariants("damaged_paving", InitBuildingBlocks.DAMAGED_PAVING.get(), InitBuildingBlocks.DAMAGED_PAVING_SLAB.get(), InitBuildingBlocks.DAMAGED_PAVING_STAIRS.get(), InitBuildingBlocks.DAMAGED_PAVING_WALL.get(), InitBuildingBlocks.DAMAGED_PAVING_PRESSURE_PLATE.get(), null);
        registerBlockstateVariants("dark_concrete_paving", InitBuildingBlocks.DARK_CONCRETE_PAVING.get(), InitBuildingBlocks.DARK_CONCRETE_PAVING_SLAB.get(), InitBuildingBlocks.DARK_CONCRETE_PAVING_STAIRS.get(), InitBuildingBlocks.DARK_CONCRETE_PAVING_WALL.get(), InitBuildingBlocks.DARK_CONCRETE_PAVING_PRESSURE_PLATE.get(), null);
        registerBlockstateVariants("moist_paving", InitBuildingBlocks.MOIST_PAVING.get(), InitBuildingBlocks.MOIST_PAVING_SLAB.get(), InitBuildingBlocks.MOIST_PAVING_STAIRS.get(), InitBuildingBlocks.MOIST_PAVING_WALL.get(), InitBuildingBlocks.MOIST_PAVING_PRESSURE_PLATE.get(), null);
        registerBlockstateVariants("polished_paving", InitBuildingBlocks.POLISHED_PAVING.get(), InitBuildingBlocks.POLISHED_PAVING_SLAB.get(), InitBuildingBlocks.POLISHED_PAVING_STAIRS.get(), InitBuildingBlocks.POLISHED_PAVING_WALL.get(), InitBuildingBlocks.POLISHED_PAVING_PRESSURE_PLATE.get(), null);
        registerBlockstateVariants("white_concrete_paving", InitBuildingBlocks.WHITE_CONCRETE_PAVING.get(), InitBuildingBlocks.WHITE_CONCRETE_PAVING_SLAB.get(), InitBuildingBlocks.WHITE_CONCRETE_PAVING_STAIRS.get(), InitBuildingBlocks.WHITE_CONCRETE_PAVING_WALL.get(), InitBuildingBlocks.WHITE_CONCRETE_PAVING_PRESSURE_PLATE.get(), null);

        // Tiles
        registerBlockstateVariants("concrete_tiles", InitBuildingBlocks.CONCRETE_TILES.get(), InitBuildingBlocks.CONCRETE_TILES_SLAB.get(), InitBuildingBlocks.CONCRETE_TILES_STAIRS.get(), InitBuildingBlocks.CONCRETE_TILES_WALL.get(), InitBuildingBlocks.CONCRETE_TILES_PRESSURE_PLATE.get(), null);
        registerBlockstateVariants("skyblue_tiles", InitBuildingBlocks.SKYBLUE_TILES.get(), InitBuildingBlocks.SKYBLUE_TILES_SLAB.get(), InitBuildingBlocks.SKYBLUE_TILES_STAIRS.get(), InitBuildingBlocks.SKYBLUE_TILES_WALL.get(), InitBuildingBlocks.SKYBLUE_TILES_PRESSURE_PLATE.get(), null);
        registerBlockstateVariants("orange_tiles", InitBuildingBlocks.ORANGE_TILES.get(), InitBuildingBlocks.ORANGE_TILES_SLAB.get(), InitBuildingBlocks.ORANGE_TILES_STAIRS.get(), InitBuildingBlocks.ORANGE_TILES_WALL.get(), InitBuildingBlocks.ORANGE_TILES_PRESSURE_PLATE.get(), null);
        registerBlockstateVariants("blue_tiles", InitBuildingBlocks.BLUE_TILES.get(), InitBuildingBlocks.BLUE_TILES_SLAB.get(), InitBuildingBlocks.BLUE_TILES_STAIRS.get(), InitBuildingBlocks.BLUE_TILES_WALL.get(), InitBuildingBlocks.BLUE_TILES_PRESSURE_PLATE.get(), null);
        registerBlockstateVariants("light_blue_tiles", InitBuildingBlocks.LIGHT_BLUE_TILES.get(), InitBuildingBlocks.LIGHT_BLUE_TILES_SLAB.get(), InitBuildingBlocks.LIGHT_BLUE_TILES_STAIRS.get(), InitBuildingBlocks.LIGHT_BLUE_TILES_WALL.get(), InitBuildingBlocks.LIGHT_BLUE_TILES_PRESSURE_PLATE.get(), null);
        registerBlockstateVariants("red_tiles", InitBuildingBlocks.RED_TILES.get(), InitBuildingBlocks.RED_TILES_SLAB.get(), InitBuildingBlocks.RED_TILES_STAIRS.get(), InitBuildingBlocks.RED_TILES_WALL.get(), InitBuildingBlocks.RED_TILES_PRESSURE_PLATE.get(), null);
        registerBlockstateVariants("white_tiles", InitBuildingBlocks.WHITE_TILES.get(), InitBuildingBlocks.WHITE_TILES_SLAB.get(), InitBuildingBlocks.WHITE_TILES_STAIRS.get(), InitBuildingBlocks.WHITE_TILES_WALL.get(), InitBuildingBlocks.WHITE_TILES_PRESSURE_PLATE.get(), null);
        registerBlockstateVariants("yellow_tiles", InitBuildingBlocks.YELLOW_TILES.get(), InitBuildingBlocks.YELLOW_TILES_SLAB.get(), InitBuildingBlocks.YELLOW_TILES_STAIRS.get(), InitBuildingBlocks.YELLOW_TILES_WALL.get(), InitBuildingBlocks.YELLOW_TILES_PRESSURE_PLATE.get(), null);
        registerBlockstateVariants("yellow_grey_tiles", InitBuildingBlocks.YELLOW_GREY_TILES.get(), InitBuildingBlocks.YELLOW_GREY_TILES_SLAB.get(), InitBuildingBlocks.YELLOW_GREY_TILES_STAIRS.get(), InitBuildingBlocks.YELLOW_GREY_TILES_WALL.get(), InitBuildingBlocks.YELLOW_GREY_TILES_PRESSURE_PLATE.get(), null);

        // Wallpaper
        registerBlockstateVariants("white_blue_wallpaper", InitBuildingBlocks.WHITE_BLUE_WALLPAPER.get(), InitBuildingBlocks.WHITE_BLUE_WALLPAPER_SLAB.get(), InitBuildingBlocks.WHITE_BLUE_WALLPAPER_STAIRS.get(), null, null, null);
        upDownBlock(InitBuildingBlocks.WHITE_BLUE_WALLPAPER_PLINTH.get(), new UncheckedModelFile(mod_id + ":block/white_blue_wallpaper_plinth"));
        registerBlockstateVariants("beige_flower_wallpaper", InitBuildingBlocks.BEIGE_FLOWER_WALLPAPER.get(), InitBuildingBlocks.BEIGE_FLOWER_WALLPAPER_SLAB.get(), InitBuildingBlocks.BEIGE_FLOWER_WALLPAPER_STAIRS.get(), null, null, null);
        upDownBlock(InitBuildingBlocks.BEIGE_FLOWER_WALLPAPER_PLINTH.get(), new UncheckedModelFile(mod_id + ":block/beige_flower_wallpaper_plinth"));
        registerBlockstateVariants("beige_wallpaper", InitBuildingBlocks.BEIGE_WALLPAPER.get(), InitBuildingBlocks.BEIGE_WALLPAPER_SLAB.get(), InitBuildingBlocks.BEIGE_WALLPAPER_STAIRS.get(), null, null, null);
        upDownBlock(InitBuildingBlocks.BEIGE_WALLPAPER_PLINTH.get(), new UncheckedModelFile(mod_id + ":block/beige_wallpaper_plinth"));
        registerBlockstateVariants("pink_wallpaper", InitBuildingBlocks.PINK_WALLPAPER.get(), InitBuildingBlocks.PINK_WALLPAPER_SLAB.get(), InitBuildingBlocks.PINK_WALLPAPER_STAIRS.get(), null, null, null);
        upDownBlock(InitBuildingBlocks.PINK_WALLPAPER_PLINTH.get(), new UncheckedModelFile(mod_id + ":block/pink_wallpaper_plinth"));
        registerBlockstateVariants("white_green_wallpaper", InitBuildingBlocks.WHITE_GREEN_WALLPAPER.get(), InitBuildingBlocks.WHITE_GREEN_WALLPAPER_SLAB.get(), InitBuildingBlocks.WHITE_GREEN_WALLPAPER_STAIRS.get(), null, null, null);
        upDownBlock(InitBuildingBlocks.WHITE_GREEN_WALLPAPER_PLINTH.get(), new UncheckedModelFile(mod_id + ":block/white_green_wallpaper_plinth"));

        // Suspended stairs and fancy doors
        for(int j = 0; j < McWoods.values().length; j++)
        {
            horizontalBlock(InitBuildingBlocks.SUSPENDED_STAIRS_BLOCKS.get(McWoods.byId(j)).get(), new UncheckedModelFile(mod_id + ":block/" + McWoods.byId(j).getSerializedName() + "_suspended_stairs"), 0);
            horizontalBlock(InitBuildingBlocks.LARGE_SUSPENDED_STAIRS_BLOCKS.get(McWoods.byId(j)).get(), new UncheckedModelFile(mod_id + ":block/" + McWoods.byId(j).getSerializedName() + "_large_suspended_stairs"), 0);
            doorBlock(InitBuildingBlocks.FANCY_DOOR_BLOCKS.get(McWoods.byId(j)).get(), modLoc("block/" + McWoods.byId(j).getSerializedName() + "_fancy_door_bottom"), modLoc("block/" + McWoods.byId(j).getSerializedName() + "_fancy_door_top"));
            doorBlock(InitBuildingBlocks.PLAIN_DOOR_BLOCKS.get(McWoods.byId(j)).get(), modLoc("block/" + McWoods.byId(j).getSerializedName() + "_plain_door_bottom"), modLoc("block/" + McWoods.byId(j).getSerializedName() + "_plain_door_top"));
        }
    }
}