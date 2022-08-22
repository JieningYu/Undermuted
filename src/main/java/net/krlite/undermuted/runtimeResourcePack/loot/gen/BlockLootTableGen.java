package net.krlite.undermuted.runtimeResourcePack.loot.gen;

import net.devtech.arrp.json.loot.JCondition;
import net.devtech.arrp.json.loot.JEntry;
import net.devtech.arrp.json.loot.JLootTable;
import net.devtech.arrp.json.loot.JPool;
import net.krlite.undermuted.UndermutedMod;
import net.minecraft.util.Identifier;

public class BlockLootTableGen {
	public static JLootTable simpleBlockLootTable(String id) {
		return new JLootTable(new Identifier("minecraft:block").toString())
				.pool(new JPool()
						.rolls(1)
						.bonus(0)
						.entry(new JEntry()
								.type(new Identifier("minecraft", "item").toString())
								.name(UndermutedMod.genId(id).toString()))
						.condition(new JCondition().condition(new Identifier("minecraft", "survives_explosion").toString())));
	}
}
