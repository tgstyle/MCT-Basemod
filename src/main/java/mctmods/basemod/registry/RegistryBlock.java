package mctmods.basemod.registry;

import java.util.HashSet;
import java.util.Set;

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
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.registries.IForgeRegistry;

@GameRegistry.ObjectHolder(Basemod.MODID)
public class RegistryBlock {

	@GameRegistry.ObjectHolder("block_materials1")
    public static final BlockMaterials1 BLOCK_MATERIALS1 = new BlockMaterials1();

    @GameRegistry.ObjectHolder("block_materials2")
    public static final BlockMaterials2 BLOCK_MATERIALS2 = new BlockMaterials2();

    @GameRegistry.ObjectHolder("ore1")
    public static final BlockOre1 ORE1 = new BlockOre1();

    @GameRegistry.ObjectHolder("ore_drop1")
    public static final BlockOreDrop1 ORE_DROP1 = new BlockOreDrop1();

    @GameRegistry.ObjectHolder("ore2")
    public static final BlockOre2 ORE2 = new BlockOre2();

    @GameRegistry.ObjectHolder("ore_drop2")
    public static final BlockOreDrop2 ORE_DROP2 = new BlockOreDrop2();

    @GameRegistry.ObjectHolder("ore3")
    public static final BlockOre3 ORE3 = new BlockOre3();

    @GameRegistry.ObjectHolder("ore_drop3")
    public static final BlockOreDrop3 ORE_DROP3 = new BlockOreDrop3();

    @GameRegistry.ObjectHolder("ore4")
    public static final BlockOre4 ORE4 = new BlockOre4();

    @GameRegistry.ObjectHolder("ore_drop4")
    public static final BlockOreDrop4 ORE_DROP4 = new BlockOreDrop4();

    @GameRegistry.ObjectHolder("ore_cracked1")
    public static final BlockOreCracked1 ORE_CRACKED1 = new BlockOreCracked1();

    @GameRegistry.ObjectHolder("ore_cracked2")
    public static final BlockOreCracked2 ORE_CRACKED2 = new BlockOreCracked2();

    @GameRegistry.ObjectHolder("sheet_metal1")
    public static final BlockSheetMetal1 SHEET_METAL1 = new BlockSheetMetal1();

    @GameRegistry.ObjectHolder("sheet_metal2")
    public static final BlockSheetMetal2 SHEET_METAL2 = new BlockSheetMetal2();

    private static final Block[] blocks = {
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

    private static final ItemBlock[] itemBlocks = {
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

    @EventBusSubscriber
    public static class RegistrationHandler {
        public static final Set<ItemBlock> ITEM_BLOCKS = new HashSet<>();

        @SubscribeEvent
        public static void registerBlocks(RegistryEvent.Register<Block> event) {
            final IForgeRegistry<Block> registry = event.getRegistry();
            registry.registerAll(blocks);
        }

        @SubscribeEvent
        public static void registerItemBlocks(RegistryEvent.Register<Item> event) {
            final IForgeRegistry<Item> registry = event.getRegistry();
            for (ItemBlock iB : itemBlocks) {
                registry.register(iB.setRegistryName(iB.getBlock().getRegistryName()));
                ITEM_BLOCKS.add(iB);
            }
        }

    }

    @SideOnly(Side.CLIENT)
    public static void initModels() {
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
    }

}
