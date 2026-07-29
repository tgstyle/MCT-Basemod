package mctmods.basemod.blocks.meta;

import mctmods.basemod.library.util.config.IVariantBlock;

import net.minecraft.item.EnumRarity;
import net.minecraft.util.IStringSerializable;

import javax.annotation.Nonnull;

public enum EnumOreCracked3 implements IStringSerializable, IVariantBlock {
	COAL_CRACKED_ORE("coal_cracked_ore", EnumRarity.COMMON, "oreCoal", "", 0, 2, 3, 15, 64);

	private final String name;
	private EnumRarity rarity;
	private String recipeOreDict1;
	private String recipeOreDict2;
	private int light;
	private int harvestLevel;
	private float hardness;
	private float resistance;
	private int maxSize;

	EnumOreCracked3(String name, EnumRarity rarity, String recipeOreDict1, String recipeOreDict2, int light, int harvestLevel, float hardness, float resistance, int maxSize) {
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

	@Override @Nonnull public String getName() { return name; }

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

	@Override public void setRarity(EnumRarity rarity) { this.rarity = rarity; }

	@Override public void setRecipeOreDict1(String recipeOreDict1) { this.recipeOreDict1 = recipeOreDict1; }

	@Override public void setRecipeOreDict2(String recipeOreDict2) { this.recipeOreDict2 = recipeOreDict2; }

	@Override public void setMaxSize(int maxSize) { this.maxSize = maxSize; }

	@Override public void setLight(int light) { this.light = light; }

	@Override public void setHarvestLevel(int harvestLevel) { this.harvestLevel = harvestLevel; }

	@Override public void setHardness(float hardness) { this.hardness = hardness; }

	@Override public void setResistance(float resistance) { this.resistance = resistance; }
}
