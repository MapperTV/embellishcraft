package tv.mapper.embellishcraft.rocks.data.gen;

import java.util.Arrays;

import org.codehaus.plexus.util.StringUtils;

import tv.mapper.embellishcraft.data.gen.ECLang;
import tv.mapper.embellishcraft.rocks.world.level.blocks.InitRockBlocks;
import tv.mapper.embellishcraft.util.RockType;

public class RockLang
{
    public static void addRockTranslations(ECLang ecLang, String lang)
    {
        switch(lang)
        {
            default:
            case "en_us":
                for(int j = 0; j < Arrays.stream(RockType.values()).count(); j++)
                {
                    // Rocks
                    ecLang.addBlock(InitRockBlocks.ROCK_BLOCKS.get(RockType.byId(j)), StringUtils.capitalise(RockType.byId(j).getName()));
                    ecLang.addBlock(InitRockBlocks.ROCK_STAIRS.get(RockType.byId(j)), StringUtils.capitalise(RockType.byId(j).getName()) + " Stairs");
                    ecLang.addBlock(InitRockBlocks.ROCK_SLABS.get(RockType.byId(j)), StringUtils.capitalise(RockType.byId(j).getName()) + " Slab");
                    ecLang.addBlock(InitRockBlocks.ROCK_WALLS.get(RockType.byId(j)), StringUtils.capitalise(RockType.byId(j).getName()) + " Wall");
                    ecLang.addBlock(InitRockBlocks.ROCK_PRESSURE_PLATES.get(RockType.byId(j)), StringUtils.capitalise(RockType.byId(j).getName()) + " Pressure Plate");
                    ecLang.addBlock(InitRockBlocks.ROCK_BUTTONS.get(RockType.byId(j)), StringUtils.capitalise(RockType.byId(j).getName()) + " Button");

                    // Cobbletones
                    ecLang.addBlock(InitRockBlocks.ROCK_COBBLESTONES.get(RockType.byId(j)), StringUtils.capitalise(RockType.byId(j).getName()) + " Cobblestone");
                    ecLang.addBlock(InitRockBlocks.ROCK_COBBLESTONE_STAIRS.get(RockType.byId(j)), StringUtils.capitalise(RockType.byId(j).getName()) + " Cobblestone Stairs");
                    ecLang.addBlock(InitRockBlocks.ROCK_COBBLESTONE_SLABS.get(RockType.byId(j)), StringUtils.capitalise(RockType.byId(j).getName()) + " Cobblestone Slab");
                    ecLang.addBlock(InitRockBlocks.ROCK_COBBLESTONE_WALLS.get(RockType.byId(j)), StringUtils.capitalise(RockType.byId(j).getName()) + " Cobblestone Wall");
                    ecLang.addBlock(InitRockBlocks.ROCK_COBBLESTONE_PRESSURE_PLATES.get(RockType.byId(j)), StringUtils.capitalise(RockType.byId(j).getName()) + " Cobblestone Pressure Plate");

                    // Cobbletone bricks
                    ecLang.addBlock(InitRockBlocks.ROCK_COBBLESTONE_BRICKS.get(RockType.byId(j)), StringUtils.capitalise(RockType.byId(j).getName()) + " Cobblestone Bricks");
                    ecLang.addBlock(InitRockBlocks.ROCK_COBBLESTONE_BRICKS_STAIRS.get(RockType.byId(j)), StringUtils.capitalise(RockType.byId(j).getName()) + " Cobblestone Bricks Stairs");
                    ecLang.addBlock(InitRockBlocks.ROCK_COBBLESTONE_BRICKS_SLABS.get(RockType.byId(j)), StringUtils.capitalise(RockType.byId(j).getName()) + " Cobblestone Bricks Slab");
                    ecLang.addBlock(InitRockBlocks.ROCK_COBBLESTONE_BRICKS_WALLS.get(RockType.byId(j)), StringUtils.capitalise(RockType.byId(j).getName()) + " Cobblestone Bricks Wall");
                    ecLang.addBlock(InitRockBlocks.ROCK_COBBLESTONE_BRICKS_PRESSURE_PLATES.get(RockType.byId(j)), StringUtils.capitalise(RockType.byId(j).getName()) + " Cobblestone Bricks Pressure Plate");

                    // Smooth rocks
                    ecLang.addBlock(InitRockBlocks.SMOOTH_ROCK_BLOCKS.get(RockType.byId(j)), "Smooth " + StringUtils.capitalise(RockType.byId(j).getName()));
                    ecLang.addBlock(InitRockBlocks.SMOOTH_ROCK_STAIRS.get(RockType.byId(j)), "Smooth " + StringUtils.capitalise(RockType.byId(j).getName()) + " Stairs");
                    ecLang.addBlock(InitRockBlocks.SMOOTH_ROCK_SLABS.get(RockType.byId(j)), "Smooth " + StringUtils.capitalise(RockType.byId(j).getName()) + " Slab");
                    ecLang.addBlock(InitRockBlocks.SMOOTH_ROCK_WALLS.get(RockType.byId(j)), "Smooth " + StringUtils.capitalise(RockType.byId(j).getName()) + " Wall");
                    ecLang.addBlock(InitRockBlocks.SMOOTH_ROCK_PRESSURE_PLATES.get(RockType.byId(j)), "Smooth " + StringUtils.capitalise(RockType.byId(j).getName()) + " Pressure Plate");

                    // Polished rocks
                    ecLang.addBlock(InitRockBlocks.POLISHED_ROCK_BLOCKS.get(RockType.byId(j)), "Polished " + StringUtils.capitalise(RockType.byId(j).getName()));
                    ecLang.addBlock(InitRockBlocks.POLISHED_ROCK_STAIRS.get(RockType.byId(j)), "Polished " + StringUtils.capitalise(RockType.byId(j).getName()) + " Stairs");
                    ecLang.addBlock(InitRockBlocks.POLISHED_ROCK_SLABS.get(RockType.byId(j)), "Polished " + StringUtils.capitalise(RockType.byId(j).getName()) + " Slab");
                    ecLang.addBlock(InitRockBlocks.POLISHED_ROCK_WALLS.get(RockType.byId(j)), "Polished " + StringUtils.capitalise(RockType.byId(j).getName()) + " Wall");
                    ecLang.addBlock(InitRockBlocks.POLISHED_ROCK_PRESSURE_PLATES.get(RockType.byId(j)), "Polished " + StringUtils.capitalise(RockType.byId(j).getName()) + " Pressure Plate");

                    // Rock pavings
                    ecLang.addBlock(InitRockBlocks.ROCK_PAVINGS.get(RockType.byId(j)), StringUtils.capitalise(RockType.byId(j).getName()) + " Paving");
                    ecLang.addBlock(InitRockBlocks.ROCK_PAVING_STAIRS.get(RockType.byId(j)), StringUtils.capitalise(RockType.byId(j).getName()) + " Paving Stairs");
                    ecLang.addBlock(InitRockBlocks.ROCK_PAVING_SLABS.get(RockType.byId(j)), StringUtils.capitalise(RockType.byId(j).getName()) + " Paving Slab");
                    ecLang.addBlock(InitRockBlocks.ROCK_PAVING_WALLS.get(RockType.byId(j)), StringUtils.capitalise(RockType.byId(j).getName()) + " Paving Wall");
                    ecLang.addBlock(InitRockBlocks.ROCK_PAVING_PRESSURE_PLATES.get(RockType.byId(j)), StringUtils.capitalise(RockType.byId(j).getName()) + " Paving Pressure Plate");

                    // Rock tiles
                    ecLang.addBlock(InitRockBlocks.ROCK_TILES.get(RockType.byId(j)), StringUtils.capitalise(RockType.byId(j).getName()) + " Tiles");
                    ecLang.addBlock(InitRockBlocks.ROCK_TILES_STAIRS.get(RockType.byId(j)), StringUtils.capitalise(RockType.byId(j).getName()) + " Tiles Stairs");
                    ecLang.addBlock(InitRockBlocks.ROCK_TILES_SLABS.get(RockType.byId(j)), StringUtils.capitalise(RockType.byId(j).getName()) + " Tiles Slab");
                    ecLang.addBlock(InitRockBlocks.ROCK_TILES_WALLS.get(RockType.byId(j)), StringUtils.capitalise(RockType.byId(j).getName()) + " Tiles Wall");
                    ecLang.addBlock(InitRockBlocks.ROCK_TILES_PRESSURE_PLATES.get(RockType.byId(j)), StringUtils.capitalise(RockType.byId(j).getName()) + " Tiles Pressure Plate");

                    // Rock bricks
                    ecLang.addBlock(InitRockBlocks.ROCK_BRICKS.get(RockType.byId(j)), StringUtils.capitalise(RockType.byId(j).getName()) + " Bricks");
                    ecLang.addBlock(InitRockBlocks.ROCK_BRICKS_STAIRS.get(RockType.byId(j)), StringUtils.capitalise(RockType.byId(j).getName()) + " Bricks Stairs");
                    ecLang.addBlock(InitRockBlocks.ROCK_BRICKS_SLABS.get(RockType.byId(j)), StringUtils.capitalise(RockType.byId(j).getName()) + " Bricks Slab");
                    ecLang.addBlock(InitRockBlocks.ROCK_BRICKS_WALLS.get(RockType.byId(j)), StringUtils.capitalise(RockType.byId(j).getName()) + " Bricks Wall");
                    ecLang.addBlock(InitRockBlocks.ROCK_BRICKS_PRESSURE_PLATES.get(RockType.byId(j)), StringUtils.capitalise(RockType.byId(j).getName()) + " Bricks Pressure Plate");

                    // Rock large bricks
                    ecLang.addBlock(InitRockBlocks.ROCK_LARGE_BRICKS.get(RockType.byId(j)), StringUtils.capitalise(RockType.byId(j).getName()) + " Large Bricks");
                    ecLang.addBlock(InitRockBlocks.ROCK_LARGE_BRICKS_STAIRS.get(RockType.byId(j)), StringUtils.capitalise(RockType.byId(j).getName()) + " Large Bricks Stairs");
                    ecLang.addBlock(InitRockBlocks.ROCK_LARGE_BRICKS_SLABS.get(RockType.byId(j)), StringUtils.capitalise(RockType.byId(j).getName()) + " Large Bricks Slab");
                    ecLang.addBlock(InitRockBlocks.ROCK_LARGE_BRICKS_WALLS.get(RockType.byId(j)), StringUtils.capitalise(RockType.byId(j).getName()) + " Large Bricks Wall");
                    ecLang.addBlock(InitRockBlocks.ROCK_LARGE_BRICKS_PRESSURE_PLATES.get(RockType.byId(j)), StringUtils.capitalise(RockType.byId(j).getName()) + " Large Bricks Pressure Plate");

                    // Rock paving stones
                    ecLang.addBlock(InitRockBlocks.ROCK_PAVING_STONES.get(RockType.byId(j)), StringUtils.capitalise(RockType.byId(j).getName()) + " Paving Stones");
                    ecLang.addBlock(InitRockBlocks.ROCK_PAVING_STONES_STAIRS.get(RockType.byId(j)), StringUtils.capitalise(RockType.byId(j).getName()) + " Paving Stones Stairs");
                    ecLang.addBlock(InitRockBlocks.ROCK_PAVING_STONES_SLABS.get(RockType.byId(j)), StringUtils.capitalise(RockType.byId(j).getName()) + " Paving Stones Slab");
                    ecLang.addBlock(InitRockBlocks.ROCK_PAVING_STONES_WALLS.get(RockType.byId(j)), StringUtils.capitalise(RockType.byId(j).getName()) + " Paving Stones Wall");
                    ecLang.addBlock(InitRockBlocks.ROCK_PAVING_STONES_PRESSURE_PLATES.get(RockType.byId(j)), StringUtils.capitalise(RockType.byId(j).getName()) + " Paving Stones Pressure Plate");

                    // Rock ornaments
                    ecLang.addBlock(InitRockBlocks.ROCK_ORNAMENTS.get(RockType.byId(j)), StringUtils.capitalise(RockType.byId(j).getName()) + " Ornament");
                    ecLang.addBlock(InitRockBlocks.ROCK_ORNAMENT_PRESSURE_PLATES.get(RockType.byId(j)), StringUtils.capitalise(RockType.byId(j).getName()) + " Ornament Pressure Plate");

                    // Rock rooftiles
                    ecLang.addBlock(InitRockBlocks.ROCK_ROOFTILES.get(RockType.byId(j)), StringUtils.capitalise(RockType.byId(j).getName() + " Rooftiles"));
                    ecLang.addBlock(InitRockBlocks.ROCK_ROOFTILES_STAIRS.get(RockType.byId(j)), StringUtils.capitalise(RockType.byId(j).getName()) + " Rooftiles Stairs");
                    ecLang.addBlock(InitRockBlocks.ROCK_ROOFTILES_SLABS.get(RockType.byId(j)), StringUtils.capitalise(RockType.byId(j).getName()) + " Rooftiles Slab");
                }

                ecLang.addBlock(InitRockBlocks.PAVING_STONES, "Paving Stones");
                ecLang.addBlock(InitRockBlocks.PAVING_STONES_SLAB, "Paving Stones Slab");
                ecLang.addBlock(InitRockBlocks.PAVING_STONES_STAIRS, "Paving Stones Stairs");
                ecLang.addBlock(InitRockBlocks.PAVING_STONES_WALL, "Paving Stones Wall");
                ecLang.addBlock(InitRockBlocks.PAVING_STONES_PRESSURE_PLATE, "Paving Stones Pressure Plate");

                // Andesite
                ecLang.addBlock(InitRockBlocks.SMOOTH_ANDESITE, "Smooth Andesite");
                ecLang.addBlock(InitRockBlocks.SMOOTH_ANDESITE_SLAB, "Smooth Andesite Slab");
                ecLang.addBlock(InitRockBlocks.SMOOTH_ANDESITE_STAIRS, "Smooth Andesite Stairs");
                ecLang.addBlock(InitRockBlocks.SMOOTH_ANDESITE_WALL, "Smooth Andesite Wall");
                ecLang.addBlock(InitRockBlocks.SMOOTH_ANDESITE_PRESSURE_PLATE, "Smooth Andesite Pressure Plate");
                ecLang.addBlock(InitRockBlocks.ANDESITE_BUTTON, "Andesite Button");

                ecLang.addBlock(InitRockBlocks.ANDESITE_PAVING, "Andesite Paving");
                ecLang.addBlock(InitRockBlocks.ANDESITE_PAVING_SLAB, "Andesite Paving Slab");
                ecLang.addBlock(InitRockBlocks.ANDESITE_PAVING_STAIRS, "Andesite Paving Stairs");
                ecLang.addBlock(InitRockBlocks.ANDESITE_PAVING_WALL, "Andesite Paving Wall");
                ecLang.addBlock(InitRockBlocks.ANDESITE_PAVING_PRESSURE_PLATE, "Andesite Paving Pressure Plate");

                ecLang.addBlock(InitRockBlocks.ANDESITE_TILES, "Andesite Tiles");
                ecLang.addBlock(InitRockBlocks.ANDESITE_TILES_SLAB, "Andesite Tiles Slab");
                ecLang.addBlock(InitRockBlocks.ANDESITE_TILES_STAIRS, "Andesite Tiles Stairs");
                ecLang.addBlock(InitRockBlocks.ANDESITE_TILES_WALL, "Andesite Tiles Wall");
                ecLang.addBlock(InitRockBlocks.ANDESITE_TILES_PRESSURE_PLATE, "Andesite Tiles Pressure Plate");

                ecLang.addBlock(InitRockBlocks.ANDESITE_BRICKS, "Andesite Bricks");
                ecLang.addBlock(InitRockBlocks.ANDESITE_BRICKS_SLAB, "Andesite Bricks Slab");
                ecLang.addBlock(InitRockBlocks.ANDESITE_BRICKS_STAIRS, "Andesite Bricks Stairs");
                ecLang.addBlock(InitRockBlocks.ANDESITE_BRICKS_WALL, "Andesite Bricks Wall");
                ecLang.addBlock(InitRockBlocks.ANDESITE_BRICKS_PRESSURE_PLATE, "Andesite Bricks Pressure Plate");

                ecLang.addBlock(InitRockBlocks.ANDESITE_LARGE_BRICKS, "Andesite Large Bricks");
                ecLang.addBlock(InitRockBlocks.ANDESITE_LARGE_BRICKS_SLAB, "Andesite Large Bricks Slab");
                ecLang.addBlock(InitRockBlocks.ANDESITE_LARGE_BRICKS_STAIRS, "Andesite Large Bricks Stairs");
                ecLang.addBlock(InitRockBlocks.ANDESITE_LARGE_BRICKS_WALL, "Andesite Large Bricks Wall");
                ecLang.addBlock(InitRockBlocks.ANDESITE_LARGE_BRICKS_PRESSURE_PLATE, "Andesite Large Bricks Pressure Plate");

                ecLang.addBlock(InitRockBlocks.ANDESITE_PAVING_STONES, "Andesite Paving Stones");
                ecLang.addBlock(InitRockBlocks.ANDESITE_PAVING_STONES_SLAB, "Andesite Paving Stones Slab");
                ecLang.addBlock(InitRockBlocks.ANDESITE_PAVING_STONES_STAIRS, "Andesite Paving Stones Stairs");
                ecLang.addBlock(InitRockBlocks.ANDESITE_PAVING_STONES_WALL, "Andesite Paving Stones Wall");
                ecLang.addBlock(InitRockBlocks.ANDESITE_PAVING_STONES_PRESSURE_PLATE, "Andesite Paving Stones Pressure Plate");

                ecLang.addBlock(InitRockBlocks.ANDESITE_ORNAMENT, "Andesite Ornament");
                ecLang.addBlock(InitRockBlocks.ANDESITE_ORNAMENT_PRESSURE_PLATE, "Andesite Ornament Pressure Plate");

                ecLang.addBlock(InitRockBlocks.ANDESITE_ROOFTILES, "Andesite Rooftiles");
                ecLang.addBlock(InitRockBlocks.ANDESITE_ROOFTILES_SLAB, "Andesite Rooftiles Slab");
                ecLang.addBlock(InitRockBlocks.ANDESITE_ROOFTILES_STAIRS, "Andesite Rooftiles Stairs");

                // Diorite
                ecLang.addBlock(InitRockBlocks.SMOOTH_DIORITE, "Smooth Diorite");
                ecLang.addBlock(InitRockBlocks.SMOOTH_DIORITE_SLAB, "Smooth Diorite Slab");
                ecLang.addBlock(InitRockBlocks.SMOOTH_DIORITE_STAIRS, "Smooth Diorite Stairs");
                ecLang.addBlock(InitRockBlocks.SMOOTH_DIORITE_WALL, "Smooth Diorite Wall");
                ecLang.addBlock(InitRockBlocks.SMOOTH_DIORITE_PRESSURE_PLATE, "Smooth Diorite Pressure Plate");
                ecLang.addBlock(InitRockBlocks.DIORITE_BUTTON, "Diorite Button");

                ecLang.addBlock(InitRockBlocks.DIORITE_PAVING, "Diorite Paving");
                ecLang.addBlock(InitRockBlocks.DIORITE_PAVING_SLAB, "Diorite Paving Slab");
                ecLang.addBlock(InitRockBlocks.DIORITE_PAVING_STAIRS, "Diorite Paving Stairs");
                ecLang.addBlock(InitRockBlocks.DIORITE_PAVING_WALL, "Diorite Paving Wall");
                ecLang.addBlock(InitRockBlocks.DIORITE_PAVING_PRESSURE_PLATE, "Diorite Paving Pressure Plate");

                ecLang.addBlock(InitRockBlocks.DIORITE_TILES, "Diorite Tiles");
                ecLang.addBlock(InitRockBlocks.DIORITE_TILES_SLAB, "Diorite Tiles Slab");
                ecLang.addBlock(InitRockBlocks.DIORITE_TILES_STAIRS, "Diorite Tiles Stairs");
                ecLang.addBlock(InitRockBlocks.DIORITE_TILES_WALL, "Diorite Tiles Wall");
                ecLang.addBlock(InitRockBlocks.DIORITE_TILES_PRESSURE_PLATE, "Diorite Tiles Pressure Plate");

                ecLang.addBlock(InitRockBlocks.DIORITE_BRICKS, "Diorite Bricks");
                ecLang.addBlock(InitRockBlocks.DIORITE_BRICKS_SLAB, "Diorite Bricks Slab");
                ecLang.addBlock(InitRockBlocks.DIORITE_BRICKS_STAIRS, "Diorite Bricks Stairs");
                ecLang.addBlock(InitRockBlocks.DIORITE_BRICKS_WALL, "Diorite Bricks Wall");
                ecLang.addBlock(InitRockBlocks.DIORITE_BRICKS_PRESSURE_PLATE, "Diorite Bricks Pressure Plate");

                ecLang.addBlock(InitRockBlocks.DIORITE_LARGE_BRICKS, "Diorite Large Bricks");
                ecLang.addBlock(InitRockBlocks.DIORITE_LARGE_BRICKS_SLAB, "Diorite Large Bricks Slab");
                ecLang.addBlock(InitRockBlocks.DIORITE_LARGE_BRICKS_STAIRS, "Diorite Large Bricks Stairs");
                ecLang.addBlock(InitRockBlocks.DIORITE_LARGE_BRICKS_WALL, "Diorite Large Bricks Wall");
                ecLang.addBlock(InitRockBlocks.DIORITE_LARGE_BRICKS_PRESSURE_PLATE, "Diorite Large Bricks Pressure Plate");

                ecLang.addBlock(InitRockBlocks.DIORITE_PAVING_STONES, "Diorite Paving Stones");
                ecLang.addBlock(InitRockBlocks.DIORITE_PAVING_STONES_SLAB, "Diorite Paving Stones Slab");
                ecLang.addBlock(InitRockBlocks.DIORITE_PAVING_STONES_STAIRS, "Diorite Paving Stones Stairs");
                ecLang.addBlock(InitRockBlocks.DIORITE_PAVING_STONES_WALL, "Diorite Paving Stones Wall");
                ecLang.addBlock(InitRockBlocks.DIORITE_PAVING_STONES_PRESSURE_PLATE, "Diorite Paving Stones Pressure Plate");

                ecLang.addBlock(InitRockBlocks.DIORITE_ORNAMENT, "Diorite Ornament");
                ecLang.addBlock(InitRockBlocks.DIORITE_ORNAMENT_PRESSURE_PLATE, "Diorite Ornament Pressure Plate");

                ecLang.addBlock(InitRockBlocks.DIORITE_ROOFTILES, "Diorite Rooftiles");
                ecLang.addBlock(InitRockBlocks.DIORITE_ROOFTILES_SLAB, "Diorite Rooftiles Slab");
                ecLang.addBlock(InitRockBlocks.DIORITE_ROOFTILES_STAIRS, "Diorite Rooftiles Stairs");

                // Granite
                ecLang.addBlock(InitRockBlocks.SMOOTH_GRANITE, "Smooth Granite");
                ecLang.addBlock(InitRockBlocks.SMOOTH_GRANITE_SLAB, "Smooth Granite Slab");
                ecLang.addBlock(InitRockBlocks.SMOOTH_GRANITE_STAIRS, "Smooth Granite Stairs");
                ecLang.addBlock(InitRockBlocks.SMOOTH_GRANITE_WALL, "Smooth Granite Wall");
                ecLang.addBlock(InitRockBlocks.SMOOTH_GRANITE_PRESSURE_PLATE, "Smooth Granite Pressure Plate");
                ecLang.addBlock(InitRockBlocks.GRANITE_BUTTON, "Granite Button");

                ecLang.addBlock(InitRockBlocks.GRANITE_PAVING, "Granite Paving");
                ecLang.addBlock(InitRockBlocks.GRANITE_PAVING_SLAB, "Granite Paving Slab");
                ecLang.addBlock(InitRockBlocks.GRANITE_PAVING_STAIRS, "Granite Paving Stairs");
                ecLang.addBlock(InitRockBlocks.GRANITE_PAVING_WALL, "Granite Paving Wall");
                ecLang.addBlock(InitRockBlocks.GRANITE_PAVING_PRESSURE_PLATE, "Granite Paving Pressure Plate");

                ecLang.addBlock(InitRockBlocks.GRANITE_TILES, "Granite Tiles");
                ecLang.addBlock(InitRockBlocks.GRANITE_TILES_SLAB, "Granite Tiles Slab");
                ecLang.addBlock(InitRockBlocks.GRANITE_TILES_STAIRS, "Granite Tiles Stairs");
                ecLang.addBlock(InitRockBlocks.GRANITE_TILES_WALL, "Granite Tiles Wall");
                ecLang.addBlock(InitRockBlocks.GRANITE_TILES_PRESSURE_PLATE, "Granite Tiles Pressure Plate");

                ecLang.addBlock(InitRockBlocks.GRANITE_BRICKS, "Granite Bricks");
                ecLang.addBlock(InitRockBlocks.GRANITE_BRICKS_SLAB, "Granite Bricks Slab");
                ecLang.addBlock(InitRockBlocks.GRANITE_BRICKS_STAIRS, "Granite Bricks Stairs");
                ecLang.addBlock(InitRockBlocks.GRANITE_BRICKS_WALL, "Granite Bricks Wall");
                ecLang.addBlock(InitRockBlocks.GRANITE_BRICKS_PRESSURE_PLATE, "Granite Bricks Pressure Plate");

                ecLang.addBlock(InitRockBlocks.GRANITE_LARGE_BRICKS, "Granite Large Bricks");
                ecLang.addBlock(InitRockBlocks.GRANITE_LARGE_BRICKS_SLAB, "Granite Large Bricks Slab");
                ecLang.addBlock(InitRockBlocks.GRANITE_LARGE_BRICKS_STAIRS, "Granite Large Bricks Stairs");
                ecLang.addBlock(InitRockBlocks.GRANITE_LARGE_BRICKS_WALL, "Granite Large Bricks Wall");
                ecLang.addBlock(InitRockBlocks.GRANITE_LARGE_BRICKS_PRESSURE_PLATE, "Granite Large Bricks Pressure Plate");

                ecLang.addBlock(InitRockBlocks.GRANITE_PAVING_STONES, "Granite Paving Stones");
                ecLang.addBlock(InitRockBlocks.GRANITE_PAVING_STONES_SLAB, "Granite Paving Stones Slab");
                ecLang.addBlock(InitRockBlocks.GRANITE_PAVING_STONES_STAIRS, "Granite Paving Stones Stairs");
                ecLang.addBlock(InitRockBlocks.GRANITE_PAVING_STONES_WALL, "Granite Paving Stones Wall");
                ecLang.addBlock(InitRockBlocks.GRANITE_PAVING_STONES_PRESSURE_PLATE, "Granite Paving Stones Pressure Plate");

                ecLang.addBlock(InitRockBlocks.GRANITE_ORNAMENT, "Granite Ornament");
                ecLang.addBlock(InitRockBlocks.GRANITE_ORNAMENT_PRESSURE_PLATE, "Granite Ornament Pressure Plate");

                ecLang.addBlock(InitRockBlocks.GRANITE_ROOFTILES, "Granite Rooftiles");
                ecLang.addBlock(InitRockBlocks.GRANITE_ROOFTILES_SLAB, "Granite Rooftiles Slab");
                ecLang.addBlock(InitRockBlocks.GRANITE_ROOFTILES_STAIRS, "Granite Rooftiles Stairs");

                // Sandstone
                ecLang.addBlock(InitRockBlocks.SANDSTONE_BUTTON, "Sandstone Button");

                ecLang.addBlock(InitRockBlocks.SMOOTH_SANDSTONE_WALL, "Smooth Sandstone Wall");
                ecLang.addBlock(InitRockBlocks.SMOOTH_SANDSTONE_PRESSURE_PLATE, "Smooth Sandstone Pressure Plate");

                ecLang.addBlock(InitRockBlocks.POLISHED_SANDSTONE, "Polished Sandstone");
                ecLang.addBlock(InitRockBlocks.POLISHED_SANDSTONE_SLAB, "Polished Sandstone Slab");
                ecLang.addBlock(InitRockBlocks.POLISHED_SANDSTONE_STAIRS, "Polished Sandstone Stairs");
                ecLang.addBlock(InitRockBlocks.POLISHED_SANDSTONE_WALL, "Polished Sandstone Wall");
                ecLang.addBlock(InitRockBlocks.POLISHED_SANDSTONE_PRESSURE_PLATE, "Polished Sandstone Pressure Plate");

                ecLang.addBlock(InitRockBlocks.SANDSTONE_PAVING, "Sandstone Paving");
                ecLang.addBlock(InitRockBlocks.SANDSTONE_PAVING_SLAB, "Sandstone Paving Slab");
                ecLang.addBlock(InitRockBlocks.SANDSTONE_PAVING_STAIRS, "Sandstone Paving Stairs");
                ecLang.addBlock(InitRockBlocks.SANDSTONE_PAVING_WALL, "Sandstone Paving Wall");
                ecLang.addBlock(InitRockBlocks.SANDSTONE_PAVING_PRESSURE_PLATE, "Sandstone Paving Pressure Plate");

                ecLang.addBlock(InitRockBlocks.SANDSTONE_TILES, "Sandstone Tiles");
                ecLang.addBlock(InitRockBlocks.SANDSTONE_TILES_SLAB, "Sandstone Tiles Slab");
                ecLang.addBlock(InitRockBlocks.SANDSTONE_TILES_STAIRS, "Sandstone Tiles Stairs");
                ecLang.addBlock(InitRockBlocks.SANDSTONE_TILES_WALL, "Sandstone Tiles Wall");
                ecLang.addBlock(InitRockBlocks.SANDSTONE_TILES_PRESSURE_PLATE, "Sandstone Tiles Pressure Plate");

                ecLang.addBlock(InitRockBlocks.SANDSTONE_BRICKS, "Sandstone Bricks");
                ecLang.addBlock(InitRockBlocks.SANDSTONE_BRICKS_SLAB, "Sandstone Bricks Slab");
                ecLang.addBlock(InitRockBlocks.SANDSTONE_BRICKS_STAIRS, "Sandstone Bricks Stairs");
                ecLang.addBlock(InitRockBlocks.SANDSTONE_BRICKS_WALL, "Sandstone Bricks Wall");
                ecLang.addBlock(InitRockBlocks.SANDSTONE_BRICKS_PRESSURE_PLATE, "Sandstone Bricks Pressure Plate");

                ecLang.addBlock(InitRockBlocks.SANDSTONE_LARGE_BRICKS, "Sandstone Large Bricks");
                ecLang.addBlock(InitRockBlocks.SANDSTONE_LARGE_BRICKS_SLAB, "Sandstone Large Bricks Slab");
                ecLang.addBlock(InitRockBlocks.SANDSTONE_LARGE_BRICKS_STAIRS, "Sandstone Large Bricks Stairs");
                ecLang.addBlock(InitRockBlocks.SANDSTONE_LARGE_BRICKS_WALL, "Sandstone Large Bricks Wall");
                ecLang.addBlock(InitRockBlocks.SANDSTONE_LARGE_BRICKS_PRESSURE_PLATE, "Sandstone Large Bricks Pressure Plate");

                ecLang.addBlock(InitRockBlocks.SANDSTONE_PAVING_STONES, "Sandstone Paving Stones");
                ecLang.addBlock(InitRockBlocks.SANDSTONE_PAVING_STONES_SLAB, "Sandstone Paving Stones Slab");
                ecLang.addBlock(InitRockBlocks.SANDSTONE_PAVING_STONES_STAIRS, "Sandstone Paving Stones Stairs");
                ecLang.addBlock(InitRockBlocks.SANDSTONE_PAVING_STONES_WALL, "Sandstone Paving Stones Wall");
                ecLang.addBlock(InitRockBlocks.SANDSTONE_PAVING_STONES_PRESSURE_PLATE, "Sandstone Paving Stones Pressure Plate");

                ecLang.addBlock(InitRockBlocks.SANDSTONE_ROOFTILES, "Sandstone Rooftiles");
                ecLang.addBlock(InitRockBlocks.SANDSTONE_ROOFTILES_SLAB, "Sandstone Rooftiles Slab");
                ecLang.addBlock(InitRockBlocks.SANDSTONE_ROOFTILES_STAIRS, "Sandstone Rooftiles Stairs");

                // Red Sandstone
                ecLang.addBlock(InitRockBlocks.RED_SANDSTONE_BUTTON, "Red Sandstone Button");

                ecLang.addBlock(InitRockBlocks.SMOOTH_RED_SANDSTONE_WALL, "Smooth Red Sandstone Wall");
                ecLang.addBlock(InitRockBlocks.SMOOTH_RED_SANDSTONE_PRESSURE_PLATE, "Smooth Red Sandstone Pressure Plate");

                ecLang.addBlock(InitRockBlocks.POLISHED_RED_SANDSTONE, "Polished Red Sandstone");
                ecLang.addBlock(InitRockBlocks.POLISHED_RED_SANDSTONE_SLAB, "Polished Red Sandstone Slab");
                ecLang.addBlock(InitRockBlocks.POLISHED_RED_SANDSTONE_STAIRS, "Polished Red Sandstone Stairs");
                ecLang.addBlock(InitRockBlocks.POLISHED_RED_SANDSTONE_WALL, "Polished Red Sandstone Wall");
                ecLang.addBlock(InitRockBlocks.POLISHED_RED_SANDSTONE_PRESSURE_PLATE, "Polished Red Sandstone Pressure Plate");

                ecLang.addBlock(InitRockBlocks.RED_SANDSTONE_PAVING, "Red Sandstone Paving");
                ecLang.addBlock(InitRockBlocks.RED_SANDSTONE_PAVING_SLAB, "Red Sandstone Paving Slab");
                ecLang.addBlock(InitRockBlocks.RED_SANDSTONE_PAVING_STAIRS, "Red Sandstone Paving Stairs");
                ecLang.addBlock(InitRockBlocks.RED_SANDSTONE_PAVING_WALL, "Red Sandstone Paving Wall");
                ecLang.addBlock(InitRockBlocks.RED_SANDSTONE_PAVING_PRESSURE_PLATE, "Red Sandstone Paving Pressure Plate");

                ecLang.addBlock(InitRockBlocks.RED_SANDSTONE_TILES, "Red Sandstone Tiles");
                ecLang.addBlock(InitRockBlocks.RED_SANDSTONE_TILES_SLAB, "Red Sandstone Tiles Slab");
                ecLang.addBlock(InitRockBlocks.RED_SANDSTONE_TILES_STAIRS, "Red Sandstone Tiles Stairs");
                ecLang.addBlock(InitRockBlocks.RED_SANDSTONE_TILES_WALL, "Red Sandstone Tiles Wall");
                ecLang.addBlock(InitRockBlocks.RED_SANDSTONE_TILES_PRESSURE_PLATE, "Red Sandstone Tiles Pressure Plate");

                ecLang.addBlock(InitRockBlocks.RED_SANDSTONE_BRICKS, "Red Sandstone Bricks");
                ecLang.addBlock(InitRockBlocks.RED_SANDSTONE_BRICKS_SLAB, "Red Sandstone Bricks Slab");
                ecLang.addBlock(InitRockBlocks.RED_SANDSTONE_BRICKS_STAIRS, "Red Sandstone Bricks Stairs");
                ecLang.addBlock(InitRockBlocks.RED_SANDSTONE_BRICKS_WALL, "Red Sandstone Bricks Wall");
                ecLang.addBlock(InitRockBlocks.RED_SANDSTONE_BRICKS_PRESSURE_PLATE, "Red Sandstone Bricks Pressure Plate");

                ecLang.addBlock(InitRockBlocks.RED_SANDSTONE_LARGE_BRICKS, "Red Sandstone Large Bricks");
                ecLang.addBlock(InitRockBlocks.RED_SANDSTONE_LARGE_BRICKS_SLAB, "Red Sandstone Large Bricks Slab");
                ecLang.addBlock(InitRockBlocks.RED_SANDSTONE_LARGE_BRICKS_STAIRS, "Red Sandstone Large Bricks Stairs");
                ecLang.addBlock(InitRockBlocks.RED_SANDSTONE_LARGE_BRICKS_WALL, "Red Sandstone Large Bricks Wall");
                ecLang.addBlock(InitRockBlocks.RED_SANDSTONE_LARGE_BRICKS_PRESSURE_PLATE, "Red Sandstone Large Bricks Pressure Plate");

                ecLang.addBlock(InitRockBlocks.RED_SANDSTONE_PAVING_STONES, "Red Sandstone Paving Stones");
                ecLang.addBlock(InitRockBlocks.RED_SANDSTONE_PAVING_STONES_SLAB, "Red Sandstone Paving Stones Slab");
                ecLang.addBlock(InitRockBlocks.RED_SANDSTONE_PAVING_STONES_STAIRS, "Red Sandstone Paving Stones Stairs");
                ecLang.addBlock(InitRockBlocks.RED_SANDSTONE_PAVING_STONES_WALL, "Red Sandstone Paving Stones Wall");
                ecLang.addBlock(InitRockBlocks.RED_SANDSTONE_PAVING_STONES_PRESSURE_PLATE, "Red Sandstone Paving Stones Pressure Plate");

                ecLang.addBlock(InitRockBlocks.RED_SANDSTONE_ROOFTILES, "Red Sandstone Rooftiles");
                ecLang.addBlock(InitRockBlocks.RED_SANDSTONE_ROOFTILES_SLAB, "Red Sandstone Rooftiles Slab");
                ecLang.addBlock(InitRockBlocks.RED_SANDSTONE_ROOFTILES_STAIRS, "Red Sandstone Rooftiles Stairs");

                // Terracotta
                ecLang.addBlock(InitRockBlocks.TERRACOTTA_SLAB, "Terracotta Slab");
                ecLang.addBlock(InitRockBlocks.TERRACOTTA_STAIRS, "Terracotta Stairs");
                ecLang.addBlock(InitRockBlocks.TERRACOTTA_WALL, "Terracotta Wall");
                ecLang.addBlock(InitRockBlocks.TERRACOTTA_PRESSURE_PLATE, "Terracotta Pressure Plate");
                ecLang.addBlock(InitRockBlocks.TERRACOTTA_BUTTON, "Terracotta Button");

                ecLang.addBlock(InitRockBlocks.POLISHED_TERRACOTTA, "Polished Terracotta");
                ecLang.addBlock(InitRockBlocks.POLISHED_TERRACOTTA_SLAB, "Polished Terracotta Slab");
                ecLang.addBlock(InitRockBlocks.POLISHED_TERRACOTTA_STAIRS, "Polished Terracotta Stairs");
                ecLang.addBlock(InitRockBlocks.POLISHED_TERRACOTTA_WALL, "Polished Terracotta Wall");
                ecLang.addBlock(InitRockBlocks.POLISHED_TERRACOTTA_PRESSURE_PLATE, "Polished Terracotta Pressure Plate");

                ecLang.addBlock(InitRockBlocks.TERRACOTTA_PAVING, "Terracotta Paving");
                ecLang.addBlock(InitRockBlocks.TERRACOTTA_PAVING_SLAB, "Terracotta Paving Slab");
                ecLang.addBlock(InitRockBlocks.TERRACOTTA_PAVING_STAIRS, "Terracotta Paving Stairs");
                ecLang.addBlock(InitRockBlocks.TERRACOTTA_PAVING_WALL, "Terracotta Paving Wall");
                ecLang.addBlock(InitRockBlocks.TERRACOTTA_PAVING_PRESSURE_PLATE, "Terracotta Paving Pressure Plate");

                ecLang.addBlock(InitRockBlocks.TERRACOTTA_TILES, "Terracotta Tiles");
                ecLang.addBlock(InitRockBlocks.TERRACOTTA_TILES_SLAB, "Terracotta Tiles Slab");
                ecLang.addBlock(InitRockBlocks.TERRACOTTA_TILES_STAIRS, "Terracotta Tiles Stairs");
                ecLang.addBlock(InitRockBlocks.TERRACOTTA_TILES_WALL, "Terracotta Tiles Wall");
                ecLang.addBlock(InitRockBlocks.TERRACOTTA_TILES_PRESSURE_PLATE, "Terracotta Tiles Pressure Plate");

                ecLang.addBlock(InitRockBlocks.TERRACOTTA_BRICKS, "Terracotta Bricks");
                ecLang.addBlock(InitRockBlocks.TERRACOTTA_BRICKS_SLAB, "Terracotta Bricks Slab");
                ecLang.addBlock(InitRockBlocks.TERRACOTTA_BRICKS_STAIRS, "Terracotta Bricks Stairs");
                ecLang.addBlock(InitRockBlocks.TERRACOTTA_BRICKS_WALL, "Terracotta Bricks Wall");
                ecLang.addBlock(InitRockBlocks.TERRACOTTA_BRICKS_PRESSURE_PLATE, "Terracotta Bricks Pressure Plate");

                ecLang.addBlock(InitRockBlocks.TERRACOTTA_LARGE_BRICKS, "Terracotta Large Bricks");
                ecLang.addBlock(InitRockBlocks.TERRACOTTA_LARGE_BRICKS_SLAB, "Terracotta Large Bricks Slab");
                ecLang.addBlock(InitRockBlocks.TERRACOTTA_LARGE_BRICKS_STAIRS, "Terracotta Large Bricks Stairs");
                ecLang.addBlock(InitRockBlocks.TERRACOTTA_LARGE_BRICKS_WALL, "Terracotta Large Bricks Wall");
                ecLang.addBlock(InitRockBlocks.TERRACOTTA_LARGE_BRICKS_PRESSURE_PLATE, "Terracotta Large Bricks Pressure Plate");

                ecLang.addBlock(InitRockBlocks.TERRACOTTA_PAVING_STONES, "Terracotta Paving Stones");
                ecLang.addBlock(InitRockBlocks.TERRACOTTA_PAVING_STONES_SLAB, "Terracotta Paving Stones Slab");
                ecLang.addBlock(InitRockBlocks.TERRACOTTA_PAVING_STONES_STAIRS, "Terracotta Paving Stones Stairs");
                ecLang.addBlock(InitRockBlocks.TERRACOTTA_PAVING_STONES_WALL, "Terracotta Paving Stones Wall");
                ecLang.addBlock(InitRockBlocks.TERRACOTTA_PAVING_STONES_PRESSURE_PLATE, "Terracotta Paving Stones Pressure Plate");

                ecLang.addBlock(InitRockBlocks.TERRACOTTA_ROOFTILES, "Terracotta Rooftiles");
                ecLang.addBlock(InitRockBlocks.TERRACOTTA_ROOFTILES_SLAB, "Terracotta Rooftiles Slab");
                ecLang.addBlock(InitRockBlocks.TERRACOTTA_ROOFTILES_STAIRS, "Terracotta Rooftiles Stairs");
                break;
            case "fr_fr":
                for(int j = 0; j < Arrays.stream(RockType.values()).count(); j++)
                {
                    // Rocks
                    ecLang.addBlock(InitRockBlocks.ROCK_BLOCKS.get(RockType.byId(j)), StringUtils.capitalise(RockType.byId(j).getFrName()));
                    ecLang.addBlock(InitRockBlocks.ROCK_STAIRS.get(RockType.byId(j)), "Escalier en " + RockType.byId(j).getFrName());
                    ecLang.addBlock(InitRockBlocks.ROCK_SLABS.get(RockType.byId(j)), "Dalle en " + RockType.byId(j).getFrName());
                    ecLang.addBlock(InitRockBlocks.ROCK_WALLS.get(RockType.byId(j)), "Muret en " + RockType.byId(j).getFrName());
                    ecLang.addBlock(InitRockBlocks.ROCK_PRESSURE_PLATES.get(RockType.byId(j)), "Plaque de pression en " + RockType.byId(j).getFrName());
                    ecLang.addBlock(InitRockBlocks.ROCK_BUTTONS.get(RockType.byId(j)), "Bouton en " + RockType.byId(j).getFrName());

                    // Cobbletones
                    String de = "de ";
                    if(RockType.byId(j).getFrName() == "ardoise")
                        de = "d'";

                    ecLang.addBlock(InitRockBlocks.ROCK_COBBLESTONES.get(RockType.byId(j)), "Pierres " + de + RockType.byId(j).getFrName());
                    ecLang.addBlock(InitRockBlocks.ROCK_COBBLESTONE_STAIRS.get(RockType.byId(j)), "Escalier en pierres " + de + RockType.byId(j).getFrName());
                    ecLang.addBlock(InitRockBlocks.ROCK_COBBLESTONE_SLABS.get(RockType.byId(j)), "Dalle en pierres " + de + RockType.byId(j).getFrName());
                    ecLang.addBlock(InitRockBlocks.ROCK_COBBLESTONE_WALLS.get(RockType.byId(j)), "Muret en pierres " + de + RockType.byId(j).getFrName());
                    ecLang.addBlock(InitRockBlocks.ROCK_COBBLESTONE_PRESSURE_PLATES.get(RockType.byId(j)), "Plaque de pression en pierres " + de + RockType.byId(j).getFrName());

                    // Cobblestone bricks
                    ecLang.addBlock(InitRockBlocks.ROCK_COBBLESTONE_BRICKS.get(RockType.byId(j)), "Briques de pierres " + de + RockType.byId(j).getFrName());
                    ecLang.addBlock(InitRockBlocks.ROCK_COBBLESTONE_BRICKS_STAIRS.get(RockType.byId(j)), "Escalier en briques de pierres " + de + RockType.byId(j).getFrName());
                    ecLang.addBlock(InitRockBlocks.ROCK_COBBLESTONE_BRICKS_SLABS.get(RockType.byId(j)), "Dalle en briques de pierres " + de + RockType.byId(j).getFrName());
                    ecLang.addBlock(InitRockBlocks.ROCK_COBBLESTONE_BRICKS_WALLS.get(RockType.byId(j)), "Muret en briques de pierres " + de + RockType.byId(j).getFrName());
                    ecLang.addBlock(InitRockBlocks.ROCK_COBBLESTONE_BRICKS_PRESSURE_PLATES.get(RockType.byId(j)), "Plaque de pression en briques de pierres " + de + RockType.byId(j).getFrName());

                    // Smooth rocks
                    ecLang.addBlock(InitRockBlocks.SMOOTH_ROCK_BLOCKS.get(RockType.byId(j)), StringUtils.capitalise(RockType.byId(j).getFrName()) + " lisse");
                    ecLang.addBlock(InitRockBlocks.SMOOTH_ROCK_STAIRS.get(RockType.byId(j)), "Escalier en " + RockType.byId(j).getFrName() + " lisse");
                    ecLang.addBlock(InitRockBlocks.SMOOTH_ROCK_SLABS.get(RockType.byId(j)), "Dalle en " + RockType.byId(j).getFrName() + " lisse");
                    ecLang.addBlock(InitRockBlocks.SMOOTH_ROCK_WALLS.get(RockType.byId(j)), "Muret en " + RockType.byId(j).getFrName() + " lisse");
                    ecLang.addBlock(InitRockBlocks.SMOOTH_ROCK_PRESSURE_PLATES.get(RockType.byId(j)), "Plaque de pression en " + RockType.byId(j).getFrName() + " lisse");

                    // Polished rocks
                    ecLang.addBlock(InitRockBlocks.POLISHED_ROCK_BLOCKS.get(RockType.byId(j)), StringUtils.capitalise(RockType.byId(j).getFrName()) + " poli");
                    ecLang.addBlock(InitRockBlocks.POLISHED_ROCK_STAIRS.get(RockType.byId(j)), "Escalier en " + RockType.byId(j).getFrName() + " poli");
                    ecLang.addBlock(InitRockBlocks.POLISHED_ROCK_SLABS.get(RockType.byId(j)), "Dalle en " + RockType.byId(j).getFrName() + " poli");
                    ecLang.addBlock(InitRockBlocks.POLISHED_ROCK_WALLS.get(RockType.byId(j)), "Muret en " + RockType.byId(j).getFrName() + " poli");
                    ecLang.addBlock(InitRockBlocks.POLISHED_ROCK_PRESSURE_PLATES.get(RockType.byId(j)), "Plaque de pression en " + RockType.byId(j).getFrName() + " poli");

                    // Rock pavings
                    ecLang.addBlock(InitRockBlocks.ROCK_PAVINGS.get(RockType.byId(j)), "Pavés " + de + RockType.byId(j).getFrName());
                    ecLang.addBlock(InitRockBlocks.ROCK_PAVING_STAIRS.get(RockType.byId(j)), "Escalier en pavé " + de + RockType.byId(j).getFrName());
                    ecLang.addBlock(InitRockBlocks.ROCK_PAVING_SLABS.get(RockType.byId(j)), "Dalle en pavé " + de + RockType.byId(j).getFrName());
                    ecLang.addBlock(InitRockBlocks.ROCK_PAVING_WALLS.get(RockType.byId(j)), "Muret en pavé " + de + RockType.byId(j).getFrName());
                    ecLang.addBlock(InitRockBlocks.ROCK_PAVING_PRESSURE_PLATES.get(RockType.byId(j)), "Plaque de pression en pavé " + de + RockType.byId(j).getFrName());

                    // Rock tiles
                    ecLang.addBlock(InitRockBlocks.ROCK_TILES.get(RockType.byId(j)), "Carrelage " + de + RockType.byId(j).getFrName());
                    ecLang.addBlock(InitRockBlocks.ROCK_TILES_STAIRS.get(RockType.byId(j)), "Escalier en carrelage " + de + RockType.byId(j).getFrName());
                    ecLang.addBlock(InitRockBlocks.ROCK_TILES_SLABS.get(RockType.byId(j)), "Dalle en carrelage " + de + RockType.byId(j).getFrName());
                    ecLang.addBlock(InitRockBlocks.ROCK_TILES_WALLS.get(RockType.byId(j)), "Muret en carrelage " + de + RockType.byId(j).getFrName());
                    ecLang.addBlock(InitRockBlocks.ROCK_TILES_PRESSURE_PLATES.get(RockType.byId(j)), "Plaque de pression en carrelage " + de + RockType.byId(j).getFrName());

                    // Rock bricks
                    ecLang.addBlock(InitRockBlocks.ROCK_BRICKS.get(RockType.byId(j)), "Briques " + de + RockType.byId(j).getFrName());
                    ecLang.addBlock(InitRockBlocks.ROCK_BRICKS_STAIRS.get(RockType.byId(j)), "Escalier en briques " + de + RockType.byId(j).getFrName());
                    ecLang.addBlock(InitRockBlocks.ROCK_BRICKS_SLABS.get(RockType.byId(j)), "Dalle en briques " + de + RockType.byId(j).getFrName());
                    ecLang.addBlock(InitRockBlocks.ROCK_BRICKS_WALLS.get(RockType.byId(j)), "Muret en briques " + de + RockType.byId(j).getFrName());
                    ecLang.addBlock(InitRockBlocks.ROCK_BRICKS_PRESSURE_PLATES.get(RockType.byId(j)), "Plaque de pression en briques " + de + RockType.byId(j).getFrName());

                    // Rock large bricks
                    ecLang.addBlock(InitRockBlocks.ROCK_LARGE_BRICKS.get(RockType.byId(j)), "Briques épaisses " + de + RockType.byId(j).getFrName());
                    ecLang.addBlock(InitRockBlocks.ROCK_LARGE_BRICKS_STAIRS.get(RockType.byId(j)), "Escalier en briques épaisses " + de + RockType.byId(j).getFrName());
                    ecLang.addBlock(InitRockBlocks.ROCK_LARGE_BRICKS_SLABS.get(RockType.byId(j)), "Dalle en briques épaisses " + de + RockType.byId(j).getFrName());
                    ecLang.addBlock(InitRockBlocks.ROCK_LARGE_BRICKS_WALLS.get(RockType.byId(j)), "Muret en briques épaisses " + de + RockType.byId(j).getFrName());
                    ecLang.addBlock(InitRockBlocks.ROCK_LARGE_BRICKS_PRESSURE_PLATES.get(RockType.byId(j)), "Plaque de pression en briques épaisses " + de + RockType.byId(j).getFrName());

                    // Rock paving stones
                    ecLang.addBlock(InitRockBlocks.ROCK_PAVING_STONES.get(RockType.byId(j)), "Pavage " + de + RockType.byId(j).getFrName());
                    ecLang.addBlock(InitRockBlocks.ROCK_PAVING_STONES_STAIRS.get(RockType.byId(j)), "Escalier en pavage " + de + RockType.byId(j).getFrName());
                    ecLang.addBlock(InitRockBlocks.ROCK_PAVING_STONES_SLABS.get(RockType.byId(j)), "Dalle en pavage " + de + RockType.byId(j).getFrName());
                    ecLang.addBlock(InitRockBlocks.ROCK_PAVING_STONES_WALLS.get(RockType.byId(j)), "Muret en pavage " + de + RockType.byId(j).getFrName());
                    ecLang.addBlock(InitRockBlocks.ROCK_PAVING_STONES_PRESSURE_PLATES.get(RockType.byId(j)), "Plaque de pression en pavage " + de + RockType.byId(j).getFrName());

                    // Rock ornaments
                    ecLang.addBlock(InitRockBlocks.ROCK_ORNAMENTS.get(RockType.byId(j)), "Ornement en " + RockType.byId(j).getFrName());
                    ecLang.addBlock(InitRockBlocks.ROCK_ORNAMENT_PRESSURE_PLATES.get(RockType.byId(j)), "Plaque de pression avec ornement en " + RockType.byId(j).getFrName());

                    // Rock rooftiles
                    ecLang.addBlock(InitRockBlocks.ROCK_ROOFTILES.get(RockType.byId(j)), "Tuiles " + de + RockType.byId(j).getFrName());
                    ecLang.addBlock(InitRockBlocks.ROCK_ROOFTILES_STAIRS.get(RockType.byId(j)), "Escalier en tuiles " + de + RockType.byId(j).getFrName());
                    ecLang.addBlock(InitRockBlocks.ROCK_ROOFTILES_SLABS.get(RockType.byId(j)), "Dalle en tuiles " + de + RockType.byId(j).getFrName());
                }

                ecLang.addBlock(InitRockBlocks.PAVING_STONES, "Pavage");
                ecLang.addBlock(InitRockBlocks.PAVING_STONES_SLAB, "Dalle en pavage");
                ecLang.addBlock(InitRockBlocks.PAVING_STONES_STAIRS, "Escalier en pavage");
                ecLang.addBlock(InitRockBlocks.PAVING_STONES_WALL, "Muret en pavage");
                ecLang.addBlock(InitRockBlocks.PAVING_STONES_PRESSURE_PLATE, "Plaque de pression en pavage");

                // Andesite
                ecLang.addBlock(InitRockBlocks.ANDESITE_BUTTON, "Bouton en andésite");

                ecLang.addBlock(InitRockBlocks.SMOOTH_ANDESITE, "Andésite lisse");
                ecLang.addBlock(InitRockBlocks.SMOOTH_ANDESITE_SLAB, "Dalle en andésite lisse");
                ecLang.addBlock(InitRockBlocks.SMOOTH_ANDESITE_STAIRS, "Escalier en andésite lisse");
                ecLang.addBlock(InitRockBlocks.SMOOTH_ANDESITE_WALL, "Muret en andésite lisse");
                ecLang.addBlock(InitRockBlocks.SMOOTH_ANDESITE_PRESSURE_PLATE, "Plaque de pression en andésite lisse");

                ecLang.addBlock(InitRockBlocks.ANDESITE_PAVING, "Pavés d'andésite");
                ecLang.addBlock(InitRockBlocks.ANDESITE_PAVING_SLAB, "Dalle en pavé d'andésite");
                ecLang.addBlock(InitRockBlocks.ANDESITE_PAVING_STAIRS, "Escalier en pavé d'andésite");
                ecLang.addBlock(InitRockBlocks.ANDESITE_PAVING_WALL, "Muret en pavé d'andésite");
                ecLang.addBlock(InitRockBlocks.ANDESITE_PAVING_PRESSURE_PLATE, "Plaque de pression en pavé d'andésite");

                ecLang.addBlock(InitRockBlocks.ANDESITE_TILES, "Carrelage d'andésite");
                ecLang.addBlock(InitRockBlocks.ANDESITE_TILES_SLAB, "Dalle en carrelage d'andésite");
                ecLang.addBlock(InitRockBlocks.ANDESITE_TILES_STAIRS, "Escalier en carrelage d'andésite");
                ecLang.addBlock(InitRockBlocks.ANDESITE_TILES_WALL, "Muret en carrelage d'andésite");
                ecLang.addBlock(InitRockBlocks.ANDESITE_TILES_PRESSURE_PLATE, "Plaque de pression en carrelage d'andésite");

                ecLang.addBlock(InitRockBlocks.ANDESITE_BRICKS, "Briques d'andésite");
                ecLang.addBlock(InitRockBlocks.ANDESITE_BRICKS_SLAB, "Dalle en briques d'andésite");
                ecLang.addBlock(InitRockBlocks.ANDESITE_BRICKS_STAIRS, "Escalier en briques d'andésite");
                ecLang.addBlock(InitRockBlocks.ANDESITE_BRICKS_WALL, "Muret en briques d'andésite");
                ecLang.addBlock(InitRockBlocks.ANDESITE_BRICKS_PRESSURE_PLATE, "Plaque de pression en briques d'andésite");

                ecLang.addBlock(InitRockBlocks.ANDESITE_LARGE_BRICKS, "Briques épaisses d'andésite");
                ecLang.addBlock(InitRockBlocks.ANDESITE_LARGE_BRICKS_SLAB, "Dalle en briques épaisses d'andésite");
                ecLang.addBlock(InitRockBlocks.ANDESITE_LARGE_BRICKS_STAIRS, "Escalier en briques épaisses d'andésite");
                ecLang.addBlock(InitRockBlocks.ANDESITE_LARGE_BRICKS_WALL, "Muret en briques épaisses d'andésite");
                ecLang.addBlock(InitRockBlocks.ANDESITE_LARGE_BRICKS_PRESSURE_PLATE, "Plaque de pression en briques épaisses d'andésite");

                ecLang.addBlock(InitRockBlocks.ANDESITE_PAVING_STONES, "Pavage d'andésite");
                ecLang.addBlock(InitRockBlocks.ANDESITE_PAVING_STONES_SLAB, "Dalle en pavage d'andésite");
                ecLang.addBlock(InitRockBlocks.ANDESITE_PAVING_STONES_STAIRS, "Escalier en pavage d'andésite");
                ecLang.addBlock(InitRockBlocks.ANDESITE_PAVING_STONES_WALL, "Muret en pavage d'andésite");
                ecLang.addBlock(InitRockBlocks.ANDESITE_PAVING_STONES_PRESSURE_PLATE, "Plaque de pression en pavage d'andésite");

                ecLang.addBlock(InitRockBlocks.ANDESITE_ORNAMENT, "Ornement en andésite");
                ecLang.addBlock(InitRockBlocks.ANDESITE_ORNAMENT_PRESSURE_PLATE, "Plaque de pression avec ornement en andésite");

                ecLang.addBlock(InitRockBlocks.ANDESITE_ROOFTILES, "Tuiles d'andésite");
                ecLang.addBlock(InitRockBlocks.ANDESITE_ROOFTILES_SLAB, "Dalle en tuile d'andésite");
                ecLang.addBlock(InitRockBlocks.ANDESITE_ROOFTILES_STAIRS, "Escalier en tuile d'andésite");

                // Diorite
                ecLang.addBlock(InitRockBlocks.DIORITE_BUTTON, "Bouton en diorite");

                ecLang.addBlock(InitRockBlocks.SMOOTH_DIORITE, "Diorite lisse");
                ecLang.addBlock(InitRockBlocks.SMOOTH_DIORITE_SLAB, "Dalle en diorite lisse");
                ecLang.addBlock(InitRockBlocks.SMOOTH_DIORITE_STAIRS, "Escalier en diorite lisse");
                ecLang.addBlock(InitRockBlocks.SMOOTH_DIORITE_WALL, "Muret en diorite lisse");
                ecLang.addBlock(InitRockBlocks.SMOOTH_DIORITE_PRESSURE_PLATE, "Plaque de pression en diorite lisse");

                ecLang.addBlock(InitRockBlocks.DIORITE_PAVING, "Pavés de diorite");
                ecLang.addBlock(InitRockBlocks.DIORITE_PAVING_SLAB, "Dalle en pavé de diorite");
                ecLang.addBlock(InitRockBlocks.DIORITE_PAVING_STAIRS, "Escalier en pavé de diorite");
                ecLang.addBlock(InitRockBlocks.DIORITE_PAVING_WALL, "Muret en pavé de diorite");
                ecLang.addBlock(InitRockBlocks.DIORITE_PAVING_PRESSURE_PLATE, "Plaque de pression en pavé de diorite");

                ecLang.addBlock(InitRockBlocks.DIORITE_TILES, "Carrelage de diorite");
                ecLang.addBlock(InitRockBlocks.DIORITE_TILES_SLAB, "Dalle en carrelage de diorite");
                ecLang.addBlock(InitRockBlocks.DIORITE_TILES_STAIRS, "Escalier en carrelage de diorite");
                ecLang.addBlock(InitRockBlocks.DIORITE_TILES_WALL, "Muret en carrelage de diorite");
                ecLang.addBlock(InitRockBlocks.DIORITE_TILES_PRESSURE_PLATE, "Plaque de pression en carrelage de diorite");

                ecLang.addBlock(InitRockBlocks.DIORITE_BRICKS, "Briques de diorite");
                ecLang.addBlock(InitRockBlocks.DIORITE_BRICKS_SLAB, "Dalle en briques de diorite");
                ecLang.addBlock(InitRockBlocks.DIORITE_BRICKS_STAIRS, "Escalier en briques de diorite");
                ecLang.addBlock(InitRockBlocks.DIORITE_BRICKS_WALL, "Muret en briques de diorite");
                ecLang.addBlock(InitRockBlocks.DIORITE_BRICKS_PRESSURE_PLATE, "Plaque de pression en briques de diorite");

                ecLang.addBlock(InitRockBlocks.DIORITE_LARGE_BRICKS, "Briques épaisses de diorite");
                ecLang.addBlock(InitRockBlocks.DIORITE_LARGE_BRICKS_SLAB, "Dalle en briques épaisses de diorite");
                ecLang.addBlock(InitRockBlocks.DIORITE_LARGE_BRICKS_STAIRS, "Escalier en briques épaisses de diorite");
                ecLang.addBlock(InitRockBlocks.DIORITE_LARGE_BRICKS_WALL, "Muret en briques épaisses de diorite");
                ecLang.addBlock(InitRockBlocks.DIORITE_LARGE_BRICKS_PRESSURE_PLATE, "Plaque de pression en briques épaisses de diorite");

                ecLang.addBlock(InitRockBlocks.DIORITE_PAVING_STONES, "Pavage de diorite");
                ecLang.addBlock(InitRockBlocks.DIORITE_PAVING_STONES_SLAB, "Dalle en pavage de diorite");
                ecLang.addBlock(InitRockBlocks.DIORITE_PAVING_STONES_STAIRS, "Escalier en pavage de diorite");
                ecLang.addBlock(InitRockBlocks.DIORITE_PAVING_STONES_WALL, "Muret en pavage de diorite");
                ecLang.addBlock(InitRockBlocks.DIORITE_PAVING_STONES_PRESSURE_PLATE, "Plaque de pression en pavage de diorite");

                ecLang.addBlock(InitRockBlocks.DIORITE_ORNAMENT, "Ornement en diorite");
                ecLang.addBlock(InitRockBlocks.DIORITE_ORNAMENT_PRESSURE_PLATE, "Plaque de pression avec ornement en diorite");

                ecLang.addBlock(InitRockBlocks.DIORITE_ROOFTILES, "Tuiles de diorite");
                ecLang.addBlock(InitRockBlocks.DIORITE_ROOFTILES_SLAB, "Dalle en tuile de diorite");
                ecLang.addBlock(InitRockBlocks.DIORITE_ROOFTILES_STAIRS, "Escalier en tuile de diorite");

                // Granite
                ecLang.addBlock(InitRockBlocks.GRANITE_BUTTON, "Bouton en granite");

                ecLang.addBlock(InitRockBlocks.SMOOTH_GRANITE, "Granite lisse");
                ecLang.addBlock(InitRockBlocks.SMOOTH_GRANITE_SLAB, "Dalle en granite lisse");
                ecLang.addBlock(InitRockBlocks.SMOOTH_GRANITE_STAIRS, "Escalier en granite lisse");
                ecLang.addBlock(InitRockBlocks.SMOOTH_GRANITE_WALL, "Muret en granite lisse");
                ecLang.addBlock(InitRockBlocks.SMOOTH_GRANITE_PRESSURE_PLATE, "Plaque de pression en granite lisse");

                ecLang.addBlock(InitRockBlocks.GRANITE_PAVING, "Pavés de granite");
                ecLang.addBlock(InitRockBlocks.GRANITE_PAVING_SLAB, "Dalle en pavé de granite");
                ecLang.addBlock(InitRockBlocks.GRANITE_PAVING_STAIRS, "Escalier en pavé de granite");
                ecLang.addBlock(InitRockBlocks.GRANITE_PAVING_WALL, "Muret en pavé de granite");
                ecLang.addBlock(InitRockBlocks.GRANITE_PAVING_PRESSURE_PLATE, "Plaque de pression en pavé de granite");

                ecLang.addBlock(InitRockBlocks.GRANITE_TILES, "Carrelage de granite");
                ecLang.addBlock(InitRockBlocks.GRANITE_TILES_SLAB, "Dalle en carrelage de granite");
                ecLang.addBlock(InitRockBlocks.GRANITE_TILES_STAIRS, "Escalier en carrelage de granite");
                ecLang.addBlock(InitRockBlocks.GRANITE_TILES_WALL, "Muret en carrelage de granite");
                ecLang.addBlock(InitRockBlocks.GRANITE_TILES_PRESSURE_PLATE, "Plaque de pression en carrelage de granite");

                ecLang.addBlock(InitRockBlocks.GRANITE_BRICKS, "Briques de granite");
                ecLang.addBlock(InitRockBlocks.GRANITE_BRICKS_SLAB, "Dalle en briques de granite");
                ecLang.addBlock(InitRockBlocks.GRANITE_BRICKS_STAIRS, "Escalier en briques de granite");
                ecLang.addBlock(InitRockBlocks.GRANITE_BRICKS_WALL, "Muret en briques de granite");
                ecLang.addBlock(InitRockBlocks.GRANITE_BRICKS_PRESSURE_PLATE, "Plaque de pression en briques de granite");

                ecLang.addBlock(InitRockBlocks.GRANITE_LARGE_BRICKS, "Briques épaisses de granite");
                ecLang.addBlock(InitRockBlocks.GRANITE_LARGE_BRICKS_SLAB, "Dalle en briques épaisses de granite");
                ecLang.addBlock(InitRockBlocks.GRANITE_LARGE_BRICKS_STAIRS, "Escalier en briques épaisses de granite");
                ecLang.addBlock(InitRockBlocks.GRANITE_LARGE_BRICKS_WALL, "Muret en briques épaisses de granite");
                ecLang.addBlock(InitRockBlocks.GRANITE_LARGE_BRICKS_PRESSURE_PLATE, "Plaque de pression en briques épaisses de granite");

                ecLang.addBlock(InitRockBlocks.GRANITE_PAVING_STONES, "Pavage de granite");
                ecLang.addBlock(InitRockBlocks.GRANITE_PAVING_STONES_SLAB, "Dalle en pavage de granite");
                ecLang.addBlock(InitRockBlocks.GRANITE_PAVING_STONES_STAIRS, "Escalier en pavage de granite");
                ecLang.addBlock(InitRockBlocks.GRANITE_PAVING_STONES_WALL, "Muret en pavage de granite");
                ecLang.addBlock(InitRockBlocks.GRANITE_PAVING_STONES_PRESSURE_PLATE, "Plaque de pression en pavage de granite");

                ecLang.addBlock(InitRockBlocks.GRANITE_ORNAMENT, "Ornement en granite");
                ecLang.addBlock(InitRockBlocks.GRANITE_ORNAMENT_PRESSURE_PLATE, "Plaque de pression avec ornement en granite");

                ecLang.addBlock(InitRockBlocks.GRANITE_ROOFTILES, "Tuiles de granite");
                ecLang.addBlock(InitRockBlocks.GRANITE_ROOFTILES_SLAB, "Dalle en tuile de granite");
                ecLang.addBlock(InitRockBlocks.GRANITE_ROOFTILES_STAIRS, "Escalier en tuile de granite");

                // Sandstone
                ecLang.addBlock(InitRockBlocks.SANDSTONE_BUTTON, "Bouton en grès");

                ecLang.addBlock(InitRockBlocks.SMOOTH_SANDSTONE_WALL, "Muret de grès lisse");
                ecLang.addBlock(InitRockBlocks.SMOOTH_SANDSTONE_PRESSURE_PLATE, "Plaque de pression en grès lisse");

                ecLang.addBlock(InitRockBlocks.POLISHED_SANDSTONE, "Grès poli");
                ecLang.addBlock(InitRockBlocks.POLISHED_SANDSTONE_SLAB, "Dalle de grès poli");
                ecLang.addBlock(InitRockBlocks.POLISHED_SANDSTONE_STAIRS, "Escalier en grès poli");
                ecLang.addBlock(InitRockBlocks.POLISHED_SANDSTONE_WALL, "Muret en grès poli");
                ecLang.addBlock(InitRockBlocks.POLISHED_SANDSTONE_PRESSURE_PLATE, "Plaque de pression en grès poli");

                ecLang.addBlock(InitRockBlocks.SANDSTONE_PAVING, "Pavés de grès");
                ecLang.addBlock(InitRockBlocks.SANDSTONE_PAVING_SLAB, "Dalle en pavés de grès");
                ecLang.addBlock(InitRockBlocks.SANDSTONE_PAVING_STAIRS, "Escalier en pavés de grès");
                ecLang.addBlock(InitRockBlocks.SANDSTONE_PAVING_WALL, "Muret en pavés de grès");
                ecLang.addBlock(InitRockBlocks.SANDSTONE_PAVING_PRESSURE_PLATE, "Plaque de pression en pavés de grès");

                ecLang.addBlock(InitRockBlocks.SANDSTONE_TILES, "Carrelage en grès");
                ecLang.addBlock(InitRockBlocks.SANDSTONE_TILES_SLAB, "Dalle en carrelage de grès");
                ecLang.addBlock(InitRockBlocks.SANDSTONE_TILES_STAIRS, "Escalier en carrelage de grès");
                ecLang.addBlock(InitRockBlocks.SANDSTONE_TILES_WALL, "Muret en carrelage de grès");
                ecLang.addBlock(InitRockBlocks.SANDSTONE_TILES_PRESSURE_PLATE, "Plaque de pression en carrelage de grès");

                ecLang.addBlock(InitRockBlocks.SANDSTONE_BRICKS, "Briques de grès");
                ecLang.addBlock(InitRockBlocks.SANDSTONE_BRICKS_SLAB, "Dalle en briques de grès");
                ecLang.addBlock(InitRockBlocks.SANDSTONE_BRICKS_STAIRS, "Escaliers en briques de grès");
                ecLang.addBlock(InitRockBlocks.SANDSTONE_BRICKS_WALL, "Muret en briques de grès");
                ecLang.addBlock(InitRockBlocks.SANDSTONE_BRICKS_PRESSURE_PLATE, "Dalle de pression en briques de grès");

                ecLang.addBlock(InitRockBlocks.SANDSTONE_LARGE_BRICKS, "Briques épaisses de grès");
                ecLang.addBlock(InitRockBlocks.SANDSTONE_LARGE_BRICKS_SLAB, "Dalle en briques épaisses de grès");
                ecLang.addBlock(InitRockBlocks.SANDSTONE_LARGE_BRICKS_STAIRS, "Escaliers en briques épaisses de grès");
                ecLang.addBlock(InitRockBlocks.SANDSTONE_LARGE_BRICKS_WALL, "Muret en briques épaisses de grès");
                ecLang.addBlock(InitRockBlocks.SANDSTONE_LARGE_BRICKS_PRESSURE_PLATE, "Dalle de pression en briques épaisses de grès");

                ecLang.addBlock(InitRockBlocks.SANDSTONE_PAVING_STONES, "Pavage de grès");
                ecLang.addBlock(InitRockBlocks.SANDSTONE_PAVING_STONES_SLAB, "Dalle en pavages de grès");
                ecLang.addBlock(InitRockBlocks.SANDSTONE_PAVING_STONES_STAIRS, "Escalier en pavages de grès");
                ecLang.addBlock(InitRockBlocks.SANDSTONE_PAVING_STONES_WALL, "Muret en pavages de grès");
                ecLang.addBlock(InitRockBlocks.SANDSTONE_PAVING_STONES_PRESSURE_PLATE, "Plaque de pression en pavages de grès");

                ecLang.addBlock(InitRockBlocks.SANDSTONE_ROOFTILES, "Tuiles de grès");
                ecLang.addBlock(InitRockBlocks.SANDSTONE_ROOFTILES_SLAB, "Dalle en tuile de grès");
                ecLang.addBlock(InitRockBlocks.SANDSTONE_ROOFTILES_STAIRS, "Escalier en tuile de grès");

                // Red Sandstone
                ecLang.addBlock(InitRockBlocks.RED_SANDSTONE_BUTTON, "Bouton en grès rouge");

                ecLang.addBlock(InitRockBlocks.SMOOTH_RED_SANDSTONE_WALL, "Muret de grès rouge lisse");
                ecLang.addBlock(InitRockBlocks.SMOOTH_RED_SANDSTONE_PRESSURE_PLATE, "Plaque de pression en grès rouge lisse");

                ecLang.addBlock(InitRockBlocks.POLISHED_RED_SANDSTONE, "Grès poli");
                ecLang.addBlock(InitRockBlocks.POLISHED_RED_SANDSTONE_SLAB, "Dalle de grès rouge poli");
                ecLang.addBlock(InitRockBlocks.POLISHED_RED_SANDSTONE_STAIRS, "Escalier en grès rouge poli");
                ecLang.addBlock(InitRockBlocks.POLISHED_RED_SANDSTONE_WALL, "Muret en grès rouge poli");
                ecLang.addBlock(InitRockBlocks.POLISHED_RED_SANDSTONE_PRESSURE_PLATE, "Plaque de pression en grès rouge poli");

                ecLang.addBlock(InitRockBlocks.RED_SANDSTONE_PAVING, "Pavés de grès rouge");
                ecLang.addBlock(InitRockBlocks.RED_SANDSTONE_PAVING_SLAB, "Dalle en pavés de grès rouge");
                ecLang.addBlock(InitRockBlocks.RED_SANDSTONE_PAVING_STAIRS, "Escalier en pavés de grès rouge");
                ecLang.addBlock(InitRockBlocks.RED_SANDSTONE_PAVING_WALL, "Muret en pavés de grès rouge");
                ecLang.addBlock(InitRockBlocks.RED_SANDSTONE_PAVING_PRESSURE_PLATE, "Plaque de pression en pavés de grès rouge");

                ecLang.addBlock(InitRockBlocks.RED_SANDSTONE_TILES, "Carrelage en grès rouge");
                ecLang.addBlock(InitRockBlocks.RED_SANDSTONE_TILES_SLAB, "Dalle en carrelage de grès rouge");
                ecLang.addBlock(InitRockBlocks.RED_SANDSTONE_TILES_STAIRS, "Escalier en carrelage de grès rouge");
                ecLang.addBlock(InitRockBlocks.RED_SANDSTONE_TILES_WALL, "Muret en carrelage de grès rouge");
                ecLang.addBlock(InitRockBlocks.RED_SANDSTONE_TILES_PRESSURE_PLATE, "Plaque de pression en carrelage de grès rouge");

                ecLang.addBlock(InitRockBlocks.RED_SANDSTONE_BRICKS, "Briques de grès rouge");
                ecLang.addBlock(InitRockBlocks.RED_SANDSTONE_BRICKS_SLAB, "Dalle en briques de grès rouge");
                ecLang.addBlock(InitRockBlocks.RED_SANDSTONE_BRICKS_STAIRS, "Escaliers en briques de grès rouge");
                ecLang.addBlock(InitRockBlocks.RED_SANDSTONE_BRICKS_WALL, "Muret en briques de grès rouge");
                ecLang.addBlock(InitRockBlocks.RED_SANDSTONE_BRICKS_PRESSURE_PLATE, "Dalle de pression en briques de grès rouge");

                ecLang.addBlock(InitRockBlocks.RED_SANDSTONE_LARGE_BRICKS, "Briques épaisses de grès rouge");
                ecLang.addBlock(InitRockBlocks.RED_SANDSTONE_LARGE_BRICKS_SLAB, "Dalle en briques épaisses de grès rouge");
                ecLang.addBlock(InitRockBlocks.RED_SANDSTONE_LARGE_BRICKS_STAIRS, "Escaliers en briques épaisses de grès rouge");
                ecLang.addBlock(InitRockBlocks.RED_SANDSTONE_LARGE_BRICKS_WALL, "Muret en briques épaisses de grès rouge");
                ecLang.addBlock(InitRockBlocks.RED_SANDSTONE_LARGE_BRICKS_PRESSURE_PLATE, "Dalle de pression en briques épaisses de grès rouge");

                ecLang.addBlock(InitRockBlocks.RED_SANDSTONE_PAVING_STONES, "Pavage de grès rouge");
                ecLang.addBlock(InitRockBlocks.RED_SANDSTONE_PAVING_STONES_SLAB, "Dalle en pavages de grès rouge");
                ecLang.addBlock(InitRockBlocks.RED_SANDSTONE_PAVING_STONES_STAIRS, "Escalier en pavages de grès rouge");
                ecLang.addBlock(InitRockBlocks.RED_SANDSTONE_PAVING_STONES_WALL, "Muret en pavages de grès rouge");
                ecLang.addBlock(InitRockBlocks.RED_SANDSTONE_PAVING_STONES_PRESSURE_PLATE, "Plaque de pression en pavages de grès rouge");

                ecLang.addBlock(InitRockBlocks.RED_SANDSTONE_ROOFTILES, "Tuiles de grès rouge");
                ecLang.addBlock(InitRockBlocks.RED_SANDSTONE_ROOFTILES_SLAB, "Dalle en tuile de grès rouge");
                ecLang.addBlock(InitRockBlocks.RED_SANDSTONE_ROOFTILES_STAIRS, "Escalier en tuile de grès rouge");

                // Basalt
                ecLang.addBlock(InitRockBlocks.TERRACOTTA_SLAB, "Dalle en terre cuite");
                ecLang.addBlock(InitRockBlocks.TERRACOTTA_STAIRS, "Escalier en terre cuite");
                ecLang.addBlock(InitRockBlocks.TERRACOTTA_WALL, "Muret en terre cuite");
                ecLang.addBlock(InitRockBlocks.TERRACOTTA_PRESSURE_PLATE, "Plaque de pression en terre cuite");
                ecLang.addBlock(InitRockBlocks.TERRACOTTA_BUTTON, "Bouton en terre cuite");

                ecLang.addBlock(InitRockBlocks.POLISHED_TERRACOTTA, "Terre cuite polie");
                ecLang.addBlock(InitRockBlocks.POLISHED_TERRACOTTA_SLAB, "Dalle en terre cuite polie");
                ecLang.addBlock(InitRockBlocks.POLISHED_TERRACOTTA_STAIRS, "Escalier en terre cuite polie");
                ecLang.addBlock(InitRockBlocks.POLISHED_TERRACOTTA_WALL, "Muret en terre cuite polie");
                ecLang.addBlock(InitRockBlocks.POLISHED_TERRACOTTA_PRESSURE_PLATE, "Plaque de pression en terre cuite polie");

                ecLang.addBlock(InitRockBlocks.TERRACOTTA_PAVING, "Pavés en terre cuite");
                ecLang.addBlock(InitRockBlocks.TERRACOTTA_PAVING_SLAB, "Dalle en pavé de terre cuite");
                ecLang.addBlock(InitRockBlocks.TERRACOTTA_PAVING_STAIRS, "Escalier en pavé de terre cuite");
                ecLang.addBlock(InitRockBlocks.TERRACOTTA_PAVING_WALL, "Muret en pavé de terre cuite");
                ecLang.addBlock(InitRockBlocks.TERRACOTTA_PAVING_PRESSURE_PLATE, "Plaque de pression en pavé de terre cuite");

                ecLang.addBlock(InitRockBlocks.TERRACOTTA_TILES, "Carrelage en terre cuite");
                ecLang.addBlock(InitRockBlocks.TERRACOTTA_TILES_SLAB, "Dalle en carrelage de terre cuite");
                ecLang.addBlock(InitRockBlocks.TERRACOTTA_TILES_STAIRS, "Escalier en carrelage de terre cuite");
                ecLang.addBlock(InitRockBlocks.TERRACOTTA_TILES_WALL, "Muret en carrelage de terre cuite");
                ecLang.addBlock(InitRockBlocks.TERRACOTTA_TILES_PRESSURE_PLATE, "Plaque de pression en carrelage de terre cuite");

                ecLang.addBlock(InitRockBlocks.TERRACOTTA_BRICKS, "Briques en terre cuite");
                ecLang.addBlock(InitRockBlocks.TERRACOTTA_BRICKS_SLAB, "Dalle en briques de terre cuite");
                ecLang.addBlock(InitRockBlocks.TERRACOTTA_BRICKS_STAIRS, "Escalier en briques de terre cuite");
                ecLang.addBlock(InitRockBlocks.TERRACOTTA_BRICKS_WALL, "Muret en briques de terre cuite");
                ecLang.addBlock(InitRockBlocks.TERRACOTTA_BRICKS_PRESSURE_PLATE, "Plaque de pression en briques de terre cuite");

                ecLang.addBlock(InitRockBlocks.TERRACOTTA_LARGE_BRICKS, "Briques épaisses en terre cuite");
                ecLang.addBlock(InitRockBlocks.TERRACOTTA_LARGE_BRICKS_SLAB, "Dalle en briques épaisses de terre cuite");
                ecLang.addBlock(InitRockBlocks.TERRACOTTA_LARGE_BRICKS_STAIRS, "Escalier en briques épaisses de terre cuite");
                ecLang.addBlock(InitRockBlocks.TERRACOTTA_LARGE_BRICKS_WALL, "Muret en briques épaisses de terre cuite");
                ecLang.addBlock(InitRockBlocks.TERRACOTTA_LARGE_BRICKS_PRESSURE_PLATE, "Plaque de pression en briques épaisses de terre cuite");

                ecLang.addBlock(InitRockBlocks.TERRACOTTA_PAVING_STONES, "Pavage en terre cuite");
                ecLang.addBlock(InitRockBlocks.TERRACOTTA_PAVING_STONES_SLAB, "Dalle en pavage de terre cuite");
                ecLang.addBlock(InitRockBlocks.TERRACOTTA_PAVING_STONES_STAIRS, "Escalier en pavage de terre cuite");
                ecLang.addBlock(InitRockBlocks.TERRACOTTA_PAVING_STONES_WALL, "Muret en pavage de terre cuite");
                ecLang.addBlock(InitRockBlocks.TERRACOTTA_PAVING_STONES_PRESSURE_PLATE, "Plaque de pression en pavage de terre cuite");

                ecLang.addBlock(InitRockBlocks.TERRACOTTA_ROOFTILES, "Tuiles de terre cuite");
                ecLang.addBlock(InitRockBlocks.TERRACOTTA_ROOFTILES_SLAB, "Dalle en tuile de terre cuite");
                ecLang.addBlock(InitRockBlocks.TERRACOTTA_ROOFTILES_STAIRS, "Escalier en tuile de terre cuite");
        }
    }
}