package tv.mapper.embellishcraft.furniture.data.gen;

import net.minecraft.data.DataGenerator;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;
import tv.mapper.embellishcraft.core.data.gen.ECLootTables;
import tv.mapper.embellishcraft.furniture.world.level.block.InitFurnitureBlocks;

public class FurnitureLootTables extends ECLootTables
{
    public FurnitureLootTables(DataGenerator dataGeneratorIn)
    {
        super(dataGeneratorIn);
    }

    @Override
    protected void addTables()
    {
        for(RegistryObject<Block> object : InitFurnitureBlocks.FURNITURE_BLOCK_REGISTRY.getEntries())
        {
            addStandardTable(object.get());
        }
    }
}