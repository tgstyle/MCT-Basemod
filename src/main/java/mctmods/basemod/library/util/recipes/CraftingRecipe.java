package mctmods.basemod.library.util.recipes;

import mctmods.basemod.library.util.LoggerBM;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.util.ResourceLocation;

import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.registries.IForgeRegistryModifiable;

//@EventBusSubscriber
public class CraftingRecipe {

	private static String removeRecipe[] = {
			};

	//@SubscribeEvent
	public static void removeRecipes(RegistryEvent.Register<IRecipe> event) {
    	IForgeRegistryModifiable<IRecipe> modRegistry = (IForgeRegistryModifiable<IRecipe>) event.getRegistry();
    	for (String removeRecipe : removeRecipe) {
    		modRegistry.remove(new ResourceLocation(removeRecipe));
    		LoggerBM.info(" Removed recipe: " + removeRecipe);
    	}
    }

}
