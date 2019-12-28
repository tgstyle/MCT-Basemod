package mctmods.basemod.registry;

import mctmods.basemod.Basemod;
import mctmods.basemod.blocks.BlockFluid;
import mctmods.basemod.blocks.BlockMoltenFluid;
import mctmods.basemod.blocks.base.BlockBaseFluid;
import mctmods.basemod.fluids.FluidColored;
import mctmods.basemod.itemblocks.ItemBlockFluid;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.ItemMeshDefinition;
import net.minecraft.client.renderer.block.model.ModelBakery;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.block.statemap.StateMapperBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ResourceLocation;

import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fml.common.event.FMLInterModComms;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.registries.IForgeRegistry;

import javax.annotation.Nonnull;

public class RegistryFluid {

	// molten fluids
	public static final Fluid FLUID_MOLTEN_CONDUCTIVEIRON = new FluidColored("conductiveiron", 0xc67675, 900, 2000, 10000);
	public static final Fluid FLUID_MOLTEN_CONSTANTAN = new FluidColored("constantan", 0xf7866c, 500, 2000, 10000);
	public static final Fluid FLUID_MOLTEN_DARKSTEEL = new FluidColored("darksteel", 0x3a3a3a, 900, 2000, 10000);
	public static final Fluid FLUID_MOLTEN_DRACONIUM = new FluidColored("draconium", 0x9900ff, 850, 2000, 10000);
	public static final Fluid FLUID_MOLTEN_DRACONIUMAWAKENED = new FluidColored("draconiumawakened", 0xff4f1a, 850, 2000, 10000);
	public static final Fluid FLUID_MOLTEN_ELECTRICALSTEEL = new FluidColored("electricalsteel", 0x8e8e8e, 900, 2000, 10000);
	public static final Fluid FLUID_MOLTEN_ENDSTEEL = new FluidColored("endsteel", 0xada773, 900, 2000, 10000);
	public static final Fluid FLUID_MOLTEN_ENERGETICALLOY = new FluidColored("energeticalloy", 0xe8931a, 900, 2000, 10000);
	public static final Fluid FLUID_MOLTEN_FLUXEDELECTRUM = new FluidColored("fluxedelectrum", 0xe68600, 850, 2000, 10000);
	public static final Fluid FLUID_MOLTEN_PULSATINGIRON = new FluidColored("pulsatingiron", 0x71c371, 900, 2000, 10000);
	public static final Fluid FLUID_MOLTEN_QUARTZENRICHEDIRON = new FluidColored("quartzenrichediron", 0xef6262, 850, 2000, 10000);
	public static final Fluid FLUID_MOLTEN_REDSTONEALLOY = new FluidColored("redstonealloy", 0xcd2f31, 900, 2000, 10000);
	public static final Fluid FLUID_MOLTEN_REFINEDGLOWSTONE = new FluidColored("refinedglowstone", 0xf2cb3a, 850, 2000, 10000);
	public static final Fluid FLUID_MOLTEN_REFINEDOBSIDIAN = new FluidColored("refinedobsidian", 0x592b88, 850, 2000, 10000);
	public static final Fluid FLUID_MOLTEN_SOULARIUM = new FluidColored("soularium", 0x7a5b3a, 900, 2000, 10000);
	public static final Fluid FLUID_MOLTEN_STABLEUNSTABLE = new FluidColored("stableunstable", 0xffffff, 900, 2000, 10000);
	public static final Fluid FLUID_MOLTEN_VIBRANTALLOY = new FluidColored("vibrantalloy", 0x7cff56, 900, 2000, 10000);
	// fluids
	public static final Fluid FLUID_MIXEDREDSTONE = new FluidColored("mixedredstone", 0xD9740303, 1600, 1000);

