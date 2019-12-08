package mctmods.basemod.proxies;

import mctmods.basemod.library.compat.CompatModule;
import mctmods.basemod.library.util.LoggerBM;
import mctmods.basemod.registry.RegistryBlock;
import mctmods.basemod.registry.RegistryFluid;
import mctmods.basemod.registry.RegistryMoltenFluid;
import mctmods.basemod.registry.RegistryItem;

import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

@EventBusSubscriber(Side.CLIENT)
public class ClientProxy extends CommonProxy {

    @Override
    public void preInit(FMLPreInitializationEvent event) {
        super.preInit(event);
		MinecraftForge.EVENT_BUS.register(this);

		for(CompatModule compat : CompatModule.module)
			try {
				compat.clientPreInit();
			}
			catch (Exception exception){
				LoggerBM.error("Compatibility module for "+compat+" could not be pre-initialized");
		}

	}

    @Override
    public void init(FMLInitializationEvent event) {
        super.init(event);

		for(CompatModule compat : CompatModule.module)
			try {
				compat.clientInit();
			}
			catch (Exception exception){
				LoggerBM.error("Compatibility module for "+compat+" could not be pre-initialized");
		}
    }

    @Override
    public void postInit(FMLPostInitializationEvent event) {
        super.postInit(event);

		for(CompatModule compat : CompatModule.module)
			try {
				compat.clientPostInit();
			}
			catch (Exception exception){
				LoggerBM.error("Compatibility module for "+compat+" could not be pre-initialized");
		}
    }

	@SubscribeEvent
	public void registerModels(ModelRegistryEvent event) {
		// blocks
		RegistryBlock.initModels();
		// items
		RegistryItem.initModels();
		// fluids
		RegistryFluid.initModels();
		RegistryMoltenFluid.initModels();
	}

}
