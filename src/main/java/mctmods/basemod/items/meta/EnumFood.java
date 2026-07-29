package mctmods.basemod.items.meta;

import mctmods.basemod.library.util.config.IVariantFood;

import net.minecraft.init.MobEffects;
import net.minecraft.item.EnumRarity;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.IStringSerializable;

import javax.annotation.Nonnull;

public enum EnumFood implements IStringSerializable, IVariantFood {
	SWEER_POTATO	("sweer_potato"	, EnumRarity.RARE		, "", "", 1, 20, 1.0F, new PotionEffect(MobEffects.INSTANT_HEALTH, 1, 2, false, false)),
	CHICKEN_NUGGER	("chicken_nugger"	, EnumRarity.RARE		, "", "", 1, 20, 1.0F, new PotionEffect(MobEffects.INSTANT_HEALTH, 1, 2, false, false)),
	HAPPY_MEAL		("happy_meal"		, EnumRarity.UNCOMMON	, "", "", 8, 16, 0.5F, new PotionEffect(MobEffects.INSTANT_HEALTH, 1, 1, false, false));

	private final String name;
	private EnumRarity rarity;
	private String recipeOreDict1;
	private String recipeOreDict2;
	private int maxSize;
	private int healAmount;
	private float saturation;
	private PotionEffect potionEffect;

	EnumFood(String name, EnumRarity rarity, String recipeOreDict1, String recipeOreDict2, int maxSize, int healAmount, float saturation, PotionEffect potionEffect) {
		this.name = name;
		this.rarity = rarity;
		this.recipeOreDict1 = recipeOreDict1;
		this.recipeOreDict2 = recipeOreDict2;
		this.maxSize = maxSize;
		this.saturation = saturation;
		this.healAmount = healAmount;
		this.potionEffect = potionEffect;
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

	public PotionEffect getPotion() { return potionEffect; }

	@Override public void setRarity(EnumRarity rarity) { this.rarity = rarity; }

	@Override public void setRecipeOreDict1(String recipeOreDict1) { this.recipeOreDict1 = recipeOreDict1; }

	@Override public void setRecipeOreDict2(String recipeOreDict2) { this.recipeOreDict2 = recipeOreDict2; }

	@Override public void setMaxSize(int maxSize) { this.maxSize = maxSize; }

	@Override public void setHealAmount(int healAmount) { this.healAmount = healAmount; }

	@Override public void setSaturation(float saturation) { this.saturation = saturation; }

	@Override public void setPotion(PotionEffect potionEffect) { this.potionEffect = potionEffect; }
}
