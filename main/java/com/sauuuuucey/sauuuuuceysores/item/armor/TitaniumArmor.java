package com.sauuuuucey.sauuuuuceysores.item.armor;

import com.sauuuuucey.sauuuuuceysores.SauuuuuceysOres;
import com.sauuuuucey.sauuuuuceysores.init.ModGroup;
import com.sauuuuucey.sauuuuuceysores.init.ModItems;
import com.sauuuuucey.sauuuuuceysores.lists.ModArmorMaterials;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.world.World;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.registries.ObjectHolder;

@ObjectHolder(SauuuuuceysOres.MODID)
@EventBusSubscriber(modid = SauuuuuceysOres.MODID, bus = EventBusSubscriber.Bus.MOD)
public class TitaniumArmor extends ArmorItem 
{
	private final EffectInstance potionEffect;

	public TitaniumArmor(IArmorMaterial materialIn, EquipmentSlotType slot, final EffectInstance potionEffect ,Properties builder) {
		super(materialIn, slot, builder);
		this.potionEffect = potionEffect;
	}
	
    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType equipmentSlotIn, String layer) {
        if (equipmentSlotIn != EquipmentSlotType.LEGS) {
        	return "sauuuuuceysores:textures/models/armor/titanium_layer_1.png";
        } 
        else {
            return "sauuuuuceysores:textures/models/armor/titanium_layer_2.png";
        }
    }
    
    public void onArmorTick(World world, PlayerEntity player, ItemStack item) {
		if(player.inventory.armorItemInSlot(0) 
				!= null && player.inventory.armorItemInSlot(1) 
				!= null && player.inventory.armorItemInSlot(2) 
				!= null && player.inventory.armorItemInSlot(3) 
				!= null) 
		{
			if(player.inventory.armorItemInSlot(0).getItem() == ModItems.titanium_chestplate && player.inventory.armorItemInSlot(1).getItem() == ModItems.titanium_leggings && player.inventory.armorItemInSlot(2).getItem() == ModItems.titanium_boots && player.inventory.armorItemInSlot(3).getItem() == ModItems.titanium_helmet) {				
				player.addPotionEffect(new EffectInstance(potionEffect));
			}
		}
	}
	
	@SubscribeEvent
	public static void onRegisterItems(final RegistryEvent.Register<Item> event) {
		final IForgeRegistry<Item> registry = event.getRegistry();
		
		registry.registerAll
		(
				new TitaniumArmor(ModArmorMaterials.titanium, EquipmentSlotType.HEAD, new EffectInstance(Effects.HEALTH_BOOST), new Item.Properties().group(ModGroup.MOD_ITEM_GROUP)).setRegistryName("titanium_helmet"),
				new TitaniumArmor(ModArmorMaterials.titanium, EquipmentSlotType.CHEST, new EffectInstance(Effects.HEALTH_BOOST), new Item.Properties().group(ModGroup.MOD_ITEM_GROUP)).setRegistryName("titanium_chestplate"),
				new TitaniumArmor(ModArmorMaterials.titanium, EquipmentSlotType.LEGS, new EffectInstance(Effects.HEALTH_BOOST), new Item.Properties().group(ModGroup.MOD_ITEM_GROUP)).setRegistryName("titanium_leggings"),
				new TitaniumArmor(ModArmorMaterials.titanium, EquipmentSlotType.FEET, new EffectInstance(Effects.HEALTH_BOOST), new Item.Properties().group(ModGroup.MOD_ITEM_GROUP)).setRegistryName("titanium_boots")
				
		);
	}
	
}