	static {
		sendFluidForMelting("conductiveiron", FLUID_MOLTEN_CONDUCTIVEIRON);
		sendFluidForMelting("constantan", FLUID_MOLTEN_CONSTANTAN);
		sendFluidForMelting("darksteel", FLUID_MOLTEN_DARKSTEEL);
		sendFluidForMelting("draconium", FLUID_MOLTEN_DRACONIUM);
		sendFluidForMelting("draconiumawakened", FLUID_MOLTEN_DRACONIUMAWAKENED);
		sendFluidForMelting("electricalsteel", FLUID_MOLTEN_ELECTRICALSTEEL);
		sendFluidForMelting("endsteel", FLUID_MOLTEN_ENDSTEEL);
		sendFluidForMelting("energeticalloy", FLUID_MOLTEN_ENERGETICALLOY);
		sendFluidForMelting("fluxedelectrum", FLUID_MOLTEN_FLUXEDELECTRUM);
		sendFluidForMelting("pulsatingiron", FLUID_MOLTEN_PULSATINGIRON);
		sendFluidForMelting("quartzenriched", FLUID_MOLTEN_QUARTZENRICHEDIRON);
		sendFluidForMelting("redstonealloy", FLUID_MOLTEN_REDSTONEALLOY);
		sendFluidForMelting("refinedglowstone", FLUID_MOLTEN_REFINEDGLOWSTONE);
		sendFluidForMelting("refinedobsidian", FLUID_MOLTEN_REFINEDOBSIDIAN);
		sendFluidForMelting("soularium", FLUID_MOLTEN_SOULARIUM);
		sendFluidForMelting("stableunstable", FLUID_MOLTEN_STABLEUNSTABLE);
		sendFluidForMelting("vibrantalloy", FLUID_MOLTEN_VIBRANTALLOY);
	}

	// molten fluid blocks
	public static final BlockMoltenFluid BLOCK_MOLTEN_CONDUCTIVEIRON = new BlockMoltenFluid(FLUID_MOLTEN_CONDUCTIVEIRON, Material.LAVA, "molten_conductiveiron");
	public static final BlockMoltenFluid BLOCK_MOLTEN_CONSTANTAN = new BlockMoltenFluid(FLUID_MOLTEN_CONSTANTAN, Material.LAVA, "molten_constantan");
	public static final BlockMoltenFluid BLOCK_MOLTEN_DARKSTEEL = new BlockMoltenFluid(FLUID_MOLTEN_DARKSTEEL, Material.LAVA, "molten_darksteel");
	public static final BlockMoltenFluid BLOCK_MOLTEN_DRACONIUM = new BlockMoltenFluid(FLUID_MOLTEN_DRACONIUM, Material.LAVA, "molten_draconium");
	public static final BlockMoltenFluid BLOCK_MOLTEN_DRACONIUMAWAKENED = new BlockMoltenFluid(FLUID_MOLTEN_DRACONIUMAWAKENED, Material.LAVA, "molten_draconiumawakened");
	public static final BlockMoltenFluid BLOCK_MOLTEN_ELECTRICALSTEEL = new BlockMoltenFluid(FLUID_MOLTEN_ELECTRICALSTEEL, Material.LAVA, "molten_electricalsteel");
	public static final BlockMoltenFluid BLOCK_MOLTEN_ENDSTEEL = new BlockMoltenFluid(FLUID_MOLTEN_ENDSTEEL, Material.LAVA, "molten_endsteel");
	public static final BlockMoltenFluid BLOCK_MOLTEN_ENERGETICALLOY = new BlockMoltenFluid(FLUID_MOLTEN_ENERGETICALLOY, Material.LAVA, "molten_energeticalloy");
	public static final BlockMoltenFluid BLOCK_MOLTEN_FLUXEDELECTRUM = new BlockMoltenFluid(FLUID_MOLTEN_FLUXEDELECTRUM, Material.LAVA, "molten_fluxedelectrum");
	public static final BlockMoltenFluid BLOCK_MOLTEN_PULSATINGIRON = new BlockMoltenFluid(FLUID_MOLTEN_PULSATINGIRON, Material.LAVA, "molten_pulsatingiron");
	public static final BlockMoltenFluid BLOCK_MOLTEN_QUARTZENRICHEDIRON = new BlockMoltenFluid(FLUID_MOLTEN_QUARTZENRICHEDIRON, Material.LAVA, "molten_quartzenrichediron");
	public static final BlockMoltenFluid BLOCK_MOLTEN_REDSTONEALLOY = new BlockMoltenFluid(FLUID_MOLTEN_REDSTONEALLOY, Material.LAVA, "molten_redstonealloy");
	public static final BlockMoltenFluid BLOCK_MOLTEN_REFINEDGLOWSTONE = new BlockMoltenFluid(FLUID_MOLTEN_REFINEDGLOWSTONE, Material.LAVA, "molten_refinedglowstone");
	public static final BlockMoltenFluid BLOCK_MOLTEN_REFINEDOBSIDIAN = new BlockMoltenFluid(FLUID_MOLTEN_REFINEDOBSIDIAN, Material.LAVA, "molten_refinedobsidian");
	public static final BlockMoltenFluid BLOCK_MOLTEN_SOULARIUM = new BlockMoltenFluid(FLUID_MOLTEN_SOULARIUM, Material.LAVA, "molten_soularium");
	public static final BlockMoltenFluid BLOCK_MOLTEN_STABLEUNSTABLE = new BlockMoltenFluid(FLUID_MOLTEN_STABLEUNSTABLE, Material.LAVA, "molten_stableunstable");
	public static final BlockMoltenFluid BLOCK_MOLTEN_VIBRANTALLOY = new BlockMoltenFluid(FLUID_MOLTEN_VIBRANTALLOY, Material.LAVA, "molten_vibrantalloy");
	// fluid blocks
	public static final BlockFluid BLOCK_MIXEDREDSTONE = new BlockFluid(FLUID_MIXEDREDSTONE, Material.WATER, "mixedredstone");

