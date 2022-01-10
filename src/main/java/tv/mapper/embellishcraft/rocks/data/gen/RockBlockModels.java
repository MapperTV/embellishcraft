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

        buildMcStone("andesite");
        buildRooftilesStairs("andesite_rooftiles");

        buildMcStone("diorite");
        buildRooftilesStairs("diorite_rooftiles");

        buildMcStone("granite");
        buildRooftilesStairs("granite_rooftiles");

        buildMcSandstone("sandstone");
        buildRooftilesStairs("sandstone_rooftiles");

        buildMcSandstone("red_sandstone");
        buildRooftilesStairs("red_sandstone_rooftiles");

        // Terracotta
        buildWall("terracotta", mcLoc("block/terracotta"));
        buildWall("polished_terracotta", modLoc("block/polished_terracotta"));
        buildWall("terracotta_paving", modLoc("block/terracotta_paving"));
        buildWall("terracotta_tiles", modLoc("block/terracotta_tiles"));
        buildWall("terracotta_bricks", modLoc("block/terracotta_bricks"));
        buildWall("terracotta_large_bricks", modLoc("block/terracotta_large_bricks"));
        buildWall("terracotta_paving_stones", modLoc("block/terracotta_paving_stones"));
        buildButton("terracotta", mcLoc("block/terracotta"));

        buildPressure("terracotta", mcLoc("block/terracotta"));
        buildPressure("polished_terracotta", modLoc("block/polished_terracotta"));
        buildPressure("terracotta_paving", modLoc("block/terracotta_paving"));
        buildPressure("terracotta_tiles", modLoc("block/terracotta_tiles"));
        buildPressure("terracotta_bricks", modLoc("block/terracotta_bricks"));
        buildPressure("terracotta_large_bricks", modLoc("block/terracotta_large_bricks"));
        buildPressure("terracotta_paving_stones", modLoc("block/terracotta_paving_stones"));

        buildRooftilesStairs("terracotta_rooftiles");
    }
}