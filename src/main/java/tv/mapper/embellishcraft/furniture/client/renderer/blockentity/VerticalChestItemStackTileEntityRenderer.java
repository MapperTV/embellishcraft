package tv.mapper.embellishcraft.furniture.client.renderer.blockentity;
//package tv.mapper.embellishcraft.client.renderer;
//
//import net.minecraft.block.Block;
//import net.minecraft.client.renderer.tileentity.ItemStackTileEntityRenderer;
//import net.minecraft.client.renderer.tileentity.TileEntityRenderer;
//import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
//import net.minecraft.item.ItemStack;
//import tv.mapper.embellishcraft.block.VerticalChestBlock;
//import tv.mapper.embellishcraft.tileentity.VerticalChestTileEntity;
//
//public class VerticalChestItemStackTileEntityRenderer extends ItemStackTileEntityRenderer
//{
//    @Override
//    public void renderByItem(ItemStack itemStack)
//    {
//        Block block = Block.getBlockFromItem(itemStack.getItem());
//        if(block instanceof VerticalChestBlock)
//        {
//            VerticalChestTileEntity tileEntity = new VerticalChestTileEntity();
//            TileEntityRenderer<VerticalChestTileEntity> tileEntityRenderer = TileEntityRendererDispatcher.instance.getRenderer(tileEntity);
//            if(tileEntityRenderer instanceof VerticalChestTileEntityRenderer)
//            {
//                VerticalChestTileEntityRenderer<VerticalChestTileEntity> verticalChestTileEntityRenderer = (VerticalChestTileEntityRenderer<VerticalChestTileEntity>)tileEntityRenderer;
//
//                verticalChestTileEntityRenderer.render(tileEntity, 0.0D, 0.0D, 0.0D, 0.0F, -1);
//            }
//        }
//        else
//        {
//            super.renderByItem(itemStack);
//        }
//    }
//}
