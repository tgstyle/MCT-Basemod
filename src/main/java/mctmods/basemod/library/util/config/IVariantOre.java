package mctmods.basemod.library.util.config;

import net.minecraft.block.Block;

public interface IVariantOre extends IVariantBlock {
    Block getBlockDrop1();

    void setBlockDrop1(Block blockDrop1);

    int getBlockDropAmount1();

    void setBlockDropAmount1(int blockDropAmount1);

    int getBlockDropMeta1();

    void setBlockDropMeta1(int blockDropMeta1);

    Block getBlockDrop2();

    void setBlockDrop2(Block blockDrop2);

    int getBlockDropAmount2();

    void setBlockDropAmount2(int blockDropAmount2);

    int getBlockDropMeta2();

    void setBlockDropMeta2(int blockDropMeta2);
}
