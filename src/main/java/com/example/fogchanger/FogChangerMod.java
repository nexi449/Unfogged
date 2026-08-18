package com.example.fogchanger;

import net.fabricmc.api.ClientModInitializer;

public class FogChangerMod implements ClientModInitializer {
    public static final String MOD_ID = "nofog";

    @Override
    public void onInitializeClient() {
        FogConfig.load();
    }
}
