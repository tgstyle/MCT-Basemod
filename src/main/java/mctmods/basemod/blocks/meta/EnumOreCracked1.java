package mctmods.basemod.blocks.meta;

import net.minecraft.item.EnumRarity;
import net.minecraft.util.IStringSerializable;

public enum EnumOreCracked1 implements IStringSerializable {

    COPPER_CRACKED_ORE ("copper_cracked_ore", EnumRarity.COMMON, "", "", 0, 2, 3, 15, 64),
    TIN_CRACKED_ORE ("tin_cracked_ore", EnumRarity.COMMON, "", "", 0, 2, 3, 15, 64),
    NICKEL_CRACKED_ORE ("nickel_cracked_ore", EnumRarity.COMMON, "", "", 0, 2, 3, 15, 64),
    IRON_CRACKED_ORE ("iron_cracked_ore", EnumRarity.COMMON, "", "", 0, 1, 3, 15, 64),
    GOLD_CRACKED_ORE ("gold_cracked_ore", EnumRarity.COMMON, "", "", 0, 1, 3, 15, 64),
    REDSTONE_CRACKED_ORE ("redstone_cracked_ore", EnumRarity.COMMON, "", "", 0, 2, 3, 15, 64),
    LAPIS_CRACKED_ORE ("lapis_cracked_ore", EnumRarity.UNCOMMON, "", "", 0, 2, 3, 15, 64),
    BLACKQUARTZ_CRACKED_ORE ("blackquartz_cracked_ore", EnumRarity.UNCOMMON, "", "", 0, 2, 3, 15, 64),
    DIAMOND_CRACKED_ORE ("diamond_cracked_ore", EnumRarity.UNCOMMON, "", "", 0, 2, 3, 15, 64),
    EMERALD_CRACKED_ORE ("emerald_cracked_ore", EnumRarity.UNCOMMON, "", "", 0, 2, 3, 15, 64),
    SILVER_CRACKED_ORE ("silver_cracked_ore", EnumRarity.UNCOMMON, "", "", 0, 2, 3, 15, 64),
    LEAD_CRACKED_ORE ("lead_cracked_ore", EnumRarity.UNCOMMON, "", "", 0, 2, 3, 15, 64),
    ALUMINUM_CRACKED_ORE ("aluminum_cracked_ore", EnumRarity.UNCOMMON, "", "", 0, 2, 3, 15, 64),
    URANIUM_CRACKED_ORE ("uranium_cracked_ore", EnumRarity.UNCOMMON, "", "", 0, 2, 3, 15, 64),
    OSMIUM_CRACKED_ORE ("osmium_cracked_ore", EnumRarity.UNCOMMON, "", "", 0, 2, 3, 15, 64),
    EMERALD_CRACKED_ORE2 ("emerald_cracked_ore2", EnumRarity.COMMON, "", "", 0, 2, 3, 15, 64);

    private String name;
    private EnumRarity rarity;
    private String recipeOreDict1;
    private String recipeOreDict2;
    private int light;
    private int harvestLevel;
    private float hardness;
    private float resistance;
    private int maxSize;

    EnumOreCracked1 (String name, EnumRarity rarity, String recipeOreDict1, String recipeOreDict2, int light, int harvestLevel, float hardness, float resistance, int maxSize) {
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
