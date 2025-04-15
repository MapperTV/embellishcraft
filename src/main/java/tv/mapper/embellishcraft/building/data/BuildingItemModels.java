package tv.mapper.embellishcraft.building.data;

import java.util.Arrays;

import net.minecraft.data.PackOutput;
import net.minecraft.world.item.DyeColor;
import net.neoforged.neoforge.client.model.generators.ModelFile.UncheckedModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import tv.mapper.embellishcraft.core.data.ECItemModels;
import tv.mapper.embellishcraft.core.util.McWoods;

public class BuildingItemModels extends ECItemModels
{

    public BuildingItemModels(PackOutput output, String modid, ExistingFileHelper existingFileHelper, String name)
    {
        super(output, modid, existingFileHelper, name);
    }

    @Override
    protected void registerModels()
    {
        // Other bricks
        registerBlockBasics("dark_bricks", true, true, true, true, true, false, false, false);
        registerBlockBasics("dark_large_bricks", true, true, true, true, true, false, false, false);
        registerBlockBasics("old_bricks", true, true, true, true, true, false, false, false);
        registerBlockBasics("old_large_bricks", true, true, true, true, true, false, false, false);
        registerBlockBasics("weared_bricks", true, true, true, true, true, false, false, false);
        registerBlockBasics("weared_large_bricks", true, true, true, true, true, false, false, false);

        // Pavings
        registerBlockBasics("concrete_paving", true, true, true, true, true, false, false, false);
        registerBlockBasics("damaged_paving", true, true, true, true, true, false, false, false);
        registerBlockBasics("dark_concrete_paving", true, true, true, true, true, false, false, false);
        registerBlockBasics("moist_paving", true, true, true, true, true, false, false, false);
        registerBlockBasics("polished_paving", true, true, true, true, true, false, false, false);
        registerBlockBasics("white_concrete_paving", true, true, true, true, true, false, false, false);

        // Tiles
        for(int j = 0; j < DyeColor.values().length; j++)
        {
            registerBlockBasics(DyeColor.byId(j).getSerializedName() + "_tiles", true, true, true, true, true, false, false, false);
        }
        
        registerBlockBasics("concrete_tiles", true, true, true, true, true, false, false, false);
        registerBlockBasics("skyblue_tiles", true, true, true, true, true, false, false, false);
        registerBlockBasics("yellow_grey_tiles", true, true, true, true, true, false, false, false);

        // Wallpapers
        registerBlockBasics("white_blue_wallpaper", true, true, true, false, false, false, false, false);
        getBuilder("white_blue_wallpaper_plinth").parent(new UncheckedModelFile(modid + ":block/white_blue_wallpaper_plinth"));
        registerBlockBasics("beige_flower_wallpaper", true, true, true, false, false, false, false, false);
        getBuilder("beige_flower_wallpaper_plinth").parent(new UncheckedModelFile(modid + ":block/beige_flower_wallpaper_plinth"));
        registerBlockBasics("beige_wallpaper", true, true, true, false, false, false, false, false);
        getBuilder("beige_wallpaper_plinth").parent(new UncheckedModelFile(modid + ":block/beige_wallpaper_plinth"));
        registerBlockBasics("pink_wallpaper", true, true, true, false, false, false, false, false);
        getBuilder("pink_wallpaper_plinth").parent(new UncheckedModelFile(modid + ":block/pink_wallpaper_plinth"));
        registerBlockBasics("white_green_wallpaper", true, true, true, false, false, false, false, false);
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
