package com.bearwithme.lib;


import net.minecraft.world.storage.loot.LootTableList;
import net.minecraft.world.storage.loot.LootPool;
import net.minecraft.world.storage.loot.LootEntryItem;
import net.minecraft.world.storage.loot.functions.LootFunction;
import net.minecraft.world.storage.loot.functions.SetCount;
import net.minecraft.world.storage.loot.functions.SetMetadata;
import net.minecraft.world.storage.loot.conditions.LootCondition;
import net.minecraft.world.storage.loot.RandomValueRange;

import net.minecraftforge.event.LootTableLoadEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class LootHandler
{
    @SubscribeEvent
    public void onLootTablesLoaded(LootTableLoadEvent event)
    {
        // EntityPolarBear
        if (event.getName().equals(LootTableList.ENTITIES_POLAR_BEAR))
        {   
            final LootPool main = event.getTable().getPool("main");
            if (main != null)
            {
                main.addEntry(new LootEntryItem(
                    ItemHandler.itemHide,
                    4,
                    0,
                    new LootFunction[]
                    {
                        new SetCount(new LootCondition[0], new RandomValueRange(1, 4)), 
                        new SetMetadata(new LootCondition[0], new RandomValueRange(3, 3))
                    },
                    new LootCondition[0],
                    "loottable:polar_bear_hide"));
            }
        }
    }
}
