package tv.mapper.embellishcraft.data.gen;

import java.util.Arrays;

import org.codehaus.plexus.util.StringUtils;

import net.minecraft.data.DataGenerator;
import net.minecraft.world.item.DyeColor;
import net.minecraftforge.common.data.LanguageProvider;
import tv.mapper.embellishcraft.block.ECBlockRegistry;
import tv.mapper.embellishcraft.building.data.gen.BuildingLang;
import tv.mapper.embellishcraft.industrial.data.gen.IndustrialLang;
import tv.mapper.embellishcraft.rocks.data.gen.RockLang;
import tv.mapper.embellishcraft.util.McWoods;

public class ECLang extends LanguageProvider
{
    private String lang;

    public ECLang(DataGenerator gen, String modid, String locale)
    {
        super(gen, modid, locale);
        lang = locale;
    }

    @Override
    protected void addTranslations()
    {
        String name;

        RockLang.addTranslations(this, lang);
        IndustrialLang.addTranslations(this, lang);
        BuildingLang.addTranslations(this, lang);

        switch(lang)
        {
            default:
            case "en_us":
                // Furniture, doors, suspended stairs, wooden crates
                for(int j = 0; j < Arrays.stream(McWoods.values()).count(); j++)
                {
                    name = McWoods.byId(j).getName("en_us");

                    addBlock(ECBlockRegistry.CHAIR_BLOCKS.get(McWoods.byId(j)), name + " Chair");
                    addBlock(ECBlockRegistry.TERRACE_CHAIR_BLOCKS.get(McWoods.byId(j)), name + " Terrace Chair");
                    addBlock(ECBlockRegistry.TABLE_BLOCKS.get(McWoods.byId(j)), name + " Table");
                    addBlock(ECBlockRegistry.FANCY_TABLE_BLOCKS.get(McWoods.byId(j)), name + " Fancy Table");
                    addBlock(ECBlockRegistry.TERRACE_TABLE_BLOCKS.get(McWoods.byId(j)), name + " Terrace Table");
                    addBlock(ECBlockRegistry.WOODEN_CRATE_BLOCKS.get(McWoods.byId(j)), name + " Wooden Crate");
                    addBlock(ECBlockRegistry.FANCY_CHEST_BLOCKS.get(McWoods.byId(j)), name + " Fancy Chest");
                }

                addBlock(ECBlockRegistry.LOCKER, "Locker");

                addBlock(ECBlockRegistry.STEEL_TERRACE_CHAIR, "Steel Terrace Chair");
                addBlock(ECBlockRegistry.STEEL_TERRACE_TABLE, "Steel Terrace Table");

                name = "";

                for(int j = 0; j < Arrays.stream(DyeColor.values()).count(); j++)
                {
                    String raw[] = DyeColor.byId(j).getSerializedName().split("_");
                    if(raw[0].equals("light"))
                        name = StringUtils.capitalise(raw[0]) + " " + StringUtils.capitalise(raw[1]);
                    else
                        name = StringUtils.capitalise(raw[0]);

                    addBlock(ECBlockRegistry.COUCH_BLOCKS.get(DyeColor.byId(j)), name + " Couch");
                    addBlock(ECBlockRegistry.TABLE_LAMP_BLOCKS.get(DyeColor.byId(j)), name + " Table Lamp");
                    addBlock(ECBlockRegistry.MANUAL_TABLE_LAMP_BLOCKS.get(DyeColor.byId(j)), name + " Table Lamp (Manual)");
                    addBlock(ECBlockRegistry.PILLOW_BLOCKS.get(DyeColor.byId(j)), name + " Pillow");

                    addBlock(ECBlockRegistry.ACACIA_FANCY_BED_BLOCKS.get(DyeColor.byId(j)), name + " Acacia Fancy Bed");
                    addBlock(ECBlockRegistry.BIRCH_FANCY_BED_BLOCKS.get(DyeColor.byId(j)), name + " Birch Fancy Bed");
                    addBlock(ECBlockRegistry.JUNGLE_FANCY_BED_BLOCKS.get(DyeColor.byId(j)), name + " Jungle Fancy Bed");
                    addBlock(ECBlockRegistry.DARK_OAK_FANCY_BED_BLOCKS.get(DyeColor.byId(j)), name + " Dark Oak Fancy Bed");
                    addBlock(ECBlockRegistry.OAK_FANCY_BED_BLOCKS.get(DyeColor.byId(j)), name + " Oak Fancy Bed");
                    addBlock(ECBlockRegistry.SPRUCE_FANCY_BED_BLOCKS.get(DyeColor.byId(j)), name + " Spruce Fancy Bed");
                    addBlock(ECBlockRegistry.WARPED_FANCY_BED_BLOCKS.get(DyeColor.byId(j)), name + " Warped Fancy Bed");
                    addBlock(ECBlockRegistry.CRIMSON_FANCY_BED_BLOCKS.get(DyeColor.byId(j)), name + " Crimson Fancy Bed");
                }

                addBlock(ECBlockRegistry.PLATE, "Plate");

                add("embellishcraft.container.wooden_crate", "Wooden Crate");

                add("embellishcraft.container.locker", "Locker");
                add("embellishcraft.container.locker_tall", "Tall Locker");
                add("embellishcraft.message.locker.lock", "This locker is now locked!");
                add("embellishcraft.message.locker.unlock", "This locker is now unlocked!");
                add("embellishcraft.message.locker.wrong", "This locker is not yours!");
                add("embellishcraft.message.locker.locked", "This locker is locked.");

                add("embellishcraft.message.temp.seat", "Sitting down is currently disabled.");

                add("itemGroup.embellishcraft_group", "EmbellishCraft");
                break;
            case "fr_fr":
                String frColorsF[] = {"blanche", "orange", "magenta", "bleu claire", "jaune", "vert claire", "rose", "grise", "gris claire", "cyan", "violette", "bleue", "marron", "verte", "rouge", "noire"};
                String frColorsM[] = {"blanc", "orange", "magenta", "bleu clair", "jaune", "vert clair", "rose", "gris", "gris clair", "cyan", "violet", "bleu", "marron", "vert", "rouge", "noir"};

                // Furniture
                for(int j = 0; j < Arrays.stream(McWoods.values()).count(); j++)
                {
                    name = McWoods.byId(j).getName("fr_fr");

                    addBlock(ECBlockRegistry.CHAIR_BLOCKS.get(McWoods.byId(j)), "Chaise en " + name);
                    addBlock(ECBlockRegistry.TERRACE_CHAIR_BLOCKS.get(McWoods.byId(j)), "Chaise de terrasse en " + name);
                    addBlock(ECBlockRegistry.TABLE_BLOCKS.get(McWoods.byId(j)), "Table en " + name);
                    addBlock(ECBlockRegistry.FANCY_TABLE_BLOCKS.get(McWoods.byId(j)), "Table massive en " + name);
                    addBlock(ECBlockRegistry.TERRACE_TABLE_BLOCKS.get(McWoods.byId(j)), "Table de terrase en " + name);
                    addBlock(ECBlockRegistry.WOODEN_CRATE_BLOCKS.get(McWoods.byId(j)), "Caisse en " + name);
                    addBlock(ECBlockRegistry.FANCY_CHEST_BLOCKS.get(McWoods.byId(j)), "Coffre massif en " + name);
                }
                addBlock(ECBlockRegistry.LOCKER, "Casier");

                addBlock(ECBlockRegistry.STEEL_TERRACE_CHAIR, "Chaise de terrasse en acier");
                addBlock(ECBlockRegistry.STEEL_TERRACE_TABLE, "Table de terrasse en acier");

                for(int j = 0; j < Arrays.stream(DyeColor.values()).count(); j++)
                {
                    addBlock(ECBlockRegistry.COUCH_BLOCKS.get(DyeColor.byId(j)), "Canapé " + frColorsM[j]);
                    addBlock(ECBlockRegistry.TABLE_LAMP_BLOCKS.get(DyeColor.byId(j)), "Lampe de chevet " + frColorsF[j]);
                    addBlock(ECBlockRegistry.MANUAL_TABLE_LAMP_BLOCKS.get(DyeColor.byId(j)), "Lampe de chevet " + frColorsF[j] + " (manuelle)");
                    addBlock(ECBlockRegistry.PILLOW_BLOCKS.get(DyeColor.byId(j)), "Coussin " + frColorsM[j]);

                    addBlock(ECBlockRegistry.ACACIA_FANCY_BED_BLOCKS.get(DyeColor.byId(j)), "Lit massif " + frColorsM[j] + " en bois d'acajou");
                    addBlock(ECBlockRegistry.BIRCH_FANCY_BED_BLOCKS.get(DyeColor.byId(j)), "Lit massif " + frColorsM[j] + " en bois de bouleau");
                    addBlock(ECBlockRegistry.JUNGLE_FANCY_BED_BLOCKS.get(DyeColor.byId(j)), "Lit massif " + frColorsM[j] + " en bois de jungle");
                    addBlock(ECBlockRegistry.DARK_OAK_FANCY_BED_BLOCKS.get(DyeColor.byId(j)), "Lit massif " + frColorsM[j] + " en bois de chêne sombre");
                    addBlock(ECBlockRegistry.OAK_FANCY_BED_BLOCKS.get(DyeColor.byId(j)), "Lit massif " + frColorsM[j] + " en bois de chêne");
                    addBlock(ECBlockRegistry.SPRUCE_FANCY_BED_BLOCKS.get(DyeColor.byId(j)), "Lit massif " + frColorsM[j] + " en bois de sapin");
                    addBlock(ECBlockRegistry.WARPED_FANCY_BED_BLOCKS.get(DyeColor.byId(j)), "Lit massif " + frColorsM[j] + " en bois biscornu");
                    addBlock(ECBlockRegistry.CRIMSON_FANCY_BED_BLOCKS.get(DyeColor.byId(j)), "Lit massif " + frColorsM[j] + " en bois carmin");
                }

                addBlock(ECBlockRegistry.PLATE, "Assiette");

                add("embellishcraft.container.wooden_crate", "Caisse en bois");

                add("embellishcraft.container.locker", "Casier");
                add("embellishcraft.container.locker_tall", "Grand casier");
                add("embellishcraft.message.locker.lock", "Ce casier est maintenant verouillé!");
                add("embellishcraft.message.locker.unlock", "Ce casier est maintenant déverouillé!");
                add("embellishcraft.message.locker.wrong", "Ce casier n'est pas à vous!");
                add("embellishcraft.message.locker.locked", "Ce casier est verouillé.");

                add("embellishcraft.message.temp.seat", "S'asseoir est désactivé pour le moment.");

                add("itemGroup.embellishcraft_group", "EmbellishCraft");
                break;
        }
    }
}