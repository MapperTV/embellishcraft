package tv.mapper.embellishcraft.building.data;

import net.minecraft.data.PackOutput;
import net.minecraft.world.item.DyeColor;
import net.neoforged.neoforge.client.model.generators.ModelFile.UncheckedModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import tv.mapper.embellishcraft.building.block.InitBuildingBlocks;
import tv.mapper.embellishcraft.core.ECConstants;
import tv.mapper.embellishcraft.core.data.ECBlockStates;
import tv.mapper.embellishcraft.core.util.McWoods;

public class BuildingBlockStates extends ECBlockStates
{
    public BuildingBlockStates(PackOutput output, String modid, ExistingFileHelper exFileHelper, String name)
    {
        super(output, modid, exFileHelper, name);
    }

    @Override
    protected void registerStatesAndModels()
    {
        // Other bricks
        registerBlockstateVariants("dark_bricks", ECConstants.MODID, InitBuildingBlocks.DARK_BRICKS.get(), InitBuildingBlocks.DARK_BRICKS_SLAB.get(), InitBuildingBlocks.DARK_BRICKS_STAIRS.get(), InitBuildingBlocks.DARK_BRICKS_WALL.get(), InitBuildingBlocks.DARK_BRICKS_PRESSURE_PLATE.get(), null);
        registerBlockstateVariants("old_bricks", ECConstants.MODID, InitBuildingBlocks.OLD_BRICKS.get(), InitBuildingBlocks.OLD_BRICKS_SLAB.get(), InitBuildingBlocks.OLD_BRICKS_STAIRS.get(), InitBuildingBlocks.OLD_BRICKS_WALL.get(), InitBuildingBlocks.OLD_BRICKS_PRESSURE_PLATE.get(), null);
        registerBlockstateVariants("weared_bricks", ECConstants.MODID, InitBuildingBlocks.WEARED_BRICKS.get(), InitBuildingBlocks.WEARED_BRICKS_SLAB.get(), InitBuildingBlocks.WEARED_BRICKS_STAIRS.get(), InitBuildingBlocks.WEARED_BRICKS_WALL.get(), InitBuildingBlocks.WEARED_BRICKS_PRESSURE_PLATE.get(), null);
        registerBlockstateVariants("dark_large_bricks", ECConstants.MODID, InitBuildingBlocks.DARK_LARGE_BRICKS.get(), InitBuildingBlocks.DARK_LARGE_BRICKS_SLAB.get(), InitBuildingBlocks.DARK_LARGE_BRICKS_STAIRS.get(), InitBuildingBlocks.DARK_LARGE_BRICKS_WALL.get(), InitBuildingBlocks.DARK_LARGE_BRICKS_PRESSURE_PLATE.get(), null);
        registerBlockstateVariants("old_large_bricks", ECConstants.MODID, InitBuildingBlocks.OLD_LARGE_BRICKS.get(), InitBuildingBlocks.OLD_LARGE_BRICKS_SLAB.get(), InitBuildingBlocks.OLD_LARGE_BRICKS_STAIRS.get(), InitBuildingBlocks.OLD_LARGE_BRICKS_WALL.get(), InitBuildingBlocks.OLD_LARGE_BRICKS_PRESSURE_PLATE.get(), null);
        registerBlockstateVariants("weared_large_bricks", ECConstants.MODID, InitBuildingBlocks.WEARED_LARGE_BRICKS.get(), InitBuildingBlocks.WEARED_LARGE_BRICKS_SLAB.get(), InitBuildingBlocks.WEARED_LARGE_BRICKS_STAIRS.get(), InitBuildingBlocks.WEARED_LARGE_BRICKS_WALL.get(), InitBuildingBlocks.WEARED_LARGE_BRICKS_PRESSURE_PLATE.get(), null);

        // Pavings
        registerBlockstateVariants("concrete_paving", ECConstants.MODID, InitBuildingBlocks.CONCRETE_PAVING.get(), InitBuildingBlocks.CONCRETE_PAVING_SLAB.get(), InitBuildingBlocks.CONCRETE_PAVING_STAIRS.get(), InitBuildingBlocks.CONCRETE_PAVING_WALL.get(), InitBuildingBlocks.CONCRETE_PAVING_PRESSURE_PLATE.get(), null);
        registerBlockstateVariants("damaged_paving", ECConstants.MODID, InitBuildingBlocks.DAMAGED_PAVING.get(), InitBuildingBlocks.DAMAGED_PAVING_SLAB.get(), InitBuildingBlocks.DAMAGED_PAVING_STAIRS.get(), InitBuildingBlocks.DAMAGED_PAVING_WALL.get(), InitBuildingBlocks.DAMAGED_PAVING_PRESSURE_PLATE.get(), null);
        registerBlockstateVariants("dark_concrete_paving", ECConstants.MODID, InitBuildingBlocks.DARK_CONCRETE_PAVING.get(), InitBuildingBlocks.DARK_CONCRETE_PAVING_SLAB.get(), InitBuildingBlocks.DARK_CONCRETE_PAVING_STAIRS.get(), InitBuildingBlocks.DARK_CONCRETE_PAVING_WALL.get(), InitBuildingBlocks.DARK_CONCRETE_PAVING_PRESSURE_PLATE.get(), null);
        registerBlockstateVariants("moist_paving", ECConstants.MODID, InitBuildingBlocks.MOIST_PAVING.get(), InitBuildingBlocks.MOIST_PAVING_SLAB.get(), InitBuildingBlocks.MOIST_PAVING_STAIRS.get(), InitBuildingBlocks.MOIST_PAVING_WALL.get(), InitBuildingBlocks.MOIST_PAVING_PRESSURE_PLATE.get(), null);
        registerBlockstateVariants("polished_paving", ECConstants.MODID, InitBuildingBlocks.POLISHED_PAVING.get(), InitBuildingBlocks.POLISHED_PAVING_SLAB.get(), InitBuildingBlocks.POLISHED_PAVING_STAIRS.get(), InitBuildingBlocks.POLISHED_PAVING_WALL.get(), InitBuildingBlocks.POLISHED_PAVING_PRESSURE_PLATE.get(), null);
        registerBlockstateVariants("white_concrete_paving", ECConstants.MODID, InitBuildingBlocks.WHITE_CONCRETE_PAVING.get(), InitBuildingBlocks.WHITE_CONCRETE_PAVING_SLAB.get(), InitBuildingBlocks.WHITE_CONCRETE_PAVING_STAIRS.get(), InitBuildingBlocks.WHITE_CONCRETE_PAVING_WALL.get(), InitBuildingBlocks.WHITE_CONCRETE_PAVING_PRESSURE_PLATE.get(), null);

        // Tiles
        for(int j = 0; j < DyeColor.values().length; j++)
        {
            registerBlockstateVariants(DyeColor.byId(j).getName() + "_tiles", ECConstants.MODID, InitBuildingBlocks.TILES_BLOCKS.get(DyeColor.byId(j)).get(), InitBuildingBlocks.TILES_SLABS.get(DyeColor.byId(j)).get(), InitBuildingBlocks.TILES_STAIRS.get(DyeColor.byId(j)).get(), InitBuildingBlocks.TILES_WALLS.get(DyeColor.byId(j)).get(), InitBuildingBlocks.TILES_PRESSURE_PLATES.get(DyeColor.byId(j)).get(), null);

        }

        registerBlockstateVariants("concrete_tiles", ECConstants.MODID, InitBuildingBlocks.CONCRETE_TILES.get(), InitBuildingBlocks.CONCRETE_TILES_SLAB.get(), InitBuildingBlocks.CONCRETE_TILES_STAIRS.get(), InitBuildingBlocks.CONCRETE_TILES_WALL.get(), InitBuildingBlocks.CONCRETE_TILES_PRESSURE_PLATE.get(), null);
        registerBlockstateVariants("skyblue_tiles", ECConstants.MODID, InitBuildingBlocks.SKYBLUE_TILES.get(), InitBuildingBlocks.SKYBLUE_TILES_SLAB.get(), InitBuildingBlocks.SKYBLUE_TILES_STAIRS.get(), InitBuildingBlocks.SKYBLUE_TILES_WALL.get(), InitBuildingBlocks.SKYBLUE_TILES_PRESSURE_PLATE.get(), null);
        registerBlockstateVariants("yellow_grey_tiles", ECConstants.MODID, InitBuildingBlocks.YELLOW_GREY_TILES.get(), InitBuildingBlocks.YELLOW_GREY_TILES_SLAB.get(), InitBuildingBlocks.YELLOW_GREY_TILES_STAIRS.get(), InitBuildingBlocks.YELLOW_GREY_TILES_WALL.get(), InitBuildingBlocks.YELLOW_GREY_TILES_PRESSURE_PLATE.get(), null);

        // Wallpaper
        registerBlockstateVariants("white_blue_wallpaper", ECConstants.MODID, InitBuildingBlocks.WHITE_BLUE_WALLPAPER.get(), InitBuildingBlocks.WHITE_BLUE_WALLPAPER_SLAB.get(), InitBuildingBlocks.WHITE_BLUE_WALLPAPER_STAIRS.get(), null, null, null);
        upDownBlock(InitBuildingBlocks.WHITE_BLUE_WALLPAPER_PLINTH.get(), new UncheckedModelFile(ECConstants.MODID + ":block/white_blue_wallpaper_plinth"));
        registerBlockstateVariants("beige_flower_wallpaper", ECConstants.MODID, InitBuildingBlocks.BEIGE_FLOWER_WALLPAPER.get(), InitBuildingBlocks.BEIGE_FLOWER_WALLPAPER_SLAB.get(), InitBuildingBlocks.BEIGE_FLOWER_WALLPAPER_STAIRS.get(), null, null, null);
        upDownBlock(InitBuildingBlocks.BEIGE_FLOWER_WALLPAPER_PLINTH.get(), new UncheckedModelFile(ECConstants.MODID + ":block/beige_flower_wallpaper_plinth"));
        registerBlockstateVariants("beige_wallpaper", ECConstants.MODID, InitBuildingBlocks.BEIGE_WALLPAPER.get(), InitBuildingBlocks.BEIGE_WALLPAPER_SLAB.get(), InitBuildingBlocks.BEIGE_WALLPAPER_STAIRS.get(), null, null, null);
        upDownBlock(InitBuildingBlocks.BEIGE_WALLPAPER_PLINTH.get(), new UncheckedModelFile(ECConstants.MODID + ":block/beige_wallpaper_plinth"));
        registerBlockstateVariants("pink_wallpaper", ECConstants.MODID, InitBuildingBlocks.PINK_WALLPAPER.get(), InitBuildingBlocks.PINK_WALLPAPER_SLAB.get(), InitBuildingBlocks.PINK_WALLPAPER_STAIRS.get(), null, null, null);
        upDownBlock(InitBuildingBlocks.PINK_WALLPAPER_PLINTH.get(), new UncheckedModelFile(ECConstants.MODID + ":block/pink_wallpaper_plinth"));
        registerBlockstateVariants("white_green_wallpaper", ECConstants.MODID, InitBuildingBlocks.WHITE_GREEN_WALLPAPER.get(), InitBuildingBlocks.WHITE_GREEN_WALLPAPER_SLAB.get(), InitBuildingBlocks.WHITE_GREEN_WALLPAPER_STAIRS.get(), null, null, null);
        upDownBlock(InitBuildingBlocks.WHITE_GREEN_WALLPAPER_PLINTH.get(), new UncheckedModelFile(ECConstants.MODID + ":block/white_green_wallpaper_plinth"));

        // Suspended stairs and fancy doors
        for(int j = 0; j < McWoods.values().length; j++)
        {
            horizontalBlock(InitBuildingBlocks.SUSPENDED_STAIRS_BLOCKS.get(McWoods.byId(j)).get(), new UncheckedModelFile(ECConstants.MODID + ":block/" + McWoods.byId(j).getSerializedName() + "_suspended_stairs"), 0);
            horizontalBlock(InitBuildingBlocks.LARGE_SUSPENDED_STAIRS_BLOCKS.get(McWoods.byId(j)).get(), new UncheckedModelFile(ECConstants.MODID + ":block/" + McWoods.byId(j).getSerializedName() + "_large_suspended_stairs"), 0);
            doorBlock(InitBuildingBlocks.FANCY_DOOR_BLOCKS.get(McWoods.byId(j)).get(), modLoc("block/" + McWoods.byId(j).getSerializedName() + "_fancy_door_bottom"), modLoc("block/" + McWoods.byId(j).getSerializedName() + "_fancy_door_top"));
            doorBlock(InitBuildingBlocks.PLAIN_DOOR_BLOCKS.get(McWoods.byId(j)).get(), modLoc("block/" + McWoods.byId(j).getSerializedName() + "_plain_door_bottom"), modLoc("block/" + McWoods.byId(j).getSerializedName() + "_plain_door_top"));
        }
    }
}
