package com.foomemphis.letsmodreboot.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

public class Recipes
{
	public static void init()
	{
		// Vanilla Shaped 
		
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.mapleLeaf), " s ", "sss"," s ",'s', new ItemStack(Items.stick));
		
		// .addRecipe bedeutet immer Shaped "Standard"
		// erster Parameter ist der Output 
		// danach jede einzelne Zeile:
		// 1. Reihe " s " Craftingfenster obere Reihe
		// 2. Reihe "sss" Craftingfenster mittlere Reihe
		// 3. Reihe " s " Craftingfenster untere Reihe
		// danach wof�r steht der zugewiesene Buchstabe
		// 's' Zuweisung das in DIESEM (!!) Rezept "s" f�r einen Vanilla Stick steht
		// Leerzeichen steht f�r ein leeres Feld im Craftingfenster
		
		// Vanilla Shapeless
		
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.flag), new ItemStack(ModItems.mapleLeaf), new ItemStack(ModItems.mapleLeaf));
		
		// anderer Aufbau als bei Shaped, denn die Anordnung ist nicht von belang
		// zuerst Output
		// danach Eintr�ge f�r die m�glichen Inputs ( hier ergeben 2 MapleLeaf's einen Flaggen Block )
		
		// Shaped Ore Recipe
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.mapleLeaf), " s ", "sss"," s ",'s', "stickWood"));
		// statt ein ItemStack Rezept zu verwenden kann man so ein OreDictionary Rezept verwenden
		// hier w�rde also jedes Item das im OreDictionary unter Stick registriert ist dazu verwendet werden k�nnen unser MapleLeaf zu craften.
				
		// Shapeless Ore Recipe
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModBlocks.flag), "stickWood" , new ItemStack(ModItems.mapleLeaf)));
		// statt ein ItemStack Rezept zu verwenden kann man so ein OreDictionary Rezept verwenden
		// hier w�rde also ein Item das im OreDictionary unter Stick registriert ist zusammen mit einem MapleLeaf dazu verwendet werden kann einen FlaggenBlock zu craften.
	}
}
