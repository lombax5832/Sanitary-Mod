package Sanitary.client.renderer.tileentity;

import org.lwjgl.opengl.GL11;

import cpw.mods.fml.client.FMLClientHandler;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import Sanitary.client.model.ModelMassToEnergyConverter;
import Sanitary.lib.Textures;
import Sanitary.tileentity.TileMassToEnergyConverter;

public class TileEntityMassToEnergyConverterRenderer extends TileEntitySpecialRenderer{

    private ModelMassToEnergyConverter modelMassToEnergyConverter = new ModelMassToEnergyConverter();
    
    @Override
    public void renderTileEntityAt(TileEntity tileentity, double x, double y,
            double z, float ticks) {
        
        if (tileentity instanceof TileMassToEnergyConverter) {
            GL11.glPushMatrix();
            GL11.glDisable(GL11.GL_LIGHTING);

            // Scale, Translate, Rotate
//            GL11.glScalef(1.0F, 1.0F, 1.0F);
//            GL11.glTranslatef((float) x + 0.5F, (float) y + 0.0F, (float) z + 1.2F);
//            GL11.glRotatef(45F, 0F, 1F, 0F);
//            GL11.glRotatef(-90F, 1F, 0F, 0F);

            // Bind texture
            FMLClientHandler.instance().getClient().renderEngine.bindTexture(Textures.MODEL_MASS_TO_ENERGY_CONVERTER);

            // Render
            modelMassToEnergyConverter.render(1F);
            GL11.glEnable(GL11.GL_LIGHTING);
            GL11.glPopMatrix(); 
        }
    }
}
