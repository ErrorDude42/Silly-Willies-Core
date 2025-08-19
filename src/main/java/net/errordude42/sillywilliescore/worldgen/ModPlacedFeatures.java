package net.errordude42.sillywilliescore.worldgen;

import net.errordude42.sillywilliescore.ModBlocks;
import net.errordude42.sillywilliescore.SillyWilliesCore;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.*;

import java.util.List;

public class ModPlacedFeatures {

    public static final ResourceKey<PlacedFeature> TRIANGULUM_ORE_PLACED_KEY = registerKey("triangulum_ore_placed");
    public static final ResourceKey<PlacedFeature> GEO_TRIANGULUM_ORE_PLACED_KEY = registerKey("geo_triangulum_ore_placed");

    public static final ResourceKey<PlacedFeature> WONDER_OAK_PLACED_KEY = registerKey("wonder_oak_placed");

    public static final ResourceKey<PlacedFeature> TWISTED_GRASS_PLACED_KEY = registerKey("twisted_grass_placed.json");

    public static final ResourceKey<PlacedFeature> GEOMETRIUS_PLACED_KEY = registerKey("geometrius_placed");

    public static void bootstrap(BootstrapContext<PlacedFeature> context){
        var configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);

    register(context,TRIANGULUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_TRIANGULUM_ORE_KEY),
            ModOrePlacement.rareOrePlacement(6, HeightRangePlacement.uniform(VerticalAnchor.absolute(-64),VerticalAnchor.absolute(-20))
            ));
        register(context,GEO_TRIANGULUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.GEO_TRIANGULUM_ORE_KEY),
                ModOrePlacement.commonOrePlacement(12, HeightRangePlacement.triangle(VerticalAnchor.absolute(-64),VerticalAnchor.absolute(160))
                ));

    register(context,TWISTED_GRASS_PLACED_KEY,configuredFeatures.getOrThrow(ModConfiguredFeatures.TWISTED_GRASS_KEY),
            List.of(NoiseThresholdCountPlacement.of(-0.8, 5, 10),
                    InSquarePlacement.spread(),
                    PlacementUtils.HEIGHTMAP_WORLD_SURFACE,
                    BiomeFilter.biome()));

        register(context,WONDER_OAK_PLACED_KEY,configuredFeatures.getOrThrow(ModConfiguredFeatures.WONDER_OAK_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(7,0.2f,6),
                        ModBlocks.WONDER_OAK_SAPLING.get()));

        PlacementUtils.register(context, GEOMETRIUS_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.GEOMETRIUS_KEY),
                RarityFilter.onAverageOnceEvery(32), InSquarePlacement.spread(),
                PlacementUtils.HEIGHTMAP, BiomeFilter.biome()
        );
    }


    private static ResourceKey<PlacedFeature> registerKey(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, ResourceLocation.fromNamespaceAndPath(SillyWilliesCore.MOD_ID, name));
    }

    private static void register(BootstrapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }

}
