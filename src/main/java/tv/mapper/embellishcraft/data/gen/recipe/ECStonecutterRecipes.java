package tv.mapper.embellishcraft.data.gen.recipe;

import java.util.Arrays;
import java.util.function.Consumer;

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

    }

}
