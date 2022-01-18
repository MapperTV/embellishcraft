package tv.mapper.embellishcraft.furniture.world.level.block.entity;

import net.minecraft.core.BlockPos;
import net.minecraft.network.protocol.game.ClientboundBlockEntityDataPacket;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import tv.mapper.embellishcraft.core.util.WoodsType;
import tv.mapper.embellishcraft.core.world.block.entity.ModTileEntityTypes;
import tv.mapper.embellishcraft.furniture.world.level.block.CustomBedBlock;

public class CustomBedTileEntity extends BlockEntity
{
    private DyeColor color;
    private WoodsType wood;

    public CustomBedTileEntity(BlockPos worldPosition, BlockState blockState)
    {
        super(ModTileEntityTypes.CUSTOM_BED, worldPosition, blockState);
    }

    public CustomBedTileEntity(BlockPos worldPosition, BlockState blockState, DyeColor color, WoodsType wood)
    {
        this(worldPosition, blockState);
        this.setColor(color);
        this.setWood(wood);
    }

    /**
     * Retrieves packet to send to the client whenever this Tile Entity is resynced via World.notifyBlockUpdate. For
     * modded TE's, this packet comes back to you clientside in {@link #onDataPacket}
     */
    public ClientboundBlockEntityDataPacket getUpdatePacket()
    {
        return ClientboundBlockEntityDataPacket.create(this);
    }

    @OnlyIn(Dist.CLIENT)
    public DyeColor getColor()
    {
        if(this.color == null)
        {
            this.color = ((CustomBedBlock)this.getBlockState().getBlock()).getColor();
        }

        return this.color;
    }

    public void setColor(DyeColor color)
    {
        this.color = color;
    }

    @OnlyIn(Dist.CLIENT)
    public WoodsType getWood()
    {
        if(this.wood == null)
        {
            this.wood = ((CustomBedBlock)this.getBlockState().getBlock()).getWood();
        }

        return this.wood;
    }

    public void setWood(WoodsType wood)
    {
        this.wood = wood;
    }
}