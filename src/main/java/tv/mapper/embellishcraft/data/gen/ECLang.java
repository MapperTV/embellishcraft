package tv.mapper.embellishcraft.data.gen;

import java.util.Arrays;

import org.codehaus.plexus.util.StringUtils;

import net.minecraft.data.DataGenerator;
import net.minecraft.item.DyeColor;
import net.minecraftforge.common.data.LanguageProvider;
import tv.mapper.embellishcraft.block.ECBlockRegistry;
import tv.mapper.embellishcraft.util.McWoods;
import tv.mapper.embellishcraft.util.RockType;

public class ECLang extends LanguageProvider
{
    private String lang;

    public ECLang(DataGenerator gen, String modid, String locale)
    {
        super(gen, modid, locale);
        lang = locale;
    }

    @Override
    protected void addTranslations()
    {
        String name;

        switch(lang)
        {
            default:
            case "en_us":
                for(int j = 0; j < Arrays.stream(RockType.values()).count(); j++)
                {
                    // Rocks
                    addBlock(ECBlockRegistry.ROCK_BLOCKS.get(RockType.byId(j)), StringUtils.capitalise(RockType.byId(j).getName()));
                    addBlock(ECBlockRegistry.ROCK_STAIRS.get(RockType.byId(j)), StringUtils.capitalise(RockType.byId(j).getName()) + " Stairs");
                    addBlock(ECBlockRegistry.ROCK_SLABS.get(RockType.byId(j)), StringUtils.capitalise(RockType.byId(j).getName()) + " Slab");
                    addBlock(ECBlockRegistry.ROCK_WALLS.get(RockType.byId(j)), StringUtils.capitalise(RockType.byId(j).getName()) + " Wall");
                    addBlock(ECBlockRegistry.ROCK_PRESSURE_PLATES.get(RockType.byId(j)), StringUtils.capitalise(RockType.byId(j).getName()) + " Pressure Plate");
                    addBlock(ECBlockRegistry.ROCK_BUTTONS.get(RockType.byId(j)), StringUtils.capitalise(RockType.byId(j).getName()) + " Button");

                    // Cobbletones
                    addBlock(ECBlockRegistry.ROCK_COBBLESTONES.get(RockType.byId(j)), StringUtils.capitalise(RockType.byId(j).getName()) + " Cobblestone");
                    addBlock(ECBlockRegistry.ROCK_COBBLESTONE_STAIRS.get(RockType.byId(j)), StringUtils.capitalise(RockType.byId(j).getName()) + " Cobblestone Stairs");
                    addBlock(ECBlockRegistry.ROCK_COBBLESTONE_SLABS.get(RockType.byId(j)), StringUtils.capitalise(RockType.byId(j).getName()) + " Cobblestone Slab");
                    addBlock(ECBlockRegistry.ROCK_COBBLESTONE_WALLS.get(RockType.byId(j)), StringUtils.capitalise(RockType.byId(j).getName()) + " Cobblestone Wall");
                    addBlock(ECBlockRegistry.ROCK_COBBLESTONE_PRESSURE_PLATES.get(RockType.byId(j)), StringUtils.capitalise(RockType.byId(j).getName()) + " Cobblestone Pressure Plate");

                    // Smooth rocks
                    addBlock(ECBlockRegistry.SMOOTH_ROCK_BLOCKS.get(RockType.byId(j)), "Smooth " + StringUtils.capitalise(RockType.byId(j).getName()));
                    addBlock(ECBlockRegistry.SMOOTH_ROCK_STAIRS.get(RockType.byId(j)), "Smooth " + StringUtils.capitalise(RockType.byId(j).getName()) + " Stairs");
                    addBlock(ECBlockRegistry.SMOOTH_ROCK_SLABS.get(RockType.byId(j)), "Smooth " + StringUtils.capitalise(RockType.byId(j).getName()) + " Slab");
                    addBlock(ECBlockRegistry.SMOOTH_ROCK_WALLS.get(RockType.byId(j)), "Smooth " + StringUtils.capitalise(RockType.byId(j).getName()) + " Wall");
                    addBlock(ECBlockRegistry.SMOOTH_ROCK_PRESSURE_PLATES.get(RockType.byId(j)), "Smooth " + StringUtils.capitalise(RockType.byId(j).getName()) + " Pressure Plate");

                    // Polished rocks
                    addBlock(ECBlockRegistry.POLISHED_ROCK_BLOCKS.get(RockType.byId(j)), "Polished " + StringUtils.capitalise(RockType.byId(j).getName()));
                    addBlock(ECBlockRegistry.POLISHED_ROCK_STAIRS.get(RockType.byId(j)), "Polished " + StringUtils.capitalise(RockType.byId(j).getName()) + " Stairs");
                    addBlock(ECBlockRegistry.POLISHED_ROCK_SLABS.get(RockType.byId(j)), "Polished " + StringUtils.capitalise(RockType.byId(j).getName()) + " Slab");
                    addBlock(ECBlockRegistry.POLISHED_ROCK_WALLS.get(RockType.byId(j)), "Polished " + StringUtils.capitalise(RockType.byId(j).getName()) + " Wall");
                    addBlock(ECBlockRegistry.POLISHED_ROCK_PRESSURE_PLATES.get(RockType.byId(j)), "Polished " + StringUtils.capitalise(RockType.byId(j).getName()) + " Pressure Plate");

                    // Rock pavings
                    addBlock(ECBlockRegistry.ROCK_PAVINGS.get(RockType.byId(j)), StringUtils.capitalise(RockType.byId(j).getName()) + " Paving");
                    addBlock(ECBlockRegistry.ROCK_PAVING_STAIRS.get(RockType.byId(j)), StringUtils.capitalise(RockType.byId(j).getName()) + " Paving Stairs");
                    addBlock(ECBlockRegistry.ROCK_PAVING_SLABS.get(RockType.byId(j)), StringUtils.capitalise(RockType.byId(j).getName()) + " Paving Slab");
                    addBlock(ECBlockRegistry.ROCK_PAVING_WALLS.get(RockType.byId(j)), StringUtils.capitalise(RockType.byId(j).getName()) + " Paving Wall");
                    addBlock(ECBlockRegistry.ROCK_PAVING_PRESSURE_PLATES.get(RockType.byId(j)), StringUtils.capitalise(RockType.byId(j).getName()) + " Paving Pressure Plate");

                    // Rock tiles
                    addBlock(ECBlockRegistry.ROCK_TILES.get(RockType.byId(j)), StringUtils.capitalise(RockType.byId(j).getName()) + " Tiles");
                    addBlock(ECBlockRegistry.ROCK_TILES_STAIRS.get(RockType.byId(j)), StringUtils.capitalise(RockType.byId(j).getName()) + " Tiles Stairs");
                    addBlock(ECBlockRegistry.ROCK_TILES_SLABS.get(RockType.byId(j)), StringUtils.capitalise(RockType.byId(j).getName()) + " Tiles Slab");
                    addBlock(ECBlockRegistry.ROCK_TILES_WALLS.get(RockType.byId(j)), StringUtils.capitalise(RockType.byId(j).getName()) + " Tiles Wall");
                    addBlock(ECBlockRegistry.ROCK_TILES_PRESSURE_PLATES.get(RockType.byId(j)), StringUtils.capitalise(RockType.byId(j).getName()) + " Tiles Pressure Plate");

                    // Rock bricks
                    addBlock(ECBlockRegistry.ROCK_BRICKS.get(RockType.byId(j)), StringUtils.capitalise(RockType.byId(j).getName()) + " Bricks");
                    addBlock(ECBlockRegistry.ROCK_BRICKS_STAIRS.get(RockType.byId(j)), StringUtils.capitalise(RockType.byId(j).getName()) + " Bricks Stairs");
                    addBlock(ECBlockRegistry.ROCK_BRICKS_SLABS.get(RockType.byId(j)), StringUtils.capitalise(RockType.byId(j).getName()) + " Bricks Slab");
                    addBlock(ECBlockRegistry.ROCK_BRICKS_WALLS.get(RockType.byId(j)), StringUtils.capitalise(RockType.byId(j).getName()) + " Bricks Wall");
                    addBlock(ECBlockRegistry.ROCK_BRICKS_PRESSURE_PLATES.get(RockType.byId(j)), StringUtils.capitalise(RockType.byId(j).getName()) + " Bricks Pressure Plate");

                    // Rock large bricks
                    addBlock(ECBlockRegistry.ROCK_LARGE_BRICKS.get(RockType.byId(j)), StringUtils.capitalise(RockType.byId(j).getName()) + " Large Bricks");
                    addBlock(ECBlockRegistry.ROCK_LARGE_BRICKS_STAIRS.get(RockType.byId(j)), StringUtils.capitalise(RockType.byId(j).getName()) + " Large Bricks Stairs");
                    addBlock(ECBlockRegistry.ROCK_LARGE_BRICKS_SLABS.get(RockType.byId(j)), StringUtils.capitalise(RockType.byId(j).getName()) + " Large Bricks Slab");
                    addBlock(ECBlockRegistry.ROCK_LARGE_BRICKS_WALLS.get(RockType.byId(j)), StringUtils.capitalise(RockType.byId(j).getName()) + " Large Bricks Wall");
                    addBlock(ECBlockRegistry.ROCK_LARGE_BRICKS_PRESSURE_PLATES.get(RockType.byId(j)), StringUtils.capitalise(RockType.byId(j).getName()) + " Large Bricks Pressure Plate");

                    // Rock ornaments
                    addBlock(ECBlockRegistry.ROCK_ORNAMENTS.get(RockType.byId(j)), StringUtils.capitalise(RockType.byId(j).getName()) + " Ornament");
                    addBlock(ECBlockRegistry.ROCK_ORNAMENT_PRESSURE_PLATES.get(RockType.byId(j)), StringUtils.capitalise(RockType.byId(j).getName()) + " Ornament Pressure Plate");
                }

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

                addBlock(ECBlockRegistry.ANDESITE_ORNAMENT, "Andesite Ornament");
                addBlock(ECBlockRegistry.ANDESITE_ORNAMENT_PRESSURE_PLATE, "Andesite Ornament Pressure Plate");

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

                addBlock(ECBlockRegistry.DIORITE_ORNAMENT, "Diorite Ornament");
                addBlock(ECBlockRegistry.DIORITE_ORNAMENT_PRESSURE_PLATE, "Diorite Ornament Pressure Plate");

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

                addBlock(ECBlockRegistry.GRANITE_ORNAMENT, "Granite Ornament");
                addBlock(ECBlockRegistry.GRANITE_ORNAMENT_PRESSURE_PLATE, "Granite Ornament Pressure Plate");

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

                // Other bricks
                addBlock(ECBlockRegistry.DARK_BRICKS, "Dark Bricks");
                addBlock(ECBlockRegistry.DARK_BRICKS_SLAB, "Dark Bricks Slab");
                addBlock(ECBlockRegistry.DARK_BRICKS_STAIRS, "Dark Bricks Stairs");
                addBlock(ECBlockRegistry.DARK_BRICKS_WALL, "Dark Bricks Wall");
                addBlock(ECBlockRegistry.DARK_BRICKS_PRESSURE_PLATE, "Dark Bricks Pressure Plate");

                addBlock(ECBlockRegistry.DARK_LARGE_BRICKS, "Dark Large Bricks");
                addBlock(ECBlockRegistry.DARK_LARGE_BRICKS_SLAB, "Dark Large Bricks Slab");
                addBlock(ECBlockRegistry.DARK_LARGE_BRICKS_STAIRS, "Dark Large Bricks Stairs");
                addBlock(ECBlockRegistry.DARK_LARGE_BRICKS_WALL, "Dark Large Bricks Wall");
                addBlock(ECBlockRegistry.DARK_LARGE_BRICKS_PRESSURE_PLATE, "Dark Large Bricks Pressure Plate");

                addBlock(ECBlockRegistry.OLD_BRICKS, "Old Bricks");
                addBlock(ECBlockRegistry.OLD_BRICKS_SLAB, "Old Bricks Slab");
                addBlock(ECBlockRegistry.OLD_BRICKS_STAIRS, "Old Bricks Stairs");
                addBlock(ECBlockRegistry.OLD_BRICKS_WALL, "Old Bricks Wall");
                addBlock(ECBlockRegistry.OLD_BRICKS_PRESSURE_PLATE, "Old Bricks Pressure Plate");

                addBlock(ECBlockRegistry.OLD_LARGE_BRICKS, "Old Large Bricks");
                addBlock(ECBlockRegistry.OLD_LARGE_BRICKS_SLAB, "Old Large Bricks Slab");
                addBlock(ECBlockRegistry.OLD_LARGE_BRICKS_STAIRS, "Old Large Bricks Stairs");
                addBlock(ECBlockRegistry.OLD_LARGE_BRICKS_WALL, "Old Large Bricks Wall");
                addBlock(ECBlockRegistry.OLD_LARGE_BRICKS_PRESSURE_PLATE, "Old Large Bricks Pressure Plate");

                addBlock(ECBlockRegistry.WEARED_BRICKS, "Weared Bricks");
                addBlock(ECBlockRegistry.WEARED_BRICKS_SLAB, "Weared Bricks Slab");
                addBlock(ECBlockRegistry.WEARED_BRICKS_STAIRS, "Weared Bricks Stairs");
                addBlock(ECBlockRegistry.WEARED_BRICKS_WALL, "Weared Bricks Wall");
                addBlock(ECBlockRegistry.WEARED_BRICKS_PRESSURE_PLATE, "Weared Bricks Pressure Plate");

                addBlock(ECBlockRegistry.WEARED_LARGE_BRICKS, "Weared Large Bricks");
                addBlock(ECBlockRegistry.WEARED_LARGE_BRICKS_SLAB, "Weared Large Bricks Slab");
                addBlock(ECBlockRegistry.WEARED_LARGE_BRICKS_STAIRS, "Weared Large Bricks Stairs");
                addBlock(ECBlockRegistry.WEARED_LARGE_BRICKS_WALL, "Weared Large Bricks Wall");
                addBlock(ECBlockRegistry.WEARED_LARGE_BRICKS_PRESSURE_PLATE, "Weared Large Bricks Pressure Plate");

                // Pavings
                addBlock(ECBlockRegistry.CONCRETE_PAVING, "Concrete Paving");
                addBlock(ECBlockRegistry.CONCRETE_PAVING_SLAB, "Concrete Paving Slab");
                addBlock(ECBlockRegistry.CONCRETE_PAVING_STAIRS, "Concrete Paving Stairs");
                addBlock(ECBlockRegistry.CONCRETE_PAVING_WALL, "Concrete Paving Wall");
                addBlock(ECBlockRegistry.CONCRETE_PAVING_PRESSURE_PLATE, "Concrete Paving Pressure Plate");

                addBlock(ECBlockRegistry.DAMAGED_PAVING, "Damaged Paving");
                addBlock(ECBlockRegistry.DAMAGED_PAVING_SLAB, "Damaged Paving Slab");
                addBlock(ECBlockRegistry.DAMAGED_PAVING_STAIRS, "Damaged Paving Stairs");
                addBlock(ECBlockRegistry.DAMAGED_PAVING_WALL, "Damaged Paving Wall");
                addBlock(ECBlockRegistry.DAMAGED_PAVING_PRESSURE_PLATE, "Damaged Paving Pressure Plate");

                addBlock(ECBlockRegistry.DARK_CONCRETE_PAVING, "Dark Concrete Paving");
                addBlock(ECBlockRegistry.DARK_CONCRETE_PAVING_SLAB, "Dark Concrete Paving Slab");
                addBlock(ECBlockRegistry.DARK_CONCRETE_PAVING_STAIRS, "Dark Concrete Paving Stairs");
                addBlock(ECBlockRegistry.DARK_CONCRETE_PAVING_WALL, "Dark Concrete Paving Wall");
                addBlock(ECBlockRegistry.DARK_CONCRETE_PAVING_PRESSURE_PLATE, "Dark Concrete Paving Pressure Plate");

                addBlock(ECBlockRegistry.MOIST_PAVING, "Moist Paving");
                addBlock(ECBlockRegistry.MOIST_PAVING_SLAB, "Moist Paving Slab");
                addBlock(ECBlockRegistry.MOIST_PAVING_STAIRS, "Moist Paving Stairs");
                addBlock(ECBlockRegistry.MOIST_PAVING_WALL, "Moist Paving Wall");
                addBlock(ECBlockRegistry.MOIST_PAVING_PRESSURE_PLATE, "Moist Paving Pressure Plate");

                addBlock(ECBlockRegistry.POLISHED_PAVING, "Polished Paving");
                addBlock(ECBlockRegistry.POLISHED_PAVING_SLAB, "Polished Paving Slab");
                addBlock(ECBlockRegistry.POLISHED_PAVING_STAIRS, "Polished Paving Stairs");
                addBlock(ECBlockRegistry.POLISHED_PAVING_WALL, "Polished Paving Wall");
                addBlock(ECBlockRegistry.POLISHED_PAVING_PRESSURE_PLATE, "Polished Paving Pressure Plate");

                addBlock(ECBlockRegistry.WHITE_CONCRETE_PAVING, "White Concrete Paving");
                addBlock(ECBlockRegistry.WHITE_CONCRETE_PAVING_SLAB, "White Concrete Paving Slab");
                addBlock(ECBlockRegistry.WHITE_CONCRETE_PAVING_STAIRS, "White Concrete Paving Stairs");
                addBlock(ECBlockRegistry.WHITE_CONCRETE_PAVING_WALL, "White Concrete Paving Wall");
                addBlock(ECBlockRegistry.WHITE_CONCRETE_PAVING_PRESSURE_PLATE, "White Concrete Paving Pressure Plate");

                // Tiles
                addBlock(ECBlockRegistry.CONCRETE_TILES, "Concrete Tiles");
                addBlock(ECBlockRegistry.CONCRETE_TILES_SLAB, "Concrete Tiles Slab");
                addBlock(ECBlockRegistry.CONCRETE_TILES_STAIRS, "Concrete Tiles Stairs");
                addBlock(ECBlockRegistry.CONCRETE_TILES_WALL, "Concrete Tiles Wall");
                addBlock(ECBlockRegistry.CONCRETE_TILES_PRESSURE_PLATE, "Concrete Tiles Pressure Plate");

                addBlock(ECBlockRegistry.SKYBLUE_TILES, "Skyblue Tiles");
                addBlock(ECBlockRegistry.SKYBLUE_TILES_SLAB, "Skyblue Tiles Slab");
                addBlock(ECBlockRegistry.SKYBLUE_TILES_STAIRS, "Skyblue Tiles Stairs");
                addBlock(ECBlockRegistry.SKYBLUE_TILES_WALL, "Skyblue Tiles Wall");
                addBlock(ECBlockRegistry.SKYBLUE_TILES_PRESSURE_PLATE, "Skyblue Tiles Pressure Plate");

                addBlock(ECBlockRegistry.ORANGE_TILES, "Orange Tiles");
                addBlock(ECBlockRegistry.ORANGE_TILES_SLAB, "Orange Tiles Slab");
                addBlock(ECBlockRegistry.ORANGE_TILES_STAIRS, "Orange Tiles Stairs");
                addBlock(ECBlockRegistry.ORANGE_TILES_WALL, "Orange Tiles Wall");
                addBlock(ECBlockRegistry.ORANGE_TILES_PRESSURE_PLATE, "Orange Tiles Pressure Plate");

                addBlock(ECBlockRegistry.BLUE_TILES, "Blue Tiles");
                addBlock(ECBlockRegistry.BLUE_TILES_SLAB, "Blue Tiles Slab");
                addBlock(ECBlockRegistry.BLUE_TILES_STAIRS, "Blue Tiles Stairs");
                addBlock(ECBlockRegistry.BLUE_TILES_WALL, "Blue Tiles Wall");
                addBlock(ECBlockRegistry.BLUE_TILES_PRESSURE_PLATE, "Blue Tiles Pressure Plate");

                addBlock(ECBlockRegistry.LIGHT_BLUE_TILES, "Light Blue Tiles");
                addBlock(ECBlockRegistry.LIGHT_BLUE_TILES_SLAB, "Light Blue Tiles Slab");
                addBlock(ECBlockRegistry.LIGHT_BLUE_TILES_STAIRS, "Light Blue Tiles Stairs");
                addBlock(ECBlockRegistry.LIGHT_BLUE_TILES_WALL, "Light Blue Tiles Wall");
                addBlock(ECBlockRegistry.LIGHT_BLUE_TILES_PRESSURE_PLATE, "Light Blue Tiles Pressure Plate");

                addBlock(ECBlockRegistry.RED_TILES, "Red Tiles");
                addBlock(ECBlockRegistry.RED_TILES_SLAB, "Red Tiles Slab");
                addBlock(ECBlockRegistry.RED_TILES_STAIRS, "Red Tiles Stairs");
                addBlock(ECBlockRegistry.RED_TILES_WALL, "Red Tiles Wall");
                addBlock(ECBlockRegistry.RED_TILES_PRESSURE_PLATE, "Red Tiles Pressure Plate");

                addBlock(ECBlockRegistry.WHITE_TILES, "White Tiles");
                addBlock(ECBlockRegistry.WHITE_TILES_SLAB, "White Tiles Slab");
                addBlock(ECBlockRegistry.WHITE_TILES_STAIRS, "White Tiles Stairs");
                addBlock(ECBlockRegistry.WHITE_TILES_WALL, "White Tiles Wall");
                addBlock(ECBlockRegistry.WHITE_TILES_PRESSURE_PLATE, "White Tiles Pressure Plate");

                addBlock(ECBlockRegistry.YELLOW_TILES, "Yellow Tiles");
                addBlock(ECBlockRegistry.YELLOW_TILES_SLAB, "Yellow Tiles Slab");
                addBlock(ECBlockRegistry.YELLOW_TILES_STAIRS, "Yellow Tiles Stairs");
                addBlock(ECBlockRegistry.YELLOW_TILES_WALL, "Yellow Tiles Wall");
                addBlock(ECBlockRegistry.YELLOW_TILES_PRESSURE_PLATE, "Yellow Tiles Pressure Plate");

                addBlock(ECBlockRegistry.YELLOW_GREY_TILES, "Yellow-Grey Tiles");
                addBlock(ECBlockRegistry.YELLOW_GREY_TILES_SLAB, "Yellow-Grey Tiles Slab");
                addBlock(ECBlockRegistry.YELLOW_GREY_TILES_STAIRS, "Yellow-Grey Tiles Stairs");
                addBlock(ECBlockRegistry.YELLOW_GREY_TILES_WALL, "Yellow-Grey Tiles Wall");
                addBlock(ECBlockRegistry.YELLOW_GREY_TILES_PRESSURE_PLATE, "Yellow-Grey Tiles Pressure Plate");

                // Corrugated metal plates
                for(int j = 0; j < Arrays.stream(DyeColor.values()).count(); j++)
                {
                    String color = DyeColor.byId(j).getName();
                    String check[] = color.split("_");
                    if(check.length > 1)
                        color = StringUtils.capitalise(check[0]) + " " + StringUtils.capitalise(check[1]);
                    else
                        color = StringUtils.capitalise(check[0]);

                    addBlock(ECBlockRegistry.CORRUGATED_METAL_PLATE_BLOCKS.get(DyeColor.byId(j)), color + " Corrugated Metal Plate");
                    addBlock(ECBlockRegistry.CORRUGATED_METAL_PLATE_SLABS.get(DyeColor.byId(j)), color + " Corrugated Metal Plate Slab");
                    addBlock(ECBlockRegistry.CORRUGATED_METAL_PLATE_STAIRS.get(DyeColor.byId(j)), color + " Corrugated Metal Plate Stairs");
                    addBlock(ECBlockRegistry.CORRUGATED_METAL_PLATE_WALLS.get(DyeColor.byId(j)), color + " Corrugated Metal Plate Wall");
                    addBlock(ECBlockRegistry.CORRUGATED_METAL_PLATE_PRESSURE_PLATES.get(DyeColor.byId(j)), color + " Corrugated Metal Plate Pressure Plate");
                }

                // Metal blocks
                addBlock(ECBlockRegistry.DARK_METAL_FLOOR, "Dark Metal Floor");
                addBlock(ECBlockRegistry.DARK_METAL_FLOOR_SLAB, "Dark Metal Slab");
                addBlock(ECBlockRegistry.DARK_METAL_FLOOR_STAIRS, "Dark Metal Stairs");
                addBlock(ECBlockRegistry.DARK_METAL_FLOOR_WALL, "Dark Metal Wall");
                addBlock(ECBlockRegistry.DARK_METAL_FLOOR_PRESSURE_PLATE, "Dark Metal Pressure Plate");

                addBlock(ECBlockRegistry.LIGHT_METAL_FLOOR, "Light Metal Floor");
                addBlock(ECBlockRegistry.LIGHT_METAL_FLOOR_SLAB, "Light Metal Slab");
                addBlock(ECBlockRegistry.LIGHT_METAL_FLOOR_STAIRS, "Light Metal Stairs");
                addBlock(ECBlockRegistry.LIGHT_METAL_FLOOR_WALL, "Light Metal Wall");
                addBlock(ECBlockRegistry.LIGHT_METAL_FLOOR_PRESSURE_PLATE, "Light Metal Pressure Plate");

                addBlock(ECBlockRegistry.RUSTY_PLATE, "Rusty Plate");
                addBlock(ECBlockRegistry.RUSTY_PLATE_SLAB, "Rusty Plate Slab");
                addBlock(ECBlockRegistry.RUSTY_PLATE_STAIRS, "Rusty Plate Stairs");
                addBlock(ECBlockRegistry.RUSTY_PLATE_WALL, "Rusty Plate Wall");
                addBlock(ECBlockRegistry.RUSTY_PLATE_PRESSURE_PLATE, "Rusty Plate Pressure Plate");

                addBlock(ECBlockRegistry.IRON_BEAM, "Iron Beam");
                addBlock(ECBlockRegistry.BOLTED_IRON_BEAM, "Bolted Iron Beam");
                addBlock(ECBlockRegistry.IRON_BEAM_JUNCTION, "Iron Beam Junction");
                addBlock(ECBlockRegistry.STEEL_BEAM, "Steel Beam");
                addBlock(ECBlockRegistry.BOLTED_STEEL_BEAM, "Bolted Steel Beam");
                addBlock(ECBlockRegistry.STEEL_BEAM_JUNCTION, "Steel Beam Junction");

                addBlock(ECBlockRegistry.AIR_DUCT, "Air duct");
                addBlock(ECBlockRegistry.VENT_AIR_DUCT, "Vent Air duct");
                addBlock(ECBlockRegistry.GRID_AIR_DUCT, "Grid Air duct");

                addBlock(ECBlockRegistry.BULKHEAD, "Bulkhead");
                addBlock(ECBlockRegistry.BULKHEAD_TOP, "Bulkhead Top");

                addBlock(ECBlockRegistry.STEEL_WALL_LADDER, "Steel Wall Ladder");
                addBlock(ECBlockRegistry.RUSTY_WALL_LADDER, "Rusty Wall Ladder");
                addBlock(ECBlockRegistry.STEEL_RUNGS, "Steel Rungs");
                addBlock(ECBlockRegistry.RUSTY_RUNGS, "Rusty Rungs");

                // Wallpapers
                addBlock(ECBlockRegistry.WHITE_BLUE_WALLPAPER, "White / Blue Wallpaper");
                addBlock(ECBlockRegistry.WHITE_BLUE_WALLPAPER_SLAB, "White / Blue Wallpaper Slab");
                addBlock(ECBlockRegistry.WHITE_BLUE_WALLPAPER_STAIRS, "White / Blue Wallpaper Stairs");
                addBlock(ECBlockRegistry.WHITE_BLUE_WALLPAPER_PLINTH, "White / Blue Wallpaper With Plinth");

                addBlock(ECBlockRegistry.BEIGE_FLOWER_WALLPAPER, "Beige / Flower Wallpaper");
                addBlock(ECBlockRegistry.BEIGE_FLOWER_WALLPAPER_SLAB, "Beige / Flower Wallpaper Slab");
                addBlock(ECBlockRegistry.BEIGE_FLOWER_WALLPAPER_STAIRS, "Beige / Flower Wallpaper Stairs");
                addBlock(ECBlockRegistry.BEIGE_FLOWER_WALLPAPER_PLINTH, "Beige / Flower Wallpaper With Plinth");

                addBlock(ECBlockRegistry.BEIGE_WALLPAPER, "Beige Wallpaper");
                addBlock(ECBlockRegistry.BEIGE_WALLPAPER_SLAB, "Beige Wallpaper Slab");
                addBlock(ECBlockRegistry.BEIGE_WALLPAPER_STAIRS, "Beige Wallpaper Stairs");
                addBlock(ECBlockRegistry.BEIGE_WALLPAPER_PLINTH, "Beige Wallpaper With Plinth");

                addBlock(ECBlockRegistry.PINK_WALLPAPER, "Pink Wallpaper");
                addBlock(ECBlockRegistry.PINK_WALLPAPER_SLAB, "Pink Wallpaper Slab");
                addBlock(ECBlockRegistry.PINK_WALLPAPER_STAIRS, "Pink Wallpaper Stairs");
                addBlock(ECBlockRegistry.PINK_WALLPAPER_PLINTH, "Pink Wallpaper With Plinth");

                addBlock(ECBlockRegistry.WHITE_GREEN_WALLPAPER, "White / Green Wallpaper");
                addBlock(ECBlockRegistry.WHITE_GREEN_WALLPAPER_SLAB, "White / Green Wallpaper Slab");
                addBlock(ECBlockRegistry.WHITE_GREEN_WALLPAPER_STAIRS, "White / Green Wallpaper Stairs");
                addBlock(ECBlockRegistry.WHITE_GREEN_WALLPAPER_PLINTH, "White / Green Wallpaper With Plinth");

                // Furniture, doors, suspended stairs, wooden crates
                for(int j = 0; j < Arrays.stream(McWoods.values()).count(); j++)
                {
                    name = McWoods.byId(j).getName("en_us");

                    addBlock(ECBlockRegistry.CHAIR_BLOCKS.get(McWoods.byId(j)), name + " Chair");
                    addBlock(ECBlockRegistry.TERRACE_CHAIR_BLOCKS.get(McWoods.byId(j)), name + " Terrace Chair");
                    addBlock(ECBlockRegistry.TABLE_BLOCKS.get(McWoods.byId(j)), name + " Table");
                    addBlock(ECBlockRegistry.FANCY_TABLE_BLOCKS.get(McWoods.byId(j)), name + " Fancy Table");
                    addBlock(ECBlockRegistry.TERRACE_TABLE_BLOCKS.get(McWoods.byId(j)), name + " Terrace Table");
                    addBlock(ECBlockRegistry.FANCY_DOOR_BLOCKS.get(McWoods.byId(j)), name + " Fancy Door");
                    addBlock(ECBlockRegistry.SUSPENDED_STAIRS_BLOCKS.get(McWoods.byId(j)), name + " Suspended Stairs");
                    addBlock(ECBlockRegistry.WOODEN_CRATE_BLOCKS.get(McWoods.byId(j)), name + " Wooden Crate");
                }

                addBlock(ECBlockRegistry.STEEL_SUSPENDED_STAIRS, "Steel Suspended Stairs");
                addBlock(ECBlockRegistry.RUSTY_SUSPENDED_STAIRS, "Rusty Suspended Stairs");

                addBlock(ECBlockRegistry.STEEL_TERRACE_CHAIR, "Steel Terrace Chair");
                addBlock(ECBlockRegistry.STEEL_TERRACE_TABLE, "Steel Terrace Table");

                name = "";

                for(int j = 0; j < Arrays.stream(DyeColor.values()).count(); j++)
                {
                    String raw[] = DyeColor.byId(j).getName().split("_");
                    if(raw[0] == "light")
                        name = StringUtils.capitalise(raw[0]) + " " + StringUtils.capitalise(raw[1]);
                    else
                        name = StringUtils.capitalise(raw[0]);

                    addBlock(ECBlockRegistry.COUCH_BLOCKS.get(DyeColor.byId(j)), name + " Couch");
                    addBlock(ECBlockRegistry.TABLE_LAMP_BLOCKS.get(DyeColor.byId(j)), name + " Table Lamp");
                    addBlock(ECBlockRegistry.PILLOW_BLOCKS.get(DyeColor.byId(j)), name + " Pillow");
                }

                addBlock(ECBlockRegistry.PLATE, "Plate");

                addBlock(ECBlockRegistry.STEEL_DOOR, "Steel Door");
                addBlock(ECBlockRegistry.STURDY_STEEL_DOOR, "Sturdy Steel Door");
                addBlock(ECBlockRegistry.WARNING_STEEL_DOOR, "Warning Steel Door");
                addBlock(ECBlockRegistry.WHITE_STEEL_DOOR, "White Steel Door");
                addBlock(ECBlockRegistry.STURDY_WHITE_STEEL_DOOR, "Sturdy White Steel Door");
                addBlock(ECBlockRegistry.WARNING_WHITE_STEEL_DOOR, "Warning White Steel Door");
                addBlock(ECBlockRegistry.RUSTY_DOOR, "Rusty Door");
                addBlock(ECBlockRegistry.STURDY_RUSTY_DOOR, "Sturdy Rusty Door");
                addBlock(ECBlockRegistry.WARNING_RUSTY_DOOR, "Warning Rusty Door");

                add("embellishcraft.container.wooden_crate", "Wooden Crate");

                add("itemGroup.embellishcraft_group", "EmbellishCraft");
                break;
            case "fr_fr":
                for(int j = 0; j < Arrays.stream(RockType.values()).count(); j++)
                {
                    // Rocks
                    addBlock(ECBlockRegistry.ROCK_BLOCKS.get(RockType.byId(j)), StringUtils.capitalise(RockType.byId(j).getFrName()));
                    addBlock(ECBlockRegistry.ROCK_STAIRS.get(RockType.byId(j)), "Escalier en " + RockType.byId(j).getFrName());
                    addBlock(ECBlockRegistry.ROCK_SLABS.get(RockType.byId(j)), "Dalle en " + RockType.byId(j).getFrName());
                    addBlock(ECBlockRegistry.ROCK_WALLS.get(RockType.byId(j)), "Muret en " + RockType.byId(j).getFrName());
                    addBlock(ECBlockRegistry.ROCK_PRESSURE_PLATES.get(RockType.byId(j)), "Plaque de pression en " + RockType.byId(j).getFrName());
                    addBlock(ECBlockRegistry.ROCK_BUTTONS.get(RockType.byId(j)), "Bouton en " + RockType.byId(j).getFrName());

                    // Cobbletones
                    String de = "de ";
                    if(RockType.byId(j).getFrName() == "ardoise")
                        de = "d'";

                    addBlock(ECBlockRegistry.ROCK_COBBLESTONES.get(RockType.byId(j)), "Pierres " + de + RockType.byId(j).getFrName());
                    addBlock(ECBlockRegistry.ROCK_COBBLESTONE_STAIRS.get(RockType.byId(j)), "Escalier en pierres " + de + RockType.byId(j).getFrName());
                    addBlock(ECBlockRegistry.ROCK_COBBLESTONE_SLABS.get(RockType.byId(j)), "Dalle en pierres " + de + RockType.byId(j).getFrName());
                    addBlock(ECBlockRegistry.ROCK_COBBLESTONE_WALLS.get(RockType.byId(j)), "Muret en pierres " + de + RockType.byId(j).getFrName());
                    addBlock(ECBlockRegistry.ROCK_COBBLESTONE_PRESSURE_PLATES.get(RockType.byId(j)), "Plaque de pression en pierres " + de + RockType.byId(j).getFrName());

                    // Smooth rocks
                    addBlock(ECBlockRegistry.SMOOTH_ROCK_BLOCKS.get(RockType.byId(j)), StringUtils.capitalise(RockType.byId(j).getFrName()) + " lisse");
                    addBlock(ECBlockRegistry.SMOOTH_ROCK_STAIRS.get(RockType.byId(j)), "Escalier en " + RockType.byId(j).getFrName() + " lisse");
                    addBlock(ECBlockRegistry.SMOOTH_ROCK_SLABS.get(RockType.byId(j)), "Dalle en " + RockType.byId(j).getFrName() + " lisse");
                    addBlock(ECBlockRegistry.SMOOTH_ROCK_WALLS.get(RockType.byId(j)), "Muret en " + RockType.byId(j).getFrName() + " lisse");
                    addBlock(ECBlockRegistry.SMOOTH_ROCK_PRESSURE_PLATES.get(RockType.byId(j)), "Plaque de pression en " + RockType.byId(j).getFrName() + " lisse");

                    // Polished rocks
                    addBlock(ECBlockRegistry.POLISHED_ROCK_BLOCKS.get(RockType.byId(j)), StringUtils.capitalise(RockType.byId(j).getFrName()) + " poli");
                    addBlock(ECBlockRegistry.POLISHED_ROCK_STAIRS.get(RockType.byId(j)), "Escalier en " + RockType.byId(j).getFrName() + " poli");
                    addBlock(ECBlockRegistry.POLISHED_ROCK_SLABS.get(RockType.byId(j)), "Dalle en " + RockType.byId(j).getFrName() + " poli");
                    addBlock(ECBlockRegistry.POLISHED_ROCK_WALLS.get(RockType.byId(j)), "Muret en " + RockType.byId(j).getFrName() + " poli");
                    addBlock(ECBlockRegistry.POLISHED_ROCK_PRESSURE_PLATES.get(RockType.byId(j)), "Plaque de pression en " + RockType.byId(j).getFrName() + " poli");

                    // Rock pavings
                    addBlock(ECBlockRegistry.ROCK_PAVINGS.get(RockType.byId(j)), "Pavés " + de + RockType.byId(j).getFrName());
                    addBlock(ECBlockRegistry.ROCK_PAVING_STAIRS.get(RockType.byId(j)), "Escalier en pavé " + de + RockType.byId(j).getFrName());
                    addBlock(ECBlockRegistry.ROCK_PAVING_SLABS.get(RockType.byId(j)), "Dalle en pavé " + de + RockType.byId(j).getFrName());
                    addBlock(ECBlockRegistry.ROCK_PAVING_WALLS.get(RockType.byId(j)), "Muret en pavé " + de + RockType.byId(j).getFrName());
                    addBlock(ECBlockRegistry.ROCK_PAVING_PRESSURE_PLATES.get(RockType.byId(j)), "Plaque de pression en pavé " + de + RockType.byId(j).getFrName());

                    // Rock tiles
                    addBlock(ECBlockRegistry.ROCK_TILES.get(RockType.byId(j)), "Carrelage " + de + RockType.byId(j).getFrName());
                    addBlock(ECBlockRegistry.ROCK_TILES_STAIRS.get(RockType.byId(j)), "Escalier en carrelage " + de + RockType.byId(j).getFrName());
                    addBlock(ECBlockRegistry.ROCK_TILES_SLABS.get(RockType.byId(j)), "Dalle en carrelage " + de + RockType.byId(j).getFrName());
                    addBlock(ECBlockRegistry.ROCK_TILES_WALLS.get(RockType.byId(j)), "Muret en carrelage " + de + RockType.byId(j).getFrName());
                    addBlock(ECBlockRegistry.ROCK_TILES_PRESSURE_PLATES.get(RockType.byId(j)), "Plaque de pression en carrelage " + de + RockType.byId(j).getFrName());

                    // Rock bricks
                    addBlock(ECBlockRegistry.ROCK_BRICKS.get(RockType.byId(j)), "Briques " + de + RockType.byId(j).getFrName());
                    addBlock(ECBlockRegistry.ROCK_BRICKS_STAIRS.get(RockType.byId(j)), "Escalier en briques " + de + RockType.byId(j).getFrName());
                    addBlock(ECBlockRegistry.ROCK_BRICKS_SLABS.get(RockType.byId(j)), "Dalle en briques " + de + RockType.byId(j).getFrName());
                    addBlock(ECBlockRegistry.ROCK_BRICKS_WALLS.get(RockType.byId(j)), "Muret en briques " + de + RockType.byId(j).getFrName());
                    addBlock(ECBlockRegistry.ROCK_BRICKS_PRESSURE_PLATES.get(RockType.byId(j)), "Plaque de pression en briques " + de + RockType.byId(j).getFrName());

                    // Rock large bricks
                    addBlock(ECBlockRegistry.ROCK_LARGE_BRICKS.get(RockType.byId(j)), "Briques épaisses " + de + RockType.byId(j).getFrName());
                    addBlock(ECBlockRegistry.ROCK_LARGE_BRICKS_STAIRS.get(RockType.byId(j)), "Escalier en briques épaisses " + de + RockType.byId(j).getFrName());
                    addBlock(ECBlockRegistry.ROCK_LARGE_BRICKS_SLABS.get(RockType.byId(j)), "Dalle en briques épaisses " + de + RockType.byId(j).getFrName());
                    addBlock(ECBlockRegistry.ROCK_LARGE_BRICKS_WALLS.get(RockType.byId(j)), "Muret en briques épaisses " + de + RockType.byId(j).getFrName());
                    addBlock(ECBlockRegistry.ROCK_LARGE_BRICKS_PRESSURE_PLATES.get(RockType.byId(j)), "Plaque de pression en briques épaisses " + de + RockType.byId(j).getFrName());

                    // Rock ornaments
                    addBlock(ECBlockRegistry.ROCK_ORNAMENTS.get(RockType.byId(j)), "Ornement en " + RockType.byId(j).getFrName());
                    addBlock(ECBlockRegistry.ROCK_ORNAMENT_PRESSURE_PLATES.get(RockType.byId(j)), "Plaque de pression avec ornement en " + RockType.byId(j).getFrName());
                }

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

                addBlock(ECBlockRegistry.ANDESITE_ORNAMENT, "Ornement en andésite");
                addBlock(ECBlockRegistry.ANDESITE_ORNAMENT_PRESSURE_PLATE, "Plaque de pression avec ornement en andésite");

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

                addBlock(ECBlockRegistry.DIORITE_ORNAMENT, "Ornement en diorite");
                addBlock(ECBlockRegistry.DIORITE_ORNAMENT_PRESSURE_PLATE, "Plaque de pression avec ornement en diorite");

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

                addBlock(ECBlockRegistry.GRANITE_ORNAMENT, "Ornement en granite");
                addBlock(ECBlockRegistry.GRANITE_ORNAMENT_PRESSURE_PLATE, "Plaque de pression avec ornement en granite");

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

                // Other bricks
                addBlock(ECBlockRegistry.DARK_BRICKS, "Briques sombres");
                addBlock(ECBlockRegistry.DARK_BRICKS_SLAB, "Dalle en briques sombres");
                addBlock(ECBlockRegistry.DARK_BRICKS_STAIRS, "Escalier en briques sombres");
                addBlock(ECBlockRegistry.DARK_BRICKS_WALL, "Muret en briques sombres");
                addBlock(ECBlockRegistry.DARK_BRICKS_PRESSURE_PLATE, "Plaque de pression en briques sombres");

                addBlock(ECBlockRegistry.DARK_LARGE_BRICKS, "Briques épaisses sombres");
                addBlock(ECBlockRegistry.DARK_LARGE_BRICKS_SLAB, "Dalle en briques épaisses sombres");
                addBlock(ECBlockRegistry.DARK_LARGE_BRICKS_STAIRS, "Escalier en briques épaisses sombres");
                addBlock(ECBlockRegistry.DARK_LARGE_BRICKS_WALL, "Muret en briques épaisses sombres");
                addBlock(ECBlockRegistry.DARK_LARGE_BRICKS_PRESSURE_PLATE, "Plaque de pression en briques épaisses sombres");

                addBlock(ECBlockRegistry.OLD_BRICKS, "Vieilles briques");
                addBlock(ECBlockRegistry.OLD_BRICKS_SLAB, "Dalle en vieilles briques");
                addBlock(ECBlockRegistry.OLD_BRICKS_STAIRS, "Escalier en vieilles briques");
                addBlock(ECBlockRegistry.OLD_BRICKS_WALL, "Muret en vieilles briques");
                addBlock(ECBlockRegistry.OLD_BRICKS_PRESSURE_PLATE, "Plaque de pression en vieilles briques");

                addBlock(ECBlockRegistry.OLD_LARGE_BRICKS, "Vieilles briques épaisses");
                addBlock(ECBlockRegistry.OLD_LARGE_BRICKS_SLAB, "Dalle en vieilles briques épaisses");
                addBlock(ECBlockRegistry.OLD_LARGE_BRICKS_STAIRS, "Escalier en vieilles briques épaisses");
                addBlock(ECBlockRegistry.OLD_LARGE_BRICKS_WALL, "Muret en vieilles briques épaisses");
                addBlock(ECBlockRegistry.OLD_LARGE_BRICKS_PRESSURE_PLATE, "Plaque de pression en vieilles briques épaisses");

                addBlock(ECBlockRegistry.WEARED_BRICKS, "Briques usées");
                addBlock(ECBlockRegistry.WEARED_BRICKS_SLAB, "Dalle en briques usées");
                addBlock(ECBlockRegistry.WEARED_BRICKS_STAIRS, "Escalier en briques usées");
                addBlock(ECBlockRegistry.WEARED_BRICKS_WALL, "Muret en briques usées");
                addBlock(ECBlockRegistry.WEARED_BRICKS_PRESSURE_PLATE, "Plaque de pression en briques usées");

                addBlock(ECBlockRegistry.WEARED_LARGE_BRICKS, "Briques épaisses usées");
                addBlock(ECBlockRegistry.WEARED_LARGE_BRICKS_SLAB, "Dalle en briques épaisses usées");
                addBlock(ECBlockRegistry.WEARED_LARGE_BRICKS_STAIRS, "Escalier en briques épaisses usées");
                addBlock(ECBlockRegistry.WEARED_LARGE_BRICKS_WALL, "Muret en briques épaisses usées");
                addBlock(ECBlockRegistry.WEARED_LARGE_BRICKS_PRESSURE_PLATE, "Plaque de pression en briques épaisses usées");

                // Pavings
                addBlock(ECBlockRegistry.CONCRETE_PAVING, "Pavés en béton");
                addBlock(ECBlockRegistry.CONCRETE_PAVING_SLAB, "Dalle en pavés de béton");
                addBlock(ECBlockRegistry.CONCRETE_PAVING_STAIRS, "Escaliers en pavés de béton");
                addBlock(ECBlockRegistry.CONCRETE_PAVING_WALL, "Muret en pavés de béton");
                addBlock(ECBlockRegistry.CONCRETE_PAVING_PRESSURE_PLATE, "Plaque de pression en pavés de béton");

                addBlock(ECBlockRegistry.DAMAGED_PAVING, "Pavés abîmés");
                addBlock(ECBlockRegistry.DAMAGED_PAVING_SLAB, "Dalle en pavés abîmés");
                addBlock(ECBlockRegistry.DAMAGED_PAVING_STAIRS, "Escaliers en pavés abîmés");
                addBlock(ECBlockRegistry.DAMAGED_PAVING_WALL, "Muret en pavés abîmés");
                addBlock(ECBlockRegistry.DAMAGED_PAVING_PRESSURE_PLATE, "Plaque de pression en pavés abîmés");

                addBlock(ECBlockRegistry.DARK_CONCRETE_PAVING, "Pavés en béton sombre");
                addBlock(ECBlockRegistry.DARK_CONCRETE_PAVING_SLAB, "Dalle en pavés de béton sombre");
                addBlock(ECBlockRegistry.DARK_CONCRETE_PAVING_STAIRS, "Escalier eb pavés de béton sombre");
                addBlock(ECBlockRegistry.DARK_CONCRETE_PAVING_WALL, "Muret en pavés de béton sombre");
                addBlock(ECBlockRegistry.DARK_CONCRETE_PAVING_PRESSURE_PLATE, "Plaque de pression en pavés de béton sombre");

                addBlock(ECBlockRegistry.MOIST_PAVING, "Pavés moisis");
                addBlock(ECBlockRegistry.MOIST_PAVING_SLAB, "Dalle en pavés moisis");
                addBlock(ECBlockRegistry.MOIST_PAVING_STAIRS, "Escalier en pavés moisis");
                addBlock(ECBlockRegistry.MOIST_PAVING_WALL, "Muret en pavés moisis");
                addBlock(ECBlockRegistry.MOIST_PAVING_PRESSURE_PLATE, "Plaque de pression en pavés moisis");

                addBlock(ECBlockRegistry.POLISHED_PAVING, "Pavés polis");
                addBlock(ECBlockRegistry.POLISHED_PAVING_SLAB, "Dalle en pavés polis");
                addBlock(ECBlockRegistry.POLISHED_PAVING_STAIRS, "Escalier en pavés polis");
                addBlock(ECBlockRegistry.POLISHED_PAVING_WALL, "Muret en pavés polis");
                addBlock(ECBlockRegistry.POLISHED_PAVING_PRESSURE_PLATE, "Plaque de pression en pavés polis");

                addBlock(ECBlockRegistry.WHITE_CONCRETE_PAVING, "Pavés en béton clair");
                addBlock(ECBlockRegistry.WHITE_CONCRETE_PAVING_SLAB, "Dalle en pavés de béton clair");
                addBlock(ECBlockRegistry.WHITE_CONCRETE_PAVING_STAIRS, "Escaliers en pavés de béton clair");
                addBlock(ECBlockRegistry.WHITE_CONCRETE_PAVING_WALL, "Murets en pavés de béton clair");
                addBlock(ECBlockRegistry.WHITE_CONCRETE_PAVING_PRESSURE_PLATE, "Plaque de pression en pavés de béton clair");

                // Tiles
                addBlock(ECBlockRegistry.CONCRETE_TILES, "Carrelage en béton");
                addBlock(ECBlockRegistry.CONCRETE_TILES_SLAB, "Dalle de carrelage en béton");
                addBlock(ECBlockRegistry.CONCRETE_TILES_STAIRS, "Escaliers en carrelage de béton");
                addBlock(ECBlockRegistry.CONCRETE_TILES_WALL, "Muret en carrelage de béton");
                addBlock(ECBlockRegistry.CONCRETE_TILES_PRESSURE_PLATE, "Plaque de pression en carrelage de béton");

                addBlock(ECBlockRegistry.SKYBLUE_TILES, "Carrelage bleu ciel");
                addBlock(ECBlockRegistry.SKYBLUE_TILES_SLAB, "Dalle en carrelage bleu ciel");
                addBlock(ECBlockRegistry.SKYBLUE_TILES_STAIRS, "Escalier en carrelage bleu ciel");
                addBlock(ECBlockRegistry.SKYBLUE_TILES_WALL, "Muret en carrelage bleu ciel");
                addBlock(ECBlockRegistry.SKYBLUE_TILES_PRESSURE_PLATE, "Plaque de pression en carrelage bleu ciel");

                addBlock(ECBlockRegistry.ORANGE_TILES, "Carrelage orange");
                addBlock(ECBlockRegistry.ORANGE_TILES_SLAB, "Dalle en carrelage orange");
                addBlock(ECBlockRegistry.ORANGE_TILES_STAIRS, "Escalier en carrelage orange");
                addBlock(ECBlockRegistry.ORANGE_TILES_WALL, "Muret en carrelage orange");
                addBlock(ECBlockRegistry.ORANGE_TILES_PRESSURE_PLATE, "Plaque de pression en carrelage orange");

                addBlock(ECBlockRegistry.BLUE_TILES, "Carrelage bleu");
                addBlock(ECBlockRegistry.BLUE_TILES_SLAB, "Dalle en carrelage bleu");
                addBlock(ECBlockRegistry.BLUE_TILES_STAIRS, "Escalier en carrelage bleu");
                addBlock(ECBlockRegistry.BLUE_TILES_WALL, "Muret en carrelage bleu");
                addBlock(ECBlockRegistry.BLUE_TILES_PRESSURE_PLATE, "Plaque de pression en carrelage bleu");

                addBlock(ECBlockRegistry.LIGHT_BLUE_TILES, "Carrelage bleu clair");
                addBlock(ECBlockRegistry.LIGHT_BLUE_TILES_SLAB, "Dalle en carrelage bleu clair");
                addBlock(ECBlockRegistry.LIGHT_BLUE_TILES_STAIRS, "Escalier en carrelage bleu clair");
                addBlock(ECBlockRegistry.LIGHT_BLUE_TILES_WALL, "Muret en carrelage bleu clair");
                addBlock(ECBlockRegistry.LIGHT_BLUE_TILES_PRESSURE_PLATE, "Plaque de pression en carrelage bleu clair");

                addBlock(ECBlockRegistry.RED_TILES, "Carrelage rouge");
                addBlock(ECBlockRegistry.RED_TILES_SLAB, "Dalle en carrelage rouge");
                addBlock(ECBlockRegistry.RED_TILES_STAIRS, "Escalier en carrelage rouge");
                addBlock(ECBlockRegistry.RED_TILES_WALL, "Muret en carrelage rouge");
                addBlock(ECBlockRegistry.RED_TILES_PRESSURE_PLATE, "Plaque de pression en carrelage rouge");

                addBlock(ECBlockRegistry.WHITE_TILES, "Carrelage blanc");
                addBlock(ECBlockRegistry.WHITE_TILES_SLAB, "Dalle en carrelage blanc");
                addBlock(ECBlockRegistry.WHITE_TILES_STAIRS, "Escalier en carrelage blanc");
                addBlock(ECBlockRegistry.WHITE_TILES_WALL, "Muret en carrelage blanc");
                addBlock(ECBlockRegistry.WHITE_TILES_PRESSURE_PLATE, "Plaque de pression en carrelage blanc");

                addBlock(ECBlockRegistry.YELLOW_TILES, "Carrelage jaune");
                addBlock(ECBlockRegistry.YELLOW_TILES_SLAB, "Dalle en carrelage jaune");
                addBlock(ECBlockRegistry.YELLOW_TILES_STAIRS, "Escalier en carrelage jaune");
                addBlock(ECBlockRegistry.YELLOW_TILES_WALL, "Muret en carrelage jaune");
                addBlock(ECBlockRegistry.YELLOW_TILES_PRESSURE_PLATE, "Plaque de pression en carrelage jaune");

                addBlock(ECBlockRegistry.YELLOW_GREY_TILES, "Carrelage jaune-gris");
                addBlock(ECBlockRegistry.YELLOW_GREY_TILES_SLAB, "Dalle en carrelage jaune-gris");
                addBlock(ECBlockRegistry.YELLOW_GREY_TILES_STAIRS, "Escalier en carrelage jaune-gris");
                addBlock(ECBlockRegistry.YELLOW_GREY_TILES_WALL, "Muret en carrelage jaune-gris");
                addBlock(ECBlockRegistry.YELLOW_GREY_TILES_PRESSURE_PLATE, "Plaque de pression en carrelage jaune-gris");

                // Corrugated metal plates
                String frColors[] = {"blanche", "orange", "magenta", "bleu claire", "jaune", "vert claire", "rose", "grise", "gris claire", "cyan", "violette", "bleue", "marron", "verte", "rouge", "noire"};
                String frColorsM[] = {"blanc", "orange", "magenta", "bleu clair", "jaune", "vert clair", "rose", "gris", "gris clair", "cyan", "violet", "bleu", "marron", "vert", "rouge", "noir"};

                for(int j = 0; j < Arrays.stream(DyeColor.values()).count(); j++)
                {
                    addBlock(ECBlockRegistry.CORRUGATED_METAL_PLATE_BLOCKS.get(DyeColor.byId(j)), "Tôle ondulée " + frColors[j]);
                    addBlock(ECBlockRegistry.CORRUGATED_METAL_PLATE_SLABS.get(DyeColor.byId(j)), "Dalle en tôle ondulée " + frColors[j]);
                    addBlock(ECBlockRegistry.CORRUGATED_METAL_PLATE_STAIRS.get(DyeColor.byId(j)), "Escalier en tôle ondulée " + frColors[j]);
                    addBlock(ECBlockRegistry.CORRUGATED_METAL_PLATE_WALLS.get(DyeColor.byId(j)), "Muret en tôle ondulée " + frColors[j]);
                    addBlock(ECBlockRegistry.CORRUGATED_METAL_PLATE_PRESSURE_PLATES.get(DyeColor.byId(j)), "Plaque de pression en tôle ondulée " + frColors[j]);
                }

                // Metal blocks
                addBlock(ECBlockRegistry.DARK_METAL_FLOOR, "Sol en métal foncé");
                addBlock(ECBlockRegistry.DARK_METAL_FLOOR_SLAB, "Dalle en métal foncé");
                addBlock(ECBlockRegistry.DARK_METAL_FLOOR_STAIRS, "Escalier en métal foncé");
                addBlock(ECBlockRegistry.DARK_METAL_FLOOR_WALL, "Muret en métal foncé");
                addBlock(ECBlockRegistry.DARK_METAL_FLOOR_PRESSURE_PLATE, "Plaque de pression en métal foncé");

                addBlock(ECBlockRegistry.LIGHT_METAL_FLOOR, "Sol en métal clair");
                addBlock(ECBlockRegistry.LIGHT_METAL_FLOOR_SLAB, "Dalle en métal clair");
                addBlock(ECBlockRegistry.LIGHT_METAL_FLOOR_STAIRS, "Escalier en métal clair");
                addBlock(ECBlockRegistry.LIGHT_METAL_FLOOR_WALL, "Muret en métal clair");
                addBlock(ECBlockRegistry.LIGHT_METAL_FLOOR_PRESSURE_PLATE, "Plaque de pression en métal clair");

                addBlock(ECBlockRegistry.RUSTY_PLATE, "Plaque rouillée");
                addBlock(ECBlockRegistry.RUSTY_PLATE_SLAB, "Dalle en plaque rouillée");
                addBlock(ECBlockRegistry.RUSTY_PLATE_STAIRS, "Escalier en plaque rouillée");
                addBlock(ECBlockRegistry.RUSTY_PLATE_WALL, "Muret en plaque rouillée");
                addBlock(ECBlockRegistry.RUSTY_PLATE_PRESSURE_PLATE, "Plaque de pression en plaque rouillée");

                addBlock(ECBlockRegistry.IRON_BEAM, "Poutrelle en fer");
                addBlock(ECBlockRegistry.BOLTED_IRON_BEAM, "Poutrelle rivetée en fer");
                addBlock(ECBlockRegistry.IRON_BEAM_JUNCTION, "Jonction de poutrelle en fer");
                addBlock(ECBlockRegistry.STEEL_BEAM, "Poutrelle en acier");
                addBlock(ECBlockRegistry.BOLTED_STEEL_BEAM, "Poutrelle rivetée en acier");
                addBlock(ECBlockRegistry.STEEL_BEAM_JUNCTION, "Jonction de poutrelle en acier");

                addBlock(ECBlockRegistry.AIR_DUCT, "Conduit d'aération");
                addBlock(ECBlockRegistry.VENT_AIR_DUCT, "Conduit d'aération avec ventilation");
                addBlock(ECBlockRegistry.GRID_AIR_DUCT, "Conduit d'aération avec grille");

                addBlock(ECBlockRegistry.BULKHEAD, "Batardeau");
                addBlock(ECBlockRegistry.BULKHEAD_TOP, "Sommet de batardeau");

                addBlock(ECBlockRegistry.STEEL_WALL_LADDER, "Échelle murale en acier");
                addBlock(ECBlockRegistry.RUSTY_WALL_LADDER, "Échelle murale rouillée");
                addBlock(ECBlockRegistry.STEEL_RUNGS, "Échelons en acier");
                addBlock(ECBlockRegistry.RUSTY_RUNGS, "Échelons rouillés");

                // Wallpapers
                addBlock(ECBlockRegistry.WHITE_BLUE_WALLPAPER, "Papier peint bleu et blanc");
                addBlock(ECBlockRegistry.WHITE_BLUE_WALLPAPER_SLAB, "Dalle de papier peint bleu et blanc");
                addBlock(ECBlockRegistry.WHITE_BLUE_WALLPAPER_STAIRS, "Escalier de papier peint bleu et blanc");
                addBlock(ECBlockRegistry.WHITE_BLUE_WALLPAPER_PLINTH, "Papier peint bleu et blanc avec plinthe");

                addBlock(ECBlockRegistry.BEIGE_FLOWER_WALLPAPER, "Papier peint beige avec motif fleur");
                addBlock(ECBlockRegistry.BEIGE_FLOWER_WALLPAPER_SLAB, "Dalle de papier peint beige avec motif fleur");
                addBlock(ECBlockRegistry.BEIGE_FLOWER_WALLPAPER_STAIRS, "Escalier de papier peint beige avec motif fleur");
                addBlock(ECBlockRegistry.BEIGE_FLOWER_WALLPAPER_PLINTH, "Papier peint beige avec motif fleur avec plinthe");

                addBlock(ECBlockRegistry.BEIGE_WALLPAPER, "Papier peint beige");
                addBlock(ECBlockRegistry.BEIGE_WALLPAPER_SLAB, "Dalle de papier peint beige");
                addBlock(ECBlockRegistry.BEIGE_WALLPAPER_STAIRS, "Escalier de papier peint beige");
                addBlock(ECBlockRegistry.BEIGE_WALLPAPER_PLINTH, "Papier peint beige avec plinthe");

                addBlock(ECBlockRegistry.PINK_WALLPAPER, "Papier peint rose");
                addBlock(ECBlockRegistry.PINK_WALLPAPER_SLAB, "Dalle de papier peint rose");
                addBlock(ECBlockRegistry.PINK_WALLPAPER_STAIRS, "Escalier de papier peint rose");
                addBlock(ECBlockRegistry.PINK_WALLPAPER_PLINTH, "Papier peint rose avec plinthe");

                addBlock(ECBlockRegistry.WHITE_GREEN_WALLPAPER, "Papier peint bleu et vert");
                addBlock(ECBlockRegistry.WHITE_GREEN_WALLPAPER_SLAB, "Dalle de papier peint bleu et vert");
                addBlock(ECBlockRegistry.WHITE_GREEN_WALLPAPER_STAIRS, "Escalier de papier peint bleu et vert");
                addBlock(ECBlockRegistry.WHITE_GREEN_WALLPAPER_PLINTH, "Papier peint bleu et vert avec plinthe");

                // Furniture
                for(int j = 0; j < Arrays.stream(McWoods.values()).count(); j++)
                {
                    name = McWoods.byId(j).getName("fr_fr");

                    addBlock(ECBlockRegistry.CHAIR_BLOCKS.get(McWoods.byId(j)), "Chaise en " + name);
                    addBlock(ECBlockRegistry.TERRACE_CHAIR_BLOCKS.get(McWoods.byId(j)), "Chaise de terrasse en " + name);
                    addBlock(ECBlockRegistry.TABLE_BLOCKS.get(McWoods.byId(j)), "Table en " + name);
                    addBlock(ECBlockRegistry.FANCY_TABLE_BLOCKS.get(McWoods.byId(j)), "Table massive en " + name);
                    addBlock(ECBlockRegistry.TERRACE_TABLE_BLOCKS.get(McWoods.byId(j)), "Table de terrase en " + name);
                    addBlock(ECBlockRegistry.FANCY_DOOR_BLOCKS.get(McWoods.byId(j)), "Porte massive en " + name);
                    addBlock(ECBlockRegistry.SUSPENDED_STAIRS_BLOCKS.get(McWoods.byId(j)), "Escaliers suspendus en " + name);
                    addBlock(ECBlockRegistry.WOODEN_CRATE_BLOCKS.get(McWoods.byId(j)), "Caisse en " + name);
                }

                addBlock(ECBlockRegistry.STEEL_SUSPENDED_STAIRS, "Escaliers suspendus en acier");
                addBlock(ECBlockRegistry.RUSTY_SUSPENDED_STAIRS, "Escaliers suspendus rouillés");

                addBlock(ECBlockRegistry.STEEL_TERRACE_CHAIR, "Chaise de terrasse en acier");
                addBlock(ECBlockRegistry.STEEL_TERRACE_TABLE, "Table de terrasse en acier");

                for(int j = 0; j < Arrays.stream(DyeColor.values()).count(); j++)
                {
                    addBlock(ECBlockRegistry.COUCH_BLOCKS.get(DyeColor.byId(j)), "Canapé " + frColorsM[j]);
                    addBlock(ECBlockRegistry.TABLE_LAMP_BLOCKS.get(DyeColor.byId(j)), "Lampe de chevet " + frColors[j]);
                    addBlock(ECBlockRegistry.PILLOW_BLOCKS.get(DyeColor.byId(j)), "Coussin " + frColorsM[j]);
                }

                addBlock(ECBlockRegistry.PLATE, "Assiette");

                addBlock(ECBlockRegistry.STEEL_DOOR, "Porte en acier");
                addBlock(ECBlockRegistry.STURDY_STEEL_DOOR, "Porte renforcée en acier");
                addBlock(ECBlockRegistry.WARNING_STEEL_DOOR, "Porte en acier avec avertissement");
                addBlock(ECBlockRegistry.WHITE_STEEL_DOOR, "Porte blanche en acier");
                addBlock(ECBlockRegistry.STURDY_WHITE_STEEL_DOOR, "Porte renforcée blanche en acier");
                addBlock(ECBlockRegistry.WARNING_WHITE_STEEL_DOOR, "Porte blanche en acier avec avertissement");
                addBlock(ECBlockRegistry.RUSTY_DOOR, "Porte rouillée");
                addBlock(ECBlockRegistry.STURDY_RUSTY_DOOR, "Porte renforcée rouillée");
                addBlock(ECBlockRegistry.WARNING_RUSTY_DOOR, "Porte renforcée rouillée avec avertissement");

                add("embellishcraft.container.wooden_crate", "Caisse en bois");

                add("itemGroup.embellishcraft_group", "EmbellishCraft");
                break;
        }
    }
}