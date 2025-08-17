package net.errordude42.sillywilliescore.datagen;

import net.errordude42.sillywilliescore.ModBlocks;
import net.errordude42.sillywilliescore.SillyWilliesCore;
import net.errordude42.sillywilliescore.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.PackType;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.armortrim.TrimMaterial;
import net.minecraft.world.item.armortrim.TrimMaterials;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.client.model.generators.ItemModelBuilder;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;

import java.util.LinkedHashMap;

public class ModItemModelProvider extends ItemModelProvider {

        private static LinkedHashMap<ResourceKey<TrimMaterial>, Float> trimMaterials = new LinkedHashMap<>();
        static {
            trimMaterials.put(TrimMaterials.QUARTZ, 0.1F);
            trimMaterials.put(TrimMaterials.IRON, 0.2F);
            trimMaterials.put(TrimMaterials.NETHERITE, 0.3F);
            trimMaterials.put(TrimMaterials.REDSTONE, 0.4F);
            trimMaterials.put(TrimMaterials.COPPER, 0.5F);
            trimMaterials.put(TrimMaterials.GOLD, 0.6F);
            trimMaterials.put(TrimMaterials.EMERALD, 0.7F);
            trimMaterials.put(TrimMaterials.DIAMOND, 0.8F);
            trimMaterials.put(TrimMaterials.LAPIS, 0.9F);
            trimMaterials.put(TrimMaterials.AMETHYST, 1.0F);
        }

    private void trimmedArmorItem(DeferredItem<ArmorItem> itemDeferredItem) {
        final String MOD_ID = SillyWilliesCore.MOD_ID; // Change this to your mod id

        if(itemDeferredItem.get() instanceof ArmorItem armorItem) {
            trimMaterials.forEach((trimMaterial, value) -> {
                float trimValue = value;

                String armorType = "";
                if(armorItem.toString().contains("helmet")) {
                    armorType = "helmet";
                } else if(armorItem.toString().contains("chestplate")) {
                    armorType = "chestplate";
                } else if(armorItem.toString().contains("leggings")) {
                    armorType = "leggings";
                } else if(armorItem.toString().contains("boots")) {
                    armorType = "boots";
                }

                String armorItemPath = armorItem.toString();
                String trimPath = "trims/items/" + armorType + "_trim_" + trimMaterial.location().getPath();
                String currentTrimName = armorItemPath + "_" + trimMaterial.location().getPath() + "_trim";
                ResourceLocation armorItemResLoc = ResourceLocation.parse(armorItemPath);
                ResourceLocation trimResLoc = ResourceLocation.parse(trimPath); // minecraft namespace
                ResourceLocation trimNameResLoc = ResourceLocation.parse(currentTrimName);

                // This is used for making the ExistingFileHelper acknowledge that this texture exist, so this will
                // avoid an IllegalArgumentException
                existingFileHelper.trackGenerated(trimResLoc, PackType.CLIENT_RESOURCES, ".png", "textures");

                // Trimmed armorItem files
                getBuilder(currentTrimName)
                        .parent(new ModelFile.UncheckedModelFile("item/generated"))
                        .texture("layer0", armorItemResLoc.getNamespace() + ":item/" + armorItemResLoc.getPath())
                        .texture("layer1", trimResLoc);

                // Non-trimmed armorItem file (normal variant)
                this.withExistingParent(itemDeferredItem.getId().getPath(),
                                mcLoc("item/generated"))
                        .override()
                        .model(new ModelFile.UncheckedModelFile(trimNameResLoc.getNamespace()  + ":item/" + trimNameResLoc.getPath()))
                        .predicate(mcLoc("trim_type"), trimValue).end()
                        .texture("layer0",
                                ResourceLocation.fromNamespaceAndPath(MOD_ID,
                                        "item/" + itemDeferredItem.getId().getPath()));
            });
        }
    }

    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, SillyWilliesCore.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(ModItems.RAW_ENTANGULUM.get());
        basicItem(ModItems.TRIANGULUMRAW.get());
        basicItem(ModItems.TRIANGULUM.get());
        basicItem(ModItems.TRIANGULUMBRICK.get());
        basicItem(ModItems.TRIANGULUMUPGRADETEMPLATE.get());
        basicItem(ModItems.INCOMPLETE_TRIANGULUM.get());
        basicItem(ModItems.PLATE_MOLD.get());
        basicItem(ModItems.ENTANGULUM_DUST.get());
        basicItem(ModItems.DIRTY_ENTANGULUM_DUST.get());
        basicItem(ModItems.ENTANGULUM_SPOOL.get());
        basicItem(ModItems.ENTANGULUM_MASTERWORK_SMITHING_TEMPLATE.get());
        basicItem(ModItems.ENTANGULUM_STRING.get());
        basicItem(ModItems.EMPTY_SPOOL.get());
        basicItem(ModItems.ENTANGULUM_PLATE.get());
        basicItem(ModItems.ENTANGULUM_DUSTED_MOLD.get());

