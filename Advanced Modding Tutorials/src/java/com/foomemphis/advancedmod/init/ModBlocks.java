package com.foomemphis.advancedmod.init;

import com.foomemphis.advancedmod.block.BlockAdvancedMod;
import com.foomemphis.advancedmod.block.BlockDutchFlag;

import cpw.mods.fml.common.registry.GameRegistry;

public class ModBlocks
{
	public static final BlockAdvancedMod flag = new BlockDutchFlag();

	public static void init()
	{
		GameRegistry.registerBlock(flag, "flag");
	}
}
