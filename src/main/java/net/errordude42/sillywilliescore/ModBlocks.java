package net.errordude42.sillywilliescore;

import net.errordude42.sillywilliescore.block.custom.ModFlammableRotatedPillarBlock;
import net.errordude42.sillywilliescore.block.custom.ModPlantBlock;
import net.errordude42.sillywilliescore.block.custom.ModSaplingBlock;
import net.errordude42.sillywilliescore.block.sign.ModHangingSignBlock;
import net.errordude42.sillywilliescore.block.sign.ModStandingSignBlock;
import net.errordude42.sillywilliescore.block.sign.ModWallHangingSignBlock;
import net.errordude42.sillywilliescore.block.sign.ModWallSignBlock;
import net.errordude42.sillywilliescore.item.ModItems;
import net.errordude42.sillywilliescore.util.ModWoodTypes;
import net.errordude42.sillywilliescore.worldgen.tree.ModTreeGrowers;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;
@SuppressWarnings("NullableProblems")
public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(SillyWilliesCore.MOD_ID);

    public static final DeferredBlock<Block> SILT = registerBlock("silt",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of()
                    .strength(1f).sound(SoundType.MUD).mapColor(MapColor.CLAY)
            ));

    public static final DeferredBlock<Block> ENTANGULUM_ORE = registerBlock("entangulumore",
            () -> new DropExperienceBlock(UniformInt.of(2, 4),
                    BlockBehaviour.Properties.of().strength(6f).sound(SoundType.DEEPSLATE).mapColor(MapColor.DEEPSLATE).
                            requiresCorrectToolForDrops()
            ));
    public static final DeferredBlock<Block> GEOSTONE = registerBlock("geostone",
            () -> new Block(BlockBehaviour.Properties.of().strength(3f).sound(SoundType.DEEPSLATE).mapColor(MapColor.DEEPSLATE).
                            requiresCorrectToolForDrops()
            ));
    public static final DeferredBlock<StairBlock> GEOSTONE_STAIRS = registerBlock("geostone_stairs",
            () -> new StairBlock(ModBlocks.GEOSTONE.get().defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(3f).sound(SoundType.DEEPSLATE).mapColor(MapColor.DEEPSLATE).
                            requiresCorrectToolForDrops()
            ));
    public static final DeferredBlock<StairBlock> GEOSTONE_COBBLE_STAIRS = registerBlock("geostone_cobble_stairs",
            () -> new StairBlock(ModBlocks.GEOSTONE.get().defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(3f).sound(SoundType.DEEPSLATE).mapColor(MapColor.DEEPSLATE).
                            requiresCorrectToolForDrops()
            ));
    public static final DeferredBlock<SlabBlock> GEOSTONE_SLAB = registerBlock("geostone_slab",
            () -> new SlabBlock(
                    BlockBehaviour.Properties.of().strength(3f).sound(SoundType.DEEPSLATE).mapColor(MapColor.DEEPSLATE).
                            requiresCorrectToolForDrops()
            ));
    public static final DeferredBlock<SlabBlock> GEOSTONE_COBBLE_SLAB = registerBlock("geostone_cobble_slab",
            () -> new SlabBlock(
                    BlockBehaviour.Properties.of().strength(3f).sound(SoundType.DEEPSLATE).mapColor(MapColor.DEEPSLATE).
                            requiresCorrectToolForDrops()
            ));
    public static final DeferredBlock<WallBlock> GEOSTONE_COBBLE_WALL = registerBlock("geostone_cobble_wall",
            () -> new WallBlock(
                    BlockBehaviour.Properties.of().strength(3f).sound(SoundType.DEEPSLATE).mapColor(MapColor.DEEPSLATE).
                            requiresCorrectToolForDrops()
            ));
    public static final DeferredBlock<PressurePlateBlock> GEOSTONE_PRESSURE_PLATE = registerBlock("geostone_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.STONE,
                    BlockBehaviour.Properties.of().strength(3f).sound(SoundType.DEEPSLATE).mapColor(MapColor.DEEPSLATE).
                            requiresCorrectToolForDrops()
            ));
    public static final DeferredBlock<ButtonBlock> GEOSTONE_BUTTON = registerBlock("geostone_button",
            () -> new ButtonBlock(BlockSetType.STONE,20,
                    BlockBehaviour.Properties.of().strength(3f).sound(SoundType.DEEPSLATE).mapColor(MapColor.DEEPSLATE).
                            requiresCorrectToolForDrops()
                            .noCollission()
            ));

    public static final DeferredBlock<Block> TRIANGULUMORE_DEEPSLATE = registerBlock("triangulumore_deepslate",
            () -> new Block(BlockBehaviour.Properties.of().strength(6f).sound(SoundType.DEEPSLATE).mapColor(MapColor.DEEPSLATE).
                    requiresCorrectToolForDrops()
            ));

    public static final DeferredBlock<Block> BLOCK_OF_RAW_TRIANGULUM = registerBlock("block_of_raw_triangulum",
            () -> new Block(BlockBehaviour.Properties.of().strength(4f).sound(SoundType.METAL).mapColor(MapColor.COLOR_YELLOW).
                    requiresCorrectToolForDrops()
            ));

    public static final DeferredBlock<Block> BLOCK_OF_RAW_ENTANGULUM = registerBlock("block_of_raw_entangulum",
            () -> new Block(BlockBehaviour.Properties.of().strength(4f).sound(SoundType.METAL).mapColor(MapColor.COLOR_PURPLE).
                    requiresCorrectToolForDrops()
            ));

    public static final DeferredBlock<Block> TRIANGULUM_BRICKS = registerBlock("triangulum_bricks",
            () -> new Block(BlockBehaviour.Properties.of().strength(4f).sound(SoundType.METAL).mapColor(MapColor.COLOR_YELLOW).
                    requiresCorrectToolForDrops()
            ));
    public static final DeferredBlock<Block> CHISLED_GEOSTONE = registerBlock("chisled_geostone",
            () -> new Block(BlockBehaviour
            .Properties.of()
            .strength(3f)
            .sound(SoundType.DEEPSLATE)
            .mapColor(MapColor.DEEPSLATE)
            .requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> SMOOTH_GEOSTONE = registerBlock("smooth_geostone",
            () -> new Block(BlockBehaviour
                    .Properties.of()
                    .strength(3f)
                    .sound(SoundType.DEEPSLATE)
                    .mapColor(MapColor.DEEPSLATE)
                    .requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> MOSSY_GEOSTONE_BRICKS = registerBlock("mossy_geostone_bricks",
            () -> new Block(BlockBehaviour
                    .Properties.of()
                    .strength(3f)
                    .sound(SoundType.DEEPSLATE)
                    .mapColor(MapColor.DEEPSLATE)
                    .requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> GEOSTONE_BRICKS = registerBlock("geostone_bricks",
            () -> new Block(BlockBehaviour
                    .Properties.of()
                    .strength(3f)
                    .sound(SoundType.DEEPSLATE)
                    .mapColor(MapColor.DEEPSLATE)
                    .requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> CRACKED_GEOSTONE_BRICKS = registerBlock("cracked_geostone_bricks",
            () -> new Block(BlockBehaviour
                    .Properties.of()
                    .strength(3f)
                    .sound(SoundType.DEEPSLATE)
                    .mapColor(MapColor.DEEPSLATE)
                    .requiresCorrectToolForDrops()));

    public static final DeferredBlock<SlabBlock> SMOOTH_GEOSTONE_SLAB = registerBlock("smooth_geostone_slab",
            () -> new SlabBlock(BlockBehaviour
                    .Properties.of()
                    .strength(3f)
                    .sound(SoundType.DEEPSLATE)
                    .mapColor(MapColor.DEEPSLATE)
                    .requiresCorrectToolForDrops()
                    )
            );
    public static final DeferredBlock<StairBlock> GEOSTONE_BRICKS_STAIRS = registerBlock("geostone_bricks_stairs",
            () -> new StairBlock(ModBlocks.GEOSTONE_BRICKS.get().defaultBlockState(),
                   BlockBehaviour.Properties.of()
                           .strength(3f)
                           .sound(SoundType.DEEPSLATE)
                           .mapColor(MapColor.DEEPSLATE)
                           .requiresCorrectToolForDrops()
            ));
    public static final DeferredBlock<StairBlock> MOSSY_GEOSTONE_BRICKS_STAIRS = registerBlock("mossy_geostone_bricks_stairs",
            () -> new StairBlock(ModBlocks.MOSSY_GEOSTONE_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.of()
                            .strength(3f)
                            .sound(SoundType.DEEPSLATE)
                            .mapColor(MapColor.DEEPSLATE)
                            .requiresCorrectToolForDrops()
            ));
    public static final DeferredBlock<SlabBlock> GEOSTONE_BRICKS_SLAB = registerBlock("geostone_bricks_slab",
            () -> new SlabBlock(BlockBehaviour
                    .Properties.of()
                    .strength(3f)
                    .sound(SoundType.DEEPSLATE)
                    .mapColor(MapColor.DEEPSLATE)
                    .requiresCorrectToolForDrops()
            )
    );
    public static final DeferredBlock<SlabBlock> MOSSY_GEOSTONE_BRICKS_SLAB = registerBlock("mossy_geostone_bricks_slab",
            () -> new SlabBlock(BlockBehaviour
                    .Properties.of()
                    .strength(3f)
                    .sound(SoundType.DEEPSLATE)
                    .mapColor(MapColor.DEEPSLATE)
                    .requiresCorrectToolForDrops()
            )
    );
    public static final DeferredBlock<WallBlock> GEOSTONE_BRICKS_WALL = registerBlock("geostone_bricks_wall",
            () -> new WallBlock(
                    BlockBehaviour.Properties.of()
                            .strength(3f)
                            .sound(SoundType.DEEPSLATE)
                            .mapColor(MapColor.DEEPSLATE)
                            .requiresCorrectToolForDrops()
            ));
    public static final DeferredBlock<WallBlock> MOSSY_GEOSTONE_BRICKS_WALL = registerBlock("mossy_geostone_bricks_wall",
            () -> new WallBlock(
                    BlockBehaviour.Properties.of()
                            .strength(3f)
                            .sound(SoundType.DEEPSLATE)
                            .mapColor(MapColor.DEEPSLATE)
                            .requiresCorrectToolForDrops()
            ));

    public static final DeferredBlock<StairBlock> TRIANGULUM_BRICKS_STAIRS = registerBlock("triangulum_bricks_stairs",
            () -> new StairBlock(ModBlocks.TRIANGULUM_BRICKS.get().defaultBlockState(),
                BlockBehaviour.Properties.of().strength(4f).sound(SoundType.METAL).mapColor(MapColor.COLOR_YELLOW).
                        requiresCorrectToolForDrops()
                    ));
    public static final DeferredBlock<SlabBlock> TRIANGULUM_BRICKS_SLAB = registerBlock("triangulum_bricks_slab",
            () -> new SlabBlock(
                    BlockBehaviour.Properties.of().strength(4f).sound(SoundType.METAL).mapColor(MapColor.COLOR_YELLOW).
                            requiresCorrectToolForDrops()
            ));

    public static final DeferredBlock<PressurePlateBlock> TRIANGULUM_BRICKS_PRESSURE_PLATE = registerBlock("triangulum_bricks_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.IRON,
                    BlockBehaviour.Properties.of().strength(4f).sound(SoundType.METAL).mapColor(MapColor.COLOR_YELLOW).
                            requiresCorrectToolForDrops()
            ));
    public static final DeferredBlock<ButtonBlock> TRIANGULUM_BRICKS_BUTTON = registerBlock("triangulum_bricks_button",
            () -> new ButtonBlock(BlockSetType.IRON,20,
                    BlockBehaviour.Properties.of().strength(4f).sound(SoundType.METAL).mapColor(MapColor.COLOR_YELLOW).
                            requiresCorrectToolForDrops()
                            .noCollission()
            ));

    public static final DeferredBlock<WallBlock> TRIANGULUM_BRICKS_WALL = registerBlock("triangulum_bricks_wall",
            () -> new WallBlock(
                    BlockBehaviour.Properties.of().strength(4f).sound(SoundType.METAL).mapColor(MapColor.COLOR_YELLOW).
                            requiresCorrectToolForDrops()
            ));
    public static final DeferredBlock<Block> GEOSTONE_COBBLE = registerBlock("geostone_cobble",
            () -> new Block(BlockBehaviour.Properties.of().strength(3f).sound(SoundType.DEEPSLATE).mapColor(MapColor.DEEPSLATE).
                    requiresCorrectToolForDrops()
            ));

    public static final DeferredBlock<Block> WONDER_OAK_LOG = registerBlock("wonder_oak_log",
            ()-> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG)));
    public static final DeferredBlock<Block> WONDER_OAK_WOOD = registerBlock("wonder_oak_wood",
            ()-> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WOOD)));
    public static final DeferredBlock<Block> STRIPPED_WONDER_OAK_LOG = registerBlock("stripped_wonder_oak_log",
            ()-> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_LOG)));
    public static final DeferredBlock<Block> STRIPPED_WONDER_OAK_WOOD = registerBlock("stripped_wonder_oak_wood",
            ()-> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_WOOD)));

    public static final DeferredBlock<Block> WONDER_OAK_PLANKS = registerBlock("wonder_oak_planks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)){
                @Override
                public boolean isFlammable( BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 20;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 5;
                }
            }
    );

        public static final DeferredBlock<Block> WONDER_OAK_SIGN = registerBlockNoItem("wonder_oak_sign",
                () -> new ModStandingSignBlock(ModWoodTypes.WONDER_OAK,
                        BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SIGN)));

        public static final DeferredBlock<Block> WONDER_OAK_WALL_SIGN = registerBlockNoItem("wonder_oak_wall_sign",
                () -> new ModWallSignBlock(ModWoodTypes.WONDER_OAK,
                        BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_SIGN)));


        public static final DeferredBlock<Block> WONDER_OAK_HANGING_SIGN = registerBlockNoItem("wonder_oak_hanging_sign",
                () -> new ModHangingSignBlock(ModWoodTypes.WONDER_OAK,
                        BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_HANGING_SIGN)));

        public static final DeferredBlock<Block> WONDER_OAK_WALL_HANGING_SIGN = registerBlockNoItem("wonder_oak_wall_hanging_sign",
                () -> new ModWallHangingSignBlock(ModWoodTypes.WONDER_OAK,
                        BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_HANGING_SIGN)));


    public static final DeferredBlock<TrapDoorBlock> WONDER_OAK_TRAPDOOR = registerBlock("wonder_oak_trapdoor",
            () -> new TrapDoorBlock(BlockSetType.OAK,BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR)){
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 20;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 5;
                }
            }
    );

    public static final DeferredBlock<DoorBlock> WONDER_OAK_DOOR = registerBlock("wonder_oak_door",
            () -> new DoorBlock(BlockSetType.OAK,BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR)){
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 20;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 5;
                }
            }
            );

    public static final DeferredBlock<FenceGateBlock> WONDER_OAK_FENCE_GATE = registerBlock("wonder_oak_fence_gate",
            () -> new FenceGateBlock(WoodType.OAK,BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE)){
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 20;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 5;
                }
            }
    );

    public static final DeferredBlock<FenceBlock> WONDER_OAK_FENCE = registerBlock("wonder_oak_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE)){
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 20;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 5;
                }
            }
            );

    public static final DeferredBlock<ButtonBlock> WONDER_OAK_BUTTON = registerBlock("wonder_oak_button",
            () -> new ButtonBlock(BlockSetType.OAK, 20, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_BUTTON)){
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 20;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 5;
                }
            }
            );

    public static final DeferredBlock<PressurePlateBlock> WONDER_OAK_PRESSURE_PLATE = registerBlock("wonder_oak_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.OAK,BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PRESSURE_PLATE)){
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 20;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 5;
                }
            }
    );



    public static final DeferredBlock<SlabBlock> WONDER_OAK_SLAB = registerBlock("wonder_oak_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SLAB)){
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 20;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 5;
                }
            }
    );

    public static final DeferredBlock<StairBlock> WONDER_OAK_STAIRS = registerBlock("wonder_oak_stairs",
            () -> new StairBlock(ModBlocks.WONDER_OAK_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_STAIRS)){
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 20;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 5;
                }
            }
    );



    public static final DeferredBlock<Block> WONDER_OAK_LEAVES = registerBlock("wonder_oak_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES)){
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 60;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 30;
                }
            }
    );

    public static final DeferredBlock<Block> WONDER_OAK_SAPLING = registerBlock("wonder_oak_wood_sapling",
            ()-> new ModSaplingBlock(
                    ModTreeGrowers.WONDER_OAK,
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING),ModBlocks.SILT)
            {
                @Override
                protected boolean mayPlaceOn(BlockState state, BlockGetter pLevel, BlockPos pPos)
                {
                    if (state.getBlock().defaultBlockState() == ModBlocks.SILT.get().defaultBlockState())
                        return true;

                    return state.getBlock().defaultBlockState() == ModBlocks.SILT.get().defaultBlockState();
                }
            }
    );

    public static final DeferredBlock<Block> TWISTED_GRASS =
            registerBlock(
                    "twisted_grass", () ->
                            new ModPlantBlock(BlockBehaviour.Properties.of()
                                    .sound(SoundType.GRASS)
                                    .noCollission()
                                    .noOcclusion()
                                    .instabreak()
                                    .offsetType(BlockBehaviour.OffsetType.XZ)
                                    .pushReaction(PushReaction.DESTROY)
                                    .replaceable()
                            )
                            {
                                @Override
                                protected VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context)
                                {
                                    Vec3 vec3 = state.getOffset(level, pos);
                                    VoxelShape shape = Block.box(3.0F, 0.0F, 3.0F, 13.0F, 12.0F, 13.0F);
                                    return shape.move(vec3.x, vec3.y, vec3.z);
                                }
                            }
            );



    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block){
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    private static <T extends Block> DeferredBlock<T> registerBlockNoItem(String name, Supplier<T> block)
    {
        return BLOCKS.register(name, block);
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