	// fluid blocks
	private static final Block [] block = {
		// molten fluid
		BLOCK_MOLTEN_CONDUCTIVEIRON,
		BLOCK_MOLTEN_CONSTANTAN,
		BLOCK_MOLTEN_DARKSTEEL,
		BLOCK_MOLTEN_DRACONIUM,
		BLOCK_MOLTEN_DRACONIUMAWAKENED,
		BLOCK_MOLTEN_ELECTRICALSTEEL,
		BLOCK_MOLTEN_ENDSTEEL,
		BLOCK_MOLTEN_ENERGETICALLOY,
		BLOCK_MOLTEN_FLUXEDELECTRUM,
		BLOCK_MOLTEN_PULSATINGIRON,
		BLOCK_MOLTEN_QUARTZENRICHEDIRON,
		BLOCK_MOLTEN_REDSTONEALLOY,
		BLOCK_MOLTEN_REFINEDGLOWSTONE,
		BLOCK_MOLTEN_REFINEDOBSIDIAN,
		BLOCK_MOLTEN_SOULARIUM,
		BLOCK_MOLTEN_STABLEUNSTABLE,
		BLOCK_MOLTEN_VIBRANTALLOY,
		// fluid
		BLOCK_MIXEDREDSTONE
	};

	// fluid itemblocks
	private static final ItemBlock [] item_block = {
		// molten fluid
		new ItemBlockFluid(BLOCK_MOLTEN_CONDUCTIVEIRON),
		new ItemBlockFluid(BLOCK_MOLTEN_CONSTANTAN),
		new ItemBlockFluid(BLOCK_MOLTEN_DARKSTEEL),
		new ItemBlockFluid(BLOCK_MOLTEN_DRACONIUM),
		new ItemBlockFluid(BLOCK_MOLTEN_DRACONIUMAWAKENED),
		new ItemBlockFluid(BLOCK_MOLTEN_ELECTRICALSTEEL),
		new ItemBlockFluid(BLOCK_MOLTEN_ENDSTEEL),
		new ItemBlockFluid(BLOCK_MOLTEN_ENERGETICALLOY),
		new ItemBlockFluid(BLOCK_MOLTEN_FLUXEDELECTRUM),
		new ItemBlockFluid(BLOCK_MOLTEN_PULSATINGIRON),
		new ItemBlockFluid(BLOCK_MOLTEN_QUARTZENRICHEDIRON),
		new ItemBlockFluid(BLOCK_MOLTEN_REDSTONEALLOY),
		new ItemBlockFluid(BLOCK_MOLTEN_REFINEDGLOWSTONE),
		new ItemBlockFluid(BLOCK_MOLTEN_REFINEDOBSIDIAN),
		new ItemBlockFluid(BLOCK_MOLTEN_SOULARIUM),
		new ItemBlockFluid(BLOCK_MOLTEN_STABLEUNSTABLE),
		new ItemBlockFluid(BLOCK_MOLTEN_VIBRANTALLOY),
		// fluid
		new ItemBlockFluid(BLOCK_MIXEDREDSTONE)
	};

