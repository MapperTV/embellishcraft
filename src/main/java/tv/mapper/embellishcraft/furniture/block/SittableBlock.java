package tv.mapper.embellishcraft.furniture.block;

import java.util.List;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.BlockHitResult;
import tv.mapper.embellishcraft.furniture.entity.InitFurnitureEntities;
import tv.mapper.embellishcraft.furniture.entity.SitEntity;
import tv.mapper.mapperbase.api.block.CustomBlock;
import tv.mapper.mapperbase.api.block.tools.ToolTiers;
import tv.mapper.mapperbase.api.block.tools.ToolTypes;

public class SittableBlock extends CustomBlock
{
    public SittableBlock(Properties properties, ToolTypes tool)
    {
        super(properties, tool);
    }

    public SittableBlock(Properties properties, ToolTypes tool, ToolTiers tier)
    {
        super(properties, tool, tier);
    }

    @Override
    public InteractionResult useWithoutItem(BlockState state, Level level, BlockPos pos, Player player, BlockHitResult result)
    {
        if(!level.isClientSide)
        {
            Entity sitEntity = null;
            List<SitEntity> sitEntities = level.getEntities(InitFurnitureEntities.SIT_ENTITY.get(), new AABB(pos), sit -> true);
            if(sitEntities.isEmpty())
            {
                sitEntity = InitFurnitureEntities.SIT_ENTITY.get().spawn((ServerLevel)level, pos, MobSpawnType.TRIGGERED);
                player.startRiding(sitEntity);
            }
            else
                return InteractionResult.PASS;
        }

        return InteractionResult.SUCCESS;
    }
}
