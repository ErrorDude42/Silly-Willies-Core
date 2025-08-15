package net.errordude42.sillywilliescore.item.custom;

import net.errordude42.sillywilliescore.effect.ConductiveEffect;
import net.errordude42.sillywilliescore.effect.ModEffects;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.*;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.MaceItem;

import java.lang.reflect.Executable;

public class LightningMace extends MaceItem {


    public LightningMace(Properties properties) {
        super(properties);
    }

    public void postHurtEnemy(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        stack.hurtAndBreak(1, attacker, EquipmentSlot.MAINHAND);
        ServerLevel serverLevel = (ServerLevel) target.level();
        if (attacker instanceof ServerPlayer serverplayer && canSmashAttack(serverplayer)) {
            if (canSmashAttack(attacker)){
                EntityType.LIGHTNING_BOLT.spawn(serverLevel,target.getOnPos(), MobSpawnType.TRIGGERED);
                attacker.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE,60,255));
            }
        }
    }
}
