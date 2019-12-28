package mctmods.basemod.library.util.plugins.jei;

import mctmods.basemod.blocks.meta.EnumOre1;
import mctmods.basemod.blocks.meta.EnumOre2;
import mctmods.basemod.blocks.meta.EnumOre3;
import mctmods.basemod.blocks.meta.EnumOre4;
import mctmods.basemod.registry.Registry;

import mezz.jei.api.IJeiHelpers;
import mezz.jei.api.IModPlugin;
import mezz.jei.api.IModRegistry;
import mezz.jei.api.JEIPlugin;
import mezz.jei.api.ingredients.IIngredientBlacklist;

import net.minecraft.item.ItemStack;

@JEIPlugin
public class JEI implements IModPlugin {

	@Override
	public void register(IModRegistry registry) {

		IJeiHelpers helpers = registry.getJeiHelpers();
		IIngredientBlacklist blacklist = helpers.getIngredientBlacklist();

		// world generated ores
		for(EnumOre1 variant : EnumOre1.values()) {
			blacklist.addIngredientToBlacklist(new ItemStack(Registry.ORE1, 1, variant.ordinal()));
		}

		for(EnumOre2 variant : EnumOre2.values()) {
			blacklist.addIngredientToBlacklist(new ItemStack(Registry.ORE2, 1, variant.ordinal()));
		}

		for(EnumOre3 variant : EnumOre3.values()) {
			blacklist.addIngredientToBlacklist(new ItemStack(Registry.ORE3, 1, variant.ordinal()));
		}

		for(EnumOre4 variant : EnumOre4.values()) {
			blacklist.addIngredientToBlacklist(new ItemStack(Registry.ORE4, 1, variant.ordinal()));
		}

		// hidden items
		blacklist.addIngredientToBlacklist(new ItemStack(Registry.MATERIALS, 1, 358));
	}

}