	public static void registerBlocks(IForgeRegistry<Block> registry) {
		for(Block block : block) {
			registry.register(block);
			Basemod.logger.info("Added fluid block: " + block.getRegistryName());
		 }
	}

	public static void registerItemBlocks(IForgeRegistry<Item> registry) {
		for(ItemBlock item_block : item_block) {
			registry.register(item_block.setRegistryName(item_block.getBlock().getRegistryName()));
			Basemod.logger.info("Added fluid itemblock: " + item_block.getBlock().getRegistryName());
		}
	}

	public static Fluid sendFluidForMelting(String ore, Fluid fluid) {
		NBTTagCompound tag = new NBTTagCompound();
		tag.setString("fluid", fluid.getName());
		tag.setString("ore", ore);
		tag.setBoolean("toolforge", true);
		FMLInterModComms.sendMessage("tconstruct", "integrateSmeltery", tag);
		return fluid;
	}

	@SideOnly(Side.CLIENT)
	public static void initModels() {
		for(Block block : block) {
			final ResourceLocation loc = Block.REGISTRY.getNameForObject(block);
			Item blockItem = Item.getItemFromBlock(block);
			if(blockItem == null)
				throw new RuntimeException("ITEMBLOCK FOR "+loc+" : "+block+" IS NULL");
			if(block instanceof BlockBaseFluid)
				mapFluidState(block,((BlockBaseFluid)block).getFluid());

		}

		for(Item item : item_block) {
			if(item instanceof ItemBlock) continue; {
				final ResourceLocation loc = Item.REGISTRY.getNameForObject(item);
				ModelBakery.registerItemVariants(item, loc);
				ModelLoader.setCustomMeshDefinition(item, new ItemMeshDefinition() {
					@Override
					public ModelResourceLocation getModelLocation(ItemStack stack) {
						return new ModelResourceLocation(loc, "inventory");
					}
				});
			}
		}
	}

	@SideOnly(Side.CLIENT)
	private static void mapFluidState(Block block, Fluid fluid)	{
		Item item = Item.getItemFromBlock(block);
		FluidStateMapper mapper = new FluidStateMapper(fluid);
		ModelLoader.registerItemVariants(item);
		ModelLoader.setCustomMeshDefinition(item, mapper);
		ModelLoader.setCustomStateMapper(block, mapper);
	}

	@SideOnly(Side.CLIENT)
	static class FluidStateMapper extends StateMapperBase implements ItemMeshDefinition	{
		public final ModelResourceLocation location;

		public FluidStateMapper(Fluid fluid) {
			this.location = new ModelResourceLocation(Basemod.MODID + ":fluid", fluid.getName());
		}

		@Nonnull
		@Override
		protected ModelResourceLocation getModelResourceLocation(@Nonnull IBlockState state) {
			return location;
		}

		@Nonnull
		@Override
		public ModelResourceLocation getModelLocation(@Nonnull ItemStack stack)	{
			return location;
		}
	}

}