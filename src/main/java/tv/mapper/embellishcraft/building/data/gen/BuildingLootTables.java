package tv.mapper.embellishcraft.building.data.gen;

import net.minecraft.data.DataGenerator;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;
import tv.mapper.embellishcraft.core.data.gen.ECLootTables;
import tv.mapper.embellishcraft.industrial.world.level.block.InitIndustrialBlocks;

public class BuildingLootTables extends ECLootTables
{
    public BuildingLootTables(DataGenerator dataGeneratorIn)
    {
        super(dataGeneratorIn);
    }

    @Override
    protected void addTables()
    {
        for(RegistryObject<Block> object : InitIndustrialBlocks.INDUSTRIAL_BLOCK_REGISTRY.getEntries())
        {
            addStandardTable(object.get());
        }
    }
}