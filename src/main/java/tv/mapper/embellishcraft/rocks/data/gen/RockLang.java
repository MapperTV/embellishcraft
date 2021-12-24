package tv.mapper.embellishcraft.rocks.data.gen;

import java.util.Arrays;

import org.codehaus.plexus.util.StringUtils;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;
import tv.mapper.embellishcraft.block.ECBlockRegistry;
import tv.mapper.embellishcraft.rocks.world.level.blocks.InitRockBlocks;
import tv.mapper.embellishcraft.util.RockType;

public class RockLang extends LanguageProvider
{
    private String lang;

    public RockLang(DataGenerator gen, String modid, String locale)
    {
        super(gen, modid, locale);
        lang = locale;
    }

    @Override
    protected void addTranslations()
    {
        switch(lang)
        {
            default:
            case "en_us":
                for(int j = 0; j < Arrays.stream(RockType.values()).count(); j++)
                {
                    // Rocks
                    addBlock(InitRockBlocks.ROCK_BLOCKS.get(RockType.byId(j)), StringUtils.capitalise(RockType.byId(j).getName()));
                    addBlock(InitRockBlocks.ROCK_STAIRS.get(RockType.byId(j)), StringUtils.capitalise(RockType.byId(j).getName()) + " Stairs");
                    addBlock(InitRockBlocks.ROCK_SLABS.get(RockType.byId(j)), StringUtils.capitalise(RockType.byId(j).getName()) + " Slab");
                    addBlock(InitRockBlocks.ROCK_WALLS.get(RockType.byId(j)), StringUtils.capitalise(RockType.byId(j).getName()) + " Wall");
                    addBlock(InitRockBlocks.ROCK_PRESSURE_PLATES.get(RockType.byId(j)), StringUtils.capitalise(RockType.byId(j).getName()) + " Pressure Plate");
                    addBlock(InitRockBlocks.ROCK_BUTTONS.get(RockType.byId(j)), StringUtils.capitalise(RockType.byId(j).getName()) + " Button");

                    // Cobbletones
                    addBlock(InitRockBlocks.ROCK_COBBLESTONES.get(RockType.byId(j)), StringUtils.capitalise(RockType.byId(j).getName()) + " Cobblestone");
                    addBlock(InitRockBlocks.ROCK_COBBLESTONE_STAIRS.get(RockType.byId(j)), StringUtils.capitalise(RockType.byId(j).getName()) + " Cobblestone Stairs");
                    addBlock(InitRockBlocks.ROCK_COBBLESTONE_SLABS.get(RockType.byId(j)), StringUtils.capitalise(RockType.byId(j).getName()) + " Cobblestone Slab");
                    addBlock(InitRockBlocks.ROCK_COBBLESTONE_WALLS.get(RockType.byId(j)), StringUtils.capitalise(RockType.byId(j).getName()) + " Cobblestone Wall");
                    addBlock(InitRockBlocks.ROCK_COBBLESTONE_PRESSURE_PLATES.get(RockType.byId(j)), StringUtils.capitalise(RockType.byId(j).getName()) + " Cobblestone Pressure Plate");

                    // Cobbletone bricks
                    addBlock(InitRockBlocks.ROCK_COBBLESTONE_BRICKS.get(RockType.byId(j)), StringUtils.capitalise(RockType.byId(j).getName()) + " Cobblestone Bricks");
                    addBlock(InitRockBlocks.ROCK_COBBLESTONE_BRICKS_STAIRS.get(RockType.byId(j)), StringUtils.capitalise(RockType.byId(j).getName()) + " Cobblestone Bricks Stairs");
                    addBlock(InitRockBlocks.ROCK_COBBLESTONE_BRICKS_SLABS.get(RockType.byId(j)), StringUtils.capitalise(RockType.byId(j).getName()) + " Cobblestone Bricks Slab");
                    addBlock(InitRockBlocks.ROCK_COBBLESTONE_BRICKS_WALLS.get(RockType.byId(j)), StringUtils.capitalise(RockType.byId(j).getName()) + " Cobblestone Bricks Wall");
                    addBlock(InitRockBlocks.ROCK_COBBLESTONE_BRICKS_PRESSURE_PLATES.get(RockType.byId(j)), StringUtils.capitalise(RockType.byId(j).getName()) + " Cobblestone Bricks Pressure Plate");

                    // Smooth rocks
                    addBlock(InitRockBlocks.SMOOTH_ROCK_BLOCKS.get(RockType.byId(j)), "Smooth " + StringUtils.capitalise(RockType.byId(j).getName()));
                    addBlock(InitRockBlocks.SMOOTH_ROCK_STAIRS.get(RockType.byId(j)), "Smooth " + StringUtils.capitalise(RockType.byId(j).getName()) + " Stairs");
                    addBlock(InitRockBlocks.SMOOTH_ROCK_SLABS.get(RockType.byId(j)), "Smooth " + StringUtils.capitalise(RockType.byId(j).getName()) + " Slab");
                    addBlock(InitRockBlocks.SMOOTH_ROCK_WALLS.get(RockType.byId(j)), "Smooth " + StringUtils.capitalise(RockType.byId(j).getName()) + " Wall");
                    addBlock(InitRockBlocks.SMOOTH_ROCK_PRESSURE_PLATES.get(RockType.byId(j)), "Smooth " + StringUtils.capitalise(RockType.byId(j).getName()) + " Pressure Plate");

                    // Polished rocks
                    addBlock(InitRockBlocks.POLISHED_ROCK_BLOCKS.get(RockType.byId(j)), "Polished " + StringUtils.capitalise(RockType.byId(j).getName()));
                    addBlock(InitRockBlocks.POLISHED_ROCK_STAIRS.get(RockType.byId(j)), "Polished " + StringUtils.capitalise(RockType.byId(j).getName()) + " Stairs");
                    addBlock(InitRockBlocks.POLISHED_ROCK_SLABS.get(RockType.byId(j)), "Polished " + StringUtils.capitalise(RockType.byId(j).getName()) + " Slab");
                    addBlock(InitRockBlocks.POLISHED_ROCK_WALLS.get(RockType.byId(j)), "Polished " + StringUtils.capitalise(RockType.byId(j).getName()) + " Wall");
                    addBlock(InitRockBlocks.POLISHED_ROCK_PRESSURE_PLATES.get(RockType.byId(j)), "Polished " + StringUtils.capitalise(RockType.byId(j).getName()) + " Pressure Plate");

                    // Rock pavings
                    addBlock(InitRockBlocks.ROCK_PAVINGS.get(RockType.byId(j)), StringUtils.capitalise(RockType.byId(j).getName()) + " Paving");
                    addBlock(InitRockBlocks.ROCK_PAVING_STAIRS.get(RockType.byId(j)), StringUtils.capitalise(RockType.byId(j).getName()) + " Paving Stairs");
                    addBlock(InitRockBlocks.ROCK_PAVING_SLABS.get(RockType.byId(j)), StringUtils.capitalise(RockType.byId(j).getName()) + " Paving Slab");
                    addBlock(InitRockBlocks.ROCK_PAVING_WALLS.get(RockType.byId(j)), StringUtils.capitalise(RockType.byId(j).getName()) + " Paving Wall");
                    addBlock(InitRockBlocks.ROCK_PAVING_PRESSURE_PLATES.get(RockType.byId(j)), StringUtils.capitalise(RockType.byId(j).getName()) + " Paving Pressure Plate");

                    // Rock tiles
                    addBlock(InitRockBlocks.ROCK_TILES.get(RockType.byId(j)), StringUtils.capitalise(RockType.byId(j).getName()) + " Tiles");
                    addBlock(InitRockBlocks.ROCK_TILES_STAIRS.get(RockType.byId(j)), StringUtils.capitalise(RockType.byId(j).getName()) + " Tiles Stairs");
                    addBlock(InitRockBlocks.ROCK_TILES_SLABS.get(RockType.byId(j)), StringUtils.capitalise(RockType.byId(j).getName()) + " Tiles Slab");
                    addBlock(InitRockBlocks.ROCK_TILES_WALLS.get(RockType.byId(j)), StringUtils.capitalise(RockType.byId(j).getName()) + " Tiles Wall");
                    addBlock(InitRockBlocks.ROCK_TILES_PRESSURE_PLATES.get(RockType.byId(j)), StringUtils.capitalise(RockType.byId(j).getName()) + " Tiles Pressure Plate");

                    // Rock bricks
                    addBlock(InitRockBlocks.ROCK_BRICKS.get(RockType.byId(j)), StringUtils.capitalise(RockType.byId(j).getName()) + " Bricks");
                    addBlock(InitRockBlocks.ROCK_BRICKS_STAIRS.get(RockType.byId(j)), StringUtils.capitalise(RockType.byId(j).getName()) + " Bricks Stairs");
                    addBlock(InitRockBlocks.ROCK_BRICKS_SLABS.get(RockType.byId(j)), StringUtils.capitalise(RockType.byId(j).getName()) + " Bricks Slab");
                    addBlock(InitRockBlocks.ROCK_BRICKS_WALLS.get(RockType.byId(j)), StringUtils.capitalise(RockType.byId(j).getName()) + " Bricks Wall");
                    addBlock(InitRockBlocks.ROCK_BRICKS_PRESSURE_PLATES.get(RockType.byId(j)), StringUtils.capitalise(RockType.byId(j).getName()) + " Bricks Pressure Plate");

                    // Rock large bricks
                    addBlock(InitRockBlocks.ROCK_LARGE_BRICKS.get(RockType.byId(j)), StringUtils.capitalise(RockType.byId(j).getName()) + " Large Bricks");
                    addBlock(InitRockBlocks.ROCK_LARGE_BRICKS_STAIRS.get(RockType.byId(j)), StringUtils.capitalise(RockType.byId(j).getName()) + " Large Bricks Stairs");
                    addBlock(InitRockBlocks.ROCK_LARGE_BRICKS_SLABS.get(RockType.byId(j)), StringUtils.capitalise(RockType.byId(j).getName()) + " Large Bricks Slab");
                    addBlock(InitRockBlocks.ROCK_LARGE_BRICKS_WALLS.get(RockType.byId(j)), StringUtils.capitalise(RockType.byId(j).getName()) + " Large Bricks Wall");
                    addBlock(InitRockBlocks.ROCK_LARGE_BRICKS_PRESSURE_PLATES.get(RockType.byId(j)), StringUtils.capitalise(RockType.byId(j).getName()) + " Large Bricks Pressure Plate");

                    // Rock paving stones
                    addBlock(InitRockBlocks.ROCK_PAVING_STONES.get(RockType.byId(j)), StringUtils.capitalise(RockType.byId(j).getName()) + " Paving Stones");
                    addBlock(InitRockBlocks.ROCK_PAVING_STONES_STAIRS.get(RockType.byId(j)), StringUtils.capitalise(RockType.byId(j).getName()) + " Paving Stones Stairs");
                    addBlock(InitRockBlocks.ROCK_PAVING_STONES_SLABS.get(RockType.byId(j)), StringUtils.capitalise(RockType.byId(j).getName()) + " Paving Stones Slab");
                    addBlock(InitRockBlocks.ROCK_PAVING_STONES_WALLS.get(RockType.byId(j)), StringUtils.capitalise(RockType.byId(j).getName()) + " Paving Stones Wall");
                    addBlock(InitRockBlocks.ROCK_PAVING_STONES_PRESSURE_PLATES.get(RockType.byId(j)), StringUtils.capitalise(RockType.byId(j).getName()) + " Paving Stones Pressure Plate");

                    // Rock ornaments
                    addBlock(InitRockBlocks.ROCK_ORNAMENTS.get(RockType.byId(j)), StringUtils.capitalise(RockType.byId(j).getName()) + " Ornament");
                    addBlock(InitRockBlocks.ROCK_ORNAMENT_PRESSURE_PLATES.get(RockType.byId(j)), StringUtils.capitalise(RockType.byId(j).getName()) + " Ornament Pressure Plate");

                    // Rock rooftiles
                    addBlock(InitRockBlocks.ROCK_ROOFTILES.get(RockType.byId(j)), StringUtils.capitalise(RockType.byId(j).getName() + " Rooftiles"));
                    addBlock(InitRockBlocks.ROCK_ROOFTILES_STAIRS.get(RockType.byId(j)), StringUtils.capitalise(RockType.byId(j).getName()) + " Rooftiles Stairs");
                    addBlock(InitRockBlocks.ROCK_ROOFTILES_SLABS.get(RockType.byId(j)), StringUtils.capitalise(RockType.byId(j).getName()) + " Rooftiles Slab");
                }

                addBlock(InitRockBlocks.PAVING_STONES, "Paving Stones");
                addBlock(InitRockBlocks.PAVING_STONES_SLAB, "Paving Stones Slab");
                addBlock(InitRockBlocks.PAVING_STONES_STAIRS, "Paving Stones Stairs");
                addBlock(InitRockBlocks.PAVING_STONES_WALL, "Paving Stones Wall");
                addBlock(InitRockBlocks.PAVING_STONES_PRESSURE_PLATE, "Paving Stones Pressure Plate");

                // Andesite
                addBlock(ECBlockRegistry.SMOOTH_ANDESITE, "Smooth Andesite");
                addBlock(ECBlockRegistry.SMOOTH_ANDESITE_SLAB, "Smooth Andesite Slab");
                addBlock(ECBlockRegistry.SMOOTH_ANDESITE_STAIRS, "Smooth Andesite Stairs");
                addBlock(ECBlockRegistry.SMOOTH_ANDESITE_WALL, "Smooth Andesite Wall");
                addBlock(ECBlockRegistry.SMOOTH_ANDESITE_PRESSURE_PLATE, "Smooth Andesite Pressure Plate");
                addBlock(ECBlockRegistry.ANDESITE_BUTTON, "Andesite Button");

                addBlock(ECBlockRegistry.ANDESITE_PAVING, "Andesite Paving");
                addBlock(ECBlockRegistry.ANDESITE_PAVING_SLAB, "Andesite Paving Slab");
                addBlock(ECBlockRegistry.ANDESITE_PAVING_STAIRS, "Andesite Paving Stairs");
                addBlock(ECBlockRegistry.ANDESITE_PAVING_WALL, "Andesite Paving Wall");
                addBlock(ECBlockRegistry.ANDESITE_PAVING_PRESSURE_PLATE, "Andesite Paving Pressure Plate");

                addBlock(ECBlockRegistry.ANDESITE_TILES, "Andesite Tiles");
                addBlock(ECBlockRegistry.ANDESITE_TILES_SLAB, "Andesite Tiles Slab");
                addBlock(ECBlockRegistry.ANDESITE_TILES_STAIRS, "Andesite Tiles Stairs");
                addBlock(ECBlockRegistry.ANDESITE_TILES_WALL, "Andesite Tiles Wall");
                addBlock(ECBlockRegistry.ANDESITE_TILES_PRESSURE_PLATE, "Andesite Tiles Pressure Plate");

                addBlock(ECBlockRegistry.ANDESITE_BRICKS, "Andesite Bricks");
                addBlock(ECBlockRegistry.ANDESITE_BRICKS_SLAB, "Andesite Bricks Slab");
                addBlock(ECBlockRegistry.ANDESITE_BRICKS_STAIRS, "Andesite Bricks Stairs");
                addBlock(ECBlockRegistry.ANDESITE_BRICKS_WALL, "Andesite Bricks Wall");
                addBlock(ECBlockRegistry.ANDESITE_BRICKS_PRESSURE_PLATE, "Andesite Bricks Pressure Plate");

                addBlock(ECBlockRegistry.ANDESITE_LARGE_BRICKS, "Andesite Large Bricks");
                addBlock(ECBlockRegistry.ANDESITE_LARGE_BRICKS_SLAB, "Andesite Large Bricks Slab");
                addBlock(ECBlockRegistry.ANDESITE_LARGE_BRICKS_STAIRS, "Andesite Large Bricks Stairs");
                addBlock(ECBlockRegistry.ANDESITE_LARGE_BRICKS_WALL, "Andesite Large Bricks Wall");
                addBlock(ECBlockRegistry.ANDESITE_LARGE_BRICKS_PRESSURE_PLATE, "Andesite Large Bricks Pressure Plate");

                addBlock(ECBlockRegistry.ANDESITE_PAVING_STONES, "Andesite Paving Stones");
                addBlock(ECBlockRegistry.ANDESITE_PAVING_STONES_SLAB, "Andesite Paving Stones Slab");
                addBlock(ECBlockRegistry.ANDESITE_PAVING_STONES_STAIRS, "Andesite Paving Stones Stairs");
                addBlock(ECBlockRegistry.ANDESITE_PAVING_STONES_WALL, "Andesite Paving Stones Wall");
                addBlock(ECBlockRegistry.ANDESITE_PAVING_STONES_PRESSURE_PLATE, "Andesite Paving Stones Pressure Plate");

                addBlock(ECBlockRegistry.ANDESITE_ORNAMENT, "Andesite Ornament");
                addBlock(ECBlockRegistry.ANDESITE_ORNAMENT_PRESSURE_PLATE, "Andesite Ornament Pressure Plate");

                addBlock(ECBlockRegistry.ANDESITE_ROOFTILES, "Andesite Rooftiles");
                addBlock(ECBlockRegistry.ANDESITE_ROOFTILES_SLAB, "Andesite Rooftiles Slab");
                addBlock(ECBlockRegistry.ANDESITE_ROOFTILES_STAIRS, "Andesite Rooftiles Stairs");

                // Diorite
                addBlock(ECBlockRegistry.SMOOTH_DIORITE, "Smooth Diorite");
                addBlock(ECBlockRegistry.SMOOTH_DIORITE_SLAB, "Smooth Diorite Slab");
                addBlock(ECBlockRegistry.SMOOTH_DIORITE_STAIRS, "Smooth Diorite Stairs");
                addBlock(ECBlockRegistry.SMOOTH_DIORITE_WALL, "Smooth Diorite Wall");
                addBlock(ECBlockRegistry.SMOOTH_DIORITE_PRESSURE_PLATE, "Smooth Diorite Pressure Plate");
                addBlock(ECBlockRegistry.DIORITE_BUTTON, "Diorite Button");

                addBlock(ECBlockRegistry.DIORITE_PAVING, "Diorite Paving");
                addBlock(ECBlockRegistry.DIORITE_PAVING_SLAB, "Diorite Paving Slab");
                addBlock(ECBlockRegistry.DIORITE_PAVING_STAIRS, "Diorite Paving Stairs");
                addBlock(ECBlockRegistry.DIORITE_PAVING_WALL, "Diorite Paving Wall");
                addBlock(ECBlockRegistry.DIORITE_PAVING_PRESSURE_PLATE, "Diorite Paving Pressure Plate");

                addBlock(ECBlockRegistry.DIORITE_TILES, "Diorite Tiles");
                addBlock(ECBlockRegistry.DIORITE_TILES_SLAB, "Diorite Tiles Slab");
                addBlock(ECBlockRegistry.DIORITE_TILES_STAIRS, "Diorite Tiles Stairs");
                addBlock(ECBlockRegistry.DIORITE_TILES_WALL, "Diorite Tiles Wall");
                addBlock(ECBlockRegistry.DIORITE_TILES_PRESSURE_PLATE, "Diorite Tiles Pressure Plate");

                addBlock(ECBlockRegistry.DIORITE_BRICKS, "Diorite Bricks");
                addBlock(ECBlockRegistry.DIORITE_BRICKS_SLAB, "Diorite Bricks Slab");
                addBlock(ECBlockRegistry.DIORITE_BRICKS_STAIRS, "Diorite Bricks Stairs");
                addBlock(ECBlockRegistry.DIORITE_BRICKS_WALL, "Diorite Bricks Wall");
                addBlock(ECBlockRegistry.DIORITE_BRICKS_PRESSURE_PLATE, "Diorite Bricks Pressure Plate");

                addBlock(ECBlockRegistry.DIORITE_LARGE_BRICKS, "Diorite Large Bricks");
                addBlock(ECBlockRegistry.DIORITE_LARGE_BRICKS_SLAB, "Diorite Large Bricks Slab");
                addBlock(ECBlockRegistry.DIORITE_LARGE_BRICKS_STAIRS, "Diorite Large Bricks Stairs");
                addBlock(ECBlockRegistry.DIORITE_LARGE_BRICKS_WALL, "Diorite Large Bricks Wall");
                addBlock(ECBlockRegistry.DIORITE_LARGE_BRICKS_PRESSURE_PLATE, "Diorite Large Bricks Pressure Plate");

                addBlock(ECBlockRegistry.DIORITE_PAVING_STONES, "Diorite Paving Stones");
                addBlock(ECBlockRegistry.DIORITE_PAVING_STONES_SLAB, "Diorite Paving Stones Slab");
                addBlock(ECBlockRegistry.DIORITE_PAVING_STONES_STAIRS, "Diorite Paving Stones Stairs");
                addBlock(ECBlockRegistry.DIORITE_PAVING_STONES_WALL, "Diorite Paving Stones Wall");
                addBlock(ECBlockRegistry.DIORITE_PAVING_STONES_PRESSURE_PLATE, "Diorite Paving Stones Pressure Plate");

                addBlock(ECBlockRegistry.DIORITE_ORNAMENT, "Diorite Ornament");
                addBlock(ECBlockRegistry.DIORITE_ORNAMENT_PRESSURE_PLATE, "Diorite Ornament Pressure Plate");

                addBlock(ECBlockRegistry.DIORITE_ROOFTILES, "Diorite Rooftiles");
                addBlock(ECBlockRegistry.DIORITE_ROOFTILES_SLAB, "Diorite Rooftiles Slab");
                addBlock(ECBlockRegistry.DIORITE_ROOFTILES_STAIRS, "Diorite Rooftiles Stairs");

                // Granite
                addBlock(ECBlockRegistry.SMOOTH_GRANITE, "Smooth Granite");
                addBlock(ECBlockRegistry.SMOOTH_GRANITE_SLAB, "Smooth Granite Slab");
                addBlock(ECBlockRegistry.SMOOTH_GRANITE_STAIRS, "Smooth Granite Stairs");
                addBlock(ECBlockRegistry.SMOOTH_GRANITE_WALL, "Smooth Granite Wall");
                addBlock(ECBlockRegistry.SMOOTH_GRANITE_PRESSURE_PLATE, "Smooth Granite Pressure Plate");
                addBlock(ECBlockRegistry.GRANITE_BUTTON, "Granite Button");

                addBlock(ECBlockRegistry.GRANITE_PAVING, "Granite Paving");
                addBlock(ECBlockRegistry.GRANITE_PAVING_SLAB, "Granite Paving Slab");
                addBlock(ECBlockRegistry.GRANITE_PAVING_STAIRS, "Granite Paving Stairs");
                addBlock(ECBlockRegistry.GRANITE_PAVING_WALL, "Granite Paving Wall");
                addBlock(ECBlockRegistry.GRANITE_PAVING_PRESSURE_PLATE, "Granite Paving Pressure Plate");

                addBlock(ECBlockRegistry.GRANITE_TILES, "Granite Tiles");
                addBlock(ECBlockRegistry.GRANITE_TILES_SLAB, "Granite Tiles Slab");
                addBlock(ECBlockRegistry.GRANITE_TILES_STAIRS, "Granite Tiles Stairs");
                addBlock(ECBlockRegistry.GRANITE_TILES_WALL, "Granite Tiles Wall");
                addBlock(ECBlockRegistry.GRANITE_TILES_PRESSURE_PLATE, "Granite Tiles Pressure Plate");

                addBlock(ECBlockRegistry.GRANITE_BRICKS, "Granite Bricks");
                addBlock(ECBlockRegistry.GRANITE_BRICKS_SLAB, "Granite Bricks Slab");
                addBlock(ECBlockRegistry.GRANITE_BRICKS_STAIRS, "Granite Bricks Stairs");
                addBlock(ECBlockRegistry.GRANITE_BRICKS_WALL, "Granite Bricks Wall");
                addBlock(ECBlockRegistry.GRANITE_BRICKS_PRESSURE_PLATE, "Granite Bricks Pressure Plate");

                addBlock(ECBlockRegistry.GRANITE_LARGE_BRICKS, "Granite Large Bricks");
                addBlock(ECBlockRegistry.GRANITE_LARGE_BRICKS_SLAB, "Granite Large Bricks Slab");
                addBlock(ECBlockRegistry.GRANITE_LARGE_BRICKS_STAIRS, "Granite Large Bricks Stairs");
                addBlock(ECBlockRegistry.GRANITE_LARGE_BRICKS_WALL, "Granite Large Bricks Wall");
                addBlock(ECBlockRegistry.GRANITE_LARGE_BRICKS_PRESSURE_PLATE, "Granite Large Bricks Pressure Plate");

                addBlock(ECBlockRegistry.GRANITE_PAVING_STONES, "Granite Paving Stones");
                addBlock(ECBlockRegistry.GRANITE_PAVING_STONES_SLAB, "Granite Paving Stones Slab");
                addBlock(ECBlockRegistry.GRANITE_PAVING_STONES_STAIRS, "Granite Paving Stones Stairs");
                addBlock(ECBlockRegistry.GRANITE_PAVING_STONES_WALL, "Granite Paving Stones Wall");
                addBlock(ECBlockRegistry.GRANITE_PAVING_STONES_PRESSURE_PLATE, "Granite Paving Stones Pressure Plate");

                addBlock(ECBlockRegistry.GRANITE_ORNAMENT, "Granite Ornament");
                addBlock(ECBlockRegistry.GRANITE_ORNAMENT_PRESSURE_PLATE, "Granite Ornament Pressure Plate");

                addBlock(ECBlockRegistry.GRANITE_ROOFTILES, "Granite Rooftiles");
                addBlock(ECBlockRegistry.GRANITE_ROOFTILES_SLAB, "Granite Rooftiles Slab");
                addBlock(ECBlockRegistry.GRANITE_ROOFTILES_STAIRS, "Granite Rooftiles Stairs");

                // Sandstone
                addBlock(ECBlockRegistry.SANDSTONE_BUTTON, "Sandstone Button");

                addBlock(ECBlockRegistry.SMOOTH_SANDSTONE_WALL, "Smooth Sandstone Wall");
                addBlock(ECBlockRegistry.SMOOTH_SANDSTONE_PRESSURE_PLATE, "Smooth Sandstone Pressure Plate");

                addBlock(ECBlockRegistry.POLISHED_SANDSTONE, "Polished Sandstone");
                addBlock(ECBlockRegistry.POLISHED_SANDSTONE_SLAB, "Polished Sandstone Slab");
                addBlock(ECBlockRegistry.POLISHED_SANDSTONE_STAIRS, "Polished Sandstone Stairs");
                addBlock(ECBlockRegistry.POLISHED_SANDSTONE_WALL, "Polished Sandstone Wall");
                addBlock(ECBlockRegistry.POLISHED_SANDSTONE_PRESSURE_PLATE, "Polished Sandstone Pressure Plate");

                addBlock(ECBlockRegistry.SANDSTONE_PAVING, "Sandstone Paving");
                addBlock(ECBlockRegistry.SANDSTONE_PAVING_SLAB, "Sandstone Paving Slab");
                addBlock(ECBlockRegistry.SANDSTONE_PAVING_STAIRS, "Sandstone Paving Stairs");
                addBlock(ECBlockRegistry.SANDSTONE_PAVING_WALL, "Sandstone Paving Wall");
                addBlock(ECBlockRegistry.SANDSTONE_PAVING_PRESSURE_PLATE, "Sandstone Paving Pressure Plate");

                addBlock(ECBlockRegistry.SANDSTONE_TILES, "Sandstone Tiles");
                addBlock(ECBlockRegistry.SANDSTONE_TILES_SLAB, "Sandstone Tiles Slab");
                addBlock(ECBlockRegistry.SANDSTONE_TILES_STAIRS, "Sandstone Tiles Stairs");
                addBlock(ECBlockRegistry.SANDSTONE_TILES_WALL, "Sandstone Tiles Wall");
                addBlock(ECBlockRegistry.SANDSTONE_TILES_PRESSURE_PLATE, "Sandstone Tiles Pressure Plate");

                addBlock(ECBlockRegistry.SANDSTONE_BRICKS, "Sandstone Bricks");
                addBlock(ECBlockRegistry.SANDSTONE_BRICKS_SLAB, "Sandstone Bricks Slab");
                addBlock(ECBlockRegistry.SANDSTONE_BRICKS_STAIRS, "Sandstone Bricks Stairs");
                addBlock(ECBlockRegistry.SANDSTONE_BRICKS_WALL, "Sandstone Bricks Wall");
                addBlock(ECBlockRegistry.SANDSTONE_BRICKS_PRESSURE_PLATE, "Sandstone Bricks Pressure Plate");

                addBlock(ECBlockRegistry.SANDSTONE_LARGE_BRICKS, "Sandstone Large Bricks");
                addBlock(ECBlockRegistry.SANDSTONE_LARGE_BRICKS_SLAB, "Sandstone Large Bricks Slab");
                addBlock(ECBlockRegistry.SANDSTONE_LARGE_BRICKS_STAIRS, "Sandstone Large Bricks Stairs");
                addBlock(ECBlockRegistry.SANDSTONE_LARGE_BRICKS_WALL, "Sandstone Large Bricks Wall");
                addBlock(ECBlockRegistry.SANDSTONE_LARGE_BRICKS_PRESSURE_PLATE, "Sandstone Large Bricks Pressure Plate");

                addBlock(ECBlockRegistry.SANDSTONE_PAVING_STONES, "Sandstone Paving Stones");
                addBlock(ECBlockRegistry.SANDSTONE_PAVING_STONES_SLAB, "Sandstone Paving Stones Slab");
                addBlock(ECBlockRegistry.SANDSTONE_PAVING_STONES_STAIRS, "Sandstone Paving Stones Stairs");
                addBlock(ECBlockRegistry.SANDSTONE_PAVING_STONES_WALL, "Sandstone Paving Stones Wall");
                addBlock(ECBlockRegistry.SANDSTONE_PAVING_STONES_PRESSURE_PLATE, "Sandstone Paving Stones Pressure Plate");

                addBlock(ECBlockRegistry.SANDSTONE_ROOFTILES, "Sandstone Rooftiles");
                addBlock(ECBlockRegistry.SANDSTONE_ROOFTILES_SLAB, "Sandstone Rooftiles Slab");
                addBlock(ECBlockRegistry.SANDSTONE_ROOFTILES_STAIRS, "Sandstone Rooftiles Stairs");

                // Red Sandstone
                addBlock(ECBlockRegistry.RED_SANDSTONE_BUTTON, "Red Sandstone Button");

                addBlock(ECBlockRegistry.SMOOTH_RED_SANDSTONE_WALL, "Smooth Red Sandstone Wall");
                addBlock(ECBlockRegistry.SMOOTH_RED_SANDSTONE_PRESSURE_PLATE, "Smooth Red Sandstone Pressure Plate");

                addBlock(ECBlockRegistry.POLISHED_RED_SANDSTONE, "Polished Red Sandstone");
                addBlock(ECBlockRegistry.POLISHED_RED_SANDSTONE_SLAB, "Polished Red Sandstone Slab");
                addBlock(ECBlockRegistry.POLISHED_RED_SANDSTONE_STAIRS, "Polished Red Sandstone Stairs");
                addBlock(ECBlockRegistry.POLISHED_RED_SANDSTONE_WALL, "Polished Red Sandstone Wall");
                addBlock(ECBlockRegistry.POLISHED_RED_SANDSTONE_PRESSURE_PLATE, "Polished Red Sandstone Pressure Plate");

                addBlock(ECBlockRegistry.RED_SANDSTONE_PAVING, "Red Sandstone Paving");
                addBlock(ECBlockRegistry.RED_SANDSTONE_PAVING_SLAB, "Red Sandstone Paving Slab");
                addBlock(ECBlockRegistry.RED_SANDSTONE_PAVING_STAIRS, "Red Sandstone Paving Stairs");
                addBlock(ECBlockRegistry.RED_SANDSTONE_PAVING_WALL, "Red Sandstone Paving Wall");
                addBlock(ECBlockRegistry.RED_SANDSTONE_PAVING_PRESSURE_PLATE, "Red Sandstone Paving Pressure Plate");

                addBlock(ECBlockRegistry.RED_SANDSTONE_TILES, "Red Sandstone Tiles");
                addBlock(ECBlockRegistry.RED_SANDSTONE_TILES_SLAB, "Red Sandstone Tiles Slab");
                addBlock(ECBlockRegistry.RED_SANDSTONE_TILES_STAIRS, "Red Sandstone Tiles Stairs");
                addBlock(ECBlockRegistry.RED_SANDSTONE_TILES_WALL, "Red Sandstone Tiles Wall");
                addBlock(ECBlockRegistry.RED_SANDSTONE_TILES_PRESSURE_PLATE, "Red Sandstone Tiles Pressure Plate");

                addBlock(ECBlockRegistry.RED_SANDSTONE_BRICKS, "Red Sandstone Bricks");
                addBlock(ECBlockRegistry.RED_SANDSTONE_BRICKS_SLAB, "Red Sandstone Bricks Slab");
                addBlock(ECBlockRegistry.RED_SANDSTONE_BRICKS_STAIRS, "Red Sandstone Bricks Stairs");
                addBlock(ECBlockRegistry.RED_SANDSTONE_BRICKS_WALL, "Red Sandstone Bricks Wall");
                addBlock(ECBlockRegistry.RED_SANDSTONE_BRICKS_PRESSURE_PLATE, "Red Sandstone Bricks Pressure Plate");

                addBlock(ECBlockRegistry.RED_SANDSTONE_LARGE_BRICKS, "Red Sandstone Large Bricks");
                addBlock(ECBlockRegistry.RED_SANDSTONE_LARGE_BRICKS_SLAB, "Red Sandstone Large Bricks Slab");
                addBlock(ECBlockRegistry.RED_SANDSTONE_LARGE_BRICKS_STAIRS, "Red Sandstone Large Bricks Stairs");
                addBlock(ECBlockRegistry.RED_SANDSTONE_LARGE_BRICKS_WALL, "Red Sandstone Large Bricks Wall");
                addBlock(ECBlockRegistry.RED_SANDSTONE_LARGE_BRICKS_PRESSURE_PLATE, "Red Sandstone Large Bricks Pressure Plate");

                addBlock(ECBlockRegistry.RED_SANDSTONE_PAVING_STONES, "Red Sandstone Paving Stones");
                addBlock(ECBlockRegistry.RED_SANDSTONE_PAVING_STONES_SLAB, "Red Sandstone Paving Stones Slab");
                addBlock(ECBlockRegistry.RED_SANDSTONE_PAVING_STONES_STAIRS, "Red Sandstone Paving Stones Stairs");
                addBlock(ECBlockRegistry.RED_SANDSTONE_PAVING_STONES_WALL, "Red Sandstone Paving Stones Wall");
                addBlock(ECBlockRegistry.RED_SANDSTONE_PAVING_STONES_PRESSURE_PLATE, "Red Sandstone Paving Stones Pressure Plate");

                addBlock(ECBlockRegistry.RED_SANDSTONE_ROOFTILES, "Red Sandstone Rooftiles");
                addBlock(ECBlockRegistry.RED_SANDSTONE_ROOFTILES_SLAB, "Red Sandstone Rooftiles Slab");
                addBlock(ECBlockRegistry.RED_SANDSTONE_ROOFTILES_STAIRS, "Red Sandstone Rooftiles Stairs");

                // Terracotta
                addBlock(ECBlockRegistry.TERRACOTTA_SLAB, "Terracotta Slab");
                addBlock(ECBlockRegistry.TERRACOTTA_STAIRS, "Terracotta Stairs");
                addBlock(ECBlockRegistry.TERRACOTTA_WALL, "Terracotta Wall");
                addBlock(ECBlockRegistry.TERRACOTTA_PRESSURE_PLATE, "Terracotta Pressure Plate");
                addBlock(ECBlockRegistry.TERRACOTTA_BUTTON, "Terracotta Button");

                addBlock(ECBlockRegistry.POLISHED_TERRACOTTA, "Polished Terracotta");
                addBlock(ECBlockRegistry.POLISHED_TERRACOTTA_SLAB, "Polished Terracotta Slab");
                addBlock(ECBlockRegistry.POLISHED_TERRACOTTA_STAIRS, "Polished Terracotta Stairs");
                addBlock(ECBlockRegistry.POLISHED_TERRACOTTA_WALL, "Polished Terracotta Wall");
                addBlock(ECBlockRegistry.POLISHED_TERRACOTTA_PRESSURE_PLATE, "Polished Terracotta Pressure Plate");

                addBlock(ECBlockRegistry.TERRACOTTA_PAVING, "Terracotta Paving");
                addBlock(ECBlockRegistry.TERRACOTTA_PAVING_SLAB, "Terracotta Paving Slab");
                addBlock(ECBlockRegistry.TERRACOTTA_PAVING_STAIRS, "Terracotta Paving Stairs");
                addBlock(ECBlockRegistry.TERRACOTTA_PAVING_WALL, "Terracotta Paving Wall");
                addBlock(ECBlockRegistry.TERRACOTTA_PAVING_PRESSURE_PLATE, "Terracotta Paving Pressure Plate");

                addBlock(ECBlockRegistry.TERRACOTTA_TILES, "Terracotta Tiles");
                addBlock(ECBlockRegistry.TERRACOTTA_TILES_SLAB, "Terracotta Tiles Slab");
                addBlock(ECBlockRegistry.TERRACOTTA_TILES_STAIRS, "Terracotta Tiles Stairs");
                addBlock(ECBlockRegistry.TERRACOTTA_TILES_WALL, "Terracotta Tiles Wall");
                addBlock(ECBlockRegistry.TERRACOTTA_TILES_PRESSURE_PLATE, "Terracotta Tiles Pressure Plate");

                addBlock(ECBlockRegistry.TERRACOTTA_BRICKS, "Terracotta Bricks");
                addBlock(ECBlockRegistry.TERRACOTTA_BRICKS_SLAB, "Terracotta Bricks Slab");
                addBlock(ECBlockRegistry.TERRACOTTA_BRICKS_STAIRS, "Terracotta Bricks Stairs");
                addBlock(ECBlockRegistry.TERRACOTTA_BRICKS_WALL, "Terracotta Bricks Wall");
                addBlock(ECBlockRegistry.TERRACOTTA_BRICKS_PRESSURE_PLATE, "Terracotta Bricks Pressure Plate");

                addBlock(ECBlockRegistry.TERRACOTTA_LARGE_BRICKS, "Terracotta Large Bricks");
                addBlock(ECBlockRegistry.TERRACOTTA_LARGE_BRICKS_SLAB, "Terracotta Large Bricks Slab");
                addBlock(ECBlockRegistry.TERRACOTTA_LARGE_BRICKS_STAIRS, "Terracotta Large Bricks Stairs");
                addBlock(ECBlockRegistry.TERRACOTTA_LARGE_BRICKS_WALL, "Terracotta Large Bricks Wall");
                addBlock(ECBlockRegistry.TERRACOTTA_LARGE_BRICKS_PRESSURE_PLATE, "Terracotta Large Bricks Pressure Plate");

                addBlock(ECBlockRegistry.TERRACOTTA_PAVING_STONES, "Terracotta Paving Stones");
                addBlock(ECBlockRegistry.TERRACOTTA_PAVING_STONES_SLAB, "Terracotta Paving Stones Slab");
                addBlock(ECBlockRegistry.TERRACOTTA_PAVING_STONES_STAIRS, "Terracotta Paving Stones Stairs");
                addBlock(ECBlockRegistry.TERRACOTTA_PAVING_STONES_WALL, "Terracotta Paving Stones Wall");
                addBlock(ECBlockRegistry.TERRACOTTA_PAVING_STONES_PRESSURE_PLATE, "Terracotta Paving Stones Pressure Plate");

                addBlock(ECBlockRegistry.TERRACOTTA_ROOFTILES, "Terracotta Rooftiles");
                addBlock(ECBlockRegistry.TERRACOTTA_ROOFTILES_SLAB, "Terracotta Rooftiles Slab");
                addBlock(ECBlockRegistry.TERRACOTTA_ROOFTILES_STAIRS, "Terracotta Rooftiles Stairs");
                break;
            case "fr_fr":
                for(int j = 0; j < Arrays.stream(RockType.values()).count(); j++)
                {
                    // Rocks
                    addBlock(InitRockBlocks.ROCK_BLOCKS.get(RockType.byId(j)), StringUtils.capitalise(RockType.byId(j).getFrName()));
                    addBlock(InitRockBlocks.ROCK_STAIRS.get(RockType.byId(j)), "Escalier en " + RockType.byId(j).getFrName());
                    addBlock(InitRockBlocks.ROCK_SLABS.get(RockType.byId(j)), "Dalle en " + RockType.byId(j).getFrName());
                    addBlock(InitRockBlocks.ROCK_WALLS.get(RockType.byId(j)), "Muret en " + RockType.byId(j).getFrName());
                    addBlock(InitRockBlocks.ROCK_PRESSURE_PLATES.get(RockType.byId(j)), "Plaque de pression en " + RockType.byId(j).getFrName());
                    addBlock(InitRockBlocks.ROCK_BUTTONS.get(RockType.byId(j)), "Bouton en " + RockType.byId(j).getFrName());

                    // Cobbletones
                    String de = "de ";
                    if(RockType.byId(j).getFrName() == "ardoise")
                        de = "d'";

                    addBlock(InitRockBlocks.ROCK_COBBLESTONES.get(RockType.byId(j)), "Pierres " + de + RockType.byId(j).getFrName());
                    addBlock(InitRockBlocks.ROCK_COBBLESTONE_STAIRS.get(RockType.byId(j)), "Escalier en pierres " + de + RockType.byId(j).getFrName());
                    addBlock(InitRockBlocks.ROCK_COBBLESTONE_SLABS.get(RockType.byId(j)), "Dalle en pierres " + de + RockType.byId(j).getFrName());
                    addBlock(InitRockBlocks.ROCK_COBBLESTONE_WALLS.get(RockType.byId(j)), "Muret en pierres " + de + RockType.byId(j).getFrName());
                    addBlock(InitRockBlocks.ROCK_COBBLESTONE_PRESSURE_PLATES.get(RockType.byId(j)), "Plaque de pression en pierres " + de + RockType.byId(j).getFrName());

                    // Cobblestone bricks
                    addBlock(InitRockBlocks.ROCK_COBBLESTONE_BRICKS.get(RockType.byId(j)), "Briques de pierres " + de + RockType.byId(j).getFrName());
                    addBlock(InitRockBlocks.ROCK_COBBLESTONE_BRICKS_STAIRS.get(RockType.byId(j)), "Escalier en briques de pierres " + de + RockType.byId(j).getFrName());
                    addBlock(InitRockBlocks.ROCK_COBBLESTONE_BRICKS_SLABS.get(RockType.byId(j)), "Dalle en briques de pierres " + de + RockType.byId(j).getFrName());
                    addBlock(InitRockBlocks.ROCK_COBBLESTONE_BRICKS_WALLS.get(RockType.byId(j)), "Muret en briques de pierres " + de + RockType.byId(j).getFrName());
                    addBlock(InitRockBlocks.ROCK_COBBLESTONE_BRICKS_PRESSURE_PLATES.get(RockType.byId(j)), "Plaque de pression en briques de pierres " + de + RockType.byId(j).getFrName());

                    // Smooth rocks
                    addBlock(InitRockBlocks.SMOOTH_ROCK_BLOCKS.get(RockType.byId(j)), StringUtils.capitalise(RockType.byId(j).getFrName()) + " lisse");
                    addBlock(InitRockBlocks.SMOOTH_ROCK_STAIRS.get(RockType.byId(j)), "Escalier en " + RockType.byId(j).getFrName() + " lisse");
                    addBlock(InitRockBlocks.SMOOTH_ROCK_SLABS.get(RockType.byId(j)), "Dalle en " + RockType.byId(j).getFrName() + " lisse");
                    addBlock(InitRockBlocks.SMOOTH_ROCK_WALLS.get(RockType.byId(j)), "Muret en " + RockType.byId(j).getFrName() + " lisse");
                    addBlock(InitRockBlocks.SMOOTH_ROCK_PRESSURE_PLATES.get(RockType.byId(j)), "Plaque de pression en " + RockType.byId(j).getFrName() + " lisse");

                    // Polished rocks
                    addBlock(InitRockBlocks.POLISHED_ROCK_BLOCKS.get(RockType.byId(j)), StringUtils.capitalise(RockType.byId(j).getFrName()) + " poli");
                    addBlock(InitRockBlocks.POLISHED_ROCK_STAIRS.get(RockType.byId(j)), "Escalier en " + RockType.byId(j).getFrName() + " poli");
                    addBlock(InitRockBlocks.POLISHED_ROCK_SLABS.get(RockType.byId(j)), "Dalle en " + RockType.byId(j).getFrName() + " poli");
                    addBlock(InitRockBlocks.POLISHED_ROCK_WALLS.get(RockType.byId(j)), "Muret en " + RockType.byId(j).getFrName() + " poli");
                    addBlock(InitRockBlocks.POLISHED_ROCK_PRESSURE_PLATES.get(RockType.byId(j)), "Plaque de pression en " + RockType.byId(j).getFrName() + " poli");

                    // Rock pavings
                    addBlock(InitRockBlocks.ROCK_PAVINGS.get(RockType.byId(j)), "Pavés " + de + RockType.byId(j).getFrName());
                    addBlock(InitRockBlocks.ROCK_PAVING_STAIRS.get(RockType.byId(j)), "Escalier en pavé " + de + RockType.byId(j).getFrName());
                    addBlock(InitRockBlocks.ROCK_PAVING_SLABS.get(RockType.byId(j)), "Dalle en pavé " + de + RockType.byId(j).getFrName());
                    addBlock(InitRockBlocks.ROCK_PAVING_WALLS.get(RockType.byId(j)), "Muret en pavé " + de + RockType.byId(j).getFrName());
                    addBlock(InitRockBlocks.ROCK_PAVING_PRESSURE_PLATES.get(RockType.byId(j)), "Plaque de pression en pavé " + de + RockType.byId(j).getFrName());

                    // Rock tiles
                    addBlock(InitRockBlocks.ROCK_TILES.get(RockType.byId(j)), "Carrelage " + de + RockType.byId(j).getFrName());
                    addBlock(InitRockBlocks.ROCK_TILES_STAIRS.get(RockType.byId(j)), "Escalier en carrelage " + de + RockType.byId(j).getFrName());
                    addBlock(InitRockBlocks.ROCK_TILES_SLABS.get(RockType.byId(j)), "Dalle en carrelage " + de + RockType.byId(j).getFrName());
                    addBlock(InitRockBlocks.ROCK_TILES_WALLS.get(RockType.byId(j)), "Muret en carrelage " + de + RockType.byId(j).getFrName());
                    addBlock(InitRockBlocks.ROCK_TILES_PRESSURE_PLATES.get(RockType.byId(j)), "Plaque de pression en carrelage " + de + RockType.byId(j).getFrName());

                    // Rock bricks
                    addBlock(InitRockBlocks.ROCK_BRICKS.get(RockType.byId(j)), "Briques " + de + RockType.byId(j).getFrName());
                    addBlock(InitRockBlocks.ROCK_BRICKS_STAIRS.get(RockType.byId(j)), "Escalier en briques " + de + RockType.byId(j).getFrName());
                    addBlock(InitRockBlocks.ROCK_BRICKS_SLABS.get(RockType.byId(j)), "Dalle en briques " + de + RockType.byId(j).getFrName());
                    addBlock(InitRockBlocks.ROCK_BRICKS_WALLS.get(RockType.byId(j)), "Muret en briques " + de + RockType.byId(j).getFrName());
                    addBlock(InitRockBlocks.ROCK_BRICKS_PRESSURE_PLATES.get(RockType.byId(j)), "Plaque de pression en briques " + de + RockType.byId(j).getFrName());

                    // Rock large bricks
                    addBlock(InitRockBlocks.ROCK_LARGE_BRICKS.get(RockType.byId(j)), "Briques épaisses " + de + RockType.byId(j).getFrName());
                    addBlock(InitRockBlocks.ROCK_LARGE_BRICKS_STAIRS.get(RockType.byId(j)), "Escalier en briques épaisses " + de + RockType.byId(j).getFrName());
                    addBlock(InitRockBlocks.ROCK_LARGE_BRICKS_SLABS.get(RockType.byId(j)), "Dalle en briques épaisses " + de + RockType.byId(j).getFrName());
                    addBlock(InitRockBlocks.ROCK_LARGE_BRICKS_WALLS.get(RockType.byId(j)), "Muret en briques épaisses " + de + RockType.byId(j).getFrName());
                    addBlock(InitRockBlocks.ROCK_LARGE_BRICKS_PRESSURE_PLATES.get(RockType.byId(j)), "Plaque de pression en briques épaisses " + de + RockType.byId(j).getFrName());

                    // Rock paving stones
                    addBlock(InitRockBlocks.ROCK_PAVING_STONES.get(RockType.byId(j)), "Pavage " + de + RockType.byId(j).getFrName());
                    addBlock(InitRockBlocks.ROCK_PAVING_STONES_STAIRS.get(RockType.byId(j)), "Escalier en pavage " + de + RockType.byId(j).getFrName());
                    addBlock(InitRockBlocks.ROCK_PAVING_STONES_SLABS.get(RockType.byId(j)), "Dalle en pavage " + de + RockType.byId(j).getFrName());
                    addBlock(InitRockBlocks.ROCK_PAVING_STONES_WALLS.get(RockType.byId(j)), "Muret en pavage " + de + RockType.byId(j).getFrName());
                    addBlock(InitRockBlocks.ROCK_PAVING_STONES_PRESSURE_PLATES.get(RockType.byId(j)), "Plaque de pression en pavage " + de + RockType.byId(j).getFrName());

                    // Rock ornaments
                    addBlock(InitRockBlocks.ROCK_ORNAMENTS.get(RockType.byId(j)), "Ornement en " + RockType.byId(j).getFrName());
                    addBlock(InitRockBlocks.ROCK_ORNAMENT_PRESSURE_PLATES.get(RockType.byId(j)), "Plaque de pression avec ornement en " + RockType.byId(j).getFrName());

                    // Rock rooftiles
                    addBlock(InitRockBlocks.ROCK_ROOFTILES.get(RockType.byId(j)), "Tuiles " + de + RockType.byId(j).getFrName());
                    addBlock(InitRockBlocks.ROCK_ROOFTILES_STAIRS.get(RockType.byId(j)), "Escalier en tuiles " + de + RockType.byId(j).getFrName());
                    addBlock(InitRockBlocks.ROCK_ROOFTILES_SLABS.get(RockType.byId(j)), "Dalle en tuiles " + de + RockType.byId(j).getFrName());
                }

                addBlock(InitRockBlocks.PAVING_STONES, "Pavage");
                addBlock(InitRockBlocks.PAVING_STONES_SLAB, "Dalle en pavage");
                addBlock(InitRockBlocks.PAVING_STONES_STAIRS, "Escalier en pavage");
                addBlock(InitRockBlocks.PAVING_STONES_WALL, "Muret en pavage");
                addBlock(InitRockBlocks.PAVING_STONES_PRESSURE_PLATE, "Plaque de pression en pavage");

                // Andesite
                addBlock(ECBlockRegistry.ANDESITE_BUTTON, "Bouton en andésite");

                addBlock(ECBlockRegistry.SMOOTH_ANDESITE, "Andésite lisse");
                addBlock(ECBlockRegistry.SMOOTH_ANDESITE_SLAB, "Dalle en andésite lisse");
                addBlock(ECBlockRegistry.SMOOTH_ANDESITE_STAIRS, "Escalier en andésite lisse");
                addBlock(ECBlockRegistry.SMOOTH_ANDESITE_WALL, "Muret en andésite lisse");
                addBlock(ECBlockRegistry.SMOOTH_ANDESITE_PRESSURE_PLATE, "Plaque de pression en andésite lisse");

                addBlock(ECBlockRegistry.ANDESITE_PAVING, "Pavés d'andésite");
                addBlock(ECBlockRegistry.ANDESITE_PAVING_SLAB, "Dalle en pavé d'andésite");
                addBlock(ECBlockRegistry.ANDESITE_PAVING_STAIRS, "Escalier en pavé d'andésite");
                addBlock(ECBlockRegistry.ANDESITE_PAVING_WALL, "Muret en pavé d'andésite");
                addBlock(ECBlockRegistry.ANDESITE_PAVING_PRESSURE_PLATE, "Plaque de pression en pavé d'andésite");

                addBlock(ECBlockRegistry.ANDESITE_TILES, "Carrelage d'andésite");
                addBlock(ECBlockRegistry.ANDESITE_TILES_SLAB, "Dalle en carrelage d'andésite");
                addBlock(ECBlockRegistry.ANDESITE_TILES_STAIRS, "Escalier en carrelage d'andésite");
                addBlock(ECBlockRegistry.ANDESITE_TILES_WALL, "Muret en carrelage d'andésite");
                addBlock(ECBlockRegistry.ANDESITE_TILES_PRESSURE_PLATE, "Plaque de pression en carrelage d'andésite");

                addBlock(ECBlockRegistry.ANDESITE_BRICKS, "Briques d'andésite");
                addBlock(ECBlockRegistry.ANDESITE_BRICKS_SLAB, "Dalle en briques d'andésite");
                addBlock(ECBlockRegistry.ANDESITE_BRICKS_STAIRS, "Escalier en briques d'andésite");
                addBlock(ECBlockRegistry.ANDESITE_BRICKS_WALL, "Muret en briques d'andésite");
                addBlock(ECBlockRegistry.ANDESITE_BRICKS_PRESSURE_PLATE, "Plaque de pression en briques d'andésite");

                addBlock(ECBlockRegistry.ANDESITE_LARGE_BRICKS, "Briques épaisses d'andésite");
                addBlock(ECBlockRegistry.ANDESITE_LARGE_BRICKS_SLAB, "Dalle en briques épaisses d'andésite");
                addBlock(ECBlockRegistry.ANDESITE_LARGE_BRICKS_STAIRS, "Escalier en briques épaisses d'andésite");
                addBlock(ECBlockRegistry.ANDESITE_LARGE_BRICKS_WALL, "Muret en briques épaisses d'andésite");
                addBlock(ECBlockRegistry.ANDESITE_LARGE_BRICKS_PRESSURE_PLATE, "Plaque de pression en briques épaisses d'andésite");

                addBlock(ECBlockRegistry.ANDESITE_PAVING_STONES, "Pavage d'andésite");
                addBlock(ECBlockRegistry.ANDESITE_PAVING_STONES_SLAB, "Dalle en pavage d'andésite");
                addBlock(ECBlockRegistry.ANDESITE_PAVING_STONES_STAIRS, "Escalier en pavage d'andésite");
                addBlock(ECBlockRegistry.ANDESITE_PAVING_STONES_WALL, "Muret en pavage d'andésite");
                addBlock(ECBlockRegistry.ANDESITE_PAVING_STONES_PRESSURE_PLATE, "Plaque de pression en pavage d'andésite");

                addBlock(ECBlockRegistry.ANDESITE_ORNAMENT, "Ornement en andésite");
                addBlock(ECBlockRegistry.ANDESITE_ORNAMENT_PRESSURE_PLATE, "Plaque de pression avec ornement en andésite");

                addBlock(ECBlockRegistry.ANDESITE_ROOFTILES, "Tuiles d'andésite");
                addBlock(ECBlockRegistry.ANDESITE_ROOFTILES_SLAB, "Dalle en tuile d'andésite");
                addBlock(ECBlockRegistry.ANDESITE_ROOFTILES_STAIRS, "Escalier en tuile d'andésite");

                // Diorite
                addBlock(ECBlockRegistry.DIORITE_BUTTON, "Bouton en diorite");

                addBlock(ECBlockRegistry.SMOOTH_DIORITE, "Diorite lisse");
                addBlock(ECBlockRegistry.SMOOTH_DIORITE_SLAB, "Dalle en diorite lisse");
                addBlock(ECBlockRegistry.SMOOTH_DIORITE_STAIRS, "Escalier en diorite lisse");
                addBlock(ECBlockRegistry.SMOOTH_DIORITE_WALL, "Muret en diorite lisse");
                addBlock(ECBlockRegistry.SMOOTH_DIORITE_PRESSURE_PLATE, "Plaque de pression en diorite lisse");

                addBlock(ECBlockRegistry.DIORITE_PAVING, "Pavés de diorite");
                addBlock(ECBlockRegistry.DIORITE_PAVING_SLAB, "Dalle en pavé de diorite");
                addBlock(ECBlockRegistry.DIORITE_PAVING_STAIRS, "Escalier en pavé de diorite");
                addBlock(ECBlockRegistry.DIORITE_PAVING_WALL, "Muret en pavé de diorite");
                addBlock(ECBlockRegistry.DIORITE_PAVING_PRESSURE_PLATE, "Plaque de pression en pavé de diorite");

                addBlock(ECBlockRegistry.DIORITE_TILES, "Carrelage de diorite");
                addBlock(ECBlockRegistry.DIORITE_TILES_SLAB, "Dalle en carrelage de diorite");
                addBlock(ECBlockRegistry.DIORITE_TILES_STAIRS, "Escalier en carrelage de diorite");
                addBlock(ECBlockRegistry.DIORITE_TILES_WALL, "Muret en carrelage de diorite");
                addBlock(ECBlockRegistry.DIORITE_TILES_PRESSURE_PLATE, "Plaque de pression en carrelage de diorite");

                addBlock(ECBlockRegistry.DIORITE_BRICKS, "Briques de diorite");
                addBlock(ECBlockRegistry.DIORITE_BRICKS_SLAB, "Dalle en briques de diorite");
                addBlock(ECBlockRegistry.DIORITE_BRICKS_STAIRS, "Escalier en briques de diorite");
                addBlock(ECBlockRegistry.DIORITE_BRICKS_WALL, "Muret en briques de diorite");
                addBlock(ECBlockRegistry.DIORITE_BRICKS_PRESSURE_PLATE, "Plaque de pression en briques de diorite");

                addBlock(ECBlockRegistry.DIORITE_LARGE_BRICKS, "Briques épaisses de diorite");
                addBlock(ECBlockRegistry.DIORITE_LARGE_BRICKS_SLAB, "Dalle en briques épaisses de diorite");
                addBlock(ECBlockRegistry.DIORITE_LARGE_BRICKS_STAIRS, "Escalier en briques épaisses de diorite");
                addBlock(ECBlockRegistry.DIORITE_LARGE_BRICKS_WALL, "Muret en briques épaisses de diorite");
                addBlock(ECBlockRegistry.DIORITE_LARGE_BRICKS_PRESSURE_PLATE, "Plaque de pression en briques épaisses de diorite");

                addBlock(ECBlockRegistry.DIORITE_PAVING_STONES, "Pavage de diorite");
                addBlock(ECBlockRegistry.DIORITE_PAVING_STONES_SLAB, "Dalle en pavage de diorite");
                addBlock(ECBlockRegistry.DIORITE_PAVING_STONES_STAIRS, "Escalier en pavage de diorite");
                addBlock(ECBlockRegistry.DIORITE_PAVING_STONES_WALL, "Muret en pavage de diorite");
                addBlock(ECBlockRegistry.DIORITE_PAVING_STONES_PRESSURE_PLATE, "Plaque de pression en pavage de diorite");

                addBlock(ECBlockRegistry.DIORITE_ORNAMENT, "Ornement en diorite");
                addBlock(ECBlockRegistry.DIORITE_ORNAMENT_PRESSURE_PLATE, "Plaque de pression avec ornement en diorite");

                addBlock(ECBlockRegistry.DIORITE_ROOFTILES, "Tuiles de diorite");
                addBlock(ECBlockRegistry.DIORITE_ROOFTILES_SLAB, "Dalle en tuile de diorite");
                addBlock(ECBlockRegistry.DIORITE_ROOFTILES_STAIRS, "Escalier en tuile de diorite");

                // Granite
                addBlock(ECBlockRegistry.GRANITE_BUTTON, "Bouton en granite");

                addBlock(ECBlockRegistry.SMOOTH_GRANITE, "Granite lisse");
                addBlock(ECBlockRegistry.SMOOTH_GRANITE_SLAB, "Dalle en granite lisse");
                addBlock(ECBlockRegistry.SMOOTH_GRANITE_STAIRS, "Escalier en granite lisse");
                addBlock(ECBlockRegistry.SMOOTH_GRANITE_WALL, "Muret en granite lisse");
                addBlock(ECBlockRegistry.SMOOTH_GRANITE_PRESSURE_PLATE, "Plaque de pression en granite lisse");

                addBlock(ECBlockRegistry.GRANITE_PAVING, "Pavés de granite");
                addBlock(ECBlockRegistry.GRANITE_PAVING_SLAB, "Dalle en pavé de granite");
                addBlock(ECBlockRegistry.GRANITE_PAVING_STAIRS, "Escalier en pavé de granite");
                addBlock(ECBlockRegistry.GRANITE_PAVING_WALL, "Muret en pavé de granite");
                addBlock(ECBlockRegistry.GRANITE_PAVING_PRESSURE_PLATE, "Plaque de pression en pavé de granite");

                addBlock(ECBlockRegistry.GRANITE_TILES, "Carrelage de granite");
                addBlock(ECBlockRegistry.GRANITE_TILES_SLAB, "Dalle en carrelage de granite");
                addBlock(ECBlockRegistry.GRANITE_TILES_STAIRS, "Escalier en carrelage de granite");
                addBlock(ECBlockRegistry.GRANITE_TILES_WALL, "Muret en carrelage de granite");
                addBlock(ECBlockRegistry.GRANITE_TILES_PRESSURE_PLATE, "Plaque de pression en carrelage de granite");

                addBlock(ECBlockRegistry.GRANITE_BRICKS, "Briques de granite");
                addBlock(ECBlockRegistry.GRANITE_BRICKS_SLAB, "Dalle en briques de granite");
                addBlock(ECBlockRegistry.GRANITE_BRICKS_STAIRS, "Escalier en briques de granite");
                addBlock(ECBlockRegistry.GRANITE_BRICKS_WALL, "Muret en briques de granite");
                addBlock(ECBlockRegistry.GRANITE_BRICKS_PRESSURE_PLATE, "Plaque de pression en briques de granite");

                addBlock(ECBlockRegistry.GRANITE_LARGE_BRICKS, "Briques épaisses de granite");
                addBlock(ECBlockRegistry.GRANITE_LARGE_BRICKS_SLAB, "Dalle en briques épaisses de granite");
                addBlock(ECBlockRegistry.GRANITE_LARGE_BRICKS_STAIRS, "Escalier en briques épaisses de granite");
                addBlock(ECBlockRegistry.GRANITE_LARGE_BRICKS_WALL, "Muret en briques épaisses de granite");
                addBlock(ECBlockRegistry.GRANITE_LARGE_BRICKS_PRESSURE_PLATE, "Plaque de pression en briques épaisses de granite");

                addBlock(ECBlockRegistry.GRANITE_PAVING_STONES, "Pavage de granite");
                addBlock(ECBlockRegistry.GRANITE_PAVING_STONES_SLAB, "Dalle en pavage de granite");
                addBlock(ECBlockRegistry.GRANITE_PAVING_STONES_STAIRS, "Escalier en pavage de granite");
                addBlock(ECBlockRegistry.GRANITE_PAVING_STONES_WALL, "Muret en pavage de granite");
                addBlock(ECBlockRegistry.GRANITE_PAVING_STONES_PRESSURE_PLATE, "Plaque de pression en pavage de granite");

                addBlock(ECBlockRegistry.GRANITE_ORNAMENT, "Ornement en granite");
                addBlock(ECBlockRegistry.GRANITE_ORNAMENT_PRESSURE_PLATE, "Plaque de pression avec ornement en granite");

                addBlock(ECBlockRegistry.GRANITE_ROOFTILES, "Tuiles de granite");
                addBlock(ECBlockRegistry.GRANITE_ROOFTILES_SLAB, "Dalle en tuile de granite");
                addBlock(ECBlockRegistry.GRANITE_ROOFTILES_STAIRS, "Escalier en tuile de granite");

                // Sandstone
                addBlock(ECBlockRegistry.SANDSTONE_BUTTON, "Bouton en grès");

                addBlock(ECBlockRegistry.SMOOTH_SANDSTONE_WALL, "Muret de grès lisse");
                addBlock(ECBlockRegistry.SMOOTH_SANDSTONE_PRESSURE_PLATE, "Plaque de pression en grès lisse");

                addBlock(ECBlockRegistry.POLISHED_SANDSTONE, "Grès poli");
                addBlock(ECBlockRegistry.POLISHED_SANDSTONE_SLAB, "Dalle de grès poli");
                addBlock(ECBlockRegistry.POLISHED_SANDSTONE_STAIRS, "Escalier en grès poli");
                addBlock(ECBlockRegistry.POLISHED_SANDSTONE_WALL, "Muret en grès poli");
                addBlock(ECBlockRegistry.POLISHED_SANDSTONE_PRESSURE_PLATE, "Plaque de pression en grès poli");

                addBlock(ECBlockRegistry.SANDSTONE_PAVING, "Pavés de grès");
                addBlock(ECBlockRegistry.SANDSTONE_PAVING_SLAB, "Dalle en pavés de grès");
                addBlock(ECBlockRegistry.SANDSTONE_PAVING_STAIRS, "Escalier en pavés de grès");
                addBlock(ECBlockRegistry.SANDSTONE_PAVING_WALL, "Muret en pavés de grès");
                addBlock(ECBlockRegistry.SANDSTONE_PAVING_PRESSURE_PLATE, "Plaque de pression en pavés de grès");

                addBlock(ECBlockRegistry.SANDSTONE_TILES, "Carrelage en grès");
                addBlock(ECBlockRegistry.SANDSTONE_TILES_SLAB, "Dalle en carrelage de grès");
                addBlock(ECBlockRegistry.SANDSTONE_TILES_STAIRS, "Escalier en carrelage de grès");
                addBlock(ECBlockRegistry.SANDSTONE_TILES_WALL, "Muret en carrelage de grès");
                addBlock(ECBlockRegistry.SANDSTONE_TILES_PRESSURE_PLATE, "Plaque de pression en carrelage de grès");

                addBlock(ECBlockRegistry.SANDSTONE_BRICKS, "Briques de grès");
                addBlock(ECBlockRegistry.SANDSTONE_BRICKS_SLAB, "Dalle en briques de grès");
                addBlock(ECBlockRegistry.SANDSTONE_BRICKS_STAIRS, "Escaliers en briques de grès");
                addBlock(ECBlockRegistry.SANDSTONE_BRICKS_WALL, "Muret en briques de grès");
                addBlock(ECBlockRegistry.SANDSTONE_BRICKS_PRESSURE_PLATE, "Dalle de pression en briques de grès");

                addBlock(ECBlockRegistry.SANDSTONE_LARGE_BRICKS, "Briques épaisses de grès");
                addBlock(ECBlockRegistry.SANDSTONE_LARGE_BRICKS_SLAB, "Dalle en briques épaisses de grès");
                addBlock(ECBlockRegistry.SANDSTONE_LARGE_BRICKS_STAIRS, "Escaliers en briques épaisses de grès");
                addBlock(ECBlockRegistry.SANDSTONE_LARGE_BRICKS_WALL, "Muret en briques épaisses de grès");
                addBlock(ECBlockRegistry.SANDSTONE_LARGE_BRICKS_PRESSURE_PLATE, "Dalle de pression en briques épaisses de grès");

                addBlock(ECBlockRegistry.SANDSTONE_PAVING_STONES, "Pavage de grès");
                addBlock(ECBlockRegistry.SANDSTONE_PAVING_STONES_SLAB, "Dalle en pavages de grès");
                addBlock(ECBlockRegistry.SANDSTONE_PAVING_STONES_STAIRS, "Escalier en pavages de grès");
                addBlock(ECBlockRegistry.SANDSTONE_PAVING_STONES_WALL, "Muret en pavages de grès");
                addBlock(ECBlockRegistry.SANDSTONE_PAVING_STONES_PRESSURE_PLATE, "Plaque de pression en pavages de grès");

                addBlock(ECBlockRegistry.SANDSTONE_ROOFTILES, "Tuiles de grès");
                addBlock(ECBlockRegistry.SANDSTONE_ROOFTILES_SLAB, "Dalle en tuile de grès");
                addBlock(ECBlockRegistry.SANDSTONE_ROOFTILES_STAIRS, "Escalier en tuile de grès");

                // Red Sandstone
                addBlock(ECBlockRegistry.RED_SANDSTONE_BUTTON, "Bouton en grès rouge");

                addBlock(ECBlockRegistry.SMOOTH_RED_SANDSTONE_WALL, "Muret de grès rouge lisse");
                addBlock(ECBlockRegistry.SMOOTH_RED_SANDSTONE_PRESSURE_PLATE, "Plaque de pression en grès rouge lisse");

                addBlock(ECBlockRegistry.POLISHED_RED_SANDSTONE, "Grès poli");
                addBlock(ECBlockRegistry.POLISHED_RED_SANDSTONE_SLAB, "Dalle de grès rouge poli");
                addBlock(ECBlockRegistry.POLISHED_RED_SANDSTONE_STAIRS, "Escalier en grès rouge poli");
                addBlock(ECBlockRegistry.POLISHED_RED_SANDSTONE_WALL, "Muret en grès rouge poli");
                addBlock(ECBlockRegistry.POLISHED_RED_SANDSTONE_PRESSURE_PLATE, "Plaque de pression en grès rouge poli");

                addBlock(ECBlockRegistry.RED_SANDSTONE_PAVING, "Pavés de grès rouge");
                addBlock(ECBlockRegistry.RED_SANDSTONE_PAVING_SLAB, "Dalle en pavés de grès rouge");
                addBlock(ECBlockRegistry.RED_SANDSTONE_PAVING_STAIRS, "Escalier en pavés de grès rouge");
                addBlock(ECBlockRegistry.RED_SANDSTONE_PAVING_WALL, "Muret en pavés de grès rouge");
                addBlock(ECBlockRegistry.RED_SANDSTONE_PAVING_PRESSURE_PLATE, "Plaque de pression en pavés de grès rouge");

                addBlock(ECBlockRegistry.RED_SANDSTONE_TILES, "Carrelage en grès rouge");
                addBlock(ECBlockRegistry.RED_SANDSTONE_TILES_SLAB, "Dalle en carrelage de grès rouge");
                addBlock(ECBlockRegistry.RED_SANDSTONE_TILES_STAIRS, "Escalier en carrelage de grès rouge");
                addBlock(ECBlockRegistry.RED_SANDSTONE_TILES_WALL, "Muret en carrelage de grès rouge");
                addBlock(ECBlockRegistry.RED_SANDSTONE_TILES_PRESSURE_PLATE, "Plaque de pression en carrelage de grès rouge");

                addBlock(ECBlockRegistry.RED_SANDSTONE_BRICKS, "Briques de grès rouge");
                addBlock(ECBlockRegistry.RED_SANDSTONE_BRICKS_SLAB, "Dalle en briques de grès rouge");
                addBlock(ECBlockRegistry.RED_SANDSTONE_BRICKS_STAIRS, "Escaliers en briques de grès rouge");
                addBlock(ECBlockRegistry.RED_SANDSTONE_BRICKS_WALL, "Muret en briques de grès rouge");
                addBlock(ECBlockRegistry.RED_SANDSTONE_BRICKS_PRESSURE_PLATE, "Dalle de pression en briques de grès rouge");

                addBlock(ECBlockRegistry.RED_SANDSTONE_LARGE_BRICKS, "Briques épaisses de grès rouge");
                addBlock(ECBlockRegistry.RED_SANDSTONE_LARGE_BRICKS_SLAB, "Dalle en briques épaisses de grès rouge");
                addBlock(ECBlockRegistry.RED_SANDSTONE_LARGE_BRICKS_STAIRS, "Escaliers en briques épaisses de grès rouge");
                addBlock(ECBlockRegistry.RED_SANDSTONE_LARGE_BRICKS_WALL, "Muret en briques épaisses de grès rouge");
                addBlock(ECBlockRegistry.RED_SANDSTONE_LARGE_BRICKS_PRESSURE_PLATE, "Dalle de pression en briques épaisses de grès rouge");

                addBlock(ECBlockRegistry.RED_SANDSTONE_PAVING_STONES, "Pavage de grès rouge");
                addBlock(ECBlockRegistry.RED_SANDSTONE_PAVING_STONES_SLAB, "Dalle en pavages de grès rouge");
                addBlock(ECBlockRegistry.RED_SANDSTONE_PAVING_STONES_STAIRS, "Escalier en pavages de grès rouge");
                addBlock(ECBlockRegistry.RED_SANDSTONE_PAVING_STONES_WALL, "Muret en pavages de grès rouge");
                addBlock(ECBlockRegistry.RED_SANDSTONE_PAVING_STONES_PRESSURE_PLATE, "Plaque de pression en pavages de grès rouge");

                addBlock(ECBlockRegistry.RED_SANDSTONE_ROOFTILES, "Tuiles de grès rouge");
                addBlock(ECBlockRegistry.RED_SANDSTONE_ROOFTILES_SLAB, "Dalle en tuile de grès rouge");
                addBlock(ECBlockRegistry.RED_SANDSTONE_ROOFTILES_STAIRS, "Escalier en tuile de grès rouge");

                // Basalt
                addBlock(ECBlockRegistry.TERRACOTTA_SLAB, "Dalle en terre cuite");
                addBlock(ECBlockRegistry.TERRACOTTA_STAIRS, "Escalier en terre cuite");
                addBlock(ECBlockRegistry.TERRACOTTA_WALL, "Muret en terre cuite");
                addBlock(ECBlockRegistry.TERRACOTTA_PRESSURE_PLATE, "Plaque de pression en terre cuite");
                addBlock(ECBlockRegistry.TERRACOTTA_BUTTON, "Bouton en terre cuite");

                addBlock(ECBlockRegistry.POLISHED_TERRACOTTA, "Terre cuite polie");
                addBlock(ECBlockRegistry.POLISHED_TERRACOTTA_SLAB, "Dalle en terre cuite polie");
                addBlock(ECBlockRegistry.POLISHED_TERRACOTTA_STAIRS, "Escalier en terre cuite polie");
                addBlock(ECBlockRegistry.POLISHED_TERRACOTTA_WALL, "Muret en terre cuite polie");
                addBlock(ECBlockRegistry.POLISHED_TERRACOTTA_PRESSURE_PLATE, "Plaque de pression en terre cuite polie");

                addBlock(ECBlockRegistry.TERRACOTTA_PAVING, "Pavés en terre cuite");
                addBlock(ECBlockRegistry.TERRACOTTA_PAVING_SLAB, "Dalle en pavé de terre cuite");
                addBlock(ECBlockRegistry.TERRACOTTA_PAVING_STAIRS, "Escalier en pavé de terre cuite");
                addBlock(ECBlockRegistry.TERRACOTTA_PAVING_WALL, "Muret en pavé de terre cuite");
                addBlock(ECBlockRegistry.TERRACOTTA_PAVING_PRESSURE_PLATE, "Plaque de pression en pavé de terre cuite");

                addBlock(ECBlockRegistry.TERRACOTTA_TILES, "Carrelage en terre cuite");
                addBlock(ECBlockRegistry.TERRACOTTA_TILES_SLAB, "Dalle en carrelage de terre cuite");
                addBlock(ECBlockRegistry.TERRACOTTA_TILES_STAIRS, "Escalier en carrelage de terre cuite");
                addBlock(ECBlockRegistry.TERRACOTTA_TILES_WALL, "Muret en carrelage de terre cuite");
                addBlock(ECBlockRegistry.TERRACOTTA_TILES_PRESSURE_PLATE, "Plaque de pression en carrelage de terre cuite");

                addBlock(ECBlockRegistry.TERRACOTTA_BRICKS, "Briques en terre cuite");
                addBlock(ECBlockRegistry.TERRACOTTA_BRICKS_SLAB, "Dalle en briques de terre cuite");
                addBlock(ECBlockRegistry.TERRACOTTA_BRICKS_STAIRS, "Escalier en briques de terre cuite");
                addBlock(ECBlockRegistry.TERRACOTTA_BRICKS_WALL, "Muret en briques de terre cuite");
                addBlock(ECBlockRegistry.TERRACOTTA_BRICKS_PRESSURE_PLATE, "Plaque de pression en briques de terre cuite");

                addBlock(ECBlockRegistry.TERRACOTTA_LARGE_BRICKS, "Briques épaisses en terre cuite");
                addBlock(ECBlockRegistry.TERRACOTTA_LARGE_BRICKS_SLAB, "Dalle en briques épaisses de terre cuite");
                addBlock(ECBlockRegistry.TERRACOTTA_LARGE_BRICKS_STAIRS, "Escalier en briques épaisses de terre cuite");
                addBlock(ECBlockRegistry.TERRACOTTA_LARGE_BRICKS_WALL, "Muret en briques épaisses de terre cuite");
                addBlock(ECBlockRegistry.TERRACOTTA_LARGE_BRICKS_PRESSURE_PLATE, "Plaque de pression en briques épaisses de terre cuite");

                addBlock(ECBlockRegistry.TERRACOTTA_PAVING_STONES, "Pavage en terre cuite");
                addBlock(ECBlockRegistry.TERRACOTTA_PAVING_STONES_SLAB, "Dalle en pavage de terre cuite");
                addBlock(ECBlockRegistry.TERRACOTTA_PAVING_STONES_STAIRS, "Escalier en pavage de terre cuite");
                addBlock(ECBlockRegistry.TERRACOTTA_PAVING_STONES_WALL, "Muret en pavage de terre cuite");
                addBlock(ECBlockRegistry.TERRACOTTA_PAVING_STONES_PRESSURE_PLATE, "Plaque de pression en pavage de terre cuite");

                addBlock(ECBlockRegistry.TERRACOTTA_ROOFTILES, "Tuiles de terre cuite");
                addBlock(ECBlockRegistry.TERRACOTTA_ROOFTILES_SLAB, "Dalle en tuile de terre cuite");
                addBlock(ECBlockRegistry.TERRACOTTA_ROOFTILES_STAIRS, "Escalier en tuile de terre cuite");
        }
    }
}