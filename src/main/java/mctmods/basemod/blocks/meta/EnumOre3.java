package mctmods.basemod.blocks.meta;

import net.minecraft.item.EnumRarity;
import net.minecraft.util.IStringSerializable;

public enum EnumOre3 implements IStringSerializable {

	BLACKQUARTZ_POOR_ORE ("blackquartz_poor_ore", EnumRarity.UNCOMMON, "mctPoorBlackQuartz", "", 0, 3, 3, 15, 64),
	BLACKQUARTZ_ORE ("blackquartz_ore", EnumRarity.UNCOMMON, "mctBlackQuartz", "", 0, 3, 3, 15, 64),
	BLACKQUARTZ_DENSE_ORE ("blackquartz_dense_ore", EnumRarity.UNCOMMON, "mctDenseBlackQuartz", "", 0, 3, 3, 15, 64),
	GALENA_POOR_ORE ("galena_poor_ore", EnumRarity.UNCOMMON, "mctPoorGalena", "", 0, 3, 3, 15, 64),
	GALENA_ORE ("galena_ore", EnumRarity.UNCOMMON, "mctGalena", "", 0, 3, 3, 15, 64),
	GALENA_DENSE_ORE ("galena_dense_ore", EnumRarity.UNCOMMON, "mctDenseGalena", "", 0, 3, 3, 15, 64),
	BAUXITE_POOR_ORE ("bauxite_poor_ore", EnumRarity.UNCOMMON, "mctPoorBauxite", "", 0, 3, 3, 15, 64),
	BAUXITE_ORE ("bauxite_ore", EnumRarity.UNCOMMON, "mctBauxite", "", 0, 3, 3, 15, 64),
	BAUXITE_DENSE_ORE ("bauxite_dense_ore", EnumRarity.UNCOMMON, "mctDenseBauxite", "", 0, 3, 3, 15, 64),
	URANIUM_POOR_ORE ("uranium_poor_ore", EnumRarity.UNCOMMON, "mctPoorUranium", "", 0, 3, 3, 15, 64),
	URANIUM_ORE ("uranium_ore", EnumRarity.UNCOMMON, "mctUranium", "", 0, 3, 3, 15, 64),
	URANIUM_DENSE_ORE ("uranium_dense_ore", EnumRarity.UNCOMMON, "mctDenseUranium", "", 0, 3, 3, 15, 64),
	OSMIUM_POOR_ORE ("osmium_poor_ore", EnumRarity.UNCOMMON, "mctPoorOsmium", "", 0, 3, 3, 15, 64),
	OSMIUM_ORE ("osmium_ore", EnumRarity.UNCOMMON, "mctOsmium", "", 0, 3, 3, 15, 64),
	OSMIUM_DENSE_ORE ("osmium_dense_ore", EnumRarity.UNCOMMON, "mctDenseOsmium", "", 0, 3, 3, 15, 64);

    private String name;
    private EnumRarity rarity;
    private String recipeOreDict1;
    private String recipeOreDict2;
    private int light;
    private int harvestLevel;
    private float hardness;
    private float resistance;
    private int maxSize;

    EnumOre3 (String name, EnumRarity rarity, String recipeOreDict1, String recipeOreDict2, int light, int harvestLevel, float hardness, float resistance, int maxSize) {
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
