package tv.mapper.embellishcraft.rocks.data.gen;

import net.minecraft.data.DataGenerator;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.fmllegacy.RegistryObject;
import tv.mapper.embellishcraft.data.gen.ECLootTables;
import tv.mapper.embellishcraft.rocks.world.level.blocks.InitRockBlocks;

public class RockLootTables extends ECLootTables
{
    public RockLootTables(DataGenerator dataGeneratorIn)
    {
        super(dataGeneratorIn);
    }

    @SuppressWarnings("unlikely-arg-type")
    @Override
    protected void addTables()
    {
        for(RegistryObject<Block> object : InitRockBlocks.ROCK_BLOCK_REGISTRY.getEntries())
        {
            Block block = object.get();
            if(!InitRockBlocks.ROCK_BLOCKS.containsKey(block))
            {
                addStandardTable(block);
            }
        }

    }
}