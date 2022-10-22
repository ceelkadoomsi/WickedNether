
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.wickednether.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.mcreator.wickednether.block.WiskedQuartzLoreBlock;
import net.mcreator.wickednether.WickedNetherMod;
import net.mcreator.addonity.block.WickedwoodBlock;
import net.mcreator.addonity.block.WickedsprounsBlock;
import net.mcreator.addonity.block.WickedPlanksBlock;
import net.mcreator.addonity.block.WickedNyliumBlock;
import net.mcreator.addonity.block.WickedLeavesBlock;
import net.mcreator.addonity.block.WickedDoorBlock;
import net.mcreator.addonity.block.TriodiaHaystackBlock;
import net.mcreator.addonity.block.TriodiaHaystack1Block;
import net.mcreator.addonity.block.TriodiaHaystack0Block;
import net.mcreator.addonity.block.TriodiaBushBlock;
import net.mcreator.addonity.block.TriodiaBlock;
import net.mcreator.addonity.block.HangingvinesBlock;

public class WickedNetherModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, WickedNetherMod.MODID);
	public static final RegistryObject<Block> WICKED_NYLIUM = REGISTRY.register("wicked_nylium", () -> new WickedNyliumBlock());
	public static final RegistryObject<Block> WICKED_LEAVES = REGISTRY.register("wicked_leaves", () -> new WickedLeavesBlock());
	public static final RegistryObject<Block> WICKEDWOOD = REGISTRY.register("wickedwood", () -> new WickedwoodBlock());
	public static final RegistryObject<Block> WICKEDSPROUNS = REGISTRY.register("wickedsprouns", () -> new WickedsprounsBlock());
	public static final RegistryObject<Block> HANGINGVINES = REGISTRY.register("hangingvines", () -> new HangingvinesBlock());
	public static final RegistryObject<Block> WICKED_PLANKS = REGISTRY.register("wicked_planks", () -> new WickedPlanksBlock());
	public static final RegistryObject<Block> WICKED_DOOR = REGISTRY.register("wicked_door", () -> new WickedDoorBlock());
	public static final RegistryObject<Block> WICKED_QUARTZ_LORE = REGISTRY.register("wicked_quartz_lore", () -> new WiskedQuartzLoreBlock());
	public static final RegistryObject<Block> TRIODIA = REGISTRY.register("triodia", () -> new TriodiaBlock());
	public static final RegistryObject<Block> TRIODIA_BUSH = REGISTRY.register("triodia_bush", () -> new TriodiaBushBlock());
	public static final RegistryObject<Block> TRIODIA_HAYSTACK = REGISTRY.register("triodia_haystack", () -> new TriodiaHaystackBlock());
	public static final RegistryObject<Block> TRIODIA_HAYSTACK_0 = REGISTRY.register("triodia_haystack_0", () -> new TriodiaHaystack0Block());
	public static final RegistryObject<Block> TRIODIA_HAYSTACK_1 = REGISTRY.register("triodia_haystack_1", () -> new TriodiaHaystack1Block());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			WickedsprounsBlock.registerRenderLayer();
			HangingvinesBlock.registerRenderLayer();
			WickedDoorBlock.registerRenderLayer();
			TriodiaBlock.registerRenderLayer();
			TriodiaBushBlock.registerRenderLayer();
			TriodiaHaystackBlock.registerRenderLayer();
			TriodiaHaystack0Block.registerRenderLayer();
			TriodiaHaystack1Block.registerRenderLayer();
		}
	}
}
