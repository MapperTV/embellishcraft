package tv.mapper.embellishcraft.data.gen;

import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import tv.mapper.embellishcraft.block.ECBlockRegistry;
import tv.mapper.mapperbase.data.BaseTags;

public class ECBlockTags extends BlockTagsProvider
{

    public ECBlockTags(DataGenerator generatorIn)
    {
        super(generatorIn);
    }

    public void registerTags()
    {
        this.getBuilder(Tags.Blocks.STONE).add(ECBlockRegistry.BASALT.get(), ECBlockRegistry.SLATE.get(), ECBlockRegistry.MARBLE.get(), ECBlockRegistry.GNEISS.get(), ECBlockRegistry.JADE.get(),
            ECBlockRegistry.LARVIKITE.get());

        // Basalt
        this.getBuilder(BlockTags.STAIRS).add(ECBlockRegistry.BASALT_STAIRS.get(), ECBlockRegistry.BASALT_COBBLESTONE_STAIRS.get(), ECBlockRegistry.SMOOTH_BASALT_STAIRS.get(),
            ECBlockRegistry.POLISHED_BASALT_STAIRS.get(), ECBlockRegistry.BASALT_PAVING_STAIRS.get(), ECBlockRegistry.BASALT_TILES_STAIRS.get(), ECBlockRegistry.BASALT_BRICKS_STAIRS.get(),
            ECBlockRegistry.BASALT_LARGE_BRICKS_STAIRS.get());
        this.getBuilder(BlockTags.SLABS).add(ECBlockRegistry.BASALT_SLAB.get(), ECBlockRegistry.BASALT_COBBLESTONE_SLAB.get(), ECBlockRegistry.SMOOTH_BASALT_SLAB.get(),
            ECBlockRegistry.POLISHED_BASALT_SLAB.get(), ECBlockRegistry.BASALT_PAVING_SLAB.get(), ECBlockRegistry.BASALT_TILES_SLAB.get(), ECBlockRegistry.BASALT_BRICKS_SLAB.get(),
            ECBlockRegistry.BASALT_LARGE_BRICKS_SLAB.get());
        this.getBuilder(BlockTags.WALLS).add(ECBlockRegistry.BASALT_WALL.get(), ECBlockRegistry.BASALT_COBBLESTONE_WALL.get(), ECBlockRegistry.SMOOTH_BASALT_WALL.get(),
            ECBlockRegistry.POLISHED_BASALT_WALL.get(), ECBlockRegistry.BASALT_PAVING_WALL.get(), ECBlockRegistry.BASALT_TILES_WALL.get(), ECBlockRegistry.BASALT_BRICKS_WALL.get(),
            ECBlockRegistry.BASALT_LARGE_BRICKS_WALL.get());
        this.getBuilder(BaseTags.ForgeBlocks.PRESSURE_PLATES).add(ECBlockRegistry.BASALT_PRESSURE_PLATE.get(), ECBlockRegistry.BASALT_COBBLESTONE_PRESSURE_PLATE.get(),
            ECBlockRegistry.SMOOTH_BASALT_PRESSURE_PLATE.get(), ECBlockRegistry.POLISHED_BASALT_PRESSURE_PLATE.get(), ECBlockRegistry.BASALT_PAVING_PRESSURE_PLATE.get(),
            ECBlockRegistry.BASALT_TILES_PRESSURE_PLATE.get(), ECBlockRegistry.BASALT_BRICKS_PRESSURE_PLATE.get(), ECBlockRegistry.BASALT_LARGE_BRICKS_PRESSURE_PLATE.get(),
            ECBlockRegistry.BASALT_ORNAMENT_PRESSURE_PLATE.get());

        // Slate
        this.getBuilder(BlockTags.STAIRS).add(ECBlockRegistry.SLATE_STAIRS.get(), ECBlockRegistry.SLATE_COBBLESTONE_STAIRS.get(), ECBlockRegistry.SMOOTH_SLATE_STAIRS.get(),
            ECBlockRegistry.POLISHED_SLATE_STAIRS.get(), ECBlockRegistry.SLATE_PAVING_STAIRS.get(), ECBlockRegistry.SLATE_TILES_STAIRS.get(), ECBlockRegistry.SLATE_BRICKS_STAIRS.get(),
            ECBlockRegistry.SLATE_LARGE_BRICKS_STAIRS.get());
        this.getBuilder(BlockTags.SLABS).add(ECBlockRegistry.SLATE_SLAB.get(), ECBlockRegistry.SLATE_COBBLESTONE_SLAB.get(), ECBlockRegistry.SMOOTH_SLATE_SLAB.get(), ECBlockRegistry.POLISHED_SLATE_SLAB.get(),
            ECBlockRegistry.SLATE_PAVING_SLAB.get(), ECBlockRegistry.SLATE_TILES_SLAB.get(), ECBlockRegistry.SLATE_BRICKS_SLAB.get(), ECBlockRegistry.SLATE_LARGE_BRICKS_SLAB.get());
        this.getBuilder(BlockTags.WALLS).add(ECBlockRegistry.SLATE_WALL.get(), ECBlockRegistry.SLATE_COBBLESTONE_WALL.get(), ECBlockRegistry.SMOOTH_SLATE_WALL.get(), ECBlockRegistry.POLISHED_SLATE_WALL.get(),
            ECBlockRegistry.SLATE_PAVING_WALL.get(), ECBlockRegistry.SLATE_TILES_WALL.get(), ECBlockRegistry.SLATE_BRICKS_WALL.get(), ECBlockRegistry.SLATE_LARGE_BRICKS_WALL.get());
        this.getBuilder(BaseTags.ForgeBlocks.PRESSURE_PLATES).add(ECBlockRegistry.SLATE_PRESSURE_PLATE.get(), ECBlockRegistry.SLATE_COBBLESTONE_PRESSURE_PLATE.get(),
            ECBlockRegistry.SMOOTH_SLATE_PRESSURE_PLATE.get(), ECBlockRegistry.POLISHED_SLATE_PRESSURE_PLATE.get(), ECBlockRegistry.SLATE_PAVING_PRESSURE_PLATE.get(),
            ECBlockRegistry.SLATE_TILES_PRESSURE_PLATE.get(), ECBlockRegistry.SLATE_BRICKS_PRESSURE_PLATE.get(), ECBlockRegistry.SLATE_LARGE_BRICKS_PRESSURE_PLATE.get(),
            ECBlockRegistry.SLATE_ORNAMENT_PRESSURE_PLATE.get());

        // Marble
        this.getBuilder(BlockTags.STAIRS).add(ECBlockRegistry.MARBLE_STAIRS.get(), ECBlockRegistry.MARBLE_COBBLESTONE_STAIRS.get(), ECBlockRegistry.SMOOTH_MARBLE_STAIRS.get(),
            ECBlockRegistry.POLISHED_MARBLE_STAIRS.get(), ECBlockRegistry.MARBLE_PAVING_STAIRS.get(), ECBlockRegistry.MARBLE_TILES_STAIRS.get(), ECBlockRegistry.MARBLE_BRICKS_STAIRS.get(),
            ECBlockRegistry.MARBLE_LARGE_BRICKS_STAIRS.get());
        this.getBuilder(BlockTags.SLABS).add(ECBlockRegistry.MARBLE_SLAB.get(), ECBlockRegistry.MARBLE_COBBLESTONE_SLAB.get(), ECBlockRegistry.SMOOTH_MARBLE_SLAB.get(),
            ECBlockRegistry.POLISHED_MARBLE_SLAB.get(), ECBlockRegistry.MARBLE_PAVING_SLAB.get(), ECBlockRegistry.MARBLE_TILES_SLAB.get(), ECBlockRegistry.MARBLE_BRICKS_SLAB.get(),
            ECBlockRegistry.MARBLE_LARGE_BRICKS_SLAB.get());
        this.getBuilder(BlockTags.WALLS).add(ECBlockRegistry.MARBLE_WALL.get(), ECBlockRegistry.MARBLE_COBBLESTONE_WALL.get(), ECBlockRegistry.SMOOTH_MARBLE_WALL.get(),
            ECBlockRegistry.POLISHED_MARBLE_WALL.get(), ECBlockRegistry.MARBLE_PAVING_WALL.get(), ECBlockRegistry.MARBLE_TILES_WALL.get(), ECBlockRegistry.MARBLE_BRICKS_WALL.get(),
            ECBlockRegistry.MARBLE_LARGE_BRICKS_WALL.get());
        this.getBuilder(BaseTags.ForgeBlocks.PRESSURE_PLATES).add(ECBlockRegistry.MARBLE_PRESSURE_PLATE.get(), ECBlockRegistry.MARBLE_COBBLESTONE_PRESSURE_PLATE.get(),
            ECBlockRegistry.SMOOTH_MARBLE_PRESSURE_PLATE.get(), ECBlockRegistry.POLISHED_MARBLE_PRESSURE_PLATE.get(), ECBlockRegistry.MARBLE_PAVING_PRESSURE_PLATE.get(),
            ECBlockRegistry.MARBLE_TILES_PRESSURE_PLATE.get(), ECBlockRegistry.MARBLE_BRICKS_PRESSURE_PLATE.get(), ECBlockRegistry.MARBLE_LARGE_BRICKS_PRESSURE_PLATE.get(),
            ECBlockRegistry.MARBLE_ORNAMENT_PRESSURE_PLATE.get());

        // Gneiss
        this.getBuilder(BlockTags.STAIRS).add(ECBlockRegistry.GNEISS_STAIRS.get(), ECBlockRegistry.GNEISS_COBBLESTONE_STAIRS.get(), ECBlockRegistry.SMOOTH_GNEISS_STAIRS.get(),
            ECBlockRegistry.POLISHED_GNEISS_STAIRS.get(), ECBlockRegistry.GNEISS_PAVING_STAIRS.get(), ECBlockRegistry.GNEISS_TILES_STAIRS.get(), ECBlockRegistry.GNEISS_BRICKS_STAIRS.get(),
            ECBlockRegistry.GNEISS_LARGE_BRICKS_STAIRS.get());
        this.getBuilder(BlockTags.SLABS).add(ECBlockRegistry.GNEISS_SLAB.get(), ECBlockRegistry.GNEISS_COBBLESTONE_SLAB.get(), ECBlockRegistry.SMOOTH_GNEISS_SLAB.get(),
            ECBlockRegistry.POLISHED_GNEISS_SLAB.get(), ECBlockRegistry.GNEISS_PAVING_SLAB.get(), ECBlockRegistry.GNEISS_TILES_SLAB.get(), ECBlockRegistry.GNEISS_BRICKS_SLAB.get(),
            ECBlockRegistry.GNEISS_LARGE_BRICKS_SLAB.get());
        this.getBuilder(BlockTags.WALLS).add(ECBlockRegistry.GNEISS_WALL.get(), ECBlockRegistry.GNEISS_COBBLESTONE_WALL.get(), ECBlockRegistry.SMOOTH_GNEISS_WALL.get(),
            ECBlockRegistry.POLISHED_GNEISS_WALL.get(), ECBlockRegistry.GNEISS_PAVING_WALL.get(), ECBlockRegistry.GNEISS_TILES_WALL.get(), ECBlockRegistry.GNEISS_BRICKS_WALL.get(),
            ECBlockRegistry.GNEISS_LARGE_BRICKS_WALL.get());
        this.getBuilder(BaseTags.ForgeBlocks.PRESSURE_PLATES).add(ECBlockRegistry.GNEISS_PRESSURE_PLATE.get(), ECBlockRegistry.GNEISS_COBBLESTONE_PRESSURE_PLATE.get(),
            ECBlockRegistry.SMOOTH_GNEISS_PRESSURE_PLATE.get(), ECBlockRegistry.POLISHED_GNEISS_PRESSURE_PLATE.get(), ECBlockRegistry.GNEISS_PAVING_PRESSURE_PLATE.get(),
            ECBlockRegistry.GNEISS_TILES_PRESSURE_PLATE.get(), ECBlockRegistry.GNEISS_BRICKS_PRESSURE_PLATE.get(), ECBlockRegistry.GNEISS_LARGE_BRICKS_PRESSURE_PLATE.get(),
            ECBlockRegistry.GNEISS_ORNAMENT_PRESSURE_PLATE.get());

        // Jade
        this.getBuilder(BlockTags.STAIRS).add(ECBlockRegistry.JADE_STAIRS.get(), ECBlockRegistry.JADE_COBBLESTONE_STAIRS.get(), ECBlockRegistry.SMOOTH_JADE_STAIRS.get(),
            ECBlockRegistry.POLISHED_JADE_STAIRS.get(), ECBlockRegistry.JADE_PAVING_STAIRS.get(), ECBlockRegistry.JADE_TILES_STAIRS.get(), ECBlockRegistry.JADE_BRICKS_STAIRS.get(),
            ECBlockRegistry.JADE_LARGE_BRICKS_STAIRS.get());
        this.getBuilder(BlockTags.SLABS).add(ECBlockRegistry.JADE_SLAB.get(), ECBlockRegistry.JADE_COBBLESTONE_SLAB.get(), ECBlockRegistry.SMOOTH_JADE_SLAB.get(), ECBlockRegistry.POLISHED_JADE_SLAB.get(),
            ECBlockRegistry.JADE_PAVING_SLAB.get(), ECBlockRegistry.JADE_TILES_SLAB.get(), ECBlockRegistry.JADE_BRICKS_SLAB.get(), ECBlockRegistry.JADE_LARGE_BRICKS_SLAB.get());
        this.getBuilder(BlockTags.WALLS).add(ECBlockRegistry.JADE_WALL.get(), ECBlockRegistry.JADE_COBBLESTONE_WALL.get(), ECBlockRegistry.SMOOTH_JADE_WALL.get(), ECBlockRegistry.POLISHED_JADE_WALL.get(),
            ECBlockRegistry.JADE_PAVING_WALL.get(), ECBlockRegistry.JADE_TILES_WALL.get(), ECBlockRegistry.JADE_BRICKS_WALL.get(), ECBlockRegistry.JADE_LARGE_BRICKS_WALL.get());
        this.getBuilder(BaseTags.ForgeBlocks.PRESSURE_PLATES).add(ECBlockRegistry.JADE_PRESSURE_PLATE.get(), ECBlockRegistry.JADE_COBBLESTONE_PRESSURE_PLATE.get(),
            ECBlockRegistry.SMOOTH_JADE_PRESSURE_PLATE.get(), ECBlockRegistry.POLISHED_JADE_PRESSURE_PLATE.get(), ECBlockRegistry.JADE_PAVING_PRESSURE_PLATE.get(),
            ECBlockRegistry.JADE_TILES_PRESSURE_PLATE.get(), ECBlockRegistry.JADE_BRICKS_PRESSURE_PLATE.get(), ECBlockRegistry.JADE_LARGE_BRICKS_PRESSURE_PLATE.get(),
            ECBlockRegistry.JADE_ORNAMENT_PRESSURE_PLATE.get());

        // Larvikite
        this.getBuilder(BlockTags.STAIRS).add(ECBlockRegistry.LARVIKITE_STAIRS.get(), ECBlockRegistry.LARVIKITE_COBBLESTONE_STAIRS.get(), ECBlockRegistry.SMOOTH_LARVIKITE_STAIRS.get(),
            ECBlockRegistry.POLISHED_LARVIKITE_STAIRS.get(), ECBlockRegistry.LARVIKITE_PAVING_STAIRS.get(), ECBlockRegistry.LARVIKITE_TILES_STAIRS.get(), ECBlockRegistry.LARVIKITE_BRICKS_STAIRS.get(),
            ECBlockRegistry.LARVIKITE_LARGE_BRICKS_STAIRS.get());
        this.getBuilder(BlockTags.SLABS).add(ECBlockRegistry.LARVIKITE_SLAB.get(), ECBlockRegistry.LARVIKITE_COBBLESTONE_SLAB.get(), ECBlockRegistry.SMOOTH_LARVIKITE_SLAB.get(),
            ECBlockRegistry.POLISHED_LARVIKITE_SLAB.get(), ECBlockRegistry.LARVIKITE_PAVING_SLAB.get(), ECBlockRegistry.LARVIKITE_TILES_SLAB.get(), ECBlockRegistry.LARVIKITE_BRICKS_SLAB.get(),
            ECBlockRegistry.LARVIKITE_LARGE_BRICKS_SLAB.get());
        this.getBuilder(BlockTags.WALLS).add(ECBlockRegistry.LARVIKITE_WALL.get(), ECBlockRegistry.LARVIKITE_COBBLESTONE_WALL.get(), ECBlockRegistry.SMOOTH_LARVIKITE_WALL.get(),
            ECBlockRegistry.POLISHED_LARVIKITE_WALL.get(), ECBlockRegistry.LARVIKITE_PAVING_WALL.get(), ECBlockRegistry.LARVIKITE_TILES_WALL.get(), ECBlockRegistry.LARVIKITE_BRICKS_WALL.get(),
            ECBlockRegistry.LARVIKITE_LARGE_BRICKS_WALL.get());
        this.getBuilder(BaseTags.ForgeBlocks.PRESSURE_PLATES).add(ECBlockRegistry.LARVIKITE_PRESSURE_PLATE.get(), ECBlockRegistry.LARVIKITE_COBBLESTONE_PRESSURE_PLATE.get(),
            ECBlockRegistry.SMOOTH_LARVIKITE_PRESSURE_PLATE.get(), ECBlockRegistry.POLISHED_LARVIKITE_PRESSURE_PLATE.get(), ECBlockRegistry.LARVIKITE_PAVING_PRESSURE_PLATE.get(),
            ECBlockRegistry.LARVIKITE_TILES_PRESSURE_PLATE.get(), ECBlockRegistry.LARVIKITE_BRICKS_PRESSURE_PLATE.get(), ECBlockRegistry.LARVIKITE_LARGE_BRICKS_PRESSURE_PLATE.get(),
            ECBlockRegistry.LARVIKITE_ORNAMENT_PRESSURE_PLATE.get());

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
    }
}
