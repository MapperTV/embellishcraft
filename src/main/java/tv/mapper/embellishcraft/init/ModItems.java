package tv.mapper.embellishcraft.init;

import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.ObjectHolder;
import tv.mapper.embellishcraft.Constants;
import tv.mapper.embellishcraft.item.ModItemGroups;

@ObjectHolder(Constants.MODID)
@EventBusSubscriber(bus = Bus.MOD)
public class ModItems
{
    public static final Item STEEL_INGOT = null;

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event)
    {
        event.getRegistry().register(new Item(new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)).setRegistryName("steel_ingot"));
    }
}
