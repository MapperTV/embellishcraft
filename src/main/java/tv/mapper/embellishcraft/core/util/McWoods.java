package tv.mapper.embellishcraft.core.util;

import java.util.Arrays;
import java.util.Comparator;

import net.minecraft.util.StringRepresentable;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public enum McWoods implements StringRepresentable
{
    ACACIA(0, "acacia", "acacia", "Acacia", BlockSetType.ACACIA),
    BIRCH(1, "birch", "bouleau", "Birch", BlockSetType.BIRCH),
    DARK_OAK(2, "dark_oak", "chêne noir", "Dark Oak", BlockSetType.DARK_OAK),
    JUNGLE(3, "jungle", "acajou", "Jungle", BlockSetType.JUNGLE),
    OAK(4, "oak", "chêne", "Oak", BlockSetType.OAK),
    SPRUCE(5, "spruce", "sapin", "Spruce", BlockSetType.SPRUCE),
    WARPED(6, "warped", "bois biscornu", "Warped", BlockSetType.WARPED),
    CRIMSON(7, "crimson", "bois carmin", "Crimson", BlockSetType.CRIMSON),
    CHERRY(8, "cherry", "cerisier", "Cherry", BlockSetType.CHERRY),
    MANGROVE(9, "mangrove", "palétuvier", "Mangrove", BlockSetType.MANGROVE);
    // PALE_OAK(10, "pale_oak", "chêne pale", "Pale Oak", BlockSetType.PALE_OAK); // 1.21.4+

    private static final McWoods[] VALUES = Arrays.stream(values()).sorted(Comparator.comparingInt(McWoods::getId)).toArray((map) ->
    {
        return new McWoods[map];
    });

    private final int id;
    private final String name;
    private final String en_us;
    private final String fr_fr;
    private BlockSetType type;

    private McWoods(int idIn, String name, String fr_fr, String en_us, BlockSetType type)
    {
        this.id = idIn;
        this.name = name;
        this.en_us = en_us;
        this.fr_fr = fr_fr;
        this.type = type;
    }

    public String getName(String lang)
    {
        return lang.equals("fr_fr") ? this.fr_fr : this.en_us;
    }

    public BlockSetType getType()
    {
        return this.type;
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
                return wood.getSerializedName();
        }
        return null;
    }

    @Override
    public String getSerializedName()
    {
        return this.name;
    }
}