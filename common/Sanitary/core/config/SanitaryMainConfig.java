package Sanitary.core.config;

import java.io.File;

import Sanitary.lib.ItemIds;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

/**
 * @title SanitaryMainConfig
 * 
 * Handles the Configuration of ItemIds and BlockIds
 * 
 * @author lombax5832
 *
 */
public class SanitaryMainConfig {

    public static SanitaryConfiguration mainConfig;
    
    public static void loadConfig(FMLPreInitializationEvent event) {
        mainConfig = new SanitaryConfiguration(new File(event.getModConfigurationDirectory(), "BL2/main.conf"));
        try {
            mainConfig.load();
            
            //Item Configs
            ItemIds.PAPER_TOWEL_ID = mainConfig.getItem("Sanitary", ItemIds.PAPER_TOWEL_DEFAULT).getInt();
        } finally {
            if (mainConfig.hasChanged()) {
                mainConfig.save();
            }
        }
    }
    
}
