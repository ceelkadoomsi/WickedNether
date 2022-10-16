
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.wickednether.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.DoubleHighBlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.wickednether.item.WickedQuartzItem;
import net.mcreator.wickednether.WickedNetherMod;

public class WickedNetherModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, WickedNetherMod.MODID);
	public static final RegistryObject<Item> WICKED_NYLIUM = block(WickedNetherModBlocks.WICKED_NYLIUM, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> WICKED_WART_BLOCK = block(WickedNetherModBlocks.WICKED_WART_BLOCK, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> WICKEDWOOD = block(WickedNetherModBlocks.WICKEDWOOD, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> WICKED = REGISTRY.register("wicked_spawn_egg",
			() -> new ForgeSpawnEggItem(WickedNetherModEntities.WICKED, -1, -1, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> WICKEDSPROUNS = block(WickedNetherModBlocks.WICKEDSPROUNS, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> HANGINGVINES = block(WickedNetherModBlocks.HANGINGVINES, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> WICKED_PLANKS = block(WickedNetherModBlocks.WICKED_PLANKS, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> WICKED_DOOR = doubleBlock(WickedNetherModBlocks.WICKED_DOOR, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> WICKED_QUARTZ = REGISTRY.register("wicked_quartz", () -> new WickedQuartzItem());
	public static final RegistryObject<Item> WICKED_QUARTZ_LORE = block(WickedNetherModBlocks.WICKED_QUARTZ_LORE,
			CreativeModeTab.TAB_BUILDING_BLOCKS);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}

	private static RegistryObject<Item> doubleBlock(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new DoubleHighBlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
