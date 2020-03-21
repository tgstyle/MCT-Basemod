package mctmods.basemod.blocks.meta;

import mctmods.basemod.registry.Registry;

import net.minecraft.block.Block;
import net.minecraft.item.EnumRarity;
import net.minecraft.util.IStringSerializable;

public enum EnumOre4 implements IStringSerializable {

	QUARTZ_POOR_ORE	("quartz_poor_ore"	, EnumRarity.RARE, "mctPoorQuartz"	, "", 0, 4, 3, 15, 64, Registry.ORE_CRACKED2, 1, 2, null, 1, 0),
	QUARTZ_ORE		("quartz_ore"		, EnumRarity.RARE, "mctQuartz"		, "", 0, 4, 3, 15, 64, Registry.ORE_CRACKED2, 1, 2, null, 1, 0),
	QUARTZ_DENSE_ORE("quartz_dense_ore"	, EnumRarity.RARE, "mctDenseQuartz"	, "", 0, 4, 3, 15, 64, Registry.ORE_CRACKED2, 1, 2, null, 1, 0),
	ARDITE_ORE		("ardite_ore"		, EnumRarity.RARE, "mctArdite"		, "", 0, 4, 3, 15, 64, Registry.ORE_CRACKED2, 1, 3, null, 1, 0),
	COBALT_ORE		("cobalt_ore"		, EnumRarity.RARE, "mctCobalt"		, "", 0, 4, 3, 15, 64, Registry.ORE_CRACKED2, 1, 4, null, 1, 0),
	BIOTITE_ORE		("biotite_ore"		, EnumRarity.EPIC, "mctBiotite"		, "", 0, 4, 3, 15, 64, Registry.ORE_CRACKED2, 1, 6, null, 1, 0),
	IRIDIUM_ORE		("iridium_ore"		, EnumRarity.EPIC, "mctIridium"		, "", 0, 4, 3, 15, 64, Registry.ORE_CRACKED2, 1, 7, null, 1, 0),
	END_ORE			("end_ore"			, EnumRarity.EPIC, "mctEnd"			, "", 0, 4, 3, 15, 64, Registry.ORE_CRACKED2, 1, 8, null, 1, 0),
	DRACONIUM_ORE	("draconium_ore"	, EnumRarity.EPIC, "mctDraconium"	, "", 0, 4, 4, 15, 64, Registry.ORE_CRACKED2, 1, 9, null, 1, 0);

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

	EnumOre4(String name, EnumRarity rarity, String recipeOreDict1, String recipeOreDict2, int light, int harvestLevel, float hardness, float resistance, int maxSize, Block blockDrop1, int blockDropAmount1, int blockDropMeta1, Block blockDrop2, int blockDropAmount2, int blockDropMeta2) {
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