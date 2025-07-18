package net.errordude42.sillywilliescore.datagen;

import net.errordude42.sillywilliescore.SillyWilliesCore;
import net.errordude42.sillywilliescore.block.ModBlocks;
import net.errordude42.sillywilliescore.item.ModItems;
import net.errordude42.sillywilliescore.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SlabBlock;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;
import net.neoforged.neoforge.registries.DeferredBlock;
import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {

    public ModRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected void buildRecipes( RecipeOutput recipeOutput) {
    List<ItemLike> TRIANGULUM_SMELTABLES = List.of(ModItems.TRIANGULUMRAW, ModBlocks.TRIANGULUMORE_DEEPSLATE);
    List<ItemLike> ENTANGULUM_SMELTABLES = List.of(ModItems.RAW_ENTANGULUM, ModBlocks.ENTANGULUM_ORE);
    List<ItemLike> GEOSTONE_STONECUTTING = List.of(ModBlocks.GEOSTONE,ModBlocks.GEOSTONE_BRICKS);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.BLOCK_OF_RAW_TRIANGULUM.get())
                .pattern("aaa")
                .pattern("aaa")
                .pattern("aaa")
                .define('a', ModItems.TRIANGULUMRAW.get())
                .unlockedBy("has_triangulum",has(ModItems.TRIANGULUMRAW)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.BLOCK_OF_RAW_ENTANGULUM.get())
                .pattern("aaa")
                .pattern("aaa")
                .pattern("aaa")
                .define('a', ModItems.RAW_ENTANGULUM.get())
                .unlockedBy("has_entangulum",has(ModItems.RAW_ENTANGULUM)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.TRIANGULUM_BRICKS.get())
                .pattern("aa")
                .pattern("aa")
                .define('a', ModItems.TRIANGULUMBRICK.get())
                .unlockedBy("has_triangulum_brick",has(ModItems.TRIANGULUMBRICK)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.GEOSTONE_BRICKS.get(),4)
                .pattern("aa")
                .pattern("aa")
                .define('a', ModBlocks.GEOSTONE.get())
                .unlockedBy("has_geostone",has(ModBlocks.GEOSTONE)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.SILT.get(),2)
                .pattern("ab")
                .pattern("ba")
                .define('a', Blocks.DIRT)
                .define('b', Items.CLAY_BALL)
                .unlockedBy("has_geostone",has(ModBlocks.GEOSTONE)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModItems.TRIANGULUMBRICK.get(), 8)
                .pattern("aaa")
                .pattern("aba")
                .pattern("aaa")
                .define('a',Items.BRICK)
                .define('b',ModItems.TRIANGULUMRAW.get())
                .unlockedBy("has_entangulum",has(ModItems.TRIANGULUMRAW)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ENTANGULUM_SPOOL.get())
                .pattern("aaa")
                .pattern("aba")
                .pattern("aaa")
                .define('a',ModItems.ENTANGULUM_STRING.get())
                .define('b',ModItems.EMPTY_SPOOL.get())
                .unlockedBy("has_entangulum",has(ModItems.RAW_ENTANGULUM)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.EMPTY_SPOOL.get())
                .pattern("  a")
                .pattern(" b ")
                .pattern("a  ")
                .define('a',Items.IRON_INGOT)
                .define('b',Items.BREEZE_ROD)
                .unlockedBy("has_breeze_rod",has(Items.BREEZE_ROD)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.TRIANGULUMUPGRADETEMPLATE.get(), 2)
                .pattern("aca")
                .pattern("aba")
                .pattern("aaa")
                .define('a',Items.DIAMOND)
                .define('b',ModItems.TRIANGULUM.get())
                .define('c',ModItems.TRIANGULUMUPGRADETEMPLATE.get())
                .unlockedBy("has_triangulum_template",has(ModItems.TRIANGULUMUPGRADETEMPLATE)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ENTANGULUM_MASTERWORK_SMITHING_TEMPLATE.get(), 5)
                .pattern("aca")
                .pattern("aba")
                .pattern("aaa")
                .define('a',ModItems.TRIANGULUM.get())
                .define('b',ModItems.RAW_ENTANGULUM.get())
                .define('c',ModItems.ENTANGULUM_MASTERWORK_SMITHING_TEMPLATE.get())
                .unlockedBy("has_entangulum_template",has(ModItems.ENTANGULUM_MASTERWORK_SMITHING_TEMPLATE)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,ModItems.RAW_ENTANGULUM.get(),9)
                .requires(ModBlocks.BLOCK_OF_RAW_ENTANGULUM)
                .unlockedBy("has_entangulum_block",
                        has(ModBlocks.BLOCK_OF_RAW_ENTANGULUM)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,ModItems.TRIANGULUMRAW.get(),9)
                .requires(ModBlocks.BLOCK_OF_RAW_TRIANGULUM)
                .unlockedBy("has_triangulum_block",
                        has(ModBlocks.BLOCK_OF_RAW_TRIANGULUM)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,ModItems.ENTANGULUM_DUSTED_MOLD.get(),1)
                .requires(ModItems.PLATE_MOLD)
                .requires(ModItems.ENTANGULUM_DUST)
                .requires(ModItems.ENTANGULUM_DUST)
                .unlockedBy("has_entangulum",
                        has(ModItems.RAW_ENTANGULUM)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,ModItems.ENTANGULUM_PLATE.get(),1)
                .requires(ModItems.ENTANGULUM_DUSTED_MOLD)
                .requires(ModItems.TRIANGULUM)
                .unlockedBy("has_entangulum",
                        has(ModItems.RAW_ENTANGULUM)).save(recipeOutput);


        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,ModItems.TRIANGULUM.get(),1)
                .requires(ModItems.INCOMPLETE_TRIANGULUM)
                .requires(ModItems.INCOMPLETE_TRIANGULUM)
                .requires(ModItems.INCOMPLETE_TRIANGULUM)
                .requires(ModItems.INCOMPLETE_TRIANGULUM)
                .requires(Items.NETHERITE_SCRAP)
                .requires(Items.NETHERITE_SCRAP)
                .requires(Items.NETHERITE_SCRAP)
                .requires(Items.NETHERITE_SCRAP)
                .unlockedBy("has_triangulum_Incom",
                        has(ModItems.INCOMPLETE_TRIANGULUM)).save(recipeOutput);

            stairBuilder(ModBlocks.TRIANGULUM_BRICKS_STAIRS.get(),Ingredient.of(ModBlocks.TRIANGULUM_BRICKS))
                    .group("triangulum_bricks")
                    .unlockedBy("has_triangulum_bricks",has(ModBlocks.TRIANGULUM_BRICKS)).save(recipeOutput);
        stairBuilder(ModBlocks.GEOSTONE_STAIRS.get(),Ingredient.of(ModBlocks.GEOSTONE))
                .group("geostone")
                .unlockedBy("has_geostone",has(ModBlocks.GEOSTONE)).save(recipeOutput);
        stairBuilder(ModBlocks.GEOSTONE_BRICKS_STAIRS.get(),Ingredient.of(ModBlocks.GEOSTONE_BRICKS))
                .group("geostone_bricks")
                .unlockedBy("has_geostone_bricks",has(ModBlocks.GEOSTONE_BRICKS)).save(recipeOutput);
        stairBuilder(ModBlocks.MOSSY_GEOSTONE_BRICKS_STAIRS.get(),Ingredient.of(ModBlocks.MOSSY_GEOSTONE_BRICKS))
                .group("mossy_geostone_bricks")
                .unlockedBy("has_mossy_geostone_bricks",has(ModBlocks.MOSSY_GEOSTONE_BRICKS)).save(recipeOutput);
        stairBuilder(ModBlocks.GEOSTONE_COBBLE_STAIRS.get(),Ingredient.of(ModBlocks.GEOSTONE_COBBLE))
                .group("geostone_cobble")
                .unlockedBy("has_geostone_cobble",has(ModBlocks.GEOSTONE_COBBLE)).save(recipeOutput);
            buttonBuilder(ModBlocks.TRIANGULUM_BRICKS_BUTTON.get(),Ingredient.of(ModBlocks.TRIANGULUM_BRICKS))
                .group("triangulum_bricks")
                .unlockedBy("has_triangulum_bricks",has(ModBlocks.TRIANGULUM_BRICKS)).save(recipeOutput);
        buttonBuilder(ModBlocks.GEOSTONE_BUTTON.get(),Ingredient.of(ModBlocks.GEOSTONE))
                .group("geostone")
                .unlockedBy("has_geostone",has(ModBlocks.GEOSTONE)).save(recipeOutput);

            slab(recipeOutput,RecipeCategory.BUILDING_BLOCKS,ModBlocks.TRIANGULUM_BRICKS_SLAB.get(),ModBlocks.TRIANGULUM_BRICKS);
            slab(recipeOutput,RecipeCategory.BUILDING_BLOCKS,ModBlocks.GEOSTONE_SLAB.get(),ModBlocks.GEOSTONE);
            slab(recipeOutput,RecipeCategory.BUILDING_BLOCKS,ModBlocks.SMOOTH_GEOSTONE_SLAB.get(),ModBlocks.SMOOTH_GEOSTONE);
            slab(recipeOutput,RecipeCategory.BUILDING_BLOCKS,ModBlocks.GEOSTONE_BRICKS_SLAB.get(),ModBlocks.GEOSTONE_BRICKS);
            slab(recipeOutput,RecipeCategory.BUILDING_BLOCKS,ModBlocks.MOSSY_GEOSTONE_BRICKS_SLAB.get(),ModBlocks.MOSSY_GEOSTONE_BRICKS);
            slab(recipeOutput,RecipeCategory.BUILDING_BLOCKS,ModBlocks.GEOSTONE_COBBLE_SLAB.get(),ModBlocks.GEOSTONE_COBBLE);

            wall(recipeOutput, RecipeCategory.BUILDING_BLOCKS,ModBlocks.TRIANGULUM_BRICKS_WALL.get(),ModBlocks.TRIANGULUM_BRICKS);
            wall(recipeOutput, RecipeCategory.BUILDING_BLOCKS,ModBlocks.GEOSTONE_COBBLE_WALL.get(),ModBlocks.GEOSTONE_COBBLE);
            wall(recipeOutput, RecipeCategory.BUILDING_BLOCKS,ModBlocks.GEOSTONE_BRICKS_WALL.get(),ModBlocks.GEOSTONE_BRICKS);
            wall(recipeOutput, RecipeCategory.BUILDING_BLOCKS,ModBlocks.MOSSY_GEOSTONE_BRICKS_WALL.get(),ModBlocks.MOSSY_GEOSTONE_BRICKS);
            pressurePlate(recipeOutput,ModBlocks.TRIANGULUM_BRICKS_PRESSURE_PLATE.get(),ModBlocks.TRIANGULUM_BRICKS);
            pressurePlate(recipeOutput,ModBlocks.GEOSTONE_PRESSURE_PLATE.get(),ModBlocks.GEOSTONE);


        oreSmelting(recipeOutput,
                TRIANGULUM_SMELTABLES,
                RecipeCategory.MISC,
                ModItems.INCOMPLETE_TRIANGULUM.get(),
                4f,
                200,
                "triangulum" );
        oreBlasting(recipeOutput,
                TRIANGULUM_SMELTABLES,
                RecipeCategory.MISC,
                ModItems.INCOMPLETE_TRIANGULUM.get(),
                4f,
                150,
                "triangulum" );
        oreSmelting(recipeOutput,
                ENTANGULUM_SMELTABLES,
                RecipeCategory.MISC,
                ModItems.DIRTY_ENTANGULUM_DUST.get(),
                6f,
                300,
                "entangulum" );
        oreBlasting(recipeOutput,
                ENTANGULUM_SMELTABLES,
                RecipeCategory.MISC,
                ModItems.DIRTY_ENTANGULUM_DUST.get(),
                6f,
                250,
                "entangulum" );

        smithingRecipe(recipeOutput, ModItems.TRIANGULUMUPGRADETEMPLATE.get(), Items.NETHERITE_AXE, ModItems.TRIANGULUM.get(), RecipeCategory.TOOLS, ModItems.TRIANGULUM_AXE.get(), "triangulum_axe");
        smithingRecipe(recipeOutput, ModItems.TRIANGULUMUPGRADETEMPLATE.get(), Items.NETHERITE_PICKAXE, ModItems.TRIANGULUM.get(), RecipeCategory.TOOLS, ModItems.TRIANGULUM_PICKAXE.get(), "triangulum_pickaxe");
        smithingRecipe(recipeOutput, ModItems.TRIANGULUMUPGRADETEMPLATE.get(), Items.NETHERITE_HOE, ModItems.TRIANGULUM.get(), RecipeCategory.TOOLS, ModItems.TRIANGULUM_HOE.get(), "triangulum_hoe");
        smithingRecipe(recipeOutput, ModItems.TRIANGULUMUPGRADETEMPLATE.get(), Items.NETHERITE_SWORD, ModItems.TRIANGULUM.get(), RecipeCategory.TOOLS, ModItems.TRIANGULUM_SWORD.get(), "triangulum_sword");
        smithingRecipe(recipeOutput, ModItems.TRIANGULUMUPGRADETEMPLATE.get(), Items.NETHERITE_SHOVEL, ModItems.TRIANGULUM.get(), RecipeCategory.TOOLS, ModItems.TRIANGULUM_SHOVEL.get(), "triangulum_shovel");
        smithingRecipe(recipeOutput, ModItems.ENTANGULUM_MASTERWORK_SMITHING_TEMPLATE.get(), Items.STRING, ModItems.ENTANGULUM_DUST.get(), RecipeCategory.TOOLS, ModItems.ENTANGULUM_STRING.get(), "Entangulum_String");


        stonecutterResultFromBase(recipeOutput,RecipeCategory.MISC,ModItems.ENTANGULUM_DUST.get(),ModItems.DIRTY_ENTANGULUM_DUST.get(),1);
        stonecutterResultFromBase(recipeOutput,RecipeCategory.MISC,ModBlocks.TRIANGULUM_BRICKS_STAIRS,ModBlocks.TRIANGULUM_BRICKS,1);
        stonecutterResultFromBase(recipeOutput,RecipeCategory.MISC,ModBlocks.TRIANGULUM_BRICKS_SLAB,ModBlocks.TRIANGULUM_BRICKS,2);
        stonecutterResultFromBase(recipeOutput,RecipeCategory.MISC,ModBlocks.TRIANGULUM_BRICKS_WALL,ModBlocks.TRIANGULUM_BRICKS,1);
        stonecutterResultFromBase(recipeOutput,RecipeCategory.MISC,ModBlocks.GEOSTONE_SLAB,ModBlocks.GEOSTONE,2);
        stonecutterResultFromBase(recipeOutput,RecipeCategory.MISC,ModBlocks.SMOOTH_GEOSTONE_SLAB,ModBlocks.SMOOTH_GEOSTONE,2);
        stonecutterResultFromBase(recipeOutput,RecipeCategory.MISC,ModBlocks.GEOSTONE_BRICKS,ModBlocks.GEOSTONE,1);
        stonecuttermulti(recipeOutput,RecipeCategory.MISC, ModBlocks.CHISLED_GEOSTONE, ModTags.Items.GEOSTONE_STONECUTTING,1,ModBlocks.GEOSTONE.get());
        stonecuttermulti(recipeOutput,RecipeCategory.MISC, ModBlocks.GEOSTONE_BRICKS_SLAB, ModTags.Items.GEOSTONE_STONECUTTING,2,ModBlocks.GEOSTONE.get());
        stonecutterResultFromBase(recipeOutput,RecipeCategory.MISC,ModBlocks.MOSSY_GEOSTONE_BRICKS_SLAB,ModBlocks.MOSSY_GEOSTONE_BRICKS,2);
        stonecuttermulti(recipeOutput,RecipeCategory.MISC,ModBlocks.GEOSTONE_BRICKS_STAIRS, ModTags.Items.GEOSTONE_STONECUTTING,1,ModBlocks.GEOSTONE.get());
        stonecutterResultFromBase(recipeOutput,RecipeCategory.MISC,ModBlocks.MOSSY_GEOSTONE_BRICKS_STAIRS,ModBlocks.MOSSY_GEOSTONE_BRICKS,1);
        stonecuttermulti(recipeOutput,RecipeCategory.MISC,ModBlocks.GEOSTONE_BRICKS_WALL, ModTags.Items.GEOSTONE_STONECUTTING,1,ModBlocks.GEOSTONE.get());
        stonecutterResultFromBase(recipeOutput,RecipeCategory.MISC,ModBlocks.MOSSY_GEOSTONE_BRICKS_WALL,ModBlocks.MOSSY_GEOSTONE_BRICKS,1);
        stonecutterResultFromBase(recipeOutput,RecipeCategory.MISC,ModBlocks.GEOSTONE_COBBLE_SLAB,ModBlocks.GEOSTONE_COBBLE,2);
        stonecutterResultFromBase(recipeOutput,RecipeCategory.MISC,ModBlocks.GEOSTONE_COBBLE_STAIRS,ModBlocks.GEOSTONE_COBBLE,1);
        stonecutterResultFromBase(recipeOutput,RecipeCategory.MISC,ModBlocks.GEOSTONE_COBBLE_WALL,ModBlocks.GEOSTONE_COBBLE,1);



    }

    protected static void stonecutterResultFromBase(RecipeOutput recipeOutput, RecipeCategory category, ItemLike result, ItemLike material,int resultCount) {
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(material), category, result, resultCount)
                .unlockedBy(getHasName(material), has(material))
         .save(recipeOutput, SillyWilliesCore.MOD_ID + ":"+ getItemName(result) + "_stonecutting");
    }

    protected static <T extends SingleItemRecipe> void stonecuttermulti(RecipeOutput recipeOutput, RecipeCategory category, ItemLike result, TagKey material, int resultCount, Block unlockBy) {
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(material), category, result, resultCount)
                .unlockedBy(getHasName(unlockBy), has(unlockBy))
                .save(recipeOutput, SillyWilliesCore.MOD_ID + ":"+ getItemName(result) + "_stonecutting");
    }


    protected static void smithing( RecipeOutput recipeOutput, Item template, Item base, Item addition, RecipeCategory category, Item result, String recipeName) {
        smithingRecipe(recipeOutput, template, base, addition, category, result, recipeName);
    }

    protected static <T extends AbstractCookingRecipe> void smithingRecipe( RecipeOutput recipeOutput, Item template, Item base, Item addition, RecipeCategory category, Item result, String recipeName) {
        {
            SmithingTransformRecipeBuilder.smithing(Ingredient.of(template), Ingredient.of(base), Ingredient.of(addition), category, result)
                    .unlocks(getHasName(base), has(result))
                    .save(recipeOutput, SillyWilliesCore.MOD_ID + ":" + getItemName(result) + "_smithing_");
        }
    }

    protected static void oreSmelting(RecipeOutput recipeOutput, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult,
                                      float pExperience, int pCookingTIme, String pGroup) {
        oreCooking(recipeOutput, RecipeSerializer.SMELTING_RECIPE, SmeltingRecipe::new, pIngredients, pCategory, pResult,
                pExperience, pCookingTIme, pGroup, "_from_smelting");
    }
    protected static void oreBlasting(RecipeOutput recipeOutput, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult,
                                      float pExperience, int pCookingTime, String pGroup) {
        oreCooking(recipeOutput, RecipeSerializer.BLASTING_RECIPE, BlastingRecipe::new, pIngredients, pCategory, pResult,
                pExperience, pCookingTime, pGroup, "_from_blasting");
    }
    protected static <T extends AbstractCookingRecipe> void oreCooking(RecipeOutput recipeOutput, RecipeSerializer<T> pCookingSerializer, AbstractCookingRecipe.Factory<T> factory,
                                                                       List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName) {
        for(ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), pCategory, pResult, pExperience, pCookingTime, pCookingSerializer, factory).group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(recipeOutput, SillyWilliesCore.MOD_ID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }
    }

}
