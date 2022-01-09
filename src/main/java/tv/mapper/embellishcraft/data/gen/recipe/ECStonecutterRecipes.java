package tv.mapper.embellishcraft.data.gen.recipe;

import java.util.function.Consumer;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.SingleItemRecipeBuilder;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Block;
import tv.mapper.embellishcraft.block.ECBlockRegistry;
import tv.mapper.mapperbase.data.gen.BaseRecipes;

public class ECStonecutterRecipes extends BaseRecipes
{
    public ECStonecutterRecipes(DataGenerator generatorIn)
    {
        super(generatorIn);
    }

    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> consumer)
    {
        // Other bricks
        basicRecipes(consumer, ECBlockRegistry.DARK_BRICKS.get(), ECBlockRegistry.DARK_BRICKS_SLAB.get(), ECBlockRegistry.DARK_BRICKS_STAIRS.get(), ECBlockRegistry.DARK_BRICKS_WALL.get(), ECBlockRegistry.DARK_BRICKS_PRESSURE_PLATE.get());
        basicRecipes(consumer, ECBlockRegistry.DARK_LARGE_BRICKS.get(), ECBlockRegistry.DARK_LARGE_BRICKS_SLAB.get(), ECBlockRegistry.DARK_LARGE_BRICKS_STAIRS.get(), ECBlockRegistry.DARK_LARGE_BRICKS_WALL.get(), ECBlockRegistry.DARK_LARGE_BRICKS_PRESSURE_PLATE.get());
        basicRecipes(consumer, ECBlockRegistry.OLD_BRICKS.get(), ECBlockRegistry.OLD_BRICKS_SLAB.get(), ECBlockRegistry.OLD_BRICKS_STAIRS.get(), ECBlockRegistry.OLD_BRICKS_WALL.get(), ECBlockRegistry.OLD_BRICKS_PRESSURE_PLATE.get());
        basicRecipes(consumer, ECBlockRegistry.OLD_LARGE_BRICKS.get(), ECBlockRegistry.OLD_LARGE_BRICKS_SLAB.get(), ECBlockRegistry.OLD_LARGE_BRICKS_STAIRS.get(), ECBlockRegistry.OLD_LARGE_BRICKS_WALL.get(), ECBlockRegistry.OLD_LARGE_BRICKS_PRESSURE_PLATE.get());
        basicRecipes(consumer, ECBlockRegistry.WEARED_BRICKS.get(), ECBlockRegistry.WEARED_BRICKS_SLAB.get(), ECBlockRegistry.WEARED_BRICKS_STAIRS.get(), ECBlockRegistry.WEARED_BRICKS_WALL.get(), ECBlockRegistry.WEARED_BRICKS_PRESSURE_PLATE.get());
        basicRecipes(consumer, ECBlockRegistry.WEARED_LARGE_BRICKS.get(), ECBlockRegistry.WEARED_LARGE_BRICKS_SLAB.get(), ECBlockRegistry.WEARED_LARGE_BRICKS_STAIRS.get(), ECBlockRegistry.WEARED_LARGE_BRICKS_WALL.get(), ECBlockRegistry.WEARED_LARGE_BRICKS_PRESSURE_PLATE.get());

        // Pavings
        basicRecipes(consumer, ECBlockRegistry.CONCRETE_PAVING.get(), ECBlockRegistry.CONCRETE_PAVING_SLAB.get(), ECBlockRegistry.CONCRETE_PAVING_STAIRS.get(), ECBlockRegistry.CONCRETE_PAVING_WALL.get(), ECBlockRegistry.CONCRETE_PAVING_PRESSURE_PLATE.get());
        basicRecipes(consumer, ECBlockRegistry.DAMAGED_PAVING.get(), ECBlockRegistry.DAMAGED_PAVING_SLAB.get(), ECBlockRegistry.DAMAGED_PAVING_STAIRS.get(), ECBlockRegistry.DAMAGED_PAVING_WALL.get(), ECBlockRegistry.DAMAGED_PAVING_PRESSURE_PLATE.get());
        basicRecipes(consumer, ECBlockRegistry.DARK_CONCRETE_PAVING.get(), ECBlockRegistry.DARK_CONCRETE_PAVING_SLAB.get(), ECBlockRegistry.DARK_CONCRETE_PAVING_STAIRS.get(), ECBlockRegistry.DARK_CONCRETE_PAVING_WALL.get(), ECBlockRegistry.DARK_CONCRETE_PAVING_PRESSURE_PLATE.get());
        basicRecipes(consumer, ECBlockRegistry.MOIST_PAVING.get(), ECBlockRegistry.MOIST_PAVING_SLAB.get(), ECBlockRegistry.MOIST_PAVING_STAIRS.get(), ECBlockRegistry.MOIST_PAVING_WALL.get(), ECBlockRegistry.MOIST_PAVING_PRESSURE_PLATE.get());
        basicRecipes(consumer, ECBlockRegistry.POLISHED_PAVING.get(), ECBlockRegistry.POLISHED_PAVING_SLAB.get(), ECBlockRegistry.POLISHED_PAVING_STAIRS.get(), ECBlockRegistry.POLISHED_PAVING_WALL.get(), ECBlockRegistry.POLISHED_PAVING_PRESSURE_PLATE.get());
        basicRecipes(consumer, ECBlockRegistry.WHITE_CONCRETE_PAVING.get(), ECBlockRegistry.WHITE_CONCRETE_PAVING_SLAB.get(), ECBlockRegistry.WHITE_CONCRETE_PAVING_STAIRS.get(), ECBlockRegistry.WHITE_CONCRETE_PAVING_WALL.get(), ECBlockRegistry.WHITE_CONCRETE_PAVING_PRESSURE_PLATE.get());

        // Tiles
        basicRecipes(consumer, ECBlockRegistry.CONCRETE_TILES.get(), ECBlockRegistry.CONCRETE_TILES_SLAB.get(), ECBlockRegistry.CONCRETE_TILES_STAIRS.get(), ECBlockRegistry.CONCRETE_TILES_WALL.get(), ECBlockRegistry.CONCRETE_TILES_PRESSURE_PLATE.get());
        basicRecipes(consumer, ECBlockRegistry.SKYBLUE_TILES.get(), ECBlockRegistry.SKYBLUE_TILES_SLAB.get(), ECBlockRegistry.SKYBLUE_TILES_STAIRS.get(), ECBlockRegistry.SKYBLUE_TILES_WALL.get(), ECBlockRegistry.SKYBLUE_TILES_PRESSURE_PLATE.get());
        basicRecipes(consumer, ECBlockRegistry.ORANGE_TILES.get(), ECBlockRegistry.ORANGE_TILES_SLAB.get(), ECBlockRegistry.ORANGE_TILES_STAIRS.get(), ECBlockRegistry.ORANGE_TILES_WALL.get(), ECBlockRegistry.ORANGE_TILES_PRESSURE_PLATE.get());
        basicRecipes(consumer, ECBlockRegistry.BLUE_TILES.get(), ECBlockRegistry.BLUE_TILES_SLAB.get(), ECBlockRegistry.BLUE_TILES_STAIRS.get(), ECBlockRegistry.BLUE_TILES_WALL.get(), ECBlockRegistry.BLUE_TILES_PRESSURE_PLATE.get());
        basicRecipes(consumer, ECBlockRegistry.LIGHT_BLUE_TILES.get(), ECBlockRegistry.LIGHT_BLUE_TILES_SLAB.get(), ECBlockRegistry.LIGHT_BLUE_TILES_STAIRS.get(), ECBlockRegistry.LIGHT_BLUE_TILES_WALL.get(), ECBlockRegistry.LIGHT_BLUE_TILES_PRESSURE_PLATE.get());
        basicRecipes(consumer, ECBlockRegistry.RED_TILES.get(), ECBlockRegistry.RED_TILES_SLAB.get(), ECBlockRegistry.RED_TILES_STAIRS.get(), ECBlockRegistry.RED_TILES_WALL.get(), ECBlockRegistry.RED_TILES_PRESSURE_PLATE.get());
        basicRecipes(consumer, ECBlockRegistry.WHITE_TILES.get(), ECBlockRegistry.WHITE_TILES_SLAB.get(), ECBlockRegistry.WHITE_TILES_STAIRS.get(), ECBlockRegistry.WHITE_TILES_WALL.get(), ECBlockRegistry.WHITE_TILES_PRESSURE_PLATE.get());
        basicRecipes(consumer, ECBlockRegistry.YELLOW_TILES.get(), ECBlockRegistry.YELLOW_TILES_SLAB.get(), ECBlockRegistry.YELLOW_TILES_STAIRS.get(), ECBlockRegistry.YELLOW_TILES_WALL.get(), ECBlockRegistry.YELLOW_TILES_PRESSURE_PLATE.get());
        basicRecipes(consumer, ECBlockRegistry.YELLOW_GREY_TILES.get(), ECBlockRegistry.YELLOW_GREY_TILES_SLAB.get(), ECBlockRegistry.YELLOW_GREY_TILES_STAIRS.get(), ECBlockRegistry.YELLOW_GREY_TILES_WALL.get(), ECBlockRegistry.YELLOW_GREY_TILES_PRESSURE_PLATE.get());

        // Wallpapers
        basicRecipes(consumer, ECBlockRegistry.WHITE_BLUE_WALLPAPER.get(), ECBlockRegistry.WHITE_BLUE_WALLPAPER_SLAB.get(), ECBlockRegistry.WHITE_BLUE_WALLPAPER_STAIRS.get(), null, null);
        basicRecipes(consumer, ECBlockRegistry.BEIGE_FLOWER_WALLPAPER.get(), ECBlockRegistry.BEIGE_FLOWER_WALLPAPER_SLAB.get(), ECBlockRegistry.BEIGE_FLOWER_WALLPAPER_STAIRS.get(), null, null);
        basicRecipes(consumer, ECBlockRegistry.BEIGE_WALLPAPER.get(), ECBlockRegistry.BEIGE_WALLPAPER_SLAB.get(), ECBlockRegistry.BEIGE_WALLPAPER_STAIRS.get(), null, null);
        basicRecipes(consumer, ECBlockRegistry.PINK_WALLPAPER.get(), ECBlockRegistry.PINK_WALLPAPER_SLAB.get(), ECBlockRegistry.PINK_WALLPAPER_STAIRS.get(), null, null);
        basicRecipes(consumer, ECBlockRegistry.WHITE_GREEN_WALLPAPER.get(), ECBlockRegistry.WHITE_GREEN_WALLPAPER_SLAB.get(), ECBlockRegistry.WHITE_GREEN_WALLPAPER_STAIRS.get(), null, null);
    }

    protected void basicRecipes(Consumer<FinishedRecipe> consumer, Block base, Block slab, Block stairs, Block wall, Block pressure)
    {
        String base_name = base.getRegistryName().getPath();

        if(slab != null)
            SingleItemRecipeBuilder.stonecutting(Ingredient.of(base), slab, 2).unlockedBy("has_" + base_name, has(base)).save(consumer, base_name + "_slab_from_" + base_name + "_stonecutting");
        if(stairs != null)
            SingleItemRecipeBuilder.stonecutting(Ingredient.of(base), stairs).unlockedBy("has_" + base_name, has(base)).save(consumer, base_name + "_stairs_from_" + base_name + "_stonecutting");
        if(wall != null)
            SingleItemRecipeBuilder.stonecutting(Ingredient.of(base), wall).unlockedBy("has_" + base_name, has(base)).save(consumer, base_name + "_wall_from_" + base_name + "_stonecutting");
        if(pressure != null)
            SingleItemRecipeBuilder.stonecutting(Ingredient.of(base), pressure, 2).unlockedBy("has_" + base_name, has(base)).save(consumer, base_name + "_pressure_plate_from_" + base_name + "_stonecutting");
    }
}