package tv.mapper.embellishcraft.state.properties;

import net.minecraft.util.IStringSerializable;

public enum VerticalChestType implements IStringSerializable
{
    SINGLE("single", 0),
    TOP("top", 2),
    BOTTOM("bottom", 1);

    public static final VerticalChestType[] VALUES = values();
    private final String name;
    private final int opposite;

    private VerticalChestType(String name, int oppositeIn)
    {
        this.name = name;
        this.opposite = oppositeIn;
    }

    public String getName()
    {
        return this.name;
    }

    public VerticalChestType opposite()
    {
        return VALUES[this.opposite];
    }

    @Override
    public String getString()
    {
        return this.name;
    }
}