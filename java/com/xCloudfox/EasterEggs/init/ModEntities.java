package com.xCloudfox.EasterEggs.init;

import com.xCloudfox.EasterEggs.Main;
import com.xCloudfox.EasterEggs.entity.EntityEasterBunny;
import com.xCloudfox.EasterEggs.util.Reference;

import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class ModEntities 
{
	public static void registerEntities()
	{
		registerEntity("easter_bunny", EntityEasterBunny.class, Reference.ENTITY_EASTER_BUNNY, 30, 16753920, 16761007);
	}
	private static void registerEntity(String name, Class<? extends Entity> entity, int id, int range, int color1, int color2)
	{
		EntityRegistry.registerModEntity(new ResourceLocation(Reference.MOD_ID + ":" + name), entity, name, id, Main.instance, range, 1, true, color1, color2);
	}
}
