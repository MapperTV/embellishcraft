package tv.mapper.embellishcraft.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class WorldgenConfig
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

    public static void init(ForgeConfigSpec.Builder SERVER_BUILDER)
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
        MARBLE_SIZE = SERVER_BUILDER.comment("Size of marble pockets [0-100, default: 25]").defineInRange("marbleSize", 20, 0, 100);
        MARBLE_CHANCE = SERVER_BUILDER.comment("Chances of marble pocket being generated [0-100, default: 10]").defineInRange("marbleChance", 10, 0, 100);
        MARBLE_MIN_HEIGHT = SERVER_BUILDER.comment("Minimal height for marble pocket generation, [0-255, default: 50]").defineInRange("marbleMinHeight", 60, 0, 255);
        MARBLE_MAX_HEIGHT = SERVER_BUILDER.comment("Maximal height for marble pocket generation [0-255, default: 100]").defineInRange("marbleMaxHeight", 100, 0, 255);

        SERVER_BUILDER.pop();
        SERVER_BUILDER.comment("Gneiss Generation").push("gneiss");

        GNEISS_GENERATION = SERVER_BUILDER.comment("Generate gneiss in the world [true / false]").define("gneissGeneration", true);
        GNEISS_SIZE = SERVER_BUILDER.comment("Size of gneiss pockets [0-100, default: 25]").defineInRange("gneissSize", 33, 0, 100);
        GNEISS_CHANCE = SERVER_BUILDER.comment("Chances of gneiss pocket being generated [0-100, default: 10]").defineInRange("gneissChance", 10, 0, 100);
        GNEISS_MIN_HEIGHT = SERVER_BUILDER.comment("Minimal height for gneiss pocket generation, [0-255, default: 50]").defineInRange("gneissMinHeight", 35, 0, 255);
        GNEISS_MAX_HEIGHT = SERVER_BUILDER.comment("Maximal height for gneiss pocket generation [0-255, default: 100]").defineInRange("gneissMaxHeight", 65, 0, 255);

        SERVER_BUILDER.pop();
    }
}
