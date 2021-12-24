package tv.mapper.embellishcraft.data.gen;

import java.util.Arrays;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.ChestBlock;
import net.minecraft.world.level.block.DoorBlock;
import net.minecraft.world.level.block.FenceBlock;
import net.minecraft.world.level.block.FenceGateBlock;
import net.minecraft.world.level.block.PressurePlateBlock;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.fmllegacy.RegistryObject;
import tv.mapper.embellishcraft.ECConstants;
import tv.mapper.embellishcraft.block.ChairBlock;
import tv.mapper.embellishcraft.block.CouchBlock;
import tv.mapper.embellishcraft.block.CrateBlock;
import tv.mapper.embellishcraft.block.CustomBedBlock;
import tv.mapper.embellishcraft.block.ECBlockRegistry;
import tv.mapper.embellishcraft.block.SuspendedStairsBlock;
import tv.mapper.embellishcraft.block.TableBlock;
import tv.mapper.embellishcraft.block.TerraceTableBlock;
import tv.mapper.embellishcraft.data.ECTags;
import tv.mapper.embellishcraft.rocks.world.level.blocks.InitRockBlocks;
import tv.mapper.embellishcraft.util.RockType;
import tv.mapper.mapperbase.world.level.block.CustomButtonBlock;
import tv.mapper.mapperbase.world.level.block.CustomLadderBlock;

public class ECBlockTags extends BlockTagsProvider
{

    public ECBlockTags(DataGenerator generatorIn, ExistingFileHelper existingFileHelper)
    {
        super(generatorIn, ECConstants.MODID, existingFileHelper);
    }

    public void addTags()
    {
        for(RegistryObject<Block> object : ECBlockRegistry.BLOCKS.getEntries())
        {
            Block block = object.get();

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
            else if(block instanceof CustomBedBlock)
                this.tag(ECTags.Blocks.FANCY_BEDS).add(block);
            else if(block instanceof CouchBlock)
                this.tag(ECTags.Blocks.COUCHES).add(block);
            else if(block instanceof CustomLadderBlock)
                this.tag(BlockTags.CLIMBABLE).add(block);
            else if(block instanceof ChairBlock)
                this.tag(ECTags.ForgeBlocks.CHAIRS).add(block);
            else if(block instanceof TableBlock || block instanceof TerraceTableBlock)
                this.tag(ECTags.ForgeBlocks.TABLES).add(block);
            else if(block instanceof SuspendedStairsBlock)
                this.tag(ECTags.Blocks.SUSPENDED_STAIRS).add(block);
            else if(block instanceof DoorBlock)
            {
                if(block.defaultBlockState().getMaterial().equals(Material.WOOD))
                    this.tag(ECTags.Blocks.WOODEN_DOORS).add(block);
                this.tag(ECTags.Blocks.DOORS).add(block);
            }
            else if(block instanceof CrateBlock)
                this.tag(ECTags.Blocks.WOODEN_CRATES).add(block);
            else if(block instanceof ChestBlock)
                this.tag(Tags.Blocks.CHESTS_WOODEN).add(block);
        }

        for(int j = 0; j < Arrays.stream(RockType.values()).count(); j++)
        {
            // Rocks
            this.tag(Tags.Blocks.STONE).add(InitRockBlocks.ROCK_BLOCKS.get(RockType.byId(j)).get());
            this.tag(BlockTags.BASE_STONE_OVERWORLD).add(InitRockBlocks.ROCK_BLOCKS.get(RockType.byId(j)).get());
            // Cobblestones
            this.tag(Tags.Blocks.COBBLESTONE).add(InitRockBlocks.ROCK_COBBLESTONES.get(RockType.byId(j)).get());
        }

        // Adding tags to existing MC/Forge tags
        this.tag(Tags.Blocks.CHESTS).addTag(Tags.Blocks.CHESTS_WOODEN);
        this.tag(BlockTags.BEDS).addTag(ECTags.Blocks.FANCY_BEDS);
        this.tag(ECTags.ForgeBlocks.CRATES).addTag(ECTags.Blocks.WOODEN_CRATES);
        this.tag(BlockTags.FENCES).addTag(Tags.Blocks.FENCES);
        this.tag(BlockTags.WOODEN_DOORS).addTag(ECTags.Blocks.WOODEN_DOORS);
        this.tag(ECTags.Blocks.DOORS).addTag(ECTags.Blocks.WOODEN_DOORS);
        this.tag(BlockTags.DOORS).addTag(ECTags.Blocks.DOORS);
        this.tag(BlockTags.FENCE_GATES).addTag(Tags.Blocks.FENCE_GATES);
    }
}