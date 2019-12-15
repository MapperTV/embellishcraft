package tv.mapper.embellishcraft.client.renderer;

import com.mojang.blaze3d.platform.GlStateManager;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.client.renderer.tileentity.TileEntityRenderer;
import net.minecraft.tileentity.IChestLid;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Direction;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import tv.mapper.embellishcraft.Constants;
import tv.mapper.embellishcraft.block.VerticalChestBlock;
import tv.mapper.embellishcraft.client.renderer.tileentity.model.LockerModel;
import tv.mapper.embellishcraft.client.renderer.tileentity.model.TallLockerModel;
import tv.mapper.embellishcraft.state.properties.VerticalChestType;

@OnlyIn(Dist.CLIENT)
public class VerticalChestTileEntityRenderer<T extends TileEntity & IChestLid> extends TileEntityRenderer<T>
{
    private static final ResourceLocation TEXTURE_LOCKER = new ResourceLocation(Constants.MODID, "textures/entity/furniture/storage/locker.png");

    private final LockerModel simpleModel = new LockerModel();
    private final LockerModel largeModel = new TallLockerModel();

    public VerticalChestTileEntityRenderer()
    {

    }

    public void render(T tileEntityIn, double x, double y, double z, float partialTicks, int destroyStage)
    {
        GlStateManager.enableDepthTest();
        GlStateManager.depthFunc(515);
        GlStateManager.depthMask(true);
        BlockState blockstate = tileEntityIn.hasWorld() ? tileEntityIn.getBlockState() : Blocks.CHEST.getDefaultState().with(VerticalChestBlock.FACING, Direction.SOUTH);
        VerticalChestType chesttype = blockstate.has(VerticalChestBlock.TYPE) ? blockstate.get(VerticalChestBlock.TYPE) : VerticalChestType.SINGLE;
        if(chesttype != VerticalChestType.BOTTOM)
        {
            boolean flag = chesttype != VerticalChestType.SINGLE;
            LockerModel lockermodel = this.getLockerModel(tileEntityIn, destroyStage, flag);
            if(destroyStage >= 0)
            {
                GlStateManager.matrixMode(5890);
                GlStateManager.pushMatrix();
                GlStateManager.scalef(flag ? 8.0F : 4.0F, 4.0F, 1.0F);
                GlStateManager.translatef(0.0625F, 0.0625F, 0.0625F);
                GlStateManager.matrixMode(5888);
            }
            else
            {
                GlStateManager.color4f(1.0F, 1.0F, 1.0F, 1.0F);
            }

            GlStateManager.pushMatrix();
            GlStateManager.enableRescaleNormal();
            GlStateManager.translatef((float)x, (float)y + 1.0F, (float)z + 1.0F);
            GlStateManager.scalef(1.0F, -1.0F, -1.0F);
            float f = blockstate.get(VerticalChestBlock.FACING).getHorizontalAngle();
            if((double)Math.abs(f) > 1.0E-5D)
            {
                GlStateManager.translatef(0.5F, 0.5F, 0.5F);
                GlStateManager.rotatef(f, 0.0F, 1.0F, 0.0F);
                GlStateManager.translatef(-0.5F, -0.5F, -0.5F);
            }

            this.applyLidRotation(tileEntityIn, partialTicks, lockermodel);
            lockermodel.renderAll();
            GlStateManager.disableRescaleNormal();
            GlStateManager.popMatrix();
            GlStateManager.color4f(1.0F, 1.0F, 1.0F, 1.0F);
            if(destroyStage >= 0)
            {
                GlStateManager.matrixMode(5890);
                GlStateManager.popMatrix();
                GlStateManager.matrixMode(5888);
            }

        }
    }

    private LockerModel getLockerModel(T tileEntityIn, int destroyStage, boolean doubleChest)
    {
        ResourceLocation resourcelocation;
        if(destroyStage >= 0)
        {
            resourcelocation = DESTROY_STAGES[destroyStage];
        }
        else
        {
            resourcelocation = TEXTURE_LOCKER;
        }

        this.bindTexture(resourcelocation);
        return doubleChest ? this.largeModel : this.simpleModel;
    }

    private void applyLidRotation(T chest, float angle, LockerModel locker)
    {
        float f = ((IChestLid)chest).getLidAngle(angle);
        f = 1.0F - f;
        f = 1.0F - f * f * f;
        locker.getLid().rotateAngleY = 0.85f * f * ((float)Math.PI / 2F);
    }
}