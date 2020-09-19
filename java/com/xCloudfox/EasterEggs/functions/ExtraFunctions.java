package com.xCloudfox.EasterEggs.functions;

import java.util.Random;

import com.mojang.realmsclient.gui.ChatFormatting;
import com.xCloudfox.EasterEggs.entity.EntityEasterBunny;
import com.xCloudfox.EasterEggs.init.ModBlocks;

import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.passive.EntityHorse;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;

public class ExtraFunctions 
{
	public static void summonBlockWithLoop(World worldIn, BlockPos pos, Block block, int loop, int style, int skip) {

        float f = 0.5F;
        double d0 = (double) (worldIn.rand.nextFloat() * f) + (double) (1.0F - f) * 0.5D;
        double d1 = (double) (worldIn.rand.nextFloat() * f) + (double) (1.0F - f) * 0.5D;
        double d2 = (double) (worldIn.rand.nextFloat() * f) + (double) (1.0F - f) * 0.5D;
        EntityItem entityitem = new EntityItem(worldIn, (double) pos.getX() + d0, (double) pos.getY() + d1, (double) pos.getZ() + d2, new ItemStack(block));
        entityitem.setDefaultPickupDelay();
        for (int i = 0; i <= loop - 1; i++) 
        {
            if (style == 1) 
            {
                EntityItem entityitem1 = new EntityItem(worldIn, (double) pos.getX(), (double) pos.getY() + i + skip, (double) pos.getZ(), new ItemStack(block));
                worldIn.spawnEntity(entityitem1);
            }
            
            else 
            {
                EntityItem entityitem1 = new EntityItem(worldIn, (double) pos.getX() + d0, (double) pos.getY() + d1, (double) pos.getZ() + d2, new ItemStack(block));
                worldIn.spawnEntity(entityitem1);
            }
        }
    }
	
	public static void summonItemWithLoop(World worldIn, BlockPos pos, Item item, int loop, int style, int skip) {

        float f = 0.5F;
        double d0 = (double) (worldIn.rand.nextFloat() * f) + (double) (1.0F - f) * 0.5D;
        double d1 = (double) (worldIn.rand.nextFloat() * f) + (double) (1.0F - f) * 0.5D;
        double d2 = (double) (worldIn.rand.nextFloat() * f) + (double) (1.0F - f) * 0.5D;

        for (int i = 0; i <= loop - 1; i++) 
        {
            if (style == 1) 
            {
                EntityItem entityitem1 = new EntityItem(worldIn, (double) pos.getX(), (double) pos.getY() + i + skip, (double) pos.getZ(), new ItemStack(item));
                entityitem1.setDefaultPickupDelay();
                worldIn.spawnEntity(entityitem1);
            } 
            
            else 
            {
                EntityItem entityitem1 = new EntityItem(worldIn, (double) pos.getX() + d0, (double) pos.getY() + d1, (double) pos.getZ() + d2, new ItemStack(item));
                entityitem1.setDefaultPickupDelay();
                worldIn.spawnEntity(entityitem1);
            }
        }

    }
	
	public static void summonBlockAsDrop(BlockPos pos, World worldIn, Block block) {

        float f = 0.5F;
        double d0 = (double) (worldIn.rand.nextFloat() * f) + (double) (1.0F - f) * 0.5D;
        double d1 = (double) (worldIn.rand.nextFloat() * f) + (double) (1.0F - f) * 0.5D;
        double d2 = (double) (worldIn.rand.nextFloat() * f) + (double) (1.0F - f) * 0.5D;
        EntityItem entityitem = new EntityItem(worldIn, (double) pos.getX() + d0, (double) pos.getY() + d1, (double) pos.getZ() + d2, new ItemStack(block));
        entityitem.setDefaultPickupDelay();
        worldIn.spawnEntity(entityitem);

    }

