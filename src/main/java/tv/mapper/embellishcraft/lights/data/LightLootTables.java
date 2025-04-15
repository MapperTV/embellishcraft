package tv.mapper.embellishcraft.lights.data;

import net.minecraft.core.HolderLookup.Provider;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import tv.mapper.embellishcraft.core.data.ECLootTables;
import tv.mapper.embellishcraft.lights.block.InitLightBlocks;

public class LightLootTables extends ECLootTables
{
    public LightLootTables(Provider provider, DeferredRegister.Blocks blockRegistry)
    {
        super(provider, blockRegistry);
    }

    @Override
    protected void generate()
    {
        for(DeferredHolder<Block, ? extends Block> object : InitLightBlocks.LIGHT_BLOCK_REGISTRY.getEntries())
        {
            generateLootTable(object.get());
        }
    }
}
