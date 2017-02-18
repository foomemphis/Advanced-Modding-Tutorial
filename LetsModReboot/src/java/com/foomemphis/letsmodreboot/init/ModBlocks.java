package com.foomemphis.letsmodreboot.init;

import com.foomemphis.letsmodreboot.block.BlockFlag;
import com.foomemphis.letsmodreboot.block.BlockLMRB;
import com.foomemphis.letsmodreboot.reference.Reference;

import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MODID) 
// ObjectHolder "This is an Instance for my MOD, no other MODs are allowed to tinker with my Blocks"
// My own MOD Version is my own and will not get changed, but other Mods can use the general version (glaub ich)
// gute Absicherung um Codesalat zu vermeiden
public class ModBlocks
{
	public static final BlockLMRB flag = new BlockFlag();
	
	public static void init()
	{
		GameRegistry.registerBlock(flag, "flag");
	}
}
