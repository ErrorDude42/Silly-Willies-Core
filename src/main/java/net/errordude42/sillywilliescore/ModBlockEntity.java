package net.errordude42.sillywilliescore;

import net.errordude42.sillywilliescore.block.sign.ModHangingSignBlockEntity;
import net.errordude42.sillywilliescore.block.sign.ModSignBlockEntity;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModBlockEntity {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(BuiltInRegistries.BLOCK_ENTITY_TYPE, SillyWilliesCore.MOD_ID);


    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITY_TYPES =
            DeferredRegister.create(Registries.BLOCK_ENTITY_TYPE, SillyWilliesCore.MOD_ID);

    public static final Supplier<BlockEntityType<ModSignBlockEntity>> MOD_SIGN = BLOCK_ENTITY_TYPES.register(
            "mod_sign",
            () -> BlockEntityType.Builder.of(
                    ModSignBlockEntity::new,
                    ModBlocks.WONDER_OAK_SIGN.get(),
                    ModBlocks.WONDER_OAK_WALL_SIGN.get()
            )
                    .build(null)
    );

    public static final Supplier<BlockEntityType<ModHangingSignBlockEntity>> MOD_HANGING_SIGN = BLOCK_ENTITY_TYPES.register(
            "mod_hanging_sign",
            () -> BlockEntityType.Builder.of(
                    ModHangingSignBlockEntity::new,
                            ModBlocks.WONDER_OAK_HANGING_SIGN.get(),
                            ModBlocks.WONDER_OAK_WALL_HANGING_SIGN.get()
                    )
                    .build(null)
    );

    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
        BLOCK_ENTITY_TYPES.register(eventBus);
    }
}
