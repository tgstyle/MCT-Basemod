package mctmods.basemod.registry;

import mctmods.basemod.Basemod;
import mctmods.basemod.blocks.BlockFluid;
import mctmods.basemod.blocks.BlockMoltenFluid;
import mctmods.basemod.blocks.base.BlockBaseFluid;
import mctmods.basemod.fluids.FluidColored;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.ItemMeshDefinition;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.block.statemap.StateMapperBase;
import net.minecraft.item.Item;
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
	public static final Fluid FLUID_MOLTEN_DRACONIUM = new FluidColored("draconium", 0x9900ff, 850, 2000, 10000);
	public static final Fluid FLUID_MOLTEN_DRACONIUMAWAKENED = new FluidColored("draconiumawakened", 0xff4f1a, 850, 2000, 10000);
	public static final Fluid FLUID_MOLTEN_QUARTZENRICHEDIRON = new FluidColored("quartzenrichediron", 0xef6262, 850, 2000, 10000);
	public static final Fluid FLUID_MOLTEN_REFINEDGLOWSTONE = new FluidColored("refinedglowstone", 0xf2cb3a, 850, 2000, 10000);
	public static final Fluid FLUID_MOLTEN_REFINEDOBSIDIAN = new FluidColored("refinedobsidian", 0x592b88, 850, 2000, 10000);
	// fluids
	public static final Fluid FLUID_MIXEDREDSTONE = new FluidColored("mixedredstone", 0xD9740303, 1600, 1000);

	static {
		sendFluidForMelting("draconium", FLUID_MOLTEN_DRACONIUM);
		sendFluidForMelting("draconiumawakened", FLUID_MOLTEN_DRACONIUMAWAKENED);
		sendFluidForMelting("quartzenriched", FLUID_MOLTEN_QUARTZENRICHEDIRON);
		sendFluidForMelting("refinedglowstone", FLUID_MOLTEN_REFINEDGLOWSTONE);
		sendFluidForMelting("refinedobsidian", FLUID_MOLTEN_REFINEDOBSIDIAN);
	}

	// molten fluid blocks
	public static final BlockMoltenFluid BLOCK_MOLTEN_DRACONIUM = new BlockMoltenFluid(FLUID_MOLTEN_DRACONIUM, Material.LAVA, "molten_draconium");
	public static final BlockMoltenFluid BLOCK_MOLTEN_DRACONIUMAWAKENED = new BlockMoltenFluid(FLUID_MOLTEN_DRACONIUMAWAKENED, Material.LAVA, "molten_draconiumawakened");
	public static final BlockMoltenFluid BLOCK_MOLTEN_QUARTZENRICHEDIRON = new BlockMoltenFluid(FLUID_MOLTEN_QUARTZENRICHEDIRON, Material.LAVA, "molten_quartzenrichediron");
	public static final BlockMoltenFluid BLOCK_MOLTEN_REFINEDGLOWSTONE = new BlockMoltenFluid(FLUID_MOLTEN_REFINEDGLOWSTONE, Material.LAVA, "molten_refinedglowstone");
	public static final BlockMoltenFluid BLOCK_MOLTEN_REFINEDOBSIDIAN = new BlockMoltenFluid(FLUID_MOLTEN_REFINEDOBSIDIAN, Material.LAVA, "molten_refinedobsidian");
	// fluid blocks
	public static final BlockFluid BLOCK_MIXEDREDSTONE = new BlockFluid(FLUID_MIXEDREDSTONE, Material.WATER, "mixedredstone");

	// fluid blocks
	private static final Block [] block = {
		// molten fluid
		BLOCK_MOLTEN_DRACONIUM,
		BLOCK_MOLTEN_DRACONIUMAWAKENED,
		BLOCK_MOLTEN_QUARTZENRICHEDIRON,
		BLOCK_MOLTEN_REFINEDGLOWSTONE,
		BLOCK_MOLTEN_REFINEDOBSIDIAN,
		// fluid
		BLOCK_MIXEDREDSTONE
	};

	public static void registerBlocks(IForgeRegistry<Block> registry) {
		for(Block block : block) {
			registry.register(block);
			Basemod.logger.info("Added fluid block: " + block.getRegistryName());
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