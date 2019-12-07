package tv.mapper.embellishcraft.config;

import org.apache.commons.lang3.tuple.Pair;

import net.minecraftforge.common.ForgeConfigSpec;

public class EmbellishCraftConfig
{
    public static final ServerConfig SERVER;
    public static final ForgeConfigSpec SERVER_CONFIG;

    static
    {
        final Pair<ServerConfig, ForgeConfigSpec> specPair = new ForgeConfigSpec.Builder().configure(ServerConfig::new);

        SERVER = specPair.getLeft();
        SERVER_CONFIG = specPair.getRight();
    }

    public static class ServerConfig
    {
        public static ForgeConfigSpec.BooleanValue BASALT_GENERATION;
        public static ForgeConfigSpec.IntValue BASALT_CHANCE;
        public static ForgeConfigSpec.IntValue BASALT_SIZE;
        public static ForgeConfigSpec.IntValue BASALT_MIN_HEIGHT;
        public static ForgeConfigSpec.IntValue BASALT_MAX_HEIGHT;

        public static ForgeConfigSpec.BooleanValue SLATE_GENERATION;
        public static ForgeConfigSpec.IntValue SLATE_CHANCE;
        public static ForgeConfigSpec.IntValue SLATE_SIZE;
        public static ForgeConfigSpec.IntValue SLATE_MIN_HEIGHT;
        public static ForgeConfigSpec.IntValue SLATE_MAX_HEIGHT;

        public static ForgeConfigSpec.BooleanValue MARBLE_GENERATION;
        public static ForgeConfigSpec.IntValue MARBLE_CHANCE;
        public static ForgeConfigSpec.IntValue MARBLE_SIZE;
        public static ForgeConfigSpec.IntValue MARBLE_MIN_HEIGHT;
        public static ForgeConfigSpec.IntValue MARBLE_MAX_HEIGHT;

        public static ForgeConfigSpec.BooleanValue GNEISS_GENERATION;
        public static ForgeConfigSpec.IntValue GNEISS_CHANCE;
        public static ForgeConfigSpec.IntValue GNEISS_SIZE;
        public static ForgeConfigSpec.IntValue GNEISS_MIN_HEIGHT;
        public static ForgeConfigSpec.IntValue GNEISS_MAX_HEIGHT;

        public static ForgeConfigSpec.BooleanValue JADE_GENERATION;
        public static ForgeConfigSpec.IntValue JADE_CHANCE;
        public static ForgeConfigSpec.IntValue JADE_SIZE;
        public static ForgeConfigSpec.IntValue JADE_MIN_HEIGHT;
        public static ForgeConfigSpec.IntValue JADE_MAX_HEIGHT;

        public static ForgeConfigSpec.BooleanValue LARVIKITE_GENERATION;
        public static ForgeConfigSpec.IntValue LARVIKITE_CHANCE;
        public static ForgeConfigSpec.IntValue LARVIKITE_SIZE;
        public static ForgeConfigSpec.IntValue LARVIKITE_MIN_HEIGHT;
        public static ForgeConfigSpec.IntValue LARVIKITE_MAX_HEIGHT;

