package tv.mapper.embellishcraft.data.gen;

import java.util.Collections;

import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourcePackType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.generators.ExistingFileHelper;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;
import tv.mapper.embellishcraft.ECConstants;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ECGenerators
{
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event)
    {
        DataGenerator generator = event.getGenerator();
        ExistingFileHelper delegate = event.getExistingFileHelper();

        ExistingFileHelper helper = new ExistingFileHelper(Collections.emptyList(), true)
        {
            @Override
            public boolean exists(ResourceLocation loc, ResourcePackType type, String pathSuffix, String pathPrefix)
            {
                if(loc.getNamespace() == "mapperbase")
                {
                    return true;
                }
                return delegate.exists(loc, type, pathSuffix, pathPrefix);
            }
        };

        generator.addProvider(new ECRecipes(generator));
        generator.addProvider(new ECLootTables(generator));
        generator.addProvider(new ECBlockStates(generator, ECConstants.MODID, helper));
        generator.addProvider(new ECBlockModels(generator, ECConstants.MODID, helper));
        generator.addProvider(new ECItemModels(generator, ECConstants.MODID, helper));

        generator.addProvider(new ECBlockTags(generator));
        generator.addProvider(new ECItemTags(generator));

        generator.addProvider(new ECLang(generator, ECConstants.MODID, "en_us"));
        generator.addProvider(new ECLang(generator, ECConstants.MODID, "fr_fr"));
    }
}