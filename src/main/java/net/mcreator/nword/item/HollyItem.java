
package net.mcreator.nword.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;

import net.mcreator.nword.init.NwordModFluids;

public class HollyItem extends BucketItem {
	public HollyItem() {
		super(NwordModFluids.HOLLY, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.COMMON));
	}
}
