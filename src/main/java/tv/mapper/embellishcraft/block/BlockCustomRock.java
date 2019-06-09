package tv.mapper.embellishcraft.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.util.IItemProvider;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BlockCustomRock extends Block
{
    private Block drop;

    public BlockCustomRock(Block.Properties builder, Block drop)
    {
        super(builder);
        this.drop = drop;
    }

    public IItemProvider getItemDropped(BlockState state, World worldIn, BlockPos pos, int fortune)
    {
        return drop;
    }
}
