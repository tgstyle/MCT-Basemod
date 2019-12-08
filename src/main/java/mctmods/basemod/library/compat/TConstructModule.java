package mctmods.basemod.library.compat;

import java.util.Locale;

import mctmods.basemod.blocks.base.BlockMoltenFluidBase;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ResourceLocation;

import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fml.common.event.FMLInterModComms;

public class TConstructModule extends CompatModule {

	public static Fluid fluidDraconium;
	public static Block blockMoltenDraconium;
	public static Fluid fluidFluxedElectrum;
	public static Block blockMoltenFluxedElectrum;
	public static Fluid fluidQuartzEnrichedIron;
	public static Block blockMoltenQuartzEnrichedIron;
	public static Fluid fluidDraconiumAwakened;
	public static Block blockMoltenDraconiumAwakened;
	public static Fluid fluidRefinedObsidian;
	public static Block blockMoltenRefinedObsidian;
	public static Fluid fluidRefinedGlowstone;
	public static Block blockMoltenRefinedGlowstone;
	public static Fluid fluidConstantan;
	public static Block blockMoltenConstantan;
	public static Fluid fluidStableUnstable;
	public static Block blockStableUnstable;
	public static Fluid fluidElectricalSteel;
	public static Block blockElectricalSteel;
	public static Fluid fluidEnergeticAlloy;
	public static Block blockEnergeticAlloy;
	public static Fluid fluidVibrantAlloy;
	public static Block blockVibrantAlloy;
	public static Fluid fluidRedstoneAlloy;
	public static Block blockRedstoneAlloy;
	public static Fluid fluidConductiveIron;
	public static Block blockConductiveIron;
	public static Fluid fluidPulsatingIron;
	public static Block blockPulsatingIron;
	public static Fluid fluidDarkSteel;
	public static Block blockDarkSteel;
	public static Fluid fluidSoularium;
	public static Block blockSoularium;
	public static Fluid fluidEndSteel;
	public static Block blockEndSteel;

