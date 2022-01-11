package tv.mapper.embellishcraft.data.gen;

import java.util.function.Function;

import net.minecraft.core.Direction;
import net.minecraft.data.DataGenerator;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.block.BedBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.ChestBlock;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BedPart;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.ChestType;
import net.minecraft.world.level.block.state.properties.StairsShape;
import net.minecraftforge.client.model.generators.ConfiguredModel;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.client.model.generators.ModelFile.UncheckedModelFile;
import net.minecraftforge.client.model.generators.MultiPartBlockStateBuilder;
import net.minecraftforge.client.model.generators.VariantBlockStateBuilder;
import net.minecraftforge.common.data.ExistingFileHelper;
import tv.mapper.embellishcraft.ECConstants;
import tv.mapper.embellishcraft.block.CouchBlock;
import tv.mapper.embellishcraft.block.ECBlockRegistry;
import tv.mapper.embellishcraft.block.LampBlock;
import tv.mapper.embellishcraft.block.PlateBlock;
import tv.mapper.embellishcraft.block.TableBlock;
import tv.mapper.embellishcraft.block.VerticalChestBlock;
import tv.mapper.embellishcraft.state.properties.VerticalChestType;
import tv.mapper.embellishcraft.util.McWoods;
import tv.mapper.mapperbase.data.gen.BaseBlockStates;

