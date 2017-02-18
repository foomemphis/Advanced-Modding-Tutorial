package com.foomemphis.letsmodreboot;

import com.foomemphis.letsmodreboot.client.handler.KeyInputEventHandler;
import com.foomemphis.letsmodreboot.handler.ConfigurationHandler;
import com.foomemphis.letsmodreboot.init.ModBlocks;
import com.foomemphis.letsmodreboot.init.ModItems;
import com.foomemphis.letsmodreboot.init.Recipes;
import com.foomemphis.letsmodreboot.proxy.IProxy;
import com.foomemphis.letsmodreboot.reference.*;
import com.foomemphis.letsmodreboot.utility.LogHelper;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MODID, name = Reference.MODNAME, version = Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class Main {

	 		        
	    @Mod.Instance
	    public static Main instance;

	    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	    // Objektdefinition IProxy proxy; Client und Serverversionen dar�ber eingebunden
	    public static IProxy proxy;
	     
	    @EventHandler
	    public void preInit(FMLPreInitializationEvent event) 
	    {
	    	ConfigurationHandler.init(event.getSuggestedConfigurationFile());
	    	FMLCommonHandler.instance().bus().register(new ConfigurationHandler());
	    	
	    	proxy.registerKeyBindings();
	    	
	    	ModItems.init();
	    	
	    	ModBlocks.init();
	    	
	    	
	    	LogHelper.info("Pre Initialization Complete!");
	    }
	        
	    @EventHandler
	    public void init(FMLInitializationEvent event) 
	    {
	    	FMLCommonHandler.instance().bus().register(new KeyInputEventHandler());
	    	Recipes.init();
	    	LogHelper.info("Initialization Complete!");
	    }
	        
	    @EventHandler
	    public void postInit(FMLPostInitializationEvent event) 
	    {
	    	LogHelper.info("Post Initialization Complete!");	
	    }
	
	    
	    
	    
}
