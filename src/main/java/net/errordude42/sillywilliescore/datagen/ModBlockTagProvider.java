
package net.errordude42.sillywilliescore.datagen;

import net.errordude42.sillywilliescore.SillyWilliesCore;
import net.errordude42.sillywilliescore.block.ModBlocks;
import net.errordude42.sillywilliescore.item.ModItems;
import net.errordude42.sillywilliescore.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends BlockTagsProvider {

    public ModBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, SillyWilliesCore.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.BLOCK_OF_RAW_ENTANGULUM.get())
                .add(ModBlocks.ENTANGULUM_ORE.get())
                .add(ModBlocks.BLOCK_OF_RAW_ENTANGULUM.get())
                .add(ModBlocks.GEOSTONE.get())
                .add(ModBlocks.GEOSTONE_BUTTON.get())
                .add(ModBlocks.GEOSTONE_STAIRS.get())
                .add(ModBlocks.GEOSTONE_PRESSURE_PLATE.get())
                .add(ModBlocks.GEOSTONE_SLAB.get())
                .add(ModBlocks.TRIANGULUM_BRICKS.get())
                .add(ModBlocks.TRIANGULUM_BRICKS_STAIRS.get())
                .add(ModBlocks.TRIANGULUM_BRICKS_SLAB.get())
                .add(ModBlocks.TRIANGULUM_BRICKS_WALL.get())
                .add(ModBlocks.TRIANGULUM_BRICKS_PRESSURE_PLATE.get())
                .add(ModBlocks.TRIANGULUM_BRICKS_BUTTON.get())
                .add(ModBlocks.TRIANGULUM_BRICKS.get())
                .add(ModBlocks.GEOSTONE_COBBLE.get())
                .add(ModBlocks.TRIANGULUMORE_DEEPSLATE.get())
                .add(ModBlocks.GEOSTONE_COBBLE_STAIRS.get())
                .add(ModBlocks.GEOSTONE_COBBLE_SLAB.get())
                .add(ModBlocks.GEOSTONE_COBBLE_WALL.get());

        tag(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.ENTANGULUM_ORE.get())
                .add(ModBlocks.TRIANGULUMORE_DEEPSLATE.get());


        tag(BlockTags.WALLS)
                .add(ModBlocks.TRIANGULUM_BRICKS_WALL.get())
                .add(ModBlocks.GEOSTONE_COBBLE_WALL.get())
                .add(ModBlocks.MOSSY_GEOSTONE_BRICKS_WALL.get())
                .add(ModBlocks.GEOSTONE_BRICKS_WALL.get());

        tag(ModTags.Blocks.NEEDS_TRIANGULUM_TOOL)
                .addTag(BlockTags.NEEDS_DIAMOND_TOOL);

        tag(ModTags.Blocks.INCORRECT_FOR_TRIANGULUM_TOOL)
                .addTag(BlockTags.INCORRECT_FOR_DIAMOND_TOOL)
                .remove(ModTags.Blocks.NEEDS_TRIANGULUM_TOOL);

        this.tag(BlockTags.LOGS_THAT_BURN)
                .add(ModBlocks.WONDER_OAK_LOG.get())
                .add(ModBlocks.WONDER_OAK_WOOD.get())
                .add(ModBlocks.STRIPPED_WONDER_OAK_LOG.get())
                .add(ModBlocks.STRIPPED_WONDER_OAK_WOOD.get());
    }
}
