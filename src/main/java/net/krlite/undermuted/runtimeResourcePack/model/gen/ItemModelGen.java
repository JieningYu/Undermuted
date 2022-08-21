package net.krlite.undermuted.runtimeResourcePack.model.gen;

import net.devtech.arrp.json.models.JModel;
import net.krlite.undermuted.UndermutedMod;
import net.minecraft.util.Identifier;

public class ItemModelGen {
	public static JModel blockItemModel(String id) {
		return new JModel(UndermutedMod.genId("block/" + id));
	}
	public static JModel generatedItemModel(String id) {
		return new JModel(new Identifier("minecraft", "item/generated")).addTexture("layer0", UndermutedMod.genId("item/" + id).toString());
	}
}
