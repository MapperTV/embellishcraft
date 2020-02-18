package tv.mapper.embellishcraft.data.gen;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ExistingFileHelper;
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
    {
        registerBlockBasics("basalt", true, true, true, true, true, false);
        registerBlockBasics("slate", true, true, true, true, true, false);
        registerBlockBasics("marble", true, true, true, true, true, false);
        registerBlockBasics("gneiss", true, true, true, true, true, false);
        registerBlockBasics("jade", true, true, true, true, true, false);
        registerBlockBasics("larvikite", true, true, true, true, true, false);
        
        registerBlockBasics("basalt_cobblestone", true, true, true, true, true, false);
        registerBlockBasics("slate_cobblestone", true, true, true, true, true, false);
        registerBlockBasics("marble_cobblestone", true, true, true, true, true, false);
        registerBlockBasics("gneiss_cobblestone", true, true, true, true, true, false);
        registerBlockBasics("jade_cobblestone", true, true, true, true, true, false);
        registerBlockBasics("larvikite_cobblestone", true, true, true, true, true, false);
    }
}
