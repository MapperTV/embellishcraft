package tv.mapper.embellishcraft.client.renderer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
import net.minecraftforge.fml.ModList;
import tv.mapper.embellishcraft.ECConstants;
import tv.mapper.embellishcraft.client.renderer.tileentity.model.FancyBedModel;
import tv.mapper.embellishcraft.tileentity.CustomBedTileEntity;
import tv.mapper.embellishcraft.util.WoodType;

@OnlyIn(Dist.CLIENT)
public class CustomBedTileEntityRenderer<T extends CustomBedTileEntity> extends TileEntityRenderer<T>
{
    public static List<ResourceLocation> TEXTURES = new ArrayList<>();

    private int woodId = -1;
    private int colorId = -1;

    public CustomBedTileEntityRenderer()
    {
        String name;

        for(int i = 0; i < Arrays.stream(WoodType.values()).count(); i++)
        {
            for(int j = 0; j < Arrays.stream(DyeColor.values()).count(); j++)
            {
                name = DyeColor.byId(j).getTranslationKey() + "_" + WoodType.getWoodByID(i);
                if(i < 6)
                    TEXTURES.add(new ResourceLocation(ECConstants.MODID, "textures/entity/furniture/bed/" + name + "_fancy_bed.png"));
                else if(i > 5 && i < 18 && ModList.get().isLoaded("embellishcraft-bop"))
                    TEXTURES.add(new ResourceLocation("embellishcraft-bop", "textures/entity/bed/" + name + "_fancy_bed.png"));
            }
        }
    }

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
            woodId = tileEntityIn.getWood().getId();
            colorId = tileEntityIn.getColor().getId();
            ResourceLocation res = TEXTURES.get(woodId * 16 + colorId);
            if(res != null)
            {
                this.bindTexture(res);
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