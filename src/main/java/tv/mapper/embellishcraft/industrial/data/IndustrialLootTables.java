package tv.mapper.embellishcraft.industrial.data;

import net.minecraft.core.HolderLookup.Provider;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import tv.mapper.embellishcraft.core.data.ECLootTables;
import tv.mapper.embellishcraft.industrial.block.InitIndustrialBlocks;

public class IndustrialLootTables extends ECLootTables
{
    public IndustrialLootTables(Provider provider, DeferredRegister.Blocks blockRegistry)
    {
        super(provider, blockRegistry);
    }

    @Override
    protected void generate()
    {
        for(DeferredHolder<Block, ? extends Block> object : InitIndustrialBlocks.INDUSTRIAL_BLOCK_REGISTRY.getEntries())
        {
            generateLootTable(object.get());
        }
    }
}
