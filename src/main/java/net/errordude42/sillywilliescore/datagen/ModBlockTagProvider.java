
package net.errordude42.sillywilliescore.datagen;

import net.errordude42.sillywilliescore.ModBlocks;
import net.errordude42.sillywilliescore.SillyWilliesCore;
import net.errordude42.sillywilliescore.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
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

        tag(BlockTags.MINEABLE_WITH_AXE)
                .add(ModBlocks.WONDER_OAK_PLANKS.get())
                .add(ModBlocks.WONDER_OAK_STAIRS.get())
                .add(ModBlocks.WONDER_OAK_SLAB.get())
                .add(ModBlocks.WONDER_OAK_DOOR.get())
                .add(ModBlocks.WONDER_OAK_BUTTON.get())
                .add(ModBlocks.WONDER_OAK_PRESSURE_PLATE.get())
                .add(ModBlocks.WONDER_OAK_TRAPDOOR.get())
                .add(ModBlocks.WONDER_OAK_FENCE_GATE.get())
                .add(ModBlocks.WONDER_OAK_FENCE.get());

        tag(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.ENTANGULUM_ORE.get())
                .add(ModBlocks.TRIANGULUMORE_GEOSTONE.get())
                .add(ModBlocks.TRIANGULUMORE_DEEPSLATE.get());

        tag(BlockTags.SLABS)
                .add(ModBlocks.WONDER_OAK_SLAB.get())
                .add(ModBlocks.SMOOTH_GEOSTONE_SLAB.get())
                .add(ModBlocks.GEOSTONE_SLAB.get())
                .add(ModBlocks.MOSSY_GEOSTONE_BRICKS_SLAB.get())
                .add(ModBlocks.TRIANGULUM_BRICKS_SLAB.get())
                .add(ModBlocks.GEOSTONE_COBBLE_SLAB.get())
                .add(ModBlocks.GEOSTONE_BRICKS_SLAB.get());

        tag(BlockTags.WOODEN_BUTTONS)
                .add(ModBlocks.WONDER_OAK_BUTTON.get());

        tag(BlockTags.WOODEN_STAIRS)
                .add(ModBlocks.WONDER_OAK_STAIRS.get());

        tag(BlockTags.WOODEN_SLABS)
                .add(ModBlocks.WONDER_OAK_SLAB.get());

        tag(BlockTags.FENCE_GATES)
                .add(ModBlocks.WONDER_OAK_FENCE_GATE.get());

        tag(BlockTags.FENCES)
                .add(ModBlocks.WONDER_OAK_FENCE.get());

        tag(BlockTags.BUTTONS)
                .add(ModBlocks.WONDER_OAK_BUTTON.get());

        tag(BlockTags.PRESSURE_PLATES)
                .add(ModBlocks.WONDER_OAK_PRESSURE_PLATE.get());

        tag(BlockTags.WOODEN_PRESSURE_PLATES)
                .add(ModBlocks.WONDER_OAK_PRESSURE_PLATE.get());

        tag(BlockTags.WALL_POST_OVERRIDE)
                .add(ModBlocks.WONDER_OAK_PRESSURE_PLATE.get());

        tag(BlockTags.WOODEN_FENCES)
                .add(ModBlocks.WONDER_OAK_FENCE.get());

        tag(BlockTags.WALLS)
                .add(ModBlocks.TRIANGULUM_BRICKS_WALL.get())
                .add(ModBlocks.GEOSTONE_COBBLE_WALL.get())
                .add(ModBlocks.MOSSY_GEOSTONE_BRICKS_WALL.get())
                .add(ModBlocks.GEOSTONE_BRICKS_WALL.get());

        tag(BlockTags.STAIRS)
                .add(ModBlocks.WONDER_OAK_STAIRS.get())
                .add(ModBlocks.MOSSY_GEOSTONE_BRICKS_STAIRS.get())
                .add(ModBlocks.TRIANGULUM_BRICKS_STAIRS.get())
                .add(ModBlocks.GEOSTONE_STAIRS.get())
                .add(ModBlocks.GEOSTONE_COBBLE_STAIRS.get())
                .add(ModBlocks.GEOSTONE_BRICKS_STAIRS.get());

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

        tag(BlockTags.WOODEN_DOORS)
                .add(ModBlocks.WONDER_OAK_DOOR.get());

        tag(BlockTags.WOODEN_TRAPDOORS)
                .add(ModBlocks.WONDER_OAK_TRAPDOOR.get());

        tag(BlockTags.MOB_INTERACTABLE_DOORS)
                .add(ModBlocks.WONDER_OAK_DOOR.get());

        tag(BlockTags.DOORS)
                .add(ModBlocks.WONDER_OAK_DOOR.get());

        tag(BlockTags.TRAPDOORS)
                .add(ModBlocks.WONDER_OAK_TRAPDOOR.get());

        tag(BlockTags.PLANKS)
                .add(ModBlocks.WONDER_OAK_PLANKS.get());

        tag(Tags.Blocks.STRIPPED_LOGS)
                .add(ModBlocks.STRIPPED_WONDER_OAK_LOG.get());

        tag(Tags.Blocks.STRIPPED_WOODS)
                .add(ModBlocks.STRIPPED_WONDER_OAK_WOOD.get());


    }
}
