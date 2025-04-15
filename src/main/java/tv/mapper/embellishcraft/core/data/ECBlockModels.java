package tv.mapper.embellishcraft.core.data;

import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import tv.mapper.mapperbase.api.data.BaseBlockModelProvider;

public class ECBlockModels extends BaseBlockModelProvider
{
    public ECBlockModels(PackOutput generator, String modid, ExistingFileHelper existingFileHelper, String name)
    {
        super(generator, modid, existingFileHelper, name);
    }

    @Override
    protected void registerModels()
    {}
}