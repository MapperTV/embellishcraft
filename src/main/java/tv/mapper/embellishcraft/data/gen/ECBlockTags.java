package tv.mapper.embellishcraft.data.gen;

import java.util.Arrays;

import net.minecraft.block.Block;
import net.minecraft.block.ChestBlock;
import net.minecraft.block.DoorBlock;
import net.minecraft.block.FenceBlock;
import net.minecraft.block.FenceGateBlock;
import net.minecraft.block.PressurePlateBlock;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.StairsBlock;
import net.minecraft.block.WallBlock;
import net.minecraft.block.material.Material;
import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.fml.RegistryObject;
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
import tv.mapper.embellishcraft.util.RockType;
import tv.mapper.mapperbase.block.CustomButtonBlock;
import tv.mapper.mapperbase.block.CustomLadderBlock;

public class ECBlockTags extends BlockTagsProvider
{

    public ECBlockTags(DataGenerator generatorIn, ExistingFileHelper existingFileHelper)
    {
        super(generatorIn, ECConstants.MODID, existingFileHelper);
    }

    public void registerTags()
    {
        for(RegistryObject<Block> object : ECBlockRegistry.BLOCKS.getEntries())
        {
            Block block = object.get();

            if(block instanceof WallBlock)
                this.getOrCreateBuilder(BlockTags.WALLS).add(block);
            else if(block instanceof SlabBlock)
                this.getOrCreateBuilder(BlockTags.SLABS).add(block);
            else if(block instanceof StairsBlock)
                this.getOrCreateBuilder(BlockTags.STAIRS).add(block);
            else if(block instanceof PressurePlateBlock)
                this.getOrCreateBuilder(BlockTags.PRESSURE_PLATES).add(block);
            else if(block instanceof CustomButtonBlock)
                this.getOrCreateBuilder(BlockTags.BUTTONS).add(block);
            else if(block instanceof FenceBlock)
                this.getOrCreateBuilder(Tags.Blocks.FENCES).add(block);
            else if(block instanceof FenceGateBlock)
                this.getOrCreateBuilder(Tags.Blocks.FENCE_GATES).add(block);
            else if(block instanceof CustomBedBlock)
                this.getOrCreateBuilder(ECTags.Blocks.FANCY_BEDS).add(block);
            else if(block instanceof CouchBlock)
                this.getOrCreateBuilder(ECTags.Blocks.COUCHES).add(block);
            else if(block instanceof CustomLadderBlock)
                this.getOrCreateBuilder(BlockTags.CLIMBABLE).add(block);
            else if(block instanceof ChairBlock)
                this.getOrCreateBuilder(ECTags.ForgeBlocks.CHAIRS).add(block);
            else if(block instanceof TableBlock || block instanceof TerraceTableBlock)
                this.getOrCreateBuilder(ECTags.ForgeBlocks.TABLES).add(block);
            else if(block instanceof SuspendedStairsBlock)
                this.getOrCreateBuilder(ECTags.Blocks.SUSPENDED_STAIRS).add(block);
            else if(block instanceof DoorBlock)
            {
                if(block.getDefaultState().getMaterial().equals(Material.WOOD))
                    this.getOrCreateBuilder(ECTags.Blocks.WOODEN_DOORS).add(block);
                this.getOrCreateBuilder(ECTags.Blocks.DOORS).add(block);
            }
            else if(block instanceof CrateBlock)
                this.getOrCreateBuilder(ECTags.Blocks.WOODEN_CRATES).add(block);
            else if(block instanceof ChestBlock)
                this.getOrCreateBuilder(Tags.Blocks.CHESTS_WOODEN).add(block);
        }

        for(int j = 0; j < Arrays.stream(RockType.values()).count(); j++)
        {
            // Rocks
            this.getOrCreateBuilder(Tags.Blocks.STONE).add(ECBlockRegistry.ROCK_BLOCKS.get(RockType.byId(j)).get());
            this.getOrCreateBuilder(BlockTags.BASE_STONE_OVERWORLD).add(ECBlockRegistry.ROCK_BLOCKS.get(RockType.byId(j)).get());
            // Cobblestones
            this.getOrCreateBuilder(Tags.Blocks.COBBLESTONE).add(ECBlockRegistry.ROCK_COBBLESTONES.get(RockType.byId(j)).get());
        }

        // Adding tags to existing MC/Forge tags
        this.getOrCreateBuilder(Tags.Blocks.CHESTS).addTag(Tags.Blocks.CHESTS_WOODEN);
        this.getOrCreateBuilder(BlockTags.BEDS).addTag(ECTags.Blocks.FANCY_BEDS);
        this.getOrCreateBuilder(ECTags.ForgeBlocks.CRATES).addTag(ECTags.Blocks.WOODEN_CRATES);
        this.getOrCreateBuilder(BlockTags.FENCES).addTag(Tags.Blocks.FENCES);
        this.getOrCreateBuilder(BlockTags.WOODEN_DOORS).addTag(ECTags.Blocks.WOODEN_DOORS);
        this.getOrCreateBuilder(ECTags.Blocks.DOORS).addTag(ECTags.Blocks.WOODEN_DOORS);
        this.getOrCreateBuilder(BlockTags.DOORS).addTag(ECTags.Blocks.DOORS);
        this.getOrCreateBuilder(BlockTags.FENCE_GATES).addTag(Tags.Blocks.FENCE_GATES);
    }
}