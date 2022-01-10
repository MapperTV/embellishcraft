package tv.mapper.embellishcraft.data.gen.recipe;

import java.util.Arrays;
import java.util.function.Consumer;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Items;
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
import tv.mapper.embellishcraft.util.McWoods;
import tv.mapper.mapperbase.data.BaseTags;
import tv.mapper.mapperbase.data.gen.BaseRecipes;
import tv.mapper.mapperbase.world.item.BaseItems;

public class ECRecipes extends BaseRecipes
{

    public ECRecipes(DataGenerator generatorIn)
    {
        super(generatorIn);
    }

    protected static void CreateBasicRecipes(Consumer<FinishedRecipe> consumer, Block block, StairBlock stairs, SlabBlock slab, WallBlock wall, PressurePlateBlock pressure, ButtonBlock button)
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

            ShapelessRecipeBuilder.shapeless(ECBlockRegistry.ACACIA_FANCY_BED_BLOCKS.get(DyeColor.byId(j)).get()).requires(ECBlockRegistry.ACACIA_FANCY_BED_BLOCKS.get(DyeColor.byId(0)).get()).requires(DyeColor.byId(j).getTag()).unlockedBy("has_white_acacia_fancy_bed", has(ECBlockRegistry.ACACIA_FANCY_BED_BLOCKS.get(DyeColor.byId(0)).get())).save(consumer, DyeColor.byId(j).getSerializedName() + "_acacia_fancy_bed_from_white");
            ShapelessRecipeBuilder.shapeless(ECBlockRegistry.BIRCH_FANCY_BED_BLOCKS.get(DyeColor.byId(j)).get()).requires(ECBlockRegistry.BIRCH_FANCY_BED_BLOCKS.get(DyeColor.byId(0)).get()).requires(DyeColor.byId(j).getTag()).unlockedBy("has_white_birch_fancy_bed", has(ECBlockRegistry.BIRCH_FANCY_BED_BLOCKS.get(DyeColor.byId(0)).get())).save(consumer, DyeColor.byId(j).getSerializedName() + "_birch_fancy_bed_from_white");
            ShapelessRecipeBuilder.shapeless(ECBlockRegistry.DARK_OAK_FANCY_BED_BLOCKS.get(DyeColor.byId(j)).get()).requires(ECBlockRegistry.DARK_OAK_FANCY_BED_BLOCKS.get(DyeColor.byId(0)).get()).requires(DyeColor.byId(j).getTag()).unlockedBy("has_white_dark_oak_fancy_bed", has(ECBlockRegistry.DARK_OAK_FANCY_BED_BLOCKS.get(DyeColor.byId(0)).get())).save(consumer, DyeColor.byId(j).getSerializedName() + "_dark_oak_fancy_bed_from_white");
            ShapelessRecipeBuilder.shapeless(ECBlockRegistry.JUNGLE_FANCY_BED_BLOCKS.get(DyeColor.byId(j)).get()).requires(ECBlockRegistry.JUNGLE_FANCY_BED_BLOCKS.get(DyeColor.byId(0)).get()).requires(DyeColor.byId(j).getTag()).unlockedBy("has_white_jungle_fancy_bed", has(ECBlockRegistry.JUNGLE_FANCY_BED_BLOCKS.get(DyeColor.byId(0)).get())).save(consumer, DyeColor.byId(j).getSerializedName() + "_jungle_fancy_bed_from_white");
            ShapelessRecipeBuilder.shapeless(ECBlockRegistry.OAK_FANCY_BED_BLOCKS.get(DyeColor.byId(j)).get()).requires(ECBlockRegistry.OAK_FANCY_BED_BLOCKS.get(DyeColor.byId(0)).get()).requires(DyeColor.byId(j).getTag()).unlockedBy("has_white_oak_fancy_bed", has(ECBlockRegistry.OAK_FANCY_BED_BLOCKS.get(DyeColor.byId(0)).get())).save(consumer, DyeColor.byId(j).getSerializedName() + "_oak_fancy_bed_from_white");
            ShapelessRecipeBuilder.shapeless(ECBlockRegistry.SPRUCE_FANCY_BED_BLOCKS.get(DyeColor.byId(j)).get()).requires(ECBlockRegistry.SPRUCE_FANCY_BED_BLOCKS.get(DyeColor.byId(0)).get()).requires(DyeColor.byId(j).getTag()).unlockedBy("has_white_spruce_fancy_bed", has(ECBlockRegistry.SPRUCE_FANCY_BED_BLOCKS.get(DyeColor.byId(0)).get())).save(consumer, DyeColor.byId(j).getSerializedName() + "_spruce_fancy_bed_from_white");
        }

        ShapedRecipeBuilder.shaped(ECBlockRegistry.PLATE.get(), 4).define('W', Tags.Items.DYES_WHITE).define('C', Items.CLAY_BALL).pattern(" C ").pattern("CWC").pattern(" C ").unlockedBy("has_clay_ball", has(Items.CLAY_BALL)).save(consumer);
    }
}