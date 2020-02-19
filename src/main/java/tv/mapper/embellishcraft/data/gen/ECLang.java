package tv.mapper.embellishcraft.data.gen;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;
import tv.mapper.embellishcraft.block.ECBlockRegistry;
import tv.mapper.embellishcraft.block.ECBlocks;

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
                addBlock(ECBlockRegistry.BASALT, "Basalt Block");
                addBlock(ECBlockRegistry.BASALT_SLAB, "Basalt Slab");
                addBlock(ECBlockRegistry.BASALT_STAIRS, "Basalt Stairs");
                addBlock(ECBlockRegistry.BASALT_WALL, "Basalt Wall");
                addBlock(ECBlockRegistry.BASALT_PRESSURE_PLATE, "Basalt Pressure Plate");

                add(ECBlocks.BASALT_COBBLESTONE, "Basalt Cobblestone Block");
                add(ECBlocks.BASALT_COBBLESTONE_SLAB, "Basalt Cobblestone Slab");
                add(ECBlocks.BASALT_COBBLESTONE_STAIRS, "Basalt Cobblestone Stairs");
                add(ECBlocks.BASALT_COBBLESTONE_WALL, "Basalt Cobblestone Wall");
                add(ECBlocks.BASALT_COBBLESTONE_PRESSURE_PLATE, "Basalt Cobblestone Pressure Plate");

                addBlock(ECBlockRegistry.SLATE, "Slate Block");
                addBlock(ECBlockRegistry.SLATE_SLAB, "Slate Slab");
                addBlock(ECBlockRegistry.SLATE_STAIRS, "Slate Stairs");
                addBlock(ECBlockRegistry.SLATE_WALL, "Slate Wall");
                addBlock(ECBlockRegistry.SLATE_PRESSURE_PLATE, "Slate Pressure Plate");

                add(ECBlocks.SLATE_COBBLESTONE, "Slate Cobblestone Block");
                add(ECBlocks.SLATE_COBBLESTONE_SLAB, "Slate Cobblestone Slab");
                add(ECBlocks.SLATE_COBBLESTONE_STAIRS, "Slate Cobblestone Stairs");
                add(ECBlocks.SLATE_COBBLESTONE_WALL, "Slate Cobblestone Wall");
                add(ECBlocks.SLATE_COBBLESTONE_PRESSURE_PLATE, "Slate Cobblestone Pressure Plate");

                add(ECBlocks.MARBLE, "Marble Block");
                add(ECBlocks.MARBLE_SLAB, "Marble Slab");
                add(ECBlocks.MARBLE_STAIRS, "Marble Stairs");
                add(ECBlocks.MARBLE_WALL, "Marble Wall");
                add(ECBlocks.MARBLE_PRESSURE_PLATE, "Marble Pressure Plate");

                add(ECBlocks.MARBLE_COBBLESTONE, "Marble Cobblestone Block");
                add(ECBlocks.MARBLE_COBBLESTONE_SLAB, "Marble Cobblestone Slab");
                add(ECBlocks.MARBLE_COBBLESTONE_STAIRS, "Marble Cobblestone Stairs");
                add(ECBlocks.MARBLE_COBBLESTONE_WALL, "Marble Cobblestone Wall");
                add(ECBlocks.MARBLE_COBBLESTONE_PRESSURE_PLATE, "Marble Cobblestone Pressure Plate");

                add(ECBlocks.GNEISS, "Gneiss Block");
                add(ECBlocks.GNEISS_SLAB, "Gneiss Slab");
                add(ECBlocks.GNEISS_STAIRS, "Gneiss Stairs");
                add(ECBlocks.GNEISS_WALL, "Gneiss Wall");
                add(ECBlocks.GNEISS_PRESSURE_PLATE, "Gneiss Pressure Plate");

                add(ECBlocks.GNEISS_COBBLESTONE, "Gneiss Cobblestone Block");
                add(ECBlocks.GNEISS_COBBLESTONE_SLAB, "Gneiss Cobblestone Slab");
                add(ECBlocks.GNEISS_COBBLESTONE_STAIRS, "Gneiss Cobblestone Stairs");
                add(ECBlocks.GNEISS_COBBLESTONE_WALL, "Gneiss Cobblestone Wall");
                add(ECBlocks.GNEISS_COBBLESTONE_PRESSURE_PLATE, "Gneiss Cobblestone Pressure Plate");

                add(ECBlocks.JADE, "Jade Block");
                add(ECBlocks.JADE_SLAB, "Jade Slab");
                add(ECBlocks.JADE_STAIRS, "Jade Stairs");
                add(ECBlocks.JADE_WALL, "Jade Wall");
                add(ECBlocks.JADE_PRESSURE_PLATE, "Jade Pressure Plate");

                add(ECBlocks.JADE_COBBLESTONE, "Jade Cobblestone Block");
                add(ECBlocks.JADE_COBBLESTONE_SLAB, "Jade Cobblestone Slab");
                add(ECBlocks.JADE_COBBLESTONE_STAIRS, "Jade Cobblestone Stairs");
                add(ECBlocks.JADE_COBBLESTONE_WALL, "Jade Cobblestone Wall");
                add(ECBlocks.JADE_COBBLESTONE_PRESSURE_PLATE, "Jade Cobblestone Pressure Plate");

                add(ECBlocks.LARVIKITE, "Larvikite Block");
                add(ECBlocks.LARVIKITE_SLAB, "Larvikite Slab");
                add(ECBlocks.LARVIKITE_STAIRS, "Larvikite Stairs");
                add(ECBlocks.LARVIKITE_WALL, "Larvikite Wall");
                add(ECBlocks.LARVIKITE_PRESSURE_PLATE, "Larvikite Pressure Plate");

                add(ECBlocks.LARVIKITE_COBBLESTONE, "Larvikite Cobblestone Block");
                add(ECBlocks.LARVIKITE_COBBLESTONE_SLAB, "Larvikite Cobblestone Slab");
                add(ECBlocks.LARVIKITE_COBBLESTONE_STAIRS, "Larvikite Cobblestone Stairs");
                add(ECBlocks.LARVIKITE_COBBLESTONE_WALL, "Larvikite Cobblestone Wall");
                add(ECBlocks.LARVIKITE_COBBLESTONE_PRESSURE_PLATE, "Larvikite Cobblestone Pressure Plate");

                add("itemGroup.embellishcraft_group", "EmbellishCraft");
                break;
            case "fr_fr":
                addBlock(ECBlockRegistry.BASALT, "Bloc de basalt");
                addBlock(ECBlockRegistry.BASALT_SLAB, "Dalle en basalt");
                addBlock(ECBlockRegistry.BASALT_STAIRS, "Escalier en basalt");
                addBlock(ECBlockRegistry.BASALT_WALL, "Muret en basalt");
                addBlock(ECBlockRegistry.BASALT_PRESSURE_PLATE, "Plaque de pression en basalt");

                add(ECBlocks.BASALT_COBBLESTONE, "Pierres de basalt");
                add(ECBlocks.BASALT_COBBLESTONE_SLAB, "Dalle en pierres de basalt");
                add(ECBlocks.BASALT_COBBLESTONE_STAIRS, "Escalier en pierres de basalt");
                add(ECBlocks.BASALT_COBBLESTONE_WALL, "Muret en pierres de basalt");
                add(ECBlocks.BASALT_COBBLESTONE_PRESSURE_PLATE, "Plaque de pression en pierres de basalt");

                addBlock(ECBlockRegistry.SLATE, "Bloc d'ardoise");
                addBlock(ECBlockRegistry.SLATE_SLAB, "Dalle en ardoise");
                addBlock(ECBlockRegistry.SLATE_STAIRS, "Escalier en ardoise");
                addBlock(ECBlockRegistry.SLATE_WALL, "Muret en ardoise");
                addBlock(ECBlockRegistry.SLATE_PRESSURE_PLATE, "Plaque de pression en ardoise");

                add(ECBlocks.SLATE_COBBLESTONE, "Pierres d'ardoise");
                add(ECBlocks.SLATE_COBBLESTONE_SLAB, "Dalle en pierres d'ardoise");
                add(ECBlocks.SLATE_COBBLESTONE_STAIRS, "Escalier en pierres d'ardoise");
                add(ECBlocks.SLATE_COBBLESTONE_WALL, "Muret en pierres d'ardoise");
                add(ECBlocks.SLATE_COBBLESTONE_PRESSURE_PLATE, "Plaque de pression en pierres d'ardoise");

                add(ECBlocks.MARBLE, "Bloc de marbre");
                add(ECBlocks.MARBLE_SLAB, "Dalle en marbre");
                add(ECBlocks.MARBLE_STAIRS, "Escalier en marbre");
                add(ECBlocks.MARBLE_WALL, "Muret en marbre");
                add(ECBlocks.MARBLE_PRESSURE_PLATE, "Plaque de pression en marbre");

                add(ECBlocks.MARBLE_COBBLESTONE, "Pierres de marbre");
                add(ECBlocks.MARBLE_COBBLESTONE_SLAB, "Dalle en pierres de marbre");
                add(ECBlocks.MARBLE_COBBLESTONE_STAIRS, "Escalier en pierres de marbre");
                add(ECBlocks.MARBLE_COBBLESTONE_WALL, "Muret en pierres de marbre");
                add(ECBlocks.MARBLE_COBBLESTONE_PRESSURE_PLATE, "Plaque de pression en pierres de marbre");

                add(ECBlocks.GNEISS, "Bloc de gneiss");
                add(ECBlocks.GNEISS_SLAB, "Dalle en gneiss");
                add(ECBlocks.GNEISS_STAIRS, "Escalier en gneiss");
                add(ECBlocks.GNEISS_WALL, "Muret en gneiss");
                add(ECBlocks.GNEISS_PRESSURE_PLATE, "Plaque de pression en gneiss");

                add(ECBlocks.GNEISS_COBBLESTONE, "Pierres de gneiss");
                add(ECBlocks.GNEISS_COBBLESTONE_SLAB, "Dalle en pierres de gneiss");
                add(ECBlocks.GNEISS_COBBLESTONE_STAIRS, "Escalier en pierres de gneiss");
                add(ECBlocks.GNEISS_COBBLESTONE_WALL, "Muret en pierres de gneiss");
                add(ECBlocks.GNEISS_COBBLESTONE_PRESSURE_PLATE, "Plaque de pression en pierres de gneiss");

                add(ECBlocks.JADE, "Bloc de jade");
                add(ECBlocks.JADE_SLAB, "Dalle en jade");
                add(ECBlocks.JADE_STAIRS, "Escalier en jade");
                add(ECBlocks.JADE_WALL, "Muret en jade");
                add(ECBlocks.JADE_PRESSURE_PLATE, "Plaque de pression en jade");

                add(ECBlocks.JADE_COBBLESTONE, "Pierres de jade");
                add(ECBlocks.JADE_COBBLESTONE_SLAB, "Dalle en pierres de jade");
                add(ECBlocks.JADE_COBBLESTONE_STAIRS, "Escalier en pierres de jade");
                add(ECBlocks.JADE_COBBLESTONE_WALL, "Muret en pierres de jade");
                add(ECBlocks.JADE_COBBLESTONE_PRESSURE_PLATE, "Plaque de pression en pierres de jade");

                add(ECBlocks.LARVIKITE, "Bloc de larvikite");
                add(ECBlocks.LARVIKITE_SLAB, "Dalle en larvikite");
                add(ECBlocks.LARVIKITE_STAIRS, "Escalier en larvikite");
                add(ECBlocks.LARVIKITE_WALL, "Muret en larvikite");
                add(ECBlocks.LARVIKITE_PRESSURE_PLATE, "Plaque de pression en larvikite");

                add(ECBlocks.LARVIKITE_COBBLESTONE, "Pierres de larvikite");
                add(ECBlocks.LARVIKITE_COBBLESTONE_SLAB, "Dalle en pierres de larvikite");
                add(ECBlocks.LARVIKITE_COBBLESTONE_STAIRS, "Escalier en pierres de larvikite");
                add(ECBlocks.LARVIKITE_COBBLESTONE_WALL, "Muret en pierres de larvikite");
                add(ECBlocks.LARVIKITE_COBBLESTONE_PRESSURE_PLATE, "Plaque de pression en pierres de larvikite");

                add("itemGroup.embellishcraft_group", "EmbellishCraft");
                break;
        }
    }
}
