package com.xCloudfox.EasterEggs.util.handlers;

import com.xCloudfox.EasterEggs.entity.EntityEasterBunny;
import com.xCloudfox.EasterEggs.entity.render.RenderEasterBunny;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class RenderHandler 
{
	public static void registerEntityRenders()
	{
		RenderingRegistry.registerEntityRenderingHandler(EntityEasterBunny.class, new IRenderFactory<EntityEasterBunny>()
		{
			@Override
			public Render<? super EntityEasterBunny> createRenderFor(RenderManager manager) 
			{
				return new RenderEasterBunny(manager);
			}
		});
	}
}
