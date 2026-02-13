package mctmods.basemod.blocks;

import mctmods.basemod.blocks.base.BlockBase;
import mctmods.basemod.blocks.meta.EnumSheetMetal2;

import net.minecraft.block.material.MapColor;
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

import javax.annotation.Nonnull;
import java.util.Objects;

public class BlockSheetMetal2 extends BlockBase {

	private static final PropertyEnum<EnumSheetMetal2> VARIANT = PropertyEnum.create("blocks", EnumSheetMetal2.class);

	public BlockSheetMetal2() {
		super(Material.IRON, MapColor.GRAY, "sheet_metal2");
	}

	@Override @Nonnull protected BlockStateContainer createBlockState() {
		return new BlockStateContainer(this, VARIANT);
	}

	@Override public void getSubBlocks(@Nonnull CreativeTabs tab, @Nonnull NonNullList<ItemStack> list)	{
		for(EnumSheetMetal2 variant : EnumSheetMetal2.values()) {
			list.add(new ItemStack(this, 1, variant.ordinal()));
		}
	}

	@Override @Nonnull public IBlockState getStateFromMeta(int meta) {
		return getDefaultState().withProperty(VARIANT, EnumSheetMetal2.values()[meta]);
	}

	@Override public int getMetaFromState(IBlockState state) {
		return state.getValue(VARIANT).ordinal();
	}

	@Override public int damageDropped(@Nonnull IBlockState state) {
		return getMetaFromState(state);
	}

	public String getRecipeOreDict1(IBlockState state) {
		return state.getValue(VARIANT).getRecipeOreDict1();
	}

	public String getRecipeOreDict2(IBlockState state) {
		return state.getValue(VARIANT).getRecipeOreDict2();
	}

	@Override public int getLightValue(IBlockState state, @Nonnull IBlockAccess world, @Nonnull BlockPos pos) {
		return state.getValue(VARIANT).getLight();
	}

	@Override public int getHarvestLevel(IBlockState state) {
		return state.getValue(VARIANT).getHarvestLevel();
	}

	@Override public float getBlockHardness(IBlockState state, @Nonnull World worldIn, @Nonnull BlockPos pos) {
		return state.getValue(VARIANT).getHardness();
	}

	@Override public float getExplosionResistance(World world, @Nonnull BlockPos pos, Entity exploder, @Nonnull Explosion explosion) {
		return world.getBlockState(pos).getValue(VARIANT).getResistance() / 5F;
	}

	@SideOnly(Side.CLIENT)
	public void initItemBlockModels() {
		for(EnumSheetMetal2 variant : EnumSheetMetal2.values()) {
			ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this), variant.ordinal(), new ModelResourceLocation(Objects.requireNonNull(Item.getItemFromBlock(this).getRegistryName()), "blocks=" + variant.getName()));
		}
	}
}