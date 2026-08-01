package com.github.lvantic.lost_lore.item;

import com.github.lvantic.lost_lore.LostLore;
import com.github.lvantic.lost_lore.itemGroup.LLTabs;
import com.github.yajatkaul.mega_showdown.components.MegaShowdownDataComponents;
import com.github.yajatkaul.mega_showdown.item.custom.mega.MegaStone;
import com.github.yajatkaul.mega_showdown.utils.RegistryLocator;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;

import java.util.function.Supplier;

public class LLItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(LostLore.MOD_ID, Registries.ITEM);

    //Mega
    public static RegistrySupplier<Item> CRYSTALLINE_STEELIXITE = registerMegaStone("crystalline_steelixite");
    public static RegistrySupplier<Item> SHADOW_MEWTWONITE_X = registerMegaStone("shadow_mewtwonite_x");
    public static RegistrySupplier<Item> SHADOW_MEWTWONITE_Y = registerMegaStone("shadow_mewtwonite_y");
    public static RegistrySupplier<Item> SLOWBROGONITE = registerMegaStone("slowbrogonite");

    // Form Change Interact
    public static RegistrySupplier<Item> BINDING_ARMOR = registerFormChangeInteract("binding_armor");
    public static RegistrySupplier<Item> CORRUPTED_WISH = registerFormChangeInteract("corrupted_wish");
    public static RegistrySupplier<Item> SHADOW_ENERGY = registerFormChangeInteract("shadow_energy");

    // Form Change Toggle Interact
    public static RegistrySupplier<Item> COSTUME_BOX_LUCARIO = registerFormChangeToggleInteract("costume_box_lucario");
    public static RegistrySupplier<Item> COSTUME_BOX_INCINEROAR = registerFormChangeToggleInteract("costume_box_incineroar");
    public static RegistrySupplier<Item> PROJECT_STAR_KIT = registerFormChangeToggleInteract("project_star_kit");

    // Held Form Change
    public static RegistrySupplier<Item> TIME_GEAR = registerHeldFormChange("time_gear");
    public static RegistrySupplier<Item> LIGHT_OF_LIFE = registerHeldFormChange("light_of_life");

    // Solo Fusion
    public static RegistrySupplier<Item> DREAM_CATCHER = registerSoloFusion("dream_catcher");

    // Z Crystal
    public static RegistrySupplier<Item> DARK_TYRANITARIUM_Z = registerZCrystal("dark_tyranitarium_z");
    public static RegistrySupplier<Item> SHADOWIUM_Z = registerZCrystal("shadowium_z");
    public static RegistrySupplier<Item> CRYSTALIUM_Z = registerZCrystal("crystalium_z");

    // Showdown Items
    public static RegistrySupplier<Item> SHADOW_GEM = registerShowdown("shadow_gem");
    public static RegistrySupplier<Item> CRYSTAL_GEM = registerShowdown("crystal_gem");

    // No function
    public static RegistrySupplier<Item> ANCIENT_LIGHT_BALL = registerNormal("ancient_light_ball");
    public static RegistrySupplier<Item> GREEN_SCARF = registerNormal("green_scarf");
    public static RegistrySupplier<Item> MAGICAL_MUSIC_SHEET = registerNormal("magical_music_sheet");
    public static RegistrySupplier<Item> PLEDGE_FRAGMENT = registerNormal("pledge_fragment");
    public static RegistrySupplier<Item> RED_SCARF = registerNormal("red_scarf");
    public static RegistrySupplier<Item> RIPPED_CAPE = registerNormal("ripped_cape");
    public static RegistrySupplier<Item> WATER_SHURIKEN = registerNormal("water_shuriken");

    private static RegistrySupplier<Item> registerMegaStone(String name) {
        return ITEMS.register(name, () -> new MegaStone(
                        new Item.Properties()
                                .component(MegaShowdownDataComponents.REGISTRY_TYPE_COMPONENT.get(), RegistryLocator.MEGA)
                                .component(MegaShowdownDataComponents.RESOURCE_LOCATION_COMPONENT.get(), ResourceLocation.fromNamespaceAndPath(LostLore.MOD_ID, name))
                                .arch$tab(LLTabs.MAIN_TAB)
                )
        );
    }

    private static RegistrySupplier<Item> registerFormChangeInteract(String name) {
        return ITEMS.register(name, () -> new MegaStone(
                        new Item.Properties()
                                .component(MegaShowdownDataComponents.REGISTRY_TYPE_COMPONENT.get(), RegistryLocator.FORM_CHANGE_INTERACT)
                                .component(MegaShowdownDataComponents.RESOURCE_LOCATION_COMPONENT.get(), ResourceLocation.fromNamespaceAndPath(LostLore.MOD_ID, name))
                                .arch$tab(LLTabs.MAIN_TAB)
                )
        );
    }

    private static RegistrySupplier<Item> registerFormChangeToggleInteract(String name) {
        return ITEMS.register(name, () -> new MegaStone(
                        new Item.Properties()
                                .component(MegaShowdownDataComponents.REGISTRY_TYPE_COMPONENT.get(), RegistryLocator.FORM_CHANGE_TOGGLE_INTERACT)
                                .component(MegaShowdownDataComponents.RESOURCE_LOCATION_COMPONENT.get(), ResourceLocation.fromNamespaceAndPath(LostLore.MOD_ID, name))
                                .arch$tab(LLTabs.MAIN_TAB)
                )
        );
    }

    private static RegistrySupplier<Item> registerHeldFormChange(String name) {
        return ITEMS.register(name, () -> new MegaStone(
                        new Item.Properties()
                                .component(MegaShowdownDataComponents.REGISTRY_TYPE_COMPONENT.get(), RegistryLocator.HELD_FORM_CHANGE)
                                .component(MegaShowdownDataComponents.RESOURCE_LOCATION_COMPONENT.get(), ResourceLocation.fromNamespaceAndPath(LostLore.MOD_ID, name))
                                .arch$tab(LLTabs.MAIN_TAB)
                )
        );
    }

    private static RegistrySupplier<Item> registerSoloFusion(String name) {
        return ITEMS.register(name, () -> new MegaStone(
                        new Item.Properties()
                                .component(MegaShowdownDataComponents.REGISTRY_TYPE_COMPONENT.get(), RegistryLocator.SOLO_FUSION)
                                .component(MegaShowdownDataComponents.RESOURCE_LOCATION_COMPONENT.get(), ResourceLocation.fromNamespaceAndPath(LostLore.MOD_ID, name))
                                .arch$tab(LLTabs.MAIN_TAB)
                )
        );
    }

    private static RegistrySupplier<Item> registerZCrystal(String name) {
        return ITEMS.register(name, () -> new MegaStone(
                        new Item.Properties()
                                .component(MegaShowdownDataComponents.REGISTRY_TYPE_COMPONENT.get(), RegistryLocator.Z_CRYSTAL_ITEM)
                                .component(MegaShowdownDataComponents.RESOURCE_LOCATION_COMPONENT.get(), ResourceLocation.fromNamespaceAndPath(LostLore.MOD_ID, name))
                                .arch$tab(LLTabs.MAIN_TAB)
                )
        );
    }
    private static RegistrySupplier<Item> registerShowdown(String name) {
        return ITEMS.register(name, () -> new MegaStone(
                        new Item.Properties()
                                .component(MegaShowdownDataComponents.REGISTRY_TYPE_COMPONENT.get(), RegistryLocator.SHOWDOWN_ITEM)
                                .component(MegaShowdownDataComponents.RESOURCE_LOCATION_COMPONENT.get(), ResourceLocation.fromNamespaceAndPath(LostLore.MOD_ID, name))
                                .arch$tab(LLTabs.MAIN_TAB)
                )
        );
    }

    private static RegistrySupplier<Item> registerNormal(String name) {
        return ITEMS.register(name, () -> new MegaStone(
                        new Item.Properties()
                                .arch$tab(LLTabs.MAIN_TAB)
                )
        );
    }

    public static <T extends Item> RegistrySupplier<T> registerItem(String name, Supplier<T> item) {
        return ITEMS.register(name, item);
    }

    public static void register() {
        ITEMS.register();
    }
}
