package net.errordude42.sillywilliescore.datagen;

import net.errordude42.sillywilliescore.ModBlocks;
import net.errordude42.sillywilliescore.SillyWilliesCore;
import net.errordude42.sillywilliescore.item.ModItems;
import net.errordude42.sillywilliescore.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends ItemTagsProvider {
    public ModItemTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, CompletableFuture<TagLookup<Block>> blockTags, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, blockTags, SillyWilliesCore.MOD_ID, existingFileHelper);
    }


    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(ModTags.Items.ENTANGULUM_SMELTABLE)
                .add(ModItems.RAW_ENTANGULUM.get())
                .add(ModBlocks.ENTANGULUM_ORE.asItem());
        tag(ModTags.Items.TRIANGULUM_SMELTABLE)
                .add(ModItems.TRIANGULUMRAW.get())
                .add(ModBlocks.TRIANGULUMORE_DEEPSLATE.asItem());

        tag(ModTags.Items.GEOSTONE_STONECUTTING).add(ModBlocks.GEOSTONE.asItem()).add(ModBlocks.GEOSTONE_BRICKS.asItem());

        tag(ItemTags.MACE_ENCHANTABLE)
                .add(ModItems.TRIANGULUM_MACE.get());

        tag(ItemTags.SWORDS)
                .add(ModItems.TRIANGULUM_SWORD.get());
        tag(ItemTags.PICKAXES)
                .add(ModItems.TRIANGULUM_PICKAXE.get());
        tag(ItemTags.AXES)
                .add(ModItems.TRIANGULUM_AXE.get());
        tag(ItemTags.SHOVELS)
                .add(ModItems.TRIANGULUM_SHOVEL.get());
        tag(ItemTags.HOES)
                .add(ModItems.TRIANGULUM_HOE.get());

        tag(ItemTags.STONE_TOOL_MATERIALS)
                .add(ModBlocks.GEOSTONE_COBBLE.asItem());
        tag(ItemTags.STONE_CRAFTING_MATERIALS)
                .add(ModBlocks.GEOSTONE_COBBLE.asItem());

        this.tag(ItemTags.TRIM_MATERIALS)
                .add(ModItems.TRIANGULUM.get());

        this.tag(ItemTags.LOGS_THAT_BURN)
                .add(ModBlocks.WONDER_OAK_LOG.get().asItem())
                .add(ModBlocks.WONDER_OAK_WOOD.get().asItem())
                .add(ModBlocks.STRIPPED_WONDER_OAK_LOG.get().asItem())
                .add(ModBlocks.STRIPPED_WONDER_OAK_WOOD.get().asItem());

        this.tag(ItemTags.PLANKS)
                .add(ModBlocks.WONDER_OAK_PLANKS.asItem());

        tag(ModTags.Items.WONDER_OAK_LOG_OR_WOOD)
                .add(ModBlocks.WONDER_OAK_LOG.get().asItem())
                .add(ModBlocks.WONDER_OAK_WOOD.get().asItem())
                .add(ModBlocks.STRIPPED_WONDER_OAK_LOG.get().asItem())
                .add(ModBlocks.STRIPPED_WONDER_OAK_WOOD.get().asItem());
    }
}
