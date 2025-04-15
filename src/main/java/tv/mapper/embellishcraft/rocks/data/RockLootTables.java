package tv.mapper.embellishcraft.rocks.data;

import java.util.Arrays;

import net.minecraft.core.HolderLookup.Provider;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import tv.mapper.embellishcraft.core.data.ECLootTables;
import tv.mapper.embellishcraft.core.util.RockType;
import tv.mapper.embellishcraft.rocks.block.InitRockBlocks;

public class RockLootTables extends ECLootTables
{
    public RockLootTables(Provider provider, DeferredRegister.Blocks blockRegistry)
    {
        super(provider, blockRegistry);
    }

    @SuppressWarnings("unlikely-arg-type")
    @Override
    protected void generate()
    {
        for(DeferredHolder<Block, ? extends Block> object : InitRockBlocks.ROCK_BLOCK_REGISTRY.getEntries())
        {
            Block block = object.get();
            if(!InitRockBlocks.ROCK_BLOCKS.containsKey(block))
            {
                generateLootTable(block);
            }
        }

        for(int j = 0; j < Arrays.stream(RockType.values()).count(); j++)
        {
            // Rocks
            Block dropBlock = InitRockBlocks.ROCK_COBBLESTONES.get(RockType.byId(j)).get();
            add(InitRockBlocks.ROCK_BLOCKS.get(RockType.byId(j)).get(), b -> createSingleItemTableWithSilkTouch(b, dropBlock));
        }
    }
}
