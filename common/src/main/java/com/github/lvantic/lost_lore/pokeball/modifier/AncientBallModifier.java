package com.github.lvantic.lost_lore.pokeball.modifier;

import com.cobblemon.mod.common.Cobblemon;
import com.cobblemon.mod.common.api.pokeball.catching.CatchRateModifier;
import com.cobblemon.mod.common.api.storage.party.PlayerPartyStore;
import com.cobblemon.mod.common.pokemon.Pokemon;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.LivingEntity;
import org.jetbrains.annotations.NotNull;

public class AncientBallModifier implements CatchRateModifier {

    private static final float BASE_MODIFIER = 1.0F;
    private static final float TERAPAGOS_MODIFIER = 3.0F;
    private static final float TERA_MODIFIER = 3.0F;
    private static final float COMBINED_MODIFIER = 5.0F;

    private static final ResourceLocation TERAPAGOS =
            ResourceLocation.fromNamespaceAndPath("cobblemon", "terapagos");

    @Override
    public float value(@NotNull LivingEntity thrower, @NotNull Pokemon pokemon) {
        boolean terastallized = pokemon.getPersistentData().getBoolean("is_tera");
        boolean hasTerapagos = hasTerapagos(thrower);

        if (terastallized && hasTerapagos) {
            return COMBINED_MODIFIER;
        }

        if (terastallized) {
            return TERA_MODIFIER;
        }

        if (hasTerapagos) {
            return TERAPAGOS_MODIFIER;
        }

        return BASE_MODIFIER;
    }

    private boolean hasTerapagos(LivingEntity thrower) {
        if (!(thrower instanceof ServerPlayer player)) {
            return false;
        }

        PlayerPartyStore party =
                Cobblemon.INSTANCE.getStorage().getParty(player);

        for (Pokemon partyPokemon : party) {
            if (partyPokemon.getSpecies().getResourceIdentifier().equals(TERAPAGOS)) {
                return true;
            }
        }

        return false;
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