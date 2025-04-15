package tv.mapper.embellishcraft.core.data.recipes;

import java.util.Objects;
import java.util.concurrent.CompletableFuture;

import net.minecraft.core.HolderLookup.Provider;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.ButtonBlock;
import net.minecraft.world.level.block.PressurePlateBlock;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.WallBlock;
import tv.mapper.embellishcraft.core.ECConstants;
import tv.mapper.mapperbase.api.data.BaseRecipeProvider;

public class ECRecipes extends BaseRecipeProvider
{
    public ECRecipes(PackOutput pOutput, CompletableFuture<Provider> pRegistries, String name)
    {
        super(pOutput, pRegistries, name);
    }

    @Override
    protected void buildRecipes(RecipeOutput output)
    {}

    protected static void CreateBasicRecipes(RecipeOutput consumer, Block block, StairBlock stairs, SlabBlock slab, WallBlock wall, PressurePlateBlock pressure, ButtonBlock button)
    {
        if(block != null)
        {
            String name = Objects.requireNonNull(BuiltInRegistries.BLOCK.getKey(block)).getPath();

            if(slab != null)
            {
                ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, slab, 6).pattern("iii").define('i', block).unlockedBy("has_" + name, has(block)).save(consumer);
                ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, block).pattern("i").pattern("i").define('i', slab).unlockedBy("has_" + name + "_slab", has(slab)).save(consumer, ECConstants.MODID + ":" + name + "_from_slabs");
            }
            if(stairs != null)
                ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, stairs, 4).define('#', block).pattern("#  ").pattern("## ").pattern("###").unlockedBy("has_" + name, has(block)).save(consumer);
            if(wall != null)
                ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, wall, 6).define('#', block).pattern("###").pattern("###").unlockedBy("has_" + name, has(block)).save(consumer);
            if(pressure != null)
                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, pressure).define('#', block).pattern("##").unlockedBy("has_" + name, has(block)).save(consumer);
            if(button != null)
                ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, button).requires(block).unlockedBy("has_" + name, has(block)).save(consumer);
        }
    }
}