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

    @Override
    protected void registerModels()
    {
        buildAllStone("basalt");
        buildAllStone("slate");
        buildAllStone("marble");
        buildAllStone("gneiss");
        buildAllStone("jade");
        buildAllStone("larvikite");

        // Andesite
        getBuilder("smooth_andesite_wall_inventory").parent(getExistingFile(mcLoc("block/wall_inventory"))).texture("wall", modLoc("block/smooth_andesite"));
        getBuilder("smooth_andesite_pressure_plate").parent(getExistingFile(mcLoc("block/pressure_plate_up"))).texture("texture", modLoc("block/smooth_andesite"));
        getBuilder("smooth_andesite_pressure_plate_down").parent(getExistingFile(mcLoc("block/pressure_plate_down"))).texture("texture", modLoc("block/smooth_andesite"));
        getBuilder("andesite_button_inventory").parent(getExistingFile(mcLoc("block/button_inventory"))).texture("texture", mcLoc("block/andesite"));
        getBuilder("andesite_button_pressed").parent(getExistingFile(mcLoc("block/button_pressed"))).texture("texture", mcLoc("block/andesite"));
        getBuilder("andesite_button").parent(getExistingFile(mcLoc("block/button"))).texture("texture", mcLoc("block/andesite"));

        getBuilder("andesite_paving_wall_inventory").parent(getExistingFile(mcLoc("block/wall_inventory"))).texture("wall", modLoc("block/andesite_paving"));
        getBuilder("andesite_paving_pressure_plate").parent(getExistingFile(mcLoc("block/pressure_plate_up"))).texture("texture", modLoc("block/andesite_paving"));
        getBuilder("andesite_paving_pressure_plate_down").parent(getExistingFile(mcLoc("block/pressure_plate_down"))).texture("texture", modLoc("block/andesite_paving"));

        getBuilder("andesite_tiles_wall_inventory").parent(getExistingFile(mcLoc("block/wall_inventory"))).texture("wall", modLoc("block/andesite_tiles"));
        getBuilder("andesite_tiles_pressure_plate").parent(getExistingFile(mcLoc("block/pressure_plate_up"))).texture("texture", modLoc("block/andesite_tiles"));
        getBuilder("andesite_tiles_pressure_plate_down").parent(getExistingFile(mcLoc("block/pressure_plate_down"))).texture("texture", modLoc("block/andesite_tiles"));

        getBuilder("andesite_bricks_wall_inventory").parent(getExistingFile(mcLoc("block/wall_inventory"))).texture("wall", modLoc("block/andesite_bricks"));
        getBuilder("andesite_bricks_pressure_plate").parent(getExistingFile(mcLoc("block/pressure_plate_up"))).texture("texture", modLoc("block/andesite_bricks"));
        getBuilder("andesite_bricks_pressure_plate_down").parent(getExistingFile(mcLoc("block/pressure_plate_down"))).texture("texture", modLoc("block/andesite_bricks"));

        getBuilder("andesite_large_bricks_wall_inventory").parent(getExistingFile(mcLoc("block/wall_inventory"))).texture("wall", modLoc("block/andesite_large_bricks"));
        getBuilder("andesite_large_bricks_pressure_plate").parent(getExistingFile(mcLoc("block/pressure_plate_up"))).texture("texture", modLoc("block/andesite_large_bricks"));
        getBuilder("andesite_large_bricks_pressure_plate_down").parent(getExistingFile(mcLoc("block/pressure_plate_down"))).texture("texture", modLoc("block/andesite_large_bricks"));

        getBuilder("andesite_ornament_pressure_plate").parent(getExistingFile(mcLoc("block/pressure_plate_up"))).texture("texture", modLoc("block/andesite_ornament"));
        getBuilder("andesite_ornament_pressure_plate_down").parent(getExistingFile(mcLoc("block/pressure_plate_down"))).texture("texture", modLoc("block/andesite_ornament"));

        // Diorite
        getBuilder("smooth_diorite_wall_inventory").parent(getExistingFile(mcLoc("block/wall_inventory"))).texture("wall", modLoc("block/smooth_diorite"));
        getBuilder("smooth_diorite_pressure_plate").parent(getExistingFile(mcLoc("block/pressure_plate_up"))).texture("texture", modLoc("block/smooth_diorite"));
        getBuilder("smooth_diorite_pressure_plate_down").parent(getExistingFile(mcLoc("block/pressure_plate_down"))).texture("texture", modLoc("block/smooth_diorite"));
        getBuilder("diorite_button_inventory").parent(getExistingFile(mcLoc("block/button_inventory"))).texture("texture", mcLoc("block/diorite"));
        getBuilder("diorite_button_pressed").parent(getExistingFile(mcLoc("block/button_pressed"))).texture("texture", mcLoc("block/diorite"));
        getBuilder("diorite_button").parent(getExistingFile(mcLoc("block/button"))).texture("texture", mcLoc("block/diorite"));

        getBuilder("diorite_paving_wall_inventory").parent(getExistingFile(mcLoc("block/wall_inventory"))).texture("wall", modLoc("block/diorite_paving"));
        getBuilder("diorite_paving_pressure_plate").parent(getExistingFile(mcLoc("block/pressure_plate_up"))).texture("texture", modLoc("block/diorite_paving"));
        getBuilder("diorite_paving_pressure_plate_down").parent(getExistingFile(mcLoc("block/pressure_plate_down"))).texture("texture", modLoc("block/diorite_paving"));

        getBuilder("diorite_tiles_wall_inventory").parent(getExistingFile(mcLoc("block/wall_inventory"))).texture("wall", modLoc("block/diorite_tiles"));
        getBuilder("diorite_tiles_pressure_plate").parent(getExistingFile(mcLoc("block/pressure_plate_up"))).texture("texture", modLoc("block/diorite_tiles"));
        getBuilder("diorite_tiles_pressure_plate_down").parent(getExistingFile(mcLoc("block/pressure_plate_down"))).texture("texture", modLoc("block/diorite_tiles"));

        getBuilder("diorite_bricks_wall_inventory").parent(getExistingFile(mcLoc("block/wall_inventory"))).texture("wall", modLoc("block/diorite_bricks"));
        getBuilder("diorite_bricks_pressure_plate").parent(getExistingFile(mcLoc("block/pressure_plate_up"))).texture("texture", modLoc("block/diorite_bricks"));
        getBuilder("diorite_bricks_pressure_plate_down").parent(getExistingFile(mcLoc("block/pressure_plate_down"))).texture("texture", modLoc("block/diorite_bricks"));

        getBuilder("diorite_large_bricks_wall_inventory").parent(getExistingFile(mcLoc("block/wall_inventory"))).texture("wall", modLoc("block/diorite_large_bricks"));
        getBuilder("diorite_large_bricks_pressure_plate").parent(getExistingFile(mcLoc("block/pressure_plate_up"))).texture("texture", modLoc("block/diorite_large_bricks"));
        getBuilder("diorite_large_bricks_pressure_plate_down").parent(getExistingFile(mcLoc("block/pressure_plate_down"))).texture("texture", modLoc("block/diorite_large_bricks"));

        getBuilder("diorite_ornament_pressure_plate").parent(getExistingFile(mcLoc("block/pressure_plate_up"))).texture("texture", modLoc("block/diorite_ornament"));
        getBuilder("diorite_ornament_pressure_plate_down").parent(getExistingFile(mcLoc("block/pressure_plate_down"))).texture("texture", modLoc("block/diorite_ornament"));

        // Granite
        getBuilder("smooth_granite_wall_inventory").parent(getExistingFile(mcLoc("block/wall_inventory"))).texture("wall", modLoc("block/smooth_granite"));
        getBuilder("smooth_granite_pressure_plate").parent(getExistingFile(mcLoc("block/pressure_plate_up"))).texture("texture", modLoc("block/smooth_granite"));
        getBuilder("smooth_granite_pressure_plate_down").parent(getExistingFile(mcLoc("block/pressure_plate_down"))).texture("texture", modLoc("block/smooth_granite"));
        getBuilder("granite_button_inventory").parent(getExistingFile(mcLoc("block/button_inventory"))).texture("texture", mcLoc("block/granite"));
        getBuilder("granite_button_pressed").parent(getExistingFile(mcLoc("block/button_pressed"))).texture("texture", mcLoc("block/granite"));
        getBuilder("granite_button").parent(getExistingFile(mcLoc("block/button"))).texture("texture", mcLoc("block/granite"));

        getBuilder("granite_paving_wall_inventory").parent(getExistingFile(mcLoc("block/wall_inventory"))).texture("wall", modLoc("block/granite_paving"));
        getBuilder("granite_paving_pressure_plate").parent(getExistingFile(mcLoc("block/pressure_plate_up"))).texture("texture", modLoc("block/granite_paving"));
        getBuilder("granite_paving_pressure_plate_down").parent(getExistingFile(mcLoc("block/pressure_plate_down"))).texture("texture", modLoc("block/granite_paving"));

        getBuilder("granite_tiles_wall_inventory").parent(getExistingFile(mcLoc("block/wall_inventory"))).texture("wall", modLoc("block/granite_tiles"));
        getBuilder("granite_tiles_pressure_plate").parent(getExistingFile(mcLoc("block/pressure_plate_up"))).texture("texture", modLoc("block/granite_tiles"));
        getBuilder("granite_tiles_pressure_plate_down").parent(getExistingFile(mcLoc("block/pressure_plate_down"))).texture("texture", modLoc("block/granite_tiles"));

        getBuilder("granite_bricks_wall_inventory").parent(getExistingFile(mcLoc("block/wall_inventory"))).texture("wall", modLoc("block/granite_bricks"));
        getBuilder("granite_bricks_pressure_plate").parent(getExistingFile(mcLoc("block/pressure_plate_up"))).texture("texture", modLoc("block/granite_bricks"));
        getBuilder("granite_bricks_pressure_plate_down").parent(getExistingFile(mcLoc("block/pressure_plate_down"))).texture("texture", modLoc("block/granite_bricks"));

        getBuilder("granite_large_bricks_wall_inventory").parent(getExistingFile(mcLoc("block/wall_inventory"))).texture("wall", modLoc("block/granite_large_bricks"));
        getBuilder("granite_large_bricks_pressure_plate").parent(getExistingFile(mcLoc("block/pressure_plate_up"))).texture("texture", modLoc("block/granite_large_bricks"));
        getBuilder("granite_large_bricks_pressure_plate_down").parent(getExistingFile(mcLoc("block/pressure_plate_down"))).texture("texture", modLoc("block/granite_large_bricks"));

        getBuilder("granite_ornament_pressure_plate").parent(getExistingFile(mcLoc("block/pressure_plate_up"))).texture("texture", modLoc("block/granite_ornament"));
        getBuilder("granite_ornament_pressure_plate_down").parent(getExistingFile(mcLoc("block/pressure_plate_down"))).texture("texture", modLoc("block/granite_ornament"));

        // Sandstone
        getBuilder("sandstone_button_inventory").parent(getExistingFile(mcLoc("block/button_inventory"))).texture("texture", mcLoc("block/sandstone"));
        getBuilder("sandstone_button_pressed").parent(getExistingFile(mcLoc("block/button_pressed"))).texture("texture", mcLoc("block/sandstone"));
        getBuilder("sandstone_button").parent(getExistingFile(mcLoc("block/button"))).texture("texture", mcLoc("block/sandstone"));

        getBuilder("smooth_sandstone_wall_inventory").parent(getExistingFile(mcLoc("block/wall_inventory"))).texture("wall", mcLoc("block/sandstone_top"));
        getBuilder("smooth_sandstone_pressure_plate").parent(getExistingFile(mcLoc("block/pressure_plate_up"))).texture("texture", mcLoc("block/sandstone_top"));
        getBuilder("smooth_sandstone_pressure_plate_down").parent(getExistingFile(mcLoc("block/pressure_plate_down"))).texture("texture", mcLoc("block/sandstone_top"));

        getBuilder("polished_sandstone_wall_inventory").parent(getExistingFile(mcLoc("block/wall_inventory"))).texture("wall", modLoc("block/polished_sandstone"));
        getBuilder("polished_sandstone_pressure_plate").parent(getExistingFile(mcLoc("block/pressure_plate_up"))).texture("texture", modLoc("block/polished_sandstone"));
        getBuilder("polished_sandstone_pressure_plate_down").parent(getExistingFile(mcLoc("block/pressure_plate_down"))).texture("texture", modLoc("block/polished_sandstone"));

        getBuilder("sandstone_paving_wall_inventory").parent(getExistingFile(mcLoc("block/wall_inventory"))).texture("wall", modLoc("block/sandstone_paving"));
        getBuilder("sandstone_paving_pressure_plate").parent(getExistingFile(mcLoc("block/pressure_plate_up"))).texture("texture", modLoc("block/sandstone_paving"));
        getBuilder("sandstone_paving_pressure_plate_down").parent(getExistingFile(mcLoc("block/pressure_plate_down"))).texture("texture", modLoc("block/sandstone_paving"));

        getBuilder("sandstone_tiles_wall_inventory").parent(getExistingFile(mcLoc("block/wall_inventory"))).texture("wall", modLoc("block/sandstone_tiles"));
        getBuilder("sandstone_tiles_pressure_plate").parent(getExistingFile(mcLoc("block/pressure_plate_up"))).texture("texture", modLoc("block/sandstone_tiles"));
        getBuilder("sandstone_tiles_pressure_plate_down").parent(getExistingFile(mcLoc("block/pressure_plate_down"))).texture("texture", modLoc("block/sandstone_tiles"));

        getBuilder("sandstone_bricks_wall_inventory").parent(getExistingFile(mcLoc("block/wall_inventory"))).texture("wall", modLoc("block/sandstone_bricks"));
        getBuilder("sandstone_bricks_pressure_plate").parent(getExistingFile(mcLoc("block/pressure_plate_up"))).texture("texture", modLoc("block/sandstone_bricks"));
        getBuilder("sandstone_bricks_pressure_plate_down").parent(getExistingFile(mcLoc("block/pressure_plate_down"))).texture("texture", modLoc("block/sandstone_bricks"));

        getBuilder("sandstone_large_bricks_wall_inventory").parent(getExistingFile(mcLoc("block/wall_inventory"))).texture("wall", modLoc("block/sandstone_large_bricks"));
        getBuilder("sandstone_large_bricks_pressure_plate").parent(getExistingFile(mcLoc("block/pressure_plate_up"))).texture("texture", modLoc("block/sandstone_large_bricks"));
        getBuilder("sandstone_large_bricks_pressure_plate_down").parent(getExistingFile(mcLoc("block/pressure_plate_down"))).texture("texture", modLoc("block/sandstone_large_bricks"));

        // Red Sandstone
        getBuilder("red_sandstone_button_inventory").parent(getExistingFile(mcLoc("block/button_inventory"))).texture("texture", mcLoc("block/red_sandstone"));
        getBuilder("red_sandstone_button_pressed").parent(getExistingFile(mcLoc("block/button_pressed"))).texture("texture", mcLoc("block/red_sandstone"));
        getBuilder("red_sandstone_button").parent(getExistingFile(mcLoc("block/button"))).texture("texture", mcLoc("block/red_sandstone"));

        getBuilder("smooth_red_sandstone_wall_inventory").parent(getExistingFile(mcLoc("block/wall_inventory"))).texture("wall", mcLoc("block/red_sandstone_top"));
        getBuilder("smooth_red_sandstone_pressure_plate").parent(getExistingFile(mcLoc("block/pressure_plate_up"))).texture("texture", mcLoc("block/red_sandstone_top"));
        getBuilder("smooth_red_sandstone_pressure_plate_down").parent(getExistingFile(mcLoc("block/pressure_plate_down"))).texture("texture", mcLoc("block/red_sandstone_top"));

        getBuilder("polished_red_sandstone_wall_inventory").parent(getExistingFile(mcLoc("block/wall_inventory"))).texture("wall", modLoc("block/polished_red_sandstone"));
        getBuilder("polished_red_sandstone_pressure_plate").parent(getExistingFile(mcLoc("block/pressure_plate_up"))).texture("texture", modLoc("block/polished_red_sandstone"));
        getBuilder("polished_red_sandstone_pressure_plate_down").parent(getExistingFile(mcLoc("block/pressure_plate_down"))).texture("texture", modLoc("block/polished_red_sandstone"));

        getBuilder("red_sandstone_paving_wall_inventory").parent(getExistingFile(mcLoc("block/wall_inventory"))).texture("wall", modLoc("block/red_sandstone_paving"));
        getBuilder("red_sandstone_paving_pressure_plate").parent(getExistingFile(mcLoc("block/pressure_plate_up"))).texture("texture", modLoc("block/red_sandstone_paving"));
        getBuilder("red_sandstone_paving_pressure_plate_down").parent(getExistingFile(mcLoc("block/pressure_plate_down"))).texture("texture", modLoc("block/red_sandstone_paving"));

        getBuilder("red_sandstone_tiles_wall_inventory").parent(getExistingFile(mcLoc("block/wall_inventory"))).texture("wall", modLoc("block/red_sandstone_tiles"));
        getBuilder("red_sandstone_tiles_pressure_plate").parent(getExistingFile(mcLoc("block/pressure_plate_up"))).texture("texture", modLoc("block/red_sandstone_tiles"));
        getBuilder("red_sandstone_tiles_pressure_plate_down").parent(getExistingFile(mcLoc("block/pressure_plate_down"))).texture("texture", modLoc("block/red_sandstone_tiles"));

        getBuilder("red_sandstone_bricks_wall_inventory").parent(getExistingFile(mcLoc("block/wall_inventory"))).texture("wall", modLoc("block/red_sandstone_bricks"));
        getBuilder("red_sandstone_bricks_pressure_plate").parent(getExistingFile(mcLoc("block/pressure_plate_up"))).texture("texture", modLoc("block/red_sandstone_bricks"));
        getBuilder("red_sandstone_bricks_pressure_plate_down").parent(getExistingFile(mcLoc("block/pressure_plate_down"))).texture("texture", modLoc("block/red_sandstone_bricks"));

        getBuilder("red_sandstone_large_bricks_wall_inventory").parent(getExistingFile(mcLoc("block/wall_inventory"))).texture("wall", modLoc("block/red_sandstone_large_bricks"));
        getBuilder("red_sandstone_large_bricks_pressure_plate").parent(getExistingFile(mcLoc("block/pressure_plate_up"))).texture("texture", modLoc("block/red_sandstone_large_bricks"));
        getBuilder("red_sandstone_large_bricks_pressure_plate_down").parent(getExistingFile(mcLoc("block/pressure_plate_down"))).texture("texture", modLoc("block/red_sandstone_large_bricks"));
    }
}
