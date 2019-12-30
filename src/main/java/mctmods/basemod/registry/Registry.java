package mctmods.basemod.registry;

import mctmods.basemod.Basemod;
import mctmods.basemod.blocks.BlockMaterials1;
import mctmods.basemod.blocks.BlockMaterials2;
import mctmods.basemod.blocks.BlockOre1;
import mctmods.basemod.blocks.BlockOreDrop1;
import mctmods.basemod.blocks.BlockOre2;
import mctmods.basemod.blocks.BlockOreDrop2;
import mctmods.basemod.blocks.BlockOre3;
import mctmods.basemod.blocks.BlockOreDrop3;
import mctmods.basemod.blocks.BlockOre4;
import mctmods.basemod.blocks.BlockOreDrop4;
import mctmods.basemod.blocks.BlockOreCracked1;
import mctmods.basemod.blocks.BlockOreCracked2;
import mctmods.basemod.blocks.BlockSheetMetal1;
import mctmods.basemod.blocks.BlockSheetMetal2;
import mctmods.basemod.itemblocks.ItemBlockMaterials1;
import mctmods.basemod.itemblocks.ItemBlockMaterials2;
import mctmods.basemod.itemblocks.ItemBlockOre1;
import mctmods.basemod.itemblocks.ItemBlockOre2;
import mctmods.basemod.itemblocks.ItemBlockOre3;
import mctmods.basemod.itemblocks.ItemBlockOre4;
import mctmods.basemod.itemblocks.ItemBlockOreCracked1;
import mctmods.basemod.itemblocks.ItemBlockOreCracked2;
import mctmods.basemod.itemblocks.ItemBlockSheetMetal1;
import mctmods.basemod.itemblocks.ItemBlockSheetMetal2;
import mctmods.basemod.items.ItemFoods;
import mctmods.basemod.items.ItemMaterials;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.registries.IForgeRegistry;

@ObjectHolder(Basemod.MODID)
public class Registry {

	// blocks
	public static final BlockMaterials1 BLOCK_MATERIALS1 = new BlockMaterials1();
	public static final BlockMaterials2 BLOCK_MATERIALS2 = new BlockMaterials2();
	public static final BlockOre1 ORE1 = new BlockOre1();
	public static final BlockOreDrop1 ORE_DROP1 = new BlockOreDrop1();
	public static final BlockOre2 ORE2 = new BlockOre2();
	public static final BlockOreDrop2 ORE_DROP2 = new BlockOreDrop2();
	public static final BlockOre3 ORE3 = new BlockOre3();
	public static final BlockOreDrop3 ORE_DROP3 = new BlockOreDrop3();
	public static final BlockOre4 ORE4 = new BlockOre4();
	public static final BlockOreDrop4 ORE_DROP4 = new BlockOreDrop4();
	public static final BlockOreCracked1 ORE_CRACKED1 = new BlockOreCracked1();
	public static final BlockOreCracked2 ORE_CRACKED2 = new BlockOreCracked2();
	public static final BlockSheetMetal1 SHEET_METAL1 = new BlockSheetMetal1();
	public static final BlockSheetMetal2 SHEET_METAL2 = new BlockSheetMetal2();

	// items
	public static final ItemMaterials MATERIALS = new ItemMaterials();
	public static final ItemFoods FOODS = new ItemFoods();

	// blocks
	private static final Block[] block = {
		BLOCK_MATERIALS1,
		BLOCK_MATERIALS2,
		ORE1,
		ORE_DROP1,
		ORE2,
		ORE_DROP2,
		ORE3,
		ORE_DROP3,
		ORE4,
		ORE_DROP4,
		ORE_CRACKED1,
		ORE_CRACKED2,
		SHEET_METAL1,
		SHEET_METAL2
	};

	// items
	private static final Item[] item = {
		MATERIALS,
		FOODS
	};

	// itemblocks
	private static final ItemBlock[] itemblock = {
		new ItemBlockMaterials1(BLOCK_MATERIALS1),
		new ItemBlockMaterials2(BLOCK_MATERIALS2),
		new ItemBlockOre1(ORE1),
		new ItemBlockOre1(ORE_DROP1),
		new ItemBlockOre2(ORE2),
		new ItemBlockOre2(ORE_DROP2),
		new ItemBlockOre3(ORE3),
		new ItemBlockOre3(ORE_DROP3),
		new ItemBlockOre4(ORE4),
		new ItemBlockOre4(ORE_DROP4),
		new ItemBlockOreCracked1(ORE_CRACKED1),
		new ItemBlockOreCracked2(ORE_CRACKED2),
		new ItemBlockSheetMetal1(SHEET_METAL1),
		new ItemBlockSheetMetal2(SHEET_METAL2)
	};

	public static void registerBlocks(IForgeRegistry<Block> registry) {
		for(Block block : block) {
			registry.register(block);
			Basemod.logger.info("Added block: " + block.getRegistryName());
		 }
	}

	public static void registerItems(IForgeRegistry<Item> registry) {
		for(Item item : item) {
			registry.register(item);
			Basemod.logger.info("Added item: " + item.getRegistryName());
		}
	}

	public static void registerItemBlocks(IForgeRegistry<Item> registry) {
		for(ItemBlock item_block : itemblock) {
			registry.register(item_block.setRegistryName(item_block.getBlock().getRegistryName()));
			Basemod.logger.info("Added itemblock: " + item_block.getBlock().getRegistryName());
		}
	}

	@SideOnly(Side.CLIENT)
	public static void initModels() {
		// blocks
		BLOCK_MATERIALS1.initItemBlockModels();
		BLOCK_MATERIALS2.initItemBlockModels();
		ORE1.initItemBlockModels();
		ORE_DROP1.initItemBlockModels();
		ORE2.initItemBlockModels();
		ORE_DROP2.initItemBlockModels();
		ORE3.initItemBlockModels();
		ORE_DROP3.initItemBlockModels();
		ORE4.initItemBlockModels();
		ORE_DROP4.initItemBlockModels();
		ORE_CRACKED1.initItemBlockModels();
		ORE_CRACKED2.initItemBlockModels();
		SHEET_METAL1.initItemBlockModels();
		SHEET_METAL2.initItemBlockModels();
		// items
		MATERIALS.initItemModels();
		FOODS.initItemModels();
	}

}