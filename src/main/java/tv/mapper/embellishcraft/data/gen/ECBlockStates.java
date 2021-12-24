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

    protected void registerStoneVariant(String name, Block block, SlabBlock slab, StairBlock stairs, WallBlock wall, Block pressure, Block button)
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

    protected void registerStoneVariantWithSideSlab(String name, Block block, SlabBlock slab, StairBlock stairs, WallBlock wall, Block pressure, Block button)
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

    @Override
    protected void registerStatesAndModels()
    {
        // Other bricks
        registerStoneVariant("dark_bricks", ECBlockRegistry.DARK_BRICKS.get(), ECBlockRegistry.DARK_BRICKS_SLAB.get(), ECBlockRegistry.DARK_BRICKS_STAIRS.get(), ECBlockRegistry.DARK_BRICKS_WALL.get(), ECBlockRegistry.DARK_BRICKS_PRESSURE_PLATE.get(), null);
        registerStoneVariant("old_bricks", ECBlockRegistry.OLD_BRICKS.get(), ECBlockRegistry.OLD_BRICKS_SLAB.get(), ECBlockRegistry.OLD_BRICKS_STAIRS.get(), ECBlockRegistry.OLD_BRICKS_WALL.get(), ECBlockRegistry.OLD_BRICKS_PRESSURE_PLATE.get(), null);
        registerStoneVariant("weared_bricks", ECBlockRegistry.WEARED_BRICKS.get(), ECBlockRegistry.WEARED_BRICKS_SLAB.get(), ECBlockRegistry.WEARED_BRICKS_STAIRS.get(), ECBlockRegistry.WEARED_BRICKS_WALL.get(), ECBlockRegistry.WEARED_BRICKS_PRESSURE_PLATE.get(), null);

        registerStoneVariant("dark_large_bricks", ECBlockRegistry.DARK_LARGE_BRICKS.get(), ECBlockRegistry.DARK_LARGE_BRICKS_SLAB.get(), ECBlockRegistry.DARK_LARGE_BRICKS_STAIRS.get(), ECBlockRegistry.DARK_LARGE_BRICKS_WALL.get(), ECBlockRegistry.DARK_LARGE_BRICKS_PRESSURE_PLATE.get(), null);
        registerStoneVariant("old_large_bricks", ECBlockRegistry.OLD_LARGE_BRICKS.get(), ECBlockRegistry.OLD_LARGE_BRICKS_SLAB.get(), ECBlockRegistry.OLD_LARGE_BRICKS_STAIRS.get(), ECBlockRegistry.OLD_LARGE_BRICKS_WALL.get(), ECBlockRegistry.OLD_LARGE_BRICKS_PRESSURE_PLATE.get(), null);
        registerStoneVariant("weared_large_bricks", ECBlockRegistry.WEARED_LARGE_BRICKS.get(), ECBlockRegistry.WEARED_LARGE_BRICKS_SLAB.get(), ECBlockRegistry.WEARED_LARGE_BRICKS_STAIRS.get(), ECBlockRegistry.WEARED_LARGE_BRICKS_WALL.get(), ECBlockRegistry.WEARED_LARGE_BRICKS_PRESSURE_PLATE.get(), null);

        // Pavings
        registerStoneVariant("concrete_paving", ECBlockRegistry.CONCRETE_PAVING.get(), ECBlockRegistry.CONCRETE_PAVING_SLAB.get(), ECBlockRegistry.CONCRETE_PAVING_STAIRS.get(), ECBlockRegistry.CONCRETE_PAVING_WALL.get(), ECBlockRegistry.CONCRETE_PAVING_PRESSURE_PLATE.get(), null);
        registerStoneVariant("damaged_paving", ECBlockRegistry.DAMAGED_PAVING.get(), ECBlockRegistry.DAMAGED_PAVING_SLAB.get(), ECBlockRegistry.DAMAGED_PAVING_STAIRS.get(), ECBlockRegistry.DAMAGED_PAVING_WALL.get(), ECBlockRegistry.DAMAGED_PAVING_PRESSURE_PLATE.get(), null);
        registerStoneVariant("dark_concrete_paving", ECBlockRegistry.DARK_CONCRETE_PAVING.get(), ECBlockRegistry.DARK_CONCRETE_PAVING_SLAB.get(), ECBlockRegistry.DARK_CONCRETE_PAVING_STAIRS.get(), ECBlockRegistry.DARK_CONCRETE_PAVING_WALL.get(), ECBlockRegistry.DARK_CONCRETE_PAVING_PRESSURE_PLATE.get(), null);
        registerStoneVariant("moist_paving", ECBlockRegistry.MOIST_PAVING.get(), ECBlockRegistry.MOIST_PAVING_SLAB.get(), ECBlockRegistry.MOIST_PAVING_STAIRS.get(), ECBlockRegistry.MOIST_PAVING_WALL.get(), ECBlockRegistry.MOIST_PAVING_PRESSURE_PLATE.get(), null);
        registerStoneVariant("polished_paving", ECBlockRegistry.POLISHED_PAVING.get(), ECBlockRegistry.POLISHED_PAVING_SLAB.get(), ECBlockRegistry.POLISHED_PAVING_STAIRS.get(), ECBlockRegistry.POLISHED_PAVING_WALL.get(), ECBlockRegistry.POLISHED_PAVING_PRESSURE_PLATE.get(), null);
        registerStoneVariant("white_concrete_paving", ECBlockRegistry.WHITE_CONCRETE_PAVING.get(), ECBlockRegistry.WHITE_CONCRETE_PAVING_SLAB.get(), ECBlockRegistry.WHITE_CONCRETE_PAVING_STAIRS.get(), ECBlockRegistry.WHITE_CONCRETE_PAVING_WALL.get(), ECBlockRegistry.WHITE_CONCRETE_PAVING_PRESSURE_PLATE.get(), null);

        // Tiles
        registerStoneVariant("concrete_tiles", ECBlockRegistry.CONCRETE_TILES.get(), ECBlockRegistry.CONCRETE_TILES_SLAB.get(), ECBlockRegistry.CONCRETE_TILES_STAIRS.get(), ECBlockRegistry.CONCRETE_TILES_WALL.get(), ECBlockRegistry.CONCRETE_TILES_PRESSURE_PLATE.get(), null);
        registerStoneVariant("skyblue_tiles", ECBlockRegistry.SKYBLUE_TILES.get(), ECBlockRegistry.SKYBLUE_TILES_SLAB.get(), ECBlockRegistry.SKYBLUE_TILES_STAIRS.get(), ECBlockRegistry.SKYBLUE_TILES_WALL.get(), ECBlockRegistry.SKYBLUE_TILES_PRESSURE_PLATE.get(), null);
        registerStoneVariant("orange_tiles", ECBlockRegistry.ORANGE_TILES.get(), ECBlockRegistry.ORANGE_TILES_SLAB.get(), ECBlockRegistry.ORANGE_TILES_STAIRS.get(), ECBlockRegistry.ORANGE_TILES_WALL.get(), ECBlockRegistry.ORANGE_TILES_PRESSURE_PLATE.get(), null);
        registerStoneVariant("blue_tiles", ECBlockRegistry.BLUE_TILES.get(), ECBlockRegistry.BLUE_TILES_SLAB.get(), ECBlockRegistry.BLUE_TILES_STAIRS.get(), ECBlockRegistry.BLUE_TILES_WALL.get(), ECBlockRegistry.BLUE_TILES_PRESSURE_PLATE.get(), null);
        registerStoneVariant("light_blue_tiles", ECBlockRegistry.LIGHT_BLUE_TILES.get(), ECBlockRegistry.LIGHT_BLUE_TILES_SLAB.get(), ECBlockRegistry.LIGHT_BLUE_TILES_STAIRS.get(), ECBlockRegistry.LIGHT_BLUE_TILES_WALL.get(), ECBlockRegistry.LIGHT_BLUE_TILES_PRESSURE_PLATE.get(), null);
        registerStoneVariant("red_tiles", ECBlockRegistry.RED_TILES.get(), ECBlockRegistry.RED_TILES_SLAB.get(), ECBlockRegistry.RED_TILES_STAIRS.get(), ECBlockRegistry.RED_TILES_WALL.get(), ECBlockRegistry.RED_TILES_PRESSURE_PLATE.get(), null);
        registerStoneVariant("white_tiles", ECBlockRegistry.WHITE_TILES.get(), ECBlockRegistry.WHITE_TILES_SLAB.get(), ECBlockRegistry.WHITE_TILES_STAIRS.get(), ECBlockRegistry.WHITE_TILES_WALL.get(), ECBlockRegistry.WHITE_TILES_PRESSURE_PLATE.get(), null);
        registerStoneVariant("yellow_tiles", ECBlockRegistry.YELLOW_TILES.get(), ECBlockRegistry.YELLOW_TILES_SLAB.get(), ECBlockRegistry.YELLOW_TILES_STAIRS.get(), ECBlockRegistry.YELLOW_TILES_WALL.get(), ECBlockRegistry.YELLOW_TILES_PRESSURE_PLATE.get(), null);
        registerStoneVariant("yellow_grey_tiles", ECBlockRegistry.YELLOW_GREY_TILES.get(), ECBlockRegistry.YELLOW_GREY_TILES_SLAB.get(), ECBlockRegistry.YELLOW_GREY_TILES_STAIRS.get(), ECBlockRegistry.YELLOW_GREY_TILES_WALL.get(), ECBlockRegistry.YELLOW_GREY_TILES_PRESSURE_PLATE.get(), null);

        // Metal blocks
        registerStoneVariant("dark_metal_floor", ECBlockRegistry.DARK_METAL_FLOOR.get(), ECBlockRegistry.DARK_METAL_FLOOR_SLAB.get(), ECBlockRegistry.DARK_METAL_FLOOR_STAIRS.get(), ECBlockRegistry.DARK_METAL_FLOOR_WALL.get(), ECBlockRegistry.DARK_METAL_FLOOR_PRESSURE_PLATE.get(), null);
        registerStoneVariant("light_metal_floor", ECBlockRegistry.LIGHT_METAL_FLOOR.get(), ECBlockRegistry.LIGHT_METAL_FLOOR_SLAB.get(), ECBlockRegistry.LIGHT_METAL_FLOOR_STAIRS.get(), ECBlockRegistry.LIGHT_METAL_FLOOR_WALL.get(), ECBlockRegistry.LIGHT_METAL_FLOOR_PRESSURE_PLATE.get(), null);
        registerStoneVariant("rusty_plate", ECBlockRegistry.RUSTY_PLATE.get(), ECBlockRegistry.RUSTY_PLATE_SLAB.get(), ECBlockRegistry.RUSTY_PLATE_STAIRS.get(), ECBlockRegistry.RUSTY_PLATE_WALL.get(), ECBlockRegistry.RUSTY_PLATE_PRESSURE_PLATE.get(), null);

        axisBlock(ECBlockRegistry.IRON_BEAM.get(), modLoc("block/iron_beam"), modLoc("block/iron_beam_junction"));
        axisBlock(ECBlockRegistry.BOLTED_IRON_BEAM.get(), modLoc("block/bolted_iron_beam"), modLoc("block/iron_beam_junction"));
        simpleBlock(ECBlockRegistry.IRON_BEAM_JUNCTION.get());

        axisBlock(ECBlockRegistry.STEEL_BEAM.get(), modLoc("block/steel_beam"), modLoc("block/steel_beam_junction"));
        axisBlock(ECBlockRegistry.BOLTED_STEEL_BEAM.get(), modLoc("block/bolted_steel_beam"), modLoc("block/steel_beam_junction"));
        simpleBlock(ECBlockRegistry.STEEL_BEAM_JUNCTION.get());

        simpleBlock(ECBlockRegistry.AIR_DUCT.get());
        directionalBlock(ECBlockRegistry.VENT_AIR_DUCT.get(), new UncheckedModelFile(mod_id + ":block/vent_air_duct"));
        directionalBlock(ECBlockRegistry.GRID_AIR_DUCT.get(), new UncheckedModelFile(mod_id + ":block/grid_air_duct"));

        simpleBlock(ECBlockRegistry.BULKHEAD.get());
        simpleBlock(ECBlockRegistry.BULKHEAD_TOP.get());

        horizontalBlock(ECBlockRegistry.STEEL_WALL_LADDER.get(), new UncheckedModelFile(mod_id + ":block/steel_wall_ladder"), 0);
        horizontalBlock(ECBlockRegistry.RUSTY_WALL_LADDER.get(), new UncheckedModelFile(mod_id + ":block/rusty_wall_ladder"), 0);
        horizontalBlock(ECBlockRegistry.STEEL_RUNGS.get(), new UncheckedModelFile(mod_id + ":block/steel_rungs"));
        horizontalBlock(ECBlockRegistry.RUSTY_RUNGS.get(), new UncheckedModelFile(mod_id + ":block/rusty_rungs"));

        // Corrugated metal plates
        for(int j = 0; j < DyeColor.values().length; j++)
        {
            registerStoneVariant(DyeColor.byId(j).getSerializedName() + "_corrugated_metal_plate", ECBlockRegistry.CORRUGATED_METAL_PLATE_BLOCKS.get(DyeColor.byId(j)).get(), ECBlockRegistry.CORRUGATED_METAL_PLATE_SLABS.get(DyeColor.byId(j)).get(), ECBlockRegistry.CORRUGATED_METAL_PLATE_STAIRS.get(DyeColor.byId(j)).get(), ECBlockRegistry.CORRUGATED_METAL_PLATE_WALLS.get(DyeColor.byId(j)).get(), ECBlockRegistry.CORRUGATED_METAL_PLATE_PRESSURE_PLATES.get(DyeColor.byId(j)).get(), null);
            fenceBlock(ECBlockRegistry.CORRUGATED_METAL_PLATE_FENCES.get(DyeColor.byId(j)).get(), modLoc("block/" + DyeColor.byId(j).getSerializedName() + "_corrugated_metal_plate"));
            fenceGateBlock(ECBlockRegistry.CORRUGATED_METAL_PLATE_FENCE_GATES.get(DyeColor.byId(j)).get(), modLoc("block/" + DyeColor.byId(j).getSerializedName() + "_corrugated_metal_plate"));
        }

        // Wallpaper
        registerStoneVariant("white_blue_wallpaper", ECBlockRegistry.WHITE_BLUE_WALLPAPER.get(), ECBlockRegistry.WHITE_BLUE_WALLPAPER_SLAB.get(), ECBlockRegistry.WHITE_BLUE_WALLPAPER_STAIRS.get(), null, null, null);
        upDownBlock(ECBlockRegistry.WHITE_BLUE_WALLPAPER_PLINTH.get(), new UncheckedModelFile(mod_id + ":block/white_blue_wallpaper_plinth"));
        registerStoneVariant("beige_flower_wallpaper", ECBlockRegistry.BEIGE_FLOWER_WALLPAPER.get(), ECBlockRegistry.BEIGE_FLOWER_WALLPAPER_SLAB.get(), ECBlockRegistry.BEIGE_FLOWER_WALLPAPER_STAIRS.get(), null, null, null);
        upDownBlock(ECBlockRegistry.BEIGE_FLOWER_WALLPAPER_PLINTH.get(), new UncheckedModelFile(mod_id + ":block/beige_flower_wallpaper_plinth"));
        registerStoneVariant("beige_wallpaper", ECBlockRegistry.BEIGE_WALLPAPER.get(), ECBlockRegistry.BEIGE_WALLPAPER_SLAB.get(), ECBlockRegistry.BEIGE_WALLPAPER_STAIRS.get(), null, null, null);
        upDownBlock(ECBlockRegistry.BEIGE_WALLPAPER_PLINTH.get(), new UncheckedModelFile(mod_id + ":block/beige_wallpaper_plinth"));
        registerStoneVariant("pink_wallpaper", ECBlockRegistry.PINK_WALLPAPER.get(), ECBlockRegistry.PINK_WALLPAPER_SLAB.get(), ECBlockRegistry.PINK_WALLPAPER_STAIRS.get(), null, null, null);
        upDownBlock(ECBlockRegistry.PINK_WALLPAPER_PLINTH.get(), new UncheckedModelFile(mod_id + ":block/pink_wallpaper_plinth"));
        registerStoneVariant("white_green_wallpaper", ECBlockRegistry.WHITE_GREEN_WALLPAPER.get(), ECBlockRegistry.WHITE_GREEN_WALLPAPER_SLAB.get(), ECBlockRegistry.WHITE_GREEN_WALLPAPER_STAIRS.get(), null, null, null);
        upDownBlock(ECBlockRegistry.WHITE_GREEN_WALLPAPER_PLINTH.get(), new UncheckedModelFile(mod_id + ":block/white_green_wallpaper_plinth"));

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

        // Suspended stairs and fancy doors
        for(int j = 0; j < McWoods.values().length; j++)
        {
            horizontalBlock(ECBlockRegistry.SUSPENDED_STAIRS_BLOCKS.get(McWoods.byId(j)).get(), new UncheckedModelFile(mod_id + ":block/" + McWoods.byId(j).getSerializedName() + "_suspended_stairs"), 0);
            horizontalBlock(ECBlockRegistry.LARGE_SUSPENDED_STAIRS_BLOCKS.get(McWoods.byId(j)).get(), new UncheckedModelFile(mod_id + ":block/" + McWoods.byId(j).getSerializedName() + "_large_suspended_stairs"), 0);
            doorBlock(ECBlockRegistry.FANCY_DOOR_BLOCKS.get(McWoods.byId(j)).get(), modLoc("block/" + McWoods.byId(j).getSerializedName() + "_fancy_door_bottom"), modLoc("block/" + McWoods.byId(j).getSerializedName() + "_fancy_door_top"));
            doorBlock(ECBlockRegistry.PLAIN_DOOR_BLOCKS.get(McWoods.byId(j)).get(), modLoc("block/" + McWoods.byId(j).getSerializedName() + "_plain_door_bottom"), modLoc("block/" + McWoods.byId(j).getSerializedName() + "_plain_door_top"));
        }

        horizontalBlock(ECBlockRegistry.STEEL_SUSPENDED_STAIRS.get(), new UncheckedModelFile(mod_id + ":block/steel_suspended_stairs"), 0);
        horizontalBlock(ECBlockRegistry.RUSTY_SUSPENDED_STAIRS.get(), new UncheckedModelFile(mod_id + ":block/rusty_suspended_stairs"), 0);
        horizontalBlock(ECBlockRegistry.STEEL_LARGE_SUSPENDED_STAIRS.get(), new UncheckedModelFile(mod_id + ":block/steel_large_suspended_stairs"), 0);
        horizontalBlock(ECBlockRegistry.RUSTY_LARGE_SUSPENDED_STAIRS.get(), new UncheckedModelFile(mod_id + ":block/rusty_large_suspended_stairs"), 0);

        // Doors
        doorBlock(ECBlockRegistry.STEEL_DOOR.get(), modLoc("block/steel_door_bottom"), modLoc("block/steel_door_top"));
        doorBlock(ECBlockRegistry.STURDY_STEEL_DOOR.get(), modLoc("block/sturdy_steel_door_bottom"), modLoc("block/sturdy_steel_door_top"));
        doorBlock(ECBlockRegistry.WARNING_STEEL_DOOR.get(), modLoc("block/warning_steel_door_bottom"), modLoc("block/warning_steel_door_top"));
        doorBlock(ECBlockRegistry.WHITE_STEEL_DOOR.get(), modLoc("block/white_steel_door_bottom"), modLoc("block/white_steel_door_top"));
        doorBlock(ECBlockRegistry.STURDY_WHITE_STEEL_DOOR.get(), modLoc("block/sturdy_white_steel_door_bottom"), modLoc("block/sturdy_white_steel_door_top"));
        doorBlock(ECBlockRegistry.WARNING_WHITE_STEEL_DOOR.get(), modLoc("block/warning_white_steel_door_bottom"), modLoc("block/warning_white_steel_door_top"));
        doorBlock(ECBlockRegistry.RUSTY_DOOR.get(), modLoc("block/rusty_door_bottom"), modLoc("block/rusty_door_top"));
        doorBlock(ECBlockRegistry.STURDY_RUSTY_DOOR.get(), modLoc("block/sturdy_rusty_door_bottom"), modLoc("block/sturdy_rusty_door_top"));
        doorBlock(ECBlockRegistry.WARNING_RUSTY_DOOR.get(), modLoc("block/warning_rusty_door_bottom"), modLoc("block/warning_rusty_door_top"));
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