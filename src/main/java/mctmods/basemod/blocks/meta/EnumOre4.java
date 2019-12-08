package mctmods.basemod.blocks.meta;

import net.minecraft.item.EnumRarity;
import net.minecraft.util.IStringSerializable;

public enum EnumOre4 implements IStringSerializable {

	QUARTZ_POOR_ORE ("quartz_poor_ore", EnumRarity.RARE, "mctPoorQuartz", "", 0, 4, 3, 15, 64),
	QUARTZ_ORE ("quartz_ore", EnumRarity.RARE, "mctQuartz", "", 0, 4, 3, 15, 64),
	QUARTZ_DENSE_ORE ("quartz_dense_ore", EnumRarity.RARE, "mctDenseQuartz", "", 0, 4, 3, 15, 64),
	ARDITE_ORE ("ardite_ore", EnumRarity.RARE, "mctArdite", "", 0, 4, 3, 15, 64),
	COBALT_ORE ("cobalt_ore", EnumRarity.RARE, "mctCobalt", "", 0, 4, 3, 15, 64),
	BIOTITE_ORE ("biotite_ore", EnumRarity.EPIC, "mctBiotite", "", 0, 4, 3, 15, 64),
	IRIDIUM_ORE ("iridium_ore", EnumRarity.EPIC, "mctIridium", "", 0, 4, 3, 15, 64),
	END_ORE ("end_ore", EnumRarity.EPIC, "mctEnd", "", 0, 4, 3, 15, 64),
	DRACONIUM_ORE ("draconium_ore", EnumRarity.EPIC, "mctDraconium", "", 0, 4, 4, 15, 64);

    private String name;
    private EnumRarity rarity;
    private String recipeOreDict1;
    private String recipeOreDict2;
    private int light;
    private int harvestLevel;
    private float hardness;
    private float resistance;
    private int maxSize;

    EnumOre4 (String name, EnumRarity rarity, String recipeOreDict1, String recipeOreDict2, int light, int harvestLevel, float hardness, float resistance, int maxSize) {
        this.name = name;
        this.rarity = rarity;
        this.recipeOreDict1 = recipeOreDict1;
        this.recipeOreDict2 = recipeOreDict2;
        this.light = light;
        this.harvestLevel = harvestLevel;
        this.hardness = hardness;
        this.resistance = resistance;
    	this.maxSize = maxSize;
    }

    @Override
    public String getName() {
        return name;
    }

    public EnumRarity getRarity() {
        return rarity;
    }

    public String getRecipeOreDict1() {
        return recipeOreDict1;
    }

    public String getRecipeOreDict2() {
        return recipeOreDict2;
    }

    public int getLight() {
        return light;
    }

    public int getHarvestLevel() {
        return harvestLevel;
    }

    public float getHardness() {
        return hardness;
    }

    public float getResistance() {
        return resistance;
    }

 	public int getMaxSize() {
 		return maxSize;
 	}

}
