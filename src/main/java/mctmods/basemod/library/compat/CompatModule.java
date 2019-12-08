package mctmods.basemod.library.compat;

import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Consumer;

import mctmods.basemod.library.util.LoggerBM;

public abstract class CompatModule {
	public static HashMap<String, Class<? extends CompatModule>> moduleClass = new HashMap<String, Class<? extends CompatModule>>();
	
	public static Set<CompatModule> module = new HashSet<CompatModule>();

	public static Consumer<Object> jeiAddFunc = o -> {
		
	};
	
	public static Consumer<Object> jeiRemoveFunc = o -> {
		
	};

	static {
		moduleClass.put("tconstruct", TConstructModule.class);
	}

	public static void doModulePreInit() {
		for(Entry<String, Class<? extends CompatModule>> e : moduleClass.entrySet())
			if(Loader.isModLoaded(e.getKey()))
				try	{
					CompatModule m = e.getValue().newInstance();
					module.add(m);
					m.preInit();
				} 
				catch(Exception exception) {
					LoggerBM.error("Compatibility module for "+e.getKey()+" could not be preInitialized.");
		}
	}
	
	public static void doModuleInit() {
		for(CompatModule compat : CompatModule.module)
			try {
				compat.init();
			}
			catch (Exception exception) {
				LoggerBM.error("Compatibility module for "+compat+" could not be initialized");
		}
	}
	
	public static void doModulePostInit()	{
		for(CompatModule compat : CompatModule.module)
			try {
				compat.postInit();
			}
			catch (Exception exception) {
				LoggerBM.error("Compatibility module for "+compat+" could not be postInitialized");
		}
	}

	public static boolean serverStartingDone = false;
	
	public static void doModuleLoadComplete() {
		if(!serverStartingDone)	{
			serverStartingDone = true;
			for(CompatModule compat : CompatModule.module)
				try {
					compat.loadComplete();
				} 
				catch (Exception exception) {
					LoggerBM.error("Compatibility module for "+compat+" could not be initialized");
					exception.printStackTrace();
			}
		}
	}

	public abstract void preInit();
	
	public abstract void init();
	
	public abstract void postInit();
	
	public void loadComplete() {
		
	}
	
	@SideOnly(Side.CLIENT)
	public void clientPreInit() {
		
	}
	
	@SideOnly(Side.CLIENT)
	public void clientInit() {
		
	}
	
	@SideOnly(Side.CLIENT)
	public void clientPostInit() {
		
	}
}
