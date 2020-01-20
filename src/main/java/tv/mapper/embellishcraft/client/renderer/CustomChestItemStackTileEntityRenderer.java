package tv.mapper.embellishcraft.client.renderer;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.tileentity.ItemStackTileEntityRenderer;
import net.minecraft.client.renderer.tileentity.TileEntityRenderer;
import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.item.ItemStack;
import tv.mapper.embellishcraft.block.CustomChestBlock;
import tv.mapper.embellishcraft.tileentity.CustomChestTileEntity;

public class CustomChestItemStackTileEntityRenderer extends ItemStackTileEntityRenderer
{
    @Override
    public void renderByItem(ItemStack itemStack)
    {
        Block block = Block.getBlockFromItem(itemStack.getItem());
        if(block instanceof CustomChestBlock)
        {
            CustomChestTileEntity tileEntity = new CustomChestTileEntity(((CustomChestBlock)block).getWood());
            TileEntityRenderer<CustomChestTileEntity> tileEntityRenderer = TileEntityRendererDispatcher.instance.getRenderer(tileEntity);
            if(tileEntityRenderer instanceof CustomChestTileEntityRenderer)
            {
                CustomChestTileEntityRenderer<CustomChestTileEntity> customChestTileEntityRenderer = (CustomChestTileEntityRenderer<CustomChestTileEntity>)tileEntityRenderer;
                customChestTileEntityRenderer.render(tileEntity, 0.0D, 0.0D, 0.0D, 0.0F, -1, block.getRegistryName().toString());
            }
        }
        else
        {
            super.renderByItem(itemStack);
        }
    }
}