        basicItem(ModBlocks.WONDER_OAK_DOOR.asItem());

        handheldItem(ModItems.TRIANGULUM_SWORD);
        handheldItem(ModItems.TRIANGULUM_SHOVEL);
        handheldItem(ModItems.TRIANGULUM_AXE);
        handheldItem(ModItems.TRIANGULUM_HOE);
        handheldItem(ModItems.TRIANGULUM_PICKAXE);

        buttonItem(ModBlocks.TRIANGULUM_BRICKS_BUTTON,ModBlocks.TRIANGULUM_BRICKS);
        buttonItem(ModBlocks.GEOSTONE_BUTTON,ModBlocks.GEOSTONE);
        buttonItem(ModBlocks.WONDER_OAK_BUTTON,ModBlocks.WONDER_OAK_PLANKS);

        fenceItem(ModBlocks.WONDER_OAK_FENCE,ModBlocks.WONDER_OAK_PLANKS);

        wallItem(ModBlocks.TRIANGULUM_BRICKS_WALL,ModBlocks.TRIANGULUM_BRICKS);
        wallItem(ModBlocks.GEOSTONE_COBBLE_WALL,ModBlocks.GEOSTONE_COBBLE);
        wallItem(ModBlocks.GEOSTONE_BRICKS_WALL,ModBlocks.GEOSTONE_BRICKS);
        wallItem(ModBlocks.MOSSY_GEOSTONE_BRICKS_WALL,ModBlocks.MOSSY_GEOSTONE_BRICKS);

        saplingItem(ModBlocks.WONDER_OAK_SAPLING);
        saplingItem(ModBlocks.TWISTED_GRASS);

        differentItemTexture(ModBlocks.WONDER_OAK_SIGN);
        differentItemTexture(ModBlocks.WONDER_OAK_HANGING_SIGN);

        differentItemTexture(ModItems.WONDER_OAK_BOAT);
        differentItemTexture(ModItems.WONDER_OAK_CHEST_BOAT);

    }

    private ItemModelBuilder saplingItem(DeferredBlock<Block> item) {
        return withExistingParent(item.getId().getPath(),
                ResourceLocation.parse("item/generated")).texture("layer0",
                ResourceLocation.fromNamespaceAndPath(SillyWilliesCore.MOD_ID,"block/" + item.getId().getPath()));
    }


    private ItemModelBuilder differentItemTexture (DeferredBlock<Block> item) {
        return withExistingParent(item.getId().getPath(),
                ResourceLocation.parse("item/generated")).texture("layer0",
                ResourceLocation.fromNamespaceAndPath(SillyWilliesCore.MOD_ID,"item/" + item.getId().getPath()+"_item"));
    }

    private ItemModelBuilder differentItemTexture (DeferredItem<?> item) {
        return withExistingParent(item.getId().getPath(),
                ResourceLocation.parse("item/generated")).texture("layer0",
                ResourceLocation.fromNamespaceAndPath(SillyWilliesCore.MOD_ID,"item/" + item.getId().getPath()+"_item"));
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
    private ItemModelBuilder handheldItem(DeferredItem<?> item) {
        return withExistingParent(item.getId().getPath(),
                ResourceLocation.parse("item/handheld")).texture("layer0",
                ResourceLocation.fromNamespaceAndPath(SillyWilliesCore.MOD_ID,"item/" + item.getId().getPath()));
    }
}
