package tv.mapper.embellishcraft.furniture.data;

import net.minecraft.core.HolderLookup.Provider;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import tv.mapper.embellishcraft.core.data.ECLootTables;
import tv.mapper.embellishcraft.furniture.block.InitFurnitureBlocks;

public class FurnitureLootTables extends ECLootTables
{
    public FurnitureLootTables(Provider provider, DeferredRegister.Blocks blockRegistry)
    {
        super(provider, blockRegistry);
    }

    @Override
    protected void generate()
    {
        for(DeferredHolder<Block, ? extends Block> object : InitFurnitureBlocks.FURNITURE_BLOCK_REGISTRY.getEntries())
        {
            generateLootTable(object.get());
        }
    }
}