    public static void summonItemAsDrop(BlockPos pos, World worldIn, ItemStack stack) {

        float f = 0.5F;
        double d0 = (double) (worldIn.rand.nextFloat() * f) + (double) (1.0F - f) * 0.5D;
        double d1 = (double) (worldIn.rand.nextFloat() * f) + (double) (1.0F - f) * 0.5D;
        double d2 = (double) (worldIn.rand.nextFloat() * f) + (double) (1.0F - f) * 0.5D;
        EntityItem entityitem = new EntityItem(worldIn, (double) pos.getX() + d0, (double) pos.getY() + d1, (double) pos.getZ() + d2, stack);
        entityitem.setDefaultPickupDelay();
        worldIn.spawnEntity(entityitem);

    }
    
    public static void summonItemStackWithLoop(World worldIn, BlockPos pos, ItemStack item, int loop, int style, int skip) {

        float f = 0.5F;
        double d0 = (double) (worldIn.rand.nextFloat() * f) + (double) (1.0F - f) * 0.5D;
        double d1 = (double) (worldIn.rand.nextFloat() * f) + (double) (1.0F - f) * 0.5D;
        double d2 = (double) (worldIn.rand.nextFloat() * f) + (double) (1.0F - f) * 0.5D;
        EntityItem entityitem = new EntityItem(worldIn, (double) pos.getX() + d0, (double) pos.getY() + d1, (double) pos.getZ() + d2, item);
        entityitem.setDefaultPickupDelay();
        for (int i = 0; i <= loop - 1; i++) {

            if (style == 1) {
                EntityItem entityitem1 = new EntityItem(worldIn, (double) pos.getX(), (double) pos.getY() + i + skip, (double) pos.getZ(), item);
                worldIn.spawnEntity(entityitem1);
            } else {
                EntityItem entityitem1 = new EntityItem(worldIn, (double) pos.getX() + d0, (double) pos.getY() + d1, (double) pos.getZ() + d2, item);
                worldIn.spawnEntity(entityitem1);
            }
        }
    }
    
	public static void redstoneKit(World worldIn, BlockPos pos) 
	{

        summonItemWithLoop(worldIn, pos, Items.REDSTONE, 64, 0, 0);
        summonBlockWithLoop(worldIn, pos, Blocks.STICKY_PISTON, 16, 0, 0);
        summonItemWithLoop(worldIn, pos, Items.SLIME_BALL, 32, 1, 5);
        summonItemWithLoop(worldIn, pos, Items.REPEATER, 10, 0, 0);

    }
	
	public static void summonEnchantedItemAsDrop(World worldIn, BlockPos pos, Item i, String name, Enchantment e, int amp) 
	 {
		ItemStack itemE = new ItemStack(i);
		itemE.addEnchantment(e, amp);
		itemE.setStackDisplayName(name);
		summonItemAsDrop(pos, worldIn, itemE);
	 }

	public static void easterChat(EntityPlayer player) 
	{
        player.sendMessage(new TextComponentString(ChatFormatting.LIGHT_PURPLE + "Happy Easter!"));
    }
	
	public static void addEnchantsMany(ItemStack stack, Enchantment[] e, int amp, World worldIn, BlockPos pos) 
	{
        for (Enchantment anE : e) 
        {
            stack.addEnchantment(anE, amp);
        }

        summonItemAsDrop(pos, worldIn, stack);

    }


    public static void addRandomEnchtToRandomItems(World worldIn, ItemStack[] stack, Enchantment[] ench, int ampUpperLimit, BlockPos pos, Random rand) 
    {
        int r = rand.nextInt(stack.length);
        int a = rand.nextInt(stack.length);
        
        if (r == a) 
        {
            a -= 1;
        }
        
        for (int i = a; i < r; i++) 
        {
            int y = rand.nextInt(ench.length);
            int z = rand.nextInt(ench.length);
            
            if (y == z) 
            {
                z -= 1;
            }
            
            for (int j = z; j < y; j++) 
            {
                int n = rand.nextInt(ench.length);
                stack[i].addEnchantment(ench[n], rand.nextInt(ampUpperLimit) + 1);
            }
            
            summonItemStackWithLoop(worldIn, pos, stack[i], 1, 0, 0);
        }
    }
	
