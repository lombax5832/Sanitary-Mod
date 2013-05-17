package Sanitary.block;

import net.minecraft.block.Block;
import Sanitary.lib.BlockIds;

public class SanitaryBlocks {

    // Blocks
    public static Block massToEnergyConverter;
    
    public static void initialize(){
        massToEnergyConverter = new BlockMassToEnergyConverter(BlockIds.MASS_TO_ENERGY_CONVERTER_ID, "Mass to Energy Converter");
    }
}
