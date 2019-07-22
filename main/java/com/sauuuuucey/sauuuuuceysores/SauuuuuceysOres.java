package com.sauuuuucey.sauuuuuceysores;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.sauuuuucey.sauuuuuceysores.config.ConfigHolder;

import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;

@Mod("sauuuuuceysores")
public class SauuuuuceysOres 
{
	public static final String MODID = "sauuuuuceysores";
	private static final Logger LOGGER = LogManager.getLogger(MODID);
	
	public SauuuuuceysOres() {
		
		LOGGER.info("Hello from Sauuuuucey's Ores!");
		final ModLoadingContext modLoadingContext = ModLoadingContext.get();
		
		modLoadingContext.registerConfig(ModConfig.Type.SERVER,	ConfigHolder.SERVER_SPEC);
	}

}
