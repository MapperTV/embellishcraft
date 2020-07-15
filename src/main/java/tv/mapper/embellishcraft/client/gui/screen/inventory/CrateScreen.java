package tv.mapper.embellishcraft.client.gui.screen.inventory;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.platform.GlStateManager;

import net.minecraft.client.gui.IHasContainer;
import net.minecraft.client.gui.screen.inventory.ContainerScreen;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;
import tv.mapper.embellishcraft.ECConstants;
import tv.mapper.embellishcraft.inventory.container.CrateContainer;

public class CrateScreen extends ContainerScreen<CrateContainer> implements IHasContainer<CrateContainer>
{
    private static final ResourceLocation CRATE_SCREEN = new ResourceLocation(ECConstants.MODID, "textures/gui/crate.png");
    private final int inventoryRows;

    private static final int WIDTH = 176;
    private static final int HEIGHT = 185;

    public CrateScreen(CrateContainer p_i51095_1_, PlayerInventory p_i51095_2_, ITextComponent p_i51095_3_)
    {
        super(p_i51095_1_, p_i51095_2_, p_i51095_3_);
        this.passEvents = false;
        this.inventoryRows = p_i51095_1_.getNumRows();
        this.ySize = 114 + this.inventoryRows * 18;
    }

    protected void init()
    {
        super.init();

        guiLeft = this.width / 2 - WIDTH / 2;
        guiTop = this.height / 2 - HEIGHT / 2;
    }

    public void render(MatrixStack stack, int p_render_1_, int p_render_2_, float p_render_3_)
    {
        this.renderBackground(stack);
        super.render(stack, p_render_1_, p_render_2_, p_render_3_);
        this.func_230459_a_(stack, p_render_1_, p_render_2_);
    }

    /**
     * Draw the foreground layer for the GuiContainer (everything in front of the items)
     */
    protected void func_230451_b_(MatrixStack stack, int mouseX, int mouseY)
    {
        this.font.drawString(stack, this.title.getString(), 8.0F, 6.0F, 4210752);
        this.font.drawString(stack, this.playerInventory.getDisplayName().getString(), 8.0F, (float)(this.ySize - 96 + 2), 4210752);
    }

    /**
     * Draws the background layer of this container (behind the items).
     */
    @SuppressWarnings("deprecation")
    protected void func_230450_a_(MatrixStack stack, float partialTicks, int mouseX, int mouseY)
    {
        GlStateManager.color4f(1.0F, 1.0F, 1.0F, 1.0F);
        this.minecraft.getTextureManager().bindTexture(CRATE_SCREEN);
        this.blit(stack, guiLeft, guiTop, 0, 0, WIDTH, HEIGHT);
    }
}