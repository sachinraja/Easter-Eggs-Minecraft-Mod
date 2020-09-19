package com.xCloudfox.EasterEggs.blocks;

import java.util.Random;

import com.xCloudfox.EasterEggs.functions.ExtraFunctions;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.util.FakePlayer;

public class EasterEgg extends BlockBase 
{
	public static final AxisAlignedBB EASTER_EGG_AABB = new AxisAlignedBB(0.0625D, 0, 0.0625D, 0.9375D, 0.9375D, 0.9375D);
	
	public EasterEgg(String name) 
	{
		super(name, Material.CLOTH);
		
		setSoundType(SoundType.CLOTH);
		setHardness(2.0F);
		setResistance(15.0F);
	}
	
	@Override
	public boolean isOpaqueCube(IBlockState state) 
	{
		return false;
	}
	
	@Override
	public boolean isFullCube(IBlockState state) 
	{
		return false;
	}
	
	@Override
	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) 
	{
		return EASTER_EGG_AABB;
		
	}
	
	 @Override
	    public boolean removedByPlayer(IBlockState state, World world, BlockPos pos, EntityPlayer player, boolean willHarvest) {
	        if (!world.isRemote && player != null && !(player instanceof FakePlayer)) 
	        {
	            world.setBlockToAir(pos);
	            drops(world, pos, player);
	        }

	        return false;
	    }
	 
	    private void drops(World worldIn, BlockPos pos, EntityPlayer player) 
	    {
	    	Random rand = new Random();
	    	
	    	   	switch(rand.nextInt(12)) 
	    	{
	    	default : {
	    		ExtraFunctions.lookUp(worldIn, player);
	    		break;
	    	}
	    	
	    	case 0 : {
	    	ExtraFunctions.musicKit(worldIn, pos, rand);
	    	break;
	    	}
	    	
	    	case 1 : {
	    	ExtraFunctions.bouncyCastle(worldIn, player);
	    	break;
	    	}
	    	
	    	case 2 : {
	    	ExtraFunctions.lookUp(worldIn, player);
	    	break;
	    	}
	    	
	    	case 3 : {
	    	ExtraFunctions.bunnyArmy(worldIn, pos, 10, rand);
	    	break;
	    	}
	    	
	    	case 4 : {
	    	ExtraFunctions.easterChat(player);
	    	break;
	    	}
	    	
	    	case 5 : {
	    	ExtraFunctions.foodKit(worldIn, pos);
	    	break;
	    	}
	    	
	    	case 6 : {
	    	ExtraFunctions.materialKit(worldIn, pos, rand);
	    	break;
	    	}
	    	
	    	case 7 : {
	    	ExtraFunctions.potionKit(worldIn, pos);
	    	break;
	    	}
	    	
	    	case 8 : {
	    	ExtraFunctions.redstoneKit(worldIn, pos);
	    	break;
	    	}
	    	
	    	case 9 : {
	    	ExtraFunctions.eggStruct(worldIn, player);
	    	break;
	    	}
	    	
	    	case 10 : {
	    	ExtraFunctions.randomEgg(worldIn, pos, rand);
	    	ExtraFunctions.randomEgg(worldIn, pos, rand);
	    	break;
	    	}
	    	
	    	case 11 : {
	    	ExtraFunctions.spawnHorse(worldIn, pos, rand);
	    	}
	    }
	}
}
