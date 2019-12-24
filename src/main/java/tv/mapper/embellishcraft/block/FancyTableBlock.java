package tv.mapper.embellishcraft.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;
import net.minecraftforge.common.ToolType;

public class FancyTableBlock extends TableBlock
{
    protected static final VoxelShape plate = Block.makeCuboidShape(0.0D, 12.0D, 0.0D, 16.0D, 16.0D, 16.0D);

    protected static final VoxelShape leg_north = Block.makeCuboidShape(1.0D, 0.0D, 1.0D, 4.0D, 14.0D, 4.0D);
    protected static final VoxelShape leg_east = Block.makeCuboidShape(12.0D, 0.0D, 1.0D, 15.0D, 14.0D, 4.0D);
    protected static final VoxelShape leg_west = Block.makeCuboidShape(1.0D, 0.0D, 12.0D, 4.0D, 14.0D, 15.0D);
    protected static final VoxelShape leg_south = Block.makeCuboidShape(12.0D, 0.0D, 12.0D, 15.0D, 14.0D, 15.0D);

    public FancyTableBlock(Properties properties)
    {
        super(properties);
    }

    public FancyTableBlock(Properties properties, ToolType toolType)
    {
        super(properties, toolType);
    }

    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context)
    {
        VoxelShape shape = plate;

        if(state.get(TABLE_NORTH))
            shape = VoxelShapes.or(shape, leg_north);

        if(state.get(TABLE_SOUTH))
            shape = VoxelShapes.or(shape, leg_south);

        if(state.get(TABLE_EAST))
            shape = VoxelShapes.or(shape, leg_east);

        if(state.get(TABLE_WEST))
            shape = VoxelShapes.or(shape, leg_west);

        return shape;
    }

}
