package net.krlite.undermuted.registry;

import net.devtech.arrp.json.models.JModel;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.krlite.undermuted.UndermutedMod;
import net.krlite.undermuted.runtimeResourcePack.blockstates.BlockStatesHandler;
import net.krlite.undermuted.runtimeResourcePack.blockstates.gen.BlockStatesGen;
import net.krlite.undermuted.runtimeResourcePack.lang.LangHandler;
import net.krlite.undermuted.runtimeResourcePack.model.ModelHandler;
import net.krlite.undermuted.runtimeResourcePack.model.gen.BlockModelGen;
import net.krlite.undermuted.runtimeResourcePack.model.gen.ItemModelGen;
import net.krlite.undermuted.util.BlockType;
import net.krlite.undermuted.util.StringUtil;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.registry.Registry;

public class UMBlocks {
	// Building Blocks
	public static final Block PARADOX_SOIL = new Block(FabricBlockSettings
					.of(Material.SOIL)
					.strength(0.35f));
	public static final Block HARDENED_PARADOX_SOIL = new Block(FabricBlockSettings
					.of(Material.STONE)
					.strength(2.3f));
	public static final Block PARADOX_CONCRETE = new Block(FabricBlockSettings
					.of(Material.STONE)
					.requiresTool()
					.strength(3.7f));

	//RRP Block Register
	private static void registerBlock(Block block, String name, BlockType type, ItemGroup group, JModel model) {
		String id = StringUtil.toIdentifier(name);
		Registry.register(Registry.BLOCK, UndermutedMod.genId(id), block);
		Registry.register(Registry.ITEM, UndermutedMod.genId(id),
				new BlockItem(block, new FabricItemSettings()
								.group(group)));
		switch (type) {
			case FULL_SIMPLE:
				BlockStatesHandler.infuseBlockStates(BlockStatesGen.simpleFullBlockBlockStates(id), id);
				break;
			default:
				break;
		}
		ModelHandler.infuseBlockModel(model, id);
		ModelHandler.infuseItemModel(ItemModelGen.blockItemModel(id), id);
		LangHandler.infuseLang("block", id, name);
	}

	private static void registerBlock(Block block, String name, BlockType type, ItemGroup group) {
		String id = StringUtil.toIdentifier(name);
		registerBlock(block, name, type, group, BlockModelGen.fullSimpleBlockModel(id));
	}

	public static void registerBlocks() {
		// Building Blocks
		registerBlock(PARADOX_SOIL, "Paradox Soil", BlockType.FULL_SIMPLE, UMItemGroup.BUILDING_BLOCKS);
		registerBlock(HARDENED_PARADOX_SOIL, "Hardened Paradox Soil", BlockType.FULL_SIMPLE, UMItemGroup.BUILDING_BLOCKS);
		registerBlock(PARADOX_CONCRETE, "Paradox Concrete", BlockType.FULL_SIMPLE, UMItemGroup.BUILDING_BLOCKS);
	}
}
