package tv.mapper.embellishcraft.util;

import java.util.Arrays;
import java.util.Comparator;

import net.minecraft.block.material.MaterialColor;
import net.minecraft.util.IStringSerializable;

public enum RockType implements IStringSerializable
{
    BASALT(0, "basalt", MaterialColor.BLACK),
    SLATE(1, "slate", MaterialColor.BLUE_TERRACOTTA),
    MARBLE(2, "marble", MaterialColor.QUARTZ),
    GNEISS(3, "gneiss", MaterialColor.WHITE_TERRACOTTA),
    JADE(4, "jade", MaterialColor.GREEN_TERRACOTTA),
    LARVIKITE(5, "larvikite", MaterialColor.LIGHT_BLUE_TERRACOTTA);

    private static final RockType[] VALUES = Arrays.stream(values()).sorted(Comparator.comparingInt(RockType::getId)).toArray((type) ->
    {
        return new RockType[type];
    });

    private final int id;
    private final String name;
    private final MaterialColor color;

    private RockType(int id, String name, MaterialColor color)
    {
        this.id = id;
        this.name = name;
        this.color = color;
    }

    public String toString()
    {
        return this.name;
    }

    public String getName()
    {
        return this.name;
    }

    public MaterialColor getColor()
    {
        return this.color;
    }

    public int getId()
    {
        return this.id;
    }

    public static RockType byId(int id)
    {
        if(id < 0 || id >= VALUES.length)
        {
            id = 0;
        }
        return VALUES[id];
    }

}