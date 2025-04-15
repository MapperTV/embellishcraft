package tv.mapper.embellishcraft.core.data.recipes;

import java.util.concurrent.CompletableFuture;

import net.minecraft.core.HolderLookup.Provider;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.common.data.internal.NeoForgeDataMapsProvider;
import net.neoforged.neoforge.registries.datamaps.builtin.FurnaceFuel;
import net.neoforged.neoforge.registries.datamaps.builtin.NeoForgeDataMaps;
import tv.mapper.embellishcraft.building.block.InitBuildingBlocks;
import tv.mapper.embellishcraft.core.ECConstants;
import tv.mapper.embellishcraft.core.util.McWoods;
import tv.mapper.embellishcraft.furniture.block.InitFurnitureBlocks;

public class ECFurnaceFuels extends NeoForgeDataMapsProvider
{

    public ECFurnaceFuels(PackOutput packOutput, CompletableFuture<Provider> lookupProvider)
    {
        super(packOutput, lookupProvider);
    }

    @SuppressWarnings("deprecation")
    @Override
    protected void gather()
    {
        final Builder<FurnaceFuel, Item> fuels = builder(NeoForgeDataMaps.FURNACE_FUELS);

        for(int j = 0; j < McWoods.values().length; j++)
        {
            fuels.add(InitBuildingBlocks.SUSPENDED_STAIRS_BLOCKS.get(McWoods.byId(j)).get().asItem().builtInRegistryHolder(), ECConstants.suspendedStairBurnTime, false);
            fuels.add(InitBuildingBlocks.LARGE_SUSPENDED_STAIRS_BLOCKS.get(McWoods.byId(j)).get().asItem().builtInRegistryHolder(), ECConstants.largeSuspendedStairBurnTime, false);
            fuels.add(InitBuildingBlocks.FANCY_DOOR_BLOCKS.get(McWoods.byId(j)).get().asItem().builtInRegistryHolder(), ECConstants.doorBurnTime, false);
            fuels.add(InitBuildingBlocks.PLAIN_DOOR_BLOCKS.get(McWoods.byId(j)).get().asItem().builtInRegistryHolder(), ECConstants.doorBurnTime, false);

            fuels.add(InitFurnitureBlocks.CHAIR_BLOCKS.get(McWoods.byId(j)).get().asItem().builtInRegistryHolder(), ECConstants.chairBurnTime, false);
            fuels.add(InitFurnitureBlocks.TERRACE_CHAIR_BLOCKS.get(McWoods.byId(j)).get().asItem().builtInRegistryHolder(), ECConstants.chairBurnTime, false);
            fuels.add(InitFurnitureBlocks.TABLE_BLOCKS.get(McWoods.byId(j)).get().asItem().builtInRegistryHolder(), ECConstants.chairBurnTime, false);
            fuels.add(InitFurnitureBlocks.STURDY_TABLE_BLOCKS.get(McWoods.byId(j)).get().asItem().builtInRegistryHolder(), ECConstants.couchBurnTime, false);
            fuels.add(InitFurnitureBlocks.TERRACE_TABLE_BLOCKS.get(McWoods.byId(j)).get().asItem().builtInRegistryHolder(), ECConstants.chairBurnTime, false);
        }

        for(int j = 0; j < DyeColor.values().length; j++)
        {
            fuels.add(InitFurnitureBlocks.COUCH_BLOCKS.get(DyeColor.byId(j)).get().asItem().builtInRegistryHolder(), ECConstants.couchBurnTime, false);
            fuels.add(InitFurnitureBlocks.PILLOW_BLOCKS.get(DyeColor.byId(j)).get().asItem().builtInRegistryHolder(), ECConstants.doorBurnTime, false);
        }

    }

    @Override
    public String getName()
    {
        return "EmbellishCraft Furnace Fuels";
    }

}
