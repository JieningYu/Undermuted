package net.krlite.undermuted.runtimeResourcePack.blockstates.gen;

import net.devtech.arrp.json.blockstate.JBlockStates;
import net.krlite.undermuted.UndermutedMod;

public class BlockStatesGen {
	public static JBlockStates simpleFullBlockBlockStates(String id) {
		return JBlockStates.simple(UndermutedMod.genId("block/" + id));
	}
}
