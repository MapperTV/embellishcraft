package tv.mapper.embellishcraft.util;

import java.util.Arrays;
import java.util.Comparator;

import net.minecraft.util.IStringSerializable;

public enum WoodType implements IStringSerializable
{
    OAK(0, "oak"),
    BIRCH(1, "birch"),
    SPRUCE(2, "spruce"),
    JUNGLE(3, "jungle"),
    DARK_OAK(4, "dark_oak"),
    ACACIA(5, "acacia");

    private static final WoodType[] VALUES = Arrays.stream(values()).sorted(Comparator.comparingInt(WoodType::getId)).toArray((map) ->
    {
        return new WoodType[map];
    });

    private final int id;
    private final String name;

    private WoodType(int idIn, String name)
    {
        this.id = idIn;
        this.name = name;
    }

    public String getName()
    {
        return this.name;
    }

    public int getId()
    {
        return this.id;
    }

    public static WoodType byId(int id)
    {
        if(id < 0 || id >= VALUES.length)
        {
            id = 0;
        }

        return VALUES[id];
    }

    public static String getWoodByID(int id)
    {
        for(WoodType wood : values())
        {
            if(wood.getId() == id)
                return wood.getName();
        }
        return null;
    }

}
