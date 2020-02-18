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
        getBuilder("basalt_wall_inventory").parent(getExistingFile(mcLoc("block/wall_inventory"))).texture("wall", modLoc("block/basalt"));
        getBuilder("basalt_pressure_plate").parent(getExistingFile(mcLoc("block/pressure_plate_up"))).texture("texture", modLoc("block/basalt"));
        getBuilder("basalt_pressure_plate_down").parent(getExistingFile(mcLoc("block/pressure_plate_down"))).texture("texture", modLoc("block/basalt"));

        getBuilder("slate_wall_inventory").parent(getExistingFile(mcLoc("block/wall_inventory"))).texture("wall", modLoc("block/slate"));
        getBuilder("slate_pressure_plate").parent(getExistingFile(mcLoc("block/pressure_plate_up"))).texture("texture", modLoc("block/slate"));
        getBuilder("slate_pressure_plate_down").parent(getExistingFile(mcLoc("block/pressure_plate_down"))).texture("texture", modLoc("block/slate"));

        getBuilder("marble_wall_inventory").parent(getExistingFile(mcLoc("block/wall_inventory"))).texture("wall", modLoc("block/marble"));
        getBuilder("marble_pressure_plate").parent(getExistingFile(mcLoc("block/pressure_plate_up"))).texture("texture", modLoc("block/marble"));
        getBuilder("marble_pressure_plate_down").parent(getExistingFile(mcLoc("block/pressure_plate_down"))).texture("texture", modLoc("block/marble"));

        getBuilder("gneiss_wall_inventory").parent(getExistingFile(mcLoc("block/wall_inventory"))).texture("wall", modLoc("block/gneiss"));
        getBuilder("gneiss_pressure_plate").parent(getExistingFile(mcLoc("block/pressure_plate_up"))).texture("texture", modLoc("block/gneiss"));
        getBuilder("gneiss_pressure_plate_down").parent(getExistingFile(mcLoc("block/pressure_plate_down"))).texture("texture", modLoc("block/gneiss"));

        getBuilder("jade_wall_inventory").parent(getExistingFile(mcLoc("block/wall_inventory"))).texture("wall", modLoc("block/jade"));
        getBuilder("jade_pressure_plate").parent(getExistingFile(mcLoc("block/pressure_plate_up"))).texture("texture", modLoc("block/jade"));
        getBuilder("jade_pressure_plate_down").parent(getExistingFile(mcLoc("block/pressure_plate_down"))).texture("texture", modLoc("block/jade"));

        getBuilder("larvikite_wall_inventory").parent(getExistingFile(mcLoc("block/wall_inventory"))).texture("wall", modLoc("block/larvikite"));
        getBuilder("larvikite_pressure_plate").parent(getExistingFile(mcLoc("block/pressure_plate_up"))).texture("texture", modLoc("block/larvikite"));
        getBuilder("larvikite_pressure_plate_down").parent(getExistingFile(mcLoc("block/pressure_plate_down"))).texture("texture", modLoc("block/larvikite"));

        getBuilder("basalt_cobblestone_wall_inventory").parent(getExistingFile(mcLoc("block/wall_inventory"))).texture("wall", modLoc("block/basalt_cobblestone"));
        getBuilder("basalt_cobblestone_pressure_plate").parent(getExistingFile(mcLoc("block/pressure_plate_up"))).texture("texture", modLoc("block/basalt_cobblestone"));
        getBuilder("basalt_cobblestone_pressure_plate_down").parent(getExistingFile(mcLoc("block/pressure_plate_down"))).texture("texture", modLoc("block/basalt_cobblestone"));

        getBuilder("slate_cobblestone_wall_inventory").parent(getExistingFile(mcLoc("block/wall_inventory"))).texture("wall", modLoc("block/slate_cobblestone"));
        getBuilder("slate_cobblestone_pressure_plate").parent(getExistingFile(mcLoc("block/pressure_plate_up"))).texture("texture", modLoc("block/slate_cobblestone"));
        getBuilder("slate_cobblestone_pressure_plate_down").parent(getExistingFile(mcLoc("block/pressure_plate_down"))).texture("texture", modLoc("block/slate_cobblestone"));

        getBuilder("marble_cobblestone_wall_inventory").parent(getExistingFile(mcLoc("block/wall_inventory"))).texture("wall", modLoc("block/marble_cobblestone"));
        getBuilder("marble_cobblestone_pressure_plate").parent(getExistingFile(mcLoc("block/pressure_plate_up"))).texture("texture", modLoc("block/marble_cobblestone"));
        getBuilder("marble_cobblestone_pressure_plate_down").parent(getExistingFile(mcLoc("block/pressure_plate_down"))).texture("texture", modLoc("block/marble_cobblestone"));

        getBuilder("gneiss_cobblestone_wall_inventory").parent(getExistingFile(mcLoc("block/wall_inventory"))).texture("wall", modLoc("block/gneiss_cobblestone"));
        getBuilder("gneiss_cobblestone_pressure_plate").parent(getExistingFile(mcLoc("block/pressure_plate_up"))).texture("texture", modLoc("block/gneiss_cobblestone"));
        getBuilder("gneiss_cobblestone_pressure_plate_down").parent(getExistingFile(mcLoc("block/pressure_plate_down"))).texture("texture", modLoc("block/gneiss_cobblestone"));

        getBuilder("jade_cobblestone_wall_inventory").parent(getExistingFile(mcLoc("block/wall_inventory"))).texture("wall", modLoc("block/jade_cobblestone"));
        getBuilder("jade_cobblestone_pressure_plate").parent(getExistingFile(mcLoc("block/pressure_plate_up"))).texture("texture", modLoc("block/jade_cobblestone"));
        getBuilder("jade_cobblestone_pressure_plate_down").parent(getExistingFile(mcLoc("block/pressure_plate_down"))).texture("texture", modLoc("block/jade_cobblestone"));

        getBuilder("larvikite_cobblestone_wall_inventory").parent(getExistingFile(mcLoc("block/wall_inventory"))).texture("wall", modLoc("block/larvikite_cobblestone"));
        getBuilder("larvikite_cobblestone_pressure_plate").parent(getExistingFile(mcLoc("block/pressure_plate_up"))).texture("texture", modLoc("block/larvikite_cobblestone"));
        getBuilder("larvikite_cobblestone_pressure_plate_down").parent(getExistingFile(mcLoc("block/pressure_plate_down"))).texture("texture", modLoc("block/larvikite_cobblestone"));
    }
}
