package tv.mapper.embellishcraft.proxy;

import java.util.function.Predicate;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.ScreenManager;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.World;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import tv.mapper.embellishcraft.client.gui.screen.inventory.CrateScreen;
import tv.mapper.embellishcraft.client.gui.screen.inventory.VerticalChestScreen;
import tv.mapper.embellishcraft.client.renderer.ChairEntityRenderer;
import tv.mapper.embellishcraft.init.ModBlocks;
import tv.mapper.embellishcraft.init.ModContainers;
import tv.mapper.embellishcraft.init.ModEntities;

public class ClientProxy implements IProxy
{
    @Override
    public void setup(FMLCommonSetupEvent event)
    {
        // ClientRegistry.bindTileEntitySpecialRenderer(CustomChestTileEntity.class, new CustomChestTileEntityRenderer<>());
        // ClientRegistry.bindTileEntitySpecialRenderer(VerticalChestTileEntity.class, new VerticalChestTileEntityRenderer<>());
        // ClientRegistry.bindTileEntitySpecialRenderer(CustomBedTileEntity.class, new CustomBedTileEntityRenderer<>());

        ScreenManager.registerFactory(ModContainers.VERTICAL_9X1, VerticalChestScreen::new);
        ScreenManager.registerFactory(ModContainers.VERTICAL_9X2, VerticalChestScreen::new);
        ScreenManager.registerFactory(ModContainers.VERTICAL_9X3, VerticalChestScreen::new);
        ScreenManager.registerFactory(ModContainers.VERTICAL_9X4, VerticalChestScreen::new);
        ScreenManager.registerFactory(ModContainers.VERTICAL_9X5, VerticalChestScreen::new);
        ScreenManager.registerFactory(ModContainers.VERTICAL_9X6, VerticalChestScreen::new);
        ScreenManager.registerFactory(ModContainers.CRATE_4X4, CrateScreen::new);
        ScreenManager.registerFactory(ModContainers.CRATE_4X8, CrateScreen::new);

        RenderingRegistry.registerEntityRenderingHandler(ModEntities.TYPE_CHAIR, ChairEntityRenderer::new);

        Predicate<RenderType> cutoutPredicate = renderType -> renderType == RenderType.cutout();
        RenderTypeLookup.setRenderLayer(ModBlocks.ACACIA_TERRACE_CHAIR, cutoutPredicate);
        RenderTypeLookup.setRenderLayer(ModBlocks.OAK_TERRACE_CHAIR, cutoutPredicate);
        RenderTypeLookup.setRenderLayer(ModBlocks.BIRCH_TERRACE_CHAIR, cutoutPredicate);
        RenderTypeLookup.setRenderLayer(ModBlocks.SPRUCE_TERRACE_CHAIR, cutoutPredicate);
        RenderTypeLookup.setRenderLayer(ModBlocks.JUNGLE_TERRACE_CHAIR, cutoutPredicate);
        RenderTypeLookup.setRenderLayer(ModBlocks.DARK_OAK_TERRACE_CHAIR, cutoutPredicate);
        RenderTypeLookup.setRenderLayer(ModBlocks.ACACIA_TERRACE_TABLE, cutoutPredicate);
        RenderTypeLookup.setRenderLayer(ModBlocks.OAK_TERRACE_TABLE, cutoutPredicate);
        RenderTypeLookup.setRenderLayer(ModBlocks.BIRCH_TERRACE_TABLE, cutoutPredicate);
        RenderTypeLookup.setRenderLayer(ModBlocks.SPRUCE_TERRACE_TABLE, cutoutPredicate);
        RenderTypeLookup.setRenderLayer(ModBlocks.JUNGLE_TERRACE_TABLE, cutoutPredicate);
        RenderTypeLookup.setRenderLayer(ModBlocks.DARK_OAK_TERRACE_TABLE, cutoutPredicate);
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
