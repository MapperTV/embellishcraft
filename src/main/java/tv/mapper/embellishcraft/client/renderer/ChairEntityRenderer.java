package tv.mapper.embellishcraft.client.renderer;

import net.minecraft.client.renderer.culling.ClippingHelperImpl;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.util.ResourceLocation;
import tv.mapper.embellishcraft.entity.EntityChair;

public class ChairEntityRenderer extends EntityRenderer<EntityChair>
{
    public ChairEntityRenderer(EntityRendererManager renderManager)
    {
        super(renderManager);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityChair entity)
    {
        return null;
    }

    @Override
    public boolean shouldRender(EntityChair entity, ClippingHelperImpl camera, double camX, double camY, double camZ)
    {
        return false;
    }
}