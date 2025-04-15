package tv.mapper.embellishcraft.building.data;

import net.minecraft.core.HolderLookup.Provider;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import tv.mapper.embellishcraft.building.block.InitBuildingBlocks;
import tv.mapper.embellishcraft.core.data.ECLootTables;

public class BuildingLootTables extends ECLootTables
{
    public BuildingLootTables(Provider provider, DeferredRegister.Blocks blockRegistry)
    {
        super(provider, blockRegistry);
    }

    @Override
    protected void generate()
    {
        for(DeferredHolder<Block, ? extends Block> object : InitBuildingBlocks.BUILDING_BLOCK_REGISTRY.getEntries())
        {
            generateLootTable(object.get());
        }
    }
}
