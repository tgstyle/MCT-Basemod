package mctmods.basemod.itemblocks;

import mctmods.basemod.blocks.meta.EnumMaterials1;
import mctmods.basemod.itemblocks.base.ItemBlockBase;
import net.minecraft.block.Block;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;

public class ItemBlockMaterials1 extends ItemBlockBase {

    public ItemBlockMaterials1(Block block) {
        super(block);
        setHasSubtypes(true);
    }

    @Override
    public String getUnlocalizedName(ItemStack stack) {
        return super.getUnlocalizedName() + "." + EnumMaterials1.values()[stack.getMetadata()].getName();
    }

    @Override
    public EnumRarity getRarity(ItemStack stack) {
        return EnumMaterials1.values()[stack.getMetadata()].getRarity();
    }

	@Override
	public int getItemStackLimit(ItemStack stack) {
		return EnumMaterials1.values()[stack.getMetadata()].getMaxSize();
	}
	
    @Override
    public int getMetadata(int damage) {
        return damage;
    }

}
