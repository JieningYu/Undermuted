package net.krlite.undermuted.registry;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.krlite.undermuted.runtimeResourcePack.lang.LangHandler;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import net.minecraft.item.ItemGroup;

public class UMItemGroup {
	// Item Groups
	public static final ItemGroup ITEMS = FabricItemGroupBuilder.create(
			new Identifier("undermuted", "items"))
			.icon(() -> new ItemStack(UMItems.PARADOX_CLOCK))
			.appendItems(stacks -> {
				stacks.add(new ItemStack(UMItems.PARADOX_CLOCK));
			})
			.build();

	public static final ItemGroup TOOLS = FabricItemGroupBuilder.create(
			new Identifier("undermuted", "tools"))
			.icon(() -> new ItemStack(Items.NETHERITE_AXE))
			.appendItems(stacks -> {
			})
			.build();

	// Block Groups
	public static final ItemGroup BUILDING_BLOCKS = FabricItemGroupBuilder.create(
			new Identifier("undermuted", "building_blocks"))
			.icon(() -> new ItemStack(UMBlocks.PARADOX_SOIL))
			.appendItems(stacks -> {
				stacks.add(new ItemStack(UMBlocks.PARADOX_SOIL));
				stacks.add(new ItemStack(UMBlocks.HARDENED_PARADOX_SOIL));
				stacks.add(new ItemStack(UMBlocks.PARADOX_CONCRETE));
			})
			.build();

	public static final ItemGroup GENERAL = FabricItemGroupBuilder.create(
			new Identifier("undermuted", "blocks"))
			.icon(() -> new ItemStack(Blocks.COBBLESTONE))
			.appendItems(stacks -> {
			})
			.build();
}
