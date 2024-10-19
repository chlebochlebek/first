
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.nword.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.nword.NwordMod;

public class NwordModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, NwordMod.MODID);
	public static final RegistryObject<CreativeModeTab> U_DWORLD = REGISTRY.register("u_dworld",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.nword.u_dworld")).icon(() -> new ItemStack(NwordModBlocks.UNDEADBLOCK.get())).displayItems((parameters, tabData) -> {
				tabData.accept(NwordModItems.UNDERWORLD.get());
				tabData.accept(NwordModBlocks.UNDEADBLOCK.get().asItem());
				tabData.accept(NwordModBlocks.UNDEADBLOC.get().asItem());
				tabData.accept(NwordModBlocks.UNDEADBLSLB.get().asItem());
				tabData.accept(NwordModItems.HOLLY_BUCKET.get());
				tabData.accept(NwordModItems.CAVECLIMBER_SPAWN_EGG.get());
			})

					.build());
}
