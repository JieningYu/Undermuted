package net.krlite.undermuted.registry;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class UMBlocks {
    //Building Blocks
    public static final Block PARADOX_SOIL = new Block(FabricBlockSettings.of(Material.SOIL).strength(0.35f));
    public static final Block HARDENED_PARADOX_SOIL = new Block(FabricBlockSettings.of(Material.STONE).strength(3.7f));
    public static final Block PARADOX_CONCRETE = new Block(FabricBlockSettings.of(Material.STONE).strength(3.7f));

    public static void RegisterBlocks() {
        //Building Blocks
        Registry.register(Registry.BLOCK, new Identifier("undermuted", "paradox_soil"), PARADOX_SOIL);
        Registry.register(Registry.ITEM, new Identifier("undermuted", "paradox_soil"),
                new BlockItem(PARADOX_SOIL, new FabricItemSettings()
                .group(UMItemGroup.BUILDING_BLOCKS)));

        Registry.register(Registry.BLOCK, new Identifier("undermuted", "hardened_paradox_soil"), HARDENED_PARADOX_SOIL);
        Registry.register(Registry.ITEM, new Identifier("undermuted", "hardened_paradox_soil"),
                new BlockItem(HARDENED_PARADOX_SOIL, new FabricItemSettings()
                        .group(UMItemGroup.BUILDING_BLOCKS)));

        Registry.register(Registry.BLOCK, new Identifier("undermuted", "paradox_concrete"), PARADOX_CONCRETE);
        Registry.register(Registry.ITEM, new Identifier("undermuted", "paradox_concrete"),
                new BlockItem(PARADOX_CONCRETE, new FabricItemSettings()
                        .group(UMItemGroup.BUILDING_BLOCKS)));
    }
}
