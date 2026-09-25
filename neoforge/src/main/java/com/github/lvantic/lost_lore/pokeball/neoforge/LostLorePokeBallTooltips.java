package com.github.lvantic.lost_lore.pokeball.neoforge;

import com.github.lvantic.lost_lore.LostLore;
import net.minecraft.ChatFormatting;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.neoforge.event.entity.player.ItemTooltipEvent;

public final class LostLorePokeBallTooltips {

    private static final ResourceLocation MEWTWO_BALL =
            ResourceLocation.fromNamespaceAndPath(LostLore.MOD_ID, "mewtwo_ball");

    private static final ResourceLocation TYPING_BALL =
            ResourceLocation.fromNamespaceAndPath(LostLore.MOD_ID, "typing_ball");

    private LostLorePokeBallTooltips() {}

    @SubscribeEvent
    public static void onItemTooltip(ItemTooltipEvent event) {
        ResourceLocation itemId =
                BuiltInRegistries.ITEM.getKey(event.getItemStack().getItem());

        if (MEWTWO_BALL.equals(itemId)) {
            event.getToolTip().add(
                    Component.translatable("tooltip.lost_lore.mewtwo_ball")
                            .withStyle(ChatFormatting.GRAY)
            );
        }

        if (TYPING_BALL.equals(itemId)) {
            event.getToolTip().add(
                    Component.translatable("tooltip.lost_lore.typing_ball")
                            .withStyle(ChatFormatting.GRAY)
            );
        }
    }
}