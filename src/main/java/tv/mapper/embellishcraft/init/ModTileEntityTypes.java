package tv.mapper.embellishcraft.init;

import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.ObjectHolder;
import tv.mapper.embellishcraft.ECConstants;
import tv.mapper.embellishcraft.block.ECBlockRegistry;
import tv.mapper.embellishcraft.tileentity.CrateTileEntity;
import tv.mapper.embellishcraft.tileentity.CustomChestTileEntity;
import tv.mapper.embellishcraft.util.McWoods;

@ObjectHolder(ECConstants.MODID)
@EventBusSubscriber(bus = Bus.MOD)
public class ModTileEntityTypes
{
    public static final TileEntityType<CustomChestTileEntity> CUSTOM_CHEST = null;
    // public static final TileEntityType<VerticalChestTileEntity> VERTICAL_CHEST = null;
    // public static final TileEntityType<VerticalChestTileEntity> CUSTOM_BED = null;
    public static final TileEntityType<CrateTileEntity> CRATE = null;

    @SubscribeEvent
    public static void registerTileEntities(final RegistryEvent.Register<TileEntityType<?>> event)
    {
        event.getRegistry().register(TileEntityType.Builder.create(CustomChestTileEntity::new, ECBlockRegistry.FANCY_CHEST_BLOCKS.get(McWoods.BIRCH).get(),
            ECBlockRegistry.FANCY_CHEST_BLOCKS.get(McWoods.DARK_OAK).get(), ECBlockRegistry.FANCY_CHEST_BLOCKS.get(McWoods.JUNGLE).get(), ECBlockRegistry.FANCY_CHEST_BLOCKS.get(McWoods.OAK).get(),
            ECBlockRegistry.FANCY_CHEST_BLOCKS.get(McWoods.SPRUCE).get(), ECBlockRegistry.FANCY_CHEST_BLOCKS.get(McWoods.ACACIA).get()).build(null).setRegistryName("custom_chest"));

        // event.getRegistry().register(TileEntityType.Builder.create(VerticalChestTileEntity::new, ModBlocks.LOCKER).build(null).setRegistryName("vertical_chest"));
        // event.getRegistry().register(
        // TileEntityType.Builder.create(CustomBedTileEntity::new, ModBlocks.FANCY_BEDS.toArray(new Block[ModBlocks.FANCY_BEDS.size()])).build(null).setRegistryName("custom_bed"));

        event.getRegistry().register(TileEntityType.Builder.create(CrateTileEntity::new, ECBlockRegistry.WOODEN_CRATE_BLOCKS.get(McWoods.ACACIA).get(),
            ECBlockRegistry.WOODEN_CRATE_BLOCKS.get(McWoods.BIRCH).get(), ECBlockRegistry.WOODEN_CRATE_BLOCKS.get(McWoods.DARK_OAK).get(), ECBlockRegistry.WOODEN_CRATE_BLOCKS.get(McWoods.JUNGLE).get(),
            ECBlockRegistry.WOODEN_CRATE_BLOCKS.get(McWoods.OAK).get(), ECBlockRegistry.WOODEN_CRATE_BLOCKS.get(McWoods.SPRUCE).get()).build(null).setRegistryName("crate"));

    }
}
