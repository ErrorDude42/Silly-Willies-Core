package net.errordude42.sillywilliescore.worldgen.tree;

import net.errordude42.sillywilliescore.SillyWilliesCore;
import net.errordude42.sillywilliescore.worldgen.ModConfiguredFeatures;
import net.minecraft.world.level.block.grower.TreeGrower;

import java.util.Optional;

public class ModTreeGrowers {

    public static final TreeGrower WONDER_OAK = new TreeGrower(SillyWilliesCore.MOD_ID+":wonder_oak",
            Optional.empty(),Optional.of(ModConfiguredFeatures.WONDER_OAK_KEY),Optional.empty());
}
