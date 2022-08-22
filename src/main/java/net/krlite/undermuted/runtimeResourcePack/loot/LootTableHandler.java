package net.krlite.undermuted.runtimeResourcePack.loot;

import net.devtech.arrp.json.loot.JLootTable;
import net.krlite.undermuted.UndermutedMod;

public class LootTableHandler {
	public static void infuseLootTable(JLootTable lootTable, String id) {
		UndermutedMod.PACK.addLootTable(UndermutedMod.genId(id), lootTable);
	}
	public static void infuseBlockLootTable(JLootTable lootTable, String id) {
		infuseLootTable(lootTable, "blocks/" + id);
	}
}
