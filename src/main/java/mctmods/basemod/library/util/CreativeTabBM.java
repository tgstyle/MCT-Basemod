package mctmods.basemod.library.util;

import mctmods.basemod.Basemod;
import mctmods.basemod.registry.Registry;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

import javax.annotation.Nonnull;

public class CreativeTabBM extends CreativeTabs {

	public static final CreativeTabBM MCTBASEMOD_TAB = new CreativeTabBM();

	public CreativeTabBM() { super(Basemod.MODID); }

	@Override @Nonnull public ItemStack createIcon() { return new ItemStack(Registry.ORE1); }
}