package tv.mapper.embellishcraft.core.item;

import java.util.Random;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import tv.mapper.embellishcraft.building.item.InitBuildingItems;
import tv.mapper.embellishcraft.core.ECConstants;
import tv.mapper.embellishcraft.core.util.McWoods;
import tv.mapper.embellishcraft.core.util.RockType;
import tv.mapper.embellishcraft.furniture.block.InitFurnitureBlocks;
import tv.mapper.embellishcraft.furniture.item.InitFurnitureItems;
import tv.mapper.embellishcraft.industrial.item.InitIndustrialItems;
import tv.mapper.embellishcraft.lights.block.InitLightBlocks;
import tv.mapper.embellishcraft.lights.item.InitLightItems;
import tv.mapper.embellishcraft.rocks.block.InitRockBlocks;
import tv.mapper.embellishcraft.rocks.item.InitRockItems;

public class ModItemGroups
{
    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ECConstants.MODID);

    static Random rand = new Random();

    public static void init(IEventBus modEventBus)
    {
        TABS.register(modEventBus);
    }

    public static DeferredHolder<CreativeModeTab, CreativeModeTab> EMBELLISHCRAFT_BUILDING = TABS.register("embellishcraft_building_group", () -> CreativeModeTab.builder().title(Component.translatable("itemGroup.embellishcraft_building_group")).icon(() -> new ItemStack(InitBuildingItems.DARK_BRICKS_ITEM.get())).withTabsBefore(CreativeModeTabs.SPAWN_EGGS).displayItems((featureFlags, output) ->
    {
        for(DeferredHolder<Item, ? extends Item> item : InitBuildingItems.BUILDING_ITEM_REGISTRY.getEntries())
        {
            output.accept(item.get());
        }
    }).build());

    public static DeferredHolder<CreativeModeTab, CreativeModeTab> EMBELLISHCRAFT_FURNITURE = TABS.register("embellishcraft_furniture_group", () -> CreativeModeTab.builder().title(Component.translatable("itemGroup.embellishcraft_furniture_group")).icon(() -> new ItemStack(InitFurnitureBlocks.CHAIR_BLOCKS.get(McWoods.byId(rand.nextInt(5))).get())).withTabsBefore(CreativeModeTabs.SPAWN_EGGS).displayItems((featureFlags, output) ->
    {
        for(DeferredHolder<Item, ? extends Item> item : InitFurnitureItems.FURNITURE_ITEM_REGISTRY.getEntries())
        {
            output.accept(item.get());
        }
    }).build());

    public static DeferredHolder<CreativeModeTab, CreativeModeTab> EMBELLISHCRAFT_INDUSTRIAL = TABS.register("embellishcraft_industrial_group", () -> CreativeModeTab.builder().title(Component.translatable("itemGroup.embellishcraft_industrial_group")).icon(() -> new ItemStack(InitIndustrialItems.WARNING_STEEL_DOOR_ITEM.get())).withTabsBefore(CreativeModeTabs.SPAWN_EGGS).displayItems((featureFlags, output) ->
    {
        for(DeferredHolder<Item, ? extends Item> item : InitIndustrialItems.INDUSTRIAL_ITEM_REGISTRY.getEntries())
        {
            output.accept(item.get());
        }
    }).build());

    public static DeferredHolder<CreativeModeTab, CreativeModeTab> EMBELLISHCRAFT_LIGHT = TABS.register("embellishcraft_light_group", () -> CreativeModeTab.builder().title(Component.translatable("itemGroup.embellishcraft_light_group")).icon(() -> new ItemStack(InitLightBlocks.TABLE_LAMP_BLOCKS.get(DyeColor.byId(rand.nextInt(15))).get())).withTabsBefore(CreativeModeTabs.SPAWN_EGGS).displayItems((featureFlags, output) ->
    {
        for(DeferredHolder<Item, ? extends Item> item : InitLightItems.LIGHT_ITEM_REGISTRY.getEntries())
        {
            output.accept(item.get());
        }
    }).build());

    public static DeferredHolder<CreativeModeTab, CreativeModeTab> EMBELLISHCRAFT_ROCKS = TABS.register("embellishcraft_rocks_group", () -> CreativeModeTab.builder().title(Component.translatable("itemGroup.embellishcraft_rocks_group")).icon(() -> new ItemStack(InitRockBlocks.POLISHED_ROCK_BLOCKS.get(RockType.byId(rand.nextInt(5))).get())).withTabsBefore(CreativeModeTabs.SPAWN_EGGS).displayItems((featureFlags, output) ->
    {
        for(DeferredHolder<Item, ? extends Item> item : InitRockItems.ROCK_ITEM_REGISTRY.getEntries())
        {
            output.accept(item.get());
        }
    }).build());

}