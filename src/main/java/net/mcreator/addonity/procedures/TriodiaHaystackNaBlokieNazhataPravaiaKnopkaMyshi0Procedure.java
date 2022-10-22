package net.mcreator.addonity.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.addonity.init.AddonityModBlocks;

public class TriodiaHaystackNaBlokieNazhataPravaiaKnopkaMyshi0Procedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == AddonityModBlocks.TRIODIA_HAYSTACK
				.get().asItem()) {
			world.setBlock(new BlockPos(x, y, z), AddonityModBlocks.TRIODIA_HAYSTACK_1.get().defaultBlockState(), 3);
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.crop.plant")),
							SoundSource.BLOCKS, (float) 0.8, (float) 1.3);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.crop.plant")), SoundSource.BLOCKS,
							(float) 0.8, (float) 1.3, false);
				}
			}
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(AddonityModBlocks.TRIODIA_HAYSTACK.get());
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1,
						_player.inventoryMenu.getCraftSlots());
			}
		} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
				.getItem() == AddonityModBlocks.TRIODIA_HAYSTACK.get().asItem()) {
			world.setBlock(new BlockPos(x, y, z), AddonityModBlocks.TRIODIA_HAYSTACK_1.get().defaultBlockState(), 3);
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.crop.plant")),
							SoundSource.BLOCKS, (float) 0.8, (float) 1.3);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.crop.plant")), SoundSource.BLOCKS,
							(float) 0.8, (float) 1.3, false);
				}
			}
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(AddonityModBlocks.TRIODIA_HAYSTACK.get());
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1,
						_player.inventoryMenu.getCraftSlots());
			}
		}
	}
}
