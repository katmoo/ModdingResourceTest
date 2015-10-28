package com.katmoo.mrt.handler;

import com.katmoo.mrt.ref.RefStr;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigHandler {
    public static Configuration configuration;
    public static boolean testValue = false;

    public static void init(File configFile) {
        //Create config object from config file
        if (configuration == null) {
            configuration = new Configuration(configFile);
            loadConfiguration();
        }
    }

    @SubscribeEvent
    public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event) {
        if (event.modID.equalsIgnoreCase(RefStr.MOD_ID)) {
            //Resync config
            loadConfiguration();
        }
    }

    private static void loadConfiguration() {
        testValue = configuration.getBoolean("configValue", Configuration.CATEGORY_GENERAL, false, "Test config value");

        if (configuration.hasChanged()) {
            configuration.save();
        }
    }
}