    public static void foodKit(World worldIn, BlockPos pos) 
    {
        summonBlockAsDrop(pos, worldIn, Blocks.CAKE);
        summonItemWithLoop(worldIn, pos, Items.EGG, 16, 0, 0);
        summonItemWithLoop(worldIn, pos, Items.EGG, 16, 0, 0);
        summonItemStackWithLoop(worldIn, pos, new ItemStack(Items.APPLE), 5, 0, 0);
        summonItemAsDrop(pos, worldIn, new ItemStack(Items.GOLDEN_APPLE));
    }
    
    public static void materialKit(World worldIn, BlockPos pos, Random rand) 
    {
        summonItemWithLoop(worldIn, pos, Items.DIAMOND, 8, 0, 0);
    	summonItemWithLoop(worldIn, pos, Items.GOLD_INGOT, 16, 0, 0);
    	summonItemWithLoop(worldIn, pos, Items.IRON_INGOT, 16, 0, 0);
    	summonItemWithLoop(worldIn, pos, Items.EMERALD, 16, 0, 0);
    	summonItemWithLoop(worldIn, pos, Items.COAL, 32, 0, 0);
    }
    
    public static void bunnyArmy(World worldIn, BlockPos pos, int loop, Random rand) 
    {
        for (int i = 0; i <= loop - 1; i++) 
        {
            EntityEasterBunny e = new EntityEasterBunny(worldIn);
            e.setPosition(pos.getX(), pos.getY(), pos.getZ());
            e.setAlwaysRenderNameTag(true);
            e.setCustomNameTag("Bunny Army");
            
            worldIn.spawnEntity(e);
        }
    }
    
    public static void lookUp(World w, EntityPlayer p) 
    {
        double x = p.posX;
        double y = p.posY;
        double z = p.posZ;
        
        p.sendMessage(new TextComponentString(ChatFormatting.LIGHT_PURPLE + "Above you!"));
        
        setOneBlock(w, new BlockPos(x, y + 7, z), Blocks.DIAMOND_BLOCK);
    }
    
    public static void potionKit(World worldIn, BlockPos pos) 
    {
    	summonItemWithLoop(worldIn, pos, Items.ENDER_PEARL, 16, 0, 0);
    	summonItemWithLoop(worldIn, pos, Items.ENDER_EYE, 16, 0, 0);
    	summonItemWithLoop(worldIn, pos, Items.MAGMA_CREAM, 16, 0, 0);
    	summonItemWithLoop(worldIn, pos, Items.FERMENTED_SPIDER_EYE, 16, 0, 0);
    	summonBlockAsDrop(pos, worldIn, Blocks.BREWING_STAND);
    	summonItemWithLoop(worldIn, pos, Items.SPECKLED_MELON, 16, 0, 0);
    	summonItemWithLoop(worldIn, pos, Items.GOLD_NUGGET, 32, 0, 0);
    	summonItemWithLoop(worldIn, pos, Items.SPIDER_EYE, 16, 0, 0);
    	summonItemWithLoop(worldIn, pos, Items.NETHER_WART, 64, 0, 0);
    	summonItemWithLoop(worldIn, pos, Items.GLASS_BOTTLE, 16, 0, 0);
    	summonItemWithLoop(worldIn, pos, Items.BLAZE_ROD, 16, 0, 0);
    }


