package tv.mapper.embellishcraft.furniture.data;

import java.util.Arrays;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.DyeColor;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import tv.mapper.embellishcraft.core.ECConstants;
import tv.mapper.embellishcraft.core.data.ECBlockModels;
import tv.mapper.embellishcraft.core.util.McWoods;

public class FurnitureBlockModels extends ECBlockModels
{
    public FurnitureBlockModels(PackOutput generator, String modid, ExistingFileHelper existingFileHelper, String name)
    {
        super(generator, modid, existingFileHelper, name);
    }

    @Override
    protected void registerModels()
    {
        // furniture
        for(int j = 0; j < Arrays.stream(McWoods.values()).count(); j++)
        {
            getBuilder(McWoods.byId(j).getSerializedName() + "_chair").parent(getExistingFile(modLoc("block/chair"))).texture("material", ResourceLocation.fromNamespaceAndPath("minecraft", "block/" + McWoods.byId(j).getSerializedName() + "_planks")).texture("particle", ResourceLocation.fromNamespaceAndPath("minecraft", "block/" + McWoods.byId(j).getSerializedName() + "_planks"));
            getBuilder(McWoods.byId(j).getSerializedName() + "_terrace_chair").parent(getExistingFile(modLoc("block/terrace_chair"))).texture("material", ResourceLocation.fromNamespaceAndPath(ECConstants.MODID, "block/" + McWoods.byId(j).getSerializedName() + "_terrace_table")).texture("particle", ResourceLocation.fromNamespaceAndPath(ECConstants.MODID, "block/" + McWoods.byId(j).getSerializedName() + "_terrace_table"));
            getBuilder(McWoods.byId(j).getSerializedName() + "_terrace_table").parent(getExistingFile(modLoc("block/terrace_table"))).texture("material", ResourceLocation.fromNamespaceAndPath(ECConstants.MODID, "block/" + McWoods.byId(j).getSerializedName() + "_terrace_table")).texture("particle", ResourceLocation.fromNamespaceAndPath(ECConstants.MODID, "block/" + McWoods.byId(j).getSerializedName() + "_terrace_table"));

            getBuilder(McWoods.byId(j).getSerializedName() + "_table_foot").parent(getExistingFile(modLoc("block/table_foot"))).texture("material", ResourceLocation.fromNamespaceAndPath("minecraft", "block/" + McWoods.byId(j).getSerializedName() + "_planks")).texture("particle", ResourceLocation.fromNamespaceAndPath("minecraft", "block/" + McWoods.byId(j).getSerializedName() + "_planks"));
            getBuilder(McWoods.byId(j).getSerializedName() + "_table_inventory").parent(getExistingFile(modLoc("block/table_inventory"))).texture("material", ResourceLocation.fromNamespaceAndPath("minecraft", "block/" + McWoods.byId(j).getSerializedName() + "_planks"));
            getBuilder(McWoods.byId(j).getSerializedName() + "_table_top").parent(getExistingFile(modLoc("block/table_top"))).texture("material", ResourceLocation.fromNamespaceAndPath("minecraft", "block/" + McWoods.byId(j).getSerializedName() + "_planks")).texture("particle", ResourceLocation.fromNamespaceAndPath("minecraft", "block/" + McWoods.byId(j).getSerializedName() + "_planks"));

            getBuilder(McWoods.byId(j).getSerializedName() + "_sturdy_table_foot").parent(getExistingFile(modLoc("block/sturdy_table_foot"))).texture("side", ResourceLocation.fromNamespaceAndPath(ECConstants.MODID, "block/" + McWoods.byId(j).getSerializedName() + "_sturdy_table_side")).texture("top", ResourceLocation.fromNamespaceAndPath(ECConstants.MODID, "block/" + McWoods.byId(j).getSerializedName() + "_sturdy_table_top")).texture("particle", ResourceLocation.fromNamespaceAndPath("minecraft", "block/" + McWoods.byId(j).getSerializedName() + "_planks"));
            getBuilder(McWoods.byId(j).getSerializedName() + "_sturdy_table_inventory").parent(getExistingFile(modLoc("block/sturdy_table_inventory"))).texture("side", ResourceLocation.fromNamespaceAndPath(ECConstants.MODID, "block/" + McWoods.byId(j).getSerializedName() + "_sturdy_table_side")).texture("top", ResourceLocation.fromNamespaceAndPath(ECConstants.MODID, "block/" + McWoods.byId(j).getSerializedName() + "_sturdy_table_top"));
            getBuilder(McWoods.byId(j).getSerializedName() + "_sturdy_table_top").parent(getExistingFile(modLoc("block/sturdy_table_top"))).texture("side", ResourceLocation.fromNamespaceAndPath(ECConstants.MODID, "block/" + McWoods.byId(j).getSerializedName() + "_sturdy_table_side")).texture("top", ResourceLocation.fromNamespaceAndPath(ECConstants.MODID, "block/" + McWoods.byId(j).getSerializedName() + "_sturdy_table_top")).texture("particle", ResourceLocation.fromNamespaceAndPath("minecraft", "block/" + McWoods.byId(j).getSerializedName() + "_planks"));
        }

        getBuilder("steel_terrace_chair").parent(getExistingFile(modLoc("block/terrace_chair"))).texture("material", ResourceLocation.fromNamespaceAndPath(ECConstants.MODID, "block/steel_terrace_table")).texture("particle", ResourceLocation.fromNamespaceAndPath(ECConstants.MODID, "block/steel_terrace_table"));
        getBuilder("steel_terrace_table").parent(getExistingFile(modLoc("block/terrace_table"))).texture("material", ResourceLocation.fromNamespaceAndPath(ECConstants.MODID, "block/steel_terrace_table")).texture("particle", ResourceLocation.fromNamespaceAndPath(ECConstants.MODID, "block/steel_terrace_table"));

        for(int j = 0; j < Arrays.stream(DyeColor.values()).count(); j++)
        {
            buildCouch(DyeColor.byId(j).getSerializedName());
            getBuilder(DyeColor.byId(j).getSerializedName() + "_pillow").parent(getExistingFile(modLoc("block/pillow"))).texture("all", ResourceLocation.fromNamespaceAndPath("minecraft", "block/" + DyeColor.byId(j).getSerializedName() + "_wool")).texture("particle", ResourceLocation.fromNamespaceAndPath("minecraft", "block/" + DyeColor.byId(j).getSerializedName() + "_wool"));
        }

        // Chests
        for(int j = 0; j < Arrays.stream(McWoods.values()).count(); j++)
        {
            // getBuilder(McWoods.byId(j).getString() + "_fancy_chest").texture("particle", ResourceLocation.fromNamespaceAndPath("block/" + McWoods.byId(j).getString() + "_planks"));
            // getBuilder(McWoods.byId(j).getSerializedName() + "_fancy_chest").parent(getExistingFile(modLoc("block/chest"))).texture("particle", ResourceLocation.fromNamespaceAndPath("block/" +
            // McWoods.byId(j).getSerializedName() + "_planks")).texture("front", ResourceLocation.fromNamespaceAndPath(ECConstants.MODID, "block/" + McWoods.byId(j).getSerializedName() +
            // "_fancy_chest_front")).texture("side", ResourceLocation.fromNamespaceAndPath(ECConstants.MODID, "block/" + McWoods.byId(j).getSerializedName() + "_fancy_chest_side")).texture("top",
            // ResourceLocation.fromNamespaceAndPath(ECConstants.MODID, "block/" + McWoods.byId(j).getSerializedName() + "_fancy_chest_top")).texture("bottom",
            // ResourceLocation.fromNamespaceAndPath(ECConstants.MODID, "block/" + McWoods.byId(j).getSerializedName() + "_fancy_chest_bottom")).texture("lock",
            // ResourceLocation.fromNamespaceAndPath(ECConstants.MODID, "block/air_duct")).texture("particle", ResourceLocation.fromNamespaceAndPath("block/" + McWoods.byId(j).getSerializedName() +
            // "_planks"));
            // getBuilder(McWoods.byId(j).getSerializedName() + "_fancy_chest_left").parent(getExistingFile(modLoc("block/chest_left"))).texture("particle",
            // ResourceLocation.fromNamespaceAndPath("block/" + McWoods.byId(j).getSerializedName() + "_planks")).texture("front", ResourceLocation.fromNamespaceAndPath(ECConstants.MODID, "block/" +
            // McWoods.byId(j).getSerializedName() + "_fancy_chest_front_right")).texture("side", ResourceLocation.fromNamespaceAndPath(ECConstants.MODID, "block/" +
            // McWoods.byId(j).getSerializedName() + "_fancy_chest_side")).texture("top", ResourceLocation.fromNamespaceAndPath(ECConstants.MODID, "block/" + McWoods.byId(j).getSerializedName() +
            // "_fancy_chest_top_right")).texture("bottom", ResourceLocation.fromNamespaceAndPath(ECConstants.MODID, "block/" + McWoods.byId(j).getSerializedName() +
            // "_fancy_chest_bottom_right")).texture("back", ResourceLocation.fromNamespaceAndPath(ECConstants.MODID, "block/" + McWoods.byId(j).getSerializedName() +
            // "_fancy_chest_side_left")).texture("lock", ResourceLocation.fromNamespaceAndPath(ECConstants.MODID, "block/air_duct"));
            // getBuilder(McWoods.byId(j).getSerializedName() + "_fancy_chest_right").parent(getExistingFile(modLoc("block/chest_right"))).texture("particle",
            // ResourceLocation.fromNamespaceAndPath("block/" + McWoods.byId(j).getSerializedName() + "_planks")).texture("front", ResourceLocation.fromNamespaceAndPath(ECConstants.MODID, "block/" +
            // McWoods.byId(j).getSerializedName() + "_fancy_chest_front_left")).texture("side", ResourceLocation.fromNamespaceAndPath(ECConstants.MODID, "block/" + McWoods.byId(j).getSerializedName()
            // + "_fancy_chest_side")).texture("top", ResourceLocation.fromNamespaceAndPath(ECConstants.MODID, "block/" + McWoods.byId(j).getSerializedName() +
            // "_fancy_chest_top_left")).texture("bottom", ResourceLocation.fromNamespaceAndPath(ECConstants.MODID, "block/" + McWoods.byId(j).getSerializedName() +
            // "_fancy_chest_bottom_left")).texture("back", ResourceLocation.fromNamespaceAndPath(ECConstants.MODID, "block/" + McWoods.byId(j).getSerializedName() +
            // "_fancy_chest_side_right")).texture("lock", ResourceLocation.fromNamespaceAndPath(ECConstants.MODID, "block/air_duct"));
            cubeColumn(McWoods.byId(j).getSerializedName() + "_wooden_crate", modLoc("block/" + McWoods.byId(j).getSerializedName() + "_wooden_crate"), modLoc("block/" + McWoods.byId(j).getSerializedName() + "_wooden_crate_top"));
        }

        // getBuilder("locker_small").parent(getExistingFile(modLoc("block/locker"))).texture("front", ResourceLocation.fromNamespaceAndPath(ECConstants.MODID,
        // "block/locker_front_small")).texture("side", new
        // ResourceLocation(ECConstants.MODID, "block/locker_side_bottom")).texture("top", ResourceLocation.fromNamespaceAndPath(ECConstants.MODID, "block/locker_top")).texture("bottom", new
        // ResourceLocation(ECConstants.MODID, "block/locker_bottom")).texture("particle", ResourceLocation.fromNamespaceAndPath(ECConstants.MODID, "block/locker_side_bottom"));
        // getBuilder("locker_top").parent(getExistingFile(modLoc("block/locker"))).texture("front", ResourceLocation.fromNamespaceAndPath(ECConstants.MODID, "block/locker_front_top")).texture("side",
        // new
        // ResourceLocation(ECConstants.MODID, "block/locker_side_top")).texture("top", ResourceLocation.fromNamespaceAndPath(ECConstants.MODID, "block/locker_top")).texture("bottom", new
        // ResourceLocation(ECConstants.MODID, "block/locker_bottom")).texture("particle", ResourceLocation.fromNamespaceAndPath(ECConstants.MODID, "block/locker_side_top"));
        // getBuilder("locker_bottom").parent(getExistingFile(modLoc("block/locker"))).texture("front", ResourceLocation.fromNamespaceAndPath(ECConstants.MODID,
        // "block/locker_front_bottom")).texture("side", ResourceLocation.fromNamespaceAndPath(ECConstants.MODID, "block/locker_side_bottom")).texture("top",
        // ResourceLocation.fromNamespaceAndPath(ECConstants.MODID, "block/locker_top")).texture("bottom", ResourceLocation.fromNamespaceAndPath(ECConstants.MODID,
        // "block/locker_bottom")).texture("particle", ResourceLocation.fromNamespaceAndPath(ECConstants.MODID, "block/locker_side_bottom"));

        // Beds
        // for(int i = 0; i < Arrays.stream(McWoods.values()).count(); i++)
        // {
        // for(int j = 0; j < Arrays.stream(DyeColor.values()).count(); j++)
        // {
        // buildBed(DyeColor.byId(j).getSerializedName(), McWoods.byId(i).getSerializedName(), "fancy_bed", "minecraft");
        // }
        // }
    }

