package com.github.lvantic.lost_lore.pokeball.modifier;

import com.cobblemon.mod.common.api.pokeball.catching.CatchRateModifier;
import com.cobblemon.mod.common.pokemon.Pokemon;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.LivingEntity;
import org.jetbrains.annotations.NotNull;

public class TypingBallModifier implements CatchRateModifier {

    private static final float BASE_MODIFIER = 1.0F;
    private static final float UNOWN_MODIFIER = 5.0F;

    private static final ResourceLocation UNOWN =
            ResourceLocation.fromNamespaceAndPath("cobblemon", "unown");

    @Override
    public float value(@NotNull LivingEntity thrower, @NotNull Pokemon pokemon) {
        if (pokemon.getSpecies().getResourceIdentifier().equals(UNOWN)) {
            return UNOWN_MODIFIER;
        }

        return BASE_MODIFIER;
    }

    @Override
    public @NotNull Behavior behavior(@NotNull LivingEntity thrower, @NotNull Pokemon pokemon) {
        return Behavior.MULTIPLY;
    }

    @Override
    public boolean isValid(@NotNull LivingEntity thrower, @NotNull Pokemon pokemon) {
        return true;
    }

    @Override
    public float modifyCatchRate(float catchRate, @NotNull LivingEntity thrower, @NotNull Pokemon pokemon) {
        return behavior(thrower, pokemon).getMutator().invoke(catchRate, value(thrower, pokemon));
    }
}