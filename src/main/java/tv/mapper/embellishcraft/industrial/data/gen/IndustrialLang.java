package tv.mapper.embellishcraft.industrial.data.gen;

import java.util.Arrays;

import org.codehaus.plexus.util.StringUtils;

import net.minecraft.world.item.DyeColor;
import tv.mapper.embellishcraft.data.gen.ECLang;
import tv.mapper.embellishcraft.industrial.world.level.blocks.InitIndustrialBlocks;

public class IndustrialLang
{
    public static void addTranslations(ECLang provider, String lang)

    {
        switch(lang)
        {
            default:
            case "en_us":
                for(int j = 0; j < Arrays.stream(DyeColor.values()).count(); j++)
                {
                    String color = DyeColor.byId(j).getSerializedName();
                    String check[] = color.split("_");
                    if(check.length > 1)
                        color = StringUtils.capitalise(check[0]) + " " + StringUtils.capitalise(check[1]);
                    else
                        color = StringUtils.capitalise(check[0]);

                    provider.addBlock(InitIndustrialBlocks.CORRUGATED_METAL_PLATE_BLOCKS.get(DyeColor.byId(j)), color + " Corrugated Metal Plate");
                    provider.addBlock(InitIndustrialBlocks.CORRUGATED_METAL_PLATE_SLABS.get(DyeColor.byId(j)), color + " Corrugated Metal Plate Slab");
                    provider.addBlock(InitIndustrialBlocks.CORRUGATED_METAL_PLATE_STAIRS.get(DyeColor.byId(j)), color + " Corrugated Metal Plate Stairs");
                    provider.addBlock(InitIndustrialBlocks.CORRUGATED_METAL_PLATE_WALLS.get(DyeColor.byId(j)), color + " Corrugated Metal Plate Wall");
                    provider.addBlock(InitIndustrialBlocks.CORRUGATED_METAL_PLATE_PRESSURE_PLATES.get(DyeColor.byId(j)), color + " Corrugated Metal Plate Pressure Plate");
                    provider.addBlock(InitIndustrialBlocks.CORRUGATED_METAL_PLATE_FENCES.get(DyeColor.byId(j)), color + " Corrugated Metal Plate Fence");
                    provider.addBlock(InitIndustrialBlocks.CORRUGATED_METAL_PLATE_FENCE_GATES.get(DyeColor.byId(j)), color + " Corrugated Metal Plate Fence Gate");
                }

                provider.addBlock(InitIndustrialBlocks.DARK_METAL_FLOOR, "Dark Metal Floor");
                provider.addBlock(InitIndustrialBlocks.DARK_METAL_FLOOR_SLAB, "Dark Metal Slab");
                provider.addBlock(InitIndustrialBlocks.DARK_METAL_FLOOR_STAIRS, "Dark Metal Stairs");
                provider.addBlock(InitIndustrialBlocks.DARK_METAL_FLOOR_WALL, "Dark Metal Wall");
                provider.addBlock(InitIndustrialBlocks.DARK_METAL_FLOOR_PRESSURE_PLATE, "Dark Metal Pressure Plate");

                provider.addBlock(InitIndustrialBlocks.LIGHT_METAL_FLOOR, "Light Metal Floor");
                provider.addBlock(InitIndustrialBlocks.LIGHT_METAL_FLOOR_SLAB, "Light Metal Slab");
                provider.addBlock(InitIndustrialBlocks.LIGHT_METAL_FLOOR_STAIRS, "Light Metal Stairs");
                provider.addBlock(InitIndustrialBlocks.LIGHT_METAL_FLOOR_WALL, "Light Metal Wall");
                provider.addBlock(InitIndustrialBlocks.LIGHT_METAL_FLOOR_PRESSURE_PLATE, "Light Metal Pressure Plate");

                provider.addBlock(InitIndustrialBlocks.RUSTY_PLATE, "Rusty Plate");
                provider.addBlock(InitIndustrialBlocks.RUSTY_PLATE_SLAB, "Rusty Plate Slab");
                provider.addBlock(InitIndustrialBlocks.RUSTY_PLATE_STAIRS, "Rusty Plate Stairs");
                provider.addBlock(InitIndustrialBlocks.RUSTY_PLATE_WALL, "Rusty Plate Wall");
                provider.addBlock(InitIndustrialBlocks.RUSTY_PLATE_PRESSURE_PLATE, "Rusty Plate Pressure Plate");

                provider.addBlock(InitIndustrialBlocks.IRON_BEAM, "Iron Beam");
                provider.addBlock(InitIndustrialBlocks.BOLTED_IRON_BEAM, "Bolted Iron Beam");
                provider.addBlock(InitIndustrialBlocks.IRON_BEAM_JUNCTION, "Iron Beam Junction");
                provider.addBlock(InitIndustrialBlocks.STEEL_BEAM, "Steel Beam");
                provider.addBlock(InitIndustrialBlocks.BOLTED_STEEL_BEAM, "Bolted Steel Beam");
                provider.addBlock(InitIndustrialBlocks.STEEL_BEAM_JUNCTION, "Steel Beam Junction");

                provider.addBlock(InitIndustrialBlocks.AIR_DUCT, "Air duct");
                provider.addBlock(InitIndustrialBlocks.VENT_AIR_DUCT, "Vent Air duct");
                provider.addBlock(InitIndustrialBlocks.GRID_AIR_DUCT, "Grid Air duct");

                provider.addBlock(InitIndustrialBlocks.BULKHEAD, "Bulkhead");
                provider.addBlock(InitIndustrialBlocks.BULKHEAD_TOP, "Bulkhead Top");

                provider.addBlock(InitIndustrialBlocks.STEEL_WALL_LADDER, "Steel Wall Ladder");
                provider.addBlock(InitIndustrialBlocks.RUSTY_WALL_LADDER, "Rusty Wall Ladder");
                provider.addBlock(InitIndustrialBlocks.STEEL_RUNGS, "Steel Rungs");
                provider.addBlock(InitIndustrialBlocks.RUSTY_RUNGS, "Rusty Rungs");

                provider.addBlock(InitIndustrialBlocks.STEEL_SUSPENDED_STAIRS, "Steel Suspended Stairs");
                provider.addBlock(InitIndustrialBlocks.RUSTY_SUSPENDED_STAIRS, "Rusty Suspended Stairs");
                provider.addBlock(InitIndustrialBlocks.STEEL_LARGE_SUSPENDED_STAIRS, "Steel Large Suspended Stairs");
                provider.addBlock(InitIndustrialBlocks.RUSTY_LARGE_SUSPENDED_STAIRS, "Rusty Large Suspended Stairs");

                provider.addBlock(InitIndustrialBlocks.STEEL_DOOR, "Steel Door");
                provider.addBlock(InitIndustrialBlocks.STURDY_STEEL_DOOR, "Sturdy Steel Door");
                provider.addBlock(InitIndustrialBlocks.WARNING_STEEL_DOOR, "Warning Steel Door");
                provider.addBlock(InitIndustrialBlocks.WHITE_STEEL_DOOR, "White Steel Door");
                provider.addBlock(InitIndustrialBlocks.STURDY_WHITE_STEEL_DOOR, "Sturdy White Steel Door");
                provider.addBlock(InitIndustrialBlocks.WARNING_WHITE_STEEL_DOOR, "Warning White Steel Door");
                provider.addBlock(InitIndustrialBlocks.RUSTY_DOOR, "Rusty Door");
                provider.addBlock(InitIndustrialBlocks.STURDY_RUSTY_DOOR, "Sturdy Rusty Door");
                provider.addBlock(InitIndustrialBlocks.WARNING_RUSTY_DOOR, "Warning Rusty Door");

                provider.add("itemGroup.embellishcraft_industrial_group", "EmbellishCraft - Industrial");

                break;
            case "fr_fr":
                String frColorsF[] = {"blanche", "orange", "magenta", "bleu claire", "jaune", "vert claire", "rose", "grise", "gris claire", "cyan", "violette", "bleue", "marron", "verte", "rouge", "noire"};

                for(int j = 0; j < Arrays.stream(DyeColor.values()).count(); j++)
                {
                    provider.addBlock(InitIndustrialBlocks.CORRUGATED_METAL_PLATE_BLOCKS.get(DyeColor.byId(j)), "Tôle ondulée " + frColorsF[j]);
                    provider.addBlock(InitIndustrialBlocks.CORRUGATED_METAL_PLATE_SLABS.get(DyeColor.byId(j)), "Dalle en tôle ondulée " + frColorsF[j]);
                    provider.addBlock(InitIndustrialBlocks.CORRUGATED_METAL_PLATE_STAIRS.get(DyeColor.byId(j)), "Escalier en tôle ondulée " + frColorsF[j]);
                    provider.addBlock(InitIndustrialBlocks.CORRUGATED_METAL_PLATE_WALLS.get(DyeColor.byId(j)), "Muret en tôle ondulée " + frColorsF[j]);
                    provider.addBlock(InitIndustrialBlocks.CORRUGATED_METAL_PLATE_PRESSURE_PLATES.get(DyeColor.byId(j)), "Plaque de pression en tôle ondulée " + frColorsF[j]);
                    provider.addBlock(InitIndustrialBlocks.CORRUGATED_METAL_PLATE_FENCES.get(DyeColor.byId(j)), "Barrière en tôle ondulée " + frColorsF[j]);
                    provider.addBlock(InitIndustrialBlocks.CORRUGATED_METAL_PLATE_FENCE_GATES.get(DyeColor.byId(j)), "Portillon en tôle ondulée " + frColorsF[j]);
                }

                provider.addBlock(InitIndustrialBlocks.DARK_METAL_FLOOR, "Sol en métal foncé");
                provider.addBlock(InitIndustrialBlocks.DARK_METAL_FLOOR_SLAB, "Dalle en métal foncé");
                provider.addBlock(InitIndustrialBlocks.DARK_METAL_FLOOR_STAIRS, "Escalier en métal foncé");
                provider.addBlock(InitIndustrialBlocks.DARK_METAL_FLOOR_WALL, "Muret en métal foncé");
                provider.addBlock(InitIndustrialBlocks.DARK_METAL_FLOOR_PRESSURE_PLATE, "Plaque de pression en métal foncé");

                provider.addBlock(InitIndustrialBlocks.LIGHT_METAL_FLOOR, "Sol en métal clair");
                provider.addBlock(InitIndustrialBlocks.LIGHT_METAL_FLOOR_SLAB, "Dalle en métal clair");
                provider.addBlock(InitIndustrialBlocks.LIGHT_METAL_FLOOR_STAIRS, "Escalier en métal clair");
                provider.addBlock(InitIndustrialBlocks.LIGHT_METAL_FLOOR_WALL, "Muret en métal clair");
                provider.addBlock(InitIndustrialBlocks.LIGHT_METAL_FLOOR_PRESSURE_PLATE, "Plaque de pression en métal clair");

                provider.addBlock(InitIndustrialBlocks.RUSTY_PLATE, "Plaque rouillée");
                provider.addBlock(InitIndustrialBlocks.RUSTY_PLATE_SLAB, "Dalle en plaque rouillée");
                provider.addBlock(InitIndustrialBlocks.RUSTY_PLATE_STAIRS, "Escalier en plaque rouillée");
                provider.addBlock(InitIndustrialBlocks.RUSTY_PLATE_WALL, "Muret en plaque rouillée");
                provider.addBlock(InitIndustrialBlocks.RUSTY_PLATE_PRESSURE_PLATE, "Plaque de pression en plaque rouillée");

                provider.addBlock(InitIndustrialBlocks.IRON_BEAM, "Poutrelle en fer");
                provider.addBlock(InitIndustrialBlocks.BOLTED_IRON_BEAM, "Poutrelle rivetée en fer");
                provider.addBlock(InitIndustrialBlocks.IRON_BEAM_JUNCTION, "Jonction de poutrelle en fer");
                provider.addBlock(InitIndustrialBlocks.STEEL_BEAM, "Poutrelle en acier");
                provider.addBlock(InitIndustrialBlocks.BOLTED_STEEL_BEAM, "Poutrelle rivetée en acier");
                provider.addBlock(InitIndustrialBlocks.STEEL_BEAM_JUNCTION, "Jonction de poutrelle en acier");

                provider.addBlock(InitIndustrialBlocks.AIR_DUCT, "Conduit d'aération");
                provider.addBlock(InitIndustrialBlocks.VENT_AIR_DUCT, "Conduit d'aération avec ventilation");
                provider.addBlock(InitIndustrialBlocks.GRID_AIR_DUCT, "Conduit d'aération avec grille");

                provider.addBlock(InitIndustrialBlocks.BULKHEAD, "Batardeau");
                provider.addBlock(InitIndustrialBlocks.BULKHEAD_TOP, "Sommet de batardeau");

                provider.addBlock(InitIndustrialBlocks.STEEL_WALL_LADDER, "Échelle murale en acier");
                provider.addBlock(InitIndustrialBlocks.RUSTY_WALL_LADDER, "Échelle murale rouillée");
                provider.addBlock(InitIndustrialBlocks.STEEL_RUNGS, "Échelons en acier");
                provider.addBlock(InitIndustrialBlocks.RUSTY_RUNGS, "Échelons rouillés");

                provider.addBlock(InitIndustrialBlocks.STEEL_SUSPENDED_STAIRS, "Escaliers suspendus en acier");
                provider.addBlock(InitIndustrialBlocks.RUSTY_SUSPENDED_STAIRS, "Escaliers suspendus rouillés");
                provider.addBlock(InitIndustrialBlocks.STEEL_LARGE_SUSPENDED_STAIRS, "Escaliers larges suspendus en acier");
                provider.addBlock(InitIndustrialBlocks.RUSTY_LARGE_SUSPENDED_STAIRS, "Escaliers larges suspendus rouillés");

                provider.addBlock(InitIndustrialBlocks.STEEL_DOOR, "Porte en acier");
                provider.addBlock(InitIndustrialBlocks.STURDY_STEEL_DOOR, "Porte renforcée en acier");
                provider.addBlock(InitIndustrialBlocks.WARNING_STEEL_DOOR, "Porte en acier avec avertissement");
                provider.addBlock(InitIndustrialBlocks.WHITE_STEEL_DOOR, "Porte blanche en acier");
                provider.addBlock(InitIndustrialBlocks.STURDY_WHITE_STEEL_DOOR, "Porte renforcée blanche en acier");
                provider.addBlock(InitIndustrialBlocks.WARNING_WHITE_STEEL_DOOR, "Porte blanche en acier avec avertissement");
                provider.addBlock(InitIndustrialBlocks.RUSTY_DOOR, "Porte rouillée");
                provider.addBlock(InitIndustrialBlocks.STURDY_RUSTY_DOOR, "Porte renforcée rouillée");
                provider.addBlock(InitIndustrialBlocks.WARNING_RUSTY_DOOR, "Porte renforcée rouillée avec avertissement");

                provider.add("itemGroup.embellishcraft_industrial_group", "EmbellishCraft - Industriel");

                break;
        }
    }
}