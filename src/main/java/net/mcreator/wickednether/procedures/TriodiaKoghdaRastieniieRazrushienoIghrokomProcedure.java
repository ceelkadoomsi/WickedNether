package net.mcreator.wickednether.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class TriodiaKoghdaRastieniieRazrushienoIghrokomProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _player)
			_player.causeFoodExhaustion((float) 0.1);
	}
}
