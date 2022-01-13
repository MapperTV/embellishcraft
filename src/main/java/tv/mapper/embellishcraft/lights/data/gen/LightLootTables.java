package tv.mapper.embellishcraft.lights.data.gen;

import net.minecraft.data.DataGenerator;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.fmllegacy.RegistryObject;
import tv.mapper.embellishcraft.core.data.gen.ECLootTables;
import tv.mapper.embellishcraft.lights.world.level.block.InitLightBlocks;

public class LightLootTables extends ECLootTables
{
    public LightLootTables(DataGenerator dataGeneratorIn)
    {
        super(dataGeneratorIn);
    }

    @Override
    protected void addTables()
    {
        for(RegistryObject<Block> object : InitLightBlocks.LIGHT_BLOCK_REGISTRY.getEntries())
        {
            addStandardTable(object.get());
        }
    }
}