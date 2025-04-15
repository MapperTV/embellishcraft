package tv.mapper.embellishcraft.core.data.tags;

import java.util.Arrays;
import java.util.concurrent.CompletableFuture;

import org.jetbrains.annotations.Nullable;

import net.minecraft.core.HolderLookup.Provider;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DoorBlock;
import net.minecraft.world.level.block.FenceBlock;
import net.minecraft.world.level.block.FenceGateBlock;
import net.minecraft.world.level.block.PressurePlateBlock;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.WallBlock;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredHolder;
import tv.mapper.embellishcraft.building.block.InitBuildingBlocks;
import tv.mapper.embellishcraft.building.block.SuspendedStairBlock;
import tv.mapper.embellishcraft.core.util.RockType;
import tv.mapper.embellishcraft.furniture.block.ChairBlock;
import tv.mapper.embellishcraft.furniture.block.CouchBlock;
import tv.mapper.embellishcraft.furniture.block.InitFurnitureBlocks;
import tv.mapper.embellishcraft.furniture.block.TableBlock;
import tv.mapper.embellishcraft.furniture.block.TerraceChairBlock;
import tv.mapper.embellishcraft.furniture.block.TerraceTableBlock;
import tv.mapper.embellishcraft.industrial.block.InitIndustrialBlocks;
import tv.mapper.embellishcraft.lights.block.InitLightBlocks;
import tv.mapper.embellishcraft.rocks.block.InitRockBlocks;
import tv.mapper.mapperbase.api.block.CustomButtonBlock;
import tv.mapper.mapperbase.api.block.CustomLadderBlock;
import tv.mapper.mapperbase.api.data.tags.BaseBlockTagsProvider;

public class ECBlockTags extends BaseBlockTagsProvider
{
    public ECBlockTags(PackOutput output, CompletableFuture<Provider> lookupProvider, String modid, @Nullable ExistingFileHelper existingFileHelper)
    {
        super(output, lookupProvider, modid, existingFileHelper);
    }

