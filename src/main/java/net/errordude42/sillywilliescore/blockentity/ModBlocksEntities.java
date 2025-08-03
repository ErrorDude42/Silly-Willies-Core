package net.errordude42.sillywilliescore.blockentity;

import net.errordude42.sillywilliescore.SillyWilliesCore;
import net.errordude42.sillywilliescore.block.ModBlocks;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModBlocksEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITY_TYPES = DeferredRegister.create(BuiltInRegistries.BLOCK_ENTITY_TYPE, SillyWilliesCore.MOD_ID);

    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<WonderOakSignBlockEntity>> WONDER_OAK_SIGN = BLOCK_ENTITY_TYPES.register("wonder_oak_sign", () ->
            BlockEntityType.Builder.of(WonderOakSignBlockEntity::new, ModBlocks.WONDER_OAK_WALL_SIGN.get(), ModBlocks.WONDER_OAK_SIGN.get()).build(null));

    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<WonderOakHangingSignBlockEntity>> WONDER_OAK_HANGING_SIGN = BLOCK_ENTITY_TYPES.register("wonder_oak_sign", () ->
            BlockEntityType.Builder.of(WonderOakHangingSignBlockEntity::new, ModBlocks.WONDER_OAK_WALL_HANGING_SIGN.get(), ModBlocks.WONDER_OAK_HANGING_SIGN.get()).build(null));
}
