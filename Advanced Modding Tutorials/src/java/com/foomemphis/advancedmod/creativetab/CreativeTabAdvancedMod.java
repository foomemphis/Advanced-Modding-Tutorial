package com.foomemphis.advancedmod.creativetab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import com.foomemphis.advancedmod.init.ModItems;
import com.foomemphis.advancedmod.reference.Reference;

public class CreativeTabAdvancedMod
{
	public static final CreativeTabs AdvancedMod_TAB = new CreativeTabs(
			Reference.MODID.toLowerCase())
	{
		@Override
		public Item getTabIconItem()
		{
			return ModItems.mapleLeaf;
		}

	};

}
