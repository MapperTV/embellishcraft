package tv.mapper.embellishcraft.furniture.entity;

import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.syncher.SynchedEntityData.Builder;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.Level;
import tv.mapper.embellishcraft.furniture.block.SittableBlock;

public class SitEntity extends Entity
{

    public SitEntity(EntityType<?> entityType, Level level)
    {
        super(entityType, level);
    }

    @Override
    protected void removePassenger(Entity passenger)
    {
        super.removePassenger(passenger);
        passenger.setPos(passenger.getX(), passenger.getY() + .75, passenger.getZ());
        this.kill();
    }

    @Override
    public void tick()
    {
        super.tick();
        if(!this.level().isClientSide())
        {
            if(this.getPassengers().isEmpty() || !(this.level().getBlockState(this.blockPosition()).getBlock() instanceof SittableBlock))
            {
                this.remove(RemovalReason.DISCARDED);
                this.level().updateNeighbourForOutputSignal(blockPosition(), this.level().getBlockState(blockPosition()).getBlock());
            }
        }
    }

    @Override
    protected void defineSynchedData(Builder builder)
    {}

    @Override
    protected void readAdditionalSaveData(CompoundTag compound)
    {}

    @Override
    protected void addAdditionalSaveData(CompoundTag compound)
    {}

}
