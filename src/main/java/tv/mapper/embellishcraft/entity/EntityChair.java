package tv.mapper.embellishcraft.entity;

import java.util.List;

import net.minecraft.entity.Entity;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import tv.mapper.embellishcraft.block.BlockChair;

public class EntityChair extends Entity
{
    public EntityChair(World world)
    {
        super(ModEntities.TYPE_CHAIR, world);
        setSize(0F, 0F);
    }
    
    public EntityChair(World world, BlockPos pos)
    {
        super(ModEntities.TYPE_CHAIR, world);
        setPosition(pos.getX() + 0.5, pos.getY() + 0.4, pos.getZ() + 0.5);
        setSize(0F, 0F);
    }

    @Override
    public void tick()
    {
        BlockPos pos = getPosition();
        if(pos != null && !(getEntityWorld().getBlockState(pos).getBlock() instanceof BlockChair))
        {
            this.remove();
            return;
        }
        List<Entity> passengers = getPassengers();
        if(passengers.isEmpty())
        {
            this.remove();
        }
        for(Entity e : passengers)
        {
            if(e.isSneaking())
            {
                this.remove();
            }
        }
    }

    @Override
    protected void registerData()
    {

    }

    @Override
    protected void readAdditional(NBTTagCompound compound)
    {

    }

    @Override
    protected void writeAdditional(NBTTagCompound compound)
    {

    }
}
