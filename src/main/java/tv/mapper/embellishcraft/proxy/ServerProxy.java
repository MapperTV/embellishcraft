package tv.mapper.embellishcraft.proxy;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

public class ServerProxy implements IProxy
{
    @Override
    public void setup(FMLCommonSetupEvent event)
    {

    }

    @Override
    public Level getClientWorld()
    {
        throw new IllegalStateException("Only run this on the client!");
    }

    @Override
    public Player getClientPlayer()
    {
        throw new IllegalStateException("Only run this on the client!");
    }
}