    public static void musicKit(World worldIn, BlockPos pos, Random rand) 
    {
    	switch (rand.nextInt(12))
        {
            case 1: {
            	summonItemAsDrop(pos, worldIn, new ItemStack(Blocks.JUKEBOX));
                summonItemAsDrop(pos, worldIn, new ItemStack(Items.RECORD_11));
                break;
            }
            case 2: {
            	 summonItemAsDrop(pos, worldIn, new ItemStack(Blocks.JUKEBOX));
            	 summonItemAsDrop(pos, worldIn, new ItemStack(Items.RECORD_13));
                break;
            }
            case 3: {
            	 summonItemAsDrop(pos, worldIn, new ItemStack(Blocks.JUKEBOX));
            	 summonItemAsDrop(pos, worldIn, new ItemStack(Items.RECORD_BLOCKS));;
                break;
            }
            case 0: {
            	 summonItemAsDrop(pos, worldIn, new ItemStack(Blocks.JUKEBOX));
            	 summonItemAsDrop(pos, worldIn, new ItemStack(Items.RECORD_CAT));
                break;
            }

            case 4: {
            	 summonItemAsDrop(pos, worldIn, new ItemStack(Blocks.JUKEBOX));
            	 summonItemAsDrop(pos, worldIn, new ItemStack(Items.RECORD_CHIRP));
            	 break;
            }
            
            case 5: {
            	summonItemAsDrop(pos, worldIn, new ItemStack(Blocks.JUKEBOX));
                summonItemAsDrop(pos, worldIn, new ItemStack(Items.RECORD_FAR));
                break;
            }
            
            case 6: {
            	summonItemAsDrop(pos, worldIn, new ItemStack(Blocks.JUKEBOX));
                summonItemAsDrop(pos, worldIn, new ItemStack(Items.RECORD_MALL));
                break;
            }
            
            case 7: {
            	summonItemAsDrop(pos, worldIn, new ItemStack(Blocks.JUKEBOX));
                summonItemAsDrop(pos, worldIn, new ItemStack(Items.RECORD_MELLOHI));
                break;
            }
            
            case 8: {
            	summonItemAsDrop(pos, worldIn, new ItemStack(Blocks.JUKEBOX));
                summonItemAsDrop(pos, worldIn, new ItemStack(Items.RECORD_STAL));
                break;
            }
            
            case 9: {
            	summonItemAsDrop(pos, worldIn, new ItemStack(Blocks.JUKEBOX));
                summonItemAsDrop(pos, worldIn, new ItemStack(Items.RECORD_STRAD));
                break;
            }
            
            case 10: {
            	summonItemAsDrop(pos, worldIn, new ItemStack(Blocks.JUKEBOX));
                summonItemAsDrop(pos, worldIn, new ItemStack(Items.RECORD_WAIT));
                break;
            }
            
            case 11: {
            	summonItemAsDrop(pos, worldIn, new ItemStack(Blocks.JUKEBOX));
                summonItemAsDrop(pos, worldIn, new ItemStack(Items.RECORD_WARD));
            }
        }
    }
    
