package tv.mapper.embellishcraft.core.data;

import java.util.concurrent.CompletableFuture;

import net.minecraft.core.HolderLookup.Provider;
import net.minecraft.data.PackOutput;
import tv.mapper.mapperbase.api.data.world.BaseWorldgenProvider;

public class ECWorldgen extends BaseWorldgenProvider
{
    public ECWorldgen(PackOutput output, CompletableFuture<Provider> registries, String modid, String name)
    {
        super(output, registries, modid, name);
    }
}
