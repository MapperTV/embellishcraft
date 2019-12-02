package tv.mapper.embellishcraft.proxy;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.ScreenManager;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.World;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import tv.mapper.embellishcraft.client.gui.LockerScreen;
import tv.mapper.embellishcraft.client.renderer.CustomChestTileEntityRenderer;
import tv.mapper.embellishcraft.init.ModContainers;
import tv.mapper.embellishcraft.tileentity.CustomChestTileEntity;

public class ClientProxy implements IProxy
{
    @Override
    public void setup(FMLCommonSetupEvent event)
    {
        ClientRegistry.bindTileEntitySpecialRenderer(CustomChestTileEntity.class, new CustomChestTileEntityRenderer<>());
        ScreenManager.registerFactory(ModContainers.LOCKER, LockerScreen::new);
    }

    @Override
    public World getClientWorld()
    {
        return Minecraft.getInstance().world;
    }

    @Override
    public PlayerEntity getClientPlayer()
    {
        return Minecraft.getInstance().player;
    }
}
