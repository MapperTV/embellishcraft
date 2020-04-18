package tv.mapper.embellishcraft.data.gen.recipe;

import java.util.Arrays;
import java.util.function.Consumer;

import net.minecraft.block.Block;
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
            basicRecipes(consumer, ECBlockRegistry.ROCK_BLOCKS.get(RockType.byId(j)).get(), ECBlockRegistry.ROCK_SLABS.get(RockType.byId(j)).get(), ECBlockRegistry.ROCK_STAIRS.get(RockType.byId(j)).get(),
                ECBlockRegistry.ROCK_WALLS.get(RockType.byId(j)).get(), ECBlockRegistry.ROCK_PRESSURE_PLATES.get(RockType.byId(j)).get());

            SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(ECBlockRegistry.ROCK_BLOCKS.get(RockType.byId(j)).get()), ECBlockRegistry.ROCK_BUTTONS.get(RockType.byId(j)).get(), 2).addCriterion(
                "has_" + RockType.byId(j).getName(), this.hasItem(ECBlockRegistry.ROCK_BLOCKS.get(RockType.byId(j)).get())).build(consumer,
                    RockType.byId(j).getName() + "_button_from_" + RockType.byId(j).getName() + "_stonecutting");
            SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(ECBlockRegistry.ROCK_BLOCKS.get(RockType.byId(j)).get()), ECBlockRegistry.ROCK_ORNAMENTS.get(RockType.byId(j)).get()).addCriterion(
                "has_" + RockType.byId(j).getName(), this.hasItem(ECBlockRegistry.ROCK_BLOCKS.get(RockType.byId(j)).get())).build(consumer,
                    RockType.byId(j).getName() + "_ornament_from_" + RockType.byId(j).getName() + "_stonecutting");

            basicRecipes(consumer, ECBlockRegistry.ROCK_COBBLESTONES.get(RockType.byId(j)).get(), ECBlockRegistry.ROCK_COBBLESTONE_SLABS.get(RockType.byId(j)).get(),
                ECBlockRegistry.ROCK_COBBLESTONE_STAIRS.get(RockType.byId(j)).get(), ECBlockRegistry.ROCK_COBBLESTONE_WALLS.get(RockType.byId(j)).get(),
                ECBlockRegistry.ROCK_COBBLESTONE_PRESSURE_PLATES.get(RockType.byId(j)).get());
            basicRecipes(consumer, ECBlockRegistry.SMOOTH_ROCK_BLOCKS.get(RockType.byId(j)).get(), ECBlockRegistry.SMOOTH_ROCK_SLABS.get(RockType.byId(j)).get(),
                ECBlockRegistry.SMOOTH_ROCK_STAIRS.get(RockType.byId(j)).get(), ECBlockRegistry.SMOOTH_ROCK_WALLS.get(RockType.byId(j)).get(),
                ECBlockRegistry.SMOOTH_ROCK_PRESSURE_PLATES.get(RockType.byId(j)).get());
            SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(ECBlockRegistry.SMOOTH_ROCK_BLOCKS.get(RockType.byId(j)).get()),
                ECBlockRegistry.ROCK_ORNAMENTS.get(RockType.byId(j)).get()).addCriterion("has_smooth_" + RockType.byId(j).getName(),
                    this.hasItem(ECBlockRegistry.SMOOTH_ROCK_BLOCKS.get(RockType.byId(j)).get())).build(consumer,
                        RockType.byId(j).getName() + "_ornament_from_smooth_" + RockType.byId(j).getName() + "_stonecutting");

            basicRecipes(consumer, ECBlockRegistry.POLISHED_ROCK_BLOCKS.get(RockType.byId(j)).get(), ECBlockRegistry.POLISHED_ROCK_SLABS.get(RockType.byId(j)).get(),
                ECBlockRegistry.POLISHED_ROCK_STAIRS.get(RockType.byId(j)).get(), ECBlockRegistry.POLISHED_ROCK_WALLS.get(RockType.byId(j)).get(),
                ECBlockRegistry.POLISHED_ROCK_PRESSURE_PLATES.get(RockType.byId(j)).get());
            SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(ECBlockRegistry.POLISHED_ROCK_BLOCKS.get(RockType.byId(j)).get()), ECBlockRegistry.ROCK_ORNAMENTS.get(RockType.byId(j)).get(),
                2).addCriterion("has_polished_" + RockType.byId(j).getName(), this.hasItem(ECBlockRegistry.POLISHED_ROCK_BLOCKS.get(RockType.byId(j)).get())).build(consumer,
                    RockType.byId(j).getName() + "_ornament_from_polished_" + RockType.byId(j).getName() + "_stonecutting");

            basicRecipes(consumer, ECBlockRegistry.ROCK_PAVINGS.get(RockType.byId(j)).get(), ECBlockRegistry.ROCK_PAVING_SLABS.get(RockType.byId(j)).get(),
                ECBlockRegistry.ROCK_PAVING_STAIRS.get(RockType.byId(j)).get(), ECBlockRegistry.ROCK_PAVING_WALLS.get(RockType.byId(j)).get(),
                ECBlockRegistry.ROCK_PAVING_PRESSURE_PLATES.get(RockType.byId(j)).get());
            basicRecipes(consumer, ECBlockRegistry.ROCK_TILES.get(RockType.byId(j)).get(), ECBlockRegistry.ROCK_TILES_SLABS.get(RockType.byId(j)).get(),
                ECBlockRegistry.ROCK_TILES_STAIRS.get(RockType.byId(j)).get(), ECBlockRegistry.ROCK_TILES_WALLS.get(RockType.byId(j)).get(),
                ECBlockRegistry.ROCK_TILES_PRESSURE_PLATES.get(RockType.byId(j)).get());
            basicRecipes(consumer, ECBlockRegistry.ROCK_BRICKS.get(RockType.byId(j)).get(), ECBlockRegistry.ROCK_BRICKS_SLABS.get(RockType.byId(j)).get(),
                ECBlockRegistry.ROCK_BRICKS_STAIRS.get(RockType.byId(j)).get(), ECBlockRegistry.ROCK_BRICKS_WALLS.get(RockType.byId(j)).get(),
                ECBlockRegistry.ROCK_BRICKS_PRESSURE_PLATES.get(RockType.byId(j)).get());
            basicRecipes(consumer, ECBlockRegistry.ROCK_LARGE_BRICKS.get(RockType.byId(j)).get(), ECBlockRegistry.ROCK_LARGE_BRICKS_SLABS.get(RockType.byId(j)).get(),
                ECBlockRegistry.ROCK_LARGE_BRICKS_STAIRS.get(RockType.byId(j)).get(), ECBlockRegistry.ROCK_LARGE_BRICKS_WALLS.get(RockType.byId(j)).get(),
                ECBlockRegistry.ROCK_LARGE_BRICKS_PRESSURE_PLATES.get(RockType.byId(j)).get());

            SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(ECBlockRegistry.ROCK_ORNAMENTS.get(RockType.byId(j)).get()),
                ECBlockRegistry.ROCK_ORNAMENT_PRESSURE_PLATES.get(RockType.byId(j)).get(), 2).addCriterion("has_" + RockType.byId(j).getName() + "_ornament",
                    this.hasItem(ECBlockRegistry.ROCK_ORNAMENTS.get(RockType.byId(j)).get())).build(consumer,
                        RockType.byId(j).getName() + "_ornament_pressure_plate_from_" + RockType.byId(j).getName() + "_stonecutting");

            SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(ECBlockRegistry.ROCK_BLOCKS.get(RockType.byId(j)).get()), ECBlockRegistry.ROCK_ROOFTILES.get(RockType.byId(j)).get(), 2).addCriterion(
                "has_" + RockType.byId(j).getName(), this.hasItem(ECBlockRegistry.ROCK_BLOCKS.get(RockType.byId(j)).get())).build(consumer,
                    RockType.byId(j).getName() + "_rooftiles_from_" + RockType.byId(j).getName() + "_stonecutting");
            basicRecipes(consumer, ECBlockRegistry.ROCK_ROOFTILES.get(RockType.byId(j)).get(), ECBlockRegistry.ROCK_ROOFTILES_SLABS.get(RockType.byId(j)).get(),
                ECBlockRegistry.ROCK_ROOFTILES_STAIRS.get(RockType.byId(j)).get(), null, null);
        }

        // Andesite
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(Blocks.ANDESITE), ECBlockRegistry.ANDESITE_BUTTON.get(), 2).addCriterion("has_andesite", this.hasItem(Blocks.ANDESITE)).build(consumer,
            "andesite_button_from_andesite_stonecutting");

        basicRecipes(consumer, ECBlockRegistry.SMOOTH_ANDESITE.get(), ECBlockRegistry.SMOOTH_ANDESITE_SLAB.get(), ECBlockRegistry.SMOOTH_ANDESITE_STAIRS.get(), ECBlockRegistry.SMOOTH_ANDESITE_WALL.get(),
            ECBlockRegistry.SMOOTH_ANDESITE_PRESSURE_PLATE.get());
        basicRecipes(consumer, ECBlockRegistry.ANDESITE_PAVING.get(), ECBlockRegistry.ANDESITE_PAVING_SLAB.get(), ECBlockRegistry.ANDESITE_PAVING_STAIRS.get(), ECBlockRegistry.ANDESITE_PAVING_WALL.get(),
            ECBlockRegistry.ANDESITE_PAVING_PRESSURE_PLATE.get());
        basicRecipes(consumer, ECBlockRegistry.ANDESITE_TILES.get(), ECBlockRegistry.ANDESITE_TILES_SLAB.get(), ECBlockRegistry.ANDESITE_TILES_STAIRS.get(), ECBlockRegistry.ANDESITE_TILES_WALL.get(),
            ECBlockRegistry.ANDESITE_TILES_PRESSURE_PLATE.get());
        basicRecipes(consumer, ECBlockRegistry.ANDESITE_BRICKS.get(), ECBlockRegistry.ANDESITE_BRICKS_SLAB.get(), ECBlockRegistry.ANDESITE_BRICKS_STAIRS.get(), ECBlockRegistry.ANDESITE_BRICKS_WALL.get(),
            ECBlockRegistry.ANDESITE_BRICKS_PRESSURE_PLATE.get());
        basicRecipes(consumer, ECBlockRegistry.ANDESITE_LARGE_BRICKS.get(), ECBlockRegistry.ANDESITE_LARGE_BRICKS_SLAB.get(), ECBlockRegistry.ANDESITE_LARGE_BRICKS_STAIRS.get(),
            ECBlockRegistry.ANDESITE_LARGE_BRICKS_WALL.get(), ECBlockRegistry.ANDESITE_LARGE_BRICKS_PRESSURE_PLATE.get());

        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(Blocks.ANDESITE), ECBlockRegistry.ANDESITE_ORNAMENT.get()).addCriterion("has_andesite", this.hasItem(Blocks.ANDESITE)).build(consumer,
            "andesite_ornament_from_andesite_stonecutting");
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(ECBlockRegistry.ANDESITE_ORNAMENT.get()), ECBlockRegistry.ANDESITE_ORNAMENT_PRESSURE_PLATE.get(), 2).addCriterion("has_andesite_ornament",
            this.hasItem(ECBlockRegistry.ANDESITE_ORNAMENT.get())).build(consumer, "andesite_ornament_pressure_place_from_andesite_ornament_stonecutting");

        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(Blocks.ANDESITE), ECBlockRegistry.ANDESITE_ROOFTILES.get(), 2).addCriterion("has_andesite", this.hasItem(Blocks.ANDESITE)).build(consumer,
            "andesite_rooftiles_from_andesite_stonecutting");
        basicRecipes(consumer, ECBlockRegistry.ANDESITE_ROOFTILES.get(), ECBlockRegistry.ANDESITE_ROOFTILES_SLAB.get(), ECBlockRegistry.ANDESITE_ROOFTILES_STAIRS.get(), null, null);

        // Diorite
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(Blocks.DIORITE), ECBlockRegistry.DIORITE_BUTTON.get(), 2).addCriterion("has_diorite", this.hasItem(Blocks.DIORITE)).build(consumer,
            "diorite_button_from_diorite_stonecutting");

        basicRecipes(consumer, ECBlockRegistry.SMOOTH_DIORITE.get(), ECBlockRegistry.SMOOTH_DIORITE_SLAB.get(), ECBlockRegistry.SMOOTH_DIORITE_STAIRS.get(), ECBlockRegistry.SMOOTH_DIORITE_WALL.get(),
            ECBlockRegistry.SMOOTH_DIORITE_PRESSURE_PLATE.get());
        basicRecipes(consumer, ECBlockRegistry.DIORITE_PAVING.get(), ECBlockRegistry.DIORITE_PAVING_SLAB.get(), ECBlockRegistry.DIORITE_PAVING_STAIRS.get(), ECBlockRegistry.DIORITE_PAVING_WALL.get(),
            ECBlockRegistry.DIORITE_PAVING_PRESSURE_PLATE.get());
        basicRecipes(consumer, ECBlockRegistry.DIORITE_TILES.get(), ECBlockRegistry.DIORITE_TILES_SLAB.get(), ECBlockRegistry.DIORITE_TILES_STAIRS.get(), ECBlockRegistry.DIORITE_TILES_WALL.get(),
            ECBlockRegistry.DIORITE_TILES_PRESSURE_PLATE.get());
        basicRecipes(consumer, ECBlockRegistry.DIORITE_BRICKS.get(), ECBlockRegistry.DIORITE_BRICKS_SLAB.get(), ECBlockRegistry.DIORITE_BRICKS_STAIRS.get(), ECBlockRegistry.DIORITE_BRICKS_WALL.get(),
            ECBlockRegistry.DIORITE_BRICKS_PRESSURE_PLATE.get());
        basicRecipes(consumer, ECBlockRegistry.DIORITE_LARGE_BRICKS.get(), ECBlockRegistry.DIORITE_LARGE_BRICKS_SLAB.get(), ECBlockRegistry.DIORITE_LARGE_BRICKS_STAIRS.get(),
            ECBlockRegistry.DIORITE_LARGE_BRICKS_WALL.get(), ECBlockRegistry.DIORITE_LARGE_BRICKS_PRESSURE_PLATE.get());

        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(Blocks.DIORITE), ECBlockRegistry.DIORITE_ORNAMENT.get()).addCriterion("has_diorite", this.hasItem(Blocks.DIORITE)).build(consumer,
            "diorite_ornament_from_diorite_stonecutting");
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(ECBlockRegistry.DIORITE_ORNAMENT.get()), ECBlockRegistry.DIORITE_ORNAMENT_PRESSURE_PLATE.get(), 2).addCriterion("has_diorite_ornament",
            this.hasItem(ECBlockRegistry.DIORITE_ORNAMENT.get())).build(consumer, "diorite_ornament_pressure_place_from_diorite_ornament_stonecutting");

        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(Blocks.DIORITE), ECBlockRegistry.DIORITE_ROOFTILES.get(), 2).addCriterion("has_diorite", this.hasItem(Blocks.DIORITE)).build(consumer,
            "diorite_rooftiles_from_diorite_stonecutting");
        basicRecipes(consumer, ECBlockRegistry.DIORITE_ROOFTILES.get(), ECBlockRegistry.DIORITE_ROOFTILES_SLAB.get(), ECBlockRegistry.DIORITE_ROOFTILES_STAIRS.get(), null, null);

        // Granite
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(Blocks.GRANITE), ECBlockRegistry.GRANITE_BUTTON.get(), 2).addCriterion("has_granite", this.hasItem(Blocks.GRANITE)).build(consumer,
            "granite_button_from_granite_stonecutting");

        basicRecipes(consumer, ECBlockRegistry.SMOOTH_GRANITE.get(), ECBlockRegistry.SMOOTH_GRANITE_SLAB.get(), ECBlockRegistry.SMOOTH_GRANITE_STAIRS.get(), ECBlockRegistry.SMOOTH_GRANITE_WALL.get(),
            ECBlockRegistry.SMOOTH_GRANITE_PRESSURE_PLATE.get());
        basicRecipes(consumer, ECBlockRegistry.GRANITE_PAVING.get(), ECBlockRegistry.GRANITE_PAVING_SLAB.get(), ECBlockRegistry.GRANITE_PAVING_STAIRS.get(), ECBlockRegistry.GRANITE_PAVING_WALL.get(),
            ECBlockRegistry.GRANITE_PAVING_PRESSURE_PLATE.get());
        basicRecipes(consumer, ECBlockRegistry.GRANITE_TILES.get(), ECBlockRegistry.GRANITE_TILES_SLAB.get(), ECBlockRegistry.GRANITE_TILES_STAIRS.get(), ECBlockRegistry.GRANITE_TILES_WALL.get(),
            ECBlockRegistry.GRANITE_TILES_PRESSURE_PLATE.get());
        basicRecipes(consumer, ECBlockRegistry.GRANITE_BRICKS.get(), ECBlockRegistry.GRANITE_BRICKS_SLAB.get(), ECBlockRegistry.GRANITE_BRICKS_STAIRS.get(), ECBlockRegistry.GRANITE_BRICKS_WALL.get(),
            ECBlockRegistry.GRANITE_BRICKS_PRESSURE_PLATE.get());
        basicRecipes(consumer, ECBlockRegistry.GRANITE_LARGE_BRICKS.get(), ECBlockRegistry.GRANITE_LARGE_BRICKS_SLAB.get(), ECBlockRegistry.GRANITE_LARGE_BRICKS_STAIRS.get(),
            ECBlockRegistry.GRANITE_LARGE_BRICKS_WALL.get(), ECBlockRegistry.GRANITE_LARGE_BRICKS_PRESSURE_PLATE.get());

        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(Blocks.GRANITE), ECBlockRegistry.GRANITE_ORNAMENT.get()).addCriterion("has_granite", this.hasItem(Blocks.GRANITE)).build(consumer,
            "granite_ornament_from_granite_stonecutting");
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(ECBlockRegistry.GRANITE_ORNAMENT.get()), ECBlockRegistry.GRANITE_ORNAMENT_PRESSURE_PLATE.get(), 2).addCriterion("has_granite_ornament",
            this.hasItem(ECBlockRegistry.GRANITE_ORNAMENT.get())).build(consumer, "granite_ornament_pressure_place_from_granite_ornament_stonecutting");

        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(Blocks.GRANITE), ECBlockRegistry.GRANITE_ROOFTILES.get(), 2).addCriterion("has_granite", this.hasItem(Blocks.GRANITE)).build(consumer,
            "granite_rooftiles_from_granite_stonecutting");
        basicRecipes(consumer, ECBlockRegistry.GRANITE_ROOFTILES.get(), ECBlockRegistry.GRANITE_ROOFTILES_SLAB.get(), ECBlockRegistry.GRANITE_ROOFTILES_STAIRS.get(), null, null);

        // Sandstone
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(Blocks.SANDSTONE), ECBlockRegistry.SANDSTONE_BUTTON.get(), 2).addCriterion("has_sandstone", this.hasItem(Blocks.SANDSTONE)).build(
            consumer, "sandstone_button_from_sandstone_stonecutting");

        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(Blocks.SMOOTH_SANDSTONE), ECBlockRegistry.SMOOTH_SANDSTONE_WALL.get()).addCriterion("has_smooth_sandstone",
            this.hasItem(Blocks.SMOOTH_SANDSTONE)).build(consumer, "smooth_sandstone_wall_from_smooth_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(Blocks.SMOOTH_SANDSTONE), ECBlockRegistry.SMOOTH_SANDSTONE_PRESSURE_PLATE.get(), 2).addCriterion("has_smooth_sandstone",
            this.hasItem(Blocks.SMOOTH_SANDSTONE)).build(consumer, "smooth_sandstone_pressure_plate_from_smooth_sandstone_stonecutting");

        basicRecipes(consumer, ECBlockRegistry.POLISHED_SANDSTONE.get(), ECBlockRegistry.POLISHED_SANDSTONE_SLAB.get(), ECBlockRegistry.POLISHED_SANDSTONE_STAIRS.get(),
            ECBlockRegistry.POLISHED_SANDSTONE_WALL.get(), ECBlockRegistry.POLISHED_SANDSTONE_PRESSURE_PLATE.get());
        basicRecipes(consumer, ECBlockRegistry.SANDSTONE_PAVING.get(), ECBlockRegistry.SANDSTONE_PAVING_SLAB.get(), ECBlockRegistry.SANDSTONE_PAVING_STAIRS.get(), ECBlockRegistry.SANDSTONE_PAVING_WALL.get(),
            ECBlockRegistry.SANDSTONE_PAVING_PRESSURE_PLATE.get());
        basicRecipes(consumer, ECBlockRegistry.SANDSTONE_TILES.get(), ECBlockRegistry.SANDSTONE_TILES_SLAB.get(), ECBlockRegistry.SANDSTONE_TILES_STAIRS.get(), ECBlockRegistry.SANDSTONE_TILES_WALL.get(),
            ECBlockRegistry.SANDSTONE_TILES_PRESSURE_PLATE.get());
        basicRecipes(consumer, ECBlockRegistry.SANDSTONE_BRICKS.get(), ECBlockRegistry.SANDSTONE_BRICKS_SLAB.get(), ECBlockRegistry.SANDSTONE_BRICKS_STAIRS.get(), ECBlockRegistry.SANDSTONE_BRICKS_WALL.get(),
            ECBlockRegistry.SANDSTONE_BRICKS_PRESSURE_PLATE.get());
        basicRecipes(consumer, ECBlockRegistry.SANDSTONE_LARGE_BRICKS.get(), ECBlockRegistry.SANDSTONE_LARGE_BRICKS_SLAB.get(), ECBlockRegistry.SANDSTONE_LARGE_BRICKS_STAIRS.get(),
            ECBlockRegistry.SANDSTONE_LARGE_BRICKS_WALL.get(), ECBlockRegistry.SANDSTONE_LARGE_BRICKS_PRESSURE_PLATE.get());

        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(Blocks.SANDSTONE), ECBlockRegistry.SANDSTONE_ROOFTILES.get(), 2).addCriterion("has_sandstone", this.hasItem(Blocks.SANDSTONE)).build(
            consumer, "sandstone_rooftiles_from_sandstone_stonecutting");
        basicRecipes(consumer, ECBlockRegistry.SANDSTONE_ROOFTILES.get(), ECBlockRegistry.SANDSTONE_ROOFTILES_SLAB.get(), ECBlockRegistry.SANDSTONE_ROOFTILES_STAIRS.get(), null, null);

        // Red Sandstone
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(Blocks.RED_SANDSTONE), ECBlockRegistry.RED_SANDSTONE_BUTTON.get(), 2).addCriterion("has_red_sandstone",
            this.hasItem(Blocks.RED_SANDSTONE)).build(consumer, "red_sandstone_button_from_red_sandstone_stonecutting");

        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(Blocks.SMOOTH_RED_SANDSTONE), ECBlockRegistry.SMOOTH_RED_SANDSTONE_WALL.get()).addCriterion("has_smooth_red_sandstone",
            this.hasItem(Blocks.SMOOTH_RED_SANDSTONE)).build(consumer, "smooth_red_sandstone_wall_from_smooth_red_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(Blocks.SMOOTH_RED_SANDSTONE), ECBlockRegistry.SMOOTH_RED_SANDSTONE_PRESSURE_PLATE.get(), 2).addCriterion("has_smooth_red_sandstone",
            this.hasItem(Blocks.SMOOTH_RED_SANDSTONE)).build(consumer, "smooth_red_sandstone_pressure_plate_from_smooth_red_sandstone_stonecutting");

        basicRecipes(consumer, ECBlockRegistry.POLISHED_RED_SANDSTONE.get(), ECBlockRegistry.POLISHED_RED_SANDSTONE_SLAB.get(), ECBlockRegistry.POLISHED_RED_SANDSTONE_STAIRS.get(),
            ECBlockRegistry.POLISHED_RED_SANDSTONE_WALL.get(), ECBlockRegistry.POLISHED_RED_SANDSTONE_PRESSURE_PLATE.get());
        basicRecipes(consumer, ECBlockRegistry.RED_SANDSTONE_PAVING.get(), ECBlockRegistry.RED_SANDSTONE_PAVING_SLAB.get(), ECBlockRegistry.RED_SANDSTONE_PAVING_STAIRS.get(),
            ECBlockRegistry.RED_SANDSTONE_PAVING_WALL.get(), ECBlockRegistry.RED_SANDSTONE_PAVING_PRESSURE_PLATE.get());
        basicRecipes(consumer, ECBlockRegistry.RED_SANDSTONE_TILES.get(), ECBlockRegistry.RED_SANDSTONE_TILES_SLAB.get(), ECBlockRegistry.RED_SANDSTONE_TILES_STAIRS.get(),
            ECBlockRegistry.RED_SANDSTONE_TILES_WALL.get(), ECBlockRegistry.RED_SANDSTONE_TILES_PRESSURE_PLATE.get());
        basicRecipes(consumer, ECBlockRegistry.RED_SANDSTONE_BRICKS.get(), ECBlockRegistry.RED_SANDSTONE_BRICKS_SLAB.get(), ECBlockRegistry.RED_SANDSTONE_BRICKS_STAIRS.get(),
            ECBlockRegistry.RED_SANDSTONE_BRICKS_WALL.get(), ECBlockRegistry.RED_SANDSTONE_BRICKS_PRESSURE_PLATE.get());
        basicRecipes(consumer, ECBlockRegistry.RED_SANDSTONE_LARGE_BRICKS.get(), ECBlockRegistry.RED_SANDSTONE_LARGE_BRICKS_SLAB.get(), ECBlockRegistry.RED_SANDSTONE_LARGE_BRICKS_STAIRS.get(),
            ECBlockRegistry.RED_SANDSTONE_LARGE_BRICKS_WALL.get(), ECBlockRegistry.RED_SANDSTONE_LARGE_BRICKS_PRESSURE_PLATE.get());

        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(Blocks.RED_SANDSTONE), ECBlockRegistry.RED_SANDSTONE_ROOFTILES.get(), 2).addCriterion("has_red_sandstone",
            this.hasItem(Blocks.RED_SANDSTONE)).build(consumer, "red_sandstone_rooftiles_from_red_sandstone_stonecutting");
        basicRecipes(consumer, ECBlockRegistry.RED_SANDSTONE_ROOFTILES.get(), ECBlockRegistry.RED_SANDSTONE_ROOFTILES_SLAB.get(), ECBlockRegistry.RED_SANDSTONE_ROOFTILES_STAIRS.get(), null, null);

        // Terracotta
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(Blocks.TERRACOTTA), ECBlockRegistry.TERRACOTTA_BUTTON.get(), 2).addCriterion("has_terracotta", this.hasItem(Blocks.TERRACOTTA)).build(
            consumer, "terracotta_button_from_terracotta_stonecutting");
        basicRecipes(consumer, Blocks.TERRACOTTA, ECBlockRegistry.TERRACOTTA_SLAB.get(), ECBlockRegistry.TERRACOTTA_STAIRS.get(), ECBlockRegistry.TERRACOTTA_WALL.get(),
            ECBlockRegistry.TERRACOTTA_PRESSURE_PLATE.get());
        basicRecipes(consumer, ECBlockRegistry.POLISHED_TERRACOTTA.get(), ECBlockRegistry.POLISHED_TERRACOTTA_SLAB.get(), ECBlockRegistry.POLISHED_TERRACOTTA_STAIRS.get(),
            ECBlockRegistry.POLISHED_TERRACOTTA_WALL.get(), ECBlockRegistry.POLISHED_TERRACOTTA_PRESSURE_PLATE.get());
        basicRecipes(consumer, ECBlockRegistry.TERRACOTTA_PAVING.get(), ECBlockRegistry.TERRACOTTA_PAVING_SLAB.get(), ECBlockRegistry.TERRACOTTA_PAVING_STAIRS.get(),
            ECBlockRegistry.TERRACOTTA_PAVING_WALL.get(), ECBlockRegistry.TERRACOTTA_PAVING_PRESSURE_PLATE.get());
        basicRecipes(consumer, ECBlockRegistry.TERRACOTTA_TILES.get(), ECBlockRegistry.TERRACOTTA_TILES_SLAB.get(), ECBlockRegistry.TERRACOTTA_TILES_STAIRS.get(), ECBlockRegistry.TERRACOTTA_TILES_WALL.get(),
            ECBlockRegistry.TERRACOTTA_TILES_PRESSURE_PLATE.get());
        basicRecipes(consumer, ECBlockRegistry.TERRACOTTA_BRICKS.get(), ECBlockRegistry.TERRACOTTA_BRICKS_SLAB.get(), ECBlockRegistry.TERRACOTTA_BRICKS_STAIRS.get(),
            ECBlockRegistry.TERRACOTTA_BRICKS_WALL.get(), ECBlockRegistry.TERRACOTTA_BRICKS_PRESSURE_PLATE.get());
        basicRecipes(consumer, ECBlockRegistry.TERRACOTTA_LARGE_BRICKS.get(), ECBlockRegistry.TERRACOTTA_LARGE_BRICKS_SLAB.get(), ECBlockRegistry.TERRACOTTA_LARGE_BRICKS_STAIRS.get(),
            ECBlockRegistry.TERRACOTTA_LARGE_BRICKS_WALL.get(), ECBlockRegistry.TERRACOTTA_LARGE_BRICKS_PRESSURE_PLATE.get());

        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(Blocks.TERRACOTTA), ECBlockRegistry.TERRACOTTA_ROOFTILES.get(), 2).addCriterion("has_terracotta", this.hasItem(Blocks.TERRACOTTA)).build(
            consumer, "terracotta_rooftiles_from_terracotta_stonecutting");
        basicRecipes(consumer, ECBlockRegistry.TERRACOTTA_ROOFTILES.get(), ECBlockRegistry.TERRACOTTA_ROOFTILES_SLAB.get(), ECBlockRegistry.TERRACOTTA_ROOFTILES_STAIRS.get(), null, null);

        // Other bricks
        basicRecipes(consumer, ECBlockRegistry.DARK_BRICKS.get(), ECBlockRegistry.DARK_BRICKS_SLAB.get(), ECBlockRegistry.DARK_BRICKS_STAIRS.get(), ECBlockRegistry.DARK_BRICKS_WALL.get(),
            ECBlockRegistry.DARK_BRICKS_PRESSURE_PLATE.get());
        basicRecipes(consumer, ECBlockRegistry.DARK_LARGE_BRICKS.get(), ECBlockRegistry.DARK_LARGE_BRICKS_SLAB.get(), ECBlockRegistry.DARK_LARGE_BRICKS_STAIRS.get(),
            ECBlockRegistry.DARK_LARGE_BRICKS_WALL.get(), ECBlockRegistry.DARK_LARGE_BRICKS_PRESSURE_PLATE.get());
        basicRecipes(consumer, ECBlockRegistry.OLD_BRICKS.get(), ECBlockRegistry.OLD_BRICKS_SLAB.get(), ECBlockRegistry.OLD_BRICKS_STAIRS.get(), ECBlockRegistry.OLD_BRICKS_WALL.get(),
            ECBlockRegistry.OLD_BRICKS_PRESSURE_PLATE.get());
        basicRecipes(consumer, ECBlockRegistry.OLD_LARGE_BRICKS.get(), ECBlockRegistry.OLD_LARGE_BRICKS_SLAB.get(), ECBlockRegistry.OLD_LARGE_BRICKS_STAIRS.get(), ECBlockRegistry.OLD_LARGE_BRICKS_WALL.get(),
            ECBlockRegistry.OLD_LARGE_BRICKS_PRESSURE_PLATE.get());
        basicRecipes(consumer, ECBlockRegistry.WEARED_BRICKS.get(), ECBlockRegistry.WEARED_BRICKS_SLAB.get(), ECBlockRegistry.WEARED_BRICKS_STAIRS.get(), ECBlockRegistry.WEARED_BRICKS_WALL.get(),
            ECBlockRegistry.WEARED_BRICKS_PRESSURE_PLATE.get());
        basicRecipes(consumer, ECBlockRegistry.WEARED_LARGE_BRICKS.get(), ECBlockRegistry.WEARED_LARGE_BRICKS_SLAB.get(), ECBlockRegistry.WEARED_LARGE_BRICKS_STAIRS.get(),
            ECBlockRegistry.WEARED_LARGE_BRICKS_WALL.get(), ECBlockRegistry.WEARED_LARGE_BRICKS_PRESSURE_PLATE.get());

        // Pavings
        basicRecipes(consumer, ECBlockRegistry.CONCRETE_PAVING.get(), ECBlockRegistry.CONCRETE_PAVING_SLAB.get(), ECBlockRegistry.CONCRETE_PAVING_STAIRS.get(), ECBlockRegistry.CONCRETE_PAVING_WALL.get(),
            ECBlockRegistry.CONCRETE_PAVING_PRESSURE_PLATE.get());
        basicRecipes(consumer, ECBlockRegistry.DAMAGED_PAVING.get(), ECBlockRegistry.DAMAGED_PAVING_SLAB.get(), ECBlockRegistry.DAMAGED_PAVING_STAIRS.get(), ECBlockRegistry.DAMAGED_PAVING_WALL.get(),
            ECBlockRegistry.DAMAGED_PAVING_PRESSURE_PLATE.get());
        basicRecipes(consumer, ECBlockRegistry.DARK_CONCRETE_PAVING.get(), ECBlockRegistry.DARK_CONCRETE_PAVING_SLAB.get(), ECBlockRegistry.DARK_CONCRETE_PAVING_STAIRS.get(),
            ECBlockRegistry.DARK_CONCRETE_PAVING_WALL.get(), ECBlockRegistry.DARK_CONCRETE_PAVING_PRESSURE_PLATE.get());
        basicRecipes(consumer, ECBlockRegistry.MOIST_PAVING.get(), ECBlockRegistry.MOIST_PAVING_SLAB.get(), ECBlockRegistry.MOIST_PAVING_STAIRS.get(), ECBlockRegistry.MOIST_PAVING_WALL.get(),
            ECBlockRegistry.MOIST_PAVING_PRESSURE_PLATE.get());
        basicRecipes(consumer, ECBlockRegistry.POLISHED_PAVING.get(), ECBlockRegistry.POLISHED_PAVING_SLAB.get(), ECBlockRegistry.POLISHED_PAVING_STAIRS.get(), ECBlockRegistry.POLISHED_PAVING_WALL.get(),
            ECBlockRegistry.POLISHED_PAVING_PRESSURE_PLATE.get());
        basicRecipes(consumer, ECBlockRegistry.WHITE_CONCRETE_PAVING.get(), ECBlockRegistry.WHITE_CONCRETE_PAVING_SLAB.get(), ECBlockRegistry.WHITE_CONCRETE_PAVING_STAIRS.get(),
            ECBlockRegistry.WHITE_CONCRETE_PAVING_WALL.get(), ECBlockRegistry.WHITE_CONCRETE_PAVING_PRESSURE_PLATE.get());

        // Tiles
        basicRecipes(consumer, ECBlockRegistry.CONCRETE_TILES.get(), ECBlockRegistry.CONCRETE_TILES_SLAB.get(), ECBlockRegistry.CONCRETE_TILES_STAIRS.get(), ECBlockRegistry.CONCRETE_TILES_WALL.get(),
            ECBlockRegistry.CONCRETE_TILES_PRESSURE_PLATE.get());
        basicRecipes(consumer, ECBlockRegistry.SKYBLUE_TILES.get(), ECBlockRegistry.SKYBLUE_TILES_SLAB.get(), ECBlockRegistry.SKYBLUE_TILES_STAIRS.get(), ECBlockRegistry.SKYBLUE_TILES_WALL.get(),
            ECBlockRegistry.SKYBLUE_TILES_PRESSURE_PLATE.get());
        basicRecipes(consumer, ECBlockRegistry.ORANGE_TILES.get(), ECBlockRegistry.ORANGE_TILES_SLAB.get(), ECBlockRegistry.ORANGE_TILES_STAIRS.get(), ECBlockRegistry.ORANGE_TILES_WALL.get(),
            ECBlockRegistry.ORANGE_TILES_PRESSURE_PLATE.get());
        basicRecipes(consumer, ECBlockRegistry.BLUE_TILES.get(), ECBlockRegistry.BLUE_TILES_SLAB.get(), ECBlockRegistry.BLUE_TILES_STAIRS.get(), ECBlockRegistry.BLUE_TILES_WALL.get(),
            ECBlockRegistry.BLUE_TILES_PRESSURE_PLATE.get());
        basicRecipes(consumer, ECBlockRegistry.LIGHT_BLUE_TILES.get(), ECBlockRegistry.LIGHT_BLUE_TILES_SLAB.get(), ECBlockRegistry.LIGHT_BLUE_TILES_STAIRS.get(), ECBlockRegistry.LIGHT_BLUE_TILES_WALL.get(),
            ECBlockRegistry.LIGHT_BLUE_TILES_PRESSURE_PLATE.get());
        basicRecipes(consumer, ECBlockRegistry.RED_TILES.get(), ECBlockRegistry.RED_TILES_SLAB.get(), ECBlockRegistry.RED_TILES_STAIRS.get(), ECBlockRegistry.RED_TILES_WALL.get(),
            ECBlockRegistry.RED_TILES_PRESSURE_PLATE.get());
        basicRecipes(consumer, ECBlockRegistry.WHITE_TILES.get(), ECBlockRegistry.WHITE_TILES_SLAB.get(), ECBlockRegistry.WHITE_TILES_STAIRS.get(), ECBlockRegistry.WHITE_TILES_WALL.get(),
            ECBlockRegistry.WHITE_TILES_PRESSURE_PLATE.get());
        basicRecipes(consumer, ECBlockRegistry.YELLOW_TILES.get(), ECBlockRegistry.YELLOW_TILES_SLAB.get(), ECBlockRegistry.YELLOW_TILES_STAIRS.get(), ECBlockRegistry.YELLOW_TILES_WALL.get(),
            ECBlockRegistry.YELLOW_TILES_PRESSURE_PLATE.get());
        basicRecipes(consumer, ECBlockRegistry.YELLOW_GREY_TILES.get(), ECBlockRegistry.YELLOW_GREY_TILES_SLAB.get(), ECBlockRegistry.YELLOW_GREY_TILES_STAIRS.get(),
            ECBlockRegistry.YELLOW_GREY_TILES_WALL.get(), ECBlockRegistry.YELLOW_GREY_TILES_PRESSURE_PLATE.get());

        // Wallpapers
        basicRecipes(consumer, ECBlockRegistry.WHITE_BLUE_WALLPAPER.get(), ECBlockRegistry.WHITE_BLUE_WALLPAPER_SLAB.get(), ECBlockRegistry.WHITE_BLUE_WALLPAPER_STAIRS.get(), null, null);
        basicRecipes(consumer, ECBlockRegistry.BEIGE_FLOWER_WALLPAPER.get(), ECBlockRegistry.BEIGE_FLOWER_WALLPAPER_SLAB.get(), ECBlockRegistry.BEIGE_FLOWER_WALLPAPER_STAIRS.get(), null, null);
        basicRecipes(consumer, ECBlockRegistry.BEIGE_WALLPAPER.get(), ECBlockRegistry.BEIGE_WALLPAPER_SLAB.get(), ECBlockRegistry.BEIGE_WALLPAPER_STAIRS.get(), null, null);
        basicRecipes(consumer, ECBlockRegistry.PINK_WALLPAPER.get(), ECBlockRegistry.PINK_WALLPAPER_SLAB.get(), ECBlockRegistry.PINK_WALLPAPER_STAIRS.get(), null, null);
        basicRecipes(consumer, ECBlockRegistry.WHITE_GREEN_WALLPAPER.get(), ECBlockRegistry.WHITE_GREEN_WALLPAPER_SLAB.get(), ECBlockRegistry.WHITE_GREEN_WALLPAPER_STAIRS.get(), null, null);
    }

    private void basicRecipes(Consumer<IFinishedRecipe> consumer, Block base, Block slab, Block stairs, Block wall, Block pressure)
    {
        String base_name = base.getRegistryName().getPath();

        if(slab != null)
            SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(base), slab, 2).addCriterion("has_" + base_name, this.hasItem(base)).build(consumer,
                base_name + "_slab_from_" + base_name + "_stonecutting");
        if(stairs != null)
            SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(base), stairs).addCriterion("has_" + base_name, this.hasItem(base)).build(consumer,
                base_name + "_stairs_from_" + base_name + "_stonecutting");
        if(wall != null)
            SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(base), wall).addCriterion("has_" + base_name, this.hasItem(base)).build(consumer,
                base_name + "_wall_from_" + base_name + "_stonecutting");
        if(pressure != null)
            SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(base), pressure, 2).addCriterion("has_" + base_name, this.hasItem(base)).build(consumer,
                base_name + "_pressure_plate_from_" + base_name + "_stonecutting");
    }
}