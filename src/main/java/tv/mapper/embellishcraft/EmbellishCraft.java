package tv.mapper.embellishcraft;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLDedicatedServerSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import tv.mapper.embellishcraft.building.world.item.InitBuildingItems;
import tv.mapper.embellishcraft.building.world.level.block.InitBuildingBlocks;
import tv.mapper.embellishcraft.core.ECConstants;
import tv.mapper.embellishcraft.core.config.ConfigChecker;
import tv.mapper.embellishcraft.core.config.ECClientConfig;
import tv.mapper.embellishcraft.core.config.EmbellishCraftConfig;
import tv.mapper.embellishcraft.core.config.EmbellishCraftConfig.CommonConfig;
import tv.mapper.embellishcraft.core.proxy.ClientProxy;
import tv.mapper.embellishcraft.core.proxy.IProxy;
import tv.mapper.embellishcraft.core.proxy.ServerProxy;
import tv.mapper.embellishcraft.furniture.world.entity.InitFurnitureEntities;
import tv.mapper.embellishcraft.furniture.world.inventory.ModContainers;
import tv.mapper.embellishcraft.furniture.world.item.InitFurnitureItems;
import tv.mapper.embellishcraft.furniture.world.level.block.InitFurnitureBlocks;
import tv.mapper.embellishcraft.industrial.world.item.InitIndustrialItems;
import tv.mapper.embellishcraft.industrial.world.level.block.InitIndustrialBlocks;
import tv.mapper.embellishcraft.lights.world.item.InitLightItems;
import tv.mapper.embellishcraft.lights.world.level.block.InitLightBlocks;
import tv.mapper.embellishcraft.rocks.world.ECOreList;
import tv.mapper.embellishcraft.rocks.world.item.InitRockItems;
import tv.mapper.embellishcraft.rocks.world.level.block.InitRockBlocks;

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
        InitRockBlocks.init();
        InitIndustrialBlocks.init();
        InitBuildingBlocks.init();
        InitFurnitureBlocks.init();
        InitFurnitureBlocks.postInit();
        InitLightBlocks.init();

        // Register Items
        InitRockItems.init();
        InitIndustrialItems.init();
        InitBuildingItems.init();
        InitFurnitureItems.init();
        InitLightItems.init();

        // Register Entities
        InitFurnitureEntities.init();

        ModContainers.CONTAINERS.register(FMLJavaModLoadingContext.get().getModEventBus());

        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientSetup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::serverSetup);
    }

    private void setup(final FMLCommonSetupEvent event)
    {
        LOGGER.info("EmbellishCraft: setup started.");

        if(ModList.get().isLoaded("embellishcraft_bop"))
            LOGGER.info("EmbellishCraft: BoP addon detected.");

        if(!CommonConfig.ENABLE_WORLDGEN.get())
            LOGGER.info("EmbellishCraft worldgen is disabled by config.");
        else
        {
            ECOreList.initOres();
            ConfigChecker.checkConfig();
        }

        proxy.setup(event);
        // ECNetwork.registerNetworkPackets();
    }

    private void clientSetup(final FMLClientSetupEvent event)
    {
        // EntityRenderers.register(ModEntities.TYPE_CHAIR, ChairEntityRenderer::new);
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