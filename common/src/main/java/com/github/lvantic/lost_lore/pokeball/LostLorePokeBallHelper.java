package com.github.lvantic.lost_lore.pokeball;

import com.cobblemon.mod.common.pokeball.PokeBall;
import com.cobblemon.mod.common.api.pokeball.PokeBalls;
import com.cobblemon.mod.common.api.pokeball.catching.CatchRateModifier;
import com.cobblemon.mod.common.item.PokeBallItem;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;

import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;

public final class LostLorePokeBallHelper {

    private LostLorePokeBallHelper() {
    }

    @SuppressWarnings("unchecked")
    private static Map<ResourceLocation, PokeBall> getPokeBallRegistry() {
        try {
            Field defaultsField = PokeBalls.INSTANCE
                    .getClass()
                    .getDeclaredField("defaults");

            defaultsField.setAccessible(true);

            return (Map<ResourceLocation, PokeBall>)
                    defaultsField.get(PokeBalls.INSTANCE);

        } catch (NoSuchFieldException | IllegalAccessException e) {
            throw new RuntimeException(
                    "Lost Lore failed to access Cobblemon's Poké Ball registry.",
                    e
            );
        }
    }

    public static PokeBall register(
            ResourceLocation id,
            CatchRateModifier catchRateModifier,
            float waterDrag,
            float throwPower,
            boolean ancient
    ) {
        ResourceLocation itemModel = id;

        ResourceLocation model3d =
                ResourceLocation.fromNamespaceAndPath(
                        id.getNamespace(),
                        "item/" + id.getPath() + "_model"
                );

        PokeBall pokeBall = new PokeBall(
                id,
                catchRateModifier,
                List.of(),
                waterDrag,
                itemModel,
                model3d,
                throwPower,
                ancient
        );

        getPokeBallRegistry().put(id, pokeBall);

        pokeBall.item = Registry.register(
                BuiltInRegistries.ITEM,
                id,
                new PokeBallItem(pokeBall)
        );

        return pokeBall;
    }
}