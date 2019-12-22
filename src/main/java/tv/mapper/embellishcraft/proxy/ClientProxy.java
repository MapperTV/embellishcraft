package tv.mapper.embellishcraft.proxy;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.ScreenManager;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.World;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import tv.mapper.embellishcraft.client.gui.screen.inventory.CrateScreen;
import tv.mapper.embellishcraft.client.gui.screen.inventory.VerticalChestScreen;
import tv.mapper.embellishcraft.client.renderer.CustomBedTileEntityRenderer;
import tv.mapper.embellishcraft.client.renderer.CustomChestTileEntityRenderer;
import tv.mapper.embellishcraft.client.renderer.VerticalChestTileEntityRenderer;
import tv.mapper.embellishcraft.init.ModContainers;
import tv.mapper.embellishcraft.tileentity.CustomBedTileEntity;
import tv.mapper.embellishcraft.tileentity.CustomChestTileEntity;
import tv.mapper.embellishcraft.tileentity.VerticalChestTileEntity;

public class ClientProxy implements IProxy
{
    @Override
    public void setup(FMLCommonSetupEvent event)
    {
        ClientRegistry.bindTileEntitySpecialRenderer(CustomChestTileEntity.class, new CustomChestTileEntityRenderer<>());
        ClientRegistry.bindTileEntitySpecialRenderer(VerticalChestTileEntity.class, new VerticalChestTileEntityRenderer<>());
        ClientRegistry.bindTileEntitySpecialRenderer(CustomBedTileEntity.class, new CustomBedTileEntityRenderer<>());

        ScreenManager.registerFactory(ModContainers.VERTICAL_9X1, VerticalChestScreen::new);
        ScreenManager.registerFactory(ModContainers.VERTICAL_9X2, VerticalChestScreen::new);
        ScreenManager.registerFactory(ModContainers.VERTICAL_9X3, VerticalChestScreen::new);
        ScreenManager.registerFactory(ModContainers.VERTICAL_9X4, VerticalChestScreen::new);
        ScreenManager.registerFactory(ModContainers.VERTICAL_9X5, VerticalChestScreen::new);
        ScreenManager.registerFactory(ModContainers.VERTICAL_9X6, VerticalChestScreen::new);
        ScreenManager.registerFactory(ModContainers.CRATE_4X4, CrateScreen::new);
        ScreenManager.registerFactory(ModContainers.CRATE_4X8, CrateScreen::new);
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
