package com.foomemphis.letsmodreboot.client.gui;

import com.foomemphis.letsmodreboot.handler.ConfigurationHandler;
import com.foomemphis.letsmodreboot.reference.Reference;

import cpw.mods.fml.client.config.GuiConfig;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;


public class ModGuiConfig extends GuiConfig
{

	public ModGuiConfig (GuiScreen guiScreen)
	{
		super(guiScreen,
				new ConfigElement (ConfigurationHandler.configuration.getCategory(Configuration.CATEGORY_GENERAL)).getChildElements(), 
									// für dieses ConfigurationElement nimm ConfigObjekt bla und auch alle Child Elemente
				Reference.MODID,  	// unsere MOD ID 
				false,				// requires world restart if something changed? false
				false,				// requires minecraft restart if something changed? false
				GuiConfig.getAbridgedConfigPath(ConfigurationHandler.configuration.toString()));
									// Title des Config Objekt 
		
	}
}
