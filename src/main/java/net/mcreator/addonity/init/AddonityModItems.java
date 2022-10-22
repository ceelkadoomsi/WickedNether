
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.addonity.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.DoubleHighBlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.addonity.item.WickedQuartzItem;
import net.mcreator.addonity.item.TriodiaLoafItem;
import net.mcreator.addonity.item.BakedTriodiaLoafItem;
import net.mcreator.addonity.AddonityMod;

public class AddonityModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, AddonityMod.MODID);
	public static final RegistryObject<Item> WICKED_NYLIUM = block(AddonityModBlocks.WICKED_NYLIUM, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> WICKED_WART_BLOCK = block(AddonityModBlocks.WICKED_WART_BLOCK, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> WICKEDWOOD = block(AddonityModBlocks.WICKEDWOOD, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> WICKED = REGISTRY.register("wicked_spawn_egg",
			() -> new ForgeSpawnEggItem(AddonityModEntities.WICKED, -1, -1, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> WICKEDSPROUNS = block(AddonityModBlocks.WICKEDSPROUNS, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> HANGINGVINES = block(AddonityModBlocks.HANGINGVINES, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> WICKED_PLANKS = block(AddonityModBlocks.WICKED_PLANKS, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> WICKED_DOOR = doubleBlock(AddonityModBlocks.WICKED_DOOR, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> WICKED_QUARTZ = REGISTRY.register("wicked_quartz", () -> new WickedQuartzItem());
	public static final RegistryObject<Item> WICKED_QUARTZ_LORE = block(AddonityModBlocks.WICKED_QUARTZ_LORE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> TRIODIA = block(AddonityModBlocks.TRIODIA, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> TRIODIA_BUSH = doubleBlock(AddonityModBlocks.TRIODIA_BUSH, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> TRIODIA_HAYSTACK = block(AddonityModBlocks.TRIODIA_HAYSTACK, CreativeModeTab.TAB_MISC);
	public static final RegistryObject<Item> TRIODIA_HAYSTACK_0 = block(AddonityModBlocks.TRIODIA_HAYSTACK_0, null);
	public static final RegistryObject<Item> TRIODIA_HAYSTACK_1 = block(AddonityModBlocks.TRIODIA_HAYSTACK_1, null);
	public static final RegistryObject<Item> TRIODIA_LOAF = REGISTRY.register("triodia_loaf", () -> new TriodiaLoafItem());
	public static final RegistryObject<Item> BAKED_TRIODIA_LOAF = REGISTRY.register("baked_triodia_loaf", () -> new BakedTriodiaLoafItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}

	private static RegistryObject<Item> doubleBlock(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new DoubleHighBlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
