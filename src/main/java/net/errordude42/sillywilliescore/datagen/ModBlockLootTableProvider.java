package net.errordude42.sillywilliescore.datagen;

import net.errordude42.sillywilliescore.block.ModBlocks;
import net.errordude42.sillywilliescore.item.ModItems;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.entries.LootPoolEntryContainer;
import net.minecraft.world.level.storage.loot.predicates.ExplosionCondition;


import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.BiFunction;

public class ModBlockLootTableProvider extends BlockLootSubProvider {
    protected ModBlockLootTableProvider(HolderLookup.Provider registries){
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), registries);
    }
    @Override
    protected void generate(){
     dropSelf(ModBlocks.BLOCK_OF_RAW_ENTANGULUM.get());
     dropSelf(ModBlocks.BLOCK_OF_RAW_TRIANGULUM.get());
     dropSelf(ModBlocks.TRIANGULUM_BRICKS.get());
     dropSelf(ModBlocks.SILT.get());
     dropSelf(ModBlocks.TRIANGULUM_BRICKS_PRESSURE_PLATE.get());
     dropSelf(ModBlocks.TRIANGULUM_BRICKS_BUTTON.get());
     dropSelf(ModBlocks.TRIANGULUM_BRICKS_WALL.get());
     dropSelf(ModBlocks.TRIANGULUM_BRICKS_STAIRS.get());


     add(ModBlocks.TRIANGULUMORE_DEEPSLATE.get(),
             block -> createOreDrop(ModBlocks.TRIANGULUMORE_DEEPSLATE.get(), ModItems.TRIANGULUMRAW.get())
        );
     add(ModBlocks.TRIANGULUM_BRICKS_SLAB.get(),
             block -> createSlabItemTable(ModBlocks.TRIANGULUM_BRICKS_SLAB.get())
     );
    }



    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(Holder::value)::iterator;
    }
}
