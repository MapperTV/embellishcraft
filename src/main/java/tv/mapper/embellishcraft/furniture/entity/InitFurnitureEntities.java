package tv.mapper.embellishcraft.furniture.entity;

import java.util.function.Supplier;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.neoforged.neoforge.registries.DeferredRegister;
import tv.mapper.embellishcraft.core.ECConstants;

public class InitFurnitureEntities
{
    public static final DeferredRegister<EntityType<?>> FURNITURE_ENTITY_REGISTRY = DeferredRegister.create(BuiltInRegistries.ENTITY_TYPE, ECConstants.MODID);

    public static final Supplier<EntityType<SitEntity>> SIT_ENTITY = FURNITURE_ENTITY_REGISTRY.register("sit_entity", () -> EntityType.Builder.of(SitEntity::new, MobCategory.MISC).sized(.5f, .5f).build("sit_entity"));

}
