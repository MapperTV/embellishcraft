package tv.mapper.embellishcraft.client.renderer.tileentity.model;

import net.minecraft.client.renderer.entity.model.RendererModel;
import net.minecraft.client.renderer.model.Model;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class LockerModel extends Model
{
    protected RendererModel top = (new RendererModel(this, 0, 0)).setTextureSize(96, 64);
    protected RendererModel bottom;
    protected RendererModel right;
    protected RendererModel left;
    protected RendererModel back;
    protected RendererModel door;

    public LockerModel()
    {
        this.top.addBox(1.0F, 0.0F, 1.0F, 14, 1, 14, 0.0F);

        this.bottom = (new RendererModel(this, 0, 0)).setTextureSize(96, 64);
        this.bottom.addBox(1.0F, 14.0F, 1.0F, 14, 2, 14, 0.0F);

        this.left = (new RendererModel(this, 0, 0)).setTextureSize(96, 64);
        this.left.addBox(0.0F, 0.0F, 1.0F, 1, 16, 15, 0.0F);

        this.right = (new RendererModel(this, 0, 0)).setTextureSize(96, 64);
        this.right.addBox(15.0F, 0.0F, 1.0F, 1, 16, 15, 0.0F);

        this.back = (new RendererModel(this, 0, 0)).setTextureSize(96, 64);
        this.back.addBox(1.0F, 0.0F, 15.0F, 14, 16, 1, 0.0F);

        this.back = (new RendererModel(this, 0, 0)).setTextureSize(96, 64);
        this.back.addBox(1.0F, 0.0F, 15.0F, 14, 16, 1, 0.0F);

        this.door = (new RendererModel(this, 0, 0)).setTextureSize(96, 64);
        this.door.addBox(0.0F, 1.0F, 0.0F, 14, 13, 1, 0.0F);
        this.door.rotationPointX = 1.0F;
        this.door.rotationPointY = 0.0F;
        this.door.rotationPointZ = 1.0F;
    }

    /**
     * This method renders out all parts of the chest model.
     */
    public void renderAll()
    {
        // this.lock.rotateAngleX = this.top.rotateAngleX;
        //this.top.render(0.0625F);
        //this.bottom.render(0.0625F);
        this.right.render(0.0625F);
        this.left.render(0.0625F);
        //this.back.render(0.0625F);
        //this.door.render(0.0625F);
    }

    public RendererModel getLid()
    {
        return this.door;
    }
}
