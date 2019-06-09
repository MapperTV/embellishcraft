package tv.mapper.embellishcraft.block;

import net.minecraft.block.BlockState;
import net.minecraft.block.WallBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorldReader;

public class BlockCustomWall extends WallBlock
{

    public BlockCustomWall(Properties builder)
    {
        super(builder);
    }

    public boolean canPlaceTorchOnTop(BlockState state, IWorldReader world, BlockPos pos)
    {
        return true;
    }

}
