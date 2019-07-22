package com.sauuuuucey.sauuuuuceysores.lists;

import com.sauuuuucey.sauuuuuceysores.init.ModItems;

import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.crafting.Ingredient;

public enum ModToolMaterials implements IItemTier
{
	tin(1, 155, 2.0f, 1.0f, 4, ModItems.tin_ingot),
	copper(1, 179, 3.0f, 1.0f, 5, ModItems.copper_ingot),
	brass(1, 203, 4.0f, 1.0f, 6, ModItems.brass_ingot),
	bronze(1, 227, 5.0f, 1.0f, 7, ModItems.bronze_ingot),
	tungsten(2, 437, 6.0f, 1.0f, 9, ModItems.tungsten_ingot),
	silver(2, 624, 7.0f, 1.0f, 12, ModItems.silver_ingot),
	steel(2, 811, 7.5f, 1.0f, 15, ModItems.steel_ingot),
	platinum(3, 998, 8.0f, 1.0f, 15, ModItems.platinum_ingot),
	cobalt(3, 1185, 9.0f, 1.0f, 20, ModItems.cobalt_ingot),
	titanium(3, 1372, 10.0f, 1.0f, 25, ModItems.titanium_ingot);

	
	private final int harvestLevel;
	private final int maxUses;
	private final float efficiency;
	private final float attackDamage;
	private final int enchantability;
	private Item repairMaterial;
	
	
	private ModToolMaterials(int harvestLevelIn, int maxUsesIn, float efficiencyIn, float attackDamageIn, int enchantabilityIn, Item repairMaterialIn) {
		this.harvestLevel = harvestLevelIn;
		this.maxUses = maxUsesIn;
		this.efficiency = efficiencyIn;
		this.attackDamage = attackDamageIn;
		this.enchantability = enchantabilityIn;
		this.repairMaterial = repairMaterialIn;
	}
	
	@Override
	public int getMaxUses() {
		return this.maxUses;
	}
	
	@Override
	public float getEfficiency() {
	    return this.efficiency;
	}

	@Override
	public float getAttackDamage() {
	    return this.attackDamage;
	}

	@Override
	public int getHarvestLevel() {
	    return this.harvestLevel;
	}

	@Override
	public int getEnchantability() {
	    return this.enchantability;
	}

	@Override
	public Ingredient getRepairMaterial() {
	    return Ingredient.fromItems(this.repairMaterial);
	}
	
}
