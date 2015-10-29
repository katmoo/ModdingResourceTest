package com.katmoo.mrt.handler;

import com.katmoo.mrt.ref.RefStr;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.util.StatCollector;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigHandler {
    public static Configuration configuration;
    public static boolean cardboardCubeFlammable = true;

    public static void init(File configFile) {
        //Create config object from config file
        if (configuration == null) {
            configuration = new Configuration(configFile);
            loadConfiguration();
        }
    }

    private static void loadConfiguration() {
        cardboardCubeFlammable = configuration.getBoolean("general.cardboardCubeFlammable.label", Configuration.CATEGORY_GENERAL, true, StatCollector.translateToLocal("general.cardboardCubeFlammable.comment"));

        if (configuration.hasChanged()) {
            configuration.save();
        }
    }

    @SubscribeEvent
    public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event) {
        if (event.modID.equalsIgnoreCase(RefStr.MOD_ID)) {
            //Resync config
            loadConfiguration();
        }
    }
}