	static {

		fluidDraconium = new FluidcoloredMetal("draconium", 0x9900ff, 850);
		sendFluidForMelting("Draconium", fluidDraconium);
		blockMoltenDraconium = new BlockMoltenFluidBase("molten_draconium", fluidDraconium, Material.LAVA);

		fluidFluxedElectrum = new FluidcoloredMetal("fluxedelectrum", 0xe68600, 850);
		sendFluidForMelting("FluxedElectrum", fluidFluxedElectrum);
		blockMoltenFluxedElectrum = new BlockMoltenFluidBase("molten_fluxedelectrum", fluidFluxedElectrum, Material.LAVA);

		fluidQuartzEnrichedIron = new FluidcoloredMetal("quartzenrichediron", 0xef6262, 850);
		sendFluidForMelting("QuartzEnriched", fluidQuartzEnrichedIron);
		blockMoltenQuartzEnrichedIron = new BlockMoltenFluidBase("molten_quartzenrichediron", fluidQuartzEnrichedIron, Material.LAVA);

		fluidDraconiumAwakened = new FluidcoloredMetal("draconiumawakened", 0xff4f1a, 850);
		sendFluidForMelting("DraconiumAwakened", fluidDraconiumAwakened);
		blockMoltenDraconiumAwakened = new BlockMoltenFluidBase("molten_draconiumawakened", fluidDraconiumAwakened, Material.LAVA);

		fluidRefinedObsidian = new FluidcoloredMetal("refinedobsidian", 0x592b88, 850);
		sendFluidForMelting("RefinedObsidian", fluidRefinedObsidian);
		blockMoltenRefinedObsidian = new BlockMoltenFluidBase("molten_refinedobsidian", fluidRefinedObsidian, Material.LAVA);

		fluidRefinedGlowstone = new FluidcoloredMetal("refinedglowstone", 0xf2cb3a, 850);
		sendFluidForMelting("RefinedGlowstone", fluidRefinedGlowstone);
		blockMoltenRefinedGlowstone = new BlockMoltenFluidBase("molten_refinedglowstone", fluidRefinedGlowstone, Material.LAVA);

		fluidConstantan = new FluidcoloredMetal("constantan", 0xf7866c, 500);
		sendFluidForMelting("Constantan", fluidConstantan);
		blockMoltenConstantan = new BlockMoltenFluidBase("molten_constantan", fluidConstantan, Material.LAVA);
		
		fluidStableUnstable = new FluidcoloredMetal("stableunstable", 0xffffff, 900);
		sendFluidForMelting("StableUnstable", fluidStableUnstable);
		blockStableUnstable = new BlockMoltenFluidBase("molten_stableunstable", fluidStableUnstable, Material.LAVA);

		fluidElectricalSteel = new FluidcoloredMetal("electricalsteel", 0x8e8e8e, 900);
		sendFluidForMelting("ElectricalSteel", fluidElectricalSteel);
		blockElectricalSteel = new BlockMoltenFluidBase("molten_electricalsteel", fluidElectricalSteel, Material.LAVA);

		fluidEnergeticAlloy = new FluidcoloredMetal("energeticalloy", 0xe8931a, 900);
		sendFluidForMelting("EnergeticAlloy", fluidEnergeticAlloy);
		blockEnergeticAlloy = new BlockMoltenFluidBase("molten_energeticalloy", fluidEnergeticAlloy, Material.LAVA);

		fluidVibrantAlloy = new FluidcoloredMetal("vibrantalloy", 0x7cff56, 900);
		sendFluidForMelting("VibrantAlloy", fluidVibrantAlloy);
		blockVibrantAlloy = new BlockMoltenFluidBase("molten_vibrantalloy", fluidVibrantAlloy, Material.LAVA);

		fluidRedstoneAlloy = new FluidcoloredMetal("redstonealloy", 0xcd2f31, 900);
		sendFluidForMelting("RedstoneAlloy", fluidRedstoneAlloy);
		blockRedstoneAlloy = new BlockMoltenFluidBase("molten_redstonealloy", fluidRedstoneAlloy, Material.LAVA);

		fluidConductiveIron = new FluidcoloredMetal("conductiveiron", 0xc67675, 900);
		sendFluidForMelting("ConductiveIron", fluidConductiveIron);
		blockConductiveIron = new BlockMoltenFluidBase("molten_conductiveiron", fluidConductiveIron, Material.LAVA);

		fluidPulsatingIron = new FluidcoloredMetal("pulsatingiron", 0x71c371, 900);
		sendFluidForMelting("PulsatingIron", fluidPulsatingIron);
		blockPulsatingIron = new BlockMoltenFluidBase("molten_pulsatingiron", fluidPulsatingIron, Material.LAVA);

		fluidDarkSteel = new FluidcoloredMetal("darksteel", 0x3a3a3a, 900);
		sendFluidForMelting("DarkSteel", fluidDarkSteel);
		blockDarkSteel = new BlockMoltenFluidBase("molten_darksteel", fluidDarkSteel, Material.LAVA);

		fluidSoularium = new FluidcoloredMetal("soularium", 0x7a5b3a, 900);
		sendFluidForMelting("Soularium", fluidSoularium);
		blockSoularium = new BlockMoltenFluidBase("molten_soularium", fluidSoularium, Material.LAVA);

		fluidEndSteel = new FluidcoloredMetal("endsteel", 0xada773, 900);
		sendFluidForMelting("EndSteel", fluidEndSteel);
		blockEndSteel = new BlockMoltenFluidBase("molten_endsteel", fluidEndSteel, Material.LAVA);
	}

	public static Fluid sendFluidForMelting(String ore, int color, int temp) {
		Fluid fluid = new FluidcoloredMetal(ore.toLowerCase(Locale.ENGLISH), color, temp);
		NBTTagCompound tag = new NBTTagCompound();
		tag.setString("fluid", fluid.getName());
		tag.setString("ore", ore);
		tag.setBoolean("toolforge", true);
		FMLInterModComms.sendMessage("tconstruct", "integrateSmeltery", tag);
		return fluid;
	}
	
	public static Fluid sendFluidForMelting(String ore, Fluid fluid) {
		NBTTagCompound tag = new NBTTagCompound();
		tag.setString("fluid", fluid.getName());
		tag.setString("ore", ore);
		tag.setBoolean("toolforge", true);
		FMLInterModComms.sendMessage("tconstruct", "integrateSmeltery", tag);
		return fluid;
	}
	
	public static class FluidcoloredMetal extends Fluid {
		public static ResourceLocation ICON_MetalStill = new ResourceLocation("tconstruct:blocks/fluids/molten_metal");
		public static ResourceLocation ICON_MetalFlowing = new ResourceLocation("tconstruct:blocks/fluids/molten_metal_flow");

		int color;
		public FluidcoloredMetal(String name, int color, int temp) {
			super(name, ICON_MetalStill, ICON_MetalFlowing);
			this.color = color;
			this.setTemperature(temp);
			this.setDensity(2000);
			this.setViscosity(10000);
			FluidRegistry.registerFluid(this);
		}

		@Override
		public int getColor() {
			return color|0xff000000;
		}
	}
	
	@Override
	public void preInit() {
		
	}

	@Override
	public void init() {
		
	}

	@Override
	public void postInit() {
		
	}
	
}
