package com.github.lvantic.lost_lore.fabric.client;

import com.github.lvantic.lost_lore.pokeball.fabric.LostLorePokeBallTooltips;
import com.github.lvantic.lost_lore.itemGroup.fabric.LostLoreCreativeTabItems;
import net.fabricmc.api.ClientModInitializer;

public final class LostLoreFabricClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        LostLorePokeBallTooltips.register();
        LostLoreCreativeTabItems.register();
    }
}