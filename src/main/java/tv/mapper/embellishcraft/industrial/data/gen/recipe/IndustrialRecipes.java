package tv.mapper.embellishcraft.industrial.data.gen.recipe;

import java.util.Arrays;
import java.util.function.Consumer;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.Tags;
import tv.mapper.embellishcraft.ECConstants;
import tv.mapper.embellishcraft.data.gen.recipe.ECRecipes;
import tv.mapper.embellishcraft.industrial.world.level.blocks.InitIndustrialBlocks;
import tv.mapper.mapperbase.data.BaseTags;
import tv.mapper.mapperbase.world.item.BaseItems;

public class IndustrialRecipes extends ECRecipes
{

    public IndustrialRecipes(DataGenerator generatorIn)
    {
        super(generatorIn);
    }

    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> consumer)
    {

        // Corrugated metal plates
        for(int j = 0; j < Arrays.stream(DyeColor.values()).count(); j++)
        {
            ShapedRecipeBuilder.shaped(InitIndustrialBlocks.CORRUGATED_METAL_PLATE_BLOCKS.get(DyeColor.byId(j)).get(), 16).pattern("iii").pattern("idi").pattern("iii").define('i', BaseTags.ForgeItems.PLATES_STEEL).define('d', DyeColor.byId(j).getTag()).unlockedBy("has_steel_plate", has(BaseTags.ForgeItems.PLATES_STEEL)).save(consumer);
            ShapedRecipeBuilder.shaped(InitIndustrialBlocks.CORRUGATED_METAL_PLATE_SLABS.get(DyeColor.byId(j)).get(), 6).pattern("iii").define('i', InitIndustrialBlocks.CORRUGATED_METAL_PLATE_BLOCKS.get(DyeColor.byId(j)).get()).unlockedBy("has_" + DyeColor.byId(j).getSerializedName() + "_corrugated_metal_plate", has(InitIndustrialBlocks.CORRUGATED_METAL_PLATE_BLOCKS.get(DyeColor.byId(j)).get())).save(consumer);
            ShapedRecipeBuilder.shaped(InitIndustrialBlocks.CORRUGATED_METAL_PLATE_BLOCKS.get(DyeColor.byId(j)).get()).pattern("i").pattern("i").define('i', InitIndustrialBlocks.CORRUGATED_METAL_PLATE_SLABS.get(DyeColor.byId(j)).get()).unlockedBy("has_" + DyeColor.byId(j).getSerializedName() + "_corrugated_metal_plate_slab", has(InitIndustrialBlocks.CORRUGATED_METAL_PLATE_SLABS.get(DyeColor.byId(j)).get())).save(consumer, ECConstants.MODID + ":" + DyeColor.byId(j).getSerializedName() + "_corrugated_metal_plate_from_slabs");
            ShapedRecipeBuilder.shaped(InitIndustrialBlocks.CORRUGATED_METAL_PLATE_STAIRS.get(DyeColor.byId(j)).get(), 4).define('#', InitIndustrialBlocks.CORRUGATED_METAL_PLATE_BLOCKS.get(DyeColor.byId(j)).get()).pattern("#  ").pattern("## ").pattern("###").unlockedBy("has_" + DyeColor.byId(j).getSerializedName() + "_corrugated_metal_plate", has(InitIndustrialBlocks.CORRUGATED_METAL_PLATE_BLOCKS.get(DyeColor.byId(j)).get())).save(consumer);
            ShapedRecipeBuilder.shaped(InitIndustrialBlocks.CORRUGATED_METAL_PLATE_WALLS.get(DyeColor.byId(j)).get(), 6).define('#', InitIndustrialBlocks.CORRUGATED_METAL_PLATE_BLOCKS.get(DyeColor.byId(j)).get()).pattern("###").pattern("###").unlockedBy("has_" + DyeColor.byId(j).getSerializedName() + "_corrugated_metal_plate", has(InitIndustrialBlocks.CORRUGATED_METAL_PLATE_BLOCKS.get(DyeColor.byId(j)).get())).save(consumer);
            ShapedRecipeBuilder.shaped(InitIndustrialBlocks.CORRUGATED_METAL_PLATE_PRESSURE_PLATES.get(DyeColor.byId(j)).get()).define('#', InitIndustrialBlocks.CORRUGATED_METAL_PLATE_BLOCKS.get(DyeColor.byId(j)).get()).pattern("##").unlockedBy("has_" + DyeColor.byId(j).getSerializedName() + "_corrugated_metal_plate", has(InitIndustrialBlocks.CORRUGATED_METAL_PLATE_BLOCKS.get(DyeColor.byId(j)).get())).save(consumer);
            ShapedRecipeBuilder.shaped(InitIndustrialBlocks.CORRUGATED_METAL_PLATE_FENCES.get(DyeColor.byId(j)).get(), 6).define('S', BaseTags.ForgeItems.RODS_STEEL).define('#', InitIndustrialBlocks.CORRUGATED_METAL_PLATE_BLOCKS.get(DyeColor.byId(j)).get()).pattern("#S#").pattern("#S#").unlockedBy("has_" + DyeColor.byId(j).getSerializedName() + "_corrugated_metal_plate", has(InitIndustrialBlocks.CORRUGATED_METAL_PLATE_BLOCKS.get(DyeColor.byId(j)).get())).save(consumer);
            ShapedRecipeBuilder.shaped(InitIndustrialBlocks.CORRUGATED_METAL_PLATE_FENCE_GATES.get(DyeColor.byId(j)).get(), 6).define('S', BaseTags.ForgeItems.RODS_STEEL).define('#', InitIndustrialBlocks.CORRUGATED_METAL_PLATE_BLOCKS.get(DyeColor.byId(j)).get()).pattern("S#S").pattern("S#S").unlockedBy("has_" + DyeColor.byId(j).getSerializedName() + "_corrugated_metal_plate", has(InitIndustrialBlocks.CORRUGATED_METAL_PLATE_BLOCKS.get(DyeColor.byId(j)).get())).save(consumer);
        }

        // Metal blocks
        ShapedRecipeBuilder.shaped(InitIndustrialBlocks.LIGHT_METAL_FLOOR.get(), 8).pattern("iid").pattern("ii ").define('i', BaseTags.ForgeItems.PLATES_STEEL).define('d', Tags.Items.DYES_GRAY).unlockedBy("has_steel_plate", has(BaseTags.ForgeItems.PLATES_STEEL)).save(consumer);
        ShapedRecipeBuilder.shaped(InitIndustrialBlocks.LIGHT_METAL_FLOOR_SLAB.get(), 6).pattern("iii").define('i', InitIndustrialBlocks.LIGHT_METAL_FLOOR.get()).unlockedBy("has_light_metal_floor", has(InitIndustrialBlocks.LIGHT_METAL_FLOOR.get())).save(consumer);
        ShapedRecipeBuilder.shaped(InitIndustrialBlocks.LIGHT_METAL_FLOOR.get()).pattern("i").pattern("i").define('i', InitIndustrialBlocks.LIGHT_METAL_FLOOR_SLAB.get()).unlockedBy("has_light_metal_floor_slab", has(InitIndustrialBlocks.LIGHT_METAL_FLOOR_SLAB.get())).save(consumer, ECConstants.MODID + ":light_metal_floor_from_slabs");
        ShapedRecipeBuilder.shaped(InitIndustrialBlocks.LIGHT_METAL_FLOOR_STAIRS.get(), 4).define('#', InitIndustrialBlocks.LIGHT_METAL_FLOOR.get()).pattern("#  ").pattern("## ").pattern("###").unlockedBy("has_light_metal_floor", has(InitIndustrialBlocks.LIGHT_METAL_FLOOR.get())).save(consumer);
        ShapedRecipeBuilder.shaped(InitIndustrialBlocks.LIGHT_METAL_FLOOR_WALL.get(), 6).define('#', InitIndustrialBlocks.LIGHT_METAL_FLOOR.get()).pattern("###").pattern("###").unlockedBy("has_light_metal_floor", has(InitIndustrialBlocks.LIGHT_METAL_FLOOR.get())).save(consumer);
        ShapedRecipeBuilder.shaped(InitIndustrialBlocks.LIGHT_METAL_FLOOR_PRESSURE_PLATE.get()).define('#', InitIndustrialBlocks.LIGHT_METAL_FLOOR.get()).pattern("##").unlockedBy("has_light_metal_floor", has(InitIndustrialBlocks.LIGHT_METAL_FLOOR.get())).save(consumer);

        ShapedRecipeBuilder.shaped(InitIndustrialBlocks.DARK_METAL_FLOOR.get(), 8).pattern("iid").pattern("ii ").define('i', BaseTags.ForgeItems.PLATES_STEEL).define('d', Tags.Items.DYES_BLACK).unlockedBy("has_steel_plate", has(BaseTags.ForgeItems.PLATES_STEEL)).save(consumer);
        ShapedRecipeBuilder.shaped(InitIndustrialBlocks.DARK_METAL_FLOOR_SLAB.get(), 6).pattern("iii").define('i', InitIndustrialBlocks.DARK_METAL_FLOOR.get()).unlockedBy("has_dark_metal_floor", has(InitIndustrialBlocks.DARK_METAL_FLOOR.get())).save(consumer);
        ShapedRecipeBuilder.shaped(InitIndustrialBlocks.DARK_METAL_FLOOR.get()).pattern("i").pattern("i").define('i', InitIndustrialBlocks.DARK_METAL_FLOOR_SLAB.get()).unlockedBy("has_dark_metal_floor_slab", has(InitIndustrialBlocks.DARK_METAL_FLOOR_SLAB.get())).save(consumer, ECConstants.MODID + ":dark_metal_floor_from_slabs");
        ShapedRecipeBuilder.shaped(InitIndustrialBlocks.DARK_METAL_FLOOR_STAIRS.get(), 4).define('#', InitIndustrialBlocks.DARK_METAL_FLOOR.get()).pattern("#  ").pattern("## ").pattern("###").unlockedBy("has_dark_metal_floor", has(InitIndustrialBlocks.DARK_METAL_FLOOR.get())).save(consumer);
        ShapedRecipeBuilder.shaped(InitIndustrialBlocks.DARK_METAL_FLOOR_WALL.get(), 6).define('#', InitIndustrialBlocks.DARK_METAL_FLOOR.get()).pattern("###").pattern("###").unlockedBy("has_dark_metal_floor", has(InitIndustrialBlocks.DARK_METAL_FLOOR.get())).save(consumer);
        ShapedRecipeBuilder.shaped(InitIndustrialBlocks.DARK_METAL_FLOOR_PRESSURE_PLATE.get()).define('#', InitIndustrialBlocks.DARK_METAL_FLOOR.get()).pattern("##").unlockedBy("has_dark_metal_floor", has(InitIndustrialBlocks.DARK_METAL_FLOOR.get())).save(consumer);

        ShapedRecipeBuilder.shaped(InitIndustrialBlocks.RUSTY_PLATE.get(), 8).pattern(" i ").pattern("idi").pattern(" i ").define('i', BaseTags.ForgeItems.PLATES_STEEL).define('d', Tags.Items.DYES_ORANGE).unlockedBy("has_steel_plate", has(BaseTags.ForgeItems.PLATES_STEEL)).save(consumer);
        ShapedRecipeBuilder.shaped(InitIndustrialBlocks.RUSTY_PLATE_SLAB.get(), 6).pattern("iii").define('i', InitIndustrialBlocks.RUSTY_PLATE.get()).unlockedBy("has_rusty_plate", has(InitIndustrialBlocks.RUSTY_PLATE.get())).save(consumer);
        ShapedRecipeBuilder.shaped(InitIndustrialBlocks.RUSTY_PLATE.get()).pattern("i").pattern("i").define('i', InitIndustrialBlocks.RUSTY_PLATE_SLAB.get()).unlockedBy("has_rusty_plate_slab", has(InitIndustrialBlocks.RUSTY_PLATE_SLAB.get())).save(consumer, ECConstants.MODID + ":rusty_plate_from_slabs");
        ShapedRecipeBuilder.shaped(InitIndustrialBlocks.RUSTY_PLATE_STAIRS.get(), 4).define('#', InitIndustrialBlocks.RUSTY_PLATE.get()).pattern("#  ").pattern("## ").pattern("###").unlockedBy("has_rusty_plate", has(InitIndustrialBlocks.RUSTY_PLATE.get())).save(consumer);
        ShapedRecipeBuilder.shaped(InitIndustrialBlocks.RUSTY_PLATE_WALL.get(), 6).define('#', InitIndustrialBlocks.RUSTY_PLATE.get()).pattern("###").pattern("###").unlockedBy("has_rusty_plate", has(InitIndustrialBlocks.RUSTY_PLATE.get())).save(consumer);
        ShapedRecipeBuilder.shaped(InitIndustrialBlocks.RUSTY_PLATE_PRESSURE_PLATE.get()).define('#', InitIndustrialBlocks.RUSTY_PLATE.get()).pattern("##").unlockedBy("has_rusty_plate", has(InitIndustrialBlocks.RUSTY_PLATE.get())).save(consumer);

        ShapedRecipeBuilder.shaped(InitIndustrialBlocks.IRON_BEAM.get(), 3).pattern("iii").define('i', Tags.Items.INGOTS_IRON).unlockedBy("has_iron_ingot", has(Tags.Items.INGOTS_IRON)).save(consumer);
        ShapelessRecipeBuilder.shapeless(InitIndustrialBlocks.BOLTED_IRON_BEAM.get()).requires(InitIndustrialBlocks.IRON_BEAM.get()).requires(BaseItems.BOLT.get()).unlockedBy("has_iron_beam", has(InitIndustrialBlocks.IRON_BEAM.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(InitIndustrialBlocks.IRON_BEAM_JUNCTION.get()).requires(InitIndustrialBlocks.IRON_BEAM.get()).unlockedBy("has_iron_beam", has(InitIndustrialBlocks.IRON_BEAM.get())).save(consumer);
        ShapedRecipeBuilder.shaped(InitIndustrialBlocks.STEEL_BEAM.get(), 9).pattern("iii").define('i', BaseTags.ForgeItems.INGOTS_STEEL).unlockedBy("has_steel_ingot", has(BaseTags.ForgeItems.INGOTS_STEEL)).save(consumer);
        ShapelessRecipeBuilder.shapeless(InitIndustrialBlocks.BOLTED_STEEL_BEAM.get()).requires(InitIndustrialBlocks.STEEL_BEAM.get()).requires(BaseItems.BOLT.get()).unlockedBy("has_steel_beam", has(InitIndustrialBlocks.STEEL_BEAM.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(InitIndustrialBlocks.STEEL_BEAM_JUNCTION.get()).requires(InitIndustrialBlocks.STEEL_BEAM.get()).unlockedBy("has_steel_beam", has(InitIndustrialBlocks.STEEL_BEAM.get())).save(consumer);

        ShapedRecipeBuilder.shaped(InitIndustrialBlocks.AIR_DUCT.get(), 12).pattern(" i ").pattern("igi").pattern(" i ").define('i', BaseTags.ForgeItems.INGOTS_STEEL).define('g', Blocks.IRON_BARS).unlockedBy("has_steel_ingot", has(BaseTags.ForgeItems.INGOTS_STEEL)).save(consumer);
        ShapelessRecipeBuilder.shapeless(InitIndustrialBlocks.VENT_AIR_DUCT.get()).requires(InitIndustrialBlocks.AIR_DUCT.get()).requires(Blocks.IRON_BARS).unlockedBy("has_air_duct", has(InitIndustrialBlocks.AIR_DUCT.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(InitIndustrialBlocks.GRID_AIR_DUCT.get()).requires(InitIndustrialBlocks.VENT_AIR_DUCT.get()).requires(Blocks.IRON_BARS).unlockedBy("has_vent_air_duct", has(InitIndustrialBlocks.VENT_AIR_DUCT.get())).save(consumer);

        ShapedRecipeBuilder.shaped(InitIndustrialBlocks.BULKHEAD.get(), 2).pattern("i").pattern("i").define('i', InitIndustrialBlocks.IRON_BEAM.get()).unlockedBy("has_iron_beam", has(InitIndustrialBlocks.IRON_BEAM.get())).save(consumer);
        ShapedRecipeBuilder.shaped(InitIndustrialBlocks.BULKHEAD_TOP.get(), 2).pattern("c").pattern("i").define('c', Tags.Items.GRAVEL).define('i', InitIndustrialBlocks.BULKHEAD.get()).unlockedBy("has_bulkhead", has(InitIndustrialBlocks.BULKHEAD.get())).save(consumer);

        ShapedRecipeBuilder.shaped(InitIndustrialBlocks.STEEL_WALL_LADDER.get(), 16).pattern("r r").pattern("iri").pattern("r r").define('r', BaseTags.ForgeItems.RODS_STEEL).define('i', BaseTags.ForgeItems.INGOTS_STEEL).unlockedBy("has_steel_ingot", has(BaseTags.ForgeItems.INGOTS_STEEL)).unlockedBy("has_steel_rod", has(BaseTags.ForgeItems.RODS_STEEL)).save(consumer);
        ShapedRecipeBuilder.shaped(InitIndustrialBlocks.RUSTY_WALL_LADDER.get(), 8).pattern("lll").pattern("lbl").pattern("lll").define('l', InitIndustrialBlocks.STEEL_WALL_LADDER.get()).define('b', Items.WATER_BUCKET).unlockedBy("has_steel_wall_ladder", has(InitIndustrialBlocks.STEEL_WALL_LADDER.get())).save(consumer);

        ShapedRecipeBuilder.shaped(InitIndustrialBlocks.STEEL_RUNGS.get(), 8).pattern("r r").pattern(" r ").define('r', BaseTags.ForgeItems.RODS_STEEL).unlockedBy("has_steel_rod", has(BaseTags.ForgeItems.RODS_STEEL)).save(consumer);
        ShapedRecipeBuilder.shaped(InitIndustrialBlocks.RUSTY_RUNGS.get(), 8).pattern("lll").pattern("lbl").pattern("lll").define('l', InitIndustrialBlocks.STEEL_RUNGS.get()).define('b', Items.WATER_BUCKET).unlockedBy("has_steel_rungs", has(InitIndustrialBlocks.STEEL_RUNGS.get())).save(consumer);

        ShapedRecipeBuilder.shaped(InitIndustrialBlocks.STEEL_SUSPENDED_STAIRS.get(), 8).define('P', BaseTags.ForgeItems.PLATES_STEEL).define('S', BaseTags.ForgeItems.RODS_STEEL).pattern("  P").pattern(" PS").pattern("PS ").unlockedBy("has_steel_plate", has(BaseTags.ForgeItems.PLATES_STEEL)).save(consumer);
        ShapelessRecipeBuilder.shapeless(InitIndustrialBlocks.RUSTY_SUSPENDED_STAIRS.get()).requires(InitIndustrialBlocks.STEEL_SUSPENDED_STAIRS.get()).requires(Items.WATER_BUCKET).unlockedBy("has_steel_suspended_stairs", has(InitIndustrialBlocks.STEEL_SUSPENDED_STAIRS.get())).save(consumer);
        ShapedRecipeBuilder.shaped(InitIndustrialBlocks.STEEL_LARGE_SUSPENDED_STAIRS.get(), 8).define('P', InitIndustrialBlocks.DARK_METAL_FLOOR_SLAB.get()).define('S', BaseTags.ForgeItems.RODS_STEEL).pattern("  P").pattern(" PS").pattern("PS ").unlockedBy("has_steel_plate", has(BaseTags.ForgeItems.PLATES_STEEL)).save(consumer);
        ShapelessRecipeBuilder.shapeless(InitIndustrialBlocks.RUSTY_LARGE_SUSPENDED_STAIRS.get()).requires(InitIndustrialBlocks.STEEL_SUSPENDED_STAIRS.get()).requires(Items.WATER_BUCKET).unlockedBy("has_steel_suspended_stairs", has(InitIndustrialBlocks.STEEL_SUSPENDED_STAIRS.get())).save(consumer);

        for(int j = 1; j < Arrays.stream(DyeColor.values()).count(); j++)
        {
            ShapelessRecipeBuilder.shapeless(InitIndustrialBlocks.CORRUGATED_METAL_PLATE_BLOCKS.get(DyeColor.byId(j)).get()).requires(InitIndustrialBlocks.CORRUGATED_METAL_PLATE_BLOCKS.get(DyeColor.byId(0)).get()).requires(DyeColor.byId(j).getTag()).unlockedBy("has_white_corrugated_metal_plate", has(InitIndustrialBlocks.CORRUGATED_METAL_PLATE_BLOCKS.get(DyeColor.byId(0)).get())).save(consumer, DyeColor.byId(j).getSerializedName() + "_corrugated_metal_plate_from_white");
            ShapelessRecipeBuilder.shapeless(InitIndustrialBlocks.CORRUGATED_METAL_PLATE_SLABS.get(DyeColor.byId(j)).get()).requires(InitIndustrialBlocks.CORRUGATED_METAL_PLATE_SLABS.get(DyeColor.byId(0)).get()).requires(DyeColor.byId(j).getTag()).unlockedBy("has_white_corrugated_metal_plate_slab", has(InitIndustrialBlocks.CORRUGATED_METAL_PLATE_SLABS.get(DyeColor.byId(0)).get())).save(consumer, DyeColor.byId(j).getSerializedName() + "_corrugated_metal_plate_slab_from_white");
            ShapelessRecipeBuilder.shapeless(InitIndustrialBlocks.CORRUGATED_METAL_PLATE_WALLS.get(DyeColor.byId(j)).get()).requires(InitIndustrialBlocks.CORRUGATED_METAL_PLATE_WALLS.get(DyeColor.byId(0)).get()).requires(DyeColor.byId(j).getTag()).unlockedBy("has_white_corrugated_metal_plate_wall", has(InitIndustrialBlocks.CORRUGATED_METAL_PLATE_WALLS.get(DyeColor.byId(0)).get())).save(consumer, DyeColor.byId(j).getSerializedName() + "_corrugated_metal_plate_wall_from_white");
            ShapelessRecipeBuilder.shapeless(InitIndustrialBlocks.CORRUGATED_METAL_PLATE_STAIRS.get(DyeColor.byId(j)).get()).requires(InitIndustrialBlocks.CORRUGATED_METAL_PLATE_STAIRS.get(DyeColor.byId(0)).get()).requires(DyeColor.byId(j).getTag()).unlockedBy("has_white_corrugated_metal_plate_stairs", has(InitIndustrialBlocks.CORRUGATED_METAL_PLATE_STAIRS.get(DyeColor.byId(0)).get())).save(consumer, DyeColor.byId(j).getSerializedName() + "_corrugated_metal_plate_stairs_from_white");
            ShapelessRecipeBuilder.shapeless(InitIndustrialBlocks.CORRUGATED_METAL_PLATE_PRESSURE_PLATES.get(DyeColor.byId(j)).get()).requires(InitIndustrialBlocks.CORRUGATED_METAL_PLATE_PRESSURE_PLATES.get(DyeColor.byId(0)).get()).requires(DyeColor.byId(j).getTag()).unlockedBy("has_white_corrugated_metal_plate_pressure_plate", has(InitIndustrialBlocks.CORRUGATED_METAL_PLATE_PRESSURE_PLATES.get(DyeColor.byId(0)).get())).save(consumer, DyeColor.byId(j).getSerializedName() + "_corrugated_metal_plate_pressure_plate_from_white");
            ShapelessRecipeBuilder.shapeless(InitIndustrialBlocks.CORRUGATED_METAL_PLATE_FENCES.get(DyeColor.byId(j)).get()).requires(InitIndustrialBlocks.CORRUGATED_METAL_PLATE_FENCES.get(DyeColor.byId(0)).get()).requires(DyeColor.byId(j).getTag()).unlockedBy("has_white_corrugated_metal_plate_fence", has(InitIndustrialBlocks.CORRUGATED_METAL_PLATE_FENCES.get(DyeColor.byId(0)).get())).save(consumer, DyeColor.byId(j).getSerializedName() + "_corrugated_metal_plate_fence_from_white");
            ShapelessRecipeBuilder.shapeless(InitIndustrialBlocks.CORRUGATED_METAL_PLATE_FENCE_GATES.get(DyeColor.byId(j)).get()).requires(InitIndustrialBlocks.CORRUGATED_METAL_PLATE_FENCE_GATES.get(DyeColor.byId(0)).get()).requires(DyeColor.byId(j).getTag()).unlockedBy("has_white_corrugated_metal_plate_fence_gate", has(InitIndustrialBlocks.CORRUGATED_METAL_PLATE_FENCE_GATES.get(DyeColor.byId(0)).get())).save(consumer, DyeColor.byId(j).getSerializedName() + "_corrugated_metal_plate_fence_gate_from_white");
        }

        ShapedRecipeBuilder.shaped(InitIndustrialBlocks.STEEL_DOOR.get(), 3).define('S', BaseTags.ForgeItems.INGOTS_STEEL).define('R', BaseTags.ForgeItems.RODS_STEEL).define('B', BaseItems.BOLT.get()).pattern("BS").pattern("RS").pattern("BS").unlockedBy("has_steel_ingot", has(BaseTags.ForgeItems.INGOTS_STEEL)).save(consumer);
        ShapedRecipeBuilder.shaped(InitIndustrialBlocks.STURDY_STEEL_DOOR.get()).define('P', BaseTags.ForgeItems.PLATES_STEEL).define('D', InitIndustrialBlocks.STEEL_DOOR.get()).pattern("D").pattern("P").unlockedBy("has_steel_door", has(InitIndustrialBlocks.STEEL_DOOR.get())).save(consumer);
        ShapedRecipeBuilder.shaped(InitIndustrialBlocks.WARNING_STEEL_DOOR.get()).define('P', InitIndustrialBlocks.STEEL_DOOR.get()).define('D', Tags.Items.DYES_YELLOW).pattern("D").pattern("P").unlockedBy("has_steel_door", has(InitIndustrialBlocks.STEEL_DOOR.get())).save(consumer);
        ShapedRecipeBuilder.shaped(InitIndustrialBlocks.WHITE_STEEL_DOOR.get()).define('P', InitIndustrialBlocks.STEEL_DOOR.get()).define('D', Tags.Items.DYES_WHITE).pattern("D").pattern("P").unlockedBy("has_steel_door", has(InitIndustrialBlocks.STEEL_DOOR.get())).save(consumer);
        ShapedRecipeBuilder.shaped(InitIndustrialBlocks.STURDY_WHITE_STEEL_DOOR.get()).define('P', BaseTags.ForgeItems.PLATES_STEEL).define('D', InitIndustrialBlocks.WHITE_STEEL_DOOR.get()).pattern("D").pattern("P").unlockedBy("has_white_steel_door", has(InitIndustrialBlocks.WHITE_STEEL_DOOR.get())).save(consumer);
        ShapedRecipeBuilder.shaped(InitIndustrialBlocks.WARNING_WHITE_STEEL_DOOR.get()).define('P', InitIndustrialBlocks.WHITE_STEEL_DOOR.get()).define('D', Tags.Items.DYES_YELLOW).pattern("D").pattern("P").unlockedBy("has_white_steel_door", has(InitIndustrialBlocks.WHITE_STEEL_DOOR.get())).save(consumer);

        ShapelessRecipeBuilder.shapeless(InitIndustrialBlocks.RUSTY_DOOR.get()).requires(InitIndustrialBlocks.STEEL_DOOR.get()).requires(Items.WATER_BUCKET).unlockedBy("has_steel_door", has(InitIndustrialBlocks.STEEL_DOOR.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(InitIndustrialBlocks.STURDY_RUSTY_DOOR.get()).requires(InitIndustrialBlocks.STURDY_STEEL_DOOR.get()).requires(Items.WATER_BUCKET).unlockedBy("has_sturdy_steel_door", has(InitIndustrialBlocks.STURDY_STEEL_DOOR.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(InitIndustrialBlocks.WARNING_RUSTY_DOOR.get()).requires(InitIndustrialBlocks.WARNING_STEEL_DOOR.get()).requires(Items.WATER_BUCKET).unlockedBy("has_warning_steel_door", has(InitIndustrialBlocks.WARNING_STEEL_DOOR.get())).save(consumer);
    }
}