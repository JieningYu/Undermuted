package net.krlite.undermuted.runtimeResourcePack.blockstates;

import java.util.ArrayList;

import net.devtech.arrp.json.blockstate.JBlockStates;
import net.krlite.undermuted.UndermutedMod;

public class BlockStatesHandler {
	public static void infuseBlockStates(JBlockStates blockStates, String id) {
		UndermutedMod.PACK.addBlockState(blockStates, UndermutedMod.genId(id));
	}
}
