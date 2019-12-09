package tv.mapper.embellishcraft.block;

import javax.annotation.Nullable;

import net.minecraft.block.Block;
import net.minecraft.block.BlockRenderType;
import net.minecraft.block.BlockState;
import net.minecraft.block.ContainerBlock;
import net.minecraft.block.HorizontalBlock;
import net.minecraft.block.IWaterLoggable;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.fluid.Fluids;
import net.minecraft.fluid.IFluidState;
import net.minecraft.inventory.DoubleSidedInventory;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.InventoryHelper;
import net.minecraft.inventory.container.Container;
import net.minecraft.inventory.container.INamedContainerProvider;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.item.ItemStack;
import net.minecraft.pathfinding.PathType;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.EnumProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Direction;
import net.minecraft.util.Hand;
import net.minecraft.util.Mirror;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import tv.mapper.embellishcraft.inventory.container.VerticalChestContainer;
import tv.mapper.embellishcraft.state.properties.VerticalChestType;
import tv.mapper.embellishcraft.tileentity.VerticalChestTileEntity;

public class VerticalChestBlock extends ContainerBlock implements IWaterLoggable
{
    public static final DirectionProperty FACING = HorizontalBlock.HORIZONTAL_FACING;
    public static final EnumProperty<VerticalChestType> TYPE = EnumProperty.create("type", VerticalChestType.class);
    public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;
    protected static final VoxelShape SHAPE_NORTH = Block.makeCuboidShape(1.0D, 0.0D, 0.0D, 15.0D, 14.0D, 15.0D);
    protected static final VoxelShape SHAPE_SOUTH = Block.makeCuboidShape(1.0D, 0.0D, 1.0D, 15.0D, 14.0D, 16.0D);
    protected static final VoxelShape SHAPE_WEST = Block.makeCuboidShape(0.0D, 0.0D, 1.0D, 15.0D, 14.0D, 15.0D);
    protected static final VoxelShape SHAPE_EAST = Block.makeCuboidShape(1.0D, 0.0D, 1.0D, 16.0D, 14.0D, 15.0D);
    protected static final VoxelShape field_196315_B = Block.makeCuboidShape(1.0D, 0.0D, 1.0D, 15.0D, 14.0D, 15.0D);
    private static final VerticalChestBlock.InventoryFactory<IInventory> field_220109_i = new VerticalChestBlock.InventoryFactory<IInventory>()
    {
        public IInventory forDouble(VerticalChestTileEntity p_212855_1_, VerticalChestTileEntity p_212855_2_)
        {
            return new DoubleSidedInventory(p_212855_1_, p_212855_2_);
        }

        public IInventory forSingle(VerticalChestTileEntity p_212856_1_)
        {
            return p_212856_1_;
        }
    };
    private static final VerticalChestBlock.InventoryFactory<INamedContainerProvider> field_220110_j = new VerticalChestBlock.InventoryFactory<INamedContainerProvider>()
    {
        public INamedContainerProvider forDouble(final VerticalChestTileEntity p_212855_1_, final VerticalChestTileEntity p_212855_2_)
        {
            final IInventory iinventory = new DoubleSidedInventory(p_212855_1_, p_212855_2_);
            return new INamedContainerProvider()
            {
                @Nullable
                public Container createMenu(int p_createMenu_1_, PlayerInventory p_createMenu_2_, PlayerEntity p_createMenu_3_)
                {
                    if(p_212855_1_.canOpen(p_createMenu_3_) && p_212855_2_.canOpen(p_createMenu_3_))
                    {
                        p_212855_1_.fillWithLoot(p_createMenu_2_.player);
                        p_212855_2_.fillWithLoot(p_createMenu_2_.player);
                        return VerticalChestContainer.createGeneric9X6(p_createMenu_1_, p_createMenu_2_, iinventory);
                    }
                    else
                    {
                        return null;
                    }
                }

                public ITextComponent getDisplayName()
                {
                    if(p_212855_1_.hasCustomName())
                    {
                        return p_212855_1_.getDisplayName();
                    }
                    else
                    {
                        return (ITextComponent)(p_212855_2_.hasCustomName() ? p_212855_2_.getDisplayName() : new TranslationTextComponent("embellishcraft.container.locker_tall"));
                    }
                }
            };
        }

        public INamedContainerProvider forSingle(VerticalChestTileEntity p_212856_1_)
        {
            return p_212856_1_;
        }
    };

