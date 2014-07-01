package com.valadur.easystart.configuration;

import com.valadur.easystart.reference.ConfigurationValues;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigurationHandler {
    public static void init(File configFile){

        // Create the configuration object from the given configuration file
        Configuration configuration = new Configuration(configFile);

        try{
            // Load the configuration file
            configuration.load();

            // Read in properties from configuration file, Category, key, default, comment, get to boolean
            ConfigurationValues.TOOL_SPEED_MODIFIER = configuration.get(Configuration.CATEGORY_GENERAL, "Tool_Speed" , 2, "This sets the speed of the tools. 1=Slow, 2=Medium, 3=Fast").getInt(2);
            if(ConfigurationValues.TOOL_SPEED_MODIFIER > 3 || ConfigurationValues.TOOL_SPEED_MODIFIER < 1){ ConfigurationValues.TOOL_SPEED_MODIFIER = 2; }
        }
        catch(Exception e){
            // TODO: Log the exception
        }
        finally{
            // Save the configuration file
            configuration.save();
        }
    }
}