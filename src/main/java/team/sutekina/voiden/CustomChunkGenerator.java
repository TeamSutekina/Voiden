package team.sutekina.voiden;

import java.util.Random;

import org.bukkit.World;
import org.bukkit.generator.ChunkGenerator;

public class CustomChunkGenerator extends ChunkGenerator {
    @Override
    public ChunkData generateChunkData(World world, Random random, int chunkX, int chunkZ, BiomeGrid biome) {
        // TODO Chunk generation code here.
    	@SuppressWarnings("deprecation")
		ChunkData chunk = createChunkData(world);
    	return chunk;
    }
}