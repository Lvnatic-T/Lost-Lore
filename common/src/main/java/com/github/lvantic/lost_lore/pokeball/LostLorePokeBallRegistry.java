package com.github.lvantic.lost_lore.pokeball;

import com.cobblemon.mod.common.pokeball.PokeBall;
import dev.architectury.injectables.annotations.ExpectPlatform;

public final class LostLorePokeBallRegistry {

    private LostLorePokeBallRegistry() {}

    @ExpectPlatform
    public static void registerItem(String name, PokeBall pokeBall) {
        throw new AssertionError();
    }
}