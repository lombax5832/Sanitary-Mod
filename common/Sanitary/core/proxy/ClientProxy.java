package Sanitary.core.proxy;

import net.minecraftforge.client.MinecraftForgeClient;
import Sanitary.client.renderer.item.ItemMassToEnergyConverterRenderer;
import Sanitary.client.renderer.tileentity.TileEntityMassToEnergyConverterRenderer;
import Sanitary.lib.BlockIds;
import Sanitary.lib.RenderIds;
import Sanitary.tileentity.TileMassToEnergyConverter;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy extends CommonProxy{
    @Override
    public void registerTileEntities(){
         super.registerTileEntities();
         
         ClientRegistry.bindTileEntitySpecialRenderer(TileMassToEnergyConverter.class, new TileEntityMassToEnergyConverterRenderer());
    }
    
    @Override
    public void initRendering(){
        RenderIds.massToEnergyConverterRenderId = RenderingRegistry.getNextAvailableRenderId();
        
        MinecraftForgeClient.registerItemRenderer(BlockIds.MASS_TO_ENERGY_CONVERTER_ID, new ItemMassToEnergyConverterRenderer());
    }
}