package tv.mapper.embellishcraft.util;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.inventory.InventoryHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.Direction.Axis;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.player.PlayerInteractEvent.RightClickBlock;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import tv.mapper.embellishcraft.block.ECBlockRegistry;
import tv.mapper.mapperbase.item.BaseItems;

@Mod.EventBusSubscriber
public class BoltEvent
{
    @SubscribeEvent
    public static void onRightClickBlock(RightClickBlock event)
    {
        PlayerEntity player = event.getPlayer();
        World world = event.getWorld();
        BlockPos pos = event.getPos();
        Block block = world.getBlockState(pos).getBlock();
        Block newBlock = Blocks.AIR;

        if(player.getHeldItemMainhand().getItem() == BaseItems.BOLT.get())
        {
            if(block == ECBlockRegistry.IRON_BEAM.get())
            {
                newBlock = ECBlockRegistry.BOLTED_IRON_BEAM.get();
            }
            else if(block == ECBlockRegistry.STEEL_BEAM.get())
            {
                newBlock = ECBlockRegistry.BOLTED_STEEL_BEAM.get();
            }

            if(newBlock != Blocks.AIR)
            {
                BlockState state = world.getBlockState(pos);
                Axis AXIS = state.get(BlockStateProperties.AXIS);

                ItemStack stack = ItemStack.EMPTY;
                if(player.getHeldItemMainhand().getItem() == BaseItems.BOLT.get())
                    stack = player.getHeldItemMainhand();

                world.setBlockState(pos, newBlock.getDefaultState().with(BlockStateProperties.AXIS, AXIS));

                if(!world.isRemote)
                    world.playSound(null, pos, SoundEvents.ENTITY_ZOMBIE_ATTACK_IRON_DOOR, SoundCategory.BLOCKS, 0.25F, 2.0F);

                if(!player.isCreative())
                    stack.setCount(stack.getCount() - 1);
            }
        }
        else if(player.getHeldItemMainhand().getItem() == BaseItems.FLATTER_HAMMER.get())
        {
            if(block == ECBlockRegistry.BOLTED_IRON_BEAM.get())
            {
                newBlock = ECBlockRegistry.IRON_BEAM.get();
            }
            else if(block == ECBlockRegistry.BOLTED_STEEL_BEAM.get())
            {
                newBlock = ECBlockRegistry.STEEL_BEAM.get();
            }

            if(newBlock != Blocks.AIR)
            {
                BlockState state = world.getBlockState(pos);
                Axis AXIS = state.get(BlockStateProperties.AXIS);

                ItemStack stack = ItemStack.EMPTY;
                if(player.getHeldItemMainhand().getItem() == BaseItems.FLATTER_HAMMER.get())
                    stack = player.getHeldItemMainhand();

                world.setBlockState(pos, newBlock.getDefaultState().with(BlockStateProperties.AXIS, AXIS));

                if(!world.isRemote)
                    world.playSound(null, pos, SoundEvents.BLOCK_LANTERN_HIT, SoundCategory.BLOCKS, 1.0F, 0.25F);

                if(!player.isCreative())
                {
                    ItemStack drop = new ItemStack(BaseItems.BOLT.get());
                    InventoryHelper.spawnItemStack(world, pos.getX(), pos.getY(), pos.getZ(), drop);
                    stack.damageItem(1, player, (p_220039_0_) ->
                    {
                        p_220039_0_.sendBreakAnimation(EquipmentSlotType.MAINHAND);
                    });
                }
            }
        }
    }
}