//package tv.mapper.embellishcraft.block;
//
//import net.minecraft.block.BlockState;
//import net.minecraft.block.ChestBlock;
//import net.minecraft.entity.LivingEntity;
//import net.minecraft.item.ItemStack;
//import net.minecraft.tileentity.TileEntity;
//import net.minecraft.util.math.BlockPos;
//import net.minecraft.world.IBlockReader;
//import net.minecraft.world.World;
//import net.minecraftforge.api.distmarker.Dist;
//import net.minecraftforge.api.distmarker.OnlyIn;
//import tv.mapper.embellishcraft.tileentity.CustomChestTileEntity;
//import tv.mapper.embellishcraft.util.CustomChestType;
//import tv.mapper.embellishcraft.util.WoodType;
//
//public class CustomChestBlock extends ChestBlock
//{
//    private CustomChestType type;
//    protected final WoodType wood;
//
//    public CustomChestBlock(Properties properties, CustomChestType type, WoodType wood)
//    {
//        super(properties);
//        this.type = type;
//        this.wood = wood;
//    }
//
//    public TileEntity createNewTileEntity(IBlockReader worldIn)
//    {
//        return new CustomChestTileEntity(wood);
//    }
//
//    public void onBlockPlacedBy(World worldIn, BlockPos pos, BlockState state, LivingEntity placer, ItemStack stack)
//    {
//        if(stack.hasDisplayName())
//        {
//            TileEntity tileentity = worldIn.getTileEntity(pos);
//            if(tileentity instanceof CustomChestTileEntity)
//            {
//                ((CustomChestTileEntity)tileentity).setCustomName(stack.getDisplayName());
//            }
//        }
//    }
//
//    public CustomChestType getChestType()
//    {
//        return type;
//    }
//
//    @OnlyIn(Dist.CLIENT)
//    public WoodType getWood()
//    {
//        return this.wood;
//    }
//}
