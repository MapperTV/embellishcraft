package tv.mapper.embellishcraft;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLDedicatedServerSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import tv.mapper.embellishcraft.block.ECBlockRegistry;
import tv.mapper.embellishcraft.config.EmbellishCraftConfig;
import tv.mapper.embellishcraft.item.ECItemRegistry;
import tv.mapper.embellishcraft.network.ECNetwork;
import tv.mapper.embellishcraft.proxy.ClientProxy;
import tv.mapper.embellishcraft.proxy.IProxy;
import tv.mapper.embellishcraft.proxy.ServerProxy;
import tv.mapper.embellishcraft.world.OreGenerator;

@Mod(ECConstants.MODID)
public class EmbellishCraft
{
    public static final Logger LOGGER = LogManager.getLogger();
    public static IProxy proxy = DistExecutor.safeRunForDist(() -> ClientProxy::new, () -> ServerProxy::new);

    public EmbellishCraft()
    {
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, EmbellishCraftConfig.COMMON_CONFIG);

        ECBlockRegistry.init();
        ECBlockRegistry.postInit();
        ECItemRegistry.init();

        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientSetup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::serverSetup);
    }

    private void setup(final FMLCommonSetupEvent event)
    {
        LOGGER.info("EmbellishCraft setup");

        proxy.setup(event);
        ECNetwork.registerNetworkPackets();

        OreGenerator.setupOregen();
    }

    private void clientSetup(final FMLClientSetupEvent event)
    {
        // LOGGER.info("EmbellishCraft client setup");
    }

    private void serverSetup(final FMLDedicatedServerSetupEvent event)
    {
        // LOGGER.info("EmbellishCraft server setup");
    }
}