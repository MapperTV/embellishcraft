package tv.mapper.embellishcraft.data.gen;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ExistingFileHelper;
import net.minecraftforge.client.model.generators.ModelFile.UncheckedModelFile;
import tv.mapper.mapperbase.data.gen.BaseItemModels;

public class ECItemModels extends BaseItemModels
{

    public ECItemModels(DataGenerator generator, String modid, ExistingFileHelper existingFileHelper)
    {
        super(generator, modid, existingFileHelper);
    }

    @Override
    public String getName()
    {
        return "EmbellishCraft Item Models";
    }

    @Override
    protected void registerModels()
    {
        // Basalt
        registerBlockBasics("basalt", true, true, true, true, true, false);
        getBuilder("basalt_button").parent(new UncheckedModelFile(modid + ":block/basalt_button_inventory"));
        registerBlockBasics("basalt_cobblestone", true, true, true, true, true, false);
        registerBlockBasics("smooth_basalt", true, true, true, true, true, false);
        registerBlockBasics("polished_basalt", true, true, true, true, true, false);
        registerBlockBasics("basalt_paving", true, true, true, true, true, false);
        registerBlockBasics("basalt_tiles", true, true, true, true, true, false);
        registerBlockBasics("basalt_bricks", true, true, true, true, true, false);
        registerBlockBasics("basalt_large_bricks", true, true, true, true, true, false);
        registerBlockBasics("basalt_ornament", true, false, false, false, true, false);

        // Slate
        registerBlockBasics("slate", true, true, true, true, true, false);
        getBuilder("slate_button").parent(new UncheckedModelFile(modid + ":block/slate_button_inventory"));
        registerBlockBasics("slate_cobblestone", true, true, true, true, true, false);
        registerBlockBasics("smooth_slate", true, true, true, true, true, false);
        registerBlockBasics("polished_slate", true, true, true, true, true, false);
        registerBlockBasics("slate_paving", true, true, true, true, true, false);
        registerBlockBasics("slate_tiles", true, true, true, true, true, false);
        registerBlockBasics("slate_bricks", true, true, true, true, true, false);
        registerBlockBasics("slate_large_bricks", true, true, true, true, true, false);
        registerBlockBasics("slate_ornament", true, false, false, false, true, false);

        // Marble
        registerBlockBasics("marble", true, true, true, true, true, false);
        getBuilder("marble_button").parent(new UncheckedModelFile(modid + ":block/marble_button_inventory"));
        registerBlockBasics("marble_cobblestone", true, true, true, true, true, false);
        registerBlockBasics("smooth_marble", true, true, true, true, true, false);
        registerBlockBasics("polished_marble", true, true, true, true, true, false);
        registerBlockBasics("marble_paving", true, true, true, true, true, false);
        registerBlockBasics("marble_tiles", true, true, true, true, true, false);
        registerBlockBasics("marble_bricks", true, true, true, true, true, false);
        registerBlockBasics("marble_large_bricks", true, true, true, true, true, false);
        registerBlockBasics("marble_ornament", true, false, false, false, true, false);

        // Gneiss
        registerBlockBasics("gneiss", true, true, true, true, true, false);
        getBuilder("gneiss_button").parent(new UncheckedModelFile(modid + ":block/gneiss_button_inventory"));
        registerBlockBasics("gneiss_cobblestone", true, true, true, true, true, false);
        registerBlockBasics("smooth_gneiss", true, true, true, true, true, false);
        registerBlockBasics("polished_gneiss", true, true, true, true, true, false);
        registerBlockBasics("gneiss_paving", true, true, true, true, true, false);
        registerBlockBasics("gneiss_tiles", true, true, true, true, true, false);
        registerBlockBasics("gneiss_bricks", true, true, true, true, true, false);
        registerBlockBasics("gneiss_large_bricks", true, true, true, true, true, false);
        registerBlockBasics("gneiss_ornament", true, false, false, false, true, false);

        // Jade
        registerBlockBasics("jade", true, true, true, true, true, false);
        getBuilder("jade_button").parent(new UncheckedModelFile(modid + ":block/jade_button_inventory"));
        registerBlockBasics("jade_cobblestone", true, true, true, true, true, false);
        registerBlockBasics("smooth_jade", true, true, true, true, true, false);
        registerBlockBasics("polished_jade", true, true, true, true, true, false);
        registerBlockBasics("jade_paving", true, true, true, true, true, false);
        registerBlockBasics("jade_tiles", true, true, true, true, true, false);
        registerBlockBasics("jade_bricks", true, true, true, true, true, false);
        registerBlockBasics("jade_large_bricks", true, true, true, true, true, false);
        registerBlockBasics("jade_ornament", true, false, false, false, true, false);

        // Larvikite
        registerBlockBasics("larvikite", true, true, true, true, true, false);
        getBuilder("larvikite_button").parent(new UncheckedModelFile(modid + ":block/larvikite_button_inventory"));
        registerBlockBasics("larvikite_cobblestone", true, true, true, true, true, false);
        registerBlockBasics("smooth_larvikite", true, true, true, true, true, false);
        registerBlockBasics("polished_larvikite", true, true, true, true, true, false);
        registerBlockBasics("larvikite_paving", true, true, true, true, true, false);
        registerBlockBasics("larvikite_tiles", true, true, true, true, true, false);
        registerBlockBasics("larvikite_bricks", true, true, true, true, true, false);
        registerBlockBasics("larvikite_large_bricks", true, true, true, true, true, false);
        registerBlockBasics("larvikite_ornament", true, false, false, false, true, false);

        // Andesite
        registerBlockBasics("smooth_andesite", true, true, true, true, true, false);
        getBuilder("andesite_button").parent(new UncheckedModelFile(modid + ":block/andesite_button_inventory"));
        registerBlockBasics("andesite_paving", true, true, true, true, true, false);
        registerBlockBasics("andesite_tiles", true, true, true, true, true, false);
        registerBlockBasics("andesite_bricks", true, true, true, true, true, false);
        registerBlockBasics("andesite_large_bricks", true, true, true, true, true, false);
        registerBlockBasics("andesite_ornament", true, false, false, false, true, false);

        // Diorite
        registerBlockBasics("smooth_diorite", true, true, true, true, true, false);
        getBuilder("diorite_button").parent(new UncheckedModelFile(modid + ":block/diorite_button_inventory"));
        registerBlockBasics("diorite_paving", true, true, true, true, true, false);
        registerBlockBasics("diorite_tiles", true, true, true, true, true, false);
        registerBlockBasics("diorite_bricks", true, true, true, true, true, false);
        registerBlockBasics("diorite_large_bricks", true, true, true, true, true, false);
        registerBlockBasics("diorite_ornament", true, false, false, false, true, false);

        // Granite
        registerBlockBasics("smooth_granite", true, true, true, true, true, false);
        getBuilder("granite_button").parent(new UncheckedModelFile(modid + ":block/granite_button_inventory"));
        registerBlockBasics("granite_paving", true, true, true, true, true, false);
        registerBlockBasics("granite_tiles", true, true, true, true, true, false);
        registerBlockBasics("granite_bricks", true, true, true, true, true, false);
        registerBlockBasics("granite_large_bricks", true, true, true, true, true, false);
        registerBlockBasics("granite_ornament", true, false, false, false, true, false);

        // Sandstone
        getBuilder("sandstone_button").parent(new UncheckedModelFile(modid + ":block/sandstone_button_inventory"));
        registerBlockBasics("smooth_sandstone", false, false, false, true, true, false);
        registerBlockBasics("polished_sandstone", true, true, true, true, true, false);
        registerBlockBasics("sandstone_paving", true, true, true, true, true, false);
        registerBlockBasics("sandstone_tiles", true, true, true, true, true, false);
        registerBlockBasics("sandstone_bricks", true, true, true, true, true, false);
        registerBlockBasics("sandstone_large_bricks", true, true, true, true, true, false);
    }
}
