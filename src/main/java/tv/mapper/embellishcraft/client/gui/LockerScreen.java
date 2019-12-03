package tv.mapper.embellishcraft.client.gui;

import com.mojang.blaze3d.platform.GlStateManager;

import net.minecraft.client.gui.screen.inventory.ContainerScreen;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.container.Container;
import net.minecraft.inventory.container.IContainerListener;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import tv.mapper.embellishcraft.Constants;
import tv.mapper.embellishcraft.inventory.container.LockerContainer;

public class LockerScreen extends ContainerScreen<LockerContainer> implements IContainerListener
{
    private ResourceLocation GUI = new ResourceLocation(Constants.MODID, "textures/gui/locker.png");

    // GUI actual size
    private static final int WIDTH = 176;
    private static final int HEIGHT = 222;

    public LockerScreen(LockerContainer screenContainer, PlayerInventory inv, ITextComponent titleIn)
    {
        super(screenContainer, inv, titleIn);
    }

    protected void init()
    {
        guiLeft = this.width / 2 - WIDTH / 2;
        guiTop = this.height / 2 - HEIGHT / 2;
    }

    @Override
    public void render(int mouseX, int mouseY, float partialTicks)
    {
        this.renderBackground();
        super.render(mouseX, mouseY, partialTicks);
        this.renderHoveredToolTip(mouseX, mouseY);
    }

    @Override
    protected void drawGuiContainerForegroundLayer(int mouseX, int mouseY)
    {
        String screenTitle = new TranslationTextComponent("embellishcraft.container.locker").getString();
        this.font.drawString(screenTitle, (float)(this.xSize / 2 - font.getStringWidth(screenTitle) / 2), 6.0F, 4210752);
        this.font.drawString(this.playerInventory.getDisplayName().getFormattedText(), 8.0F, (float)(this.ySize - 37), 4210752);
    }

    @Override
    protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY)
    {
        GlStateManager.color4f(1.0F, 1.0F, 1.0F, 1.0F);
        this.minecraft.getTextureManager().bindTexture(GUI);
        this.blit(guiLeft, guiTop, 0, 0, WIDTH, HEIGHT);
    }

    @Override
    public void sendAllContents(Container containerToSend, NonNullList<ItemStack> itemsList)
    {

    }

    @Override
    public void sendSlotContents(Container containerToSend, int slotInd, ItemStack stack)
    {

    }

    @Override
    public void sendWindowProperty(Container containerIn, int varToUpdate, int newValue)
    {

    }

}
