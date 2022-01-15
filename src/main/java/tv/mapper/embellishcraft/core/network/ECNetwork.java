//package tv.mapper.embellishcraft.core.network;
//
//import net.minecraft.resources.ResourceLocation;
//import net.minecraftforge.fmllegacy.network.NetworkRegistry;
//import net.minecraftforge.fmllegacy.network.simple.SimpleChannel;
//import tv.mapper.embellishcraft.core.ECConstants;
//import tv.mapper.embellishcraft.furniture.network.LockerLockPacket;
//import tv.mapper.embellishcraft.furniture.network.LockerUUIDPacket;
//
//public class ECNetwork
//{
//    public static final String PROTOCOL_VERSION = String.valueOf(1);
//
//    public static final SimpleChannel EMBELLISHCRAFT_CHANNEL = NetworkRegistry.ChannelBuilder.named(new ResourceLocation(ECConstants.MODID, "embellishcraft_channel")).networkProtocolVersion(() -> PROTOCOL_VERSION).clientAcceptedVersions(PROTOCOL_VERSION::equals).serverAcceptedVersions(PROTOCOL_VERSION::equals).simpleChannel();
//
//    public static void registerNetworkPackets()
//    {
//        EMBELLISHCRAFT_CHANNEL.messageBuilder(LockerUUIDPacket.class, 0).encoder(LockerUUIDPacket::encode).decoder(LockerUUIDPacket::decode).consumer(LockerUUIDPacket::handle).add();
//        EMBELLISHCRAFT_CHANNEL.messageBuilder(LockerLockPacket.class, 1).encoder(LockerLockPacket::encode).decoder(LockerLockPacket::decode).consumer(LockerLockPacket::handle).add();
//    }
//}