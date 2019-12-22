package tv.mapper.embellishcraft.client.gui.screen.inventory;

import com.mojang.blaze3d.platform.GlStateManager;

import net.minecraft.client.gui.IHasContainer;
import net.minecraft.client.gui.screen.inventory.ContainerScreen;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;
import tv.mapper.embellishcraft.inventory.container.CrateContainer;

public class CrateScreen extends ContainerScreen<CrateContainer> implements IHasContainer<CrateContainer>
{
    private static final ResourceLocation CRATE_SCREEN = new ResourceLocation("textures/gui/container/generic_54.png");
    private final int inventoryRows;

    public CrateScreen(CrateContainer p_i51095_1_, PlayerInventory p_i51095_2_, ITextComponent p_i51095_3_)
    {
        super(p_i51095_1_, p_i51095_2_, p_i51095_3_);
        this.passEvents = false;
        this.inventoryRows = p_i51095_1_.getNumRows();
        this.ySize = 114 + this.inventoryRows * 18;
    }

    public void render(int p_render_1_, int p_render_2_, float p_render_3_)
    {
        this.renderBackground();
        super.render(p_render_1_, p_render_2_, p_render_3_);
        this.renderHoveredToolTip(p_render_1_, p_render_2_);
    }

    /**
     * Draw the foreground layer for the GuiContainer (everything in front of the items)
     */
    protected void drawGuiContainerForegroundLayer(int mouseX, int mouseY)
    {
        this.font.drawString(this.title.getFormattedText(), 8.0F, 6.0F, 4210752);
        this.font.drawString(this.playerInventory.getDisplayName().getFormattedText(), 8.0F, (float)(this.ySize - 96 + 2), 4210752);
    }

    /**
     * Draws the background layer of this container (behind the items).
     */
    protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY)
    {
        GlStateManager.color4f(1.0F, 1.0F, 1.0F, 1.0F);
        this.minecraft.getTextureManager().bindTexture(CRATE_SCREEN);
        int i = (this.width - this.xSize) / 2;
        int j = (this.height - this.ySize) / 2;
        this.blit(i, j, 0, 0, this.xSize, this.inventoryRows * 18 + 17);
        this.blit(i, j + this.inventoryRows * 18 + 17, 0, 126, this.xSize, 96);
    }
}