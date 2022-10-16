
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.wickednether.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.world.BiomeLoadingEvent;

import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Holder;

import net.mcreator.wickednether.world.features.plants.WickedsprounsFeature;
import net.mcreator.wickednether.world.features.plants.HangingvinesFeature;
import net.mcreator.wickednether.world.features.ores.WiskedQuartzLoreFeature;
import net.mcreator.wickednether.world.features.ores.WickedwoodFeature;
import net.mcreator.wickednether.world.features.ores.WickedPlanksFeature;
import net.mcreator.wickednether.world.features.ores.WickedNyliumFeature;
import net.mcreator.wickednether.world.features.ores.WickedLeavesFeature;
import net.mcreator.wickednether.world.features.WickedWood1Feature;
import net.mcreator.wickednether.WickedNetherMod;

import java.util.function.Supplier;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber
public class WickedNetherModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, WickedNetherMod.MODID);
	private static final List<FeatureRegistration> FEATURE_REGISTRATIONS = new ArrayList<>();
	public static final RegistryObject<Feature<?>> WICKED_NYLIUM = register("wicked_nylium", WickedNyliumFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.UNDERGROUND_ORES, WickedNyliumFeature.GENERATE_BIOMES, WickedNyliumFeature::placedFeature));
	public static final RegistryObject<Feature<?>> WICKED_LEAVES = register("wicked_leaves", WickedLeavesFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.UNDERGROUND_ORES, WickedLeavesFeature.GENERATE_BIOMES, WickedLeavesFeature::placedFeature));
	public static final RegistryObject<Feature<?>> WICKEDWOOD = register("wickedwood", WickedwoodFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, WickedwoodFeature.GENERATE_BIOMES, WickedwoodFeature::placedFeature));
	public static final RegistryObject<Feature<?>> WICKEDSPROUNS = register("wickedsprouns", WickedsprounsFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.VEGETAL_DECORATION, WickedsprounsFeature.GENERATE_BIOMES, WickedsprounsFeature::placedFeature));
	public static final RegistryObject<Feature<?>> HANGINGVINES = register("hangingvines", HangingvinesFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.VEGETAL_DECORATION, HangingvinesFeature.GENERATE_BIOMES, HangingvinesFeature::placedFeature));
	public static final RegistryObject<Feature<?>> WICKED_PLANKS = register("wicked_planks", WickedPlanksFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.UNDERGROUND_ORES, WickedPlanksFeature.GENERATE_BIOMES, WickedPlanksFeature::placedFeature));
	public static final RegistryObject<Feature<?>> WISKED_QUARTZ_LORE = register("wisked_quartz_lore", WiskedQuartzLoreFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, WiskedQuartzLoreFeature.GENERATE_BIOMES,
					WiskedQuartzLoreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> WICKED_WOOD_1 = register("wicked_wood_1", WickedWood1Feature::feature, new FeatureRegistration(
			GenerationStep.Decoration.SURFACE_STRUCTURES, WickedWood1Feature.GENERATE_BIOMES, WickedWood1Feature::placedFeature));

	private static RegistryObject<Feature<?>> register(String registryname, Supplier<Feature<?>> feature, FeatureRegistration featureRegistration) {
		FEATURE_REGISTRATIONS.add(featureRegistration);
		return REGISTRY.register(registryname, feature);
	}

	@SubscribeEvent
	public static void addFeaturesToBiomes(BiomeLoadingEvent event) {
		for (FeatureRegistration registration : FEATURE_REGISTRATIONS) {
			if (registration.biomes() == null || registration.biomes().contains(event.getName()))
				event.getGeneration().getFeatures(registration.stage()).add(registration.placedFeature().get());
		}
	}

	private static record FeatureRegistration(GenerationStep.Decoration stage, Set<ResourceLocation> biomes,
			Supplier<Holder<PlacedFeature>> placedFeature) {
	}
}
