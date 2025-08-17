package net.errordude42.sillywilliescore.util;

import net.errordude42.sillywilliescore.SillyWilliesCore;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.biome.Biome;

public class ModBiomes {
    public static final ResourceKey<Biome> GEO_PLAINS = createKey("geo_plains");

    private static ResourceKey<Biome> createKey(String name) {
        return ResourceKey.create(Registries.BIOME, ResourceLocation.fromNamespaceAndPath(SillyWilliesCore.MOD_ID, name));
    }
}
