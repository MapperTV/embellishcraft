package tv.mapper.embellishcraft.core.data.gen;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import tv.mapper.mapperbase.data.gen.BaseBlockModels;

public class ECBlockModels extends BaseBlockModels
{
    public ECBlockModels(DataGenerator generator, String modid, ExistingFileHelper existingFileHelper)
    {
        super(generator, modid, existingFileHelper);
    }

    @Override
    public String getName()
    {
        return "EmbellishCraft Block Models";
    }

    @Override
    protected void registerModels()
    {}
}