package tv.mapper.embellishcraft.client.renderer.tileentity.model;

import net.minecraft.client.renderer.entity.model.RendererModel;
import net.minecraft.client.renderer.model.Model;

public class LockModel extends Model
{
    protected RendererModel lock;
    
    public LockModel()
    {
        this.lock = (new RendererModel(this, 0, 0)).setTextureSize(96, 64);
        this.lock.addBox(1.0F, 1.0F, 0.0F, 5, 4, 1, 0.0F);
        this.lock.rotationPointX = 1.0F;
        this.lock.rotationPointY = 0.0F;
        this.lock.rotationPointZ = 1.0F;
    }

    public void renderAll()
    {
        this.lock.render(0.0625F);
    }

    public RendererModel getLid()
    {
        return this.lock;
    }
}
