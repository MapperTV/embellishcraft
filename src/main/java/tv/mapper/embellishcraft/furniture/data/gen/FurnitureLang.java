package tv.mapper.embellishcraft.furniture.data.gen;

import java.util.Arrays;

import org.codehaus.plexus.util.StringUtils;

import net.minecraft.world.item.DyeColor;
import tv.mapper.embellishcraft.core.data.gen.ECLang;
import tv.mapper.embellishcraft.furniture.world.level.block.InitFurnitureBlocks;
import tv.mapper.embellishcraft.util.McWoods;

public class FurnitureLang
{
    public static void addTranslations(ECLang provider, String lang)
    {
        String name;

        switch(lang)
        {
            default:
            case "en_us":
                // Furniture, doors, suspended stairs, wooden crates
                for(int j = 0; j < Arrays.stream(McWoods.values()).count(); j++)
                {
                    name = McWoods.byId(j).getName("en_us");

                    provider.addBlock(InitFurnitureBlocks.CHAIR_BLOCKS.get(McWoods.byId(j)), name + " Chair");
                    provider.addBlock(InitFurnitureBlocks.TERRACE_CHAIR_BLOCKS.get(McWoods.byId(j)), name + " Terrace Chair");
                    provider.addBlock(InitFurnitureBlocks.TABLE_BLOCKS.get(McWoods.byId(j)), name + " Table");
                    provider.addBlock(InitFurnitureBlocks.FANCY_TABLE_BLOCKS.get(McWoods.byId(j)), name + " Fancy Table");
                    provider.addBlock(InitFurnitureBlocks.TERRACE_TABLE_BLOCKS.get(McWoods.byId(j)), name + " Terrace Table");
                    provider.addBlock(InitFurnitureBlocks.WOODEN_CRATE_BLOCKS.get(McWoods.byId(j)), name + " Wooden Crate");
                    provider.addBlock(InitFurnitureBlocks.FANCY_CHEST_BLOCKS.get(McWoods.byId(j)), name + " Fancy Chest");
                }

                provider.addBlock(InitFurnitureBlocks.LOCKER, "Locker");

                provider.addBlock(InitFurnitureBlocks.STEEL_TERRACE_CHAIR, "Steel Terrace Chair");
                provider.addBlock(InitFurnitureBlocks.STEEL_TERRACE_TABLE, "Steel Terrace Table");

                name = "";

                for(int j = 0; j < Arrays.stream(DyeColor.values()).count(); j++)
                {
                    String raw[] = DyeColor.byId(j).getSerializedName().split("_");
                    if(raw[0].equals("light"))
                        name = StringUtils.capitalise(raw[0]) + " " + StringUtils.capitalise(raw[1]);
                    else
                        name = StringUtils.capitalise(raw[0]);

                    provider.addBlock(InitFurnitureBlocks.COUCH_BLOCKS.get(DyeColor.byId(j)), name + " Couch");
                    provider.addBlock(InitFurnitureBlocks.PILLOW_BLOCKS.get(DyeColor.byId(j)), name + " Pillow");

                    provider.addBlock(InitFurnitureBlocks.ACACIA_FANCY_BED_BLOCKS.get(DyeColor.byId(j)), name + " Acacia Fancy Bed");
                    provider.addBlock(InitFurnitureBlocks.BIRCH_FANCY_BED_BLOCKS.get(DyeColor.byId(j)), name + " Birch Fancy Bed");
                    provider.addBlock(InitFurnitureBlocks.JUNGLE_FANCY_BED_BLOCKS.get(DyeColor.byId(j)), name + " Jungle Fancy Bed");
                    provider.addBlock(InitFurnitureBlocks.DARK_OAK_FANCY_BED_BLOCKS.get(DyeColor.byId(j)), name + " Dark Oak Fancy Bed");
                    provider.addBlock(InitFurnitureBlocks.OAK_FANCY_BED_BLOCKS.get(DyeColor.byId(j)), name + " Oak Fancy Bed");
                    provider.addBlock(InitFurnitureBlocks.SPRUCE_FANCY_BED_BLOCKS.get(DyeColor.byId(j)), name + " Spruce Fancy Bed");
                    provider.addBlock(InitFurnitureBlocks.WARPED_FANCY_BED_BLOCKS.get(DyeColor.byId(j)), name + " Warped Fancy Bed");
                    provider.addBlock(InitFurnitureBlocks.CRIMSON_FANCY_BED_BLOCKS.get(DyeColor.byId(j)), name + " Crimson Fancy Bed");
                }

                provider.addBlock(InitFurnitureBlocks.PLATE, "Plate");

                provider.add("embellishcraft.container.wooden_crate", "Wooden Crate");

                provider.add("embellishcraft.container.locker", "Locker");
                provider.add("embellishcraft.container.locker_tall", "Tall Locker");
                provider.add("embellishcraft.message.locker.lock", "This locker is now locked!");
                provider.add("embellishcraft.message.locker.unlock", "This locker is now unlocked!");
                provider.add("embellishcraft.message.locker.wrong", "This locker is not yours!");
                provider.add("embellishcraft.message.locker.locked", "This locker is locked.");

                provider.add("embellishcraft.message.temp.seat", "Sitting down is currently disabled.");

                provider.add("itemGroup.embellishcraft_furniture_group", "EmbellishCraft - Furniture");
                break;
            case "fr_fr":
                String frColorsM[] = {"blanc", "orange", "magenta", "bleu clair", "jaune", "vert clair", "rose", "gris", "gris clair", "cyan", "violet", "bleu", "marron", "vert", "rouge", "noir"};

                // Furniture
                for(int j = 0; j < Arrays.stream(McWoods.values()).count(); j++)
                {
                    name = McWoods.byId(j).getName("fr_fr");

                    provider.addBlock(InitFurnitureBlocks.CHAIR_BLOCKS.get(McWoods.byId(j)), "Chaise en " + name);
                    provider.addBlock(InitFurnitureBlocks.TERRACE_CHAIR_BLOCKS.get(McWoods.byId(j)), "Chaise de terrasse en " + name);
                    provider.addBlock(InitFurnitureBlocks.TABLE_BLOCKS.get(McWoods.byId(j)), "Table en " + name);
                    provider.addBlock(InitFurnitureBlocks.FANCY_TABLE_BLOCKS.get(McWoods.byId(j)), "Table massive en " + name);
                    provider.addBlock(InitFurnitureBlocks.TERRACE_TABLE_BLOCKS.get(McWoods.byId(j)), "Table de terrase en " + name);
                    provider.addBlock(InitFurnitureBlocks.WOODEN_CRATE_BLOCKS.get(McWoods.byId(j)), "Caisse en " + name);
                    provider.addBlock(InitFurnitureBlocks.FANCY_CHEST_BLOCKS.get(McWoods.byId(j)), "Coffre massif en " + name);
                }
                provider.addBlock(InitFurnitureBlocks.LOCKER, "Casier");

                provider.addBlock(InitFurnitureBlocks.STEEL_TERRACE_CHAIR, "Chaise de terrasse en acier");
                provider.addBlock(InitFurnitureBlocks.STEEL_TERRACE_TABLE, "Table de terrasse en acier");

                for(int j = 0; j < Arrays.stream(DyeColor.values()).count(); j++)
                {
                    provider.addBlock(InitFurnitureBlocks.COUCH_BLOCKS.get(DyeColor.byId(j)), "Canapé " + frColorsM[j]);
                    provider.addBlock(InitFurnitureBlocks.PILLOW_BLOCKS.get(DyeColor.byId(j)), "Coussin " + frColorsM[j]);

                    provider.addBlock(InitFurnitureBlocks.ACACIA_FANCY_BED_BLOCKS.get(DyeColor.byId(j)), "Lit massif " + frColorsM[j] + " en bois d'acajou");
                    provider.addBlock(InitFurnitureBlocks.BIRCH_FANCY_BED_BLOCKS.get(DyeColor.byId(j)), "Lit massif " + frColorsM[j] + " en bois de bouleau");
                    provider.addBlock(InitFurnitureBlocks.JUNGLE_FANCY_BED_BLOCKS.get(DyeColor.byId(j)), "Lit massif " + frColorsM[j] + " en bois de jungle");
                    provider.addBlock(InitFurnitureBlocks.DARK_OAK_FANCY_BED_BLOCKS.get(DyeColor.byId(j)), "Lit massif " + frColorsM[j] + " en bois de chêne sombre");
                    provider.addBlock(InitFurnitureBlocks.OAK_FANCY_BED_BLOCKS.get(DyeColor.byId(j)), "Lit massif " + frColorsM[j] + " en bois de chêne");
                    provider.addBlock(InitFurnitureBlocks.SPRUCE_FANCY_BED_BLOCKS.get(DyeColor.byId(j)), "Lit massif " + frColorsM[j] + " en bois de sapin");
                    provider.addBlock(InitFurnitureBlocks.WARPED_FANCY_BED_BLOCKS.get(DyeColor.byId(j)), "Lit massif " + frColorsM[j] + " en bois biscornu");
                    provider.addBlock(InitFurnitureBlocks.CRIMSON_FANCY_BED_BLOCKS.get(DyeColor.byId(j)), "Lit massif " + frColorsM[j] + " en bois carmin");
                }

                provider.addBlock(InitFurnitureBlocks.PLATE, "Assiette");

                provider.add("embellishcraft.container.wooden_crate", "Caisse en bois");

                provider.add("embellishcraft.container.locker", "Casier");
                provider.add("embellishcraft.container.locker_tall", "Grand casier");
                provider.add("embellishcraft.message.locker.lock", "Ce casier est maintenant verouillé!");
                provider.add("embellishcraft.message.locker.unlock", "Ce casier est maintenant déverouillé!");
                provider.add("embellishcraft.message.locker.wrong", "Ce casier n'est pas à vous!");
                provider.add("embellishcraft.message.locker.locked", "Ce casier est verouillé.");

                provider.add("embellishcraft.message.temp.seat", "S'asseoir est désactivé pour le moment.");

                provider.add("itemGroup.embellishcraft_furniture_group", "EmbellishCraft - Mobilier");
                break;
        }
    }
}
