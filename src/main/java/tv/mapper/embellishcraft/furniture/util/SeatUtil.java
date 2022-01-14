package tv.mapper.embellishcraft.furniture.util;

import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.Entity.RemovalReason;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.event.entity.EntityMountEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent.RightClickBlock;
import net.minecraftforge.event.world.BlockEvent.BreakEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import tv.mapper.embellishcraft.building.world.level.block.SuspendedStairsBlock;
import tv.mapper.embellishcraft.furniture.world.entity.EntityChair;
import tv.mapper.embellishcraft.furniture.world.level.block.ChairBlock;
import tv.mapper.embellishcraft.furniture.world.level.block.CouchBlock;

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

                    player.displayClientMessage(new TranslatableComponent("embellishcraft.message.temp.seat"), true);

                    // if(event.getSide() == LogicalSide.SERVER)
                    // {
                    // EntityChair chair = new EntityChair(world, pos);
                    // world.addFreshEntity(chair);
                    // player.startRiding(chair);
                    // }
                }
            }
        }
    }

    @SubscribeEvent
    public static void onBreak(BreakEvent event)
    {
        if(EntityChair.OCCUPIED.containsKey(event.getPos()))
        {
            EntityChair.OCCUPIED.get(event.getPos()).remove(RemovalReason.KILLED);
            EntityChair.OCCUPIED.remove(event.getPos());
        }
    }

    @SubscribeEvent
    public static void onEntityMount(EntityMountEvent event)
    {
        if(event.isDismounting())
        {
            Entity entity = event.getEntityBeingMounted();

            if(entity instanceof EntityChair)
            {
                entity.remove(RemovalReason.KILLED);
                EntityChair.OCCUPIED.remove(entity.blockPosition());
            }
        }
    }
}