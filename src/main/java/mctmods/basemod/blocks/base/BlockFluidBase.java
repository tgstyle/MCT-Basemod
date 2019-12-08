package mctmods.basemod.blocks.base;

import mctmods.basemod.Basemod;
import mctmods.basemod.library.util.CreativeTabBM;
import mctmods.basemod.registry.RegistryMoltenFluid;

import net.minecraft.block.material.Material;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fluids.BlockFluidClassic;
import net.minecraftforge.fluids.Fluid;

public class BlockFluidBase extends BlockFluidClassic {

	public BlockFluidBase(String name, Fluid fluid, Material material) {
		super(fluid, material);
		this.setUnlocalizedName(Basemod.MODID + ":" + name);
		this.setCreativeTab(CreativeTabBM.MCTBASEMOD_TAB);
		RegistryMoltenFluid.registeredBlocks.add(this);
		RegistryMoltenFluid.registeredItems.add(new ItemBlock(this));
	}

}
