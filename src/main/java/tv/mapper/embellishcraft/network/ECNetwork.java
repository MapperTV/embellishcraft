package tv.mapper.embellishcraft.network;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.network.NetworkRegistry;
import net.minecraftforge.fml.network.simple.SimpleChannel;
import tv.mapper.embellishcraft.ECConstants;

public class ECNetwork
{
    public static final String PROTOCOL_VERSION = String.valueOf(1);

    public static final SimpleChannel EMBELLISHCRAFT_CHANNEL = NetworkRegistry.ChannelBuilder.named(new ResourceLocation(ECConstants.MODID, "embellishcraft_channel")).networkProtocolVersion(() -> PROTOCOL_VERSION).clientAcceptedVersions(PROTOCOL_VERSION::equals).serverAcceptedVersions(PROTOCOL_VERSION::equals).simpleChannel();

    public static void registerNetworkPackets()
    {
//        EMBELLISHCRAFT_CHANNEL.messageBuilder(LockerUUIDPacket.class, 0).encoder(LockerUUIDPacket::encode).decoder(LockerUUIDPacket::decode).consumer(LockerUUIDPacket::handle).add();
//        EMBELLISHCRAFT_CHANNEL.messageBuilder(LockerLockPacket.class, 1).encoder(LockerLockPacket::encode).decoder(LockerLockPacket::decode).consumer(LockerLockPacket::handle).add();
    }
}