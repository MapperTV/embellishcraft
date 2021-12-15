package tv.mapper.embellishcraft.util;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.Entity.RemovalReason;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.event.entity.EntityMountEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent.RightClickBlock;
import net.minecraftforge.event.world.BlockEvent.BreakEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.LogicalSide;
import net.minecraftforge.fml.common.Mod;
import tv.mapper.embellishcraft.block.ChairBlock;
import tv.mapper.embellishcraft.block.CouchBlock;
import tv.mapper.embellishcraft.block.SuspendedStairsBlock;
import tv.mapper.embellishcraft.entity.EntityChair;

@Mod.EventBusSubscriber
public class SeatUtil
{
    @SubscribeEvent
    public static void onRightClickBlock(RightClickBlock event)
    {
        Player player = event.getPlayer();
        Level world = event.getWorld();
        BlockPos pos = event.getPos();
        Block block = world.getBlockState(pos).getBlock();

        if(!player.isSpectator())
        {
            if(!player.isShiftKeyDown())
            {
                if((block instanceof ChairBlock || block instanceof CouchBlock || block instanceof SuspendedStairsBlock) && world.isEmptyBlock(pos.above()) && !EntityChair.OCCUPIED.containsKey(pos))
                {
                    event.setCanceled(true);
                    if(event.getSide() == LogicalSide.SERVER)
                    {
                        EntityChair chair = new EntityChair(world, pos);
                        world.addFreshEntity(chair);
                        player.startRiding(chair);
                    }
                }
            }
        }
    }

    @SubscribeEvent
    public static void onBreak(BreakEvent event)
    {
        if(EntityChair.OCCUPIED.containsKey(event.getPos()))
        {
            EntityChair.OCCUPIED.get(event.getPos()).remove(RemovalReason.DISCARDED);
            EntityChair.OCCUPIED.remove(event.getPos());
        }
    }

    @SubscribeEvent
    public static void onEntityMount(EntityMountEvent event)
    {
        if(event.isDismounting())
        {
            Entity player = event.getEntityBeingMounted();

            if(player instanceof EntityChair)
            {
                player.remove(RemovalReason.DISCARDED);
                EntityChair.OCCUPIED.remove(player.blockPosition());
            }
        }
    }
}