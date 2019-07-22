package com.sauuuuucey.sauuuuuceysores.item.armor;

import com.sauuuuucey.sauuuuuceysores.SauuuuuceysOres;
import com.sauuuuucey.sauuuuuceysores.init.ModGroup;
import com.sauuuuucey.sauuuuuceysores.lists.ModArmorMaterials;

import net.minecraft.entity.Entity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.registries.ObjectHolder;

@ObjectHolder(SauuuuuceysOres.MODID)
@EventBusSubscriber(modid = SauuuuuceysOres.MODID, bus = EventBusSubscriber.Bus.MOD)
public class BrassArmor extends ArmorItem 
{

	public BrassArmor(IArmorMaterial materialIn, EquipmentSlotType slot, Properties builder) {
		super(materialIn, slot, builder);
	}
	
    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType equipmentSlotIn, String layer) {
        if (equipmentSlotIn != EquipmentSlotType.LEGS) {
        	return "sauuuuuceysores:textures/models/armor/brass_layer_1.png";
        } 
        else {
            return "sauuuuuceysores:textures/models/armor/brass_layer_2.png";
        }
    }
	
	@SubscribeEvent
	public static void onRegisterItems(final RegistryEvent.Register<Item> event) {
		final IForgeRegistry<Item> registry = event.getRegistry();
		
		registry.registerAll
		(
				new BrassArmor(ModArmorMaterials.brass, EquipmentSlotType.HEAD, new Item.Properties().group(ModGroup.MOD_ITEM_GROUP)).setRegistryName("brass_helmet"),
				new BrassArmor(ModArmorMaterials.brass, EquipmentSlotType.CHEST, new Item.Properties().group(ModGroup.MOD_ITEM_GROUP)).setRegistryName("brass_chestplate"),
				new BrassArmor(ModArmorMaterials.brass, EquipmentSlotType.LEGS, new Item.Properties().group(ModGroup.MOD_ITEM_GROUP)).setRegistryName("brass_leggings"),
				new BrassArmor(ModArmorMaterials.brass, EquipmentSlotType.FEET, new Item.Properties().group(ModGroup.MOD_ITEM_GROUP)).setRegistryName("brass_boots")
				
		);
	}
	
}
