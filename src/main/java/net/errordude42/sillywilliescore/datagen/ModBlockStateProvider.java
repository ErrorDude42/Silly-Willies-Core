package net.errordude42.sillywilliescore.datagen;

import net.errordude42.sillywilliescore.SillyWilliesCore;
import net.errordude42.sillywilliescore.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;
import org.openjdk.nashorn.internal.runtime.regexp.joni.ast.StringNode;

import static net.minecraft.data.models.model.TextureMapping.cubeTop;


public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper){
        super(output, SillyWilliesCore.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels(){
        blockWithItem(ModBlocks.SILT);
        blockWithItem(ModBlocks.TRIANGULUM_BRICKS);
        blockWithItem(ModBlocks.ENTANGULUM_ORE);
        blockWithItem(ModBlocks.GEOSTONE);
        blockWithItem(ModBlocks.GEOSTONE_COBBLE);
        blockWithItem(ModBlocks.BLOCK_OF_RAW_ENTANGULUM);
        blockWithItem(ModBlocks.BLOCK_OF_RAW_TRIANGULUM);
        blockWithItem(ModBlocks.CRACKED_GEOSTONE_BRICKS);
        blockWithItem(ModBlocks.GEOSTONE_BRICKS);
        blockWithItem(ModBlocks.MOSSY_GEOSTONE_BRICKS);

        pillarBlock(ModBlocks.CHISLED_GEOSTONE,"chisled_geostone" );

        pillarBlock(ModBlocks.TRIANGULUMORE_DEEPSLATE,"triangulumore_deepslate");

        smoothDifferentTexture(ModBlocks.SMOOTH_GEOSTONE,"smooth_geostone","chisled_geostone_top" );

        stairsBlock(ModBlocks.TRIANGULUM_BRICKS_STAIRS.get(),blockTexture(ModBlocks.TRIANGULUM_BRICKS.get()));
        stairsBlock(ModBlocks.GEOSTONE_STAIRS.get(),blockTexture(ModBlocks.GEOSTONE.get()));
        stairsBlock(ModBlocks.MOSSY_GEOSTONE_BRICKS_STAIRS.get(),blockTexture(ModBlocks.MOSSY_GEOSTONE_BRICKS.get()));
        stairsBlock(ModBlocks.GEOSTONE_BRICKS_STAIRS.get(),blockTexture(ModBlocks.GEOSTONE_BRICKS.get()));
        stairsBlock(ModBlocks.GEOSTONE_COBBLE_STAIRS.get(),blockTexture(ModBlocks.GEOSTONE_COBBLE.get()));
        slabBlock(ModBlocks.TRIANGULUM_BRICKS_SLAB.get(),blockTexture(ModBlocks.TRIANGULUM_BRICKS.get()),blockTexture(ModBlocks.TRIANGULUM_BRICKS.get()));
        slabBlock(ModBlocks.MOSSY_GEOSTONE_BRICKS_SLAB.get(),blockTexture(ModBlocks.MOSSY_GEOSTONE_BRICKS.get()),blockTexture(ModBlocks.MOSSY_GEOSTONE_BRICKS.get()));
        slabBlock(ModBlocks.GEOSTONE_BRICKS_SLAB.get(),blockTexture(ModBlocks.GEOSTONE_BRICKS.get()),blockTexture(ModBlocks.GEOSTONE_BRICKS.get()));
        slabBlock(ModBlocks.SMOOTH_GEOSTONE_SLAB.get(),blockTexture(ModBlocks.SMOOTH_GEOSTONE.get().defaultBlockState().getBlock()),blockTexture(ModBlocks.SMOOTH_GEOSTONE.get().defaultBlockState().getBlock()));
        slabBlock(ModBlocks.GEOSTONE_SLAB.get(),blockTexture(ModBlocks.GEOSTONE.get()),blockTexture(ModBlocks.GEOSTONE.get()));
        slabBlock(ModBlocks.GEOSTONE_COBBLE_SLAB.get(),blockTexture(ModBlocks.GEOSTONE_COBBLE.get()),blockTexture(ModBlocks.GEOSTONE_COBBLE.get()));
        buttonBlock(ModBlocks.GEOSTONE_BUTTON.get(),blockTexture(ModBlocks.GEOSTONE.get()));
        buttonBlock(ModBlocks.TRIANGULUM_BRICKS_BUTTON.get(),blockTexture(ModBlocks.TRIANGULUM_BRICKS.get()));
        pressurePlateBlock(ModBlocks.TRIANGULUM_BRICKS_PRESSURE_PLATE.get(),blockTexture(ModBlocks.TRIANGULUM_BRICKS.get()));
        pressurePlateBlock(ModBlocks.GEOSTONE_PRESSURE_PLATE.get(),blockTexture(ModBlocks.GEOSTONE.get()));
        wallBlock(ModBlocks.TRIANGULUM_BRICKS_WALL.get(),blockTexture(ModBlocks.TRIANGULUM_BRICKS.get()));
        wallBlock(ModBlocks.GEOSTONE_COBBLE_WALL.get(),blockTexture(ModBlocks.GEOSTONE_COBBLE.get()));
        wallBlock(ModBlocks.MOSSY_GEOSTONE_BRICKS_WALL.get(),blockTexture(ModBlocks.MOSSY_GEOSTONE_BRICKS.get()));
        wallBlock(ModBlocks.GEOSTONE_BRICKS_WALL.get(),blockTexture(ModBlocks.GEOSTONE_BRICKS.get()));

        blockItem(ModBlocks.TRIANGULUM_BRICKS_SLAB);
        blockItem(ModBlocks.GEOSTONE_SLAB);
        blockItem(ModBlocks.GEOSTONE_BRICKS_SLAB);
        blockItem(ModBlocks.MOSSY_GEOSTONE_BRICKS_SLAB);
        blockItem(ModBlocks.SMOOTH_GEOSTONE_SLAB);
        blockItem(ModBlocks.GEOSTONE_COBBLE_SLAB);
        blockItem(ModBlocks.TRIANGULUM_BRICKS_STAIRS);
        blockItem(ModBlocks.GEOSTONE_STAIRS);
        blockItem(ModBlocks.GEOSTONE_BRICKS_STAIRS);
        blockItem(ModBlocks.MOSSY_GEOSTONE_BRICKS_STAIRS);
        blockItem(ModBlocks.GEOSTONE_COBBLE_STAIRS);
        blockItem(ModBlocks.GEOSTONE_PRESSURE_PLATE);
        blockItem(ModBlocks.TRIANGULUM_BRICKS_PRESSURE_PLATE);


    }

    private void smoothDifferentTexture(DeferredBlock<?> deferredBlock,String name,String textureName) {
        simpleBlockWithItem(deferredBlock.get(), models().cubeAll(name,
                ResourceLocation.parse("sillywilliescore:block/" + textureName)));
    }
    private void pillarBlock(DeferredBlock<?>deferredBlock,String name){
        simpleBlockWithItem(deferredBlock.get(), models().cubeColumn(name,
                ResourceLocation.parse("sillywilliescore:block/" + deferredBlock.getId().getPath()+"_side"),
                ResourceLocation.parse("sillywilliescore:block/" + deferredBlock.getId().getPath()+"_top")
                ));
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



