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
        // Furniture
        for(int j = 0; j < Arrays.stream(McWoods.values()).count(); j++)
        {
            ShapedRecipeBuilder.shaped(ECBlockRegistry.CHAIR_BLOCKS.get(McWoods.byId(j)).get()).define('W', ECConstants.McWoodenSlabs[j]).define('S', Tags.Items.RODS_WOODEN).pattern("S  ").pattern("SWS").pattern("S S").group("chairs").unlockedBy("has_" + McWoods.byId(j).getSerializedName() + "_slab", has(ECConstants.McWoodenSlabs[j])).save(consumer);
            ShapedRecipeBuilder.shaped(ECBlockRegistry.TERRACE_CHAIR_BLOCKS.get(McWoods.byId(j)).get()).define('W', ECConstants.McWoodenPressures[j]).define('S', Tags.Items.RODS_WOODEN).pattern("S  ").pattern("SWS").pattern("S S").group("terrace_chairs").unlockedBy("has_" + McWoods.byId(j).getSerializedName() + "_pressure_plate", has(ECConstants.McWoodenPressures[j])).save(consumer);
            ShapedRecipeBuilder.shaped(ECBlockRegistry.TABLE_BLOCKS.get(McWoods.byId(j)).get()).define('W', ECConstants.McWoodenSlabs[j]).define('S', Tags.Items.RODS_WOODEN).pattern("SWS").pattern("S S").pattern("S S").group("tables").unlockedBy("has_" + McWoods.byId(j).getSerializedName() + "_slab", has(ECConstants.McWoodenSlabs[j])).save(consumer);
            ShapedRecipeBuilder.shaped(ECBlockRegistry.TERRACE_TABLE_BLOCKS.get(McWoods.byId(j)).get()).define('W', ECConstants.McWoodenPressures[j]).define('S', Tags.Items.RODS_WOODEN).pattern("WWW").pattern(" S ").pattern(" S ").group("terrace_tables").unlockedBy("has_" + McWoods.byId(j).getSerializedName() + "_pressure_plate", has(ECConstants.McWoodenPressures[j])).save(consumer);
            ShapedRecipeBuilder.shaped(ECBlockRegistry.FANCY_TABLE_BLOCKS.get(McWoods.byId(j)).get(), 2).define('W', ECConstants.McWoodenPlanks[j]).define('S', ECConstants.McWoodenLogs[j]).pattern("WWW").pattern("S S").pattern("S S").group("fancy_tables").unlockedBy("has_" + McWoods.byId(j).getSerializedName() + "_planks", has(ECConstants.McWoodenPlanks[j])).save(consumer);
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