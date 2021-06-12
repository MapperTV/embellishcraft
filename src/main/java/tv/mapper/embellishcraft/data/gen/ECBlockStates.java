package tv.mapper.embellishcraft.data.gen;

import java.util.function.Function;

import net.minecraft.block.BedBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ChestBlock;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.StairsBlock;
import net.minecraft.block.WallBlock;
import net.minecraft.data.DataGenerator;
import net.minecraft.item.DyeColor;
import net.minecraft.state.properties.BedPart;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.state.properties.ChestType;
import net.minecraft.state.properties.StairsShape;
import net.minecraft.util.Direction;
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
import tv.mapper.embellishcraft.util.RockType;
import tv.mapper.mapperbase.data.gen.BaseBlockStates;

public class ECBlockStates extends BaseBlockStates
{
    public ECBlockStates(DataGenerator gen, String modid, ExistingFileHelper exFileHelper)
    {
        super(gen, modid, exFileHelper);
    }

    private void registerStoneVariant(String name, Block block, SlabBlock slab, StairsBlock stairs, WallBlock wall, Block pressure, Block button)
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

    private void registerStoneVariantWithSideSlab(String name, Block block, SlabBlock slab, StairsBlock stairs, WallBlock wall, Block pressure, Block button)
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
        // Rocks
        for(int j = 0; j < RockType.values().length; j++)
        {
            registerStoneVariant(RockType.byId(j).getString(), ECBlockRegistry.ROCK_BLOCKS.get(RockType.byId(j)).get(), ECBlockRegistry.ROCK_SLABS.get(RockType.byId(j)).get(), ECBlockRegistry.ROCK_STAIRS.get(RockType.byId(j)).get(), ECBlockRegistry.ROCK_WALLS.get(RockType.byId(j)).get(), ECBlockRegistry.ROCK_PRESSURE_PLATES.get(RockType.byId(j)).get(), ECBlockRegistry.ROCK_BUTTONS.get(RockType.byId(j)).get());

            registerStoneVariant(RockType.byId(j).getString() + "_cobblestone", ECBlockRegistry.ROCK_COBBLESTONES.get(RockType.byId(j)).get(), ECBlockRegistry.ROCK_COBBLESTONE_SLABS.get(RockType.byId(j)).get(), ECBlockRegistry.ROCK_COBBLESTONE_STAIRS.get(RockType.byId(j)).get(), ECBlockRegistry.ROCK_COBBLESTONE_WALLS.get(RockType.byId(j)).get(), ECBlockRegistry.ROCK_COBBLESTONE_PRESSURE_PLATES.get(RockType.byId(j)).get(), null);
            
            registerStoneVariant(RockType.byId(j).getString() + "_cobblestone_bricks", ECBlockRegistry.ROCK_COBBLESTONE_BRICKS.get(RockType.byId(j)).get(), ECBlockRegistry.ROCK_COBBLESTONE_BRICKS_SLABS.get(RockType.byId(j)).get(), ECBlockRegistry.ROCK_COBBLESTONE_BRICKS_STAIRS.get(RockType.byId(j)).get(), ECBlockRegistry.ROCK_COBBLESTONE_BRICKS_WALLS.get(RockType.byId(j)).get(), ECBlockRegistry.ROCK_COBBLESTONE_BRICKS_PRESSURE_PLATES.get(RockType.byId(j)).get(), null);

            registerStoneVariant("smooth_" + RockType.byId(j).getString(), ECBlockRegistry.SMOOTH_ROCK_BLOCKS.get(RockType.byId(j)).get(), ECBlockRegistry.SMOOTH_ROCK_SLABS.get(RockType.byId(j)).get(), ECBlockRegistry.SMOOTH_ROCK_STAIRS.get(RockType.byId(j)).get(), ECBlockRegistry.SMOOTH_ROCK_WALLS.get(RockType.byId(j)).get(), ECBlockRegistry.SMOOTH_ROCK_PRESSURE_PLATES.get(RockType.byId(j)).get(), null);

            registerStoneVariantWithSideSlab("polished_" + RockType.byId(j).getString(), ECBlockRegistry.POLISHED_ROCK_BLOCKS.get(RockType.byId(j)).get(), ECBlockRegistry.POLISHED_ROCK_SLABS.get(RockType.byId(j)).get(), ECBlockRegistry.POLISHED_ROCK_STAIRS.get(RockType.byId(j)).get(), ECBlockRegistry.POLISHED_ROCK_WALLS.get(RockType.byId(j)).get(), ECBlockRegistry.POLISHED_ROCK_PRESSURE_PLATES.get(RockType.byId(j)).get(), null);

            registerStoneVariant(RockType.byId(j).getString() + "_paving", ECBlockRegistry.ROCK_PAVINGS.get(RockType.byId(j)).get(), ECBlockRegistry.ROCK_PAVING_SLABS.get(RockType.byId(j)).get(), ECBlockRegistry.ROCK_PAVING_STAIRS.get(RockType.byId(j)).get(), ECBlockRegistry.ROCK_PAVING_WALLS.get(RockType.byId(j)).get(), ECBlockRegistry.ROCK_PAVING_PRESSURE_PLATES.get(RockType.byId(j)).get(), null);

            registerStoneVariant(RockType.byId(j).getString() + "_tiles", ECBlockRegistry.ROCK_TILES.get(RockType.byId(j)).get(), ECBlockRegistry.ROCK_TILES_SLABS.get(RockType.byId(j)).get(), ECBlockRegistry.ROCK_TILES_STAIRS.get(RockType.byId(j)).get(), ECBlockRegistry.ROCK_TILES_WALLS.get(RockType.byId(j)).get(), ECBlockRegistry.ROCK_TILES_PRESSURE_PLATES.get(RockType.byId(j)).get(), null);

            registerStoneVariant(RockType.byId(j).getString() + "_bricks", ECBlockRegistry.ROCK_BRICKS.get(RockType.byId(j)).get(), ECBlockRegistry.ROCK_BRICKS_SLABS.get(RockType.byId(j)).get(), ECBlockRegistry.ROCK_BRICKS_STAIRS.get(RockType.byId(j)).get(), ECBlockRegistry.ROCK_BRICKS_WALLS.get(RockType.byId(j)).get(), ECBlockRegistry.ROCK_BRICKS_PRESSURE_PLATES.get(RockType.byId(j)).get(), null);

            registerStoneVariant(RockType.byId(j).getString() + "_large_bricks", ECBlockRegistry.ROCK_LARGE_BRICKS.get(RockType.byId(j)).get(), ECBlockRegistry.ROCK_LARGE_BRICKS_SLABS.get(RockType.byId(j)).get(), ECBlockRegistry.ROCK_LARGE_BRICKS_STAIRS.get(RockType.byId(j)).get(), ECBlockRegistry.ROCK_LARGE_BRICKS_WALLS.get(RockType.byId(j)).get(), ECBlockRegistry.ROCK_LARGE_BRICKS_PRESSURE_PLATES.get(RockType.byId(j)).get(), null);

            registerStoneVariant(RockType.byId(j).getString() + "_paving_stones", ECBlockRegistry.ROCK_PAVING_STONES.get(RockType.byId(j)).get(), ECBlockRegistry.ROCK_PAVING_STONES_SLABS.get(RockType.byId(j)).get(), ECBlockRegistry.ROCK_PAVING_STONES_STAIRS.get(RockType.byId(j)).get(), ECBlockRegistry.ROCK_PAVING_STONES_WALLS.get(RockType.byId(j)).get(), ECBlockRegistry.ROCK_PAVING_STONES_PRESSURE_PLATES.get(RockType.byId(j)).get(), null);

            registerStoneVariant(RockType.byId(j).getString() + "_ornament", ECBlockRegistry.ROCK_ORNAMENTS.get(RockType.byId(j)).get(), null, null, null, ECBlockRegistry.ROCK_ORNAMENT_PRESSURE_PLATES.get(RockType.byId(j)).get(), null);

            registerStoneVariant(RockType.byId(j).getString() + "_rooftiles", ECBlockRegistry.ROCK_ROOFTILES.get(RockType.byId(j)).get(), ECBlockRegistry.ROCK_ROOFTILES_SLABS.get(RockType.byId(j)).get(), null, null, null, null);
            rooftilesStairsBlock(ECBlockRegistry.ROCK_ROOFTILES_STAIRS.get(RockType.byId(j)).get(), modLoc("block/" + RockType.byId(j).getString() + "_rooftiles"));

        }

