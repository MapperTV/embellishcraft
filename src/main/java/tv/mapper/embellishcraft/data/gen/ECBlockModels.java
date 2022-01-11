package tv.mapper.embellishcraft.data.gen;

import java.util.Arrays;

import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.DyeColor;
import net.minecraftforge.common.data.ExistingFileHelper;
import tv.mapper.embellishcraft.ECConstants;
import tv.mapper.embellishcraft.util.McWoods;
import tv.mapper.mapperbase.data.gen.BaseBlockModels;

public class ECBlockModels extends BaseBlockModels
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
        // furniture
        for(int j = 0; j < Arrays.stream(McWoods.values()).count(); j++)
        {
            getBuilder(McWoods.byId(j).getSerializedName() + "_chair").parent(getExistingFile(modLoc("block/chair"))).texture("material", new ResourceLocation("block/" + McWoods.byId(j).getSerializedName() + "_planks")).texture("particle", new ResourceLocation("block/" + McWoods.byId(j).getSerializedName() + "_planks"));
            getBuilder(McWoods.byId(j).getSerializedName() + "_terrace_chair").parent(getExistingFile(modLoc("block/terrace_chair"))).texture("material", new ResourceLocation(ECConstants.MODID, "block/" + McWoods.byId(j).getSerializedName() + "_terrace_table")).texture("particle", new ResourceLocation(ECConstants.MODID, "block/" + McWoods.byId(j).getSerializedName() + "_terrace_table"));
            getBuilder(McWoods.byId(j).getSerializedName() + "_terrace_table").parent(getExistingFile(modLoc("block/terrace_table"))).texture("material", new ResourceLocation(ECConstants.MODID, "block/" + McWoods.byId(j).getSerializedName() + "_terrace_table")).texture("particle", new ResourceLocation(ECConstants.MODID, "block/" + McWoods.byId(j).getSerializedName() + "_terrace_table"));

            getBuilder(McWoods.byId(j).getSerializedName() + "_table_foot").parent(getExistingFile(modLoc("block/table_foot"))).texture("material", new ResourceLocation("block/" + McWoods.byId(j).getSerializedName() + "_planks")).texture("particle", new ResourceLocation("block/" + McWoods.byId(j).getSerializedName() + "_planks"));
            getBuilder(McWoods.byId(j).getSerializedName() + "_table_inventory").parent(getExistingFile(modLoc("block/table_inventory"))).texture("material", new ResourceLocation("block/" + McWoods.byId(j).getSerializedName() + "_planks"));
            getBuilder(McWoods.byId(j).getSerializedName() + "_table_top").parent(getExistingFile(modLoc("block/table_top"))).texture("material", new ResourceLocation("block/" + McWoods.byId(j).getSerializedName() + "_planks")).texture("particle", new ResourceLocation("block/" + McWoods.byId(j).getSerializedName() + "_planks"));

            getBuilder(McWoods.byId(j).getSerializedName() + "_fancy_table_foot").parent(getExistingFile(modLoc("block/fancy_table_foot"))).texture("side", new ResourceLocation(ECConstants.MODID, "block/" + McWoods.byId(j).getSerializedName() + "_fancy_table_side")).texture("top", new ResourceLocation(ECConstants.MODID, "block/" + McWoods.byId(j).getSerializedName() + "_fancy_table_top")).texture("particle", new ResourceLocation("block/" + McWoods.byId(j).getSerializedName() + "_planks"));
            getBuilder(McWoods.byId(j).getSerializedName() + "_fancy_table_inventory").parent(getExistingFile(modLoc("block/fancy_table_inventory"))).texture("side", new ResourceLocation(ECConstants.MODID, "block/" + McWoods.byId(j).getSerializedName() + "_fancy_table_side")).texture("top", new ResourceLocation(ECConstants.MODID, "block/" + McWoods.byId(j).getSerializedName() + "_fancy_table_top"));
            getBuilder(McWoods.byId(j).getSerializedName() + "_fancy_table_top").parent(getExistingFile(modLoc("block/fancy_table_top"))).texture("side", new ResourceLocation(ECConstants.MODID, "block/" + McWoods.byId(j).getSerializedName() + "_fancy_table_side")).texture("top", new ResourceLocation(ECConstants.MODID, "block/" + McWoods.byId(j).getSerializedName() + "_fancy_table_top")).texture("particle", new ResourceLocation("block/" + McWoods.byId(j).getSerializedName() + "_planks"));
        }

        getBuilder("steel_terrace_chair").parent(getExistingFile(modLoc("block/terrace_chair"))).texture("material", new ResourceLocation(ECConstants.MODID, "block/steel_terrace_table")).texture("particle", new ResourceLocation(ECConstants.MODID, "block/steel_terrace_table"));
        getBuilder("steel_terrace_table").parent(getExistingFile(modLoc("block/terrace_table"))).texture("material", new ResourceLocation(ECConstants.MODID, "block/steel_terrace_table")).texture("particle", new ResourceLocation(ECConstants.MODID, "block/steel_terrace_table"));

        for(int j = 0; j < Arrays.stream(DyeColor.values()).count(); j++)
        {
            buildTableLamp(DyeColor.byId(j).getSerializedName());
            buildCouch(DyeColor.byId(j).getSerializedName());
            getBuilder(DyeColor.byId(j).getSerializedName() + "_pillow").parent(getExistingFile(modLoc("block/pillow"))).texture("all", new ResourceLocation("block/" + DyeColor.byId(j).getSerializedName() + "_wool")).texture("particle", new ResourceLocation("block/" + DyeColor.byId(j).getSerializedName() + "_wool"));
        }

        // Chests
        for(int j = 0; j < Arrays.stream(McWoods.values()).count(); j++)
        {
            // getBuilder(McWoods.byId(j).getString() + "_fancy_chest").texture("particle", new ResourceLocation("block/" + McWoods.byId(j).getString() + "_planks"));
            getBuilder(McWoods.byId(j).getSerializedName() + "_fancy_chest").parent(getExistingFile(modLoc("block/chest"))).texture("particle", new ResourceLocation("block/" + McWoods.byId(j).getSerializedName() + "_planks")).texture("front", new ResourceLocation(ECConstants.MODID, "block/" + McWoods.byId(j).getSerializedName() + "_fancy_chest_front")).texture("side", new ResourceLocation(ECConstants.MODID, "block/" + McWoods.byId(j).getSerializedName() + "_fancy_chest_side")).texture("top", new ResourceLocation(ECConstants.MODID, "block/" + McWoods.byId(j).getSerializedName() + "_fancy_chest_top")).texture("bottom", new ResourceLocation(ECConstants.MODID, "block/" + McWoods.byId(j).getSerializedName() + "_fancy_chest_bottom")).texture("lock", new ResourceLocation(ECConstants.MODID, "block/air_duct")).texture("particle", new ResourceLocation("block/" + McWoods.byId(j).getSerializedName() + "_planks"));
            getBuilder(McWoods.byId(j).getSerializedName() + "_fancy_chest_left").parent(getExistingFile(modLoc("block/chest_left"))).texture("particle", new ResourceLocation("block/" + McWoods.byId(j).getSerializedName() + "_planks")).texture("front", new ResourceLocation(ECConstants.MODID, "block/" + McWoods.byId(j).getSerializedName() + "_fancy_chest_front_right")).texture("side", new ResourceLocation(ECConstants.MODID, "block/" + McWoods.byId(j).getSerializedName() + "_fancy_chest_side")).texture("top", new ResourceLocation(ECConstants.MODID, "block/" + McWoods.byId(j).getSerializedName() + "_fancy_chest_top_right")).texture("bottom", new ResourceLocation(ECConstants.MODID, "block/" + McWoods.byId(j).getSerializedName() + "_fancy_chest_bottom_right")).texture("back", new ResourceLocation(ECConstants.MODID, "block/" + McWoods.byId(j).getSerializedName() + "_fancy_chest_side_left")).texture("lock", new ResourceLocation(ECConstants.MODID, "block/air_duct"));
            getBuilder(McWoods.byId(j).getSerializedName() + "_fancy_chest_right").parent(getExistingFile(modLoc("block/chest_right"))).texture("particle", new ResourceLocation("block/" + McWoods.byId(j).getSerializedName() + "_planks")).texture("front", new ResourceLocation(ECConstants.MODID, "block/" + McWoods.byId(j).getSerializedName() + "_fancy_chest_front_left")).texture("side", new ResourceLocation(ECConstants.MODID, "block/" + McWoods.byId(j).getSerializedName() + "_fancy_chest_side")).texture("top", new ResourceLocation(ECConstants.MODID, "block/" + McWoods.byId(j).getSerializedName() + "_fancy_chest_top_left")).texture("bottom", new ResourceLocation(ECConstants.MODID, "block/" + McWoods.byId(j).getSerializedName() + "_fancy_chest_bottom_left")).texture("back", new ResourceLocation(ECConstants.MODID, "block/" + McWoods.byId(j).getSerializedName() + "_fancy_chest_side_right")).texture("lock", new ResourceLocation(ECConstants.MODID, "block/air_duct"));
            cubeColumn(McWoods.byId(j).getSerializedName() + "_wooden_crate", modLoc("block/" + McWoods.byId(j).getSerializedName() + "_wooden_crate"), modLoc("block/" + McWoods.byId(j).getSerializedName() + "_wooden_crate_top"));
        }

        getBuilder("locker_small").parent(getExistingFile(modLoc("block/locker"))).texture("front", new ResourceLocation(ECConstants.MODID, "block/locker_front_small")).texture("side", new ResourceLocation(ECConstants.MODID, "block/locker_side_bottom")).texture("top", new ResourceLocation(ECConstants.MODID, "block/locker_top")).texture("bottom", new ResourceLocation(ECConstants.MODID, "block/locker_bottom")).texture("particle", new ResourceLocation(ECConstants.MODID, "block/locker_side_bottom"));
        getBuilder("locker_top").parent(getExistingFile(modLoc("block/locker"))).texture("front", new ResourceLocation(ECConstants.MODID, "block/locker_front_top")).texture("side", new ResourceLocation(ECConstants.MODID, "block/locker_side_top")).texture("top", new ResourceLocation(ECConstants.MODID, "block/locker_top")).texture("bottom", new ResourceLocation(ECConstants.MODID, "block/locker_bottom")).texture("particle", new ResourceLocation(ECConstants.MODID, "block/locker_side_top"));
        getBuilder("locker_bottom").parent(getExistingFile(modLoc("block/locker"))).texture("front", new ResourceLocation(ECConstants.MODID, "block/locker_front_bottom")).texture("side", new ResourceLocation(ECConstants.MODID, "block/locker_side_bottom")).texture("top", new ResourceLocation(ECConstants.MODID, "block/locker_top")).texture("bottom", new ResourceLocation(ECConstants.MODID, "block/locker_bottom")).texture("particle", new ResourceLocation(ECConstants.MODID, "block/locker_side_bottom"));

        // Beds
        for(int i = 0; i < Arrays.stream(McWoods.values()).count(); i++)
        {
            for(int j = 0; j < Arrays.stream(DyeColor.values()).count(); j++)
            {
                buildBed(DyeColor.byId(j).getSerializedName(), McWoods.byId(i).getSerializedName(), "fancy_bed", "minecraft");
            }
        }
    }

    protected void buildBed(String color, String wood, String name, String planks_modid)
    {
        getBuilder(color + "_" + wood + "_" + name + "_head").parent(getExistingFile(new ResourceLocation(ECConstants.MODID, "block/" + name + "_head"))).texture("head", new ResourceLocation(modid, "block/" + color + "_" + wood + "_" + name + "_head")).texture("head_side", new ResourceLocation(modid, "block/" + color + "_" + wood + "_" + name + "_head_side")).texture("head_end", new ResourceLocation(modid, "block/" + wood + "_" + name + "_head_end")).texture("under", new ResourceLocation(planks_modid, "block/" + wood + "_planks")).texture("particle", new ResourceLocation(planks_modid, "block/" + wood + "_planks"));
        getBuilder(color + "_" + wood + "_" + name + "_foot").parent(getExistingFile(new ResourceLocation(ECConstants.MODID, "block/" + name + "_foot"))).texture("foot", new ResourceLocation(modid, "block/" + color + "_" + wood + "_" + name + "_foot")).texture("foot_side", new ResourceLocation(modid, "block/" + color + "_" + wood + "_" + name + "_foot_side")).texture("foot_end", new ResourceLocation(modid, "block/" + wood + "_" + name + "_foot_end")).texture("under", new ResourceLocation(planks_modid, "block/" + wood + "_planks")).texture("particle", new ResourceLocation(planks_modid, "block/" + wood + "_planks"));
        getBuilder(color + "_" + wood + "_" + name + "_inventory").parent(getExistingFile(new ResourceLocation(ECConstants.MODID, "block/" + name + "_inventory"))).texture("bed", new ResourceLocation(modid, "block/" + color + "_" + wood + "_" + name + "_head")).texture("end", new ResourceLocation(modid, "block/" + wood + "_" + name + "_head_end")).texture("under", new ResourceLocation(planks_modid, "block/" + wood + "_planks"));
    }

    protected void buildCouch(String color)
    {
        getBuilder(color + "_couch").parent(getExistingFile(modLoc("block/couch"))).texture("fabric", new ResourceLocation("block/" + color + "_wool")).texture("base", new ResourceLocation("block/oak_planks")).texture("back", new ResourceLocation("block/stripped_oak_log")).texture("particle", new ResourceLocation("block/" + color + "_wool"));
        getBuilder(color + "_couch_right").parent(getExistingFile(modLoc("block/couch_right"))).texture("fabric", new ResourceLocation("block/" + color + "_wool")).texture("particle", new ResourceLocation("block/" + color + "_wool"));
        getBuilder(color + "_couch_left").parent(getExistingFile(modLoc("block/couch_left"))).texture("fabric", new ResourceLocation("block/" + color + "_wool")).texture("particle", new ResourceLocation("block/" + color + "_wool"));
        getBuilder("inner_" + color + "_couch").parent(getExistingFile(modLoc("block/inner_couch"))).texture("fabric", new ResourceLocation("block/" + color + "_wool")).texture("base", new ResourceLocation("block/oak_planks")).texture("back", new ResourceLocation("block/stripped_oak_log")).texture("particle", new ResourceLocation("block/" + color + "_wool"));
        getBuilder("outer_" + color + "_couch").parent(getExistingFile(modLoc("block/outer_couch"))).texture("fabric", new ResourceLocation("block/" + color + "_wool")).texture("base", new ResourceLocation("block/oak_planks")).texture("back", new ResourceLocation("block/stripped_oak_log")).texture("particle", new ResourceLocation("block/" + color + "_wool"));
    }

    protected void buildTableLamp(String color)
    {
        getBuilder(color + "_table_lamp").parent(getExistingFile(modLoc("block/table_lamp"))).texture("texture", new ResourceLocation(ECConstants.MODID, "block/" + color + "_table_lamp")).texture("particle", new ResourceLocation(ECConstants.MODID, "block/" + color + "_table_lamp"));
        getBuilder(color + "_table_lamp_on").parent(getExistingFile(modLoc("block/table_lamp"))).texture("texture", new ResourceLocation(ECConstants.MODID, "block/" + color + "_table_lamp_on")).texture("particle", new ResourceLocation(ECConstants.MODID, "block/" + color + "_table_lamp_on"));
        getBuilder(color + "_manual_table_lamp").parent(getExistingFile(modLoc("block/table_lamp"))).texture("texture", new ResourceLocation(ECConstants.MODID, "block/" + color + "_table_lamp")).texture("particle", new ResourceLocation(ECConstants.MODID, "block/" + color + "_table_lamp"));
        getBuilder(color + "_manual_table_lamp_on").parent(getExistingFile(modLoc("block/table_lamp"))).texture("texture", new ResourceLocation(ECConstants.MODID, "block/" + color + "_table_lamp_on")).texture("particle", new ResourceLocation(ECConstants.MODID, "block/" + color + "_table_lamp_on"));
    }
}