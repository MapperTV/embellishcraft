package tv.mapper.embellishcraft.data.gen;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ExistingFileHelper;
import net.minecraftforge.client.model.generators.ModelFile.UncheckedModelFile;
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
        registerBlockBasics("black_corrugated_metal_plate", true, true, true, true, true, false);
        registerBlockBasics("blue_corrugated_metal_plate", true, true, true, true, true, false);
        registerBlockBasics("brown_corrugated_metal_plate", true, true, true, true, true, false);
        registerBlockBasics("cyan_corrugated_metal_plate", true, true, true, true, true, false);
        registerBlockBasics("gray_corrugated_metal_plate", true, true, true, true, true, false);
        registerBlockBasics("green_corrugated_metal_plate", true, true, true, true, true, false);
        registerBlockBasics("light_blue_corrugated_metal_plate", true, true, true, true, true, false);
        registerBlockBasics("light_gray_corrugated_metal_plate", true, true, true, true, true, false);
        registerBlockBasics("lime_corrugated_metal_plate", true, true, true, true, true, false);
        registerBlockBasics("magenta_corrugated_metal_plate", true, true, true, true, true, false);
        registerBlockBasics("orange_corrugated_metal_plate", true, true, true, true, true, false);
        registerBlockBasics("pink_corrugated_metal_plate", true, true, true, true, true, false);
        registerBlockBasics("purple_corrugated_metal_plate", true, true, true, true, true, false);
        registerBlockBasics("red_corrugated_metal_plate", true, true, true, true, true, false);
        registerBlockBasics("white_corrugated_metal_plate", true, true, true, true, true, false);
        registerBlockBasics("yellow_corrugated_metal_plate", true, true, true, true, true, false);

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
        registerBlockBasics(name + "_ornament", true, false, false, false, true, false);
    }

    private void registerMcStone(String name)
    {
        registerBlockBasics("smooth_" + name, true, true, true, true, true, false);
        getBuilder(name + "_button").parent(new UncheckedModelFile(modid + ":block/" + name + "_button_inventory"));
        registerBlockBasics(name + "_paving", true, true, true, true, true, false);
        registerBlockBasics(name + "_tiles", true, true, true, true, true, false);
        registerBlockBasics(name + "_bricks", true, true, true, true, true, false);
        registerBlockBasics(name + "_large_bricks", true, true, true, true, true, false);
        registerBlockBasics(name + "_ornament", true, false, false, false, true, false);
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
    }
}