        registerStoneVariant("paving_stones", ECBlockRegistry.PAVING_STONES.get(), ECBlockRegistry.PAVING_STONES_SLAB.get(), ECBlockRegistry.PAVING_STONES_STAIRS.get(), ECBlockRegistry.PAVING_STONES_WALL.get(), ECBlockRegistry.PAVING_STONES_PRESSURE_PLATE.get(), null);

        // Andesite
        registerStoneVariant("andesite", null, null, null, null, null, ECBlockRegistry.ANDESITE_BUTTON.get());
        registerStoneVariant("smooth_andesite", ECBlockRegistry.SMOOTH_ANDESITE.get(), ECBlockRegistry.SMOOTH_ANDESITE_SLAB.get(), ECBlockRegistry.SMOOTH_ANDESITE_STAIRS.get(), ECBlockRegistry.SMOOTH_ANDESITE_WALL.get(), ECBlockRegistry.SMOOTH_ANDESITE_PRESSURE_PLATE.get(), null);
        registerStoneVariant("andesite_paving", ECBlockRegistry.ANDESITE_PAVING.get(), ECBlockRegistry.ANDESITE_PAVING_SLAB.get(), ECBlockRegistry.ANDESITE_PAVING_STAIRS.get(), ECBlockRegistry.ANDESITE_PAVING_WALL.get(), ECBlockRegistry.ANDESITE_PAVING_PRESSURE_PLATE.get(), null);
        registerStoneVariant("andesite_tiles", ECBlockRegistry.ANDESITE_TILES.get(), ECBlockRegistry.ANDESITE_TILES_SLAB.get(), ECBlockRegistry.ANDESITE_TILES_STAIRS.get(), ECBlockRegistry.ANDESITE_TILES_WALL.get(), ECBlockRegistry.ANDESITE_TILES_PRESSURE_PLATE.get(), null);
        registerStoneVariant("andesite_bricks", ECBlockRegistry.ANDESITE_BRICKS.get(), ECBlockRegistry.ANDESITE_BRICKS_SLAB.get(), ECBlockRegistry.ANDESITE_BRICKS_STAIRS.get(), ECBlockRegistry.ANDESITE_BRICKS_WALL.get(), ECBlockRegistry.ANDESITE_BRICKS_PRESSURE_PLATE.get(), null);
        registerStoneVariant("andesite_large_bricks", ECBlockRegistry.ANDESITE_LARGE_BRICKS.get(), ECBlockRegistry.ANDESITE_LARGE_BRICKS_SLAB.get(), ECBlockRegistry.ANDESITE_LARGE_BRICKS_STAIRS.get(), ECBlockRegistry.ANDESITE_LARGE_BRICKS_WALL.get(), ECBlockRegistry.ANDESITE_LARGE_BRICKS_PRESSURE_PLATE.get(), null);
        registerStoneVariant("andesite_paving_stones", ECBlockRegistry.ANDESITE_PAVING_STONES.get(), ECBlockRegistry.ANDESITE_PAVING_STONES_SLAB.get(), ECBlockRegistry.ANDESITE_PAVING_STONES_STAIRS.get(), ECBlockRegistry.ANDESITE_PAVING_STONES_WALL.get(), ECBlockRegistry.ANDESITE_PAVING_STONES_PRESSURE_PLATE.get(), null);
        registerStoneVariant("andesite_ornament", ECBlockRegistry.ANDESITE_ORNAMENT.get(), null, null, null, ECBlockRegistry.ANDESITE_ORNAMENT_PRESSURE_PLATE.get(), null);
        registerStoneVariant("andesite_rooftiles", ECBlockRegistry.ANDESITE_ROOFTILES.get(), ECBlockRegistry.ANDESITE_ROOFTILES_SLAB.get(), null, null, null, null);
        rooftilesStairsBlock(ECBlockRegistry.ANDESITE_ROOFTILES_STAIRS.get(), modLoc("block/andesite_rooftiles"));

