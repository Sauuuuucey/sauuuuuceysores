package com.sauuuuucey.sauuuuuceysores.config;

import net.minecraftforge.common.ForgeConfigSpec;

import com.sauuuuucey.sauuuuuceysores.SauuuuuceysOres;

/**
 * For configuration settings that change the behaviour of code on the LOGICAL SERVER.
 * This can be moved to an inner class of ExampleModConfig, but is separate because of personal preference and to keep the code organised
 *
 */
final class ServerConfig {

	final ForgeConfigSpec.BooleanValue serverEnableZincOre;
	final ForgeConfigSpec.BooleanValue serverEnableTinOre;
	final ForgeConfigSpec.BooleanValue serverEnableCopperOre;
	final ForgeConfigSpec.BooleanValue serverEnableTungstenOre;
	final ForgeConfigSpec.BooleanValue serverEnableSilverOre;
	final ForgeConfigSpec.BooleanValue serverEnablePlatinumOre;
	final ForgeConfigSpec.BooleanValue serverEnableCobaltOre;
	final ForgeConfigSpec.BooleanValue serverEnableTitaniumOre;
	final ForgeConfigSpec.BooleanValue serverEnableSulfurOre;
	final ForgeConfigSpec.BooleanValue serverEnableSaltpeterOre;

	ServerConfig(final ForgeConfigSpec.Builder builder) {
		builder.push("general");
		serverEnableZincOre = builder
				.comment("Enable Zinc Ore generation?")
				.translation(SauuuuuceysOres.MODID + ".config.serverEnableZincOre")
				.define("serverEnableZincOre", true);
		serverEnableTinOre = builder
				.comment("Enable Tin Ore generation?")
				.translation(SauuuuuceysOres.MODID + ".config.serverEnableTinOre")
				.define("serverEnableTinOre", true);
		serverEnableCopperOre = builder
				.comment("Enable Copper Ore generation?")
				.translation(SauuuuuceysOres.MODID + ".config.serverEnableCopperOre")
				.define("serverEnableCopperOre", true);
		serverEnableTungstenOre = builder
				.comment("Enable Tungsten Ore generation?")
				.translation(SauuuuuceysOres.MODID + ".config.serverEnableTungstenOre")
				.define("serverEnableTungstenOre", true);
		serverEnableSilverOre = builder
				.comment("Enable Silver Ore generation?")
				.translation(SauuuuuceysOres.MODID + ".config.serverEnableSilverOre")
				.define("serverEnableSilverOre", true);
		serverEnablePlatinumOre = builder
				.comment("Enable Platinum Ore generation?")
				.translation(SauuuuuceysOres.MODID + ".config.serverEnablePlatinumOre")
				.define("serverEnablePlatinumOre", true);
		serverEnableCobaltOre = builder
				.comment("Enable Cobalt Ore generation?")
				.translation(SauuuuuceysOres.MODID + ".config.serverEnableCobaltOre")
				.define("serverEnableCobaltOre", true);
		serverEnableTitaniumOre = builder
				.comment("Enable Titanium Ore generation?")
				.translation(SauuuuuceysOres.MODID + ".config.serverEnableTitaniumOre")
				.define("serverEnableTitaniumOre", true);
		serverEnableSulfurOre = builder
				.comment("Enable Sulfur Ore generation?")
				.translation(SauuuuuceysOres.MODID + ".config.serverEnableSulfurOre")
				.define("serverEnableSulfurOre", true);
		serverEnableSaltpeterOre = builder
				.comment("Enable Saltpeter Ore generation?")
				.translation(SauuuuuceysOres.MODID + ".config.serverEnableSaltpeterOre")
				.define("serverEnableSaltpeterOre", true);
		builder.pop();
	}

}