package net.errordude42.sillywilliescore.block;

import net.errordude42.sillywilliescore.SillyWilliesCore;
import net.errordude42.sillywilliescore.item.ModItems;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.bus.api.IEventBus;
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
            () -> new Block(BlockBehaviour.Properties.of().strength(4f).sound(SoundType.METAL).mapColor(MapColor.COLOR_PURPLE).
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
