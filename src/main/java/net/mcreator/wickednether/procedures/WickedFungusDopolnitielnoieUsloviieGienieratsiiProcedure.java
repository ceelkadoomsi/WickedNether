package net.mcreator.wickednether.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class WickedFungusDopolnitielnoieUsloviieGienieratsiiProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		boolean found = false;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		sx = -3;
		found = false;
		for (int index0 = 0; index0 < (int) (2); index0++) {
			sy = -3;
			for (int index1 = 0; index1 < (int) (2); index1++) {
				sz = -3;
				for (int index2 = 0; index2 < (int) (2); index2++) {
					if (!((world.getBlockState(new BlockPos(x + sx, y + sy, z + sz))).getBlock() == Blocks.SOUL_SAND)) {
						found = true;
					}
					sz = sz + 1;
				}
				sy = sy + 1;
			}
			sx = sx + 1;
		}
		if (found == true) {
			if ((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == WickedNetherModBlocks.WICKED_NYLIUM.get()) {
				return true;
			}
		}
		return false;
	}
}
