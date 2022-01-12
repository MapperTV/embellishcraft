package tv.mapper.embellishcraft.proxy;

import java.util.function.Predicate;

import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fmllegacy.RegistryObject;
import tv.mapper.embellishcraft.client.gui.screen.inventory.CrateScreen;
import tv.mapper.embellishcraft.client.gui.screen.inventory.VerticalChestScreen;
import tv.mapper.embellishcraft.furniture.world.level.block.InitFurnitureBlocks;
import tv.mapper.embellishcraft.inventory.container.ModContainers;

public class ClientProxy implements IProxy
{
    @Override
    public void setup(FMLCommonSetupEvent event)
    {
        // ClientRegistry.bindTileEntitySpecialRenderer(CustomChestTileEntity.class, new CustomChestTileEntityRenderer<>());
        // ClientRegistry.bindTileEntitySpecialRenderer(VerticalChestTileEntity.class, new VerticalChestTileEntityRenderer<>());
        // ClientRegistry.bindTileEntitySpecialRenderer(CustomBedTileEntity.class, new CustomBedTileEntityRenderer<>());

        MenuScreens.register(ModContainers.VERTICAL_9X1.get(), VerticalChestScreen::new);
        MenuScreens.register(ModContainers.VERTICAL_9X2.get(), VerticalChestScreen::new);
        MenuScreens.register(ModContainers.VERTICAL_9X3.get(), VerticalChestScreen::new);
        MenuScreens.register(ModContainers.VERTICAL_9X4.get(), VerticalChestScreen::new);
        MenuScreens.register(ModContainers.VERTICAL_9X5.get(), VerticalChestScreen::new);
        MenuScreens.register(ModContainers.VERTICAL_9X6.get(), VerticalChestScreen::new);
        MenuScreens.register(ModContainers.CRATE_4X4.get(), CrateScreen::new);
        MenuScreens.register(ModContainers.CRATE_4X8.get(), CrateScreen::new);

        // RenderingRegistry.registerEntityRenderingHandler(ModEntities.TYPE_CHAIR, ChairEntityRenderer::new);

        Predicate<RenderType> cutoutPredicate = renderType -> renderType == RenderType.cutout();

        for(RegistryObject<? extends Block> object : InitFurnitureBlocks.CUTOUT_BLOCKS)
            ItemBlockRenderTypes.setRenderLayer(object.get(), cutoutPredicate);
    }

    // @Override
    // public Level getClientWorld()
    // {
    // return Minecraft.getInstance().level;
    // }
    //
    // @Override
    // public Player getClientPlayer()
    // {
    // return Minecraft.getInstance().player;
    // }
}