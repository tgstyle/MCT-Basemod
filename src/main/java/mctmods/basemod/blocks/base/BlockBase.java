package mctmods.basemod.blocks.base;

import mctmods.basemod.Basemod;
import mctmods.basemod.library.util.CreativeTabBM;

import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;

public class BlockBase extends Block {

    public BlockBase(Material material, MapColor mapColor, String registry) {
        super(material, mapColor);
        setRegistryName(Basemod.MODID, registry);
        setUnlocalizedName(getRegistryName().toString());
        setCreativeTab(CreativeTabBM.MCTBASEMOD_TAB);
        setHarvestLevel("pickaxe", 0);
    }

}
