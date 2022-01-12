package tv.mapper.embellishcraft.data.gen.recipe;

import java.util.Arrays;
import java.util.function.Consumer;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.DyeColor;
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
import tv.mapper.mapperbase.data.gen.BaseRecipes;

public class ECRecipes extends BaseRecipes
{

    public ECRecipes(DataGenerator generatorIn)
    {
        super(generatorIn);
    }

    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> consumer)
    {
        for(int j = 0; j < Arrays.stream(DyeColor.values()).count(); j++)
        {
            ShapedRecipeBuilder.shaped(ECBlockRegistry.TABLE_LAMP_BLOCKS.get(DyeColor.byId(j)).get()).pattern(" w ").pattern("wgw").pattern(" p ").define('g', Tags.Items.DUSTS_GLOWSTONE).define('p', ItemTags.PLANKS).define('w', ECConstants.McWools[j]).unlockedBy("has_" + DyeColor.byId(j).getSerializedName() + "_wool", has(ECConstants.McWools[j])).save(consumer);
            ShapelessRecipeBuilder.shapeless(ECBlockRegistry.MANUAL_TABLE_LAMP_BLOCKS.get(DyeColor.byId(j)).get()).requires(ECBlockRegistry.TABLE_LAMP_BLOCKS.get(DyeColor.byId(j)).get()).requires(Blocks.LEVER).unlockedBy("has_table_lamp", has(ECBlockRegistry.TABLE_LAMP_BLOCKS.get(DyeColor.byId(0)).get())).save(consumer, DyeColor.byId(j).getSerializedName() + "_manual_table_lamp");
            ShapelessRecipeBuilder.shapeless(ECBlockRegistry.TABLE_LAMP_BLOCKS.get(DyeColor.byId(j)).get()).requires(ECBlockRegistry.MANUAL_TABLE_LAMP_BLOCKS.get(DyeColor.byId(j)).get()).unlockedBy("has_manual_table_lamp", has(ECBlockRegistry.MANUAL_TABLE_LAMP_BLOCKS.get(DyeColor.byId(0)).get())).save(consumer, DyeColor.byId(j).getSerializedName() + "_table_lamp_from_manual");
        }

        for(int j = 1; j < Arrays.stream(DyeColor.values()).count(); j++)
        {
            ShapelessRecipeBuilder.shapeless(ECBlockRegistry.TABLE_LAMP_BLOCKS.get(DyeColor.byId(j)).get()).requires(ECBlockRegistry.TABLE_LAMP_BLOCKS.get(DyeColor.byId(0)).get()).requires(DyeColor.byId(j).getTag()).unlockedBy("has_white_table_lamp", has(ECBlockRegistry.TABLE_LAMP_BLOCKS.get(DyeColor.byId(0)).get())).save(consumer, DyeColor.byId(j).getSerializedName() + "_table_lamp_from_white");
        }
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
}