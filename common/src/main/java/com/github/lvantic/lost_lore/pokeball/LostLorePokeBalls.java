package com.github.lvantic.lost_lore.pokeball;

import com.cobblemon.mod.common.pokeball.PokeBall;
import com.github.lvantic.lost_lore.LostLore;
import com.github.lvantic.lost_lore.pokeball.modifier.MewtwoBallModifier;
import com.github.lvantic.lost_lore.pokeball.modifier.TypingBallModifier;
import net.minecraft.resources.ResourceLocation;

public final class LostLorePokeBalls {

    public static PokeBall MEWTWO_BALL;

    public static PokeBall TYPING_BALL;

    private LostLorePokeBalls() {
    }

    public static void register() {
        MEWTWO_BALL = LostLorePokeBallHelper.register(
                ResourceLocation.fromNamespaceAndPath(
                        LostLore.MOD_ID,
                        "mewtwo_ball"
                ),
                new MewtwoBallModifier(),
                0.8F,
                1.25F,
                false
        );
        TYPING_BALL = LostLorePokeBallHelper.register(
                ResourceLocation.fromNamespaceAndPath(
                        LostLore.MOD_ID,
                        "typing_ball"
                ),
                new TypingBallModifier(),
                0.8F,
                1.25F,
                false
        );
    }
}