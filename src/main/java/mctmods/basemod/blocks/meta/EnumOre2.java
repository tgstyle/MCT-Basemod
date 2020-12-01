package mctmods.basemod.blocks.meta;

import mctmods.basemod.registry.Registry;

import net.minecraft.block.Block;
import net.minecraft.item.EnumRarity;
import net.minecraft.util.IStringSerializable;

public enum EnumOre2 implements IStringSerializable {

	COAL_POOR_ORE		("coal_poor_ore"		, EnumRarity.COMMON		, "mctPoorCoal"		, "", 0, 1, 3, 15, 64, Registry.ORE_CRACKED3, 1, 0, null, 0, 0),
	COAL_ORE			("coal_ore"				, EnumRarity.COMMON		, "mctCoal"			, "", 0, 2, 3, 15, 64, Registry.ORE_CRACKED3, 2, 0, null, 0, 0),
	COAL_DENSE_ORE		("coal_dense_ore"		, EnumRarity.COMMON		, "mctDenseCoal"	, "", 0, 2, 3, 15, 64, Registry.ORE_CRACKED3, 3, 0, null, 0, 0),
	REDSTONE_POOR_ORE	("redstone_poor_ore"	, EnumRarity.COMMON		, "mctPoorRedstone"	, "", 0, 2, 3, 15, 64, Registry.ORE_CRACKED1, 1, 5, null, 0, 0),
	REDSTONE_ORE		("redstone_ore"			, EnumRarity.COMMON		, "mctRedstone"		, "", 0, 3, 3, 15, 64, Registry.ORE_CRACKED1, 2, 5, null, 0, 0),
	REDSTONE_DENSE_ORE	("redstone_dense_ore"	, EnumRarity.COMMON		, "mctDenseRedstone", "", 0, 3, 3, 15, 64, Registry.ORE_CRACKED1, 3, 5, null, 0, 0),
	LAPIS_POOR_ORE		("lapis_poor_ore"		, EnumRarity.UNCOMMON	, "mctPoorLapis"	, "", 0, 2, 3, 15, 64, Registry.ORE_CRACKED1, 1, 6, Registry.ORE_CRACKED1, 1, 6),
	LAPIS_ORE			("lapis_ore"			, EnumRarity.UNCOMMON	, "mctLapis"		, "", 0, 3, 3, 15, 64, Registry.ORE_CRACKED1, 2, 6, Registry.ORE_CRACKED1, 2, 6),
	LAPIS_DENSE_ORE		("lapis_dense_ore"		, EnumRarity.UNCOMMON	, "mctDenseLapis"	, "", 0, 3, 3, 15, 64, Registry.ORE_CRACKED1, 3, 6, Registry.ORE_CRACKED1, 3, 6),
	DIAMOND_POOR_ORE	("diamond_poor_ore"		, EnumRarity.UNCOMMON	, "mctPoorDiamond"	, "", 0, 3, 3, 15, 64, Registry.ORE_CRACKED1, 1, 8, Registry.ORE_CRACKED1, 1, 8),
	DIAMOND_ORE			("diamond_ore"			, EnumRarity.UNCOMMON	, "mctDiamond"		, "", 0, 3, 3, 15, 64, Registry.ORE_CRACKED1, 2, 8, Registry.ORE_CRACKED1, 2, 8),
	DIAMOND_DENSE_ORE	("diamond_dense_ore"	, EnumRarity.UNCOMMON	, "mctDenseDiamond"	, "", 0, 3, 3, 15, 64, Registry.ORE_CRACKED1, 3, 8, Registry.ORE_CRACKED1, 3, 8),
	EMERALD_POOR_ORE	("emerald_poor_ore"		, EnumRarity.RARE		, "mctPoorEmerald"	, "", 0, 4, 3, 15, 64, Registry.ORE_CRACKED1, 1, 9, Registry.ORE_CRACKED1, 1, 9),
	EMERALD_ORE			("emerald_ore"			, EnumRarity.RARE		, "mctEmerald"		, "", 0, 4, 3, 15, 64, Registry.ORE_CRACKED1, 2, 9, Registry.ORE_CRACKED1, 2, 9),
	EMERALD_DENSE_ORE	("emerald_dense_ore"	, EnumRarity.RARE		, "mctDenseEmerald"	, "", 0, 4, 3, 15, 64, Registry.ORE_CRACKED1, 3, 9, Registry.ORE_CRACKED1, 3, 9);

	private String name;
	private EnumRarity rarity;
	private String recipeOreDict1;
	private String recipeOreDict2;
	private int light;
	private int harvestLevel;
	private float hardness;
	private float resistance;
	private int maxSize;
	private Block blockDrop1;
	private int blockDropAmount1;
	private int blockDropMeta1;
	private Block blockDrop2;
	private int blockDropAmount2;
	private int blockDropMeta2;

	EnumOre2(String name, EnumRarity rarity, String recipeOreDict1, String recipeOreDict2, int light, int harvestLevel, float hardness, float resistance, int maxSize, Block blockDrop1, int blockDropAmount1, int blockDropMeta1, Block blockDrop2, int blockDropAmount2, int blockDropMeta2) {
		this.name = name;
		this.rarity = rarity;
		this.recipeOreDict1 = recipeOreDict1;
		this.recipeOreDict2 = recipeOreDict2;
		this.light = light;
		this.harvestLevel = harvestLevel;
		this.hardness = hardness;
		this.resistance = resistance;
		this.maxSize = maxSize;
		this.blockDrop1 = blockDrop1;
		this.blockDropAmount1 = blockDropAmount1;
		this.blockDropMeta1 = blockDropMeta1;
		this.blockDrop2 = blockDrop2;
		this.blockDropAmount2 = blockDropAmount2;
		this.blockDropMeta2 = blockDropMeta2;
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
 	
 	public Block getBlockDrop1() {
 		return blockDrop1;
 	}

 	public int getBlockDropAmount1() {
 		return blockDropAmount1;
 	}
 
 	public int getBlockDropMeta1() {
 		return blockDropMeta1;
 	}

 	public Block getBlockDrop2() {
 		return blockDrop2;
 	}

 	public int getBlockDropAmount2() {
 		return blockDropAmount2;
 	}
 
 	public int getBlockDropMeta2() {
 		return blockDropMeta2;
 	}

}