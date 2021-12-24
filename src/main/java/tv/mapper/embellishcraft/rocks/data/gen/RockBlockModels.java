package tv.mapper.embellishcraft.rocks.data.gen;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import tv.mapper.embellishcraft.data.gen.ECBlockModels;

public class RockBlockModels extends ECBlockModels
{
    public RockBlockModels(DataGenerator generator, String modid, ExistingFileHelper existingFileHelper)
    {
        super(generator, modid, existingFileHelper);
    }

    @Override
    public String getName()
    {
        return "EmbellishCraft Rock Block Models";
    }

    @Override
    protected void registerModels()
    {
        buildAllStone("basalt");
        buildRooftilesStairs("basalt_rooftiles");

        buildAllStone("slate");
        buildRooftilesStairs("slate_rooftiles");

        buildAllStone("marble");
        buildRooftilesStairs("marble_rooftiles");

        buildAllStone("gneiss");
        buildRooftilesStairs("gneiss_rooftiles");

        buildAllStone("jade");
        buildRooftilesStairs("jade_rooftiles");

        buildAllStone("larvikite");
        buildRooftilesStairs("larvikite_rooftiles");

        buildWall("paving_stones", modLoc("block/paving_stones"));
        buildPressure("paving_stones", modLoc("block/paving_stones"));
    }
}