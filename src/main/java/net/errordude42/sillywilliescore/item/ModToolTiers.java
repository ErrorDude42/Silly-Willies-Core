package net.errordude42.sillywilliescore.item;

import net.errordude42.sillywilliescore.util.ModTags;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.SimpleTier;

public class ModToolTiers {

    public static final Tier TRIANGULUM = new SimpleTier(ModTags.Blocks.INCORRECT_FOR_TRIANGULUM_TOOL,
            2500,10f, 5f,30, ()-> Ingredient.of(ModItems.TRIANGULUM));
}
