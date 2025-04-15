package tv.mapper.embellishcraft.core.data.recipes;

import java.util.Objects;
import java.util.concurrent.CompletableFuture;

import net.minecraft.core.HolderLookup.Provider;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.SingleItemRecipeBuilder;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Block;
import tv.mapper.mapperbase.api.data.BaseRecipeProvider;

public class ECStonecutterRecipes extends BaseRecipeProvider
{
    public ECStonecutterRecipes(PackOutput pOutput, CompletableFuture<Provider> pRegistries, String name)
    {
        super(pOutput, pRegistries, name);
    }

    @Override
    protected void buildRecipes(RecipeOutput consumer)
    {}

    protected void basicRecipes(RecipeOutput consumer, Block base, Block slab, Block stairs, Block wall, Block pressure)
    {
        String base_name = Objects.requireNonNull(BuiltInRegistries.BLOCK.getKey(base)).getPath();

        if(slab != null)
            SingleItemRecipeBuilder.stonecutting(Ingredient.of(base), RecipeCategory.BUILDING_BLOCKS, slab, 2).unlockedBy("has_" + base_name, has(base)).save(consumer, base_name + "_slab_from_" + base_name + "_stonecutting");
        if(stairs != null)
            SingleItemRecipeBuilder.stonecutting(Ingredient.of(base), RecipeCategory.BUILDING_BLOCKS, stairs).unlockedBy("has_" + base_name, has(base)).save(consumer, base_name + "_stairs_from_" + base_name + "_stonecutting");
        if(wall != null)
            SingleItemRecipeBuilder.stonecutting(Ingredient.of(base), RecipeCategory.BUILDING_BLOCKS, wall).unlockedBy("has_" + base_name, has(base)).save(consumer, base_name + "_wall_from_" + base_name + "_stonecutting");
        if(pressure != null)
            SingleItemRecipeBuilder.stonecutting(Ingredient.of(base), RecipeCategory.MISC, pressure, 2).unlockedBy("has_" + base_name, has(base)).save(consumer, base_name + "_pressure_plate_from_" + base_name + "_stonecutting");
    }
}