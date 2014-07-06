package com.valadur.easystart.handler;

import com.valadur.easystart.reference.ConfigurationValues;
import com.valadur.easystart.reference.Reference;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigurationHandler {

    public static Configuration configuration;

    public static void init(File configFile) {

        if (configuration == null) {
            // Create the configuration object from the given configuration file
            configuration = new Configuration(configFile);
            loadConfiguration();
        }
    }

    @SubscribeEvent
    public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event){
        if (event.modID.equalsIgnoreCase(Reference.MOD_ID)){
            // Resync configs
            loadConfiguration();
        }
    }

    private static void loadConfiguration(){
        ConfigurationValues.ANDERIUM_SPEED_MODIFIER = configuration.getInt("Anderium_Tool_Speed", Configuration.CATEGORY_GENERAL, 5, 1, 20, "This sets the speed of the tools (Currently not in use)");
        if (configuration.hasChanged()){
            configuration.save();
        }
    }
}