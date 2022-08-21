package net.krlite.undermuted.util;

public class StringUtil {
	public static String toIdentifier(String name) {
		return name.replaceAll(" ", "_").toLowerCase();
	}
}
