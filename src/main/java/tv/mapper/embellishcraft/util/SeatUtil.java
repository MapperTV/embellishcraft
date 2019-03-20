package tv.mapper.embellishcraft.util;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.EntityMountEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent.RightClickBlock;
import net.minecraftforge.event.world.BlockEvent.BreakEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import tv.mapper.embellishcraft.block.BlockChair;
import tv.mapper.embellishcraft.entity.EntityChair;

// Big thanks to bl4ckscor3 and its mod "Sit" for this code!

@EventBusSubscriber
public class SeatUtil
{
    @SubscribeEvent
    public static void onRightClickBlock(RightClickBlock event)
    {
        if(!event.getWorld().isRemote)
        {
            World world = event.getWorld();
            BlockPos pos = event.getPos();
            Block block = world.getBlockState(pos).getBlock();
            EntityPlayer player = event.getEntityPlayer();

            if((block instanceof BlockChair) && !EntityChair.OCCUPIED.containsKey(pos) && player.getHeldItemMainhand().isEmpty())
            {
                EntityChair sit = new EntityChair(world, pos);
                world.spawnEntity(sit);
                player.startRiding(sit);
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
