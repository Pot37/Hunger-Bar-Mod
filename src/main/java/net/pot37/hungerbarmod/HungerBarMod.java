package net.pot37.hungerbarmod;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HungerBarMod implements ModInitializer {
    public static final String MOD_ID = "hunger-bar-mod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("Hunger Bar Mod initialized");
    }
}