    @Override
    public void addTags(Provider pProvider)
    {
        for(DeferredHolder<Block, ? extends Block> object : InitRockBlocks.ROCK_BLOCK_REGISTRY.getEntries())
        {
            addTagsFromBlockType(object.get());
            if(object.get() instanceof PressurePlateBlock) // Add rock pressure plates to stone pressure plate block tag
                this.tag(BlockTags.STONE_PRESSURE_PLATES).add(object.get());
        }

        for(DeferredHolder<Block, ? extends Block> object : InitIndustrialBlocks.INDUSTRIAL_BLOCK_REGISTRY.getEntries())
        {
            addTagsFromBlockType(object.get());
        }

        for(DeferredHolder<Block, ? extends Block> object : InitBuildingBlocks.BUILDING_BLOCK_REGISTRY.getEntries())
        {
            addTagsFromBlockType(object.get());
        }

        for(DeferredHolder<Block, ? extends Block> object : InitFurnitureBlocks.FURNITURE_BLOCK_REGISTRY.getEntries())
        {
            addTagsFromBlockType(object.get());
        }

        for(DeferredHolder<Block, ? extends Block> object : InitLightBlocks.LIGHT_BLOCK_REGISTRY.getEntries())
        {
            addTagsFromBlockType(object.get());
        }

        registerToolTags(InitRockBlocks.ROCK_BLOCK_REGISTRY);
        registerToolTags(InitIndustrialBlocks.INDUSTRIAL_BLOCK_REGISTRY);
        registerToolTags(InitBuildingBlocks.BUILDING_BLOCK_REGISTRY);
        registerToolTags(InitFurnitureBlocks.FURNITURE_BLOCK_REGISTRY);
        registerToolTags(InitLightBlocks.LIGHT_BLOCK_REGISTRY);

        for(int j = 0; j < Arrays.stream(RockType.values()).count(); j++)
        {
            // Rocks
            this.tag(Tags.Blocks.STONES).add(InitRockBlocks.ROCK_BLOCKS.get(RockType.byId(j)).get());
            this.tag(BlockTags.BASE_STONE_OVERWORLD).add(InitRockBlocks.ROCK_BLOCKS.get(RockType.byId(j)).get());
            this.tag(BlockTags.STONE_BUTTONS).add(InitRockBlocks.ROCK_BUTTONS.get(RockType.byId(j)).get());
            // Cobblestones
            this.tag(Tags.Blocks.COBBLESTONES).add(InitRockBlocks.ROCK_COBBLESTONES.get(RockType.byId(j)).get());
        }

        this.tag(BlockTags.STONE_BUTTONS).add(InitRockBlocks.ANDESITE_BUTTON.get(), InitRockBlocks.GRANITE_BUTTON.get(), InitRockBlocks.DIORITE_BUTTON.get(), InitRockBlocks.SANDSTONE_BUTTON.get(), InitRockBlocks.RED_SANDSTONE_BUTTON.get(), InitRockBlocks.TERRACOTTA_BUTTON.get());

        // Sandstones
        this.tag(Tags.Blocks.SANDSTONE_BLOCKS).add(InitRockBlocks.POLISHED_SANDSTONE.get(), InitRockBlocks.SANDSTONE_PAVING.get(), InitRockBlocks.SANDSTONE_TILES.get(), InitRockBlocks.SANDSTONE_BRICKS.get(), InitRockBlocks.SANDSTONE_LARGE_BRICKS.get(), InitRockBlocks.SANDSTONE_PAVING_STONES.get(), InitRockBlocks.SANDSTONE_ROOFTILES.get(), InitRockBlocks.POLISHED_RED_SANDSTONE.get(), InitRockBlocks.RED_SANDSTONE_PAVING.get(), InitRockBlocks.RED_SANDSTONE_TILES.get(), InitRockBlocks.RED_SANDSTONE_BRICKS.get(), InitRockBlocks.RED_SANDSTONE_LARGE_BRICKS.get(), InitRockBlocks.RED_SANDSTONE_PAVING_STONES.get(), InitRockBlocks.RED_SANDSTONE_ROOFTILES.get());
        this.tag(Tags.Blocks.SANDSTONE_STAIRS).add(InitRockBlocks.POLISHED_SANDSTONE_STAIRS.get(), InitRockBlocks.SANDSTONE_PAVING_STAIRS.get(), InitRockBlocks.SANDSTONE_TILES_STAIRS.get(), InitRockBlocks.SANDSTONE_BRICKS_STAIRS.get(), InitRockBlocks.SANDSTONE_LARGE_BRICKS_STAIRS.get(), InitRockBlocks.SANDSTONE_PAVING_STONES_STAIRS.get(), InitRockBlocks.SANDSTONE_ROOFTILES_STAIRS.get(), InitRockBlocks.POLISHED_RED_SANDSTONE_STAIRS.get(), InitRockBlocks.RED_SANDSTONE_PAVING_STAIRS.get(), InitRockBlocks.RED_SANDSTONE_TILES_STAIRS.get(), InitRockBlocks.RED_SANDSTONE_BRICKS_STAIRS.get(), InitRockBlocks.RED_SANDSTONE_LARGE_BRICKS_STAIRS.get(), InitRockBlocks.RED_SANDSTONE_PAVING_STONES_STAIRS.get(), InitRockBlocks.RED_SANDSTONE_ROOFTILES_STAIRS.get());
        this.tag(Tags.Blocks.SANDSTONE_SLABS).add(InitRockBlocks.POLISHED_SANDSTONE_SLAB.get(), InitRockBlocks.SANDSTONE_PAVING_SLAB.get(), InitRockBlocks.SANDSTONE_TILES_SLAB.get(), InitRockBlocks.SANDSTONE_BRICKS_SLAB.get(), InitRockBlocks.SANDSTONE_LARGE_BRICKS_SLAB.get(), InitRockBlocks.SANDSTONE_PAVING_STONES_SLAB.get(), InitRockBlocks.SANDSTONE_ROOFTILES_SLAB.get(), InitRockBlocks.POLISHED_RED_SANDSTONE_SLAB.get(), InitRockBlocks.RED_SANDSTONE_PAVING_SLAB.get(), InitRockBlocks.RED_SANDSTONE_TILES_SLAB.get(), InitRockBlocks.RED_SANDSTONE_BRICKS_SLAB.get(), InitRockBlocks.RED_SANDSTONE_LARGE_BRICKS_SLAB.get(), InitRockBlocks.RED_SANDSTONE_PAVING_STONES_SLAB.get(), InitRockBlocks.RED_SANDSTONE_ROOFTILES_SLAB.get());

        this.tag(Tags.Blocks.SANDSTONE_UNCOLORED_BLOCKS).add(InitRockBlocks.POLISHED_SANDSTONE.get(), InitRockBlocks.SANDSTONE_PAVING.get(), InitRockBlocks.SANDSTONE_TILES.get(), InitRockBlocks.SANDSTONE_BRICKS.get(), InitRockBlocks.SANDSTONE_LARGE_BRICKS.get(), InitRockBlocks.SANDSTONE_PAVING_STONES.get(), InitRockBlocks.SANDSTONE_ROOFTILES.get());
        this.tag(Tags.Blocks.SANDSTONE_UNCOLORED_STAIRS).add(InitRockBlocks.POLISHED_SANDSTONE_STAIRS.get(), InitRockBlocks.SANDSTONE_PAVING_STAIRS.get(), InitRockBlocks.SANDSTONE_TILES_STAIRS.get(), InitRockBlocks.SANDSTONE_BRICKS_STAIRS.get(), InitRockBlocks.SANDSTONE_LARGE_BRICKS_STAIRS.get(), InitRockBlocks.SANDSTONE_PAVING_STONES_STAIRS.get(), InitRockBlocks.SANDSTONE_ROOFTILES_STAIRS.get());
        this.tag(Tags.Blocks.SANDSTONE_UNCOLORED_SLABS).add(InitRockBlocks.POLISHED_SANDSTONE_SLAB.get(), InitRockBlocks.SANDSTONE_PAVING_SLAB.get(), InitRockBlocks.SANDSTONE_TILES_SLAB.get(), InitRockBlocks.SANDSTONE_BRICKS_SLAB.get(), InitRockBlocks.SANDSTONE_LARGE_BRICKS_SLAB.get(), InitRockBlocks.SANDSTONE_PAVING_STONES_SLAB.get(), InitRockBlocks.SANDSTONE_ROOFTILES_SLAB.get());

        this.tag(Tags.Blocks.SANDSTONE_RED_BLOCKS).add(InitRockBlocks.POLISHED_RED_SANDSTONE.get(), InitRockBlocks.RED_SANDSTONE_PAVING.get(), InitRockBlocks.RED_SANDSTONE_TILES.get(), InitRockBlocks.RED_SANDSTONE_BRICKS.get(), InitRockBlocks.RED_SANDSTONE_LARGE_BRICKS.get(), InitRockBlocks.RED_SANDSTONE_PAVING_STONES.get(), InitRockBlocks.RED_SANDSTONE_ROOFTILES.get());
        this.tag(Tags.Blocks.SANDSTONE_RED_STAIRS).add(InitRockBlocks.POLISHED_RED_SANDSTONE_STAIRS.get(), InitRockBlocks.RED_SANDSTONE_PAVING_STAIRS.get(), InitRockBlocks.RED_SANDSTONE_TILES_STAIRS.get(), InitRockBlocks.RED_SANDSTONE_BRICKS_STAIRS.get(), InitRockBlocks.RED_SANDSTONE_LARGE_BRICKS_STAIRS.get(), InitRockBlocks.RED_SANDSTONE_PAVING_STONES_STAIRS.get(), InitRockBlocks.RED_SANDSTONE_ROOFTILES_STAIRS.get());
        this.tag(Tags.Blocks.SANDSTONE_RED_SLABS).add(InitRockBlocks.POLISHED_RED_SANDSTONE_SLAB.get(), InitRockBlocks.RED_SANDSTONE_PAVING_SLAB.get(), InitRockBlocks.RED_SANDSTONE_TILES_SLAB.get(), InitRockBlocks.RED_SANDSTONE_BRICKS_SLAB.get(), InitRockBlocks.RED_SANDSTONE_LARGE_BRICKS_SLAB.get(), InitRockBlocks.RED_SANDSTONE_PAVING_STONES_SLAB.get(), InitRockBlocks.RED_SANDSTONE_ROOFTILES_SLAB.get());

        // Adding tags to existing MC/Forge tags
        // this.tag(Tags.Blocks.CHESTS).addTag(Tags.Blocks.CHESTS_WOODEN);
        // this.tag(BlockTags.BEDS).addTag(ECTags.Blocks.FANCY_BEDS);
        // this.tag(ECTags.ForgeBlocks.CRATES).addTag(ECTags.Blocks.WOODEN_CRATES);
        this.tag(BlockTags.FENCES).addTag(Tags.Blocks.FENCES);
        this.tag(BlockTags.WOODEN_DOORS).addTag(ECTags.Blocks.WOODEN_DOORS);
        this.tag(ECTags.Blocks.DOORS).addTag(ECTags.Blocks.WOODEN_DOORS);
        this.tag(BlockTags.DOORS).addTag(ECTags.Blocks.DOORS);
        this.tag(BlockTags.FENCE_GATES).addTag(Tags.Blocks.FENCE_GATES);
    }