public class ECBlockStates extends BaseBlockStates
{
    public ECBlockStates(DataGenerator gen, String modid, ExistingFileHelper exFileHelper)
    {
        super(gen, modid, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels()
    {
        // Furniture
        for(int j = 0; j < McWoods.values().length; j++)
        {
            horizontalBlock(ECBlockRegistry.CHAIR_BLOCKS.get(McWoods.byId(j)).get(), new UncheckedModelFile(mod_id + ":block/" + McWoods.byId(j).getSerializedName() + "_chair"), 0);
            horizontalBlock(ECBlockRegistry.TERRACE_CHAIR_BLOCKS.get(McWoods.byId(j)).get(), new UncheckedModelFile(mod_id + ":block/" + McWoods.byId(j).getSerializedName() + "_terrace_chair"), 0);
            tableBlock(ECBlockRegistry.TABLE_BLOCKS.get(McWoods.byId(j)).get());
            tableBlock(ECBlockRegistry.FANCY_TABLE_BLOCKS.get(McWoods.byId(j)).get());
            simpleBlock(ECBlockRegistry.TERRACE_TABLE_BLOCKS.get(McWoods.byId(j)).get());
            simpleBlock(ECBlockRegistry.WOODEN_CRATE_BLOCKS.get(McWoods.byId(j)).get());
            // getVariantBuilder(ECBlockRegistry.FANCY_CHEST_BLOCKS.get(McWoods.byId(j)).get()).partialState().setModels(
            // new ConfiguredModel(new UncheckedModelFile(mod_id + ":model/" + McWoods.byId(j).getString() + "_fancy_chest")));
            chestBlock(ECBlockRegistry.FANCY_CHEST_BLOCKS.get(McWoods.byId(j)).get(), 0);
        }
        verticalChestBlock(ECBlockRegistry.LOCKER.get(), 0);

        simpleBlock(ECBlockRegistry.STEEL_TERRACE_TABLE.get());
        horizontalBlock(ECBlockRegistry.STEEL_TERRACE_CHAIR.get(), new UncheckedModelFile(mod_id + ":block/steel_terrace_chair"), 0);

        for(int j = 0; j < DyeColor.values().length; j++)
        {
            couchBlock(ECBlockRegistry.COUCH_BLOCKS.get(DyeColor.byId(j)).get(), 90);
            tableLampBlock(ECBlockRegistry.TABLE_LAMP_BLOCKS.get(DyeColor.byId(j)).get());
            tableLampBlock(ECBlockRegistry.MANUAL_TABLE_LAMP_BLOCKS.get(DyeColor.byId(j)).get());
            horizontalBlock(ECBlockRegistry.PILLOW_BLOCKS.get(DyeColor.byId(j)).get(), new UncheckedModelFile(mod_id + ":block/" + DyeColor.byId(j).getSerializedName() + "_pillow"), 0);
            bedBlock(ECBlockRegistry.OAK_FANCY_BED_BLOCKS.get(DyeColor.byId(j)).get(), 180);
            bedBlock(ECBlockRegistry.BIRCH_FANCY_BED_BLOCKS.get(DyeColor.byId(j)).get(), 180);
            bedBlock(ECBlockRegistry.SPRUCE_FANCY_BED_BLOCKS.get(DyeColor.byId(j)).get(), 180);
            bedBlock(ECBlockRegistry.JUNGLE_FANCY_BED_BLOCKS.get(DyeColor.byId(j)).get(), 180);
            bedBlock(ECBlockRegistry.DARK_OAK_FANCY_BED_BLOCKS.get(DyeColor.byId(j)).get(), 180);
            bedBlock(ECBlockRegistry.ACACIA_FANCY_BED_BLOCKS.get(DyeColor.byId(j)).get(), 180);
            bedBlock(ECBlockRegistry.WARPED_FANCY_BED_BLOCKS.get(DyeColor.byId(j)).get(), 180);
            bedBlock(ECBlockRegistry.CRIMSON_FANCY_BED_BLOCKS.get(DyeColor.byId(j)).get(), 180);
        }

        plateBlock(ECBlockRegistry.PLATE.get());
    }

    protected void registerBlockstateVariants(String name, Block block, SlabBlock slab, StairBlock stairs, WallBlock wall, Block pressure, Block button)
    {
        if(block != null)
            simpleBlock(block);
        if(slab != null)
            slabBlock(slab, modLoc("block/" + name), modLoc("block/" + name));
        if(stairs != null)
            stairsBlock(stairs, modLoc("block/" + name));
        if(wall != null)
            newWallBlock(wall, new UncheckedModelFile(ECConstants.MODID + ":block/" + name + "_wall_post"), new UncheckedModelFile(ECConstants.MODID + ":block/" + name + "_wall_side"), new UncheckedModelFile(ECConstants.MODID + ":block/" + name + "_wall_side_tall"));
        if(pressure != null)
            pressurePlateBlock(pressure, new UncheckedModelFile(mod_id + ":block/" + name + "_pressure_plate"), new UncheckedModelFile(mod_id + ":block/" + name + "_pressure_plate_down"));
        if(button != null)
            buttonBlock(button, new UncheckedModelFile(mod_id + ":block/" + name + "_button"), new UncheckedModelFile(mod_id + ":block/" + name + "_button_pressed"), 180);
    }

    protected void registerBlockstateVariantsWithSideSlab(String name, Block block, SlabBlock slab, StairBlock stairs, WallBlock wall, Block pressure, Block button)
    {
        if(block != null)
            simpleBlock(block);
        if(slab != null)
            slabBlock(slab, modLoc("block/" + name), modLoc("block/" + name + "_side"), modLoc("block/" + name), modLoc("block/" + name));
        if(stairs != null)
            stairsBlock(stairs, modLoc("block/" + name));
        if(wall != null)
            newWallBlock(wall, new UncheckedModelFile(ECConstants.MODID + ":block/" + name + "_wall_post"), new UncheckedModelFile(ECConstants.MODID + ":block/" + name + "_wall_side"), new UncheckedModelFile(ECConstants.MODID + ":block/" + name + "_wall_side_tall"));
        if(pressure != null)
            pressurePlateBlock(pressure, new UncheckedModelFile(mod_id + ":block/" + name + "_pressure_plate"), new UncheckedModelFile(mod_id + ":block/" + name + "_pressure_plate_down"));
        if(button != null)
            buttonBlock(button, new UncheckedModelFile(mod_id + ":block/" + name + "_button"), new UncheckedModelFile(mod_id + ":block/" + name + "_button_pressed"), 180);
    }

    protected void plateBlock(Block block)
    {
        VariantBlockStateBuilder builder = getVariantBuilder(block);
        for(int i = 1; i < 9; i++)
            builder.partialState().with(PlateBlock.PLATES, i).modelForState().modelFile(new UncheckedModelFile(mod_id + ":block/plate_" + i)).addModel();
    }

    /**
     * Creates a blockstate file for blocks that have 4 orientations depending of cardinal (north, south etc). e.g. chairs, suspended stairs...
     */
    protected void orientableBlock(Block block, ModelFile model, int angleOffset)
    {
        orientableBlock(block, $ -> model, angleOffset);
    }

    protected void orientableBlock(Block block, Function<BlockState, ModelFile> modelFunc, int angleOffset)
    {
        getVariantBuilder(block).forAllStatesExcept(state -> ConfiguredModel.builder().modelFile(modelFunc.apply(state)).rotationY(((int)state.getValue(BlockStateProperties.HORIZONTAL_FACING).toYRot() + angleOffset) % 360).build(), BlockStateProperties.WATERLOGGED);
    }

    /**
     * Creates a blockstate file for the modular table blocks (normal and fancy)
     */
    protected void tableBlock(Block block)
    {

        String raw[] = block.getRegistryName().toString().split(":");
        String name = raw[1];
        MultiPartBlockStateBuilder builder = getMultipartBuilder(block).part().modelFile(new UncheckedModelFile(mod_id + ":block/" + name + "_top")).addModel().end();
        builder.part().modelFile(new UncheckedModelFile(mod_id + ":block/" + name + "_foot")).uvLock(true).addModel().condition(TableBlock.TABLE_NORTH, true).end();
        builder.part().modelFile(new UncheckedModelFile(mod_id + ":block/" + name + "_foot")).rotationY(90).uvLock(true).addModel().condition(TableBlock.TABLE_EAST, true).end();
        builder.part().modelFile(new UncheckedModelFile(mod_id + ":block/" + name + "_foot")).rotationY(180).uvLock(true).addModel().condition(TableBlock.TABLE_SOUTH, true).end();
        builder.part().modelFile(new UncheckedModelFile(mod_id + ":block/" + name + "_foot")).rotationY(270).uvLock(true).addModel().condition(TableBlock.TABLE_WEST, true).end();
    }

    protected void couchBlock(CouchBlock block)
    {
        couchBlock(block, 0);
    }

    protected void couchBlock(CouchBlock block, int offset)
    {
        String raw[] = block.getRegistryName().toString().split(":");
        String name = raw[1];
        MultiPartBlockStateBuilder builder = getMultipartBuilder(block);

        for(Direction dir : Direction.Plane.HORIZONTAL)
        {
            builder.part().modelFile(new UncheckedModelFile(mod_id + ":block/" + name + "_left")).rotationY(((int)(dir.toYRot() + offset) % 360)).uvLock(true).addModel().condition(CouchBlock.FACING, dir).condition(CouchBlock.LEFT_END, true).end();
            builder.part().modelFile(new UncheckedModelFile(mod_id + ":block/" + name + "_right")).rotationY(((int)(dir.toYRot() + offset) % 360)).uvLock(true).addModel().condition(CouchBlock.FACING, dir).condition(CouchBlock.RIGHT_END, true).end();

            builder.part().modelFile(new UncheckedModelFile(mod_id + ":block/" + name)).rotationY(((int)(dir.toYRot() + offset) % 360)).uvLock(true).addModel().condition(CouchBlock.FACING, dir).condition(CouchBlock.SHAPE, StairsShape.STRAIGHT).end();

            builder.part().modelFile(new UncheckedModelFile(mod_id + ":block/outer_" + name)).rotationY(((int)(dir.toYRot() + 270 + offset) % 360)).uvLock(true).addModel().condition(CouchBlock.FACING, dir).condition(CouchBlock.SHAPE, StairsShape.OUTER_LEFT).end();
            builder.part().modelFile(new UncheckedModelFile(mod_id + ":block/inner_" + name)).rotationY(((int)(dir.toYRot() + offset) % 360)).uvLock(true).addModel().condition(CouchBlock.FACING, dir).condition(CouchBlock.SHAPE, StairsShape.INNER_LEFT).end();

            builder.part().modelFile(new UncheckedModelFile(mod_id + ":block/outer_" + name)).rotationY(((int)(dir.toYRot() + offset) % 360)).uvLock(true).addModel().condition(CouchBlock.FACING, dir).condition(CouchBlock.SHAPE, StairsShape.OUTER_RIGHT).end();
            builder.part().modelFile(new UncheckedModelFile(mod_id + ":block/inner_" + name)).rotationY(((int)(dir.toYRot() + 90 + offset) % 360)).uvLock(true).addModel().condition(CouchBlock.FACING, dir).condition(CouchBlock.SHAPE, StairsShape.INNER_RIGHT).end();
        }
    }

    protected void bedBlock(BedBlock block, int offset)
    {
        String raw[] = block.getRegistryName().toString().split(":");
        String name = raw[1];
        VariantBlockStateBuilder builder = getVariantBuilder(block);
        String model;

        for(Direction dir : Direction.Plane.HORIZONTAL)
        {
            for(BedPart type : BedPart.values())
            {
                model = type == BedPart.HEAD ? mod_id + ":block/" + name + "_head" : mod_id + ":block/" + name + "_foot";

                builder.partialState().with(BedBlock.PART, type).with(ChestBlock.FACING, dir).modelForState().modelFile(new UncheckedModelFile(model)).rotationY((int)((dir.toYRot() + offset) % 360)).addModel();
            }
        }
    }

    protected void chestBlock(ChestBlock block, int offset)
    {
        String raw[] = block.getRegistryName().toString().split(":");
        String name = raw[1];
        VariantBlockStateBuilder builder = getVariantBuilder(block);
        String model;

        for(Direction dir : Direction.Plane.HORIZONTAL)
        {
            for(ChestType type : ChestType.BY_ID)
            {
                model = type == ChestType.SINGLE ? mod_id + ":block/" + name : type == ChestType.LEFT ? mod_id + ":block/" + name + "_left" : mod_id + ":block/" + name + "_right";

                builder.partialState().with(ChestBlock.TYPE, type).with(ChestBlock.FACING, dir).modelForState().modelFile(new UncheckedModelFile(model)).rotationY((int)((dir.toYRot() + offset) % 360)).addModel();
            }
        }
    }

    protected void verticalChestBlock(VerticalChestBlock block, int offset)
    {
        String raw[] = block.getRegistryName().toString().split(":");
        String name = raw[1];
        VariantBlockStateBuilder builder = getVariantBuilder(block);
        String model;

        for(Direction dir : Direction.Plane.HORIZONTAL)
        {
            for(VerticalChestType type : VerticalChestType.VALUES)
            {
                model = type == VerticalChestType.SINGLE ? mod_id + ":block/" + name + "_small" : type == VerticalChestType.TOP ? mod_id + ":block/" + name + "_top" : mod_id + ":block/" + name + "_bottom";

                builder.partialState().with(VerticalChestBlock.TYPE, type).with(ChestBlock.FACING, dir).modelForState().modelFile(new UncheckedModelFile(model)).rotationY((int)((dir.toYRot() + offset) % 360)).addModel();
            }
        }
    }

    protected void tableLampBlock(LampBlock block)
    {
        String raw[] = block.getRegistryName().toString().split(":");
        String name = raw[1];
        getVariantBuilder(block).partialState().with(LampBlock.LIT, true).modelForState().modelFile(new UncheckedModelFile(mod_id + ":block/" + name + "_on")).addModel().partialState().with(LampBlock.LIT, false).modelForState().modelFile(new UncheckedModelFile(mod_id + ":block/" + name)).addModel();
    }
}