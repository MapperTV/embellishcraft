package tv.mapper.embellishcraft.core.data.gen;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import tv.mapper.mapperbase.data.gen.BaseItemModels;

public class ECItemModels extends BaseItemModels
{
    public ECItemModels(DataGenerator generator, String modid, ExistingFileHelper existingFileHelper)
    {
        super(generator, modid, existingFileHelper);
    }

    @Override
    public String getName()
    {
        return "EmbellishCraft Item Models";
    }

    @Override
    protected void registerModels()
    {}
}