package tv.mapper.embellishcraft.data.gen;

import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraft.tags.BlockTags;
import tv.mapper.embellishcraft.block.ECBlockRegistry;
import tv.mapper.embellishcraft.block.ECBlocks;
import tv.mapper.mapperbase.data.BaseTags;

public class ECBlockTags extends BlockTagsProvider
{

    public ECBlockTags(DataGenerator generatorIn)
    {
        super(generatorIn);
    }

    public void registerTags()
    {
        this.getBuilder(BlockTags.STAIRS).add(ECBlockRegistry.BASALT_STAIRS.get(), ECBlockRegistry.SLATE_STAIRS.get(), ECBlocks.MARBLE_STAIRS, ECBlocks.GNEISS_STAIRS, ECBlocks.JADE_STAIRS,
            ECBlocks.LARVIKITE_STAIRS);
        this.getBuilder(BlockTags.STAIRS).add(ECBlocks.BASALT_COBBLESTONE_STAIRS, ECBlocks.SLATE_COBBLESTONE_STAIRS, ECBlocks.MARBLE_COBBLESTONE_STAIRS, ECBlocks.GNEISS_COBBLESTONE_STAIRS,
            ECBlocks.JADE_COBBLESTONE_STAIRS, ECBlocks.LARVIKITE_COBBLESTONE_STAIRS);
        this.getBuilder(BlockTags.SLABS).add(ECBlockRegistry.BASALT_SLAB.get(), ECBlockRegistry.SLATE_SLAB.get(), ECBlocks.MARBLE_SLAB, ECBlocks.GNEISS_SLAB, ECBlocks.JADE_SLAB,
            ECBlocks.LARVIKITE_SLAB);
        this.getBuilder(BlockTags.SLABS).add(ECBlocks.BASALT_COBBLESTONE_SLAB, ECBlocks.SLATE_COBBLESTONE_SLAB, ECBlocks.MARBLE_COBBLESTONE_SLAB, ECBlocks.GNEISS_COBBLESTONE_SLAB,
            ECBlocks.JADE_COBBLESTONE_SLAB, ECBlocks.LARVIKITE_COBBLESTONE_SLAB);
        this.getBuilder(BlockTags.WALLS).add(ECBlockRegistry.BASALT_WALL.get(), ECBlockRegistry.SLATE_WALL.get(), ECBlocks.MARBLE_WALL, ECBlocks.GNEISS_WALL, ECBlocks.JADE_WALL,
            ECBlocks.LARVIKITE_WALL);
        this.getBuilder(BlockTags.WALLS).add(ECBlocks.BASALT_COBBLESTONE_WALL, ECBlocks.SLATE_COBBLESTONE_WALL, ECBlocks.MARBLE_COBBLESTONE_WALL, ECBlocks.GNEISS_COBBLESTONE_WALL,
            ECBlocks.JADE_COBBLESTONE_WALL, ECBlocks.LARVIKITE_COBBLESTONE_WALL);
        this.getBuilder(BaseTags.ForgeBlocks.PRESSURE_PLATES).add(ECBlockRegistry.BASALT_PRESSURE_PLATE.get(), ECBlockRegistry.SLATE_PRESSURE_PLATE.get(), ECBlocks.MARBLE_PRESSURE_PLATE,
            ECBlocks.GNEISS_PRESSURE_PLATE, ECBlocks.JADE_PRESSURE_PLATE, ECBlocks.LARVIKITE_PRESSURE_PLATE);
        this.getBuilder(BaseTags.ForgeBlocks.PRESSURE_PLATES).add(ECBlocks.BASALT_COBBLESTONE_PRESSURE_PLATE, ECBlocks.SLATE_COBBLESTONE_PRESSURE_PLATE, ECBlocks.MARBLE_COBBLESTONE_PRESSURE_PLATE,
            ECBlocks.GNEISS_COBBLESTONE_PRESSURE_PLATE, ECBlocks.JADE_COBBLESTONE_PRESSURE_PLATE, ECBlocks.LARVIKITE_COBBLESTONE_PRESSURE_PLATE);
    }
}
