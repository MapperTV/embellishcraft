package tv.mapper.embellishcraft.tileentity;

import net.minecraft.item.DyeColor;
import net.minecraft.network.play.server.SUpdateTileEntityPacket;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import tv.mapper.embellishcraft.block.CustomBedBlock;
import tv.mapper.embellishcraft.util.WoodsType;

public class CustomBedTileEntity extends TileEntity
{
    private DyeColor color;
    private WoodsType wood;

    public CustomBedTileEntity()
    {
        super(ModTileEntityTypes.CUSTOM_BED);
    }

    public CustomBedTileEntity(DyeColor color, WoodsType wood)
    {
        this();
        this.setColor(color);
        this.setWood(wood);
    }

    /**
     * Retrieves packet to send to the client whenever this Tile Entity is resynced via World.notifyBlockUpdate. For
     * modded TE's, this packet comes back to you clientside in {@link #onDataPacket}
     */
    public SUpdateTileEntityPacket getUpdatePacket()
    {
        return new SUpdateTileEntityPacket(this.pos, 11, this.getUpdateTag());
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