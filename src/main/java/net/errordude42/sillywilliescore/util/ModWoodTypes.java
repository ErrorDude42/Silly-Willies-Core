package net.errordude42.sillywilliescore.util;

import net.errordude42.sillywilliescore.SillyWilliesCore;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;

public class ModWoodTypes {
   public static final WoodType WONDER_OAK = WoodType.register(new WoodType(SillyWilliesCore.MOD_ID + ":wonder_oak", BlockSetType.OAK));
}
