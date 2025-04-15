package tv.mapper.embellishcraft.furniture.entity.client;

import net.minecraft.client.renderer.culling.Frustum;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider.Context;
import net.minecraft.resources.ResourceLocation;
import tv.mapper.embellishcraft.furniture.entity.SitEntity;

public class SitEntityRenderer extends EntityRenderer<SitEntity>
{

    public SitEntityRenderer(Context context)
    {
        super(context);
    }

    @Override
    public ResourceLocation getTextureLocation(SitEntity entity)
    {
        return null;
    }

    @Override
    public boolean shouldRender(SitEntity livingEntity, Frustum camera, double camX, double camY, double camZ)
    {
        return true;
    }

}
