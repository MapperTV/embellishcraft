package tv.mapper.embellishcraft.lights.data.gen;

import java.util.Arrays;

import org.codehaus.plexus.util.StringUtils;

import net.minecraft.world.item.DyeColor;
import tv.mapper.embellishcraft.core.data.gen.ECLang;
import tv.mapper.embellishcraft.lights.world.level.block.InitLightBlocks;

public class LightLang
{
    public static void addTranslations(ECLang provider, String lang)
    {
        String name;
        switch(lang)
        {
            default:
            case "en_us":
                name = "";

                for(int j = 0; j < Arrays.stream(DyeColor.values()).count(); j++)
                {
                    String raw[] = DyeColor.byId(j).getSerializedName().split("_");
                    if(raw[0].equals("light"))
                        name = StringUtils.capitalise(raw[0]) + " " + StringUtils.capitalise(raw[1]);
                    else
                        name = StringUtils.capitalise(raw[0]);

                    provider.addBlock(InitLightBlocks.TABLE_LAMP_BLOCKS.get(DyeColor.byId(j)), name + " Table Lamp");
                    provider.addBlock(InitLightBlocks.MANUAL_TABLE_LAMP_BLOCKS.get(DyeColor.byId(j)), name + " Table Lamp (Manual)");
                }

                provider.add("itemGroup.embellishcraft_light_group", "EmbellishCraft - Lights");
                break;
            case "fr_fr":
                String frColorsF[] = {"blanche", "orange", "magenta", "bleu claire", "jaune", "vert claire", "rose", "grise", "gris claire", "cyan", "violette", "bleue", "marron", "verte", "rouge", "noire"};

                for(int j = 0; j < Arrays.stream(DyeColor.values()).count(); j++)
                {
                    provider.addBlock(InitLightBlocks.TABLE_LAMP_BLOCKS.get(DyeColor.byId(j)), "Lampe de chevet " + frColorsF[j]);
                    provider.addBlock(InitLightBlocks.MANUAL_TABLE_LAMP_BLOCKS.get(DyeColor.byId(j)), "Lampe de chevet " + frColorsF[j] + " (manuelle)");
                }

                provider.add("itemGroup.embellishcraft_light_group", "EmbellishCraft - Lampes");
                break;
        }
    }
}