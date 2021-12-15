package tv.mapper.embellishcraft.util;

import java.util.Arrays;
import java.util.Comparator;

import net.minecraft.world.level.material.MaterialColor;
import net.minecraft.util.StringRepresentable;

public enum RockType implements StringRepresentable
{
    BASALT(0, "basalt", "basalt", MaterialColor.COLOR_BLACK),
    SLATE(1, "slate", "ardoise", MaterialColor.TERRACOTTA_BLUE),
    MARBLE(2, "marble", "marbre", MaterialColor.QUARTZ),
    GNEISS(3, "gneiss", "gneiss", MaterialColor.TERRACOTTA_WHITE),
    JADE(4, "jade", "jade", MaterialColor.TERRACOTTA_GREEN),
    LARVIKITE(5, "larvikite", "larvikite", MaterialColor.TERRACOTTA_LIGHT_BLUE);

    private static final RockType[] VALUES = Arrays.stream(values()).sorted(Comparator.comparingInt(RockType::getId)).toArray((type) ->
    {
        return new RockType[type];
    });

    private final int id;
    private final String name;
    private final String fr_name;
    private final MaterialColor color;

    private RockType(int id, String name, String fr_name, MaterialColor color)
    {
        this.id = id;
        this.name = name;
        this.fr_name = fr_name;
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

    public String getFrName()
    {
        return this.fr_name;
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

    @Override
    public String getSerializedName()
    {
        return this.name;
    }
}