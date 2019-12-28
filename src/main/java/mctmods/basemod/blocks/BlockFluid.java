package mctmods.basemod.blocks;

import mctmods.basemod.blocks.base.BlockBaseFluid;

import net.minecraft.block.material.Material;
import net.minecraftforge.fluids.Fluid;

public class BlockFluid extends BlockBaseFluid {

	public BlockFluid(Fluid fluid, Material material, String name) {
		super(fluid, material, name);
	}

}