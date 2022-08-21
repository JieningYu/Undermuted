package net.krlite.undermuted.runtimeResourcePack.lang;

import net.devtech.arrp.json.lang.JLang;
import net.krlite.undermuted.UndermutedMod;

public class LangHandler {
	private static JLang lang = new JLang();

	public static void infuseLang(String type, String id, String name) {
		lang = lang.entry(type + "." + UndermutedMod.MODID + "." + id, name);
	}

	public static void applyLang() {
		UndermutedMod.PACK.addLang(UndermutedMod.genId("en_us"), lang);
		lang.clear();
	}
}
