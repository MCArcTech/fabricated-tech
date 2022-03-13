package io.github.fabricatedtech.fabricatedtech;

import net.fabricmc.api.ModInitializer;

public class FabricatedTech implements ModInitializer {
    @Override
    public void onInitialize() {
        Blocks.init();
    }
}
