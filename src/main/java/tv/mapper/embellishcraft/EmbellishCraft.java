package tv.mapper.embellishcraft;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLDedicatedServerSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import tv.mapper.embellishcraft.block.ECBlockRegistry;
import tv.mapper.embellishcraft.building.world.item.InitBuildingItems;
import tv.mapper.embellishcraft.building.world.level.block.InitBuildingBlocks;
import tv.mapper.embellishcraft.client.renderer.ChairEntityRenderer;
import tv.mapper.embellishcraft.config.ECClientConfig;
import tv.mapper.embellishcraft.config.EmbellishCraftConfig;
import tv.mapper.embellishcraft.config.EmbellishCraftConfig.CommonConfig;
import tv.mapper.embellishcraft.entity.ModEntities;
import tv.mapper.embellishcraft.furniture.world.item.InitFurnitureItems;
import tv.mapper.embellishcraft.furniture.world.level.block.InitFurnitureBlocks;
import tv.mapper.embellishcraft.industrial.world.item.InitIndustrialItems;
import tv.mapper.embellishcraft.industrial.world.level.block.InitIndustrialBlocks;
import tv.mapper.embellishcraft.inventory.container.ModContainers;
import tv.mapper.embellishcraft.item.ECItemRegistry;
import tv.mapper.embellishcraft.network.ECNetwork;
import tv.mapper.embellishcraft.proxy.ClientProxy;
import tv.mapper.embellishcraft.proxy.IProxy;
import tv.mapper.embellishcraft.proxy.ServerProxy;
import tv.mapper.embellishcraft.rocks.world.ECFeatures;
import tv.mapper.embellishcraft.rocks.world.ECOreList;
import tv.mapper.embellishcraft.rocks.world.item.InitRockItems;
import tv.mapper.embellishcraft.rocks.world.level.block.InitRockBlocks;
import tv.mapper.embellishcraft.util.ConfigChecker;

@Mod(ECConstants.MODID)
public class EmbellishCraft
{
    public static final Logger LOGGER = LogManager.getLogger();
    public static IProxy proxy = DistExecutor.safeRunForDist(() -> ClientProxy::new, () -> ServerProxy::new);

    public EmbellishCraft()
    {
        ModLoadingContext.get().registerConfig(ModConfig.Type.CLIENT, ECClientConfig.CLIENT_CONFIG);
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, EmbellishCraftConfig.COMMON_CONFIG);

        // Register Blocks
        ECBlockRegistry.init();
        InitRockBlocks.init();
        InitIndustrialBlocks.init();
        InitBuildingBlocks.init();
        InitFurnitureBlocks.init();
        InitFurnitureBlocks.postInit();

        // Register Items
        ECItemRegistry.init();
        InitRockItems.init();
        InitIndustrialItems.init();
        InitBuildingItems.init();
        InitFurnitureItems.init();

        ModContainers.CONTAINERS.register(FMLJavaModLoadingContext.get().getModEventBus());

        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientSetup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::serverSetup);
    }

    private void setup(final FMLCommonSetupEvent event)
    {
        LOGGER.info("EmbellishCraft: setup started.");

        if(ModList.get().isLoaded("embellishcraft-bop"))
            LOGGER.info("EmbellishCraft: BoP addon detected.");

        if(!CommonConfig.ENABLE_WORLDGEN.get())
            LOGGER.info("EmbellishCraft worldgen is disabled by config.");
        else
        {
            ECOreList.initOres();
            ConfigChecker.checkConfig();
            ECFeatures.registerFeatures();
        }

        proxy.setup(event);
        ECNetwork.registerNetworkPackets();
    }

    private void clientSetup(final FMLClientSetupEvent event)
    {
        LOGGER.info("◘ EmbellishCraft client setup");
        EntityRenderers.register(ModEntities.TYPE_CHAIR, ChairEntityRenderer::new);
    }

    private void serverSetup(final FMLDedicatedServerSetupEvent event)
    {
        // LOGGER.info("EmbellishCraft server setup");
    }

    // @SubscribeEvent
    // public static void registerLayer(EntityRenderersEvent.RegisterRenderers event)
    // {
    // event.registerEntityRenderer(ModEntities.TYPE_CHAIR, ChairEntityRenderer::new);
    // }
}