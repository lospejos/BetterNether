package org.betterx.betternether.registry.features;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.stateproviders.NoiseThresholdProvider;
import net.minecraft.world.level.levelgen.synth.NormalNoise;

import org.betterx.bclib.api.v2.levelgen.features.BCLFeature;
import org.betterx.bclib.api.v2.levelgen.features.BCLFeatureBuilder;
import org.betterx.bclib.api.v2.levelgen.features.FastFeatures;
import org.betterx.bclib.api.v2.levelgen.features.config.ScatterFeatureConfig;
import org.betterx.bclib.api.v2.levelgen.features.config.TemplateFeatureConfig;
import org.betterx.bclib.api.v2.levelgen.structures.StructurePlacementType;
import org.betterx.bclib.api.v2.levelgen.structures.StructureWorldNBT;
import org.betterx.betternether.BetterNether;
import org.betterx.betternether.blocks.BlockCommonPlant;
import org.betterx.betternether.registry.NetherBlocks;
import org.betterx.betternether.registry.NetherFeatures;
import org.betterx.betternether.world.features.*;

import java.util.List;

public class FloorFeatures {

    public static final BlockStateProvider VANILLA_MUSHROOM_PROVIDER =
            new NoiseThresholdProvider(2345L,
                    new NormalNoise.NoiseParameters(0, 1.0, new double[0]),
                    0.005f,
                    -0.8f,
                    0.33333334f,
                    Blocks.DANDELION.defaultBlockState(),
                    List.of(Blocks.RED_MUSHROOM.defaultBlockState(),
                            Blocks.CRIMSON_FUNGUS.defaultBlockState()
                    ),
                    List.of(Blocks.BROWN_MUSHROOM.defaultBlockState(),
                            Blocks.WARPED_FUNGUS.defaultBlockState()
                    )
            );
    public static final BCLFeature VANILLA_MUSHROOM
            = FastFeatures.patch(BetterNether.makeID("vanilla_red_mushroom"),
            VANILLA_MUSHROOM_PROVIDER, 8, 6, 3);

    public static final BCLFeature VANILLA_WARPED_FUNGUS
            = FastFeatures.patch(BetterNether.makeID("vanilla_warped_fungus"), Blocks.WARPED_FUNGUS, 8, 7, 3);

    public static final BCLFeature VANILLA_WARPED_ROOTS
            = FastFeatures.patch(BetterNether.makeID("vanilla_warped_roots"), Blocks.WARPED_ROOTS, 10, 7, 3);

    public static final BCLFeature MOSS_COVER
            = FastFeatures.patch(BetterNether.makeID("moss_cover"), NetherBlocks.MOSS_COVER);

    public static final BCLFeature HOOK_MUSHROOM
            = FastFeatures.patch(BetterNether.makeID("hook_mushroom"), NetherBlocks.HOOK_MUSHROOM);
    public static final BCLFeature BONE_GRASS_PATCH
            = FastFeatures.patch(BetterNether.makeID("bone_grass"), NetherBlocks.BONE_GRASS);

    public static final BCLFeature SEPIA_BONE_GRASS_PATCH
            = FastFeatures.patch(BetterNether.makeID("sepia_bone_grass"), NetherBlocks.SEPIA_BONE_GRASS);
    public static final BCLFeature SOUL_GRASS_PATCH
            = FastFeatures.patch(BetterNether.makeID("soul_grass"), NetherBlocks.SOUL_GRASS);

    public static final BCLFeature SWAMP_GRASS
            = FastFeatures.patch(BetterNether.makeID("swamp_grass"), NetherBlocks.SWAMP_GRASS);

    public static final BCLFeature NETHER_GRASS_PATCH
            = FastFeatures.patch(BetterNether.makeID("nether_grass"), NetherBlocks.NETHER_GRASS);

    public static final BCLFeature FEATHER_FERN_PATCH
            = FastFeatures.patch(BetterNether.makeID("feather_fern"), NetherBlocks.FEATHER_FERN);

    public static final BCLFeature BLACK_BUSH_PATCH
            = FastFeatures.patch(BetterNether.makeID("black_bush"), NetherBlocks.BLACK_BUSH);

    public static final BCLFeature WART_SEED_PATCH
            = FastFeatures.patch(BetterNether.makeID("wart_seed"), NetherBlocks.MAT_WART.getSeed(), 32, 2, 1);

    public static final BCLFeature WART_BUSH_PATCH
            = FastFeatures.patch(BetterNether.makeID("wart_bush"), 16, 5, 3, new WartBushFeature());

    public static final BCLFeature RUBEUS_BUSH_PATCH
            = FastFeatures.patch(BetterNether.makeID("rubeus_bush"), 16, 5, 3, new RubeusBushFeature());

    public static final BCLFeature WILLOW_BUSH_PATCH
            = FastFeatures.patch(BetterNether.makeID("willow_bush"), 2, 5, 3, new WillowBushFeature());

    public static final BCLFeature NETHER_SAKURA_BUSH_PATCH
            = FastFeatures.patch(BetterNether.makeID("nether_sakura_bush"), 2, 5, 3, new NetherSakuraBushFeature());


    public static final BCLFeature CRIMSON_FUNGUS
            = FastFeatures.patch(BetterNether.makeID("crimson_fungus"), Blocks.CRIMSON_FUNGUS, 32, 7, 2);

    public static final BCLFeature CRIMSON_ROOTS
            = FastFeatures.patch(BetterNether.makeID("crimson_roots"), Blocks.CRIMSON_ROOTS, 32, 7, 2);

    public static final BCLFeature BARREL_CACTUS
            = FastFeatures.patch(BetterNether.makeID("barrel_cactus"), NetherBlocks.BARREL_CACTUS, 12, 2, 2);

