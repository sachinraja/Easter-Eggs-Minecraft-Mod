package com.xCloudfox.EasterEggs.util.handlers;

import com.xCloudfox.EasterEggs.entity.EntityEasterBunny;
import com.xCloudfox.EasterEggs.init.ModBlocks;
import com.xCloudfox.EasterEggs.init.ModEntities;
import com.xCloudfox.EasterEggs.init.ModItems;
import com.xCloudfox.EasterEggs.util.Reference;
import com.xCloudfox.EasterEggs.util.interfaces.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.init.Biomes;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.BiomeCache;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.common.BiomeManager.BiomeType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.EntityEntry;
import net.minecraftforge.fml.common.registry.EntityEntryBuilder;
import net.minecraftforge.fml.common.registry.EntityRegistry;

@EventBusSubscriber
public class RegistryHandler
{
	@SubscribeEvent
	public static void onItemRegister(RegistryEvent.Register<Item> event)
	{
		event.getRegistry().registerAll(ModItems.ITEMS.toArray(new Item[0]));
	}
	
	@SubscribeEvent
	public static void onBlockRegister(RegistryEvent.Register<Block> event)
	{
		event.getRegistry().registerAll(ModBlocks.BLOCKS.toArray(new Block[0]));
	}
	
	@SubscribeEvent
	public static void onModelRegister(ModelRegistryEvent event)
	{
		for(Block block : ModBlocks.BLOCKS)
		{
			if(block instanceof IHasModel) 
			{
				((IHasModel)block).registerModels();
			}
		}
		
		for(Item item : ModItems.ITEMS)
		{
			if(item instanceof IHasModel) 
			{
				((IHasModel)item).registerModels();
			}
		}
	}
	
	public static void preInitRegistries()
	{
		ModEntities.registerEntities();
		RenderHandler.registerEntityRenders();
	}
}
