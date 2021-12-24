package tv.mapper.embellishcraft.entity;

import java.util.HashMap;

import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.protocol.Packet;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.Level;
import net.minecraftforge.fmllegacy.network.NetworkHooks;

public class EntityChair extends Entity
{
    public static final HashMap<BlockPos, EntityChair> OCCUPIED = new HashMap<BlockPos, EntityChair>();

    public EntityChair(Level world)
    {
        super(ModEntities.TYPE_CHAIR, world);
        this.noPhysics = true;
    }

    public EntityChair(Level world, BlockPos pos)
    {
        this(world);
        setPos(pos.getX() + 0.5, pos.getY() + 0.3, pos.getZ() + 0.5);
        OCCUPIED.put(pos, this);
    }

    @Override
    public void tick()
    {

        if(!this.level.isClientSide)
        {
            if(!this.isVehicle() || this.level.isEmptyBlock(new BlockPos(this.getX(), this.getY(), this.getZ())))
            {
                this.remove(Entity.RemovalReason.KILLED);
            }
        }
    }

    @Override
    protected void defineSynchedData()
    {

    }

    @Override
    protected void readAdditionalSaveData(CompoundTag compound)
    {

    }

    @Override
    protected void addAdditionalSaveData(CompoundTag compound)
    {

    }

    @Override
    protected boolean canRide(Entity entity)
    {
        return true;
    }

    @Override
    public Packet<?> getAddEntityPacket()
    {
        return NetworkHooks.getEntitySpawningPacket(this);
    }
}