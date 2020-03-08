package tv.mapper.embellishcraft.block;

import java.util.function.Supplier;

import net.minecraft.block.BlockRenderType;
import net.minecraft.block.BlockState;
import net.minecraft.block.ChestBlock;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.ChestTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import tv.mapper.embellishcraft.tileentity.CustomChestTileEntity;
import tv.mapper.embellishcraft.util.CustomChestType;
import tv.mapper.embellishcraft.util.WoodsType;

public class CustomChestBlock extends ChestBlock
{
    private CustomChestType type;
    protected final WoodsType wood;

    public CustomChestBlock(Properties properties, Supplier<TileEntityType<? extends ChestTileEntity>> supplier, CustomChestType type, WoodsType wood)
    {
        super(properties, supplier);
        this.type = type;
        this.wood = wood;
    }

    public TileEntity createNewTileEntity(IBlockReader worldIn)
    {
        return new CustomChestTileEntity(wood);
    }

    public void onBlockPlacedBy(World worldIn, BlockPos pos, BlockState state, LivingEntity placer, ItemStack stack)
    {
        if(stack.hasDisplayName())
        {
            TileEntity tileentity = worldIn.getTileEntity(pos);
            if(tileentity instanceof CustomChestTileEntity)
            {
                ((CustomChestTileEntity)tileentity).setCustomName(stack.getDisplayName());
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
    public BlockRenderType getRenderType(BlockState state)
    {
        return BlockRenderType.MODEL;
    }
}
