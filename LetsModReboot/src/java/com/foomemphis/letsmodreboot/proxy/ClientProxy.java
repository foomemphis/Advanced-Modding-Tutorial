package com.foomemphis.letsmodreboot.proxy;

import com.foomemphis.letsmodreboot.client.settings.Keybindings;

import cpw.mods.fml.client.registry.ClientRegistry;

public class ClientProxy extends CommonProxy
{
	@Override
	public void registerKeyBindings()
	{
		// Keybindings registrieren (nur auf Clientseite)
		// zuerst Name eintragen
		ClientRegistry.registerKeyBinding(Keybindings.charge);
		ClientRegistry.registerKeyBinding(Keybindings.release);
	}
}
