package net.errordude42.sillywilliescore.datagen;

import net.errordude42.sillywilliescore.block.ModBlocks;
import net.errordude42.sillywilliescore.item.ModItems;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;


import java.util.Set;

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
     dropSelf(ModBlocks.GEOSTONE.get());

     add(ModBlocks.ENTANGULUM_ORE.get(),
             block -> createOreDrop(ModBlocks.ENTANGULUM_ORE.get(), ModItems.RAW_ENTANGULUM.get())
             );
     add(ModBlocks.TRIANGULUMORE_DEEPSLATE.get(),
             block -> createOreDrop(ModBlocks.TRIANGULUMORE_DEEPSLATE.get(), ModItems.TRIANGULUMRAW.get())
        );

    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(Holder::value)::iterator;
    }
}
