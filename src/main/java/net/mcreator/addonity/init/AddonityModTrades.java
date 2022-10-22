
/*
*    MCreator note: This file will be REGENERATED on each build.
*/
package net.mcreator.addonity.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.common.BasicItemListing;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.npc.VillagerProfession;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class AddonityModTrades {
	@SubscribeEvent
	public static void registerTrades(VillagerTradesEvent event) {
		if (event.getType() == VillagerProfession.FARMER) {
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(AddonityModItems.BAKED_TRIODIA_LOAF.get(), 8),

					new ItemStack(Items.EMERALD), 10, 5, 0.05f));
		}
		if (event.getType() == VillagerProfession.FARMER) {
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(AddonityModItems.BAKED_TRIODIA_LOAF.get(), 14),

					new ItemStack(Items.EMERALD, 2), 10, 5, 0.05f));
		}
		if (event.getType() == VillagerProfession.FARMER) {
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(AddonityModItems.BAKED_TRIODIA_LOAF.get(), 18),

					new ItemStack(Items.EMERALD, 3), 10, 5, 0.05f));
		}
		if (event.getType() == VillagerProfession.SHEPHERD) {
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(AddonityModItems.TRIODIA_LOAF.get(), 9), new ItemStack(Items.EMERALD),
					new ItemStack(AddonityModItems.BAKED_TRIODIA_LOAF.get(), 9), 7, 5, 0.08f));
		}
	}
}
