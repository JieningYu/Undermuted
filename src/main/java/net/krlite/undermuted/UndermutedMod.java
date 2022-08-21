package net.krlite.undermuted;

import net.devtech.arrp.api.RRPCallback;
import net.devtech.arrp.api.RuntimeResourcePack;
import net.fabricmc.api.ModInitializer;
import net.krlite.undermuted.registry.UMBlocks;
import net.krlite.undermuted.registry.UMItems;
import net.krlite.undermuted.runtimeResourcePack.ResourcesGenerator;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UndermutedMod implements ModInitializer {
	// Logger
	public static final Logger LOGGER = LoggerFactory.getLogger("undermuted");

	// RRP Generation
	public static final RuntimeResourcePack PACK = RuntimeResourcePack
			.create(new Identifier("undermuted", "undermuted_runtime_resource_pack"));

	// Mod Info
	public static final String MODID = "undermuted";

	public static Identifier genId(String id) {
		return new Identifier(MODID, id);
	}

	@Override
	public void onInitialize() {
		// Logger
		LOGGER.info("We Live in a Twilight World...");

		// Item Registry
		UMItems.registerItems();

		// Block Registry
		UMBlocks.registerBlocks();

		// RRP Generation
		ResourcesGenerator.generateServerData();
		ResourcesGenerator.generateClientAssets();

		RRPCallback.BEFORE_VANILLA.register((b) -> {
			PACK.dump();
			b.add(PACK);
		});
	}
}
