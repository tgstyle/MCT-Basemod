package mctmods.basemod.blocks.meta;

import net.minecraft.item.EnumRarity;
import net.minecraft.util.IStringSerializable;

public enum EnumOreCracked2 implements IStringSerializable {

	DESTABALIZED_REDSTONE_CRACKED_ORE	("destabalized_redstone_cracked_ore", EnumRarity.RARE, "oreClathrateRedstone"	, "", 0, 2, 3, 15, 64),
	ENERGIZED_GLOWSTONE_CRACKED_ORE		("energized_glowstone_cracked_ore"	, EnumRarity.RARE, "oreClathrateGlowstone"	, "", 0, 2, 3, 15, 64),
	QUARTZ_CRACKED_ORE					("quartz_cracked_ore"				, EnumRarity.RARE, "oreQuartz"				, "", 0, 2, 3, 15, 64),
	ARDITE_CRACKED_ORE					("ardite_cracked_ore"				, EnumRarity.RARE, "oreArdite"				, "", 0, 1, 3, 15, 64),
	COBALT_CRACKED_ORE					("cobalt_cracked_ore"				, EnumRarity.RARE, "oreCobalt"				, "", 0, 1, 3, 15, 64),
	RESONANT_END_STONE_CRACKED_ORE		("resonant_end_stone_cracked_ore"	, EnumRarity.EPIC, "oreClathrateEnder"		, "", 0, 2, 3, 15, 64),
	BIOTITE_CRACKED_ORE					("biotite_cracked_ore"				, EnumRarity.EPIC, "oreBiotite"				, "", 0, 2, 3, 15, 64),
	IRIDIUM_CRACKED_ORE					("iridium_cracked_ore"				, EnumRarity.EPIC, "oreIridium"				, "", 0, 2, 3, 15, 64),
	END_CRACKED_ORE						("end_cracked_ore"					, EnumRarity.EPIC, "oreEnd"					, "", 0, 2, 3, 15, 64),
	DRACONIUM_CRACKED_ORE				("draconium_cracked_ore"			, EnumRarity.EPIC, "oreDraconium"			, "", 0, 2, 3, 15, 64);

	private String name;
	private EnumRarity rarity;
	private String recipeOreDict1;
	private String recipeOreDict2;
	private int light;
	private int harvestLevel;
	private float hardness;
	private float resistance;
	private int maxSize;

	EnumOreCracked2(String name, EnumRarity rarity, String recipeOreDict1, String recipeOreDict2, int light, int harvestLevel, float hardness, float resistance, int maxSize) {
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