    @SuppressWarnings("deprecation")
    protected void addTagsFromBlockType(Block block)
    {
        if(block instanceof WallBlock)
            this.tag(BlockTags.WALLS).add(block);
        else if(block instanceof SlabBlock)
            this.tag(BlockTags.SLABS).add(block);
        else if(block instanceof StairBlock)
            this.tag(BlockTags.STAIRS).add(block);
        else if(block instanceof PressurePlateBlock)
            this.tag(BlockTags.PRESSURE_PLATES).add(block);
        else if(block instanceof CustomButtonBlock)
            this.tag(BlockTags.BUTTONS).add(block);
        else if(block instanceof FenceBlock)
            this.tag(Tags.Blocks.FENCES).add(block);
        else if(block instanceof FenceGateBlock)
            this.tag(Tags.Blocks.FENCE_GATES).add(block);
        // else if(block instanceof CustomBedBlock)
        // this.tag(ECTags.Blocks.FANCY_BEDS).add(block);
        else if(block instanceof CouchBlock)
            this.tag(ECTags.Blocks.COUCHES).add(block);
        else if(block instanceof CustomLadderBlock)
            this.tag(BlockTags.CLIMBABLE).add(block);
        else if(block instanceof ChairBlock || block instanceof TerraceChairBlock)
            this.tag(ECTags.CommonBlocks.CHAIRS).add(block);
        else if(block instanceof TableBlock || block instanceof TerraceTableBlock)
            this.tag(ECTags.CommonBlocks.TABLES).add(block);
        else if(block instanceof SuspendedStairBlock)
            this.tag(ECTags.Blocks.SUSPENDED_STAIRS).add(block);
        else if(block instanceof DoorBlock)
        {
            if(block.defaultBlockState().getSoundType() == SoundType.WOOD)
                this.tag(ECTags.Blocks.WOODEN_DOORS).add(block);
            this.tag(ECTags.Blocks.DOORS).add(block);
        }
        // else if(block instanceof CrateBlock)
        // this.tag(ECTags.Blocks.WOODEN_CRATES).add(block);
        // else if(block instanceof ChestBlock)
        // this.tag(Tags.Blocks.CHESTS_WOODEN).add(block);
    }
}