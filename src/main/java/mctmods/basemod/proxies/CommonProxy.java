package mctmods.basemod.proxies;

import mctmods.basemod.library.compat.CompatModule;
import mctmods.basemod.library.compat.config.ConfigModule;
import mctmods.basemod.library.util.recipes.FurnaceRecipe;
import mctmods.basemod.registry.RegistryDict;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLLoadCompleteEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {

    public void preInit(FMLPreInitializationEvent event) {
    	CompatModule.doModulePreInit();
        FurnaceRecipe.removeSmeltingPreInit();
        ConfigModule.addConfigs();
    }

    public void init(FMLInitializationEvent event) {
        CompatModule.doModuleInit();
        RegistryDict.registerDictionary();
    }

    public void postInit(FMLPostInitializationEvent event) {
    	CompatModule.doModulePostInit();

    }

	public void loadComplete(FMLLoadCompleteEvent event) {
		CompatModule.doModuleLoadComplete();
    }

}
