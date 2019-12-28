package mctmods.basemod.items;

import mctmods.basemod.items.base.ItemBase;
import mctmods.basemod.items.meta.EnumMaterials;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemMaterials extends ItemBase {

	public ItemMaterials() {
		super("materials");
		setHasSubtypes(true);
	}

	@Override
	public void getSubItems(CreativeTabs tab, NonNullList<ItemStack> list) {
		if(this.isInCreativeTab(tab)) {
			for(EnumMaterials type : EnumMaterials.values()) {
				if(type.getName() != "open") {
					list.add(new ItemStack(this, 1, type.ordinal()));
				}
			}
		}
	}

	@Override
	public String getUnlocalizedName(ItemStack stack) {
		return super.getUnlocalizedName() + "." + EnumMaterials.values()[stack.getMetadata()].getName();
	}

	@Override
	public EnumRarity getRarity(ItemStack stack) {
		return EnumMaterials.values()[stack.getMetadata()].getRarity();
	}

	@Override
	public int getItemStackLimit(ItemStack stack) {
		return EnumMaterials.values()[stack.getMetadata()].getMaxSize();
	}

	@Override
	public int getMetadata(int meta) {
		return meta;
	}

	@SideOnly(Side.CLIENT)
	public void initItemModels() {
		for(EnumMaterials variant : EnumMaterials.values()) {
			ModelLoader.setCustomModelResourceLocation(this, variant.ordinal(), new ModelResourceLocation(this.getRegistryName() + "/" + variant.getName(), "inventory"));
		}
	}

}