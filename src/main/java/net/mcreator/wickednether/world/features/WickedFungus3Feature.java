
package net.mcreator.wickednether.world.features;

public class WickedFungus3Feature extends Feature<NoneFeatureConfiguration> {

	public static WickedFungus3Feature FEATURE = null;
	public static Holder<ConfiguredFeature<NoneFeatureConfiguration, ?>> CONFIGURED_FEATURE = null;
	public static Holder<PlacedFeature> PLACED_FEATURE = null;

	public static Feature<?> feature() {
		FEATURE = new WickedFungus3Feature();
		CONFIGURED_FEATURE = FeatureUtils.register("wicked_nether:wicked_fungus_3", FEATURE, FeatureConfiguration.NONE);
		PLACED_FEATURE = PlacementUtils.register("wicked_nether:wicked_fungus_3", CONFIGURED_FEATURE, List.of());
		return FEATURE;
	}

	public static Holder<PlacedFeature> placedFeature() {
		return PLACED_FEATURE;
	}

	public static final Set<ResourceLocation> GENERATE_BIOMES = Set.of(new ResourceLocation("wicked_nether:wicked_forest"));

	private final Set<ResourceKey<Level>> generate_dimensions = Set.of(Level.NETHER);

	private final List<Block> base_blocks;

	private StructureTemplate template = null;

	public WickedFungus3Feature() {
		super(NoneFeatureConfiguration.CODEC);

		base_blocks = List.of(WickedNetherModBlocks.WICKED_NYLIUM.get(), Blocks.NETHERRACK);
	}

	@Override
	public boolean place(FeaturePlaceContext<NoneFeatureConfiguration> context) {
		if (!generate_dimensions.contains(context.level().getLevel().dimension()))
			return false;

		if (template == null)
			template = context.level().getLevel().getStructureManager().getOrCreate(new ResourceLocation("wicked_nether", "wicked_fungus_1"));

		if (template == null)
			return false;

		boolean anyPlaced = false;
		if ((context.random().nextInt(1000000) + 1) <= 600000) {
			int count = context.random().nextInt(5) + 12;
			for (int a = 0; a < count; a++) {
				int i = context.origin().getX() + context.random().nextInt(16);
				int k = context.origin().getZ() + context.random().nextInt(16);

				int j = context.level().getHeight(Heightmap.Types.WORLD_SURFACE_WG, i, k);

				j = Mth.nextInt(context.random(), 8 + context.level().getMinBuildHeight(), Math.max(j, 9 + context.level().getMinBuildHeight()));

				if (!base_blocks.contains(context.level().getBlockState(new BlockPos(i, j, k)).getBlock()))
					continue;

				BlockPos spawnTo = new BlockPos(i + 0, j + 0, k + 0);

				WorldGenLevel world = context.level();
				int x = spawnTo.getX();
				int y = spawnTo.getY();
				int z = spawnTo.getZ();

				if (!

				WickedFungusDopolnitielnoieUsloviieGienieratsiiProcedure.execute())
					continue;

				if (template.placeInWorld(context.level(), spawnTo, spawnTo,
						new StructurePlaceSettings().setMirror(Mirror.values()[context.random().nextInt(2)])
								.setRotation(Rotation.values()[context.random().nextInt(3)]).setRandom(context.random())
								.addProcessor(BlockIgnoreProcessor.STRUCTURE_AND_AIR).setIgnoreEntities(false),
						context.random(), 2)) {

					anyPlaced = true;
				}
			}
		}

		return anyPlaced;
	}

}
