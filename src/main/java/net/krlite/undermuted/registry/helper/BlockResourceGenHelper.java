package net.krlite.undermuted.registry.helper;

import net.krlite.undermuted.runtimeResourcePack.blockstates.BlockStatesHandler;
import net.krlite.undermuted.runtimeResourcePack.blockstates.gen.BlockStatesGen;
import net.krlite.undermuted.runtimeResourcePack.lang.LangHandler;
import net.krlite.undermuted.runtimeResourcePack.loot.LootTableHandler;
import net.krlite.undermuted.runtimeResourcePack.loot.gen.BlockLootTableGen;
import net.krlite.undermuted.runtimeResourcePack.model.ModelHandler;
import net.krlite.undermuted.runtimeResourcePack.model.gen.BlockModelGen;
import net.krlite.undermuted.runtimeResourcePack.model.gen.ItemModelGen;
import net.krlite.undermuted.util.types.BlockStatesType;
import net.krlite.undermuted.util.types.LootTableType;
import net.krlite.undermuted.util.types.ModelType;

public class BlockResourceGenHelper {
	public static void generate(String id, String name, BlockStatesType blockStatesType, ModelType modelType, LootTableType lootTableType) {
		switch (blockStatesType) {
			case SIMPLE:
				BlockStatesHandler.infuseBlockStates(BlockStatesGen.simpleFullBlockBlockStates(id), id);
				break;
			default:
				break;
		}

		switch (modelType) {
			case FULL_SIMPLE:
				ModelHandler.infuseBlockModel(BlockModelGen.fullSimpleBlockModel(id), id);
				break;
			default:
				break;
		}

		switch (lootTableType) {
			case SIMPLE:
				LootTableHandler.infuseBlockLootTable(BlockLootTableGen.simpleBlockLootTable(id), id);
				break;
			default:
				break;
		}
		ModelHandler.infuseItemModel(ItemModelGen.blockItemModel(id), id);
		LangHandler.infuseLang("block", id, name);
	}
}
