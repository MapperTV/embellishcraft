package tv.mapper.embellishcraft.entity;

import java.util.HashMap;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.IPacket;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class EntityChair extends Entity
{
    public static final HashMap<BlockPos, EntityChair> OCCUPIED = new HashMap<BlockPos, EntityChair>();

    public EntityChair(EntityType<?> type, World world)
    {
        super(type, world);
        noClip = true;
    }

    public EntityChair(EntityType<? extends EntityChair> type, World world, BlockPos pos)
    {
        super(type, world);
        setPosition(pos.getX() + 0.5, pos.getY() + 0.3, pos.getZ() + 0.5);
        noClip = true;
        OCCUPIED.put(pos, this);
    }

    @Override
    public void tick()
    {

        if(!this.world.isRemote)
        {
            if(!this.isBeingRidden() || this.world.isAirBlock(new BlockPos(this.posX, this.posY, this.posZ)))
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
    public IPacket<?> createSpawnPacket()
    {
        return null;
    }
}
