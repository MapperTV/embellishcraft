package tv.mapper.embellishcraft.util;

import java.util.Arrays;
import java.util.Comparator;

import net.minecraft.util.IStringSerializable;

public enum WoodsType implements IStringSerializable
{
    OAK(0, "oak", "chene"),
    BIRCH(1, "birch", "bouleau"),
    SPRUCE(2, "spruce", "sapin"),
    JUNGLE(3, "jungle", "acajou"),
    DARK_OAK(4, "dark_oak", "chene noir"),
    ACACIA(5, "acacia", "acacia"),
    CHERRY(6, "cherry", "cerisier"),
    DEAD(7, "dead", "bois mort"),
    FIR(8, "fir", "sapin"),
    HELLBARK(9, "hellbark", "ecorce infernale"),
    JACARANDA(10, "jacaranda", "jacaranda"),
    MAGIC(11, "magic", "bois magique"),
    MAHOGANY(12, "mahogany", "acajou"),
    PALM(13, "palm", "palmier"),
    REDWOOD(14, "redwood", "sequoia"),
    UMBRAN(15, "umbran", "bois sinistre"),
    WILLOW(16, "willow", "saule");

    private static final WoodsType[] VALUES = Arrays.stream(values()).sorted(Comparator.comparingInt(WoodsType::getId)).toArray((map) ->
    {
        return new WoodsType[map];
    });

    private final int id;
    private final String en_us;
    private final String fr_fr;

    private WoodsType(int idIn, String en_us, String fr_fr)
    {
        this.id = idIn;
        this.en_us = en_us;
        this.fr_fr = fr_fr;
    }

    @Override
    public String getString()
    {
        return getString("en_us");
    }

    public String getString(String lang)
    {
        return lang.equals("fr_fr") ? this.fr_fr : this.en_us;
    }

    public int getId()
    {
        return this.id;
    }

    public static WoodsType byId(int id)
    {
        if(id < 0 || id >= VALUES.length)
        {
            id = 0;
        }

        return VALUES[id];
    }

    public static String getWoodByID(int id)
    {
        for(WoodsType wood : values())
        {
            if(wood.getId() == id)
                return wood.getString();
        }
        return null;
    }
}