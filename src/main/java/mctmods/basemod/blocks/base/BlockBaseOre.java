package mctmods.basemod.blocks.base;

import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import javax.annotation.Nonnull;

public class BlockBaseOre extends BlockBase {
	public BlockBaseOre(Material material, MapColor mapColor, String name) {
		super(material, mapColor, name);
	}

	@Override public int getExpDrop(@Nonnull IBlockState state, @Nonnull net.minecraft.world.IBlockAccess world, @Nonnull BlockPos pos, int fortune) {
		return RANDOM.nextInt(4);
	}

	@Override public boolean canSilkHarvest(@Nonnull World world, @Nonnull BlockPos pos, @Nonnull IBlockState state, @Nonnull EntityPlayer player) {
		return false;
	}
}