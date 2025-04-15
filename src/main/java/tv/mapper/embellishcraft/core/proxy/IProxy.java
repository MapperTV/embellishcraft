package tv.mapper.embellishcraft.core.proxy;

import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;

public interface IProxy
{
    void setup(FMLCommonSetupEvent event);

    // Level getClientWorld();
    //
    // Player getClientPlayer();
}