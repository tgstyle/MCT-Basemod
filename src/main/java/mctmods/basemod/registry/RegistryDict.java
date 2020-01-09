package mctmods.basemod.registry;

import mctmods.basemod.blocks.meta.EnumMaterials1;
import mctmods.basemod.blocks.meta.EnumMaterials2;
import mctmods.basemod.blocks.meta.EnumOre1;
import mctmods.basemod.blocks.meta.EnumOre2;
import mctmods.basemod.blocks.meta.EnumOre3;
import mctmods.basemod.blocks.meta.EnumOre4;
import mctmods.basemod.blocks.meta.EnumOreCracked1;
import mctmods.basemod.blocks.meta.EnumOreCracked2;
import mctmods.basemod.blocks.meta.EnumSheetMetal1;
import mctmods.basemod.blocks.meta.EnumSheetMetal2;
import mctmods.basemod.items.meta.EnumMaterials;

import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class RegistryDict {

	public static void registerDictionary() {

		// Blocks
		for(EnumMaterials1 variant : EnumMaterials1.values()) {
			if(variant.getRecipeOreDict1() != null && !variant.getRecipeOreDict1().isEmpty()) {
				OreDictionary.registerOre(variant.getRecipeOreDict1(), new ItemStack(Registry.BLOCK_MATERIALS1, 1, variant.ordinal()));
			}
			if(variant.getRecipeOreDict2() != null && !variant.getRecipeOreDict2().isEmpty()) {
				OreDictionary.registerOre(variant.getRecipeOreDict2(), new ItemStack(Registry.BLOCK_MATERIALS1, 1, variant.ordinal()));
			}
		}
		for(EnumMaterials2 variant : EnumMaterials2.values()) {
			if(variant.getRecipeOreDict1() != null && !variant.getRecipeOreDict1().isEmpty()) {
				OreDictionary.registerOre(variant.getRecipeOreDict1(), new ItemStack(Registry.BLOCK_MATERIALS2, 1, variant.ordinal()));
			}
			if(variant.getRecipeOreDict2() != null && !variant.getRecipeOreDict2().isEmpty()) {
				OreDictionary.registerOre(variant.getRecipeOreDict2(), new ItemStack(Registry.BLOCK_MATERIALS2, 1, variant.ordinal()));
			}
		}
		for(EnumOre1 variant : EnumOre1.values()) {
			if(variant.getRecipeOreDict1() != null && !variant.getRecipeOreDict1().isEmpty()) {
				OreDictionary.registerOre(variant.getRecipeOreDict1(), new ItemStack(Registry.ORE1, 1, variant.ordinal()));
			}
			if(variant.getRecipeOreDict2() != null && !variant.getRecipeOreDict2().isEmpty()) {
				OreDictionary.registerOre(variant.getRecipeOreDict2(), new ItemStack(Registry.ORE1, 1, variant.ordinal()));
			}
		}
		for(EnumOre2 variant : EnumOre2.values()) {
			if(variant.getRecipeOreDict1() != null && !variant.getRecipeOreDict1().isEmpty()) {
				OreDictionary.registerOre(variant.getRecipeOreDict1(), new ItemStack(Registry.ORE2, 1, variant.ordinal()));
			}
			if(variant.getRecipeOreDict2() != null && !variant.getRecipeOreDict2().isEmpty()) {
				OreDictionary.registerOre(variant.getRecipeOreDict2(), new ItemStack(Registry.ORE2, 1, variant.ordinal()));
			}
		}
		for(EnumOre3 variant : EnumOre3.values()) {
			if(variant.getRecipeOreDict1() != null && !variant.getRecipeOreDict1().isEmpty()) {
				OreDictionary.registerOre(variant.getRecipeOreDict1(), new ItemStack(Registry.ORE3, 1, variant.ordinal()));
			}
			if(variant.getRecipeOreDict2() != null && !variant.getRecipeOreDict2().isEmpty()) {
				OreDictionary.registerOre(variant.getRecipeOreDict2(), new ItemStack(Registry.ORE3, 1, variant.ordinal()));
			}
		}
		for(EnumOre4 variant : EnumOre4.values()) {
			if(variant.getRecipeOreDict1() != null && !variant.getRecipeOreDict1().isEmpty()) {
				OreDictionary.registerOre(variant.getRecipeOreDict1(), new ItemStack(Registry.ORE4, 1, variant.ordinal()));
			}
			if(variant.getRecipeOreDict2() != null && !variant.getRecipeOreDict2().isEmpty()) {
				OreDictionary.registerOre(variant.getRecipeOreDict2(), new ItemStack(Registry.ORE4, 1, variant.ordinal()));
			}
		}
		for(EnumOreCracked1 variant : EnumOreCracked1.values()) {
			if(variant.getRecipeOreDict1() != null && !variant.getRecipeOreDict1().isEmpty()) {
				OreDictionary.registerOre(variant.getRecipeOreDict1(), new ItemStack(Registry.ORE_CRACKED1, 1, variant.ordinal()));
			}
			if(variant.getRecipeOreDict2() != null && !variant.getRecipeOreDict2().isEmpty()) {
				OreDictionary.registerOre(variant.getRecipeOreDict2(), new ItemStack(Registry.ORE_CRACKED1, 1, variant.ordinal()));
			}
		}
		for(EnumOreCracked2 variant : EnumOreCracked2.values()) {
			if(variant.getRecipeOreDict1() != null && !variant.getRecipeOreDict1().isEmpty()) {
				OreDictionary.registerOre(variant.getRecipeOreDict1(), new ItemStack(Registry.ORE_CRACKED2, 1, variant.ordinal()));
			}
			if(variant.getRecipeOreDict2() != null && !variant.getRecipeOreDict2().isEmpty()) {
				OreDictionary.registerOre(variant.getRecipeOreDict2(), new ItemStack(Registry.ORE_CRACKED2, 1, variant.ordinal()));
			}
		}
		for(EnumSheetMetal1 variant : EnumSheetMetal1.values()) {
			if(variant.getRecipeOreDict1() != null && !variant.getRecipeOreDict1().isEmpty()) {
				OreDictionary.registerOre(variant.getRecipeOreDict1(), new ItemStack(Registry.SHEET_METAL1, 1, variant.ordinal()));
			}
			if(variant.getRecipeOreDict2() != null && !variant.getRecipeOreDict2().isEmpty()) {
				OreDictionary.registerOre(variant.getRecipeOreDict2(), new ItemStack(Registry.SHEET_METAL1, 1, variant.ordinal()));
			}
		}
		for(EnumSheetMetal2 variant : EnumSheetMetal2.values()) {
			if(variant.getRecipeOreDict1() != null && !variant.getRecipeOreDict1().isEmpty()) {
				OreDictionary.registerOre(variant.getRecipeOreDict1(), new ItemStack(Registry.SHEET_METAL2, 1, variant.ordinal()));
			}
			if(variant.getRecipeOreDict2() != null && !variant.getRecipeOreDict2().isEmpty()) {
				OreDictionary.registerOre(variant.getRecipeOreDict2(), new ItemStack(Registry.SHEET_METAL2, 1, variant.ordinal()));
			}
		}

		// Items
		for(EnumMaterials variant : EnumMaterials.values()) {
			if(variant.getRecipeOreDict1() != null && !variant.getRecipeOreDict1().isEmpty()) {
				OreDictionary.registerOre(variant.getRecipeOreDict1(), new ItemStack(Registry.MATERIALS, 1, variant.ordinal()));
			}
			if(variant.getRecipeOreDict2() != null && !variant.getRecipeOreDict2().isEmpty()) {
				OreDictionary.registerOre(variant.getRecipeOreDict2(), new ItemStack(Registry.MATERIALS, 1, variant.ordinal()));
			}
		}
	}

}