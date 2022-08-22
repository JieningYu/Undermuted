package net.krlite.undermuted.registry;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.krlite.undermuted.UndermutedMod;
import net.krlite.undermuted.registry.helper.BlockResourceGenHelper;
import net.krlite.undermuted.util.StringUtil;
import net.krlite.undermuted.util.types.BlockStatesType;
import net.krlite.undermuted.util.types.LootTableType;
import net.krlite.undermuted.util.types.ModelType;
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
	private static void registerBlock(Block block, String name, ItemGroup group, BlockStatesType bsType, ModelType mdType, LootTableType ltType) {
		String id = StringUtil.toIdentifier(name);
		Registry.register(Registry.BLOCK, UndermutedMod.genId(id), block);
		Registry.register(Registry.ITEM, UndermutedMod.genId(id), new BlockItem(block, new FabricItemSettings().group(group)));

		BlockResourceGenHelper.generate(id, name, bsType, mdType, ltType);
	}

	public static void registerBlocks() {
		// Building Blocks
		registerBlock(PARADOX_SOIL, "Paradox Soil", UMItemGroup.BUILDING_BLOCKS, BlockStatesType.SIMPLE, ModelType.FULL_SIMPLE, LootTableType.SIMPLE);
		registerBlock(HARDENED_PARADOX_SOIL, "Hardened Paradox Soil", UMItemGroup.BUILDING_BLOCKS, BlockStatesType.SIMPLE, ModelType.FULL_SIMPLE, LootTableType.SIMPLE);
		registerBlock(PARADOX_CONCRETE, "Paradox Concrete", UMItemGroup.BUILDING_BLOCKS, BlockStatesType.SIMPLE, ModelType.FULL_SIMPLE, LootTableType.SIMPLE);
	}
}
