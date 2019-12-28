package mctmods.basemod.proxies;

import mctmods.basemod.registry.Registry;
import mctmods.basemod.registry.RegistryFluid;

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class ClientProxy extends CommonProxy {

	@Override
	public void registerRenders() {
		Registry.initModels();
		RegistryFluid.initModels();
	}

	@Override
	public void preInit() {
		super.preInit();
	}

	@Override
	public void init() {
		super.init();
	}

	@Override
	public void postInit() {
		super.postInit();
	}

}