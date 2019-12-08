package mctmods.basemod.items.base;

import mctmods.basemod.Basemod;
import mctmods.basemod.library.util.CreativeTabBM;

import net.minecraft.item.ItemFood;

public class ItemBaseFood extends ItemFood {

	public ItemBaseFood(String registry) {
        super(0, 0, false);
        setRegistryName(Basemod.MODID, registry);
        setUnlocalizedName(getRegistryName().toString());
        setCreativeTab(CreativeTabBM.MCTBASEMOD_TAB);
    }

}