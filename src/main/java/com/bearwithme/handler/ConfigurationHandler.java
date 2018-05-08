package com.bearwithme.handler;

import java.io.File;

import net.minecraftforge.common.config.Configuration;

public class ConfigurationHandler {

    private static Configuration config = null;
	
	public static void initConfig(File file)
	{
	    setConfig(new Configuration(file));
	    syncConfig();
	}

	public static void setConfig(Configuration config)
	{
	    ConfigurationHandler.config = config;
	}

	public static Configuration getConfig()
	{
	    return config;
	}

	public static void syncConfig()
	{ 
		setSpawnRateGrizzly(getConfig().getInt("spawnRateGrizzly", Configuration.CATEGORY_GENERAL, 10, 0, 100, "Set Spawn Rate for Grizzly Bears"));
		setSpawnRateBlack(getConfig().getInt("spawnRateBlack", Configuration.CATEGORY_GENERAL, 10, 0, 100, "Set Spawn Rate for Black Bears"));
		setSpawnRatePanda(getConfig().getInt("spawnRatePanda", Configuration.CATEGORY_GENERAL, 10, 0, 100, "Set Spawn Rate for Panda Bears"));
		setSpawnRatePolar(getConfig().getInt("spawnRatePolar", Configuration.CATEGORY_GENERAL, 10, 0, 100, "Set Spawn Rate for Polar Bears"));
		
		if (getConfig().hasChanged())
			getConfig().save();
	}

	private static int spawnRateGrizzly;
	private static int spawnRateBlack;
	private static int spawnRatePanda;
	private static int spawnRatePolar;

	private static void setSpawnRateGrizzly(int spawnRateGrizzly)
	{
		ConfigurationHandler.spawnRateGrizzly =	spawnRateGrizzly;
	}

	public static int getSpawnRateGrizzly()
	{
		return spawnRateGrizzly;
	}
	
	private static void setSpawnRateBlack(int spawnRateBlack)
	{
		ConfigurationHandler.spawnRateBlack = spawnRateBlack;
	}

	public static int getSpawnRateBlack()
	{
		return spawnRateBlack;
	}
	
	private static void setSpawnRatePanda(int spawnRatePanda)
	{
		ConfigurationHandler.spawnRatePanda = spawnRatePanda;
	}

	public static int getSpawnRatePanda()
	{
		return spawnRatePanda;
	}
	
	private static void setSpawnRatePolar(int spawnRatePolar)
	{
		ConfigurationHandler.spawnRatePolar = spawnRatePolar;
	}

	public static int getSpawnRatePolar()
	{
		return spawnRatePolar;
	}

}
