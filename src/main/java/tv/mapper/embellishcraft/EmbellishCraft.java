package tv.mapper.embellishcraft;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLDedicatedServerSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.loading.FMLPaths;
import tv.mapper.embellishcraft.config.EmbellishCraftConfig;
import tv.mapper.embellishcraft.world.OreGenerator;

@Mod(EmbellishCraft.MODID)
public class EmbellishCraft
{
    public static final String MODID = "embellishcraft";

    public static final Logger LOGGER = LogManager.getLogger();

    public EmbellishCraft()
    {
        ModLoadingContext.get().registerConfig(ModConfig.Type.CLIENT, EmbellishCraftConfig.CLIENT_CONFIG);
        ModLoadingContext.get().registerConfig(ModConfig.Type.SERVER, EmbellishCraftConfig.SERVER_CONFIG);

        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientSetup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::serverSetup);

        EmbellishCraftConfig.loadConfig(EmbellishCraftConfig.CLIENT_CONFIG, FMLPaths.CONFIGDIR.get().resolve("embellishcraft-client.toml"));
        EmbellishCraftConfig.loadConfig(EmbellishCraftConfig.SERVER_CONFIG, FMLPaths.CONFIGDIR.get().resolve("embellishcraft-server.toml"));
    }

    private void setup(final FMLCommonSetupEvent event)
    {
        LOGGER.info("EmbellishCraft setup");

        OreGenerator.setupOregen();
    }

    private void clientSetup(final FMLClientSetupEvent event)
    {
        LOGGER.info("EmbellishCraft client setup");
    }

    private void serverSetup(final FMLDedicatedServerSetupEvent event)
    {
        LOGGER.info("EmbellishCraft server setup");
    }
}
