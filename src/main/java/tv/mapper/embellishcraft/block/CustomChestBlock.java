package tv.mapper.embellishcraft.block;

import net.minecraft.block.BlockState;
import net.minecraft.block.ChestBlock;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import tv.mapper.embellishcraft.tileentity.CustomChestTileEntity;

public class CustomChestBlock extends ChestBlock
{

    public CustomChestBlock(Properties properties)
    {
        super(properties);
    }

    public TileEntity createNewTileEntity(IBlockReader worldIn)
    {
        return new CustomChestTileEntity();
    }

    public void onBlockPlacedBy(World worldIn, BlockPos pos, BlockState state, LivingEntity placer, ItemStack stack)
    {
        if(stack.hasDisplayName())
        {
            TileEntity tileentity = worldIn.getTileEntity(pos);
            if(tileentity instanceof CustomChestTileEntity)
            {
                ((CustomChestTileEntity)tileentity).setCustomName(stack.getDisplayName());
            }
        }
    }
}
