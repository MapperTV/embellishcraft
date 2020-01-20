package tv.mapper.embellishcraft.tileentity;

import net.minecraft.tileentity.ChestTileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import tv.mapper.embellishcraft.block.CustomChestBlock;
import tv.mapper.embellishcraft.init.ModTileEntityTypes;
import tv.mapper.embellishcraft.util.WoodType;

public class CustomChestTileEntity extends ChestTileEntity
{
    private WoodType wood;

    protected CustomChestTileEntity(TileEntityType<?> typeIn, WoodType wood)
    {
        super(typeIn);
        this.wood = wood;
    }

    public CustomChestTileEntity(WoodType wood)
    {
        this(ModTileEntityTypes.CUSTOM_CHEST, wood);
    }
    
    public CustomChestTileEntity()
    {
        this(ModTileEntityTypes.CUSTOM_CHEST, null);
    }

    @OnlyIn(Dist.CLIENT)
    public AxisAlignedBB getRenderBoundingBox()
    {
        BlockPos pos = getTileEntity().getPos();
        AxisAlignedBB bb = new AxisAlignedBB(pos.add(-1, 0, -1), pos.add(2, 2, 2));
        return bb;
    }

    @OnlyIn(Dist.CLIENT)
    public WoodType getWood()
    {
        if(this.wood == null)
        {
            this.wood = ((CustomChestBlock)this.getBlockState().getBlock()).getWood();
        }

        return this.wood;
    }

    public void setWood(WoodType wood)
    {
        this.wood = wood;
    }
}
