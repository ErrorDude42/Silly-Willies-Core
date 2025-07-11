package net.errordude42.sillywilliescore.datagen;

import net.errordude42.sillywilliescore.SillyWilliesCore;
import net.errordude42.sillywilliescore.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper){
        super(output, SillyWilliesCore.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels(){
        blockWithItem(ModBlocks.TRIANGULUMORE_DEEPSLATE);
        blockWithItem(ModBlocks.SILT);
        blockWithItem(ModBlocks.TRIANGULUM_BRICKS);
        blockWithItem(ModBlocks.ENTANGULUM_ORE);
        blockWithItem(ModBlocks.GEOSTONE);
        blockWithItem(ModBlocks.GEOSTONE_COBBLE);
        blockWithItem(ModBlocks.BLOCK_OF_RAW_ENTANGULUM);
        blockWithItem(ModBlocks.BLOCK_OF_RAW_TRIANGULUM);

        stairsBlock(ModBlocks.TRIANGULUM_BRICKS_STAIRS.get(),blockTexture(ModBlocks.TRIANGULUM_BRICKS.get()));
        slabBlock(ModBlocks.TRIANGULUM_BRICKS_SLAB.get(),blockTexture(ModBlocks.TRIANGULUM_BRICKS.get()),blockTexture(ModBlocks.TRIANGULUM_BRICKS.get()));
        buttonBlock(ModBlocks.TRIANGULUM_BRICKS_BUTTON.get(),blockTexture(ModBlocks.TRIANGULUM_BRICKS.get()));
        pressurePlateBlock(ModBlocks.TRIANGULUM_BRICKS_PRESSURE_PLATE.get(),blockTexture(ModBlocks.TRIANGULUM_BRICKS.get()));
        wallBlock(ModBlocks.TRIANGULUM_BRICKS_WALL.get(),blockTexture(ModBlocks.TRIANGULUM_BRICKS.get()));

        blockItem(ModBlocks.TRIANGULUM_BRICKS_SLAB);
        blockItem(ModBlocks.TRIANGULUM_BRICKS_STAIRS);
        blockItem(ModBlocks.TRIANGULUM_BRICKS_PRESSURE_PLATE);

    }

    private void blockWithItem(DeferredBlock<?> deferredBlock){
        simpleBlockWithItem(deferredBlock.get(), cubeAll(deferredBlock.get()
        ));
    }
    private void blockItem(DeferredBlock<?> deferredBlock) {
        simpleBlockItem(deferredBlock.get(), new ModelFile.UncheckedModelFile("sillywilliescore:block/" + deferredBlock.getId().getPath()));
    }
    private void blockItem(DeferredBlock<?> deferredBlock, String appendix) {
        simpleBlockItem(deferredBlock.get(), new ModelFile.UncheckedModelFile("sillywilliescore:block/" + deferredBlock.getId().getPath() + appendix));
    }
}



