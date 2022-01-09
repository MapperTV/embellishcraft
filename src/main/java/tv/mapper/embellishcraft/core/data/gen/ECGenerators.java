package tv.mapper.embellishcraft.core.data.gen;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;
import tv.mapper.embellishcraft.ECConstants;
import tv.mapper.embellishcraft.data.gen.ECBlockModels;
import tv.mapper.embellishcraft.data.gen.ECBlockStates;
import tv.mapper.embellishcraft.data.gen.ECBlockTags;
import tv.mapper.embellishcraft.data.gen.ECItemModels;
import tv.mapper.embellishcraft.data.gen.ECItemTags;
import tv.mapper.embellishcraft.data.gen.ECLang;
import tv.mapper.embellishcraft.data.gen.ECLootTables;
import tv.mapper.embellishcraft.data.gen.recipe.ECRecipes;
import tv.mapper.embellishcraft.data.gen.recipe.ECStonecutterRecipes;
import tv.mapper.embellishcraft.rocks.data.gen.RockBlockModels;
import tv.mapper.embellishcraft.rocks.data.gen.RockBlockStates;
import tv.mapper.embellishcraft.rocks.data.gen.RockItemModels;
import tv.mapper.embellishcraft.rocks.data.gen.RockLootTables;
import tv.mapper.embellishcraft.rocks.data.gen.recipe.RockRecipes;
import tv.mapper.embellishcraft.rocks.data.gen.recipe.RockStoneCutter;

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
        generator.addProvider(new RockRecipes(generator));
        generator.addProvider(new RockStoneCutter(generator));

        generator.addProvider(new ECLootTables(generator));
        generator.addProvider(new RockLootTables(generator));

        // Block States
        generator.addProvider(new ECBlockStates(generator, ECConstants.MODID, existingFileHelper));
        generator.addProvider(new RockBlockStates(generator, ECConstants.MODID, existingFileHelper));

        // Block Models
        generator.addProvider(new ECBlockModels(generator, ECConstants.MODID, existingFileHelper));
        generator.addProvider(new RockBlockModels(generator, ECConstants.MODID, existingFileHelper));

        // Item Models
        generator.addProvider(new ECItemModels(generator, ECConstants.MODID, existingFileHelper));
        generator.addProvider(new RockItemModels(generator, ECConstants.MODID, existingFileHelper));

        ECBlockTags blockTags = new ECBlockTags(generator, existingFileHelper);

        generator.addProvider(blockTags);
        generator.addProvider(new ECItemTags(generator, blockTags, existingFileHelper));

        // Lang
        generator.addProvider(new ECLang(generator, ECConstants.MODID, "en_us"));
        generator.addProvider(new ECLang(generator, ECConstants.MODID, "fr_fr"));
    }
}