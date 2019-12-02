package tv.mapper.embellishcraft.init;

import net.minecraft.inventory.container.ContainerType;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.common.extensions.IForgeContainerType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.ObjectHolder;
import tv.mapper.embellishcraft.Constants;
import tv.mapper.embellishcraft.EmbellishCraft;
import tv.mapper.embellishcraft.inventory.container.LockerContainer;

@ObjectHolder(Constants.MODID)
@EventBusSubscriber(bus = Bus.MOD)
public class ModContainers
{
    public static final ContainerType<LockerContainer> LOCKER = null;

    @SubscribeEvent
    public static void registerContainers(final RegistryEvent.Register<ContainerType<?>> event)
    {
        event.getRegistry().register(IForgeContainerType.create((windowId, inv, data) ->
        {
            BlockPos pos = data.readBlockPos();

            return new LockerContainer(windowId, EmbellishCraft.proxy.getClientWorld(), pos, inv, EmbellishCraft.proxy.getClientPlayer());
        }).setRegistryName("locker"));
    }
}