package mctmods.basemod.blocks.base;

import mctmods.basemod.Basemod;
import mctmods.basemod.library.util.CreativeTabBM;

import net.minecraft.block.BlockFalling;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockBaseOreCracked extends BlockFalling {

    public BlockBaseOreCracked(Material material,String registry) {
        super(material);
        setRegistryName(Basemod.MODID, registry);
        setUnlocalizedName(getRegistryName().toString());
        setCreativeTab(CreativeTabBM.MCTBASEMOD_TAB);
        setHarvestLevel("shovel", 0);
        setSoundType(SoundType.GROUND);
    }

}
