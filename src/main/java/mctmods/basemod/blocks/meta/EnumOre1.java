package mctmods.basemod.blocks.meta;

import net.minecraft.item.EnumRarity;
import net.minecraft.util.IStringSerializable;

public enum EnumOre1 implements IStringSerializable {

    COPPER_POOR_ORE ("copper_poor_ore", EnumRarity.COMMON, "mctPoorCopper", "", 0, 2, 3, 15, 64),
    COPPER_ORE ("copper_ore", EnumRarity.COMMON, "mctCopper", "", 0, 2, 3, 15, 64),
    COPPER_DENSE_ORE ("copper_dense_ore", EnumRarity.COMMON, "mctDenseCopper", "", 0, 2, 3, 15, 64),
    TIN_POOR_ORE ("tin_poor_ore", EnumRarity.COMMON, "mctPoorTin", "", 0, 2, 3, 15, 64),
    TIN_ORE ("tin_ore", EnumRarity.COMMON, "mctTin", "", 0, 2, 3, 15, 64),
    TIN_DENSE_ORE ("tin_dense_ore", EnumRarity.COMMON, "mctDenseTin", "", 0, 2, 3, 15, 64),
    NICKEL_POOR_ORE ("nickel_poor_ore", EnumRarity.COMMON, "mctPoorNickel", "", 0, 2, 3, 15, 64),
    NICKEL_ORE ("nickel_ore", EnumRarity.COMMON, "mctNickel", "", 0, 2, 3, 15, 64),
    NICKEL_DENSE_ORE ("nickel_dense_ore", EnumRarity.COMMON, "mctDenseNickel", "", 0, 2, 3, 15, 64),
    IRON_POOR_ORE ("iron_poor_ore", EnumRarity.COMMON, "mctPoorIron", "", 0, 1, 3, 15, 64),
	IRON_ORE ("iron_ore", EnumRarity.COMMON, "mctIron", "", 0, 2, 3, 15, 64),
    IRON_DENSE_ORE ("iron_dense_ore", EnumRarity.COMMON, "mctDenseIron", "", 0, 2, 3, 15, 64),
    GOLD_POOR_ORE ("gold_poor_ore", EnumRarity.COMMON, "mctPoorGold", "", 0, 1, 3, 15, 64),
    GOLD_ORE ("gold_ore", EnumRarity.COMMON, "mctGold", "", 0, 2, 3, 15, 64),
    GOLD_DENSE_ORE ("gold_dense_ore", EnumRarity.COMMON, "mctDenseGold", "", 0, 2, 3, 15, 64);

    private String name;
    private EnumRarity rarity;
    private String recipeOreDict1;
    private String recipeOreDict2;
    private int light;
    private int harvestLevel;
    private float hardness;
    private float resistance;
    private int maxSize;

    EnumOre1 (String name, EnumRarity rarity, String recipeOreDict1, String recipeOreDict2, int light, int harvestLevel, float hardness, float resistance, int maxSize) {
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
