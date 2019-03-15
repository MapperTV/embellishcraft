package tv.mapper.embellishcraft.entity;

import net.minecraft.entity.EntityType;
import net.minecraftforge.registries.IForgeRegistry;
import tv.mapper.embellishcraft.EmbellishCraft;

public class ModEntities
{
    public static EntityType<EntityChair> TYPE_CHAIR;

    public static void register(IForgeRegistry<EntityType<?>> registry)
    {
        TYPE_CHAIR = EntityType.Builder.create(EntityChair.class, EntityChair::new).build("embellishcraft_chair");
        TYPE_CHAIR.setRegistryName(EmbellishCraft.MODID, "embellishcraft_chair");
        registry.register(TYPE_CHAIR);
    }
}
