package net.errordude42.sillywilliescore.datagen;

import net.errordude42.sillywilliescore.block.ModBlocks;
import net.errordude42.sillywilliescore.item.ModItems;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;

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
     dropSelf(ModBlocks.TRIANGULUM_BRICKS_PRESSURE_PLATE.get());
     dropSelf(ModBlocks.TRIANGULUM_BRICKS_BUTTON.get());
     dropSelf(ModBlocks.TRIANGULUM_BRICKS_WALL.get());
     dropSelf(ModBlocks.TRIANGULUM_BRICKS_STAIRS.get());
     dropSelf(ModBlocks.GEOSTONE_COBBLE.get());
     dropSelf(ModBlocks.GEOSTONE_COBBLE_WALL.get());
     dropSelf(ModBlocks.GEOSTONE_COBBLE_STAIRS.get());
     dropSelf(ModBlocks.GEOSTONE_STAIRS.get());
     dropSelf(ModBlocks.GEOSTONE_BUTTON.get());
     dropSelf(ModBlocks.GEOSTONE_PRESSURE_PLATE.get());
     dropSelf(ModBlocks.CHISLED_GEOSTONE.get());
     dropSelf(ModBlocks.SMOOTH_GEOSTONE.get());
     dropSelf(ModBlocks.CRACKED_GEOSTONE_BRICKS.get());
     dropSelf(ModBlocks.GEOSTONE_BRICKS.get());
     dropSelf(ModBlocks.GEOSTONE_BRICKS_STAIRS.get());
     dropSelf(ModBlocks.GEOSTONE_BRICKS_WALL.get());
     dropSelf(ModBlocks.MOSSY_GEOSTONE_BRICKS.get());
     dropSelf(ModBlocks.MOSSY_GEOSTONE_BRICKS_STAIRS.get());
     dropSelf(ModBlocks.MOSSY_GEOSTONE_BRICKS_WALL.get());
     dropSelf(ModBlocks.WONDER_OAK_STAIRS.get());
     dropSelf(ModBlocks.WONDER_OAK_FENCE.get());
     dropSelf(ModBlocks.WONDER_OAK_FENCE_GATE.get());
     dropSelf(ModBlocks.WONDER_OAK_TRAPDOOR.get());
     dropSelf(ModBlocks.WONDER_OAK_PRESSURE_PLATE.get());
     dropSelf(ModBlocks.WONDER_OAK_BUTTON.get());
     dropSelf(ModBlocks.WONDER_OAK_SIGN.get());
     dropSelf(ModBlocks.WONDER_OAK_HANGING_SIGN.get());

     dropOther(ModBlocks.WONDER_OAK_WALL_SIGN.get(),ModBlocks.WONDER_OAK_SIGN.get());
     dropOther(ModBlocks.WONDER_OAK_WALL_HANGING_SIGN.get(),ModBlocks.WONDER_OAK_HANGING_SIGN.get());


     add(ModBlocks.GEOSTONE.get(),
             block -> createCobbleDrops(ModBlocks.GEOSTONE.get(), ModBlocks.GEOSTONE_COBBLE.get())
             );

     add(ModBlocks.TRIANGULUMORE_DEEPSLATE.get(),
             block -> createOreDrop(ModBlocks.TRIANGULUMORE_DEEPSLATE.get(), ModItems.TRIANGULUMRAW.get())
        );
     add(ModBlocks.ENTANGULUM_ORE.get(),
             block -> createOreDrop(ModBlocks.ENTANGULUM_ORE.get(),ModItems.RAW_ENTANGULUM.get())
             );
     add(ModBlocks.TRIANGULUM_BRICKS_SLAB.get(),
             block -> createSlabItemTable(ModBlocks.TRIANGULUM_BRICKS_SLAB.get())
     );
        add(ModBlocks.GEOSTONE_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.GEOSTONE_SLAB.get())
        );
        add(ModBlocks.GEOSTONE_BRICKS_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.GEOSTONE_BRICKS_SLAB.get())
        );
        add(ModBlocks.SMOOTH_GEOSTONE_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.SMOOTH_GEOSTONE_SLAB.get())
        );
        add(ModBlocks.MOSSY_GEOSTONE_BRICKS_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.GEOSTONE_BRICKS_SLAB.get())
        );

        add(ModBlocks.GEOSTONE_COBBLE_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.GEOSTONE_COBBLE_SLAB.get())
        );

        add(ModBlocks.WONDER_OAK_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.WONDER_OAK_SLAB.get())
        );


        this.dropSelf(ModBlocks.WONDER_OAK_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_WONDER_OAK_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_WONDER_OAK_LOG.get());
        this.dropSelf(ModBlocks.WONDER_OAK_WOOD.get());
        this.dropSelf(ModBlocks.WONDER_OAK_PLANKS.get());
        this.dropSelf(ModBlocks.WONDER_OAK_SAPLING.get());

        this.add(ModBlocks.WONDER_OAK_LEAVES.get(), block ->
                createLeavesDrops(block,ModBlocks.WONDER_OAK_SAPLING.get(),NORMAL_LEAVES_SAPLING_CHANCES)
                );

        add(ModBlocks.WONDER_OAK_DOOR.get(),
                block -> createDoorTable(ModBlocks.WONDER_OAK_DOOR.get()));
    }

    protected LootTable.Builder createCobbleDrops(Block pBlock, Block Block2) {
        HolderLookup.RegistryLookup<Enchantment> registrylookup = this.registries.lookupOrThrow(Registries.ENCHANTMENT);
        return this.createSilkTouchDispatchTable(pBlock,
                this.applyExplosionDecay(pBlock, LootItem.lootTableItem(Block2)));
    }
    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(Holder::value)::iterator;
    }
}
