package com.github.lvantic.lost_lore.pokeball.fabric;

import com.github.lvantic.lost_lore.LostLore;
import net.fabricmc.fabric.api.client.item.v1.ItemTooltipCallback;
import net.minecraft.ChatFormatting;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;

public final class LostLorePokeBallTooltips {

    private static final ResourceLocation MEWTWO_BALL =
            ResourceLocation.fromNamespaceAndPath(LostLore.MOD_ID, "mewtwo_ball");

    private static final ResourceLocation TYPING_BALL =
            ResourceLocation.fromNamespaceAndPath(LostLore.MOD_ID, "typing_ball");

    private LostLorePokeBallTooltips() {}

    public static void register() {
        ItemTooltipCallback.EVENT.register((stack, context, type, lines) -> {
            ResourceLocation itemId = BuiltInRegistries.ITEM.getKey(stack.getItem());

            if (MEWTWO_BALL.equals(itemId)) {
                lines.add(
                        Component.translatable("tooltip.lost_lore.mewtwo_ball")
                                .withStyle(ChatFormatting.GRAY)
                );
            }

            if (TYPING_BALL.equals(itemId)) {
                lines.add(
                        Component.translatable("tooltip.lost_lore.typing_ball")
                                .withStyle(ChatFormatting.GRAY)
                );
            }
        });
    }
}