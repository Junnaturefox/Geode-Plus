package net.yeoxuhang.geodeplus.forge.datagen;

import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.ModLoader;
import net.yeoxuhang.geodeplus.GeodePlus;
import net.yeoxuhang.geodeplus.common.registry.GeodeModTagsRegistry;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BiomeTagsProvider;
import net.minecraft.tags.BiomeTags;
import net.minecraft.world.level.biome.Biomes;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;

public class GeodeModBiomeTagsProvider extends BiomeTagsProvider {
    public GeodeModBiomeTagsProvider(DataGenerator gen, ExistingFileHelper exFileHelper) {
        super(gen, GeodePlus.MOD_ID, exFileHelper);
    }

    protected void addTags() {
        this.tag(GeodeModTagsRegistry.Biomes.HAS_PRISMARINE_GEODE).addTag(BiomeTags.IS_DEEP_OCEAN);
        this.tag(GeodeModTagsRegistry.Biomes.HAS_LAPIS_GEODE).addTag(BiomeTags.IS_OVERWORLD);
        this.tag(GeodeModTagsRegistry.Biomes.HAS_REDSTONE_GEODE).addTag(BiomeTags.IS_OVERWORLD);
        this.tag(GeodeModTagsRegistry.Biomes.HAS_EMERALD_GEODE).addTag(BiomeTags.IS_MOUNTAIN);
        this.tag(GeodeModTagsRegistry.Biomes.HAS_DIAMOND_GEODE).addTag(BiomeTags.IS_OVERWORLD);
        this.tag(GeodeModTagsRegistry.Biomes.HAS_ECHO_GEODE).add(Biomes.DEEP_DARK);
        this.tag(GeodeModTagsRegistry.Biomes.HAS_NETHER_QUARTZ_GEODE).add(Biomes.NETHER_WASTES, Biomes.CRIMSON_FOREST, Biomes.WARPED_FOREST, Biomes.SOUL_SAND_VALLEY);
        this.tag(GeodeModTagsRegistry.Biomes.HAS_NETHER_GOLD_NUGGET_GEODE).add(Biomes.NETHER_WASTES, Biomes.CRIMSON_FOREST, Biomes.WARPED_FOREST, Biomes.SOUL_SAND_VALLEY);
        this.tag(GeodeModTagsRegistry.Biomes.HAS_NETHER_GLOWSTONE_GEODE).add(Biomes.NETHER_WASTES, Biomes.CRIMSON_FOREST, Biomes.WARPED_FOREST, Biomes.SOUL_SAND_VALLEY);
        this.tag(GeodeModTagsRegistry.Biomes.HAS_NETHER_ANCIENT_DEBRIS_GEODE).add(Biomes.NETHER_WASTES, Biomes.CRIMSON_FOREST, Biomes.WARPED_FOREST, Biomes.SOUL_SAND_VALLEY);
        this.tag(GeodeModTagsRegistry.Biomes.HAS_BASALT_QUARTZ_GEODE).add(Biomes.BASALT_DELTAS);
        this.tag(GeodeModTagsRegistry.Biomes.HAS_BASALT_GLOWSTONE_GEODE).add(Biomes.BASALT_DELTAS);
        this.tag(GeodeModTagsRegistry.Biomes.HAS_BASALT_GOLD_NUGGET_GEODE).add(Biomes.BASALT_DELTAS);
        this.tag(GeodeModTagsRegistry.Biomes.HAS_BASALT_ANCIENT_DEBRIS_GEODE).add(Biomes.BASALT_DELTAS);
        this.tag(GeodeModTagsRegistry.Biomes.HAS_WRAPPIST_GEODE).add(Biomes.END_HIGHLANDS, Biomes.END_MIDLANDS);

        //Crystals
        this.tag(GeodeModTagsRegistry.Biomes.HAS_ECHO_CRYSTAL).add(Biomes.DEEP_DARK);
        this.tag(GeodeModTagsRegistry.Biomes.HAS_QUARTZ_CRYSTAL).add(Biomes.NETHER_WASTES, Biomes.CRIMSON_FOREST, Biomes.WARPED_FOREST, Biomes.SOUL_SAND_VALLEY);
        this.tag(GeodeModTagsRegistry.Biomes.HAS_GLOWSTONE_CRYSTAL).add(Biomes.NETHER_WASTES, Biomes.CRIMSON_FOREST, Biomes.WARPED_FOREST, Biomes.SOUL_SAND_VALLEY);
        this.tag(GeodeModTagsRegistry.Biomes.HAS_WRAPPIST_CRYSTAL).add(Biomes.END_HIGHLANDS, Biomes.END_MIDLANDS);
        this.tag(GeodeModTagsRegistry.Biomes.HAS_PRISMARINE_CRYSTAL).addTag(BiomeTags.IS_DEEP_OCEAN);
    }
}
