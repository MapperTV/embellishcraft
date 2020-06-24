package tv.mapper.embellishcraft.tileentity;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.ObjectHolder;
import tv.mapper.embellishcraft.ECConstants;
import tv.mapper.embellishcraft.EmbellishCraft;
import tv.mapper.embellishcraft.block.CrateBlock;
import tv.mapper.embellishcraft.block.CustomBedBlock;
import tv.mapper.embellishcraft.block.CustomChestBlock;
import tv.mapper.embellishcraft.block.ECBlockRegistry;

@ObjectHolder(ECConstants.MODID)
@EventBusSubscriber(bus = Bus.MOD)
public class ModTileEntityTypes
{
    public static final TileEntityType<CustomChestTileEntity> CUSTOM_CHEST = null;
    public static final TileEntityType<VerticalChestTileEntity> VERTICAL_CHEST = null;
    public static final TileEntityType<VerticalChestTileEntity> CUSTOM_BED = null;
    public static final TileEntityType<CrateTileEntity> CRATE = null;

    @SubscribeEvent
    public static void registerTileEntities(final RegistryEvent.Register<TileEntityType<?>> event)
    {
        EmbellishCraft.LOGGER.info("1.3- EmbellishCraft: TE registering.");

        List<Block> CHESTS = new ArrayList<>();
        List<Block> BEDS = new ArrayList<>();
        List<Block> CRATES = new ArrayList<>();

        for(RegistryObject<CustomChestBlock> object : ECBlockRegistry.FANCY_CHESTS)
        {
            CHESTS.add(object.get());
        }

        EmbellishCraft.LOGGER.info("EmbellishCraft: if this line crashes please report to https://github.com/MapperTV/embellishcraft/issues/19");
        for(RegistryObject<CustomBedBlock> object : ECBlockRegistry.FANCY_BEDS)
        {
            BEDS.add(object.get());
        }
        for(RegistryObject<CrateBlock> object : ECBlockRegistry.CRATES)
        {
            CRATES.add(object.get());
        }

        event.getRegistry().register(TileEntityType.Builder.create(CustomChestTileEntity::new, CHESTS.toArray(new Block[ECBlockRegistry.FANCY_CHESTS.size()])).build(null).setRegistryName("custom_chest"));
        event.getRegistry().register(TileEntityType.Builder.create(VerticalChestTileEntity::new, ECBlockRegistry.LOCKER.get()).build(null).setRegistryName("vertical_chest"));
        event.getRegistry().register(TileEntityType.Builder.create(CustomBedTileEntity::new, BEDS.toArray(new CustomBedBlock[ECBlockRegistry.FANCY_BEDS.size()])).build(null).setRegistryName("custom_bed"));
        event.getRegistry().register(TileEntityType.Builder.create(CrateTileEntity::new, CRATES.toArray(new Block[ECBlockRegistry.CRATES.size()])).build(null).setRegistryName("crate"));
    }
}