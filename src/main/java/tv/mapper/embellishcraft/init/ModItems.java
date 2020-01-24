package tv.mapper.embellishcraft.init;

import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.ObjectHolder;
import tv.mapper.embellishcraft.ECConstants;
import tv.mapper.embellishcraft.item.FlatterHammerItem;
import tv.mapper.embellishcraft.item.ModItemGroups;

@ObjectHolder(ECConstants.MODID)
@EventBusSubscriber(bus = Bus.MOD)
public class ModItems
{
    public static final Item STEEL_NUGGET = null;
    public static final Item STEEL_INGOT = null;
    public static final Item STEEL_PLATE = null;
    public static final Item STEEL_ROD = null;

    public static final Item IRON_PLATE = null;
    public static final Item IRON_ROD = null;

    public static final Item BOLT = null;

    public static final Item FLATTER_HAMMER = null;

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event)
    {
        event.getRegistry().register(new FlatterHammerItem(new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT).maxDamage(128)).setRegistryName("flatter_hammer"));

        event.getRegistry().register(new Item(new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)).setRegistryName("steel_nugget"));
        event.getRegistry().register(new Item(new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)).setRegistryName("steel_ingot"));
        event.getRegistry().register(new Item(new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)).setRegistryName("steel_plate"));
        event.getRegistry().register(new Item(new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)).setRegistryName("steel_rod"));

        event.getRegistry().register(new Item(new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)).setRegistryName("iron_plate"));
        event.getRegistry().register(new Item(new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)).setRegistryName("iron_rod"));

        event.getRegistry().register(new Item(new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT)).setRegistryName("bolt"));
    }
}
