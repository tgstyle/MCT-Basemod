package mctmods.basemod.library.util;

import mctmods.basemod.Basemod;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.config.Property;

public class ConfigBM {

	public static boolean disableFurnaceRecipeRemoval;

	public static void syncConfig() {
		Configuration config = Basemod.config;
		try {
			config.load();

	 	 	Property disableFurnaceRecipeRemovalProperty = config.get(Configuration.CATEGORY_GENERAL,
	 	 	 	 	"disableFurnaceRecipeRemoval",
	 	 	 	 	"false",
	 	 	 	 	"Disable Furnace Recipe Removal (Default = False)");

	 	 	disableFurnaceRecipeRemoval = disableFurnaceRecipeRemovalProperty.getBoolean();

	 	} catch (Exception e) {
	 		Basemod.logger.error("Config Error %d" + e);
	 	} finally {
	 	 	if (config.hasChanged()) {
	 	 		config.save();
	 	 	}
	 	}
	}

}