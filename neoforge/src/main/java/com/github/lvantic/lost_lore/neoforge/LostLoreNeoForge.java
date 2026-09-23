package com.github.lvantic.lost_lore.neoforge;

import com.github.lvantic.lost_lore.LostLore;
import com.github.lvantic.lost_lore.pokeball.neoforge.LostLorePokeBallRegistryImpl;
import com.github.lvantic.lost_lore.pokeball.neoforge.LostLorePokeBallTooltips;
import com.github.lvantic.lost_lore.itemGroup.neoforge.LostLoreCreativeTabItems;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(LostLore.MOD_ID)
public final class LostLoreNeoForge {

    public LostLoreNeoForge(IEventBus modEventBus) {
        LostLore.init();
        LostLorePokeBallRegistryImpl.register(modEventBus);
        modEventBus.register(LostLoreCreativeTabItems.class);
        NeoForge.EVENT_BUS.register(LostLorePokeBallTooltips.class);
    }
}