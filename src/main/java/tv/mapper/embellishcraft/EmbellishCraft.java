package tv.mapper.embellishcraft;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.minecraft.entity.EntityType;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLDedicatedServerSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.loading.FMLPaths;
import tv.mapper.embellishcraft.config.EmbellishCraftConfig;
import tv.mapper.embellishcraft.entity.EntityChair;
import tv.mapper.embellishcraft.world.OreGenerator;

@Mod(EmbellishCraft.MODID)
public class EmbellishCraft
{
    public static final String MODID = "embellishcraft";

    public static final Logger LOGGER = LogManager.getLogger();

    // Creating chair entity for players to sit down; not sure this is good doing this here like that but it works now
    public static final EntityType<EntityChair> TYPE_CHAIR = EntityType.register(MODID + ":entity_sit", EntityType.Builder.create(EntityChair.class, EntityChair::new));

    public EmbellishCraft()
    {
        ModLoadingContext.get().registerConfig(ModConfig.Type.SERVER, EmbellishCraftConfig.SERVER_CONFIG);

        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientSetup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::serverSetup);

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
