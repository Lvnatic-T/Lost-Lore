package com.github.lvantic.lost_lore.cobblemon.fabric;

import com.cobblemon.mod.common.Cobblemon;
import com.cobblemon.mod.common.api.types.ElementalType;
import com.cobblemon.mod.common.api.types.ElementalTypes;
import com.cobblemon.mod.common.api.types.tera.TeraType;
import com.cobblemon.mod.common.api.types.tera.elemental.ElementalTypeTeraType;
import com.cobblemon.mod.common.battles.runner.graal.GraalShowdownService;
import com.cobblemon.mod.common.util.MiscUtilsKt;
import com.github.lvantic.lost_lore.cobblemon.CustomTypeRegistry;
import com.github.yajatkaul.mega_showdown.mixin.ElementsAccessor;
import com.github.yajatkaul.mega_showdown.mixin.TeraTypesAccessor;
import kotlin.Unit;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import org.graalvm.polyglot.Value;

public class CustomTypeRegistryImpl {
    public static ElementalType createNewType(String name, String lang, int hue, String id, String maxMove, String zMove) {
        ElementalType newType = ElementalTypes.register(new ElementalType(
                name,
                Component.translatable(lang),
                hue,
                0,
                0,
                0,
                ResourceLocation.fromNamespaceAndPath(Cobblemon.MODID, "ui/types.png"),
                id,
                ResourceLocation.fromNamespaceAndPath(Cobblemon.MODID, id + "_gem")
        ));

        CustomTypeRegistry.customTypes.put(newType.getShowdownId(), newType);
        ElementsAccessor.getTypes().add(newType);

        TeraType newTeraType = new ElementalTypeTeraType(newType);
        TeraTypesAccessor.getTypes().put(MiscUtilsKt.cobblemonResource(id), newTeraType);

        Cobblemon.INSTANCE.getShowdownThread().queue(showdownService -> {
            if (showdownService instanceof GraalShowdownService service) {
                Value receiveNewTypeDataFn = service.context.getBindings("js").getMember("receiveNewTypeData");
                receiveNewTypeDataFn.execute(name, maxMove, zMove);
            }
            return Unit.INSTANCE;
        });

        return newType;
    }
}
