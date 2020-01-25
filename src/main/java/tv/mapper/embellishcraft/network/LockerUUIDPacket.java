//package tv.mapper.embellishcraft.network;
//
//import java.util.UUID;
//import java.util.function.Supplier;
//
//import net.minecraft.entity.player.ServerPlayerEntity;
//import net.minecraft.network.PacketBuffer;
//import net.minecraft.tileentity.TileEntity;
//import net.minecraft.util.math.BlockPos;
//import net.minecraft.world.World;
//import net.minecraftforge.fml.network.NetworkEvent;
//import tv.mapper.embellishcraft.EmbellishCraft;
//import tv.mapper.embellishcraft.tileentity.VerticalChestTileEntity;
//
//public class LockerUUIDPacket
//{
//    private BlockPos pos;
//
//    public LockerUUIDPacket(BlockPos pos)
//    {
//        this.pos = pos;
//    }
//
//    public static void encode(LockerUUIDPacket packet, PacketBuffer buffer)
//    {
//        buffer.writeBlockPos(packet.pos);
//    }
//
//    public static LockerUUIDPacket decode(PacketBuffer buffer)
//    {
//        BlockPos pos = buffer.readBlockPos();
//
//        LockerUUIDPacket instance = new LockerUUIDPacket(pos);
//        return instance;
//    }
//
//    public static void handle(LockerUUIDPacket packet, Supplier<NetworkEvent.Context> context)
//    {
//        context.get().enqueueWork(() ->
//        {
//            ServerPlayerEntity player = context.get().getSender();
//            UUID id = player.getUniqueID();
//            World world = player.getServerWorld();
//            TileEntity te = world.getTileEntity(packet.pos);
//
//            if(te instanceof VerticalChestTileEntity)
//            {
//                if(!((VerticalChestTileEntity)te).hasUUID())
//                    ((VerticalChestTileEntity)te).setUUID(id);
//                else
//                    EmbellishCraft.LOGGER.warn("WARNING: Attempted to change UUID on existing container, that's illegal!");
//            }
//        });
//        context.get().setPacketHandled(true);
//    }
//}