package net.errordude42.sillywilliescore.util;

import net.errordude42.sillywilliescore.SillyWilliesCore;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> NEEDS_TRIANGULUM_TOOL = createTag("needs_triangulum_tool");
        public static final TagKey<Block> INCORRECT_FOR_TRIANGULUM_TOOL = createTag("incorrect_for_triangulum_tool");
        private static TagKey<Block> createTag(String name) {
            return BlockTags.create(ResourceLocation.fromNamespaceAndPath(SillyWilliesCore.MOD_ID, name));
        }
    }

        public static class Items {

            public static final TagKey<Item> TRIANGULUM_SMELTABLE = createTag("triangulum_smeltable");
            public static final TagKey<Item> ENTANGULUM_SMELTABLE = createTag("entangulum_smeltable");
            public static final TagKey<Item> GEOSTONE_STONECUTTING = createTag("geostone_stonecutting");
            public static final TagKey<Item> WONDER_OAK_LOG_OR_WOOD = createTag("wonder_oak_log_or_wood");

            private static TagKey<Item> createTag(String name) {
                return ItemTags.create(ResourceLocation.fromNamespaceAndPath(SillyWilliesCore.MOD_ID, name));
            }
        }

        public static class Biomes{
            public static final TagKey<Biome> IS_GEO = createTag("is_geo");


            private static TagKey<Biome> createTag(String name) {
                return TagKey.create(Registries.BIOME, ResourceLocation.fromNamespaceAndPath(SillyWilliesCore.MOD_ID, name));
            }
        }
    }
