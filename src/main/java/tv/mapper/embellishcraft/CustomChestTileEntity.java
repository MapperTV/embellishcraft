package tv.mapper.embellishcraft;

import net.minecraft.tileentity.ChestTileEntity;
import net.minecraft.tileentity.TileEntityType;
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
}
