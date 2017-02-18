package com.foomemphis.speedroadmod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;


@Mod(modid = "speed", name = "Speedroad Mod", version = "0.5")

public class SpeedroadMod {
	
	public static Item itemSpeedRoad;
	public static Item itemRoad;
	
	public static Block blockSpeedRoad;
	
	
	
	
	
	
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		// Item/Block init and registering
		//Config handling
		
		
		// items
		//itemTable = new ItemTable().setUnlocalizedName("itemTable").setTextureName("fit:itemtable").setCreativeTab(tabTutorialMod);
		itemSpeedRoad = new ItemSpeedRoad().setUnlocalizedName("itemSpeedRoad").setTextureName("speed:itemspeedroad").setCreativeTab(tabSpeedRoadMod);;
		itemRoad = new ItemRoad().setUnlocalizedName("itemRoad").setTextureName("speed:itemroad").setCreativeTab(tabSpeedRoadMod);;
		// items
	
		//tools and weapons
		//beim Klassen erschaffen .item dahinter um in ein eigenes Package zu verschieben!
		//cheesePickaxe = new ItemCheesePickaxe(cheeseToolMaterial).setUnlocalizedName("CheesePickaxe").setTextureName("fit:itemcheesepickaxe").setCreativeTab(tabTutorialMod);
		
		blockSpeedRoad = new BlockSpeedRoad(Material.ground).setBlockName("BlockSpeedRoad").setBlockTextureName("speed:blockspeedroad").setCreativeTab(tabSpeedRoadMod);
		
		
		//armor
		//cheeseHelmet = new ItemCheeseArmor(cheeseArmorMaterial, 0, 0).setUnlocalizedName("CheeseHelmet").setTextureName("fit:itemcheesehelmet").setCreativeTab(tabTutorialMod);
		
		// blocks Properties in BlockTable.java
		//blockTable = new BlockTable(Material.wood).setBlockName("BlockTable").setBlockTextureName("fit:blocktable").setCreativeTab(tabTutorialMod);
		// blocks
		
		// foods: X * 0,5 = 10 Hunger mehr gibt es nicht in Minecraft -> also 20 maximal, auch 1.0 F max -> cheese also superfood
		//itemCheese = new ItemFood(4, 0.2F, false).setUnlocalizedName("itemCheese").setTextureName("fit:itemcheese").setCreativeTab(tabTutorialMod);
			
		
		//GameRegistry Bereich
		
		GameRegistry.registerBlock(blockSpeedRoad, blockSpeedRoad.getUnlocalizedName().substring(5));
		
		GameRegistry.registerItem(itemSpeedRoad,itemSpeedRoad.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(itemRoad, itemRoad.getUnlocalizedName().substring(5));
		
		//GameRegistry.registerItem(itemTable, itemTable.getUnlocalizedName().substring(5) );
		//GameRegistry.registerBlock(blockTable, blockTable.getUnlocalizedName().substring(5));
		//GameRegistry.addSmelting(itemCheese, new ItemStack(itemGrilledCheese), 5.0F);
		//GameRegistry.registerWorldGenerator(new CheeseGeneration(), 0); //integriert unsere OreGeneration Klasse
		
		//tools
		//GameRegistry.registerItem(cheeseSword, cheeseSword.getUnlocalizedName().substring(5) );
		
		//armor
		//GameRegistry.registerItem(cheeseHelmet, cheeseHelmet.getUnlocalizedName().substring(5) );
		
		GameRegistry.addSmelting(itemRoad, new ItemStack(itemSpeedRoad, 2), 5.0F);
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
		//Proxy, TileEntity, entity, GUI and Packet Registering
		//Buchstabenzuweisungen wirken sich nur auf das jeweilige Rezept aus - NICHT global
		//GameRegistry.addRecipe(new ItemStack(itemTable), new Object[]{"WWW",
		//	                                                          " W ",
		//	                                                          " W ", 'W', Blocks.planks});
		//GameRegistry.addRecipe(new ItemStack(blockTable, 10), new Object[]{"BBB"," B "," B ", 'B', Blocks.log});
		//wenn eine Spalte durchgehend nur aus Leerzeichen bestehen w�rde, kann man diese einfach weglassen, 
		//dadurch l�sst sich das Rezept �berall herstellen, nicht nur in der Mitte des Craftingtables

		GameRegistry.addRecipe(new ItemStack(itemRoad, 2), new Object[]{"CC","GG",'C', Items.clay_ball, 'G', Blocks.gravel});
		GameRegistry.addRecipe(new ItemStack(blockSpeedRoad, 4), new Object[]{"II","II",'I', (itemSpeedRoad)});
		
		
	}
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		
	}
	
	public static CreativeTabs tabSpeedRoadMod = new CreativeTabs("tabSpeedRoadMod"){
		@Override 
		public Item getTabIconItem(){
			return new ItemStack(itemSpeedRoad).getItem();
		}
	};
}

