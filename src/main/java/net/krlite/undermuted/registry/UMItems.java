package net.krlite.undermuted.registry;

import net.devtech.arrp.generator.ItemResourceGenerator;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

public class UMItems {
    //Main Items
    public static final Item PARADOX_CLOCK = new Item(new FabricItemSettings().group(UMItemGroup.ITEMS).maxCount(1).rarity(Rarity.EPIC));

    public static void RegisterItems() {
        //Main Items
        Registry.register(Registry.ITEM, new Identifier("undermuted", "paradox_clock"), PARADOX_CLOCK);
    }
}
