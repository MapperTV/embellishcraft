package tv.mapper.embellishcraft.block;

import net.minecraft.block.BedBlock;
import net.minecraft.item.DyeColor;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockReader;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import tv.mapper.embellishcraft.tileentity.CustomBedTileEntity;
import tv.mapper.embellishcraft.util.WoodType;

public class CustomBedBlock extends BedBlock
{
    private final WoodType wood;

    public CustomBedBlock(DyeColor colorIn, WoodType wood, Properties properties)
    {
        super(colorIn, properties);
        this.wood = wood;
    }

    @Override
    public TileEntity createNewTileEntity(IBlockReader worldIn)
    {
        return new CustomBedTileEntity(this.getColor(), this.getWood());
    }

    @OnlyIn(Dist.CLIENT)
    public WoodType getWood()
    {
        return this.wood;
    }

}
