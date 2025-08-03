package net.errordude42.sillywilliescore.datagen;

import net.errordude42.sillywilliescore.SillyWilliesCore;
import net.errordude42.sillywilliescore.block.ModBlocks;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;


public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper){
        super(output, SillyWilliesCore.MOD_ID, exFileHelper);
    }
     public String pName(Block block) {
         return BuiltInRegistries.BLOCK.getKey(block).getPath();
     }

    public ResourceLocation texture(String name) {
        return this.modLoc("block/" + name);
    }

    public ResourceLocation texture(String name, String location) {
        return this.modLoc("block/" + location + name);
    }

    public ResourceLocation texture(String name, String location, String suffix) {
        return this.modLoc("block/" + location + name + suffix);
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
        blockWithItem(ModBlocks.WONDER_OAK_PLANKS);

        pillarBlock(ModBlocks.CHISLED_GEOSTONE,"chisled_geostone" );

        pillarBlock(ModBlocks.TRIANGULUMORE_DEEPSLATE,"triangulumore_deepslate");

        smoothDifferentTexture(ModBlocks.SMOOTH_GEOSTONE,"smooth_geostone","chisled_geostone_top" );

        stairsBlock(ModBlocks.TRIANGULUM_BRICKS_STAIRS.get(),blockTexture(ModBlocks.TRIANGULUM_BRICKS.get()));
        stairsBlock(ModBlocks.GEOSTONE_STAIRS.get(),blockTexture(ModBlocks.GEOSTONE.get()));
        stairsBlock(ModBlocks.MOSSY_GEOSTONE_BRICKS_STAIRS.get(),blockTexture(ModBlocks.MOSSY_GEOSTONE_BRICKS.get()));
        stairsBlock(ModBlocks.GEOSTONE_BRICKS_STAIRS.get(),blockTexture(ModBlocks.GEOSTONE_BRICKS.get()));
        stairsBlock(ModBlocks.GEOSTONE_COBBLE_STAIRS.get(),blockTexture(ModBlocks.GEOSTONE_COBBLE.get()));
        stairsBlock(ModBlocks.WONDER_OAK_STAIRS.get(),blockTexture(ModBlocks.WONDER_OAK_PLANKS.get()));

        slabBlock(ModBlocks.TRIANGULUM_BRICKS_SLAB.get(),blockTexture(ModBlocks.TRIANGULUM_BRICKS.get()),blockTexture(ModBlocks.TRIANGULUM_BRICKS.get()));
        slabBlock(ModBlocks.MOSSY_GEOSTONE_BRICKS_SLAB.get(),blockTexture(ModBlocks.MOSSY_GEOSTONE_BRICKS.get()),blockTexture(ModBlocks.MOSSY_GEOSTONE_BRICKS.get()));
        slabBlock(ModBlocks.GEOSTONE_BRICKS_SLAB.get(),blockTexture(ModBlocks.GEOSTONE_BRICKS.get()),blockTexture(ModBlocks.GEOSTONE_BRICKS.get()));
        slabBlock(ModBlocks.SMOOTH_GEOSTONE_SLAB.get(),blockTexture(ModBlocks.SMOOTH_GEOSTONE.get().defaultBlockState().getBlock()),blockTexture(ModBlocks.SMOOTH_GEOSTONE.get().defaultBlockState().getBlock()));
        slabBlock(ModBlocks.GEOSTONE_SLAB.get(),blockTexture(ModBlocks.GEOSTONE.get()),blockTexture(ModBlocks.GEOSTONE.get()));
        slabBlock(ModBlocks.GEOSTONE_COBBLE_SLAB.get(),blockTexture(ModBlocks.GEOSTONE_COBBLE.get()),blockTexture(ModBlocks.GEOSTONE_COBBLE.get()));
        slabBlock(ModBlocks.WONDER_OAK_SLAB.get(),blockTexture(ModBlocks.WONDER_OAK_PLANKS.get()),blockTexture(ModBlocks.WONDER_OAK_PLANKS.get()));

        buttonBlock(ModBlocks.GEOSTONE_BUTTON.get(),blockTexture(ModBlocks.GEOSTONE.get()));
        buttonBlock(ModBlocks.TRIANGULUM_BRICKS_BUTTON.get(),blockTexture(ModBlocks.TRIANGULUM_BRICKS.get()));
        buttonBlock(ModBlocks.WONDER_OAK_BUTTON.get(),blockTexture(ModBlocks.WONDER_OAK_PLANKS.get()));

        pressurePlateBlock(ModBlocks.TRIANGULUM_BRICKS_PRESSURE_PLATE.get(),blockTexture(ModBlocks.TRIANGULUM_BRICKS.get()));
        pressurePlateBlock(ModBlocks.GEOSTONE_PRESSURE_PLATE.get(),blockTexture(ModBlocks.GEOSTONE.get()));
        pressurePlateBlock(ModBlocks.WONDER_OAK_PRESSURE_PLATE.get(),blockTexture(ModBlocks.WONDER_OAK_PLANKS.get()));

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
        blockItem(ModBlocks.WONDER_OAK_SLAB);
        blockItem(ModBlocks.WONDER_OAK_STAIRS);
        blockItem(ModBlocks.WONDER_OAK_PRESSURE_PLATE);


        fenceBlock(ModBlocks.WONDER_OAK_FENCE.get(),blockTexture(ModBlocks.WONDER_OAK_PLANKS.get()));
        fenceGateBlock(ModBlocks.WONDER_OAK_FENCE_GATE.get(),blockTexture(ModBlocks.WONDER_OAK_PLANKS.get()));

        logBlock(((RotatedPillarBlock) ModBlocks.WONDER_OAK_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.WONDER_OAK_WOOD.get()), blockTexture(ModBlocks.WONDER_OAK_LOG.get()), blockTexture(ModBlocks.WONDER_OAK_LOG.get()));
        logBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_WONDER_OAK_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_WONDER_OAK_WOOD.get()), blockTexture(ModBlocks.STRIPPED_WONDER_OAK_LOG.get()), blockTexture(ModBlocks.STRIPPED_WONDER_OAK_LOG.get()));

        blockItem(ModBlocks.WONDER_OAK_LOG);
        blockItem(ModBlocks.WONDER_OAK_WOOD);
        blockItem(ModBlocks.STRIPPED_WONDER_OAK_LOG);
        blockItem(ModBlocks.STRIPPED_WONDER_OAK_WOOD);
        blockItem(ModBlocks.WONDER_OAK_FENCE_GATE);
        blockItem(ModBlocks.WONDER_OAK_TRAPDOOR,"_bottom");


        leavesBlock(ModBlocks.WONDER_OAK_LEAVES);
        saplingBlock(ModBlocks.WONDER_OAK_SAPLING);

        signBlock(ModBlocks.WONDER_OAK_SIGN.get(), ModBlocks.WONDER_OAK_WALL_SIGN.get(),texture(pName(ModBlocks.WONDER_OAK_PLANKS.get())));
        hangingSignBlock(ModBlocks.WONDER_OAK_HANGING_SIGN.get(), ModBlocks.WONDER_OAK_WALL_HANGING_SIGN.get(),texture(pName(ModBlocks.STRIPPED_WONDER_OAK_LOG.get())));

        doorBlockWithRenderType(ModBlocks.WONDER_OAK_DOOR.get(),modLoc("block/wonder_oak_door_bottom"),modLoc("block/wonder_oak_door_top"),"cutout");
        trapdoorBlockWithRenderType(ModBlocks.WONDER_OAK_TRAPDOOR.get(), modLoc("block/wonder_oak_trapdoor"), true ,"cutout");

    }
    private void saplingBlock(DeferredBlock<Block> blockRegistryObject) {
        simpleBlock(blockRegistryObject.get(),
                models().cross(BuiltInRegistries.BLOCK.getKey(blockRegistryObject.get()).getPath(), blockTexture(blockRegistryObject.get())).renderType("cutout"));
    }

    private void leavesBlock(DeferredBlock<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(),
                models().singleTexture(BuiltInRegistries.BLOCK.getKey(blockRegistryObject.get()).getPath(), ResourceLocation.parse("minecraft:block/leaves"),
                        "all", blockTexture(blockRegistryObject.get())).renderType("cutout"));
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


    public void hangingSignBlock(Block signBlock, Block wallSignBlock, ResourceLocation texture) {
        ModelFile sign = models().sign(pName(signBlock), texture);
        simpleBlock(signBlock, sign);
        simpleBlock(wallSignBlock, sign);
    }

    private void signBlock(Block signBlock, Block wallSignBlock, ModelFile sign) {
        this.simpleBlock(signBlock, sign);
        this.simpleBlock(wallSignBlock, sign);
    }
    private void signBlock(Block signBlock, Block wallSignBlock, ResourceLocation texture) {
        ModelFile sign = this.models().sign(this.pName(signBlock), texture);
        this.signBlock(signBlock, wallSignBlock, sign);
    }

}



