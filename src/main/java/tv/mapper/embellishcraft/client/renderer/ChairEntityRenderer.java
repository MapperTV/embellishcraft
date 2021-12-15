package tv.mapper.embellishcraft.client.renderer;

import net.minecraft.client.renderer.culling.Frustum;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider.Context;
import net.minecraft.resources.ResourceLocation;
import tv.mapper.embellishcraft.entity.EntityChair;

public class ChairEntityRenderer extends EntityRenderer<EntityChair>
{
    public ChairEntityRenderer(Context renderManager)
    {
        super(renderManager);
    }

    @Override
    public ResourceLocation getTextureLocation(EntityChair entity)
    {
        return null;
    }

    @Override
    public boolean shouldRender(EntityChair entity, Frustum camera, double camX, double camY, double camZ)
    {
        return false;
    }
}