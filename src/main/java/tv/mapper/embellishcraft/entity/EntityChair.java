package tv.mapper.embellishcraft.entity;

import java.util.HashMap;

import net.minecraft.entity.Entity;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import tv.mapper.embellishcraft.EmbellishCraft;

public class EntityChair extends Entity
{
    public static final HashMap<BlockPos, EntityChair> OCCUPIED = new HashMap<BlockPos, EntityChair>();

    public EntityChair(World world)
    {
        super(EmbellishCraft.TYPE_CHAIR, world);
        noClip = true;
        setSize(0.0001F, 0.0001F);

    }

    public EntityChair(World world, BlockPos pos)
    {
        super(EmbellishCraft.TYPE_CHAIR, world);
        setPosition(pos.getX() + 0.5, pos.getY() + 0.3, pos.getZ() + 0.5);
        noClip = true;
        setSize(0.0001F, 0.0001F);
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
    protected void readAdditional(NBTTagCompound compound)
    {

    }

    @Override
    protected void writeAdditional(NBTTagCompound compound)
    {

    }
}
