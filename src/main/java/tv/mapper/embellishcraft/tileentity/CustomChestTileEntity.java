package tv.mapper.embellishcraft.tileentity;

import net.minecraft.tileentity.ChestTileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import tv.mapper.embellishcraft.init.ModTileEntityTypes;

public class CustomChestTileEntity extends ChestTileEntity
{
    protected CustomChestTileEntity(TileEntityType<?> typeIn)
    {
        super(typeIn);
    }

    public CustomChestTileEntity()
    {
        this(ModTileEntityTypes.CUSTOM_CHEST);
    }

    @OnlyIn(Dist.CLIENT)
    public AxisAlignedBB getRenderBoundingBox()
    {
        BlockPos pos = getTileEntity().getPos();
        AxisAlignedBB bb = new AxisAlignedBB(pos.add(-1, 0, -1), pos.add(2, 2, 2));
        return bb;
    }
}
