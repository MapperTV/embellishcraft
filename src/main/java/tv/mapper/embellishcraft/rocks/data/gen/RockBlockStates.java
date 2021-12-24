package tv.mapper.embellishcraft.rocks.data.gen;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ModelFile.UncheckedModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import tv.mapper.embellishcraft.ECConstants;
import tv.mapper.embellishcraft.block.ECBlockRegistry;
import tv.mapper.embellishcraft.data.gen.ECBlockStates;
import tv.mapper.embellishcraft.rocks.world.level.blocks.InitRockBlocks;
import tv.mapper.embellishcraft.util.RockType;

public class RockBlockStates extends ECBlockStates
{
    public RockBlockStates(DataGenerator gen, String modid, ExistingFileHelper exFileHelper)
    {
        super(gen, modid, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels()
    {
        // Rocks
        for(int j = 0; j < RockType.values().length; j++)
        {
            registerStoneVariant(RockType.byId(j).getSerializedName(), InitRockBlocks.ROCK_BLOCKS.get(RockType.byId(j)).get(), InitRockBlocks.ROCK_SLABS.get(RockType.byId(j)).get(), InitRockBlocks.ROCK_STAIRS.get(RockType.byId(j)).get(), InitRockBlocks.ROCK_WALLS.get(RockType.byId(j)).get(), InitRockBlocks.ROCK_PRESSURE_PLATES.get(RockType.byId(j)).get(), InitRockBlocks.ROCK_BUTTONS.get(RockType.byId(j)).get());

            registerStoneVariant(RockType.byId(j).getSerializedName() + "_cobblestone", InitRockBlocks.ROCK_COBBLESTONES.get(RockType.byId(j)).get(), InitRockBlocks.ROCK_COBBLESTONE_SLABS.get(RockType.byId(j)).get(), InitRockBlocks.ROCK_COBBLESTONE_STAIRS.get(RockType.byId(j)).get(), InitRockBlocks.ROCK_COBBLESTONE_WALLS.get(RockType.byId(j)).get(), InitRockBlocks.ROCK_COBBLESTONE_PRESSURE_PLATES.get(RockType.byId(j)).get(), null);

            registerStoneVariant(RockType.byId(j).getSerializedName() + "_cobblestone_bricks", InitRockBlocks.ROCK_COBBLESTONE_BRICKS.get(RockType.byId(j)).get(), InitRockBlocks.ROCK_COBBLESTONE_BRICKS_SLABS.get(RockType.byId(j)).get(), InitRockBlocks.ROCK_COBBLESTONE_BRICKS_STAIRS.get(RockType.byId(j)).get(), InitRockBlocks.ROCK_COBBLESTONE_BRICKS_WALLS.get(RockType.byId(j)).get(), InitRockBlocks.ROCK_COBBLESTONE_BRICKS_PRESSURE_PLATES.get(RockType.byId(j)).get(), null);

            registerStoneVariant("smooth_" + RockType.byId(j).getSerializedName(), InitRockBlocks.SMOOTH_ROCK_BLOCKS.get(RockType.byId(j)).get(), InitRockBlocks.SMOOTH_ROCK_SLABS.get(RockType.byId(j)).get(), InitRockBlocks.SMOOTH_ROCK_STAIRS.get(RockType.byId(j)).get(), InitRockBlocks.SMOOTH_ROCK_WALLS.get(RockType.byId(j)).get(), InitRockBlocks.SMOOTH_ROCK_PRESSURE_PLATES.get(RockType.byId(j)).get(), null);

            registerStoneVariantWithSideSlab("polished_" + RockType.byId(j).getSerializedName(), InitRockBlocks.POLISHED_ROCK_BLOCKS.get(RockType.byId(j)).get(), InitRockBlocks.POLISHED_ROCK_SLABS.get(RockType.byId(j)).get(), InitRockBlocks.POLISHED_ROCK_STAIRS.get(RockType.byId(j)).get(), InitRockBlocks.POLISHED_ROCK_WALLS.get(RockType.byId(j)).get(), InitRockBlocks.POLISHED_ROCK_PRESSURE_PLATES.get(RockType.byId(j)).get(), null);

            registerStoneVariant(RockType.byId(j).getSerializedName() + "_paving", InitRockBlocks.ROCK_PAVINGS.get(RockType.byId(j)).get(), InitRockBlocks.ROCK_PAVING_SLABS.get(RockType.byId(j)).get(), InitRockBlocks.ROCK_PAVING_STAIRS.get(RockType.byId(j)).get(), InitRockBlocks.ROCK_PAVING_WALLS.get(RockType.byId(j)).get(), InitRockBlocks.ROCK_PAVING_PRESSURE_PLATES.get(RockType.byId(j)).get(), null);

            registerStoneVariant(RockType.byId(j).getSerializedName() + "_tiles", InitRockBlocks.ROCK_TILES.get(RockType.byId(j)).get(), InitRockBlocks.ROCK_TILES_SLABS.get(RockType.byId(j)).get(), InitRockBlocks.ROCK_TILES_STAIRS.get(RockType.byId(j)).get(), InitRockBlocks.ROCK_TILES_WALLS.get(RockType.byId(j)).get(), InitRockBlocks.ROCK_TILES_PRESSURE_PLATES.get(RockType.byId(j)).get(), null);

            registerStoneVariant(RockType.byId(j).getSerializedName() + "_bricks", InitRockBlocks.ROCK_BRICKS.get(RockType.byId(j)).get(), InitRockBlocks.ROCK_BRICKS_SLABS.get(RockType.byId(j)).get(), InitRockBlocks.ROCK_BRICKS_STAIRS.get(RockType.byId(j)).get(), InitRockBlocks.ROCK_BRICKS_WALLS.get(RockType.byId(j)).get(), InitRockBlocks.ROCK_BRICKS_PRESSURE_PLATES.get(RockType.byId(j)).get(), null);

            registerStoneVariant(RockType.byId(j).getSerializedName() + "_large_bricks", InitRockBlocks.ROCK_LARGE_BRICKS.get(RockType.byId(j)).get(), InitRockBlocks.ROCK_LARGE_BRICKS_SLABS.get(RockType.byId(j)).get(), InitRockBlocks.ROCK_LARGE_BRICKS_STAIRS.get(RockType.byId(j)).get(), InitRockBlocks.ROCK_LARGE_BRICKS_WALLS.get(RockType.byId(j)).get(), InitRockBlocks.ROCK_LARGE_BRICKS_PRESSURE_PLATES.get(RockType.byId(j)).get(), null);

            registerStoneVariant(RockType.byId(j).getSerializedName() + "_paving_stones", InitRockBlocks.ROCK_PAVING_STONES.get(RockType.byId(j)).get(), InitRockBlocks.ROCK_PAVING_STONES_SLABS.get(RockType.byId(j)).get(), InitRockBlocks.ROCK_PAVING_STONES_STAIRS.get(RockType.byId(j)).get(), InitRockBlocks.ROCK_PAVING_STONES_WALLS.get(RockType.byId(j)).get(), InitRockBlocks.ROCK_PAVING_STONES_PRESSURE_PLATES.get(RockType.byId(j)).get(), null);

            registerStoneVariant(RockType.byId(j).getSerializedName() + "_ornament", InitRockBlocks.ROCK_ORNAMENTS.get(RockType.byId(j)).get(), null, null, null, InitRockBlocks.ROCK_ORNAMENT_PRESSURE_PLATES.get(RockType.byId(j)).get(), null);

            registerStoneVariant(RockType.byId(j).getSerializedName() + "_rooftiles", InitRockBlocks.ROCK_ROOFTILES.get(RockType.byId(j)).get(), InitRockBlocks.ROCK_ROOFTILES_SLABS.get(RockType.byId(j)).get(), null, null, null, null);
            rooftilesStairsBlock(InitRockBlocks.ROCK_ROOFTILES_STAIRS.get(RockType.byId(j)).get(), modLoc("block/" + RockType.byId(j).getSerializedName() + "_rooftiles"));

        }

        registerStoneVariant("paving_stones", InitRockBlocks.PAVING_STONES.get(), InitRockBlocks.PAVING_STONES_SLAB.get(), InitRockBlocks.PAVING_STONES_STAIRS.get(), InitRockBlocks.PAVING_STONES_WALL.get(), InitRockBlocks.PAVING_STONES_PRESSURE_PLATE.get(), null);

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

    }
}