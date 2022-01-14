package tv.mapper.embellishcraft.rocks.data.gen;

import java.util.Arrays;

import net.minecraft.data.DataGenerator;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.fmllegacy.RegistryObject;
import tv.mapper.embellishcraft.core.ECConstants;
import tv.mapper.embellishcraft.core.data.gen.ECLootTables;
import tv.mapper.embellishcraft.core.util.RockType;
import tv.mapper.embellishcraft.rocks.world.level.block.InitRockBlocks;

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

        for(int j = 0; j < Arrays.stream(RockType.values()).count(); j++)
        {
            // Rocks
            lootTables.put(InitRockBlocks.ROCK_BLOCKS.get(RockType.byId(j)).get(), createSilkTable(ECConstants.MODID, InitRockBlocks.ROCK_BLOCKS.get(RockType.byId(j)).get(), InitRockBlocks.ROCK_COBBLESTONES.get(RockType.byId(j)).get()));
        }
    }
}