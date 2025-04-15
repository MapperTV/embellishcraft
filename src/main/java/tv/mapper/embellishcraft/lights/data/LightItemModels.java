package tv.mapper.embellishcraft.lights.data;

import java.util.Arrays;

import net.minecraft.data.PackOutput;
import net.minecraft.world.item.DyeColor;
import net.neoforged.neoforge.client.model.generators.ModelFile.UncheckedModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import tv.mapper.embellishcraft.core.data.ECItemModels;

public class LightItemModels extends ECItemModels
{

    public LightItemModels(PackOutput output, String modid, ExistingFileHelper existingFileHelper, String name)
    {
        super(output, modid, existingFileHelper, name);
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
