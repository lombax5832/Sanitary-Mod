package Sanitary;

import Sanitary.block.SanitaryBlocks;
import Sanitary.core.config.SanitaryMainConfig;
import Sanitary.item.SanitaryItems;
import Sanitary.lib.Constants;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Constants.MOD_ID, name = Constants.MOD_NAME, version = Constants.VERSION_LONG)
public class Sanitary {

//    @SidedProxy(clientSide = Constants.CLIENT_PROXY_CLASS, serverSide = Constants.SERVER_PROXY_CLASS)
//    public static CommonProxy proxy;
    
    
    
    @Mod.PreInit
    public void preInit(FMLPreInitializationEvent event) {
        SanitaryMainConfig.loadConfig(event);
        SanitaryItems.initialize();
        SanitaryBlocks.initialize();
    }
    
    @Mod.Init
    public void init(FMLInitializationEvent event){
       
    }
}
