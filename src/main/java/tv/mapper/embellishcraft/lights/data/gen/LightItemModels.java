package tv.mapper.embellishcraft.lights.data.gen;

import java.util.Arrays;

import net.minecraft.data.DataGenerator;
import net.minecraft.world.item.DyeColor;
import net.minecraftforge.client.model.generators.ModelFile.UncheckedModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import tv.mapper.embellishcraft.core.data.gen.ECItemModels;

public class LightItemModels extends ECItemModels
{
    public LightItemModels(DataGenerator generator, String modid, ExistingFileHelper existingFileHelper)
    {
        super(generator, modid, existingFileHelper);
    }

    @Override
    protected void registerModels()
    {
        for(int j = 0; j < Arrays.stream(DyeColor.values()).count(); j++)
        {
            String color = DyeColor.byId(j).getSerializedName();
            getBuilder(color + "_table_lamp").parent(new UncheckedModelFile(modid + ":block/" + color + "_table_lamp"));
            getBuilder(color + "_manual_table_lamp").parent(new UncheckedModelFile(modid + ":block/" + color + "_manual_table_lamp"));
        }
    }
}