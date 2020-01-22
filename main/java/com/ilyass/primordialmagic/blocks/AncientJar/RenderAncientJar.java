package com.ilyass.primordialmagic.blocks.AncientJar;

import com.ilyass.primordialmagic.util.Reference;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.util.ResourceLocation;

public class RenderAncientJar extends TileEntitySpecialRenderer<TileEntityAncientJar>
	{
		private static final ResourceLocation TEXTURE = new ResourceLocation(Reference.MOD_ID + ":textures/blocks/ancient_stone_block.png");
		private static final ModelAncientJar model = new ModelAncientJar();
		
		@Override
		public void render(TileEntityAncientJar te, double x, double y, double z, float partialTicks, int destroyStage, float alpha) 
		{
	    	
	    	bindTexture(TEXTURE);
	    	GlStateManager.pushMatrix();
	    	GlStateManager.translate(x, y, z);
	    
	    	model.render();
            
	    	GlStateManager.popMatrix();
	}
		
}