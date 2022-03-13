package io.github.fabricatedtech.fabricatedtech;

import io.github.fabricatedtech.fabricatedtech.block.CraftingStationBlock;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Blocks {
    public static final Block CRAFTING_STATION = new CraftingStationBlock(FabricBlockSettings.of(Material.WOOD).strength(2.5f).sounds(BlockSoundGroup.WOOD).nonOpaque());

    public static void init() {
        initBlockItem(new Identifier("fabricated_tech", "crafting_station"), CRAFTING_STATION, new FabricItemSettings().maxCount(69).group(ItemGroup.DECORATIONS));
    }

    public static void initBlockItem(Identifier id, Block block, FabricItemSettings settings) {
        Registry.register(Registry.BLOCK, id, block);
        Registry.register(Registry.ITEM, id, new BlockItem(block, settings));
    }
}
