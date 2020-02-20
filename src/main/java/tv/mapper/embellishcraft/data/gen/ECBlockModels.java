package tv.mapper.embellishcraft.data.gen;

import net.minecraft.data.DataGenerator;
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
        // Basalt
        getBuilder("basalt_wall_inventory").parent(getExistingFile(mcLoc("block/wall_inventory"))).texture("wall", modLoc("block/basalt"));
        getBuilder("basalt_pressure_plate").parent(getExistingFile(mcLoc("block/pressure_plate_up"))).texture("texture", modLoc("block/basalt"));
        getBuilder("basalt_pressure_plate_down").parent(getExistingFile(mcLoc("block/pressure_plate_down"))).texture("texture", modLoc("block/basalt"));

        getBuilder("basalt_cobblestone_wall_inventory").parent(getExistingFile(mcLoc("block/wall_inventory"))).texture("wall", modLoc("block/basalt_cobblestone"));
        getBuilder("basalt_cobblestone_pressure_plate").parent(getExistingFile(mcLoc("block/pressure_plate_up"))).texture("texture", modLoc("block/basalt_cobblestone"));
        getBuilder("basalt_cobblestone_pressure_plate_down").parent(getExistingFile(mcLoc("block/pressure_plate_down"))).texture("texture", modLoc("block/basalt_cobblestone"));

        getBuilder("basalt_bricks_wall_inventory").parent(getExistingFile(mcLoc("block/wall_inventory"))).texture("wall", modLoc("block/basalt_bricks"));
        getBuilder("basalt_bricks_pressure_plate").parent(getExistingFile(mcLoc("block/pressure_plate_up"))).texture("texture", modLoc("block/basalt_bricks"));
        getBuilder("basalt_bricks_pressure_plate_down").parent(getExistingFile(mcLoc("block/pressure_plate_down"))).texture("texture", modLoc("block/basalt_bricks"));

        getBuilder("basalt_large_bricks_wall_inventory").parent(getExistingFile(mcLoc("block/wall_inventory"))).texture("wall", modLoc("block/basalt_large_bricks"));
        getBuilder("basalt_large_bricks_pressure_plate").parent(getExistingFile(mcLoc("block/pressure_plate_up"))).texture("texture", modLoc("block/basalt_large_bricks"));
        getBuilder("basalt_large_bricks_pressure_plate_down").parent(getExistingFile(mcLoc("block/pressure_plate_down"))).texture("texture", modLoc("block/basalt_large_bricks"));

        // Slate
        getBuilder("slate_wall_inventory").parent(getExistingFile(mcLoc("block/wall_inventory"))).texture("wall", modLoc("block/slate"));
        getBuilder("slate_pressure_plate").parent(getExistingFile(mcLoc("block/pressure_plate_up"))).texture("texture", modLoc("block/slate"));
        getBuilder("slate_pressure_plate_down").parent(getExistingFile(mcLoc("block/pressure_plate_down"))).texture("texture", modLoc("block/slate"));

        getBuilder("slate_cobblestone_wall_inventory").parent(getExistingFile(mcLoc("block/wall_inventory"))).texture("wall", modLoc("block/slate_cobblestone"));
        getBuilder("slate_cobblestone_pressure_plate").parent(getExistingFile(mcLoc("block/pressure_plate_up"))).texture("texture", modLoc("block/slate_cobblestone"));
        getBuilder("slate_cobblestone_pressure_plate_down").parent(getExistingFile(mcLoc("block/pressure_plate_down"))).texture("texture", modLoc("block/slate_cobblestone"));

        getBuilder("slate_bricks_wall_inventory").parent(getExistingFile(mcLoc("block/wall_inventory"))).texture("wall", modLoc("block/slate_bricks"));
        getBuilder("slate_bricks_pressure_plate").parent(getExistingFile(mcLoc("block/pressure_plate_up"))).texture("texture", modLoc("block/slate_bricks"));
        getBuilder("slate_bricks_pressure_plate_down").parent(getExistingFile(mcLoc("block/pressure_plate_down"))).texture("texture", modLoc("block/slate_bricks"));

        getBuilder("slate_large_bricks_wall_inventory").parent(getExistingFile(mcLoc("block/wall_inventory"))).texture("wall", modLoc("block/slate_large_bricks"));
        getBuilder("slate_large_bricks_pressure_plate").parent(getExistingFile(mcLoc("block/pressure_plate_up"))).texture("texture", modLoc("block/slate_large_bricks"));
        getBuilder("slate_large_bricks_pressure_plate_down").parent(getExistingFile(mcLoc("block/pressure_plate_down"))).texture("texture", modLoc("block/slate_large_bricks"));

        // Marble
        getBuilder("marble_wall_inventory").parent(getExistingFile(mcLoc("block/wall_inventory"))).texture("wall", modLoc("block/marble"));
        getBuilder("marble_pressure_plate").parent(getExistingFile(mcLoc("block/pressure_plate_up"))).texture("texture", modLoc("block/marble"));
        getBuilder("marble_pressure_plate_down").parent(getExistingFile(mcLoc("block/pressure_plate_down"))).texture("texture", modLoc("block/marble"));

        getBuilder("marble_cobblestone_wall_inventory").parent(getExistingFile(mcLoc("block/wall_inventory"))).texture("wall", modLoc("block/marble_cobblestone"));
        getBuilder("marble_cobblestone_pressure_plate").parent(getExistingFile(mcLoc("block/pressure_plate_up"))).texture("texture", modLoc("block/marble_cobblestone"));
        getBuilder("marble_cobblestone_pressure_plate_down").parent(getExistingFile(mcLoc("block/pressure_plate_down"))).texture("texture", modLoc("block/marble_cobblestone"));

        getBuilder("marble_bricks_wall_inventory").parent(getExistingFile(mcLoc("block/wall_inventory"))).texture("wall", modLoc("block/marble_bricks"));
        getBuilder("marble_bricks_pressure_plate").parent(getExistingFile(mcLoc("block/pressure_plate_up"))).texture("texture", modLoc("block/marble_bricks"));
        getBuilder("marble_bricks_pressure_plate_down").parent(getExistingFile(mcLoc("block/pressure_plate_down"))).texture("texture", modLoc("block/marble_bricks"));

        getBuilder("marble_large_bricks_wall_inventory").parent(getExistingFile(mcLoc("block/wall_inventory"))).texture("wall", modLoc("block/marble_large_bricks"));
        getBuilder("marble_large_bricks_pressure_plate").parent(getExistingFile(mcLoc("block/pressure_plate_up"))).texture("texture", modLoc("block/marble_large_bricks"));
        getBuilder("marble_large_bricks_pressure_plate_down").parent(getExistingFile(mcLoc("block/pressure_plate_down"))).texture("texture", modLoc("block/marble_large_bricks"));

        // Gneiss
        getBuilder("gneiss_wall_inventory").parent(getExistingFile(mcLoc("block/wall_inventory"))).texture("wall", modLoc("block/gneiss"));
        getBuilder("gneiss_pressure_plate").parent(getExistingFile(mcLoc("block/pressure_plate_up"))).texture("texture", modLoc("block/gneiss"));
        getBuilder("gneiss_pressure_plate_down").parent(getExistingFile(mcLoc("block/pressure_plate_down"))).texture("texture", modLoc("block/gneiss"));

        getBuilder("gneiss_cobblestone_wall_inventory").parent(getExistingFile(mcLoc("block/wall_inventory"))).texture("wall", modLoc("block/gneiss_cobblestone"));
        getBuilder("gneiss_cobblestone_pressure_plate").parent(getExistingFile(mcLoc("block/pressure_plate_up"))).texture("texture", modLoc("block/gneiss_cobblestone"));
        getBuilder("gneiss_cobblestone_pressure_plate_down").parent(getExistingFile(mcLoc("block/pressure_plate_down"))).texture("texture", modLoc("block/gneiss_cobblestone"));

        getBuilder("gneiss_bricks_wall_inventory").parent(getExistingFile(mcLoc("block/wall_inventory"))).texture("wall", modLoc("block/gneiss_bricks"));
        getBuilder("gneiss_bricks_pressure_plate").parent(getExistingFile(mcLoc("block/pressure_plate_up"))).texture("texture", modLoc("block/gneiss_bricks"));
        getBuilder("gneiss_bricks_pressure_plate_down").parent(getExistingFile(mcLoc("block/pressure_plate_down"))).texture("texture", modLoc("block/gneiss_bricks"));

        getBuilder("gneiss_large_bricks_wall_inventory").parent(getExistingFile(mcLoc("block/wall_inventory"))).texture("wall", modLoc("block/gneiss_large_bricks"));
        getBuilder("gneiss_large_bricks_pressure_plate").parent(getExistingFile(mcLoc("block/pressure_plate_up"))).texture("texture", modLoc("block/gneiss_large_bricks"));
        getBuilder("gneiss_large_bricks_pressure_plate_down").parent(getExistingFile(mcLoc("block/pressure_plate_down"))).texture("texture", modLoc("block/gneiss_large_bricks"));

        // Jade
        getBuilder("jade_wall_inventory").parent(getExistingFile(mcLoc("block/wall_inventory"))).texture("wall", modLoc("block/jade"));
        getBuilder("jade_pressure_plate").parent(getExistingFile(mcLoc("block/pressure_plate_up"))).texture("texture", modLoc("block/jade"));
        getBuilder("jade_pressure_plate_down").parent(getExistingFile(mcLoc("block/pressure_plate_down"))).texture("texture", modLoc("block/jade"));

        getBuilder("jade_cobblestone_wall_inventory").parent(getExistingFile(mcLoc("block/wall_inventory"))).texture("wall", modLoc("block/jade_cobblestone"));
        getBuilder("jade_cobblestone_pressure_plate").parent(getExistingFile(mcLoc("block/pressure_plate_up"))).texture("texture", modLoc("block/jade_cobblestone"));
        getBuilder("jade_cobblestone_pressure_plate_down").parent(getExistingFile(mcLoc("block/pressure_plate_down"))).texture("texture", modLoc("block/jade_cobblestone"));

        getBuilder("jade_bricks_wall_inventory").parent(getExistingFile(mcLoc("block/wall_inventory"))).texture("wall", modLoc("block/jade_bricks"));
        getBuilder("jade_bricks_pressure_plate").parent(getExistingFile(mcLoc("block/pressure_plate_up"))).texture("texture", modLoc("block/jade_bricks"));
        getBuilder("jade_bricks_pressure_plate_down").parent(getExistingFile(mcLoc("block/pressure_plate_down"))).texture("texture", modLoc("block/jade_bricks"));

        getBuilder("jade_large_bricks_wall_inventory").parent(getExistingFile(mcLoc("block/wall_inventory"))).texture("wall", modLoc("block/jade_large_bricks"));
        getBuilder("jade_large_bricks_pressure_plate").parent(getExistingFile(mcLoc("block/pressure_plate_up"))).texture("texture", modLoc("block/jade_large_bricks"));
        getBuilder("jade_large_bricks_pressure_plate_down").parent(getExistingFile(mcLoc("block/pressure_plate_down"))).texture("texture", modLoc("block/jade_large_bricks"));

        // Larvikite
        getBuilder("larvikite_wall_inventory").parent(getExistingFile(mcLoc("block/wall_inventory"))).texture("wall", modLoc("block/larvikite"));
        getBuilder("larvikite_pressure_plate").parent(getExistingFile(mcLoc("block/pressure_plate_up"))).texture("texture", modLoc("block/larvikite"));
        getBuilder("larvikite_pressure_plate_down").parent(getExistingFile(mcLoc("block/pressure_plate_down"))).texture("texture", modLoc("block/larvikite"));

        getBuilder("larvikite_cobblestone_wall_inventory").parent(getExistingFile(mcLoc("block/wall_inventory"))).texture("wall", modLoc("block/larvikite_cobblestone"));
        getBuilder("larvikite_cobblestone_pressure_plate").parent(getExistingFile(mcLoc("block/pressure_plate_up"))).texture("texture", modLoc("block/larvikite_cobblestone"));
        getBuilder("larvikite_cobblestone_pressure_plate_down").parent(getExistingFile(mcLoc("block/pressure_plate_down"))).texture("texture", modLoc("block/larvikite_cobblestone"));

        getBuilder("larvikite_bricks_wall_inventory").parent(getExistingFile(mcLoc("block/wall_inventory"))).texture("wall", modLoc("block/larvikite_bricks"));
        getBuilder("larvikite_bricks_pressure_plate").parent(getExistingFile(mcLoc("block/pressure_plate_up"))).texture("texture", modLoc("block/larvikite_bricks"));
        getBuilder("larvikite_bricks_pressure_plate_down").parent(getExistingFile(mcLoc("block/pressure_plate_down"))).texture("texture", modLoc("block/larvikite_bricks"));

        getBuilder("larvikite_large_bricks_wall_inventory").parent(getExistingFile(mcLoc("block/wall_inventory"))).texture("wall", modLoc("block/larvikite_large_bricks"));
        getBuilder("larvikite_large_bricks_pressure_plate").parent(getExistingFile(mcLoc("block/pressure_plate_up"))).texture("texture", modLoc("block/larvikite_large_bricks"));
        getBuilder("larvikite_large_bricks_pressure_plate_down").parent(getExistingFile(mcLoc("block/pressure_plate_down"))).texture("texture", modLoc("block/larvikite_large_bricks"));

    }
}
