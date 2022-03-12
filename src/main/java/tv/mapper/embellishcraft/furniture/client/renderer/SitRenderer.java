package tv.mapper.embellishcraft.furniture.client.renderer;

import com.mojang.blaze3d.vertex.PoseStack;

import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import tv.mapper.embellishcraft.furniture.world.entity.SitEntity;

public class SitRenderer extends EntityRenderer<SitEntity>
{
    public SitRenderer(EntityRendererProvider.Context context)
    {
        super(context);
    }

    @Override
    public ResourceLocation getTextureLocation(SitEntity entity)
    {
        return null;
    }

    @Override
    protected void renderNameTag(SitEntity entity, Component component, PoseStack stack, MultiBufferSource source, int light)
    {}
}
