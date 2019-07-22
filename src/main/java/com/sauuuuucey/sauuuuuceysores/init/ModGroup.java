package com.sauuuuucey.sauuuuuceysores.init;

import java.util.function.Supplier;

import javax.annotation.Nonnull;

import com.sauuuuucey.sauuuuuceysores.SauuuuuceysOres;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModGroup 
{
	public static final ItemGroup MOD_ITEM_GROUP = new ModTabGroup(SauuuuuceysOres.MODID, () -> new ItemStack(ModItems.copper_ingot));

    public static final class ModTabGroup extends ItemGroup
    {

        @Nonnull
        private final Supplier<ItemStack> iconSupplier;

        /**
         * @param name  String: mod id
         * @param iconSupplier
         */
        public ModTabGroup(@Nonnull final String name, @Nonnull final Supplier<ItemStack> iconSupplier)
        {
            super(name);
            this.iconSupplier = iconSupplier;
        }

        @Override
        @Nonnull
        public ItemStack createIcon() {
            return iconSupplier.get();
        }
    }
}