        // Diorite
        registerStoneVariant("diorite", null, null, null, null, null, ECBlockRegistry.DIORITE_BUTTON.get());
        registerStoneVariant("smooth_diorite", ECBlockRegistry.SMOOTH_DIORITE.get(), ECBlockRegistry.SMOOTH_DIORITE_SLAB.get(), ECBlockRegistry.SMOOTH_DIORITE_STAIRS.get(), ECBlockRegistry.SMOOTH_DIORITE_WALL.get(), ECBlockRegistry.SMOOTH_DIORITE_PRESSURE_PLATE.get(), null);
        registerStoneVariant("diorite_paving", ECBlockRegistry.DIORITE_PAVING.get(), ECBlockRegistry.DIORITE_PAVING_SLAB.get(), ECBlockRegistry.DIORITE_PAVING_STAIRS.get(), ECBlockRegistry.DIORITE_PAVING_WALL.get(), ECBlockRegistry.DIORITE_PAVING_PRESSURE_PLATE.get(), null);
        registerStoneVariant("diorite_tiles", ECBlockRegistry.DIORITE_TILES.get(), ECBlockRegistry.DIORITE_TILES_SLAB.get(), ECBlockRegistry.DIORITE_TILES_STAIRS.get(), ECBlockRegistry.DIORITE_TILES_WALL.get(), ECBlockRegistry.DIORITE_TILES_PRESSURE_PLATE.get(), null);
        registerStoneVariant("diorite_bricks", ECBlockRegistry.DIORITE_BRICKS.get(), ECBlockRegistry.DIORITE_BRICKS_SLAB.get(), ECBlockRegistry.DIORITE_BRICKS_STAIRS.get(), ECBlockRegistry.DIORITE_BRICKS_WALL.get(), ECBlockRegistry.DIORITE_BRICKS_PRESSURE_PLATE.get(), null);
        registerStoneVariant("diorite_large_bricks", ECBlockRegistry.DIORITE_LARGE_BRICKS.get(), ECBlockRegistry.DIORITE_LARGE_BRICKS_SLAB.get(), ECBlockRegistry.DIORITE_LARGE_BRICKS_STAIRS.get(), ECBlockRegistry.DIORITE_LARGE_BRICKS_WALL.get(), ECBlockRegistry.DIORITE_LARGE_BRICKS_PRESSURE_PLATE.get(), null);
        registerStoneVariant("diorite_paving_stones", ECBlockRegistry.DIORITE_PAVING_STONES.get(), ECBlockRegistry.DIORITE_PAVING_STONES_SLAB.get(), ECBlockRegistry.DIORITE_PAVING_STONES_STAIRS.get(), ECBlockRegistry.DIORITE_PAVING_STONES_WALL.get(), ECBlockRegistry.DIORITE_PAVING_STONES_PRESSURE_PLATE.get(), null);
        registerStoneVariant("diorite_ornament", ECBlockRegistry.DIORITE_ORNAMENT.get(), null, null, null, ECBlockRegistry.DIORITE_ORNAMENT_PRESSURE_PLATE.get(), null);
        registerStoneVariant("diorite_rooftiles", ECBlockRegistry.DIORITE_ROOFTILES.get(), ECBlockRegistry.DIORITE_ROOFTILES_SLAB.get(), null, null, null, null);
        rooftilesStairsBlock(ECBlockRegistry.DIORITE_ROOFTILES_STAIRS.get(), modLoc("block/diorite_rooftiles"));

