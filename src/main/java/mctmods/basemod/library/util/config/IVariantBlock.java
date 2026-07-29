package mctmods.basemod.library.util.config;

public interface IVariantBlock extends IVariantBase {
    int getLight();

    void setLight(int light);

    int getHarvestLevel();

    void setHarvestLevel(int harvestLevel);

    float getHardness();

    void setHardness(float hardness);

    float getResistance();

    void setResistance(float resistance);
}
