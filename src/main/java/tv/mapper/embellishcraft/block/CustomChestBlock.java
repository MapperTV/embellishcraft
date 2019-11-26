package tv.mapper.embellishcraft.block;

import net.minecraft.block.ChestBlock;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockReader;
import tv.mapper.embellishcraft.CustomChestTileEntity;

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
}
