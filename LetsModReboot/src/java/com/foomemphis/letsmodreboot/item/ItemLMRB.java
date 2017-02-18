//Allgemeine Itemklasse die "Item" (Minecraftklasse) ummantelt und dadurch gewissen Funktionen erlaubt andere zu "�berschreiben" (ersetzen)

package com.foomemphis.letsmodreboot.item;

import com.foomemphis.letsmodreboot.creativetab.CreativeTabLMRB;
import com.foomemphis.letsmodreboot.reference.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemLMRB extends Item
{
	public ItemLMRB()
	{
		super();
		this.setCreativeTab(CreativeTabLMRB.LMRB_TAB);
	}
	
	@Override
	public String getUnlocalizedName()
	{
		return String.format("item.%s%s", Reference.MODID.toLowerCase() + ":",getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
	}
	
	@Override
	public String getUnlocalizedName(ItemStack itemStack)
	{
		return String.format("item.%s%s", Reference.MODID.toLowerCase() + ":",getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
		// Minecraft findet Items in der Form item.modid:itemname.name
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void  registerIcons (IIconRegister iconRegister)
	{
		itemIcon = iconRegister.registerIcon(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
	}
	
	protected String getUnwrappedUnlocalizedName(String unlocalizedName)
	{
		return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
	}
}