        // Granite
        registerStoneVariant("granite", null, null, null, null, null, ECBlockRegistry.GRANITE_BUTTON.get());
        registerStoneVariant("smooth_granite", ECBlockRegistry.SMOOTH_GRANITE.get(), ECBlockRegistry.SMOOTH_GRANITE_SLAB.get(), ECBlockRegistry.SMOOTH_GRANITE_STAIRS.get(), ECBlockRegistry.SMOOTH_GRANITE_WALL.get(), ECBlockRegistry.SMOOTH_GRANITE_PRESSURE_PLATE.get(), null);
        registerStoneVariant("granite_paving", ECBlockRegistry.GRANITE_PAVING.get(), ECBlockRegistry.GRANITE_PAVING_SLAB.get(), ECBlockRegistry.GRANITE_PAVING_STAIRS.get(), ECBlockRegistry.GRANITE_PAVING_WALL.get(), ECBlockRegistry.GRANITE_PAVING_PRESSURE_PLATE.get(), null);
        registerStoneVariant("granite_tiles", ECBlockRegistry.GRANITE_TILES.get(), ECBlockRegistry.GRANITE_TILES_SLAB.get(), ECBlockRegistry.GRANITE_TILES_STAIRS.get(), ECBlockRegistry.GRANITE_TILES_WALL.get(), ECBlockRegistry.GRANITE_TILES_PRESSURE_PLATE.get(), null);
        registerStoneVariant("granite_bricks", ECBlockRegistry.GRANITE_BRICKS.get(), ECBlockRegistry.GRANITE_BRICKS_SLAB.get(), ECBlockRegistry.GRANITE_BRICKS_STAIRS.get(), ECBlockRegistry.GRANITE_BRICKS_WALL.get(), ECBlockRegistry.GRANITE_BRICKS_PRESSURE_PLATE.get(), null);
        registerStoneVariant("granite_large_bricks", ECBlockRegistry.GRANITE_LARGE_BRICKS.get(), ECBlockRegistry.GRANITE_LARGE_BRICKS_SLAB.get(), ECBlockRegistry.GRANITE_LARGE_BRICKS_STAIRS.get(), ECBlockRegistry.GRANITE_LARGE_BRICKS_WALL.get(), ECBlockRegistry.GRANITE_LARGE_BRICKS_PRESSURE_PLATE.get(), null);
        registerStoneVariant("granite_paving_stones", ECBlockRegistry.GRANITE_PAVING_STONES.get(), ECBlockRegistry.GRANITE_PAVING_STONES_SLAB.get(), ECBlockRegistry.GRANITE_PAVING_STONES_STAIRS.get(), ECBlockRegistry.GRANITE_PAVING_STONES_WALL.get(), ECBlockRegistry.GRANITE_PAVING_STONES_PRESSURE_PLATE.get(), null);
        registerStoneVariant("granite_ornament", ECBlockRegistry.GRANITE_ORNAMENT.get(), null, null, null, ECBlockRegistry.GRANITE_ORNAMENT_PRESSURE_PLATE.get(), null);
        registerStoneVariant("granite_rooftiles", ECBlockRegistry.GRANITE_ROOFTILES.get(), ECBlockRegistry.GRANITE_ROOFTILES_SLAB.get(), null, null, null, null);
        rooftilesStairsBlock(ECBlockRegistry.GRANITE_ROOFTILES_STAIRS.get(), modLoc("block/granite_rooftiles"));

        // Sandstone
        buttonBlock(ECBlockRegistry.SANDSTONE_BUTTON.get(), new UncheckedModelFile(mod_id + ":block/sandstone_button"), new UncheckedModelFile(mod_id + ":block/sandstone_button_pressed"), 180);

