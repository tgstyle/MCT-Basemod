package mctmods.basemod.library.util.recipes;

import java.util.Iterator;
import java.util.Map;

import mctmods.basemod.Basemod;
import mctmods.basemod.library.util.ConfigBM;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;

public class FurnaceRecipe {

	public static void removeSmeltingPreInit() {
		
		if(!ConfigBM.disableFurnaceRecipeRemoval) {

		removeSmeltingRecipesFor(new ItemStack(Items.BRICK));
		removeSmeltingRecipesFor(new ItemStack(Items.COAL, 1, 1));
		removeSmeltingRecipesFor(new ItemStack(Items.COAL, 1, 0));
		removeSmeltingRecipesFor(new ItemStack(Items.GOLD_NUGGET));
		removeSmeltingRecipesFor(new ItemStack(Items.GOLD_INGOT));
		removeSmeltingRecipesFor(new ItemStack(Items.IRON_NUGGET));
		removeSmeltingRecipesFor(new ItemStack(Items.IRON_INGOT));
		removeSmeltingRecipesFor(new ItemStack(Items.DIAMOND));
		removeSmeltingRecipesFor(new ItemStack(Items.EMERALD));
		removeSmeltingRecipesFor(new ItemStack(Items.DYE, 1, 4));
		removeSmeltingRecipesFor(new ItemStack(Items.QUARTZ));
		removeSmeltingRecipesFor(new ItemStack(Items.REDSTONE));
		removeSmeltingRecipesFor(new ItemStack(Blocks.HARDENED_CLAY));

		}
	}

	private static void removeSmeltingRecipesFor(ItemStack output) {
		ItemStack recipeResult = null;
		Map<ItemStack,ItemStack> recipes = FurnaceRecipes.instance().getSmeltingList();
		Iterator<ItemStack> iterator = recipes.keySet().iterator();
		while(iterator.hasNext()) {
			ItemStack recipe = iterator.next();
			recipeResult = recipes.get(recipe);
			if(ItemStack.areItemStacksEqual(output, recipeResult)) {
				iterator.remove();
				Basemod.logger.info("Removed furnace recipe: " + recipe.getDisplayName() + " -> " + recipeResult.getDisplayName());
			}
		}
	}

}