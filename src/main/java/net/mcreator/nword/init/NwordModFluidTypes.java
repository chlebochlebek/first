
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.nword.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fluids.FluidType;

import net.mcreator.nword.fluid.types.HollyFluidType;
import net.mcreator.nword.NwordMod;

public class NwordModFluidTypes {
	public static final DeferredRegister<FluidType> REGISTRY = DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, NwordMod.MODID);
	public static final RegistryObject<FluidType> HOLLY_TYPE = REGISTRY.register("holly", () -> new HollyFluidType());
}
