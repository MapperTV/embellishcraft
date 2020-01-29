package tv.mapper.embellishcraft.entity;

import java.util.HashMap;

import net.minecraft.entity.Entity;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.IPacket;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.network.NetworkHooks;
import tv.mapper.embellishcraft.init.ModEntities;

public class EntityChair extends Entity
{
    public static final HashMap<BlockPos, EntityChair> OCCUPIED = new HashMap<BlockPos, EntityChair>();

    public EntityChair(World world)
    {
        super(ModEntities.TYPE_CHAIR, world);
        this.noClip = true;
    }

    public EntityChair(World world, BlockPos pos)
    {
        this(world);
        setPosition(pos.getX() + 0.5, pos.getY() + 0.3, pos.getZ() + 0.5);
        OCCUPIED.put(pos, this);
    }

    @Override
    public void tick()
    {

        if(!this.world.isRemote)
        {
            if(!this.isBeingRidden() || this.world.isAirBlock(new BlockPos(this.getPosX(), this.getPosY(), this.getPosZ())))
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
    protected void readAdditional(CompoundNBT compound)
    {

    }

    @Override
    protected void writeAdditional(CompoundNBT compound)
    {

    }

    @Override
    protected boolean canBeRidden(Entity entity)
    {
        return true;
    }

    @Override
    public IPacket<?> createSpawnPacket()
    {
        return NetworkHooks.getEntitySpawningPacket(this);
    }
}
