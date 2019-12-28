package mctmods.basemod.blocks.base;

import mctmods.basemod.Basemod;
import mctmods.basemod.library.util.CreativeTabBM;

import net.minecraft.block.material.Material;
import net.minecraftforge.fluids.BlockFluidClassic;
import net.minecraftforge.fluids.Fluid;

public class BlockBaseFluid extends BlockFluidClassic {

	public BlockBaseFluid(Fluid fluid, Material material, String name) {
		super(fluid, material);
		setRegistryName(Basemod.MODID, name);
		setUnlocalizedName(getRegistryName().toString());
		setCreativeTab(CreativeTabBM.MCTBASEMOD_TAB);
	}

}