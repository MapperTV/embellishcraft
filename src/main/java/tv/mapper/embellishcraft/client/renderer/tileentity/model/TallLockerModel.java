package tv.mapper.embellishcraft.client.renderer.tileentity.model;

import net.minecraft.client.renderer.entity.model.RendererModel;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class TallLockerModel extends LockerModel
{
    public TallLockerModel()
    {
        // this.top = (new RendererModel(this, 0, 0)).setTextureSize(16, 16);
        // this.top.addBox(0.0F, -5.0F, -14.0F, 30, 5, 14, 0.0F);
        //
        // this.bottom = (new RendererModel(this, 0, 19)).setTextureSize(16, 16);
        // this.bottom.addBox(0.0F, 0.0F, 0.0F, 30, 10, 14, 0.0F);

        this.top.addBox(1.0F, 0.0F, 1.0F, 14, 1, 14, 0.0F);

        this.bottom = (new RendererModel(this, 0, 19)).setTextureSize(16, 16);
        this.bottom.addBox(1.0F, 30.0F, 1.0F, 14, 2, 14, 0.0F);

        this.left = (new RendererModel(this, 0, 0)).setTextureSize(16, 16);
        this.left.addBox(0.0F, 0.0F, 1.0F, 1, 32, 15, 0.0F);

        this.right = (new RendererModel(this, 0, 0)).setTextureSize(16, 16);
        this.right.addBox(15.0F, 0.0F, 1.0F, 1, 32, 15, 0.0F);

        this.back = (new RendererModel(this, 0, 0)).setTextureSize(16, 16);
        this.back.addBox(1.0F, 0.0F, 15.0F, 14, 32, 1, 0.0F);

        this.back = (new RendererModel(this, 0, 0)).setTextureSize(16, 16);
        this.back.addBox(1.0F, 0.0F, 15.0F, 14, 32, 1, 0.0F);

        this.door = (new RendererModel(this, 0, 0)).setTextureSize(16, 16);
        this.door.addBox(0.0F, 1.0F, 0.0F, 14, 29, 1, 0.0F);
        this.door.rotationPointX = 1.0F;
        this.door.rotationPointY = 0.0F;
        this.door.rotationPointZ = 1.0F;
    }
}