        // wallBlock(ECBlockRegistry.SMOOTH_SANDSTONE_WALL.get(), mcLoc("block/sandstone_top"));
        newWallBlock(ECBlockRegistry.SMOOTH_SANDSTONE_WALL.get(), new UncheckedModelFile(ECConstants.MODID + ":block/smooth_sandstone_wall_post"), new UncheckedModelFile(ECConstants.MODID + ":block/smooth_sandstone_wall_side"), new UncheckedModelFile(ECConstants.MODID + ":block/smooth_sandstone_wall_side_tall"));
        pressurePlateBlock(ECBlockRegistry.SMOOTH_SANDSTONE_PRESSURE_PLATE.get(), new UncheckedModelFile(mod_id + ":block/smooth_sandstone_pressure_plate"), new UncheckedModelFile(mod_id + ":block/smooth_sandstone_pressure_plate_down"));

        registerStoneVariantWithSideSlab("polished_sandstone", ECBlockRegistry.POLISHED_SANDSTONE.get(), ECBlockRegistry.POLISHED_SANDSTONE_SLAB.get(), ECBlockRegistry.POLISHED_SANDSTONE_STAIRS.get(), ECBlockRegistry.POLISHED_SANDSTONE_WALL.get(), ECBlockRegistry.POLISHED_SANDSTONE_PRESSURE_PLATE.get(), null);
        registerStoneVariant("sandstone_paving", ECBlockRegistry.SANDSTONE_PAVING.get(), ECBlockRegistry.SANDSTONE_PAVING_SLAB.get(), ECBlockRegistry.SANDSTONE_PAVING_STAIRS.get(), ECBlockRegistry.SANDSTONE_PAVING_WALL.get(), ECBlockRegistry.SANDSTONE_PAVING_PRESSURE_PLATE.get(), null);
        registerStoneVariant("sandstone_tiles", ECBlockRegistry.SANDSTONE_TILES.get(), ECBlockRegistry.SANDSTONE_TILES_SLAB.get(), ECBlockRegistry.SANDSTONE_TILES_STAIRS.get(), ECBlockRegistry.SANDSTONE_TILES_WALL.get(), ECBlockRegistry.SANDSTONE_TILES_PRESSURE_PLATE.get(), null);
        registerStoneVariant("sandstone_bricks", ECBlockRegistry.SANDSTONE_BRICKS.get(), ECBlockRegistry.SANDSTONE_BRICKS_SLAB.get(), ECBlockRegistry.SANDSTONE_BRICKS_STAIRS.get(), ECBlockRegistry.SANDSTONE_BRICKS_WALL.get(), ECBlockRegistry.SANDSTONE_BRICKS_PRESSURE_PLATE.get(), null);
        registerStoneVariant("sandstone_large_bricks", ECBlockRegistry.SANDSTONE_LARGE_BRICKS.get(), ECBlockRegistry.SANDSTONE_LARGE_BRICKS_SLAB.get(), ECBlockRegistry.SANDSTONE_LARGE_BRICKS_STAIRS.get(), ECBlockRegistry.SANDSTONE_LARGE_BRICKS_WALL.get(), ECBlockRegistry.SANDSTONE_LARGE_BRICKS_PRESSURE_PLATE.get(), null);
        registerStoneVariant("sandstone_paving_stones", ECBlockRegistry.SANDSTONE_PAVING_STONES.get(), ECBlockRegistry.SANDSTONE_PAVING_STONES_SLAB.get(), ECBlockRegistry.SANDSTONE_PAVING_STONES_STAIRS.get(), ECBlockRegistry.SANDSTONE_PAVING_STONES_WALL.get(), ECBlockRegistry.SANDSTONE_PAVING_STONES_PRESSURE_PLATE.get(), null);
        registerStoneVariant("sandstone_rooftiles", ECBlockRegistry.SANDSTONE_ROOFTILES.get(), ECBlockRegistry.SANDSTONE_ROOFTILES_SLAB.get(), null, null, null, null);
        rooftilesStairsBlock(ECBlockRegistry.SANDSTONE_ROOFTILES_STAIRS.get(), modLoc("block/sandstone_rooftiles"));

        // Red Sandstone
        buttonBlock(ECBlockRegistry.RED_SANDSTONE_BUTTON.get(), new UncheckedModelFile(mod_id + ":block/red_sandstone_button"), new UncheckedModelFile(mod_id + ":block/red_sandstone_button_pressed"), 180);

        // wallBlock(ECBlockRegistry.SMOOTH_RED_SANDSTONE_WALL.get(), mcLoc("block/red_sandstone_top"));
        newWallBlock(ECBlockRegistry.SMOOTH_RED_SANDSTONE_WALL.get(), new UncheckedModelFile(ECConstants.MODID + ":block/smooth_red_sandstone_wall_post"), new UncheckedModelFile(ECConstants.MODID + ":block/smooth_red_sandstone_wall_side"), new UncheckedModelFile(ECConstants.MODID + ":block/smooth_red_sandstone_wall_side_tall"));
        pressurePlateBlock(ECBlockRegistry.SMOOTH_RED_SANDSTONE_PRESSURE_PLATE.get(), new UncheckedModelFile(mod_id + ":block/smooth_red_sandstone_pressure_plate"), new UncheckedModelFile(mod_id + ":block/smooth_red_sandstone_pressure_plate_down"));

