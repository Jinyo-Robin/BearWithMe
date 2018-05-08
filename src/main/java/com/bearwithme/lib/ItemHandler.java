package com.bearwithme.lib;

import java.util.ArrayList;
import java.util.List;

import com.bearwithme.item.*;

import net.minecraft.item.Item;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.registries.GameData;

public class ItemHandler
{
    /**
     * A list of all items from BearWithMe.
     */
    public static final List<Item> ITEMS = new ArrayList<>();

    public static Item itemHide;

    public static void init()
	{
		itemHide = new ItemHide();
    }

    public static Item registerItem(Item item, String ID)
    {
		if (item.getRegistryName() == null) {
            item.setRegistryName(ID);
        }
        item.setUnlocalizedName(Constants.MOD_ID + "." + ID.toLowerCase().replace("_", "."));
        item.setCreativeTab(ContentHandler.CREATIVE_TAB);

        GameData.register_impl(item);
        ITEMS.add(item);
        return item;
    }

    @SideOnly(Side.CLIENT)
    public static void initOnClient()
    {
		registerItemInvModel(itemHide, ItemHide.ID, ItemHide.variants);
    }

    /**
     * Registers inventory models for an item.
     *
     * @param item The item to registers a model for.
     */
    @SideOnly(Side.CLIENT)
    public static void registerItemInvModel(Item item)
    {
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName().toString(), "inventory"));
    }

    /**
     * Registers inventory models for an item that uses meta data.
     *
     * @param item The item to register a model for.
     * @param variants The names of the models to use, in order of meta data.
     */
    @SideOnly(Side.CLIENT)
    public static void registerItemInvModel(Item item, String[] variants)
    {
        for (int meta = 0; meta < variants.length; meta++)
        {
            ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(item.getRegistryName().getResourceDomain() + ":" + variants[meta], "inventory"));
        }
    }

    /**
     * Registers inventory models for an item that uses meta data.
     *
     * @param item The item to register a model for.
     * @param prefix A prefix to use on the variant names.
     * @param variants The names of the models to use, in order of meta data.
     */
    @SideOnly(Side.CLIENT)
    public static void registerItemInvModel(Item item, String prefix, String[] variants)
    {
        for (int meta = 0; meta < variants.length; meta++)
        {
            ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(item.getRegistryName().getResourceDomain() + ":" + prefix + "_" + variants[meta], "inventory"));
        }
    }

    /**
     * Registers inventory models for an item.
     *
     * @param item The item to registers a model for.
     * @param meta The meta data to register the model for.
     */
    @SideOnly(Side.CLIENT)
    public static void registerItemInvModel(Item item, int meta)
    {
        ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(item.getRegistryName().toString(), "inventory"));
    }

    /**
     * Registers inventory models for an item.
     *
     * @param item The item to register a model for.
     * @param meta The meta data to register the model for.
     * @param model The name of the model to register.
     */
    @SideOnly(Side.CLIENT)
    public static void registerItemInvModel(Item item, int meta, String model)
    {
        ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(model, "inventory"));
    }








}