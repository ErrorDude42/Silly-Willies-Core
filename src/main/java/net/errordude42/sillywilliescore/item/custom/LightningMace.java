package net.errordude42.sillywilliescore.item.custom;

import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.MaceItem;

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
