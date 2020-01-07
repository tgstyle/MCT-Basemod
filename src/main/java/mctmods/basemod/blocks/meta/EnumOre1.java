package mctmods.basemod.blocks.meta;

import mctmods.basemod.registry.Registry;

import net.minecraft.block.Block;
import net.minecraft.item.EnumRarity;
import net.minecraft.util.IStringSerializable;

public enum EnumOre1 implements IStringSerializable {

	COPPER_POOR_ORE	("copper_poor_ore"	, EnumRarity.COMMON, "mctPoorCopper"	, "", 0, 2, 3, 15, 64, Registry.ORE_CRACKED1, 1, 0, null, 1, 0),
	COPPER_ORE		("copper_ore"		, EnumRarity.COMMON, "mctCopper"		, "", 0, 2, 3, 15, 64, Registry.ORE_CRACKED1, 2, 0, null, 2, 0),
	COPPER_DENSE_ORE("copper_dense_ore"	, EnumRarity.COMMON, "mctDenseCopper"	, "", 0, 2, 3, 15, 64, Registry.ORE_CRACKED1, 3, 0, null, 3, 0),
	TIN_POOR_ORE	("tin_poor_ore"		, EnumRarity.COMMON, "mctPoorTin"		, "", 0, 2, 3, 15, 64, Registry.ORE_CRACKED1, 1, 1, null, 1, 0),
	TIN_ORE			("tin_ore"			, EnumRarity.COMMON, "mctTin"			, "", 0, 2, 3, 15, 64, Registry.ORE_CRACKED1, 2, 1, null, 2, 0),
	TIN_DENSE_ORE	("tin_dense_ore"	, EnumRarity.COMMON, "mctDenseTin"		, "", 0, 2, 3, 15, 64, Registry.ORE_CRACKED1, 3, 1, null, 3, 0),
	NICKEL_POOR_ORE	("nickel_poor_ore"	, EnumRarity.COMMON, "mctPoorNickel"	, "", 0, 2, 3, 15, 64, Registry.ORE_CRACKED1, 1, 2, null, 1, 0),
	NICKEL_ORE		("nickel_ore"		, EnumRarity.COMMON, "mctNickel"		, "", 0, 2, 3, 15, 64, Registry.ORE_CRACKED1, 2, 2, null, 2, 0),
	NICKEL_DENSE_ORE("nickel_dense_ore"	, EnumRarity.COMMON, "mctDenseNickel"	, "", 0, 2, 3, 15, 64, Registry.ORE_CRACKED1, 3, 2, null, 3, 0),
	IRON_POOR_ORE	("iron_poor_ore"	, EnumRarity.COMMON, "mctPoorIron"		, "", 0, 1, 3, 15, 64, Registry.ORE_CRACKED1, 1, 3, null, 1, 0),
	IRON_ORE		("iron_ore"			, EnumRarity.COMMON, "mctIron"			, "", 0, 2, 3, 15, 64, Registry.ORE_CRACKED1, 2, 3, null, 2, 0),
	IRON_DENSE_ORE	("iron_dense_ore"	, EnumRarity.COMMON, "mctDenseIron"		, "", 0, 2, 3, 15, 64, Registry.ORE_CRACKED1, 3, 3, null, 3, 0),
	GOLD_POOR_ORE	("gold_poor_ore"	, EnumRarity.COMMON, "mctPoorGold"		, "", 0, 1, 3, 15, 64, Registry.ORE_CRACKED1, 1, 4, null, 1, 0),
	GOLD_ORE		("gold_ore"			, EnumRarity.COMMON, "mctGold"			, "", 0, 2, 3, 15, 64, Registry.ORE_CRACKED1, 2, 4, null, 2, 0),
	GOLD_DENSE_ORE	("gold_dense_ore"	, EnumRarity.COMMON, "mctDenseGold"		, "", 0, 2, 3, 15, 64, Registry.ORE_CRACKED1, 3, 4, null, 3, 0);

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

	EnumOre1(String name, EnumRarity rarity, String recipeOreDict1, String recipeOreDict2, int light, int harvestLevel, float hardness, float resistance, int maxSize, Block blockDrop1, int blockDropAmount1, int blockDropMeta1, Block blockDrop2, int blockDropAmount2, int blockDropMeta2) {
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