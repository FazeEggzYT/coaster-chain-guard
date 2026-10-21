package com.example.coasterchainguard;

import net.neoforged.fml.common.Mod;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Mod(CoasterChainGuard.MOD_ID)
public class CoasterChainGuard {
    public static final String MOD_ID = "coasterchainguard";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    public CoasterChainGuard() {
        LOGGER.info("Coaster Chain Guard loaded");
    }
}
