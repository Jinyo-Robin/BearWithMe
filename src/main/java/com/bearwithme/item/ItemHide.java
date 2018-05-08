package com.bearwithme.item;

import com.bearwithme.lib.ItemHandler;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;

public class ItemHide extends Item {

	public static String ID = "hide";
	public static String[] variants = new String[]
	{
		"bear_black",
		"bear_grizzly",
		"bear_panda",
		"bear_polar"
	};

	public ItemHide()
	{
		super();
		setHasSubtypes(true);
		ItemHandler.registerItem(this, ID);
	}
	
    @Override
	public int getMetadata (int damage)
	{
        return damage;
    }
	
    @Override
	public void getSubItems(CreativeTabs tab, NonNullList<ItemStack> subItems)
	{
		if (isInCreativeTab(tab))
		{
			for (int meta = 0; meta < variants.length; meta++)
			{
    			subItems.add(new ItemStack(this, 1, meta));
    		}
    	}
    }
	
	@Override
	public String getUnlocalizedName (ItemStack stack)
	{
		final int meta = stack.getMetadata();
		if (!(meta >= 0 && meta < variants.length))
		{
			return super.getUnlocalizedName() + "." + variants[0];
		}
		return super.getUnlocalizedName() + "." + variants[meta];
	}		
}
