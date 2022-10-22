
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
import net.mcreator.wickednether.block.WickedwoodBlock;
import net.mcreator.wickednether.block.WickedsprounsBlock;
import net.mcreator.wickednether.block.WickedPlanksBlock;
import net.mcreator.wickednether.block.WickedNyliumBlock;
import net.mcreator.wickednether.block.WickedLeavesBlock;
import net.mcreator.wickednether.block.WickedDoorBlock;
import net.mcreator.wickednether.block.TriodiaHaystackBlock;
import net.mcreator.wickednether.block.TriodiaHaystack1Block;
import net.mcreator.wickednether.block.TriodiaHaystack0Block;
import net.mcreator.wickednether.block.TriodiaBushBlock;
import net.mcreator.wickednether.block.TriodiaBlock;
import net.mcreator.wickednether.block.HangingvinesBlock;
import net.mcreator.wickednether.WickedNetherMod;

public class WickedNetherModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, WickedNetherMod.MODID);
	public static final RegistryObject<Block> WICKED_NYLIUM = REGISTRY.register("wicked_nylium", () -> new WickedNyliumBlock());
	public static final RegistryObject<Block> WICKED_LEAVES = REGISTRY.register("wicked_leaves", () -> new WickedLeavesBlock());
	public static final RegistryObject<Block> WICKEDWOOD = REGISTRY.register("wickedwood", () -> new WickedwoodBlock());
	public static final RegistryObject<Block> WICKEDSPROUNS = REGISTRY.register("wickedsprouns", () -> new WickedsprounsBlock());
	public static final RegistryObject<Block> HANGINGVINES = REGISTRY.register("hangingvines", () -> new HangingvinesBlock());
	public static final RegistryObject<Block> WICKED_PLANKS = REGISTRY.register("wicked_planks", () -> new WickedPlanksBlock());
	public static final RegistryObject<Block> WICKED_DOOR = REGISTRY.register("wicked_door", () -> new WickedDoorBlock());
	public static final RegistryObject<Block> WISKED_QUARTZ_LORE = REGISTRY.register("wisked_quartz_lore", () -> new WiskedQuartzLoreBlock());
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
