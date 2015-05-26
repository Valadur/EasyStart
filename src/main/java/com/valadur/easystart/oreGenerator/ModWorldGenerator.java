package com.valadur.easystart.oreGenerator;

import com.valadur.easystart.init.ModBlocks;
import com.valadur.easystart.reference.ConfigurationValues;
import net.minecraft.util.BlockPos;
import net.minecraftforge.fml.common.IWorldGenerator;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;

import java.util.Random;

public class ModWorldGenerator implements IWorldGenerator {

    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
        switch (world.provider.getDimensionId()) {
            case 1:
                generateEnd(world, random, chunkX * 16, chunkZ * 16);
                break;
            case 0:
                generateSurface(world, random, chunkX * 16, chunkZ * 16);
                break;
            case -1:
                generateNether(world, random, chunkX * 16, chunkZ * 16);
                break;
            default:
                break;
        }
    }

    private void generateNether(World world, Random random, int chunkx, int chunkz) {

        // addOreSpawn(Blocks.netherrack, ModBlocks.oreAnderium, world, random, chunkx, chunkz, 16, 16, 3 + random.nextInt(2), 20 * ConfigurationValues.ANDERIUM_QUANTITY, 30, 80);
    }

    private void generateSurface(World world, Random random, int chunkx, int chunkz) {
        addOreSpawn(Blocks.stone, ModBlocks.oreAnderium, world, random, chunkx, chunkz, 16, 16, 3 + random.nextInt(2), 20 * ConfigurationValues.ANDERIUM_QUANTITY, 30, 80);
    }

    private void generateEnd(World world, Random random, int chunkx, int chunkz) {

        // addOreSpawn(Blocks.end_stone, ModBlocks.oreAnderium, world, random, chunkx, chunkz, 16, 16, 3 + random.nextInt(2), 20 * ConfigurationValues.ANDERIUM_QUANTITY, 30, 80);
    }

    /*
     * Adds an Ore Spawn to Minecraft. Simply register all Ores to spawn with this method in your Generation method in your IWorldGeneration extending Class
     *
     * @param The Block to spawn
     * @param The World to spawn in
     * @param A   Random object for retrieving random positions within the world to spawn the Block
     * @param An  int for passing the X-Coordinate for the Generation method
     * @param An  int for passing the Z-Coordinate for the Generation method
     * @param An  int for setting the maximum X-Coordinate values for spawning on the X-Axis on a Per-Chunk basis
     * @param An  int for setting the maximum Z-Coordinate values for spawning on the Z-Axis on a Per-Chunk basis
     * @param An  int for setting the maximum size of a vein
     * @param An  int for the Number of chances available for the Block to spawn per-chunk
     * @param An  int for the minimum Y-Coordinate height at which this block may spawn
     * @param An  int for the maximum Y-Coordinate height at which this block may spawn
     */

    public void addOreSpawn(Block toBeReplacedBlock, Block replacingBlock, World world, Random random, int blockXPos, int blockZPos, int maxX, int maxZ, int maxVeinSize, int chancesToSpawn, int minY, int maxY) {
        assert maxY > minY : "The maximum Y must be greater than the Minimum Y";
        assert maxX > 0 && maxX <= 16 : "addOreSpawn: The Maximum X must be greater than 0 and less than 16";
        assert minY > 0 : "addOreSpawn: The Minimum Y must be greater than 0";
        assert maxY < 256 && maxY > 0 : "addOreSpawn: The Maximum Y must be less than 256 but greater than 0";
        assert maxZ > 0 && maxZ <= 16 : "addOreSpawn: The Maximum Z must be greater than 0 and less than 16";

        int diffBtwnMinMaxY = maxY - minY;
        for (int x = 0; x < chancesToSpawn; x++) {
            int posX = blockXPos + random.nextInt(maxX);
            int posY = minY + random.nextInt(diffBtwnMinMaxY);
            int posZ = blockZPos + random.nextInt(maxZ);
            BlockPos blockPos = new BlockPos(posX,posY,posZ);
            (new WorldGenMinable(ModBlocks.oreAnderium.getDefaultState(), maxVeinSize)).generate(world, random, blockPos);
        }
    }
}