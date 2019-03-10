package tv.mapper.embellishcraft.block;

import net.minecraft.block.BlockWall;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorldReaderBase;

public class BlockCustomWall extends BlockWall
{

    public BlockCustomWall(Properties builder)
    {
        super(builder);
    }

    public boolean canPlaceTorchOnTop(IBlockState state, IWorldReaderBase world, BlockPos pos)
    {
        return true;
    }

}