    // private void buildBed(String color, String wood, String name, String planks_modid)
    // {
    // getBuilder(color + "_" + wood + "_" + name + "_head").parent(getExistingFile(ResourceLocation.fromNamespaceAndPath(ECConstants.MODID, "block/" + name + "_head"))).texture("head",
    // ResourceLocation.fromNamespaceAndPath(modid, "block/" + color + "_" + wood + "_" + name + "_head")).texture("head_side", ResourceLocation.fromNamespaceAndPath(modid, "block/" + color + "_" +
    // wood + "_" + name + "_head_side")).texture("head_end", ResourceLocation.fromNamespaceAndPath(modid, "block/" + wood + "_" + name + "_head_end")).texture("under",
    // ResourceLocation.fromNamespaceAndPath(planks_modid, "block/" + wood + "_planks")).texture("particle", ResourceLocation.fromNamespaceAndPath(planks_modid, "block/" + wood + "_planks"));
    // getBuilder(color + "_" + wood + "_" + name + "_foot").parent(getExistingFile(ResourceLocation.fromNamespaceAndPath(ECConstants.MODID, "block/" + name + "_foot"))).texture("foot",
    // ResourceLocation.fromNamespaceAndPath(modid, "block/" + color + "_" + wood + "_" + name + "_foot")).texture("foot_side", ResourceLocation.fromNamespaceAndPath(modid, "block/" + color + "_" +
    // wood + "_" + name + "_foot_side")).texture("foot_end", ResourceLocation.fromNamespaceAndPath(modid, "block/" + wood + "_" + name + "_foot_end")).texture("under",
    // ResourceLocation.fromNamespaceAndPath(planks_modid, "block/" + wood + "_planks")).texture("particle", ResourceLocation.fromNamespaceAndPath(planks_modid, "block/" + wood + "_planks"));
    // getBuilder(color + "_" + wood + "_" + name + "_inventory").parent(getExistingFile(ResourceLocation.fromNamespaceAndPath(ECConstants.MODID, "block/" + name + "_inventory"))).texture("bed",
    // ResourceLocation.fromNamespaceAndPath(modid, "block/" + color + "_" + wood + "_" + name + "_head")).texture("end", ResourceLocation.fromNamespaceAndPath(modid, "block/" + wood + "_" + name +
    // "_head_end")).texture("under", ResourceLocation.fromNamespaceAndPath(planks_modid, "block/" + wood + "_planks"));
    // }

