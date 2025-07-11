package net.errordude42.sillywilliescore.datagen;

import net.errordude42.sillywilliescore.SillyWilliesCore;
import net.errordude42.sillywilliescore.block.ModBlocks;
import net.errordude42.sillywilliescore.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, SillyWilliesCore.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(ModItems.RAW_ENTANGULUM.get());
        basicItem(ModItems.TRIANGULUMRAW.get());
        basicItem(ModItems.TRIANGULUM.get());
        basicItem(ModItems.TRIANGULUM_AXE.get());
        basicItem(ModItems.TRIANGULUM_HOE.get());
        basicItem(ModItems.TRIANGULUM_PICKAXE.get());
        basicItem(ModItems.TRIANGULUMBRICK.get());
        basicItem(ModItems.TRIANGULUM_SWORD.get());
        basicItem(ModItems.TRIANGULUMUPGRADETEMPLATE.get());
        basicItem(ModItems.INCOMPLETE_TRIANGULUM.get());
        basicItem(ModItems.TRIANGULUM_SHOVEL.get());
        basicItem(ModItems.PLATE_MOLD.get());
        basicItem(ModItems.ENTANGULUM_DUST.get());
        basicItem(ModItems.DIRTY_ENTANGULUM_DUST.get());
        basicItem(ModItems.ENTANGULUM_SPOOL.get());
        basicItem(ModItems.ENTANGULUM_MASTERWORK_SMITHING_TEMPLATE.get());
        basicItem(ModItems.ENTANGULUM_STRING.get());
        basicItem(ModItems.EMPTY_SPOOL.get());
        basicItem(ModItems.ENTANGULUM_PLATE.get());

        buttonItem(ModBlocks.TRIANGULUM_BRICKS_BUTTON,ModBlocks.TRIANGULUM_BRICKS);
        wallItem(ModBlocks.TRIANGULUM_BRICKS_WALL,ModBlocks.TRIANGULUM_BRICKS);


    }

    public void buttonItem(DeferredBlock<?> block, DeferredBlock<Block> baseBlock) {
        this.withExistingParent(block.getId().getPath(), mcLoc("block/button_inventory"))
                .texture("texture",  ResourceLocation.fromNamespaceAndPath(SillyWilliesCore.MOD_ID,
                        "block/" + baseBlock.getId().getPath()));
    }

    public void fenceItem(DeferredBlock<?> block, DeferredBlock<Block> baseBlock) {
        this.withExistingParent(block.getId().getPath(), mcLoc("block/fence_inventory"))
                .texture("texture",  ResourceLocation.fromNamespaceAndPath(SillyWilliesCore.MOD_ID,
                        "block/" + baseBlock.getId().getPath()));
    }

    public void wallItem(DeferredBlock<?> block, DeferredBlock<Block> baseBlock) {
        this.withExistingParent(block.getId().getPath(), mcLoc("block/wall_inventory"))
                .texture("wall",  ResourceLocation.fromNamespaceAndPath(SillyWilliesCore.MOD_ID,
                        "block/" + baseBlock.getId().getPath()));
    }
}