        ServerConfig(ForgeConfigSpec.Builder SERVER_BUILDER)
        {
            SERVER_BUILDER.comment("Basalt Generation").push("basalt");

            BASALT_GENERATION = SERVER_BUILDER.comment("Generate basalt in the world [true / false]").define("basaltGeneration", true);
            BASALT_SIZE = SERVER_BUILDER.comment("Size of basalt pockets [0-100, default: 33]").defineInRange("basaltSize", 33, 0, 100);
            BASALT_CHANCE = SERVER_BUILDER.comment("Chances of basalt pocket being generated [0-100, default: 10]").defineInRange("basaltChance", 10, 0, 100);
            BASALT_MIN_HEIGHT = SERVER_BUILDER.comment("Minimal height for basalt pocket generation, [0-255, default: 0]").defineInRange("basaltMinHeight", 0, 0, 255);
            BASALT_MAX_HEIGHT = SERVER_BUILDER.comment("Maximal height for basalt pocket generation [0-255, default: 40]").defineInRange("basaltMaxHeight", 30, 0, 255);

            SERVER_BUILDER.pop();
            SERVER_BUILDER.comment("Slate Generation").push("slate");

            SLATE_GENERATION = SERVER_BUILDER.comment("Generate slate in the world [true / false]").define("slateGeneration", true);
            SLATE_SIZE = SERVER_BUILDER.comment("Size of slate pockets [0-100, default: 33]").defineInRange("slateSize", 33, 0, 100);
            SLATE_CHANCE = SERVER_BUILDER.comment("Chances of slate pocket being generated [0-100, default: 10]").defineInRange("slateChance", 10, 0, 100);
            SLATE_MIN_HEIGHT = SERVER_BUILDER.comment("Minimal height for slate pocket generation, [0-255, default: 40]").defineInRange("slateMinHeight", 45, 0, 255);
            SLATE_MAX_HEIGHT = SERVER_BUILDER.comment("Maximal height for slate pocket generation [0-255, default: 70]").defineInRange("slateMaxHeight", 75, 0, 255);

            SERVER_BUILDER.pop();
            SERVER_BUILDER.comment("Marble Generation").push("marble");

            MARBLE_GENERATION = SERVER_BUILDER.comment("Generate marble in the world [true / false]").define("marbleGeneration", true);
            MARBLE_SIZE = SERVER_BUILDER.comment("Size of marble pockets [0-100, default: 20]").defineInRange("marbleSize", 20, 0, 100);
            MARBLE_CHANCE = SERVER_BUILDER.comment("Chances of marble pocket being generated [0-100, default: 10]").defineInRange("marbleChance", 10, 0, 100);
            MARBLE_MIN_HEIGHT = SERVER_BUILDER.comment("Minimal height for marble pocket generation, [0-255, default: 50]").defineInRange("marbleMinHeight", 60, 0, 255);
            MARBLE_MAX_HEIGHT = SERVER_BUILDER.comment("Maximal height for marble pocket generation [0-255, default: 100]").defineInRange("marbleMaxHeight", 120, 0, 255);

            SERVER_BUILDER.pop();
            SERVER_BUILDER.comment("Gneiss Generation").push("gneiss");

            GNEISS_GENERATION = SERVER_BUILDER.comment("Generate gneiss in the world [true / false]").define("gneissGeneration", true);
            GNEISS_SIZE = SERVER_BUILDER.comment("Size of gneiss pockets [0-100, default: 33]").defineInRange("gneissSize", 33, 0, 100);
            GNEISS_CHANCE = SERVER_BUILDER.comment("Chances of gneiss pocket being generated [0-100, default: 10]").defineInRange("gneissChance", 10, 0, 100);
            GNEISS_MIN_HEIGHT = SERVER_BUILDER.comment("Minimal height for gneiss pocket generation, [0-255, default: 50]").defineInRange("gneissMinHeight", 35, 0, 255);
            GNEISS_MAX_HEIGHT = SERVER_BUILDER.comment("Maximal height for gneiss pocket generation [0-255, default: 100]").defineInRange("gneissMaxHeight", 65, 0, 255);

            SERVER_BUILDER.pop();
            SERVER_BUILDER.comment("Jade Generation").push("jade");

            JADE_GENERATION = SERVER_BUILDER.comment("Generate jade in the world [true / false]").define("jadeGeneration", true);
            JADE_SIZE = SERVER_BUILDER.comment("Size of jade pockets [0-100, default: 15]").defineInRange("jadeSize", 15, 0, 100);
            JADE_CHANCE = SERVER_BUILDER.comment("Chances of jade pocket being generated [0-100, default: 5]").defineInRange("jadeChance", 5, 0, 100);
            JADE_MIN_HEIGHT = SERVER_BUILDER.comment("Minimal height for jade pocket generation, [0-255, default: 50]").defineInRange("jadeMinHeight", 50, 0, 255);
            JADE_MAX_HEIGHT = SERVER_BUILDER.comment("Maximal height for jade pocket generation [0-255, default: 100]").defineInRange("jadeMaxHeight", 120, 0, 255);

            SERVER_BUILDER.pop();
            SERVER_BUILDER.comment("Larvikite Generation").push("larvikite");

            LARVIKITE_GENERATION = SERVER_BUILDER.comment("Generate larvikite in the world [true / false]").define("larvikiteGeneration", true);
            LARVIKITE_SIZE = SERVER_BUILDER.comment("Size of larvikite pockets [0-100, default: 15]").defineInRange("larvikiteSize", 20, 0, 100);
            LARVIKITE_CHANCE = SERVER_BUILDER.comment("Chances of larvikite pocket being generated [0-100, default: 5]").defineInRange("larvikiteChance", 10, 0, 100);
            LARVIKITE_MIN_HEIGHT = SERVER_BUILDER.comment("Minimal height for larvikite pocket generation, [0-255, default: 50]").defineInRange("larvikiteMinHeight", 32, 0, 255);
            LARVIKITE_MAX_HEIGHT = SERVER_BUILDER.comment("Maximal height for larvikite pocket generation [0-255, default: 100]").defineInRange("larvikiteMaxHeight", 72, 0, 255);

            SERVER_BUILDER.pop();
        }
    }
}
