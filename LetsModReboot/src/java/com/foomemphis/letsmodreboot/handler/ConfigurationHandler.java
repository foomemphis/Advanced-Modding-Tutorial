package com.foomemphis.letsmodreboot.handler;

import java.io.File;

import com.foomemphis.letsmodreboot.reference.Reference;

import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;

public class ConfigurationHandler
{
	public static Configuration configuration;
	public static boolean testValue = false;
	
	public static void init(File configFile)
	{
		//Configfiles erzeugen die Nutzern helfen leicht gewisse Variablen zu �ndern ohne auf den Code Zugriff haben zu m�ssen.
		// Create the configuration object from the given configuration file (von Forge)
		if (configuration == null)
		{
			configuration = new Configuration(configFile);
			loadConfiguration();
		}
	}
	@SubscribeEvent
	public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event)
	{
		if (event.modID.equalsIgnoreCase(Reference.MODID))
		{
			//Resync configs
			
		}
	}
	
	private static void loadConfiguration()
	{
		testValue = configuration.getBoolean("configValue", Configuration.CATEGORY_GENERAL, false, "This is an example configuration value");
		
		if (configuration.hasChanged())
		{
			configuration.save();
		}
	}
}
