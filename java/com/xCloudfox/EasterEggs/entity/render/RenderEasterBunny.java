package com.xCloudfox.EasterEggs.entity.render;

import com.xCloudfox.EasterEggs.entity.EntityEasterBunny;
import com.xCloudfox.EasterEggs.entity.model.ModelEasterBunny;
import com.xCloudfox.EasterEggs.util.Reference;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderEasterBunny extends RenderLiving<EntityEasterBunny>
{
	public static final ResourceLocation TEXTURES = new ResourceLocation(Reference.MOD_ID + ":textures/entity/easter_bunny.png");
	
	public RenderEasterBunny(RenderManager manager) 
	{
		super(manager, new ModelEasterBunny(), 0.5F);
	}
	
	@Override
	protected ResourceLocation getEntityTexture(EntityEasterBunny entity) 
	{
		return TEXTURES;
	}
	
	@Override
	protected void applyRotations(EntityEasterBunny entityLiving, float p_77043_2_, float rotationYaw, float partialTicks) 
	{
		super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
	}
}
