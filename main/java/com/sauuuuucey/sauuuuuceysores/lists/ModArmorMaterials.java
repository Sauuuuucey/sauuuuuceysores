package com.sauuuuucey.sauuuuuceysores.lists;

import com.sauuuuucey.sauuuuuceysores.init.ModItems;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public enum ModArmorMaterials implements IArmorMaterial
{
	tin("tin", 112, new int[] {1, 2, 3, 1}, 5, ModItems.tin_ingot, "item.armor.equip_iron", 0.0f),
	copper("copper", 144, new int[] {1, 3, 4, 1}, 5, ModItems.copper_ingot, "item.armor.equip_iron", 0.0f),
	brass("brass", 176, new int[] {2, 3, 4, 1}, 7, ModItems.brass_ingot, "item.armor.equip_iron", 0.0f),
	bronze("bronze", 208, new int[] {2, 4, 5, 2}, 7, ModItems.bronze_ingot, "item.armor.equip_iron", 0.0f),
	tungsten("tungsten", 281, new int[] {2, 5, 5, 2}, 9, ModItems.tungsten_ingot, "item.armor.equip_iron", 0.0f),
	silver("silver", 322, new int[] {2, 5, 6, 2}, 12, ModItems.silver_ingot, "item.armor.equip_iron", 0.0f),
	steel("steel", 363, new int[] {2, 5, 6, 3}, 15, ModItems.steel_ingot, "item.armor.equip_iron", 0.0f),
	platinum("platinum", 404, new int[] {3, 6, 7, 3}, 15, ModItems.platinum_ingot, "item.armor.equip_iron", 0.0f),
	cobalt("cobalt", 445, new int[] {3, 7, 9, 3}, 20, ModItems.cobalt_ingot, "item.armor.equip_iron", 0.0f),
	titanium("titanium", 486, new int[] {3, 8, 10, 3}, 25, ModItems.titanium_ingot, "item.armor.equip_iron", 0.0f);
	
	private static final int[] max_damage_array = new int[]{13, 15, 16, 11};
	private String name, equipSound;
	private int durability, enchantability;
	private Item repairItem;
	private int[] damageReductionAmounts;
	private float toughness;
	
	private ModArmorMaterials(String name, int durability, int[] damageReductionAmounts, int enchantability, Item repairItem, String equipSound, float toughness) 
	{
		this.name = name;
		this.equipSound = equipSound;
		this.durability = durability;
		this.enchantability = enchantability;
		this.repairItem = repairItem;
		this.damageReductionAmounts = damageReductionAmounts;
		this.toughness = toughness;
	}

	@Override
	public int getDamageReductionAmount(EquipmentSlotType slot) 
	{
		return this.damageReductionAmounts[slot.getIndex()];
	}

	@Override
	public int getDurability(EquipmentSlotType slot) 
	{
		return max_damage_array[slot.getIndex()] * this.durability;
	}

	@Override
	public int getEnchantability() 
	{
		return this.enchantability;
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public String getName() 
	{
		return this.name;
	}

	@Override
	public Ingredient getRepairMaterial() 
	{
		return Ingredient.fromItems(this.repairItem);
	}

	@Override
	public SoundEvent getSoundEvent() 
	{
		return new SoundEvent(new ResourceLocation(equipSound));
	}

	@Override
	public float getToughness() 
	{
		return this.toughness;
	}
	
}
