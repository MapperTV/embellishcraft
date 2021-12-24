package tv.mapper.embellishcraft.proxy;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

public interface IProxy
{
    void setup(FMLCommonSetupEvent event);

    // Level getClientWorld();
    //
    // Player getClientPlayer();
}