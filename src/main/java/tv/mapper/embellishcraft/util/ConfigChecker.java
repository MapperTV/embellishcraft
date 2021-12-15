package tv.mapper.embellishcraft.util;

import java.util.ArrayList;

import net.minecraft.world.level.biome.Biome;
import net.minecraftforge.registries.ForgeRegistries;
import tv.mapper.embellishcraft.EmbellishCraft;
import tv.mapper.embellishcraft.config.EmbellishCraftConfig.CommonConfig;

public class ConfigChecker
{
    public static void checkConfig()
    {
        // Check if config is correct
        ArrayList<String> biome_verify = new ArrayList<>();
        for(Biome biome : ForgeRegistries.BIOMES)
        {
            biome_verify.add(biome.getRegistryName().toString());
        }

        for(String name : CommonConfig.BASALT_BIOME_LIST.get())
        {
            if(!biome_verify.contains(name))
                EmbellishCraft.LOGGER.warn("Invalid biome '" + name + "' in embellishcraft-common.toml for basalt black/whitelist, please check the entries!");
        }
        for(String name : CommonConfig.SLATE_BIOME_LIST.get())
        {
            if(!biome_verify.contains(name))
                EmbellishCraft.LOGGER.warn("Invalid biome '" + name + "' in embellishcraft-common.toml for slate black/whitelist, please check the entries!");
        }
        for(String name : CommonConfig.MARBLE_BIOME_LIST.get())
        {
            if(!biome_verify.contains(name))
                EmbellishCraft.LOGGER.warn("Invalid biome '" + name + "' in embellishcraft-common.toml for marble black/whitelist, please check the entries!");
        }
        for(String name : CommonConfig.GNEISS_BIOME_LIST.get())
        {
            if(!biome_verify.contains(name))
                EmbellishCraft.LOGGER.warn("Invalid biome '" + name + "' in embellishcraft-common.toml for gneiss black/whitelist, please check the entries!");
        }
        for(String name : CommonConfig.JADE_BIOME_LIST.get())
        {
            if(!biome_verify.contains(name))
                EmbellishCraft.LOGGER.warn("Invalid biome '" + name + "' in embellishcraft-common.toml for jade black/whitelist, please check the entries!");
        }
        for(String name : CommonConfig.LARVIKITE_BIOME_LIST.get())
        {
            if(!biome_verify.contains(name))
                EmbellishCraft.LOGGER.warn("Invalid biome '" + name + "' in embellishcraft-common.toml for larvikite black/whitelist, please check the entries!");
        }
    }
}
