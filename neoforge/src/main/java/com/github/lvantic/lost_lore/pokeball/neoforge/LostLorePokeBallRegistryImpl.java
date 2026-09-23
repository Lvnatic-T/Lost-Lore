package com.github.lvantic.lost_lore.pokeball.neoforge;

import com.cobblemon.mod.common.item.PokeBallItem;
import com.cobblemon.mod.common.pokeball.PokeBall;
import com.github.lvantic.lost_lore.LostLore;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

public final class LostLorePokeBallRegistryImpl {

    private static final DeferredRegister.Items ITEMS =
            DeferredRegister.createItems(LostLore.MOD_ID);

    private LostLorePokeBallRegistryImpl() {}

    public static void registerItem(String name, PokeBall pokeBall) {
        ITEMS.register(
                name,
                () -> {
                    PokeBallItem item = new PokeBallItem(pokeBall);
                    pokeBall.item = item;
                    return item;
                }
        );
    }

    public static void register(IEventBus modBus) {
        ITEMS.register(modBus);
    }
}