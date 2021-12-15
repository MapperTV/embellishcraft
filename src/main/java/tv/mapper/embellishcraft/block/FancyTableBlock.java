package tv.mapper.embellishcraft.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import tv.mapper.mapperbase.world.level.block.ToolTiers;
import tv.mapper.mapperbase.world.level.block.ToolTypes;

public class FancyTableBlock extends TableBlock
{
    protected static final VoxelShape plate = Block.box(0.0D, 12.0D, 0.0D, 16.0D, 16.0D, 16.0D);

    protected static final VoxelShape leg_north = Block.box(1.0D, 0.0D, 1.0D, 4.0D, 14.0D, 4.0D);
    protected static final VoxelShape leg_east = Block.box(12.0D, 0.0D, 1.0D, 15.0D, 14.0D, 4.0D);
    protected static final VoxelShape leg_west = Block.box(1.0D, 0.0D, 12.0D, 4.0D, 14.0D, 15.0D);
    protected static final VoxelShape leg_south = Block.box(12.0D, 0.0D, 12.0D, 15.0D, 14.0D, 15.0D);

    public FancyTableBlock(Properties properties, ToolTypes tool)
    {
        super(properties, tool);
    }

    public FancyTableBlock(Properties properties, ToolTypes tool, ToolTiers tier)
    {
        super(properties, tool, tier);
    }

    public VoxelShape getShape(BlockState state, BlockGetter worldIn, BlockPos pos, CollisionContext context)
    {
        VoxelShape shape = plate;

        if(state.getValue(TABLE_NORTH))
            shape = Shapes.or(shape, leg_north);

        if(state.getValue(TABLE_SOUTH))
            shape = Shapes.or(shape, leg_south);

        if(state.getValue(TABLE_EAST))
            shape = Shapes.or(shape, leg_east);

        if(state.getValue(TABLE_WEST))
            shape = Shapes.or(shape, leg_west);

        return shape;
    }
}