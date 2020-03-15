package tv.mapper.embellishcraft.network;

import java.util.UUID;
import java.util.function.Supplier;

import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.network.PacketBuffer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.network.NetworkEvent;
import tv.mapper.embellishcraft.tileentity.VerticalChestTileEntity;

public class LockerLockPacket
{
    private BlockPos pos;

    public LockerLockPacket(BlockPos pos)
    {
        this.pos = pos;
    }

    public static void encode(LockerLockPacket packet, PacketBuffer buffer)
    {
        buffer.writeBlockPos(packet.pos);
    }

    public static LockerLockPacket decode(PacketBuffer buffer)
    {
        BlockPos pos = buffer.readBlockPos();

        LockerLockPacket instance = new LockerLockPacket(pos);
        return instance;
    }

    public static void handle(LockerLockPacket packet, Supplier<NetworkEvent.Context> context)
    {
        context.get().enqueueWork(() ->
        {
            ServerPlayerEntity player = context.get().getSender();

            UUID id = player.getUniqueID();
            World world = player.getServerWorld();
            TileEntity te = world.getTileEntity(packet.pos);

            if(te instanceof VerticalChestTileEntity)
            {
                UUID teId = ((VerticalChestTileEntity)te).getUUID();
                if(teId != null)
                {
                    if(teId.equals(id))
                        ((VerticalChestTileEntity)te).lockIt();
                }
            }
        });
        context.get().setPacketHandled(true);
    }
}