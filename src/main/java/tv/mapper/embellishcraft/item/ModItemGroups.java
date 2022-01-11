package tv.mapper.embellishcraft.item;

import java.util.Random;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import tv.mapper.embellishcraft.block.ECBlockRegistry;
import tv.mapper.embellishcraft.building.world.items.InitBuildingItems;
import tv.mapper.embellishcraft.industrial.world.items.InitIndustrialItems;
import tv.mapper.embellishcraft.rocks.world.level.blocks.InitRockBlocks;
import tv.mapper.embellishcraft.util.McWoods;
import tv.mapper.embellishcraft.util.RockType;

public class ModItemGroups
{
    static Random rand = new Random();

    public static final CreativeModeTab EMBELLISHCRAFT = new CreativeModeTab("embellishcraft_group")
    {
        @Override
        public ItemStack makeIcon()
        {
            return new ItemStack(ECBlockRegistry.CHAIR_BLOCKS.get(McWoods.byId(rand.nextInt(5))).get());
        }
    };

    public static final CreativeModeTab EMBELLISHCRAFT_ROCKS = new CreativeModeTab("embellishcraft_rocks_group")
    {
        @Override
        public ItemStack makeIcon()
        {
            return new ItemStack(InitRockBlocks.POLISHED_ROCK_BLOCKS.get(RockType.byId(rand.nextInt(5))).get());
        }
    };

    public static final CreativeModeTab EMBELLISHCRAFT_INDUSTRIAL = new CreativeModeTab("embellishcraft_industrial_group")
    {
        @Override
        public ItemStack makeIcon()
        {
            return new ItemStack(InitIndustrialItems.WARNING_STEEL_DOOR_ITEM.get());
        }
    };

    public static final CreativeModeTab EMBELLISHCRAFT_BUILDING = new CreativeModeTab("embellishcraft_building_group")
    {
        @Override
        public ItemStack makeIcon()
        {
            return new ItemStack(InitBuildingItems.DARK_BRICKS_ITEM.get());
        }
    };
}