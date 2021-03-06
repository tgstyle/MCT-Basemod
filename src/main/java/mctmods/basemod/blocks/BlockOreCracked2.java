package mctmods.basemod.blocks;

import mctmods.basemod.blocks.base.BlockBaseOreCracked;
import mctmods.basemod.blocks.meta.EnumOreCracked2;

import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.Explosion;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockOreCracked2 extends BlockBaseOreCracked {

	private static final PropertyEnum<EnumOreCracked2> VARIANT = PropertyEnum.create("blocks", EnumOreCracked2.class);

	public BlockOreCracked2() {
		super(Material.SAND, "ore_cracked2");
	}

	@Override
	protected BlockStateContainer createBlockState() {
		return new BlockStateContainer(this, VARIANT);
	}

	@Override
	public void getSubBlocks(CreativeTabs tab, NonNullList<ItemStack> list)	{
		for(EnumOreCracked2 variant : EnumOreCracked2.values()) {
			list.add(new ItemStack(this, 1, variant.ordinal()));
		}
	}

	@Override
	public IBlockState getStateFromMeta(int meta) {
		return getDefaultState().withProperty(VARIANT, EnumOreCracked2.values()[meta]);
	}

	@Override
	public int getMetaFromState(IBlockState state) {
		return state.getValue(VARIANT).ordinal();
	}

	@Override
	public int damageDropped(IBlockState state) {
		return getMetaFromState(state);
	}

	public String getRecipeOreDict1(IBlockState state) {
		return state.getValue(VARIANT).getRecipeOreDict1();
	}

	public String getRecipeOreDict2(IBlockState state) {
		return state.getValue(VARIANT).getRecipeOreDict2();
	}

	@Override
	public int getLightValue(IBlockState state, IBlockAccess world, BlockPos pos) {
		return state.getValue(VARIANT).getLight();
	}

	@Override
	public int getHarvestLevel(IBlockState state) {
		return state.getValue(VARIANT).getHarvestLevel();
	}

	@Override
	public float getBlockHardness(IBlockState state, World worldIn, BlockPos pos) {
		return state.getValue(VARIANT).getHardness();
	}

	@Override
	public float getExplosionResistance(World world, BlockPos pos, Entity exploder, Explosion explosion) {
		return world.getBlockState(pos).getValue(VARIANT).getResistance() / 5F;
	}

	@SideOnly(Side.CLIENT)
	public void initItemBlockModels() {
		for(EnumOreCracked2 variant : EnumOreCracked2.values()) {
			ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this), variant.ordinal(), new ModelResourceLocation(Item.getItemFromBlock(this).getRegistryName(), "blocks=" + variant.getName()));
		}
	}

}