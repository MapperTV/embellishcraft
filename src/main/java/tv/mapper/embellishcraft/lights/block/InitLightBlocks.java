package tv.mapper.embellishcraft.lights.block;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

import org.apache.commons.lang3.tuple.Pair;

import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import tv.mapper.embellishcraft.core.ECConstants;
import tv.mapper.mapperbase.api.block.tools.ToolTypes;

public class InitLightBlocks
{
    public static final DeferredRegister.Blocks LIGHT_BLOCK_REGISTRY = DeferredRegister.createBlocks(ECConstants.MODID);

    public static final Map<DyeColor, DeferredBlock<LampBlock>> TABLE_LAMP_BLOCKS = Arrays.stream(DyeColor.values()).map(type -> Pair.of(type, LIGHT_BLOCK_REGISTRY.register(type.getSerializedName() + "_table_lamp", () -> new LampBlock(Block.Properties.of().sound(SoundType.WOOL).mapColor(type.getMapColor()).strength(.5F).sound(SoundType.WOOL).lightLevel((state) -> 10), ToolTypes.NONE, false)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));
    public static final Map<DyeColor, DeferredBlock<LampBlock>> MANUAL_TABLE_LAMP_BLOCKS = Arrays.stream(DyeColor.values()).map(type -> Pair.of(type, LIGHT_BLOCK_REGISTRY.register(type.getSerializedName() + "_manual_table_lamp", () -> new LampBlock(Block.Properties.of().sound(SoundType.WOOL).mapColor(type.getMapColor()).strength(.5F).sound(SoundType.WOOL).lightLevel((state) -> 10), ToolTypes.NONE, true)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));
}