    public static void bouncyCastle(World worldIn, EntityPlayer player)
    {
    	worldIn.setBlockState(new BlockPos(player.posX, player.posY - 1, player.posZ), Blocks.SLIME_BLOCK.getDefaultState());
    	worldIn.setBlockState(new BlockPos(player.posX - 1, player.posY - 1, player.posZ), Blocks.SLIME_BLOCK.getDefaultState());
    	worldIn.setBlockState(new BlockPos(player.posX - 2, player.posY - 1, player.posZ), Blocks.SLIME_BLOCK.getDefaultState());
    	worldIn.setBlockState(new BlockPos(player.posX + 1, player.posY - 1, player.posZ), Blocks.SLIME_BLOCK.getDefaultState());
    	worldIn.setBlockState(new BlockPos(player.posX + 2, player.posY - 1, player.posZ), Blocks.SLIME_BLOCK.getDefaultState());
    	worldIn.setBlockState(new BlockPos(player.posX, player.posY - 1, player.posZ - 1), Blocks.SLIME_BLOCK.getDefaultState());
    	worldIn.setBlockState(new BlockPos(player.posX, player.posY - 1, player.posZ - 2), Blocks.SLIME_BLOCK.getDefaultState());
    	worldIn.setBlockState(new BlockPos(player.posX, player.posY - 1, player.posZ + 1), Blocks.SLIME_BLOCK.getDefaultState());
    	worldIn.setBlockState(new BlockPos(player.posX, player.posY - 1, player.posZ + 2), Blocks.SLIME_BLOCK.getDefaultState());
    	worldIn.setBlockState(new BlockPos(player.posX - 1, player.posY - 1, player.posZ - 1), Blocks.SLIME_BLOCK.getDefaultState());
    	worldIn.setBlockState(new BlockPos(player.posX - 1, player.posY - 1, player.posZ - 2), Blocks.SLIME_BLOCK.getDefaultState());
    	worldIn.setBlockState(new BlockPos(player.posX - 1, player.posY - 1, player.posZ + 1), Blocks.SLIME_BLOCK.getDefaultState());
    	worldIn.setBlockState(new BlockPos(player.posX - 1, player.posY - 1, player.posZ + 2), Blocks.SLIME_BLOCK.getDefaultState());
    	worldIn.setBlockState(new BlockPos(player.posX - 2, player.posY - 1, player.posZ - 1), Blocks.SLIME_BLOCK.getDefaultState());
    	worldIn.setBlockState(new BlockPos(player.posX - 2, player.posY - 1, player.posZ - 2), Blocks.SLIME_BLOCK.getDefaultState());
    	worldIn.setBlockState(new BlockPos(player.posX - 2, player.posY - 1, player.posZ + 1), Blocks.SLIME_BLOCK.getDefaultState());
    	worldIn.setBlockState(new BlockPos(player.posX - 2, player.posY - 1, player.posZ + 2), Blocks.SLIME_BLOCK.getDefaultState());
    	worldIn.setBlockState(new BlockPos(player.posX + 1, player.posY - 1, player.posZ - 1), Blocks.SLIME_BLOCK.getDefaultState());
    	worldIn.setBlockState(new BlockPos(player.posX + 1, player.posY - 1, player.posZ - 2), Blocks.SLIME_BLOCK.getDefaultState());
    	worldIn.setBlockState(new BlockPos(player.posX + 1, player.posY - 1, player.posZ + 1), Blocks.SLIME_BLOCK.getDefaultState());
    	worldIn.setBlockState(new BlockPos(player.posX + 1, player.posY - 1, player.posZ + 2), Blocks.SLIME_BLOCK.getDefaultState());
    	worldIn.setBlockState(new BlockPos(player.posX + 2, player.posY - 1, player.posZ - 1), Blocks.SLIME_BLOCK.getDefaultState());
    	worldIn.setBlockState(new BlockPos(player.posX + 2, player.posY - 1, player.posZ - 2), Blocks.SLIME_BLOCK.getDefaultState());
    	worldIn.setBlockState(new BlockPos(player.posX + 2, player.posY - 1, player.posZ + 1), Blocks.SLIME_BLOCK.getDefaultState());
    	worldIn.setBlockState(new BlockPos(player.posX + 2, player.posY - 1, player.posZ + 2), Blocks.SLIME_BLOCK.getDefaultState());
    }
    
