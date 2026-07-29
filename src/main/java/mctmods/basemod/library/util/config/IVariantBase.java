package mctmods.basemod.library.util.config;

import net.minecraft.item.EnumRarity;

public interface IVariantBase {
    String getName();

    EnumRarity getRarity();

    void setRarity(EnumRarity rarity);

    int getMaxSize();

    void setMaxSize(int maxSize);

    String getRecipeOreDict1();

    void setRecipeOreDict1(String recipeOreDict1);

    String getRecipeOreDict2();

    void setRecipeOreDict2(String recipeOreDict2);
}
