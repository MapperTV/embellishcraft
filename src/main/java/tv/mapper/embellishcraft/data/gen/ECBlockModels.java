package tv.mapper.embellishcraft.data.gen;

import net.minecraft.data.DataGenerator;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.generators.BlockModelProvider;
import net.minecraftforge.client.model.generators.ExistingFileHelper;

public class ECBlockModels extends BlockModelProvider
{
    public ECBlockModels(DataGenerator generator, String modid, ExistingFileHelper existingFileHelper)
    {
        super(generator, modid, existingFileHelper);
    }

    @Override
    public String getName()
    {
        return "EmbellishCraft Block Models";
    }

    @Override
    protected void registerModels()
    {
        buildAllStone("basalt");
        buildAllStone("slate");
        buildAllStone("marble");
        buildAllStone("gneiss");
        buildAllStone("jade");
        buildAllStone("larvikite");

        buildMcStone("andesite");
        buildMcStone("diorite");
        buildMcStone("granite");

        buildMcSandstone("sandstone");
        buildMcSandstone("red_sandstone");

        // Terracotta
        buildWall("terracotta", mcLoc("block/terracotta"));
        buildWall("polished_terracotta", modLoc("block/polished_terracotta"));
        buildWall("terracotta_paving", modLoc("block/terracotta_paving"));
        buildWall("terracotta_tiles", modLoc("block/terracotta_tiles"));
        buildWall("terracotta_bricks", modLoc("block/terracotta_bricks"));
        buildWall("terracotta_large_bricks", modLoc("block/terracotta_large_bricks"));
        buildButton("terracotta", mcLoc("block/terracotta"));

        buildPressure("terracotta", mcLoc("block/terracotta"));
        buildPressure("polished_terracotta", modLoc("block/polished_terracotta"));
        buildPressure("terracotta_paving", modLoc("block/terracotta_paving"));
        buildPressure("terracotta_tiles", modLoc("block/terracotta_tiles"));
        buildPressure("terracotta_bricks", modLoc("block/terracotta_bricks"));
        buildPressure("terracotta_large_bricks", modLoc("block/terracotta_large_bricks"));

        // Other bricks
        buildWall("dark_bricks", modLoc("block/dark_bricks"));
        buildWall("old_bricks", modLoc("block/old_bricks"));
        buildWall("weared_bricks", modLoc("block/weared_bricks"));
        buildPressure("dark_bricks", modLoc("block/dark_bricks"));
        buildPressure("old_bricks", modLoc("block/old_bricks"));
        buildPressure("weared_bricks", modLoc("block/weared_bricks"));
        
        buildWall("dark_large_bricks", modLoc("block/dark_large_bricks"));
        buildWall("old_large_bricks", modLoc("block/old_large_bricks"));
        buildWall("weared_large_bricks", modLoc("block/weared_large_bricks"));
        buildPressure("dark_large_bricks", modLoc("block/dark_large_bricks"));
        buildPressure("old_large_bricks", modLoc("block/old_large_bricks"));
        buildPressure("weared_large_bricks", modLoc("block/weared_large_bricks"));

    }

    private void buildWall(String name, ResourceLocation texture)
    {
        getBuilder(name + "_wall_inventory").parent(getExistingFile(mcLoc("block/wall_inventory"))).texture("wall", texture);
    }

    private void buildPressure(String name, ResourceLocation texture)
    {
        getBuilder(name + "_pressure_plate").parent(getExistingFile(mcLoc("block/pressure_plate_up"))).texture("texture", texture);
        getBuilder(name + "_pressure_plate_down").parent(getExistingFile(mcLoc("block/pressure_plate_down"))).texture("texture", texture);
    }

    private void buildButton(String name, ResourceLocation texture)
    {
        getBuilder(name + "_button_inventory").parent(getExistingFile(mcLoc("block/button_inventory"))).texture("texture", texture);
        getBuilder(name + "_button_pressed").parent(getExistingFile(mcLoc("block/button_pressed"))).texture("texture", texture);
        getBuilder(name + "_button").parent(getExistingFile(mcLoc("block/button"))).texture("texture", texture);
    }

    private void buildAllStoneWall(String name)
    {
        buildWall(name, modLoc("block/" + name));
        buildWall(name + "_cobblestone", modLoc("block/" + name + "_cobblestone"));
        buildWall("smooth_" + name, modLoc("block/smooth_" + name));
        buildWall("polished_" + name, modLoc("block/polished_" + name));
        buildWall(name + "_paving", modLoc("block/" + name + "_paving"));
        buildWall(name + "_tiles", modLoc("block/" + name + "_tiles"));
        buildWall(name + "_bricks", modLoc("block/" + name + "_bricks"));
        buildWall(name + "_large_bricks", modLoc("block/" + name + "_large_bricks"));
    }

    private void buildAllStonePressure(String name)
    {
        buildPressure(name, modLoc("block/" + name));
        buildPressure(name + "_cobblestone", modLoc("block/" + name + "_cobblestone"));
        buildPressure("smooth_" + name, modLoc("block/smooth_" + name));
        buildPressure("polished_" + name, modLoc("block/polished_" + name));
        buildPressure(name + "_paving", modLoc("block/" + name + "_paving"));
        buildPressure(name + "_tiles", modLoc("block/" + name + "_tiles"));
        buildPressure(name + "_bricks", modLoc("block/" + name + "_bricks"));
        buildPressure(name + "_large_bricks", modLoc("block/" + name + "_large_bricks"));
        buildPressure(name + "_ornament", modLoc("block/" + name + "_ornament"));
    }

    private void buildAllStone(String name)
    {
        buildAllStoneWall(name);
        buildAllStonePressure(name);
        buildButton(name, modLoc("block/" + name));
    }

    private void buildMcStone(String name)
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

        buildPressure(name + "_ornament", modLoc("block/" + name + "_ornament"));
    }

    private void buildMcSandstone(String name)
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
    }
}
