package tv.mapper.embellishcraft.util;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.EntityMountEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent.RightClickBlock;
import net.minecraftforge.event.world.BlockEvent.BreakEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.LogicalSide;
import net.minecraftforge.fml.common.Mod;
import tv.mapper.embellishcraft.block.ChairBlock;
import tv.mapper.embellishcraft.block.CouchBlock;
import tv.mapper.embellishcraft.entity.EntityChair;

@Mod.EventBusSubscriber
public class SeatUtil
{
    @SubscribeEvent
    public static void onRightClickBlock(RightClickBlock event)
    {
        PlayerEntity player = event.getPlayer();
        World world = event.getWorld();
        BlockPos pos = event.getPos();
        Block block = world.getBlockState(pos).getBlock();

        if(!player.isSpectator())
        {
            if(!player.isSneaking())
            {
                if((block instanceof ChairBlock || block instanceof CouchBlock) && world.getBlockState(pos.up()).isAir(world, pos.up()) && !EntityChair.OCCUPIED.containsKey(pos))
                {
                    event.setCanceled(true);
                    if(event.getSide() == LogicalSide.SERVER)
                    {
                        EntityChair chair = new EntityChair(world, pos);
                        world.addEntity(chair);
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
            EntityChair.OCCUPIED.get(event.getPos()).remove();
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
                player.remove();
                EntityChair.OCCUPIED.remove(player.getPosition());
            }
        }
    }
}