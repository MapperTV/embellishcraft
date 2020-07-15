package tv.mapper.embellishcraft.util;

import java.util.Arrays;
import java.util.Comparator;

import net.minecraft.util.IStringSerializable;

public enum McWoods implements IStringSerializable
{
    ACACIA(0, "acacia", "acacia", "Acacia"),
    BIRCH(1, "birch", "bouleau", "Birch"),
    DARK_OAK(2, "dark_oak", "chêne noir", "Dark Oak"),
    JUNGLE(3, "jungle", "acajou", "Jungle"),
    OAK(4, "oak", "chêne", "Oak"),
    SPRUCE(5, "spruce", "sapin", "Spruce");

    private static final McWoods[] VALUES = Arrays.stream(values()).sorted(Comparator.comparingInt(McWoods::getId)).toArray((map) ->
    {
        return new McWoods[map];
    });

    private final int id;
    private final String name;
    private final String en_us;
    private final String fr_fr;

    private McWoods(int idIn, String name, String fr_fr, String en_us)
    {
        this.id = idIn;
        this.name = name;
        this.en_us = en_us;
        this.fr_fr = fr_fr;
    }

    public String getName(String lang)
    {
        return lang.equals("fr_fr") ? this.fr_fr : this.en_us;
    }

    public int getId()
    {
        return this.id;
    }

    public static McWoods byId(int id)
    {
        if(id < 0 || id >= VALUES.length)
        {
            id = 0;
        }

        return VALUES[id];
    }

    public static String getWoodByID(int id)
    {
        for(McWoods wood : values())
        {
            if(wood.getId() == id)
                return wood.getString();
        }
        return null;
    }

    @Override
    public String getString()
    {
        return this.name;
    }
}