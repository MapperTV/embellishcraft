package tv.mapper.embellishcraft.init;

import net.minecraft.inventory.container.Container;
import net.minecraft.inventory.container.ContainerType;
import net.minecraft.util.registry.Registry;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import tv.mapper.embellishcraft.ECConstants;
import tv.mapper.embellishcraft.inventory.container.CrateContainer;
import tv.mapper.embellishcraft.inventory.container.VerticalChestContainer;

@EventBusSubscriber(bus = Bus.MOD)
public class ModContainers<T extends Container> extends ContainerType<T>
{
    public ModContainers(IFactory<T> factory)
    {
        super(factory);
    }

    public static final ModContainers<VerticalChestContainer> VERTICAL_9X1 = register("vertical_9x1", VerticalChestContainer::createGeneric9X1);
    public static final ModContainers<VerticalChestContainer> VERTICAL_9X2 = register("vertical_9x2", VerticalChestContainer::createGeneric9X2);
    public static final ModContainers<VerticalChestContainer> VERTICAL_9X3 = register("vertical_9x3", VerticalChestContainer::createGeneric9X3);
    public static final ModContainers<VerticalChestContainer> VERTICAL_9X4 = register("vertical_9x4", VerticalChestContainer::createGeneric9X4);
    public static final ModContainers<VerticalChestContainer> VERTICAL_9X5 = register("vertical_9x5", VerticalChestContainer::createGeneric9X5);
    public static final ModContainers<VerticalChestContainer> VERTICAL_9X6 = register("vertical_9x6", VerticalChestContainer::createGeneric9X6);

    public static final ModContainers<CrateContainer> CRATE_4X4 = register("crate_4x4", CrateContainer::createCrate4X4);
    public static final ModContainers<CrateContainer> CRATE_4X8 = register("crate_4x8", CrateContainer::createCrate4X8);

    @SuppressWarnings("deprecation")
    private static <T extends Container> ModContainers<T> register(String key, ContainerType.IFactory<T> factory)
    {
        return Registry.register(Registry.MENU, ECConstants.MODID + ":" + key, new ModContainers<>(factory));
    }
}