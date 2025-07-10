package net.errordude42.sillywilliescore.datagen;

import net.errordude42.sillywilliescore.SillyWilliesCore;
import net.errordude42.sillywilliescore.block.ModBlocks;
import net.errordude42.sillywilliescore.item.ModItems;
import net.errordude42.sillywilliescore.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.nbt.Tag;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.ItemLike;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {

    public ModRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {
    List<ItemLike> TRIANGULUM_SMELTABLES = List.of(ModItems.TRIANGULUMRAW, ModBlocks.TRIANGULUMORE_DEEPSLATE);
    List<ItemLike> ENTANGULUM_SMELTABLES = List.of(ModItems.RAW_ENTANGULUM, ModBlocks.ENTANGULUM_ORE);

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


        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,ModItems.RAW_ENTANGULUM.get(),9)
                .requires(ModBlocks.BLOCK_OF_RAW_ENTANGULUM)
                .unlockedBy("has_entangulum_block",
                        has(ModBlocks.BLOCK_OF_RAW_ENTANGULUM)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,ModItems.TRIANGULUMRAW.get(),9)
                .requires(ModBlocks.BLOCK_OF_RAW_TRIANGULUM)
                .unlockedBy("has_entangulum_block",
                        has(ModBlocks.BLOCK_OF_RAW_TRIANGULUM)).save(recipeOutput);

        oreSmelting(recipeOutput,TRIANGULUM_SMELTABLES, RecipeCategory.MISC,ModItems.TRIANGULUMRAW.get(), 4f, 200, "triangulum" );
        oreBlasting(recipeOutput,TRIANGULUM_SMELTABLES, RecipeCategory.MISC,ModItems.TRIANGULUMRAW.get(), 4f, 150, "triangulum" );
        oreSmelting(recipeOutput,ENTANGULUM_SMELTABLES, RecipeCategory.MISC,ModItems.RAW_ENTANGULUM.get(), 6f, 300, "entangulum" );
        oreBlasting(recipeOutput,ENTANGULUM_SMELTABLES, RecipeCategory.MISC,ModItems.RAW_ENTANGULUM.get(), 6f, 250, "entangulum" );



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
