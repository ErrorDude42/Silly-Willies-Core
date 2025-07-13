package net.errordude42.sillywilliescore.datagen;

import net.errordude42.sillywilliescore.block.ModBlocks;
import net.errordude42.sillywilliescore.item.ModItems;
import net.minecraft.advancements.critereon.EnchantmentPredicate;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.advancements.critereon.MinMaxBounds;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.nbt.Tag;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.MossBlock;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.entries.LootPoolEntryContainer;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.predicates.ExplosionCondition;
import net.minecraft.world.level.storage.loot.predicates.MatchTool;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.common.conditions.TrueCondition;


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
