package Sanitary.item;

import java.util.List;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import Sanitary.creativetab.CreativeTabSanitary;
import Sanitary.lib.Strings;

public class ItemPaperTowel extends Item{

    public ItemPaperTowel(int par1) {
        super(par1);
        this.maxStackSize = 1;
        this.setCreativeTab(CreativeTabSanitary.tabSanitary);
        this.setUnlocalizedName(Strings.PAPER_TOWEL_CLEAN);
    }
    
    @SuppressWarnings({ "rawtypes", "unchecked" })
    @Override
    public void addInformation(ItemStack par1ItemStack,
            EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
        par3List.clear();
        par3List.add(Strings.PAPER_TOWEL_CLEAN);
        par3List.add("Use this item to wipe your hands.");
    }
    
    @Override
    public void registerIcons(IconRegister par1IconRegister) {
        itemIcon = par1IconRegister.registerIcon("Sanitary:Paper_Towel_Clean");
    }

}
