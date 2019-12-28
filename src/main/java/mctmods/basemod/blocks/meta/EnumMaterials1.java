package mctmods.basemod.blocks.meta;

import net.minecraft.item.EnumRarity;
import net.minecraft.util.IStringSerializable;

public enum EnumMaterials1 implements IStringSerializable {

	COPPER_BLOCK("copper_block", EnumRarity.COMMON, "blockCopper", "", 0, 2, 3, 15, 64),
	TIN_BLOCK("tin_block", EnumRarity.COMMON, "blockTin", "", 0, 2, 3, 15, 64),
	NICKEL_BLOCK("nickel_block", EnumRarity.COMMON, "blockNickel", "", 0, 2, 3, 15, 64),
	INVAR_BLOCK("invar_block", EnumRarity.COMMON, "blockInvar", "", 0, 2, 3, 15, 64),
	BRONZE_BLOCK("bronze_block", EnumRarity.COMMON, "blockBronze", "", 0, 2, 3, 15, 64),
	STEEL_BLOCK("steel_block", EnumRarity.COMMON, "blockSteel", "", 0, 2, 3, 15, 64),
	CONSTANTAN_BLOCK("constantan_block", EnumRarity.COMMON, "blockConstantan", "", 0, 2, 3, 15, 64),
	SILVER_BLOCK("silver_block", EnumRarity.UNCOMMON, "blockSilver", "", 0, 2, 3, 15, 64),
	LEAD_BLOCK("lead_block", EnumRarity.UNCOMMON, "blockLead", "", 0, 2, 3, 15, 64),
	ALUMINUM_BLOCK("aluminum_block", EnumRarity.UNCOMMON, "blockAluminum", "", 0, 2, 3, 15, 64),
	URANIUM_BLOCK("uranium_block", EnumRarity.UNCOMMON, "blockUranium", "", 0, 2, 3, 15, 64),
	OSMIUM_BLOCK("osmium_block", EnumRarity.UNCOMMON, "blockOsmium", "", 0, 2, 3, 15, 64),
	ELECTRUM_BLOCK("electrum_block", EnumRarity.UNCOMMON, "blockElectrum", "", 0, 2, 3, 15, 64),
	IRIDIUM_BLOCK("iridium_block", EnumRarity.EPIC, "blockIridium", "", 0, 2, 3, 15, 64),
	DRACONIUM_BLOCK("draconium_block", EnumRarity.EPIC, "blockDraconium", "", 0, 2, 3, 15, 64),
	AWAKENED_DRACONIUM_BLOCK("awakened_draconium_block", EnumRarity.EPIC, "blockDraconiumAwakened", "", 0, 2, 3, 15, 64);

	private String name;
	private EnumRarity rarity;
	private String recipeOreDict1;
	private String recipeOreDict2;
	private int light;
	private int harvestLevel;
	private float hardness;
	private float resistance;
	private int maxSize;

	EnumMaterials1(String name, EnumRarity rarity, String recipeOreDict1, String recipeOreDict2, int light, int harvestLevel, float hardness, float resistance, int maxSize) {
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