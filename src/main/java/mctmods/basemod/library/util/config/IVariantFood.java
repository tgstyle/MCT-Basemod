package mctmods.basemod.library.util.config;

import net.minecraft.potion.PotionEffect;

public interface IVariantFood extends IVariantBase {
    int getHealAmount();

    void setHealAmount(int healAmount);

    float getSaturation();

    void setSaturation(float saturation);

    PotionEffect getPotion();

    void setPotion(PotionEffect potionEffect);
}
