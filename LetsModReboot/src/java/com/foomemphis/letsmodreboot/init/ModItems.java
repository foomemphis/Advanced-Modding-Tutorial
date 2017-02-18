package com.foomemphis.letsmodreboot.init;

import com.foomemphis.letsmodreboot.item.ItemLMRB;
import com.foomemphis.letsmodreboot.item.ItemMapleLeaf;

import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems
{
	public static final ItemLMRB mapleLeaf = new ItemMapleLeaf();
	
	public static void init()
	{
		GameRegistry.registerItem(mapleLeaf, "mapleLeaf");
	}
}
