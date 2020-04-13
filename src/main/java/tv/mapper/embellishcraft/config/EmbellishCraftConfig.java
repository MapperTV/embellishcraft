package tv.mapper.embellishcraft.config;

import java.util.ArrayList;

import org.apache.commons.lang3.tuple.Pair;

import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.common.ForgeConfigSpec.ConfigValue;

public class EmbellishCraftConfig
{
    public static final CommonConfig COMMON;
    public static final ForgeConfigSpec COMMON_CONFIG;

    static
    {
        final Pair<CommonConfig, ForgeConfigSpec> specPair = new ForgeConfigSpec.Builder().configure(CommonConfig::new);

        COMMON = specPair.getLeft();
        COMMON_CONFIG = specPair.getRight();
    }

    public static class CommonConfig
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

        public static ForgeConfigSpec.BooleanValue BASALT_LIST_MODE;
        public static ForgeConfigSpec.BooleanValue SLATE_LIST_MODE;
        public static ForgeConfigSpec.BooleanValue MARBLE_LIST_MODE;
        public static ForgeConfigSpec.BooleanValue GNEISS_LIST_MODE;
        public static ForgeConfigSpec.BooleanValue JADE_LIST_MODE;
        public static ForgeConfigSpec.BooleanValue LARVIKITE_LIST_MODE;
        public static ConfigValue<ArrayList<String>> BASALT_BIOME_LIST;
        public static ConfigValue<ArrayList<String>> SLATE_BIOME_LIST;
        public static ConfigValue<ArrayList<String>> MARBLE_BIOME_LIST;
        public static ConfigValue<ArrayList<String>> GNEISS_BIOME_LIST;
        public static ConfigValue<ArrayList<String>> JADE_BIOME_LIST;
        public static ConfigValue<ArrayList<String>> LARVIKITE_BIOME_LIST;

        private static ArrayList<String> default_biomes = new ArrayList<>();

