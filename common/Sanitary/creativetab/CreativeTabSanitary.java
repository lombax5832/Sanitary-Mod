package Sanitary.creativetab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

/**
 * 
 * 
 * CreativeTabSanitary
 * 
 * @author lombax5832
 * 
 */
public class CreativeTabSanitary extends CreativeTabs {
    
    public static final CreativeTabs tabSanitary = new CreativeTabSanitary(CreativeTabs.getNextID(), "Sanitary");

    public CreativeTabSanitary(int par1, String par2Str) {

        super(par1, par2Str);
    }

    @Override
    public ItemStack getIconItemStack() {
        return new ItemStack(Item.paper);
    }

    @Override
    public String getTranslatedTabLabel() {
        return "Sanitation Mod";
    }

}
