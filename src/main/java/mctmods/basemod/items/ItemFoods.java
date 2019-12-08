package mctmods.basemod.items;

import mctmods.basemod.items.base.ItemBaseFood;
import mctmods.basemod.items.meta.EnumFood;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemFoods extends ItemBaseFood {

	public ItemFoods() {
        super("foods");
        setHasSubtypes(true);
    }

    @Override
	public void getSubItems(CreativeTabs tab, NonNullList<ItemStack> list) {
		if (this.isInCreativeTab(tab)) {
			for (EnumFood type : EnumFood.values()) {
				list.add(new ItemStack(this, type.getMaxSize(), type.ordinal()));
			}
		}
	}

    @Override
	public String getUnlocalizedName(ItemStack stack) {
        return super.getUnlocalizedName() + "." + EnumFood.values()[stack.getMetadata()].getName();
    }

    @Override
    public EnumRarity getRarity(ItemStack stack) {
        return EnumFood.values()[stack.getMetadata()].getRarity();
    }

	@Override
	public int getItemStackLimit(ItemStack stack) {
		return EnumFood.values()[stack.getMetadata()].getMaxSize();
	}
	
	@Override
    public int getHealAmount(ItemStack stack) {
        return EnumFood.values()[stack.getMetadata()].getHealAmount();
    }
    
	@Override
    public float getSaturationModifier(ItemStack stack) {
        return EnumFood.values()[stack.getMetadata()].getSaturation();
    }
	
    @Override
    public int getMetadata(int damage) {
        return damage;
    }

    @SideOnly(Side.CLIENT)
    public void initItemModels() {
    	for (EnumFood variant : EnumFood.values()) {
    		ModelLoader.setCustomModelResourceLocation(this, variant.ordinal(), new ModelResourceLocation(this.getRegistryName() + "/" + variant.getName(), "inventory"));
    	}
    }

}