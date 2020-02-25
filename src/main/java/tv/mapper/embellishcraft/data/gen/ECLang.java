package tv.mapper.embellishcraft.data.gen;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;
import tv.mapper.embellishcraft.block.ECBlockRegistry;

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
        switch(lang)
        {
            default:
            case "en_us":
                // Basalt
                addBlock(ECBlockRegistry.BASALT, "Basalt");
                addBlock(ECBlockRegistry.BASALT_SLAB, "Basalt Slab");
                addBlock(ECBlockRegistry.BASALT_STAIRS, "Basalt Stairs");
                addBlock(ECBlockRegistry.BASALT_WALL, "Basalt Wall");
                addBlock(ECBlockRegistry.BASALT_PRESSURE_PLATE, "Basalt Pressure Plate");
                addBlock(ECBlockRegistry.BASALT_BUTTON, "Basalt Button");

                addBlock(ECBlockRegistry.BASALT_COBBLESTONE, "Basalt Cobblestone");
                addBlock(ECBlockRegistry.BASALT_COBBLESTONE_SLAB, "Basalt Cobblestone Slab");
                addBlock(ECBlockRegistry.BASALT_COBBLESTONE_STAIRS, "Basalt Cobblestone Stairs");
                addBlock(ECBlockRegistry.BASALT_COBBLESTONE_WALL, "Basalt Cobblestone Wall");
                addBlock(ECBlockRegistry.BASALT_COBBLESTONE_PRESSURE_PLATE, "Basalt Cobblestone Pressure Plate");

                addBlock(ECBlockRegistry.SMOOTH_BASALT, "Smooth Basalt");
                addBlock(ECBlockRegistry.SMOOTH_BASALT_SLAB, "Smooth Basalt Slab");
                addBlock(ECBlockRegistry.SMOOTH_BASALT_STAIRS, "Smooth Basalt Stairs");
                addBlock(ECBlockRegistry.SMOOTH_BASALT_WALL, "Smooth Basalt Wall");
                addBlock(ECBlockRegistry.SMOOTH_BASALT_PRESSURE_PLATE, "Smooth Basalt Pressure Plate");

                addBlock(ECBlockRegistry.POLISHED_BASALT, "Polished Basalt");
                addBlock(ECBlockRegistry.POLISHED_BASALT_SLAB, "Polished Basalt Slab");
                addBlock(ECBlockRegistry.POLISHED_BASALT_STAIRS, "Polished Basalt Stairs");
                addBlock(ECBlockRegistry.POLISHED_BASALT_WALL, "Polished Basalt Wall");
                addBlock(ECBlockRegistry.POLISHED_BASALT_PRESSURE_PLATE, "Polished Basalt Pressure Plate");

                addBlock(ECBlockRegistry.BASALT_PAVING, "Basalt Paving");
                addBlock(ECBlockRegistry.BASALT_PAVING_SLAB, "Basalt Paving Slab");
                addBlock(ECBlockRegistry.BASALT_PAVING_STAIRS, "Basalt Paving Stairs");
                addBlock(ECBlockRegistry.BASALT_PAVING_WALL, "Basalt Paving Wall");
                addBlock(ECBlockRegistry.BASALT_PAVING_PRESSURE_PLATE, "Basalt Paving Pressure Plate");

                addBlock(ECBlockRegistry.BASALT_TILES, "Basalt Tiles");
                addBlock(ECBlockRegistry.BASALT_TILES_SLAB, "Basalt Tiles Slab");
                addBlock(ECBlockRegistry.BASALT_TILES_STAIRS, "Basalt Tiles Stairs");
                addBlock(ECBlockRegistry.BASALT_TILES_WALL, "Basalt Tiles Wall");
                addBlock(ECBlockRegistry.BASALT_TILES_PRESSURE_PLATE, "Basalt Tiles Pressure Plate");

                addBlock(ECBlockRegistry.BASALT_BRICKS, "Basalt Bricks");
                addBlock(ECBlockRegistry.BASALT_BRICKS_SLAB, "Basalt Bricks Slab");
                addBlock(ECBlockRegistry.BASALT_BRICKS_STAIRS, "Basalt Bricks Stairs");
                addBlock(ECBlockRegistry.BASALT_BRICKS_WALL, "Basalt Bricks Wall");
                addBlock(ECBlockRegistry.BASALT_BRICKS_PRESSURE_PLATE, "Basalt Bricks Pressure Plate");

                addBlock(ECBlockRegistry.BASALT_LARGE_BRICKS, "Basalt Large Bricks");
                addBlock(ECBlockRegistry.BASALT_LARGE_BRICKS_SLAB, "Basalt Large Bricks Slab");
                addBlock(ECBlockRegistry.BASALT_LARGE_BRICKS_STAIRS, "Basalt Large Bricks Stairs");
                addBlock(ECBlockRegistry.BASALT_LARGE_BRICKS_WALL, "Basalt Large Bricks Wall");
                addBlock(ECBlockRegistry.BASALT_LARGE_BRICKS_PRESSURE_PLATE, "Basalt Large Bricks Pressure Plate");

                addBlock(ECBlockRegistry.BASALT_ORNAMENT, "Basalt Ornament");
                addBlock(ECBlockRegistry.BASALT_ORNAMENT_PRESSURE_PLATE, "Basalt Ornament Pressure Plate");

                // Slate
                addBlock(ECBlockRegistry.SLATE, "Slate");
                addBlock(ECBlockRegistry.SLATE_SLAB, "Slate Slab");
                addBlock(ECBlockRegistry.SLATE_STAIRS, "Slate Stairs");
                addBlock(ECBlockRegistry.SLATE_WALL, "Slate Wall");
                addBlock(ECBlockRegistry.SLATE_PRESSURE_PLATE, "Slate Pressure Plate");
                addBlock(ECBlockRegistry.SLATE_BUTTON, "Slate Button");

                addBlock(ECBlockRegistry.SLATE_COBBLESTONE, "Slate Cobblestone");
                addBlock(ECBlockRegistry.SLATE_COBBLESTONE_SLAB, "Slate Cobblestone Slab");
                addBlock(ECBlockRegistry.SLATE_COBBLESTONE_STAIRS, "Slate Cobblestone Stairs");
                addBlock(ECBlockRegistry.SLATE_COBBLESTONE_WALL, "Slate Cobblestone Wall");
                addBlock(ECBlockRegistry.SLATE_COBBLESTONE_PRESSURE_PLATE, "Slate Cobblestone Pressure Plate");

                addBlock(ECBlockRegistry.SMOOTH_SLATE, "Smooth Slate");
                addBlock(ECBlockRegistry.SMOOTH_SLATE_SLAB, "Smooth Slate Slab");
                addBlock(ECBlockRegistry.SMOOTH_SLATE_STAIRS, "Smooth Slate Stairs");
                addBlock(ECBlockRegistry.SMOOTH_SLATE_WALL, "Smooth Slate Wall");
                addBlock(ECBlockRegistry.SMOOTH_SLATE_PRESSURE_PLATE, "Smooth Slate Pressure Plate");

                addBlock(ECBlockRegistry.POLISHED_SLATE, "Polished Slate");
                addBlock(ECBlockRegistry.POLISHED_SLATE_SLAB, "Polished Slate Slab");
                addBlock(ECBlockRegistry.POLISHED_SLATE_STAIRS, "Polished Slate Stairs");
                addBlock(ECBlockRegistry.POLISHED_SLATE_WALL, "Polished Slate Wall");
                addBlock(ECBlockRegistry.POLISHED_SLATE_PRESSURE_PLATE, "Polished Slate Pressure Plate");

                addBlock(ECBlockRegistry.SLATE_PAVING, "Slate Paving");
                addBlock(ECBlockRegistry.SLATE_PAVING_SLAB, "Slate Paving Slab");
                addBlock(ECBlockRegistry.SLATE_PAVING_STAIRS, "Slate Paving Stairs");
                addBlock(ECBlockRegistry.SLATE_PAVING_WALL, "Slate Paving Wall");
                addBlock(ECBlockRegistry.SLATE_PAVING_PRESSURE_PLATE, "Slate Paving Pressure Plate");

                addBlock(ECBlockRegistry.SLATE_TILES, "Slate Tiles");
                addBlock(ECBlockRegistry.SLATE_TILES_SLAB, "Slate Tiles Slab");
                addBlock(ECBlockRegistry.SLATE_TILES_STAIRS, "Slate Tiles Stairs");
                addBlock(ECBlockRegistry.SLATE_TILES_WALL, "Slate Tiles Wall");
                addBlock(ECBlockRegistry.SLATE_TILES_PRESSURE_PLATE, "Slate Tiles Pressure Plate");

                addBlock(ECBlockRegistry.SLATE_BRICKS, "Slate Bricks");
                addBlock(ECBlockRegistry.SLATE_BRICKS_SLAB, "Slate Bricks Slab");
                addBlock(ECBlockRegistry.SLATE_BRICKS_STAIRS, "Slate Bricks Stairs");
                addBlock(ECBlockRegistry.SLATE_BRICKS_WALL, "Slate Bricks Wall");
                addBlock(ECBlockRegistry.SLATE_BRICKS_PRESSURE_PLATE, "Slate Bricks Pressure Plate");

                addBlock(ECBlockRegistry.SLATE_LARGE_BRICKS, "Slate Large Bricks");
                addBlock(ECBlockRegistry.SLATE_LARGE_BRICKS_SLAB, "Slate Large Bricks Slab");
                addBlock(ECBlockRegistry.SLATE_LARGE_BRICKS_STAIRS, "Slate Large Bricks Stairs");
                addBlock(ECBlockRegistry.SLATE_LARGE_BRICKS_WALL, "Slate Large Bricks Wall");
                addBlock(ECBlockRegistry.SLATE_LARGE_BRICKS_PRESSURE_PLATE, "Slate Large Bricks Pressure Plate");

                addBlock(ECBlockRegistry.SLATE_ORNAMENT, "Slate Ornament");
                addBlock(ECBlockRegistry.SLATE_ORNAMENT_PRESSURE_PLATE, "Slate Ornament Pressure Plate");

                // Marble
                addBlock(ECBlockRegistry.MARBLE, "Marble");
                addBlock(ECBlockRegistry.MARBLE_SLAB, "Marble Slab");
                addBlock(ECBlockRegistry.MARBLE_STAIRS, "Marble Stairs");
                addBlock(ECBlockRegistry.MARBLE_WALL, "Marble Wall");
                addBlock(ECBlockRegistry.MARBLE_PRESSURE_PLATE, "Marble Pressure Plate");
                addBlock(ECBlockRegistry.MARBLE_BUTTON, "Marble Button");

                addBlock(ECBlockRegistry.MARBLE_COBBLESTONE, "Marble Cobblestone");
                addBlock(ECBlockRegistry.MARBLE_COBBLESTONE_SLAB, "Marble Cobblestone Slab");
                addBlock(ECBlockRegistry.MARBLE_COBBLESTONE_STAIRS, "Marble Cobblestone Stairs");
                addBlock(ECBlockRegistry.MARBLE_COBBLESTONE_WALL, "Marble Cobblestone Wall");
                addBlock(ECBlockRegistry.MARBLE_COBBLESTONE_PRESSURE_PLATE, "Marble Cobblestone Pressure Plate");

                addBlock(ECBlockRegistry.SMOOTH_MARBLE, "Smooth Marble");
                addBlock(ECBlockRegistry.SMOOTH_MARBLE_SLAB, "Smooth Marble Slab");
                addBlock(ECBlockRegistry.SMOOTH_MARBLE_STAIRS, "Smooth Marble Stairs");
                addBlock(ECBlockRegistry.SMOOTH_MARBLE_WALL, "Smooth Marble Wall");
                addBlock(ECBlockRegistry.SMOOTH_MARBLE_PRESSURE_PLATE, "Smooth Marble Pressure Plate");

                addBlock(ECBlockRegistry.POLISHED_MARBLE, "Polished Marble");
                addBlock(ECBlockRegistry.POLISHED_MARBLE_SLAB, "Polished Marble Slab");
                addBlock(ECBlockRegistry.POLISHED_MARBLE_STAIRS, "Polished Marble Stairs");
                addBlock(ECBlockRegistry.POLISHED_MARBLE_WALL, "Polished Marble Wall");
                addBlock(ECBlockRegistry.POLISHED_MARBLE_PRESSURE_PLATE, "Polished Marble Pressure Plate");

                addBlock(ECBlockRegistry.MARBLE_PAVING, "Marble Paving");
                addBlock(ECBlockRegistry.MARBLE_PAVING_SLAB, "Marble Paving Slab");
                addBlock(ECBlockRegistry.MARBLE_PAVING_STAIRS, "Marble Paving Stairs");
                addBlock(ECBlockRegistry.MARBLE_PAVING_WALL, "Marble Paving Wall");
                addBlock(ECBlockRegistry.MARBLE_PAVING_PRESSURE_PLATE, "Marble Paving Pressure Plate");

                addBlock(ECBlockRegistry.MARBLE_TILES, "Marble Tiles");
                addBlock(ECBlockRegistry.MARBLE_TILES_SLAB, "Marble Tiles Slab");
                addBlock(ECBlockRegistry.MARBLE_TILES_STAIRS, "Marble Tiles Stairs");
                addBlock(ECBlockRegistry.MARBLE_TILES_WALL, "Marble Tiles Wall");
                addBlock(ECBlockRegistry.MARBLE_TILES_PRESSURE_PLATE, "Marble Tiles Pressure Plate");

                addBlock(ECBlockRegistry.MARBLE_BRICKS, "Marble Bricks");
                addBlock(ECBlockRegistry.MARBLE_BRICKS_SLAB, "Marble Bricks Slab");
                addBlock(ECBlockRegistry.MARBLE_BRICKS_STAIRS, "Marble Bricks Stairs");
                addBlock(ECBlockRegistry.MARBLE_BRICKS_WALL, "Marble Bricks Wall");
                addBlock(ECBlockRegistry.MARBLE_BRICKS_PRESSURE_PLATE, "Marble Bricks Pressure Plate");

                addBlock(ECBlockRegistry.MARBLE_LARGE_BRICKS, "Marble Large Bricks");
                addBlock(ECBlockRegistry.MARBLE_LARGE_BRICKS_SLAB, "Marble Large Bricks Slab");
                addBlock(ECBlockRegistry.MARBLE_LARGE_BRICKS_STAIRS, "Marble Large Bricks Stairs");
                addBlock(ECBlockRegistry.MARBLE_LARGE_BRICKS_WALL, "Marble Large Bricks Wall");
                addBlock(ECBlockRegistry.MARBLE_LARGE_BRICKS_PRESSURE_PLATE, "Marble Large Bricks Pressure Plate");

                addBlock(ECBlockRegistry.MARBLE_ORNAMENT, "Marble Ornament");
                addBlock(ECBlockRegistry.MARBLE_ORNAMENT_PRESSURE_PLATE, "Marble Ornament Pressure Plate");

                // Gneiss
                addBlock(ECBlockRegistry.GNEISS, "Gneiss");
                addBlock(ECBlockRegistry.GNEISS_SLAB, "Gneiss Slab");
                addBlock(ECBlockRegistry.GNEISS_STAIRS, "Gneiss Stairs");
                addBlock(ECBlockRegistry.GNEISS_WALL, "Gneiss Wall");
                addBlock(ECBlockRegistry.GNEISS_PRESSURE_PLATE, "Gneiss Pressure Plate");
                addBlock(ECBlockRegistry.GNEISS_BUTTON, "Gneiss Button");

                addBlock(ECBlockRegistry.GNEISS_COBBLESTONE, "Gneiss Cobblestone");
                addBlock(ECBlockRegistry.GNEISS_COBBLESTONE_SLAB, "Gneiss Cobblestone Slab");
                addBlock(ECBlockRegistry.GNEISS_COBBLESTONE_STAIRS, "Gneiss Cobblestone Stairs");
                addBlock(ECBlockRegistry.GNEISS_COBBLESTONE_WALL, "Gneiss Cobblestone Wall");
                addBlock(ECBlockRegistry.GNEISS_COBBLESTONE_PRESSURE_PLATE, "Gneiss Cobblestone Pressure Plate");

                addBlock(ECBlockRegistry.SMOOTH_GNEISS, "Smooth Gneiss");
                addBlock(ECBlockRegistry.SMOOTH_GNEISS_SLAB, "Smooth Gneiss Slab");
                addBlock(ECBlockRegistry.SMOOTH_GNEISS_STAIRS, "Smooth Gneiss Stairs");
                addBlock(ECBlockRegistry.SMOOTH_GNEISS_WALL, "Smooth Gneiss Wall");
                addBlock(ECBlockRegistry.SMOOTH_GNEISS_PRESSURE_PLATE, "Smooth Gneiss Pressure Plate");

                addBlock(ECBlockRegistry.POLISHED_GNEISS, "Polished Gneiss");
                addBlock(ECBlockRegistry.POLISHED_GNEISS_SLAB, "Polished Gneiss Slab");
                addBlock(ECBlockRegistry.POLISHED_GNEISS_STAIRS, "Polished Gneiss Stairs");
                addBlock(ECBlockRegistry.POLISHED_GNEISS_WALL, "Polished Gneiss Wall");
                addBlock(ECBlockRegistry.POLISHED_GNEISS_PRESSURE_PLATE, "Polished Gneiss Pressure Plate");

                addBlock(ECBlockRegistry.GNEISS_PAVING, "Gneiss Paving");
                addBlock(ECBlockRegistry.GNEISS_PAVING_SLAB, "Gneiss Paving Slab");
                addBlock(ECBlockRegistry.GNEISS_PAVING_STAIRS, "Gneiss Paving Stairs");
                addBlock(ECBlockRegistry.GNEISS_PAVING_WALL, "Gneiss Paving Wall");
                addBlock(ECBlockRegistry.GNEISS_PAVING_PRESSURE_PLATE, "Gneiss Paving Pressure Plate");

                addBlock(ECBlockRegistry.GNEISS_TILES, "Gneiss Tiles");
                addBlock(ECBlockRegistry.GNEISS_TILES_SLAB, "Gneiss Tiles Slab");
                addBlock(ECBlockRegistry.GNEISS_TILES_STAIRS, "Gneiss Tiles Stairs");
                addBlock(ECBlockRegistry.GNEISS_TILES_WALL, "Gneiss Tiles Wall");
                addBlock(ECBlockRegistry.GNEISS_TILES_PRESSURE_PLATE, "Gneiss Tiles Pressure Plate");

                addBlock(ECBlockRegistry.GNEISS_BRICKS, "Gneiss Bricks");
                addBlock(ECBlockRegistry.GNEISS_BRICKS_SLAB, "Gneiss Bricks Slab");
                addBlock(ECBlockRegistry.GNEISS_BRICKS_STAIRS, "Gneiss Bricks Stairs");
                addBlock(ECBlockRegistry.GNEISS_BRICKS_WALL, "Gneiss Bricks Wall");
                addBlock(ECBlockRegistry.GNEISS_BRICKS_PRESSURE_PLATE, "Gneiss Bricks Pressure Plate");

                addBlock(ECBlockRegistry.GNEISS_LARGE_BRICKS, "Gneiss Large Bricks");
                addBlock(ECBlockRegistry.GNEISS_LARGE_BRICKS_SLAB, "Gneiss Large Bricks Slab");
                addBlock(ECBlockRegistry.GNEISS_LARGE_BRICKS_STAIRS, "Gneiss Large Bricks Stairs");
                addBlock(ECBlockRegistry.GNEISS_LARGE_BRICKS_WALL, "Gneiss Large Bricks Wall");
                addBlock(ECBlockRegistry.GNEISS_LARGE_BRICKS_PRESSURE_PLATE, "Gneiss Large Bricks Pressure Plate");

                addBlock(ECBlockRegistry.GNEISS_ORNAMENT, "Gneiss Ornament");
                addBlock(ECBlockRegistry.GNEISS_ORNAMENT_PRESSURE_PLATE, "Gneiss Ornament Pressure Plate");

                // Jade
                addBlock(ECBlockRegistry.JADE, "Jade");
                addBlock(ECBlockRegistry.JADE_SLAB, "Jade Slab");
                addBlock(ECBlockRegistry.JADE_STAIRS, "Jade Stairs");
                addBlock(ECBlockRegistry.JADE_WALL, "Jade Wall");
                addBlock(ECBlockRegistry.JADE_PRESSURE_PLATE, "Jade Pressure Plate");
                addBlock(ECBlockRegistry.JADE_BUTTON, "Jade Button");

                addBlock(ECBlockRegistry.JADE_COBBLESTONE, "Jade Cobblestone");
                addBlock(ECBlockRegistry.JADE_COBBLESTONE_SLAB, "Jade Cobblestone Slab");
                addBlock(ECBlockRegistry.JADE_COBBLESTONE_STAIRS, "Jade Cobblestone Stairs");
                addBlock(ECBlockRegistry.JADE_COBBLESTONE_WALL, "Jade Cobblestone Wall");
                addBlock(ECBlockRegistry.JADE_COBBLESTONE_PRESSURE_PLATE, "Jade Cobblestone Pressure Plate");

                addBlock(ECBlockRegistry.SMOOTH_JADE, "Smooth Jade");
                addBlock(ECBlockRegistry.SMOOTH_JADE_SLAB, "Smooth Jade Slab");
                addBlock(ECBlockRegistry.SMOOTH_JADE_STAIRS, "Smooth Jade Stairs");
                addBlock(ECBlockRegistry.SMOOTH_JADE_WALL, "Smooth Jade Wall");
                addBlock(ECBlockRegistry.SMOOTH_JADE_PRESSURE_PLATE, "Smooth Jade Pressure Plate");

                addBlock(ECBlockRegistry.POLISHED_JADE, "Polished Jade");
                addBlock(ECBlockRegistry.POLISHED_JADE_SLAB, "Polished Jade Slab");
                addBlock(ECBlockRegistry.POLISHED_JADE_STAIRS, "Polished Jade Stairs");
                addBlock(ECBlockRegistry.POLISHED_JADE_WALL, "Polished Jade Wall");
                addBlock(ECBlockRegistry.POLISHED_JADE_PRESSURE_PLATE, "Polished Jade Pressure Plate");

                addBlock(ECBlockRegistry.JADE_PAVING, "Jade Paving");
                addBlock(ECBlockRegistry.JADE_PAVING_SLAB, "Jade Paving Slab");
                addBlock(ECBlockRegistry.JADE_PAVING_STAIRS, "Jade Paving Stairs");
                addBlock(ECBlockRegistry.JADE_PAVING_WALL, "Jade Paving Wall");
                addBlock(ECBlockRegistry.JADE_PAVING_PRESSURE_PLATE, "Jade Paving Pressure Plate");

                addBlock(ECBlockRegistry.JADE_TILES, "Jade Tiles");
                addBlock(ECBlockRegistry.JADE_TILES_SLAB, "Jade Tiles Slab");
                addBlock(ECBlockRegistry.JADE_TILES_STAIRS, "Jade Tiles Stairs");
                addBlock(ECBlockRegistry.JADE_TILES_WALL, "Jade Tiles Wall");
                addBlock(ECBlockRegistry.JADE_TILES_PRESSURE_PLATE, "Jade Tiles Pressure Plate");

                addBlock(ECBlockRegistry.JADE_BRICKS, "Jade Bricks");
                addBlock(ECBlockRegistry.JADE_BRICKS_SLAB, "Jade Bricks Slab");
                addBlock(ECBlockRegistry.JADE_BRICKS_STAIRS, "Jade Bricks Stairs");
                addBlock(ECBlockRegistry.JADE_BRICKS_WALL, "Jade Bricks Wall");
                addBlock(ECBlockRegistry.JADE_BRICKS_PRESSURE_PLATE, "Jade Bricks Pressure Plate");

                addBlock(ECBlockRegistry.JADE_LARGE_BRICKS, "Jade Large Bricks");
                addBlock(ECBlockRegistry.JADE_LARGE_BRICKS_SLAB, "Jade Large Bricks Slab");
                addBlock(ECBlockRegistry.JADE_LARGE_BRICKS_STAIRS, "Jade Large Bricks Stairs");
                addBlock(ECBlockRegistry.JADE_LARGE_BRICKS_WALL, "Jade Large Bricks Wall");
                addBlock(ECBlockRegistry.JADE_LARGE_BRICKS_PRESSURE_PLATE, "Jade Large Bricks Pressure Plate");

                addBlock(ECBlockRegistry.JADE_ORNAMENT, "Jade Ornament");
                addBlock(ECBlockRegistry.JADE_ORNAMENT_PRESSURE_PLATE, "Jade Ornament Pressure Plate");

                // Larvikite
                addBlock(ECBlockRegistry.LARVIKITE, "Larvikite");
                addBlock(ECBlockRegistry.LARVIKITE_SLAB, "Larvikite Slab");
                addBlock(ECBlockRegistry.LARVIKITE_STAIRS, "Larvikite Stairs");
                addBlock(ECBlockRegistry.LARVIKITE_WALL, "Larvikite Wall");
                addBlock(ECBlockRegistry.LARVIKITE_PRESSURE_PLATE, "Larvikite Pressure Plate");
                addBlock(ECBlockRegistry.LARVIKITE_BUTTON, "Larvikite Button");

                addBlock(ECBlockRegistry.LARVIKITE_COBBLESTONE, "Larvikite Cobblestone");
                addBlock(ECBlockRegistry.LARVIKITE_COBBLESTONE_SLAB, "Larvikite Cobblestone Slab");
                addBlock(ECBlockRegistry.LARVIKITE_COBBLESTONE_STAIRS, "Larvikite Cobblestone Stairs");
                addBlock(ECBlockRegistry.LARVIKITE_COBBLESTONE_WALL, "Larvikite Cobblestone Wall");
                addBlock(ECBlockRegistry.LARVIKITE_COBBLESTONE_PRESSURE_PLATE, "Larvikite Cobblestone Pressure Plate");

                addBlock(ECBlockRegistry.SMOOTH_LARVIKITE, "Smooth Larvikite");
                addBlock(ECBlockRegistry.SMOOTH_LARVIKITE_SLAB, "Smooth Larvikite Slab");
                addBlock(ECBlockRegistry.SMOOTH_LARVIKITE_STAIRS, "Smooth Larvikite Stairs");
                addBlock(ECBlockRegistry.SMOOTH_LARVIKITE_WALL, "Smooth Larvikite Wall");
                addBlock(ECBlockRegistry.SMOOTH_LARVIKITE_PRESSURE_PLATE, "Smooth Larvikite Pressure Plate");

                addBlock(ECBlockRegistry.POLISHED_LARVIKITE, "Polished Larvikite");
                addBlock(ECBlockRegistry.POLISHED_LARVIKITE_SLAB, "Polished Larvikite Slab");
                addBlock(ECBlockRegistry.POLISHED_LARVIKITE_STAIRS, "Polished Larvikite Stairs");
                addBlock(ECBlockRegistry.POLISHED_LARVIKITE_WALL, "Polished Larvikite Wall");
                addBlock(ECBlockRegistry.POLISHED_LARVIKITE_PRESSURE_PLATE, "Polished Larvikite Pressure Plate");

                addBlock(ECBlockRegistry.LARVIKITE_PAVING, "Larvikite Paving");
                addBlock(ECBlockRegistry.LARVIKITE_PAVING_SLAB, "Larvikite Paving Slab");
                addBlock(ECBlockRegistry.LARVIKITE_PAVING_STAIRS, "Larvikite Paving Stairs");
                addBlock(ECBlockRegistry.LARVIKITE_PAVING_WALL, "Larvikite Paving Wall");
                addBlock(ECBlockRegistry.LARVIKITE_PAVING_PRESSURE_PLATE, "Larvikite Paving Pressure Plate");

                addBlock(ECBlockRegistry.LARVIKITE_TILES, "Larvikite Tiles");
                addBlock(ECBlockRegistry.LARVIKITE_TILES_SLAB, "Larvikite Tiles Slab");
                addBlock(ECBlockRegistry.LARVIKITE_TILES_STAIRS, "Larvikite Tiles Stairs");
                addBlock(ECBlockRegistry.LARVIKITE_TILES_WALL, "Larvikite Tiles Wall");
                addBlock(ECBlockRegistry.LARVIKITE_TILES_PRESSURE_PLATE, "Larvikite Tiles Pressure Plate");

                addBlock(ECBlockRegistry.LARVIKITE_BRICKS, "Larvikite Bricks");
                addBlock(ECBlockRegistry.LARVIKITE_BRICKS_SLAB, "Larvikite Bricks Slab");
                addBlock(ECBlockRegistry.LARVIKITE_BRICKS_STAIRS, "Larvikite Bricks Stairs");
                addBlock(ECBlockRegistry.LARVIKITE_BRICKS_WALL, "Larvikite Bricks Wall");
                addBlock(ECBlockRegistry.LARVIKITE_BRICKS_PRESSURE_PLATE, "Larvikite Bricks Pressure Plate");

                addBlock(ECBlockRegistry.LARVIKITE_LARGE_BRICKS, "Larvikite Large Bricks");
                addBlock(ECBlockRegistry.LARVIKITE_LARGE_BRICKS_SLAB, "Larvikite Large Bricks Slab");
                addBlock(ECBlockRegistry.LARVIKITE_LARGE_BRICKS_STAIRS, "Larvikite Large Bricks Stairs");
                addBlock(ECBlockRegistry.LARVIKITE_LARGE_BRICKS_WALL, "Larvikite Large Bricks Wall");
                addBlock(ECBlockRegistry.LARVIKITE_LARGE_BRICKS_PRESSURE_PLATE, "Larvikite Large Bricks Pressure Plate");

                addBlock(ECBlockRegistry.LARVIKITE_ORNAMENT, "Larvikite Ornament");
                addBlock(ECBlockRegistry.LARVIKITE_ORNAMENT_PRESSURE_PLATE, "Larvikite Ornament Pressure Plate");

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

                add("itemGroup.embellishcraft_group", "EmbellishCraft");
                break;
            case "fr_fr":
                // Basalt
                addBlock(ECBlockRegistry.BASALT, "Basalt");
                addBlock(ECBlockRegistry.BASALT_SLAB, "Dalle en basalt");
                addBlock(ECBlockRegistry.BASALT_STAIRS, "Escalier en basalt");
                addBlock(ECBlockRegistry.BASALT_WALL, "Muret en basalt");
                addBlock(ECBlockRegistry.BASALT_PRESSURE_PLATE, "Plaque de pression en basalt");
                addBlock(ECBlockRegistry.BASALT_BUTTON, "Bouton en basalt");

                addBlock(ECBlockRegistry.BASALT_COBBLESTONE, "Pierres de basalt");
                addBlock(ECBlockRegistry.BASALT_COBBLESTONE_SLAB, "Dalle en pierres de basalt");
                addBlock(ECBlockRegistry.BASALT_COBBLESTONE_STAIRS, "Escalier en pierres de basalt");
                addBlock(ECBlockRegistry.BASALT_COBBLESTONE_WALL, "Muret en pierres de basalt");
                addBlock(ECBlockRegistry.BASALT_COBBLESTONE_PRESSURE_PLATE, "Plaque de pression en pierres de basalt");

                addBlock(ECBlockRegistry.SMOOTH_BASALT, "Basalt lisse");
                addBlock(ECBlockRegistry.SMOOTH_BASALT_SLAB, "Dalle en basalt lisse");
                addBlock(ECBlockRegistry.SMOOTH_BASALT_STAIRS, "Escalier en basalt lisse");
                addBlock(ECBlockRegistry.SMOOTH_BASALT_WALL, "Muret en basalt lisse");
                addBlock(ECBlockRegistry.SMOOTH_BASALT_PRESSURE_PLATE, "Plaque de pression en basalt lisse");

                addBlock(ECBlockRegistry.POLISHED_BASALT, "Basalt poli");
                addBlock(ECBlockRegistry.POLISHED_BASALT_SLAB, "Dalle en basalt poli");
                addBlock(ECBlockRegistry.POLISHED_BASALT_STAIRS, "Escalier en basalt poli");
                addBlock(ECBlockRegistry.POLISHED_BASALT_WALL, "Muret en basalt poli");
                addBlock(ECBlockRegistry.POLISHED_BASALT_PRESSURE_PLATE, "Plaque de pression en basalt poli");

                addBlock(ECBlockRegistry.BASALT_PAVING, "Pavés de basalt");
                addBlock(ECBlockRegistry.BASALT_PAVING_SLAB, "Dalle en pavé de basalt");
                addBlock(ECBlockRegistry.BASALT_PAVING_STAIRS, "Escalier en pavé de basalt");
                addBlock(ECBlockRegistry.BASALT_PAVING_WALL, "Muret en pavé de basalt");
                addBlock(ECBlockRegistry.BASALT_PAVING_PRESSURE_PLATE, "Plaque de pression en pavé de basalt");

                addBlock(ECBlockRegistry.BASALT_TILES, "Carrelage de basalt");
                addBlock(ECBlockRegistry.BASALT_TILES_SLAB, "Dalle en carrelage de basalt");
                addBlock(ECBlockRegistry.BASALT_TILES_STAIRS, "Escalier en carrelage de basalt");
                addBlock(ECBlockRegistry.BASALT_TILES_WALL, "Muret en carrelage de basalt");
                addBlock(ECBlockRegistry.BASALT_TILES_PRESSURE_PLATE, "Plaque de pression en carrelage de basalt");

                addBlock(ECBlockRegistry.BASALT_BRICKS, "Briques de basalt");
                addBlock(ECBlockRegistry.BASALT_BRICKS_SLAB, "Dalle en briques de basalt");
                addBlock(ECBlockRegistry.BASALT_BRICKS_STAIRS, "Escalier en briques de basalt");
                addBlock(ECBlockRegistry.BASALT_BRICKS_WALL, "Muret en briques de basalt");
                addBlock(ECBlockRegistry.BASALT_BRICKS_PRESSURE_PLATE, "Plaque de pression en briques de basalt");

                addBlock(ECBlockRegistry.BASALT_LARGE_BRICKS, "Briques épaisses de basalt");
                addBlock(ECBlockRegistry.BASALT_LARGE_BRICKS_SLAB, "Dalle en briques épaisses de basalt");
                addBlock(ECBlockRegistry.BASALT_LARGE_BRICKS_STAIRS, "Escalier en briques épaisses de basalt");
                addBlock(ECBlockRegistry.BASALT_LARGE_BRICKS_WALL, "Muret en briques épaisses de basalt");
                addBlock(ECBlockRegistry.BASALT_LARGE_BRICKS_PRESSURE_PLATE, "Plaque de pression en briques épaisses de basalt");

                addBlock(ECBlockRegistry.BASALT_ORNAMENT, "Ornement en basalt");
                addBlock(ECBlockRegistry.BASALT_ORNAMENT_PRESSURE_PLATE, "Plaque de pression avec ornement en basalt");

                // Slate
                addBlock(ECBlockRegistry.SLATE, "Ardoise");
                addBlock(ECBlockRegistry.SLATE_SLAB, "Dalle en ardoise");
                addBlock(ECBlockRegistry.SLATE_STAIRS, "Escalier en ardoise");
                addBlock(ECBlockRegistry.SLATE_WALL, "Muret en ardoise");
                addBlock(ECBlockRegistry.SLATE_PRESSURE_PLATE, "Plaque de pression en ardoise");
                addBlock(ECBlockRegistry.SLATE_BUTTON, "Bouton en ardoise");

                addBlock(ECBlockRegistry.SLATE_COBBLESTONE, "Pierres d'ardoise");
                addBlock(ECBlockRegistry.SLATE_COBBLESTONE_SLAB, "Dalle en pierres d'ardoise");
                addBlock(ECBlockRegistry.SLATE_COBBLESTONE_STAIRS, "Escalier en pierres d'ardoise");
                addBlock(ECBlockRegistry.SLATE_COBBLESTONE_WALL, "Muret en pierres d'ardoise");
                addBlock(ECBlockRegistry.SLATE_COBBLESTONE_PRESSURE_PLATE, "Plaque de pression en pierres d'ardoise");

                addBlock(ECBlockRegistry.SMOOTH_SLATE, "Ardoise lisse");
                addBlock(ECBlockRegistry.SMOOTH_SLATE_SLAB, "Dalle en ardoise lisse");
                addBlock(ECBlockRegistry.SMOOTH_SLATE_STAIRS, "Escalier en ardoise lisse");
                addBlock(ECBlockRegistry.SMOOTH_SLATE_WALL, "Muret en ardoise lisse");
                addBlock(ECBlockRegistry.SMOOTH_SLATE_PRESSURE_PLATE, "Plaque de pression en ardoise lisse");

                addBlock(ECBlockRegistry.POLISHED_SLATE, "Ardoise poli");
                addBlock(ECBlockRegistry.POLISHED_SLATE_SLAB, "Dalle en ardoise poli");
                addBlock(ECBlockRegistry.POLISHED_SLATE_STAIRS, "Escalier en ardoise poli");
                addBlock(ECBlockRegistry.POLISHED_SLATE_WALL, "Muret en ardoise poli");
                addBlock(ECBlockRegistry.POLISHED_SLATE_PRESSURE_PLATE, "Plaque de pression en ardoise poli");

                addBlock(ECBlockRegistry.SLATE_PAVING, "Pavés d'ardoise");
                addBlock(ECBlockRegistry.SLATE_PAVING_SLAB, "Dalle en pavé d'ardoise");
                addBlock(ECBlockRegistry.SLATE_PAVING_STAIRS, "Escalier en pavé d'ardoise");
                addBlock(ECBlockRegistry.SLATE_PAVING_WALL, "Muret en pavé d'ardoise");
                addBlock(ECBlockRegistry.SLATE_PAVING_PRESSURE_PLATE, "Plaque de pression en pavé d'ardoise");

                addBlock(ECBlockRegistry.SLATE_TILES, "Carrelage d'ardoise");
                addBlock(ECBlockRegistry.SLATE_TILES_SLAB, "Dalle en carrelage d'ardoise");
                addBlock(ECBlockRegistry.SLATE_TILES_STAIRS, "Escalier en carrelage d'ardoise");
                addBlock(ECBlockRegistry.SLATE_TILES_WALL, "Muret en carrelage d'ardoise");
                addBlock(ECBlockRegistry.SLATE_TILES_PRESSURE_PLATE, "Plaque de pression en carrelage d'ardoise");

                addBlock(ECBlockRegistry.SLATE_BRICKS, "Briques d'ardoise");
                addBlock(ECBlockRegistry.SLATE_BRICKS_SLAB, "Dalle en briques d'ardoise");
                addBlock(ECBlockRegistry.SLATE_BRICKS_STAIRS, "Escalier en briques d'ardoise");
                addBlock(ECBlockRegistry.SLATE_BRICKS_WALL, "Muret en briques d'ardoise");
                addBlock(ECBlockRegistry.SLATE_BRICKS_PRESSURE_PLATE, "Plaque de pression en briques d'ardoise");

                addBlock(ECBlockRegistry.SLATE_LARGE_BRICKS, "Briques épaisses d'ardoise");
                addBlock(ECBlockRegistry.SLATE_LARGE_BRICKS_SLAB, "Dalle en briques épaisses d'ardoise");
                addBlock(ECBlockRegistry.SLATE_LARGE_BRICKS_STAIRS, "Escalier en briques épaisses d'ardoise");
                addBlock(ECBlockRegistry.SLATE_LARGE_BRICKS_WALL, "Muret en briques épaisses d'ardoise");
                addBlock(ECBlockRegistry.SLATE_LARGE_BRICKS_PRESSURE_PLATE, "Plaque de pression en briques épaisses d'ardoise");

                addBlock(ECBlockRegistry.SLATE_ORNAMENT, "Ornement en ardoise");
                addBlock(ECBlockRegistry.SLATE_ORNAMENT_PRESSURE_PLATE, "Plaque de pression avec ornement en ardoise");

                // Marble
                addBlock(ECBlockRegistry.MARBLE, "Marbre");
                addBlock(ECBlockRegistry.MARBLE_SLAB, "Dalle en marbre");
                addBlock(ECBlockRegistry.MARBLE_STAIRS, "Escalier en marbre");
                addBlock(ECBlockRegistry.MARBLE_WALL, "Muret en marbre");
                addBlock(ECBlockRegistry.MARBLE_PRESSURE_PLATE, "Plaque de pression en marbre");
                addBlock(ECBlockRegistry.MARBLE_BUTTON, "Bouton en marbre");

                addBlock(ECBlockRegistry.MARBLE_COBBLESTONE, "Pierres de marbre");
                addBlock(ECBlockRegistry.MARBLE_COBBLESTONE_SLAB, "Dalle en pierres de marbre");
                addBlock(ECBlockRegistry.MARBLE_COBBLESTONE_STAIRS, "Escalier en pierres de marbre");
                addBlock(ECBlockRegistry.MARBLE_COBBLESTONE_WALL, "Muret en pierres de marbre");
                addBlock(ECBlockRegistry.MARBLE_COBBLESTONE_PRESSURE_PLATE, "Plaque de pression en pierres de marbre");

                addBlock(ECBlockRegistry.SMOOTH_MARBLE, "Marbre lisse");
                addBlock(ECBlockRegistry.SMOOTH_MARBLE_SLAB, "Dalle en marbre lisse");
                addBlock(ECBlockRegistry.SMOOTH_MARBLE_STAIRS, "Escalier en marbre lisse");
                addBlock(ECBlockRegistry.SMOOTH_MARBLE_WALL, "Muret en marbre lisse");
                addBlock(ECBlockRegistry.SMOOTH_MARBLE_PRESSURE_PLATE, "Plaque de pression en marbre lisse");

                addBlock(ECBlockRegistry.POLISHED_MARBLE, "Marbre poli");
                addBlock(ECBlockRegistry.POLISHED_MARBLE_SLAB, "Dalle en marbre poli");
                addBlock(ECBlockRegistry.POLISHED_MARBLE_STAIRS, "Escalier en marbre poli");
                addBlock(ECBlockRegistry.POLISHED_MARBLE_WALL, "Muret en marbre poli");
                addBlock(ECBlockRegistry.POLISHED_MARBLE_PRESSURE_PLATE, "Plaque de pression en marbre poli");

                addBlock(ECBlockRegistry.MARBLE_PAVING, "Pavés de marbre");
                addBlock(ECBlockRegistry.MARBLE_PAVING_SLAB, "Dalle en pavé de marbre");
                addBlock(ECBlockRegistry.MARBLE_PAVING_STAIRS, "Escalier en pavé de marbre");
                addBlock(ECBlockRegistry.MARBLE_PAVING_WALL, "Muret en pavé de marbre");
                addBlock(ECBlockRegistry.MARBLE_PAVING_PRESSURE_PLATE, "Plaque de pression en pavé de marbre");

                addBlock(ECBlockRegistry.MARBLE_TILES, "Carrelage de marbre");
                addBlock(ECBlockRegistry.MARBLE_TILES_SLAB, "Dalle en carrelage de marbre");
                addBlock(ECBlockRegistry.MARBLE_TILES_STAIRS, "Escalier en carrelage de marbre");
                addBlock(ECBlockRegistry.MARBLE_TILES_WALL, "Muret en carrelage de marbre");
                addBlock(ECBlockRegistry.MARBLE_TILES_PRESSURE_PLATE, "Plaque de pression en carrelage de marbre");

                addBlock(ECBlockRegistry.MARBLE_BRICKS, "Briques de marbre");
                addBlock(ECBlockRegistry.MARBLE_BRICKS_SLAB, "Dalle en briques de marbre");
                addBlock(ECBlockRegistry.MARBLE_BRICKS_STAIRS, "Escalier en briques de marbre");
                addBlock(ECBlockRegistry.MARBLE_BRICKS_WALL, "Muret en briques de marbre");
                addBlock(ECBlockRegistry.MARBLE_BRICKS_PRESSURE_PLATE, "Plaque de pression en briques de marbre");

                addBlock(ECBlockRegistry.MARBLE_LARGE_BRICKS, "Briques épaisses de marbre");
                addBlock(ECBlockRegistry.MARBLE_LARGE_BRICKS_SLAB, "Dalle en briques épaisses de marbre");
                addBlock(ECBlockRegistry.MARBLE_LARGE_BRICKS_STAIRS, "Escalier en briques épaisses de marbre");
                addBlock(ECBlockRegistry.MARBLE_LARGE_BRICKS_WALL, "Muret en briques épaisses de marbre");
                addBlock(ECBlockRegistry.MARBLE_LARGE_BRICKS_PRESSURE_PLATE, "Plaque de pression en briques épaisses de marbre");

                addBlock(ECBlockRegistry.MARBLE_ORNAMENT, "Ornement en marbre");
                addBlock(ECBlockRegistry.MARBLE_ORNAMENT_PRESSURE_PLATE, "Plaque de pression avec ornement en marbre");

                // Gneiss
                addBlock(ECBlockRegistry.GNEISS, "Gneiss");
                addBlock(ECBlockRegistry.GNEISS_SLAB, "Dalle en gneiss");
                addBlock(ECBlockRegistry.GNEISS_STAIRS, "Escalier en gneiss");
                addBlock(ECBlockRegistry.GNEISS_WALL, "Muret en gneiss");
                addBlock(ECBlockRegistry.GNEISS_PRESSURE_PLATE, "Plaque de pression en gneiss");
                addBlock(ECBlockRegistry.GNEISS_BUTTON, "Bouton en gneiss");

                addBlock(ECBlockRegistry.GNEISS_COBBLESTONE, "Pierres de gneiss");
                addBlock(ECBlockRegistry.GNEISS_COBBLESTONE_SLAB, "Dalle en pierres de gneiss");
                addBlock(ECBlockRegistry.GNEISS_COBBLESTONE_STAIRS, "Escalier en pierres de gneiss");
                addBlock(ECBlockRegistry.GNEISS_COBBLESTONE_WALL, "Muret en pierres de gneiss");
                addBlock(ECBlockRegistry.GNEISS_COBBLESTONE_PRESSURE_PLATE, "Plaque de pression en pierres de gneiss");

                addBlock(ECBlockRegistry.SMOOTH_GNEISS, "Gneiss lisse");
                addBlock(ECBlockRegistry.SMOOTH_GNEISS_SLAB, "Dalle en gneiss lisse");
                addBlock(ECBlockRegistry.SMOOTH_GNEISS_STAIRS, "Escalier en gneiss lisse");
                addBlock(ECBlockRegistry.SMOOTH_GNEISS_WALL, "Muret en gneiss lisse");
                addBlock(ECBlockRegistry.SMOOTH_GNEISS_PRESSURE_PLATE, "Plaque de pression en gneiss lisse");

                addBlock(ECBlockRegistry.POLISHED_GNEISS, "Gneiss poli");
                addBlock(ECBlockRegistry.POLISHED_GNEISS_SLAB, "Dalle en gneiss poli");
                addBlock(ECBlockRegistry.POLISHED_GNEISS_STAIRS, "Escalier en gneiss poli");
                addBlock(ECBlockRegistry.POLISHED_GNEISS_WALL, "Muret en gneiss poli");
                addBlock(ECBlockRegistry.POLISHED_GNEISS_PRESSURE_PLATE, "Plaque de pression en gneiss poli");

                addBlock(ECBlockRegistry.GNEISS_PAVING, "Pavés de gneiss");
                addBlock(ECBlockRegistry.GNEISS_PAVING_SLAB, "Dalle en pavé de gneiss");
                addBlock(ECBlockRegistry.GNEISS_PAVING_STAIRS, "Escalier en pavé de gneiss");
                addBlock(ECBlockRegistry.GNEISS_PAVING_WALL, "Muret en pavé de gneiss");
                addBlock(ECBlockRegistry.GNEISS_PAVING_PRESSURE_PLATE, "Plaque de pression en pavé de gneiss");

                addBlock(ECBlockRegistry.GNEISS_TILES, "Carrelage de gneiss");
                addBlock(ECBlockRegistry.GNEISS_TILES_SLAB, "Dalle en carrelage de gneiss");
                addBlock(ECBlockRegistry.GNEISS_TILES_STAIRS, "Escalier en carrelage de gneiss");
                addBlock(ECBlockRegistry.GNEISS_TILES_WALL, "Muret en carrelage de gneiss");
                addBlock(ECBlockRegistry.GNEISS_TILES_PRESSURE_PLATE, "Plaque de pression en carrelage de gneiss");

                addBlock(ECBlockRegistry.GNEISS_BRICKS, "Briques de gneiss");
                addBlock(ECBlockRegistry.GNEISS_BRICKS_SLAB, "Dalle en briques de gneiss");
                addBlock(ECBlockRegistry.GNEISS_BRICKS_STAIRS, "Escalier en briques de gneiss");
                addBlock(ECBlockRegistry.GNEISS_BRICKS_WALL, "Muret en briques de gneiss");
                addBlock(ECBlockRegistry.GNEISS_BRICKS_PRESSURE_PLATE, "Plaque de pression en briques de gneiss");

                addBlock(ECBlockRegistry.GNEISS_LARGE_BRICKS, "Briques épaisses de gneiss");
                addBlock(ECBlockRegistry.GNEISS_LARGE_BRICKS_SLAB, "Dalle en briques épaisses de gneiss");
                addBlock(ECBlockRegistry.GNEISS_LARGE_BRICKS_STAIRS, "Escalier en briques épaisses de gneiss");
                addBlock(ECBlockRegistry.GNEISS_LARGE_BRICKS_WALL, "Muret en briques épaisses de gneiss");
                addBlock(ECBlockRegistry.GNEISS_LARGE_BRICKS_PRESSURE_PLATE, "Plaque de pression en briques épaisses de gneiss");

                addBlock(ECBlockRegistry.GNEISS_ORNAMENT, "Ornement en gneiss");
                addBlock(ECBlockRegistry.GNEISS_ORNAMENT_PRESSURE_PLATE, "Plaque de pression avec ornement en gneiss");

                // Jade
                addBlock(ECBlockRegistry.JADE, "Jade");
                addBlock(ECBlockRegistry.JADE_SLAB, "Dalle en jade");
                addBlock(ECBlockRegistry.JADE_STAIRS, "Escalier en jade");
                addBlock(ECBlockRegistry.JADE_WALL, "Muret en jade");
                addBlock(ECBlockRegistry.JADE_PRESSURE_PLATE, "Plaque de pression en jade");
                addBlock(ECBlockRegistry.JADE_BUTTON, "Bouton en jade");

                addBlock(ECBlockRegistry.JADE_COBBLESTONE, "Pierres de jade");
                addBlock(ECBlockRegistry.JADE_COBBLESTONE_SLAB, "Dalle en pierres de jade");
                addBlock(ECBlockRegistry.JADE_COBBLESTONE_STAIRS, "Escalier en pierres de jade");
                addBlock(ECBlockRegistry.JADE_COBBLESTONE_WALL, "Muret en pierres de jade");
                addBlock(ECBlockRegistry.JADE_COBBLESTONE_PRESSURE_PLATE, "Plaque de pression en pierres de jade");

                addBlock(ECBlockRegistry.SMOOTH_JADE, "Jade lisse");
                addBlock(ECBlockRegistry.SMOOTH_JADE_SLAB, "Dalle en jade lisse");
                addBlock(ECBlockRegistry.SMOOTH_JADE_STAIRS, "Escalier en jade lisse");
                addBlock(ECBlockRegistry.SMOOTH_JADE_WALL, "Muret en jade lisse");
                addBlock(ECBlockRegistry.SMOOTH_JADE_PRESSURE_PLATE, "Plaque de pression en jade lisse");

                addBlock(ECBlockRegistry.POLISHED_JADE, "Jade poli");
                addBlock(ECBlockRegistry.POLISHED_JADE_SLAB, "Dalle en jade poli");
                addBlock(ECBlockRegistry.POLISHED_JADE_STAIRS, "Escalier en jade poli");
                addBlock(ECBlockRegistry.POLISHED_JADE_WALL, "Muret en jade poli");
                addBlock(ECBlockRegistry.POLISHED_JADE_PRESSURE_PLATE, "Plaque de pression en jade poli");

                addBlock(ECBlockRegistry.JADE_PAVING, "Pavés de jade");
                addBlock(ECBlockRegistry.JADE_PAVING_SLAB, "Dalle en pavé de jade");
                addBlock(ECBlockRegistry.JADE_PAVING_STAIRS, "Escalier en pavé de jade");
                addBlock(ECBlockRegistry.JADE_PAVING_WALL, "Muret en pavé de jade");
                addBlock(ECBlockRegistry.JADE_PAVING_PRESSURE_PLATE, "Plaque de pression en pavé de jade");

                addBlock(ECBlockRegistry.JADE_TILES, "Carrelage de jade");
                addBlock(ECBlockRegistry.JADE_TILES_SLAB, "Dalle en carrelage de jade");
                addBlock(ECBlockRegistry.JADE_TILES_STAIRS, "Escalier en carrelage de jade");
                addBlock(ECBlockRegistry.JADE_TILES_WALL, "Muret en carrelage de jade");
                addBlock(ECBlockRegistry.JADE_TILES_PRESSURE_PLATE, "Plaque de pression en carrelage de jade");

                addBlock(ECBlockRegistry.JADE_BRICKS, "Briques de jade");
                addBlock(ECBlockRegistry.JADE_BRICKS_SLAB, "Dalle en briques de jade");
                addBlock(ECBlockRegistry.JADE_BRICKS_STAIRS, "Escalier en briques de jade");
                addBlock(ECBlockRegistry.JADE_BRICKS_WALL, "Muret en briques de jade");
                addBlock(ECBlockRegistry.JADE_BRICKS_PRESSURE_PLATE, "Plaque de pression en briques de jade");

                addBlock(ECBlockRegistry.JADE_LARGE_BRICKS, "Briques épaisses de jade");
                addBlock(ECBlockRegistry.JADE_LARGE_BRICKS_SLAB, "Dalle en briques épaisses de jade");
                addBlock(ECBlockRegistry.JADE_LARGE_BRICKS_STAIRS, "Escalier en briques épaisses de jade");
                addBlock(ECBlockRegistry.JADE_LARGE_BRICKS_WALL, "Muret en briques épaisses de jade");
                addBlock(ECBlockRegistry.JADE_LARGE_BRICKS_PRESSURE_PLATE, "Plaque de pression en briques épaisses de jade");

                addBlock(ECBlockRegistry.JADE_ORNAMENT, "Ornement en jade");
                addBlock(ECBlockRegistry.JADE_ORNAMENT_PRESSURE_PLATE, "Plaque de pression avec ornement en jade");

                // Larvikite
                addBlock(ECBlockRegistry.LARVIKITE, "Larvikite");
                addBlock(ECBlockRegistry.LARVIKITE_SLAB, "Dalle en larvikite");
                addBlock(ECBlockRegistry.LARVIKITE_STAIRS, "Escalier en larvikite");
                addBlock(ECBlockRegistry.LARVIKITE_WALL, "Muret en larvikite");
                addBlock(ECBlockRegistry.LARVIKITE_PRESSURE_PLATE, "Plaque de pression en larvikite");
                addBlock(ECBlockRegistry.LARVIKITE_BUTTON, "Bouton en larvikite");

                addBlock(ECBlockRegistry.LARVIKITE_COBBLESTONE, "Pierres de larvikite");
                addBlock(ECBlockRegistry.LARVIKITE_COBBLESTONE_SLAB, "Dalle en pierres de larvikite");
                addBlock(ECBlockRegistry.LARVIKITE_COBBLESTONE_STAIRS, "Escalier en pierres de larvikite");
                addBlock(ECBlockRegistry.LARVIKITE_COBBLESTONE_WALL, "Muret en pierres de larvikite");
                addBlock(ECBlockRegistry.LARVIKITE_COBBLESTONE_PRESSURE_PLATE, "Plaque de pression en pierres de larvikite");

                addBlock(ECBlockRegistry.SMOOTH_LARVIKITE, "Larvikite lisse");
                addBlock(ECBlockRegistry.SMOOTH_LARVIKITE_SLAB, "Dalle en larvikite lisse");
                addBlock(ECBlockRegistry.SMOOTH_LARVIKITE_STAIRS, "Escalier en larvikite lisse");
                addBlock(ECBlockRegistry.SMOOTH_LARVIKITE_WALL, "Muret en larvikite lisse");
                addBlock(ECBlockRegistry.SMOOTH_LARVIKITE_PRESSURE_PLATE, "Plaque de pression en larvikite lisse");

                addBlock(ECBlockRegistry.POLISHED_LARVIKITE, "Larvikite poli");
                addBlock(ECBlockRegistry.POLISHED_LARVIKITE_SLAB, "Dalle en larvikite poli");
                addBlock(ECBlockRegistry.POLISHED_LARVIKITE_STAIRS, "Escalier en larvikite poli");
                addBlock(ECBlockRegistry.POLISHED_LARVIKITE_WALL, "Muret en larvikite poli");
                addBlock(ECBlockRegistry.POLISHED_LARVIKITE_PRESSURE_PLATE, "Plaque de pression en larvikite poli");

                addBlock(ECBlockRegistry.LARVIKITE_PAVING, "Pavés de larvikite");
                addBlock(ECBlockRegistry.LARVIKITE_PAVING_SLAB, "Dalle en pavé de larvikite");
                addBlock(ECBlockRegistry.LARVIKITE_PAVING_STAIRS, "Escalier en pavé de larvikite");
                addBlock(ECBlockRegistry.LARVIKITE_PAVING_WALL, "Muret en pavé de larvikite");
                addBlock(ECBlockRegistry.LARVIKITE_PAVING_PRESSURE_PLATE, "Plaque de pression en pavé de larvikite");

                addBlock(ECBlockRegistry.LARVIKITE_TILES, "Carrelage de larvikite");
                addBlock(ECBlockRegistry.LARVIKITE_TILES_SLAB, "Dalle en carrelage de larvikite");
                addBlock(ECBlockRegistry.LARVIKITE_TILES_STAIRS, "Escalier en carrelage de larvikite");
                addBlock(ECBlockRegistry.LARVIKITE_TILES_WALL, "Muret en carrelage de larvikite");
                addBlock(ECBlockRegistry.LARVIKITE_TILES_PRESSURE_PLATE, "Plaque de pression en carrelage de larvikite");

                addBlock(ECBlockRegistry.LARVIKITE_BRICKS, "Briques de larvikite");
                addBlock(ECBlockRegistry.LARVIKITE_BRICKS_SLAB, "Dalle en briques de larvikite");
                addBlock(ECBlockRegistry.LARVIKITE_BRICKS_STAIRS, "Escalier en briques de larvikite");
                addBlock(ECBlockRegistry.LARVIKITE_BRICKS_WALL, "Muret en briques de larvikite");
                addBlock(ECBlockRegistry.LARVIKITE_BRICKS_PRESSURE_PLATE, "Plaque de pression en briques de larvikite");

                addBlock(ECBlockRegistry.LARVIKITE_LARGE_BRICKS, "Briques épaisses de larvikite");
                addBlock(ECBlockRegistry.LARVIKITE_LARGE_BRICKS_SLAB, "Dalle en briques épaisses de larvikite");
                addBlock(ECBlockRegistry.LARVIKITE_LARGE_BRICKS_STAIRS, "Escalier en briques épaisses de larvikite");
                addBlock(ECBlockRegistry.LARVIKITE_LARGE_BRICKS_WALL, "Muret en briques épaisses de larvikite");
                addBlock(ECBlockRegistry.LARVIKITE_LARGE_BRICKS_PRESSURE_PLATE, "Plaque de pression en briques épaisses de larvikite");

                addBlock(ECBlockRegistry.LARVIKITE_ORNAMENT, "Ornement en larvikite");
                addBlock(ECBlockRegistry.LARVIKITE_ORNAMENT_PRESSURE_PLATE, "Plaque de pression avec ornement en larvikite");

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

                add("itemGroup.embellishcraft_group", "EmbellishCraft");
                break;
        }
    }
}
