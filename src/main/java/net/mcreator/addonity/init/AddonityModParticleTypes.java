
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.addonity.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleType;

import net.mcreator.addonity.AddonityMod;

public class AddonityModParticleTypes {
	public static final DeferredRegister<ParticleType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, AddonityMod.MODID);
	public static final RegistryObject<ParticleType<?>> WICKED_DAST = REGISTRY.register("wicked_dast", () -> new SimpleParticleType(false));
}
