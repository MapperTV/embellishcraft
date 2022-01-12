package tv.mapper.embellishcraft.block;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

import org.apache.commons.lang3.tuple.Pair;

import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import tv.mapper.embellishcraft.ECConstants;
import tv.mapper.embellishcraft.EmbellishCraft;
import tv.mapper.mapperbase.world.level.block.ToolTypes;

public class ECBlockRegistry
{
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ECConstants.MODID);

    public static final Map<DyeColor, RegistryObject<LampBlock>> TABLE_LAMP_BLOCKS = Arrays.stream(DyeColor.values()).map(type -> Pair.of(type, BLOCKS.register(type.getSerializedName() + "_table_lamp", () -> new LampBlock(Block.Properties.of(Material.WOOL, type.getMaterialColor()).strength(1.5F, 6.0F).sound(SoundType.WOOL).lightLevel((state) -> 9), ToolTypes.PICKAXE, false)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));
    public static final Map<DyeColor, RegistryObject<LampBlock>> MANUAL_TABLE_LAMP_BLOCKS = Arrays.stream(DyeColor.values()).map(type -> Pair.of(type, BLOCKS.register(type.getSerializedName() + "_manual_table_lamp", () -> new LampBlock(Block.Properties.of(Material.WOOL, type.getMaterialColor()).strength(1.5F, 6.0F).sound(SoundType.WOOL).lightLevel((state) -> 9), ToolTypes.PICKAXE, true)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static void init()
    {
        EmbellishCraft.LOGGER.info("1.1- EmbellishCraft: block registering.");
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}