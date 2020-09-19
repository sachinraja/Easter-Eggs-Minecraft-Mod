package com.xCloudfox.EasterEggs.entity;

import com.xCloudfox.EasterEggs.functions.ExtraFunctions;
import com.xCloudfox.EasterEggs.init.ModBlocks;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIMate;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAITempt;
import net.minecraft.entity.ai.EntityAIWanderAvoidWater;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.passive.EntityRabbit;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class EntityEasterBunny extends EntityRabbit
{
	private int jumpTicks;
    private int jumpDuration;
    public int timeUntilNextEgg;
    
	public EntityEasterBunny(World worldIn) 
	{
		super(worldIn);
		this.setSize(0.6F, 0.8F);
		this.timeUntilNextEgg = this.rand.nextInt(6000) + 6000;
	}
	
	@Override
	protected void applyEntityAttributes() 
	{
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(6.0D);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.25D);
	}
	
	@Override
	public float getEyeHeight() 
	{
		return 0.5F;
	}
	
	@Override
	public EntityRabbit createChild(EntityAgeable ageable) 
	{
		return new EntityEasterBunny(world);
	}
	
	@Override
	public void onLivingUpdate() 
	{
		super.onLivingUpdate();
		
		if (this.jumpTicks != this.jumpDuration)
        {
            ++this.jumpTicks;
        }
        else if (this.jumpDuration != 0)
        {
            this.jumpTicks = 0;
            this.jumpDuration = 0;
            this.setJumping(false);
        }
		
		if (!this.world.isRemote && !this.isChild() && --this.timeUntilNextEgg <= 0)
		{
			this.playSound(SoundEvents.ENTITY_CHICKEN_EGG, 1.0F, (this.rand.nextFloat() - this.rand.nextFloat()) * 0.2F + 1.0F);
			
			switch (rand.nextInt(16))
	    	{
	    	case 0 : {
	    		this.dropItem(Item.getItemFromBlock(ModBlocks.BLACK_EASTER_EGG), 1);
	    		break;
	    	}
	    	
	    	case 1 : {
	    		this.dropItem(Item.getItemFromBlock(ModBlocks.RED_EASTER_EGG), 1);
	    		break;
	    	}
	    	
	    	case 2 : {
	    		this.dropItem(Item.getItemFromBlock(ModBlocks.GREEN_EASTER_EGG), 1);
	    		break;
	    	}
	    	
	    	case 3 : {
	    		this.dropItem(Item.getItemFromBlock(ModBlocks.BROWN_EASTER_EGG), 1);
	    		break;
	    	}
	    	
	    	case 4 : {
	    		this.dropItem(Item.getItemFromBlock(ModBlocks.BLUE_EASTER_EGG), 1);
	    		break;
	    	}
	    	
	    	case 5 : {
	    		this.dropItem(Item.getItemFromBlock(ModBlocks.PURPLE_EASTER_EGG), 1);
	    		break;
	    	}
	    	
	    	case 6 : {
	    		this.dropItem(Item.getItemFromBlock(ModBlocks.CYAN_EASTER_EGG), 1);
	    		break;
	    	}
	    	
	    	case 7 : {
	    		this.dropItem(Item.getItemFromBlock(ModBlocks.SILVER_EASTER_EGG), 1);
	    		break;
	    	}
	    	
	    	case 8 : {
	    		this.dropItem(Item.getItemFromBlock(ModBlocks.GRAY_EASTER_EGG), 1);
	    		break;
	    	}
	    	
	    	case 9 : {
	    		this.dropItem(Item.getItemFromBlock(ModBlocks.PINK_EASTER_EGG), 1);
	    		break;
	    	}
	    	
	    	case 10 : {
	    		this.dropItem(Item.getItemFromBlock(ModBlocks.LIME_EASTER_EGG), 1);
	    		break;
	    	}
	    	
	    	case 11 : {
	    		this.dropItem(Item.getItemFromBlock(ModBlocks.YELLOW_EASTER_EGG), 1);
	    		break;
	    	}
	    	
	    	case 12 : {
	    		this.dropItem(Item.getItemFromBlock(ModBlocks.LIGHT_BLUE_EASTER_EGG), 1);
	    		break;
	    	}
	    	
	    	case 13 : {
	    		this.dropItem(Item.getItemFromBlock(ModBlocks.MAGENTA_EASTER_EGG), 1);
	    		break;
	    	}
	    	
	    	case 14 : {
	    		this.dropItem(Item.getItemFromBlock(ModBlocks.ORANGE_EASTER_EGG), 1);
	    		break;
	    	}
	    	
	    	case 15 : {
	    		this.dropItem(Item.getItemFromBlock(ModBlocks.WHITE_EASTER_EGG), 1);
	    	}
	    	}
			
            this.timeUntilNextEgg = this.rand.nextInt(6000) + 6000;
		}
	}
}
