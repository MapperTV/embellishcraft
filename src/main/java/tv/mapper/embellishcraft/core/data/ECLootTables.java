package tv.mapper.embellishcraft.core.data;

import java.util.Objects;

import net.minecraft.advancements.critereon.StatePropertiesPredicate;
import net.minecraft.core.HolderLookup.Provider;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DoorBlock;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import net.neoforged.neoforge.registries.DeferredRegister;
import tv.mapper.embellishcraft.core.ECConstants;
import tv.mapper.embellishcraft.furniture.block.PlateBlock;
import tv.mapper.mapperbase.api.data.loottable.BaseBlockLootSubProvider;

public class ECLootTables extends BaseBlockLootSubProvider
{

    protected ECLootTables(Provider registries, DeferredRegister.Blocks blockRegistry)
    {
        super(registries, blockRegistry);
    }

    @Override
    protected void generate()
    {}

    protected void generateLootTable(Block block)
    {
        if(block instanceof SlabBlock)
            add(block, slab -> this.createSlabItemTable(slab));
        // else if(block instanceof CustomBedBlock)
        // add(block, createBedTable(ECConstants.MODID, block));
        else if(block instanceof DoorBlock)
            add(block, createDoorTable(block));
        // else if(block instanceof CrateBlock)
        // add(block, createCrateTable(ECConstants.MODID, block));
        // else if(block instanceof ChestBlock)
        // add(block, createChestTable(Objects.requireNonNull(ForgeRegistries.BLOCKS.getKey(block)).toString(), block));
        else if(block instanceof PlateBlock)
            add(block, createPlateTable(ECConstants.MODID, block));
        else
            dropSelf(block);
    }

    protected LootTable.Builder createPlateTable(String modid, Block block)
    {
        String name = Objects.requireNonNull(BuiltInRegistries.BLOCK.getKey(block)).getPath();
        LootPool.Builder builder = LootPool.lootPool().name(name).setRolls(ConstantValue.exactly(1)).add(applyExplosionDecay(block, LootItem.lootTableItem(block).apply(SetItemCountFunction.setCount(ConstantValue.exactly(2)).when(LootItemBlockStatePropertyCondition.hasBlockStateProperties(block).setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(PlateBlock.PLATES, 2)))).apply(SetItemCountFunction.setCount(ConstantValue.exactly(3)).when(LootItemBlockStatePropertyCondition.hasBlockStateProperties(block).setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(PlateBlock.PLATES, 3)))).apply(SetItemCountFunction.setCount(ConstantValue.exactly(4)).when(LootItemBlockStatePropertyCondition.hasBlockStateProperties(block).setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(PlateBlock.PLATES, 4)))).apply(SetItemCountFunction.setCount(ConstantValue.exactly(5)).when(LootItemBlockStatePropertyCondition.hasBlockStateProperties(block).setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(PlateBlock.PLATES, 5)))).apply(SetItemCountFunction.setCount(ConstantValue.exactly(6)).when(LootItemBlockStatePropertyCondition.hasBlockStateProperties(block).setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(PlateBlock.PLATES, 6)))).apply(SetItemCountFunction.setCount(ConstantValue.exactly(7)).when(LootItemBlockStatePropertyCondition.hasBlockStateProperties(block).setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(PlateBlock.PLATES, 7)))).apply(SetItemCountFunction.setCount(ConstantValue.exactly(8)).when(LootItemBlockStatePropertyCondition.hasBlockStateProperties(block).setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(PlateBlock.PLATES, 8))))));
        return LootTable.lootTable().withPool(builder);
    }

    // protected LootTable.Builder createCrateTable(String modid, Block block)
    // {
    // String name = Objects.requireNonNull(BuiltInRegistries.BLOCK.getKey(block)).getPath();
    // LootPool.Builder builder =
    // LootPool.lootPool().name(name).setRolls(ConstantValue.exactly(1)).add(LootItem.lootTableItem(block).apply(CopyNameFunction.copyName(CopyNameFunction.NameSource.BLOCK_ENTITY)).apply(CopyNbtFunction.copyData(ContextNbtProvider.BLOCK_ENTITY).copy("Lock",
    // "BlockEntityTag.Lock").copy("LootTable", "BlockEntityTag.LootTable").copy("LootTableSeed",
    // "BlockEntityTag.LootTableSeed")).apply(SetContainerContents.setContents(ModTileEntityTypes.CRATE).withEntry(DynamicLoot.dynamicEntry(CrateBlock.CONTENTS))));
    // return LootTable.lootTable().withPool(builder);
    // }

    // @Override
    // protected Iterable<Block> getKnownBlocks()
    // {
    // EmbellishCraft.LOGGER.debug(BuiltInRegistries.BLOCK.holders().filter(e -> e.key().location().getNamespace().equals(ECConstants.MODID)).toString());
    // return BuiltInRegistries.BLOCK.holders().filter(e -> e.key().location().getNamespace().equals(ECConstants.MODID)).map(Holder.Reference::value).collect(Collectors.toList());
    // }
}
