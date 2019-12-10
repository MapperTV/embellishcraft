package tv.mapper.embellishcraft.client.renderer;

import com.mojang.blaze3d.platform.GlStateManager;

import net.minecraft.block.BlockState;
import net.minecraft.client.renderer.tileentity.TileEntityRenderer;
import net.minecraft.client.renderer.tileentity.model.ChestModel;
import net.minecraft.client.renderer.tileentity.model.LargeChestModel;
import net.minecraft.state.properties.ChestType;
import net.minecraft.tileentity.IChestLid;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Direction;
import net.minecraft.util.ResourceLocation;
import tv.mapper.embellishcraft.Constants;
import tv.mapper.embellishcraft.block.CustomChestBlock;
import tv.mapper.embellishcraft.init.ModBlocks;

public class CustomChestTileEntityRenderer<T extends TileEntity & IChestLid> extends TileEntityRenderer<T>
{
    private static final ResourceLocation FANCY_OAK_CHEST_DOUBLE = new ResourceLocation(Constants.MODID, "textures/entity/furniture/storage/chest/oak_fancy_chest_double.png");
    private static final ResourceLocation FANCY_OAK_CHEST = new ResourceLocation(Constants.MODID, "textures/entity/furniture/storage/chest/oak_fancy_chest.png");
    private static final ResourceLocation FANCY_BIRCH_CHEST_DOUBLE = new ResourceLocation(Constants.MODID, "textures/entity/furniture/storage/chest/birch_fancy_chest_double.png");
    private static final ResourceLocation FANCY_BIRCH_CHEST = new ResourceLocation(Constants.MODID, "textures/entity/furniture/storage/chest/birch_fancy_chest.png");
    private static final ResourceLocation FANCY_SPRUCE_CHEST_DOUBLE = new ResourceLocation(Constants.MODID, "textures/entity/furniture/storage/chest/spruce_fancy_chest_double.png");
    private static final ResourceLocation FANCY_SPRUCE_CHEST = new ResourceLocation(Constants.MODID, "textures/entity/furniture/storage/chest/spruce_fancy_chest.png");
    private static final ResourceLocation FANCY_JUNGLE_CHEST_DOUBLE = new ResourceLocation(Constants.MODID, "textures/entity/furniture/storage/chest/jungle_fancy_chest_double.png");
    private static final ResourceLocation FANCY_JUNGLE_CHEST = new ResourceLocation(Constants.MODID, "textures/entity/furniture/storage/chest/jungle_fancy_chest.png");
    private static final ResourceLocation FANCY_DARK_OAK_CHEST_DOUBLE = new ResourceLocation(Constants.MODID, "textures/entity/furniture/storage/chest/dark_oak_fancy_chest_double.png");
    private static final ResourceLocation FANCY_DARK_OAK_CHEST = new ResourceLocation(Constants.MODID, "textures/entity/furniture/storage/chest/dark_oak_fancy_chest.png");
    private static final ResourceLocation FANCY_ACACIA_CHEST_DOUBLE = new ResourceLocation(Constants.MODID, "textures/entity/furniture/storage/chest/acacia_fancy_chest_double.png");
    private static final ResourceLocation FANCY_ACACIA_CHEST = new ResourceLocation(Constants.MODID, "textures/entity/furniture/storage/chest/acacia_fancy_chest.png");
    
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
            switch(blockName)
            {
                default:
                case "embellishcraft:oak_fancy_chest":
                    resourcelocation = doubleChest ? FANCY_OAK_CHEST_DOUBLE : FANCY_OAK_CHEST;
                    break;
                case "embellishcraft:birch_fancy_chest":
                    resourcelocation = doubleChest ? FANCY_BIRCH_CHEST_DOUBLE : FANCY_BIRCH_CHEST;
                    break;
                case "embellishcraft:spruce_fancy_chest":
                    resourcelocation = doubleChest ? FANCY_SPRUCE_CHEST_DOUBLE : FANCY_SPRUCE_CHEST;
                    break;
                case "embellishcraft:jungle_fancy_chest":
                    resourcelocation = doubleChest ? FANCY_JUNGLE_CHEST_DOUBLE : FANCY_JUNGLE_CHEST;
                    break;
                case "embellishcraft:dark_oak_fancy_chest":
                    resourcelocation = doubleChest ? FANCY_DARK_OAK_CHEST_DOUBLE : FANCY_DARK_OAK_CHEST;
                    break;
                case "embellishcraft:acacia_fancy_chest":
                    resourcelocation = doubleChest ? FANCY_ACACIA_CHEST_DOUBLE : FANCY_ACACIA_CHEST;
            }
        }

        this.bindTexture(resourcelocation);
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
