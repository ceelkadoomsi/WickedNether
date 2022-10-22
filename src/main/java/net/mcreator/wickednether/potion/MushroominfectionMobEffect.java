
package net.mcreator.wickednether.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class MushroominfectionMobEffect extends MobEffect {
	public MushroominfectionMobEffect() {
		super(MobEffectCategory.HARMFUL, -12189551);
	}

	@Override
	public String getDescriptionId() {
		return "effect.wicked_nether.mushroominfection";
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