        registerStoneVariantWithSideSlab("polished_red_sandstone", ECBlockRegistry.POLISHED_RED_SANDSTONE.get(), ECBlockRegistry.POLISHED_RED_SANDSTONE_SLAB.get(), ECBlockRegistry.POLISHED_RED_SANDSTONE_STAIRS.get(), ECBlockRegistry.POLISHED_RED_SANDSTONE_WALL.get(), ECBlockRegistry.POLISHED_RED_SANDSTONE_PRESSURE_PLATE.get(), null);
        registerStoneVariant("red_sandstone_paving", ECBlockRegistry.RED_SANDSTONE_PAVING.get(), ECBlockRegistry.RED_SANDSTONE_PAVING_SLAB.get(), ECBlockRegistry.RED_SANDSTONE_PAVING_STAIRS.get(), ECBlockRegistry.RED_SANDSTONE_PAVING_WALL.get(), ECBlockRegistry.RED_SANDSTONE_PAVING_PRESSURE_PLATE.get(), null);
        registerStoneVariant("red_sandstone_tiles", ECBlockRegistry.RED_SANDSTONE_TILES.get(), ECBlockRegistry.RED_SANDSTONE_TILES_SLAB.get(), ECBlockRegistry.RED_SANDSTONE_TILES_STAIRS.get(), ECBlockRegistry.RED_SANDSTONE_TILES_WALL.get(), ECBlockRegistry.RED_SANDSTONE_TILES_PRESSURE_PLATE.get(), null);
        registerStoneVariant("red_sandstone_bricks", ECBlockRegistry.RED_SANDSTONE_BRICKS.get(), ECBlockRegistry.RED_SANDSTONE_BRICKS_SLAB.get(), ECBlockRegistry.RED_SANDSTONE_BRICKS_STAIRS.get(), ECBlockRegistry.RED_SANDSTONE_BRICKS_WALL.get(), ECBlockRegistry.RED_SANDSTONE_BRICKS_PRESSURE_PLATE.get(), null);
        registerStoneVariant("red_sandstone_large_bricks", ECBlockRegistry.RED_SANDSTONE_LARGE_BRICKS.get(), ECBlockRegistry.RED_SANDSTONE_LARGE_BRICKS_SLAB.get(), ECBlockRegistry.RED_SANDSTONE_LARGE_BRICKS_STAIRS.get(), ECBlockRegistry.RED_SANDSTONE_LARGE_BRICKS_WALL.get(), ECBlockRegistry.RED_SANDSTONE_LARGE_BRICKS_PRESSURE_PLATE.get(), null);
        registerStoneVariant("red_sandstone_paving_stones", ECBlockRegistry.RED_SANDSTONE_PAVING_STONES.get(), ECBlockRegistry.RED_SANDSTONE_PAVING_STONES_SLAB.get(), ECBlockRegistry.RED_SANDSTONE_PAVING_STONES_STAIRS.get(), ECBlockRegistry.RED_SANDSTONE_PAVING_STONES_WALL.get(), ECBlockRegistry.RED_SANDSTONE_PAVING_STONES_PRESSURE_PLATE.get(), null);
        registerStoneVariant("red_sandstone_rooftiles", ECBlockRegistry.RED_SANDSTONE_ROOFTILES.get(), ECBlockRegistry.RED_SANDSTONE_ROOFTILES_SLAB.get(), null, null, null, null);
        rooftilesStairsBlock(ECBlockRegistry.RED_SANDSTONE_ROOFTILES_STAIRS.get(), modLoc("block/red_sandstone_rooftiles"));

        // Terracotta
        slabBlock(ECBlockRegistry.TERRACOTTA_SLAB.get(), mcLoc("block/terracotta"), mcLoc("block/terracotta"));
        stairsBlock(ECBlockRegistry.TERRACOTTA_STAIRS.get(), mcLoc("block/terracotta"));
        // wallBlock(ECBlockRegistry.TERRACOTTA_WALL.get(), mcLoc("block/terracotta"));
        newWallBlock(ECBlockRegistry.TERRACOTTA_WALL.get(), new UncheckedModelFile(ECConstants.MODID + ":block/terracotta_wall_post"), new UncheckedModelFile(ECConstants.MODID + ":block/terracotta_wall_side"), new UncheckedModelFile(ECConstants.MODID + ":block/terracotta_wall_side_tall"));
        pressurePlateBlock(ECBlockRegistry.TERRACOTTA_PRESSURE_PLATE.get(), new UncheckedModelFile(mod_id + ":block/terracotta_pressure_plate"), new UncheckedModelFile(mod_id + ":block/terracotta_pressure_plate_down"));
        buttonBlock(ECBlockRegistry.TERRACOTTA_BUTTON.get(), new UncheckedModelFile(mod_id + ":block/terracotta_button"), new UncheckedModelFile(mod_id + ":block/terracotta_button_pressed"), 180);

