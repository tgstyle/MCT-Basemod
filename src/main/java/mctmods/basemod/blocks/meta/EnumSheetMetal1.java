package mctmods.basemod.blocks.meta;

import net.minecraft.item.EnumRarity;
import net.minecraft.util.IStringSerializable;

public enum EnumSheetMetal1 implements IStringSerializable {

	COPPER_SHEET_METAL("copper_sheet_metal", EnumRarity.COMMON, "blockSheetmetalCopper", "", 0, 2, 3, 15, 64),
	TIN_SHEET_METAL("tin_sheet_metal", EnumRarity.COMMON, "blockSheetmetalTin", "", 0, 2, 3, 15, 64),
	NICKEL_SHEET_METAL("nickel_sheet_metal", EnumRarity.COMMON, "blockSheetmetalNickel", "", 0, 2, 3, 15, 64),
	INVAR_SHEET_METAL("invar_sheet_metal", EnumRarity.COMMON, "blockSheetmetalInvar", "", 0, 2, 3, 15, 64),
	BRONZE_SHEET_METAL("bronze_sheet_metal", EnumRarity.COMMON, "blockSheetmetalBronze", "", 0, 2, 3, 15, 64),
	STEEL_SHEET_METAL("steel_sheet_metal", EnumRarity.COMMON, "blockSheetmetalSteel", "", 0, 2, 3, 15, 64),
	CONSTANTAN_SHEET_METAL("constantan_sheet_metal", EnumRarity.COMMON, "blockSheetmetalConstantan", "", 0, 2, 3, 15, 64),
	IRON_SHEET_METAL("iron_sheet_metal", EnumRarity.COMMON, "blockSheetmetalIron", "", 0, 2, 3, 15, 64),
	GOLD_SHEET_METAL("gold_sheet_metal", EnumRarity.COMMON, "blockSheetmetalGold", "", 0, 2, 3, 15, 64),
	SILVER_SHEET_METAL("silver_sheet_metal", EnumRarity.UNCOMMON, "blockSheetmetalSilver", "", 0, 2, 3, 15, 64),
	LEAD_SHEET_METAL("lead_sheet_metal", EnumRarity.UNCOMMON, "blockSheetmetalLead", "", 0, 2, 3, 15, 64),
	ALUMINUM_SHEET_METAL("aluminum_sheet_metal", EnumRarity.UNCOMMON, "blockSheetmetalAluminum", "", 0, 2, 3, 15, 64),
	ELECTRUM_SHEET_METAL("electrum_sheet_metal", EnumRarity.UNCOMMON, "blockSheetmetalElectrum", "", 0, 2, 3, 15, 64),
	SIGNALUM_SHEET_METAL("signalum_sheet_metal", EnumRarity.RARE, "blockSheetmetalSignalum", "", 0, 2, 3, 15, 64),
	ENDERIUM_SHEET_METAL("enderium_sheet_metal", EnumRarity.EPIC, "blockSheetmetalEnderium", "", 0, 2, 3, 15, 64),
	LUMIUM_SHEET_METAL("lumium_sheet_metal", EnumRarity.RARE, "blockSheetmetalLumium", "", 0, 2, 3, 15, 64);

	private String name;
	private EnumRarity rarity;
	private String recipeOreDict1;
	private String recipeOreDict2;
	private int light;
	private int harvestLevel;
	private float hardness;
	private float resistance;
	private int maxSize;

	EnumSheetMetal1(String name, EnumRarity rarity, String recipeOreDict1, String recipeOreDict2, int light, int harvestLevel, float hardness, float resistance, int maxSize) {
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