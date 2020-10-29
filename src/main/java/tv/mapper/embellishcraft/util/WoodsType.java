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
    WARPED(6, "warped", "bois biscornu"),
    CRIMSON(7, "crimson", "bois carmin"),
    CHERRY(8, "cherry", "cerisier"),
    DEAD(9, "dead", "bois mort"),
    FIR(10, "fir", "sapin"),
    HELLBARK(11, "hellbark", "ecorce infernale"),
    JACARANDA(12, "jacaranda", "jacaranda"),
    MAGIC(13, "magic", "bois magique"),
    MAHOGANY(14, "mahogany", "acajou"),
    PALM(15, "palm", "palmier"),
    REDWOOD(16, "redwood", "sequoia"),
    UMBRAN(17, "umbran", "bois sinistre"),
    WILLOW(18, "willow", "saule");

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