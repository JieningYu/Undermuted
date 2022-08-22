package net.krlite.undermuted.registry.helper;

import net.krlite.undermuted.runtimeResourcePack.lang.LangHandler;
import net.krlite.undermuted.runtimeResourcePack.model.ModelHandler;
import net.krlite.undermuted.runtimeResourcePack.model.gen.ItemModelGen;
import net.krlite.undermuted.util.types.ModelType;

public class ItemResourceGenHelper {
	public static void generate(String id, String name, ModelType modelType) {
		switch (modelType) {
			case GENERATED_ITEM:
				ModelHandler.infuseItemModel(ItemModelGen.generatedItemModel(id), id);
				break;
			default:
				break;
		}
		LangHandler.infuseLang("item", id, name);
	}
}
