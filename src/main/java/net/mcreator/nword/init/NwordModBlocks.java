
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.nword.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.nword.block.UnderworldPortalBlock;
import net.mcreator.nword.block.UndeadblslbBlock;
import net.mcreator.nword.block.UndeadblockBlock;
import net.mcreator.nword.block.UndeadblocBlock;
import net.mcreator.nword.block.HollyBlock;
import net.mcreator.nword.NwordMod;

public class NwordModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, NwordMod.MODID);
	public static final RegistryObject<Block> UNDERWORLD_PORTAL = REGISTRY.register("underworld_portal", () -> new UnderworldPortalBlock());
	public static final RegistryObject<Block> UNDEADBLOCK = REGISTRY.register("undeadblock", () -> new UndeadblockBlock());
	public static final RegistryObject<Block> UNDEADBLOC = REGISTRY.register("undeadbloc", () -> new UndeadblocBlock());
	public static final RegistryObject<Block> UNDEADBLSLB = REGISTRY.register("undeadblslb", () -> new UndeadblslbBlock());
	public static final RegistryObject<Block> HOLLY = REGISTRY.register("holly", () -> new HollyBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