        CommonConfig(ForgeConfigSpec.Builder COMMON_BUILDER)
        {
            default_biomes.add("minecraft:nether");
            default_biomes.add("minecraft:the_end");

            COMMON_BUILDER.comment("Basalt Generation").push("basalt");

            BASALT_GENERATION = COMMON_BUILDER.comment("Generate basalt in the world [true / false]").define("basaltGeneration", true);
            BASALT_SIZE = COMMON_BUILDER.comment("Size of basalt pockets [0-100, default: 33]").defineInRange("basaltSize", 33, 0, 100);
            BASALT_CHANCE = COMMON_BUILDER.comment("Chances of basalt pocket being generated [0-100, default: 10]").defineInRange("basaltChance", 10, 0, 100);
            BASALT_MIN_HEIGHT = COMMON_BUILDER.comment("Minimal height for basalt pocket generation, [0-255, default: 0]").defineInRange("basaltMinHeight", 0, 0, 255);
            BASALT_MAX_HEIGHT = COMMON_BUILDER.comment("Maximal height for basalt pocket generation [0-255, default: 40]").defineInRange("basaltMaxHeight", 30, 0, 255);

            COMMON_BUILDER.pop();
            COMMON_BUILDER.comment("Slate Generation").push("slate");

            SLATE_GENERATION = COMMON_BUILDER.comment("Generate slate in the world [true / false]").define("slateGeneration", true);
            SLATE_SIZE = COMMON_BUILDER.comment("Size of slate pockets [0-100, default: 33]").defineInRange("slateSize", 33, 0, 100);
            SLATE_CHANCE = COMMON_BUILDER.comment("Chances of slate pocket being generated [0-100, default: 10]").defineInRange("slateChance", 10, 0, 100);
            SLATE_MIN_HEIGHT = COMMON_BUILDER.comment("Minimal height for slate pocket generation, [0-255, default: 40]").defineInRange("slateMinHeight", 45, 0, 255);
            SLATE_MAX_HEIGHT = COMMON_BUILDER.comment("Maximal height for slate pocket generation [0-255, default: 70]").defineInRange("slateMaxHeight", 75, 0, 255);

            COMMON_BUILDER.pop();
            COMMON_BUILDER.comment("Marble Generation").push("marble");

            MARBLE_GENERATION = COMMON_BUILDER.comment("Generate marble in the world [true / false]").define("marbleGeneration", true);
            MARBLE_SIZE = COMMON_BUILDER.comment("Size of marble pockets [0-100, default: 20]").defineInRange("marbleSize", 20, 0, 100);
            MARBLE_CHANCE = COMMON_BUILDER.comment("Chances of marble pocket being generated [0-100, default: 10]").defineInRange("marbleChance", 10, 0, 100);
            MARBLE_MIN_HEIGHT = COMMON_BUILDER.comment("Minimal height for marble pocket generation, [0-255, default: 50]").defineInRange("marbleMinHeight", 60, 0, 255);
            MARBLE_MAX_HEIGHT = COMMON_BUILDER.comment("Maximal height for marble pocket generation [0-255, default: 100]").defineInRange("marbleMaxHeight", 120, 0, 255);

            COMMON_BUILDER.pop();
            COMMON_BUILDER.comment("Gneiss Generation").push("gneiss");

            GNEISS_GENERATION = COMMON_BUILDER.comment("Generate gneiss in the world [true / false]").define("gneissGeneration", true);
            GNEISS_SIZE = COMMON_BUILDER.comment("Size of gneiss pockets [0-100, default: 33]").defineInRange("gneissSize", 33, 0, 100);
            GNEISS_CHANCE = COMMON_BUILDER.comment("Chances of gneiss pocket being generated [0-100, default: 10]").defineInRange("gneissChance", 10, 0, 100);
            GNEISS_MIN_HEIGHT = COMMON_BUILDER.comment("Minimal height for gneiss pocket generation, [0-255, default: 50]").defineInRange("gneissMinHeight", 35, 0, 255);
            GNEISS_MAX_HEIGHT = COMMON_BUILDER.comment("Maximal height for gneiss pocket generation [0-255, default: 100]").defineInRange("gneissMaxHeight", 65, 0, 255);

            COMMON_BUILDER.pop();
            COMMON_BUILDER.comment("Jade Generation").push("jade");

            JADE_GENERATION = COMMON_BUILDER.comment("Generate jade in the world [true / false]").define("jadeGeneration", true);
            JADE_SIZE = COMMON_BUILDER.comment("Size of jade pockets [0-100, default: 15]").defineInRange("jadeSize", 15, 0, 100);
            JADE_CHANCE = COMMON_BUILDER.comment("Chances of jade pocket being generated [0-100, default: 5]").defineInRange("jadeChance", 5, 0, 100);
            JADE_MIN_HEIGHT = COMMON_BUILDER.comment("Minimal height for jade pocket generation, [0-255, default: 50]").defineInRange("jadeMinHeight", 50, 0, 255);
            JADE_MAX_HEIGHT = COMMON_BUILDER.comment("Maximal height for jade pocket generation [0-255, default: 100]").defineInRange("jadeMaxHeight", 120, 0, 255);

            COMMON_BUILDER.pop();
            COMMON_BUILDER.comment("Larvikite Generation").push("larvikite");

            LARVIKITE_GENERATION = COMMON_BUILDER.comment("Generate larvikite in the world [true / false]").define("larvikiteGeneration", true);
            LARVIKITE_SIZE = COMMON_BUILDER.comment("Size of larvikite pockets [0-100, default: 15]").defineInRange("larvikiteSize", 20, 0, 100);
            LARVIKITE_CHANCE = COMMON_BUILDER.comment("Chances of larvikite pocket being generated [0-100, default: 5]").defineInRange("larvikiteChance", 10, 0, 100);
            LARVIKITE_MIN_HEIGHT = COMMON_BUILDER.comment("Minimal height for larvikite pocket generation, [0-255, default: 50]").defineInRange("larvikiteMinHeight", 32, 0, 255);
            LARVIKITE_MAX_HEIGHT = COMMON_BUILDER.comment("Maximal height for larvikite pocket generation [0-255, default: 100]").defineInRange("larvikiteMaxHeight", 72, 0, 255);

            COMMON_BUILDER.pop();
            COMMON_BUILDER.comment(
                "Biome Blacklist: list here the biomes you do not want a rock to be generated in (syntax: \"modid:biome\". Examples: \"minecraft:plains\", \"biomesoplenty:meadow\"...). Note: you can replace the default values, rocks only generate where stone is. They never generate in the Nether or the End.").push(
                    "blacklist");

            BASALT_LIST_MODE = COMMON_BUILDER.comment("Set to true to switch basalt blacklist to whitelist mode [true / false]").define("basaltWhitelist", false);
            BASALT_BIOME_LIST = COMMON_BUILDER.comment("List of blacklisted biomes for basalt generation").define("basaltBiomeBlacklist", default_biomes);
            SLATE_LIST_MODE = COMMON_BUILDER.comment("Set to true to switch slate blacklist to whitelist mode [true / false]").define("slateWhitelist", false);
            SLATE_BIOME_LIST = COMMON_BUILDER.comment("List of blacklisted biomes for slate generation").define("slateBiomeBlacklist", default_biomes);
            MARBLE_LIST_MODE = COMMON_BUILDER.comment("Set to true to switch marble blacklist to whitelist mode [true / false]").define("marbleWhitelist", false);
            MARBLE_BIOME_LIST = COMMON_BUILDER.comment("List of blacklisted biomes for marble generation").define("marbleBiomeBlacklist", default_biomes);
            GNEISS_LIST_MODE = COMMON_BUILDER.comment("Set to true to switch gneiss blacklist to whitelist mode [true / false]").define("gneissWhitelist", false);
            GNEISS_BIOME_LIST = COMMON_BUILDER.comment("List of blacklisted biomes for gneiss generation").define("gneissBiomeBlacklist", default_biomes);
            JADE_LIST_MODE = COMMON_BUILDER.comment("Set to true to switch jade blacklist to whitelist mode [true / false]").define("jadeWhitelist", false);
            JADE_BIOME_LIST = COMMON_BUILDER.comment("List of blacklisted biomes for jade generation").define("jadeBiomeBlacklist", default_biomes);
            LARVIKITE_LIST_MODE = COMMON_BUILDER.comment("Set to true to switch larvikite blacklist to whitelist mode [true / false]").define("larvikiteWhitelist", false);
            LARVIKITE_BIOME_LIST = COMMON_BUILDER.comment("List of blacklisted biomes for larvikite generation").define("larvikiteBiomeBlacklist", default_biomes);

            COMMON_BUILDER.pop();
        }
    }
}