package tv.mapper.embellishcraft.furniture.util;

import net.minecraft.util.StringRepresentable;

public enum CustomChestType implements StringRepresentable
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

    @Override
    public String getSerializedName()
    {
        return this.name;
    }
}