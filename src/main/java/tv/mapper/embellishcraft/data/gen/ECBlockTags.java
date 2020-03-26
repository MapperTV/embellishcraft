package tv.mapper.embellishcraft.data.gen;

import java.util.Arrays;

import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraft.item.DyeColor;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import tv.mapper.embellishcraft.block.ECBlockRegistry;
import tv.mapper.embellishcraft.data.ECTags;
import tv.mapper.embellishcraft.util.McWoods;
import tv.mapper.embellishcraft.util.RockType;
import tv.mapper.mapperbase.data.BaseTags;

public class ECBlockTags extends BlockTagsProvider
{

    public ECBlockTags(DataGenerator generatorIn)
    {
        super(generatorIn);
    }

    public void registerTags()
    {
        for(int j = 0; j < Arrays.stream(RockType.values()).count(); j++)
        {
            // Rocks
            this.getBuilder(Tags.Blocks.STONE).add(ECBlockRegistry.ROCK_BLOCKS.get(RockType.byId(j)).get());
            this.getBuilder(BlockTags.STAIRS).add(ECBlockRegistry.ROCK_STAIRS.get(RockType.byId(j)).get());
            this.getBuilder(BlockTags.SLABS).add(ECBlockRegistry.ROCK_SLABS.get(RockType.byId(j)).get());
            this.getBuilder(BlockTags.WALLS).add(ECBlockRegistry.ROCK_WALLS.get(RockType.byId(j)).get());
            this.getBuilder(BaseTags.ForgeBlocks.PRESSURE_PLATES).add(ECBlockRegistry.ROCK_PRESSURE_PLATES.get(RockType.byId(j)).get());
            this.getBuilder(BlockTags.BUTTONS).add(ECBlockRegistry.ROCK_BUTTONS.get(RockType.byId(j)).get());

            // Cobblestones
            this.getBuilder(Tags.Blocks.COBBLESTONE).add(ECBlockRegistry.ROCK_COBBLESTONES.get(RockType.byId(j)).get());
            this.getBuilder(BlockTags.STAIRS).add(ECBlockRegistry.ROCK_COBBLESTONE_STAIRS.get(RockType.byId(j)).get());
            this.getBuilder(BlockTags.SLABS).add(ECBlockRegistry.ROCK_COBBLESTONE_SLABS.get(RockType.byId(j)).get());
            this.getBuilder(BlockTags.WALLS).add(ECBlockRegistry.ROCK_COBBLESTONE_WALLS.get(RockType.byId(j)).get());
            this.getBuilder(BaseTags.ForgeBlocks.PRESSURE_PLATES).add(ECBlockRegistry.ROCK_COBBLESTONE_PRESSURE_PLATES.get(RockType.byId(j)).get());

            // Smooth rocks
            // this.getBuilder(Tags.Blocks.STONE).add(ECBlockRegistry.SMOOTH_ROCK_BLOCKS.get(RockType.byId(j)).get());
            this.getBuilder(BlockTags.STAIRS).add(ECBlockRegistry.SMOOTH_ROCK_STAIRS.get(RockType.byId(j)).get());
            this.getBuilder(BlockTags.SLABS).add(ECBlockRegistry.SMOOTH_ROCK_SLABS.get(RockType.byId(j)).get());
            this.getBuilder(BlockTags.WALLS).add(ECBlockRegistry.SMOOTH_ROCK_WALLS.get(RockType.byId(j)).get());
            this.getBuilder(BaseTags.ForgeBlocks.PRESSURE_PLATES).add(ECBlockRegistry.SMOOTH_ROCK_PRESSURE_PLATES.get(RockType.byId(j)).get());

            // Polished rocks
            // this.getBuilder(Tags.Blocks.STONE).add(ECBlockRegistry.POLISHED_ROCK_BLOCKS.get(RockType.byId(j)).get());
            this.getBuilder(BlockTags.STAIRS).add(ECBlockRegistry.POLISHED_ROCK_STAIRS.get(RockType.byId(j)).get());
            this.getBuilder(BlockTags.SLABS).add(ECBlockRegistry.POLISHED_ROCK_SLABS.get(RockType.byId(j)).get());
            this.getBuilder(BlockTags.WALLS).add(ECBlockRegistry.POLISHED_ROCK_WALLS.get(RockType.byId(j)).get());
            this.getBuilder(BaseTags.ForgeBlocks.PRESSURE_PLATES).add(ECBlockRegistry.POLISHED_ROCK_PRESSURE_PLATES.get(RockType.byId(j)).get());

            // Rocks pavings
            // this.getBuilder(Tags.Blocks.STONE).add(ECBlockRegistry.ROCK_PAVINGS.get(RockType.byId(j)).get());
            this.getBuilder(BlockTags.STAIRS).add(ECBlockRegistry.ROCK_PAVING_STAIRS.get(RockType.byId(j)).get());
            this.getBuilder(BlockTags.SLABS).add(ECBlockRegistry.ROCK_PAVING_SLABS.get(RockType.byId(j)).get());
            this.getBuilder(BlockTags.WALLS).add(ECBlockRegistry.ROCK_PAVING_WALLS.get(RockType.byId(j)).get());
            this.getBuilder(BaseTags.ForgeBlocks.PRESSURE_PLATES).add(ECBlockRegistry.ROCK_PAVING_PRESSURE_PLATES.get(RockType.byId(j)).get());

            // Rocks tiles
            // this.getBuilder(Tags.Blocks.STONE).add(ECBlockRegistry.ROCK_TILES.get(RockType.byId(j)).get());
            this.getBuilder(BlockTags.STAIRS).add(ECBlockRegistry.ROCK_TILES_STAIRS.get(RockType.byId(j)).get());
            this.getBuilder(BlockTags.SLABS).add(ECBlockRegistry.ROCK_TILES_SLABS.get(RockType.byId(j)).get());
            this.getBuilder(BlockTags.WALLS).add(ECBlockRegistry.ROCK_TILES_WALLS.get(RockType.byId(j)).get());
            this.getBuilder(BaseTags.ForgeBlocks.PRESSURE_PLATES).add(ECBlockRegistry.ROCK_TILES_PRESSURE_PLATES.get(RockType.byId(j)).get());

            // Rocks bricks
            // this.getBuilder(Tags.Blocks.STONE).add(ECBlockRegistry.ROCK_BRICKS.get(RockType.byId(j)).get());
            this.getBuilder(BlockTags.STAIRS).add(ECBlockRegistry.ROCK_BRICKS_STAIRS.get(RockType.byId(j)).get());
            this.getBuilder(BlockTags.SLABS).add(ECBlockRegistry.ROCK_BRICKS_SLABS.get(RockType.byId(j)).get());
            this.getBuilder(BlockTags.WALLS).add(ECBlockRegistry.ROCK_BRICKS_WALLS.get(RockType.byId(j)).get());
            this.getBuilder(BaseTags.ForgeBlocks.PRESSURE_PLATES).add(ECBlockRegistry.ROCK_BRICKS_PRESSURE_PLATES.get(RockType.byId(j)).get());

            // Rocks large bricks
            // this.getBuilder(Tags.Blocks.STONE).add(ECBlockRegistry.ROCK_LARGE_BRICKS.get(RockType.byId(j)).get());
            this.getBuilder(BlockTags.STAIRS).add(ECBlockRegistry.ROCK_LARGE_BRICKS_STAIRS.get(RockType.byId(j)).get());
            this.getBuilder(BlockTags.SLABS).add(ECBlockRegistry.ROCK_LARGE_BRICKS_SLABS.get(RockType.byId(j)).get());
            this.getBuilder(BlockTags.WALLS).add(ECBlockRegistry.ROCK_LARGE_BRICKS_WALLS.get(RockType.byId(j)).get());
            this.getBuilder(BaseTags.ForgeBlocks.PRESSURE_PLATES).add(ECBlockRegistry.ROCK_LARGE_BRICKS_PRESSURE_PLATES.get(RockType.byId(j)).get());

            // Rocks ornaments
            // this.getBuilder(Tags.Blocks.STONE).add(ECBlockRegistry.ROCK_ORNAMENTS.get(RockType.byId(j)).get());
            this.getBuilder(BaseTags.ForgeBlocks.PRESSURE_PLATES).add(ECBlockRegistry.ROCK_ORNAMENT_PRESSURE_PLATES.get(RockType.byId(j)).get());
        }

        this.getBuilder(BlockTags.BUTTONS).add(ECBlockRegistry.ANDESITE_BUTTON.get(), ECBlockRegistry.GRANITE_BUTTON.get(), ECBlockRegistry.DIORITE_BUTTON.get(), ECBlockRegistry.SANDSTONE_BUTTON.get(),
            ECBlockRegistry.RED_SANDSTONE_BUTTON.get(), ECBlockRegistry.TERRACOTTA_BUTTON.get());

        // Andesite
        this.getBuilder(BlockTags.STAIRS).add(ECBlockRegistry.SMOOTH_ANDESITE_STAIRS.get(), ECBlockRegistry.ANDESITE_PAVING_STAIRS.get(), ECBlockRegistry.ANDESITE_TILES_STAIRS.get(),
            ECBlockRegistry.ANDESITE_BRICKS_STAIRS.get(), ECBlockRegistry.ANDESITE_LARGE_BRICKS_STAIRS.get());
        this.getBuilder(BlockTags.SLABS).add(ECBlockRegistry.SMOOTH_ANDESITE_SLAB.get(), ECBlockRegistry.ANDESITE_PAVING_SLAB.get(), ECBlockRegistry.ANDESITE_TILES_SLAB.get(),
            ECBlockRegistry.ANDESITE_BRICKS_SLAB.get(), ECBlockRegistry.ANDESITE_LARGE_BRICKS_SLAB.get());
        this.getBuilder(BlockTags.WALLS).add(ECBlockRegistry.SMOOTH_ANDESITE_WALL.get(), ECBlockRegistry.ANDESITE_PAVING_WALL.get(), ECBlockRegistry.ANDESITE_TILES_WALL.get(),
            ECBlockRegistry.ANDESITE_BRICKS_WALL.get(), ECBlockRegistry.ANDESITE_LARGE_BRICKS_WALL.get());
        this.getBuilder(BaseTags.ForgeBlocks.PRESSURE_PLATES).add(ECBlockRegistry.SMOOTH_ANDESITE_PRESSURE_PLATE.get(), ECBlockRegistry.ANDESITE_PAVING_PRESSURE_PLATE.get(),
            ECBlockRegistry.ANDESITE_TILES_PRESSURE_PLATE.get(), ECBlockRegistry.ANDESITE_BRICKS_PRESSURE_PLATE.get(), ECBlockRegistry.ANDESITE_LARGE_BRICKS_PRESSURE_PLATE.get(),
            ECBlockRegistry.ANDESITE_ORNAMENT_PRESSURE_PLATE.get());

        // Diorite
        this.getBuilder(BlockTags.STAIRS).add(ECBlockRegistry.SMOOTH_DIORITE_STAIRS.get(), ECBlockRegistry.DIORITE_PAVING_STAIRS.get(), ECBlockRegistry.DIORITE_TILES_STAIRS.get(),
            ECBlockRegistry.DIORITE_BRICKS_STAIRS.get(), ECBlockRegistry.DIORITE_LARGE_BRICKS_STAIRS.get());
        this.getBuilder(BlockTags.SLABS).add(ECBlockRegistry.SMOOTH_DIORITE_SLAB.get(), ECBlockRegistry.DIORITE_PAVING_SLAB.get(), ECBlockRegistry.DIORITE_TILES_SLAB.get(),
            ECBlockRegistry.DIORITE_BRICKS_SLAB.get(), ECBlockRegistry.DIORITE_LARGE_BRICKS_SLAB.get());
        this.getBuilder(BlockTags.WALLS).add(ECBlockRegistry.SMOOTH_DIORITE_WALL.get(), ECBlockRegistry.DIORITE_PAVING_WALL.get(), ECBlockRegistry.DIORITE_TILES_WALL.get(),
            ECBlockRegistry.DIORITE_BRICKS_WALL.get(), ECBlockRegistry.DIORITE_LARGE_BRICKS_WALL.get());
        this.getBuilder(BaseTags.ForgeBlocks.PRESSURE_PLATES).add(ECBlockRegistry.SMOOTH_DIORITE_PRESSURE_PLATE.get(), ECBlockRegistry.DIORITE_PAVING_PRESSURE_PLATE.get(),
            ECBlockRegistry.DIORITE_TILES_PRESSURE_PLATE.get(), ECBlockRegistry.DIORITE_BRICKS_PRESSURE_PLATE.get(), ECBlockRegistry.DIORITE_LARGE_BRICKS_PRESSURE_PLATE.get(),
            ECBlockRegistry.DIORITE_ORNAMENT_PRESSURE_PLATE.get());

        // Granite
        this.getBuilder(BlockTags.STAIRS).add(ECBlockRegistry.SMOOTH_GRANITE_STAIRS.get(), ECBlockRegistry.GRANITE_PAVING_STAIRS.get(), ECBlockRegistry.GRANITE_TILES_STAIRS.get(),
            ECBlockRegistry.GRANITE_BRICKS_STAIRS.get(), ECBlockRegistry.GRANITE_LARGE_BRICKS_STAIRS.get());
        this.getBuilder(BlockTags.SLABS).add(ECBlockRegistry.SMOOTH_GRANITE_SLAB.get(), ECBlockRegistry.GRANITE_PAVING_SLAB.get(), ECBlockRegistry.GRANITE_TILES_SLAB.get(),
            ECBlockRegistry.GRANITE_BRICKS_SLAB.get(), ECBlockRegistry.GRANITE_LARGE_BRICKS_SLAB.get());
        this.getBuilder(BlockTags.WALLS).add(ECBlockRegistry.SMOOTH_GRANITE_WALL.get(), ECBlockRegistry.GRANITE_PAVING_WALL.get(), ECBlockRegistry.GRANITE_TILES_WALL.get(),
            ECBlockRegistry.GRANITE_BRICKS_WALL.get(), ECBlockRegistry.GRANITE_LARGE_BRICKS_WALL.get());
        this.getBuilder(BaseTags.ForgeBlocks.PRESSURE_PLATES).add(ECBlockRegistry.SMOOTH_GRANITE_PRESSURE_PLATE.get(), ECBlockRegistry.GRANITE_PAVING_PRESSURE_PLATE.get(),
            ECBlockRegistry.GRANITE_TILES_PRESSURE_PLATE.get(), ECBlockRegistry.GRANITE_BRICKS_PRESSURE_PLATE.get(), ECBlockRegistry.GRANITE_LARGE_BRICKS_PRESSURE_PLATE.get(),
            ECBlockRegistry.GRANITE_ORNAMENT_PRESSURE_PLATE.get());

        // Sandstone
        this.getBuilder(BlockTags.STAIRS).add(ECBlockRegistry.POLISHED_SANDSTONE_STAIRS.get(), ECBlockRegistry.SANDSTONE_PAVING_STAIRS.get(), ECBlockRegistry.SANDSTONE_TILES_STAIRS.get(),
            ECBlockRegistry.SANDSTONE_BRICKS_STAIRS.get(), ECBlockRegistry.SANDSTONE_LARGE_BRICKS_STAIRS.get());
        this.getBuilder(BlockTags.SLABS).add(ECBlockRegistry.POLISHED_SANDSTONE_SLAB.get(), ECBlockRegistry.SANDSTONE_PAVING_SLAB.get(), ECBlockRegistry.SANDSTONE_TILES_SLAB.get(),
            ECBlockRegistry.SANDSTONE_BRICKS_SLAB.get(), ECBlockRegistry.SANDSTONE_LARGE_BRICKS_SLAB.get());
        this.getBuilder(BlockTags.WALLS).add(ECBlockRegistry.SMOOTH_SANDSTONE_WALL.get(), ECBlockRegistry.POLISHED_SANDSTONE_WALL.get(), ECBlockRegistry.SANDSTONE_PAVING_WALL.get(),
            ECBlockRegistry.SANDSTONE_TILES_WALL.get(), ECBlockRegistry.SANDSTONE_BRICKS_WALL.get(), ECBlockRegistry.SANDSTONE_LARGE_BRICKS_WALL.get());
        this.getBuilder(BaseTags.ForgeBlocks.PRESSURE_PLATES).add(ECBlockRegistry.SMOOTH_SANDSTONE_PRESSURE_PLATE.get(), ECBlockRegistry.POLISHED_SANDSTONE_PRESSURE_PLATE.get(),
            ECBlockRegistry.SANDSTONE_PAVING_PRESSURE_PLATE.get(), ECBlockRegistry.SANDSTONE_TILES_PRESSURE_PLATE.get(), ECBlockRegistry.SANDSTONE_BRICKS_PRESSURE_PLATE.get(),
            ECBlockRegistry.SANDSTONE_LARGE_BRICKS_PRESSURE_PLATE.get());

        // Red Sandstone
        this.getBuilder(BlockTags.STAIRS).add(ECBlockRegistry.POLISHED_RED_SANDSTONE_STAIRS.get(), ECBlockRegistry.RED_SANDSTONE_PAVING_STAIRS.get(), ECBlockRegistry.RED_SANDSTONE_TILES_STAIRS.get(),
            ECBlockRegistry.RED_SANDSTONE_BRICKS_STAIRS.get(), ECBlockRegistry.RED_SANDSTONE_LARGE_BRICKS_STAIRS.get());
        this.getBuilder(BlockTags.SLABS).add(ECBlockRegistry.POLISHED_RED_SANDSTONE_SLAB.get(), ECBlockRegistry.RED_SANDSTONE_PAVING_SLAB.get(), ECBlockRegistry.RED_SANDSTONE_TILES_SLAB.get(),
            ECBlockRegistry.RED_SANDSTONE_BRICKS_SLAB.get(), ECBlockRegistry.RED_SANDSTONE_LARGE_BRICKS_SLAB.get());
        this.getBuilder(BlockTags.WALLS).add(ECBlockRegistry.SMOOTH_RED_SANDSTONE_WALL.get(), ECBlockRegistry.POLISHED_RED_SANDSTONE_WALL.get(), ECBlockRegistry.RED_SANDSTONE_PAVING_WALL.get(),
            ECBlockRegistry.RED_SANDSTONE_TILES_WALL.get(), ECBlockRegistry.RED_SANDSTONE_BRICKS_WALL.get(), ECBlockRegistry.RED_SANDSTONE_LARGE_BRICKS_WALL.get());
        this.getBuilder(BaseTags.ForgeBlocks.PRESSURE_PLATES).add(ECBlockRegistry.SMOOTH_RED_SANDSTONE_PRESSURE_PLATE.get(), ECBlockRegistry.POLISHED_RED_SANDSTONE_PRESSURE_PLATE.get(),
            ECBlockRegistry.RED_SANDSTONE_PAVING_PRESSURE_PLATE.get(), ECBlockRegistry.RED_SANDSTONE_TILES_PRESSURE_PLATE.get(), ECBlockRegistry.RED_SANDSTONE_BRICKS_PRESSURE_PLATE.get(),
            ECBlockRegistry.RED_SANDSTONE_LARGE_BRICKS_PRESSURE_PLATE.get());

        // Terracotta
        this.getBuilder(BlockTags.STAIRS).add(ECBlockRegistry.TERRACOTTA_STAIRS.get(), ECBlockRegistry.POLISHED_TERRACOTTA_STAIRS.get(), ECBlockRegistry.TERRACOTTA_PAVING_STAIRS.get(),
            ECBlockRegistry.TERRACOTTA_TILES_STAIRS.get(), ECBlockRegistry.TERRACOTTA_BRICKS_STAIRS.get(), ECBlockRegistry.TERRACOTTA_LARGE_BRICKS_STAIRS.get());
        this.getBuilder(BlockTags.SLABS).add(ECBlockRegistry.TERRACOTTA_SLAB.get(), ECBlockRegistry.POLISHED_TERRACOTTA_SLAB.get(), ECBlockRegistry.TERRACOTTA_PAVING_SLAB.get(),
            ECBlockRegistry.TERRACOTTA_TILES_SLAB.get(), ECBlockRegistry.TERRACOTTA_BRICKS_SLAB.get(), ECBlockRegistry.TERRACOTTA_LARGE_BRICKS_SLAB.get());
        this.getBuilder(BlockTags.WALLS).add(ECBlockRegistry.TERRACOTTA_WALL.get(), ECBlockRegistry.POLISHED_TERRACOTTA_WALL.get(), ECBlockRegistry.TERRACOTTA_PAVING_WALL.get(),
            ECBlockRegistry.TERRACOTTA_TILES_WALL.get(), ECBlockRegistry.TERRACOTTA_BRICKS_WALL.get(), ECBlockRegistry.TERRACOTTA_LARGE_BRICKS_WALL.get());
        this.getBuilder(BaseTags.ForgeBlocks.PRESSURE_PLATES).add(ECBlockRegistry.TERRACOTTA_PRESSURE_PLATE.get(), ECBlockRegistry.POLISHED_TERRACOTTA_PRESSURE_PLATE.get(),
            ECBlockRegistry.TERRACOTTA_PAVING_PRESSURE_PLATE.get(), ECBlockRegistry.TERRACOTTA_TILES_PRESSURE_PLATE.get(), ECBlockRegistry.TERRACOTTA_BRICKS_PRESSURE_PLATE.get(),
            ECBlockRegistry.TERRACOTTA_LARGE_BRICKS_PRESSURE_PLATE.get());

        // Other bricks
        this.getBuilder(BlockTags.STAIRS).add(ECBlockRegistry.DARK_BRICKS_STAIRS.get(), ECBlockRegistry.OLD_BRICKS_STAIRS.get(), ECBlockRegistry.WEARED_BRICKS_STAIRS.get(),
            ECBlockRegistry.DARK_LARGE_BRICKS_STAIRS.get(), ECBlockRegistry.OLD_LARGE_BRICKS_STAIRS.get(), ECBlockRegistry.WEARED_LARGE_BRICKS_STAIRS.get());
        this.getBuilder(BlockTags.SLABS).add(ECBlockRegistry.DARK_BRICKS_SLAB.get(), ECBlockRegistry.OLD_BRICKS_SLAB.get(), ECBlockRegistry.WEARED_BRICKS_SLAB.get(),
            ECBlockRegistry.DARK_LARGE_BRICKS_SLAB.get(), ECBlockRegistry.OLD_LARGE_BRICKS_SLAB.get(), ECBlockRegistry.WEARED_LARGE_BRICKS_SLAB.get());
        this.getBuilder(BlockTags.WALLS).add(ECBlockRegistry.DARK_BRICKS_WALL.get(), ECBlockRegistry.OLD_BRICKS_WALL.get(), ECBlockRegistry.WEARED_BRICKS_WALL.get(),
            ECBlockRegistry.DARK_LARGE_BRICKS_WALL.get(), ECBlockRegistry.OLD_LARGE_BRICKS_WALL.get(), ECBlockRegistry.WEARED_LARGE_BRICKS_WALL.get());
        this.getBuilder(BaseTags.ForgeBlocks.PRESSURE_PLATES).add(ECBlockRegistry.DARK_BRICKS_PRESSURE_PLATE.get(), ECBlockRegistry.OLD_BRICKS_PRESSURE_PLATE.get(),
            ECBlockRegistry.WEARED_BRICKS_PRESSURE_PLATE.get(), ECBlockRegistry.DARK_LARGE_BRICKS_PRESSURE_PLATE.get(), ECBlockRegistry.OLD_LARGE_BRICKS_PRESSURE_PLATE.get(),
            ECBlockRegistry.WEARED_LARGE_BRICKS_PRESSURE_PLATE.get());

        // Pavings
        this.getBuilder(BlockTags.STAIRS).add(ECBlockRegistry.CONCRETE_PAVING_STAIRS.get(), ECBlockRegistry.DAMAGED_PAVING_STAIRS.get(), ECBlockRegistry.DARK_CONCRETE_PAVING_STAIRS.get(),
            ECBlockRegistry.MOIST_PAVING_STAIRS.get(), ECBlockRegistry.OLD_LARGE_BRICKS_STAIRS.get(), ECBlockRegistry.POLISHED_PAVING_STAIRS.get(), ECBlockRegistry.WHITE_CONCRETE_PAVING_STAIRS.get());
        this.getBuilder(BlockTags.SLABS).add(ECBlockRegistry.CONCRETE_PAVING_SLAB.get(), ECBlockRegistry.DAMAGED_PAVING_SLAB.get(), ECBlockRegistry.DARK_CONCRETE_PAVING_SLAB.get(),
            ECBlockRegistry.MOIST_PAVING_SLAB.get(), ECBlockRegistry.OLD_LARGE_BRICKS_SLAB.get(), ECBlockRegistry.POLISHED_PAVING_SLAB.get(), ECBlockRegistry.WHITE_CONCRETE_PAVING_SLAB.get());
        this.getBuilder(BlockTags.WALLS).add(ECBlockRegistry.CONCRETE_PAVING_WALL.get(), ECBlockRegistry.DAMAGED_PAVING_WALL.get(), ECBlockRegistry.DARK_CONCRETE_PAVING_WALL.get(),
            ECBlockRegistry.MOIST_PAVING_WALL.get(), ECBlockRegistry.OLD_LARGE_BRICKS_WALL.get(), ECBlockRegistry.POLISHED_PAVING_WALL.get(), ECBlockRegistry.WHITE_CONCRETE_PAVING_WALL.get());
        this.getBuilder(BaseTags.ForgeBlocks.PRESSURE_PLATES).add(ECBlockRegistry.CONCRETE_PAVING_PRESSURE_PLATE.get(), ECBlockRegistry.DAMAGED_PAVING_PRESSURE_PLATE.get(),
            ECBlockRegistry.DARK_CONCRETE_PAVING_PRESSURE_PLATE.get(), ECBlockRegistry.MOIST_PAVING_PRESSURE_PLATE.get(), ECBlockRegistry.OLD_LARGE_BRICKS_PRESSURE_PLATE.get(),
            ECBlockRegistry.POLISHED_PAVING_PRESSURE_PLATE.get(), ECBlockRegistry.WHITE_CONCRETE_PAVING_PRESSURE_PLATE.get());

        // Tiles
        this.getBuilder(BlockTags.STAIRS).add(ECBlockRegistry.CONCRETE_TILES_STAIRS.get(), ECBlockRegistry.SKYBLUE_TILES_STAIRS.get(), ECBlockRegistry.ORANGE_TILES_STAIRS.get(),
            ECBlockRegistry.BLUE_TILES_STAIRS.get(), ECBlockRegistry.LIGHT_BLUE_TILES_STAIRS.get(), ECBlockRegistry.RED_TILES_STAIRS.get(), ECBlockRegistry.WHITE_TILES_STAIRS.get(),
            ECBlockRegistry.YELLOW_TILES_STAIRS.get(), ECBlockRegistry.YELLOW_GREY_TILES_STAIRS.get());
        this.getBuilder(BlockTags.SLABS).add(ECBlockRegistry.CONCRETE_TILES_SLAB.get(), ECBlockRegistry.SKYBLUE_TILES_SLAB.get(), ECBlockRegistry.ORANGE_TILES_SLAB.get(), ECBlockRegistry.BLUE_TILES_SLAB.get(),
            ECBlockRegistry.LIGHT_BLUE_TILES_SLAB.get(), ECBlockRegistry.RED_TILES_SLAB.get(), ECBlockRegistry.WHITE_TILES_SLAB.get(), ECBlockRegistry.YELLOW_TILES_SLAB.get(),
            ECBlockRegistry.YELLOW_GREY_TILES_SLAB.get());
        this.getBuilder(BlockTags.WALLS).add(ECBlockRegistry.CONCRETE_TILES_WALL.get(), ECBlockRegistry.SKYBLUE_TILES_WALL.get(), ECBlockRegistry.ORANGE_TILES_WALL.get(), ECBlockRegistry.BLUE_TILES_WALL.get(),
            ECBlockRegistry.LIGHT_BLUE_TILES_WALL.get(), ECBlockRegistry.RED_TILES_WALL.get(), ECBlockRegistry.WHITE_TILES_WALL.get(), ECBlockRegistry.YELLOW_TILES_WALL.get(),
            ECBlockRegistry.YELLOW_GREY_TILES_WALL.get());
        this.getBuilder(BaseTags.ForgeBlocks.PRESSURE_PLATES).add(ECBlockRegistry.CONCRETE_TILES_PRESSURE_PLATE.get(), ECBlockRegistry.SKYBLUE_TILES_PRESSURE_PLATE.get(),
            ECBlockRegistry.ORANGE_TILES_PRESSURE_PLATE.get(), ECBlockRegistry.BLUE_TILES_PRESSURE_PLATE.get(), ECBlockRegistry.LIGHT_BLUE_TILES_PRESSURE_PLATE.get(),
            ECBlockRegistry.RED_TILES_PRESSURE_PLATE.get(), ECBlockRegistry.WHITE_TILES_PRESSURE_PLATE.get(), ECBlockRegistry.YELLOW_TILES_PRESSURE_PLATE.get(),
            ECBlockRegistry.YELLOW_GREY_TILES_PRESSURE_PLATE.get());

        for(int i = 0; i < Arrays.stream(DyeColor.values()).count(); i++)
        {
            this.getBuilder(BlockTags.STAIRS).add(ECBlockRegistry.CORRUGATED_METAL_PLATE_STAIRS.get(DyeColor.byId(i)).get());
            this.getBuilder(BlockTags.SLABS).add(ECBlockRegistry.CORRUGATED_METAL_PLATE_SLABS.get(DyeColor.byId(i)).get());
            this.getBuilder(BlockTags.WALLS).add(ECBlockRegistry.CORRUGATED_METAL_PLATE_WALLS.get(DyeColor.byId(i)).get());
            this.getBuilder(BaseTags.ForgeBlocks.PRESSURE_PLATES).add(ECBlockRegistry.CORRUGATED_METAL_PLATE_PRESSURE_PLATES.get(DyeColor.byId(i)).get());
            this.getBuilder(BlockTags.FENCES).add(ECBlockRegistry.CORRUGATED_METAL_PLATE_FENCES.get(DyeColor.byId(i)).get());
            this.getBuilder(Tags.Blocks.FENCE_GATES).add(ECBlockRegistry.CORRUGATED_METAL_PLATE_FENCE_GATES.get(DyeColor.byId(i)).get());
            this.getBuilder(Tags.Blocks.FENCES).add(ECBlockRegistry.CORRUGATED_METAL_PLATE_FENCES.get(DyeColor.byId(i)).get());

            this.getBuilder(ECTags.Blocks.FANCY_BEDS).add(ECBlockRegistry.ACACIA_FANCY_BED_BLOCKS.get(DyeColor.byId(i)).get());
            this.getBuilder(ECTags.Blocks.FANCY_BEDS).add(ECBlockRegistry.BIRCH_FANCY_BED_BLOCKS.get(DyeColor.byId(i)).get());
            this.getBuilder(ECTags.Blocks.FANCY_BEDS).add(ECBlockRegistry.DARK_OAK_FANCY_BED_BLOCKS.get(DyeColor.byId(i)).get());
            this.getBuilder(ECTags.Blocks.FANCY_BEDS).add(ECBlockRegistry.JUNGLE_FANCY_BED_BLOCKS.get(DyeColor.byId(i)).get());
            this.getBuilder(ECTags.Blocks.FANCY_BEDS).add(ECBlockRegistry.OAK_FANCY_BED_BLOCKS.get(DyeColor.byId(i)).get());
            this.getBuilder(ECTags.Blocks.FANCY_BEDS).add(ECBlockRegistry.SPRUCE_FANCY_BED_BLOCKS.get(DyeColor.byId(i)).get());

            this.getBuilder(ECTags.Blocks.COUCHES).add(ECBlockRegistry.COUCH_BLOCKS.get(DyeColor.byId(i)).get());

        }

        // Metal blocks
        this.getBuilder(BlockTags.STAIRS).add(ECBlockRegistry.DARK_METAL_FLOOR_STAIRS.get(), ECBlockRegistry.LIGHT_METAL_FLOOR_STAIRS.get(), ECBlockRegistry.RUSTY_PLATE_STAIRS.get());
        this.getBuilder(BlockTags.SLABS).add(ECBlockRegistry.DARK_METAL_FLOOR_SLAB.get(), ECBlockRegistry.LIGHT_METAL_FLOOR_SLAB.get(), ECBlockRegistry.RUSTY_PLATE_SLAB.get());
        this.getBuilder(BlockTags.WALLS).add(ECBlockRegistry.DARK_METAL_FLOOR_WALL.get(), ECBlockRegistry.LIGHT_METAL_FLOOR_WALL.get(), ECBlockRegistry.RUSTY_PLATE_WALL.get());
        this.getBuilder(BaseTags.ForgeBlocks.PRESSURE_PLATES).add(ECBlockRegistry.DARK_METAL_FLOOR_PRESSURE_PLATE.get(), ECBlockRegistry.LIGHT_METAL_FLOOR_PRESSURE_PLATE.get(),
            ECBlockRegistry.RUSTY_PLATE_PRESSURE_PLATE.get());

        // Wallpapers
        this.getBuilder(BlockTags.STAIRS).add(ECBlockRegistry.WHITE_BLUE_WALLPAPER_STAIRS.get(), ECBlockRegistry.BEIGE_FLOWER_WALLPAPER_STAIRS.get(), ECBlockRegistry.BEIGE_WALLPAPER_STAIRS.get(),
            ECBlockRegistry.PINK_WALLPAPER_STAIRS.get(), ECBlockRegistry.WHITE_GREEN_WALLPAPER_STAIRS.get());
        this.getBuilder(BlockTags.SLABS).add(ECBlockRegistry.WHITE_BLUE_WALLPAPER_SLAB.get(), ECBlockRegistry.BEIGE_FLOWER_WALLPAPER_SLAB.get(), ECBlockRegistry.BEIGE_WALLPAPER_SLAB.get(),
            ECBlockRegistry.PINK_WALLPAPER_SLAB.get(), ECBlockRegistry.WHITE_GREEN_WALLPAPER_SLAB.get());

        for(int j = 0; j < Arrays.stream(McWoods.values()).count(); j++)
        {
            this.getBuilder(ECTags.ForgeBlocks.CHAIRS).add(ECBlockRegistry.CHAIR_BLOCKS.get(McWoods.byId(j)).get());
            this.getBuilder(ECTags.ForgeBlocks.CHAIRS).add(ECBlockRegistry.TERRACE_CHAIR_BLOCKS.get(McWoods.byId(j)).get());

            this.getBuilder(ECTags.ForgeBlocks.TABLES).add(ECBlockRegistry.TABLE_BLOCKS.get(McWoods.byId(j)).get());
            this.getBuilder(ECTags.ForgeBlocks.TABLES).add(ECBlockRegistry.FANCY_TABLE_BLOCKS.get(McWoods.byId(j)).get());
            this.getBuilder(ECTags.ForgeBlocks.TABLES).add(ECBlockRegistry.TERRACE_TABLE_BLOCKS.get(McWoods.byId(j)).get());

            this.getBuilder(ECTags.Blocks.SUSPENDED_STAIRS).add(ECBlockRegistry.SUSPENDED_STAIRS_BLOCKS.get(McWoods.byId(j)).get());

            this.getBuilder(ECTags.Blocks.WOODEN_DOORS).add(ECBlockRegistry.FANCY_DOOR_BLOCKS.get(McWoods.byId(j)).get());

            this.getBuilder(ECTags.Blocks.WOODEN_CRATES).add(ECBlockRegistry.WOODEN_CRATE_BLOCKS.get(McWoods.byId(j)).get());
            this.getBuilder(Tags.Blocks.CHESTS_WOODEN).add(ECBlockRegistry.FANCY_CHEST_BLOCKS.get(McWoods.byId(j)).get());
        }

        // Doors
        this.getBuilder(BlockTags.DOORS).add(ECBlockRegistry.STEEL_DOOR.get(), ECBlockRegistry.STURDY_STEEL_DOOR.get(), ECBlockRegistry.WARNING_STEEL_DOOR.get(), ECBlockRegistry.WHITE_STEEL_DOOR.get(),
            ECBlockRegistry.STURDY_WHITE_STEEL_DOOR.get(), ECBlockRegistry.WARNING_WHITE_STEEL_DOOR.get(), ECBlockRegistry.RUSTY_DOOR.get(), ECBlockRegistry.STURDY_RUSTY_DOOR.get(),
            ECBlockRegistry.WARNING_RUSTY_DOOR.get());

        this.getBuilder(ECTags.ForgeBlocks.CHAIRS).add(ECBlockRegistry.STEEL_TERRACE_CHAIR.get());
        this.getBuilder(ECTags.ForgeBlocks.TABLES).add(ECBlockRegistry.STEEL_TERRACE_TABLE.get());
        this.getBuilder(ECTags.Blocks.SUSPENDED_STAIRS).add(ECBlockRegistry.STEEL_SUSPENDED_STAIRS.get(), ECBlockRegistry.RUSTY_SUSPENDED_STAIRS.get());

        this.getBuilder(Tags.Blocks.CHESTS).add(Tags.Blocks.CHESTS_WOODEN);

        getBuilder(BlockTags.BEDS).add(ECTags.Blocks.FANCY_BEDS);
        getBuilder(BlockTags.WOODEN_DOORS).add(ECTags.Blocks.WOODEN_DOORS);

        getBuilder(ECTags.ForgeBlocks.CRATES).add(ECTags.Blocks.WOODEN_CRATES);
    }
}