package tv.mapper.embellishcraft.building.data;

import java.util.Arrays;

import org.codehaus.plexus.util.StringUtils;

import net.minecraft.world.item.DyeColor;
import tv.mapper.embellishcraft.building.block.InitBuildingBlocks;
import tv.mapper.embellishcraft.core.data.ECLang;
import tv.mapper.embellishcraft.core.util.McWoods;

public class BuildingLang
{
    public static void addTranslations(ECLang provider, String lang)
    {
        String name;

        switch(lang)
        {
            default:
            case "en_us":
                // Other bricks
                provider.addBlock(InitBuildingBlocks.DARK_BRICKS, "Dark Bricks");
                provider.addBlock(InitBuildingBlocks.DARK_BRICKS_SLAB, "Dark Bricks Slab");
                provider.addBlock(InitBuildingBlocks.DARK_BRICKS_STAIRS, "Dark Bricks Stairs");
                provider.addBlock(InitBuildingBlocks.DARK_BRICKS_WALL, "Dark Bricks Wall");
                provider.addBlock(InitBuildingBlocks.DARK_BRICKS_PRESSURE_PLATE, "Dark Bricks Pressure Plate");

                provider.addBlock(InitBuildingBlocks.DARK_LARGE_BRICKS, "Dark Large Bricks");
                provider.addBlock(InitBuildingBlocks.DARK_LARGE_BRICKS_SLAB, "Dark Large Bricks Slab");
                provider.addBlock(InitBuildingBlocks.DARK_LARGE_BRICKS_STAIRS, "Dark Large Bricks Stairs");
                provider.addBlock(InitBuildingBlocks.DARK_LARGE_BRICKS_WALL, "Dark Large Bricks Wall");
                provider.addBlock(InitBuildingBlocks.DARK_LARGE_BRICKS_PRESSURE_PLATE, "Dark Large Bricks Pressure Plate");

                provider.addBlock(InitBuildingBlocks.OLD_BRICKS, "Old Bricks");
                provider.addBlock(InitBuildingBlocks.OLD_BRICKS_SLAB, "Old Bricks Slab");
                provider.addBlock(InitBuildingBlocks.OLD_BRICKS_STAIRS, "Old Bricks Stairs");
                provider.addBlock(InitBuildingBlocks.OLD_BRICKS_WALL, "Old Bricks Wall");
                provider.addBlock(InitBuildingBlocks.OLD_BRICKS_PRESSURE_PLATE, "Old Bricks Pressure Plate");

                provider.addBlock(InitBuildingBlocks.OLD_LARGE_BRICKS, "Old Large Bricks");
                provider.addBlock(InitBuildingBlocks.OLD_LARGE_BRICKS_SLAB, "Old Large Bricks Slab");
                provider.addBlock(InitBuildingBlocks.OLD_LARGE_BRICKS_STAIRS, "Old Large Bricks Stairs");
                provider.addBlock(InitBuildingBlocks.OLD_LARGE_BRICKS_WALL, "Old Large Bricks Wall");
                provider.addBlock(InitBuildingBlocks.OLD_LARGE_BRICKS_PRESSURE_PLATE, "Old Large Bricks Pressure Plate");

                provider.addBlock(InitBuildingBlocks.WEARED_BRICKS, "Weared Bricks");
                provider.addBlock(InitBuildingBlocks.WEARED_BRICKS_SLAB, "Weared Bricks Slab");
                provider.addBlock(InitBuildingBlocks.WEARED_BRICKS_STAIRS, "Weared Bricks Stairs");
                provider.addBlock(InitBuildingBlocks.WEARED_BRICKS_WALL, "Weared Bricks Wall");
                provider.addBlock(InitBuildingBlocks.WEARED_BRICKS_PRESSURE_PLATE, "Weared Bricks Pressure Plate");

                provider.addBlock(InitBuildingBlocks.WEARED_LARGE_BRICKS, "Weared Large Bricks");
                provider.addBlock(InitBuildingBlocks.WEARED_LARGE_BRICKS_SLAB, "Weared Large Bricks Slab");
                provider.addBlock(InitBuildingBlocks.WEARED_LARGE_BRICKS_STAIRS, "Weared Large Bricks Stairs");
                provider.addBlock(InitBuildingBlocks.WEARED_LARGE_BRICKS_WALL, "Weared Large Bricks Wall");
                provider.addBlock(InitBuildingBlocks.WEARED_LARGE_BRICKS_PRESSURE_PLATE, "Weared Large Bricks Pressure Plate");

                // Pavings
                provider.addBlock(InitBuildingBlocks.CONCRETE_PAVING, "Concrete Paving");
                provider.addBlock(InitBuildingBlocks.CONCRETE_PAVING_SLAB, "Concrete Paving Slab");
                provider.addBlock(InitBuildingBlocks.CONCRETE_PAVING_STAIRS, "Concrete Paving Stairs");
                provider.addBlock(InitBuildingBlocks.CONCRETE_PAVING_WALL, "Concrete Paving Wall");
                provider.addBlock(InitBuildingBlocks.CONCRETE_PAVING_PRESSURE_PLATE, "Concrete Paving Pressure Plate");

                provider.addBlock(InitBuildingBlocks.DAMAGED_PAVING, "Damaged Paving");
                provider.addBlock(InitBuildingBlocks.DAMAGED_PAVING_SLAB, "Damaged Paving Slab");
                provider.addBlock(InitBuildingBlocks.DAMAGED_PAVING_STAIRS, "Damaged Paving Stairs");
                provider.addBlock(InitBuildingBlocks.DAMAGED_PAVING_WALL, "Damaged Paving Wall");
                provider.addBlock(InitBuildingBlocks.DAMAGED_PAVING_PRESSURE_PLATE, "Damaged Paving Pressure Plate");

                provider.addBlock(InitBuildingBlocks.DARK_CONCRETE_PAVING, "Dark Concrete Paving");
                provider.addBlock(InitBuildingBlocks.DARK_CONCRETE_PAVING_SLAB, "Dark Concrete Paving Slab");
                provider.addBlock(InitBuildingBlocks.DARK_CONCRETE_PAVING_STAIRS, "Dark Concrete Paving Stairs");
                provider.addBlock(InitBuildingBlocks.DARK_CONCRETE_PAVING_WALL, "Dark Concrete Paving Wall");
                provider.addBlock(InitBuildingBlocks.DARK_CONCRETE_PAVING_PRESSURE_PLATE, "Dark Concrete Paving Pressure Plate");

                provider.addBlock(InitBuildingBlocks.MOIST_PAVING, "Dirty Paving");
                provider.addBlock(InitBuildingBlocks.MOIST_PAVING_SLAB, "Dirty Paving Slab");
                provider.addBlock(InitBuildingBlocks.MOIST_PAVING_STAIRS, "Dirty Paving Stairs");
                provider.addBlock(InitBuildingBlocks.MOIST_PAVING_WALL, "Dirty Paving Wall");
                provider.addBlock(InitBuildingBlocks.MOIST_PAVING_PRESSURE_PLATE, "Dirty Paving Pressure Plate");

                provider.addBlock(InitBuildingBlocks.POLISHED_PAVING, "Polished Paving");
                provider.addBlock(InitBuildingBlocks.POLISHED_PAVING_SLAB, "Polished Paving Slab");
                provider.addBlock(InitBuildingBlocks.POLISHED_PAVING_STAIRS, "Polished Paving Stairs");
                provider.addBlock(InitBuildingBlocks.POLISHED_PAVING_WALL, "Polished Paving Wall");
                provider.addBlock(InitBuildingBlocks.POLISHED_PAVING_PRESSURE_PLATE, "Polished Paving Pressure Plate");

                provider.addBlock(InitBuildingBlocks.WHITE_CONCRETE_PAVING, "White Concrete Paving");
                provider.addBlock(InitBuildingBlocks.WHITE_CONCRETE_PAVING_SLAB, "White Concrete Paving Slab");
                provider.addBlock(InitBuildingBlocks.WHITE_CONCRETE_PAVING_STAIRS, "White Concrete Paving Stairs");
                provider.addBlock(InitBuildingBlocks.WHITE_CONCRETE_PAVING_WALL, "White Concrete Paving Wall");
                provider.addBlock(InitBuildingBlocks.WHITE_CONCRETE_PAVING_PRESSURE_PLATE, "White Concrete Paving Pressure Plate");

                // Tiles
                provider.addBlock(InitBuildingBlocks.CONCRETE_TILES, "Concrete Tiles");
                provider.addBlock(InitBuildingBlocks.CONCRETE_TILES_SLAB, "Concrete Tiles Slab");
                provider.addBlock(InitBuildingBlocks.CONCRETE_TILES_STAIRS, "Concrete Tiles Stairs");
                provider.addBlock(InitBuildingBlocks.CONCRETE_TILES_WALL, "Concrete Tiles Wall");
                provider.addBlock(InitBuildingBlocks.CONCRETE_TILES_PRESSURE_PLATE, "Concrete Tiles Pressure Plate");

                provider.addBlock(InitBuildingBlocks.SKYBLUE_TILES, "Skyblue Tiles");
                provider.addBlock(InitBuildingBlocks.SKYBLUE_TILES_SLAB, "Skyblue Tiles Slab");
                provider.addBlock(InitBuildingBlocks.SKYBLUE_TILES_STAIRS, "Skyblue Tiles Stairs");
                provider.addBlock(InitBuildingBlocks.SKYBLUE_TILES_WALL, "Skyblue Tiles Wall");
                provider.addBlock(InitBuildingBlocks.SKYBLUE_TILES_PRESSURE_PLATE, "Skyblue Tiles Pressure Plate");

                for(int j = 0; j < Arrays.stream(DyeColor.values()).count(); j++)
                {
                    String color = DyeColor.byId(j).getSerializedName();
                    String check[] = color.split("_");
                    if(check.length > 1)
                        color = StringUtils.capitalise(check[0]) + " " + StringUtils.capitalise(check[1]);
                    else
                        color = StringUtils.capitalise(check[0]);

                    provider.addBlock(InitBuildingBlocks.TILES_BLOCKS.get(DyeColor.byId(j)), color + " Tiles");
                    provider.addBlock(InitBuildingBlocks.TILES_SLABS.get(DyeColor.byId(j)), color + " Tiles Slab");
                    provider.addBlock(InitBuildingBlocks.TILES_STAIRS.get(DyeColor.byId(j)), color + " Tiles Stairs");
                    provider.addBlock(InitBuildingBlocks.TILES_WALLS.get(DyeColor.byId(j)), color + " Tiles Wall");
                    provider.addBlock(InitBuildingBlocks.TILES_PRESSURE_PLATES.get(DyeColor.byId(j)), color + " Tiles Pressure Plate");
                }

                provider.addBlock(InitBuildingBlocks.YELLOW_GREY_TILES, "Yellow-Grey Tiles");
                provider.addBlock(InitBuildingBlocks.YELLOW_GREY_TILES_SLAB, "Yellow-Grey Tiles Slab");
                provider.addBlock(InitBuildingBlocks.YELLOW_GREY_TILES_STAIRS, "Yellow-Grey Tiles Stairs");
                provider.addBlock(InitBuildingBlocks.YELLOW_GREY_TILES_WALL, "Yellow-Grey Tiles Wall");
                provider.addBlock(InitBuildingBlocks.YELLOW_GREY_TILES_PRESSURE_PLATE, "Yellow-Grey Tiles Pressure Plate");

                // Wallpapers
                provider.addBlock(InitBuildingBlocks.WHITE_BLUE_WALLPAPER, "White / Blue Wallpaper");
                provider.addBlock(InitBuildingBlocks.WHITE_BLUE_WALLPAPER_SLAB, "White / Blue Wallpaper Slab");
                provider.addBlock(InitBuildingBlocks.WHITE_BLUE_WALLPAPER_STAIRS, "White / Blue Wallpaper Stairs");
                provider.addBlock(InitBuildingBlocks.WHITE_BLUE_WALLPAPER_PLINTH, "White / Blue Wallpaper With Plinth");

                provider.addBlock(InitBuildingBlocks.BEIGE_FLOWER_WALLPAPER, "Beige / Flower Wallpaper");
                provider.addBlock(InitBuildingBlocks.BEIGE_FLOWER_WALLPAPER_SLAB, "Beige / Flower Wallpaper Slab");
                provider.addBlock(InitBuildingBlocks.BEIGE_FLOWER_WALLPAPER_STAIRS, "Beige / Flower Wallpaper Stairs");
                provider.addBlock(InitBuildingBlocks.BEIGE_FLOWER_WALLPAPER_PLINTH, "Beige / Flower Wallpaper With Plinth");

                provider.addBlock(InitBuildingBlocks.BEIGE_WALLPAPER, "Beige Wallpaper");
                provider.addBlock(InitBuildingBlocks.BEIGE_WALLPAPER_SLAB, "Beige Wallpaper Slab");
                provider.addBlock(InitBuildingBlocks.BEIGE_WALLPAPER_STAIRS, "Beige Wallpaper Stairs");
                provider.addBlock(InitBuildingBlocks.BEIGE_WALLPAPER_PLINTH, "Beige Wallpaper With Plinth");

                provider.addBlock(InitBuildingBlocks.PINK_WALLPAPER, "Pink Wallpaper");
                provider.addBlock(InitBuildingBlocks.PINK_WALLPAPER_SLAB, "Pink Wallpaper Slab");
                provider.addBlock(InitBuildingBlocks.PINK_WALLPAPER_STAIRS, "Pink Wallpaper Stairs");
                provider.addBlock(InitBuildingBlocks.PINK_WALLPAPER_PLINTH, "Pink Wallpaper With Plinth");

                provider.addBlock(InitBuildingBlocks.WHITE_GREEN_WALLPAPER, "White / Green Wallpaper");
                provider.addBlock(InitBuildingBlocks.WHITE_GREEN_WALLPAPER_SLAB, "White / Green Wallpaper Slab");
                provider.addBlock(InitBuildingBlocks.WHITE_GREEN_WALLPAPER_STAIRS, "White / Green Wallpaper Stairs");
                provider.addBlock(InitBuildingBlocks.WHITE_GREEN_WALLPAPER_PLINTH, "White / Green Wallpaper With Plinth");

                // Doors, suspended stairs
                for(int j = 0; j < Arrays.stream(McWoods.values()).count(); j++)
                {
                    name = McWoods.byId(j).getName("en_us");

                    provider.addBlock(InitBuildingBlocks.FANCY_DOOR_BLOCKS.get(McWoods.byId(j)), name + " Fancy Door");
                    provider.addBlock(InitBuildingBlocks.PLAIN_DOOR_BLOCKS.get(McWoods.byId(j)), name + " Plain Door");
                    provider.addBlock(InitBuildingBlocks.SUSPENDED_STAIRS_BLOCKS.get(McWoods.byId(j)), name + " Suspended Stairs");
                    provider.addBlock(InitBuildingBlocks.LARGE_SUSPENDED_STAIRS_BLOCKS.get(McWoods.byId(j)), name + " Large Suspended Stairs");
                }

                provider.add("itemGroup.embellishcraft_building_group", "EmbellishCraft - Building");
                break;
            case "fr_fr":
                // Other bricks
                provider.addBlock(InitBuildingBlocks.DARK_BRICKS, "Briques sombres");
                provider.addBlock(InitBuildingBlocks.DARK_BRICKS_SLAB, "Dalle en briques sombres");
                provider.addBlock(InitBuildingBlocks.DARK_BRICKS_STAIRS, "Escalier en briques sombres");
                provider.addBlock(InitBuildingBlocks.DARK_BRICKS_WALL, "Muret en briques sombres");
                provider.addBlock(InitBuildingBlocks.DARK_BRICKS_PRESSURE_PLATE, "Plaque de pression en briques sombres");

                provider.addBlock(InitBuildingBlocks.DARK_LARGE_BRICKS, "Briques épaisses sombres");
                provider.addBlock(InitBuildingBlocks.DARK_LARGE_BRICKS_SLAB, "Dalle en briques épaisses sombres");
                provider.addBlock(InitBuildingBlocks.DARK_LARGE_BRICKS_STAIRS, "Escalier en briques épaisses sombres");
                provider.addBlock(InitBuildingBlocks.DARK_LARGE_BRICKS_WALL, "Muret en briques épaisses sombres");
                provider.addBlock(InitBuildingBlocks.DARK_LARGE_BRICKS_PRESSURE_PLATE, "Plaque de pression en briques épaisses sombres");

                provider.addBlock(InitBuildingBlocks.OLD_BRICKS, "Vieilles briques");
                provider.addBlock(InitBuildingBlocks.OLD_BRICKS_SLAB, "Dalle en vieilles briques");
                provider.addBlock(InitBuildingBlocks.OLD_BRICKS_STAIRS, "Escalier en vieilles briques");
                provider.addBlock(InitBuildingBlocks.OLD_BRICKS_WALL, "Muret en vieilles briques");
                provider.addBlock(InitBuildingBlocks.OLD_BRICKS_PRESSURE_PLATE, "Plaque de pression en vieilles briques");

                provider.addBlock(InitBuildingBlocks.OLD_LARGE_BRICKS, "Vieilles briques épaisses");
                provider.addBlock(InitBuildingBlocks.OLD_LARGE_BRICKS_SLAB, "Dalle en vieilles briques épaisses");
                provider.addBlock(InitBuildingBlocks.OLD_LARGE_BRICKS_STAIRS, "Escalier en vieilles briques épaisses");
                provider.addBlock(InitBuildingBlocks.OLD_LARGE_BRICKS_WALL, "Muret en vieilles briques épaisses");
                provider.addBlock(InitBuildingBlocks.OLD_LARGE_BRICKS_PRESSURE_PLATE, "Plaque de pression en vieilles briques épaisses");

                provider.addBlock(InitBuildingBlocks.WEARED_BRICKS, "Briques usées");
                provider.addBlock(InitBuildingBlocks.WEARED_BRICKS_SLAB, "Dalle en briques usées");
                provider.addBlock(InitBuildingBlocks.WEARED_BRICKS_STAIRS, "Escalier en briques usées");
                provider.addBlock(InitBuildingBlocks.WEARED_BRICKS_WALL, "Muret en briques usées");
                provider.addBlock(InitBuildingBlocks.WEARED_BRICKS_PRESSURE_PLATE, "Plaque de pression en briques usées");

                provider.addBlock(InitBuildingBlocks.WEARED_LARGE_BRICKS, "Briques épaisses usées");
                provider.addBlock(InitBuildingBlocks.WEARED_LARGE_BRICKS_SLAB, "Dalle en briques épaisses usées");
                provider.addBlock(InitBuildingBlocks.WEARED_LARGE_BRICKS_STAIRS, "Escalier en briques épaisses usées");
                provider.addBlock(InitBuildingBlocks.WEARED_LARGE_BRICKS_WALL, "Muret en briques épaisses usées");
                provider.addBlock(InitBuildingBlocks.WEARED_LARGE_BRICKS_PRESSURE_PLATE, "Plaque de pression en briques épaisses usées");

                // Pavings
                provider.addBlock(InitBuildingBlocks.CONCRETE_PAVING, "Pavés en béton");
                provider.addBlock(InitBuildingBlocks.CONCRETE_PAVING_SLAB, "Dalle en pavés de béton");
                provider.addBlock(InitBuildingBlocks.CONCRETE_PAVING_STAIRS, "Escaliers en pavés de béton");
                provider.addBlock(InitBuildingBlocks.CONCRETE_PAVING_WALL, "Muret en pavés de béton");
                provider.addBlock(InitBuildingBlocks.CONCRETE_PAVING_PRESSURE_PLATE, "Plaque de pression en pavés de béton");

                provider.addBlock(InitBuildingBlocks.DAMAGED_PAVING, "Pavés abîmés");
                provider.addBlock(InitBuildingBlocks.DAMAGED_PAVING_SLAB, "Dalle en pavés abîmés");
                provider.addBlock(InitBuildingBlocks.DAMAGED_PAVING_STAIRS, "Escaliers en pavés abîmés");
                provider.addBlock(InitBuildingBlocks.DAMAGED_PAVING_WALL, "Muret en pavés abîmés");
                provider.addBlock(InitBuildingBlocks.DAMAGED_PAVING_PRESSURE_PLATE, "Plaque de pression en pavés abîmés");

                provider.addBlock(InitBuildingBlocks.DARK_CONCRETE_PAVING, "Pavés en béton sombre");
                provider.addBlock(InitBuildingBlocks.DARK_CONCRETE_PAVING_SLAB, "Dalle en pavés de béton sombre");
                provider.addBlock(InitBuildingBlocks.DARK_CONCRETE_PAVING_STAIRS, "Escalier eb pavés de béton sombre");
                provider.addBlock(InitBuildingBlocks.DARK_CONCRETE_PAVING_WALL, "Muret en pavés de béton sombre");
                provider.addBlock(InitBuildingBlocks.DARK_CONCRETE_PAVING_PRESSURE_PLATE, "Plaque de pression en pavés de béton sombre");

                provider.addBlock(InitBuildingBlocks.MOIST_PAVING, "Pavés encrassés");
                provider.addBlock(InitBuildingBlocks.MOIST_PAVING_SLAB, "Dalle en pavés encrassés");
                provider.addBlock(InitBuildingBlocks.MOIST_PAVING_STAIRS, "Escalier en pavés encrassés");
                provider.addBlock(InitBuildingBlocks.MOIST_PAVING_WALL, "Muret en pavés encrassés");
                provider.addBlock(InitBuildingBlocks.MOIST_PAVING_PRESSURE_PLATE, "Plaque de pression en pavés encrassés");

                provider.addBlock(InitBuildingBlocks.POLISHED_PAVING, "Pavés polis");
                provider.addBlock(InitBuildingBlocks.POLISHED_PAVING_SLAB, "Dalle en pavés polis");
                provider.addBlock(InitBuildingBlocks.POLISHED_PAVING_STAIRS, "Escalier en pavés polis");
                provider.addBlock(InitBuildingBlocks.POLISHED_PAVING_WALL, "Muret en pavés polis");
                provider.addBlock(InitBuildingBlocks.POLISHED_PAVING_PRESSURE_PLATE, "Plaque de pression en pavés polis");

                provider.addBlock(InitBuildingBlocks.WHITE_CONCRETE_PAVING, "Pavés en béton clair");
                provider.addBlock(InitBuildingBlocks.WHITE_CONCRETE_PAVING_SLAB, "Dalle en pavés de béton clair");
                provider.addBlock(InitBuildingBlocks.WHITE_CONCRETE_PAVING_STAIRS, "Escaliers en pavés de béton clair");
                provider.addBlock(InitBuildingBlocks.WHITE_CONCRETE_PAVING_WALL, "Murets en pavés de béton clair");
                provider.addBlock(InitBuildingBlocks.WHITE_CONCRETE_PAVING_PRESSURE_PLATE, "Plaque de pression en pavés de béton clair");

                // Tiles
                for(int j = 0; j < Arrays.stream(DyeColor.values()).count(); j++)
                {
                    String color = DyeColor.byId(j).getSerializedName();
                    String check[] = color.split("_");
                    if(check.length > 1)
                        color = StringUtils.capitalise(check[0]) + " " + StringUtils.capitalise(check[1]);
                    else
                        color = StringUtils.capitalise(check[0]);

                    provider.addBlock(InitBuildingBlocks.TILES_BLOCKS.get(DyeColor.byId(j)), "Carrelage " + color);
                    provider.addBlock(InitBuildingBlocks.TILES_SLABS.get(DyeColor.byId(j)), "Dalle de carrelage " + color);
                    provider.addBlock(InitBuildingBlocks.TILES_STAIRS.get(DyeColor.byId(j)), "Escaliers en carrelage " + color);
                    provider.addBlock(InitBuildingBlocks.TILES_WALLS.get(DyeColor.byId(j)), "Muret en carrelage " + color);
                    provider.addBlock(InitBuildingBlocks.TILES_PRESSURE_PLATES.get(DyeColor.byId(j)), "Plaque de pression en carrelage " + color);
                }

                provider.addBlock(InitBuildingBlocks.CONCRETE_TILES, "Carrelage en béton");
                provider.addBlock(InitBuildingBlocks.CONCRETE_TILES_SLAB, "Dalle de carrelage en béton");
                provider.addBlock(InitBuildingBlocks.CONCRETE_TILES_STAIRS, "Escaliers en carrelage de béton");
                provider.addBlock(InitBuildingBlocks.CONCRETE_TILES_WALL, "Muret en carrelage de béton");
                provider.addBlock(InitBuildingBlocks.CONCRETE_TILES_PRESSURE_PLATE, "Plaque de pression en carrelage de béton");

                provider.addBlock(InitBuildingBlocks.SKYBLUE_TILES, "Carrelage bleu ciel");
                provider.addBlock(InitBuildingBlocks.SKYBLUE_TILES_SLAB, "Dalle en carrelage bleu ciel");
                provider.addBlock(InitBuildingBlocks.SKYBLUE_TILES_STAIRS, "Escalier en carrelage bleu ciel");
                provider.addBlock(InitBuildingBlocks.SKYBLUE_TILES_WALL, "Muret en carrelage bleu ciel");
                provider.addBlock(InitBuildingBlocks.SKYBLUE_TILES_PRESSURE_PLATE, "Plaque de pression en carrelage bleu ciel");

                provider.addBlock(InitBuildingBlocks.YELLOW_GREY_TILES, "Carrelage jaune-gris");
                provider.addBlock(InitBuildingBlocks.YELLOW_GREY_TILES_SLAB, "Dalle en carrelage jaune-gris");
                provider.addBlock(InitBuildingBlocks.YELLOW_GREY_TILES_STAIRS, "Escalier en carrelage jaune-gris");
                provider.addBlock(InitBuildingBlocks.YELLOW_GREY_TILES_WALL, "Muret en carrelage jaune-gris");
                provider.addBlock(InitBuildingBlocks.YELLOW_GREY_TILES_PRESSURE_PLATE, "Plaque de pression en carrelage jaune-gris");

                // Wallpapers
                provider.addBlock(InitBuildingBlocks.WHITE_BLUE_WALLPAPER, "Papier peint bleu et blanc");
                provider.addBlock(InitBuildingBlocks.WHITE_BLUE_WALLPAPER_SLAB, "Dalle de papier peint bleu et blanc");
                provider.addBlock(InitBuildingBlocks.WHITE_BLUE_WALLPAPER_STAIRS, "Escalier de papier peint bleu et blanc");
                provider.addBlock(InitBuildingBlocks.WHITE_BLUE_WALLPAPER_PLINTH, "Papier peint bleu et blanc avec plinthe");

                provider.addBlock(InitBuildingBlocks.BEIGE_FLOWER_WALLPAPER, "Papier peint beige avec motif fleur");
                provider.addBlock(InitBuildingBlocks.BEIGE_FLOWER_WALLPAPER_SLAB, "Dalle de papier peint beige avec motif fleur");
                provider.addBlock(InitBuildingBlocks.BEIGE_FLOWER_WALLPAPER_STAIRS, "Escalier de papier peint beige avec motif fleur");
                provider.addBlock(InitBuildingBlocks.BEIGE_FLOWER_WALLPAPER_PLINTH, "Papier peint beige avec motif fleur avec plinthe");

                provider.addBlock(InitBuildingBlocks.BEIGE_WALLPAPER, "Papier peint beige");
                provider.addBlock(InitBuildingBlocks.BEIGE_WALLPAPER_SLAB, "Dalle de papier peint beige");
                provider.addBlock(InitBuildingBlocks.BEIGE_WALLPAPER_STAIRS, "Escalier de papier peint beige");
                provider.addBlock(InitBuildingBlocks.BEIGE_WALLPAPER_PLINTH, "Papier peint beige avec plinthe");

                provider.addBlock(InitBuildingBlocks.PINK_WALLPAPER, "Papier peint rose");
                provider.addBlock(InitBuildingBlocks.PINK_WALLPAPER_SLAB, "Dalle de papier peint rose");
                provider.addBlock(InitBuildingBlocks.PINK_WALLPAPER_STAIRS, "Escalier de papier peint rose");
                provider.addBlock(InitBuildingBlocks.PINK_WALLPAPER_PLINTH, "Papier peint rose avec plinthe");

                provider.addBlock(InitBuildingBlocks.WHITE_GREEN_WALLPAPER, "Papier peint bleu et vert");
                provider.addBlock(InitBuildingBlocks.WHITE_GREEN_WALLPAPER_SLAB, "Dalle de papier peint bleu et vert");
                provider.addBlock(InitBuildingBlocks.WHITE_GREEN_WALLPAPER_STAIRS, "Escalier de papier peint bleu et vert");
                provider.addBlock(InitBuildingBlocks.WHITE_GREEN_WALLPAPER_PLINTH, "Papier peint bleu et vert avec plinthe");

                // Doors, suspended stairs
                for(int j = 0; j < Arrays.stream(McWoods.values()).count(); j++)
                {
                    name = McWoods.byId(j).getName("fr_fr");

                    provider.addBlock(InitBuildingBlocks.PLAIN_DOOR_BLOCKS.get(McWoods.byId(j)), "Porte massive en " + name);
                    provider.addBlock(InitBuildingBlocks.SUSPENDED_STAIRS_BLOCKS.get(McWoods.byId(j)), "Escaliers suspendus en " + name);
                    provider.addBlock(InitBuildingBlocks.LARGE_SUSPENDED_STAIRS_BLOCKS.get(McWoods.byId(j)), "Escaliers larges suspendus en " + name);
                }

                provider.add("itemGroup.embellishcraft_building_group", "EmbellishCraft - Construction");
                break;
        }
    }
}
