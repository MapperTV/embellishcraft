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

                addBlock(ECBlockRegistry.BASALT_COBBLESTONE, "Basalt Cobblestone");
                addBlock(ECBlockRegistry.BASALT_COBBLESTONE_SLAB, "Basalt Cobblestone Slab");
                addBlock(ECBlockRegistry.BASALT_COBBLESTONE_STAIRS, "Basalt Cobblestone Stairs");
                addBlock(ECBlockRegistry.BASALT_COBBLESTONE_WALL, "Basalt Cobblestone Wall");
                addBlock(ECBlockRegistry.BASALT_COBBLESTONE_PRESSURE_PLATE, "Basalt Cobblestone Pressure Plate");

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

                // Slate
                addBlock(ECBlockRegistry.SLATE, "Slate");
                addBlock(ECBlockRegistry.SLATE_SLAB, "Slate Slab");
                addBlock(ECBlockRegistry.SLATE_STAIRS, "Slate Stairs");
                addBlock(ECBlockRegistry.SLATE_WALL, "Slate Wall");
                addBlock(ECBlockRegistry.SLATE_PRESSURE_PLATE, "Slate Pressure Plate");

                addBlock(ECBlockRegistry.SLATE_COBBLESTONE, "Slate Cobblestone");
                addBlock(ECBlockRegistry.SLATE_COBBLESTONE_SLAB, "Slate Cobblestone Slab");
                addBlock(ECBlockRegistry.SLATE_COBBLESTONE_STAIRS, "Slate Cobblestone Stairs");
                addBlock(ECBlockRegistry.SLATE_COBBLESTONE_WALL, "Slate Cobblestone Wall");
                addBlock(ECBlockRegistry.SLATE_COBBLESTONE_PRESSURE_PLATE, "Slate Cobblestone Pressure Plate");

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

                // Marble
                addBlock(ECBlockRegistry.MARBLE, "Marble");
                addBlock(ECBlockRegistry.MARBLE_SLAB, "Marble Slab");
                addBlock(ECBlockRegistry.MARBLE_STAIRS, "Marble Stairs");
                addBlock(ECBlockRegistry.MARBLE_WALL, "Marble Wall");
                addBlock(ECBlockRegistry.MARBLE_PRESSURE_PLATE, "Marble Pressure Plate");

                addBlock(ECBlockRegistry.MARBLE_COBBLESTONE, "Marble Cobblestone");
                addBlock(ECBlockRegistry.MARBLE_COBBLESTONE_SLAB, "Marble Cobblestone Slab");
                addBlock(ECBlockRegistry.MARBLE_COBBLESTONE_STAIRS, "Marble Cobblestone Stairs");
                addBlock(ECBlockRegistry.MARBLE_COBBLESTONE_WALL, "Marble Cobblestone Wall");
                addBlock(ECBlockRegistry.MARBLE_COBBLESTONE_PRESSURE_PLATE, "Marble Cobblestone Pressure Plate");

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

                // Gneiss
                addBlock(ECBlockRegistry.GNEISS, "Gneiss");
                addBlock(ECBlockRegistry.GNEISS_SLAB, "Gneiss Slab");
                addBlock(ECBlockRegistry.GNEISS_STAIRS, "Gneiss Stairs");
                addBlock(ECBlockRegistry.GNEISS_WALL, "Gneiss Wall");
                addBlock(ECBlockRegistry.GNEISS_PRESSURE_PLATE, "Gneiss Pressure Plate");

                addBlock(ECBlockRegistry.GNEISS_COBBLESTONE, "Gneiss Cobblestone");
                addBlock(ECBlockRegistry.GNEISS_COBBLESTONE_SLAB, "Gneiss Cobblestone Slab");
                addBlock(ECBlockRegistry.GNEISS_COBBLESTONE_STAIRS, "Gneiss Cobblestone Stairs");
                addBlock(ECBlockRegistry.GNEISS_COBBLESTONE_WALL, "Gneiss Cobblestone Wall");
                addBlock(ECBlockRegistry.GNEISS_COBBLESTONE_PRESSURE_PLATE, "Gneiss Cobblestone Pressure Plate");

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

                // Jade
                addBlock(ECBlockRegistry.JADE, "Jade");
                addBlock(ECBlockRegistry.JADE_SLAB, "Jade Slab");
                addBlock(ECBlockRegistry.JADE_STAIRS, "Jade Stairs");
                addBlock(ECBlockRegistry.JADE_WALL, "Jade Wall");
                addBlock(ECBlockRegistry.JADE_PRESSURE_PLATE, "Jade Pressure Plate");

                addBlock(ECBlockRegistry.JADE_COBBLESTONE, "Jade Cobblestone");
                addBlock(ECBlockRegistry.JADE_COBBLESTONE_SLAB, "Jade Cobblestone Slab");
                addBlock(ECBlockRegistry.JADE_COBBLESTONE_STAIRS, "Jade Cobblestone Stairs");
                addBlock(ECBlockRegistry.JADE_COBBLESTONE_WALL, "Jade Cobblestone Wall");
                addBlock(ECBlockRegistry.JADE_COBBLESTONE_PRESSURE_PLATE, "Jade Cobblestone Pressure Plate");

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

                // Larvikite
                addBlock(ECBlockRegistry.LARVIKITE, "Larvikite");
                addBlock(ECBlockRegistry.LARVIKITE_SLAB, "Larvikite Slab");
                addBlock(ECBlockRegistry.LARVIKITE_STAIRS, "Larvikite Stairs");
                addBlock(ECBlockRegistry.LARVIKITE_WALL, "Larvikite Wall");
                addBlock(ECBlockRegistry.LARVIKITE_PRESSURE_PLATE, "Larvikite Pressure Plate");

                addBlock(ECBlockRegistry.LARVIKITE_COBBLESTONE, "Larvikite Cobblestone");
                addBlock(ECBlockRegistry.LARVIKITE_COBBLESTONE_SLAB, "Larvikite Cobblestone Slab");
                addBlock(ECBlockRegistry.LARVIKITE_COBBLESTONE_STAIRS, "Larvikite Cobblestone Stairs");
                addBlock(ECBlockRegistry.LARVIKITE_COBBLESTONE_WALL, "Larvikite Cobblestone Wall");
                addBlock(ECBlockRegistry.LARVIKITE_COBBLESTONE_PRESSURE_PLATE, "Larvikite Cobblestone Pressure Plate");

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

                add("itemGroup.embellishcraft_group", "EmbellishCraft");
                break;
            case "fr_fr":
                // Basalt
                addBlock(ECBlockRegistry.BASALT, "Basalt");
                addBlock(ECBlockRegistry.BASALT_SLAB, "Dalle en basalt");
                addBlock(ECBlockRegistry.BASALT_STAIRS, "Escalier en basalt");
                addBlock(ECBlockRegistry.BASALT_WALL, "Muret en basalt");
                addBlock(ECBlockRegistry.BASALT_PRESSURE_PLATE, "Plaque de pression en basalt");

                addBlock(ECBlockRegistry.BASALT_COBBLESTONE, "Pierres de basalt");
                addBlock(ECBlockRegistry.BASALT_COBBLESTONE_SLAB, "Dalle en pierres de basalt");
                addBlock(ECBlockRegistry.BASALT_COBBLESTONE_STAIRS, "Escalier en pierres de basalt");
                addBlock(ECBlockRegistry.BASALT_COBBLESTONE_WALL, "Muret en pierres de basalt");
                addBlock(ECBlockRegistry.BASALT_COBBLESTONE_PRESSURE_PLATE, "Plaque de pression en pierres de basalt");

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

                // Slate
                addBlock(ECBlockRegistry.SLATE, "Ardoise");
                addBlock(ECBlockRegistry.SLATE_SLAB, "Dalle en ardoise");
                addBlock(ECBlockRegistry.SLATE_STAIRS, "Escalier en ardoise");
                addBlock(ECBlockRegistry.SLATE_WALL, "Muret en ardoise");
                addBlock(ECBlockRegistry.SLATE_PRESSURE_PLATE, "Plaque de pression en ardoise");

                addBlock(ECBlockRegistry.SLATE_COBBLESTONE, "Pierres d'ardoise");
                addBlock(ECBlockRegistry.SLATE_COBBLESTONE_SLAB, "Dalle en pierres d'ardoise");
                addBlock(ECBlockRegistry.SLATE_COBBLESTONE_STAIRS, "Escalier en pierres d'ardoise");
                addBlock(ECBlockRegistry.SLATE_COBBLESTONE_WALL, "Muret en pierres d'ardoise");
                addBlock(ECBlockRegistry.SLATE_COBBLESTONE_PRESSURE_PLATE, "Plaque de pression en pierres d'ardoise");

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

                // Marble
                addBlock(ECBlockRegistry.MARBLE, "Marbre");
                addBlock(ECBlockRegistry.MARBLE_SLAB, "Dalle en marbre");
                addBlock(ECBlockRegistry.MARBLE_STAIRS, "Escalier en marbre");
                addBlock(ECBlockRegistry.MARBLE_WALL, "Muret en marbre");
                addBlock(ECBlockRegistry.MARBLE_PRESSURE_PLATE, "Plaque de pression en marbre");

                addBlock(ECBlockRegistry.MARBLE_COBBLESTONE, "Pierres de marbre");
                addBlock(ECBlockRegistry.MARBLE_COBBLESTONE_SLAB, "Dalle en pierres de marbre");
                addBlock(ECBlockRegistry.MARBLE_COBBLESTONE_STAIRS, "Escalier en pierres de marbre");
                addBlock(ECBlockRegistry.MARBLE_COBBLESTONE_WALL, "Muret en pierres de marbre");
                addBlock(ECBlockRegistry.MARBLE_COBBLESTONE_PRESSURE_PLATE, "Plaque de pression en pierres de marbre");

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

                // Gneiss
                addBlock(ECBlockRegistry.GNEISS, "Gneiss");
                addBlock(ECBlockRegistry.GNEISS_SLAB, "Dalle en gneiss");
                addBlock(ECBlockRegistry.GNEISS_STAIRS, "Escalier en gneiss");
                addBlock(ECBlockRegistry.GNEISS_WALL, "Muret en gneiss");
                addBlock(ECBlockRegistry.GNEISS_PRESSURE_PLATE, "Plaque de pression en gneiss");

                addBlock(ECBlockRegistry.GNEISS_COBBLESTONE, "Pierres de gneiss");
                addBlock(ECBlockRegistry.GNEISS_COBBLESTONE_SLAB, "Dalle en pierres de gneiss");
                addBlock(ECBlockRegistry.GNEISS_COBBLESTONE_STAIRS, "Escalier en pierres de gneiss");
                addBlock(ECBlockRegistry.GNEISS_COBBLESTONE_WALL, "Muret en pierres de gneiss");
                addBlock(ECBlockRegistry.GNEISS_COBBLESTONE_PRESSURE_PLATE, "Plaque de pression en pierres de gneiss");

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

                // Jade
                addBlock(ECBlockRegistry.JADE, "Jade");
                addBlock(ECBlockRegistry.JADE_SLAB, "Dalle en jade");
                addBlock(ECBlockRegistry.JADE_STAIRS, "Escalier en jade");
                addBlock(ECBlockRegistry.JADE_WALL, "Muret en jade");
                addBlock(ECBlockRegistry.JADE_PRESSURE_PLATE, "Plaque de pression en jade");

                addBlock(ECBlockRegistry.JADE_COBBLESTONE, "Pierres de jade");
                addBlock(ECBlockRegistry.JADE_COBBLESTONE_SLAB, "Dalle en pierres de jade");
                addBlock(ECBlockRegistry.JADE_COBBLESTONE_STAIRS, "Escalier en pierres de jade");
                addBlock(ECBlockRegistry.JADE_COBBLESTONE_WALL, "Muret en pierres de jade");
                addBlock(ECBlockRegistry.JADE_COBBLESTONE_PRESSURE_PLATE, "Plaque de pression en pierres de jade");

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

                // Larvikite
                addBlock(ECBlockRegistry.LARVIKITE, "Larvikite");
                addBlock(ECBlockRegistry.LARVIKITE_SLAB, "Dalle en larvikite");
                addBlock(ECBlockRegistry.LARVIKITE_STAIRS, "Escalier en larvikite");
                addBlock(ECBlockRegistry.LARVIKITE_WALL, "Muret en larvikite");
                addBlock(ECBlockRegistry.LARVIKITE_PRESSURE_PLATE, "Plaque de pression en larvikite");

                addBlock(ECBlockRegistry.LARVIKITE_COBBLESTONE, "Pierres de larvikite");
                addBlock(ECBlockRegistry.LARVIKITE_COBBLESTONE_SLAB, "Dalle en pierres de larvikite");
                addBlock(ECBlockRegistry.LARVIKITE_COBBLESTONE_STAIRS, "Escalier en pierres de larvikite");
                addBlock(ECBlockRegistry.LARVIKITE_COBBLESTONE_WALL, "Muret en pierres de larvikite");
                addBlock(ECBlockRegistry.LARVIKITE_COBBLESTONE_PRESSURE_PLATE, "Plaque de pression en pierres de larvikite");

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

                add("itemGroup.embellishcraft_group", "EmbellishCraft");
                break;
        }
    }
}
