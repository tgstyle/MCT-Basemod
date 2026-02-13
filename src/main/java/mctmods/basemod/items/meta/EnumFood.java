package mctmods.basemod.items.meta;

import net.minecraft.item.EnumRarity;
import net.minecraft.util.IStringSerializable;

import javax.annotation.Nonnull;

public enum EnumFood implements IStringSerializable {

	SWEER_POTATO   ("sweer_potato"    , EnumRarity.RARE     , "", "", 1, 20, 5.0F),
	CHICKEN_NUGGER ("chicken_nugger"  , EnumRarity.RARE     , "", "", 1, 20, 5.0F),
	HAPPY_MEAL    ("happy_meal"     , EnumRarity.UNCOMMON  , "", "", 8, 18, 0.5F);

	private final String name;
	private final EnumRarity rarity;
	private final String recipeOreDict1;
	private final String recipeOreDict2;
	private final int maxSize;
	private final int healAmount;
	private final float saturation;

	EnumFood(String name, EnumRarity rarity, String recipeOreDict1, String recipeOreDict2, int maxSize, int healAmount, float saturation) {
		this.name = name;
		this.rarity = rarity;
		this.recipeOreDict1 = recipeOreDict1;
		this.recipeOreDict2 = recipeOreDict2;
		this.maxSize = maxSize;
		this.healAmount = healAmount;
		this.saturation = saturation;
	}

	@Override @Nonnull public String getName() {
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

	public int getMaxSize() {
		return maxSize;
	}

	public int getHealAmount() {
		return healAmount;
	}

	public float getSaturation() {
		return saturation;
	}
}