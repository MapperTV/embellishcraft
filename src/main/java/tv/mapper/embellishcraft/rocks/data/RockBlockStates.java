package tv.mapper.embellishcraft.rocks.data;

import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import tv.mapper.embellishcraft.core.ECConstants;
import tv.mapper.embellishcraft.core.data.ECBlockStates;
import tv.mapper.embellishcraft.core.util.RockType;
import tv.mapper.embellishcraft.rocks.block.InitRockBlocks;

public class RockBlockStates extends ECBlockStates
{
    public RockBlockStates(PackOutput output, String modid, ExistingFileHelper exFileHelper, String name)
    {
        super(output, modid, exFileHelper, name);
    }

    @Override
    protected void registerStatesAndModels()
    {
        // Rocks
        for(int j = 0; j < RockType.values().length; j++)
        {
            registerBlockstateVariants(RockType.byId(j).getSerializedName(), ECConstants.MODID, InitRockBlocks.ROCK_BLOCKS.get(RockType.byId(j)).get(), InitRockBlocks.ROCK_SLABS.get(RockType.byId(j)).get(), InitRockBlocks.ROCK_STAIRS.get(RockType.byId(j)).get(), InitRockBlocks.ROCK_WALLS.get(RockType.byId(j)).get(), InitRockBlocks.ROCK_PRESSURE_PLATES.get(RockType.byId(j)).get(), InitRockBlocks.ROCK_BUTTONS.get(RockType.byId(j)).get());

            registerBlockstateVariants(RockType.byId(j).getSerializedName() + "_cobblestone", ECConstants.MODID, InitRockBlocks.ROCK_COBBLESTONES.get(RockType.byId(j)).get(), InitRockBlocks.ROCK_COBBLESTONE_SLABS.get(RockType.byId(j)).get(), InitRockBlocks.ROCK_COBBLESTONE_STAIRS.get(RockType.byId(j)).get(), InitRockBlocks.ROCK_COBBLESTONE_WALLS.get(RockType.byId(j)).get(), InitRockBlocks.ROCK_COBBLESTONE_PRESSURE_PLATES.get(RockType.byId(j)).get(), null);

            registerBlockstateVariants(RockType.byId(j).getSerializedName() + "_cobblestone_bricks", ECConstants.MODID, InitRockBlocks.ROCK_COBBLESTONE_BRICKS.get(RockType.byId(j)).get(), InitRockBlocks.ROCK_COBBLESTONE_BRICKS_SLABS.get(RockType.byId(j)).get(), InitRockBlocks.ROCK_COBBLESTONE_BRICKS_STAIRS.get(RockType.byId(j)).get(), InitRockBlocks.ROCK_COBBLESTONE_BRICKS_WALLS.get(RockType.byId(j)).get(), InitRockBlocks.ROCK_COBBLESTONE_BRICKS_PRESSURE_PLATES.get(RockType.byId(j)).get(), null);

            registerBlockstateVariants("smooth_" + RockType.byId(j).getSerializedName(), ECConstants.MODID, InitRockBlocks.SMOOTH_ROCK_BLOCKS.get(RockType.byId(j)).get(), InitRockBlocks.SMOOTH_ROCK_SLABS.get(RockType.byId(j)).get(), InitRockBlocks.SMOOTH_ROCK_STAIRS.get(RockType.byId(j)).get(), InitRockBlocks.SMOOTH_ROCK_WALLS.get(RockType.byId(j)).get(), InitRockBlocks.SMOOTH_ROCK_PRESSURE_PLATES.get(RockType.byId(j)).get(), null);

            registerBlockstateVariantsWithSideSlab("polished_" + RockType.byId(j).getSerializedName(), InitRockBlocks.POLISHED_ROCK_BLOCKS.get(RockType.byId(j)).get(), InitRockBlocks.POLISHED_ROCK_SLABS.get(RockType.byId(j)).get(), InitRockBlocks.POLISHED_ROCK_STAIRS.get(RockType.byId(j)).get(), InitRockBlocks.POLISHED_ROCK_WALLS.get(RockType.byId(j)).get(), InitRockBlocks.POLISHED_ROCK_PRESSURE_PLATES.get(RockType.byId(j)).get(), null);

            registerBlockstateVariants(RockType.byId(j).getSerializedName() + "_paving", ECConstants.MODID, InitRockBlocks.ROCK_PAVINGS.get(RockType.byId(j)).get(), InitRockBlocks.ROCK_PAVING_SLABS.get(RockType.byId(j)).get(), InitRockBlocks.ROCK_PAVING_STAIRS.get(RockType.byId(j)).get(), InitRockBlocks.ROCK_PAVING_WALLS.get(RockType.byId(j)).get(), InitRockBlocks.ROCK_PAVING_PRESSURE_PLATES.get(RockType.byId(j)).get(), null);

            registerBlockstateVariants(RockType.byId(j).getSerializedName() + "_tiles", ECConstants.MODID, InitRockBlocks.ROCK_TILES.get(RockType.byId(j)).get(), InitRockBlocks.ROCK_TILES_SLABS.get(RockType.byId(j)).get(), InitRockBlocks.ROCK_TILES_STAIRS.get(RockType.byId(j)).get(), InitRockBlocks.ROCK_TILES_WALLS.get(RockType.byId(j)).get(), InitRockBlocks.ROCK_TILES_PRESSURE_PLATES.get(RockType.byId(j)).get(), null);

            registerBlockstateVariants(RockType.byId(j).getSerializedName() + "_bricks", ECConstants.MODID, InitRockBlocks.ROCK_BRICKS.get(RockType.byId(j)).get(), InitRockBlocks.ROCK_BRICKS_SLABS.get(RockType.byId(j)).get(), InitRockBlocks.ROCK_BRICKS_STAIRS.get(RockType.byId(j)).get(), InitRockBlocks.ROCK_BRICKS_WALLS.get(RockType.byId(j)).get(), InitRockBlocks.ROCK_BRICKS_PRESSURE_PLATES.get(RockType.byId(j)).get(), null);

            registerBlockstateVariants(RockType.byId(j).getSerializedName() + "_large_bricks", ECConstants.MODID, InitRockBlocks.ROCK_LARGE_BRICKS.get(RockType.byId(j)).get(), InitRockBlocks.ROCK_LARGE_BRICKS_SLABS.get(RockType.byId(j)).get(), InitRockBlocks.ROCK_LARGE_BRICKS_STAIRS.get(RockType.byId(j)).get(), InitRockBlocks.ROCK_LARGE_BRICKS_WALLS.get(RockType.byId(j)).get(), InitRockBlocks.ROCK_LARGE_BRICKS_PRESSURE_PLATES.get(RockType.byId(j)).get(), null);

            registerBlockstateVariants(RockType.byId(j).getSerializedName() + "_paving_stones", ECConstants.MODID, InitRockBlocks.ROCK_PAVING_STONES.get(RockType.byId(j)).get(), InitRockBlocks.ROCK_PAVING_STONES_SLABS.get(RockType.byId(j)).get(), InitRockBlocks.ROCK_PAVING_STONES_STAIRS.get(RockType.byId(j)).get(), InitRockBlocks.ROCK_PAVING_STONES_WALLS.get(RockType.byId(j)).get(), InitRockBlocks.ROCK_PAVING_STONES_PRESSURE_PLATES.get(RockType.byId(j)).get(), null);

            registerBlockstateVariants(RockType.byId(j).getSerializedName() + "_ornament", ECConstants.MODID, InitRockBlocks.ROCK_ORNAMENTS.get(RockType.byId(j)).get(), null, null, null, InitRockBlocks.ROCK_ORNAMENT_PRESSURE_PLATES.get(RockType.byId(j)).get(), null);

            registerBlockstateVariants(RockType.byId(j).getSerializedName() + "_rooftiles", ECConstants.MODID, InitRockBlocks.ROCK_ROOFTILES.get(RockType.byId(j)).get(), InitRockBlocks.ROCK_ROOFTILES_SLABS.get(RockType.byId(j)).get(), null, null, null, null);
            rooftilesStairsBlock(InitRockBlocks.ROCK_ROOFTILES_STAIRS.get(RockType.byId(j)).get(), modLoc("block/" + RockType.byId(j).getSerializedName() + "_rooftiles"));

        }

        registerBlockstateVariants("paving_stones", ECConstants.MODID, InitRockBlocks.PAVING_STONES.get(), InitRockBlocks.PAVING_STONES_SLAB.get(), InitRockBlocks.PAVING_STONES_STAIRS.get(), InitRockBlocks.PAVING_STONES_WALL.get(), InitRockBlocks.PAVING_STONES_PRESSURE_PLATE.get(), null);

        // Andesite
        registerBlockstateVariants("andesite", "minecraft", null, null, null, null, null, InitRockBlocks.ANDESITE_BUTTON.get());
        registerBlockstateVariants("smooth_andesite", ECConstants.MODID, InitRockBlocks.SMOOTH_ANDESITE.get(), InitRockBlocks.SMOOTH_ANDESITE_SLAB.get(), InitRockBlocks.SMOOTH_ANDESITE_STAIRS.get(), InitRockBlocks.SMOOTH_ANDESITE_WALL.get(), InitRockBlocks.SMOOTH_ANDESITE_PRESSURE_PLATE.get(), null);
        registerBlockstateVariants("andesite_paving", ECConstants.MODID, InitRockBlocks.ANDESITE_PAVING.get(), InitRockBlocks.ANDESITE_PAVING_SLAB.get(), InitRockBlocks.ANDESITE_PAVING_STAIRS.get(), InitRockBlocks.ANDESITE_PAVING_WALL.get(), InitRockBlocks.ANDESITE_PAVING_PRESSURE_PLATE.get(), null);
        registerBlockstateVariants("andesite_tiles", ECConstants.MODID, InitRockBlocks.ANDESITE_TILES.get(), InitRockBlocks.ANDESITE_TILES_SLAB.get(), InitRockBlocks.ANDESITE_TILES_STAIRS.get(), InitRockBlocks.ANDESITE_TILES_WALL.get(), InitRockBlocks.ANDESITE_TILES_PRESSURE_PLATE.get(), null);
        registerBlockstateVariants("andesite_bricks", ECConstants.MODID, InitRockBlocks.ANDESITE_BRICKS.get(), InitRockBlocks.ANDESITE_BRICKS_SLAB.get(), InitRockBlocks.ANDESITE_BRICKS_STAIRS.get(), InitRockBlocks.ANDESITE_BRICKS_WALL.get(), InitRockBlocks.ANDESITE_BRICKS_PRESSURE_PLATE.get(), null);
        registerBlockstateVariants("andesite_large_bricks", ECConstants.MODID, InitRockBlocks.ANDESITE_LARGE_BRICKS.get(), InitRockBlocks.ANDESITE_LARGE_BRICKS_SLAB.get(), InitRockBlocks.ANDESITE_LARGE_BRICKS_STAIRS.get(), InitRockBlocks.ANDESITE_LARGE_BRICKS_WALL.get(), InitRockBlocks.ANDESITE_LARGE_BRICKS_PRESSURE_PLATE.get(), null);
        registerBlockstateVariants("andesite_paving_stones", ECConstants.MODID, InitRockBlocks.ANDESITE_PAVING_STONES.get(), InitRockBlocks.ANDESITE_PAVING_STONES_SLAB.get(), InitRockBlocks.ANDESITE_PAVING_STONES_STAIRS.get(), InitRockBlocks.ANDESITE_PAVING_STONES_WALL.get(), InitRockBlocks.ANDESITE_PAVING_STONES_PRESSURE_PLATE.get(), null);
        registerBlockstateVariants("andesite_ornament", ECConstants.MODID, InitRockBlocks.ANDESITE_ORNAMENT.get(), null, null, null, InitRockBlocks.ANDESITE_ORNAMENT_PRESSURE_PLATE.get(), null);
        registerBlockstateVariants("andesite_rooftiles", ECConstants.MODID, InitRockBlocks.ANDESITE_ROOFTILES.get(), InitRockBlocks.ANDESITE_ROOFTILES_SLAB.get(), null, null, null, null);
        rooftilesStairsBlock(InitRockBlocks.ANDESITE_ROOFTILES_STAIRS.get(), modLoc("block/andesite_rooftiles"));

        // Diorite
        registerBlockstateVariants("diorite", "minecraft", null, null, null, null, null, InitRockBlocks.DIORITE_BUTTON.get());
        registerBlockstateVariants("smooth_diorite", ECConstants.MODID, InitRockBlocks.SMOOTH_DIORITE.get(), InitRockBlocks.SMOOTH_DIORITE_SLAB.get(), InitRockBlocks.SMOOTH_DIORITE_STAIRS.get(), InitRockBlocks.SMOOTH_DIORITE_WALL.get(), InitRockBlocks.SMOOTH_DIORITE_PRESSURE_PLATE.get(), null);
        registerBlockstateVariants("diorite_paving", ECConstants.MODID, InitRockBlocks.DIORITE_PAVING.get(), InitRockBlocks.DIORITE_PAVING_SLAB.get(), InitRockBlocks.DIORITE_PAVING_STAIRS.get(), InitRockBlocks.DIORITE_PAVING_WALL.get(), InitRockBlocks.DIORITE_PAVING_PRESSURE_PLATE.get(), null);
        registerBlockstateVariants("diorite_tiles", ECConstants.MODID, InitRockBlocks.DIORITE_TILES.get(), InitRockBlocks.DIORITE_TILES_SLAB.get(), InitRockBlocks.DIORITE_TILES_STAIRS.get(), InitRockBlocks.DIORITE_TILES_WALL.get(), InitRockBlocks.DIORITE_TILES_PRESSURE_PLATE.get(), null);
        registerBlockstateVariants("diorite_bricks", ECConstants.MODID, InitRockBlocks.DIORITE_BRICKS.get(), InitRockBlocks.DIORITE_BRICKS_SLAB.get(), InitRockBlocks.DIORITE_BRICKS_STAIRS.get(), InitRockBlocks.DIORITE_BRICKS_WALL.get(), InitRockBlocks.DIORITE_BRICKS_PRESSURE_PLATE.get(), null);
        registerBlockstateVariants("diorite_large_bricks", ECConstants.MODID, InitRockBlocks.DIORITE_LARGE_BRICKS.get(), InitRockBlocks.DIORITE_LARGE_BRICKS_SLAB.get(), InitRockBlocks.DIORITE_LARGE_BRICKS_STAIRS.get(), InitRockBlocks.DIORITE_LARGE_BRICKS_WALL.get(), InitRockBlocks.DIORITE_LARGE_BRICKS_PRESSURE_PLATE.get(), null);
        registerBlockstateVariants("diorite_paving_stones", ECConstants.MODID, InitRockBlocks.DIORITE_PAVING_STONES.get(), InitRockBlocks.DIORITE_PAVING_STONES_SLAB.get(), InitRockBlocks.DIORITE_PAVING_STONES_STAIRS.get(), InitRockBlocks.DIORITE_PAVING_STONES_WALL.get(), InitRockBlocks.DIORITE_PAVING_STONES_PRESSURE_PLATE.get(), null);
        registerBlockstateVariants("diorite_ornament", ECConstants.MODID, InitRockBlocks.DIORITE_ORNAMENT.get(), null, null, null, InitRockBlocks.DIORITE_ORNAMENT_PRESSURE_PLATE.get(), null);
        registerBlockstateVariants("diorite_rooftiles", ECConstants.MODID, InitRockBlocks.DIORITE_ROOFTILES.get(), InitRockBlocks.DIORITE_ROOFTILES_SLAB.get(), null, null, null, null);
        rooftilesStairsBlock(InitRockBlocks.DIORITE_ROOFTILES_STAIRS.get(), modLoc("block/diorite_rooftiles"));

        // Granite
        registerBlockstateVariants("granite", "minecraft", null, null, null, null, null, InitRockBlocks.GRANITE_BUTTON.get());
        registerBlockstateVariants("smooth_granite", ECConstants.MODID, InitRockBlocks.SMOOTH_GRANITE.get(), InitRockBlocks.SMOOTH_GRANITE_SLAB.get(), InitRockBlocks.SMOOTH_GRANITE_STAIRS.get(), InitRockBlocks.SMOOTH_GRANITE_WALL.get(), InitRockBlocks.SMOOTH_GRANITE_PRESSURE_PLATE.get(), null);
        registerBlockstateVariants("granite_paving", ECConstants.MODID, InitRockBlocks.GRANITE_PAVING.get(), InitRockBlocks.GRANITE_PAVING_SLAB.get(), InitRockBlocks.GRANITE_PAVING_STAIRS.get(), InitRockBlocks.GRANITE_PAVING_WALL.get(), InitRockBlocks.GRANITE_PAVING_PRESSURE_PLATE.get(), null);
        registerBlockstateVariants("granite_tiles", ECConstants.MODID, InitRockBlocks.GRANITE_TILES.get(), InitRockBlocks.GRANITE_TILES_SLAB.get(), InitRockBlocks.GRANITE_TILES_STAIRS.get(), InitRockBlocks.GRANITE_TILES_WALL.get(), InitRockBlocks.GRANITE_TILES_PRESSURE_PLATE.get(), null);
        registerBlockstateVariants("granite_bricks", ECConstants.MODID, InitRockBlocks.GRANITE_BRICKS.get(), InitRockBlocks.GRANITE_BRICKS_SLAB.get(), InitRockBlocks.GRANITE_BRICKS_STAIRS.get(), InitRockBlocks.GRANITE_BRICKS_WALL.get(), InitRockBlocks.GRANITE_BRICKS_PRESSURE_PLATE.get(), null);
        registerBlockstateVariants("granite_large_bricks", ECConstants.MODID, InitRockBlocks.GRANITE_LARGE_BRICKS.get(), InitRockBlocks.GRANITE_LARGE_BRICKS_SLAB.get(), InitRockBlocks.GRANITE_LARGE_BRICKS_STAIRS.get(), InitRockBlocks.GRANITE_LARGE_BRICKS_WALL.get(), InitRockBlocks.GRANITE_LARGE_BRICKS_PRESSURE_PLATE.get(), null);
        registerBlockstateVariants("granite_paving_stones", ECConstants.MODID, InitRockBlocks.GRANITE_PAVING_STONES.get(), InitRockBlocks.GRANITE_PAVING_STONES_SLAB.get(), InitRockBlocks.GRANITE_PAVING_STONES_STAIRS.get(), InitRockBlocks.GRANITE_PAVING_STONES_WALL.get(), InitRockBlocks.GRANITE_PAVING_STONES_PRESSURE_PLATE.get(), null);
        registerBlockstateVariants("granite_ornament", ECConstants.MODID, InitRockBlocks.GRANITE_ORNAMENT.get(), null, null, null, InitRockBlocks.GRANITE_ORNAMENT_PRESSURE_PLATE.get(), null);
        registerBlockstateVariants("granite_rooftiles", ECConstants.MODID, InitRockBlocks.GRANITE_ROOFTILES.get(), InitRockBlocks.GRANITE_ROOFTILES_SLAB.get(), null, null, null, null);
        rooftilesStairsBlock(InitRockBlocks.GRANITE_ROOFTILES_STAIRS.get(), modLoc("block/granite_rooftiles"));

        // Sandstone
        buttonBlock(InitRockBlocks.SANDSTONE_BUTTON.get(), mcLoc("block/sandstone"));

        wallBlock(InitRockBlocks.SMOOTH_SANDSTONE_WALL.get(), mcLoc("block/sandstone_top"));

        pressurePlateBlock(InitRockBlocks.SMOOTH_SANDSTONE_PRESSURE_PLATE.get(), mcLoc("block/sandstone_top"));

        registerBlockstateVariantsWithSideSlab("polished_sandstone", InitRockBlocks.POLISHED_SANDSTONE.get(), InitRockBlocks.POLISHED_SANDSTONE_SLAB.get(), InitRockBlocks.POLISHED_SANDSTONE_STAIRS.get(), InitRockBlocks.POLISHED_SANDSTONE_WALL.get(), InitRockBlocks.POLISHED_SANDSTONE_PRESSURE_PLATE.get(), null);
        registerBlockstateVariants("sandstone_paving", ECConstants.MODID, InitRockBlocks.SANDSTONE_PAVING.get(), InitRockBlocks.SANDSTONE_PAVING_SLAB.get(), InitRockBlocks.SANDSTONE_PAVING_STAIRS.get(), InitRockBlocks.SANDSTONE_PAVING_WALL.get(), InitRockBlocks.SANDSTONE_PAVING_PRESSURE_PLATE.get(), null);
        registerBlockstateVariants("sandstone_tiles", ECConstants.MODID, InitRockBlocks.SANDSTONE_TILES.get(), InitRockBlocks.SANDSTONE_TILES_SLAB.get(), InitRockBlocks.SANDSTONE_TILES_STAIRS.get(), InitRockBlocks.SANDSTONE_TILES_WALL.get(), InitRockBlocks.SANDSTONE_TILES_PRESSURE_PLATE.get(), null);
        registerBlockstateVariants("sandstone_bricks", ECConstants.MODID, InitRockBlocks.SANDSTONE_BRICKS.get(), InitRockBlocks.SANDSTONE_BRICKS_SLAB.get(), InitRockBlocks.SANDSTONE_BRICKS_STAIRS.get(), InitRockBlocks.SANDSTONE_BRICKS_WALL.get(), InitRockBlocks.SANDSTONE_BRICKS_PRESSURE_PLATE.get(), null);
        registerBlockstateVariants("sandstone_large_bricks", ECConstants.MODID, InitRockBlocks.SANDSTONE_LARGE_BRICKS.get(), InitRockBlocks.SANDSTONE_LARGE_BRICKS_SLAB.get(), InitRockBlocks.SANDSTONE_LARGE_BRICKS_STAIRS.get(), InitRockBlocks.SANDSTONE_LARGE_BRICKS_WALL.get(), InitRockBlocks.SANDSTONE_LARGE_BRICKS_PRESSURE_PLATE.get(), null);
        registerBlockstateVariants("sandstone_paving_stones", ECConstants.MODID, InitRockBlocks.SANDSTONE_PAVING_STONES.get(), InitRockBlocks.SANDSTONE_PAVING_STONES_SLAB.get(), InitRockBlocks.SANDSTONE_PAVING_STONES_STAIRS.get(), InitRockBlocks.SANDSTONE_PAVING_STONES_WALL.get(), InitRockBlocks.SANDSTONE_PAVING_STONES_PRESSURE_PLATE.get(), null);
        registerBlockstateVariants("sandstone_rooftiles", ECConstants.MODID, InitRockBlocks.SANDSTONE_ROOFTILES.get(), InitRockBlocks.SANDSTONE_ROOFTILES_SLAB.get(), null, null, null, null);
        rooftilesStairsBlock(InitRockBlocks.SANDSTONE_ROOFTILES_STAIRS.get(), modLoc("block/sandstone_rooftiles"));

        // Red Sandstone
        buttonBlock(InitRockBlocks.RED_SANDSTONE_BUTTON.get(), mcLoc("block/red_sandstone"));

        wallBlock(InitRockBlocks.SMOOTH_RED_SANDSTONE_WALL.get(), mcLoc("block/red_sandstone_top"));

        pressurePlateBlock(InitRockBlocks.SMOOTH_RED_SANDSTONE_PRESSURE_PLATE.get(), mcLoc("block/red_sandstone_top"));

        registerBlockstateVariantsWithSideSlab("polished_red_sandstone", InitRockBlocks.POLISHED_RED_SANDSTONE.get(), InitRockBlocks.POLISHED_RED_SANDSTONE_SLAB.get(), InitRockBlocks.POLISHED_RED_SANDSTONE_STAIRS.get(), InitRockBlocks.POLISHED_RED_SANDSTONE_WALL.get(), InitRockBlocks.POLISHED_RED_SANDSTONE_PRESSURE_PLATE.get(), null);
        registerBlockstateVariants("red_sandstone_paving", ECConstants.MODID, InitRockBlocks.RED_SANDSTONE_PAVING.get(), InitRockBlocks.RED_SANDSTONE_PAVING_SLAB.get(), InitRockBlocks.RED_SANDSTONE_PAVING_STAIRS.get(), InitRockBlocks.RED_SANDSTONE_PAVING_WALL.get(), InitRockBlocks.RED_SANDSTONE_PAVING_PRESSURE_PLATE.get(), null);
        registerBlockstateVariants("red_sandstone_tiles", ECConstants.MODID, InitRockBlocks.RED_SANDSTONE_TILES.get(), InitRockBlocks.RED_SANDSTONE_TILES_SLAB.get(), InitRockBlocks.RED_SANDSTONE_TILES_STAIRS.get(), InitRockBlocks.RED_SANDSTONE_TILES_WALL.get(), InitRockBlocks.RED_SANDSTONE_TILES_PRESSURE_PLATE.get(), null);
        registerBlockstateVariants("red_sandstone_bricks", ECConstants.MODID, InitRockBlocks.RED_SANDSTONE_BRICKS.get(), InitRockBlocks.RED_SANDSTONE_BRICKS_SLAB.get(), InitRockBlocks.RED_SANDSTONE_BRICKS_STAIRS.get(), InitRockBlocks.RED_SANDSTONE_BRICKS_WALL.get(), InitRockBlocks.RED_SANDSTONE_BRICKS_PRESSURE_PLATE.get(), null);
        registerBlockstateVariants("red_sandstone_large_bricks", ECConstants.MODID, InitRockBlocks.RED_SANDSTONE_LARGE_BRICKS.get(), InitRockBlocks.RED_SANDSTONE_LARGE_BRICKS_SLAB.get(), InitRockBlocks.RED_SANDSTONE_LARGE_BRICKS_STAIRS.get(), InitRockBlocks.RED_SANDSTONE_LARGE_BRICKS_WALL.get(), InitRockBlocks.RED_SANDSTONE_LARGE_BRICKS_PRESSURE_PLATE.get(), null);
        registerBlockstateVariants("red_sandstone_paving_stones", ECConstants.MODID, InitRockBlocks.RED_SANDSTONE_PAVING_STONES.get(), InitRockBlocks.RED_SANDSTONE_PAVING_STONES_SLAB.get(), InitRockBlocks.RED_SANDSTONE_PAVING_STONES_STAIRS.get(), InitRockBlocks.RED_SANDSTONE_PAVING_STONES_WALL.get(), InitRockBlocks.RED_SANDSTONE_PAVING_STONES_PRESSURE_PLATE.get(), null);
        registerBlockstateVariants("red_sandstone_rooftiles", ECConstants.MODID, InitRockBlocks.RED_SANDSTONE_ROOFTILES.get(), InitRockBlocks.RED_SANDSTONE_ROOFTILES_SLAB.get(), null, null, null, null);
        rooftilesStairsBlock(InitRockBlocks.RED_SANDSTONE_ROOFTILES_STAIRS.get(), modLoc("block/red_sandstone_rooftiles"));

        // Terracotta
        slabBlock(InitRockBlocks.TERRACOTTA_SLAB.get(), mcLoc("block/terracotta"), mcLoc("block/terracotta"));
        stairsBlock(InitRockBlocks.TERRACOTTA_STAIRS.get(), mcLoc("block/terracotta"));
        wallBlock(InitRockBlocks.TERRACOTTA_WALL.get(), mcLoc("block/terracotta"));

        pressurePlateBlock(InitRockBlocks.TERRACOTTA_PRESSURE_PLATE.get(), mcLoc("block/terracotta"));

        buttonBlock(InitRockBlocks.TERRACOTTA_BUTTON.get(), mcLoc("block/terracotta"));

        registerBlockstateVariantsWithSideSlab("polished_terracotta", InitRockBlocks.POLISHED_TERRACOTTA.get(), InitRockBlocks.POLISHED_TERRACOTTA_SLAB.get(), InitRockBlocks.POLISHED_TERRACOTTA_STAIRS.get(), InitRockBlocks.POLISHED_TERRACOTTA_WALL.get(), InitRockBlocks.POLISHED_TERRACOTTA_PRESSURE_PLATE.get(), null);
        registerBlockstateVariants("terracotta_paving", ECConstants.MODID, InitRockBlocks.TERRACOTTA_PAVING.get(), InitRockBlocks.TERRACOTTA_PAVING_SLAB.get(), InitRockBlocks.TERRACOTTA_PAVING_STAIRS.get(), InitRockBlocks.TERRACOTTA_PAVING_WALL.get(), InitRockBlocks.TERRACOTTA_PAVING_PRESSURE_PLATE.get(), null);
        registerBlockstateVariants("terracotta_tiles", ECConstants.MODID, InitRockBlocks.TERRACOTTA_TILES.get(), InitRockBlocks.TERRACOTTA_TILES_SLAB.get(), InitRockBlocks.TERRACOTTA_TILES_STAIRS.get(), InitRockBlocks.TERRACOTTA_TILES_WALL.get(), InitRockBlocks.TERRACOTTA_TILES_PRESSURE_PLATE.get(), null);
        registerBlockstateVariants("terracotta_bricks", ECConstants.MODID, InitRockBlocks.TERRACOTTA_BRICKS.get(), InitRockBlocks.TERRACOTTA_BRICKS_SLAB.get(), InitRockBlocks.TERRACOTTA_BRICKS_STAIRS.get(), InitRockBlocks.TERRACOTTA_BRICKS_WALL.get(), InitRockBlocks.TERRACOTTA_BRICKS_PRESSURE_PLATE.get(), null);
        registerBlockstateVariants("terracotta_large_bricks", ECConstants.MODID, InitRockBlocks.TERRACOTTA_LARGE_BRICKS.get(), InitRockBlocks.TERRACOTTA_LARGE_BRICKS_SLAB.get(), InitRockBlocks.TERRACOTTA_LARGE_BRICKS_STAIRS.get(), InitRockBlocks.TERRACOTTA_LARGE_BRICKS_WALL.get(), InitRockBlocks.TERRACOTTA_LARGE_BRICKS_PRESSURE_PLATE.get(), null);
        registerBlockstateVariants("terracotta_paving_stones", ECConstants.MODID, InitRockBlocks.TERRACOTTA_PAVING_STONES.get(), InitRockBlocks.TERRACOTTA_PAVING_STONES_SLAB.get(), InitRockBlocks.TERRACOTTA_PAVING_STONES_STAIRS.get(), InitRockBlocks.TERRACOTTA_PAVING_STONES_WALL.get(), InitRockBlocks.TERRACOTTA_PAVING_STONES_PRESSURE_PLATE.get(), null);
        registerBlockstateVariants("terracotta_rooftiles", ECConstants.MODID, InitRockBlocks.TERRACOTTA_ROOFTILES.get(), InitRockBlocks.TERRACOTTA_ROOFTILES_SLAB.get(), null, null, null, null);
        rooftilesStairsBlock(InitRockBlocks.TERRACOTTA_ROOFTILES_STAIRS.get(), modLoc("block/terracotta_rooftiles"));
    }
}