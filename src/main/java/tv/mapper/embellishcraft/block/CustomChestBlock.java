package tv.mapper.embellishcraft.block;

import java.util.function.Supplier;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.ChestBlock;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.ChestBlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import tv.mapper.embellishcraft.tileentity.CustomChestTileEntity;
import tv.mapper.embellishcraft.util.CustomChestType;
import tv.mapper.embellishcraft.util.WoodsType;

public class CustomChestBlock extends ChestBlock
{
    private CustomChestType type;
    protected final WoodsType wood;

    public CustomChestBlock(Properties properties, Supplier<BlockEntityType<? extends ChestBlockEntity>> supplier, CustomChestType type, WoodsType wood)
    {
        super(properties, supplier);
        this.type = type;
        this.wood = wood;
    }

    public BlockEntity newBlockEntity(BlockPos p_153215_, BlockState p_153216_, BlockGetter worldIn)
    {
        return new CustomChestTileEntity(p_153215_, p_153216_, wood);
    }

    public void setPlacedBy(Level worldIn, BlockPos pos, BlockState state, LivingEntity placer, ItemStack stack)
    {
        if(stack.hasCustomHoverName())
        {
            BlockEntity tileentity = worldIn.getBlockEntity(pos);
            if(tileentity instanceof CustomChestTileEntity)
            {
                ((CustomChestTileEntity)tileentity).setCustomName(stack.getHoverName());
            }
        }
    }

    public CustomChestType getChestType()
    {
        return type;
    }

    @OnlyIn(Dist.CLIENT)
    public WoodsType getWood()
    {
        return this.wood;
    }

    @Override
    public RenderShape getRenderShape(BlockState state)
    {
        return RenderShape.MODEL;
    }
}