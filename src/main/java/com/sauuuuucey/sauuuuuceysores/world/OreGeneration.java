package com.sauuuuucey.sauuuuuceysores.world;

import com.sauuuuucey.sauuuuuceysores.config.SauuuuuceysOresConfig;
import com.sauuuuucey.sauuuuuceysores.init.ModBlocks;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.registries.ForgeRegistries;

public class OreGeneration 
{
	private static final CountRangeConfig zinc_placement = new CountRangeConfig(20, 1, 1, 218);
	private static final int zinc_size = 10;
	private static final CountRangeConfig tin_placement = new CountRangeConfig(20, 1, 1, 218);
	private static final int tin_size = 10;
	private static final CountRangeConfig copper_placement = new CountRangeConfig(20, 1, 1, 96);
	private static final int copper_size = 10;
	private static final CountRangeConfig tungsten_placement = new CountRangeConfig(8, 1, 1, 48);
	private static final int tungsten_size = 8;
	private static final CountRangeConfig silver_placement = new CountRangeConfig(5, 1, 1, 32);
	private static final int silver_size = 7;
	private static final CountRangeConfig platinum_placement = new CountRangeConfig(3, 1, 1, 32);
	private static final int platinum_size = 6;
	private static final CountRangeConfig cobalt_placement = new CountRangeConfig(3, 1, 1, 32);
	private static final int cobalt_size = 6;
	private static final CountRangeConfig titanium_placement = new CountRangeConfig(2, 1, 1, 16);
	private static final int titanium_size = 4;
	private static final CountRangeConfig sulfur_placement = new CountRangeConfig(10, 1, 1, 64);
	private static final int sulfur_size = 6;
	private static final CountRangeConfig saltpeter_placement = new CountRangeConfig(10, 1, 1, 64);
	private static final int saltpeter_size = 6;
	
	public static void setupOreGeneration() {
		
		for(Biome biome : ForgeRegistries.BIOMES)
			{
			if (SauuuuuceysOresConfig.enableZinc) {
				biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, ModBlocks.zinc_ore.getDefaultState(), zinc_size), Placement.COUNT_RANGE, zinc_placement));
			}
			if (SauuuuuceysOresConfig.enableTin) {
				biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, ModBlocks.tin_ore.getDefaultState(), tin_size), Placement.COUNT_RANGE, tin_placement));
			}
			if (SauuuuuceysOresConfig.enableCopper) {
				biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, ModBlocks.copper_ore.getDefaultState(), copper_size), Placement.COUNT_RANGE, copper_placement));
			}
			if (SauuuuuceysOresConfig.enableTungsten) {
				biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, ModBlocks.tungsten_ore.getDefaultState(), tungsten_size), Placement.COUNT_RANGE, tungsten_placement));
			}
			if (SauuuuuceysOresConfig.enableSilver) {
				biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, ModBlocks.silver_ore.getDefaultState(), silver_size), Placement.COUNT_RANGE, silver_placement));
			}
			if (SauuuuuceysOresConfig.enablePlatinum) {
				biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, ModBlocks.platinum_ore.getDefaultState(), platinum_size), Placement.COUNT_RANGE, platinum_placement));
			}
			if (SauuuuuceysOresConfig.enableCobalt) {
				biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, ModBlocks.cobalt_ore.getDefaultState(), cobalt_size), Placement.COUNT_RANGE, cobalt_placement));
			}
			if (SauuuuuceysOresConfig.enableSulfur) {
				biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, ModBlocks.sulfur_ore.getDefaultState(), sulfur_size), Placement.COUNT_RANGE, sulfur_placement));
			}
			if (SauuuuuceysOresConfig.enableSaltpeter) {
				biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, ModBlocks.saltpeter_ore.getDefaultState(), saltpeter_size), Placement.COUNT_RANGE, saltpeter_placement));
			}
		}
	}
	
}

