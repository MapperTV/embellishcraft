package tv.mapper.embellishcraft.block;

import javax.annotation.Nullable;

import net.minecraft.block.BlockState;
import net.minecraft.block.StairsBlock;
import net.minecraftforge.common.ToolType;

public class CustomStairsBlock extends StairsBlock
{
    private ToolType toolType = null;

    @SuppressWarnings("deprecation")
    public CustomStairsBlock(BlockState state, Properties properties)
    {
        super(state, properties);
    }

    @SuppressWarnings("deprecation")
    public CustomStairsBlock(BlockState state, Properties properties, ToolType toolType)
    {
        super(state, properties);
        this.toolType = toolType;
    }

    @Nullable
    @Override
    public net.minecraftforge.common.ToolType getHarvestTool(BlockState state)
    {
        if(toolType != null)
            return this.toolType;
        else
            return super.getHarvestTool(state);
    }

}
