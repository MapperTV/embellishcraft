package tv.mapper.embellishcraft.client.renderer.tileentity.model;

import java.util.Arrays;
import java.util.Comparator;

import com.mojang.blaze3d.platform.GlStateManager;

import net.minecraft.block.BedBlock;
import net.minecraft.block.BlockState;
import net.minecraft.client.renderer.tileentity.TileEntityRenderer;
import net.minecraft.item.DyeColor;
import net.minecraft.state.properties.BedPart;
import net.minecraft.util.Direction;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import tv.mapper.embellishcraft.Constants;
import tv.mapper.embellishcraft.tileentity.CustomBedTileEntity;

@OnlyIn(Dist.CLIENT)
public class CustomBedTileEntityRenderer<T extends CustomBedTileEntity> extends TileEntityRenderer<T>
{
    private static final ResourceLocation[] TEXTURES = Arrays.stream(DyeColor.values()).sorted(Comparator.comparingInt(DyeColor::getId)).map((color) ->
    {
        return new ResourceLocation(Constants.MODID, "textures/entity/furniture/bed/" + color.getTranslationKey() + "_oak_fancy_bed.png");
    }).toArray((resource) ->
    {
        return new ResourceLocation[resource];
    });
    private final FancyBedModel model = new FancyBedModel();

    public void render(T tileEntityIn, double x, double y, double z, float partialTicks, int destroyStage)
    {
        if(destroyStage >= 0)
        {
            this.bindTexture(DESTROY_STAGES[destroyStage]);
            GlStateManager.matrixMode(5890);
            GlStateManager.pushMatrix();
            GlStateManager.scalef(4.0F, 4.0F, 1.0F);
            GlStateManager.translatef(0.0625F, 0.0625F, 0.0625F);
            GlStateManager.matrixMode(5888);
        }
        else
        {
            ResourceLocation resourcelocation = TEXTURES[tileEntityIn.getColor().getId()];
            if(resourcelocation != null)
            {
                this.bindTexture(resourcelocation);
            }
        }

        if(tileEntityIn.hasWorld())
        {
            BlockState blockstate = tileEntityIn.getBlockState();
            this.prepare(blockstate.get(BedBlock.PART) == BedPart.HEAD, x, y, z, blockstate.get(BedBlock.HORIZONTAL_FACING));
        }
        else
        {
            this.prepare(true, x, y, z, Direction.SOUTH);
            this.prepare(false, x, y, z - 1.0D, Direction.SOUTH);
        }

        if(destroyStage >= 0)
        {
            GlStateManager.matrixMode(5890);
            GlStateManager.popMatrix();
            GlStateManager.matrixMode(5888);
        }

    }

    private void prepare(boolean p_199343_1_, double x, double y, double z, Direction direction)
    {
        this.model.preparePiece(p_199343_1_);
        GlStateManager.pushMatrix();
        GlStateManager.translatef((float)x, (float)y + 0.5625F, (float)z);
        GlStateManager.rotatef(90.0F, 1.0F, 0.0F, 0.0F);
        GlStateManager.translatef(0.5F, 0.5F, 0.5F);
        GlStateManager.rotatef(180.0F + direction.getHorizontalAngle(), 0.0F, 0.0F, 1.0F);
        GlStateManager.translatef(-0.5F, -0.5F, -0.5F);
        GlStateManager.enableRescaleNormal();
        this.model.render();
        GlStateManager.color4f(1.0F, 1.0F, 1.0F, 1.0F);
        GlStateManager.popMatrix();
    }
}