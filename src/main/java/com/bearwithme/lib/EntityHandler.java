package com.bearwithme.lib;

import com.bearwithme.entity.*;
import com.bearwithme.handler.*;

import net.minecraft.entity.EnumCreatureType;

import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.common.BiomeDictionary.Type;

import net.minecraft.entity.monster.EntityPolarBear;
import net.minecraft.init.Biomes;

public class EntityHandler
{
    public static void init()
    {		
        EntityBlackBear.init();
        EntityGrizzlyBear.init();
        EntityPandaBear.init();
        initEntitySpawns();
	}
	
    public static void initEntitySpawns()
    {
		// Second param in addSpawn controls entity spawn rate
		// EnumCreatureType MONSTER spawns at a much higher rate than CREATURE, causing bear overspawning
		
		EntityRegistry.addSpawn(
            EntityGrizzlyBear.class, 
            ConfigurationHandler.getSpawnRateGrizzly(), 
            1, 
            3,
            EnumCreatureType.CREATURE, 
            ContentHandler.getBiomesForTypes(Type.PLAINS, Type.HILLS));
        
		EntityRegistry.addSpawn(
            EntityBlackBear.class, 
            ConfigurationHandler.getSpawnRateBlack(), 
            1, 
            3,
            EnumCreatureType.CREATURE, 
            ContentHandler.getBiomesForTypes(Type.FOREST, Type.SPOOKY));
		
		EntityRegistry.addSpawn(
            EntityPandaBear.class, 
            ConfigurationHandler.getSpawnRatePanda(), 
            1, 
            3,
            EnumCreatureType.CREATURE, 
            ContentHandler.getBiomesForTypes(Type.JUNGLE, Type.MAGICAL));
		
		EntityRegistry.removeSpawn(
            EntityPolarBear.class,
            EnumCreatureType.MONSTER,
            Biomes.ICE_PLAINS,
            Biomes.ICE_MOUNTAINS,
            Biomes.MUTATED_ICE_FLATS);
		
		EntityRegistry.addSpawn(
            EntityPolarBear.class,
            ConfigurationHandler.getSpawnRatePolar(),
            1,
            3,
            EnumCreatureType.CREATURE,
            Biomes.ICE_PLAINS,
            Biomes.MUTATED_ICE_FLATS);
	}
}