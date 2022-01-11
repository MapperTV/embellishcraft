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

    protected void buildAllStoneWall(String name)
    {
        buildWall(name, modLoc("block/" + name));
        buildWall(name + "_cobblestone", modLoc("block/" + name + "_cobblestone"));
        buildWall(name + "_cobblestone_bricks", modLoc("block/" + name + "_cobblestone_bricks"));
        buildWall("smooth_" + name, modLoc("block/smooth_" + name));
        buildWall("polished_" + name, modLoc("block/polished_" + name));
        buildWall(name + "_paving", modLoc("block/" + name + "_paving"));
        buildWall(name + "_tiles", modLoc("block/" + name + "_tiles"));
        buildWall(name + "_bricks", modLoc("block/" + name + "_bricks"));
        buildWall(name + "_large_bricks", modLoc("block/" + name + "_large_bricks"));
        buildWall(name + "_paving_stones", modLoc("block/" + name + "_paving_stones"));
    }

    protected void buildAllStonePressure(String name)
    {
        buildPressure(name, modLoc("block/" + name));
        buildPressure(name + "_cobblestone", modLoc("block/" + name + "_cobblestone"));
        buildPressure(name + "_cobblestone_bricks", modLoc("block/" + name + "_cobblestone_bricks"));
        buildPressure("smooth_" + name, modLoc("block/smooth_" + name));
        buildPressure("polished_" + name, modLoc("block/polished_" + name));
        buildPressure(name + "_paving", modLoc("block/" + name + "_paving"));
        buildPressure(name + "_tiles", modLoc("block/" + name + "_tiles"));
        buildPressure(name + "_bricks", modLoc("block/" + name + "_bricks"));
        buildPressure(name + "_large_bricks", modLoc("block/" + name + "_large_bricks"));
        buildPressure(name + "_paving_stones", modLoc("block/" + name + "_paving_stones"));
        buildPressure(name + "_ornament", modLoc("block/" + name + "_ornament"));
    }

    protected void buildAllStone(String name)
    {
        buildAllStoneWall(name);
        buildAllStonePressure(name);
        buildButton(name, modLoc("block/" + name));
    }

    protected void buildMcStone(String name)
    {
        buildWall("smooth_" + name, modLoc("block/smooth_" + name));
        buildPressure("smooth_" + name, modLoc("block/smooth_" + name));
        buildButton(name, mcLoc("block/" + name));

        buildWall(name + "_paving", modLoc("block/" + name + "_paving"));
        buildPressure(name + "_paving", modLoc("block/" + name + "_paving"));

        buildWall(name + "_tiles", modLoc("block/" + name + "_tiles"));
        buildPressure(name + "_tiles", modLoc("block/" + name + "_tiles"));

        buildWall(name + "_bricks", modLoc("block/" + name + "_bricks"));
        buildPressure(name + "_bricks", modLoc("block/" + name + "_bricks"));

        buildWall(name + "_large_bricks", modLoc("block/" + name + "_large_bricks"));
        buildPressure(name + "_large_bricks", modLoc("block/" + name + "_large_bricks"));

        buildWall(name + "_paving_stones", modLoc("block/" + name + "_paving_stones"));
        buildPressure(name + "_paving_stones", modLoc("block/" + name + "_paving_stones"));

        buildPressure(name + "_ornament", modLoc("block/" + name + "_ornament"));
    }

    protected void buildMcSandstone(String name)
    {
        buildButton(name, mcLoc("block/" + name));

        buildWall("smooth_" + name, mcLoc("block/" + name + "_top"));
        buildPressure("smooth_" + name, mcLoc("block/" + name + "_top"));

        buildWall("polished_" + name, modLoc("block/polished_" + name));
        buildPressure("polished_" + name, modLoc("block/polished_" + name));

        buildWall(name + "_paving", modLoc("block/" + name + "_paving"));
        buildPressure(name + "_paving", modLoc("block/" + name + "_paving"));

        buildWall(name + "_tiles", modLoc("block/" + name + "_tiles"));
        buildPressure(name + "_tiles", modLoc("block/" + name + "_tiles"));

        buildWall(name + "_bricks", modLoc("block/" + name + "_bricks"));
        buildPressure(name + "_bricks", modLoc("block/" + name + "_bricks"));

        buildWall(name + "_large_bricks", modLoc("block/" + name + "_large_bricks"));
        buildPressure(name + "_large_bricks", modLoc("block/" + name + "_large_bricks"));

        buildWall(name + "_paving_stones", modLoc("block/" + name + "_paving_stones"));
        buildPressure(name + "_paving_stones", modLoc("block/" + name + "_paving_stones"));
    }
}