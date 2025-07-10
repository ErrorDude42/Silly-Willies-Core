package net.errordude42.sillywilliescore.datagen;

import net.errordude42.sillywilliescore.SillyWilliesCore;
import net.errordude42.sillywilliescore.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
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


    }

    private void blockWithItem(DeferredBlock<?> deferredBlock){
        simpleBlockWithItem(deferredBlock.get(), cubeAll(deferredBlock.get()
        ));
    }
}

