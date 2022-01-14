package tv.mapper.embellishcraft.rocks.world;

import java.util.ArrayList;

import tv.mapper.embellishcraft.core.config.EmbellishCraftConfig.CommonConfig;
import tv.mapper.mapperbase.world.CustomOre;
import tv.mapper.mapperbase.world.OreList;

public class ECOreList
{
    public static final CustomOre basalt = new CustomOre("basalt", ECFeatures.BASALT, CommonConfig.BASALT_GENERATION.get(), CommonConfig.BASALT_WHITELIST_MODE.get(), CommonConfig.BASALT_BIOME_LIST.get());
    public static final CustomOre slate = new CustomOre("slate", ECFeatures.SLATE, CommonConfig.SLATE_GENERATION.get(), CommonConfig.SLATE_WHITELIST_MODE.get(), CommonConfig.SLATE_BIOME_LIST.get());
    public static final CustomOre marble = new CustomOre("marble", ECFeatures.MARBLE, CommonConfig.MARBLE_GENERATION.get(), CommonConfig.MARBLE_WHITELIST_MODE.get(), CommonConfig.MARBLE_BIOME_LIST.get());
    public static final CustomOre gneiss = new CustomOre("gneiss", ECFeatures.GNEISS, CommonConfig.GNEISS_GENERATION.get(), CommonConfig.GNEISS_WHITELIST_MODE.get(), CommonConfig.GNEISS_BIOME_LIST.get());
    public static final CustomOre jade = new CustomOre("jade", ECFeatures.JADE, CommonConfig.JADE_GENERATION.get(), CommonConfig.JADE_WHITELIST_MODE.get(), CommonConfig.JADE_BIOME_LIST.get());
    public static final CustomOre larvikite = new CustomOre("larvikite", ECFeatures.LARVIKITE, CommonConfig.LARVIKITE_GENERATION.get(), CommonConfig.LARVIKITE_WHITELIST_MODE.get(), CommonConfig.LARVIKITE_BIOME_LIST.get());

    public static void initOres()
    {
        ArrayList<CustomOre> list = new ArrayList<CustomOre>();
        list.add(basalt);
        list.add(slate);
        list.add(marble);
        list.add(gneiss);
        list.add(jade);
        list.add(larvikite);

        OreList.addOre(list);
    }
}