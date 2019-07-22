package com.sauuuuucey.sauuuuuceysores.config;

import net.minecraftforge.fml.config.ModConfig;

/**
 * This bakes the config values to normal fields
 *
 * It can be merged into the main ExampleModConfig class, but is separate because of personal preference and to keep the code organised
 */
public final class ConfigHelper {

	// We store a reference to the ModConfigs here to be able to change the values in them from our code
	// (For example from a config GUI)
	
	private static ModConfig serverConfig;
	
	public static void bakeServer(final ModConfig config) {
		serverConfig = config;

		SauuuuuceysOresConfig.enableZinc = ConfigHolder.SERVER.serverEnableZincOre.get();
		SauuuuuceysOresConfig.enableTin = ConfigHolder.SERVER.serverEnableTinOre.get();
		SauuuuuceysOresConfig.enableCopper = ConfigHolder.SERVER.serverEnableCopperOre.get();
		SauuuuuceysOresConfig.enableTungsten = ConfigHolder.SERVER.serverEnableTungstenOre.get();
		SauuuuuceysOresConfig.enableSilver = ConfigHolder.SERVER.serverEnableSilverOre.get();
		SauuuuuceysOresConfig.enablePlatinum = ConfigHolder.SERVER.serverEnablePlatinumOre.get();
		SauuuuuceysOresConfig.enableCobalt = ConfigHolder.SERVER.serverEnableCobaltOre.get();
		SauuuuuceysOresConfig.enableTitanium = ConfigHolder.SERVER.serverEnableTitaniumOre.get();
		SauuuuuceysOresConfig.enableSulfur = ConfigHolder.SERVER.serverEnableSulfurOre.get();
		SauuuuuceysOresConfig.enableSaltpeter = ConfigHolder.SERVER.serverEnableSaltpeterOre.get();
		
	}

	private static void setValueAndSave(final ModConfig modConfig, final String path, final Object newValue) {
		modConfig.getConfigData().set(path, newValue);
		modConfig.save();
	}

}