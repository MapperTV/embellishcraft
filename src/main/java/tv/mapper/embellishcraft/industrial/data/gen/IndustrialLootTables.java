package tv.mapper.embellishcraft.industrial.data.gen;

import net.minecraft.data.DataGenerator;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;
import tv.mapper.embellishcraft.building.world.level.block.InitBuildingBlocks;
import tv.mapper.embellishcraft.core.data.gen.ECLootTables;

public class IndustrialLootTables extends ECLootTables
{
    public IndustrialLootTables(DataGenerator dataGeneratorIn)
    {
        super(dataGeneratorIn);
    }

    @Override
    protected void addTables()
    {
        for(RegistryObject<Block> object : InitBuildingBlocks.BUILDING_BLOCK_REGISTRY.getEntries())
        {
            addStandardTable(object.get());
        }
    }
}