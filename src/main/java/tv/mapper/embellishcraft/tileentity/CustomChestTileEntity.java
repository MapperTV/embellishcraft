package tv.mapper.embellishcraft.tileentity;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.ChestBlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import tv.mapper.embellishcraft.furniture.world.level.block.CustomChestBlock;
import tv.mapper.embellishcraft.util.WoodsType;

public class CustomChestTileEntity extends ChestBlockEntity
{
    private WoodsType wood;

    protected CustomChestTileEntity(BlockEntityType<?> typeIn, BlockPos p_155328_, BlockState p_155329_, WoodsType wood)
    {
        super(typeIn, p_155328_, p_155329_);
        this.wood = wood;
    }

    public CustomChestTileEntity(BlockPos p_155328_, BlockState p_155329_, WoodsType wood)
    {
        this(ModTileEntityTypes.CUSTOM_CHEST, p_155328_, p_155329_, wood);
    }

    public CustomChestTileEntity(BlockPos p_155328_, BlockState p_155329_)
    {
        this(ModTileEntityTypes.CUSTOM_CHEST, p_155328_, p_155329_, null);
    }

    // @OnlyIn(Dist.CLIENT)
    // public AxisAlignedBB getRenderBoundingBox()
    // {
    // BlockPos pos = getTileEntity().getPos();
    // AxisAlignedBB bb = new AxisAlignedBB(pos.add(-1, 0, -1), pos.add(2, 2, 2));
    // return bb;
    // }

    @OnlyIn(Dist.CLIENT)
    public WoodsType getWood()
    {
        if(this.wood == null)
        {
            this.wood = ((CustomChestBlock)this.getBlockState().getBlock()).getWood();
        }

        return this.wood;
    }

    public void setWood(WoodsType wood)
    {
        this.wood = wood;
    }
}