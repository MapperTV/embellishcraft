package tv.mapper.embellishcraft.client.renderer;

import net.minecraft.client.renderer.tileentity.ItemStackTileEntityRenderer;
import net.minecraft.client.renderer.tileentity.TileEntityRenderer;
import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import tv.mapper.embellishcraft.block.CustomBedBlock;
import tv.mapper.embellishcraft.tileentity.CustomBedTileEntity;

public class CustomBedItemStackTileEntityRenderer extends ItemStackTileEntityRenderer
{
    public void renderByItem(ItemStack itemStackIn)
    {
        Item item = itemStackIn.getItem();
        if(item instanceof BlockItem && ((BlockItem)item).getBlock() instanceof CustomBedBlock)
        {
            CustomBedTileEntity tileEntity = new CustomBedTileEntity();
            TileEntityRenderer<CustomBedTileEntity> tileEntityRenderer = TileEntityRendererDispatcher.instance.getRenderer(tileEntity);
            if(tileEntityRenderer instanceof CustomBedTileEntityRenderer)
            {
                tileEntity.setWood(((CustomBedBlock)((BlockItem)item).getBlock()).getWood());
                tileEntity.setColor(((CustomBedBlock)((BlockItem)item).getBlock()).getColor());

                CustomBedTileEntityRenderer<CustomBedTileEntity> customBedTileEntityRenderer = (CustomBedTileEntityRenderer<CustomBedTileEntity>)tileEntityRenderer;

                customBedTileEntityRenderer.render(tileEntity, 0.0D, 0.0D, 0.0D, 0.0F, -1);
            }
        }
    }
}
