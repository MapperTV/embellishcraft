package tv.mapper.embellishcraft.data.gen;

import java.util.function.Consumer;

import net.minecraft.data.CookingRecipeBuilder;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.IFinishedRecipe;
import net.minecraft.data.RecipeProvider;
import net.minecraft.data.ShapedRecipeBuilder;
import net.minecraft.data.ShapelessRecipeBuilder;
import net.minecraft.item.crafting.Ingredient;
import tv.mapper.embellishcraft.ECConstants;
import tv.mapper.embellishcraft.block.ECBlockRegistry;
import tv.mapper.embellishcraft.item.ECItemRegistry;

public class ECRecipes extends RecipeProvider
{

    public ECRecipes(DataGenerator generatorIn)
    {
        super(generatorIn);
    }

    @Override
    protected void registerRecipes(Consumer<IFinishedRecipe> consumer)
    {
        // Basalt

        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(ECItemRegistry.BASALT_COBBLESTONE_ITEM.get()), ECItemRegistry.BASALT_ITEM.get(), 0.1f, 200).addCriterion("has_basalt_cobblestone",
            this.hasItem(ECBlockRegistry.BASALT_COBBLESTONE.get())).build(consumer, ECConstants.MODID + ":basalt_from_cobblestone_smelting");

        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.BASALT_SLAB.get(), 6).patternLine("iii").key('i', ECBlockRegistry.BASALT.get()).addCriterion("has_basalt",
            this.hasItem(ECBlockRegistry.BASALT.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.BASALT.get()).patternLine("i").patternLine("i").key('i', ECBlockRegistry.BASALT_SLAB.get()).addCriterion("has_basalt_slab",
            this.hasItem(ECBlockRegistry.BASALT_SLAB.get())).build(consumer, ECConstants.MODID + ":basalt_from_slabs");
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.BASALT_STAIRS.get(), 4).key('#', ECBlockRegistry.BASALT.get()).patternLine("#  ").patternLine("## ").patternLine("###").addCriterion("has_basalt",
            this.hasItem(ECBlockRegistry.BASALT.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.BASALT_WALL.get(), 6).key('#', ECBlockRegistry.BASALT.get()).patternLine("###").patternLine("###").addCriterion("has_basalt",
            this.hasItem(ECBlockRegistry.BASALT.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.BASALT_PRESSURE_PLATE.get()).key('#', ECBlockRegistry.BASALT.get()).patternLine("##").addCriterion("has_basalt",
            this.hasItem(ECBlockRegistry.BASALT.get())).build(consumer);

        ShapelessRecipeBuilder.shapelessRecipe(ECBlockRegistry.POLISHED_BASALT.get()).addIngredient(ECBlockRegistry.SMOOTH_BASALT.get()).addCriterion("has_smooth_basalt",
            this.hasItem(ECBlockRegistry.SMOOTH_BASALT.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.POLISHED_BASALT_SLAB.get(), 6).patternLine("iii").key('i', ECBlockRegistry.POLISHED_BASALT.get()).addCriterion("has_polished_basalt",
            this.hasItem(ECBlockRegistry.POLISHED_BASALT.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.POLISHED_BASALT.get()).patternLine("i").patternLine("i").key('i', ECBlockRegistry.POLISHED_BASALT_SLAB.get()).addCriterion("has_polished_basalt_slab",
            this.hasItem(ECBlockRegistry.POLISHED_BASALT_SLAB.get())).build(consumer, ECConstants.MODID + ":polished_basalt_from_slabs");
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.POLISHED_BASALT_STAIRS.get(), 4).key('#', ECBlockRegistry.POLISHED_BASALT.get()).patternLine("#  ").patternLine("## ").patternLine("###").addCriterion(
            "has_polished_basalt", this.hasItem(ECBlockRegistry.POLISHED_BASALT.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.POLISHED_BASALT_WALL.get(), 6).key('#', ECBlockRegistry.POLISHED_BASALT.get()).patternLine("###").patternLine("###").addCriterion("has_polished_basalt",
            this.hasItem(ECBlockRegistry.POLISHED_BASALT.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.POLISHED_BASALT_PRESSURE_PLATE.get()).key('#', ECBlockRegistry.POLISHED_BASALT.get()).patternLine("##").addCriterion("has_polished_basalt",
            this.hasItem(ECBlockRegistry.POLISHED_BASALT.get())).build(consumer);

        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(ECItemRegistry.BASALT_ITEM.get()), ECItemRegistry.SMOOTH_BASALT_ITEM.get(), 0.1f, 200).addCriterion("has_basalt",
            this.hasItem(ECBlockRegistry.BASALT.get())).build(consumer, ECConstants.MODID + ":smooth_basalt_from_smelting");

        ShapelessRecipeBuilder.shapelessRecipe(ECBlockRegistry.SMOOTH_BASALT.get()).addIngredient(ECBlockRegistry.POLISHED_BASALT.get()).addCriterion("has_polished_basalt",
            this.hasItem(ECBlockRegistry.POLISHED_BASALT.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.SMOOTH_BASALT_SLAB.get(), 6).patternLine("iii").key('i', ECBlockRegistry.SMOOTH_BASALT.get()).addCriterion("has_smooth_basalt",
            this.hasItem(ECBlockRegistry.SMOOTH_BASALT.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.SMOOTH_BASALT.get()).patternLine("i").patternLine("i").key('i', ECBlockRegistry.SMOOTH_BASALT_SLAB.get()).addCriterion("has_smooth_basalt_slab",
            this.hasItem(ECBlockRegistry.SMOOTH_BASALT_SLAB.get())).build(consumer, ECConstants.MODID + ":smooth_basalt_from_slabs");
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.SMOOTH_BASALT_STAIRS.get(), 4).key('#', ECBlockRegistry.SMOOTH_BASALT.get()).patternLine("#  ").patternLine("## ").patternLine("###").addCriterion(
            "has_smooth_basalt", this.hasItem(ECBlockRegistry.SMOOTH_BASALT.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.SMOOTH_BASALT_WALL.get(), 6).key('#', ECBlockRegistry.SMOOTH_BASALT.get()).patternLine("###").patternLine("###").addCriterion("has_smooth_basalt",
            this.hasItem(ECBlockRegistry.SMOOTH_BASALT.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.SMOOTH_BASALT_PRESSURE_PLATE.get()).key('#', ECBlockRegistry.SMOOTH_BASALT.get()).patternLine("##").addCriterion("has_smooth_basalt",
            this.hasItem(ECBlockRegistry.SMOOTH_BASALT.get())).build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.BASALT_COBBLESTONE_SLAB.get(), 6).patternLine("iii").key('i', ECBlockRegistry.BASALT_COBBLESTONE.get()).addCriterion("has_basalt_cobblestone",
            this.hasItem(ECBlockRegistry.BASALT_COBBLESTONE.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.BASALT_COBBLESTONE.get()).patternLine("i").patternLine("i").key('i', ECBlockRegistry.BASALT_COBBLESTONE_SLAB.get()).addCriterion(
            "has_basalt_cobblestone_slab", this.hasItem(ECBlockRegistry.BASALT_COBBLESTONE_SLAB.get())).build(consumer, ECConstants.MODID + ":basalt_cobblestone_from_slabs");
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.BASALT_COBBLESTONE_STAIRS.get(), 4).key('#', ECBlockRegistry.BASALT_COBBLESTONE.get()).patternLine("#  ").patternLine("## ").patternLine(
            "###").addCriterion("has_basalt_cobblestone", this.hasItem(ECBlockRegistry.BASALT_COBBLESTONE.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.BASALT_COBBLESTONE_WALL.get(), 6).key('#', ECBlockRegistry.BASALT_COBBLESTONE.get()).patternLine("###").patternLine("###").addCriterion(
            "has_basalt_cobblestone", this.hasItem(ECBlockRegistry.BASALT_COBBLESTONE.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.BASALT_COBBLESTONE_PRESSURE_PLATE.get()).key('#', ECBlockRegistry.BASALT_COBBLESTONE.get()).patternLine("##").addCriterion("has_basalt_cobblestone",
            this.hasItem(ECBlockRegistry.BASALT_COBBLESTONE.get())).build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.BASALT_PAVING.get(), 4).patternLine("ii").patternLine("ii").key('i', ECBlockRegistry.POLISHED_BASALT.get()).addCriterion("has_polished_basalt",
            this.hasItem(ECBlockRegistry.POLISHED_BASALT.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.BASALT_PAVING_SLAB.get(), 6).patternLine("iii").key('i', ECBlockRegistry.BASALT_PAVING.get()).addCriterion("has_basalt_paving",
            this.hasItem(ECBlockRegistry.BASALT_PAVING.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.BASALT_PAVING.get()).patternLine("i").patternLine("i").key('i', ECBlockRegistry.BASALT_PAVING_SLAB.get()).addCriterion("has_basalt_paving_slab",
            this.hasItem(ECBlockRegistry.BASALT_PAVING_SLAB.get())).build(consumer, ECConstants.MODID + ":basalt_paving_from_slabs");
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.BASALT_PAVING_STAIRS.get(), 4).key('#', ECBlockRegistry.BASALT_PAVING.get()).patternLine("#  ").patternLine("## ").patternLine("###").addCriterion(
            "has_basalt_paving", this.hasItem(ECBlockRegistry.BASALT_PAVING.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.BASALT_PAVING_WALL.get(), 6).key('#', ECBlockRegistry.BASALT_PAVING.get()).patternLine("###").patternLine("###").addCriterion("has_basalt_paving",
            this.hasItem(ECBlockRegistry.BASALT_PAVING.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.BASALT_PAVING_PRESSURE_PLATE.get()).key('#', ECBlockRegistry.BASALT_PAVING.get()).patternLine("##").addCriterion("has_basalt_paving",
            this.hasItem(ECBlockRegistry.BASALT_PAVING.get())).build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.BASALT_TILES.get(), 4).patternLine("ii").patternLine("ii").key('i', ECBlockRegistry.BASALT_PAVING.get()).addCriterion("has_basalt_paving",
            this.hasItem(ECBlockRegistry.BASALT_PAVING.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.BASALT_TILES_SLAB.get(), 6).patternLine("iii").key('i', ECBlockRegistry.BASALT_TILES.get()).addCriterion("has_basalt_tiles",
            this.hasItem(ECBlockRegistry.BASALT_TILES.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.BASALT_TILES.get()).patternLine("i").patternLine("i").key('i', ECBlockRegistry.BASALT_TILES_SLAB.get()).addCriterion("has_basalt_tiles_slab",
            this.hasItem(ECBlockRegistry.BASALT_TILES_SLAB.get())).build(consumer, ECConstants.MODID + ":basalt_tiles_from_slabs");
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.BASALT_TILES_STAIRS.get(), 4).key('#', ECBlockRegistry.BASALT_TILES.get()).patternLine("#  ").patternLine("## ").patternLine("###").addCriterion(
            "has_basalt_tiles", this.hasItem(ECBlockRegistry.BASALT_TILES.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.BASALT_TILES_WALL.get(), 6).key('#', ECBlockRegistry.BASALT_TILES.get()).patternLine("###").patternLine("###").addCriterion("has_basalt_tiles",
            this.hasItem(ECBlockRegistry.BASALT_TILES.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.BASALT_TILES_PRESSURE_PLATE.get()).key('#', ECBlockRegistry.BASALT_TILES.get()).patternLine("##").addCriterion("has_basalt_tiles",
            this.hasItem(ECBlockRegistry.BASALT_TILES.get())).build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.BASALT_BRICKS.get(), 4).patternLine("ii").patternLine("ii").key('i', ECBlockRegistry.BASALT.get()).addCriterion("has_basalt",
            this.hasItem(ECBlockRegistry.BASALT.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.BASALT_BRICKS_SLAB.get(), 6).patternLine("iii").key('i', ECBlockRegistry.BASALT_BRICKS.get()).addCriterion("has_basalt_bricks",
            this.hasItem(ECBlockRegistry.BASALT_BRICKS.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.BASALT_BRICKS.get()).patternLine("i").patternLine("i").key('i', ECBlockRegistry.BASALT_BRICKS_SLAB.get()).addCriterion("has_basalt_bricks_slab",
            this.hasItem(ECBlockRegistry.BASALT_BRICKS_SLAB.get())).build(consumer, ECConstants.MODID + ":basalt_bricks_from_slabs");
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.BASALT_BRICKS_STAIRS.get(), 4).key('#', ECBlockRegistry.BASALT_BRICKS.get()).patternLine("#  ").patternLine("## ").patternLine("###").addCriterion(
            "has_basalt_bricks", this.hasItem(ECBlockRegistry.BASALT_BRICKS.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.BASALT_BRICKS_WALL.get(), 6).key('#', ECBlockRegistry.BASALT_BRICKS.get()).patternLine("###").patternLine("###").addCriterion("has_basalt_bricks",
            this.hasItem(ECBlockRegistry.BASALT_BRICKS.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.BASALT_BRICKS_PRESSURE_PLATE.get()).key('#', ECBlockRegistry.BASALT_BRICKS.get()).patternLine("##").addCriterion("has_basalt_bricks",
            this.hasItem(ECBlockRegistry.BASALT_BRICKS.get())).build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.BASALT_LARGE_BRICKS.get(), 4).patternLine("ii").patternLine("ii").key('i', ECBlockRegistry.BASALT_BRICKS.get()).addCriterion("has_basalt_bricks",
            this.hasItem(ECBlockRegistry.BASALT_BRICKS.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.BASALT_LARGE_BRICKS_SLAB.get(), 6).patternLine("iii").key('i', ECBlockRegistry.BASALT_LARGE_BRICKS.get()).addCriterion("has_basalt_large_bricks",
            this.hasItem(ECBlockRegistry.BASALT_LARGE_BRICKS.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.BASALT_LARGE_BRICKS.get()).patternLine("i").patternLine("i").key('i', ECBlockRegistry.BASALT_LARGE_BRICKS_SLAB.get()).addCriterion(
            "has_basalt_large_bricks_slab", this.hasItem(ECBlockRegistry.BASALT_LARGE_BRICKS_SLAB.get())).build(consumer, ECConstants.MODID + ":basalt_large_bricks_from_slabs");
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.BASALT_LARGE_BRICKS_STAIRS.get(), 4).key('#', ECBlockRegistry.BASALT_LARGE_BRICKS.get()).patternLine("#  ").patternLine("## ").patternLine(
            "###").addCriterion("has_basalt_large_bricks", this.hasItem(ECBlockRegistry.BASALT_LARGE_BRICKS.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.BASALT_LARGE_BRICKS_WALL.get(), 6).key('#', ECBlockRegistry.BASALT_LARGE_BRICKS.get()).patternLine("###").patternLine("###").addCriterion(
            "has_basalt_large_bricks", this.hasItem(ECBlockRegistry.BASALT_LARGE_BRICKS.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.BASALT_LARGE_BRICKS_PRESSURE_PLATE.get()).key('#', ECBlockRegistry.BASALT_LARGE_BRICKS.get()).patternLine("##").addCriterion("has_basalt_large_bricks",
            this.hasItem(ECBlockRegistry.BASALT_LARGE_BRICKS.get())).build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.BASALT_ORNAMENT.get()).patternLine("i").patternLine("i").key('i', ECBlockRegistry.SMOOTH_BASALT_SLAB.get()).addCriterion("has_smooth_basalt_slab",
            this.hasItem(ECBlockRegistry.SMOOTH_BASALT_SLAB.get())).build(consumer, ECConstants.MODID + ":basalt_ornament_from_smooth_slabs");
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.BASALT_ORNAMENT.get()).patternLine("i").patternLine("i").key('i', ECBlockRegistry.POLISHED_BASALT_SLAB.get()).addCriterion("has_polished_basalt_slab",
            this.hasItem(ECBlockRegistry.POLISHED_BASALT_SLAB.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.BASALT_ORNAMENT_PRESSURE_PLATE.get()).key('#', ECBlockRegistry.BASALT_ORNAMENT.get()).patternLine("##").addCriterion("has_basalt_ornament",
            this.hasItem(ECBlockRegistry.BASALT_ORNAMENT.get())).build(consumer);
    }
}