    public static void eggStruct(World worldIn, EntityPlayer player)
    {
    	worldIn.setBlockState(new BlockPos(player.posX, player.posY - 1, player.posZ), Blocks.CONCRETE.getDefaultState());
    	worldIn.setBlockState(new BlockPos(player.posX + 1, player.posY - 1, player.posZ), Blocks.CONCRETE.getDefaultState());
    	worldIn.setBlockState(new BlockPos(player.posX - 1, player.posY - 1, player.posZ), Blocks.CONCRETE.getDefaultState());
    	worldIn.setBlockState(new BlockPos(player.posX, player.posY - 1, player.posZ + 1), Blocks.CONCRETE.getDefaultState());
    	worldIn.setBlockState(new BlockPos(player.posX, player.posY - 1, player.posZ - 1), Blocks.CONCRETE.getDefaultState());
    	worldIn.setBlockState(new BlockPos(player.posX - 1, player.posY - 1, player.posZ - 1), Blocks.CONCRETE.getDefaultState());
    	worldIn.setBlockState(new BlockPos(player.posX - 1, player.posY - 1, player.posZ + 1), Blocks.CONCRETE.getDefaultState());
    	worldIn.setBlockState(new BlockPos(player.posX + 1, player.posY - 1, player.posZ - 1), Blocks.CONCRETE.getDefaultState());
    	worldIn.setBlockState(new BlockPos(player.posX + 1, player.posY - 1, player.posZ + 1), Blocks.CONCRETE.getDefaultState());
    	worldIn.setBlockState(new BlockPos(player.posX + 2, player.posY, player.posZ), Blocks.CONCRETE.getDefaultState());
    	worldIn.setBlockState(new BlockPos(player.posX + 2, player.posY, player.posZ - 1), Blocks.CONCRETE.getDefaultState());
    	worldIn.setBlockState(new BlockPos(player.posX + 2, player.posY, player.posZ + 1), Blocks.CONCRETE.getDefaultState());
    	worldIn.setBlockState(new BlockPos(player.posX + 2, player.posY + 1, player.posZ), Blocks.CONCRETE.getDefaultState());
    	worldIn.setBlockState(new BlockPos(player.posX + 2, player.posY + 1, player.posZ - 1), Blocks.CONCRETE.getDefaultState());
    	worldIn.setBlockState(new BlockPos(player.posX + 2, player.posY + 1, player.posZ + 1), Blocks.CONCRETE.getDefaultState());
    	worldIn.setBlockState(new BlockPos(player.posX + 2, player.posY + 2, player.posZ), Blocks.CONCRETE.getDefaultState());
    	worldIn.setBlockState(new BlockPos(player.posX + 2, player.posY + 2, player.posZ - 1), Blocks.CONCRETE.getDefaultState());
    	worldIn.setBlockState(new BlockPos(player.posX + 2, player.posY + 2, player.posZ + 1), Blocks.CONCRETE.getDefaultState());
    	worldIn.setBlockState(new BlockPos(player.posX - 2, player.posY, player.posZ), Blocks.CONCRETE.getDefaultState());
    	worldIn.setBlockState(new BlockPos(player.posX - 2, player.posY, player.posZ - 1), Blocks.CONCRETE.getDefaultState());
    	worldIn.setBlockState(new BlockPos(player.posX - 2, player.posY, player.posZ + 1), Blocks.CONCRETE.getDefaultState());
    	worldIn.setBlockState(new BlockPos(player.posX - 2, player.posY + 1, player.posZ), Blocks.CONCRETE.getDefaultState());
    	worldIn.setBlockState(new BlockPos(player.posX - 2, player.posY + 1, player.posZ - 1), Blocks.CONCRETE.getDefaultState());
    	worldIn.setBlockState(new BlockPos(player.posX - 2, player.posY + 1, player.posZ + 1), Blocks.CONCRETE.getDefaultState());
    	worldIn.setBlockState(new BlockPos(player.posX - 2, player.posY + 2, player.posZ), Blocks.CONCRETE.getDefaultState());
    	worldIn.setBlockState(new BlockPos(player.posX - 2, player.posY + 2, player.posZ - 1), Blocks.CONCRETE.getDefaultState());
    	worldIn.setBlockState(new BlockPos(player.posX - 2, player.posY + 2, player.posZ + 1), Blocks.CONCRETE.getDefaultState());
    	worldIn.setBlockState(new BlockPos(player.posX, player.posY, player.posZ + 2), Blocks.CONCRETE.getDefaultState());
    	worldIn.setBlockState(new BlockPos(player.posX - 1, player.posY, player.posZ + 2), Blocks.CONCRETE.getDefaultState());
    	worldIn.setBlockState(new BlockPos(player.posX + 1, player.posY, player.posZ + 2), Blocks.CONCRETE.getDefaultState());
    	worldIn.setBlockState(new BlockPos(player.posX, player.posY + 1, player.posZ + 2), Blocks.CONCRETE.getDefaultState());
    	worldIn.setBlockState(new BlockPos(player.posX - 1, player.posY + 1, player.posZ + 2), Blocks.CONCRETE.getDefaultState());
    	worldIn.setBlockState(new BlockPos(player.posX + 1, player.posY + 1, player.posZ + 2), Blocks.CONCRETE.getDefaultState());
    	worldIn.setBlockState(new BlockPos(player.posX, player.posY + 2, player.posZ + 2), Blocks.CONCRETE.getDefaultState());
    	worldIn.setBlockState(new BlockPos(player.posX - 1, player.posY + 2, player.posZ + 2), Blocks.CONCRETE.getDefaultState());
    	worldIn.setBlockState(new BlockPos(player.posX + 1, player.posY + 2, player.posZ + 2), Blocks.CONCRETE.getDefaultState());
    	worldIn.setBlockState(new BlockPos(player.posX, player.posY, player.posZ - 2), Blocks.CONCRETE.getDefaultState());
    	worldIn.setBlockState(new BlockPos(player.posX - 1, player.posY, player.posZ - 2), Blocks.CONCRETE.getDefaultState());
    	worldIn.setBlockState(new BlockPos(player.posX + 1, player.posY, player.posZ - 2), Blocks.CONCRETE.getDefaultState());
    	worldIn.setBlockState(new BlockPos(player.posX, player.posY + 1, player.posZ - 2), Blocks.CONCRETE.getDefaultState());
    	worldIn.setBlockState(new BlockPos(player.posX - 1, player.posY + 1, player.posZ - 2), Blocks.CONCRETE.getDefaultState());
    	worldIn.setBlockState(new BlockPos(player.posX + 1, player.posY + 1, player.posZ - 2), Blocks.CONCRETE.getDefaultState());
    	worldIn.setBlockState(new BlockPos(player.posX, player.posY + 2, player.posZ - 2), Blocks.CONCRETE.getDefaultState());
    	worldIn.setBlockState(new BlockPos(player.posX - 1, player.posY + 2, player.posZ - 2), Blocks.CONCRETE.getDefaultState());
    	worldIn.setBlockState(new BlockPos(player.posX + 1, player.posY + 2, player.posZ - 2), Blocks.CONCRETE.getDefaultState());
    	worldIn.setBlockState(new BlockPos(player.posX, player.posY + 3, player.posZ), Blocks.GLOWSTONE.getDefaultState());
    	worldIn.setBlockState(new BlockPos(player.posX + 1, player.posY + 3, player.posZ), Blocks.CONCRETE.getDefaultState());
    	worldIn.setBlockState(new BlockPos(player.posX - 1, player.posY + 3, player.posZ), Blocks.CONCRETE.getDefaultState());
    	worldIn.setBlockState(new BlockPos(player.posX, player.posY + 3, player.posZ + 1), Blocks.CONCRETE.getDefaultState());
    	worldIn.setBlockState(new BlockPos(player.posX, player.posY + 3, player.posZ - 1), Blocks.CONCRETE.getDefaultState());
    	worldIn.setBlockState(new BlockPos(player.posX - 1, player.posY + 3, player.posZ - 1), Blocks.CONCRETE.getDefaultState());
    	worldIn.setBlockState(new BlockPos(player.posX - 1, player.posY + 3, player.posZ + 1), Blocks.CONCRETE.getDefaultState());
    	worldIn.setBlockState(new BlockPos(player.posX + 1, player.posY + 3, player.posZ - 1), Blocks.CONCRETE.getDefaultState());
    	worldIn.setBlockState(new BlockPos(player.posX + 1, player.posY + 3, player.posZ + 1), Blocks.CONCRETE.getDefaultState());
    }
    
