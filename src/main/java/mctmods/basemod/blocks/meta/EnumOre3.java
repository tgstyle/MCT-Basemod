package mctmods.basemod.blocks.meta;

import mctmods.basemod.registry.Registry;

import net.minecraft.block.Block;
import net.minecraft.item.EnumRarity;
import net.minecraft.util.IStringSerializable;

public enum EnumOre3 implements IStringSerializable {

	BLACKQUARTZ_POOR_ORE	("blackquartz_poor_ore"	, EnumRarity.UNCOMMON, "mctPoorBlackQuartz"	, "", 0, 3, 3, 15, 64, Registry.ORE_CRACKED1, 1,  7, null, 1, 0),
	BLACKQUARTZ_ORE			("blackquartz_ore"		, EnumRarity.UNCOMMON, "mctBlackQuartz"		, "", 0, 3, 3, 15, 64, Registry.ORE_CRACKED1, 2,  7, null, 2, 0),
	BLACKQUARTZ_DENSE_ORE	("blackquartz_dense_ore", EnumRarity.UNCOMMON, "mctDenseBlackQuartz", "", 0, 3, 3, 15, 64, Registry.ORE_CRACKED1, 3,  7, null, 3, 0),
	GALENA_POOR_ORE			("galena_poor_ore"		, EnumRarity.UNCOMMON, "mctPoorGalena"		, "", 0, 3, 3, 15, 64, Registry.ORE_CRACKED1, 1, 11, Registry.ORE_CRACKED1, 1, 10),
	GALENA_ORE				("galena_ore"			, EnumRarity.UNCOMMON, "mctGalena"			, "", 0, 3, 3, 15, 64, Registry.ORE_CRACKED1, 2, 11, Registry.ORE_CRACKED1, 2, 10),
	GALENA_DENSE_ORE		("galena_dense_ore"		, EnumRarity.UNCOMMON, "mctDenseGalena"		, "", 0, 3, 3, 15, 64, Registry.ORE_CRACKED1, 3, 11, Registry.ORE_CRACKED1, 3, 10),
	BAUXITE_POOR_ORE		("bauxite_poor_ore"		, EnumRarity.UNCOMMON, "mctPoorBauxite"		, "", 0, 3, 3, 15, 64, Registry.ORE_CRACKED1, 1, 12, null, 1, 0),
	BAUXITE_ORE				("bauxite_ore"			, EnumRarity.UNCOMMON, "mctBauxite"			, "", 0, 3, 3, 15, 64, Registry.ORE_CRACKED1, 2, 12, null, 2, 0),
	BAUXITE_DENSE_ORE		("bauxite_dense_ore"	, EnumRarity.UNCOMMON, "mctDenseBauxite"	, "", 0, 3, 3, 15, 64, Registry.ORE_CRACKED1, 3, 12, null, 3, 0),
	URANIUM_POOR_ORE		("uranium_poor_ore"		, EnumRarity.UNCOMMON, "mctPoorUranium"		, "", 0, 3, 3, 15, 64, Registry.ORE_CRACKED1, 1, 13, null, 1, 0),
	URANIUM_ORE				("uranium_ore"			, EnumRarity.UNCOMMON, "mctUranium"			, "", 0, 3, 3, 15, 64, Registry.ORE_CRACKED1, 2, 13, null, 2, 0),
	URANIUM_DENSE_ORE		("uranium_dense_ore"	, EnumRarity.UNCOMMON, "mctDenseUranium"	, "", 0, 3, 3, 15, 64, Registry.ORE_CRACKED1, 3, 13, null, 3, 0),
	OSMIUM_POOR_ORE			("osmium_poor_ore"		, EnumRarity.UNCOMMON, "mctPoorOsmium"		, "", 0, 3, 3, 15, 64, Registry.ORE_CRACKED1, 1, 14, null, 1, 0),
	OSMIUM_ORE				("osmium_ore"			, EnumRarity.UNCOMMON, "mctOsmium"			, "", 0, 3, 3, 15, 64, Registry.ORE_CRACKED1, 2, 14, null, 2, 0),
	OSMIUM_DENSE_ORE		("osmium_dense_ore"		, EnumRarity.UNCOMMON, "mctDenseOsmium"		, "", 0, 3, 3, 15, 64, Registry.ORE_CRACKED1, 3, 14, null, 3, 0);

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

	EnumOre3(String name, EnumRarity rarity, String recipeOreDict1, String recipeOreDict2, int light, int harvestLevel, float hardness, float resistance, int maxSize, Block blockDrop1, int blockDropAmount1, int blockDropMeta1, Block blockDrop2, int blockDropAmount2, int blockDropMeta2) {
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