        registerStoneVariantWithSideSlab("polished_terracotta", ECBlockRegistry.POLISHED_TERRACOTTA.get(), ECBlockRegistry.POLISHED_TERRACOTTA_SLAB.get(), ECBlockRegistry.POLISHED_TERRACOTTA_STAIRS.get(), ECBlockRegistry.POLISHED_TERRACOTTA_WALL.get(), ECBlockRegistry.POLISHED_TERRACOTTA_PRESSURE_PLATE.get(), null);
        registerStoneVariant("terracotta_paving", ECBlockRegistry.TERRACOTTA_PAVING.get(), ECBlockRegistry.TERRACOTTA_PAVING_SLAB.get(), ECBlockRegistry.TERRACOTTA_PAVING_STAIRS.get(), ECBlockRegistry.TERRACOTTA_PAVING_WALL.get(), ECBlockRegistry.TERRACOTTA_PAVING_PRESSURE_PLATE.get(), null);
        registerStoneVariant("terracotta_tiles", ECBlockRegistry.TERRACOTTA_TILES.get(), ECBlockRegistry.TERRACOTTA_TILES_SLAB.get(), ECBlockRegistry.TERRACOTTA_TILES_STAIRS.get(), ECBlockRegistry.TERRACOTTA_TILES_WALL.get(), ECBlockRegistry.TERRACOTTA_TILES_PRESSURE_PLATE.get(), null);
        registerStoneVariant("terracotta_bricks", ECBlockRegistry.TERRACOTTA_BRICKS.get(), ECBlockRegistry.TERRACOTTA_BRICKS_SLAB.get(), ECBlockRegistry.TERRACOTTA_BRICKS_STAIRS.get(), ECBlockRegistry.TERRACOTTA_BRICKS_WALL.get(), ECBlockRegistry.TERRACOTTA_BRICKS_PRESSURE_PLATE.get(), null);
        registerStoneVariant("terracotta_large_bricks", ECBlockRegistry.TERRACOTTA_LARGE_BRICKS.get(), ECBlockRegistry.TERRACOTTA_LARGE_BRICKS_SLAB.get(), ECBlockRegistry.TERRACOTTA_LARGE_BRICKS_STAIRS.get(), ECBlockRegistry.TERRACOTTA_LARGE_BRICKS_WALL.get(), ECBlockRegistry.TERRACOTTA_LARGE_BRICKS_PRESSURE_PLATE.get(), null);
        registerStoneVariant("terracotta_paving_stones", ECBlockRegistry.TERRACOTTA_PAVING_STONES.get(), ECBlockRegistry.TERRACOTTA_PAVING_STONES_SLAB.get(), ECBlockRegistry.TERRACOTTA_PAVING_STONES_STAIRS.get(), ECBlockRegistry.TERRACOTTA_PAVING_STONES_WALL.get(), ECBlockRegistry.TERRACOTTA_PAVING_STONES_PRESSURE_PLATE.get(), null);
        registerStoneVariant("terracotta_rooftiles", ECBlockRegistry.TERRACOTTA_ROOFTILES.get(), ECBlockRegistry.TERRACOTTA_ROOFTILES_SLAB.get(), null, null, null, null);
        rooftilesStairsBlock(ECBlockRegistry.TERRACOTTA_ROOFTILES_STAIRS.get(), modLoc("block/terracotta_rooftiles"));

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
            registerStoneVariant(DyeColor.byId(j).getString() + "_corrugated_metal_plate", ECBlockRegistry.CORRUGATED_METAL_PLATE_BLOCKS.get(DyeColor.byId(j)).get(), ECBlockRegistry.CORRUGATED_METAL_PLATE_SLABS.get(DyeColor.byId(j)).get(), ECBlockRegistry.CORRUGATED_METAL_PLATE_STAIRS.get(DyeColor.byId(j)).get(), ECBlockRegistry.CORRUGATED_METAL_PLATE_WALLS.get(DyeColor.byId(j)).get(), ECBlockRegistry.CORRUGATED_METAL_PLATE_PRESSURE_PLATES.get(DyeColor.byId(j)).get(), null);
            fenceBlock(ECBlockRegistry.CORRUGATED_METAL_PLATE_FENCES.get(DyeColor.byId(j)).get(), modLoc("block/" + DyeColor.byId(j).getString() + "_corrugated_metal_plate"));
            fenceGateBlock(ECBlockRegistry.CORRUGATED_METAL_PLATE_FENCE_GATES.get(DyeColor.byId(j)).get(), modLoc("block/" + DyeColor.byId(j).getString() + "_corrugated_metal_plate"));
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
            horizontalBlock(ECBlockRegistry.CHAIR_BLOCKS.get(McWoods.byId(j)).get(), new UncheckedModelFile(mod_id + ":block/" + McWoods.byId(j).getString() + "_chair"), 0);
            horizontalBlock(ECBlockRegistry.TERRACE_CHAIR_BLOCKS.get(McWoods.byId(j)).get(), new UncheckedModelFile(mod_id + ":block/" + McWoods.byId(j).getString() + "_terrace_chair"), 0);
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
            horizontalBlock(ECBlockRegistry.PILLOW_BLOCKS.get(DyeColor.byId(j)).get(), new UncheckedModelFile(mod_id + ":block/" + DyeColor.byId(j).getString() + "_pillow"), 0);
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
            horizontalBlock(ECBlockRegistry.SUSPENDED_STAIRS_BLOCKS.get(McWoods.byId(j)).get(), new UncheckedModelFile(mod_id + ":block/" + McWoods.byId(j).getString() + "_suspended_stairs"), 0);
            horizontalBlock(ECBlockRegistry.LARGE_SUSPENDED_STAIRS_BLOCKS.get(McWoods.byId(j)).get(), new UncheckedModelFile(mod_id + ":block/" + McWoods.byId(j).getString() + "_large_suspended_stairs"), 0);
            doorBlock(ECBlockRegistry.FANCY_DOOR_BLOCKS.get(McWoods.byId(j)).get(), modLoc("block/" + McWoods.byId(j).getString() + "_fancy_door_bottom"), modLoc("block/" + McWoods.byId(j).getString() + "_fancy_door_top"));
            doorBlock(ECBlockRegistry.PLAIN_DOOR_BLOCKS.get(McWoods.byId(j)).get(), modLoc("block/" + McWoods.byId(j).getString() + "_plain_door_bottom"), modLoc("block/" + McWoods.byId(j).getString() + "_plain_door_top"));
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
        getVariantBuilder(block).forAllStatesExcept(state -> ConfiguredModel.builder().modelFile(modelFunc.apply(state)).rotationY(((int)state.get(BlockStateProperties.HORIZONTAL_FACING).getHorizontalAngle() + angleOffset) % 360).build(), BlockStateProperties.WATERLOGGED);
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
            builder.part().modelFile(new UncheckedModelFile(mod_id + ":block/" + name + "_left")).rotationY(((int)(dir.getHorizontalAngle() + offset) % 360)).uvLock(true).addModel().condition(CouchBlock.FACING, dir).condition(CouchBlock.LEFT_END, true).end();
            builder.part().modelFile(new UncheckedModelFile(mod_id + ":block/" + name + "_right")).rotationY(((int)(dir.getHorizontalAngle() + offset) % 360)).uvLock(true).addModel().condition(CouchBlock.FACING, dir).condition(CouchBlock.RIGHT_END, true).end();

