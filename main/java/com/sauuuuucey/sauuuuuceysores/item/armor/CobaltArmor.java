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
public class CobaltArmor extends ArmorItem 
{
	private final EffectInstance potionEffect;

	public CobaltArmor(IArmorMaterial materialIn, EquipmentSlotType slot, final EffectInstance potionEffect ,Properties builder) {
		super(materialIn, slot, builder);
		this.potionEffect = potionEffect;
	}
	
    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType equipmentSlotIn, String layer) {
        if (equipmentSlotIn != EquipmentSlotType.LEGS) {
        	return "sauuuuuceysores:textures/models/armor/cobalt_layer_1.png";
        } 
        else {
            return "sauuuuuceysores:textures/models/armor/cobalt_layer_2.png";
        }
    }
	
    public void onArmorTick(World world, PlayerEntity player, ItemStack item) {
		if(player.inventory.armorItemInSlot(0) 
				!= null && player.inventory.armorItemInSlot(1) 
				!= null && player.inventory.armorItemInSlot(2) 
				!= null && player.inventory.armorItemInSlot(3) 
				!= null) 
		{
			if(player.inventory.armorItemInSlot(0).getItem() == ModItems.cobalt_chestplate && player.inventory.armorItemInSlot(1).getItem() == ModItems.cobalt_leggings && player.inventory.armorItemInSlot(2).getItem() == ModItems.cobalt_boots && player.inventory.armorItemInSlot(3).getItem() == ModItems.cobalt_helmet) {				
				player.addPotionEffect(new EffectInstance(potionEffect));
			}
		}
	}
	
	@SubscribeEvent
	public static void onRegisterItems(final RegistryEvent.Register<Item> event) {
		final IForgeRegistry<Item> registry = event.getRegistry();
		
		registry.registerAll
		(
				new CobaltArmor(ModArmorMaterials.cobalt, EquipmentSlotType.HEAD, new EffectInstance(Effects.CONDUIT_POWER), new Item.Properties().group(ModGroup.MOD_ITEM_GROUP)).setRegistryName("cobalt_helmet"),
				new CobaltArmor(ModArmorMaterials.cobalt, EquipmentSlotType.CHEST, new EffectInstance(Effects.CONDUIT_POWER), new Item.Properties().group(ModGroup.MOD_ITEM_GROUP)).setRegistryName("cobalt_chestplate"),
				new CobaltArmor(ModArmorMaterials.cobalt, EquipmentSlotType.LEGS, new EffectInstance(Effects.CONDUIT_POWER), new Item.Properties().group(ModGroup.MOD_ITEM_GROUP)).setRegistryName("cobalt_leggings"),
				new CobaltArmor(ModArmorMaterials.cobalt, EquipmentSlotType.FEET, new EffectInstance(Effects.CONDUIT_POWER), new Item.Properties().group(ModGroup.MOD_ITEM_GROUP)).setRegistryName("cobalt_boots")
				
		);
	}

}