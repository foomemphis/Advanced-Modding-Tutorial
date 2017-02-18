package com.foomemphis.letsmodreboot.client.settings;

import net.minecraft.client.settings.KeyBinding;

import org.lwjgl.input.Keyboard;

import com.foomemphis.letsmodreboot.reference.Names;

public class Keybindings
{
	public static KeyBinding charge = new KeyBinding(Names.Keys.CHARGE, Keyboard.KEY_C, Names.Keys.CATEGORY);
	// Keybinding name charge - Objekt und Kategorie werden zugewiesen - LWJGL weist Keys gewissen Values zu KEY_C ist also der ASCII Code den die Taste C erzeugt.
	
	public static KeyBinding release = new KeyBinding(Names.Keys.RELEASE, Keyboard.KEY_R, Names.Keys.CATEGORY);
	// weist der geschaffenen Releasefunktion das Keybinding R zu - kann auch weiter unter "release" referenziert werden 
	// unabh�ngig ob der Spieler die Belegung in seinem Client von R auf z.B. Q legt.
}
