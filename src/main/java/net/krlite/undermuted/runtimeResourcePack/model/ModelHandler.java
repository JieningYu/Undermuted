package net.krlite.undermuted.runtimeResourcePack.model;

import net.devtech.arrp.json.models.JModel;
import net.krlite.undermuted.UndermutedMod;

public class ModelHandler {
	public static void infuseBlockModel(JModel model, String id) {
		infuseModel(model, "block/" + id);
	}
	public static void infuseItemModel(JModel model, String id) {
		infuseModel(model, "item/" + id);
	}
	public static void infuseModel(JModel model, String id) {
		UndermutedMod.PACK.addModel(model, UndermutedMod.genId(id));
	}
}
