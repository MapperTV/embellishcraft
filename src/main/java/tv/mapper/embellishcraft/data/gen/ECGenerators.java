package tv.mapper.embellishcraft.data.gen;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;
import tv.mapper.embellishcraft.ECConstants;
import tv.mapper.embellishcraft.data.gen.recipe.ECRecipes;
import tv.mapper.embellishcraft.data.gen.recipe.ECStonecutterRecipes;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ECGenerators
{
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event)
    {
        DataGenerator generator = event.getGenerator();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();

        generator.addProvider(new ECRecipes(generator));
        generator.addProvider(new ECStonecutterRecipes(generator));

        generator.addProvider(new ECLootTables(generator));
        generator.addProvider(new ECBlockStates(generator, ECConstants.MODID, existingFileHelper));
        generator.addProvider(new ECBlockModels(generator, ECConstants.MODID, existingFileHelper));
        generator.addProvider(new ECItemModels(generator, ECConstants.MODID, existingFileHelper));

        ECBlockTags blockTags = new ECBlockTags(generator, existingFileHelper);

        generator.addProvider(blockTags);
        generator.addProvider(new ECItemTags(generator, blockTags, existingFileHelper));

        generator.addProvider(new ECLang(generator, ECConstants.MODID, "en_us"));
        generator.addProvider(new ECLang(generator, ECConstants.MODID, "fr_fr"));
    }
}