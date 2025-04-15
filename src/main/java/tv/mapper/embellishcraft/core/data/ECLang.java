package tv.mapper.embellishcraft.core.data;

import net.minecraft.data.PackOutput;
import tv.mapper.embellishcraft.building.data.BuildingLang;
import tv.mapper.embellishcraft.furniture.data.FurnitureLang;
import tv.mapper.embellishcraft.industrial.data.IndustrialLang;
import tv.mapper.embellishcraft.lights.data.LightLang;
import tv.mapper.embellishcraft.rocks.data.RockLang;
import tv.mapper.mapperbase.api.data.BaseLanguageProvider;

public class ECLang extends BaseLanguageProvider
{
    private String lang;

    public ECLang(PackOutput output, String modid, String locale, String name)
    {
        super(output, modid, locale, name);
        this.lang = locale;
    }

    @Override
    protected void addTranslations()
    {
        BuildingLang.addTranslations(this, lang);
        FurnitureLang.addTranslations(this, lang);
        IndustrialLang.addTranslations(this, lang);
        LightLang.addTranslations(this, lang);
        RockLang.addTranslations(this, lang);
    }
}
