package tv.mapper.embellishcraft.furniture.data.gen;

import java.util.Arrays;

import net.minecraft.data.DataGenerator;
import net.minecraft.world.item.DyeColor;
import net.minecraftforge.client.model.generators.ModelFile.UncheckedModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import tv.mapper.embellishcraft.data.gen.ECItemModels;
import tv.mapper.embellishcraft.util.McWoods;

public class FurnitureItemModels extends ECItemModels
{
    public FurnitureItemModels(DataGenerator generator, String modid, ExistingFileHelper existingFileHelper)
    {
        super(generator, modid, existingFileHelper);
    }

    @Override
    protected void registerModels()
    {
        // Furniture
        for(int j = 0; j < Arrays.stream(McWoods.values()).count(); j++)
        {
            getBuilder(McWoods.byId(j).getSerializedName() + "_terrace_table").parent(new UncheckedModelFile(modid + ":block/" + McWoods.byId(j).getSerializedName() + "_terrace_table"));
            getBuilder(McWoods.byId(j).getSerializedName() + "_terrace_chair").parent(new UncheckedModelFile(modid + ":block/" + McWoods.byId(j).getSerializedName() + "_terrace_chair"));
            getBuilder(McWoods.byId(j).getSerializedName() + "_chair").parent(new UncheckedModelFile(modid + ":block/" + McWoods.byId(j).getSerializedName() + "_chair"));
            getBuilder(McWoods.byId(j).getSerializedName() + "_table").parent(new UncheckedModelFile(modid + ":block/" + McWoods.byId(j).getSerializedName() + "_table_inventory"));
            getBuilder(McWoods.byId(j).getSerializedName() + "_fancy_table").parent(new UncheckedModelFile(modid + ":block/" + McWoods.byId(j).getSerializedName() + "_fancy_table_inventory"));
        }

        getBuilder("steel_terrace_table").parent(new UncheckedModelFile(modid + ":block/steel_terrace_table"));
        getBuilder("steel_terrace_chair").parent(new UncheckedModelFile(modid + ":block/steel_terrace_chair"));

        for(int j = 0; j < Arrays.stream(DyeColor.values()).count(); j++)
        {
            String color = DyeColor.byId(j).getSerializedName();
            getBuilder(color + "_couch").parent(new UncheckedModelFile(modid + ":block/" + color + "_couch"));
            getBuilder(color + "_pillow").parent(new UncheckedModelFile(modid + ":block/" + color + "_pillow"));
        }

        getBuilder("plate").parent(new UncheckedModelFile("item/generated")).texture("layer0", modLoc("item/plate"));

        // Crates, chests, beds
        for(int j = 0; j < Arrays.stream(McWoods.values()).count(); j++)
        {
            getBuilder(McWoods.byId(j).getSerializedName() + "_wooden_crate").parent(new UncheckedModelFile(modid + ":block/" + McWoods.byId(j).getSerializedName() + "_wooden_crate"));
            getBuilder(McWoods.byId(j).getSerializedName() + "_fancy_chest").parent(new UncheckedModelFile(modid + ":block/" + McWoods.byId(j).getSerializedName() + "_fancy_chest"));

            for(int i = 0; i < Arrays.stream(DyeColor.values()).count(); i++)
            {
                getBuilder(DyeColor.byId(i).getSerializedName() + "_" + McWoods.byId(j).getSerializedName() + "_fancy_bed").parent(new UncheckedModelFile(modid + ":block/" + DyeColor.byId(i).getSerializedName() + "_" + McWoods.byId(j).getSerializedName() + "_fancy_bed_inventory"));
            }
        }
        getBuilder("locker").parent(new UncheckedModelFile(modid + ":block/locker_small"));
    }
}