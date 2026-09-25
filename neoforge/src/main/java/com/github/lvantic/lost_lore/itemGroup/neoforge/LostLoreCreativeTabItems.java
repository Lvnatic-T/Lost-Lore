package com.github.lvantic.lost_lore.itemGroup.neoforge;

import com.github.lvantic.lost_lore.LostLore;
import com.github.lvantic.lost_lore.itemGroup.LLTabs;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;

public final class LostLoreCreativeTabItems {

    private static final ResourceLocation MEWTWO_BALL =
            ResourceLocation.fromNamespaceAndPath(LostLore.MOD_ID, "mewtwo_ball");

    private static final ResourceLocation TYPING_BALL =
            ResourceLocation.fromNamespaceAndPath(LostLore.MOD_ID, "typing_ball");

    private LostLoreCreativeTabItems() {}

    @SubscribeEvent
    public static void onBuildCreativeTab(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey().equals(LLTabs.MAIN_TAB.getKey())) {
            Item mewtwoBall = BuiltInRegistries.ITEM.get(MEWTWO_BALL);
            Item typingBall = BuiltInRegistries.ITEM.get(TYPING_BALL);

            event.accept(mewtwoBall);
            event.accept(typingBall);
        }
    }
}