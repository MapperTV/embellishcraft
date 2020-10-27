package tv.mapper.embellishcraft.inventory.container;

import net.minecraft.inventory.container.ContainerType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import tv.mapper.embellishcraft.ECConstants;

public class ModContainers
{
    public static final DeferredRegister<ContainerType<?>> CONTAINERS = DeferredRegister.create(ForgeRegistries.CONTAINERS, ECConstants.MODID);

    public static final RegistryObject<ContainerType<VerticalChestContainer>> VERTICAL_9X1 = CONTAINERS.register("vertical_9x1", () -> new ContainerType<>(VerticalChestContainer::createGeneric9X1));
    public static final RegistryObject<ContainerType<VerticalChestContainer>> VERTICAL_9X2 = CONTAINERS.register("vertical_9x2", () -> new ContainerType<>(VerticalChestContainer::createGeneric9X1));
    public static final RegistryObject<ContainerType<VerticalChestContainer>> VERTICAL_9X3 = CONTAINERS.register("vertical_9x3", () -> new ContainerType<>(VerticalChestContainer::createGeneric9X1));
    public static final RegistryObject<ContainerType<VerticalChestContainer>> VERTICAL_9X4 = CONTAINERS.register("vertical_9x4", () -> new ContainerType<>(VerticalChestContainer::createGeneric9X1));
    public static final RegistryObject<ContainerType<VerticalChestContainer>> VERTICAL_9X5 = CONTAINERS.register("vertical_9x5", () -> new ContainerType<>(VerticalChestContainer::createGeneric9X1));
    public static final RegistryObject<ContainerType<VerticalChestContainer>> VERTICAL_9X6 = CONTAINERS.register("vertical_9x6", () -> new ContainerType<>(VerticalChestContainer::createGeneric9X1));

    public static final RegistryObject<ContainerType<CrateContainer>> CRATE_4X4 = CONTAINERS.register("crate_4x4", () -> new ContainerType<>(CrateContainer::createCrate4X4));
    public static final RegistryObject<ContainerType<CrateContainer>> CRATE_4X8 = CONTAINERS.register("crate_4x8", () -> new ContainerType<>(CrateContainer::createCrate4X8));
}