package mctmods.basemod.blocks.meta;

import mctmods.basemod.library.util.config.IVariantBlock;

import net.minecraft.item.EnumRarity;
import net.minecraft.util.IStringSerializable;

import javax.annotation.Nonnull;

public enum EnumMaterials2 implements IStringSerializable, IVariantBlock {
	COAL_COKE_BLOCK				("coal_coke_block"			, EnumRarity.COMMON		, "blockFuelCoke"			, "", 0, 1, 3, 15, 64),
	CHARCOAL_BLOCK				("charcoal_block"				, EnumRarity.COMMON		, "blockCharcoal"			, "", 0, 1, 3, 15, 64),
	REDSTONE_HEATING_ELEMENT	("redstone_heating_element"	, EnumRarity.COMMON		, ""						, "", 0, 1, 3, 15, 64),
	QUARTZ_ENRICHED_IRON_BLOCK	("quartz_enriched_iron_block"	, EnumRarity.UNCOMMON	, "blockQuartzEnrichedIron", "", 0, 1, 3, 15, 64),
	KNIGHT_SLIME_BLOCK			("knight_slime_block"			, EnumRarity.COMMON		, "blockKnightslime"		, "", 0, 1, 3, 15, 64),
	ALUMINUM_BRASS_BLOCK		("aluminum_brass_block"		, EnumRarity.UNCOMMON	, "blockAlubrass"			, "", 0, 1, 3, 15, 64),
	ARDITE_BLOCK				("ardite_block"				, EnumRarity.RARE		, "blockArdite"			, "", 0, 1, 3, 15, 64),
	COBALT_BLOCK				("cobalt_block"				, EnumRarity.RARE		, "blockCobalt"			, "", 0, 1, 3, 15, 64),
	MANYULLYN_BLOCK				("manyullyn_block"			, EnumRarity.RARE		, "blockManyullyn"			, "", 0, 1, 3, 15, 64),
	REFINED_OBSIDIAN_BLOCK		("refined_obsidian_block"		, EnumRarity.UNCOMMON	, "blockRefinedObsidian"	, "", 0, 1, 3, 15, 64),
	REFINED_GLOWSTONE_BLOCK		("refined_glowstone_block"	, EnumRarity.RARE		, "blockRefinedGlowstone"	, "", 0, 1, 3, 15, 64);

	private final String name;
	private EnumRarity rarity;
	private String recipeOreDict1;
	private String recipeOreDict2;
	private int light;
	private int harvestLevel;
	private float hardness;
	private float resistance;
	private int maxSize;

	EnumMaterials2(String name, EnumRarity rarity, String recipeOreDict1, String recipeOreDict2, int light, int harvestLevel, float hardness, float resistance, int maxSize) {
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
