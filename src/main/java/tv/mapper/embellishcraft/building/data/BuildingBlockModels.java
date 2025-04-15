package tv.mapper.embellishcraft.building.data;

import java.util.Arrays;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.DyeColor;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import tv.mapper.embellishcraft.core.data.ECBlockModels;
import tv.mapper.embellishcraft.core.util.McWoods;

public class BuildingBlockModels extends ECBlockModels
{

    public BuildingBlockModels(PackOutput generator, String modid, ExistingFileHelper existingFileHelper, String name)
    {
        super(generator, modid, existingFileHelper, name);
    }

    @Override
    protected void registerModels()
    {
        // Other bricks
        buildWall("dark_bricks", modLoc("block/dark_bricks"));
        buildWall("old_bricks", modLoc("block/old_bricks"));
        buildWall("weared_bricks", modLoc("block/weared_bricks"));

        buildWall("dark_large_bricks", modLoc("block/dark_large_bricks"));
        buildWall("old_large_bricks", modLoc("block/old_large_bricks"));
        buildWall("weared_large_bricks", modLoc("block/weared_large_bricks"));

        // Pavings
        buildWall("concrete_paving", modLoc("block/concrete_paving"));
        buildWall("damaged_paving", modLoc("block/damaged_paving"));
        buildWall("dark_concrete_paving", modLoc("block/dark_concrete_paving"));
        buildWall("moist_paving", modLoc("block/moist_paving"));
        buildWall("polished_paving", modLoc("block/polished_paving"));
        buildWall("white_concrete_paving", modLoc("block/white_concrete_paving"));

        // Tiles
        for(int j = 0; j < Arrays.stream(DyeColor.values()).count(); j++)
            buildWall(DyeColor.byId(j).getSerializedName() + "_tiles", modLoc("block/" + DyeColor.byId(j).getSerializedName() + "_tiles"));
        
        buildWall("concrete_tiles", modLoc("block/concrete_tiles"));
        buildWall("skyblue_tiles", modLoc("block/skyblue_tiles"));
        buildWall("yellow_grey_tiles", modLoc("block/yellow_grey_tiles"));

        // Wallpaper
        buildWallpaper("white_blue_wallpaper", modLoc("block/white_blue_wallpaper"), modLoc("block/side_wallpaper"), modLoc("block/white_blue_wallpaper_plinth"));
        buildWallpaper("beige_flower_wallpaper", modLoc("block/beige_flower_wallpaper"), modLoc("block/side_wallpaper"), modLoc("block/beige_flower_wallpaper_plinth"));
        buildWallpaper("beige_wallpaper", modLoc("block/beige_wallpaper"), modLoc("block/side_wallpaper"), modLoc("block/beige_wallpaper_plinth"));
        buildWallpaper("pink_wallpaper", modLoc("block/pink_wallpaper"), modLoc("block/side_wallpaper"), modLoc("block/pink_wallpaper_plinth"));
        buildWallpaper("white_green_wallpaper", modLoc("block/white_green_wallpaper"), modLoc("block/side_wallpaper"), modLoc("block/white_green_wallpaper_plinth"));

        // Suspended stairs
        for(int j = 0; j < Arrays.stream(McWoods.values()).count(); j++)
        {
            getBuilder(McWoods.byId(j).getSerializedName() + "_suspended_stairs").parent(getExistingFile(modLoc("block/suspended_stairs"))).texture("all", ResourceLocation.withDefaultNamespace("block/" + McWoods.byId(j).getSerializedName() + "_planks"));
            getBuilder(McWoods.byId(j).getSerializedName() + "_large_suspended_stairs").parent(getExistingFile(modLoc("block/large_suspended_stairs"))).texture("all", ResourceLocation.withDefaultNamespace("block/" + McWoods.byId(j).getSerializedName() + "_planks"));
        }
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
}
