package tv.mapper.embellishcraft.util;

import net.minecraft.util.IStringSerializable;

public enum CustomChestType implements IStringSerializable
{
    FANCY_OAK("fancy_oak"),
    FANCY_BIRCH("fancy_birch"),
    FANCY_SPRUCE("fancy_spruce"),
    FANCY_JUNGLE("fancy_jungle"),
    FANCY_DARK_OAK("fancy_dark_oak"),
    FANCY_ACACIA("fancy_acacia");

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