    private void buildCouch(String color)
    {
        getBuilder(color + "_couch").parent(getExistingFile(modLoc("block/couch"))).texture("fabric", ResourceLocation.fromNamespaceAndPath("minecraft", "block/" + color + "_wool")).texture("base", ResourceLocation.fromNamespaceAndPath("minecraft", "block/oak_planks")).texture("back", ResourceLocation.fromNamespaceAndPath("minecraft", "block/stripped_oak_log")).texture("particle", ResourceLocation.fromNamespaceAndPath("minecraft", "block/" + color + "_wool"));
        getBuilder(color + "_couch_right").parent(getExistingFile(modLoc("block/couch_right"))).texture("fabric", ResourceLocation.fromNamespaceAndPath("minecraft", "block/" + color + "_wool")).texture("particle", ResourceLocation.fromNamespaceAndPath("minecraft", "block/" + color + "_wool"));
        getBuilder(color + "_couch_left").parent(getExistingFile(modLoc("block/couch_left"))).texture("fabric", ResourceLocation.fromNamespaceAndPath("minecraft", "block/" + color + "_wool")).texture("particle", ResourceLocation.fromNamespaceAndPath("minecraft", "block/" + color + "_wool"));
        getBuilder("inner_" + color + "_couch").parent(getExistingFile(modLoc("block/inner_couch"))).texture("fabric", ResourceLocation.fromNamespaceAndPath("minecraft", "block/" + color + "_wool")).texture("base", ResourceLocation.fromNamespaceAndPath("minecraft", "block/oak_planks")).texture("back", ResourceLocation.fromNamespaceAndPath("minecraft", "block/stripped_oak_log")).texture("particle", ResourceLocation.fromNamespaceAndPath("minecraft", "block/" + color + "_wool"));
        getBuilder("outer_" + color + "_couch").parent(getExistingFile(modLoc("block/outer_couch"))).texture("fabric", ResourceLocation.fromNamespaceAndPath("minecraft", "block/" + color + "_wool")).texture("base", ResourceLocation.fromNamespaceAndPath("minecraft", "block/oak_planks")).texture("back", ResourceLocation.fromNamespaceAndPath("minecraft", "block/stripped_oak_log")).texture("particle", ResourceLocation.fromNamespaceAndPath("minecraft", "block/" + color + "_wool"));
    }
}
