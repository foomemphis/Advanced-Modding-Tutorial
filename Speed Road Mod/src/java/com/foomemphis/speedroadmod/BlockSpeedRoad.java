package com.foomemphis.speedroadmod;

//import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class BlockSpeedRoad extends Block {

	protected BlockSpeedRoad(Material material) {
		super(material);
		//slipperiness = (float) 1.2;
		
	}
	
	
	
	//public int idDropped(int i, Random random)
	//{
		//return itemStack("speed:item.speedroad");
	//}
	
	public void onEntityWalking(World world, int p_149724_2_, int p_149724_3_, int p_149724_4_, Entity entity) {
		((EntityLivingBase) entity).addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 3));
			
	
	//public void onEntityWalking (World world, int x, int y, int z, Entity entity)
	{
		
		
		//entity.motionY += 2.0;
		//if (entity instanceof EntityLivingBase) { // If the entity is an instance of EntityLivingBase or any class that inherits from it
		//    ((EntityLivingBase) entity).addPotionEffect(null); // Cast to EntityLivingBase and call addPotionEffect
		//}
		
		//setPotionEffect(Potion.moveSpeed.id,120, 10, 1.0F);
				
	}
	
	 //public void onEntityCollidedWithBlock(World world, int i, int j, int k, Entity entity)
	    //{
	   //     entity.motionX *= 1.40000000000000002D;
	   //     entity.motionZ *= 1.40000000000000002D;
	    //}

}}
