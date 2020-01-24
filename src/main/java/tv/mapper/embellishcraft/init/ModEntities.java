package tv.mapper.embellishcraft.init;

import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;
import tv.mapper.embellishcraft.ECConstants;
import tv.mapper.embellishcraft.entity.EntityChair;

public class ModEntities
{
    @ObjectHolder(ECConstants.MODID + ":entity_chair")
    public static final EntityType<EntityChair> TYPE_CHAIR = null;

    @Mod.EventBusSubscriber(modid = ECConstants.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class Registration
    {

        @SubscribeEvent
        public static void registerEntities(final RegistryEvent.Register<EntityType<?>> event)
        {
            event.getRegistry().register(EntityType.Builder.<EntityChair>create(EntityChair::new, EntityClassification.MISC).setCustomClientFactory((spawnEntity, world) ->
            {
                return TYPE_CHAIR.create(world);
            }).setTrackingRange(256).setUpdateInterval(20).size(0.0001F, 0.0001F).build(ECConstants.MODID + ":entity_chair").setRegistryName(new ResourceLocation(ECConstants.MODID, "entity_chair")));
        }
    }
}