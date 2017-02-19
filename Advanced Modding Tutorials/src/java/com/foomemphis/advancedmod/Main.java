package com.foomemphis.advancedmod;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

import com.foomemphis.advancedmod.init.ModBlocks;
import com.foomemphis.advancedmod.proxy.CommonProxy;
import com.foomemphis.advancedmod.reference.Reference;
import com.foomemphis.advancedmod.utility.Log;

@Mod(modid = Main.MODID, name = Main.MODNAME, version = Main.VERSION)
public class Main
{

	public static final String MODID = "advancedmod";
	public static final String MODNAME = "Advanced Mod";
	public static final String VERSION = "1.0.0";

	@Instance
	public static Main instance = new Main();

	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		ModBlocks.init();
		proxy.preInit();
		Log.info("Pre Initialization Complete!");
	}

	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		proxy.Init();
		Log.info("Initialization Complete!");
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		proxy.postInit();
		Log.info("Post Initialization Complete!");
	}

}
