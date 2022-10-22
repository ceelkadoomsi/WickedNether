package net.mcreator.wickednether.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class HangingvinesDobavochnoieUsloviiePoGienieratsiiProcedure {
	public static void execute(LevelAccessor world, double x, double z) {
		boolean found = false;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		if ((world.getBlockState(new BlockPos(x, 1, z))).getBlock() == WickedNetherModBlocks.WICKED_WART_BLOCK.get()) {
			found = true;
		}
	}
}
