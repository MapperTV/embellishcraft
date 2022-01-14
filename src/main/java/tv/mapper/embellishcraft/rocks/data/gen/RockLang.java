package tv.mapper.embellishcraft.rocks.data.gen;

import java.util.Arrays;

import org.codehaus.plexus.util.StringUtils;

import tv.mapper.embellishcraft.core.data.gen.ECLang;
import tv.mapper.embellishcraft.core.util.RockType;
import tv.mapper.embellishcraft.rocks.world.level.block.InitRockBlocks;

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
                    provider.addBlock(InitRockBlocks.ROCK_BLOCKS.get(RockType.byId(j)), StringUtils.capitalise(RockType.byId(j).getName()));
                    provider.addBlock(InitRockBlocks.ROCK_STAIRS.get(RockType.byId(j)), StringUtils.capitalise(RockType.byId(j).getName()) + " Stairs");
                    provider.addBlock(InitRockBlocks.ROCK_SLABS.get(RockType.byId(j)), StringUtils.capitalise(RockType.byId(j).getName()) + " Slab");
                    provider.addBlock(InitRockBlocks.ROCK_WALLS.get(RockType.byId(j)), StringUtils.capitalise(RockType.byId(j).getName()) + " Wall");
                    provider.addBlock(InitRockBlocks.ROCK_PRESSURE_PLATES.get(RockType.byId(j)), StringUtils.capitalise(RockType.byId(j).getName()) + " Pressure Plate");
                    provider.addBlock(InitRockBlocks.ROCK_BUTTONS.get(RockType.byId(j)), StringUtils.capitalise(RockType.byId(j).getName()) + " Button");

                    // Cobbletones
                    provider.addBlock(InitRockBlocks.ROCK_COBBLESTONES.get(RockType.byId(j)), StringUtils.capitalise(RockType.byId(j).getName()) + " Cobblestone");
                    provider.addBlock(InitRockBlocks.ROCK_COBBLESTONE_STAIRS.get(RockType.byId(j)), StringUtils.capitalise(RockType.byId(j).getName()) + " Cobblestone Stairs");
                    provider.addBlock(InitRockBlocks.ROCK_COBBLESTONE_SLABS.get(RockType.byId(j)), StringUtils.capitalise(RockType.byId(j).getName()) + " Cobblestone Slab");
                    provider.addBlock(InitRockBlocks.ROCK_COBBLESTONE_WALLS.get(RockType.byId(j)), StringUtils.capitalise(RockType.byId(j).getName()) + " Cobblestone Wall");
                    provider.addBlock(InitRockBlocks.ROCK_COBBLESTONE_PRESSURE_PLATES.get(RockType.byId(j)), StringUtils.capitalise(RockType.byId(j).getName()) + " Cobblestone Pressure Plate");

                    // Cobbletone bricks
                    provider.addBlock(InitRockBlocks.ROCK_COBBLESTONE_BRICKS.get(RockType.byId(j)), StringUtils.capitalise(RockType.byId(j).getName()) + " Cobblestone Bricks");
                    provider.addBlock(InitRockBlocks.ROCK_COBBLESTONE_BRICKS_STAIRS.get(RockType.byId(j)), StringUtils.capitalise(RockType.byId(j).getName()) + " Cobblestone Bricks Stairs");
                    provider.addBlock(InitRockBlocks.ROCK_COBBLESTONE_BRICKS_SLABS.get(RockType.byId(j)), StringUtils.capitalise(RockType.byId(j).getName()) + " Cobblestone Bricks Slab");
                    provider.addBlock(InitRockBlocks.ROCK_COBBLESTONE_BRICKS_WALLS.get(RockType.byId(j)), StringUtils.capitalise(RockType.byId(j).getName()) + " Cobblestone Bricks Wall");
                    provider.addBlock(InitRockBlocks.ROCK_COBBLESTONE_BRICKS_PRESSURE_PLATES.get(RockType.byId(j)), StringUtils.capitalise(RockType.byId(j).getName()) + " Cobblestone Bricks Pressure Plate");

                    // Smooth rocks
                    provider.addBlock(InitRockBlocks.SMOOTH_ROCK_BLOCKS.get(RockType.byId(j)), "Smooth " + StringUtils.capitalise(RockType.byId(j).getName()));
                    provider.addBlock(InitRockBlocks.SMOOTH_ROCK_STAIRS.get(RockType.byId(j)), "Smooth " + StringUtils.capitalise(RockType.byId(j).getName()) + " Stairs");
                    provider.addBlock(InitRockBlocks.SMOOTH_ROCK_SLABS.get(RockType.byId(j)), "Smooth " + StringUtils.capitalise(RockType.byId(j).getName()) + " Slab");
                    provider.addBlock(InitRockBlocks.SMOOTH_ROCK_WALLS.get(RockType.byId(j)), "Smooth " + StringUtils.capitalise(RockType.byId(j).getName()) + " Wall");
                    provider.addBlock(InitRockBlocks.SMOOTH_ROCK_PRESSURE_PLATES.get(RockType.byId(j)), "Smooth " + StringUtils.capitalise(RockType.byId(j).getName()) + " Pressure Plate");

                    // Polished rocks
                    provider.addBlock(InitRockBlocks.POLISHED_ROCK_BLOCKS.get(RockType.byId(j)), "Polished " + StringUtils.capitalise(RockType.byId(j).getName()));
                    provider.addBlock(InitRockBlocks.POLISHED_ROCK_STAIRS.get(RockType.byId(j)), "Polished " + StringUtils.capitalise(RockType.byId(j).getName()) + " Stairs");
                    provider.addBlock(InitRockBlocks.POLISHED_ROCK_SLABS.get(RockType.byId(j)), "Polished " + StringUtils.capitalise(RockType.byId(j).getName()) + " Slab");
                    provider.addBlock(InitRockBlocks.POLISHED_ROCK_WALLS.get(RockType.byId(j)), "Polished " + StringUtils.capitalise(RockType.byId(j).getName()) + " Wall");
                    provider.addBlock(InitRockBlocks.POLISHED_ROCK_PRESSURE_PLATES.get(RockType.byId(j)), "Polished " + StringUtils.capitalise(RockType.byId(j).getName()) + " Pressure Plate");

                    // Rock pavings
                    provider.addBlock(InitRockBlocks.ROCK_PAVINGS.get(RockType.byId(j)), StringUtils.capitalise(RockType.byId(j).getName()) + " Paving");
                    provider.addBlock(InitRockBlocks.ROCK_PAVING_STAIRS.get(RockType.byId(j)), StringUtils.capitalise(RockType.byId(j).getName()) + " Paving Stairs");
                    provider.addBlock(InitRockBlocks.ROCK_PAVING_SLABS.get(RockType.byId(j)), StringUtils.capitalise(RockType.byId(j).getName()) + " Paving Slab");
                    provider.addBlock(InitRockBlocks.ROCK_PAVING_WALLS.get(RockType.byId(j)), StringUtils.capitalise(RockType.byId(j).getName()) + " Paving Wall");
                    provider.addBlock(InitRockBlocks.ROCK_PAVING_PRESSURE_PLATES.get(RockType.byId(j)), StringUtils.capitalise(RockType.byId(j).getName()) + " Paving Pressure Plate");

                    // Rock tiles
                    provider.addBlock(InitRockBlocks.ROCK_TILES.get(RockType.byId(j)), StringUtils.capitalise(RockType.byId(j).getName()) + " Tiles");
                    provider.addBlock(InitRockBlocks.ROCK_TILES_STAIRS.get(RockType.byId(j)), StringUtils.capitalise(RockType.byId(j).getName()) + " Tiles Stairs");
                    provider.addBlock(InitRockBlocks.ROCK_TILES_SLABS.get(RockType.byId(j)), StringUtils.capitalise(RockType.byId(j).getName()) + " Tiles Slab");
                    provider.addBlock(InitRockBlocks.ROCK_TILES_WALLS.get(RockType.byId(j)), StringUtils.capitalise(RockType.byId(j).getName()) + " Tiles Wall");
                    provider.addBlock(InitRockBlocks.ROCK_TILES_PRESSURE_PLATES.get(RockType.byId(j)), StringUtils.capitalise(RockType.byId(j).getName()) + " Tiles Pressure Plate");

                    // Rock bricks
                    provider.addBlock(InitRockBlocks.ROCK_BRICKS.get(RockType.byId(j)), StringUtils.capitalise(RockType.byId(j).getName()) + " Bricks");
                    provider.addBlock(InitRockBlocks.ROCK_BRICKS_STAIRS.get(RockType.byId(j)), StringUtils.capitalise(RockType.byId(j).getName()) + " Bricks Stairs");
                    provider.addBlock(InitRockBlocks.ROCK_BRICKS_SLABS.get(RockType.byId(j)), StringUtils.capitalise(RockType.byId(j).getName()) + " Bricks Slab");
                    provider.addBlock(InitRockBlocks.ROCK_BRICKS_WALLS.get(RockType.byId(j)), StringUtils.capitalise(RockType.byId(j).getName()) + " Bricks Wall");
                    provider.addBlock(InitRockBlocks.ROCK_BRICKS_PRESSURE_PLATES.get(RockType.byId(j)), StringUtils.capitalise(RockType.byId(j).getName()) + " Bricks Pressure Plate");

                    // Rock large bricks
                    provider.addBlock(InitRockBlocks.ROCK_LARGE_BRICKS.get(RockType.byId(j)), StringUtils.capitalise(RockType.byId(j).getName()) + " Large Bricks");
                    provider.addBlock(InitRockBlocks.ROCK_LARGE_BRICKS_STAIRS.get(RockType.byId(j)), StringUtils.capitalise(RockType.byId(j).getName()) + " Large Bricks Stairs");
                    provider.addBlock(InitRockBlocks.ROCK_LARGE_BRICKS_SLABS.get(RockType.byId(j)), StringUtils.capitalise(RockType.byId(j).getName()) + " Large Bricks Slab");
                    provider.addBlock(InitRockBlocks.ROCK_LARGE_BRICKS_WALLS.get(RockType.byId(j)), StringUtils.capitalise(RockType.byId(j).getName()) + " Large Bricks Wall");
                    provider.addBlock(InitRockBlocks.ROCK_LARGE_BRICKS_PRESSURE_PLATES.get(RockType.byId(j)), StringUtils.capitalise(RockType.byId(j).getName()) + " Large Bricks Pressure Plate");

                    // Rock paving stones
                    provider.addBlock(InitRockBlocks.ROCK_PAVING_STONES.get(RockType.byId(j)), StringUtils.capitalise(RockType.byId(j).getName()) + " Paving Stones");
                    provider.addBlock(InitRockBlocks.ROCK_PAVING_STONES_STAIRS.get(RockType.byId(j)), StringUtils.capitalise(RockType.byId(j).getName()) + " Paving Stones Stairs");
                    provider.addBlock(InitRockBlocks.ROCK_PAVING_STONES_SLABS.get(RockType.byId(j)), StringUtils.capitalise(RockType.byId(j).getName()) + " Paving Stones Slab");
                    provider.addBlock(InitRockBlocks.ROCK_PAVING_STONES_WALLS.get(RockType.byId(j)), StringUtils.capitalise(RockType.byId(j).getName()) + " Paving Stones Wall");
                    provider.addBlock(InitRockBlocks.ROCK_PAVING_STONES_PRESSURE_PLATES.get(RockType.byId(j)), StringUtils.capitalise(RockType.byId(j).getName()) + " Paving Stones Pressure Plate");

                    // Rock ornaments
                    provider.addBlock(InitRockBlocks.ROCK_ORNAMENTS.get(RockType.byId(j)), StringUtils.capitalise(RockType.byId(j).getName()) + " Ornament");
                    provider.addBlock(InitRockBlocks.ROCK_ORNAMENT_PRESSURE_PLATES.get(RockType.byId(j)), StringUtils.capitalise(RockType.byId(j).getName()) + " Ornament Pressure Plate");

                    // Rock rooftiles
                    provider.addBlock(InitRockBlocks.ROCK_ROOFTILES.get(RockType.byId(j)), StringUtils.capitalise(RockType.byId(j).getName() + " Rooftiles"));
                    provider.addBlock(InitRockBlocks.ROCK_ROOFTILES_STAIRS.get(RockType.byId(j)), StringUtils.capitalise(RockType.byId(j).getName()) + " Rooftiles Stairs");
                    provider.addBlock(InitRockBlocks.ROCK_ROOFTILES_SLABS.get(RockType.byId(j)), StringUtils.capitalise(RockType.byId(j).getName()) + " Rooftiles Slab");
                }

                provider.addBlock(InitRockBlocks.PAVING_STONES, "Paving Stones");
                provider.addBlock(InitRockBlocks.PAVING_STONES_SLAB, "Paving Stones Slab");
                provider.addBlock(InitRockBlocks.PAVING_STONES_STAIRS, "Paving Stones Stairs");
                provider.addBlock(InitRockBlocks.PAVING_STONES_WALL, "Paving Stones Wall");
                provider.addBlock(InitRockBlocks.PAVING_STONES_PRESSURE_PLATE, "Paving Stones Pressure Plate");

                // Andesite
                provider.addBlock(InitRockBlocks.SMOOTH_ANDESITE, "Smooth Andesite");
                provider.addBlock(InitRockBlocks.SMOOTH_ANDESITE_SLAB, "Smooth Andesite Slab");
                provider.addBlock(InitRockBlocks.SMOOTH_ANDESITE_STAIRS, "Smooth Andesite Stairs");
                provider.addBlock(InitRockBlocks.SMOOTH_ANDESITE_WALL, "Smooth Andesite Wall");
                provider.addBlock(InitRockBlocks.SMOOTH_ANDESITE_PRESSURE_PLATE, "Smooth Andesite Pressure Plate");
                provider.addBlock(InitRockBlocks.ANDESITE_BUTTON, "Andesite Button");

                provider.addBlock(InitRockBlocks.ANDESITE_PAVING, "Andesite Paving");
                provider.addBlock(InitRockBlocks.ANDESITE_PAVING_SLAB, "Andesite Paving Slab");
                provider.addBlock(InitRockBlocks.ANDESITE_PAVING_STAIRS, "Andesite Paving Stairs");
                provider.addBlock(InitRockBlocks.ANDESITE_PAVING_WALL, "Andesite Paving Wall");
                provider.addBlock(InitRockBlocks.ANDESITE_PAVING_PRESSURE_PLATE, "Andesite Paving Pressure Plate");

                provider.addBlock(InitRockBlocks.ANDESITE_TILES, "Andesite Tiles");
                provider.addBlock(InitRockBlocks.ANDESITE_TILES_SLAB, "Andesite Tiles Slab");
                provider.addBlock(InitRockBlocks.ANDESITE_TILES_STAIRS, "Andesite Tiles Stairs");
                provider.addBlock(InitRockBlocks.ANDESITE_TILES_WALL, "Andesite Tiles Wall");
                provider.addBlock(InitRockBlocks.ANDESITE_TILES_PRESSURE_PLATE, "Andesite Tiles Pressure Plate");

                provider.addBlock(InitRockBlocks.ANDESITE_BRICKS, "Andesite Bricks");
                provider.addBlock(InitRockBlocks.ANDESITE_BRICKS_SLAB, "Andesite Bricks Slab");
                provider.addBlock(InitRockBlocks.ANDESITE_BRICKS_STAIRS, "Andesite Bricks Stairs");
                provider.addBlock(InitRockBlocks.ANDESITE_BRICKS_WALL, "Andesite Bricks Wall");
                provider.addBlock(InitRockBlocks.ANDESITE_BRICKS_PRESSURE_PLATE, "Andesite Bricks Pressure Plate");

                provider.addBlock(InitRockBlocks.ANDESITE_LARGE_BRICKS, "Andesite Large Bricks");
                provider.addBlock(InitRockBlocks.ANDESITE_LARGE_BRICKS_SLAB, "Andesite Large Bricks Slab");
                provider.addBlock(InitRockBlocks.ANDESITE_LARGE_BRICKS_STAIRS, "Andesite Large Bricks Stairs");
                provider.addBlock(InitRockBlocks.ANDESITE_LARGE_BRICKS_WALL, "Andesite Large Bricks Wall");
                provider.addBlock(InitRockBlocks.ANDESITE_LARGE_BRICKS_PRESSURE_PLATE, "Andesite Large Bricks Pressure Plate");

                provider.addBlock(InitRockBlocks.ANDESITE_PAVING_STONES, "Andesite Paving Stones");
                provider.addBlock(InitRockBlocks.ANDESITE_PAVING_STONES_SLAB, "Andesite Paving Stones Slab");
                provider.addBlock(InitRockBlocks.ANDESITE_PAVING_STONES_STAIRS, "Andesite Paving Stones Stairs");
                provider.addBlock(InitRockBlocks.ANDESITE_PAVING_STONES_WALL, "Andesite Paving Stones Wall");
                provider.addBlock(InitRockBlocks.ANDESITE_PAVING_STONES_PRESSURE_PLATE, "Andesite Paving Stones Pressure Plate");

                provider.addBlock(InitRockBlocks.ANDESITE_ORNAMENT, "Andesite Ornament");
                provider.addBlock(InitRockBlocks.ANDESITE_ORNAMENT_PRESSURE_PLATE, "Andesite Ornament Pressure Plate");

                provider.addBlock(InitRockBlocks.ANDESITE_ROOFTILES, "Andesite Rooftiles");
                provider.addBlock(InitRockBlocks.ANDESITE_ROOFTILES_SLAB, "Andesite Rooftiles Slab");
                provider.addBlock(InitRockBlocks.ANDESITE_ROOFTILES_STAIRS, "Andesite Rooftiles Stairs");

                // Diorite
                provider.addBlock(InitRockBlocks.SMOOTH_DIORITE, "Smooth Diorite");
                provider.addBlock(InitRockBlocks.SMOOTH_DIORITE_SLAB, "Smooth Diorite Slab");
                provider.addBlock(InitRockBlocks.SMOOTH_DIORITE_STAIRS, "Smooth Diorite Stairs");
                provider.addBlock(InitRockBlocks.SMOOTH_DIORITE_WALL, "Smooth Diorite Wall");
                provider.addBlock(InitRockBlocks.SMOOTH_DIORITE_PRESSURE_PLATE, "Smooth Diorite Pressure Plate");
                provider.addBlock(InitRockBlocks.DIORITE_BUTTON, "Diorite Button");

                provider.addBlock(InitRockBlocks.DIORITE_PAVING, "Diorite Paving");
                provider.addBlock(InitRockBlocks.DIORITE_PAVING_SLAB, "Diorite Paving Slab");
                provider.addBlock(InitRockBlocks.DIORITE_PAVING_STAIRS, "Diorite Paving Stairs");
                provider.addBlock(InitRockBlocks.DIORITE_PAVING_WALL, "Diorite Paving Wall");
                provider.addBlock(InitRockBlocks.DIORITE_PAVING_PRESSURE_PLATE, "Diorite Paving Pressure Plate");

                provider.addBlock(InitRockBlocks.DIORITE_TILES, "Diorite Tiles");
                provider.addBlock(InitRockBlocks.DIORITE_TILES_SLAB, "Diorite Tiles Slab");
                provider.addBlock(InitRockBlocks.DIORITE_TILES_STAIRS, "Diorite Tiles Stairs");
                provider.addBlock(InitRockBlocks.DIORITE_TILES_WALL, "Diorite Tiles Wall");
                provider.addBlock(InitRockBlocks.DIORITE_TILES_PRESSURE_PLATE, "Diorite Tiles Pressure Plate");

                provider.addBlock(InitRockBlocks.DIORITE_BRICKS, "Diorite Bricks");
                provider.addBlock(InitRockBlocks.DIORITE_BRICKS_SLAB, "Diorite Bricks Slab");
                provider.addBlock(InitRockBlocks.DIORITE_BRICKS_STAIRS, "Diorite Bricks Stairs");
                provider.addBlock(InitRockBlocks.DIORITE_BRICKS_WALL, "Diorite Bricks Wall");
                provider.addBlock(InitRockBlocks.DIORITE_BRICKS_PRESSURE_PLATE, "Diorite Bricks Pressure Plate");

                provider.addBlock(InitRockBlocks.DIORITE_LARGE_BRICKS, "Diorite Large Bricks");
                provider.addBlock(InitRockBlocks.DIORITE_LARGE_BRICKS_SLAB, "Diorite Large Bricks Slab");
                provider.addBlock(InitRockBlocks.DIORITE_LARGE_BRICKS_STAIRS, "Diorite Large Bricks Stairs");
                provider.addBlock(InitRockBlocks.DIORITE_LARGE_BRICKS_WALL, "Diorite Large Bricks Wall");
                provider.addBlock(InitRockBlocks.DIORITE_LARGE_BRICKS_PRESSURE_PLATE, "Diorite Large Bricks Pressure Plate");

                provider.addBlock(InitRockBlocks.DIORITE_PAVING_STONES, "Diorite Paving Stones");
                provider.addBlock(InitRockBlocks.DIORITE_PAVING_STONES_SLAB, "Diorite Paving Stones Slab");
                provider.addBlock(InitRockBlocks.DIORITE_PAVING_STONES_STAIRS, "Diorite Paving Stones Stairs");
                provider.addBlock(InitRockBlocks.DIORITE_PAVING_STONES_WALL, "Diorite Paving Stones Wall");
                provider.addBlock(InitRockBlocks.DIORITE_PAVING_STONES_PRESSURE_PLATE, "Diorite Paving Stones Pressure Plate");

                provider.addBlock(InitRockBlocks.DIORITE_ORNAMENT, "Diorite Ornament");
                provider.addBlock(InitRockBlocks.DIORITE_ORNAMENT_PRESSURE_PLATE, "Diorite Ornament Pressure Plate");

                provider.addBlock(InitRockBlocks.DIORITE_ROOFTILES, "Diorite Rooftiles");
                provider.addBlock(InitRockBlocks.DIORITE_ROOFTILES_SLAB, "Diorite Rooftiles Slab");
                provider.addBlock(InitRockBlocks.DIORITE_ROOFTILES_STAIRS, "Diorite Rooftiles Stairs");

                // Granite
                provider.addBlock(InitRockBlocks.SMOOTH_GRANITE, "Smooth Granite");
                provider.addBlock(InitRockBlocks.SMOOTH_GRANITE_SLAB, "Smooth Granite Slab");
                provider.addBlock(InitRockBlocks.SMOOTH_GRANITE_STAIRS, "Smooth Granite Stairs");
                provider.addBlock(InitRockBlocks.SMOOTH_GRANITE_WALL, "Smooth Granite Wall");
                provider.addBlock(InitRockBlocks.SMOOTH_GRANITE_PRESSURE_PLATE, "Smooth Granite Pressure Plate");
                provider.addBlock(InitRockBlocks.GRANITE_BUTTON, "Granite Button");

                provider.addBlock(InitRockBlocks.GRANITE_PAVING, "Granite Paving");
                provider.addBlock(InitRockBlocks.GRANITE_PAVING_SLAB, "Granite Paving Slab");
                provider.addBlock(InitRockBlocks.GRANITE_PAVING_STAIRS, "Granite Paving Stairs");
                provider.addBlock(InitRockBlocks.GRANITE_PAVING_WALL, "Granite Paving Wall");
                provider.addBlock(InitRockBlocks.GRANITE_PAVING_PRESSURE_PLATE, "Granite Paving Pressure Plate");

                provider.addBlock(InitRockBlocks.GRANITE_TILES, "Granite Tiles");
                provider.addBlock(InitRockBlocks.GRANITE_TILES_SLAB, "Granite Tiles Slab");
                provider.addBlock(InitRockBlocks.GRANITE_TILES_STAIRS, "Granite Tiles Stairs");
                provider.addBlock(InitRockBlocks.GRANITE_TILES_WALL, "Granite Tiles Wall");
                provider.addBlock(InitRockBlocks.GRANITE_TILES_PRESSURE_PLATE, "Granite Tiles Pressure Plate");

                provider.addBlock(InitRockBlocks.GRANITE_BRICKS, "Granite Bricks");
                provider.addBlock(InitRockBlocks.GRANITE_BRICKS_SLAB, "Granite Bricks Slab");
                provider.addBlock(InitRockBlocks.GRANITE_BRICKS_STAIRS, "Granite Bricks Stairs");
                provider.addBlock(InitRockBlocks.GRANITE_BRICKS_WALL, "Granite Bricks Wall");
                provider.addBlock(InitRockBlocks.GRANITE_BRICKS_PRESSURE_PLATE, "Granite Bricks Pressure Plate");

                provider.addBlock(InitRockBlocks.GRANITE_LARGE_BRICKS, "Granite Large Bricks");
                provider.addBlock(InitRockBlocks.GRANITE_LARGE_BRICKS_SLAB, "Granite Large Bricks Slab");
                provider.addBlock(InitRockBlocks.GRANITE_LARGE_BRICKS_STAIRS, "Granite Large Bricks Stairs");
                provider.addBlock(InitRockBlocks.GRANITE_LARGE_BRICKS_WALL, "Granite Large Bricks Wall");
                provider.addBlock(InitRockBlocks.GRANITE_LARGE_BRICKS_PRESSURE_PLATE, "Granite Large Bricks Pressure Plate");

                provider.addBlock(InitRockBlocks.GRANITE_PAVING_STONES, "Granite Paving Stones");
                provider.addBlock(InitRockBlocks.GRANITE_PAVING_STONES_SLAB, "Granite Paving Stones Slab");
                provider.addBlock(InitRockBlocks.GRANITE_PAVING_STONES_STAIRS, "Granite Paving Stones Stairs");
                provider.addBlock(InitRockBlocks.GRANITE_PAVING_STONES_WALL, "Granite Paving Stones Wall");
                provider.addBlock(InitRockBlocks.GRANITE_PAVING_STONES_PRESSURE_PLATE, "Granite Paving Stones Pressure Plate");

                provider.addBlock(InitRockBlocks.GRANITE_ORNAMENT, "Granite Ornament");
                provider.addBlock(InitRockBlocks.GRANITE_ORNAMENT_PRESSURE_PLATE, "Granite Ornament Pressure Plate");

                provider.addBlock(InitRockBlocks.GRANITE_ROOFTILES, "Granite Rooftiles");
                provider.addBlock(InitRockBlocks.GRANITE_ROOFTILES_SLAB, "Granite Rooftiles Slab");
                provider.addBlock(InitRockBlocks.GRANITE_ROOFTILES_STAIRS, "Granite Rooftiles Stairs");

                // Sandstone
                provider.addBlock(InitRockBlocks.SANDSTONE_BUTTON, "Sandstone Button");

                provider.addBlock(InitRockBlocks.SMOOTH_SANDSTONE_WALL, "Smooth Sandstone Wall");
                provider.addBlock(InitRockBlocks.SMOOTH_SANDSTONE_PRESSURE_PLATE, "Smooth Sandstone Pressure Plate");

                provider.addBlock(InitRockBlocks.POLISHED_SANDSTONE, "Polished Sandstone");
                provider.addBlock(InitRockBlocks.POLISHED_SANDSTONE_SLAB, "Polished Sandstone Slab");
                provider.addBlock(InitRockBlocks.POLISHED_SANDSTONE_STAIRS, "Polished Sandstone Stairs");
                provider.addBlock(InitRockBlocks.POLISHED_SANDSTONE_WALL, "Polished Sandstone Wall");
                provider.addBlock(InitRockBlocks.POLISHED_SANDSTONE_PRESSURE_PLATE, "Polished Sandstone Pressure Plate");

                provider.addBlock(InitRockBlocks.SANDSTONE_PAVING, "Sandstone Paving");
                provider.addBlock(InitRockBlocks.SANDSTONE_PAVING_SLAB, "Sandstone Paving Slab");
                provider.addBlock(InitRockBlocks.SANDSTONE_PAVING_STAIRS, "Sandstone Paving Stairs");
                provider.addBlock(InitRockBlocks.SANDSTONE_PAVING_WALL, "Sandstone Paving Wall");
                provider.addBlock(InitRockBlocks.SANDSTONE_PAVING_PRESSURE_PLATE, "Sandstone Paving Pressure Plate");

                provider.addBlock(InitRockBlocks.SANDSTONE_TILES, "Sandstone Tiles");
                provider.addBlock(InitRockBlocks.SANDSTONE_TILES_SLAB, "Sandstone Tiles Slab");
                provider.addBlock(InitRockBlocks.SANDSTONE_TILES_STAIRS, "Sandstone Tiles Stairs");
                provider.addBlock(InitRockBlocks.SANDSTONE_TILES_WALL, "Sandstone Tiles Wall");
                provider.addBlock(InitRockBlocks.SANDSTONE_TILES_PRESSURE_PLATE, "Sandstone Tiles Pressure Plate");

                provider.addBlock(InitRockBlocks.SANDSTONE_BRICKS, "Sandstone Bricks");
                provider.addBlock(InitRockBlocks.SANDSTONE_BRICKS_SLAB, "Sandstone Bricks Slab");
                provider.addBlock(InitRockBlocks.SANDSTONE_BRICKS_STAIRS, "Sandstone Bricks Stairs");
                provider.addBlock(InitRockBlocks.SANDSTONE_BRICKS_WALL, "Sandstone Bricks Wall");
                provider.addBlock(InitRockBlocks.SANDSTONE_BRICKS_PRESSURE_PLATE, "Sandstone Bricks Pressure Plate");

                provider.addBlock(InitRockBlocks.SANDSTONE_LARGE_BRICKS, "Sandstone Large Bricks");
                provider.addBlock(InitRockBlocks.SANDSTONE_LARGE_BRICKS_SLAB, "Sandstone Large Bricks Slab");
                provider.addBlock(InitRockBlocks.SANDSTONE_LARGE_BRICKS_STAIRS, "Sandstone Large Bricks Stairs");
                provider.addBlock(InitRockBlocks.SANDSTONE_LARGE_BRICKS_WALL, "Sandstone Large Bricks Wall");
                provider.addBlock(InitRockBlocks.SANDSTONE_LARGE_BRICKS_PRESSURE_PLATE, "Sandstone Large Bricks Pressure Plate");

                provider.addBlock(InitRockBlocks.SANDSTONE_PAVING_STONES, "Sandstone Paving Stones");
                provider.addBlock(InitRockBlocks.SANDSTONE_PAVING_STONES_SLAB, "Sandstone Paving Stones Slab");
                provider.addBlock(InitRockBlocks.SANDSTONE_PAVING_STONES_STAIRS, "Sandstone Paving Stones Stairs");
                provider.addBlock(InitRockBlocks.SANDSTONE_PAVING_STONES_WALL, "Sandstone Paving Stones Wall");
                provider.addBlock(InitRockBlocks.SANDSTONE_PAVING_STONES_PRESSURE_PLATE, "Sandstone Paving Stones Pressure Plate");

                provider.addBlock(InitRockBlocks.SANDSTONE_ROOFTILES, "Sandstone Rooftiles");
                provider.addBlock(InitRockBlocks.SANDSTONE_ROOFTILES_SLAB, "Sandstone Rooftiles Slab");
                provider.addBlock(InitRockBlocks.SANDSTONE_ROOFTILES_STAIRS, "Sandstone Rooftiles Stairs");

                // Red Sandstone
                provider.addBlock(InitRockBlocks.RED_SANDSTONE_BUTTON, "Red Sandstone Button");

                provider.addBlock(InitRockBlocks.SMOOTH_RED_SANDSTONE_WALL, "Smooth Red Sandstone Wall");
                provider.addBlock(InitRockBlocks.SMOOTH_RED_SANDSTONE_PRESSURE_PLATE, "Smooth Red Sandstone Pressure Plate");

                provider.addBlock(InitRockBlocks.POLISHED_RED_SANDSTONE, "Polished Red Sandstone");
                provider.addBlock(InitRockBlocks.POLISHED_RED_SANDSTONE_SLAB, "Polished Red Sandstone Slab");
                provider.addBlock(InitRockBlocks.POLISHED_RED_SANDSTONE_STAIRS, "Polished Red Sandstone Stairs");
                provider.addBlock(InitRockBlocks.POLISHED_RED_SANDSTONE_WALL, "Polished Red Sandstone Wall");
                provider.addBlock(InitRockBlocks.POLISHED_RED_SANDSTONE_PRESSURE_PLATE, "Polished Red Sandstone Pressure Plate");

                provider.addBlock(InitRockBlocks.RED_SANDSTONE_PAVING, "Red Sandstone Paving");
                provider.addBlock(InitRockBlocks.RED_SANDSTONE_PAVING_SLAB, "Red Sandstone Paving Slab");
                provider.addBlock(InitRockBlocks.RED_SANDSTONE_PAVING_STAIRS, "Red Sandstone Paving Stairs");
                provider.addBlock(InitRockBlocks.RED_SANDSTONE_PAVING_WALL, "Red Sandstone Paving Wall");
                provider.addBlock(InitRockBlocks.RED_SANDSTONE_PAVING_PRESSURE_PLATE, "Red Sandstone Paving Pressure Plate");

                provider.addBlock(InitRockBlocks.RED_SANDSTONE_TILES, "Red Sandstone Tiles");
                provider.addBlock(InitRockBlocks.RED_SANDSTONE_TILES_SLAB, "Red Sandstone Tiles Slab");
                provider.addBlock(InitRockBlocks.RED_SANDSTONE_TILES_STAIRS, "Red Sandstone Tiles Stairs");
                provider.addBlock(InitRockBlocks.RED_SANDSTONE_TILES_WALL, "Red Sandstone Tiles Wall");
                provider.addBlock(InitRockBlocks.RED_SANDSTONE_TILES_PRESSURE_PLATE, "Red Sandstone Tiles Pressure Plate");

                provider.addBlock(InitRockBlocks.RED_SANDSTONE_BRICKS, "Red Sandstone Bricks");
                provider.addBlock(InitRockBlocks.RED_SANDSTONE_BRICKS_SLAB, "Red Sandstone Bricks Slab");
                provider.addBlock(InitRockBlocks.RED_SANDSTONE_BRICKS_STAIRS, "Red Sandstone Bricks Stairs");
                provider.addBlock(InitRockBlocks.RED_SANDSTONE_BRICKS_WALL, "Red Sandstone Bricks Wall");
                provider.addBlock(InitRockBlocks.RED_SANDSTONE_BRICKS_PRESSURE_PLATE, "Red Sandstone Bricks Pressure Plate");

                provider.addBlock(InitRockBlocks.RED_SANDSTONE_LARGE_BRICKS, "Red Sandstone Large Bricks");
                provider.addBlock(InitRockBlocks.RED_SANDSTONE_LARGE_BRICKS_SLAB, "Red Sandstone Large Bricks Slab");
                provider.addBlock(InitRockBlocks.RED_SANDSTONE_LARGE_BRICKS_STAIRS, "Red Sandstone Large Bricks Stairs");
                provider.addBlock(InitRockBlocks.RED_SANDSTONE_LARGE_BRICKS_WALL, "Red Sandstone Large Bricks Wall");
                provider.addBlock(InitRockBlocks.RED_SANDSTONE_LARGE_BRICKS_PRESSURE_PLATE, "Red Sandstone Large Bricks Pressure Plate");

                provider.addBlock(InitRockBlocks.RED_SANDSTONE_PAVING_STONES, "Red Sandstone Paving Stones");
                provider.addBlock(InitRockBlocks.RED_SANDSTONE_PAVING_STONES_SLAB, "Red Sandstone Paving Stones Slab");
                provider.addBlock(InitRockBlocks.RED_SANDSTONE_PAVING_STONES_STAIRS, "Red Sandstone Paving Stones Stairs");
                provider.addBlock(InitRockBlocks.RED_SANDSTONE_PAVING_STONES_WALL, "Red Sandstone Paving Stones Wall");
                provider.addBlock(InitRockBlocks.RED_SANDSTONE_PAVING_STONES_PRESSURE_PLATE, "Red Sandstone Paving Stones Pressure Plate");

                provider.addBlock(InitRockBlocks.RED_SANDSTONE_ROOFTILES, "Red Sandstone Rooftiles");
                provider.addBlock(InitRockBlocks.RED_SANDSTONE_ROOFTILES_SLAB, "Red Sandstone Rooftiles Slab");
                provider.addBlock(InitRockBlocks.RED_SANDSTONE_ROOFTILES_STAIRS, "Red Sandstone Rooftiles Stairs");

                // Terracotta
                provider.addBlock(InitRockBlocks.TERRACOTTA_SLAB, "Terracotta Slab");
                provider.addBlock(InitRockBlocks.TERRACOTTA_STAIRS, "Terracotta Stairs");
                provider.addBlock(InitRockBlocks.TERRACOTTA_WALL, "Terracotta Wall");
                provider.addBlock(InitRockBlocks.TERRACOTTA_PRESSURE_PLATE, "Terracotta Pressure Plate");
                provider.addBlock(InitRockBlocks.TERRACOTTA_BUTTON, "Terracotta Button");

                provider.addBlock(InitRockBlocks.POLISHED_TERRACOTTA, "Polished Terracotta");
                provider.addBlock(InitRockBlocks.POLISHED_TERRACOTTA_SLAB, "Polished Terracotta Slab");
                provider.addBlock(InitRockBlocks.POLISHED_TERRACOTTA_STAIRS, "Polished Terracotta Stairs");
                provider.addBlock(InitRockBlocks.POLISHED_TERRACOTTA_WALL, "Polished Terracotta Wall");
                provider.addBlock(InitRockBlocks.POLISHED_TERRACOTTA_PRESSURE_PLATE, "Polished Terracotta Pressure Plate");

                provider.addBlock(InitRockBlocks.TERRACOTTA_PAVING, "Terracotta Paving");
                provider.addBlock(InitRockBlocks.TERRACOTTA_PAVING_SLAB, "Terracotta Paving Slab");
                provider.addBlock(InitRockBlocks.TERRACOTTA_PAVING_STAIRS, "Terracotta Paving Stairs");
                provider.addBlock(InitRockBlocks.TERRACOTTA_PAVING_WALL, "Terracotta Paving Wall");
                provider.addBlock(InitRockBlocks.TERRACOTTA_PAVING_PRESSURE_PLATE, "Terracotta Paving Pressure Plate");

                provider.addBlock(InitRockBlocks.TERRACOTTA_TILES, "Terracotta Tiles");
                provider.addBlock(InitRockBlocks.TERRACOTTA_TILES_SLAB, "Terracotta Tiles Slab");
                provider.addBlock(InitRockBlocks.TERRACOTTA_TILES_STAIRS, "Terracotta Tiles Stairs");
                provider.addBlock(InitRockBlocks.TERRACOTTA_TILES_WALL, "Terracotta Tiles Wall");
                provider.addBlock(InitRockBlocks.TERRACOTTA_TILES_PRESSURE_PLATE, "Terracotta Tiles Pressure Plate");

                provider.addBlock(InitRockBlocks.TERRACOTTA_BRICKS, "Terracotta Bricks");
                provider.addBlock(InitRockBlocks.TERRACOTTA_BRICKS_SLAB, "Terracotta Bricks Slab");
                provider.addBlock(InitRockBlocks.TERRACOTTA_BRICKS_STAIRS, "Terracotta Bricks Stairs");
                provider.addBlock(InitRockBlocks.TERRACOTTA_BRICKS_WALL, "Terracotta Bricks Wall");
                provider.addBlock(InitRockBlocks.TERRACOTTA_BRICKS_PRESSURE_PLATE, "Terracotta Bricks Pressure Plate");

                provider.addBlock(InitRockBlocks.TERRACOTTA_LARGE_BRICKS, "Terracotta Large Bricks");
                provider.addBlock(InitRockBlocks.TERRACOTTA_LARGE_BRICKS_SLAB, "Terracotta Large Bricks Slab");
                provider.addBlock(InitRockBlocks.TERRACOTTA_LARGE_BRICKS_STAIRS, "Terracotta Large Bricks Stairs");
                provider.addBlock(InitRockBlocks.TERRACOTTA_LARGE_BRICKS_WALL, "Terracotta Large Bricks Wall");
                provider.addBlock(InitRockBlocks.TERRACOTTA_LARGE_BRICKS_PRESSURE_PLATE, "Terracotta Large Bricks Pressure Plate");

                provider.addBlock(InitRockBlocks.TERRACOTTA_PAVING_STONES, "Terracotta Paving Stones");
                provider.addBlock(InitRockBlocks.TERRACOTTA_PAVING_STONES_SLAB, "Terracotta Paving Stones Slab");
                provider.addBlock(InitRockBlocks.TERRACOTTA_PAVING_STONES_STAIRS, "Terracotta Paving Stones Stairs");
                provider.addBlock(InitRockBlocks.TERRACOTTA_PAVING_STONES_WALL, "Terracotta Paving Stones Wall");
                provider.addBlock(InitRockBlocks.TERRACOTTA_PAVING_STONES_PRESSURE_PLATE, "Terracotta Paving Stones Pressure Plate");

                provider.addBlock(InitRockBlocks.TERRACOTTA_ROOFTILES, "Terracotta Rooftiles");
                provider.addBlock(InitRockBlocks.TERRACOTTA_ROOFTILES_SLAB, "Terracotta Rooftiles Slab");
                provider.addBlock(InitRockBlocks.TERRACOTTA_ROOFTILES_STAIRS, "Terracotta Rooftiles Stairs");

                provider.add("itemGroup.embellishcraft_rocks_group", "EmbellishCraft - Rocks");
                break;
            case "fr_fr":
                for(int j = 0; j < Arrays.stream(RockType.values()).count(); j++)
                {
                    // Rocks
                    provider.addBlock(InitRockBlocks.ROCK_BLOCKS.get(RockType.byId(j)), StringUtils.capitalise(RockType.byId(j).getFrName()));
                    provider.addBlock(InitRockBlocks.ROCK_STAIRS.get(RockType.byId(j)), "Escalier en " + RockType.byId(j).getFrName());
                    provider.addBlock(InitRockBlocks.ROCK_SLABS.get(RockType.byId(j)), "Dalle en " + RockType.byId(j).getFrName());
                    provider.addBlock(InitRockBlocks.ROCK_WALLS.get(RockType.byId(j)), "Muret en " + RockType.byId(j).getFrName());
                    provider.addBlock(InitRockBlocks.ROCK_PRESSURE_PLATES.get(RockType.byId(j)), "Plaque de pression en " + RockType.byId(j).getFrName());
                    provider.addBlock(InitRockBlocks.ROCK_BUTTONS.get(RockType.byId(j)), "Bouton en " + RockType.byId(j).getFrName());

                    // Cobbletones
                    String de = "de ";
                    if(RockType.byId(j).getFrName() == "ardoise")
                        de = "d'";

                    provider.addBlock(InitRockBlocks.ROCK_COBBLESTONES.get(RockType.byId(j)), "Pierres " + de + RockType.byId(j).getFrName());
                    provider.addBlock(InitRockBlocks.ROCK_COBBLESTONE_STAIRS.get(RockType.byId(j)), "Escalier en pierres " + de + RockType.byId(j).getFrName());
                    provider.addBlock(InitRockBlocks.ROCK_COBBLESTONE_SLABS.get(RockType.byId(j)), "Dalle en pierres " + de + RockType.byId(j).getFrName());
                    provider.addBlock(InitRockBlocks.ROCK_COBBLESTONE_WALLS.get(RockType.byId(j)), "Muret en pierres " + de + RockType.byId(j).getFrName());
                    provider.addBlock(InitRockBlocks.ROCK_COBBLESTONE_PRESSURE_PLATES.get(RockType.byId(j)), "Plaque de pression en pierres " + de + RockType.byId(j).getFrName());

                    // Cobblestone bricks
                    provider.addBlock(InitRockBlocks.ROCK_COBBLESTONE_BRICKS.get(RockType.byId(j)), "Briques de pierres " + de + RockType.byId(j).getFrName());
                    provider.addBlock(InitRockBlocks.ROCK_COBBLESTONE_BRICKS_STAIRS.get(RockType.byId(j)), "Escalier en briques de pierres " + de + RockType.byId(j).getFrName());
                    provider.addBlock(InitRockBlocks.ROCK_COBBLESTONE_BRICKS_SLABS.get(RockType.byId(j)), "Dalle en briques de pierres " + de + RockType.byId(j).getFrName());
                    provider.addBlock(InitRockBlocks.ROCK_COBBLESTONE_BRICKS_WALLS.get(RockType.byId(j)), "Muret en briques de pierres " + de + RockType.byId(j).getFrName());
                    provider.addBlock(InitRockBlocks.ROCK_COBBLESTONE_BRICKS_PRESSURE_PLATES.get(RockType.byId(j)), "Plaque de pression en briques de pierres " + de + RockType.byId(j).getFrName());

                    // Smooth rocks
                    provider.addBlock(InitRockBlocks.SMOOTH_ROCK_BLOCKS.get(RockType.byId(j)), StringUtils.capitalise(RockType.byId(j).getFrName()) + " lisse");
                    provider.addBlock(InitRockBlocks.SMOOTH_ROCK_STAIRS.get(RockType.byId(j)), "Escalier en " + RockType.byId(j).getFrName() + " lisse");
                    provider.addBlock(InitRockBlocks.SMOOTH_ROCK_SLABS.get(RockType.byId(j)), "Dalle en " + RockType.byId(j).getFrName() + " lisse");
                    provider.addBlock(InitRockBlocks.SMOOTH_ROCK_WALLS.get(RockType.byId(j)), "Muret en " + RockType.byId(j).getFrName() + " lisse");
                    provider.addBlock(InitRockBlocks.SMOOTH_ROCK_PRESSURE_PLATES.get(RockType.byId(j)), "Plaque de pression en " + RockType.byId(j).getFrName() + " lisse");

                    // Polished rocks
                    provider.addBlock(InitRockBlocks.POLISHED_ROCK_BLOCKS.get(RockType.byId(j)), StringUtils.capitalise(RockType.byId(j).getFrName()) + " poli");
                    provider.addBlock(InitRockBlocks.POLISHED_ROCK_STAIRS.get(RockType.byId(j)), "Escalier en " + RockType.byId(j).getFrName() + " poli");
                    provider.addBlock(InitRockBlocks.POLISHED_ROCK_SLABS.get(RockType.byId(j)), "Dalle en " + RockType.byId(j).getFrName() + " poli");
                    provider.addBlock(InitRockBlocks.POLISHED_ROCK_WALLS.get(RockType.byId(j)), "Muret en " + RockType.byId(j).getFrName() + " poli");
                    provider.addBlock(InitRockBlocks.POLISHED_ROCK_PRESSURE_PLATES.get(RockType.byId(j)), "Plaque de pression en " + RockType.byId(j).getFrName() + " poli");

                    // Rock pavings
                    provider.addBlock(InitRockBlocks.ROCK_PAVINGS.get(RockType.byId(j)), "Pavés " + de + RockType.byId(j).getFrName());
                    provider.addBlock(InitRockBlocks.ROCK_PAVING_STAIRS.get(RockType.byId(j)), "Escalier en pavé " + de + RockType.byId(j).getFrName());
                    provider.addBlock(InitRockBlocks.ROCK_PAVING_SLABS.get(RockType.byId(j)), "Dalle en pavé " + de + RockType.byId(j).getFrName());
                    provider.addBlock(InitRockBlocks.ROCK_PAVING_WALLS.get(RockType.byId(j)), "Muret en pavé " + de + RockType.byId(j).getFrName());
                    provider.addBlock(InitRockBlocks.ROCK_PAVING_PRESSURE_PLATES.get(RockType.byId(j)), "Plaque de pression en pavé " + de + RockType.byId(j).getFrName());

                    // Rock tiles
                    provider.addBlock(InitRockBlocks.ROCK_TILES.get(RockType.byId(j)), "Carrelage " + de + RockType.byId(j).getFrName());
                    provider.addBlock(InitRockBlocks.ROCK_TILES_STAIRS.get(RockType.byId(j)), "Escalier en carrelage " + de + RockType.byId(j).getFrName());
                    provider.addBlock(InitRockBlocks.ROCK_TILES_SLABS.get(RockType.byId(j)), "Dalle en carrelage " + de + RockType.byId(j).getFrName());
                    provider.addBlock(InitRockBlocks.ROCK_TILES_WALLS.get(RockType.byId(j)), "Muret en carrelage " + de + RockType.byId(j).getFrName());
                    provider.addBlock(InitRockBlocks.ROCK_TILES_PRESSURE_PLATES.get(RockType.byId(j)), "Plaque de pression en carrelage " + de + RockType.byId(j).getFrName());

                    // Rock bricks
                    provider.addBlock(InitRockBlocks.ROCK_BRICKS.get(RockType.byId(j)), "Briques " + de + RockType.byId(j).getFrName());
                    provider.addBlock(InitRockBlocks.ROCK_BRICKS_STAIRS.get(RockType.byId(j)), "Escalier en briques " + de + RockType.byId(j).getFrName());
                    provider.addBlock(InitRockBlocks.ROCK_BRICKS_SLABS.get(RockType.byId(j)), "Dalle en briques " + de + RockType.byId(j).getFrName());
                    provider.addBlock(InitRockBlocks.ROCK_BRICKS_WALLS.get(RockType.byId(j)), "Muret en briques " + de + RockType.byId(j).getFrName());
                    provider.addBlock(InitRockBlocks.ROCK_BRICKS_PRESSURE_PLATES.get(RockType.byId(j)), "Plaque de pression en briques " + de + RockType.byId(j).getFrName());

                    // Rock large bricks
                    provider.addBlock(InitRockBlocks.ROCK_LARGE_BRICKS.get(RockType.byId(j)), "Briques épaisses " + de + RockType.byId(j).getFrName());
                    provider.addBlock(InitRockBlocks.ROCK_LARGE_BRICKS_STAIRS.get(RockType.byId(j)), "Escalier en briques épaisses " + de + RockType.byId(j).getFrName());
                    provider.addBlock(InitRockBlocks.ROCK_LARGE_BRICKS_SLABS.get(RockType.byId(j)), "Dalle en briques épaisses " + de + RockType.byId(j).getFrName());
                    provider.addBlock(InitRockBlocks.ROCK_LARGE_BRICKS_WALLS.get(RockType.byId(j)), "Muret en briques épaisses " + de + RockType.byId(j).getFrName());
                    provider.addBlock(InitRockBlocks.ROCK_LARGE_BRICKS_PRESSURE_PLATES.get(RockType.byId(j)), "Plaque de pression en briques épaisses " + de + RockType.byId(j).getFrName());

                    // Rock paving stones
                    provider.addBlock(InitRockBlocks.ROCK_PAVING_STONES.get(RockType.byId(j)), "Pavage " + de + RockType.byId(j).getFrName());
                    provider.addBlock(InitRockBlocks.ROCK_PAVING_STONES_STAIRS.get(RockType.byId(j)), "Escalier en pavage " + de + RockType.byId(j).getFrName());
                    provider.addBlock(InitRockBlocks.ROCK_PAVING_STONES_SLABS.get(RockType.byId(j)), "Dalle en pavage " + de + RockType.byId(j).getFrName());
                    provider.addBlock(InitRockBlocks.ROCK_PAVING_STONES_WALLS.get(RockType.byId(j)), "Muret en pavage " + de + RockType.byId(j).getFrName());
                    provider.addBlock(InitRockBlocks.ROCK_PAVING_STONES_PRESSURE_PLATES.get(RockType.byId(j)), "Plaque de pression en pavage " + de + RockType.byId(j).getFrName());

                    // Rock ornaments
                    provider.addBlock(InitRockBlocks.ROCK_ORNAMENTS.get(RockType.byId(j)), "Ornement en " + RockType.byId(j).getFrName());
                    provider.addBlock(InitRockBlocks.ROCK_ORNAMENT_PRESSURE_PLATES.get(RockType.byId(j)), "Plaque de pression avec ornement en " + RockType.byId(j).getFrName());

                    // Rock rooftiles
                    provider.addBlock(InitRockBlocks.ROCK_ROOFTILES.get(RockType.byId(j)), "Tuiles " + de + RockType.byId(j).getFrName());
                    provider.addBlock(InitRockBlocks.ROCK_ROOFTILES_STAIRS.get(RockType.byId(j)), "Escalier en tuiles " + de + RockType.byId(j).getFrName());
                    provider.addBlock(InitRockBlocks.ROCK_ROOFTILES_SLABS.get(RockType.byId(j)), "Dalle en tuiles " + de + RockType.byId(j).getFrName());
                }

                provider.addBlock(InitRockBlocks.PAVING_STONES, "Pavage");
                provider.addBlock(InitRockBlocks.PAVING_STONES_SLAB, "Dalle en pavage");
                provider.addBlock(InitRockBlocks.PAVING_STONES_STAIRS, "Escalier en pavage");
                provider.addBlock(InitRockBlocks.PAVING_STONES_WALL, "Muret en pavage");
                provider.addBlock(InitRockBlocks.PAVING_STONES_PRESSURE_PLATE, "Plaque de pression en pavage");

                // Andesite
                provider.addBlock(InitRockBlocks.ANDESITE_BUTTON, "Bouton en andésite");

                provider.addBlock(InitRockBlocks.SMOOTH_ANDESITE, "Andésite lisse");
                provider.addBlock(InitRockBlocks.SMOOTH_ANDESITE_SLAB, "Dalle en andésite lisse");
                provider.addBlock(InitRockBlocks.SMOOTH_ANDESITE_STAIRS, "Escalier en andésite lisse");
                provider.addBlock(InitRockBlocks.SMOOTH_ANDESITE_WALL, "Muret en andésite lisse");
                provider.addBlock(InitRockBlocks.SMOOTH_ANDESITE_PRESSURE_PLATE, "Plaque de pression en andésite lisse");

                provider.addBlock(InitRockBlocks.ANDESITE_PAVING, "Pavés d'andésite");
                provider.addBlock(InitRockBlocks.ANDESITE_PAVING_SLAB, "Dalle en pavé d'andésite");
                provider.addBlock(InitRockBlocks.ANDESITE_PAVING_STAIRS, "Escalier en pavé d'andésite");
                provider.addBlock(InitRockBlocks.ANDESITE_PAVING_WALL, "Muret en pavé d'andésite");
                provider.addBlock(InitRockBlocks.ANDESITE_PAVING_PRESSURE_PLATE, "Plaque de pression en pavé d'andésite");

                provider.addBlock(InitRockBlocks.ANDESITE_TILES, "Carrelage d'andésite");
                provider.addBlock(InitRockBlocks.ANDESITE_TILES_SLAB, "Dalle en carrelage d'andésite");
                provider.addBlock(InitRockBlocks.ANDESITE_TILES_STAIRS, "Escalier en carrelage d'andésite");
                provider.addBlock(InitRockBlocks.ANDESITE_TILES_WALL, "Muret en carrelage d'andésite");
                provider.addBlock(InitRockBlocks.ANDESITE_TILES_PRESSURE_PLATE, "Plaque de pression en carrelage d'andésite");

                provider.addBlock(InitRockBlocks.ANDESITE_BRICKS, "Briques d'andésite");
                provider.addBlock(InitRockBlocks.ANDESITE_BRICKS_SLAB, "Dalle en briques d'andésite");
                provider.addBlock(InitRockBlocks.ANDESITE_BRICKS_STAIRS, "Escalier en briques d'andésite");
                provider.addBlock(InitRockBlocks.ANDESITE_BRICKS_WALL, "Muret en briques d'andésite");
                provider.addBlock(InitRockBlocks.ANDESITE_BRICKS_PRESSURE_PLATE, "Plaque de pression en briques d'andésite");

                provider.addBlock(InitRockBlocks.ANDESITE_LARGE_BRICKS, "Briques épaisses d'andésite");
                provider.addBlock(InitRockBlocks.ANDESITE_LARGE_BRICKS_SLAB, "Dalle en briques épaisses d'andésite");
                provider.addBlock(InitRockBlocks.ANDESITE_LARGE_BRICKS_STAIRS, "Escalier en briques épaisses d'andésite");
                provider.addBlock(InitRockBlocks.ANDESITE_LARGE_BRICKS_WALL, "Muret en briques épaisses d'andésite");
                provider.addBlock(InitRockBlocks.ANDESITE_LARGE_BRICKS_PRESSURE_PLATE, "Plaque de pression en briques épaisses d'andésite");

                provider.addBlock(InitRockBlocks.ANDESITE_PAVING_STONES, "Pavage d'andésite");
                provider.addBlock(InitRockBlocks.ANDESITE_PAVING_STONES_SLAB, "Dalle en pavage d'andésite");
                provider.addBlock(InitRockBlocks.ANDESITE_PAVING_STONES_STAIRS, "Escalier en pavage d'andésite");
                provider.addBlock(InitRockBlocks.ANDESITE_PAVING_STONES_WALL, "Muret en pavage d'andésite");
                provider.addBlock(InitRockBlocks.ANDESITE_PAVING_STONES_PRESSURE_PLATE, "Plaque de pression en pavage d'andésite");

                provider.addBlock(InitRockBlocks.ANDESITE_ORNAMENT, "Ornement en andésite");
                provider.addBlock(InitRockBlocks.ANDESITE_ORNAMENT_PRESSURE_PLATE, "Plaque de pression avec ornement en andésite");

                provider.addBlock(InitRockBlocks.ANDESITE_ROOFTILES, "Tuiles d'andésite");
                provider.addBlock(InitRockBlocks.ANDESITE_ROOFTILES_SLAB, "Dalle en tuile d'andésite");
                provider.addBlock(InitRockBlocks.ANDESITE_ROOFTILES_STAIRS, "Escalier en tuile d'andésite");

                // Diorite
                provider.addBlock(InitRockBlocks.DIORITE_BUTTON, "Bouton en diorite");

                provider.addBlock(InitRockBlocks.SMOOTH_DIORITE, "Diorite lisse");
                provider.addBlock(InitRockBlocks.SMOOTH_DIORITE_SLAB, "Dalle en diorite lisse");
                provider.addBlock(InitRockBlocks.SMOOTH_DIORITE_STAIRS, "Escalier en diorite lisse");
                provider.addBlock(InitRockBlocks.SMOOTH_DIORITE_WALL, "Muret en diorite lisse");
                provider.addBlock(InitRockBlocks.SMOOTH_DIORITE_PRESSURE_PLATE, "Plaque de pression en diorite lisse");

                provider.addBlock(InitRockBlocks.DIORITE_PAVING, "Pavés de diorite");
                provider.addBlock(InitRockBlocks.DIORITE_PAVING_SLAB, "Dalle en pavé de diorite");
                provider.addBlock(InitRockBlocks.DIORITE_PAVING_STAIRS, "Escalier en pavé de diorite");
                provider.addBlock(InitRockBlocks.DIORITE_PAVING_WALL, "Muret en pavé de diorite");
                provider.addBlock(InitRockBlocks.DIORITE_PAVING_PRESSURE_PLATE, "Plaque de pression en pavé de diorite");

                provider.addBlock(InitRockBlocks.DIORITE_TILES, "Carrelage de diorite");
                provider.addBlock(InitRockBlocks.DIORITE_TILES_SLAB, "Dalle en carrelage de diorite");
                provider.addBlock(InitRockBlocks.DIORITE_TILES_STAIRS, "Escalier en carrelage de diorite");
                provider.addBlock(InitRockBlocks.DIORITE_TILES_WALL, "Muret en carrelage de diorite");
                provider.addBlock(InitRockBlocks.DIORITE_TILES_PRESSURE_PLATE, "Plaque de pression en carrelage de diorite");

                provider.addBlock(InitRockBlocks.DIORITE_BRICKS, "Briques de diorite");
                provider.addBlock(InitRockBlocks.DIORITE_BRICKS_SLAB, "Dalle en briques de diorite");
                provider.addBlock(InitRockBlocks.DIORITE_BRICKS_STAIRS, "Escalier en briques de diorite");
                provider.addBlock(InitRockBlocks.DIORITE_BRICKS_WALL, "Muret en briques de diorite");
                provider.addBlock(InitRockBlocks.DIORITE_BRICKS_PRESSURE_PLATE, "Plaque de pression en briques de diorite");

                provider.addBlock(InitRockBlocks.DIORITE_LARGE_BRICKS, "Briques épaisses de diorite");
                provider.addBlock(InitRockBlocks.DIORITE_LARGE_BRICKS_SLAB, "Dalle en briques épaisses de diorite");
                provider.addBlock(InitRockBlocks.DIORITE_LARGE_BRICKS_STAIRS, "Escalier en briques épaisses de diorite");
                provider.addBlock(InitRockBlocks.DIORITE_LARGE_BRICKS_WALL, "Muret en briques épaisses de diorite");
                provider.addBlock(InitRockBlocks.DIORITE_LARGE_BRICKS_PRESSURE_PLATE, "Plaque de pression en briques épaisses de diorite");

                provider.addBlock(InitRockBlocks.DIORITE_PAVING_STONES, "Pavage de diorite");
                provider.addBlock(InitRockBlocks.DIORITE_PAVING_STONES_SLAB, "Dalle en pavage de diorite");
                provider.addBlock(InitRockBlocks.DIORITE_PAVING_STONES_STAIRS, "Escalier en pavage de diorite");
                provider.addBlock(InitRockBlocks.DIORITE_PAVING_STONES_WALL, "Muret en pavage de diorite");
                provider.addBlock(InitRockBlocks.DIORITE_PAVING_STONES_PRESSURE_PLATE, "Plaque de pression en pavage de diorite");

                provider.addBlock(InitRockBlocks.DIORITE_ORNAMENT, "Ornement en diorite");
                provider.addBlock(InitRockBlocks.DIORITE_ORNAMENT_PRESSURE_PLATE, "Plaque de pression avec ornement en diorite");

                provider.addBlock(InitRockBlocks.DIORITE_ROOFTILES, "Tuiles de diorite");
                provider.addBlock(InitRockBlocks.DIORITE_ROOFTILES_SLAB, "Dalle en tuile de diorite");
                provider.addBlock(InitRockBlocks.DIORITE_ROOFTILES_STAIRS, "Escalier en tuile de diorite");

                // Granite
                provider.addBlock(InitRockBlocks.GRANITE_BUTTON, "Bouton en granite");

                provider.addBlock(InitRockBlocks.SMOOTH_GRANITE, "Granite lisse");
                provider.addBlock(InitRockBlocks.SMOOTH_GRANITE_SLAB, "Dalle en granite lisse");
                provider.addBlock(InitRockBlocks.SMOOTH_GRANITE_STAIRS, "Escalier en granite lisse");
                provider.addBlock(InitRockBlocks.SMOOTH_GRANITE_WALL, "Muret en granite lisse");
                provider.addBlock(InitRockBlocks.SMOOTH_GRANITE_PRESSURE_PLATE, "Plaque de pression en granite lisse");

                provider.addBlock(InitRockBlocks.GRANITE_PAVING, "Pavés de granite");
                provider.addBlock(InitRockBlocks.GRANITE_PAVING_SLAB, "Dalle en pavé de granite");
                provider.addBlock(InitRockBlocks.GRANITE_PAVING_STAIRS, "Escalier en pavé de granite");
                provider.addBlock(InitRockBlocks.GRANITE_PAVING_WALL, "Muret en pavé de granite");
                provider.addBlock(InitRockBlocks.GRANITE_PAVING_PRESSURE_PLATE, "Plaque de pression en pavé de granite");

                provider.addBlock(InitRockBlocks.GRANITE_TILES, "Carrelage de granite");
                provider.addBlock(InitRockBlocks.GRANITE_TILES_SLAB, "Dalle en carrelage de granite");
                provider.addBlock(InitRockBlocks.GRANITE_TILES_STAIRS, "Escalier en carrelage de granite");
                provider.addBlock(InitRockBlocks.GRANITE_TILES_WALL, "Muret en carrelage de granite");
                provider.addBlock(InitRockBlocks.GRANITE_TILES_PRESSURE_PLATE, "Plaque de pression en carrelage de granite");

                provider.addBlock(InitRockBlocks.GRANITE_BRICKS, "Briques de granite");
                provider.addBlock(InitRockBlocks.GRANITE_BRICKS_SLAB, "Dalle en briques de granite");
                provider.addBlock(InitRockBlocks.GRANITE_BRICKS_STAIRS, "Escalier en briques de granite");
                provider.addBlock(InitRockBlocks.GRANITE_BRICKS_WALL, "Muret en briques de granite");
                provider.addBlock(InitRockBlocks.GRANITE_BRICKS_PRESSURE_PLATE, "Plaque de pression en briques de granite");

                provider.addBlock(InitRockBlocks.GRANITE_LARGE_BRICKS, "Briques épaisses de granite");
                provider.addBlock(InitRockBlocks.GRANITE_LARGE_BRICKS_SLAB, "Dalle en briques épaisses de granite");
                provider.addBlock(InitRockBlocks.GRANITE_LARGE_BRICKS_STAIRS, "Escalier en briques épaisses de granite");
                provider.addBlock(InitRockBlocks.GRANITE_LARGE_BRICKS_WALL, "Muret en briques épaisses de granite");
                provider.addBlock(InitRockBlocks.GRANITE_LARGE_BRICKS_PRESSURE_PLATE, "Plaque de pression en briques épaisses de granite");

                provider.addBlock(InitRockBlocks.GRANITE_PAVING_STONES, "Pavage de granite");
                provider.addBlock(InitRockBlocks.GRANITE_PAVING_STONES_SLAB, "Dalle en pavage de granite");
                provider.addBlock(InitRockBlocks.GRANITE_PAVING_STONES_STAIRS, "Escalier en pavage de granite");
                provider.addBlock(InitRockBlocks.GRANITE_PAVING_STONES_WALL, "Muret en pavage de granite");
                provider.addBlock(InitRockBlocks.GRANITE_PAVING_STONES_PRESSURE_PLATE, "Plaque de pression en pavage de granite");

                provider.addBlock(InitRockBlocks.GRANITE_ORNAMENT, "Ornement en granite");
                provider.addBlock(InitRockBlocks.GRANITE_ORNAMENT_PRESSURE_PLATE, "Plaque de pression avec ornement en granite");

                provider.addBlock(InitRockBlocks.GRANITE_ROOFTILES, "Tuiles de granite");
                provider.addBlock(InitRockBlocks.GRANITE_ROOFTILES_SLAB, "Dalle en tuile de granite");
                provider.addBlock(InitRockBlocks.GRANITE_ROOFTILES_STAIRS, "Escalier en tuile de granite");

                // Sandstone
                provider.addBlock(InitRockBlocks.SANDSTONE_BUTTON, "Bouton en grès");

                provider.addBlock(InitRockBlocks.SMOOTH_SANDSTONE_WALL, "Muret de grès lisse");
                provider.addBlock(InitRockBlocks.SMOOTH_SANDSTONE_PRESSURE_PLATE, "Plaque de pression en grès lisse");

                provider.addBlock(InitRockBlocks.POLISHED_SANDSTONE, "Grès poli");
                provider.addBlock(InitRockBlocks.POLISHED_SANDSTONE_SLAB, "Dalle de grès poli");
                provider.addBlock(InitRockBlocks.POLISHED_SANDSTONE_STAIRS, "Escalier en grès poli");
                provider.addBlock(InitRockBlocks.POLISHED_SANDSTONE_WALL, "Muret en grès poli");
                provider.addBlock(InitRockBlocks.POLISHED_SANDSTONE_PRESSURE_PLATE, "Plaque de pression en grès poli");

                provider.addBlock(InitRockBlocks.SANDSTONE_PAVING, "Pavés de grès");
                provider.addBlock(InitRockBlocks.SANDSTONE_PAVING_SLAB, "Dalle en pavés de grès");
                provider.addBlock(InitRockBlocks.SANDSTONE_PAVING_STAIRS, "Escalier en pavés de grès");
                provider.addBlock(InitRockBlocks.SANDSTONE_PAVING_WALL, "Muret en pavés de grès");
                provider.addBlock(InitRockBlocks.SANDSTONE_PAVING_PRESSURE_PLATE, "Plaque de pression en pavés de grès");

                provider.addBlock(InitRockBlocks.SANDSTONE_TILES, "Carrelage en grès");
                provider.addBlock(InitRockBlocks.SANDSTONE_TILES_SLAB, "Dalle en carrelage de grès");
                provider.addBlock(InitRockBlocks.SANDSTONE_TILES_STAIRS, "Escalier en carrelage de grès");
                provider.addBlock(InitRockBlocks.SANDSTONE_TILES_WALL, "Muret en carrelage de grès");
                provider.addBlock(InitRockBlocks.SANDSTONE_TILES_PRESSURE_PLATE, "Plaque de pression en carrelage de grès");

                provider.addBlock(InitRockBlocks.SANDSTONE_BRICKS, "Briques de grès");
                provider.addBlock(InitRockBlocks.SANDSTONE_BRICKS_SLAB, "Dalle en briques de grès");
                provider.addBlock(InitRockBlocks.SANDSTONE_BRICKS_STAIRS, "Escaliers en briques de grès");
                provider.addBlock(InitRockBlocks.SANDSTONE_BRICKS_WALL, "Muret en briques de grès");
                provider.addBlock(InitRockBlocks.SANDSTONE_BRICKS_PRESSURE_PLATE, "Dalle de pression en briques de grès");

                provider.addBlock(InitRockBlocks.SANDSTONE_LARGE_BRICKS, "Briques épaisses de grès");
                provider.addBlock(InitRockBlocks.SANDSTONE_LARGE_BRICKS_SLAB, "Dalle en briques épaisses de grès");
                provider.addBlock(InitRockBlocks.SANDSTONE_LARGE_BRICKS_STAIRS, "Escaliers en briques épaisses de grès");
                provider.addBlock(InitRockBlocks.SANDSTONE_LARGE_BRICKS_WALL, "Muret en briques épaisses de grès");
                provider.addBlock(InitRockBlocks.SANDSTONE_LARGE_BRICKS_PRESSURE_PLATE, "Dalle de pression en briques épaisses de grès");

                provider.addBlock(InitRockBlocks.SANDSTONE_PAVING_STONES, "Pavage de grès");
                provider.addBlock(InitRockBlocks.SANDSTONE_PAVING_STONES_SLAB, "Dalle en pavages de grès");
                provider.addBlock(InitRockBlocks.SANDSTONE_PAVING_STONES_STAIRS, "Escalier en pavages de grès");
                provider.addBlock(InitRockBlocks.SANDSTONE_PAVING_STONES_WALL, "Muret en pavages de grès");
                provider.addBlock(InitRockBlocks.SANDSTONE_PAVING_STONES_PRESSURE_PLATE, "Plaque de pression en pavages de grès");

                provider.addBlock(InitRockBlocks.SANDSTONE_ROOFTILES, "Tuiles de grès");
                provider.addBlock(InitRockBlocks.SANDSTONE_ROOFTILES_SLAB, "Dalle en tuile de grès");
                provider.addBlock(InitRockBlocks.SANDSTONE_ROOFTILES_STAIRS, "Escalier en tuile de grès");

                // Red Sandstone
                provider.addBlock(InitRockBlocks.RED_SANDSTONE_BUTTON, "Bouton en grès rouge");

                provider.addBlock(InitRockBlocks.SMOOTH_RED_SANDSTONE_WALL, "Muret de grès rouge lisse");
                provider.addBlock(InitRockBlocks.SMOOTH_RED_SANDSTONE_PRESSURE_PLATE, "Plaque de pression en grès rouge lisse");

                provider.addBlock(InitRockBlocks.POLISHED_RED_SANDSTONE, "Grès poli");
                provider.addBlock(InitRockBlocks.POLISHED_RED_SANDSTONE_SLAB, "Dalle de grès rouge poli");
                provider.addBlock(InitRockBlocks.POLISHED_RED_SANDSTONE_STAIRS, "Escalier en grès rouge poli");
                provider.addBlock(InitRockBlocks.POLISHED_RED_SANDSTONE_WALL, "Muret en grès rouge poli");
                provider.addBlock(InitRockBlocks.POLISHED_RED_SANDSTONE_PRESSURE_PLATE, "Plaque de pression en grès rouge poli");

                provider.addBlock(InitRockBlocks.RED_SANDSTONE_PAVING, "Pavés de grès rouge");
                provider.addBlock(InitRockBlocks.RED_SANDSTONE_PAVING_SLAB, "Dalle en pavés de grès rouge");
                provider.addBlock(InitRockBlocks.RED_SANDSTONE_PAVING_STAIRS, "Escalier en pavés de grès rouge");
                provider.addBlock(InitRockBlocks.RED_SANDSTONE_PAVING_WALL, "Muret en pavés de grès rouge");
                provider.addBlock(InitRockBlocks.RED_SANDSTONE_PAVING_PRESSURE_PLATE, "Plaque de pression en pavés de grès rouge");

                provider.addBlock(InitRockBlocks.RED_SANDSTONE_TILES, "Carrelage en grès rouge");
                provider.addBlock(InitRockBlocks.RED_SANDSTONE_TILES_SLAB, "Dalle en carrelage de grès rouge");
                provider.addBlock(InitRockBlocks.RED_SANDSTONE_TILES_STAIRS, "Escalier en carrelage de grès rouge");
                provider.addBlock(InitRockBlocks.RED_SANDSTONE_TILES_WALL, "Muret en carrelage de grès rouge");
                provider.addBlock(InitRockBlocks.RED_SANDSTONE_TILES_PRESSURE_PLATE, "Plaque de pression en carrelage de grès rouge");

                provider.addBlock(InitRockBlocks.RED_SANDSTONE_BRICKS, "Briques de grès rouge");
                provider.addBlock(InitRockBlocks.RED_SANDSTONE_BRICKS_SLAB, "Dalle en briques de grès rouge");
                provider.addBlock(InitRockBlocks.RED_SANDSTONE_BRICKS_STAIRS, "Escaliers en briques de grès rouge");
                provider.addBlock(InitRockBlocks.RED_SANDSTONE_BRICKS_WALL, "Muret en briques de grès rouge");
                provider.addBlock(InitRockBlocks.RED_SANDSTONE_BRICKS_PRESSURE_PLATE, "Dalle de pression en briques de grès rouge");

                provider.addBlock(InitRockBlocks.RED_SANDSTONE_LARGE_BRICKS, "Briques épaisses de grès rouge");
                provider.addBlock(InitRockBlocks.RED_SANDSTONE_LARGE_BRICKS_SLAB, "Dalle en briques épaisses de grès rouge");
                provider.addBlock(InitRockBlocks.RED_SANDSTONE_LARGE_BRICKS_STAIRS, "Escaliers en briques épaisses de grès rouge");
                provider.addBlock(InitRockBlocks.RED_SANDSTONE_LARGE_BRICKS_WALL, "Muret en briques épaisses de grès rouge");
                provider.addBlock(InitRockBlocks.RED_SANDSTONE_LARGE_BRICKS_PRESSURE_PLATE, "Dalle de pression en briques épaisses de grès rouge");

                provider.addBlock(InitRockBlocks.RED_SANDSTONE_PAVING_STONES, "Pavage de grès rouge");
                provider.addBlock(InitRockBlocks.RED_SANDSTONE_PAVING_STONES_SLAB, "Dalle en pavages de grès rouge");
                provider.addBlock(InitRockBlocks.RED_SANDSTONE_PAVING_STONES_STAIRS, "Escalier en pavages de grès rouge");
                provider.addBlock(InitRockBlocks.RED_SANDSTONE_PAVING_STONES_WALL, "Muret en pavages de grès rouge");
                provider.addBlock(InitRockBlocks.RED_SANDSTONE_PAVING_STONES_PRESSURE_PLATE, "Plaque de pression en pavages de grès rouge");

                provider.addBlock(InitRockBlocks.RED_SANDSTONE_ROOFTILES, "Tuiles de grès rouge");
                provider.addBlock(InitRockBlocks.RED_SANDSTONE_ROOFTILES_SLAB, "Dalle en tuile de grès rouge");
                provider.addBlock(InitRockBlocks.RED_SANDSTONE_ROOFTILES_STAIRS, "Escalier en tuile de grès rouge");

                // Basalt
                provider.addBlock(InitRockBlocks.TERRACOTTA_SLAB, "Dalle en terre cuite");
                provider.addBlock(InitRockBlocks.TERRACOTTA_STAIRS, "Escalier en terre cuite");
                provider.addBlock(InitRockBlocks.TERRACOTTA_WALL, "Muret en terre cuite");
                provider.addBlock(InitRockBlocks.TERRACOTTA_PRESSURE_PLATE, "Plaque de pression en terre cuite");
                provider.addBlock(InitRockBlocks.TERRACOTTA_BUTTON, "Bouton en terre cuite");

                provider.addBlock(InitRockBlocks.POLISHED_TERRACOTTA, "Terre cuite polie");
                provider.addBlock(InitRockBlocks.POLISHED_TERRACOTTA_SLAB, "Dalle en terre cuite polie");
                provider.addBlock(InitRockBlocks.POLISHED_TERRACOTTA_STAIRS, "Escalier en terre cuite polie");
                provider.addBlock(InitRockBlocks.POLISHED_TERRACOTTA_WALL, "Muret en terre cuite polie");
                provider.addBlock(InitRockBlocks.POLISHED_TERRACOTTA_PRESSURE_PLATE, "Plaque de pression en terre cuite polie");

                provider.addBlock(InitRockBlocks.TERRACOTTA_PAVING, "Pavés en terre cuite");
                provider.addBlock(InitRockBlocks.TERRACOTTA_PAVING_SLAB, "Dalle en pavé de terre cuite");
                provider.addBlock(InitRockBlocks.TERRACOTTA_PAVING_STAIRS, "Escalier en pavé de terre cuite");
                provider.addBlock(InitRockBlocks.TERRACOTTA_PAVING_WALL, "Muret en pavé de terre cuite");
                provider.addBlock(InitRockBlocks.TERRACOTTA_PAVING_PRESSURE_PLATE, "Plaque de pression en pavé de terre cuite");

                provider.addBlock(InitRockBlocks.TERRACOTTA_TILES, "Carrelage en terre cuite");
                provider.addBlock(InitRockBlocks.TERRACOTTA_TILES_SLAB, "Dalle en carrelage de terre cuite");
                provider.addBlock(InitRockBlocks.TERRACOTTA_TILES_STAIRS, "Escalier en carrelage de terre cuite");
                provider.addBlock(InitRockBlocks.TERRACOTTA_TILES_WALL, "Muret en carrelage de terre cuite");
                provider.addBlock(InitRockBlocks.TERRACOTTA_TILES_PRESSURE_PLATE, "Plaque de pression en carrelage de terre cuite");

                provider.addBlock(InitRockBlocks.TERRACOTTA_BRICKS, "Briques en terre cuite");
                provider.addBlock(InitRockBlocks.TERRACOTTA_BRICKS_SLAB, "Dalle en briques de terre cuite");
                provider.addBlock(InitRockBlocks.TERRACOTTA_BRICKS_STAIRS, "Escalier en briques de terre cuite");
                provider.addBlock(InitRockBlocks.TERRACOTTA_BRICKS_WALL, "Muret en briques de terre cuite");
                provider.addBlock(InitRockBlocks.TERRACOTTA_BRICKS_PRESSURE_PLATE, "Plaque de pression en briques de terre cuite");

                provider.addBlock(InitRockBlocks.TERRACOTTA_LARGE_BRICKS, "Briques épaisses en terre cuite");
                provider.addBlock(InitRockBlocks.TERRACOTTA_LARGE_BRICKS_SLAB, "Dalle en briques épaisses de terre cuite");
                provider.addBlock(InitRockBlocks.TERRACOTTA_LARGE_BRICKS_STAIRS, "Escalier en briques épaisses de terre cuite");
                provider.addBlock(InitRockBlocks.TERRACOTTA_LARGE_BRICKS_WALL, "Muret en briques épaisses de terre cuite");
                provider.addBlock(InitRockBlocks.TERRACOTTA_LARGE_BRICKS_PRESSURE_PLATE, "Plaque de pression en briques épaisses de terre cuite");

                provider.addBlock(InitRockBlocks.TERRACOTTA_PAVING_STONES, "Pavage en terre cuite");
                provider.addBlock(InitRockBlocks.TERRACOTTA_PAVING_STONES_SLAB, "Dalle en pavage de terre cuite");
                provider.addBlock(InitRockBlocks.TERRACOTTA_PAVING_STONES_STAIRS, "Escalier en pavage de terre cuite");
                provider.addBlock(InitRockBlocks.TERRACOTTA_PAVING_STONES_WALL, "Muret en pavage de terre cuite");
                provider.addBlock(InitRockBlocks.TERRACOTTA_PAVING_STONES_PRESSURE_PLATE, "Plaque de pression en pavage de terre cuite");

                provider.addBlock(InitRockBlocks.TERRACOTTA_ROOFTILES, "Tuiles de terre cuite");
                provider.addBlock(InitRockBlocks.TERRACOTTA_ROOFTILES_SLAB, "Dalle en tuile de terre cuite");
                provider.addBlock(InitRockBlocks.TERRACOTTA_ROOFTILES_STAIRS, "Escalier en tuile de terre cuite");

                provider.add("itemGroup.embellishcraft_rocks_group", "EmbellishCraft - Roches");

                break;
        }
    }
}