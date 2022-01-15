//package tv.mapper.embellishcraft.furniture.network;
//
//import java.util.UUID;
//import java.util.function.Supplier;
//
//import net.minecraft.core.BlockPos;
//import net.minecraft.network.FriendlyByteBuf;
//import net.minecraft.server.level.ServerPlayer;
//import net.minecraft.world.level.Level;
//import net.minecraft.world.level.block.entity.BlockEntity;
//import net.minecraftforge.fmllegacy.network.NetworkEvent;
//import tv.mapper.embellishcraft.EmbellishCraft;
//import tv.mapper.embellishcraft.furniture.world.level.block.entity.VerticalChestTileEntity;
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
//    public static void encode(LockerUUIDPacket packet, FriendlyByteBuf buffer)
//    {
//        buffer.writeBlockPos(packet.pos);
//    }
//
//    public static LockerUUIDPacket decode(FriendlyByteBuf buffer)
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
//            ServerPlayer player = context.get().getSender();
//            UUID id = player.getUUID();
//            Level world = player.getLevel();
//            BlockEntity te = world.getBlockEntity(packet.pos);
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