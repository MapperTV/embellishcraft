package tv.mapper.embellishcraft.client.renderer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.mojang.blaze3d.platform.GlStateManager;

import net.minecraft.block.BlockState;
import net.minecraft.client.renderer.tileentity.TileEntityRenderer;
import net.minecraft.client.renderer.tileentity.model.ChestModel;
import net.minecraft.client.renderer.tileentity.model.LargeChestModel;
import net.minecraft.state.properties.ChestType;
import net.minecraft.tileentity.IChestLid;
import net.minecraft.util.Direction;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.ModList;
import tv.mapper.embellishcraft.Constants;
import tv.mapper.embellishcraft.EmbellishCraft;
import tv.mapper.embellishcraft.block.CustomChestBlock;
import tv.mapper.embellishcraft.init.ModBlocks;
import tv.mapper.embellishcraft.tileentity.CustomChestTileEntity;
import tv.mapper.embellishcraft.util.WoodType;

public class CustomChestTileEntityRenderer<T extends CustomChestTileEntity & IChestLid> extends TileEntityRenderer<T>
{
    public static List<ResourceLocation> TEXTURES = new ArrayList<>();
    public static List<ResourceLocation> TEXTURES_DOUBLE = new ArrayList<>();

    private int woodId = -1;

    public CustomChestTileEntityRenderer()
    {
        String name;

        for(int i = 0; i < Arrays.stream(WoodType.values()).count(); i++)
        {
            name = WoodType.getWoodByID(i);
            if(i < 6)
            {
                TEXTURES.add(new ResourceLocation(Constants.MODID, "textures/entity/furniture/storage/chest/" + name + "_fancy_chest.png"));
                TEXTURES_DOUBLE.add(new ResourceLocation(Constants.MODID, "textures/entity/furniture/storage/chest/" + name + "_fancy_chest_double.png"));
            }
            else if(i > 5 && i < 18 && ModList.get().isLoaded("embellishcraft-bop"))
            {
                TEXTURES.add(new ResourceLocation("embellishcraft-bop", "textures/entity/chest/" + name + "_fancy_chest.png"));
                TEXTURES_DOUBLE.add(new ResourceLocation("embellishcraft-bop", "textures/entity/chest/" + name + "_fancy_chest_double.png"));
            }
        }
    }

    private final ChestModel simpleChest = new ChestModel();
    private final ChestModel largeChest = new LargeChestModel();

    public void render(T tileEntityIn, double x, double y, double z, float partialTicks, int destroyStage)
    {
        render(tileEntityIn, x, y, z, partialTicks, destroyStage, null);

    }

    public void render(T tileEntityIn, double x, double y, double z, float partialTicks, int destroyStage, String registryName)
    {
        GlStateManager.enableDepthTest();
        GlStateManager.depthFunc(515);
        GlStateManager.depthMask(true);
        BlockState blockstate = tileEntityIn.hasWorld() ? tileEntityIn.getBlockState() : ModBlocks.OAK_FANCY_CHEST.getDefaultState().with(CustomChestBlock.FACING, Direction.SOUTH);
        ChestType chesttype = blockstate.has(CustomChestBlock.TYPE) ? blockstate.get(CustomChestBlock.TYPE) : ChestType.SINGLE;

        if(registryName == null)
            registryName = blockstate.getBlock().getRegistryName().toString();

        if(chesttype != ChestType.LEFT)
        {
            boolean flag = chesttype != ChestType.SINGLE;
            ChestModel chestmodel = this.getChestModel(tileEntityIn, destroyStage, flag, registryName);
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
            float f = blockstate.get(CustomChestBlock.FACING).getHorizontalAngle();
            if((double)Math.abs(f) > 1.0E-5D)
            {
                GlStateManager.translatef(0.5F, 0.5F, 0.5F);
                GlStateManager.rotatef(f, 0.0F, 1.0F, 0.0F);
                GlStateManager.translatef(-0.5F, -0.5F, -0.5F);
            }

            this.applyLidRotation(tileEntityIn, partialTicks, chestmodel);
            chestmodel.renderAll();
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

    private ChestModel getChestModel(T tileEntityIn, int destroyStage, boolean doubleChest, String blockName)
    {
        ResourceLocation resourcelocation;
        if(destroyStage >= 0)
        {
            resourcelocation = DESTROY_STAGES[destroyStage];
        }
        else
        {
            woodId = tileEntityIn.getWood().getId();
            if(!doubleChest)
                resourcelocation = TEXTURES.get(woodId);
            else
                resourcelocation = TEXTURES_DOUBLE.get(woodId);
        }

        if(resourcelocation != null)
            this.bindTexture(resourcelocation);
        else
            EmbellishCraft.LOGGER.warn("Warning: couldn't bind texture on custom chest renderer!");

        return doubleChest ? this.largeChest : this.simpleChest;
    }

    private void applyLidRotation(T p_199346_1_, float p_199346_2_, ChestModel p_199346_3_)
    {
        float f = ((IChestLid)p_199346_1_).getLidAngle(p_199346_2_);
        f = 1.0F - f;
        f = 1.0F - f * f * f;
        p_199346_3_.getLid().rotateAngleX = -(f * ((float)Math.PI / 2F));
    }
}
