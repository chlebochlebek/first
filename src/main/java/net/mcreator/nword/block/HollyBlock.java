
package net.mcreator.nword.block;

import org.checkerframework.checker.units.qual.s;

import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.LiquidBlock;

import net.mcreator.nword.init.NwordModFluids;

public class HollyBlock extends LiquidBlock {
	public HollyBlock() {
		super(() -> NwordModFluids.HOLLY.get(), BlockBehaviour.Properties.of().mapColor(MapColor.WATER).strength(100f).lightLevel(s -> 15).noCollission().noLootTable().liquid().pushReaction(PushReaction.DESTROY).sound(SoundType.EMPTY).replaceable());
	}
}
