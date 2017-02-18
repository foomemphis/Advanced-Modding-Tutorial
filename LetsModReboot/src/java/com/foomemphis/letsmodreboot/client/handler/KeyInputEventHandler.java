package com.foomemphis.letsmodreboot.client.handler;

import com.foomemphis.letsmodreboot.client.settings.Keybindings;
import com.foomemphis.letsmodreboot.reference.Key;
import com.foomemphis.letsmodreboot.utility.LogHelper;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.InputEvent;

public class KeyInputEventHandler
{
	private static Key getPressedKeybinding()
	{
		// wird ausgef�hrt wenn ein Key gedr�ckt wird und gibt zur�ck welche Funktion damit ausgel�st werden soll
		// (kann nicht einfach auf key abgestellt werden, sonst w�rde bei einer Tastenumbelegung mist rumkommen)
		if (Keybindings.charge.isPressed())
		{
			return Key.CHARGE;
		}
		// wird ein Key gedr�ckt der Charge ausl�sen soll gib die Info an uns weiter
		else if (Keybindings.release.isPressed())
		{
			return Key.RELEASE;
		}
		// wird ein Key gedr�ckt der Release ausl�sen soll gib die Info an uns weiter
		return Key.UNKNOWN;
		// wenn wir nichts mit dem Key anfangen k�nnen dann Unknown funktion
	}
	
	@SubscribeEvent
	public void handleKeyInputEvent(InputEvent.KeyInputEvent event)
	{
		// when a key is pressed it will execute this Function
		// KeyInputEvent extends InputEvent gibt sonst keine Infos
		LogHelper.info(getPressedKeybinding());
	}
}
