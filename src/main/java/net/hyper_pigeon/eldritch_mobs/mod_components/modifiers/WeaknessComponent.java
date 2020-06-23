package net.hyper_pigeon.eldritch_mobs.mod_components.modifiers;

import net.hyper_pigeon.eldritch_mobs.mod_components.interfaces.ModifierInterface;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.nbt.CompoundTag;

public class WeaknessComponent implements ModifierInterface {

    private final static long cooldown = 200;
    private long nextAbilityUse = 0L;

    @Override
    public void useAbility(MobEntity entity) {
        if(entity.getTarget() != null) {
            long time = entity.getEntityWorld().getTime();
            if (time > nextAbilityUse) {
                nextAbilityUse = time + nextAbilityUse;
                entity.getTarget().addStatusEffect(new StatusEffectInstance(StatusEffects.WEAKNESS, 175, 0));
            }
        }
    }

    @Override
    public void setRank() {

    }

    @Override
    public void setMods() {

    }

    @Override
    public boolean hasMod(String name) {
        return false;
    }

    @Override
    public void damageActivatedMod(LivingEntity entity, DamageSource source, float amount) {

    }

    @Override
    public boolean isEldritch() {
        return false;
    }

    @Override
    public String get_mod_string() {
        return null;
    }

    @Override
    public boolean isElite() {
        return false;
    }

    @Override
    public boolean isUltra() {
        return false;
    }

    @Override
    public void fromTag(CompoundTag compoundTag) {

    }

    @Override
    public CompoundTag toTag(CompoundTag compoundTag) {
        return null;
    }
}