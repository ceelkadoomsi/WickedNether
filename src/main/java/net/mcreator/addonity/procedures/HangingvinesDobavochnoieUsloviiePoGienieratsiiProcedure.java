package net.mcreator.addonity.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.addonity.init.AddonityModBlocks;

public class HangingvinesDobavochnoieUsloviiePoGienieratsiiProcedure {
	public static void execute(LevelAccessor world, double x, double z) {
		boolean found = false;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		if ((world.getBlockState(new BlockPos(x, 1, z))).getBlock() == AddonityModBlocks.WICKED_WART_BLOCK.get()) {
			found = true;
		}
	}
}
