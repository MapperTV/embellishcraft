package tv.mapper.embellishcraft.init;

import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.ObjectHolder;
import tv.mapper.embellishcraft.Constants;
import tv.mapper.embellishcraft.tileentity.CustomChestTileEntity;

@ObjectHolder(Constants.MODID)
@EventBusSubscriber(bus = Bus.MOD)
public class ModTileEntityTypes
{
    public static final TileEntityType<CustomChestTileEntity> CUSTOM_CHEST = null;

    @SubscribeEvent
    public static void registerTileEntities(final RegistryEvent.Register<TileEntityType<?>> event)
    {
        event.getRegistry().register(TileEntityType.Builder.create(CustomChestTileEntity::new, ModBlocks.OAK_FANCY_CHEST, ModBlocks.BIRCH_FANCY_CHEST, ModBlocks.SPRUCE_FANCY_CHEST, ModBlocks.JUNGLE_FANCY_CHEST, ModBlocks.DARK_OAK_FANCY_CHEST, ModBlocks.ACACIA_FANCY_CHEST).build(null).setRegistryName("custom_chest"));
    }
}
