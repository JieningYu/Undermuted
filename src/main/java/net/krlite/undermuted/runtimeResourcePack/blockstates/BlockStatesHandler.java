package net.krlite.undermuted.runtimeResourcePack.blockstates;

import net.devtech.arrp.json.blockstate.JBlockStates;
import net.krlite.undermuted.UndermutedMod;

public class BlockStatesHandler {
	public static void infuseBlockStates(JBlockStates blockStates, String id) {
		UndermutedMod.PACK.addBlockState(blockStates, UndermutedMod.genId(id));
	}
}
