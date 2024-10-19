
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.nword.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.nword.item.UnderworldItem;
import net.mcreator.nword.item.HollyItem;
import net.mcreator.nword.NwordMod;

public class NwordModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, NwordMod.MODID);
	public static final RegistryObject<Item> UNDERWORLD = REGISTRY.register("underworld", () -> new UnderworldItem());
	public static final RegistryObject<Item> UNDEADBLOCK = block(NwordModBlocks.UNDEADBLOCK);
	public static final RegistryObject<Item> UNDEADBLOC = block(NwordModBlocks.UNDEADBLOC);
	public static final RegistryObject<Item> UNDEADBLSLB = block(NwordModBlocks.UNDEADBLSLB);
	public static final RegistryObject<Item> HOLLY_BUCKET = REGISTRY.register("holly_bucket", () -> new HollyItem());
	public static final RegistryObject<Item> CAVECLIMBER_SPAWN_EGG = REGISTRY.register("caveclimber_spawn_egg", () -> new ForgeSpawnEggItem(NwordModEntities.CAVECLIMBER, -1, -1, new Item.Properties()));

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