            builder.part().modelFile(new UncheckedModelFile(mod_id + ":block/" + name)).rotationY(((int)(dir.getHorizontalAngle() + offset) % 360)).uvLock(true).addModel().condition(CouchBlock.FACING, dir).condition(CouchBlock.SHAPE, StairsShape.STRAIGHT).end();

            builder.part().modelFile(new UncheckedModelFile(mod_id + ":block/outer_" + name)).rotationY(((int)(dir.getHorizontalAngle() + 270 + offset) % 360)).uvLock(true).addModel().condition(CouchBlock.FACING, dir).condition(CouchBlock.SHAPE, StairsShape.OUTER_LEFT).end();
            builder.part().modelFile(new UncheckedModelFile(mod_id + ":block/inner_" + name)).rotationY(((int)(dir.getHorizontalAngle() + offset) % 360)).uvLock(true).addModel().condition(CouchBlock.FACING, dir).condition(CouchBlock.SHAPE, StairsShape.INNER_LEFT).end();

            builder.part().modelFile(new UncheckedModelFile(mod_id + ":block/outer_" + name)).rotationY(((int)(dir.getHorizontalAngle() + offset) % 360)).uvLock(true).addModel().condition(CouchBlock.FACING, dir).condition(CouchBlock.SHAPE, StairsShape.OUTER_RIGHT).end();
            builder.part().modelFile(new UncheckedModelFile(mod_id + ":block/inner_" + name)).rotationY(((int)(dir.getHorizontalAngle() + 90 + offset) % 360)).uvLock(true).addModel().condition(CouchBlock.FACING, dir).condition(CouchBlock.SHAPE, StairsShape.INNER_RIGHT).end();
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

                builder.partialState().with(BedBlock.PART, type).with(ChestBlock.FACING, dir).modelForState().modelFile(new UncheckedModelFile(model)).rotationY((int)((dir.getHorizontalAngle() + offset) % 360)).addModel();
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
            for(ChestType type : ChestType.VALUES)
            {
                model = type == ChestType.SINGLE ? mod_id + ":block/" + name : type == ChestType.LEFT ? mod_id + ":block/" + name + "_left" : mod_id + ":block/" + name + "_right";

                builder.partialState().with(ChestBlock.TYPE, type).with(ChestBlock.FACING, dir).modelForState().modelFile(new UncheckedModelFile(model)).rotationY((int)((dir.getHorizontalAngle() + offset) % 360)).addModel();
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

                builder.partialState().with(VerticalChestBlock.TYPE, type).with(ChestBlock.FACING, dir).modelForState().modelFile(new UncheckedModelFile(model)).rotationY((int)((dir.getHorizontalAngle() + offset) % 360)).addModel();
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