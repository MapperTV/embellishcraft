package tv.mapper.embellishcraft.building.data.gen;

import java.util.Arrays;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ModelFile.UncheckedModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import tv.mapper.embellishcraft.core.data.gen.ECItemModels;
import tv.mapper.embellishcraft.core.util.McWoods;

public class BuildingItemModels extends ECItemModels
{

    public BuildingItemModels(DataGenerator generator, String modid, ExistingFileHelper existingFileHelper)
    {
        super(generator, modid, existingFileHelper);
    }

    @Override
    protected void registerModels()
    {
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

        // Suspended stairs, doors
        for(int j = 0; j < Arrays.stream(McWoods.values()).count(); j++)
        {
            getBuilder(McWoods.byId(j).getSerializedName() + "_suspended_stairs").parent(new UncheckedModelFile(modid + ":block/" + McWoods.byId(j).getSerializedName() + "_suspended_stairs"));
            getBuilder(McWoods.byId(j).getSerializedName() + "_large_suspended_stairs").parent(new UncheckedModelFile(modid + ":block/" + McWoods.byId(j).getSerializedName() + "_large_suspended_stairs"));
            getBuilder(McWoods.byId(j).getSerializedName() + "_fancy_door").parent(new UncheckedModelFile("item/generated")).texture("layer0", modLoc("item/" + McWoods.byId(j).getSerializedName() + "_fancy_door"));
            getBuilder(McWoods.byId(j).getSerializedName() + "_plain_door").parent(new UncheckedModelFile("item/generated")).texture("layer0", modLoc("item/" + McWoods.byId(j).getSerializedName() + "_plain_door"));
        }
    }
}