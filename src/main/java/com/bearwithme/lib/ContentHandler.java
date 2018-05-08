package com.bearwithme.lib;

import java.util.ArrayList;
import java.util.Collection;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.world.biome.Biome;

import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ContentHandler {

	// Handle GUI

	public static final CreativeTabs CREATIVE_TAB = new CreativeTabs("BearWithMe")
	{
		@SideOnly(Side.CLIENT)	
		public ItemStack getTabIconItem() {
	   		return new ItemStack(ItemHandler.itemHide);
	   	}
	};

	// Handle Blocks

	public static void initBlocks () {	
	}
	
	// Handle Recipes

	public static void initRecipes() {			
	}
	
	// Handle Biomes

	public static Biome[] getBiomesForTypes(Type... types)
	{
		final Collection<Biome> biomes = new ArrayList<>();
		for (final Type type : types)
		{
			biomes.addAll(BiomeDictionary.getBiomes(type));
		}
		return biomes.toArray(new Biome[0]);
	}

}
