package mctmods.basemod.blocks.meta;

import net.minecraft.item.EnumRarity;
import net.minecraft.util.IStringSerializable;

public enum EnumMaterials2 implements IStringSerializable {

    COAL_COKE_BLOCK ("coal_coke_block", EnumRarity.COMMON, "blockFuelCoke", "", 0, 1, 3, 15, 64),
    CHARCOAL_BLOCK ("charcoal_block", EnumRarity.COMMON, "blockCharcoal", "", 0, 1, 3, 15, 64),
    REDSTONE_HEATING_ELEMENT ("redstone_heating_element", EnumRarity.UNCOMMON, "", "", 0, 1, 3, 15, 64),
    QUARTZ_ENRICHED_IRON_BLOCK ("quartz_enriched_iron_block", EnumRarity.UNCOMMON, "blockQuartzEnrichedIron", "", 0, 1, 3, 15, 64);

    private String name;
    private EnumRarity rarity;
    private String recipeOreDict1;
    private String recipeOreDict2;
    private int light;
    private int harvestLevel;
    private float hardness;
    private float resistance;
    private int maxSize;

    EnumMaterials2 (String name, EnumRarity rarity, String recipeOreDict1, String recipeOreDict2, int light, int harvestLevel, float hardness, float resistance, int maxSize) {
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
