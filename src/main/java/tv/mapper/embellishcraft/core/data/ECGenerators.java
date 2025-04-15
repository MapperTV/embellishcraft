package tv.mapper.embellishcraft.core.data;

import java.util.List;
import java.util.concurrent.CompletableFuture;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.neoforged.neoforge.data.event.GatherDataEvent;
import tv.mapper.embellishcraft.building.block.InitBuildingBlocks;
import tv.mapper.embellishcraft.building.data.BuildingBlockModels;
import tv.mapper.embellishcraft.building.data.BuildingBlockStates;
import tv.mapper.embellishcraft.building.data.BuildingItemModels;
import tv.mapper.embellishcraft.building.data.BuildingLootTables;
import tv.mapper.embellishcraft.building.data.recipe.BuildingRecipes;
import tv.mapper.embellishcraft.building.data.recipe.BuildingStoneCutter;
import tv.mapper.embellishcraft.core.ECConstants;
import tv.mapper.embellishcraft.core.data.recipes.ECFurnaceFuels;
import tv.mapper.embellishcraft.core.data.recipes.ECRecipes;
import tv.mapper.embellishcraft.core.data.recipes.ECStonecutterRecipes;
import tv.mapper.embellishcraft.core.data.tags.ECBlockTags;
import tv.mapper.embellishcraft.core.data.tags.ECItemTags;
import tv.mapper.embellishcraft.furniture.block.InitFurnitureBlocks;
import tv.mapper.embellishcraft.furniture.data.FurnitureBlockModels;
import tv.mapper.embellishcraft.furniture.data.FurnitureBlockStates;
import tv.mapper.embellishcraft.furniture.data.FurnitureItemModels;
import tv.mapper.embellishcraft.furniture.data.FurnitureLootTables;
import tv.mapper.embellishcraft.furniture.data.FurnitureRecipes;
import tv.mapper.embellishcraft.industrial.block.InitIndustrialBlocks;
import tv.mapper.embellishcraft.industrial.data.IndustrialBlockModels;
import tv.mapper.embellishcraft.industrial.data.IndustrialBlockStates;
import tv.mapper.embellishcraft.industrial.data.IndustrialItemModels;
import tv.mapper.embellishcraft.industrial.data.IndustrialLootTables;
import tv.mapper.embellishcraft.industrial.data.IndustrialRecipes;
import tv.mapper.embellishcraft.lights.block.InitLightBlocks;
import tv.mapper.embellishcraft.lights.data.LightBlockModels;
import tv.mapper.embellishcraft.lights.data.LightBlockStates;
import tv.mapper.embellishcraft.lights.data.LightItemModels;
import tv.mapper.embellishcraft.lights.data.LightLootTables;
import tv.mapper.embellishcraft.lights.data.LightRecipes;
import tv.mapper.embellishcraft.rocks.block.InitRockBlocks;
import tv.mapper.embellishcraft.rocks.data.RockBlockModels;
import tv.mapper.embellishcraft.rocks.data.RockBlockStates;
import tv.mapper.embellishcraft.rocks.data.RockItemModels;
import tv.mapper.embellishcraft.rocks.data.RockLootTables;
import tv.mapper.embellishcraft.rocks.data.RockWorldgen;
import tv.mapper.embellishcraft.rocks.data.recipe.RockRecipes;
import tv.mapper.embellishcraft.rocks.data.recipe.RockStoneCutter;
import tv.mapper.mapperbase.api.data.loottable.BaseLootTableProvider.SubProviderEntry;
import tv.mapper.mapperbase.api.data.loottable.BaseLootTables;

