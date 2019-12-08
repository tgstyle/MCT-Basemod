package mctmods.basemod.items.base;

import mctmods.basemod.Basemod;
import mctmods.basemod.library.util.CreativeTabBM;

import net.minecraft.item.Item;

public class ItemBase extends Item {

    public ItemBase(String registry) {
        setRegistryName(Basemod.MODID, registry);
        setUnlocalizedName(getRegistryName().toString());
        setCreativeTab(CreativeTabBM.MCTBASEMOD_TAB);
    }

}