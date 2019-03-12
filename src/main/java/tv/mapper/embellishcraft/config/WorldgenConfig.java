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

    public static void init(ForgeConfigSpec.Builder SERVER_BUILDER, ForgeConfigSpec.Builder CLIENT_BUILDER)
    {
        BASALT_GENERATION = SERVER_BUILDER.comment("Generate basalt in the world [true / false]").define("worldgen.basaltGeneration", true);
        BASALT_SIZE = SERVER_BUILDER.comment("Size of basalt pockets [0-100, default: 33]").defineInRange("worldgen.basaltSize", 33, 0, 100);
        BASALT_CHANCE = SERVER_BUILDER.comment("Chances of basalt pocket being generated [0-100, default: 10]").defineInRange("worldgen.basaltChance", 10, 0, 100);
        BASALT_MIN_HEIGHT = SERVER_BUILDER.comment("Minimal height for basalt pocket generation, [0-255, default: 0]").defineInRange("worldgen.basaltMinHeight", 0, 0, 255);
        BASALT_MAX_HEIGHT = SERVER_BUILDER.comment("Maximal height for basalt pocket generation [0-255, default: 40]").defineInRange("worldgen.basaltMaxHeight", 40, 0, 255);

        SLATE_GENERATION = SERVER_BUILDER.comment("Generate slate in the world [true / false]").define("worldgen.slateGeneration", true);
        SLATE_SIZE = SERVER_BUILDER.comment("Size of slate pockets [0-100, default: 33]").defineInRange("worldgen.slateSize", 33, 0, 100);
        SLATE_CHANCE = SERVER_BUILDER.comment("Chances of slate pocket being generated [0-100, default: 10]").defineInRange("worldgen.slateChance", 10, 0, 100);
        SLATE_MIN_HEIGHT = SERVER_BUILDER.comment("Minimal height for slate pocket generation, [0-255, default: 40]").defineInRange("worldgen.slateMinHeight", 40, 0, 255);
        SLATE_MAX_HEIGHT = SERVER_BUILDER.comment("Maximal height for slate pocket generation [0-255, default: 70]").defineInRange("worldgen.slateMaxHeight", 70, 0, 255);

        MARBLE_GENERATION = SERVER_BUILDER.comment("Generate marble in the world [true / false]").define("worldgen.marbleGeneration", true);
        MARBLE_SIZE = SERVER_BUILDER.comment("Size of marble pockets [0-100, default: 25]").defineInRange("worldgen.marbleSize", 25, 0, 100);
        MARBLE_CHANCE = SERVER_BUILDER.comment("Chances of marble pocket being generated [0-100, default: 10]").defineInRange("worldgen.marbleChance", 10, 0, 100);
        MARBLE_MIN_HEIGHT = SERVER_BUILDER.comment("Minimal height for marble pocket generation, [0-255, default: 50]").defineInRange("worldgen.marbleMinHeight", 50, 0, 255);
        MARBLE_MAX_HEIGHT = SERVER_BUILDER.comment("Maximal height for marble pocket generation [0-255, default: 100]").defineInRange("worldgen.marbleMaxHeight", 100, 0, 255);
    }
}
