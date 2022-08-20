package net.krlite.undermuted;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UndermutedMod implements ModInitializer {
	//Logger
	public static final Logger LOGGER = LoggerFactory.getLogger("undermuted");

	//Mod-load Ready State
	@Override
	public void onInitialize() {

		LOGGER.info("We Live in a Twilight World...");
	}
}
