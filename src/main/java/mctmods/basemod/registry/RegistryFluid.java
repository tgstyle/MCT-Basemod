package mctmods.basemod.registry;

import com.google.common.base.Preconditions;

import mctmods.basemod.Basemod;
import mctmods.basemod.library.util.CreativeTabBM;

import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.MaterialLiquid;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelBakery;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.block.statemap.StateMapperBase;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;

import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fluids.BlockFluidClassic;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fluids.IFluidBlock;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.registries.IForgeRegistry;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;

public class RegistryFluid {

	public static final RegistryFluid INSTANCE = new RegistryFluid();

	public static final Set<Fluid> FLUIDS = new HashSet<>();
	public static final Set<IFluidBlock> MOD_FLUID_BLOCKS = new HashSet<>();

	public static final Fluid MIXED_REDSTONE = createFluid("mixed_redstone", true,
			fluid -> fluid.setLuminosity(10).setDensity(1600).setViscosity(100),
			fluid -> new BlockFluidClassic(fluid, new MaterialLiquid(MapColor.RED)), 0xD9740303);

	private static <T extends Block & IFluidBlock> Fluid createFluid(final String name, final boolean hasFlowIcon, final Consumer<Fluid> fluidPropertyApplier, final Function<Fluid, T> blockFactory, final int color) {

		final ResourceLocation still = new ResourceLocation(Basemod.MODID + ":" + "fluids/fluid_still");
		final ResourceLocation flowing = new ResourceLocation(Basemod.MODID + ":" + "fluids/fluid_flowing");

		Fluid fluid = new Fluid(name, still, flowing, color);
		final boolean useOwnFluid = FluidRegistry.registerFluid(fluid);

		if (useOwnFluid) {
			fluidPropertyApplier.accept(fluid);
			MOD_FLUID_BLOCKS.add(blockFactory.apply(fluid));
		} else {
			fluid = FluidRegistry.getFluid(name);
		}

		FLUIDS.add(fluid);

		return fluid;
	}

    @EventBusSubscriber
	public static class RegistrationHandler {
    	@SubscribeEvent
		public static void registerBlocks(final RegistryEvent.Register<Block> event) {
			final IForgeRegistry<Block> registry = event.getRegistry();

			for (final IFluidBlock fluidBlock : MOD_FLUID_BLOCKS) {
				final Block block = (Block) fluidBlock;
				block.setRegistryName(Basemod.MODID, "fluid_" + fluidBlock.getFluid().getName());
				block.setUnlocalizedName(Basemod.MODID + ":" +  "fluid_" + fluidBlock.getFluid().getName());
				block.setCreativeTab(CreativeTabBM.MCTBASEMOD_TAB);
				registry.register(block);
			}
		}

        @SubscribeEvent
		public static void registerItems(final RegistryEvent.Register<Item> event) {
			final IForgeRegistry<Item> registry = event.getRegistry();

			for (final IFluidBlock fluidBlock : MOD_FLUID_BLOCKS) {
				final Block block = (Block) fluidBlock;
				final ItemBlock itemBlock = new ItemBlock(block);
				final ResourceLocation registryName = Preconditions.checkNotNull(block.getRegistryName());
				itemBlock.setRegistryName(registryName);
				registry.register(itemBlock);
			}
			registerFluidBuckets();
		}
	}

	private static void registerFluidBuckets() {
		for (final Fluid fluid : FLUIDS) {
			FluidRegistry.addBucketForFluid(fluid);
		}
	}

    @SideOnly(Side.CLIENT)
	public static void initModels() {
		INSTANCE.registerFluidModels();

	}

    @SideOnly(Side.CLIENT)
	private void registerFluidModels() {
		MOD_FLUID_BLOCKS.forEach(this::registerFluidModel);
	}

    @SideOnly(Side.CLIENT)
	private void registerFluidModel(final IFluidBlock fluidBlock) {
		final Item item = Item.getItemFromBlock((Block) fluidBlock);
		assert item != Items.AIR;

		ModelBakery.registerItemVariants(item);

		final ModelResourceLocation modelResourceLocation = new ModelResourceLocation(Basemod.MODID + ":" + "fluid_block", fluidBlock.getFluid().getName());

		ModelLoader.setCustomMeshDefinition(item, stack -> modelResourceLocation);

		ModelLoader.setCustomStateMapper((Block) fluidBlock, new StateMapperBase() {
			@Override
			protected ModelResourceLocation getModelResourceLocation(final IBlockState p_178132_1_) {
				return modelResourceLocation;
			}
		});
	}

}
