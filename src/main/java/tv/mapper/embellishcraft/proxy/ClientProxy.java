package tv.mapper.embellishcraft.proxy;

import java.util.function.Predicate;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.ScreenManager;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.World;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import tv.mapper.embellishcraft.block.ECBlockRegistry;
import tv.mapper.embellishcraft.client.gui.screen.inventory.CrateScreen;
import tv.mapper.embellishcraft.client.gui.screen.inventory.VerticalChestScreen;
import tv.mapper.embellishcraft.client.renderer.ChairEntityRenderer;
import tv.mapper.embellishcraft.entity.ModEntities;
import tv.mapper.embellishcraft.inventory.container.ModContainers;

public class ClientProxy implements IProxy
{
    @Override
    public void setup(FMLCommonSetupEvent event)
    {
        // ClientRegistry.bindTileEntitySpecialRenderer(CustomChestTileEntity.class, new CustomChestTileEntityRenderer<>());
        // ClientRegistry.bindTileEntitySpecialRenderer(VerticalChestTileEntity.class, new VerticalChestTileEntityRenderer<>());
        // ClientRegistry.bindTileEntitySpecialRenderer(CustomBedTileEntity.class, new CustomBedTileEntityRenderer<>());

        ScreenManager.registerFactory(ModContainers.VERTICAL_9X1.get(), VerticalChestScreen::new);
        ScreenManager.registerFactory(ModContainers.VERTICAL_9X2.get(), VerticalChestScreen::new);
        ScreenManager.registerFactory(ModContainers.VERTICAL_9X3.get(), VerticalChestScreen::new);
        ScreenManager.registerFactory(ModContainers.VERTICAL_9X4.get(), VerticalChestScreen::new);
        ScreenManager.registerFactory(ModContainers.VERTICAL_9X5.get(), VerticalChestScreen::new);
        ScreenManager.registerFactory(ModContainers.VERTICAL_9X6.get(), VerticalChestScreen::new);
        ScreenManager.registerFactory(ModContainers.CRATE_4X4.get(), CrateScreen::new);
        ScreenManager.registerFactory(ModContainers.CRATE_4X8.get(), CrateScreen::new);

        RenderingRegistry.registerEntityRenderingHandler(ModEntities.TYPE_CHAIR, ChairEntityRenderer::new);

        Predicate<RenderType> cutoutPredicate = renderType -> renderType == RenderType.getCutout();

        for(RegistryObject<? extends Block> object : ECBlockRegistry.CUTOUT_BLOCKS)
            RenderTypeLookup.setRenderLayer(object.get(), cutoutPredicate);
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