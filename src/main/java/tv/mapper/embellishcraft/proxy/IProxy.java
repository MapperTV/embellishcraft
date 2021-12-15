package tv.mapper.embellishcraft.proxy;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

public interface IProxy
{
    void setup(FMLCommonSetupEvent event);

    Level getClientWorld();

    Player getClientPlayer();
}