    public static final BCLFeature JUNGLE_PLANT
            = FastFeatures.patch(BetterNether.makeID("jungle_plant"), NetherBlocks.JUNGLE_PLANT, 20, 4, 3);


    public static final BCLFeature GEYSER
            = FastFeatures.patch(BetterNether.makeID("geyser"), NetherBlocks.GEYSER, 32, 3, 3);

    public static final BCLFeature JELLYFISH_MUSHROOM
            = FastFeatures.patch(BetterNether.makeID("jellyfish_mushroom"), 64, 5, 3, new JellyfishMushroomFeature());

    public static final BCLFeature RED_MOLD
            = FastFeatures.patch(BetterNether.makeID("red_mold"), NetherBlocks.RED_MOLD, 32, 5, 3);

    public static final BCLFeature GRAY_MOLD
            = FastFeatures.patch(BetterNether.makeID("gray_mold"), NetherBlocks.GRAY_MOLD, 32, 5, 3);


    public static final BCLFeature CRYSTAL
            = FastFeatures.simple(BetterNether.makeID("crystal"), 3, true, new CrystalFeature());

    public static final BCLFeature BONES = BCLFeatureBuilder
            .start(BetterNether.makeID("bones"), BCLFeature.TEMPLATE)
            .buildAndRegister(new TemplateFeatureConfig(List.of(
                    cfg(BetterNether.makeID("bone_01"), 0, StructurePlacementType.FLOOR, 1.0f),
                    cfg(BetterNether.makeID("bone_02"), 0, StructurePlacementType.FLOOR, 1.0f),
                    cfg(BetterNether.makeID("bone_03"), 0, StructurePlacementType.FLOOR, 1.0f)
            )));
    public static final BCLFeature JUNGLE_BONES = BCLFeatureBuilder
            .start(BetterNether.makeID("jungle_bones"), BCLFeature.TEMPLATE)
            .buildAndRegister(new TemplateFeatureConfig(List.of(
                    cfg(BetterNether.makeID("jungle_bones_1"), -1, StructurePlacementType.FLOOR, 1.0f),
                    cfg(BetterNether.makeID("jungle_bones_2"), -1, StructurePlacementType.FLOOR, 1.0f),
                    cfg(BetterNether.makeID("jungle_bones_3"), -1, StructurePlacementType.FLOOR, 1.0f)
            )));

    public static final BCLFeature FORREST_LITTER = BCLFeatureBuilder
            .start(BetterNether.makeID("forrest_litter"), BCLFeature.TEMPLATE)
            .buildAndRegister(new TemplateFeatureConfig(List.of(
                    cfg(BetterNether.makeID("upside_down_forest/tree_fallen"), 1, StructurePlacementType.FLOOR, 1.0f),
                    cfg(BetterNether.makeID("upside_down_forest/tree_needle"), 1, StructurePlacementType.FLOOR, 1.0f),
                    cfg(BetterNether.makeID("upside_down_forest/tree_root"), -1, StructurePlacementType.FLOOR, 1.0f),
                    cfg(BetterNether.makeID("upside_down_forest/tree_stump"), -1, StructurePlacementType.FLOOR, 1.0f),
                    cfg(BetterNether.makeID("upside_down_forest/tree_small_branch"),
                            1,
                            StructurePlacementType.FLOOR,
                            1.0f)
            )));

    public static final BCLFeature MAGMA_FLOWER = FastFeatures.patchWitRandomInt(
            BetterNether.makeID("magma_flower"),
            NetherBlocks.MAGMA_FLOWER, BlockCommonPlant.AGE,
            16, 4, 1
    );
    public static final BCLFeature INK_BUSH = FastFeatures.patchWitRandomInt(
            BetterNether.makeID("ink_bush"),
            NetherBlocks.INK_BUSH, BlockCommonPlant.AGE,
            4, 3, 2
    );
    public static final BCLFeature NETHER_WART = FastFeatures.patchWitRandomInt(
            BetterNether.makeID("nether_wart"),
            Blocks.NETHER_WART, BlockStateProperties.AGE_3,
            16, 3, 1
    );

    public static final BCLFeature BLACK_APPLE = FastFeatures.patchWitRandomInt(
            BetterNether.makeID("black_apple"),
            NetherBlocks.BLACK_APPLE, BlockCommonPlant.AGE,
            8, 7, 2
    );

    public static final BCLFeature AGAVE = FastFeatures.patchWitRandomInt(
            BetterNether.makeID("agave"),
            NetherBlocks.AGAVE, BlockCommonPlant.AGE,
            16, 4, 2
    );

    public static final BCLFeature ORANGE_MUSHROOM = FastFeatures.patchWitRandomInt(
            BetterNether.makeID("orange_mushroom"),
            NetherBlocks.ORANGE_MUSHROOM, BlockCommonPlant.AGE,
            12, 4, 2
    );

    public static final BCLFeature EGG_PLANT = FastFeatures.patchWitRandomInt(
            BetterNether.makeID("egg_plant"),
            NetherBlocks.EGG_PLANT, BlockCommonPlant.AGE,
            12, 4, 2
    );

    public static void ensureStaticInitialization() {
    }

    static StructureWorldNBT cfg(ResourceLocation location,
                                 int offsetY,
                                 StructurePlacementType type,
                                 float chance) {
        return TemplateFeatureConfig.cfg(location, offsetY, type, chance);
    }

    static BCLFeature agedCluster(ResourceLocation location,
                                  boolean onFloor,
                                  boolean sparse,
                                  ScatterFeatureConfig.Builder builder) {
        return FastFeatures.scatter(location, onFloor, sparse, builder, NetherFeatures.SCATTER_WITH_PLANT_AGE);
    }
}