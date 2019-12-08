package mctmods.basemod.itemblocks;

import mctmods.basemod.blocks.meta.EnumMaterials2;
import mctmods.basemod.itemblocks.base.ItemBlockBase;
import net.minecraft.block.Block;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;

public class ItemBlockMaterials2 extends ItemBlockBase {

    public ItemBlockMaterials2(Block block) {
        super(block);
        setHasSubtypes(true);
    }

    @Override
    public String getUnlocalizedName(ItemStack stack) {
        return super.getUnlocalizedName() + "." + EnumMaterials2.values()[stack.getMetadata()].getName();
    }

    @Override
    public EnumRarity getRarity(ItemStack stack) {
        return EnumMaterials2.values()[stack.getMetadata()].getRarity();
    }

	@Override
	public int getItemStackLimit(ItemStack stack) {
		return EnumMaterials2.values()[stack.getMetadata()].getMaxSize();
	}
	
    @Override
    public int getMetadata(int damage) {
        return damage;
    }

}
