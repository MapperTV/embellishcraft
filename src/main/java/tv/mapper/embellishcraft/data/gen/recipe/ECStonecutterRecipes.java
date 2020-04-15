package tv.mapper.embellishcraft.data.gen.recipe;

import java.util.Arrays;
import java.util.function.Consumer;

import net.minecraft.block.Blocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.IFinishedRecipe;
import net.minecraft.data.RecipeProvider;
import net.minecraft.data.SingleItemRecipeBuilder;
import net.minecraft.item.crafting.Ingredient;
import tv.mapper.embellishcraft.block.ECBlockRegistry;
import tv.mapper.embellishcraft.util.RockType;

public class ECStonecutterRecipes extends RecipeProvider
{
    public ECStonecutterRecipes(DataGenerator generatorIn)
    {
        super(generatorIn);
    }

    @Override
    protected void registerRecipes(Consumer<IFinishedRecipe> consumer)
    {
        for(int j = 0; j < Arrays.stream(RockType.values()).count(); j++)
        {
            SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(ECBlockRegistry.ROCK_BLOCKS.get(RockType.byId(j)).get()), ECBlockRegistry.ROCK_SLABS.get(RockType.byId(j)).get(), 2).addCriterion(
                "has_" + RockType.byId(j).getName(), this.hasItem(ECBlockRegistry.ROCK_BLOCKS.get(RockType.byId(j)).get())).build(consumer,
                    RockType.byId(j).getName() + "_slab_from_" + RockType.byId(j).getName() + "_stonecutting");
            SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(ECBlockRegistry.ROCK_BLOCKS.get(RockType.byId(j)).get()), ECBlockRegistry.ROCK_STAIRS.get(RockType.byId(j)).get()).addCriterion(
                "has_" + RockType.byId(j).getName(), this.hasItem(ECBlockRegistry.ROCK_BLOCKS.get(RockType.byId(j)).get())).build(consumer,
                    RockType.byId(j).getName() + "_stairs_from_" + RockType.byId(j).getName() + "_stonecutting");
            SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(ECBlockRegistry.ROCK_BLOCKS.get(RockType.byId(j)).get()), ECBlockRegistry.ROCK_WALLS.get(RockType.byId(j)).get()).addCriterion(
                "has_" + RockType.byId(j).getName(), this.hasItem(ECBlockRegistry.ROCK_BLOCKS.get(RockType.byId(j)).get())).build(consumer,
                    RockType.byId(j).getName() + "_wall_from_" + RockType.byId(j).getName() + "_stonecutting");
            SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(ECBlockRegistry.ROCK_BLOCKS.get(RockType.byId(j)).get()), ECBlockRegistry.ROCK_PRESSURE_PLATES.get(RockType.byId(j)).get(),
                2).addCriterion("has_" + RockType.byId(j).getName(), this.hasItem(ECBlockRegistry.ROCK_BLOCKS.get(RockType.byId(j)).get())).build(consumer,
                    RockType.byId(j).getName() + "_pressure_plate_from_" + RockType.byId(j).getName() + "_stonecutting");
            SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(ECBlockRegistry.ROCK_BLOCKS.get(RockType.byId(j)).get()), ECBlockRegistry.ROCK_BUTTONS.get(RockType.byId(j)).get(), 2).addCriterion(
                "has_" + RockType.byId(j).getName(), this.hasItem(ECBlockRegistry.ROCK_BLOCKS.get(RockType.byId(j)).get())).build(consumer,
                    RockType.byId(j).getName() + "_button_from_" + RockType.byId(j).getName() + "_stonecutting");
            SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(ECBlockRegistry.ROCK_BLOCKS.get(RockType.byId(j)).get()), ECBlockRegistry.ROCK_ORNAMENTS.get(RockType.byId(j)).get()).addCriterion(
                "has_" + RockType.byId(j).getName(), this.hasItem(ECBlockRegistry.ROCK_BLOCKS.get(RockType.byId(j)).get())).build(consumer,
                    RockType.byId(j).getName() + "_ornament_from_" + RockType.byId(j).getName() + "_stonecutting");

            SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(ECBlockRegistry.ROCK_COBBLESTONES.get(RockType.byId(j)).get()), ECBlockRegistry.ROCK_COBBLESTONE_SLABS.get(RockType.byId(j)).get(),
                2).addCriterion("has_" + RockType.byId(j).getName() + "_cobblestone", this.hasItem(ECBlockRegistry.ROCK_COBBLESTONES.get(RockType.byId(j)).get())).build(consumer,
                    RockType.byId(j).getName() + "_cobblestone_slab_from_" + RockType.byId(j).getName() + "_cobblestone_stonecutting");
            SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(ECBlockRegistry.ROCK_COBBLESTONES.get(RockType.byId(j)).get()),
                ECBlockRegistry.ROCK_COBBLESTONE_STAIRS.get(RockType.byId(j)).get()).addCriterion("has_" + RockType.byId(j).getName() + "_cobblestone",
                    this.hasItem(ECBlockRegistry.ROCK_COBBLESTONES.get(RockType.byId(j)).get())).build(consumer,
                        RockType.byId(j).getName() + "_cobblestone_stairs_from_" + RockType.byId(j).getName() + "_cobblestone_stonecutting");
            SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(ECBlockRegistry.ROCK_COBBLESTONES.get(RockType.byId(j)).get()),
                ECBlockRegistry.ROCK_COBBLESTONE_WALLS.get(RockType.byId(j)).get()).addCriterion("has_" + RockType.byId(j).getName() + "_cobblestone",
                    this.hasItem(ECBlockRegistry.ROCK_COBBLESTONES.get(RockType.byId(j)).get())).build(consumer,
                        RockType.byId(j).getName() + "_cobblestone_wall_from_" + RockType.byId(j).getName() + "_cobblestone_stonecutting");
            SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(ECBlockRegistry.ROCK_COBBLESTONES.get(RockType.byId(j)).get()),
                ECBlockRegistry.ROCK_COBBLESTONE_PRESSURE_PLATES.get(RockType.byId(j)).get(), 2).addCriterion("has_" + RockType.byId(j).getName() + "_cobblestone",
                    this.hasItem(ECBlockRegistry.ROCK_COBBLESTONES.get(RockType.byId(j)).get())).build(consumer,
                        RockType.byId(j).getName() + "_cobblestone_pressure_plate_from_" + RockType.byId(j).getName() + "_cobblestone_stonecutting");

            SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(ECBlockRegistry.SMOOTH_ROCK_BLOCKS.get(RockType.byId(j)).get()), ECBlockRegistry.SMOOTH_ROCK_SLABS.get(RockType.byId(j)).get(),
                2).addCriterion("has_smooth_" + RockType.byId(j).getName(), this.hasItem(ECBlockRegistry.SMOOTH_ROCK_BLOCKS.get(RockType.byId(j)).get())).build(consumer,
                    "smooth_" + RockType.byId(j).getName() + "_slab_from_smooth_" + RockType.byId(j).getName() + "_stonecutting");
            SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(ECBlockRegistry.SMOOTH_ROCK_BLOCKS.get(RockType.byId(j)).get()),
                ECBlockRegistry.SMOOTH_ROCK_STAIRS.get(RockType.byId(j)).get()).addCriterion("has_smooth_" + RockType.byId(j).getName(),
                    this.hasItem(ECBlockRegistry.SMOOTH_ROCK_BLOCKS.get(RockType.byId(j)).get())).build(consumer,
                        "smooth_" + RockType.byId(j).getName() + "_stairs_from_smooth_" + RockType.byId(j).getName() + "_stonecutting");
            SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(ECBlockRegistry.SMOOTH_ROCK_BLOCKS.get(RockType.byId(j)).get()),
                ECBlockRegistry.SMOOTH_ROCK_WALLS.get(RockType.byId(j)).get()).addCriterion("has_smooth_" + RockType.byId(j).getName(),
                    this.hasItem(ECBlockRegistry.SMOOTH_ROCK_BLOCKS.get(RockType.byId(j)).get())).build(consumer,
                        "smooth_" + RockType.byId(j).getName() + "_wall_from_smooth_" + RockType.byId(j).getName() + "_stonecutting");
            SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(ECBlockRegistry.SMOOTH_ROCK_BLOCKS.get(RockType.byId(j)).get()),
                ECBlockRegistry.SMOOTH_ROCK_PRESSURE_PLATES.get(RockType.byId(j)).get(), 2).addCriterion("has_smooth_" + RockType.byId(j).getName(),
                    this.hasItem(ECBlockRegistry.SMOOTH_ROCK_BLOCKS.get(RockType.byId(j)).get())).build(consumer,
                        "smooth_" + RockType.byId(j).getName() + "_pressure_plate_from_smooth_" + RockType.byId(j).getName() + "_stonecutting");
            SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(ECBlockRegistry.SMOOTH_ROCK_BLOCKS.get(RockType.byId(j)).get()),
                ECBlockRegistry.ROCK_ORNAMENTS.get(RockType.byId(j)).get()).addCriterion("has_smooth_" + RockType.byId(j).getName(),
                    this.hasItem(ECBlockRegistry.SMOOTH_ROCK_BLOCKS.get(RockType.byId(j)).get())).build(consumer,
                        RockType.byId(j).getName() + "_ornament_from_smooth_" + RockType.byId(j).getName() + "_stonecutting");

            SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(ECBlockRegistry.POLISHED_ROCK_BLOCKS.get(RockType.byId(j)).get()), ECBlockRegistry.POLISHED_ROCK_SLABS.get(RockType.byId(j)).get(),
                2).addCriterion("has_polished_" + RockType.byId(j).getName(), this.hasItem(ECBlockRegistry.POLISHED_ROCK_BLOCKS.get(RockType.byId(j)).get())).build(consumer,
                    "polished_" + RockType.byId(j).getName() + "_slab_from_polished_" + RockType.byId(j).getName() + "_stonecutting");
            SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(ECBlockRegistry.POLISHED_ROCK_BLOCKS.get(RockType.byId(j)).get()),
                ECBlockRegistry.POLISHED_ROCK_STAIRS.get(RockType.byId(j)).get()).addCriterion("has_polished_" + RockType.byId(j).getName(),
                    this.hasItem(ECBlockRegistry.POLISHED_ROCK_BLOCKS.get(RockType.byId(j)).get())).build(consumer,
                        "polished_" + RockType.byId(j).getName() + "_stairs_from_polished_" + RockType.byId(j).getName() + "_stonecutting");
            SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(ECBlockRegistry.POLISHED_ROCK_BLOCKS.get(RockType.byId(j)).get()),
                ECBlockRegistry.POLISHED_ROCK_WALLS.get(RockType.byId(j)).get()).addCriterion("has_polished_" + RockType.byId(j).getName(),
                    this.hasItem(ECBlockRegistry.POLISHED_ROCK_BLOCKS.get(RockType.byId(j)).get())).build(consumer,
                        "polished_" + RockType.byId(j).getName() + "_wall_from_polished_" + RockType.byId(j).getName() + "_stonecutting");
            SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(ECBlockRegistry.POLISHED_ROCK_BLOCKS.get(RockType.byId(j)).get()),
                ECBlockRegistry.POLISHED_ROCK_PRESSURE_PLATES.get(RockType.byId(j)).get()).addCriterion("has_polished_" + RockType.byId(j).getName(),
                    this.hasItem(ECBlockRegistry.POLISHED_ROCK_BLOCKS.get(RockType.byId(j)).get())).build(consumer,
                        "polished_" + RockType.byId(j).getName() + "_pressure_plate_from_polished_" + RockType.byId(j).getName() + "_stonecutting");
            SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(ECBlockRegistry.POLISHED_ROCK_BLOCKS.get(RockType.byId(j)).get()), ECBlockRegistry.ROCK_ORNAMENTS.get(RockType.byId(j)).get(),
                2).addCriterion("has_polished_" + RockType.byId(j).getName(), this.hasItem(ECBlockRegistry.POLISHED_ROCK_BLOCKS.get(RockType.byId(j)).get())).build(consumer,
                    RockType.byId(j).getName() + "_ornament_from_polished_" + RockType.byId(j).getName() + "_stonecutting");

            SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(ECBlockRegistry.ROCK_PAVINGS.get(RockType.byId(j)).get()), ECBlockRegistry.ROCK_PAVING_SLABS.get(RockType.byId(j)).get(),
                2).addCriterion("has_" + RockType.byId(j).getName() + "_paving", this.hasItem(ECBlockRegistry.ROCK_PAVINGS.get(RockType.byId(j)).get())).build(consumer,
                    RockType.byId(j).getName() + "_paving_slab_from_" + RockType.byId(j).getName() + "_paving_stonecutting");
            SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(ECBlockRegistry.ROCK_PAVINGS.get(RockType.byId(j)).get()),
                ECBlockRegistry.ROCK_PAVING_STAIRS.get(RockType.byId(j)).get()).addCriterion("has_" + RockType.byId(j).getName() + "_paving",
                    this.hasItem(ECBlockRegistry.ROCK_PAVINGS.get(RockType.byId(j)).get())).build(consumer,
                        RockType.byId(j).getName() + "_paving_stairs_from_" + RockType.byId(j).getName() + "_paving_stonecutting");
            SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(ECBlockRegistry.ROCK_PAVINGS.get(RockType.byId(j)).get()),
                ECBlockRegistry.ROCK_PAVING_WALLS.get(RockType.byId(j)).get()).addCriterion("has_" + RockType.byId(j).getName() + "_paving",
                    this.hasItem(ECBlockRegistry.ROCK_PAVINGS.get(RockType.byId(j)).get())).build(consumer,
                        RockType.byId(j).getName() + "_paving_wall_from_" + RockType.byId(j).getName() + "_paving_stonecutting");
            SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(ECBlockRegistry.ROCK_PAVINGS.get(RockType.byId(j)).get()), ECBlockRegistry.ROCK_PAVING_PRESSURE_PLATES.get(RockType.byId(j)).get(),
                2).addCriterion("has_" + RockType.byId(j).getName() + "_paving", this.hasItem(ECBlockRegistry.ROCK_PAVINGS.get(RockType.byId(j)).get())).build(consumer,
                    RockType.byId(j).getName() + "_paving_pressure_plate_from_" + RockType.byId(j).getName() + "_paving_stonecutting");

            SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(ECBlockRegistry.ROCK_TILES.get(RockType.byId(j)).get()), ECBlockRegistry.ROCK_TILES_SLABS.get(RockType.byId(j)).get(),
                2).addCriterion("has_" + RockType.byId(j).getName() + "_tiles", this.hasItem(ECBlockRegistry.ROCK_TILES.get(RockType.byId(j)).get())).build(consumer,
                    RockType.byId(j).getName() + "_tiles_slab_from_" + RockType.byId(j).getName() + "_tiles_stonecutting");
            SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(ECBlockRegistry.ROCK_TILES.get(RockType.byId(j)).get()), ECBlockRegistry.ROCK_TILES_STAIRS.get(RockType.byId(j)).get()).addCriterion(
                "has_" + RockType.byId(j).getName() + "_tiles", this.hasItem(ECBlockRegistry.ROCK_TILES.get(RockType.byId(j)).get())).build(consumer,
                    RockType.byId(j).getName() + "_tiles_stairs_from_" + RockType.byId(j).getName() + "_tiles_stonecutting");
            SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(ECBlockRegistry.ROCK_TILES.get(RockType.byId(j)).get()), ECBlockRegistry.ROCK_TILES_WALLS.get(RockType.byId(j)).get()).addCriterion(
                "has_" + RockType.byId(j).getName() + "_tiles", this.hasItem(ECBlockRegistry.ROCK_TILES.get(RockType.byId(j)).get())).build(consumer,
                    RockType.byId(j).getName() + "_tiles_wall_from_" + RockType.byId(j).getName() + "_tiles_stonecutting");
            SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(ECBlockRegistry.ROCK_TILES.get(RockType.byId(j)).get()), ECBlockRegistry.ROCK_TILES_PRESSURE_PLATES.get(RockType.byId(j)).get(),
                2).addCriterion("has_" + RockType.byId(j).getName() + "_tiles", this.hasItem(ECBlockRegistry.ROCK_TILES.get(RockType.byId(j)).get())).build(consumer,
                    RockType.byId(j).getName() + "_tiles_pressure_plate_from_" + RockType.byId(j).getName() + "_tiles_stonecutting");

            SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(ECBlockRegistry.ROCK_BRICKS.get(RockType.byId(j)).get()), ECBlockRegistry.ROCK_BRICKS_SLABS.get(RockType.byId(j)).get(),
                2).addCriterion("has_" + RockType.byId(j).getName() + "_bricks", this.hasItem(ECBlockRegistry.ROCK_BRICKS.get(RockType.byId(j)).get())).build(consumer,
                    RockType.byId(j).getName() + "_bricks_slab_from_" + RockType.byId(j).getName() + "_bricks_stonecutting");
            SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(ECBlockRegistry.ROCK_BRICKS.get(RockType.byId(j)).get()),
                ECBlockRegistry.ROCK_BRICKS_STAIRS.get(RockType.byId(j)).get()).addCriterion("has_" + RockType.byId(j).getName() + "_bricks",
                    this.hasItem(ECBlockRegistry.ROCK_BRICKS.get(RockType.byId(j)).get())).build(consumer,
                        RockType.byId(j).getName() + "_bricks_stairs_from_" + RockType.byId(j).getName() + "_bricks_stonecutting");
            SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(ECBlockRegistry.ROCK_BRICKS.get(RockType.byId(j)).get()), ECBlockRegistry.ROCK_BRICKS_WALLS.get(RockType.byId(j)).get()).addCriterion(
                "has_" + RockType.byId(j).getName() + "_bricks", this.hasItem(ECBlockRegistry.ROCK_BRICKS.get(RockType.byId(j)).get())).build(consumer,
                    RockType.byId(j).getName() + "_bricks_wall_from_" + RockType.byId(j).getName() + "_bricks_stonecutting");
            SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(ECBlockRegistry.ROCK_BRICKS.get(RockType.byId(j)).get()), ECBlockRegistry.ROCK_BRICKS_PRESSURE_PLATES.get(RockType.byId(j)).get(),
                2).addCriterion("has_" + RockType.byId(j).getName() + "_bricks", this.hasItem(ECBlockRegistry.ROCK_BRICKS.get(RockType.byId(j)).get())).build(consumer,
                    RockType.byId(j).getName() + "_bricks_pressure_plate_from_" + RockType.byId(j).getName() + "_bricks_stonecutting");

            SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(ECBlockRegistry.ROCK_LARGE_BRICKS.get(RockType.byId(j)).get()), ECBlockRegistry.ROCK_LARGE_BRICKS_SLABS.get(RockType.byId(j)).get(),
                2).addCriterion("has_" + RockType.byId(j).getName() + "_large_bricks", this.hasItem(ECBlockRegistry.ROCK_LARGE_BRICKS.get(RockType.byId(j)).get())).build(consumer,
                    RockType.byId(j).getName() + "_large_bricks_slab_from_" + RockType.byId(j).getName() + "_large_bricks_stonecutting");
            SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(ECBlockRegistry.ROCK_LARGE_BRICKS.get(RockType.byId(j)).get()),
                ECBlockRegistry.ROCK_LARGE_BRICKS_STAIRS.get(RockType.byId(j)).get()).addCriterion("has_" + RockType.byId(j).getName() + "_large_bricks",
                    this.hasItem(ECBlockRegistry.ROCK_LARGE_BRICKS.get(RockType.byId(j)).get())).build(consumer,
                        RockType.byId(j).getName() + "_large_bricks_stairs_from_" + RockType.byId(j).getName() + "_large_bricks_stonecutting");
            SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(ECBlockRegistry.ROCK_LARGE_BRICKS.get(RockType.byId(j)).get()),
                ECBlockRegistry.ROCK_LARGE_BRICKS_WALLS.get(RockType.byId(j)).get()).addCriterion("has_" + RockType.byId(j).getName() + "_large_bricks",
                    this.hasItem(ECBlockRegistry.ROCK_LARGE_BRICKS.get(RockType.byId(j)).get())).build(consumer,
                        RockType.byId(j).getName() + "_large_bricks_wall_from_" + RockType.byId(j).getName() + "_large_bricks_stonecutting");
            SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(ECBlockRegistry.ROCK_LARGE_BRICKS.get(RockType.byId(j)).get()),
                ECBlockRegistry.ROCK_LARGE_BRICKS_PRESSURE_PLATES.get(RockType.byId(j)).get(), 2).addCriterion("has_" + RockType.byId(j).getName() + "_large_bricks",
                    this.hasItem(ECBlockRegistry.ROCK_LARGE_BRICKS.get(RockType.byId(j)).get())).build(consumer,
                        RockType.byId(j).getName() + "_large_bricks_pressure_plate_from_" + RockType.byId(j).getName() + "_large_bricks_stonecutting");

            SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(ECBlockRegistry.ROCK_ORNAMENTS.get(RockType.byId(j)).get()),
                ECBlockRegistry.ROCK_ORNAMENT_PRESSURE_PLATES.get(RockType.byId(j)).get(), 2).addCriterion("has_" + RockType.byId(j).getName() + "_ornament",
                    this.hasItem(ECBlockRegistry.ROCK_ORNAMENTS.get(RockType.byId(j)).get())).build(consumer,
                        RockType.byId(j).getName() + "_ornament_pressure_plate_from_" + RockType.byId(j).getName() + "_stonecutting");
        }

        // Andesite
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(Blocks.ANDESITE), ECBlockRegistry.ANDESITE_BUTTON.get(), 2).addCriterion("has_andesite", this.hasItem(Blocks.ANDESITE)).build(consumer,
            "andesite_button_from_andesite_stonecutting");

        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(ECBlockRegistry.SMOOTH_ANDESITE.get()), ECBlockRegistry.SMOOTH_ANDESITE_SLAB.get(), 2).addCriterion("has_smooth_andesite",
            this.hasItem(ECBlockRegistry.SMOOTH_ANDESITE.get())).build(consumer, "smooth_andesite_slab_from_smooth_andesite_stonecutting");
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(ECBlockRegistry.SMOOTH_ANDESITE.get()), ECBlockRegistry.SMOOTH_ANDESITE_STAIRS.get()).addCriterion("has_smooth_andesite",
            this.hasItem(ECBlockRegistry.SMOOTH_ANDESITE.get())).build(consumer, "smooth_andesite_stairs_from_smooth_andesite_stonecutting");
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(ECBlockRegistry.SMOOTH_ANDESITE.get()), ECBlockRegistry.SMOOTH_ANDESITE_WALL.get()).addCriterion("has_smooth_andesite",
            this.hasItem(ECBlockRegistry.SMOOTH_ANDESITE.get())).build(consumer, "smooth_andesite_wall_from_smooth_andesite_stonecutting");
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(ECBlockRegistry.SMOOTH_ANDESITE.get()), ECBlockRegistry.SMOOTH_ANDESITE_PRESSURE_PLATE.get(), 2).addCriterion("has_smooth_andesite",
            this.hasItem(ECBlockRegistry.SMOOTH_ANDESITE.get())).build(consumer, "smooth_andesite_pressure_plate_from_smooth_andesite_stonecutting");

        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(ECBlockRegistry.ANDESITE_PAVING.get()), ECBlockRegistry.ANDESITE_PAVING_SLAB.get(), 2).addCriterion("has_andesite_paving",
            this.hasItem(ECBlockRegistry.ANDESITE_PAVING.get())).build(consumer, "andesite_paving_slab_from_andesite_paving_stonecutting");
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(ECBlockRegistry.ANDESITE_PAVING.get()), ECBlockRegistry.ANDESITE_PAVING_STAIRS.get()).addCriterion("has_andesite_paving",
            this.hasItem(ECBlockRegistry.ANDESITE_PAVING.get())).build(consumer, "andesite_paving_stairs_from_andesite_paving_stonecutting");
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(ECBlockRegistry.ANDESITE_PAVING.get()), ECBlockRegistry.ANDESITE_PAVING_WALL.get()).addCriterion("has_andesite_paving",
            this.hasItem(ECBlockRegistry.ANDESITE_PAVING.get())).build(consumer, "andesite_paving_wall_from_andesite_paving_stonecutting");
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(ECBlockRegistry.ANDESITE_PAVING.get()), ECBlockRegistry.ANDESITE_PAVING_PRESSURE_PLATE.get(), 2).addCriterion("has_andesite_paving",
            this.hasItem(ECBlockRegistry.ANDESITE_PAVING.get())).build(consumer, "andesite_paving_pressure_plate_from_andesite_paving_stonecutting");

        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(ECBlockRegistry.ANDESITE_TILES.get()), ECBlockRegistry.ANDESITE_TILES_SLAB.get(), 2).addCriterion("has_andesite_tiles",
            this.hasItem(ECBlockRegistry.ANDESITE_TILES.get())).build(consumer, "andesite_tiles_slab_from_andesite_tiles_stonecutting");
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(ECBlockRegistry.ANDESITE_TILES.get()), ECBlockRegistry.ANDESITE_TILES_STAIRS.get()).addCriterion("has_andesite_tiles",
            this.hasItem(ECBlockRegistry.ANDESITE_TILES.get())).build(consumer, "andesite_tiles_stairs_from_andesite_tiles_stonecutting");
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(ECBlockRegistry.ANDESITE_TILES.get()), ECBlockRegistry.ANDESITE_TILES_WALL.get()).addCriterion("has_andesite_tiles",
            this.hasItem(ECBlockRegistry.ANDESITE_TILES.get())).build(consumer, "andesite_tiles_wall_from_andesite_tiles_stonecutting");
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(ECBlockRegistry.ANDESITE_TILES.get()), ECBlockRegistry.ANDESITE_TILES_PRESSURE_PLATE.get(), 2).addCriterion("has_andesite_tiles",
            this.hasItem(ECBlockRegistry.ANDESITE_TILES.get())).build(consumer, "andesite_tiles_pressure_plate_from_andesite_tiles_stonecutting");

        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(ECBlockRegistry.ANDESITE_BRICKS.get()), ECBlockRegistry.ANDESITE_BRICKS_SLAB.get(), 2).addCriterion("has_andesite_bricks",
            this.hasItem(ECBlockRegistry.ANDESITE_BRICKS.get())).build(consumer, "andesite_bricks_slab_from_andesite_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(ECBlockRegistry.ANDESITE_BRICKS.get()), ECBlockRegistry.ANDESITE_BRICKS_STAIRS.get()).addCriterion("has_andesite_bricks",
            this.hasItem(ECBlockRegistry.ANDESITE_BRICKS.get())).build(consumer, "andesite_bricks_stairs_from_andesite_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(ECBlockRegistry.ANDESITE_BRICKS.get()), ECBlockRegistry.ANDESITE_BRICKS_WALL.get()).addCriterion("has_andesite_bricks",
            this.hasItem(ECBlockRegistry.ANDESITE_BRICKS.get())).build(consumer, "andesite_bricks_wall_from_andesite_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(ECBlockRegistry.ANDESITE_BRICKS.get()), ECBlockRegistry.ANDESITE_BRICKS_PRESSURE_PLATE.get(), 2).addCriterion("has_andesite_bricks",
            this.hasItem(ECBlockRegistry.ANDESITE_BRICKS.get())).build(consumer, "andesite_bricks_pressure_plate_from_andesite_bricks_stonecutting");

        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(ECBlockRegistry.ANDESITE_LARGE_BRICKS.get()), ECBlockRegistry.ANDESITE_LARGE_BRICKS_SLAB.get(), 2).addCriterion(
            "has_andesite_large_bricks", this.hasItem(ECBlockRegistry.ANDESITE_LARGE_BRICKS.get())).build(consumer, "andesite_large_bricks_slab_from_andesite_large_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(ECBlockRegistry.ANDESITE_LARGE_BRICKS.get()), ECBlockRegistry.ANDESITE_LARGE_BRICKS_STAIRS.get()).addCriterion(
            "has_andesite_large_bricks", this.hasItem(ECBlockRegistry.ANDESITE_LARGE_BRICKS.get())).build(consumer, "andesite_large_bricks_stairs_from_andesite_large_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(ECBlockRegistry.ANDESITE_LARGE_BRICKS.get()), ECBlockRegistry.ANDESITE_LARGE_BRICKS_WALL.get()).addCriterion("has_andesite_large_bricks",
            this.hasItem(ECBlockRegistry.ANDESITE_LARGE_BRICKS.get())).build(consumer, "andesite_large_bricks_wall_from_andesite_large_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(ECBlockRegistry.ANDESITE_LARGE_BRICKS.get()), ECBlockRegistry.ANDESITE_LARGE_BRICKS_PRESSURE_PLATE.get(), 2).addCriterion(
            "has_andesite_large_bricks", this.hasItem(ECBlockRegistry.ANDESITE_LARGE_BRICKS.get())).build(consumer, "andesite_large_bricks_pressure_plate_from_andesite_large_bricks_stonecutting");

        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(Blocks.ANDESITE), ECBlockRegistry.ANDESITE_ORNAMENT.get()).addCriterion("has_andesite", this.hasItem(Blocks.ANDESITE)).build(consumer,
            "andesite_ornament_from_andesite_stonecutting");
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(ECBlockRegistry.ANDESITE_ORNAMENT.get()), ECBlockRegistry.ANDESITE_ORNAMENT_PRESSURE_PLATE.get(), 2).addCriterion("has_andesite_ornament",
            this.hasItem(ECBlockRegistry.ANDESITE_ORNAMENT.get())).build(consumer, "andesite_ornament_pressure_place_from_andesite_ornament_stonecutting");

        // Diorite
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(Blocks.DIORITE), ECBlockRegistry.DIORITE_BUTTON.get(), 2).addCriterion("has_diorite", this.hasItem(Blocks.DIORITE)).build(consumer,
            "diorite_button_from_diorite_stonecutting");

        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(ECBlockRegistry.SMOOTH_DIORITE.get()), ECBlockRegistry.SMOOTH_DIORITE_SLAB.get(), 2).addCriterion("has_smooth_diorite",
            this.hasItem(ECBlockRegistry.SMOOTH_DIORITE.get())).build(consumer, "smooth_diorite_slab_from_smooth_diorite_stonecutting");
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(ECBlockRegistry.SMOOTH_DIORITE.get()), ECBlockRegistry.SMOOTH_DIORITE_STAIRS.get()).addCriterion("has_smooth_diorite",
            this.hasItem(ECBlockRegistry.SMOOTH_DIORITE.get())).build(consumer, "smooth_diorite_stairs_from_smooth_diorite_stonecutting");
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(ECBlockRegistry.SMOOTH_DIORITE.get()), ECBlockRegistry.SMOOTH_DIORITE_WALL.get()).addCriterion("has_smooth_diorite",
            this.hasItem(ECBlockRegistry.SMOOTH_DIORITE.get())).build(consumer, "smooth_diorite_wall_from_smooth_diorite_stonecutting");
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(ECBlockRegistry.SMOOTH_DIORITE.get()), ECBlockRegistry.SMOOTH_DIORITE_PRESSURE_PLATE.get(), 2).addCriterion("has_smooth_diorite",
            this.hasItem(ECBlockRegistry.SMOOTH_DIORITE.get())).build(consumer, "smooth_diorite_pressure_plate_from_smooth_diorite_stonecutting");

        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(ECBlockRegistry.DIORITE_PAVING.get()), ECBlockRegistry.DIORITE_PAVING_SLAB.get(), 2).addCriterion("has_diorite_paving",
            this.hasItem(ECBlockRegistry.DIORITE_PAVING.get())).build(consumer, "diorite_paving_slab_from_diorite_paving_stonecutting");
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(ECBlockRegistry.DIORITE_PAVING.get()), ECBlockRegistry.DIORITE_PAVING_STAIRS.get()).addCriterion("has_diorite_paving",
            this.hasItem(ECBlockRegistry.DIORITE_PAVING.get())).build(consumer, "diorite_paving_stairs_from_diorite_paving_stonecutting");
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(ECBlockRegistry.DIORITE_PAVING.get()), ECBlockRegistry.DIORITE_PAVING_WALL.get()).addCriterion("has_diorite_paving",
            this.hasItem(ECBlockRegistry.DIORITE_PAVING.get())).build(consumer, "diorite_paving_wall_from_diorite_paving_stonecutting");
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(ECBlockRegistry.DIORITE_PAVING.get()), ECBlockRegistry.DIORITE_PAVING_PRESSURE_PLATE.get(), 2).addCriterion("has_diorite_paving",
            this.hasItem(ECBlockRegistry.DIORITE_PAVING.get())).build(consumer, "diorite_paving_pressure_plate_from_diorite_paving_stonecutting");

        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(ECBlockRegistry.DIORITE_TILES.get()), ECBlockRegistry.DIORITE_TILES_SLAB.get(), 2).addCriterion("has_diorite_tiles",
            this.hasItem(ECBlockRegistry.DIORITE_TILES.get())).build(consumer, "diorite_tiles_slab_from_diorite_tiles_stonecutting");
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(ECBlockRegistry.DIORITE_TILES.get()), ECBlockRegistry.DIORITE_TILES_STAIRS.get()).addCriterion("has_diorite_tiles",
            this.hasItem(ECBlockRegistry.DIORITE_TILES.get())).build(consumer, "diorite_tiles_stairs_from_diorite_tiles_stonecutting");
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(ECBlockRegistry.DIORITE_TILES.get()), ECBlockRegistry.DIORITE_TILES_WALL.get()).addCriterion("has_diorite_tiles",
            this.hasItem(ECBlockRegistry.DIORITE_TILES.get())).build(consumer, "diorite_tiles_wall_from_diorite_tiles_stonecutting");
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(ECBlockRegistry.DIORITE_TILES.get()), ECBlockRegistry.DIORITE_TILES_PRESSURE_PLATE.get(), 2).addCriterion("has_diorite_tiles",
            this.hasItem(ECBlockRegistry.DIORITE_TILES.get())).build(consumer, "diorite_tiles_pressure_plate_from_diorite_tiles_stonecutting");

        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(ECBlockRegistry.DIORITE_BRICKS.get()), ECBlockRegistry.DIORITE_BRICKS_SLAB.get(), 2).addCriterion("has_diorite_bricks",
            this.hasItem(ECBlockRegistry.DIORITE_BRICKS.get())).build(consumer, "diorite_bricks_slab_from_diorite_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(ECBlockRegistry.DIORITE_BRICKS.get()), ECBlockRegistry.DIORITE_BRICKS_STAIRS.get()).addCriterion("has_diorite_bricks",
            this.hasItem(ECBlockRegistry.DIORITE_BRICKS.get())).build(consumer, "diorite_bricks_stairs_from_diorite_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(ECBlockRegistry.DIORITE_BRICKS.get()), ECBlockRegistry.DIORITE_BRICKS_WALL.get()).addCriterion("has_diorite_bricks",
            this.hasItem(ECBlockRegistry.DIORITE_BRICKS.get())).build(consumer, "diorite_bricks_wall_from_diorite_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(ECBlockRegistry.DIORITE_BRICKS.get()), ECBlockRegistry.DIORITE_BRICKS_PRESSURE_PLATE.get(), 2).addCriterion("has_diorite_bricks",
            this.hasItem(ECBlockRegistry.DIORITE_BRICKS.get())).build(consumer, "diorite_bricks_pressure_plate_from_diorite_bricks_stonecutting");

        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(ECBlockRegistry.DIORITE_LARGE_BRICKS.get()), ECBlockRegistry.DIORITE_LARGE_BRICKS_SLAB.get(), 2).addCriterion("has_diorite_large_bricks",
            this.hasItem(ECBlockRegistry.DIORITE_LARGE_BRICKS.get())).build(consumer, "diorite_large_bricks_slab_from_diorite_large_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(ECBlockRegistry.DIORITE_LARGE_BRICKS.get()), ECBlockRegistry.DIORITE_LARGE_BRICKS_STAIRS.get()).addCriterion("has_diorite_large_bricks",
            this.hasItem(ECBlockRegistry.DIORITE_LARGE_BRICKS.get())).build(consumer, "diorite_large_bricks_stairs_from_diorite_large_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(ECBlockRegistry.DIORITE_LARGE_BRICKS.get()), ECBlockRegistry.DIORITE_LARGE_BRICKS_WALL.get()).addCriterion("has_diorite_large_bricks",
            this.hasItem(ECBlockRegistry.DIORITE_LARGE_BRICKS.get())).build(consumer, "diorite_large_bricks_wall_from_diorite_large_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(ECBlockRegistry.DIORITE_LARGE_BRICKS.get()), ECBlockRegistry.DIORITE_LARGE_BRICKS_PRESSURE_PLATE.get(), 2).addCriterion(
            "has_diorite_large_bricks", this.hasItem(ECBlockRegistry.DIORITE_LARGE_BRICKS.get())).build(consumer, "diorite_large_bricks_pressure_plate_from_diorite_large_bricks_stonecutting");

        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(Blocks.DIORITE), ECBlockRegistry.DIORITE_ORNAMENT.get()).addCriterion("has_diorite", this.hasItem(Blocks.DIORITE)).build(consumer,
            "diorite_ornament_from_diorite_stonecutting");
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(ECBlockRegistry.DIORITE_ORNAMENT.get()), ECBlockRegistry.DIORITE_ORNAMENT_PRESSURE_PLATE.get(), 2).addCriterion("has_diorite_ornament",
            this.hasItem(ECBlockRegistry.DIORITE_ORNAMENT.get())).build(consumer, "diorite_ornament_pressure_place_from_diorite_ornament_stonecutting");

        // Andesite
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(Blocks.GRANITE), ECBlockRegistry.GRANITE_BUTTON.get(), 2).addCriterion("has_granite", this.hasItem(Blocks.GRANITE)).build(consumer,
            "granite_button_from_granite_stonecutting");

        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(ECBlockRegistry.SMOOTH_GRANITE.get()), ECBlockRegistry.SMOOTH_GRANITE_SLAB.get(), 2).addCriterion("has_smooth_granite",
            this.hasItem(ECBlockRegistry.SMOOTH_GRANITE.get())).build(consumer, "smooth_granite_slab_from_smooth_granite_stonecutting");
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(ECBlockRegistry.SMOOTH_GRANITE.get()), ECBlockRegistry.SMOOTH_GRANITE_STAIRS.get()).addCriterion("has_smooth_granite",
            this.hasItem(ECBlockRegistry.SMOOTH_GRANITE.get())).build(consumer, "smooth_granite_stairs_from_smooth_granite_stonecutting");
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(ECBlockRegistry.SMOOTH_GRANITE.get()), ECBlockRegistry.SMOOTH_GRANITE_WALL.get()).addCriterion("has_smooth_granite",
            this.hasItem(ECBlockRegistry.SMOOTH_GRANITE.get())).build(consumer, "smooth_granite_wall_from_smooth_granite_stonecutting");
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(ECBlockRegistry.SMOOTH_GRANITE.get()), ECBlockRegistry.SMOOTH_GRANITE_PRESSURE_PLATE.get(), 2).addCriterion("has_smooth_granite",
            this.hasItem(ECBlockRegistry.SMOOTH_GRANITE.get())).build(consumer, "smooth_granite_pressure_plate_from_smooth_granite_stonecutting");

        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(ECBlockRegistry.GRANITE_PAVING.get()), ECBlockRegistry.GRANITE_PAVING_SLAB.get(), 2).addCriterion("has_granite_paving",
            this.hasItem(ECBlockRegistry.GRANITE_PAVING.get())).build(consumer, "granite_paving_slab_from_granite_paving_stonecutting");
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(ECBlockRegistry.GRANITE_PAVING.get()), ECBlockRegistry.GRANITE_PAVING_STAIRS.get()).addCriterion("has_granite_paving",
            this.hasItem(ECBlockRegistry.GRANITE_PAVING.get())).build(consumer, "granite_paving_stairs_from_granite_paving_stonecutting");
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(ECBlockRegistry.GRANITE_PAVING.get()), ECBlockRegistry.GRANITE_PAVING_WALL.get()).addCriterion("has_granite_paving",
            this.hasItem(ECBlockRegistry.GRANITE_PAVING.get())).build(consumer, "granite_paving_wall_from_granite_paving_stonecutting");
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(ECBlockRegistry.GRANITE_PAVING.get()), ECBlockRegistry.GRANITE_PAVING_PRESSURE_PLATE.get(), 2).addCriterion("has_granite_paving",
            this.hasItem(ECBlockRegistry.GRANITE_PAVING.get())).build(consumer, "granite_paving_pressure_plate_from_granite_paving_stonecutting");

        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(ECBlockRegistry.GRANITE_TILES.get()), ECBlockRegistry.GRANITE_TILES_SLAB.get(), 2).addCriterion("has_granite_tiles",
            this.hasItem(ECBlockRegistry.GRANITE_TILES.get())).build(consumer, "granite_tiles_slab_from_granite_tiles_stonecutting");
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(ECBlockRegistry.GRANITE_TILES.get()), ECBlockRegistry.GRANITE_TILES_STAIRS.get()).addCriterion("has_granite_tiles",
            this.hasItem(ECBlockRegistry.GRANITE_TILES.get())).build(consumer, "granite_tiles_stairs_from_granite_tiles_stonecutting");
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(ECBlockRegistry.GRANITE_TILES.get()), ECBlockRegistry.GRANITE_TILES_WALL.get()).addCriterion("has_granite_tiles",
            this.hasItem(ECBlockRegistry.GRANITE_TILES.get())).build(consumer, "granite_tiles_wall_from_granite_tiles_stonecutting");
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(ECBlockRegistry.GRANITE_TILES.get()), ECBlockRegistry.GRANITE_TILES_PRESSURE_PLATE.get(), 2).addCriterion("has_granite_tiles",
            this.hasItem(ECBlockRegistry.GRANITE_TILES.get())).build(consumer, "granite_tiles_pressure_plate_from_granite_tiles_stonecutting");

        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(ECBlockRegistry.GRANITE_BRICKS.get()), ECBlockRegistry.GRANITE_BRICKS_SLAB.get(), 2).addCriterion("has_granite_bricks",
            this.hasItem(ECBlockRegistry.GRANITE_BRICKS.get())).build(consumer, "granite_bricks_slab_from_granite_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(ECBlockRegistry.GRANITE_BRICKS.get()), ECBlockRegistry.GRANITE_BRICKS_STAIRS.get()).addCriterion("has_granite_bricks",
            this.hasItem(ECBlockRegistry.GRANITE_BRICKS.get())).build(consumer, "granite_bricks_stairs_from_granite_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(ECBlockRegistry.GRANITE_BRICKS.get()), ECBlockRegistry.GRANITE_BRICKS_WALL.get()).addCriterion("has_granite_bricks",
            this.hasItem(ECBlockRegistry.GRANITE_BRICKS.get())).build(consumer, "granite_bricks_wall_from_granite_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(ECBlockRegistry.GRANITE_BRICKS.get()), ECBlockRegistry.GRANITE_BRICKS_PRESSURE_PLATE.get(), 2).addCriterion("has_granite_bricks",
            this.hasItem(ECBlockRegistry.GRANITE_BRICKS.get())).build(consumer, "granite_bricks_pressure_plate_from_granite_bricks_stonecutting");

        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(ECBlockRegistry.GRANITE_LARGE_BRICKS.get()), ECBlockRegistry.GRANITE_LARGE_BRICKS_SLAB.get(), 2).addCriterion("has_granite_large_bricks",
            this.hasItem(ECBlockRegistry.GRANITE_LARGE_BRICKS.get())).build(consumer, "granite_large_bricks_slab_from_granite_large_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(ECBlockRegistry.GRANITE_LARGE_BRICKS.get()), ECBlockRegistry.GRANITE_LARGE_BRICKS_STAIRS.get()).addCriterion("has_granite_large_bricks",
            this.hasItem(ECBlockRegistry.GRANITE_LARGE_BRICKS.get())).build(consumer, "granite_large_bricks_stairs_from_granite_large_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(ECBlockRegistry.GRANITE_LARGE_BRICKS.get()), ECBlockRegistry.GRANITE_LARGE_BRICKS_WALL.get()).addCriterion("has_granite_large_bricks",
            this.hasItem(ECBlockRegistry.GRANITE_LARGE_BRICKS.get())).build(consumer, "granite_large_bricks_wall_from_granite_large_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(ECBlockRegistry.GRANITE_LARGE_BRICKS.get()), ECBlockRegistry.GRANITE_LARGE_BRICKS_PRESSURE_PLATE.get(), 2).addCriterion(
            "has_granite_large_bricks", this.hasItem(ECBlockRegistry.GRANITE_LARGE_BRICKS.get())).build(consumer, "granite_large_bricks_pressure_plate_from_granite_large_bricks_stonecutting");

        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(Blocks.GRANITE), ECBlockRegistry.GRANITE_ORNAMENT.get()).addCriterion("has_granite", this.hasItem(Blocks.GRANITE)).build(consumer,
            "granite_ornament_from_granite_stonecutting");
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(ECBlockRegistry.GRANITE_ORNAMENT.get()), ECBlockRegistry.GRANITE_ORNAMENT_PRESSURE_PLATE.get(), 2).addCriterion("has_granite_ornament",
            this.hasItem(ECBlockRegistry.GRANITE_ORNAMENT.get())).build(consumer, "granite_ornament_pressure_place_from_granite_ornament_stonecutting");

        // Sandstone
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(Blocks.SANDSTONE), ECBlockRegistry.SANDSTONE_BUTTON.get(), 2).addCriterion("has_sandstone", this.hasItem(Blocks.SANDSTONE)).build(
            consumer, "sandstone_button_from_sandstone_stonecutting");

        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(Blocks.SMOOTH_SANDSTONE), ECBlockRegistry.SMOOTH_SANDSTONE_WALL.get()).addCriterion("has_smooth_sandstone",
            this.hasItem(Blocks.SMOOTH_SANDSTONE)).build(consumer, "smooth_sandstone_wall_from_smooth_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(Blocks.SMOOTH_SANDSTONE), ECBlockRegistry.SMOOTH_SANDSTONE_PRESSURE_PLATE.get(), 2).addCriterion("has_smooth_sandstone",
            this.hasItem(Blocks.SMOOTH_SANDSTONE)).build(consumer, "smooth_sandstone_pressure_plate_from_smooth_sandstone_stonecutting");

        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(ECBlockRegistry.POLISHED_SANDSTONE.get()), ECBlockRegistry.POLISHED_SANDSTONE_SLAB.get(), 2).addCriterion("has_polished_sandstone",
            this.hasItem(ECBlockRegistry.POLISHED_SANDSTONE.get())).build(consumer, "polished_sandstone_slab_from_polished_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(ECBlockRegistry.POLISHED_SANDSTONE.get()), ECBlockRegistry.POLISHED_SANDSTONE_STAIRS.get()).addCriterion("has_polished_sandstone",
            this.hasItem(ECBlockRegistry.POLISHED_SANDSTONE.get())).build(consumer, "polished_sandstone_stairs_from_polished_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(ECBlockRegistry.POLISHED_SANDSTONE.get()), ECBlockRegistry.POLISHED_SANDSTONE_WALL.get()).addCriterion("has_polished_sandstone",
            this.hasItem(ECBlockRegistry.POLISHED_SANDSTONE.get())).build(consumer, "polished_sandstone_wall_from_polished_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(ECBlockRegistry.POLISHED_SANDSTONE.get()), ECBlockRegistry.POLISHED_SANDSTONE_PRESSURE_PLATE.get(), 2).addCriterion(
            "has_polished_sandstone", this.hasItem(ECBlockRegistry.POLISHED_SANDSTONE.get())).build(consumer, "polished_sandstone_pressure_plate_from_polished_sandstone_stonecutting");

        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(ECBlockRegistry.SANDSTONE_PAVING.get()), ECBlockRegistry.SANDSTONE_PAVING_SLAB.get(), 2).addCriterion("has_sandstone_paving",
            this.hasItem(ECBlockRegistry.SANDSTONE_PAVING.get())).build(consumer, "sandstone_paving_slab_from_sandstone_paving_stonecutting");
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(ECBlockRegistry.SANDSTONE_PAVING.get()), ECBlockRegistry.SANDSTONE_PAVING_STAIRS.get()).addCriterion("has_sandstone_paving",
            this.hasItem(ECBlockRegistry.SANDSTONE_PAVING.get())).build(consumer, "sandstone_paving_stairs_from_sandstone_paving_stonecutting");
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(ECBlockRegistry.SANDSTONE_PAVING.get()), ECBlockRegistry.SANDSTONE_PAVING_WALL.get()).addCriterion("has_sandstone_paving",
            this.hasItem(ECBlockRegistry.SANDSTONE_PAVING.get())).build(consumer, "sandstone_paving_wall_from_sandstone_paving_stonecutting");
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(ECBlockRegistry.SANDSTONE_PAVING.get()), ECBlockRegistry.SANDSTONE_PAVING_PRESSURE_PLATE.get(), 2).addCriterion("has_sandstone_paving",
            this.hasItem(ECBlockRegistry.SANDSTONE_PAVING.get())).build(consumer, "sandstone_paving_pressure_plate_from_sandstone_paving_stonecutting");

        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(ECBlockRegistry.SANDSTONE_TILES.get()), ECBlockRegistry.SANDSTONE_TILES_SLAB.get(), 2).addCriterion("has_sandstone_tiles",
            this.hasItem(ECBlockRegistry.SANDSTONE_TILES.get())).build(consumer, "sandstone_tiles_slab_from_sandstone_tiles_stonecutting");
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(ECBlockRegistry.SANDSTONE_TILES.get()), ECBlockRegistry.SANDSTONE_TILES_STAIRS.get()).addCriterion("has_sandstone_tiles",
            this.hasItem(ECBlockRegistry.SANDSTONE_TILES.get())).build(consumer, "sandstone_tiles_stairs_from_sandstone_tiles_stonecutting");
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(ECBlockRegistry.SANDSTONE_TILES.get()), ECBlockRegistry.SANDSTONE_TILES_WALL.get()).addCriterion("has_sandstone_tiles",
            this.hasItem(ECBlockRegistry.SANDSTONE_TILES.get())).build(consumer, "sandstone_tiles_wall_from_sandstone_tiles_stonecutting");
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(ECBlockRegistry.SANDSTONE_TILES.get()), ECBlockRegistry.SANDSTONE_TILES_PRESSURE_PLATE.get(), 2).addCriterion("has_sandstone_tiles",
            this.hasItem(ECBlockRegistry.SANDSTONE_TILES.get())).build(consumer, "sandstone_tiles_pressure_plate_from_sandstone_tiles_stonecutting");

        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(ECBlockRegistry.SANDSTONE_BRICKS.get()), ECBlockRegistry.SANDSTONE_BRICKS_SLAB.get(), 2).addCriterion("has_sandstone_bricks",
            this.hasItem(ECBlockRegistry.SANDSTONE_BRICKS.get())).build(consumer, "sandstone_bricks_slab_from_sandstone_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(ECBlockRegistry.SANDSTONE_BRICKS.get()), ECBlockRegistry.SANDSTONE_BRICKS_STAIRS.get()).addCriterion("has_sandstone_bricks",
            this.hasItem(ECBlockRegistry.SANDSTONE_BRICKS.get())).build(consumer, "sandstone_bricks_stairs_from_sandstone_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(ECBlockRegistry.SANDSTONE_BRICKS.get()), ECBlockRegistry.SANDSTONE_BRICKS_WALL.get()).addCriterion("has_sandstone_bricks",
            this.hasItem(ECBlockRegistry.SANDSTONE_BRICKS.get())).build(consumer, "sandstone_bricks_wall_from_sandstone_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(ECBlockRegistry.SANDSTONE_BRICKS.get()), ECBlockRegistry.SANDSTONE_BRICKS_PRESSURE_PLATE.get(), 2).addCriterion("has_sandstone_bricks",
            this.hasItem(ECBlockRegistry.SANDSTONE_BRICKS.get())).build(consumer, "sandstone_bricks_pressure_plate_from_sandstone_bricks_stonecutting");

        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(ECBlockRegistry.SANDSTONE_LARGE_BRICKS.get()), ECBlockRegistry.SANDSTONE_LARGE_BRICKS_SLAB.get(), 2).addCriterion(
            "has_sandstone_large_bricks", this.hasItem(ECBlockRegistry.SANDSTONE_LARGE_BRICKS.get())).build(consumer, "sandstone_large_bricks_slab_from_sandstone_large_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(ECBlockRegistry.SANDSTONE_LARGE_BRICKS.get()), ECBlockRegistry.SANDSTONE_LARGE_BRICKS_STAIRS.get()).addCriterion(
            "has_sandstone_large_bricks", this.hasItem(ECBlockRegistry.SANDSTONE_LARGE_BRICKS.get())).build(consumer, "sandstone_large_bricks_stairs_from_sandstone_large_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(ECBlockRegistry.SANDSTONE_LARGE_BRICKS.get()), ECBlockRegistry.SANDSTONE_LARGE_BRICKS_WALL.get()).addCriterion(
            "has_sandstone_large_bricks", this.hasItem(ECBlockRegistry.SANDSTONE_LARGE_BRICKS.get())).build(consumer, "sandstone_large_bricks_wall_from_sandstone_large_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(ECBlockRegistry.SANDSTONE_LARGE_BRICKS.get()), ECBlockRegistry.SANDSTONE_LARGE_BRICKS_PRESSURE_PLATE.get(), 2).addCriterion(
            "has_sandstone_large_bricks", this.hasItem(ECBlockRegistry.SANDSTONE_LARGE_BRICKS.get())).build(consumer, "sandstone_large_bricks_pressure_plate_from_sandstone_large_bricks_stonecutting");

        // Sandstone
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(Blocks.RED_SANDSTONE), ECBlockRegistry.RED_SANDSTONE_BUTTON.get(), 2).addCriterion("has_red_sandstone",
            this.hasItem(Blocks.RED_SANDSTONE)).build(consumer, "red_sandstone_button_from_red_sandstone_stonecutting");

        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(Blocks.SMOOTH_RED_SANDSTONE), ECBlockRegistry.SMOOTH_RED_SANDSTONE_WALL.get()).addCriterion("has_smooth_red_sandstone",
            this.hasItem(Blocks.SMOOTH_RED_SANDSTONE)).build(consumer, "smooth_red_sandstone_wall_from_smooth_red_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(Blocks.SMOOTH_RED_SANDSTONE), ECBlockRegistry.SMOOTH_RED_SANDSTONE_PRESSURE_PLATE.get(), 2).addCriterion("has_smooth_red_sandstone",
            this.hasItem(Blocks.SMOOTH_RED_SANDSTONE)).build(consumer, "smooth_red_sandstone_pressure_plate_from_smooth_red_sandstone_stonecutting");

        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(ECBlockRegistry.POLISHED_RED_SANDSTONE.get()), ECBlockRegistry.POLISHED_RED_SANDSTONE_SLAB.get(), 2).addCriterion(
            "has_polished_red_sandstone", this.hasItem(ECBlockRegistry.POLISHED_RED_SANDSTONE.get())).build(consumer, "polished_red_sandstone_slab_from_polished_red_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(ECBlockRegistry.POLISHED_RED_SANDSTONE.get()), ECBlockRegistry.POLISHED_RED_SANDSTONE_STAIRS.get()).addCriterion(
            "has_polished_red_sandstone", this.hasItem(ECBlockRegistry.POLISHED_RED_SANDSTONE.get())).build(consumer, "polished_red_sandstone_stairs_from_polished_red_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(ECBlockRegistry.POLISHED_RED_SANDSTONE.get()), ECBlockRegistry.POLISHED_RED_SANDSTONE_WALL.get()).addCriterion(
            "has_polished_red_sandstone", this.hasItem(ECBlockRegistry.POLISHED_RED_SANDSTONE.get())).build(consumer, "polished_red_sandstone_wall_from_polished_red_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(ECBlockRegistry.POLISHED_RED_SANDSTONE.get()), ECBlockRegistry.POLISHED_RED_SANDSTONE_PRESSURE_PLATE.get(), 2).addCriterion(
            "has_polished_red_sandstone", this.hasItem(ECBlockRegistry.POLISHED_RED_SANDSTONE.get())).build(consumer, "polished_red_sandstone_pressure_plate_from_polished_red_sandstone_stonecutting");

        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(ECBlockRegistry.RED_SANDSTONE_PAVING.get()), ECBlockRegistry.RED_SANDSTONE_PAVING_SLAB.get(), 2).addCriterion("has_red_sandstone_paving",
            this.hasItem(ECBlockRegistry.RED_SANDSTONE_PAVING.get())).build(consumer, "red_sandstone_paving_slab_from_red_sandstone_paving_stonecutting");
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(ECBlockRegistry.RED_SANDSTONE_PAVING.get()), ECBlockRegistry.RED_SANDSTONE_PAVING_STAIRS.get()).addCriterion("has_red_sandstone_paving",
            this.hasItem(ECBlockRegistry.RED_SANDSTONE_PAVING.get())).build(consumer, "red_sandstone_paving_stairs_from_red_sandstone_paving_stonecutting");
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(ECBlockRegistry.RED_SANDSTONE_PAVING.get()), ECBlockRegistry.RED_SANDSTONE_PAVING_WALL.get()).addCriterion("has_red_sandstone_paving",
            this.hasItem(ECBlockRegistry.RED_SANDSTONE_PAVING.get())).build(consumer, "red_sandstone_paving_wall_from_red_sandstone_paving_stonecutting");
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(ECBlockRegistry.RED_SANDSTONE_PAVING.get()), ECBlockRegistry.RED_SANDSTONE_PAVING_PRESSURE_PLATE.get(), 2).addCriterion(
            "has_red_sandstone_paving", this.hasItem(ECBlockRegistry.RED_SANDSTONE_PAVING.get())).build(consumer, "red_sandstone_paving_pressure_plate_from_red_sandstone_paving_stonecutting");

        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(ECBlockRegistry.RED_SANDSTONE_TILES.get()), ECBlockRegistry.RED_SANDSTONE_TILES_SLAB.get(), 2).addCriterion("has_red_sandstone_tiles",
            this.hasItem(ECBlockRegistry.RED_SANDSTONE_TILES.get())).build(consumer, "red_sandstone_tiles_slab_from_red_sandstone_tiles_stonecutting");
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(ECBlockRegistry.RED_SANDSTONE_TILES.get()), ECBlockRegistry.RED_SANDSTONE_TILES_STAIRS.get()).addCriterion("has_red_sandstone_tiles",
            this.hasItem(ECBlockRegistry.RED_SANDSTONE_TILES.get())).build(consumer, "red_sandstone_tiles_stairs_from_red_sandstone_tiles_stonecutting");
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(ECBlockRegistry.RED_SANDSTONE_TILES.get()), ECBlockRegistry.RED_SANDSTONE_TILES_WALL.get()).addCriterion("has_red_sandstone_tiles",
            this.hasItem(ECBlockRegistry.RED_SANDSTONE_TILES.get())).build(consumer, "red_sandstone_tiles_wall_from_red_sandstone_tiles_stonecutting");
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(ECBlockRegistry.RED_SANDSTONE_TILES.get()), ECBlockRegistry.RED_SANDSTONE_TILES_PRESSURE_PLATE.get(), 2).addCriterion(
            "has_red_sandstone_tiles", this.hasItem(ECBlockRegistry.RED_SANDSTONE_TILES.get())).build(consumer, "red_sandstone_tiles_pressure_plate_from_red_sandstone_tiles_stonecutting");

        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(ECBlockRegistry.RED_SANDSTONE_BRICKS.get()), ECBlockRegistry.RED_SANDSTONE_BRICKS_SLAB.get(), 2).addCriterion("has_red_sandstone_bricks",
            this.hasItem(ECBlockRegistry.RED_SANDSTONE_BRICKS.get())).build(consumer, "red_sandstone_bricks_slab_from_red_sandstone_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(ECBlockRegistry.RED_SANDSTONE_BRICKS.get()), ECBlockRegistry.RED_SANDSTONE_BRICKS_STAIRS.get()).addCriterion("has_red_sandstone_bricks",
            this.hasItem(ECBlockRegistry.RED_SANDSTONE_BRICKS.get())).build(consumer, "red_sandstone_bricks_stairs_from_red_sandstone_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(ECBlockRegistry.RED_SANDSTONE_BRICKS.get()), ECBlockRegistry.RED_SANDSTONE_BRICKS_WALL.get()).addCriterion("has_red_sandstone_bricks",
            this.hasItem(ECBlockRegistry.RED_SANDSTONE_BRICKS.get())).build(consumer, "red_sandstone_bricks_wall_from_red_sandstone_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(ECBlockRegistry.RED_SANDSTONE_BRICKS.get()), ECBlockRegistry.RED_SANDSTONE_BRICKS_PRESSURE_PLATE.get(), 2).addCriterion(
            "has_red_sandstone_bricks", this.hasItem(ECBlockRegistry.RED_SANDSTONE_BRICKS.get())).build(consumer, "red_sandstone_bricks_pressure_plate_from_red_sandstone_bricks_stonecutting");

        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(ECBlockRegistry.RED_SANDSTONE_LARGE_BRICKS.get()), ECBlockRegistry.RED_SANDSTONE_LARGE_BRICKS_SLAB.get(), 2).addCriterion(
            "has_red_sandstone_large_bricks", this.hasItem(ECBlockRegistry.RED_SANDSTONE_LARGE_BRICKS.get())).build(consumer, "red_sandstone_large_bricks_slab_from_red_sandstone_large_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(ECBlockRegistry.RED_SANDSTONE_LARGE_BRICKS.get()), ECBlockRegistry.RED_SANDSTONE_LARGE_BRICKS_STAIRS.get()).addCriterion(
            "has_red_sandstone_large_bricks", this.hasItem(ECBlockRegistry.RED_SANDSTONE_LARGE_BRICKS.get())).build(consumer, "red_sandstone_large_bricks_stairs_from_red_sandstone_large_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(ECBlockRegistry.RED_SANDSTONE_LARGE_BRICKS.get()), ECBlockRegistry.RED_SANDSTONE_LARGE_BRICKS_WALL.get()).addCriterion(
            "has_red_sandstone_large_bricks", this.hasItem(ECBlockRegistry.RED_SANDSTONE_LARGE_BRICKS.get())).build(consumer, "red_sandstone_large_bricks_wall_from_red_sandstone_large_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(ECBlockRegistry.RED_SANDSTONE_LARGE_BRICKS.get()), ECBlockRegistry.RED_SANDSTONE_LARGE_BRICKS_PRESSURE_PLATE.get(), 2).addCriterion(
            "has_red_sandstone_large_bricks", this.hasItem(ECBlockRegistry.RED_SANDSTONE_LARGE_BRICKS.get())).build(consumer,
                "red_sandstone_large_bricks_pressure_plate_from_red_sandstone_large_bricks_stonecutting");

        // Terracotta
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(Blocks.TERRACOTTA), ECBlockRegistry.TERRACOTTA_SLAB.get(), 2).addCriterion("has_terracotta", this.hasItem(Blocks.TERRACOTTA)).build(
            consumer, "terracotta_slab_from_terracotta_stonecutting");
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(Blocks.TERRACOTTA), ECBlockRegistry.TERRACOTTA_STAIRS.get()).addCriterion("has_terracotta", this.hasItem(Blocks.TERRACOTTA)).build(
            consumer, "terracotta_stairs_from_terracotta_stonecutting");
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(Blocks.TERRACOTTA), ECBlockRegistry.TERRACOTTA_WALL.get()).addCriterion("has_terracotta", this.hasItem(Blocks.TERRACOTTA)).build(consumer,
            "terracotta_wall_from_terracotta_stonecutting");
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(Blocks.TERRACOTTA), ECBlockRegistry.TERRACOTTA_PRESSURE_PLATE.get(), 2).addCriterion("has_terracotta",
            this.hasItem(Blocks.TERRACOTTA)).build(consumer, "terracotta_pressure_plate_from_terracotta_stonecutting");
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(Blocks.TERRACOTTA), ECBlockRegistry.TERRACOTTA_BUTTON.get(), 2).addCriterion("has_terracotta", this.hasItem(Blocks.TERRACOTTA)).build(
            consumer, "terracotta_button_from_terracotta_stonecutting");

        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(ECBlockRegistry.POLISHED_TERRACOTTA.get()), ECBlockRegistry.POLISHED_TERRACOTTA_SLAB.get(), 2).addCriterion("has_polished_terracotta",
            this.hasItem(ECBlockRegistry.POLISHED_TERRACOTTA.get())).build(consumer, "polished_terracotta_slab_from_polished_terracotta_stonecutting");
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(ECBlockRegistry.POLISHED_TERRACOTTA.get()), ECBlockRegistry.POLISHED_TERRACOTTA_STAIRS.get()).addCriterion("has_polished_terracotta",
            this.hasItem(ECBlockRegistry.POLISHED_TERRACOTTA.get())).build(consumer, "polished_terracotta_stairs_from_polished_terracotta_stonecutting");
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(ECBlockRegistry.POLISHED_TERRACOTTA.get()), ECBlockRegistry.POLISHED_TERRACOTTA_WALL.get()).addCriterion("has_polished_terracotta",
            this.hasItem(ECBlockRegistry.POLISHED_TERRACOTTA.get())).build(consumer, "polished_terracotta_wall_from_polished_terracotta_stonecutting");
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(ECBlockRegistry.POLISHED_TERRACOTTA.get()), ECBlockRegistry.POLISHED_TERRACOTTA_PRESSURE_PLATE.get(), 2).addCriterion(
            "has_polished_terracotta", this.hasItem(ECBlockRegistry.POLISHED_TERRACOTTA.get())).build(consumer, "polished_terracotta_pressure_plate_from_polished_terracotta_stonecutting");

        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(ECBlockRegistry.TERRACOTTA_PAVING.get()), ECBlockRegistry.TERRACOTTA_PAVING_SLAB.get(), 2).addCriterion("has_terracotta_paving",
            this.hasItem(ECBlockRegistry.TERRACOTTA_PAVING.get())).build(consumer, "terracotta_paving_slab_from_terracotta_paving_stonecutting");
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(ECBlockRegistry.TERRACOTTA_PAVING.get()), ECBlockRegistry.TERRACOTTA_PAVING_STAIRS.get()).addCriterion("has_terracotta_paving",
            this.hasItem(ECBlockRegistry.TERRACOTTA_PAVING.get())).build(consumer, "terracotta_paving_stairs_from_terracotta_paving_stonecutting");
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(ECBlockRegistry.TERRACOTTA_PAVING.get()), ECBlockRegistry.TERRACOTTA_PAVING_WALL.get()).addCriterion("has_terracotta_paving",
            this.hasItem(ECBlockRegistry.TERRACOTTA_PAVING.get())).build(consumer, "terracotta_paving_wall_from_terracotta_paving_stonecutting");
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(ECBlockRegistry.TERRACOTTA_PAVING.get()), ECBlockRegistry.TERRACOTTA_PAVING_PRESSURE_PLATE.get(), 2).addCriterion("has_terracotta_paving",
            this.hasItem(ECBlockRegistry.TERRACOTTA_PAVING.get())).build(consumer, "terracotta_paving_pressure_plate_from_terracotta_paving_stonecutting");

        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(ECBlockRegistry.TERRACOTTA_TILES.get()), ECBlockRegistry.TERRACOTTA_TILES_SLAB.get(), 2).addCriterion("has_terracotta_tiles",
            this.hasItem(ECBlockRegistry.TERRACOTTA_TILES.get())).build(consumer, "terracotta_tiles_slab_from_terracotta_tiles_stonecutting");
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(ECBlockRegistry.TERRACOTTA_TILES.get()), ECBlockRegistry.TERRACOTTA_TILES_STAIRS.get()).addCriterion("has_terracotta_tiles",
            this.hasItem(ECBlockRegistry.TERRACOTTA_TILES.get())).build(consumer, "terracotta_tiles_stairs_from_terracotta_tiles_stonecutting");
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(ECBlockRegistry.TERRACOTTA_TILES.get()), ECBlockRegistry.TERRACOTTA_TILES_WALL.get()).addCriterion("has_terracotta_tiles",
            this.hasItem(ECBlockRegistry.TERRACOTTA_TILES.get())).build(consumer, "terracotta_tiles_wall_from_terracotta_tiles_stonecutting");
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(ECBlockRegistry.TERRACOTTA_TILES.get()), ECBlockRegistry.TERRACOTTA_TILES_PRESSURE_PLATE.get(), 2).addCriterion("has_terracotta_tiles",
            this.hasItem(ECBlockRegistry.TERRACOTTA_TILES.get())).build(consumer, "terracotta_tiles_pressure_plate_from_terracotta_tiles_stonecutting");

        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(ECBlockRegistry.TERRACOTTA_BRICKS.get()), ECBlockRegistry.TERRACOTTA_BRICKS_SLAB.get(), 2).addCriterion("has_terracotta_bricks",
            this.hasItem(ECBlockRegistry.TERRACOTTA_BRICKS.get())).build(consumer, "terracotta_bricks_slab_from_terracotta_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(ECBlockRegistry.TERRACOTTA_BRICKS.get()), ECBlockRegistry.TERRACOTTA_BRICKS_STAIRS.get()).addCriterion("has_terracotta_bricks",
            this.hasItem(ECBlockRegistry.TERRACOTTA_BRICKS.get())).build(consumer, "terracotta_bricks_stairs_from_terracotta_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(ECBlockRegistry.TERRACOTTA_BRICKS.get()), ECBlockRegistry.TERRACOTTA_BRICKS_WALL.get()).addCriterion("has_terracotta_bricks",
            this.hasItem(ECBlockRegistry.TERRACOTTA_BRICKS.get())).build(consumer, "terracotta_bricks_wall_from_terracotta_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(ECBlockRegistry.TERRACOTTA_BRICKS.get()), ECBlockRegistry.TERRACOTTA_BRICKS_PRESSURE_PLATE.get(), 2).addCriterion("has_terracotta_bricks",
            this.hasItem(ECBlockRegistry.TERRACOTTA_BRICKS.get())).build(consumer, "terracotta_bricks_pressure_plate_from_terracotta_bricks_stonecutting");

        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(ECBlockRegistry.TERRACOTTA_LARGE_BRICKS.get()), ECBlockRegistry.TERRACOTTA_LARGE_BRICKS_SLAB.get(), 2).addCriterion(
            "has_terracotta_large_bricks", this.hasItem(ECBlockRegistry.TERRACOTTA_LARGE_BRICKS.get())).build(consumer, "terracotta_large_bricks_slab_from_terracotta_large_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(ECBlockRegistry.TERRACOTTA_LARGE_BRICKS.get()), ECBlockRegistry.TERRACOTTA_LARGE_BRICKS_STAIRS.get()).addCriterion(
            "has_terracotta_large_bricks", this.hasItem(ECBlockRegistry.TERRACOTTA_LARGE_BRICKS.get())).build(consumer, "terracotta_large_bricks_stairs_from_terracotta_large_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(ECBlockRegistry.TERRACOTTA_LARGE_BRICKS.get()), ECBlockRegistry.TERRACOTTA_LARGE_BRICKS_WALL.get()).addCriterion(
            "has_terracotta_large_bricks", this.hasItem(ECBlockRegistry.TERRACOTTA_LARGE_BRICKS.get())).build(consumer, "terracotta_large_bricks_wall_from_terracotta_large_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(ECBlockRegistry.TERRACOTTA_LARGE_BRICKS.get()), ECBlockRegistry.TERRACOTTA_LARGE_BRICKS_PRESSURE_PLATE.get(), 2).addCriterion(
            "has_terracotta_large_bricks", this.hasItem(ECBlockRegistry.TERRACOTTA_LARGE_BRICKS.get())).build(consumer, "terracotta_large_bricks_pressure_plate_from_terracotta_large_bricks_stonecutting");

    }

}
