package mctmods.basemod;

import mctmods.basemod.library.util.LoggerBM;
import mctmods.basemod.proxies.CommonProxy;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLLoadCompleteEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(
	modid = Basemod.MODID,
	name = Basemod.MODNAME,
	version = Basemod.VERSION,
	acceptedMinecraftVersions = "[1.12.2,1.13)",
	dependencies =
			"required-after:forge@[14.23.0.2486,);" +
			"before:tconstruct;")

public class Basemod {

	public static final String MODID = "mctbasemod";
	public static final String MODNAME = "MCT Basemod";
	public static final String VERSION = "${version}";

	@SidedProxy(clientSide = "mctmods.basemod.proxies.ClientProxy", serverSide = "mctmods.basemod.proxies.CommonProxy")
	public static CommonProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
    	
    	LoggerBM.logger = event.getModLog();
    	
        proxy.preInit(event);
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {

    	proxy.init(event);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {

        proxy.postInit(event);
    }

    @EventHandler
	public void loadComplete(FMLLoadCompleteEvent event) {

		proxy.loadComplete(event);
	}

}
