package com.sauuuuucey.sauuuuuceysores;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.google.common.base.Preconditions;
import com.sauuuuucey.sauuuuuceysores.config.ConfigHelper;
import com.sauuuuucey.sauuuuuceysores.config.ConfigHolder;
import com.sauuuuucey.sauuuuuceysores.init.ModGroup;
import com.sauuuuucey.sauuuuuceysores.lists.ModToolMaterials;
import com.sauuuuucey.sauuuuuceysores.world.OreGeneration;

import net.minecraft.block.Block;
import net.minecraft.block.OreBlock;
import net.minecraft.block.material.Material;
import net.minecraft.item.AxeItem;
import net.minecraft.item.BlockItem;
import net.minecraft.item.HoeItem;
import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.registries.IForgeRegistryEntry;

@EventBusSubscriber(modid = SauuuuuceysOres.MODID, bus = EventBusSubscriber.Bus.MOD)
public class ModEventSubscriber 
{
	private static final Logger LOGGER = LogManager.getLogger(SauuuuuceysOres.MODID + " Mod Event Subscriber");
	
	@SubscribeEvent
	public static void onCommonSetup(final FMLCommonSetupEvent event) {
		OreGeneration.setupOreGeneration();
		LOGGER.debug("Common setup complete.");
	}
	/**
	 * This method will be called by Forge when it is time for the mod to register its Blocks.
	 * This method will always be called before the Item registry method.
	 */
	@SubscribeEvent
	public static void onRegisterBlocks(final RegistryEvent.Register<Block> event) {
		event.getRegistry().registerAll
		(
				//ores
				setup(new OreBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(2.0f, 3.0f).harvestTool(ToolType.PICKAXE).harvestLevel(0)), "zinc_ore"),
				setup(new OreBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(2.0f, 3.0f).harvestTool(ToolType.PICKAXE).harvestLevel(0)), "tin_ore"),
				setup(new OreBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0f, 3.0f).harvestTool(ToolType.PICKAXE).harvestLevel(1)), "copper_ore"),
				setup(new OreBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.5f, 3.0f).harvestTool(ToolType.PICKAXE).harvestLevel(2)), "tungsten_ore"),
				setup(new OreBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(5.0f, 3.0f).harvestTool(ToolType.PICKAXE).harvestLevel(2)), "silver_ore"),
				setup(new OreBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(10.0f, 3.0f).harvestTool(ToolType.PICKAXE).harvestLevel(3)), "platinum_ore"),
				setup(new OreBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(20.0f, 3.0f).harvestTool(ToolType.PICKAXE).harvestLevel(3)), "cobalt_ore"),
				setup(new OreBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(25.0f, 3.0f).harvestTool(ToolType.PICKAXE).harvestLevel(3)), "titanium_ore"),
				setup(new OreBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0f, 3.0f).harvestTool(ToolType.PICKAXE).harvestLevel(1)), "sulfur_ore"),
				setup(new OreBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0f, 3.0f).harvestTool(ToolType.PICKAXE).harvestLevel(1)), "saltpeter_ore"),
				//metal blocks
				setup(new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(5.0f, 3.0f).harvestTool(ToolType.PICKAXE).harvestLevel(1)), "zinc_block"),
				setup(new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(5.0f, 3.0f).harvestTool(ToolType.PICKAXE).harvestLevel(1)), "tin_block"),
				setup(new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(5.0f, 3.0f).harvestTool(ToolType.PICKAXE).harvestLevel(1)), "copper_block"),
				setup(new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(5.0f, 3.0f).harvestTool(ToolType.PICKAXE).harvestLevel(1)), "brass_block"),
				setup(new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(5.0f, 3.0f).harvestTool(ToolType.PICKAXE).harvestLevel(1)), "bronze_block"),
				setup(new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(5.0f, 3.0f).harvestTool(ToolType.PICKAXE).harvestLevel(1)), "tungsten_block"),
				setup(new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(5.0f, 3.0f).harvestTool(ToolType.PICKAXE).harvestLevel(1)), "silver_block"),
				setup(new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(5.0f, 3.0f).harvestTool(ToolType.PICKAXE).harvestLevel(1)), "steel_block"),
				setup(new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(5.0f, 3.0f).harvestTool(ToolType.PICKAXE).harvestLevel(1)), "platinum_block"),
				setup(new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(5.0f, 3.0f).harvestTool(ToolType.PICKAXE).harvestLevel(1)), "cobalt_block"),
				setup(new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(5.0f, 3.0f).harvestTool(ToolType.PICKAXE).harvestLevel(1)), "titanium_block"),
				setup(new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(5.0f, 3.0f).harvestTool(ToolType.PICKAXE).harvestLevel(1)), "sulfur_block"),
				setup(new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(5.0f, 3.0f).harvestTool(ToolType.PICKAXE).harvestLevel(1)), "saltpeter_block")
				
		);
		LOGGER.debug("Registered Blocks.");
	}
	
	/**
	 * This method will be called by Forge when it is time for the mod to register its Items.
	 * This method will always be called after the Block registry method.
	 */
	@SubscribeEvent
	public static void onRegisterItems(final RegistryEvent.Register<Item> event) {
		final IForgeRegistry<Item> registry = event.getRegistry();
		
		//metals
		registry.registerAll
		(
				setup(new Item(new Item.Properties().group(ModGroup.MOD_ITEM_GROUP)), "zinc_ingot"),
				setup(new Item(new Item.Properties().group(ModGroup.MOD_ITEM_GROUP)), "tin_ingot"),
				setup(new Item(new Item.Properties().group(ModGroup.MOD_ITEM_GROUP)), "copper_ingot"),
				setup(new Item(new Item.Properties().group(ModGroup.MOD_ITEM_GROUP)), "brass_ingot"),
				setup(new Item(new Item.Properties().group(ModGroup.MOD_ITEM_GROUP)), "bronze_ingot"),
				setup(new Item(new Item.Properties().group(ModGroup.MOD_ITEM_GROUP)), "chain_links"),
				setup(new Item(new Item.Properties().group(ModGroup.MOD_ITEM_GROUP)), "tungsten_ingot"),
				setup(new Item(new Item.Properties().group(ModGroup.MOD_ITEM_GROUP)), "silver_ingot"),
				setup(new Item(new Item.Properties().group(ModGroup.MOD_ITEM_GROUP)), "steel_ingot"),
				setup(new Item(new Item.Properties().group(ModGroup.MOD_ITEM_GROUP)), "platinum_ingot"),
				setup(new Item(new Item.Properties().group(ModGroup.MOD_ITEM_GROUP)), "cobalt_ingot"),
				setup(new Item(new Item.Properties().group(ModGroup.MOD_ITEM_GROUP)), "titanium_ingot"),
				setup(new Item(new Item.Properties().group(ModGroup.MOD_ITEM_GROUP)), "sulfur_dust"),
				setup(new Item(new Item.Properties().group(ModGroup.MOD_ITEM_GROUP)), "saltpeter")
				
		);

		//tools
		registry.registerAll
		(
				setup(new SwordItem(ModToolMaterials.tin, 4, -2.2f, new Item.Properties().group(ModGroup.MOD_ITEM_GROUP)), "tin_sword"),
				setup(new ShovelItem(ModToolMaterials.tin, 2.5f, -2.8f, new Item.Properties().group(ModGroup.MOD_ITEM_GROUP)), "tin_shovel"),
				setup(new PickaxeItem(ModToolMaterials.tin, 2, -2.7f, new Item.Properties().group(ModGroup.MOD_ITEM_GROUP)), "tin_pickaxe"),
				setup(new AxeItem(ModToolMaterials.tin, 8.0f, -3.1f, new Item.Properties().group(ModGroup.MOD_ITEM_GROUP)), "tin_axe"),
				setup(new HoeItem(ModToolMaterials.tin, -2.0f, new Item.Properties().group(ModGroup.MOD_ITEM_GROUP)), "tin_hoe"),

				setup(new SwordItem(ModToolMaterials.copper, 4, -2.0f, new Item.Properties().group(ModGroup.MOD_ITEM_GROUP)), "copper_sword"),
				setup(new ShovelItem(ModToolMaterials.copper, 2.5f, -2.6f, new Item.Properties().group(ModGroup.MOD_ITEM_GROUP)), "copper_shovel"),
				setup(new PickaxeItem(ModToolMaterials.copper, 2, -2.4f, new Item.Properties().group(ModGroup.MOD_ITEM_GROUP)), "copper_pickaxe"),
				setup(new AxeItem(ModToolMaterials.copper, 8.0f, -2.9f, new Item.Properties().group(ModGroup.MOD_ITEM_GROUP)), "copper_axe"),
				setup(new HoeItem(ModToolMaterials.copper, -2.0f, new Item.Properties().group(ModGroup.MOD_ITEM_GROUP)), "copper_hoe"),

				setup(new SwordItem(ModToolMaterials.brass, 4, -1.8f, new Item.Properties().group(ModGroup.MOD_ITEM_GROUP)), "brass_sword"),
				setup(new ShovelItem(ModToolMaterials.brass, 2.5f, -2.4f, new Item.Properties().group(ModGroup.MOD_ITEM_GROUP)), "brass_shovel"),
				setup(new PickaxeItem(ModToolMaterials.brass, 2, -2.2f, new Item.Properties().group(ModGroup.MOD_ITEM_GROUP)), "brass_pickaxe"),
				setup(new AxeItem(ModToolMaterials.brass, 8.0f, -2.7f, new Item.Properties().group(ModGroup.MOD_ITEM_GROUP)), "brass_axe"),
				setup(new HoeItem(ModToolMaterials.brass, -1.8f, new Item.Properties().group(ModGroup.MOD_ITEM_GROUP)), "brass_hoe"),

				setup(new SwordItem(ModToolMaterials.bronze, 4, -1.6f, new Item.Properties().group(ModGroup.MOD_ITEM_GROUP)), "bronze_sword"),
				setup(new ShovelItem(ModToolMaterials.bronze, 2.5f, -2.2f, new Item.Properties().group(ModGroup.MOD_ITEM_GROUP)), "bronze_shovel"),
				setup(new PickaxeItem(ModToolMaterials.bronze, 2, -2.0f, new Item.Properties().group(ModGroup.MOD_ITEM_GROUP)), "bronze_pickaxe"),
				setup(new AxeItem(ModToolMaterials.bronze, 8.0f, -2.5f, new Item.Properties().group(ModGroup.MOD_ITEM_GROUP)), "bronze_axe"),
				setup(new HoeItem(ModToolMaterials.bronze, -1.8f, new Item.Properties().group(ModGroup.MOD_ITEM_GROUP)), "bronze_hoe"),

				setup(new SwordItem(ModToolMaterials.tungsten, 5, -2.2f, new Item.Properties().group(ModGroup.MOD_ITEM_GROUP)), "tungsten_sword"),
				setup(new ShovelItem(ModToolMaterials.tungsten, 3.5f, -2.8f, new Item.Properties().group(ModGroup.MOD_ITEM_GROUP)), "tungsten_shovel"),
				setup(new PickaxeItem(ModToolMaterials.tungsten, 3, -2.7f, new Item.Properties().group(ModGroup.MOD_ITEM_GROUP)), "tungsten_pickaxe"),
				setup(new AxeItem(ModToolMaterials.tungsten, 8.0f, -3.0f, new Item.Properties().group(ModGroup.MOD_ITEM_GROUP)), "tungsten_axe"),
				setup(new HoeItem(ModToolMaterials.tungsten, -1.0f, new Item.Properties().group(ModGroup.MOD_ITEM_GROUP)), "tungsten_hoe"),

				setup(new SwordItem(ModToolMaterials.silver, 5, -1.9f, new Item.Properties().group(ModGroup.MOD_ITEM_GROUP)), "silver_sword"),
				setup(new ShovelItem(ModToolMaterials.silver, 3.5f, -2.5f, new Item.Properties().group(ModGroup.MOD_ITEM_GROUP)), "silver_shovel"),
				setup(new PickaxeItem(ModToolMaterials.silver, 3, -2.4f, new Item.Properties().group(ModGroup.MOD_ITEM_GROUP)), "silver_pickaxe"),
				setup(new AxeItem(ModToolMaterials.silver, 8.0f, -2.7f, new Item.Properties().group(ModGroup.MOD_ITEM_GROUP)), "silver_axe"),
				setup(new HoeItem(ModToolMaterials.silver, -1.0f, new Item.Properties().group(ModGroup.MOD_ITEM_GROUP)), "silver_hoe"),

				setup(new SwordItem(ModToolMaterials.steel, 5, -1.6f, new Item.Properties().group(ModGroup.MOD_ITEM_GROUP)), "steel_sword"),
				setup(new ShovelItem(ModToolMaterials.steel, 3.5f, -2.2f, new Item.Properties().group(ModGroup.MOD_ITEM_GROUP)), "steel_shovel"),
				setup(new PickaxeItem(ModToolMaterials.steel, 3, -2.1f, new Item.Properties().group(ModGroup.MOD_ITEM_GROUP)), "steel_pickaxe"),
				setup(new AxeItem(ModToolMaterials.steel, 8.0f, -2.4f, new Item.Properties().group(ModGroup.MOD_ITEM_GROUP)), "steel_axe"),
				setup(new HoeItem(ModToolMaterials.steel, -1.0f, new Item.Properties().group(ModGroup.MOD_ITEM_GROUP)), "steel_hoe"),

				setup(new SwordItem(ModToolMaterials.platinum, 6, -2.2f, new Item.Properties().group(ModGroup.MOD_ITEM_GROUP)), "platinum_sword"),
				setup(new ShovelItem(ModToolMaterials.platinum, 4.5f, -2.8f, new Item.Properties().group(ModGroup.MOD_ITEM_GROUP)), "platinum_shovel"),
				setup(new PickaxeItem(ModToolMaterials.platinum, 4, -2.7f, new Item.Properties().group(ModGroup.MOD_ITEM_GROUP)), "platinum_pickaxe"),
				setup(new AxeItem(ModToolMaterials.platinum, 8.0f, -2.9f, new Item.Properties().group(ModGroup.MOD_ITEM_GROUP)), "platinum_axe"),
				setup(new HoeItem(ModToolMaterials.platinum, 0.0f, new Item.Properties().group(ModGroup.MOD_ITEM_GROUP)), "platinum_hoe"),

				setup(new SwordItem(ModToolMaterials.cobalt, 6, -1.8f, new Item.Properties().group(ModGroup.MOD_ITEM_GROUP)), "cobalt_sword"),
				setup(new ShovelItem(ModToolMaterials.cobalt, 4.5f, -2.4f, new Item.Properties().group(ModGroup.MOD_ITEM_GROUP)), "cobalt_shovel"),
				setup(new PickaxeItem(ModToolMaterials.cobalt, 4, -2.3f, new Item.Properties().group(ModGroup.MOD_ITEM_GROUP)), "cobalt_pickaxe"),
				setup(new AxeItem(ModToolMaterials.cobalt, 8.0f, -2.5f, new Item.Properties().group(ModGroup.MOD_ITEM_GROUP)), "cobalt_axe"),
				setup(new HoeItem(ModToolMaterials.cobalt, 0.0f, new Item.Properties().group(ModGroup.MOD_ITEM_GROUP)), "cobalt_hoe"),

				setup(new SwordItem(ModToolMaterials.titanium, 6, -1.4f, new Item.Properties().group(ModGroup.MOD_ITEM_GROUP)), "titanium_sword"),
				setup(new ShovelItem(ModToolMaterials.titanium, 4.5f, -2.0f, new Item.Properties().group(ModGroup.MOD_ITEM_GROUP)), "titanium_shovel"),
				setup(new PickaxeItem(ModToolMaterials.titanium, 4, -1.9f, new Item.Properties().group(ModGroup.MOD_ITEM_GROUP)), "titanium_pickaxe"),
				setup(new AxeItem(ModToolMaterials.titanium, 8.0f, 2.1f, new Item.Properties().group(ModGroup.MOD_ITEM_GROUP)), "titanium_axe"),
				setup(new HoeItem(ModToolMaterials.titanium, 0.0f, new Item.Properties().group(ModGroup.MOD_ITEM_GROUP)), "titanium_hoe")

		);
		
		for (final Block block : ForgeRegistries.BLOCKS.getValues()) {

			final ResourceLocation blockRegistryName = block.getRegistryName();
			// An extra safe-guard against badly registered blocks
			Preconditions.checkNotNull(blockRegistryName, "Registry Name of Block \"" + block + "\" is null! This is not allowed!");

			// Check that the blocks is from our mod, if not, continue to the next block
			if (!blockRegistryName.getNamespace().equals(SauuuuuceysOres.MODID)) {
				continue;
			}
			// Make the properties, and make it so that the item will be on our ItemGroup (CreativeTab)
			final Item.Properties properties = new Item.Properties().group(ModGroup.MOD_ITEM_GROUP);
			// Create the new BlockItem with the block and it's properties
			final BlockItem blockItem = new BlockItem(block, properties);
			// Setup the new BlockItem with the block's registry name and register it
			registry.register(setup(blockItem, blockRegistryName));
		}
		LOGGER.debug("Registered Items");
	}
	
	@SubscribeEvent
	public static void onModConfigEvent(final ModConfig.ModConfigEvent event) {
		final ModConfig config = event.getConfig();
		// Rebake the configs when they change
		if (config.getSpec() == ConfigHolder.SERVER_SPEC) {
			ConfigHelper.bakeServer(config);
			LOGGER.debug("Baked server config");
		}
	}
	
	public static <T extends IForgeRegistryEntry<T>> T setup(final T entry, final String name) {
		return setup(entry, new ResourceLocation(SauuuuuceysOres.MODID, name));
	}
	
	public static <T extends IForgeRegistryEntry<T>> T setup(final T entry, final ResourceLocation registryName) {
		entry.setRegistryName(registryName);
		return entry;
	}

}
