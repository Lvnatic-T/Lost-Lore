package com.github.lvantic.lost_lore.pokeball.modifier;

import com.cobblemon.mod.common.api.pokeball.catching.CatchRateModifier;
import com.cobblemon.mod.common.pokemon.Pokemon;
import net.minecraft.world.entity.LivingEntity;
import org.jetbrains.annotations.NotNull;

public class MewtwoBallModifier implements CatchRateModifier {

    private static final float BASE_MODIFIER = 2.0F;

    @Override
    public float value(
            @NotNull LivingEntity thrower,
            @NotNull Pokemon pokemon
    ) {
        float maxHp = pokemon.getMaxHealth();
        float currentHp = pokemon.getCurrentHealth();

        /*
         * Normal HP factor is (3M - 2H) / (3M)
         *
         * Applying it inversed so target's current HP
         * effectively doesn't influence the catch chance.
         */
        float hpCompensation =
                (3.0F * maxHp) /
                        ((3.0F * maxHp) - (2.0F * currentHp));

        return BASE_MODIFIER * hpCompensation;
    }

    @Override
    public @NotNull Behavior behavior(
            @NotNull LivingEntity thrower,
            @NotNull Pokemon pokemon
    ) {
        return Behavior.MULTIPLY;
    }

    @Override
    public boolean isValid(
            @NotNull LivingEntity thrower,
            @NotNull Pokemon pokemon
    ) {
        return true;
    }

    @Override
    public float modifyCatchRate(
            float catchRate,
            @NotNull LivingEntity thrower,
            @NotNull Pokemon pokemon
    ) {
        return behavior(thrower, pokemon)
                .getMutator()
                .invoke(catchRate, value(thrower, pokemon));
    }
}