    public VerticalChestBlock(Block.Properties properties)
    {
        super(properties);
        this.setDefaultState(this.stateContainer.getBaseState().with(FACING, Direction.NORTH).with(TYPE, VerticalChestType.SINGLE).with(WATERLOGGED, Boolean.valueOf(false)));
    }

    /**
     * @deprecated call via {@link IBlockState#hasCustomBreakingProgress()} whenever possible. Implementing/overriding is
     *             fine.
     */
    @OnlyIn(Dist.CLIENT)
    public boolean hasCustomBreakingProgress(BlockState state)
    {
        return true;
    }

    /**
     * The type of render function called. MODEL for mixed tesr and static model, MODELBLOCK_ANIMATED for TESR-only,
     * LIQUID for vanilla liquids, INVISIBLE to skip all rendering
     * @deprecated call via {@link IBlockState#getRenderType()} whenever possible. Implementing/overriding is fine.
     */
    public BlockRenderType getRenderType(BlockState state)
    {
        return BlockRenderType.ENTITYBLOCK_ANIMATED;
    }

    /**
     * Update the provided state given the provided neighbor facing and neighbor state, returning a new state.
     * For example, fences make their connections to the passed in state if possible, and wet concrete powder immediately
     * returns its solidified counterpart.
     * Note that this method should ideally consider only the specific face passed in.
     */
    @SuppressWarnings("deprecation")
    public BlockState updatePostPlacement(BlockState stateIn, Direction facing, BlockState facingState, IWorld worldIn, BlockPos currentPos, BlockPos facingPos)
    {
        if(stateIn.get(WATERLOGGED))
        {
            worldIn.getPendingFluidTicks().scheduleTick(currentPos, Fluids.WATER, Fluids.WATER.getTickRate(worldIn));
        }

        if(facingState.getBlock() == this && facing.getAxis().isVertical())
        {
            VerticalChestType chesttype = facingState.get(TYPE);
            if(stateIn.get(TYPE) == VerticalChestType.SINGLE && chesttype != VerticalChestType.SINGLE && stateIn.get(FACING) == facingState.get(FACING) && getDirectionToAttached(facingState) == facing.getOpposite())
            {
                return stateIn.with(TYPE, chesttype.opposite());
            }
        }
        else if(getDirectionToAttached(stateIn) == facing)
        {
            return stateIn.with(TYPE, VerticalChestType.SINGLE);
        }

        return super.updatePostPlacement(stateIn, facing, facingState, worldIn, currentPos, facingPos);
    }

    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context)
    {
        if(state.get(TYPE) == VerticalChestType.SINGLE)
        {
            return field_196315_B;
        }
        else
        {
            switch(getDirectionToAttached(state))
            {
                case NORTH:
                default:
                    return SHAPE_NORTH;
                case SOUTH:
                    return SHAPE_SOUTH;
                case WEST:
                    return SHAPE_WEST;
                case EAST:
                    return SHAPE_EAST;
            }
        }
    }

    /**
     * Returns a facing pointing from the given state to its attached double chest
     */
    public static Direction getDirectionToAttached(BlockState state)
    {
        return state.get(TYPE) == VerticalChestType.BOTTOM ? Direction.UP : Direction.DOWN;
    }

    public BlockState getStateForPlacement(BlockItemUseContext context)
    {
        VerticalChestType chesttype = VerticalChestType.SINGLE;
        Direction direction = context.getPlacementHorizontalFacing().getOpposite();
        IFluidState ifluidstate = context.getWorld().getFluidState(context.getPos());
        boolean flag = context.isPlacerSneaking();
        Direction direction1 = context.getFace();
        
        if(direction1.getAxis().isVertical() && flag)
        {
            BlockState state = context.getWorld().getBlockState(context.getPos().offset(direction1.getOpposite()));

            if(state.getBlock() == this && state.get(FACING) == direction && state.get(TYPE) == VerticalChestType.SINGLE)
            {
                switch(context.getFace())
                {
                    case DOWN:
                        chesttype = VerticalChestType.BOTTOM;
                        break;
                    case UP:
                        chesttype = VerticalChestType.TOP;
                        break;
                    default:
                        chesttype = VerticalChestType.SINGLE;
                        break;
                }
            }
        }

        if(chesttype == VerticalChestType.SINGLE && !flag)
        {
            BlockPos pos = context.getPos();

            if(context.getWorld().getBlockState(pos.up()).getBlock() == this && context.getWorld().getBlockState(pos.up()).get(TYPE) == VerticalChestType.SINGLE)
                chesttype = VerticalChestType.BOTTOM;
            else if(context.getWorld().getBlockState(pos.down()).getBlock() == this && context.getWorld().getBlockState(pos.down()).get(TYPE) == VerticalChestType.SINGLE)
                chesttype = VerticalChestType.TOP;
        }

        return this.getDefaultState().with(FACING, direction).with(TYPE, chesttype).with(WATERLOGGED, Boolean.valueOf(ifluidstate.getFluid() == Fluids.WATER));
    }

    @SuppressWarnings("deprecation")
    public IFluidState getFluidState(BlockState state)
    {
        return state.get(WATERLOGGED) ? Fluids.WATER.getStillFluidState(false) : super.getFluidState(state);
    }

    /**
     * Called by ItemBlocks after a block is set in the world, to allow post-place logic
     */
    public void onBlockPlacedBy(World worldIn, BlockPos pos, BlockState state, LivingEntity placer, ItemStack stack)
    {
        if(stack.hasDisplayName())
        {
            TileEntity tileentity = worldIn.getTileEntity(pos);
            if(tileentity instanceof VerticalChestTileEntity)
            {
                ((VerticalChestTileEntity)tileentity).setCustomName(stack.getDisplayName());
            }
        }

    }

    @SuppressWarnings("deprecation")
    public void onReplaced(BlockState state, World worldIn, BlockPos pos, BlockState newState, boolean isMoving)
    {
        if(state.getBlock() != newState.getBlock())
        {
            TileEntity tileentity = worldIn.getTileEntity(pos);
            if(tileentity instanceof IInventory)
            {
                InventoryHelper.dropInventoryItems(worldIn, pos, (IInventory)tileentity);
                worldIn.updateComparatorOutputLevel(pos, this);
            }

            super.onReplaced(state, worldIn, pos, newState, isMoving);
        }
    }

    public boolean onBlockActivated(BlockState state, World worldIn, BlockPos pos, PlayerEntity player, Hand handIn, BlockRayTraceResult hit)
    {
        if(worldIn.isRemote)
        {
            return true;
        }
        else
        {
            INamedContainerProvider inamedcontainerprovider = this.getContainer(state, worldIn, pos);
            if(inamedcontainerprovider != null)
            {
                player.openContainer(inamedcontainerprovider);
            }

            return true;
        }
    }

    @Nullable
    public static <T> T getChestInventory(BlockState state, IWorld world, BlockPos pos, boolean allowBlocked, VerticalChestBlock.InventoryFactory<T> inv)
    {
        TileEntity tileentity = world.getTileEntity(pos);
        if(!(tileentity instanceof VerticalChestTileEntity))
        {
            return (T)null;
        }
        else if(!allowBlocked && isBlocked(world, pos))
        {
            return (T)null;
        }
        else
        {
            VerticalChestTileEntity chesttileentity = (VerticalChestTileEntity)tileentity;
            VerticalChestType chesttype = state.get(TYPE);
            if(chesttype == VerticalChestType.SINGLE)
            {
                return inv.forSingle(chesttileentity);
            }
            else
            {
                BlockPos blockpos = pos.offset(getDirectionToAttached(state));
                BlockState blockstate = world.getBlockState(blockpos);
                if(blockstate.getBlock() == state.getBlock())
                {
                    VerticalChestType chesttype1 = blockstate.get(TYPE);
                    if(chesttype1 != VerticalChestType.SINGLE && chesttype != chesttype1 && blockstate.get(FACING) == state.get(FACING))
                    {
                        if(!allowBlocked && isBlocked(world, blockpos))
                        {
                            return (T)null;
                        }

                        TileEntity tileentity1 = world.getTileEntity(blockpos);
                        if(tileentity1 instanceof VerticalChestTileEntity)
                        {
                            VerticalChestTileEntity chesttileentity1 = chesttype == VerticalChestType.TOP ? chesttileentity : (VerticalChestTileEntity)tileentity1;
                            VerticalChestTileEntity chesttileentity2 = chesttype == VerticalChestType.TOP ? (VerticalChestTileEntity)tileentity1 : chesttileentity;
                            return inv.forDouble(chesttileentity1, chesttileentity2);
                        }
                    }
                }

                return inv.forSingle(chesttileentity);
            }
        }
    }

    @Nullable
    public static IInventory getInventory(BlockState state, World world, BlockPos pos, boolean allowBlocked)
    {
        return getChestInventory(state, world, pos, allowBlocked, field_220109_i);
    }

    @Nullable
    public INamedContainerProvider getContainer(BlockState state, World worldIn, BlockPos pos)
    {
        return getChestInventory(state, worldIn, pos, false, field_220110_j);
    }

    public TileEntity createNewTileEntity(IBlockReader worldIn)
    {
        return new VerticalChestTileEntity();
    }

    private static boolean isBlocked(IWorld world, BlockPos pos)
    {
        return isFacingSolidBlock(world, pos);
    }

    private static boolean isFacingSolidBlock(IBlockReader block, BlockPos world)
    {
        BlockPos blockpos;

        switch(block.getBlockState(world).get(FACING))
        {
            case EAST:
                blockpos = world.east();
                break;
            case NORTH:
                blockpos = world.north();
                break;
            case SOUTH:
                blockpos = world.south();
                break;
            case WEST:
                blockpos = world.west();
                break;
            default:
                blockpos = null;
                break;
        }

        if(blockpos == null)
            return false;
        return block.getBlockState(blockpos).isNormalCube(block, blockpos);
    }

    /**
     * @deprecated call via {@link IBlockState#hasComparatorInputOverride()} whenever possible. Implementing/overriding
     *             is fine.
     */
    public boolean hasComparatorInputOverride(BlockState state)
    {
        return true;
    }

    /**
     * @deprecated call via {@link IBlockState#getComparatorInputOverride(World,BlockPos)} whenever possible.
     *             Implementing/overriding is fine.
     */
    public int getComparatorInputOverride(BlockState blockState, World worldIn, BlockPos pos)
    {
        return Container.calcRedstoneFromInventory(getInventory(blockState, worldIn, pos, false));
    }

    /**
     * Returns the blockstate with the given rotation from the passed blockstate. If inapplicable, returns the passed
     * blockstate.
     * @deprecated call via {@link IBlockState#withRotation(Rotation)} whenever possible. Implementing/overriding is
     *             fine.
     */
    public BlockState rotate(BlockState state, Rotation rot)
    {
        return state.with(FACING, rot.rotate(state.get(FACING)));
    }

    /**
     * Returns the blockstate with the given mirror of the passed blockstate. If inapplicable, returns the passed
     * blockstate.
     * @deprecated call via {@link IBlockState#withMirror(Mirror)} whenever possible. Implementing/overriding is fine.
     */
    public BlockState mirror(BlockState state, Mirror mirrorIn)
    {
        return state.rotate(mirrorIn.toRotation(state.get(FACING)));
    }

    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder)
    {
        builder.add(FACING, TYPE, WATERLOGGED);
    }

    public boolean allowsMovement(BlockState state, IBlockReader worldIn, BlockPos pos, PathType type)
    {
        return false;
    }

    interface InventoryFactory<T>
    {
        T forDouble(VerticalChestTileEntity p_212855_1_, VerticalChestTileEntity p_212855_2_);

        T forSingle(VerticalChestTileEntity p_212856_1_);
    }
}
