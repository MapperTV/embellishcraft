package tv.mapper.embellishcraft.block;

import net.minecraft.block.BedBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockRenderType;
import net.minecraft.block.BlockState;
import net.minecraft.item.DyeColor;
import net.minecraft.state.properties.BedPart;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import tv.mapper.embellishcraft.tileentity.CustomBedTileEntity;
import tv.mapper.embellishcraft.util.WoodsType;

public class CustomBedBlock extends BedBlock
{
    protected final WoodsType wood;
    protected final DyeColor bedColor;

    protected static final VoxelShape head_w = Block.makeCuboidShape(0.0D, 9.0D, 0.0D, 2.0D, 16.0D, 16.0D);
    protected static final VoxelShape head_e = Block.makeCuboidShape(14.0D, 9.0D, 0.0D, 16.0D, 16.0D, 16.0D);
    protected static final VoxelShape head_s = Block.makeCuboidShape(0.0D, 9.0D, 14.0D, 16.0D, 16.0D, 16.0D);
    protected static final VoxelShape head_n = Block.makeCuboidShape(0.0D, 9.0D, 0.0D, 16.0D, 16.0D, 2.0D);
    protected static final VoxelShape foot_w = Block.makeCuboidShape(0.0D, 9.0D, 0.0D, 2.0D, 13.0D, 16.0D);
    protected static final VoxelShape foot_e = Block.makeCuboidShape(14.0D, 9.0D, 0.0D, 16.0D, 13.0D, 16.0D);
    protected static final VoxelShape foot_s = Block.makeCuboidShape(0.0D, 9.0D, 14.0D, 16.0D, 13.0D, 16.0D);
    protected static final VoxelShape foot_n = Block.makeCuboidShape(0.0D, 9.0D, 0.0D, 16.0D, 13.0D, 2.0D);

    public CustomBedBlock(DyeColor colorIn, WoodsType wood, Properties properties)
    {
        super(colorIn, properties);
        this.bedColor = colorIn;
        this.wood = wood;
    }

    @Override
    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context)
    {
        Direction direction = state.get(HORIZONTAL_FACING);
        Direction direction1 = state.get(PART) == BedPart.HEAD ? direction : direction.getOpposite();

        if(state.get(PART) == BedPart.HEAD)
        {
            switch(direction1)
            {
                case NORTH:
                    return VoxelShapes.or(head_n, NORTH_FACING_SHAPE);
                case SOUTH:
                    return VoxelShapes.or(head_s, SOUTH_FACING_SHAPE);
                case WEST:
                    return VoxelShapes.or(head_w, WEST_FACING_SHAPE);
                default:
                    return VoxelShapes.or(head_e, EAST_FACING_SHAPE);
            }
        }
        else
        {
            switch(direction1)
            {
                case NORTH:
                    return VoxelShapes.or(foot_n, NORTH_FACING_SHAPE);
                case SOUTH:
                    return VoxelShapes.or(foot_s, SOUTH_FACING_SHAPE);
                case WEST:
                    return VoxelShapes.or(foot_w, WEST_FACING_SHAPE);
                default:
                    return VoxelShapes.or(foot_e, EAST_FACING_SHAPE);
            }
        }
    }

    @Override
    public TileEntity createNewTileEntity(IBlockReader worldIn)
    {
        return new CustomBedTileEntity(this.bedColor, this.wood);
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