
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.nword.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import net.mcreator.nword.fluid.HollyFluid;
import net.mcreator.nword.NwordMod;

public class NwordModFluids {
	public static final DeferredRegister<Fluid> REGISTRY = DeferredRegister.create(ForgeRegistries.FLUIDS, NwordMod.MODID);
	public static final RegistryObject<FlowingFluid> HOLLY = REGISTRY.register("holly", () -> new HollyFluid.Source());
	public static final RegistryObject<FlowingFluid> FLOWING_HOLLY = REGISTRY.register("flowing_holly", () -> new HollyFluid.Flowing());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class FluidsClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ItemBlockRenderTypes.setRenderLayer(HOLLY.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_HOLLY.get(), RenderType.translucent());
		}
	}
}