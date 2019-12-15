package tv.mapper.embellishcraft.block;

import net.minecraft.block.BedBlock;
import net.minecraft.item.DyeColor;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockReader;
import tv.mapper.embellishcraft.tileentity.CustomBedTileEntity;

public class CustomBedBlock extends BedBlock
{

    public CustomBedBlock(DyeColor colorIn, Properties properties)
    {
        super(colorIn, properties);
    }

    @Override
    public TileEntity createNewTileEntity(IBlockReader worldIn)
    {
        return new CustomBedTileEntity(this.getColor());
    }

}
