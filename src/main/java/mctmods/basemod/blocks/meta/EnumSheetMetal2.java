package mctmods.basemod.blocks.meta;

import net.minecraft.item.EnumRarity;
import net.minecraft.util.IStringSerializable;

public enum EnumSheetMetal2 implements IStringSerializable {

	OSMIUM_SHEET_METAL				("osmium_sheet_metal"				, EnumRarity.UNCOMMON	, "blockSheetmetalOsmium"			, "", 0, 2, 3, 15, 64),
	WOOD_SHEET_BLOCK				("wood_sheet_block"					, EnumRarity.COMMON		, "blockSheetWood"					, "", 0, 2, 3, 15, 64),
	STONE_SHEET_BLOCK				("stone_sheet_block"				, EnumRarity.COMMON		, "blockSheetStone"					, "", 0, 2, 3, 15, 64),
	DIAMOND_SHEET_BLOCK				("diamond_sheet_block"				, EnumRarity.COMMON		, "blockSheetDiamond"				, "", 0, 2, 3, 15, 64),
	IRIDIUM_SHEET_METAL				("iridium_sheet_metal"				, EnumRarity.EPIC		, "blockSheetmetalIridium"			, "", 0, 2, 3, 15, 64),
	DRACONIUM_SHEET_METAL			("draconium_sheet_metal"			, EnumRarity.EPIC		, "blockSheetmetalDraconium"		, "", 0, 2, 3, 15, 64),
	AWAKENED_DRACONIUM_SHEET_METAL	("awakened_draconium_sheet_metal"	, EnumRarity.EPIC		, "blockSheetmetalDraconiumAwakened", "", 0, 2, 3, 15, 64);

	private String name;
	private EnumRarity rarity;
	private String recipeOreDict1;
	private String recipeOreDict2;
	private int light;
	private int harvestLevel;
	private float hardness;
	private float resistance;
	private int maxSize;

	EnumSheetMetal2(String name, EnumRarity rarity, String recipeOreDict1, String recipeOreDict2, int light, int harvestLevel, float hardness, float resistance, int maxSize) {
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