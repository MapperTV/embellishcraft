package tv.mapper.embellishcraft.proxy;

import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import tv.mapper.embellishcraft.CustomChestTileEntity;
import tv.mapper.embellishcraft.client.renderer.CustomChestTileEntityRenderer;

public class ClientProxy implements IProxy
{
    @Override
    public void setup(FMLCommonSetupEvent event)
    {
        ClientRegistry.bindTileEntitySpecialRenderer(CustomChestTileEntity.class, new CustomChestTileEntityRenderer<>());
    }
}
