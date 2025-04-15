package tv.mapper.embellishcraft.lights.data;

import java.util.Objects;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.DyeColor;
import net.neoforged.neoforge.client.model.generators.ModelFile.UncheckedModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import tv.mapper.embellishcraft.core.ECConstants;
import tv.mapper.embellishcraft.core.data.ECBlockStates;
import tv.mapper.embellishcraft.lights.block.InitLightBlocks;
import tv.mapper.embellishcraft.lights.block.LampBlock;

public class LightBlockStates extends ECBlockStates
{

    public LightBlockStates(PackOutput output, String modid, ExistingFileHelper exFileHelper, String name)
    {
        super(output, modid, exFileHelper, name);
    }

    @Override
    protected void registerStatesAndModels()
    {
        for(int j = 0; j < DyeColor.values().length; j++)
        {
            tableLampBlock(InitLightBlocks.TABLE_LAMP_BLOCKS.get(DyeColor.byId(j)).get());
            tableLampBlock(InitLightBlocks.MANUAL_TABLE_LAMP_BLOCKS.get(DyeColor.byId(j)).get());
        }
    }

    private void tableLampBlock(LampBlock block)
    {
        String name = Objects.requireNonNull(BuiltInRegistries.BLOCK.getKey(block)).getPath();
        getVariantBuilder(block).partialState().with(LampBlock.LIT, true).modelForState().modelFile(new UncheckedModelFile(ECConstants.MODID + ":block/" + name + "_on")).addModel().partialState().with(LampBlock.LIT, false).modelForState().modelFile(new UncheckedModelFile(ECConstants.MODID + ":block/" + name)).addModel();
    }
}
