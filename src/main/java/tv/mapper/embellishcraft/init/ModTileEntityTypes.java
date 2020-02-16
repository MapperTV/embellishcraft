package tv.mapper.embellishcraft.init;

import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.ObjectHolder;
import tv.mapper.embellishcraft.ECConstants;
import tv.mapper.embellishcraft.block.ECBlocks;
import tv.mapper.embellishcraft.tileentity.CrateTileEntity;

@ObjectHolder(ECConstants.MODID)
@EventBusSubscriber(bus = Bus.MOD)
public class ModTileEntityTypes
{
//    public static final TileEntityType<CustomChestTileEntity> CUSTOM_CHEST = null;
//    public static final TileEntityType<VerticalChestTileEntity> VERTICAL_CHEST = null;
//    public static final TileEntityType<VerticalChestTileEntity> CUSTOM_BED = null;
    public static final TileEntityType<CrateTileEntity> CRATE = null;

    @SubscribeEvent
    public static void registerTileEntities(final RegistryEvent.Register<TileEntityType<?>> event)
    {
//        event.getRegistry().register(
//            TileEntityType.Builder.create(CustomChestTileEntity::new, ModBlocks.FANCY_CHESTS.toArray(new Block[ModBlocks.FANCY_CHESTS.size()])).build(null).setRegistryName("custom_chest"));
//        event.getRegistry().register(TileEntityType.Builder.create(VerticalChestTileEntity::new, ModBlocks.LOCKER).build(null).setRegistryName("vertical_chest"));
//        event.getRegistry().register(
//            TileEntityType.Builder.create(CustomBedTileEntity::new, ModBlocks.FANCY_BEDS.toArray(new Block[ModBlocks.FANCY_BEDS.size()])).build(null).setRegistryName("custom_bed"));
        event.getRegistry().register(TileEntityType.Builder.create(CrateTileEntity::new, ECBlocks.OAK_WOODEN_CRATE, ECBlocks.BIRCH_WOODEN_CRATE, ECBlocks.SPRUCE_WOODEN_CRATE,
            ECBlocks.JUNGLE_WOODEN_CRATE, ECBlocks.DARK_OAK_WOODEN_CRATE, ECBlocks.ACACIA_WOODEN_CRATE).build(null).setRegistryName("crate"));

    }
}
