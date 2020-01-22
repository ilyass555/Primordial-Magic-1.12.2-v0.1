package com.ilyass.primordialmagic.blocks.AncientJar;


import org.lwjgl.opengl.GL11;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;

public class ModelAncientJar extends ModelBase {
	private final ModelRenderer bone;

	public ModelAncientJar() {
		textureWidth = 16;
		textureHeight = 16;

		bone = new ModelRenderer(this, "bone");
		bone.setRotationPoint(8.0F, 24.0F, -8.0F);
		bone.cubeList.add(new ModelBox(bone, 0, 0, -7.0F, -1.0F, 1.0F, 6, 1, 6, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 5, 10, -8.0F, -8.0F, 0.0F, 8, 7, 8, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 4, -6.0F, -10.0F, 2.0F, 4, 2, 4, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 1, -7.0F, -11.0F, 1.0F, 6, 1, 1, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 1, -7.0F, -11.0F, 6.0F, 6, 1, 1, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 5, -2.0F, -11.0F, 1.0F, 1, 1, 5, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 5, -7.0F, -11.0F, 1.0F, 1, 1, 5, 0.0F, true));
	}
	public void render()
	{
		bone.render(1f / 16);
	}
	
	
	public void rotateX(float radians)
	{
		bone.rotateAngleX = radians;
	}
}