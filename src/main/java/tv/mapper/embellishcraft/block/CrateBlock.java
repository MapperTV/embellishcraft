package tv.mapper.embellishcraft.block;

import java.util.List;

import javax.annotation.Nullable;

import net.minecraft.block.BlockRenderType;
import net.minecraft.block.BlockState;
import net.minecraft.block.ContainerBlock;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.ItemStackHelper;
import net.minecraft.inventory.container.INamedContainerProvider;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.NonNullList;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraft.world.storage.loot.LootContext;
import net.minecraft.world.storage.loot.LootParameters;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.ToolType;
import tv.mapper.embellishcraft.tileentity.CrateTileEntity;

public class CrateBlock extends ContainerBlock
{
    public static final ResourceLocation CONTENTS = new ResourceLocation("contents");

    public CrateBlock(Properties properties)
    {
        super(properties);
    }

    @Override
    public boolean hasTileEntity(BlockState state)
    {
        return true;
    }

    @Override
    public ActionResultType onBlockActivated(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockRayTraceResult result)
    {
        if(!world.isRemote)
        {
            TileEntity tileEntity = world.getTileEntity(pos);
            if(tileEntity instanceof CrateTileEntity)
            {
                INamedContainerProvider inamedcontainerprovider = this.getContainer(state, world, pos);

                if(inamedcontainerprovider != null)
                {
                    player.openContainer(inamedcontainerprovider);
                }
            }
            else
            {
                throw new IllegalStateException("Attempted to open a crate while it was not one!");
            }
            return ActionResultType.SUCCESS;
        }
        return ActionResultType.SUCCESS;
    }

    public void onBlockHarvested(World worldIn, BlockPos pos, BlockState state, PlayerEntity player)
    {
        TileEntity tileentity = worldIn.getTileEntity(pos);
        if(tileentity instanceof CrateTileEntity)
        {
            CrateTileEntity crate = (CrateTileEntity)tileentity;
            if(!worldIn.isRemote && player.isCreative() && !crate.isEmpty())
            {
                ItemStack itemstack = new ItemStack(this.getBlock());
                CompoundNBT compoundnbt = crate.saveToNbt(new CompoundNBT());
                if(!compoundnbt.isEmpty())
                {
                    itemstack.setTagInfo("BlockEntityTag", compoundnbt);
                }

                if(crate.hasCustomName())
                {
                    itemstack.setDisplayName(crate.getCustomName());
                }

                ItemEntity itementity = new ItemEntity(worldIn, (double)pos.getX(), (double)pos.getY(), (double)pos.getZ(), itemstack);
                itementity.setDefaultPickupDelay();
                worldIn.addEntity(itementity);
            }
            else
            {
                crate.fillWithLoot(player);
            }
        }

        super.onBlockHarvested(worldIn, pos, state, player);
    }

    @OnlyIn(Dist.CLIENT)
    public void addInformation(ItemStack stack, @Nullable IBlockReader worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn)
    {
        super.addInformation(stack, worldIn, tooltip, flagIn);
        CompoundNBT compoundnbt = stack.getChildTag("BlockEntityTag");
        if(compoundnbt != null)
        {
            if(compoundnbt.contains("LootTable", 8))
            {
                tooltip.add(new StringTextComponent("???????"));
            }

            if(compoundnbt.contains("Items", 9))
            {
                NonNullList<ItemStack> nonnulllist = NonNullList.withSize(27, ItemStack.EMPTY);
                ItemStackHelper.loadAllItems(compoundnbt, nonnulllist);
                int i = 0;
                int j = 0;

                for(ItemStack itemstack : nonnulllist)
                {
                    if(!itemstack.isEmpty())
                    {
                        ++j;
                        if(i <= 4)
                        {
                            ++i;
                            ITextComponent itextcomponent = itemstack.getDisplayName().deepCopy();
                            itextcomponent.appendText(" x").appendText(String.valueOf(itemstack.getCount()));
                            tooltip.add(itextcomponent);
                        }
                    }
                }

                if(j - i > 0)
                {
                    tooltip.add((new TranslationTextComponent("container.shulkerBox.more", j - i)).applyTextStyle(TextFormatting.ITALIC));
                }
            }
        }

    }

    @SuppressWarnings("deprecation")
    public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder)
    {
        TileEntity tileentity = builder.get(LootParameters.BLOCK_ENTITY);
        if(tileentity instanceof CrateTileEntity)
        {
            CrateTileEntity crate = (CrateTileEntity)tileentity;
            builder = builder.withDynamicDrop(CONTENTS, (p_220168_1_, p_220168_2_) ->
            {
                for(int i = 0; i < crate.getSizeInventory(); ++i)
                {
                    p_220168_2_.accept(crate.getStackInSlot(i));
                }

            });
        }

        return super.getDrops(state, builder);
    }

    @SuppressWarnings("deprecation")
    @Override
    public void onReplaced(BlockState state, World worldIn, BlockPos pos, BlockState newState, boolean isMoving)
    {
        if(state.getBlock() != newState.getBlock())
        {
            TileEntity tileentity = worldIn.getTileEntity(pos);
            if(tileentity instanceof CrateTileEntity)
            {
                worldIn.updateComparatorOutputLevel(pos, state.getBlock());
            }

            super.onReplaced(state, worldIn, pos, newState, isMoving);
        }
    }

    @Override
    public BlockRenderType getRenderType(BlockState state)
    {
        return BlockRenderType.MODEL;
    }

    @Override
    public TileEntity createNewTileEntity(IBlockReader worldIn)
    {
        return new CrateTileEntity();
    }

    @Nullable
    @Override
    public ToolType getHarvestTool(BlockState state)
    {
        return super.getHarvestTool(state);
    }
}
