package tv.mapper.embellishcraft.rocks.data.gen;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ModelFile.UncheckedModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import tv.mapper.embellishcraft.ECConstants;
import tv.mapper.embellishcraft.data.gen.ECBlockStates;
import tv.mapper.embellishcraft.rocks.world.level.block.InitRockBlocks;
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
            registerBlockstateVariants(RockType.byId(j).getSerializedName(), InitRockBlocks.ROCK_BLOCKS.get(RockType.byId(j)).get(), InitRockBlocks.ROCK_SLABS.get(RockType.byId(j)).get(), InitRockBlocks.ROCK_STAIRS.get(RockType.byId(j)).get(), InitRockBlocks.ROCK_WALLS.get(RockType.byId(j)).get(), InitRockBlocks.ROCK_PRESSURE_PLATES.get(RockType.byId(j)).get(), InitRockBlocks.ROCK_BUTTONS.get(RockType.byId(j)).get());

            registerBlockstateVariants(RockType.byId(j).getSerializedName() + "_cobblestone", InitRockBlocks.ROCK_COBBLESTONES.get(RockType.byId(j)).get(), InitRockBlocks.ROCK_COBBLESTONE_SLABS.get(RockType.byId(j)).get(), InitRockBlocks.ROCK_COBBLESTONE_STAIRS.get(RockType.byId(j)).get(), InitRockBlocks.ROCK_COBBLESTONE_WALLS.get(RockType.byId(j)).get(), InitRockBlocks.ROCK_COBBLESTONE_PRESSURE_PLATES.get(RockType.byId(j)).get(), null);

            registerBlockstateVariants(RockType.byId(j).getSerializedName() + "_cobblestone_bricks", InitRockBlocks.ROCK_COBBLESTONE_BRICKS.get(RockType.byId(j)).get(), InitRockBlocks.ROCK_COBBLESTONE_BRICKS_SLABS.get(RockType.byId(j)).get(), InitRockBlocks.ROCK_COBBLESTONE_BRICKS_STAIRS.get(RockType.byId(j)).get(), InitRockBlocks.ROCK_COBBLESTONE_BRICKS_WALLS.get(RockType.byId(j)).get(), InitRockBlocks.ROCK_COBBLESTONE_BRICKS_PRESSURE_PLATES.get(RockType.byId(j)).get(), null);

            registerBlockstateVariants("smooth_" + RockType.byId(j).getSerializedName(), InitRockBlocks.SMOOTH_ROCK_BLOCKS.get(RockType.byId(j)).get(), InitRockBlocks.SMOOTH_ROCK_SLABS.get(RockType.byId(j)).get(), InitRockBlocks.SMOOTH_ROCK_STAIRS.get(RockType.byId(j)).get(), InitRockBlocks.SMOOTH_ROCK_WALLS.get(RockType.byId(j)).get(), InitRockBlocks.SMOOTH_ROCK_PRESSURE_PLATES.get(RockType.byId(j)).get(), null);

            registerBlockstateVariantsWithSideSlab("polished_" + RockType.byId(j).getSerializedName(), InitRockBlocks.POLISHED_ROCK_BLOCKS.get(RockType.byId(j)).get(), InitRockBlocks.POLISHED_ROCK_SLABS.get(RockType.byId(j)).get(), InitRockBlocks.POLISHED_ROCK_STAIRS.get(RockType.byId(j)).get(), InitRockBlocks.POLISHED_ROCK_WALLS.get(RockType.byId(j)).get(), InitRockBlocks.POLISHED_ROCK_PRESSURE_PLATES.get(RockType.byId(j)).get(), null);

            registerBlockstateVariants(RockType.byId(j).getSerializedName() + "_paving", InitRockBlocks.ROCK_PAVINGS.get(RockType.byId(j)).get(), InitRockBlocks.ROCK_PAVING_SLABS.get(RockType.byId(j)).get(), InitRockBlocks.ROCK_PAVING_STAIRS.get(RockType.byId(j)).get(), InitRockBlocks.ROCK_PAVING_WALLS.get(RockType.byId(j)).get(), InitRockBlocks.ROCK_PAVING_PRESSURE_PLATES.get(RockType.byId(j)).get(), null);

            registerBlockstateVariants(RockType.byId(j).getSerializedName() + "_tiles", InitRockBlocks.ROCK_TILES.get(RockType.byId(j)).get(), InitRockBlocks.ROCK_TILES_SLABS.get(RockType.byId(j)).get(), InitRockBlocks.ROCK_TILES_STAIRS.get(RockType.byId(j)).get(), InitRockBlocks.ROCK_TILES_WALLS.get(RockType.byId(j)).get(), InitRockBlocks.ROCK_TILES_PRESSURE_PLATES.get(RockType.byId(j)).get(), null);

            registerBlockstateVariants(RockType.byId(j).getSerializedName() + "_bricks", InitRockBlocks.ROCK_BRICKS.get(RockType.byId(j)).get(), InitRockBlocks.ROCK_BRICKS_SLABS.get(RockType.byId(j)).get(), InitRockBlocks.ROCK_BRICKS_STAIRS.get(RockType.byId(j)).get(), InitRockBlocks.ROCK_BRICKS_WALLS.get(RockType.byId(j)).get(), InitRockBlocks.ROCK_BRICKS_PRESSURE_PLATES.get(RockType.byId(j)).get(), null);

            registerBlockstateVariants(RockType.byId(j).getSerializedName() + "_large_bricks", InitRockBlocks.ROCK_LARGE_BRICKS.get(RockType.byId(j)).get(), InitRockBlocks.ROCK_LARGE_BRICKS_SLABS.get(RockType.byId(j)).get(), InitRockBlocks.ROCK_LARGE_BRICKS_STAIRS.get(RockType.byId(j)).get(), InitRockBlocks.ROCK_LARGE_BRICKS_WALLS.get(RockType.byId(j)).get(), InitRockBlocks.ROCK_LARGE_BRICKS_PRESSURE_PLATES.get(RockType.byId(j)).get(), null);

            registerBlockstateVariants(RockType.byId(j).getSerializedName() + "_paving_stones", InitRockBlocks.ROCK_PAVING_STONES.get(RockType.byId(j)).get(), InitRockBlocks.ROCK_PAVING_STONES_SLABS.get(RockType.byId(j)).get(), InitRockBlocks.ROCK_PAVING_STONES_STAIRS.get(RockType.byId(j)).get(), InitRockBlocks.ROCK_PAVING_STONES_WALLS.get(RockType.byId(j)).get(), InitRockBlocks.ROCK_PAVING_STONES_PRESSURE_PLATES.get(RockType.byId(j)).get(), null);

            registerBlockstateVariants(RockType.byId(j).getSerializedName() + "_ornament", InitRockBlocks.ROCK_ORNAMENTS.get(RockType.byId(j)).get(), null, null, null, InitRockBlocks.ROCK_ORNAMENT_PRESSURE_PLATES.get(RockType.byId(j)).get(), null);

            registerBlockstateVariants(RockType.byId(j).getSerializedName() + "_rooftiles", InitRockBlocks.ROCK_ROOFTILES.get(RockType.byId(j)).get(), InitRockBlocks.ROCK_ROOFTILES_SLABS.get(RockType.byId(j)).get(), null, null, null, null);
            rooftilesStairsBlock(InitRockBlocks.ROCK_ROOFTILES_STAIRS.get(RockType.byId(j)).get(), modLoc("block/" + RockType.byId(j).getSerializedName() + "_rooftiles"));

        }

        registerBlockstateVariants("paving_stones", InitRockBlocks.PAVING_STONES.get(), InitRockBlocks.PAVING_STONES_SLAB.get(), InitRockBlocks.PAVING_STONES_STAIRS.get(), InitRockBlocks.PAVING_STONES_WALL.get(), InitRockBlocks.PAVING_STONES_PRESSURE_PLATE.get(), null);

        // Andesite
        registerBlockstateVariants("andesite", null, null, null, null, null, InitRockBlocks.ANDESITE_BUTTON.get());
        registerBlockstateVariants("smooth_andesite", InitRockBlocks.SMOOTH_ANDESITE.get(), InitRockBlocks.SMOOTH_ANDESITE_SLAB.get(), InitRockBlocks.SMOOTH_ANDESITE_STAIRS.get(), InitRockBlocks.SMOOTH_ANDESITE_WALL.get(), InitRockBlocks.SMOOTH_ANDESITE_PRESSURE_PLATE.get(), null);
        registerBlockstateVariants("andesite_paving", InitRockBlocks.ANDESITE_PAVING.get(), InitRockBlocks.ANDESITE_PAVING_SLAB.get(), InitRockBlocks.ANDESITE_PAVING_STAIRS.get(), InitRockBlocks.ANDESITE_PAVING_WALL.get(), InitRockBlocks.ANDESITE_PAVING_PRESSURE_PLATE.get(), null);
        registerBlockstateVariants("andesite_tiles", InitRockBlocks.ANDESITE_TILES.get(), InitRockBlocks.ANDESITE_TILES_SLAB.get(), InitRockBlocks.ANDESITE_TILES_STAIRS.get(), InitRockBlocks.ANDESITE_TILES_WALL.get(), InitRockBlocks.ANDESITE_TILES_PRESSURE_PLATE.get(), null);
        registerBlockstateVariants("andesite_bricks", InitRockBlocks.ANDESITE_BRICKS.get(), InitRockBlocks.ANDESITE_BRICKS_SLAB.get(), InitRockBlocks.ANDESITE_BRICKS_STAIRS.get(), InitRockBlocks.ANDESITE_BRICKS_WALL.get(), InitRockBlocks.ANDESITE_BRICKS_PRESSURE_PLATE.get(), null);
        registerBlockstateVariants("andesite_large_bricks", InitRockBlocks.ANDESITE_LARGE_BRICKS.get(), InitRockBlocks.ANDESITE_LARGE_BRICKS_SLAB.get(), InitRockBlocks.ANDESITE_LARGE_BRICKS_STAIRS.get(), InitRockBlocks.ANDESITE_LARGE_BRICKS_WALL.get(), InitRockBlocks.ANDESITE_LARGE_BRICKS_PRESSURE_PLATE.get(), null);
        registerBlockstateVariants("andesite_paving_stones", InitRockBlocks.ANDESITE_PAVING_STONES.get(), InitRockBlocks.ANDESITE_PAVING_STONES_SLAB.get(), InitRockBlocks.ANDESITE_PAVING_STONES_STAIRS.get(), InitRockBlocks.ANDESITE_PAVING_STONES_WALL.get(), InitRockBlocks.ANDESITE_PAVING_STONES_PRESSURE_PLATE.get(), null);
        registerBlockstateVariants("andesite_ornament", InitRockBlocks.ANDESITE_ORNAMENT.get(), null, null, null, InitRockBlocks.ANDESITE_ORNAMENT_PRESSURE_PLATE.get(), null);
        registerBlockstateVariants("andesite_rooftiles", InitRockBlocks.ANDESITE_ROOFTILES.get(), InitRockBlocks.ANDESITE_ROOFTILES_SLAB.get(), null, null, null, null);
        rooftilesStairsBlock(InitRockBlocks.ANDESITE_ROOFTILES_STAIRS.get(), modLoc("block/andesite_rooftiles"));

        // Diorite
        registerBlockstateVariants("diorite", null, null, null, null, null, InitRockBlocks.DIORITE_BUTTON.get());
        registerBlockstateVariants("smooth_diorite", InitRockBlocks.SMOOTH_DIORITE.get(), InitRockBlocks.SMOOTH_DIORITE_SLAB.get(), InitRockBlocks.SMOOTH_DIORITE_STAIRS.get(), InitRockBlocks.SMOOTH_DIORITE_WALL.get(), InitRockBlocks.SMOOTH_DIORITE_PRESSURE_PLATE.get(), null);
        registerBlockstateVariants("diorite_paving", InitRockBlocks.DIORITE_PAVING.get(), InitRockBlocks.DIORITE_PAVING_SLAB.get(), InitRockBlocks.DIORITE_PAVING_STAIRS.get(), InitRockBlocks.DIORITE_PAVING_WALL.get(), InitRockBlocks.DIORITE_PAVING_PRESSURE_PLATE.get(), null);
        registerBlockstateVariants("diorite_tiles", InitRockBlocks.DIORITE_TILES.get(), InitRockBlocks.DIORITE_TILES_SLAB.get(), InitRockBlocks.DIORITE_TILES_STAIRS.get(), InitRockBlocks.DIORITE_TILES_WALL.get(), InitRockBlocks.DIORITE_TILES_PRESSURE_PLATE.get(), null);
        registerBlockstateVariants("diorite_bricks", InitRockBlocks.DIORITE_BRICKS.get(), InitRockBlocks.DIORITE_BRICKS_SLAB.get(), InitRockBlocks.DIORITE_BRICKS_STAIRS.get(), InitRockBlocks.DIORITE_BRICKS_WALL.get(), InitRockBlocks.DIORITE_BRICKS_PRESSURE_PLATE.get(), null);
        registerBlockstateVariants("diorite_large_bricks", InitRockBlocks.DIORITE_LARGE_BRICKS.get(), InitRockBlocks.DIORITE_LARGE_BRICKS_SLAB.get(), InitRockBlocks.DIORITE_LARGE_BRICKS_STAIRS.get(), InitRockBlocks.DIORITE_LARGE_BRICKS_WALL.get(), InitRockBlocks.DIORITE_LARGE_BRICKS_PRESSURE_PLATE.get(), null);
        registerBlockstateVariants("diorite_paving_stones", InitRockBlocks.DIORITE_PAVING_STONES.get(), InitRockBlocks.DIORITE_PAVING_STONES_SLAB.get(), InitRockBlocks.DIORITE_PAVING_STONES_STAIRS.get(), InitRockBlocks.DIORITE_PAVING_STONES_WALL.get(), InitRockBlocks.DIORITE_PAVING_STONES_PRESSURE_PLATE.get(), null);
        registerBlockstateVariants("diorite_ornament", InitRockBlocks.DIORITE_ORNAMENT.get(), null, null, null, InitRockBlocks.DIORITE_ORNAMENT_PRESSURE_PLATE.get(), null);
        registerBlockstateVariants("diorite_rooftiles", InitRockBlocks.DIORITE_ROOFTILES.get(), InitRockBlocks.DIORITE_ROOFTILES_SLAB.get(), null, null, null, null);
        rooftilesStairsBlock(InitRockBlocks.DIORITE_ROOFTILES_STAIRS.get(), modLoc("block/diorite_rooftiles"));

        // Granite
        registerBlockstateVariants("granite", null, null, null, null, null, InitRockBlocks.GRANITE_BUTTON.get());
        registerBlockstateVariants("smooth_granite", InitRockBlocks.SMOOTH_GRANITE.get(), InitRockBlocks.SMOOTH_GRANITE_SLAB.get(), InitRockBlocks.SMOOTH_GRANITE_STAIRS.get(), InitRockBlocks.SMOOTH_GRANITE_WALL.get(), InitRockBlocks.SMOOTH_GRANITE_PRESSURE_PLATE.get(), null);
        registerBlockstateVariants("granite_paving", InitRockBlocks.GRANITE_PAVING.get(), InitRockBlocks.GRANITE_PAVING_SLAB.get(), InitRockBlocks.GRANITE_PAVING_STAIRS.get(), InitRockBlocks.GRANITE_PAVING_WALL.get(), InitRockBlocks.GRANITE_PAVING_PRESSURE_PLATE.get(), null);
        registerBlockstateVariants("granite_tiles", InitRockBlocks.GRANITE_TILES.get(), InitRockBlocks.GRANITE_TILES_SLAB.get(), InitRockBlocks.GRANITE_TILES_STAIRS.get(), InitRockBlocks.GRANITE_TILES_WALL.get(), InitRockBlocks.GRANITE_TILES_PRESSURE_PLATE.get(), null);
        registerBlockstateVariants("granite_bricks", InitRockBlocks.GRANITE_BRICKS.get(), InitRockBlocks.GRANITE_BRICKS_SLAB.get(), InitRockBlocks.GRANITE_BRICKS_STAIRS.get(), InitRockBlocks.GRANITE_BRICKS_WALL.get(), InitRockBlocks.GRANITE_BRICKS_PRESSURE_PLATE.get(), null);
        registerBlockstateVariants("granite_large_bricks", InitRockBlocks.GRANITE_LARGE_BRICKS.get(), InitRockBlocks.GRANITE_LARGE_BRICKS_SLAB.get(), InitRockBlocks.GRANITE_LARGE_BRICKS_STAIRS.get(), InitRockBlocks.GRANITE_LARGE_BRICKS_WALL.get(), InitRockBlocks.GRANITE_LARGE_BRICKS_PRESSURE_PLATE.get(), null);
        registerBlockstateVariants("granite_paving_stones", InitRockBlocks.GRANITE_PAVING_STONES.get(), InitRockBlocks.GRANITE_PAVING_STONES_SLAB.get(), InitRockBlocks.GRANITE_PAVING_STONES_STAIRS.get(), InitRockBlocks.GRANITE_PAVING_STONES_WALL.get(), InitRockBlocks.GRANITE_PAVING_STONES_PRESSURE_PLATE.get(), null);
        registerBlockstateVariants("granite_ornament", InitRockBlocks.GRANITE_ORNAMENT.get(), null, null, null, InitRockBlocks.GRANITE_ORNAMENT_PRESSURE_PLATE.get(), null);
        registerBlockstateVariants("granite_rooftiles", InitRockBlocks.GRANITE_ROOFTILES.get(), InitRockBlocks.GRANITE_ROOFTILES_SLAB.get(), null, null, null, null);
        rooftilesStairsBlock(InitRockBlocks.GRANITE_ROOFTILES_STAIRS.get(), modLoc("block/granite_rooftiles"));

        // Sandstone
        buttonBlock(InitRockBlocks.SANDSTONE_BUTTON.get(), new UncheckedModelFile(mod_id + ":block/sandstone_button"), new UncheckedModelFile(mod_id + ":block/sandstone_button_pressed"), 180);

        // wallBlock(InitRockBlocks.SMOOTH_SANDSTONE_WALL.get(), mcLoc("block/sandstone_top"));
        newWallBlock(InitRockBlocks.SMOOTH_SANDSTONE_WALL.get(), new UncheckedModelFile(ECConstants.MODID + ":block/smooth_sandstone_wall_post"), new UncheckedModelFile(ECConstants.MODID + ":block/smooth_sandstone_wall_side"), new UncheckedModelFile(ECConstants.MODID + ":block/smooth_sandstone_wall_side_tall"));
        pressurePlateBlock(InitRockBlocks.SMOOTH_SANDSTONE_PRESSURE_PLATE.get(), new UncheckedModelFile(mod_id + ":block/smooth_sandstone_pressure_plate"), new UncheckedModelFile(mod_id + ":block/smooth_sandstone_pressure_plate_down"));

        registerBlockstateVariantsWithSideSlab("polished_sandstone", InitRockBlocks.POLISHED_SANDSTONE.get(), InitRockBlocks.POLISHED_SANDSTONE_SLAB.get(), InitRockBlocks.POLISHED_SANDSTONE_STAIRS.get(), InitRockBlocks.POLISHED_SANDSTONE_WALL.get(), InitRockBlocks.POLISHED_SANDSTONE_PRESSURE_PLATE.get(), null);
        registerBlockstateVariants("sandstone_paving", InitRockBlocks.SANDSTONE_PAVING.get(), InitRockBlocks.SANDSTONE_PAVING_SLAB.get(), InitRockBlocks.SANDSTONE_PAVING_STAIRS.get(), InitRockBlocks.SANDSTONE_PAVING_WALL.get(), InitRockBlocks.SANDSTONE_PAVING_PRESSURE_PLATE.get(), null);
        registerBlockstateVariants("sandstone_tiles", InitRockBlocks.SANDSTONE_TILES.get(), InitRockBlocks.SANDSTONE_TILES_SLAB.get(), InitRockBlocks.SANDSTONE_TILES_STAIRS.get(), InitRockBlocks.SANDSTONE_TILES_WALL.get(), InitRockBlocks.SANDSTONE_TILES_PRESSURE_PLATE.get(), null);
        registerBlockstateVariants("sandstone_bricks", InitRockBlocks.SANDSTONE_BRICKS.get(), InitRockBlocks.SANDSTONE_BRICKS_SLAB.get(), InitRockBlocks.SANDSTONE_BRICKS_STAIRS.get(), InitRockBlocks.SANDSTONE_BRICKS_WALL.get(), InitRockBlocks.SANDSTONE_BRICKS_PRESSURE_PLATE.get(), null);
        registerBlockstateVariants("sandstone_large_bricks", InitRockBlocks.SANDSTONE_LARGE_BRICKS.get(), InitRockBlocks.SANDSTONE_LARGE_BRICKS_SLAB.get(), InitRockBlocks.SANDSTONE_LARGE_BRICKS_STAIRS.get(), InitRockBlocks.SANDSTONE_LARGE_BRICKS_WALL.get(), InitRockBlocks.SANDSTONE_LARGE_BRICKS_PRESSURE_PLATE.get(), null);
        registerBlockstateVariants("sandstone_paving_stones", InitRockBlocks.SANDSTONE_PAVING_STONES.get(), InitRockBlocks.SANDSTONE_PAVING_STONES_SLAB.get(), InitRockBlocks.SANDSTONE_PAVING_STONES_STAIRS.get(), InitRockBlocks.SANDSTONE_PAVING_STONES_WALL.get(), InitRockBlocks.SANDSTONE_PAVING_STONES_PRESSURE_PLATE.get(), null);
        registerBlockstateVariants("sandstone_rooftiles", InitRockBlocks.SANDSTONE_ROOFTILES.get(), InitRockBlocks.SANDSTONE_ROOFTILES_SLAB.get(), null, null, null, null);
        rooftilesStairsBlock(InitRockBlocks.SANDSTONE_ROOFTILES_STAIRS.get(), modLoc("block/sandstone_rooftiles"));

        // Red Sandstone
        buttonBlock(InitRockBlocks.RED_SANDSTONE_BUTTON.get(), new UncheckedModelFile(mod_id + ":block/red_sandstone_button"), new UncheckedModelFile(mod_id + ":block/red_sandstone_button_pressed"), 180);

        // wallBlock(InitRockBlocks.SMOOTH_RED_SANDSTONE_WALL.get(), mcLoc("block/red_sandstone_top"));
        newWallBlock(InitRockBlocks.SMOOTH_RED_SANDSTONE_WALL.get(), new UncheckedModelFile(ECConstants.MODID + ":block/smooth_red_sandstone_wall_post"), new UncheckedModelFile(ECConstants.MODID + ":block/smooth_red_sandstone_wall_side"), new UncheckedModelFile(ECConstants.MODID + ":block/smooth_red_sandstone_wall_side_tall"));
        pressurePlateBlock(InitRockBlocks.SMOOTH_RED_SANDSTONE_PRESSURE_PLATE.get(), new UncheckedModelFile(mod_id + ":block/smooth_red_sandstone_pressure_plate"), new UncheckedModelFile(mod_id + ":block/smooth_red_sandstone_pressure_plate_down"));

        registerBlockstateVariantsWithSideSlab("polished_red_sandstone", InitRockBlocks.POLISHED_RED_SANDSTONE.get(), InitRockBlocks.POLISHED_RED_SANDSTONE_SLAB.get(), InitRockBlocks.POLISHED_RED_SANDSTONE_STAIRS.get(), InitRockBlocks.POLISHED_RED_SANDSTONE_WALL.get(), InitRockBlocks.POLISHED_RED_SANDSTONE_PRESSURE_PLATE.get(), null);
        registerBlockstateVariants("red_sandstone_paving", InitRockBlocks.RED_SANDSTONE_PAVING.get(), InitRockBlocks.RED_SANDSTONE_PAVING_SLAB.get(), InitRockBlocks.RED_SANDSTONE_PAVING_STAIRS.get(), InitRockBlocks.RED_SANDSTONE_PAVING_WALL.get(), InitRockBlocks.RED_SANDSTONE_PAVING_PRESSURE_PLATE.get(), null);
        registerBlockstateVariants("red_sandstone_tiles", InitRockBlocks.RED_SANDSTONE_TILES.get(), InitRockBlocks.RED_SANDSTONE_TILES_SLAB.get(), InitRockBlocks.RED_SANDSTONE_TILES_STAIRS.get(), InitRockBlocks.RED_SANDSTONE_TILES_WALL.get(), InitRockBlocks.RED_SANDSTONE_TILES_PRESSURE_PLATE.get(), null);
        registerBlockstateVariants("red_sandstone_bricks", InitRockBlocks.RED_SANDSTONE_BRICKS.get(), InitRockBlocks.RED_SANDSTONE_BRICKS_SLAB.get(), InitRockBlocks.RED_SANDSTONE_BRICKS_STAIRS.get(), InitRockBlocks.RED_SANDSTONE_BRICKS_WALL.get(), InitRockBlocks.RED_SANDSTONE_BRICKS_PRESSURE_PLATE.get(), null);
        registerBlockstateVariants("red_sandstone_large_bricks", InitRockBlocks.RED_SANDSTONE_LARGE_BRICKS.get(), InitRockBlocks.RED_SANDSTONE_LARGE_BRICKS_SLAB.get(), InitRockBlocks.RED_SANDSTONE_LARGE_BRICKS_STAIRS.get(), InitRockBlocks.RED_SANDSTONE_LARGE_BRICKS_WALL.get(), InitRockBlocks.RED_SANDSTONE_LARGE_BRICKS_PRESSURE_PLATE.get(), null);
        registerBlockstateVariants("red_sandstone_paving_stones", InitRockBlocks.RED_SANDSTONE_PAVING_STONES.get(), InitRockBlocks.RED_SANDSTONE_PAVING_STONES_SLAB.get(), InitRockBlocks.RED_SANDSTONE_PAVING_STONES_STAIRS.get(), InitRockBlocks.RED_SANDSTONE_PAVING_STONES_WALL.get(), InitRockBlocks.RED_SANDSTONE_PAVING_STONES_PRESSURE_PLATE.get(), null);
        registerBlockstateVariants("red_sandstone_rooftiles", InitRockBlocks.RED_SANDSTONE_ROOFTILES.get(), InitRockBlocks.RED_SANDSTONE_ROOFTILES_SLAB.get(), null, null, null, null);
        rooftilesStairsBlock(InitRockBlocks.RED_SANDSTONE_ROOFTILES_STAIRS.get(), modLoc("block/red_sandstone_rooftiles"));

        // Terracotta
        slabBlock(InitRockBlocks.TERRACOTTA_SLAB.get(), mcLoc("block/terracotta"), mcLoc("block/terracotta"));
        stairsBlock(InitRockBlocks.TERRACOTTA_STAIRS.get(), mcLoc("block/terracotta"));
        // wallBlock(InitRockBlocks.TERRACOTTA_WALL.get(), mcLoc("block/terracotta"));
        newWallBlock(InitRockBlocks.TERRACOTTA_WALL.get(), new UncheckedModelFile(ECConstants.MODID + ":block/terracotta_wall_post"), new UncheckedModelFile(ECConstants.MODID + ":block/terracotta_wall_side"), new UncheckedModelFile(ECConstants.MODID + ":block/terracotta_wall_side_tall"));
        pressurePlateBlock(InitRockBlocks.TERRACOTTA_PRESSURE_PLATE.get(), new UncheckedModelFile(mod_id + ":block/terracotta_pressure_plate"), new UncheckedModelFile(mod_id + ":block/terracotta_pressure_plate_down"));
        buttonBlock(InitRockBlocks.TERRACOTTA_BUTTON.get(), new UncheckedModelFile(mod_id + ":block/terracotta_button"), new UncheckedModelFile(mod_id + ":block/terracotta_button_pressed"), 180);

        registerBlockstateVariantsWithSideSlab("polished_terracotta", InitRockBlocks.POLISHED_TERRACOTTA.get(), InitRockBlocks.POLISHED_TERRACOTTA_SLAB.get(), InitRockBlocks.POLISHED_TERRACOTTA_STAIRS.get(), InitRockBlocks.POLISHED_TERRACOTTA_WALL.get(), InitRockBlocks.POLISHED_TERRACOTTA_PRESSURE_PLATE.get(), null);
        registerBlockstateVariants("terracotta_paving", InitRockBlocks.TERRACOTTA_PAVING.get(), InitRockBlocks.TERRACOTTA_PAVING_SLAB.get(), InitRockBlocks.TERRACOTTA_PAVING_STAIRS.get(), InitRockBlocks.TERRACOTTA_PAVING_WALL.get(), InitRockBlocks.TERRACOTTA_PAVING_PRESSURE_PLATE.get(), null);
        registerBlockstateVariants("terracotta_tiles", InitRockBlocks.TERRACOTTA_TILES.get(), InitRockBlocks.TERRACOTTA_TILES_SLAB.get(), InitRockBlocks.TERRACOTTA_TILES_STAIRS.get(), InitRockBlocks.TERRACOTTA_TILES_WALL.get(), InitRockBlocks.TERRACOTTA_TILES_PRESSURE_PLATE.get(), null);
        registerBlockstateVariants("terracotta_bricks", InitRockBlocks.TERRACOTTA_BRICKS.get(), InitRockBlocks.TERRACOTTA_BRICKS_SLAB.get(), InitRockBlocks.TERRACOTTA_BRICKS_STAIRS.get(), InitRockBlocks.TERRACOTTA_BRICKS_WALL.get(), InitRockBlocks.TERRACOTTA_BRICKS_PRESSURE_PLATE.get(), null);
        registerBlockstateVariants("terracotta_large_bricks", InitRockBlocks.TERRACOTTA_LARGE_BRICKS.get(), InitRockBlocks.TERRACOTTA_LARGE_BRICKS_SLAB.get(), InitRockBlocks.TERRACOTTA_LARGE_BRICKS_STAIRS.get(), InitRockBlocks.TERRACOTTA_LARGE_BRICKS_WALL.get(), InitRockBlocks.TERRACOTTA_LARGE_BRICKS_PRESSURE_PLATE.get(), null);
        registerBlockstateVariants("terracotta_paving_stones", InitRockBlocks.TERRACOTTA_PAVING_STONES.get(), InitRockBlocks.TERRACOTTA_PAVING_STONES_SLAB.get(), InitRockBlocks.TERRACOTTA_PAVING_STONES_STAIRS.get(), InitRockBlocks.TERRACOTTA_PAVING_STONES_WALL.get(), InitRockBlocks.TERRACOTTA_PAVING_STONES_PRESSURE_PLATE.get(), null);
        registerBlockstateVariants("terracotta_rooftiles", InitRockBlocks.TERRACOTTA_ROOFTILES.get(), InitRockBlocks.TERRACOTTA_ROOFTILES_SLAB.get(), null, null, null, null);
        rooftilesStairsBlock(InitRockBlocks.TERRACOTTA_ROOFTILES_STAIRS.get(), modLoc("block/terracotta_rooftiles"));
    }
}