package Sanitary.client.renderer.item;

import net.minecraft.item.ItemStack;
import net.minecraftforge.client.IItemRenderer;

import org.lwjgl.opengl.GL11;

import Sanitary.client.model.ModelMassToEnergyConverter;
import Sanitary.lib.Textures;
import cpw.mods.fml.client.FMLClientHandler;

public class ItemMassToEnergyConverterRenderer implements IItemRenderer{

    private ModelMassToEnergyConverter modelMassToEnergyConverter;
    
    @Override
    public boolean handleRenderType(ItemStack item, ItemRenderType type) {
        return true;
    }

    @Override
    public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item,
            ItemRendererHelper helper) {
        return true;
    }

    @Override
    public void renderItem(ItemRenderType type, ItemStack item, Object... data) {
        
        switch(type){
            case ENTITY: {
                renderMassToEnergyConverter(-0.5F, 0.0F, 0.5F, 1.0F);
                return;
            }
            case EQUIPPED: {
                renderMassToEnergyConverter(0.0F, 0.0F, 1.0F, 1.0F);
                return;
            }
            case EQUIPPED_FIRST_PERSON: {
                renderMassToEnergyConverter(0.0F, 0.0F, 1.0F, 1.0F);
                return;
            }
            case INVENTORY: {
                renderMassToEnergyConverter(0.0F, -0.1F, 1.0F, 1.0F);
                return;
            }
            default:
                return;
        }
        
    }
    
    private void renderMassToEnergyConverter(float x, float y, float z, float scale) {
        
        GL11.glPushMatrix();
        GL11.glDisable(GL11.GL_LIGHTING);

        // Scale, Translate, Rotate
        GL11.glScalef(scale, scale, scale);
        GL11.glTranslatef(x, y, z);
        GL11.glRotatef(-90F, 1F, 0, 0);

        // Bind texture
        FMLClientHandler.instance().getClient().renderEngine.bindTexture(Textures.MODEL_MASS_TO_ENERGY_CONVERTER);

        // Render
        modelMassToEnergyConverter.render(1F);

        GL11.glEnable(GL11.GL_LIGHTING);
        GL11.glPopMatrix();
        
    }

}
