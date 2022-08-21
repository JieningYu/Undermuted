package net.krlite.undermuted.runtimeResourcePack.model.gen;

import net.devtech.arrp.json.models.JModel;
import net.krlite.undermuted.UndermutedMod;
import net.minecraft.util.Identifier;

public class BlockModelGen {
	public static JModel fullSimpleBlockModel(String id) {
		return new JModel(new Identifier("minecraft", "block/cube_all")).addTexture("all", UndermutedMod.genId("block/" + id).toString());
	}
}
