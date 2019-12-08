package mctmods.basemod.blocks;

import java.util.Random;

import mctmods.basemod.blocks.base.BlockBaseOre;
import mctmods.basemod.blocks.meta.EnumOre1;
import mctmods.basemod.registry.RegistryBlock;

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

public class BlockOre1 extends BlockBaseOre {

    private static final PropertyEnum<EnumOre1> VARIANT = PropertyEnum.create("blocks", EnumOre1.class);

    public BlockOre1() {
        super(Material.ROCK, MapColor.GRAY, "ore1");
    }

    @Override
    protected BlockStateContainer createBlockState() {
        return new BlockStateContainer(this, VARIANT);
    }

	@Override
	public void getSubBlocks(CreativeTabs tab, NonNullList<ItemStack> list)	{
		for (EnumOre1 type : EnumOre1.values()) {
			list.add(new ItemStack(this, 1, type.ordinal()));
		}
    }

	@Override
    public IBlockState getStateFromMeta(int meta) {
        return getDefaultState().withProperty(VARIANT, EnumOre1.values()[meta]);
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

    @Override
    public void getDrops(NonNullList<ItemStack> drops, IBlockAccess world, BlockPos pos, IBlockState state, int fortune) {
        Random rand = world instanceof World ? ((World)world).rand : RANDOM;

        int count = quantityDropped(state, fortune, rand);
        int meta = this.getMetaFromState(state);

        for (int i = 0; i < count; i++) {
            Item item = this.getItemDropped(state, rand, fortune);
            if (item != Items.AIR) {
            	drops.add(new ItemStack(RegistryBlock.ORE_DROP1, 1, meta));
            	switch(fortune) {
            		case 0:
            			int total0 = 1 + RANDOM.nextInt(100);
            			if( total0 >= 1 && total0 <= 25 ) {
            				drops.add(new ItemStack(RegistryBlock.ORE_DROP1, 1, meta));
            			}
            			break;           			
            		case 1:
            			int total1 = 1 + RANDOM.nextInt(100);
            			if( total1 >= 1 && total1 <= 50 ) {
            				drops.add(new ItemStack(RegistryBlock.ORE_DROP1, 1, meta));
            			}
            			break;           			
            		case 2:
            			int total2 = 1 + RANDOM.nextInt(100);
            			if( total2 >= 1 && total2 <= 75 ) {
            				drops.add(new ItemStack(RegistryBlock.ORE_DROP1, 1, meta));
            			}
            			break;           			
            		case 3:
            			drops.add(new ItemStack(RegistryBlock.ORE_DROP1, 1, meta));
            			break;
            	}
            }
        }
    }

	@SideOnly(Side.CLIENT)
    public void initItemBlockModels() {
    	for (EnumOre1 variant : EnumOre1.values()) {
    		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this), variant.ordinal(), new ModelResourceLocation(Item.getItemFromBlock(this).getRegistryName(), "blocks=" + variant.getName()));
    	}
    }

}