    public static void randomEgg(World worldIn, BlockPos pos, Random rand) 
    {
    	switch (rand.nextInt(16))
    	{
    	case 0 : {
    		summonBlockAsDrop(pos, worldIn, ModBlocks.BLACK_EASTER_EGG);
    		break;
    	}
    	
    	case 1 : {
    		summonBlockAsDrop(pos, worldIn, ModBlocks.RED_EASTER_EGG);
    		break;
    	}
    	
    	case 2 : {
    		summonBlockAsDrop(pos, worldIn, ModBlocks.GREEN_EASTER_EGG);
    		break;
    	}
    	
    	case 3 : {
    		summonBlockAsDrop(pos, worldIn, ModBlocks.BROWN_EASTER_EGG);
    		break;
    	}
    	
    	case 4 : {
    		summonBlockAsDrop(pos, worldIn, ModBlocks.BLUE_EASTER_EGG);
    		break;
    	}
    	
    	case 5 : {
    		summonBlockAsDrop(pos, worldIn, ModBlocks.PURPLE_EASTER_EGG);
    		break;
    	}
    	
    	case 6 : {
    		summonBlockAsDrop(pos, worldIn, ModBlocks.CYAN_EASTER_EGG);
    		break;
    	}
    	
    	case 7 : {
    		summonBlockAsDrop(pos, worldIn, ModBlocks.SILVER_EASTER_EGG);
    		break;
    	}
    	
    	case 8 : {
    		summonBlockAsDrop(pos, worldIn, ModBlocks.GRAY_EASTER_EGG);
    		break;
    	}
    	
    	case 9 : {
    		summonBlockAsDrop(pos, worldIn, ModBlocks.PINK_EASTER_EGG);
    		break;
    	}
    	
    	case 10 : {
    		summonBlockAsDrop(pos, worldIn, ModBlocks.LIME_EASTER_EGG);
    		break;
    	}
    	
    	case 11 : {
    		summonBlockAsDrop(pos, worldIn, ModBlocks.YELLOW_EASTER_EGG);
    		break;
    	}
    	
    	case 12 : {
    		summonBlockAsDrop(pos, worldIn, ModBlocks.LIGHT_BLUE_EASTER_EGG);
    		break;
    	}
    	
    	case 13 : {
    		summonBlockAsDrop(pos, worldIn, ModBlocks.MAGENTA_EASTER_EGG);
    		break;
    	}
    	
    	case 14 : {
    		summonBlockAsDrop(pos, worldIn, ModBlocks.ORANGE_EASTER_EGG);
    		break;
    	}
    	
    	case 15 : {
    		summonBlockAsDrop(pos, worldIn, ModBlocks.WHITE_EASTER_EGG);
    	}
    	}
    }
    
