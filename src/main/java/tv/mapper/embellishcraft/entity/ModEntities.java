package tv.mapper.embellishcraft.entity;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import tv.mapper.embellishcraft.ECConstants;

@Mod.EventBusSubscriber(modid = ECConstants.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEntities
{
    @SuppressWarnings("rawtypes")
    private static final List<EntityType> ENTITY_TYPES = new ArrayList<>();

    public static final EntityType<EntityChair> TYPE_CHAIR = buildType(ECConstants.MODID + ":entity_chair", EntityType.Builder.<EntityChair>of((type, world) -> new EntityChair(world), MobCategory.MISC).sized(0.0F, 0.0F).setCustomClientFactory((spawnEntity, world) -> new EntityChair(world)));

    private static <T extends Entity> EntityType<T> buildType(String id, EntityType.Builder<T> builder)
    {
        EntityType<T> type = builder.build(id);
        type.setRegistryName(id);
        ENTITY_TYPES.add(type);
        return type;
    }

    @SubscribeEvent
    public static void registerTypes(final RegistryEvent.Register<EntityType<?>> event)
    {
        ENTITY_TYPES.forEach(type -> event.getRegistry().register(type));
        ENTITY_TYPES.clear();
    }
}