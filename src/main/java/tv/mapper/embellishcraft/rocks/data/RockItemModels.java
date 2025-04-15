package tv.mapper.embellishcraft.rocks.data;

import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ModelFile.UncheckedModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import tv.mapper.embellishcraft.core.data.ECItemModels;

public class RockItemModels extends ECItemModels
{

    public RockItemModels(PackOutput output, String modid, ExistingFileHelper existingFileHelper, String name)
    {
        super(output, modid, existingFileHelper, name);
    }

    @Override
    protected void registerModels()
    {
        registerStone("basalt");
        registerStone("slate");
        registerStone("marble");
        registerStone("gneiss");
        registerStone("jade");
        registerStone("larvikite");

        registerBlockBasics("paving_stones", true, true, true, true, true, false, false, false);

        registerMcStone("andesite");
        registerMcStone("diorite");
        registerMcStone("granite");

        registerSandstone("sandstone");
        registerSandstone("red_sandstone");

        // Terracotta
        registerBlockBasics("terracotta", false, true, true, true, true, false, false, true);
        // getBuilder("terracotta_button").parent(new UncheckedModelFile(modid + ":block/terracotta_button_inventory"));
        registerBlockBasics("polished_terracotta", true, true, true, true, true, false, false, false);
        registerBlockBasics("terracotta_paving", true, true, true, true, true, false, false, false);
        registerBlockBasics("terracotta_tiles", true, true, true, true, true, false, false, false);
        registerBlockBasics("terracotta_bricks", true, true, true, true, true, false, false, false);
        registerBlockBasics("terracotta_large_bricks", true, true, true, true, true, false, false, false);
        registerBlockBasics("terracotta_paving_stones", true, true, true, true, true, false, false, false);
        registerBlockBasics("terracotta_rooftiles", true, true, true, false, false, false, false, false);
    }

    protected void registerStone(String name)
    {
        registerBlockBasics(name, true, true, true, true, true, false, false, true);
        // getBuilder(name + "_button").parent(new UncheckedModelFile(modid + ":block/" + name + "_button_inventory"));
        registerBlockBasics(name + "_cobblestone", true, true, true, true, true, false, false, false);
        registerBlockBasics(name + "_cobblestone_bricks", true, true, true, true, true, false, false, false);
        registerBlockBasics("smooth_" + name, true, true, true, true, true, false, false, false);
        registerBlockBasics("polished_" + name, true, true, true, true, true, false, false, false);
        registerBlockBasics(name + "_paving", true, true, true, true, true, false, false, false);
        registerBlockBasics(name + "_tiles", true, true, true, true, true, false, false, false);
        registerBlockBasics(name + "_bricks", true, true, true, true, true, false, false, false);
        registerBlockBasics(name + "_large_bricks", true, true, true, true, true, false, false, false);
        registerBlockBasics(name + "_paving_stones", true, true, true, true, true, false, false, false);
        registerBlockBasics(name + "_ornament", true, false, false, false, true, false, false, false);
        registerBlockBasics(name + "_rooftiles", true, true, true, false, false, false, false, false);
    }

    protected void registerMcStone(String name)
    {
        registerBlockBasics("smooth_" + name, true, true, true, true, true, false, false, false);
        getBuilder(name + "_button").parent(new UncheckedModelFile(modid + ":block/" + name + "_button_inventory"));
        registerBlockBasics(name + "_paving", true, true, true, true, true, false, false, false);
        registerBlockBasics(name + "_tiles", true, true, true, true, true, false, false, false);
        registerBlockBasics(name + "_bricks", true, true, true, true, true, false, false, false);
        registerBlockBasics(name + "_large_bricks", true, true, true, true, true, false, false, false);
        registerBlockBasics(name + "_paving_stones", true, true, true, true, true, false, false, false);
        registerBlockBasics(name + "_ornament", true, false, false, false, true, false, false, false);
        registerBlockBasics(name + "_rooftiles", true, true, true, false, false, false, false, false);
    }

    protected void registerSandstone(String name)
    {
        getBuilder(name + "_button").parent(new UncheckedModelFile(modid + ":block/" + name + "_button_inventory"));
        registerBlockBasics("smooth_" + name, false, false, false, true, true, false, false, false);
        registerBlockBasics("polished_" + name, true, true, true, true, true, false, false, false);
        registerBlockBasics(name + "_paving", true, true, true, true, true, false, false, false);
        registerBlockBasics(name + "_tiles", true, true, true, true, true, false, false, false);
        registerBlockBasics(name + "_bricks", true, true, true, true, true, false, false, false);
        registerBlockBasics(name + "_large_bricks", true, true, true, true, true, false, false, false);
        registerBlockBasics(name + "_paving_stones", true, true, true, true, true, false, false, false);
        registerBlockBasics(name + "_rooftiles", true, true, true, false, false, false, false, false);
    }
}