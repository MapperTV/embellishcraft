package tv.mapper.embellishcraft.rocks.data;

import java.util.Arrays;

import org.codehaus.plexus.util.StringUtils;

import tv.mapper.embellishcraft.core.data.ECLang;
import tv.mapper.embellishcraft.core.util.RockType;
import tv.mapper.embellishcraft.rocks.block.InitRockBlocks;

public class RockLang
{
    public static void addTranslations(ECLang provider, String lang)
    {
        switch(lang)
        {
            default:
            case "en_us":
                for(int j = 0; j < Arrays.stream(RockType.values()).count(); j++)
                {
                    // Rocks
                    provider.add(InitRockBlocks.ROCK_BLOCKS.get(RockType.byId(j)).get(), StringUtils.capitalise(RockType.byId(j).getName()));
                    provider.add(InitRockBlocks.ROCK_STAIRS.get(RockType.byId(j)).get(), StringUtils.capitalise(RockType.byId(j).getName()) + " Stairs");
                    provider.add(InitRockBlocks.ROCK_SLABS.get(RockType.byId(j)).get(), StringUtils.capitalise(RockType.byId(j).getName()) + " Slab");
                    provider.add(InitRockBlocks.ROCK_WALLS.get(RockType.byId(j)).get(), StringUtils.capitalise(RockType.byId(j).getName()) + " Wall");
                    provider.add(InitRockBlocks.ROCK_PRESSURE_PLATES.get(RockType.byId(j)).get(), StringUtils.capitalise(RockType.byId(j).getName()) + " Pressure Plate");
                    provider.add(InitRockBlocks.ROCK_BUTTONS.get(RockType.byId(j)).get(), StringUtils.capitalise(RockType.byId(j).getName()) + " Button");

                    // Cobbletones
                    provider.add(InitRockBlocks.ROCK_COBBLESTONES.get(RockType.byId(j)).get(), StringUtils.capitalise(RockType.byId(j).getName()) + " Cobblestone");
                    provider.add(InitRockBlocks.ROCK_COBBLESTONE_STAIRS.get(RockType.byId(j)).get(), StringUtils.capitalise(RockType.byId(j).getName()) + " Cobblestone Stairs");
                    provider.add(InitRockBlocks.ROCK_COBBLESTONE_SLABS.get(RockType.byId(j)).get(), StringUtils.capitalise(RockType.byId(j).getName()) + " Cobblestone Slab");
                    provider.add(InitRockBlocks.ROCK_COBBLESTONE_WALLS.get(RockType.byId(j)).get(), StringUtils.capitalise(RockType.byId(j).getName()) + " Cobblestone Wall");
                    provider.add(InitRockBlocks.ROCK_COBBLESTONE_PRESSURE_PLATES.get(RockType.byId(j)).get(), StringUtils.capitalise(RockType.byId(j).getName()) + " Cobblestone Pressure Plate");

                    // Cobbletone bricks
                    provider.add(InitRockBlocks.ROCK_COBBLESTONE_BRICKS.get(RockType.byId(j)).get(), StringUtils.capitalise(RockType.byId(j).getName()) + " Cobblestone Bricks");
                    provider.add(InitRockBlocks.ROCK_COBBLESTONE_BRICKS_STAIRS.get(RockType.byId(j)).get(), StringUtils.capitalise(RockType.byId(j).getName()) + " Cobblestone Bricks Stairs");
                    provider.add(InitRockBlocks.ROCK_COBBLESTONE_BRICKS_SLABS.get(RockType.byId(j)).get(), StringUtils.capitalise(RockType.byId(j).getName()) + " Cobblestone Bricks Slab");
                    provider.add(InitRockBlocks.ROCK_COBBLESTONE_BRICKS_WALLS.get(RockType.byId(j)).get(), StringUtils.capitalise(RockType.byId(j).getName()) + " Cobblestone Bricks Wall");
                    provider.add(InitRockBlocks.ROCK_COBBLESTONE_BRICKS_PRESSURE_PLATES.get(RockType.byId(j)).get(), StringUtils.capitalise(RockType.byId(j).getName()) + " Cobblestone Bricks Pressure Plate");

                    // Smooth rocks
                    provider.add(InitRockBlocks.SMOOTH_ROCK_BLOCKS.get(RockType.byId(j)).get(), "Smooth " + StringUtils.capitalise(RockType.byId(j).getName()));
                    provider.add(InitRockBlocks.SMOOTH_ROCK_STAIRS.get(RockType.byId(j)).get(), "Smooth " + StringUtils.capitalise(RockType.byId(j).getName()) + " Stairs");
                    provider.add(InitRockBlocks.SMOOTH_ROCK_SLABS.get(RockType.byId(j)).get(), "Smooth " + StringUtils.capitalise(RockType.byId(j).getName()) + " Slab");
                    provider.add(InitRockBlocks.SMOOTH_ROCK_WALLS.get(RockType.byId(j)).get(), "Smooth " + StringUtils.capitalise(RockType.byId(j).getName()) + " Wall");
                    provider.add(InitRockBlocks.SMOOTH_ROCK_PRESSURE_PLATES.get(RockType.byId(j)).get(), "Smooth " + StringUtils.capitalise(RockType.byId(j).getName()) + " Pressure Plate");

                    // Polished rocks
                    provider.add(InitRockBlocks.POLISHED_ROCK_BLOCKS.get(RockType.byId(j)).get(), "Polished " + StringUtils.capitalise(RockType.byId(j).getName()));
                    provider.add(InitRockBlocks.POLISHED_ROCK_STAIRS.get(RockType.byId(j)).get(), "Polished " + StringUtils.capitalise(RockType.byId(j).getName()) + " Stairs");
                    provider.add(InitRockBlocks.POLISHED_ROCK_SLABS.get(RockType.byId(j)).get(), "Polished " + StringUtils.capitalise(RockType.byId(j).getName()) + " Slab");
                    provider.add(InitRockBlocks.POLISHED_ROCK_WALLS.get(RockType.byId(j)).get(), "Polished " + StringUtils.capitalise(RockType.byId(j).getName()) + " Wall");
                    provider.add(InitRockBlocks.POLISHED_ROCK_PRESSURE_PLATES.get(RockType.byId(j)).get(), "Polished " + StringUtils.capitalise(RockType.byId(j).getName()) + " Pressure Plate");

                    // Rock pavings
                    provider.add(InitRockBlocks.ROCK_PAVINGS.get(RockType.byId(j)).get(), StringUtils.capitalise(RockType.byId(j).getName()) + " Paving");
                    provider.add(InitRockBlocks.ROCK_PAVING_STAIRS.get(RockType.byId(j)).get(), StringUtils.capitalise(RockType.byId(j).getName()) + " Paving Stairs");
                    provider.add(InitRockBlocks.ROCK_PAVING_SLABS.get(RockType.byId(j)).get(), StringUtils.capitalise(RockType.byId(j).getName()) + " Paving Slab");
                    provider.add(InitRockBlocks.ROCK_PAVING_WALLS.get(RockType.byId(j)).get(), StringUtils.capitalise(RockType.byId(j).getName()) + " Paving Wall");
                    provider.add(InitRockBlocks.ROCK_PAVING_PRESSURE_PLATES.get(RockType.byId(j)).get(), StringUtils.capitalise(RockType.byId(j).getName()) + " Paving Pressure Plate");

                    // Rock tiles
                    provider.add(InitRockBlocks.ROCK_TILES.get(RockType.byId(j)).get(), StringUtils.capitalise(RockType.byId(j).getName()) + " Tiles");
                    provider.add(InitRockBlocks.ROCK_TILES_STAIRS.get(RockType.byId(j)).get(), StringUtils.capitalise(RockType.byId(j).getName()) + " Tiles Stairs");
                    provider.add(InitRockBlocks.ROCK_TILES_SLABS.get(RockType.byId(j)).get(), StringUtils.capitalise(RockType.byId(j).getName()) + " Tiles Slab");
                    provider.add(InitRockBlocks.ROCK_TILES_WALLS.get(RockType.byId(j)).get(), StringUtils.capitalise(RockType.byId(j).getName()) + " Tiles Wall");
                    provider.add(InitRockBlocks.ROCK_TILES_PRESSURE_PLATES.get(RockType.byId(j)).get(), StringUtils.capitalise(RockType.byId(j).getName()) + " Tiles Pressure Plate");

                    // Rock bricks
                    provider.add(InitRockBlocks.ROCK_BRICKS.get(RockType.byId(j)).get(), StringUtils.capitalise(RockType.byId(j).getName()) + " Bricks");
                    provider.add(InitRockBlocks.ROCK_BRICKS_STAIRS.get(RockType.byId(j)).get(), StringUtils.capitalise(RockType.byId(j).getName()) + " Bricks Stairs");
                    provider.add(InitRockBlocks.ROCK_BRICKS_SLABS.get(RockType.byId(j)).get(), StringUtils.capitalise(RockType.byId(j).getName()) + " Bricks Slab");
                    provider.add(InitRockBlocks.ROCK_BRICKS_WALLS.get(RockType.byId(j)).get(), StringUtils.capitalise(RockType.byId(j).getName()) + " Bricks Wall");
                    provider.add(InitRockBlocks.ROCK_BRICKS_PRESSURE_PLATES.get(RockType.byId(j)).get(), StringUtils.capitalise(RockType.byId(j).getName()) + " Bricks Pressure Plate");

                    // Rock large bricks
                    provider.add(InitRockBlocks.ROCK_LARGE_BRICKS.get(RockType.byId(j)).get(), StringUtils.capitalise(RockType.byId(j).getName()) + " Large Bricks");
                    provider.add(InitRockBlocks.ROCK_LARGE_BRICKS_STAIRS.get(RockType.byId(j)).get(), StringUtils.capitalise(RockType.byId(j).getName()) + " Large Bricks Stairs");
                    provider.add(InitRockBlocks.ROCK_LARGE_BRICKS_SLABS.get(RockType.byId(j)).get(), StringUtils.capitalise(RockType.byId(j).getName()) + " Large Bricks Slab");
                    provider.add(InitRockBlocks.ROCK_LARGE_BRICKS_WALLS.get(RockType.byId(j)).get(), StringUtils.capitalise(RockType.byId(j).getName()) + " Large Bricks Wall");
                    provider.add(InitRockBlocks.ROCK_LARGE_BRICKS_PRESSURE_PLATES.get(RockType.byId(j)).get(), StringUtils.capitalise(RockType.byId(j).getName()) + " Large Bricks Pressure Plate");

                    // Rock paving stones
                    provider.add(InitRockBlocks.ROCK_PAVING_STONES.get(RockType.byId(j)).get(), StringUtils.capitalise(RockType.byId(j).getName()) + " Paving Stones");
                    provider.add(InitRockBlocks.ROCK_PAVING_STONES_STAIRS.get(RockType.byId(j)).get(), StringUtils.capitalise(RockType.byId(j).getName()) + " Paving Stones Stairs");
                    provider.add(InitRockBlocks.ROCK_PAVING_STONES_SLABS.get(RockType.byId(j)).get(), StringUtils.capitalise(RockType.byId(j).getName()) + " Paving Stones Slab");
                    provider.add(InitRockBlocks.ROCK_PAVING_STONES_WALLS.get(RockType.byId(j)).get(), StringUtils.capitalise(RockType.byId(j).getName()) + " Paving Stones Wall");
                    provider.add(InitRockBlocks.ROCK_PAVING_STONES_PRESSURE_PLATES.get(RockType.byId(j)).get(), StringUtils.capitalise(RockType.byId(j).getName()) + " Paving Stones Pressure Plate");

                    // Rock ornaments
                    provider.add(InitRockBlocks.ROCK_ORNAMENTS.get(RockType.byId(j)).get(), StringUtils.capitalise(RockType.byId(j).getName()) + " Ornament");
                    provider.add(InitRockBlocks.ROCK_ORNAMENT_PRESSURE_PLATES.get(RockType.byId(j)).get(), StringUtils.capitalise(RockType.byId(j).getName()) + " Ornament Pressure Plate");

                    // Rock rooftiles
                    provider.add(InitRockBlocks.ROCK_ROOFTILES.get(RockType.byId(j)).get(), StringUtils.capitalise(RockType.byId(j).getName() + " Rooftiles"));
                    provider.add(InitRockBlocks.ROCK_ROOFTILES_STAIRS.get(RockType.byId(j)).get(), StringUtils.capitalise(RockType.byId(j).getName()) + " Rooftiles Stairs");
                    provider.add(InitRockBlocks.ROCK_ROOFTILES_SLABS.get(RockType.byId(j)).get(), StringUtils.capitalise(RockType.byId(j).getName()) + " Rooftiles Slab");
                }

                provider.add(InitRockBlocks.PAVING_STONES.get(), "Paving Stones");
                provider.add(InitRockBlocks.PAVING_STONES_SLAB.get(), "Paving Stones Slab");
                provider.add(InitRockBlocks.PAVING_STONES_STAIRS.get(), "Paving Stones Stairs");
                provider.add(InitRockBlocks.PAVING_STONES_WALL.get(), "Paving Stones Wall");
                provider.add(InitRockBlocks.PAVING_STONES_PRESSURE_PLATE.get(), "Paving Stones Pressure Plate");

                // Andesite
                provider.add(InitRockBlocks.SMOOTH_ANDESITE.get(), "Smooth Andesite");
                provider.add(InitRockBlocks.SMOOTH_ANDESITE_SLAB.get(), "Smooth Andesite Slab");
                provider.add(InitRockBlocks.SMOOTH_ANDESITE_STAIRS.get(), "Smooth Andesite Stairs");
                provider.add(InitRockBlocks.SMOOTH_ANDESITE_WALL.get(), "Smooth Andesite Wall");
                provider.add(InitRockBlocks.SMOOTH_ANDESITE_PRESSURE_PLATE.get(), "Smooth Andesite Pressure Plate");
                provider.add(InitRockBlocks.ANDESITE_BUTTON.get(), "Andesite Button");

                provider.add(InitRockBlocks.ANDESITE_PAVING.get(), "Andesite Paving");
                provider.add(InitRockBlocks.ANDESITE_PAVING_SLAB.get(), "Andesite Paving Slab");
                provider.add(InitRockBlocks.ANDESITE_PAVING_STAIRS.get(), "Andesite Paving Stairs");
                provider.add(InitRockBlocks.ANDESITE_PAVING_WALL.get(), "Andesite Paving Wall");
                provider.add(InitRockBlocks.ANDESITE_PAVING_PRESSURE_PLATE.get(), "Andesite Paving Pressure Plate");

                provider.add(InitRockBlocks.ANDESITE_TILES.get(), "Andesite Tiles");
                provider.add(InitRockBlocks.ANDESITE_TILES_SLAB.get(), "Andesite Tiles Slab");
                provider.add(InitRockBlocks.ANDESITE_TILES_STAIRS.get(), "Andesite Tiles Stairs");
                provider.add(InitRockBlocks.ANDESITE_TILES_WALL.get(), "Andesite Tiles Wall");
                provider.add(InitRockBlocks.ANDESITE_TILES_PRESSURE_PLATE.get(), "Andesite Tiles Pressure Plate");

                provider.add(InitRockBlocks.ANDESITE_BRICKS.get(), "Andesite Bricks");
                provider.add(InitRockBlocks.ANDESITE_BRICKS_SLAB.get(), "Andesite Bricks Slab");
                provider.add(InitRockBlocks.ANDESITE_BRICKS_STAIRS.get(), "Andesite Bricks Stairs");
                provider.add(InitRockBlocks.ANDESITE_BRICKS_WALL.get(), "Andesite Bricks Wall");
                provider.add(InitRockBlocks.ANDESITE_BRICKS_PRESSURE_PLATE.get(), "Andesite Bricks Pressure Plate");

                provider.add(InitRockBlocks.ANDESITE_LARGE_BRICKS.get(), "Andesite Large Bricks");
                provider.add(InitRockBlocks.ANDESITE_LARGE_BRICKS_SLAB.get(), "Andesite Large Bricks Slab");
                provider.add(InitRockBlocks.ANDESITE_LARGE_BRICKS_STAIRS.get(), "Andesite Large Bricks Stairs");
                provider.add(InitRockBlocks.ANDESITE_LARGE_BRICKS_WALL.get(), "Andesite Large Bricks Wall");
                provider.add(InitRockBlocks.ANDESITE_LARGE_BRICKS_PRESSURE_PLATE.get(), "Andesite Large Bricks Pressure Plate");

                provider.add(InitRockBlocks.ANDESITE_PAVING_STONES.get(), "Andesite Paving Stones");
                provider.add(InitRockBlocks.ANDESITE_PAVING_STONES_SLAB.get(), "Andesite Paving Stones Slab");
                provider.add(InitRockBlocks.ANDESITE_PAVING_STONES_STAIRS.get(), "Andesite Paving Stones Stairs");
                provider.add(InitRockBlocks.ANDESITE_PAVING_STONES_WALL.get(), "Andesite Paving Stones Wall");
                provider.add(InitRockBlocks.ANDESITE_PAVING_STONES_PRESSURE_PLATE.get(), "Andesite Paving Stones Pressure Plate");

                provider.add(InitRockBlocks.ANDESITE_ORNAMENT.get(), "Andesite Ornament");
                provider.add(InitRockBlocks.ANDESITE_ORNAMENT_PRESSURE_PLATE.get(), "Andesite Ornament Pressure Plate");

                provider.add(InitRockBlocks.ANDESITE_ROOFTILES.get(), "Andesite Rooftiles");
                provider.add(InitRockBlocks.ANDESITE_ROOFTILES_SLAB.get(), "Andesite Rooftiles Slab");
                provider.add(InitRockBlocks.ANDESITE_ROOFTILES_STAIRS.get(), "Andesite Rooftiles Stairs");

                // Diorite
                provider.add(InitRockBlocks.SMOOTH_DIORITE.get(), "Smooth Diorite");
                provider.add(InitRockBlocks.SMOOTH_DIORITE_SLAB.get(), "Smooth Diorite Slab");
                provider.add(InitRockBlocks.SMOOTH_DIORITE_STAIRS.get(), "Smooth Diorite Stairs");
                provider.add(InitRockBlocks.SMOOTH_DIORITE_WALL.get(), "Smooth Diorite Wall");
                provider.add(InitRockBlocks.SMOOTH_DIORITE_PRESSURE_PLATE.get(), "Smooth Diorite Pressure Plate");
                provider.add(InitRockBlocks.DIORITE_BUTTON.get(), "Diorite Button");

                provider.add(InitRockBlocks.DIORITE_PAVING.get(), "Diorite Paving");
                provider.add(InitRockBlocks.DIORITE_PAVING_SLAB.get(), "Diorite Paving Slab");
                provider.add(InitRockBlocks.DIORITE_PAVING_STAIRS.get(), "Diorite Paving Stairs");
                provider.add(InitRockBlocks.DIORITE_PAVING_WALL.get(), "Diorite Paving Wall");
                provider.add(InitRockBlocks.DIORITE_PAVING_PRESSURE_PLATE.get(), "Diorite Paving Pressure Plate");

                provider.add(InitRockBlocks.DIORITE_TILES.get(), "Diorite Tiles");
                provider.add(InitRockBlocks.DIORITE_TILES_SLAB.get(), "Diorite Tiles Slab");
                provider.add(InitRockBlocks.DIORITE_TILES_STAIRS.get(), "Diorite Tiles Stairs");
                provider.add(InitRockBlocks.DIORITE_TILES_WALL.get(), "Diorite Tiles Wall");
                provider.add(InitRockBlocks.DIORITE_TILES_PRESSURE_PLATE.get(), "Diorite Tiles Pressure Plate");

                provider.add(InitRockBlocks.DIORITE_BRICKS.get(), "Diorite Bricks");
                provider.add(InitRockBlocks.DIORITE_BRICKS_SLAB.get(), "Diorite Bricks Slab");
                provider.add(InitRockBlocks.DIORITE_BRICKS_STAIRS.get(), "Diorite Bricks Stairs");
                provider.add(InitRockBlocks.DIORITE_BRICKS_WALL.get(), "Diorite Bricks Wall");
                provider.add(InitRockBlocks.DIORITE_BRICKS_PRESSURE_PLATE.get(), "Diorite Bricks Pressure Plate");

                provider.add(InitRockBlocks.DIORITE_LARGE_BRICKS.get(), "Diorite Large Bricks");
                provider.add(InitRockBlocks.DIORITE_LARGE_BRICKS_SLAB.get(), "Diorite Large Bricks Slab");
                provider.add(InitRockBlocks.DIORITE_LARGE_BRICKS_STAIRS.get(), "Diorite Large Bricks Stairs");
                provider.add(InitRockBlocks.DIORITE_LARGE_BRICKS_WALL.get(), "Diorite Large Bricks Wall");
                provider.add(InitRockBlocks.DIORITE_LARGE_BRICKS_PRESSURE_PLATE.get(), "Diorite Large Bricks Pressure Plate");

                provider.add(InitRockBlocks.DIORITE_PAVING_STONES.get(), "Diorite Paving Stones");
                provider.add(InitRockBlocks.DIORITE_PAVING_STONES_SLAB.get(), "Diorite Paving Stones Slab");
                provider.add(InitRockBlocks.DIORITE_PAVING_STONES_STAIRS.get(), "Diorite Paving Stones Stairs");
                provider.add(InitRockBlocks.DIORITE_PAVING_STONES_WALL.get(), "Diorite Paving Stones Wall");
                provider.add(InitRockBlocks.DIORITE_PAVING_STONES_PRESSURE_PLATE.get(), "Diorite Paving Stones Pressure Plate");

                provider.add(InitRockBlocks.DIORITE_ORNAMENT.get(), "Diorite Ornament");
                provider.add(InitRockBlocks.DIORITE_ORNAMENT_PRESSURE_PLATE.get(), "Diorite Ornament Pressure Plate");

                provider.add(InitRockBlocks.DIORITE_ROOFTILES.get(), "Diorite Rooftiles");
                provider.add(InitRockBlocks.DIORITE_ROOFTILES_SLAB.get(), "Diorite Rooftiles Slab");
                provider.add(InitRockBlocks.DIORITE_ROOFTILES_STAIRS.get(), "Diorite Rooftiles Stairs");

                // Granite
                provider.add(InitRockBlocks.SMOOTH_GRANITE.get(), "Smooth Granite");
                provider.add(InitRockBlocks.SMOOTH_GRANITE_SLAB.get(), "Smooth Granite Slab");
                provider.add(InitRockBlocks.SMOOTH_GRANITE_STAIRS.get(), "Smooth Granite Stairs");
                provider.add(InitRockBlocks.SMOOTH_GRANITE_WALL.get(), "Smooth Granite Wall");
                provider.add(InitRockBlocks.SMOOTH_GRANITE_PRESSURE_PLATE.get(), "Smooth Granite Pressure Plate");
                provider.add(InitRockBlocks.GRANITE_BUTTON.get(), "Granite Button");

                provider.add(InitRockBlocks.GRANITE_PAVING.get(), "Granite Paving");
                provider.add(InitRockBlocks.GRANITE_PAVING_SLAB.get(), "Granite Paving Slab");
                provider.add(InitRockBlocks.GRANITE_PAVING_STAIRS.get(), "Granite Paving Stairs");
                provider.add(InitRockBlocks.GRANITE_PAVING_WALL.get(), "Granite Paving Wall");
                provider.add(InitRockBlocks.GRANITE_PAVING_PRESSURE_PLATE.get(), "Granite Paving Pressure Plate");

                provider.add(InitRockBlocks.GRANITE_TILES.get(), "Granite Tiles");
                provider.add(InitRockBlocks.GRANITE_TILES_SLAB.get(), "Granite Tiles Slab");
                provider.add(InitRockBlocks.GRANITE_TILES_STAIRS.get(), "Granite Tiles Stairs");
                provider.add(InitRockBlocks.GRANITE_TILES_WALL.get(), "Granite Tiles Wall");
                provider.add(InitRockBlocks.GRANITE_TILES_PRESSURE_PLATE.get(), "Granite Tiles Pressure Plate");

                provider.add(InitRockBlocks.GRANITE_BRICKS.get(), "Granite Bricks");
                provider.add(InitRockBlocks.GRANITE_BRICKS_SLAB.get(), "Granite Bricks Slab");
                provider.add(InitRockBlocks.GRANITE_BRICKS_STAIRS.get(), "Granite Bricks Stairs");
                provider.add(InitRockBlocks.GRANITE_BRICKS_WALL.get(), "Granite Bricks Wall");
                provider.add(InitRockBlocks.GRANITE_BRICKS_PRESSURE_PLATE.get(), "Granite Bricks Pressure Plate");

                provider.add(InitRockBlocks.GRANITE_LARGE_BRICKS.get(), "Granite Large Bricks");
                provider.add(InitRockBlocks.GRANITE_LARGE_BRICKS_SLAB.get(), "Granite Large Bricks Slab");
                provider.add(InitRockBlocks.GRANITE_LARGE_BRICKS_STAIRS.get(), "Granite Large Bricks Stairs");
                provider.add(InitRockBlocks.GRANITE_LARGE_BRICKS_WALL.get(), "Granite Large Bricks Wall");
                provider.add(InitRockBlocks.GRANITE_LARGE_BRICKS_PRESSURE_PLATE.get(), "Granite Large Bricks Pressure Plate");

                provider.add(InitRockBlocks.GRANITE_PAVING_STONES.get(), "Granite Paving Stones");
                provider.add(InitRockBlocks.GRANITE_PAVING_STONES_SLAB.get(), "Granite Paving Stones Slab");
                provider.add(InitRockBlocks.GRANITE_PAVING_STONES_STAIRS.get(), "Granite Paving Stones Stairs");
                provider.add(InitRockBlocks.GRANITE_PAVING_STONES_WALL.get(), "Granite Paving Stones Wall");
                provider.add(InitRockBlocks.GRANITE_PAVING_STONES_PRESSURE_PLATE.get(), "Granite Paving Stones Pressure Plate");

                provider.add(InitRockBlocks.GRANITE_ORNAMENT.get(), "Granite Ornament");
                provider.add(InitRockBlocks.GRANITE_ORNAMENT_PRESSURE_PLATE.get(), "Granite Ornament Pressure Plate");

                provider.add(InitRockBlocks.GRANITE_ROOFTILES.get(), "Granite Rooftiles");
                provider.add(InitRockBlocks.GRANITE_ROOFTILES_SLAB.get(), "Granite Rooftiles Slab");
                provider.add(InitRockBlocks.GRANITE_ROOFTILES_STAIRS.get(), "Granite Rooftiles Stairs");

                // Sandstone
                provider.add(InitRockBlocks.SANDSTONE_BUTTON.get(), "Sandstone Button");

                provider.add(InitRockBlocks.SMOOTH_SANDSTONE_WALL.get(), "Smooth Sandstone Wall");
                provider.add(InitRockBlocks.SMOOTH_SANDSTONE_PRESSURE_PLATE.get(), "Smooth Sandstone Pressure Plate");

                provider.add(InitRockBlocks.POLISHED_SANDSTONE.get(), "Polished Sandstone");
                provider.add(InitRockBlocks.POLISHED_SANDSTONE_SLAB.get(), "Polished Sandstone Slab");
                provider.add(InitRockBlocks.POLISHED_SANDSTONE_STAIRS.get(), "Polished Sandstone Stairs");
                provider.add(InitRockBlocks.POLISHED_SANDSTONE_WALL.get(), "Polished Sandstone Wall");
                provider.add(InitRockBlocks.POLISHED_SANDSTONE_PRESSURE_PLATE.get(), "Polished Sandstone Pressure Plate");

                provider.add(InitRockBlocks.SANDSTONE_PAVING.get(), "Sandstone Paving");
                provider.add(InitRockBlocks.SANDSTONE_PAVING_SLAB.get(), "Sandstone Paving Slab");
                provider.add(InitRockBlocks.SANDSTONE_PAVING_STAIRS.get(), "Sandstone Paving Stairs");
                provider.add(InitRockBlocks.SANDSTONE_PAVING_WALL.get(), "Sandstone Paving Wall");
                provider.add(InitRockBlocks.SANDSTONE_PAVING_PRESSURE_PLATE.get(), "Sandstone Paving Pressure Plate");

                provider.add(InitRockBlocks.SANDSTONE_TILES.get(), "Sandstone Tiles");
                provider.add(InitRockBlocks.SANDSTONE_TILES_SLAB.get(), "Sandstone Tiles Slab");
                provider.add(InitRockBlocks.SANDSTONE_TILES_STAIRS.get(), "Sandstone Tiles Stairs");
                provider.add(InitRockBlocks.SANDSTONE_TILES_WALL.get(), "Sandstone Tiles Wall");
                provider.add(InitRockBlocks.SANDSTONE_TILES_PRESSURE_PLATE.get(), "Sandstone Tiles Pressure Plate");

                provider.add(InitRockBlocks.SANDSTONE_BRICKS.get(), "Sandstone Bricks");
                provider.add(InitRockBlocks.SANDSTONE_BRICKS_SLAB.get(), "Sandstone Bricks Slab");
                provider.add(InitRockBlocks.SANDSTONE_BRICKS_STAIRS.get(), "Sandstone Bricks Stairs");
                provider.add(InitRockBlocks.SANDSTONE_BRICKS_WALL.get(), "Sandstone Bricks Wall");
                provider.add(InitRockBlocks.SANDSTONE_BRICKS_PRESSURE_PLATE.get(), "Sandstone Bricks Pressure Plate");

                provider.add(InitRockBlocks.SANDSTONE_LARGE_BRICKS.get(), "Sandstone Large Bricks");
                provider.add(InitRockBlocks.SANDSTONE_LARGE_BRICKS_SLAB.get(), "Sandstone Large Bricks Slab");
                provider.add(InitRockBlocks.SANDSTONE_LARGE_BRICKS_STAIRS.get(), "Sandstone Large Bricks Stairs");
                provider.add(InitRockBlocks.SANDSTONE_LARGE_BRICKS_WALL.get(), "Sandstone Large Bricks Wall");
                provider.add(InitRockBlocks.SANDSTONE_LARGE_BRICKS_PRESSURE_PLATE.get(), "Sandstone Large Bricks Pressure Plate");

                provider.add(InitRockBlocks.SANDSTONE_PAVING_STONES.get(), "Sandstone Paving Stones");
                provider.add(InitRockBlocks.SANDSTONE_PAVING_STONES_SLAB.get(), "Sandstone Paving Stones Slab");
                provider.add(InitRockBlocks.SANDSTONE_PAVING_STONES_STAIRS.get(), "Sandstone Paving Stones Stairs");
                provider.add(InitRockBlocks.SANDSTONE_PAVING_STONES_WALL.get(), "Sandstone Paving Stones Wall");
                provider.add(InitRockBlocks.SANDSTONE_PAVING_STONES_PRESSURE_PLATE.get(), "Sandstone Paving Stones Pressure Plate");

                provider.add(InitRockBlocks.SANDSTONE_ROOFTILES.get(), "Sandstone Rooftiles");
                provider.add(InitRockBlocks.SANDSTONE_ROOFTILES_SLAB.get(), "Sandstone Rooftiles Slab");
                provider.add(InitRockBlocks.SANDSTONE_ROOFTILES_STAIRS.get(), "Sandstone Rooftiles Stairs");

                // Red Sandstone
                provider.add(InitRockBlocks.RED_SANDSTONE_BUTTON.get(), "Red Sandstone Button");

                provider.add(InitRockBlocks.SMOOTH_RED_SANDSTONE_WALL.get(), "Smooth Red Sandstone Wall");
                provider.add(InitRockBlocks.SMOOTH_RED_SANDSTONE_PRESSURE_PLATE.get(), "Smooth Red Sandstone Pressure Plate");

                provider.add(InitRockBlocks.POLISHED_RED_SANDSTONE.get(), "Polished Red Sandstone");
                provider.add(InitRockBlocks.POLISHED_RED_SANDSTONE_SLAB.get(), "Polished Red Sandstone Slab");
                provider.add(InitRockBlocks.POLISHED_RED_SANDSTONE_STAIRS.get(), "Polished Red Sandstone Stairs");
                provider.add(InitRockBlocks.POLISHED_RED_SANDSTONE_WALL.get(), "Polished Red Sandstone Wall");
                provider.add(InitRockBlocks.POLISHED_RED_SANDSTONE_PRESSURE_PLATE.get(), "Polished Red Sandstone Pressure Plate");

                provider.add(InitRockBlocks.RED_SANDSTONE_PAVING.get(), "Red Sandstone Paving");
                provider.add(InitRockBlocks.RED_SANDSTONE_PAVING_SLAB.get(), "Red Sandstone Paving Slab");
                provider.add(InitRockBlocks.RED_SANDSTONE_PAVING_STAIRS.get(), "Red Sandstone Paving Stairs");
                provider.add(InitRockBlocks.RED_SANDSTONE_PAVING_WALL.get(), "Red Sandstone Paving Wall");
                provider.add(InitRockBlocks.RED_SANDSTONE_PAVING_PRESSURE_PLATE.get(), "Red Sandstone Paving Pressure Plate");

                provider.add(InitRockBlocks.RED_SANDSTONE_TILES.get(), "Red Sandstone Tiles");
                provider.add(InitRockBlocks.RED_SANDSTONE_TILES_SLAB.get(), "Red Sandstone Tiles Slab");
                provider.add(InitRockBlocks.RED_SANDSTONE_TILES_STAIRS.get(), "Red Sandstone Tiles Stairs");
                provider.add(InitRockBlocks.RED_SANDSTONE_TILES_WALL.get(), "Red Sandstone Tiles Wall");
                provider.add(InitRockBlocks.RED_SANDSTONE_TILES_PRESSURE_PLATE.get(), "Red Sandstone Tiles Pressure Plate");

                provider.add(InitRockBlocks.RED_SANDSTONE_BRICKS.get(), "Red Sandstone Bricks");
                provider.add(InitRockBlocks.RED_SANDSTONE_BRICKS_SLAB.get(), "Red Sandstone Bricks Slab");
                provider.add(InitRockBlocks.RED_SANDSTONE_BRICKS_STAIRS.get(), "Red Sandstone Bricks Stairs");
                provider.add(InitRockBlocks.RED_SANDSTONE_BRICKS_WALL.get(), "Red Sandstone Bricks Wall");
                provider.add(InitRockBlocks.RED_SANDSTONE_BRICKS_PRESSURE_PLATE.get(), "Red Sandstone Bricks Pressure Plate");

                provider.add(InitRockBlocks.RED_SANDSTONE_LARGE_BRICKS.get(), "Red Sandstone Large Bricks");
                provider.add(InitRockBlocks.RED_SANDSTONE_LARGE_BRICKS_SLAB.get(), "Red Sandstone Large Bricks Slab");
                provider.add(InitRockBlocks.RED_SANDSTONE_LARGE_BRICKS_STAIRS.get(), "Red Sandstone Large Bricks Stairs");
                provider.add(InitRockBlocks.RED_SANDSTONE_LARGE_BRICKS_WALL.get(), "Red Sandstone Large Bricks Wall");
                provider.add(InitRockBlocks.RED_SANDSTONE_LARGE_BRICKS_PRESSURE_PLATE.get(), "Red Sandstone Large Bricks Pressure Plate");

                provider.add(InitRockBlocks.RED_SANDSTONE_PAVING_STONES.get(), "Red Sandstone Paving Stones");
                provider.add(InitRockBlocks.RED_SANDSTONE_PAVING_STONES_SLAB.get(), "Red Sandstone Paving Stones Slab");
                provider.add(InitRockBlocks.RED_SANDSTONE_PAVING_STONES_STAIRS.get(), "Red Sandstone Paving Stones Stairs");
                provider.add(InitRockBlocks.RED_SANDSTONE_PAVING_STONES_WALL.get(), "Red Sandstone Paving Stones Wall");
                provider.add(InitRockBlocks.RED_SANDSTONE_PAVING_STONES_PRESSURE_PLATE.get(), "Red Sandstone Paving Stones Pressure Plate");

                provider.add(InitRockBlocks.RED_SANDSTONE_ROOFTILES.get(), "Red Sandstone Rooftiles");
                provider.add(InitRockBlocks.RED_SANDSTONE_ROOFTILES_SLAB.get(), "Red Sandstone Rooftiles Slab");
                provider.add(InitRockBlocks.RED_SANDSTONE_ROOFTILES_STAIRS.get(), "Red Sandstone Rooftiles Stairs");

                // Terracotta
                provider.add(InitRockBlocks.TERRACOTTA_SLAB.get(), "Terracotta Slab");
                provider.add(InitRockBlocks.TERRACOTTA_STAIRS.get(), "Terracotta Stairs");
                provider.add(InitRockBlocks.TERRACOTTA_WALL.get(), "Terracotta Wall");
                provider.add(InitRockBlocks.TERRACOTTA_PRESSURE_PLATE.get(), "Terracotta Pressure Plate");
                provider.add(InitRockBlocks.TERRACOTTA_BUTTON.get(), "Terracotta Button");

                provider.add(InitRockBlocks.POLISHED_TERRACOTTA.get(), "Polished Terracotta");
                provider.add(InitRockBlocks.POLISHED_TERRACOTTA_SLAB.get(), "Polished Terracotta Slab");
                provider.add(InitRockBlocks.POLISHED_TERRACOTTA_STAIRS.get(), "Polished Terracotta Stairs");
                provider.add(InitRockBlocks.POLISHED_TERRACOTTA_WALL.get(), "Polished Terracotta Wall");
                provider.add(InitRockBlocks.POLISHED_TERRACOTTA_PRESSURE_PLATE.get(), "Polished Terracotta Pressure Plate");

                provider.add(InitRockBlocks.TERRACOTTA_PAVING.get(), "Terracotta Paving");
                provider.add(InitRockBlocks.TERRACOTTA_PAVING_SLAB.get(), "Terracotta Paving Slab");
                provider.add(InitRockBlocks.TERRACOTTA_PAVING_STAIRS.get(), "Terracotta Paving Stairs");
                provider.add(InitRockBlocks.TERRACOTTA_PAVING_WALL.get(), "Terracotta Paving Wall");
                provider.add(InitRockBlocks.TERRACOTTA_PAVING_PRESSURE_PLATE.get(), "Terracotta Paving Pressure Plate");

                provider.add(InitRockBlocks.TERRACOTTA_TILES.get(), "Terracotta Tiles");
                provider.add(InitRockBlocks.TERRACOTTA_TILES_SLAB.get(), "Terracotta Tiles Slab");
                provider.add(InitRockBlocks.TERRACOTTA_TILES_STAIRS.get(), "Terracotta Tiles Stairs");
                provider.add(InitRockBlocks.TERRACOTTA_TILES_WALL.get(), "Terracotta Tiles Wall");
                provider.add(InitRockBlocks.TERRACOTTA_TILES_PRESSURE_PLATE.get(), "Terracotta Tiles Pressure Plate");

                provider.add(InitRockBlocks.TERRACOTTA_BRICKS.get(), "Terracotta Bricks");
                provider.add(InitRockBlocks.TERRACOTTA_BRICKS_SLAB.get(), "Terracotta Bricks Slab");
                provider.add(InitRockBlocks.TERRACOTTA_BRICKS_STAIRS.get(), "Terracotta Bricks Stairs");
                provider.add(InitRockBlocks.TERRACOTTA_BRICKS_WALL.get(), "Terracotta Bricks Wall");
                provider.add(InitRockBlocks.TERRACOTTA_BRICKS_PRESSURE_PLATE.get(), "Terracotta Bricks Pressure Plate");

                provider.add(InitRockBlocks.TERRACOTTA_LARGE_BRICKS.get(), "Terracotta Large Bricks");
                provider.add(InitRockBlocks.TERRACOTTA_LARGE_BRICKS_SLAB.get(), "Terracotta Large Bricks Slab");
                provider.add(InitRockBlocks.TERRACOTTA_LARGE_BRICKS_STAIRS.get(), "Terracotta Large Bricks Stairs");
                provider.add(InitRockBlocks.TERRACOTTA_LARGE_BRICKS_WALL.get(), "Terracotta Large Bricks Wall");
                provider.add(InitRockBlocks.TERRACOTTA_LARGE_BRICKS_PRESSURE_PLATE.get(), "Terracotta Large Bricks Pressure Plate");

                provider.add(InitRockBlocks.TERRACOTTA_PAVING_STONES.get(), "Terracotta Paving Stones");
                provider.add(InitRockBlocks.TERRACOTTA_PAVING_STONES_SLAB.get(), "Terracotta Paving Stones Slab");
                provider.add(InitRockBlocks.TERRACOTTA_PAVING_STONES_STAIRS.get(), "Terracotta Paving Stones Stairs");
                provider.add(InitRockBlocks.TERRACOTTA_PAVING_STONES_WALL.get(), "Terracotta Paving Stones Wall");
                provider.add(InitRockBlocks.TERRACOTTA_PAVING_STONES_PRESSURE_PLATE.get(), "Terracotta Paving Stones Pressure Plate");

                provider.add(InitRockBlocks.TERRACOTTA_ROOFTILES.get(), "Terracotta Rooftiles");
                provider.add(InitRockBlocks.TERRACOTTA_ROOFTILES_SLAB.get(), "Terracotta Rooftiles Slab");
                provider.add(InitRockBlocks.TERRACOTTA_ROOFTILES_STAIRS.get(), "Terracotta Rooftiles Stairs");

                provider.add("itemGroup.embellishcraft_rocks_group", "EmbellishCraft - Rocks");
                break;
            case "fr_fr":
                for(int j = 0; j < Arrays.stream(RockType.values()).count(); j++)
                {
                    // Rocks
                    provider.add(InitRockBlocks.ROCK_BLOCKS.get(RockType.byId(j)).get(), StringUtils.capitalise(RockType.byId(j).getFrName()));
                    provider.add(InitRockBlocks.ROCK_STAIRS.get(RockType.byId(j)).get(), "Escalier en " + RockType.byId(j).getFrName());
                    provider.add(InitRockBlocks.ROCK_SLABS.get(RockType.byId(j)).get(), "Dalle en " + RockType.byId(j).getFrName());
                    provider.add(InitRockBlocks.ROCK_WALLS.get(RockType.byId(j)).get(), "Muret en " + RockType.byId(j).getFrName());
                    provider.add(InitRockBlocks.ROCK_PRESSURE_PLATES.get(RockType.byId(j)).get(), "Plaque de pression en " + RockType.byId(j).getFrName());
                    provider.add(InitRockBlocks.ROCK_BUTTONS.get(RockType.byId(j)).get(), "Bouton en " + RockType.byId(j).getFrName());

                    // Cobbletones
                    String de = "de ";
                    if(RockType.byId(j).getFrName() == "ardoise")
                        de = "d'";

                    provider.add(InitRockBlocks.ROCK_COBBLESTONES.get(RockType.byId(j)).get(), "Pierres " + de + RockType.byId(j).getFrName());
                    provider.add(InitRockBlocks.ROCK_COBBLESTONE_STAIRS.get(RockType.byId(j)).get(), "Escalier en pierres " + de + RockType.byId(j).getFrName());
                    provider.add(InitRockBlocks.ROCK_COBBLESTONE_SLABS.get(RockType.byId(j)).get(), "Dalle en pierres " + de + RockType.byId(j).getFrName());
                    provider.add(InitRockBlocks.ROCK_COBBLESTONE_WALLS.get(RockType.byId(j)).get(), "Muret en pierres " + de + RockType.byId(j).getFrName());
                    provider.add(InitRockBlocks.ROCK_COBBLESTONE_PRESSURE_PLATES.get(RockType.byId(j)).get(), "Plaque de pression en pierres " + de + RockType.byId(j).getFrName());

                    // Cobblestone bricks
                    provider.add(InitRockBlocks.ROCK_COBBLESTONE_BRICKS.get(RockType.byId(j)).get(), "Briques de pierres " + de + RockType.byId(j).getFrName());
                    provider.add(InitRockBlocks.ROCK_COBBLESTONE_BRICKS_STAIRS.get(RockType.byId(j)).get(), "Escalier en briques de pierres " + de + RockType.byId(j).getFrName());
                    provider.add(InitRockBlocks.ROCK_COBBLESTONE_BRICKS_SLABS.get(RockType.byId(j)).get(), "Dalle en briques de pierres " + de + RockType.byId(j).getFrName());
                    provider.add(InitRockBlocks.ROCK_COBBLESTONE_BRICKS_WALLS.get(RockType.byId(j)).get(), "Muret en briques de pierres " + de + RockType.byId(j).getFrName());
                    provider.add(InitRockBlocks.ROCK_COBBLESTONE_BRICKS_PRESSURE_PLATES.get(RockType.byId(j)).get(), "Plaque de pression en briques de pierres " + de + RockType.byId(j).getFrName());

                    // Smooth rocks
                    provider.add(InitRockBlocks.SMOOTH_ROCK_BLOCKS.get(RockType.byId(j)).get(), StringUtils.capitalise(RockType.byId(j).getFrName()) + " lisse");
                    provider.add(InitRockBlocks.SMOOTH_ROCK_STAIRS.get(RockType.byId(j)).get(), "Escalier en " + RockType.byId(j).getFrName() + " lisse");
                    provider.add(InitRockBlocks.SMOOTH_ROCK_SLABS.get(RockType.byId(j)).get(), "Dalle en " + RockType.byId(j).getFrName() + " lisse");
                    provider.add(InitRockBlocks.SMOOTH_ROCK_WALLS.get(RockType.byId(j)).get(), "Muret en " + RockType.byId(j).getFrName() + " lisse");
                    provider.add(InitRockBlocks.SMOOTH_ROCK_PRESSURE_PLATES.get(RockType.byId(j)).get(), "Plaque de pression en " + RockType.byId(j).getFrName() + " lisse");

                    // Polished rocks
                    provider.add(InitRockBlocks.POLISHED_ROCK_BLOCKS.get(RockType.byId(j)).get(), StringUtils.capitalise(RockType.byId(j).getFrName()) + " poli");
                    provider.add(InitRockBlocks.POLISHED_ROCK_STAIRS.get(RockType.byId(j)).get(), "Escalier en " + RockType.byId(j).getFrName() + " poli");
                    provider.add(InitRockBlocks.POLISHED_ROCK_SLABS.get(RockType.byId(j)).get(), "Dalle en " + RockType.byId(j).getFrName() + " poli");
                    provider.add(InitRockBlocks.POLISHED_ROCK_WALLS.get(RockType.byId(j)).get(), "Muret en " + RockType.byId(j).getFrName() + " poli");
                    provider.add(InitRockBlocks.POLISHED_ROCK_PRESSURE_PLATES.get(RockType.byId(j)).get(), "Plaque de pression en " + RockType.byId(j).getFrName() + " poli");

                    // Rock pavings
                    provider.add(InitRockBlocks.ROCK_PAVINGS.get(RockType.byId(j)).get(), "Pavés " + de + RockType.byId(j).getFrName());
                    provider.add(InitRockBlocks.ROCK_PAVING_STAIRS.get(RockType.byId(j)).get(), "Escalier en pavé " + de + RockType.byId(j).getFrName());
                    provider.add(InitRockBlocks.ROCK_PAVING_SLABS.get(RockType.byId(j)).get(), "Dalle en pavé " + de + RockType.byId(j).getFrName());
                    provider.add(InitRockBlocks.ROCK_PAVING_WALLS.get(RockType.byId(j)).get(), "Muret en pavé " + de + RockType.byId(j).getFrName());
                    provider.add(InitRockBlocks.ROCK_PAVING_PRESSURE_PLATES.get(RockType.byId(j)).get(), "Plaque de pression en pavé " + de + RockType.byId(j).getFrName());

                    // Rock tiles
                    provider.add(InitRockBlocks.ROCK_TILES.get(RockType.byId(j)).get(), "Carrelage " + de + RockType.byId(j).getFrName());
                    provider.add(InitRockBlocks.ROCK_TILES_STAIRS.get(RockType.byId(j)).get(), "Escalier en carrelage " + de + RockType.byId(j).getFrName());
                    provider.add(InitRockBlocks.ROCK_TILES_SLABS.get(RockType.byId(j)).get(), "Dalle en carrelage " + de + RockType.byId(j).getFrName());
                    provider.add(InitRockBlocks.ROCK_TILES_WALLS.get(RockType.byId(j)).get(), "Muret en carrelage " + de + RockType.byId(j).getFrName());
                    provider.add(InitRockBlocks.ROCK_TILES_PRESSURE_PLATES.get(RockType.byId(j)).get(), "Plaque de pression en carrelage " + de + RockType.byId(j).getFrName());

                    // Rock bricks
                    provider.add(InitRockBlocks.ROCK_BRICKS.get(RockType.byId(j)).get(), "Briques " + de + RockType.byId(j).getFrName());
                    provider.add(InitRockBlocks.ROCK_BRICKS_STAIRS.get(RockType.byId(j)).get(), "Escalier en briques " + de + RockType.byId(j).getFrName());
                    provider.add(InitRockBlocks.ROCK_BRICKS_SLABS.get(RockType.byId(j)).get(), "Dalle en briques " + de + RockType.byId(j).getFrName());
                    provider.add(InitRockBlocks.ROCK_BRICKS_WALLS.get(RockType.byId(j)).get(), "Muret en briques " + de + RockType.byId(j).getFrName());
                    provider.add(InitRockBlocks.ROCK_BRICKS_PRESSURE_PLATES.get(RockType.byId(j)).get(), "Plaque de pression en briques " + de + RockType.byId(j).getFrName());

                    // Rock large bricks
                    provider.add(InitRockBlocks.ROCK_LARGE_BRICKS.get(RockType.byId(j)).get(), "Briques épaisses " + de + RockType.byId(j).getFrName());
                    provider.add(InitRockBlocks.ROCK_LARGE_BRICKS_STAIRS.get(RockType.byId(j)).get(), "Escalier en briques épaisses " + de + RockType.byId(j).getFrName());
                    provider.add(InitRockBlocks.ROCK_LARGE_BRICKS_SLABS.get(RockType.byId(j)).get(), "Dalle en briques épaisses " + de + RockType.byId(j).getFrName());
                    provider.add(InitRockBlocks.ROCK_LARGE_BRICKS_WALLS.get(RockType.byId(j)).get(), "Muret en briques épaisses " + de + RockType.byId(j).getFrName());
                    provider.add(InitRockBlocks.ROCK_LARGE_BRICKS_PRESSURE_PLATES.get(RockType.byId(j)).get(), "Plaque de pression en briques épaisses " + de + RockType.byId(j).getFrName());

                    // Rock paving stones
                    provider.add(InitRockBlocks.ROCK_PAVING_STONES.get(RockType.byId(j)).get(), "Pavage " + de + RockType.byId(j).getFrName());
                    provider.add(InitRockBlocks.ROCK_PAVING_STONES_STAIRS.get(RockType.byId(j)).get(), "Escalier en pavage " + de + RockType.byId(j).getFrName());
                    provider.add(InitRockBlocks.ROCK_PAVING_STONES_SLABS.get(RockType.byId(j)).get(), "Dalle en pavage " + de + RockType.byId(j).getFrName());
                    provider.add(InitRockBlocks.ROCK_PAVING_STONES_WALLS.get(RockType.byId(j)).get(), "Muret en pavage " + de + RockType.byId(j).getFrName());
                    provider.add(InitRockBlocks.ROCK_PAVING_STONES_PRESSURE_PLATES.get(RockType.byId(j)).get(), "Plaque de pression en pavage " + de + RockType.byId(j).getFrName());

                    // Rock ornaments
                    provider.add(InitRockBlocks.ROCK_ORNAMENTS.get(RockType.byId(j)).get(), "Ornement en " + RockType.byId(j).getFrName());
                    provider.add(InitRockBlocks.ROCK_ORNAMENT_PRESSURE_PLATES.get(RockType.byId(j)).get(), "Plaque de pression avec ornement en " + RockType.byId(j).getFrName());

                    // Rock rooftiles
                    provider.add(InitRockBlocks.ROCK_ROOFTILES.get(RockType.byId(j)).get(), "Tuiles " + de + RockType.byId(j).getFrName());
                    provider.add(InitRockBlocks.ROCK_ROOFTILES_STAIRS.get(RockType.byId(j)).get(), "Escalier en tuiles " + de + RockType.byId(j).getFrName());
                    provider.add(InitRockBlocks.ROCK_ROOFTILES_SLABS.get(RockType.byId(j)).get(), "Dalle en tuiles " + de + RockType.byId(j).getFrName());
                }

                provider.add(InitRockBlocks.PAVING_STONES.get(), "Pavage");
                provider.add(InitRockBlocks.PAVING_STONES_SLAB.get(), "Dalle en pavage");
                provider.add(InitRockBlocks.PAVING_STONES_STAIRS.get(), "Escalier en pavage");
                provider.add(InitRockBlocks.PAVING_STONES_WALL.get(), "Muret en pavage");
                provider.add(InitRockBlocks.PAVING_STONES_PRESSURE_PLATE.get(), "Plaque de pression en pavage");

                // Andesite
                provider.add(InitRockBlocks.ANDESITE_BUTTON.get(), "Bouton en andésite");

                provider.add(InitRockBlocks.SMOOTH_ANDESITE.get(), "Andésite lisse");
                provider.add(InitRockBlocks.SMOOTH_ANDESITE_SLAB.get(), "Dalle en andésite lisse");
                provider.add(InitRockBlocks.SMOOTH_ANDESITE_STAIRS.get(), "Escalier en andésite lisse");
                provider.add(InitRockBlocks.SMOOTH_ANDESITE_WALL.get(), "Muret en andésite lisse");
                provider.add(InitRockBlocks.SMOOTH_ANDESITE_PRESSURE_PLATE.get(), "Plaque de pression en andésite lisse");

                provider.add(InitRockBlocks.ANDESITE_PAVING.get(), "Pavés d'andésite");
                provider.add(InitRockBlocks.ANDESITE_PAVING_SLAB.get(), "Dalle en pavé d'andésite");
                provider.add(InitRockBlocks.ANDESITE_PAVING_STAIRS.get(), "Escalier en pavé d'andésite");
                provider.add(InitRockBlocks.ANDESITE_PAVING_WALL.get(), "Muret en pavé d'andésite");
                provider.add(InitRockBlocks.ANDESITE_PAVING_PRESSURE_PLATE.get(), "Plaque de pression en pavé d'andésite");

                provider.add(InitRockBlocks.ANDESITE_TILES.get(), "Carrelage d'andésite");
                provider.add(InitRockBlocks.ANDESITE_TILES_SLAB.get(), "Dalle en carrelage d'andésite");
                provider.add(InitRockBlocks.ANDESITE_TILES_STAIRS.get(), "Escalier en carrelage d'andésite");
                provider.add(InitRockBlocks.ANDESITE_TILES_WALL.get(), "Muret en carrelage d'andésite");
                provider.add(InitRockBlocks.ANDESITE_TILES_PRESSURE_PLATE.get(), "Plaque de pression en carrelage d'andésite");

                provider.add(InitRockBlocks.ANDESITE_BRICKS.get(), "Briques d'andésite");
                provider.add(InitRockBlocks.ANDESITE_BRICKS_SLAB.get(), "Dalle en briques d'andésite");
                provider.add(InitRockBlocks.ANDESITE_BRICKS_STAIRS.get(), "Escalier en briques d'andésite");
                provider.add(InitRockBlocks.ANDESITE_BRICKS_WALL.get(), "Muret en briques d'andésite");
                provider.add(InitRockBlocks.ANDESITE_BRICKS_PRESSURE_PLATE.get(), "Plaque de pression en briques d'andésite");

                provider.add(InitRockBlocks.ANDESITE_LARGE_BRICKS.get(), "Briques épaisses d'andésite");
                provider.add(InitRockBlocks.ANDESITE_LARGE_BRICKS_SLAB.get(), "Dalle en briques épaisses d'andésite");
                provider.add(InitRockBlocks.ANDESITE_LARGE_BRICKS_STAIRS.get(), "Escalier en briques épaisses d'andésite");
                provider.add(InitRockBlocks.ANDESITE_LARGE_BRICKS_WALL.get(), "Muret en briques épaisses d'andésite");
                provider.add(InitRockBlocks.ANDESITE_LARGE_BRICKS_PRESSURE_PLATE.get(), "Plaque de pression en briques épaisses d'andésite");

                provider.add(InitRockBlocks.ANDESITE_PAVING_STONES.get(), "Pavage d'andésite");
                provider.add(InitRockBlocks.ANDESITE_PAVING_STONES_SLAB.get(), "Dalle en pavage d'andésite");
                provider.add(InitRockBlocks.ANDESITE_PAVING_STONES_STAIRS.get(), "Escalier en pavage d'andésite");
                provider.add(InitRockBlocks.ANDESITE_PAVING_STONES_WALL.get(), "Muret en pavage d'andésite");
                provider.add(InitRockBlocks.ANDESITE_PAVING_STONES_PRESSURE_PLATE.get(), "Plaque de pression en pavage d'andésite");

                provider.add(InitRockBlocks.ANDESITE_ORNAMENT.get(), "Ornement en andésite");
                provider.add(InitRockBlocks.ANDESITE_ORNAMENT_PRESSURE_PLATE.get(), "Plaque de pression avec ornement en andésite");

                provider.add(InitRockBlocks.ANDESITE_ROOFTILES.get(), "Tuiles d'andésite");
                provider.add(InitRockBlocks.ANDESITE_ROOFTILES_SLAB.get(), "Dalle en tuile d'andésite");
                provider.add(InitRockBlocks.ANDESITE_ROOFTILES_STAIRS.get(), "Escalier en tuile d'andésite");

                // Diorite
                provider.add(InitRockBlocks.DIORITE_BUTTON.get(), "Bouton en diorite");

                provider.add(InitRockBlocks.SMOOTH_DIORITE.get(), "Diorite lisse");
                provider.add(InitRockBlocks.SMOOTH_DIORITE_SLAB.get(), "Dalle en diorite lisse");
                provider.add(InitRockBlocks.SMOOTH_DIORITE_STAIRS.get(), "Escalier en diorite lisse");
                provider.add(InitRockBlocks.SMOOTH_DIORITE_WALL.get(), "Muret en diorite lisse");
                provider.add(InitRockBlocks.SMOOTH_DIORITE_PRESSURE_PLATE.get(), "Plaque de pression en diorite lisse");

                provider.add(InitRockBlocks.DIORITE_PAVING.get(), "Pavés de diorite");
                provider.add(InitRockBlocks.DIORITE_PAVING_SLAB.get(), "Dalle en pavé de diorite");
                provider.add(InitRockBlocks.DIORITE_PAVING_STAIRS.get(), "Escalier en pavé de diorite");
                provider.add(InitRockBlocks.DIORITE_PAVING_WALL.get(), "Muret en pavé de diorite");
                provider.add(InitRockBlocks.DIORITE_PAVING_PRESSURE_PLATE.get(), "Plaque de pression en pavé de diorite");

                provider.add(InitRockBlocks.DIORITE_TILES.get(), "Carrelage de diorite");
                provider.add(InitRockBlocks.DIORITE_TILES_SLAB.get(), "Dalle en carrelage de diorite");
                provider.add(InitRockBlocks.DIORITE_TILES_STAIRS.get(), "Escalier en carrelage de diorite");
                provider.add(InitRockBlocks.DIORITE_TILES_WALL.get(), "Muret en carrelage de diorite");
                provider.add(InitRockBlocks.DIORITE_TILES_PRESSURE_PLATE.get(), "Plaque de pression en carrelage de diorite");

                provider.add(InitRockBlocks.DIORITE_BRICKS.get(), "Briques de diorite");
                provider.add(InitRockBlocks.DIORITE_BRICKS_SLAB.get(), "Dalle en briques de diorite");
                provider.add(InitRockBlocks.DIORITE_BRICKS_STAIRS.get(), "Escalier en briques de diorite");
                provider.add(InitRockBlocks.DIORITE_BRICKS_WALL.get(), "Muret en briques de diorite");
                provider.add(InitRockBlocks.DIORITE_BRICKS_PRESSURE_PLATE.get(), "Plaque de pression en briques de diorite");

                provider.add(InitRockBlocks.DIORITE_LARGE_BRICKS.get(), "Briques épaisses de diorite");
                provider.add(InitRockBlocks.DIORITE_LARGE_BRICKS_SLAB.get(), "Dalle en briques épaisses de diorite");
                provider.add(InitRockBlocks.DIORITE_LARGE_BRICKS_STAIRS.get(), "Escalier en briques épaisses de diorite");
                provider.add(InitRockBlocks.DIORITE_LARGE_BRICKS_WALL.get(), "Muret en briques épaisses de diorite");
                provider.add(InitRockBlocks.DIORITE_LARGE_BRICKS_PRESSURE_PLATE.get(), "Plaque de pression en briques épaisses de diorite");

                provider.add(InitRockBlocks.DIORITE_PAVING_STONES.get(), "Pavage de diorite");
                provider.add(InitRockBlocks.DIORITE_PAVING_STONES_SLAB.get(), "Dalle en pavage de diorite");
                provider.add(InitRockBlocks.DIORITE_PAVING_STONES_STAIRS.get(), "Escalier en pavage de diorite");
                provider.add(InitRockBlocks.DIORITE_PAVING_STONES_WALL.get(), "Muret en pavage de diorite");
                provider.add(InitRockBlocks.DIORITE_PAVING_STONES_PRESSURE_PLATE.get(), "Plaque de pression en pavage de diorite");

                provider.add(InitRockBlocks.DIORITE_ORNAMENT.get(), "Ornement en diorite");
                provider.add(InitRockBlocks.DIORITE_ORNAMENT_PRESSURE_PLATE.get(), "Plaque de pression avec ornement en diorite");

                provider.add(InitRockBlocks.DIORITE_ROOFTILES.get(), "Tuiles de diorite");
                provider.add(InitRockBlocks.DIORITE_ROOFTILES_SLAB.get(), "Dalle en tuile de diorite");
                provider.add(InitRockBlocks.DIORITE_ROOFTILES_STAIRS.get(), "Escalier en tuile de diorite");

                // Granite
                provider.add(InitRockBlocks.GRANITE_BUTTON.get(), "Bouton en granite");

                provider.add(InitRockBlocks.SMOOTH_GRANITE.get(), "Granite lisse");
                provider.add(InitRockBlocks.SMOOTH_GRANITE_SLAB.get(), "Dalle en granite lisse");
                provider.add(InitRockBlocks.SMOOTH_GRANITE_STAIRS.get(), "Escalier en granite lisse");
                provider.add(InitRockBlocks.SMOOTH_GRANITE_WALL.get(), "Muret en granite lisse");
                provider.add(InitRockBlocks.SMOOTH_GRANITE_PRESSURE_PLATE.get(), "Plaque de pression en granite lisse");

                provider.add(InitRockBlocks.GRANITE_PAVING.get(), "Pavés de granite");
                provider.add(InitRockBlocks.GRANITE_PAVING_SLAB.get(), "Dalle en pavé de granite");
                provider.add(InitRockBlocks.GRANITE_PAVING_STAIRS.get(), "Escalier en pavé de granite");
                provider.add(InitRockBlocks.GRANITE_PAVING_WALL.get(), "Muret en pavé de granite");
                provider.add(InitRockBlocks.GRANITE_PAVING_PRESSURE_PLATE.get(), "Plaque de pression en pavé de granite");

                provider.add(InitRockBlocks.GRANITE_TILES.get(), "Carrelage de granite");
                provider.add(InitRockBlocks.GRANITE_TILES_SLAB.get(), "Dalle en carrelage de granite");
                provider.add(InitRockBlocks.GRANITE_TILES_STAIRS.get(), "Escalier en carrelage de granite");
                provider.add(InitRockBlocks.GRANITE_TILES_WALL.get(), "Muret en carrelage de granite");
                provider.add(InitRockBlocks.GRANITE_TILES_PRESSURE_PLATE.get(), "Plaque de pression en carrelage de granite");

                provider.add(InitRockBlocks.GRANITE_BRICKS.get(), "Briques de granite");
                provider.add(InitRockBlocks.GRANITE_BRICKS_SLAB.get(), "Dalle en briques de granite");
                provider.add(InitRockBlocks.GRANITE_BRICKS_STAIRS.get(), "Escalier en briques de granite");
                provider.add(InitRockBlocks.GRANITE_BRICKS_WALL.get(), "Muret en briques de granite");
                provider.add(InitRockBlocks.GRANITE_BRICKS_PRESSURE_PLATE.get(), "Plaque de pression en briques de granite");

                provider.add(InitRockBlocks.GRANITE_LARGE_BRICKS.get(), "Briques épaisses de granite");
                provider.add(InitRockBlocks.GRANITE_LARGE_BRICKS_SLAB.get(), "Dalle en briques épaisses de granite");
                provider.add(InitRockBlocks.GRANITE_LARGE_BRICKS_STAIRS.get(), "Escalier en briques épaisses de granite");
                provider.add(InitRockBlocks.GRANITE_LARGE_BRICKS_WALL.get(), "Muret en briques épaisses de granite");
                provider.add(InitRockBlocks.GRANITE_LARGE_BRICKS_PRESSURE_PLATE.get(), "Plaque de pression en briques épaisses de granite");

                provider.add(InitRockBlocks.GRANITE_PAVING_STONES.get(), "Pavage de granite");
                provider.add(InitRockBlocks.GRANITE_PAVING_STONES_SLAB.get(), "Dalle en pavage de granite");
                provider.add(InitRockBlocks.GRANITE_PAVING_STONES_STAIRS.get(), "Escalier en pavage de granite");
                provider.add(InitRockBlocks.GRANITE_PAVING_STONES_WALL.get(), "Muret en pavage de granite");
                provider.add(InitRockBlocks.GRANITE_PAVING_STONES_PRESSURE_PLATE.get(), "Plaque de pression en pavage de granite");

                provider.add(InitRockBlocks.GRANITE_ORNAMENT.get(), "Ornement en granite");
                provider.add(InitRockBlocks.GRANITE_ORNAMENT_PRESSURE_PLATE.get(), "Plaque de pression avec ornement en granite");

                provider.add(InitRockBlocks.GRANITE_ROOFTILES.get(), "Tuiles de granite");
                provider.add(InitRockBlocks.GRANITE_ROOFTILES_SLAB.get(), "Dalle en tuile de granite");
                provider.add(InitRockBlocks.GRANITE_ROOFTILES_STAIRS.get(), "Escalier en tuile de granite");

                // Sandstone
                provider.add(InitRockBlocks.SANDSTONE_BUTTON.get(), "Bouton en grès");

                provider.add(InitRockBlocks.SMOOTH_SANDSTONE_WALL.get(), "Muret de grès lisse");
                provider.add(InitRockBlocks.SMOOTH_SANDSTONE_PRESSURE_PLATE.get(), "Plaque de pression en grès lisse");

                provider.add(InitRockBlocks.POLISHED_SANDSTONE.get(), "Grès poli");
                provider.add(InitRockBlocks.POLISHED_SANDSTONE_SLAB.get(), "Dalle de grès poli");
                provider.add(InitRockBlocks.POLISHED_SANDSTONE_STAIRS.get(), "Escalier en grès poli");
                provider.add(InitRockBlocks.POLISHED_SANDSTONE_WALL.get(), "Muret en grès poli");
                provider.add(InitRockBlocks.POLISHED_SANDSTONE_PRESSURE_PLATE.get(), "Plaque de pression en grès poli");

                provider.add(InitRockBlocks.SANDSTONE_PAVING.get(), "Pavés de grès");
                provider.add(InitRockBlocks.SANDSTONE_PAVING_SLAB.get(), "Dalle en pavés de grès");
                provider.add(InitRockBlocks.SANDSTONE_PAVING_STAIRS.get(), "Escalier en pavés de grès");
                provider.add(InitRockBlocks.SANDSTONE_PAVING_WALL.get(), "Muret en pavés de grès");
                provider.add(InitRockBlocks.SANDSTONE_PAVING_PRESSURE_PLATE.get(), "Plaque de pression en pavés de grès");

                provider.add(InitRockBlocks.SANDSTONE_TILES.get(), "Carrelage en grès");
                provider.add(InitRockBlocks.SANDSTONE_TILES_SLAB.get(), "Dalle en carrelage de grès");
                provider.add(InitRockBlocks.SANDSTONE_TILES_STAIRS.get(), "Escalier en carrelage de grès");
                provider.add(InitRockBlocks.SANDSTONE_TILES_WALL.get(), "Muret en carrelage de grès");
                provider.add(InitRockBlocks.SANDSTONE_TILES_PRESSURE_PLATE.get(), "Plaque de pression en carrelage de grès");

                provider.add(InitRockBlocks.SANDSTONE_BRICKS.get(), "Briques de grès");
                provider.add(InitRockBlocks.SANDSTONE_BRICKS_SLAB.get(), "Dalle en briques de grès");
                provider.add(InitRockBlocks.SANDSTONE_BRICKS_STAIRS.get(), "Escaliers en briques de grès");
                provider.add(InitRockBlocks.SANDSTONE_BRICKS_WALL.get(), "Muret en briques de grès");
                provider.add(InitRockBlocks.SANDSTONE_BRICKS_PRESSURE_PLATE.get(), "Dalle de pression en briques de grès");

                provider.add(InitRockBlocks.SANDSTONE_LARGE_BRICKS.get(), "Briques épaisses de grès");
                provider.add(InitRockBlocks.SANDSTONE_LARGE_BRICKS_SLAB.get(), "Dalle en briques épaisses de grès");
                provider.add(InitRockBlocks.SANDSTONE_LARGE_BRICKS_STAIRS.get(), "Escaliers en briques épaisses de grès");
                provider.add(InitRockBlocks.SANDSTONE_LARGE_BRICKS_WALL.get(), "Muret en briques épaisses de grès");
                provider.add(InitRockBlocks.SANDSTONE_LARGE_BRICKS_PRESSURE_PLATE.get(), "Dalle de pression en briques épaisses de grès");

                provider.add(InitRockBlocks.SANDSTONE_PAVING_STONES.get(), "Pavage de grès");
                provider.add(InitRockBlocks.SANDSTONE_PAVING_STONES_SLAB.get(), "Dalle en pavages de grès");
                provider.add(InitRockBlocks.SANDSTONE_PAVING_STONES_STAIRS.get(), "Escalier en pavages de grès");
                provider.add(InitRockBlocks.SANDSTONE_PAVING_STONES_WALL.get(), "Muret en pavages de grès");
                provider.add(InitRockBlocks.SANDSTONE_PAVING_STONES_PRESSURE_PLATE.get(), "Plaque de pression en pavages de grès");

                provider.add(InitRockBlocks.SANDSTONE_ROOFTILES.get(), "Tuiles de grès");
                provider.add(InitRockBlocks.SANDSTONE_ROOFTILES_SLAB.get(), "Dalle en tuile de grès");
                provider.add(InitRockBlocks.SANDSTONE_ROOFTILES_STAIRS.get(), "Escalier en tuile de grès");

                // Red Sandstone
                provider.add(InitRockBlocks.RED_SANDSTONE_BUTTON.get(), "Bouton en grès rouge");

                provider.add(InitRockBlocks.SMOOTH_RED_SANDSTONE_WALL.get(), "Muret de grès rouge lisse");
                provider.add(InitRockBlocks.SMOOTH_RED_SANDSTONE_PRESSURE_PLATE.get(), "Plaque de pression en grès rouge lisse");

                provider.add(InitRockBlocks.POLISHED_RED_SANDSTONE.get(), "Grès poli");
                provider.add(InitRockBlocks.POLISHED_RED_SANDSTONE_SLAB.get(), "Dalle de grès rouge poli");
                provider.add(InitRockBlocks.POLISHED_RED_SANDSTONE_STAIRS.get(), "Escalier en grès rouge poli");
                provider.add(InitRockBlocks.POLISHED_RED_SANDSTONE_WALL.get(), "Muret en grès rouge poli");
                provider.add(InitRockBlocks.POLISHED_RED_SANDSTONE_PRESSURE_PLATE.get(), "Plaque de pression en grès rouge poli");

                provider.add(InitRockBlocks.RED_SANDSTONE_PAVING.get(), "Pavés de grès rouge");
                provider.add(InitRockBlocks.RED_SANDSTONE_PAVING_SLAB.get(), "Dalle en pavés de grès rouge");
                provider.add(InitRockBlocks.RED_SANDSTONE_PAVING_STAIRS.get(), "Escalier en pavés de grès rouge");
                provider.add(InitRockBlocks.RED_SANDSTONE_PAVING_WALL.get(), "Muret en pavés de grès rouge");
                provider.add(InitRockBlocks.RED_SANDSTONE_PAVING_PRESSURE_PLATE.get(), "Plaque de pression en pavés de grès rouge");

                provider.add(InitRockBlocks.RED_SANDSTONE_TILES.get(), "Carrelage en grès rouge");
                provider.add(InitRockBlocks.RED_SANDSTONE_TILES_SLAB.get(), "Dalle en carrelage de grès rouge");
                provider.add(InitRockBlocks.RED_SANDSTONE_TILES_STAIRS.get(), "Escalier en carrelage de grès rouge");
                provider.add(InitRockBlocks.RED_SANDSTONE_TILES_WALL.get(), "Muret en carrelage de grès rouge");
                provider.add(InitRockBlocks.RED_SANDSTONE_TILES_PRESSURE_PLATE.get(), "Plaque de pression en carrelage de grès rouge");

                provider.add(InitRockBlocks.RED_SANDSTONE_BRICKS.get(), "Briques de grès rouge");
                provider.add(InitRockBlocks.RED_SANDSTONE_BRICKS_SLAB.get(), "Dalle en briques de grès rouge");
                provider.add(InitRockBlocks.RED_SANDSTONE_BRICKS_STAIRS.get(), "Escaliers en briques de grès rouge");
                provider.add(InitRockBlocks.RED_SANDSTONE_BRICKS_WALL.get(), "Muret en briques de grès rouge");
                provider.add(InitRockBlocks.RED_SANDSTONE_BRICKS_PRESSURE_PLATE.get(), "Dalle de pression en briques de grès rouge");

                provider.add(InitRockBlocks.RED_SANDSTONE_LARGE_BRICKS.get(), "Briques épaisses de grès rouge");
                provider.add(InitRockBlocks.RED_SANDSTONE_LARGE_BRICKS_SLAB.get(), "Dalle en briques épaisses de grès rouge");
                provider.add(InitRockBlocks.RED_SANDSTONE_LARGE_BRICKS_STAIRS.get(), "Escaliers en briques épaisses de grès rouge");
                provider.add(InitRockBlocks.RED_SANDSTONE_LARGE_BRICKS_WALL.get(), "Muret en briques épaisses de grès rouge");
                provider.add(InitRockBlocks.RED_SANDSTONE_LARGE_BRICKS_PRESSURE_PLATE.get(), "Dalle de pression en briques épaisses de grès rouge");

                provider.add(InitRockBlocks.RED_SANDSTONE_PAVING_STONES.get(), "Pavage de grès rouge");
                provider.add(InitRockBlocks.RED_SANDSTONE_PAVING_STONES_SLAB.get(), "Dalle en pavages de grès rouge");
                provider.add(InitRockBlocks.RED_SANDSTONE_PAVING_STONES_STAIRS.get(), "Escalier en pavages de grès rouge");
                provider.add(InitRockBlocks.RED_SANDSTONE_PAVING_STONES_WALL.get(), "Muret en pavages de grès rouge");
                provider.add(InitRockBlocks.RED_SANDSTONE_PAVING_STONES_PRESSURE_PLATE.get(), "Plaque de pression en pavages de grès rouge");

                provider.add(InitRockBlocks.RED_SANDSTONE_ROOFTILES.get(), "Tuiles de grès rouge");
                provider.add(InitRockBlocks.RED_SANDSTONE_ROOFTILES_SLAB.get(), "Dalle en tuile de grès rouge");
                provider.add(InitRockBlocks.RED_SANDSTONE_ROOFTILES_STAIRS.get(), "Escalier en tuile de grès rouge");

                // Basalt
                provider.add(InitRockBlocks.TERRACOTTA_SLAB.get(), "Dalle en terre cuite");
                provider.add(InitRockBlocks.TERRACOTTA_STAIRS.get(), "Escalier en terre cuite");
                provider.add(InitRockBlocks.TERRACOTTA_WALL.get(), "Muret en terre cuite");
                provider.add(InitRockBlocks.TERRACOTTA_PRESSURE_PLATE.get(), "Plaque de pression en terre cuite");
                provider.add(InitRockBlocks.TERRACOTTA_BUTTON.get(), "Bouton en terre cuite");

                provider.add(InitRockBlocks.POLISHED_TERRACOTTA.get(), "Terre cuite polie");
                provider.add(InitRockBlocks.POLISHED_TERRACOTTA_SLAB.get(), "Dalle en terre cuite polie");
                provider.add(InitRockBlocks.POLISHED_TERRACOTTA_STAIRS.get(), "Escalier en terre cuite polie");
                provider.add(InitRockBlocks.POLISHED_TERRACOTTA_WALL.get(), "Muret en terre cuite polie");
                provider.add(InitRockBlocks.POLISHED_TERRACOTTA_PRESSURE_PLATE.get(), "Plaque de pression en terre cuite polie");

                provider.add(InitRockBlocks.TERRACOTTA_PAVING.get(), "Pavés en terre cuite");
                provider.add(InitRockBlocks.TERRACOTTA_PAVING_SLAB.get(), "Dalle en pavé de terre cuite");
                provider.add(InitRockBlocks.TERRACOTTA_PAVING_STAIRS.get(), "Escalier en pavé de terre cuite");
                provider.add(InitRockBlocks.TERRACOTTA_PAVING_WALL.get(), "Muret en pavé de terre cuite");
                provider.add(InitRockBlocks.TERRACOTTA_PAVING_PRESSURE_PLATE.get(), "Plaque de pression en pavé de terre cuite");

                provider.add(InitRockBlocks.TERRACOTTA_TILES.get(), "Carrelage en terre cuite");
                provider.add(InitRockBlocks.TERRACOTTA_TILES_SLAB.get(), "Dalle en carrelage de terre cuite");
                provider.add(InitRockBlocks.TERRACOTTA_TILES_STAIRS.get(), "Escalier en carrelage de terre cuite");
                provider.add(InitRockBlocks.TERRACOTTA_TILES_WALL.get(), "Muret en carrelage de terre cuite");
                provider.add(InitRockBlocks.TERRACOTTA_TILES_PRESSURE_PLATE.get(), "Plaque de pression en carrelage de terre cuite");

                provider.add(InitRockBlocks.TERRACOTTA_BRICKS.get(), "Briques en terre cuite");
                provider.add(InitRockBlocks.TERRACOTTA_BRICKS_SLAB.get(), "Dalle en briques de terre cuite");
                provider.add(InitRockBlocks.TERRACOTTA_BRICKS_STAIRS.get(), "Escalier en briques de terre cuite");
                provider.add(InitRockBlocks.TERRACOTTA_BRICKS_WALL.get(), "Muret en briques de terre cuite");
                provider.add(InitRockBlocks.TERRACOTTA_BRICKS_PRESSURE_PLATE.get(), "Plaque de pression en briques de terre cuite");

                provider.add(InitRockBlocks.TERRACOTTA_LARGE_BRICKS.get(), "Briques épaisses en terre cuite");
                provider.add(InitRockBlocks.TERRACOTTA_LARGE_BRICKS_SLAB.get(), "Dalle en briques épaisses de terre cuite");
                provider.add(InitRockBlocks.TERRACOTTA_LARGE_BRICKS_STAIRS.get(), "Escalier en briques épaisses de terre cuite");
                provider.add(InitRockBlocks.TERRACOTTA_LARGE_BRICKS_WALL.get(), "Muret en briques épaisses de terre cuite");
                provider.add(InitRockBlocks.TERRACOTTA_LARGE_BRICKS_PRESSURE_PLATE.get(), "Plaque de pression en briques épaisses de terre cuite");

                provider.add(InitRockBlocks.TERRACOTTA_PAVING_STONES.get(), "Pavage en terre cuite");
                provider.add(InitRockBlocks.TERRACOTTA_PAVING_STONES_SLAB.get(), "Dalle en pavage de terre cuite");
                provider.add(InitRockBlocks.TERRACOTTA_PAVING_STONES_STAIRS.get(), "Escalier en pavage de terre cuite");
                provider.add(InitRockBlocks.TERRACOTTA_PAVING_STONES_WALL.get(), "Muret en pavage de terre cuite");
                provider.add(InitRockBlocks.TERRACOTTA_PAVING_STONES_PRESSURE_PLATE.get(), "Plaque de pression en pavage de terre cuite");

                provider.add(InitRockBlocks.TERRACOTTA_ROOFTILES.get(), "Tuiles de terre cuite");
                provider.add(InitRockBlocks.TERRACOTTA_ROOFTILES_SLAB.get(), "Dalle en tuile de terre cuite");
                provider.add(InitRockBlocks.TERRACOTTA_ROOFTILES_STAIRS.get(), "Escalier en tuile de terre cuite");

                provider.add("itemGroup.embellishcraft_rocks_group", "EmbellishCraft - Roches");

                break;
        }
    }

}