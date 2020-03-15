package tv.mapper.embellishcraft.util;

import net.minecraft.util.IStringSerializable;

public enum CustomChestType implements IStringSerializable
{
    OAK_FANCY("oak_fancy"),
    BIRCH_FANCY("birch_fancy"),
    SPRUCE_FANCY("spruce_fancy"),
    JUNGLE_FANCY("jungle_fancy"),
    DARK_OAK_FANCY("dark_oak_fancy"),
    ACACIA_FANCY("acacia_fancy");

    private final String name;

    private CustomChestType(String name)
    {
        this.name = name;
    }

    public String toString()
    {
        return this.name;
    }

    public String getName()
    {
        return this.name;
    }
}