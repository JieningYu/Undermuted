package net.krlite.undermuted.registry;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.krlite.undermuted.UndermutedMod;
import net.krlite.undermuted.registry.helper.ItemResourceGenHelper;
import net.krlite.undermuted.util.StringUtil;
import net.krlite.undermuted.util.types.ModelType;
import net.minecraft.item.Item;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

public class UMItems {
	// Main Items
	public static final Item PARADOX_CLOCK = new Item(new FabricItemSettings()
					.group(UMItemGroup.ITEMS)
					.maxCount(1)
					.rarity(Rarity.EPIC));

	//Tools
	public static final Item TARSET = new Item(new FabricItemSettings()
					.group(UMItemGroup.TOOLS)
					.maxCount(1)
					.rarity(Rarity.RARE));

	//RRP Item Register
	private static void registerItem(Item item, String name, ModelType mdType) {
		String id = StringUtil.toIdentifier(name);
		Registry.register(Registry.ITEM, UndermutedMod.genId(id), item);

		ItemResourceGenHelper.generate(id, name, mdType);
	}

	public static void registerItems() {
		// Main Items
		registerItem(PARADOX_CLOCK, "Paradox Clock", ModelType.GENERATED_ITEM);
	}
}
