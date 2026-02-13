package mctmods.basemod.itemblocks;

import mctmods.basemod.blocks.meta.EnumOre4;
import mctmods.basemod.itemblocks.base.ItemBlockBase;

import net.minecraft.block.Block;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;

import javax.annotation.Nonnull;

public class ItemBlockOre4 extends ItemBlockBase {

	public ItemBlockOre4(Block block) {
		super(block);
		setHasSubtypes(true);
	}

	@Override @Nonnull public String getTranslationKey(ItemStack stack) {
		return super.getTranslationKey() + "." + EnumOre4.values()[stack.getMetadata()].getName();
	}

	@Override @Nonnull public EnumRarity getRarity(ItemStack stack) {
		return EnumOre4.values()[stack.getMetadata()].getRarity();
	}

	@Override public int getItemStackLimit(ItemStack stack) {
		return EnumOre4.values()[stack.getMetadata()].getMaxSize();
	}

	@Override public int getMetadata(int damage) {
		return damage;
	}
}