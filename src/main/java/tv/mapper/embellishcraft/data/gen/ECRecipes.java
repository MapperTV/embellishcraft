package tv.mapper.embellishcraft.data.gen;

import java.util.function.Consumer;

import net.minecraft.block.Blocks;
import net.minecraft.data.CookingRecipeBuilder;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.IFinishedRecipe;
import net.minecraft.data.RecipeProvider;
import net.minecraft.data.ShapedRecipeBuilder;
import net.minecraft.data.ShapelessRecipeBuilder;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import net.minecraftforge.common.Tags;
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
        ShapelessRecipeBuilder.shapelessRecipe(ECBlockRegistry.BASALT_BUTTON.get()).addIngredient(ECBlockRegistry.BASALT.get()).addCriterion("has_basalt", this.hasItem(ECBlockRegistry.BASALT.get())).build(
            consumer);

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

        // Slate
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(ECItemRegistry.SLATE_COBBLESTONE_ITEM.get()), ECItemRegistry.SLATE_ITEM.get(), 0.1f, 200).addCriterion("has_slate_cobblestone",
            this.hasItem(ECBlockRegistry.SLATE_COBBLESTONE.get())).build(consumer, ECConstants.MODID + ":slate_from_cobblestone_smelting");

        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.SLATE_SLAB.get(), 6).patternLine("iii").key('i', ECBlockRegistry.SLATE.get()).addCriterion("has_slate", this.hasItem(ECBlockRegistry.SLATE.get())).build(
            consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.SLATE.get()).patternLine("i").patternLine("i").key('i', ECBlockRegistry.SLATE_SLAB.get()).addCriterion("has_slate_slab",
            this.hasItem(ECBlockRegistry.SLATE_SLAB.get())).build(consumer, ECConstants.MODID + ":slate_from_slabs");
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.SLATE_STAIRS.get(), 4).key('#', ECBlockRegistry.SLATE.get()).patternLine("#  ").patternLine("## ").patternLine("###").addCriterion("has_slate",
            this.hasItem(ECBlockRegistry.SLATE.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.SLATE_WALL.get(), 6).key('#', ECBlockRegistry.SLATE.get()).patternLine("###").patternLine("###").addCriterion("has_slate",
            this.hasItem(ECBlockRegistry.SLATE.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.SLATE_PRESSURE_PLATE.get()).key('#', ECBlockRegistry.SLATE.get()).patternLine("##").addCriterion("has_slate",
            this.hasItem(ECBlockRegistry.SLATE.get())).build(consumer);
        ShapelessRecipeBuilder.shapelessRecipe(ECBlockRegistry.SLATE_BUTTON.get()).addIngredient(ECBlockRegistry.SLATE.get()).addCriterion("has_slate", this.hasItem(ECBlockRegistry.SLATE.get())).build(
            consumer);

        ShapelessRecipeBuilder.shapelessRecipe(ECBlockRegistry.POLISHED_SLATE.get()).addIngredient(ECBlockRegistry.SMOOTH_SLATE.get()).addCriterion("has_smooth_slate",
            this.hasItem(ECBlockRegistry.SMOOTH_SLATE.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.POLISHED_SLATE_SLAB.get(), 6).patternLine("iii").key('i', ECBlockRegistry.POLISHED_SLATE.get()).addCriterion("has_polished_slate",
            this.hasItem(ECBlockRegistry.POLISHED_SLATE.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.POLISHED_SLATE.get()).patternLine("i").patternLine("i").key('i', ECBlockRegistry.POLISHED_SLATE_SLAB.get()).addCriterion("has_polished_slate_slab",
            this.hasItem(ECBlockRegistry.POLISHED_SLATE_SLAB.get())).build(consumer, ECConstants.MODID + ":polished_slate_from_slabs");
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.POLISHED_SLATE_STAIRS.get(), 4).key('#', ECBlockRegistry.POLISHED_SLATE.get()).patternLine("#  ").patternLine("## ").patternLine("###").addCriterion(
            "has_polished_slate", this.hasItem(ECBlockRegistry.POLISHED_SLATE.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.POLISHED_SLATE_WALL.get(), 6).key('#', ECBlockRegistry.POLISHED_SLATE.get()).patternLine("###").patternLine("###").addCriterion("has_polished_slate",
            this.hasItem(ECBlockRegistry.POLISHED_SLATE.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.POLISHED_SLATE_PRESSURE_PLATE.get()).key('#', ECBlockRegistry.POLISHED_SLATE.get()).patternLine("##").addCriterion("has_polished_slate",
            this.hasItem(ECBlockRegistry.POLISHED_SLATE.get())).build(consumer);

        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(ECItemRegistry.SLATE_ITEM.get()), ECItemRegistry.SMOOTH_SLATE_ITEM.get(), 0.1f, 200).addCriterion("has_slate",
            this.hasItem(ECBlockRegistry.SLATE.get())).build(consumer, ECConstants.MODID + ":smooth_slate_from_smelting");

        ShapelessRecipeBuilder.shapelessRecipe(ECBlockRegistry.SMOOTH_SLATE.get()).addIngredient(ECBlockRegistry.POLISHED_SLATE.get()).addCriterion("has_polished_slate",
            this.hasItem(ECBlockRegistry.POLISHED_SLATE.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.SMOOTH_SLATE_SLAB.get(), 6).patternLine("iii").key('i', ECBlockRegistry.SMOOTH_SLATE.get()).addCriterion("has_smooth_slate",
            this.hasItem(ECBlockRegistry.SMOOTH_SLATE.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.SMOOTH_SLATE.get()).patternLine("i").patternLine("i").key('i', ECBlockRegistry.SMOOTH_SLATE_SLAB.get()).addCriterion("has_smooth_slate_slab",
            this.hasItem(ECBlockRegistry.SMOOTH_SLATE_SLAB.get())).build(consumer, ECConstants.MODID + ":smooth_slate_from_slabs");
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.SMOOTH_SLATE_STAIRS.get(), 4).key('#', ECBlockRegistry.SMOOTH_SLATE.get()).patternLine("#  ").patternLine("## ").patternLine("###").addCriterion(
            "has_smooth_slate", this.hasItem(ECBlockRegistry.SMOOTH_SLATE.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.SMOOTH_SLATE_WALL.get(), 6).key('#', ECBlockRegistry.SMOOTH_SLATE.get()).patternLine("###").patternLine("###").addCriterion("has_smooth_slate",
            this.hasItem(ECBlockRegistry.SMOOTH_SLATE.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.SMOOTH_SLATE_PRESSURE_PLATE.get()).key('#', ECBlockRegistry.SMOOTH_SLATE.get()).patternLine("##").addCriterion("has_smooth_slate",
            this.hasItem(ECBlockRegistry.SMOOTH_SLATE.get())).build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.SLATE_COBBLESTONE_SLAB.get(), 6).patternLine("iii").key('i', ECBlockRegistry.SLATE_COBBLESTONE.get()).addCriterion("has_slate_cobblestone",
            this.hasItem(ECBlockRegistry.SLATE_COBBLESTONE.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.SLATE_COBBLESTONE.get()).patternLine("i").patternLine("i").key('i', ECBlockRegistry.SLATE_COBBLESTONE_SLAB.get()).addCriterion(
            "has_slate_cobblestone_slab", this.hasItem(ECBlockRegistry.SLATE_COBBLESTONE_SLAB.get())).build(consumer, ECConstants.MODID + ":slate_cobblestone_from_slabs");
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.SLATE_COBBLESTONE_STAIRS.get(), 4).key('#', ECBlockRegistry.SLATE_COBBLESTONE.get()).patternLine("#  ").patternLine("## ").patternLine(
            "###").addCriterion("has_slate_cobblestone", this.hasItem(ECBlockRegistry.SLATE_COBBLESTONE.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.SLATE_COBBLESTONE_WALL.get(), 6).key('#', ECBlockRegistry.SLATE_COBBLESTONE.get()).patternLine("###").patternLine("###").addCriterion(
            "has_slate_cobblestone", this.hasItem(ECBlockRegistry.SLATE_COBBLESTONE.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.SLATE_COBBLESTONE_PRESSURE_PLATE.get()).key('#', ECBlockRegistry.SLATE_COBBLESTONE.get()).patternLine("##").addCriterion("has_slate_cobblestone",
            this.hasItem(ECBlockRegistry.SLATE_COBBLESTONE.get())).build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.SLATE_PAVING.get(), 4).patternLine("ii").patternLine("ii").key('i', ECBlockRegistry.POLISHED_SLATE.get()).addCriterion("has_polished_slate",
            this.hasItem(ECBlockRegistry.POLISHED_SLATE.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.SLATE_PAVING_SLAB.get(), 6).patternLine("iii").key('i', ECBlockRegistry.SLATE_PAVING.get()).addCriterion("has_slate_paving",
            this.hasItem(ECBlockRegistry.SLATE_PAVING.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.SLATE_PAVING.get()).patternLine("i").patternLine("i").key('i', ECBlockRegistry.SLATE_PAVING_SLAB.get()).addCriterion("has_slate_paving_slab",
            this.hasItem(ECBlockRegistry.SLATE_PAVING_SLAB.get())).build(consumer, ECConstants.MODID + ":slate_paving_from_slabs");
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.SLATE_PAVING_STAIRS.get(), 4).key('#', ECBlockRegistry.SLATE_PAVING.get()).patternLine("#  ").patternLine("## ").patternLine("###").addCriterion(
            "has_slate_paving", this.hasItem(ECBlockRegistry.SLATE_PAVING.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.SLATE_PAVING_WALL.get(), 6).key('#', ECBlockRegistry.SLATE_PAVING.get()).patternLine("###").patternLine("###").addCriterion("has_slate_paving",
            this.hasItem(ECBlockRegistry.SLATE_PAVING.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.SLATE_PAVING_PRESSURE_PLATE.get()).key('#', ECBlockRegistry.SLATE_PAVING.get()).patternLine("##").addCriterion("has_slate_paving",
            this.hasItem(ECBlockRegistry.SLATE_PAVING.get())).build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.SLATE_TILES.get(), 4).patternLine("ii").patternLine("ii").key('i', ECBlockRegistry.SLATE_PAVING.get()).addCriterion("has_slate_paving",
            this.hasItem(ECBlockRegistry.SLATE_PAVING.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.SLATE_TILES_SLAB.get(), 6).patternLine("iii").key('i', ECBlockRegistry.SLATE_TILES.get()).addCriterion("has_slate_tiles",
            this.hasItem(ECBlockRegistry.SLATE_TILES.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.SLATE_TILES.get()).patternLine("i").patternLine("i").key('i', ECBlockRegistry.SLATE_TILES_SLAB.get()).addCriterion("has_slate_tiles_slab",
            this.hasItem(ECBlockRegistry.SLATE_TILES_SLAB.get())).build(consumer, ECConstants.MODID + ":slate_tiles_from_slabs");
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.SLATE_TILES_STAIRS.get(), 4).key('#', ECBlockRegistry.SLATE_TILES.get()).patternLine("#  ").patternLine("## ").patternLine("###").addCriterion(
            "has_slate_tiles", this.hasItem(ECBlockRegistry.SLATE_TILES.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.SLATE_TILES_WALL.get(), 6).key('#', ECBlockRegistry.SLATE_TILES.get()).patternLine("###").patternLine("###").addCriterion("has_slate_tiles",
            this.hasItem(ECBlockRegistry.SLATE_TILES.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.SLATE_TILES_PRESSURE_PLATE.get()).key('#', ECBlockRegistry.SLATE_TILES.get()).patternLine("##").addCriterion("has_slate_tiles",
            this.hasItem(ECBlockRegistry.SLATE_TILES.get())).build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.SLATE_BRICKS.get(), 4).patternLine("ii").patternLine("ii").key('i', ECBlockRegistry.SLATE.get()).addCriterion("has_slate",
            this.hasItem(ECBlockRegistry.SLATE.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.SLATE_BRICKS_SLAB.get(), 6).patternLine("iii").key('i', ECBlockRegistry.SLATE_BRICKS.get()).addCriterion("has_slate_bricks",
            this.hasItem(ECBlockRegistry.SLATE_BRICKS.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.SLATE_BRICKS.get()).patternLine("i").patternLine("i").key('i', ECBlockRegistry.SLATE_BRICKS_SLAB.get()).addCriterion("has_slate_bricks_slab",
            this.hasItem(ECBlockRegistry.SLATE_BRICKS_SLAB.get())).build(consumer, ECConstants.MODID + ":slate_bricks_from_slabs");
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.SLATE_BRICKS_STAIRS.get(), 4).key('#', ECBlockRegistry.SLATE_BRICKS.get()).patternLine("#  ").patternLine("## ").patternLine("###").addCriterion(
            "has_slate_bricks", this.hasItem(ECBlockRegistry.SLATE_BRICKS.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.SLATE_BRICKS_WALL.get(), 6).key('#', ECBlockRegistry.SLATE_BRICKS.get()).patternLine("###").patternLine("###").addCriterion("has_slate_bricks",
            this.hasItem(ECBlockRegistry.SLATE_BRICKS.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.SLATE_BRICKS_PRESSURE_PLATE.get()).key('#', ECBlockRegistry.SLATE_BRICKS.get()).patternLine("##").addCriterion("has_slate_bricks",
            this.hasItem(ECBlockRegistry.SLATE_BRICKS.get())).build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.SLATE_LARGE_BRICKS.get(), 4).patternLine("ii").patternLine("ii").key('i', ECBlockRegistry.SLATE_BRICKS.get()).addCriterion("has_slate_bricks",
            this.hasItem(ECBlockRegistry.SLATE_BRICKS.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.SLATE_LARGE_BRICKS_SLAB.get(), 6).patternLine("iii").key('i', ECBlockRegistry.SLATE_LARGE_BRICKS.get()).addCriterion("has_slate_large_bricks",
            this.hasItem(ECBlockRegistry.SLATE_LARGE_BRICKS.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.SLATE_LARGE_BRICKS.get()).patternLine("i").patternLine("i").key('i', ECBlockRegistry.SLATE_LARGE_BRICKS_SLAB.get()).addCriterion(
            "has_slate_large_bricks_slab", this.hasItem(ECBlockRegistry.SLATE_LARGE_BRICKS_SLAB.get())).build(consumer, ECConstants.MODID + ":slate_large_bricks_from_slabs");
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.SLATE_LARGE_BRICKS_STAIRS.get(), 4).key('#', ECBlockRegistry.SLATE_LARGE_BRICKS.get()).patternLine("#  ").patternLine("## ").patternLine(
            "###").addCriterion("has_slate_large_bricks", this.hasItem(ECBlockRegistry.SLATE_LARGE_BRICKS.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.SLATE_LARGE_BRICKS_WALL.get(), 6).key('#', ECBlockRegistry.SLATE_LARGE_BRICKS.get()).patternLine("###").patternLine("###").addCriterion(
            "has_slate_large_bricks", this.hasItem(ECBlockRegistry.SLATE_LARGE_BRICKS.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.SLATE_LARGE_BRICKS_PRESSURE_PLATE.get()).key('#', ECBlockRegistry.SLATE_LARGE_BRICKS.get()).patternLine("##").addCriterion("has_slate_large_bricks",
            this.hasItem(ECBlockRegistry.SLATE_LARGE_BRICKS.get())).build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.SLATE_ORNAMENT.get()).patternLine("i").patternLine("i").key('i', ECBlockRegistry.SMOOTH_SLATE_SLAB.get()).addCriterion("has_smooth_slate_slab",
            this.hasItem(ECBlockRegistry.SMOOTH_SLATE_SLAB.get())).build(consumer, ECConstants.MODID + ":slate_ornament_from_smooth_slabs");
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.SLATE_ORNAMENT.get()).patternLine("i").patternLine("i").key('i', ECBlockRegistry.POLISHED_SLATE_SLAB.get()).addCriterion("has_polished_slate_slab",
            this.hasItem(ECBlockRegistry.POLISHED_SLATE_SLAB.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.SLATE_ORNAMENT_PRESSURE_PLATE.get()).key('#', ECBlockRegistry.SLATE_ORNAMENT.get()).patternLine("##").addCriterion("has_slate_ornament",
            this.hasItem(ECBlockRegistry.SLATE_ORNAMENT.get())).build(consumer);

        // Marble
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(ECItemRegistry.MARBLE_COBBLESTONE_ITEM.get()), ECItemRegistry.MARBLE_ITEM.get(), 0.1f, 200).addCriterion("has_marble_cobblestone",
            this.hasItem(ECBlockRegistry.MARBLE_COBBLESTONE.get())).build(consumer, ECConstants.MODID + ":marble_from_cobblestone_smelting");

        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.MARBLE_SLAB.get(), 6).patternLine("iii").key('i', ECBlockRegistry.MARBLE.get()).addCriterion("has_marble",
            this.hasItem(ECBlockRegistry.MARBLE.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.MARBLE.get()).patternLine("i").patternLine("i").key('i', ECBlockRegistry.MARBLE_SLAB.get()).addCriterion("has_marble_slab",
            this.hasItem(ECBlockRegistry.MARBLE_SLAB.get())).build(consumer, ECConstants.MODID + ":marble_from_slabs");
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.MARBLE_STAIRS.get(), 4).key('#', ECBlockRegistry.MARBLE.get()).patternLine("#  ").patternLine("## ").patternLine("###").addCriterion("has_marble",
            this.hasItem(ECBlockRegistry.MARBLE.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.MARBLE_WALL.get(), 6).key('#', ECBlockRegistry.MARBLE.get()).patternLine("###").patternLine("###").addCriterion("has_marble",
            this.hasItem(ECBlockRegistry.MARBLE.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.MARBLE_PRESSURE_PLATE.get()).key('#', ECBlockRegistry.MARBLE.get()).patternLine("##").addCriterion("has_marble",
            this.hasItem(ECBlockRegistry.MARBLE.get())).build(consumer);
        ShapelessRecipeBuilder.shapelessRecipe(ECBlockRegistry.MARBLE_BUTTON.get()).addIngredient(ECBlockRegistry.MARBLE.get()).addCriterion("has_marble", this.hasItem(ECBlockRegistry.MARBLE.get())).build(
            consumer);

        ShapelessRecipeBuilder.shapelessRecipe(ECBlockRegistry.POLISHED_MARBLE.get()).addIngredient(ECBlockRegistry.SMOOTH_MARBLE.get()).addCriterion("has_smooth_marble",
            this.hasItem(ECBlockRegistry.SMOOTH_MARBLE.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.POLISHED_MARBLE_SLAB.get(), 6).patternLine("iii").key('i', ECBlockRegistry.POLISHED_MARBLE.get()).addCriterion("has_polished_marble",
            this.hasItem(ECBlockRegistry.POLISHED_MARBLE.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.POLISHED_MARBLE.get()).patternLine("i").patternLine("i").key('i', ECBlockRegistry.POLISHED_MARBLE_SLAB.get()).addCriterion("has_polished_marble_slab",
            this.hasItem(ECBlockRegistry.POLISHED_MARBLE_SLAB.get())).build(consumer, ECConstants.MODID + ":polished_marble_from_slabs");
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.POLISHED_MARBLE_STAIRS.get(), 4).key('#', ECBlockRegistry.POLISHED_MARBLE.get()).patternLine("#  ").patternLine("## ").patternLine("###").addCriterion(
            "has_polished_marble", this.hasItem(ECBlockRegistry.POLISHED_MARBLE.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.POLISHED_MARBLE_WALL.get(), 6).key('#', ECBlockRegistry.POLISHED_MARBLE.get()).patternLine("###").patternLine("###").addCriterion("has_polished_marble",
            this.hasItem(ECBlockRegistry.POLISHED_MARBLE.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.POLISHED_MARBLE_PRESSURE_PLATE.get()).key('#', ECBlockRegistry.POLISHED_MARBLE.get()).patternLine("##").addCriterion("has_polished_marble",
            this.hasItem(ECBlockRegistry.POLISHED_MARBLE.get())).build(consumer);

        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(ECItemRegistry.MARBLE_ITEM.get()), ECItemRegistry.SMOOTH_MARBLE_ITEM.get(), 0.1f, 200).addCriterion("has_marble",
            this.hasItem(ECBlockRegistry.MARBLE.get())).build(consumer, ECConstants.MODID + ":smooth_marble_from_smelting");

        ShapelessRecipeBuilder.shapelessRecipe(ECBlockRegistry.SMOOTH_MARBLE.get()).addIngredient(ECBlockRegistry.POLISHED_MARBLE.get()).addCriterion("has_polished_marble",
            this.hasItem(ECBlockRegistry.POLISHED_MARBLE.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.SMOOTH_MARBLE_SLAB.get(), 6).patternLine("iii").key('i', ECBlockRegistry.SMOOTH_MARBLE.get()).addCriterion("has_smooth_marble",
            this.hasItem(ECBlockRegistry.SMOOTH_MARBLE.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.SMOOTH_MARBLE.get()).patternLine("i").patternLine("i").key('i', ECBlockRegistry.SMOOTH_MARBLE_SLAB.get()).addCriterion("has_smooth_marble_slab",
            this.hasItem(ECBlockRegistry.SMOOTH_MARBLE_SLAB.get())).build(consumer, ECConstants.MODID + ":smooth_marble_from_slabs");
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.SMOOTH_MARBLE_STAIRS.get(), 4).key('#', ECBlockRegistry.SMOOTH_MARBLE.get()).patternLine("#  ").patternLine("## ").patternLine("###").addCriterion(
            "has_smooth_marble", this.hasItem(ECBlockRegistry.SMOOTH_MARBLE.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.SMOOTH_MARBLE_WALL.get(), 6).key('#', ECBlockRegistry.SMOOTH_MARBLE.get()).patternLine("###").patternLine("###").addCriterion("has_smooth_marble",
            this.hasItem(ECBlockRegistry.SMOOTH_MARBLE.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.SMOOTH_MARBLE_PRESSURE_PLATE.get()).key('#', ECBlockRegistry.SMOOTH_MARBLE.get()).patternLine("##").addCriterion("has_smooth_marble",
            this.hasItem(ECBlockRegistry.SMOOTH_MARBLE.get())).build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.MARBLE_COBBLESTONE_SLAB.get(), 6).patternLine("iii").key('i', ECBlockRegistry.MARBLE_COBBLESTONE.get()).addCriterion("has_marble_cobblestone",
            this.hasItem(ECBlockRegistry.MARBLE_COBBLESTONE.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.MARBLE_COBBLESTONE.get()).patternLine("i").patternLine("i").key('i', ECBlockRegistry.MARBLE_COBBLESTONE_SLAB.get()).addCriterion(
            "has_marble_cobblestone_slab", this.hasItem(ECBlockRegistry.MARBLE_COBBLESTONE_SLAB.get())).build(consumer, ECConstants.MODID + ":marble_cobblestone_from_slabs");
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.MARBLE_COBBLESTONE_STAIRS.get(), 4).key('#', ECBlockRegistry.MARBLE_COBBLESTONE.get()).patternLine("#  ").patternLine("## ").patternLine(
            "###").addCriterion("has_marble_cobblestone", this.hasItem(ECBlockRegistry.MARBLE_COBBLESTONE.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.MARBLE_COBBLESTONE_WALL.get(), 6).key('#', ECBlockRegistry.MARBLE_COBBLESTONE.get()).patternLine("###").patternLine("###").addCriterion(
            "has_marble_cobblestone", this.hasItem(ECBlockRegistry.MARBLE_COBBLESTONE.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.MARBLE_COBBLESTONE_PRESSURE_PLATE.get()).key('#', ECBlockRegistry.MARBLE_COBBLESTONE.get()).patternLine("##").addCriterion("has_marble_cobblestone",
            this.hasItem(ECBlockRegistry.MARBLE_COBBLESTONE.get())).build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.MARBLE_PAVING.get(), 4).patternLine("ii").patternLine("ii").key('i', ECBlockRegistry.POLISHED_MARBLE.get()).addCriterion("has_polished_marble",
            this.hasItem(ECBlockRegistry.POLISHED_MARBLE.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.MARBLE_PAVING_SLAB.get(), 6).patternLine("iii").key('i', ECBlockRegistry.MARBLE_PAVING.get()).addCriterion("has_marble_paving",
            this.hasItem(ECBlockRegistry.MARBLE_PAVING.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.MARBLE_PAVING.get()).patternLine("i").patternLine("i").key('i', ECBlockRegistry.MARBLE_PAVING_SLAB.get()).addCriterion("has_marble_paving_slab",
            this.hasItem(ECBlockRegistry.MARBLE_PAVING_SLAB.get())).build(consumer, ECConstants.MODID + ":marble_paving_from_slabs");
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.MARBLE_PAVING_STAIRS.get(), 4).key('#', ECBlockRegistry.MARBLE_PAVING.get()).patternLine("#  ").patternLine("## ").patternLine("###").addCriterion(
            "has_marble_paving", this.hasItem(ECBlockRegistry.MARBLE_PAVING.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.MARBLE_PAVING_WALL.get(), 6).key('#', ECBlockRegistry.MARBLE_PAVING.get()).patternLine("###").patternLine("###").addCriterion("has_marble_paving",
            this.hasItem(ECBlockRegistry.MARBLE_PAVING.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.MARBLE_PAVING_PRESSURE_PLATE.get()).key('#', ECBlockRegistry.MARBLE_PAVING.get()).patternLine("##").addCriterion("has_marble_paving",
            this.hasItem(ECBlockRegistry.MARBLE_PAVING.get())).build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.MARBLE_TILES.get(), 4).patternLine("ii").patternLine("ii").key('i', ECBlockRegistry.MARBLE_PAVING.get()).addCriterion("has_marble_paving",
            this.hasItem(ECBlockRegistry.MARBLE_PAVING.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.MARBLE_TILES_SLAB.get(), 6).patternLine("iii").key('i', ECBlockRegistry.MARBLE_TILES.get()).addCriterion("has_marble_tiles",
            this.hasItem(ECBlockRegistry.MARBLE_TILES.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.MARBLE_TILES.get()).patternLine("i").patternLine("i").key('i', ECBlockRegistry.MARBLE_TILES_SLAB.get()).addCriterion("has_marble_tiles_slab",
            this.hasItem(ECBlockRegistry.MARBLE_TILES_SLAB.get())).build(consumer, ECConstants.MODID + ":marble_tiles_from_slabs");
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.MARBLE_TILES_STAIRS.get(), 4).key('#', ECBlockRegistry.MARBLE_TILES.get()).patternLine("#  ").patternLine("## ").patternLine("###").addCriterion(
            "has_marble_tiles", this.hasItem(ECBlockRegistry.MARBLE_TILES.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.MARBLE_TILES_WALL.get(), 6).key('#', ECBlockRegistry.MARBLE_TILES.get()).patternLine("###").patternLine("###").addCriterion("has_marble_tiles",
            this.hasItem(ECBlockRegistry.MARBLE_TILES.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.MARBLE_TILES_PRESSURE_PLATE.get()).key('#', ECBlockRegistry.MARBLE_TILES.get()).patternLine("##").addCriterion("has_marble_tiles",
            this.hasItem(ECBlockRegistry.MARBLE_TILES.get())).build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.MARBLE_BRICKS.get(), 4).patternLine("ii").patternLine("ii").key('i', ECBlockRegistry.MARBLE.get()).addCriterion("has_marble",
            this.hasItem(ECBlockRegistry.MARBLE.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.MARBLE_BRICKS_SLAB.get(), 6).patternLine("iii").key('i', ECBlockRegistry.MARBLE_BRICKS.get()).addCriterion("has_marble_bricks",
            this.hasItem(ECBlockRegistry.MARBLE_BRICKS.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.MARBLE_BRICKS.get()).patternLine("i").patternLine("i").key('i', ECBlockRegistry.MARBLE_BRICKS_SLAB.get()).addCriterion("has_marble_bricks_slab",
            this.hasItem(ECBlockRegistry.MARBLE_BRICKS_SLAB.get())).build(consumer, ECConstants.MODID + ":marble_bricks_from_slabs");
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.MARBLE_BRICKS_STAIRS.get(), 4).key('#', ECBlockRegistry.MARBLE_BRICKS.get()).patternLine("#  ").patternLine("## ").patternLine("###").addCriterion(
            "has_marble_bricks", this.hasItem(ECBlockRegistry.MARBLE_BRICKS.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.MARBLE_BRICKS_WALL.get(), 6).key('#', ECBlockRegistry.MARBLE_BRICKS.get()).patternLine("###").patternLine("###").addCriterion("has_marble_bricks",
            this.hasItem(ECBlockRegistry.MARBLE_BRICKS.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.MARBLE_BRICKS_PRESSURE_PLATE.get()).key('#', ECBlockRegistry.MARBLE_BRICKS.get()).patternLine("##").addCriterion("has_marble_bricks",
            this.hasItem(ECBlockRegistry.MARBLE_BRICKS.get())).build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.MARBLE_LARGE_BRICKS.get(), 4).patternLine("ii").patternLine("ii").key('i', ECBlockRegistry.MARBLE_BRICKS.get()).addCriterion("has_marble_bricks",
            this.hasItem(ECBlockRegistry.MARBLE_BRICKS.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.MARBLE_LARGE_BRICKS_SLAB.get(), 6).patternLine("iii").key('i', ECBlockRegistry.MARBLE_LARGE_BRICKS.get()).addCriterion("has_marble_large_bricks",
            this.hasItem(ECBlockRegistry.MARBLE_LARGE_BRICKS.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.MARBLE_LARGE_BRICKS.get()).patternLine("i").patternLine("i").key('i', ECBlockRegistry.MARBLE_LARGE_BRICKS_SLAB.get()).addCriterion(
            "has_marble_large_bricks_slab", this.hasItem(ECBlockRegistry.MARBLE_LARGE_BRICKS_SLAB.get())).build(consumer, ECConstants.MODID + ":marble_large_bricks_from_slabs");
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.MARBLE_LARGE_BRICKS_STAIRS.get(), 4).key('#', ECBlockRegistry.MARBLE_LARGE_BRICKS.get()).patternLine("#  ").patternLine("## ").patternLine(
            "###").addCriterion("has_marble_large_bricks", this.hasItem(ECBlockRegistry.MARBLE_LARGE_BRICKS.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.MARBLE_LARGE_BRICKS_WALL.get(), 6).key('#', ECBlockRegistry.MARBLE_LARGE_BRICKS.get()).patternLine("###").patternLine("###").addCriterion(
            "has_marble_large_bricks", this.hasItem(ECBlockRegistry.MARBLE_LARGE_BRICKS.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.MARBLE_LARGE_BRICKS_PRESSURE_PLATE.get()).key('#', ECBlockRegistry.MARBLE_LARGE_BRICKS.get()).patternLine("##").addCriterion("has_marble_large_bricks",
            this.hasItem(ECBlockRegistry.MARBLE_LARGE_BRICKS.get())).build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.MARBLE_ORNAMENT.get()).patternLine("i").patternLine("i").key('i', ECBlockRegistry.SMOOTH_MARBLE_SLAB.get()).addCriterion("has_smooth_marble_slab",
            this.hasItem(ECBlockRegistry.SMOOTH_MARBLE_SLAB.get())).build(consumer, ECConstants.MODID + ":marble_ornament_from_smooth_slabs");
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.MARBLE_ORNAMENT.get()).patternLine("i").patternLine("i").key('i', ECBlockRegistry.POLISHED_MARBLE_SLAB.get()).addCriterion("has_polished_marble_slab",
            this.hasItem(ECBlockRegistry.POLISHED_MARBLE_SLAB.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.MARBLE_ORNAMENT_PRESSURE_PLATE.get()).key('#', ECBlockRegistry.MARBLE_ORNAMENT.get()).patternLine("##").addCriterion("has_marble_ornament",
            this.hasItem(ECBlockRegistry.MARBLE_ORNAMENT.get())).build(consumer);

        // Gneiss
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(ECItemRegistry.GNEISS_COBBLESTONE_ITEM.get()), ECItemRegistry.GNEISS_ITEM.get(), 0.1f, 200).addCriterion("has_gneiss_cobblestone",
            this.hasItem(ECBlockRegistry.GNEISS_COBBLESTONE.get())).build(consumer, ECConstants.MODID + ":gneiss_from_cobblestone_smelting");

        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.GNEISS_SLAB.get(), 6).patternLine("iii").key('i', ECBlockRegistry.GNEISS.get()).addCriterion("has_gneiss",
            this.hasItem(ECBlockRegistry.GNEISS.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.GNEISS.get()).patternLine("i").patternLine("i").key('i', ECBlockRegistry.GNEISS_SLAB.get()).addCriterion("has_gneiss_slab",
            this.hasItem(ECBlockRegistry.GNEISS_SLAB.get())).build(consumer, ECConstants.MODID + ":gneiss_from_slabs");
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.GNEISS_STAIRS.get(), 4).key('#', ECBlockRegistry.GNEISS.get()).patternLine("#  ").patternLine("## ").patternLine("###").addCriterion("has_gneiss",
            this.hasItem(ECBlockRegistry.GNEISS.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.GNEISS_WALL.get(), 6).key('#', ECBlockRegistry.GNEISS.get()).patternLine("###").patternLine("###").addCriterion("has_gneiss",
            this.hasItem(ECBlockRegistry.GNEISS.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.GNEISS_PRESSURE_PLATE.get()).key('#', ECBlockRegistry.GNEISS.get()).patternLine("##").addCriterion("has_gneiss",
            this.hasItem(ECBlockRegistry.GNEISS.get())).build(consumer);
        ShapelessRecipeBuilder.shapelessRecipe(ECBlockRegistry.GNEISS_BUTTON.get()).addIngredient(ECBlockRegistry.GNEISS.get()).addCriterion("has_gneiss", this.hasItem(ECBlockRegistry.GNEISS.get())).build(
            consumer);

        ShapelessRecipeBuilder.shapelessRecipe(ECBlockRegistry.POLISHED_GNEISS.get()).addIngredient(ECBlockRegistry.SMOOTH_GNEISS.get()).addCriterion("has_smooth_gneiss",
            this.hasItem(ECBlockRegistry.SMOOTH_GNEISS.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.POLISHED_GNEISS_SLAB.get(), 6).patternLine("iii").key('i', ECBlockRegistry.POLISHED_GNEISS.get()).addCriterion("has_polished_gneiss",
            this.hasItem(ECBlockRegistry.POLISHED_GNEISS.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.POLISHED_GNEISS.get()).patternLine("i").patternLine("i").key('i', ECBlockRegistry.POLISHED_GNEISS_SLAB.get()).addCriterion("has_polished_gneiss_slab",
            this.hasItem(ECBlockRegistry.POLISHED_GNEISS_SLAB.get())).build(consumer, ECConstants.MODID + ":polished_gneiss_from_slabs");
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.POLISHED_GNEISS_STAIRS.get(), 4).key('#', ECBlockRegistry.POLISHED_GNEISS.get()).patternLine("#  ").patternLine("## ").patternLine("###").addCriterion(
            "has_polished_gneiss", this.hasItem(ECBlockRegistry.POLISHED_GNEISS.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.POLISHED_GNEISS_WALL.get(), 6).key('#', ECBlockRegistry.POLISHED_GNEISS.get()).patternLine("###").patternLine("###").addCriterion("has_polished_gneiss",
            this.hasItem(ECBlockRegistry.POLISHED_GNEISS.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.POLISHED_GNEISS_PRESSURE_PLATE.get()).key('#', ECBlockRegistry.POLISHED_GNEISS.get()).patternLine("##").addCriterion("has_polished_gneiss",
            this.hasItem(ECBlockRegistry.POLISHED_GNEISS.get())).build(consumer);

        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(ECItemRegistry.GNEISS_ITEM.get()), ECItemRegistry.SMOOTH_GNEISS_ITEM.get(), 0.1f, 200).addCriterion("has_gneiss",
            this.hasItem(ECBlockRegistry.GNEISS.get())).build(consumer, ECConstants.MODID + ":smooth_gneiss_from_smelting");

        ShapelessRecipeBuilder.shapelessRecipe(ECBlockRegistry.SMOOTH_GNEISS.get()).addIngredient(ECBlockRegistry.POLISHED_GNEISS.get()).addCriterion("has_polished_gneiss",
            this.hasItem(ECBlockRegistry.POLISHED_GNEISS.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.SMOOTH_GNEISS_SLAB.get(), 6).patternLine("iii").key('i', ECBlockRegistry.SMOOTH_GNEISS.get()).addCriterion("has_smooth_gneiss",
            this.hasItem(ECBlockRegistry.SMOOTH_GNEISS.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.SMOOTH_GNEISS.get()).patternLine("i").patternLine("i").key('i', ECBlockRegistry.SMOOTH_GNEISS_SLAB.get()).addCriterion("has_smooth_gneiss_slab",
            this.hasItem(ECBlockRegistry.SMOOTH_GNEISS_SLAB.get())).build(consumer, ECConstants.MODID + ":smooth_gneiss_from_slabs");
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.SMOOTH_GNEISS_STAIRS.get(), 4).key('#', ECBlockRegistry.SMOOTH_GNEISS.get()).patternLine("#  ").patternLine("## ").patternLine("###").addCriterion(
            "has_smooth_gneiss", this.hasItem(ECBlockRegistry.SMOOTH_GNEISS.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.SMOOTH_GNEISS_WALL.get(), 6).key('#', ECBlockRegistry.SMOOTH_GNEISS.get()).patternLine("###").patternLine("###").addCriterion("has_smooth_gneiss",
            this.hasItem(ECBlockRegistry.SMOOTH_GNEISS.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.SMOOTH_GNEISS_PRESSURE_PLATE.get()).key('#', ECBlockRegistry.SMOOTH_GNEISS.get()).patternLine("##").addCriterion("has_smooth_gneiss",
            this.hasItem(ECBlockRegistry.SMOOTH_GNEISS.get())).build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.GNEISS_COBBLESTONE_SLAB.get(), 6).patternLine("iii").key('i', ECBlockRegistry.GNEISS_COBBLESTONE.get()).addCriterion("has_gneiss_cobblestone",
            this.hasItem(ECBlockRegistry.GNEISS_COBBLESTONE.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.GNEISS_COBBLESTONE.get()).patternLine("i").patternLine("i").key('i', ECBlockRegistry.GNEISS_COBBLESTONE_SLAB.get()).addCriterion(
            "has_gneiss_cobblestone_slab", this.hasItem(ECBlockRegistry.GNEISS_COBBLESTONE_SLAB.get())).build(consumer, ECConstants.MODID + ":gneiss_cobblestone_from_slabs");
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.GNEISS_COBBLESTONE_STAIRS.get(), 4).key('#', ECBlockRegistry.GNEISS_COBBLESTONE.get()).patternLine("#  ").patternLine("## ").patternLine(
            "###").addCriterion("has_gneiss_cobblestone", this.hasItem(ECBlockRegistry.GNEISS_COBBLESTONE.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.GNEISS_COBBLESTONE_WALL.get(), 6).key('#', ECBlockRegistry.GNEISS_COBBLESTONE.get()).patternLine("###").patternLine("###").addCriterion(
            "has_gneiss_cobblestone", this.hasItem(ECBlockRegistry.GNEISS_COBBLESTONE.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.GNEISS_COBBLESTONE_PRESSURE_PLATE.get()).key('#', ECBlockRegistry.GNEISS_COBBLESTONE.get()).patternLine("##").addCriterion("has_gneiss_cobblestone",
            this.hasItem(ECBlockRegistry.GNEISS_COBBLESTONE.get())).build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.GNEISS_PAVING.get(), 4).patternLine("ii").patternLine("ii").key('i', ECBlockRegistry.POLISHED_GNEISS.get()).addCriterion("has_polished_gneiss",
            this.hasItem(ECBlockRegistry.POLISHED_GNEISS.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.GNEISS_PAVING_SLAB.get(), 6).patternLine("iii").key('i', ECBlockRegistry.GNEISS_PAVING.get()).addCriterion("has_gneiss_paving",
            this.hasItem(ECBlockRegistry.GNEISS_PAVING.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.GNEISS_PAVING.get()).patternLine("i").patternLine("i").key('i', ECBlockRegistry.GNEISS_PAVING_SLAB.get()).addCriterion("has_gneiss_paving_slab",
            this.hasItem(ECBlockRegistry.GNEISS_PAVING_SLAB.get())).build(consumer, ECConstants.MODID + ":gneiss_paving_from_slabs");
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.GNEISS_PAVING_STAIRS.get(), 4).key('#', ECBlockRegistry.GNEISS_PAVING.get()).patternLine("#  ").patternLine("## ").patternLine("###").addCriterion(
            "has_gneiss_paving", this.hasItem(ECBlockRegistry.GNEISS_PAVING.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.GNEISS_PAVING_WALL.get(), 6).key('#', ECBlockRegistry.GNEISS_PAVING.get()).patternLine("###").patternLine("###").addCriterion("has_gneiss_paving",
            this.hasItem(ECBlockRegistry.GNEISS_PAVING.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.GNEISS_PAVING_PRESSURE_PLATE.get()).key('#', ECBlockRegistry.GNEISS_PAVING.get()).patternLine("##").addCriterion("has_gneiss_paving",
            this.hasItem(ECBlockRegistry.GNEISS_PAVING.get())).build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.GNEISS_TILES.get(), 4).patternLine("ii").patternLine("ii").key('i', ECBlockRegistry.GNEISS_PAVING.get()).addCriterion("has_gneiss_paving",
            this.hasItem(ECBlockRegistry.GNEISS_PAVING.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.GNEISS_TILES_SLAB.get(), 6).patternLine("iii").key('i', ECBlockRegistry.GNEISS_TILES.get()).addCriterion("has_gneiss_tiles",
            this.hasItem(ECBlockRegistry.GNEISS_TILES.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.GNEISS_TILES.get()).patternLine("i").patternLine("i").key('i', ECBlockRegistry.GNEISS_TILES_SLAB.get()).addCriterion("has_gneiss_tiles_slab",
            this.hasItem(ECBlockRegistry.GNEISS_TILES_SLAB.get())).build(consumer, ECConstants.MODID + ":gneiss_tiles_from_slabs");
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.GNEISS_TILES_STAIRS.get(), 4).key('#', ECBlockRegistry.GNEISS_TILES.get()).patternLine("#  ").patternLine("## ").patternLine("###").addCriterion(
            "has_gneiss_tiles", this.hasItem(ECBlockRegistry.GNEISS_TILES.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.GNEISS_TILES_WALL.get(), 6).key('#', ECBlockRegistry.GNEISS_TILES.get()).patternLine("###").patternLine("###").addCriterion("has_gneiss_tiles",
            this.hasItem(ECBlockRegistry.GNEISS_TILES.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.GNEISS_TILES_PRESSURE_PLATE.get()).key('#', ECBlockRegistry.GNEISS_TILES.get()).patternLine("##").addCriterion("has_gneiss_tiles",
            this.hasItem(ECBlockRegistry.GNEISS_TILES.get())).build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.GNEISS_BRICKS.get(), 4).patternLine("ii").patternLine("ii").key('i', ECBlockRegistry.GNEISS.get()).addCriterion("has_gneiss",
            this.hasItem(ECBlockRegistry.GNEISS.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.GNEISS_BRICKS_SLAB.get(), 6).patternLine("iii").key('i', ECBlockRegistry.GNEISS_BRICKS.get()).addCriterion("has_gneiss_bricks",
            this.hasItem(ECBlockRegistry.GNEISS_BRICKS.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.GNEISS_BRICKS.get()).patternLine("i").patternLine("i").key('i', ECBlockRegistry.GNEISS_BRICKS_SLAB.get()).addCriterion("has_gneiss_bricks_slab",
            this.hasItem(ECBlockRegistry.GNEISS_BRICKS_SLAB.get())).build(consumer, ECConstants.MODID + ":gneiss_bricks_from_slabs");
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.GNEISS_BRICKS_STAIRS.get(), 4).key('#', ECBlockRegistry.GNEISS_BRICKS.get()).patternLine("#  ").patternLine("## ").patternLine("###").addCriterion(
            "has_gneiss_bricks", this.hasItem(ECBlockRegistry.GNEISS_BRICKS.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.GNEISS_BRICKS_WALL.get(), 6).key('#', ECBlockRegistry.GNEISS_BRICKS.get()).patternLine("###").patternLine("###").addCriterion("has_gneiss_bricks",
            this.hasItem(ECBlockRegistry.GNEISS_BRICKS.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.GNEISS_BRICKS_PRESSURE_PLATE.get()).key('#', ECBlockRegistry.GNEISS_BRICKS.get()).patternLine("##").addCriterion("has_gneiss_bricks",
            this.hasItem(ECBlockRegistry.GNEISS_BRICKS.get())).build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.GNEISS_LARGE_BRICKS.get(), 4).patternLine("ii").patternLine("ii").key('i', ECBlockRegistry.GNEISS_BRICKS.get()).addCriterion("has_gneiss_bricks",
            this.hasItem(ECBlockRegistry.GNEISS_BRICKS.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.GNEISS_LARGE_BRICKS_SLAB.get(), 6).patternLine("iii").key('i', ECBlockRegistry.GNEISS_LARGE_BRICKS.get()).addCriterion("has_gneiss_large_bricks",
            this.hasItem(ECBlockRegistry.GNEISS_LARGE_BRICKS.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.GNEISS_LARGE_BRICKS.get()).patternLine("i").patternLine("i").key('i', ECBlockRegistry.GNEISS_LARGE_BRICKS_SLAB.get()).addCriterion(
            "has_gneiss_large_bricks_slab", this.hasItem(ECBlockRegistry.GNEISS_LARGE_BRICKS_SLAB.get())).build(consumer, ECConstants.MODID + ":gneiss_large_bricks_from_slabs");
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.GNEISS_LARGE_BRICKS_STAIRS.get(), 4).key('#', ECBlockRegistry.GNEISS_LARGE_BRICKS.get()).patternLine("#  ").patternLine("## ").patternLine(
            "###").addCriterion("has_gneiss_large_bricks", this.hasItem(ECBlockRegistry.GNEISS_LARGE_BRICKS.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.GNEISS_LARGE_BRICKS_WALL.get(), 6).key('#', ECBlockRegistry.GNEISS_LARGE_BRICKS.get()).patternLine("###").patternLine("###").addCriterion(
            "has_gneiss_large_bricks", this.hasItem(ECBlockRegistry.GNEISS_LARGE_BRICKS.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.GNEISS_LARGE_BRICKS_PRESSURE_PLATE.get()).key('#', ECBlockRegistry.GNEISS_LARGE_BRICKS.get()).patternLine("##").addCriterion("has_gneiss_large_bricks",
            this.hasItem(ECBlockRegistry.GNEISS_LARGE_BRICKS.get())).build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.GNEISS_ORNAMENT.get()).patternLine("i").patternLine("i").key('i', ECBlockRegistry.SMOOTH_GNEISS_SLAB.get()).addCriterion("has_smooth_gneiss_slab",
            this.hasItem(ECBlockRegistry.SMOOTH_GNEISS_SLAB.get())).build(consumer, ECConstants.MODID + ":gneiss_ornament_from_smooth_slabs");
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.GNEISS_ORNAMENT.get()).patternLine("i").patternLine("i").key('i', ECBlockRegistry.POLISHED_GNEISS_SLAB.get()).addCriterion("has_polished_gneiss_slab",
            this.hasItem(ECBlockRegistry.POLISHED_GNEISS_SLAB.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.GNEISS_ORNAMENT_PRESSURE_PLATE.get()).key('#', ECBlockRegistry.GNEISS_ORNAMENT.get()).patternLine("##").addCriterion("has_gneiss_ornament",
            this.hasItem(ECBlockRegistry.GNEISS_ORNAMENT.get())).build(consumer);

        // Jade
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(ECItemRegistry.JADE_COBBLESTONE_ITEM.get()), ECItemRegistry.JADE_ITEM.get(), 0.1f, 200).addCriterion("has_jade_cobblestone",
            this.hasItem(ECBlockRegistry.JADE_COBBLESTONE.get())).build(consumer, ECConstants.MODID + ":jade_from_cobblestone_smelting");

        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.JADE_SLAB.get(), 6).patternLine("iii").key('i', ECBlockRegistry.JADE.get()).addCriterion("has_jade", this.hasItem(ECBlockRegistry.JADE.get())).build(
            consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.JADE.get()).patternLine("i").patternLine("i").key('i', ECBlockRegistry.JADE_SLAB.get()).addCriterion("has_jade_slab",
            this.hasItem(ECBlockRegistry.JADE_SLAB.get())).build(consumer, ECConstants.MODID + ":jade_from_slabs");
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.JADE_STAIRS.get(), 4).key('#', ECBlockRegistry.JADE.get()).patternLine("#  ").patternLine("## ").patternLine("###").addCriterion("has_jade",
            this.hasItem(ECBlockRegistry.JADE.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.JADE_WALL.get(), 6).key('#', ECBlockRegistry.JADE.get()).patternLine("###").patternLine("###").addCriterion("has_jade",
            this.hasItem(ECBlockRegistry.JADE.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.JADE_PRESSURE_PLATE.get()).key('#', ECBlockRegistry.JADE.get()).patternLine("##").addCriterion("has_jade",
            this.hasItem(ECBlockRegistry.JADE.get())).build(consumer);
        ShapelessRecipeBuilder.shapelessRecipe(ECBlockRegistry.JADE_BUTTON.get()).addIngredient(ECBlockRegistry.JADE.get()).addCriterion("has_jade", this.hasItem(ECBlockRegistry.JADE.get())).build(consumer);

        ShapelessRecipeBuilder.shapelessRecipe(ECBlockRegistry.POLISHED_JADE.get()).addIngredient(ECBlockRegistry.SMOOTH_JADE.get()).addCriterion("has_smooth_jade",
            this.hasItem(ECBlockRegistry.SMOOTH_JADE.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.POLISHED_JADE_SLAB.get(), 6).patternLine("iii").key('i', ECBlockRegistry.POLISHED_JADE.get()).addCriterion("has_polished_jade",
            this.hasItem(ECBlockRegistry.POLISHED_JADE.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.POLISHED_JADE.get()).patternLine("i").patternLine("i").key('i', ECBlockRegistry.POLISHED_JADE_SLAB.get()).addCriterion("has_polished_jade_slab",
            this.hasItem(ECBlockRegistry.POLISHED_JADE_SLAB.get())).build(consumer, ECConstants.MODID + ":polished_jade_from_slabs");
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.POLISHED_JADE_STAIRS.get(), 4).key('#', ECBlockRegistry.POLISHED_JADE.get()).patternLine("#  ").patternLine("## ").patternLine("###").addCriterion(
            "has_polished_jade", this.hasItem(ECBlockRegistry.POLISHED_JADE.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.POLISHED_JADE_WALL.get(), 6).key('#', ECBlockRegistry.POLISHED_JADE.get()).patternLine("###").patternLine("###").addCriterion("has_polished_jade",
            this.hasItem(ECBlockRegistry.POLISHED_JADE.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.POLISHED_JADE_PRESSURE_PLATE.get()).key('#', ECBlockRegistry.POLISHED_JADE.get()).patternLine("##").addCriterion("has_polished_jade",
            this.hasItem(ECBlockRegistry.POLISHED_JADE.get())).build(consumer);

        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(ECItemRegistry.JADE_ITEM.get()), ECItemRegistry.SMOOTH_JADE_ITEM.get(), 0.1f, 200).addCriterion("has_jade",
            this.hasItem(ECBlockRegistry.JADE.get())).build(consumer, ECConstants.MODID + ":smooth_jade_from_smelting");

        ShapelessRecipeBuilder.shapelessRecipe(ECBlockRegistry.SMOOTH_JADE.get()).addIngredient(ECBlockRegistry.POLISHED_JADE.get()).addCriterion("has_polished_jade",
            this.hasItem(ECBlockRegistry.POLISHED_JADE.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.SMOOTH_JADE_SLAB.get(), 6).patternLine("iii").key('i', ECBlockRegistry.SMOOTH_JADE.get()).addCriterion("has_smooth_jade",
            this.hasItem(ECBlockRegistry.SMOOTH_JADE.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.SMOOTH_JADE.get()).patternLine("i").patternLine("i").key('i', ECBlockRegistry.SMOOTH_JADE_SLAB.get()).addCriterion("has_smooth_jade_slab",
            this.hasItem(ECBlockRegistry.SMOOTH_JADE_SLAB.get())).build(consumer, ECConstants.MODID + ":smooth_jade_from_slabs");
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.SMOOTH_JADE_STAIRS.get(), 4).key('#', ECBlockRegistry.SMOOTH_JADE.get()).patternLine("#  ").patternLine("## ").patternLine("###").addCriterion(
            "has_smooth_jade", this.hasItem(ECBlockRegistry.SMOOTH_JADE.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.SMOOTH_JADE_WALL.get(), 6).key('#', ECBlockRegistry.SMOOTH_JADE.get()).patternLine("###").patternLine("###").addCriterion("has_smooth_jade",
            this.hasItem(ECBlockRegistry.SMOOTH_JADE.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.SMOOTH_JADE_PRESSURE_PLATE.get()).key('#', ECBlockRegistry.SMOOTH_JADE.get()).patternLine("##").addCriterion("has_smooth_jade",
            this.hasItem(ECBlockRegistry.SMOOTH_JADE.get())).build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.JADE_COBBLESTONE_SLAB.get(), 6).patternLine("iii").key('i', ECBlockRegistry.JADE_COBBLESTONE.get()).addCriterion("has_jade_cobblestone",
            this.hasItem(ECBlockRegistry.JADE_COBBLESTONE.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.JADE_COBBLESTONE.get()).patternLine("i").patternLine("i").key('i', ECBlockRegistry.JADE_COBBLESTONE_SLAB.get()).addCriterion("has_jade_cobblestone_slab",
            this.hasItem(ECBlockRegistry.JADE_COBBLESTONE_SLAB.get())).build(consumer, ECConstants.MODID + ":jade_cobblestone_from_slabs");
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.JADE_COBBLESTONE_STAIRS.get(), 4).key('#', ECBlockRegistry.JADE_COBBLESTONE.get()).patternLine("#  ").patternLine("## ").patternLine("###").addCriterion(
            "has_jade_cobblestone", this.hasItem(ECBlockRegistry.JADE_COBBLESTONE.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.JADE_COBBLESTONE_WALL.get(), 6).key('#', ECBlockRegistry.JADE_COBBLESTONE.get()).patternLine("###").patternLine("###").addCriterion(
            "has_jade_cobblestone", this.hasItem(ECBlockRegistry.JADE_COBBLESTONE.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.JADE_COBBLESTONE_PRESSURE_PLATE.get()).key('#', ECBlockRegistry.JADE_COBBLESTONE.get()).patternLine("##").addCriterion("has_jade_cobblestone",
            this.hasItem(ECBlockRegistry.JADE_COBBLESTONE.get())).build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.JADE_PAVING.get(), 4).patternLine("ii").patternLine("ii").key('i', ECBlockRegistry.POLISHED_JADE.get()).addCriterion("has_polished_jade",
            this.hasItem(ECBlockRegistry.POLISHED_JADE.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.JADE_PAVING_SLAB.get(), 6).patternLine("iii").key('i', ECBlockRegistry.JADE_PAVING.get()).addCriterion("has_jade_paving",
            this.hasItem(ECBlockRegistry.JADE_PAVING.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.JADE_PAVING.get()).patternLine("i").patternLine("i").key('i', ECBlockRegistry.JADE_PAVING_SLAB.get()).addCriterion("has_jade_paving_slab",
            this.hasItem(ECBlockRegistry.JADE_PAVING_SLAB.get())).build(consumer, ECConstants.MODID + ":jade_paving_from_slabs");
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.JADE_PAVING_STAIRS.get(), 4).key('#', ECBlockRegistry.JADE_PAVING.get()).patternLine("#  ").patternLine("## ").patternLine("###").addCriterion(
            "has_jade_paving", this.hasItem(ECBlockRegistry.JADE_PAVING.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.JADE_PAVING_WALL.get(), 6).key('#', ECBlockRegistry.JADE_PAVING.get()).patternLine("###").patternLine("###").addCriterion("has_jade_paving",
            this.hasItem(ECBlockRegistry.JADE_PAVING.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.JADE_PAVING_PRESSURE_PLATE.get()).key('#', ECBlockRegistry.JADE_PAVING.get()).patternLine("##").addCriterion("has_jade_paving",
            this.hasItem(ECBlockRegistry.JADE_PAVING.get())).build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.JADE_TILES.get(), 4).patternLine("ii").patternLine("ii").key('i', ECBlockRegistry.JADE_PAVING.get()).addCriterion("has_jade_paving",
            this.hasItem(ECBlockRegistry.JADE_PAVING.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.JADE_TILES_SLAB.get(), 6).patternLine("iii").key('i', ECBlockRegistry.JADE_TILES.get()).addCriterion("has_jade_tiles",
            this.hasItem(ECBlockRegistry.JADE_TILES.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.JADE_TILES.get()).patternLine("i").patternLine("i").key('i', ECBlockRegistry.JADE_TILES_SLAB.get()).addCriterion("has_jade_tiles_slab",
            this.hasItem(ECBlockRegistry.JADE_TILES_SLAB.get())).build(consumer, ECConstants.MODID + ":jade_tiles_from_slabs");
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.JADE_TILES_STAIRS.get(), 4).key('#', ECBlockRegistry.JADE_TILES.get()).patternLine("#  ").patternLine("## ").patternLine("###").addCriterion(
            "has_jade_tiles", this.hasItem(ECBlockRegistry.JADE_TILES.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.JADE_TILES_WALL.get(), 6).key('#', ECBlockRegistry.JADE_TILES.get()).patternLine("###").patternLine("###").addCriterion("has_jade_tiles",
            this.hasItem(ECBlockRegistry.JADE_TILES.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.JADE_TILES_PRESSURE_PLATE.get()).key('#', ECBlockRegistry.JADE_TILES.get()).patternLine("##").addCriterion("has_jade_tiles",
            this.hasItem(ECBlockRegistry.JADE_TILES.get())).build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.JADE_BRICKS.get(), 4).patternLine("ii").patternLine("ii").key('i', ECBlockRegistry.JADE.get()).addCriterion("has_jade",
            this.hasItem(ECBlockRegistry.JADE.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.JADE_BRICKS_SLAB.get(), 6).patternLine("iii").key('i', ECBlockRegistry.JADE_BRICKS.get()).addCriterion("has_jade_bricks",
            this.hasItem(ECBlockRegistry.JADE_BRICKS.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.JADE_BRICKS.get()).patternLine("i").patternLine("i").key('i', ECBlockRegistry.JADE_BRICKS_SLAB.get()).addCriterion("has_jade_bricks_slab",
            this.hasItem(ECBlockRegistry.JADE_BRICKS_SLAB.get())).build(consumer, ECConstants.MODID + ":jade_bricks_from_slabs");
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.JADE_BRICKS_STAIRS.get(), 4).key('#', ECBlockRegistry.JADE_BRICKS.get()).patternLine("#  ").patternLine("## ").patternLine("###").addCriterion(
            "has_jade_bricks", this.hasItem(ECBlockRegistry.JADE_BRICKS.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.JADE_BRICKS_WALL.get(), 6).key('#', ECBlockRegistry.JADE_BRICKS.get()).patternLine("###").patternLine("###").addCriterion("has_jade_bricks",
            this.hasItem(ECBlockRegistry.JADE_BRICKS.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.JADE_BRICKS_PRESSURE_PLATE.get()).key('#', ECBlockRegistry.JADE_BRICKS.get()).patternLine("##").addCriterion("has_jade_bricks",
            this.hasItem(ECBlockRegistry.JADE_BRICKS.get())).build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.JADE_LARGE_BRICKS.get(), 4).patternLine("ii").patternLine("ii").key('i', ECBlockRegistry.JADE_BRICKS.get()).addCriterion("has_jade_bricks",
            this.hasItem(ECBlockRegistry.JADE_BRICKS.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.JADE_LARGE_BRICKS_SLAB.get(), 6).patternLine("iii").key('i', ECBlockRegistry.JADE_LARGE_BRICKS.get()).addCriterion("has_jade_large_bricks",
            this.hasItem(ECBlockRegistry.JADE_LARGE_BRICKS.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.JADE_LARGE_BRICKS.get()).patternLine("i").patternLine("i").key('i', ECBlockRegistry.JADE_LARGE_BRICKS_SLAB.get()).addCriterion(
            "has_jade_large_bricks_slab", this.hasItem(ECBlockRegistry.JADE_LARGE_BRICKS_SLAB.get())).build(consumer, ECConstants.MODID + ":jade_large_bricks_from_slabs");
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.JADE_LARGE_BRICKS_STAIRS.get(), 4).key('#', ECBlockRegistry.JADE_LARGE_BRICKS.get()).patternLine("#  ").patternLine("## ").patternLine(
            "###").addCriterion("has_jade_large_bricks", this.hasItem(ECBlockRegistry.JADE_LARGE_BRICKS.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.JADE_LARGE_BRICKS_WALL.get(), 6).key('#', ECBlockRegistry.JADE_LARGE_BRICKS.get()).patternLine("###").patternLine("###").addCriterion(
            "has_jade_large_bricks", this.hasItem(ECBlockRegistry.JADE_LARGE_BRICKS.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.JADE_LARGE_BRICKS_PRESSURE_PLATE.get()).key('#', ECBlockRegistry.JADE_LARGE_BRICKS.get()).patternLine("##").addCriterion("has_jade_large_bricks",
            this.hasItem(ECBlockRegistry.JADE_LARGE_BRICKS.get())).build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.JADE_ORNAMENT.get()).patternLine("i").patternLine("i").key('i', ECBlockRegistry.SMOOTH_JADE_SLAB.get()).addCriterion("has_smooth_jade_slab",
            this.hasItem(ECBlockRegistry.SMOOTH_JADE_SLAB.get())).build(consumer, ECConstants.MODID + ":jade_ornament_from_smooth_slabs");
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.JADE_ORNAMENT.get()).patternLine("i").patternLine("i").key('i', ECBlockRegistry.POLISHED_JADE_SLAB.get()).addCriterion("has_polished_jade_slab",
            this.hasItem(ECBlockRegistry.POLISHED_JADE_SLAB.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.JADE_ORNAMENT_PRESSURE_PLATE.get()).key('#', ECBlockRegistry.JADE_ORNAMENT.get()).patternLine("##").addCriterion("has_jade_ornament",
            this.hasItem(ECBlockRegistry.JADE_ORNAMENT.get())).build(consumer);

        // Larvikite
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(ECItemRegistry.LARVIKITE_COBBLESTONE_ITEM.get()), ECItemRegistry.LARVIKITE_ITEM.get(), 0.1f, 200).addCriterion("has_larvikite_cobblestone",
            this.hasItem(ECBlockRegistry.LARVIKITE_COBBLESTONE.get())).build(consumer, ECConstants.MODID + ":larvikite_from_cobblestone_smelting");

        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.LARVIKITE_SLAB.get(), 6).patternLine("iii").key('i', ECBlockRegistry.LARVIKITE.get()).addCriterion("has_larvikite",
            this.hasItem(ECBlockRegistry.LARVIKITE.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.LARVIKITE.get()).patternLine("i").patternLine("i").key('i', ECBlockRegistry.LARVIKITE_SLAB.get()).addCriterion("has_larvikite_slab",
            this.hasItem(ECBlockRegistry.LARVIKITE_SLAB.get())).build(consumer, ECConstants.MODID + ":larvikite_from_slabs");
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.LARVIKITE_STAIRS.get(), 4).key('#', ECBlockRegistry.LARVIKITE.get()).patternLine("#  ").patternLine("## ").patternLine("###").addCriterion(
            "has_larvikite", this.hasItem(ECBlockRegistry.LARVIKITE.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.LARVIKITE_WALL.get(), 6).key('#', ECBlockRegistry.LARVIKITE.get()).patternLine("###").patternLine("###").addCriterion("has_larvikite",
            this.hasItem(ECBlockRegistry.LARVIKITE.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.LARVIKITE_PRESSURE_PLATE.get()).key('#', ECBlockRegistry.LARVIKITE.get()).patternLine("##").addCriterion("has_larvikite",
            this.hasItem(ECBlockRegistry.LARVIKITE.get())).build(consumer);
        ShapelessRecipeBuilder.shapelessRecipe(ECBlockRegistry.LARVIKITE_BUTTON.get()).addIngredient(ECBlockRegistry.LARVIKITE.get()).addCriterion("has_larvikite",
            this.hasItem(ECBlockRegistry.LARVIKITE.get())).build(consumer);

        ShapelessRecipeBuilder.shapelessRecipe(ECBlockRegistry.POLISHED_LARVIKITE.get()).addIngredient(ECBlockRegistry.SMOOTH_LARVIKITE.get()).addCriterion("has_smooth_larvikite",
            this.hasItem(ECBlockRegistry.SMOOTH_LARVIKITE.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.POLISHED_LARVIKITE_SLAB.get(), 6).patternLine("iii").key('i', ECBlockRegistry.POLISHED_LARVIKITE.get()).addCriterion("has_polished_larvikite",
            this.hasItem(ECBlockRegistry.POLISHED_LARVIKITE.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.POLISHED_LARVIKITE.get()).patternLine("i").patternLine("i").key('i', ECBlockRegistry.POLISHED_LARVIKITE_SLAB.get()).addCriterion(
            "has_polished_larvikite_slab", this.hasItem(ECBlockRegistry.POLISHED_LARVIKITE_SLAB.get())).build(consumer, ECConstants.MODID + ":polished_larvikite_from_slabs");
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.POLISHED_LARVIKITE_STAIRS.get(), 4).key('#', ECBlockRegistry.POLISHED_LARVIKITE.get()).patternLine("#  ").patternLine("## ").patternLine(
            "###").addCriterion("has_polished_larvikite", this.hasItem(ECBlockRegistry.POLISHED_LARVIKITE.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.POLISHED_LARVIKITE_WALL.get(), 6).key('#', ECBlockRegistry.POLISHED_LARVIKITE.get()).patternLine("###").patternLine("###").addCriterion(
            "has_polished_larvikite", this.hasItem(ECBlockRegistry.POLISHED_LARVIKITE.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.POLISHED_LARVIKITE_PRESSURE_PLATE.get()).key('#', ECBlockRegistry.POLISHED_LARVIKITE.get()).patternLine("##").addCriterion("has_polished_larvikite",
            this.hasItem(ECBlockRegistry.POLISHED_LARVIKITE.get())).build(consumer);

        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(ECItemRegistry.LARVIKITE_ITEM.get()), ECItemRegistry.SMOOTH_LARVIKITE_ITEM.get(), 0.1f, 200).addCriterion("has_larvikite",
            this.hasItem(ECBlockRegistry.LARVIKITE.get())).build(consumer, ECConstants.MODID + ":smooth_larvikite_from_smelting");

        ShapelessRecipeBuilder.shapelessRecipe(ECBlockRegistry.SMOOTH_LARVIKITE.get()).addIngredient(ECBlockRegistry.POLISHED_LARVIKITE.get()).addCriterion("has_polished_larvikite",
            this.hasItem(ECBlockRegistry.POLISHED_LARVIKITE.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.SMOOTH_LARVIKITE_SLAB.get(), 6).patternLine("iii").key('i', ECBlockRegistry.SMOOTH_LARVIKITE.get()).addCriterion("has_smooth_larvikite",
            this.hasItem(ECBlockRegistry.SMOOTH_LARVIKITE.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.SMOOTH_LARVIKITE.get()).patternLine("i").patternLine("i").key('i', ECBlockRegistry.SMOOTH_LARVIKITE_SLAB.get()).addCriterion("has_smooth_larvikite_slab",
            this.hasItem(ECBlockRegistry.SMOOTH_LARVIKITE_SLAB.get())).build(consumer, ECConstants.MODID + ":smooth_larvikite_from_slabs");
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.SMOOTH_LARVIKITE_STAIRS.get(), 4).key('#', ECBlockRegistry.SMOOTH_LARVIKITE.get()).patternLine("#  ").patternLine("## ").patternLine("###").addCriterion(
            "has_smooth_larvikite", this.hasItem(ECBlockRegistry.SMOOTH_LARVIKITE.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.SMOOTH_LARVIKITE_WALL.get(), 6).key('#', ECBlockRegistry.SMOOTH_LARVIKITE.get()).patternLine("###").patternLine("###").addCriterion(
            "has_smooth_larvikite", this.hasItem(ECBlockRegistry.SMOOTH_LARVIKITE.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.SMOOTH_LARVIKITE_PRESSURE_PLATE.get()).key('#', ECBlockRegistry.SMOOTH_LARVIKITE.get()).patternLine("##").addCriterion("has_smooth_larvikite",
            this.hasItem(ECBlockRegistry.SMOOTH_LARVIKITE.get())).build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.LARVIKITE_COBBLESTONE_SLAB.get(), 6).patternLine("iii").key('i', ECBlockRegistry.LARVIKITE_COBBLESTONE.get()).addCriterion("has_larvikite_cobblestone",
            this.hasItem(ECBlockRegistry.LARVIKITE_COBBLESTONE.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.LARVIKITE_COBBLESTONE.get()).patternLine("i").patternLine("i").key('i', ECBlockRegistry.LARVIKITE_COBBLESTONE_SLAB.get()).addCriterion(
            "has_larvikite_cobblestone_slab", this.hasItem(ECBlockRegistry.LARVIKITE_COBBLESTONE_SLAB.get())).build(consumer, ECConstants.MODID + ":larvikite_cobblestone_from_slabs");
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.LARVIKITE_COBBLESTONE_STAIRS.get(), 4).key('#', ECBlockRegistry.LARVIKITE_COBBLESTONE.get()).patternLine("#  ").patternLine("## ").patternLine(
            "###").addCriterion("has_larvikite_cobblestone", this.hasItem(ECBlockRegistry.LARVIKITE_COBBLESTONE.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.LARVIKITE_COBBLESTONE_WALL.get(), 6).key('#', ECBlockRegistry.LARVIKITE_COBBLESTONE.get()).patternLine("###").patternLine("###").addCriterion(
            "has_larvikite_cobblestone", this.hasItem(ECBlockRegistry.LARVIKITE_COBBLESTONE.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.LARVIKITE_COBBLESTONE_PRESSURE_PLATE.get()).key('#', ECBlockRegistry.LARVIKITE_COBBLESTONE.get()).patternLine("##").addCriterion(
            "has_larvikite_cobblestone", this.hasItem(ECBlockRegistry.LARVIKITE_COBBLESTONE.get())).build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.LARVIKITE_PAVING.get(), 4).patternLine("ii").patternLine("ii").key('i', ECBlockRegistry.POLISHED_LARVIKITE.get()).addCriterion("has_polished_larvikite",
            this.hasItem(ECBlockRegistry.POLISHED_LARVIKITE.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.LARVIKITE_PAVING_SLAB.get(), 6).patternLine("iii").key('i', ECBlockRegistry.LARVIKITE_PAVING.get()).addCriterion("has_larvikite_paving",
            this.hasItem(ECBlockRegistry.LARVIKITE_PAVING.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.LARVIKITE_PAVING.get()).patternLine("i").patternLine("i").key('i', ECBlockRegistry.LARVIKITE_PAVING_SLAB.get()).addCriterion("has_larvikite_paving_slab",
            this.hasItem(ECBlockRegistry.LARVIKITE_PAVING_SLAB.get())).build(consumer, ECConstants.MODID + ":larvikite_paving_from_slabs");
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.LARVIKITE_PAVING_STAIRS.get(), 4).key('#', ECBlockRegistry.LARVIKITE_PAVING.get()).patternLine("#  ").patternLine("## ").patternLine("###").addCriterion(
            "has_larvikite_paving", this.hasItem(ECBlockRegistry.LARVIKITE_PAVING.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.LARVIKITE_PAVING_WALL.get(), 6).key('#', ECBlockRegistry.LARVIKITE_PAVING.get()).patternLine("###").patternLine("###").addCriterion(
            "has_larvikite_paving", this.hasItem(ECBlockRegistry.LARVIKITE_PAVING.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.LARVIKITE_PAVING_PRESSURE_PLATE.get()).key('#', ECBlockRegistry.LARVIKITE_PAVING.get()).patternLine("##").addCriterion("has_larvikite_paving",
            this.hasItem(ECBlockRegistry.LARVIKITE_PAVING.get())).build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.LARVIKITE_TILES.get(), 4).patternLine("ii").patternLine("ii").key('i', ECBlockRegistry.LARVIKITE_PAVING.get()).addCriterion("has_larvikite_paving",
            this.hasItem(ECBlockRegistry.LARVIKITE_PAVING.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.LARVIKITE_TILES_SLAB.get(), 6).patternLine("iii").key('i', ECBlockRegistry.LARVIKITE_TILES.get()).addCriterion("has_larvikite_tiles",
            this.hasItem(ECBlockRegistry.LARVIKITE_TILES.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.LARVIKITE_TILES.get()).patternLine("i").patternLine("i").key('i', ECBlockRegistry.LARVIKITE_TILES_SLAB.get()).addCriterion("has_larvikite_tiles_slab",
            this.hasItem(ECBlockRegistry.LARVIKITE_TILES_SLAB.get())).build(consumer, ECConstants.MODID + ":larvikite_tiles_from_slabs");
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.LARVIKITE_TILES_STAIRS.get(), 4).key('#', ECBlockRegistry.LARVIKITE_TILES.get()).patternLine("#  ").patternLine("## ").patternLine("###").addCriterion(
            "has_larvikite_tiles", this.hasItem(ECBlockRegistry.LARVIKITE_TILES.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.LARVIKITE_TILES_WALL.get(), 6).key('#', ECBlockRegistry.LARVIKITE_TILES.get()).patternLine("###").patternLine("###").addCriterion("has_larvikite_tiles",
            this.hasItem(ECBlockRegistry.LARVIKITE_TILES.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.LARVIKITE_TILES_PRESSURE_PLATE.get()).key('#', ECBlockRegistry.LARVIKITE_TILES.get()).patternLine("##").addCriterion("has_larvikite_tiles",
            this.hasItem(ECBlockRegistry.LARVIKITE_TILES.get())).build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.LARVIKITE_BRICKS.get(), 4).patternLine("ii").patternLine("ii").key('i', ECBlockRegistry.LARVIKITE.get()).addCriterion("has_larvikite",
            this.hasItem(ECBlockRegistry.LARVIKITE.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.LARVIKITE_BRICKS_SLAB.get(), 6).patternLine("iii").key('i', ECBlockRegistry.LARVIKITE_BRICKS.get()).addCriterion("has_larvikite_bricks",
            this.hasItem(ECBlockRegistry.LARVIKITE_BRICKS.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.LARVIKITE_BRICKS.get()).patternLine("i").patternLine("i").key('i', ECBlockRegistry.LARVIKITE_BRICKS_SLAB.get()).addCriterion("has_larvikite_bricks_slab",
            this.hasItem(ECBlockRegistry.LARVIKITE_BRICKS_SLAB.get())).build(consumer, ECConstants.MODID + ":larvikite_bricks_from_slabs");
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.LARVIKITE_BRICKS_STAIRS.get(), 4).key('#', ECBlockRegistry.LARVIKITE_BRICKS.get()).patternLine("#  ").patternLine("## ").patternLine("###").addCriterion(
            "has_larvikite_bricks", this.hasItem(ECBlockRegistry.LARVIKITE_BRICKS.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.LARVIKITE_BRICKS_WALL.get(), 6).key('#', ECBlockRegistry.LARVIKITE_BRICKS.get()).patternLine("###").patternLine("###").addCriterion(
            "has_larvikite_bricks", this.hasItem(ECBlockRegistry.LARVIKITE_BRICKS.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.LARVIKITE_BRICKS_PRESSURE_PLATE.get()).key('#', ECBlockRegistry.LARVIKITE_BRICKS.get()).patternLine("##").addCriterion("has_larvikite_bricks",
            this.hasItem(ECBlockRegistry.LARVIKITE_BRICKS.get())).build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.LARVIKITE_LARGE_BRICKS.get(), 4).patternLine("ii").patternLine("ii").key('i', ECBlockRegistry.LARVIKITE_BRICKS.get()).addCriterion(
            "has_larvikite_bricks", this.hasItem(ECBlockRegistry.LARVIKITE_BRICKS.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.LARVIKITE_LARGE_BRICKS_SLAB.get(), 6).patternLine("iii").key('i', ECBlockRegistry.LARVIKITE_LARGE_BRICKS.get()).addCriterion(
            "has_larvikite_large_bricks", this.hasItem(ECBlockRegistry.LARVIKITE_LARGE_BRICKS.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.LARVIKITE_LARGE_BRICKS.get()).patternLine("i").patternLine("i").key('i', ECBlockRegistry.LARVIKITE_LARGE_BRICKS_SLAB.get()).addCriterion(
            "has_larvikite_large_bricks_slab", this.hasItem(ECBlockRegistry.LARVIKITE_LARGE_BRICKS_SLAB.get())).build(consumer, ECConstants.MODID + ":larvikite_large_bricks_from_slabs");
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.LARVIKITE_LARGE_BRICKS_STAIRS.get(), 4).key('#', ECBlockRegistry.LARVIKITE_LARGE_BRICKS.get()).patternLine("#  ").patternLine("## ").patternLine(
            "###").addCriterion("has_larvikite_large_bricks", this.hasItem(ECBlockRegistry.LARVIKITE_LARGE_BRICKS.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.LARVIKITE_LARGE_BRICKS_WALL.get(), 6).key('#', ECBlockRegistry.LARVIKITE_LARGE_BRICKS.get()).patternLine("###").patternLine("###").addCriterion(
            "has_larvikite_large_bricks", this.hasItem(ECBlockRegistry.LARVIKITE_LARGE_BRICKS.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.LARVIKITE_LARGE_BRICKS_PRESSURE_PLATE.get()).key('#', ECBlockRegistry.LARVIKITE_LARGE_BRICKS.get()).patternLine("##").addCriterion(
            "has_larvikite_large_bricks", this.hasItem(ECBlockRegistry.LARVIKITE_LARGE_BRICKS.get())).build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.LARVIKITE_ORNAMENT.get()).patternLine("i").patternLine("i").key('i', ECBlockRegistry.SMOOTH_LARVIKITE_SLAB.get()).addCriterion(
            "has_smooth_larvikite_slab", this.hasItem(ECBlockRegistry.SMOOTH_LARVIKITE_SLAB.get())).build(consumer, ECConstants.MODID + ":larvikite_ornament_from_smooth_slabs");
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.LARVIKITE_ORNAMENT.get()).patternLine("i").patternLine("i").key('i', ECBlockRegistry.POLISHED_LARVIKITE_SLAB.get()).addCriterion(
            "has_polished_larvikite_slab", this.hasItem(ECBlockRegistry.POLISHED_LARVIKITE_SLAB.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.LARVIKITE_ORNAMENT_PRESSURE_PLATE.get()).key('#', ECBlockRegistry.LARVIKITE_ORNAMENT.get()).patternLine("##").addCriterion("has_larvikite_ornament",
            this.hasItem(ECBlockRegistry.LARVIKITE_ORNAMENT.get())).build(consumer);

        // Andesite
        ShapelessRecipeBuilder.shapelessRecipe(ECBlockRegistry.ANDESITE_BUTTON.get()).addIngredient(Blocks.ANDESITE).addCriterion("has_andesite", this.hasItem(Blocks.ANDESITE)).build(consumer);

        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(Items.ANDESITE), ECItemRegistry.SMOOTH_ANDESITE_ITEM.get(), 0.1f, 200).addCriterion("has_andesite", this.hasItem(Items.ANDESITE)).build(consumer,
            ECConstants.MODID + ":smooth_andesite_from_smelting");

        ShapelessRecipeBuilder.shapelessRecipe(ECBlockRegistry.SMOOTH_ANDESITE.get()).addIngredient(Blocks.POLISHED_ANDESITE).addCriterion("has_polished_andesite", this.hasItem(Blocks.POLISHED_ANDESITE)).build(
            consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.SMOOTH_ANDESITE_SLAB.get(), 6).patternLine("iii").key('i', ECBlockRegistry.SMOOTH_ANDESITE.get()).addCriterion("has_smooth_andesite",
            this.hasItem(ECBlockRegistry.SMOOTH_ANDESITE.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.SMOOTH_ANDESITE.get()).patternLine("i").patternLine("i").key('i', ECBlockRegistry.SMOOTH_ANDESITE_SLAB.get()).addCriterion("has_smooth_andesite_slab",
            this.hasItem(ECBlockRegistry.SMOOTH_ANDESITE_SLAB.get())).build(consumer, ECConstants.MODID + ":smooth_andesite_from_slabs");
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.SMOOTH_ANDESITE_STAIRS.get(), 4).key('#', ECBlockRegistry.SMOOTH_ANDESITE.get()).patternLine("#  ").patternLine("## ").patternLine("###").addCriterion(
            "has_smooth_andesite", this.hasItem(ECBlockRegistry.SMOOTH_ANDESITE.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.SMOOTH_ANDESITE_WALL.get(), 6).key('#', ECBlockRegistry.SMOOTH_ANDESITE.get()).patternLine("###").patternLine("###").addCriterion("has_smooth_andesite",
            this.hasItem(ECBlockRegistry.SMOOTH_ANDESITE.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.SMOOTH_ANDESITE_PRESSURE_PLATE.get()).key('#', ECBlockRegistry.SMOOTH_ANDESITE.get()).patternLine("##").addCriterion("has_smooth_andesite",
            this.hasItem(ECBlockRegistry.SMOOTH_ANDESITE.get())).build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.ANDESITE_PAVING.get(), 4).patternLine("ii").patternLine("ii").key('i', Blocks.POLISHED_ANDESITE).addCriterion("has_polished_andesite",
            this.hasItem(Blocks.POLISHED_ANDESITE)).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.ANDESITE_PAVING_SLAB.get(), 6).patternLine("iii").key('i', ECBlockRegistry.ANDESITE_PAVING.get()).addCriterion("has_andesite_paving",
            this.hasItem(ECBlockRegistry.ANDESITE_PAVING.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.ANDESITE_PAVING.get()).patternLine("i").patternLine("i").key('i', ECBlockRegistry.ANDESITE_PAVING_SLAB.get()).addCriterion("has_andesite_paving_slab",
            this.hasItem(ECBlockRegistry.ANDESITE_PAVING_SLAB.get())).build(consumer, ECConstants.MODID + ":andesite_paving_from_slabs");
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.ANDESITE_PAVING_STAIRS.get(), 4).key('#', ECBlockRegistry.ANDESITE_PAVING.get()).patternLine("#  ").patternLine("## ").patternLine("###").addCriterion(
            "has_andesite_paving", this.hasItem(ECBlockRegistry.ANDESITE_PAVING.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.ANDESITE_PAVING_WALL.get(), 6).key('#', ECBlockRegistry.ANDESITE_PAVING.get()).patternLine("###").patternLine("###").addCriterion("has_andesite_paving",
            this.hasItem(ECBlockRegistry.ANDESITE_PAVING.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.ANDESITE_PAVING_PRESSURE_PLATE.get()).key('#', ECBlockRegistry.ANDESITE_PAVING.get()).patternLine("##").addCriterion("has_andesite_paving",
            this.hasItem(ECBlockRegistry.ANDESITE_PAVING.get())).build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.ANDESITE_TILES.get(), 4).patternLine("ii").patternLine("ii").key('i', ECBlockRegistry.ANDESITE_PAVING.get()).addCriterion("has_andesite_paving",
            this.hasItem(ECBlockRegistry.ANDESITE_PAVING.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.ANDESITE_TILES_SLAB.get(), 6).patternLine("iii").key('i', ECBlockRegistry.ANDESITE_TILES.get()).addCriterion("has_andesite_tiles",
            this.hasItem(ECBlockRegistry.ANDESITE_TILES.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.ANDESITE_TILES.get()).patternLine("i").patternLine("i").key('i', ECBlockRegistry.ANDESITE_TILES_SLAB.get()).addCriterion("has_andesite_tiles_slab",
            this.hasItem(ECBlockRegistry.ANDESITE_TILES_SLAB.get())).build(consumer, ECConstants.MODID + ":andesite_tiles_from_slabs");
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.ANDESITE_TILES_STAIRS.get(), 4).key('#', ECBlockRegistry.ANDESITE_TILES.get()).patternLine("#  ").patternLine("## ").patternLine("###").addCriterion(
            "has_andesite_tiles", this.hasItem(ECBlockRegistry.ANDESITE_TILES.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.ANDESITE_TILES_WALL.get(), 6).key('#', ECBlockRegistry.ANDESITE_TILES.get()).patternLine("###").patternLine("###").addCriterion("has_andesite_tiles",
            this.hasItem(ECBlockRegistry.ANDESITE_TILES.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.ANDESITE_TILES_PRESSURE_PLATE.get()).key('#', ECBlockRegistry.ANDESITE_TILES.get()).patternLine("##").addCriterion("has_andesite_tiles",
            this.hasItem(ECBlockRegistry.ANDESITE_TILES.get())).build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.ANDESITE_BRICKS.get(), 4).patternLine("ii").patternLine("ii").key('i', ECBlockRegistry.SMOOTH_ANDESITE.get()).addCriterion("has_smooth_andesite",
            this.hasItem(ECBlockRegistry.SMOOTH_ANDESITE.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.ANDESITE_BRICKS_SLAB.get(), 6).patternLine("iii").key('i', ECBlockRegistry.ANDESITE_BRICKS.get()).addCriterion("has_andesite_bricks",
            this.hasItem(ECBlockRegistry.ANDESITE_BRICKS.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.ANDESITE_BRICKS.get()).patternLine("i").patternLine("i").key('i', ECBlockRegistry.ANDESITE_BRICKS_SLAB.get()).addCriterion("has_andesite_bricks_slab",
            this.hasItem(ECBlockRegistry.ANDESITE_BRICKS_SLAB.get())).build(consumer, ECConstants.MODID + ":andesite_bricks_from_slabs");
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.ANDESITE_BRICKS_STAIRS.get(), 4).key('#', ECBlockRegistry.ANDESITE_BRICKS.get()).patternLine("#  ").patternLine("## ").patternLine("###").addCriterion(
            "has_andesite_bricks", this.hasItem(ECBlockRegistry.ANDESITE_BRICKS.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.ANDESITE_BRICKS_WALL.get(), 6).key('#', ECBlockRegistry.ANDESITE_BRICKS.get()).patternLine("###").patternLine("###").addCriterion("has_andesite_bricks",
            this.hasItem(ECBlockRegistry.ANDESITE_BRICKS.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.ANDESITE_BRICKS_PRESSURE_PLATE.get()).key('#', ECBlockRegistry.ANDESITE_BRICKS.get()).patternLine("##").addCriterion("has_andesite_bricks",
            this.hasItem(ECBlockRegistry.ANDESITE_BRICKS.get())).build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.ANDESITE_LARGE_BRICKS.get(), 4).patternLine("ii").patternLine("ii").key('i', ECBlockRegistry.ANDESITE_BRICKS.get()).addCriterion("has_andesite_bricks",
            this.hasItem(ECBlockRegistry.ANDESITE_BRICKS.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.ANDESITE_LARGE_BRICKS_SLAB.get(), 6).patternLine("iii").key('i', ECBlockRegistry.ANDESITE_LARGE_BRICKS.get()).addCriterion("has_andesite_large_bricks",
            this.hasItem(ECBlockRegistry.ANDESITE_LARGE_BRICKS.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.ANDESITE_LARGE_BRICKS.get()).patternLine("i").patternLine("i").key('i', ECBlockRegistry.ANDESITE_LARGE_BRICKS_SLAB.get()).addCriterion(
            "has_andesite_large_bricks_slab", this.hasItem(ECBlockRegistry.ANDESITE_LARGE_BRICKS_SLAB.get())).build(consumer, ECConstants.MODID + ":andesite_large_bricks_from_slabs");
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.ANDESITE_LARGE_BRICKS_STAIRS.get(), 4).key('#', ECBlockRegistry.ANDESITE_LARGE_BRICKS.get()).patternLine("#  ").patternLine("## ").patternLine(
            "###").addCriterion("has_andesite_large_bricks", this.hasItem(ECBlockRegistry.ANDESITE_LARGE_BRICKS.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.ANDESITE_LARGE_BRICKS_WALL.get(), 6).key('#', ECBlockRegistry.ANDESITE_LARGE_BRICKS.get()).patternLine("###").patternLine("###").addCriterion(
            "has_andesite_large_bricks", this.hasItem(ECBlockRegistry.ANDESITE_LARGE_BRICKS.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.ANDESITE_LARGE_BRICKS_PRESSURE_PLATE.get()).key('#', ECBlockRegistry.ANDESITE_LARGE_BRICKS.get()).patternLine("##").addCriterion(
            "has_andesite_large_bricks", this.hasItem(ECBlockRegistry.ANDESITE_LARGE_BRICKS.get())).build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.ANDESITE_ORNAMENT.get()).patternLine("i").patternLine("i").key('i', ECBlockRegistry.SMOOTH_ANDESITE_SLAB.get()).addCriterion("has_smooth_andesite_slab",
            this.hasItem(ECBlockRegistry.SMOOTH_ANDESITE_SLAB.get())).build(consumer, ECConstants.MODID + ":andesite_ornament_from_smooth_slabs");
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.ANDESITE_ORNAMENT.get()).patternLine("i").patternLine("i").key('i', Blocks.POLISHED_ANDESITE_SLAB).addCriterion("has_polished_andesite_slab",
            this.hasItem(Blocks.POLISHED_ANDESITE_SLAB)).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.ANDESITE_ORNAMENT_PRESSURE_PLATE.get()).key('#', ECBlockRegistry.ANDESITE_ORNAMENT.get()).patternLine("##").addCriterion("has_andesite_ornament",
            this.hasItem(ECBlockRegistry.ANDESITE_ORNAMENT.get())).build(consumer);

        // Diorite
        ShapelessRecipeBuilder.shapelessRecipe(ECBlockRegistry.DIORITE_BUTTON.get()).addIngredient(Blocks.DIORITE).addCriterion("has_diorite", this.hasItem(Blocks.DIORITE)).build(consumer);

        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(Items.DIORITE), ECItemRegistry.SMOOTH_DIORITE_ITEM.get(), 0.1f, 200).addCriterion("has_diorite", this.hasItem(Items.DIORITE)).build(consumer,
            ECConstants.MODID + ":smooth_diorite_from_smelting");

        ShapelessRecipeBuilder.shapelessRecipe(ECBlockRegistry.SMOOTH_DIORITE.get()).addIngredient(Blocks.POLISHED_DIORITE).addCriterion("has_polished_diorite", this.hasItem(Blocks.POLISHED_DIORITE)).build(
            consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.SMOOTH_DIORITE_SLAB.get(), 6).patternLine("iii").key('i', ECBlockRegistry.SMOOTH_DIORITE.get()).addCriterion("has_smooth_diorite",
            this.hasItem(ECBlockRegistry.SMOOTH_DIORITE.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.SMOOTH_DIORITE.get()).patternLine("i").patternLine("i").key('i', ECBlockRegistry.SMOOTH_DIORITE_SLAB.get()).addCriterion("has_smooth_diorite_slab",
            this.hasItem(ECBlockRegistry.SMOOTH_DIORITE_SLAB.get())).build(consumer, ECConstants.MODID + ":smooth_diorite_from_slabs");
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.SMOOTH_DIORITE_STAIRS.get(), 4).key('#', ECBlockRegistry.SMOOTH_DIORITE.get()).patternLine("#  ").patternLine("## ").patternLine("###").addCriterion(
            "has_smooth_diorite", this.hasItem(ECBlockRegistry.SMOOTH_DIORITE.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.SMOOTH_DIORITE_WALL.get(), 6).key('#', ECBlockRegistry.SMOOTH_DIORITE.get()).patternLine("###").patternLine("###").addCriterion("has_smooth_diorite",
            this.hasItem(ECBlockRegistry.SMOOTH_DIORITE.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.SMOOTH_DIORITE_PRESSURE_PLATE.get()).key('#', ECBlockRegistry.SMOOTH_DIORITE.get()).patternLine("##").addCriterion("has_smooth_diorite",
            this.hasItem(ECBlockRegistry.SMOOTH_DIORITE.get())).build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.DIORITE_PAVING.get(), 4).patternLine("ii").patternLine("ii").key('i', Blocks.POLISHED_DIORITE).addCriterion("has_polished_diorite",
            this.hasItem(Blocks.POLISHED_DIORITE)).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.DIORITE_PAVING_SLAB.get(), 6).patternLine("iii").key('i', ECBlockRegistry.DIORITE_PAVING.get()).addCriterion("has_diorite_paving",
            this.hasItem(ECBlockRegistry.DIORITE_PAVING.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.DIORITE_PAVING.get()).patternLine("i").patternLine("i").key('i', ECBlockRegistry.DIORITE_PAVING_SLAB.get()).addCriterion("has_diorite_paving_slab",
            this.hasItem(ECBlockRegistry.DIORITE_PAVING_SLAB.get())).build(consumer, ECConstants.MODID + ":diorite_paving_from_slabs");
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.DIORITE_PAVING_STAIRS.get(), 4).key('#', ECBlockRegistry.DIORITE_PAVING.get()).patternLine("#  ").patternLine("## ").patternLine("###").addCriterion(
            "has_diorite_paving", this.hasItem(ECBlockRegistry.DIORITE_PAVING.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.DIORITE_PAVING_WALL.get(), 6).key('#', ECBlockRegistry.DIORITE_PAVING.get()).patternLine("###").patternLine("###").addCriterion("has_diorite_paving",
            this.hasItem(ECBlockRegistry.DIORITE_PAVING.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.DIORITE_PAVING_PRESSURE_PLATE.get()).key('#', ECBlockRegistry.DIORITE_PAVING.get()).patternLine("##").addCriterion("has_diorite_paving",
            this.hasItem(ECBlockRegistry.DIORITE_PAVING.get())).build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.DIORITE_TILES.get(), 4).patternLine("ii").patternLine("ii").key('i', ECBlockRegistry.DIORITE_PAVING.get()).addCriterion("has_diorite_paving",
            this.hasItem(ECBlockRegistry.DIORITE_PAVING.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.DIORITE_TILES_SLAB.get(), 6).patternLine("iii").key('i', ECBlockRegistry.DIORITE_TILES.get()).addCriterion("has_diorite_tiles",
            this.hasItem(ECBlockRegistry.DIORITE_TILES.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.DIORITE_TILES.get()).patternLine("i").patternLine("i").key('i', ECBlockRegistry.DIORITE_TILES_SLAB.get()).addCriterion("has_diorite_tiles_slab",
            this.hasItem(ECBlockRegistry.DIORITE_TILES_SLAB.get())).build(consumer, ECConstants.MODID + ":diorite_tiles_from_slabs");
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.DIORITE_TILES_STAIRS.get(), 4).key('#', ECBlockRegistry.DIORITE_TILES.get()).patternLine("#  ").patternLine("## ").patternLine("###").addCriterion(
            "has_diorite_tiles", this.hasItem(ECBlockRegistry.DIORITE_TILES.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.DIORITE_TILES_WALL.get(), 6).key('#', ECBlockRegistry.DIORITE_TILES.get()).patternLine("###").patternLine("###").addCriterion("has_diorite_tiles",
            this.hasItem(ECBlockRegistry.DIORITE_TILES.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.DIORITE_TILES_PRESSURE_PLATE.get()).key('#', ECBlockRegistry.DIORITE_TILES.get()).patternLine("##").addCriterion("has_diorite_tiles",
            this.hasItem(ECBlockRegistry.DIORITE_TILES.get())).build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.DIORITE_BRICKS.get(), 4).patternLine("ii").patternLine("ii").key('i', ECBlockRegistry.SMOOTH_DIORITE.get()).addCriterion("has_smooth_diorite",
            this.hasItem(ECBlockRegistry.SMOOTH_DIORITE.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.DIORITE_BRICKS_SLAB.get(), 6).patternLine("iii").key('i', ECBlockRegistry.DIORITE_BRICKS.get()).addCriterion("has_diorite_bricks",
            this.hasItem(ECBlockRegistry.DIORITE_BRICKS.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.DIORITE_BRICKS.get()).patternLine("i").patternLine("i").key('i', ECBlockRegistry.DIORITE_BRICKS_SLAB.get()).addCriterion("has_diorite_bricks_slab",
            this.hasItem(ECBlockRegistry.DIORITE_BRICKS_SLAB.get())).build(consumer, ECConstants.MODID + ":diorite_bricks_from_slabs");
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.DIORITE_BRICKS_STAIRS.get(), 4).key('#', ECBlockRegistry.DIORITE_BRICKS.get()).patternLine("#  ").patternLine("## ").patternLine("###").addCriterion(
            "has_diorite_bricks", this.hasItem(ECBlockRegistry.DIORITE_BRICKS.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.DIORITE_BRICKS_WALL.get(), 6).key('#', ECBlockRegistry.DIORITE_BRICKS.get()).patternLine("###").patternLine("###").addCriterion("has_diorite_bricks",
            this.hasItem(ECBlockRegistry.DIORITE_BRICKS.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.DIORITE_BRICKS_PRESSURE_PLATE.get()).key('#', ECBlockRegistry.DIORITE_BRICKS.get()).patternLine("##").addCriterion("has_diorite_bricks",
            this.hasItem(ECBlockRegistry.DIORITE_BRICKS.get())).build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.DIORITE_LARGE_BRICKS.get(), 4).patternLine("ii").patternLine("ii").key('i', ECBlockRegistry.DIORITE_BRICKS.get()).addCriterion("has_diorite_bricks",
            this.hasItem(ECBlockRegistry.DIORITE_BRICKS.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.DIORITE_LARGE_BRICKS_SLAB.get(), 6).patternLine("iii").key('i', ECBlockRegistry.DIORITE_LARGE_BRICKS.get()).addCriterion("has_diorite_large_bricks",
            this.hasItem(ECBlockRegistry.DIORITE_LARGE_BRICKS.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.DIORITE_LARGE_BRICKS.get()).patternLine("i").patternLine("i").key('i', ECBlockRegistry.DIORITE_LARGE_BRICKS_SLAB.get()).addCriterion(
            "has_diorite_large_bricks_slab", this.hasItem(ECBlockRegistry.DIORITE_LARGE_BRICKS_SLAB.get())).build(consumer, ECConstants.MODID + ":diorite_large_bricks_from_slabs");
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.DIORITE_LARGE_BRICKS_STAIRS.get(), 4).key('#', ECBlockRegistry.DIORITE_LARGE_BRICKS.get()).patternLine("#  ").patternLine("## ").patternLine(
            "###").addCriterion("has_diorite_large_bricks", this.hasItem(ECBlockRegistry.DIORITE_LARGE_BRICKS.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.DIORITE_LARGE_BRICKS_WALL.get(), 6).key('#', ECBlockRegistry.DIORITE_LARGE_BRICKS.get()).patternLine("###").patternLine("###").addCriterion(
            "has_diorite_large_bricks", this.hasItem(ECBlockRegistry.DIORITE_LARGE_BRICKS.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.DIORITE_LARGE_BRICKS_PRESSURE_PLATE.get()).key('#', ECBlockRegistry.DIORITE_LARGE_BRICKS.get()).patternLine("##").addCriterion(
            "has_diorite_large_bricks", this.hasItem(ECBlockRegistry.DIORITE_LARGE_BRICKS.get())).build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.DIORITE_ORNAMENT.get()).patternLine("i").patternLine("i").key('i', ECBlockRegistry.SMOOTH_DIORITE_SLAB.get()).addCriterion("has_smooth_diorite_slab",
            this.hasItem(ECBlockRegistry.SMOOTH_DIORITE_SLAB.get())).build(consumer, ECConstants.MODID + ":diorite_ornament_from_smooth_slabs");
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.DIORITE_ORNAMENT.get()).patternLine("i").patternLine("i").key('i', Blocks.POLISHED_DIORITE_SLAB).addCriterion("has_polished_diorite_slab",
            this.hasItem(Blocks.POLISHED_DIORITE_SLAB)).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.DIORITE_ORNAMENT_PRESSURE_PLATE.get()).key('#', ECBlockRegistry.DIORITE_ORNAMENT.get()).patternLine("##").addCriterion("has_diorite_ornament",
            this.hasItem(ECBlockRegistry.DIORITE_ORNAMENT.get())).build(consumer);

        // Granite
        ShapelessRecipeBuilder.shapelessRecipe(ECBlockRegistry.GRANITE_BUTTON.get()).addIngredient(Blocks.GRANITE).addCriterion("has_granite", this.hasItem(Blocks.GRANITE)).build(consumer);

        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(Items.GRANITE), ECItemRegistry.SMOOTH_GRANITE_ITEM.get(), 0.1f, 200).addCriterion("has_granite", this.hasItem(Items.GRANITE)).build(consumer,
            ECConstants.MODID + ":smooth_granite_from_smelting");

        ShapelessRecipeBuilder.shapelessRecipe(ECBlockRegistry.SMOOTH_GRANITE.get()).addIngredient(Blocks.POLISHED_GRANITE).addCriterion("has_polished_granite", this.hasItem(Blocks.POLISHED_GRANITE)).build(
            consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.SMOOTH_GRANITE_SLAB.get(), 6).patternLine("iii").key('i', ECBlockRegistry.SMOOTH_GRANITE.get()).addCriterion("has_smooth_granite",
            this.hasItem(ECBlockRegistry.SMOOTH_GRANITE.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.SMOOTH_GRANITE.get()).patternLine("i").patternLine("i").key('i', ECBlockRegistry.SMOOTH_GRANITE_SLAB.get()).addCriterion("has_smooth_granite_slab",
            this.hasItem(ECBlockRegistry.SMOOTH_GRANITE_SLAB.get())).build(consumer, ECConstants.MODID + ":smooth_granite_from_slabs");
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.SMOOTH_GRANITE_STAIRS.get(), 4).key('#', ECBlockRegistry.SMOOTH_GRANITE.get()).patternLine("#  ").patternLine("## ").patternLine("###").addCriterion(
            "has_smooth_granite", this.hasItem(ECBlockRegistry.SMOOTH_GRANITE.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.SMOOTH_GRANITE_WALL.get(), 6).key('#', ECBlockRegistry.SMOOTH_GRANITE.get()).patternLine("###").patternLine("###").addCriterion("has_smooth_granite",
            this.hasItem(ECBlockRegistry.SMOOTH_GRANITE.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.SMOOTH_GRANITE_PRESSURE_PLATE.get()).key('#', ECBlockRegistry.SMOOTH_GRANITE.get()).patternLine("##").addCriterion("has_smooth_granite",
            this.hasItem(ECBlockRegistry.SMOOTH_GRANITE.get())).build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.GRANITE_PAVING.get(), 4).patternLine("ii").patternLine("ii").key('i', Blocks.POLISHED_GRANITE).addCriterion("has_polished_granite",
            this.hasItem(Blocks.POLISHED_GRANITE)).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.GRANITE_PAVING_SLAB.get(), 6).patternLine("iii").key('i', ECBlockRegistry.GRANITE_PAVING.get()).addCriterion("has_granite_paving",
            this.hasItem(ECBlockRegistry.GRANITE_PAVING.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.GRANITE_PAVING.get()).patternLine("i").patternLine("i").key('i', ECBlockRegistry.GRANITE_PAVING_SLAB.get()).addCriterion("has_granite_paving_slab",
            this.hasItem(ECBlockRegistry.GRANITE_PAVING_SLAB.get())).build(consumer, ECConstants.MODID + ":granite_paving_from_slabs");
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.GRANITE_PAVING_STAIRS.get(), 4).key('#', ECBlockRegistry.GRANITE_PAVING.get()).patternLine("#  ").patternLine("## ").patternLine("###").addCriterion(
            "has_granite_paving", this.hasItem(ECBlockRegistry.GRANITE_PAVING.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.GRANITE_PAVING_WALL.get(), 6).key('#', ECBlockRegistry.GRANITE_PAVING.get()).patternLine("###").patternLine("###").addCriterion("has_granite_paving",
            this.hasItem(ECBlockRegistry.GRANITE_PAVING.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.GRANITE_PAVING_PRESSURE_PLATE.get()).key('#', ECBlockRegistry.GRANITE_PAVING.get()).patternLine("##").addCriterion("has_granite_paving",
            this.hasItem(ECBlockRegistry.GRANITE_PAVING.get())).build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.GRANITE_TILES.get(), 4).patternLine("ii").patternLine("ii").key('i', ECBlockRegistry.GRANITE_PAVING.get()).addCriterion("has_granite_paving",
            this.hasItem(ECBlockRegistry.GRANITE_PAVING.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.GRANITE_TILES_SLAB.get(), 6).patternLine("iii").key('i', ECBlockRegistry.GRANITE_TILES.get()).addCriterion("has_granite_tiles",
            this.hasItem(ECBlockRegistry.GRANITE_TILES.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.GRANITE_TILES.get()).patternLine("i").patternLine("i").key('i', ECBlockRegistry.GRANITE_TILES_SLAB.get()).addCriterion("has_granite_tiles_slab",
            this.hasItem(ECBlockRegistry.GRANITE_TILES_SLAB.get())).build(consumer, ECConstants.MODID + ":granite_tiles_from_slabs");
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.GRANITE_TILES_STAIRS.get(), 4).key('#', ECBlockRegistry.GRANITE_TILES.get()).patternLine("#  ").patternLine("## ").patternLine("###").addCriterion(
            "has_granite_tiles", this.hasItem(ECBlockRegistry.GRANITE_TILES.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.GRANITE_TILES_WALL.get(), 6).key('#', ECBlockRegistry.GRANITE_TILES.get()).patternLine("###").patternLine("###").addCriterion("has_granite_tiles",
            this.hasItem(ECBlockRegistry.GRANITE_TILES.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.GRANITE_TILES_PRESSURE_PLATE.get()).key('#', ECBlockRegistry.GRANITE_TILES.get()).patternLine("##").addCriterion("has_granite_tiles",
            this.hasItem(ECBlockRegistry.GRANITE_TILES.get())).build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.GRANITE_BRICKS.get(), 4).patternLine("ii").patternLine("ii").key('i', ECBlockRegistry.SMOOTH_GRANITE.get()).addCriterion("has_smooth_granite",
            this.hasItem(ECBlockRegistry.SMOOTH_GRANITE.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.GRANITE_BRICKS_SLAB.get(), 6).patternLine("iii").key('i', ECBlockRegistry.GRANITE_BRICKS.get()).addCriterion("has_granite_bricks",
            this.hasItem(ECBlockRegistry.GRANITE_BRICKS.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.GRANITE_BRICKS.get()).patternLine("i").patternLine("i").key('i', ECBlockRegistry.GRANITE_BRICKS_SLAB.get()).addCriterion("has_granite_bricks_slab",
            this.hasItem(ECBlockRegistry.GRANITE_BRICKS_SLAB.get())).build(consumer, ECConstants.MODID + ":granite_bricks_from_slabs");
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.GRANITE_BRICKS_STAIRS.get(), 4).key('#', ECBlockRegistry.GRANITE_BRICKS.get()).patternLine("#  ").patternLine("## ").patternLine("###").addCriterion(
            "has_granite_bricks", this.hasItem(ECBlockRegistry.GRANITE_BRICKS.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.GRANITE_BRICKS_WALL.get(), 6).key('#', ECBlockRegistry.GRANITE_BRICKS.get()).patternLine("###").patternLine("###").addCriterion("has_granite_bricks",
            this.hasItem(ECBlockRegistry.GRANITE_BRICKS.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.GRANITE_BRICKS_PRESSURE_PLATE.get()).key('#', ECBlockRegistry.GRANITE_BRICKS.get()).patternLine("##").addCriterion("has_granite_bricks",
            this.hasItem(ECBlockRegistry.GRANITE_BRICKS.get())).build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.GRANITE_LARGE_BRICKS.get(), 4).patternLine("ii").patternLine("ii").key('i', ECBlockRegistry.GRANITE_BRICKS.get()).addCriterion("has_granite_bricks",
            this.hasItem(ECBlockRegistry.GRANITE_BRICKS.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.GRANITE_LARGE_BRICKS_SLAB.get(), 6).patternLine("iii").key('i', ECBlockRegistry.GRANITE_LARGE_BRICKS.get()).addCriterion("has_granite_large_bricks",
            this.hasItem(ECBlockRegistry.GRANITE_LARGE_BRICKS.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.GRANITE_LARGE_BRICKS.get()).patternLine("i").patternLine("i").key('i', ECBlockRegistry.GRANITE_LARGE_BRICKS_SLAB.get()).addCriterion(
            "has_granite_large_bricks_slab", this.hasItem(ECBlockRegistry.GRANITE_LARGE_BRICKS_SLAB.get())).build(consumer, ECConstants.MODID + ":granite_large_bricks_from_slabs");
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.GRANITE_LARGE_BRICKS_STAIRS.get(), 4).key('#', ECBlockRegistry.GRANITE_LARGE_BRICKS.get()).patternLine("#  ").patternLine("## ").patternLine(
            "###").addCriterion("has_granite_large_bricks", this.hasItem(ECBlockRegistry.GRANITE_LARGE_BRICKS.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.GRANITE_LARGE_BRICKS_WALL.get(), 6).key('#', ECBlockRegistry.GRANITE_LARGE_BRICKS.get()).patternLine("###").patternLine("###").addCriterion(
            "has_granite_large_bricks", this.hasItem(ECBlockRegistry.GRANITE_LARGE_BRICKS.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.GRANITE_LARGE_BRICKS_PRESSURE_PLATE.get()).key('#', ECBlockRegistry.GRANITE_LARGE_BRICKS.get()).patternLine("##").addCriterion(
            "has_granite_large_bricks", this.hasItem(ECBlockRegistry.GRANITE_LARGE_BRICKS.get())).build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.GRANITE_ORNAMENT.get()).patternLine("i").patternLine("i").key('i', ECBlockRegistry.SMOOTH_GRANITE_SLAB.get()).addCriterion("has_smooth_granite_slab",
            this.hasItem(ECBlockRegistry.SMOOTH_GRANITE_SLAB.get())).build(consumer, ECConstants.MODID + ":granite_ornament_from_smooth_slabs");
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.GRANITE_ORNAMENT.get()).patternLine("i").patternLine("i").key('i', Blocks.POLISHED_GRANITE_SLAB).addCriterion("has_polished_granite_slab",
            this.hasItem(Blocks.POLISHED_GRANITE_SLAB)).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.GRANITE_ORNAMENT_PRESSURE_PLATE.get()).key('#', ECBlockRegistry.GRANITE_ORNAMENT.get()).patternLine("##").addCriterion("has_granite_ornament",
            this.hasItem(ECBlockRegistry.GRANITE_ORNAMENT.get())).build(consumer);

        // Sandstone
        ShapelessRecipeBuilder.shapelessRecipe(ECBlockRegistry.SANDSTONE_BUTTON.get()).addIngredient(Blocks.SANDSTONE).addCriterion("has_sandstone", this.hasItem(Blocks.SANDSTONE)).build(consumer);

        ShapelessRecipeBuilder.shapelessRecipe(ECBlockRegistry.POLISHED_SANDSTONE.get()).addIngredient(Blocks.SMOOTH_SANDSTONE).addCriterion("has_smooth_sandstone", this.hasItem(Blocks.SMOOTH_SANDSTONE)).build(
            consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.POLISHED_SANDSTONE_SLAB.get(), 6).patternLine("iii").key('i', ECBlockRegistry.POLISHED_SANDSTONE.get()).addCriterion("has_polished_sandstone",
            this.hasItem(ECBlockRegistry.POLISHED_SANDSTONE.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.POLISHED_SANDSTONE.get()).patternLine("i").patternLine("i").key('i', ECBlockRegistry.POLISHED_SANDSTONE_SLAB.get()).addCriterion(
            "has_polished_sandstone_slab", this.hasItem(ECBlockRegistry.POLISHED_SANDSTONE_SLAB.get())).build(consumer, ECConstants.MODID + ":polished_sandstone_from_slabs");
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.POLISHED_SANDSTONE_STAIRS.get(), 4).key('#', ECBlockRegistry.POLISHED_SANDSTONE.get()).patternLine("#  ").patternLine("## ").patternLine(
            "###").addCriterion("has_polished_sandstone", this.hasItem(ECBlockRegistry.POLISHED_SANDSTONE.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.POLISHED_SANDSTONE_WALL.get(), 6).key('#', ECBlockRegistry.POLISHED_SANDSTONE.get()).patternLine("###").patternLine("###").addCriterion(
            "has_polished_sandstone", this.hasItem(ECBlockRegistry.POLISHED_SANDSTONE.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.POLISHED_SANDSTONE_PRESSURE_PLATE.get()).key('#', ECBlockRegistry.POLISHED_SANDSTONE.get()).patternLine("##").addCriterion("has_polished_sandstone",
            this.hasItem(ECBlockRegistry.POLISHED_SANDSTONE.get())).build(consumer);

        ShapelessRecipeBuilder.shapelessRecipe(Blocks.SMOOTH_SANDSTONE).addIngredient(ECBlockRegistry.POLISHED_SANDSTONE.get()).addCriterion("has_polished_sandstone",
            this.hasItem(ECBlockRegistry.POLISHED_SANDSTONE.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(Blocks.SMOOTH_SANDSTONE).patternLine("i").patternLine("i").key('i', Blocks.SMOOTH_SANDSTONE_SLAB).addCriterion("has_smooth_sandstone_slab",
            this.hasItem(Blocks.SMOOTH_SANDSTONE_SLAB)).build(consumer, ECConstants.MODID + ":smooth_sandstone_from_slabs");
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.SMOOTH_SANDSTONE_WALL.get(), 6).key('#', Blocks.SMOOTH_SANDSTONE).patternLine("###").patternLine("###").addCriterion("has_smooth_sandstone",
            this.hasItem(Blocks.SMOOTH_SANDSTONE)).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.SMOOTH_SANDSTONE_PRESSURE_PLATE.get()).key('#', Blocks.SMOOTH_SANDSTONE).patternLine("##").addCriterion("has_smooth_sandstone",
            this.hasItem(Blocks.SMOOTH_SANDSTONE)).build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.SANDSTONE_PAVING.get(), 4).patternLine("ii").patternLine("ii").key('i', ECBlockRegistry.POLISHED_SANDSTONE.get()).addCriterion("has_polished_sandstone",
            this.hasItem(ECBlockRegistry.POLISHED_SANDSTONE.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.SANDSTONE_PAVING_SLAB.get(), 6).patternLine("iii").key('i', ECBlockRegistry.SANDSTONE_PAVING.get()).addCriterion("has_sandstone_paving",
            this.hasItem(ECBlockRegistry.SANDSTONE_PAVING.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.SANDSTONE_PAVING.get()).patternLine("i").patternLine("i").key('i', ECBlockRegistry.SANDSTONE_PAVING_SLAB.get()).addCriterion("has_sandstone_paving_slab",
            this.hasItem(ECBlockRegistry.SANDSTONE_PAVING_SLAB.get())).build(consumer, ECConstants.MODID + ":sandstone_paving_from_slabs");
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.SANDSTONE_PAVING_STAIRS.get(), 4).key('#', ECBlockRegistry.SANDSTONE_PAVING.get()).patternLine("#  ").patternLine("## ").patternLine("###").addCriterion(
            "has_sandstone_paving", this.hasItem(ECBlockRegistry.SANDSTONE_PAVING.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.SANDSTONE_PAVING_WALL.get(), 6).key('#', ECBlockRegistry.SANDSTONE_PAVING.get()).patternLine("###").patternLine("###").addCriterion(
            "has_sandstone_paving", this.hasItem(ECBlockRegistry.SANDSTONE_PAVING.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.SANDSTONE_PAVING_PRESSURE_PLATE.get()).key('#', ECBlockRegistry.SANDSTONE_PAVING.get()).patternLine("##").addCriterion("has_sandstone_paving",
            this.hasItem(ECBlockRegistry.SANDSTONE_PAVING.get())).build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.SANDSTONE_TILES.get(), 4).patternLine("ii").patternLine("ii").key('i', ECBlockRegistry.SANDSTONE_PAVING.get()).addCriterion("has_sandstone_paving",
            this.hasItem(ECBlockRegistry.SANDSTONE_PAVING.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.SANDSTONE_TILES_SLAB.get(), 6).patternLine("iii").key('i', ECBlockRegistry.SANDSTONE_TILES.get()).addCriterion("has_sandstone_tiles",
            this.hasItem(ECBlockRegistry.SANDSTONE_TILES.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.SANDSTONE_TILES.get()).patternLine("i").patternLine("i").key('i', ECBlockRegistry.SANDSTONE_TILES_SLAB.get()).addCriterion("has_sandstone_tiles_slab",
            this.hasItem(ECBlockRegistry.SANDSTONE_TILES_SLAB.get())).build(consumer, ECConstants.MODID + ":sandstone_tiles_from_slabs");
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.SANDSTONE_TILES_STAIRS.get(), 4).key('#', ECBlockRegistry.SANDSTONE_TILES.get()).patternLine("#  ").patternLine("## ").patternLine("###").addCriterion(
            "has_sandstone_tiles", this.hasItem(ECBlockRegistry.SANDSTONE_TILES.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.SANDSTONE_TILES_WALL.get(), 6).key('#', ECBlockRegistry.SANDSTONE_TILES.get()).patternLine("###").patternLine("###").addCriterion("has_sandstone_tiles",
            this.hasItem(ECBlockRegistry.SANDSTONE_TILES.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.SANDSTONE_TILES_PRESSURE_PLATE.get()).key('#', ECBlockRegistry.SANDSTONE_TILES.get()).patternLine("##").addCriterion("has_sandstone_tiles",
            this.hasItem(ECBlockRegistry.SANDSTONE_TILES.get())).build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.SANDSTONE_BRICKS.get(), 4).patternLine("ii").patternLine("ii").key('i', Blocks.CUT_SANDSTONE).addCriterion("has_cut_sandstone",
            this.hasItem(Blocks.CUT_SANDSTONE)).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.SANDSTONE_BRICKS_SLAB.get(), 6).patternLine("iii").key('i', ECBlockRegistry.SANDSTONE_BRICKS.get()).addCriterion("has_sandstone_bricks",
            this.hasItem(ECBlockRegistry.SANDSTONE_BRICKS.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.SANDSTONE_BRICKS.get()).patternLine("i").patternLine("i").key('i', ECBlockRegistry.SANDSTONE_BRICKS_SLAB.get()).addCriterion("has_sandstone_bricks_slab",
            this.hasItem(ECBlockRegistry.SANDSTONE_BRICKS_SLAB.get())).build(consumer, ECConstants.MODID + ":sandstone_bricks_from_slabs");
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.SANDSTONE_BRICKS_STAIRS.get(), 4).key('#', ECBlockRegistry.SANDSTONE_BRICKS.get()).patternLine("#  ").patternLine("## ").patternLine("###").addCriterion(
            "has_sandstone_bricks", this.hasItem(ECBlockRegistry.SANDSTONE_BRICKS.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.SANDSTONE_BRICKS_WALL.get(), 6).key('#', ECBlockRegistry.SANDSTONE_BRICKS.get()).patternLine("###").patternLine("###").addCriterion(
            "has_sandstone_bricks", this.hasItem(ECBlockRegistry.SANDSTONE_BRICKS.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.SANDSTONE_BRICKS_PRESSURE_PLATE.get()).key('#', ECBlockRegistry.SANDSTONE_BRICKS.get()).patternLine("##").addCriterion("has_sandstone_bricks",
            this.hasItem(ECBlockRegistry.SANDSTONE_BRICKS.get())).build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.SANDSTONE_LARGE_BRICKS.get(), 4).patternLine("ii").patternLine("ii").key('i', ECBlockRegistry.SANDSTONE_BRICKS.get()).addCriterion(
            "has_sandstone_bricks", this.hasItem(ECBlockRegistry.SANDSTONE_BRICKS.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.SANDSTONE_LARGE_BRICKS_SLAB.get(), 6).patternLine("iii").key('i', ECBlockRegistry.SANDSTONE_LARGE_BRICKS.get()).addCriterion(
            "has_sandstone_large_bricks", this.hasItem(ECBlockRegistry.SANDSTONE_LARGE_BRICKS.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.SANDSTONE_LARGE_BRICKS.get()).patternLine("i").patternLine("i").key('i', ECBlockRegistry.SANDSTONE_LARGE_BRICKS_SLAB.get()).addCriterion(
            "has_sandstone_large_bricks_slab", this.hasItem(ECBlockRegistry.SANDSTONE_LARGE_BRICKS_SLAB.get())).build(consumer, ECConstants.MODID + ":sandstone_large_bricks_from_slabs");
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.SANDSTONE_LARGE_BRICKS_STAIRS.get(), 4).key('#', ECBlockRegistry.SANDSTONE_LARGE_BRICKS.get()).patternLine("#  ").patternLine("## ").patternLine(
            "###").addCriterion("has_sandstone_large_bricks", this.hasItem(ECBlockRegistry.SANDSTONE_LARGE_BRICKS.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.SANDSTONE_LARGE_BRICKS_WALL.get(), 6).key('#', ECBlockRegistry.SANDSTONE_LARGE_BRICKS.get()).patternLine("###").patternLine("###").addCriterion(
            "has_sandstone_large_bricks", this.hasItem(ECBlockRegistry.SANDSTONE_LARGE_BRICKS.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.SANDSTONE_LARGE_BRICKS_PRESSURE_PLATE.get()).key('#', ECBlockRegistry.SANDSTONE_LARGE_BRICKS.get()).patternLine("##").addCriterion(
            "has_sandstone_large_bricks", this.hasItem(ECBlockRegistry.SANDSTONE_LARGE_BRICKS.get())).build(consumer);

        // Red Sandstone
        ShapelessRecipeBuilder.shapelessRecipe(ECBlockRegistry.RED_SANDSTONE_BUTTON.get()).addIngredient(Blocks.RED_SANDSTONE).addCriterion("has_red_sandstone", this.hasItem(Blocks.RED_SANDSTONE)).build(
            consumer);

        ShapelessRecipeBuilder.shapelessRecipe(ECBlockRegistry.POLISHED_RED_SANDSTONE.get()).addIngredient(Blocks.SMOOTH_RED_SANDSTONE).addCriterion("has_smooth_red_sandstone",
            this.hasItem(Blocks.SMOOTH_RED_SANDSTONE)).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.POLISHED_RED_SANDSTONE_SLAB.get(), 6).patternLine("iii").key('i', ECBlockRegistry.POLISHED_RED_SANDSTONE.get()).addCriterion(
            "has_polished_red_sandstone", this.hasItem(ECBlockRegistry.POLISHED_RED_SANDSTONE.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.POLISHED_RED_SANDSTONE.get()).patternLine("i").patternLine("i").key('i', ECBlockRegistry.POLISHED_RED_SANDSTONE_SLAB.get()).addCriterion(
            "has_polished_red_sandstone_slab", this.hasItem(ECBlockRegistry.POLISHED_RED_SANDSTONE_SLAB.get())).build(consumer, ECConstants.MODID + ":polished_red_sandstone_from_slabs");
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.POLISHED_RED_SANDSTONE_STAIRS.get(), 4).key('#', ECBlockRegistry.POLISHED_RED_SANDSTONE.get()).patternLine("#  ").patternLine("## ").patternLine(
            "###").addCriterion("has_polished_red_sandstone", this.hasItem(ECBlockRegistry.POLISHED_RED_SANDSTONE.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.POLISHED_RED_SANDSTONE_WALL.get(), 6).key('#', ECBlockRegistry.POLISHED_RED_SANDSTONE.get()).patternLine("###").patternLine("###").addCriterion(
            "has_polished_red_sandstone", this.hasItem(ECBlockRegistry.POLISHED_RED_SANDSTONE.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.POLISHED_RED_SANDSTONE_PRESSURE_PLATE.get()).key('#', ECBlockRegistry.POLISHED_RED_SANDSTONE.get()).patternLine("##").addCriterion(
            "has_polished_red_sandstone", this.hasItem(ECBlockRegistry.POLISHED_RED_SANDSTONE.get())).build(consumer);

        ShapelessRecipeBuilder.shapelessRecipe(Blocks.SMOOTH_RED_SANDSTONE).addIngredient(ECBlockRegistry.POLISHED_RED_SANDSTONE.get()).addCriterion("has_polished_red_sandstone",
            this.hasItem(ECBlockRegistry.POLISHED_RED_SANDSTONE.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(Blocks.SMOOTH_RED_SANDSTONE).patternLine("i").patternLine("i").key('i', Blocks.SMOOTH_RED_SANDSTONE_SLAB).addCriterion("has_smooth_red_sandstone_slab",
            this.hasItem(Blocks.SMOOTH_RED_SANDSTONE_SLAB)).build(consumer, ECConstants.MODID + ":smooth_red_sandstone_from_slabs");
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.SMOOTH_RED_SANDSTONE_WALL.get(), 6).key('#', Blocks.SMOOTH_RED_SANDSTONE).patternLine("###").patternLine("###").addCriterion("has_smooth_red_sandstone",
            this.hasItem(Blocks.SMOOTH_RED_SANDSTONE)).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.SMOOTH_RED_SANDSTONE_PRESSURE_PLATE.get()).key('#', Blocks.SMOOTH_RED_SANDSTONE).patternLine("##").addCriterion("has_smooth_red_sandstone",
            this.hasItem(Blocks.SMOOTH_RED_SANDSTONE)).build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.RED_SANDSTONE_PAVING.get(), 4).patternLine("ii").patternLine("ii").key('i', ECBlockRegistry.POLISHED_RED_SANDSTONE.get()).addCriterion(
            "has_polished_red_sandstone", this.hasItem(ECBlockRegistry.POLISHED_RED_SANDSTONE.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.RED_SANDSTONE_PAVING_SLAB.get(), 6).patternLine("iii").key('i', ECBlockRegistry.RED_SANDSTONE_PAVING.get()).addCriterion("has_red_sandstone_paving",
            this.hasItem(ECBlockRegistry.RED_SANDSTONE_PAVING.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.RED_SANDSTONE_PAVING.get()).patternLine("i").patternLine("i").key('i', ECBlockRegistry.RED_SANDSTONE_PAVING_SLAB.get()).addCriterion(
            "has_red_sandstone_paving_slab", this.hasItem(ECBlockRegistry.RED_SANDSTONE_PAVING_SLAB.get())).build(consumer, ECConstants.MODID + ":red_sandstone_paving_from_slabs");
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.RED_SANDSTONE_PAVING_STAIRS.get(), 4).key('#', ECBlockRegistry.RED_SANDSTONE_PAVING.get()).patternLine("#  ").patternLine("## ").patternLine(
            "###").addCriterion("has_red_sandstone_paving", this.hasItem(ECBlockRegistry.RED_SANDSTONE_PAVING.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.RED_SANDSTONE_PAVING_WALL.get(), 6).key('#', ECBlockRegistry.RED_SANDSTONE_PAVING.get()).patternLine("###").patternLine("###").addCriterion(
            "has_red_sandstone_paving", this.hasItem(ECBlockRegistry.RED_SANDSTONE_PAVING.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.RED_SANDSTONE_PAVING_PRESSURE_PLATE.get()).key('#', ECBlockRegistry.RED_SANDSTONE_PAVING.get()).patternLine("##").addCriterion(
            "has_red_sandstone_paving", this.hasItem(ECBlockRegistry.RED_SANDSTONE_PAVING.get())).build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.RED_SANDSTONE_TILES.get(), 4).patternLine("ii").patternLine("ii").key('i', ECBlockRegistry.RED_SANDSTONE_PAVING.get()).addCriterion(
            "has_red_sandstone_paving", this.hasItem(ECBlockRegistry.RED_SANDSTONE_PAVING.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.RED_SANDSTONE_TILES_SLAB.get(), 6).patternLine("iii").key('i', ECBlockRegistry.RED_SANDSTONE_TILES.get()).addCriterion("has_red_sandstone_tiles",
            this.hasItem(ECBlockRegistry.RED_SANDSTONE_TILES.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.RED_SANDSTONE_TILES.get()).patternLine("i").patternLine("i").key('i', ECBlockRegistry.RED_SANDSTONE_TILES_SLAB.get()).addCriterion(
            "has_red_sandstone_tiles_slab", this.hasItem(ECBlockRegistry.RED_SANDSTONE_TILES_SLAB.get())).build(consumer, ECConstants.MODID + ":red_sandstone_tiles_from_slabs");
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.RED_SANDSTONE_TILES_STAIRS.get(), 4).key('#', ECBlockRegistry.RED_SANDSTONE_TILES.get()).patternLine("#  ").patternLine("## ").patternLine(
            "###").addCriterion("has_red_sandstone_tiles", this.hasItem(ECBlockRegistry.RED_SANDSTONE_TILES.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.RED_SANDSTONE_TILES_WALL.get(), 6).key('#', ECBlockRegistry.RED_SANDSTONE_TILES.get()).patternLine("###").patternLine("###").addCriterion(
            "has_red_sandstone_tiles", this.hasItem(ECBlockRegistry.RED_SANDSTONE_TILES.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.RED_SANDSTONE_TILES_PRESSURE_PLATE.get()).key('#', ECBlockRegistry.RED_SANDSTONE_TILES.get()).patternLine("##").addCriterion("has_red_sandstone_tiles",
            this.hasItem(ECBlockRegistry.RED_SANDSTONE_TILES.get())).build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.RED_SANDSTONE_BRICKS.get(), 4).patternLine("ii").patternLine("ii").key('i', Blocks.CUT_RED_SANDSTONE).addCriterion("has_cut_red_sandstone",
            this.hasItem(Blocks.CUT_RED_SANDSTONE)).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.RED_SANDSTONE_BRICKS_SLAB.get(), 6).patternLine("iii").key('i', ECBlockRegistry.RED_SANDSTONE_BRICKS.get()).addCriterion("has_red_sandstone_bricks",
            this.hasItem(ECBlockRegistry.RED_SANDSTONE_BRICKS.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.RED_SANDSTONE_BRICKS.get()).patternLine("i").patternLine("i").key('i', ECBlockRegistry.RED_SANDSTONE_BRICKS_SLAB.get()).addCriterion(
            "has_red_sandstone_bricks_slab", this.hasItem(ECBlockRegistry.RED_SANDSTONE_BRICKS_SLAB.get())).build(consumer, ECConstants.MODID + ":red_sandstone_bricks_from_slabs");
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.RED_SANDSTONE_BRICKS_STAIRS.get(), 4).key('#', ECBlockRegistry.RED_SANDSTONE_BRICKS.get()).patternLine("#  ").patternLine("## ").patternLine(
            "###").addCriterion("has_red_sandstone_bricks", this.hasItem(ECBlockRegistry.RED_SANDSTONE_BRICKS.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.RED_SANDSTONE_BRICKS_WALL.get(), 6).key('#', ECBlockRegistry.RED_SANDSTONE_BRICKS.get()).patternLine("###").patternLine("###").addCriterion(
            "has_red_sandstone_bricks", this.hasItem(ECBlockRegistry.RED_SANDSTONE_BRICKS.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.RED_SANDSTONE_BRICKS_PRESSURE_PLATE.get()).key('#', ECBlockRegistry.RED_SANDSTONE_BRICKS.get()).patternLine("##").addCriterion(
            "has_red_sandstone_bricks", this.hasItem(ECBlockRegistry.RED_SANDSTONE_BRICKS.get())).build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.RED_SANDSTONE_LARGE_BRICKS.get(), 4).patternLine("ii").patternLine("ii").key('i', ECBlockRegistry.RED_SANDSTONE_BRICKS.get()).addCriterion(
            "has_red_sandstone_bricks", this.hasItem(ECBlockRegistry.RED_SANDSTONE_BRICKS.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.RED_SANDSTONE_LARGE_BRICKS_SLAB.get(), 6).patternLine("iii").key('i', ECBlockRegistry.RED_SANDSTONE_LARGE_BRICKS.get()).addCriterion(
            "has_red_sandstone_large_bricks", this.hasItem(ECBlockRegistry.RED_SANDSTONE_LARGE_BRICKS.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.RED_SANDSTONE_LARGE_BRICKS.get()).patternLine("i").patternLine("i").key('i', ECBlockRegistry.RED_SANDSTONE_LARGE_BRICKS_SLAB.get()).addCriterion(
            "has_red_sandstone_large_bricks_slab", this.hasItem(ECBlockRegistry.RED_SANDSTONE_LARGE_BRICKS_SLAB.get())).build(consumer, ECConstants.MODID + ":red_sandstone_large_bricks_from_slabs");
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.RED_SANDSTONE_LARGE_BRICKS_STAIRS.get(), 4).key('#', ECBlockRegistry.RED_SANDSTONE_LARGE_BRICKS.get()).patternLine("#  ").patternLine("## ").patternLine(
            "###").addCriterion("has_red_sandstone_large_bricks", this.hasItem(ECBlockRegistry.RED_SANDSTONE_LARGE_BRICKS.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.RED_SANDSTONE_LARGE_BRICKS_WALL.get(), 6).key('#', ECBlockRegistry.RED_SANDSTONE_LARGE_BRICKS.get()).patternLine("###").patternLine("###").addCriterion(
            "has_red_sandstone_large_bricks", this.hasItem(ECBlockRegistry.RED_SANDSTONE_LARGE_BRICKS.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.RED_SANDSTONE_LARGE_BRICKS_PRESSURE_PLATE.get()).key('#', ECBlockRegistry.RED_SANDSTONE_LARGE_BRICKS.get()).patternLine("##").addCriterion(
            "has_red_sandstone_large_bricks", this.hasItem(ECBlockRegistry.RED_SANDSTONE_LARGE_BRICKS.get())).build(consumer);

        // Terracotta

        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.TERRACOTTA_SLAB.get(), 6).patternLine("iii").key('i', Blocks.TERRACOTTA).addCriterion("has_terracotta", this.hasItem(Blocks.TERRACOTTA)).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(Blocks.TERRACOTTA).patternLine("i").patternLine("i").key('i', ECBlockRegistry.TERRACOTTA_SLAB.get()).addCriterion("has_terracotta_slab",
            this.hasItem(ECBlockRegistry.TERRACOTTA_SLAB.get())).build(consumer, ECConstants.MODID + ":terracotta_from_slabs");
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.TERRACOTTA_STAIRS.get(), 4).key('#', Blocks.TERRACOTTA).patternLine("#  ").patternLine("## ").patternLine("###").addCriterion("has_terracotta",
            this.hasItem(Blocks.TERRACOTTA)).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.TERRACOTTA_WALL.get(), 6).key('#', Blocks.TERRACOTTA).patternLine("###").patternLine("###").addCriterion("has_terracotta",
            this.hasItem(Blocks.TERRACOTTA)).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.TERRACOTTA_PRESSURE_PLATE.get()).key('#', Blocks.TERRACOTTA).patternLine("##").addCriterion("has_terracotta", this.hasItem(Blocks.TERRACOTTA)).build(
            consumer);
        ShapelessRecipeBuilder.shapelessRecipe(ECBlockRegistry.TERRACOTTA_BUTTON.get()).addIngredient(Blocks.TERRACOTTA).addCriterion("has_terracotta", this.hasItem(Blocks.TERRACOTTA)).build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.POLISHED_TERRACOTTA.get()).patternLine("i").patternLine("i").key('i', Blocks.TERRACOTTA).addCriterion("has_terracotta",
            this.hasItem(Blocks.TERRACOTTA)).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.POLISHED_TERRACOTTA_SLAB.get(), 6).patternLine("iii").key('i', ECBlockRegistry.POLISHED_TERRACOTTA.get()).addCriterion("has_polished_terracotta",
            this.hasItem(ECBlockRegistry.POLISHED_TERRACOTTA.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.POLISHED_TERRACOTTA.get()).patternLine("i").patternLine("i").key('i', ECBlockRegistry.POLISHED_TERRACOTTA_SLAB.get()).addCriterion(
            "has_polished_terracotta_slab", this.hasItem(ECBlockRegistry.POLISHED_TERRACOTTA_SLAB.get())).build(consumer, ECConstants.MODID + ":polished_terracotta_from_slabs");
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.POLISHED_TERRACOTTA_STAIRS.get(), 4).key('#', ECBlockRegistry.POLISHED_TERRACOTTA.get()).patternLine("#  ").patternLine("## ").patternLine(
            "###").addCriterion("has_polished_terracotta", this.hasItem(ECBlockRegistry.POLISHED_TERRACOTTA.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.POLISHED_TERRACOTTA_WALL.get(), 6).key('#', ECBlockRegistry.POLISHED_TERRACOTTA.get()).patternLine("###").patternLine("###").addCriterion(
            "has_polished_terracotta", this.hasItem(ECBlockRegistry.POLISHED_TERRACOTTA.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.POLISHED_TERRACOTTA_PRESSURE_PLATE.get()).key('#', ECBlockRegistry.POLISHED_TERRACOTTA.get()).patternLine("##").addCriterion("has_polished_terracotta",
            this.hasItem(ECBlockRegistry.POLISHED_TERRACOTTA.get())).build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.TERRACOTTA_PAVING.get(), 4).patternLine("ii").patternLine("ii").key('i', ECBlockRegistry.POLISHED_TERRACOTTA.get()).addCriterion(
            "has_polished_terracotta", this.hasItem(ECBlockRegistry.POLISHED_TERRACOTTA.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.TERRACOTTA_PAVING_SLAB.get(), 6).patternLine("iii").key('i', ECBlockRegistry.TERRACOTTA_PAVING.get()).addCriterion("has_terracotta_paving",
            this.hasItem(ECBlockRegistry.TERRACOTTA_PAVING.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.TERRACOTTA_PAVING.get()).patternLine("i").patternLine("i").key('i', ECBlockRegistry.TERRACOTTA_PAVING_SLAB.get()).addCriterion(
            "has_terracotta_paving_slab", this.hasItem(ECBlockRegistry.TERRACOTTA_PAVING_SLAB.get())).build(consumer, ECConstants.MODID + ":terracotta_paving_from_slabs");
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.TERRACOTTA_PAVING_STAIRS.get(), 4).key('#', ECBlockRegistry.TERRACOTTA_PAVING.get()).patternLine("#  ").patternLine("## ").patternLine(
            "###").addCriterion("has_terracotta_paving", this.hasItem(ECBlockRegistry.TERRACOTTA_PAVING.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.TERRACOTTA_PAVING_WALL.get(), 6).key('#', ECBlockRegistry.TERRACOTTA_PAVING.get()).patternLine("###").patternLine("###").addCriterion(
            "has_terracotta_paving", this.hasItem(ECBlockRegistry.TERRACOTTA_PAVING.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.TERRACOTTA_PAVING_PRESSURE_PLATE.get()).key('#', ECBlockRegistry.TERRACOTTA_PAVING.get()).patternLine("##").addCriterion("has_terracotta_paving",
            this.hasItem(ECBlockRegistry.TERRACOTTA_PAVING.get())).build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.TERRACOTTA_TILES.get(), 4).patternLine("ii").patternLine("ii").key('i', ECBlockRegistry.TERRACOTTA_PAVING.get()).addCriterion("has_terracotta_paving",
            this.hasItem(ECBlockRegistry.TERRACOTTA_PAVING.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.TERRACOTTA_TILES_SLAB.get(), 6).patternLine("iii").key('i', ECBlockRegistry.TERRACOTTA_TILES.get()).addCriterion("has_terracotta_tiles",
            this.hasItem(ECBlockRegistry.TERRACOTTA_TILES.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.TERRACOTTA_TILES.get()).patternLine("i").patternLine("i").key('i', ECBlockRegistry.TERRACOTTA_TILES_SLAB.get()).addCriterion("has_terracotta_tiles_slab",
            this.hasItem(ECBlockRegistry.TERRACOTTA_TILES_SLAB.get())).build(consumer, ECConstants.MODID + ":terracotta_tiles_from_slabs");
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.TERRACOTTA_TILES_STAIRS.get(), 4).key('#', ECBlockRegistry.TERRACOTTA_TILES.get()).patternLine("#  ").patternLine("## ").patternLine("###").addCriterion(
            "has_terracotta_tiles", this.hasItem(ECBlockRegistry.TERRACOTTA_TILES.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.TERRACOTTA_TILES_WALL.get(), 6).key('#', ECBlockRegistry.TERRACOTTA_TILES.get()).patternLine("###").patternLine("###").addCriterion(
            "has_terracotta_tiles", this.hasItem(ECBlockRegistry.TERRACOTTA_TILES.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.TERRACOTTA_TILES_PRESSURE_PLATE.get()).key('#', ECBlockRegistry.TERRACOTTA_TILES.get()).patternLine("##").addCriterion("has_terracotta_tiles",
            this.hasItem(ECBlockRegistry.TERRACOTTA_TILES.get())).build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.TERRACOTTA_BRICKS.get(), 4).patternLine("ii").patternLine("ii").key('i', Blocks.TERRACOTTA).addCriterion("has_terracotta",
            this.hasItem(Blocks.TERRACOTTA)).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.TERRACOTTA_BRICKS_SLAB.get(), 6).patternLine("iii").key('i', ECBlockRegistry.TERRACOTTA_BRICKS.get()).addCriterion("has_terracotta_bricks",
            this.hasItem(ECBlockRegistry.TERRACOTTA_BRICKS.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.TERRACOTTA_BRICKS.get()).patternLine("i").patternLine("i").key('i', ECBlockRegistry.TERRACOTTA_BRICKS_SLAB.get()).addCriterion(
            "has_terracotta_bricks_slab", this.hasItem(ECBlockRegistry.TERRACOTTA_BRICKS_SLAB.get())).build(consumer, ECConstants.MODID + ":terracotta_bricks_from_slabs");
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.TERRACOTTA_BRICKS_STAIRS.get(), 4).key('#', ECBlockRegistry.TERRACOTTA_BRICKS.get()).patternLine("#  ").patternLine("## ").patternLine(
            "###").addCriterion("has_terracotta_bricks", this.hasItem(ECBlockRegistry.TERRACOTTA_BRICKS.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.TERRACOTTA_BRICKS_WALL.get(), 6).key('#', ECBlockRegistry.TERRACOTTA_BRICKS.get()).patternLine("###").patternLine("###").addCriterion(
            "has_terracotta_bricks", this.hasItem(ECBlockRegistry.TERRACOTTA_BRICKS.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.TERRACOTTA_BRICKS_PRESSURE_PLATE.get()).key('#', ECBlockRegistry.TERRACOTTA_BRICKS.get()).patternLine("##").addCriterion("has_terracotta_bricks",
            this.hasItem(ECBlockRegistry.TERRACOTTA_BRICKS.get())).build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.TERRACOTTA_LARGE_BRICKS.get(), 4).patternLine("ii").patternLine("ii").key('i', ECBlockRegistry.TERRACOTTA_BRICKS.get()).addCriterion(
            "has_terracotta_bricks", this.hasItem(ECBlockRegistry.TERRACOTTA_BRICKS.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.TERRACOTTA_LARGE_BRICKS_SLAB.get(), 6).patternLine("iii").key('i', ECBlockRegistry.TERRACOTTA_LARGE_BRICKS.get()).addCriterion(
            "has_terracotta_large_bricks", this.hasItem(ECBlockRegistry.TERRACOTTA_LARGE_BRICKS.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.TERRACOTTA_LARGE_BRICKS.get()).patternLine("i").patternLine("i").key('i', ECBlockRegistry.TERRACOTTA_LARGE_BRICKS_SLAB.get()).addCriterion(
            "has_terracotta_large_bricks_slab", this.hasItem(ECBlockRegistry.TERRACOTTA_LARGE_BRICKS_SLAB.get())).build(consumer, ECConstants.MODID + ":terracotta_large_bricks_from_slabs");
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.TERRACOTTA_LARGE_BRICKS_STAIRS.get(), 4).key('#', ECBlockRegistry.TERRACOTTA_LARGE_BRICKS.get()).patternLine("#  ").patternLine("## ").patternLine(
            "###").addCriterion("has_terracotta_large_bricks", this.hasItem(ECBlockRegistry.TERRACOTTA_LARGE_BRICKS.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.TERRACOTTA_LARGE_BRICKS_WALL.get(), 6).key('#', ECBlockRegistry.TERRACOTTA_LARGE_BRICKS.get()).patternLine("###").patternLine("###").addCriterion(
            "has_terracotta_large_bricks", this.hasItem(ECBlockRegistry.TERRACOTTA_LARGE_BRICKS.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.TERRACOTTA_LARGE_BRICKS_PRESSURE_PLATE.get()).key('#', ECBlockRegistry.TERRACOTTA_LARGE_BRICKS.get()).patternLine("##").addCriterion(
            "has_terracotta_large_bricks", this.hasItem(ECBlockRegistry.TERRACOTTA_LARGE_BRICKS.get())).build(consumer);

        // Other bricks
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.DARK_BRICKS.get(), 9).patternLine("iii").patternLine("idi").patternLine("iii").key('i', Blocks.BRICKS).key('d', Blocks.SOUL_SAND).addCriterion(
            "has_soul_sand", this.hasItem(Blocks.SOUL_SAND)).addCriterion("has_bricks", this.hasItem(Blocks.BRICKS)).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.DARK_BRICKS_SLAB.get(), 6).patternLine("iii").key('i', ECBlockRegistry.DARK_BRICKS.get()).addCriterion("has_dark_bricks",
            this.hasItem(ECBlockRegistry.DARK_BRICKS.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.DARK_BRICKS.get()).patternLine("i").patternLine("i").key('i', ECBlockRegistry.DARK_BRICKS_SLAB.get()).addCriterion("has_dark_bricks_slab",
            this.hasItem(ECBlockRegistry.DARK_BRICKS_SLAB.get())).build(consumer, ECConstants.MODID + ":dark_bricks_from_slabs");
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.DARK_BRICKS_STAIRS.get(), 4).key('#', ECBlockRegistry.DARK_BRICKS.get()).patternLine("#  ").patternLine("## ").patternLine("###").addCriterion(
            "has_dark_bricks", this.hasItem(ECBlockRegistry.DARK_BRICKS.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.DARK_BRICKS_WALL.get(), 6).key('#', ECBlockRegistry.DARK_BRICKS.get()).patternLine("###").patternLine("###").addCriterion("has_dark_bricks",
            this.hasItem(ECBlockRegistry.DARK_BRICKS.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.DARK_BRICKS_PRESSURE_PLATE.get()).key('#', ECBlockRegistry.DARK_BRICKS.get()).patternLine("##").addCriterion("has_dark_bricks",
            this.hasItem(ECBlockRegistry.DARK_BRICKS.get())).build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.DARK_LARGE_BRICKS.get(), 4).patternLine("ii").patternLine("ii").key('i', ECBlockRegistry.DARK_BRICKS.get()).addCriterion("has_dark_bricks",
            this.hasItem(ECBlockRegistry.DARK_BRICKS.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.DARK_LARGE_BRICKS_SLAB.get(), 6).patternLine("iii").key('i', ECBlockRegistry.DARK_LARGE_BRICKS.get()).addCriterion("has_dark_large_bricks",
            this.hasItem(ECBlockRegistry.DARK_LARGE_BRICKS.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.DARK_LARGE_BRICKS.get()).patternLine("i").patternLine("i").key('i', ECBlockRegistry.DARK_LARGE_BRICKS_SLAB.get()).addCriterion(
            "has_dark_large_bricks_slab", this.hasItem(ECBlockRegistry.DARK_LARGE_BRICKS_SLAB.get())).build(consumer, ECConstants.MODID + ":dark_large_bricks_from_slabs");
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.DARK_LARGE_BRICKS_STAIRS.get(), 4).key('#', ECBlockRegistry.DARK_LARGE_BRICKS.get()).patternLine("#  ").patternLine("## ").patternLine(
            "###").addCriterion("has_dark_large_bricks", this.hasItem(ECBlockRegistry.DARK_LARGE_BRICKS.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.DARK_LARGE_BRICKS_WALL.get(), 6).key('#', ECBlockRegistry.DARK_LARGE_BRICKS.get()).patternLine("###").patternLine("###").addCriterion(
            "has_dark_large_bricks", this.hasItem(ECBlockRegistry.DARK_LARGE_BRICKS.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.DARK_LARGE_BRICKS_PRESSURE_PLATE.get()).key('#', ECBlockRegistry.DARK_LARGE_BRICKS.get()).patternLine("##").addCriterion("has_dark_large_bricks",
            this.hasItem(ECBlockRegistry.DARK_LARGE_BRICKS.get())).build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.OLD_BRICKS.get(), 9).patternLine("iii").patternLine("idi").patternLine("iii").key('i', ECBlockRegistry.WEARED_BRICKS.get()).key('d',
            Blocks.NETHERRACK).addCriterion("has_netherrack", this.hasItem(Blocks.NETHERRACK)).addCriterion("has_weared_bricks", this.hasItem(ECBlockRegistry.WEARED_BRICKS.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.OLD_BRICKS_SLAB.get(), 6).patternLine("iii").key('i', ECBlockRegistry.OLD_BRICKS.get()).addCriterion("has_old_bricks",
            this.hasItem(ECBlockRegistry.OLD_BRICKS.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.OLD_BRICKS.get()).patternLine("i").patternLine("i").key('i', ECBlockRegistry.OLD_BRICKS_SLAB.get()).addCriterion("has_old_bricks_slab",
            this.hasItem(ECBlockRegistry.OLD_BRICKS_SLAB.get())).build(consumer, ECConstants.MODID + ":old_bricks_from_slabs");
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.OLD_BRICKS_STAIRS.get(), 4).key('#', ECBlockRegistry.OLD_BRICKS.get()).patternLine("#  ").patternLine("## ").patternLine("###").addCriterion(
            "has_old_bricks", this.hasItem(ECBlockRegistry.OLD_BRICKS.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.OLD_BRICKS_WALL.get(), 6).key('#', ECBlockRegistry.OLD_BRICKS.get()).patternLine("###").patternLine("###").addCriterion("has_old_bricks",
            this.hasItem(ECBlockRegistry.OLD_BRICKS.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.OLD_BRICKS_PRESSURE_PLATE.get()).key('#', ECBlockRegistry.OLD_BRICKS.get()).patternLine("##").addCriterion("has_old_bricks",
            this.hasItem(ECBlockRegistry.OLD_BRICKS.get())).build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.OLD_LARGE_BRICKS.get(), 4).patternLine("ii").patternLine("ii").key('i', ECBlockRegistry.OLD_BRICKS.get()).addCriterion("has_old_bricks",
            this.hasItem(ECBlockRegistry.OLD_BRICKS.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.OLD_LARGE_BRICKS_SLAB.get(), 6).patternLine("iii").key('i', ECBlockRegistry.OLD_LARGE_BRICKS.get()).addCriterion("has_old_large_bricks",
            this.hasItem(ECBlockRegistry.OLD_LARGE_BRICKS.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.OLD_LARGE_BRICKS.get()).patternLine("i").patternLine("i").key('i', ECBlockRegistry.OLD_LARGE_BRICKS_SLAB.get()).addCriterion("has_old_large_bricks_slab",
            this.hasItem(ECBlockRegistry.OLD_LARGE_BRICKS_SLAB.get())).build(consumer, ECConstants.MODID + ":old_large_bricks_from_slabs");
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.OLD_LARGE_BRICKS_STAIRS.get(), 4).key('#', ECBlockRegistry.OLD_LARGE_BRICKS.get()).patternLine("#  ").patternLine("## ").patternLine("###").addCriterion(
            "has_old_large_bricks", this.hasItem(ECBlockRegistry.OLD_LARGE_BRICKS.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.OLD_LARGE_BRICKS_WALL.get(), 6).key('#', ECBlockRegistry.OLD_LARGE_BRICKS.get()).patternLine("###").patternLine("###").addCriterion(
            "has_old_large_bricks", this.hasItem(ECBlockRegistry.OLD_LARGE_BRICKS.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.OLD_LARGE_BRICKS_PRESSURE_PLATE.get()).key('#', ECBlockRegistry.OLD_LARGE_BRICKS.get()).patternLine("##").addCriterion("has_old_large_bricks",
            this.hasItem(ECBlockRegistry.OLD_LARGE_BRICKS.get())).build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.WEARED_BRICKS.get(), 9).patternLine("iii").patternLine("idi").patternLine("iii").key('i', Blocks.BRICKS).key('d', Blocks.NETHERRACK).addCriterion(
            "has_netherrack", this.hasItem(Blocks.NETHERRACK)).addCriterion("has_bricks", this.hasItem(Blocks.BRICKS)).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.WEARED_BRICKS_SLAB.get(), 6).patternLine("iii").key('i', ECBlockRegistry.WEARED_BRICKS.get()).addCriterion("has_weared_bricks",
            this.hasItem(ECBlockRegistry.WEARED_BRICKS.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.WEARED_BRICKS.get()).patternLine("i").patternLine("i").key('i', ECBlockRegistry.WEARED_BRICKS_SLAB.get()).addCriterion("has_weared_bricks_slab",
            this.hasItem(ECBlockRegistry.WEARED_BRICKS_SLAB.get())).build(consumer, ECConstants.MODID + ":weared_bricks_from_slabs");
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.WEARED_BRICKS_STAIRS.get(), 4).key('#', ECBlockRegistry.WEARED_BRICKS.get()).patternLine("#  ").patternLine("## ").patternLine("###").addCriterion(
            "has_weared_bricks", this.hasItem(ECBlockRegistry.WEARED_BRICKS.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.WEARED_BRICKS_WALL.get(), 6).key('#', ECBlockRegistry.WEARED_BRICKS.get()).patternLine("###").patternLine("###").addCriterion("has_weared_bricks",
            this.hasItem(ECBlockRegistry.WEARED_BRICKS.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.WEARED_BRICKS_PRESSURE_PLATE.get()).key('#', ECBlockRegistry.WEARED_BRICKS.get()).patternLine("##").addCriterion("has_weared_bricks",
            this.hasItem(ECBlockRegistry.WEARED_BRICKS.get())).build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.WEARED_LARGE_BRICKS.get(), 4).patternLine("ii").patternLine("ii").key('i', ECBlockRegistry.WEARED_BRICKS.get()).addCriterion("has_weared_bricks",
            this.hasItem(ECBlockRegistry.WEARED_BRICKS.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.WEARED_LARGE_BRICKS_SLAB.get(), 6).patternLine("iii").key('i', ECBlockRegistry.WEARED_LARGE_BRICKS.get()).addCriterion("has_weared_large_bricks",
            this.hasItem(ECBlockRegistry.WEARED_LARGE_BRICKS.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.WEARED_LARGE_BRICKS.get()).patternLine("i").patternLine("i").key('i', ECBlockRegistry.WEARED_LARGE_BRICKS_SLAB.get()).addCriterion(
            "has_weared_large_bricks_slab", this.hasItem(ECBlockRegistry.WEARED_LARGE_BRICKS_SLAB.get())).build(consumer, ECConstants.MODID + ":weared_large_bricks_from_slabs");
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.WEARED_LARGE_BRICKS_STAIRS.get(), 4).key('#', ECBlockRegistry.WEARED_LARGE_BRICKS.get()).patternLine("#  ").patternLine("## ").patternLine(
            "###").addCriterion("has_weared_large_bricks", this.hasItem(ECBlockRegistry.WEARED_LARGE_BRICKS.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.WEARED_LARGE_BRICKS_WALL.get(), 6).key('#', ECBlockRegistry.WEARED_LARGE_BRICKS.get()).patternLine("###").patternLine("###").addCriterion(
            "has_weared_large_bricks", this.hasItem(ECBlockRegistry.WEARED_LARGE_BRICKS.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.WEARED_LARGE_BRICKS_PRESSURE_PLATE.get()).key('#', ECBlockRegistry.WEARED_LARGE_BRICKS.get()).patternLine("##").addCriterion("has_weared_large_bricks",
            this.hasItem(ECBlockRegistry.WEARED_LARGE_BRICKS.get())).build(consumer);

        // Pavings
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.CONCRETE_PAVING.get(), 4).patternLine("ii").patternLine("ii").key('i', Blocks.LIGHT_GRAY_CONCRETE_POWDER).addCriterion("has_light_gray_concrete_powder",
            this.hasItem(Blocks.LIGHT_GRAY_CONCRETE_POWDER)).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.CONCRETE_PAVING_SLAB.get(), 6).patternLine("iii").key('i', ECBlockRegistry.CONCRETE_PAVING.get()).addCriterion("has_concrete_paving",
            this.hasItem(ECBlockRegistry.CONCRETE_PAVING.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.CONCRETE_PAVING.get()).patternLine("i").patternLine("i").key('i', ECBlockRegistry.CONCRETE_PAVING_SLAB.get()).addCriterion("has_concrete_paving_slab",
            this.hasItem(ECBlockRegistry.CONCRETE_PAVING_SLAB.get())).build(consumer, ECConstants.MODID + ":concrete_paving_from_slabs");
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.CONCRETE_PAVING_STAIRS.get(), 4).key('#', ECBlockRegistry.CONCRETE_PAVING.get()).patternLine("#  ").patternLine("## ").patternLine("###").addCriterion(
            "has_concrete_paving", this.hasItem(ECBlockRegistry.CONCRETE_PAVING.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.CONCRETE_PAVING_WALL.get(), 6).key('#', ECBlockRegistry.CONCRETE_PAVING.get()).patternLine("###").patternLine("###").addCriterion("has_concrete_paving",
            this.hasItem(ECBlockRegistry.CONCRETE_PAVING.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.CONCRETE_PAVING_PRESSURE_PLATE.get()).key('#', ECBlockRegistry.CONCRETE_PAVING.get()).patternLine("##").addCriterion("has_concrete_paving",
            this.hasItem(ECBlockRegistry.CONCRETE_PAVING.get())).build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.DAMAGED_PAVING.get(), 4).patternLine("ic").patternLine("ci").key('i', Blocks.LIGHT_GRAY_CONCRETE_POWDER).key('c', Blocks.COBBLESTONE).addCriterion(
            "has_light_gray_concrete_powder", this.hasItem(Blocks.LIGHT_GRAY_CONCRETE_POWDER)).addCriterion("has_cobblestone", this.hasItem(Blocks.COBBLESTONE)).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.DAMAGED_PAVING_SLAB.get(), 6).patternLine("iii").key('i', ECBlockRegistry.DAMAGED_PAVING.get()).addCriterion("has_damaged_paving",
            this.hasItem(ECBlockRegistry.DAMAGED_PAVING.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.DAMAGED_PAVING.get()).patternLine("i").patternLine("i").key('i', ECBlockRegistry.DAMAGED_PAVING_SLAB.get()).addCriterion("has_damaged_paving_slab",
            this.hasItem(ECBlockRegistry.DAMAGED_PAVING_SLAB.get())).build(consumer, ECConstants.MODID + ":damaged_paving_from_slabs");
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.DAMAGED_PAVING_STAIRS.get(), 4).key('#', ECBlockRegistry.DAMAGED_PAVING.get()).patternLine("#  ").patternLine("## ").patternLine("###").addCriterion(
            "has_damaged_paving", this.hasItem(ECBlockRegistry.DAMAGED_PAVING.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.DAMAGED_PAVING_WALL.get(), 6).key('#', ECBlockRegistry.DAMAGED_PAVING.get()).patternLine("###").patternLine("###").addCriterion("has_damaged_paving",
            this.hasItem(ECBlockRegistry.DAMAGED_PAVING.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.DAMAGED_PAVING_PRESSURE_PLATE.get()).key('#', ECBlockRegistry.DAMAGED_PAVING.get()).patternLine("##").addCriterion("has_damaged_paving",
            this.hasItem(ECBlockRegistry.DAMAGED_PAVING.get())).build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.DARK_CONCRETE_PAVING.get(), 4).patternLine("ii").patternLine("ii").key('i', Blocks.GRAY_CONCRETE_POWDER).addCriterion("has_gray_concrete_powder",
            this.hasItem(Blocks.GRAY_CONCRETE_POWDER)).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.DARK_CONCRETE_PAVING_SLAB.get(), 6).patternLine("iii").key('i', ECBlockRegistry.DARK_CONCRETE_PAVING.get()).addCriterion("has_dark_concrete_paving",
            this.hasItem(ECBlockRegistry.DARK_CONCRETE_PAVING.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.DARK_CONCRETE_PAVING.get()).patternLine("i").patternLine("i").key('i', ECBlockRegistry.DARK_CONCRETE_PAVING_SLAB.get()).addCriterion(
            "has_dark_concrete_paving_slab", this.hasItem(ECBlockRegistry.DARK_CONCRETE_PAVING_SLAB.get())).build(consumer, ECConstants.MODID + ":dark_concrete_paving_from_slabs");
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.DARK_CONCRETE_PAVING_STAIRS.get(), 4).key('#', ECBlockRegistry.DARK_CONCRETE_PAVING.get()).patternLine("#  ").patternLine("## ").patternLine(
            "###").addCriterion("has_dark_concrete_paving", this.hasItem(ECBlockRegistry.DARK_CONCRETE_PAVING.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.DARK_CONCRETE_PAVING_WALL.get(), 6).key('#', ECBlockRegistry.DARK_CONCRETE_PAVING.get()).patternLine("###").patternLine("###").addCriterion(
            "has_dark_concrete_paving", this.hasItem(ECBlockRegistry.DARK_CONCRETE_PAVING.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.DARK_CONCRETE_PAVING_PRESSURE_PLATE.get()).key('#', ECBlockRegistry.DARK_CONCRETE_PAVING.get()).patternLine("##").addCriterion(
            "has_dark_concrete_paving", this.hasItem(ECBlockRegistry.DARK_CONCRETE_PAVING.get())).build(consumer);

        ShapelessRecipeBuilder.shapelessRecipe(ECBlockRegistry.MOIST_PAVING.get()).addIngredient(ECBlockRegistry.POLISHED_PAVING.get()).addIngredient(Blocks.VINE).addCriterion("has_polished_paving",
            this.hasItem(ECBlockRegistry.POLISHED_PAVING.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.MOIST_PAVING_SLAB.get(), 6).patternLine("iii").key('i', ECBlockRegistry.MOIST_PAVING.get()).addCriterion("has_moist_paving",
            this.hasItem(ECBlockRegistry.MOIST_PAVING.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.MOIST_PAVING.get()).patternLine("i").patternLine("i").key('i', ECBlockRegistry.MOIST_PAVING_SLAB.get()).addCriterion("has_moist_paving_slab",
            this.hasItem(ECBlockRegistry.MOIST_PAVING_SLAB.get())).build(consumer, ECConstants.MODID + ":moist_paving_from_slabs");
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.MOIST_PAVING_STAIRS.get(), 4).key('#', ECBlockRegistry.MOIST_PAVING.get()).patternLine("#  ").patternLine("## ").patternLine("###").addCriterion(
            "has_moist_paving", this.hasItem(ECBlockRegistry.MOIST_PAVING.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.MOIST_PAVING_WALL.get(), 6).key('#', ECBlockRegistry.MOIST_PAVING.get()).patternLine("###").patternLine("###").addCriterion("has_moist_paving",
            this.hasItem(ECBlockRegistry.MOIST_PAVING.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.MOIST_PAVING_PRESSURE_PLATE.get()).key('#', ECBlockRegistry.MOIST_PAVING.get()).patternLine("##").addCriterion("has_moist_paving",
            this.hasItem(ECBlockRegistry.MOIST_PAVING.get())).build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.POLISHED_PAVING.get(), 4).patternLine("ii").patternLine("ii").key('i', Blocks.WHITE_CONCRETE).addCriterion("has_white_concrete",
            this.hasItem(Blocks.WHITE_CONCRETE)).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.POLISHED_PAVING_SLAB.get(), 6).patternLine("iii").key('i', ECBlockRegistry.POLISHED_PAVING.get()).addCriterion("has_polished_paving",
            this.hasItem(ECBlockRegistry.POLISHED_PAVING.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.POLISHED_PAVING.get()).patternLine("i").patternLine("i").key('i', ECBlockRegistry.POLISHED_PAVING_SLAB.get()).addCriterion("has_polished_paving_slab",
            this.hasItem(ECBlockRegistry.POLISHED_PAVING_SLAB.get())).build(consumer, ECConstants.MODID + ":polished_paving_from_slabs");
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.POLISHED_PAVING_STAIRS.get(), 4).key('#', ECBlockRegistry.POLISHED_PAVING.get()).patternLine("#  ").patternLine("## ").patternLine("###").addCriterion(
            "has_polished_paving", this.hasItem(ECBlockRegistry.POLISHED_PAVING.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.POLISHED_PAVING_WALL.get(), 6).key('#', ECBlockRegistry.POLISHED_PAVING.get()).patternLine("###").patternLine("###").addCriterion("has_polished_paving",
            this.hasItem(ECBlockRegistry.POLISHED_PAVING.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.POLISHED_PAVING_PRESSURE_PLATE.get()).key('#', ECBlockRegistry.POLISHED_PAVING.get()).patternLine("##").addCriterion("has_polished_paving",
            this.hasItem(ECBlockRegistry.POLISHED_PAVING.get())).build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.WHITE_CONCRETE_PAVING.get(), 4).patternLine("ii").patternLine("ii").key('i', Blocks.WHITE_CONCRETE_POWDER).addCriterion("has_white_concrete_powder",
            this.hasItem(Blocks.WHITE_CONCRETE_POWDER)).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.WHITE_CONCRETE_PAVING_SLAB.get(), 6).patternLine("iii").key('i', ECBlockRegistry.WHITE_CONCRETE_PAVING.get()).addCriterion("has_white_concrete_paving",
            this.hasItem(ECBlockRegistry.WHITE_CONCRETE_PAVING.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.WHITE_CONCRETE_PAVING.get()).patternLine("i").patternLine("i").key('i', ECBlockRegistry.WHITE_CONCRETE_PAVING_SLAB.get()).addCriterion(
            "has_white_concrete_paving_slab", this.hasItem(ECBlockRegistry.WHITE_CONCRETE_PAVING_SLAB.get())).build(consumer, ECConstants.MODID + ":white_concrete_paving_from_slabs");
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.WHITE_CONCRETE_PAVING_STAIRS.get(), 4).key('#', ECBlockRegistry.WHITE_CONCRETE_PAVING.get()).patternLine("#  ").patternLine("## ").patternLine(
            "###").addCriterion("has_white_concrete_paving", this.hasItem(ECBlockRegistry.WHITE_CONCRETE_PAVING.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.WHITE_CONCRETE_PAVING_WALL.get(), 6).key('#', ECBlockRegistry.WHITE_CONCRETE_PAVING.get()).patternLine("###").patternLine("###").addCriterion(
            "has_white_concrete_paving", this.hasItem(ECBlockRegistry.WHITE_CONCRETE_PAVING.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.WHITE_CONCRETE_PAVING_PRESSURE_PLATE.get()).key('#', ECBlockRegistry.WHITE_CONCRETE_PAVING.get()).patternLine("##").addCriterion(
            "has_white_concrete_paving", this.hasItem(ECBlockRegistry.WHITE_CONCRETE_PAVING.get())).build(consumer);

        // Tiles
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.CONCRETE_TILES.get(), 4).patternLine("ii").patternLine("ii").key('i', ECBlockRegistry.CONCRETE_PAVING.get()).addCriterion("has_concrete_tiles",
            this.hasItem(ECBlockRegistry.CONCRETE_PAVING.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.CONCRETE_TILES_SLAB.get(), 6).patternLine("iii").key('i', ECBlockRegistry.CONCRETE_TILES.get()).addCriterion("has_concrete_tiles",
            this.hasItem(ECBlockRegistry.CONCRETE_TILES.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.CONCRETE_TILES.get()).patternLine("i").patternLine("i").key('i', ECBlockRegistry.CONCRETE_TILES_SLAB.get()).addCriterion("has_concrete_tiles_slab",
            this.hasItem(ECBlockRegistry.CONCRETE_TILES_SLAB.get())).build(consumer, ECConstants.MODID + ":concrete_tiles_from_slabs");
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.CONCRETE_TILES_STAIRS.get(), 4).key('#', ECBlockRegistry.CONCRETE_TILES.get()).patternLine("#  ").patternLine("## ").patternLine("###").addCriterion(
            "has_concrete_tiles", this.hasItem(ECBlockRegistry.CONCRETE_TILES.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.CONCRETE_TILES_WALL.get(), 6).key('#', ECBlockRegistry.CONCRETE_TILES.get()).patternLine("###").patternLine("###").addCriterion("has_concrete_tiles",
            this.hasItem(ECBlockRegistry.CONCRETE_TILES.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.CONCRETE_TILES_PRESSURE_PLATE.get()).key('#', ECBlockRegistry.CONCRETE_TILES.get()).patternLine("##").addCriterion("has_concrete_tiles",
            this.hasItem(ECBlockRegistry.CONCRETE_TILES.get())).build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.SKYBLUE_TILES.get(), 8).patternLine("iii").patternLine("idi").patternLine("iii").key('i', ECBlockRegistry.BLUE_TILES.get()).key('d',
            Tags.Items.DYES_WHITE).addCriterion("has_blue_tiles", this.hasItem(ECBlockRegistry.BLUE_TILES.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.SKYBLUE_TILES_SLAB.get(), 6).patternLine("iii").key('i', ECBlockRegistry.SKYBLUE_TILES.get()).addCriterion("has_skyblue_tiles",
            this.hasItem(ECBlockRegistry.SKYBLUE_TILES.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.SKYBLUE_TILES.get()).patternLine("i").patternLine("i").key('i', ECBlockRegistry.SKYBLUE_TILES_SLAB.get()).addCriterion("has_skyblue_tiles_slab",
            this.hasItem(ECBlockRegistry.SKYBLUE_TILES_SLAB.get())).build(consumer, ECConstants.MODID + ":skyblue_tiles_from_slabs");
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.SKYBLUE_TILES_STAIRS.get(), 4).key('#', ECBlockRegistry.SKYBLUE_TILES.get()).patternLine("#  ").patternLine("## ").patternLine("###").addCriterion(
            "has_skyblue_tiles", this.hasItem(ECBlockRegistry.SKYBLUE_TILES.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.SKYBLUE_TILES_WALL.get(), 6).key('#', ECBlockRegistry.SKYBLUE_TILES.get()).patternLine("###").patternLine("###").addCriterion("has_skyblue_tiles",
            this.hasItem(ECBlockRegistry.SKYBLUE_TILES.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.SKYBLUE_TILES_PRESSURE_PLATE.get()).key('#', ECBlockRegistry.SKYBLUE_TILES.get()).patternLine("##").addCriterion("has_skyblue_tiles",
            this.hasItem(ECBlockRegistry.SKYBLUE_TILES.get())).build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.ORANGE_TILES.get(), 8).patternLine("iii").patternLine("idi").patternLine("iii").key('i', ECBlockRegistry.CONCRETE_TILES.get()).key('d',
            Tags.Items.DYES_ORANGE).addCriterion("has_concrete_tiles", this.hasItem(ECBlockRegistry.CONCRETE_TILES.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.ORANGE_TILES_SLAB.get(), 6).patternLine("iii").key('i', ECBlockRegistry.ORANGE_TILES.get()).addCriterion("has_orange_tiles",
            this.hasItem(ECBlockRegistry.ORANGE_TILES.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.ORANGE_TILES.get()).patternLine("i").patternLine("i").key('i', ECBlockRegistry.ORANGE_TILES_SLAB.get()).addCriterion("has_orange_tiles_slab",
            this.hasItem(ECBlockRegistry.ORANGE_TILES_SLAB.get())).build(consumer, ECConstants.MODID + ":orange_tiles_from_slabs");
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.ORANGE_TILES_STAIRS.get(), 4).key('#', ECBlockRegistry.ORANGE_TILES.get()).patternLine("#  ").patternLine("## ").patternLine("###").addCriterion(
            "has_orange_tiles", this.hasItem(ECBlockRegistry.ORANGE_TILES.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.ORANGE_TILES_WALL.get(), 6).key('#', ECBlockRegistry.ORANGE_TILES.get()).patternLine("###").patternLine("###").addCriterion("has_orange_tiles",
            this.hasItem(ECBlockRegistry.ORANGE_TILES.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.ORANGE_TILES_PRESSURE_PLATE.get()).key('#', ECBlockRegistry.ORANGE_TILES.get()).patternLine("##").addCriterion("has_orange_tiles",
            this.hasItem(ECBlockRegistry.ORANGE_TILES.get())).build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.BLUE_TILES.get(), 8).patternLine("iii").patternLine("idi").patternLine("iii").key('i', ECBlockRegistry.CONCRETE_TILES.get()).key('d',
            Tags.Items.DYES_BLUE).addCriterion("has_concrete_tiles", this.hasItem(ECBlockRegistry.CONCRETE_TILES.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.BLUE_TILES_SLAB.get(), 6).patternLine("iii").key('i', ECBlockRegistry.BLUE_TILES.get()).addCriterion("has_blue_tiles",
            this.hasItem(ECBlockRegistry.BLUE_TILES.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.BLUE_TILES.get()).patternLine("i").patternLine("i").key('i', ECBlockRegistry.BLUE_TILES_SLAB.get()).addCriterion("has_blue_tiles_slab",
            this.hasItem(ECBlockRegistry.BLUE_TILES_SLAB.get())).build(consumer, ECConstants.MODID + ":blue_tiles_from_slabs");
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.BLUE_TILES_STAIRS.get(), 4).key('#', ECBlockRegistry.BLUE_TILES.get()).patternLine("#  ").patternLine("## ").patternLine("###").addCriterion(
            "has_blue_tiles", this.hasItem(ECBlockRegistry.BLUE_TILES.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.BLUE_TILES_WALL.get(), 6).key('#', ECBlockRegistry.BLUE_TILES.get()).patternLine("###").patternLine("###").addCriterion("has_blue_tiles",
            this.hasItem(ECBlockRegistry.BLUE_TILES.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.BLUE_TILES_PRESSURE_PLATE.get()).key('#', ECBlockRegistry.BLUE_TILES.get()).patternLine("##").addCriterion("has_blue_tiles",
            this.hasItem(ECBlockRegistry.BLUE_TILES.get())).build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.LIGHT_BLUE_TILES.get(), 8).patternLine("iii").patternLine("idi").patternLine("iii").key('i', ECBlockRegistry.CONCRETE_TILES.get()).key('d',
            Tags.Items.DYES_LIGHT_BLUE).addCriterion("has_concrete_tiles", this.hasItem(ECBlockRegistry.CONCRETE_TILES.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.LIGHT_BLUE_TILES_SLAB.get(), 6).patternLine("iii").key('i', ECBlockRegistry.LIGHT_BLUE_TILES.get()).addCriterion("has_light_blue_tiles",
            this.hasItem(ECBlockRegistry.LIGHT_BLUE_TILES.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.LIGHT_BLUE_TILES.get()).patternLine("i").patternLine("i").key('i', ECBlockRegistry.LIGHT_BLUE_TILES_SLAB.get()).addCriterion("has_light_blue_tiles_slab",
            this.hasItem(ECBlockRegistry.LIGHT_BLUE_TILES_SLAB.get())).build(consumer, ECConstants.MODID + ":light_blue_tiles_from_slabs");
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.LIGHT_BLUE_TILES_STAIRS.get(), 4).key('#', ECBlockRegistry.LIGHT_BLUE_TILES.get()).patternLine("#  ").patternLine("## ").patternLine("###").addCriterion(
            "has_light_blue_tiles", this.hasItem(ECBlockRegistry.LIGHT_BLUE_TILES.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.LIGHT_BLUE_TILES_WALL.get(), 6).key('#', ECBlockRegistry.LIGHT_BLUE_TILES.get()).patternLine("###").patternLine("###").addCriterion(
            "has_light_blue_tiles", this.hasItem(ECBlockRegistry.LIGHT_BLUE_TILES.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.LIGHT_BLUE_TILES_PRESSURE_PLATE.get()).key('#', ECBlockRegistry.LIGHT_BLUE_TILES.get()).patternLine("##").addCriterion("has_light_blue_tiles",
            this.hasItem(ECBlockRegistry.LIGHT_BLUE_TILES.get())).build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.RED_TILES.get(), 8).patternLine("iii").patternLine("idi").patternLine("iii").key('i', ECBlockRegistry.CONCRETE_TILES.get()).key('d',
            Tags.Items.DYES_RED).addCriterion("has_concrete_tiles", this.hasItem(ECBlockRegistry.CONCRETE_TILES.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.RED_TILES_SLAB.get(), 6).patternLine("iii").key('i', ECBlockRegistry.RED_TILES.get()).addCriterion("has_red_tiles",
            this.hasItem(ECBlockRegistry.RED_TILES.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.RED_TILES.get()).patternLine("i").patternLine("i").key('i', ECBlockRegistry.RED_TILES_SLAB.get()).addCriterion("has_red_tiles_slab",
            this.hasItem(ECBlockRegistry.RED_TILES_SLAB.get())).build(consumer, ECConstants.MODID + ":red_tiles_from_slabs");
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.RED_TILES_STAIRS.get(), 4).key('#', ECBlockRegistry.RED_TILES.get()).patternLine("#  ").patternLine("## ").patternLine("###").addCriterion(
            "has_red_tiles", this.hasItem(ECBlockRegistry.RED_TILES.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.RED_TILES_WALL.get(), 6).key('#', ECBlockRegistry.RED_TILES.get()).patternLine("###").patternLine("###").addCriterion("has_red_tiles",
            this.hasItem(ECBlockRegistry.RED_TILES.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.RED_TILES_PRESSURE_PLATE.get()).key('#', ECBlockRegistry.RED_TILES.get()).patternLine("##").addCriterion("has_red_tiles",
            this.hasItem(ECBlockRegistry.RED_TILES.get())).build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.WHITE_TILES.get(), 8).patternLine("iii").patternLine("idi").patternLine("iii").key('i', ECBlockRegistry.CONCRETE_TILES.get()).key('d',
            Tags.Items.DYES_WHITE).addCriterion("has_concrete_tiles", this.hasItem(ECBlockRegistry.CONCRETE_TILES.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.WHITE_TILES_SLAB.get(), 6).patternLine("iii").key('i', ECBlockRegistry.WHITE_TILES.get()).addCriterion("has_white_tiles",
            this.hasItem(ECBlockRegistry.WHITE_TILES.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.WHITE_TILES.get()).patternLine("i").patternLine("i").key('i', ECBlockRegistry.WHITE_TILES_SLAB.get()).addCriterion("has_white_tiles_slab",
            this.hasItem(ECBlockRegistry.WHITE_TILES_SLAB.get())).build(consumer, ECConstants.MODID + ":white_tiles_from_slabs");
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.WHITE_TILES_STAIRS.get(), 4).key('#', ECBlockRegistry.WHITE_TILES.get()).patternLine("#  ").patternLine("## ").patternLine("###").addCriterion(
            "has_white_tiles", this.hasItem(ECBlockRegistry.WHITE_TILES.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.WHITE_TILES_WALL.get(), 6).key('#', ECBlockRegistry.WHITE_TILES.get()).patternLine("###").patternLine("###").addCriterion("has_white_tiles",
            this.hasItem(ECBlockRegistry.WHITE_TILES.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.WHITE_TILES_PRESSURE_PLATE.get()).key('#', ECBlockRegistry.WHITE_TILES.get()).patternLine("##").addCriterion("has_white_tiles",
            this.hasItem(ECBlockRegistry.WHITE_TILES.get())).build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.YELLOW_TILES.get(), 8).patternLine("iii").patternLine("idi").patternLine("iii").key('i', ECBlockRegistry.CONCRETE_TILES.get()).key('d',
            Tags.Items.DYES_YELLOW).addCriterion("has_concrete_tiles", this.hasItem(ECBlockRegistry.CONCRETE_TILES.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.YELLOW_TILES_SLAB.get(), 6).patternLine("iii").key('i', ECBlockRegistry.YELLOW_TILES.get()).addCriterion("has_yellow_tiles",
            this.hasItem(ECBlockRegistry.YELLOW_TILES.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.YELLOW_TILES.get()).patternLine("i").patternLine("i").key('i', ECBlockRegistry.YELLOW_TILES_SLAB.get()).addCriterion("has_yellow_tiles_slab",
            this.hasItem(ECBlockRegistry.YELLOW_TILES_SLAB.get())).build(consumer, ECConstants.MODID + ":yellow_tiles_from_slabs");
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.YELLOW_TILES_STAIRS.get(), 4).key('#', ECBlockRegistry.YELLOW_TILES.get()).patternLine("#  ").patternLine("## ").patternLine("###").addCriterion(
            "has_yellow_tiles", this.hasItem(ECBlockRegistry.YELLOW_TILES.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.YELLOW_TILES_WALL.get(), 6).key('#', ECBlockRegistry.YELLOW_TILES.get()).patternLine("###").patternLine("###").addCriterion("has_yellow_tiles",
            this.hasItem(ECBlockRegistry.YELLOW_TILES.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.YELLOW_TILES_PRESSURE_PLATE.get()).key('#', ECBlockRegistry.YELLOW_TILES.get()).patternLine("##").addCriterion("has_yellow_tiles",
            this.hasItem(ECBlockRegistry.YELLOW_TILES.get())).build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.YELLOW_GREY_TILES.get(), 8).patternLine("iii").patternLine("idi").patternLine("iii").key('i', ECBlockRegistry.YELLOW_TILES.get()).key('d',
            Tags.Items.DYES_GRAY).addCriterion("has_yellow_tiles", this.hasItem(ECBlockRegistry.YELLOW_TILES.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.YELLOW_GREY_TILES_SLAB.get(), 6).patternLine("iii").key('i', ECBlockRegistry.YELLOW_GREY_TILES.get()).addCriterion("has_concrete_tiles",
            this.hasItem(ECBlockRegistry.YELLOW_GREY_TILES.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.YELLOW_GREY_TILES.get()).patternLine("i").patternLine("i").key('i', ECBlockRegistry.YELLOW_GREY_TILES_SLAB.get()).addCriterion("has_concrete_tiles_slab",
            this.hasItem(ECBlockRegistry.YELLOW_GREY_TILES_SLAB.get())).build(consumer, ECConstants.MODID + ":yellow_grey_tiles_from_slabs");
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.YELLOW_GREY_TILES_STAIRS.get(), 4).key('#', ECBlockRegistry.YELLOW_GREY_TILES.get()).patternLine("#  ").patternLine("## ").patternLine(
            "###").addCriterion("has_concrete_tiles", this.hasItem(ECBlockRegistry.YELLOW_GREY_TILES.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.YELLOW_GREY_TILES_WALL.get(), 6).key('#', ECBlockRegistry.YELLOW_GREY_TILES.get()).patternLine("###").patternLine("###").addCriterion(
            "has_concrete_tiles", this.hasItem(ECBlockRegistry.YELLOW_GREY_TILES.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ECBlockRegistry.YELLOW_GREY_TILES_PRESSURE_PLATE.get()).key('#', ECBlockRegistry.YELLOW_GREY_TILES.get()).patternLine("##").addCriterion("has_concrete_tiles",
            this.hasItem(ECBlockRegistry.YELLOW_GREY_TILES.get())).build(consumer);

    }
}
