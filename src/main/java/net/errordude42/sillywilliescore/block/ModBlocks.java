package net.errordude42.sillywilliescore.block;

import net.errordude42.sillywilliescore.SillyWilliesCore;
import net.errordude42.sillywilliescore.item.ModItems;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(SillyWilliesCore.MOD_ID);

    public static final DeferredBlock<Block> SILT = registerBlock("silt",
            () -> new Block(BlockBehaviour.Properties.of()
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

    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block){
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }


    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
