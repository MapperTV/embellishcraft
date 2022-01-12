package tv.mapper.embellishcraft.furniture.world.level.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.BedBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BedPart;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import tv.mapper.embellishcraft.tileentity.CustomBedTileEntity;
import tv.mapper.embellishcraft.util.WoodsType;
import tv.mapper.mapperbase.world.level.block.ToolManager;
import tv.mapper.mapperbase.world.level.block.ToolTiers;
import tv.mapper.mapperbase.world.level.block.ToolTypes;

public class CustomBedBlock extends BedBlock implements ToolManager
{
    protected final WoodsType wood;
    protected final DyeColor bedColor;

    protected ToolTiers tier;
    protected ToolTypes tool;

    protected static final VoxelShape head_w = Block.box(0.0D, 9.0D, 0.0D, 2.0D, 16.0D, 16.0D);
    protected static final VoxelShape head_e = Block.box(14.0D, 9.0D, 0.0D, 16.0D, 16.0D, 16.0D);
    protected static final VoxelShape head_s = Block.box(0.0D, 9.0D, 14.0D, 16.0D, 16.0D, 16.0D);
    protected static final VoxelShape head_n = Block.box(0.0D, 9.0D, 0.0D, 16.0D, 16.0D, 2.0D);
    protected static final VoxelShape foot_w = Block.box(0.0D, 9.0D, 0.0D, 2.0D, 13.0D, 16.0D);
    protected static final VoxelShape foot_e = Block.box(14.0D, 9.0D, 0.0D, 16.0D, 13.0D, 16.0D);
    protected static final VoxelShape foot_s = Block.box(0.0D, 9.0D, 14.0D, 16.0D, 13.0D, 16.0D);
    protected static final VoxelShape foot_n = Block.box(0.0D, 9.0D, 0.0D, 16.0D, 13.0D, 2.0D);

    public CustomBedBlock(DyeColor colorIn, WoodsType wood, Properties properties, ToolTypes tool)
    {
        super(colorIn, properties);
        this.bedColor = colorIn;
        this.wood = wood;
        this.tool = tool;
        this.tier = ToolTiers.WOOD;
    }

    public CustomBedBlock(DyeColor colorIn, WoodsType wood, Properties properties, ToolTypes tool, ToolTiers tier)
    {
        super(colorIn, properties);
        this.bedColor = colorIn;
        this.wood = wood;
        this.tool = tool;
        this.tier = tier;
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter worldIn, BlockPos pos, CollisionContext context)
    {
        Direction direction = state.getValue(FACING);
        Direction direction1 = state.getValue(PART) == BedPart.HEAD ? direction : direction.getOpposite();

        if(state.getValue(PART) == BedPart.HEAD)
        {
            switch(direction1)
            {
                case NORTH:
                    return Shapes.or(head_n, NORTH_SHAPE);
                case SOUTH:
                    return Shapes.or(head_s, SOUTH_SHAPE);
                case WEST:
                    return Shapes.or(head_w, WEST_SHAPE);
                default:
                    return Shapes.or(head_e, EAST_SHAPE);
            }
        }
        else
        {
            switch(direction1)
            {
                case NORTH:
                    return Shapes.or(foot_n, NORTH_SHAPE);
                case SOUTH:
                    return Shapes.or(foot_s, SOUTH_SHAPE);
                case WEST:
                    return Shapes.or(foot_w, WEST_SHAPE);
                default:
                    return Shapes.or(foot_e, EAST_SHAPE);
            }
        }
    }

    @Override
    public BlockEntity newBlockEntity(BlockPos p_153215_, BlockState p_153216_)
    {
        return new CustomBedTileEntity(p_153215_, p_153216_, this.bedColor, this.wood);
    }

    @OnlyIn(Dist.CLIENT)
    public WoodsType getWood()
    {
        return this.wood;
    }

    @Override
    public RenderShape getRenderShape(BlockState state)
    {
        return RenderShape.MODEL;
    }

    @Override
    public ToolTiers getTier()
    {
        return this.tier;
    }

    @Override
    public ToolTypes getTool()
    {
        return this.tool;
    }
}