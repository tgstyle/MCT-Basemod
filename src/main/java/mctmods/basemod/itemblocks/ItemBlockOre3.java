package mctmods.basemod.itemblocks;

import mctmods.basemod.blocks.meta.EnumOre3;
import mctmods.basemod.itemblocks.base.ItemBlockBase;

import net.minecraft.block.Block;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;

public class ItemBlockOre3 extends ItemBlockBase {

	public ItemBlockOre3(Block block) {
		super(block);
		setHasSubtypes(true);
	}

	@Override
	public String getUnlocalizedName(ItemStack stack) {
		return super.getUnlocalizedName() + "." + EnumOre3.values()[stack.getMetadata()].getName();
	}

	@Override
	public EnumRarity getRarity(ItemStack stack) {
		return EnumOre3.values()[stack.getMetadata()].getRarity();
	}

	@Override
	public int getItemStackLimit(ItemStack stack) {
		return EnumOre3.values()[stack.getMetadata()].getMaxSize();
	}

	@Override
	public int getMetadata(int damage) {
		return damage;
	}

}