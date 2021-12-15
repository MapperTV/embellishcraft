package tv.mapper.embellishcraft.data.gen.recipe;

import java.util.Arrays;
import java.util.function.Consumer;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.data.recipes.SimpleCookingRecipeBuilder;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.ButtonBlock;
import net.minecraft.world.level.block.PressurePlateBlock;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.WallBlock;
import net.minecraftforge.common.Tags;
import tv.mapper.embellishcraft.ECConstants;
import tv.mapper.embellishcraft.block.ECBlockRegistry;
import tv.mapper.embellishcraft.item.ECItemRegistry;
import tv.mapper.embellishcraft.util.McWoods;
import tv.mapper.embellishcraft.util.RockType;
import tv.mapper.mapperbase.data.BaseTags;
import tv.mapper.mapperbase.data.gen.BaseRecipes;
import tv.mapper.mapperbase.world.item.BaseItems;

public class ECRecipes extends BaseRecipes
{

    public ECRecipes(DataGenerator generatorIn)
    {
        super(generatorIn);
    }

    private static void CreateBasicRecipes(Consumer<FinishedRecipe> consumer, Block block, StairBlock stairs, SlabBlock slab, WallBlock wall, PressurePlateBlock pressure, ButtonBlock button)
    {
        if(block != null)
        {
            String name = block.getRegistryName().toString().replace(ECConstants.MODID + ":", "");

            if(slab != null)
            {
                ShapedRecipeBuilder.shaped(slab, 6).pattern("iii").define('i', block).unlockedBy("has_" + name, has(block)).save(consumer);
                ShapedRecipeBuilder.shaped(block).pattern("i").pattern("i").define('i', slab).unlockedBy("has_" + name + "_slab", has(slab)).save(consumer, ECConstants.MODID + ":" + name + "_from_slabs");
            }
            if(stairs != null)
                ShapedRecipeBuilder.shaped(stairs, 4).define('#', block).pattern("#  ").pattern("## ").pattern("###").unlockedBy("has_" + name, has(block)).save(consumer);
            if(wall != null)
                ShapedRecipeBuilder.shaped(wall, 6).define('#', block).pattern("###").pattern("###").unlockedBy("has_" + name, has(block)).save(consumer);
            if(pressure != null)
                ShapedRecipeBuilder.shaped(pressure).define('#', block).pattern("##").unlockedBy("has_" + name, has(block)).save(consumer);
            if(button != null)
                ShapelessRecipeBuilder.shapeless(button).requires(block).unlockedBy("has_" + name, has(block)).save(consumer);
        }
    }

    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> consumer)
    {
        for(int j = 0; j < Arrays.stream(RockType.values()).count(); j++)
        {
            // Rocks
            SimpleCookingRecipeBuilder.smelting(Ingredient.of(ECItemRegistry.ROCKS_COBBLESTONES_ITEMS.get(RockType.byId(j)).get()), ECItemRegistry.ROCKS_ITEMS.get(RockType.byId(j)).get(), 0.1f, 200).unlockedBy("has_" + RockType.byId(j).getSerializedName() + "_cobblestone", has(ECItemRegistry.ROCKS_COBBLESTONES_ITEMS.get(RockType.byId(j)).get())).save(consumer, ECConstants.MODID + ":" + RockType.byId(j).getSerializedName() + "_from_cobblestone_smelting");

            CreateBasicRecipes(consumer, ECBlockRegistry.ROCK_BLOCKS.get(RockType.byId(j)).get(), ECBlockRegistry.ROCK_STAIRS.get(RockType.byId(j)).get(), ECBlockRegistry.ROCK_SLABS.get(RockType.byId(j)).get(), ECBlockRegistry.ROCK_WALLS.get(RockType.byId(j)).get(), ECBlockRegistry.ROCK_PRESSURE_PLATES.get(RockType.byId(j)).get(), ECBlockRegistry.ROCK_BUTTONS.get(RockType.byId(j)).get());

            // Cobblestones
            CreateBasicRecipes(consumer, ECBlockRegistry.ROCK_COBBLESTONES.get(RockType.byId(j)).get(), ECBlockRegistry.ROCK_COBBLESTONE_STAIRS.get(RockType.byId(j)).get(), ECBlockRegistry.ROCK_COBBLESTONE_SLABS.get(RockType.byId(j)).get(), ECBlockRegistry.ROCK_COBBLESTONE_WALLS.get(RockType.byId(j)).get(), ECBlockRegistry.ROCK_COBBLESTONE_PRESSURE_PLATES.get(RockType.byId(j)).get(), null);

            // Cobblestone bricks
            ShapedRecipeBuilder.shaped(ECBlockRegistry.ROCK_COBBLESTONE_BRICKS.get(RockType.byId(j)).get(), 4).pattern("ii").pattern("ii").define('i', ECBlockRegistry.ROCK_COBBLESTONES.get(RockType.byId(j)).get()).unlockedBy("has_" + RockType.byId(j).getSerializedName() + "_cobblestone", has(ECBlockRegistry.ROCK_COBBLESTONES.get(RockType.byId(j)).get())).save(consumer);

            CreateBasicRecipes(consumer, ECBlockRegistry.ROCK_COBBLESTONE_BRICKS.get(RockType.byId(j)).get(), ECBlockRegistry.ROCK_COBBLESTONE_BRICKS_STAIRS.get(RockType.byId(j)).get(), ECBlockRegistry.ROCK_COBBLESTONE_BRICKS_SLABS.get(RockType.byId(j)).get(), ECBlockRegistry.ROCK_COBBLESTONE_BRICKS_WALLS.get(RockType.byId(j)).get(), ECBlockRegistry.ROCK_COBBLESTONE_BRICKS_PRESSURE_PLATES.get(RockType.byId(j)).get(), null);

            // Smooth rocks
            CreateBasicRecipes(consumer, ECBlockRegistry.SMOOTH_ROCK_BLOCKS.get(RockType.byId(j)).get(), ECBlockRegistry.SMOOTH_ROCK_STAIRS.get(RockType.byId(j)).get(), ECBlockRegistry.SMOOTH_ROCK_SLABS.get(RockType.byId(j)).get(), ECBlockRegistry.SMOOTH_ROCK_WALLS.get(RockType.byId(j)).get(), ECBlockRegistry.SMOOTH_ROCK_PRESSURE_PLATES.get(RockType.byId(j)).get(), null);

            SimpleCookingRecipeBuilder.smelting(Ingredient.of(ECBlockRegistry.ROCK_BLOCKS.get(RockType.byId(j)).get()), ECBlockRegistry.SMOOTH_ROCK_BLOCKS.get(RockType.byId(j)).get(), 0.1f, 200).unlockedBy("has_" + RockType.byId(j).getSerializedName(), has(ECBlockRegistry.ROCK_BLOCKS.get(RockType.byId(j)).get())).save(consumer, ECConstants.MODID + ":smooth_" + RockType.byId(j).getSerializedName() + "_from_smelting");
            ShapelessRecipeBuilder.shapeless(ECBlockRegistry.SMOOTH_ROCK_BLOCKS.get(RockType.byId(j)).get()).requires(ECBlockRegistry.POLISHED_ROCK_BLOCKS.get(RockType.byId(j)).get()).unlockedBy("has_polished_" + RockType.byId(j).getSerializedName(), has(ECBlockRegistry.POLISHED_ROCK_BLOCKS.get(RockType.byId(j)).get())).save(consumer);

            // Polished rocks
            ShapelessRecipeBuilder.shapeless(ECBlockRegistry.POLISHED_ROCK_BLOCKS.get(RockType.byId(j)).get()).requires(ECBlockRegistry.SMOOTH_ROCK_BLOCKS.get(RockType.byId(j)).get()).unlockedBy("has_smooth_" + RockType.byId(j).getSerializedName(), has(ECBlockRegistry.SMOOTH_ROCK_BLOCKS.get(RockType.byId(j)).get())).save(consumer);

            CreateBasicRecipes(consumer, ECBlockRegistry.POLISHED_ROCK_BLOCKS.get(RockType.byId(j)).get(), ECBlockRegistry.POLISHED_ROCK_STAIRS.get(RockType.byId(j)).get(), ECBlockRegistry.POLISHED_ROCK_SLABS.get(RockType.byId(j)).get(), ECBlockRegistry.POLISHED_ROCK_WALLS.get(RockType.byId(j)).get(), ECBlockRegistry.POLISHED_ROCK_PRESSURE_PLATES.get(RockType.byId(j)).get(), null);

            // Rock pavings
            ShapedRecipeBuilder.shaped(ECBlockRegistry.ROCK_PAVINGS.get(RockType.byId(j)).get(), 4).pattern("ii").pattern("ii").define('i', ECBlockRegistry.POLISHED_ROCK_BLOCKS.get(RockType.byId(j)).get()).unlockedBy("has_polished_" + RockType.byId(j).getSerializedName(), has(ECBlockRegistry.POLISHED_ROCK_BLOCKS.get(RockType.byId(j)).get())).save(consumer);

            CreateBasicRecipes(consumer, ECBlockRegistry.ROCK_PAVINGS.get(RockType.byId(j)).get(), ECBlockRegistry.ROCK_PAVING_STAIRS.get(RockType.byId(j)).get(), ECBlockRegistry.ROCK_PAVING_SLABS.get(RockType.byId(j)).get(), ECBlockRegistry.ROCK_PAVING_WALLS.get(RockType.byId(j)).get(), ECBlockRegistry.ROCK_PAVING_PRESSURE_PLATES.get(RockType.byId(j)).get(), null);

            // Rock tiles
            ShapedRecipeBuilder.shaped(ECBlockRegistry.ROCK_TILES.get(RockType.byId(j)).get(), 4).pattern("ii").pattern("ii").define('i', ECBlockRegistry.ROCK_PAVINGS.get(RockType.byId(j)).get()).unlockedBy("has_" + RockType.byId(j).getSerializedName() + "_paving", has(ECBlockRegistry.ROCK_PAVINGS.get(RockType.byId(j)).get())).save(consumer);

            CreateBasicRecipes(consumer, ECBlockRegistry.ROCK_TILES.get(RockType.byId(j)).get(), ECBlockRegistry.ROCK_TILES_STAIRS.get(RockType.byId(j)).get(), ECBlockRegistry.ROCK_TILES_SLABS.get(RockType.byId(j)).get(), ECBlockRegistry.ROCK_TILES_WALLS.get(RockType.byId(j)).get(), ECBlockRegistry.ROCK_TILES_PRESSURE_PLATES.get(RockType.byId(j)).get(), null);

            // Rock bricks
            ShapedRecipeBuilder.shaped(ECBlockRegistry.ROCK_BRICKS.get(RockType.byId(j)).get(), 4).pattern("ii").pattern("ii").define('i', ECBlockRegistry.ROCK_BLOCKS.get(RockType.byId(j)).get()).unlockedBy("has_" + RockType.byId(j).getSerializedName(), has(ECBlockRegistry.ROCK_BLOCKS.get(RockType.byId(j)).get())).save(consumer);

            CreateBasicRecipes(consumer, ECBlockRegistry.ROCK_BRICKS.get(RockType.byId(j)).get(), ECBlockRegistry.ROCK_BRICKS_STAIRS.get(RockType.byId(j)).get(), ECBlockRegistry.ROCK_BRICKS_SLABS.get(RockType.byId(j)).get(), ECBlockRegistry.ROCK_BRICKS_WALLS.get(RockType.byId(j)).get(), ECBlockRegistry.ROCK_BRICKS_PRESSURE_PLATES.get(RockType.byId(j)).get(), null);

            // Rock large bricks
            ShapedRecipeBuilder.shaped(ECBlockRegistry.ROCK_LARGE_BRICKS.get(RockType.byId(j)).get(), 4).pattern("ii").pattern("ii").define('i', ECBlockRegistry.ROCK_BRICKS.get(RockType.byId(j)).get()).unlockedBy("has_" + RockType.byId(j).getSerializedName() + "_bricks", has(ECBlockRegistry.ROCK_BRICKS.get(RockType.byId(j)).get())).save(consumer);

            CreateBasicRecipes(consumer, ECBlockRegistry.ROCK_LARGE_BRICKS.get(RockType.byId(j)).get(), ECBlockRegistry.ROCK_LARGE_BRICKS_STAIRS.get(RockType.byId(j)).get(), ECBlockRegistry.ROCK_LARGE_BRICKS_SLABS.get(RockType.byId(j)).get(), ECBlockRegistry.ROCK_LARGE_BRICKS_WALLS.get(RockType.byId(j)).get(), ECBlockRegistry.ROCK_LARGE_BRICKS_PRESSURE_PLATES.get(RockType.byId(j)).get(), null);

            // Rock paving stones
            ShapedRecipeBuilder.shaped(ECBlockRegistry.ROCK_PAVING_STONES.get(RockType.byId(j)).get(), 4).pattern(" i ").pattern("i i").pattern(" i ").define('i', ECBlockRegistry.ROCK_COBBLESTONES.get(RockType.byId(j)).get()).unlockedBy("has_" + RockType.byId(j).getSerializedName() + "_cobblestones", has(ECBlockRegistry.ROCK_COBBLESTONES.get(RockType.byId(j)).get())).save(consumer);

            CreateBasicRecipes(consumer, ECBlockRegistry.ROCK_PAVING_STONES.get(RockType.byId(j)).get(), ECBlockRegistry.ROCK_PAVING_STONES_STAIRS.get(RockType.byId(j)).get(), ECBlockRegistry.ROCK_PAVING_STONES_SLABS.get(RockType.byId(j)).get(), ECBlockRegistry.ROCK_PAVING_STONES_WALLS.get(RockType.byId(j)).get(), ECBlockRegistry.ROCK_PAVING_STONES_PRESSURE_PLATES.get(RockType.byId(j)).get(), null);

            // Rock ornaments
            ShapedRecipeBuilder.shaped(ECBlockRegistry.ROCK_ORNAMENTS.get(RockType.byId(j)).get(), 2).pattern(" i ").pattern("i i").pattern(" i ").define('i', ECBlockRegistry.SMOOTH_ROCK_SLABS.get(RockType.byId(j)).get()).unlockedBy("has_smooth_" + RockType.byId(j).getSerializedName() + "_slab", has(ECBlockRegistry.SMOOTH_ROCK_SLABS.get(RockType.byId(j)).get())).save(consumer, ECConstants.MODID + ":" + RockType.byId(j).getSerializedName() + "_ornament_from_smooth_slabs");
            ShapedRecipeBuilder.shaped(ECBlockRegistry.ROCK_ORNAMENTS.get(RockType.byId(j)).get(), 2).pattern(" i ").pattern("i i").pattern(" i ").define('i', ECBlockRegistry.POLISHED_ROCK_SLABS.get(RockType.byId(j)).get()).unlockedBy("has_polished_" + RockType.byId(j).getSerializedName() + "_slab", has(ECBlockRegistry.POLISHED_ROCK_SLABS.get(RockType.byId(j)).get())).save(consumer);

            ShapedRecipeBuilder.shaped(ECBlockRegistry.ROCK_ORNAMENT_PRESSURE_PLATES.get(RockType.byId(j)).get()).define('#', ECBlockRegistry.ROCK_ORNAMENTS.get(RockType.byId(j)).get()).pattern("##").unlockedBy("has_" + RockType.byId(j).getSerializedName() + "_ornament", has(ECBlockRegistry.ROCK_ORNAMENTS.get(RockType.byId(j)).get())).save(consumer);

            // Rock rooftiles
            ShapedRecipeBuilder.shaped(ECBlockRegistry.ROCK_ROOFTILES.get(RockType.byId(j)).get(), 4).pattern(" i ").pattern("i i").pattern(" i ").define('i', ECBlockRegistry.ROCK_BLOCKS.get(RockType.byId(j)).get()).unlockedBy("has_" + RockType.byId(j).getSerializedName(), has(ECBlockRegistry.ROCK_BLOCKS.get(RockType.byId(j)).get())).save(consumer, ECConstants.MODID + ":" + RockType.byId(j).getSerializedName() + "_rooftiles_from_" + RockType.byId(j).getSerializedName());

            CreateBasicRecipes(consumer, ECBlockRegistry.ROCK_ROOFTILES.get(RockType.byId(j)).get(), ECBlockRegistry.ROCK_ROOFTILES_STAIRS.get(RockType.byId(j)).get(), ECBlockRegistry.ROCK_ROOFTILES_SLABS.get(RockType.byId(j)).get(), null, null, null);
        }

        // Paving stones
        ShapedRecipeBuilder.shaped(ECBlockRegistry.PAVING_STONES.get(), 4).pattern(" i ").pattern("i i").pattern(" i ").define('i', Blocks.STONE).unlockedBy("has_stone", has(Blocks.STONE)).save(consumer);

        CreateBasicRecipes(consumer, ECBlockRegistry.PAVING_STONES.get(), ECBlockRegistry.PAVING_STONES_STAIRS.get(), ECBlockRegistry.PAVING_STONES_SLAB.get(), ECBlockRegistry.PAVING_STONES_WALL.get(), ECBlockRegistry.PAVING_STONES_PRESSURE_PLATE.get(), null);

        // Andesite
        ShapelessRecipeBuilder.shapeless(ECBlockRegistry.ANDESITE_BUTTON.get()).requires(Blocks.ANDESITE).unlockedBy("has_andesite", has(Blocks.ANDESITE)).save(consumer);

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Items.ANDESITE), ECItemRegistry.SMOOTH_ANDESITE_ITEM.get(), 0.1f, 200).unlockedBy("has_andesite", has(Items.ANDESITE)).save(consumer, ECConstants.MODID + ":smooth_andesite_from_smelting");

        ShapelessRecipeBuilder.shapeless(ECBlockRegistry.SMOOTH_ANDESITE.get()).requires(Blocks.POLISHED_ANDESITE).unlockedBy("has_polished_andesite", has(Blocks.POLISHED_ANDESITE)).save(consumer);
        CreateBasicRecipes(consumer, ECBlockRegistry.SMOOTH_ANDESITE.get(), ECBlockRegistry.SMOOTH_ANDESITE_STAIRS.get(), ECBlockRegistry.SMOOTH_ANDESITE_SLAB.get(), ECBlockRegistry.SMOOTH_ANDESITE_WALL.get(), ECBlockRegistry.SMOOTH_ANDESITE_PRESSURE_PLATE.get(), null);

        ShapedRecipeBuilder.shaped(ECBlockRegistry.ANDESITE_PAVING.get(), 4).pattern("ii").pattern("ii").define('i', Blocks.POLISHED_ANDESITE).unlockedBy("has_polished_andesite", has(Blocks.POLISHED_ANDESITE)).save(consumer);
        CreateBasicRecipes(consumer, ECBlockRegistry.ANDESITE_PAVING.get(), ECBlockRegistry.ANDESITE_PAVING_STAIRS.get(), ECBlockRegistry.ANDESITE_PAVING_SLAB.get(), ECBlockRegistry.ANDESITE_PAVING_WALL.get(), ECBlockRegistry.ANDESITE_PAVING_PRESSURE_PLATE.get(), null);

        ShapedRecipeBuilder.shaped(ECBlockRegistry.ANDESITE_TILES.get(), 4).pattern("ii").pattern("ii").define('i', ECBlockRegistry.ANDESITE_PAVING.get()).unlockedBy("has_andesite_paving", has(ECBlockRegistry.ANDESITE_PAVING.get())).save(consumer);
        CreateBasicRecipes(consumer, ECBlockRegistry.ANDESITE_TILES.get(), ECBlockRegistry.ANDESITE_TILES_STAIRS.get(), ECBlockRegistry.ANDESITE_TILES_SLAB.get(), ECBlockRegistry.ANDESITE_TILES_WALL.get(), ECBlockRegistry.ANDESITE_TILES_PRESSURE_PLATE.get(), null);

        ShapedRecipeBuilder.shaped(ECBlockRegistry.ANDESITE_BRICKS.get(), 4).pattern("ii").pattern("ii").define('i', ECBlockRegistry.SMOOTH_ANDESITE.get()).unlockedBy("has_smooth_andesite", has(ECBlockRegistry.SMOOTH_ANDESITE.get())).save(consumer);
        CreateBasicRecipes(consumer, ECBlockRegistry.ANDESITE_BRICKS.get(), ECBlockRegistry.ANDESITE_BRICKS_STAIRS.get(), ECBlockRegistry.ANDESITE_BRICKS_SLAB.get(), ECBlockRegistry.ANDESITE_BRICKS_WALL.get(), ECBlockRegistry.ANDESITE_BRICKS_PRESSURE_PLATE.get(), null);

        ShapedRecipeBuilder.shaped(ECBlockRegistry.ANDESITE_LARGE_BRICKS.get(), 4).pattern("ii").pattern("ii").define('i', ECBlockRegistry.ANDESITE_BRICKS.get()).unlockedBy("has_andesite_bricks", has(ECBlockRegistry.ANDESITE_BRICKS.get())).save(consumer);
        CreateBasicRecipes(consumer, ECBlockRegistry.ANDESITE_LARGE_BRICKS.get(), ECBlockRegistry.ANDESITE_LARGE_BRICKS_STAIRS.get(), ECBlockRegistry.ANDESITE_LARGE_BRICKS_SLAB.get(), ECBlockRegistry.ANDESITE_LARGE_BRICKS_WALL.get(), ECBlockRegistry.ANDESITE_LARGE_BRICKS_PRESSURE_PLATE.get(), null);

        ShapedRecipeBuilder.shaped(ECBlockRegistry.ANDESITE_PAVING_STONES.get(), 4).pattern(" i ").pattern("i i").pattern(" i ").define('i', ECBlockRegistry.ANDESITE_BRICKS.get()).unlockedBy("has_andesite_bricks", has(ECBlockRegistry.ANDESITE_BRICKS.get())).save(consumer);
        CreateBasicRecipes(consumer, ECBlockRegistry.ANDESITE_PAVING_STONES.get(), ECBlockRegistry.ANDESITE_PAVING_STONES_STAIRS.get(), ECBlockRegistry.ANDESITE_PAVING_STONES_SLAB.get(), ECBlockRegistry.ANDESITE_PAVING_STONES_WALL.get(), ECBlockRegistry.ANDESITE_PAVING_STONES_PRESSURE_PLATE.get(), null);

        ShapedRecipeBuilder.shaped(ECBlockRegistry.ANDESITE_ORNAMENT.get()).pattern(" i ").pattern("i i").pattern(" i ").define('i', ECBlockRegistry.SMOOTH_ANDESITE_SLAB.get()).unlockedBy("has_smooth_andesite_slab", has(ECBlockRegistry.SMOOTH_ANDESITE_SLAB.get())).save(consumer, ECConstants.MODID + ":andesite_ornament_from_smooth_slabs");
        ShapedRecipeBuilder.shaped(ECBlockRegistry.ANDESITE_ORNAMENT.get()).pattern(" i ").pattern("i i").pattern(" i ").define('i', Blocks.POLISHED_ANDESITE_SLAB).unlockedBy("has_polished_andesite_slab", has(Blocks.POLISHED_ANDESITE_SLAB)).save(consumer);
        ShapedRecipeBuilder.shaped(ECBlockRegistry.ANDESITE_ORNAMENT_PRESSURE_PLATE.get()).define('#', ECBlockRegistry.ANDESITE_ORNAMENT.get()).pattern("##").unlockedBy("has_andesite_ornament", has(ECBlockRegistry.ANDESITE_ORNAMENT.get())).save(consumer);

        ShapedRecipeBuilder.shaped(ECBlockRegistry.ANDESITE_ROOFTILES.get(), 4).pattern(" i ").pattern("i i").pattern(" i ").define('i', Blocks.ANDESITE).unlockedBy("has_andesite", has(Blocks.ANDESITE)).save(consumer, ECConstants.MODID + ":andesite_rooftiles_from_andesite");
        CreateBasicRecipes(consumer, ECBlockRegistry.ANDESITE_ROOFTILES.get(), ECBlockRegistry.ANDESITE_ROOFTILES_STAIRS.get(), ECBlockRegistry.ANDESITE_ROOFTILES_SLAB.get(), null, null, null);

        // Diorite
        ShapelessRecipeBuilder.shapeless(ECBlockRegistry.DIORITE_BUTTON.get()).requires(Blocks.DIORITE).unlockedBy("has_diorite", has(Blocks.DIORITE)).save(consumer);

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Items.DIORITE), ECItemRegistry.SMOOTH_DIORITE_ITEM.get(), 0.1f, 200).unlockedBy("has_diorite", has(Items.DIORITE)).save(consumer, ECConstants.MODID + ":smooth_diorite_from_smelting");

        ShapelessRecipeBuilder.shapeless(ECBlockRegistry.SMOOTH_DIORITE.get()).requires(Blocks.POLISHED_DIORITE).unlockedBy("has_polished_diorite", has(Blocks.POLISHED_DIORITE)).save(consumer);
        CreateBasicRecipes(consumer, ECBlockRegistry.SMOOTH_DIORITE.get(), ECBlockRegistry.SMOOTH_DIORITE_STAIRS.get(), ECBlockRegistry.SMOOTH_DIORITE_SLAB.get(), ECBlockRegistry.SMOOTH_DIORITE_WALL.get(), ECBlockRegistry.SMOOTH_DIORITE_PRESSURE_PLATE.get(), null);

        ShapedRecipeBuilder.shaped(ECBlockRegistry.DIORITE_PAVING.get(), 4).pattern("ii").pattern("ii").define('i', Blocks.POLISHED_DIORITE).unlockedBy("has_polished_diorite", has(Blocks.POLISHED_DIORITE)).save(consumer);
        CreateBasicRecipes(consumer, ECBlockRegistry.DIORITE_PAVING.get(), ECBlockRegistry.DIORITE_PAVING_STAIRS.get(), ECBlockRegistry.DIORITE_PAVING_SLAB.get(), ECBlockRegistry.DIORITE_PAVING_WALL.get(), ECBlockRegistry.DIORITE_PAVING_PRESSURE_PLATE.get(), null);

        ShapedRecipeBuilder.shaped(ECBlockRegistry.DIORITE_TILES.get(), 4).pattern("ii").pattern("ii").define('i', ECBlockRegistry.DIORITE_PAVING.get()).unlockedBy("has_diorite_paving", has(ECBlockRegistry.DIORITE_PAVING.get())).save(consumer);
        CreateBasicRecipes(consumer, ECBlockRegistry.DIORITE_TILES.get(), ECBlockRegistry.DIORITE_TILES_STAIRS.get(), ECBlockRegistry.DIORITE_TILES_SLAB.get(), ECBlockRegistry.DIORITE_TILES_WALL.get(), ECBlockRegistry.DIORITE_TILES_PRESSURE_PLATE.get(), null);

        ShapedRecipeBuilder.shaped(ECBlockRegistry.DIORITE_BRICKS.get(), 4).pattern("ii").pattern("ii").define('i', ECBlockRegistry.SMOOTH_DIORITE.get()).unlockedBy("has_smooth_diorite", has(ECBlockRegistry.SMOOTH_DIORITE.get())).save(consumer);
        CreateBasicRecipes(consumer, ECBlockRegistry.DIORITE_BRICKS.get(), ECBlockRegistry.DIORITE_BRICKS_STAIRS.get(), ECBlockRegistry.DIORITE_BRICKS_SLAB.get(), ECBlockRegistry.DIORITE_BRICKS_WALL.get(), ECBlockRegistry.DIORITE_BRICKS_PRESSURE_PLATE.get(), null);

        ShapedRecipeBuilder.shaped(ECBlockRegistry.DIORITE_LARGE_BRICKS.get(), 4).pattern("ii").pattern("ii").define('i', ECBlockRegistry.DIORITE_BRICKS.get()).unlockedBy("has_diorite_bricks", has(ECBlockRegistry.DIORITE_BRICKS.get())).save(consumer);
        CreateBasicRecipes(consumer, ECBlockRegistry.DIORITE_LARGE_BRICKS.get(), ECBlockRegistry.DIORITE_LARGE_BRICKS_STAIRS.get(), ECBlockRegistry.DIORITE_LARGE_BRICKS_SLAB.get(), ECBlockRegistry.DIORITE_LARGE_BRICKS_WALL.get(), ECBlockRegistry.DIORITE_LARGE_BRICKS_PRESSURE_PLATE.get(), null);

        ShapedRecipeBuilder.shaped(ECBlockRegistry.DIORITE_PAVING_STONES.get(), 4).pattern(" i ").pattern("i i").pattern(" i ").define('i', ECBlockRegistry.DIORITE_BRICKS.get()).unlockedBy("has_diorite_bricks", has(ECBlockRegistry.DIORITE_BRICKS.get())).save(consumer);
        CreateBasicRecipes(consumer, ECBlockRegistry.DIORITE_PAVING_STONES.get(), ECBlockRegistry.DIORITE_PAVING_STONES_STAIRS.get(), ECBlockRegistry.DIORITE_PAVING_STONES_SLAB.get(), ECBlockRegistry.DIORITE_PAVING_STONES_WALL.get(), ECBlockRegistry.DIORITE_PAVING_STONES_PRESSURE_PLATE.get(), null);

        ShapedRecipeBuilder.shaped(ECBlockRegistry.DIORITE_ORNAMENT.get()).pattern(" i ").pattern("i i").pattern(" i ").define('i', ECBlockRegistry.SMOOTH_DIORITE_SLAB.get()).unlockedBy("has_smooth_diorite_slab", has(ECBlockRegistry.SMOOTH_DIORITE_SLAB.get())).save(consumer, ECConstants.MODID + ":diorite_ornament_from_smooth_slabs");
        ShapedRecipeBuilder.shaped(ECBlockRegistry.DIORITE_ORNAMENT.get()).pattern(" i ").pattern("i i").pattern(" i ").define('i', Blocks.POLISHED_DIORITE_SLAB).unlockedBy("has_polished_diorite_slab", has(Blocks.POLISHED_DIORITE_SLAB)).save(consumer);
        ShapedRecipeBuilder.shaped(ECBlockRegistry.DIORITE_ORNAMENT_PRESSURE_PLATE.get()).define('#', ECBlockRegistry.DIORITE_ORNAMENT.get()).pattern("##").unlockedBy("has_diorite_ornament", has(ECBlockRegistry.DIORITE_ORNAMENT.get())).save(consumer);

        ShapedRecipeBuilder.shaped(ECBlockRegistry.DIORITE_ROOFTILES.get(), 4).pattern(" i ").pattern("i i").pattern(" i ").define('i', Blocks.DIORITE).unlockedBy("has_diorite", has(Blocks.DIORITE)).save(consumer, ECConstants.MODID + ":diorite_rooftiles_from_diorite");
        CreateBasicRecipes(consumer, ECBlockRegistry.DIORITE_ROOFTILES.get(), ECBlockRegistry.DIORITE_ROOFTILES_STAIRS.get(), ECBlockRegistry.DIORITE_ROOFTILES_SLAB.get(), null, null, null);

        // Granite
        ShapelessRecipeBuilder.shapeless(ECBlockRegistry.GRANITE_BUTTON.get()).requires(Blocks.GRANITE).unlockedBy("has_granite", has(Blocks.GRANITE)).save(consumer);

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Items.GRANITE), ECItemRegistry.SMOOTH_GRANITE_ITEM.get(), 0.1f, 200).unlockedBy("has_granite", has(Items.GRANITE)).save(consumer, ECConstants.MODID + ":smooth_granite_from_smelting");

        ShapelessRecipeBuilder.shapeless(ECBlockRegistry.SMOOTH_GRANITE.get()).requires(Blocks.POLISHED_GRANITE).unlockedBy("has_polished_granite", has(Blocks.POLISHED_GRANITE)).save(consumer);
        CreateBasicRecipes(consumer, ECBlockRegistry.SMOOTH_GRANITE.get(), ECBlockRegistry.SMOOTH_GRANITE_STAIRS.get(), ECBlockRegistry.SMOOTH_GRANITE_SLAB.get(), ECBlockRegistry.SMOOTH_GRANITE_WALL.get(), ECBlockRegistry.SMOOTH_GRANITE_PRESSURE_PLATE.get(), null);

        ShapedRecipeBuilder.shaped(ECBlockRegistry.GRANITE_PAVING.get(), 4).pattern("ii").pattern("ii").define('i', Blocks.POLISHED_GRANITE).unlockedBy("has_polished_granite", has(Blocks.POLISHED_GRANITE)).save(consumer);
        CreateBasicRecipes(consumer, ECBlockRegistry.GRANITE_PAVING.get(), ECBlockRegistry.GRANITE_PAVING_STAIRS.get(), ECBlockRegistry.GRANITE_PAVING_SLAB.get(), ECBlockRegistry.GRANITE_PAVING_WALL.get(), ECBlockRegistry.GRANITE_PAVING_PRESSURE_PLATE.get(), null);

        ShapedRecipeBuilder.shaped(ECBlockRegistry.GRANITE_TILES.get(), 4).pattern("ii").pattern("ii").define('i', ECBlockRegistry.GRANITE_PAVING.get()).unlockedBy("has_granite_paving", has(ECBlockRegistry.GRANITE_PAVING.get())).save(consumer);
        CreateBasicRecipes(consumer, ECBlockRegistry.GRANITE_TILES.get(), ECBlockRegistry.GRANITE_TILES_STAIRS.get(), ECBlockRegistry.GRANITE_TILES_SLAB.get(), ECBlockRegistry.GRANITE_TILES_WALL.get(), ECBlockRegistry.GRANITE_TILES_PRESSURE_PLATE.get(), null);

        ShapedRecipeBuilder.shaped(ECBlockRegistry.GRANITE_BRICKS.get(), 4).pattern("ii").pattern("ii").define('i', ECBlockRegistry.SMOOTH_GRANITE.get()).unlockedBy("has_smooth_granite", has(ECBlockRegistry.SMOOTH_GRANITE.get())).save(consumer);
        CreateBasicRecipes(consumer, ECBlockRegistry.GRANITE_BRICKS.get(), ECBlockRegistry.GRANITE_BRICKS_STAIRS.get(), ECBlockRegistry.GRANITE_BRICKS_SLAB.get(), ECBlockRegistry.GRANITE_BRICKS_WALL.get(), ECBlockRegistry.GRANITE_BRICKS_PRESSURE_PLATE.get(), null);

        ShapedRecipeBuilder.shaped(ECBlockRegistry.GRANITE_LARGE_BRICKS.get(), 4).pattern("ii").pattern("ii").define('i', ECBlockRegistry.GRANITE_BRICKS.get()).unlockedBy("has_granite_bricks", has(ECBlockRegistry.GRANITE_BRICKS.get())).save(consumer);
        CreateBasicRecipes(consumer, ECBlockRegistry.GRANITE_LARGE_BRICKS.get(), ECBlockRegistry.GRANITE_LARGE_BRICKS_STAIRS.get(), ECBlockRegistry.GRANITE_LARGE_BRICKS_SLAB.get(), ECBlockRegistry.GRANITE_LARGE_BRICKS_WALL.get(), ECBlockRegistry.GRANITE_LARGE_BRICKS_PRESSURE_PLATE.get(), null);

        ShapedRecipeBuilder.shaped(ECBlockRegistry.GRANITE_PAVING_STONES.get(), 4).pattern(" i ").pattern("i i").pattern(" i ").define('i', ECBlockRegistry.GRANITE_BRICKS.get()).unlockedBy("has_granite_bricks", has(ECBlockRegistry.GRANITE_BRICKS.get())).save(consumer);
        CreateBasicRecipes(consumer, ECBlockRegistry.GRANITE_PAVING_STONES.get(), ECBlockRegistry.GRANITE_PAVING_STONES_STAIRS.get(), ECBlockRegistry.GRANITE_PAVING_STONES_SLAB.get(), ECBlockRegistry.GRANITE_PAVING_STONES_WALL.get(), ECBlockRegistry.GRANITE_PAVING_STONES_PRESSURE_PLATE.get(), null);

        ShapedRecipeBuilder.shaped(ECBlockRegistry.GRANITE_ORNAMENT.get()).pattern(" i ").pattern("i i").pattern(" i ").define('i', ECBlockRegistry.SMOOTH_GRANITE_SLAB.get()).unlockedBy("has_smooth_granite_slab", has(ECBlockRegistry.SMOOTH_GRANITE_SLAB.get())).save(consumer, ECConstants.MODID + ":granite_ornament_from_smooth_slabs");
        ShapedRecipeBuilder.shaped(ECBlockRegistry.GRANITE_ORNAMENT.get()).pattern(" i ").pattern("i i").pattern(" i ").define('i', Blocks.POLISHED_GRANITE_SLAB).unlockedBy("has_polished_granite_slab", has(Blocks.POLISHED_GRANITE_SLAB)).save(consumer);
        ShapedRecipeBuilder.shaped(ECBlockRegistry.GRANITE_ORNAMENT_PRESSURE_PLATE.get()).define('#', ECBlockRegistry.GRANITE_ORNAMENT.get()).pattern("##").unlockedBy("has_granite_ornament", has(ECBlockRegistry.GRANITE_ORNAMENT.get())).save(consumer);

        ShapedRecipeBuilder.shaped(ECBlockRegistry.GRANITE_ROOFTILES.get(), 4).pattern(" i ").pattern("i i").pattern(" i ").define('i', Blocks.GRANITE).unlockedBy("has_granite", has(Blocks.GRANITE)).save(consumer, ECConstants.MODID + ":granite_rooftiles_from_granite");
        CreateBasicRecipes(consumer, ECBlockRegistry.GRANITE_ROOFTILES.get(), ECBlockRegistry.GRANITE_ROOFTILES_STAIRS.get(), ECBlockRegistry.GRANITE_ROOFTILES_SLAB.get(), null, null, null);

        // Sandstone
        ShapelessRecipeBuilder.shapeless(ECBlockRegistry.SANDSTONE_BUTTON.get()).requires(Blocks.SANDSTONE).unlockedBy("has_sandstone", has(Blocks.SANDSTONE)).save(consumer);

        ShapelessRecipeBuilder.shapeless(ECBlockRegistry.POLISHED_SANDSTONE.get()).requires(Blocks.SMOOTH_SANDSTONE).unlockedBy("has_smooth_sandstone", has(Blocks.SMOOTH_SANDSTONE)).save(consumer);
        ShapedRecipeBuilder.shaped(ECBlockRegistry.POLISHED_SANDSTONE_SLAB.get(), 6).pattern("iii").define('i', ECBlockRegistry.POLISHED_SANDSTONE.get()).unlockedBy("has_polished_sandstone", has(ECBlockRegistry.POLISHED_SANDSTONE.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ECBlockRegistry.POLISHED_SANDSTONE.get()).pattern("i").pattern("i").define('i', ECBlockRegistry.POLISHED_SANDSTONE_SLAB.get()).unlockedBy("has_polished_sandstone_slab", has(ECBlockRegistry.POLISHED_SANDSTONE_SLAB.get())).save(consumer, ECConstants.MODID + ":polished_sandstone_from_slabs");
        ShapedRecipeBuilder.shaped(ECBlockRegistry.POLISHED_SANDSTONE_STAIRS.get(), 4).define('#', ECBlockRegistry.POLISHED_SANDSTONE.get()).pattern("#  ").pattern("## ").pattern("###").unlockedBy("has_polished_sandstone", has(ECBlockRegistry.POLISHED_SANDSTONE.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ECBlockRegistry.POLISHED_SANDSTONE_WALL.get(), 6).define('#', ECBlockRegistry.POLISHED_SANDSTONE.get()).pattern("###").pattern("###").unlockedBy("has_polished_sandstone", has(ECBlockRegistry.POLISHED_SANDSTONE.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ECBlockRegistry.POLISHED_SANDSTONE_PRESSURE_PLATE.get()).define('#', ECBlockRegistry.POLISHED_SANDSTONE.get()).pattern("##").unlockedBy("has_polished_sandstone", has(ECBlockRegistry.POLISHED_SANDSTONE.get())).save(consumer);

        ShapelessRecipeBuilder.shapeless(Blocks.SMOOTH_SANDSTONE).requires(ECBlockRegistry.POLISHED_SANDSTONE.get()).unlockedBy("has_polished_sandstone", has(ECBlockRegistry.POLISHED_SANDSTONE.get())).save(consumer, ECConstants.MODID + "smooth_sandstone_from_polished_sandstone");
        ShapedRecipeBuilder.shaped(Blocks.SMOOTH_SANDSTONE).pattern("i").pattern("i").define('i', Blocks.SMOOTH_SANDSTONE_SLAB).unlockedBy("has_smooth_sandstone_slab", has(Blocks.SMOOTH_SANDSTONE_SLAB)).save(consumer, ECConstants.MODID + ":smooth_sandstone_from_slabs");
        ShapedRecipeBuilder.shaped(ECBlockRegistry.SMOOTH_SANDSTONE_WALL.get(), 6).define('#', Blocks.SMOOTH_SANDSTONE).pattern("###").pattern("###").unlockedBy("has_smooth_sandstone", has(Blocks.SMOOTH_SANDSTONE)).save(consumer);
        ShapedRecipeBuilder.shaped(ECBlockRegistry.SMOOTH_SANDSTONE_PRESSURE_PLATE.get()).define('#', Blocks.SMOOTH_SANDSTONE).pattern("##").unlockedBy("has_smooth_sandstone", has(Blocks.SMOOTH_SANDSTONE)).save(consumer);

        ShapedRecipeBuilder.shaped(ECBlockRegistry.SANDSTONE_PAVING.get(), 4).pattern("ii").pattern("ii").define('i', ECBlockRegistry.POLISHED_SANDSTONE.get()).unlockedBy("has_polished_sandstone", has(ECBlockRegistry.POLISHED_SANDSTONE.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ECBlockRegistry.SANDSTONE_PAVING_SLAB.get(), 6).pattern("iii").define('i', ECBlockRegistry.SANDSTONE_PAVING.get()).unlockedBy("has_sandstone_paving", has(ECBlockRegistry.SANDSTONE_PAVING.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ECBlockRegistry.SANDSTONE_PAVING.get()).pattern("i").pattern("i").define('i', ECBlockRegistry.SANDSTONE_PAVING_SLAB.get()).unlockedBy("has_sandstone_paving_slab", has(ECBlockRegistry.SANDSTONE_PAVING_SLAB.get())).save(consumer, ECConstants.MODID + ":sandstone_paving_from_slabs");
        ShapedRecipeBuilder.shaped(ECBlockRegistry.SANDSTONE_PAVING_STAIRS.get(), 4).define('#', ECBlockRegistry.SANDSTONE_PAVING.get()).pattern("#  ").pattern("## ").pattern("###").unlockedBy("has_sandstone_paving", has(ECBlockRegistry.SANDSTONE_PAVING.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ECBlockRegistry.SANDSTONE_PAVING_WALL.get(), 6).define('#', ECBlockRegistry.SANDSTONE_PAVING.get()).pattern("###").pattern("###").unlockedBy("has_sandstone_paving", has(ECBlockRegistry.SANDSTONE_PAVING.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ECBlockRegistry.SANDSTONE_PAVING_PRESSURE_PLATE.get()).define('#', ECBlockRegistry.SANDSTONE_PAVING.get()).pattern("##").unlockedBy("has_sandstone_paving", has(ECBlockRegistry.SANDSTONE_PAVING.get())).save(consumer);

        ShapedRecipeBuilder.shaped(ECBlockRegistry.SANDSTONE_TILES.get(), 4).pattern("ii").pattern("ii").define('i', ECBlockRegistry.SANDSTONE_PAVING.get()).unlockedBy("has_sandstone_paving", has(ECBlockRegistry.SANDSTONE_PAVING.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ECBlockRegistry.SANDSTONE_TILES_SLAB.get(), 6).pattern("iii").define('i', ECBlockRegistry.SANDSTONE_TILES.get()).unlockedBy("has_sandstone_tiles", has(ECBlockRegistry.SANDSTONE_TILES.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ECBlockRegistry.SANDSTONE_TILES.get()).pattern("i").pattern("i").define('i', ECBlockRegistry.SANDSTONE_TILES_SLAB.get()).unlockedBy("has_sandstone_tiles_slab", has(ECBlockRegistry.SANDSTONE_TILES_SLAB.get())).save(consumer, ECConstants.MODID + ":sandstone_tiles_from_slabs");
        ShapedRecipeBuilder.shaped(ECBlockRegistry.SANDSTONE_TILES_STAIRS.get(), 4).define('#', ECBlockRegistry.SANDSTONE_TILES.get()).pattern("#  ").pattern("## ").pattern("###").unlockedBy("has_sandstone_tiles", has(ECBlockRegistry.SANDSTONE_TILES.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ECBlockRegistry.SANDSTONE_TILES_WALL.get(), 6).define('#', ECBlockRegistry.SANDSTONE_TILES.get()).pattern("###").pattern("###").unlockedBy("has_sandstone_tiles", has(ECBlockRegistry.SANDSTONE_TILES.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ECBlockRegistry.SANDSTONE_TILES_PRESSURE_PLATE.get()).define('#', ECBlockRegistry.SANDSTONE_TILES.get()).pattern("##").unlockedBy("has_sandstone_tiles", has(ECBlockRegistry.SANDSTONE_TILES.get())).save(consumer);

        ShapedRecipeBuilder.shaped(ECBlockRegistry.SANDSTONE_BRICKS.get(), 4).pattern("ii").pattern("ii").define('i', Blocks.CUT_SANDSTONE).unlockedBy("has_cut_sandstone", has(Blocks.CUT_SANDSTONE)).save(consumer);
        ShapedRecipeBuilder.shaped(ECBlockRegistry.SANDSTONE_BRICKS_SLAB.get(), 6).pattern("iii").define('i', ECBlockRegistry.SANDSTONE_BRICKS.get()).unlockedBy("has_sandstone_bricks", has(ECBlockRegistry.SANDSTONE_BRICKS.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ECBlockRegistry.SANDSTONE_BRICKS.get()).pattern("i").pattern("i").define('i', ECBlockRegistry.SANDSTONE_BRICKS_SLAB.get()).unlockedBy("has_sandstone_bricks_slab", has(ECBlockRegistry.SANDSTONE_BRICKS_SLAB.get())).save(consumer, ECConstants.MODID + ":sandstone_bricks_from_slabs");
        ShapedRecipeBuilder.shaped(ECBlockRegistry.SANDSTONE_BRICKS_STAIRS.get(), 4).define('#', ECBlockRegistry.SANDSTONE_BRICKS.get()).pattern("#  ").pattern("## ").pattern("###").unlockedBy("has_sandstone_bricks", has(ECBlockRegistry.SANDSTONE_BRICKS.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ECBlockRegistry.SANDSTONE_BRICKS_WALL.get(), 6).define('#', ECBlockRegistry.SANDSTONE_BRICKS.get()).pattern("###").pattern("###").unlockedBy("has_sandstone_bricks", has(ECBlockRegistry.SANDSTONE_BRICKS.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ECBlockRegistry.SANDSTONE_BRICKS_PRESSURE_PLATE.get()).define('#', ECBlockRegistry.SANDSTONE_BRICKS.get()).pattern("##").unlockedBy("has_sandstone_bricks", has(ECBlockRegistry.SANDSTONE_BRICKS.get())).save(consumer);

        ShapedRecipeBuilder.shaped(ECBlockRegistry.SANDSTONE_LARGE_BRICKS.get(), 4).pattern("ii").pattern("ii").define('i', ECBlockRegistry.SANDSTONE_BRICKS.get()).unlockedBy("has_sandstone_bricks", has(ECBlockRegistry.SANDSTONE_BRICKS.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ECBlockRegistry.SANDSTONE_LARGE_BRICKS_SLAB.get(), 6).pattern("iii").define('i', ECBlockRegistry.SANDSTONE_LARGE_BRICKS.get()).unlockedBy("has_sandstone_large_bricks", has(ECBlockRegistry.SANDSTONE_LARGE_BRICKS.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ECBlockRegistry.SANDSTONE_LARGE_BRICKS.get()).pattern("i").pattern("i").define('i', ECBlockRegistry.SANDSTONE_LARGE_BRICKS_SLAB.get()).unlockedBy("has_sandstone_large_bricks_slab", has(ECBlockRegistry.SANDSTONE_LARGE_BRICKS_SLAB.get())).save(consumer, ECConstants.MODID + ":sandstone_large_bricks_from_slabs");
        ShapedRecipeBuilder.shaped(ECBlockRegistry.SANDSTONE_LARGE_BRICKS_STAIRS.get(), 4).define('#', ECBlockRegistry.SANDSTONE_LARGE_BRICKS.get()).pattern("#  ").pattern("## ").pattern("###").unlockedBy("has_sandstone_large_bricks", has(ECBlockRegistry.SANDSTONE_LARGE_BRICKS.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ECBlockRegistry.SANDSTONE_LARGE_BRICKS_WALL.get(), 6).define('#', ECBlockRegistry.SANDSTONE_LARGE_BRICKS.get()).pattern("###").pattern("###").unlockedBy("has_sandstone_large_bricks", has(ECBlockRegistry.SANDSTONE_LARGE_BRICKS.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ECBlockRegistry.SANDSTONE_LARGE_BRICKS_PRESSURE_PLATE.get()).define('#', ECBlockRegistry.SANDSTONE_LARGE_BRICKS.get()).pattern("##").unlockedBy("has_sandstone_large_bricks", has(ECBlockRegistry.SANDSTONE_LARGE_BRICKS.get())).save(consumer);

        ShapedRecipeBuilder.shaped(ECBlockRegistry.SANDSTONE_PAVING_STONES.get(), 4).pattern(" i ").pattern("i i").pattern(" i ").define('i', ECBlockRegistry.SANDSTONE_BRICKS.get()).unlockedBy("has_sandstone_bricks", has(ECBlockRegistry.SANDSTONE_BRICKS.get())).save(consumer);
        CreateBasicRecipes(consumer, ECBlockRegistry.SANDSTONE_PAVING_STONES.get(), ECBlockRegistry.SANDSTONE_PAVING_STONES_STAIRS.get(), ECBlockRegistry.SANDSTONE_PAVING_STONES_SLAB.get(), ECBlockRegistry.SANDSTONE_PAVING_STONES_WALL.get(), ECBlockRegistry.SANDSTONE_PAVING_STONES_PRESSURE_PLATE.get(), null);

        ShapedRecipeBuilder.shaped(ECBlockRegistry.SANDSTONE_ROOFTILES.get(), 4).pattern(" i ").pattern("i i").pattern(" i ").define('i', Blocks.SANDSTONE).unlockedBy("has_sandstone", has(Blocks.SANDSTONE)).save(consumer, ECConstants.MODID + ":sandstone_rooftiles_from_sandstone");
        ShapedRecipeBuilder.shaped(ECBlockRegistry.SANDSTONE_ROOFTILES_SLAB.get(), 6).pattern("iii").define('i', ECBlockRegistry.SANDSTONE_ROOFTILES.get()).unlockedBy("has_sandstone_rooftiles", has(ECBlockRegistry.SANDSTONE_ROOFTILES.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ECBlockRegistry.SANDSTONE_ROOFTILES.get()).pattern("i").pattern("i").define('i', ECBlockRegistry.SANDSTONE_ROOFTILES_SLAB.get()).unlockedBy("has_sandstone_rooftiles_slab", has(ECBlockRegistry.SANDSTONE_ROOFTILES_SLAB.get())).save(consumer, ECConstants.MODID + ":sandstone_rooftiles_from_slabs");
        ShapedRecipeBuilder.shaped(ECBlockRegistry.SANDSTONE_ROOFTILES_STAIRS.get(), 4).define('#', ECBlockRegistry.SANDSTONE_ROOFTILES.get()).pattern("#  ").pattern("## ").pattern("###").unlockedBy("has_sandstone_rooftiles", has(ECBlockRegistry.SANDSTONE_ROOFTILES.get())).save(consumer);

        // Red Sandstone
        ShapelessRecipeBuilder.shapeless(ECBlockRegistry.RED_SANDSTONE_BUTTON.get()).requires(Blocks.RED_SANDSTONE).unlockedBy("has_red_sandstone", has(Blocks.RED_SANDSTONE)).save(consumer);

        ShapelessRecipeBuilder.shapeless(ECBlockRegistry.POLISHED_RED_SANDSTONE.get()).requires(Blocks.SMOOTH_RED_SANDSTONE).unlockedBy("has_smooth_red_sandstone", has(Blocks.SMOOTH_RED_SANDSTONE)).save(consumer);
        ShapedRecipeBuilder.shaped(ECBlockRegistry.POLISHED_RED_SANDSTONE_SLAB.get(), 6).pattern("iii").define('i', ECBlockRegistry.POLISHED_RED_SANDSTONE.get()).unlockedBy("has_polished_red_sandstone", has(ECBlockRegistry.POLISHED_RED_SANDSTONE.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ECBlockRegistry.POLISHED_RED_SANDSTONE.get()).pattern("i").pattern("i").define('i', ECBlockRegistry.POLISHED_RED_SANDSTONE_SLAB.get()).unlockedBy("has_polished_red_sandstone_slab", has(ECBlockRegistry.POLISHED_RED_SANDSTONE_SLAB.get())).save(consumer, ECConstants.MODID + ":polished_red_sandstone_from_slabs");
        ShapedRecipeBuilder.shaped(ECBlockRegistry.POLISHED_RED_SANDSTONE_STAIRS.get(), 4).define('#', ECBlockRegistry.POLISHED_RED_SANDSTONE.get()).pattern("#  ").pattern("## ").pattern("###").unlockedBy("has_polished_red_sandstone", has(ECBlockRegistry.POLISHED_RED_SANDSTONE.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ECBlockRegistry.POLISHED_RED_SANDSTONE_WALL.get(), 6).define('#', ECBlockRegistry.POLISHED_RED_SANDSTONE.get()).pattern("###").pattern("###").unlockedBy("has_polished_red_sandstone", has(ECBlockRegistry.POLISHED_RED_SANDSTONE.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ECBlockRegistry.POLISHED_RED_SANDSTONE_PRESSURE_PLATE.get()).define('#', ECBlockRegistry.POLISHED_RED_SANDSTONE.get()).pattern("##").unlockedBy("has_polished_red_sandstone", has(ECBlockRegistry.POLISHED_RED_SANDSTONE.get())).save(consumer);

        ShapelessRecipeBuilder.shapeless(Blocks.SMOOTH_RED_SANDSTONE).requires(ECBlockRegistry.POLISHED_RED_SANDSTONE.get()).unlockedBy("has_polished_red_sandstone", has(ECBlockRegistry.POLISHED_RED_SANDSTONE.get())).save(consumer, ECConstants.MODID + "smooth_red_sandstone_from_polished_red_sandstone");
        ShapedRecipeBuilder.shaped(Blocks.SMOOTH_RED_SANDSTONE).pattern("i").pattern("i").define('i', Blocks.SMOOTH_RED_SANDSTONE_SLAB).unlockedBy("has_smooth_red_sandstone_slab", has(Blocks.SMOOTH_RED_SANDSTONE_SLAB)).save(consumer, ECConstants.MODID + ":smooth_red_sandstone_from_slabs");
        ShapedRecipeBuilder.shaped(ECBlockRegistry.SMOOTH_RED_SANDSTONE_WALL.get(), 6).define('#', Blocks.SMOOTH_RED_SANDSTONE).pattern("###").pattern("###").unlockedBy("has_smooth_red_sandstone", has(Blocks.SMOOTH_RED_SANDSTONE)).save(consumer);
        ShapedRecipeBuilder.shaped(ECBlockRegistry.SMOOTH_RED_SANDSTONE_PRESSURE_PLATE.get()).define('#', Blocks.SMOOTH_RED_SANDSTONE).pattern("##").unlockedBy("has_smooth_red_sandstone", has(Blocks.SMOOTH_RED_SANDSTONE)).save(consumer);

        ShapedRecipeBuilder.shaped(ECBlockRegistry.RED_SANDSTONE_PAVING.get(), 4).pattern("ii").pattern("ii").define('i', ECBlockRegistry.POLISHED_RED_SANDSTONE.get()).unlockedBy("has_polished_red_sandstone", has(ECBlockRegistry.POLISHED_RED_SANDSTONE.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ECBlockRegistry.RED_SANDSTONE_PAVING_SLAB.get(), 6).pattern("iii").define('i', ECBlockRegistry.RED_SANDSTONE_PAVING.get()).unlockedBy("has_red_sandstone_paving", has(ECBlockRegistry.RED_SANDSTONE_PAVING.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ECBlockRegistry.RED_SANDSTONE_PAVING.get()).pattern("i").pattern("i").define('i', ECBlockRegistry.RED_SANDSTONE_PAVING_SLAB.get()).unlockedBy("has_red_sandstone_paving_slab", has(ECBlockRegistry.RED_SANDSTONE_PAVING_SLAB.get())).save(consumer, ECConstants.MODID + ":red_sandstone_paving_from_slabs");
        ShapedRecipeBuilder.shaped(ECBlockRegistry.RED_SANDSTONE_PAVING_STAIRS.get(), 4).define('#', ECBlockRegistry.RED_SANDSTONE_PAVING.get()).pattern("#  ").pattern("## ").pattern("###").unlockedBy("has_red_sandstone_paving", has(ECBlockRegistry.RED_SANDSTONE_PAVING.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ECBlockRegistry.RED_SANDSTONE_PAVING_WALL.get(), 6).define('#', ECBlockRegistry.RED_SANDSTONE_PAVING.get()).pattern("###").pattern("###").unlockedBy("has_red_sandstone_paving", has(ECBlockRegistry.RED_SANDSTONE_PAVING.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ECBlockRegistry.RED_SANDSTONE_PAVING_PRESSURE_PLATE.get()).define('#', ECBlockRegistry.RED_SANDSTONE_PAVING.get()).pattern("##").unlockedBy("has_red_sandstone_paving", has(ECBlockRegistry.RED_SANDSTONE_PAVING.get())).save(consumer);

        ShapedRecipeBuilder.shaped(ECBlockRegistry.RED_SANDSTONE_TILES.get(), 4).pattern("ii").pattern("ii").define('i', ECBlockRegistry.RED_SANDSTONE_PAVING.get()).unlockedBy("has_red_sandstone_paving", has(ECBlockRegistry.RED_SANDSTONE_PAVING.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ECBlockRegistry.RED_SANDSTONE_TILES_SLAB.get(), 6).pattern("iii").define('i', ECBlockRegistry.RED_SANDSTONE_TILES.get()).unlockedBy("has_red_sandstone_tiles", has(ECBlockRegistry.RED_SANDSTONE_TILES.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ECBlockRegistry.RED_SANDSTONE_TILES.get()).pattern("i").pattern("i").define('i', ECBlockRegistry.RED_SANDSTONE_TILES_SLAB.get()).unlockedBy("has_red_sandstone_tiles_slab", has(ECBlockRegistry.RED_SANDSTONE_TILES_SLAB.get())).save(consumer, ECConstants.MODID + ":red_sandstone_tiles_from_slabs");
        ShapedRecipeBuilder.shaped(ECBlockRegistry.RED_SANDSTONE_TILES_STAIRS.get(), 4).define('#', ECBlockRegistry.RED_SANDSTONE_TILES.get()).pattern("#  ").pattern("## ").pattern("###").unlockedBy("has_red_sandstone_tiles", has(ECBlockRegistry.RED_SANDSTONE_TILES.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ECBlockRegistry.RED_SANDSTONE_TILES_WALL.get(), 6).define('#', ECBlockRegistry.RED_SANDSTONE_TILES.get()).pattern("###").pattern("###").unlockedBy("has_red_sandstone_tiles", has(ECBlockRegistry.RED_SANDSTONE_TILES.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ECBlockRegistry.RED_SANDSTONE_TILES_PRESSURE_PLATE.get()).define('#', ECBlockRegistry.RED_SANDSTONE_TILES.get()).pattern("##").unlockedBy("has_red_sandstone_tiles", has(ECBlockRegistry.RED_SANDSTONE_TILES.get())).save(consumer);

        ShapedRecipeBuilder.shaped(ECBlockRegistry.RED_SANDSTONE_BRICKS.get(), 4).pattern("ii").pattern("ii").define('i', Blocks.CUT_RED_SANDSTONE).unlockedBy("has_cut_red_sandstone", has(Blocks.CUT_RED_SANDSTONE)).save(consumer);
        ShapedRecipeBuilder.shaped(ECBlockRegistry.RED_SANDSTONE_BRICKS_SLAB.get(), 6).pattern("iii").define('i', ECBlockRegistry.RED_SANDSTONE_BRICKS.get()).unlockedBy("has_red_sandstone_bricks", has(ECBlockRegistry.RED_SANDSTONE_BRICKS.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ECBlockRegistry.RED_SANDSTONE_BRICKS.get()).pattern("i").pattern("i").define('i', ECBlockRegistry.RED_SANDSTONE_BRICKS_SLAB.get()).unlockedBy("has_red_sandstone_bricks_slab", has(ECBlockRegistry.RED_SANDSTONE_BRICKS_SLAB.get())).save(consumer, ECConstants.MODID + ":red_sandstone_bricks_from_slabs");
        ShapedRecipeBuilder.shaped(ECBlockRegistry.RED_SANDSTONE_BRICKS_STAIRS.get(), 4).define('#', ECBlockRegistry.RED_SANDSTONE_BRICKS.get()).pattern("#  ").pattern("## ").pattern("###").unlockedBy("has_red_sandstone_bricks", has(ECBlockRegistry.RED_SANDSTONE_BRICKS.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ECBlockRegistry.RED_SANDSTONE_BRICKS_WALL.get(), 6).define('#', ECBlockRegistry.RED_SANDSTONE_BRICKS.get()).pattern("###").pattern("###").unlockedBy("has_red_sandstone_bricks", has(ECBlockRegistry.RED_SANDSTONE_BRICKS.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ECBlockRegistry.RED_SANDSTONE_BRICKS_PRESSURE_PLATE.get()).define('#', ECBlockRegistry.RED_SANDSTONE_BRICKS.get()).pattern("##").unlockedBy("has_red_sandstone_bricks", has(ECBlockRegistry.RED_SANDSTONE_BRICKS.get())).save(consumer);

        ShapedRecipeBuilder.shaped(ECBlockRegistry.RED_SANDSTONE_LARGE_BRICKS.get(), 4).pattern("ii").pattern("ii").define('i', ECBlockRegistry.RED_SANDSTONE_BRICKS.get()).unlockedBy("has_red_sandstone_bricks", has(ECBlockRegistry.RED_SANDSTONE_BRICKS.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ECBlockRegistry.RED_SANDSTONE_LARGE_BRICKS_SLAB.get(), 6).pattern("iii").define('i', ECBlockRegistry.RED_SANDSTONE_LARGE_BRICKS.get()).unlockedBy("has_red_sandstone_large_bricks", has(ECBlockRegistry.RED_SANDSTONE_LARGE_BRICKS.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ECBlockRegistry.RED_SANDSTONE_LARGE_BRICKS.get()).pattern("i").pattern("i").define('i', ECBlockRegistry.RED_SANDSTONE_LARGE_BRICKS_SLAB.get()).unlockedBy("has_red_sandstone_large_bricks_slab", has(ECBlockRegistry.RED_SANDSTONE_LARGE_BRICKS_SLAB.get())).save(consumer, ECConstants.MODID + ":red_sandstone_large_bricks_from_slabs");
        ShapedRecipeBuilder.shaped(ECBlockRegistry.RED_SANDSTONE_LARGE_BRICKS_STAIRS.get(), 4).define('#', ECBlockRegistry.RED_SANDSTONE_LARGE_BRICKS.get()).pattern("#  ").pattern("## ").pattern("###").unlockedBy("has_red_sandstone_large_bricks", has(ECBlockRegistry.RED_SANDSTONE_LARGE_BRICKS.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ECBlockRegistry.RED_SANDSTONE_LARGE_BRICKS_WALL.get(), 6).define('#', ECBlockRegistry.RED_SANDSTONE_LARGE_BRICKS.get()).pattern("###").pattern("###").unlockedBy("has_red_sandstone_large_bricks", has(ECBlockRegistry.RED_SANDSTONE_LARGE_BRICKS.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ECBlockRegistry.RED_SANDSTONE_LARGE_BRICKS_PRESSURE_PLATE.get()).define('#', ECBlockRegistry.RED_SANDSTONE_LARGE_BRICKS.get()).pattern("##").unlockedBy("has_red_sandstone_large_bricks", has(ECBlockRegistry.RED_SANDSTONE_LARGE_BRICKS.get())).save(consumer);

        ShapedRecipeBuilder.shaped(ECBlockRegistry.RED_SANDSTONE_PAVING_STONES.get(), 4).pattern(" i ").pattern("i i").pattern(" i ").define('i', ECBlockRegistry.RED_SANDSTONE_BRICKS.get()).unlockedBy("has_red_sandstone_bricks", has(ECBlockRegistry.RED_SANDSTONE_BRICKS.get())).save(consumer);
        CreateBasicRecipes(consumer, ECBlockRegistry.RED_SANDSTONE_PAVING_STONES.get(), ECBlockRegistry.RED_SANDSTONE_PAVING_STONES_STAIRS.get(), ECBlockRegistry.RED_SANDSTONE_PAVING_STONES_SLAB.get(), ECBlockRegistry.RED_SANDSTONE_PAVING_STONES_WALL.get(), ECBlockRegistry.RED_SANDSTONE_PAVING_STONES_PRESSURE_PLATE.get(), null);

        ShapedRecipeBuilder.shaped(ECBlockRegistry.RED_SANDSTONE_ROOFTILES.get(), 4).pattern(" i ").pattern("i i").pattern(" i ").define('i', Blocks.RED_SANDSTONE).unlockedBy("has_red_sandstone", has(Blocks.RED_SANDSTONE)).save(consumer, ECConstants.MODID + ":red_sandstone_rooftiles_from_red_sandstone");
        ShapedRecipeBuilder.shaped(ECBlockRegistry.RED_SANDSTONE_ROOFTILES_SLAB.get(), 6).pattern("iii").define('i', ECBlockRegistry.RED_SANDSTONE_ROOFTILES.get()).unlockedBy("has_red_sandstone_rooftiles", has(ECBlockRegistry.RED_SANDSTONE_ROOFTILES.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ECBlockRegistry.RED_SANDSTONE_ROOFTILES.get()).pattern("i").pattern("i").define('i', ECBlockRegistry.RED_SANDSTONE_ROOFTILES_SLAB.get()).unlockedBy("has_red_sandstone_rooftiles_slab", has(ECBlockRegistry.RED_SANDSTONE_ROOFTILES_SLAB.get())).save(consumer, ECConstants.MODID + ":red_sandstone_rooftiles_from_slabs");
        ShapedRecipeBuilder.shaped(ECBlockRegistry.RED_SANDSTONE_ROOFTILES_STAIRS.get(), 4).define('#', ECBlockRegistry.RED_SANDSTONE_ROOFTILES.get()).pattern("#  ").pattern("## ").pattern("###").unlockedBy("has_red_sandstone_rooftiles", has(ECBlockRegistry.RED_SANDSTONE_ROOFTILES.get())).save(consumer);

        // Terracotta

        ShapedRecipeBuilder.shaped(ECBlockRegistry.TERRACOTTA_SLAB.get(), 6).pattern("iii").define('i', Blocks.TERRACOTTA).unlockedBy("has_terracotta", has(Blocks.TERRACOTTA)).save(consumer);
        ShapedRecipeBuilder.shaped(Blocks.TERRACOTTA).pattern("i").pattern("i").define('i', ECBlockRegistry.TERRACOTTA_SLAB.get()).unlockedBy("has_terracotta_slab", has(ECBlockRegistry.TERRACOTTA_SLAB.get())).save(consumer, ECConstants.MODID + ":terracotta_from_slabs");
        ShapedRecipeBuilder.shaped(ECBlockRegistry.TERRACOTTA_STAIRS.get(), 4).define('#', Blocks.TERRACOTTA).pattern("#  ").pattern("## ").pattern("###").unlockedBy("has_terracotta", has(Blocks.TERRACOTTA)).save(consumer);
        ShapedRecipeBuilder.shaped(ECBlockRegistry.TERRACOTTA_WALL.get(), 6).define('#', Blocks.TERRACOTTA).pattern("###").pattern("###").unlockedBy("has_terracotta", has(Blocks.TERRACOTTA)).save(consumer);
        ShapedRecipeBuilder.shaped(ECBlockRegistry.TERRACOTTA_PRESSURE_PLATE.get()).define('#', Blocks.TERRACOTTA).pattern("##").unlockedBy("has_terracotta", has(Blocks.TERRACOTTA)).save(consumer);
        ShapelessRecipeBuilder.shapeless(ECBlockRegistry.TERRACOTTA_BUTTON.get()).requires(Blocks.TERRACOTTA).unlockedBy("has_terracotta", has(Blocks.TERRACOTTA)).save(consumer);

        ShapedRecipeBuilder.shaped(ECBlockRegistry.POLISHED_TERRACOTTA.get()).pattern("i").pattern("i").define('i', Blocks.TERRACOTTA).unlockedBy("has_terracotta", has(Blocks.TERRACOTTA)).save(consumer);
        ShapedRecipeBuilder.shaped(ECBlockRegistry.POLISHED_TERRACOTTA_SLAB.get(), 6).pattern("iii").define('i', ECBlockRegistry.POLISHED_TERRACOTTA.get()).unlockedBy("has_polished_terracotta", has(ECBlockRegistry.POLISHED_TERRACOTTA.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ECBlockRegistry.POLISHED_TERRACOTTA.get()).pattern("i").pattern("i").define('i', ECBlockRegistry.POLISHED_TERRACOTTA_SLAB.get()).unlockedBy("has_polished_terracotta_slab", has(ECBlockRegistry.POLISHED_TERRACOTTA_SLAB.get())).save(consumer, ECConstants.MODID + ":polished_terracotta_from_slabs");
        ShapedRecipeBuilder.shaped(ECBlockRegistry.POLISHED_TERRACOTTA_STAIRS.get(), 4).define('#', ECBlockRegistry.POLISHED_TERRACOTTA.get()).pattern("#  ").pattern("## ").pattern("###").unlockedBy("has_polished_terracotta", has(ECBlockRegistry.POLISHED_TERRACOTTA.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ECBlockRegistry.POLISHED_TERRACOTTA_WALL.get(), 6).define('#', ECBlockRegistry.POLISHED_TERRACOTTA.get()).pattern("###").pattern("###").unlockedBy("has_polished_terracotta", has(ECBlockRegistry.POLISHED_TERRACOTTA.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ECBlockRegistry.POLISHED_TERRACOTTA_PRESSURE_PLATE.get()).define('#', ECBlockRegistry.POLISHED_TERRACOTTA.get()).pattern("##").unlockedBy("has_polished_terracotta", has(ECBlockRegistry.POLISHED_TERRACOTTA.get())).save(consumer);

        ShapedRecipeBuilder.shaped(ECBlockRegistry.TERRACOTTA_PAVING.get(), 4).pattern("ii").pattern("ii").define('i', ECBlockRegistry.POLISHED_TERRACOTTA.get()).unlockedBy("has_polished_terracotta", has(ECBlockRegistry.POLISHED_TERRACOTTA.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ECBlockRegistry.TERRACOTTA_PAVING_SLAB.get(), 6).pattern("iii").define('i', ECBlockRegistry.TERRACOTTA_PAVING.get()).unlockedBy("has_terracotta_paving", has(ECBlockRegistry.TERRACOTTA_PAVING.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ECBlockRegistry.TERRACOTTA_PAVING.get()).pattern("i").pattern("i").define('i', ECBlockRegistry.TERRACOTTA_PAVING_SLAB.get()).unlockedBy("has_terracotta_paving_slab", has(ECBlockRegistry.TERRACOTTA_PAVING_SLAB.get())).save(consumer, ECConstants.MODID + ":terracotta_paving_from_slabs");
        ShapedRecipeBuilder.shaped(ECBlockRegistry.TERRACOTTA_PAVING_STAIRS.get(), 4).define('#', ECBlockRegistry.TERRACOTTA_PAVING.get()).pattern("#  ").pattern("## ").pattern("###").unlockedBy("has_terracotta_paving", has(ECBlockRegistry.TERRACOTTA_PAVING.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ECBlockRegistry.TERRACOTTA_PAVING_WALL.get(), 6).define('#', ECBlockRegistry.TERRACOTTA_PAVING.get()).pattern("###").pattern("###").unlockedBy("has_terracotta_paving", has(ECBlockRegistry.TERRACOTTA_PAVING.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ECBlockRegistry.TERRACOTTA_PAVING_PRESSURE_PLATE.get()).define('#', ECBlockRegistry.TERRACOTTA_PAVING.get()).pattern("##").unlockedBy("has_terracotta_paving", has(ECBlockRegistry.TERRACOTTA_PAVING.get())).save(consumer);

        ShapedRecipeBuilder.shaped(ECBlockRegistry.TERRACOTTA_TILES.get(), 4).pattern("ii").pattern("ii").define('i', ECBlockRegistry.TERRACOTTA_PAVING.get()).unlockedBy("has_terracotta_paving", has(ECBlockRegistry.TERRACOTTA_PAVING.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ECBlockRegistry.TERRACOTTA_TILES_SLAB.get(), 6).pattern("iii").define('i', ECBlockRegistry.TERRACOTTA_TILES.get()).unlockedBy("has_terracotta_tiles", has(ECBlockRegistry.TERRACOTTA_TILES.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ECBlockRegistry.TERRACOTTA_TILES.get()).pattern("i").pattern("i").define('i', ECBlockRegistry.TERRACOTTA_TILES_SLAB.get()).unlockedBy("has_terracotta_tiles_slab", has(ECBlockRegistry.TERRACOTTA_TILES_SLAB.get())).save(consumer, ECConstants.MODID + ":terracotta_tiles_from_slabs");
        ShapedRecipeBuilder.shaped(ECBlockRegistry.TERRACOTTA_TILES_STAIRS.get(), 4).define('#', ECBlockRegistry.TERRACOTTA_TILES.get()).pattern("#  ").pattern("## ").pattern("###").unlockedBy("has_terracotta_tiles", has(ECBlockRegistry.TERRACOTTA_TILES.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ECBlockRegistry.TERRACOTTA_TILES_WALL.get(), 6).define('#', ECBlockRegistry.TERRACOTTA_TILES.get()).pattern("###").pattern("###").unlockedBy("has_terracotta_tiles", has(ECBlockRegistry.TERRACOTTA_TILES.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ECBlockRegistry.TERRACOTTA_TILES_PRESSURE_PLATE.get()).define('#', ECBlockRegistry.TERRACOTTA_TILES.get()).pattern("##").unlockedBy("has_terracotta_tiles", has(ECBlockRegistry.TERRACOTTA_TILES.get())).save(consumer);

        ShapedRecipeBuilder.shaped(ECBlockRegistry.TERRACOTTA_BRICKS.get(), 4).pattern("ii").pattern("ii").define('i', Blocks.TERRACOTTA).unlockedBy("has_terracotta", has(Blocks.TERRACOTTA)).save(consumer);
        ShapedRecipeBuilder.shaped(ECBlockRegistry.TERRACOTTA_BRICKS_SLAB.get(), 6).pattern("iii").define('i', ECBlockRegistry.TERRACOTTA_BRICKS.get()).unlockedBy("has_terracotta_bricks", has(ECBlockRegistry.TERRACOTTA_BRICKS.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ECBlockRegistry.TERRACOTTA_BRICKS.get()).pattern("i").pattern("i").define('i', ECBlockRegistry.TERRACOTTA_BRICKS_SLAB.get()).unlockedBy("has_terracotta_bricks_slab", has(ECBlockRegistry.TERRACOTTA_BRICKS_SLAB.get())).save(consumer, ECConstants.MODID + ":terracotta_bricks_from_slabs");
        ShapedRecipeBuilder.shaped(ECBlockRegistry.TERRACOTTA_BRICKS_STAIRS.get(), 4).define('#', ECBlockRegistry.TERRACOTTA_BRICKS.get()).pattern("#  ").pattern("## ").pattern("###").unlockedBy("has_terracotta_bricks", has(ECBlockRegistry.TERRACOTTA_BRICKS.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ECBlockRegistry.TERRACOTTA_BRICKS_WALL.get(), 6).define('#', ECBlockRegistry.TERRACOTTA_BRICKS.get()).pattern("###").pattern("###").unlockedBy("has_terracotta_bricks", has(ECBlockRegistry.TERRACOTTA_BRICKS.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ECBlockRegistry.TERRACOTTA_BRICKS_PRESSURE_PLATE.get()).define('#', ECBlockRegistry.TERRACOTTA_BRICKS.get()).pattern("##").unlockedBy("has_terracotta_bricks", has(ECBlockRegistry.TERRACOTTA_BRICKS.get())).save(consumer);

        ShapedRecipeBuilder.shaped(ECBlockRegistry.TERRACOTTA_LARGE_BRICKS.get(), 4).pattern("ii").pattern("ii").define('i', ECBlockRegistry.TERRACOTTA_BRICKS.get()).unlockedBy("has_terracotta_bricks", has(ECBlockRegistry.TERRACOTTA_BRICKS.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ECBlockRegistry.TERRACOTTA_LARGE_BRICKS_SLAB.get(), 6).pattern("iii").define('i', ECBlockRegistry.TERRACOTTA_LARGE_BRICKS.get()).unlockedBy("has_terracotta_large_bricks", has(ECBlockRegistry.TERRACOTTA_LARGE_BRICKS.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ECBlockRegistry.TERRACOTTA_LARGE_BRICKS.get()).pattern("i").pattern("i").define('i', ECBlockRegistry.TERRACOTTA_LARGE_BRICKS_SLAB.get()).unlockedBy("has_terracotta_large_bricks_slab", has(ECBlockRegistry.TERRACOTTA_LARGE_BRICKS_SLAB.get())).save(consumer, ECConstants.MODID + ":terracotta_large_bricks_from_slabs");
        ShapedRecipeBuilder.shaped(ECBlockRegistry.TERRACOTTA_LARGE_BRICKS_STAIRS.get(), 4).define('#', ECBlockRegistry.TERRACOTTA_LARGE_BRICKS.get()).pattern("#  ").pattern("## ").pattern("###").unlockedBy("has_terracotta_large_bricks", has(ECBlockRegistry.TERRACOTTA_LARGE_BRICKS.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ECBlockRegistry.TERRACOTTA_LARGE_BRICKS_WALL.get(), 6).define('#', ECBlockRegistry.TERRACOTTA_LARGE_BRICKS.get()).pattern("###").pattern("###").unlockedBy("has_terracotta_large_bricks", has(ECBlockRegistry.TERRACOTTA_LARGE_BRICKS.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ECBlockRegistry.TERRACOTTA_LARGE_BRICKS_PRESSURE_PLATE.get()).define('#', ECBlockRegistry.TERRACOTTA_LARGE_BRICKS.get()).pattern("##").unlockedBy("has_terracotta_large_bricks", has(ECBlockRegistry.TERRACOTTA_LARGE_BRICKS.get())).save(consumer);

        ShapedRecipeBuilder.shaped(ECBlockRegistry.TERRACOTTA_PAVING_STONES.get(), 4).pattern(" i ").pattern("i i").pattern(" i ").define('i', ECBlockRegistry.TERRACOTTA_BRICKS.get()).unlockedBy("has_terracotta_bricks", has(ECBlockRegistry.TERRACOTTA_BRICKS.get())).save(consumer);
        CreateBasicRecipes(consumer, ECBlockRegistry.TERRACOTTA_PAVING_STONES.get(), ECBlockRegistry.TERRACOTTA_PAVING_STONES_STAIRS.get(), ECBlockRegistry.TERRACOTTA_PAVING_STONES_SLAB.get(), ECBlockRegistry.TERRACOTTA_PAVING_STONES_WALL.get(), ECBlockRegistry.TERRACOTTA_PAVING_STONES_PRESSURE_PLATE.get(), null);

        ShapedRecipeBuilder.shaped(ECBlockRegistry.TERRACOTTA_ROOFTILES.get(), 4).pattern(" i ").pattern("i i").pattern(" i ").define('i', Blocks.TERRACOTTA).unlockedBy("has_terracotta", has(Blocks.TERRACOTTA)).save(consumer, ECConstants.MODID + ":terracotta_rooftiles_from_terracotta");
        ShapedRecipeBuilder.shaped(ECBlockRegistry.TERRACOTTA_ROOFTILES_SLAB.get(), 6).pattern("iii").define('i', ECBlockRegistry.TERRACOTTA_ROOFTILES.get()).unlockedBy("has_terracotta_rooftiles", has(ECBlockRegistry.TERRACOTTA_ROOFTILES.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ECBlockRegistry.TERRACOTTA_ROOFTILES.get()).pattern("i").pattern("i").define('i', ECBlockRegistry.TERRACOTTA_ROOFTILES_SLAB.get()).unlockedBy("has_terracotta_rooftiles_slab", has(ECBlockRegistry.TERRACOTTA_ROOFTILES_SLAB.get())).save(consumer, ECConstants.MODID + ":terracotta_rooftiles_from_slabs");
        ShapedRecipeBuilder.shaped(ECBlockRegistry.TERRACOTTA_ROOFTILES_STAIRS.get(), 4).define('#', ECBlockRegistry.TERRACOTTA_ROOFTILES.get()).pattern("#  ").pattern("## ").pattern("###").unlockedBy("has_terracotta_rooftiles", has(ECBlockRegistry.TERRACOTTA_ROOFTILES.get())).save(consumer);

        // Other bricks
        ShapedRecipeBuilder.shaped(ECBlockRegistry.DARK_BRICKS.get(), 9).pattern("iii").pattern("idi").pattern("iii").define('i', Blocks.BRICKS).define('d', Blocks.SOUL_SAND).unlockedBy("has_soul_sand", has(Blocks.SOUL_SAND)).unlockedBy("has_bricks", has(Blocks.BRICKS)).save(consumer);
        ShapedRecipeBuilder.shaped(ECBlockRegistry.DARK_BRICKS_SLAB.get(), 6).pattern("iii").define('i', ECBlockRegistry.DARK_BRICKS.get()).unlockedBy("has_dark_bricks", has(ECBlockRegistry.DARK_BRICKS.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ECBlockRegistry.DARK_BRICKS.get()).pattern("i").pattern("i").define('i', ECBlockRegistry.DARK_BRICKS_SLAB.get()).unlockedBy("has_dark_bricks_slab", has(ECBlockRegistry.DARK_BRICKS_SLAB.get())).save(consumer, ECConstants.MODID + ":dark_bricks_from_slabs");
        ShapedRecipeBuilder.shaped(ECBlockRegistry.DARK_BRICKS_STAIRS.get(), 4).define('#', ECBlockRegistry.DARK_BRICKS.get()).pattern("#  ").pattern("## ").pattern("###").unlockedBy("has_dark_bricks", has(ECBlockRegistry.DARK_BRICKS.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ECBlockRegistry.DARK_BRICKS_WALL.get(), 6).define('#', ECBlockRegistry.DARK_BRICKS.get()).pattern("###").pattern("###").unlockedBy("has_dark_bricks", has(ECBlockRegistry.DARK_BRICKS.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ECBlockRegistry.DARK_BRICKS_PRESSURE_PLATE.get()).define('#', ECBlockRegistry.DARK_BRICKS.get()).pattern("##").unlockedBy("has_dark_bricks", has(ECBlockRegistry.DARK_BRICKS.get())).save(consumer);

        ShapedRecipeBuilder.shaped(ECBlockRegistry.DARK_LARGE_BRICKS.get(), 4).pattern("ii").pattern("ii").define('i', ECBlockRegistry.DARK_BRICKS.get()).unlockedBy("has_dark_bricks", has(ECBlockRegistry.DARK_BRICKS.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ECBlockRegistry.DARK_LARGE_BRICKS_SLAB.get(), 6).pattern("iii").define('i', ECBlockRegistry.DARK_LARGE_BRICKS.get()).unlockedBy("has_dark_large_bricks", has(ECBlockRegistry.DARK_LARGE_BRICKS.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ECBlockRegistry.DARK_LARGE_BRICKS.get()).pattern("i").pattern("i").define('i', ECBlockRegistry.DARK_LARGE_BRICKS_SLAB.get()).unlockedBy("has_dark_large_bricks_slab", has(ECBlockRegistry.DARK_LARGE_BRICKS_SLAB.get())).save(consumer, ECConstants.MODID + ":dark_large_bricks_from_slabs");
        ShapedRecipeBuilder.shaped(ECBlockRegistry.DARK_LARGE_BRICKS_STAIRS.get(), 4).define('#', ECBlockRegistry.DARK_LARGE_BRICKS.get()).pattern("#  ").pattern("## ").pattern("###").unlockedBy("has_dark_large_bricks", has(ECBlockRegistry.DARK_LARGE_BRICKS.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ECBlockRegistry.DARK_LARGE_BRICKS_WALL.get(), 6).define('#', ECBlockRegistry.DARK_LARGE_BRICKS.get()).pattern("###").pattern("###").unlockedBy("has_dark_large_bricks", has(ECBlockRegistry.DARK_LARGE_BRICKS.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ECBlockRegistry.DARK_LARGE_BRICKS_PRESSURE_PLATE.get()).define('#', ECBlockRegistry.DARK_LARGE_BRICKS.get()).pattern("##").unlockedBy("has_dark_large_bricks", has(ECBlockRegistry.DARK_LARGE_BRICKS.get())).save(consumer);

        ShapedRecipeBuilder.shaped(ECBlockRegistry.OLD_BRICKS.get(), 9).pattern("iii").pattern("idi").pattern("iii").define('i', ECBlockRegistry.WEARED_BRICKS.get()).define('d', Blocks.NETHERRACK).unlockedBy("has_netherrack", has(Blocks.NETHERRACK)).unlockedBy("has_weared_bricks", has(ECBlockRegistry.WEARED_BRICKS.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ECBlockRegistry.OLD_BRICKS_SLAB.get(), 6).pattern("iii").define('i', ECBlockRegistry.OLD_BRICKS.get()).unlockedBy("has_old_bricks", has(ECBlockRegistry.OLD_BRICKS.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ECBlockRegistry.OLD_BRICKS.get()).pattern("i").pattern("i").define('i', ECBlockRegistry.OLD_BRICKS_SLAB.get()).unlockedBy("has_old_bricks_slab", has(ECBlockRegistry.OLD_BRICKS_SLAB.get())).save(consumer, ECConstants.MODID + ":old_bricks_from_slabs");
        ShapedRecipeBuilder.shaped(ECBlockRegistry.OLD_BRICKS_STAIRS.get(), 4).define('#', ECBlockRegistry.OLD_BRICKS.get()).pattern("#  ").pattern("## ").pattern("###").unlockedBy("has_old_bricks", has(ECBlockRegistry.OLD_BRICKS.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ECBlockRegistry.OLD_BRICKS_WALL.get(), 6).define('#', ECBlockRegistry.OLD_BRICKS.get()).pattern("###").pattern("###").unlockedBy("has_old_bricks", has(ECBlockRegistry.OLD_BRICKS.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ECBlockRegistry.OLD_BRICKS_PRESSURE_PLATE.get()).define('#', ECBlockRegistry.OLD_BRICKS.get()).pattern("##").unlockedBy("has_old_bricks", has(ECBlockRegistry.OLD_BRICKS.get())).save(consumer);

        ShapedRecipeBuilder.shaped(ECBlockRegistry.OLD_LARGE_BRICKS.get(), 4).pattern("ii").pattern("ii").define('i', ECBlockRegistry.OLD_BRICKS.get()).unlockedBy("has_old_bricks", has(ECBlockRegistry.OLD_BRICKS.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ECBlockRegistry.OLD_LARGE_BRICKS_SLAB.get(), 6).pattern("iii").define('i', ECBlockRegistry.OLD_LARGE_BRICKS.get()).unlockedBy("has_old_large_bricks", has(ECBlockRegistry.OLD_LARGE_BRICKS.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ECBlockRegistry.OLD_LARGE_BRICKS.get()).pattern("i").pattern("i").define('i', ECBlockRegistry.OLD_LARGE_BRICKS_SLAB.get()).unlockedBy("has_old_large_bricks_slab", has(ECBlockRegistry.OLD_LARGE_BRICKS_SLAB.get())).save(consumer, ECConstants.MODID + ":old_large_bricks_from_slabs");
        ShapedRecipeBuilder.shaped(ECBlockRegistry.OLD_LARGE_BRICKS_STAIRS.get(), 4).define('#', ECBlockRegistry.OLD_LARGE_BRICKS.get()).pattern("#  ").pattern("## ").pattern("###").unlockedBy("has_old_large_bricks", has(ECBlockRegistry.OLD_LARGE_BRICKS.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ECBlockRegistry.OLD_LARGE_BRICKS_WALL.get(), 6).define('#', ECBlockRegistry.OLD_LARGE_BRICKS.get()).pattern("###").pattern("###").unlockedBy("has_old_large_bricks", has(ECBlockRegistry.OLD_LARGE_BRICKS.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ECBlockRegistry.OLD_LARGE_BRICKS_PRESSURE_PLATE.get()).define('#', ECBlockRegistry.OLD_LARGE_BRICKS.get()).pattern("##").unlockedBy("has_old_large_bricks", has(ECBlockRegistry.OLD_LARGE_BRICKS.get())).save(consumer);

        ShapedRecipeBuilder.shaped(ECBlockRegistry.WEARED_BRICKS.get(), 9).pattern("iii").pattern("idi").pattern("iii").define('i', Blocks.BRICKS).define('d', Blocks.NETHERRACK).unlockedBy("has_netherrack", has(Blocks.NETHERRACK)).unlockedBy("has_bricks", has(Blocks.BRICKS)).save(consumer);
        ShapedRecipeBuilder.shaped(ECBlockRegistry.WEARED_BRICKS_SLAB.get(), 6).pattern("iii").define('i', ECBlockRegistry.WEARED_BRICKS.get()).unlockedBy("has_weared_bricks", has(ECBlockRegistry.WEARED_BRICKS.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ECBlockRegistry.WEARED_BRICKS.get()).pattern("i").pattern("i").define('i', ECBlockRegistry.WEARED_BRICKS_SLAB.get()).unlockedBy("has_weared_bricks_slab", has(ECBlockRegistry.WEARED_BRICKS_SLAB.get())).save(consumer, ECConstants.MODID + ":weared_bricks_from_slabs");
        ShapedRecipeBuilder.shaped(ECBlockRegistry.WEARED_BRICKS_STAIRS.get(), 4).define('#', ECBlockRegistry.WEARED_BRICKS.get()).pattern("#  ").pattern("## ").pattern("###").unlockedBy("has_weared_bricks", has(ECBlockRegistry.WEARED_BRICKS.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ECBlockRegistry.WEARED_BRICKS_WALL.get(), 6).define('#', ECBlockRegistry.WEARED_BRICKS.get()).pattern("###").pattern("###").unlockedBy("has_weared_bricks", has(ECBlockRegistry.WEARED_BRICKS.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ECBlockRegistry.WEARED_BRICKS_PRESSURE_PLATE.get()).define('#', ECBlockRegistry.WEARED_BRICKS.get()).pattern("##").unlockedBy("has_weared_bricks", has(ECBlockRegistry.WEARED_BRICKS.get())).save(consumer);

        ShapedRecipeBuilder.shaped(ECBlockRegistry.WEARED_LARGE_BRICKS.get(), 4).pattern("ii").pattern("ii").define('i', ECBlockRegistry.WEARED_BRICKS.get()).unlockedBy("has_weared_bricks", has(ECBlockRegistry.WEARED_BRICKS.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ECBlockRegistry.WEARED_LARGE_BRICKS_SLAB.get(), 6).pattern("iii").define('i', ECBlockRegistry.WEARED_LARGE_BRICKS.get()).unlockedBy("has_weared_large_bricks", has(ECBlockRegistry.WEARED_LARGE_BRICKS.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ECBlockRegistry.WEARED_LARGE_BRICKS.get()).pattern("i").pattern("i").define('i', ECBlockRegistry.WEARED_LARGE_BRICKS_SLAB.get()).unlockedBy("has_weared_large_bricks_slab", has(ECBlockRegistry.WEARED_LARGE_BRICKS_SLAB.get())).save(consumer, ECConstants.MODID + ":weared_large_bricks_from_slabs");
        ShapedRecipeBuilder.shaped(ECBlockRegistry.WEARED_LARGE_BRICKS_STAIRS.get(), 4).define('#', ECBlockRegistry.WEARED_LARGE_BRICKS.get()).pattern("#  ").pattern("## ").pattern("###").unlockedBy("has_weared_large_bricks", has(ECBlockRegistry.WEARED_LARGE_BRICKS.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ECBlockRegistry.WEARED_LARGE_BRICKS_WALL.get(), 6).define('#', ECBlockRegistry.WEARED_LARGE_BRICKS.get()).pattern("###").pattern("###").unlockedBy("has_weared_large_bricks", has(ECBlockRegistry.WEARED_LARGE_BRICKS.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ECBlockRegistry.WEARED_LARGE_BRICKS_PRESSURE_PLATE.get()).define('#', ECBlockRegistry.WEARED_LARGE_BRICKS.get()).pattern("##").unlockedBy("has_weared_large_bricks", has(ECBlockRegistry.WEARED_LARGE_BRICKS.get())).save(consumer);

        // Pavings
        ShapedRecipeBuilder.shaped(ECBlockRegistry.CONCRETE_PAVING.get(), 4).pattern("ii").pattern("ii").define('i', Blocks.LIGHT_GRAY_CONCRETE_POWDER).unlockedBy("has_light_gray_concrete_powder", has(Blocks.LIGHT_GRAY_CONCRETE_POWDER)).save(consumer);
        ShapedRecipeBuilder.shaped(ECBlockRegistry.CONCRETE_PAVING_SLAB.get(), 6).pattern("iii").define('i', ECBlockRegistry.CONCRETE_PAVING.get()).unlockedBy("has_concrete_paving", has(ECBlockRegistry.CONCRETE_PAVING.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ECBlockRegistry.CONCRETE_PAVING.get()).pattern("i").pattern("i").define('i', ECBlockRegistry.CONCRETE_PAVING_SLAB.get()).unlockedBy("has_concrete_paving_slab", has(ECBlockRegistry.CONCRETE_PAVING_SLAB.get())).save(consumer, ECConstants.MODID + ":concrete_paving_from_slabs");
        ShapedRecipeBuilder.shaped(ECBlockRegistry.CONCRETE_PAVING_STAIRS.get(), 4).define('#', ECBlockRegistry.CONCRETE_PAVING.get()).pattern("#  ").pattern("## ").pattern("###").unlockedBy("has_concrete_paving", has(ECBlockRegistry.CONCRETE_PAVING.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ECBlockRegistry.CONCRETE_PAVING_WALL.get(), 6).define('#', ECBlockRegistry.CONCRETE_PAVING.get()).pattern("###").pattern("###").unlockedBy("has_concrete_paving", has(ECBlockRegistry.CONCRETE_PAVING.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ECBlockRegistry.CONCRETE_PAVING_PRESSURE_PLATE.get()).define('#', ECBlockRegistry.CONCRETE_PAVING.get()).pattern("##").unlockedBy("has_concrete_paving", has(ECBlockRegistry.CONCRETE_PAVING.get())).save(consumer);

        ShapedRecipeBuilder.shaped(ECBlockRegistry.DAMAGED_PAVING.get(), 4).pattern("ic").pattern("ci").define('i', Blocks.LIGHT_GRAY_CONCRETE_POWDER).define('c', Blocks.COBBLESTONE).unlockedBy("has_light_gray_concrete_powder", has(Blocks.LIGHT_GRAY_CONCRETE_POWDER)).unlockedBy("has_cobblestone", has(Blocks.COBBLESTONE)).save(consumer);
        ShapedRecipeBuilder.shaped(ECBlockRegistry.DAMAGED_PAVING_SLAB.get(), 6).pattern("iii").define('i', ECBlockRegistry.DAMAGED_PAVING.get()).unlockedBy("has_damaged_paving", has(ECBlockRegistry.DAMAGED_PAVING.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ECBlockRegistry.DAMAGED_PAVING.get()).pattern("i").pattern("i").define('i', ECBlockRegistry.DAMAGED_PAVING_SLAB.get()).unlockedBy("has_damaged_paving_slab", has(ECBlockRegistry.DAMAGED_PAVING_SLAB.get())).save(consumer, ECConstants.MODID + ":damaged_paving_from_slabs");
        ShapedRecipeBuilder.shaped(ECBlockRegistry.DAMAGED_PAVING_STAIRS.get(), 4).define('#', ECBlockRegistry.DAMAGED_PAVING.get()).pattern("#  ").pattern("## ").pattern("###").unlockedBy("has_damaged_paving", has(ECBlockRegistry.DAMAGED_PAVING.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ECBlockRegistry.DAMAGED_PAVING_WALL.get(), 6).define('#', ECBlockRegistry.DAMAGED_PAVING.get()).pattern("###").pattern("###").unlockedBy("has_damaged_paving", has(ECBlockRegistry.DAMAGED_PAVING.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ECBlockRegistry.DAMAGED_PAVING_PRESSURE_PLATE.get()).define('#', ECBlockRegistry.DAMAGED_PAVING.get()).pattern("##").unlockedBy("has_damaged_paving", has(ECBlockRegistry.DAMAGED_PAVING.get())).save(consumer);

        ShapedRecipeBuilder.shaped(ECBlockRegistry.DARK_CONCRETE_PAVING.get(), 4).pattern("ii").pattern("ii").define('i', Blocks.GRAY_CONCRETE_POWDER).unlockedBy("has_gray_concrete_powder", has(Blocks.GRAY_CONCRETE_POWDER)).save(consumer);
        ShapedRecipeBuilder.shaped(ECBlockRegistry.DARK_CONCRETE_PAVING_SLAB.get(), 6).pattern("iii").define('i', ECBlockRegistry.DARK_CONCRETE_PAVING.get()).unlockedBy("has_dark_concrete_paving", has(ECBlockRegistry.DARK_CONCRETE_PAVING.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ECBlockRegistry.DARK_CONCRETE_PAVING.get()).pattern("i").pattern("i").define('i', ECBlockRegistry.DARK_CONCRETE_PAVING_SLAB.get()).unlockedBy("has_dark_concrete_paving_slab", has(ECBlockRegistry.DARK_CONCRETE_PAVING_SLAB.get())).save(consumer, ECConstants.MODID + ":dark_concrete_paving_from_slabs");
        ShapedRecipeBuilder.shaped(ECBlockRegistry.DARK_CONCRETE_PAVING_STAIRS.get(), 4).define('#', ECBlockRegistry.DARK_CONCRETE_PAVING.get()).pattern("#  ").pattern("## ").pattern("###").unlockedBy("has_dark_concrete_paving", has(ECBlockRegistry.DARK_CONCRETE_PAVING.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ECBlockRegistry.DARK_CONCRETE_PAVING_WALL.get(), 6).define('#', ECBlockRegistry.DARK_CONCRETE_PAVING.get()).pattern("###").pattern("###").unlockedBy("has_dark_concrete_paving", has(ECBlockRegistry.DARK_CONCRETE_PAVING.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ECBlockRegistry.DARK_CONCRETE_PAVING_PRESSURE_PLATE.get()).define('#', ECBlockRegistry.DARK_CONCRETE_PAVING.get()).pattern("##").unlockedBy("has_dark_concrete_paving", has(ECBlockRegistry.DARK_CONCRETE_PAVING.get())).save(consumer);

        ShapelessRecipeBuilder.shapeless(ECBlockRegistry.MOIST_PAVING.get()).requires(ECBlockRegistry.POLISHED_PAVING.get()).requires(Blocks.VINE).unlockedBy("has_polished_paving", has(ECBlockRegistry.POLISHED_PAVING.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ECBlockRegistry.MOIST_PAVING_SLAB.get(), 6).pattern("iii").define('i', ECBlockRegistry.MOIST_PAVING.get()).unlockedBy("has_moist_paving", has(ECBlockRegistry.MOIST_PAVING.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ECBlockRegistry.MOIST_PAVING.get()).pattern("i").pattern("i").define('i', ECBlockRegistry.MOIST_PAVING_SLAB.get()).unlockedBy("has_moist_paving_slab", has(ECBlockRegistry.MOIST_PAVING_SLAB.get())).save(consumer, ECConstants.MODID + ":moist_paving_from_slabs");
        ShapedRecipeBuilder.shaped(ECBlockRegistry.MOIST_PAVING_STAIRS.get(), 4).define('#', ECBlockRegistry.MOIST_PAVING.get()).pattern("#  ").pattern("## ").pattern("###").unlockedBy("has_moist_paving", has(ECBlockRegistry.MOIST_PAVING.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ECBlockRegistry.MOIST_PAVING_WALL.get(), 6).define('#', ECBlockRegistry.MOIST_PAVING.get()).pattern("###").pattern("###").unlockedBy("has_moist_paving", has(ECBlockRegistry.MOIST_PAVING.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ECBlockRegistry.MOIST_PAVING_PRESSURE_PLATE.get()).define('#', ECBlockRegistry.MOIST_PAVING.get()).pattern("##").unlockedBy("has_moist_paving", has(ECBlockRegistry.MOIST_PAVING.get())).save(consumer);

        ShapedRecipeBuilder.shaped(ECBlockRegistry.POLISHED_PAVING.get(), 4).pattern("ii").pattern("ii").define('i', Blocks.WHITE_CONCRETE).unlockedBy("has_white_concrete", has(Blocks.WHITE_CONCRETE)).save(consumer);
        ShapedRecipeBuilder.shaped(ECBlockRegistry.POLISHED_PAVING_SLAB.get(), 6).pattern("iii").define('i', ECBlockRegistry.POLISHED_PAVING.get()).unlockedBy("has_polished_paving", has(ECBlockRegistry.POLISHED_PAVING.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ECBlockRegistry.POLISHED_PAVING.get()).pattern("i").pattern("i").define('i', ECBlockRegistry.POLISHED_PAVING_SLAB.get()).unlockedBy("has_polished_paving_slab", has(ECBlockRegistry.POLISHED_PAVING_SLAB.get())).save(consumer, ECConstants.MODID + ":polished_paving_from_slabs");
        ShapedRecipeBuilder.shaped(ECBlockRegistry.POLISHED_PAVING_STAIRS.get(), 4).define('#', ECBlockRegistry.POLISHED_PAVING.get()).pattern("#  ").pattern("## ").pattern("###").unlockedBy("has_polished_paving", has(ECBlockRegistry.POLISHED_PAVING.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ECBlockRegistry.POLISHED_PAVING_WALL.get(), 6).define('#', ECBlockRegistry.POLISHED_PAVING.get()).pattern("###").pattern("###").unlockedBy("has_polished_paving", has(ECBlockRegistry.POLISHED_PAVING.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ECBlockRegistry.POLISHED_PAVING_PRESSURE_PLATE.get()).define('#', ECBlockRegistry.POLISHED_PAVING.get()).pattern("##").unlockedBy("has_polished_paving", has(ECBlockRegistry.POLISHED_PAVING.get())).save(consumer);

        ShapedRecipeBuilder.shaped(ECBlockRegistry.WHITE_CONCRETE_PAVING.get(), 4).pattern("ii").pattern("ii").define('i', Blocks.WHITE_CONCRETE_POWDER).unlockedBy("has_white_concrete_powder", has(Blocks.WHITE_CONCRETE_POWDER)).save(consumer);
        ShapedRecipeBuilder.shaped(ECBlockRegistry.WHITE_CONCRETE_PAVING_SLAB.get(), 6).pattern("iii").define('i', ECBlockRegistry.WHITE_CONCRETE_PAVING.get()).unlockedBy("has_white_concrete_paving", has(ECBlockRegistry.WHITE_CONCRETE_PAVING.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ECBlockRegistry.WHITE_CONCRETE_PAVING.get()).pattern("i").pattern("i").define('i', ECBlockRegistry.WHITE_CONCRETE_PAVING_SLAB.get()).unlockedBy("has_white_concrete_paving_slab", has(ECBlockRegistry.WHITE_CONCRETE_PAVING_SLAB.get())).save(consumer, ECConstants.MODID + ":white_concrete_paving_from_slabs");
        ShapedRecipeBuilder.shaped(ECBlockRegistry.WHITE_CONCRETE_PAVING_STAIRS.get(), 4).define('#', ECBlockRegistry.WHITE_CONCRETE_PAVING.get()).pattern("#  ").pattern("## ").pattern("###").unlockedBy("has_white_concrete_paving", has(ECBlockRegistry.WHITE_CONCRETE_PAVING.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ECBlockRegistry.WHITE_CONCRETE_PAVING_WALL.get(), 6).define('#', ECBlockRegistry.WHITE_CONCRETE_PAVING.get()).pattern("###").pattern("###").unlockedBy("has_white_concrete_paving", has(ECBlockRegistry.WHITE_CONCRETE_PAVING.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ECBlockRegistry.WHITE_CONCRETE_PAVING_PRESSURE_PLATE.get()).define('#', ECBlockRegistry.WHITE_CONCRETE_PAVING.get()).pattern("##").unlockedBy("has_white_concrete_paving", has(ECBlockRegistry.WHITE_CONCRETE_PAVING.get())).save(consumer);

        // Tiles
        ShapedRecipeBuilder.shaped(ECBlockRegistry.CONCRETE_TILES.get(), 4).pattern("ii").pattern("ii").define('i', ECBlockRegistry.CONCRETE_PAVING.get()).unlockedBy("has_concrete_tiles", has(ECBlockRegistry.CONCRETE_PAVING.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ECBlockRegistry.CONCRETE_TILES_SLAB.get(), 6).pattern("iii").define('i', ECBlockRegistry.CONCRETE_TILES.get()).unlockedBy("has_concrete_tiles", has(ECBlockRegistry.CONCRETE_TILES.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ECBlockRegistry.CONCRETE_TILES.get()).pattern("i").pattern("i").define('i', ECBlockRegistry.CONCRETE_TILES_SLAB.get()).unlockedBy("has_concrete_tiles_slab", has(ECBlockRegistry.CONCRETE_TILES_SLAB.get())).save(consumer, ECConstants.MODID + ":concrete_tiles_from_slabs");
        ShapedRecipeBuilder.shaped(ECBlockRegistry.CONCRETE_TILES_STAIRS.get(), 4).define('#', ECBlockRegistry.CONCRETE_TILES.get()).pattern("#  ").pattern("## ").pattern("###").unlockedBy("has_concrete_tiles", has(ECBlockRegistry.CONCRETE_TILES.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ECBlockRegistry.CONCRETE_TILES_WALL.get(), 6).define('#', ECBlockRegistry.CONCRETE_TILES.get()).pattern("###").pattern("###").unlockedBy("has_concrete_tiles", has(ECBlockRegistry.CONCRETE_TILES.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ECBlockRegistry.CONCRETE_TILES_PRESSURE_PLATE.get()).define('#', ECBlockRegistry.CONCRETE_TILES.get()).pattern("##").unlockedBy("has_concrete_tiles", has(ECBlockRegistry.CONCRETE_TILES.get())).save(consumer);

        ShapedRecipeBuilder.shaped(ECBlockRegistry.SKYBLUE_TILES.get(), 8).pattern("iii").pattern("idi").pattern("iii").define('i', ECBlockRegistry.BLUE_TILES.get()).define('d', Tags.Items.DYES_WHITE).unlockedBy("has_blue_tiles", has(ECBlockRegistry.BLUE_TILES.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ECBlockRegistry.SKYBLUE_TILES_SLAB.get(), 6).pattern("iii").define('i', ECBlockRegistry.SKYBLUE_TILES.get()).unlockedBy("has_skyblue_tiles", has(ECBlockRegistry.SKYBLUE_TILES.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ECBlockRegistry.SKYBLUE_TILES.get()).pattern("i").pattern("i").define('i', ECBlockRegistry.SKYBLUE_TILES_SLAB.get()).unlockedBy("has_skyblue_tiles_slab", has(ECBlockRegistry.SKYBLUE_TILES_SLAB.get())).save(consumer, ECConstants.MODID + ":skyblue_tiles_from_slabs");
        ShapedRecipeBuilder.shaped(ECBlockRegistry.SKYBLUE_TILES_STAIRS.get(), 4).define('#', ECBlockRegistry.SKYBLUE_TILES.get()).pattern("#  ").pattern("## ").pattern("###").unlockedBy("has_skyblue_tiles", has(ECBlockRegistry.SKYBLUE_TILES.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ECBlockRegistry.SKYBLUE_TILES_WALL.get(), 6).define('#', ECBlockRegistry.SKYBLUE_TILES.get()).pattern("###").pattern("###").unlockedBy("has_skyblue_tiles", has(ECBlockRegistry.SKYBLUE_TILES.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ECBlockRegistry.SKYBLUE_TILES_PRESSURE_PLATE.get()).define('#', ECBlockRegistry.SKYBLUE_TILES.get()).pattern("##").unlockedBy("has_skyblue_tiles", has(ECBlockRegistry.SKYBLUE_TILES.get())).save(consumer);

        ShapedRecipeBuilder.shaped(ECBlockRegistry.ORANGE_TILES.get(), 8).pattern("iii").pattern("idi").pattern("iii").define('i', ECBlockRegistry.CONCRETE_TILES.get()).define('d', Tags.Items.DYES_ORANGE).unlockedBy("has_concrete_tiles", has(ECBlockRegistry.CONCRETE_TILES.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ECBlockRegistry.ORANGE_TILES_SLAB.get(), 6).pattern("iii").define('i', ECBlockRegistry.ORANGE_TILES.get()).unlockedBy("has_orange_tiles", has(ECBlockRegistry.ORANGE_TILES.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ECBlockRegistry.ORANGE_TILES.get()).pattern("i").pattern("i").define('i', ECBlockRegistry.ORANGE_TILES_SLAB.get()).unlockedBy("has_orange_tiles_slab", has(ECBlockRegistry.ORANGE_TILES_SLAB.get())).save(consumer, ECConstants.MODID + ":orange_tiles_from_slabs");
        ShapedRecipeBuilder.shaped(ECBlockRegistry.ORANGE_TILES_STAIRS.get(), 4).define('#', ECBlockRegistry.ORANGE_TILES.get()).pattern("#  ").pattern("## ").pattern("###").unlockedBy("has_orange_tiles", has(ECBlockRegistry.ORANGE_TILES.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ECBlockRegistry.ORANGE_TILES_WALL.get(), 6).define('#', ECBlockRegistry.ORANGE_TILES.get()).pattern("###").pattern("###").unlockedBy("has_orange_tiles", has(ECBlockRegistry.ORANGE_TILES.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ECBlockRegistry.ORANGE_TILES_PRESSURE_PLATE.get()).define('#', ECBlockRegistry.ORANGE_TILES.get()).pattern("##").unlockedBy("has_orange_tiles", has(ECBlockRegistry.ORANGE_TILES.get())).save(consumer);

        ShapedRecipeBuilder.shaped(ECBlockRegistry.BLUE_TILES.get(), 8).pattern("iii").pattern("idi").pattern("iii").define('i', ECBlockRegistry.CONCRETE_TILES.get()).define('d', Tags.Items.DYES_BLUE).unlockedBy("has_concrete_tiles", has(ECBlockRegistry.CONCRETE_TILES.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ECBlockRegistry.BLUE_TILES_SLAB.get(), 6).pattern("iii").define('i', ECBlockRegistry.BLUE_TILES.get()).unlockedBy("has_blue_tiles", has(ECBlockRegistry.BLUE_TILES.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ECBlockRegistry.BLUE_TILES.get()).pattern("i").pattern("i").define('i', ECBlockRegistry.BLUE_TILES_SLAB.get()).unlockedBy("has_blue_tiles_slab", has(ECBlockRegistry.BLUE_TILES_SLAB.get())).save(consumer, ECConstants.MODID + ":blue_tiles_from_slabs");
        ShapedRecipeBuilder.shaped(ECBlockRegistry.BLUE_TILES_STAIRS.get(), 4).define('#', ECBlockRegistry.BLUE_TILES.get()).pattern("#  ").pattern("## ").pattern("###").unlockedBy("has_blue_tiles", has(ECBlockRegistry.BLUE_TILES.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ECBlockRegistry.BLUE_TILES_WALL.get(), 6).define('#', ECBlockRegistry.BLUE_TILES.get()).pattern("###").pattern("###").unlockedBy("has_blue_tiles", has(ECBlockRegistry.BLUE_TILES.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ECBlockRegistry.BLUE_TILES_PRESSURE_PLATE.get()).define('#', ECBlockRegistry.BLUE_TILES.get()).pattern("##").unlockedBy("has_blue_tiles", has(ECBlockRegistry.BLUE_TILES.get())).save(consumer);

        ShapedRecipeBuilder.shaped(ECBlockRegistry.LIGHT_BLUE_TILES.get(), 8).pattern("iii").pattern("idi").pattern("iii").define('i', ECBlockRegistry.CONCRETE_TILES.get()).define('d', Tags.Items.DYES_LIGHT_BLUE).unlockedBy("has_concrete_tiles", has(ECBlockRegistry.CONCRETE_TILES.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ECBlockRegistry.LIGHT_BLUE_TILES_SLAB.get(), 6).pattern("iii").define('i', ECBlockRegistry.LIGHT_BLUE_TILES.get()).unlockedBy("has_light_blue_tiles", has(ECBlockRegistry.LIGHT_BLUE_TILES.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ECBlockRegistry.LIGHT_BLUE_TILES.get()).pattern("i").pattern("i").define('i', ECBlockRegistry.LIGHT_BLUE_TILES_SLAB.get()).unlockedBy("has_light_blue_tiles_slab", has(ECBlockRegistry.LIGHT_BLUE_TILES_SLAB.get())).save(consumer, ECConstants.MODID + ":light_blue_tiles_from_slabs");
        ShapedRecipeBuilder.shaped(ECBlockRegistry.LIGHT_BLUE_TILES_STAIRS.get(), 4).define('#', ECBlockRegistry.LIGHT_BLUE_TILES.get()).pattern("#  ").pattern("## ").pattern("###").unlockedBy("has_light_blue_tiles", has(ECBlockRegistry.LIGHT_BLUE_TILES.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ECBlockRegistry.LIGHT_BLUE_TILES_WALL.get(), 6).define('#', ECBlockRegistry.LIGHT_BLUE_TILES.get()).pattern("###").pattern("###").unlockedBy("has_light_blue_tiles", has(ECBlockRegistry.LIGHT_BLUE_TILES.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ECBlockRegistry.LIGHT_BLUE_TILES_PRESSURE_PLATE.get()).define('#', ECBlockRegistry.LIGHT_BLUE_TILES.get()).pattern("##").unlockedBy("has_light_blue_tiles", has(ECBlockRegistry.LIGHT_BLUE_TILES.get())).save(consumer);

        ShapedRecipeBuilder.shaped(ECBlockRegistry.RED_TILES.get(), 8).pattern("iii").pattern("idi").pattern("iii").define('i', ECBlockRegistry.CONCRETE_TILES.get()).define('d', Tags.Items.DYES_RED).unlockedBy("has_concrete_tiles", has(ECBlockRegistry.CONCRETE_TILES.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ECBlockRegistry.RED_TILES_SLAB.get(), 6).pattern("iii").define('i', ECBlockRegistry.RED_TILES.get()).unlockedBy("has_red_tiles", has(ECBlockRegistry.RED_TILES.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ECBlockRegistry.RED_TILES.get()).pattern("i").pattern("i").define('i', ECBlockRegistry.RED_TILES_SLAB.get()).unlockedBy("has_red_tiles_slab", has(ECBlockRegistry.RED_TILES_SLAB.get())).save(consumer, ECConstants.MODID + ":red_tiles_from_slabs");
        ShapedRecipeBuilder.shaped(ECBlockRegistry.RED_TILES_STAIRS.get(), 4).define('#', ECBlockRegistry.RED_TILES.get()).pattern("#  ").pattern("## ").pattern("###").unlockedBy("has_red_tiles", has(ECBlockRegistry.RED_TILES.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ECBlockRegistry.RED_TILES_WALL.get(), 6).define('#', ECBlockRegistry.RED_TILES.get()).pattern("###").pattern("###").unlockedBy("has_red_tiles", has(ECBlockRegistry.RED_TILES.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ECBlockRegistry.RED_TILES_PRESSURE_PLATE.get()).define('#', ECBlockRegistry.RED_TILES.get()).pattern("##").unlockedBy("has_red_tiles", has(ECBlockRegistry.RED_TILES.get())).save(consumer);

        ShapedRecipeBuilder.shaped(ECBlockRegistry.WHITE_TILES.get(), 8).pattern("iii").pattern("idi").pattern("iii").define('i', ECBlockRegistry.CONCRETE_TILES.get()).define('d', Tags.Items.DYES_WHITE).unlockedBy("has_concrete_tiles", has(ECBlockRegistry.CONCRETE_TILES.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ECBlockRegistry.WHITE_TILES_SLAB.get(), 6).pattern("iii").define('i', ECBlockRegistry.WHITE_TILES.get()).unlockedBy("has_white_tiles", has(ECBlockRegistry.WHITE_TILES.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ECBlockRegistry.WHITE_TILES.get()).pattern("i").pattern("i").define('i', ECBlockRegistry.WHITE_TILES_SLAB.get()).unlockedBy("has_white_tiles_slab", has(ECBlockRegistry.WHITE_TILES_SLAB.get())).save(consumer, ECConstants.MODID + ":white_tiles_from_slabs");
        ShapedRecipeBuilder.shaped(ECBlockRegistry.WHITE_TILES_STAIRS.get(), 4).define('#', ECBlockRegistry.WHITE_TILES.get()).pattern("#  ").pattern("## ").pattern("###").unlockedBy("has_white_tiles", has(ECBlockRegistry.WHITE_TILES.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ECBlockRegistry.WHITE_TILES_WALL.get(), 6).define('#', ECBlockRegistry.WHITE_TILES.get()).pattern("###").pattern("###").unlockedBy("has_white_tiles", has(ECBlockRegistry.WHITE_TILES.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ECBlockRegistry.WHITE_TILES_PRESSURE_PLATE.get()).define('#', ECBlockRegistry.WHITE_TILES.get()).pattern("##").unlockedBy("has_white_tiles", has(ECBlockRegistry.WHITE_TILES.get())).save(consumer);

        ShapedRecipeBuilder.shaped(ECBlockRegistry.YELLOW_TILES.get(), 8).pattern("iii").pattern("idi").pattern("iii").define('i', ECBlockRegistry.CONCRETE_TILES.get()).define('d', Tags.Items.DYES_YELLOW).unlockedBy("has_concrete_tiles", has(ECBlockRegistry.CONCRETE_TILES.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ECBlockRegistry.YELLOW_TILES_SLAB.get(), 6).pattern("iii").define('i', ECBlockRegistry.YELLOW_TILES.get()).unlockedBy("has_yellow_tiles", has(ECBlockRegistry.YELLOW_TILES.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ECBlockRegistry.YELLOW_TILES.get()).pattern("i").pattern("i").define('i', ECBlockRegistry.YELLOW_TILES_SLAB.get()).unlockedBy("has_yellow_tiles_slab", has(ECBlockRegistry.YELLOW_TILES_SLAB.get())).save(consumer, ECConstants.MODID + ":yellow_tiles_from_slabs");
        ShapedRecipeBuilder.shaped(ECBlockRegistry.YELLOW_TILES_STAIRS.get(), 4).define('#', ECBlockRegistry.YELLOW_TILES.get()).pattern("#  ").pattern("## ").pattern("###").unlockedBy("has_yellow_tiles", has(ECBlockRegistry.YELLOW_TILES.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ECBlockRegistry.YELLOW_TILES_WALL.get(), 6).define('#', ECBlockRegistry.YELLOW_TILES.get()).pattern("###").pattern("###").unlockedBy("has_yellow_tiles", has(ECBlockRegistry.YELLOW_TILES.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ECBlockRegistry.YELLOW_TILES_PRESSURE_PLATE.get()).define('#', ECBlockRegistry.YELLOW_TILES.get()).pattern("##").unlockedBy("has_yellow_tiles", has(ECBlockRegistry.YELLOW_TILES.get())).save(consumer);

        ShapedRecipeBuilder.shaped(ECBlockRegistry.YELLOW_GREY_TILES.get(), 8).pattern("iii").pattern("idi").pattern("iii").define('i', ECBlockRegistry.YELLOW_TILES.get()).define('d', Tags.Items.DYES_GRAY).unlockedBy("has_yellow_tiles", has(ECBlockRegistry.YELLOW_TILES.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ECBlockRegistry.YELLOW_GREY_TILES_SLAB.get(), 6).pattern("iii").define('i', ECBlockRegistry.YELLOW_GREY_TILES.get()).unlockedBy("has_concrete_tiles", has(ECBlockRegistry.YELLOW_GREY_TILES.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ECBlockRegistry.YELLOW_GREY_TILES.get()).pattern("i").pattern("i").define('i', ECBlockRegistry.YELLOW_GREY_TILES_SLAB.get()).unlockedBy("has_concrete_tiles_slab", has(ECBlockRegistry.YELLOW_GREY_TILES_SLAB.get())).save(consumer, ECConstants.MODID + ":yellow_grey_tiles_from_slabs");
        ShapedRecipeBuilder.shaped(ECBlockRegistry.YELLOW_GREY_TILES_STAIRS.get(), 4).define('#', ECBlockRegistry.YELLOW_GREY_TILES.get()).pattern("#  ").pattern("## ").pattern("###").unlockedBy("has_concrete_tiles", has(ECBlockRegistry.YELLOW_GREY_TILES.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ECBlockRegistry.YELLOW_GREY_TILES_WALL.get(), 6).define('#', ECBlockRegistry.YELLOW_GREY_TILES.get()).pattern("###").pattern("###").unlockedBy("has_concrete_tiles", has(ECBlockRegistry.YELLOW_GREY_TILES.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ECBlockRegistry.YELLOW_GREY_TILES_PRESSURE_PLATE.get()).define('#', ECBlockRegistry.YELLOW_GREY_TILES.get()).pattern("##").unlockedBy("has_concrete_tiles", has(ECBlockRegistry.YELLOW_GREY_TILES.get())).save(consumer);

        // Corrugated metal plates
        for(int j = 0; j < Arrays.stream(DyeColor.values()).count(); j++)
        {
            ShapedRecipeBuilder.shaped(ECBlockRegistry.CORRUGATED_METAL_PLATE_BLOCKS.get(DyeColor.byId(j)).get(), 16).pattern("iii").pattern("idi").pattern("iii").define('i', BaseTags.ForgeItems.PLATES_STEEL).define('d', DyeColor.byId(j).getTag()).unlockedBy("has_steel_plate", has(BaseTags.ForgeItems.PLATES_STEEL)).save(consumer);
            ShapedRecipeBuilder.shaped(ECBlockRegistry.CORRUGATED_METAL_PLATE_SLABS.get(DyeColor.byId(j)).get(), 6).pattern("iii").define('i', ECBlockRegistry.CORRUGATED_METAL_PLATE_BLOCKS.get(DyeColor.byId(j)).get()).unlockedBy("has_" + DyeColor.byId(j).getSerializedName() + "_corrugated_metal_plate", has(ECBlockRegistry.CORRUGATED_METAL_PLATE_BLOCKS.get(DyeColor.byId(j)).get())).save(consumer);
            ShapedRecipeBuilder.shaped(ECBlockRegistry.CORRUGATED_METAL_PLATE_BLOCKS.get(DyeColor.byId(j)).get()).pattern("i").pattern("i").define('i', ECBlockRegistry.CORRUGATED_METAL_PLATE_SLABS.get(DyeColor.byId(j)).get()).unlockedBy("has_" + DyeColor.byId(j).getSerializedName() + "_corrugated_metal_plate_slab", has(ECBlockRegistry.CORRUGATED_METAL_PLATE_SLABS.get(DyeColor.byId(j)).get())).save(consumer, ECConstants.MODID + ":" + DyeColor.byId(j).getSerializedName() + "_corrugated_metal_plate_from_slabs");
            ShapedRecipeBuilder.shaped(ECBlockRegistry.CORRUGATED_METAL_PLATE_STAIRS.get(DyeColor.byId(j)).get(), 4).define('#', ECBlockRegistry.CORRUGATED_METAL_PLATE_BLOCKS.get(DyeColor.byId(j)).get()).pattern("#  ").pattern("## ").pattern("###").unlockedBy("has_" + DyeColor.byId(j).getSerializedName() + "_corrugated_metal_plate", has(ECBlockRegistry.CORRUGATED_METAL_PLATE_BLOCKS.get(DyeColor.byId(j)).get())).save(consumer);
            ShapedRecipeBuilder.shaped(ECBlockRegistry.CORRUGATED_METAL_PLATE_WALLS.get(DyeColor.byId(j)).get(), 6).define('#', ECBlockRegistry.CORRUGATED_METAL_PLATE_BLOCKS.get(DyeColor.byId(j)).get()).pattern("###").pattern("###").unlockedBy("has_" + DyeColor.byId(j).getSerializedName() + "_corrugated_metal_plate", has(ECBlockRegistry.CORRUGATED_METAL_PLATE_BLOCKS.get(DyeColor.byId(j)).get())).save(consumer);
            ShapedRecipeBuilder.shaped(ECBlockRegistry.CORRUGATED_METAL_PLATE_PRESSURE_PLATES.get(DyeColor.byId(j)).get()).define('#', ECBlockRegistry.CORRUGATED_METAL_PLATE_BLOCKS.get(DyeColor.byId(j)).get()).pattern("##").unlockedBy("has_" + DyeColor.byId(j).getSerializedName() + "_corrugated_metal_plate", has(ECBlockRegistry.CORRUGATED_METAL_PLATE_BLOCKS.get(DyeColor.byId(j)).get())).save(consumer);
            ShapedRecipeBuilder.shaped(ECBlockRegistry.CORRUGATED_METAL_PLATE_FENCES.get(DyeColor.byId(j)).get(), 6).define('S', BaseTags.ForgeItems.RODS_STEEL).define('#', ECBlockRegistry.CORRUGATED_METAL_PLATE_BLOCKS.get(DyeColor.byId(j)).get()).pattern("#S#").pattern("#S#").unlockedBy("has_" + DyeColor.byId(j).getSerializedName() + "_corrugated_metal_plate", has(ECBlockRegistry.CORRUGATED_METAL_PLATE_BLOCKS.get(DyeColor.byId(j)).get())).save(consumer);
            ShapedRecipeBuilder.shaped(ECBlockRegistry.CORRUGATED_METAL_PLATE_FENCE_GATES.get(DyeColor.byId(j)).get(), 6).define('S', BaseTags.ForgeItems.RODS_STEEL).define('#', ECBlockRegistry.CORRUGATED_METAL_PLATE_BLOCKS.get(DyeColor.byId(j)).get()).pattern("S#S").pattern("S#S").unlockedBy("has_" + DyeColor.byId(j).getSerializedName() + "_corrugated_metal_plate", has(ECBlockRegistry.CORRUGATED_METAL_PLATE_BLOCKS.get(DyeColor.byId(j)).get())).save(consumer);
        }

        // Metal blocks
        ShapedRecipeBuilder.shaped(ECBlockRegistry.LIGHT_METAL_FLOOR.get(), 8).pattern("iid").pattern("ii ").define('i', BaseTags.ForgeItems.PLATES_STEEL).define('d', Tags.Items.DYES_GRAY).unlockedBy("has_steel_plate", has(BaseTags.ForgeItems.PLATES_STEEL)).save(consumer);
        ShapedRecipeBuilder.shaped(ECBlockRegistry.LIGHT_METAL_FLOOR_SLAB.get(), 6).pattern("iii").define('i', ECBlockRegistry.LIGHT_METAL_FLOOR.get()).unlockedBy("has_light_metal_floor", has(ECBlockRegistry.LIGHT_METAL_FLOOR.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ECBlockRegistry.LIGHT_METAL_FLOOR.get()).pattern("i").pattern("i").define('i', ECBlockRegistry.LIGHT_METAL_FLOOR_SLAB.get()).unlockedBy("has_light_metal_floor_slab", has(ECBlockRegistry.LIGHT_METAL_FLOOR_SLAB.get())).save(consumer, ECConstants.MODID + ":light_metal_floor_from_slabs");
        ShapedRecipeBuilder.shaped(ECBlockRegistry.LIGHT_METAL_FLOOR_STAIRS.get(), 4).define('#', ECBlockRegistry.LIGHT_METAL_FLOOR.get()).pattern("#  ").pattern("## ").pattern("###").unlockedBy("has_light_metal_floor", has(ECBlockRegistry.LIGHT_METAL_FLOOR.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ECBlockRegistry.LIGHT_METAL_FLOOR_WALL.get(), 6).define('#', ECBlockRegistry.LIGHT_METAL_FLOOR.get()).pattern("###").pattern("###").unlockedBy("has_light_metal_floor", has(ECBlockRegistry.LIGHT_METAL_FLOOR.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ECBlockRegistry.LIGHT_METAL_FLOOR_PRESSURE_PLATE.get()).define('#', ECBlockRegistry.LIGHT_METAL_FLOOR.get()).pattern("##").unlockedBy("has_light_metal_floor", has(ECBlockRegistry.LIGHT_METAL_FLOOR.get())).save(consumer);

        ShapedRecipeBuilder.shaped(ECBlockRegistry.DARK_METAL_FLOOR.get(), 8).pattern("iid").pattern("ii ").define('i', BaseTags.ForgeItems.PLATES_STEEL).define('d', Tags.Items.DYES_BLACK).unlockedBy("has_steel_plate", has(BaseTags.ForgeItems.PLATES_STEEL)).save(consumer);
        ShapedRecipeBuilder.shaped(ECBlockRegistry.DARK_METAL_FLOOR_SLAB.get(), 6).pattern("iii").define('i', ECBlockRegistry.DARK_METAL_FLOOR.get()).unlockedBy("has_dark_metal_floor", has(ECBlockRegistry.DARK_METAL_FLOOR.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ECBlockRegistry.DARK_METAL_FLOOR.get()).pattern("i").pattern("i").define('i', ECBlockRegistry.DARK_METAL_FLOOR_SLAB.get()).unlockedBy("has_dark_metal_floor_slab", has(ECBlockRegistry.DARK_METAL_FLOOR_SLAB.get())).save(consumer, ECConstants.MODID + ":dark_metal_floor_from_slabs");
        ShapedRecipeBuilder.shaped(ECBlockRegistry.DARK_METAL_FLOOR_STAIRS.get(), 4).define('#', ECBlockRegistry.DARK_METAL_FLOOR.get()).pattern("#  ").pattern("## ").pattern("###").unlockedBy("has_dark_metal_floor", has(ECBlockRegistry.DARK_METAL_FLOOR.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ECBlockRegistry.DARK_METAL_FLOOR_WALL.get(), 6).define('#', ECBlockRegistry.DARK_METAL_FLOOR.get()).pattern("###").pattern("###").unlockedBy("has_dark_metal_floor", has(ECBlockRegistry.DARK_METAL_FLOOR.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ECBlockRegistry.DARK_METAL_FLOOR_PRESSURE_PLATE.get()).define('#', ECBlockRegistry.DARK_METAL_FLOOR.get()).pattern("##").unlockedBy("has_dark_metal_floor", has(ECBlockRegistry.DARK_METAL_FLOOR.get())).save(consumer);

        ShapedRecipeBuilder.shaped(ECBlockRegistry.RUSTY_PLATE.get(), 8).pattern(" i ").pattern("idi").pattern(" i ").define('i', BaseTags.ForgeItems.PLATES_STEEL).define('d', Tags.Items.DYES_ORANGE).unlockedBy("has_steel_plate", has(BaseTags.ForgeItems.PLATES_STEEL)).save(consumer);
        ShapedRecipeBuilder.shaped(ECBlockRegistry.RUSTY_PLATE_SLAB.get(), 6).pattern("iii").define('i', ECBlockRegistry.RUSTY_PLATE.get()).unlockedBy("has_rusty_plate", has(ECBlockRegistry.RUSTY_PLATE.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ECBlockRegistry.RUSTY_PLATE.get()).pattern("i").pattern("i").define('i', ECBlockRegistry.RUSTY_PLATE_SLAB.get()).unlockedBy("has_rusty_plate_slab", has(ECBlockRegistry.RUSTY_PLATE_SLAB.get())).save(consumer, ECConstants.MODID + ":rusty_plate_from_slabs");
        ShapedRecipeBuilder.shaped(ECBlockRegistry.RUSTY_PLATE_STAIRS.get(), 4).define('#', ECBlockRegistry.RUSTY_PLATE.get()).pattern("#  ").pattern("## ").pattern("###").unlockedBy("has_rusty_plate", has(ECBlockRegistry.RUSTY_PLATE.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ECBlockRegistry.RUSTY_PLATE_WALL.get(), 6).define('#', ECBlockRegistry.RUSTY_PLATE.get()).pattern("###").pattern("###").unlockedBy("has_rusty_plate", has(ECBlockRegistry.RUSTY_PLATE.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ECBlockRegistry.RUSTY_PLATE_PRESSURE_PLATE.get()).define('#', ECBlockRegistry.RUSTY_PLATE.get()).pattern("##").unlockedBy("has_rusty_plate", has(ECBlockRegistry.RUSTY_PLATE.get())).save(consumer);

        ShapedRecipeBuilder.shaped(ECBlockRegistry.IRON_BEAM.get(), 3).pattern("iii").define('i', Tags.Items.INGOTS_IRON).unlockedBy("has_iron_ingot", has(Tags.Items.INGOTS_IRON)).save(consumer);
        ShapelessRecipeBuilder.shapeless(ECBlockRegistry.BOLTED_IRON_BEAM.get()).requires(ECBlockRegistry.IRON_BEAM.get()).requires(BaseItems.BOLT.get()).unlockedBy("has_iron_beam", has(ECBlockRegistry.IRON_BEAM.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ECBlockRegistry.IRON_BEAM_JUNCTION.get()).requires(ECBlockRegistry.IRON_BEAM.get()).unlockedBy("has_iron_beam", has(ECBlockRegistry.IRON_BEAM.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ECBlockRegistry.STEEL_BEAM.get(), 9).pattern("iii").define('i', BaseTags.ForgeItems.INGOTS_STEEL).unlockedBy("has_steel_ingot", has(BaseTags.ForgeItems.INGOTS_STEEL)).save(consumer);
        ShapelessRecipeBuilder.shapeless(ECBlockRegistry.BOLTED_STEEL_BEAM.get()).requires(ECBlockRegistry.STEEL_BEAM.get()).requires(BaseItems.BOLT.get()).unlockedBy("has_steel_beam", has(ECBlockRegistry.STEEL_BEAM.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ECBlockRegistry.STEEL_BEAM_JUNCTION.get()).requires(ECBlockRegistry.STEEL_BEAM.get()).unlockedBy("has_steel_beam", has(ECBlockRegistry.STEEL_BEAM.get())).save(consumer);

        ShapedRecipeBuilder.shaped(ECBlockRegistry.AIR_DUCT.get(), 12).pattern(" i ").pattern("igi").pattern(" i ").define('i', BaseTags.ForgeItems.INGOTS_STEEL).define('g', Blocks.IRON_BARS).unlockedBy("has_steel_ingot", has(BaseTags.ForgeItems.INGOTS_STEEL)).save(consumer);
        ShapelessRecipeBuilder.shapeless(ECBlockRegistry.VENT_AIR_DUCT.get()).requires(ECBlockRegistry.AIR_DUCT.get()).requires(Blocks.IRON_BARS).unlockedBy("has_air_duct", has(ECBlockRegistry.AIR_DUCT.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ECBlockRegistry.GRID_AIR_DUCT.get()).requires(ECBlockRegistry.VENT_AIR_DUCT.get()).requires(Blocks.IRON_BARS).unlockedBy("has_vent_air_duct", has(ECBlockRegistry.VENT_AIR_DUCT.get())).save(consumer);

        ShapedRecipeBuilder.shaped(ECBlockRegistry.BULKHEAD.get(), 2).pattern("i").pattern("i").define('i', ECBlockRegistry.IRON_BEAM.get()).unlockedBy("has_iron_beam", has(ECBlockRegistry.IRON_BEAM.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ECBlockRegistry.BULKHEAD_TOP.get(), 2).pattern("c").pattern("i").define('c', Tags.Items.GRAVEL).define('i', ECBlockRegistry.BULKHEAD.get()).unlockedBy("has_bulkhead", has(ECBlockRegistry.BULKHEAD.get())).save(consumer);

        ShapedRecipeBuilder.shaped(ECBlockRegistry.STEEL_WALL_LADDER.get(), 16).pattern("r r").pattern("iri").pattern("r r").define('r', BaseTags.ForgeItems.RODS_STEEL).define('i', BaseTags.ForgeItems.INGOTS_STEEL).unlockedBy("has_steel_ingot", has(BaseTags.ForgeItems.INGOTS_STEEL)).unlockedBy("has_steel_rod", has(BaseTags.ForgeItems.RODS_STEEL)).save(consumer);
        ShapedRecipeBuilder.shaped(ECBlockRegistry.RUSTY_WALL_LADDER.get(), 8).pattern("lll").pattern("lbl").pattern("lll").define('l', ECBlockRegistry.STEEL_WALL_LADDER.get()).define('b', Items.WATER_BUCKET).unlockedBy("has_steel_wall_ladder", has(ECBlockRegistry.STEEL_WALL_LADDER.get())).save(consumer);

        ShapedRecipeBuilder.shaped(ECBlockRegistry.STEEL_RUNGS.get(), 8).pattern("r r").pattern(" r ").define('r', BaseTags.ForgeItems.RODS_STEEL).unlockedBy("has_steel_rod", has(BaseTags.ForgeItems.RODS_STEEL)).save(consumer);
        ShapedRecipeBuilder.shaped(ECBlockRegistry.RUSTY_RUNGS.get(), 8).pattern("lll").pattern("lbl").pattern("lll").define('l', ECBlockRegistry.STEEL_RUNGS.get()).define('b', Items.WATER_BUCKET).unlockedBy("has_steel_rungs", has(ECBlockRegistry.STEEL_RUNGS.get())).save(consumer);

        // Wallpapers
        ShapedRecipeBuilder.shaped(ECBlockRegistry.WHITE_BLUE_WALLPAPER.get(), 3).pattern("  s").pattern("lps").pattern("  s").define('s', Blocks.STONE).define('l', Tags.Items.DYES_LIGHT_BLUE).define('p', Items.PAPER).unlockedBy("has_paper", has(Items.PAPER)).save(consumer);
        ShapedRecipeBuilder.shaped(ECBlockRegistry.WHITE_BLUE_WALLPAPER_SLAB.get(), 6).pattern("iii").define('i', ECBlockRegistry.WHITE_BLUE_WALLPAPER.get()).unlockedBy("has_white_blue_wallpaper", has(ECBlockRegistry.WHITE_BLUE_WALLPAPER.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ECBlockRegistry.WHITE_BLUE_WALLPAPER.get()).pattern("i").pattern("i").define('i', ECBlockRegistry.WHITE_BLUE_WALLPAPER_SLAB.get()).unlockedBy("has_white_blue_wallpaper_slab", has(ECBlockRegistry.WHITE_BLUE_WALLPAPER_SLAB.get())).save(consumer, ECConstants.MODID + ":white_blue_wallpaper_from_slabs");
        ShapedRecipeBuilder.shaped(ECBlockRegistry.WHITE_BLUE_WALLPAPER_STAIRS.get(), 4).define('#', ECBlockRegistry.WHITE_BLUE_WALLPAPER.get()).pattern("#  ").pattern("## ").pattern("###").unlockedBy("has_white_blue_wallpaper", has(ECBlockRegistry.WHITE_BLUE_WALLPAPER.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ECBlockRegistry.WHITE_BLUE_WALLPAPER_PLINTH.get()).pattern("w").pattern("s").define('w', ECBlockRegistry.WHITE_BLUE_WALLPAPER.get()).define('s', ItemTags.WOODEN_SLABS).unlockedBy("has_white_blue_wallpaper", has(ECBlockRegistry.WHITE_BLUE_WALLPAPER.get())).save(consumer);

        ShapedRecipeBuilder.shaped(ECBlockRegistry.BEIGE_FLOWER_WALLPAPER.get(), 3).pattern("  s").pattern("lps").pattern("g s").define('s', Blocks.STONE).define('l', Tags.Items.DYES_PINK).define('p', Items.PAPER).define('g', Tags.Items.DYES_GRAY).unlockedBy("has_paper", has(Items.PAPER)).save(consumer);
        ShapedRecipeBuilder.shaped(ECBlockRegistry.BEIGE_FLOWER_WALLPAPER_SLAB.get(), 6).pattern("iii").define('i', ECBlockRegistry.BEIGE_FLOWER_WALLPAPER.get()).unlockedBy("has_beige_flower_wallpaper", has(ECBlockRegistry.BEIGE_FLOWER_WALLPAPER.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ECBlockRegistry.BEIGE_FLOWER_WALLPAPER.get()).pattern("i").pattern("i").define('i', ECBlockRegistry.BEIGE_FLOWER_WALLPAPER_SLAB.get()).unlockedBy("has_beige_flower_wallpaper_slab", has(ECBlockRegistry.BEIGE_FLOWER_WALLPAPER_SLAB.get())).save(consumer, ECConstants.MODID + ":beige_flower_wallpaper_from_slabs");
        ShapedRecipeBuilder.shaped(ECBlockRegistry.BEIGE_FLOWER_WALLPAPER_STAIRS.get(), 4).define('#', ECBlockRegistry.BEIGE_FLOWER_WALLPAPER.get()).pattern("#  ").pattern("## ").pattern("###").unlockedBy("has_beige_flower_wallpaper", has(ECBlockRegistry.BEIGE_FLOWER_WALLPAPER.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ECBlockRegistry.BEIGE_FLOWER_WALLPAPER_PLINTH.get()).pattern("w").pattern("s").define('w', ECBlockRegistry.BEIGE_FLOWER_WALLPAPER.get()).define('s', ItemTags.WOODEN_SLABS).unlockedBy("has_beige_flower_wallpaper", has(ECBlockRegistry.BEIGE_FLOWER_WALLPAPER.get())).save(consumer);

        ShapedRecipeBuilder.shaped(ECBlockRegistry.BEIGE_WALLPAPER.get(), 3).pattern("  s").pattern("lps").pattern("w s").define('s', Blocks.STONE).define('l', Tags.Items.DYES_PINK).define('w', Tags.Items.DYES_WHITE).define('p', Items.PAPER).unlockedBy("has_paper", has(Items.PAPER)).save(consumer);
        ShapedRecipeBuilder.shaped(ECBlockRegistry.BEIGE_WALLPAPER_SLAB.get(), 6).pattern("iii").define('i', ECBlockRegistry.BEIGE_WALLPAPER.get()).unlockedBy("has_beige_wallpaper", has(ECBlockRegistry.BEIGE_WALLPAPER.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ECBlockRegistry.BEIGE_WALLPAPER.get()).pattern("i").pattern("i").define('i', ECBlockRegistry.BEIGE_WALLPAPER_SLAB.get()).unlockedBy("has_beige_wallpaper_slab", has(ECBlockRegistry.BEIGE_WALLPAPER_SLAB.get())).save(consumer, ECConstants.MODID + ":beige_wallpaper_from_slabs");
        ShapedRecipeBuilder.shaped(ECBlockRegistry.BEIGE_WALLPAPER_STAIRS.get(), 4).define('#', ECBlockRegistry.BEIGE_WALLPAPER.get()).pattern("#  ").pattern("## ").pattern("###").unlockedBy("has_beige_wallpaper", has(ECBlockRegistry.BEIGE_WALLPAPER.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ECBlockRegistry.BEIGE_WALLPAPER_PLINTH.get()).pattern("w").pattern("s").define('w', ECBlockRegistry.BEIGE_WALLPAPER.get()).define('s', ItemTags.WOODEN_SLABS).unlockedBy("has_beige_wallpaper", has(ECBlockRegistry.BEIGE_WALLPAPER.get())).save(consumer);

        ShapedRecipeBuilder.shaped(ECBlockRegistry.PINK_WALLPAPER.get(), 3).pattern("  s").pattern("lps").pattern("  s").define('s', Blocks.STONE).define('l', Tags.Items.DYES_PINK).define('p', Items.PAPER).unlockedBy("has_paper", has(Items.PAPER)).save(consumer);
        ShapedRecipeBuilder.shaped(ECBlockRegistry.PINK_WALLPAPER_SLAB.get(), 6).pattern("iii").define('i', ECBlockRegistry.PINK_WALLPAPER.get()).unlockedBy("has_pink_wallpaper", has(ECBlockRegistry.PINK_WALLPAPER.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ECBlockRegistry.PINK_WALLPAPER.get()).pattern("i").pattern("i").define('i', ECBlockRegistry.PINK_WALLPAPER_SLAB.get()).unlockedBy("has_pink_wallpaper_slab", has(ECBlockRegistry.PINK_WALLPAPER_SLAB.get())).save(consumer, ECConstants.MODID + ":pink_wallpaper_from_slabs");
        ShapedRecipeBuilder.shaped(ECBlockRegistry.PINK_WALLPAPER_STAIRS.get(), 4).define('#', ECBlockRegistry.PINK_WALLPAPER.get()).pattern("#  ").pattern("## ").pattern("###").unlockedBy("has_pink_wallpaper", has(ECBlockRegistry.PINK_WALLPAPER.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ECBlockRegistry.PINK_WALLPAPER_PLINTH.get()).pattern("w").pattern("s").define('w', ECBlockRegistry.PINK_WALLPAPER.get()).define('s', ItemTags.WOODEN_SLABS).unlockedBy("has_pink_wallpaper", has(ECBlockRegistry.PINK_WALLPAPER.get())).save(consumer);

        ShapedRecipeBuilder.shaped(ECBlockRegistry.WHITE_GREEN_WALLPAPER.get(), 3).pattern("  s").pattern("lps").pattern("  s").define('s', Blocks.STONE).define('l', Tags.Items.DYES_LIME).define('p', Items.PAPER).unlockedBy("has_paper", has(Items.PAPER)).save(consumer);
        ShapedRecipeBuilder.shaped(ECBlockRegistry.WHITE_GREEN_WALLPAPER_SLAB.get(), 6).pattern("iii").define('i', ECBlockRegistry.WHITE_GREEN_WALLPAPER.get()).unlockedBy("has_white_green_wallpaper", has(ECBlockRegistry.WHITE_GREEN_WALLPAPER.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ECBlockRegistry.WHITE_GREEN_WALLPAPER.get()).pattern("i").pattern("i").define('i', ECBlockRegistry.WHITE_GREEN_WALLPAPER_SLAB.get()).unlockedBy("has_white_green_wallpaper_slab", has(ECBlockRegistry.WHITE_GREEN_WALLPAPER_SLAB.get())).save(consumer, ECConstants.MODID + ":white_green_wallpaper_from_slabs");
        ShapedRecipeBuilder.shaped(ECBlockRegistry.WHITE_GREEN_WALLPAPER_STAIRS.get(), 4).define('#', ECBlockRegistry.WHITE_GREEN_WALLPAPER.get()).pattern("#  ").pattern("## ").pattern("###").unlockedBy("has_white_green_wallpaper", has(ECBlockRegistry.WHITE_GREEN_WALLPAPER.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ECBlockRegistry.WHITE_GREEN_WALLPAPER_PLINTH.get()).pattern("w").pattern("s").define('w', ECBlockRegistry.WHITE_GREEN_WALLPAPER.get()).define('s', ItemTags.WOODEN_SLABS).unlockedBy("has_white_green_wallpaper", has(ECBlockRegistry.WHITE_GREEN_WALLPAPER.get())).save(consumer);

        // Furniture
        for(int j = 0; j < Arrays.stream(McWoods.values()).count(); j++)
        {
            ShapedRecipeBuilder.shaped(ECBlockRegistry.CHAIR_BLOCKS.get(McWoods.byId(j)).get()).define('W', ECConstants.McWoodenSlabs[j]).define('S', Tags.Items.RODS_WOODEN).pattern("S  ").pattern("SWS").pattern("S S").group("chairs").unlockedBy("has_" + McWoods.byId(j).getSerializedName() + "_slab", has(ECConstants.McWoodenSlabs[j])).save(consumer);
            ShapedRecipeBuilder.shaped(ECBlockRegistry.TERRACE_CHAIR_BLOCKS.get(McWoods.byId(j)).get()).define('W', ECConstants.McWoodenPressures[j]).define('S', Tags.Items.RODS_WOODEN).pattern("S  ").pattern("SWS").pattern("S S").group("terrace_chairs").unlockedBy("has_" + McWoods.byId(j).getSerializedName() + "_pressure_plate", has(ECConstants.McWoodenPressures[j])).save(consumer);
            ShapedRecipeBuilder.shaped(ECBlockRegistry.TABLE_BLOCKS.get(McWoods.byId(j)).get()).define('W', ECConstants.McWoodenSlabs[j]).define('S', Tags.Items.RODS_WOODEN).pattern("SWS").pattern("S S").pattern("S S").group("tables").unlockedBy("has_" + McWoods.byId(j).getSerializedName() + "_slab", has(ECConstants.McWoodenSlabs[j])).save(consumer);
            ShapedRecipeBuilder.shaped(ECBlockRegistry.TERRACE_TABLE_BLOCKS.get(McWoods.byId(j)).get()).define('W', ECConstants.McWoodenPressures[j]).define('S', Tags.Items.RODS_WOODEN).pattern("WWW").pattern(" S ").pattern(" S ").group("terrace_tables").unlockedBy("has_" + McWoods.byId(j).getSerializedName() + "_pressure_plate", has(ECConstants.McWoodenPressures[j])).save(consumer);
            ShapedRecipeBuilder.shaped(ECBlockRegistry.FANCY_TABLE_BLOCKS.get(McWoods.byId(j)).get(), 2).define('W', ECConstants.McWoodenPlanks[j]).define('S', ECConstants.McWoodenLogs[j]).pattern("WWW").pattern("S S").pattern("S S").group("fancy_tables").unlockedBy("has_" + McWoods.byId(j).getSerializedName() + "_planks", has(ECConstants.McWoodenPlanks[j])).save(consumer);
            ShapedRecipeBuilder.shaped(ECBlockRegistry.FANCY_DOOR_BLOCKS.get(McWoods.byId(j)).get(), 3).define('P', ECConstants.McWoodenPlanks[j]).define('B', ECConstants.McWoodenButtons[j]).pattern("PP").pattern("PB").pattern("PP").group("fancy_doors").unlockedBy("has_" + McWoods.byId(j).getSerializedName() + "_planks", has(ECConstants.McWoodenPlanks[j])).save(consumer);
            ShapedRecipeBuilder.shaped(ECBlockRegistry.PLAIN_DOOR_BLOCKS.get(McWoods.byId(j)).get(), 3).define('P', ECConstants.McWoodenLogs[j]).define('B', ECConstants.McWoodenButtons[j]).pattern("PP").pattern("PB").pattern("PP").group("plain_doors").unlockedBy("has_" + McWoods.byId(j).getSerializedName() + "_log", has(ECConstants.McWoodenLogs[j])).save(consumer);
            ShapedRecipeBuilder.shaped(ECBlockRegistry.SUSPENDED_STAIRS_BLOCKS.get(McWoods.byId(j)).get(), 4).define('P', ECConstants.McWoodenSlabs[j]).define('S', Tags.Items.RODS_WOODEN).pattern("  P").pattern(" PS").pattern("PS ").group("suspended_stairs").unlockedBy("has_" + McWoods.byId(j).getSerializedName() + "_planks", has(ECConstants.McWoodenSlabs[j])).save(consumer);
            ShapedRecipeBuilder.shaped(ECBlockRegistry.LARGE_SUSPENDED_STAIRS_BLOCKS.get(McWoods.byId(j)).get(), 4).define('P', ECConstants.McWoodenPlanks[j]).define('S', Tags.Items.RODS_WOODEN).pattern("  P").pattern(" PS").pattern("PS ").group("suspended_stairs").unlockedBy("has_" + McWoods.byId(j).getSerializedName() + "_planks", has(ECConstants.McWoodenPlanks[j])).save(consumer);
            ShapedRecipeBuilder.shaped(ECBlockRegistry.WOODEN_CRATE_BLOCKS.get(McWoods.byId(j)).get()).define('B', BaseItems.BOLT.get()).define('W', ECConstants.McWoodenPlanks[j]).pattern("BWB").pattern("W W").pattern("BWB").group("wooden_crates").unlockedBy("has_" + McWoods.byId(j).getSerializedName() + "_planks", has(ECConstants.McWoodenPlanks[j])).save(consumer);
            ShapedRecipeBuilder.shaped(ECBlockRegistry.FANCY_CHEST_BLOCKS.get(McWoods.byId(j)).get()).define('C', Blocks.CHEST).define('W', ECConstants.McWoodenSlabs[j]).pattern(" W ").pattern("WCW").pattern(" W ").group("fancy_chests").unlockedBy("has_chest", has(Blocks.CHEST)).save(consumer);
        }

        ShapedRecipeBuilder.shaped(ECBlockRegistry.LOCKER.get(), 2).define('P', BaseTags.ForgeItems.PLATES_STEEL).define('I', BaseTags.ForgeItems.INGOTS_STEEL).pattern(" P ").pattern("P P").pattern(" I ").unlockedBy("has_steel_ingot", has(BaseTags.ForgeItems.INGOTS_STEEL)).save(consumer);

        ShapedRecipeBuilder.shaped(ECBlockRegistry.STEEL_SUSPENDED_STAIRS.get(), 8).define('P', BaseTags.ForgeItems.PLATES_STEEL).define('S', BaseTags.ForgeItems.RODS_STEEL).pattern("  P").pattern(" PS").pattern("PS ").unlockedBy("has_steel_plate", has(BaseTags.ForgeItems.PLATES_STEEL)).save(consumer);
        ShapelessRecipeBuilder.shapeless(ECBlockRegistry.RUSTY_SUSPENDED_STAIRS.get()).requires(ECBlockRegistry.STEEL_SUSPENDED_STAIRS.get()).requires(Items.WATER_BUCKET).unlockedBy("has_steel_suspended_stairs", has(ECBlockRegistry.STEEL_SUSPENDED_STAIRS.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ECBlockRegistry.STEEL_LARGE_SUSPENDED_STAIRS.get(), 8).define('P', ECBlockRegistry.DARK_METAL_FLOOR_SLAB.get()).define('S', BaseTags.ForgeItems.RODS_STEEL).pattern("  P").pattern(" PS").pattern("PS ").unlockedBy("has_steel_plate", has(BaseTags.ForgeItems.PLATES_STEEL)).save(consumer);
        ShapelessRecipeBuilder.shapeless(ECBlockRegistry.RUSTY_LARGE_SUSPENDED_STAIRS.get()).requires(ECBlockRegistry.STEEL_SUSPENDED_STAIRS.get()).requires(Items.WATER_BUCKET).unlockedBy("has_steel_suspended_stairs", has(ECBlockRegistry.STEEL_SUSPENDED_STAIRS.get())).save(consumer);

        ShapedRecipeBuilder.shaped(ECBlockRegistry.STEEL_TERRACE_CHAIR.get(), 4).define('W', BaseTags.ForgeItems.PLATES_STEEL).define('S', BaseTags.ForgeItems.RODS_STEEL).pattern("S  ").pattern("SWS").pattern("S S").unlockedBy("has_steel_plate", has(BaseTags.ForgeItems.PLATES_STEEL)).save(consumer);
        ShapedRecipeBuilder.shaped(ECBlockRegistry.STEEL_TERRACE_TABLE.get(), 4).define('W', BaseTags.ForgeItems.PLATES_STEEL).define('S', BaseTags.ForgeItems.RODS_STEEL).pattern("WWW").pattern(" S ").pattern(" S ").unlockedBy("has_steel_plate", has(BaseTags.ForgeItems.PLATES_STEEL)).save(consumer);

        for(int j = 0; j < Arrays.stream(DyeColor.values()).count(); j++)
        {
            ShapedRecipeBuilder.shaped(ECBlockRegistry.COUCH_BLOCKS.get(DyeColor.byId(j)).get(), 3).pattern("w ").pattern("ww").pattern("pp").define('p', ItemTags.WOODEN_SLABS).define('w', ECConstants.McWools[j]).unlockedBy("has_" + DyeColor.byId(j).getSerializedName() + "_wool", has(ECConstants.McWools[j])).save(consumer);
            ShapedRecipeBuilder.shaped(ECBlockRegistry.TABLE_LAMP_BLOCKS.get(DyeColor.byId(j)).get()).pattern(" w ").pattern("wgw").pattern(" p ").define('g', Tags.Items.DUSTS_GLOWSTONE).define('p', ItemTags.PLANKS).define('w', ECConstants.McWools[j]).unlockedBy("has_" + DyeColor.byId(j).getSerializedName() + "_wool", has(ECConstants.McWools[j])).save(consumer);
            ShapelessRecipeBuilder.shapeless(ECBlockRegistry.MANUAL_TABLE_LAMP_BLOCKS.get(DyeColor.byId(j)).get()).requires(ECBlockRegistry.TABLE_LAMP_BLOCKS.get(DyeColor.byId(j)).get()).requires(Blocks.LEVER).unlockedBy("has_table_lamp", has(ECBlockRegistry.TABLE_LAMP_BLOCKS.get(DyeColor.byId(0)).get())).save(consumer, DyeColor.byId(j).getSerializedName() + "_manual_table_lamp");
            ShapelessRecipeBuilder.shapeless(ECBlockRegistry.TABLE_LAMP_BLOCKS.get(DyeColor.byId(j)).get()).requires(ECBlockRegistry.MANUAL_TABLE_LAMP_BLOCKS.get(DyeColor.byId(j)).get()).unlockedBy("has_manual_table_lamp", has(ECBlockRegistry.MANUAL_TABLE_LAMP_BLOCKS.get(DyeColor.byId(0)).get())).save(consumer, DyeColor.byId(j).getSerializedName() + "_table_lamp_from_manual");

            ShapedRecipeBuilder.shaped(ECBlockRegistry.PILLOW_BLOCKS.get(DyeColor.byId(j)).get()).pattern(" S ").pattern("SWS").pattern(" S ").define('S', Tags.Items.STRING).define('W', ECConstants.McWools[j]).unlockedBy("has_" + DyeColor.byId(j).getSerializedName() + "_wool", has(ECConstants.McWools[j])).save(consumer);

            ShapedRecipeBuilder.shaped(ECBlockRegistry.ACACIA_FANCY_BED_BLOCKS.get(DyeColor.byId(j)).get()).define('P', Blocks.ACACIA_PLANKS).define('W', ECConstants.McWools[j]).pattern("P P").pattern("WWW").pattern("PPP").group("fancy_beds").unlockedBy("has_acacia_planks", has(Blocks.ACACIA_PLANKS)).save(consumer);
            ShapedRecipeBuilder.shaped(ECBlockRegistry.BIRCH_FANCY_BED_BLOCKS.get(DyeColor.byId(j)).get()).define('P', Blocks.BIRCH_PLANKS).define('W', ECConstants.McWools[j]).pattern("P P").pattern("WWW").pattern("PPP").group("fancy_beds").unlockedBy("has_birch_planks", has(Blocks.BIRCH_PLANKS)).save(consumer);
            ShapedRecipeBuilder.shaped(ECBlockRegistry.DARK_OAK_FANCY_BED_BLOCKS.get(DyeColor.byId(j)).get()).define('P', Blocks.DARK_OAK_PLANKS).define('W', ECConstants.McWools[j]).pattern("P P").pattern("WWW").pattern("PPP").group("fancy_beds").unlockedBy("has_dark_oak_planks", has(Blocks.DARK_OAK_PLANKS)).save(consumer);
            ShapedRecipeBuilder.shaped(ECBlockRegistry.JUNGLE_FANCY_BED_BLOCKS.get(DyeColor.byId(j)).get()).define('P', Blocks.JUNGLE_PLANKS).define('W', ECConstants.McWools[j]).pattern("P P").pattern("WWW").pattern("PPP").group("fancy_beds").unlockedBy("has_jungle_planks", has(Blocks.JUNGLE_PLANKS)).save(consumer);
            ShapedRecipeBuilder.shaped(ECBlockRegistry.OAK_FANCY_BED_BLOCKS.get(DyeColor.byId(j)).get()).define('P', Blocks.OAK_PLANKS).define('W', ECConstants.McWools[j]).pattern("P P").pattern("WWW").pattern("PPP").group("fancy_beds").unlockedBy("has_oak_planks", has(Blocks.OAK_PLANKS)).save(consumer);
            ShapedRecipeBuilder.shaped(ECBlockRegistry.SPRUCE_FANCY_BED_BLOCKS.get(DyeColor.byId(j)).get()).define('P', Blocks.SPRUCE_PLANKS).define('W', ECConstants.McWools[j]).pattern("P P").pattern("WWW").pattern("PPP").group("fancy_beds").unlockedBy("has_spruce_planks", has(Blocks.SPRUCE_PLANKS)).save(consumer);
            ShapedRecipeBuilder.shaped(ECBlockRegistry.WARPED_FANCY_BED_BLOCKS.get(DyeColor.byId(j)).get()).define('P', Blocks.WARPED_PLANKS).define('W', ECConstants.McWools[j]).pattern("P P").pattern("WWW").pattern("PPP").group("fancy_beds").unlockedBy("has_warped_planks", has(Blocks.WARPED_PLANKS)).save(consumer);
            ShapedRecipeBuilder.shaped(ECBlockRegistry.CRIMSON_FANCY_BED_BLOCKS.get(DyeColor.byId(j)).get()).define('P', Blocks.CRIMSON_PLANKS).define('W', ECConstants.McWools[j]).pattern("P P").pattern("WWW").pattern("PPP").group("fancy_beds").unlockedBy("has_crimson_planks", has(Blocks.CRIMSON_PLANKS)).save(consumer);
        }

        for(int j = 1; j < Arrays.stream(DyeColor.values()).count(); j++)
        {
            ShapelessRecipeBuilder.shapeless(ECBlockRegistry.PILLOW_BLOCKS.get(DyeColor.byId(j)).get()).requires(ECBlockRegistry.PILLOW_BLOCKS.get(DyeColor.byId(0)).get()).requires(DyeColor.byId(j).getTag()).unlockedBy("has_white_pillow", has(ECBlockRegistry.PILLOW_BLOCKS.get(DyeColor.byId(0)).get())).save(consumer, DyeColor.byId(j).getSerializedName() + "_pillow_from_white");

            ShapelessRecipeBuilder.shapeless(ECBlockRegistry.COUCH_BLOCKS.get(DyeColor.byId(j)).get()).requires(ECBlockRegistry.COUCH_BLOCKS.get(DyeColor.byId(0)).get()).requires(DyeColor.byId(j).getTag()).unlockedBy("has_white_couch", has(ECBlockRegistry.COUCH_BLOCKS.get(DyeColor.byId(0)).get())).save(consumer, DyeColor.byId(j).getSerializedName() + "_couch_from_white");

            ShapelessRecipeBuilder.shapeless(ECBlockRegistry.TABLE_LAMP_BLOCKS.get(DyeColor.byId(j)).get()).requires(ECBlockRegistry.TABLE_LAMP_BLOCKS.get(DyeColor.byId(0)).get()).requires(DyeColor.byId(j).getTag()).unlockedBy("has_white_table_lamp", has(ECBlockRegistry.TABLE_LAMP_BLOCKS.get(DyeColor.byId(0)).get())).save(consumer, DyeColor.byId(j).getSerializedName() + "_table_lamp_from_white");

            ShapelessRecipeBuilder.shapeless(ECBlockRegistry.CORRUGATED_METAL_PLATE_BLOCKS.get(DyeColor.byId(j)).get()).requires(ECBlockRegistry.CORRUGATED_METAL_PLATE_BLOCKS.get(DyeColor.byId(0)).get()).requires(DyeColor.byId(j).getTag()).unlockedBy("has_white_corrugated_metal_plate", has(ECBlockRegistry.CORRUGATED_METAL_PLATE_BLOCKS.get(DyeColor.byId(0)).get())).save(consumer, DyeColor.byId(j).getSerializedName() + "_corrugated_metal_plate_from_white");
            ShapelessRecipeBuilder.shapeless(ECBlockRegistry.CORRUGATED_METAL_PLATE_SLABS.get(DyeColor.byId(j)).get()).requires(ECBlockRegistry.CORRUGATED_METAL_PLATE_SLABS.get(DyeColor.byId(0)).get()).requires(DyeColor.byId(j).getTag()).unlockedBy("has_white_corrugated_metal_plate_slab", has(ECBlockRegistry.CORRUGATED_METAL_PLATE_SLABS.get(DyeColor.byId(0)).get())).save(consumer, DyeColor.byId(j).getSerializedName() + "_corrugated_metal_plate_slab_from_white");
            ShapelessRecipeBuilder.shapeless(ECBlockRegistry.CORRUGATED_METAL_PLATE_WALLS.get(DyeColor.byId(j)).get()).requires(ECBlockRegistry.CORRUGATED_METAL_PLATE_WALLS.get(DyeColor.byId(0)).get()).requires(DyeColor.byId(j).getTag()).unlockedBy("has_white_corrugated_metal_plate_wall", has(ECBlockRegistry.CORRUGATED_METAL_PLATE_WALLS.get(DyeColor.byId(0)).get())).save(consumer, DyeColor.byId(j).getSerializedName() + "_corrugated_metal_plate_wall_from_white");
            ShapelessRecipeBuilder.shapeless(ECBlockRegistry.CORRUGATED_METAL_PLATE_STAIRS.get(DyeColor.byId(j)).get()).requires(ECBlockRegistry.CORRUGATED_METAL_PLATE_STAIRS.get(DyeColor.byId(0)).get()).requires(DyeColor.byId(j).getTag()).unlockedBy("has_white_corrugated_metal_plate_stairs", has(ECBlockRegistry.CORRUGATED_METAL_PLATE_STAIRS.get(DyeColor.byId(0)).get())).save(consumer, DyeColor.byId(j).getSerializedName() + "_corrugated_metal_plate_stairs_from_white");
            ShapelessRecipeBuilder.shapeless(ECBlockRegistry.CORRUGATED_METAL_PLATE_PRESSURE_PLATES.get(DyeColor.byId(j)).get()).requires(ECBlockRegistry.CORRUGATED_METAL_PLATE_PRESSURE_PLATES.get(DyeColor.byId(0)).get()).requires(DyeColor.byId(j).getTag()).unlockedBy("has_white_corrugated_metal_plate_pressure_plate", has(ECBlockRegistry.CORRUGATED_METAL_PLATE_PRESSURE_PLATES.get(DyeColor.byId(0)).get())).save(consumer, DyeColor.byId(j).getSerializedName() + "_corrugated_metal_plate_pressure_plate_from_white");
            ShapelessRecipeBuilder.shapeless(ECBlockRegistry.CORRUGATED_METAL_PLATE_FENCES.get(DyeColor.byId(j)).get()).requires(ECBlockRegistry.CORRUGATED_METAL_PLATE_FENCES.get(DyeColor.byId(0)).get()).requires(DyeColor.byId(j).getTag()).unlockedBy("has_white_corrugated_metal_plate_fence", has(ECBlockRegistry.CORRUGATED_METAL_PLATE_FENCES.get(DyeColor.byId(0)).get())).save(consumer, DyeColor.byId(j).getSerializedName() + "_corrugated_metal_plate_fence_from_white");
            ShapelessRecipeBuilder.shapeless(ECBlockRegistry.CORRUGATED_METAL_PLATE_FENCE_GATES.get(DyeColor.byId(j)).get()).requires(ECBlockRegistry.CORRUGATED_METAL_PLATE_FENCE_GATES.get(DyeColor.byId(0)).get()).requires(DyeColor.byId(j).getTag()).unlockedBy("has_white_corrugated_metal_plate_fence_gate", has(ECBlockRegistry.CORRUGATED_METAL_PLATE_FENCE_GATES.get(DyeColor.byId(0)).get())).save(consumer, DyeColor.byId(j).getSerializedName() + "_corrugated_metal_plate_fence_gate_from_white");

            ShapelessRecipeBuilder.shapeless(ECBlockRegistry.ACACIA_FANCY_BED_BLOCKS.get(DyeColor.byId(j)).get()).requires(ECBlockRegistry.ACACIA_FANCY_BED_BLOCKS.get(DyeColor.byId(0)).get()).requires(DyeColor.byId(j).getTag()).unlockedBy("has_white_acacia_fancy_bed", has(ECBlockRegistry.ACACIA_FANCY_BED_BLOCKS.get(DyeColor.byId(0)).get())).save(consumer, DyeColor.byId(j).getSerializedName() + "_acacia_fancy_bed_from_white");
            ShapelessRecipeBuilder.shapeless(ECBlockRegistry.BIRCH_FANCY_BED_BLOCKS.get(DyeColor.byId(j)).get()).requires(ECBlockRegistry.BIRCH_FANCY_BED_BLOCKS.get(DyeColor.byId(0)).get()).requires(DyeColor.byId(j).getTag()).unlockedBy("has_white_birch_fancy_bed", has(ECBlockRegistry.BIRCH_FANCY_BED_BLOCKS.get(DyeColor.byId(0)).get())).save(consumer, DyeColor.byId(j).getSerializedName() + "_birch_fancy_bed_from_white");
            ShapelessRecipeBuilder.shapeless(ECBlockRegistry.DARK_OAK_FANCY_BED_BLOCKS.get(DyeColor.byId(j)).get()).requires(ECBlockRegistry.DARK_OAK_FANCY_BED_BLOCKS.get(DyeColor.byId(0)).get()).requires(DyeColor.byId(j).getTag()).unlockedBy("has_white_dark_oak_fancy_bed", has(ECBlockRegistry.DARK_OAK_FANCY_BED_BLOCKS.get(DyeColor.byId(0)).get())).save(consumer, DyeColor.byId(j).getSerializedName() + "_dark_oak_fancy_bed_from_white");
            ShapelessRecipeBuilder.shapeless(ECBlockRegistry.JUNGLE_FANCY_BED_BLOCKS.get(DyeColor.byId(j)).get()).requires(ECBlockRegistry.JUNGLE_FANCY_BED_BLOCKS.get(DyeColor.byId(0)).get()).requires(DyeColor.byId(j).getTag()).unlockedBy("has_white_jungle_fancy_bed", has(ECBlockRegistry.JUNGLE_FANCY_BED_BLOCKS.get(DyeColor.byId(0)).get())).save(consumer, DyeColor.byId(j).getSerializedName() + "_jungle_fancy_bed_from_white");
            ShapelessRecipeBuilder.shapeless(ECBlockRegistry.OAK_FANCY_BED_BLOCKS.get(DyeColor.byId(j)).get()).requires(ECBlockRegistry.OAK_FANCY_BED_BLOCKS.get(DyeColor.byId(0)).get()).requires(DyeColor.byId(j).getTag()).unlockedBy("has_white_oak_fancy_bed", has(ECBlockRegistry.OAK_FANCY_BED_BLOCKS.get(DyeColor.byId(0)).get())).save(consumer, DyeColor.byId(j).getSerializedName() + "_oak_fancy_bed_from_white");
            ShapelessRecipeBuilder.shapeless(ECBlockRegistry.SPRUCE_FANCY_BED_BLOCKS.get(DyeColor.byId(j)).get()).requires(ECBlockRegistry.SPRUCE_FANCY_BED_BLOCKS.get(DyeColor.byId(0)).get()).requires(DyeColor.byId(j).getTag()).unlockedBy("has_white_spruce_fancy_bed", has(ECBlockRegistry.SPRUCE_FANCY_BED_BLOCKS.get(DyeColor.byId(0)).get())).save(consumer, DyeColor.byId(j).getSerializedName() + "_spruce_fancy_bed_from_white");
        }

        ShapedRecipeBuilder.shaped(ECBlockRegistry.PLATE.get(), 4).define('W', Tags.Items.DYES_WHITE).define('C', Items.CLAY_BALL).pattern(" C ").pattern("CWC").pattern(" C ").unlockedBy("has_clay_ball", has(Items.CLAY_BALL)).save(consumer);

        ShapedRecipeBuilder.shaped(ECBlockRegistry.STEEL_DOOR.get(), 3).define('S', BaseTags.ForgeItems.INGOTS_STEEL).define('R', BaseTags.ForgeItems.RODS_STEEL).define('B', BaseItems.BOLT.get()).pattern("BS").pattern("RS").pattern("BS").unlockedBy("has_steel_ingot", has(BaseTags.ForgeItems.INGOTS_STEEL)).save(consumer);
        ShapedRecipeBuilder.shaped(ECBlockRegistry.STURDY_STEEL_DOOR.get()).define('P', BaseTags.ForgeItems.PLATES_STEEL).define('D', ECBlockRegistry.STEEL_DOOR.get()).pattern("D").pattern("P").unlockedBy("has_steel_door", has(ECBlockRegistry.STEEL_DOOR.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ECBlockRegistry.WARNING_STEEL_DOOR.get()).define('P', ECBlockRegistry.STEEL_DOOR.get()).define('D', Tags.Items.DYES_YELLOW).pattern("D").pattern("P").unlockedBy("has_steel_door", has(ECBlockRegistry.STEEL_DOOR.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ECBlockRegistry.WHITE_STEEL_DOOR.get()).define('P', ECBlockRegistry.STEEL_DOOR.get()).define('D', Tags.Items.DYES_WHITE).pattern("D").pattern("P").unlockedBy("has_steel_door", has(ECBlockRegistry.STEEL_DOOR.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ECBlockRegistry.STURDY_WHITE_STEEL_DOOR.get()).define('P', BaseTags.ForgeItems.PLATES_STEEL).define('D', ECBlockRegistry.WHITE_STEEL_DOOR.get()).pattern("D").pattern("P").unlockedBy("has_white_steel_door", has(ECBlockRegistry.WHITE_STEEL_DOOR.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ECBlockRegistry.WARNING_WHITE_STEEL_DOOR.get()).define('P', ECBlockRegistry.WHITE_STEEL_DOOR.get()).define('D', Tags.Items.DYES_YELLOW).pattern("D").pattern("P").unlockedBy("has_white_steel_door", has(ECBlockRegistry.WHITE_STEEL_DOOR.get())).save(consumer);

        ShapelessRecipeBuilder.shapeless(ECBlockRegistry.RUSTY_DOOR.get()).requires(ECBlockRegistry.STEEL_DOOR.get()).requires(Items.WATER_BUCKET).unlockedBy("has_steel_door", has(ECBlockRegistry.STEEL_DOOR.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ECBlockRegistry.STURDY_RUSTY_DOOR.get()).requires(ECBlockRegistry.STURDY_STEEL_DOOR.get()).requires(Items.WATER_BUCKET).unlockedBy("has_sturdy_steel_door", has(ECBlockRegistry.STURDY_STEEL_DOOR.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ECBlockRegistry.WARNING_RUSTY_DOOR.get()).requires(ECBlockRegistry.WARNING_STEEL_DOOR.get()).requires(Items.WATER_BUCKET).unlockedBy("has_warning_steel_door", has(ECBlockRegistry.WARNING_STEEL_DOOR.get())).save(consumer);
    }
}