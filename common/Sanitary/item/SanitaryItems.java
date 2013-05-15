package Sanitary.item;

import net.minecraft.item.Item;
import Sanitary.lib.ItemIds;

public class SanitaryItems {

    // Items
    public static Item paperTowel;
    
    public static void initialize(){
        paperTowel = new ItemPaperTowel(ItemIds.PAPER_TOWEL_ID);
    }
}
