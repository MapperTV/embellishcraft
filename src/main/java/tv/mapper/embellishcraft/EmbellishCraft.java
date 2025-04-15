package tv.mapper.embellishcraft;

import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.minecraft.client.renderer.entity.EntityRenderers;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import tv.mapper.embellishcraft.building.block.InitBuildingBlocks;
import tv.mapper.embellishcraft.building.item.InitBuildingItems;
import tv.mapper.embellishcraft.core.data.ECGenerators;
import tv.mapper.embellishcraft.core.item.ModItemGroups;
import tv.mapper.embellishcraft.furniture.block.InitFurnitureBlocks;
import tv.mapper.embellishcraft.furniture.entity.InitFurnitureEntities;
import tv.mapper.embellishcraft.furniture.entity.client.SitEntityRenderer;
import tv.mapper.embellishcraft.furniture.item.InitFurnitureItems;
import tv.mapper.embellishcraft.industrial.block.InitIndustrialBlocks;
import tv.mapper.embellishcraft.industrial.item.InitIndustrialItems;
import tv.mapper.embellishcraft.lights.block.InitLightBlocks;
import tv.mapper.embellishcraft.lights.item.InitLightItems;
import tv.mapper.embellishcraft.rocks.block.InitRockBlocks;
import tv.mapper.embellishcraft.rocks.item.InitRockItems;

@Mod(EmbellishCraft.MODID)
public class EmbellishCraft
{
    public static final String MODID = "embellishcraft";
    public static final Logger LOGGER = LogUtils.getLogger();

    public EmbellishCraft(IEventBus modEventBus, ModContainer modContainer)
    {
        InitBuildingBlocks.BUILDING_BLOCK_REGISTRY.register(modEventBus);
        InitBuildingItems.BUILDING_ITEM_REGISTRY.register(modEventBus);

        InitFurnitureBlocks.FURNITURE_BLOCK_REGISTRY.register(modEventBus);
        InitFurnitureItems.FURNITURE_ITEM_REGISTRY.register(modEventBus);
        InitFurnitureEntities.FURNITURE_ENTITY_REGISTRY.register(modEventBus);

        InitIndustrialBlocks.INDUSTRIAL_BLOCK_REGISTRY.register(modEventBus);
        InitIndustrialItems.INDUSTRIAL_ITEM_REGISTRY.register(modEventBus);

        InitLightBlocks.LIGHT_BLOCK_REGISTRY.register(modEventBus);
        InitLightItems.LIGHT_ITEM_REGISTRY.register(modEventBus);

        InitRockBlocks.ROCK_BLOCK_REGISTRY.register(modEventBus);
        InitRockItems.ROCK_ITEM_REGISTRY.register(modEventBus);

        ModItemGroups.TABS.register(modEventBus);

        modEventBus.addListener(ECGenerators::generate);
    }

    @EventBusSubscriber(modid = MODID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {
            EntityRenderers.register(InitFurnitureEntities.SIT_ENTITY.get(), SitEntityRenderer::new);
        }
    }
}