public class ECGenerators
{
    public static void generate(GatherDataEvent event)
    {
        DataGenerator generator = event.getGenerator();
        PackOutput pack = generator.getPackOutput();
        CompletableFuture<HolderLookup.Provider> lookup = event.getLookupProvider();

        // Recipes
        generator.addProvider(event.includeServer(), new ECRecipes(pack, lookup, "EmbellishCraft Recipes")); // Generic recipes
        generator.addProvider(event.includeServer(), new BuildingRecipes(pack, lookup, "EmbellishCraft Building Recipes"));
        generator.addProvider(event.includeServer(), new FurnitureRecipes(pack, lookup, "EmbellishCraft Furniture Recipes"));
        generator.addProvider(event.includeServer(), new IndustrialRecipes(pack, lookup, "EmbellishCraft Industrial Recipes"));
        generator.addProvider(event.includeServer(), new LightRecipes(pack, lookup, "EmbellishCraft Light Recipes"));
        generator.addProvider(event.includeServer(), new RockRecipes(pack, lookup, "EmbellishCraft Rocks Recipes"));

        // Stonecutter
        generator.addProvider(event.includeServer(), new ECStonecutterRecipes(pack, lookup, "EmbellishCraft Stonecutter Recipes")); // Generic stonecutter recipes
        generator.addProvider(event.includeServer(), new BuildingStoneCutter(pack, lookup, "EmbellishCraft Building Stonecutter Recipes"));
        generator.addProvider(event.includeServer(), new RockStoneCutter(pack, lookup, "EmbellishCraft Rocks Stonecutter Recipes"));

        // Loot Tables
        generator.addProvider(true, new BaseLootTables(pack, List.of(new SubProviderEntry(provider -> new BuildingLootTables(provider, InitBuildingBlocks.BUILDING_BLOCK_REGISTRY), LootContextParamSets.BLOCK)), lookup, "EmbellishCraft Building Loot Tables", ECConstants.MODID));
        generator.addProvider(true, new BaseLootTables(pack, List.of(new SubProviderEntry(provider -> new FurnitureLootTables(provider, InitFurnitureBlocks.FURNITURE_BLOCK_REGISTRY), LootContextParamSets.BLOCK)), lookup, "EmbellishCraft Furniture Loot Tables", ECConstants.MODID));
        generator.addProvider(true, new BaseLootTables(pack, List.of(new SubProviderEntry(provider -> new IndustrialLootTables(provider, InitIndustrialBlocks.INDUSTRIAL_BLOCK_REGISTRY), LootContextParamSets.BLOCK)), lookup, "EmbellishCraft Industrial Loot Tables", ECConstants.MODID));
        generator.addProvider(true, new BaseLootTables(pack, List.of(new SubProviderEntry(provider -> new LightLootTables(provider, InitLightBlocks.LIGHT_BLOCK_REGISTRY), LootContextParamSets.BLOCK)), lookup, "EmbellishCraft Light Loot Tables", ECConstants.MODID));
        generator.addProvider(true, new BaseLootTables(pack, List.of(new SubProviderEntry(provider -> new RockLootTables(provider, InitRockBlocks.ROCK_BLOCK_REGISTRY), LootContextParamSets.BLOCK)), lookup, "EmbellishCraft Rocks Loot Tables", ECConstants.MODID));

        // Block States
        generator.addProvider(event.includeClient(), new ECBlockStates(pack, ECConstants.MODID, event.getExistingFileHelper(), "EmbellishCraft Blockstates")); // Generic blockstate methods
        generator.addProvider(event.includeClient(), new BuildingBlockStates(pack, ECConstants.MODID, event.getExistingFileHelper(), "EmbellishCraft Building Blockstates"));
        generator.addProvider(event.includeClient(), new FurnitureBlockStates(pack, ECConstants.MODID, event.getExistingFileHelper(), "EmbellishCraft Furniture Blockstates"));
        generator.addProvider(event.includeClient(), new IndustrialBlockStates(pack, ECConstants.MODID, event.getExistingFileHelper(), "EmbellishCraft Industrial Blockstates"));
        generator.addProvider(event.includeClient(), new LightBlockStates(pack, ECConstants.MODID, event.getExistingFileHelper(), "EmbellishCraft Light Blockstates"));
        generator.addProvider(event.includeClient(), new RockBlockStates(pack, ECConstants.MODID, event.getExistingFileHelper(), "EmbellishCraft Rocks Blockstates"));

        // Block Models
        generator.addProvider(event.includeClient(), new ECBlockModels(pack, ECConstants.MODID, event.getExistingFileHelper(), "EmbellishCraft Block Models")); // Generic block model methods
        generator.addProvider(event.includeClient(), new BuildingBlockModels(pack, ECConstants.MODID, event.getExistingFileHelper(), "EmbellishCraft Building Block Models"));
        generator.addProvider(event.includeClient(), new FurnitureBlockModels(pack, ECConstants.MODID, event.getExistingFileHelper(), "EmbellishCraft Furniture Block Models"));
        generator.addProvider(event.includeClient(), new IndustrialBlockModels(pack, ECConstants.MODID, event.getExistingFileHelper(), "EmbellishCraft Industrial Block Models"));
        generator.addProvider(event.includeClient(), new LightBlockModels(pack, ECConstants.MODID, event.getExistingFileHelper(), "EmbellishCraft Light Block Models"));
        generator.addProvider(event.includeClient(), new RockBlockModels(pack, ECConstants.MODID, event.getExistingFileHelper(), "EmbellishCraft Rocks Block Models"));

        // Item Models
        generator.addProvider(event.includeClient(), new ECItemModels(pack, ECConstants.MODID, event.getExistingFileHelper(), "EmbellishCraft Item Models")); // Generic item model methods
        generator.addProvider(event.includeClient(), new BuildingItemModels(pack, ECConstants.MODID, event.getExistingFileHelper(), "EmbellishCraft Building Item Models"));
        generator.addProvider(event.includeClient(), new FurnitureItemModels(pack, ECConstants.MODID, event.getExistingFileHelper(), "EmbellishCraft Furniture Item Models"));
        generator.addProvider(event.includeClient(), new IndustrialItemModels(pack, ECConstants.MODID, event.getExistingFileHelper(), "EmbellishCraft Industrial Item Models"));
        generator.addProvider(event.includeClient(), new LightItemModels(pack, ECConstants.MODID, event.getExistingFileHelper(), "EmbellishCraft Light Item Models"));
        generator.addProvider(event.includeClient(), new RockItemModels(pack, ECConstants.MODID, event.getExistingFileHelper(), "EmbellishCraft Rocks Item Models"));

        // Tags
        ECBlockTags blockTags = new ECBlockTags(pack, lookup, ECConstants.MODID, event.getExistingFileHelper());
        generator.addProvider(event.includeServer(), blockTags);
        generator.addProvider(true, new ECItemTags(generator, event.getLookupProvider(), blockTags.contentsGetter(), event.getExistingFileHelper()));

        // Lang
        generator.addProvider(event.includeClient(), new ECLang(pack, ECConstants.MODID, "en_us", "EmbellishCraft Lang US"));
        generator.addProvider(event.includeClient(), new ECLang(pack, ECConstants.MODID, "fr_fr", "EmbellishCraft Lang FR"));

        // Worldgen
        RockWorldgen.initOres();
        generator.addProvider(event.includeServer(), new RockWorldgen(pack, event.getLookupProvider(), ECConstants.MODID, "EmbellishCraft Rock Worldgen"));

        // Furnace Fuels
        generator.addProvider(event.includeServer(), new ECFurnaceFuels(pack, lookup));
    }
}