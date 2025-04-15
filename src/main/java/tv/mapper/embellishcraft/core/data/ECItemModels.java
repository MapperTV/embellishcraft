package tv.mapper.embellishcraft.core.data;

import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import tv.mapper.mapperbase.api.data.BaseItemModelProvider;

public class ECItemModels extends BaseItemModelProvider
{
    public ECItemModels(PackOutput output, String modid, ExistingFileHelper existingFileHelper, String name)
    {
        super(output, modid, existingFileHelper, name);
    }

    @Override
    protected void registerModels()
    {}
}
