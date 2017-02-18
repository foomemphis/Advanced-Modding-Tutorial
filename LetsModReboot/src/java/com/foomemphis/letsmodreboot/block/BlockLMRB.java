package com.foomemphis.letsmodreboot.block;

import com.foomemphis.letsmodreboot.creativetab.CreativeTabLMRB;
import com.foomemphis.letsmodreboot.reference.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;

public class BlockLMRB extends Block
{

	//Spezielle Definition
	public BlockLMRB(Material material)
	{
		super(material);
		this.setCreativeTab(CreativeTabLMRB.LMRB_TAB);
	}

	
	//Allgemeine Definition
	public BlockLMRB()
	{
		this(Material.rock);
	}
	
	@Override
	// Block Name setzen
	public String getUnlocalizedName()
	{
		return String.format("tile.%s%s", Reference.MODID.toLowerCase() + ":",getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
		// Minecraft findet blocks anhand von tile.modid:blockname.name
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	// Block Textur setzen
	public void  registerBlockIcons (IIconRegister iconRegister)
	{
		blockIcon = iconRegister.registerIcon(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
	}
	
	protected String getUnwrappedUnlocalizedName(String unlocalizedName)
	{
		return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
	}
	
}
