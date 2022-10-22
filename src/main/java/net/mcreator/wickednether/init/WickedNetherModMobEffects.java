
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.wickednether.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.wickednether.potion.MushroominfectionMobEffect;
import net.mcreator.wickednether.WickedNetherMod;

public class WickedNetherModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, WickedNetherMod.MODID);
	public static final RegistryObject<MobEffect> MUSHROOMINFECTION = REGISTRY.register("mushroominfection", () -> new MushroominfectionMobEffect());
}
