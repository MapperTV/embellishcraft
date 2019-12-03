package tv.mapper.embellishcraft.inventory.container;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.container.Container;
import net.minecraft.inventory.container.Slot;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IWorldPosCallable;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.SlotItemHandler;
import net.minecraftforge.items.wrapper.InvWrapper;
import tv.mapper.embellishcraft.init.ModBlocks;
import tv.mapper.embellishcraft.init.ModContainers;

public class LockerContainer extends Container
{
    private TileEntity tileEntity;
    private PlayerEntity playerEntity;
    private IItemHandler playerInventory;

    public LockerContainer(int id, World world, BlockPos pos, PlayerInventory playerInventory, PlayerEntity player)
    {
        super(ModContainers.LOCKER, id);
        tileEntity = world.getTileEntity(pos);
        this.playerEntity = player;
        this.playerInventory = new InvWrapper(playerInventory);

        tileEntity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY).ifPresent(h ->
        {
            // addSlotBox(playerInventory, 9, 10, 10, 9, 18, 3, 18);
            // addSlot(new SlotItemHandler(h, 0, 10, 17));
            // addSlot(new SlotItemHandler(h, 1, 10, 111));

            int index = 0;
            int x = 53;
            int y = 18;
            int dx = 18;
            int dy = 18;

            for(int j = 0; j < 6; j++)
            {
                for(int i = 0; i < 4; i++)
                {
                    addSlot(new SlotItemHandler(h, index, x, y));
                    x += dx;
                    index++;
                }
                x = 53;
                y += dy;
            }
        });
        layoutPlayerInventorySlots(8, 140);
    }

    @Override
    public boolean canInteractWith(PlayerEntity playerIn)
    {
        return isWithinUsableDistance(IWorldPosCallable.of(tileEntity.getWorld(), tileEntity.getPos()), playerEntity, ModBlocks.LOCKER);
    }

    @Override
    public ItemStack transferStackInSlot(PlayerEntity playerIn, int index)
    {
        ItemStack itemstack = ItemStack.EMPTY;
        Slot slot = this.inventorySlots.get(index);
        if(slot != null && slot.getHasStack())
        {
            ItemStack stack = slot.getStack();
            itemstack = stack.copy();
            if(index == 0)
            {
                if(!this.mergeItemStack(stack, 1, 37, true))
                {
                    return ItemStack.EMPTY;
                }
                slot.onSlotChange(stack, itemstack);
            }
            else
            {
                if(stack.getItem() == Items.IRON_INGOT)
                {
                    if(!this.mergeItemStack(stack, 0, 1, false))
                    {
                        return ItemStack.EMPTY;
                    }
                }
                else if(index < 28)
                {
                    if(!this.mergeItemStack(stack, 28, 37, false))
                    {
                        return ItemStack.EMPTY;
                    }
                }
                else if(index < 37 && !this.mergeItemStack(stack, 1, 28, false))
                {
                    return ItemStack.EMPTY;
                }
            }

            if(stack.isEmpty())
            {
                slot.putStack(ItemStack.EMPTY);
            }
            else
            {
                slot.onSlotChanged();
            }

            if(stack.getCount() == itemstack.getCount())
            {
                return ItemStack.EMPTY;
            }

            slot.onTake(playerIn, stack);
        }

        return itemstack;
    }

    private int addSlotRange(IItemHandler handler, int index, int x, int y, int amount, int dx)
    {
        for(int i = 0; i < amount; i++)
        {
            addSlot(new SlotItemHandler(handler, index, x, y));
            x += dx;
            index++;
        }
        return index;
    }

    private int addSlotBox(IItemHandler handler, int index, int x, int y, int horAmount, int dx, int verAmount, int dy)
    {
        for(int j = 0; j < verAmount; j++)
        {
            index = addSlotRange(handler, index, x, y, horAmount, dx);
            y += dy;
        }
        return index;
    }

    private void layoutPlayerInventorySlots(int leftCol, int topRow)
    {
        // Player inventory
        addSlotBox(playerInventory, 9, leftCol, topRow, 9, 18, 3, 18);

        // Hotbar
        topRow += 58;
        addSlotRange(playerInventory, 0, leftCol, topRow, 9, 18);
    }

}
