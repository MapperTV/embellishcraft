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

        getBuilder("smooth_basalt_wall_inventory").parent(getExistingFile(mcLoc("block/wall_inventory"))).texture("wall", modLoc("block/smooth_basalt"));
        getBuilder("smooth_basalt_pressure_plate").parent(getExistingFile(mcLoc("block/pressure_plate_up"))).texture("texture", modLoc("block/smooth_basalt"));
        getBuilder("smooth_basalt_pressure_plate_down").parent(getExistingFile(mcLoc("block/pressure_plate_down"))).texture("texture", modLoc("block/smooth_basalt"));

        getBuilder("polished_basalt_wall_inventory").parent(getExistingFile(mcLoc("block/wall_inventory"))).texture("wall", modLoc("block/polished_basalt"));
        getBuilder("polished_basalt_pressure_plate").parent(getExistingFile(mcLoc("block/pressure_plate_up"))).texture("texture", modLoc("block/polished_basalt"));
        getBuilder("polished_basalt_pressure_plate_down").parent(getExistingFile(mcLoc("block/pressure_plate_down"))).texture("texture", modLoc("block/polished_basalt"));

        getBuilder("basalt_paving_wall_inventory").parent(getExistingFile(mcLoc("block/wall_inventory"))).texture("wall", modLoc("block/basalt_paving"));
        getBuilder("basalt_paving_pressure_plate").parent(getExistingFile(mcLoc("block/pressure_plate_up"))).texture("texture", modLoc("block/basalt_paving"));
        getBuilder("basalt_paving_pressure_plate_down").parent(getExistingFile(mcLoc("block/pressure_plate_down"))).texture("texture", modLoc("block/basalt_paving"));

        getBuilder("basalt_tiles_wall_inventory").parent(getExistingFile(mcLoc("block/wall_inventory"))).texture("wall", modLoc("block/basalt_tiles"));
        getBuilder("basalt_tiles_pressure_plate").parent(getExistingFile(mcLoc("block/pressure_plate_up"))).texture("texture", modLoc("block/basalt_tiles"));
        getBuilder("basalt_tiles_pressure_plate_down").parent(getExistingFile(mcLoc("block/pressure_plate_down"))).texture("texture", modLoc("block/basalt_tiles"));

        getBuilder("basalt_bricks_wall_inventory").parent(getExistingFile(mcLoc("block/wall_inventory"))).texture("wall", modLoc("block/basalt_bricks"));
        getBuilder("basalt_bricks_pressure_plate").parent(getExistingFile(mcLoc("block/pressure_plate_up"))).texture("texture", modLoc("block/basalt_bricks"));
        getBuilder("basalt_bricks_pressure_plate_down").parent(getExistingFile(mcLoc("block/pressure_plate_down"))).texture("texture", modLoc("block/basalt_bricks"));

        getBuilder("basalt_large_bricks_wall_inventory").parent(getExistingFile(mcLoc("block/wall_inventory"))).texture("wall", modLoc("block/basalt_large_bricks"));
        getBuilder("basalt_large_bricks_pressure_plate").parent(getExistingFile(mcLoc("block/pressure_plate_up"))).texture("texture", modLoc("block/basalt_large_bricks"));
        getBuilder("basalt_large_bricks_pressure_plate_down").parent(getExistingFile(mcLoc("block/pressure_plate_down"))).texture("texture", modLoc("block/basalt_large_bricks"));

        getBuilder("basalt_ornement_pressure_plate").parent(getExistingFile(mcLoc("block/pressure_plate_up"))).texture("texture", modLoc("block/basalt_ornement"));
        getBuilder("basalt_ornement_pressure_plate_down").parent(getExistingFile(mcLoc("block/pressure_plate_down"))).texture("texture", modLoc("block/basalt_ornement"));

        // Slate
        getBuilder("slate_wall_inventory").parent(getExistingFile(mcLoc("block/wall_inventory"))).texture("wall", modLoc("block/slate"));
        getBuilder("slate_pressure_plate").parent(getExistingFile(mcLoc("block/pressure_plate_up"))).texture("texture", modLoc("block/slate"));
        getBuilder("slate_pressure_plate_down").parent(getExistingFile(mcLoc("block/pressure_plate_down"))).texture("texture", modLoc("block/slate"));

        getBuilder("slate_cobblestone_wall_inventory").parent(getExistingFile(mcLoc("block/wall_inventory"))).texture("wall", modLoc("block/slate_cobblestone"));
        getBuilder("slate_cobblestone_pressure_plate").parent(getExistingFile(mcLoc("block/pressure_plate_up"))).texture("texture", modLoc("block/slate_cobblestone"));
        getBuilder("slate_cobblestone_pressure_plate_down").parent(getExistingFile(mcLoc("block/pressure_plate_down"))).texture("texture", modLoc("block/slate_cobblestone"));

        getBuilder("smooth_slate_wall_inventory").parent(getExistingFile(mcLoc("block/wall_inventory"))).texture("wall", modLoc("block/smooth_slate"));
        getBuilder("smooth_slate_pressure_plate").parent(getExistingFile(mcLoc("block/pressure_plate_up"))).texture("texture", modLoc("block/smooth_slate"));
        getBuilder("smooth_slate_pressure_plate_down").parent(getExistingFile(mcLoc("block/pressure_plate_down"))).texture("texture", modLoc("block/smooth_slate"));

        getBuilder("polished_slate_wall_inventory").parent(getExistingFile(mcLoc("block/wall_inventory"))).texture("wall", modLoc("block/polished_slate"));
        getBuilder("polished_slate_pressure_plate").parent(getExistingFile(mcLoc("block/pressure_plate_up"))).texture("texture", modLoc("block/polished_slate"));
        getBuilder("polished_slate_pressure_plate_down").parent(getExistingFile(mcLoc("block/pressure_plate_down"))).texture("texture", modLoc("block/polished_slate"));

        getBuilder("slate_paving_wall_inventory").parent(getExistingFile(mcLoc("block/wall_inventory"))).texture("wall", modLoc("block/slate_paving"));
        getBuilder("slate_paving_pressure_plate").parent(getExistingFile(mcLoc("block/pressure_plate_up"))).texture("texture", modLoc("block/slate_paving"));
        getBuilder("slate_paving_pressure_plate_down").parent(getExistingFile(mcLoc("block/pressure_plate_down"))).texture("texture", modLoc("block/slate_paving"));

        getBuilder("slate_tiles_wall_inventory").parent(getExistingFile(mcLoc("block/wall_inventory"))).texture("wall", modLoc("block/slate_tiles"));
        getBuilder("slate_tiles_pressure_plate").parent(getExistingFile(mcLoc("block/pressure_plate_up"))).texture("texture", modLoc("block/slate_tiles"));
        getBuilder("slate_tiles_pressure_plate_down").parent(getExistingFile(mcLoc("block/pressure_plate_down"))).texture("texture", modLoc("block/slate_tiles"));

        getBuilder("slate_bricks_wall_inventory").parent(getExistingFile(mcLoc("block/wall_inventory"))).texture("wall", modLoc("block/slate_bricks"));
        getBuilder("slate_bricks_pressure_plate").parent(getExistingFile(mcLoc("block/pressure_plate_up"))).texture("texture", modLoc("block/slate_bricks"));
        getBuilder("slate_bricks_pressure_plate_down").parent(getExistingFile(mcLoc("block/pressure_plate_down"))).texture("texture", modLoc("block/slate_bricks"));

        getBuilder("slate_large_bricks_wall_inventory").parent(getExistingFile(mcLoc("block/wall_inventory"))).texture("wall", modLoc("block/slate_large_bricks"));
        getBuilder("slate_large_bricks_pressure_plate").parent(getExistingFile(mcLoc("block/pressure_plate_up"))).texture("texture", modLoc("block/slate_large_bricks"));
        getBuilder("slate_large_bricks_pressure_plate_down").parent(getExistingFile(mcLoc("block/pressure_plate_down"))).texture("texture", modLoc("block/slate_large_bricks"));

        getBuilder("slate_ornement_pressure_plate").parent(getExistingFile(mcLoc("block/pressure_plate_up"))).texture("texture", modLoc("block/slate_ornement"));
        getBuilder("slate_ornement_pressure_plate_down").parent(getExistingFile(mcLoc("block/pressure_plate_down"))).texture("texture", modLoc("block/slate_ornement"));

        // Marble
        getBuilder("marble_wall_inventory").parent(getExistingFile(mcLoc("block/wall_inventory"))).texture("wall", modLoc("block/marble"));
        getBuilder("marble_pressure_plate").parent(getExistingFile(mcLoc("block/pressure_plate_up"))).texture("texture", modLoc("block/marble"));
        getBuilder("marble_pressure_plate_down").parent(getExistingFile(mcLoc("block/pressure_plate_down"))).texture("texture", modLoc("block/marble"));

        getBuilder("marble_cobblestone_wall_inventory").parent(getExistingFile(mcLoc("block/wall_inventory"))).texture("wall", modLoc("block/marble_cobblestone"));
        getBuilder("marble_cobblestone_pressure_plate").parent(getExistingFile(mcLoc("block/pressure_plate_up"))).texture("texture", modLoc("block/marble_cobblestone"));
        getBuilder("marble_cobblestone_pressure_plate_down").parent(getExistingFile(mcLoc("block/pressure_plate_down"))).texture("texture", modLoc("block/marble_cobblestone"));

        getBuilder("smooth_marble_wall_inventory").parent(getExistingFile(mcLoc("block/wall_inventory"))).texture("wall", modLoc("block/smooth_marble"));
        getBuilder("smooth_marble_pressure_plate").parent(getExistingFile(mcLoc("block/pressure_plate_up"))).texture("texture", modLoc("block/smooth_marble"));
        getBuilder("smooth_marble_pressure_plate_down").parent(getExistingFile(mcLoc("block/pressure_plate_down"))).texture("texture", modLoc("block/smooth_marble"));

        getBuilder("polished_marble_wall_inventory").parent(getExistingFile(mcLoc("block/wall_inventory"))).texture("wall", modLoc("block/polished_marble"));
        getBuilder("polished_marble_pressure_plate").parent(getExistingFile(mcLoc("block/pressure_plate_up"))).texture("texture", modLoc("block/polished_marble"));
        getBuilder("polished_marble_pressure_plate_down").parent(getExistingFile(mcLoc("block/pressure_plate_down"))).texture("texture", modLoc("block/polished_marble"));

        getBuilder("marble_paving_wall_inventory").parent(getExistingFile(mcLoc("block/wall_inventory"))).texture("wall", modLoc("block/marble_paving"));
        getBuilder("marble_paving_pressure_plate").parent(getExistingFile(mcLoc("block/pressure_plate_up"))).texture("texture", modLoc("block/marble_paving"));
        getBuilder("marble_paving_pressure_plate_down").parent(getExistingFile(mcLoc("block/pressure_plate_down"))).texture("texture", modLoc("block/marble_paving"));

        getBuilder("marble_tiles_wall_inventory").parent(getExistingFile(mcLoc("block/wall_inventory"))).texture("wall", modLoc("block/marble_tiles"));
        getBuilder("marble_tiles_pressure_plate").parent(getExistingFile(mcLoc("block/pressure_plate_up"))).texture("texture", modLoc("block/marble_tiles"));
        getBuilder("marble_tiles_pressure_plate_down").parent(getExistingFile(mcLoc("block/pressure_plate_down"))).texture("texture", modLoc("block/marble_tiles"));

        getBuilder("marble_bricks_wall_inventory").parent(getExistingFile(mcLoc("block/wall_inventory"))).texture("wall", modLoc("block/marble_bricks"));
        getBuilder("marble_bricks_pressure_plate").parent(getExistingFile(mcLoc("block/pressure_plate_up"))).texture("texture", modLoc("block/marble_bricks"));
        getBuilder("marble_bricks_pressure_plate_down").parent(getExistingFile(mcLoc("block/pressure_plate_down"))).texture("texture", modLoc("block/marble_bricks"));

        getBuilder("marble_large_bricks_wall_inventory").parent(getExistingFile(mcLoc("block/wall_inventory"))).texture("wall", modLoc("block/marble_large_bricks"));
        getBuilder("marble_large_bricks_pressure_plate").parent(getExistingFile(mcLoc("block/pressure_plate_up"))).texture("texture", modLoc("block/marble_large_bricks"));
        getBuilder("marble_large_bricks_pressure_plate_down").parent(getExistingFile(mcLoc("block/pressure_plate_down"))).texture("texture", modLoc("block/marble_large_bricks"));

        getBuilder("marble_ornement_pressure_plate").parent(getExistingFile(mcLoc("block/pressure_plate_up"))).texture("texture", modLoc("block/marble_ornement"));
        getBuilder("marble_ornement_pressure_plate_down").parent(getExistingFile(mcLoc("block/pressure_plate_down"))).texture("texture", modLoc("block/marble_ornement"));

        // Gneiss
        getBuilder("gneiss_wall_inventory").parent(getExistingFile(mcLoc("block/wall_inventory"))).texture("wall", modLoc("block/gneiss"));
        getBuilder("gneiss_pressure_plate").parent(getExistingFile(mcLoc("block/pressure_plate_up"))).texture("texture", modLoc("block/gneiss"));
        getBuilder("gneiss_pressure_plate_down").parent(getExistingFile(mcLoc("block/pressure_plate_down"))).texture("texture", modLoc("block/gneiss"));

        getBuilder("gneiss_cobblestone_wall_inventory").parent(getExistingFile(mcLoc("block/wall_inventory"))).texture("wall", modLoc("block/gneiss_cobblestone"));
        getBuilder("gneiss_cobblestone_pressure_plate").parent(getExistingFile(mcLoc("block/pressure_plate_up"))).texture("texture", modLoc("block/gneiss_cobblestone"));
        getBuilder("gneiss_cobblestone_pressure_plate_down").parent(getExistingFile(mcLoc("block/pressure_plate_down"))).texture("texture", modLoc("block/gneiss_cobblestone"));

        getBuilder("smooth_gneiss_wall_inventory").parent(getExistingFile(mcLoc("block/wall_inventory"))).texture("wall", modLoc("block/smooth_gneiss"));
        getBuilder("smooth_gneiss_pressure_plate").parent(getExistingFile(mcLoc("block/pressure_plate_up"))).texture("texture", modLoc("block/smooth_gneiss"));
        getBuilder("smooth_gneiss_pressure_plate_down").parent(getExistingFile(mcLoc("block/pressure_plate_down"))).texture("texture", modLoc("block/smooth_gneiss"));

        getBuilder("polished_gneiss_wall_inventory").parent(getExistingFile(mcLoc("block/wall_inventory"))).texture("wall", modLoc("block/polished_gneiss"));
        getBuilder("polished_gneiss_pressure_plate").parent(getExistingFile(mcLoc("block/pressure_plate_up"))).texture("texture", modLoc("block/polished_gneiss"));
        getBuilder("polished_gneiss_pressure_plate_down").parent(getExistingFile(mcLoc("block/pressure_plate_down"))).texture("texture", modLoc("block/polished_gneiss"));

        getBuilder("gneiss_paving_wall_inventory").parent(getExistingFile(mcLoc("block/wall_inventory"))).texture("wall", modLoc("block/gneiss_paving"));
        getBuilder("gneiss_paving_pressure_plate").parent(getExistingFile(mcLoc("block/pressure_plate_up"))).texture("texture", modLoc("block/gneiss_paving"));
        getBuilder("gneiss_paving_pressure_plate_down").parent(getExistingFile(mcLoc("block/pressure_plate_down"))).texture("texture", modLoc("block/gneiss_paving"));

        getBuilder("gneiss_tiles_wall_inventory").parent(getExistingFile(mcLoc("block/wall_inventory"))).texture("wall", modLoc("block/gneiss_tiles"));
        getBuilder("gneiss_tiles_pressure_plate").parent(getExistingFile(mcLoc("block/pressure_plate_up"))).texture("texture", modLoc("block/gneiss_tiles"));
        getBuilder("gneiss_tiles_pressure_plate_down").parent(getExistingFile(mcLoc("block/pressure_plate_down"))).texture("texture", modLoc("block/gneiss_tiles"));

        getBuilder("gneiss_bricks_wall_inventory").parent(getExistingFile(mcLoc("block/wall_inventory"))).texture("wall", modLoc("block/gneiss_bricks"));
        getBuilder("gneiss_bricks_pressure_plate").parent(getExistingFile(mcLoc("block/pressure_plate_up"))).texture("texture", modLoc("block/gneiss_bricks"));
        getBuilder("gneiss_bricks_pressure_plate_down").parent(getExistingFile(mcLoc("block/pressure_plate_down"))).texture("texture", modLoc("block/gneiss_bricks"));

        getBuilder("gneiss_large_bricks_wall_inventory").parent(getExistingFile(mcLoc("block/wall_inventory"))).texture("wall", modLoc("block/gneiss_large_bricks"));
        getBuilder("gneiss_large_bricks_pressure_plate").parent(getExistingFile(mcLoc("block/pressure_plate_up"))).texture("texture", modLoc("block/gneiss_large_bricks"));
        getBuilder("gneiss_large_bricks_pressure_plate_down").parent(getExistingFile(mcLoc("block/pressure_plate_down"))).texture("texture", modLoc("block/gneiss_large_bricks"));

        getBuilder("gneiss_ornement_pressure_plate").parent(getExistingFile(mcLoc("block/pressure_plate_up"))).texture("texture", modLoc("block/gneiss_ornement"));
        getBuilder("gneiss_ornement_pressure_plate_down").parent(getExistingFile(mcLoc("block/pressure_plate_down"))).texture("texture", modLoc("block/gneiss_ornement"));

        // Jade
        getBuilder("jade_wall_inventory").parent(getExistingFile(mcLoc("block/wall_inventory"))).texture("wall", modLoc("block/jade"));
        getBuilder("jade_pressure_plate").parent(getExistingFile(mcLoc("block/pressure_plate_up"))).texture("texture", modLoc("block/jade"));
        getBuilder("jade_pressure_plate_down").parent(getExistingFile(mcLoc("block/pressure_plate_down"))).texture("texture", modLoc("block/jade"));

        getBuilder("jade_cobblestone_wall_inventory").parent(getExistingFile(mcLoc("block/wall_inventory"))).texture("wall", modLoc("block/jade_cobblestone"));
        getBuilder("jade_cobblestone_pressure_plate").parent(getExistingFile(mcLoc("block/pressure_plate_up"))).texture("texture", modLoc("block/jade_cobblestone"));
        getBuilder("jade_cobblestone_pressure_plate_down").parent(getExistingFile(mcLoc("block/pressure_plate_down"))).texture("texture", modLoc("block/jade_cobblestone"));

        getBuilder("smooth_jade_wall_inventory").parent(getExistingFile(mcLoc("block/wall_inventory"))).texture("wall", modLoc("block/smooth_jade"));
        getBuilder("smooth_jade_pressure_plate").parent(getExistingFile(mcLoc("block/pressure_plate_up"))).texture("texture", modLoc("block/smooth_jade"));
        getBuilder("smooth_jade_pressure_plate_down").parent(getExistingFile(mcLoc("block/pressure_plate_down"))).texture("texture", modLoc("block/smooth_jade"));

        getBuilder("polished_jade_wall_inventory").parent(getExistingFile(mcLoc("block/wall_inventory"))).texture("wall", modLoc("block/polished_jade"));
        getBuilder("polished_jade_pressure_plate").parent(getExistingFile(mcLoc("block/pressure_plate_up"))).texture("texture", modLoc("block/polished_jade"));
        getBuilder("polished_jade_pressure_plate_down").parent(getExistingFile(mcLoc("block/pressure_plate_down"))).texture("texture", modLoc("block/polished_jade"));

        getBuilder("jade_paving_wall_inventory").parent(getExistingFile(mcLoc("block/wall_inventory"))).texture("wall", modLoc("block/jade_paving"));
        getBuilder("jade_paving_pressure_plate").parent(getExistingFile(mcLoc("block/pressure_plate_up"))).texture("texture", modLoc("block/jade_paving"));
        getBuilder("jade_paving_pressure_plate_down").parent(getExistingFile(mcLoc("block/pressure_plate_down"))).texture("texture", modLoc("block/jade_paving"));

        getBuilder("jade_tiles_wall_inventory").parent(getExistingFile(mcLoc("block/wall_inventory"))).texture("wall", modLoc("block/jade_tiles"));
        getBuilder("jade_tiles_pressure_plate").parent(getExistingFile(mcLoc("block/pressure_plate_up"))).texture("texture", modLoc("block/jade_tiles"));
        getBuilder("jade_tiles_pressure_plate_down").parent(getExistingFile(mcLoc("block/pressure_plate_down"))).texture("texture", modLoc("block/jade_tiles"));

        getBuilder("jade_bricks_wall_inventory").parent(getExistingFile(mcLoc("block/wall_inventory"))).texture("wall", modLoc("block/jade_bricks"));
        getBuilder("jade_bricks_pressure_plate").parent(getExistingFile(mcLoc("block/pressure_plate_up"))).texture("texture", modLoc("block/jade_bricks"));
        getBuilder("jade_bricks_pressure_plate_down").parent(getExistingFile(mcLoc("block/pressure_plate_down"))).texture("texture", modLoc("block/jade_bricks"));

        getBuilder("jade_large_bricks_wall_inventory").parent(getExistingFile(mcLoc("block/wall_inventory"))).texture("wall", modLoc("block/jade_large_bricks"));
        getBuilder("jade_large_bricks_pressure_plate").parent(getExistingFile(mcLoc("block/pressure_plate_up"))).texture("texture", modLoc("block/jade_large_bricks"));
        getBuilder("jade_large_bricks_pressure_plate_down").parent(getExistingFile(mcLoc("block/pressure_plate_down"))).texture("texture", modLoc("block/jade_large_bricks"));

        getBuilder("jade_ornement_pressure_plate").parent(getExistingFile(mcLoc("block/pressure_plate_up"))).texture("texture", modLoc("block/jade_ornement"));
        getBuilder("jade_ornement_pressure_plate_down").parent(getExistingFile(mcLoc("block/pressure_plate_down"))).texture("texture", modLoc("block/jade_ornement"));

        // Larvikite
        getBuilder("larvikite_wall_inventory").parent(getExistingFile(mcLoc("block/wall_inventory"))).texture("wall", modLoc("block/larvikite"));
        getBuilder("larvikite_pressure_plate").parent(getExistingFile(mcLoc("block/pressure_plate_up"))).texture("texture", modLoc("block/larvikite"));
        getBuilder("larvikite_pressure_plate_down").parent(getExistingFile(mcLoc("block/pressure_plate_down"))).texture("texture", modLoc("block/larvikite"));

        getBuilder("larvikite_cobblestone_wall_inventory").parent(getExistingFile(mcLoc("block/wall_inventory"))).texture("wall", modLoc("block/larvikite_cobblestone"));
        getBuilder("larvikite_cobblestone_pressure_plate").parent(getExistingFile(mcLoc("block/pressure_plate_up"))).texture("texture", modLoc("block/larvikite_cobblestone"));
        getBuilder("larvikite_cobblestone_pressure_plate_down").parent(getExistingFile(mcLoc("block/pressure_plate_down"))).texture("texture", modLoc("block/larvikite_cobblestone"));

        getBuilder("smooth_larvikite_wall_inventory").parent(getExistingFile(mcLoc("block/wall_inventory"))).texture("wall", modLoc("block/smooth_larvikite"));
        getBuilder("smooth_larvikite_pressure_plate").parent(getExistingFile(mcLoc("block/pressure_plate_up"))).texture("texture", modLoc("block/smooth_larvikite"));
        getBuilder("smooth_larvikite_pressure_plate_down").parent(getExistingFile(mcLoc("block/pressure_plate_down"))).texture("texture", modLoc("block/smooth_larvikite"));

        getBuilder("polished_larvikite_wall_inventory").parent(getExistingFile(mcLoc("block/wall_inventory"))).texture("wall", modLoc("block/polished_larvikite"));
        getBuilder("polished_larvikite_pressure_plate").parent(getExistingFile(mcLoc("block/pressure_plate_up"))).texture("texture", modLoc("block/polished_larvikite"));
        getBuilder("polished_larvikite_pressure_plate_down").parent(getExistingFile(mcLoc("block/pressure_plate_down"))).texture("texture", modLoc("block/polished_larvikite"));

        getBuilder("larvikite_paving_wall_inventory").parent(getExistingFile(mcLoc("block/wall_inventory"))).texture("wall", modLoc("block/larvikite_paving"));
        getBuilder("larvikite_paving_pressure_plate").parent(getExistingFile(mcLoc("block/pressure_plate_up"))).texture("texture", modLoc("block/larvikite_paving"));
        getBuilder("larvikite_paving_pressure_plate_down").parent(getExistingFile(mcLoc("block/pressure_plate_down"))).texture("texture", modLoc("block/larvikite_paving"));

        getBuilder("larvikite_tiles_wall_inventory").parent(getExistingFile(mcLoc("block/wall_inventory"))).texture("wall", modLoc("block/larvikite_tiles"));
        getBuilder("larvikite_tiles_pressure_plate").parent(getExistingFile(mcLoc("block/pressure_plate_up"))).texture("texture", modLoc("block/larvikite_tiles"));
        getBuilder("larvikite_tiles_pressure_plate_down").parent(getExistingFile(mcLoc("block/pressure_plate_down"))).texture("texture", modLoc("block/larvikite_tiles"));

        getBuilder("larvikite_bricks_wall_inventory").parent(getExistingFile(mcLoc("block/wall_inventory"))).texture("wall", modLoc("block/larvikite_bricks"));
        getBuilder("larvikite_bricks_pressure_plate").parent(getExistingFile(mcLoc("block/pressure_plate_up"))).texture("texture", modLoc("block/larvikite_bricks"));
        getBuilder("larvikite_bricks_pressure_plate_down").parent(getExistingFile(mcLoc("block/pressure_plate_down"))).texture("texture", modLoc("block/larvikite_bricks"));

        getBuilder("larvikite_large_bricks_wall_inventory").parent(getExistingFile(mcLoc("block/wall_inventory"))).texture("wall", modLoc("block/larvikite_large_bricks"));
        getBuilder("larvikite_large_bricks_pressure_plate").parent(getExistingFile(mcLoc("block/pressure_plate_up"))).texture("texture", modLoc("block/larvikite_large_bricks"));
        getBuilder("larvikite_large_bricks_pressure_plate_down").parent(getExistingFile(mcLoc("block/pressure_plate_down"))).texture("texture", modLoc("block/larvikite_large_bricks"));

        getBuilder("larvikite_ornement_pressure_plate").parent(getExistingFile(mcLoc("block/pressure_plate_up"))).texture("texture", modLoc("block/larvikite_ornement"));
        getBuilder("larvikite_ornement_pressure_plate_down").parent(getExistingFile(mcLoc("block/pressure_plate_down"))).texture("texture", modLoc("block/larvikite_ornement"));

        // Andesite
        getBuilder("smooth_andesite_wall_inventory").parent(getExistingFile(mcLoc("block/wall_inventory"))).texture("wall", modLoc("block/smooth_andesite"));
        getBuilder("smooth_andesite_pressure_plate").parent(getExistingFile(mcLoc("block/pressure_plate_up"))).texture("texture", modLoc("block/smooth_andesite"));
        getBuilder("smooth_andesite_pressure_plate_down").parent(getExistingFile(mcLoc("block/pressure_plate_down"))).texture("texture", modLoc("block/smooth_andesite"));

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

        getBuilder("andesite_ornement_pressure_plate").parent(getExistingFile(mcLoc("block/pressure_plate_up"))).texture("texture", modLoc("block/andesite_ornement"));
        getBuilder("andesite_ornement_pressure_plate_down").parent(getExistingFile(mcLoc("block/pressure_plate_down"))).texture("texture", modLoc("block/andesite_ornement"));

        // Diorite
        getBuilder("smooth_diorite_wall_inventory").parent(getExistingFile(mcLoc("block/wall_inventory"))).texture("wall", modLoc("block/smooth_diorite"));
        getBuilder("smooth_diorite_pressure_plate").parent(getExistingFile(mcLoc("block/pressure_plate_up"))).texture("texture", modLoc("block/smooth_diorite"));
        getBuilder("smooth_diorite_pressure_plate_down").parent(getExistingFile(mcLoc("block/pressure_plate_down"))).texture("texture", modLoc("block/smooth_diorite"));

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

        getBuilder("diorite_ornement_pressure_plate").parent(getExistingFile(mcLoc("block/pressure_plate_up"))).texture("texture", modLoc("block/diorite_ornement"));
        getBuilder("diorite_ornement_pressure_plate_down").parent(getExistingFile(mcLoc("block/pressure_plate_down"))).texture("texture", modLoc("block/diorite_ornement"));

        // Granite
        getBuilder("smooth_granite_wall_inventory").parent(getExistingFile(mcLoc("block/wall_inventory"))).texture("wall", modLoc("block/smooth_granite"));
        getBuilder("smooth_granite_pressure_plate").parent(getExistingFile(mcLoc("block/pressure_plate_up"))).texture("texture", modLoc("block/smooth_granite"));
        getBuilder("smooth_granite_pressure_plate_down").parent(getExistingFile(mcLoc("block/pressure_plate_down"))).texture("texture", modLoc("block/smooth_granite"));

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

        getBuilder("granite_ornement_pressure_plate").parent(getExistingFile(mcLoc("block/pressure_plate_up"))).texture("texture", modLoc("block/granite_ornement"));
        getBuilder("granite_ornement_pressure_plate_down").parent(getExistingFile(mcLoc("block/pressure_plate_down"))).texture("texture", modLoc("block/granite_ornement"));

    }
}
