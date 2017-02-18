package com.foomemphis.letsmodreboot.creativetab;

import com.foomemphis.letsmodreboot.reference.Reference;
import com.foomemphis.letsmodreboot.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabLMRB
{
	public static final CreativeTabs LMRB_TAB = new CreativeTabs(Reference.MODID.toLowerCase())
	{
		@Override
		public Item getTabIconItem()
		{
			return ModItems.mapleLeaf;
		}
					
	};
}





