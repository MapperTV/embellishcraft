package tv.mapper.embellishcraft.data.gen;

import java.util.Arrays;

import net.minecraft.advancements.criterion.StatePropertiesPredicate;
import net.minecraft.block.Block;
import net.minecraft.block.ChestBlock;
import net.minecraft.block.DoorBlock;
import net.minecraft.block.SlabBlock;
import net.minecraft.data.DataGenerator;
import net.minecraft.loot.ConstantRange;
import net.minecraft.loot.DynamicLootEntry;
import net.minecraft.loot.ItemLootEntry;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.conditions.BlockStateProperty;
import net.minecraft.loot.functions.CopyName;
import net.minecraft.loot.functions.CopyNbt;
import net.minecraft.loot.functions.SetContents;
import net.minecraft.loot.functions.SetCount;
import net.minecraftforge.fml.RegistryObject;
import tv.mapper.embellishcraft.ECConstants;
import tv.mapper.embellishcraft.block.CrateBlock;
import tv.mapper.embellishcraft.block.CustomBedBlock;
import tv.mapper.embellishcraft.block.ECBlockRegistry;
import tv.mapper.embellishcraft.block.PlateBlock;
import tv.mapper.embellishcraft.util.RockType;
import tv.mapper.mapperbase.data.gen.BaseLootTableProvider;

public class ECLootTables extends BaseLootTableProvider
{

    public ECLootTables(DataGenerator dataGeneratorIn)
    {
        super(dataGeneratorIn);
    }

    @SuppressWarnings("unlikely-arg-type")
    @Override
    protected void addTables()
    {
        for(RegistryObject<Block> object : ECBlockRegistry.BLOCKS.getEntries())
        {
            Block block = object.get();

            if(!ECBlockRegistry.ROCK_BLOCKS.containsKey(block))
            {
                if(block instanceof SlabBlock)
                    lootTables.put(block, createSlabTable(ECConstants.MODID, block));
                else if(block instanceof CustomBedBlock)
                    lootTables.put(block, createBedTable(ECConstants.MODID, block));
                else if(block instanceof DoorBlock)
                    lootTables.put(block, createDoorTable(ECConstants.MODID, block));
                else if(block instanceof CrateBlock)
                    lootTables.put(block, createCrateTable(ECConstants.MODID, block));
                else if(block instanceof ChestBlock)
                    lootTables.put(block, createChestTable(block.getRegistryName().toString(), block));
                else if(block instanceof PlateBlock)
                    lootTables.put(block, createPlateTable(ECConstants.MODID, block));
                else
                    lootTables.put(block, createStandardTable(ECConstants.MODID, block));
            }
        }

        for(int j = 0; j < Arrays.stream(RockType.values()).count(); j++)
        {
            // Rocks
            lootTables.put(ECBlockRegistry.ROCK_BLOCKS.get(RockType.byId(j)).get(),
                createSilkTable(ECConstants.MODID, ECBlockRegistry.ROCK_BLOCKS.get(RockType.byId(j)).get(), ECBlockRegistry.ROCK_COBBLESTONES.get(RockType.byId(j)).get()));
        }
    }

    protected LootTable.Builder createPlateTable(String modid, Block block)
    {
        String name = block.getRegistryName().toString().replace(modid + ":", "");
        LootPool.Builder builder = LootPool.builder().name(name).rolls(ConstantRange.of(1)).addEntry(withExplosionDecay(block,
            ItemLootEntry.builder(block).acceptFunction(SetCount.builder(ConstantRange.of(2)).acceptCondition(
                BlockStateProperty.builder(block).fromProperties(StatePropertiesPredicate.Builder.newBuilder().withIntProp(PlateBlock.PLATES, 2)))).acceptFunction(
                    SetCount.builder(ConstantRange.of(3)).acceptCondition(
                        BlockStateProperty.builder(block).fromProperties(StatePropertiesPredicate.Builder.newBuilder().withIntProp(PlateBlock.PLATES, 3)))).acceptFunction(
                            SetCount.builder(ConstantRange.of(4)).acceptCondition(
                                BlockStateProperty.builder(block).fromProperties(StatePropertiesPredicate.Builder.newBuilder().withIntProp(PlateBlock.PLATES, 4)))).acceptFunction(
                                    SetCount.builder(ConstantRange.of(5)).acceptCondition(
                                        BlockStateProperty.builder(block).fromProperties(StatePropertiesPredicate.Builder.newBuilder().withIntProp(PlateBlock.PLATES, 5)))).acceptFunction(
                                            SetCount.builder(ConstantRange.of(6)).acceptCondition(
                                                BlockStateProperty.builder(block).fromProperties(StatePropertiesPredicate.Builder.newBuilder().withIntProp(PlateBlock.PLATES, 6)))).acceptFunction(
                                                    SetCount.builder(ConstantRange.of(7)).acceptCondition(
                                                        BlockStateProperty.builder(block).fromProperties(StatePropertiesPredicate.Builder.newBuilder().withIntProp(PlateBlock.PLATES, 7)))).acceptFunction(
                                                            SetCount.builder(ConstantRange.of(8)).acceptCondition(
                                                                BlockStateProperty.builder(block).fromProperties(StatePropertiesPredicate.Builder.newBuilder().withIntProp(PlateBlock.PLATES, 8))))));
        return LootTable.builder().addLootPool(builder);
    }

    protected LootTable.Builder createCrateTable(String modid, Block block)
    {
        String name = block.getRegistryName().toString().replace(modid + ":", "");
        LootPool.Builder builder = LootPool.builder().name(name).rolls(ConstantRange.of(1)).addEntry(ItemLootEntry.builder(block).acceptFunction(CopyName.builder(CopyName.Source.BLOCK_ENTITY)).acceptFunction(
            CopyNbt.builder(CopyNbt.Source.BLOCK_ENTITY).replaceOperation("Lock", "BlockEntityTag.Lock").replaceOperation("LootTable", "BlockEntityTag.LootTable").replaceOperation("LootTableSeed",
                "BlockEntityTag.LootTableSeed")).acceptFunction(SetContents.builderIn().addLootEntry(DynamicLootEntry.func_216162_a(CrateBlock.CONTENTS))));
        return LootTable.builder().addLootPool(builder);
    }
}