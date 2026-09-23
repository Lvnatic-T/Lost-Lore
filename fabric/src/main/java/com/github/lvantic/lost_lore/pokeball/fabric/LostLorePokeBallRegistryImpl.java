package com.github.lvantic.lost_lore.pokeball.fabric;

import com.cobblemon.mod.common.item.PokeBallItem;
import com.cobblemon.mod.common.pokeball.PokeBall;
import com.github.lvantic.lost_lore.LostLore;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;

public final class LostLorePokeBallRegistryImpl {

    private LostLorePokeBallRegistryImpl() {}

    public static void registerItem(String name, PokeBall pokeBall) {
        pokeBall.item = Registry.register(
                BuiltInRegistries.ITEM,
                ResourceLocation.fromNamespaceAndPath(
                        LostLore.MOD_ID,
                        name
                ),
                new PokeBallItem(pokeBall)
        );
    }
}