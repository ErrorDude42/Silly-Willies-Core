package net.errordude42.sillywilliescore.effect;

import net.errordude42.sillywilliescore.SillyWilliesCore;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModEffects {
    public static DeferredRegister<MobEffect> MOB_EFFECTS =
            DeferredRegister.create(BuiltInRegistries.MOB_EFFECT, SillyWilliesCore.MOD_ID);

    public static final Holder<MobEffect> CONDUCTIVE_EFFECT = MOB_EFFECTS.register("conductive",
            () -> new ConductiveEffect(MobEffectCategory.HARMFUL,0x00dfff)
                    .addAttributeModifier(Attributes.ARMOR,
                            ResourceLocation.fromNamespaceAndPath(SillyWilliesCore.MOD_ID,"conductive"),-2f,
                            AttributeModifier.Operation.ADD_MULTIPLIED_BASE)
            );

    public static void register(IEventBus eventBus){
        MOB_EFFECTS.register(eventBus);
    }
}
