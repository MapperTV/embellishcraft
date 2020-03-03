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
    ETHEREAL(8, "ethereal", "bois ethere"),
    FIR(9, "fir", "sapin"),
    HELLBARK(10, "hellbark", "ecorce infernale"),
    JACARANDA(11, "jacaranda", "jacaranda"),
    MAGIC(12, "magic", "bois magique"),
    MAHOGANY(13, "mahogany", "acajou"),
    PALM(14, "palm", "palmier"),
    REDWOOD(15, "redwood", "sequoia"),
    UMBRAN(16, "umbran", "bois sinistre"),
    WILLOW(17, "willow", "saule");

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
    public String getName()
    {
        return getName("en_us");
    }

    public String getName(String lang)
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
                return wood.getName();
        }
        return null;
    }

}
