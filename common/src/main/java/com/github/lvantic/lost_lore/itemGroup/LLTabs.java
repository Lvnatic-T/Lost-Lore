package com.github.lvantic.lost_lore.itemGroup;

import com.github.lvantic.lost_lore.LostLore;
import com.github.lvantic.lost_lore.item.LLItems;
import dev.architectury.registry.CreativeTabRegistry;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class LLTabs {

    private static final DeferredRegister<CreativeModeTab> CREATIVE_TABS =
            DeferredRegister.create(
                    LostLore.MOD_ID,
                    Registries.CREATIVE_MODE_TAB
            );

    public static final RegistrySupplier<CreativeModeTab> MAIN_TAB =
            CREATIVE_TABS.register(
                    "lost_lore_main",
                    () -> CreativeTabRegistry.create(
                            Component.translatable(
                                    "itemgroup.lost_lore.lostlore_items"
                            ),
                            () -> new ItemStack(LLItems.BINDING_ARMOR)
                    )
            );

    public static void register() {
        CREATIVE_TABS.register();
    }
}