package mctmods.basemod.registry;

import mctmods.basemod.Basemod;
import mctmods.basemod.blocks.BlockFluid;
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
import net.minecraft.util.ResourceLocation;

import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.registries.IForgeRegistry;

import javax.annotation.Nonnull;

public class RegistryFluid {

	public static final Fluid FLUID_MIXEDREDSTONE = new FluidColored("mixedredstone", 0xD9740303, 1600, 1000);

	public static final BlockFluid BLOCK_MIXEDREDSTONE = new BlockFluid(FLUID_MIXEDREDSTONE, Material.WATER, "mixedredstone");

	private static final Block [] block = {
		BLOCK_MIXEDREDSTONE
	};

	public static void registerBlocks(IForgeRegistry<Block> registry) {
		for(Block block : block) {
			registry.register(block);
			Basemod.logger.info("Added fluid block: " + block.getRegistryName());
		 }
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