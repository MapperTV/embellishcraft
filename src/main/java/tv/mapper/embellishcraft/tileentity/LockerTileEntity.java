package tv.mapper.embellishcraft.tileentity;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.container.Container;
import net.minecraft.inventory.container.INamedContainerProvider;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Direction;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.util.INBTSerializable;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.ItemStackHandler;
import tv.mapper.embellishcraft.init.ModTileEntityTypes;
import tv.mapper.embellishcraft.inventory.container.LockerContainer;

public class LockerTileEntity extends TileEntity implements INamedContainerProvider
{
    private LazyOptional<IItemHandler> handler = LazyOptional.of(this::createHandler);

    public LockerTileEntity()
    {
        super(ModTileEntityTypes.LOCKER);
    }

    @Override
    public Container createMenu(int i, PlayerInventory playerInventory, PlayerEntity playerEntity)
    {
        return new LockerContainer(i, world, pos, playerInventory, playerEntity);
    }

    @Override
    public ITextComponent getDisplayName()
    {
        return new StringTextComponent(getType().getRegistryName().getPath());
    }

    @SuppressWarnings("unchecked")
    @Override
    public void read(CompoundNBT tag)
    {
        CompoundNBT invTag = tag.getCompound("inv");
        handler.ifPresent(h -> ((INBTSerializable<CompoundNBT>)h).deserializeNBT(invTag));

        super.read(tag);
    }

    @Override
    public CompoundNBT write(CompoundNBT tag)
    {
        handler.ifPresent(h ->
        {
            @SuppressWarnings("unchecked")
            CompoundNBT compound = ((INBTSerializable<CompoundNBT>)h).serializeNBT();
            tag.put("inv", compound);
        });

        return super.write(tag);
    }

    private IItemHandler createHandler()
    {
        return new ItemStackHandler(16)
        {
            @Override
            protected void onContentsChanged(int slot)
            {
                markDirty();
            }
        };
    }

    @Nonnull
    @Override
    public <T> LazyOptional<T> getCapability(@Nonnull Capability<T> cap, @Nullable Direction side)
    {
        if(cap == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY)
        {
            return handler.cast();
        }
        return super.getCapability(cap, side);
    }

}
