package tv.mapper.embellishcraft.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import tv.mapper.mapperbase.world.level.block.ToolTiers;
import tv.mapper.mapperbase.world.level.block.ToolTypes;

public class TerraceChairBlock extends ChairBlock
{
    // Need to figure a way to rotate VoxelShapes because this is just stupid
    private static final VoxelShape SOUTH_LEFT_FRONT_LEG = Block.box(11.0D, 0.0D, 11.0D, 12.0D, 7.0D, 12.0D);
    private static final VoxelShape SOUTH_RIGHT_FRONT_LEG = Block.box(4.0D, 0.0D, 11.0D, 5.0D, 7.0D, 12.0D);
    private static final VoxelShape SOUTH_LEFT_BACK_LEG = Block.box(12.0D, 0.0D, 3.0D, 13.0D, 16.0D, 4.0D);
    private static final VoxelShape SOUTH_RIGHT_BACK_LEG = Block.box(3.0D, 0.0D, 3.0D, 4.0D, 16.0D, 4.0D);
    private static final VoxelShape SOUTH_SIT = Block.box(3.0D, 7.0D, 3.0D, 13.0D, 8.0D, 13.0D);
    private static final VoxelShape SOUTH_BACK = Block.box(4.0D, 12.0D, 3.0D, 12.0D, 15.0D, 4.0D);
    private static final VoxelShape SOUTH_CHAIR_AABB = Shapes.or(SOUTH_LEFT_FRONT_LEG, Shapes.or(SOUTH_RIGHT_FRONT_LEG, Shapes.or(SOUTH_LEFT_BACK_LEG, Shapes.or(SOUTH_SIT, Shapes.or(SOUTH_BACK, SOUTH_RIGHT_BACK_LEG)))));

    private static final VoxelShape WEST_LEFT_FRONT_LEG = Block.box(4.0D, 0.0D, 11.0D, 5.0D, 7.0D, 12.0D);
    private static final VoxelShape WEST_RIGHT_FRONT_LEG = Block.box(4.0D, 0.0D, 4.0D, 5.0D, 7.0D, 5.0D);
    private static final VoxelShape WEST_LEFT_BACK_LEG = Block.box(12.0D, 0.0D, 12.0D, 13.0D, 16.0D, 13.0D);
    private static final VoxelShape WEST_RIGHT_BACK_LEG = Block.box(12.0D, 0.0D, 3.0D, 13.0D, 16.0D, 4.0D);
    private static final VoxelShape WEST_SIT = Block.box(3.0D, 7.0D, 3.0D, 13.0D, 8.0D, 13.0D);
    private static final VoxelShape WEST_BACK = Block.box(12.0D, 12.0D, 4.0D, 13.0D, 15.0D, 12.0D);
    private static final VoxelShape WEST_CHAIR_AABB = Shapes.or(WEST_LEFT_FRONT_LEG, Shapes.or(WEST_RIGHT_FRONT_LEG, Shapes.or(WEST_LEFT_BACK_LEG, Shapes.or(WEST_SIT, Shapes.or(WEST_BACK, WEST_RIGHT_BACK_LEG)))));

    private static final VoxelShape NORTH_LEFT_FRONT_LEG = Block.box(4.0D, 0.0D, 4.0D, 5.0D, 7.0D, 5.0D);
    private static final VoxelShape NORTH_RIGHT_FRONT_LEG = Block.box(11.0D, 0.0D, 4.0D, 12.0D, 7.0D, 5.0D);
    private static final VoxelShape NORTH_LEFT_BACK_LEG = Block.box(3.0D, 0.0D, 12.0D, 4.0D, 16.0D, 13.0D);
    private static final VoxelShape NORTH_RIGHT_BACK_LEG = Block.box(12.0D, 0.0D, 12.0D, 13.0D, 16.0D, 13.0D);
    private static final VoxelShape NORTH_SIT = Block.box(3.0D, 7.0D, 3.0D, 13.0D, 8.0D, 13.0D);
    private static final VoxelShape NORTH_BACK = Block.box(4.0D, 12.0D, 12.0D, 12.0D, 15.0D, 13.0D);
    private static final VoxelShape NORTH_CHAIR_AABB = Shapes.or(NORTH_LEFT_FRONT_LEG, Shapes.or(NORTH_RIGHT_FRONT_LEG, Shapes.or(NORTH_LEFT_BACK_LEG, Shapes.or(NORTH_SIT, Shapes.or(NORTH_BACK, NORTH_RIGHT_BACK_LEG)))));

    private static final VoxelShape EAST_LEFT_FRONT_LEG = Block.box(11.0D, 0.0D, 4.0D, 12.0D, 7.0D, 5.0D);
    private static final VoxelShape EAST_RIGHT_FRONT_LEG = Block.box(11.0D, 0.0D, 11.0D, 12.0D, 7.0D, 12.0D);
    private static final VoxelShape EAST_LEFT_BACK_LEG = Block.box(3.0D, 0.0D, 3.0D, 4.0D, 16.0D, 4.0D);
    private static final VoxelShape EAST_RIGHT_BACK_LEG = Block.box(3.0D, 0.0D, 12.0D, 4.0D, 16.0D, 13.0D);
    private static final VoxelShape EAST_SIT = Block.box(3.0D, 7.0D, 3.0D, 13.0D, 8.0D, 13.0D);
    private static final VoxelShape EAST_BACK = Block.box(3.0D, 12.0D, 4.0D, 4.0D, 15.0D, 12.0D);
    private static final VoxelShape EAST_CHAIR_AABB = Shapes.or(EAST_LEFT_FRONT_LEG, Shapes.or(EAST_RIGHT_FRONT_LEG, Shapes.or(EAST_LEFT_BACK_LEG, Shapes.or(EAST_SIT, Shapes.or(EAST_BACK, EAST_RIGHT_BACK_LEG)))));

    public TerraceChairBlock(Properties properties, ToolTypes tool)
    {
        super(properties, tool);
    }

    public TerraceChairBlock(Properties properties, ToolTypes tool, ToolTiers tier)
    {
        super(properties, tool, tier);
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter worldIn, BlockPos pos, CollisionContext context)
    {
        switch((Direction)state.getValue(FACING))
        {
            case NORTH:
                return NORTH_CHAIR_AABB;
            case SOUTH:
                return SOUTH_CHAIR_AABB;
            case WEST:
                return WEST_CHAIR_AABB;
            case EAST:
                return EAST_CHAIR_AABB;
            default:
                return SOUTH_CHAIR_AABB;
        }
    }

    @Override
    public VoxelShape getCollisionShape(BlockState state, BlockGetter worldIn, BlockPos pos, CollisionContext context)
    {
        switch((Direction)state.getValue(FACING))
        {
            case NORTH:
                return NORTH_CHAIR_AABB;
            case SOUTH:
                return SOUTH_CHAIR_AABB;
            case WEST:
                return WEST_CHAIR_AABB;
            case EAST:
                return EAST_CHAIR_AABB;
            default:
                return SOUTH_CHAIR_AABB;
        }
    }
}