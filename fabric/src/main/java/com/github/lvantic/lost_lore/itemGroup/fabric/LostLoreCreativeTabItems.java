package com.github.lvantic.lost_lore.itemGroup.fabric;

import com.github.lvantic.lost_lore.LostLore;
import com.github.lvantic.lost_lore.itemGroup.LLTabs;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;

public final class LostLoreCreativeTabItems {

    private static final ResourceLocation MEWTWO_BALL =
            ResourceLocation.fromNamespaceAndPath(LostLore.MOD_ID, "mewtwo_ball");

    private static final ResourceLocation TYPING_BALL =
            ResourceLocation.fromNamespaceAndPath(LostLore.MOD_ID, "typing_ball");

    private LostLoreCreativeTabItems() {}

    public static void register() {
        ItemGroupEvents.modifyEntriesEvent(LLTabs.MAIN_TAB.getKey()).register(entries -> {
            Item mewtwoBall = BuiltInRegistries.ITEM.get(MEWTWO_BALL);
            Item typingBall = BuiltInRegistries.ITEM.get(TYPING_BALL);

            entries.accept(mewtwoBall);
            entries.accept(typingBall);
        });
    }
}