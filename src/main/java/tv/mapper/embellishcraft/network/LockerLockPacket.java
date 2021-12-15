package tv.mapper.embellishcraft.network;

import java.util.UUID;
import java.util.function.Supplier;

import net.minecraft.core.BlockPos;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraftforge.fmllegacy.network.NetworkEvent;
import tv.mapper.embellishcraft.tileentity.VerticalChestTileEntity;

public class LockerLockPacket
{
    private BlockPos pos;

    public LockerLockPacket(BlockPos pos)
    {
        this.pos = pos;
    }

    public static void encode(LockerLockPacket packet, FriendlyByteBuf buffer)
    {
        buffer.writeBlockPos(packet.pos);
    }

    public static LockerLockPacket decode(FriendlyByteBuf buffer)
    {
        BlockPos pos = buffer.readBlockPos();

        LockerLockPacket instance = new LockerLockPacket(pos);
        return instance;
    }

    public static void handle(LockerLockPacket packet, Supplier<NetworkEvent.Context> context)
    {
        context.get().enqueueWork(() ->
        {
            ServerPlayer player = context.get().getSender();

            UUID id = player.getUUID();
            Level world = player.getLevel();
            BlockEntity te = world.getBlockEntity(packet.pos);

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