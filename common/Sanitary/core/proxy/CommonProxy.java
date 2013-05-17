package Sanitary.core.proxy;

import Sanitary.lib.Strings;
import Sanitary.tileentity.TileMassToEnergyConverter;
import cpw.mods.fml.common.registry.GameRegistry;

public class CommonProxy {
    public void registerTileEntities(){
        
        GameRegistry.registerTileEntity(TileMassToEnergyConverter.class, Strings.TE_MASS_TO_ENERGY_CONVERTER);
    }
    
    public void initRendering(){
        
    }
}
