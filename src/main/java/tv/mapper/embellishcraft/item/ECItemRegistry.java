package tv.mapper.embellishcraft.item;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

import org.apache.commons.lang3.tuple.Pair;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import tv.mapper.embellishcraft.ECConstants;
import tv.mapper.embellishcraft.block.ECBlockRegistry;

public class ECItemRegistry
{
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ECConstants.MODID);

    public static final Map<DyeColor, RegistryObject<BlockItem>> TABLE_LAMP_ITEMS = Arrays.stream(DyeColor.values()).map(type -> Pair.of(type, ITEMS.register(type.getSerializedName() + "_table_lamp", () -> new BlockItem(ECBlockRegistry.TABLE_LAMP_BLOCKS.get(type).get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT))))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<DyeColor, RegistryObject<BlockItem>> MANUAL_TABLE_LAMP_ITEMS = Arrays.stream(DyeColor.values()).map(type -> Pair.of(type, ITEMS.register(type.getSerializedName() + "_manual_table_lamp", () -> new BlockItem(ECBlockRegistry.MANUAL_TABLE_LAMP_BLOCKS.get(type).get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT))))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static void init()
    {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}