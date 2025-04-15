package tv.mapper.embellishcraft.rocks.data;

import java.util.concurrent.CompletableFuture;

import net.minecraft.core.HolderLookup.Provider;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BiomeTags;
import net.neoforged.neoforge.common.Tags;
import tv.mapper.embellishcraft.core.ECConstants;
import tv.mapper.embellishcraft.core.data.ECWorldgen;
import tv.mapper.embellishcraft.core.util.RockType;
import tv.mapper.embellishcraft.rocks.block.InitRockBlocks;
import tv.mapper.mapperbase.api.data.world.BaseOre;

public class RockWorldgen extends ECWorldgen
{
    public RockWorldgen(PackOutput output, CompletableFuture<Provider> registries, String modid, String name)
    {
        super(output, registries, modid, name);
    }

    private static final BaseOre ORE_BASALT = new BaseOre("ore_basalt", ECConstants.MODID, InitRockBlocks.ROCK_BLOCKS.get(RockType.BASALT).get(), InitRockBlocks.ROCK_BLOCKS.get(RockType.BASALT).get(), BiomeTags.IS_OVERWORLD, -56, 8, 56, 1);
    private static final BaseOre ORE_SLATE = new BaseOre("ore_slate", ECConstants.MODID, InitRockBlocks.ROCK_BLOCKS.get(RockType.SLATE).get(), InitRockBlocks.ROCK_BLOCKS.get(RockType.SLATE).get(), BiomeTags.IS_OVERWORLD, 32, 192, 56, 1);
    private static final BaseOre ORE_MARBLE = new BaseOre("ore_marble", ECConstants.MODID, InitRockBlocks.ROCK_BLOCKS.get(RockType.MARBLE).get(), InitRockBlocks.ROCK_BLOCKS.get(RockType.MARBLE).get(), Tags.Biomes.IS_OVERWORLD, 80, 320, 48, 3);
    private static final BaseOre ORE_GNEISS = new BaseOre("ore_gneiss", ECConstants.MODID, InitRockBlocks.ROCK_BLOCKS.get(RockType.GNEISS).get(), InitRockBlocks.ROCK_BLOCKS.get(RockType.GNEISS).get(), BiomeTags.IS_OVERWORLD, 16, 64, 48, 1);
    private static final BaseOre ORE_JADE = new BaseOre("ore_jade", ECConstants.MODID, InitRockBlocks.ROCK_BLOCKS.get(RockType.JADE).get(), InitRockBlocks.ROCK_BLOCKS.get(RockType.JADE).get(), BiomeTags.IS_OVERWORLD, 69, 192, 20, 2);
    private static final BaseOre ORE_LARVIKITE = new BaseOre("ore_larvikite", ECConstants.MODID, InitRockBlocks.ROCK_BLOCKS.get(RockType.LARVIKITE).get(), InitRockBlocks.ROCK_BLOCKS.get(RockType.LARVIKITE).get(), Tags.Biomes.IS_COLD_OVERWORLD, 48, 72, 48, 1);

    public static void initOres()
    {
        addOre(ORE_BASALT);
        addOre(ORE_SLATE);
        addOre(ORE_MARBLE);
        addOre(ORE_GNEISS);
        addOre(ORE_JADE);
        addOre(ORE_LARVIKITE);
    }
}
