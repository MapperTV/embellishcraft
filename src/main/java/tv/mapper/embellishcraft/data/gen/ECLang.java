package tv.mapper.embellishcraft.data.gen;

import java.util.Arrays;

import org.codehaus.plexus.util.StringUtils;

import net.minecraft.data.DataGenerator;
import net.minecraft.world.item.DyeColor;
import net.minecraftforge.common.data.LanguageProvider;
import tv.mapper.embellishcraft.block.ECBlockRegistry;
import tv.mapper.embellishcraft.building.data.gen.BuildingLang;
import tv.mapper.embellishcraft.furniture.data.gen.FurnitureLang;
import tv.mapper.embellishcraft.industrial.data.gen.IndustrialLang;
import tv.mapper.embellishcraft.rocks.data.gen.RockLang;

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

        RockLang.addTranslations(this, lang);
        IndustrialLang.addTranslations(this, lang);
        BuildingLang.addTranslations(this, lang);
        FurnitureLang.addTranslations(this, lang);

        switch(lang)
        {
            default:

                name = "";

                for(int j = 0; j < Arrays.stream(DyeColor.values()).count(); j++)
                {
                    String raw[] = DyeColor.byId(j).getSerializedName().split("_");
                    if(raw[0].equals("light"))
                        name = StringUtils.capitalise(raw[0]) + " " + StringUtils.capitalise(raw[1]);
                    else
                        name = StringUtils.capitalise(raw[0]);

                    addBlock(ECBlockRegistry.TABLE_LAMP_BLOCKS.get(DyeColor.byId(j)), name + " Table Lamp");
                    addBlock(ECBlockRegistry.MANUAL_TABLE_LAMP_BLOCKS.get(DyeColor.byId(j)), name + " Table Lamp (Manual)");
                }

                add("itemGroup.embellishcraft_group", "EmbellishCraft");
                break;
            case "fr_fr":
                String frColorsF[] = {"blanche", "orange", "magenta", "bleu claire", "jaune", "vert claire", "rose", "grise", "gris claire", "cyan", "violette", "bleue", "marron", "verte", "rouge", "noire"};

                for(int j = 0; j < Arrays.stream(DyeColor.values()).count(); j++)
                {
                    addBlock(ECBlockRegistry.TABLE_LAMP_BLOCKS.get(DyeColor.byId(j)), "Lampe de chevet " + frColorsF[j]);
                    addBlock(ECBlockRegistry.MANUAL_TABLE_LAMP_BLOCKS.get(DyeColor.byId(j)), "Lampe de chevet " + frColorsF[j] + " (manuelle)");
                }

                add("itemGroup.embellishcraft_group", "EmbellishCraft");
                break;
        }
    }
}