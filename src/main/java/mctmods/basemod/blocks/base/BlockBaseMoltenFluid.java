package mctmods.basemod.blocks.base;

import net.minecraft.block.material.Material;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

import net.minecraftforge.fluids.Fluid;

import javax.annotation.Nonnull;

public class BlockBaseMoltenFluid extends BlockBaseFluid {
	public BlockBaseMoltenFluid(Fluid fluid, Material material, String name) { super(fluid, material, name); }

	private int flammability = 0;
	private int fireSpread = 0;


	public BlockBaseMoltenFluid setFlammability(int flammability, int fireSpread)	{
		this.flammability = flammability;
		this.fireSpread = fireSpread;
		return this;
	}

	@Override public int getFlammability(@Nonnull IBlockAccess world, @Nonnull BlockPos pos, @Nonnull EnumFacing face) { return this.flammability; }

	@Override public int getFireSpreadSpeed(@Nonnull IBlockAccess world, @Nonnull BlockPos pos, @Nonnull EnumFacing face) { return fireSpread; }

	@Override public boolean isFlammable(@Nonnull IBlockAccess world, @Nonnull BlockPos pos, @Nonnull EnumFacing face) { return this.flammability > 0; }
}