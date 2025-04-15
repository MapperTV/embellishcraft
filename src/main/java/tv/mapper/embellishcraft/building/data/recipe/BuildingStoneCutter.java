package tv.mapper.embellishcraft.building.data.recipe;

import java.util.Arrays;
import java.util.concurrent.CompletableFuture;

import net.minecraft.core.HolderLookup.Provider;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.world.item.DyeColor;
import tv.mapper.embellishcraft.building.block.InitBuildingBlocks;
import tv.mapper.embellishcraft.core.data.recipes.ECStonecutterRecipes;

public class BuildingStoneCutter extends ECStonecutterRecipes
{
    public BuildingStoneCutter(PackOutput pOutput, CompletableFuture<Provider> pRegistries, String name)
    {
        super(pOutput, pRegistries, name);
    }

    @Override
    protected void buildRecipes(RecipeOutput consumer)
    {
        // Other bricks
        basicRecipes(consumer, InitBuildingBlocks.DARK_BRICKS.get(), InitBuildingBlocks.DARK_BRICKS_SLAB.get(), InitBuildingBlocks.DARK_BRICKS_STAIRS.get(), InitBuildingBlocks.DARK_BRICKS_WALL.get(), InitBuildingBlocks.DARK_BRICKS_PRESSURE_PLATE.get());
        basicRecipes(consumer, InitBuildingBlocks.DARK_LARGE_BRICKS.get(), InitBuildingBlocks.DARK_LARGE_BRICKS_SLAB.get(), InitBuildingBlocks.DARK_LARGE_BRICKS_STAIRS.get(), InitBuildingBlocks.DARK_LARGE_BRICKS_WALL.get(), InitBuildingBlocks.DARK_LARGE_BRICKS_PRESSURE_PLATE.get());
        basicRecipes(consumer, InitBuildingBlocks.OLD_BRICKS.get(), InitBuildingBlocks.OLD_BRICKS_SLAB.get(), InitBuildingBlocks.OLD_BRICKS_STAIRS.get(), InitBuildingBlocks.OLD_BRICKS_WALL.get(), InitBuildingBlocks.OLD_BRICKS_PRESSURE_PLATE.get());
        basicRecipes(consumer, InitBuildingBlocks.OLD_LARGE_BRICKS.get(), InitBuildingBlocks.OLD_LARGE_BRICKS_SLAB.get(), InitBuildingBlocks.OLD_LARGE_BRICKS_STAIRS.get(), InitBuildingBlocks.OLD_LARGE_BRICKS_WALL.get(), InitBuildingBlocks.OLD_LARGE_BRICKS_PRESSURE_PLATE.get());
        basicRecipes(consumer, InitBuildingBlocks.WEARED_BRICKS.get(), InitBuildingBlocks.WEARED_BRICKS_SLAB.get(), InitBuildingBlocks.WEARED_BRICKS_STAIRS.get(), InitBuildingBlocks.WEARED_BRICKS_WALL.get(), InitBuildingBlocks.WEARED_BRICKS_PRESSURE_PLATE.get());
        basicRecipes(consumer, InitBuildingBlocks.WEARED_LARGE_BRICKS.get(), InitBuildingBlocks.WEARED_LARGE_BRICKS_SLAB.get(), InitBuildingBlocks.WEARED_LARGE_BRICKS_STAIRS.get(), InitBuildingBlocks.WEARED_LARGE_BRICKS_WALL.get(), InitBuildingBlocks.WEARED_LARGE_BRICKS_PRESSURE_PLATE.get());

        // Pavings
        basicRecipes(consumer, InitBuildingBlocks.CONCRETE_PAVING.get(), InitBuildingBlocks.CONCRETE_PAVING_SLAB.get(), InitBuildingBlocks.CONCRETE_PAVING_STAIRS.get(), InitBuildingBlocks.CONCRETE_PAVING_WALL.get(), InitBuildingBlocks.CONCRETE_PAVING_PRESSURE_PLATE.get());
        basicRecipes(consumer, InitBuildingBlocks.DAMAGED_PAVING.get(), InitBuildingBlocks.DAMAGED_PAVING_SLAB.get(), InitBuildingBlocks.DAMAGED_PAVING_STAIRS.get(), InitBuildingBlocks.DAMAGED_PAVING_WALL.get(), InitBuildingBlocks.DAMAGED_PAVING_PRESSURE_PLATE.get());
        basicRecipes(consumer, InitBuildingBlocks.DARK_CONCRETE_PAVING.get(), InitBuildingBlocks.DARK_CONCRETE_PAVING_SLAB.get(), InitBuildingBlocks.DARK_CONCRETE_PAVING_STAIRS.get(), InitBuildingBlocks.DARK_CONCRETE_PAVING_WALL.get(), InitBuildingBlocks.DARK_CONCRETE_PAVING_PRESSURE_PLATE.get());
        basicRecipes(consumer, InitBuildingBlocks.MOIST_PAVING.get(), InitBuildingBlocks.MOIST_PAVING_SLAB.get(), InitBuildingBlocks.MOIST_PAVING_STAIRS.get(), InitBuildingBlocks.MOIST_PAVING_WALL.get(), InitBuildingBlocks.MOIST_PAVING_PRESSURE_PLATE.get());
        basicRecipes(consumer, InitBuildingBlocks.POLISHED_PAVING.get(), InitBuildingBlocks.POLISHED_PAVING_SLAB.get(), InitBuildingBlocks.POLISHED_PAVING_STAIRS.get(), InitBuildingBlocks.POLISHED_PAVING_WALL.get(), InitBuildingBlocks.POLISHED_PAVING_PRESSURE_PLATE.get());
        basicRecipes(consumer, InitBuildingBlocks.WHITE_CONCRETE_PAVING.get(), InitBuildingBlocks.WHITE_CONCRETE_PAVING_SLAB.get(), InitBuildingBlocks.WHITE_CONCRETE_PAVING_STAIRS.get(), InitBuildingBlocks.WHITE_CONCRETE_PAVING_WALL.get(), InitBuildingBlocks.WHITE_CONCRETE_PAVING_PRESSURE_PLATE.get());

        // Tiles
        for(int j = 0; j < Arrays.stream(DyeColor.values()).count(); j++)
        {
            basicRecipes(consumer, InitBuildingBlocks.TILES_BLOCKS.get(DyeColor.byId(j)).get(), InitBuildingBlocks.TILES_SLABS.get(DyeColor.byId(j)).get(), InitBuildingBlocks.TILES_STAIRS.get(DyeColor.byId(j)).get(), InitBuildingBlocks.TILES_WALLS.get(DyeColor.byId(j)).get(), InitBuildingBlocks.TILES_PRESSURE_PLATES.get(DyeColor.byId(j)).get());
        }
        
        basicRecipes(consumer, InitBuildingBlocks.CONCRETE_TILES.get(), InitBuildingBlocks.CONCRETE_TILES_SLAB.get(), InitBuildingBlocks.CONCRETE_TILES_STAIRS.get(), InitBuildingBlocks.CONCRETE_TILES_WALL.get(), InitBuildingBlocks.CONCRETE_TILES_PRESSURE_PLATE.get());
        basicRecipes(consumer, InitBuildingBlocks.SKYBLUE_TILES.get(), InitBuildingBlocks.SKYBLUE_TILES_SLAB.get(), InitBuildingBlocks.SKYBLUE_TILES_STAIRS.get(), InitBuildingBlocks.SKYBLUE_TILES_WALL.get(), InitBuildingBlocks.SKYBLUE_TILES_PRESSURE_PLATE.get());
        basicRecipes(consumer, InitBuildingBlocks.YELLOW_GREY_TILES.get(), InitBuildingBlocks.YELLOW_GREY_TILES_SLAB.get(), InitBuildingBlocks.YELLOW_GREY_TILES_STAIRS.get(), InitBuildingBlocks.YELLOW_GREY_TILES_WALL.get(), InitBuildingBlocks.YELLOW_GREY_TILES_PRESSURE_PLATE.get());

        // Wallpapers
        basicRecipes(consumer, InitBuildingBlocks.WHITE_BLUE_WALLPAPER.get(), InitBuildingBlocks.WHITE_BLUE_WALLPAPER_SLAB.get(), InitBuildingBlocks.WHITE_BLUE_WALLPAPER_STAIRS.get(), null, null);
        basicRecipes(consumer, InitBuildingBlocks.BEIGE_FLOWER_WALLPAPER.get(), InitBuildingBlocks.BEIGE_FLOWER_WALLPAPER_SLAB.get(), InitBuildingBlocks.BEIGE_FLOWER_WALLPAPER_STAIRS.get(), null, null);
        basicRecipes(consumer, InitBuildingBlocks.BEIGE_WALLPAPER.get(), InitBuildingBlocks.BEIGE_WALLPAPER_SLAB.get(), InitBuildingBlocks.BEIGE_WALLPAPER_STAIRS.get(), null, null);
        basicRecipes(consumer, InitBuildingBlocks.PINK_WALLPAPER.get(), InitBuildingBlocks.PINK_WALLPAPER_SLAB.get(), InitBuildingBlocks.PINK_WALLPAPER_STAIRS.get(), null, null);
        basicRecipes(consumer, InitBuildingBlocks.WHITE_GREEN_WALLPAPER.get(), InitBuildingBlocks.WHITE_GREEN_WALLPAPER_SLAB.get(), InitBuildingBlocks.WHITE_GREEN_WALLPAPER_STAIRS.get(), null, null);

    }
}
