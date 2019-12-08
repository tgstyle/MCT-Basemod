package mctmods.basemod.blocks.base;

import net.minecraft.block.material.Material;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

import net.minecraftforge.fluids.Fluid;

public class BlockMoltenFluidBase extends BlockFluidBase {

	public BlockMoltenFluidBase(String name, Fluid fluid, Material material) {
		super(name, fluid, material);
	}

	private int flammability = 0;
	private int fireSpread = 0;


	public BlockMoltenFluidBase setFlammability(int flammability, int fireSpread)	{
		this.flammability = flammability;
		this.fireSpread = fireSpread;
		return this;
	}


	@Override
	public int getFlammability(IBlockAccess world, BlockPos pos, EnumFacing face) {
		return this.flammability;
	}

	@Override
	public int getFireSpreadSpeed(IBlockAccess world, BlockPos pos, EnumFacing face) {
		return fireSpread;
	}

	@Override
	public boolean isFlammable(IBlockAccess world, BlockPos pos, EnumFacing face) {
		return this.flammability>0;
	}

}
