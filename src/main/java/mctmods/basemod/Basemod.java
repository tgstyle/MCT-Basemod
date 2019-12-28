package mctmods.basemod;

import mctmods.basemod.library.util.FilePlacerBM;
import mctmods.basemod.library.util.recipes.FurnaceRecipe;
import mctmods.basemod.proxies.CommonProxy;
import mctmods.basemod.registry.Registry;
import mctmods.basemod.registry.RegistryDict;
import mctmods.basemod.registry.RegistryFluid;

import net.minecraft.block.Block;
import net.minecraft.item.Item;

import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(
	modid = Basemod.MODID,
	name = Basemod.MODNAME,
	version = Basemod.VERSION,
	acceptedMinecraftVersions = "[1.12.2,1.13)",
	dependencies =
			"required-after:forge@[14.23.+,);" +
			"required-after:tconstruct;" +
			"before:mekanism;")

@EventBusSubscriber
public class Basemod {

	public static final String MODID = "mctbasemod";
	public static final String MODNAME = "MCT Basemod";
	public static final String VERSION = "${version}";

	public static Logger logger = LogManager.getLogger(MODID);

	@SidedProxy(clientSide = "mctmods.basemod.proxies.ClientProxy", serverSide = "mctmods.basemod.proxies.CommonProxy")
	public static CommonProxy proxy;

	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event) {
		Registry.registerBlocks(event.getRegistry());
		RegistryFluid.registerBlocks(event.getRegistry());
	}

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		Registry.registerItems(event.getRegistry());
		Registry.registerItemBlocks(event.getRegistry());
		RegistryFluid.registerItemBlocks(event.getRegistry());
		RegistryDict.registerDictionaryBlocks();
		RegistryDict.registerDictionaryItems();
	}

	@SubscribeEvent
	public static void registerModels(ModelRegistryEvent event) {
		proxy.registerRenders();
	}

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		FilePlacerBM.filePlacer();
		FurnaceRecipe.removeSmeltingPreInit();

		proxy.preInit();
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
		proxy.init();
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		proxy.postInit();
	}

}