    public static void spawnHorse(World worldIn, BlockPos pos, Random rand) 
    {
            EntityHorse e = new EntityHorse(worldIn);
            e.setPosition(pos.getX(), pos.getY(), pos.getZ());
            e.setAlwaysRenderNameTag(true);
            e.setCustomNameTag("Pegasus");
            e.setItemStackToSlot(EntityEquipmentSlot.CHEST, new ItemStack(Items.SADDLE));
            e.setItemStackToSlot(EntityEquipmentSlot.CHEST, new ItemStack(Items.DIAMOND_HORSE_ARMOR));
            worldIn.spawnEntity(e);
            
            summonItemAsDrop(pos, worldIn, new ItemStack(Items.SADDLE));
            
            switch (rand.nextInt(3))
            {
            case 0 : {
            	summonItemAsDrop(pos, worldIn, new ItemStack(Items.GOLDEN_HORSE_ARMOR));
            	break;
            }
            
            case 1 : {
            	summonItemAsDrop(pos, worldIn, new ItemStack(Items.IRON_HORSE_ARMOR));
            	break;
            }
            
            case 2 : {
            	summonItemAsDrop(pos, worldIn, new ItemStack(Items.DIAMOND_HORSE_ARMOR));
            }
            }
    }
    
	public static void setOneBlock(World worldIn, BlockPos pos, Block block) 
	{
        worldIn.setBlockState(pos, block.getDefaultState(), 2);
    }
}
