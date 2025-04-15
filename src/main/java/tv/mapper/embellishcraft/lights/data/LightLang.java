package tv.mapper.embellishcraft.lights.data;

import java.util.Arrays;

import org.codehaus.plexus.util.StringUtils;

import net.minecraft.world.item.DyeColor;
import tv.mapper.embellishcraft.core.ECConstants;
import tv.mapper.embellishcraft.core.data.ECLang;
import tv.mapper.embellishcraft.lights.block.InitLightBlocks;

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

                    provider.add(InitLightBlocks.TABLE_LAMP_BLOCKS.get(DyeColor.byId(j)).get(), name + " Table Lamp");
                    provider.add(InitLightBlocks.MANUAL_TABLE_LAMP_BLOCKS.get(DyeColor.byId(j)).get(), name + " Table Lamp (Manual)");
                }

                provider.add("itemGroup.embellishcraft_light_group", "EmbellishCraft - Lights");
                break;
            case "fr_fr":
                for(int j = 0; j < Arrays.stream(DyeColor.values()).count(); j++)
                {
                    provider.add(InitLightBlocks.TABLE_LAMP_BLOCKS.get(DyeColor.byId(j)).get(), "Lampe de chevet " + ECConstants.frColorsF[j]);
                    provider.add(InitLightBlocks.MANUAL_TABLE_LAMP_BLOCKS.get(DyeColor.byId(j)).get(), "Lampe de chevet " + ECConstants.frColorsF[j] + " (manuelle)");
                }

                provider.add("itemGroup.embellishcraft_light_group", "EmbellishCraft - Lampes");
                break;
        }
    }
}
