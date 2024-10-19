
package net.mcreator.nword.fluid;

import net.minecraftforge.fluids.ForgeFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.particles.ParticleOptions;

import net.mcreator.nword.init.NwordModItems;
import net.mcreator.nword.init.NwordModFluids;
import net.mcreator.nword.init.NwordModFluidTypes;
import net.mcreator.nword.init.NwordModBlocks;

public abstract class HollyFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> NwordModFluidTypes.HOLLY_TYPE.get(), () -> NwordModFluids.HOLLY.get(), () -> NwordModFluids.FLOWING_HOLLY.get()).explosionResistance(100f)
			.bucket(() -> NwordModItems.HOLLY_BUCKET.get()).block(() -> (LiquidBlock) NwordModBlocks.HOLLY.get());

	private HollyFluid() {
		super(PROPERTIES);
	}

	@Override
	public ParticleOptions getDripParticle() {
		return ParticleTypes.EXPLOSION;
	}

	public static class Source extends HollyFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends HollyFluid {
		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}
