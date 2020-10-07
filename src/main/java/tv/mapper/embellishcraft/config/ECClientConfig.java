package tv.mapper.embellishcraft.config;

import org.apache.commons.lang3.tuple.Pair;

import net.minecraftforge.common.ForgeConfigSpec;

public class ECClientConfig
{
    public static final ClientConfig CLIENT;
    public static final ForgeConfigSpec CLIENT_CONFIG;

    static
    {
        final Pair<ClientConfig, ForgeConfigSpec> specPair = new ForgeConfigSpec.Builder().configure(ClientConfig::new);

        CLIENT = specPair.getLeft();
        CLIENT_CONFIG = specPair.getRight();
    }

    public static class ClientConfig
    {
        public static ForgeConfigSpec.BooleanValue ENABLE_GEN_LOGS;

        ClientConfig(ForgeConfigSpec.Builder CLIENT_BUILDER)
        {
            CLIENT_BUILDER.comment("EmbellishCraft General Config").push("general_config");
            ENABLE_GEN_LOGS = CLIENT_BUILDER.comment("Enable the logs for worldgen, useful to check if your config file is correct. This is client-side only. [default: false]").define("EnableGenLogs",
                false);
            CLIENT_BUILDER.pop();
        }
    }
}