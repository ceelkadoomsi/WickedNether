
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

import net.mcreator.wickednether.world.features.ores.WiskedQuartzLoreFeature;
import net.mcreator.wickednether.WickedNetherMod;
import net.mcreator.addonity.world.features.plants.WickedsprounsFeature;
import net.mcreator.addonity.world.features.plants.TriodiaFeature;
import net.mcreator.addonity.world.features.plants.TriodiaBushFeature;
import net.mcreator.addonity.world.features.plants.HangingvinesFeature;
import net.mcreator.addonity.world.features.ores.WickedwoodFeature;
import net.mcreator.addonity.world.features.ores.WickedPlanksFeature;
import net.mcreator.addonity.world.features.ores.WickedNyliumFeature;
import net.mcreator.addonity.world.features.ores.WickedLeavesFeature;
import net.mcreator.addonity.world.features.WickedFungusFeature;
import net.mcreator.addonity.world.features.WickedFungus6Feature;
import net.mcreator.addonity.world.features.WickedFungus5Feature;
import net.mcreator.addonity.world.features.WickedFungus4Feature;
import net.mcreator.addonity.world.features.WickedFungus3Feature;
import net.mcreator.addonity.world.features.WickedFungus2Feature;

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
	public static final RegistryObject<Feature<?>> WICKED_QUARTZ_LORE = register("wicked_quartz_lore", WiskedQuartzLoreFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, WiskedQuartzLoreFeature.GENERATE_BIOMES,
					WiskedQuartzLoreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> WICKED_FUNGUS = register("wicked_fungus", WickedFungusFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.UNDERGROUND_STRUCTURES, WickedFungusFeature.GENERATE_BIOMES, WickedFungusFeature::placedFeature));
	public static final RegistryObject<Feature<?>> WICKED_FUNGUS_2 = register("wicked_fungus_2", WickedFungus2Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, WickedFungus2Feature.GENERATE_BIOMES,
					WickedFungus2Feature::placedFeature));
	public static final RegistryObject<Feature<?>> WICKED_FUNGUS_3 = register("wicked_fungus_3", WickedFungus3Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, WickedFungus3Feature.GENERATE_BIOMES,
					WickedFungus3Feature::placedFeature));
	public static final RegistryObject<Feature<?>> WICKED_FUNGUS_4 = register("wicked_fungus_4", WickedFungus4Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, WickedFungus4Feature.GENERATE_BIOMES,
					WickedFungus4Feature::placedFeature));
	public static final RegistryObject<Feature<?>> WICKED_FUNGUS_5 = register("wicked_fungus_5", WickedFungus5Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, WickedFungus5Feature.GENERATE_BIOMES,
					WickedFungus5Feature::placedFeature));
	public static final RegistryObject<Feature<?>> WICKED_FUNGUS_6 = register("wicked_fungus_6", WickedFungus6Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, WickedFungus6Feature.GENERATE_BIOMES,
					WickedFungus6Feature::placedFeature));
	public static final RegistryObject<Feature<?>> TRIODIA = register("triodia", TriodiaFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, TriodiaFeature.GENERATE_BIOMES, TriodiaFeature::placedFeature));
	public static final RegistryObject<Feature<?>> TRIODIA_BUSH = register("triodia_bush", TriodiaBushFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.VEGETAL_DECORATION, TriodiaBushFeature.GENERATE_BIOMES, TriodiaBushFeature::placedFeature));

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
