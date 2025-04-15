package tv.mapper.embellishcraft.lights.data;

import java.util.Arrays;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.DyeColor;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import tv.mapper.embellishcraft.core.ECConstants;
import tv.mapper.embellishcraft.core.data.ECBlockModels;

public class LightBlockModels extends ECBlockModels
{

    public LightBlockModels(PackOutput generator, String modid, ExistingFileHelper existingFileHelper, String name)
    {
        super(generator, modid, existingFileHelper, name);
    }

    @Override
    protected void registerModels()
    {
        for(int j = 0; j < Arrays.stream(DyeColor.values()).count(); j++)
        {
            buildTableLamp(DyeColor.byId(j).getSerializedName());
        }
    }

    protected void buildTableLamp(String color)
    {
        getBuilder(color + "_table_lamp").parent(getExistingFile(modLoc("block/table_lamp"))).texture("texture", ResourceLocation.fromNamespaceAndPath(ECConstants.MODID, "block/" + color + "_table_lamp")).texture("particle", ResourceLocation.fromNamespaceAndPath(ECConstants.MODID, "block/" + color + "_table_lamp"));
        getBuilder(color + "_table_lamp_on").parent(getExistingFile(modLoc("block/table_lamp"))).texture("texture", ResourceLocation.fromNamespaceAndPath(ECConstants.MODID, "block/" + color + "_table_lamp_on")).texture("particle", ResourceLocation.fromNamespaceAndPath(ECConstants.MODID, "block/" + color + "_table_lamp_on"));
        getBuilder(color + "_manual_table_lamp").parent(getExistingFile(modLoc("block/table_lamp"))).texture("texture", ResourceLocation.fromNamespaceAndPath(ECConstants.MODID, "block/" + color + "_table_lamp")).texture("particle", ResourceLocation.fromNamespaceAndPath(ECConstants.MODID, "block/" + color + "_table_lamp"));
        getBuilder(color + "_manual_table_lamp_on").parent(getExistingFile(modLoc("block/table_lamp"))).texture("texture", ResourceLocation.fromNamespaceAndPath(ECConstants.MODID, "block/" + color + "_table_lamp_on")).texture("particle", ResourceLocation.fromNamespaceAndPath(ECConstants.MODID, "block/" + color + "_table_lamp_on"));
    }
}
