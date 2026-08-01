package com.github.lvantic.lost_lore.neoforge.datagen;

import com.github.lvantic.lost_lore.LostLore;
import com.github.lvantic.lost_lore.item.LLItems;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, LostLore.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(LLItems.ANCIENT_LIGHT_BALL.get());
        basicItem(LLItems.GREEN_SCARF.get());
        basicItem(LLItems.MAGICAL_MUSIC_SHEET.get());
        basicItem(LLItems.PLEDGE_FRAGMENT.get());
        basicItem(LLItems.RED_SCARF.get());
        basicItem(LLItems.RIPPED_CAPE.get());
        basicItem(LLItems.WATER_SHURIKEN.get());

        basicItem(LLItems.BINDING_ARMOR.get());
        basicItem(LLItems.CORRUPTED_WISH.get());
        basicItem(LLItems.SHADOW_ENERGY.get());

        basicItem(LLItems.COSTUME_BOX_LUCARIO.get());
        basicItem(LLItems.COSTUME_BOX_INCINEROAR.get());
        basicItem(LLItems.PROJECT_STAR_KIT.get());

        basicItem(LLItems.TIME_GEAR.get());
        basicItem(LLItems.LIGHT_OF_LIFE.get());

        basicItem(LLItems.CRYSTALLINE_STEELIXITE.get());
        basicItem(LLItems.SHADOW_MEWTWONITE_X.get());
        basicItem(LLItems.SHADOW_MEWTWONITE_Y.get());
        basicItem(LLItems.SLOWBROGONITE.get());

        basicItem(LLItems.DREAM_CATCHER.get());

        basicItem(LLItems.DARK_TYRANITARIUM_Z.get());
        basicItem(LLItems.SHADOWIUM_Z.get());
        basicItem(LLItems.CRYSTALIUM_Z.get());

        basicItem(LLItems.SHADOW_GEM.get());
        basicItem(LLItems.CRYSTAL_GEM.get());
    }
}