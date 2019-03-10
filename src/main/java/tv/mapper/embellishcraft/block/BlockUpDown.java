package tv.mapper.embellishcraft.block;

import javax.annotation.Nullable;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.util.EnumFacing;

public class BlockUpDown extends Block
{
    public static final BooleanProperty UPSIDE_DOWN = BooleanProperty.create("upside_down");

    public BlockUpDown(Properties properties)
    {
        super(properties);
        this.setDefaultState(this.getDefaultState().with(UPSIDE_DOWN, Boolean.valueOf(false)));
    }

    protected void fillStateContainer(StateContainer.Builder<Block, IBlockState> builder)
    {
        builder.add(UPSIDE_DOWN);
    }

    @Nullable
    public IBlockState getStateForPlacement(BlockItemUseContext context)
    {
        IBlockState state = this.getDefaultState().with(UPSIDE_DOWN, false);
        EnumFacing facing = context.getFace();
        return facing != EnumFacing.DOWN && (facing == EnumFacing.UP || !((double)context.getHitY() > 0.5D)) ? state : state.with(UPSIDE_DOWN, Boolean.valueOf(true));
    }

}
