package tv.mapper.embellishcraft.lights.item;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

import org.apache.commons.lang3.tuple.Pair;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import tv.mapper.embellishcraft.core.ECConstants;
import tv.mapper.embellishcraft.lights.block.InitLightBlocks;

public class InitLightItems
{
    public static final DeferredRegister.Items LIGHT_ITEM_REGISTRY = DeferredRegister.createItems(ECConstants.MODID);

    public static final Map<DyeColor, DeferredItem<BlockItem>> TABLE_LAMP_ITEMS = Arrays.stream(DyeColor.values()).map(type -> Pair.of(type, LIGHT_ITEM_REGISTRY.register(type.getSerializedName() + "_table_lamp", () -> new BlockItem(InitLightBlocks.TABLE_LAMP_BLOCKS.get(type).get(), new Item.Properties())))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));
    public static final Map<DyeColor, DeferredItem<BlockItem>> MANUAL_TABLE_LAMP_ITEMS = Arrays.stream(DyeColor.values()).map(type -> Pair.of(type, LIGHT_ITEM_REGISTRY.register(type.getSerializedName() + "_manual_table_lamp", () -> new BlockItem(InitLightBlocks.MANUAL_TABLE_LAMP_BLOCKS.get(type).get(), new Item.Properties())))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));
}
