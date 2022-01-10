package tv.mapper.embellishcraft.industrial.data.gen;

import net.minecraft.data.DataGenerator;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.fmllegacy.RegistryObject;
import tv.mapper.embellishcraft.data.gen.ECLootTables;
import tv.mapper.embellishcraft.industrial.world.level.blocks.InitIndustrialBlocks;

public class IndustrialLootTables extends ECLootTables
{
    public IndustrialLootTables(DataGenerator dataGeneratorIn)
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