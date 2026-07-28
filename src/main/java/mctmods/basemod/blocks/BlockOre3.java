package mctmods.basemod.blocks;

import mctmods.basemod.blocks.base.BlockBaseOre;
import mctmods.basemod.blocks.meta.EnumOre3;

import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.init.Items;
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
import java.util.Random;

@SuppressWarnings("deprecation")
public class BlockOre3 extends BlockBaseOre {
	private static final PropertyEnum<EnumOre3> VARIANT = PropertyEnum.create("blocks", EnumOre3.class);

	public BlockOre3() { super(Material.ROCK, MapColor.GRAY, "ore3"); }

	@Override @Nonnull protected BlockStateContainer createBlockState() { return new BlockStateContainer(this, VARIANT); }

	@Override public void getSubBlocks(@Nonnull CreativeTabs tab, @Nonnull NonNullList<ItemStack> list) {
		for(EnumOre3 variant : EnumOre3.values()) {
			list.add(new ItemStack(this, 1, variant.ordinal()));
		}
	}

	@Override @Nonnull public IBlockState getStateFromMeta(int meta) { return getDefaultState().withProperty(VARIANT, EnumOre3.values()[meta]); }

	@Override public int getMetaFromState(IBlockState state) { return state.getValue(VARIANT).ordinal(); }

	@Override public int damageDropped(@Nonnull IBlockState state) { return getMetaFromState(state); }

	public String getRecipeOreDict1(IBlockState state) { return state.getValue(VARIANT).getRecipeOreDict1(); }

	public String getRecipeOreDict2(IBlockState state) { return state.getValue(VARIANT).getRecipeOreDict2(); }

	@Override public int getLightValue(IBlockState state, @Nonnull IBlockAccess world, @Nonnull BlockPos pos) { return state.getValue(VARIANT).getLight(); }

	@Override public int getHarvestLevel(IBlockState state) { return state.getValue(VARIANT).getHarvestLevel(); }

	@Override public float getBlockHardness(IBlockState state, @Nonnull World worldIn, @Nonnull BlockPos pos) { return state.getValue(VARIANT).getHardness(); }

	@Override public float getExplosionResistance(World world, @Nonnull BlockPos pos, Entity exploder, @Nonnull Explosion explosion) { return world.getBlockState(pos).getValue(VARIANT).getResistance() / 5F; }

	@Override public void getDrops(@Nonnull NonNullList<ItemStack> drops, @Nonnull IBlockAccess world, @Nonnull BlockPos pos, @Nonnull IBlockState state, int fortune) {
		Random rand = world instanceof World ? ((World)world).rand : RANDOM;

		int count = quantityDropped(state, fortune, rand);
		EnumOre3 block = state.getValue(VARIANT);
		ItemStack blockDrop1 = new ItemStack(block.getBlockDrop1(), block.getBlockDropAmount1(), block.getBlockDropMeta1());
		ItemStack blockDrop2 = block.getBlockDrop2() == null ? ItemStack.EMPTY : new ItemStack(block.getBlockDrop2(), block.getBlockDropAmount2(), block.getBlockDropMeta2());

		for(int i = 0; i < count; i++) {
			Item item = this.getItemDropped(state, rand, fortune);
			if(item != Items.AIR) {
				drops.add(blockDrop1.copy());

				int total = 1 + rand.nextInt(100);

				switch(fortune) {
					case 0:
						if(total <= 25) { drops.add(blockDrop1.copy()); }
						break;
					case 1:
						if(total <= 50) { drops.add(blockDrop1.copy()); }
						break;
					case 2:
						if(total <= 75) { drops.add(blockDrop1.copy()); }
						break;
					case 3:
						drops.add(blockDrop1.copy());
						break;
				}

				if(!blockDrop2.isEmpty()) {
					switch(fortune) {
						case 0:
							if(total <= 15) { drops.add(blockDrop2.copy()); }
							break;
						case 1:
							if(total <= 25) { drops.add(blockDrop2.copy()); }
							break;
						case 2:
							if(total <= 35) { drops.add(blockDrop2.copy()); }
							break;
						case 3:
							if(total <= 45) { drops.add(blockDrop2.copy()); }
							break;
					}
				}
			}
		}
	}

	@SideOnly(Side.CLIENT)
	public void initItemBlockModels() {
		for(EnumOre3 variant : EnumOre3.values()) {
			ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this), variant.ordinal(), new ModelResourceLocation(Objects.requireNonNull(Item.getItemFromBlock(this).getRegistryName()), "blocks=" + variant.getName()));
		}
	}
}
